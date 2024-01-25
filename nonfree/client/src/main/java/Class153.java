import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public abstract class Class153 implements Interface4 {

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "Lclient!cr;")
	private Class67 aClass67_10 = Static671.aClass67_11;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "Lclient!og;")
	protected final Class143_Sub1_Sub2 aClass143_Sub1_Sub2_10;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "Z")
	private final boolean aBoolean638;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	protected final int anInt8818;

	@OriginalMember(owner = "client!oo", name = "w", descriptor = "Lclient!kn;")
	protected final Class206 aClass206_18;

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "Lclient!ofa;")
	protected final Class255 aClass255_22;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
	private final int anInt8822;

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
	private int anInt8830;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!og;ILclient!ofa;Lclient!kn;IZ)V")
	protected Class153(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass143_Sub1_Sub2_10 = arg0;
		this.aBoolean638 = arg5;
		this.anInt8818 = arg1;
		this.aClass206_18 = arg3;
		this.aClass255_22 = arg2;
		this.anInt8822 = arg4;
		OpenGL.glGenTextures(1, Static576.anIntArray515, 0);
		this.anInt8830 = Static576.anIntArray515[0];
		this.method7441();
		this.method7443();
	}

	@OriginalMember(owner = "client!oo", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7438();
		super.finalize();
	}

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)V")
	private void method7438() {
		if (this.anInt8830 > 0) {
			this.aClass143_Sub1_Sub2_10.method6407(this.method7447(), this.anInt8830);
			this.anInt8830 = 0;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!cr;Z)V")
	@Override
	public final void method7435(@OriginalArg(0) Class67 arg0) {
		if (this.aClass67_10 != arg0) {
			this.aClass67_10 = arg0;
			this.method7441();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZI[III)V")
	protected final void method7440(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static384.method5636(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static384.method5636(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass255_22 == Static92.aClass255_3) {
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg0 >= arg2 ? arg2 : arg0;
			@Pc(52) int local52 = arg0 >> 1;
			@Pc(56) int local56 = arg2 >> 1;
			@Pc(63) int[] local63 = arg1;
			@Pc(68) int[] local68 = new int[local52 * local56];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local41, this.method7446(), arg0, arg2, 0, 32993, this.aClass143_Sub1_Sub2_10.anInt7508, local63, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(88) int local88 = 0;
				@Pc(90) int local90 = 0;
				@Pc(95) int local95 = arg0;
				for (@Pc(97) int local97 = 0; local97 < local56; local97++) {
					for (@Pc(101) int local101 = 0; local101 < local52; local101++) {
						@Pc(108) int local108 = local63[local90++];
						@Pc(113) int local113 = local63[local95++];
						@Pc(118) int local118 = local63[local90++];
						@Pc(122) int local122 = local108 & 0xFF;
						@Pc(128) int local128 = local108 >> 24 & 0xFF;
						@Pc(134) int local134 = local108 >> 16 & 0xFF;
						@Pc(139) int local139 = local63[local95++];
						@Pc(145) int local145 = local108 >> 8 & 0xFF;
						@Pc(153) int local153 = local134 + (local118 >> 16 & 0xFF);
						@Pc(159) int local159 = local122 + (local118 & 0xFF);
						@Pc(167) int local167 = local128 + (local118 >> 24 & 0xFF);
						@Pc(175) int local175 = local145 + (local118 >> 8 & 0xFF);
						@Pc(183) int local183 = local153 + (local113 >> 16 & 0xFF);
						@Pc(189) int local189 = local159 + (local113 & 0xFF);
						@Pc(197) int local197 = local167 + (local113 >> 24 & 0xFF);
						@Pc(205) int local205 = local175 + (local113 >> 8 & 0xFF);
						@Pc(213) int local213 = local183 + (local139 >> 16 & 0xFF);
						@Pc(219) int local219 = local189 + (local139 & 0xFF);
						@Pc(227) int local227 = local205 + (local139 >> 8 & 0xFF);
						@Pc(235) int local235 = local197 + (local139 >> 24 & 0xFF);
						local68[local88++] = local219 >> 2 & 0xFF | (local235 & 0x3FC) << 22 | (local213 & 0x3FC) << 14 | (local227 & 0x3FC) << 6;
					}
					local95 += arg0;
					local90 += arg0;
				}
				@Pc(288) int[] local288 = local68;
				local68 = local63;
				arg0 = local52;
				local63 = local288;
				arg2 = local56;
				local56 >>= 0x1;
				local41++;
				local48 >>= 0x1;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)V")
	private void method7441() {
		this.aClass143_Sub1_Sub2_10.method6338(this);
		if (Static671.aClass67_11 == this.aClass67_10) {
			OpenGL.glTexParameteri(this.anInt8818, 10241, this.aBoolean638 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8818, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8818, 10241, this.aBoolean638 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8818, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "([FIIII)V")
	protected final void method7442(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static384.method5636(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static384.method5636(arg3)) {
			@Pc(34) int local34 = this.aClass255_22.anInt7179;
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg3 <= arg1 ? arg3 : arg1;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg3 >> 1;
			@Pc(63) float[] local63 = arg0;
			@Pc(70) float[] local70 = new float[local34 * local51 * local55];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local36, this.method7446(), arg1, arg3, 0, Static517.method7337(this.aClass255_22), 5126, local63, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(95) int local95 = local34 * arg1;
				for (@Pc(97) int local97 = 0; local97 < local34; local97++) {
					@Pc(101) int local101 = local97;
					@Pc(103) int local103 = local97;
					@Pc(108) int local108 = local97 + local95;
					for (@Pc(110) int local110 = 0; local110 < local55; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local51; local114++) {
							@Pc(120) float local120 = local63[local103];
							local103 += local34;
							@Pc(130) float local130 = local120 + local63[local103];
							local103 += local34;
							@Pc(140) float local140 = local130 + local63[local108];
							local108 += local34;
							@Pc(150) float local150 = local140 + local63[local108];
							local70[local101] = local150 * 0.25F;
							local108 += local34;
							local101 += local34;
						}
						local108 += local95;
						local103 += local95;
					}
				}
				@Pc(194) float[] local194 = local70;
				local70 = local63;
				local63 = local194;
				arg3 = local55;
				arg1 = local51;
				local47 >>= 0x1;
				local55 >>= 0x1;
				local36++;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V")
	private void method7443() {
		this.aClass143_Sub1_Sub2_10.anInt7368 += this.method7447();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III[BI)V")
	protected final void method7444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static384.method5636(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static384.method5636(arg0)) {
			@Pc(37) int local37 = this.aClass255_22.anInt7179;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg0 > arg3 ? arg3 : arg0;
			@Pc(50) int local50 = arg3 >> 1;
			@Pc(54) int local54 = arg0 >> 1;
			@Pc(56) byte[] local56 = arg2;
			@Pc(63) byte[] local63 = new byte[local37 * local54 * local50];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local39, this.method7446(), arg3, arg0, 0, Static517.method7337(this.aClass255_22), 5121, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg3 * local37;
				@Pc(91) byte[] local91 = local63;
				for (@Pc(93) int local93 = 0; local93 < local37; local93++) {
					@Pc(97) int local97 = local93;
					@Pc(99) int local99 = local93;
					@Pc(103) int local103 = local89 + local93;
					for (@Pc(105) int local105 = 0; local105 < local54; local105++) {
						for (@Pc(109) int local109 = 0; local109 < local50; local109++) {
							@Pc(115) byte local115 = local56[local99];
							local99 += local37;
							@Pc(125) int local125 = local115 + local56[local99];
							local99 += local37;
							@Pc(135) int local135 = local125 + local56[local103];
							local103 += local37;
							@Pc(145) int local145 = local135 + local56[local103];
							local103 += local37;
							local63[local97] = (byte) (local145 >> 2);
							local97 += local37;
						}
						local103 += local89;
						local99 += local89;
					}
				}
				local63 = local56;
				arg0 = local54;
				local56 = local91;
				arg3 = local50;
				local39++;
				local54 >>= 0x1;
				local50 >>= 0x1;
				local46 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	@Override
	public final void method7436() {
		@Pc(14) int local14 = this.aClass143_Sub1_Sub2_10.method6298();
		@Pc(20) int local20 = this.aClass143_Sub1_Sub2_10.anIntArray415[local14];
		if (this.anInt8818 != local20) {
			if (local20 != 0) {
				OpenGL.glBindTexture(local20, 0);
				OpenGL.glDisable(local20);
			}
			OpenGL.glEnable(this.anInt8818);
			this.aClass143_Sub1_Sub2_10.anIntArray415[local14] = this.anInt8818;
		}
		OpenGL.glBindTexture(this.anInt8818, this.anInt8830);
	}

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "(I)I")
	protected final int method7446() {
		if (this.aClass206_18 == Static314.aClass206_12) {
			if (this.aClass255_22 == Static91.aClass255_21) {
				return 6407;
			}
			if (this.aClass255_22 == Static92.aClass255_3) {
				return 6408;
			}
			if (Static83.aClass255_1 == this.aClass255_22) {
				return 6406;
			}
			if (Static199.aClass255_10 == this.aClass255_22) {
				return 6409;
			}
			if (Static368.aClass255_16 == this.aClass255_22) {
				return 6410;
			}
			if (this.aClass255_22 == Static138.aClass255_7) {
				return 6145;
			}
		} else if (Static314.aClass206_15 == this.aClass206_18) {
			if (this.aClass255_22 == Static91.aClass255_21) {
				return 34843;
			}
			if (Static92.aClass255_3 == this.aClass255_22) {
				return 34842;
			}
			if (Static83.aClass255_1 == this.aClass255_22) {
				return 34844;
			}
			if (Static199.aClass255_10 == this.aClass255_22) {
				return 34846;
			}
			if (Static368.aClass255_16 == this.aClass255_22) {
				return 34847;
			}
			if (this.aClass255_22 == Static138.aClass255_7) {
				return 6145;
			}
		} else if (Static314.aClass206_16 == this.aClass206_18) {
			if (this.aClass255_22 == Static91.aClass255_21) {
				return 34837;
			}
			if (Static92.aClass255_3 == this.aClass255_22) {
				return 34836;
			}
			if (Static83.aClass255_1 == this.aClass255_22) {
				return 34838;
			}
			if (Static199.aClass255_10 == this.aClass255_22) {
				return 34840;
			}
			if (Static368.aClass255_16 == this.aClass255_22) {
				return 34841;
			}
			if (Static138.aClass255_7 == this.aClass255_22) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "(I)I")
	private int method7447() {
		@Pc(14) int local14 = this.anInt8822 * this.aClass206_18.anInt5575 * this.aClass255_22.anInt7179;
		return this.aBoolean638 ? local14 * 4 / 3 : local14;
	}
}
