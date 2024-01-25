import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public abstract class Class53 implements Interface8 {

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "Lclient!gca;")
	private Class116 aClass116_11 = Static415.aClass116_12;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "Lclient!al;")
	protected final Class19 aClass19_16;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!lw;")
	protected final Class223 aClass223_11;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Z")
	private final boolean aBoolean384;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
	private final int anInt5171;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	protected final int anInt5166;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!om;")
	protected final Class133_Sub1_Sub2 aClass133_Sub1_Sub2_9;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	private int anInt5173;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!om;ILclient!lw;Lclient!al;IZ)V")
	protected Class53(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass19_16 = arg3;
		this.aClass223_11 = arg2;
		this.aBoolean384 = arg5;
		this.anInt5171 = arg4;
		this.anInt5166 = arg1;
		this.aClass133_Sub1_Sub2_9 = arg0;
		OpenGL.glGenTextures(1, Static177.anIntArray175, 0);
		this.anInt5173 = Static177.anIntArray175[0];
		this.method4631();
		this.method4625();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	private void method4625() {
		this.aClass133_Sub1_Sub2_9.anInt6964 += this.method4626();
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)I")
	private int method4626() {
		@Pc(19) int local19 = this.anInt5171 * this.aClass223_11.anInt5604 * this.aClass19_16.anInt281;
		return this.aBoolean384 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	@Override
	public final void method7907() {
		@Pc(16) int local16 = this.aClass133_Sub1_Sub2_9.method6202();
		@Pc(22) int local22 = this.aClass133_Sub1_Sub2_9.anIntArray377[local16];
		if (local22 != this.anInt5166) {
			if (local22 != 0) {
				OpenGL.glBindTexture(local22, 0);
				OpenGL.glDisable(local22);
			}
			OpenGL.glEnable(this.anInt5166);
			this.aClass133_Sub1_Sub2_9.anIntArray377[local16] = this.anInt5166;
		}
		OpenGL.glBindTexture(this.anInt5166, this.anInt5173);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBII[F)V")
	protected final void method4627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3) {
		if (arg2 > 0 && !Static413.method8723(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static413.method8723(arg0)) {
			@Pc(37) int local37 = this.aClass223_11.anInt5604;
			@Pc(39) int local39 = 0;
			@Pc(50) int local50 = arg0 <= arg2 ? arg0 : arg2;
			@Pc(54) int local54 = arg2 >> 1;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(60) float[] local60 = arg3;
			@Pc(72) float[] local72 = new float[local37 * local54 * local58];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local39, this.method4634(), arg2, arg0, 0, Static117.method1781(this.aClass223_11), 5126, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(97) int local97 = local37 * arg2;
				for (@Pc(99) int local99 = 0; local99 < local37; local99++) {
					@Pc(103) int local103 = local99;
					@Pc(105) int local105 = local99;
					@Pc(109) int local109 = local97 + local99;
					for (@Pc(111) int local111 = 0; local111 < local58; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local54; local115++) {
							@Pc(121) float local121 = local60[local105];
							local105 += local37;
							@Pc(131) float local131 = local121 + local60[local105];
							@Pc(137) float local137 = local131 + local60[local109];
							local105 += local37;
							local109 += local37;
							@Pc(151) float local151 = local137 + local60[local109];
							local109 += local37;
							local72[local103] = local151 * 0.25F;
							local103 += local37;
						}
						local105 += local97;
						local109 += local97;
					}
				}
				@Pc(195) float[] local195 = local72;
				local72 = local60;
				arg0 = local58;
				local60 = local195;
				arg2 = local54;
				local39++;
				local58 >>= 0x1;
				local50 >>= 0x1;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
	private void method4629() {
		if (this.anInt5173 > 0) {
			this.aClass133_Sub1_Sub2_9.method6292(this.anInt5173, this.method4626());
			this.anInt5173 = 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[IIII)V")
	protected final void method4630(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static413.method8723(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static413.method8723(arg2)) {
			throw new IllegalArgumentException("");
		} else if (Static576.aClass223_16 == this.aClass223_11) {
			@Pc(41) int local41 = 0;
			@Pc(52) int local52 = arg2 > arg1 ? arg1 : arg2;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(60) int local60 = arg2 >> 1;
			@Pc(62) int[] local62 = arg0;
			@Pc(73) int[] local73 = new int[local56 * local60];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local41, this.method4634(), arg1, arg2, 0, 32993, this.aClass133_Sub1_Sub2_9.anInt7107, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(93) int local93 = 0;
				@Pc(95) int local95 = 0;
				@Pc(99) int local99 = arg1;
				@Pc(101) int[] local101 = local73;
				for (@Pc(103) int local103 = 0; local103 < local60; local103++) {
					for (@Pc(107) int local107 = 0; local107 < local56; local107++) {
						@Pc(114) int local114 = local62[local95++];
						@Pc(119) int local119 = local62[local95++];
						@Pc(124) int local124 = local62[local99++];
						@Pc(130) int local130 = local114 >> 16 & 0xFF;
						@Pc(135) int local135 = local62[local99++];
						@Pc(139) int local139 = local114 & 0xFF;
						@Pc(145) int local145 = local114 >> 8 & 0xFF;
						@Pc(151) int local151 = local114 >> 24 & 0xFF;
						@Pc(159) int local159 = local130 + (local119 >> 16 & 0xFF);
						@Pc(165) int local165 = local139 + (local119 & 0xFF);
						@Pc(173) int local173 = local145 + (local119 >> 8 & 0xFF);
						@Pc(181) int local181 = local151 + (local119 >> 24 & 0xFF);
						@Pc(189) int local189 = local159 + (local124 >> 16 & 0xFF);
						@Pc(195) int local195 = local165 + (local124 & 0xFF);
						@Pc(203) int local203 = local181 + (local124 >> 24 & 0xFF);
						@Pc(211) int local211 = local173 + (local124 >> 8 & 0xFF);
						@Pc(219) int local219 = local189 + (local135 >> 16 & 0xFF);
						@Pc(227) int local227 = local203 + (local135 >> 24 & 0xFF);
						@Pc(233) int local233 = local195 + (local135 & 0xFF);
						@Pc(241) int local241 = local211 + (local135 >> 8 & 0xFF);
						local73[local93++] = (local241 & 0x3FC) << 6 | (local227 & 0x3FC) << 22 | (local219 & 0x3FC) << 14 | local233 >> 2 & 0xFF;
					}
					local99 += arg1;
					local95 += arg1;
				}
				local73 = local62;
				arg2 = local60;
				arg1 = local56;
				local62 = local101;
				local56 >>= 0x1;
				local41++;
				local60 >>= 0x1;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V")
	private void method4631() {
		this.aClass133_Sub1_Sub2_9.method6153(this);
		if (this.aClass116_11 == Static415.aClass116_12) {
			OpenGL.glTexParameteri(this.anInt5166, 10241, this.aBoolean384 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5166, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5166, 10241, this.aBoolean384 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5166, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!vd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4629();
		super.finalize();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII[B)V")
	protected final void method4633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg0 > 0 && !Static413.method8723(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static413.method8723(arg2)) {
			@Pc(37) int local37 = this.aClass223_11.anInt5604;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg2 > arg0 ? arg0 : arg2;
			@Pc(50) int local50 = arg0 >> 1;
			@Pc(54) int local54 = arg2 >> 1;
			@Pc(56) byte[] local56 = arg3;
			@Pc(63) byte[] local63 = new byte[local54 * local50 * local37];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local39, this.method4634(), arg0, arg2, 0, Static117.method1781(this.aClass223_11), 5121, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(98) int local98 = arg0 * local37;
				@Pc(100) byte[] local100 = local63;
				for (@Pc(102) int local102 = 0; local102 < local37; local102++) {
					@Pc(106) int local106 = local102;
					@Pc(108) int local108 = local102;
					@Pc(113) int local113 = local102 + local98;
					for (@Pc(115) int local115 = 0; local115 < local54; local115++) {
						for (@Pc(119) int local119 = 0; local119 < local50; local119++) {
							@Pc(125) byte local125 = local56[local108];
							local108 += local37;
							@Pc(135) int local135 = local125 + local56[local108];
							@Pc(141) int local141 = local135 + local56[local113];
							local108 += local37;
							local113 += local37;
							@Pc(155) int local155 = local141 + local56[local113];
							local63[local106] = (byte) (local155 >> 2);
							local113 += local37;
							local106 += local37;
						}
						local108 += local98;
						local113 += local98;
					}
				}
				local63 = local56;
				arg2 = local54;
				arg0 = local50;
				local56 = local100;
				local39++;
				local46 >>= 0x1;
				local50 >>= 0x1;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)I")
	protected final int method4634() {
		if (Static20.aClass19_4 == this.aClass19_16) {
			if (this.aClass223_11 == Static20.aClass223_3) {
				return 6407;
			}
			if (this.aClass223_11 == Static576.aClass223_16) {
				return 6408;
			}
			if (this.aClass223_11 == Static356.aClass223_12) {
				return 6406;
			}
			if (Static498.aClass223_13 == this.aClass223_11) {
				return 6409;
			}
			if (Static9.aClass223_2 == this.aClass223_11) {
				return 6410;
			}
			if (this.aClass223_11 == Static3.aClass223_17) {
				return 6145;
			}
		} else if (Static20.aClass19_7 == this.aClass19_16) {
			if (Static20.aClass223_3 == this.aClass223_11) {
				return 34843;
			}
			if (Static576.aClass223_16 == this.aClass223_11) {
				return 34842;
			}
			if (this.aClass223_11 == Static356.aClass223_12) {
				return 34844;
			}
			if (Static498.aClass223_13 == this.aClass223_11) {
				return 34846;
			}
			if (Static9.aClass223_2 == this.aClass223_11) {
				return 34847;
			}
			if (Static3.aClass223_17 == this.aClass223_11) {
				return 6145;
			}
		} else if (Static20.aClass19_8 == this.aClass19_16) {
			if (Static20.aClass223_3 == this.aClass223_11) {
				return 34837;
			}
			if (this.aClass223_11 == Static576.aClass223_16) {
				return 34836;
			}
			if (Static356.aClass223_12 == this.aClass223_11) {
				return 34838;
			}
			if (Static498.aClass223_13 == this.aClass223_11) {
				return 34840;
			}
			if (this.aClass223_11 == Static9.aClass223_2) {
				return 34841;
			}
			if (this.aClass223_11 == Static3.aClass223_17) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!gca;I)V")
	@Override
	public final void method7905(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_11 != arg0) {
			this.aClass116_11 = arg0;
			this.method4631();
		}
	}
}
