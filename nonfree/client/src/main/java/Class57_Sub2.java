import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "[S")
	private short[] aShortArray161;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "[S")
	private short[] aShortArray162;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Lclient!el;")
	private Interface7 anInterface7_2;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "[Lclient!jd;")
	private Class162[] aClass162Array1;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "[I")
	private int[] anIntArray440;

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "Lclient!au;")
	private Class18 aClass18_1;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "[S")
	private short[] aShortArray163;

	@OriginalMember(owner = "client!mb", name = "O", descriptor = "[S")
	private short[] aShortArray164;

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "[S")
	private short[] aShortArray165;

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "[I")
	private int[] anIntArray441;

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
	private int anInt5702;

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "[S")
	private short[] aShortArray166;

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "[S")
	private short[] aShortArray167;

	@OriginalMember(owner = "client!mb", name = "kb", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!mb", name = "nb", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!mb", name = "rb", descriptor = "[S")
	private short[] aShortArray168;

	@OriginalMember(owner = "client!mb", name = "tb", descriptor = "[Lclient!kba;")
	private Class178[] aClass178Array1;

	@OriginalMember(owner = "client!mb", name = "yb", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!mb", name = "Bb", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!mb", name = "Fb", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!mb", name = "Gb", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!mb", name = "Kb", descriptor = "I")
	private int anInt5725;

	@OriginalMember(owner = "client!mb", name = "Ob", descriptor = "[S")
	private short[] aShortArray169;

	@OriginalMember(owner = "client!mb", name = "Pb", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!mb", name = "Wb", descriptor = "[I")
	private int[] anIntArray442;

	@OriginalMember(owner = "client!mb", name = "Yb", descriptor = "[F")
	private float[] aFloatArray44;

	@OriginalMember(owner = "client!mb", name = "Zb", descriptor = "Lclient!cv;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!mb", name = "ac", descriptor = "[F")
	private float[] aFloatArray45;

	@OriginalMember(owner = "client!mb", name = "bc", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!mb", name = "cc", descriptor = "[I")
	private int[] anIntArray443;

	@OriginalMember(owner = "client!mb", name = "dc", descriptor = "B")
	private byte aByte68;

	@OriginalMember(owner = "client!mb", name = "gc", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!mb", name = "jc", descriptor = "[Lclient!aq;")
	private Class15[] aClass15Array2;

	@OriginalMember(owner = "client!mb", name = "mc", descriptor = "[I")
	private int[] anIntArray444;

	@OriginalMember(owner = "client!mb", name = "pc", descriptor = "[Lclient!tk;")
	private Class323[] aClass323Array2;

	@OriginalMember(owner = "client!mb", name = "qc", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!mb", name = "sc", descriptor = "[S")
	private short[] aShortArray170;

	@OriginalMember(owner = "client!mb", name = "yc", descriptor = "I")
	private int anInt5746;

	@OriginalMember(owner = "client!mb", name = "Ac", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!mb", name = "Bc", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!mb", name = "Ec", descriptor = "[S")
	private short[] aShortArray171;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	private int anInt5686 = 0;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Z")
	private boolean aBoolean464 = false;

	@OriginalMember(owner = "client!mb", name = "zb", descriptor = "I")
	private int anInt5717 = 0;

	@OriginalMember(owner = "client!mb", name = "Cb", descriptor = "I")
	private int anInt5719 = 0;

	@OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
	private int anInt5711 = 0;

	@OriginalMember(owner = "client!mb", name = "nc", descriptor = "I")
	private int anInt5741 = 0;

	@OriginalMember(owner = "client!mb", name = "vc", descriptor = "Z")
	private boolean aBoolean465 = false;

	@OriginalMember(owner = "client!mb", name = "Cc", descriptor = "Z")
	private boolean aBoolean466 = true;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_22;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Lclient!rca;")
	private Class280 aClass280_6;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "Lclient!rca;")
	private Class280 aClass280_5;

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "Lclient!rca;")
	private Class280 aClass280_7;

	@OriginalMember(owner = "client!mb", name = "hc", descriptor = "Lclient!rca;")
	private Class280 aClass280_8;

	@OriginalMember(owner = "client!mb", name = "wc", descriptor = "Lclient!jj;")
	private Class167 aClass167_1;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class57_Sub2(@OriginalArg(0) Class43_Sub3 arg0) {
		this.aClass43_Sub3_22 = arg0;
		this.aClass280_6 = new Class280(null, 5126, 3, 0);
		this.aClass280_5 = new Class280(null, 5126, 2, 0);
		this.aClass280_7 = new Class280(null, 5126, 3, 0);
		this.aClass280_8 = new Class280(null, 5121, 4, 0);
		this.aClass167_1 = new Class167();
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!us;Lclient!nda;IIII)V")
	public Class57_Sub2(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5746 = arg5;
		this.aClass43_Sub3_22 = arg0;
		this.anInt5725 = arg2;
		if (Static550.method6451(arg5, arg2)) {
			this.aClass280_6 = new Class280(null, 5126, 3, 0);
		}
		if (Static458.method6369(arg5, arg2)) {
			this.aClass280_5 = new Class280(null, 5126, 2, 0);
		}
		if (Static174.method3023(arg2, arg5)) {
			this.aClass280_7 = new Class280(null, 5126, 3, 0);
		}
		if (Static453.method6303(arg2, arg5)) {
			this.aClass280_8 = new Class280(null, 5121, 4, 0);
		}
		if (Static440.method3644(arg5, arg2)) {
			this.aClass167_1 = new Class167();
		}
		@Pc(105) Interface8 local105 = arg0.anInterface8_12;
		@Pc(109) int[] local109 = new int[arg1.anInt6105];
		this.anIntArray442 = new int[arg1.anInt6108 + 1];
		for (@Pc(118) int local118 = 0; local118 < arg1.anInt6105; local118++) {
			if ((arg1.aByteArray73 == null || arg1.aByteArray73[local118] != 2) && (arg1.aShortArray200 == null || arg1.aShortArray200[local118] == -1 || !local105.method6560(arg1.aShortArray200[local118] & 0xFFFF).aBoolean491)) {
				local109[this.anInt5711++] = local118;
				this.anIntArray442[arg1.aShortArray193[local118]]++;
				this.anIntArray442[arg1.aShortArray194[local118]]++;
				this.anIntArray442[arg1.aShortArray195[local118]]++;
			}
		}
		this.anInt5686 = this.anInt5711;
		@Pc(205) long[] local205 = new long[this.anInt5711];
		@Pc(214) boolean local214 = (this.anInt5725 & 0x100) != 0;
		@Pc(226) int local226;
		@Pc(237) int local237;
		@Pc(372) int local372;
		label495: for (@Pc(216) int local216 = 0; local216 < this.anInt5711; local216++) {
			@Pc(222) int local222 = local109[local216];
			@Pc(224) Class224 local224 = null;
			local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			if (arg1.aClass161Array1 != null) {
				for (local237 = 0; local237 < arg1.aClass161Array1.length; local237++) {
					@Pc(244) Class161 local244 = arg1.aClass161Array1[local237];
					if (local244.anInt4511 == local222) {
						@Pc(253) Class336 local253 = Static237.method3979(local244.anInt4509);
						if (local253.aBoolean659) {
							local205[local216] = Long.MAX_VALUE;
							this.anInt5686--;
							continue label495;
						}
					}
				}
			}
			@Pc(280) short local280 = -1;
			if (arg1.aShortArray200 != null) {
				local280 = arg1.aShortArray200[local222];
				if (local280 != -1) {
					local224 = local105.method6560(local280 & 0xFFFF);
					local232 = local224.aByte74;
					local230 = local224.aByte69;
				}
			}
			@Pc(328) boolean local328 = arg1.aByteArray76 != null && arg1.aByteArray76[local222] != 0 || local224 != null && local224.aBoolean492 | !local224.aBoolean494;
			if ((local214 || local328) && arg1.aByteArray74 != null) {
				local226 += arg1.aByteArray74[local222] << 17;
			}
			if (local328) {
				local226 += 65536;
			}
			local226 += (local230 & 0xFF) << 8;
			local226 += local232 & 0xFF;
			local372 = local228 + ((local280 & 0xFFFF) << 16);
			@Pc(378) int local378 = local372 + (local216 & 0xFFFF);
			local205[local216] = ((long) local226 << 32) + ((long) local378);
			this.aBoolean464 |= local328;
		}
		Static219.method3810(local109, local205);
		this.anInt5741 = arg1.anInt6119;
		this.anIntArray440 = arg1.anIntArray475;
		this.anIntArray441 = arg1.anIntArray483;
		this.anInt5717 = arg1.anInt6108;
		this.anIntArray443 = arg1.anIntArray478;
		this.aShortArray170 = arg1.aShortArray197;
		this.aClass15Array2 = arg1.aClass15Array3;
		this.aClass323Array2 = arg1.aClass323Array3;
		@Pc(440) Class53[] local440 = new Class53[this.anInt5717];
		@Pc(460) int local460;
		@Pc(474) int local474;
		if (arg1.aClass161Array1 != null) {
			this.anInt5702 = arg1.aClass161Array1.length;
			this.aClass162Array1 = new Class162[this.anInt5702];
			this.aClass178Array1 = new Class178[this.anInt5702];
			for (local460 = 0; local460 < this.anInt5702; local460++) {
				@Pc(467) Class161 local467 = arg1.aClass161Array1[local460];
				@Pc(472) Class336 local472 = Static237.method3979(local467.anInt4509);
				local474 = -1;
				for (@Pc(476) int local476 = 0; local476 < this.anInt5711; local476++) {
					if (local109[local476] == local467.anInt4511) {
						local474 = local476;
						break;
					}
				}
				if (local474 == -1) {
					throw new RuntimeException();
				}
				local237 = Static213.anIntArray342[arg1.aShortArray199[local467.anInt4511] & 0xFFFF] & 0xFFFFFF;
				local237 |= 255 - (arg1.aByteArray76 == null ? 0 : arg1.aByteArray76[local467.anInt4511]) << 24;
				this.aClass162Array1[local460] = new Class162(local474, arg1.aShortArray193[local467.anInt4511], arg1.aShortArray194[local467.anInt4511], arg1.aShortArray195[local467.anInt4511], local472.anInt8516, local472.anInt8512, local472.anInt8507, local472.anInt8514, local472.anInt8513, local472.aBoolean659, local472.aBoolean660, local467.anInt4505);
				this.aClass178Array1[local460] = new Class178(local237);
			}
		}
		local460 = this.anInt5711 * 3;
		this.aShort70 = (short) arg4;
		this.aShortArray167 = new short[this.anInt5711];
		this.aShortArray168 = new short[this.anInt5711];
		this.aShortArray161 = new short[this.anInt5711];
		this.aShortArray165 = new short[this.anInt5711];
		this.aShortArray166 = new short[local460];
		this.aFloatArray45 = new float[local460];
		this.aShortArray171 = new short[local460];
		this.aShortArray164 = new short[local460];
		this.aShortArray169 = new short[local460];
		this.aShortArray162 = new short[this.anInt5711];
		this.aFloatArray44 = new float[local460];
		this.aByteArray67 = new byte[this.anInt5711];
		this.aShort73 = (short) arg3;
		Static47.aLongArray1 = new long[local460];
		this.aByteArray68 = new byte[local460];
		if (arg1.aShortArray198 != null) {
			this.aShortArray163 = new short[this.anInt5711];
		}
		local226 = 0;
		for (local372 = 0; local372 < arg1.anInt6108; local372++) {
			local474 = this.anIntArray442[local372];
			this.anIntArray442[local372] = local226;
			local440[local372] = new Class53();
			local226 += local474;
		}
		this.anIntArray442[arg1.anInt6108] = local226;
		@Pc(716) int[] local716 = null;
		@Pc(718) int[] local718 = null;
		@Pc(720) int[] local720 = null;
		@Pc(722) float[][] local722 = null;
		@Pc(748) int local748;
		@Pc(787) int local787;
		@Pc(793) int local793;
		@Pc(807) int local807;
		@Pc(809) int local809;
		@Pc(840) int local840;
		@Pc(845) int local845;
		@Pc(1016) float local1016;
		@Pc(1000) float local1000;
		@Pc(1008) float local1008;
		if (arg1.aByteArray75 != null) {
			@Pc(728) int local728 = arg1.anInt6115;
			@Pc(731) int[] local731 = new int[local728];
			@Pc(734) int[] local734 = new int[local728];
			@Pc(737) int[] local737 = new int[local728];
			@Pc(740) int[] local740 = new int[local728];
			@Pc(743) int[] local743 = new int[local728];
			@Pc(746) int[] local746 = new int[local728];
			for (local748 = 0; local748 < local728; local748++) {
				local731[local748] = Integer.MAX_VALUE;
				local734[local748] = -2147483647;
				local737[local748] = Integer.MAX_VALUE;
				local740[local748] = -2147483647;
				local743[local748] = Integer.MAX_VALUE;
				local746[local748] = -2147483647;
			}
			local716 = new int[local728];
			for (local787 = 0; local787 < this.anInt5711; local787++) {
				local793 = local109[local787];
				if (arg1.aByteArray75[local793] != -1) {
					local807 = arg1.aByteArray75[local793] & 0xFF;
					for (local809 = 0; local809 < 3; local809++) {
						@Pc(818) short local818;
						if (local809 == 0) {
							local818 = arg1.aShortArray193[local793];
						} else if (local809 == 1) {
							local818 = arg1.aShortArray194[local793];
						} else {
							local818 = arg1.aShortArray195[local793];
						}
						local840 = arg1.anIntArray483[local818];
						local845 = arg1.anIntArray478[local818];
						@Pc(850) int local850 = arg1.anIntArray475[local818];
						if (local731[local807] > local840) {
							local731[local807] = local840;
						}
						if (local734[local807] < local840) {
							local734[local807] = local840;
						}
						if (local845 < local737[local807]) {
							local737[local807] = local845;
						}
						if (local740[local807] < local845) {
							local740[local807] = local845;
						}
						if (local743[local807] > local850) {
							local743[local807] = local850;
						}
						if (local850 > local746[local807]) {
							local746[local807] = local850;
						}
					}
				}
			}
			local722 = new float[local728][];
			local720 = new int[local728];
			local718 = new int[local728];
			for (local793 = 0; local793 < local728; local793++) {
				@Pc(947) byte local947 = arg1.aByteArray72[local793];
				if (local947 > 0) {
					local716[local793] = (local734[local793] + local731[local793]) / 2;
					local718[local793] = (local737[local793] + local740[local793]) / 2;
					local720[local793] = (local743[local793] + local746[local793]) / 2;
					if (local947 == 1) {
						local845 = arg1.anIntArray482[local793];
						if (local845 == 0) {
							local1016 = 1.0F;
							local1000 = 1.0F;
						} else if (local845 > 0) {
							local1000 = (float) local845 / 1024.0F;
							local1016 = 1.0F;
						} else {
							local1000 = 1.0F;
							local1016 = (float) -local845 / 1024.0F;
						}
						local1008 = 64.0F / (float) arg1.anIntArray484[local793];
					} else if (local947 == 2) {
						local1000 = 64.0F / (float) arg1.anIntArray477[local793];
						local1008 = 64.0F / (float) arg1.anIntArray484[local793];
						local1016 = 64.0F / (float) arg1.anIntArray482[local793];
					} else {
						local1016 = (float) arg1.anIntArray482[local793] / 1024.0F;
						local1000 = (float) arg1.anIntArray477[local793] / 1024.0F;
						local1008 = (float) arg1.anIntArray484[local793] / 1024.0F;
					}
					local722[local793] = Static66.method1527(local1008, local1016, arg1.aShortArray201[local793], arg1.aShortArray202[local793], arg1.aByteArray77[local793] & 0xFF, local1000, arg1.aShortArray196[local793]);
				}
			}
		}
		@Pc(1125) Class359[] local1125 = new Class359[arg1.anInt6105];
		@Pc(1144) short local1144;
		@Pc(1154) int local1154;
		@Pc(1165) int local1165;
		@Pc(1226) int local1226;
		for (@Pc(1127) int local1127 = 0; local1127 < arg1.anInt6105; local1127++) {
			@Pc(1134) short local1134 = arg1.aShortArray193[local1127];
			@Pc(1139) short local1139 = arg1.aShortArray194[local1127];
			local1144 = arg1.aShortArray195[local1127];
			local1154 = this.anIntArray441[local1139] - this.anIntArray441[local1134];
			local1165 = this.anIntArray443[local1139] - this.anIntArray443[local1134];
			local748 = this.anIntArray440[local1139] - this.anIntArray440[local1134];
			local787 = this.anIntArray441[local1144] - this.anIntArray441[local1134];
			local793 = this.anIntArray443[local1144] - this.anIntArray443[local1134];
			local807 = this.anIntArray440[local1144] - this.anIntArray440[local1134];
			local809 = local1165 * local807 - local793 * local748;
			local1226 = local787 * local748 - local1154 * local807;
			for (local840 = local793 * local1154 - local1165 * local787; local809 > 8192 || local1226 > 8192 || local840 > 8192 || local809 < -8192 || local1226 < -8192 || local840 < -8192; local840 >>= 0x1) {
				local1226 >>= 0x1;
				local809 >>= 0x1;
			}
			local845 = (int) Math.sqrt((double) (local840 * local840 + local809 * local809 + local1226 * local1226));
			if (local845 <= 0) {
				local845 = 1;
			}
			local840 = local840 * 256 / local845;
			local1226 = local1226 * 256 / local845;
			local809 = local809 * 256 / local845;
			@Pc(1322) byte local1322 = arg1.aByteArray73 == null ? 0 : arg1.aByteArray73[local1127];
			if (local1322 == 0) {
				@Pc(1352) Class53 local1352 = local440[local1134];
				local1352.anInt1973 += local809;
				local1352.anInt1976 += local1226;
				local1352.anInt1977 += local840;
				local1352.anInt1975++;
				@Pc(1380) Class53 local1380 = local440[local1139];
				local1380.anInt1976 += local1226;
				local1380.anInt1977 += local840;
				local1380.anInt1975++;
				local1380.anInt1973 += local809;
				@Pc(1408) Class53 local1408 = local440[local1144];
				local1408.anInt1973 += local809;
				local1408.anInt1975++;
				local1408.anInt1977 += local840;
				local1408.anInt1976 += local1226;
			} else if (local1322 == 1) {
				@Pc(1337) Class359 local1337 = local1125[local1127] = new Class359();
				local1337.anInt9213 = local840;
				local1337.anInt9216 = local1226;
				local1337.anInt9215 = local809;
			}
		}
		@Pc(1445) int local1445;
		for (@Pc(1439) int local1439 = 0; local1439 < this.anInt5711; local1439++) {
			local1445 = local109[local1439];
			@Pc(1452) int local1452 = arg1.aShortArray199[local1445] & 0xFFFF;
			@Pc(1457) short local1457;
			if (arg1.aShortArray200 == null) {
				local1457 = -1;
			} else {
				local1457 = arg1.aShortArray200[local1445];
			}
			if (arg1.aByteArray75 == null) {
				local1165 = -1;
			} else {
				local1165 = arg1.aByteArray75[local1445];
			}
			if (arg1.aByteArray76 == null) {
				local748 = 0;
			} else {
				local748 = arg1.aByteArray76[local1445] & 0xFF;
			}
			@Pc(1492) float local1492 = 0.0F;
			@Pc(1494) float local1494 = 0.0F;
			@Pc(1496) float local1496 = 0.0F;
			local1016 = 0.0F;
			local1008 = 0.0F;
			local1000 = 0.0F;
			@Pc(1504) byte local1504 = 0;
			@Pc(1506) byte local1506 = 0;
			@Pc(1508) int local1508 = 0;
			@Pc(1542) byte local1542;
			@Pc(1562) short local1562;
			@Pc(2310) short local2310;
			@Pc(2315) short local2315;
			if (local1457 != -1) {
				if (local1165 == -1) {
					local1492 = 0.0F;
					local1504 = 1;
					local1506 = 2;
					local1016 = 1.0F;
					local1496 = 1.0F;
					local1000 = 0.0F;
					local1008 = 0.0F;
					local1494 = 1.0F;
				} else {
					local1165 &= 0xFF;
					local1542 = arg1.aByteArray72[local1165];
					@Pc(1552) short local1552;
					@Pc(1557) short local1557;
					@Pc(1591) float local1591;
					@Pc(1604) float local1604;
					@Pc(1683) float local1683;
					@Pc(2116) float local2116;
					@Pc(2124) float local2124;
					@Pc(2132) float local2132;
					@Pc(2155) float local2155;
					@Pc(2178) float local2178;
					@Pc(2201) float local2201;
					if (local1542 == 0) {
						local1552 = arg1.aShortArray193[local1445];
						local1557 = arg1.aShortArray194[local1445];
						local1562 = arg1.aShortArray195[local1445];
						local2310 = arg1.aShortArray202[local1165];
						local2315 = arg1.aShortArray196[local1165];
						@Pc(2320) short local2320 = arg1.aShortArray201[local1165];
						@Pc(2326) float local2326 = (float) arg1.anIntArray483[local2310];
						@Pc(2332) float local2332 = (float) arg1.anIntArray478[local2310];
						local1591 = arg1.anIntArray475[local2310];
						local1604 = (float) arg1.anIntArray483[local2315] - local2326;
						local1683 = (float) arg1.anIntArray478[local2315] - local2332;
						@Pc(2362) float local2362 = (float) arg1.anIntArray475[local2315] - local1591;
						@Pc(2371) float local2371 = (float) arg1.anIntArray483[local2320] - local2326;
						@Pc(2380) float local2380 = (float) arg1.anIntArray478[local2320] - local2332;
						@Pc(2388) float local2388 = (float) arg1.anIntArray475[local2320] - local1591;
						@Pc(2396) float local2396 = (float) arg1.anIntArray483[local1552] - local2326;
						@Pc(2404) float local2404 = (float) arg1.anIntArray478[local1552] - local2332;
						@Pc(2413) float local2413 = (float) arg1.anIntArray475[local1552] - local1591;
						@Pc(2422) float local2422 = (float) arg1.anIntArray483[local1557] - local2326;
						@Pc(2430) float local2430 = (float) arg1.anIntArray478[local1557] - local2332;
						local2116 = (float) arg1.anIntArray475[local1557] - local1591;
						local2124 = (float) arg1.anIntArray483[local1562] - local2326;
						local2132 = (float) arg1.anIntArray478[local1562] - local2332;
						local2155 = (float) arg1.anIntArray475[local1562] - local1591;
						local2178 = local2388 * local1683 - local2362 * local2380;
						local2201 = local2362 * local2371 - local1604 * local2388;
						@Pc(2487) float local2487 = local1604 * local2380 - local1683 * local2371;
						@Pc(2495) float local2495 = local2380 * local2487 - local2201 * local2388;
						@Pc(2504) float local2504 = local2178 * local2388 - local2371 * local2487;
						@Pc(2513) float local2513 = local2201 * local2371 - local2178 * local2380;
						@Pc(2527) float local2527 = 1.0F / (local2495 * local1604 + local2504 * local1683 + local2513 * local2362);
						local1492 = (local2396 * local2495 + local2404 * local2504 + local2413 * local2513) * local2527;
						local1496 = local2527 * (local2116 * local2513 + local2504 * local2430 + local2422 * local2495);
						local1008 = local2527 * (local2124 * local2495 + local2132 * local2504 + local2513 * local2155);
						@Pc(2578) float local2578 = local2487 * local1683 - local2201 * local2362;
						@Pc(2586) float local2586 = local2201 * local1604 - local2178 * local1683;
						@Pc(2594) float local2594 = local2178 * local2362 - local1604 * local2487;
						@Pc(2608) float local2608 = 1.0F / (local2586 * local2388 + local2578 * local2371 + local2594 * local2380);
						local1016 = local2608 * (local2594 * local2430 + local2422 * local2578 + local2586 * local2116);
						local1000 = local2608 * (local2124 * local2578 + local2594 * local2132 + local2155 * local2586);
						local1494 = local2608 * (local2586 * local2413 + local2404 * local2594 + local2396 * local2578);
					} else {
						local1552 = arg1.aShortArray193[local1445];
						local1557 = arg1.aShortArray194[local1445];
						local1562 = arg1.aShortArray195[local1445];
						@Pc(1566) int local1566 = local716[local1165];
						@Pc(1570) int local1570 = local718[local1165];
						@Pc(1574) int local1574 = local720[local1165];
						@Pc(1578) float[] local1578 = local722[local1165];
						@Pc(1583) byte local1583 = arg1.aByteArray71[local1165];
						local1591 = (float) arg1.anIntArray480[local1165] / 256.0F;
						if (local1542 == 1) {
							local1604 = (float) arg1.anIntArray477[local1165] / 1024.0F;
							Static409.method5560(local1583, local1591, local1578, local1566, local1604, local1574, local1570, arg1.anIntArray483[local1552], arg1.anIntArray478[local1552], arg1.anIntArray475[local1552]);
							local1492 = Static445.aFloat153;
							local1494 = Static89.aFloat37;
							Static409.method5560(local1583, local1591, local1578, local1566, local1604, local1574, local1570, arg1.anIntArray483[local1557], arg1.anIntArray478[local1557], arg1.anIntArray475[local1557]);
							local1016 = Static89.aFloat37;
							local1496 = Static445.aFloat153;
							Static409.method5560(local1583, local1591, local1578, local1566, local1604, local1574, local1570, arg1.anIntArray483[local1562], arg1.anIntArray478[local1562], arg1.anIntArray475[local1562]);
							local1000 = Static89.aFloat37;
							local1008 = Static445.aFloat153;
							local1683 = local1604 / 2.0F;
							if ((local1583 & 0x1) == 0) {
								if (local1683 < local1496 - local1492) {
									local1504 = 1;
									local1496 -= local1604;
								} else if (local1683 < local1492 - local1496) {
									local1504 = 2;
									local1496 += local1604;
								}
								if (local1008 - local1492 > local1683) {
									local1506 = 1;
									local1008 -= local1604;
								} else if (local1683 < local1492 - local1008) {
									local1506 = 2;
									local1008 += local1604;
								}
							} else {
								if (local1683 < local1000 - local1494) {
									local1000 -= local1604;
									local1506 = 1;
								} else if (local1683 < local1494 - local1000) {
									local1506 = 2;
									local1000 += local1604;
								}
								if (local1683 < local1016 - local1494) {
									local1016 -= local1604;
									local1504 = 1;
								} else if (local1494 - local1016 > local1683) {
									local1504 = 2;
									local1016 += local1604;
								}
							}
						} else if (local1542 == 2) {
							local1604 = (float) arg1.anIntArray476[local1165] / 256.0F;
							local1683 = (float) arg1.anIntArray474[local1165] / 256.0F;
							@Pc(2026) int local2026 = arg1.anIntArray483[local1557] - arg1.anIntArray483[local1552];
							@Pc(2037) int local2037 = arg1.anIntArray478[local1557] - arg1.anIntArray478[local1552];
							@Pc(2048) int local2048 = arg1.anIntArray475[local1557] - arg1.anIntArray475[local1552];
							@Pc(2059) int local2059 = arg1.anIntArray483[local1562] - arg1.anIntArray483[local1552];
							@Pc(2070) int local2070 = arg1.anIntArray478[local1562] - arg1.anIntArray478[local1552];
							@Pc(2081) int local2081 = arg1.anIntArray475[local1562] - arg1.anIntArray475[local1552];
							@Pc(2090) int local2090 = local2037 * local2081 - local2070 * local2048;
							@Pc(2099) int local2099 = local2048 * local2059 - local2026 * local2081;
							@Pc(2108) int local2108 = local2026 * local2070 - local2037 * local2059;
							local2116 = 64.0F / (float) arg1.anIntArray482[local1165];
							local2124 = 64.0F / (float) arg1.anIntArray484[local1165];
							local2132 = 64.0F / (float) arg1.anIntArray477[local1165];
							local2155 = ((float) local2090 * local1578[0] + local1578[1] * (float) local2099 + (float) local2108 * local1578[2]) / local2116;
							local2178 = (local1578[5] * (float) local2108 + local1578[3] * (float) local2090 + (float) local2099 * local1578[4]) / local2124;
							local2201 = ((float) local2108 * local1578[8] + (float) local2099 * local1578[7] + local1578[6] * (float) local2090) / local2132;
							local1508 = Static104.method2219(local2178, local2201, local2155);
							Static280.method4441(local1604, local1578, local1591, local1566, arg1.anIntArray478[local1552], local1508, local1574, local1583, arg1.anIntArray475[local1552], local1683, local1570, arg1.anIntArray483[local1552]);
							local1494 = Static490.aFloat163;
							local1492 = Static397.aFloat147;
							Static280.method4441(local1604, local1578, local1591, local1566, arg1.anIntArray478[local1557], local1508, local1574, local1583, arg1.anIntArray475[local1557], local1683, local1570, arg1.anIntArray483[local1557]);
							local1016 = Static490.aFloat163;
							local1496 = Static397.aFloat147;
							Static280.method4441(local1604, local1578, local1591, local1566, arg1.anIntArray478[local1562], local1508, local1574, local1583, arg1.anIntArray475[local1562], local1683, local1570, arg1.anIntArray483[local1562]);
							local1008 = Static397.aFloat147;
							local1000 = Static490.aFloat163;
						} else if (local1542 == 3) {
							Static101.method2174(arg1.anIntArray483[local1552], local1591, arg1.anIntArray478[local1552], local1574, local1578, local1583, local1566, local1570, arg1.anIntArray475[local1552]);
							local1492 = Static357.aFloat127;
							local1494 = Static468.aFloat155;
							Static101.method2174(arg1.anIntArray483[local1557], local1591, arg1.anIntArray478[local1557], local1574, local1578, local1583, local1566, local1570, arg1.anIntArray475[local1557]);
							local1496 = Static357.aFloat127;
							local1016 = Static468.aFloat155;
							Static101.method2174(arg1.anIntArray483[local1562], local1591, arg1.anIntArray478[local1562], local1574, local1578, local1583, local1566, local1570, arg1.anIntArray475[local1562]);
							local1000 = Static468.aFloat155;
							local1008 = Static357.aFloat127;
							if ((local1583 & 0x1) == 0) {
								if (local1496 - local1492 > 0.5F) {
									local1504 = 1;
									local1496--;
								} else if (local1492 - local1496 > 0.5F) {
									local1504 = 2;
									local1496++;
								}
								if (local1008 - local1492 > 0.5F) {
									local1506 = 1;
									local1008--;
								} else if (local1492 - local1008 > 0.5F) {
									local1008++;
									local1506 = 2;
								}
							} else {
								if (local1016 - local1494 > 0.5F) {
									local1016--;
									local1504 = 1;
								} else if (local1494 - local1016 > 0.5F) {
									local1504 = 2;
									local1016++;
								}
								if (local1000 - local1494 > 0.5F) {
									local1506 = 1;
									local1000--;
								} else if (local1494 - local1000 > 0.5F) {
									local1506 = 2;
									local1000++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray73 == null) {
				local1542 = 0;
			} else {
				local1542 = arg1.aByteArray73[local1445];
			}
			if (local1542 == 0) {
				@Pc(2811) long local2811 = (long) (local1165 << 2) + ((long) (local1508 << 24) + (long) (local1452 << 8) + (long) local748 << 32);
				local1562 = arg1.aShortArray193[local1445];
				local2310 = arg1.aShortArray194[local1445];
				local2315 = arg1.aShortArray195[local1445];
				@Pc(2830) Class53 local2830 = local440[local1562];
				this.aShortArray165[local1439] = this.method4953(local1494, local2830.anInt1976, local1492, local2811, local2830.anInt1973, local2830.anInt1977, local1562, arg1, local2830.anInt1975);
				@Pc(2854) Class53 local2854 = local440[local2310];
				this.aShortArray168[local1439] = this.method4953(local1016, local2854.anInt1976, local1496, (long) local1504 + local2811, local2854.anInt1973, local2854.anInt1977, local2310, arg1, local2854.anInt1975);
				@Pc(2881) Class53 local2881 = local440[local2315];
				this.aShortArray161[local1439] = this.method4953(local1000, local2881.anInt1976, local1008, local2811 + (long) local1506, local2881.anInt1973, local2881.anInt1977, local2315, arg1, local2881.anInt1975);
			} else if (local1542 == 1) {
				@Pc(2671) Class359 local2671 = local1125[local1445];
				@Pc(2715) long local2715 = (long) ((local2671.anInt9213 + 256 << 22) + (local2671.anInt9216 + 256 << 12) + (local1165 << 2) + (local2671.anInt9215 <= 0 ? 2048 : 1024)) + ((long) (local1452 << 8) + (long) (local1508 << 24) + (long) local748 << 32);
				this.aShortArray165[local1439] = this.method4953(local1494, local2671.anInt9216, local1492, local2715, local2671.anInt9215, local2671.anInt9213, arg1.aShortArray193[local1445], arg1, 0);
				this.aShortArray168[local1439] = this.method4953(local1016, local2671.anInt9216, local1496, (long) local1504 + local2715, local2671.anInt9215, local2671.anInt9213, arg1.aShortArray194[local1445], arg1, 0);
				this.aShortArray161[local1439] = this.method4953(local1000, local2671.anInt9216, local1008, local2715 + (long) local1506, local2671.anInt9215, local2671.anInt9213, arg1.aShortArray195[local1445], arg1, 0);
			}
			if (arg1.aShortArray200 == null) {
				this.aShortArray167[local1439] = -1;
			} else {
				this.aShortArray167[local1439] = arg1.aShortArray200[local1445];
			}
			if (arg1.aByteArray76 != null) {
				this.aByteArray67[local1439] = arg1.aByteArray76[local1445];
			}
			if (arg1.aShortArray198 != null) {
				this.aShortArray163[local1439] = arg1.aShortArray198[local1445];
			}
			this.aShortArray162[local1439] = arg1.aShortArray199[local1445];
		}
		local1445 = 0;
		local1144 = -10000;
		for (local1154 = 0; local1154 < this.anInt5686; local1154++) {
			@Pc(2974) short local2974 = this.aShortArray167[local1154];
			if (local1144 != local2974) {
				local1445++;
				local1144 = local2974;
			}
		}
		this.anIntArray444 = new int[local1445 + 1];
		local1144 = -10000;
		local1445 = 0;
		for (local1165 = 0; local1165 < this.anInt5686; local1165++) {
			@Pc(3008) short local3008 = this.aShortArray167[local1165];
			if (local1144 != local3008) {
				local1144 = local3008;
				this.anIntArray444[local1445++] = local1165;
			}
		}
		this.anIntArray444[local1445] = this.anInt5686;
		Static47.aLongArray1 = null;
		this.aShortArray166 = Static337.method5151(this.aShortArray166, this.anInt5719);
		this.aShortArray169 = Static337.method5151(this.aShortArray169, this.anInt5719);
		this.aShortArray171 = Static337.method5151(this.aShortArray171, this.anInt5719);
		this.aByteArray68 = Static334.method5136(this.aByteArray68, this.anInt5719);
		this.aFloatArray44 = Static172.method2979(this.anInt5719, this.aFloatArray44);
		this.aFloatArray45 = Static172.method2979(this.anInt5719, this.aFloatArray45);
		if (arg1.anIntArray485 != null && Static2.method16(arg2, this.anInt5746)) {
			this.anIntArrayArray44 = arg1.method5284(false);
		}
		if (arg1.aClass161Array1 != null && Static403.method5868(this.anInt5746, arg2)) {
			this.anIntArrayArray45 = arg1.method5294();
		}
		if (arg1.anIntArray479 != null && Static502.method6774(arg2, this.anInt5746)) {
			local748 = 0;
			@Pc(3123) int[] local3123 = new int[256];
			for (local793 = 0; local793 < this.anInt5711; local793++) {
				local807 = arg1.anIntArray479[local109[local793]];
				if (local807 >= 0) {
					@Pc(3140) int local3140 = local3123[local807]++;
					if (local807 > local748) {
						local748 = local807;
					}
				}
			}
			this.anIntArrayArray46 = new int[local748 + 1][];
			for (local807 = 0; local807 <= local748; local807++) {
				this.anIntArrayArray46[local807] = new int[local3123[local807]];
				local3123[local807] = 0;
			}
			for (local809 = 0; local809 < this.anInt5711; local809++) {
				local1226 = arg1.anIntArray479[local109[local809]];
				if (local1226 >= 0) {
					this.anIntArrayArray46[local1226][local3123[local1226]++] = local809;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()[Lclient!aq;")
	@Override
	public Class15[] method7516() {
		return this.aClass15Array2;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()[Lclient!tk;")
	@Override
	public Class323[] method7503() {
		return this.aClass323Array2;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method4940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > arg5 && arg5 < arg3 && arg0 > arg5) {
			return false;
		} else if (arg1 < arg5 && arg5 > arg3 && arg0 < arg5) {
			return false;
		} else if (arg2 < arg6 && arg2 < arg7 && arg2 < arg4) {
			return false;
		} else {
			return arg6 >= arg2 || arg7 >= arg2 || arg4 >= arg2;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	private void method4941() {
		if (this.anInt5686 == 0) {
			return;
		}
		if (this.aByte68 != 0) {
			this.method4947(true);
		}
		this.method4947(false);
		if (this.aClass167_1 != null) {
			if (this.aClass167_1.anInterface5_1 == null) {
				this.method4948((this.aByte68 & 0x10) != 0);
			}
			if (this.aClass167_1.anInterface5_1 != null) {
				this.aClass43_Sub3_22.method7298(this.aClass280_7 != null);
				this.aClass43_Sub3_22.method7303(this.aClass280_5, this.aClass280_6, this.aClass280_8, this.aClass280_7);
				@Pc(73) int local73 = this.anIntArray444.length - 1;
				for (@Pc(75) int local75 = 0; local75 < local73; local75++) {
					@Pc(82) int local82 = this.anIntArray444[local75];
					@Pc(89) int local89 = this.anIntArray444[local75 + 1];
					@Pc(96) int local96 = this.aShortArray167[local82] & 0xFFFF;
					if (local96 == 65535) {
						local96 = -1;
					}
					this.aClass43_Sub3_22.method7232(this.aClass280_7 != null, local96);
					this.aClass43_Sub3_22.method7224(this.aClass167_1.anInterface5_1, local82 * 3, (local89 - local82) * 3);
				}
			}
		}
		this.method4951();
	}

	@OriginalMember(owner = "client!mb", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class139 arg2, @OriginalArg(3) Class139 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean465) {
			this.method4955();
		}
		@Pc(16) int local16 = this.aShort66 + arg4;
		@Pc(21) int local21 = this.aShort69 + arg4;
		@Pc(26) int local26 = arg6 + this.aShort71;
		@Pc(31) int local31 = arg6 + this.aShort74;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8179 <= arg2.anInt8178 + local21 >> arg2.anInt8176 || local26 < 0 || local31 + arg2.anInt8178 >> arg2.anInt8176 >= arg2.anInt8180)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8178 + local21 >> arg3.anInt8176 >= arg3.anInt8179 || local26 < 0 || local31 + arg3.anInt8178 >> arg3.anInt8176 >= arg3.anInt8180) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8176;
			local21 = local21 + arg2.anInt8178 - 1 >> arg2.anInt8176;
			local26 >>= arg2.anInt8176;
			local31 = arg2.anInt8178 + local31 - 1 >> arg2.anInt8176;
			if (arg5 == arg2.method6889(local16, local26) && arg5 == arg2.method6889(local21, local26) && arg5 == arg2.method6889(local16, local31) && arg2.method6889(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(197) int local197;
		if (arg0 == 1) {
			for (local197 = 0; local197 < this.anInt5717; local197++) {
				this.anIntArray443[local197] = this.anIntArray443[local197] + arg2.method6890(arg4 + this.anIntArray441[local197], this.anIntArray440[local197] - -arg6) - arg5;
			}
		} else {
			@Pc(249) int local249;
			@Pc(260) int local260;
			if (arg0 == 2) {
				@Pc(244) short local244 = this.aShort75;
				if (local244 == 0) {
					return;
				}
				for (local249 = 0; local249 < this.anInt5717; local249++) {
					local260 = (this.anIntArray443[local249] << 16) / local244;
					if (arg1 > local260) {
						this.anIntArray443[local249] -= -((arg2.method6890(arg4 + this.anIntArray441[local249], this.anIntArray440[local249] + arg6) - arg5) * (arg1 + -local260) / arg1);
					}
				}
			} else {
				@Pc(346) int local346;
				if (arg0 == 3) {
					local197 = (arg1 & 0xFF) * 4;
					local249 = (arg1 >> 8 & 0xFF) * 4;
					local260 = (arg1 >> 16 & 0xFF) << 6;
					local346 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local197 >> 1) < 0 || arg4 + (local197 >> 1) + arg2.anInt8178 >= arg2.anInt8179 << arg2.anInt8176 || arg6 - (local249 >> 1) < 0 || arg2.anInt8180 << arg2.anInt8176 <= arg2.anInt8178 + arg6 + (local249 >> 1)) {
						return;
					}
					this.method7514(arg5, local260, local346, local249, local197, arg2, arg6, arg4);
				} else if (arg0 == 4) {
					local197 = this.aShort67 - this.aShort75;
					for (local249 = 0; local249 < this.anInt5717; local249++) {
						this.anIntArray443[local249] = local197 + this.anIntArray443[local249] + arg3.method6890(this.anIntArray441[local249] + arg4, this.anIntArray440[local249] - -arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local197 = this.aShort67 - this.aShort75;
					for (local249 = 0; local249 < this.anInt5717; local249++) {
						local260 = arg4 + this.anIntArray441[local249];
						local346 = this.anIntArray440[local249] + arg6;
						@Pc(500) int local500 = arg2.method6890(local260, local346);
						@Pc(506) int local506 = arg3.method6890(local260, local346);
						@Pc(514) int local514 = local500 - local506 - arg1;
						this.anIntArray443[local249] = local500 + (local514 * ((this.anIntArray443[local249] << 8) / local197) >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean465 = false;
		if (this.aClass280_6 != null) {
			this.aClass280_6.anInterface7_5 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLclient!mb;Lclient!mb;ZII)Lclient!da;")
	private Class57 method4943(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class57_Sub2 arg1, @OriginalArg(2) Class57_Sub2 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		arg2.aByte68 = 0;
		arg2.anInt5719 = this.anInt5719;
		arg2.anInt5702 = this.anInt5702;
		arg2.aShort70 = this.aShort70;
		arg2.anInt5717 = this.anInt5717;
		arg2.anInt5741 = this.anInt5741;
		arg2.aShort73 = this.aShort73;
		if ((arg4 & 0x100) == 0) {
			arg2.aBoolean464 = this.aBoolean464;
		} else {
			arg2.aBoolean464 = true;
		}
		arg2.anInt5725 = arg4;
		arg2.anInt5746 = this.anInt5746;
		arg2.anInt5686 = this.anInt5686;
		arg2.anInt5711 = this.anInt5711;
		@Pc(69) boolean local69 = Static178.method6932(arg4, this.anInt5746);
		@Pc(75) boolean local75 = Static442.method7188(this.anInt5746, arg4);
		@Pc(81) boolean local81 = Static2.method13(arg4, this.anInt5746);
		@Pc(87) boolean local87 = local81 | local75 | local69;
		@Pc(206) int local206;
		if (local87) {
			if (!local69) {
				arg2.anIntArray441 = this.anIntArray441;
			} else if (arg1.anIntArray441 == null || arg1.anIntArray441.length < this.anInt5741) {
				arg2.anIntArray441 = arg1.anIntArray441 = new int[this.anInt5741];
			} else {
				arg2.anIntArray441 = arg1.anIntArray441;
			}
			if (!local75) {
				arg2.anIntArray443 = this.anIntArray443;
			} else if (arg1.anIntArray443 == null || this.anInt5741 > arg1.anIntArray443.length) {
				arg2.anIntArray443 = arg1.anIntArray443 = new int[this.anInt5741];
			} else {
				arg2.anIntArray443 = arg1.anIntArray443;
			}
			if (!local81) {
				arg2.anIntArray440 = this.anIntArray440;
			} else if (arg1.anIntArray440 == null || arg1.anIntArray440.length < this.anInt5741) {
				arg2.anIntArray440 = arg1.anIntArray440 = new int[this.anInt5741];
			} else {
				arg2.anIntArray440 = arg1.anIntArray440;
			}
			for (local206 = 0; local206 < this.anInt5741; local206++) {
				if (local69) {
					arg2.anIntArray441[local206] = this.anIntArray441[local206];
				}
				if (local75) {
					arg2.anIntArray443[local206] = this.anIntArray443[local206];
				}
				if (local81) {
					arg2.anIntArray440[local206] = this.anIntArray440[local206];
				}
			}
		} else {
			arg2.anIntArray440 = this.anIntArray440;
			arg2.anIntArray443 = this.anIntArray443;
			arg2.anIntArray441 = this.anIntArray441;
		}
		if (Static13.method5362(this.anInt5746, arg4)) {
			if (arg0) {
				arg2.aByte68 = (byte) (arg2.aByte68 | 0x1);
			}
			arg2.aClass280_6 = arg1.aClass280_6;
			arg2.aClass280_6.anInterface7_5 = this.aClass280_6.anInterface7_5;
			arg2.aClass280_6.aByte102 = this.aClass280_6.aByte102;
		} else if (Static550.method6451(this.anInt5746, arg4)) {
			arg2.aClass280_6 = this.aClass280_6;
		} else {
			arg2.aClass280_6 = null;
		}
		if (Static582.method7700(this.anInt5746, arg4)) {
			if (arg1.aShortArray162 == null || arg1.aShortArray162.length < this.anInt5711) {
				arg2.aShortArray162 = arg1.aShortArray162 = new short[this.anInt5711];
			} else {
				arg2.aShortArray162 = arg1.aShortArray162;
			}
			for (local206 = 0; local206 < this.anInt5711; local206++) {
				arg2.aShortArray162[local206] = this.aShortArray162[local206];
			}
		} else {
			arg2.aShortArray162 = this.aShortArray162;
		}
		if (Static594.method7798(arg4, this.anInt5746)) {
			if (arg1.aByteArray67 == null || arg1.aByteArray67.length < this.anInt5711) {
				arg2.aByteArray67 = arg1.aByteArray67 = new byte[this.anInt5711];
			} else {
				arg2.aByteArray67 = arg1.aByteArray67;
			}
			for (local206 = 0; local206 < this.anInt5711; local206++) {
				arg2.aByteArray67[local206] = this.aByteArray67[local206];
			}
		} else {
			arg2.aByteArray67 = this.aByteArray67;
		}
		if (Static310.method4847(arg4, this.anInt5746)) {
			if (arg0) {
				arg2.aByte68 = (byte) (arg2.aByte68 | 0x2);
			}
			arg2.aClass280_8 = arg1.aClass280_8;
			arg2.aClass280_8.aByte102 = this.aClass280_8.aByte102;
			arg2.aClass280_8.anInterface7_5 = this.aClass280_8.anInterface7_5;
		} else if (Static453.method6303(arg4, this.anInt5746)) {
			arg2.aClass280_8 = this.aClass280_8;
		} else {
			arg2.aClass280_8 = null;
		}
		@Pc(600) int local600;
		if (Static26.method7436(this.anInt5746, arg4)) {
			if (arg1.aShortArray166 == null || this.anInt5719 > arg1.aShortArray166.length) {
				local206 = this.anInt5719;
				arg2.aShortArray169 = arg1.aShortArray169 = new short[local206];
				arg2.aShortArray166 = arg1.aShortArray166 = new short[local206];
				arg2.aShortArray171 = arg1.aShortArray171 = new short[local206];
			} else {
				arg2.aShortArray166 = arg1.aShortArray166;
				arg2.aShortArray169 = arg1.aShortArray169;
				arg2.aShortArray171 = arg1.aShortArray171;
			}
			if (this.aClass18_1 == null) {
				for (local206 = 0; local206 < this.anInt5719; local206++) {
					arg2.aShortArray166[local206] = this.aShortArray166[local206];
					arg2.aShortArray169[local206] = this.aShortArray169[local206];
					arg2.aShortArray171[local206] = this.aShortArray171[local206];
				}
			} else {
				if (arg1.aClass18_1 == null) {
					arg1.aClass18_1 = new Class18();
				}
				@Pc(588) Class18 local588 = arg2.aClass18_1 = arg1.aClass18_1;
				if (local588.aShortArray9 == null || local588.aShortArray9.length < this.anInt5719) {
					local600 = this.anInt5719;
					local588.aShortArray10 = new short[local600];
					local588.aByteArray4 = new byte[local600];
					local588.aShortArray11 = new short[local600];
					local588.aShortArray9 = new short[local600];
				}
				for (local600 = 0; local600 < this.anInt5719; local600++) {
					arg2.aShortArray166[local600] = this.aShortArray166[local600];
					arg2.aShortArray169[local600] = this.aShortArray169[local600];
					arg2.aShortArray171[local600] = this.aShortArray171[local600];
					local588.aShortArray9[local600] = this.aClass18_1.aShortArray9[local600];
					local588.aShortArray11[local600] = this.aClass18_1.aShortArray11[local600];
					local588.aShortArray10[local600] = this.aClass18_1.aShortArray10[local600];
					local588.aByteArray4[local600] = this.aClass18_1.aByteArray4[local600];
				}
			}
			arg2.aByteArray68 = this.aByteArray68;
		} else {
			arg2.aByteArray68 = this.aByteArray68;
			arg2.aClass18_1 = this.aClass18_1;
			arg2.aShortArray171 = this.aShortArray171;
			arg2.aShortArray166 = this.aShortArray166;
			arg2.aShortArray169 = this.aShortArray169;
		}
		if (Static534.method7032(this.anInt5746, arg4)) {
			arg2.aClass280_7 = arg1.aClass280_7;
			if (arg0) {
				arg2.aByte68 = (byte) (arg2.aByte68 | 0x4);
			}
			arg2.aClass280_7.anInterface7_5 = this.aClass280_7.anInterface7_5;
			arg2.aClass280_7.aByte102 = this.aClass280_7.aByte102;
		} else if (Static174.method3023(arg4, this.anInt5746)) {
			arg2.aClass280_7 = this.aClass280_7;
		} else {
			arg2.aClass280_7 = null;
		}
		if (Static62.method4211(this.anInt5746, arg4)) {
			if (arg1.aFloatArray44 == null || this.anInt5711 > arg1.aFloatArray44.length) {
				local206 = this.anInt5719;
				arg2.aFloatArray45 = arg1.aFloatArray45 = new float[local206];
				arg2.aFloatArray44 = arg1.aFloatArray44 = new float[local206];
			} else {
				arg2.aFloatArray45 = arg1.aFloatArray45;
				arg2.aFloatArray44 = arg1.aFloatArray44;
			}
			for (local206 = 0; local206 < this.anInt5719; local206++) {
				arg2.aFloatArray44[local206] = this.aFloatArray44[local206];
				arg2.aFloatArray45[local206] = this.aFloatArray45[local206];
			}
		} else {
			arg2.aFloatArray45 = this.aFloatArray45;
			arg2.aFloatArray44 = this.aFloatArray44;
		}
		if (Static237.method3978(this.anInt5746, arg4)) {
			arg2.aClass280_5 = arg1.aClass280_5;
			if (arg0) {
				arg2.aByte68 = (byte) (arg2.aByte68 | 0x8);
			}
			arg2.aClass280_5.aByte102 = this.aClass280_5.aByte102;
			arg2.aClass280_5.anInterface7_5 = this.aClass280_5.anInterface7_5;
		} else if (Static458.method6369(this.anInt5746, arg4)) {
			arg2.aClass280_5 = this.aClass280_5;
		} else {
			arg2.aClass280_5 = null;
		}
		if (Static76.method1689(arg4, this.anInt5746)) {
			if (arg1.aShortArray165 == null || arg1.aShortArray165.length < this.anInt5711) {
				local206 = this.anInt5711;
				arg2.aShortArray161 = arg1.aShortArray161 = new short[local206];
				arg2.aShortArray165 = arg1.aShortArray165 = new short[local206];
				arg2.aShortArray168 = arg1.aShortArray168 = new short[local206];
			} else {
				arg2.aShortArray165 = arg1.aShortArray165;
				arg2.aShortArray168 = arg1.aShortArray168;
				arg2.aShortArray161 = arg1.aShortArray161;
			}
			for (local206 = 0; local206 < this.anInt5711; local206++) {
				arg2.aShortArray165[local206] = this.aShortArray165[local206];
				arg2.aShortArray168[local206] = this.aShortArray168[local206];
				arg2.aShortArray161[local206] = this.aShortArray161[local206];
			}
		} else {
			arg2.aShortArray165 = this.aShortArray165;
			arg2.aShortArray168 = this.aShortArray168;
			arg2.aShortArray161 = this.aShortArray161;
		}
		if (Static6.method101(arg4, this.anInt5746)) {
			arg2.aClass167_1 = arg1.aClass167_1;
			if (arg0) {
				arg2.aByte68 = (byte) (arg2.aByte68 | 0x10);
			}
			arg2.aClass167_1.anInterface5_1 = this.aClass167_1.anInterface5_1;
		} else if (Static440.method3644(this.anInt5746, arg4)) {
			arg2.aClass167_1 = this.aClass167_1;
		} else {
			arg2.aClass167_1 = null;
		}
		if (Static88.method1971(arg4, this.anInt5746)) {
			if (arg1.aShortArray167 == null || this.anInt5711 > arg1.aShortArray167.length) {
				local206 = this.anInt5711;
				arg2.aShortArray167 = arg1.aShortArray167 = new short[local206];
			} else {
				arg2.aShortArray167 = arg1.aShortArray167;
			}
			for (local206 = 0; local206 < this.anInt5711; local206++) {
				arg2.aShortArray167[local206] = this.aShortArray167[local206];
			}
		} else {
			arg2.aShortArray167 = this.aShortArray167;
		}
		if (!Static191.method3279(arg4, this.anInt5746)) {
			arg2.aClass178Array1 = this.aClass178Array1;
		} else if (arg1.aClass178Array1 == null || arg1.aClass178Array1.length < this.anInt5702) {
			local206 = this.anInt5702;
			arg2.aClass178Array1 = arg1.aClass178Array1 = new Class178[local206];
			for (local600 = 0; local600 < this.anInt5702; local600++) {
				arg2.aClass178Array1[local600] = this.aClass178Array1[local600].method4354();
			}
		} else {
			arg2.aClass178Array1 = arg1.aClass178Array1;
			for (local206 = 0; local206 < this.anInt5702; local206++) {
				arg2.aClass178Array1[local206].method4357(this.aClass178Array1[local206]);
			}
		}
		arg2.aClass162Array1 = this.aClass162Array1;
		arg2.aShortArray163 = this.aShortArray163;
		arg2.aShortArray164 = this.aShortArray164;
		arg2.anIntArrayArray45 = this.anIntArrayArray45;
		arg2.anIntArray442 = this.anIntArray442;
		arg2.aClass15Array2 = this.aClass15Array2;
		arg2.aClass323Array2 = this.aClass323Array2;
		arg2.anIntArrayArray44 = this.anIntArrayArray44;
		if (this.aBoolean465) {
			arg2.aShort75 = this.aShort75;
			arg2.aShort74 = this.aShort74;
			arg2.aShort67 = this.aShort67;
			arg2.aShort72 = this.aShort72;
			arg2.aShort69 = this.aShort69;
			arg2.aBoolean465 = true;
			arg2.aShort66 = this.aShort66;
			arg2.aShort71 = this.aShort71;
			arg2.aShort68 = this.aShort68;
		} else {
			arg2.aBoolean465 = false;
		}
		arg2.anIntArrayArray46 = this.anIntArrayArray46;
		arg2.anIntArray444 = this.anIntArray444;
		arg2.aShortArray170 = this.aShortArray170;
		return arg2;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!q;Lclient!ql;II)V")
	@Override
	public void method7521(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5719 == 0) {
			return;
		}
		@Pc(16) Class109_Sub2 local16 = this.aClass43_Sub3_22.aClass109_Sub2_3;
		@Pc(19) Class109_Sub2 local19 = (Class109_Sub2) arg0;
		if (!this.aBoolean465) {
			this.method4955();
		}
		Static544.aFloat198 = local16.aFloat165 + local16.aFloat166 * local19.aFloat170 + local16.aFloat168 * local19.aFloat174 + local19.aFloat165 * local16.aFloat164;
		Static240.aFloat88 = local19.aFloat167 * local16.aFloat168 + local16.aFloat166 * local19.aFloat173 + local16.aFloat164 * local19.aFloat168;
		@Pc(72) float local72 = Static240.aFloat88 * (float) this.aShort75 + Static544.aFloat198;
		@Pc(80) float local80 = Static240.aFloat88 * (float) this.aShort67 + Static544.aFloat198;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local91 = (float) -this.aShort72 + local80;
			local97 = local72 + (float) this.aShort72;
		} else {
			local97 = (float) this.aShort72 + local80;
			local91 = local72 - (float) this.aShort72;
		}
		if (this.aClass43_Sub3_22.aFloat203 <= local91 || (float) this.aClass43_Sub3_22.anInt8758 >= local97) {
			return;
		}
		Static79.aFloat31 = local16.aFloat172 * local19.aFloat173 + local19.aFloat167 * local16.aFloat173 + local16.aFloat171 * local19.aFloat168;
		Static580.aFloat223 = local16.aFloat170 + local19.aFloat165 * local16.aFloat171 + local16.aFloat173 * local19.aFloat174 + local16.aFloat172 * local19.aFloat170;
		@Pc(173) float local173 = (float) this.aShort75 * Static79.aFloat31 + Static580.aFloat223;
		@Pc(181) float local181 = Static79.aFloat31 * (float) this.aShort67 + Static580.aFloat223;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local181 < local173) {
			local207 = (float) this.aClass43_Sub3_22.anInt8760 * (local173 + (float) this.aShort72);
			local196 = (local181 - (float) this.aShort72) * (float) this.aClass43_Sub3_22.anInt8760;
		} else {
			local196 = (local173 - (float) this.aShort72) * (float) this.aClass43_Sub3_22.anInt8760;
			local207 = (float) this.aClass43_Sub3_22.anInt8760 * ((float) this.aShort72 + local181);
		}
		if (this.aClass43_Sub3_22.aFloat212 <= local196 / (float) arg2 || this.aClass43_Sub3_22.aFloat199 >= local207 / (float) arg2) {
			return;
		}
		Static365.aFloat225 = local16.aFloat174 + local16.aFloat169 * local19.aFloat165 + local19.aFloat170 * local16.aFloat175 + local19.aFloat174 * local16.aFloat167;
		Static94.aFloat38 = local16.aFloat167 * local19.aFloat167 + local16.aFloat175 * local19.aFloat173 + local19.aFloat168 * local16.aFloat169;
		@Pc(298) float local298 = Static365.aFloat225 + Static94.aFloat38 * (float) this.aShort75;
		@Pc(306) float local306 = Static365.aFloat225 + Static94.aFloat38 * (float) this.aShort67;
		@Pc(333) float local333;
		@Pc(321) float local321;
		if (local298 > local306) {
			local333 = (local306 - (float) this.aShort72) * (float) this.aClass43_Sub3_22.anInt8769;
			local321 = (float) this.aClass43_Sub3_22.anInt8769 * ((float) this.aShort72 + local298);
		} else {
			local321 = (float) this.aClass43_Sub3_22.anInt8769 * ((float) this.aShort72 + local306);
			local333 = ((float) -this.aShort72 + local298) * (float) this.aClass43_Sub3_22.anInt8769;
		}
		if (this.aClass43_Sub3_22.aFloat204 <= local333 / (float) arg2 || local321 / (float) arg2 <= this.aClass43_Sub3_22.aFloat200) {
			return;
		}
		if (arg1 != null || this.aClass162Array1 != null) {
			Static58.aFloat10 = local19.aFloat172 * local16.aFloat175 + local16.aFloat167 * local19.aFloat175 + local16.aFloat169 * local19.aFloat166;
			Static536.aFloat185 = local16.aFloat166 * local19.aFloat172 + local16.aFloat168 * local19.aFloat175 + local16.aFloat164 * local19.aFloat166;
			Static200.aFloat83 = local19.aFloat175 * local16.aFloat173 + local19.aFloat172 * local16.aFloat172 + local19.aFloat166 * local16.aFloat171;
			Static380.aFloat145 = local19.aFloat171 * local16.aFloat175 + local16.aFloat167 * local19.aFloat169 + local16.aFloat169 * local19.aFloat164;
			Static288.aFloat112 = local16.aFloat171 * local19.aFloat164 + local16.aFloat172 * local19.aFloat171 + local16.aFloat173 * local19.aFloat169;
			Static232.aFloat86 = local16.aFloat164 * local19.aFloat164 + local16.aFloat166 * local19.aFloat171 + local16.aFloat168 * local19.aFloat169;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.aShort69 + this.aShort66 >> 1;
			@Pc(508) int local508 = this.aShort74 + this.aShort71 >> 1;
			@Pc(527) int local527 = (int) ((float) this.aShort75 * Static79.aFloat31 + (float) local500 * Static200.aFloat83 + Static580.aFloat223 + Static288.aFloat112 * (float) local508);
			@Pc(546) int local546 = (int) ((float) this.aShort75 * Static94.aFloat38 + Static58.aFloat10 * (float) local500 + Static365.aFloat225 + (float) local508 * Static380.aFloat145);
			@Pc(565) int local565 = (int) ((float) this.aShort75 * Static240.aFloat88 + Static544.aFloat198 + (float) local500 * Static536.aFloat185 + Static232.aFloat86 * (float) local508);
			@Pc(584) int local584 = (int) (Static288.aFloat112 * (float) local508 + Static200.aFloat83 * (float) local500 + Static580.aFloat223 + Static79.aFloat31 * (float) this.aShort67);
			@Pc(603) int local603 = (int) (Static94.aFloat38 * (float) this.aShort67 + Static365.aFloat225 + (float) local500 * Static58.aFloat10 + (float) local508 * Static380.aFloat145);
			arg1.anInt7173 = local546 * this.aClass43_Sub3_22.anInt8769 / arg2 + this.aClass43_Sub3_22.anInt8752;
			arg1.anInt7169 = this.aClass43_Sub3_22.anInt8753 + this.aClass43_Sub3_22.anInt8760 * local527 / arg2;
			arg1.anInt7170 = this.aClass43_Sub3_22.anInt8753 + local584 * this.aClass43_Sub3_22.anInt8760 / arg2;
			arg1.anInt7171 = this.aClass43_Sub3_22.anInt8752 + local603 * this.aClass43_Sub3_22.anInt8769 / arg2;
			@Pc(675) int local675 = (int) (Static232.aFloat86 * (float) local508 + Static240.aFloat88 * (float) this.aShort67 + Static536.aFloat185 * (float) local500 + Static544.aFloat198);
			if (this.aClass43_Sub3_22.anInt8758 <= local565 || this.aClass43_Sub3_22.anInt8758 <= local675) {
				arg1.aBoolean567 = true;
				arg1.anInt7172 = this.aClass43_Sub3_22.anInt8753 + this.aClass43_Sub3_22.anInt8760 * (this.aShort72 + local527) / arg2 - arg1.anInt7169;
			}
		}
		this.aClass43_Sub3_22.method7256((float) arg2);
		this.aClass43_Sub3_22.method7219();
		this.aClass43_Sub3_22.method7242(local19);
		this.method4941();
		this.aClass43_Sub3_22.method7295();
		this.method4949();
	}

	@OriginalMember(owner = "client!mb", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub17.anIntArray175[arg0];
		@Pc(13) int local13 = Class3_Sub17.anIntArray177[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5717; local15++) {
			local33 = local13 * this.anIntArray441[local15] + local9 * this.anIntArray440[local15] >> 14;
			this.anIntArray440[local15] = local13 * this.anIntArray440[local15] - this.anIntArray441[local15] * local9 >> 14;
			this.anIntArray441[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5719; local33++) {
			@Pc(83) int local83 = this.aShortArray166[local33] * local13 + local9 * this.aShortArray171[local33] >> 14;
			this.aShortArray171[local33] = (short) (local13 * this.aShortArray171[local33] - this.aShortArray166[local33] * local9 >> 14);
			this.aShortArray166[local33] = (short) local83;
		}
		if (this.aClass280_7 == null && this.aClass280_8 != null) {
			this.aClass280_8.anInterface7_5 = null;
		}
		if (this.aClass280_7 != null) {
			this.aClass280_7.anInterface7_5 = null;
		}
		if (this.aClass280_6 != null) {
			this.aClass280_6.anInterface7_5 = null;
		}
		this.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ffa;I)V")
	private void method4944(@OriginalArg(0) Class3_Sub3_Sub10_Sub1 arg0) {
		if (this.anInt5719 > this.aClass43_Sub3_22.anIntArray643.length) {
			this.aClass43_Sub3_22.anIntArray642 = new int[this.anInt5719];
			this.aClass43_Sub3_22.anIntArray643 = new int[this.anInt5719];
		}
		@Pc(32) int[] local32 = this.aClass43_Sub3_22.anIntArray643;
		@Pc(36) int[] local36 = this.aClass43_Sub3_22.anIntArray642;
		@Pc(64) int local64;
		@Pc(102) int local102;
		@Pc(111) int local111;
		for (@Pc(38) int local38 = 0; local38 < this.anInt5717; local38++) {
			local64 = (this.anIntArray441[local38] - (this.aClass43_Sub3_22.anInt8772 * this.anIntArray443[local38] >> 8) >> this.aClass43_Sub3_22.anInt8734) - arg0.anInt3006;
			@Pc(88) int local88 = (this.anIntArray440[local38] - (this.aClass43_Sub3_22.anInt8771 * this.anIntArray443[local38] >> 8) >> this.aClass43_Sub3_22.anInt8734) - arg0.anInt3009;
			@Pc(93) int local93 = this.anIntArray442[local38];
			@Pc(100) int local100 = this.anIntArray442[local38 + 1];
			for (local102 = local93; local102 < local100; local102++) {
				local111 = this.aShortArray164[local102] - 1;
				if (local111 == -1) {
					break;
				}
				local32[local111] = local64;
				local36[local111] = local88;
			}
		}
		for (local64 = 0; local64 < this.anInt5686; local64++) {
			if (this.aByteArray67 == null || this.aByteArray67[local64] <= 128) {
				@Pc(153) short local153 = this.aShortArray165[local64];
				@Pc(158) short local158 = this.aShortArray168[local64];
				@Pc(163) short local163 = this.aShortArray161[local64];
				local102 = local32[local153];
				local111 = local32[local158];
				@Pc(175) int local175 = local32[local163];
				@Pc(179) int local179 = local36[local153];
				@Pc(183) int local183 = local36[local158];
				@Pc(187) int local187 = local36[local163];
				if ((local183 - local187) * (local102 - local111) - (local175 - local111) * (local183 - local179) > 0) {
					arg0.method2710(local183, local102, local179, local187, local175, local111);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean465) {
			this.method4955();
		}
		return this.aShort66;
	}

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static480.anInt7789 = 0;
			Static369.anInt6329 = 0;
			Static88.anInt2201 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray44.length > local41) {
					local55 = this.anIntArrayArray44[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray170 == null || (this.aShortArray170[local63] & arg6) != 0) {
							Static369.anInt6329 += this.anIntArray441[local63];
							Static480.anInt7789 += this.anIntArray443[local63];
							Static88.anInt2201 += this.anIntArray440[local63];
							local33++;
						}
					}
				}
			}
			if (local33 > 0) {
				Static88.anInt2201 = Static88.anInt2201 / local33 + arg4;
				Static269.aBoolean392 = true;
				Static480.anInt7789 = arg3 + Static480.anInt7789 / local33;
				Static369.anInt6329 = Static369.anInt6329 / local33 + arg2;
			} else {
				Static480.anInt7789 = arg3;
				Static369.anInt6329 = arg2;
				Static88.anInt2201 = arg4;
			}
			return;
		}
		@Pc(246) int[] local246;
		@Pc(248) int local248;
		if (arg0 == 1) {
			if (arg7 != null) {
				local33 = arg7[2] * arg4 + arg7[0] * arg2 + arg3 * arg7[1] + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
				local41 = arg4 * arg7[8] + arg2 * arg7[6] + arg3 * arg7[7] + 8192 >> 14;
				arg3 = local35;
				arg4 = local41;
				arg2 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray44.length) {
					local246 = this.anIntArrayArray44[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local57 = local246[local248];
						if (this.aShortArray170 == null || (this.aShortArray170[local57] & arg6) != 0) {
							this.anIntArray441[local57] += arg2;
							this.anIntArray443[local57] += arg3;
							this.anIntArray440[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(384) int local384;
		@Pc(402) int local402;
		@Pc(628) int local628;
		@Pc(637) int local637;
		@Pc(646) int local646;
		@Pc(650) int local650;
		@Pc(668) int local668;
		@Pc(1014) int local1014;
		@Pc(1022) int local1022;
		@Pc(1178) int local1178;
		@Pc(1203) int local1203;
		@Pc(1208) int local1208;
		@Pc(1217) int local1217;
		@Pc(1222) int local1222;
		@Pc(1226) int local1226;
		@Pc(1230) int local1230;
		@Pc(1232) int local1232;
		@Pc(1365) int[] local1365;
		@Pc(1367) int local1367;
		@Pc(1371) int local1371;
		@Pc(1375) int local1375;
		@Pc(1377) int local1377;
		@Pc(1506) int local1506;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray44.length) {
						local246 = this.anIntArrayArray44[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local57 = local246[local248];
							if (this.aShortArray170 == null || (this.aShortArray170[local57] & arg6) != 0) {
								this.anIntArray441[local57] -= Static369.anInt6329;
								this.anIntArray443[local57] -= Static480.anInt7789;
								this.anIntArray440[local57] -= Static88.anInt2201;
								if (arg4 != 0) {
									local63 = Class3_Sub17.anIntArray175[arg4];
									local384 = Class3_Sub17.anIntArray177[arg4];
									local402 = local384 * this.anIntArray441[local57] + local63 * this.anIntArray443[local57] + 16383 >> 14;
									this.anIntArray443[local57] = local384 * this.anIntArray443[local57] + 16383 - this.anIntArray441[local57] * local63 >> 14;
									this.anIntArray441[local57] = local402;
								}
								if (arg2 != 0) {
									local63 = Class3_Sub17.anIntArray175[arg2];
									local384 = Class3_Sub17.anIntArray177[arg2];
									local402 = this.anIntArray443[local57] * local384 + 16383 - this.anIntArray440[local57] * local63 >> 14;
									this.anIntArray440[local57] = local384 * this.anIntArray440[local57] + local63 * this.anIntArray443[local57] + 16383 >> 14;
									this.anIntArray443[local57] = local402;
								}
								if (arg3 != 0) {
									local63 = Class3_Sub17.anIntArray175[arg3];
									local384 = Class3_Sub17.anIntArray177[arg3];
									local402 = this.anIntArray441[local57] * local384 + this.anIntArray440[local57] * local63 + 16383 >> 14;
									this.anIntArray440[local57] = local384 * this.anIntArray440[local57] + 16383 - this.anIntArray441[local57] * local63 >> 14;
									this.anIntArray441[local57] = local402;
								}
								this.anIntArray441[local57] += Static369.anInt6329;
								this.anIntArray443[local57] += Static480.anInt7789;
								this.anIntArray440[local57] += Static88.anInt2201;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray44.length > local41) {
							local55 = this.anIntArrayArray44[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray170 == null || (arg6 & this.aShortArray170[local63]) != 0) {
									local384 = this.anIntArray442[local63];
									local402 = this.anIntArray442[local63 + 1];
									for (local628 = local384; local628 < local402; local628++) {
										local637 = this.aShortArray164[local628] - 1;
										if (local637 == -1) {
											break;
										}
										if (arg4 != 0) {
											local646 = Class3_Sub17.anIntArray175[arg4];
											local650 = Class3_Sub17.anIntArray177[arg4];
											local668 = local650 * this.aShortArray166[local637] + this.aShortArray169[local637] * local646 + 16383 >> 14;
											this.aShortArray169[local637] = (short) (this.aShortArray169[local637] * local650 + 16383 - local646 * this.aShortArray166[local637] >> 14);
											this.aShortArray166[local637] = (short) local668;
										}
										if (arg2 != 0) {
											local646 = Class3_Sub17.anIntArray175[arg2];
											local650 = Class3_Sub17.anIntArray177[arg2];
											local668 = this.aShortArray169[local637] * local650 + 16383 - local646 * this.aShortArray171[local637] >> 14;
											this.aShortArray171[local637] = (short) (local646 * this.aShortArray169[local637] + this.aShortArray171[local637] * local650 + 16383 >> 14);
											this.aShortArray169[local637] = (short) local668;
										}
										if (arg3 != 0) {
											local646 = Class3_Sub17.anIntArray175[arg3];
											local650 = Class3_Sub17.anIntArray177[arg3];
											local668 = local646 * this.aShortArray171[local637] + this.aShortArray166[local637] * local650 + 16383 >> 14;
											this.aShortArray171[local637] = (short) (local650 * this.aShortArray171[local637] + 16383 - local646 * this.aShortArray166[local637] >> 14);
											this.aShortArray166[local637] = (short) local668;
										}
									}
								}
							}
						}
					}
					if (this.aClass280_7 == null && this.aClass280_8 != null) {
						this.aClass280_8.anInterface7_5 = null;
					}
					if (this.aClass280_7 != null) {
						this.aClass280_7.anInterface7_5 = null;
						return;
					}
				}
			} else {
				local33 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local248 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static269.aBoolean392) {
					local384 = arg7[0] * Static369.anInt6329 + Static480.anInt7789 * arg7[3] + Static88.anInt2201 * arg7[6] + 8192 >> 14;
					local402 = Static88.anInt2201 * arg7[7] + Static480.anInt7789 * arg7[4] + arg7[1] * Static369.anInt6329 + 8192 >> 14;
					local628 = arg7[2] * Static369.anInt6329 + Static480.anInt7789 * arg7[5] + Static88.anInt2201 * arg7[8] + 8192 >> 14;
					local402 += local57;
					local384 += local248;
					Static480.anInt7789 = local402;
					local628 += local63;
					Static369.anInt6329 = local384;
					Static88.anInt2201 = local628;
					Static269.aBoolean392 = false;
				}
				@Pc(982) int[] local982 = new int[9];
				local402 = Class3_Sub17.anIntArray177[arg2];
				local628 = Class3_Sub17.anIntArray175[arg2];
				local637 = Class3_Sub17.anIntArray177[arg3];
				local646 = Class3_Sub17.anIntArray175[arg3];
				local650 = Class3_Sub17.anIntArray177[arg4];
				local668 = Class3_Sub17.anIntArray175[arg4];
				local1014 = local628 * local650 + 8192 >> 14;
				local1022 = local628 * local668 + 8192 >> 14;
				local982[7] = local646 * local668 + local1014 * local637 + 8192 >> 14;
				local982[3] = local668 * local402 + 8192 >> 14;
				local982[6] = local1022 * local637 + -local646 * local650 + 8192 >> 14;
				local982[2] = local402 * local646 + 8192 >> 14;
				local982[8] = local637 * local402 + 8192 >> 14;
				local982[1] = local1014 * local646 + -local637 * local668 + 8192 >> 14;
				local982[5] = -local628;
				local982[0] = local637 * local650 + local646 * local1022 + 8192 >> 14;
				local982[4] = local402 * local650 + 8192 >> 14;
				@Pc(1152) int local1152 = -Static88.anInt2201 * local982[2] + local982[0] * -Static369.anInt6329 + -Static480.anInt7789 * local982[1] + 8192 >> 14;
				local1178 = local982[5] * -Static88.anInt2201 + local982[3] * -Static369.anInt6329 + local982[4] * -Static480.anInt7789 + 8192 >> 14;
				local1203 = local982[7] * -Static480.anInt7789 + local982[6] * -Static369.anInt6329 + local982[8] * -Static88.anInt2201 + 8192 >> 14;
				local1208 = local1152 + Static369.anInt6329;
				@Pc(1212) int local1212 = Static480.anInt7789 + local1178;
				local1217 = local1203 + Static88.anInt2201;
				@Pc(1220) int[] local1220 = new int[9];
				for (local1222 = 0; local1222 < 3; local1222++) {
					for (local1226 = 0; local1226 < 3; local1226++) {
						local1230 = 0;
						for (local1232 = 0; local1232 < 3; local1232++) {
							local1230 += local982[local1232 + local1222 * 3] * arg7[local1226 * 3 + local1232];
						}
						local1220[local1222 * 3 + local1226] = local1230 + 8192 >> 14;
					}
				}
				local1226 = local982[0] * local248 + local57 * local982[1] + local63 * local982[2] + 8192 >> 14;
				local1230 = local63 * local982[5] + local982[3] * local248 + local57 * local982[4] + 8192 >> 14;
				local1226 += local1208;
				local1232 = local63 * local982[8] + local982[6] * local248 + local982[7] * local57 + 8192 >> 14;
				local1230 += local1212;
				local1232 += local1217;
				local1365 = new int[9];
				for (local1367 = 0; local1367 < 3; local1367++) {
					for (local1371 = 0; local1371 < 3; local1371++) {
						local1375 = 0;
						for (local1377 = 0; local1377 < 3; local1377++) {
							local1375 += local1220[local1377 * 3 + local1371] * arg7[local1377 + local1367 * 3];
						}
						local1365[local1367 * 3 + local1371] = local1375 + 8192 >> 14;
					}
				}
				local1371 = arg7[2] * local1232 + local1226 * arg7[0] + arg7[1] * local1230 + 8192 >> 14;
				local1375 = arg7[4] * local1230 + arg7[3] * local1226 + arg7[5] * local1232 + 8192 >> 14;
				local1371 += local33;
				local1375 += local35;
				local1377 = local1230 * arg7[7] + local1226 * arg7[6] + arg7[8] * local1232 + 8192 >> 14;
				local1377 += local41;
				for (local1506 = 0; local1506 < local8; local1506++) {
					@Pc(1512) int local1512 = arg1[local1506];
					if (local1512 < this.anIntArrayArray44.length) {
						@Pc(1522) int[] local1522 = this.anIntArrayArray44[local1512];
						for (@Pc(1524) int local1524 = 0; local1524 < local1522.length; local1524++) {
							@Pc(1530) int local1530 = local1522[local1524];
							if (this.aShortArray170 == null || (this.aShortArray170[local1530] & arg6) != 0) {
								@Pc(1572) int local1572 = local1365[1] * this.anIntArray443[local1530] + this.anIntArray441[local1530] * local1365[0] + local1365[2] * this.anIntArray440[local1530] + 8192 >> 14;
								@Pc(1603) int local1603 = this.anIntArray440[local1530] * local1365[5] + this.anIntArray441[local1530] * local1365[3] + local1365[4] * this.anIntArray443[local1530] + 8192 >> 14;
								@Pc(1607) int local1607 = local1572 + local1371;
								@Pc(1638) int local1638 = this.anIntArray440[local1530] * local1365[8] + local1365[7] * this.anIntArray443[local1530] + local1365[6] * this.anIntArray441[local1530] + 8192 >> 14;
								@Pc(1642) int local1642 = local1603 + local1375;
								this.anIntArray441[local1530] = local1607;
								@Pc(1651) int local1651 = local1638 + local1377;
								this.anIntArray443[local1530] = local1642;
								this.anIntArray440[local1530] = local1651;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2581) Class162 local2581;
			@Pc(2586) Class178 local2586;
			if (arg0 == 5) {
				if (this.anIntArrayArray46 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray46.length > local35) {
							local246 = this.anIntArrayArray46[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local57 = local246[local248];
								if (this.aShortArray163 == null || (arg6 & this.aShortArray163[local57]) != 0) {
									local63 = arg2 * 8 + (this.aByteArray67[local57] & 0xFF);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray67[local57] = (byte) local63;
									if (this.aClass280_8 != null) {
										this.aClass280_8.anInterface7_5 = null;
									}
								}
							}
						}
					}
					if (this.aClass162Array1 != null) {
						for (local35 = 0; local35 < this.anInt5702; local35++) {
							local2581 = this.aClass162Array1[local35];
							local2586 = this.aClass178Array1[local35];
							local2586.anInt4995 = local2586.anInt4995 & 0xFFFFFF | 255 - (this.aByteArray67[local2581.anInt4514] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2831) Class178 local2831;
				if (arg0 == 8) {
					if (this.anIntArrayArray45 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (local35 < this.anIntArrayArray45.length) {
								local246 = this.anIntArrayArray45[local35];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2831 = this.aClass178Array1[local246[local248]];
									local2831.anInt5000 += arg2;
									local2831.anInt4996 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray45 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (local35 < this.anIntArrayArray45.length) {
								local246 = this.anIntArrayArray45[local35];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2831 = this.aClass178Array1[local246[local248]];
									local2831.anInt4991 = arg2 * local2831.anInt4991 >> 7;
									local2831.anInt4994 = local2831.anInt4994 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray45 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray45.length) {
							local246 = this.anIntArrayArray45[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2831 = this.aClass178Array1[local246[local248]];
								local2831.anInt4999 = arg2 + local2831.anInt4999 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray46 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray46.length) {
						local246 = this.anIntArrayArray46[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local57 = local246[local248];
							if (this.aShortArray163 == null || (this.aShortArray163[local57] & arg6) != 0) {
								local63 = this.aShortArray162[local57] & 0xFFFF;
								local384 = local63 >> 10 & 0x3F;
								local402 = local63 >> 7 & 0x7;
								local402 += arg3 / 4;
								local628 = local63 & 0x7F;
								@Pc(2690) int local2690 = local384 + arg2 & 0x3F;
								if (local402 < 0) {
									local402 = 0;
								} else if (local402 > 7) {
									local402 = 7;
								}
								local628 += arg4;
								if (local628 < 0) {
									local628 = 0;
								} else if (local628 > 127) {
									local628 = 127;
								}
								this.aShortArray162[local57] = (short) (local402 << 7 | local2690 << 10 | local628);
								if (this.aClass280_8 != null) {
									this.aClass280_8.anInterface7_5 = null;
								}
							}
						}
					}
				}
				if (this.aClass162Array1 != null) {
					for (local35 = 0; local35 < this.anInt5702; local35++) {
						local2581 = this.aClass162Array1[local35];
						local2586 = this.aClass178Array1[local35];
						local2586.anInt4995 = Static213.anIntArray342[this.aShortArray162[local2581.anInt4514] & 0xFFFF] & 0xFFFFFF | local2586.anInt4995 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray44.length) {
					local246 = this.anIntArrayArray44[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local57 = local246[local248];
						if (this.aShortArray170 == null || (this.aShortArray170[local57] & arg6) != 0) {
							this.anIntArray441[local57] -= Static369.anInt6329;
							this.anIntArray443[local57] -= Static480.anInt7789;
							this.anIntArray440[local57] -= Static88.anInt2201;
							this.anIntArray441[local57] = arg2 * this.anIntArray441[local57] >> 7;
							this.anIntArray443[local57] = this.anIntArray443[local57] * arg3 >> 7;
							this.anIntArray440[local57] = this.anIntArray440[local57] * arg4 >> 7;
							this.anIntArray441[local57] += Static369.anInt6329;
							this.anIntArray443[local57] += Static480.anInt7789;
							this.anIntArray440[local57] += Static88.anInt2201;
						}
					}
				}
			}
		} else {
			local33 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local248 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static269.aBoolean392) {
				local384 = arg7[3] * Static480.anInt7789 + Static369.anInt6329 * arg7[0] + arg7[6] * Static88.anInt2201 + 8192 >> 14;
				local402 = Static480.anInt7789 * arg7[4] + Static369.anInt6329 * arg7[1] + arg7[7] * Static88.anInt2201 + 8192 >> 14;
				local402 += local57;
				local384 += local248;
				local628 = Static88.anInt2201 * arg7[8] + arg7[2] * Static369.anInt6329 + arg7[5] * Static480.anInt7789 + 8192 >> 14;
				local628 += local63;
				Static480.anInt7789 = local402;
				Static369.anInt6329 = local384;
				Static88.anInt2201 = local628;
				Static269.aBoolean392 = false;
			}
			local384 = arg2 << 15 >> 7;
			local402 = arg3 << 15 >> 7;
			local628 = arg4 << 15 >> 7;
			local637 = -Static369.anInt6329 * local384 + 8192 >> 14;
			local646 = local402 * -Static480.anInt7789 + 8192 >> 14;
			local650 = -Static88.anInt2201 * local628 + 8192 >> 14;
			local668 = local637 + Static369.anInt6329;
			local1014 = local646 + Static480.anInt7789;
			local1022 = local650 + Static88.anInt2201;
			@Pc(1874) int[] local1874 = new int[] { arg7[0] * local384 + 8192 >> 14, local384 * arg7[3] + 8192 >> 14, local384 * arg7[6] + 8192 >> 14, arg7[1] * local402 + 8192 >> 14, arg7[4] * local402 + 8192 >> 14, arg7[7] * local402 + 8192 >> 14, arg7[2] * local628 + 8192 >> 14, local628 * arg7[5] + 8192 >> 14, local628 * arg7[8] + 8192 >> 14 };
			local1178 = local384 * local248 + 8192 >> 14;
			local1203 = local402 * local57 + 8192 >> 14;
			@Pc(2002) int local2002 = local1178 + local668;
			@Pc(2006) int local2006 = local1203 + local1014;
			local1208 = local63 * local628 + 8192 >> 14;
			@Pc(2018) int local2018 = local1208 + local1022;
			@Pc(2021) int[] local2021 = new int[9];
			@Pc(2027) int local2027;
			for (local1217 = 0; local1217 < 3; local1217++) {
				for (local2027 = 0; local2027 < 3; local2027++) {
					local1222 = 0;
					for (local1226 = 0; local1226 < 3; local1226++) {
						local1222 += arg7[local1226 + local1217 * 3] * local1874[local2027 + local1226 * 3];
					}
					local2021[local2027 + local1217 * 3] = local1222 + 8192 >> 14;
				}
			}
			local2027 = local2018 * arg7[2] + arg7[0] * local2002 + local2006 * arg7[1] + 8192 >> 14;
			local1222 = arg7[5] * local2018 + arg7[3] * local2002 + local2006 * arg7[4] + 8192 >> 14;
			local1226 = local2018 * arg7[8] + local2006 * arg7[7] + local2002 * arg7[6] + 8192 >> 14;
			local2027 += local33;
			local1222 += local35;
			local1226 += local41;
			for (local1230 = 0; local1230 < local8; local1230++) {
				local1232 = arg1[local1230];
				if (this.anIntArrayArray44.length > local1232) {
					local1365 = this.anIntArrayArray44[local1232];
					for (local1367 = 0; local1367 < local1365.length; local1367++) {
						local1371 = local1365[local1367];
						if (this.aShortArray170 == null || (this.aShortArray170[local1371] & arg6) != 0) {
							local1375 = local2021[2] * this.anIntArray440[local1371] + local2021[1] * this.anIntArray443[local1371] + this.anIntArray441[local1371] * local2021[0] + 8192 >> 14;
							local1377 = local2021[3] * this.anIntArray441[local1371] + this.anIntArray443[local1371] * local2021[4] + local2021[5] * this.anIntArray440[local1371] + 8192 >> 14;
							@Pc(2267) int local2267 = local1377 + local1222;
							@Pc(2271) int local2271 = local1375 + local2027;
							local1506 = this.anIntArray440[local1371] * local2021[8] + local2021[6] * this.anIntArray441[local1371] + local2021[7] * this.anIntArray443[local1371] + 8192 >> 14;
							@Pc(2306) int local2306 = local1506 + local1226;
							this.anIntArray441[local1371] = local2271;
							this.anIntArray443[local1371] = local2267;
							this.anIntArray440[local1371] = local2306;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class57 method7522(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class57_Sub2 local12;
		@Pc(16) Class57_Sub2 local16;
		if (arg0 == 1) {
			local12 = this.aClass43_Sub3_22.aClass57_Sub2_4;
			local16 = this.aClass43_Sub3_22.aClass57_Sub2_8;
		} else if (arg0 == 2) {
			local12 = this.aClass43_Sub3_22.aClass57_Sub2_2;
			local16 = this.aClass43_Sub3_22.aClass57_Sub2_5;
		} else if (arg0 == 3) {
			local16 = this.aClass43_Sub3_22.aClass57_Sub2_6;
			local12 = this.aClass43_Sub3_22.aClass57_Sub2_7;
		} else if (arg0 == 4) {
			local12 = this.aClass43_Sub3_22.aClass57_Sub2_9;
			local16 = this.aClass43_Sub3_22.aClass57_Sub2_3;
		} else if (arg0 == 5) {
			local16 = this.aClass43_Sub3_22.aClass57_Sub2_10;
			local12 = this.aClass43_Sub3_22.aClass57_Sub2_1;
		} else {
			local12 = local16 = new Class57_Sub2(this.aClass43_Sub3_22);
		}
		return this.method4943(arg0 != 0, local16, local12, arg2, arg1);
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()V")
	@Override
	protected void method7513() {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method4954(arg1, arg4, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!mb", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		if (this.aClass280_8 != null) {
			this.aClass280_8.anInterface7_5 = null;
		}
		this.aShort70 = (short) arg0;
		if (this.aClass280_7 != null) {
			this.aClass280_7.anInterface7_5 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7502(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			Static88.anInt2201 = 0;
			Static369.anInt6329 = 0;
			local28 = 0;
			Static480.anInt7789 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray44.length) {
					local52 = this.anIntArrayArray44[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static369.anInt6329 += this.anIntArray441[local60];
						Static480.anInt7789 += this.anIntArray443[local60];
						local28++;
						Static88.anInt2201 += this.anIntArray440[local60];
					}
				}
			}
			if (local28 > 0) {
				Static369.anInt6329 = Static369.anInt6329 / local28 + local14;
				Static88.anInt2201 = local18 + Static88.anInt2201 / local28;
				Static480.anInt7789 = Static480.anInt7789 / local28 + local22;
			} else {
				Static88.anInt2201 = local18;
				Static480.anInt7789 = local22;
				Static369.anInt6329 = local14;
			}
			return;
		}
		@Pc(168) int[] local168;
		@Pc(170) int local170;
		if (arg0 == 1) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray44.length > local32) {
					local168 = this.anIntArrayArray44[local32];
					for (local170 = 0; local170 < local168.length; local170++) {
						local54 = local168[local170];
						this.anIntArray441[local54] += local14;
						this.anIntArray443[local54] += local22;
						this.anIntArray440[local54] += local18;
					}
				}
			}
			return;
		}
		@Pc(282) int local282;
		@Pc(301) int local301;
		@Pc(749) int local749;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray44.length > local32) {
					local168 = this.anIntArrayArray44[local32];
					if ((arg5 & 0x1) == 0) {
						for (local170 = 0; local170 < local168.length; local170++) {
							local54 = local168[local170];
							this.anIntArray441[local54] -= Static369.anInt6329;
							this.anIntArray443[local54] -= Static480.anInt7789;
							this.anIntArray440[local54] -= Static88.anInt2201;
							if (arg4 != 0) {
								local60 = Class3_Sub17.anIntArray175[arg4];
								local282 = Class3_Sub17.anIntArray177[arg4];
								local301 = local60 * this.anIntArray443[local54] + this.anIntArray441[local54] * local282 + 16383 >> 14;
								this.anIntArray443[local54] = this.anIntArray443[local54] * local282 + 16383 - this.anIntArray441[local54] * local60 >> 14;
								this.anIntArray441[local54] = local301;
							}
							if (arg2 != 0) {
								local60 = Class3_Sub17.anIntArray175[arg2];
								local282 = Class3_Sub17.anIntArray177[arg2];
								local301 = this.anIntArray443[local54] * local282 + 16383 - local60 * this.anIntArray440[local54] >> 14;
								this.anIntArray440[local54] = local282 * this.anIntArray440[local54] + this.anIntArray443[local54] * local60 + 16383 >> 14;
								this.anIntArray443[local54] = local301;
							}
							if (arg3 != 0) {
								local60 = Class3_Sub17.anIntArray175[arg3];
								local282 = Class3_Sub17.anIntArray177[arg3];
								local301 = local60 * this.anIntArray440[local54] + local282 * this.anIntArray441[local54] + 16383 >> 14;
								this.anIntArray440[local54] = this.anIntArray440[local54] * local282 + 16383 - local60 * this.anIntArray441[local54] >> 14;
								this.anIntArray441[local54] = local301;
							}
							this.anIntArray441[local54] += Static369.anInt6329;
							this.anIntArray443[local54] += Static480.anInt7789;
							this.anIntArray440[local54] += Static88.anInt2201;
						}
					} else {
						for (local170 = 0; local170 < local168.length; local170++) {
							local54 = local168[local170];
							this.anIntArray441[local54] -= Static369.anInt6329;
							this.anIntArray443[local54] -= Static480.anInt7789;
							this.anIntArray440[local54] -= Static88.anInt2201;
							if (arg2 != 0) {
								local60 = Class3_Sub17.anIntArray175[arg2];
								local282 = Class3_Sub17.anIntArray177[arg2];
								local301 = this.anIntArray443[local54] * local282 + 16383 - this.anIntArray440[local54] * local60 >> 14;
								this.anIntArray440[local54] = local282 * this.anIntArray440[local54] + local60 * this.anIntArray443[local54] + 16383 >> 14;
								this.anIntArray443[local54] = local301;
							}
							if (arg4 != 0) {
								local60 = Class3_Sub17.anIntArray175[arg4];
								local282 = Class3_Sub17.anIntArray177[arg4];
								local301 = this.anIntArray443[local54] * local60 + local282 * this.anIntArray441[local54] + 16383 >> 14;
								this.anIntArray443[local54] = local282 * this.anIntArray443[local54] + 16383 - this.anIntArray441[local54] * local60 >> 14;
								this.anIntArray441[local54] = local301;
							}
							if (arg3 != 0) {
								local60 = Class3_Sub17.anIntArray175[arg3];
								local282 = Class3_Sub17.anIntArray177[arg3];
								local301 = this.anIntArray441[local54] * local282 + this.anIntArray440[local54] * local60 + 16383 >> 14;
								this.anIntArray440[local54] = this.anIntArray440[local54] * local282 + 16383 - local60 * this.anIntArray441[local54] >> 14;
								this.anIntArray441[local54] = local301;
							}
							this.anIntArray441[local54] += Static369.anInt6329;
							this.anIntArray443[local54] += Static480.anInt7789;
							this.anIntArray440[local54] += Static88.anInt2201;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray44.length) {
						local52 = this.anIntArrayArray44[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local282 = this.anIntArray442[local60];
							local301 = this.anIntArray442[local60 + 1];
							for (local749 = local282; local749 < local301; local749++) {
								@Pc(758) int local758 = this.aShortArray164[local749] - 1;
								if (local758 == -1) {
									break;
								}
								@Pc(768) int local768;
								@Pc(772) int local772;
								@Pc(790) int local790;
								if (arg4 != 0) {
									local768 = Class3_Sub17.anIntArray175[arg4];
									local772 = Class3_Sub17.anIntArray177[arg4];
									local790 = local768 * this.aShortArray169[local758] + this.aShortArray166[local758] * local772 + 16383 >> 14;
									this.aShortArray169[local758] = (short) (local772 * this.aShortArray169[local758] + 16383 - local768 * this.aShortArray166[local758] >> 14);
									this.aShortArray166[local758] = (short) local790;
								}
								if (arg2 != 0) {
									local768 = Class3_Sub17.anIntArray175[arg2];
									local772 = Class3_Sub17.anIntArray177[arg2];
									local790 = local772 * this.aShortArray169[local758] + 16383 - this.aShortArray171[local758] * local768 >> 14;
									this.aShortArray171[local758] = (short) (this.aShortArray171[local758] * local772 + local768 * this.aShortArray169[local758] + 16383 >> 14);
									this.aShortArray169[local758] = (short) local790;
								}
								if (arg3 != 0) {
									local768 = Class3_Sub17.anIntArray175[arg3];
									local772 = Class3_Sub17.anIntArray177[arg3];
									local790 = this.aShortArray166[local758] * local772 + this.aShortArray171[local758] * local768 + 16383 >> 14;
									this.aShortArray171[local758] = (short) (this.aShortArray171[local758] * local772 + 16383 - local768 * this.aShortArray166[local758] >> 14);
									this.aShortArray166[local758] = (short) local790;
								}
							}
						}
					}
				}
				if (this.aClass280_7 == null && this.aClass280_8 != null) {
					this.aClass280_8.anInterface7_5 = null;
				}
				if (this.aClass280_7 != null) {
					this.aClass280_7.anInterface7_5 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray44.length > local32) {
					local168 = this.anIntArrayArray44[local32];
					for (local170 = 0; local170 < local168.length; local170++) {
						local54 = local168[local170];
						this.anIntArray441[local54] -= Static369.anInt6329;
						this.anIntArray443[local54] -= Static480.anInt7789;
						this.anIntArray440[local54] -= Static88.anInt2201;
						this.anIntArray441[local54] = arg2 * this.anIntArray441[local54] >> 7;
						this.anIntArray443[local54] = arg3 * this.anIntArray443[local54] >> 7;
						this.anIntArray440[local54] = this.anIntArray440[local54] * arg4 >> 7;
						this.anIntArray441[local54] += Static369.anInt6329;
						this.anIntArray443[local54] += Static480.anInt7789;
						this.anIntArray440[local54] += Static88.anInt2201;
					}
				}
			}
		} else {
			@Pc(1210) Class162 local1210;
			@Pc(1215) Class178 local1215;
			if (arg0 == 5) {
				if (this.anIntArrayArray46 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray46.length > local32) {
							local168 = this.anIntArrayArray46[local32];
							for (local170 = 0; local170 < local168.length; local170++) {
								local54 = local168[local170];
								local60 = arg2 * 8 + (this.aByteArray67[local54] & 0xFF);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray67[local54] = (byte) local60;
							}
							if (local168.length > 0 && this.aClass280_8 != null) {
								this.aClass280_8.anInterface7_5 = null;
							}
						}
					}
					if (this.aClass162Array1 != null) {
						for (local32 = 0; local32 < this.anInt5702; local32++) {
							local1210 = this.aClass162Array1[local32];
							local1215 = this.aClass178Array1[local32];
							local1215.anInt4995 = local1215.anInt4995 & 0xFFFFFF | 255 - (this.aByteArray67[local1210.anInt4514] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1470) Class178 local1470;
				if (arg0 == 8) {
					if (this.anIntArrayArray45 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray45.length > local32) {
								local168 = this.anIntArrayArray45[local32];
								for (local170 = 0; local170 < local168.length; local170++) {
									local1470 = this.aClass178Array1[local168[local170]];
									local1470.anInt4996 += arg3;
									local1470.anInt5000 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray45 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray45.length) {
								local168 = this.anIntArrayArray45[local32];
								for (local170 = 0; local170 < local168.length; local170++) {
									local1470 = this.aClass178Array1[local168[local170]];
									local1470.anInt4991 = local1470.anInt4991 * arg2 >> 7;
									local1470.anInt4994 = arg3 * local1470.anInt4994 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray45 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray45.length > local32) {
							local168 = this.anIntArrayArray45[local32];
							for (local170 = 0; local170 < local168.length; local170++) {
								local1470 = this.aClass178Array1[local168[local170]];
								local1470.anInt4999 = arg2 + local1470.anInt4999 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray46 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray46.length > local32) {
						local168 = this.anIntArrayArray46[local32];
						for (local170 = 0; local170 < local168.length; local170++) {
							local54 = local168[local170];
							local60 = this.aShortArray162[local54] & 0xFFFF;
							local282 = local60 >> 10 & 0x3F;
							local301 = local60 >> 7 & 0x7;
							local749 = local60 & 0x7F;
							@Pc(1311) int local1311 = arg2 + local282 & 0x3F;
							local301 += arg3 / 4;
							if (local301 < 0) {
								local301 = 0;
							} else if (local301 > 7) {
								local301 = 7;
							}
							local749 += arg4;
							if (local749 < 0) {
								local749 = 0;
							} else if (local749 > 127) {
								local749 = 127;
							}
							this.aShortArray162[local54] = (short) (local1311 << 10 | local301 << 7 | local749);
						}
						if (local168.length > 0 && this.aClass280_8 != null) {
							this.aClass280_8.anInterface7_5 = null;
						}
					}
				}
				if (this.aClass162Array1 != null) {
					for (local32 = 0; local32 < this.anInt5702; local32++) {
						local1210 = this.aClass162Array1[local32];
						local1215 = this.aClass178Array1[local32];
						local1215.anInt4995 = local1215.anInt4995 & 0xFF000000 | Static213.anIntArray342[this.aShortArray162[local1210.anInt4514] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray44 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5741; local12++) {
			this.anIntArray441[local12] <<= 0x4;
			this.anIntArray443[local12] <<= 0x4;
			this.anIntArray440[local12] <<= 0x4;
		}
		Static480.anInt7789 = 0;
		Static369.anInt6329 = 0;
		Static88.anInt2201 = 0;
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass43_Sub3_22.anInterface8_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5711; local11++) {
			if (this.aShortArray167[local11] == arg0) {
				this.aShortArray167[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(43) Class224 local43 = local9.method6560(arg0 & 0xFFFF);
			local31 = local43.aByte73;
			local33 = local43.aByte71;
		}
		@Pc(51) byte local51 = 0;
		@Pc(53) byte local53 = 0;
		if (arg1 != -1) {
			@Pc(63) Class224 local63 = local9.method6560(arg1 & 0xFFFF);
			local51 = local63.aByte73;
			local53 = local63.aByte71;
		}
		if (!(local53 != local33 | local31 != local51)) {
			return;
		}
		if (this.aClass162Array1 != null) {
			for (@Pc(96) int local96 = 0; local96 < this.anInt5702; local96++) {
				@Pc(103) Class162 local103 = this.aClass162Array1[local96];
				@Pc(108) Class178 local108 = this.aClass178Array1[local96];
				local108.anInt4995 = Static213.anIntArray342[this.aShortArray162[local103.anInt4514] & 0xFFFF] & 0xFFFFFF | local108.anInt4995 & 0xFF000000;
			}
		}
		if (this.aClass280_8 != null) {
			this.aClass280_8.anInterface7_5 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3) {
		return this.method4954(arg1, -1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZB)V")
	private void method4947(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass280_8 != null && this.aClass280_8.anInterface7_5 == null;
		@Pc(27) boolean local27 = this.aClass280_7 != null && this.aClass280_7.anInterface7_5 == null;
		@Pc(38) boolean local38 = this.aClass280_6 != null && this.aClass280_6.anInterface7_5 == null;
		@Pc(49) boolean local49 = this.aClass280_5 != null && this.aClass280_5.anInterface7_5 == null;
		if (arg0) {
			local27 &= (this.aByte68 & 0x4) != 0;
			local38 &= (this.aByte68 & 0x1) != 0;
			local49 &= (this.aByte68 & 0x8) != 0;
			local16 &= (this.aByte68 & 0x2) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(118) byte local118 = 0;
		if (local38) {
			local106 = 12;
		}
		@Pc(129) byte local129 = 0;
		if (local16) {
			local110 = local106;
			local106 = (byte) (local106 + 4);
		}
		if (local27) {
			local118 = local106;
			local106 = (byte) (local106 + 12);
		}
		if (local49) {
			local129 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (this.aClass43_Sub3_22.aClass3_Sub11_Sub2_3.aByteArray36.length < this.anInt5719 * local106) {
			this.aClass43_Sub3_22.aClass3_Sub11_Sub2_3 = new Class3_Sub11_Sub2(local106 * (this.anInt5719 + 100));
		} else {
			this.aClass43_Sub3_22.aClass3_Sub11_Sub2_3.anInt3520 = 0;
		}
		@Pc(199) Class3_Sub11_Sub2 local199 = this.aClass43_Sub3_22.aClass3_Sub11_Sub2_3;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(244) int local244;
		@Pc(253) int local253;
		if (local38) {
			@Pc(223) int local223;
			@Pc(230) int local230;
			@Pc(235) int local235;
			@Pc(242) int local242;
			if (this.aClass43_Sub3_22.aBoolean671) {
				for (local207 = 0; local207 < this.anInt5717; local207++) {
					local216 = Stream.floatToRawIntBits((float) this.anIntArray441[local207]);
					local223 = Stream.floatToRawIntBits((float) this.anIntArray443[local207]);
					local230 = Stream.floatToRawIntBits((float) this.anIntArray440[local207]);
					local235 = this.anIntArray442[local207];
					local242 = this.anIntArray442[local207 + 1];
					for (local244 = local235; local244 < local242; local244++) {
						local253 = this.aShortArray164[local244] - 1;
						if (local253 == -1) {
							break;
						}
						local199.anInt3520 = local253 * local106;
						local199.method3101(local216);
						local199.method3101(local223);
						local199.method3101(local230);
					}
				}
			} else {
				for (local207 = 0; local207 < this.anInt5717; local207++) {
					local216 = Stream.floatToRawIntBits((float) this.anIntArray441[local207]);
					local223 = Stream.floatToRawIntBits((float) this.anIntArray443[local207]);
					local230 = Stream.floatToRawIntBits((float) this.anIntArray440[local207]);
					local235 = this.anIntArray442[local207];
					local242 = this.anIntArray442[local207 + 1];
					for (local244 = local235; local244 < local242; local244++) {
						local253 = this.aShortArray164[local244] - 1;
						if (local253 == -1) {
							break;
						}
						local199.anInt3520 = local106 * local253;
						local199.method3102(local216);
						local199.method3102(local223);
						local199.method3102(local230);
					}
				}
			}
		}
		@Pc(498) float local498;
		@Pc(380) short[] local380;
		@Pc(389) short[] local389;
		@Pc(386) short[] local386;
		@Pc(383) byte[] local383;
		@Pc(540) float local540;
		if (local16) {
			if (this.aClass280_7 == null) {
				if (this.aClass18_1 == null) {
					local380 = this.aShortArray166;
					local383 = this.aByteArray68;
					local386 = this.aShortArray171;
					local389 = this.aShortArray169;
				} else {
					local380 = this.aClass18_1.aShortArray9;
					local389 = this.aClass18_1.aShortArray11;
					local383 = this.aClass18_1.aByteArray4;
					local386 = this.aClass18_1.aShortArray10;
				}
				@Pc(413) float local413 = this.aClass43_Sub3_22.aFloatArray64[0];
				@Pc(419) float local419 = this.aClass43_Sub3_22.aFloatArray64[1];
				@Pc(425) float local425 = this.aClass43_Sub3_22.aFloatArray64[2];
				@Pc(429) float local429 = this.aClass43_Sub3_22.aFloat208;
				@Pc(439) float local439 = this.aClass43_Sub3_22.aFloat210 * 768.0F / (float) this.aShort70;
				@Pc(449) float local449 = this.aClass43_Sub3_22.aFloat219 * 768.0F / (float) this.aShort70;
				for (@Pc(451) int local451 = 0; local451 < this.anInt5711; local451++) {
					@Pc(471) int local471 = this.method4952(this.aShortArray162[local451], this.aShortArray167[local451], this.aByteArray67[local451], this.aShort73);
					@Pc(476) short local476 = this.aShortArray165[local451];
					@Pc(487) float local487 = this.aClass43_Sub3_22.aFloat206 * (float) (local471 >> 8 & 0xFF);
					local498 = (float) (local471 >> 16 & 0xFF) * this.aClass43_Sub3_22.aFloat216;
					@Pc(507) float local507 = this.aClass43_Sub3_22.aFloat217 * (float) (local471 >>> 24);
					@Pc(512) short local512 = (short) local383[local476];
					if (local512 == 0) {
						local540 = ((float) local386[local476] * local425 + (float) local389[local476] * local419 + local413 * (float) local380[local476]) * 0.0026041667F;
					} else {
						local540 = ((float) local380[local476] * local413 + (float) local389[local476] * local419 + (float) local386[local476] * local425) / (float) (local512 * 256);
					}
					@Pc(580) float local580 = local540 * (local540 < 0.0F ? local449 : local439) + local429;
					@Pc(585) int local585 = (int) (local580 * local507);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					@Pc(606) int local606 = (int) (local580 * local498);
					if (local606 < 0) {
						local606 = 0;
					} else if (local606 > 255) {
						local606 = 255;
					}
					@Pc(624) int local624 = (int) (local487 * local580);
					local199.anInt3520 = local110 + local476 * local106;
					if (local624 < 0) {
						local624 = 0;
					} else if (local624 > 255) {
						local624 = 255;
					}
					local199.method3079(local585);
					local199.method3079(local606);
					local199.method3079(local624);
					local199.method3079(255 - (this.aByteArray67[local451] & 0xFF));
					local476 = this.aShortArray168[local451];
					local512 = local383[local476];
					if (local512 == 0) {
						local540 = ((float) local389[local476] * local419 + (float) local380[local476] * local413 + (float) local386[local476] * local425) * 0.0026041667F;
					} else {
						local540 = ((float) local386[local476] * local425 + (float) local389[local476] * local419 + local413 * (float) local380[local476]) / (float) (local512 * 256);
					}
					local580 = local429 + (local540 < 0.0F ? local449 : local439) * local540;
					local585 = (int) (local507 * local580);
					local606 = (int) (local498 * local580);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					if (local606 < 0) {
						local606 = 0;
					} else if (local606 > 255) {
						local606 = 255;
					}
					local624 = (int) (local580 * local487);
					if (local624 < 0) {
						local624 = 0;
					} else if (local624 > 255) {
						local624 = 255;
					}
					local199.anInt3520 = local110 + local106 * local476;
					local199.method3079(local585);
					local199.method3079(local606);
					local199.method3079(local624);
					local199.method3079(255 - (this.aByteArray67[local451] & 0xFF));
					local476 = this.aShortArray161[local451];
					local512 = local383[local476];
					if (local512 == 0) {
						local540 = ((float) local386[local476] * local425 + local419 * (float) local389[local476] + (float) local380[local476] * local413) * 0.0026041667F;
					} else {
						local540 = ((float) local386[local476] * local425 + local413 * (float) local380[local476] + (float) local389[local476] * local419) / (float) (local512 * 256);
					}
					local580 = local429 + local540 * (local540 < 0.0F ? local449 : local439);
					local585 = (int) (local580 * local507);
					local606 = (int) (local580 * local498);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local624 = (int) (local487 * local580);
					if (local606 < 0) {
						local606 = 0;
					} else if (local606 > 255) {
						local606 = 255;
					}
					local199.anInt3520 = local110 + local106 * local476;
					if (local624 < 0) {
						local624 = 0;
					} else if (local624 > 255) {
						local624 = 255;
					}
					local199.method3079(local585);
					local199.method3079(local606);
					local199.method3079(local624);
					local199.method3079(255 - (this.aByteArray67[local451] & 0xFF));
				}
			} else {
				for (local207 = 0; local207 < this.anInt5711; local207++) {
					local216 = this.method4952(this.aShortArray162[local207], this.aShortArray167[local207], this.aByteArray67[local207], this.aShort73);
					local199.anInt3520 = this.aShortArray165[local207] * local106 + local110;
					local199.method3101(local216);
					local199.anInt3520 = this.aShortArray168[local207] * local106 + local110;
					local199.method3101(local216);
					local199.anInt3520 = this.aShortArray161[local207] * local106 + local110;
					local199.method3101(local216);
				}
			}
		}
		if (local27) {
			if (this.aClass18_1 == null) {
				local389 = this.aShortArray169;
				local386 = this.aShortArray171;
				local380 = this.aShortArray166;
				local383 = this.aByteArray68;
			} else {
				local380 = this.aClass18_1.aShortArray9;
				local386 = this.aClass18_1.aShortArray10;
				local383 = this.aClass18_1.aByteArray4;
				local389 = this.aClass18_1.aShortArray11;
			}
			@Pc(1119) float local1119 = 3.0F / (float) this.aShort70;
			local540 = 3.0F / (float) (this.aShort70 + this.aShort70 / 2);
			local199.anInt3520 = local118;
			if (this.aClass43_Sub3_22.aBoolean671) {
				for (local244 = 0; local244 < this.anInt5719; local244++) {
					local253 = local383[local244] & 0xFF;
					if (local253 == 0) {
						local199.method3142(local540 * (float) local380[local244]);
						local199.method3142((float) local389[local244] * local540);
						local199.method3142(local540 * (float) local386[local244]);
					} else {
						local498 = local1119 / (float) local253;
						local199.method3142((float) local380[local244] * local498);
						local199.method3142((float) local389[local244] * local498);
						local199.method3142(local498 * (float) local386[local244]);
					}
					local199.anInt3520 += local106 - 12;
				}
			} else {
				for (local244 = 0; local244 < this.anInt5719; local244++) {
					local253 = local383[local244] & 0xFF;
					if (local253 == 0) {
						local199.method3143((float) local380[local244] * local540);
						local199.method3143(local540 * (float) local389[local244]);
						local199.method3143(local540 * (float) local386[local244]);
					} else {
						local498 = local1119 / (float) local253;
						local199.method3143(local498 * (float) local380[local244]);
						local199.method3143((float) local389[local244] * local498);
						local199.method3143((float) local386[local244] * local498);
					}
					local199.anInt3520 += local106 - 12;
				}
			}
		}
		if (local49) {
			local199.anInt3520 = local129;
			if (this.aClass43_Sub3_22.aBoolean671) {
				for (local207 = 0; local207 < this.anInt5719; local207++) {
					local199.method3142(this.aFloatArray44[local207]);
					local199.method3142(this.aFloatArray45[local207]);
					local199.anInt3520 += local106 - 8;
				}
			} else {
				for (local207 = 0; local207 < this.anInt5719; local207++) {
					local199.method3143(this.aFloatArray44[local207]);
					local199.method3143(this.aFloatArray45[local207]);
					local199.anInt3520 += local106 - 8;
				}
			}
		}
		local199.anInt3520 = local106 * this.anInt5719;
		@Pc(1419) Interface7 local1419;
		if (arg0) {
			if (this.anInterface7_2 == null) {
				this.anInterface7_2 = this.aClass43_Sub3_22.method7241(local199.aByteArray36, local106, local199.anInt3520, true);
			} else {
				this.anInterface7_2.method6582(local199.aByteArray36, local199.anInt3520, local106);
			}
			local1419 = this.anInterface7_2;
			this.aByte68 = 0;
		} else {
			local1419 = this.aClass43_Sub3_22.method7241(local199.aByteArray36, local106, local199.anInt3520, false);
			this.aBoolean466 = true;
		}
		if (local38) {
			this.aClass280_6.anInterface7_5 = local1419;
			this.aClass280_6.aByte102 = 0;
		}
		if (local49) {
			this.aClass280_5.anInterface7_5 = local1419;
			this.aClass280_5.aByte102 = local129;
		}
		if (local16) {
			this.aClass280_8.aByte102 = local110;
			this.aClass280_8.anInterface7_5 = local1419;
		}
		if (local27) {
			this.aClass280_7.aByte102 = local118;
			this.aClass280_7.anInterface7_5 = local1419;
		}
	}

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub17.anIntArray175[arg0];
		@Pc(13) int local13 = Class3_Sub17.anIntArray177[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5717; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray443[local15] + this.anIntArray441[local15] * local13 >> 14;
			this.anIntArray443[local15] = local13 * this.anIntArray443[local15] - this.anIntArray441[local15] * local9 >> 14;
			this.anIntArray441[local15] = local34;
		}
		if (this.aClass280_6 != null) {
			this.aClass280_6.anInterface7_5 = null;
		}
		this.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!mb", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt5725;
	}

	@OriginalMember(owner = "client!mb", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean465) {
			this.method4955();
		}
		return this.aShort68;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BZ)V")
	private void method4948(@OriginalArg(1) boolean arg0) {
		if (this.anInt5686 * 6 <= this.aClass43_Sub3_22.aClass3_Sub11_Sub2_3.aByteArray36.length) {
			this.aClass43_Sub3_22.aClass3_Sub11_Sub2_3.anInt3520 = 0;
		} else {
			this.aClass43_Sub3_22.aClass3_Sub11_Sub2_3 = new Class3_Sub11_Sub2(this.anInt5686 * 6 + 600);
		}
		@Pc(42) Class3_Sub11_Sub2 local42 = this.aClass43_Sub3_22.aClass3_Sub11_Sub2_3;
		@Pc(48) int local48;
		if (this.aClass43_Sub3_22.aBoolean671) {
			for (local48 = 0; local48 < this.anInt5686; local48++) {
				local42.method3131(this.aShortArray165[local48]);
				local42.method3131(this.aShortArray168[local48]);
				local42.method3131(this.aShortArray161[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt5686; local48++) {
				local42.method3075(this.aShortArray165[local48]);
				local42.method3075(this.aShortArray168[local48]);
				local42.method3075(this.aShortArray161[local48]);
			}
		}
		if (local42.anInt3520 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface5_2 == null) {
				this.anInterface5_2 = this.aClass43_Sub3_22.method7288(true, local42.aByteArray36, local42.anInt3520);
			} else {
				this.anInterface5_2.method6870(local42.aByteArray36, local42.anInt3520);
			}
			this.aClass167_1.anInterface5_1 = this.anInterface5_2;
		} else {
			this.aClass167_1.anInterface5_1 = this.aClass43_Sub3_22.method7288(false, local42.aByteArray36, local42.anInt3520);
		}
		if (!arg0) {
			this.aBoolean466 = true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub17.anIntArray175[arg0];
		@Pc(13) int local13 = Class3_Sub17.anIntArray177[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5717; local15++) {
			@Pc(33) int local33 = this.anIntArray440[local15] * local9 + this.anIntArray441[local15] * local13 >> 14;
			this.anIntArray440[local15] = this.anIntArray440[local15] * local13 - local9 * this.anIntArray441[local15] >> 14;
			this.anIntArray441[local15] = local33;
		}
		if (this.aClass280_6 != null) {
			this.aClass280_6.anInterface7_5 = null;
		}
		this.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		if (this.aClass280_8 != null) {
			this.aClass280_8.anInterface7_5 = null;
		}
		this.aShort73 = (short) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5711; local3++) {
			if (this.aShortArray162[local3] == arg0) {
				this.aShortArray162[local3] = arg1;
			}
		}
		if (this.aClass162Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt5702; local34++) {
				@Pc(41) Class162 local41 = this.aClass162Array1[local34];
				@Pc(46) Class178 local46 = this.aClass178Array1[local34];
				local46.anInt4995 = local46.anInt4995 & 0xFF000000 | Static213.anIntArray342[this.aShortArray162[local41.anInt4514] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass280_8 != null) {
			this.aClass280_8.anInterface7_5 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5717; local7++) {
			this.anIntArray440[local7] = -this.anIntArray440[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5719; local25++) {
			this.aShortArray171[local25] = (short) -this.aShortArray171[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt5711; local48++) {
			@Pc(55) short local55 = this.aShortArray165[local48];
			this.aShortArray165[local48] = this.aShortArray161[local48];
			this.aShortArray161[local48] = local55;
		}
		if (this.aClass280_7 == null && this.aClass280_8 != null) {
			this.aClass280_8.anInterface7_5 = null;
		}
		if (this.aClass280_7 != null) {
			this.aClass280_7.anInterface7_5 = null;
		}
		if (this.aClass167_1 != null) {
			this.aClass167_1.anInterface5_1 = null;
		}
		this.aBoolean465 = false;
		if (this.aClass280_6 != null) {
			this.aClass280_6.anInterface7_5 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub3_Sub10 S(@OriginalArg(0) Class3_Sub3_Sub10 arg0) {
		if (this.anInt5719 == 0) {
			return null;
		}
		if (!this.aBoolean465) {
			this.method4955();
		}
		@Pc(37) int local37;
		@Pc(53) int local53;
		if (this.aClass43_Sub3_22.anInt8772 > 0) {
			local37 = this.aShort66 - (this.aClass43_Sub3_22.anInt8772 * this.aShort67 >> 8) >> this.aClass43_Sub3_22.anInt8734;
			local53 = this.aShort69 - (this.aShort75 * this.aClass43_Sub3_22.anInt8772 >> 8) >> this.aClass43_Sub3_22.anInt8734;
		} else {
			local37 = this.aShort66 - (this.aClass43_Sub3_22.anInt8772 * this.aShort75 >> 8) >> this.aClass43_Sub3_22.anInt8734;
			local53 = this.aShort69 - (this.aClass43_Sub3_22.anInt8772 * this.aShort67 >> 8) >> this.aClass43_Sub3_22.anInt8734;
		}
		@Pc(108) int local108;
		@Pc(125) int local125;
		if (this.aClass43_Sub3_22.anInt8771 > 0) {
			local108 = this.aShort71 - (this.aShort67 * this.aClass43_Sub3_22.anInt8771 >> 8) >> this.aClass43_Sub3_22.anInt8734;
			local125 = this.aShort74 - (this.aShort75 * this.aClass43_Sub3_22.anInt8771 >> 8) >> this.aClass43_Sub3_22.anInt8734;
		} else {
			local108 = this.aShort71 - (this.aClass43_Sub3_22.anInt8771 * this.aShort75 >> 8) >> this.aClass43_Sub3_22.anInt8734;
			local125 = this.aShort74 - (this.aClass43_Sub3_22.anInt8771 * this.aShort67 >> 8) >> this.aClass43_Sub3_22.anInt8734;
		}
		@Pc(166) int local166 = local53 + 1 - local37;
		@Pc(173) int local173 = local125 + 1 - local108;
		@Pc(176) Class3_Sub3_Sub10_Sub1 local176 = (Class3_Sub3_Sub10_Sub1) arg0;
		@Pc(192) Class3_Sub3_Sub10_Sub1 local192;
		if (local176 != null && local176.method2711(local173, local166)) {
			local192 = local176;
			local176.method2715();
		} else {
			local192 = new Class3_Sub3_Sub10_Sub1(this.aClass43_Sub3_22, local166, local173);
		}
		local192.method2712(local108, local125, local37, local53);
		this.method4944(local192);
		return local192;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	private void method4949() {
		if (this.aClass162Array1 == null) {
			return;
		}
		@Pc(13) Class109_Sub2 local13 = this.aClass43_Sub3_22.aClass109_Sub2_2;
		this.aClass43_Sub3_22.method7231();
		this.aClass43_Sub3_22.ZA(false);
		this.aClass43_Sub3_22.method7298(false);
		this.aClass43_Sub3_22.method7303(this.aClass43_Sub3_22.aClass280_15, this.aClass43_Sub3_22.aClass280_16, null, null);
		for (@Pc(40) int local40 = 0; local40 < this.anInt5702; local40++) {
			@Pc(47) Class162 local47 = this.aClass162Array1[local40];
			@Pc(52) Class178 local52 = this.aClass178Array1[local40];
			if (!local47.aBoolean348 || !this.aClass43_Sub3_22.method7216()) {
				@Pc(80) float local80 = (float) (this.anIntArray441[local47.anInt4518] + this.anIntArray441[local47.anInt4517] + this.anIntArray441[local47.anInt4516]) * 0.3333333F;
				@Pc(101) float local101 = (float) (this.anIntArray443[local47.anInt4516] + this.anIntArray443[local47.anInt4517] + this.anIntArray443[local47.anInt4518]) * 0.3333333F;
				@Pc(122) float local122 = (float) (this.anIntArray440[local47.anInt4518] + this.anIntArray440[local47.anInt4517] + this.anIntArray440[local47.anInt4516]) * 0.3333333F;
				@Pc(136) float local136 = Static288.aFloat112 * local122 + local80 * Static200.aFloat83 + Static79.aFloat31 * local101 + Static580.aFloat223;
				@Pc(150) float local150 = Static380.aFloat145 * local122 + Static94.aFloat38 * local101 + local80 * Static58.aFloat10 + Static365.aFloat225;
				@Pc(164) float local164 = local80 * Static536.aFloat185 + Static240.aFloat88 * local101 + Static232.aFloat86 * local122 + Static544.aFloat198;
				local13.method6775((float) local52.anInt4996 - local150, local52.anInt4991 * local47.aShort55 >> 7, local47.aShort54 * local52.anInt4994 >> 7, (float) local47.anInt4515 - local164, local136 + (float) local52.anInt5000, local52.anInt4999);
				this.aClass43_Sub3_22.method7235(local13);
				@Pc(207) int local207 = local52.anInt4995;
				OpenGL.glColor4ub((byte) (local207 >> 16), (byte) (local207 >> 8), (byte) local207, (byte) (local207 >> 24));
				this.aClass43_Sub3_22.method7294(local47.aShort56);
				this.aClass43_Sub3_22.method7222(local47.aByte58);
				this.aClass43_Sub3_22.method7263(4);
			}
		}
		this.aClass43_Sub3_22.ZA(true);
		this.aClass43_Sub3_22.method7295();
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
	private void method4951() {
		if (!this.aBoolean466) {
			return;
		}
		this.aBoolean466 = false;
		if (this.aClass323Array2 == null && this.aClass15Array2 == null && this.aClass162Array1 == null) {
			if (this.anIntArray441 != null && !Static448.method6268(this.anInt5746, this.anInt5725)) {
				if (this.aClass280_6 != null && this.aClass280_6.anInterface7_5 == null) {
					this.aBoolean466 = true;
				} else {
					if (!this.aBoolean465) {
						this.method4955();
					}
					this.anIntArray441 = null;
				}
			}
			if (this.anIntArray443 != null && !Static179.method3063(this.anInt5746, this.anInt5725)) {
				if (this.aClass280_6 != null && this.aClass280_6.anInterface7_5 == null) {
					this.aBoolean466 = true;
				} else {
					if (!this.aBoolean465) {
						this.method4955();
					}
					this.anIntArray443 = null;
				}
			}
			if (this.anIntArray440 != null && !Static578.method7666(this.anInt5746, this.anInt5725)) {
				if (this.aClass280_6 != null && this.aClass280_6.anInterface7_5 == null) {
					this.aBoolean466 = true;
				} else {
					if (!this.aBoolean465) {
						this.method4955();
					}
					this.anIntArray440 = null;
				}
			}
		}
		if (this.aShortArray164 != null && this.anIntArray441 == null && this.anIntArray443 == null && this.anIntArray440 == null) {
			this.aShortArray164 = null;
			this.anIntArray442 = null;
		}
		if (this.aByteArray68 != null && !Static304.method4783(this.anInt5725, this.anInt5746)) {
			if (this.aClass280_7 == null) {
				if (this.aClass280_8 != null && this.aClass280_8.anInterface7_5 == null) {
					this.aBoolean466 = true;
				} else {
					this.aShortArray166 = this.aShortArray169 = this.aShortArray171 = null;
					this.aByteArray68 = null;
				}
			} else if (this.aClass280_7.anInterface7_5 == null) {
				this.aBoolean466 = true;
			} else {
				this.aByteArray68 = null;
				this.aShortArray166 = this.aShortArray169 = this.aShortArray171 = null;
			}
		}
		if (this.aShortArray162 != null && !Static211.method3734(this.anInt5746, this.anInt5725)) {
			if (this.aClass280_8 != null && this.aClass280_8.anInterface7_5 == null) {
				this.aBoolean466 = true;
			} else {
				this.aShortArray162 = null;
			}
		}
		if (this.aByteArray67 != null && !Static268.method4378(this.anInt5725, this.anInt5746)) {
			if (this.aClass280_8 != null && this.aClass280_8.anInterface7_5 == null) {
				this.aBoolean466 = true;
			} else {
				this.aByteArray67 = null;
			}
		}
		if (this.aFloatArray44 != null && !Static597.method7821(this.anInt5725, this.anInt5746)) {
			if (this.aClass280_5 != null && this.aClass280_5.anInterface7_5 == null) {
				this.aBoolean466 = true;
			} else {
				this.aFloatArray44 = this.aFloatArray45 = null;
			}
		}
		if (this.aShortArray167 != null && !Static348.method5281(this.anInt5725, this.anInt5746)) {
			if (this.aClass280_8 != null && this.aClass280_8.anInterface7_5 == null) {
				this.aBoolean466 = true;
			} else {
				this.aShortArray167 = null;
			}
		}
		if (this.aShortArray165 != null && !Static76.method1687(this.anInt5746, this.anInt5725)) {
			if ((this.aClass167_1 == null || this.aClass167_1.anInterface5_1 != null) && (this.aClass280_8 == null || this.aClass280_8.anInterface7_5 != null)) {
				this.aShortArray165 = this.aShortArray168 = this.aShortArray161 = null;
			} else {
				this.aBoolean466 = true;
			}
		}
		if (this.anIntArrayArray46 != null && !Static502.method6774(this.anInt5725, this.anInt5746)) {
			this.anIntArrayArray46 = null;
			this.aShortArray163 = null;
		}
		if (this.anIntArrayArray44 != null && !Static2.method16(this.anInt5725, this.anInt5746)) {
			this.aShortArray170 = null;
			this.anIntArrayArray44 = null;
		}
		if (this.anIntArrayArray45 != null && !Static403.method5868(this.anInt5746, this.anInt5725)) {
			this.anIntArrayArray45 = null;
		}
		if (this.anIntArray444 != null && (this.anInt5725 & 0x800) == 0 && (this.anInt5725 & 0x40000) == 0) {
			this.anIntArray444 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5717; local7++) {
			if (arg0 != 128) {
				this.anIntArray441[local7] = this.anIntArray441[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray443[local7] = arg1 * this.anIntArray443[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray440[local7] = this.anIntArray440[local7] * arg2 >> 7;
			}
		}
		this.aBoolean465 = false;
		if (this.aClass280_6 != null) {
			this.aClass280_6.anInterface7_5 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort73;
	}

	@OriginalMember(owner = "client!mb", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5741; local7++) {
			this.anIntArray441[local7] = this.anIntArray441[local7] + 7 >> 4;
			this.anIntArray443[local7] = this.anIntArray443[local7] + 7 >> 4;
			this.anIntArray440[local7] = this.anIntArray440[local7] + 7 >> 4;
		}
		if (this.aClass280_6 != null) {
			this.aClass280_6.anInterface7_5 = null;
		}
		this.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!mb", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean465) {
			this.method4955();
		}
		return this.aShort75;
	}

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean465) {
			this.method4955();
		}
		return this.aShort69;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5711; local7++) {
			local16 = this.aShortArray162[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 += arg3 * (arg2 - local32) >> 7;
			}
			this.aShortArray162[local7] = (short) (local32 | local28 << 7 | local22 << 10);
		}
		if (this.aClass162Array1 != null) {
			for (local16 = 0; local16 < this.anInt5702; local16++) {
				@Pc(111) Class162 local111 = this.aClass162Array1[local16];
				@Pc(116) Class178 local116 = this.aClass178Array1[local16];
				local116.anInt4995 = local116.anInt4995 & 0xFF000000 | Static213.anIntArray342[this.aShortArray162[local111.anInt4514] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass280_8 != null) {
			this.aClass280_8.anInterface7_5 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!q;Lclient!ql;I)V")
	@Override
	public void method7501(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5719 == 0) {
			return;
		}
		@Pc(16) Class109_Sub2 local16 = this.aClass43_Sub3_22.aClass109_Sub2_3;
		if (!this.aBoolean465) {
			this.method4955();
		}
		@Pc(25) Class109_Sub2 local25 = (Class109_Sub2) arg0;
		Static240.aFloat88 = local25.aFloat173 * local16.aFloat166 + local16.aFloat168 * local25.aFloat167 + local25.aFloat168 * local16.aFloat164;
		Static544.aFloat198 = local16.aFloat165 + local25.aFloat165 * local16.aFloat164 + local16.aFloat166 * local25.aFloat170 + local25.aFloat174 * local16.aFloat168;
		@Pc(72) float local72 = (float) this.aShort75 * Static240.aFloat88 + Static544.aFloat198;
		@Pc(80) float local80 = Static544.aFloat198 + (float) this.aShort67 * Static240.aFloat88;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local80 < local72) {
			local96 = local80 - (float) this.aShort72;
			local90 = (float) this.aShort72 + local72;
		} else {
			local90 = (float) this.aShort72 + local80;
			local96 = local72 - (float) this.aShort72;
		}
		if (local96 >= this.aClass43_Sub3_22.aFloat205 || local90 <= (float) this.aClass43_Sub3_22.anInt8758) {
			return;
		}
		Static580.aFloat223 = local16.aFloat170 + local16.aFloat171 * local25.aFloat165 + local16.aFloat172 * local25.aFloat170 + local25.aFloat174 * local16.aFloat173;
		Static79.aFloat31 = local16.aFloat171 * local25.aFloat168 + local25.aFloat167 * local16.aFloat173 + local16.aFloat172 * local25.aFloat173;
		@Pc(172) float local172 = Static79.aFloat31 * (float) this.aShort75 + Static580.aFloat223;
		@Pc(180) float local180 = (float) this.aShort67 * Static79.aFloat31 + Static580.aFloat223;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local180 < local172) {
			local196 = ((float) -this.aShort72 + local180) * (float) this.aClass43_Sub3_22.anInt8760;
			local207 = (float) this.aClass43_Sub3_22.anInt8760 * (local172 + (float) this.aShort72);
		} else {
			local196 = (float) this.aClass43_Sub3_22.anInt8760 * (local172 - (float) this.aShort72);
			local207 = (float) this.aClass43_Sub3_22.anInt8760 * ((float) this.aShort72 + local180);
		}
		if (this.aClass43_Sub3_22.aFloat212 <= local196 / local90 || local207 / local90 <= this.aClass43_Sub3_22.aFloat199) {
			return;
		}
		Static94.aFloat38 = local16.aFloat167 * local25.aFloat167 + local25.aFloat173 * local16.aFloat175 + local16.aFloat169 * local25.aFloat168;
		Static365.aFloat225 = local16.aFloat169 * local25.aFloat165 + local16.aFloat175 * local25.aFloat170 + local25.aFloat174 * local16.aFloat167 + local16.aFloat174;
		@Pc(296) float local296 = Static365.aFloat225 + (float) this.aShort75 * Static94.aFloat38;
		@Pc(304) float local304 = Static365.aFloat225 + Static94.aFloat38 * (float) this.aShort67;
		@Pc(330) float local330;
		@Pc(319) float local319;
		if (local304 < local296) {
			local319 = (float) this.aClass43_Sub3_22.anInt8769 * ((float) this.aShort72 + local296);
			local330 = (local304 - (float) this.aShort72) * (float) this.aClass43_Sub3_22.anInt8769;
		} else {
			local330 = (local296 - (float) this.aShort72) * (float) this.aClass43_Sub3_22.anInt8769;
			local319 = ((float) this.aShort72 + local304) * (float) this.aClass43_Sub3_22.anInt8769;
		}
		if (this.aClass43_Sub3_22.aFloat204 <= local330 / local90 || local319 / local90 <= this.aClass43_Sub3_22.aFloat200) {
			return;
		}
		if (arg1 != null || this.aClass162Array1 != null) {
			Static200.aFloat83 = local16.aFloat173 * local25.aFloat175 + local25.aFloat172 * local16.aFloat172 + local25.aFloat166 * local16.aFloat171;
			Static58.aFloat10 = local25.aFloat166 * local16.aFloat169 + local25.aFloat175 * local16.aFloat167 + local16.aFloat175 * local25.aFloat172;
			Static232.aFloat86 = local16.aFloat166 * local25.aFloat171 + local25.aFloat169 * local16.aFloat168 + local16.aFloat164 * local25.aFloat164;
			Static536.aFloat185 = local25.aFloat172 * local16.aFloat166 + local25.aFloat175 * local16.aFloat168 + local25.aFloat166 * local16.aFloat164;
			Static380.aFloat145 = local16.aFloat167 * local25.aFloat169 + local25.aFloat171 * local16.aFloat175 + local25.aFloat164 * local16.aFloat169;
			Static288.aFloat112 = local16.aFloat172 * local25.aFloat171 + local25.aFloat169 * local16.aFloat173 + local16.aFloat171 * local25.aFloat164;
		}
		if (arg1 != null) {
			@Pc(489) boolean local489 = false;
			@Pc(491) boolean local491 = true;
			@Pc(499) int local499 = this.aShort66 + this.aShort69 >> 1;
			@Pc(508) int local508 = this.aShort71 + this.aShort74 >> 1;
			@Pc(527) int local527 = (int) (Static200.aFloat83 * (float) local499 + Static580.aFloat223 + Static79.aFloat31 * (float) this.aShort75 + (float) local508 * Static288.aFloat112);
			@Pc(546) int local546 = (int) ((float) local508 * Static380.aFloat145 + Static94.aFloat38 * (float) this.aShort75 + Static365.aFloat225 + Static58.aFloat10 * (float) local499);
			@Pc(565) int local565 = (int) (Static232.aFloat86 * (float) local508 + Static544.aFloat198 + (float) local499 * Static536.aFloat185 + Static240.aFloat88 * (float) this.aShort75);
			if (this.aClass43_Sub3_22.anInt8758 <= local565) {
				arg1.anInt7173 = this.aClass43_Sub3_22.anInt8752 + local546 * this.aClass43_Sub3_22.anInt8769 / local565;
				arg1.anInt7169 = this.aClass43_Sub3_22.anInt8753 + this.aClass43_Sub3_22.anInt8760 * local527 / local565;
			} else {
				local489 = true;
			}
			@Pc(624) int local624 = (int) (Static79.aFloat31 * (float) this.aShort67 + Static200.aFloat83 * (float) local499 + Static580.aFloat223 + (float) local508 * Static288.aFloat112);
			@Pc(643) int local643 = (int) (Static365.aFloat225 + (float) local499 * Static58.aFloat10 + (float) this.aShort67 * Static94.aFloat38 + (float) local508 * Static380.aFloat145);
			@Pc(662) int local662 = (int) ((float) local508 * Static232.aFloat86 + (float) this.aShort67 * Static240.aFloat88 + Static536.aFloat185 * (float) local499 + Static544.aFloat198);
			if (this.aClass43_Sub3_22.anInt8758 > local662) {
				local489 = true;
			} else {
				arg1.anInt7171 = local643 * this.aClass43_Sub3_22.anInt8769 / local662 + this.aClass43_Sub3_22.anInt8752;
				arg1.anInt7170 = local624 * this.aClass43_Sub3_22.anInt8760 / local662 + this.aClass43_Sub3_22.anInt8753;
			}
			if (local489) {
				if (this.aClass43_Sub3_22.anInt8758 > local565 && local662 < this.aClass43_Sub3_22.anInt8758) {
					local491 = false;
				} else {
					@Pc(740) int local740;
					@Pc(750) int local750;
					@Pc(762) int local762;
					if (local565 < this.aClass43_Sub3_22.anInt8758) {
						local740 = (local662 - this.aClass43_Sub3_22.anInt8758 << 16) / (local662 - local565);
						local750 = (local740 * (local624 - local527) >> 16) + local624;
						local762 = (local740 * (local643 - local546) >> 16) + local643;
						arg1.anInt7169 = this.aClass43_Sub3_22.anInt8753 + this.aClass43_Sub3_22.anInt8760 * local750 / this.aClass43_Sub3_22.anInt8758;
						arg1.anInt7173 = local762 * this.aClass43_Sub3_22.anInt8769 / this.aClass43_Sub3_22.anInt8758 + this.aClass43_Sub3_22.anInt8752;
					} else if (local662 < this.aClass43_Sub3_22.anInt8758) {
						local740 = (local565 - this.aClass43_Sub3_22.anInt8758 << 16) / (local565 - local662);
						local750 = ((local527 - local624) * local740 >> 16) + local527;
						local762 = local546 + ((local546 - local643) * local740 >> 16);
						arg1.anInt7169 = local750 * this.aClass43_Sub3_22.anInt8760 / this.aClass43_Sub3_22.anInt8758 + this.aClass43_Sub3_22.anInt8753;
						arg1.anInt7173 = this.aClass43_Sub3_22.anInt8752 + this.aClass43_Sub3_22.anInt8769 * local762 / this.aClass43_Sub3_22.anInt8758;
					}
				}
			}
			if (local491) {
				if (local565 > local662) {
					arg1.anInt7172 = this.aClass43_Sub3_22.anInt8753 + (local527 + this.aShort72) * this.aClass43_Sub3_22.anInt8760 / local565 - arg1.anInt7169;
				} else {
					arg1.anInt7172 = this.aClass43_Sub3_22.anInt8753 + this.aClass43_Sub3_22.anInt8760 * (this.aShort72 + local624) / local662 - arg1.anInt7170;
				}
				arg1.aBoolean567 = true;
			}
		}
		this.aClass43_Sub3_22.method7223();
		this.aClass43_Sub3_22.method7242(local25);
		this.method4941();
		this.aClass43_Sub3_22.method7295();
		this.method4949();
	}

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean465) {
			this.method4955();
		}
		return this.aShort72;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ISBII)I")
	private int method4952(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = Static213.anIntArray342[Static565.method7534(arg3, arg0)];
		if (arg1 != -1) {
			@Pc(28) Class224 local28 = this.aClass43_Sub3_22.anInterface8_12.method6560(arg1 & 0xFFFF);
			@Pc(33) int local33 = local28.aByte73 & 0xFF;
			@Pc(47) int local47;
			@Pc(71) int local71;
			if (local33 != 0) {
				if (arg3 < 0) {
					local47 = 0;
				} else if (arg3 <= 127) {
					local47 = arg3 * 131586;
				} else {
					local47 = 16777215;
				}
				if (local33 == 256) {
					local12 = local47;
				} else {
					local71 = 256 - local33;
					local12 = (local33 * (local47 & 0xFF00FF) + (local12 & 0xFF00FF) * local71 & 0xFF00FF00) + ((local12 & 0xFF00) * local71 + local33 * (local47 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local47 = local28.aByte71 & 0xFF;
			if (local47 != 0) {
				local47 += 256;
				@Pc(121) int local121 = local47 * (local12 >> 16 & 0xFF);
				if (local121 > 65535) {
					local121 = 65535;
				}
				local71 = (local12 >> 8 & 0xFF) * local47;
				if (local71 > 65535) {
					local71 = 65535;
				}
				@Pc(147) int local147 = local47 * (local12 & 0xFF);
				if (local147 > 65535) {
					local147 = 65535;
				}
				local12 = (local147 >> 8) + (local121 << 8 & 0xFF007D) + (local71 & 0xFF00);
			}
		}
		return (local12 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5717; local7++) {
			if (arg0 != 0) {
				this.anIntArray441[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray443[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray440[local7] += arg2;
			}
		}
		if (this.aClass280_6 != null) {
			this.aClass280_6.anInterface7_5 = null;
		}
		this.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!mb", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub17.anIntArray175[arg0];
		@Pc(13) int local13 = Class3_Sub17.anIntArray177[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5717; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray443[local15] - this.anIntArray440[local15] * local9 >> 14;
			this.anIntArray440[local15] = this.anIntArray440[local15] * local13 + this.anIntArray443[local15] * local9 >> 14;
			this.anIntArray443[local15] = local34;
		}
		this.aBoolean465 = false;
		if (this.aClass280_6 != null) {
			this.aClass280_6.anInterface7_5 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean465) {
			this.method4955();
		}
		return this.aShort74;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()Z")
	@Override
	public boolean method7526() {
		if (this.aShortArray167 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray167.length; local12++) {
			if (this.aShortArray167[local12] != -1 && !this.aClass43_Sub3_22.anInterface8_12.method6559(this.aShortArray167[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()V")
	@Override
	public void method7517() {
		if (this.anInt5719 <= 0 || this.anInt5686 <= 0) {
			return;
		}
		this.method4947(false);
		if ((this.aByte68 & 0x10) == 0 && this.aClass167_1.anInterface5_1 == null) {
			this.method4948(false);
		}
		this.method4951();
	}

	@OriginalMember(owner = "client!mb", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean465) {
			this.method4955();
		}
		return this.aShort71;
	}

	@OriginalMember(owner = "client!mb", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort70;
	}

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean465) {
			this.method4955();
		}
		return this.aShort67;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7524(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class57_Sub2 local8 = (Class57_Sub2) arg0;
		if (this.anInt5711 == 0 || local8.anInt5711 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt5717;
		@Pc(21) int[] local21 = local8.anIntArray441;
		@Pc(24) int[] local24 = local8.anIntArray443;
		@Pc(27) int[] local27 = local8.anIntArray440;
		@Pc(30) short[] local30 = local8.aShortArray166;
		@Pc(33) short[] local33 = local8.aShortArray169;
		@Pc(36) short[] local36 = local8.aShortArray171;
		@Pc(39) byte[] local39 = local8.aByteArray68;
		@Pc(50) short[] local50;
		@Pc(46) short[] local46;
		@Pc(48) short[] local48;
		@Pc(44) byte[] local44;
		if (this.aClass18_1 == null) {
			local44 = null;
			local46 = null;
			local48 = null;
			local50 = null;
		} else {
			local44 = this.aClass18_1.aByteArray4;
			local46 = this.aClass18_1.aShortArray11;
			local50 = this.aClass18_1.aShortArray9;
			local48 = this.aClass18_1.aShortArray10;
		}
		@Pc(87) short[] local87;
		@Pc(75) short[] local75;
		@Pc(79) short[] local79;
		@Pc(83) byte[] local83;
		if (local8.aClass18_1 == null) {
			local75 = null;
			local87 = null;
			local83 = null;
			local79 = null;
		} else {
			local75 = local8.aClass18_1.aShortArray11;
			local79 = local8.aClass18_1.aShortArray10;
			local83 = local8.aClass18_1.aByteArray4;
			local87 = local8.aClass18_1.aShortArray9;
		}
		@Pc(100) int[] local100 = local8.anIntArray442;
		@Pc(103) short[] local103 = local8.aShortArray164;
		if (!local8.aBoolean465) {
			local8.method4955();
		}
		@Pc(112) short local112 = local8.aShort75;
		@Pc(115) short local115 = local8.aShort67;
		@Pc(118) short local118 = local8.aShort66;
		@Pc(121) short local121 = local8.aShort69;
		@Pc(124) short local124 = local8.aShort71;
		@Pc(127) short local127 = local8.aShort74;
		for (@Pc(129) int local129 = 0; local129 < this.anInt5717; local129++) {
			@Pc(139) int local139 = this.anIntArray443[local129] - arg2;
			if (local139 >= local112 && local139 <= local115) {
				@Pc(155) int local155 = this.anIntArray441[local129] - arg1;
				if (local118 <= local155 && local121 >= local155) {
					@Pc(174) int local174 = this.anIntArray440[local129] - arg3;
					if (local124 <= local174 && local174 <= local127) {
						@Pc(188) int local188 = -1;
						@Pc(193) int local193 = this.anIntArray442[local129];
						@Pc(200) int local200 = this.anIntArray442[local129 + 1];
						for (@Pc(202) int local202 = local193; local202 < local200; local202++) {
							local188 = this.aShortArray164[local202] - 1;
							if (local188 == -1 || this.aByteArray68[local188] != 0) {
								break;
							}
						}
						if (local188 != -1) {
							for (@Pc(238) int local238 = 0; local238 < local18; local238++) {
								if (local155 == local21[local238] && local174 == local27[local238] && local24[local238] == local139) {
									local200 = local100[local238 + 1];
									@Pc(263) int local263 = -1;
									local193 = local100[local238];
									for (@Pc(269) int local269 = local193; local269 < local200; local269++) {
										local263 = local103[local269] - 1;
										if (local263 == -1 || local39[local263] != 0) {
											break;
										}
									}
									if (local263 != -1) {
										if (local50 == null) {
											this.aClass18_1 = new Class18();
											local50 = this.aClass18_1.aShortArray9 = Static89.method2017(this.aShortArray166);
											local46 = this.aClass18_1.aShortArray11 = Static89.method2017(this.aShortArray169);
											local48 = this.aClass18_1.aShortArray10 = Static89.method2017(this.aShortArray171);
											local44 = this.aClass18_1.aByteArray4 = Static339.method5176(this.aByteArray68);
										}
										if (local87 == null) {
											@Pc(349) Class18 local349 = local8.aClass18_1 = new Class18();
											local87 = local349.aShortArray9 = Static89.method2017(local30);
											local75 = local349.aShortArray11 = Static89.method2017(local33);
											local79 = local349.aShortArray10 = Static89.method2017(local36);
											local83 = local349.aByteArray4 = Static339.method5176(local39);
										}
										@Pc(382) short local382 = this.aShortArray166[local188];
										@Pc(387) short local387 = this.aShortArray169[local188];
										@Pc(392) short local392 = this.aShortArray171[local188];
										@Pc(397) byte local397 = this.aByteArray68[local188];
										local200 = local100[local238 + 1];
										local193 = local100[local238];
										@Pc(417) int local417;
										for (@Pc(409) int local409 = local193; local409 < local200; local409++) {
											local417 = local103[local409] - 1;
											if (local417 == -1) {
												break;
											}
											if (local83[local417] != 0) {
												local87[local417] += local382;
												local75[local417] += local387;
												local79[local417] += local392;
												local83[local417] += local397;
											}
										}
										local397 = local39[local263];
										local200 = this.anIntArray442[local129 + 1];
										local387 = local33[local263];
										local193 = this.anIntArray442[local129];
										local382 = local30[local263];
										local392 = local36[local263];
										for (local417 = local193; local417 < local200; local417++) {
											@Pc(504) int local504 = this.aShortArray164[local417] - 1;
											if (local504 == -1) {
												break;
											}
											if (local44[local504] != 0) {
												local50[local504] += local382;
												local46[local504] += local387;
												local48[local504] += local392;
												local44[local504] += local397;
											}
										}
										if (this.aClass280_7 == null && this.aClass280_8 != null) {
											this.aClass280_8.anInterface7_5 = null;
										}
										if (this.aClass280_7 != null) {
											this.aClass280_7.anInterface7_5 = null;
										}
										if (local8.aClass280_7 == null && local8.aClass280_8 != null) {
											local8.aClass280_8.anInterface7_5 = null;
										}
										if (local8.aClass280_7 != null) {
											local8.aClass280_7.anInterface7_5 = null;
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

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(FIFJIIIILclient!nda;I)S")
	private short method4953(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class226 arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray442[arg6];
		@Pc(17) int local17 = this.anIntArray442[arg6 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray164[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static47.aLongArray1[local21] == arg3) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray164[local19] = (short) (this.anInt5719 + 1);
		Static47.aLongArray1[local19] = arg3;
		this.aShortArray166[this.anInt5719] = (short) arg4;
		this.aShortArray169[this.anInt5719] = (short) arg1;
		this.aShortArray171[this.anInt5719] = (short) arg5;
		this.aByteArray68[this.anInt5719] = (byte) arg8;
		this.aFloatArray44[this.anInt5719] = arg2;
		this.aFloatArray45[this.anInt5719] = arg0;
		return (short) this.anInt5719++;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!q;IIZ)Z")
	private boolean method4954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(8) Class109_Sub2 local8 = (Class109_Sub2) arg2;
		@Pc(12) Class109_Sub2 local12 = this.aClass43_Sub3_22.aClass109_Sub2_3;
		@Pc(33) float local33 = local12.aFloat170 + local8.aFloat165 * local12.aFloat171 + local8.aFloat174 * local12.aFloat173 + local12.aFloat172 * local8.aFloat170;
		@Pc(54) float local54 = local12.aFloat174 + local12.aFloat175 * local8.aFloat170 + local8.aFloat174 * local12.aFloat167 + local12.aFloat169 * local8.aFloat165;
		Static200.aFloat83 = local8.aFloat166 * local12.aFloat171 + local8.aFloat172 * local12.aFloat172 + local8.aFloat175 * local12.aFloat173;
		Static79.aFloat31 = local8.aFloat168 * local12.aFloat171 + local12.aFloat172 * local8.aFloat173 + local8.aFloat167 * local12.aFloat173;
		Static58.aFloat10 = local8.aFloat166 * local12.aFloat169 + local8.aFloat175 * local12.aFloat167 + local8.aFloat172 * local12.aFloat175;
		Static288.aFloat112 = local8.aFloat164 * local12.aFloat171 + local8.aFloat169 * local12.aFloat173 + local12.aFloat172 * local8.aFloat171;
		Static232.aFloat86 = local8.aFloat171 * local12.aFloat166 + local12.aFloat168 * local8.aFloat169 + local12.aFloat164 * local8.aFloat164;
		Static380.aFloat145 = local8.aFloat171 * local12.aFloat175 + local12.aFloat167 * local8.aFloat169 + local8.aFloat164 * local12.aFloat169;
		Static240.aFloat88 = local12.aFloat166 * local8.aFloat173 + local8.aFloat167 * local12.aFloat168 + local8.aFloat168 * local12.aFloat164;
		Static536.aFloat185 = local12.aFloat168 * local8.aFloat175 + local8.aFloat172 * local12.aFloat166 + local12.aFloat164 * local8.aFloat166;
		Static94.aFloat38 = local8.aFloat168 * local12.aFloat169 + local12.aFloat167 * local8.aFloat167 + local8.aFloat173 * local12.aFloat175;
		@Pc(237) float local237 = local12.aFloat165 + local12.aFloat168 * local8.aFloat174 + local12.aFloat166 * local8.aFloat170 + local12.aFloat164 * local8.aFloat165;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass43_Sub3_22.anInt8760;
		@Pc(255) int local255 = this.aClass43_Sub3_22.anInt8769;
		if (!this.aBoolean465) {
			this.method4955();
		}
		Static438.anIntArray357[0] = this.aShort66;
		Static90.anIntArray143[0] = this.aShort75;
		Static438.anIntArray357[1] = this.aShort69;
		Static476.anIntArray631[0] = this.aShort71;
		Static90.anIntArray143[1] = this.aShort75;
		Static476.anIntArray631[1] = this.aShort71;
		Static438.anIntArray357[2] = this.aShort66;
		Static90.anIntArray143[2] = this.aShort67;
		Static438.anIntArray357[3] = this.aShort69;
		Static476.anIntArray631[2] = this.aShort71;
		Static90.anIntArray143[3] = this.aShort67;
		Static438.anIntArray357[4] = this.aShort66;
		Static476.anIntArray631[3] = this.aShort71;
		Static90.anIntArray143[4] = this.aShort75;
		Static476.anIntArray631[4] = this.aShort74;
		Static438.anIntArray357[5] = this.aShort69;
		Static90.anIntArray143[5] = this.aShort75;
		Static438.anIntArray357[6] = this.aShort66;
		Static476.anIntArray631[5] = this.aShort74;
		Static90.anIntArray143[6] = this.aShort67;
		Static438.anIntArray357[7] = this.aShort69;
		Static476.anIntArray631[6] = this.aShort74;
		Static90.anIntArray143[7] = this.aShort67;
		Static476.anIntArray631[7] = this.aShort74;
		@Pc(447) float local447;
		@Pc(433) float local433;
		@Pc(419) float local419;
		@Pc(405) float local405;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(388) int local388 = 0; local388 < 8; local388++) {
			local395 = Static476.anIntArray631[local388];
			local400 = Static90.anIntArray143[local388];
			local405 = Static438.anIntArray357[local388];
			local419 = local237 + local395 * Static232.aFloat86 + local400 * Static240.aFloat88 + local405 * Static536.aFloat185;
			local433 = Static58.aFloat10 * local405 + Static94.aFloat38 * local400 + local395 * Static380.aFloat145 + local54;
			local447 = local33 + Static79.aFloat31 * local400 + local405 * Static200.aFloat83 + Static288.aFloat112 * local395;
			if (local419 >= (float) this.aClass43_Sub3_22.anInt8758) {
				if (arg1 > 0) {
					local419 = arg1;
				}
				@Pc(471) float local471 = (float) this.aClass43_Sub3_22.anInt8753 + local447 * (float) local251 / local419;
				if (local471 > local243) {
					local243 = local471;
				}
				if (local471 < local241) {
					local241 = local471;
				}
				@Pc(495) float local495 = (float) this.aClass43_Sub3_22.anInt8752 + local433 * (float) local255 / local419;
				if (local245 > local495) {
					local245 = local495;
				}
				local239 = true;
				if (local247 < local495) {
					local247 = local495;
				}
			}
		}
		if (local239 && (float) arg3 > local241 && (float) arg3 < local243 && (float) arg0 > local245 && (float) arg0 < local247) {
			if (arg4) {
				return true;
			}
			if (this.anInt5719 > this.aClass43_Sub3_22.anIntArray643.length) {
				this.aClass43_Sub3_22.anIntArray643 = new int[this.anInt5719];
				this.aClass43_Sub3_22.anIntArray642 = new int[this.anInt5719];
			}
			@Pc(568) int[] local568 = this.aClass43_Sub3_22.anIntArray643;
			@Pc(572) int[] local572 = this.aClass43_Sub3_22.anIntArray642;
			@Pc(664) int local664;
			for (@Pc(574) int local574 = 0; local574 < this.anInt5717; local574++) {
				local395 = this.anIntArray440[local574];
				local400 = this.anIntArray443[local574];
				local405 = this.anIntArray441[local574];
				local447 = local33 + local395 * Static288.aFloat112 + local400 * Static79.aFloat31 + local405 * Static200.aFloat83;
				local433 = local400 * Static94.aFloat38 + Static58.aFloat10 * local405 + local395 * Static380.aFloat145 + local54;
				local419 = local237 + Static536.aFloat185 * local405 + Static240.aFloat88 * local400 + local395 * Static232.aFloat86;
				@Pc(677) int local677;
				@Pc(682) int local682;
				@Pc(689) int local689;
				if ((float) this.aClass43_Sub3_22.anInt8758 <= local419) {
					if (arg1 > 0) {
						local419 = arg1;
					}
					local664 = (int) ((float) this.aClass43_Sub3_22.anInt8753 + local447 * (float) local251 / local419);
					local677 = (int) ((float) local255 * local433 / local419 + (float) this.aClass43_Sub3_22.anInt8752);
					local682 = this.anIntArray442[local574];
					local689 = this.anIntArray442[local574 + 1];
					for (@Pc(691) int local691 = local682; local691 < local689; local691++) {
						@Pc(700) int local700 = this.aShortArray164[local691] - 1;
						if (local700 == -1) {
							break;
						}
						local568[local700] = local664;
						local572[local700] = local677;
					}
				} else {
					local664 = this.anIntArray442[local574];
					local677 = this.anIntArray442[local574 + 1];
					for (local682 = local664; local682 < local677; local682++) {
						local689 = this.aShortArray164[local682] - 1;
						if (local689 == -1) {
							break;
						}
						local568[this.aShortArray164[local682] - 1] = -999999;
					}
				}
			}
			for (local664 = 0; local664 < this.anInt5711; local664++) {
				if (local568[this.aShortArray165[local664]] != -999999 && local568[this.aShortArray168[local664]] != -999999 && local568[this.aShortArray161[local664]] != -999999 && this.method4940(local572[this.aShortArray161[local664]], local572[this.aShortArray165[local664]], arg3, local572[this.aShortArray168[local664]], local568[this.aShortArray161[local664]], arg0, local568[this.aShortArray165[local664]], local568[this.aShortArray168[local664]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "()V")
	@Override
	protected void method7508() {
	}

	@OriginalMember(owner = "client!mb", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.anInt5725 = arg0;
		if (this.aClass18_1 != null && (this.anInt5725 & 0x10000) == 0) {
			this.aShortArray166 = this.aClass18_1.aShortArray9;
			this.aShortArray169 = this.aClass18_1.aShortArray11;
			this.aShortArray171 = this.aClass18_1.aShortArray10;
			this.aByteArray68 = this.aClass18_1.aByteArray4;
			this.aClass18_1 = null;
		}
		this.aBoolean466 = true;
		this.method4951();
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	private void method4955() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt5717; local27++) {
			@Pc(34) int local34 = this.anIntArray441[local27];
			@Pc(39) int local39 = this.anIntArray443[local27];
			if (local39 > local15) {
				local15 = local39;
			}
			if (local13 < local34) {
				local13 = local34;
			}
			@Pc(54) int local54 = this.anIntArray440[local27];
			if (local39 < local9) {
				local9 = local39;
			}
			if (local7 > local34) {
				local7 = local34;
			}
			if (local54 > local17) {
				local17 = local54;
			}
			if (local54 < local11) {
				local11 = local54;
			}
			@Pc(90) int local90 = local34 * local34 + local54 * local54;
			if (local19 < local90) {
				local19 = local90;
			}
			local90 = local54 * local54 + local34 * local34 + local39 * local39;
			if (local25 < local90) {
				local25 = local90;
			}
		}
		this.aShort74 = (short) local17;
		this.aShort71 = (short) local11;
		this.aShort66 = (short) local7;
		this.aShort69 = (short) local13;
		this.aShort67 = (short) local15;
		this.aShort75 = (short) local9;
		this.aShort72 = (short) (Math.sqrt((double) local19) + 0.99D);
		this.aShort68 = (short) (Math.sqrt((double) local25) + 0.99D);
		this.aBoolean465 = true;
	}

	@OriginalMember(owner = "client!mb", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static369.anInt6329 = 0;
			Static480.anInt7789 = 0;
			Static88.anInt2201 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt5717; local17++) {
				Static369.anInt6329 += this.anIntArray441[local17];
				Static480.anInt7789 += this.anIntArray443[local17];
				Static88.anInt2201 += this.anIntArray440[local17];
				local15++;
			}
			if (local15 > 0) {
				Static480.anInt7789 = arg2 + Static480.anInt7789 / local15;
				Static88.anInt2201 = arg3 + Static88.anInt2201 / local15;
				Static369.anInt6329 = Static369.anInt6329 / local15 + arg1;
			} else {
				Static369.anInt6329 = arg1;
				Static480.anInt7789 = arg2;
				Static88.anInt2201 = arg3;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt5717; local15++) {
				this.anIntArray441[local15] += arg1;
				this.anIntArray443[local15] += arg2;
				this.anIntArray440[local15] += arg3;
			}
		} else {
			@Pc(160) int local160;
			@Pc(179) int local179;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt5717; local15++) {
					this.anIntArray441[local15] -= Static369.anInt6329;
					this.anIntArray443[local15] -= Static480.anInt7789;
					this.anIntArray440[local15] -= Static88.anInt2201;
					if (arg3 != 0) {
						local17 = Class3_Sub17.anIntArray175[arg3];
						local160 = Class3_Sub17.anIntArray177[arg3];
						local179 = local17 * this.anIntArray443[local15] + local160 * this.anIntArray441[local15] + 16383 >> 14;
						this.anIntArray443[local15] = local160 * this.anIntArray443[local15] + 16383 - this.anIntArray441[local15] * local17 >> 14;
						this.anIntArray441[local15] = local179;
					}
					if (arg1 != 0) {
						local17 = Class3_Sub17.anIntArray175[arg1];
						local160 = Class3_Sub17.anIntArray177[arg1];
						local179 = this.anIntArray443[local15] * local160 + 16383 - local17 * this.anIntArray440[local15] >> 14;
						this.anIntArray440[local15] = this.anIntArray443[local15] * local17 + this.anIntArray440[local15] * local160 + 16383 >> 14;
						this.anIntArray443[local15] = local179;
					}
					if (arg2 != 0) {
						local17 = Class3_Sub17.anIntArray175[arg2];
						local160 = Class3_Sub17.anIntArray177[arg2];
						local179 = this.anIntArray441[local15] * local160 + local17 * this.anIntArray440[local15] + 16383 >> 14;
						this.anIntArray440[local15] = local160 * this.anIntArray440[local15] + 16383 - local17 * this.anIntArray441[local15] >> 14;
						this.anIntArray441[local15] = local179;
					}
					this.anIntArray441[local15] += Static369.anInt6329;
					this.anIntArray443[local15] += Static480.anInt7789;
					this.anIntArray440[local15] += Static88.anInt2201;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt5717; local15++) {
					this.anIntArray441[local15] -= Static369.anInt6329;
					this.anIntArray443[local15] -= Static480.anInt7789;
					this.anIntArray440[local15] -= Static88.anInt2201;
					this.anIntArray441[local15] = arg1 * this.anIntArray441[local15] / 128;
					this.anIntArray443[local15] = this.anIntArray443[local15] * arg2 / 128;
					this.anIntArray440[local15] = arg3 * this.anIntArray440[local15] / 128;
					this.anIntArray441[local15] += Static369.anInt6329;
					this.anIntArray443[local15] += Static480.anInt7789;
					this.anIntArray440[local15] += Static88.anInt2201;
				}
			} else {
				@Pc(510) Class162 local510;
				@Pc(515) Class178 local515;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt5711; local15++) {
						local17 = arg1 * 8 + (this.aByteArray67[local15] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray67[local15] = (byte) local17;
					}
					if (this.aClass280_8 != null) {
						this.aClass280_8.anInterface7_5 = null;
					}
					if (this.aClass162Array1 != null) {
						for (local17 = 0; local17 < this.anInt5702; local17++) {
							local510 = this.aClass162Array1[local17];
							local515 = this.aClass178Array1[local17];
							local515.anInt4995 = local515.anInt4995 & 0xFFFFFF | 255 - (this.aByteArray67[local510.anInt4514] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt5711; local15++) {
						local17 = this.aShortArray162[local15] & 0xFFFF;
						local160 = local17 >> 10 & 0x3F;
						local179 = local17 >> 7 & 0x7;
						@Pc(574) int local574 = arg1 + local160 & 0x3F;
						@Pc(578) int local578 = local17 & 0x7F;
						local179 += arg2 / 4;
						if (local179 < 0) {
							local179 = 0;
						} else if (local179 > 7) {
							local179 = 7;
						}
						local578 += arg3;
						if (local578 < 0) {
							local578 = 0;
						} else if (local578 > 127) {
							local578 = 127;
						}
						this.aShortArray162[local15] = (short) (local578 | local179 << 7 | local574 << 10);
					}
					if (this.aClass280_8 != null) {
						this.aClass280_8.anInterface7_5 = null;
					}
					if (this.aClass162Array1 != null) {
						for (local17 = 0; local17 < this.anInt5702; local17++) {
							local510 = this.aClass162Array1[local17];
							local515 = this.aClass178Array1[local17];
							local515.anInt4995 = local515.anInt4995 & 0xFF000000 | Static213.anIntArray342[this.aShortArray162[local510.anInt4514] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(700) Class178 local700;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt5702; local15++) {
							local700 = this.aClass178Array1[local15];
							local700.anInt5000 += arg1;
							local700.anInt4996 += arg2;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt5702; local15++) {
							local700 = this.aClass178Array1[local15];
							local700.anInt4994 = local700.anInt4994 * arg2 >> 7;
							local700.anInt4991 = arg1 * local700.anInt4991 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt5702; local15++) {
							local700 = this.aClass178Array1[local15];
							local700.anInt4999 = local700.anInt4999 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7525(@OriginalArg(0) Class109 arg0) {
		@Pc(8) Class109_Sub2 local8 = (Class109_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass323Array2 != null) {
			for (local13 = 0; local13 < this.aClass323Array2.length; local13++) {
				@Pc(20) Class323 local20 = this.aClass323Array2[local13];
				@Pc(22) Class323 local22 = local20;
				if (local20.aClass323_2 != null) {
					local22 = local20.aClass323_2;
				}
				local22.anInt8107 = (int) (local8.aFloat170 + (float) this.anIntArray440[local20.anInt8095] * local8.aFloat171 + local8.aFloat172 * (float) this.anIntArray441[local20.anInt8095] + (float) this.anIntArray443[local20.anInt8095] * local8.aFloat173);
				local22.anInt8098 = (int) (local8.aFloat174 + local8.aFloat175 * (float) this.anIntArray441[local20.anInt8095] + local8.aFloat167 * (float) this.anIntArray443[local20.anInt8095] + local8.aFloat169 * (float) this.anIntArray440[local20.anInt8095]);
				local22.anInt8093 = (int) (local8.aFloat164 * (float) this.anIntArray440[local20.anInt8095] + (float) this.anIntArray443[local20.anInt8095] * local8.aFloat168 + local8.aFloat166 * (float) this.anIntArray441[local20.anInt8095] + local8.aFloat165);
				local22.anInt8101 = (int) (local8.aFloat170 + local8.aFloat171 * (float) this.anIntArray440[local20.anInt8103] + (float) this.anIntArray441[local20.anInt8103] * local8.aFloat172 + local8.aFloat173 * (float) this.anIntArray443[local20.anInt8103]);
				local22.anInt8094 = (int) ((float) this.anIntArray443[local20.anInt8103] * local8.aFloat167 + local8.aFloat175 * (float) this.anIntArray441[local20.anInt8103] + local8.aFloat169 * (float) this.anIntArray440[local20.anInt8103] + local8.aFloat174);
				local22.anInt8109 = (int) (local8.aFloat168 * (float) this.anIntArray443[local20.anInt8103] + local8.aFloat166 * (float) this.anIntArray441[local20.anInt8103] + (float) this.anIntArray440[local20.anInt8103] * local8.aFloat164 + local8.aFloat165);
				local22.anInt8092 = (int) ((float) this.anIntArray443[local20.anInt8106] * local8.aFloat173 + local8.aFloat172 * (float) this.anIntArray441[local20.anInt8106] + local8.aFloat171 * (float) this.anIntArray440[local20.anInt8106] + local8.aFloat170);
				local22.anInt8108 = (int) (local8.aFloat174 + local8.aFloat175 * (float) this.anIntArray441[local20.anInt8106] + local8.aFloat167 * (float) this.anIntArray443[local20.anInt8106] + (float) this.anIntArray440[local20.anInt8106] * local8.aFloat169);
				local22.anInt8104 = (int) (local8.aFloat164 * (float) this.anIntArray440[local20.anInt8106] + local8.aFloat168 * (float) this.anIntArray443[local20.anInt8106] + (float) this.anIntArray441[local20.anInt8106] * local8.aFloat166 + local8.aFloat165);
			}
		}
		if (this.aClass15Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass15Array2.length; local13++) {
			@Pc(361) Class15 local361 = this.aClass15Array2[local13];
			@Pc(363) Class15 local363 = local361;
			if (local361.aClass15_1 != null) {
				local363 = local361.aClass15_1;
			}
			if (local361.aClass109_1 == null) {
				local361.aClass109_1 = local8.method7100();
			} else {
				local361.aClass109_1.M(local8);
			}
			local363.anInt549 = (int) (local8.aFloat170 + local8.aFloat172 * (float) this.anIntArray441[local361.anInt548] + (float) this.anIntArray443[local361.anInt548] * local8.aFloat173 + local8.aFloat171 * (float) this.anIntArray440[local361.anInt548]);
			local363.anInt538 = (int) (local8.aFloat174 + (float) this.anIntArray441[local361.anInt548] * local8.aFloat175 + (float) this.anIntArray443[local361.anInt548] * local8.aFloat167 + (float) this.anIntArray440[local361.anInt548] * local8.aFloat169);
			local363.anInt541 = (int) (local8.aFloat165 + (float) this.anIntArray440[local361.anInt548] * local8.aFloat164 + (float) this.anIntArray443[local361.anInt548] * local8.aFloat168 + (float) this.anIntArray441[local361.anInt548] * local8.aFloat166);
		}
	}

	@OriginalMember(owner = "client!mb", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean464;
	}
}
