import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class4_Sub2_Sub3 extends Class4_Sub2 {

	@OriginalMember(owner = "client!b", name = "r", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!b", name = "J", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!b", name = "K", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "I")
	private int anInt238 = -1;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!b", name = "I", descriptor = "I")
	private int anInt244 = 0;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Lclient!qe;")
	public Class4_Sub2_Sub17 aClass4_Sub2_Sub17_1;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "Z")
	private boolean aBoolean13;

	@OriginalMember(owner = "client!b", name = "H", descriptor = "Z")
	private boolean aBoolean14;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "Z")
	private boolean aBoolean9;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "Z")
	private boolean aBoolean10;

	@OriginalMember(owner = "client!b", name = "B", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!b", name = "x", descriptor = "Z")
	private boolean aBoolean11;

	@OriginalMember(owner = "client!b", name = "z", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!p;)V")
	public Class4_Sub2_Sub3(@OriginalArg(0) Class4_Sub17 arg0) {
		this.aClass4_Sub2_Sub17_1 = new Class4_Sub2_Sub17(arg0);
		this.aBoolean13 = arg0.method1874() == 1;
		this.aBoolean14 = arg0.method1874() == 1;
		this.aBoolean9 = arg0.method1874() == 1;
		this.aBoolean10 = arg0.method1874() == 1;
		@Pc(62) int local62 = arg0.method1874() & 0x3;
		this.anInt241 = arg0.method1892();
		this.anInt243 = arg0.method1892();
		@Pc(76) int local76 = arg0.method1874();
		arg0.method1874();
		this.aBoolean11 = arg0.method1874() == 1;
		this.anInt239 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt240 = 2;
		} else if (local62 == 2) {
			this.anInt240 = 3;
		} else if (local62 == 3) {
			this.anInt240 = 4;
		} else {
			this.anInt240 = 0;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!t;Lclient!lc;Z)[I")
	public int[] method217(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass4_Sub2_Sub17_1.method3413(arg0, arg1)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass4_Sub2_Sub17_1.method3408(arg0, this.aBoolean14, local14, arg1, false, 1.0D, local14);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!t;Lclient!lc;FZ)[I")
	public int[] method219(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray28 == null || this.aFloat3 != arg2) {
			if (!this.aClass4_Sub2_Sub17_1.method3413(arg0, arg1)) {
				return null;
			}
			this.anInt242 = arg3 ? 64 : 128;
			this.anIntArray28 = this.aClass4_Sub2_Sub17_1.method3408(arg0, this.aBoolean14, this.anInt242, arg1, true, (double) arg2, this.anInt242);
			this.aFloat3 = arg2;
			if (this.aBoolean13) {
				@Pc(50) int[] local50 = new int[this.anInt242];
				@Pc(54) int[] local54 = new int[this.anInt242];
				@Pc(58) int[] local58 = new int[this.anInt242];
				@Pc(65) int[] local65 = new int[this.anInt242 * this.anInt242];
				@Pc(68) int local68 = this.anInt242;
				@Pc(71) int local71 = this.anInt242;
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
						@Pc(103) int local103 = this.anIntArray28[local88];
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
						@Pc(268) int local268 = this.anIntArray28[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray28[local89];
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
				this.anIntArray28 = local65;
			}
		}
		return this.anIntArray28;
	}

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt238 != -1) {
			Static163.method2523(this.anInt238, this.anInt244, this.anInt245);
			this.anInt238 = -1;
			this.anInt244 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
	public void method220(@OriginalArg(0) int arg0) {
		if (this.anIntArray28 == null || this.anInt243 == 0 && this.anInt241 == 0) {
			return;
		}
		if (Static13.anIntArray27 == null || Static13.anIntArray27.length < this.anIntArray28.length) {
			Static13.anIntArray27 = new int[this.anIntArray28.length];
		}
		@Pc(26) int local26 = this.anIntArray28.length;
		@Pc(31) int local31 = arg0 * this.anInt241;
		@Pc(36) int local36 = this.anInt242 - 1;
		@Pc(44) int local44 = this.anInt242 * arg0 * this.anInt243;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt242) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt242; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static13.anIntArray27[local69] = this.anIntArray28[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray28;
		this.anIntArray28 = Static13.anIntArray27;
		Static13.anIntArray27 = local95;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!t;Lclient!lc;)Z")
	public boolean method221(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class98 arg1) {
		return this.aClass4_Sub2_Sub17_1.method3413(arg0, arg1);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!t;Lclient!lc;I)Z")
	public boolean method223(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass4_Sub2_Sub17_1.method3413(arg0, arg1)) {
			return false;
		}
		@Pc(10) GL local10 = Static178.aGL1;
		@Pc(13) int local13 = Static59.method2485();
		if ((local13 & 0x1) == 0) {
			if (this.anInt238 != -1 && this.anInt242 == arg2) {
				Static178.method2763(this.anInt238);
			} else {
				if (this.anInt238 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt238 = local32[0];
					this.anInt245 = Static163.anInt3218;
				}
				Static178.method2763(this.anInt238);
				if (this.aBoolean11 && Static58.method942()) {
					@Pc(64) float[] local64 = this.aClass4_Sub2_Sub17_1.method3417(arg0, arg2, arg2, arg1, this.aBoolean14);
					if (this.anInt239 == 2) {
						Static13.method218(Static144.anInt2927, Static144.anInt2933, arg2, arg2, Static144.anInt2930, Static144.anInt2940, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static163.anInt3221 += local64.length * 4 / 3 - this.anInt244;
						this.anInt244 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static163.anInt3221 += local64.length - this.anInt244;
						this.anInt244 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static178.aBoolean232 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass4_Sub2_Sub17_1.method3419(0.7D, arg0, arg2, arg2, arg1, this.aBoolean14);
					if (this.anInt239 == 2) {
						Static13.method222(Static144.anInt2927, Static144.anInt2930, arg2, arg2, Static144.anInt2931, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static163.anInt3221 += local160.length * 4 / 3 - this.anInt244;
						this.anInt244 = local160.length * 4 / 3;
					} else if (this.anInt239 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static163.anInt3221 += local160.length * 4 / 3 - this.anInt244;
								this.anInt244 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass4_Sub2_Sub17_1.method3419(0.7D, arg0, arg2, arg2, arg1, this.aBoolean14);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static163.anInt3221 += local160.length - this.anInt244;
						this.anInt244 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean9 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean10 ? 10497 : 33071);
				this.anInt242 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static178.method2754(this.anInt240);
		}
		if ((local13 & 0x4) == 0) {
			Static178.method2769(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt243 == 0 && this.anInt241 == 0) {
				Static178.method2791();
			} else {
				@Pc(367) float local367 = (float) (Static178.anInt3492 * this.anInt243) / (float) this.anInt242;
				@Pc(377) float local377 = (float) (Static178.anInt3492 * this.anInt241) / (float) this.anInt242;
				Static178.method2760(local377, local367, 0.0F);
			}
		}
		return true;
	}
}
