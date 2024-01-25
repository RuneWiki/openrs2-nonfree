import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public abstract class Class149 implements Interface20 {

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!dca;")
	private Class54 aClass54_11 = Static299.aClass54_6;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Lclient!jg;")
	protected final Class172 aClass172_20;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
	private final boolean aBoolean673;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
	protected final int anInt9000;

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
	private final int anInt9010;

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "Lclient!tba;")
	protected final Class78_Sub1_Sub2 aClass78_Sub1_Sub2_11;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!pn;")
	protected final Class271 aClass271_13;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	private int anInt9001;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!tba;ILclient!pn;Lclient!jg;IZ)V")
	protected Class149(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class271 arg2, @OriginalArg(3) Class172 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass172_20 = arg3;
		this.aBoolean673 = arg5;
		this.anInt9000 = arg1;
		this.anInt9010 = arg4;
		this.aClass78_Sub1_Sub2_11 = arg0;
		this.aClass271_13 = arg2;
		OpenGL.glGenTextures(1, Static344.anIntArray378, 0);
		this.anInt9001 = Static344.anIntArray378[0];
		this.method7300();
		this.method7307();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!dca;B)V")
	@Override
	public final void method7298(@OriginalArg(0) Class54 arg0) {
		if (this.aClass54_11 != arg0) {
			this.aClass54_11 = arg0;
			this.method7300();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	private void method7300() {
		this.aClass78_Sub1_Sub2_11.method6931(this);
		if (this.aClass54_11 == Static299.aClass54_6) {
			OpenGL.glTexParameteri(this.anInt9000, 10241, this.aBoolean673 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9000, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9000, 10241, this.aBoolean673 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9000, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
	private void method7301() {
		if (this.anInt9001 > 0) {
			this.aClass78_Sub1_Sub2_11.method6991(this.anInt9001, this.method7310());
			this.anInt9001 = 0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)I")
	protected final int method7302() {
		if (this.aClass172_20 == Static243.aClass172_9) {
			if (Static573.aClass271_15 == this.aClass271_13) {
				return 6407;
			}
			if (Static429.aClass271_12 == this.aClass271_13) {
				return 6408;
			}
			if (Static268.aClass271_7 == this.aClass271_13) {
				return 6406;
			}
			if (this.aClass271_13 == Static253.aClass271_6) {
				return 6409;
			}
			if (this.aClass271_13 == Static560.aClass271_14) {
				return 6410;
			}
			if (this.aClass271_13 == Static243.aClass271_5) {
				return 6145;
			}
		} else if (Static243.aClass172_12 == this.aClass172_20) {
			if (this.aClass271_13 == Static573.aClass271_15) {
				return 34843;
			}
			if (this.aClass271_13 == Static429.aClass271_12) {
				return 34842;
			}
			if (Static268.aClass271_7 == this.aClass271_13) {
				return 34844;
			}
			if (Static253.aClass271_6 == this.aClass271_13) {
				return 34846;
			}
			if (this.aClass271_13 == Static560.aClass271_14) {
				return 34847;
			}
			if (Static243.aClass271_5 == this.aClass271_13) {
				return 6145;
			}
		} else if (this.aClass172_20 == Static243.aClass172_13) {
			if (this.aClass271_13 == Static573.aClass271_15) {
				return 34837;
			}
			if (this.aClass271_13 == Static429.aClass271_12) {
				return 34836;
			}
			if (this.aClass271_13 == Static268.aClass271_7) {
				return 34838;
			}
			if (Static253.aClass271_6 == this.aClass271_13) {
				return 34840;
			}
			if (this.aClass271_13 == Static560.aClass271_14) {
				return 34841;
			}
			if (this.aClass271_13 == Static243.aClass271_5) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oe", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7301();
		super.finalize();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[BIII)V")
	protected final void method7303(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static166.method6223(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static166.method6223(arg2)) {
			@Pc(31) int local31 = this.aClass271_13.anInt7253;
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg2 > arg0 ? arg0 : arg2;
			@Pc(48) int local48 = arg0 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(60) byte[] local60 = arg1;
			@Pc(67) byte[] local67 = new byte[local48 * local52 * local31];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local33, this.method7302(), arg0, arg2, 0, Static267.method3896(this.aClass271_13), 5121, local60, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(93) int local93 = local31 * arg0;
				for (@Pc(95) int local95 = 0; local95 < local31; local95++) {
					@Pc(99) int local99 = local95;
					@Pc(101) int local101 = local95;
					@Pc(105) int local105 = local95 + local93;
					for (@Pc(107) int local107 = 0; local107 < local52; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local48; local111++) {
							@Pc(117) byte local117 = local60[local101];
							local101 += local31;
							@Pc(127) int local127 = local117 + local60[local101];
							@Pc(133) int local133 = local127 + local60[local105];
							local101 += local31;
							local105 += local31;
							@Pc(147) int local147 = local133 + local60[local105];
							local67[local99] = (byte) (local147 >> 2);
							local105 += local31;
							local99 += local31;
						}
						local101 += local93;
						local105 += local93;
					}
				}
				@Pc(188) byte[] local188 = local67;
				local67 = local60;
				arg0 = local48;
				arg2 = local52;
				local60 = local188;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local33++;
				local44 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIZ[I)V")
	protected final void method7304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 > 0 && !Static166.method6223(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 > 0 && !Static166.method6223(arg1)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass271_13 == Static429.aClass271_12) {
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg2 < arg1 ? arg2 : arg1;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(70) int local70 = arg1 >> 1;
			@Pc(72) int[] local72 = arg3;
			@Pc(77) int[] local77 = new int[local70 * local59];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local44, this.method7302(), arg2, arg1, 0, 32993, this.aClass78_Sub1_Sub2_11.anInt8681, local72, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(98) int local98 = 0;
				@Pc(100) int local100 = 0;
				@Pc(105) int local105 = arg2;
				for (@Pc(107) int local107 = 0; local107 < local70; local107++) {
					for (@Pc(111) int local111 = 0; local111 < local59; local111++) {
						@Pc(118) int local118 = local72[local100++];
						@Pc(123) int local123 = local72[local100++];
						@Pc(128) int local128 = local72[local105++];
						@Pc(133) int local133 = local72[local105++];
						@Pc(139) int local139 = local118 >> 24 & 0xFF;
						@Pc(145) int local145 = local118 >> 8 & 0xFF;
						@Pc(149) int local149 = local118 & 0xFF;
						@Pc(155) int local155 = local118 >> 16 & 0xFF;
						@Pc(163) int local163 = local155 + (local123 >> 16 & 0xFF);
						@Pc(171) int local171 = local145 + (local123 >> 8 & 0xFF);
						@Pc(179) int local179 = local139 + (local123 >> 24 & 0xFF);
						@Pc(185) int local185 = local149 + (local123 & 0xFF);
						@Pc(193) int local193 = local171 + (local128 >> 8 & 0xFF);
						@Pc(201) int local201 = local179 + (local128 >> 24 & 0xFF);
						@Pc(209) int local209 = local163 + (local128 >> 16 & 0xFF);
						@Pc(215) int local215 = local185 + (local128 & 0xFF);
						@Pc(223) int local223 = local209 + (local133 >> 16 & 0xFF);
						@Pc(231) int local231 = local201 + (local133 >> 24 & 0xFF);
						@Pc(239) int local239 = local193 + (local133 >> 8 & 0xFF);
						@Pc(245) int local245 = local215 + (local133 & 0xFF);
						local77[local98++] = (local223 & 0x3FC) << 14 | (local231 & 0x3FC) << 22 | (local239 & 0x3FC) << 6 | local245 >> 2 & 0xFF;
					}
					local100 += arg2;
					local105 += arg2;
				}
				@Pc(290) int[] local290 = local77;
				local77 = local72;
				arg1 = local70;
				arg2 = local59;
				local72 = local290;
				local59 >>= 0x1;
				local44++;
				local70 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
	private void method7307() {
		this.aClass78_Sub1_Sub2_11.anInt8556 += this.method7310();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B[FIII)V")
	protected final void method7308(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static166.method6223(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static166.method6223(arg1)) {
			@Pc(34) int local34 = this.aClass271_13.anInt7253;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg2 >= arg1 ? arg1 : arg2;
			@Pc(47) int local47 = arg2 >> 1;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(53) float[] local53 = arg0;
			@Pc(60) float[] local60 = new float[local51 * local47 * local34];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local36, this.method7302(), arg2, arg1, 0, Static267.method3896(this.aClass271_13), 5126, local53, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(94) int local94 = local34 * arg2;
				@Pc(96) float[] local96 = local60;
				for (@Pc(98) int local98 = 0; local98 < local34; local98++) {
					@Pc(102) int local102 = local98;
					@Pc(104) int local104 = local98;
					@Pc(108) int local108 = local94 + local98;
					for (@Pc(110) int local110 = 0; local110 < local51; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local47; local114++) {
							@Pc(120) float local120 = local53[local104];
							local104 += local34;
							@Pc(130) float local130 = local120 + local53[local104];
							@Pc(136) float local136 = local130 + local53[local108];
							local104 += local34;
							local108 += local34;
							@Pc(150) float local150 = local136 + local53[local108];
							local60[local102] = local150 * 0.25F;
							local108 += local34;
							local102 += local34;
						}
						local104 += local94;
						local108 += local94;
					}
				}
				local60 = local53;
				local53 = local96;
				arg1 = local51;
				arg2 = local47;
				local43 >>= 0x1;
				local47 >>= 0x1;
				local51 >>= 0x1;
				local36++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)I")
	private int method7310() {
		@Pc(14) int local14 = this.aClass271_13.anInt7253 * this.aClass172_20.anInt4482 * this.anInt9010;
		return this.aBoolean673 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7299() {
		@Pc(14) int local14 = this.aClass78_Sub1_Sub2_11.method6892();
		@Pc(20) int local20 = this.aClass78_Sub1_Sub2_11.anIntArray522[local14];
		if (local20 != this.anInt9000) {
			if (local20 != 0) {
				OpenGL.glBindTexture(local20, 0);
				OpenGL.glDisable(local20);
			}
			OpenGL.glEnable(this.anInt9000);
			this.aClass78_Sub1_Sub2_11.anIntArray522[local14] = this.anInt9000;
		}
		OpenGL.glBindTexture(this.anInt9000, this.anInt9001);
	}
}
