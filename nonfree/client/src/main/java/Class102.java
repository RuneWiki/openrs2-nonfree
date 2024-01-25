import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class102 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	private int anInt3169;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	private int anInt3171;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	public int anInt3175;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	private int anInt3176;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!lg;")
	private Class60 aClass60_14;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	private final int anInt3174;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	private final int anInt3170;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
	private final int anInt3178;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "Z")
	private final boolean aBoolean268;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	private final int anInt3168;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	private final int anInt3177;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	private final int anInt3173;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	private final int anInt3172;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3174 = arg2;
		this.anInt3170 = arg3;
		this.anInt3178 = arg4;
		this.aBoolean268 = arg7;
		this.anInt3168 = arg1;
		this.anInt3177 = arg6;
		this.anInt3173 = arg5;
		this.anInt3172 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!vm;Lclient!jf;)V")
	private void method2780(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class102 arg1) {
		@Pc(6) Class153 local6 = Static169.method3173(Static199.aClass11_146, this.anInt3168);
		if (local6 == null) {
			return;
		}
		arg0.method4525(Static141.anIntArray284);
		arg0.method4459(0, 0, this.anInt3179, this.anInt3179);
		arg0.method4436(0, 0, this.anInt3179, this.anInt3179, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean268) {
				local32 = -arg1.anInt3174;
				local34 = -arg1.anInt3170;
				local36 = -arg1.anInt3178;
			} else {
				local32 = this.anInt3174 - arg1.anInt3174;
				local34 = this.anInt3170 - arg1.anInt3170;
				local36 = this.anInt3178 - arg1.anInt3178;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3176 != 0) {
			local81 = -this.anInt3176 & 0x3FFF;
			local85 = Class4_Sub4_Sub25.anIntArray384[local81];
			local89 = Class4_Sub4_Sub25.anIntArray383[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt3169 != 0) {
			local81 = -this.anInt3169 & 0x3FFF;
			local85 = Class4_Sub4_Sub25.anIntArray384[local81];
			local89 = Class4_Sub4_Sub25.anIntArray383[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method4536(1.0F);
		arg0.method4457(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class5 local172 = arg0.method4513(local6, 1024, 0, 64, 768);
		local85 = local172.method4025() - local172.method4010();
		local89 = local172.method3996() - local172.method4020();
		local99 = local172.method4010() + local85 / 2;
		@Pc(198) int local198 = local172.method4020() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method4520(local99, local198, local205, local205);
		arg0.method4530(arg0.method4538());
		@Pc(218) Class23 local218 = arg0.method4466();
		local218.method5091(0, 0, arg0.method4494() - local172.method3980());
		local172.method3985(local218, null, arg0.method4494());
		this.aClass60_14 = arg0.method4438(0, 0, this.anInt3179, this.anInt3179, true);
		this.aClass60_14.method5693(3);
		arg0.method4459(Static141.anIntArray284[0], Static141.anIntArray284[1], Static141.anIntArray284[2], Static141.anIntArray284[3]);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lclient!vm;Lclient!jf;)Z")
	public boolean method2781(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class102 arg1) {
		return this.aClass60_14 != null || this.method2788(arg0, arg1);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!vm;IIIIII)V")
	public void method2783(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass60_14 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3176 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3169 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3171) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3171) / 2;
		if (local38 < arg4 && local38 + this.anInt3171 > 0 && local51 < arg3 && local51 + this.anInt3171 > 0) {
			this.aClass60_14.method5688(local51 + arg1, local38 + arg2, this.anInt3171, this.anInt3171);
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "()V")
	public void method2784() {
		this.aClass60_14 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)Z")
	public boolean method2786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean268) {
			this.anInt3175 = 1073741823;
			local7 = this.anInt3174;
			local12 = this.anInt3170;
			local17 = this.anInt3178;
		} else {
			local7 = this.anInt3174 - arg0;
			local12 = this.anInt3170 - arg1;
			local17 = this.anInt3178 - arg2;
			this.anInt3175 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3175 == 0) {
				this.anInt3175 = 1;
			}
			local7 = (local7 << 8) / this.anInt3175;
			local12 = (local12 << 8) / this.anInt3175;
			local17 = (local17 << 8) / this.anInt3175;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3171 = this.anInt3173 * arg3 / (this.aBoolean268 ? 1024 : this.anInt3175);
		} else {
			this.anInt3171 = 0;
		}
		if (this.anInt3171 < 8) {
			this.aClass60_14 = null;
			return false;
		}
		@Pc(143) int local143 = Static338.method4468(this.anInt3171);
		if (local143 > arg3) {
			local143 = Static90.method1611(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3179) {
			this.anInt3179 = local143;
		}
		this.anInt3176 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt3169 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass60_14 = null;
		return true;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(Lclient!vm;Lclient!jf;)V")
	private void method2787(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class102 arg1) {
		Static141.method2789(arg0);
		Static141.method2785(arg0);
		arg0.method4525(Static141.anIntArray284);
		arg0.method4459(0, 0, this.anInt3179, this.anInt3179);
		arg0.method4486();
		arg0.method4436(0, 0, this.anInt3179, this.anInt3179, this.anInt3177 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean268) {
				local31 = -arg1.anInt3174;
				local33 = -arg1.anInt3170;
				local35 = -arg1.anInt3178;
			} else {
				local31 = arg1.anInt3174 - this.anInt3174;
				local33 = arg1.anInt3170 - this.anInt3170;
				local35 = arg1.anInt3178 - this.anInt3178;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3176 != 0) {
			local79 = Class4_Sub4_Sub25.anIntArray384[this.anInt3176];
			local84 = Class4_Sub4_Sub25.anIntArray383[this.anInt3176];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt3169 != 0) {
			local79 = Class4_Sub4_Sub25.anIntArray384[this.anInt3169];
			local84 = Class4_Sub4_Sub25.anIntArray383[this.anInt3169];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class5 local147 = Static141.aClass5_5.method4018((byte) 0, 25600, true);
		if (arg0.method4515()) {
			local147.method4009((short) 0, (short) this.anInt3168);
		} else {
			local147.method4022((short) 127, Static202.anInterface1_4.method5634(this.anInt3168).aShort57);
			local147.method4009((short) 0, (short) -1);
		}
		arg0.method4536(1.0F);
		arg0.method4457(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3179 * 1024 / (local147.method4025() - local147.method4010());
		if (this.anInt3177 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method4520(this.anInt3179 / 2, this.anInt3179 / 2, local84, local84);
		arg0.method4530(arg0.method4538());
		@Pc(223) Class23 local223 = arg0.method4538();
		local223.method5091(0, 0, arg0.method4494() - local147.method3980());
		local147.method3985(local223, null, 1024);
		@Pc(245) int local245 = this.anInt3179 * 13 / 16;
		@Pc(252) int local252 = (this.anInt3179 - local245) / 2;
		Static141.aClass60_15.method5692(local252, local252, local245, local245, 1, this.anInt3177 | 0xFF000000, 1);
		this.aClass60_14 = arg0.method4438(0, 0, this.anInt3179, this.anInt3179, true);
		arg0.method4486();
		arg0.method4436(0, 0, this.anInt3179, this.anInt3179, 0, 0);
		Static141.aClass60_13.method5692(0, 0, this.anInt3179, this.anInt3179, 0, 0, 0);
		this.aClass60_14.method5693(0);
		arg0.method4459(Static141.anIntArray284[0], Static141.anIntArray284[1], Static141.anIntArray284[2], Static141.anIntArray284[3]);
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(Lclient!vm;Lclient!jf;)Z")
	private boolean method2788(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class102 arg1) {
		if (this.aClass60_14 == null) {
			if (this.anInt3172 == 0) {
				if (Static202.anInterface1_4.method5637(this.anInt3168)) {
					@Pc(23) int[] local23 = Static202.anInterface1_4.method5636(0.7F, this.anInt3168, this.anInt3179, this.anInt3179);
					this.aClass60_14 = arg0.method4537(local23, this.anInt3179, this.anInt3179, this.anInt3179);
				}
			} else if (this.anInt3172 == 2) {
				this.method2780(arg0, arg1);
			} else if (this.anInt3172 == 1) {
				this.method2787(arg0, arg1);
			}
		}
		return this.aClass60_14 != null;
	}
}
