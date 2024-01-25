import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public abstract class Class25 implements Interface4 {

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "Lclient!nd;")
	private Class216 aClass216_11 = Static121.aClass216_4;

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
	protected final int anInt10584;

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "Lclient!kt;")
	protected final Class178 aClass178_15;

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "Lclient!kq;")
	protected final Class176 aClass176_20;

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "Z")
	private final boolean aBoolean833;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "Lclient!hl;")
	protected final Class5_Sub2_Sub2 aClass5_Sub2_Sub2_12;

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
	private final int anInt10588;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
	private int anInt10590;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!hl;ILclient!kt;Lclient!kq;IZ)V")
	protected Class25(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class176 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt10584 = arg1;
		this.aClass178_15 = arg2;
		this.aClass176_20 = arg3;
		this.aBoolean833 = arg5;
		this.aClass5_Sub2_Sub2_12 = arg0;
		this.anInt10588 = arg4;
		OpenGL.glGenTextures(1, Static581.anIntArray525, 0);
		this.anInt10590 = Static581.anIntArray525[0];
		this.method8621();
		this.method8622();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[FZII)V")
	protected final void method8612(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static152.method3040(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static152.method3040(arg2)) {
			@Pc(34) int local34 = this.aClass178_15.anInt6173;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg0 < arg2 ? arg0 : arg2;
			@Pc(51) int local51 = arg0 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) float[] local57 = arg1;
			@Pc(64) float[] local64 = new float[local51 * local55 * local34];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local40, this.method8616(), arg0, arg2, 0, Static360.method5822(this.aClass178_15), 5126, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(87) int local87 = arg0 * local34;
				for (@Pc(89) int local89 = 0; local89 < local34; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(100) int local100 = local89 + local87;
					for (@Pc(102) int local102 = 0; local102 < local55; local102++) {
						for (@Pc(106) int local106 = 0; local106 < local51; local106++) {
							@Pc(112) float local112 = local57[local95];
							local95 += local34;
							@Pc(122) float local122 = local112 + local57[local95];
							local95 += local34;
							@Pc(132) float local132 = local122 + local57[local100];
							local100 += local34;
							@Pc(142) float local142 = local132 + local57[local100];
							local64[local93] = local142 * 0.25F;
							local100 += local34;
							local93 += local34;
						}
						local100 += local87;
						local95 += local87;
					}
				}
				@Pc(186) float[] local186 = local64;
				local64 = local57;
				arg0 = local51;
				arg2 = local55;
				local57 = local186;
				local40++;
				local47 >>= 0x1;
				local55 >>= 0x1;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	@Override
	public final void method8611() {
		@Pc(12) int local12 = this.aClass5_Sub2_Sub2_12.method3970();
		@Pc(18) int local18 = this.aClass5_Sub2_Sub2_12.anIntArray209[local12];
		if (this.anInt10584 != local18) {
			if (local18 != 0) {
				OpenGL.glBindTexture(local18, 0);
				OpenGL.glDisable(local18);
			}
			OpenGL.glEnable(this.anInt10584);
			this.aClass5_Sub2_Sub2_12.anIntArray209[local12] = this.anInt10584;
		}
		OpenGL.glBindTexture(this.anInt10584, this.anInt10590);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
	private void method8614() {
		if (this.anInt10590 > 0) {
			this.aClass5_Sub2_Sub2_12.method4073(this.anInt10590, this.method8617());
			this.anInt10590 = 0;
		}
	}

	@OriginalMember(owner = "client!bj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8614();
		super.finalize();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLclient!nd;)V")
	@Override
	public final void method8610(@OriginalArg(1) Class216 arg0) {
		if (this.aClass216_11 != arg0) {
			this.aClass216_11 = arg0;
			this.method8621();
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([BIIII)V")
	protected final void method8615(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static152.method3040(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static152.method3040(arg1)) {
			@Pc(37) int local37 = this.aClass178_15.anInt6173;
			@Pc(39) int local39 = 0;
			@Pc(55) int local55 = arg2 >= arg1 ? arg1 : arg2;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(63) int local63 = arg1 >> 1;
			@Pc(65) byte[] local65 = arg0;
			@Pc(72) byte[] local72 = new byte[local59 * local63 * local37];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local39, this.method8616(), arg2, arg1, 0, Static360.method5822(this.aClass178_15), 5121, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(96) int local96 = arg2 * local37;
				@Pc(98) byte[] local98 = local72;
				for (@Pc(100) int local100 = 0; local100 < local37; local100++) {
					@Pc(104) int local104 = local100;
					@Pc(106) int local106 = local100;
					@Pc(110) int local110 = local96 + local100;
					for (@Pc(112) int local112 = 0; local112 < local63; local112++) {
						for (@Pc(116) int local116 = 0; local116 < local59; local116++) {
							@Pc(122) byte local122 = local65[local106];
							local106 += local37;
							@Pc(132) int local132 = local122 + local65[local106];
							@Pc(138) int local138 = local132 + local65[local110];
							local106 += local37;
							local110 += local37;
							@Pc(152) int local152 = local138 + local65[local110];
							local110 += local37;
							local72[local104] = (byte) (local152 >> 2);
							local104 += local37;
						}
						local106 += local96;
						local110 += local96;
					}
				}
				local72 = local65;
				local65 = local98;
				arg2 = local59;
				arg1 = local63;
				local63 >>= 0x1;
				local39++;
				local59 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)I")
	protected final int method8616() {
		if (Static302.aClass176_8 == this.aClass176_20) {
			if (Static457.aClass178_11 == this.aClass178_15) {
				return 6407;
			}
			if (this.aClass178_15 == Static120.aClass178_4) {
				return 6408;
			}
			if (Static268.aClass178_6 == this.aClass178_15) {
				return 6406;
			}
			if (this.aClass178_15 == Static321.aClass178_7) {
				return 6409;
			}
			if (this.aClass178_15 == Static137.aClass178_5) {
				return 6410;
			}
			if (this.aClass178_15 == Static493.aClass178_12) {
				return 6145;
			}
		} else if (Static302.aClass176_11 == this.aClass176_20) {
			if (this.aClass178_15 == Static457.aClass178_11) {
				return 34843;
			}
			if (Static120.aClass178_4 == this.aClass178_15) {
				return 34842;
			}
			if (this.aClass178_15 == Static268.aClass178_6) {
				return 34844;
			}
			if (this.aClass178_15 == Static321.aClass178_7) {
				return 34846;
			}
			if (this.aClass178_15 == Static137.aClass178_5) {
				return 34847;
			}
			if (Static493.aClass178_12 == this.aClass178_15) {
				return 6145;
			}
		} else if (Static302.aClass176_12 == this.aClass176_20) {
			if (Static457.aClass178_11 == this.aClass178_15) {
				return 34837;
			}
			if (Static120.aClass178_4 == this.aClass178_15) {
				return 34836;
			}
			if (Static268.aClass178_6 == this.aClass178_15) {
				return 34838;
			}
			if (Static321.aClass178_7 == this.aClass178_15) {
				return 34840;
			}
			if (Static137.aClass178_5 == this.aClass178_15) {
				return 34841;
			}
			if (this.aClass178_15 == Static493.aClass178_12) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)I")
	private int method8617() {
		@Pc(22) int local22 = this.aClass176_20.anInt6139 * this.aClass178_15.anInt6173 * this.anInt10588;
		return this.aBoolean833 ? local22 * 4 / 3 : local22;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[IIII)V")
	protected final void method8620(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static152.method3040(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static152.method3040(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass178_15 == Static120.aClass178_4) {
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg0 < arg2 ? arg0 : arg2;
			@Pc(52) int local52 = arg0 >> 1;
			@Pc(56) int local56 = arg2 >> 1;
			@Pc(68) int[] local68 = arg1;
			@Pc(73) int[] local73 = new int[local56 * local52];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local41, this.method8616(), arg0, arg2, 0, 32993, this.aClass5_Sub2_Sub2_12.anInt4984, local68, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(96) int local96 = 0;
				@Pc(98) int local98 = 0;
				@Pc(102) int local102 = arg0;
				for (@Pc(104) int local104 = 0; local104 < local56; local104++) {
					for (@Pc(108) int local108 = 0; local108 < local52; local108++) {
						@Pc(115) int local115 = local68[local98++];
						@Pc(120) int local120 = local68[local98++];
						@Pc(125) int local125 = local68[local102++];
						@Pc(131) int local131 = local115 >> 8 & 0xFF;
						@Pc(135) int local135 = local115 & 0xFF;
						@Pc(141) int local141 = local115 >> 16 & 0xFF;
						@Pc(147) int local147 = local115 >> 24 & 0xFF;
						@Pc(152) int local152 = local68[local102++];
						@Pc(160) int local160 = local141 + (local120 >> 16 & 0xFF);
						@Pc(168) int local168 = local131 + (local120 >> 8 & 0xFF);
						@Pc(176) int local176 = local147 + (local120 >> 24 & 0xFF);
						@Pc(182) int local182 = local135 + (local120 & 0xFF);
						@Pc(188) int local188 = local182 + (local125 & 0xFF);
						@Pc(196) int local196 = local168 + (local125 >> 8 & 0xFF);
						@Pc(204) int local204 = local176 + (local125 >> 24 & 0xFF);
						@Pc(212) int local212 = local160 + (local125 >> 16 & 0xFF);
						@Pc(218) int local218 = local188 + (local152 & 0xFF);
						@Pc(226) int local226 = local196 + (local152 >> 8 & 0xFF);
						@Pc(234) int local234 = local204 + (local152 >> 24 & 0xFF);
						@Pc(242) int local242 = local212 + (local152 >> 16 & 0xFF);
						local73[local96++] = local218 >> 2 & 0xFF | (local234 & 0x3FC) << 22 | (local242 & 0x3FC) << 14 | (local226 & 0x3FC) << 6;
					}
					local98 += arg0;
					local102 += arg0;
				}
				@Pc(295) int[] local295 = local73;
				local73 = local68;
				arg0 = local52;
				arg2 = local56;
				local68 = local295;
				local56 >>= 0x1;
				local52 >>= 0x1;
				local48 >>= 0x1;
				local41++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)V")
	private void method8621() {
		this.aClass5_Sub2_Sub2_12.method4008(this);
		if (Static121.aClass216_4 == this.aClass216_11) {
			OpenGL.glTexParameteri(this.anInt10584, 10241, this.aBoolean833 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10584, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10584, 10241, this.aBoolean833 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10584, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)V")
	private void method8622() {
		this.aClass5_Sub2_Sub2_12.anInt4854 += this.method8617();
	}
}
