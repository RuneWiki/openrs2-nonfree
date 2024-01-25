import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class128 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
	private int anInt3821;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
	private int anInt3825;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
	public int anInt3826;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
	private int anInt3827;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "Lclient!ae;")
	private Class4 aClass4_14;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
	private int anInt3831;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
	private final int anInt3828;

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
	private final int anInt3830;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
	private final int anInt3824;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "Z")
	private final boolean aBoolean286;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
	private final int anInt3832;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
	private final int anInt3822;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
	private final int anInt3829;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
	private final int anInt3823;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3828 = arg2;
		this.anInt3830 = arg3;
		this.anInt3824 = arg4;
		this.aBoolean286 = arg7;
		this.anInt3832 = arg1;
		this.anInt3822 = arg6;
		this.anInt3829 = arg5;
		this.anInt3823 = arg0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!fp;Lclient!ls;)Z")
	private boolean method3560(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class128 arg1) {
		if (this.aClass4_14 == null) {
			if (this.anInt3823 == 0) {
				if (Static185.anInterface3_4.method5485(this.anInt3832)) {
					@Pc(23) int[] local23 = Static185.anInterface3_4.method5488(this.anInt3832, this.anInt3825, this.anInt3825, 0.7F);
					this.aClass4_14 = arg0.method4587(local23, this.anInt3825, this.anInt3825, this.anInt3825);
				}
			} else if (this.anInt3823 == 2) {
				this.method3567(arg0, arg1);
			} else if (this.anInt3823 == 1) {
				this.method3568(arg0, arg1);
			}
		}
		return this.aClass4_14 != null;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "()V")
	public void method3561() {
		this.aClass4_14 = null;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(Lclient!fp;Lclient!ls;)Z")
	public boolean method3562(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class128 arg1) {
		return this.aClass4_14 != null || this.method3560(arg0, arg1);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!fp;IIIIII)V")
	public void method3563(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass4_14 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3827 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3821 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3831) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3831) / 2;
		if (local38 < arg4 && local38 + this.anInt3831 > 0 && local51 < arg3 && local51 + this.anInt3831 > 0) {
			this.aClass4_14.method5964(local51 + arg1, local38 + arg2, this.anInt3831, this.anInt3831);
		}
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(Lclient!fp;Lclient!ls;)V")
	private void method3567(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class128 arg1) {
		@Pc(6) Class41 local6 = Static227.method4232(this.anInt3832, Static128.aClass30_87);
		if (local6 == null) {
			return;
		}
		arg0.method4565(Static190.anIntArray289);
		arg0.method4566(0, 0, this.anInt3825, this.anInt3825);
		arg0.method4653(0, 0, this.anInt3825, this.anInt3825, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean286) {
				local32 = -arg1.anInt3828;
				local34 = -arg1.anInt3830;
				local36 = -arg1.anInt3824;
			} else {
				local32 = this.anInt3828 - arg1.anInt3828;
				local34 = this.anInt3830 - arg1.anInt3830;
				local36 = this.anInt3824 - arg1.anInt3824;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3827 != 0) {
			local81 = -this.anInt3827 & 0x3FFF;
			local85 = Class208.anIntArray479[local81];
			local89 = Class208.anIntArray478[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt3821 != 0) {
			local81 = -this.anInt3821 & 0x3FFF;
			local85 = Class208.anIntArray479[local81];
			local89 = Class208.anIntArray478[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method4650(1.0F);
		arg0.method4622(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class3 local172 = arg0.method4652(local6, 1024, 0, 64, 768);
		local85 = local172.method1248() - local172.method1269();
		local89 = local172.method1250() - local172.method1245();
		local99 = local172.method1269() + local85 / 2;
		@Pc(198) int local198 = local172.method1245() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method4590(local99, local198, local205, local205);
		arg0.method4596(arg0.method4573());
		@Pc(218) Class129 local218 = arg0.method4634();
		local218.method5774(0, 0, arg0.method4593() - local172.method1264());
		local172.method1244(local218, null, arg0.method4593());
		this.aClass4_14 = arg0.method4612(0, 0, this.anInt3825, this.anInt3825, true);
		this.aClass4_14.method5949(3);
		arg0.method4566(Static190.anIntArray289[0], Static190.anIntArray289[1], Static190.anIntArray289[2], Static190.anIntArray289[3]);
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "(Lclient!fp;Lclient!ls;)V")
	private void method3568(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class128 arg1) {
		Static190.method3565(arg0);
		Static190.method3564(arg0);
		arg0.method4565(Static190.anIntArray289);
		arg0.method4566(0, 0, this.anInt3825, this.anInt3825);
		arg0.method4620();
		arg0.method4653(0, 0, this.anInt3825, this.anInt3825, this.anInt3822 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean286) {
				local31 = -arg1.anInt3828;
				local33 = -arg1.anInt3830;
				local35 = -arg1.anInt3824;
			} else {
				local31 = arg1.anInt3828 - this.anInt3828;
				local33 = arg1.anInt3830 - this.anInt3830;
				local35 = arg1.anInt3824 - this.anInt3824;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3827 != 0) {
			local79 = Class208.anIntArray479[this.anInt3827];
			local84 = Class208.anIntArray478[this.anInt3827];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt3821 != 0) {
			local79 = Class208.anIntArray479[this.anInt3821];
			local84 = Class208.anIntArray478[this.anInt3821];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class3 local147 = Static190.aClass3_2.method1261((byte) 0, 25600, true);
		if (arg0.method4649()) {
			local147.method1237((short) 0, (short) this.anInt3832);
		} else {
			local147.method1260((short) 127, Static185.anInterface3_4.method5486(this.anInt3832).aShort72);
			local147.method1237((short) 0, (short) -1);
		}
		arg0.method4650(1.0F);
		arg0.method4622(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3825 * 1024 / (local147.method1248() - local147.method1269());
		if (this.anInt3822 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method4590(this.anInt3825 / 2, this.anInt3825 / 2, local84, local84);
		arg0.method4596(arg0.method4573());
		@Pc(223) Class129 local223 = arg0.method4573();
		local223.method5774(0, 0, arg0.method4593() - local147.method1264());
		local147.method1244(local223, null, 1024);
		@Pc(245) int local245 = this.anInt3825 * 13 / 16;
		@Pc(252) int local252 = (this.anInt3825 - local245) / 2;
		Static190.aClass4_12.method5955(local252, local252, local245, local245, 1, this.anInt3822 | 0xFF000000, 1);
		this.aClass4_14 = arg0.method4612(0, 0, this.anInt3825, this.anInt3825, true);
		arg0.method4620();
		arg0.method4653(0, 0, this.anInt3825, this.anInt3825, 0, 0);
		Static190.aClass4_13.method5955(0, 0, this.anInt3825, this.anInt3825, 0, 0, 0);
		this.aClass4_14.method5949(0);
		arg0.method4566(Static190.anIntArray289[0], Static190.anIntArray289[1], Static190.anIntArray289[2], Static190.anIntArray289[3]);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIII)Z")
	public boolean method3570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean286) {
			this.anInt3826 = 1073741823;
			local7 = this.anInt3828;
			local12 = this.anInt3830;
			local17 = this.anInt3824;
		} else {
			local7 = this.anInt3828 - arg0;
			local12 = this.anInt3830 - arg1;
			local17 = this.anInt3824 - arg2;
			this.anInt3826 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3826 == 0) {
				this.anInt3826 = 1;
			}
			local7 = (local7 << 8) / this.anInt3826;
			local12 = (local12 << 8) / this.anInt3826;
			local17 = (local17 << 8) / this.anInt3826;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3831 = this.anInt3829 * arg3 / (this.aBoolean286 ? 1024 : this.anInt3826);
		} else {
			this.anInt3831 = 0;
		}
		if (this.anInt3831 < 8) {
			this.aClass4_14 = null;
			return false;
		}
		@Pc(143) int local143 = Static73.method1617(this.anInt3831);
		if (local143 > arg3) {
			local143 = Static294.method5142(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3825) {
			this.anInt3825 = local143;
		}
		this.anInt3827 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt3821 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass4_14 = null;
		return true;
	}
}
