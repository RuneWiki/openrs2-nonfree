import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ok", name = "P", descriptor = "F")
	private float aFloat111;

	@OriginalMember(owner = "client!ok", name = "Q", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
	private int anInt3725;

	@OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
	private int anInt3727;

	@OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
	private int anInt3722 = -1;

	@OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
	private int anInt3726 = 0;

	@OriginalMember(owner = "client!ok", name = "W", descriptor = "Z")
	public boolean aBoolean290 = false;

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "Lclient!pk;")
	public Class1_Sub2_Sub15 aClass1_Sub2_Sub15_1;

	@OriginalMember(owner = "client!ok", name = "K", descriptor = "Z")
	private boolean aBoolean286;

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "Z")
	private boolean aBoolean287;

	@OriginalMember(owner = "client!ok", name = "S", descriptor = "Z")
	private boolean aBoolean288;

	@OriginalMember(owner = "client!ok", name = "H", descriptor = "Z")
	private boolean aBoolean285;

	@OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
	private int anInt3721;

	@OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
	private int anInt3723;

	@OriginalMember(owner = "client!ok", name = "V", descriptor = "Z")
	private boolean aBoolean289;

	@OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
	private int anInt3720;

	@OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
	private int anInt3724;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class1_Sub2_Sub14(@OriginalArg(0) Class1_Sub18 arg0) {
		this.aClass1_Sub2_Sub15_1 = new Class1_Sub2_Sub15(arg0);
		this.aBoolean286 = arg0.method3122() == 1;
		this.aBoolean287 = arg0.method3122() == 1;
		this.aBoolean288 = arg0.method3122() == 1;
		this.aBoolean285 = arg0.method3122() == 1;
		@Pc(62) int local62 = arg0.method3122() & 0x3;
		this.anInt3721 = arg0.method3082();
		this.anInt3723 = arg0.method3082();
		@Pc(76) int local76 = arg0.method3122();
		arg0.method3122();
		this.aBoolean289 = arg0.method3122() == 1;
		this.anInt3720 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt3724 = 2;
		} else if (local62 == 2) {
			this.anInt3724 = 3;
		} else if (local62 == 3) {
			this.anInt3724 = 4;
		} else {
			this.anInt3724 = 0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!eg;Lclient!ak;)Z")
	public boolean method2924(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class7 arg1) {
		return this.aClass1_Sub2_Sub15_1.method3217(arg1, arg0);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!eg;Lclient!ak;FZ)[I")
	public int[] method2925(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray436 == null || this.aFloat111 != arg2) {
			if (!this.aClass1_Sub2_Sub15_1.method3217(arg1, arg0)) {
				return null;
			}
			this.anInt3727 = arg3 ? 64 : 128;
			this.anIntArray436 = this.aClass1_Sub2_Sub15_1.method3216(this.aBoolean287, arg1, this.anInt3727, (double) arg2, this.anInt3727, arg0, true);
			this.aFloat111 = arg2;
			if (this.aBoolean286) {
				@Pc(50) int[] local50 = new int[this.anInt3727];
				@Pc(54) int[] local54 = new int[this.anInt3727];
				@Pc(58) int[] local58 = new int[this.anInt3727];
				@Pc(65) int[] local65 = new int[this.anInt3727 * this.anInt3727];
				@Pc(68) int local68 = this.anInt3727;
				@Pc(71) int local71 = this.anInt3727;
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
						@Pc(103) int local103 = this.anIntArray436[local88];
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
						@Pc(268) int local268 = this.anIntArray436[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray436[local89];
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
				this.anIntArray436 = local65;
			}
		}
		return this.anIntArray436;
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
	public void method2927(@OriginalArg(0) int arg0) {
		if (this.anIntArray436 == null || this.anInt3723 == 0 && this.anInt3721 == 0) {
			return;
		}
		if (Static193.anIntArray437 == null || Static193.anIntArray437.length < this.anIntArray436.length) {
			Static193.anIntArray437 = new int[this.anIntArray436.length];
		}
		@Pc(26) int local26 = this.anIntArray436.length;
		@Pc(31) int local31 = arg0 * this.anInt3721;
		@Pc(36) int local36 = this.anInt3727 - 1;
		@Pc(44) int local44 = this.anInt3727 * arg0 * this.anInt3723;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt3727) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt3727; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static193.anIntArray437[local69] = this.anIntArray436[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray436;
		this.anIntArray436 = Static193.anIntArray437;
		Static193.anIntArray437 = local95;
	}

	@OriginalMember(owner = "client!ok", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3722 != -1) {
			Static154.method2373(this.anInt3722, this.anInt3726, this.anInt3725);
			this.anInt3722 = -1;
			this.anInt3726 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!eg;Lclient!ak;Z)[I")
	public int[] method2930(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass1_Sub2_Sub15_1.method3217(arg1, arg0)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass1_Sub2_Sub15_1.method3216(this.aBoolean287, arg1, local14, 1.0D, local14, arg0, false);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!eg;Lclient!ak;I)Z")
	public boolean method2931(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass1_Sub2_Sub15_1.method3217(arg1, arg0)) {
			return false;
		}
		@Pc(10) GL local10 = Static240.aGL1;
		@Pc(13) int local13 = Static238.method3763();
		if ((local13 & 0x1) == 0) {
			if (this.anInt3722 != -1 && this.anInt3727 == arg2) {
				Static240.method3789(this.anInt3722);
			} else {
				if (this.anInt3722 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt3722 = local32[0];
					this.anInt3725 = Static154.anInt2852;
				}
				Static240.method3789(this.anInt3722);
				if (this.aBoolean289 && Static111.method1735()) {
					@Pc(64) float[] local64 = this.aClass1_Sub2_Sub15_1.method3210(arg2, arg0, this.aBoolean287, arg1, arg2);
					if (this.anInt3720 == 2) {
						Static193.method2926(Static231.anInt4839, Static231.anInt4845, arg2, arg2, Static231.anInt4842, Static231.anInt4852, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static154.anInt2855 += local64.length * 4 / 3 - this.anInt3726;
						this.anInt3726 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static154.anInt2855 += local64.length - this.anInt3726;
						this.anInt3726 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static240.aBoolean379 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass1_Sub2_Sub15_1.method3207(arg0, arg2, arg2, this.aBoolean287, arg1, 0.7D);
					if (this.anInt3720 == 2) {
						Static193.method2928(Static231.anInt4839, Static231.anInt4842, arg2, arg2, Static231.anInt4843, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static154.anInt2855 += local160.length * 4 / 3 - this.anInt3726;
						this.anInt3726 = local160.length * 4 / 3;
					} else if (this.anInt3720 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static154.anInt2855 += local160.length * 4 / 3 - this.anInt3726;
								this.anInt3726 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass1_Sub2_Sub15_1.method3207(arg0, arg2, arg2, this.aBoolean287, arg1, 0.7D);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static154.anInt2855 += local160.length - this.anInt3726;
						this.anInt3726 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean288 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean285 ? 10497 : 33071);
				this.anInt3727 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static240.method3804(this.anInt3724);
		}
		if ((local13 & 0x4) == 0) {
			Static240.method3791(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt3723 == 0 && this.anInt3721 == 0) {
				Static240.method3781();
			} else {
				@Pc(367) float local367 = (float) (Static240.anInt4950 * this.anInt3723) / (float) this.anInt3727;
				@Pc(377) float local377 = (float) (Static240.anInt4950 * this.anInt3721) / (float) this.anInt3727;
				Static240.method3810(local377, local367, 0.0F);
			}
		}
		return true;
	}
}
