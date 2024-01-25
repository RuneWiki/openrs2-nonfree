import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class5 {

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
	private int anInt84;

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
	private int anInt87;

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "Lclient!f;")
	private Class10 aClass10_2;

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
	public int anInt88;

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
	private int anInt89;

	@OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
	private int anInt92;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
	private final int anInt82;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
	private final int anInt85;

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
	private final int anInt83;

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "Z")
	private final boolean aBoolean3;

	@OriginalMember(owner = "client!aba", name = "o", descriptor = "I")
	private final int anInt90;

	@OriginalMember(owner = "client!aba", name = "r", descriptor = "I")
	private final int anInt93;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
	private final int anInt86;

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
	private final int anInt91;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt82 = arg2;
		this.anInt85 = arg3;
		this.anInt83 = arg4;
		this.aBoolean3 = arg7;
		this.anInt90 = arg1;
		this.anInt93 = arg6;
		this.anInt86 = arg5;
		this.anInt91 = arg0;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!r;Lclient!aba;)Z")
	public boolean method75(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class5 arg1) {
		return this.aClass10_2 != null || this.method78(arg0, arg1);
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(Lclient!r;Lclient!aba;)Z")
	private boolean method78(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class5 arg1) {
		if (this.aClass10_2 == null) {
			if (this.anInt91 == 0) {
				if (Static352.anInterface5_8.method4045(this.anInt90)) {
					@Pc(23) int[] local23 = Static352.anInterface5_8.method4047(this.anInt92, this.anInt92, 0.7F, this.anInt90);
					this.aClass10_2 = arg0.method6429(local23, this.anInt92, this.anInt92, this.anInt92);
				}
			} else if (this.anInt91 == 2) {
				this.method83(arg0, arg1);
			} else if (this.anInt91 == 1) {
				this.method82(arg0, arg1);
			}
		}
		return this.aClass10_2 != null;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!r;IIIIII)V")
	public void method81(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass10_2 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt84 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt87 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt89) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt89) / 2;
		if (local38 < arg4 && local38 + this.anInt89 > 0 && local51 < arg3 && local51 + this.anInt89 > 0) {
			this.aClass10_2.method7682(local51 + arg1, local38 + arg2, this.anInt89, this.anInt89);
		}
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(Lclient!r;Lclient!aba;)V")
	private void method82(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class5 arg1) {
		Static5.method77(arg0);
		Static5.method80(arg0);
		arg0.oa(Static5.anIntArray2);
		arg0.da(0, 0, this.anInt92, this.anInt92);
		arg0.ya();
		arg0.J(0, 0, this.anInt92, this.anInt92, this.anInt93 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean3) {
				local31 = -arg1.anInt82;
				local33 = -arg1.anInt85;
				local35 = -arg1.anInt83;
			} else {
				local31 = arg1.anInt82 - this.anInt82;
				local33 = arg1.anInt85 - this.anInt85;
				local35 = arg1.anInt83 - this.anInt83;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt84 != 0) {
			local79 = Class151.anIntArray244[this.anInt84];
			local84 = Class151.anIntArray245[this.anInt84];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt87 != 0) {
			local79 = Class151.anIntArray244[this.anInt87];
			local84 = Class151.anIntArray245[this.anInt87];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class61 local147 = Static5.aClass61_1.method7591((byte) 0, 51200, true);
		if (arg0.method6397()) {
			local147.DA((short) 0, (short) this.anInt90);
		} else {
			local147.d((short) 127, Static352.anInterface5_8.method4043(this.anInt90).aShort19);
			local147.DA((short) 0, (short) -1);
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt92 * 1024 / (local147.l() - local147.KA());
		if (this.anInt93 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.la(this.anInt92 / 2, this.anInt92 / 2, local84, local84);
		arg0.method6471(arg0.method6410());
		@Pc(223) Class209 local223 = arg0.method6410();
		local223.NA(0, 0, arg0.BA() - local147.OA());
		local147.method7592(local223, null, 1024, 1);
		@Pc(245) int local245 = this.anInt92 * 13 / 16;
		@Pc(252) int local252 = (this.anInt92 - local245) / 2;
		Static5.aClass10_3.method7680(local252, local252, local245, local245, 0, this.anInt93 | 0xFF000000, 1);
		this.aClass10_2 = arg0.method6470(0, 0, this.anInt92, this.anInt92, true);
		arg0.ya();
		arg0.J(0, 0, this.anInt92, this.anInt92, 0, 0);
		Static5.aClass10_1.method7680(0, 0, this.anInt92, this.anInt92, 1, 0, 0);
		this.aClass10_2.xa(0, 0, 0);
		arg0.da(Static5.anIntArray2[0], Static5.anIntArray2[1], Static5.anIntArray2[2], Static5.anIntArray2[3]);
	}

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(Lclient!r;Lclient!aba;)V")
	private void method83(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class5 arg1) {
		@Pc(6) Class43 local6 = Static83.method1704(Static291.aClass111_67, this.anInt90);
		if (local6 == null) {
			return;
		}
		arg0.oa(Static5.anIntArray2);
		arg0.da(0, 0, this.anInt92, this.anInt92);
		arg0.J(0, 0, this.anInt92, this.anInt92, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean3) {
				local32 = -arg1.anInt82;
				local34 = -arg1.anInt85;
				local36 = -arg1.anInt83;
			} else {
				local32 = this.anInt82 - arg1.anInt82;
				local34 = this.anInt85 - arg1.anInt85;
				local36 = this.anInt83 - arg1.anInt83;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt84 != 0) {
			local81 = -this.anInt84 & 0x3FFF;
			local85 = Class151.anIntArray244[local81];
			local89 = Class151.anIntArray245[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt87 != 0) {
			local81 = -this.anInt87 & 0x3FFF;
			local85 = Class151.anIntArray244[local81];
			local89 = Class151.anIntArray245[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class61 local172 = arg0.method6407(local6, 2048, 0, 64, 768);
		local85 = local172.l() - local172.KA();
		local89 = local172.H() - local172.J();
		local99 = local172.KA() + local85 / 2;
		@Pc(198) int local198 = local172.J() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.la(local99, local198, local205, local205);
		arg0.method6471(arg0.method6410());
		@Pc(218) Class209 local218 = arg0.method6441();
		local218.NA(0, 0, arg0.BA() - local172.OA());
		local172.method7592(local218, null, arg0.BA(), 1);
		this.aClass10_2 = arg0.method6470(0, 0, this.anInt92, this.anInt92, true);
		this.aClass10_2.xa(0, 0, 3);
		arg0.da(Static5.anIntArray2[0], Static5.anIntArray2[1], Static5.anIntArray2[2], Static5.anIntArray2[3]);
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "()V")
	public void method84() {
		this.aClass10_2 = null;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIII)Z")
	public boolean method85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean3) {
			this.anInt88 = 1073741823;
			local7 = this.anInt82;
			local12 = this.anInt85;
			local17 = this.anInt83;
		} else {
			local7 = this.anInt82 - arg0;
			local12 = this.anInt85 - arg1;
			local17 = this.anInt83 - arg2;
			this.anInt88 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt88 == 0) {
				this.anInt88 = 1;
			}
			local7 = (local7 << 8) / this.anInt88;
			local12 = (local12 << 8) / this.anInt88;
			local17 = (local17 << 8) / this.anInt88;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt89 = this.anInt86 * arg3 / (this.aBoolean3 ? 1024 : this.anInt88);
		} else {
			this.anInt89 = 0;
		}
		if (this.anInt89 < 8) {
			this.aClass10_2 = null;
			return false;
		}
		@Pc(143) int local143 = Static200.method3428(this.anInt89);
		if (local143 > arg3) {
			local143 = Static549.method7478(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt92) {
			this.anInt92 = local143;
		}
		this.anInt84 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt87 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass10_2 = null;
		return true;
	}
}
