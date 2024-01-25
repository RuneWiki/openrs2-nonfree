import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
	private int[] anIntArray390;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "S")
	private short aShort78;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
	private int anInt5082;

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "Lclient!uv;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "[Lclient!wq;")
	private Class265[] aClass265Array4;

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!ph", name = "J", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!ph", name = "P", descriptor = "[Lclient!bs;")
	private Class33[] aClass33Array1;

	@OriginalMember(owner = "client!ph", name = "U", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!ph", name = "W", descriptor = "[Lclient!qr;")
	private Class203[] aClass203Array4;

	@OriginalMember(owner = "client!ph", name = "bb", descriptor = "[F")
	private float[] aFloatArray31;

	@OriginalMember(owner = "client!ph", name = "db", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!ph", name = "hb", descriptor = "[Lclient!nb;")
	private Class170[] aClass170Array1;

	@OriginalMember(owner = "client!ph", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!ph", name = "jb", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!ph", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!ph", name = "nb", descriptor = "[B")
	private byte[] aByteArray61;

	@OriginalMember(owner = "client!ph", name = "pb", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!ph", name = "sb", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!ph", name = "tb", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!ph", name = "wb", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!ph", name = "zb", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!ph", name = "Ab", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!ph", name = "Cb", descriptor = "[B")
	private byte[] aByteArray62;

	@OriginalMember(owner = "client!ph", name = "Ib", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ph", name = "Kb", descriptor = "I")
	private int anInt5121;

	@OriginalMember(owner = "client!ph", name = "Lb", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!ph", name = "Mb", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!ph", name = "Nb", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!ph", name = "Pb", descriptor = "[I")
	private int[] anIntArray392;

	@OriginalMember(owner = "client!ph", name = "Sb", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!ph", name = "Tb", descriptor = "[F")
	private float[] aFloatArray32;

	@OriginalMember(owner = "client!ph", name = "Vb", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!ph", name = "Wb", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!ph", name = "Xb", descriptor = "I")
	private int anInt5126;

	@OriginalMember(owner = "client!ph", name = "bc", descriptor = "[I")
	private int[] anIntArray393;

	@OriginalMember(owner = "client!ph", name = "fc", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!ph", name = "jc", descriptor = "Lclient!ce;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!ph", name = "mc", descriptor = "Lclient!ct;")
	private Class50 aClass50_1;

	@OriginalMember(owner = "client!ph", name = "rc", descriptor = "B")
	private byte aByte71;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
	private int anInt5086 = 0;

	@OriginalMember(owner = "client!ph", name = "ab", descriptor = "Z")
	private boolean aBoolean413 = true;

	@OriginalMember(owner = "client!ph", name = "Yb", descriptor = "Z")
	private boolean aBoolean414 = false;

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
	private int anInt5087 = 0;

	@OriginalMember(owner = "client!ph", name = "Fb", descriptor = "I")
	private int anInt5118 = 0;

	@OriginalMember(owner = "client!ph", name = "Ub", descriptor = "I")
	private int anInt5125 = 0;

	@OriginalMember(owner = "client!ph", name = "cc", descriptor = "I")
	private int anInt5129 = 0;

	@OriginalMember(owner = "client!ph", name = "lc", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_27;

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "Lclient!wt;")
	private Class267 aClass267_5;

	@OriginalMember(owner = "client!ph", name = "gb", descriptor = "Lclient!wt;")
	private Class267 aClass267_7;

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "Lclient!wt;")
	private Class267 aClass267_6;

	@OriginalMember(owner = "client!ph", name = "Hb", descriptor = "Lclient!wt;")
	private Class267 aClass267_8;

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "Lclient!le;")
	private Class149 aClass149_1;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class37_Sub2(@OriginalArg(0) Class121_Sub2 arg0) {
		this.aClass121_Sub2_27 = arg0;
		this.aClass267_5 = new Class267(null, 5126, 3, 0);
		this.aClass267_7 = new Class267(null, 5126, 2, 0);
		this.aClass267_6 = new Class267(null, 5126, 3, 0);
		this.aClass267_8 = new Class267(null, 5121, 4, 0);
		this.aClass149_1 = new Class149();
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!qg;Lclient!lo;IIII)V")
	public Class37_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5126 = arg2;
		this.anInt5121 = arg5;
		this.aClass121_Sub2_27 = arg0;
		if (Static407.method5534(arg5, arg2)) {
			this.aClass267_5 = new Class267(null, 5126, 3, 0);
		}
		if (Static362.method5155(arg5, arg2)) {
			this.aClass267_7 = new Class267(null, 5126, 2, 0);
		}
		if (Static233.method3384(arg5, arg2)) {
			this.aClass267_6 = new Class267(null, 5126, 3, 0);
		}
		if (Static331.method4781(arg2, arg5)) {
			this.aClass267_8 = new Class267(null, 5121, 4, 0);
		}
		if (Static61.method929(arg5, arg2)) {
			this.aClass149_1 = new Class149();
		}
		@Pc(102) Interface5 local102 = arg0.anInterface5_16;
		@Pc(106) int[] local106 = new int[arg1.anInt4066];
		this.anIntArray389 = new int[arg1.anInt4081 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt4066; local115++) {
			if ((arg1.aByteArray47 == null || arg1.aByteArray47[local115] != 2) && (arg1.aShortArray69 == null || arg1.aShortArray69[local115] == -1 || !local102.method3920(arg1.aShortArray69[local115] & 0xFFFF).aBoolean278)) {
				local106[this.anInt5129++] = local115;
				this.anIntArray389[arg1.aShortArray63[local115]]++;
				this.anIntArray389[arg1.aShortArray61[local115]]++;
				this.anIntArray389[arg1.aShortArray67[local115]]++;
			}
		}
		this.anInt5125 = this.anInt5129;
		@Pc(204) long[] local204 = new long[this.anInt5129];
		@Pc(216) boolean local216 = (this.anInt5126 & 0x100) != 0;
		@Pc(228) int local228;
		@Pc(239) int local239;
		@Pc(364) int local364;
		label488: for (@Pc(218) int local218 = 0; local218 < this.anInt5129; local218++) {
			@Pc(224) int local224 = local106[local218];
			@Pc(226) Class132 local226 = null;
			local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			@Pc(234) byte local234 = 0;
			if (arg1.aClass111Array1 != null) {
				for (local239 = 0; local239 < arg1.aClass111Array1.length; local239++) {
					@Pc(246) Class111 local246 = arg1.aClass111Array1[local239];
					if (local246.anInt2666 == local224) {
						@Pc(255) Class91 local255 = Static38.method500(local246.anInt2669);
						if (local255.aBoolean174) {
							local204[local218] = Long.MAX_VALUE;
							this.anInt5125--;
							continue label488;
						}
					}
				}
			}
			@Pc(278) short local278 = -1;
			if (arg1.aShortArray69 != null) {
				local278 = arg1.aShortArray69[local224];
				if (local278 != -1) {
					local226 = local102.method3920(local278 & 0xFFFF);
					local232 = local226.aByte40;
					local234 = local226.aByte43;
				}
			}
			@Pc(320) boolean local320 = arg1.aByteArray45 != null && arg1.aByteArray45[local224] != 0 || local226 != null && !local226.aBoolean277;
			if ((local216 || local320) && arg1.aByteArray43 != null) {
				local228 += arg1.aByteArray43[local224] << 17;
			}
			if (local320) {
				local228 += 65536;
			}
			local228 += (local232 & 0xFF) << 8;
			local228 += local234 & 0xFF;
			local364 = local230 + ((local278 & 0xFFFF) << 16);
			@Pc(370) int local370 = local364 + (local218 & 0xFFFF);
			local204[local218] = (long) local370 + ((long) local228 << 32);
		}
		Static101.method1632(local204, local106);
		this.anInt5118 = arg1.anInt4081;
		this.anIntArray392 = arg1.anIntArray327;
		this.anInt5086 = arg1.anInt4068;
		this.anIntArray393 = arg1.anIntArray324;
		this.aShortArray93 = arg1.aShortArray68;
		this.anIntArray390 = arg1.anIntArray323;
		this.aClass265Array4 = arg1.aClass265Array2;
		@Pc(425) Class83[] local425 = new Class83[this.anInt5118];
		this.aClass203Array4 = arg1.aClass203Array2;
		@Pc(449) int local449;
		@Pc(463) int local463;
		if (arg1.aClass111Array1 != null) {
			this.anInt5082 = arg1.aClass111Array1.length;
			this.aClass170Array1 = new Class170[this.anInt5082];
			this.aClass33Array1 = new Class33[this.anInt5082];
			for (local449 = 0; local449 < this.anInt5082; local449++) {
				@Pc(456) Class111 local456 = arg1.aClass111Array1[local449];
				@Pc(461) Class91 local461 = Static38.method500(local456.anInt2669);
				local463 = -1;
				for (@Pc(465) int local465 = 0; local465 < this.anInt5129; local465++) {
					if (local456.anInt2666 == local106[local465]) {
						local463 = local465;
						break;
					}
				}
				if (local463 == -1) {
					throw new RuntimeException();
				}
				local239 = Static302.anIntArray386[arg1.aShortArray60[local456.anInt2666] & 0xFFFF] & 0xFFFFFF;
				local239 |= 255 - (arg1.aByteArray45 == null ? 0 : arg1.aByteArray45[local456.anInt2666]) << 24;
				this.aClass170Array1[local449] = new Class170(local463, arg1.aShortArray63[local456.anInt2666], arg1.aShortArray61[local456.anInt2666], arg1.aShortArray67[local456.anInt2666], local461.anInt2201, local461.anInt2200, local461.anInt2195, local461.anInt2196, local461.anInt2202, local461.aBoolean174, local461.aBoolean173, local456.anInt2668);
				this.aClass33Array1[local449] = new Class33(local239);
			}
		}
		local449 = this.anInt5129 * 3;
		this.aShortArray89 = new short[local449];
		this.aShortArray84 = new short[this.anInt5129];
		if (arg1.aShortArray59 != null) {
			this.aShortArray90 = new short[this.anInt5129];
		}
		this.aShort78 = (short) arg4;
		this.aByteArray62 = new byte[local449];
		this.aShortArray85 = new short[local449];
		Static55.aLongArray1 = new long[local449];
		this.aShortArray88 = new short[local449];
		this.aShortArray86 = new short[this.anInt5129];
		this.aFloatArray32 = new float[local449];
		this.aByteArray61 = new byte[this.anInt5129];
		this.aShortArray87 = new short[this.anInt5129];
		this.aShortArray92 = new short[local449];
		this.aFloatArray31 = new float[local449];
		this.aShortArray91 = new short[this.anInt5129];
		this.lb = new short[this.anInt5129];
		this.aShort83 = (short) arg3;
		local228 = 0;
		for (local364 = 0; local364 < arg1.anInt4081; local364++) {
			local463 = this.anIntArray389[local364];
			this.anIntArray389[local364] = local228;
			local228 += local463;
			local425[local364] = new Class83();
		}
		this.anIntArray389[arg1.anInt4081] = local228;
		@Pc(699) int[] local699 = null;
		@Pc(701) int[] local701 = null;
		@Pc(703) int[] local703 = null;
		@Pc(705) float[][] local705 = null;
		@Pc(731) int local731;
		@Pc(776) int local776;
		@Pc(782) int local782;
		@Pc(796) int local796;
		@Pc(798) int local798;
		@Pc(834) int local834;
		@Pc(839) int local839;
		@Pc(989) float local989;
		@Pc(997) float local997;
		@Pc(1005) float local1005;
		if (arg1.aByteArray44 != null) {
			@Pc(711) int local711 = arg1.anInt4079;
			@Pc(714) int[] local714 = new int[local711];
			@Pc(717) int[] local717 = new int[local711];
			@Pc(720) int[] local720 = new int[local711];
			@Pc(723) int[] local723 = new int[local711];
			@Pc(726) int[] local726 = new int[local711];
			@Pc(729) int[] local729 = new int[local711];
			for (local731 = 0; local731 < local711; local731++) {
				local714[local731] = Integer.MAX_VALUE;
				local717[local731] = -2147483647;
				local720[local731] = Integer.MAX_VALUE;
				local723[local731] = -2147483647;
				local726[local731] = Integer.MAX_VALUE;
				local729[local731] = -2147483647;
			}
			local701 = new int[local711];
			local699 = new int[local711];
			local705 = new float[local711][];
			for (local776 = 0; local776 < this.anInt5129; local776++) {
				local782 = local106[local776];
				if (arg1.aByteArray44[local782] != -1) {
					local796 = arg1.aByteArray44[local782] & 0xFF;
					for (local798 = 0; local798 < 3; local798++) {
						@Pc(810) short local810;
						if (local798 == 0) {
							local810 = arg1.aShortArray63[local782];
						} else if (local798 == 1) {
							local810 = arg1.aShortArray61[local782];
						} else {
							local810 = arg1.aShortArray67[local782];
						}
						local834 = arg1.anIntArray323[local810];
						local839 = arg1.anIntArray324[local810];
						@Pc(844) int local844 = arg1.anIntArray327[local810];
						if (local834 < local714[local796]) {
							local714[local796] = local834;
						}
						if (local834 > local717[local796]) {
							local717[local796] = local834;
						}
						if (local839 < local720[local796]) {
							local720[local796] = local839;
						}
						if (local839 > local723[local796]) {
							local723[local796] = local839;
						}
						if (local726[local796] > local844) {
							local726[local796] = local844;
						}
						if (local844 > local729[local796]) {
							local729[local796] = local844;
						}
					}
				}
			}
			local703 = new int[local711];
			for (local782 = 0; local782 < local711; local782++) {
				@Pc(933) byte local933 = arg1.aByteArray46[local782];
				if (local933 > 0) {
					local699[local782] = (local717[local782] + local714[local782]) / 2;
					local701[local782] = (local720[local782] + local723[local782]) / 2;
					local703[local782] = (local726[local782] + local729[local782]) / 2;
					if (local933 == 1) {
						local839 = arg1.anIntArray319[local782];
						local997 = 64.0F / (float) arg1.anIntArray326[local782];
						if (local839 == 0) {
							local1005 = 1.0F;
							local989 = 1.0F;
						} else if (local839 <= 0) {
							local1005 = 1.0F;
							local989 = (float) -local839 / 1024.0F;
						} else {
							local989 = 1.0F;
							local1005 = (float) local839 / 1024.0F;
						}
					} else if (local933 == 2) {
						local989 = 64.0F / (float) arg1.anIntArray319[local782];
						local997 = 64.0F / (float) arg1.anIntArray326[local782];
						local1005 = 64.0F / (float) arg1.anIntArray317[local782];
					} else {
						local989 = (float) arg1.anIntArray319[local782] / 1024.0F;
						local997 = (float) arg1.anIntArray326[local782] / 1024.0F;
						local1005 = (float) arg1.anIntArray317[local782] / 1024.0F;
					}
					local705[local782] = Static117.method1810(arg1.aShortArray62[local782], arg1.aShortArray66[local782], local989, arg1.aByteArray48[local782] & 0xFF, local997, local1005, arg1.aShortArray64[local782]);
				}
			}
		}
		@Pc(1110) Class20[] local1110 = new Class20[arg1.anInt4066];
		@Pc(1129) short local1129;
		@Pc(1140) int local1140;
		@Pc(1151) int local1151;
		@Pc(1210) int local1210;
		for (@Pc(1112) int local1112 = 0; local1112 < arg1.anInt4066; local1112++) {
			@Pc(1119) short local1119 = arg1.aShortArray63[local1112];
			@Pc(1124) short local1124 = arg1.aShortArray61[local1112];
			local1129 = arg1.aShortArray67[local1112];
			local1140 = this.anIntArray390[local1124] - this.anIntArray390[local1119];
			local1151 = this.anIntArray393[local1124] - this.anIntArray393[local1119];
			local731 = this.anIntArray392[local1124] - this.anIntArray392[local1119];
			local776 = this.anIntArray390[local1129] - this.anIntArray390[local1119];
			local782 = this.anIntArray393[local1129] - this.anIntArray393[local1119];
			local796 = this.anIntArray392[local1129] - this.anIntArray392[local1119];
			local798 = local1151 * local796 - local782 * local731;
			local1210 = local731 * local776 - local796 * local1140;
			for (local834 = local782 * local1140 - local1151 * local776; local798 > 8192 || local1210 > 8192 || local834 > 8192 || local798 < -8192 || local1210 < -8192 || local834 < -8192; local834 >>= 0x1) {
				local1210 >>= 0x1;
				local798 >>= 0x1;
			}
			local839 = (int) Math.sqrt((double) (local1210 * local1210 + local798 * local798 + local834 * local834));
			if (local839 <= 0) {
				local839 = 1;
			}
			local1210 = local1210 * 256 / local839;
			local798 = local798 * 256 / local839;
			local834 = local834 * 256 / local839;
			@Pc(1304) byte local1304 = arg1.aByteArray47 == null ? 0 : arg1.aByteArray47[local1112];
			if (local1304 == 0) {
				@Pc(1334) Class83 local1334 = local425[local1119];
				local1334.anInt2043 += local798;
				local1334.anInt2045++;
				local1334.anInt2044 += local834;
				local1334.anInt2047 += local1210;
				@Pc(1362) Class83 local1362 = local425[local1124];
				local1362.anInt2043 += local798;
				local1362.anInt2044 += local834;
				local1362.anInt2047 += local1210;
				local1362.anInt2045++;
				@Pc(1390) Class83 local1390 = local425[local1129];
				local1390.anInt2044 += local834;
				local1390.anInt2047 += local1210;
				local1390.anInt2045++;
				local1390.anInt2043 += local798;
			} else if (local1304 == 1) {
				@Pc(1319) Class20 local1319 = local1110[local1112] = new Class20();
				local1319.anInt386 = local1210;
				local1319.anInt384 = local834;
				local1319.anInt385 = local798;
			}
		}
		@Pc(1431) int local1431;
		for (@Pc(1425) int local1425 = 0; local1425 < this.anInt5129; local1425++) {
			local1431 = local106[local1425];
			@Pc(1438) int local1438 = arg1.aShortArray60[local1431] & 0xFFFF;
			@Pc(1446) short local1446;
			if (arg1.aShortArray69 == null) {
				local1446 = -1;
			} else {
				local1446 = arg1.aShortArray69[local1431];
			}
			if (arg1.aByteArray44 == null) {
				local1151 = -1;
			} else {
				local1151 = arg1.aByteArray44[local1431];
			}
			if (arg1.aByteArray45 == null) {
				local731 = 0;
			} else {
				local731 = arg1.aByteArray45[local1431] & 0xFF;
			}
			@Pc(1478) float local1478 = 0.0F;
			@Pc(1480) float local1480 = 0.0F;
			@Pc(1482) float local1482 = 0.0F;
			local989 = 0.0F;
			local997 = 0.0F;
			local1005 = 0.0F;
			@Pc(1490) byte local1490 = 0;
			@Pc(1492) byte local1492 = 0;
			@Pc(1494) int local1494 = 0;
			@Pc(1511) byte local1511;
			@Pc(1528) short local1528;
			@Pc(2269) short local2269;
			@Pc(2274) short local2274;
			if (local1446 != -1) {
				if (local1151 == -1) {
					local1005 = 0.0F;
					local1490 = 1;
					local989 = 1.0F;
					local1480 = 1.0F;
					local1492 = 2;
					local1482 = 1.0F;
					local997 = 0.0F;
					local1478 = 0.0F;
				} else {
					local1151 &= 0xFF;
					local1511 = arg1.aByteArray46[local1151];
					@Pc(1518) short local1518;
					@Pc(1523) short local1523;
					@Pc(1557) float local1557;
					@Pc(1764) float local1764;
					@Pc(1772) float local1772;
					@Pc(1872) float local1872;
					@Pc(1880) float local1880;
					@Pc(1888) float local1888;
					@Pc(1911) float local1911;
					@Pc(1934) float local1934;
					@Pc(1957) float local1957;
					if (local1511 == 0) {
						local1518 = arg1.aShortArray63[local1431];
						local1523 = arg1.aShortArray61[local1431];
						local1528 = arg1.aShortArray67[local1431];
						local2269 = arg1.aShortArray64[local1151];
						local2274 = arg1.aShortArray62[local1151];
						@Pc(2279) short local2279 = arg1.aShortArray66[local1151];
						@Pc(2285) float local2285 = (float) arg1.anIntArray323[local2269];
						@Pc(2291) float local2291 = (float) arg1.anIntArray324[local2269];
						local1557 = arg1.anIntArray327[local2269];
						local1764 = (float) arg1.anIntArray323[local2274] - local2285;
						local1772 = (float) arg1.anIntArray324[local2274] - local2291;
						@Pc(2322) float local2322 = (float) arg1.anIntArray327[local2274] - local1557;
						@Pc(2331) float local2331 = (float) arg1.anIntArray323[local2279] - local2285;
						@Pc(2339) float local2339 = (float) arg1.anIntArray324[local2279] - local2291;
						@Pc(2348) float local2348 = (float) arg1.anIntArray327[local2279] - local1557;
						@Pc(2357) float local2357 = (float) arg1.anIntArray323[local1518] - local2285;
						@Pc(2366) float local2366 = (float) arg1.anIntArray324[local1518] - local2291;
						@Pc(2375) float local2375 = (float) arg1.anIntArray327[local1518] - local1557;
						@Pc(2384) float local2384 = (float) arg1.anIntArray323[local1523] - local2285;
						@Pc(2393) float local2393 = (float) arg1.anIntArray324[local1523] - local2291;
						local1872 = (float) arg1.anIntArray327[local1523] - local1557;
						local1880 = (float) arg1.anIntArray323[local1528] - local2285;
						local1888 = (float) arg1.anIntArray324[local1528] - local2291;
						local1911 = (float) arg1.anIntArray327[local1528] - local1557;
						local1934 = local1772 * local2348 - local2322 * local2339;
						local1957 = local2331 * local2322 - local1764 * local2348;
						@Pc(2452) float local2452 = local2339 * local1764 - local1772 * local2331;
						@Pc(2460) float local2460 = local2339 * local2452 - local2348 * local1957;
						@Pc(2468) float local2468 = local1934 * local2348 - local2331 * local2452;
						@Pc(2476) float local2476 = local1957 * local2331 - local1934 * local2339;
						@Pc(2490) float local2490 = 1.0F / (local2476 * local2322 + local2468 * local1772 + local1764 * local2460);
						local997 = local2490 * (local2476 * local1911 + local1880 * local2460 + local2468 * local1888);
						local1478 = (local2366 * local2468 + local2357 * local2460 + local2476 * local2375) * local2490;
						local1482 = (local2476 * local1872 + local2468 * local2393 + local2460 * local2384) * local2490;
						@Pc(2541) float local2541 = local2452 * local1772 - local1957 * local2322;
						@Pc(2550) float local2550 = local2322 * local1934 - local2452 * local1764;
						@Pc(2559) float local2559 = local1764 * local1957 - local1934 * local1772;
						@Pc(2573) float local2573 = 1.0F / (local2339 * local2550 + local2541 * local2331 + local2348 * local2559);
						local1005 = local2573 * (local2559 * local1911 + local2541 * local1880 + local1888 * local2550);
						local1480 = (local2366 * local2550 + local2357 * local2541 + local2375 * local2559) * local2573;
						local989 = local2573 * (local2559 * local1872 + local2384 * local2541 + local2550 * local2393);
					} else {
						local1518 = arg1.aShortArray63[local1431];
						local1523 = arg1.aShortArray61[local1431];
						local1528 = arg1.aShortArray67[local1431];
						@Pc(1532) int local1532 = local699[local1151];
						@Pc(1536) int local1536 = local701[local1151];
						@Pc(1540) int local1540 = local703[local1151];
						@Pc(1544) float[] local1544 = local705[local1151];
						@Pc(1549) byte local1549 = arg1.aByteArray42[local1151];
						local1557 = (float) arg1.anIntArray316[local1151] / 256.0F;
						if (local1511 == 1) {
							local1764 = (float) arg1.anIntArray317[local1151] / 1024.0F;
							Static145.method2350(local1540, local1549, arg1.anIntArray327[local1518], local1532, local1536, arg1.anIntArray324[local1518], local1544, local1557, arg1.anIntArray323[local1518], local1764);
							local1478 = Static147.aFloat58;
							local1480 = Static329.aFloat107;
							Static145.method2350(local1540, local1549, arg1.anIntArray327[local1523], local1532, local1536, arg1.anIntArray324[local1523], local1544, local1557, arg1.anIntArray323[local1523], local1764);
							local1482 = Static147.aFloat58;
							local989 = Static329.aFloat107;
							Static145.method2350(local1540, local1549, arg1.anIntArray327[local1528], local1532, local1536, arg1.anIntArray324[local1528], local1544, local1557, arg1.anIntArray323[local1528], local1764);
							local1005 = Static329.aFloat107;
							local997 = Static147.aFloat58;
							local1772 = local1764 / 2.0F;
							if ((local1549 & 0x1) == 0) {
								if (local1772 < local1482 - local1478) {
									local1490 = 1;
									local1482 -= local1764;
								} else if (local1478 - local1482 > local1772) {
									local1482 += local1764;
									local1490 = 2;
								}
								if (local997 - local1478 > local1772) {
									local1492 = 1;
									local997 -= local1764;
								} else if (local1478 - local997 > local1772) {
									local1492 = 2;
									local997 += local1764;
								}
							} else {
								if (local1772 < local1005 - local1480) {
									local1492 = 1;
									local1005 -= local1764;
								} else if (local1480 - local1005 > local1772) {
									local1492 = 2;
									local1005 += local1764;
								}
								if (local989 - local1480 > local1772) {
									local989 -= local1764;
									local1490 = 1;
								} else if (local1480 - local989 > local1772) {
									local1490 = 2;
									local989 += local1764;
								}
							}
						} else if (local1511 == 2) {
							local1764 = (float) arg1.anIntArray318[local1151] / 256.0F;
							local1772 = (float) arg1.anIntArray321[local1151] / 256.0F;
							@Pc(1783) int local1783 = arg1.anIntArray323[local1523] - arg1.anIntArray323[local1518];
							@Pc(1794) int local1794 = arg1.anIntArray324[local1523] - arg1.anIntArray324[local1518];
							@Pc(1805) int local1805 = arg1.anIntArray327[local1523] - arg1.anIntArray327[local1518];
							@Pc(1815) int local1815 = arg1.anIntArray323[local1528] - arg1.anIntArray323[local1518];
							@Pc(1826) int local1826 = arg1.anIntArray324[local1528] - arg1.anIntArray324[local1518];
							@Pc(1837) int local1837 = arg1.anIntArray327[local1528] - arg1.anIntArray327[local1518];
							@Pc(1846) int local1846 = local1837 * local1794 - local1805 * local1826;
							@Pc(1855) int local1855 = local1805 * local1815 - local1783 * local1837;
							@Pc(1864) int local1864 = local1783 * local1826 - local1815 * local1794;
							local1872 = 64.0F / (float) arg1.anIntArray319[local1151];
							local1880 = 64.0F / (float) arg1.anIntArray326[local1151];
							local1888 = 64.0F / (float) arg1.anIntArray317[local1151];
							local1911 = ((float) local1864 * local1544[2] + (float) local1855 * local1544[1] + (float) local1846 * local1544[0]) / local1872;
							local1934 = ((float) local1855 * local1544[4] + (float) local1846 * local1544[3] + local1544[5] * (float) local1864) / local1880;
							local1957 = (local1544[6] * (float) local1846 + local1544[7] * (float) local1855 + local1544[8] * (float) local1864) / local1888;
							local1494 = Static144.method2319(local1934, local1957, local1911);
							Static382.method4523(local1536, local1494, local1772, local1764, arg1.anIntArray324[local1518], local1549, local1557, arg1.anIntArray327[local1518], local1532, arg1.anIntArray323[local1518], local1544, local1540);
							local1478 = Static163.aFloat52;
							local1480 = Static442.aFloat124;
							Static382.method4523(local1536, local1494, local1772, local1764, arg1.anIntArray324[local1523], local1549, local1557, arg1.anIntArray327[local1523], local1532, arg1.anIntArray323[local1523], local1544, local1540);
							local989 = Static442.aFloat124;
							local1482 = Static163.aFloat52;
							Static382.method4523(local1536, local1494, local1772, local1764, arg1.anIntArray324[local1528], local1549, local1557, arg1.anIntArray327[local1528], local1532, arg1.anIntArray323[local1528], local1544, local1540);
							local1005 = Static442.aFloat124;
							local997 = Static163.aFloat52;
						} else if (local1511 == 3) {
							Static416.method5646(arg1.anIntArray323[local1518], local1536, local1544, local1532, local1549, local1557, local1540, arg1.anIntArray327[local1518], arg1.anIntArray324[local1518]);
							local1480 = Static286.aFloat79;
							local1478 = Static300.aFloat82;
							Static416.method5646(arg1.anIntArray323[local1523], local1536, local1544, local1532, local1549, local1557, local1540, arg1.anIntArray327[local1523], arg1.anIntArray324[local1523]);
							local1482 = Static300.aFloat82;
							local989 = Static286.aFloat79;
							Static416.method5646(arg1.anIntArray323[local1528], local1536, local1544, local1532, local1549, local1557, local1540, arg1.anIntArray327[local1528], arg1.anIntArray324[local1528]);
							local1005 = Static286.aFloat79;
							local997 = Static300.aFloat82;
							if ((local1549 & 0x1) == 0) {
								if (local1482 - local1478 > 0.5F) {
									local1482--;
									local1490 = 1;
								} else if (local1478 - local1482 > 0.5F) {
									local1490 = 2;
									local1482++;
								}
								if (local997 - local1478 > 0.5F) {
									local997--;
									local1492 = 1;
								} else if (local1478 - local997 > 0.5F) {
									local1492 = 2;
									local997++;
								}
							} else {
								if (local989 - local1480 > 0.5F) {
									local1490 = 1;
									local989--;
								} else if (local1480 - local989 > 0.5F) {
									local989++;
									local1490 = 2;
								}
								if (local1005 - local1480 > 0.5F) {
									local1005--;
									local1492 = 1;
								} else if (local1480 - local1005 > 0.5F) {
									local1005++;
									local1492 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray47 == null) {
				local1511 = 0;
			} else {
				local1511 = arg1.aByteArray47[local1431];
			}
			if (local1511 == 0) {
				@Pc(2671) long local2671 = (long) (local1151 << 2) + ((long) local731 + (long) (local1438 << 8) + (long) (local1494 << 24) << 32);
				local1528 = arg1.aShortArray63[local1431];
				local2269 = arg1.aShortArray61[local1431];
				local2274 = arg1.aShortArray67[local1431];
				@Pc(2690) Class83 local2690 = local425[local1528];
				this.aShortArray86[local1425] = this.method4186(local2690.anInt2044, local1478, arg1, local2690.anInt2047, local2690.anInt2043, local1480, local2690.anInt2045, local1528, local2671);
				@Pc(2714) Class83 local2714 = local425[local2269];
				this.aShortArray91[local1425] = this.method4186(local2714.anInt2044, local1482, arg1, local2714.anInt2047, local2714.anInt2043, local989, local2714.anInt2045, local2269, (long) local1490 + local2671);
				@Pc(2741) Class83 local2741 = local425[local2274];
				this.aShortArray87[local1425] = this.method4186(local2741.anInt2044, local997, arg1, local2741.anInt2047, local2741.anInt2043, local1005, local2741.anInt2045, local2274, (long) local1492 + local2671);
			} else if (local1511 == 1) {
				@Pc(2773) Class20 local2773 = local1110[local1431];
				@Pc(2818) long local2818 = (long) ((local2773.anInt384 + 256 << 22) + (local1151 << 2) + (local2773.anInt385 <= 0 ? 2048 : 1024) + (local2773.anInt386 + 256 << 12)) + ((long) local731 + (long) (local1438 << 8) + (long) (local1494 << 24) << 32);
				this.aShortArray86[local1425] = this.method4186(local2773.anInt384, local1478, arg1, local2773.anInt386, local2773.anInt385, local1480, 0, arg1.aShortArray63[local1431], local2818);
				this.aShortArray91[local1425] = this.method4186(local2773.anInt384, local1482, arg1, local2773.anInt386, local2773.anInt385, local989, 0, arg1.aShortArray61[local1431], local2818 + (long) local1490);
				this.aShortArray87[local1425] = this.method4186(local2773.anInt384, local997, arg1, local2773.anInt386, local2773.anInt385, local1005, 0, arg1.aShortArray67[local1431], local2818 + (long) local1492);
			}
			if (arg1.aShortArray69 == null) {
				this.aShortArray84[local1425] = -1;
			} else {
				this.aShortArray84[local1425] = arg1.aShortArray69[local1431];
			}
			if (arg1.aByteArray45 != null) {
				this.aByteArray61[local1425] = arg1.aByteArray45[local1431];
			}
			if (arg1.aShortArray59 != null) {
				this.aShortArray90[local1425] = arg1.aShortArray59[local1431];
			}
			this.lb[local1425] = arg1.aShortArray60[local1431];
		}
		local1431 = 0;
		local1129 = -10000;
		for (local1140 = 0; local1140 < this.anInt5125; local1140++) {
			@Pc(2960) short local2960 = this.aShortArray84[local1140];
			if (local2960 != local1129) {
				local1431++;
				local1129 = local2960;
			}
		}
		this.anIntArray391 = new int[local1431 + 1];
		local1431 = 0;
		local1129 = -10000;
		for (local1151 = 0; local1151 < this.anInt5125; local1151++) {
			@Pc(2990) short local2990 = this.aShortArray84[local1151];
			if (local1129 != local2990) {
				local1129 = local2990;
				this.anIntArray391[local1431++] = local1151;
			}
		}
		this.anIntArray391[local1431] = this.anInt5125;
		Static55.aLongArray1 = null;
		this.aShortArray92 = Static337.method4857(this.aShortArray92, this.anInt5087);
		this.aShortArray88 = Static337.method4857(this.aShortArray88, this.anInt5087);
		this.aShortArray85 = Static337.method4857(this.aShortArray85, this.anInt5087);
		this.aByteArray62 = Static266.method5739(this.anInt5087, this.aByteArray62);
		this.aFloatArray32 = Static101.method1628(this.anInt5087, this.aFloatArray32);
		this.aFloatArray31 = Static101.method1628(this.anInt5087, this.aFloatArray31);
		if (arg1.anIntArray325 != null && Static14.method232(this.anInt5121, arg2)) {
			this.anIntArrayArray38 = arg1.method3397();
		}
		if (arg1.aClass111Array1 != null && Static359.method5128(this.anInt5121, arg2)) {
			this.anIntArrayArray36 = arg1.method3401();
		}
		if (arg1.anIntArray328 != null && Static26.method373(this.anInt5121, arg2)) {
			local731 = 0;
			@Pc(3112) int[] local3112 = new int[256];
			for (local782 = 0; local782 < this.anInt5129; local782++) {
				local796 = arg1.anIntArray328[local106[local782]];
				if (local796 >= 0) {
					@Pc(3132) int local3132 = local3112[local796]++;
					if (local796 > local731) {
						local731 = local796;
					}
				}
			}
			this.anIntArrayArray37 = new int[local731 + 1][];
			for (local796 = 0; local796 <= local731; local796++) {
				this.anIntArrayArray37[local796] = new int[local3112[local796]];
				local3112[local796] = 0;
			}
			for (local798 = 0; local798 < this.anInt5129; local798++) {
				local1210 = arg1.anIntArray328[local106[local798]];
				if (local1210 >= 0) {
					this.anIntArrayArray37[local1210][local3112[local1210]++] = local798;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "(I)V")
	@Override
	public void u(@OriginalArg(0) int arg0) {
		this.anInt5126 = arg0;
		this.aBoolean413 = true;
		if (this.aClass50_1 != null && (this.anInt5126 & 0x10000) == 0) {
			this.aShortArray88 = this.aClass50_1.aShortArray11;
			this.aShortArray92 = this.aClass50_1.aShortArray12;
			this.aByteArray62 = this.aClass50_1.aByteArray8;
			this.aShortArray85 = this.aClass50_1.aShortArray10;
			this.aClass50_1 = null;
		}
		this.method4175();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!cd;I)V")
	private void method4173(@OriginalArg(0) Class1_Sub1_Sub3_Sub1 arg0) {
		if (this.anInt5087 > Static344.anIntArray456.length) {
			Static394.anIntArray522 = new int[this.anInt5087];
			Static344.anIntArray456 = new int[this.anInt5087];
		}
		@Pc(46) int local46;
		@Pc(85) int local85;
		@Pc(94) int local94;
		for (@Pc(20) int local20 = 0; local20 < this.anInt5118; local20++) {
			local46 = (this.anIntArray390[local20] - (this.anIntArray393[local20] * this.aClass121_Sub2_27.anInt5970 >> 8) >> this.aClass121_Sub2_27.anInt5936) - arg0.anInt724;
			@Pc(71) int local71 = (this.anIntArray392[local20] - (this.aClass121_Sub2_27.anInt5955 * this.anIntArray393[local20] >> 8) >> this.aClass121_Sub2_27.anInt5936) - arg0.anInt727;
			@Pc(76) int local76 = this.anIntArray389[local20];
			@Pc(83) int local83 = this.anIntArray389[local20 + 1];
			for (local85 = local76; local85 < local83; local85++) {
				local94 = this.aShortArray89[local85] - 1;
				if (local94 == -1) {
					break;
				}
				Static344.anIntArray456[local94] = local46;
				Static394.anIntArray522[local94] = local71;
			}
		}
		for (local46 = 0; local46 < this.anInt5125; local46++) {
			if (this.aByteArray61 == null || this.aByteArray61[local46] <= 128) {
				@Pc(143) short local143 = this.aShortArray86[local46];
				@Pc(148) short local148 = this.aShortArray91[local46];
				@Pc(153) short local153 = this.aShortArray87[local46];
				local85 = Static344.anIntArray456[local143];
				local94 = Static344.anIntArray456[local148];
				@Pc(165) int local165 = Static344.anIntArray456[local153];
				@Pc(169) int local169 = Static394.anIntArray522[local143];
				@Pc(173) int local173 = Static394.anIntArray522[local148];
				@Pc(177) int local177 = Static394.anIntArray522[local153];
				if ((local85 - local94) * (-local177 + local173) - (local165 - local94) * (-local169 + local173) > 0) {
					arg0.method609(local85, local94, local177, local169, local165, local173);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "VA", descriptor = "()I")
	@Override
	public int VA() {
		if (!this.aBoolean414) {
			this.method4180();
		}
		return this.aShort85;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BIZ)Lclient!c;")
	@Override
	public Class37 method4155(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class37_Sub2 local18;
		@Pc(14) Class37_Sub2 local14;
		if (arg0 == 1) {
			local14 = this.aClass121_Sub2_27.aClass37_Sub2_6;
			local18 = this.aClass121_Sub2_27.aClass37_Sub2_4;
		} else if (arg0 == 2) {
			local14 = this.aClass121_Sub2_27.aClass37_Sub2_2;
			local18 = this.aClass121_Sub2_27.aClass37_Sub2_8;
		} else if (arg0 == 3) {
			local18 = this.aClass121_Sub2_27.aClass37_Sub2_3;
			local14 = this.aClass121_Sub2_27.aClass37_Sub2_1;
		} else if (arg0 == 4) {
			local18 = this.aClass121_Sub2_27.aClass37_Sub2_9;
			local14 = this.aClass121_Sub2_27.aClass37_Sub2_5;
		} else if (arg0 == 5) {
			local14 = this.aClass121_Sub2_27.aClass37_Sub2_10;
			local18 = this.aClass121_Sub2_27.aClass37_Sub2_7;
		} else {
			local18 = local14 = new Class37_Sub2(this.aClass121_Sub2_27);
		}
		return this.method4184(arg0 != 0, arg1, arg2, local18, local14);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "()I")
	@Override
	public int b() {
		if (!this.aBoolean414) {
			this.method4180();
		}
		return this.aShort84;
	}

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class262.anIntArray575[arg0];
		@Pc(13) int local13 = Class262.anIntArray576[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5118; local15++) {
			@Pc(34) int local34 = this.anIntArray393[local15] * local9 + this.anIntArray390[local15] * local13 >> 15;
			this.anIntArray393[local15] = this.anIntArray393[local15] * local13 - local9 * this.anIntArray390[local15] >> 15;
			this.anIntArray390[local15] = local34;
		}
		this.aBoolean414 = false;
		if (this.aClass267_5 != null) {
			this.aClass267_5.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "ja", descriptor = "(III)V")
	@Override
	public void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5118; local7++) {
			if (arg0 != 0) {
				this.anIntArray390[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray393[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray392[local7] += arg2;
			}
		}
		if (this.aClass267_5 != null) {
			this.aClass267_5.anInterface12_7 = null;
		}
		this.aBoolean414 = false;
	}

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class262.anIntArray575[arg0];
		@Pc(13) int local13 = Class262.anIntArray576[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5118; local15++) {
			@Pc(33) int local33 = this.anIntArray390[local15] * local13 + this.anIntArray392[local15] * local9 >> 15;
			this.anIntArray392[local15] = local13 * this.anIntArray392[local15] - local9 * this.anIntArray390[local15] >> 15;
			this.anIntArray390[local15] = local33;
		}
		if (this.aClass267_5 != null) {
			this.aClass267_5.anInterface12_7 = null;
		}
		this.aBoolean414 = false;
	}

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "()I")
	@Override
	public int E() {
		if (!this.aBoolean414) {
			this.method4180();
		}
		return this.aShort80;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	private void method4174() {
		if (this.aClass170Array1 == null) {
			return;
		}
		@Pc(8) Class43_Sub2 local8 = this.aClass121_Sub2_27.aClass43_Sub2_2;
		@Pc(12) float local12 = this.aClass121_Sub2_27.w();
		@Pc(16) float local16 = this.aClass121_Sub2_27.la();
		this.aClass121_Sub2_27.method4703();
		this.aClass121_Sub2_27.method4596(false);
		this.aClass121_Sub2_27.method4663(false);
		this.aClass121_Sub2_27.method4724(this.aClass121_Sub2_27.aClass267_13, null, this.aClass121_Sub2_27.aClass267_14, null);
		for (@Pc(45) int local45 = 0; local45 < this.anInt5082; local45++) {
			@Pc(52) Class170 local52 = this.aClass170Array1[local45];
			@Pc(57) Class33 local57 = this.aClass33Array1[local45];
			if (!local52.aBoolean354 || !this.aClass121_Sub2_27.method4613()) {
				@Pc(86) float local86 = (float) (this.anIntArray390[local52.anInt4455] + this.anIntArray390[local52.anInt4458] + this.anIntArray390[local52.anInt4456]) * 0.3333333F;
				@Pc(107) float local107 = (float) (this.anIntArray393[local52.anInt4456] + this.anIntArray393[local52.anInt4458] + this.anIntArray393[local52.anInt4455]) * 0.3333333F;
				@Pc(129) float local129 = (float) (this.anIntArray392[local52.anInt4455] + this.anIntArray392[local52.anInt4458] + this.anIntArray392[local52.anInt4456]) * 0.3333333F;
				@Pc(143) float local143 = Static199.aFloat62 + local86 * Static142.aFloat37 + local107 * Static219.aFloat67 + local129 * Static195.aFloat61;
				@Pc(157) float local157 = Static31.aFloat7 * local86 + Static35.aFloat9 * local107 + local129 * Static251.aFloat76 + Static255.aFloat77;
				@Pc(171) float local171 = Static321.aFloat84 + Static59.aFloat15 * local86 + Static439.aFloat123 * local107 + local129 * Static323.aFloat85;
				local8.method2486(local57.anInt602 * local52.aShort71 >> 7, (float) local57.anInt598 + local143, local52.aShort72 * local57.anInt604 >> 7, -local171, (float) local57.anInt605 - local157, local57.anInt599);
				this.aClass121_Sub2_27.method4721(local8);
				this.aClass121_Sub2_27.o(local16, local12 - (float) local52.anInt4457 * 1.5F);
				@Pc(221) int local221 = local57.anInt597;
				OpenGL.glColor4ub((byte) (local221 >> 16), (byte) (local221 >> 8), (byte) local221, (byte) (local221 >> 24));
				this.aClass121_Sub2_27.method4647(local52.aShort73);
				this.aClass121_Sub2_27.method4700(local52.aByte66);
				this.aClass121_Sub2_27.method4707(local52.aByte67);
				this.aClass121_Sub2_27.method4687(4);
			}
		}
		this.aClass121_Sub2_27.o(local16, local12);
		this.aClass121_Sub2_27.method4596(true);
		this.aClass121_Sub2_27.method4680();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	private void method4175() {
		if (!this.aBoolean413) {
			return;
		}
		this.aBoolean413 = false;
		if (this.aClass203Array4 == null && this.aClass265Array4 == null && this.aClass170Array1 == null) {
			if (this.anIntArray390 != null && !Static235.method3419(this.anInt5126, this.anInt5121)) {
				if (this.aClass267_5 != null && this.aClass267_5.anInterface12_7 == null) {
					this.aBoolean413 = true;
				} else {
					if (!this.aBoolean414) {
						this.method4180();
					}
					this.anIntArray390 = null;
				}
			}
			if (this.anIntArray393 != null && !Static150.method2407(this.anInt5126, this.anInt5121)) {
				if (this.aClass267_5 != null && this.aClass267_5.anInterface12_7 == null) {
					this.aBoolean413 = true;
				} else {
					if (!this.aBoolean414) {
						this.method4180();
					}
					this.anIntArray393 = null;
				}
			}
			if (this.anIntArray392 != null && !Static35.method484(this.anInt5126, this.anInt5121)) {
				if (this.aClass267_5 != null && this.aClass267_5.anInterface12_7 == null) {
					this.aBoolean413 = true;
				} else {
					if (!this.aBoolean414) {
						this.method4180();
					}
					this.anIntArray392 = null;
				}
			}
		}
		if (this.aShortArray89 != null && this.anIntArray390 == null && this.anIntArray393 == null && this.anIntArray392 == null) {
			this.aShortArray89 = null;
			this.anIntArray389 = null;
		}
		if (this.aByteArray62 != null && !Static404.method5495(this.anInt5126, this.anInt5121)) {
			if (this.aClass267_6 == null) {
				if (this.aClass267_8 != null && this.aClass267_8.anInterface12_7 == null) {
					this.aBoolean413 = true;
				} else {
					this.aShortArray92 = this.aShortArray88 = this.aShortArray85 = null;
					this.aByteArray62 = null;
				}
			} else if (this.aClass267_6.anInterface12_7 == null) {
				this.aBoolean413 = true;
			} else {
				this.aByteArray62 = null;
				this.aShortArray92 = this.aShortArray88 = this.aShortArray85 = null;
			}
		}
		if (this.lb != null && !Static28.method393(this.anInt5126, this.anInt5121)) {
			if (this.aClass267_8 != null && this.aClass267_8.anInterface12_7 == null) {
				this.aBoolean413 = true;
			} else {
				this.lb = null;
			}
		}
		if (this.aByteArray61 != null && !Static87.method4373(this.anInt5121, this.anInt5126)) {
			if (this.aClass267_8 != null && this.aClass267_8.anInterface12_7 == null) {
				this.aBoolean413 = true;
			} else {
				this.aByteArray61 = null;
			}
		}
		if (this.aFloatArray32 != null && !Static103.method1644(this.anInt5126, this.anInt5121)) {
			if (this.aClass267_7 != null && this.aClass267_7.anInterface12_7 == null) {
				this.aBoolean413 = true;
			} else {
				this.aFloatArray32 = this.aFloatArray31 = null;
			}
		}
		if (this.aShortArray84 != null && !Static27.method383(this.anInt5126, this.anInt5121)) {
			if (this.aClass267_8 != null && this.aClass267_8.anInterface12_7 == null) {
				this.aBoolean413 = true;
			} else {
				this.aShortArray84 = null;
			}
		}
		if (this.aShortArray86 != null && !Static24.method326(this.anInt5126, this.anInt5121)) {
			if (this.aClass149_1 != null && this.aClass149_1.anInterface2_2 == null || this.aClass267_8 != null && this.aClass267_8.anInterface12_7 == null) {
				this.aBoolean413 = true;
			} else {
				this.aShortArray86 = this.aShortArray91 = this.aShortArray87 = null;
			}
		}
		if (this.anIntArrayArray37 != null && !Static26.method373(this.anInt5121, this.anInt5126)) {
			this.aShortArray90 = null;
			this.anIntArrayArray37 = null;
		}
		if (this.anIntArrayArray38 != null && !Static14.method232(this.anInt5121, this.anInt5126)) {
			this.anIntArrayArray38 = null;
			this.aShortArray93 = null;
		}
		if (this.anIntArrayArray36 != null && !Static359.method5128(this.anInt5121, this.anInt5126)) {
			this.anIntArrayArray36 = null;
		}
		if (this.anIntArray391 != null && (this.anInt5126 & 0x800) == 0 && (this.anInt5126 & 0x40000) == 0) {
			this.anIntArray391 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	@Override
	public void method4165(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class37_Sub2 local8 = (Class37_Sub2) arg0;
		if (this.anInt5129 == 0 || local8.anInt5129 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt5118;
		@Pc(24) int[] local24 = local8.anIntArray390;
		@Pc(27) int[] local27 = local8.anIntArray393;
		@Pc(30) int[] local30 = local8.anIntArray392;
		@Pc(33) short[] local33 = local8.aShortArray92;
		@Pc(36) short[] local36 = local8.aShortArray88;
		@Pc(39) short[] local39 = local8.aShortArray85;
		@Pc(42) byte[] local42 = local8.aByteArray62;
		@Pc(61) short[] local61;
		@Pc(53) short[] local53;
		@Pc(57) short[] local57;
		@Pc(49) byte[] local49;
		if (this.aClass50_1 == null) {
			local61 = null;
			local53 = null;
			local57 = null;
			local49 = null;
		} else {
			local49 = this.aClass50_1.aByteArray8;
			local53 = this.aClass50_1.aShortArray11;
			local57 = this.aClass50_1.aShortArray10;
			local61 = this.aClass50_1.aShortArray12;
		}
		@Pc(80) short[] local80;
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(76) byte[] local76;
		if (local8.aClass50_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local78 = local8.aClass50_1.aShortArray11;
			local80 = local8.aClass50_1.aShortArray12;
			local76 = local8.aClass50_1.aByteArray8;
			local82 = local8.aClass50_1.aShortArray10;
		}
		@Pc(103) int[] local103 = local8.anIntArray389;
		@Pc(106) short[] local106 = local8.aShortArray89;
		if (!local8.aBoolean414) {
			local8.method4180();
		}
		@Pc(115) short local115 = local8.aShort84;
		@Pc(118) short local118 = local8.aShort80;
		@Pc(121) short local121 = local8.aShort82;
		@Pc(124) short local124 = local8.aShort85;
		@Pc(127) short local127 = local8.aShort79;
		@Pc(130) short local130 = local8.aShort81;
		for (@Pc(132) int local132 = 0; local132 < this.anInt5118; local132++) {
			@Pc(142) int local142 = this.anIntArray393[local132] - arg2;
			if (local115 <= local142 && local142 <= local118) {
				@Pc(158) int local158 = this.anIntArray390[local132] - arg1;
				if (local158 >= local121 && local124 >= local158) {
					@Pc(178) int local178 = this.anIntArray392[local132] - arg3;
					if (local178 >= local127 && local178 <= local130) {
						@Pc(192) int local192 = -1;
						@Pc(197) int local197 = this.anIntArray389[local132];
						@Pc(204) int local204 = this.anIntArray389[local132 + 1];
						for (@Pc(206) int local206 = local197; local206 < local204; local206++) {
							local192 = this.aShortArray89[local206] - 1;
							if (local192 == -1 || this.aByteArray62[local192] != 0) {
								break;
							}
						}
						if (local192 != -1) {
							for (@Pc(235) int local235 = 0; local235 < local21; local235++) {
								if (local158 == local24[local235] && local178 == local30[local235] && local27[local235] == local142) {
									@Pc(266) int local266 = -1;
									local197 = local103[local235];
									local204 = local103[local235 + 1];
									for (@Pc(278) int local278 = local197; local278 < local204; local278++) {
										local266 = local106[local278] - 1;
										if (local266 == -1 || local42[local266] != 0) {
											break;
										}
									}
									if (local266 != -1) {
										if (local61 == null) {
											this.aClass50_1 = new Class50();
											local61 = this.aClass50_1.aShortArray12 = Static282.method3878(this.aShortArray92);
											local53 = this.aClass50_1.aShortArray11 = Static282.method3878(this.aShortArray88);
											local57 = this.aClass50_1.aShortArray10 = Static282.method3878(this.aShortArray85);
											local49 = this.aClass50_1.aByteArray8 = Static78.method1145(this.aByteArray62);
										}
										if (local80 == null) {
											@Pc(360) Class50 local360 = local8.aClass50_1 = new Class50();
											local80 = local360.aShortArray12 = Static282.method3878(local33);
											local78 = local360.aShortArray11 = Static282.method3878(local36);
											local82 = local360.aShortArray10 = Static282.method3878(local39);
											local76 = local360.aByteArray8 = Static78.method1145(local42);
										}
										@Pc(393) short local393 = this.aShortArray92[local192];
										@Pc(398) short local398 = this.aShortArray88[local192];
										@Pc(403) short local403 = this.aShortArray85[local192];
										local204 = local103[local235 + 1];
										local197 = local103[local235];
										@Pc(418) byte local418 = this.aByteArray62[local192];
										@Pc(428) int local428;
										for (@Pc(420) int local420 = local197; local420 < local204; local420++) {
											local428 = local106[local420] - 1;
											if (local428 == -1) {
												break;
											}
											if (local76[local428] != 0) {
												local80[local428] += local393;
												local78[local428] += local398;
												local82[local428] += local403;
												local76[local428] += local418;
											}
										}
										local403 = local39[local266];
										local418 = local42[local266];
										local197 = this.anIntArray389[local132];
										local393 = local33[local266];
										local204 = this.anIntArray389[local132 + 1];
										local398 = local36[local266];
										for (local428 = local197; local428 < local204; local428++) {
											@Pc(514) int local514 = this.aShortArray89[local428] - 1;
											if (local514 == -1) {
												break;
											}
											if (local49[local514] != 0) {
												local61[local514] += local393;
												local53[local514] += local398;
												local57[local514] += local403;
												local49[local514] += local418;
											}
										}
										if (this.aClass267_6 == null && this.aClass267_8 != null) {
											this.aClass267_8.anInterface12_7 = null;
										}
										if (this.aClass267_6 != null) {
											this.aClass267_6.anInterface12_7 = null;
										}
										if (local8.aClass267_6 == null && local8.aClass267_8 != null) {
											local8.aClass267_8.anInterface12_7 = null;
										}
										if (local8.aClass267_6 != null) {
											local8.aClass267_6.anInterface12_7 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "YA", descriptor = "(SS)V")
	@Override
	public void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass121_Sub2_27.anInterface5_16;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5129; local11++) {
			if (arg0 == this.aShortArray84[local11]) {
				this.aShortArray84[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class132 local47 = local9.method3920(arg0 & 0xFFFF);
			local35 = local47.aByte42;
			local37 = local47.aByte38;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class132 local67 = local9.method3920(arg1 & 0xFFFF);
			local55 = local67.aByte42;
			local57 = local67.aByte38;
		}
		if (!(local37 != local57 | local35 != local55)) {
			return;
		}
		if (this.aClass170Array1 != null) {
			for (@Pc(96) int local96 = 0; local96 < this.anInt5082; local96++) {
				@Pc(103) Class170 local103 = this.aClass170Array1[local96];
				@Pc(108) Class33 local108 = this.aClass33Array1[local96];
				local108.anInt597 = local108.anInt597 & 0xFF000000 | Static302.anIntArray386[this.lb[local103.anInt4454] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass267_8 != null) {
			this.aClass267_8.anInterface12_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method4176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg7 && arg3 < arg6 && arg3 < arg5) {
			return false;
		} else if (arg7 < arg3 && arg3 > arg6 && arg5 < arg3) {
			return false;
		} else if (arg0 > arg1 && arg2 > arg1 && arg4 > arg1) {
			return false;
		} else {
			return arg1 <= arg0 || arg1 <= arg2 || arg4 >= arg1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		this.aShort83 = (short) arg0;
		if (this.aClass267_8 != null) {
			this.aClass267_8.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		return this.aShort83;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILclient!ia;Z)Z")
	@Override
	public boolean method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class43_Sub2 local8 = (Class43_Sub2) arg2;
		@Pc(12) Class43_Sub2 local12 = this.aClass121_Sub2_27.aClass43_Sub2_4;
		@Pc(33) float local33 = local12.aFloat48 + local12.aFloat44 * local8.aFloat45 + local8.aFloat40 * local12.aFloat43 + local8.aFloat48 * local12.aFloat50;
		@Pc(54) float local54 = local12.aFloat40 + local8.aFloat48 * local12.aFloat41 + local8.aFloat40 * local12.aFloat51 + local12.aFloat46 * local8.aFloat45;
		Static439.aFloat123 = local12.aFloat42 * local8.aFloat51 + local12.aFloat49 * local8.aFloat43 + local8.aFloat42 * local12.aFloat47;
		Static142.aFloat37 = local8.aFloat49 * local12.aFloat44 + local8.aFloat41 * local12.aFloat43 + local12.aFloat50 * local8.aFloat50;
		Static219.aFloat67 = local8.aFloat42 * local12.aFloat44 + local12.aFloat43 * local8.aFloat51 + local8.aFloat43 * local12.aFloat50;
		Static323.aFloat85 = local12.aFloat49 * local8.aFloat44 + local12.aFloat42 * local8.aFloat46 + local12.aFloat47 * local8.aFloat47;
		Static35.aFloat9 = local12.aFloat51 * local8.aFloat51 + local12.aFloat41 * local8.aFloat43 + local12.aFloat46 * local8.aFloat42;
		Static31.aFloat7 = local8.aFloat50 * local12.aFloat41 + local12.aFloat51 * local8.aFloat41 + local8.aFloat49 * local12.aFloat46;
		@Pc(183) float local183 = local12.aFloat45 + local8.aFloat40 * local12.aFloat42 + local12.aFloat49 * local8.aFloat48 + local8.aFloat45 * local12.aFloat47;
		Static195.aFloat61 = local12.aFloat44 * local8.aFloat47 + local12.aFloat50 * local8.aFloat44 + local12.aFloat43 * local8.aFloat46;
		Static59.aFloat15 = local8.aFloat50 * local12.aFloat49 + local12.aFloat42 * local8.aFloat41 + local12.aFloat47 * local8.aFloat49;
		Static251.aFloat76 = local8.aFloat46 * local12.aFloat51 + local8.aFloat44 * local12.aFloat41 + local8.aFloat47 * local12.aFloat46;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass121_Sub2_27.anInt5948;
		@Pc(255) int local255 = this.aClass121_Sub2_27.anInt5981;
		if (!this.aBoolean414) {
			this.method4180();
		}
		Static272.anIntArray361[0] = this.aShort82;
		Static121.anIntArray127[0] = this.aShort84;
		Static272.anIntArray361[1] = this.aShort85;
		Static178.anIntArray243[0] = this.aShort79;
		Static121.anIntArray127[1] = this.aShort84;
		Static178.anIntArray243[1] = this.aShort79;
		Static272.anIntArray361[2] = this.aShort82;
		Static121.anIntArray127[2] = this.aShort80;
		Static178.anIntArray243[2] = this.aShort79;
		Static272.anIntArray361[3] = this.aShort85;
		Static121.anIntArray127[3] = this.aShort80;
		Static272.anIntArray361[4] = this.aShort82;
		Static178.anIntArray243[3] = this.aShort79;
		Static121.anIntArray127[4] = this.aShort84;
		Static178.anIntArray243[4] = this.aShort81;
		Static272.anIntArray361[5] = this.aShort85;
		Static121.anIntArray127[5] = this.aShort84;
		Static272.anIntArray361[6] = this.aShort82;
		Static178.anIntArray243[5] = this.aShort81;
		Static121.anIntArray127[6] = this.aShort80;
		Static272.anIntArray361[7] = this.aShort85;
		Static178.anIntArray243[6] = this.aShort81;
		Static121.anIntArray127[7] = this.aShort80;
		Static178.anIntArray243[7] = this.aShort81;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(390) float local390;
		@Pc(395) float local395;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static272.anIntArray361[local383];
			local395 = Static121.anIntArray127[local383];
			local400 = Static178.anIntArray243[local383];
			local414 = Static323.aFloat85 * local400 + local390 * Static59.aFloat15 + Static439.aFloat123 * local395 + local183;
			local428 = local54 + local400 * Static251.aFloat76 + local390 * Static31.aFloat7 + local395 * Static35.aFloat9;
			local442 = local33 + Static195.aFloat61 * local400 + Static142.aFloat37 * local390 + local395 * Static219.aFloat67;
			if ((float) this.aClass121_Sub2_27.anInt5968 <= local414) {
				@Pc(461) float local461 = (float) local251 * local442 / local414 + (float) this.aClass121_Sub2_27.anInt5982;
				@Pc(473) float local473 = (float) this.aClass121_Sub2_27.anInt5952 + (float) local255 * local428 / local414;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local461 < local241) {
					local241 = local461;
				}
				local239 = true;
				if (local245 > local473) {
					local245 = local473;
				}
				if (local247 < local473) {
					local247 = local473;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && local243 > (float) arg0 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt5087 > Static344.anIntArray456.length) {
				Static344.anIntArray456 = new int[this.anInt5087];
				Static394.anIntArray522 = new int[this.anInt5087];
			}
			@Pc(630) int local630;
			for (@Pc(548) int local548 = 0; local548 < this.anInt5118; local548++) {
				local390 = this.anIntArray390[local548];
				local400 = this.anIntArray392[local548];
				local395 = this.anIntArray393[local548];
				local414 = Static323.aFloat85 * local400 + local390 * Static59.aFloat15 + local395 * Static439.aFloat123 + local183;
				local442 = local33 + Static195.aFloat61 * local400 + Static142.aFloat37 * local390 + local395 * Static219.aFloat67;
				local428 = local54 + Static35.aFloat9 * local395 + local390 * Static31.aFloat7 + Static251.aFloat76 * local400;
				@Pc(643) int local643;
				@Pc(648) int local648;
				@Pc(655) int local655;
				if ((float) this.aClass121_Sub2_27.anInt5968 <= local414) {
					local630 = (int) ((float) this.aClass121_Sub2_27.anInt5982 + (float) local251 * local442 / local414);
					local643 = (int) (local428 * (float) local255 / local414 + (float) this.aClass121_Sub2_27.anInt5952);
					local648 = this.anIntArray389[local548];
					local655 = this.anIntArray389[local548 + 1];
					for (@Pc(657) int local657 = local648; local657 < local655; local657++) {
						@Pc(666) int local666 = this.aShortArray89[local657] - 1;
						if (local666 == -1) {
							break;
						}
						Static344.anIntArray456[local666] = local630;
						Static394.anIntArray522[local666] = local643;
					}
				} else {
					local630 = this.anIntArray389[local548];
					local643 = this.anIntArray389[local548 + 1];
					for (local648 = local630; local648 < local643; local648++) {
						local655 = this.aShortArray89[local648] - 1;
						if (local655 == -1) {
							break;
						}
						Static344.anIntArray456[this.aShortArray89[local648] - 1] = -999999;
					}
				}
			}
			for (local630 = 0; local630 < this.anInt5129; local630++) {
				if (Static344.anIntArray456[this.aShortArray86[local630]] != -999999 && Static344.anIntArray456[this.aShortArray91[local630]] != -999999 && Static344.anIntArray456[this.aShortArray87[local630]] != -999999 && this.method4176(Static344.anIntArray456[this.aShortArray86[local630]], arg0, Static344.anIntArray456[this.aShortArray91[local630]], arg1, Static344.anIntArray456[this.aShortArray87[local630]], Static394.anIntArray522[this.aShortArray87[local630]], Static394.anIntArray522[this.aShortArray91[local630]], Static394.anIntArray522[this.aShortArray86[local630]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ph", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	@Override
	public Class1_Sub1_Sub3 ua(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		if (this.anInt5087 == 0) {
			return null;
		}
		if (!this.aBoolean414) {
			this.method4180();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass121_Sub2_27.anInt5970 <= 0) {
			local37 = this.aShort82 - (this.aClass121_Sub2_27.anInt5970 * this.aShort84 >> 8) >> this.aClass121_Sub2_27.anInt5936;
			local54 = this.aShort85 - (this.aClass121_Sub2_27.anInt5970 * this.aShort80 >> 8) >> this.aClass121_Sub2_27.anInt5936;
		} else {
			local37 = this.aShort82 - (this.aClass121_Sub2_27.anInt5970 * this.aShort80 >> 8) >> this.aClass121_Sub2_27.anInt5936;
			local54 = this.aShort85 - (this.aShort84 * this.aClass121_Sub2_27.anInt5970 >> 8) >> this.aClass121_Sub2_27.anInt5936;
		}
		@Pc(113) int local113;
		@Pc(130) int local130;
		if (this.aClass121_Sub2_27.anInt5955 <= 0) {
			local113 = this.aShort79 - (this.aClass121_Sub2_27.anInt5955 * this.aShort84 >> 8) >> this.aClass121_Sub2_27.anInt5936;
			local130 = this.aShort81 - (this.aClass121_Sub2_27.anInt5955 * this.aShort80 >> 8) >> this.aClass121_Sub2_27.anInt5936;
		} else {
			local113 = this.aShort79 - (this.aClass121_Sub2_27.anInt5955 * this.aShort80 >> 8) >> this.aClass121_Sub2_27.anInt5936;
			local130 = this.aShort81 - (this.aClass121_Sub2_27.anInt5955 * this.aShort84 >> 8) >> this.aClass121_Sub2_27.anInt5936;
		}
		@Pc(172) int local172 = local54 + 1 - local37;
		@Pc(179) int local179 = local130 + 1 - local113;
		@Pc(182) Class1_Sub1_Sub3_Sub1 local182 = (Class1_Sub1_Sub3_Sub1) arg0;
		@Pc(192) Class1_Sub1_Sub3_Sub1 local192;
		if (local182 != null && local182.method615(local172, local179)) {
			local192 = local182;
			local182.method614();
		} else {
			local192 = new Class1_Sub1_Sub3_Sub1(this.aClass121_Sub2_27, local172, local179);
		}
		local192.method612(local113, local54, local37, local130);
		this.method4173(local192);
		return local192;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "()[Lclient!wq;")
	@Override
	public Class265[] method4157() {
		return this.aClass265Array4;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
	private void method4177(@OriginalArg(0) boolean arg0) {
		if (Static365.aClass1_Sub14_Sub1_3.aByteArray65.length >= this.anInt5125 * 6) {
			Static365.aClass1_Sub14_Sub1_3.anInt5695 = 0;
		} else {
			Static365.aClass1_Sub14_Sub1_3 = new Class1_Sub14_Sub1((this.anInt5125 + 100) * 6);
		}
		@Pc(38) int local38;
		if (this.aClass121_Sub2_27.aBoolean471) {
			for (local38 = 0; local38 < this.anInt5125; local38++) {
				Static365.aClass1_Sub14_Sub1_3.method4504(this.aShortArray86[local38]);
				Static365.aClass1_Sub14_Sub1_3.method4504(this.aShortArray91[local38]);
				Static365.aClass1_Sub14_Sub1_3.method4504(this.aShortArray87[local38]);
			}
		} else {
			for (local38 = 0; local38 < this.anInt5125; local38++) {
				Static365.aClass1_Sub14_Sub1_3.method4493(this.aShortArray86[local38]);
				Static365.aClass1_Sub14_Sub1_3.method4493(this.aShortArray91[local38]);
				Static365.aClass1_Sub14_Sub1_3.method4493(this.aShortArray87[local38]);
			}
		}
		if (Static365.aClass1_Sub14_Sub1_3.anInt5695 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface2_3 == null) {
				this.anInterface2_3 = this.aClass121_Sub2_27.method4651(Static365.aClass1_Sub14_Sub1_3.anInt5695, true, Static365.aClass1_Sub14_Sub1_3.aByteArray65);
			} else {
				this.anInterface2_3.method5945(Static365.aClass1_Sub14_Sub1_3.aByteArray65, Static365.aClass1_Sub14_Sub1_3.anInt5695);
			}
			this.aClass149_1.anInterface2_2 = this.anInterface2_3;
		} else {
			this.aClass149_1.anInterface2_2 = this.aClass121_Sub2_27.method4651(Static365.aClass1_Sub14_Sub1_3.anInt5695, false, Static365.aClass1_Sub14_Sub1_3.aByteArray65);
		}
		if (!arg0) {
			this.aBoolean413 = true;
		}
	}

	@OriginalMember(owner = "client!ph", name = "xa", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			local27 = 0;
			Static286.anInt4776 = 0;
			Static449.anInt7765 = 0;
			Static44.anInt686 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray38.length > local41) {
					local55 = this.anIntArrayArray38[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static286.anInt4776 += this.anIntArray390[local63];
						Static44.anInt686 += this.anIntArray393[local63];
						Static449.anInt7765 += this.anIntArray392[local63];
						local27++;
					}
				}
			}
			if (local27 <= 0) {
				Static286.anInt4776 = local25;
				Static44.anInt686 = local17;
				Static449.anInt7765 = local21;
			} else {
				Static44.anInt686 = Static44.anInt686 / local27 + local17;
				Static286.anInt4776 = local25 + Static286.anInt4776 / local27;
				Static449.anInt7765 = Static449.anInt7765 / local27 + local21;
			}
			return;
		}
		@Pc(165) int[] local165;
		@Pc(167) int local167;
		if (arg0 == 1) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray38.length > local35) {
					local165 = this.anIntArrayArray38[local35];
					for (local167 = 0; local167 < local165.length; local167++) {
						local57 = local165[local167];
						this.anIntArray390[local57] += local25;
						this.anIntArray393[local57] += local17;
						this.anIntArray392[local57] += local21;
					}
				}
			}
			return;
		}
		@Pc(294) int local294;
		@Pc(313) int local313;
		@Pc(767) int local767;
		if (arg0 == 2) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray38.length) {
					local165 = this.anIntArrayArray38[local35];
					if ((arg5 & 0x1) == 0) {
						for (local167 = 0; local167 < local165.length; local167++) {
							local57 = local165[local167];
							this.anIntArray390[local57] -= Static286.anInt4776;
							this.anIntArray393[local57] -= Static44.anInt686;
							this.anIntArray392[local57] -= Static449.anInt7765;
							if (arg4 != 0) {
								local63 = Class262.anIntArray575[arg4];
								local294 = Class262.anIntArray576[arg4];
								local313 = local294 * this.anIntArray390[local57] + this.anIntArray393[local57] * local63 + 32767 >> 15;
								this.anIntArray393[local57] = local294 * this.anIntArray393[local57] + 32767 - local63 * this.anIntArray390[local57] >> 15;
								this.anIntArray390[local57] = local313;
							}
							if (arg2 != 0) {
								local63 = Class262.anIntArray575[arg2];
								local294 = Class262.anIntArray576[arg2];
								local313 = this.anIntArray393[local57] * local294 + 32767 - local63 * this.anIntArray392[local57] >> 15;
								this.anIntArray392[local57] = local294 * this.anIntArray392[local57] + this.anIntArray393[local57] * local63 + 32767 >> 15;
								this.anIntArray393[local57] = local313;
							}
							if (arg3 != 0) {
								local63 = Class262.anIntArray575[arg3];
								local294 = Class262.anIntArray576[arg3];
								local313 = local294 * this.anIntArray390[local57] + this.anIntArray392[local57] * local63 + 32767 >> 15;
								this.anIntArray392[local57] = this.anIntArray392[local57] * local294 + 32767 - local63 * this.anIntArray390[local57] >> 15;
								this.anIntArray390[local57] = local313;
							}
							this.anIntArray390[local57] += Static286.anInt4776;
							this.anIntArray393[local57] += Static44.anInt686;
							this.anIntArray392[local57] += Static449.anInt7765;
						}
					} else {
						for (local167 = 0; local167 < local165.length; local167++) {
							local57 = local165[local167];
							this.anIntArray390[local57] -= Static286.anInt4776;
							this.anIntArray393[local57] -= Static44.anInt686;
							this.anIntArray392[local57] -= Static449.anInt7765;
							if (arg2 != 0) {
								local63 = Class262.anIntArray575[arg2];
								local294 = Class262.anIntArray576[arg2];
								local313 = local294 * this.anIntArray393[local57] + 32767 - local63 * this.anIntArray392[local57] >> 15;
								this.anIntArray392[local57] = this.anIntArray393[local57] * local63 + local294 * this.anIntArray392[local57] + 32767 >> 15;
								this.anIntArray393[local57] = local313;
							}
							if (arg4 != 0) {
								local63 = Class262.anIntArray575[arg4];
								local294 = Class262.anIntArray576[arg4];
								local313 = local294 * this.anIntArray390[local57] + local63 * this.anIntArray393[local57] + 32767 >> 15;
								this.anIntArray393[local57] = this.anIntArray393[local57] * local294 + 32767 - local63 * this.anIntArray390[local57] >> 15;
								this.anIntArray390[local57] = local313;
							}
							if (arg3 != 0) {
								local63 = Class262.anIntArray575[arg3];
								local294 = Class262.anIntArray576[arg3];
								local313 = this.anIntArray392[local57] * local63 + local294 * this.anIntArray390[local57] + 32767 >> 15;
								this.anIntArray392[local57] = this.anIntArray392[local57] * local294 + 32767 - local63 * this.anIntArray390[local57] >> 15;
								this.anIntArray390[local57] = local313;
							}
							this.anIntArray390[local57] += Static286.anInt4776;
							this.anIntArray393[local57] += Static44.anInt686;
							this.anIntArray392[local57] += Static449.anInt7765;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray38.length) {
						local55 = this.anIntArrayArray38[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local294 = this.anIntArray389[local63];
							local313 = this.anIntArray389[local63 + 1];
							for (local767 = local294; local767 < local313; local767++) {
								@Pc(776) int local776 = this.aShortArray89[local767] - 1;
								if (local776 == -1) {
									break;
								}
								@Pc(785) int local785;
								@Pc(789) int local789;
								@Pc(807) int local807;
								if (arg4 != 0) {
									local785 = Class262.anIntArray575[arg4];
									local789 = Class262.anIntArray576[arg4];
									local807 = this.aShortArray92[local776] * local789 + this.aShortArray88[local776] * local785 + 32767 >> 15;
									this.aShortArray88[local776] = (short) (this.aShortArray88[local776] * local789 + 32767 - local785 * this.aShortArray92[local776] >> 15);
									this.aShortArray92[local776] = (short) local807;
								}
								if (arg2 != 0) {
									local785 = Class262.anIntArray575[arg2];
									local789 = Class262.anIntArray576[arg2];
									local807 = this.aShortArray88[local776] * local789 + 32767 - local785 * this.aShortArray85[local776] >> 15;
									this.aShortArray85[local776] = (short) (this.aShortArray85[local776] * local789 + local785 * this.aShortArray88[local776] + 32767 >> 15);
									this.aShortArray88[local776] = (short) local807;
								}
								if (arg3 != 0) {
									local785 = Class262.anIntArray575[arg3];
									local789 = Class262.anIntArray576[arg3];
									local807 = this.aShortArray92[local776] * local789 + this.aShortArray85[local776] * local785 + 32767 >> 15;
									this.aShortArray85[local776] = (short) (local789 * this.aShortArray85[local776] + 32767 - this.aShortArray92[local776] * local785 >> 15);
									this.aShortArray92[local776] = (short) local807;
								}
							}
						}
					}
				}
				if (this.aClass267_6 == null && this.aClass267_8 != null) {
					this.aClass267_8.anInterface12_7 = null;
				}
				if (this.aClass267_6 != null) {
					this.aClass267_6.anInterface12_7 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray38.length > local35) {
					local165 = this.anIntArrayArray38[local35];
					for (local167 = 0; local167 < local165.length; local167++) {
						local57 = local165[local167];
						this.anIntArray390[local57] -= Static286.anInt4776;
						this.anIntArray393[local57] -= Static44.anInt686;
						this.anIntArray392[local57] -= Static449.anInt7765;
						this.anIntArray390[local57] = arg2 * this.anIntArray390[local57] >> 7;
						this.anIntArray393[local57] = this.anIntArray393[local57] * arg3 >> 7;
						this.anIntArray392[local57] = arg4 * this.anIntArray392[local57] >> 7;
						this.anIntArray390[local57] += Static286.anInt4776;
						this.anIntArray393[local57] += Static44.anInt686;
						this.anIntArray392[local57] += Static449.anInt7765;
					}
				}
			}
		} else {
			@Pc(1227) Class170 local1227;
			@Pc(1232) Class33 local1232;
			if (arg0 == 5) {
				if (this.anIntArrayArray37 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray37.length > local35) {
							local165 = this.anIntArrayArray37[local35];
							for (local167 = 0; local167 < local165.length; local167++) {
								local57 = local165[local167];
								local63 = (this.aByteArray61[local57] & 0xFF) + arg2 * 8;
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray61[local57] = (byte) local63;
							}
							if (local165.length > 0 && this.aClass267_8 != null) {
								this.aClass267_8.anInterface12_7 = null;
							}
						}
					}
					if (this.aClass170Array1 != null) {
						for (local35 = 0; local35 < this.anInt5082; local35++) {
							local1227 = this.aClass170Array1[local35];
							local1232 = this.aClass33Array1[local35];
							local1232.anInt597 = 255 - (this.aByteArray61[local1227.anInt4454] & 0xFF) << 24 | local1232.anInt597 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1478) Class33 local1478;
				if (arg0 == 8) {
					if (this.anIntArrayArray36 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray36.length > local35) {
								local165 = this.anIntArrayArray36[local35];
								for (local167 = 0; local167 < local165.length; local167++) {
									local1478 = this.aClass33Array1[local165[local167]];
									local1478.anInt605 += arg3;
									local1478.anInt598 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray36 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray36.length > local35) {
								local165 = this.anIntArrayArray36[local35];
								for (local167 = 0; local167 < local165.length; local167++) {
									local1478 = this.aClass33Array1[local165[local167]];
									local1478.anInt602 = arg3 * local1478.anInt602 >> 7;
									local1478.anInt604 = local1478.anInt604 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray36 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray36.length) {
							local165 = this.anIntArrayArray36[local35];
							for (local167 = 0; local167 < local165.length; local167++) {
								local1478 = this.aClass33Array1[local165[local167]];
								local1478.anInt599 = arg2 + local1478.anInt599 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray37 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray37.length) {
						local165 = this.anIntArrayArray37[local35];
						for (local167 = 0; local167 < local165.length; local167++) {
							local57 = local165[local167];
							local63 = this.lb[local57] & 0xFFFF;
							local294 = local63 >> 10 & 0x3F;
							local313 = local63 >> 7 & 0x7;
							local767 = local63 & 0x7F;
							@Pc(1320) int local1320 = local294 + arg2 & 0x3F;
							local313 += arg3 / 4;
							if (local313 < 0) {
								local313 = 0;
							} else if (local313 > 7) {
								local313 = 7;
							}
							local767 += arg4;
							if (local767 < 0) {
								local767 = 0;
							} else if (local767 > 127) {
								local767 = 127;
							}
							this.lb[local57] = (short) (local767 | local1320 << 10 | local313 << 7);
						}
						if (local165.length > 0 && this.aClass267_8 != null) {
							this.aClass267_8.anInterface12_7 = null;
						}
					}
				}
				if (this.aClass170Array1 != null) {
					for (local35 = 0; local35 < this.anInt5082; local35++) {
						local1227 = this.aClass170Array1[local35];
						local1232 = this.aClass33Array1[local35];
						local1232.anInt597 = local1232.anInt597 & 0xFF000000 | Static302.anIntArray386[this.lb[local1227.anInt4454] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "W", descriptor = "()V")
	@Override
	protected void W() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5086; local7++) {
			this.anIntArray390[local7] = this.anIntArray390[local7] + 7 >> 4;
			this.anIntArray393[local7] = this.anIntArray393[local7] + 7 >> 4;
			this.anIntArray392[local7] = this.anIntArray392[local7] + 7 >> 4;
		}
		this.aBoolean414 = false;
		if (this.aClass267_5 != null) {
			this.aClass267_5.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "X", descriptor = "()I")
	@Override
	public int X() {
		if (!this.aBoolean414) {
			this.method4180();
		}
		return this.aShort79;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBISI)I")
	private int method4179(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		@Pc(12) int local12 = Static302.anIntArray386[Static344.method4955(arg0, arg2)];
		if (arg3 != -1) {
			@Pc(30) Class132 local30 = this.aClass121_Sub2_27.anInterface5_16.method3920(arg3 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte42 & 0xFF;
			@Pc(46) int local46;
			@Pc(64) int local64;
			if (local35 != 0) {
				if (arg2 < 0) {
					local46 = 0;
				} else if (arg2 <= 127) {
					local46 = arg2 * 131586;
				} else {
					local46 = 16777215;
				}
				if (local35 == 256) {
					local12 = local46;
				} else {
					local64 = 256 - local35;
					local12 = ((local46 & 0xFF00) * local35 + local64 * (local12 & 0xFF00) & 0xFF0000) + (local35 * (local46 & 0xFF00FF) + (local64 * (local12 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local46 = local30.aByte38 & 0xFF;
			if (local46 != 0) {
				local46 += 256;
				@Pc(115) int local115 = (local12 >> 16 & 0xFF) * local46;
				if (local115 > 65535) {
					local115 = 65535;
				}
				local64 = (local12 >> 8 & 0xFF) * local46;
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(141) int local141 = (local12 & 0xFF) * local46;
				if (local141 > 65535) {
					local141 = 65535;
				}
				local12 = (local141 >> 8) + (local64 & 0xFF00) + (local115 << 8 & 0xFF0049);
			}
		}
		return (local12 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	private void method4180() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt5118; local29++) {
			@Pc(36) int local36 = this.anIntArray390[local29];
			@Pc(41) int local41 = this.anIntArray393[local29];
			if (local21 < local41) {
				local21 = local41;
			}
			if (local36 > local13) {
				local13 = local36;
			}
			if (local9 > local41) {
				local9 = local41;
			}
			@Pc(65) int local65 = this.anIntArray392[local29];
			if (local7 > local36) {
				local7 = local36;
			}
			if (local65 < local11) {
				local11 = local65;
			}
			if (local65 > local23) {
				local23 = local65;
			}
			@Pc(96) int local96 = local65 * local65 + local36 * local36;
			if (local25 < local96) {
				local25 = local96;
			}
			local96 = local36 * local36 + local65 * local65 + local41 * local41;
			if (local96 > local27) {
				local27 = local96;
			}
		}
		this.aShort82 = (short) local7;
		this.aShort85 = (short) local13;
		this.aShort79 = (short) local11;
		this.aShort81 = (short) local23;
		this.aShort80 = (short) local21;
		this.aShort84 = (short) local9;
		this.aShort86 = (short) (Math.sqrt((double) local25) + 0.99D);
		Math.sqrt((double) local27);
		this.aBoolean414 = true;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZ)V")
	private void method4181(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass267_8 != null && this.aClass267_8.anInterface12_7 == null;
		@Pc(27) boolean local27 = this.aClass267_6 != null && this.aClass267_6.anInterface12_7 == null;
		@Pc(38) boolean local38 = this.aClass267_5 != null && this.aClass267_5.anInterface12_7 == null;
		@Pc(49) boolean local49 = this.aClass267_7 != null && this.aClass267_7.anInterface12_7 == null;
		if (arg0) {
			local16 &= (this.aByte71 & 0x2) != 0;
			local49 &= (this.aByte71 & 0x8) != 0;
			local38 &= (this.aByte71 & 0x1) != 0;
			local27 &= (this.aByte71 & 0x4) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		@Pc(111) byte local111 = 0;
		if (local38) {
			local103 = 12;
		}
		if (local16) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local109 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local111 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (this.anInt5087 * local103 <= Static365.aClass1_Sub14_Sub1_3.aByteArray65.length) {
			Static365.aClass1_Sub14_Sub1_3.anInt5695 = 0;
		} else {
			Static365.aClass1_Sub14_Sub1_3 = new Class1_Sub14_Sub1(local103 * (this.anInt5087 + 100));
		}
		@Pc(192) int local192;
		@Pc(201) int local201;
		@Pc(229) int local229;
		@Pc(238) int local238;
		if (local38) {
			@Pc(208) int local208;
			@Pc(215) int local215;
			@Pc(220) int local220;
			@Pc(227) int local227;
			if (this.aClass121_Sub2_27.aBoolean471) {
				for (local192 = 0; local192 < this.anInt5118; local192++) {
					local201 = NativeStream.floatToRawIntBits((float) this.anIntArray390[local192]);
					local208 = NativeStream.floatToRawIntBits((float) this.anIntArray393[local192]);
					local215 = NativeStream.floatToRawIntBits((float) this.anIntArray392[local192]);
					local220 = this.anIntArray389[local192];
					local227 = this.anIntArray389[local192 + 1];
					for (local229 = local220; local229 < local227; local229++) {
						local238 = this.aShortArray89[local229] - 1;
						if (local238 == -1) {
							break;
						}
						Static365.aClass1_Sub14_Sub1_3.anInt5695 = local103 * local238;
						Static365.aClass1_Sub14_Sub1_3.method4522(local201);
						Static365.aClass1_Sub14_Sub1_3.method4522(local208);
						Static365.aClass1_Sub14_Sub1_3.method4522(local215);
					}
				}
			} else {
				for (local192 = 0; local192 < this.anInt5118; local192++) {
					local201 = NativeStream.floatToRawIntBits((float) this.anIntArray390[local192]);
					local208 = NativeStream.floatToRawIntBits((float) this.anIntArray393[local192]);
					local215 = NativeStream.floatToRawIntBits((float) this.anIntArray392[local192]);
					local220 = this.anIntArray389[local192];
					local227 = this.anIntArray389[local192 + 1];
					for (local229 = local220; local229 < local227; local229++) {
						local238 = this.aShortArray89[local229] - 1;
						if (local238 == -1) {
							break;
						}
						Static365.aClass1_Sub14_Sub1_3.anInt5695 = local103 * local238;
						Static365.aClass1_Sub14_Sub1_3.method4515(local201);
						Static365.aClass1_Sub14_Sub1_3.method4515(local208);
						Static365.aClass1_Sub14_Sub1_3.method4515(local215);
					}
				}
			}
		}
		@Pc(482) float local482;
		@Pc(375) short[] local375;
		@Pc(371) short[] local371;
		@Pc(379) short[] local379;
		@Pc(367) byte[] local367;
		@Pc(526) float local526;
		if (local16) {
			if (this.aClass267_6 == null) {
				if (this.aClass50_1 == null) {
					local375 = this.aShortArray92;
					local371 = this.aShortArray88;
					local367 = this.aByteArray62;
					local379 = this.aShortArray85;
				} else {
					local367 = this.aClass50_1.aByteArray8;
					local371 = this.aClass50_1.aShortArray11;
					local375 = this.aClass50_1.aShortArray12;
					local379 = this.aClass50_1.aShortArray10;
				}
				@Pc(399) float local399 = this.aClass121_Sub2_27.aFloatArray36[0];
				@Pc(405) float local405 = this.aClass121_Sub2_27.aFloatArray36[1];
				@Pc(411) float local411 = this.aClass121_Sub2_27.aFloatArray36[2];
				@Pc(415) float local415 = this.aClass121_Sub2_27.aFloat95;
				@Pc(425) float local425 = this.aClass121_Sub2_27.aFloat86 * 768.0F / (float) this.aShort78;
				@Pc(435) float local435 = this.aClass121_Sub2_27.aFloat98 * 768.0F / (float) this.aShort78;
				for (@Pc(437) int local437 = 0; local437 < this.anInt5129; local437++) {
					@Pc(457) int local457 = this.method4179(this.lb[local437], this.aByteArray61[local437], this.aShort83, this.aShortArray84[local437]);
					@Pc(462) short local462 = this.aShortArray86[local437];
					@Pc(471) float local471 = this.aClass121_Sub2_27.aFloat87 * (float) (local457 >>> 24);
					local482 = (float) (local457 >> 16 & 0xFF) * this.aClass121_Sub2_27.aFloat100;
					@Pc(493) float local493 = (float) (local457 >> 8 & 0xFF) * this.aClass121_Sub2_27.aFloat88;
					@Pc(498) short local498 = (short) local367[local462];
					if (local498 == 0) {
						local526 = (local411 * (float) local379[local462] + local399 * (float) local375[local462] + (float) local371[local462] * local405) * 0.0026041667F;
					} else {
						local526 = ((float) local379[local462] * local411 + (float) local371[local462] * local405 + local399 * (float) local375[local462]) / (float) (local498 * 256);
					}
					@Pc(563) float local563 = local415 + local526 * (local526 < 0.0F ? local435 : local425);
					@Pc(568) int local568 = (int) (local563 * local471);
					@Pc(573) int local573 = (int) (local563 * local482);
					if (local568 < 0) {
						local568 = 0;
					} else if (local568 > 255) {
						local568 = 255;
					}
					if (local573 < 0) {
						local573 = 0;
					} else if (local573 > 255) {
						local573 = 255;
					}
					@Pc(607) int local607 = (int) (local493 * local563);
					if (local607 < 0) {
						local607 = 0;
					} else if (local607 > 255) {
						local607 = 255;
					}
					Static365.aClass1_Sub14_Sub1_3.anInt5695 = local462 * local103 + local107;
					Static365.aClass1_Sub14_Sub1_3.method4553(local568);
					Static365.aClass1_Sub14_Sub1_3.method4553(local573);
					Static365.aClass1_Sub14_Sub1_3.method4553(local607);
					Static365.aClass1_Sub14_Sub1_3.method4553(255 - (this.aByteArray61[local437] & 0xFF));
					local462 = this.aShortArray91[local437];
					local498 = local367[local462];
					if (local498 == 0) {
						local526 = ((float) local371[local462] * local405 + local399 * (float) local375[local462] + local411 * (float) local379[local462]) * 0.0026041667F;
					} else {
						local526 = ((float) local379[local462] * local411 + local399 * (float) local375[local462] + local405 * (float) local371[local462]) / (float) (local498 * 256);
					}
					local563 = local526 * (local526 < 0.0F ? local435 : local425) + local415;
					local568 = (int) (local471 * local563);
					local573 = (int) (local482 * local563);
					if (local568 < 0) {
						local568 = 0;
					} else if (local568 > 255) {
						local568 = 255;
					}
					if (local573 < 0) {
						local573 = 0;
					} else if (local573 > 255) {
						local573 = 255;
					}
					local607 = (int) (local563 * local493);
					Static365.aClass1_Sub14_Sub1_3.anInt5695 = local107 + local103 * local462;
					if (local607 < 0) {
						local607 = 0;
					} else if (local607 > 255) {
						local607 = 255;
					}
					Static365.aClass1_Sub14_Sub1_3.method4553(local568);
					Static365.aClass1_Sub14_Sub1_3.method4553(local573);
					Static365.aClass1_Sub14_Sub1_3.method4553(local607);
					Static365.aClass1_Sub14_Sub1_3.method4553(255 - (this.aByteArray61[local437] & 0xFF));
					local462 = this.aShortArray87[local437];
					local498 = local367[local462];
					if (local498 == 0) {
						local526 = (local411 * (float) local379[local462] + (float) local375[local462] * local399 + (float) local371[local462] * local405) * 0.0026041667F;
					} else {
						local526 = (local411 * (float) local379[local462] + local399 * (float) local375[local462] + local405 * (float) local371[local462]) / (float) (local498 * 256);
					}
					local563 = local526 * (local526 < 0.0F ? local435 : local425) + local415;
					local568 = (int) (local471 * local563);
					if (local568 < 0) {
						local568 = 0;
					} else if (local568 > 255) {
						local568 = 255;
					}
					local573 = (int) (local482 * local563);
					local607 = (int) (local493 * local563);
					if (local573 < 0) {
						local573 = 0;
					} else if (local573 > 255) {
						local573 = 255;
					}
					if (local607 < 0) {
						local607 = 0;
					} else if (local607 > 255) {
						local607 = 255;
					}
					Static365.aClass1_Sub14_Sub1_3.anInt5695 = local103 * local462 + local107;
					Static365.aClass1_Sub14_Sub1_3.method4553(local568);
					Static365.aClass1_Sub14_Sub1_3.method4553(local573);
					Static365.aClass1_Sub14_Sub1_3.method4553(local607);
					Static365.aClass1_Sub14_Sub1_3.method4553(255 - (this.aByteArray61[local437] & 0xFF));
				}
			} else {
				for (local192 = 0; local192 < this.anInt5129; local192++) {
					local201 = this.method4179(this.lb[local192], this.aByteArray61[local192], this.aShort83, this.aShortArray84[local192]);
					Static365.aClass1_Sub14_Sub1_3.anInt5695 = this.aShortArray86[local192] * local103 + local107;
					Static365.aClass1_Sub14_Sub1_3.method4522(local201);
					Static365.aClass1_Sub14_Sub1_3.anInt5695 = local103 * this.aShortArray91[local192] + local107;
					Static365.aClass1_Sub14_Sub1_3.method4522(local201);
					Static365.aClass1_Sub14_Sub1_3.anInt5695 = local103 * this.aShortArray87[local192] + local107;
					Static365.aClass1_Sub14_Sub1_3.method4522(local201);
				}
			}
		}
		if (local27) {
			if (this.aClass50_1 == null) {
				local367 = this.aByteArray62;
				local375 = this.aShortArray92;
				local379 = this.aShortArray85;
				local371 = this.aShortArray88;
			} else {
				local367 = this.aClass50_1.aByteArray8;
				local371 = this.aClass50_1.aShortArray11;
				local379 = this.aClass50_1.aShortArray10;
				local375 = this.aClass50_1.aShortArray12;
			}
			@Pc(1103) float local1103 = 3.0F / (float) this.aShort78;
			Static365.aClass1_Sub14_Sub1_3.anInt5695 = local109;
			local526 = 3.0F / (float) (this.aShort78 + this.aShort78 / 2);
			if (this.aClass121_Sub2_27.aBoolean471) {
				for (local229 = 0; local229 < this.anInt5087; local229++) {
					local238 = local367[local229] & 0xFF;
					if (local238 == 0) {
						Static365.aClass1_Sub14_Sub1_3.method1407((float) local375[local229] * local526);
						Static365.aClass1_Sub14_Sub1_3.method1407(local526 * (float) local371[local229]);
						Static365.aClass1_Sub14_Sub1_3.method1407(local526 * (float) local379[local229]);
					} else {
						local482 = local1103 / (float) local238;
						Static365.aClass1_Sub14_Sub1_3.method1407((float) local375[local229] * local482);
						Static365.aClass1_Sub14_Sub1_3.method1407(local482 * (float) local371[local229]);
						Static365.aClass1_Sub14_Sub1_3.method1407((float) local379[local229] * local482);
					}
					Static365.aClass1_Sub14_Sub1_3.anInt5695 += local103 - 12;
				}
			} else {
				for (local229 = 0; local229 < this.anInt5087; local229++) {
					local238 = local367[local229] & 0xFF;
					if (local238 == 0) {
						Static365.aClass1_Sub14_Sub1_3.method1406((float) local375[local229] * local526);
						Static365.aClass1_Sub14_Sub1_3.method1406((float) local371[local229] * local526);
						Static365.aClass1_Sub14_Sub1_3.method1406((float) local379[local229] * local526);
					} else {
						local482 = local1103 / (float) local238;
						Static365.aClass1_Sub14_Sub1_3.method1406((float) local375[local229] * local482);
						Static365.aClass1_Sub14_Sub1_3.method1406((float) local371[local229] * local482);
						Static365.aClass1_Sub14_Sub1_3.method1406((float) local379[local229] * local482);
					}
					Static365.aClass1_Sub14_Sub1_3.anInt5695 += local103 - 12;
				}
			}
		}
		if (local49) {
			Static365.aClass1_Sub14_Sub1_3.anInt5695 = local111;
			if (this.aClass121_Sub2_27.aBoolean471) {
				for (local192 = 0; local192 < this.anInt5087; local192++) {
					Static365.aClass1_Sub14_Sub1_3.method1407(this.aFloatArray32[local192]);
					Static365.aClass1_Sub14_Sub1_3.method1407(this.aFloatArray31[local192]);
					Static365.aClass1_Sub14_Sub1_3.anInt5695 += local103 - 8;
				}
			} else {
				for (local192 = 0; local192 < this.anInt5087; local192++) {
					Static365.aClass1_Sub14_Sub1_3.method1406(this.aFloatArray32[local192]);
					Static365.aClass1_Sub14_Sub1_3.method1406(this.aFloatArray31[local192]);
					Static365.aClass1_Sub14_Sub1_3.anInt5695 += local103 - 8;
				}
			}
		}
		Static365.aClass1_Sub14_Sub1_3.anInt5695 = local103 * this.anInt5087;
		@Pc(1416) Interface12 local1416;
		if (arg0) {
			if (this.anInterface12_2 == null) {
				this.anInterface12_2 = this.aClass121_Sub2_27.method4652(Static365.aClass1_Sub14_Sub1_3.aByteArray65, true, local103, Static365.aClass1_Sub14_Sub1_3.anInt5695);
			} else {
				this.anInterface12_2.method5235(Static365.aClass1_Sub14_Sub1_3.aByteArray65, Static365.aClass1_Sub14_Sub1_3.anInt5695, local103);
			}
			this.aByte71 = 0;
			local1416 = this.anInterface12_2;
		} else {
			local1416 = this.aClass121_Sub2_27.method4652(Static365.aClass1_Sub14_Sub1_3.aByteArray65, false, local103, Static365.aClass1_Sub14_Sub1_3.anInt5695);
			this.aBoolean413 = true;
		}
		if (local38) {
			this.aClass267_5.anInterface12_7 = local1416;
			this.aClass267_5.aByte104 = 0;
		}
		if (local49) {
			this.aClass267_7.anInterface12_7 = local1416;
			this.aClass267_7.aByte104 = local111;
		}
		if (local16) {
			this.aClass267_8.anInterface12_7 = local1416;
			this.aClass267_8.aByte104 = local107;
		}
		if (local27) {
			this.aClass267_6.aByte104 = local109;
			this.aClass267_6.anInterface12_7 = local1416;
		}
	}

	@OriginalMember(owner = "client!ph", name = "sa", descriptor = "()V")
	@Override
	public void sa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5118; local3++) {
			this.anIntArray392[local3] = -this.anIntArray392[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt5087; local29++) {
			this.aShortArray85[local29] = (short) -this.aShortArray85[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt5129; local48++) {
			@Pc(55) short local55 = this.aShortArray86[local48];
			this.aShortArray86[local48] = this.aShortArray87[local48];
			this.aShortArray87[local48] = local55;
		}
		if (this.aClass267_6 == null && this.aClass267_8 != null) {
			this.aClass267_8.anInterface12_7 = null;
		}
		if (this.aClass267_6 != null) {
			this.aClass267_6.anInterface12_7 = null;
		}
		if (this.aClass149_1 != null) {
			this.aClass149_1.anInterface2_2 = null;
		}
		if (this.aClass267_5 != null) {
			this.aClass267_5.anInterface12_7 = null;
		}
		this.aBoolean414 = false;
	}

	@OriginalMember(owner = "client!ph", name = "ra", descriptor = "()I")
	@Override
	public int ra() {
		if (!this.aBoolean414) {
			this.method4180();
		}
		return this.aShort86;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ia;Lclient!sf;I)V")
	@Override
	public void method4167(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class36_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5087 == 0) {
			return;
		}
		@Pc(16) Class43_Sub2 local16 = this.aClass121_Sub2_27.aClass43_Sub2_4;
		@Pc(19) Class43_Sub2 local19 = (Class43_Sub2) arg0;
		if (!this.aBoolean414) {
			this.method4180();
		}
		this.method4185(local19);
		Static321.aFloat84 = local16.aFloat49 * local19.aFloat48 + local16.aFloat42 * local19.aFloat40 + local16.aFloat47 * local19.aFloat45 + local16.aFloat45;
		Static439.aFloat123 = local19.aFloat43 * local16.aFloat49 + local19.aFloat51 * local16.aFloat42 + local16.aFloat47 * local19.aFloat42;
		@Pc(76) float local76 = Static439.aFloat123 * (float) this.aShort84 + Static321.aFloat84;
		@Pc(84) float local84 = Static321.aFloat84 + Static439.aFloat123 * (float) this.aShort80;
		@Pc(94) float local94;
		@Pc(100) float local100;
		if (local84 < local76) {
			local94 = local84 - (float) this.aShort86;
			local100 = (float) this.aShort86 + local76;
		} else {
			local100 = local84 + (float) this.aShort86;
			local94 = (float) -this.aShort86 + local76;
		}
		if (this.aClass121_Sub2_27.aFloat105 <= local94 || (float) this.aClass121_Sub2_27.anInt5968 >= local100) {
			return;
		}
		Static219.aFloat67 = local16.aFloat44 * local19.aFloat42 + local16.aFloat50 * local19.aFloat43 + local19.aFloat51 * local16.aFloat43;
		Static199.aFloat62 = local16.aFloat48 + local16.aFloat44 * local19.aFloat45 + local16.aFloat43 * local19.aFloat40 + local16.aFloat50 * local19.aFloat48;
		@Pc(177) float local177 = Static199.aFloat62 + Static219.aFloat67 * (float) this.aShort84;
		@Pc(185) float local185 = Static199.aFloat62 + Static219.aFloat67 * (float) this.aShort80;
		@Pc(212) float local212;
		@Pc(200) float local200;
		if (local185 < local177) {
			local200 = (local177 + (float) this.aShort86) * (float) this.aClass121_Sub2_27.anInt5948;
			local212 = (float) this.aClass121_Sub2_27.anInt5948 * ((float) -this.aShort86 + local185);
		} else {
			local200 = ((float) this.aShort86 + local185) * (float) this.aClass121_Sub2_27.anInt5948;
			local212 = ((float) -this.aShort86 + local177) * (float) this.aClass121_Sub2_27.anInt5948;
		}
		if (this.aClass121_Sub2_27.aFloat97 <= local212 / local100 || this.aClass121_Sub2_27.aFloat96 >= local200 / local100) {
			return;
		}
		Static35.aFloat9 = local16.aFloat46 * local19.aFloat42 + local16.aFloat41 * local19.aFloat43 + local16.aFloat51 * local19.aFloat51;
		Static255.aFloat77 = local16.aFloat40 + local19.aFloat48 * local16.aFloat41 + local19.aFloat40 * local16.aFloat51 + local19.aFloat45 * local16.aFloat46;
		@Pc(302) float local302 = Static255.aFloat77 + Static35.aFloat9 * (float) this.aShort84;
		@Pc(310) float local310 = Static255.aFloat77 + (float) this.aShort80 * Static35.aFloat9;
		@Pc(337) float local337;
		@Pc(325) float local325;
		if (local310 < local302) {
			local325 = (float) this.aClass121_Sub2_27.anInt5981 * ((float) this.aShort86 + local302);
			local337 = ((float) -this.aShort86 + local310) * (float) this.aClass121_Sub2_27.anInt5981;
		} else {
			local337 = ((float) -this.aShort86 + local302) * (float) this.aClass121_Sub2_27.anInt5981;
			local325 = (float) this.aClass121_Sub2_27.anInt5981 * (local310 + (float) this.aShort86);
		}
		if (local337 / local100 >= this.aClass121_Sub2_27.aFloat99 || local325 / local100 <= this.aClass121_Sub2_27.aFloat94) {
			return;
		}
		if (arg1 != null || this.aClass170Array1 != null) {
			Static195.aFloat61 = local16.aFloat44 * local19.aFloat47 + local16.aFloat50 * local19.aFloat44 + local16.aFloat43 * local19.aFloat46;
			Static251.aFloat76 = local16.aFloat41 * local19.aFloat44 + local16.aFloat51 * local19.aFloat46 + local16.aFloat46 * local19.aFloat47;
			Static323.aFloat85 = local19.aFloat46 * local16.aFloat42 + local16.aFloat49 * local19.aFloat44 + local19.aFloat47 * local16.aFloat47;
			Static59.aFloat15 = local16.aFloat49 * local19.aFloat50 + local19.aFloat41 * local16.aFloat42 + local16.aFloat47 * local19.aFloat49;
			Static31.aFloat7 = local16.aFloat41 * local19.aFloat50 + local19.aFloat41 * local16.aFloat51 + local16.aFloat46 * local19.aFloat49;
			Static142.aFloat37 = local16.aFloat43 * local19.aFloat41 + local19.aFloat50 * local16.aFloat50 + local16.aFloat44 * local19.aFloat49;
		}
		if (arg1 != null) {
			@Pc(497) boolean local497 = false;
			@Pc(499) boolean local499 = true;
			@Pc(507) int local507 = this.aShort82 + this.aShort85 >> 1;
			@Pc(516) int local516 = this.aShort79 + this.aShort81 >> 1;
			@Pc(535) int local535 = (int) ((float) this.aShort84 * Static219.aFloat67 + Static199.aFloat62 + Static142.aFloat37 * (float) local507 + Static195.aFloat61 * (float) local516);
			@Pc(554) int local554 = (int) (Static251.aFloat76 * (float) local516 + (float) this.aShort84 * Static35.aFloat9 + Static31.aFloat7 * (float) local507 + Static255.aFloat77);
			@Pc(573) int local573 = (int) ((float) local516 * Static323.aFloat85 + Static59.aFloat15 * (float) local507 + Static321.aFloat84 + (float) this.aShort84 * Static439.aFloat123);
			if (local573 < this.aClass121_Sub2_27.anInt5968) {
				local497 = true;
			} else {
				arg1.anInt6561 = local554 * this.aClass121_Sub2_27.anInt5981 / local573 + this.aClass121_Sub2_27.anInt5952;
				arg1.anInt6562 = local535 * this.aClass121_Sub2_27.anInt5948 / local573 + this.aClass121_Sub2_27.anInt5982;
			}
			@Pc(627) int local627 = (int) ((float) local507 * Static142.aFloat37 + Static199.aFloat62 + (float) this.aShort80 * Static219.aFloat67 + (float) local516 * Static195.aFloat61);
			@Pc(646) int local646 = (int) ((float) this.aShort80 * Static35.aFloat9 + (float) local507 * Static31.aFloat7 + Static255.aFloat77 + Static251.aFloat76 * (float) local516);
			@Pc(665) int local665 = (int) (Static323.aFloat85 * (float) local516 + Static59.aFloat15 * (float) local507 + Static321.aFloat84 + (float) this.aShort80 * Static439.aFloat123);
			if (local665 >= this.aClass121_Sub2_27.anInt5968) {
				arg1.anInt6563 = local646 * this.aClass121_Sub2_27.anInt5981 / local665 + this.aClass121_Sub2_27.anInt5952;
				arg1.anInt6564 = this.aClass121_Sub2_27.anInt5948 * local627 / local665 + this.aClass121_Sub2_27.anInt5982;
			} else {
				local497 = true;
			}
			if (local497) {
				if (local573 < this.aClass121_Sub2_27.anInt5968 && this.aClass121_Sub2_27.anInt5968 > local665) {
					local499 = false;
				} else {
					@Pc(747) int local747;
					@Pc(758) int local758;
					@Pc(770) int local770;
					if (this.aClass121_Sub2_27.anInt5968 > local573) {
						local747 = (local665 - this.aClass121_Sub2_27.anInt5968 << 16) / (local665 - local573);
						local758 = local627 + ((local627 - local535) * local747 >> 16);
						arg1.anInt6562 = this.aClass121_Sub2_27.anInt5982 + local758 * this.aClass121_Sub2_27.anInt5948 / this.aClass121_Sub2_27.anInt5968;
						local770 = local646 + (local747 * (local646 - local554) >> 16);
						arg1.anInt6561 = this.aClass121_Sub2_27.anInt5952 + local770 * this.aClass121_Sub2_27.anInt5981 / this.aClass121_Sub2_27.anInt5968;
					} else if (this.aClass121_Sub2_27.anInt5968 > local665) {
						local747 = (local573 - this.aClass121_Sub2_27.anInt5968 << 16) / (local573 - local665);
						local758 = local535 + ((local535 - local627) * local747 >> 16);
						local770 = local554 + ((local554 - local646) * local747 >> 16);
						arg1.anInt6562 = local758 * this.aClass121_Sub2_27.anInt5948 / this.aClass121_Sub2_27.anInt5968 + this.aClass121_Sub2_27.anInt5982;
						arg1.anInt6561 = this.aClass121_Sub2_27.anInt5952 + local770 * this.aClass121_Sub2_27.anInt5981 / this.aClass121_Sub2_27.anInt5968;
					}
				}
			}
			if (local499) {
				arg1.aBoolean534 = true;
				if (local665 >= local573) {
					arg1.anInt6565 = this.aClass121_Sub2_27.anInt5982 + this.aClass121_Sub2_27.anInt5948 * (local627 - -this.aShort86) / local665 - arg1.anInt6564;
				} else {
					arg1.anInt6565 = this.aClass121_Sub2_27.anInt5948 * (this.aShort86 + local535) / local573 + this.aClass121_Sub2_27.anInt5982 - arg1.anInt6562;
				}
			}
		}
		this.aClass121_Sub2_27.method4666();
		this.aClass121_Sub2_27.method4696(local19);
		this.method4183();
		this.aClass121_Sub2_27.method4680();
		this.method4174();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5129; local7++) {
			local16 = this.lb[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			@Pc(61) int local61 = local16 & 0x7F;
			if (arg2 != -1) {
				local61 += (arg2 - local61) * arg3 >> 7;
			}
			this.lb[local7] = (short) (local61 | local22 << 10 | local28 << 7);
		}
		if (this.aClass170Array1 != null) {
			for (local16 = 0; local16 < this.anInt5082; local16++) {
				@Pc(111) Class170 local111 = this.aClass170Array1[local16];
				@Pc(116) Class33 local116 = this.aClass33Array1[local16];
				local116.anInt597 = Static302.anIntArray386[this.lb[local111.anInt4454] & 0xFFFF] & 0xFFFFFF | local116.anInt597 & 0xFF000000;
			}
		}
		if (this.aClass267_8 != null) {
			this.aClass267_8.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "va", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static44.anInt686 = 0;
			Static286.anInt4776 = 0;
			Static449.anInt7765 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray38.length > local38) {
					local48 = this.anIntArrayArray38[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray93 == null || (this.aShortArray93[local56] & arg6) != 0) {
							Static286.anInt4776 += this.anIntArray390[local56];
							Static44.anInt686 += this.anIntArray393[local56];
							Static449.anInt7765 += this.anIntArray392[local56];
							local30++;
						}
					}
				}
			}
			if (local30 <= 0) {
				Static449.anInt7765 = arg4;
				Static44.anInt686 = arg3;
				Static286.anInt4776 = arg2;
			} else {
				Static44.anInt686 = Static44.anInt686 / local30 + arg3;
				Static449.anInt7765 = arg4 + Static449.anInt7765 / local30;
				Static281.aBoolean376 = true;
				Static286.anInt4776 = arg2 + Static286.anInt4776 / local30;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg7[0] * arg2 + arg7[1] * arg3 + arg4 * arg7[2] + 16384 >> 15;
				local32 = arg3 * arg7[4] + arg2 * arg7[3] + arg7[5] * arg4 + 16384 >> 15;
				local38 = arg7[8] * arg4 + arg3 * arg7[7] + arg7[6] * arg2 + 16384 >> 15;
				arg3 = local32;
				arg4 = local38;
				arg2 = local30;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray38.length > local32) {
					local247 = this.anIntArrayArray38[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local50 = local247[local249];
						if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local50]) != 0) {
							this.anIntArray390[local50] += arg2;
							this.anIntArray393[local50] += arg3;
							this.anIntArray392[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(388) int local388;
		@Pc(406) int local406;
		@Pc(635) int local635;
		@Pc(644) int local644;
		@Pc(653) int local653;
		@Pc(657) int local657;
		@Pc(675) int local675;
		@Pc(1026) int local1026;
		@Pc(1034) int local1034;
		@Pc(1190) int local1190;
		@Pc(1216) int local1216;
		@Pc(1220) int local1220;
		@Pc(1228) int local1228;
		@Pc(1233) int local1233;
		@Pc(1237) int local1237;
		@Pc(1241) int local1241;
		@Pc(1243) int local1243;
		@Pc(1373) int[] local1373;
		@Pc(1375) int local1375;
		@Pc(1379) int local1379;
		@Pc(1383) int local1383;
		@Pc(1385) int local1385;
		@Pc(1517) int local1517;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray38.length > local32) {
						local247 = this.anIntArrayArray38[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local50 = local247[local249];
							if (this.aShortArray93 == null || (this.aShortArray93[local50] & arg6) != 0) {
								this.anIntArray390[local50] -= Static286.anInt4776;
								this.anIntArray393[local50] -= Static44.anInt686;
								this.anIntArray392[local50] -= Static449.anInt7765;
								if (arg4 != 0) {
									local56 = Class262.anIntArray575[arg4];
									local388 = Class262.anIntArray576[arg4];
									local406 = local388 * this.anIntArray390[local50] + this.anIntArray393[local50] * local56 + 32767 >> 15;
									this.anIntArray393[local50] = this.anIntArray393[local50] * local388 + 32767 - this.anIntArray390[local50] * local56 >> 15;
									this.anIntArray390[local50] = local406;
								}
								if (arg2 != 0) {
									local56 = Class262.anIntArray575[arg2];
									local388 = Class262.anIntArray576[arg2];
									local406 = this.anIntArray393[local50] * local388 + 32767 - this.anIntArray392[local50] * local56 >> 15;
									this.anIntArray392[local50] = this.anIntArray393[local50] * local56 + local388 * this.anIntArray392[local50] + 32767 >> 15;
									this.anIntArray393[local50] = local406;
								}
								if (arg3 != 0) {
									local56 = Class262.anIntArray575[arg3];
									local388 = Class262.anIntArray576[arg3];
									local406 = local388 * this.anIntArray390[local50] + this.anIntArray392[local50] * local56 + 32767 >> 15;
									this.anIntArray392[local50] = local388 * this.anIntArray392[local50] + 32767 - local56 * this.anIntArray390[local50] >> 15;
									this.anIntArray390[local50] = local406;
								}
								this.anIntArray390[local50] += Static286.anInt4776;
								this.anIntArray393[local50] += Static44.anInt686;
								this.anIntArray392[local50] += Static449.anInt7765;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray38.length) {
							local48 = this.anIntArrayArray38[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local56]) != 0) {
									local388 = this.anIntArray389[local56];
									local406 = this.anIntArray389[local56 + 1];
									for (local635 = local388; local635 < local406; local635++) {
										local644 = this.aShortArray89[local635] - 1;
										if (local644 == -1) {
											break;
										}
										if (arg4 != 0) {
											local653 = Class262.anIntArray575[arg4];
											local657 = Class262.anIntArray576[arg4];
											local675 = this.aShortArray92[local644] * local657 + this.aShortArray88[local644] * local653 + 32767 >> 15;
											this.aShortArray88[local644] = (short) (local657 * this.aShortArray88[local644] + 32767 - this.aShortArray92[local644] * local653 >> 15);
											this.aShortArray92[local644] = (short) local675;
										}
										if (arg2 != 0) {
											local653 = Class262.anIntArray575[arg2];
											local657 = Class262.anIntArray576[arg2];
											local675 = this.aShortArray88[local644] * local657 + 32767 - this.aShortArray85[local644] * local653 >> 15;
											this.aShortArray85[local644] = (short) (this.aShortArray85[local644] * local657 + this.aShortArray88[local644] * local653 + 32767 >> 15);
											this.aShortArray88[local644] = (short) local675;
										}
										if (arg3 != 0) {
											local653 = Class262.anIntArray575[arg3];
											local657 = Class262.anIntArray576[arg3];
											local675 = local657 * this.aShortArray92[local644] + local653 * this.aShortArray85[local644] + 32767 >> 15;
											this.aShortArray85[local644] = (short) (this.aShortArray85[local644] * local657 + 32767 - this.aShortArray92[local644] * local653 >> 15);
											this.aShortArray92[local644] = (short) local675;
										}
									}
								}
							}
						}
					}
					if (this.aClass267_6 == null && this.aClass267_8 != null) {
						this.aClass267_8.anInterface12_7 = null;
					}
					if (this.aClass267_6 != null) {
						this.aClass267_6.anInterface12_7 = null;
						return;
					}
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static281.aBoolean376) {
					local388 = Static449.anInt7765 * arg7[6] + arg7[3] * Static44.anInt686 + arg7[0] * Static286.anInt4776 + 16384 >> 15;
					local406 = arg7[7] * Static449.anInt7765 + Static44.anInt686 * arg7[4] + Static286.anInt4776 * arg7[1] + 16384 >> 15;
					local406 += local50;
					local388 += local249;
					local635 = Static286.anInt4776 * arg7[2] + Static44.anInt686 * arg7[5] + Static449.anInt7765 * arg7[8] + 16384 >> 15;
					Static44.anInt686 = local406;
					local635 += local56;
					Static286.anInt4776 = local388;
					Static449.anInt7765 = local635;
					Static281.aBoolean376 = false;
				}
				@Pc(994) int[] local994 = new int[9];
				local406 = Class262.anIntArray576[arg2];
				local635 = Class262.anIntArray575[arg2];
				local644 = Class262.anIntArray576[arg3];
				local653 = Class262.anIntArray575[arg3];
				local657 = Class262.anIntArray576[arg4];
				local675 = Class262.anIntArray575[arg4];
				local1026 = local635 * local657 + 16384 >> 15;
				local1034 = local675 * local635 + 16384 >> 15;
				local994[8] = local644 * local406 + 16384 >> 15;
				local994[0] = local1034 * local653 + local657 * local644 + 16384 >> 15;
				local994[4] = local657 * local406 + 16384 >> 15;
				local994[2] = local406 * local653 + 16384 >> 15;
				local994[5] = -local635;
				local994[1] = local675 * -local644 + local653 * local1026 + 16384 >> 15;
				local994[6] = local657 * -local653 + local1034 * local644 + 16384 >> 15;
				local994[3] = local406 * local675 + 16384 >> 15;
				local994[7] = local644 * local1026 + local653 * local675 + 16384 >> 15;
				@Pc(1164) int local1164 = -Static286.anInt4776 * local994[0] + -Static44.anInt686 * local994[1] + -Static449.anInt7765 * local994[2] + 16384 >> 15;
				local1190 = -Static286.anInt4776 * local994[3] + -Static44.anInt686 * local994[4] + -Static449.anInt7765 * local994[5] + 16384 >> 15;
				local1216 = local994[8] * -Static449.anInt7765 + local994[6] * -Static286.anInt4776 + -Static44.anInt686 * local994[7] + 16384 >> 15;
				local1220 = Static286.anInt4776 + local1164;
				@Pc(1224) int local1224 = Static44.anInt686 + local1190;
				local1228 = local1216 + Static449.anInt7765;
				@Pc(1231) int[] local1231 = new int[9];
				for (local1233 = 0; local1233 < 3; local1233++) {
					for (local1237 = 0; local1237 < 3; local1237++) {
						local1241 = 0;
						for (local1243 = 0; local1243 < 3; local1243++) {
							local1241 += arg7[local1237 * 3 + local1243] * local994[local1233 * 3 + local1243];
						}
						local1231[local1233 * 3 + local1237] = local1241 + 16384 >> 15;
					}
				}
				local1237 = local994[2] * local56 + local994[1] * local50 + local994[0] * local249 + 16384 >> 15;
				local1241 = local994[5] * local56 + local249 * local994[3] + local994[4] * local50 + 16384 >> 15;
				local1241 += local1224;
				local1237 += local1220;
				local1243 = local50 * local994[7] + local249 * local994[6] + local994[8] * local56 + 16384 >> 15;
				local1243 += local1228;
				local1373 = new int[9];
				for (local1375 = 0; local1375 < 3; local1375++) {
					for (local1379 = 0; local1379 < 3; local1379++) {
						local1383 = 0;
						for (local1385 = 0; local1385 < 3; local1385++) {
							local1383 += local1231[local1385 * 3 + local1379] * arg7[local1385 + local1375 * 3];
						}
						local1373[local1375 * 3 + local1379] = local1383 + 16384 >> 15;
					}
				}
				local1379 = arg7[1] * local1241 + arg7[0] * local1237 + arg7[2] * local1243 + 16384 >> 15;
				local1383 = arg7[3] * local1237 + arg7[4] * local1241 + local1243 * arg7[5] + 16384 >> 15;
				local1383 += local32;
				local1379 += local30;
				local1385 = local1241 * arg7[7] + arg7[6] * local1237 + arg7[8] * local1243 + 16384 >> 15;
				local1385 += local38;
				for (local1517 = 0; local1517 < local8; local1517++) {
					@Pc(1523) int local1523 = arg1[local1517];
					if (this.anIntArrayArray38.length > local1523) {
						@Pc(1533) int[] local1533 = this.anIntArrayArray38[local1523];
						for (@Pc(1535) int local1535 = 0; local1535 < local1533.length; local1535++) {
							@Pc(1541) int local1541 = local1533[local1535];
							if (this.aShortArray93 == null || (this.aShortArray93[local1541] & arg6) != 0) {
								@Pc(1583) int local1583 = local1373[2] * this.anIntArray392[local1541] + local1373[0] * this.anIntArray390[local1541] + local1373[1] * this.anIntArray393[local1541] + 16384 >> 15;
								@Pc(1614) int local1614 = local1373[5] * this.anIntArray392[local1541] + this.anIntArray390[local1541] * local1373[3] + local1373[4] * this.anIntArray393[local1541] + 16384 >> 15;
								@Pc(1618) int local1618 = local1583 + local1379;
								@Pc(1622) int local1622 = local1614 + local1383;
								@Pc(1654) int local1654 = this.anIntArray393[local1541] * local1373[7] + this.anIntArray390[local1541] * local1373[6] + this.anIntArray392[local1541] * local1373[8] + 16384 >> 15;
								this.anIntArray390[local1541] = local1618;
								@Pc(1663) int local1663 = local1654 + local1385;
								this.anIntArray393[local1541] = local1622;
								this.anIntArray392[local1541] = local1663;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2590) Class170 local2590;
			@Pc(2595) Class33 local2595;
			if (arg0 == 5) {
				if (this.anIntArrayArray37 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray37.length > local32) {
							local247 = this.anIntArrayArray37[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local50 = local247[local249];
								if (this.aShortArray90 == null || (this.aShortArray90[local50] & arg6) != 0) {
									local56 = (this.aByteArray61[local50] & 0xFF) + (arg2 * 8);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray61[local50] = (byte) local56;
									if (this.aClass267_8 != null) {
										this.aClass267_8.anInterface12_7 = null;
									}
								}
							}
						}
					}
					if (this.aClass170Array1 != null) {
						for (local32 = 0; local32 < this.anInt5082; local32++) {
							local2590 = this.aClass170Array1[local32];
							local2595 = this.aClass33Array1[local32];
							local2595.anInt597 = 255 - (this.aByteArray61[local2590.anInt4454] & 0xFF) << 24 | local2595.anInt597 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2849) Class33 local2849;
				if (arg0 == 8) {
					if (this.anIntArrayArray36 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray36.length) {
								local247 = this.anIntArrayArray36[local32];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2849 = this.aClass33Array1[local247[local249]];
									local2849.anInt605 += arg3;
									local2849.anInt598 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray36 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray36.length) {
								local247 = this.anIntArrayArray36[local32];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2849 = this.aClass33Array1[local247[local249]];
									local2849.anInt604 = local2849.anInt604 * arg2 >> 7;
									local2849.anInt602 = local2849.anInt602 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray36 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray36.length > local32) {
							local247 = this.anIntArrayArray36[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2849 = this.aClass33Array1[local247[local249]];
								local2849.anInt599 = arg2 + local2849.anInt599 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray37 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray37.length > local32) {
						local247 = this.anIntArrayArray37[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local50 = local247[local249];
							if (this.aShortArray90 == null || (arg6 & this.aShortArray90[local50]) != 0) {
								local56 = this.lb[local50] & 0xFFFF;
								local388 = local56 >> 10 & 0x3F;
								local406 = local56 >> 7 & 0x7;
								@Pc(2696) int local2696 = arg2 + local388 & 0x3F;
								local635 = local56 & 0x7F;
								local406 += arg3 / 4;
								local635 += arg4;
								if (local406 < 0) {
									local406 = 0;
								} else if (local406 > 7) {
									local406 = 7;
								}
								if (local635 < 0) {
									local635 = 0;
								} else if (local635 > 127) {
									local635 = 127;
								}
								this.lb[local50] = (short) (local2696 << 10 | local406 << 7 | local635);
								if (this.aClass267_8 != null) {
									this.aClass267_8.anInterface12_7 = null;
								}
							}
						}
					}
				}
				if (this.aClass170Array1 != null) {
					for (local32 = 0; local32 < this.anInt5082; local32++) {
						local2590 = this.aClass170Array1[local32];
						local2595 = this.aClass33Array1[local32];
						local2595.anInt597 = local2595.anInt597 & 0xFF000000 | Static302.anIntArray386[this.lb[local2590.anInt4454] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray38.length) {
					local247 = this.anIntArrayArray38[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local50 = local247[local249];
						if (this.aShortArray93 == null || (this.aShortArray93[local50] & arg6) != 0) {
							this.anIntArray390[local50] -= Static286.anInt4776;
							this.anIntArray393[local50] -= Static44.anInt686;
							this.anIntArray392[local50] -= Static449.anInt7765;
							this.anIntArray390[local50] = arg2 * this.anIntArray390[local50] >> 7;
							this.anIntArray393[local50] = arg3 * this.anIntArray393[local50] >> 7;
							this.anIntArray392[local50] = arg4 * this.anIntArray392[local50] >> 7;
							this.anIntArray390[local50] += Static286.anInt4776;
							this.anIntArray393[local50] += Static44.anInt686;
							this.anIntArray392[local50] += Static449.anInt7765;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static281.aBoolean376) {
				local388 = Static44.anInt686 * arg7[3] + Static286.anInt4776 * arg7[0] + Static449.anInt7765 * arg7[6] + 16384 >> 15;
				local406 = arg7[1] * Static286.anInt4776 + arg7[4] * Static44.anInt686 + arg7[7] * Static449.anInt7765 + 16384 >> 15;
				local635 = Static44.anInt686 * arg7[5] + Static286.anInt4776 * arg7[2] + Static449.anInt7765 * arg7[8] + 16384 >> 15;
				local406 += local50;
				local388 += local249;
				Static44.anInt686 = local406;
				Static286.anInt4776 = local388;
				local635 += local56;
				Static449.anInt7765 = local635;
				Static281.aBoolean376 = false;
			}
			local388 = arg2 << 15 >> 7;
			local406 = arg3 << 15 >> 7;
			local635 = arg4 << 15 >> 7;
			local644 = local388 * -Static286.anInt4776 + 16384 >> 15;
			local653 = -Static44.anInt686 * local406 + 16384 >> 15;
			local657 = local635 * -Static449.anInt7765 + 16384 >> 15;
			local675 = local644 + Static286.anInt4776;
			local1026 = local653 + Static44.anInt686;
			local1034 = Static449.anInt7765 + local657;
			@Pc(2019) int[] local2019 = new int[] { local388 * arg7[0] + 16384 >> 15, arg7[3] * local388 + 16384 >> 15, local388 * arg7[6] + 16384 >> 15, arg7[1] * local406 + 16384 >> 15, local406 * arg7[4] + 16384 >> 15, arg7[7] * local406 + 16384 >> 15, arg7[2] * local635 + 16384 >> 15, local635 * arg7[5] + 16384 >> 15, arg7[8] * local635 + 16384 >> 15 };
			local1190 = local249 * local388 + 16384 >> 15;
			local1216 = local50 * local406 + 16384 >> 15;
			@Pc(2147) int local2147 = local1190 + local675;
			@Pc(2151) int local2151 = local1216 + local1026;
			local1220 = local635 * local56 + 16384 >> 15;
			@Pc(2163) int local2163 = local1220 + local1034;
			@Pc(2166) int[] local2166 = new int[9];
			@Pc(2172) int local2172;
			for (local1228 = 0; local1228 < 3; local1228++) {
				for (local2172 = 0; local2172 < 3; local2172++) {
					local1233 = 0;
					for (local1237 = 0; local1237 < 3; local1237++) {
						local1233 += local2019[local1237 * 3 + local2172] * arg7[local1228 * 3 + local1237];
					}
					local2166[local1228 * 3 + local2172] = local1233 + 16384 >> 15;
				}
			}
			local2172 = arg7[0] * local2147 + local2151 * arg7[1] + local2163 * arg7[2] + 16384 >> 15;
			local1233 = local2147 * arg7[3] + arg7[4] * local2151 + arg7[5] * local2163 + 16384 >> 15;
			local1237 = arg7[8] * local2163 + arg7[7] * local2151 + arg7[6] * local2147 + 16384 >> 15;
			local1233 += local32;
			local2172 += local30;
			local1237 += local38;
			for (local1241 = 0; local1241 < local8; local1241++) {
				local1243 = arg1[local1241];
				if (local1243 < this.anIntArrayArray38.length) {
					local1373 = this.anIntArrayArray38[local1243];
					for (local1375 = 0; local1375 < local1373.length; local1375++) {
						local1379 = local1373[local1375];
						if (this.aShortArray93 == null || (this.aShortArray93[local1379] & arg6) != 0) {
							local1383 = this.anIntArray392[local1379] * local2166[2] + local2166[0] * this.anIntArray390[local1379] + local2166[1] * this.anIntArray393[local1379] + 16384 >> 15;
							local1385 = this.anIntArray392[local1379] * local2166[5] + this.anIntArray393[local1379] * local2166[4] + local2166[3] * this.anIntArray390[local1379] + 16384 >> 15;
							local1517 = local2166[7] * this.anIntArray393[local1379] + local2166[6] * this.anIntArray390[local1379] + this.anIntArray392[local1379] * local2166[8] + 16384 >> 15;
							@Pc(2441) int local2441 = local1385 + local1233;
							@Pc(2445) int local2445 = local1383 + local2172;
							this.anIntArray390[local1379] = local2445;
							@Pc(2454) int local2454 = local1517 + local1237;
							this.anIntArray393[local1379] = local2441;
							this.anIntArray392[local1379] = local2454;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		if (this.aClass267_8 != null) {
			this.aClass267_8.anInterface12_7 = null;
		}
		this.aShort78 = (short) arg0;
		if (this.aClass267_6 != null) {
			this.aClass267_6.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
	private void method4183() {
		if (this.anInt5125 == 0) {
			return;
		}
		if (this.aByte71 != 0) {
			this.method4181(true);
		}
		this.method4181(false);
		if (this.aClass149_1 != null) {
			if (this.aClass149_1.anInterface2_2 == null) {
				this.method4177((this.aByte71 & 0x10) != 0);
			}
			if (this.aClass149_1.anInterface2_2 != null) {
				this.aClass121_Sub2_27.method4663(this.aClass267_6 != null);
				this.aClass121_Sub2_27.method4724(this.aClass267_5, this.aClass267_6, this.aClass267_7, this.aClass267_8);
				@Pc(79) int local79 = this.anIntArray391.length - 1;
				for (@Pc(81) int local81 = 0; local81 < local79; local81++) {
					@Pc(88) int local88 = this.anIntArray391[local81];
					@Pc(95) int local95 = this.anIntArray391[local81 + 1];
					@Pc(102) int local102 = this.aShortArray84[local88] & 0xFFFF;
					if (local102 == 65535) {
						local102 = -1;
					}
					this.aClass121_Sub2_27.method4688(local102, this.aClass267_6 != null);
					this.aClass121_Sub2_27.method4725((local95 - local88) * 3, this.aClass149_1.anInterface2_2, local88 * 3);
				}
			}
		}
		this.method4175();
	}

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "()I")
	@Override
	public int n() {
		return this.anInt5126;
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "()[Lclient!qr;")
	@Override
	public Class203[] method4169() {
		return this.aClass203Array4;
	}

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "()I")
	@Override
	public int C() {
		if (!this.aBoolean414) {
			this.method4180();
		}
		return this.aShort81;
	}

	@OriginalMember(owner = "client!ph", name = "XA", descriptor = "(III)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5118; local3++) {
			if (arg0 != 128) {
				this.anIntArray390[local3] = this.anIntArray390[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray393[local3] = arg1 * this.anIntArray393[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray392[local3] = this.anIntArray392[local3] * arg2 >> 7;
			}
		}
		this.aBoolean414 = false;
		if (this.aClass267_5 != null) {
			this.aClass267_5.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIIZLclient!ph;Lclient!ph;)Lclient!c;")
	private Class37 method4184(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class37_Sub2 arg3, @OriginalArg(5) Class37_Sub2 arg4) {
		arg3.anInt5125 = this.anInt5125;
		arg3.anInt5086 = this.anInt5086;
		arg3.anInt5126 = arg1;
		arg3.anInt5118 = this.anInt5118;
		arg3.anInt5082 = this.anInt5082;
		arg3.anInt5087 = this.anInt5087;
		arg3.aShort78 = this.aShort78;
		arg3.anInt5121 = this.anInt5121;
		arg3.aShort83 = this.aShort83;
		arg3.aByte71 = 0;
		arg3.anInt5129 = this.anInt5129;
		@Pc(53) boolean local53 = Static362.method5162(this.anInt5121, arg1);
		@Pc(59) boolean local59 = Static411.method5583(this.anInt5121, arg1);
		@Pc(67) boolean local67 = Static18.method240(this.anInt5121, arg1);
		@Pc(73) boolean local73 = local59 | local53 | local67;
		@Pc(182) int local182;
		if (local73) {
			if (!local53) {
				arg3.anIntArray390 = this.anIntArray390;
			} else if (arg4.anIntArray390 == null || arg4.anIntArray390.length < this.anInt5086) {
				arg3.anIntArray390 = arg4.anIntArray390 = new int[this.anInt5086];
			} else {
				arg3.anIntArray390 = arg4.anIntArray390;
			}
			if (!local59) {
				arg3.anIntArray393 = this.anIntArray393;
			} else if (arg4.anIntArray393 == null || arg4.anIntArray393.length < this.anInt5086) {
				arg3.anIntArray393 = arg4.anIntArray393 = new int[this.anInt5086];
			} else {
				arg3.anIntArray393 = arg4.anIntArray393;
			}
			if (!local67) {
				arg3.anIntArray392 = this.anIntArray392;
			} else if (arg4.anIntArray392 == null || this.anInt5086 > arg4.anIntArray392.length) {
				arg3.anIntArray392 = arg4.anIntArray392 = new int[this.anInt5086];
			} else {
				arg3.anIntArray392 = arg4.anIntArray392;
			}
			for (local182 = 0; local182 < this.anInt5086; local182++) {
				if (local53) {
					arg3.anIntArray390[local182] = this.anIntArray390[local182];
				}
				if (local59) {
					arg3.anIntArray393[local182] = this.anIntArray393[local182];
				}
				if (local67) {
					arg3.anIntArray392[local182] = this.anIntArray392[local182];
				}
			}
		} else {
			arg3.anIntArray392 = this.anIntArray392;
			arg3.anIntArray393 = this.anIntArray393;
			arg3.anIntArray390 = this.anIntArray390;
		}
		if (Static434.method5821(arg1, this.anInt5121)) {
			if (arg0) {
				arg3.aByte71 = (byte) (arg3.aByte71 | 0x1);
			}
			arg3.aClass267_5 = arg4.aClass267_5;
			arg3.aClass267_5.anInterface12_7 = this.aClass267_5.anInterface12_7;
			arg3.aClass267_5.aByte104 = this.aClass267_5.aByte104;
		} else if (Static407.method5534(this.anInt5121, arg1)) {
			arg3.aClass267_5 = this.aClass267_5;
		} else {
			arg3.aClass267_5 = null;
		}
		if (Static111.method1744(arg1, this.anInt5121)) {
			if (arg4.lb == null || arg4.lb.length < this.anInt5129) {
				arg3.lb = arg4.lb = new short[this.anInt5129];
			} else {
				arg3.lb = arg4.lb;
			}
			for (local182 = 0; local182 < this.anInt5129; local182++) {
				arg3.lb[local182] = this.lb[local182];
			}
		} else {
			arg3.lb = this.lb;
		}
		if (Static276.method3833(this.anInt5121, arg1)) {
			if (arg4.aByteArray61 == null || this.anInt5129 > arg4.aByteArray61.length) {
				arg3.aByteArray61 = arg4.aByteArray61 = new byte[this.anInt5129];
			} else {
				arg3.aByteArray61 = arg4.aByteArray61;
			}
			for (local182 = 0; local182 < this.anInt5129; local182++) {
				arg3.aByteArray61[local182] = this.aByteArray61[local182];
			}
		} else {
			arg3.aByteArray61 = this.aByteArray61;
		}
		if (Static153.method3783(arg1, this.anInt5121)) {
			arg3.aClass267_8 = arg4.aClass267_8;
			if (arg0) {
				arg3.aByte71 = (byte) (arg3.aByte71 | 0x2);
			}
			arg3.aClass267_8.anInterface12_7 = this.aClass267_8.anInterface12_7;
			arg3.aClass267_8.aByte104 = this.aClass267_8.aByte104;
		} else if (Static331.method4781(arg1, this.anInt5121)) {
			arg3.aClass267_8 = this.aClass267_8;
		} else {
			arg3.aClass267_8 = null;
		}
		@Pc(598) int local598;
		if (Static60.method911(this.anInt5121, arg1)) {
			if (arg4.aShortArray92 == null || arg4.aShortArray92.length < this.anInt5087) {
				local182 = this.anInt5087;
				arg3.aShortArray88 = arg4.aShortArray88 = new short[local182];
				arg3.aShortArray92 = arg4.aShortArray92 = new short[local182];
				arg3.aShortArray85 = arg4.aShortArray85 = new short[local182];
			} else {
				arg3.aShortArray92 = arg4.aShortArray92;
				arg3.aShortArray85 = arg4.aShortArray85;
				arg3.aShortArray88 = arg4.aShortArray88;
			}
			if (this.aClass50_1 == null) {
				for (local182 = 0; local182 < this.anInt5087; local182++) {
					arg3.aShortArray92[local182] = this.aShortArray92[local182];
					arg3.aShortArray88[local182] = this.aShortArray88[local182];
					arg3.aShortArray85[local182] = this.aShortArray85[local182];
				}
			} else {
				if (arg4.aClass50_1 == null) {
					arg4.aClass50_1 = new Class50();
				}
				@Pc(582) Class50 local582 = arg3.aClass50_1 = arg4.aClass50_1;
				if (local582.aShortArray12 == null || local582.aShortArray12.length < this.anInt5087) {
					local598 = this.anInt5087;
					local582.aShortArray11 = new short[local598];
					local582.aShortArray10 = new short[local598];
					local582.aByteArray8 = new byte[local598];
					local582.aShortArray12 = new short[local598];
				}
				for (local598 = 0; local598 < this.anInt5087; local598++) {
					arg3.aShortArray92[local598] = this.aShortArray92[local598];
					arg3.aShortArray88[local598] = this.aShortArray88[local598];
					arg3.aShortArray85[local598] = this.aShortArray85[local598];
					local582.aShortArray12[local598] = this.aClass50_1.aShortArray12[local598];
					local582.aShortArray11[local598] = this.aClass50_1.aShortArray11[local598];
					local582.aShortArray10[local598] = this.aClass50_1.aShortArray10[local598];
					local582.aByteArray8[local598] = this.aClass50_1.aByteArray8[local598];
				}
			}
			arg3.aByteArray62 = this.aByteArray62;
		} else {
			arg3.aByteArray62 = this.aByteArray62;
			arg3.aShortArray92 = this.aShortArray92;
			arg3.aShortArray85 = this.aShortArray85;
			arg3.aClass50_1 = this.aClass50_1;
			arg3.aShortArray88 = this.aShortArray88;
		}
		if (Static78.method1148(this.anInt5121, arg1)) {
			if (arg0) {
				arg3.aByte71 = (byte) (arg3.aByte71 | 0x4);
			}
			arg3.aClass267_6 = arg4.aClass267_6;
			arg3.aClass267_6.aByte104 = this.aClass267_6.aByte104;
			arg3.aClass267_6.anInterface12_7 = this.aClass267_6.anInterface12_7;
		} else if (Static233.method3384(this.anInt5121, arg1)) {
			arg3.aClass267_6 = this.aClass267_6;
		} else {
			arg3.aClass267_6 = null;
		}
		if (Static59.method900(arg1, this.anInt5121)) {
			if (arg4.aFloatArray32 == null || arg4.aFloatArray32.length < this.anInt5129) {
				local182 = this.anInt5087;
				arg3.aFloatArray32 = arg4.aFloatArray32 = new float[local182];
				arg3.aFloatArray31 = arg4.aFloatArray31 = new float[local182];
			} else {
				arg3.aFloatArray32 = arg4.aFloatArray32;
				arg3.aFloatArray31 = arg4.aFloatArray31;
			}
			for (local182 = 0; local182 < this.anInt5087; local182++) {
				arg3.aFloatArray32[local182] = this.aFloatArray32[local182];
				arg3.aFloatArray31[local182] = this.aFloatArray31[local182];
			}
		} else {
			arg3.aFloatArray31 = this.aFloatArray31;
			arg3.aFloatArray32 = this.aFloatArray32;
		}
		if (Static297.method4065(arg1, this.anInt5121)) {
			arg3.aClass267_7 = arg4.aClass267_7;
			if (arg0) {
				arg3.aByte71 = (byte) (arg3.aByte71 | 0x8);
			}
			arg3.aClass267_7.aByte104 = this.aClass267_7.aByte104;
			arg3.aClass267_7.anInterface12_7 = this.aClass267_7.anInterface12_7;
		} else if (Static362.method5155(this.anInt5121, arg1)) {
			arg3.aClass267_7 = this.aClass267_7;
		} else {
			arg3.aClass267_7 = null;
		}
		if (Static10.method5666(this.anInt5121, arg1)) {
			if (arg4.aShortArray86 == null || this.anInt5129 > arg4.aShortArray86.length) {
				local182 = this.anInt5129;
				arg3.aShortArray87 = arg4.aShortArray87 = new short[local182];
				arg3.aShortArray86 = arg4.aShortArray86 = new short[local182];
				arg3.aShortArray91 = arg4.aShortArray91 = new short[local182];
			} else {
				arg3.aShortArray86 = arg4.aShortArray86;
				arg3.aShortArray91 = arg4.aShortArray91;
				arg3.aShortArray87 = arg4.aShortArray87;
			}
			for (local182 = 0; local182 < this.anInt5129; local182++) {
				arg3.aShortArray86[local182] = this.aShortArray86[local182];
				arg3.aShortArray91[local182] = this.aShortArray91[local182];
				arg3.aShortArray87[local182] = this.aShortArray87[local182];
			}
		} else {
			arg3.aShortArray87 = this.aShortArray87;
			arg3.aShortArray91 = this.aShortArray91;
			arg3.aShortArray86 = this.aShortArray86;
		}
		if (Static188.method2984(arg1, this.anInt5121)) {
			arg3.aClass149_1 = arg4.aClass149_1;
			if (arg0) {
				arg3.aByte71 = (byte) (arg3.aByte71 | 0x10);
			}
			arg3.aClass149_1.anInterface2_2 = this.aClass149_1.anInterface2_2;
		} else if (Static61.method929(this.anInt5121, arg1)) {
			arg3.aClass149_1 = this.aClass149_1;
		} else {
			arg3.aClass149_1 = null;
		}
		if (Static44.method582(arg1, this.anInt5121)) {
			if (arg4.aShortArray84 == null || this.anInt5129 > arg4.aShortArray84.length) {
				local182 = this.anInt5129;
				arg3.aShortArray84 = arg4.aShortArray84 = new short[local182];
			} else {
				arg3.aShortArray84 = arg4.aShortArray84;
			}
			for (local182 = 0; local182 < this.anInt5129; local182++) {
				arg3.aShortArray84[local182] = this.aShortArray84[local182];
			}
		} else {
			arg3.aShortArray84 = this.aShortArray84;
		}
		if (!Static242.method3806(arg1, this.anInt5121)) {
			arg3.aClass33Array1 = this.aClass33Array1;
		} else if (arg4.aClass33Array1 == null || this.anInt5082 > arg4.aClass33Array1.length) {
			local182 = this.anInt5082;
			arg3.aClass33Array1 = arg4.aClass33Array1 = new Class33[local182];
			for (local598 = 0; local598 < this.anInt5082; local598++) {
				arg3.aClass33Array1[local598] = this.aClass33Array1[local598].method503();
			}
		} else {
			arg3.aClass33Array1 = arg4.aClass33Array1;
			for (local182 = 0; local182 < this.anInt5082; local182++) {
				arg3.aClass33Array1[local182].method505(this.aClass33Array1[local182]);
			}
		}
		if (this.aBoolean414) {
			arg3.aShort85 = this.aShort85;
			arg3.aShort81 = this.aShort81;
			arg3.aShort84 = this.aShort84;
			arg3.aShort79 = this.aShort79;
			arg3.aShort82 = this.aShort82;
			arg3.aShort86 = this.aShort86;
			arg3.aBoolean414 = true;
			arg3.aShort80 = this.aShort80;
		} else {
			arg3.aBoolean414 = false;
		}
		arg3.anIntArrayArray36 = this.anIntArrayArray36;
		arg3.aClass170Array1 = this.aClass170Array1;
		arg3.aShortArray89 = this.aShortArray89;
		arg3.anIntArray391 = this.anIntArray391;
		arg3.aShortArray90 = this.aShortArray90;
		arg3.anIntArray389 = this.anIntArray389;
		arg3.aShortArray93 = this.aShortArray93;
		arg3.aClass265Array4 = this.aClass265Array4;
		arg3.aClass203Array4 = this.aClass203Array4;
		arg3.anIntArrayArray37 = this.anIntArrayArray37;
		arg3.anIntArrayArray38 = this.anIntArrayArray38;
		return arg3;
	}

	@OriginalMember(owner = "client!ph", name = "N", descriptor = "(SS)V")
	@Override
	public void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5129; local7++) {
			if (this.lb[local7] == arg0) {
				this.lb[local7] = arg1;
			}
		}
		if (this.aClass170Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt5082; local34++) {
				@Pc(41) Class170 local41 = this.aClass170Array1[local34];
				@Pc(46) Class33 local46 = this.aClass33Array1[local34];
				local46.anInt597 = local46.anInt597 & 0xFF000000 | Static302.anIntArray386[this.lb[local41.anInt4454] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass267_8 != null) {
			this.aClass267_8.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "la", descriptor = "()I")
	@Override
	public int la() {
		if (!this.aBoolean414) {
			this.method4180();
		}
		return this.aShort82;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!ht;)V")
	private void method4185(@OriginalArg(1) Class43_Sub2 arg0) {
		@Pc(14) int local14;
		if (this.aClass203Array4 != null) {
			for (local14 = 0; local14 < this.aClass203Array4.length; local14++) {
				@Pc(21) Class203 local21 = this.aClass203Array4[local14];
				@Pc(23) Class203 local23 = local21;
				if (local21.aClass203_2 != null) {
					local23 = local21.aClass203_2;
				}
				local23.anInt6053 = (int) (arg0.aFloat44 * (float) this.anIntArray392[local21.anInt6042] + (float) this.anIntArray393[local21.anInt6042] * arg0.aFloat43 + (float) this.anIntArray390[local21.anInt6042] * arg0.aFloat50 + arg0.aFloat48);
				local23.anInt6045 = (int) ((float) this.anIntArray390[local21.anInt6042] * arg0.aFloat41 + arg0.aFloat51 * (float) this.anIntArray393[local21.anInt6042] + arg0.aFloat46 * (float) this.anIntArray392[local21.anInt6042] + arg0.aFloat40);
				local23.anInt6046 = (int) (arg0.aFloat49 * (float) this.anIntArray390[local21.anInt6042] + (float) this.anIntArray393[local21.anInt6042] * arg0.aFloat42 + arg0.aFloat47 * (float) this.anIntArray392[local21.anInt6042] + arg0.aFloat45);
				local23.anInt6051 = (int) ((float) this.anIntArray392[local21.anInt6043] * arg0.aFloat44 + (float) this.anIntArray393[local21.anInt6043] * arg0.aFloat43 + arg0.aFloat50 * (float) this.anIntArray390[local21.anInt6043] + arg0.aFloat48);
				local23.anInt6040 = (int) (arg0.aFloat40 + arg0.aFloat51 * (float) this.anIntArray393[local21.anInt6043] + (float) this.anIntArray390[local21.anInt6043] * arg0.aFloat41 + arg0.aFloat46 * (float) this.anIntArray392[local21.anInt6043]);
				local23.anInt6047 = (int) (arg0.aFloat45 + (float) this.anIntArray393[local21.anInt6043] * arg0.aFloat42 + arg0.aFloat49 * (float) this.anIntArray390[local21.anInt6043] + arg0.aFloat47 * (float) this.anIntArray392[local21.anInt6043]);
				local23.anInt6044 = (int) ((float) this.anIntArray393[local21.anInt6048] * arg0.aFloat43 + arg0.aFloat50 * (float) this.anIntArray390[local21.anInt6048] + (float) this.anIntArray392[local21.anInt6048] * arg0.aFloat44 + arg0.aFloat48);
				local23.anInt6052 = (int) ((float) this.anIntArray392[local21.anInt6048] * arg0.aFloat46 + arg0.aFloat41 * (float) this.anIntArray390[local21.anInt6048] + arg0.aFloat51 * (float) this.anIntArray393[local21.anInt6048] + arg0.aFloat40);
				local23.anInt6041 = (int) (arg0.aFloat49 * (float) this.anIntArray390[local21.anInt6048] + arg0.aFloat42 * (float) this.anIntArray393[local21.anInt6048] + arg0.aFloat47 * (float) this.anIntArray392[local21.anInt6048] + arg0.aFloat45);
			}
		}
		if (this.aClass265Array4 == null) {
			return;
		}
		for (local14 = 0; local14 < this.aClass265Array4.length; local14++) {
			@Pc(370) Class265 local370 = this.aClass265Array4[local14];
			@Pc(372) Class265 local372 = local370;
			if (local370.aClass265_2 != null) {
				local372 = local370.aClass265_2;
			}
			if (local370.aClass43_5 == null) {
				local370.aClass43_5 = arg0.method5107();
			} else {
				local370.aClass43_5.ba(arg0);
			}
			local372.anInt7757 = (int) (arg0.aFloat44 * (float) this.anIntArray392[local370.anInt7759] + arg0.aFloat50 * (float) this.anIntArray390[local370.anInt7759] + (float) this.anIntArray393[local370.anInt7759] * arg0.aFloat43 + arg0.aFloat48);
			local372.anInt7755 = (int) ((float) this.anIntArray392[local370.anInt7759] * arg0.aFloat46 + (float) this.anIntArray393[local370.anInt7759] * arg0.aFloat51 + arg0.aFloat41 * (float) this.anIntArray390[local370.anInt7759] + arg0.aFloat40);
			local372.anInt7754 = (int) (arg0.aFloat45 + (float) this.anIntArray390[local370.anInt7759] * arg0.aFloat49 + (float) this.anIntArray393[local370.anInt7759] * arg0.aFloat42 + arg0.aFloat47 * (float) this.anIntArray392[local370.anInt7759]);
		}
	}

	@OriginalMember(owner = "client!ph", name = "WA", descriptor = "(I)V")
	@Override
	public void WA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class262.anIntArray575[arg0];
		@Pc(13) int local13 = Class262.anIntArray576[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5118; local15++) {
			@Pc(33) int local33 = this.anIntArray393[local15] * local13 - this.anIntArray392[local15] * local9 >> 15;
			this.anIntArray392[local15] = local9 * this.anIntArray393[local15] + local13 * this.anIntArray392[local15] >> 15;
			this.anIntArray393[local15] = local33;
		}
		if (this.aClass267_5 != null) {
			this.aClass267_5.anInterface12_7 = null;
		}
		this.aBoolean414 = false;
	}

	@OriginalMember(owner = "client!ph", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class262.anIntArray575[arg0];
		@Pc(13) int local13 = Class262.anIntArray576[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5118; local15++) {
			local33 = local13 * this.anIntArray390[local15] + local9 * this.anIntArray392[local15] >> 15;
			this.anIntArray392[local15] = this.anIntArray392[local15] * local13 - this.anIntArray390[local15] * local9 >> 15;
			this.anIntArray390[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5087; local33++) {
			@Pc(87) int local87 = local13 * this.aShortArray92[local33] + local9 * this.aShortArray85[local33] >> 15;
			this.aShortArray85[local33] = (short) (local13 * this.aShortArray85[local33] - this.aShortArray92[local33] * local9 >> 15);
			this.aShortArray92[local33] = (short) local87;
		}
		if (this.aClass267_6 == null && this.aClass267_8 != null) {
			this.aClass267_8.anInterface12_7 = null;
		}
		if (this.aClass267_6 != null) {
			this.aClass267_6.anInterface12_7 = null;
		}
		this.aBoolean414 = false;
		if (this.aClass267_5 != null) {
			this.aClass267_5.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ia;Lclient!sf;II)V")
	@Override
	public void method4163(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class36_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5087 == 0) {
			return;
		}
		@Pc(13) Class43_Sub2 local13 = this.aClass121_Sub2_27.aClass43_Sub2_4;
		if (!this.aBoolean414) {
			this.method4180();
		}
		@Pc(22) Class43_Sub2 local22 = (Class43_Sub2) arg0;
		Static439.aFloat123 = local22.aFloat51 * local13.aFloat42 + local13.aFloat49 * local22.aFloat43 + local22.aFloat42 * local13.aFloat47;
		Static321.aFloat84 = local13.aFloat45 + local13.aFloat47 * local22.aFloat45 + local13.aFloat42 * local22.aFloat40 + local13.aFloat49 * local22.aFloat48;
		@Pc(69) float local69 = Static321.aFloat84 + Static439.aFloat123 * (float) this.aShort84;
		@Pc(77) float local77 = (float) this.aShort80 * Static439.aFloat123 + Static321.aFloat84;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local77 < local69) {
			local87 = local77 - (float) this.aShort86;
			local93 = local69 + (float) this.aShort86;
		} else {
			local93 = (float) this.aShort86 + local77;
			local87 = local69 - (float) this.aShort86;
		}
		if (local87 >= this.aClass121_Sub2_27.aFloat102 || local93 <= (float) this.aClass121_Sub2_27.anInt5968) {
			return;
		}
		Static199.aFloat62 = local13.aFloat48 + local13.aFloat44 * local22.aFloat45 + local22.aFloat40 * local13.aFloat43 + local13.aFloat50 * local22.aFloat48;
		Static219.aFloat67 = local13.aFloat50 * local22.aFloat43 + local13.aFloat43 * local22.aFloat51 + local22.aFloat42 * local13.aFloat44;
		@Pc(169) float local169 = Static219.aFloat67 * (float) this.aShort84 + Static199.aFloat62;
		@Pc(177) float local177 = Static199.aFloat62 + (float) this.aShort80 * Static219.aFloat67;
		@Pc(204) float local204;
		@Pc(192) float local192;
		if (local177 < local169) {
			local192 = (float) this.aClass121_Sub2_27.anInt5948 * (local169 + (float) this.aShort86);
			local204 = (float) this.aClass121_Sub2_27.anInt5948 * (local177 - (float) this.aShort86);
		} else {
			local192 = (float) this.aClass121_Sub2_27.anInt5948 * (local177 + (float) this.aShort86);
			local204 = ((float) -this.aShort86 + local169) * (float) this.aClass121_Sub2_27.anInt5948;
		}
		if (this.aClass121_Sub2_27.aFloat97 <= local204 / (float) arg2 || local192 / (float) arg2 <= this.aClass121_Sub2_27.aFloat96) {
			return;
		}
		Static35.aFloat9 = local22.aFloat43 * local13.aFloat41 + local13.aFloat51 * local22.aFloat51 + local13.aFloat46 * local22.aFloat42;
		Static255.aFloat77 = local13.aFloat40 + local22.aFloat45 * local13.aFloat46 + local13.aFloat51 * local22.aFloat40 + local22.aFloat48 * local13.aFloat41;
		@Pc(295) float local295 = Static35.aFloat9 * (float) this.aShort84 + Static255.aFloat77;
		@Pc(303) float local303 = Static35.aFloat9 * (float) this.aShort80 + Static255.aFloat77;
		@Pc(329) float local329;
		@Pc(318) float local318;
		if (local295 > local303) {
			local318 = (float) this.aClass121_Sub2_27.anInt5981 * ((float) this.aShort86 + local295);
			local329 = (local303 - (float) this.aShort86) * (float) this.aClass121_Sub2_27.anInt5981;
		} else {
			local318 = ((float) this.aShort86 + local303) * (float) this.aClass121_Sub2_27.anInt5981;
			local329 = (float) this.aClass121_Sub2_27.anInt5981 * (local295 - (float) this.aShort86);
		}
		if (this.aClass121_Sub2_27.aFloat99 <= local329 / (float) arg2 || this.aClass121_Sub2_27.aFloat94 >= local318 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass170Array1 != null) {
			Static59.aFloat15 = local22.aFloat49 * local13.aFloat47 + local13.aFloat42 * local22.aFloat41 + local22.aFloat50 * local13.aFloat49;
			Static142.aFloat37 = local13.aFloat44 * local22.aFloat49 + local22.aFloat41 * local13.aFloat43 + local22.aFloat50 * local13.aFloat50;
			Static323.aFloat85 = local22.aFloat46 * local13.aFloat42 + local13.aFloat49 * local22.aFloat44 + local13.aFloat47 * local22.aFloat47;
			Static31.aFloat7 = local13.aFloat51 * local22.aFloat41 + local22.aFloat50 * local13.aFloat41 + local13.aFloat46 * local22.aFloat49;
			Static195.aFloat61 = local13.aFloat44 * local22.aFloat47 + local13.aFloat50 * local22.aFloat44 + local13.aFloat43 * local22.aFloat46;
			Static251.aFloat76 = local13.aFloat46 * local22.aFloat47 + local13.aFloat51 * local22.aFloat46 + local13.aFloat41 * local22.aFloat44;
		}
		if (arg1 != null) {
			@Pc(496) int local496 = this.aShort85 + this.aShort82 >> 1;
			@Pc(505) int local505 = this.aShort79 + this.aShort81 >> 1;
			@Pc(524) int local524 = (int) ((float) local496 * Static142.aFloat37 + Static199.aFloat62 + (float) this.aShort84 * Static219.aFloat67 + (float) local505 * Static195.aFloat61);
			@Pc(543) int local543 = (int) (Static251.aFloat76 * (float) local505 + Static31.aFloat7 * (float) local496 + Static255.aFloat77 + (float) this.aShort84 * Static35.aFloat9);
			@Pc(562) int local562 = (int) (Static323.aFloat85 * (float) local505 + Static439.aFloat123 * (float) this.aShort84 + (float) local496 * Static59.aFloat15 + Static321.aFloat84);
			@Pc(581) int local581 = (int) ((float) local505 * Static195.aFloat61 + Static142.aFloat37 * (float) local496 + Static199.aFloat62 + Static219.aFloat67 * (float) this.aShort80);
			@Pc(600) int local600 = (int) ((float) this.aShort80 * Static35.aFloat9 + Static255.aFloat77 + (float) local496 * Static31.aFloat7 + (float) local505 * Static251.aFloat76);
			arg1.anInt6562 = this.aClass121_Sub2_27.anInt5982 + this.aClass121_Sub2_27.anInt5948 * local524 / arg2;
			arg1.anInt6564 = local581 * this.aClass121_Sub2_27.anInt5948 / arg2 + this.aClass121_Sub2_27.anInt5982;
			arg1.anInt6563 = this.aClass121_Sub2_27.anInt5952 + local600 * this.aClass121_Sub2_27.anInt5981 / arg2;
			arg1.anInt6561 = this.aClass121_Sub2_27.anInt5952 + local543 * this.aClass121_Sub2_27.anInt5981 / arg2;
			@Pc(673) int local673 = (int) (Static439.aFloat123 * (float) this.aShort80 + Static321.aFloat84 + (float) local496 * Static59.aFloat15 + (float) local505 * Static323.aFloat85);
			if (local562 < this.aClass121_Sub2_27.anInt5968 && local673 < this.aClass121_Sub2_27.anInt5968) {
				arg1.anInt6565 = (this.aShort86 + local524) * this.aClass121_Sub2_27.anInt5948 / arg2 + this.aClass121_Sub2_27.anInt5982 - arg1.anInt6562;
				arg1.aBoolean534 = true;
			}
		}
		this.aClass121_Sub2_27.method4677((float) arg2);
		this.aClass121_Sub2_27.method4689();
		this.aClass121_Sub2_27.method4696(local22);
		this.method4183();
		this.aClass121_Sub2_27.method4680();
		this.method4174();
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "()Z")
	@Override
	public boolean method4168() {
		if (this.aShortArray84 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray84.length; local12++) {
			if (this.aShortArray84[local12] != -1 && !this.aClass121_Sub2_27.anInterface5_16.method3922(this.aShortArray84[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ph", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	@Override
	public void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) Class70 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean414) {
			this.method4180();
		}
		@Pc(16) int local16 = this.aShort82 + arg4;
		@Pc(21) int local21 = this.aShort85 + arg4;
		@Pc(27) int local27 = arg6 + this.aShort79;
		@Pc(32) int local32 = arg6 + this.aShort81;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt5252 >> arg2.anInt5253 >= arg2.anInt5251 || local27 < 0 || arg2.anInt5252 + local32 >> arg2.anInt5253 >= arg2.anInt5250)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt5251 <= arg3.anInt5252 + local21 >> arg3.anInt5253 || local27 < 0 || local32 + arg3.anInt5252 >> arg3.anInt5253 >= arg3.anInt5250) {
				return;
			}
		} else {
			local16 >>= arg2.anInt5253;
			local21 = arg2.anInt5252 + local21 - 1 >> arg2.anInt5253;
			local27 >>= arg2.anInt5253;
			local32 = arg2.anInt5252 + local32 - 1 >> arg2.anInt5253;
			if (arg2.I(local16, local27) == arg5 && arg5 == arg2.I(local21, local27) && arg2.I(local16, local32) == arg5 && arg5 == arg2.I(local21, local32)) {
				return;
			}
		}
		@Pc(276) int local276;
		if (arg0 == 1) {
			for (local276 = 0; local276 < this.anInt5118; local276++) {
				this.anIntArray393[local276] = this.anIntArray393[local276] + arg2.va(arg4 + this.anIntArray390[local276], arg6 + this.anIntArray392[local276]) - arg5;
			}
		} else {
			@Pc(196) int local196;
			@Pc(207) int local207;
			if (arg0 == 2) {
				@Pc(191) short local191 = this.aShort84;
				if (local191 == 0) {
					return;
				}
				for (local196 = 0; local196 < this.anInt5118; local196++) {
					local207 = (this.anIntArray393[local196] << 16) / local191;
					if (local207 < arg1) {
						this.anIntArray393[local196] += (arg2.va(arg4 + this.anIntArray390[local196], arg6 + this.anIntArray392[local196]) - arg5) * (arg1 - local207) / arg1;
					}
				}
			} else {
				@Pc(294) int local294;
				if (arg0 == 3) {
					local276 = (arg1 & 0xFF) * 4;
					local196 = (arg1 >> 8 & 0xFF) * 4;
					local207 = (arg1 >> 16 & 0xFF) << 6;
					local294 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local276 >> 1) < 0 || arg2.anInt5252 + arg4 + (local276 >> 1) >= arg2.anInt5251 << arg2.anInt5253 || arg6 - (local196 >> 1) < 0 || arg2.anInt5250 << arg2.anInt5253 <= arg2.anInt5252 + arg6 + (local196 >> 1)) {
						return;
					}
					this.method4159(local207, arg6, local294, arg4, local196, arg2, local276, arg5);
				} else if (arg0 == 4) {
					local276 = this.aShort80 - this.aShort84;
					for (local196 = 0; local196 < this.anInt5118; local196++) {
						this.anIntArray393[local196] = this.anIntArray393[local196] + arg3.va(arg4 + this.anIntArray390[local196], arg6 + this.anIntArray392[local196]) + local276 - arg5;
					}
				} else if (arg0 == 5) {
					local276 = this.aShort80 - this.aShort84;
					for (local196 = 0; local196 < this.anInt5118; local196++) {
						local207 = this.anIntArray390[local196] + arg4;
						local294 = arg6 + this.anIntArray392[local196];
						@Pc(299) int local299 = arg2.va(local207, local294);
						@Pc(304) int local304 = arg3.va(local207, local294);
						@Pc(308) int local308 = local299 - local304;
						this.anIntArray393[local196] = local299 + ((this.anIntArray393[local196] << 8) / local276 * local308 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean414 = false;
		if (this.aClass267_5 != null) {
			this.aClass267_5.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "K", descriptor = "(IIII)V")
	@Override
	protected void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static286.anInt4776 = 0;
			Static44.anInt686 = 0;
			local16 = 0;
			Static449.anInt7765 = 0;
			for (local20 = 0; local20 < this.anInt5118; local20++) {
				Static286.anInt4776 += this.anIntArray390[local20];
				Static44.anInt686 += this.anIntArray393[local20];
				Static449.anInt7765 += this.anIntArray392[local20];
				local16++;
			}
			if (local16 <= 0) {
				Static286.anInt4776 = arg1;
				Static449.anInt7765 = arg3;
				Static44.anInt686 = arg2;
			} else {
				Static449.anInt7765 = Static449.anInt7765 / local16 + arg3;
				Static44.anInt686 = Static44.anInt686 / local16 + arg2;
				Static286.anInt4776 = Static286.anInt4776 / local16 + arg1;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt5118; local16++) {
				this.anIntArray390[local16] += arg1;
				this.anIntArray393[local16] += arg2;
				this.anIntArray392[local16] += arg3;
			}
		} else {
			@Pc(166) int local166;
			@Pc(184) int local184;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt5118; local16++) {
					this.anIntArray390[local16] -= Static286.anInt4776;
					this.anIntArray393[local16] -= Static44.anInt686;
					this.anIntArray392[local16] -= Static449.anInt7765;
					if (arg3 != 0) {
						local20 = Class262.anIntArray575[arg3];
						local166 = Class262.anIntArray576[arg3];
						local184 = local166 * this.anIntArray390[local16] + local20 * this.anIntArray393[local16] + 32767 >> 15;
						this.anIntArray393[local16] = this.anIntArray393[local16] * local166 + 32767 - local20 * this.anIntArray390[local16] >> 15;
						this.anIntArray390[local16] = local184;
					}
					if (arg1 != 0) {
						local20 = Class262.anIntArray575[arg1];
						local166 = Class262.anIntArray576[arg1];
						local184 = this.anIntArray393[local16] * local166 + 32767 - this.anIntArray392[local16] * local20 >> 15;
						this.anIntArray392[local16] = local20 * this.anIntArray393[local16] + local166 * this.anIntArray392[local16] + 32767 >> 15;
						this.anIntArray393[local16] = local184;
					}
					if (arg2 != 0) {
						local20 = Class262.anIntArray575[arg2];
						local166 = Class262.anIntArray576[arg2];
						local184 = local166 * this.anIntArray390[local16] + this.anIntArray392[local16] * local20 + 32767 >> 15;
						this.anIntArray392[local16] = this.anIntArray392[local16] * local166 + 32767 - local20 * this.anIntArray390[local16] >> 15;
						this.anIntArray390[local16] = local184;
					}
					this.anIntArray390[local16] += Static286.anInt4776;
					this.anIntArray393[local16] += Static44.anInt686;
					this.anIntArray392[local16] += Static449.anInt7765;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt5118; local16++) {
					this.anIntArray390[local16] -= Static286.anInt4776;
					this.anIntArray393[local16] -= Static44.anInt686;
					this.anIntArray392[local16] -= Static449.anInt7765;
					this.anIntArray390[local16] = arg1 * this.anIntArray390[local16] / 128;
					this.anIntArray393[local16] = arg2 * this.anIntArray393[local16] / 128;
					this.anIntArray392[local16] = arg3 * this.anIntArray392[local16] / 128;
					this.anIntArray390[local16] += Static286.anInt4776;
					this.anIntArray393[local16] += Static44.anInt686;
					this.anIntArray392[local16] += Static449.anInt7765;
				}
			} else {
				@Pc(525) Class170 local525;
				@Pc(530) Class33 local530;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt5129; local16++) {
						local20 = arg1 * 8 + (this.aByteArray61[local16] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray61[local16] = (byte) local20;
					}
					if (this.aClass267_8 != null) {
						this.aClass267_8.anInterface12_7 = null;
					}
					if (this.aClass170Array1 != null) {
						for (local20 = 0; local20 < this.anInt5082; local20++) {
							local525 = this.aClass170Array1[local20];
							local530 = this.aClass33Array1[local20];
							local530.anInt597 = 255 - (this.aByteArray61[local525.anInt4454] & 0xFF) << 24 | local530.anInt597 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt5129; local16++) {
						local20 = this.lb[local16] & 0xFFFF;
						local166 = local20 >> 10 & 0x3F;
						local184 = local20 >> 7 & 0x7;
						@Pc(588) int local588 = local166 + arg1 & 0x3F;
						@Pc(592) int local592 = local20 & 0x7F;
						local184 += arg2 / 4;
						if (local184 < 0) {
							local184 = 0;
						} else if (local184 > 7) {
							local184 = 7;
						}
						local592 += arg3;
						if (local592 < 0) {
							local592 = 0;
						} else if (local592 > 127) {
							local592 = 127;
						}
						this.lb[local16] = (short) (local588 << 10 | local184 << 7 | local592);
					}
					if (this.aClass267_8 != null) {
						this.aClass267_8.anInterface12_7 = null;
					}
					if (this.aClass170Array1 != null) {
						for (local20 = 0; local20 < this.anInt5082; local20++) {
							local525 = this.aClass170Array1[local20];
							local530 = this.aClass33Array1[local20];
							local530.anInt597 = local530.anInt597 & 0xFF000000 | Static302.anIntArray386[this.lb[local525.anInt4454] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(715) Class33 local715;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt5082; local16++) {
							local715 = this.aClass33Array1[local16];
							local715.anInt605 += arg2;
							local715.anInt598 += arg1;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt5082; local16++) {
							local715 = this.aClass33Array1[local16];
							local715.anInt604 = local715.anInt604 * arg1 >> 7;
							local715.anInt602 = arg2 * local715.anInt602 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt5082; local16++) {
							local715 = this.aClass33Array1[local16];
							local715.anInt599 = local715.anInt599 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "()V")
	@Override
	public void method4158() {
		if (this.anInt5087 <= 0 || this.anInt5125 <= 0) {
			return;
		}
		this.method4181(false);
		if ((this.aByte71 & 0x10) == 0 && this.aClass149_1.anInterface2_2 == null) {
			this.method4177(false);
		}
		this.method4175();
	}

	@OriginalMember(owner = "client!ph", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.aShort78;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IFLclient!lo;IIFIIIJ)S")
	private short method4186(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8) {
		@Pc(10) int local10 = this.anIntArray389[arg7];
		@Pc(17) int local17 = this.anIntArray389[arg7 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(34) short local34 = this.aShortArray89[local21];
			if (local34 == 0) {
				local19 = local21;
				break;
			}
			if (Static55.aLongArray1[local21] == arg8) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray89[local19] = (short) (this.anInt5087 + 1);
		Static55.aLongArray1[local19] = arg8;
		this.aShortArray92[this.anInt5087] = (short) arg4;
		this.aShortArray88[this.anInt5087] = (short) arg3;
		this.aShortArray85[this.anInt5087] = (short) arg0;
		this.aByteArray62[this.anInt5087] = (byte) arg6;
		this.aFloatArray32[this.anInt5087] = arg1;
		this.aFloatArray31[this.anInt5087] = arg5;
		return (short) this.anInt5087++;
	}

	@OriginalMember(owner = "client!ph", name = "FA", descriptor = "()Z")
	@Override
	protected boolean FA() {
		if (this.anIntArrayArray38 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5086; local12++) {
			this.anIntArray390[local12] <<= 0x4;
			this.anIntArray393[local12] <<= 0x4;
			this.anIntArray392[local12] <<= 0x4;
		}
		Static449.anInt7765 = 0;
		Static44.anInt686 = 0;
		Static286.anInt4776 = 0;
		return true;
	}
}
