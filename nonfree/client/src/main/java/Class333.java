import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class333 {

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
	private int anInt9664;

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
	public int anInt9668;

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
	private int anInt9669;

	@OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
	private int anInt9671;

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
	private int anInt9673;

	@OriginalMember(owner = "client!uu", name = "r", descriptor = "Lclient!f;")
	private Class78 aClass78_36;

	@OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
	private final int anInt9670;

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
	private final int anInt9665;

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
	private final int anInt9666;

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "Z")
	private final boolean aBoolean679;

	@OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
	private final int anInt9672;

	@OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
	private final int anInt9667;

	@OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
	private final int anInt9674;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
	private final int anInt9663;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt9670 = arg2;
		this.anInt9665 = arg3;
		this.anInt9666 = arg4;
		this.aBoolean679 = arg7;
		this.anInt9672 = arg1;
		this.anInt9667 = arg6;
		this.anInt9674 = arg5;
		this.anInt9663 = arg0;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!r;Lclient!uu;)Z")
	private boolean method7892(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class333 arg1) {
		if (this.aClass78_36 == null) {
			if (this.anInt9663 == 0) {
				if (Static208.anInterface11_6.method7407(this.anInt9672)) {
					@Pc(23) int[] local23 = Static208.anInterface11_6.method7406(this.anInt9673, this.anInt9672, this.anInt9673, 0.7F);
					this.aClass78_36 = arg0.method4969(local23, this.anInt9673, this.anInt9673, this.anInt9673);
				}
			} else if (this.anInt9663 == 2) {
				this.method7900(arg0, arg1);
			} else if (this.anInt9663 == 1) {
				this.method7895(arg0, arg1);
			}
		}
		return this.aClass78_36 != null;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!r;IIIIII)V")
	public void method7893(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass78_36 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt9671 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt9664 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt9669) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt9669) / 2;
		if (local38 < arg4 && local38 + this.anInt9669 > 0 && local51 < arg3 && local51 + this.anInt9669 > 0) {
			this.aClass78_36.method8187(local51 + arg1, local38 + arg2, this.anInt9669, this.anInt9669);
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(Lclient!r;Lclient!uu;)V")
	private void method7895(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class333 arg1) {
		Static545.method7894(arg0);
		Static545.method7897(arg0);
		arg0.oa(Static545.anIntArray518);
		arg0.da(0, 0, this.anInt9673, this.anInt9673);
		arg0.ya();
		arg0.J(0, 0, this.anInt9673, this.anInt9673, this.anInt9667 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean679) {
				local31 = -arg1.anInt9670;
				local33 = -arg1.anInt9665;
				local35 = -arg1.anInt9666;
			} else {
				local31 = arg1.anInt9670 - this.anInt9670;
				local33 = arg1.anInt9665 - this.anInt9665;
				local35 = arg1.anInt9666 - this.anInt9666;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt9671 != 0) {
			local79 = Class4_Sub27.anIntArray296[this.anInt9671];
			local84 = Class4_Sub27.anIntArray297[this.anInt9671];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt9664 != 0) {
			local79 = Class4_Sub27.anIntArray296[this.anInt9664];
			local84 = Class4_Sub27.anIntArray297[this.anInt9664];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class57 local147 = Static545.aClass57_7.method7912((byte) 0, 51200, true);
		if (arg0.method5022()) {
			local147.DA((short) 0, (short) this.anInt9672);
		} else {
			local147.d((short) 127, Static208.anInterface11_6.method7405(this.anInt9672).aShort12);
			local147.DA((short) 0, (short) -1);
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt9673 * 1024 / (local147.l() - local147.KA());
		if (this.anInt9667 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.la(this.anInt9673 / 2, this.anInt9673 / 2, local84, local84);
		arg0.method4999(arg0.method5025());
		@Pc(223) Class8 local223 = arg0.method5025();
		local223.NA(0, 0, arg0.BA() - local147.OA());
		local147.method7919(local223, null, 1024, 1);
		@Pc(245) int local245 = this.anInt9673 * 13 / 16;
		@Pc(252) int local252 = (this.anInt9673 - local245) / 2;
		Static545.aClass78_34.method8194(local252, local252, local245, local245, 0, this.anInt9667 | 0xFF000000, 1);
		this.aClass78_36 = arg0.method4964(0, 0, this.anInt9673, this.anInt9673, true);
		arg0.ya();
		arg0.J(0, 0, this.anInt9673, this.anInt9673, 0, 0);
		Static545.aClass78_35.method8194(0, 0, this.anInt9673, this.anInt9673, 1, 0, 0);
		this.aClass78_36.xa(0, 0, 0);
		arg0.da(Static545.anIntArray518[0], Static545.anIntArray518[1], Static545.anIntArray518[2], Static545.anIntArray518[3]);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "()V")
	public void method7896() {
		this.aClass78_36 = null;
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(Lclient!r;Lclient!uu;)Z")
	public boolean method7899(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class333 arg1) {
		return this.aClass78_36 != null || this.method7892(arg0, arg1);
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(Lclient!r;Lclient!uu;)V")
	private void method7900(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class333 arg1) {
		@Pc(6) Class191 local6 = Static91.method5485(Static5.aClass176_5, this.anInt9672);
		if (local6 == null) {
			return;
		}
		arg0.oa(Static545.anIntArray518);
		arg0.da(0, 0, this.anInt9673, this.anInt9673);
		arg0.J(0, 0, this.anInt9673, this.anInt9673, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean679) {
				local32 = -arg1.anInt9670;
				local34 = -arg1.anInt9665;
				local36 = -arg1.anInt9666;
			} else {
				local32 = this.anInt9670 - arg1.anInt9670;
				local34 = this.anInt9665 - arg1.anInt9665;
				local36 = this.anInt9666 - arg1.anInt9666;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt9671 != 0) {
			local81 = -this.anInt9671 & 0x3FFF;
			local85 = Class4_Sub27.anIntArray296[local81];
			local89 = Class4_Sub27.anIntArray297[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt9664 != 0) {
			local81 = -this.anInt9664 & 0x3FFF;
			local85 = Class4_Sub27.anIntArray296[local81];
			local89 = Class4_Sub27.anIntArray297[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class57 local172 = arg0.method5016(local6, 2048, 0, 64, 768);
		local85 = local172.l() - local172.KA();
		local89 = local172.H() - local172.J();
		local99 = local172.KA() + local85 / 2;
		@Pc(198) int local198 = local172.J() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.la(local99, local198, local205, local205);
		arg0.method4999(arg0.method5025());
		@Pc(218) Class8 local218 = arg0.method5007();
		local218.NA(0, 0, arg0.BA() - local172.OA());
		local172.method7919(local218, null, arg0.BA(), 1);
		this.aClass78_36 = arg0.method4964(0, 0, this.anInt9673, this.anInt9673, true);
		this.aClass78_36.xa(0, 0, 3);
		arg0.da(Static545.anIntArray518[0], Static545.anIntArray518[1], Static545.anIntArray518[2], Static545.anIntArray518[3]);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIII)Z")
	public boolean method7902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean679) {
			this.anInt9668 = 1073741823;
			local7 = this.anInt9670;
			local12 = this.anInt9665;
			local17 = this.anInt9666;
		} else {
			local7 = this.anInt9670 - arg0;
			local12 = this.anInt9665 - arg1;
			local17 = this.anInt9666 - arg2;
			this.anInt9668 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt9668 == 0) {
				this.anInt9668 = 1;
			}
			local7 = (local7 << 8) / this.anInt9668;
			local12 = (local12 << 8) / this.anInt9668;
			local17 = (local17 << 8) / this.anInt9668;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt9669 = this.anInt9674 * arg3 / (this.aBoolean679 ? 1024 : this.anInt9668);
		} else {
			this.anInt9669 = 0;
		}
		if (this.anInt9669 < 8) {
			this.aClass78_36 = null;
			return false;
		}
		@Pc(143) int local143 = Static341.method5553(this.anInt9669);
		if (local143 > arg3) {
			local143 = Static563.method8072(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt9673) {
			this.anInt9673 = local143;
		}
		this.anInt9671 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt9664 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass78_36 = null;
		return true;
	}
}
