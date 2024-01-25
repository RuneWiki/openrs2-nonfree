import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class143 {

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
	private int anInt4149;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
	public int anInt4151;

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
	private int anInt4153;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
	private int anInt4157;

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
	private int anInt4158;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "Lclient!rg;")
	private Class27 aClass27_16;

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
	private final int anInt4155;

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
	private final int anInt4152;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
	private final int anInt4156;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "Z")
	private final boolean aBoolean302;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
	private final int anInt4148;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
	private final int anInt4150;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
	private final int anInt4154;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
	private final int anInt4147;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4155 = arg2;
		this.anInt4152 = arg3;
		this.anInt4156 = arg4;
		this.aBoolean302 = arg7;
		this.anInt4148 = arg1;
		this.anInt4150 = arg6;
		this.anInt4154 = arg5;
		this.anInt4147 = arg0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!oj;IIIIII)V")
	public void method3689(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass27_16 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt4158 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt4153 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt4149) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt4149) / 2;
		if (local38 < arg4 && local38 + this.anInt4149 > 0 && local51 < arg3 && local51 + this.anInt4149 > 0) {
			this.aClass27_16.method5321(local51 + arg1, local38 + arg2, this.anInt4149, this.anInt4149);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!oj;Lclient!lq;)Z")
	public boolean method3690(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class143 arg1) {
		return this.aClass27_16 != null || this.method3696(arg0, arg1);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII)Z")
	public boolean method3691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean302) {
			this.anInt4151 = 1073741823;
			local7 = this.anInt4155;
			local12 = this.anInt4152;
			local17 = this.anInt4156;
		} else {
			local7 = this.anInt4155 - arg0;
			local12 = this.anInt4152 - arg1;
			local17 = this.anInt4156 - arg2;
			this.anInt4151 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4151 == 0) {
				this.anInt4151 = 1;
			}
			local7 = (local7 << 8) / this.anInt4151;
			local12 = (local12 << 8) / this.anInt4151;
			local17 = (local17 << 8) / this.anInt4151;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4149 = this.anInt4154 * arg3 / (this.aBoolean302 ? 1024 : this.anInt4151);
		} else {
			this.anInt4149 = 0;
		}
		if (this.anInt4149 < 8) {
			this.aClass27_16 = null;
			return false;
		}
		@Pc(143) int local143 = Static279.method4638(this.anInt4149);
		if (local143 > arg3) {
			local143 = Static65.method1195(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4157) {
			this.anInt4157 = local143;
		}
		this.anInt4158 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt4153 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass27_16 = null;
		return true;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(Lclient!oj;Lclient!lq;)V")
	private void method3693(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class143 arg1) {
		Static201.method3697(arg0);
		Static201.method3688(arg0);
		arg0.method2495(Static201.anIntArray306);
		arg0.method2496(0, 0, this.anInt4157, this.anInt4157);
		arg0.method2503();
		arg0.method2470(0, 0, this.anInt4157, this.anInt4157, this.anInt4150 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean302) {
				local31 = -arg1.anInt4155;
				local33 = -arg1.anInt4152;
				local35 = -arg1.anInt4156;
			} else {
				local31 = arg1.anInt4155 - this.anInt4155;
				local33 = arg1.anInt4152 - this.anInt4152;
				local35 = arg1.anInt4156 - this.anInt4156;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt4158 != 0) {
			local79 = Class106.anIntArray240[this.anInt4158];
			local84 = Class106.anIntArray242[this.anInt4158];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt4153 != 0) {
			local79 = Class106.anIntArray240[this.anInt4153];
			local84 = Class106.anIntArray242[this.anInt4153];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class159 local147 = Static201.aClass159_4.method4927((byte) 0, 25600, true);
		if (arg0.method2454()) {
			local147.method4939((short) 0, (short) this.anInt4148);
		} else {
			local147.method4964((short) 127, Static194.anInterface3_5.method1278(this.anInt4148).aShort62);
			local147.method4939((short) 0, (short) -1);
		}
		arg0.method2498(1.0F);
		arg0.method2543(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt4157 * 1024 / (local147.method4963() - local147.method4934());
		if (this.anInt4150 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method2469(this.anInt4157 / 2, this.anInt4157 / 2, local84, local84);
		arg0.method2482(arg0.method2483());
		@Pc(223) Class21 local223 = arg0.method2483();
		local223.method3711(0, 0, arg0.method2539() - local147.method4935());
		local147.method4933(local223, null, 1024);
		@Pc(245) int local245 = this.anInt4157 * 13 / 16;
		@Pc(252) int local252 = (this.anInt4157 - local245) / 2;
		Static201.aClass27_14.method5334(local252, local252, local245, local245, 1, this.anInt4150 | 0xFF000000, 1);
		this.aClass27_16 = arg0.method2510(0, 0, this.anInt4157, this.anInt4157, true);
		arg0.method2503();
		arg0.method2470(0, 0, this.anInt4157, this.anInt4157, 0, 0);
		Static201.aClass27_15.method5334(0, 0, this.anInt4157, this.anInt4157, 0, 0, 0);
		this.aClass27_16.method5333(0);
		arg0.method2496(Static201.anIntArray306[0], Static201.anIntArray306[1], Static201.anIntArray306[2], Static201.anIntArray306[3]);
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "()V")
	public void method3695() {
		this.aClass27_16 = null;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(Lclient!oj;Lclient!lq;)Z")
	private boolean method3696(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class143 arg1) {
		if (this.aClass27_16 == null) {
			if (this.anInt4147 == 0) {
				if (Static194.anInterface3_5.method1277(this.anInt4148)) {
					@Pc(23) int[] local23 = Static194.anInterface3_5.method1281(this.anInt4148, 0.7F, this.anInt4157, this.anInt4157);
					this.aClass27_16 = arg0.method2456(local23, this.anInt4157, this.anInt4157, this.anInt4157);
				}
			} else if (this.anInt4147 == 2) {
				this.method3698(arg0, arg1);
			} else if (this.anInt4147 == 1) {
				this.method3693(arg0, arg1);
			}
		}
		return this.aClass27_16 != null;
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(Lclient!oj;Lclient!lq;)V")
	private void method3698(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class143 arg1) {
		@Pc(6) Class130 local6 = Static215.method3852(Static189.aClass83_16, this.anInt4148);
		if (local6 == null) {
			return;
		}
		arg0.method2495(Static201.anIntArray306);
		arg0.method2496(0, 0, this.anInt4157, this.anInt4157);
		arg0.method2470(0, 0, this.anInt4157, this.anInt4157, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean302) {
				local32 = -arg1.anInt4155;
				local34 = -arg1.anInt4152;
				local36 = -arg1.anInt4156;
			} else {
				local32 = this.anInt4155 - arg1.anInt4155;
				local34 = this.anInt4152 - arg1.anInt4152;
				local36 = this.anInt4156 - arg1.anInt4156;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt4158 != 0) {
			local81 = -this.anInt4158 & 0x3FFF;
			local85 = Class106.anIntArray240[local81];
			local89 = Class106.anIntArray242[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt4153 != 0) {
			local81 = -this.anInt4153 & 0x3FFF;
			local85 = Class106.anIntArray240[local81];
			local89 = Class106.anIntArray242[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method2498(1.0F);
		arg0.method2543(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class159 local172 = arg0.method2540(local6, 1024, 0, 64, 768);
		local85 = local172.method4963() - local172.method4934();
		local89 = local172.method4932() - local172.method4941();
		local99 = local172.method4934() + local85 / 2;
		@Pc(198) int local198 = local172.method4941() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method2469(local99, local198, local205, local205);
		arg0.method2482(arg0.method2483());
		@Pc(218) Class21 local218 = arg0.method2445();
		local218.method3711(0, 0, arg0.method2539() - local172.method4935());
		local172.method4933(local218, null, arg0.method2539());
		this.aClass27_16 = arg0.method2510(0, 0, this.anInt4157, this.anInt4157, true);
		this.aClass27_16.method5333(3);
		arg0.method2496(Static201.anIntArray306[0], Static201.anIntArray306[1], Static201.anIntArray306[2], Static201.anIntArray306[3]);
	}
}
