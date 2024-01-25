import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class144 {

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "Lclient!f;")
	private Class22 aClass22_9;

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
	private int anInt4459;

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
	private int anInt4465;

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
	private int anInt4466;

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
	private int anInt4467;

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
	public int anInt4468;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
	private final int anInt4463;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
	private final int anInt4457;

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
	private final int anInt4464;

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "Z")
	private final boolean aBoolean339;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
	private final int anInt4458;

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
	private final int anInt4462;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
	private final int anInt4461;

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
	private final int anInt4460;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4463 = arg2;
		this.anInt4457 = arg3;
		this.anInt4464 = arg4;
		this.aBoolean339 = arg7;
		this.anInt4458 = arg1;
		this.anInt4462 = arg6;
		this.anInt4461 = arg5;
		this.anInt4460 = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!qa;Lclient!lj;)V")
	private void method3638(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class144 arg1) {
		Static232.method3641(arg0);
		Static232.method3639(arg0);
		arg0.u(Static232.anIntArray349);
		arg0.pa(0, 0, this.anInt4465, this.anInt4465);
		arg0.method2570();
		arg0.NA(0, 0, this.anInt4465, this.anInt4465, this.anInt4462 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean339) {
				local31 = -arg1.anInt4463;
				local33 = -arg1.anInt4457;
				local35 = -arg1.anInt4464;
			} else {
				local31 = arg1.anInt4463 - this.anInt4463;
				local33 = arg1.anInt4457 - this.anInt4457;
				local35 = arg1.anInt4464 - this.anInt4464;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt4459 != 0) {
			local79 = Applet_Sub1.anIntArray85[this.anInt4459];
			local84 = Applet_Sub1.anIntArray87[this.anInt4459];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt4467 != 0) {
			local79 = Applet_Sub1.anIntArray85[this.anInt4467];
			local84 = Applet_Sub1.anIntArray87[this.anInt4467];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class31 local147 = Static232.aClass31_4.method5710((byte) 0, 51200, true);
		if (arg0.method2635()) {
			local147.YA((short) 0, (short) this.anInt4458);
		} else {
			local147.N((short) 127, Static60.anInterface7_2.method2131(this.anInt4458).aShort52);
			local147.YA((short) 0, (short) -1);
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt4465 * 1024 / (local147.VA() - local147.la());
		if (this.anInt4462 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt4465 / 2, this.anInt4465 / 2, local84, local84);
		arg0.m(arg0.method2636());
		@Pc(223) Class106 local223 = arg0.method2636();
		local223.R(0, 0, arg0.d() - local147.X());
		local147.method5706(local223, null, 1024);
		@Pc(245) int local245 = this.anInt4465 * 13 / 16;
		@Pc(252) int local252 = (this.anInt4465 - local245) / 2;
		Static232.aClass22_7.M(local252, local252, local245, local245, 0, this.anInt4462 | 0xFF000000, 1);
		this.aClass22_9 = arg0.method2627(0, 0, this.anInt4465, this.anInt4465, true);
		arg0.method2570();
		arg0.NA(0, 0, this.anInt4465, this.anInt4465, 0, 0);
		Static232.aClass22_8.M(0, 0, this.anInt4465, this.anInt4465, 1, 0, 0);
		this.aClass22_9.V(0, 0, 0);
		arg0.pa(Static232.anIntArray349[0], Static232.anIntArray349[1], Static232.anIntArray349[2], Static232.anIntArray349[3]);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(Lclient!qa;Lclient!lj;)V")
	private void method3640(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class144 arg1) {
		@Pc(6) Class242 local6 = Static275.method4093(this.anInt4458, Static61.aClass56_17);
		if (local6 == null) {
			return;
		}
		arg0.u(Static232.anIntArray349);
		arg0.pa(0, 0, this.anInt4465, this.anInt4465);
		arg0.NA(0, 0, this.anInt4465, this.anInt4465, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean339) {
				local32 = -arg1.anInt4463;
				local34 = -arg1.anInt4457;
				local36 = -arg1.anInt4464;
			} else {
				local32 = this.anInt4463 - arg1.anInt4463;
				local34 = this.anInt4457 - arg1.anInt4457;
				local36 = this.anInt4464 - arg1.anInt4464;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt4459 != 0) {
			local81 = -this.anInt4459 & 0x3FFF;
			local85 = Applet_Sub1.anIntArray85[local81];
			local89 = Applet_Sub1.anIntArray87[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt4467 != 0) {
			local81 = -this.anInt4467 & 0x3FFF;
			local85 = Applet_Sub1.anIntArray85[local81];
			local89 = Applet_Sub1.anIntArray87[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class31 local172 = arg0.method2616(local6, 2048, 0, 64, 768);
		local85 = local172.VA() - local172.la();
		local89 = local172.E() - local172.b();
		local99 = local172.la() + local85 / 2;
		@Pc(198) int local198 = local172.b() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.m(arg0.method2636());
		@Pc(218) Class106 local218 = arg0.method2587();
		local218.R(0, 0, arg0.d() - local172.X());
		local172.method5706(local218, null, arg0.d());
		this.aClass22_9 = arg0.method2627(0, 0, this.anInt4465, this.anInt4465, true);
		this.aClass22_9.V(0, 0, 3);
		arg0.pa(Static232.anIntArray349[0], Static232.anIntArray349[1], Static232.anIntArray349[2], Static232.anIntArray349[3]);
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(Lclient!qa;Lclient!lj;)Z")
	private boolean method3642(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class144 arg1) {
		if (this.aClass22_9 == null) {
			if (this.anInt4460 == 0) {
				if (Static60.anInterface7_2.method2132(this.anInt4458)) {
					@Pc(23) int[] local23 = Static60.anInterface7_2.method2128(this.anInt4465, 0.7F, this.anInt4458, this.anInt4465);
					this.aClass22_9 = arg0.method2640(local23, this.anInt4465, this.anInt4465, this.anInt4465);
				}
			} else if (this.anInt4460 == 2) {
				this.method3640(arg0, arg1);
			} else if (this.anInt4460 == 1) {
				this.method3638(arg0, arg1);
			}
		}
		return this.aClass22_9 != null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method3643(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass22_9 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt4459 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt4467 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt4466) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt4466) / 2;
		if (local38 < arg4 && local38 + this.anInt4466 > 0 && local51 < arg3 && local51 + this.anInt4466 > 0) {
			this.aClass22_9.method6075(local51 + arg1, local38 + arg2, this.anInt4466, this.anInt4466);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)Z")
	public boolean method3644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean339) {
			this.anInt4468 = 1073741823;
			local7 = this.anInt4463;
			local12 = this.anInt4457;
			local17 = this.anInt4464;
		} else {
			local7 = this.anInt4463 - arg0;
			local12 = this.anInt4457 - arg1;
			local17 = this.anInt4464 - arg2;
			this.anInt4468 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4468 == 0) {
				this.anInt4468 = 1;
			}
			local7 = (local7 << 8) / this.anInt4468;
			local12 = (local12 << 8) / this.anInt4468;
			local17 = (local17 << 8) / this.anInt4468;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4466 = this.anInt4461 * arg3 / (this.aBoolean339 ? 1024 : this.anInt4468);
		} else {
			this.anInt4466 = 0;
		}
		if (this.anInt4466 < 8) {
			this.aClass22_9 = null;
			return false;
		}
		@Pc(143) int local143 = Static350.method4984(this.anInt4466);
		if (local143 > arg3) {
			local143 = Static78.method1396(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4465) {
			this.anInt4465 = local143;
		}
		this.anInt4459 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt4467 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass22_9 = null;
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(Lclient!qa;Lclient!lj;)Z")
	public boolean method3645(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class144 arg1) {
		return this.aClass22_9 != null || this.method3642(arg0, arg1);
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "()V")
	public void method3647() {
		this.aClass22_9 = null;
	}
}
