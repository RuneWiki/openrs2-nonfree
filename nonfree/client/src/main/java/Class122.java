import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class122 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	private int anInt3165;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "I")
	private int anInt3168;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "I")
	public int anInt3170;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "I")
	private int anInt3172;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "Lclient!of;")
	private Class40 aClass40_8;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	private int anInt3174;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "I")
	private final int anInt3173;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	private final int anInt3164;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "I")
	private final int anInt3169;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Z")
	private final boolean aBoolean232;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	private final int anInt3171;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "I")
	private final int anInt3167;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "I")
	private final int anInt3166;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	private final int anInt3163;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3173 = arg2;
		this.anInt3164 = arg3;
		this.anInt3169 = arg4;
		this.aBoolean232 = arg7;
		this.anInt3171 = arg1;
		this.anInt3167 = arg6;
		this.anInt3166 = arg5;
		this.anInt3163 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ja;Lclient!la;)Z")
	public boolean method3302(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class122 arg1) {
		return this.aClass40_8 != null || this.method3303(arg0, arg1);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Lclient!ja;Lclient!la;)Z")
	private boolean method3303(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class122 arg1) {
		if (this.aClass40_8 == null) {
			if (this.anInt3163 == 0) {
				if (Static10.anInterface2_1.method349(this.anInt3171)) {
					@Pc(23) int[] local23 = Static10.anInterface2_1.method345(this.anInt3171, this.anInt3168, 0.7F, this.anInt3168);
					this.aClass40_8 = arg0.method2996(local23, this.anInt3168, this.anInt3168, this.anInt3168);
				}
			} else if (this.anInt3163 == 2) {
				this.method3311(arg0, arg1);
			} else if (this.anInt3163 == 1) {
				this.method3308(arg0, arg1);
			}
		}
		return this.aClass40_8 != null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)Z")
	public boolean method3305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean232) {
			this.anInt3170 = 1073741823;
			local7 = this.anInt3173;
			local12 = this.anInt3164;
			local17 = this.anInt3169;
		} else {
			local7 = this.anInt3173 - arg0;
			local12 = this.anInt3164 - arg1;
			local17 = this.anInt3169 - arg2;
			this.anInt3170 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3170 == 0) {
				this.anInt3170 = 1;
			}
			local7 = (local7 << 8) / this.anInt3170;
			local12 = (local12 << 8) / this.anInt3170;
			local17 = (local17 << 8) / this.anInt3170;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3174 = this.anInt3166 * arg3 / (this.aBoolean232 ? 1024 : this.anInt3170);
		} else {
			this.anInt3174 = 0;
		}
		if (this.anInt3174 < 8) {
			this.aClass40_8 = null;
			return false;
		}
		@Pc(143) int local143 = Static247.method4066(this.anInt3174);
		if (local143 > arg3) {
			local143 = Static62.method1001(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3168) {
			this.anInt3168 = local143;
		}
		this.anInt3172 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt3165 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass40_8 = null;
		return true;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(Lclient!ja;Lclient!la;)V")
	private void method3308(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class122 arg1) {
		Static170.method3304(arg0);
		Static170.method3306(arg0);
		arg0.method2989(Static170.anIntArray384);
		arg0.method3033(0, 0, this.anInt3168, this.anInt3168);
		arg0.method3023();
		arg0.method2962(0, 0, this.anInt3168, this.anInt3168, this.anInt3167 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean232) {
				local31 = -arg1.anInt3173;
				local33 = -arg1.anInt3164;
				local35 = -arg1.anInt3169;
			} else {
				local31 = arg1.anInt3173 - this.anInt3173;
				local33 = arg1.anInt3164 - this.anInt3164;
				local35 = arg1.anInt3169 - this.anInt3169;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3172 != 0) {
			local79 = Class207.anIntArray697[this.anInt3172];
			local84 = Class207.anIntArray698[this.anInt3172];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt3165 != 0) {
			local79 = Class207.anIntArray697[this.anInt3165];
			local84 = Class207.anIntArray698[this.anInt3165];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class78 local147 = Static170.aClass78_3.method4661((byte) 0, 25600, true);
		if (arg0.method3028()) {
			local147.method4626((short) 0, (short) this.anInt3171);
		} else {
			local147.method4645((short) 127, Static10.anInterface2_1.method346(this.anInt3171).aShort23);
			local147.method4626((short) 0, (short) -1);
		}
		arg0.method2980(1.0F);
		arg0.method2993(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3168 * 1024 / (local147.method4630() - local147.method4640());
		if (this.anInt3167 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method2985(this.anInt3168 / 2, this.anInt3168 / 2, local84, local84);
		arg0.method2954(arg0.method3029());
		@Pc(223) Class72 local223 = arg0.method3029();
		local223.method4067(0, 0, arg0.method3025() - local147.method4621());
		local147.method4653(local223, null, 1024);
		@Pc(245) int local245 = this.anInt3168 * 13 / 16;
		@Pc(252) int local252 = (this.anInt3168 - local245) / 2;
		Static170.aClass40_7.method5082(local252, local252, local245, local245, 1, this.anInt3167 | 0xFF000000, 1);
		this.aClass40_8 = arg0.method2967(0, 0, this.anInt3168, this.anInt3168, true);
		arg0.method3023();
		arg0.method2962(0, 0, this.anInt3168, this.anInt3168, 0, 0);
		Static170.aClass40_9.method5082(0, 0, this.anInt3168, this.anInt3168, 0, 0, 0);
		this.aClass40_8.method5078(0);
		arg0.method3033(Static170.anIntArray384[0], Static170.anIntArray384[1], Static170.anIntArray384[2], Static170.anIntArray384[3]);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "()V")
	public void method3309() {
		this.aClass40_8 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ja;IIIIII)V")
	public void method3310(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass40_8 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3172 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3165 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3174) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3174) / 2;
		if (local38 < arg4 && local38 + this.anInt3174 > 0 && local51 < arg3 && local51 + this.anInt3174 > 0) {
			this.aClass40_8.method5073(local51 + arg1, local38 + arg2, this.anInt3174, this.anInt3174);
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(Lclient!ja;Lclient!la;)V")
	private void method3311(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class122 arg1) {
		@Pc(6) Class57 local6 = Static287.method4917(this.anInt3171, Static354.aClass53_161);
		if (local6 == null) {
			return;
		}
		arg0.method2989(Static170.anIntArray384);
		arg0.method3033(0, 0, this.anInt3168, this.anInt3168);
		arg0.method2962(0, 0, this.anInt3168, this.anInt3168, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean232) {
				local32 = -arg1.anInt3173;
				local34 = -arg1.anInt3164;
				local36 = -arg1.anInt3169;
			} else {
				local32 = this.anInt3173 - arg1.anInt3173;
				local34 = this.anInt3164 - arg1.anInt3164;
				local36 = this.anInt3169 - arg1.anInt3169;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3172 != 0) {
			local81 = -this.anInt3172 & 0x3FFF;
			local85 = Class207.anIntArray697[local81];
			local89 = Class207.anIntArray698[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt3165 != 0) {
			local81 = -this.anInt3165 & 0x3FFF;
			local85 = Class207.anIntArray697[local81];
			local89 = Class207.anIntArray698[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method2980(1.0F);
		arg0.method2993(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class78 local172 = arg0.method3016(local6, 1024, 0, 64, 768);
		local85 = local172.method4630() - local172.method4640();
		local89 = local172.method4642() - local172.method4639();
		local99 = local172.method4640() + local85 / 2;
		@Pc(198) int local198 = local172.method4639() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method2985(local99, local198, local205, local205);
		arg0.method2954(arg0.method3029());
		@Pc(218) Class72 local218 = arg0.method2990();
		local218.method4067(0, 0, arg0.method3025() - local172.method4621());
		local172.method4653(local218, null, arg0.method3025());
		this.aClass40_8 = arg0.method2967(0, 0, this.anInt3168, this.anInt3168, true);
		this.aClass40_8.method5078(3);
		arg0.method3033(Static170.anIntArray384[0], Static170.anIntArray384[1], Static170.anIntArray384[2], Static170.anIntArray384[3]);
	}
}
