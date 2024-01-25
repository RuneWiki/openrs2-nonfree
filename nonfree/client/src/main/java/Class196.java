import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public abstract class Class196 implements Interface16 {

	@OriginalMember(owner = "client!mga", name = "e", descriptor = "Lclient!fw;")
	private Class110 aClass110_11 = Static63.aClass110_1;

	@OriginalMember(owner = "client!mga", name = "x", descriptor = "Lclient!fca;")
	protected final Class97 aClass97_56;

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "Lclient!dda;")
	protected final Class44_Sub2_Sub1 aClass44_Sub2_Sub1_12;

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
	private final int anInt10113;

	@OriginalMember(owner = "client!mga", name = "u", descriptor = "Lclient!bv;")
	protected final Class42 aClass42_20;

	@OriginalMember(owner = "client!mga", name = "l", descriptor = "Z")
	private final boolean aBoolean716;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
	protected final int anInt10110;

	@OriginalMember(owner = "client!mga", name = "q", descriptor = "I")
	private int anInt10123;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!dda;ILclient!fca;Lclient!bv;IZ)V")
	protected Class196(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass97_56 = arg2;
		this.aClass44_Sub2_Sub1_12 = arg0;
		this.anInt10113 = arg4;
		this.aClass42_20 = arg3;
		this.aBoolean716 = arg5;
		this.anInt10110 = arg1;
		OpenGL.glGenTextures(1, Static560.anIntArray529, 0);
		this.anInt10123 = Static560.anIntArray529[0];
		this.method8272();
		this.method8269();
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)V")
	private void method8269() {
		this.aClass44_Sub2_Sub1_12.anInt4932 += this.method8275();
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILclient!fw;)V")
	@Override
	public final void method8268(@OriginalArg(1) Class110 arg0) {
		if (arg0 != this.aClass110_11) {
			this.aClass110_11 = arg0;
			this.method8272();
		}
	}

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)V")
	private void method8271() {
		if (this.anInt10123 > 0) {
			this.aClass44_Sub2_Sub1_12.method2020(this.anInt10123, this.method8275());
			this.anInt10123 = 0;
		}
	}

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "(I)V")
	private void method8272() {
		this.aClass44_Sub2_Sub1_12.method4265(this);
		if (this.aClass110_11 == Static63.aClass110_1) {
			OpenGL.glTexParameteri(this.anInt10110, 10241, this.aBoolean716 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10110, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10110, 10241, this.aBoolean716 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10110, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!mga", name = "e", descriptor = "(I)I")
	private int method8275() {
		@Pc(22) int local22 = this.aClass42_20.anInt771 * this.aClass97_56.anInt2836 * this.anInt10113;
		return this.aBoolean716 ? local22 * 4 / 3 : local22;
	}

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "(I)I")
	protected final int method8276() {
		if (Static53.aClass42_4 == this.aClass42_20) {
			if (Static352.aClass97_38 == this.aClass97_56) {
				return 6407;
			}
			if (this.aClass97_56 == Static7.aClass97_5) {
				return 6408;
			}
			if (Static362.aClass97_41 == this.aClass97_56) {
				return 6406;
			}
			if (Static466.aClass97_52 == this.aClass97_56) {
				return 6409;
			}
			if (this.aClass97_56 == Static480.aClass97_55) {
				return 6410;
			}
			if (this.aClass97_56 == Static258.aClass97_24) {
				return 6145;
			}
		} else if (Static53.aClass42_7 == this.aClass42_20) {
			if (this.aClass97_56 == Static352.aClass97_38) {
				return 34843;
			}
			if (Static7.aClass97_5 == this.aClass97_56) {
				return 34842;
			}
			if (Static362.aClass97_41 == this.aClass97_56) {
				return 34844;
			}
			if (Static466.aClass97_52 == this.aClass97_56) {
				return 34846;
			}
			if (this.aClass97_56 == Static480.aClass97_55) {
				return 34847;
			}
			if (this.aClass97_56 == Static258.aClass97_24) {
				return 6145;
			}
		} else if (this.aClass42_20 == Static53.aClass42_8) {
			if (Static352.aClass97_38 == this.aClass97_56) {
				return 34837;
			}
			if (this.aClass97_56 == Static7.aClass97_5) {
				return 34836;
			}
			if (this.aClass97_56 == Static362.aClass97_41) {
				return 34838;
			}
			if (this.aClass97_56 == Static466.aClass97_52) {
				return 34840;
			}
			if (Static480.aClass97_55 == this.aClass97_56) {
				return 34841;
			}
			if (Static258.aClass97_24 == this.aClass97_56) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIZI[I)V")
	protected final void method8278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 > 0 && !Static100.method2181(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 > 0 && !Static100.method2181(arg1)) {
			throw new IllegalArgumentException("");
		} else if (Static7.aClass97_5 == this.aClass97_56) {
			@Pc(51) int local51 = 0;
			@Pc(58) int local58 = arg0 >= arg1 ? arg1 : arg0;
			@Pc(62) int local62 = arg0 >> 1;
			@Pc(66) int local66 = arg1 >> 1;
			@Pc(68) int[] local68 = arg3;
			@Pc(73) int[] local73 = new int[local66 * local62];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local51, this.method8276(), arg0, arg1, 0, 32993, this.aClass44_Sub2_Sub1_12.anInt2122, local68, 0);
				if (local58 <= 1) {
					return;
				}
				@Pc(96) int local96 = 0;
				@Pc(98) int local98 = 0;
				@Pc(103) int local103 = arg0;
				@Pc(105) int[] local105 = local73;
				for (@Pc(107) int local107 = 0; local107 < local66; local107++) {
					for (@Pc(111) int local111 = 0; local111 < local62; local111++) {
						@Pc(118) int local118 = local68[local98++];
						@Pc(123) int local123 = local68[local103++];
						@Pc(128) int local128 = local68[local98++];
						@Pc(132) int local132 = local118 & 0xFF;
						@Pc(137) int local137 = local68[local103++];
						@Pc(143) int local143 = local118 >> 24 & 0xFF;
						@Pc(149) int local149 = local118 >> 8 & 0xFF;
						@Pc(155) int local155 = local118 >> 16 & 0xFF;
						@Pc(163) int local163 = local149 + (local128 >> 8 & 0xFF);
						@Pc(169) int local169 = local132 + (local128 & 0xFF);
						@Pc(177) int local177 = local155 + (local128 >> 16 & 0xFF);
						@Pc(185) int local185 = local143 + (local128 >> 24 & 0xFF);
						@Pc(191) int local191 = local169 + (local123 & 0xFF);
						@Pc(199) int local199 = local185 + (local123 >> 24 & 0xFF);
						@Pc(207) int local207 = local163 + (local123 >> 8 & 0xFF);
						@Pc(215) int local215 = local177 + (local123 >> 16 & 0xFF);
						@Pc(223) int local223 = local207 + (local137 >> 8 & 0xFF);
						@Pc(229) int local229 = local191 + (local137 & 0xFF);
						@Pc(237) int local237 = local199 + (local137 >> 24 & 0xFF);
						@Pc(245) int local245 = local215 + (local137 >> 16 & 0xFF);
						local73[local96++] = local229 >> 2 & 0xFF | (local237 & 0x3FC) << 22 | (local245 & 0x3FC) << 14 | (local223 & 0x3FC) << 6;
					}
					local103 += arg0;
					local98 += arg0;
				}
				local73 = local68;
				arg0 = local62;
				arg1 = local66;
				local68 = local105;
				local58 >>= 0x1;
				local66 >>= 0x1;
				local62 >>= 0x1;
				local51++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I[FIZI)V")
	protected final void method8279(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static100.method2181(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static100.method2181(arg0)) {
			@Pc(40) int local40 = this.aClass97_56.anInt2836;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg0 > arg3 ? arg3 : arg0;
			@Pc(53) int local53 = arg3 >> 1;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(59) float[] local59 = arg1;
			@Pc(66) float[] local66 = new float[local53 * local57 * local40];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local42, this.method8276(), arg3, arg0, 0, Static445.method6846(this.aClass97_56), 5126, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg3 * local40;
				@Pc(94) float[] local94 = local66;
				for (@Pc(96) int local96 = 0; local96 < local40; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local92 + local96;
					for (@Pc(108) int local108 = 0; local108 < local57; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local53; local112++) {
							@Pc(118) float local118 = local59[local102];
							local102 += local40;
							@Pc(128) float local128 = local118 + local59[local102];
							local102 += local40;
							@Pc(138) float local138 = local128 + local59[local106];
							local106 += local40;
							@Pc(148) float local148 = local138 + local59[local106];
							local106 += local40;
							local66[local100] = local148 * 0.25F;
							local100 += local40;
						}
						local106 += local92;
						local102 += local92;
					}
				}
				local66 = local59;
				arg0 = local57;
				arg3 = local53;
				local59 = local94;
				local42++;
				local49 >>= 0x1;
				local53 >>= 0x1;
				local57 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(III[BI)V")
	protected final void method8280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static100.method2181(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static100.method2181(arg1)) {
			@Pc(31) int local31 = this.aClass97_56.anInt2836;
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg1 > arg0 ? arg0 : arg1;
			@Pc(48) int local48 = arg0 >> 1;
			@Pc(52) int local52 = arg1 >> 1;
			@Pc(54) byte[] local54 = arg2;
			@Pc(67) byte[] local67 = new byte[local31 * local52 * local48];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local33, this.method8276(), arg0, arg1, 0, Static445.method6846(this.aClass97_56), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(93) int local93 = arg0 * local31;
				@Pc(95) byte[] local95 = local67;
				for (@Pc(97) int local97 = 0; local97 < local31; local97++) {
					@Pc(101) int local101 = local97;
					@Pc(103) int local103 = local97;
					@Pc(107) int local107 = local93 + local97;
					for (@Pc(109) int local109 = 0; local109 < local52; local109++) {
						for (@Pc(113) int local113 = 0; local113 < local48; local113++) {
							@Pc(119) byte local119 = local54[local103];
							local103 += local31;
							@Pc(129) int local129 = local119 + local54[local103];
							local103 += local31;
							@Pc(139) int local139 = local129 + local54[local107];
							local107 += local31;
							@Pc(149) int local149 = local139 + local54[local107];
							local67[local101] = (byte) (local149 >> 2);
							local107 += local31;
							local101 += local31;
						}
						local103 += local93;
						local107 += local93;
					}
				}
				local67 = local54;
				arg0 = local48;
				local54 = local95;
				arg1 = local52;
				local33++;
				local52 >>= 0x1;
				local48 >>= 0x1;
				local44 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V")
	@Override
	public final void method8267() {
		@Pc(8) int local8 = this.aClass44_Sub2_Sub1_12.method4367();
		@Pc(14) int local14 = this.aClass44_Sub2_Sub1_12.anIntArray83[local8];
		if (this.anInt10110 != local14) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt10110);
			this.aClass44_Sub2_Sub1_12.anIntArray83[local8] = this.anInt10110;
		}
		OpenGL.glBindTexture(this.anInt10110, this.anInt10123);
	}

	@OriginalMember(owner = "client!mga", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8271();
		super.finalize();
	}
}
