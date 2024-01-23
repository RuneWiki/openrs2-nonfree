import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
	private int anInt2353;

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
	private int anInt2355;

	@OriginalMember(owner = "client!ia", name = "Q", descriptor = "F")
	private float aFloat81;

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
	private int anInt2351 = -1;

	@OriginalMember(owner = "client!ia", name = "J", descriptor = "Z")
	public boolean aBoolean131 = false;

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
	private int anInt2356 = 0;

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "Lclient!ef;")
	public Class1_Sub2_Sub5 aClass1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ia", name = "N", descriptor = "Z")
	private boolean aBoolean132;

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "Z")
	private boolean aBoolean129;

	@OriginalMember(owner = "client!ia", name = "B", descriptor = "Z")
	private boolean aBoolean128;

	@OriginalMember(owner = "client!ia", name = "P", descriptor = "Z")
	private boolean aBoolean133;

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
	private int anInt2354;

	@OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
	private int anInt2358;

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "Z")
	private boolean aBoolean130;

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
	private int anInt2352;

	@OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
	private int anInt2357;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!im;)V")
	public Class1_Sub2_Sub10(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aClass1_Sub2_Sub5_1 = new Class1_Sub2_Sub5(arg0);
		this.aBoolean132 = arg0.method2655() == 1;
		this.aBoolean129 = arg0.method2655() == 1;
		this.aBoolean128 = arg0.method2655() == 1;
		this.aBoolean133 = arg0.method2655() == 1;
		@Pc(62) int local62 = arg0.method2655() & 0x3;
		this.anInt2354 = arg0.method2633();
		this.anInt2358 = arg0.method2633();
		@Pc(76) int local76 = arg0.method2655();
		arg0.method2655();
		this.aBoolean130 = arg0.method2655() == 1;
		this.anInt2352 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt2357 = 2;
		} else if (local62 == 2) {
			this.anInt2357 = 3;
		} else if (local62 == 3) {
			this.anInt2357 = 4;
		} else {
			this.anInt2357 = 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	public void method1771(@OriginalArg(0) int arg0) {
		if (this.anIntArray237 == null || this.anInt2358 == 0 && this.anInt2354 == 0) {
			return;
		}
		if (Static109.anIntArray238 == null || Static109.anIntArray238.length < this.anIntArray237.length) {
			Static109.anIntArray238 = new int[this.anIntArray237.length];
		}
		@Pc(26) int local26 = this.anIntArray237.length;
		@Pc(31) int local31 = arg0 * this.anInt2354;
		@Pc(36) int local36 = this.anInt2355 - 1;
		@Pc(44) int local44 = this.anInt2355 * arg0 * this.anInt2358;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt2355) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt2355; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static109.anIntArray238[local69] = this.anIntArray237[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray237;
		this.anIntArray237 = Static109.anIntArray238;
		Static109.anIntArray238 = local95;
	}

	@OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2351 != -1) {
			Static237.method4089(this.anInt2351, this.anInt2356, this.anInt2353);
			this.anInt2351 = -1;
			this.anInt2356 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!mn;Lclient!kb;)Z")
	public boolean method1773(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class83 arg1) {
		return this.aClass1_Sub2_Sub5_1.method1162(arg1, arg0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!mn;Lclient!kb;I)Z")
	public boolean method1774(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass1_Sub2_Sub5_1.method1162(arg1, arg0)) {
			return false;
		}
		@Pc(10) GL local10 = Static296.aGL1;
		@Pc(13) int local13 = Static285.method4695();
		if ((local13 & 0x1) == 0) {
			if (this.anInt2351 != -1 && this.anInt2355 == arg2) {
				Static296.method4812(this.anInt2351);
			} else {
				if (this.anInt2351 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt2351 = local32[0];
					this.anInt2353 = Static237.anInt5216;
				}
				Static296.method4812(this.anInt2351);
				if (this.aBoolean130 && Static214.method3746()) {
					@Pc(64) float[] local64 = this.aClass1_Sub2_Sub5_1.method1160(arg0, this.aBoolean129, arg2, arg2, arg1);
					if (this.anInt2352 == 2) {
						Static109.method1778(Static297.anInt6216, Static297.anInt6222, arg2, arg2, Static297.anInt6219, Static297.anInt6229, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static237.anInt5215 += local64.length * 4 / 3 - this.anInt2356;
						this.anInt2356 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static237.anInt5215 += local64.length - this.anInt2356;
						this.anInt2356 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static296.aBoolean344 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass1_Sub2_Sub5_1.method1158(arg2, 0.7D, arg2, this.aBoolean129, arg1, arg0);
					if (this.anInt2352 == 2) {
						Static109.method1777(Static297.anInt6216, Static297.anInt6219, arg2, arg2, Static297.anInt6220, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static237.anInt5215 += local160.length * 4 / 3 - this.anInt2356;
						this.anInt2356 = local160.length * 4 / 3;
					} else if (this.anInt2352 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static237.anInt5215 += local160.length * 4 / 3 - this.anInt2356;
								this.anInt2356 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass1_Sub2_Sub5_1.method1158(arg2, 0.7D, arg2, this.aBoolean129, arg1, arg0);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static237.anInt5215 += local160.length - this.anInt2356;
						this.anInt2356 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean128 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean133 ? 10497 : 33071);
				this.anInt2355 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static296.method4805(this.anInt2357);
		}
		if ((local13 & 0x4) == 0) {
			Static296.method4823(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt2358 == 0 && this.anInt2354 == 0) {
				Static296.method4811();
			} else {
				@Pc(367) float local367 = (float) (Static296.anInt6203 * this.anInt2358) / (float) this.anInt2355;
				@Pc(377) float local377 = (float) (Static296.anInt6203 * this.anInt2354) / (float) this.anInt2355;
				Static296.method4810(local377, local367, 0.0F);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!mn;Lclient!kb;FZ)[I")
	public int[] method1775(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray237 == null || this.aFloat81 != arg2) {
			if (!this.aClass1_Sub2_Sub5_1.method1162(arg1, arg0)) {
				return null;
			}
			this.anInt2355 = arg3 ? 64 : 128;
			this.anIntArray237 = this.aClass1_Sub2_Sub5_1.method1155(arg0, true, this.aBoolean129, (double) arg2, this.anInt2355, this.anInt2355, arg1);
			this.aFloat81 = arg2;
			if (this.aBoolean132) {
				@Pc(50) int[] local50 = new int[this.anInt2355];
				@Pc(54) int[] local54 = new int[this.anInt2355];
				@Pc(58) int[] local58 = new int[this.anInt2355];
				@Pc(65) int[] local65 = new int[this.anInt2355 * this.anInt2355];
				@Pc(68) int local68 = this.anInt2355;
				@Pc(71) int local71 = this.anInt2355;
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
						@Pc(103) int local103 = this.anIntArray237[local88];
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
						@Pc(268) int local268 = this.anIntArray237[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray237[local89];
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
				this.anIntArray237 = local65;
			}
		}
		return this.anIntArray237;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!mn;Lclient!kb;Z)[I")
	public int[] method1776(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass1_Sub2_Sub5_1.method1162(arg1, arg0)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass1_Sub2_Sub5_1.method1155(arg0, false, this.aBoolean129, 1.0D, local14, local14, arg1);
		} else {
			return null;
		}
	}
}
