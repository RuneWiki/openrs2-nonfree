import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public abstract class Class197 implements Interface6 {

	@OriginalMember(owner = "client!kca", name = "m", descriptor = "Lclient!cg;")
	private Class54 aClass54_11 = Static216.aClass54_3;

	@OriginalMember(owner = "client!kca", name = "w", descriptor = "Lclient!et;")
	protected final Class104 aClass104_19;

	@OriginalMember(owner = "client!kca", name = "u", descriptor = "Lclient!tk;")
	protected final Class13_Sub3_Sub1 aClass13_Sub3_Sub1_12;

	@OriginalMember(owner = "client!kca", name = "r", descriptor = "I")
	private final int anInt10380;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
	protected final int anInt10370;

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "Lclient!wha;")
	protected final Class381 aClass381_20;

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "Z")
	private final boolean aBoolean753;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
	private int anInt10368;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!tk;ILclient!et;Lclient!wha;IZ)V")
	protected Class197(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) Class381 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass104_19 = arg2;
		this.aClass13_Sub3_Sub1_12 = arg0;
		this.anInt10380 = arg4;
		this.anInt10370 = arg1;
		this.aClass381_20 = arg3;
		this.aBoolean753 = arg5;
		OpenGL.glGenTextures(1, Static98.anIntArray742, 0);
		this.anInt10368 = Static98.anIntArray742[0];
		this.method8824();
		this.method8822();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILclient!cg;)V")
	@Override
	public final void method8818(@OriginalArg(1) Class54 arg0) {
		if (arg0 != this.aClass54_11) {
			this.aClass54_11 = arg0;
			this.method8824();
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(III[II)V")
	protected final void method8819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg0 > 0 && !Static608.method8539(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static608.method8539(arg2)) {
			throw new IllegalArgumentException("");
		} else if (Static78.aClass104_3 == this.aClass104_19) {
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg2 <= arg0 ? arg2 : arg0;
			@Pc(52) int local52 = arg0 >> 1;
			@Pc(56) int local56 = arg2 >> 1;
			@Pc(58) int[] local58 = arg3;
			@Pc(63) int[] local63 = new int[local56 * local52];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local41, this.method8826(), arg0, arg2, 0, 32993, this.aClass13_Sub3_Sub1_12.anInt9186, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(90) int local90 = arg0;
				@Pc(92) int[] local92 = local63;
				for (@Pc(94) int local94 = 0; local94 < local56; local94++) {
					for (@Pc(98) int local98 = 0; local98 < local52; local98++) {
						@Pc(105) int local105 = local58[local86++];
						@Pc(110) int local110 = local58[local86++];
						@Pc(115) int local115 = local58[local90++];
						@Pc(120) int local120 = local58[local90++];
						@Pc(124) int local124 = local105 & 0xFF;
						@Pc(130) int local130 = local105 >> 8 & 0xFF;
						@Pc(136) int local136 = local105 >> 24 & 0xFF;
						@Pc(142) int local142 = local105 >> 16 & 0xFF;
						@Pc(150) int local150 = local136 + (local110 >> 24 & 0xFF);
						@Pc(158) int local158 = local142 + (local110 >> 16 & 0xFF);
						@Pc(166) int local166 = local130 + (local110 >> 8 & 0xFF);
						@Pc(172) int local172 = local124 + (local110 & 0xFF);
						@Pc(178) int local178 = local172 + (local115 & 0xFF);
						@Pc(186) int local186 = local150 + (local115 >> 24 & 0xFF);
						@Pc(194) int local194 = local166 + (local115 >> 8 & 0xFF);
						@Pc(202) int local202 = local158 + (local115 >> 16 & 0xFF);
						@Pc(210) int local210 = local186 + (local120 >> 24 & 0xFF);
						@Pc(218) int local218 = local194 + (local120 >> 8 & 0xFF);
						@Pc(226) int local226 = local202 + (local120 >> 16 & 0xFF);
						@Pc(232) int local232 = local178 + (local120 & 0xFF);
						local63[local84++] = local232 >> 2 & 0xFF | (local218 & 0x3FC) << 6 | (local210 & 0x3FC) << 22 | (local226 & 0x3FC) << 14;
					}
					local90 += arg0;
					local86 += arg0;
				}
				local63 = local58;
				arg2 = local56;
				local58 = local92;
				arg0 = local52;
				local48 >>= 0x1;
				local41++;
				local56 >>= 0x1;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kca", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8825();
		super.finalize();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(II)V")
	private void method8822() {
		this.aClass13_Sub3_Sub1_12.anInt9719 += this.method8828();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BIII[B)V")
	protected final void method8823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg2 > 0 && !Static608.method8539(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static608.method8539(arg1)) {
			@Pc(31) int local31 = this.aClass104_19.anInt2988;
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg2 < arg1 ? arg2 : arg1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(58) byte[] local58 = arg3;
			@Pc(65) byte[] local65 = new byte[local31 * local52 * local56];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local33, this.method8826(), arg2, arg1, 0, Static626.method8676(this.aClass104_19), 5121, local58, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(88) int local88 = arg2 * local31;
				for (@Pc(90) int local90 = 0; local90 < local31; local90++) {
					@Pc(94) int local94 = local90;
					@Pc(96) int local96 = local90;
					@Pc(100) int local100 = local88 + local90;
					for (@Pc(102) int local102 = 0; local102 < local56; local102++) {
						for (@Pc(106) int local106 = 0; local106 < local52; local106++) {
							@Pc(112) byte local112 = local58[local96];
							local96 += local31;
							@Pc(122) int local122 = local112 + local58[local96];
							@Pc(128) int local128 = local122 + local58[local100];
							local96 += local31;
							local100 += local31;
							@Pc(142) int local142 = local128 + local58[local100];
							local65[local94] = (byte) (local142 >> 2);
							local100 += local31;
							local94 += local31;
						}
						local96 += local88;
						local100 += local88;
					}
				}
				@Pc(183) byte[] local183 = local65;
				local65 = local58;
				local58 = local183;
				arg2 = local52;
				arg1 = local56;
				local56 >>= 0x1;
				local33++;
				local44 >>= 0x1;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "(I)V")
	private void method8824() {
		this.aClass13_Sub3_Sub1_12.method8234(this);
		if (this.aClass54_11 == Static216.aClass54_3) {
			OpenGL.glTexParameteri(this.anInt10370, 10241, this.aBoolean753 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10370, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10370, 10241, this.aBoolean753 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10370, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)V")
	private void method8825() {
		if (this.anInt10368 > 0) {
			this.aClass13_Sub3_Sub1_12.method7819(this.anInt10368, this.method8828());
			this.anInt10368 = 0;
		}
	}

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "(I)I")
	protected final int method8826() {
		if (Static638.aClass381_15 == this.aClass381_20) {
			if (this.aClass104_19 == Static509.aClass104_14) {
				return 6407;
			}
			if (this.aClass104_19 == Static78.aClass104_3) {
				return 6408;
			}
			if (this.aClass104_19 == Static210.aClass104_18) {
				return 6406;
			}
			if (this.aClass104_19 == Static133.aClass104_4) {
				return 6409;
			}
			if (Static219.aClass104_7 == this.aClass104_19) {
				return 6410;
			}
			if (this.aClass104_19 == Static433.aClass104_12) {
				return 6145;
			}
		} else if (Static638.aClass381_18 == this.aClass381_20) {
			if (this.aClass104_19 == Static509.aClass104_14) {
				return 34843;
			}
			if (Static78.aClass104_3 == this.aClass104_19) {
				return 34842;
			}
			if (Static210.aClass104_18 == this.aClass104_19) {
				return 34844;
			}
			if (Static133.aClass104_4 == this.aClass104_19) {
				return 34846;
			}
			if (this.aClass104_19 == Static219.aClass104_7) {
				return 34847;
			}
			if (Static433.aClass104_12 == this.aClass104_19) {
				return 6145;
			}
		} else if (this.aClass381_20 == Static638.aClass381_19) {
			if (Static509.aClass104_14 == this.aClass104_19) {
				return 34837;
			}
			if (this.aClass104_19 == Static78.aClass104_3) {
				return 34836;
			}
			if (Static210.aClass104_18 == this.aClass104_19) {
				return 34838;
			}
			if (this.aClass104_19 == Static133.aClass104_4) {
				return 34840;
			}
			if (this.aClass104_19 == Static219.aClass104_7) {
				return 34841;
			}
			if (this.aClass104_19 == Static433.aClass104_12) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
	@Override
	public final void method8817() {
		@Pc(8) int local8 = this.aClass13_Sub3_Sub1_12.method8219();
		@Pc(14) int local14 = this.aClass13_Sub3_Sub1_12.anIntArray661[local8];
		if (local14 != this.anInt10370) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt10370);
			this.aClass13_Sub3_Sub1_12.anIntArray661[local8] = this.anInt10370;
		}
		OpenGL.glBindTexture(this.anInt10370, this.anInt10368);
	}

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "(I)I")
	private int method8828() {
		@Pc(24) int local24 = this.anInt10380 * this.aClass104_19.anInt2988 * this.aClass381_20.anInt10306;
		return this.aBoolean753 ? local24 * 4 / 3 : local24;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(II[FII)V")
	protected final void method8829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static608.method8539(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static608.method8539(arg3)) {
			@Pc(35) int local35 = this.aClass104_19.anInt2988;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg3 ? arg1 : arg3;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg3 >> 1;
			@Pc(54) float[] local54 = arg2;
			@Pc(61) float[] local61 = new float[local35 * local52 * local48];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, this.method8826(), arg1, arg3, 0, Static626.method8676(this.aClass104_19), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(87) int local87 = arg1 * local35;
				@Pc(89) float[] local89 = local61;
				for (@Pc(91) int local91 = 0; local91 < local35; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(102) int local102 = local91 + local87;
					for (@Pc(104) int local104 = 0; local104 < local52; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local48; local108++) {
							@Pc(114) float local114 = local54[local97];
							local97 += local35;
							@Pc(124) float local124 = local114 + local54[local97];
							@Pc(130) float local130 = local124 + local54[local102];
							local97 += local35;
							local102 += local35;
							@Pc(144) float local144 = local130 + local54[local102];
							local61[local95] = local144 * 0.25F;
							local102 += local35;
							local95 += local35;
						}
						local102 += local87;
						local97 += local87;
					}
				}
				local61 = local54;
				arg1 = local48;
				arg3 = local52;
				local54 = local89;
				local37++;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
