import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class4_Sub2_Sub21 extends Class4_Sub2 {

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
	private int anInt5376;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "[I")
	private int[] anIntArray421;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
	private int anInt5378;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "F")
	private float aFloat152;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
	private int anInt5375 = 0;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
	private int anInt5373 = -1;

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "Z")
	public boolean aBoolean360 = false;

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "Lclient!kj;")
	public Class4_Sub2_Sub12 aClass4_Sub2_Sub12_1;

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "Z")
	private boolean aBoolean357;

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "Z")
	private boolean aBoolean358;

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "Z")
	private boolean aBoolean359;

	@OriginalMember(owner = "client!uc", name = "O", descriptor = "Z")
	private boolean aBoolean361;

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
	private int anInt5377;

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
	private int anInt5379;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "Z")
	private boolean aBoolean356;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
	private int anInt5372;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
	private int anInt5374;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class4_Sub2_Sub21(@OriginalArg(0) Class4_Sub24 arg0) {
		this.aClass4_Sub2_Sub12_1 = new Class4_Sub2_Sub12(arg0);
		this.aBoolean357 = arg0.method3110() == 1;
		this.aBoolean358 = arg0.method3110() == 1;
		this.aBoolean359 = arg0.method3110() == 1;
		this.aBoolean361 = arg0.method3110() == 1;
		@Pc(62) int local62 = arg0.method3110() & 0x3;
		this.anInt5377 = arg0.method3069();
		this.anInt5379 = arg0.method3069();
		@Pc(76) int local76 = arg0.method3110();
		arg0.method3110();
		this.aBoolean356 = arg0.method3110() == 1;
		this.anInt5372 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt5374 = 2;
		} else if (local62 == 2) {
			this.anInt5374 = 3;
		} else if (local62 == 3) {
			this.anInt5374 = 4;
		} else {
			this.anInt5374 = 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt5373 != -1) {
			Static239.method3679(this.anInt5373, this.anInt5375, this.anInt5376);
			this.anInt5373 = -1;
			this.anInt5375 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!mh;Lclient!cg;I)Z")
	public boolean method4254(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass4_Sub2_Sub12_1.method2319(arg1, arg0)) {
			return false;
		}
		@Pc(10) GL local10 = Static251.aGL1;
		@Pc(13) int local13 = Static238.method3143();
		if ((local13 & 0x1) == 0) {
			if (this.anInt5373 != -1 && this.anInt5378 == arg2) {
				Static251.method3892(this.anInt5373);
			} else {
				if (this.anInt5373 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt5373 = local32[0];
					this.anInt5376 = Static239.anInt4726;
				}
				Static251.method3892(this.anInt5373);
				if (this.aBoolean356 && Static281.method4369()) {
					@Pc(64) float[] local64 = this.aClass4_Sub2_Sub12_1.method2323(arg0, arg2, arg1, arg2, this.aBoolean358);
					if (this.anInt5372 == 2) {
						Static270.method4252(Static206.anInt4053, Static206.anInt4059, arg2, arg2, Static206.anInt4056, Static206.anInt4066, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static239.anInt4728 += local64.length * 4 / 3 - this.anInt5375;
						this.anInt5375 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static239.anInt4728 += local64.length - this.anInt5375;
						this.anInt5375 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static251.aBoolean314 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass4_Sub2_Sub12_1.method2325(this.aBoolean358, arg1, arg0, arg2, 0.7D, arg2);
					if (this.anInt5372 == 2) {
						Static270.method4259(Static206.anInt4053, Static206.anInt4056, arg2, arg2, Static206.anInt4057, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static239.anInt4728 += local160.length * 4 / 3 - this.anInt5375;
						this.anInt5375 = local160.length * 4 / 3;
					} else if (this.anInt5372 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static239.anInt4728 += local160.length * 4 / 3 - this.anInt5375;
								this.anInt5375 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass4_Sub2_Sub12_1.method2325(this.aBoolean358, arg1, arg0, arg2, 0.7D, arg2);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static239.anInt4728 += local160.length - this.anInt5375;
						this.anInt5375 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean359 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean361 ? 10497 : 33071);
				this.anInt5378 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static251.method3870(this.anInt5374);
		}
		if ((local13 & 0x4) == 0) {
			Static251.method3851(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt5379 == 0 && this.anInt5377 == 0) {
				Static251.method3873();
			} else {
				@Pc(367) float local367 = (float) (Static251.anInt4930 * this.anInt5379) / (float) this.anInt5378;
				@Pc(377) float local377 = (float) (Static251.anInt4930 * this.anInt5377) / (float) this.anInt5378;
				Static251.method3879(local377, local367, 0.0F);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!mh;Lclient!cg;Z)[I")
	public int[] method4255(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass4_Sub2_Sub12_1.method2319(arg1, arg0)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass4_Sub2_Sub12_1.method2322(1.0D, local14, false, arg0, this.aBoolean358, local14, arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	public void method4256(@OriginalArg(0) int arg0) {
		if (this.anIntArray421 == null || this.anInt5379 == 0 && this.anInt5377 == 0) {
			return;
		}
		if (Static270.anIntArray420 == null || Static270.anIntArray420.length < this.anIntArray421.length) {
			Static270.anIntArray420 = new int[this.anIntArray421.length];
		}
		@Pc(26) int local26 = this.anIntArray421.length;
		@Pc(31) int local31 = arg0 * this.anInt5377;
		@Pc(36) int local36 = this.anInt5378 - 1;
		@Pc(44) int local44 = this.anInt5378 * arg0 * this.anInt5379;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt5378) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt5378; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static270.anIntArray420[local69] = this.anIntArray421[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray421;
		this.anIntArray421 = Static270.anIntArray420;
		Static270.anIntArray420 = local95;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!mh;Lclient!cg;FZ)[I")
	public int[] method4257(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray421 == null || this.aFloat152 != arg2) {
			if (!this.aClass4_Sub2_Sub12_1.method2319(arg1, arg0)) {
				return null;
			}
			this.anInt5378 = arg3 ? 64 : 128;
			this.anIntArray421 = this.aClass4_Sub2_Sub12_1.method2322((double) arg2, this.anInt5378, true, arg0, this.aBoolean358, this.anInt5378, arg1);
			this.aFloat152 = arg2;
			if (this.aBoolean357) {
				@Pc(50) int[] local50 = new int[this.anInt5378];
				@Pc(54) int[] local54 = new int[this.anInt5378];
				@Pc(58) int[] local58 = new int[this.anInt5378];
				@Pc(65) int[] local65 = new int[this.anInt5378 * this.anInt5378];
				@Pc(68) int local68 = this.anInt5378;
				@Pc(71) int local71 = this.anInt5378;
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
						@Pc(103) int local103 = this.anIntArray421[local88];
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
						@Pc(268) int local268 = this.anIntArray421[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray421[local89];
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
				this.anIntArray421 = local65;
			}
		}
		return this.anIntArray421;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!mh;Lclient!cg;)Z")
	public boolean method4258(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class22 arg1) {
		return this.aClass4_Sub2_Sub12_1.method2319(arg1, arg0);
	}
}
