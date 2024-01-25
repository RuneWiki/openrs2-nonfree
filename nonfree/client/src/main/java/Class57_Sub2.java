import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!pg", name = "xc", descriptor = "[B")
	public static final byte[] aByteArray62;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "[Lclient!op;")
	private Class181[] aClass181Array2;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "[Lclient!ce;")
	private Class35[] aClass35Array1;

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "[F")
	private float[] aFloatArray24;

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!pg", name = "F", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!pg", name = "I", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!pg", name = "L", descriptor = "[F")
	private float[] aFloatArray25;

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!pg", name = "S", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!pg", name = "Y", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!pg", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!pg", name = "bb", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!pg", name = "cb", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!pg", name = "db", descriptor = "[B")
	private byte[] aByteArray61;

	@OriginalMember(owner = "client!pg", name = "hb", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!pg", name = "ib", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!pg", name = "nb", descriptor = "[I")
	private int[] anIntArray351;

	@OriginalMember(owner = "client!pg", name = "ob", descriptor = "B")
	private byte aByte87;

	@OriginalMember(owner = "client!pg", name = "tb", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!pg", name = "vb", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!pg", name = "wb", descriptor = "[Lclient!su;")
	private Class229[] aClass229Array2;

	@OriginalMember(owner = "client!pg", name = "zb", descriptor = "[I")
	private int[] anIntArray352;

	@OriginalMember(owner = "client!pg", name = "Bb", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!pg", name = "Db", descriptor = "I")
	private int anInt5306;

	@OriginalMember(owner = "client!pg", name = "Eb", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!pg", name = "Hb", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!pg", name = "Lb", descriptor = "Lclient!se;")
	private Interface10 anInterface10_3;

	@OriginalMember(owner = "client!pg", name = "Qb", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!pg", name = "Rb", descriptor = "Lclient!wr;")
	private Class270 aClass270_1;

	@OriginalMember(owner = "client!pg", name = "Sb", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!pg", name = "Yb", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!pg", name = "ec", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!pg", name = "hc", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!pg", name = "ic", descriptor = "I")
	private int anInt5325;

	@OriginalMember(owner = "client!pg", name = "jc", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!pg", name = "kc", descriptor = "I")
	private int anInt5326;

	@OriginalMember(owner = "client!pg", name = "oc", descriptor = "[Lclient!gn;")
	private Class94[] aClass94Array1;

	@OriginalMember(owner = "client!pg", name = "pc", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!pg", name = "rc", descriptor = "[I")
	private int[] anIntArray353;

	@OriginalMember(owner = "client!pg", name = "tc", descriptor = "Lclient!fe;")
	private Interface2 anInterface2_4;

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
	private int anInt5277 = 0;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "Z")
	private boolean aBoolean602 = true;

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
	private int anInt5279 = 0;

	@OriginalMember(owner = "client!pg", name = "Fb", descriptor = "I")
	private int anInt5307 = 0;

	@OriginalMember(owner = "client!pg", name = "Mb", descriptor = "I")
	private int anInt5312 = 0;

	@OriginalMember(owner = "client!pg", name = "Nb", descriptor = "Z")
	private boolean aBoolean603 = false;

	@OriginalMember(owner = "client!pg", name = "qc", descriptor = "I")
	private int anInt5330 = 0;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_27;

	@OriginalMember(owner = "client!pg", name = "Xb", descriptor = "Lclient!tp;")
	private Class238 aClass238_8;

	@OriginalMember(owner = "client!pg", name = "fc", descriptor = "Lclient!tp;")
	private Class238 aClass238_9;

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "Lclient!tp;")
	private Class238 aClass238_7;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "Lclient!tp;")
	private Class238 aClass238_6;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "Lclient!oc;")
	private Class172 aClass172_1;

	static {
		@Pc(21) int local21 = 0;
		aByteArray62 = new byte[32896];
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			for (@Pc(29) int local29 = 0; local29 <= local26; local29++) {
				aByteArray62[local21++] = (byte) (255.0D / Math.sqrt((double) ((float) (local29 * local29 + local26 * local26 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class57_Sub2(@OriginalArg(0) Class34_Sub2 arg0) {
		this.aClass34_Sub2_27 = arg0;
		this.aClass238_8 = new Class238(null, 5126, 3, 0);
		this.aClass238_9 = new Class238(null, 5126, 2, 0);
		this.aClass238_7 = new Class238(null, 5126, 3, 0);
		this.aClass238_6 = new Class238(null, 5121, 4, 0);
		this.aClass172_1 = new Class172();
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!ur;Lclient!pq;IIII)V")
	public Class57_Sub2(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass34_Sub2_27 = arg0;
		this.anInt5325 = arg5;
		this.anInt5326 = arg2;
		if (Static352.method4760(arg5, arg2)) {
			this.aClass238_8 = new Class238(null, 5126, 3, 0);
		}
		if (Static50.method826(arg2, arg5)) {
			this.aClass238_9 = new Class238(null, 5126, 2, 0);
		}
		if (Static378.method2423(arg5, arg2)) {
			this.aClass238_7 = new Class238(null, 5126, 3, 0);
		}
		if (Static295.method4031(arg2, arg5)) {
			this.aClass238_6 = new Class238(null, 5121, 4, 0);
		}
		if (Static328.method4414(arg2, arg5)) {
			this.aClass172_1 = new Class172();
		}
		@Pc(102) Interface6 local102 = arg0.anInterface6_8;
		@Pc(106) int[] local106 = new int[arg1.anInt5437];
		this.anIntArray352 = new int[arg1.anInt5435 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt5437; local115++) {
			if ((arg1.aByteArray65 == null || arg1.aByteArray65[local115] != 2) && (arg1.aShortArray89 == null || arg1.aShortArray89[local115] == -1 || !local102.method3937(arg1.aShortArray89[local115] & 0xFFFF).aBoolean341)) {
				local106[this.anInt5307++] = local115;
				this.anIntArray352[arg1.aShortArray93[local115]]++;
				this.anIntArray352[arg1.aShortArray96[local115]]++;
				this.anIntArray352[arg1.aShortArray94[local115]]++;
			}
		}
		this.anInt5330 = this.anInt5307;
		@Pc(207) long[] local207 = new long[this.anInt5307];
		@Pc(216) boolean local216 = (this.anInt5326 & 0x100) != 0;
		@Pc(228) int local228;
		@Pc(239) int local239;
		@Pc(371) int local371;
		label490: for (@Pc(218) int local218 = 0; local218 < this.anInt5307; local218++) {
			@Pc(224) int local224 = local106[local218];
			@Pc(226) Class114 local226 = null;
			local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			@Pc(234) byte local234 = 0;
			if (arg1.aClass167Array1 != null) {
				for (local239 = 0; local239 < arg1.aClass167Array1.length; local239++) {
					@Pc(246) Class167 local246 = arg1.aClass167Array1[local239];
					if (local224 == local246.anInt4862) {
						@Pc(255) Class207 local255 = Static105.method1611(local246.anInt4864);
						if (local255.aBoolean662) {
							local207[local218] = Long.MAX_VALUE;
							this.anInt5330--;
							continue label490;
						}
					}
				}
			}
			@Pc(282) short local282 = -1;
			if (arg1.aShortArray89 != null) {
				local282 = arg1.aShortArray89[local224];
				if (local282 != -1) {
					local226 = local102.method3937(local282 & 0xFFFF);
					local234 = local226.aByte26;
					local232 = local226.aByte30;
				}
			}
			@Pc(327) boolean local327 = arg1.aByteArray69 != null && arg1.aByteArray69[local224] != 0 || local226 != null && !local226.aBoolean342;
			if ((local216 || local327) && arg1.aByteArray66 != null) {
				local228 += arg1.aByteArray66[local224] << 17;
			}
			if (local327) {
				local228 += 65536;
			}
			local228 += (local232 & 0xFF) << 8;
			local228 += local234 & 0xFF;
			local371 = local230 + ((local282 & 0xFFFF) << 16);
			@Pc(377) int local377 = local371 + (local218 & 0xFFFF);
			local207[local218] = ((long) local228 << 32) + (long) local377;
		}
		Static180.method2602(local106, local207);
		this.anInt5279 = arg1.anInt5447;
		this.anInt5312 = arg1.anInt5435;
		this.anIntArray351 = arg1.anIntArray365;
		this.anIntArray349 = arg1.anIntArray363;
		this.anIntArray353 = arg1.anIntArray361;
		this.aShortArray78 = arg1.aShortArray90;
		this.aClass181Array2 = arg1.aClass181Array3;
		this.aClass229Array2 = arg1.aClass229Array3;
		@Pc(436) Class63[] local436 = new Class63[this.anInt5312];
		@Pc(456) int local456;
		@Pc(470) int local470;
		if (arg1.aClass167Array1 != null) {
			this.anInt5306 = arg1.aClass167Array1.length;
			this.aClass35Array1 = new Class35[this.anInt5306];
			this.aClass94Array1 = new Class94[this.anInt5306];
			for (local456 = 0; local456 < this.anInt5306; local456++) {
				@Pc(463) Class167 local463 = arg1.aClass167Array1[local456];
				@Pc(468) Class207 local468 = Static105.method1611(local463.anInt4864);
				local470 = -1;
				for (@Pc(472) int local472 = 0; local472 < this.anInt5307; local472++) {
					if (local106[local472] == local463.anInt4862) {
						local470 = local472;
						break;
					}
				}
				if (local470 == -1) {
					throw new RuntimeException();
				}
				local239 = Static160.anIntArray183[arg1.aShortArray91[local463.anInt4862] & 0xFFFF] & 0xFFFFFF;
				local239 |= 255 - (arg1.aByteArray69 == null ? 0 : arg1.aByteArray69[local463.anInt4862]) << 24;
				this.aClass35Array1[local456] = new Class35(local470, arg1.aShortArray93[local463.anInt4862], arg1.aShortArray96[local463.anInt4862], arg1.aShortArray94[local463.anInt4862], local468.anInt5799, local468.anInt5795, local468.anInt5792, local468.anInt5791, local468.anInt5794, local468.aBoolean662, local468.aBoolean661, local463.anInt4863);
				this.aClass94Array1[local456] = new Class94(local239);
			}
		}
		local456 = this.anInt5307 * 3;
		this.aShort89 = (short) arg4;
		this.aShortArray84 = new short[local456];
		if (arg1.aShortArray95 != null) {
			this.aShortArray80 = new short[this.anInt5307];
		}
		this.aShortArray85 = new short[this.anInt5307];
		this.aShortArray82 = new short[local456];
		this.aShortArray83 = new short[this.anInt5307];
		this.aFloatArray24 = new float[local456];
		this.aShort87 = (short) arg3;
		this.aShortArray79 = new short[this.anInt5307];
		this.aByteArray61 = new byte[local456];
		this.aByteArray60 = new byte[this.anInt5307];
		this.aShortArray86 = new short[this.anInt5307];
		this.aShortArray81 = new short[this.anInt5307];
		Static435.aLongArray9 = new long[local456];
		this.aShortArray76 = new short[local456];
		this.aShortArray77 = new short[local456];
		this.aFloatArray25 = new float[local456];
		local228 = 0;
		for (local371 = 0; local371 < arg1.anInt5435; local371++) {
			local470 = this.anIntArray352[local371];
			this.anIntArray352[local371] = local228;
			local436[local371] = new Class63();
			local228 += local470;
		}
		this.anIntArray352[arg1.anInt5435] = local228;
		@Pc(712) int[] local712 = null;
		@Pc(714) int[] local714 = null;
		@Pc(716) int[] local716 = null;
		@Pc(718) float[][] local718 = null;
		@Pc(744) int local744;
		@Pc(789) int local789;
		@Pc(795) int local795;
		@Pc(808) int local808;
		@Pc(810) int local810;
		@Pc(846) int local846;
		@Pc(851) int local851;
		@Pc(1009) float local1009;
		@Pc(1003) float local1003;
		@Pc(1007) float local1007;
		if (arg1.aByteArray68 != null) {
			@Pc(724) int local724 = arg1.anInt5449;
			@Pc(727) int[] local727 = new int[local724];
			@Pc(730) int[] local730 = new int[local724];
			@Pc(733) int[] local733 = new int[local724];
			@Pc(736) int[] local736 = new int[local724];
			@Pc(739) int[] local739 = new int[local724];
			@Pc(742) int[] local742 = new int[local724];
			for (local744 = 0; local744 < local724; local744++) {
				local727[local744] = Integer.MAX_VALUE;
				local730[local744] = -2147483647;
				local733[local744] = Integer.MAX_VALUE;
				local736[local744] = -2147483647;
				local739[local744] = Integer.MAX_VALUE;
				local742[local744] = -2147483647;
			}
			local716 = new int[local724];
			local718 = new float[local724][];
			local714 = new int[local724];
			for (local789 = 0; local789 < this.anInt5307; local789++) {
				local795 = local106[local789];
				if (arg1.aByteArray68[local795] != -1) {
					local808 = arg1.aByteArray68[local795] & 0xFF;
					for (local810 = 0; local810 < 3; local810++) {
						@Pc(827) short local827;
						if (local810 == 0) {
							local827 = arg1.aShortArray93[local795];
						} else if (local810 == 1) {
							local827 = arg1.aShortArray96[local795];
						} else {
							local827 = arg1.aShortArray94[local795];
						}
						local846 = arg1.anIntArray365[local827];
						local851 = arg1.anIntArray363[local827];
						@Pc(856) int local856 = arg1.anIntArray361[local827];
						if (local846 < local727[local808]) {
							local727[local808] = local846;
						}
						if (local846 > local730[local808]) {
							local730[local808] = local846;
						}
						if (local851 < local733[local808]) {
							local733[local808] = local851;
						}
						if (local851 > local736[local808]) {
							local736[local808] = local851;
						}
						if (local739[local808] > local856) {
							local739[local808] = local856;
						}
						if (local742[local808] < local856) {
							local742[local808] = local856;
						}
					}
				}
			}
			local712 = new int[local724];
			for (local795 = 0; local795 < local724; local795++) {
				@Pc(945) byte local945 = arg1.aByteArray67[local795];
				if (local945 > 0) {
					local712[local795] = (local727[local795] + local730[local795]) / 2;
					local714[local795] = (local733[local795] + local736[local795]) / 2;
					local716[local795] = (local739[local795] + local742[local795]) / 2;
					if (local945 == 1) {
						local851 = arg1.anIntArray362[local795];
						local1003 = 64.0F / (float) arg1.anIntArray367[local795];
						if (local851 == 0) {
							local1007 = 1.0F;
							local1009 = 1.0F;
						} else if (local851 <= 0) {
							local1007 = 1.0F;
							local1009 = (float) -local851 / 1024.0F;
						} else {
							local1007 = (float) local851 / 1024.0F;
							local1009 = 1.0F;
						}
					} else if (local945 == 2) {
						local1009 = 64.0F / (float) arg1.anIntArray362[local795];
						local1007 = 64.0F / (float) arg1.anIntArray364[local795];
						local1003 = 64.0F / (float) arg1.anIntArray367[local795];
					} else {
						local1007 = (float) arg1.anIntArray364[local795] / 1024.0F;
						local1003 = (float) arg1.anIntArray367[local795] / 1024.0F;
						local1009 = (float) arg1.anIntArray362[local795] / 1024.0F;
					}
					local718[local795] = Static279.method3888(arg1.aByteArray63[local795] & 0xFF, local1009, arg1.aShortArray88[local795], arg1.aShortArray87[local795], local1003, arg1.aShortArray92[local795], local1007);
				}
			}
		}
		@Pc(1124) Class244[] local1124 = new Class244[arg1.anInt5437];
		@Pc(1143) short local1143;
		@Pc(1154) int local1154;
		@Pc(1165) int local1165;
		@Pc(1225) int local1225;
		for (@Pc(1126) int local1126 = 0; local1126 < arg1.anInt5437; local1126++) {
			@Pc(1133) short local1133 = arg1.aShortArray93[local1126];
			@Pc(1138) short local1138 = arg1.aShortArray96[local1126];
			local1143 = arg1.aShortArray94[local1126];
			local1154 = this.anIntArray351[local1138] - this.anIntArray351[local1133];
			local1165 = this.anIntArray349[local1138] - this.anIntArray349[local1133];
			local744 = this.anIntArray353[local1138] - this.anIntArray353[local1133];
			local789 = this.anIntArray351[local1143] - this.anIntArray351[local1133];
			local795 = this.anIntArray349[local1143] - this.anIntArray349[local1133];
			local808 = this.anIntArray353[local1143] - this.anIntArray353[local1133];
			local810 = local808 * local1165 - local795 * local744;
			local1225 = local744 * local789 - local808 * local1154;
			local846 = local1154 * local795 - local1165 * local789;
			while (local810 > 8192 || local1225 > 8192 || local846 > 8192 || local810 < -8192 || local1225 < -8192 || local846 < -8192) {
				local810 >>= 0x1;
				local846 >>= 0x1;
				local1225 >>= 0x1;
			}
			local851 = (int) Math.sqrt((double) (local846 * local846 + local1225 * local1225 + local810 * local810));
			if (local851 <= 0) {
				local851 = 1;
			}
			local846 = local846 * 256 / local851;
			local1225 = local1225 * 256 / local851;
			local810 = local810 * 256 / local851;
			@Pc(1320) byte local1320 = arg1.aByteArray65 == null ? 0 : arg1.aByteArray65[local1126];
			if (local1320 == 0) {
				@Pc(1329) Class63 local1329 = local436[local1133];
				local1329.anInt1628 += local1225;
				local1329.anInt1629 += local846;
				local1329.anInt1626 += local810;
				local1329.anInt1627++;
				@Pc(1357) Class63 local1357 = local436[local1138];
				local1357.anInt1629 += local846;
				local1357.anInt1628 += local1225;
				local1357.anInt1626 += local810;
				local1357.anInt1627++;
				@Pc(1385) Class63 local1385 = local436[local1143];
				local1385.anInt1628 += local1225;
				local1385.anInt1629 += local846;
				local1385.anInt1627++;
				local1385.anInt1626 += local810;
			} else if (local1320 == 1) {
				@Pc(1424) Class244 local1424 = local1124[local1126] = new Class244();
				local1424.anInt6722 = local1225;
				local1424.anInt6724 = local810;
				local1424.anInt6721 = local846;
			}
		}
		@Pc(1450) int local1450;
		for (@Pc(1444) int local1444 = 0; local1444 < this.anInt5307; local1444++) {
			local1450 = local106[local1444];
			@Pc(1457) int local1457 = arg1.aShortArray91[local1450] & 0xFFFF;
			@Pc(1462) short local1462;
			if (arg1.aShortArray89 == null) {
				local1462 = -1;
			} else {
				local1462 = arg1.aShortArray89[local1450];
			}
			if (arg1.aByteArray68 == null) {
				local1165 = -1;
			} else {
				local1165 = arg1.aByteArray68[local1450];
			}
			if (arg1.aByteArray69 == null) {
				local744 = 0;
			} else {
				local744 = arg1.aByteArray69[local1450] & 0xFF;
			}
			@Pc(1497) float local1497 = 0.0F;
			@Pc(1499) float local1499 = 0.0F;
			@Pc(1501) float local1501 = 0.0F;
			local1009 = 0.0F;
			local1003 = 0.0F;
			local1007 = 0.0F;
			@Pc(1509) byte local1509 = 0;
			@Pc(1511) byte local1511 = 0;
			@Pc(1513) int local1513 = 0;
			@Pc(1529) byte local1529;
			@Pc(1549) short local1549;
			@Pc(1554) short local1554;
			@Pc(1559) short local1559;
			if (local1462 != -1) {
				if (local1165 == -1) {
					local1007 = 0.0F;
					local1009 = 1.0F;
					local1003 = 0.0F;
					local1509 = 1;
					local1501 = 1.0F;
					local1511 = 2;
					local1499 = 1.0F;
					local1497 = 0.0F;
				} else {
					local1165 &= 0xFF;
					local1529 = arg1.aByteArray67[local1165];
					@Pc(1539) short local1539;
					@Pc(1544) short local1544;
					@Pc(1582) float local1582;
					@Pc(1591) float local1591;
					@Pc(1600) float local1600;
					@Pc(1685) float local1685;
					@Pc(1694) float local1694;
					@Pc(1702) float local1702;
					@Pc(1711) float local1711;
					@Pc(1720) float local1720;
					@Pc(1728) float local1728;
					if (local1529 == 0) {
						local1539 = arg1.aShortArray93[local1450];
						local1544 = arg1.aShortArray96[local1450];
						local1549 = arg1.aShortArray94[local1450];
						local1554 = arg1.aShortArray88[local1165];
						local1559 = arg1.aShortArray92[local1165];
						@Pc(1564) short local1564 = arg1.aShortArray87[local1165];
						@Pc(1570) float local1570 = (float) arg1.anIntArray365[local1554];
						@Pc(1576) float local1576 = (float) arg1.anIntArray363[local1554];
						local1582 = arg1.anIntArray361[local1554];
						local1591 = (float) arg1.anIntArray365[local1559] - local1570;
						local1600 = (float) arg1.anIntArray363[local1559] - local1576;
						@Pc(1608) float local1608 = (float) arg1.anIntArray361[local1559] - local1582;
						@Pc(1616) float local1616 = (float) arg1.anIntArray365[local1564] - local1570;
						@Pc(1624) float local1624 = (float) arg1.anIntArray363[local1564] - local1576;
						@Pc(1633) float local1633 = (float) arg1.anIntArray361[local1564] - local1582;
						@Pc(1642) float local1642 = (float) arg1.anIntArray365[local1539] - local1570;
						@Pc(1650) float local1650 = (float) arg1.anIntArray363[local1539] - local1576;
						@Pc(1659) float local1659 = (float) arg1.anIntArray361[local1539] - local1582;
						@Pc(1668) float local1668 = (float) arg1.anIntArray365[local1544] - local1570;
						@Pc(1676) float local1676 = (float) arg1.anIntArray363[local1544] - local1576;
						local1685 = (float) arg1.anIntArray361[local1544] - local1582;
						local1694 = (float) arg1.anIntArray365[local1549] - local1570;
						local1702 = (float) arg1.anIntArray363[local1549] - local1576;
						local1711 = (float) arg1.anIntArray361[local1549] - local1582;
						local1720 = local1600 * local1633 - local1608 * local1624;
						local1728 = local1608 * local1616 - local1633 * local1591;
						@Pc(1736) float local1736 = local1591 * local1624 - local1600 * local1616;
						@Pc(1744) float local1744 = local1624 * local1736 - local1728 * local1633;
						@Pc(1753) float local1753 = local1633 * local1720 - local1616 * local1736;
						@Pc(1761) float local1761 = local1728 * local1616 - local1624 * local1720;
						@Pc(1775) float local1775 = 1.0F / (local1600 * local1753 + local1744 * local1591 + local1761 * local1608);
						local1003 = local1775 * (local1761 * local1711 + local1694 * local1744 + local1753 * local1702);
						local1497 = (local1753 * local1650 + local1642 * local1744 + local1659 * local1761) * local1775;
						local1501 = local1775 * (local1676 * local1753 + local1668 * local1744 + local1761 * local1685);
						@Pc(1825) float local1825 = local1736 * local1600 - local1728 * local1608;
						@Pc(1834) float local1834 = local1728 * local1591 - local1600 * local1720;
						@Pc(1843) float local1843 = local1720 * local1608 - local1591 * local1736;
						@Pc(1857) float local1857 = 1.0F / (local1624 * local1843 + local1825 * local1616 + local1633 * local1834);
						local1007 = (local1694 * local1825 + local1843 * local1702 + local1834 * local1711) * local1857;
						local1009 = (local1825 * local1668 + local1843 * local1676 + local1834 * local1685) * local1857;
						local1499 = (local1834 * local1659 + local1642 * local1825 + local1843 * local1650) * local1857;
					} else {
						local1539 = arg1.aShortArray93[local1450];
						local1544 = arg1.aShortArray96[local1450];
						local1549 = arg1.aShortArray94[local1450];
						@Pc(1920) int local1920 = local712[local1165];
						@Pc(1924) int local1924 = local714[local1165];
						@Pc(1928) int local1928 = local716[local1165];
						@Pc(1932) float[] local1932 = local718[local1165];
						@Pc(1937) byte local1937 = arg1.aByteArray64[local1165];
						local1582 = (float) arg1.anIntArray357[local1165] / 256.0F;
						if (local1529 == 1) {
							local1591 = (float) arg1.anIntArray364[local1165] / 1024.0F;
							Static252.method3608(local1920, local1928, arg1.anIntArray363[local1539], local1937, local1932, local1582, arg1.anIntArray361[local1539], local1591, arg1.anIntArray365[local1539], local1924);
							local1499 = Static258.aFloat103;
							local1497 = Static165.aFloat31;
							Static252.method3608(local1920, local1928, arg1.anIntArray363[local1544], local1937, local1932, local1582, arg1.anIntArray361[local1544], local1591, arg1.anIntArray365[local1544], local1924);
							local1009 = Static258.aFloat103;
							local1501 = Static165.aFloat31;
							Static252.method3608(local1920, local1928, arg1.anIntArray363[local1549], local1937, local1932, local1582, arg1.anIntArray361[local1549], local1591, arg1.anIntArray365[local1549], local1924);
							local1003 = Static165.aFloat31;
							local1007 = Static258.aFloat103;
							local1600 = local1591 / 2.0F;
							if ((local1937 & 0x1) == 0) {
								if (local1501 - local1497 > local1600) {
									local1509 = 1;
									local1501 -= local1591;
								} else if (local1600 < local1497 - local1501) {
									local1501 += local1591;
									local1509 = 2;
								}
								if (local1003 - local1497 > local1600) {
									local1511 = 1;
									local1003 -= local1591;
								} else if (local1600 < local1497 - local1003) {
									local1511 = 2;
									local1003 += local1591;
								}
							} else {
								if (local1600 < local1007 - local1499) {
									local1007 -= local1591;
									local1511 = 1;
								} else if (local1600 < local1499 - local1007) {
									local1511 = 2;
									local1007 += local1591;
								}
								if (local1600 < local1009 - local1499) {
									local1009 -= local1591;
									local1509 = 1;
								} else if (local1600 < local1499 - local1009) {
									local1509 = 2;
									local1009 += local1591;
								}
							}
						} else if (local1529 == 2) {
							local1591 = (float) arg1.anIntArray360[local1165] / 256.0F;
							local1600 = (float) arg1.anIntArray358[local1165] / 256.0F;
							@Pc(2381) int local2381 = arg1.anIntArray365[local1544] - arg1.anIntArray365[local1539];
							@Pc(2392) int local2392 = arg1.anIntArray363[local1544] - arg1.anIntArray363[local1539];
							@Pc(2403) int local2403 = arg1.anIntArray361[local1544] - arg1.anIntArray361[local1539];
							@Pc(2414) int local2414 = arg1.anIntArray365[local1549] - arg1.anIntArray365[local1539];
							@Pc(2425) int local2425 = arg1.anIntArray363[local1549] - arg1.anIntArray363[local1539];
							@Pc(2436) int local2436 = arg1.anIntArray361[local1549] - arg1.anIntArray361[local1539];
							@Pc(2444) int local2444 = local2392 * local2436 - local2425 * local2403;
							@Pc(2453) int local2453 = local2414 * local2403 - local2436 * local2381;
							@Pc(2462) int local2462 = local2425 * local2381 - local2392 * local2414;
							local1685 = 64.0F / (float) arg1.anIntArray362[local1165];
							local1694 = 64.0F / (float) arg1.anIntArray367[local1165];
							local1702 = 64.0F / (float) arg1.anIntArray364[local1165];
							local1711 = (local1932[0] * (float) local2444 + (float) local2453 * local1932[1] + local1932[2] * (float) local2462) / local1685;
							local1720 = (local1932[5] * (float) local2462 + (float) local2453 * local1932[4] + (float) local2444 * local1932[3]) / local1694;
							local1728 = ((float) local2462 * local1932[8] + local1932[7] * (float) local2453 + local1932[6] * (float) local2444) / local1702;
							local1513 = Static456.method5944(local1728, local1711, local1720);
							Static2.method37(local1591, arg1.anIntArray365[local1539], local1924, local1582, local1600, arg1.anIntArray363[local1539], local1937, local1920, local1928, local1932, local1513, arg1.anIntArray361[local1539]);
							local1499 = Static11.aFloat5;
							local1497 = Static194.aFloat106;
							Static2.method37(local1591, arg1.anIntArray365[local1544], local1924, local1582, local1600, arg1.anIntArray363[local1544], local1937, local1920, local1928, local1932, local1513, arg1.anIntArray361[local1544]);
							local1501 = Static194.aFloat106;
							local1009 = Static11.aFloat5;
							Static2.method37(local1591, arg1.anIntArray365[local1549], local1924, local1582, local1600, arg1.anIntArray363[local1549], local1937, local1920, local1928, local1932, local1513, arg1.anIntArray361[local1549]);
							local1007 = Static11.aFloat5;
							local1003 = Static194.aFloat106;
						} else if (local1529 == 3) {
							Static53.method915(arg1.anIntArray361[local1539], local1920, arg1.anIntArray365[local1539], local1924, local1928, local1937, local1932, arg1.anIntArray363[local1539], local1582);
							local1499 = Static72.aFloat15;
							local1497 = Static115.aFloat25;
							Static53.method915(arg1.anIntArray361[local1544], local1920, arg1.anIntArray365[local1544], local1924, local1928, local1937, local1932, arg1.anIntArray363[local1544], local1582);
							local1501 = Static115.aFloat25;
							local1009 = Static72.aFloat15;
							Static53.method915(arg1.anIntArray361[local1549], local1920, arg1.anIntArray365[local1549], local1924, local1928, local1937, local1932, arg1.anIntArray363[local1549], local1582);
							local1007 = Static72.aFloat15;
							local1003 = Static115.aFloat25;
							if ((local1937 & 0x1) == 0) {
								if (local1501 - local1497 > 0.5F) {
									local1509 = 1;
									local1501--;
								} else if (local1497 - local1501 > 0.5F) {
									local1501++;
									local1509 = 2;
								}
								if (local1003 - local1497 > 0.5F) {
									local1511 = 1;
									local1003--;
								} else if (local1497 - local1003 > 0.5F) {
									local1511 = 2;
									local1003++;
								}
							} else {
								if (local1009 - local1499 > 0.5F) {
									local1509 = 1;
									local1009--;
								} else if (local1499 - local1009 > 0.5F) {
									local1009++;
									local1509 = 2;
								}
								if (local1007 - local1499 > 0.5F) {
									local1511 = 1;
									local1007--;
								} else if (local1499 - local1007 > 0.5F) {
									local1511 = 2;
									local1007++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray65 == null) {
				local1529 = 0;
			} else {
				local1529 = arg1.aByteArray65[local1450];
			}
			if (local1529 == 0) {
				@Pc(2817) long local2817 = ((long) (local1513 << 24) + (long) (local1457 << 8) + (long) local744 << 32) + (long) (local1165 << 2);
				local1549 = arg1.aShortArray93[local1450];
				local1554 = arg1.aShortArray96[local1450];
				local1559 = arg1.aShortArray94[local1450];
				@Pc(2836) Class63 local2836 = local436[local1549];
				this.aShortArray85[local1444] = this.method4174(local2836.anInt1629, local2836.anInt1628, local1549, local1499, local1497, local2836.anInt1627, local2817, local2836.anInt1626, arg1);
				@Pc(2860) Class63 local2860 = local436[local1554];
				this.aShortArray83[local1444] = this.method4174(local2860.anInt1629, local2860.anInt1628, local1554, local1009, local1501, local2860.anInt1627, (long) local1509 + local2817, local2860.anInt1626, arg1);
				@Pc(2887) Class63 local2887 = local436[local1559];
				this.aShortArray86[local1444] = this.method4174(local2887.anInt1629, local2887.anInt1628, local1559, local1007, local1003, local2887.anInt1627, (long) local1511 + local2817, local2887.anInt1626, arg1);
			} else if (local1529 == 1) {
				@Pc(2681) Class244 local2681 = local1124[local1450];
				@Pc(2722) long local2722 = ((long) local744 + (long) (local1457 << 8) + (long) (local1513 << 24) << 32) + (long) ((local2681.anInt6721 + 256 << 22) + (local2681.anInt6724 > 0 ? 1024 : 2048) + (local1165 << 2) + (local2681.anInt6722 + 256 << 12));
				this.aShortArray85[local1444] = this.method4174(local2681.anInt6721, local2681.anInt6722, arg1.aShortArray93[local1450], local1499, local1497, 0, local2722, local2681.anInt6724, arg1);
				this.aShortArray83[local1444] = this.method4174(local2681.anInt6721, local2681.anInt6722, arg1.aShortArray96[local1450], local1009, local1501, 0, local2722 + (long) local1509, local2681.anInt6724, arg1);
				this.aShortArray86[local1444] = this.method4174(local2681.anInt6721, local2681.anInt6722, arg1.aShortArray94[local1450], local1007, local1003, 0, local2722 + (long) local1511, local2681.anInt6724, arg1);
			}
			if (arg1.aShortArray89 == null) {
				this.aShortArray79[local1444] = -1;
			} else {
				this.aShortArray79[local1444] = arg1.aShortArray89[local1450];
			}
			if (arg1.aByteArray69 != null) {
				this.aByteArray60[local1444] = arg1.aByteArray69[local1450];
			}
			if (arg1.aShortArray95 != null) {
				this.aShortArray80[local1444] = arg1.aShortArray95[local1450];
			}
			this.aShortArray81[local1444] = arg1.aShortArray91[local1450];
		}
		local1450 = 0;
		local1143 = -10000;
		for (local1154 = 0; local1154 < this.anInt5330; local1154++) {
			@Pc(2976) short local2976 = this.aShortArray79[local1154];
			if (local1143 != local2976) {
				local1450++;
				local1143 = local2976;
			}
		}
		this.anIntArray350 = new int[local1450 + 1];
		local1450 = 0;
		local1143 = -10000;
		for (local1165 = 0; local1165 < this.anInt5330; local1165++) {
			@Pc(3014) short local3014 = this.aShortArray79[local1165];
			if (local1143 != local3014) {
				this.anIntArray350[local1450++] = local1165;
				local1143 = local3014;
			}
		}
		this.anIntArray350[local1450] = this.anInt5330;
		Static435.aLongArray9 = null;
		this.aShortArray77 = Static221.method3238(this.anInt5277, this.aShortArray77);
		this.aShortArray82 = Static221.method3238(this.anInt5277, this.aShortArray82);
		this.aShortArray76 = Static221.method3238(this.anInt5277, this.aShortArray76);
		this.aByteArray61 = Static398.method2754(this.anInt5277, this.aByteArray61);
		this.aFloatArray25 = Static410.method4612(this.anInt5277, this.aFloatArray25);
		this.aFloatArray24 = Static410.method4612(this.anInt5277, this.aFloatArray24);
		if (arg1.anIntArray366 != null && Static103.method1580(arg2, this.anInt5325)) {
			this.anIntArrayArray47 = arg1.method4264();
		}
		if (arg1.aClass167Array1 != null && Static238.method3444(arg2, this.anInt5325)) {
			this.anIntArrayArray48 = arg1.method4261();
		}
		if (arg1.anIntArray359 != null && Static381.method5017(arg2, this.anInt5325)) {
			local744 = 0;
			@Pc(3132) int[] local3132 = new int[256];
			for (local795 = 0; local795 < this.anInt5307; local795++) {
				local808 = arg1.anIntArray359[local106[local795]];
				if (local808 >= 0) {
					if (local744 < local808) {
						local744 = local808;
					}
					@Pc(3158) int local3158 = local3132[local808]++;
				}
			}
			this.anIntArrayArray46 = new int[local744 + 1][];
			for (local808 = 0; local808 <= local744; local808++) {
				this.anIntArrayArray46[local808] = new int[local3132[local808]];
				local3132[local808] = 0;
			}
			for (local810 = 0; local810 < this.anInt5307; local810++) {
				local1225 = arg1.anIntArray359[local106[local810]];
				if (local1225 >= 0) {
					this.anIntArrayArray46[local1225][local3132[local1225]++] = local810;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		return this.aShort87;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	private void method4167() {
		if (this.anInt5330 == 0) {
			return;
		}
		if (this.aByte87 != 0) {
			this.method4176(true);
		}
		this.method4176(false);
		if (this.aClass172_1 != null) {
			if (this.aClass172_1.anInterface2_3 == null) {
				this.method4175((this.aByte87 & 0x10) != 0);
			}
			if (this.aClass172_1.anInterface2_3 != null) {
				this.aClass34_Sub2_27.method5487(this.aClass238_7 != null);
				this.aClass34_Sub2_27.method5550(this.aClass238_8, this.aClass238_9, this.aClass238_6, this.aClass238_7);
				@Pc(75) int local75 = this.anIntArray350.length - 1;
				for (@Pc(77) int local77 = 0; local77 < local75; local77++) {
					@Pc(84) int local84 = this.anIntArray350[local77];
					@Pc(91) int local91 = this.anIntArray350[local77 + 1];
					@Pc(98) int local98 = this.aShortArray79[local84] & 0xFFFF;
					if (local98 == 65535) {
						local98 = -1;
					}
					this.aClass34_Sub2_27.method5523(local98, this.aClass238_7 != null);
					this.aClass34_Sub2_27.method5504((local91 - local84) * 3, local84 * 3, this.aClass172_1.anInterface2_3);
				}
			}
		}
		this.method4178();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!re;Z)V")
	private void method4168(@OriginalArg(0) Class1_Sub5_Sub10_Sub1 arg0) {
		if (this.anInt5277 > this.aClass34_Sub2_27.anIntArray466.length) {
			this.aClass34_Sub2_27.anIntArray466 = new int[this.anInt5277];
			this.aClass34_Sub2_27.anIntArray467 = new int[this.anInt5277];
		}
		@Pc(32) int[] local32 = this.aClass34_Sub2_27.anIntArray466;
		@Pc(36) int[] local36 = this.aClass34_Sub2_27.anIntArray467;
		@Pc(64) int local64;
		@Pc(102) int local102;
		@Pc(111) int local111;
		for (@Pc(38) int local38 = 0; local38 < this.anInt5312; local38++) {
			local64 = (this.anIntArray351[local38] - (this.aClass34_Sub2_27.anInt7111 * this.anIntArray349[local38] >> 8) >> this.aClass34_Sub2_27.anInt7072) - arg0.anInt5927;
			@Pc(88) int local88 = (this.anIntArray353[local38] - (this.aClass34_Sub2_27.anInt7083 * this.anIntArray349[local38] >> 8) >> this.aClass34_Sub2_27.anInt7072) - arg0.anInt5924;
			@Pc(93) int local93 = this.anIntArray352[local38];
			@Pc(100) int local100 = this.anIntArray352[local38 + 1];
			for (local102 = local93; local102 < local100; local102++) {
				local111 = this.aShortArray84[local102] - 1;
				if (local111 == -1) {
					break;
				}
				local32[local111] = local64;
				local36[local111] = local88;
			}
		}
		for (local64 = 0; local64 < this.anInt5330; local64++) {
			if (this.aByteArray60 == null || this.aByteArray60[local64] <= 128) {
				@Pc(160) short local160 = this.aShortArray85[local64];
				@Pc(165) short local165 = this.aShortArray83[local64];
				@Pc(170) short local170 = this.aShortArray86[local64];
				local102 = local32[local160];
				local111 = local32[local165];
				@Pc(182) int local182 = local32[local170];
				@Pc(186) int local186 = local36[local160];
				@Pc(190) int local190 = local36[local165];
				@Pc(194) int local194 = local36[local170];
				if ((local102 - local111) * (local190 - local194) - (local190 - local186) * (local182 - local111) > 0) {
					arg0.method4689(local194, local102, local190, local186, local182, local111);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.aShort89;
	}

	@OriginalMember(owner = "client!pg", name = "ta", descriptor = "()I")
	@Override
	public int ta() {
		if (!this.aBoolean603) {
			this.method4169();
		}
		return this.aShort83;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
	private void method4169() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt5312; local23++) {
			@Pc(30) int local30 = this.anIntArray351[local23];
			@Pc(35) int local35 = this.anIntArray349[local23];
			if (local35 < local9) {
				local9 = local35;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			@Pc(72) int local72 = this.anIntArray353[local23];
			if (local72 > local17) {
				local17 = local72;
			}
			if (local72 < local11) {
				local11 = local72;
			}
			@Pc(94) int local94 = local30 * local30 + local72 * local72;
			if (local94 > local19) {
				local19 = local94;
			}
			local94 = local30 * local30 + local72 * local72 + local35 * local35;
			if (local21 < local94) {
				local21 = local94;
			}
		}
		this.aShort88 = (short) local15;
		this.aShort84 = (short) local9;
		this.aShort86 = (short) local13;
		this.aShort91 = (short) local17;
		this.aShort83 = (short) local7;
		this.aShort90 = (short) local11;
		this.aShort85 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean603 = true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method5957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class32_Sub2 local8 = (Class32_Sub2) arg2;
		@Pc(12) Class32_Sub2 local12 = this.aClass34_Sub2_27.aClass32_Sub2_4;
		@Pc(33) float local33 = local12.aFloat48 + local12.aFloat50 * local8.aFloat51 + local12.aFloat54 * local8.aFloat48 + local12.aFloat52 * local8.aFloat55;
		@Pc(54) float local54 = local12.aFloat55 + local12.aFloat49 * local8.aFloat51 + local8.aFloat48 * local12.aFloat45 + local12.aFloat53 * local8.aFloat55;
		Static151.aFloat30 = local12.aFloat54 * local8.aFloat50 + local12.aFloat52 * local8.aFloat49 + local12.aFloat50 * local8.aFloat47;
		Static166.aFloat32 = local8.aFloat49 * local12.aFloat53 + local8.aFloat50 * local12.aFloat45 + local8.aFloat47 * local12.aFloat49;
		Static452.aFloat108 = local8.aFloat49 * local12.aFloat46 + local8.aFloat50 * local12.aFloat56 + local8.aFloat47 * local12.aFloat47;
		Static81.aFloat18 = local8.aFloat56 * local12.aFloat49 + local12.aFloat45 * local8.aFloat54 + local8.aFloat45 * local12.aFloat53;
		@Pc(147) float local147 = local12.aFloat51 + local8.aFloat51 * local12.aFloat47 + local8.aFloat48 * local12.aFloat56 + local12.aFloat46 * local8.aFloat55;
		Static4.aFloat4 = local12.aFloat54 * local8.aFloat52 + local8.aFloat53 * local12.aFloat52 + local12.aFloat50 * local8.aFloat46;
		Static348.aFloat71 = local8.aFloat56 * local12.aFloat47 + local12.aFloat46 * local8.aFloat45 + local8.aFloat54 * local12.aFloat56;
		Static331.aFloat67 = local12.aFloat50 * local8.aFloat56 + local12.aFloat52 * local8.aFloat45 + local8.aFloat54 * local12.aFloat54;
		Static346.aFloat69 = local12.aFloat49 * local8.aFloat46 + local12.aFloat45 * local8.aFloat52 + local12.aFloat53 * local8.aFloat53;
		Static132.aFloat26 = local8.aFloat52 * local12.aFloat56 + local12.aFloat46 * local8.aFloat53 + local12.aFloat47 * local8.aFloat46;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass34_Sub2_27.anInt7105;
		@Pc(255) int local255 = this.aClass34_Sub2_27.anInt7096;
		if (!this.aBoolean603) {
			this.method4169();
		}
		Static292.anIntArray331[0] = this.aShort83;
		Static292.anIntArray333[0] = this.aShort84;
		Static109.anIntArray311[0] = this.aShort90;
		Static292.anIntArray331[1] = this.aShort86;
		Static292.anIntArray333[1] = this.aShort84;
		Static109.anIntArray311[1] = this.aShort90;
		Static292.anIntArray331[2] = this.aShort83;
		Static292.anIntArray333[2] = this.aShort88;
		Static292.anIntArray331[3] = this.aShort86;
		Static109.anIntArray311[2] = this.aShort90;
		Static292.anIntArray333[3] = this.aShort88;
		Static292.anIntArray331[4] = this.aShort83;
		Static109.anIntArray311[3] = this.aShort90;
		Static292.anIntArray333[4] = this.aShort84;
		Static109.anIntArray311[4] = this.aShort91;
		Static292.anIntArray331[5] = this.aShort86;
		Static292.anIntArray333[5] = this.aShort84;
		Static292.anIntArray331[6] = this.aShort83;
		Static109.anIntArray311[5] = this.aShort91;
		Static292.anIntArray333[6] = this.aShort88;
		Static109.anIntArray311[6] = this.aShort91;
		Static292.anIntArray331[7] = this.aShort86;
		Static292.anIntArray333[7] = this.aShort88;
		Static109.anIntArray311[7] = this.aShort91;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static292.anIntArray331[local383];
			local395 = Static109.anIntArray311[local383];
			local400 = Static292.anIntArray333[local383];
			local414 = local395 * Static452.aFloat108 + Static348.aFloat71 * local390 + Static132.aFloat26 * local400 + local147;
			local428 = Static166.aFloat32 * local395 + Static81.aFloat18 * local390 + Static346.aFloat69 * local400 + local54;
			local442 = Static4.aFloat4 * local400 + Static331.aFloat67 * local390 + Static151.aFloat30 * local395 + local33;
			if (local414 >= (float) this.aClass34_Sub2_27.anInt7099) {
				@Pc(461) float local461 = local442 * (float) local251 / local414 + (float) this.aClass34_Sub2_27.anInt7112;
				@Pc(473) float local473 = (float) this.aClass34_Sub2_27.anInt7091 + local428 * (float) local255 / local414;
				if (local243 < local461) {
					local243 = local461;
				}
				if (local241 > local461) {
					local241 = local461;
				}
				local239 = true;
				if (local473 < local245) {
					local245 = local473;
				}
				if (local473 > local247) {
					local247 = local473;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.aClass34_Sub2_27.anIntArray466.length < this.anInt5277) {
				this.aClass34_Sub2_27.anIntArray466 = new int[this.anInt5277];
				this.aClass34_Sub2_27.anIntArray467 = new int[this.anInt5277];
			}
			@Pc(554) int[] local554 = this.aClass34_Sub2_27.anIntArray466;
			@Pc(558) int[] local558 = this.aClass34_Sub2_27.anIntArray467;
			@Pc(642) int local642;
			for (@Pc(560) int local560 = 0; local560 < this.anInt5312; local560++) {
				local400 = this.anIntArray349[local560];
				local395 = this.anIntArray353[local560];
				local390 = this.anIntArray351[local560];
				local414 = Static132.aFloat26 * local400 + local390 * Static348.aFloat71 + Static452.aFloat108 * local395 + local147;
				local442 = Static151.aFloat30 * local395 + Static4.aFloat4 * local400 + Static331.aFloat67 * local390 + local33;
				local428 = local54 + local395 * Static166.aFloat32 + Static346.aFloat69 * local400 + local390 * Static81.aFloat18;
				@Pc(655) int local655;
				@Pc(660) int local660;
				@Pc(667) int local667;
				if ((float) this.aClass34_Sub2_27.anInt7099 <= local414) {
					local642 = (int) (local442 * (float) local251 / local414 + (float) this.aClass34_Sub2_27.anInt7112);
					local655 = (int) ((float) local255 * local428 / local414 + (float) this.aClass34_Sub2_27.anInt7091);
					local660 = this.anIntArray352[local560];
					local667 = this.anIntArray352[local560 + 1];
					for (@Pc(669) int local669 = local660; local669 < local667; local669++) {
						@Pc(678) int local678 = this.aShortArray84[local669] - 1;
						if (local678 == -1) {
							break;
						}
						local554[local678] = local642;
						local558[local678] = local655;
					}
				} else {
					local642 = this.anIntArray352[local560];
					local655 = this.anIntArray352[local560 + 1];
					for (local660 = local642; local660 < local655; local660++) {
						local667 = this.aShortArray84[local660] - 1;
						if (local667 == -1) {
							break;
						}
						local554[this.aShortArray84[local660] - 1] = -999999;
					}
				}
			}
			for (local642 = 0; local642 < this.anInt5307; local642++) {
				if (local554[this.aShortArray85[local642]] != -999999 && local554[this.aShortArray83[local642]] != -999999 && local554[this.aShortArray86[local642]] != -999999 && this.method4180(local558[this.aShortArray83[local642]], local554[this.aShortArray83[local642]], local554[this.aShortArray86[local642]], local558[this.aShortArray85[local642]], arg0, local558[this.aShortArray86[local642]], arg1, local554[this.aShortArray85[local642]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "va", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			Static226.anInt4015 = 0;
			Static387.anInt6433 = 0;
			Static404.anInt6699 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray47.length) {
					local55 = this.anIntArrayArray47[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static387.anInt6433 += this.anIntArray351[local63];
						Static226.anInt4015 += this.anIntArray349[local63];
						local33++;
						Static404.anInt6699 += this.anIntArray353[local63];
					}
				}
			}
			if (local33 <= 0) {
				Static387.anInt6433 = local17;
				Static404.anInt6699 = local21;
				Static226.anInt4015 = local25;
			} else {
				Static404.anInt6699 = local21 + Static404.anInt6699 / local33;
				Static387.anInt6433 = Static387.anInt6433 / local33 + local17;
				Static226.anInt4015 = Static226.anInt4015 / local33 + local25;
			}
			return;
		}
		@Pc(165) int[] local165;
		@Pc(167) int local167;
		if (arg0 == 1) {
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			local17 = arg2 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray47.length) {
					local165 = this.anIntArrayArray47[local35];
					for (local167 = 0; local167 < local165.length; local167++) {
						local57 = local165[local167];
						this.anIntArray351[local57] += local17;
						this.anIntArray349[local57] += local25;
						this.anIntArray353[local57] += local21;
					}
				}
			}
			return;
		}
		@Pc(290) int local290;
		@Pc(308) int local308;
		@Pc(770) int local770;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray47.length) {
					local165 = this.anIntArrayArray47[local35];
					if ((arg5 & 0x1) == 0) {
						for (local167 = 0; local167 < local165.length; local167++) {
							local57 = local165[local167];
							this.anIntArray351[local57] -= Static387.anInt6433;
							this.anIntArray349[local57] -= Static226.anInt4015;
							this.anIntArray353[local57] -= Static404.anInt6699;
							if (arg4 != 0) {
								local63 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg4];
								local290 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg4];
								local308 = this.anIntArray349[local57] * local63 + this.anIntArray351[local57] * local290 + 32767 >> 15;
								this.anIntArray349[local57] = this.anIntArray349[local57] * local290 + 32767 - this.anIntArray351[local57] * local63 >> 15;
								this.anIntArray351[local57] = local308;
							}
							if (arg2 != 0) {
								local63 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg2];
								local290 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg2];
								local308 = local290 * this.anIntArray349[local57] + 32767 - this.anIntArray353[local57] * local63 >> 15;
								this.anIntArray353[local57] = local290 * this.anIntArray353[local57] + this.anIntArray349[local57] * local63 + 32767 >> 15;
								this.anIntArray349[local57] = local308;
							}
							if (arg3 != 0) {
								local63 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg3];
								local290 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg3];
								local308 = this.anIntArray353[local57] * local63 + this.anIntArray351[local57] * local290 + 32767 >> 15;
								this.anIntArray353[local57] = this.anIntArray353[local57] * local290 + 32767 - this.anIntArray351[local57] * local63 >> 15;
								this.anIntArray351[local57] = local308;
							}
							this.anIntArray351[local57] += Static387.anInt6433;
							this.anIntArray349[local57] += Static226.anInt4015;
							this.anIntArray353[local57] += Static404.anInt6699;
						}
					} else {
						for (local167 = 0; local167 < local165.length; local167++) {
							local57 = local165[local167];
							this.anIntArray351[local57] -= Static387.anInt6433;
							this.anIntArray349[local57] -= Static226.anInt4015;
							this.anIntArray353[local57] -= Static404.anInt6699;
							if (arg2 != 0) {
								local63 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg2];
								local290 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg2];
								local308 = local290 * this.anIntArray349[local57] + 32767 - this.anIntArray353[local57] * local63 >> 15;
								this.anIntArray353[local57] = local63 * this.anIntArray349[local57] + local290 * this.anIntArray353[local57] + 32767 >> 15;
								this.anIntArray349[local57] = local308;
							}
							if (arg4 != 0) {
								local63 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg4];
								local290 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg4];
								local308 = local290 * this.anIntArray351[local57] + this.anIntArray349[local57] * local63 + 32767 >> 15;
								this.anIntArray349[local57] = local290 * this.anIntArray349[local57] + 32767 - local63 * this.anIntArray351[local57] >> 15;
								this.anIntArray351[local57] = local308;
							}
							if (arg3 != 0) {
								local63 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg3];
								local290 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg3];
								local308 = this.anIntArray353[local57] * local63 + local290 * this.anIntArray351[local57] + 32767 >> 15;
								this.anIntArray353[local57] = local290 * this.anIntArray353[local57] + 32767 - this.anIntArray351[local57] * local63 >> 15;
								this.anIntArray351[local57] = local308;
							}
							this.anIntArray351[local57] += Static387.anInt6433;
							this.anIntArray349[local57] += Static226.anInt4015;
							this.anIntArray353[local57] += Static404.anInt6699;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray47.length > local41) {
						local55 = this.anIntArrayArray47[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local290 = this.anIntArray352[local63];
							local308 = this.anIntArray352[local63 + 1];
							for (local770 = local290; local770 < local308; local770++) {
								@Pc(779) int local779 = this.aShortArray84[local770] - 1;
								if (local779 == -1) {
									break;
								}
								@Pc(791) int local791;
								@Pc(795) int local795;
								@Pc(813) int local813;
								if (arg4 != 0) {
									local791 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg4];
									local795 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg4];
									local813 = local795 * this.aShortArray77[local779] + this.aShortArray82[local779] * local791 + 32767 >> 15;
									this.aShortArray82[local779] = (short) (this.aShortArray82[local779] * local795 + 32767 - this.aShortArray77[local779] * local791 >> 15);
									this.aShortArray77[local779] = (short) local813;
								}
								if (arg2 != 0) {
									local791 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg2];
									local795 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg2];
									local813 = this.aShortArray82[local779] * local795 + 32767 - local791 * this.aShortArray76[local779] >> 15;
									this.aShortArray76[local779] = (short) (local791 * this.aShortArray82[local779] + local795 * this.aShortArray76[local779] + 32767 >> 15);
									this.aShortArray82[local779] = (short) local813;
								}
								if (arg3 != 0) {
									local791 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg3];
									local795 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg3];
									local813 = this.aShortArray77[local779] * local795 + local791 * this.aShortArray76[local779] + 32767 >> 15;
									this.aShortArray76[local779] = (short) (local795 * this.aShortArray76[local779] + 32767 - this.aShortArray77[local779] * local791 >> 15);
									this.aShortArray77[local779] = (short) local813;
								}
							}
						}
					}
				}
				if (this.aClass238_7 == null && this.aClass238_6 != null) {
					this.aClass238_6.anInterface10_5 = null;
				}
				if (this.aClass238_7 != null) {
					this.aClass238_7.anInterface10_5 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray47.length > local35) {
					local165 = this.anIntArrayArray47[local35];
					for (local167 = 0; local167 < local165.length; local167++) {
						local57 = local165[local167];
						this.anIntArray351[local57] -= Static387.anInt6433;
						this.anIntArray349[local57] -= Static226.anInt4015;
						this.anIntArray353[local57] -= Static404.anInt6699;
						this.anIntArray351[local57] = arg2 * this.anIntArray351[local57] >> 7;
						this.anIntArray349[local57] = arg3 * this.anIntArray349[local57] >> 7;
						this.anIntArray353[local57] = this.anIntArray353[local57] * arg4 >> 7;
						this.anIntArray351[local57] += Static387.anInt6433;
						this.anIntArray349[local57] += Static226.anInt4015;
						this.anIntArray353[local57] += Static404.anInt6699;
					}
				}
			}
		} else {
			@Pc(1230) Class35 local1230;
			@Pc(1235) Class94 local1235;
			if (arg0 == 5) {
				if (this.anIntArrayArray46 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray46.length) {
							local165 = this.anIntArrayArray46[local35];
							for (local167 = 0; local167 < local165.length; local167++) {
								local57 = local165[local167];
								local63 = arg2 * 8 + (this.aByteArray60[local57] & 0xFF);
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray60[local57] = (byte) local63;
							}
							if (local165.length > 0 && this.aClass238_6 != null) {
								this.aClass238_6.anInterface10_5 = null;
							}
						}
					}
					if (this.aClass35Array1 != null) {
						for (local35 = 0; local35 < this.anInt5306; local35++) {
							local1230 = this.aClass35Array1[local35];
							local1235 = this.aClass94Array1[local35];
							local1235.anInt2394 = 255 - (this.aByteArray60[local1230.anInt813] & 0xFF) << 24 | local1235.anInt2394 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1485) Class94 local1485;
				if (arg0 == 8) {
					if (this.anIntArrayArray48 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (local35 < this.anIntArrayArray48.length) {
								local165 = this.anIntArrayArray48[local35];
								for (local167 = 0; local167 < local165.length; local167++) {
									local1485 = this.aClass94Array1[local165[local167]];
									local1485.anInt2393 += arg2;
									local1485.anInt2385 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray48 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (this.anIntArrayArray48.length > local35) {
								local165 = this.anIntArrayArray48[local35];
								for (local167 = 0; local167 < local165.length; local167++) {
									local1485 = this.aClass94Array1[local165[local167]];
									local1485.anInt2391 = arg3 * local1485.anInt2391 >> 7;
									local1485.anInt2392 = local1485.anInt2392 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray48 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray48.length) {
							local165 = this.anIntArrayArray48[local35];
							for (local167 = 0; local167 < local165.length; local167++) {
								local1485 = this.aClass94Array1[local165[local167]];
								local1485.anInt2396 = local1485.anInt2396 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray46 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray46.length) {
						local165 = this.anIntArrayArray46[local35];
						for (local167 = 0; local167 < local165.length; local167++) {
							local57 = local165[local167];
							local63 = this.aShortArray81[local57] & 0xFFFF;
							local290 = local63 >> 10 & 0x3F;
							local308 = local63 >> 7 & 0x7;
							@Pc(1327) int local1327 = arg2 + local290 & 0x3F;
							local308 += arg3 / 4;
							local770 = local63 & 0x7F;
							local770 += arg4;
							if (local308 < 0) {
								local308 = 0;
							} else if (local308 > 7) {
								local308 = 7;
							}
							if (local770 < 0) {
								local770 = 0;
							} else if (local770 > 127) {
								local770 = 127;
							}
							this.aShortArray81[local57] = (short) (local1327 << 10 | local308 << 7 | local770);
						}
						if (local165.length > 0 && this.aClass238_6 != null) {
							this.aClass238_6.anInterface10_5 = null;
						}
					}
				}
				if (this.aClass35Array1 != null) {
					for (local35 = 0; local35 < this.anInt5306; local35++) {
						local1230 = this.aClass35Array1[local35];
						local1235 = this.aClass94Array1[local35];
						local1235.anInt2394 = local1235.anInt2394 & 0xFF000000 | Static160.anIntArray183[this.aShortArray81[local1230.anInt813] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg0];
		@Pc(13) int local13 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5312; local15++) {
			@Pc(33) int local33 = this.anIntArray349[local15] * local13 - this.anIntArray353[local15] * local9 >> 15;
			this.anIntArray353[local15] = this.anIntArray349[local15] * local9 + this.anIntArray353[local15] * local13 >> 15;
			this.anIntArray349[local15] = local33;
		}
		this.aBoolean603 = false;
		if (this.aClass238_8 != null) {
			this.aClass238_8.anInterface10_5 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg0];
		@Pc(13) int local13 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5312; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray353[local15] + local13 * this.anIntArray351[local15] >> 15;
			this.anIntArray353[local15] = this.anIntArray353[local15] * local13 - local9 * this.anIntArray351[local15] >> 15;
			this.anIntArray351[local15] = local34;
		}
		this.aBoolean603 = false;
		if (this.aClass238_8 != null) {
			this.aClass238_8.anInterface10_5 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean603) {
			this.method4169();
		}
		return this.aShort88;
	}

	@OriginalMember(owner = "client!pg", name = "MA", descriptor = "()I")
	@Override
	public int MA() {
		if (!this.aBoolean603) {
			this.method4169();
		}
		return this.aShort86;
	}

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aShort89 = (short) arg0;
		if (this.aClass238_6 != null) {
			this.aClass238_6.anInterface10_5 = null;
		}
		if (this.aClass238_7 != null) {
			this.aClass238_7.anInterface10_5 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()Z")
	@Override
	public boolean method5952() {
		if (this.aShortArray79 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray79.length; local12++) {
			if (this.aShortArray79[local12] != -1 && !this.aClass34_Sub2_27.anInterface6_8.method3934(this.aShortArray79[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method5956(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class57_Sub2 local8 = (Class57_Sub2) arg0;
		if (this.anInt5307 == 0 || local8.anInt5307 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt5312;
		@Pc(27) int[] local27 = local8.anIntArray351;
		@Pc(30) int[] local30 = local8.anIntArray349;
		@Pc(33) int[] local33 = local8.anIntArray353;
		@Pc(36) short[] local36 = local8.aShortArray77;
		@Pc(39) short[] local39 = local8.aShortArray82;
		@Pc(42) short[] local42 = local8.aShortArray76;
		@Pc(45) byte[] local45 = local8.aByteArray61;
		@Pc(64) short[] local64;
		@Pc(52) short[] local52;
		@Pc(56) short[] local56;
		@Pc(60) byte[] local60;
		if (this.aClass270_1 == null) {
			local60 = null;
			local52 = null;
			local64 = null;
			local56 = null;
		} else {
			local52 = this.aClass270_1.aShortArray115;
			local56 = this.aClass270_1.aShortArray116;
			local60 = this.aClass270_1.aByteArray96;
			local64 = this.aClass270_1.aShortArray117;
		}
		@Pc(85) short[] local85;
		@Pc(81) short[] local81;
		@Pc(93) short[] local93;
		@Pc(89) byte[] local89;
		if (local8.aClass270_1 == null) {
			local85 = null;
			local93 = null;
			local89 = null;
			local81 = null;
		} else {
			local81 = local8.aClass270_1.aShortArray115;
			local85 = local8.aClass270_1.aShortArray117;
			local89 = local8.aClass270_1.aByteArray96;
			local93 = local8.aClass270_1.aShortArray116;
		}
		@Pc(106) int[] local106 = local8.anIntArray352;
		@Pc(109) short[] local109 = local8.aShortArray84;
		if (!local8.aBoolean603) {
			local8.method4169();
		}
		@Pc(118) short local118 = local8.aShort84;
		@Pc(121) short local121 = local8.aShort88;
		@Pc(124) short local124 = local8.aShort83;
		@Pc(127) short local127 = local8.aShort86;
		@Pc(130) short local130 = local8.aShort90;
		@Pc(133) short local133 = local8.aShort91;
		for (@Pc(135) int local135 = 0; local135 < this.anInt5312; local135++) {
			@Pc(145) int local145 = this.anIntArray349[local135] - arg2;
			if (local118 <= local145 && local121 >= local145) {
				@Pc(165) int local165 = this.anIntArray351[local135] - arg1;
				if (local165 >= local124 && local127 >= local165) {
					@Pc(184) int local184 = this.anIntArray353[local135] - arg3;
					if (local184 >= local130 && local184 <= local133) {
						@Pc(198) int local198 = -1;
						@Pc(203) int local203 = this.anIntArray352[local135];
						@Pc(210) int local210 = this.anIntArray352[local135 + 1];
						for (@Pc(212) int local212 = local203; local212 < local210; local212++) {
							local198 = this.aShortArray84[local212] - 1;
							if (local198 == -1 || this.aByteArray61[local198] != 0) {
								break;
							}
						}
						if (local198 != -1) {
							for (@Pc(245) int local245 = 0; local245 < local24; local245++) {
								if (local27[local245] == local165 && local184 == local33[local245] && local30[local245] == local145) {
									local203 = local106[local245];
									local210 = local106[local245 + 1];
									@Pc(282) int local282 = -1;
									for (@Pc(284) int local284 = local203; local284 < local210; local284++) {
										local282 = local109[local284] - 1;
										if (local282 == -1 || local45[local282] != 0) {
											break;
										}
									}
									if (local282 != -1) {
										if (local64 == null) {
											this.aClass270_1 = new Class270();
											local64 = this.aClass270_1.aShortArray117 = Static250.method3556(this.aShortArray77);
											local52 = this.aClass270_1.aShortArray115 = Static250.method3556(this.aShortArray82);
											local56 = this.aClass270_1.aShortArray116 = Static250.method3556(this.aShortArray76);
											local60 = this.aClass270_1.aByteArray96 = Static107.method1708(this.aByteArray61);
										}
										if (local85 == null) {
											@Pc(361) Class270 local361 = local8.aClass270_1 = new Class270();
											local85 = local361.aShortArray117 = Static250.method3556(local36);
											local81 = local361.aShortArray115 = Static250.method3556(local39);
											local93 = local361.aShortArray116 = Static250.method3556(local42);
											local89 = local361.aByteArray96 = Static107.method1708(local45);
										}
										@Pc(394) short local394 = this.aShortArray77[local198];
										@Pc(399) short local399 = this.aShortArray82[local198];
										@Pc(404) short local404 = this.aShortArray76[local198];
										local203 = local106[local245];
										@Pc(413) byte local413 = this.aByteArray61[local198];
										local210 = local106[local245 + 1];
										@Pc(429) int local429;
										for (@Pc(421) int local421 = local203; local421 < local210; local421++) {
											local429 = local109[local421] - 1;
											if (local429 == -1) {
												break;
											}
											if (local89[local429] != 0) {
												local85[local429] += local394;
												local81[local429] += local399;
												local93[local429] += local404;
												local89[local429] += local413;
											}
										}
										local399 = local39[local282];
										local203 = this.anIntArray352[local135];
										local210 = this.anIntArray352[local135 + 1];
										local394 = local36[local282];
										local413 = local45[local282];
										local404 = local42[local282];
										for (local429 = local203; local429 < local210; local429++) {
											@Pc(511) int local511 = this.aShortArray84[local429] - 1;
											if (local511 == -1) {
												break;
											}
											if (local60[local511] != 0) {
												local64[local511] += local394;
												local52[local511] += local399;
												local56[local511] += local404;
												local60[local511] += local413;
											}
										}
										if (this.aClass238_7 == null && this.aClass238_6 != null) {
											this.aClass238_6.anInterface10_5 = null;
										}
										if (this.aClass238_7 != null) {
											this.aClass238_7.anInterface10_5 = null;
										}
										if (local8.aClass238_7 == null && local8.aClass238_6 != null) {
											local8.aClass238_6.anInterface10_5 = null;
										}
										if (local8.aClass238_7 != null) {
											local8.aClass238_7.anInterface10_5 = null;
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

	@OriginalMember(owner = "client!pg", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5312; local3++) {
			this.anIntArray353[local3] = -this.anIntArray353[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt5277; local29++) {
			this.aShortArray76[local29] = (short) -this.aShortArray76[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt5307; local48++) {
			@Pc(55) short local55 = this.aShortArray85[local48];
			this.aShortArray85[local48] = this.aShortArray86[local48];
			this.aShortArray86[local48] = local55;
		}
		if (this.aClass238_7 == null && this.aClass238_6 != null) {
			this.aClass238_6.anInterface10_5 = null;
		}
		if (this.aClass238_7 != null) {
			this.aClass238_7.anInterface10_5 = null;
		}
		this.aBoolean603 = false;
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface2_3 = null;
		}
		if (this.aClass238_8 != null) {
			this.aClass238_8.anInterface10_5 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "()I")
	@Override
	public int B() {
		if (!this.aBoolean603) {
			this.method4169();
		}
		return this.aShort84;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(SIBII)I")
	private int method4171(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = Static160.anIntArray183[Static339.method4539(arg1, arg3)];
		if (arg0 != -1) {
			@Pc(31) Class114 local31 = this.aClass34_Sub2_27.anInterface6_8.method3937(arg0 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte29 & 0xFF;
			@Pc(45) int local45;
			@Pc(69) int local69;
			if (local36 != 0) {
				if (arg3 < 0) {
					local45 = 0;
				} else if (arg3 <= 127) {
					local45 = arg3 * 131586;
				} else {
					local45 = 16777215;
				}
				if (local36 == 256) {
					local12 = local45;
				} else {
					local69 = 256 - local36;
					local12 = ((local12 & 0xFF00) * local69 + (local45 & 0xFF00) * local36 & 0xFF0000) + (local69 * (local12 & 0xFF00FF) + local36 * (local45 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local45 = local31.aByte25 & 0xFF;
			if (local45 != 0) {
				local45 += 256;
				@Pc(119) int local119 = local45 * (local12 >> 16 & 0xFF);
				if (local119 > 65535) {
					local119 = 65535;
				}
				local69 = (local12 >> 8 & 0xFF) * local45;
				if (local69 > 65535) {
					local69 = 65535;
				}
				@Pc(147) int local147 = local45 * (local12 & 0xFF);
				if (local147 > 65535) {
					local147 = 65535;
				}
				local12 = (local69 & 0xFF00) + ((local119 & 0x5800FF00) << 8) + (local147 >> 8);
			}
		}
		return (local12 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5312; local7++) {
			if (arg0 != 0) {
				this.anIntArray351[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray349[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray353[local7] += arg2;
			}
		}
		if (this.aClass238_8 != null) {
			this.aClass238_8.anInterface10_5 = null;
		}
		this.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	private void method4172() {
		if (this.aClass35Array1 == null) {
			return;
		}
		@Pc(18) Class32_Sub2 local18 = this.aClass34_Sub2_27.aClass32_Sub2_2;
		@Pc(22) float local22 = this.aClass34_Sub2_27.aa();
		@Pc(26) float local26 = this.aClass34_Sub2_27.T();
		this.aClass34_Sub2_27.method5494();
		this.aClass34_Sub2_27.method5745(false);
		this.aClass34_Sub2_27.method5487(false);
		this.aClass34_Sub2_27.method5550(this.aClass34_Sub2_27.aClass238_13, this.aClass34_Sub2_27.aClass238_14, null, null);
		for (@Pc(55) int local55 = 0; local55 < this.anInt5306; local55++) {
			@Pc(62) Class35 local62 = this.aClass35Array1[local55];
			@Pc(67) Class94 local67 = this.aClass94Array1[local55];
			if (!local62.aBoolean91 || !this.aClass34_Sub2_27.method5734()) {
				@Pc(96) float local96 = (float) (this.anIntArray351[local62.anInt812] + this.anIntArray351[local62.anInt811] + this.anIntArray351[local62.anInt809]) * 0.3333333F;
				@Pc(117) float local117 = (float) (this.anIntArray349[local62.anInt809] + this.anIntArray349[local62.anInt811] + this.anIntArray349[local62.anInt812]) * 0.3333333F;
				@Pc(139) float local139 = (float) (this.anIntArray353[local62.anInt812] + this.anIntArray353[local62.anInt811] + this.anIntArray353[local62.anInt809]) * 0.3333333F;
				@Pc(153) float local153 = Static61.aFloat17 + local117 * Static4.aFloat4 + Static331.aFloat67 * local96 + local139 * Static151.aFloat30;
				@Pc(167) float local167 = Static398.aFloat40 + local117 * Static346.aFloat69 + local96 * Static81.aFloat18 + Static166.aFloat32 * local139;
				@Pc(181) float local181 = Static452.aFloat108 * local139 + local96 * Static348.aFloat71 + Static132.aFloat26 * local117 + Static304.aFloat66;
				local18.method3235(-local181, local62.aShort13 * local67.anInt2391 >> 7, (float) local67.anInt2385 - local167, local153 + (float) local67.anInt2393, local67.anInt2396, local62.aShort14 * local67.anInt2392 >> 7);
				this.aClass34_Sub2_27.method5500(local18);
				this.aClass34_Sub2_27.da(local26, local22 - (float) local62.anInt810 * 1.5F);
				@Pc(233) int local233 = local67.anInt2394;
				OpenGL.glColor4ub((byte) (local233 >> 16), (byte) (local233 >> 8), (byte) local233, (byte) (local233 >> 24));
				this.aClass34_Sub2_27.method5556(local62.aShort15);
				this.aClass34_Sub2_27.method5536(local62.aByte7);
				this.aClass34_Sub2_27.method5517(local62.aByte6);
				this.aClass34_Sub2_27.method5552(4);
			}
		}
		this.aClass34_Sub2_27.da(local26, local22);
		this.aClass34_Sub2_27.method5745(true);
		this.aClass34_Sub2_27.method5558();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!c;Lclient!ut;II)V")
	@Override
	public void method5967(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5277 == 0) {
			return;
		}
		@Pc(16) Class32_Sub2 local16 = this.aClass34_Sub2_27.aClass32_Sub2_4;
		@Pc(19) Class32_Sub2 local19 = (Class32_Sub2) arg0;
		if (!this.aBoolean603) {
			this.method4169();
		}
		Static132.aFloat26 = local19.aFloat53 * local16.aFloat46 + local16.aFloat56 * local19.aFloat52 + local16.aFloat47 * local19.aFloat46;
		Static304.aFloat66 = local16.aFloat47 * local19.aFloat51 + local16.aFloat46 * local19.aFloat55 + local16.aFloat56 * local19.aFloat48 + local16.aFloat51;
		@Pc(72) float local72 = Static132.aFloat26 * (float) this.aShort84 + Static304.aFloat66;
		@Pc(80) float local80 = Static304.aFloat66 + Static132.aFloat26 * (float) this.aShort88;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.aShort85 + local72;
			local97 = local80 - (float) this.aShort85;
		} else {
			local90 = local80 + (float) this.aShort85;
			local97 = (float) -this.aShort85 + local72;
		}
		if (this.aClass34_Sub2_27.aFloat89 <= local97 || (float) this.aClass34_Sub2_27.anInt7099 >= local90) {
			return;
		}
		Static61.aFloat17 = local16.aFloat48 + local16.aFloat54 * local19.aFloat48 + local19.aFloat55 * local16.aFloat52 + local16.aFloat50 * local19.aFloat51;
		Static4.aFloat4 = local16.aFloat54 * local19.aFloat52 + local19.aFloat53 * local16.aFloat52 + local16.aFloat50 * local19.aFloat46;
		@Pc(173) float local173 = (float) this.aShort84 * Static4.aFloat4 + Static61.aFloat17;
		@Pc(181) float local181 = Static61.aFloat17 + (float) this.aShort88 * Static4.aFloat4;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local173 > local181) {
			local196 = (float) this.aClass34_Sub2_27.anInt7105 * (local181 - (float) this.aShort85);
			local207 = ((float) this.aShort85 + local173) * (float) this.aClass34_Sub2_27.anInt7105;
		} else {
			local207 = (float) this.aClass34_Sub2_27.anInt7105 * ((float) this.aShort85 + local181);
			local196 = (float) this.aClass34_Sub2_27.anInt7105 * ((float) -this.aShort85 + local173);
		}
		if (local196 / (float) arg2 >= this.aClass34_Sub2_27.aFloat99 || local207 / (float) arg2 <= this.aClass34_Sub2_27.aFloat98) {
			return;
		}
		Static346.aFloat69 = local19.aFloat53 * local16.aFloat53 + local16.aFloat45 * local19.aFloat52 + local16.aFloat49 * local19.aFloat46;
		Static398.aFloat40 = local16.aFloat55 + local19.aFloat51 * local16.aFloat49 + local19.aFloat55 * local16.aFloat53 + local16.aFloat45 * local19.aFloat48;
		@Pc(299) float local299 = Static346.aFloat69 * (float) this.aShort84 + Static398.aFloat40;
		@Pc(307) float local307 = Static398.aFloat40 + Static346.aFloat69 * (float) this.aShort88;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local307 < local299) {
			local322 = (local307 - (float) this.aShort85) * (float) this.aClass34_Sub2_27.anInt7096;
			local333 = (float) this.aClass34_Sub2_27.anInt7096 * ((float) this.aShort85 + local299);
		} else {
			local322 = (local299 - (float) this.aShort85) * (float) this.aClass34_Sub2_27.anInt7096;
			local333 = ((float) this.aShort85 + local307) * (float) this.aClass34_Sub2_27.anInt7096;
		}
		if (local322 / (float) arg2 >= this.aClass34_Sub2_27.aFloat100 || local333 / (float) arg2 <= this.aClass34_Sub2_27.aFloat88) {
			return;
		}
		if (arg1 != null || this.aClass35Array1 != null) {
			Static81.aFloat18 = local16.aFloat45 * local19.aFloat54 + local16.aFloat53 * local19.aFloat45 + local16.aFloat49 * local19.aFloat56;
			Static166.aFloat32 = local16.aFloat45 * local19.aFloat50 + local16.aFloat53 * local19.aFloat49 + local16.aFloat49 * local19.aFloat47;
			Static348.aFloat71 = local19.aFloat56 * local16.aFloat47 + local16.aFloat56 * local19.aFloat54 + local19.aFloat45 * local16.aFloat46;
			Static331.aFloat67 = local16.aFloat52 * local19.aFloat45 + local19.aFloat54 * local16.aFloat54 + local16.aFloat50 * local19.aFloat56;
			Static452.aFloat108 = local16.aFloat46 * local19.aFloat49 + local16.aFloat56 * local19.aFloat50 + local19.aFloat47 * local16.aFloat47;
			Static151.aFloat30 = local19.aFloat50 * local16.aFloat54 + local16.aFloat52 * local19.aFloat49 + local16.aFloat50 * local19.aFloat47;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.aShort86 + this.aShort83 >> 1;
			@Pc(508) int local508 = this.aShort91 + this.aShort90 >> 1;
			@Pc(527) int local527 = (int) (Static4.aFloat4 * (float) this.aShort84 + (float) local500 * Static331.aFloat67 + Static61.aFloat17 + Static151.aFloat30 * (float) local508);
			@Pc(546) int local546 = (int) ((float) local508 * Static166.aFloat32 + (float) local500 * Static81.aFloat18 + Static398.aFloat40 + (float) this.aShort84 * Static346.aFloat69);
			@Pc(565) int local565 = (int) (Static132.aFloat26 * (float) this.aShort84 + Static348.aFloat71 * (float) local500 + Static304.aFloat66 + Static452.aFloat108 * (float) local508);
			@Pc(584) int local584 = (int) ((float) this.aShort88 * Static4.aFloat4 + Static331.aFloat67 * (float) local500 + Static61.aFloat17 + (float) local508 * Static151.aFloat30);
			@Pc(603) int local603 = (int) ((float) local508 * Static166.aFloat32 + Static398.aFloat40 + (float) local500 * Static81.aFloat18 + (float) this.aShort88 * Static346.aFloat69);
			arg1.anInt7125 = local584 * this.aClass34_Sub2_27.anInt7105 / arg2 + this.aClass34_Sub2_27.anInt7112;
			arg1.anInt7128 = local527 * this.aClass34_Sub2_27.anInt7105 / arg2 + this.aClass34_Sub2_27.anInt7112;
			@Pc(648) int local648 = (int) (Static132.aFloat26 * (float) this.aShort88 + (float) local500 * Static348.aFloat71 + Static304.aFloat66 + Static452.aFloat108 * (float) local508);
			arg1.anInt7129 = local603 * this.aClass34_Sub2_27.anInt7096 / arg2 + this.aClass34_Sub2_27.anInt7091;
			arg1.anInt7127 = local546 * this.aClass34_Sub2_27.anInt7096 / arg2 + this.aClass34_Sub2_27.anInt7091;
			if (this.aClass34_Sub2_27.anInt7099 > local565 && local648 < this.aClass34_Sub2_27.anInt7099) {
				arg1.aBoolean779 = true;
				arg1.anInt7126 = (local527 + this.aShort85) * this.aClass34_Sub2_27.anInt7105 / arg2 + this.aClass34_Sub2_27.anInt7112 - arg1.anInt7128;
			}
		}
		this.aClass34_Sub2_27.method5551((float) arg2);
		this.aClass34_Sub2_27.method5505();
		this.aClass34_Sub2_27.method5484(local19);
		this.method4167();
		this.aClass34_Sub2_27.method5558();
		this.method4172();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BIZ)Lclient!e;")
	@Override
	public Class57 method5966(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(34) Class57_Sub2 local34;
		@Pc(33) Class57_Sub2 local33;
		if (arg0 == 1) {
			local33 = this.aClass34_Sub2_27.aClass57_Sub2_6;
			local34 = this.aClass34_Sub2_27.aClass57_Sub2_10;
		} else if (arg0 == 2) {
			local34 = this.aClass34_Sub2_27.aClass57_Sub2_1;
			local33 = this.aClass34_Sub2_27.aClass57_Sub2_3;
		} else if (arg0 == 3) {
			local33 = this.aClass34_Sub2_27.aClass57_Sub2_8;
			local34 = this.aClass34_Sub2_27.aClass57_Sub2_2;
		} else if (arg0 == 4) {
			local34 = this.aClass34_Sub2_27.aClass57_Sub2_7;
			local33 = this.aClass34_Sub2_27.aClass57_Sub2_4;
		} else if (arg0 == 5) {
			local33 = this.aClass34_Sub2_27.aClass57_Sub2_5;
			local34 = this.aClass34_Sub2_27.aClass57_Sub2_9;
		} else {
			local34 = local33 = new Class57_Sub2(this.aClass34_Sub2_27);
		}
		return this.method4173(arg1, arg0 != 0, arg2, local34, local33);
	}

	@OriginalMember(owner = "client!pg", name = "S", descriptor = "()I")
	@Override
	public int S() {
		if (!this.aBoolean603) {
			this.method4169();
		}
		return this.aShort91;
	}

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg0];
		@Pc(13) int local13 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5312; local15++) {
			local33 = local13 * this.anIntArray351[local15] + this.anIntArray353[local15] * local9 >> 15;
			this.anIntArray353[local15] = this.anIntArray353[local15] * local13 - this.anIntArray351[local15] * local9 >> 15;
			this.anIntArray351[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5277; local33++) {
			@Pc(88) int local88 = local9 * this.aShortArray76[local33] + this.aShortArray77[local33] * local13 >> 15;
			this.aShortArray76[local33] = (short) (local13 * this.aShortArray76[local33] - this.aShortArray77[local33] * local9 >> 15);
			this.aShortArray77[local33] = (short) local88;
		}
		if (this.aClass238_7 == null && this.aClass238_6 != null) {
			this.aClass238_6.anInterface10_5 = null;
		}
		if (this.aClass238_7 != null) {
			this.aClass238_7.anInterface10_5 = null;
		}
		if (this.aClass238_8 != null) {
			this.aClass238_8.anInterface10_5 = null;
		}
		this.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZZLclient!pg;ILclient!pg;)Lclient!e;")
	private Class57 method4173(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class57_Sub2 arg3, @OriginalArg(5) Class57_Sub2 arg4) {
		arg3.aShort87 = this.aShort87;
		arg3.anInt5312 = this.anInt5312;
		arg3.anInt5326 = arg0;
		arg3.anInt5277 = this.anInt5277;
		arg3.aByte87 = 0;
		arg3.anInt5306 = this.anInt5306;
		arg3.aShort89 = this.aShort89;
		arg3.anInt5325 = this.anInt5325;
		arg3.anInt5307 = this.anInt5307;
		arg3.anInt5330 = this.anInt5330;
		arg3.anInt5279 = this.anInt5279;
		@Pc(59) boolean local59 = Static114.method1810(this.anInt5325, arg0);
		@Pc(65) boolean local65 = Static10.method142(arg0, this.anInt5325);
		@Pc(71) boolean local71 = Static16.method248(arg0, this.anInt5325);
		@Pc(77) boolean local77 = local71 | local59 | local65;
		@Pc(174) int local174;
		if (local77) {
			if (!local59) {
				arg3.anIntArray351 = this.anIntArray351;
			} else if (arg4.anIntArray351 == null || this.anInt5279 > arg4.anIntArray351.length) {
				arg3.anIntArray351 = arg4.anIntArray351 = new int[this.anInt5279];
			} else {
				arg3.anIntArray351 = arg4.anIntArray351;
			}
			if (!local65) {
				arg3.anIntArray349 = this.anIntArray349;
			} else if (arg4.anIntArray349 == null || arg4.anIntArray349.length < this.anInt5279) {
				arg3.anIntArray349 = arg4.anIntArray349 = new int[this.anInt5279];
			} else {
				arg3.anIntArray349 = arg4.anIntArray349;
			}
			if (!local71) {
				arg3.anIntArray353 = this.anIntArray353;
			} else if (arg4.anIntArray353 == null || arg4.anIntArray353.length < this.anInt5279) {
				arg3.anIntArray353 = arg4.anIntArray353 = new int[this.anInt5279];
			} else {
				arg3.anIntArray353 = arg4.anIntArray353;
			}
			for (local174 = 0; local174 < this.anInt5279; local174++) {
				if (local59) {
					arg3.anIntArray351[local174] = this.anIntArray351[local174];
				}
				if (local65) {
					arg3.anIntArray349[local174] = this.anIntArray349[local174];
				}
				if (local71) {
					arg3.anIntArray353[local174] = this.anIntArray353[local174];
				}
			}
		} else {
			arg3.anIntArray349 = this.anIntArray349;
			arg3.anIntArray351 = this.anIntArray351;
			arg3.anIntArray353 = this.anIntArray353;
		}
		if (Static384.method5033(arg0, this.anInt5325)) {
			arg3.aClass238_8 = arg4.aClass238_8;
			if (arg1) {
				arg3.aByte87 = (byte) (arg3.aByte87 | 0x1);
			}
			arg3.aClass238_8.anInterface10_5 = this.aClass238_8.anInterface10_5;
			arg3.aClass238_8.aByte101 = this.aClass238_8.aByte101;
		} else if (Static352.method4760(this.anInt5325, arg0)) {
			arg3.aClass238_8 = this.aClass238_8;
		} else {
			arg3.aClass238_8 = null;
		}
		if (Static159.method2300(arg0, this.anInt5325)) {
			if (arg4.aShortArray81 == null || arg4.aShortArray81.length < this.anInt5307) {
				arg3.aShortArray81 = arg4.aShortArray81 = new short[this.anInt5307];
			} else {
				arg3.aShortArray81 = arg4.aShortArray81;
			}
			for (local174 = 0; local174 < this.anInt5307; local174++) {
				arg3.aShortArray81[local174] = this.aShortArray81[local174];
			}
		} else {
			arg3.aShortArray81 = this.aShortArray81;
		}
		if (Static128.method2024(this.anInt5325, arg0)) {
			if (arg4.aByteArray60 == null || this.anInt5307 > arg4.aByteArray60.length) {
				arg3.aByteArray60 = arg4.aByteArray60 = new byte[this.anInt5307];
			} else {
				arg3.aByteArray60 = arg4.aByteArray60;
			}
			for (local174 = 0; local174 < this.anInt5307; local174++) {
				arg3.aByteArray60[local174] = this.aByteArray60[local174];
			}
		} else {
			arg3.aByteArray60 = this.aByteArray60;
		}
		if (Static318.method2926(arg0, this.anInt5325)) {
			if (arg1) {
				arg3.aByte87 = (byte) (arg3.aByte87 | 0x2);
			}
			arg3.aClass238_6 = arg4.aClass238_6;
			arg3.aClass238_6.aByte101 = this.aClass238_6.aByte101;
			arg3.aClass238_6.anInterface10_5 = this.aClass238_6.anInterface10_5;
		} else if (Static295.method4031(arg0, this.anInt5325)) {
			arg3.aClass238_6 = this.aClass238_6;
		} else {
			arg3.aClass238_6 = null;
		}
		@Pc(549) int local549;
		if (Static321.method4319(this.anInt5325, arg0)) {
			if (arg4.aShortArray77 == null || arg4.aShortArray77.length < this.anInt5277) {
				local174 = this.anInt5277;
				arg3.aShortArray82 = arg4.aShortArray82 = new short[local174];
				arg3.aShortArray77 = arg4.aShortArray77 = new short[local174];
				arg3.aShortArray76 = arg4.aShortArray76 = new short[local174];
			} else {
				arg3.aShortArray82 = arg4.aShortArray82;
				arg3.aShortArray77 = arg4.aShortArray77;
				arg3.aShortArray76 = arg4.aShortArray76;
			}
			if (this.aClass270_1 == null) {
				for (local174 = 0; local174 < this.anInt5277; local174++) {
					arg3.aShortArray77[local174] = this.aShortArray77[local174];
					arg3.aShortArray82[local174] = this.aShortArray82[local174];
					arg3.aShortArray76[local174] = this.aShortArray76[local174];
				}
			} else {
				if (arg4.aClass270_1 == null) {
					arg4.aClass270_1 = new Class270();
				}
				@Pc(533) Class270 local533 = arg3.aClass270_1 = arg4.aClass270_1;
				if (local533.aShortArray117 == null || this.anInt5277 > local533.aShortArray117.length) {
					local549 = this.anInt5277;
					local533.aByteArray96 = new byte[local549];
					local533.aShortArray117 = new short[local549];
					local533.aShortArray115 = new short[local549];
					local533.aShortArray116 = new short[local549];
				}
				for (local549 = 0; local549 < this.anInt5277; local549++) {
					arg3.aShortArray77[local549] = this.aShortArray77[local549];
					arg3.aShortArray82[local549] = this.aShortArray82[local549];
					arg3.aShortArray76[local549] = this.aShortArray76[local549];
					local533.aShortArray117[local549] = this.aClass270_1.aShortArray117[local549];
					local533.aShortArray115[local549] = this.aClass270_1.aShortArray115[local549];
					local533.aShortArray116[local549] = this.aClass270_1.aShortArray116[local549];
					local533.aByteArray96[local549] = this.aClass270_1.aByteArray96[local549];
				}
			}
			arg3.aByteArray61 = this.aByteArray61;
		} else {
			arg3.aShortArray76 = this.aShortArray76;
			arg3.aByteArray61 = this.aByteArray61;
			arg3.aShortArray77 = this.aShortArray77;
			arg3.aShortArray82 = this.aShortArray82;
			arg3.aClass270_1 = this.aClass270_1;
		}
		if (Static280.method3889(this.anInt5325, arg0)) {
			arg3.aClass238_7 = arg4.aClass238_7;
			if (arg1) {
				arg3.aByte87 = (byte) (arg3.aByte87 | 0x4);
			}
			arg3.aClass238_7.aByte101 = this.aClass238_7.aByte101;
			arg3.aClass238_7.anInterface10_5 = this.aClass238_7.anInterface10_5;
		} else if (Static378.method2423(this.anInt5325, arg0)) {
			arg3.aClass238_7 = this.aClass238_7;
		} else {
			arg3.aClass238_7 = null;
		}
		if (Static120.method1916(this.anInt5325, arg0)) {
			if (arg4.aFloatArray25 == null || arg4.aFloatArray25.length < this.anInt5307) {
				local174 = this.anInt5277;
				arg3.aFloatArray25 = arg4.aFloatArray25 = new float[local174];
				arg3.aFloatArray24 = arg4.aFloatArray24 = new float[local174];
			} else {
				arg3.aFloatArray25 = arg4.aFloatArray25;
				arg3.aFloatArray24 = arg4.aFloatArray24;
			}
			for (local174 = 0; local174 < this.anInt5277; local174++) {
				arg3.aFloatArray25[local174] = this.aFloatArray25[local174];
				arg3.aFloatArray24[local174] = this.aFloatArray24[local174];
			}
		} else {
			arg3.aFloatArray24 = this.aFloatArray24;
			arg3.aFloatArray25 = this.aFloatArray25;
		}
		if (Static374.method4953(this.anInt5325, arg0)) {
			arg3.aClass238_9 = arg4.aClass238_9;
			if (arg1) {
				arg3.aByte87 = (byte) (arg3.aByte87 | 0x8);
			}
			arg3.aClass238_9.aByte101 = this.aClass238_9.aByte101;
			arg3.aClass238_9.anInterface10_5 = this.aClass238_9.anInterface10_5;
		} else if (Static50.method826(arg0, this.anInt5325)) {
			arg3.aClass238_9 = this.aClass238_9;
		} else {
			arg3.aClass238_9 = null;
		}
		if (Static134.method2066(this.anInt5325, arg0)) {
			if (arg4.aShortArray85 == null || arg4.aShortArray85.length < this.anInt5307) {
				local174 = this.anInt5307;
				arg3.aShortArray83 = arg4.aShortArray83 = new short[local174];
				arg3.aShortArray86 = arg4.aShortArray86 = new short[local174];
				arg3.aShortArray85 = arg4.aShortArray85 = new short[local174];
			} else {
				arg3.aShortArray83 = arg4.aShortArray83;
				arg3.aShortArray85 = arg4.aShortArray85;
				arg3.aShortArray86 = arg4.aShortArray86;
			}
			for (local174 = 0; local174 < this.anInt5307; local174++) {
				arg3.aShortArray85[local174] = this.aShortArray85[local174];
				arg3.aShortArray83[local174] = this.aShortArray83[local174];
				arg3.aShortArray86[local174] = this.aShortArray86[local174];
			}
		} else {
			arg3.aShortArray83 = this.aShortArray83;
			arg3.aShortArray85 = this.aShortArray85;
			arg3.aShortArray86 = this.aShortArray86;
		}
		if (Static403.method5239(this.anInt5325, arg0)) {
			if (arg1) {
				arg3.aByte87 = (byte) (arg3.aByte87 | 0x10);
			}
			arg3.aClass172_1 = arg4.aClass172_1;
			arg3.aClass172_1.anInterface2_3 = this.aClass172_1.anInterface2_3;
		} else if (Static328.method4414(arg0, this.anInt5325)) {
			arg3.aClass172_1 = this.aClass172_1;
		} else {
			arg3.aClass172_1 = null;
		}
		if (Static18.method270(arg0, this.anInt5325)) {
			if (arg4.aShortArray79 == null || this.anInt5307 > arg4.aShortArray79.length) {
				local174 = this.anInt5307;
				arg3.aShortArray79 = arg4.aShortArray79 = new short[local174];
			} else {
				arg3.aShortArray79 = arg4.aShortArray79;
			}
			for (local174 = 0; local174 < this.anInt5307; local174++) {
				arg3.aShortArray79[local174] = this.aShortArray79[local174];
			}
		} else {
			arg3.aShortArray79 = this.aShortArray79;
		}
		if (!Static328.method4415(arg0, this.anInt5325)) {
			arg3.aClass94Array1 = this.aClass94Array1;
		} else if (arg4.aClass94Array1 == null || arg4.aClass94Array1.length < this.anInt5306) {
			local174 = this.anInt5306;
			arg3.aClass94Array1 = arg4.aClass94Array1 = new Class94[local174];
			for (local549 = 0; local549 < this.anInt5306; local549++) {
				arg3.aClass94Array1[local549] = this.aClass94Array1[local549].method2049();
			}
		} else {
			arg3.aClass94Array1 = arg4.aClass94Array1;
			for (local174 = 0; local174 < this.anInt5306; local174++) {
				arg3.aClass94Array1[local174].method2054(this.aClass94Array1[local174]);
			}
		}
		arg3.aShortArray84 = this.aShortArray84;
		arg3.anIntArrayArray47 = this.anIntArrayArray47;
		arg3.aShortArray78 = this.aShortArray78;
		arg3.aClass229Array2 = this.aClass229Array2;
		arg3.anIntArray352 = this.anIntArray352;
		arg3.aClass181Array2 = this.aClass181Array2;
		arg3.anIntArray350 = this.anIntArray350;
		arg3.anIntArrayArray46 = this.anIntArrayArray46;
		arg3.aShortArray80 = this.aShortArray80;
		arg3.aClass35Array1 = this.aClass35Array1;
		arg3.anIntArrayArray48 = this.anIntArrayArray48;
		if (this.aBoolean603) {
			arg3.aShort85 = this.aShort85;
			arg3.aShort90 = this.aShort90;
			arg3.aShort83 = this.aShort83;
			arg3.aShort88 = this.aShort88;
			arg3.aShort84 = this.aShort84;
			arg3.aShort86 = this.aShort86;
			arg3.aShort91 = this.aShort91;
			arg3.aBoolean603 = true;
		} else {
			arg3.aBoolean603 = false;
		}
		return arg3;
	}

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "()Z")
	@Override
	protected boolean h() {
		if (this.anIntArrayArray47 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5279; local12++) {
			this.anIntArray351[local12] <<= 0x4;
			this.anIntArray349[local12] <<= 0x4;
			this.anIntArray353[local12] <<= 0x4;
		}
		Static387.anInt6433 = 0;
		Static404.anInt6699 = 0;
		Static226.anInt4015 = 0;
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "aa", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static387.anInt6433 = 0;
			Static404.anInt6699 = 0;
			local28 = 0;
			Static226.anInt4015 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray47.length) {
					local48 = this.anIntArrayArray47[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray78 == null || (arg6 & this.aShortArray78[local56]) != 0) {
							Static387.anInt6433 += this.anIntArray351[local56];
							Static226.anInt4015 += this.anIntArray349[local56];
							local28++;
							Static404.anInt6699 += this.anIntArray353[local56];
						}
					}
				}
			}
			if (local28 <= 0) {
				Static387.anInt6433 = arg2;
				Static404.anInt6699 = arg4;
				Static226.anInt4015 = arg3;
			} else {
				Static387.anInt6433 = arg2 + Static387.anInt6433 / local28;
				Static145.aBoolean234 = true;
				Static226.anInt4015 = Static226.anInt4015 / local28 + arg3;
				Static404.anInt6699 = Static404.anInt6699 / local28 + arg4;
			}
			return;
		}
		@Pc(248) int[] local248;
		@Pc(250) int local250;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg7[1] * arg3 + arg7[0] * arg2 + arg4 * arg7[2] + 16384 >> 15;
				local32 = arg2 * arg7[3] + arg3 * arg7[4] + arg4 * arg7[5] + 16384 >> 15;
				local38 = arg7[7] * arg3 + arg7[6] * arg2 + arg4 * arg7[8] + 16384 >> 15;
				arg3 = local32;
				arg4 = local38;
				arg2 = local28;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray47.length) {
					local248 = this.anIntArrayArray47[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local50 = local248[local250];
						if (this.aShortArray78 == null || (arg6 & this.aShortArray78[local50]) != 0) {
							this.anIntArray351[local50] += arg2;
							this.anIntArray349[local50] += arg3;
							this.anIntArray353[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(387) int local387;
		@Pc(405) int local405;
		@Pc(636) int local636;
		@Pc(645) int local645;
		@Pc(657) int local657;
		@Pc(661) int local661;
		@Pc(679) int local679;
		@Pc(1032) int local1032;
		@Pc(1040) int local1040;
		@Pc(1195) int local1195;
		@Pc(1221) int local1221;
		@Pc(1225) int local1225;
		@Pc(1233) int local1233;
		@Pc(1238) int local1238;
		@Pc(1242) int local1242;
		@Pc(1246) int local1246;
		@Pc(1248) int local1248;
		@Pc(1375) int[] local1375;
		@Pc(1377) int local1377;
		@Pc(1381) int local1381;
		@Pc(1385) int local1385;
		@Pc(1387) int local1387;
		@Pc(1519) int local1519;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray47.length > local32) {
						local248 = this.anIntArrayArray47[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local50 = local248[local250];
							if (this.aShortArray78 == null || (arg6 & this.aShortArray78[local50]) != 0) {
								this.anIntArray351[local50] -= Static387.anInt6433;
								this.anIntArray349[local50] -= Static226.anInt4015;
								this.anIntArray353[local50] -= Static404.anInt6699;
								if (arg4 != 0) {
									local56 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg4];
									local387 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg4];
									local405 = local56 * this.anIntArray349[local50] + local387 * this.anIntArray351[local50] + 32767 >> 15;
									this.anIntArray349[local50] = this.anIntArray349[local50] * local387 + 32767 - local56 * this.anIntArray351[local50] >> 15;
									this.anIntArray351[local50] = local405;
								}
								if (arg2 != 0) {
									local56 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg2];
									local387 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg2];
									local405 = this.anIntArray349[local50] * local387 + 32767 - local56 * this.anIntArray353[local50] >> 15;
									this.anIntArray353[local50] = this.anIntArray349[local50] * local56 + local387 * this.anIntArray353[local50] + 32767 >> 15;
									this.anIntArray349[local50] = local405;
								}
								if (arg3 != 0) {
									local56 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg3];
									local387 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg3];
									local405 = this.anIntArray353[local50] * local56 + local387 * this.anIntArray351[local50] + 32767 >> 15;
									this.anIntArray353[local50] = local387 * this.anIntArray353[local50] + 32767 - this.anIntArray351[local50] * local56 >> 15;
									this.anIntArray351[local50] = local405;
								}
								this.anIntArray351[local50] += Static387.anInt6433;
								this.anIntArray349[local50] += Static226.anInt4015;
								this.anIntArray353[local50] += Static404.anInt6699;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray47.length) {
							local48 = this.anIntArrayArray47[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray78 == null || (this.aShortArray78[local56] & arg6) != 0) {
									local387 = this.anIntArray352[local56];
									local405 = this.anIntArray352[local56 + 1];
									for (local636 = local387; local636 < local405; local636++) {
										local645 = this.aShortArray84[local636] - 1;
										if (local645 == -1) {
											break;
										}
										if (arg4 != 0) {
											local657 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg4];
											local661 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg4];
											local679 = local661 * this.aShortArray77[local645] + this.aShortArray82[local645] * local657 + 32767 >> 15;
											this.aShortArray82[local645] = (short) (local661 * this.aShortArray82[local645] + 32767 - this.aShortArray77[local645] * local657 >> 15);
											this.aShortArray77[local645] = (short) local679;
										}
										if (arg2 != 0) {
											local657 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg2];
											local661 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg2];
											local679 = this.aShortArray82[local645] * local661 + 32767 - local657 * this.aShortArray76[local645] >> 15;
											this.aShortArray76[local645] = (short) (local661 * this.aShortArray76[local645] + this.aShortArray82[local645] * local657 + 32767 >> 15);
											this.aShortArray82[local645] = (short) local679;
										}
										if (arg3 != 0) {
											local657 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg3];
											local661 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg3];
											local679 = this.aShortArray76[local645] * local657 + this.aShortArray77[local645] * local661 + 32767 >> 15;
											this.aShortArray76[local645] = (short) (this.aShortArray76[local645] * local661 + 32767 - this.aShortArray77[local645] * local657 >> 15);
											this.aShortArray77[local645] = (short) local679;
										}
									}
								}
							}
						}
					}
					if (this.aClass238_7 == null && this.aClass238_6 != null) {
						this.aClass238_6.anInterface10_5 = null;
					}
					if (this.aClass238_7 != null) {
						this.aClass238_7.anInterface10_5 = null;
						return;
					}
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local250 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static145.aBoolean234) {
					local387 = arg7[0] * Static387.anInt6433 + Static226.anInt4015 * arg7[3] + Static404.anInt6699 * arg7[6] + 16384 >> 15;
					local405 = arg7[7] * Static404.anInt6699 + Static226.anInt4015 * arg7[4] + Static387.anInt6433 * arg7[1] + 16384 >> 15;
					local405 += local50;
					local387 += local250;
					local636 = Static404.anInt6699 * arg7[8] + Static226.anInt4015 * arg7[5] + Static387.anInt6433 * arg7[2] + 16384 >> 15;
					Static387.anInt6433 = local387;
					local636 += local56;
					Static226.anInt4015 = local405;
					Static404.anInt6699 = local636;
					Static145.aBoolean234 = false;
				}
				@Pc(1000) int[] local1000 = new int[9];
				local405 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg2];
				local636 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg2];
				local645 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg3];
				local657 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg3];
				local661 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg4];
				local679 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg4];
				local1032 = local661 * local636 + 16384 >> 15;
				local1040 = local636 * local679 + 16384 >> 15;
				local1000[3] = local679 * local405 + 16384 >> 15;
				local1000[0] = local645 * local661 + local657 * local1040 + 16384 >> 15;
				local1000[8] = local645 * local405 + 16384 >> 15;
				local1000[2] = local657 * local405 + 16384 >> 15;
				local1000[5] = -local636;
				local1000[7] = local657 * local679 + local1032 * local645 + 16384 >> 15;
				local1000[1] = local657 * local1032 + local679 * -local645 + 16384 >> 15;
				local1000[4] = local405 * local661 + 16384 >> 15;
				local1000[6] = local661 * -local657 + local1040 * local645 + 16384 >> 15;
				@Pc(1169) int local1169 = -Static226.anInt4015 * local1000[1] + local1000[0] * -Static387.anInt6433 + local1000[2] * -Static404.anInt6699 + 16384 >> 15;
				local1195 = -Static387.anInt6433 * local1000[3] + local1000[4] * -Static226.anInt4015 + -Static404.anInt6699 * local1000[5] + 16384 >> 15;
				local1221 = -Static387.anInt6433 * local1000[6] + -Static226.anInt4015 * local1000[7] + local1000[8] * -Static404.anInt6699 + 16384 >> 15;
				local1225 = local1169 + Static387.anInt6433;
				@Pc(1229) int local1229 = Static226.anInt4015 + local1195;
				local1233 = local1221 + Static404.anInt6699;
				@Pc(1236) int[] local1236 = new int[9];
				for (local1238 = 0; local1238 < 3; local1238++) {
					for (local1242 = 0; local1242 < 3; local1242++) {
						local1246 = 0;
						for (local1248 = 0; local1248 < 3; local1248++) {
							local1246 += arg7[local1248 + local1242 * 3] * local1000[local1238 * 3 + local1248];
						}
						local1236[local1238 * 3 + local1242] = local1246 + 16384 >> 15;
					}
				}
				local1242 = local50 * local1000[1] + local250 * local1000[0] + local1000[2] * local56 + 16384 >> 15;
				local1246 = local250 * local1000[3] + local50 * local1000[4] + local56 * local1000[5] + 16384 >> 15;
				local1246 += local1229;
				local1242 += local1225;
				local1248 = local1000[8] * local56 + local1000[7] * local50 + local1000[6] * local250 + 16384 >> 15;
				local1248 += local1233;
				local1375 = new int[9];
				for (local1377 = 0; local1377 < 3; local1377++) {
					for (local1381 = 0; local1381 < 3; local1381++) {
						local1385 = 0;
						for (local1387 = 0; local1387 < 3; local1387++) {
							local1385 += arg7[local1377 * 3 + local1387] * local1236[local1381 + local1387 * 3];
						}
						local1375[local1381 + local1377 * 3] = local1385 + 16384 >> 15;
					}
				}
				local1381 = local1248 * arg7[2] + arg7[1] * local1246 + arg7[0] * local1242 + 16384 >> 15;
				local1385 = local1242 * arg7[3] + local1246 * arg7[4] + local1248 * arg7[5] + 16384 >> 15;
				local1385 += local32;
				local1387 = local1246 * arg7[7] + arg7[6] * local1242 + arg7[8] * local1248 + 16384 >> 15;
				local1381 += local28;
				local1387 += local38;
				for (local1519 = 0; local1519 < local8; local1519++) {
					@Pc(1525) int local1525 = arg1[local1519];
					if (local1525 < this.anIntArrayArray47.length) {
						@Pc(1539) int[] local1539 = this.anIntArrayArray47[local1525];
						for (@Pc(1541) int local1541 = 0; local1541 < local1539.length; local1541++) {
							@Pc(1547) int local1547 = local1539[local1541];
							if (this.aShortArray78 == null || (arg6 & this.aShortArray78[local1547]) != 0) {
								@Pc(1589) int local1589 = this.anIntArray349[local1547] * local1375[1] + this.anIntArray351[local1547] * local1375[0] + this.anIntArray353[local1547] * local1375[2] + 16384 >> 15;
								@Pc(1621) int local1621 = this.anIntArray353[local1547] * local1375[5] + this.anIntArray351[local1547] * local1375[3] + this.anIntArray349[local1547] * local1375[4] + 16384 >> 15;
								@Pc(1652) int local1652 = local1375[8] * this.anIntArray353[local1547] + this.anIntArray351[local1547] * local1375[6] + this.anIntArray349[local1547] * local1375[7] + 16384 >> 15;
								@Pc(1656) int local1656 = local1589 + local1381;
								@Pc(1660) int local1660 = local1621 + local1385;
								this.anIntArray351[local1547] = local1656;
								@Pc(1669) int local1669 = local1652 + local1387;
								this.anIntArray349[local1547] = local1660;
								this.anIntArray353[local1547] = local1669;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2602) Class35 local2602;
			@Pc(2607) Class94 local2607;
			if (arg0 == 5) {
				if (this.anIntArrayArray46 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray46.length) {
							local248 = this.anIntArrayArray46[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local50 = local248[local250];
								if (this.aShortArray80 == null || (arg6 & this.aShortArray80[local50]) != 0) {
									local56 = arg2 * 8 + (this.aByteArray60[local50] & 0xFF);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray60[local50] = (byte) local56;
									if (this.aClass238_6 != null) {
										this.aClass238_6.anInterface10_5 = null;
									}
								}
							}
						}
					}
					if (this.aClass35Array1 != null) {
						for (local32 = 0; local32 < this.anInt5306; local32++) {
							local2602 = this.aClass35Array1[local32];
							local2607 = this.aClass94Array1[local32];
							local2607.anInt2394 = local2607.anInt2394 & 0xFFFFFF | 255 - (this.aByteArray60[local2602.anInt813] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2852) Class94 local2852;
				if (arg0 == 8) {
					if (this.anIntArrayArray48 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray48.length) {
								local248 = this.anIntArrayArray48[local32];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2852 = this.aClass94Array1[local248[local250]];
									local2852.anInt2385 += arg3;
									local2852.anInt2393 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray48 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray48.length) {
								local248 = this.anIntArrayArray48[local32];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2852 = this.aClass94Array1[local248[local250]];
									local2852.anInt2391 = local2852.anInt2391 * arg3 >> 7;
									local2852.anInt2392 = local2852.anInt2392 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray48 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray48.length > local32) {
							local248 = this.anIntArrayArray48[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2852 = this.aClass94Array1[local248[local250]];
								local2852.anInt2396 = arg2 + local2852.anInt2396 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray46 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray46.length) {
						local248 = this.anIntArrayArray46[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local50 = local248[local250];
							if (this.aShortArray80 == null || (arg6 & this.aShortArray80[local50]) != 0) {
								local56 = this.aShortArray81[local50] & 0xFFFF;
								local387 = local56 >> 10 & 0x3F;
								local405 = local56 >> 7 & 0x7;
								@Pc(2703) int local2703 = local387 + arg2 & 0x3F;
								local405 += arg3 / 4;
								local636 = local56 & 0x7F;
								local636 += arg4;
								if (local405 < 0) {
									local405 = 0;
								} else if (local405 > 7) {
									local405 = 7;
								}
								if (local636 < 0) {
									local636 = 0;
								} else if (local636 > 127) {
									local636 = 127;
								}
								this.aShortArray81[local50] = (short) (local2703 << 10 | local405 << 7 | local636);
								if (this.aClass238_6 != null) {
									this.aClass238_6.anInterface10_5 = null;
								}
							}
						}
					}
				}
				if (this.aClass35Array1 != null) {
					for (local32 = 0; local32 < this.anInt5306; local32++) {
						local2602 = this.aClass35Array1[local32];
						local2607 = this.aClass94Array1[local32];
						local2607.anInt2394 = Static160.anIntArray183[this.aShortArray81[local2602.anInt813] & 0xFFFF] & 0xFFFFFF | local2607.anInt2394 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray47.length > local32) {
					local248 = this.anIntArrayArray47[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local50 = local248[local250];
						if (this.aShortArray78 == null || (this.aShortArray78[local50] & arg6) != 0) {
							this.anIntArray351[local50] -= Static387.anInt6433;
							this.anIntArray349[local50] -= Static226.anInt4015;
							this.anIntArray353[local50] -= Static404.anInt6699;
							this.anIntArray351[local50] = this.anIntArray351[local50] * arg2 >> 7;
							this.anIntArray349[local50] = this.anIntArray349[local50] * arg3 >> 7;
							this.anIntArray353[local50] = arg4 * this.anIntArray353[local50] >> 7;
							this.anIntArray351[local50] += Static387.anInt6433;
							this.anIntArray349[local50] += Static226.anInt4015;
							this.anIntArray353[local50] += Static404.anInt6699;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local250 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static145.aBoolean234) {
				local387 = arg7[3] * Static226.anInt4015 + arg7[0] * Static387.anInt6433 + arg7[6] * Static404.anInt6699 + 16384 >> 15;
				local405 = arg7[4] * Static226.anInt4015 + arg7[1] * Static387.anInt6433 + Static404.anInt6699 * arg7[7] + 16384 >> 15;
				local405 += local50;
				local636 = arg7[8] * Static404.anInt6699 + arg7[2] * Static387.anInt6433 + Static226.anInt4015 * arg7[5] + 16384 >> 15;
				local387 += local250;
				local636 += local56;
				Static226.anInt4015 = local405;
				Static387.anInt6433 = local387;
				Static404.anInt6699 = local636;
				Static145.aBoolean234 = false;
			}
			local387 = arg2 << 15 >> 7;
			local405 = arg3 << 15 >> 7;
			local636 = arg4 << 15 >> 7;
			local645 = -Static387.anInt6433 * local387 + 16384 >> 15;
			local657 = -Static226.anInt4015 * local405 + 16384 >> 15;
			local661 = local636 * -Static404.anInt6699 + 16384 >> 15;
			local679 = Static387.anInt6433 + local645;
			local1032 = Static226.anInt4015 + local657;
			local1040 = local661 + Static404.anInt6699;
			@Pc(2028) int[] local2028 = new int[] { arg7[0] * local387 + 16384 >> 15, local387 * arg7[3] + 16384 >> 15, local387 * arg7[6] + 16384 >> 15, local405 * arg7[1] + 16384 >> 15, local405 * arg7[4] + 16384 >> 15, local405 * arg7[7] + 16384 >> 15, arg7[2] * local636 + 16384 >> 15, arg7[5] * local636 + 16384 >> 15, local636 * arg7[8] + 16384 >> 15 };
			local1195 = local387 * local250 + 16384 >> 15;
			local1221 = local405 * local50 + 16384 >> 15;
			@Pc(2156) int local2156 = local1195 + local679;
			@Pc(2160) int local2160 = local1221 + local1032;
			local1225 = local56 * local636 + 16384 >> 15;
			@Pc(2172) int local2172 = local1225 + local1040;
			@Pc(2175) int[] local2175 = new int[9];
			@Pc(2181) int local2181;
			for (local1233 = 0; local1233 < 3; local1233++) {
				for (local2181 = 0; local2181 < 3; local2181++) {
					local1238 = 0;
					for (local1242 = 0; local1242 < 3; local1242++) {
						local1238 += local2028[local2181 + local1242 * 3] * arg7[local1233 * 3 + local1242];
					}
					local2175[local1233 * 3 + local2181] = local1238 + 16384 >> 15;
				}
			}
			local2181 = local2172 * arg7[2] + local2156 * arg7[0] + local2160 * arg7[1] + 16384 >> 15;
			local1238 = arg7[4] * local2160 + arg7[3] * local2156 + arg7[5] * local2172 + 16384 >> 15;
			local1242 = local2172 * arg7[8] + local2156 * arg7[6] + local2160 * arg7[7] + 16384 >> 15;
			local2181 += local28;
			local1238 += local32;
			local1242 += local38;
			for (local1246 = 0; local1246 < local8; local1246++) {
				local1248 = arg1[local1246];
				if (local1248 < this.anIntArrayArray47.length) {
					local1375 = this.anIntArrayArray47[local1248];
					for (local1377 = 0; local1377 < local1375.length; local1377++) {
						local1381 = local1375[local1377];
						if (this.aShortArray78 == null || (arg6 & this.aShortArray78[local1381]) != 0) {
							local1385 = local2175[1] * this.anIntArray349[local1381] + this.anIntArray351[local1381] * local2175[0] + local2175[2] * this.anIntArray353[local1381] + 16384 >> 15;
							local1387 = this.anIntArray353[local1381] * local2175[5] + this.anIntArray351[local1381] * local2175[3] + this.anIntArray349[local1381] * local2175[4] + 16384 >> 15;
							@Pc(2420) int local2420 = local1387 + local1238;
							local1519 = local2175[7] * this.anIntArray349[local1381] + this.anIntArray351[local1381] * local2175[6] + local2175[8] * this.anIntArray353[local1381] + 16384 >> 15;
							@Pc(2455) int local2455 = local1385 + local2181;
							@Pc(2459) int local2459 = local1519 + local1242;
							this.anIntArray351[local1381] = local2455;
							this.anIntArray349[local1381] = local2420;
							this.anIntArray353[local1381] = local2459;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIFFBIJILclient!pq;)S")
	private short method4174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class193 arg8) {
		@Pc(10) int local10 = this.anIntArray352[arg2];
		@Pc(17) int local17 = this.anIntArray352[arg2 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(29) int local29 = local10; local29 < local17; local29++) {
			@Pc(36) short local36 = this.aShortArray84[local29];
			if (local36 == 0) {
				local19 = local29;
				break;
			}
			if (Static435.aLongArray9[local29] == arg6) {
				return (short) (local36 - 1);
			}
		}
		this.aShortArray84[local19] = (short) (this.anInt5277 + 1);
		Static435.aLongArray9[local19] = arg6;
		this.aShortArray77[this.anInt5277] = (short) arg7;
		this.aShortArray82[this.anInt5277] = (short) arg1;
		this.aShortArray76[this.anInt5277] = (short) arg0;
		this.aByteArray61[this.anInt5277] = (byte) arg5;
		this.aFloatArray25[this.anInt5277] = arg4;
		this.aFloatArray24[this.anInt5277] = arg3;
		return (short) this.anInt5277++;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZB)V")
	private void method4175(@OriginalArg(0) boolean arg0) {
		if (this.aClass34_Sub2_27.aClass1_Sub28_Sub2_3.aByteArray86.length >= this.anInt5330 * 6) {
			this.aClass34_Sub2_27.aClass1_Sub28_Sub2_3.anInt6812 = 0;
		} else {
			this.aClass34_Sub2_27.aClass1_Sub28_Sub2_3 = new Class1_Sub28_Sub2((this.anInt5330 + 100) * 6);
		}
		@Pc(44) Class1_Sub28_Sub2 local44 = this.aClass34_Sub2_27.aClass1_Sub28_Sub2_3;
		@Pc(50) int local50;
		if (this.aClass34_Sub2_27.aBoolean751) {
			for (local50 = 0; local50 < this.anInt5330; local50++) {
				local44.method5393(this.aShortArray85[local50]);
				local44.method5393(this.aShortArray83[local50]);
				local44.method5393(this.aShortArray86[local50]);
			}
		} else {
			for (local50 = 0; local50 < this.anInt5330; local50++) {
				local44.method5383(this.aShortArray85[local50]);
				local44.method5383(this.aShortArray83[local50]);
				local44.method5383(this.aShortArray86[local50]);
			}
		}
		if (local44.anInt6812 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface2_4 == null) {
				this.anInterface2_4 = this.aClass34_Sub2_27.method5565(true, local44.anInt6812, local44.aByteArray86);
			} else {
				this.anInterface2_4.method3824(local44.anInt6812, local44.aByteArray86);
			}
			this.aClass172_1.anInterface2_3 = this.anInterface2_4;
		} else {
			this.aClass172_1.anInterface2_3 = this.aClass34_Sub2_27.method5565(false, local44.anInt6812, local44.aByteArray86);
		}
		if (!arg0) {
			this.aBoolean602 = true;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V")
	private void method4176(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass238_6 != null && this.aClass238_6.anInterface10_5 == null;
		@Pc(27) boolean local27 = this.aClass238_7 != null && this.aClass238_7.anInterface10_5 == null;
		@Pc(38) boolean local38 = this.aClass238_8 != null && this.aClass238_8.anInterface10_5 == null;
		@Pc(49) boolean local49 = this.aClass238_9 != null && this.aClass238_9.anInterface10_5 == null;
		if (arg0) {
			local38 &= (this.aByte87 & 0x1) != 0;
			local49 &= (this.aByte87 & 0x8) != 0;
			local27 &= (this.aByte87 & 0x4) != 0;
			local16 &= (this.aByte87 & 0x2) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		if (local38) {
			local103 = 12;
		}
		@Pc(120) byte local120 = 0;
		if (local16) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local109 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local120 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (this.aClass34_Sub2_27.aClass1_Sub28_Sub2_3.aByteArray86.length >= this.anInt5277 * local103) {
			this.aClass34_Sub2_27.aClass1_Sub28_Sub2_3.anInt6812 = 0;
		} else {
			this.aClass34_Sub2_27.aClass1_Sub28_Sub2_3 = new Class1_Sub28_Sub2((this.anInt5277 + 100) * local103);
		}
		@Pc(190) Class1_Sub28_Sub2 local190 = this.aClass34_Sub2_27.aClass1_Sub28_Sub2_3;
		@Pc(198) int local198;
		@Pc(207) int local207;
		@Pc(235) int local235;
		@Pc(244) int local244;
		if (local38) {
			@Pc(214) int local214;
			@Pc(221) int local221;
			@Pc(226) int local226;
			@Pc(233) int local233;
			if (this.aClass34_Sub2_27.aBoolean751) {
				for (local198 = 0; local198 < this.anInt5312; local198++) {
					local207 = NativeStream.floatToRawIntBits((float) this.anIntArray351[local198]);
					local214 = NativeStream.floatToRawIntBits((float) this.anIntArray349[local198]);
					local221 = NativeStream.floatToRawIntBits((float) this.anIntArray353[local198]);
					local226 = this.anIntArray352[local198];
					local233 = this.anIntArray352[local198 + 1];
					for (local235 = local226; local235 < local233; local235++) {
						local244 = this.aShortArray84[local235] - 1;
						if (local244 == -1) {
							break;
						}
						local190.anInt6812 = local103 * local244;
						local190.method5347(local207);
						local190.method5347(local214);
						local190.method5347(local221);
					}
				}
			} else {
				for (local198 = 0; local198 < this.anInt5312; local198++) {
					local207 = NativeStream.floatToRawIntBits((float) this.anIntArray351[local198]);
					local214 = NativeStream.floatToRawIntBits((float) this.anIntArray349[local198]);
					local221 = NativeStream.floatToRawIntBits((float) this.anIntArray353[local198]);
					local226 = this.anIntArray352[local198];
					local233 = this.anIntArray352[local198 + 1];
					for (local235 = local226; local235 < local233; local235++) {
						local244 = this.aShortArray84[local235] - 1;
						if (local244 == -1) {
							break;
						}
						local190.anInt6812 = local244 * local103;
						local190.method5357(local207);
						local190.method5357(local214);
						local190.method5357(local221);
					}
				}
			}
		}
		@Pc(495) float local495;
		@Pc(374) short[] local374;
		@Pc(378) short[] local378;
		@Pc(382) short[] local382;
		@Pc(386) byte[] local386;
		@Pc(533) float local533;
		if (local16) {
			if (this.aClass238_7 == null) {
				if (this.aClass270_1 == null) {
					local386 = this.aByteArray61;
					local378 = this.aShortArray82;
					local382 = this.aShortArray76;
					local374 = this.aShortArray77;
				} else {
					local374 = this.aClass270_1.aShortArray117;
					local378 = this.aClass270_1.aShortArray115;
					local382 = this.aClass270_1.aShortArray116;
					local386 = this.aClass270_1.aByteArray96;
				}
				@Pc(406) float local406 = this.aClass34_Sub2_27.aFloatArray28[0];
				@Pc(412) float local412 = this.aClass34_Sub2_27.aFloatArray28[1];
				@Pc(418) float local418 = this.aClass34_Sub2_27.aFloatArray28[2];
				@Pc(422) float local422 = this.aClass34_Sub2_27.aFloat83;
				@Pc(432) float local432 = this.aClass34_Sub2_27.aFloat95 * 768.0F / (float) this.aShort89;
				@Pc(442) float local442 = this.aClass34_Sub2_27.aFloat94 * 768.0F / (float) this.aShort89;
				for (@Pc(444) int local444 = 0; local444 < this.anInt5307; local444++) {
					@Pc(464) int local464 = this.method4171(this.aShortArray79[local444], this.aShortArray81[local444], this.aByteArray60[local444], this.aShort87);
					@Pc(473) float local473 = (float) (local464 >>> 24) * this.aClass34_Sub2_27.aFloat102;
					@Pc(484) float local484 = this.aClass34_Sub2_27.aFloat96 * (float) (local464 >> 8 & 0xFF);
					local495 = this.aClass34_Sub2_27.aFloat85 * (float) (local464 >> 16 & 0xFF);
					@Pc(500) short local500 = this.aShortArray85[local444];
					@Pc(505) short local505 = (short) local386[local500];
					if (local505 == 0) {
						local533 = (local412 * (float) local378[local500] + (float) local374[local500] * local406 + local418 * (float) local382[local500]) * 0.0026041667F;
					} else {
						local533 = ((float) local382[local500] * local418 + local406 * (float) local374[local500] + local412 * (float) local378[local500]) / (float) (local505 * 256);
					}
					@Pc(573) float local573 = local422 + (local533 < 0.0F ? local442 : local432) * local533;
					@Pc(578) int local578 = (int) (local573 * local473);
					if (local578 < 0) {
						local578 = 0;
					} else if (local578 > 255) {
						local578 = 255;
					}
					@Pc(597) int local597 = (int) (local573 * local495);
					@Pc(602) int local602 = (int) (local484 * local573);
					if (local597 < 0) {
						local597 = 0;
					} else if (local597 > 255) {
						local597 = 255;
					}
					local190.anInt6812 = local107 + local500 * local103;
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					local190.method5398(local578);
					local190.method5398(local597);
					local190.method5398(local602);
					local190.method5398(255 - (this.aByteArray60[local444] & 0xFF));
					local500 = this.aShortArray83[local444];
					local505 = local386[local500];
					if (local505 == 0) {
						local533 = ((float) local382[local500] * local418 + (float) local378[local500] * local412 + (float) local374[local500] * local406) * 0.0026041667F;
					} else {
						local533 = ((float) local374[local500] * local406 + (float) local378[local500] * local412 + (float) local382[local500] * local418) / (float) (local505 * 256);
					}
					local573 = local533 * (local533 < 0.0F ? local442 : local432) + local422;
					local578 = (int) (local473 * local573);
					local597 = (int) (local573 * local495);
					if (local578 < 0) {
						local578 = 0;
					} else if (local578 > 255) {
						local578 = 255;
					}
					if (local597 < 0) {
						local597 = 0;
					} else if (local597 > 255) {
						local597 = 255;
					}
					local602 = (int) (local573 * local484);
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					local190.anInt6812 = local107 + local103 * local500;
					local190.method5398(local578);
					local190.method5398(local597);
					local190.method5398(local602);
					local190.method5398(255 - (this.aByteArray60[local444] & 0xFF));
					local500 = this.aShortArray86[local444];
					local505 = local386[local500];
					if (local505 == 0) {
						local533 = (local418 * (float) local382[local500] + (float) local378[local500] * local412 + local406 * (float) local374[local500]) * 0.0026041667F;
					} else {
						local533 = ((float) local382[local500] * local418 + (float) local374[local500] * local406 + local412 * (float) local378[local500]) / (float) (local505 * 256);
					}
					local573 = local422 + local533 * (local533 < 0.0F ? local442 : local432);
					local578 = (int) (local573 * local473);
					local597 = (int) (local573 * local495);
					if (local578 < 0) {
						local578 = 0;
					} else if (local578 > 255) {
						local578 = 255;
					}
					if (local597 < 0) {
						local597 = 0;
					} else if (local597 > 255) {
						local597 = 255;
					}
					local602 = (int) (local484 * local573);
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					local190.anInt6812 = local103 * local500 + local107;
					local190.method5398(local578);
					local190.method5398(local597);
					local190.method5398(local602);
					local190.method5398(255 - (this.aByteArray60[local444] & 0xFF));
				}
			} else {
				for (local198 = 0; local198 < this.anInt5307; local198++) {
					local207 = this.method4171(this.aShortArray79[local198], this.aShortArray81[local198], this.aByteArray60[local198], this.aShort87);
					local190.anInt6812 = local103 * this.aShortArray85[local198] + local107;
					local190.method5347(local207);
					local190.anInt6812 = local107 + this.aShortArray83[local198] * local103;
					local190.method5347(local207);
					local190.anInt6812 = local107 + this.aShortArray86[local198] * local103;
					local190.method5347(local207);
				}
			}
		}
		if (local27) {
			if (this.aClass270_1 == null) {
				local386 = this.aByteArray61;
				local382 = this.aShortArray76;
				local374 = this.aShortArray77;
				local378 = this.aShortArray82;
			} else {
				local382 = this.aClass270_1.aShortArray116;
				local378 = this.aClass270_1.aShortArray115;
				local374 = this.aClass270_1.aShortArray117;
				local386 = this.aClass270_1.aByteArray96;
			}
			@Pc(1113) float local1113 = 3.0F / (float) this.aShort89;
			local190.anInt6812 = local109;
			local533 = 3.0F / (float) (this.aShort89 / 2 + this.aShort89);
			if (this.aClass34_Sub2_27.aBoolean751) {
				for (local235 = 0; local235 < this.anInt5277; local235++) {
					local244 = local386[local235] & 0xFF;
					if (local244 == 0) {
						local190.method5401(local533 * (float) local374[local235]);
						local190.method5401(local533 * (float) local378[local235]);
						local190.method5401(local533 * (float) local382[local235]);
					} else {
						local495 = local1113 / (float) local244;
						local190.method5401(local495 * (float) local374[local235]);
						local190.method5401(local495 * (float) local378[local235]);
						local190.method5401((float) local382[local235] * local495);
					}
					local190.anInt6812 += local103 - 12;
				}
			} else {
				for (local235 = 0; local235 < this.anInt5277; local235++) {
					local244 = local386[local235] & 0xFF;
					if (local244 == 0) {
						local190.method5400((float) local374[local235] * local533);
						local190.method5400(local533 * (float) local378[local235]);
						local190.method5400(local533 * (float) local382[local235]);
					} else {
						local495 = local1113 / (float) local244;
						local190.method5400(local495 * (float) local374[local235]);
						local190.method5400((float) local378[local235] * local495);
						local190.method5400((float) local382[local235] * local495);
					}
					local190.anInt6812 += local103 - 12;
				}
			}
		}
		if (local49) {
			local190.anInt6812 = local120;
			if (this.aClass34_Sub2_27.aBoolean751) {
				for (local198 = 0; local198 < this.anInt5277; local198++) {
					local190.method5401(this.aFloatArray25[local198]);
					local190.method5401(this.aFloatArray24[local198]);
					local190.anInt6812 += local103 - 8;
				}
			} else {
				for (local198 = 0; local198 < this.anInt5277; local198++) {
					local190.method5400(this.aFloatArray25[local198]);
					local190.method5400(this.aFloatArray24[local198]);
					local190.anInt6812 += local103 - 8;
				}
			}
		}
		local190.anInt6812 = local103 * this.anInt5277;
		@Pc(1405) Interface10 local1405;
		if (arg0) {
			if (this.anInterface10_3 == null) {
				this.anInterface10_3 = this.aClass34_Sub2_27.method5564(local190.aByteArray86, local190.anInt6812, true, local103);
			} else {
				this.anInterface10_3.method5245(local190.aByteArray86, local103, local190.anInt6812);
			}
			this.aByte87 = 0;
			local1405 = this.anInterface10_3;
		} else {
			local1405 = this.aClass34_Sub2_27.method5564(local190.aByteArray86, local190.anInt6812, false, local103);
			this.aBoolean602 = true;
		}
		if (local38) {
			this.aClass238_8.anInterface10_5 = local1405;
			this.aClass238_8.aByte101 = 0;
		}
		if (local49) {
			this.aClass238_9.anInterface10_5 = local1405;
			this.aClass238_9.aByte101 = local120;
		}
		if (local16) {
			this.aClass238_6.anInterface10_5 = local1405;
			this.aClass238_6.aByte101 = local107;
		}
		if (local27) {
			this.aClass238_7.aByte101 = local109;
			this.aClass238_7.anInterface10_5 = local1405;
		}
	}

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "(SS)V")
	@Override
	public void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5307; local7++) {
			if (this.aShortArray81[local7] == arg0) {
				this.aShortArray81[local7] = arg1;
			}
		}
		if (this.aClass35Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt5306; local34++) {
				@Pc(41) Class35 local41 = this.aClass35Array1[local34];
				@Pc(46) Class94 local46 = this.aClass94Array1[local34];
				local46.anInt2394 = Static160.anIntArray183[this.aShortArray81[local41.anInt813] & 0xFFFF] & 0xFFFFFF | local46.anInt2394 & 0xFF000000;
			}
		}
		if (this.aClass238_6 != null) {
			this.aClass238_6.anInterface10_5 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5307; local3++) {
			local12 = this.aShortArray81[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			@Pc(41) int local41 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 -= -(arg3 * (arg1 - local24) >> 7);
			}
			if (arg2 != -1) {
				local41 -= -(arg3 * (arg2 - local41) >> 7);
			}
			this.aShortArray81[local3] = (short) (local41 | local24 << 7 | local18 << 10);
		}
		if (this.aClass35Array1 != null) {
			for (local12 = 0; local12 < this.anInt5306; local12++) {
				@Pc(111) Class35 local111 = this.aClass35Array1[local12];
				@Pc(116) Class94 local116 = this.aClass94Array1[local12];
				local116.anInt2394 = Static160.anIntArray183[this.aShortArray81[local111.anInt813] & 0xFFFF] & 0xFFFFFF | local116.anInt2394 & 0xFF000000;
			}
		}
		if (this.aClass238_6 != null) {
			this.aClass238_6.anInterface10_5 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!ku;)V")
	private void method4177(@OriginalArg(1) Class32_Sub2 arg0) {
		@Pc(17) int local17;
		if (this.aClass229Array2 != null) {
			for (local17 = 0; local17 < this.aClass229Array2.length; local17++) {
				@Pc(24) Class229 local24 = this.aClass229Array2[local17];
				@Pc(26) Class229 local26 = local24;
				if (local24.aClass229_2 != null) {
					local26 = local24.aClass229_2;
				}
				local26.anInt6343 = (int) (arg0.aFloat48 + arg0.aFloat54 * (float) this.anIntArray351[local24.anInt6353] + arg0.aFloat52 * (float) this.anIntArray349[local24.anInt6353] + arg0.aFloat50 * (float) this.anIntArray353[local24.anInt6353]);
				local26.anInt6350 = (int) ((float) this.anIntArray353[local24.anInt6353] * arg0.aFloat49 + (float) this.anIntArray349[local24.anInt6353] * arg0.aFloat53 + arg0.aFloat45 * (float) this.anIntArray351[local24.anInt6353] + arg0.aFloat55);
				local26.anInt6340 = (int) ((float) this.anIntArray353[local24.anInt6353] * arg0.aFloat47 + (float) this.anIntArray351[local24.anInt6353] * arg0.aFloat56 + (float) this.anIntArray349[local24.anInt6353] * arg0.aFloat46 + arg0.aFloat51);
				local26.anInt6341 = (int) (arg0.aFloat48 + arg0.aFloat52 * (float) this.anIntArray349[local24.anInt6352] + arg0.aFloat54 * (float) this.anIntArray351[local24.anInt6352] + (float) this.anIntArray353[local24.anInt6352] * arg0.aFloat50);
				local26.anInt6355 = (int) ((float) this.anIntArray353[local24.anInt6352] * arg0.aFloat49 + (float) this.anIntArray349[local24.anInt6352] * arg0.aFloat53 + (float) this.anIntArray351[local24.anInt6352] * arg0.aFloat45 + arg0.aFloat55);
				local26.anInt6342 = (int) (arg0.aFloat51 + arg0.aFloat46 * (float) this.anIntArray349[local24.anInt6352] + (float) this.anIntArray351[local24.anInt6352] * arg0.aFloat56 + arg0.aFloat47 * (float) this.anIntArray353[local24.anInt6352]);
				local26.anInt6357 = (int) (arg0.aFloat52 * (float) this.anIntArray349[local24.anInt6347] + (float) this.anIntArray351[local24.anInt6347] * arg0.aFloat54 + (float) this.anIntArray353[local24.anInt6347] * arg0.aFloat50 + arg0.aFloat48);
				local26.anInt6345 = (int) (arg0.aFloat55 + (float) this.anIntArray353[local24.anInt6347] * arg0.aFloat49 + (float) this.anIntArray349[local24.anInt6347] * arg0.aFloat53 + (float) this.anIntArray351[local24.anInt6347] * arg0.aFloat45);
				local26.anInt6348 = (int) (arg0.aFloat46 * (float) this.anIntArray349[local24.anInt6347] + (float) this.anIntArray351[local24.anInt6347] * arg0.aFloat56 + (float) this.anIntArray353[local24.anInt6347] * arg0.aFloat47 + arg0.aFloat51);
			}
		}
		if (this.aClass181Array2 == null) {
			return;
		}
		for (local17 = 0; local17 < this.aClass181Array2.length; local17++) {
			@Pc(369) Class181 local369 = this.aClass181Array2[local17];
			@Pc(371) Class181 local371 = local369;
			if (local369.aClass181_2 != null) {
				local371 = local369.aClass181_2;
			}
			if (local369.aClass32_8 == null) {
				local369.aClass32_8 = arg0.method4315();
			} else {
				local369.aClass32_8.ha(arg0);
			}
			local371.anInt5144 = (int) (arg0.aFloat50 * (float) this.anIntArray353[local369.anInt5139] + (float) this.anIntArray351[local369.anInt5139] * arg0.aFloat54 + arg0.aFloat52 * (float) this.anIntArray349[local369.anInt5139] + arg0.aFloat48);
			local371.anInt5141 = (int) (arg0.aFloat55 + arg0.aFloat49 * (float) this.anIntArray353[local369.anInt5139] + arg0.aFloat53 * (float) this.anIntArray349[local369.anInt5139] + arg0.aFloat45 * (float) this.anIntArray351[local369.anInt5139]);
			local371.anInt5136 = (int) (arg0.aFloat51 + (float) this.anIntArray351[local369.anInt5139] * arg0.aFloat56 + arg0.aFloat46 * (float) this.anIntArray349[local369.anInt5139] + (float) this.anIntArray353[local369.anInt5139] * arg0.aFloat47);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	private void method4178() {
		if (!this.aBoolean602) {
			return;
		}
		this.aBoolean602 = false;
		if (this.aClass229Array2 == null && this.aClass181Array2 == null && this.aClass35Array1 == null) {
			if (this.anIntArray351 != null && !Static183.method2653(this.anInt5325, this.anInt5326)) {
				if (this.aClass238_8 != null && this.aClass238_8.anInterface10_5 == null) {
					this.aBoolean602 = true;
				} else {
					if (!this.aBoolean603) {
						this.method4169();
					}
					this.anIntArray351 = null;
				}
			}
			if (this.anIntArray349 != null && !Static281.method2016(this.anInt5326, this.anInt5325)) {
				if (this.aClass238_8 != null && this.aClass238_8.anInterface10_5 == null) {
					this.aBoolean602 = true;
				} else {
					if (!this.aBoolean603) {
						this.method4169();
					}
					this.anIntArray349 = null;
				}
			}
			if (this.anIntArray353 != null && !Static389.method5097(this.anInt5326, this.anInt5325)) {
				if (this.aClass238_8 != null && this.aClass238_8.anInterface10_5 == null) {
					this.aBoolean602 = true;
				} else {
					if (!this.aBoolean603) {
						this.method4169();
					}
					this.anIntArray353 = null;
				}
			}
		}
		if (this.aShortArray84 != null && this.anIntArray351 == null && this.anIntArray349 == null && this.anIntArray353 == null) {
			this.aShortArray84 = null;
			this.anIntArray352 = null;
		}
		if (this.aByteArray61 != null && !Static248.method3535(this.anInt5326, this.anInt5325)) {
			if (this.aClass238_7 == null) {
				if (this.aClass238_6 != null && this.aClass238_6.anInterface10_5 == null) {
					this.aBoolean602 = true;
				} else {
					this.aByteArray61 = null;
					this.aShortArray77 = this.aShortArray82 = this.aShortArray76 = null;
				}
			} else if (this.aClass238_7.anInterface10_5 == null) {
				this.aBoolean602 = true;
			} else {
				this.aByteArray61 = null;
				this.aShortArray77 = this.aShortArray82 = this.aShortArray76 = null;
			}
		}
		if (this.aShortArray81 != null && !Static45.method4312(this.anInt5326, this.anInt5325)) {
			if (this.aClass238_6 != null && this.aClass238_6.anInterface10_5 == null) {
				this.aBoolean602 = true;
			} else {
				this.aShortArray81 = null;
			}
		}
		if (this.aByteArray60 != null && !Static352.method4761(this.anInt5325, this.anInt5326)) {
			if (this.aClass238_6 != null && this.aClass238_6.anInterface10_5 == null) {
				this.aBoolean602 = true;
			} else {
				this.aByteArray60 = null;
			}
		}
		if (this.aFloatArray25 != null && !Static192.method2760(this.anInt5326, this.anInt5325)) {
			if (this.aClass238_9 != null && this.aClass238_9.anInterface10_5 == null) {
				this.aBoolean602 = true;
			} else {
				this.aFloatArray25 = this.aFloatArray24 = null;
			}
		}
		if (this.aShortArray79 != null && !Static443.method4042(this.anInt5326, this.anInt5325)) {
			if (this.aClass238_6 != null && this.aClass238_6.anInterface10_5 == null) {
				this.aBoolean602 = true;
			} else {
				this.aShortArray79 = null;
			}
		}
		if (this.aShortArray85 != null && !Static45.method4310(this.anInt5325, this.anInt5326)) {
			if (this.aClass172_1 != null && this.aClass172_1.anInterface2_3 == null || this.aClass238_6 != null && this.aClass238_6.anInterface10_5 == null) {
				this.aBoolean602 = true;
			} else {
				this.aShortArray85 = this.aShortArray83 = this.aShortArray86 = null;
			}
		}
		if (this.anIntArrayArray46 != null && !Static381.method5017(this.anInt5326, this.anInt5325)) {
			this.aShortArray80 = null;
			this.anIntArrayArray46 = null;
		}
		if (this.anIntArrayArray47 != null && !Static103.method1580(this.anInt5326, this.anInt5325)) {
			this.aShortArray78 = null;
			this.anIntArrayArray47 = null;
		}
		if (this.anIntArrayArray48 != null && !Static238.method3444(this.anInt5326, this.anInt5325)) {
			this.anIntArrayArray48 = null;
		}
		if (this.anIntArray350 != null && (this.anInt5326 & 0x800) == 0 && (this.anInt5326 & 0x40000) == 0) {
			this.anIntArray350 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		if (this.aClass238_6 != null) {
			this.aClass238_6.anInterface10_5 = null;
		}
		this.aShort87 = (short) arg0;
	}

	@OriginalMember(owner = "client!pg", name = "za", descriptor = "(IIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static387.anInt6433 = 0;
			Static226.anInt4015 = 0;
			local13 = 0;
			Static404.anInt6699 = 0;
			for (local17 = 0; local17 < this.anInt5312; local17++) {
				Static387.anInt6433 += this.anIntArray351[local17];
				Static226.anInt4015 += this.anIntArray349[local17];
				local13++;
				Static404.anInt6699 += this.anIntArray353[local17];
			}
			if (local13 <= 0) {
				Static387.anInt6433 = arg1;
				Static404.anInt6699 = arg3;
				Static226.anInt4015 = arg2;
			} else {
				Static404.anInt6699 = arg3 + Static404.anInt6699 / local13;
				Static226.anInt4015 = Static226.anInt4015 / local13 + arg2;
				Static387.anInt6433 = arg1 + Static387.anInt6433 / local13;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt5312; local13++) {
				this.anIntArray351[local13] += arg1;
				this.anIntArray349[local13] += arg2;
				this.anIntArray353[local13] += arg3;
			}
		} else {
			@Pc(152) int local152;
			@Pc(170) int local170;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt5312; local13++) {
					this.anIntArray351[local13] -= Static387.anInt6433;
					this.anIntArray349[local13] -= Static226.anInt4015;
					this.anIntArray353[local13] -= Static404.anInt6699;
					if (arg3 != 0) {
						local17 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg3];
						local152 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg3];
						local170 = this.anIntArray351[local13] * local152 + local17 * this.anIntArray349[local13] + 32767 >> 15;
						this.anIntArray349[local13] = local152 * this.anIntArray349[local13] + 32767 - local17 * this.anIntArray351[local13] >> 15;
						this.anIntArray351[local13] = local170;
					}
					if (arg1 != 0) {
						local17 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg1];
						local152 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg1];
						local170 = local152 * this.anIntArray349[local13] + 32767 - this.anIntArray353[local13] * local17 >> 15;
						this.anIntArray353[local13] = local17 * this.anIntArray349[local13] + this.anIntArray353[local13] * local152 + 32767 >> 15;
						this.anIntArray349[local13] = local170;
					}
					if (arg2 != 0) {
						local17 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg2];
						local152 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg2];
						local170 = this.anIntArray351[local13] * local152 + this.anIntArray353[local13] * local17 + 32767 >> 15;
						this.anIntArray353[local13] = local152 * this.anIntArray353[local13] + 32767 - local17 * this.anIntArray351[local13] >> 15;
						this.anIntArray351[local13] = local170;
					}
					this.anIntArray351[local13] += Static387.anInt6433;
					this.anIntArray349[local13] += Static226.anInt4015;
					this.anIntArray353[local13] += Static404.anInt6699;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt5312; local13++) {
					this.anIntArray351[local13] -= Static387.anInt6433;
					this.anIntArray349[local13] -= Static226.anInt4015;
					this.anIntArray353[local13] -= Static404.anInt6699;
					this.anIntArray351[local13] = this.anIntArray351[local13] * arg1 / 128;
					this.anIntArray349[local13] = arg2 * this.anIntArray349[local13] / 128;
					this.anIntArray353[local13] = this.anIntArray353[local13] * arg3 / 128;
					this.anIntArray351[local13] += Static387.anInt6433;
					this.anIntArray349[local13] += Static226.anInt4015;
					this.anIntArray353[local13] += Static404.anInt6699;
				}
			} else {
				@Pc(512) Class35 local512;
				@Pc(517) Class94 local517;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt5307; local13++) {
						local17 = (this.aByteArray60[local13] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray60[local13] = (byte) local17;
					}
					if (this.aClass238_6 != null) {
						this.aClass238_6.anInterface10_5 = null;
					}
					if (this.aClass35Array1 != null) {
						for (local17 = 0; local17 < this.anInt5306; local17++) {
							local512 = this.aClass35Array1[local17];
							local517 = this.aClass94Array1[local17];
							local517.anInt2394 = local517.anInt2394 & 0xFFFFFF | 255 - (this.aByteArray60[local512.anInt813] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt5307; local13++) {
						local17 = this.aShortArray81[local13] & 0xFFFF;
						local152 = local17 >> 10 & 0x3F;
						local170 = local17 >> 7 & 0x7;
						@Pc(578) int local578 = local17 & 0x7F;
						local170 += arg2 / 4;
						@Pc(591) int local591 = local152 + arg1 & 0x3F;
						local578 += arg3;
						if (local170 < 0) {
							local170 = 0;
						} else if (local170 > 7) {
							local170 = 7;
						}
						if (local578 < 0) {
							local578 = 0;
						} else if (local578 > 127) {
							local578 = 127;
						}
						this.aShortArray81[local13] = (short) (local170 << 7 | local591 << 10 | local578);
					}
					if (this.aClass238_6 != null) {
						this.aClass238_6.anInterface10_5 = null;
					}
					if (this.aClass35Array1 != null) {
						for (local17 = 0; local17 < this.anInt5306; local17++) {
							local512 = this.aClass35Array1[local17];
							local517 = this.aClass94Array1[local17];
							local517.anInt2394 = Static160.anIntArray183[this.aShortArray81[local512.anInt813] & 0xFFFF] & 0xFFFFFF | local517.anInt2394 & 0xFF000000;
						}
					}
				} else {
					@Pc(700) Class94 local700;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt5306; local13++) {
							local700 = this.aClass94Array1[local13];
							local700.anInt2385 += arg2;
							local700.anInt2393 += arg1;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt5306; local13++) {
							local700 = this.aClass94Array1[local13];
							local700.anInt2391 = local700.anInt2391 * arg2 >> 7;
							local700.anInt2392 = arg1 * local700.anInt2392 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt5306; local13++) {
							local700 = this.aClass94Array1[local13];
							local700.anInt2396 = local700.anInt2396 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "()[Lclient!su;")
	@Override
	public Class229[] method5958() {
		return this.aClass229Array2;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZIIIIIIII)Z")
	private boolean method4180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > arg6 && arg0 > arg6 && arg6 < arg5) {
			return false;
		} else if (arg3 < arg6 && arg0 < arg6 && arg5 < arg6) {
			return false;
		} else if (arg7 > arg4 && arg4 < arg1 && arg2 > arg4) {
			return false;
		} else {
			return arg7 >= arg4 || arg1 >= arg4 || arg4 <= arg2;
		}
	}

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "(I)V")
	@Override
	public void K(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg0];
		@Pc(13) int local13 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5312; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray351[local15] + this.anIntArray349[local15] * local9 >> 15;
			this.anIntArray349[local15] = this.anIntArray349[local15] * local13 - this.anIntArray351[local15] * local9 >> 15;
			this.anIntArray351[local15] = local33;
		}
		if (this.aClass238_8 != null) {
			this.aClass238_8.anInterface10_5 = null;
		}
		this.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "()[Lclient!op;")
	@Override
	public Class181[] method5959() {
		return this.aClass181Array2;
	}

	@OriginalMember(owner = "client!pg", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	@Override
	public Class1_Sub5_Sub10 EA(@OriginalArg(0) Class1_Sub5_Sub10 arg0) {
		if (this.anInt5277 == 0) {
			return null;
		}
		if (!this.aBoolean603) {
			this.method4169();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass34_Sub2_27.anInt7111 <= 0) {
			local43 = this.aShort83 - (this.aClass34_Sub2_27.anInt7111 * this.aShort84 >> 8) >> this.aClass34_Sub2_27.anInt7072;
			local60 = this.aShort86 - (this.aClass34_Sub2_27.anInt7111 * this.aShort88 >> 8) >> this.aClass34_Sub2_27.anInt7072;
		} else {
			local43 = this.aShort83 - (this.aShort88 * this.aClass34_Sub2_27.anInt7111 >> 8) >> this.aClass34_Sub2_27.anInt7072;
			local60 = this.aShort86 - (this.aShort84 * this.aClass34_Sub2_27.anInt7111 >> 8) >> this.aClass34_Sub2_27.anInt7072;
		}
		@Pc(116) int local116;
		@Pc(132) int local132;
		if (this.aClass34_Sub2_27.anInt7083 <= 0) {
			local116 = this.aShort90 - (this.aShort84 * this.aClass34_Sub2_27.anInt7083 >> 8) >> this.aClass34_Sub2_27.anInt7072;
			local132 = this.aShort91 - (this.aClass34_Sub2_27.anInt7083 * this.aShort88 >> 8) >> this.aClass34_Sub2_27.anInt7072;
		} else {
			local116 = this.aShort90 - (this.aClass34_Sub2_27.anInt7083 * this.aShort88 >> 8) >> this.aClass34_Sub2_27.anInt7072;
			local132 = this.aShort91 - (this.aClass34_Sub2_27.anInt7083 * this.aShort84 >> 8) >> this.aClass34_Sub2_27.anInt7072;
		}
		@Pc(173) int local173 = local60 + 1 - local43;
		@Pc(180) int local180 = local132 + 1 - local116;
		@Pc(183) Class1_Sub5_Sub10_Sub1 local183 = (Class1_Sub5_Sub10_Sub1) arg0;
		@Pc(193) Class1_Sub5_Sub10_Sub1 local193;
		if (local183 != null && local183.method4691(local180, local173)) {
			local193 = local183;
			local183.method4687();
		} else {
			local193 = new Class1_Sub5_Sub10_Sub1(this.aClass34_Sub2_27, local173, local180);
		}
		local193.method4688(local116, local132, local60, local43);
		this.method4168(local193);
		return local193;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "()V")
	@Override
	public void method5963() {
		if (this.anInt5277 <= 0 || this.anInt5330 <= 0) {
			return;
		}
		this.method4176(false);
		if ((this.aByte87 & 0x10) == 0 && this.aClass172_1.anInterface2_3 == null) {
			this.method4175(false);
		}
		this.method4178();
	}

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "()I")
	@Override
	public int k() {
		if (!this.aBoolean603) {
			this.method4169();
		}
		return this.aShort85;
	}

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anInt5326 = arg0;
		this.aBoolean602 = true;
		if (this.aClass270_1 != null && (this.anInt5326 & 0x10000) == 0) {
			this.aShortArray82 = this.aClass270_1.aShortArray115;
			this.aShortArray77 = this.aClass270_1.aShortArray117;
			this.aByteArray61 = this.aClass270_1.aByteArray96;
			this.aShortArray76 = this.aClass270_1.aShortArray116;
			this.aClass270_1 = null;
		}
		this.method4178();
	}

	@OriginalMember(owner = "client!pg", name = "Z", descriptor = "()I")
	@Override
	public int Z() {
		if (!this.aBoolean603) {
			this.method4169();
		}
		return this.aShort90;
	}

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "(III)V")
	@Override
	public void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5312; local3++) {
			if (arg0 != 128) {
				this.anIntArray351[local3] = arg0 * this.anIntArray351[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray349[local3] = this.anIntArray349[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray353[local3] = this.anIntArray353[local3] * arg2 >> 7;
			}
		}
		if (this.aClass238_8 != null) {
			this.aClass238_8.anInterface10_5 = null;
		}
		this.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!pg", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt5326;
	}

	@OriginalMember(owner = "client!pg", name = "KA", descriptor = "()V")
	@Override
	protected void KA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5279; local7++) {
			this.anIntArray351[local7] = this.anIntArray351[local7] + 7 >> 4;
			this.anIntArray349[local7] = this.anIntArray349[local7] + 7 >> 4;
			this.anIntArray353[local7] = this.anIntArray353[local7] + 7 >> 4;
		}
		this.aBoolean603 = false;
		if (this.aClass238_8 != null) {
			this.aClass238_8.anInterface10_5 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "(SS)V")
	@Override
	public void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface6 local9 = this.aClass34_Sub2_27.anInterface6_8;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5307; local11++) {
			if (arg0 == this.aShortArray79[local11]) {
				this.aShortArray79[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class114 local47 = local9.method3937(arg0 & 0xFFFF);
			local37 = local47.aByte25;
			local35 = local47.aByte29;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class114 local68 = local9.method3937(arg1 & 0xFFFF);
			local55 = local68.aByte29;
			local57 = local68.aByte25;
		}
		if (!(local55 != local35 | local57 != local37)) {
			return;
		}
		if (this.aClass35Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt5306; local97++) {
				@Pc(104) Class35 local104 = this.aClass35Array1[local97];
				@Pc(109) Class94 local109 = this.aClass94Array1[local97];
				local109.anInt2394 = local109.anInt2394 & 0xFF000000 | Static160.anIntArray183[this.aShortArray81[local104.anInt813] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass238_6 != null) {
			this.aClass238_6.anInterface10_5 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!c;Lclient!ut;I)V")
	@Override
	public void method5953(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5277 == 0) {
			return;
		}
		@Pc(13) Class32_Sub2 local13 = this.aClass34_Sub2_27.aClass32_Sub2_4;
		@Pc(16) Class32_Sub2 local16 = (Class32_Sub2) arg0;
		if (!this.aBoolean603) {
			this.method4169();
		}
		this.method4177(local16);
		Static304.aFloat66 = local13.aFloat51 + local16.aFloat51 * local13.aFloat47 + local16.aFloat48 * local13.aFloat56 + local16.aFloat55 * local13.aFloat46;
		Static132.aFloat26 = local16.aFloat52 * local13.aFloat56 + local16.aFloat53 * local13.aFloat46 + local16.aFloat46 * local13.aFloat47;
		@Pc(73) float local73 = Static304.aFloat66 + (float) this.aShort84 * Static132.aFloat26;
		@Pc(81) float local81 = (float) this.aShort88 * Static132.aFloat26 + Static304.aFloat66;
		@Pc(92) float local92;
		@Pc(98) float local98;
		if (local73 > local81) {
			local92 = (float) -this.aShort85 + local81;
			local98 = (float) this.aShort85 + local73;
		} else {
			local98 = (float) this.aShort85 + local81;
			local92 = local73 - (float) this.aShort85;
		}
		if (this.aClass34_Sub2_27.aFloat86 <= local92 || (float) this.aClass34_Sub2_27.anInt7099 >= local98) {
			return;
		}
		Static4.aFloat4 = local16.aFloat46 * local13.aFloat50 + local16.aFloat53 * local13.aFloat52 + local16.aFloat52 * local13.aFloat54;
		Static61.aFloat17 = local13.aFloat48 + local16.aFloat51 * local13.aFloat50 + local13.aFloat54 * local16.aFloat48 + local16.aFloat55 * local13.aFloat52;
		@Pc(174) float local174 = Static61.aFloat17 + (float) this.aShort84 * Static4.aFloat4;
		@Pc(182) float local182 = (float) this.aShort88 * Static4.aFloat4 + Static61.aFloat17;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local174 > local182) {
			local198 = ((float) -this.aShort85 + local182) * (float) this.aClass34_Sub2_27.anInt7105;
			local209 = (local174 + (float) this.aShort85) * (float) this.aClass34_Sub2_27.anInt7105;
		} else {
			local198 = ((float) -this.aShort85 + local174) * (float) this.aClass34_Sub2_27.anInt7105;
			local209 = (float) this.aClass34_Sub2_27.anInt7105 * (local182 + (float) this.aShort85);
		}
		if (this.aClass34_Sub2_27.aFloat99 <= local198 / local98 || this.aClass34_Sub2_27.aFloat98 >= local209 / local98) {
			return;
		}
		Static398.aFloat40 = local16.aFloat51 * local13.aFloat49 + local16.aFloat55 * local13.aFloat53 + local13.aFloat45 * local16.aFloat48 + local13.aFloat55;
		Static346.aFloat69 = local16.aFloat52 * local13.aFloat45 + local16.aFloat53 * local13.aFloat53 + local16.aFloat46 * local13.aFloat49;
		@Pc(299) float local299 = Static398.aFloat40 + (float) this.aShort84 * Static346.aFloat69;
		@Pc(307) float local307 = Static398.aFloat40 + Static346.aFloat69 * (float) this.aShort88;
		@Pc(334) float local334;
		@Pc(322) float local322;
		if (local299 > local307) {
			local334 = (float) this.aClass34_Sub2_27.anInt7096 * (local307 - (float) this.aShort85);
			local322 = (float) this.aClass34_Sub2_27.anInt7096 * ((float) this.aShort85 + local299);
		} else {
			local322 = ((float) this.aShort85 + local307) * (float) this.aClass34_Sub2_27.anInt7096;
			local334 = (float) this.aClass34_Sub2_27.anInt7096 * ((float) -this.aShort85 + local299);
		}
		if (local334 / local98 >= this.aClass34_Sub2_27.aFloat100 || local322 / local98 <= this.aClass34_Sub2_27.aFloat88) {
			return;
		}
		if (arg1 != null || this.aClass35Array1 != null) {
			Static81.aFloat18 = local13.aFloat49 * local16.aFloat56 + local13.aFloat53 * local16.aFloat45 + local16.aFloat54 * local13.aFloat45;
			Static452.aFloat108 = local13.aFloat47 * local16.aFloat47 + local16.aFloat49 * local13.aFloat46 + local13.aFloat56 * local16.aFloat50;
			Static166.aFloat32 = local13.aFloat45 * local16.aFloat50 + local16.aFloat49 * local13.aFloat53 + local16.aFloat47 * local13.aFloat49;
			Static151.aFloat30 = local13.aFloat50 * local16.aFloat47 + local16.aFloat50 * local13.aFloat54 + local16.aFloat49 * local13.aFloat52;
			Static331.aFloat67 = local13.aFloat52 * local16.aFloat45 + local16.aFloat54 * local13.aFloat54 + local16.aFloat56 * local13.aFloat50;
			Static348.aFloat71 = local13.aFloat56 * local16.aFloat54 + local13.aFloat46 * local16.aFloat45 + local13.aFloat47 * local16.aFloat56;
		}
		if (arg1 != null) {
			@Pc(493) boolean local493 = false;
			@Pc(495) boolean local495 = true;
			@Pc(503) int local503 = this.aShort86 + this.aShort83 >> 1;
			@Pc(511) int local511 = this.aShort91 + this.aShort90 >> 1;
			@Pc(530) int local530 = (int) (Static151.aFloat30 * (float) local511 + (float) this.aShort84 * Static4.aFloat4 + (float) local503 * Static331.aFloat67 + Static61.aFloat17);
			@Pc(549) int local549 = (int) ((float) local503 * Static81.aFloat18 + Static398.aFloat40 + Static346.aFloat69 * (float) this.aShort84 + (float) local511 * Static166.aFloat32);
			@Pc(568) int local568 = (int) ((float) local503 * Static348.aFloat71 + Static304.aFloat66 + Static132.aFloat26 * (float) this.aShort84 + (float) local511 * Static452.aFloat108);
			if (this.aClass34_Sub2_27.anInt7099 > local568) {
				local493 = true;
			} else {
				arg1.anInt7128 = this.aClass34_Sub2_27.anInt7112 + local530 * this.aClass34_Sub2_27.anInt7105 / local568;
				arg1.anInt7127 = local549 * this.aClass34_Sub2_27.anInt7096 / local568 + this.aClass34_Sub2_27.anInt7091;
			}
			@Pc(623) int local623 = (int) ((float) local503 * Static331.aFloat67 + Static61.aFloat17 + (float) this.aShort88 * Static4.aFloat4 + (float) local511 * Static151.aFloat30);
			@Pc(642) int local642 = (int) (Static346.aFloat69 * (float) this.aShort88 + (float) local503 * Static81.aFloat18 + Static398.aFloat40 + (float) local511 * Static166.aFloat32);
			@Pc(661) int local661 = (int) ((float) local511 * Static452.aFloat108 + Static132.aFloat26 * (float) this.aShort88 + Static304.aFloat66 + Static348.aFloat71 * (float) local503);
			if (this.aClass34_Sub2_27.anInt7099 > local661) {
				local493 = true;
			} else {
				arg1.anInt7125 = this.aClass34_Sub2_27.anInt7112 + this.aClass34_Sub2_27.anInt7105 * local623 / local661;
				arg1.anInt7129 = this.aClass34_Sub2_27.anInt7091 + local642 * this.aClass34_Sub2_27.anInt7096 / local661;
			}
			if (local493) {
				if (this.aClass34_Sub2_27.anInt7099 > local568 && local661 < this.aClass34_Sub2_27.anInt7099) {
					local495 = false;
				} else {
					@Pc(734) int local734;
					@Pc(746) int local746;
					@Pc(756) int local756;
					if (local568 < this.aClass34_Sub2_27.anInt7099) {
						local734 = (local661 - this.aClass34_Sub2_27.anInt7099 << 16) / (local661 - local568);
						local746 = local623 + ((local623 - local530) * local734 >> 16);
						local756 = local642 + (local734 * (local642 - local549) >> 16);
						arg1.anInt7128 = local746 * this.aClass34_Sub2_27.anInt7105 / this.aClass34_Sub2_27.anInt7099 + this.aClass34_Sub2_27.anInt7112;
						arg1.anInt7127 = this.aClass34_Sub2_27.anInt7091 + local756 * this.aClass34_Sub2_27.anInt7096 / this.aClass34_Sub2_27.anInt7099;
					} else if (local661 < this.aClass34_Sub2_27.anInt7099) {
						local734 = (local568 - this.aClass34_Sub2_27.anInt7099 << 16) / (local568 - local661);
						local746 = local530 + ((local530 - local623) * local734 >> 16);
						local756 = (local734 * (local549 - local642) >> 16) + local549;
						arg1.anInt7128 = this.aClass34_Sub2_27.anInt7105 * local746 / this.aClass34_Sub2_27.anInt7099 + this.aClass34_Sub2_27.anInt7112;
						arg1.anInt7127 = this.aClass34_Sub2_27.anInt7091 + local756 * this.aClass34_Sub2_27.anInt7096 / this.aClass34_Sub2_27.anInt7099;
					}
				}
			}
			if (local495) {
				arg1.aBoolean779 = true;
				if (local661 >= local568) {
					arg1.anInt7126 = this.aClass34_Sub2_27.anInt7112 + (this.aShort85 + local623) * this.aClass34_Sub2_27.anInt7105 / local661 - arg1.anInt7125;
				} else {
					arg1.anInt7126 = this.aClass34_Sub2_27.anInt7105 * (local530 + this.aShort85) / local568 + this.aClass34_Sub2_27.anInt7112 - arg1.anInt7128;
				}
			}
		}
		this.aClass34_Sub2_27.method5539();
		this.aClass34_Sub2_27.method5484(local16);
		this.method4167();
		this.aClass34_Sub2_27.method5558();
		this.method4172();
	}

	@OriginalMember(owner = "client!pg", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Class157 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean603) {
			this.method4169();
		}
		@Pc(16) int local16 = this.aShort83 + arg4;
		@Pc(22) int local22 = arg4 + this.aShort86;
		@Pc(27) int local27 = this.aShort90 + arg6;
		@Pc(32) int local32 = this.aShort91 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt6283 <= arg2.anInt6284 + local22 >> arg2.anInt6279 || local27 < 0 || arg2.anInt6286 <= local32 + arg2.anInt6284 >> arg2.anInt6279)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local22 + arg3.anInt6284 >> arg3.anInt6279 >= arg3.anInt6283 || local27 < 0 || arg3.anInt6286 <= local32 + arg3.anInt6284 >> arg3.anInt6279) {
				return;
			}
		} else {
			local16 >>= arg2.anInt6279;
			local22 = local22 + arg2.anInt6284 - 1 >> arg2.anInt6279;
			local27 >>= arg2.anInt6279;
			local32 = local32 + arg2.anInt6284 - 1 >> arg2.anInt6279;
			if (arg5 == arg2.ua(local16, local27) && arg5 == arg2.ua(local22, local27) && arg5 == arg2.ua(local16, local32) && arg5 == arg2.ua(local22, local32)) {
				return;
			}
		}
		@Pc(187) int local187;
		if (arg0 == 1) {
			for (local187 = 0; local187 < this.anInt5312; local187++) {
				this.anIntArray349[local187] -= arg5 - arg2.ca(arg4 + this.anIntArray351[local187], this.anIntArray353[local187] - -arg6);
			}
		} else {
			@Pc(237) int local237;
			@Pc(248) int local248;
			if (arg0 == 2) {
				@Pc(232) short local232 = this.aShort84;
				if (local232 == 0) {
					return;
				}
				for (local237 = 0; local237 < this.anInt5312; local237++) {
					local248 = (this.anIntArray349[local237] << 16) / local232;
					if (local248 < arg1) {
						this.anIntArray349[local237] += (arg2.ca(this.anIntArray351[local237] + arg4, arg6 + this.anIntArray353[local237]) - arg5) * (-local248 + arg1) / arg1;
					}
				}
			} else {
				@Pc(383) int local383;
				if (arg0 == 3) {
					local187 = (arg1 & 0xFF) * 4;
					local237 = (arg1 >> 8 & 0xFF) * 4;
					local248 = (arg1 >> 16 & 0xFF) << 6;
					local383 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local187 >> 1) < 0 || arg2.anInt6283 << arg2.anInt6279 <= (local187 >> 1) + arg4 + arg2.anInt6284 || arg6 - (local237 >> 1) < 0 || arg2.anInt6284 + arg6 + (local237 >> 1) >= arg2.anInt6286 << arg2.anInt6279) {
						return;
					}
					this.method5954(arg6, arg5, arg4, arg2, local383, local187, local237, local248);
				} else if (arg0 == 4) {
					local187 = this.aShort88 - this.aShort84;
					for (local237 = 0; local237 < this.anInt5312; local237++) {
						this.anIntArray349[local237] = local187 + this.anIntArray349[local237] + arg3.ca(arg4 + this.anIntArray351[local237], arg6 + this.anIntArray353[local237]) - arg5;
					}
				} else if (arg0 == 5) {
					local187 = this.aShort88 - this.aShort84;
					for (local237 = 0; local237 < this.anInt5312; local237++) {
						local248 = arg4 + this.anIntArray351[local237];
						local383 = arg6 + this.anIntArray353[local237];
						@Pc(388) int local388 = arg2.ca(local248, local383);
						@Pc(393) int local393 = arg3.ca(local248, local383);
						@Pc(398) int local398 = local388 - local393;
						this.anIntArray349[local237] = local388 + (local398 * ((this.anIntArray349[local237] << 8) / local187) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass238_8 != null) {
			this.aClass238_8.anInterface10_5 = null;
		}
		this.aBoolean603 = false;
	}
}
