import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class2_Sub8_Sub13 extends Class2_Sub8 {

	@OriginalMember(owner = "client!md", name = "w", descriptor = "I")
	private int anInt3780;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "F")
	private float aFloat41;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "I")
	private int anInt3783;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "[I")
	private int[] anIntArray371;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "I")
	private int anInt3781 = 0;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "I")
	private int anInt3784 = -1;

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Z")
	public boolean aBoolean255 = false;

	@OriginalMember(owner = "client!md", name = "E", descriptor = "Lclient!pl;")
	public Class2_Sub8_Sub18 aClass2_Sub8_Sub18_1;

	@OriginalMember(owner = "client!md", name = "B", descriptor = "Z")
	private boolean aBoolean250;

	@OriginalMember(owner = "client!md", name = "I", descriptor = "Z")
	private boolean aBoolean254;

	@OriginalMember(owner = "client!md", name = "C", descriptor = "Z")
	private boolean aBoolean251;

	@OriginalMember(owner = "client!md", name = "F", descriptor = "Z")
	private boolean aBoolean252;

	@OriginalMember(owner = "client!md", name = "G", descriptor = "I")
	private int anInt3785;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "I")
	private int anInt3779;

	@OriginalMember(owner = "client!md", name = "H", descriptor = "Z")
	private boolean aBoolean253;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "I")
	private int anInt3782;

	@OriginalMember(owner = "client!md", name = "M", descriptor = "I")
	private int anInt3786;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!oe;)V")
	public Class2_Sub8_Sub13(@OriginalArg(0) Class2_Sub16 arg0) {
		this.aClass2_Sub8_Sub18_1 = new Class2_Sub8_Sub18(arg0);
		this.aBoolean250 = arg0.method2146() == 1;
		this.aBoolean254 = arg0.method2146() == 1;
		this.aBoolean251 = arg0.method2146() == 1;
		this.aBoolean252 = arg0.method2146() == 1;
		@Pc(62) int local62 = arg0.method2146() & 0x3;
		this.anInt3785 = arg0.method2170();
		this.anInt3779 = arg0.method2170();
		@Pc(76) int local76 = arg0.method2146();
		arg0.method2146();
		this.aBoolean253 = arg0.method2146() == 1;
		this.anInt3782 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt3786 = 2;
		} else if (local62 == 2) {
			this.anInt3786 = 3;
		} else if (local62 == 3) {
			this.anInt3786 = 4;
		} else {
			this.anInt3786 = 0;
		}
	}

	@OriginalMember(owner = "client!md", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3784 != -1) {
			Static124.method2212(this.anInt3784, this.anInt3781, this.anInt3783);
			this.anInt3784 = -1;
			this.anInt3781 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!li;Lclient!ek;I)Z")
	public boolean method3112(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass2_Sub8_Sub18_1.method3637(arg1, arg0)) {
			return false;
		}
		@Pc(10) GL local10 = Static116.aGL1;
		@Pc(13) int local13 = Static141.method2502();
		if ((local13 & 0x1) == 0) {
			if (this.anInt3784 != -1 && this.anInt3780 == arg2) {
				Static116.method1945(this.anInt3784);
			} else {
				if (this.anInt3784 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt3784 = local32[0];
					this.anInt3783 = Static124.anInt2871;
				}
				Static116.method1945(this.anInt3784);
				if (this.aBoolean253 && Static288.method4475()) {
					@Pc(64) float[] local64 = this.aClass2_Sub8_Sub18_1.method3630(arg2, arg1, this.aBoolean254, arg2, arg0);
					if (this.anInt3782 == 2) {
						Static172.method3110(Static298.anInt5768, Static298.anInt5774, arg2, arg2, Static298.anInt5771, Static298.anInt5781, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static124.anInt2872 += local64.length * 4 / 3 - this.anInt3781;
						this.anInt3781 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static124.anInt2872 += local64.length - this.anInt3781;
						this.anInt3781 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static116.aBoolean180 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass2_Sub8_Sub18_1.method3635(arg1, arg0, arg2, 0.7D, arg2, this.aBoolean254);
					if (this.anInt3782 == 2) {
						Static172.method3115(Static298.anInt5768, Static298.anInt5771, arg2, arg2, Static298.anInt5772, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static124.anInt2872 += local160.length * 4 / 3 - this.anInt3781;
						this.anInt3781 = local160.length * 4 / 3;
					} else if (this.anInt3782 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static124.anInt2872 += local160.length * 4 / 3 - this.anInt3781;
								this.anInt3781 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass2_Sub8_Sub18_1.method3635(arg1, arg0, arg2, 0.7D, arg2, this.aBoolean254);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static124.anInt2872 += local160.length - this.anInt3781;
						this.anInt3781 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean251 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean252 ? 10497 : 33071);
				this.anInt3780 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static116.method1977(this.anInt3786);
		}
		if ((local13 & 0x4) == 0) {
			Static116.method1976(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt3779 == 0 && this.anInt3785 == 0) {
				Static116.method1960();
			} else {
				@Pc(367) float local367 = (float) (Static116.anInt2602 * this.anInt3779) / (float) this.anInt3780;
				@Pc(377) float local377 = (float) (Static116.anInt2602 * this.anInt3785) / (float) this.anInt3780;
				Static116.method1944(local377, local367, 0.0F);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
	public void method3113(@OriginalArg(0) int arg0) {
		if (this.anIntArray371 == null || this.anInt3779 == 0 && this.anInt3785 == 0) {
			return;
		}
		if (Static172.anIntArray370 == null || Static172.anIntArray370.length < this.anIntArray371.length) {
			Static172.anIntArray370 = new int[this.anIntArray371.length];
		}
		@Pc(26) int local26 = this.anIntArray371.length;
		@Pc(31) int local31 = arg0 * this.anInt3785;
		@Pc(36) int local36 = this.anInt3780 - 1;
		@Pc(44) int local44 = this.anInt3780 * arg0 * this.anInt3779;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt3780) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt3780; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static172.anIntArray370[local69] = this.anIntArray371[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray371;
		this.anIntArray371 = Static172.anIntArray370;
		Static172.anIntArray370 = local95;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!li;Lclient!ek;Z)[I")
	public int[] method3114(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass2_Sub8_Sub18_1.method3637(arg1, arg0)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass2_Sub8_Sub18_1.method3632(false, 1.0D, arg0, this.aBoolean254, arg1, local14, local14);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!li;Lclient!ek;)Z")
	public boolean method3116(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class42 arg1) {
		return this.aClass2_Sub8_Sub18_1.method3637(arg1, arg0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!li;Lclient!ek;FZ)[I")
	public int[] method3117(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray371 == null || this.aFloat41 != arg2) {
			if (!this.aClass2_Sub8_Sub18_1.method3637(arg1, arg0)) {
				return null;
			}
			this.anInt3780 = arg3 ? 64 : 128;
			this.anIntArray371 = this.aClass2_Sub8_Sub18_1.method3632(true, (double) arg2, arg0, this.aBoolean254, arg1, this.anInt3780, this.anInt3780);
			this.aFloat41 = arg2;
			if (this.aBoolean250) {
				@Pc(50) int[] local50 = new int[this.anInt3780];
				@Pc(54) int[] local54 = new int[this.anInt3780];
				@Pc(58) int[] local58 = new int[this.anInt3780];
				@Pc(65) int[] local65 = new int[this.anInt3780 * this.anInt3780];
				@Pc(68) int local68 = this.anInt3780;
				@Pc(71) int local71 = this.anInt3780;
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
						@Pc(103) int local103 = this.anIntArray371[local88];
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
						@Pc(268) int local268 = this.anIntArray371[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray371[local89];
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
				this.anIntArray371 = local65;
			}
		}
		return this.anIntArray371;
	}
}
