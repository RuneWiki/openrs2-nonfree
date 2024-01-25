import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public abstract class Class81 implements Interface10 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Lclient!up;")
	private Class321 aClass321_11 = Static333.aClass321_7;

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "Lclient!nb;")
	protected final Class220 aClass220_20;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "Lclient!nfa;")
	protected final Class9_Sub3_Sub2 aClass9_Sub3_Sub2_10;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "Z")
	private final boolean aBoolean692;

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
	protected final int anInt9224;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "Lclient!vj;")
	protected final Class333 aClass333_16;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
	private final int anInt9218;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
	private int anInt9214;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!nfa;ILclient!vj;Lclient!nb;IZ)V")
	protected Class81(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class333 arg2, @OriginalArg(3) Class220 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass220_20 = arg3;
		this.aClass9_Sub3_Sub2_10 = arg0;
		this.aBoolean692 = arg5;
		this.anInt9224 = arg1;
		this.aClass333_16 = arg2;
		this.anInt9218 = arg4;
		OpenGL.glGenTextures(1, Static386.anIntArray508, 0);
		this.anInt9214 = Static386.anIntArray508[0];
		this.method7745();
		this.method7739();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)V")
	private void method7739() {
		this.aClass9_Sub3_Sub2_10.anInt6523 += this.method7743();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
	private void method7740() {
		if (this.anInt9214 > 0) {
			this.aClass9_Sub3_Sub2_10.method5606(this.method7743(), this.anInt9214);
			this.anInt9214 = 0;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII[I)V")
	protected final void method7741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 > 0 && !Static85.method1890(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 > 0 && !Static85.method1890(arg0)) {
			throw new IllegalArgumentException("");
		} else if (Static487.aClass333_15 == this.aClass333_16) {
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg0 <= arg2 ? arg0 : arg2;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(56) int local56 = arg0 >> 1;
			@Pc(58) int[] local58 = arg3;
			@Pc(63) int[] local63 = new int[local52 * local56];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local41, this.method7742(), arg2, arg0, 0, 32993, this.aClass9_Sub3_Sub2_10.anInt6644, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(87) int local87 = 0;
				@Pc(89) int local89 = 0;
				@Pc(94) int local94 = arg2;
				@Pc(96) int[] local96 = local63;
				for (@Pc(98) int local98 = 0; local98 < local56; local98++) {
					for (@Pc(102) int local102 = 0; local102 < local52; local102++) {
						@Pc(109) int local109 = local58[local89++];
						@Pc(114) int local114 = local58[local94++];
						@Pc(119) int local119 = local58[local89++];
						@Pc(125) int local125 = local109 >> 8 & 0xFF;
						@Pc(130) int local130 = local58[local94++];
						@Pc(134) int local134 = local109 & 0xFF;
						@Pc(140) int local140 = local109 >> 16 & 0xFF;
						@Pc(146) int local146 = local109 >> 24 & 0xFF;
						@Pc(154) int local154 = local146 + (local119 >> 24 & 0xFF);
						@Pc(162) int local162 = local140 + (local119 >> 16 & 0xFF);
						@Pc(168) int local168 = local134 + (local119 & 0xFF);
						@Pc(176) int local176 = local125 + (local119 >> 8 & 0xFF);
						@Pc(184) int local184 = local154 + (local114 >> 24 & 0xFF);
						@Pc(190) int local190 = local168 + (local114 & 0xFF);
						@Pc(198) int local198 = local162 + (local114 >> 16 & 0xFF);
						@Pc(206) int local206 = local176 + (local114 >> 8 & 0xFF);
						@Pc(214) int local214 = local206 + (local130 >> 8 & 0xFF);
						@Pc(220) int local220 = local190 + (local130 & 0xFF);
						@Pc(228) int local228 = local198 + (local130 >> 16 & 0xFF);
						@Pc(236) int local236 = local184 + (local130 >> 24 & 0xFF);
						local63[local87++] = (local228 & 0x3FC) << 14 | (local236 & 0x3FC) << 22 | (local214 & 0x3FC) << 6 | local220 >> 2 & 0xFF;
					}
					local94 += arg2;
					local89 += arg2;
				}
				local63 = local58;
				local58 = local96;
				arg0 = local56;
				arg2 = local52;
				local56 >>= 0x1;
				local41++;
				local52 >>= 0x1;
				local48 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)I")
	protected final int method7742() {
		if (this.aClass220_20 == Static336.aClass220_12) {
			if (Static396.aClass333_12 == this.aClass333_16) {
				return 6407;
			}
			if (this.aClass333_16 == Static487.aClass333_15) {
				return 6408;
			}
			if (this.aClass333_16 == Static451.aClass333_14) {
				return 6406;
			}
			if (this.aClass333_16 == Static26.aClass333_2) {
				return 6409;
			}
			if (Static459.aClass333_7 == this.aClass333_16) {
				return 6410;
			}
			if (Static18.aClass333_1 == this.aClass333_16) {
				return 6145;
			}
		} else if (Static336.aClass220_15 == this.aClass220_20) {
			if (this.aClass333_16 == Static396.aClass333_12) {
				return 34843;
			}
			if (this.aClass333_16 == Static487.aClass333_15) {
				return 34842;
			}
			if (this.aClass333_16 == Static451.aClass333_14) {
				return 34844;
			}
			if (this.aClass333_16 == Static26.aClass333_2) {
				return 34846;
			}
			if (this.aClass333_16 == Static459.aClass333_7) {
				return 34847;
			}
			if (Static18.aClass333_1 == this.aClass333_16) {
				return 6145;
			}
		} else if (Static336.aClass220_16 == this.aClass220_20) {
			if (Static396.aClass333_12 == this.aClass333_16) {
				return 34837;
			}
			if (Static487.aClass333_15 == this.aClass333_16) {
				return 34836;
			}
			if (this.aClass333_16 == Static451.aClass333_14) {
				return 34838;
			}
			if (Static26.aClass333_2 == this.aClass333_16) {
				return 34840;
			}
			if (Static459.aClass333_7 == this.aClass333_16) {
				return 34841;
			}
			if (this.aClass333_16 == Static18.aClass333_1) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7740();
		super.finalize();
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)I")
	private int method7743() {
		@Pc(22) int local22 = this.anInt9218 * this.aClass333_16.anInt9344 * this.aClass220_20.anInt6224;
		return this.aBoolean692 ? local22 * 4 / 3 : local22;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([BIIBI)V")
	protected final void method7744(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static85.method1890(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static85.method1890(arg1)) {
			@Pc(40) int local40 = this.aClass333_16.anInt9344;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg2 < arg1 ? arg2 : arg1;
			@Pc(53) int local53 = arg2 >> 1;
			@Pc(57) int local57 = arg1 >> 1;
			@Pc(59) byte[] local59 = arg0;
			@Pc(66) byte[] local66 = new byte[local40 * local53 * local57];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local42, this.method7742(), arg2, arg1, 0, Static290.method4775(this.aClass333_16), 5121, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg2 * local40;
				@Pc(94) byte[] local94 = local66;
				for (@Pc(96) int local96 = 0; local96 < local40; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local92 + local96;
					for (@Pc(108) int local108 = 0; local108 < local57; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local53; local112++) {
							@Pc(118) byte local118 = local59[local102];
							local102 += local40;
							@Pc(128) int local128 = local118 + local59[local102];
							@Pc(134) int local134 = local128 + local59[local106];
							local102 += local40;
							local106 += local40;
							@Pc(148) int local148 = local134 + local59[local106];
							local66[local100] = (byte) (local148 >> 2);
							local106 += local40;
							local100 += local40;
						}
						local106 += local92;
						local102 += local92;
					}
				}
				local66 = local59;
				arg1 = local57;
				arg2 = local53;
				local59 = local94;
				local49 >>= 0x1;
				local42++;
				local57 >>= 0x1;
				local53 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)V")
	private void method7745() {
		this.aClass9_Sub3_Sub2_10.method5494(this);
		if (this.aClass321_11 == Static333.aClass321_7) {
			OpenGL.glTexParameteri(this.anInt9224, 10241, this.aBoolean692 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9224, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9224, 10241, this.aBoolean692 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9224, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIB[F)V")
	protected final void method7746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float[] arg3) {
		if (arg0 > 0 && !Static85.method1890(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static85.method1890(arg2)) {
			@Pc(42) int local42 = this.aClass333_16.anInt9344;
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg0 < arg2 ? arg0 : arg2;
			@Pc(59) int local59 = arg0 >> 1;
			@Pc(63) int local63 = arg2 >> 1;
			@Pc(65) float[] local65 = arg3;
			@Pc(72) float[] local72 = new float[local59 * local63 * local42];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local44, this.method7742(), arg0, arg2, 0, Static290.method4775(this.aClass333_16), 5126, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(98) int local98 = arg0 * local42;
				@Pc(100) float[] local100 = local72;
				for (@Pc(102) int local102 = 0; local102 < local42; local102++) {
					@Pc(106) int local106 = local102;
					@Pc(108) int local108 = local102;
					@Pc(113) int local113 = local102 + local98;
					for (@Pc(115) int local115 = 0; local115 < local63; local115++) {
						for (@Pc(119) int local119 = 0; local119 < local59; local119++) {
							@Pc(125) float local125 = local65[local108];
							local108 += local42;
							@Pc(135) float local135 = local125 + local65[local108];
							local108 += local42;
							@Pc(145) float local145 = local135 + local65[local113];
							local113 += local42;
							@Pc(155) float local155 = local145 + local65[local113];
							local72[local106] = local155 * 0.25F;
							local113 += local42;
							local106 += local42;
						}
						local113 += local98;
						local108 += local98;
					}
				}
				local72 = local65;
				local65 = local100;
				arg2 = local63;
				arg0 = local59;
				local44++;
				local55 >>= 0x1;
				local63 >>= 0x1;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!up;)V")
	@Override
	public final void method7737(@OriginalArg(1) Class321 arg0) {
		if (arg0 != this.aClass321_11) {
			this.aClass321_11 = arg0;
			this.method7745();
		}
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)V")
	@Override
	public final void method7736() {
		@Pc(8) int local8 = this.aClass9_Sub3_Sub2_10.method5478();
		@Pc(14) int local14 = this.aClass9_Sub3_Sub2_10.anIntArray471[local8];
		if (local14 != this.anInt9224) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt9224);
			this.aClass9_Sub3_Sub2_10.anIntArray471[local8] = this.anInt9224;
		}
		OpenGL.glBindTexture(this.anInt9224, this.anInt9214);
	}
}
