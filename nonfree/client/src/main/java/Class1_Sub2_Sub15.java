import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "F")
	private float aFloat35;

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
	private int anInt3674;

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
	private int anInt3678;

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
	private int anInt3676 = -1;

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "Z")
	public boolean aBoolean273 = false;

	@OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
	private int anInt3679 = 0;

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "Lclient!wb;")
	public Class1_Sub2_Sub22 aClass1_Sub2_Sub22_1;

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "Z")
	private boolean aBoolean274;

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "Z")
	private boolean aBoolean275;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Z")
	private boolean aBoolean271;

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "Z")
	private boolean aBoolean276;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
	private int anInt3675;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
	private int anInt3673;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "Z")
	private boolean aBoolean272;

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
	private int anInt3677;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
	private int anInt3672;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class1_Sub2_Sub15(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aClass1_Sub2_Sub22_1 = new Class1_Sub2_Sub22(arg0);
		this.aBoolean274 = arg0.method2690() == 1;
		this.aBoolean275 = arg0.method2690() == 1;
		this.aBoolean271 = arg0.method2690() == 1;
		this.aBoolean276 = arg0.method2690() == 1;
		@Pc(62) int local62 = arg0.method2690() & 0x3;
		this.anInt3675 = arg0.method2663();
		this.anInt3673 = arg0.method2663();
		@Pc(76) int local76 = arg0.method2690();
		arg0.method2690();
		this.aBoolean272 = arg0.method2690() == 1;
		this.anInt3677 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt3672 = 2;
		} else if (local62 == 2) {
			this.anInt3672 = 3;
		} else if (local62 == 3) {
			this.anInt3672 = 4;
		} else {
			this.anInt3672 = 0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3676 != -1) {
			Static94.method1748(this.anInt3676, this.anInt3679, this.anInt3678);
			this.anInt3676 = -1;
			this.anInt3679 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!rf;Lclient!km;)Z")
	public boolean method2951(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class91 arg1) {
		return this.aClass1_Sub2_Sub22_1.method4355(arg1, arg0);
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
	public void method2953(@OriginalArg(0) int arg0) {
		if (this.anIntArray330 == null || this.anInt3673 == 0 && this.anInt3675 == 0) {
			return;
		}
		if (Static173.anIntArray329 == null || Static173.anIntArray329.length < this.anIntArray330.length) {
			Static173.anIntArray329 = new int[this.anIntArray330.length];
		}
		@Pc(26) int local26 = this.anIntArray330.length;
		@Pc(31) int local31 = arg0 * this.anInt3675;
		@Pc(36) int local36 = this.anInt3674 - 1;
		@Pc(44) int local44 = this.anInt3674 * arg0 * this.anInt3673;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt3674) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt3674; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static173.anIntArray329[local69] = this.anIntArray330[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray330;
		this.anIntArray330 = Static173.anIntArray329;
		Static173.anIntArray329 = local95;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!rf;Lclient!km;FZ)[I")
	public int[] method2955(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray330 == null || this.aFloat35 != arg2) {
			if (!this.aClass1_Sub2_Sub22_1.method4355(arg1, arg0)) {
				return null;
			}
			this.anInt3674 = arg3 ? 64 : 128;
			this.anIntArray330 = this.aClass1_Sub2_Sub22_1.method4356(arg1, this.anInt3674, true, (double) arg2, arg0, this.anInt3674, this.aBoolean275);
			this.aFloat35 = arg2;
			if (this.aBoolean274) {
				@Pc(50) int[] local50 = new int[this.anInt3674];
				@Pc(54) int[] local54 = new int[this.anInt3674];
				@Pc(58) int[] local58 = new int[this.anInt3674];
				@Pc(65) int[] local65 = new int[this.anInt3674 * this.anInt3674];
				@Pc(68) int local68 = this.anInt3674;
				@Pc(71) int local71 = this.anInt3674;
				@Pc(75) int local75 = local68 - 1;
				@Pc(79) int local79 = local71 - 1;
				@Pc(83) int local83 = local68 * local71;
				@Pc(88) int local88;
				@Pc(89) int local89 = local88 = local68;
				@Pc(95) int local95;
				@Pc(91) int local91;
				for (local91 = 2; local91 >= 0; local91--) {
					for (local95 = local75; local95 >= 0; local95--) {
						local88--;
						@Pc(103) int local103 = this.anIntArray330[local88];
						local50[local95] += local103 >> 16 & 0xFF;
						local54[local95] += local103 >> 8 & 0xFF;
						local58[local95] += local103 & 0xFF;
					}
					if (local88 == 0) {
						local88 = local83;
					}
				}
				@Pc(144) int local144 = local83;
				for (@Pc(146) int local146 = local79; local146 >= 0; local146--) {
					@Pc(150) int local150 = 1;
					@Pc(152) int local152 = 1;
					@Pc(155) int local155 = 0;
					@Pc(157) int local157 = 0;
					@Pc(158) int local158 = 0;
					for (local95 = 2; local95 >= 0; local95--) {
						local152--;
						local158 += local50[local152];
						local155 += local54[local152];
						local157 += local58[local152];
						if (local152 == 0) {
							local152 = local68;
						}
					}
					for (local95 = local75; local95 >= 0; local95--) {
						local152--;
						local150--;
						local91 = local158 / 9;
						@Pc(201) int local201 = local155 / 9;
						@Pc(205) int local205 = local157 / 9;
						local144--;
						local65[local144] = local91 << 16 | local201 << 8 | local205;
						local158 += local50[local152] - local50[local150];
						local157 += local58[local152] - local58[local150];
						local155 += local54[local152] - local54[local150];
						if (local152 == 0) {
							local152 = local68;
						}
						if (local150 == 0) {
							local150 = local68;
						}
					}
					for (local95 = local75; local95 >= 0; local95--) {
						local88--;
						@Pc(268) int local268 = this.anIntArray330[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray330[local89];
						local50[local95] += (local268 >> 16 & 0xFF) - (local274 >> 16 & 0xFF);
						local54[local95] += (local268 >> 8 & 0xFF) - (local274 >> 8 & 0xFF);
						local58[local95] += (local268 & 0xFF) - (local274 & 0xFF);
					}
					if (local88 == 0) {
						local88 = local83;
					}
					if (local89 == 0) {
						local89 = local83;
					}
				}
				this.anIntArray330 = local65;
			}
		}
		return this.anIntArray330;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!rf;Lclient!km;Z)[I")
	public int[] method2956(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass1_Sub2_Sub22_1.method4355(arg1, arg0)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass1_Sub2_Sub22_1.method4356(arg1, local14, false, 1.0D, arg0, local14, this.aBoolean275);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!rf;Lclient!km;I)Z")
	public boolean method2957(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass1_Sub2_Sub22_1.method4355(arg1, arg0)) {
			return false;
		}
		@Pc(10) GL local10 = Static277.aGL1;
		@Pc(13) int local13 = Static225.method3548();
		if ((local13 & 0x1) == 0) {
			if (this.anInt3676 != -1 && this.anInt3674 == arg2) {
				Static277.method4212(this.anInt3676);
			} else {
				if (this.anInt3676 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt3676 = local32[0];
					this.anInt3678 = Static94.anInt2207;
				}
				Static277.method4212(this.anInt3676);
				if (this.aBoolean272 && Static167.method2899()) {
					@Pc(64) float[] local64 = this.aClass1_Sub2_Sub22_1.method4354(this.aBoolean275, arg2, arg2, arg0, arg1);
					if (this.anInt3677 == 2) {
						Static173.method2954(Static37.anInt929, Static37.anInt935, arg2, arg2, Static37.anInt932, Static37.anInt942, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static94.anInt2206 += local64.length * 4 / 3 - this.anInt3679;
						this.anInt3679 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static94.anInt2206 += local64.length - this.anInt3679;
						this.anInt3679 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static277.aBoolean418 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass1_Sub2_Sub22_1.method4357(0.7D, arg0, arg2, this.aBoolean275, arg1, arg2);
					if (this.anInt3677 == 2) {
						Static173.method2952(Static37.anInt929, Static37.anInt932, arg2, arg2, Static37.anInt933, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static94.anInt2206 += local160.length * 4 / 3 - this.anInt3679;
						this.anInt3679 = local160.length * 4 / 3;
					} else if (this.anInt3677 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static94.anInt2206 += local160.length * 4 / 3 - this.anInt3679;
								this.anInt3679 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass1_Sub2_Sub22_1.method4357(0.7D, arg0, arg2, this.aBoolean275, arg1, arg2);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static94.anInt2206 += local160.length - this.anInt3679;
						this.anInt3679 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean271 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean276 ? 10497 : 33071);
				this.anInt3674 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static277.method4222(this.anInt3672);
		}
		if ((local13 & 0x4) == 0) {
			Static277.method4190(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt3673 == 0 && this.anInt3675 == 0) {
				Static277.method4210();
			} else {
				@Pc(367) float local367 = (float) (Static277.anInt5361 * this.anInt3673) / (float) this.anInt3674;
				@Pc(377) float local377 = (float) (Static277.anInt5361 * this.anInt3675) / (float) this.anInt3674;
				Static277.method4185(local377, local367, 0.0F);
			}
		}
		return true;
	}
}
