import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
	private int anInt4736;

	@OriginalMember(owner = "client!sl", name = "F", descriptor = "F")
	private float aFloat148;

	@OriginalMember(owner = "client!sl", name = "H", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
	private int anInt4738;

	@OriginalMember(owner = "client!sl", name = "C", descriptor = "I")
	private int anInt4735 = 0;

	@OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
	private int anInt4737 = -1;

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "Z")
	public boolean aBoolean324 = false;

	@OriginalMember(owner = "client!sl", name = "L", descriptor = "Lclient!kd;")
	public Class1_Sub2_Sub8 aClass1_Sub2_Sub8_1;

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "Z")
	private boolean aBoolean320;

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "Z")
	private boolean aBoolean321;

	@OriginalMember(owner = "client!sl", name = "K", descriptor = "Z")
	private boolean aBoolean323;

	@OriginalMember(owner = "client!sl", name = "G", descriptor = "Z")
	private boolean aBoolean322;

	@OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
	private int anInt4734;

	@OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
	private int anInt4739;

	@OriginalMember(owner = "client!sl", name = "N", descriptor = "Z")
	private boolean aBoolean325;

	@OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
	private int anInt4740;

	@OriginalMember(owner = "client!sl", name = "A", descriptor = "I")
	private int anInt4733;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class1_Sub2_Sub19(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aClass1_Sub2_Sub8_1 = new Class1_Sub2_Sub8(arg0);
		this.aBoolean320 = arg0.method1378() == 1;
		this.aBoolean321 = arg0.method1378() == 1;
		this.aBoolean323 = arg0.method1378() == 1;
		this.aBoolean322 = arg0.method1378() == 1;
		@Pc(62) int local62 = arg0.method1378() & 0x3;
		this.anInt4734 = arg0.method1363();
		this.anInt4739 = arg0.method1363();
		@Pc(76) int local76 = arg0.method1378();
		arg0.method1378();
		this.aBoolean325 = arg0.method1378() == 1;
		this.anInt4740 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt4733 = 2;
		} else if (local62 == 2) {
			this.anInt4733 = 3;
		} else if (local62 == 3) {
			this.anInt4733 = 4;
		} else {
			this.anInt4733 = 0;
		}
	}

	@OriginalMember(owner = "client!sl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt4737 != -1) {
			Static10.method130(this.anInt4737, this.anInt4735, this.anInt4736);
			this.anInt4737 = -1;
			this.anInt4735 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ce;Lclient!nk;Z)[I")
	public int[] method4108(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass1_Sub2_Sub8_1.method2455(arg1, arg0)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass1_Sub2_Sub8_1.method2464(this.aBoolean321, local14, false, arg1, 1.0D, arg0, local14);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ce;Lclient!nk;)Z")
	public boolean method4109(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class121 arg1) {
		return this.aClass1_Sub2_Sub8_1.method2455(arg1, arg0);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ce;Lclient!nk;FZ)[I")
	public int[] method4110(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray417 == null || this.aFloat148 != arg2) {
			if (!this.aClass1_Sub2_Sub8_1.method2455(arg1, arg0)) {
				return null;
			}
			this.anInt4738 = arg3 ? 64 : 128;
			this.anIntArray417 = this.aClass1_Sub2_Sub8_1.method2464(this.aBoolean321, this.anInt4738, true, arg1, (double) arg2, arg0, this.anInt4738);
			this.aFloat148 = arg2;
			if (this.aBoolean320) {
				@Pc(50) int[] local50 = new int[this.anInt4738];
				@Pc(54) int[] local54 = new int[this.anInt4738];
				@Pc(58) int[] local58 = new int[this.anInt4738];
				@Pc(65) int[] local65 = new int[this.anInt4738 * this.anInt4738];
				@Pc(68) int local68 = this.anInt4738;
				@Pc(71) int local71 = this.anInt4738;
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
						@Pc(103) int local103 = this.anIntArray417[local88];
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
						@Pc(268) int local268 = this.anIntArray417[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray417[local89];
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
				this.anIntArray417 = local65;
			}
		}
		return this.anIntArray417;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ce;Lclient!nk;I)Z")
	public boolean method4111(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass1_Sub2_Sub8_1.method2455(arg1, arg0)) {
			return false;
		}
		@Pc(10) GL local10 = Static156.aGL1;
		@Pc(13) int local13 = Static45.method884();
		if ((local13 & 0x1) == 0) {
			if (this.anInt4737 != -1 && this.anInt4738 == arg2) {
				Static156.method2699(this.anInt4737);
			} else {
				if (this.anInt4737 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt4737 = local32[0];
					this.anInt4736 = Static10.anInt142;
				}
				Static156.method2699(this.anInt4737);
				if (this.aBoolean325 && Static177.method2959()) {
					@Pc(64) float[] local64 = this.aClass1_Sub2_Sub8_1.method2458(arg1, arg0, arg2, arg2, this.aBoolean321);
					if (this.anInt4740 == 2) {
						Static260.method4113(Static121.anInt2511, Static121.anInt2517, arg2, arg2, Static121.anInt2514, Static121.anInt2524, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static10.anInt141 += local64.length * 4 / 3 - this.anInt4735;
						this.anInt4735 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static10.anInt141 += local64.length - this.anInt4735;
						this.anInt4735 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static156.aBoolean212 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass1_Sub2_Sub8_1.method2460(arg0, arg1, this.aBoolean321, 0.7D, arg2, arg2);
					if (this.anInt4740 == 2) {
						Static260.method4107(Static121.anInt2511, Static121.anInt2514, arg2, arg2, Static121.anInt2515, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static10.anInt141 += local160.length * 4 / 3 - this.anInt4735;
						this.anInt4735 = local160.length * 4 / 3;
					} else if (this.anInt4740 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static10.anInt141 += local160.length * 4 / 3 - this.anInt4735;
								this.anInt4735 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass1_Sub2_Sub8_1.method2460(arg0, arg1, this.aBoolean321, 0.7D, arg2, arg2);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static10.anInt141 += local160.length - this.anInt4735;
						this.anInt4735 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean323 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean322 ? 10497 : 33071);
				this.anInt4738 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static156.method2695(this.anInt4733);
		}
		if ((local13 & 0x4) == 0) {
			Static156.method2681(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt4739 == 0 && this.anInt4734 == 0) {
				Static156.method2660();
			} else {
				@Pc(367) float local367 = (float) (Static156.anInt3082 * this.anInt4739) / (float) this.anInt4738;
				@Pc(377) float local377 = (float) (Static156.anInt3082 * this.anInt4734) / (float) this.anInt4738;
				Static156.method2693(local377, local367, 0.0F);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)V")
	public void method4112(@OriginalArg(0) int arg0) {
		if (this.anIntArray417 == null || this.anInt4739 == 0 && this.anInt4734 == 0) {
			return;
		}
		if (Static260.anIntArray418 == null || Static260.anIntArray418.length < this.anIntArray417.length) {
			Static260.anIntArray418 = new int[this.anIntArray417.length];
		}
		@Pc(26) int local26 = this.anIntArray417.length;
		@Pc(31) int local31 = arg0 * this.anInt4734;
		@Pc(36) int local36 = this.anInt4738 - 1;
		@Pc(44) int local44 = this.anInt4738 * arg0 * this.anInt4739;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt4738) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt4738; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static260.anIntArray418[local69] = this.anIntArray417[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray417;
		this.anIntArray417 = Static260.anIntArray418;
		Static260.anIntArray418 = local95;
	}
}
