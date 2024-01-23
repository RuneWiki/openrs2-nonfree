import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class1_Sub5_Sub17 extends Class1_Sub5 {

	@OriginalMember(owner = "client!pk", name = "H", descriptor = "F")
	private float aFloat75;

	@OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
	private int anInt4048;

	@OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
	private int anInt4050;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "[I")
	private int[] anIntArray456;

	@OriginalMember(owner = "client!pk", name = "F", descriptor = "Z")
	public boolean aBoolean362 = false;

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
	private int anInt4045 = 0;

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
	private int anInt4051 = -1;

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "Lclient!kg;")
	public Class1_Sub5_Sub10 aClass1_Sub5_Sub10_1;

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "Z")
	private boolean aBoolean363;

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "Z")
	private boolean aBoolean359;

	@OriginalMember(owner = "client!pk", name = "T", descriptor = "Z")
	private boolean aBoolean364;

	@OriginalMember(owner = "client!pk", name = "D", descriptor = "Z")
	private boolean aBoolean360;

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
	private int anInt4049;

	@OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
	private int anInt4047;

	@OriginalMember(owner = "client!pk", name = "E", descriptor = "Z")
	private boolean aBoolean361;

	@OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
	private int anInt4046;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
	private int anInt4052;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class1_Sub5_Sub17(@OriginalArg(0) Class1_Sub13 arg0) {
		this.aClass1_Sub5_Sub10_1 = new Class1_Sub5_Sub10(arg0);
		this.aBoolean363 = arg0.method1853() == 1;
		this.aBoolean359 = arg0.method1853() == 1;
		this.aBoolean364 = arg0.method1853() == 1;
		this.aBoolean360 = arg0.method1853() == 1;
		@Pc(62) int local62 = arg0.method1853() & 0x3;
		this.anInt4049 = arg0.method1829();
		this.anInt4047 = arg0.method1829();
		@Pc(76) int local76 = arg0.method1853();
		arg0.method1853();
		this.aBoolean361 = arg0.method1853() == 1;
		this.anInt4046 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt4052 = 2;
		} else if (local62 == 2) {
			this.anInt4052 = 3;
		} else if (local62 == 3) {
			this.anInt4052 = 4;
		} else {
			this.anInt4052 = 0;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!eh;Lclient!nm;Z)[I")
	public int[] method3512(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass1_Sub5_Sub10_1.method2506(arg1, arg0)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass1_Sub5_Sub10_1.method2510(false, local14, 1.0D, arg0, arg1, this.aBoolean359, local14);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V")
	public void method3514(@OriginalArg(0) int arg0) {
		if (this.anIntArray456 == null || this.anInt4047 == 0 && this.anInt4049 == 0) {
			return;
		}
		if (Static216.anIntArray455 == null || Static216.anIntArray455.length < this.anIntArray456.length) {
			Static216.anIntArray455 = new int[this.anIntArray456.length];
		}
		@Pc(26) int local26 = this.anIntArray456.length;
		@Pc(31) int local31 = arg0 * this.anInt4049;
		@Pc(36) int local36 = this.anInt4050 - 1;
		@Pc(44) int local44 = this.anInt4050 * arg0 * this.anInt4047;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt4050) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt4050; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static216.anIntArray455[local69] = this.anIntArray456[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray456;
		this.anIntArray456 = Static216.anIntArray455;
		Static216.anIntArray455 = local95;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!eh;Lclient!nm;)Z")
	public boolean method3515(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class119 arg1) {
		return this.aClass1_Sub5_Sub10_1.method2506(arg1, arg0);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!eh;Lclient!nm;FZ)[I")
	public int[] method3516(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray456 == null || this.aFloat75 != arg2) {
			if (!this.aClass1_Sub5_Sub10_1.method2506(arg1, arg0)) {
				return null;
			}
			this.anInt4050 = arg3 ? 64 : 128;
			this.anIntArray456 = this.aClass1_Sub5_Sub10_1.method2510(true, this.anInt4050, (double) arg2, arg0, arg1, this.aBoolean359, this.anInt4050);
			this.aFloat75 = arg2;
			if (this.aBoolean363) {
				@Pc(50) int[] local50 = new int[this.anInt4050];
				@Pc(54) int[] local54 = new int[this.anInt4050];
				@Pc(58) int[] local58 = new int[this.anInt4050];
				@Pc(65) int[] local65 = new int[this.anInt4050 * this.anInt4050];
				@Pc(68) int local68 = this.anInt4050;
				@Pc(71) int local71 = this.anInt4050;
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
						@Pc(103) int local103 = this.anIntArray456[local88];
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
						@Pc(268) int local268 = this.anIntArray456[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray456[local89];
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
				this.anIntArray456 = local65;
			}
		}
		return this.anIntArray456;
	}

	@OriginalMember(owner = "client!pk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt4051 != -1) {
			Static162.method2800(this.anInt4051, this.anInt4045, this.anInt4048);
			this.anInt4051 = -1;
			this.anInt4045 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!eh;Lclient!nm;I)Z")
	public boolean method3517(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass1_Sub5_Sub10_1.method2506(arg1, arg0)) {
			return false;
		}
		@Pc(10) GL local10 = Static71.aGL1;
		@Pc(13) int local13 = Static188.method3174();
		if ((local13 & 0x1) == 0) {
			if (this.anInt4051 != -1 && this.anInt4050 == arg2) {
				Static71.method1400(this.anInt4051);
			} else {
				if (this.anInt4051 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt4051 = local32[0];
					this.anInt4048 = Static162.anInt3245;
				}
				Static71.method1400(this.anInt4051);
				if (this.aBoolean361 && Static152.method2651()) {
					@Pc(64) float[] local64 = this.aClass1_Sub5_Sub10_1.method2501(this.aBoolean359, arg2, arg2, arg1, arg0);
					if (this.anInt4046 == 2) {
						Static216.method3511(Static157.anInt3127, Static157.anInt3133, arg2, arg2, Static157.anInt3130, Static157.anInt3140, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static162.anInt3246 += local64.length * 4 / 3 - this.anInt4045;
						this.anInt4045 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static162.anInt3246 += local64.length - this.anInt4045;
						this.anInt4045 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static71.aBoolean168 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass1_Sub5_Sub10_1.method2509(arg0, arg2, 0.7D, arg2, arg1, this.aBoolean359);
					if (this.anInt4046 == 2) {
						Static216.method3513(Static157.anInt3127, Static157.anInt3130, arg2, arg2, Static157.anInt3131, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static162.anInt3246 += local160.length * 4 / 3 - this.anInt4045;
						this.anInt4045 = local160.length * 4 / 3;
					} else if (this.anInt4046 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static162.anInt3246 += local160.length * 4 / 3 - this.anInt4045;
								this.anInt4045 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass1_Sub5_Sub10_1.method2509(arg0, arg2, 0.7D, arg2, arg1, this.aBoolean359);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static162.anInt3246 += local160.length - this.anInt4045;
						this.anInt4045 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean364 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean360 ? 10497 : 33071);
				this.anInt4050 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static71.method1392(this.anInt4052);
		}
		if ((local13 & 0x4) == 0) {
			Static71.method1380(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt4047 == 0 && this.anInt4049 == 0) {
				Static71.method1381();
			} else {
				@Pc(367) float local367 = (float) (Static71.anInt1545 * this.anInt4047) / (float) this.anInt4050;
				@Pc(377) float local377 = (float) (Static71.anInt1545 * this.anInt4049) / (float) this.anInt4050;
				Static71.method1409(local377, local367, 0.0F);
			}
		}
		return true;
	}
}
