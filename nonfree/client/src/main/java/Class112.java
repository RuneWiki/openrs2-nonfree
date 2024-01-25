import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public abstract class Class112 implements Interface18 {

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "Lclient!ng;")
	private Class225 aClass225_10 = Static195.aClass225_3;

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "Lclient!vea;")
	protected final Class340 aClass340_10;

	@OriginalMember(owner = "client!gaa", name = "q", descriptor = "I")
	protected final int anInt8864;

	@OriginalMember(owner = "client!gaa", name = "v", descriptor = "Z")
	private final boolean aBoolean654;

	@OriginalMember(owner = "client!gaa", name = "s", descriptor = "I")
	private final int anInt8866;

	@OriginalMember(owner = "client!gaa", name = "t", descriptor = "Lclient!qi;")
	protected final Class12_Sub2_Sub2 aClass12_Sub2_Sub2_11;

	@OriginalMember(owner = "client!gaa", name = "x", descriptor = "Lclient!sk;")
	protected final Class297 aClass297_14;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
	private int anInt8851;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!qi;ILclient!sk;Lclient!vea;IZ)V")
	protected Class112(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class297 arg2, @OriginalArg(3) Class340 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass340_10 = arg3;
		this.anInt8864 = arg1;
		this.aBoolean654 = arg5;
		this.anInt8866 = arg4;
		this.aClass12_Sub2_Sub2_11 = arg0;
		this.aClass297_14 = arg2;
		OpenGL.glGenTextures(1, Static106.anIntArray126, 0);
		this.anInt8851 = Static106.anIntArray126[0];
		this.method7321();
		this.method7315();
	}

	@OriginalMember(owner = "client!gaa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7314();
		super.finalize();
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
	private void method7314() {
		if (this.anInt8851 > 0) {
			this.aClass12_Sub2_Sub2_11.method6293(this.method7316(), this.anInt8851);
			this.anInt8851 = 0;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)V")
	private void method7315() {
		this.aClass12_Sub2_Sub2_11.anInt7516 += this.method7316();
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7671() {
		@Pc(14) int local14 = this.aClass12_Sub2_Sub2_11.method6151();
		@Pc(20) int local20 = this.aClass12_Sub2_Sub2_11.anIntArray503[local14];
		if (local20 != this.anInt8864) {
			if (local20 != 0) {
				OpenGL.glBindTexture(local20, 0);
				OpenGL.glDisable(local20);
			}
			OpenGL.glEnable(this.anInt8864);
			this.aClass12_Sub2_Sub2_11.anIntArray503[local14] = this.anInt8864;
		}
		OpenGL.glBindTexture(this.anInt8864, this.anInt8851);
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "(I)I")
	private int method7316() {
		@Pc(19) int local19 = this.aClass297_14.anInt8136 * this.aClass340_10.anInt9068 * this.anInt8866;
		return this.aBoolean654 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!ng;)V")
	@Override
	public final void method7669(@OriginalArg(1) Class225 arg0) {
		if (this.aClass225_10 != arg0) {
			this.aClass225_10 = arg0;
			this.method7321();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I[IIBI)V")
	protected final void method7318(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static119.method2029(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static119.method2029(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass297_14 == Static253.aClass297_5) {
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg2 > arg0 ? arg0 : arg2;
			@Pc(52) int local52 = arg0 >> 1;
			@Pc(56) int local56 = arg2 >> 1;
			@Pc(65) int[] local65 = arg1;
			@Pc(70) int[] local70 = new int[local56 * local52];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local41, this.method7324(), arg0, arg2, 0, 32993, this.aClass12_Sub2_Sub2_11.anInt7642, local65, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(91) int local91 = 0;
				@Pc(93) int local93 = 0;
				@Pc(97) int local97 = arg0;
				for (@Pc(99) int local99 = 0; local99 < local56; local99++) {
					for (@Pc(103) int local103 = 0; local103 < local52; local103++) {
						@Pc(110) int local110 = local65[local93++];
						@Pc(115) int local115 = local65[local97++];
						@Pc(120) int local120 = local65[local93++];
						@Pc(126) int local126 = local110 >> 8 & 0xFF;
						@Pc(131) int local131 = local65[local97++];
						@Pc(137) int local137 = local110 >> 16 & 0xFF;
						@Pc(141) int local141 = local110 & 0xFF;
						@Pc(147) int local147 = local110 >> 24 & 0xFF;
						@Pc(155) int local155 = local137 + (local120 >> 16 & 0xFF);
						@Pc(161) int local161 = local141 + (local120 & 0xFF);
						@Pc(169) int local169 = local147 + (local120 >> 24 & 0xFF);
						@Pc(177) int local177 = local126 + (local120 >> 8 & 0xFF);
						@Pc(185) int local185 = local177 + (local115 >> 8 & 0xFF);
						@Pc(193) int local193 = local169 + (local115 >> 24 & 0xFF);
						@Pc(199) int local199 = local161 + (local115 & 0xFF);
						@Pc(207) int local207 = local155 + (local115 >> 16 & 0xFF);
						@Pc(215) int local215 = local207 + (local131 >> 16 & 0xFF);
						@Pc(223) int local223 = local193 + (local131 >> 24 & 0xFF);
						@Pc(229) int local229 = local199 + (local131 & 0xFF);
						@Pc(237) int local237 = local185 + (local131 >> 8 & 0xFF);
						local70[local91++] = (local237 & 0x3FC) << 6 | (local215 & 0x3FC) << 14 | (local223 & 0x3FC) << 22 | local229 >> 2 & 0xFF;
					}
					local93 += arg0;
					local97 += arg0;
				}
				@Pc(282) int[] local282 = local70;
				local70 = local65;
				arg0 = local52;
				local65 = local282;
				arg2 = local56;
				local48 >>= 0x1;
				local41++;
				local52 >>= 0x1;
				local56 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II[FII)V")
	protected final void method7319(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static119.method2029(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static119.method2029(arg0)) {
			@Pc(36) int local36 = this.aClass297_14.anInt8136;
			@Pc(38) int local38 = 0;
			@Pc(49) int local49 = arg0 > arg3 ? arg3 : arg0;
			@Pc(53) int local53 = arg3 >> 1;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(65) float[] local65 = arg1;
			@Pc(72) float[] local72 = new float[local36 * local57 * local53];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local38, this.method7324(), arg3, arg0, 0, Static395.method5609(this.aClass297_14), 5126, local65, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(96) int local96 = local36 * arg3;
				for (@Pc(98) int local98 = 0; local98 < local36; local98++) {
					@Pc(102) int local102 = local98;
					@Pc(104) int local104 = local98;
					@Pc(109) int local109 = local98 + local96;
					for (@Pc(111) int local111 = 0; local111 < local57; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local53; local115++) {
							@Pc(121) float local121 = local65[local104];
							local104 += local36;
							@Pc(131) float local131 = local121 + local65[local104];
							@Pc(137) float local137 = local131 + local65[local109];
							local104 += local36;
							local109 += local36;
							@Pc(151) float local151 = local137 + local65[local109];
							local72[local102] = local151 * 0.25F;
							local109 += local36;
							local102 += local36;
						}
						local104 += local96;
						local109 += local96;
					}
				}
				@Pc(195) float[] local195 = local72;
				local72 = local65;
				arg3 = local53;
				local65 = local195;
				arg0 = local57;
				local53 >>= 0x1;
				local57 >>= 0x1;
				local38++;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "(I)V")
	private void method7321() {
		this.aClass12_Sub2_Sub2_11.method6159(this);
		if (Static195.aClass225_3 == this.aClass225_10) {
			OpenGL.glTexParameteri(this.anInt8864, 10241, this.aBoolean654 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8864, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8864, 10241, this.aBoolean654 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8864, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([BIIII)V")
	protected final void method7322(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static119.method2029(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static119.method2029(arg3)) {
			@Pc(36) int local36 = this.aClass297_14.anInt8136;
			@Pc(38) int local38 = 0;
			@Pc(49) int local49 = arg3 > arg1 ? arg1 : arg3;
			@Pc(53) int local53 = arg1 >> 1;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(65) byte[] local65 = arg0;
			@Pc(72) byte[] local72 = new byte[local36 * local53 * local63];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local38, this.method7324(), arg1, arg3, 0, Static395.method5609(this.aClass297_14), 5121, local65, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(95) int local95 = local36 * arg1;
				for (@Pc(97) int local97 = 0; local97 < local36; local97++) {
					@Pc(101) int local101 = local97;
					@Pc(103) int local103 = local97;
					@Pc(108) int local108 = local97 + local95;
					for (@Pc(110) int local110 = 0; local110 < local63; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local53; local114++) {
							@Pc(120) byte local120 = local65[local103];
							local103 += local36;
							@Pc(130) int local130 = local120 + local65[local103];
							local103 += local36;
							@Pc(140) int local140 = local130 + local65[local108];
							local108 += local36;
							@Pc(150) int local150 = local140 + local65[local108];
							local72[local101] = (byte) (local150 >> 2);
							local108 += local36;
							local101 += local36;
						}
						local108 += local95;
						local103 += local95;
					}
				}
				@Pc(195) byte[] local195 = local72;
				local72 = local65;
				arg1 = local53;
				local65 = local195;
				arg3 = local63;
				local63 >>= 0x1;
				local53 >>= 0x1;
				local38++;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "(Z)I")
	protected final int method7324() {
		if (this.aClass340_10 == Static554.aClass340_14) {
			if (Static514.aClass297_13 == this.aClass297_14) {
				return 6407;
			}
			if (this.aClass297_14 == Static253.aClass297_5) {
				return 6408;
			}
			if (this.aClass297_14 == Static257.aClass297_6) {
				return 6406;
			}
			if (this.aClass297_14 == Static66.aClass297_2) {
				return 6409;
			}
			if (Static275.aClass297_8 == this.aClass297_14) {
				return 6410;
			}
			if (Static1.aClass297_1 == this.aClass297_14) {
				return 6145;
			}
		} else if (this.aClass340_10 == Static554.aClass340_17) {
			if (this.aClass297_14 == Static514.aClass297_13) {
				return 34843;
			}
			if (Static253.aClass297_5 == this.aClass297_14) {
				return 34842;
			}
			if (this.aClass297_14 == Static257.aClass297_6) {
				return 34844;
			}
			if (this.aClass297_14 == Static66.aClass297_2) {
				return 34846;
			}
			if (this.aClass297_14 == Static275.aClass297_8) {
				return 34847;
			}
			if (Static1.aClass297_1 == this.aClass297_14) {
				return 6145;
			}
		} else if (Static554.aClass340_18 == this.aClass340_10) {
			if (Static514.aClass297_13 == this.aClass297_14) {
				return 34837;
			}
			if (Static253.aClass297_5 == this.aClass297_14) {
				return 34836;
			}
			if (this.aClass297_14 == Static257.aClass297_6) {
				return 34838;
			}
			if (this.aClass297_14 == Static66.aClass297_2) {
				return 34840;
			}
			if (this.aClass297_14 == Static275.aClass297_8) {
				return 34841;
			}
			if (Static1.aClass297_1 == this.aClass297_14) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}
}
