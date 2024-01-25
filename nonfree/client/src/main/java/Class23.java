import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public abstract class Class23 implements Interface22 {

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "Lclient!li;")
	private Class216 aClass216_11 = Static2.aClass216_1;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "Lclient!pj;")
	protected final Class278 aClass278_19;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "Lclient!eu;")
	protected final Class114 aClass114_20;

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
	protected final int anInt9693;

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "Z")
	private final boolean aBoolean743;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "Lclient!rda;")
	protected final Class57_Sub3_Sub1 aClass57_Sub3_Sub1_12;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
	private final int anInt9689;

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
	private int anInt9697;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!rda;ILclient!eu;Lclient!pj;IZ)V")
	protected Class23(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class114 arg2, @OriginalArg(3) Class278 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass278_19 = arg3;
		this.aClass114_20 = arg2;
		this.anInt9693 = arg1;
		this.aBoolean743 = arg5;
		this.aClass57_Sub3_Sub1_12 = arg0;
		this.anInt9689 = arg4;
		OpenGL.glGenTextures(1, Static110.anIntArray100, 0);
		this.anInt9697 = Static110.anIntArray100[0];
		this.method8309();
		this.method8312();
	}

	@OriginalMember(owner = "client!wt", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8308();
		super.finalize();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I[FIII)V")
	protected final void method8307(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static45.method8836(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static45.method8836(arg0)) {
			@Pc(40) int local40 = this.aClass114_20.anInt2411;
			@Pc(42) int local42 = 0;
			@Pc(62) int local62 = arg3 >= arg0 ? arg0 : arg3;
			@Pc(66) int local66 = arg3 >> 1;
			@Pc(70) int local70 = arg0 >> 1;
			@Pc(72) float[] local72 = arg1;
			@Pc(79) float[] local79 = new float[local40 * local66 * local70];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local42, this.method8310(), arg3, arg0, 0, Static446.method6638(this.aClass114_20), 5126, local72, 0);
				if (local62 <= 1) {
					return;
				}
				@Pc(106) int local106 = arg3 * local40;
				@Pc(108) float[] local108 = local79;
				for (@Pc(110) int local110 = 0; local110 < local40; local110++) {
					@Pc(116) int local116 = local110;
					@Pc(118) int local118 = local110;
					@Pc(122) int local122 = local106 + local110;
					for (@Pc(124) int local124 = 0; local124 < local70; local124++) {
						for (@Pc(128) int local128 = 0; local128 < local66; local128++) {
							@Pc(134) float local134 = local72[local118];
							local118 += local40;
							@Pc(144) float local144 = local134 + local72[local118];
							local118 += local40;
							@Pc(154) float local154 = local144 + local72[local122];
							local122 += local40;
							@Pc(164) float local164 = local154 + local72[local122];
							local122 += local40;
							local79[local116] = local164 * 0.25F;
							local116 += local40;
						}
						local118 += local106;
						local122 += local106;
					}
				}
				local79 = local72;
				arg0 = local70;
				local72 = local108;
				arg3 = local66;
				local42++;
				local66 >>= 0x1;
				local70 >>= 0x1;
				local62 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)V")
	private void method8308() {
		if (this.anInt9697 > 0) {
			this.aClass57_Sub3_Sub1_12.method7401(this.method8314(), this.anInt9697);
			this.anInt9697 = 0;
		}
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V")
	private void method8309() {
		this.aClass57_Sub3_Sub1_12.method7813(this);
		if (this.aClass216_11 == Static2.aClass216_1) {
			OpenGL.glTexParameteri(this.anInt9693, 10241, this.aBoolean743 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9693, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9693, 10241, this.aBoolean743 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9693, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)I")
	protected final int method8310() {
		if (Static453.aClass278_13 == this.aClass278_19) {
			if (Static396.aClass114_13 == this.aClass114_20) {
				return 6407;
			}
			if (this.aClass114_20 == Static412.aClass114_17) {
				return 6408;
			}
			if (Static78.aClass114_19 == this.aClass114_20) {
				return 6406;
			}
			if (this.aClass114_20 == Static402.aClass114_14) {
				return 6409;
			}
			if (Static560.aClass114_18 == this.aClass114_20) {
				return 6410;
			}
			if (this.aClass114_20 == Static104.aClass114_6) {
				return 6145;
			}
		} else if (this.aClass278_19 == Static453.aClass278_16) {
			if (Static396.aClass114_13 == this.aClass114_20) {
				return 34843;
			}
			if (this.aClass114_20 == Static412.aClass114_17) {
				return 34842;
			}
			if (this.aClass114_20 == Static78.aClass114_19) {
				return 34844;
			}
			if (this.aClass114_20 == Static402.aClass114_14) {
				return 34846;
			}
			if (this.aClass114_20 == Static560.aClass114_18) {
				return 34847;
			}
			if (Static104.aClass114_6 == this.aClass114_20) {
				return 6145;
			}
		} else if (this.aClass278_19 == Static453.aClass278_17) {
			if (this.aClass114_20 == Static396.aClass114_13) {
				return 34837;
			}
			if (this.aClass114_20 == Static412.aClass114_17) {
				return 34836;
			}
			if (this.aClass114_20 == Static78.aClass114_19) {
				return 34838;
			}
			if (Static402.aClass114_14 == this.aClass114_20) {
				return 34840;
			}
			if (this.aClass114_20 == Static560.aClass114_18) {
				return 34841;
			}
			if (this.aClass114_20 == Static104.aClass114_6) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	@Override
	public final void method8305() {
		@Pc(20) int local20 = this.aClass57_Sub3_Sub1_12.method7769();
		@Pc(26) int local26 = this.aClass57_Sub3_Sub1_12.anIntArray493[local20];
		if (local26 != this.anInt9693) {
			if (local26 != 0) {
				OpenGL.glBindTexture(local26, 0);
				OpenGL.glDisable(local26);
			}
			OpenGL.glEnable(this.anInt9693);
			this.aClass57_Sub3_Sub1_12.anIntArray493[local20] = this.anInt9693;
		}
		OpenGL.glBindTexture(this.anInt9693, this.anInt9697);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "([IIBII)V")
	protected final void method8311(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static45.method8836(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static45.method8836(arg2)) {
			throw new IllegalArgumentException("");
		} else if (Static412.aClass114_17 == this.aClass114_20) {
			@Pc(53) int local53 = 0;
			@Pc(65) int local65 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(69) int local69 = arg3 >> 1;
			@Pc(73) int local73 = arg2 >> 1;
			@Pc(75) int[] local75 = arg0;
			@Pc(88) int[] local88 = new int[local69 * local73];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local53, this.method8310(), arg3, arg2, 0, 32993, this.aClass57_Sub3_Sub1_12.anInt8653, local75, 0);
				if (local65 <= 1) {
					return;
				}
				@Pc(108) int local108 = 0;
				@Pc(110) int local110 = 0;
				@Pc(115) int local115 = arg3;
				for (@Pc(117) int local117 = 0; local117 < local73; local117++) {
					for (@Pc(123) int local123 = 0; local123 < local69; local123++) {
						@Pc(132) int local132 = local75[local110++];
						@Pc(137) int local137 = local75[local110++];
						@Pc(142) int local142 = local75[local115++];
						@Pc(148) int local148 = local132 >> 24 & 0xFF;
						@Pc(154) int local154 = local132 >> 8 & 0xFF;
						@Pc(159) int local159 = local75[local115++];
						@Pc(165) int local165 = local132 >> 16 & 0xFF;
						@Pc(169) int local169 = local132 & 0xFF;
						@Pc(175) int local175 = local169 + (local137 & 0xFF);
						@Pc(183) int local183 = local148 + (local137 >> 24 & 0xFF);
						@Pc(191) int local191 = local154 + (local137 >> 8 & 0xFF);
						@Pc(199) int local199 = local165 + (local137 >> 16 & 0xFF);
						@Pc(207) int local207 = local199 + (local142 >> 16 & 0xFF);
						@Pc(215) int local215 = local183 + (local142 >> 24 & 0xFF);
						@Pc(223) int local223 = local191 + (local142 >> 8 & 0xFF);
						@Pc(229) int local229 = local175 + (local142 & 0xFF);
						@Pc(237) int local237 = local223 + (local159 >> 8 & 0xFF);
						@Pc(245) int local245 = local207 + (local159 >> 16 & 0xFF);
						@Pc(251) int local251 = local229 + (local159 & 0xFF);
						@Pc(259) int local259 = local215 + (local159 >> 24 & 0xFF);
						local88[local108++] = local251 >> 2 & 0xFF | (local237 & 0x3FC) << 6 | (local259 & 0x3FC) << 22 | (local245 & 0x3FC) << 14;
					}
					local115 += arg3;
					local110 += arg3;
				}
				@Pc(310) int[] local310 = local88;
				local88 = local75;
				local75 = local310;
				arg3 = local69;
				arg2 = local73;
				local53++;
				local73 >>= 0x1;
				local65 >>= 0x1;
				local69 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZLclient!li;)V")
	@Override
	public final void method8306(@OriginalArg(1) Class216 arg0) {
		if (this.aClass216_11 != arg0) {
			this.aClass216_11 = arg0;
			this.method8309();
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IZ)V")
	private void method8312() {
		this.aClass57_Sub3_Sub1_12.anInt9142 += this.method8314();
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(B)I")
	private int method8314() {
		@Pc(20) int local20 = this.aClass278_19.anInt7757 * this.aClass114_20.anInt2411 * this.anInt9689;
		return this.aBoolean743 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "([BIIBI)V")
	protected final void method8315(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static45.method8836(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static45.method8836(arg2)) {
			@Pc(43) int local43 = this.aClass114_20.anInt2411;
			@Pc(45) int local45 = 0;
			@Pc(61) int local61 = arg2 > arg3 ? arg3 : arg2;
			@Pc(65) int local65 = arg3 >> 1;
			@Pc(69) int local69 = arg2 >> 1;
			@Pc(71) byte[] local71 = arg0;
			@Pc(78) byte[] local78 = new byte[local43 * local69 * local65];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local45, this.method8310(), arg3, arg2, 0, Static446.method6638(this.aClass114_20), 5121, local71, 0);
				if (local61 <= 1) {
					return;
				}
				@Pc(103) int local103 = arg3 * local43;
				@Pc(105) byte[] local105 = local78;
				for (@Pc(107) int local107 = 0; local107 < local43; local107++) {
					@Pc(113) int local113 = local107;
					@Pc(115) int local115 = local107;
					@Pc(120) int local120 = local107 + local103;
					for (@Pc(122) int local122 = 0; local122 < local69; local122++) {
						for (@Pc(126) int local126 = 0; local126 < local65; local126++) {
							@Pc(134) byte local134 = local71[local115];
							local115 += local43;
							@Pc(144) int local144 = local134 + local71[local115];
							@Pc(150) int local150 = local144 + local71[local120];
							local115 += local43;
							local120 += local43;
							@Pc(164) int local164 = local150 + local71[local120];
							local78[local113] = (byte) (local164 >> 2);
							local120 += local43;
							local113 += local43;
						}
						local115 += local103;
						local120 += local103;
					}
				}
				local78 = local71;
				arg2 = local69;
				local71 = local105;
				arg3 = local65;
				local61 >>= 0x1;
				local65 >>= 0x1;
				local69 >>= 0x1;
				local45++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
