import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class3_Sub4_Sub15 extends Class3_Sub4 {

	@OriginalMember(owner = "client!li", name = "B", descriptor = "I")
	private int anInt2967;

	@OriginalMember(owner = "client!li", name = "C", descriptor = "I")
	private int anInt2968;

	@OriginalMember(owner = "client!li", name = "I", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!li", name = "N", descriptor = "F")
	private float aFloat45;

	@OriginalMember(owner = "client!li", name = "G", descriptor = "I")
	private int anInt2970 = 0;

	@OriginalMember(owner = "client!li", name = "L", descriptor = "I")
	private int anInt2972 = -1;

	@OriginalMember(owner = "client!li", name = "P", descriptor = "Z")
	public boolean aBoolean211 = false;

	@OriginalMember(owner = "client!li", name = "J", descriptor = "Lclient!n;")
	public Class3_Sub4_Sub17 aClass3_Sub4_Sub17_1;

	@OriginalMember(owner = "client!li", name = "D", descriptor = "Z")
	private boolean aBoolean208;

	@OriginalMember(owner = "client!li", name = "T", descriptor = "Z")
	private boolean aBoolean213;

	@OriginalMember(owner = "client!li", name = "H", descriptor = "Z")
	private boolean aBoolean209;

	@OriginalMember(owner = "client!li", name = "S", descriptor = "Z")
	private boolean aBoolean212;

	@OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
	private int anInt2973;

	@OriginalMember(owner = "client!li", name = "R", descriptor = "I")
	private int anInt2974;

	@OriginalMember(owner = "client!li", name = "M", descriptor = "Z")
	private boolean aBoolean210;

	@OriginalMember(owner = "client!li", name = "E", descriptor = "I")
	private int anInt2969;

	@OriginalMember(owner = "client!li", name = "K", descriptor = "I")
	private int anInt2971;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class3_Sub4_Sub15(@OriginalArg(0) Class3_Sub26 arg0) {
		this.aClass3_Sub4_Sub17_1 = new Class3_Sub4_Sub17(arg0);
		this.aBoolean208 = arg0.method3915() == 1;
		this.aBoolean213 = arg0.method3915() == 1;
		this.aBoolean209 = arg0.method3915() == 1;
		this.aBoolean212 = arg0.method3915() == 1;
		@Pc(62) int local62 = arg0.method3915() & 0x3;
		this.anInt2973 = arg0.method3920();
		this.anInt2974 = arg0.method3920();
		@Pc(76) int local76 = arg0.method3915();
		arg0.method3915();
		this.aBoolean210 = arg0.method3915() == 1;
		this.anInt2969 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt2971 = 2;
		} else if (local62 == 2) {
			this.anInt2971 = 3;
		} else if (local62 == 3) {
			this.anInt2971 = 4;
		} else {
			this.anInt2971 = 0;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!be;Lclient!rn;I)Z")
	public boolean method2637(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass3_Sub4_Sub17_1.method2948(arg0, arg1)) {
			return false;
		}
		@Pc(10) GL local10 = Static283.aGL1;
		@Pc(13) int local13 = Static110.method1779();
		if ((local13 & 0x1) == 0) {
			if (this.anInt2972 != -1 && this.anInt2967 == arg2) {
				Static283.method4636(this.anInt2972);
			} else {
				if (this.anInt2972 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt2972 = local32[0];
					this.anInt2968 = Static189.anInt3719;
				}
				Static283.method4636(this.anInt2972);
				if (this.aBoolean210 && Static30.method461()) {
					@Pc(64) float[] local64 = this.aClass3_Sub4_Sub17_1.method2944(arg0, arg2, this.aBoolean213, arg2, arg1);
					if (this.anInt2969 == 2) {
						Static159.method2639(Static211.anInt4135, Static211.anInt4141, arg2, arg2, Static211.anInt4138, Static211.anInt4148, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static189.anInt3721 += local64.length * 4 / 3 - this.anInt2970;
						this.anInt2970 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static189.anInt3721 += local64.length - this.anInt2970;
						this.anInt2970 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static283.aBoolean403 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass3_Sub4_Sub17_1.method2947(arg2, arg1, 0.7D, arg0, this.aBoolean213, arg2);
					if (this.anInt2969 == 2) {
						Static159.method2642(Static211.anInt4135, Static211.anInt4138, arg2, arg2, Static211.anInt4139, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static189.anInt3721 += local160.length * 4 / 3 - this.anInt2970;
						this.anInt2970 = local160.length * 4 / 3;
					} else if (this.anInt2969 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static189.anInt3721 += local160.length * 4 / 3 - this.anInt2970;
								this.anInt2970 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass3_Sub4_Sub17_1.method2947(arg2, arg1, 0.7D, arg0, this.aBoolean213, arg2);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static189.anInt3721 += local160.length - this.anInt2970;
						this.anInt2970 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean209 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean212 ? 10497 : 33071);
				this.anInt2967 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static283.method4664(this.anInt2971);
		}
		if ((local13 & 0x4) == 0) {
			Static283.method4656(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt2974 == 0 && this.anInt2973 == 0) {
				Static283.method4655();
			} else {
				@Pc(367) float local367 = (float) (Static283.anInt5687 * this.anInt2974) / (float) this.anInt2967;
				@Pc(377) float local377 = (float) (Static283.anInt5687 * this.anInt2973) / (float) this.anInt2967;
				Static283.method4661(local377, local367, 0.0F);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!be;Lclient!rn;)Z")
	public boolean method2638(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class155 arg1) {
		return this.aClass3_Sub4_Sub17_1.method2948(arg0, arg1);
	}

	@OriginalMember(owner = "client!li", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2972 != -1) {
			Static189.method3151(this.anInt2972, this.anInt2970, this.anInt2968);
			this.anInt2972 = -1;
			this.anInt2970 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!be;Lclient!rn;Z)[I")
	public int[] method2641(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass3_Sub4_Sub17_1.method2948(arg0, arg1)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass3_Sub4_Sub17_1.method2946(arg0, arg1, false, local14, 1.0D, this.aBoolean213, local14);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!li", name = "f", descriptor = "(I)V")
	public void method2643(@OriginalArg(0) int arg0) {
		if (this.anIntArray345 == null || this.anInt2974 == 0 && this.anInt2973 == 0) {
			return;
		}
		if (Static159.anIntArray344 == null || Static159.anIntArray344.length < this.anIntArray345.length) {
			Static159.anIntArray344 = new int[this.anIntArray345.length];
		}
		@Pc(26) int local26 = this.anIntArray345.length;
		@Pc(31) int local31 = arg0 * this.anInt2973;
		@Pc(36) int local36 = this.anInt2967 - 1;
		@Pc(44) int local44 = this.anInt2967 * arg0 * this.anInt2974;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt2967) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt2967; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static159.anIntArray344[local69] = this.anIntArray345[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray345;
		this.anIntArray345 = Static159.anIntArray344;
		Static159.anIntArray344 = local95;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!be;Lclient!rn;FZ)[I")
	public int[] method2644(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray345 == null || this.aFloat45 != arg2) {
			if (!this.aClass3_Sub4_Sub17_1.method2948(arg0, arg1)) {
				return null;
			}
			this.anInt2967 = arg3 ? 64 : 128;
			this.anIntArray345 = this.aClass3_Sub4_Sub17_1.method2946(arg0, arg1, true, this.anInt2967, (double) arg2, this.aBoolean213, this.anInt2967);
			this.aFloat45 = arg2;
			if (this.aBoolean208) {
				@Pc(50) int[] local50 = new int[this.anInt2967];
				@Pc(54) int[] local54 = new int[this.anInt2967];
				@Pc(58) int[] local58 = new int[this.anInt2967];
				@Pc(65) int[] local65 = new int[this.anInt2967 * this.anInt2967];
				@Pc(68) int local68 = this.anInt2967;
				@Pc(71) int local71 = this.anInt2967;
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
						@Pc(103) int local103 = this.anIntArray345[local88];
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
						@Pc(268) int local268 = this.anIntArray345[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray345[local89];
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
				this.anIntArray345 = local65;
			}
		}
		return this.anIntArray345;
	}
}
