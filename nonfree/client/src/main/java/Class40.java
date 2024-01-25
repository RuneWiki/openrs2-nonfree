import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public abstract class Class40 implements Interface3 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!ws;")
	private Class395 aClass395_13 = Static193.aClass395_14;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "Lclient!oia;")
	protected final Class16_Sub1_Sub2 aClass16_Sub1_Sub2_7;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
	protected final int anInt6834;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	private final int anInt6827;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Lclient!ul;")
	protected final Class361 aClass361_13;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "Lclient!so;")
	protected final Class330 aClass330_10;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "Z")
	private final boolean aBoolean515;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
	private int anInt6832;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!oia;ILclient!ul;Lclient!so;IZ)V")
	protected Class40(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class361 arg2, @OriginalArg(3) Class330 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass16_Sub1_Sub2_7 = arg0;
		this.anInt6834 = arg1;
		this.anInt6827 = arg4;
		this.aClass361_13 = arg2;
		this.aClass330_10 = arg3;
		this.aBoolean515 = arg5;
		OpenGL.glGenTextures(1, Static111.anIntArray671, 0);
		this.anInt6832 = Static111.anIntArray671[0];
		this.method5713();
		this.method5707();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ws;B)V")
	@Override
	public final void method8758(@OriginalArg(0) Class395 arg0) {
		if (this.aClass395_13 != arg0) {
			this.aClass395_13 = arg0;
			this.method5713();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V")
	private void method5707() {
		this.aClass16_Sub1_Sub2_7.anInt7435 += this.method5708();
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)I")
	private int method5708() {
		@Pc(20) int local20 = this.anInt6827 * this.aClass330_10.anInt8941 * this.aClass361_13.anInt9527;
		return this.aBoolean515 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([BIIIZ)V")
	protected final void method5710(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 > 0 && !Static9.method94(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static9.method94(arg3)) {
			@Pc(31) int local31 = this.aClass361_13.anInt9527;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40 = arg1 >= arg3 ? arg3 : arg1;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg3 >> 1;
			@Pc(54) byte[] local54 = arg0;
			@Pc(61) byte[] local61 = new byte[local31 * local52 * local48];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local33, this.method5712(), arg1, arg3, 0, Static299.method4638(this.aClass361_13), 5121, local54, 0);
				if (local40 <= 1) {
					return;
				}
				@Pc(87) int local87 = local31 * arg1;
				@Pc(89) byte[] local89 = local61;
				for (@Pc(91) int local91 = 0; local91 < local31; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local87 + local91;
					for (@Pc(103) int local103 = 0; local103 < local52; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local48; local107++) {
							@Pc(113) byte local113 = local54[local97];
							local97 += local31;
							@Pc(123) int local123 = local113 + local54[local97];
							@Pc(129) int local129 = local123 + local54[local101];
							local97 += local31;
							local101 += local31;
							@Pc(143) int local143 = local129 + local54[local101];
							local61[local95] = (byte) (local143 >> 2);
							local101 += local31;
							local95 += local31;
						}
						local101 += local87;
						local97 += local87;
					}
				}
				local61 = local54;
				arg3 = local52;
				local54 = local89;
				arg1 = local48;
				local48 >>= 0x1;
				local40 >>= 0x1;
				local52 >>= 0x1;
				local33++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rl", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5715();
		super.finalize();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
	@Override
	public final void method8759() {
		@Pc(10) int local10 = this.aClass16_Sub1_Sub2_7.method6230();
		@Pc(16) int local16 = this.aClass16_Sub1_Sub2_7.anIntArray455[local10];
		if (this.anInt6834 != local16) {
			if (local16 != 0) {
				OpenGL.glBindTexture(local16, 0);
				OpenGL.glDisable(local16);
			}
			OpenGL.glEnable(this.anInt6834);
			this.aClass16_Sub1_Sub2_7.anIntArray455[local10] = this.anInt6834;
		}
		OpenGL.glBindTexture(this.anInt6834, this.anInt6832);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([IIIII)V")
	protected final void method5711(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 > 0 && !Static9.method94(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static9.method94(arg3)) {
			throw new IllegalArgumentException("");
		} else if (Static264.aClass361_8 == this.aClass361_13) {
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg3 > arg1 ? arg1 : arg3;
			@Pc(59) int local59 = arg1 >> 1;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(65) int[] local65 = arg0;
			@Pc(75) int[] local75 = new int[local59 * local63];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local44, this.method5712(), arg1, arg3, 0, 32993, this.aClass16_Sub1_Sub2_7.anInt7565, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(95) int local95 = 0;
				@Pc(97) int local97 = 0;
				@Pc(101) int local101 = arg1;
				for (@Pc(103) int local103 = 0; local103 < local63; local103++) {
					for (@Pc(107) int local107 = 0; local107 < local59; local107++) {
						@Pc(114) int local114 = local65[local97++];
						@Pc(119) int local119 = local65[local97++];
						@Pc(124) int local124 = local65[local101++];
						@Pc(130) int local130 = local114 >> 8 & 0xFF;
						@Pc(136) int local136 = local114 >> 16 & 0xFF;
						@Pc(141) int local141 = local65[local101++];
						@Pc(145) int local145 = local114 & 0xFF;
						@Pc(151) int local151 = local114 >> 24 & 0xFF;
						@Pc(159) int local159 = local136 + (local119 >> 16 & 0xFF);
						@Pc(167) int local167 = local130 + (local119 >> 8 & 0xFF);
						@Pc(175) int local175 = local151 + (local119 >> 24 & 0xFF);
						@Pc(181) int local181 = local145 + (local119 & 0xFF);
						@Pc(189) int local189 = local159 + (local124 >> 16 & 0xFF);
						@Pc(197) int local197 = local167 + (local124 >> 8 & 0xFF);
						@Pc(205) int local205 = local175 + (local124 >> 24 & 0xFF);
						@Pc(211) int local211 = local181 + (local124 & 0xFF);
						@Pc(217) int local217 = local211 + (local141 & 0xFF);
						@Pc(225) int local225 = local189 + (local141 >> 16 & 0xFF);
						@Pc(233) int local233 = local205 + (local141 >> 24 & 0xFF);
						@Pc(241) int local241 = local197 + (local141 >> 8 & 0xFF);
						local75[local95++] = (local241 & 0x3FC) << 6 | local225 << 14 & 0xFF0000 | (local233 & 0x3FC) << 22 | local217 >> 2 & 0xFF;
					}
					local97 += arg1;
					local101 += arg1;
				}
				@Pc(286) int[] local286 = local75;
				local75 = local65;
				local65 = local286;
				arg1 = local59;
				arg3 = local63;
				local44++;
				local55 >>= 0x1;
				local59 >>= 0x1;
				local63 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)I")
	protected final int method5712() {
		if (Static553.aClass330_14 == this.aClass330_10) {
			if (this.aClass361_13 == Static63.aClass361_14) {
				return 6407;
			}
			if (Static264.aClass361_8 == this.aClass361_13) {
				return 6408;
			}
			if (this.aClass361_13 == Static550.aClass361_15) {
				return 6406;
			}
			if (Static356.aClass361_9 == this.aClass361_13) {
				return 6409;
			}
			if (Static665.aClass361_16 == this.aClass361_13) {
				return 6410;
			}
			if (this.aClass361_13 == Static196.aClass361_5) {
				return 6145;
			}
		} else if (Static553.aClass330_17 == this.aClass330_10) {
			if (this.aClass361_13 == Static63.aClass361_14) {
				return 34843;
			}
			if (Static264.aClass361_8 == this.aClass361_13) {
				return 34842;
			}
			if (Static550.aClass361_15 == this.aClass361_13) {
				return 34844;
			}
			if (Static356.aClass361_9 == this.aClass361_13) {
				return 34846;
			}
			if (this.aClass361_13 == Static665.aClass361_16) {
				return 34847;
			}
			if (this.aClass361_13 == Static196.aClass361_5) {
				return 6145;
			}
		} else if (Static553.aClass330_18 == this.aClass330_10) {
			if (Static63.aClass361_14 == this.aClass361_13) {
				return 34837;
			}
			if (this.aClass361_13 == Static264.aClass361_8) {
				return 34836;
			}
			if (this.aClass361_13 == Static550.aClass361_15) {
				return 34838;
			}
			if (this.aClass361_13 == Static356.aClass361_9) {
				return 34840;
			}
			if (this.aClass361_13 == Static665.aClass361_16) {
				return 34841;
			}
			if (Static196.aClass361_5 == this.aClass361_13) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
	private void method5713() {
		this.aClass16_Sub1_Sub2_7.method6197(this);
		if (this.aClass395_13 == Static193.aClass395_14) {
			OpenGL.glTexParameteri(this.anInt6834, 10241, this.aBoolean515 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6834, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6834, 10241, this.aBoolean515 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6834, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[FII)V")
	protected final void method5714(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static9.method94(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static9.method94(arg0)) {
			@Pc(40) int local40 = this.aClass361_13.anInt9527;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg0 <= arg2 ? arg0 : arg2;
			@Pc(53) int local53 = arg2 >> 1;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(59) float[] local59 = arg1;
			@Pc(66) float[] local66 = new float[local40 * local57 * local53];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local42, this.method5712(), arg2, arg0, 0, Static299.method4638(this.aClass361_13), 5126, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(92) int local92 = local40 * arg2;
				for (@Pc(94) int local94 = 0; local94 < local40; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(105) int local105 = local94 + local92;
					for (@Pc(107) int local107 = 0; local107 < local57; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local53; local111++) {
							@Pc(117) float local117 = local59[local100];
							local100 += local40;
							@Pc(127) float local127 = local117 + local59[local100];
							@Pc(133) float local133 = local127 + local59[local105];
							local100 += local40;
							local105 += local40;
							@Pc(147) float local147 = local133 + local59[local105];
							local105 += local40;
							local66[local98] = local147 * 0.25F;
							local98 += local40;
						}
						local105 += local92;
						local100 += local92;
					}
				}
				@Pc(187) float[] local187 = local66;
				local66 = local59;
				arg0 = local57;
				arg2 = local53;
				local59 = local187;
				local53 >>= 0x1;
				local57 >>= 0x1;
				local42++;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V")
	private void method5715() {
		if (this.anInt6832 > 0) {
			this.aClass16_Sub1_Sub2_7.method6331(this.anInt6832, this.method5708());
			this.anInt6832 = 0;
		}
	}
}
