import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class112 {

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "[I")
	private static final int[] anIntArray180 = new int[4];

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
	private int anInt2868;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	private int anInt2869;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
	private int anInt2871;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	private int anInt2872;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Lclient!jd;")
	private Class13 aClass13_11;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
	public int anInt2877;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
	private final int anInt2875;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
	private final int anInt2870;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	private final int anInt2878;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Z")
	private final boolean aBoolean203;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	private final int anInt2873;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	private final int anInt2879;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	private final int anInt2876;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	private final int anInt2874;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 478)
	public Class112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2875 = arg2;
		this.anInt2870 = arg3;
		this.anInt2878 = arg4;
		this.aBoolean203 = arg7;
		this.anInt2873 = arg1;
		this.anInt2879 = arg6;
		this.anInt2876 = arg5;
		this.anInt2874 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!wm;IIIIII)V", line = 8)
	public void method2918(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass13_11 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt2872 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt2868 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt2869) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt2869) / 2;
		if (local38 < arg4 && local38 + this.anInt2869 > 0 && local51 < arg3 && local51 + this.anInt2869 > 0) {
			this.aClass13_11.method6389(local51 + arg1, local38 + arg2, this.anInt2869, this.anInt2869);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!wm;Lclient!ja;)V", line = 38)
	private void method2920(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class112 arg1) {
		Static148.method2925(arg0);
		Static148.method2927(arg0);
		arg0.method2853(anIntArray180);
		arg0.method2897(0, 0, this.anInt2871, this.anInt2871);
		arg0.method2821();
		arg0.method2903(0, 0, this.anInt2871, this.anInt2871, this.anInt2879 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean203) {
				local31 = -arg1.anInt2875;
				local33 = -arg1.anInt2870;
				local35 = -arg1.anInt2878;
			} else {
				local31 = arg1.anInt2875 - this.anInt2875;
				local33 = arg1.anInt2870 - this.anInt2870;
				local35 = arg1.anInt2878 - this.anInt2878;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2872 != 0) {
			local79 = Class19.anIntArray178[this.anInt2872];
			local84 = Class19.anIntArray177[this.anInt2872];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt2868 != 0) {
			local79 = Class19.anIntArray178[this.anInt2868];
			local84 = Class19.anIntArray177[this.anInt2868];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class31 local147 = Static148.aClass31_4.method3801((byte) 0, 25600, true);
		if (arg0.method2831()) {
			local147.method3817((short) 0, (short) this.anInt2873);
		} else {
			local147.method3839((short) 127, Static252.anInterface2_7.method2660(this.anInt2873).aShort87);
			local147.method3817((short) 0, (short) -1);
		}
		arg0.method2840(1.0F);
		arg0.method2834(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2871 * 1024 / (local147.method3823() - local147.method3807());
		if (this.anInt2879 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method2823(this.anInt2871 / 2, this.anInt2871 / 2, local84, local84);
		arg0.method2898(arg0.method2899());
		@Pc(223) Class14 local223 = arg0.method2899();
		local223.method3923(0, 0, arg0.method2816() - local147.method3813());
		local147.method3845(local223, null, 1024);
		@Pc(245) int local245 = this.anInt2871 * 13 / 16;
		@Pc(252) int local252 = (this.anInt2871 - local245) / 2;
		Static148.aClass13_10.method6396(local252, local252, local245, local245, 1, this.anInt2879 | 0xFF000000, 1);
		this.aClass13_11 = arg0.method2820(0, 0, this.anInt2871, this.anInt2871, true);
		arg0.method2821();
		arg0.method2903(0, 0, this.anInt2871, this.anInt2871, 0, 0);
		Static148.aClass13_9.method6396(0, 0, this.anInt2871, this.anInt2871, 0, 0, 0);
		this.aClass13_11.method6393(0);
		arg0.method2897(anIntArray180[0], anIntArray180[1], anIntArray180[2], anIntArray180[3]);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Lclient!wm;Lclient!ja;)V", line = 131)
	private void method2921(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class112 arg1) {
		@Pc(6) Class185 local6 = Static275.method2428(Static313.aClass197_90, this.anInt2873);
		if (local6 == null) {
			return;
		}
		arg0.method2853(anIntArray180);
		arg0.method2897(0, 0, this.anInt2871, this.anInt2871);
		arg0.method2903(0, 0, this.anInt2871, this.anInt2871, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean203) {
				local32 = -arg1.anInt2875;
				local34 = -arg1.anInt2870;
				local36 = -arg1.anInt2878;
			} else {
				local32 = this.anInt2875 - arg1.anInt2875;
				local34 = this.anInt2870 - arg1.anInt2870;
				local36 = this.anInt2878 - arg1.anInt2878;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt2872 != 0) {
			local81 = -this.anInt2872 & 0x3FFF;
			local85 = Class19.anIntArray178[local81];
			local89 = Class19.anIntArray177[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt2868 != 0) {
			local81 = -this.anInt2868 & 0x3FFF;
			local85 = Class19.anIntArray178[local81];
			local89 = Class19.anIntArray177[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method2840(1.0F);
		arg0.method2834(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class31 local172 = arg0.method2866(local6, 1024, 0, 64, 768);
		local85 = local172.method3823() - local172.method3807();
		local89 = local172.method3818() - local172.method3803();
		local99 = local172.method3807() + local85 / 2;
		@Pc(198) int local198 = local172.method3803() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method2823(local99, local198, local205, local205);
		arg0.method2898(arg0.method2899());
		@Pc(218) Class14 local218 = arg0.method2810();
		local218.method3923(0, 0, arg0.method2816() - local172.method3813());
		local172.method3845(local218, null, arg0.method2816());
		this.aClass13_11 = arg0.method2820(0, 0, this.anInt2871, this.anInt2871, true);
		this.aClass13_11.method6393(3);
		arg0.method2897(anIntArray180[0], anIntArray180[1], anIntArray180[2], anIntArray180[3]);
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "()V", line = 224)
	public void method2923() {
		this.aClass13_11 = null;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(Lclient!wm;Lclient!ja;)Z", line = 230)
	private boolean method2924(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class112 arg1) {
		if (this.aClass13_11 == null) {
			if (this.anInt2874 == 0) {
				if (Static252.anInterface2_7.method2659(this.anInt2873)) {
					@Pc(23) int[] local23 = Static252.anInterface2_7.method2658(0.7F, this.anInt2871, this.anInt2871, this.anInt2873);
					this.aClass13_11 = arg0.method2886(local23, this.anInt2871, this.anInt2871, this.anInt2871);
				}
			} else if (this.anInt2874 == 2) {
				this.method2921(arg0, arg1);
			} else if (this.anInt2874 == 1) {
				this.method2920(arg0, arg1);
			}
		}
		return this.aClass13_11 != null;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(Lclient!wm;Lclient!ja;)Z", line = 355)
	public boolean method2926(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class112 arg1) {
		return this.aClass13_11 != null || this.method2924(arg0, arg1);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)Z", line = 421)
	public boolean method2928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean203) {
			this.anInt2877 = 1073741823;
			local7 = this.anInt2875;
			local12 = this.anInt2870;
			local17 = this.anInt2878;
		} else {
			local7 = this.anInt2875 - arg0;
			local12 = this.anInt2870 - arg1;
			local17 = this.anInt2878 - arg2;
			this.anInt2877 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2877 == 0) {
				this.anInt2877 = 1;
			}
			local7 = (local7 << 8) / this.anInt2877;
			local12 = (local12 << 8) / this.anInt2877;
			local17 = (local17 << 8) / this.anInt2877;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2869 = this.anInt2876 * arg3 / (this.aBoolean203 ? 1024 : this.anInt2877);
		} else {
			this.anInt2869 = 0;
		}
		if (this.anInt2869 < 8) {
			this.aClass13_11 = null;
			return false;
		}
		@Pc(143) int local143 = Static152.method2978(this.anInt2869);
		if (local143 > arg3) {
			local143 = Static326.method5856(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2871) {
			this.anInt2871 = local143;
		}
		this.anInt2872 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt2868 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass13_11 = null;
		return true;
	}
}
