import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class240 {

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
	private int anInt6587;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
	private int anInt6588;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
	private int anInt6589;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	public int anInt6591;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
	private int anInt6593;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "Lclient!xa;")
	private Class58 aClass58_36;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
	private final int anInt6594;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
	private final int anInt6590;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
	private final int anInt6586;

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "Z")
	private final boolean aBoolean457;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
	private final int anInt6595;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
	private final int anInt6596;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
	private final int anInt6585;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
	private final int anInt6592;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6594 = arg2;
		this.anInt6590 = arg3;
		this.anInt6586 = arg4;
		this.aBoolean457 = arg7;
		this.anInt6595 = arg1;
		this.anInt6596 = arg6;
		this.anInt6585 = arg5;
		this.anInt6592 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!oa;Lclient!ol;)Z")
	private boolean method5559(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class240 arg1) {
		if (this.aClass58_36 == null) {
			if (this.anInt6592 == 0) {
				if (Static116.anInterface4_5.method4233(this.anInt6595)) {
					@Pc(23) int[] local23 = Static116.anInterface4_5.method4231(this.anInt6587, this.anInt6587, this.anInt6595, 0.7F);
					this.aClass58_36 = arg0.method6863(local23, this.anInt6587, this.anInt6587, this.anInt6587);
				}
			} else if (this.anInt6592 == 2) {
				this.method5568(arg0, arg1);
			} else if (this.anInt6592 == 1) {
				this.method5564(arg0, arg1);
			}
		}
		return this.aClass58_36 != null;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)Z")
	public boolean method5561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean457) {
			this.anInt6591 = 1073741823;
			local7 = this.anInt6594;
			local12 = this.anInt6590;
			local17 = this.anInt6586;
		} else {
			local7 = this.anInt6594 - arg0;
			local12 = this.anInt6590 - arg1;
			local17 = this.anInt6586 - arg2;
			this.anInt6591 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt6591 == 0) {
				this.anInt6591 = 1;
			}
			local7 = (local7 << 8) / this.anInt6591;
			local12 = (local12 << 8) / this.anInt6591;
			local17 = (local17 << 8) / this.anInt6591;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt6589 = this.anInt6585 * arg3 / (this.aBoolean457 ? 1024 : this.anInt6591);
		} else {
			this.anInt6589 = 0;
		}
		if (this.anInt6589 < 8) {
			this.aClass58_36 = null;
			return false;
		}
		@Pc(143) int local143 = Static253.method4296(this.anInt6589);
		if (local143 > arg3) {
			local143 = Static505.method6819(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt6587) {
			this.anInt6587 = local143;
		}
		this.anInt6593 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt6588 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass58_36 = null;
		return true;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(Lclient!oa;Lclient!ol;)Z")
	public boolean method5563(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class240 arg1) {
		return this.aClass58_36 != null || this.method5559(arg0, arg1);
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(Lclient!oa;Lclient!ol;)V")
	private void method5564(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class240 arg1) {
		Static372.method5560(arg0);
		Static372.method5558(arg0);
		arg0.A(Static372.anIntArray488);
		arg0.ca(0, 0, this.anInt6587, this.anInt6587);
		arg0.method6892();
		arg0.C(0, 0, this.anInt6587, this.anInt6587, this.anInt6596 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean457) {
				local31 = -arg1.anInt6594;
				local33 = -arg1.anInt6590;
				local35 = -arg1.anInt6586;
			} else {
				local31 = arg1.anInt6594 - this.anInt6594;
				local33 = arg1.anInt6590 - this.anInt6590;
				local35 = arg1.anInt6586 - this.anInt6586;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt6593 != 0) {
			local79 = Class6_Sub2_Sub7.anIntArray178[this.anInt6593];
			local84 = Class6_Sub2_Sub7.anIntArray177[this.anInt6593];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt6588 != 0) {
			local79 = Class6_Sub2_Sub7.anIntArray178[this.anInt6588];
			local84 = Class6_Sub2_Sub7.anIntArray177[this.anInt6588];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class20 local147 = Static372.aClass20_6.method7264((byte) 0, 51200, true);
		if (arg0.method6842()) {
			local147.ka((short) 0, (short) this.anInt6595);
		} else {
			local147.UA((short) 127, Static116.anInterface4_5.method4234(this.anInt6595).aShort105);
			local147.ka((short) 0, (short) -1);
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt6587 * 1024 / (local147.M() - local147.ha());
		if (this.anInt6596 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.m(this.anInt6587 / 2, this.anInt6587 / 2, local84, local84);
		arg0.method6829(arg0.method6882());
		@Pc(223) Class54 local223 = arg0.method6882();
		local223.GA(0, 0, arg0.U() - local147.LA());
		local147.method7259(local223, null, 1024);
		@Pc(245) int local245 = this.anInt6587 * 13 / 16;
		@Pc(252) int local252 = (this.anInt6587 - local245) / 2;
		Static372.aClass58_35.KA(local252, local252, local245, local245, 0, this.anInt6596 | 0xFF000000, 1);
		this.aClass58_36 = arg0.method6874(0, 0, this.anInt6587, this.anInt6587, true);
		arg0.method6892();
		arg0.C(0, 0, this.anInt6587, this.anInt6587, 0, 0);
		Static372.aClass58_34.KA(0, 0, this.anInt6587, this.anInt6587, 1, 0, 0);
		this.aClass58_36.t(0, 0, 0);
		arg0.ca(Static372.anIntArray488[0], Static372.anIntArray488[1], Static372.anIntArray488[2], Static372.anIntArray488[3]);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "()V")
	public void method5565() {
		this.aClass58_36 = null;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!oa;IIIIII)V")
	public void method5566(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass58_36 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt6593 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt6588 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt6589) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt6589) / 2;
		if (local38 < arg4 && local38 + this.anInt6589 > 0 && local51 < arg3 && local51 + this.anInt6589 > 0) {
			this.aClass58_36.method7657(local51 + arg1, local38 + arg2, this.anInt6589, this.anInt6589);
		}
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(Lclient!oa;Lclient!ol;)V")
	private void method5568(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class240 arg1) {
		@Pc(6) Class220 local6 = Static489.method6690(this.anInt6595, Static447.aClass251_102);
		if (local6 == null) {
			return;
		}
		arg0.A(Static372.anIntArray488);
		arg0.ca(0, 0, this.anInt6587, this.anInt6587);
		arg0.C(0, 0, this.anInt6587, this.anInt6587, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean457) {
				local32 = -arg1.anInt6594;
				local34 = -arg1.anInt6590;
				local36 = -arg1.anInt6586;
			} else {
				local32 = this.anInt6594 - arg1.anInt6594;
				local34 = this.anInt6590 - arg1.anInt6590;
				local36 = this.anInt6586 - arg1.anInt6586;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt6593 != 0) {
			local81 = -this.anInt6593 & 0x3FFF;
			local85 = Class6_Sub2_Sub7.anIntArray178[local81];
			local89 = Class6_Sub2_Sub7.anIntArray177[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt6588 != 0) {
			local81 = -this.anInt6588 & 0x3FFF;
			local85 = Class6_Sub2_Sub7.anIntArray178[local81];
			local89 = Class6_Sub2_Sub7.anIntArray177[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class20 local172 = arg0.method6833(local6, 2048, 0, 64, 768);
		local85 = local172.M() - local172.ha();
		local89 = local172.EA() - local172.DA();
		local99 = local172.ha() + local85 / 2;
		@Pc(198) int local198 = local172.DA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.m(local99, local198, local205, local205);
		arg0.method6829(arg0.method6882());
		@Pc(218) Class54 local218 = arg0.method6851();
		local218.GA(0, 0, arg0.U() - local172.LA());
		local172.method7259(local218, null, arg0.U());
		this.aClass58_36 = arg0.method6874(0, 0, this.anInt6587, this.anInt6587, true);
		this.aClass58_36.t(0, 0, 3);
		arg0.ca(Static372.anIntArray488[0], Static372.anIntArray488[1], Static372.anIntArray488[2], Static372.anIntArray488[3]);
	}
}
