import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	private int anInt33;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	public int anInt34;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
	private int anInt37;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	private int anInt38;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
	private int anInt39;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "Lclient!l;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
	private final int anInt42;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	private final int anInt35;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	private final int anInt40;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Z")
	private final boolean aBoolean3;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	private final int anInt32;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	private final int anInt41;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
	private final int anInt43;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	private final int anInt36;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt42 = arg2;
		this.anInt35 = arg3;
		this.anInt40 = arg4;
		this.aBoolean3 = arg7;
		this.anInt32 = arg1;
		this.anInt41 = arg6;
		this.anInt43 = arg5;
		this.anInt36 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ya;Lclient!ad;)V")
	private void method30(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class5 arg1) {
		@Pc(6) Class122 local6 = Static370.method4948(Static151.aClass76_38, this.anInt32);
		if (local6 == null) {
			return;
		}
		arg0.da(Static5.anIntArray3);
		arg0.OA(0, 0, this.anInt38, this.anInt38);
		arg0.O(0, 0, this.anInt38, this.anInt38, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean3) {
				local32 = -arg1.anInt42;
				local34 = -arg1.anInt35;
				local36 = -arg1.anInt40;
			} else {
				local32 = this.anInt42 - arg1.anInt42;
				local34 = this.anInt35 - arg1.anInt35;
				local36 = this.anInt40 - arg1.anInt40;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt33 != 0) {
			local81 = -this.anInt33 & 0x3FFF;
			local85 = Class50_Sub1.anIntArray225[local81];
			local89 = Class50_Sub1.anIntArray224[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt39 != 0) {
			local81 = -this.anInt39 & 0x3FFF;
			local85 = Class50_Sub1.anIntArray225[local81];
			local89 = Class50_Sub1.anIntArray224[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.B(1.0F);
		arg0.T(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class110 local172 = arg0.method4254(local6, 2048, 0, 64, 768);
		local85 = local172.NA() - local172.HA();
		local89 = local172.WA() - local172.MA();
		local99 = local172.HA() + local85 / 2;
		@Pc(198) int local198 = local172.MA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.H(local99, local198, local205, local205);
		arg0.ea(arg0.method4274());
		@Pc(218) Class31 local218 = arg0.method4289();
		local218.j(0, 0, arg0.a() - local172.PA());
		local172.method4880(local218, null, arg0.a());
		this.aClass57_3 = arg0.method4280(0, 0, this.anInt38, this.anInt38, true);
		this.aClass57_3.BA(0, 0, 3);
		arg0.OA(Static5.anIntArray3[0], Static5.anIntArray3[1], Static5.anIntArray3[2], Static5.anIntArray3[3]);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
	public void method31() {
		this.aClass57_3 = null;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lclient!ya;Lclient!ad;)Z")
	private boolean method32(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class5 arg1) {
		if (this.aClass57_3 == null) {
			if (this.anInt36 == 0) {
				if (Static402.anInterface7_8.method2392(this.anInt32)) {
					@Pc(23) int[] local23 = Static402.anInterface7_8.method2395(this.anInt32, 0.7F, this.anInt38, this.anInt38);
					this.aClass57_3 = arg0.method4265(local23, this.anInt38, this.anInt38, this.anInt38);
				}
			} else if (this.anInt36 == 2) {
				this.method30(arg0, arg1);
			} else if (this.anInt36 == 1) {
				this.method36(arg0, arg1);
			}
		}
		return this.aClass57_3 != null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)Z")
	public boolean method33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean3) {
			this.anInt34 = 1073741823;
			local7 = this.anInt42;
			local12 = this.anInt35;
			local17 = this.anInt40;
		} else {
			local7 = this.anInt42 - arg0;
			local12 = this.anInt35 - arg1;
			local17 = this.anInt40 - arg2;
			this.anInt34 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt34 == 0) {
				this.anInt34 = 1;
			}
			local7 = (local7 << 8) / this.anInt34;
			local12 = (local12 << 8) / this.anInt34;
			local17 = (local17 << 8) / this.anInt34;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt37 = this.anInt43 * arg3 / (this.aBoolean3 ? 1024 : this.anInt34);
		} else {
			this.anInt37 = 0;
		}
		if (this.anInt37 < 8) {
			this.aClass57_3 = null;
			return false;
		}
		@Pc(143) int local143 = Static370.method4949(this.anInt37);
		if (local143 > arg3) {
			local143 = Static159.method2696(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt38) {
			this.anInt38 = local143;
		}
		this.anInt33 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt39 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass57_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(Lclient!ya;Lclient!ad;)V")
	private void method36(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class5 arg1) {
		Static5.method29(arg0);
		Static5.method34(arg0);
		arg0.da(Static5.anIntArray3);
		arg0.OA(0, 0, this.anInt38, this.anInt38);
		arg0.method4266();
		arg0.O(0, 0, this.anInt38, this.anInt38, this.anInt41 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean3) {
				local31 = -arg1.anInt42;
				local33 = -arg1.anInt35;
				local35 = -arg1.anInt40;
			} else {
				local31 = arg1.anInt42 - this.anInt42;
				local33 = arg1.anInt35 - this.anInt35;
				local35 = arg1.anInt40 - this.anInt40;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt33 != 0) {
			local79 = Class50_Sub1.anIntArray225[this.anInt33];
			local84 = Class50_Sub1.anIntArray224[this.anInt33];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt39 != 0) {
			local79 = Class50_Sub1.anIntArray225[this.anInt39];
			local84 = Class50_Sub1.anIntArray224[this.anInt39];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class110 local147 = Static5.aClass110_1.method4887((byte) 0, 51200, true);
		if (arg0.method4251()) {
			local147.I((short) 0, (short) this.anInt32);
		} else {
			local147.BA((short) 127, Static402.anInterface7_8.method2396(this.anInt32).aShort99);
			local147.I((short) 0, (short) -1);
		}
		arg0.B(1.0F);
		arg0.T(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt38 * 1024 / (local147.NA() - local147.HA());
		if (this.anInt41 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.H(this.anInt38 / 2, this.anInt38 / 2, local84, local84);
		arg0.ea(arg0.method4274());
		@Pc(223) Class31 local223 = arg0.method4274();
		local223.j(0, 0, arg0.a() - local147.PA());
		local147.method4880(local223, null, 1024);
		@Pc(245) int local245 = this.anInt38 * 13 / 16;
		@Pc(252) int local252 = (this.anInt38 - local245) / 2;
		Static5.aClass57_2.s(local252, local252, local245, local245, 0, this.anInt41 | 0xFF000000, 1);
		this.aClass57_3 = arg0.method4280(0, 0, this.anInt38, this.anInt38, true);
		arg0.method4266();
		arg0.O(0, 0, this.anInt38, this.anInt38, 0, 0);
		Static5.aClass57_1.s(0, 0, this.anInt38, this.anInt38, 1, 0, 0);
		this.aClass57_3.BA(0, 0, 0);
		arg0.OA(Static5.anIntArray3[0], Static5.anIntArray3[1], Static5.anIntArray3[2], Static5.anIntArray3[3]);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ya;IIIIII)V")
	public void method38(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass57_3 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt33 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt39 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt37) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt37) / 2;
		if (local38 < arg4 && local38 + this.anInt37 > 0 && local51 < arg3 && local51 + this.anInt37 > 0) {
			this.aClass57_3.method5537(local51 + arg1, local38 + arg2, this.anInt37, this.anInt37);
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(Lclient!ya;Lclient!ad;)Z")
	public boolean method39(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class5 arg1) {
		return this.aClass57_3 != null || this.method32(arg0, arg1);
	}
}
