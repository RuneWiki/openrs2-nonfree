import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class139 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!qg;")
	private Class87 aClass87_13;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
	private int anInt3806;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	private int anInt3808;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
	public int anInt3810;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	private int anInt3813;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	private int anInt3814;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	private final int anInt3805;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
	private final int anInt3803;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
	private final int anInt3809;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "Z")
	private final boolean aBoolean250;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	private final int anInt3812;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
	private final int anInt3804;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
	private final int anInt3807;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
	private final int anInt3811;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3805 = arg2;
		this.anInt3803 = arg3;
		this.anInt3809 = arg4;
		this.aBoolean250 = arg7;
		this.anInt3812 = arg1;
		this.anInt3804 = arg6;
		this.anInt3807 = arg5;
		this.anInt3811 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)Z")
	public boolean method3132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean250) {
			this.anInt3810 = 1073741823;
			local7 = this.anInt3805;
			local12 = this.anInt3803;
			local17 = this.anInt3809;
		} else {
			local7 = this.anInt3805 - arg0;
			local12 = this.anInt3803 - arg1;
			local17 = this.anInt3809 - arg2;
			this.anInt3810 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3810 == 0) {
				this.anInt3810 = 1;
			}
			local7 = (local7 << 8) / this.anInt3810;
			local12 = (local12 << 8) / this.anInt3810;
			local17 = (local17 << 8) / this.anInt3810;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3813 = this.anInt3807 * arg3 / (this.aBoolean250 ? 1024 : this.anInt3810);
		} else {
			this.anInt3813 = 0;
		}
		if (this.anInt3813 < 8) {
			this.aClass87_13 = null;
			return false;
		}
		@Pc(143) int local143 = Static52.method1203(this.anInt3813);
		if (local143 > arg3) {
			local143 = Static31.method761(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3806) {
			this.anInt3806 = local143;
		}
		this.anInt3814 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt3808 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass87_13 = null;
		return true;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!eq;Lclient!ka;)Z")
	public boolean method3134(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class139 arg1) {
		return this.aClass87_13 != null || this.method3140(arg0, arg1);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lclient!eq;Lclient!ka;)V")
	private void method3135(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class139 arg1) {
		Static204.method3131(arg0);
		Static204.method3141(arg0);
		arg0.method5019(Static204.anIntArray275);
		arg0.method5044(0, 0, this.anInt3806, this.anInt3806);
		arg0.method4990();
		arg0.method5004(0, 0, this.anInt3806, this.anInt3806, this.anInt3804 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean250) {
				local31 = -arg1.anInt3805;
				local33 = -arg1.anInt3803;
				local35 = -arg1.anInt3809;
			} else {
				local31 = arg1.anInt3805 - this.anInt3805;
				local33 = arg1.anInt3803 - this.anInt3803;
				local35 = arg1.anInt3809 - this.anInt3809;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3814 != 0) {
			local79 = Class145.anIntArray279[this.anInt3814];
			local84 = Class145.anIntArray280[this.anInt3814];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt3808 != 0) {
			local79 = Class145.anIntArray279[this.anInt3808];
			local84 = Class145.anIntArray280[this.anInt3808];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class224 local147 = Static204.aClass224_3.method5808((byte) 0, 51200, true);
		if (arg0.method4983()) {
			local147.method5830((short) 0, (short) this.anInt3812);
		} else {
			local147.method5824((short) 127, Static125.anInterface8_3.method5566(this.anInt3812).aShort72);
			local147.method5830((short) 0, (short) -1);
		}
		arg0.method5025(1.0F);
		arg0.method5033(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3806 * 1024 / (local147.method5838() - local147.method5834());
		if (this.anInt3804 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method5003(this.anInt3806 / 2, this.anInt3806 / 2, local84, local84);
		arg0.method5071(arg0.method5057());
		@Pc(223) Class5 local223 = arg0.method5057();
		local223.method3846(0, 0, arg0.method4991() - local147.method5815());
		local147.method5796(local223, null, 1024);
		@Pc(245) int local245 = this.anInt3806 * 13 / 16;
		@Pc(252) int local252 = (this.anInt3806 - local245) / 2;
		Static204.aClass87_14.method6571(local252, local252, local245, local245, 0, this.anInt3804 | 0xFF000000, 1);
		this.aClass87_13 = arg0.method5014(0, 0, this.anInt3806, this.anInt3806, true);
		arg0.method4990();
		arg0.method5004(0, 0, this.anInt3806, this.anInt3806, 0, 0);
		Static204.aClass87_12.method6571(0, 0, this.anInt3806, this.anInt3806, 1, 0, 0);
		this.aClass87_13.method6563(0);
		arg0.method5044(Static204.anIntArray275[0], Static204.anIntArray275[1], Static204.anIntArray275[2], Static204.anIntArray275[3]);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Lclient!eq;Lclient!ka;)V")
	private void method3136(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class139 arg1) {
		@Pc(6) Class78 local6 = Static100.method1817(this.anInt3812, Static105.aClass100_15);
		if (local6 == null) {
			return;
		}
		arg0.method5019(Static204.anIntArray275);
		arg0.method5044(0, 0, this.anInt3806, this.anInt3806);
		arg0.method5004(0, 0, this.anInt3806, this.anInt3806, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean250) {
				local32 = -arg1.anInt3805;
				local34 = -arg1.anInt3803;
				local36 = -arg1.anInt3809;
			} else {
				local32 = this.anInt3805 - arg1.anInt3805;
				local34 = this.anInt3803 - arg1.anInt3803;
				local36 = this.anInt3809 - arg1.anInt3809;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3814 != 0) {
			local81 = -this.anInt3814 & 0x3FFF;
			local85 = Class145.anIntArray279[local81];
			local89 = Class145.anIntArray280[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt3808 != 0) {
			local81 = -this.anInt3808 & 0x3FFF;
			local85 = Class145.anIntArray279[local81];
			local89 = Class145.anIntArray280[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method5025(1.0F);
		arg0.method5033(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class224 local172 = arg0.method4971(local6, 2048, 0, 64, 768);
		local85 = local172.method5838() - local172.method5834();
		local89 = local172.method5813() - local172.method5812();
		local99 = local172.method5834() + local85 / 2;
		@Pc(198) int local198 = local172.method5812() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method5003(local99, local198, local205, local205);
		arg0.method5071(arg0.method5057());
		@Pc(218) Class5 local218 = arg0.method5064();
		local218.method3846(0, 0, arg0.method4991() - local172.method5815());
		local172.method5796(local218, null, arg0.method4991());
		this.aClass87_13 = arg0.method5014(0, 0, this.anInt3806, this.anInt3806, true);
		this.aClass87_13.method6563(3);
		arg0.method5044(Static204.anIntArray275[0], Static204.anIntArray275[1], Static204.anIntArray275[2], Static204.anIntArray275[3]);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!eq;IIIIII)V")
	public void method3137(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass87_13 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3814 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3808 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3813) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3813) / 2;
		if (local38 < arg4 && local38 + this.anInt3813 > 0 && local51 < arg3 && local51 + this.anInt3813 > 0) {
			this.aClass87_13.method6564(local51 + arg1, local38 + arg2, this.anInt3813, this.anInt3813);
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	public void method3139() {
		this.aClass87_13 = null;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(Lclient!eq;Lclient!ka;)Z")
	private boolean method3140(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class139 arg1) {
		if (this.aClass87_13 == null) {
			if (this.anInt3811 == 0) {
				if (Static125.anInterface8_3.method5562(this.anInt3812)) {
					@Pc(23) int[] local23 = Static125.anInterface8_3.method5564(0.7F, this.anInt3806, this.anInt3806, this.anInt3812);
					this.aClass87_13 = arg0.method5018(local23, this.anInt3806, this.anInt3806, this.anInt3806);
				}
			} else if (this.anInt3811 == 2) {
				this.method3136(arg0, arg1);
			} else if (this.anInt3811 == 1) {
				this.method3135(arg0, arg1);
			}
		}
		return this.aClass87_13 != null;
	}
}
