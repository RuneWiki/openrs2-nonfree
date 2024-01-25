import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public abstract class Class188 implements Interface20 {

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!kk;")
	private Class195 aClass195_9 = Class12_Sub2_Sub5_Sub2.lb;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!wu;")
	protected final Class366 aClass366_14;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "Lclient!bk;")
	protected final Class35 aClass35_19;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	protected final int anInt9239;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
	private final boolean aBoolean768;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Lclient!kd;")
	protected final Class162_Sub1_Sub2 aClass162_Sub1_Sub2_12;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
	private final int anInt9241;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	private int anInt9240;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!kd;ILclient!wu;Lclient!bk;IZ)V")
	protected Class188(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class366 arg2, @OriginalArg(3) Class35 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass366_14 = arg2;
		this.aClass35_19 = arg3;
		this.anInt9239 = arg1;
		this.aBoolean768 = arg5;
		this.aClass162_Sub1_Sub2_12 = arg0;
		this.anInt9241 = arg4;
		OpenGL.glGenTextures(1, Static322.anIntArray609, 0);
		this.anInt9240 = Static322.anIntArray609[0];
		this.method7376();
		this.method7378();
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	@Override
	public final void method7635() {
		@Pc(8) int local8 = this.aClass162_Sub1_Sub2_12.method3848();
		@Pc(14) int local14 = this.aClass162_Sub1_Sub2_12.anIntArray318[local8];
		if (this.anInt9239 != local14) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt9239);
			this.aClass162_Sub1_Sub2_12.anIntArray318[local8] = this.anInt9239;
		}
		OpenGL.glBindTexture(this.anInt9239, this.anInt9240);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	private void method7376() {
		this.aClass162_Sub1_Sub2_12.method3865(this);
		if (Class12_Sub2_Sub5_Sub2.lb == this.aClass195_9) {
			OpenGL.glTexParameteri(this.anInt9239, 10241, this.aBoolean768 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9239, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9239, 10241, this.aBoolean768 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9239, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!kb", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7383();
		super.finalize();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!kk;I)V")
	@Override
	public final void method7634(@OriginalArg(0) Class195 arg0) {
		if (this.aClass195_9 != arg0) {
			this.aClass195_9 = arg0;
			this.method7376();
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)I")
	protected final int method7377() {
		if (Static42.aClass35_4 == this.aClass35_19) {
			if (Static43.aClass366_2 == this.aClass366_14) {
				return 6407;
			}
			if (this.aClass366_14 == Static225.aClass366_3) {
				return 6408;
			}
			if (this.aClass366_14 == Static398.aClass366_10) {
				return 6406;
			}
			if (Static527.aClass366_12 == this.aClass366_14) {
				return 6409;
			}
			if (Static4.aClass366_1 == this.aClass366_14) {
				return 6410;
			}
			if (this.aClass366_14 == Static505.aClass366_11) {
				return 6145;
			}
		} else if (Static42.aClass35_7 == this.aClass35_19) {
			if (Static43.aClass366_2 == this.aClass366_14) {
				return 34843;
			}
			if (this.aClass366_14 == Static225.aClass366_3) {
				return 34842;
			}
			if (Static398.aClass366_10 == this.aClass366_14) {
				return 34844;
			}
			if (Static527.aClass366_12 == this.aClass366_14) {
				return 34846;
			}
			if (Static4.aClass366_1 == this.aClass366_14) {
				return 34847;
			}
			if (Static505.aClass366_11 == this.aClass366_14) {
				return 6145;
			}
		} else if (Static42.aClass35_8 == this.aClass35_19) {
			if (this.aClass366_14 == Static43.aClass366_2) {
				return 34837;
			}
			if (Static225.aClass366_3 == this.aClass366_14) {
				return 34836;
			}
			if (this.aClass366_14 == Static398.aClass366_10) {
				return 34838;
			}
			if (Static527.aClass366_12 == this.aClass366_14) {
				return 34840;
			}
			if (this.aClass366_14 == Static4.aClass366_1) {
				return 34841;
			}
			if (Static505.aClass366_11 == this.aClass366_14) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V")
	private void method7378() {
		this.aClass162_Sub1_Sub2_12.anInt4570 += this.method7381();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[FZII)V")
	protected final void method7379(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static259.method3656(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static259.method3656(arg2)) {
			@Pc(31) int local31 = this.aClass366_14.anInt9633;
			@Pc(33) int local33 = 0;
			@Pc(48) int local48 = arg2 <= arg0 ? arg2 : arg0;
			@Pc(52) int local52 = arg0 >> 1;
			@Pc(56) int local56 = arg2 >> 1;
			@Pc(58) float[] local58 = arg1;
			@Pc(65) float[] local65 = new float[local31 * local52 * local56];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local33, this.method7377(), arg0, arg2, 0, Static280.method4043(this.aClass366_14), 5126, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(90) int local90 = local31 * arg0;
				for (@Pc(92) int local92 = 0; local92 < local31; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(102) int local102 = local90 + local92;
					for (@Pc(104) int local104 = 0; local104 < local56; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local52; local108++) {
							@Pc(114) float local114 = local58[local98];
							local98 += local31;
							@Pc(124) float local124 = local114 + local58[local98];
							@Pc(130) float local130 = local124 + local58[local102];
							local98 += local31;
							local102 += local31;
							@Pc(144) float local144 = local130 + local58[local102];
							local65[local96] = local144 * 0.25F;
							local102 += local31;
							local96 += local31;
						}
						local102 += local90;
						local98 += local90;
					}
				}
				@Pc(188) float[] local188 = local65;
				local65 = local58;
				arg2 = local56;
				arg0 = local52;
				local58 = local188;
				local56 >>= 0x1;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local33++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I")
	private int method7381() {
		@Pc(14) int local14 = this.aClass366_14.anInt9633 * this.aClass35_19.anInt776 * this.anInt9241;
		return this.aBoolean768 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BIII)V")
	protected final void method7382(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > 0 && !Static259.method3656(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static259.method3656(arg2)) {
			@Pc(42) int local42 = this.aClass366_14.anInt9633;
			@Pc(44) int local44 = 0;
			@Pc(51) int local51 = arg2 > arg0 ? arg0 : arg2;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(61) byte[] local61 = arg1;
			@Pc(68) byte[] local68 = new byte[local59 * local55 * local42];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local44, this.method7377(), arg0, arg2, 0, Static280.method4043(this.aClass366_14), 5121, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(91) int local91 = arg0 * local42;
				for (@Pc(93) int local93 = 0; local93 < local42; local93++) {
					@Pc(97) int local97 = local93;
					@Pc(99) int local99 = local93;
					@Pc(103) int local103 = local91 + local93;
					for (@Pc(105) int local105 = 0; local105 < local59; local105++) {
						for (@Pc(109) int local109 = 0; local109 < local55; local109++) {
							@Pc(115) byte local115 = local61[local99];
							local99 += local42;
							@Pc(125) int local125 = local115 + local61[local99];
							local99 += local42;
							@Pc(135) int local135 = local125 + local61[local103];
							local103 += local42;
							@Pc(145) int local145 = local135 + local61[local103];
							local68[local97] = (byte) (local145 >> 2);
							local103 += local42;
							local97 += local42;
						}
						local99 += local91;
						local103 += local91;
					}
				}
				@Pc(186) byte[] local186 = local68;
				local68 = local61;
				arg2 = local59;
				arg0 = local55;
				local61 = local186;
				local59 >>= 0x1;
				local51 >>= 0x1;
				local44++;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	private void method7383() {
		if (this.anInt9240 > 0) {
			this.aClass162_Sub1_Sub2_12.method3962(this.anInt9240, this.method7381());
			this.anInt9240 = 0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([IIIII)V")
	protected final void method7384(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > 0 && !Static259.method3656(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static259.method3656(arg3)) {
			throw new IllegalArgumentException("");
		} else if (Static225.aClass366_3 == this.aClass366_14) {
			@Pc(43) int local43 = 0;
			@Pc(60) int local60 = arg2 >= arg3 ? arg3 : arg2;
			@Pc(64) int local64 = arg2 >> 1;
			@Pc(68) int local68 = arg3 >> 1;
			@Pc(70) int[] local70 = arg0;
			@Pc(75) int[] local75 = new int[local68 * local64];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local43, this.method7377(), arg2, arg3, 0, 32993, this.aClass162_Sub1_Sub2_12.anInt4711, local70, 0);
				if (local60 <= 1) {
					return;
				}
				@Pc(97) int local97 = 0;
				@Pc(99) int local99 = 0;
				@Pc(103) int local103 = arg2;
				for (@Pc(105) int local105 = 0; local105 < local68; local105++) {
					for (@Pc(109) int local109 = 0; local109 < local64; local109++) {
						@Pc(116) int local116 = local70[local99++];
						@Pc(121) int local121 = local70[local103++];
						@Pc(126) int local126 = local70[local99++];
						@Pc(132) int local132 = local116 >> 16 & 0xFF;
						@Pc(137) int local137 = local70[local103++];
						@Pc(143) int local143 = local116 >> 8 & 0xFF;
						@Pc(147) int local147 = local116 & 0xFF;
						@Pc(153) int local153 = local116 >> 24 & 0xFF;
						@Pc(161) int local161 = local153 + (local126 >> 24 & 0xFF);
						@Pc(169) int local169 = local132 + (local126 >> 16 & 0xFF);
						@Pc(175) int local175 = local147 + (local126 & 0xFF);
						@Pc(183) int local183 = local143 + (local126 >> 8 & 0xFF);
						@Pc(191) int local191 = local161 + (local121 >> 24 & 0xFF);
						@Pc(197) int local197 = local175 + (local121 & 0xFF);
						@Pc(205) int local205 = local169 + (local121 >> 16 & 0xFF);
						@Pc(213) int local213 = local183 + (local121 >> 8 & 0xFF);
						@Pc(221) int local221 = local213 + (local137 >> 8 & 0xFF);
						@Pc(227) int local227 = local197 + (local137 & 0xFF);
						@Pc(235) int local235 = local191 + (local137 >> 24 & 0xFF);
						@Pc(243) int local243 = local205 + (local137 >> 16 & 0xFF);
						local75[local97++] = local227 >> 2 & 0xFF | (local221 & 0x3FC) << 6 | (local235 & 0x3FC) << 22 | (local243 & 0x3FC) << 14;
					}
					local103 += arg2;
					local99 += arg2;
				}
				@Pc(292) int[] local292 = local75;
				local75 = local70;
				local70 = local292;
				arg2 = local64;
				arg3 = local68;
				local68 >>= 0x1;
				local60 >>= 0x1;
				local43++;
				local64 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
