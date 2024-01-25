import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public abstract class Class7 implements Interface14 {

	@OriginalMember(owner = "client!om", name = "d", descriptor = "Lclient!ko;")
	private Class198 aClass198_11 = Static156.aClass198_4;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "Lclient!pe;")
	protected final Class276 aClass276_19;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "Lclient!nv;")
	protected final Class33_Sub2_Sub1 aClass33_Sub2_Sub1_12;

	@OriginalMember(owner = "client!om", name = "u", descriptor = "Lclient!dw;")
	protected final Class79 aClass79_20;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "Z")
	private final boolean aBoolean787;

	@OriginalMember(owner = "client!om", name = "o", descriptor = "I")
	protected final int anInt10172;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "I")
	private final int anInt10167;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "I")
	private int anInt10170;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!nv;ILclient!pe;Lclient!dw;IZ)V")
	protected Class7(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class276 arg2, @OriginalArg(3) Class79 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass276_19 = arg2;
		this.aClass33_Sub2_Sub1_12 = arg0;
		this.aClass79_20 = arg3;
		this.aBoolean787 = arg5;
		this.anInt10172 = arg1;
		this.anInt10167 = arg4;
		OpenGL.glGenTextures(1, Static370.anIntArray430, 0);
		this.anInt10170 = Static370.anIntArray430[0];
		this.method8620();
		this.method8617();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII[F)V")
	protected final void method8614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3) {
		if (arg1 > 0 && !Static211.method8993(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static211.method8993(arg2)) {
			@Pc(39) int local39 = this.aClass276_19.anInt7331;
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg2 <= arg1 ? arg2 : arg1;
			@Pc(52) int local52 = arg1 >> 1;
			@Pc(56) int local56 = arg2 >> 1;
			@Pc(58) float[] local58 = arg3;
			@Pc(65) float[] local65 = new float[local39 * local52 * local56];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local41, this.method8616(), arg1, arg2, 0, Static36.method738(this.aClass276_19), 5126, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg1 * local39;
				for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(102) int local102 = local91 + local89;
					for (@Pc(104) int local104 = 0; local104 < local56; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local52; local108++) {
							@Pc(114) float local114 = local58[local97];
							local97 += local39;
							@Pc(124) float local124 = local114 + local58[local97];
							@Pc(130) float local130 = local124 + local58[local102];
							local97 += local39;
							local102 += local39;
							@Pc(144) float local144 = local130 + local58[local102];
							local65[local95] = local144 * 0.25F;
							local102 += local39;
							local95 += local39;
						}
						local102 += local89;
						local97 += local89;
					}
				}
				@Pc(184) float[] local184 = local65;
				local65 = local58;
				local58 = local184;
				arg2 = local56;
				arg1 = local52;
				local48 >>= 0x1;
				local41++;
				local56 >>= 0x1;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
	private void method8615() {
		if (this.anInt10170 > 0) {
			this.aClass33_Sub2_Sub1_12.method5748(this.method8619(), this.anInt10170);
			this.anInt10170 = 0;
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
	@Override
	public final void method8613() {
		@Pc(8) int local8 = this.aClass33_Sub2_Sub1_12.method8178();
		@Pc(18) int local18 = this.aClass33_Sub2_Sub1_12.anIntArray453[local8];
		if (local18 != this.anInt10172) {
			if (local18 != 0) {
				OpenGL.glBindTexture(local18, 0);
				OpenGL.glDisable(local18);
			}
			OpenGL.glEnable(this.anInt10172);
			this.aClass33_Sub2_Sub1_12.anIntArray453[local8] = this.anInt10172;
		}
		OpenGL.glBindTexture(this.anInt10172, this.anInt10170);
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(I)I")
	protected final int method8616() {
		if (Static111.aClass79_7 == this.aClass79_20) {
			if (Static133.aClass276_7 == this.aClass276_19) {
				return 6407;
			}
			if (this.aClass276_19 == Static220.aClass276_11) {
				return 6408;
			}
			if (Static360.aClass276_15 == this.aClass276_19) {
				return 6406;
			}
			if (this.aClass276_19 == Static46.aClass276_4) {
				return 6409;
			}
			if (Static592.aClass276_18 == this.aClass276_19) {
				return 6410;
			}
			if (Static537.aClass276_17 == this.aClass276_19) {
				return 6145;
			}
		} else if (Static111.aClass79_10 == this.aClass79_20) {
			if (this.aClass276_19 == Static133.aClass276_7) {
				return 34843;
			}
			if (Static220.aClass276_11 == this.aClass276_19) {
				return 34842;
			}
			if (Static360.aClass276_15 == this.aClass276_19) {
				return 34844;
			}
			if (this.aClass276_19 == Static46.aClass276_4) {
				return 34846;
			}
			if (this.aClass276_19 == Static592.aClass276_18) {
				return 34847;
			}
			if (this.aClass276_19 == Static537.aClass276_17) {
				return 6145;
			}
		} else if (this.aClass79_20 == Static111.aClass79_11) {
			if (this.aClass276_19 == Static133.aClass276_7) {
				return 34837;
			}
			if (this.aClass276_19 == Static220.aClass276_11) {
				return 34836;
			}
			if (this.aClass276_19 == Static360.aClass276_15) {
				return 34838;
			}
			if (Static46.aClass276_4 == this.aClass276_19) {
				return 34840;
			}
			if (Static592.aClass276_18 == this.aClass276_19) {
				return 34841;
			}
			if (this.aClass276_19 == Static537.aClass276_17) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V")
	private void method8617() {
		this.aClass33_Sub2_Sub1_12.anInt9634 += this.method8619();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIB[B)V")
	protected final void method8618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg0 > 0 && !Static211.method8993(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static211.method8993(arg1)) {
			@Pc(39) int local39 = this.aClass276_19.anInt7331;
			@Pc(41) int local41 = 0;
			@Pc(52) int local52 = arg1 <= arg0 ? arg1 : arg0;
			@Pc(56) int local56 = arg0 >> 1;
			@Pc(60) int local60 = arg1 >> 1;
			@Pc(62) byte[] local62 = arg3;
			@Pc(69) byte[] local69 = new byte[local39 * local56 * local60];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local41, this.method8616(), arg0, arg1, 0, Static36.method738(this.aClass276_19), 5121, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(94) int local94 = arg0 * local39;
				@Pc(96) byte[] local96 = local69;
				for (@Pc(98) int local98 = 0; local98 < local39; local98++) {
					@Pc(102) int local102 = local98;
					@Pc(104) int local104 = local98;
					@Pc(109) int local109 = local98 + local94;
					for (@Pc(111) int local111 = 0; local111 < local60; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local56; local115++) {
							@Pc(121) byte local121 = local62[local104];
							local104 += local39;
							@Pc(131) int local131 = local121 + local62[local104];
							@Pc(137) int local137 = local131 + local62[local109];
							local104 += local39;
							local109 += local39;
							@Pc(151) int local151 = local137 + local62[local109];
							local109 += local39;
							local69[local102] = (byte) (local151 >> 2);
							local102 += local39;
						}
						local109 += local94;
						local104 += local94;
					}
				}
				local69 = local62;
				arg1 = local60;
				local62 = local96;
				arg0 = local56;
				local56 >>= 0x1;
				local52 >>= 0x1;
				local41++;
				local60 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!om", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8615();
		super.finalize();
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(I)I")
	private int method8619() {
		@Pc(22) int local22 = this.aClass276_19.anInt7331 * this.aClass79_20.anInt2185 * this.anInt10167;
		return this.aBoolean787 ? local22 * 4 / 3 : local22;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	private void method8620() {
		this.aClass33_Sub2_Sub1_12.method8159(this);
		if (Static156.aClass198_4 == this.aClass198_11) {
			OpenGL.glTexParameteri(this.anInt10172, 10241, this.aBoolean787 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10172, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10172, 10241, this.aBoolean787 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10172, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ko;I)V")
	@Override
	public final void method8612(@OriginalArg(0) Class198 arg0) {
		if (this.aClass198_11 != arg0) {
			this.aClass198_11 = arg0;
			this.method8620();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II[III)V")
	protected final void method8622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static211.method8993(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 > 0 && !Static211.method8993(arg1)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass276_19 == Static220.aClass276_11) {
			@Pc(46) int local46 = 0;
			@Pc(53) int local53 = arg3 < arg1 ? arg3 : arg1;
			@Pc(57) int local57 = arg3 >> 1;
			@Pc(65) int local65 = arg1 >> 1;
			@Pc(67) int[] local67 = arg2;
			@Pc(72) int[] local72 = new int[local65 * local57];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local46, this.method8616(), arg3, arg1, 0, 32993, this.aClass33_Sub2_Sub1_12.anInt6609, local67, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(95) int local95 = 0;
				@Pc(97) int local97 = 0;
				@Pc(101) int local101 = arg3;
				for (@Pc(103) int local103 = 0; local103 < local65; local103++) {
					for (@Pc(107) int local107 = 0; local107 < local57; local107++) {
						@Pc(114) int local114 = local67[local97++];
						@Pc(119) int local119 = local67[local101++];
						@Pc(124) int local124 = local67[local97++];
						@Pc(129) int local129 = local67[local101++];
						@Pc(135) int local135 = local114 >> 8 & 0xFF;
						@Pc(141) int local141 = local114 >> 16 & 0xFF;
						@Pc(147) int local147 = local114 >> 24 & 0xFF;
						@Pc(151) int local151 = local114 & 0xFF;
						@Pc(159) int local159 = local147 + (local124 >> 24 & 0xFF);
						@Pc(167) int local167 = local141 + (local124 >> 16 & 0xFF);
						@Pc(175) int local175 = local135 + (local124 >> 8 & 0xFF);
						@Pc(181) int local181 = local151 + (local124 & 0xFF);
						@Pc(187) int local187 = local181 + (local119 & 0xFF);
						@Pc(195) int local195 = local175 + (local119 >> 8 & 0xFF);
						@Pc(203) int local203 = local167 + (local119 >> 16 & 0xFF);
						@Pc(211) int local211 = local159 + (local119 >> 24 & 0xFF);
						@Pc(219) int local219 = local203 + (local129 >> 16 & 0xFF);
						@Pc(227) int local227 = local195 + (local129 >> 8 & 0xFF);
						@Pc(235) int local235 = local211 + (local129 >> 24 & 0xFF);
						@Pc(241) int local241 = local187 + (local129 & 0xFF);
						local72[local95++] = local241 >> 2 & 0xFF | (local227 & 0x3FC) << 6 | (local219 & 0x3FC) << 14 | (local235 & 0x3FC) << 22;
					}
					local97 += arg3;
					local101 += arg3;
				}
				@Pc(290) int[] local290 = local72;
				local72 = local67;
				arg3 = local57;
				local67 = local290;
				arg1 = local65;
				local46++;
				local57 >>= 0x1;
				local53 >>= 0x1;
				local65 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
