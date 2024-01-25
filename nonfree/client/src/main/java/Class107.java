import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public abstract class Class107 implements Interface5 {

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "Lclient!rha;")
	private Class315 aClass315_11 = Static100.aClass315_2;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "Z")
	private final boolean aBoolean774;

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "Lclient!fc;")
	protected final Class101_Sub1_Sub1 aClass101_Sub1_Sub1_12;

	@OriginalMember(owner = "client!wo", name = "y", descriptor = "I")
	protected final int anInt10614;

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "Lclient!dr;")
	protected final Class79 aClass79_19;

	@OriginalMember(owner = "client!wo", name = "A", descriptor = "I")
	private final int anInt10616;

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "Lclient!nea;")
	protected final Class244 aClass244_14;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
	private int anInt10605;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!fc;ILclient!nea;Lclient!dr;IZ)V")
	protected Class107(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class244 arg2, @OriginalArg(3) Class79 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean774 = arg5;
		this.aClass101_Sub1_Sub1_12 = arg0;
		this.anInt10614 = arg1;
		this.aClass79_19 = arg3;
		this.anInt10616 = arg4;
		this.aClass244_14 = arg2;
		OpenGL.glGenTextures(1, Static94.anIntArray84, 0);
		this.anInt10605 = Static94.anIntArray84[0];
		this.method9091();
		this.method9093();
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)V")
	private void method9091() {
		this.aClass101_Sub1_Sub1_12.method5909(this);
		if (Static100.aClass315_2 == this.aClass315_11) {
			OpenGL.glTexParameteri(this.anInt10614, 10241, this.aBoolean774 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10614, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10614, 10241, this.aBoolean774 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10614, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	@Override
	public final void method9326() {
		@Pc(8) int local8 = this.aClass101_Sub1_Sub1_12.method5874();
		@Pc(14) int local14 = this.aClass101_Sub1_Sub1_12.anIntArray163[local8];
		if (this.anInt10614 != local14) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt10614);
			this.aClass101_Sub1_Sub1_12.anIntArray163[local8] = this.anInt10614;
		}
		OpenGL.glBindTexture(this.anInt10614, this.anInt10605);
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)I")
	protected final int method9092() {
		if (Static114.aClass79_7 == this.aClass79_19) {
			if (this.aClass244_14 == Static142.aClass244_5) {
				return 6407;
			}
			if (Static584.aClass244_9 == this.aClass244_14) {
				return 6408;
			}
			if (this.aClass244_14 == Static612.aClass244_15) {
				return 6406;
			}
			if (this.aClass244_14 == Static314.aClass244_12) {
				return 6409;
			}
			if (this.aClass244_14 == Static105.aClass244_4) {
				return 6410;
			}
			if (this.aClass244_14 == Static412.aClass244_13) {
				return 6145;
			}
		} else if (Static114.aClass79_10 == this.aClass79_19) {
			if (Static142.aClass244_5 == this.aClass244_14) {
				return 34843;
			}
			if (Static584.aClass244_9 == this.aClass244_14) {
				return 34842;
			}
			if (Static612.aClass244_15 == this.aClass244_14) {
				return 34844;
			}
			if (Static314.aClass244_12 == this.aClass244_14) {
				return 34846;
			}
			if (Static105.aClass244_4 == this.aClass244_14) {
				return 34847;
			}
			if (this.aClass244_14 == Static412.aClass244_13) {
				return 6145;
			}
		} else if (this.aClass79_19 == Static114.aClass79_11) {
			if (Static142.aClass244_5 == this.aClass244_14) {
				return 34837;
			}
			if (Static584.aClass244_9 == this.aClass244_14) {
				return 34836;
			}
			if (Static612.aClass244_15 == this.aClass244_14) {
				return 34838;
			}
			if (this.aClass244_14 == Static314.aClass244_12) {
				return 34840;
			}
			if (Static105.aClass244_4 == this.aClass244_14) {
				return 34841;
			}
			if (Static412.aClass244_13 == this.aClass244_14) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V")
	private void method9093() {
		this.aClass101_Sub1_Sub1_12.anInt6614 += this.method9099();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIII[F)V")
	protected final void method9095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3) {
		if (arg1 > 0 && !Static100.method1457(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static100.method1457(arg0)) {
			@Pc(35) int local35 = this.aClass244_14.anInt7387;
			@Pc(37) int local37 = 0;
			@Pc(48) int local48 = arg0 <= arg1 ? arg0 : arg1;
			@Pc(52) int local52 = arg1 >> 1;
			@Pc(56) int local56 = arg0 >> 1;
			@Pc(58) float[] local58 = arg3;
			@Pc(65) float[] local65 = new float[local56 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local37, this.method9092(), arg1, arg0, 0, Static410.method6767(this.aClass244_14), 5126, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(91) int local91 = local35 * arg1;
				for (@Pc(93) int local93 = 0; local93 < local35; local93++) {
					@Pc(97) int local97 = local93;
					@Pc(99) int local99 = local93;
					@Pc(103) int local103 = local93 + local91;
					for (@Pc(105) int local105 = 0; local105 < local56; local105++) {
						for (@Pc(109) int local109 = 0; local109 < local52; local109++) {
							@Pc(115) float local115 = local58[local99];
							local99 += local35;
							@Pc(125) float local125 = local115 + local58[local99];
							@Pc(131) float local131 = local125 + local58[local103];
							local99 += local35;
							local103 += local35;
							@Pc(145) float local145 = local131 + local58[local103];
							local65[local97] = local145 * 0.25F;
							local103 += local35;
							local97 += local35;
						}
						local103 += local91;
						local99 += local91;
					}
				}
				@Pc(185) float[] local185 = local65;
				local65 = local58;
				arg0 = local56;
				local58 = local185;
				arg1 = local52;
				local37++;
				local52 >>= 0x1;
				local56 >>= 0x1;
				local48 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(B)V")
	private void method9096() {
		if (this.anInt10605 > 0) {
			this.aClass101_Sub1_Sub1_12.method3143(this.method9099(), this.anInt10605);
			this.anInt10605 = 0;
		}
	}

	@OriginalMember(owner = "client!wo", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9096();
		super.finalize();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[BIII)V")
	protected final void method9097(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static100.method1457(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static100.method1457(arg3)) {
			@Pc(40) int local40 = this.aClass244_14.anInt7387;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg0 >= arg3 ? arg3 : arg0;
			@Pc(53) int local53 = arg0 >> 1;
			@Pc(57) int local57 = arg3 >> 1;
			@Pc(59) byte[] local59 = arg1;
			@Pc(66) byte[] local66 = new byte[local53 * local57 * local40];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local42, this.method9092(), arg0, arg3, 0, Static410.method6767(this.aClass244_14), 5121, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(92) int local92 = local40 * arg0;
				for (@Pc(94) int local94 = 0; local94 < local40; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(104) int local104 = local92 + local94;
					for (@Pc(106) int local106 = 0; local106 < local57; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local53; local110++) {
							@Pc(116) byte local116 = local59[local100];
							local100 += local40;
							@Pc(126) int local126 = local116 + local59[local100];
							local100 += local40;
							@Pc(136) int local136 = local126 + local59[local104];
							local104 += local40;
							@Pc(146) int local146 = local136 + local59[local104];
							local66[local98] = (byte) (local146 >> 2);
							local104 += local40;
							local98 += local40;
						}
						local104 += local92;
						local100 += local92;
					}
				}
				@Pc(191) byte[] local191 = local66;
				local66 = local59;
				arg0 = local53;
				arg3 = local57;
				local59 = local191;
				local53 >>= 0x1;
				local49 >>= 0x1;
				local57 >>= 0x1;
				local42++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BII[II)V")
	protected final void method9098(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static100.method1457(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static100.method1457(arg3)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass244_14 == Static584.aClass244_9) {
			@Pc(45) int local45 = 0;
			@Pc(52) int local52 = arg3 > arg0 ? arg0 : arg3;
			@Pc(56) int local56 = arg0 >> 1;
			@Pc(60) int local60 = arg3 >> 1;
			@Pc(62) int[] local62 = arg2;
			@Pc(67) int[] local67 = new int[local56 * local60];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local45, this.method9092(), arg0, arg3, 0, 32993, this.aClass101_Sub1_Sub1_12.anInt3368, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(89) int local89 = 0;
				@Pc(91) int local91 = 0;
				@Pc(95) int local95 = arg0;
				@Pc(97) int[] local97 = local67;
				for (@Pc(99) int local99 = 0; local99 < local60; local99++) {
					for (@Pc(103) int local103 = 0; local103 < local56; local103++) {
						@Pc(110) int local110 = local62[local91++];
						@Pc(115) int local115 = local62[local91++];
						@Pc(120) int local120 = local62[local95++];
						@Pc(124) int local124 = local110 & 0xFF;
						@Pc(130) int local130 = local110 >> 24 & 0xFF;
						@Pc(136) int local136 = local110 >> 8 & 0xFF;
						@Pc(142) int local142 = local110 >> 16 & 0xFF;
						@Pc(147) int local147 = local62[local95++];
						@Pc(155) int local155 = local136 + (local115 >> 8 & 0xFF);
						@Pc(163) int local163 = local130 + (local115 >> 24 & 0xFF);
						@Pc(169) int local169 = local124 + (local115 & 0xFF);
						@Pc(177) int local177 = local142 + (local115 >> 16 & 0xFF);
						@Pc(185) int local185 = local155 + (local120 >> 8 & 0xFF);
						@Pc(193) int local193 = local163 + (local120 >> 24 & 0xFF);
						@Pc(199) int local199 = local169 + (local120 & 0xFF);
						@Pc(207) int local207 = local177 + (local120 >> 16 & 0xFF);
						@Pc(213) int local213 = local199 + (local147 & 0xFF);
						@Pc(221) int local221 = local185 + (local147 >> 8 & 0xFF);
						@Pc(229) int local229 = local193 + (local147 >> 24 & 0xFF);
						@Pc(237) int local237 = local207 + (local147 >> 16 & 0xFF);
						local67[local89++] = (local237 & 0x3FC) << 14 | (local229 & 0x3FC) << 22 | (local221 & 0x3FC) << 6 | local213 >> 2 & 0xFF;
					}
					local95 += arg0;
					local91 += arg0;
				}
				local67 = local62;
				local62 = local97;
				arg3 = local60;
				arg0 = local56;
				local52 >>= 0x1;
				local60 >>= 0x1;
				local56 >>= 0x1;
				local45++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)I")
	private int method9099() {
		@Pc(19) int local19 = this.anInt10616 * this.aClass244_14.anInt7387 * this.aClass79_19.anInt2048;
		return this.aBoolean774 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!rha;)V")
	@Override
	public final void method9325(@OriginalArg(1) Class315 arg0) {
		if (arg0 != this.aClass315_11) {
			this.aClass315_11 = arg0;
			this.method9091();
		}
	}
}
