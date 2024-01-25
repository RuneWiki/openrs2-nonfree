import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class18 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!o;")
	private Class6 aClass6_7;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	private int anInt454;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public int anInt456;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	private int anInt457;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	private final int anInt459;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private final int anInt448;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	private final int anInt453;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Z")
	private final boolean aBoolean52;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	private final int anInt455;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	private final int anInt450;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	private final int anInt451;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	private final int anInt458;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt459 = arg2;
		this.anInt448 = arg3;
		this.anInt453 = arg4;
		this.aBoolean52 = arg7;
		this.anInt455 = arg1;
		this.anInt450 = arg6;
		this.anInt451 = arg5;
		this.anInt458 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)Z")
	public boolean method348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean52) {
			this.anInt456 = 1073741823;
			local7 = this.anInt459;
			local12 = this.anInt448;
			local17 = this.anInt453;
		} else {
			local7 = this.anInt459 - arg0;
			local12 = this.anInt448 - arg1;
			local17 = this.anInt453 - arg2;
			this.anInt456 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt456 == 0) {
				this.anInt456 = 1;
			}
			local7 = (local7 << 8) / this.anInt456;
			local12 = (local12 << 8) / this.anInt456;
			local17 = (local17 << 8) / this.anInt456;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt449 = this.anInt451 * arg3 / (this.aBoolean52 ? 1024 : this.anInt456);
		} else {
			this.anInt449 = 0;
		}
		if (this.anInt449 < 8) {
			this.aClass6_7 = null;
			return false;
		}
		@Pc(143) int local143 = Static191.method2740(this.anInt449);
		if (local143 > arg3) {
			local143 = Static322.method4327(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt454) {
			this.anInt454 = local143;
		}
		this.anInt452 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt457 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass6_7 = null;
		return true;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!za;Lclient!bc;)V")
	private void method352(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class18 arg1) {
		Static26.method354(arg0);
		Static26.method351(arg0);
		arg0.MA(Static26.anIntArray21);
		arg0.ba(0, 0, this.anInt454, this.anInt454);
		arg0.method5788();
		arg0.P(0, 0, this.anInt454, this.anInt454, this.anInt450 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean52) {
				local31 = -arg1.anInt459;
				local33 = -arg1.anInt448;
				local35 = -arg1.anInt453;
			} else {
				local31 = arg1.anInt459 - this.anInt459;
				local33 = arg1.anInt448 - this.anInt448;
				local35 = arg1.anInt453 - this.anInt453;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt452 != 0) {
			local79 = Class1_Sub4_Sub8_Sub1.anIntArray50[this.anInt452];
			local84 = Class1_Sub4_Sub8_Sub1.anIntArray49[this.anInt452];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt457 != 0) {
			local79 = Class1_Sub4_Sub8_Sub1.anIntArray50[this.anInt457];
			local84 = Class1_Sub4_Sub8_Sub1.anIntArray49[this.anInt457];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class57 local147 = Static26.aClass57_1.method5966((byte) 0, 51200, true);
		if (arg0.method5796()) {
			local147.u((short) 0, (short) this.anInt455);
		} else {
			local147.q((short) 127, Static419.anInterface6_7.method3937(this.anInt455).aShort37);
			local147.u((short) 0, (short) -1);
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt454 * 1024 / (local147.MA() - local147.ta());
		if (this.anInt450 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt454 / 2, this.anInt454 / 2, local84, local84);
		arg0.SA(arg0.method5736());
		@Pc(223) Class32 local223 = arg0.method5736();
		local223.U(0, 0, arg0.AA() - local147.Z());
		local147.method5967(local223, null, 1024);
		@Pc(245) int local245 = this.anInt454 * 13 / 16;
		@Pc(252) int local252 = (this.anInt454 - local245) / 2;
		Static26.aClass6_8.ya(local252, local252, local245, local245, 0, this.anInt450 | 0xFF000000, 1);
		this.aClass6_7 = arg0.method5777(0, 0, this.anInt454, this.anInt454, true);
		arg0.method5788();
		arg0.P(0, 0, this.anInt454, this.anInt454, 0, 0);
		Static26.aClass6_6.ya(0, 0, this.anInt454, this.anInt454, 1, 0, 0);
		this.aClass6_7.oa(0, 0, 0);
		arg0.ba(Static26.anIntArray21[0], Static26.anIntArray21[1], Static26.anIntArray21[2], Static26.anIntArray21[3]);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Lclient!za;Lclient!bc;)Z")
	public boolean method353(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class18 arg1) {
		return this.aClass6_7 != null || this.method357(arg0, arg1);
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "()V")
	public void method355() {
		this.aClass6_7 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!za;IIIIII)V")
	public void method356(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass6_7 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt452 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt457 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt449) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt449) / 2;
		if (local38 < arg4 && local38 + this.anInt449 > 0 && local51 < arg3 && local51 + this.anInt449 > 0) {
			this.aClass6_7.method5891(local51 + arg1, local38 + arg2, this.anInt449, this.anInt449);
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(Lclient!za;Lclient!bc;)Z")
	private boolean method357(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class18 arg1) {
		if (this.aClass6_7 == null) {
			if (this.anInt458 == 0) {
				if (Static419.anInterface6_7.method3934(this.anInt455)) {
					@Pc(23) int[] local23 = Static419.anInterface6_7.method3935(this.anInt454, this.anInt454, this.anInt455, 0.7F);
					this.aClass6_7 = arg0.method5798(local23, this.anInt454, this.anInt454, this.anInt454);
				}
			} else if (this.anInt458 == 2) {
				this.method358(arg0, arg1);
			} else if (this.anInt458 == 1) {
				this.method352(arg0, arg1);
			}
		}
		return this.aClass6_7 != null;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(Lclient!za;Lclient!bc;)V")
	private void method358(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class18 arg1) {
		@Pc(6) Class193 local6 = Static149.method2219(this.anInt455, Static140.aClass82_37);
		if (local6 == null) {
			return;
		}
		arg0.MA(Static26.anIntArray21);
		arg0.ba(0, 0, this.anInt454, this.anInt454);
		arg0.P(0, 0, this.anInt454, this.anInt454, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean52) {
				local32 = -arg1.anInt459;
				local34 = -arg1.anInt448;
				local36 = -arg1.anInt453;
			} else {
				local32 = this.anInt459 - arg1.anInt459;
				local34 = this.anInt448 - arg1.anInt448;
				local36 = this.anInt453 - arg1.anInt453;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt452 != 0) {
			local81 = -this.anInt452 & 0x3FFF;
			local85 = Class1_Sub4_Sub8_Sub1.anIntArray50[local81];
			local89 = Class1_Sub4_Sub8_Sub1.anIntArray49[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt457 != 0) {
			local81 = -this.anInt457 & 0x3FFF;
			local85 = Class1_Sub4_Sub8_Sub1.anIntArray50[local81];
			local89 = Class1_Sub4_Sub8_Sub1.anIntArray49[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class57 local172 = arg0.method5792(local6, 2048, 0, 64, 768);
		local85 = local172.MA() - local172.ta();
		local89 = local172.l() - local172.B();
		local99 = local172.ta() + local85 / 2;
		@Pc(198) int local198 = local172.B() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.SA(arg0.method5736());
		@Pc(218) Class32 local218 = arg0.method5747();
		local218.U(0, 0, arg0.AA() - local172.Z());
		local172.method5967(local218, null, arg0.AA());
		this.aClass6_7 = arg0.method5777(0, 0, this.anInt454, this.anInt454, true);
		this.aClass6_7.oa(0, 0, 3);
		arg0.ba(Static26.anIntArray21[0], Static26.anIntArray21[1], Static26.anIntArray21[2], Static26.anIntArray21[3]);
	}
}
