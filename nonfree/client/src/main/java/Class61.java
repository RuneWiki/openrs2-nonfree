import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public abstract class Class61 implements Interface3 {

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!td;")
	private Class301 aClass301_9 = Static563.aClass301_11;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Z")
	private final boolean aBoolean454;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!nl;")
	protected final Class214 aClass214_12;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	protected final int anInt6559;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!eea;")
	protected final Class82 aClass82_17;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!mc;")
	protected final Class121_Sub2_Sub1 aClass121_Sub2_Sub1_5;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	private final int anInt6562;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	private int anInt6561;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!mc;ILclient!nl;Lclient!eea;IZ)V")
	protected Class61(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class214 arg2, @OriginalArg(3) Class82 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean454 = arg5;
		this.aClass214_12 = arg2;
		this.anInt6559 = arg1;
		this.aClass82_17 = arg3;
		this.aClass121_Sub2_Sub1_5 = arg0;
		this.anInt6562 = arg4;
		OpenGL.glGenTextures(1, Static499.anIntArray645, 0);
		this.anInt6561 = Static499.anIntArray645[0];
		this.method5543();
		this.method5540();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	private void method5534() {
		if (this.anInt6561 > 0) {
			this.aClass121_Sub2_Sub1_5.method4675(this.anInt6561, this.method5537());
			this.anInt6561 = 0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)I")
	protected final int method5535() {
		if (Static108.aClass82_8 == this.aClass82_17) {
			if (Static43.aClass214_3 == this.aClass214_12) {
				return 6407;
			}
			if (Static255.aClass214_8 == this.aClass214_12) {
				return 6408;
			}
			if (this.aClass214_12 == Static490.aClass214_14) {
				return 6406;
			}
			if (this.aClass214_12 == Static134.aClass214_6) {
				return 6409;
			}
			if (Static316.aClass214_10 == this.aClass214_12) {
				return 6410;
			}
			if (this.aClass214_12 == Static466.aClass214_13) {
				return 6145;
			}
		} else if (this.aClass82_17 == Static108.aClass82_11) {
			if (this.aClass214_12 == Static43.aClass214_3) {
				return 34843;
			}
			if (this.aClass214_12 == Static255.aClass214_8) {
				return 34842;
			}
			if (Static490.aClass214_14 == this.aClass214_12) {
				return 34844;
			}
			if (Static134.aClass214_6 == this.aClass214_12) {
				return 34846;
			}
			if (this.aClass214_12 == Static316.aClass214_10) {
				return 34847;
			}
			if (this.aClass214_12 == Static466.aClass214_13) {
				return 6145;
			}
		} else if (Static108.aClass82_12 == this.aClass82_17) {
			if (Static43.aClass214_3 == this.aClass214_12) {
				return 34837;
			}
			if (Static255.aClass214_8 == this.aClass214_12) {
				return 34836;
			}
			if (this.aClass214_12 == Static490.aClass214_14) {
				return 34838;
			}
			if (this.aClass214_12 == Static134.aClass214_6) {
				return 34840;
			}
			if (this.aClass214_12 == Static316.aClass214_10) {
				return 34841;
			}
			if (this.aClass214_12 == Static466.aClass214_13) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lc", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5534();
		super.finalize();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[FIBI)V")
	protected final void method5536(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static392.method5808(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static392.method5808(arg3)) {
			@Pc(42) int local42 = this.aClass214_12.anInt5985;
			@Pc(44) int local44 = 0;
			@Pc(51) int local51 = arg0 >= arg3 ? arg3 : arg0;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(59) int local59 = arg3 >> 1;
			@Pc(61) float[] local61 = arg1;
			@Pc(68) float[] local68 = new float[local55 * local59 * local42];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local44, this.method5535(), arg0, arg3, 0, Static564.method7708(this.aClass214_12), 5126, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(91) int local91 = local42 * arg0;
				for (@Pc(93) int local93 = 0; local93 < local42; local93++) {
					@Pc(97) int local97 = local93;
					@Pc(99) int local99 = local93;
					@Pc(103) int local103 = local93 + local91;
					for (@Pc(105) int local105 = 0; local105 < local59; local105++) {
						for (@Pc(109) int local109 = 0; local109 < local55; local109++) {
							@Pc(115) float local115 = local61[local99];
							local99 += local42;
							@Pc(125) float local125 = local115 + local61[local99];
							local99 += local42;
							@Pc(135) float local135 = local125 + local61[local103];
							local103 += local42;
							@Pc(145) float local145 = local135 + local61[local103];
							local68[local97] = local145 * 0.25F;
							local103 += local42;
							local97 += local42;
						}
						local99 += local91;
						local103 += local91;
					}
				}
				@Pc(189) float[] local189 = local68;
				local68 = local61;
				local61 = local189;
				arg3 = local59;
				arg0 = local55;
				local51 >>= 0x1;
				local44++;
				local59 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)I")
	private int method5537() {
		@Pc(22) int local22 = this.aClass214_12.anInt5985 * this.aClass82_17.anInt2007 * this.anInt6562;
		return this.aBoolean454 ? local22 * 4 / 3 : local22;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!td;B)V")
	@Override
	public final void method7527(@OriginalArg(0) Class301 arg0) {
		if (arg0 != this.aClass301_9) {
			this.aClass301_9 = arg0;
			this.method5543();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	private void method5540() {
		this.aClass121_Sub2_Sub1_5.anInt8891 += this.method5537();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B[BIII)V")
	protected final void method5541(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static392.method5808(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static392.method5808(arg2)) {
			@Pc(40) int local40 = this.aClass214_12.anInt5985;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg2 <= arg1 ? arg2 : arg1;
			@Pc(53) int local53 = arg1 >> 1;
			@Pc(57) int local57 = arg2 >> 1;
			@Pc(59) byte[] local59 = arg0;
			@Pc(66) byte[] local66 = new byte[local53 * local57 * local40];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local42, this.method5535(), arg1, arg2, 0, Static564.method7708(this.aClass214_12), 5121, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(90) int local90 = arg1 * local40;
				for (@Pc(92) int local92 = 0; local92 < local40; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(102) int local102 = local90 + local92;
					for (@Pc(104) int local104 = 0; local104 < local57; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local53; local108++) {
							@Pc(114) byte local114 = local59[local98];
							local98 += local40;
							@Pc(124) int local124 = local114 + local59[local98];
							@Pc(130) int local130 = local124 + local59[local102];
							local98 += local40;
							local102 += local40;
							@Pc(144) int local144 = local130 + local59[local102];
							local102 += local40;
							local66[local96] = (byte) (local144 >> 2);
							local96 += local40;
						}
						local98 += local90;
						local102 += local90;
					}
				}
				@Pc(181) byte[] local181 = local66;
				local66 = local59;
				arg1 = local53;
				local59 = local181;
				arg2 = local57;
				local57 >>= 0x1;
				local49 >>= 0x1;
				local53 >>= 0x1;
				local42++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([IIIII)V")
	protected final void method5542(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 > 0 && !Static392.method5808(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static392.method5808(arg2)) {
			throw new IllegalArgumentException("");
		} else if (Static255.aClass214_8 == this.aClass214_12) {
			@Pc(38) int local38 = 0;
			@Pc(45) int local45 = arg1 < arg2 ? arg1 : arg2;
			@Pc(49) int local49 = arg1 >> 1;
			@Pc(57) int local57 = arg2 >> 1;
			@Pc(59) int[] local59 = arg0;
			@Pc(64) int[] local64 = new int[local57 * local49];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local38, this.method5535(), arg1, arg2, 0, 32993, this.aClass121_Sub2_Sub1_5.anInt5463, local59, 0);
				if (local45 <= 1) {
					return;
				}
				@Pc(87) int local87 = 0;
				@Pc(89) int local89 = 0;
				@Pc(93) int local93 = arg1;
				@Pc(95) int[] local95 = local64;
				for (@Pc(97) int local97 = 0; local97 < local57; local97++) {
					for (@Pc(101) int local101 = 0; local101 < local49; local101++) {
						@Pc(108) int local108 = local59[local89++];
						@Pc(113) int local113 = local59[local89++];
						@Pc(118) int local118 = local59[local93++];
						@Pc(124) int local124 = local108 >> 16 & 0xFF;
						@Pc(128) int local128 = local108 & 0xFF;
						@Pc(134) int local134 = local108 >> 8 & 0xFF;
						@Pc(139) int local139 = local59[local93++];
						@Pc(145) int local145 = local108 >> 24 & 0xFF;
						@Pc(153) int local153 = local124 + (local113 >> 16 & 0xFF);
						@Pc(159) int local159 = local128 + (local113 & 0xFF);
						@Pc(167) int local167 = local145 + (local113 >> 24 & 0xFF);
						@Pc(175) int local175 = local134 + (local113 >> 8 & 0xFF);
						@Pc(181) int local181 = local159 + (local118 & 0xFF);
						@Pc(189) int local189 = local175 + (local118 >> 8 & 0xFF);
						@Pc(197) int local197 = local153 + (local118 >> 16 & 0xFF);
						@Pc(205) int local205 = local167 + (local118 >> 24 & 0xFF);
						@Pc(213) int local213 = local197 + (local139 >> 16 & 0xFF);
						@Pc(219) int local219 = local181 + (local139 & 0xFF);
						@Pc(227) int local227 = local205 + (local139 >> 24 & 0xFF);
						@Pc(235) int local235 = local189 + (local139 >> 8 & 0xFF);
						local64[local87++] = local219 >> 2 & 0xFF | (local235 & 0x3FC) << 6 | (local227 & 0x3FC) << 22 | (local213 & 0x3FC) << 14;
					}
					local93 += arg1;
					local89 += arg1;
				}
				local64 = local59;
				arg1 = local49;
				arg2 = local57;
				local59 = local95;
				local38++;
				local45 >>= 0x1;
				local57 >>= 0x1;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
	private void method5543() {
		this.aClass121_Sub2_Sub1_5.method7167(this);
		if (this.aClass301_9 == Static563.aClass301_11) {
			OpenGL.glTexParameteri(this.anInt6559, 10241, this.aBoolean454 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6559, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6559, 10241, this.aBoolean454 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6559, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	@Override
	public final void method7528() {
		@Pc(8) int local8 = this.aClass121_Sub2_Sub1_5.method7253();
		@Pc(24) int local24 = this.aClass121_Sub2_Sub1_5.anIntArray470[local8];
		if (this.anInt6559 != local24) {
			if (local24 != 0) {
				OpenGL.glBindTexture(local24, 0);
				OpenGL.glDisable(local24);
			}
			OpenGL.glEnable(this.anInt6559);
			this.aClass121_Sub2_Sub1_5.anIntArray470[local8] = this.anInt6559;
		}
		OpenGL.glBindTexture(this.anInt6559, this.anInt6561);
	}
}
