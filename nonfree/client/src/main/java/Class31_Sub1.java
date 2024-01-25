import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!du", name = "i", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "[Lclient!ig;")
	private Class108[] aClass108Array1;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "B")
	private byte aByte21;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!du", name = "u", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!du", name = "y", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!du", name = "B", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!du", name = "D", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!du", name = "I", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!du", name = "K", descriptor = "Lclient!kg;")
	private Class132 aClass132_1;

	@OriginalMember(owner = "client!du", name = "M", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!du", name = "O", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!du", name = "V", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!du", name = "X", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!du", name = "Z", descriptor = "[F")
	private float[] aFloatArray12;

	@OriginalMember(owner = "client!du", name = "ab", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!du", name = "hb", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!du", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!du", name = "mb", descriptor = "[Lclient!ot;")
	private Class178[] aClass178Array1;

	@OriginalMember(owner = "client!du", name = "qb", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!du", name = "rb", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!du", name = "vb", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!du", name = "yb", descriptor = "[Lclient!ub;")
	private Class232[] aClass232Array1;

	@OriginalMember(owner = "client!du", name = "Db", descriptor = "S")
	private short aShort50;

	@OriginalMember(owner = "client!du", name = "Eb", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!du", name = "Kb", descriptor = "[F")
	private float[] aFloatArray13;

	@OriginalMember(owner = "client!du", name = "Lb", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!du", name = "Ob", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!du", name = "Qb", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!du", name = "Sb", descriptor = "Lclient!cm;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!du", name = "Tb", descriptor = "[Lclient!sm;")
	private Class209[] aClass209Array1;

	@OriginalMember(owner = "client!du", name = "Wb", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!du", name = "Xb", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!du", name = "Yb", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!du", name = "Zb", descriptor = "I")
	private int anInt1798;

	@OriginalMember(owner = "client!du", name = "cc", descriptor = "Lclient!hh;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!du", name = "dc", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!du", name = "fc", descriptor = "I")
	private int anInt1802;

	@OriginalMember(owner = "client!du", name = "hc", descriptor = "I")
	private int anInt1804;

	@OriginalMember(owner = "client!du", name = "ic", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!du", name = "kc", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!du", name = "oc", descriptor = "S")
	private short aShort51;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "Z")
	private boolean aBoolean139 = true;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "I")
	private int anInt1752 = 0;

	@OriginalMember(owner = "client!du", name = "L", descriptor = "I")
	private int anInt1762 = 0;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!du", name = "cb", descriptor = "I")
	private int anInt1769 = 0;

	@OriginalMember(owner = "client!du", name = "J", descriptor = "I")
	private int anInt1761 = 0;

	@OriginalMember(owner = "client!du", name = "Nb", descriptor = "I")
	private int anInt1793 = 0;

	@OriginalMember(owner = "client!du", name = "P", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_10;

	@OriginalMember(owner = "client!du", name = "S", descriptor = "Lclient!tp;")
	private Class225 aClass225_2;

	@OriginalMember(owner = "client!du", name = "W", descriptor = "Lclient!tp;")
	private Class225 aClass225_3;

	@OriginalMember(owner = "client!du", name = "Bb", descriptor = "Lclient!tp;")
	private Class225 aClass225_4;

	@OriginalMember(owner = "client!du", name = "E", descriptor = "Lclient!tp;")
	private Class225 aClass225_1;

	@OriginalMember(owner = "client!du", name = "T", descriptor = "Lclient!wu;")
	private Class269 aClass269_1;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class31_Sub1(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aClass75_Sub2_10 = arg0;
		this.aClass225_2 = new Class225(this.aClass75_Sub2_10, null, 5126, 3, 0);
		this.aClass225_3 = new Class225(this.aClass75_Sub2_10, null, 5126, 2, 0);
		this.aClass225_4 = new Class225(this.aClass75_Sub2_10, null, 5126, 3, 0);
		this.aClass225_1 = new Class225(this.aClass75_Sub2_10, null, 5121, 4, 0);
		this.aClass269_1 = new Class269();
	}

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!gk;Lclient!uu;IIII)V")
	public Class31_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1804 = arg5;
		this.aClass75_Sub2_10 = arg0;
		this.anInt1802 = arg2;
		if (Static167.method5105(arg2, arg5)) {
			this.aClass225_2 = new Class225(this.aClass75_Sub2_10, null, 5126, 3, 0);
		}
		if (Static129.method2234(arg2, arg5)) {
			this.aClass225_3 = new Class225(this.aClass75_Sub2_10, null, 5126, 2, 0);
		}
		if (Static433.method5746(arg5, arg2)) {
			this.aClass225_4 = new Class225(this.aClass75_Sub2_10, null, 5126, 3, 0);
		}
		if (Static413.method3224(arg2, arg5)) {
			this.aClass225_1 = new Class225(this.aClass75_Sub2_10, null, 5121, 4, 0);
		}
		if (Static85.method5961(arg2, arg5)) {
			this.aClass269_1 = new Class269();
		}
		@Pc(110) Interface7 local110 = arg0.anInterface7_6;
		@Pc(114) int[] local114 = new int[arg1.anInt7157];
		this.anIntArray157 = new int[arg1.anInt7158 + 1];
		for (@Pc(123) int local123 = 0; local123 < arg1.anInt7157; local123++) {
			if ((arg1.aByteArray79 == null || arg1.aByteArray79[local123] != 2) && (arg1.aShortArray90 == null || arg1.aShortArray90[local123] == -1 || !local110.method2131(arg1.aShortArray90[local123] & 0xFFFF).aBoolean147)) {
				local114[this.anInt1769++] = local123;
				this.anIntArray157[arg1.aShortArray91[local123]]++;
				this.anIntArray157[arg1.aShortArray97[local123]]++;
				this.anIntArray157[arg1.aShortArray98[local123]]++;
			}
		}
		this.anInt1752 = this.anInt1769;
		@Pc(213) long[] local213 = new long[this.anInt1769];
		@Pc(222) boolean local222 = (this.anInt1802 & 0x100) != 0;
		@Pc(234) int local234;
		@Pc(245) int local245;
		@Pc(366) int local366;
		label490: for (@Pc(224) int local224 = 0; local224 < this.anInt1769; local224++) {
			@Pc(230) int local230 = local114[local224];
			@Pc(232) Class62 local232 = null;
			local234 = 0;
			@Pc(236) byte local236 = 0;
			@Pc(238) byte local238 = 0;
			@Pc(240) byte local240 = 0;
			if (arg1.aClass266Array1 != null) {
				for (local245 = 0; local245 < arg1.aClass266Array1.length; local245++) {
					@Pc(252) Class266 local252 = arg1.aClass266Array1[local245];
					if (local252.anInt7551 == local230) {
						@Pc(261) Class79 local261 = Static128.method2226(local252.anInt7556);
						if (local261.aBoolean202) {
							local213[local224] = Long.MAX_VALUE;
							this.anInt1752--;
							continue label490;
						}
					}
				}
			}
			@Pc(284) short local284 = -1;
			if (arg1.aShortArray90 != null) {
				local284 = arg1.aShortArray90[local230];
				if (local284 != -1) {
					local232 = local110.method2131(local284 & 0xFFFF);
					local238 = local232.aByte28;
					local240 = local232.aByte23;
				}
			}
			@Pc(328) boolean local328 = arg1.aByteArray80 != null && arg1.aByteArray80[local230] != 0 || local232 != null && !local232.aBoolean148;
			if ((local222 || local328) && arg1.aByteArray76 != null) {
				local234 += arg1.aByteArray76[local230] << 17;
			}
			if (local328) {
				local234 += 65536;
			}
			local234 += (local238 & 0xFF) << 8;
			local366 = local236 + ((local284 & 0xFFFF) << 16);
			local234 += local240 & 0xFF;
			@Pc(378) int local378 = local366 + (local224 & 0xFFFF);
			local213[local224] = ((long) local234 << 32) + ((long) local378);
		}
		Static26.method714(local213, local114);
		this.aShortArray23 = arg1.aShortArray94;
		this.anIntArray155 = arg1.anIntArray501;
		this.anInt1762 = arg1.anInt7158;
		this.anIntArray159 = arg1.anIntArray500;
		this.anIntArray156 = arg1.anIntArray510;
		this.anInt1793 = arg1.anInt7167;
		this.aClass178Array1 = arg1.aClass178Array3;
		@Pc(430) Class17[] local430 = new Class17[this.anInt1762];
		this.aClass209Array1 = arg1.aClass209Array3;
		@Pc(454) int local454;
		@Pc(468) int local468;
		if (arg1.aClass266Array1 != null) {
			this.anInt1798 = arg1.aClass266Array1.length;
			this.aClass232Array1 = new Class232[this.anInt1798];
			this.aClass108Array1 = new Class108[this.anInt1798];
			for (local454 = 0; local454 < this.anInt1798; local454++) {
				@Pc(461) Class266 local461 = arg1.aClass266Array1[local454];
				@Pc(466) Class79 local466 = Static128.method2226(local461.anInt7556);
				local468 = -1;
				for (@Pc(470) int local470 = 0; local470 < this.anInt1769; local470++) {
					if (local114[local470] == local461.anInt7551) {
						local468 = local470;
						break;
					}
				}
				if (local468 == -1) {
					throw new RuntimeException();
				}
				local245 = Static168.anIntArray264[arg1.aShortArray95[local461.anInt7551] & 0xFFFF] & 0xFFFFFF;
				local245 |= 255 - (arg1.aByteArray80 == null ? 0 : arg1.aByteArray80[local461.anInt7551]) << 24;
				this.aClass108Array1[local454] = new Class108(local468, arg1.aShortArray91[local461.anInt7551], arg1.aShortArray97[local461.anInt7551], arg1.aShortArray98[local461.anInt7551], local466.anInt2608, local466.anInt2610, local466.anInt2609, local466.anInt2612, local466.anInt2611, local466.aBoolean202, local466.aBoolean201, local461.anInt7554);
				this.aClass232Array1[local454] = new Class232(local245);
			}
		}
		local454 = this.anInt1769 * 3;
		this.aFloatArray13 = new float[local454];
		this.aShortArray27 = new short[local454];
		this.aShortArray25 = new short[this.anInt1769];
		this.aShort50 = (short) arg4;
		if (arg1.aShortArray93 != null) {
			this.aShortArray24 = new short[this.anInt1769];
		}
		this.aShort49 = (short) arg3;
		this.aShortArray26 = new short[this.anInt1769];
		this.aShortArray20 = new short[local454];
		Static277.aLongArray4 = new long[local454];
		this.aFloatArray12 = new float[local454];
		this.aShortArray22 = new short[local454];
		this.lb = new short[local454];
		this.aShortArray29 = new short[this.anInt1769];
		this.aByteArray22 = new byte[local454];
		this.aShortArray28 = new short[this.anInt1769];
		this.aByteArray23 = new byte[this.anInt1769];
		this.aShortArray21 = new short[this.anInt1769];
		local234 = 0;
		for (local366 = 0; local366 < arg1.anInt7158; local366++) {
			local468 = this.anIntArray157[local366];
			this.anIntArray157[local366] = local234;
			local234 += local468;
			local430[local366] = new Class17();
		}
		this.anIntArray157[arg1.anInt7158] = local234;
		@Pc(701) int[] local701 = null;
		@Pc(703) int[] local703 = null;
		@Pc(705) int[] local705 = null;
		@Pc(707) float[][] local707 = null;
		@Pc(733) int local733;
		@Pc(774) int local774;
		@Pc(780) int local780;
		@Pc(793) int local793;
		@Pc(795) int local795;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(1004) float local1004;
		@Pc(1012) float local1012;
		@Pc(996) float local996;
		if (arg1.aByteArray78 != null) {
			@Pc(713) int local713 = arg1.anInt7164;
			@Pc(716) int[] local716 = new int[local713];
			@Pc(719) int[] local719 = new int[local713];
			@Pc(722) int[] local722 = new int[local713];
			@Pc(725) int[] local725 = new int[local713];
			@Pc(728) int[] local728 = new int[local713];
			@Pc(731) int[] local731 = new int[local713];
			for (local733 = 0; local733 < local713; local733++) {
				local716[local733] = Integer.MAX_VALUE;
				local719[local733] = -2147483647;
				local722[local733] = Integer.MAX_VALUE;
				local725[local733] = -2147483647;
				local728[local733] = Integer.MAX_VALUE;
				local731[local733] = -2147483647;
			}
			local701 = new int[local713];
			local703 = new int[local713];
			local705 = new int[local713];
			for (local774 = 0; local774 < this.anInt1769; local774++) {
				local780 = local114[local774];
				if (arg1.aByteArray78[local780] != -1) {
					local793 = arg1.aByteArray78[local780] & 0xFF;
					for (local795 = 0; local795 < 3; local795++) {
						@Pc(810) short local810;
						if (local795 == 0) {
							local810 = arg1.aShortArray91[local780];
						} else if (local795 == 1) {
							local810 = arg1.aShortArray97[local780];
						} else {
							local810 = arg1.aShortArray98[local780];
						}
						local829 = arg1.anIntArray510[local810];
						local834 = arg1.anIntArray501[local810];
						@Pc(839) int local839 = arg1.anIntArray500[local810];
						if (local829 < local716[local793]) {
							local716[local793] = local829;
						}
						if (local829 > local719[local793]) {
							local719[local793] = local829;
						}
						if (local722[local793] > local834) {
							local722[local793] = local834;
						}
						if (local834 > local725[local793]) {
							local725[local793] = local834;
						}
						if (local839 < local728[local793]) {
							local728[local793] = local839;
						}
						if (local731[local793] < local839) {
							local731[local793] = local839;
						}
					}
				}
			}
			local707 = new float[local713][];
			for (local780 = 0; local780 < local713; local780++) {
				@Pc(936) byte local936 = arg1.aByteArray82[local780];
				if (local936 > 0) {
					local701[local780] = (local716[local780] + local719[local780]) / 2;
					local703[local780] = (local725[local780] + local722[local780]) / 2;
					local705[local780] = (local731[local780] + local728[local780]) / 2;
					if (local936 == 1) {
						local834 = arg1.anIntArray505[local780];
						local1012 = 64.0F / (float) arg1.anIntArray502[local780];
						if (local834 == 0) {
							local1004 = 1.0F;
							local996 = 1.0F;
						} else if (local834 <= 0) {
							local1004 = (float) -local834 / 1024.0F;
							local996 = 1.0F;
						} else {
							local1004 = 1.0F;
							local996 = (float) local834 / 1024.0F;
						}
					} else if (local936 == 2) {
						local996 = 64.0F / (float) arg1.anIntArray503[local780];
						local1004 = 64.0F / (float) arg1.anIntArray505[local780];
						local1012 = 64.0F / (float) arg1.anIntArray502[local780];
					} else {
						local1004 = (float) arg1.anIntArray505[local780] / 1024.0F;
						local1012 = (float) arg1.anIntArray502[local780] / 1024.0F;
						local996 = (float) arg1.anIntArray503[local780] / 1024.0F;
					}
					local707[local780] = Static42.method932(arg1.aShortArray92[local780], local1004, arg1.aByteArray81[local780] & 0xFF, local996, arg1.aShortArray96[local780], arg1.aShortArray89[local780], local1012);
				}
			}
		}
		@Pc(1121) Class126[] local1121 = new Class126[arg1.anInt7157];
		@Pc(1140) short local1140;
		@Pc(1151) int local1151;
		@Pc(1161) int local1161;
		@Pc(1222) int local1222;
		for (@Pc(1123) int local1123 = 0; local1123 < arg1.anInt7157; local1123++) {
			@Pc(1130) short local1130 = arg1.aShortArray91[local1123];
			@Pc(1135) short local1135 = arg1.aShortArray97[local1123];
			local1140 = arg1.aShortArray98[local1123];
			local1151 = this.anIntArray156[local1135] - this.anIntArray156[local1130];
			local1161 = this.anIntArray155[local1135] - this.anIntArray155[local1130];
			local733 = this.anIntArray159[local1135] - this.anIntArray159[local1130];
			local774 = this.anIntArray156[local1140] - this.anIntArray156[local1130];
			local780 = this.anIntArray155[local1140] - this.anIntArray155[local1130];
			local793 = this.anIntArray159[local1140] - this.anIntArray159[local1130];
			local795 = local1161 * local793 - local733 * local780;
			local1222 = local774 * local733 - local793 * local1151;
			local829 = local1151 * local780 - local1161 * local774;
			while (local795 > 8192 || local1222 > 8192 || local829 > 8192 || local795 < -8192 || local1222 < -8192 || local829 < -8192) {
				local1222 >>= 0x1;
				local829 >>= 0x1;
				local795 >>= 0x1;
			}
			local834 = (int) Math.sqrt((double) (local829 * local829 + local795 * local795 + local1222 * local1222));
			if (local834 <= 0) {
				local834 = 1;
			}
			local1222 = local1222 * 256 / local834;
			local795 = local795 * 256 / local834;
			local829 = local829 * 256 / local834;
			@Pc(1316) byte local1316 = arg1.aByteArray79 == null ? 0 : arg1.aByteArray79[local1123];
			if (local1316 == 0) {
				@Pc(1322) Class17 local1322 = local430[local1130];
				local1322.anInt732++;
				local1322.anInt737 += local1222;
				local1322.anInt736 += local829;
				local1322.anInt734 += local795;
				@Pc(1350) Class17 local1350 = local430[local1135];
				local1350.anInt737 += local1222;
				local1350.anInt736 += local829;
				local1350.anInt734 += local795;
				local1350.anInt732++;
				@Pc(1378) Class17 local1378 = local430[local1140];
				local1378.anInt737 += local1222;
				local1378.anInt734 += local795;
				local1378.anInt736 += local829;
				local1378.anInt732++;
			} else if (local1316 == 1) {
				@Pc(1415) Class126 local1415 = local1121[local1123] = new Class126();
				local1415.anInt3873 = local795;
				local1415.anInt3875 = local1222;
				local1415.anInt3874 = local829;
			}
		}
		@Pc(1441) int local1441;
		for (@Pc(1435) int local1435 = 0; local1435 < this.anInt1769; local1435++) {
			local1441 = local114[local1435];
			@Pc(1448) int local1448 = arg1.aShortArray95[local1441] & 0xFFFF;
			@Pc(1456) short local1456;
			if (arg1.aShortArray90 == null) {
				local1456 = -1;
			} else {
				local1456 = arg1.aShortArray90[local1441];
			}
			if (arg1.aByteArray78 == null) {
				local1161 = -1;
			} else {
				local1161 = arg1.aByteArray78[local1441];
			}
			if (arg1.aByteArray80 == null) {
				local733 = 0;
			} else {
				local733 = arg1.aByteArray80[local1441] & 0xFF;
			}
			@Pc(1488) float local1488 = 0.0F;
			@Pc(1490) float local1490 = 0.0F;
			@Pc(1492) float local1492 = 0.0F;
			local1004 = 0.0F;
			local1012 = 0.0F;
			local996 = 0.0F;
			@Pc(1500) byte local1500 = 0;
			@Pc(1502) byte local1502 = 0;
			@Pc(1504) int local1504 = 0;
			@Pc(1538) byte local1538;
			@Pc(1555) short local1555;
			@Pc(1560) short local1560;
			@Pc(1565) short local1565;
			if (local1456 != -1) {
				if (local1161 == -1) {
					local1490 = 1.0F;
					local1004 = 1.0F;
					local996 = 0.0F;
					local1492 = 1.0F;
					local1502 = 2;
					local1488 = 0.0F;
					local1500 = 1;
					local1012 = 0.0F;
				} else {
					local1161 &= 0xFF;
					local1538 = arg1.aByteArray82[local1161];
					@Pc(1545) short local1545;
					@Pc(1550) short local1550;
					@Pc(1588) float local1588;
					@Pc(1597) float local1597;
					@Pc(1605) float local1605;
					@Pc(1688) float local1688;
					@Pc(1696) float local1696;
					@Pc(1705) float local1705;
					@Pc(1714) float local1714;
					@Pc(1723) float local1723;
					@Pc(1732) float local1732;
					if (local1538 == 0) {
						local1545 = arg1.aShortArray91[local1441];
						local1550 = arg1.aShortArray97[local1441];
						local1555 = arg1.aShortArray98[local1441];
						local1560 = arg1.aShortArray92[local1161];
						local1565 = arg1.aShortArray89[local1161];
						@Pc(1570) short local1570 = arg1.aShortArray96[local1161];
						@Pc(1576) float local1576 = (float) arg1.anIntArray510[local1560];
						@Pc(1582) float local1582 = (float) arg1.anIntArray501[local1560];
						local1588 = arg1.anIntArray500[local1560];
						local1597 = (float) arg1.anIntArray510[local1565] - local1576;
						local1605 = (float) arg1.anIntArray501[local1565] - local1582;
						@Pc(1614) float local1614 = (float) arg1.anIntArray500[local1565] - local1588;
						@Pc(1623) float local1623 = (float) arg1.anIntArray510[local1570] - local1576;
						@Pc(1631) float local1631 = (float) arg1.anIntArray501[local1570] - local1582;
						@Pc(1639) float local1639 = (float) arg1.anIntArray500[local1570] - local1588;
						@Pc(1647) float local1647 = (float) arg1.anIntArray510[local1545] - local1576;
						@Pc(1655) float local1655 = (float) arg1.anIntArray501[local1545] - local1582;
						@Pc(1663) float local1663 = (float) arg1.anIntArray500[local1545] - local1588;
						@Pc(1671) float local1671 = (float) arg1.anIntArray510[local1550] - local1576;
						@Pc(1679) float local1679 = (float) arg1.anIntArray501[local1550] - local1582;
						local1688 = (float) arg1.anIntArray500[local1550] - local1588;
						local1696 = (float) arg1.anIntArray510[local1555] - local1576;
						local1705 = (float) arg1.anIntArray501[local1555] - local1582;
						local1714 = (float) arg1.anIntArray500[local1555] - local1588;
						local1723 = local1639 * local1605 - local1631 * local1614;
						local1732 = local1614 * local1623 - local1639 * local1597;
						@Pc(1740) float local1740 = local1631 * local1597 - local1605 * local1623;
						@Pc(1748) float local1748 = local1740 * local1631 - local1732 * local1639;
						@Pc(1756) float local1756 = local1639 * local1723 - local1623 * local1740;
						@Pc(1764) float local1764 = local1623 * local1732 - local1723 * local1631;
						@Pc(1778) float local1778 = 1.0F / (local1764 * local1614 + local1597 * local1748 + local1756 * local1605);
						local1012 = (local1714 * local1764 + local1705 * local1756 + local1696 * local1748) * local1778;
						local1492 = (local1679 * local1756 + local1671 * local1748 + local1764 * local1688) * local1778;
						local1488 = local1778 * (local1663 * local1764 + local1748 * local1647 + local1756 * local1655);
						@Pc(1829) float local1829 = local1597 * local1732 - local1605 * local1723;
						@Pc(1838) float local1838 = local1605 * local1740 - local1614 * local1732;
						@Pc(1846) float local1846 = local1614 * local1723 - local1597 * local1740;
						@Pc(1860) float local1860 = 1.0F / (local1623 * local1838 + local1846 * local1631 + local1639 * local1829);
						local996 = (local1838 * local1696 + local1705 * local1846 + local1829 * local1714) * local1860;
						local1004 = (local1829 * local1688 + local1838 * local1671 + local1846 * local1679) * local1860;
						local1490 = local1860 * (local1829 * local1663 + local1846 * local1655 + local1838 * local1647);
					} else {
						local1545 = arg1.aShortArray91[local1441];
						local1550 = arg1.aShortArray97[local1441];
						local1555 = arg1.aShortArray98[local1441];
						@Pc(1923) int local1923 = local701[local1161];
						@Pc(1927) int local1927 = local703[local1161];
						@Pc(1931) int local1931 = local705[local1161];
						@Pc(1935) float[] local1935 = local707[local1161];
						@Pc(1940) byte local1940 = arg1.aByteArray77[local1161];
						local1588 = (float) arg1.anIntArray504[local1161] / 256.0F;
						if (local1538 == 1) {
							local1597 = (float) arg1.anIntArray503[local1161] / 1024.0F;
							Static242.method3774(local1597, local1940, local1935, arg1.anIntArray500[local1545], arg1.anIntArray501[local1545], local1588, local1927, local1931, local1923, arg1.anIntArray510[local1545]);
							local1488 = Static266.aFloat66;
							local1490 = Static240.aFloat61;
							Static242.method3774(local1597, local1940, local1935, arg1.anIntArray500[local1550], arg1.anIntArray501[local1550], local1588, local1927, local1931, local1923, arg1.anIntArray510[local1550]);
							local1492 = Static266.aFloat66;
							local1004 = Static240.aFloat61;
							Static242.method3774(local1597, local1940, local1935, arg1.anIntArray500[local1555], arg1.anIntArray501[local1555], local1588, local1927, local1931, local1923, arg1.anIntArray510[local1555]);
							local1012 = Static266.aFloat66;
							local996 = Static240.aFloat61;
							local1605 = local1597 / 2.0F;
							if ((local1940 & 0x1) == 0) {
								if (local1605 < local1012 - local1488) {
									local1012 -= local1597;
									local1502 = 1;
								} else if (local1605 < local1488 - local1012) {
									local1502 = 2;
									local1012 += local1597;
								}
								if (local1605 < local1492 - local1488) {
									local1492 -= local1597;
									local1500 = 1;
								} else if (local1488 - local1492 > local1605) {
									local1492 += local1597;
									local1500 = 2;
								}
							} else {
								if (local996 - local1490 > local1605) {
									local996 -= local1597;
									local1502 = 1;
								} else if (local1605 < local1490 - local996) {
									local1502 = 2;
									local996 += local1597;
								}
								if (local1605 < local1004 - local1490) {
									local1500 = 1;
									local1004 -= local1597;
								} else if (local1490 - local1004 > local1605) {
									local1500 = 2;
									local1004 += local1597;
								}
							}
						} else if (local1538 == 2) {
							local1597 = (float) arg1.anIntArray506[local1161] / 256.0F;
							local1605 = (float) arg1.anIntArray509[local1161] / 256.0F;
							@Pc(2181) int local2181 = arg1.anIntArray510[local1550] - arg1.anIntArray510[local1545];
							@Pc(2192) int local2192 = arg1.anIntArray501[local1550] - arg1.anIntArray501[local1545];
							@Pc(2203) int local2203 = arg1.anIntArray500[local1550] - arg1.anIntArray500[local1545];
							@Pc(2213) int local2213 = arg1.anIntArray510[local1555] - arg1.anIntArray510[local1545];
							@Pc(2224) int local2224 = arg1.anIntArray501[local1555] - arg1.anIntArray501[local1545];
							@Pc(2235) int local2235 = arg1.anIntArray500[local1555] - arg1.anIntArray500[local1545];
							@Pc(2244) int local2244 = local2235 * local2192 - local2224 * local2203;
							@Pc(2252) int local2252 = local2203 * local2213 - local2235 * local2181;
							@Pc(2261) int local2261 = local2181 * local2224 - local2192 * local2213;
							local1688 = 64.0F / (float) arg1.anIntArray505[local1161];
							local1696 = 64.0F / (float) arg1.anIntArray502[local1161];
							local1705 = 64.0F / (float) arg1.anIntArray503[local1161];
							local1714 = ((float) local2261 * local1935[2] + local1935[1] * (float) local2252 + (float) local2244 * local1935[0]) / local1688;
							local1723 = (local1935[5] * (float) local2261 + local1935[4] * (float) local2252 + local1935[3] * (float) local2244) / local1696;
							local1732 = ((float) local2261 * local1935[8] + (float) local2244 * local1935[6] + local1935[7] * (float) local2252) / local1705;
							local1504 = Static191.method3175(local1714, local1732, local1723);
							Static106.method1822(arg1.anIntArray501[local1545], local1597, local1931, arg1.anIntArray500[local1545], local1923, local1588, local1927, local1605, arg1.anIntArray510[local1545], local1935, local1940, local1504);
							local1488 = Static99.aFloat22;
							local1490 = Static4.aFloat11;
							Static106.method1822(arg1.anIntArray501[local1550], local1597, local1931, arg1.anIntArray500[local1550], local1923, local1588, local1927, local1605, arg1.anIntArray510[local1550], local1935, local1940, local1504);
							local1004 = Static4.aFloat11;
							local1492 = Static99.aFloat22;
							Static106.method1822(arg1.anIntArray501[local1555], local1597, local1931, arg1.anIntArray500[local1555], local1923, local1588, local1927, local1605, arg1.anIntArray510[local1555], local1935, local1940, local1504);
							local1012 = Static99.aFloat22;
							local996 = Static4.aFloat11;
						} else if (local1538 == 3) {
							Static254.method3872(arg1.anIntArray500[local1545], arg1.anIntArray510[local1545], local1940, local1935, local1923, local1927, arg1.anIntArray501[local1545], local1588, local1931);
							local1490 = Static442.aFloat99;
							local1488 = Static314.aFloat70;
							Static254.method3872(arg1.anIntArray500[local1550], arg1.anIntArray510[local1550], local1940, local1935, local1923, local1927, arg1.anIntArray501[local1550], local1588, local1931);
							local1492 = Static314.aFloat70;
							local1004 = Static442.aFloat99;
							Static254.method3872(arg1.anIntArray500[local1555], arg1.anIntArray510[local1555], local1940, local1935, local1923, local1927, arg1.anIntArray501[local1555], local1588, local1931);
							local1012 = Static314.aFloat70;
							local996 = Static442.aFloat99;
							if ((local1940 & 0x1) == 0) {
								if (local1012 - local1488 > 0.5F) {
									local1012--;
									local1502 = 1;
								} else if (local1488 - local1012 > 0.5F) {
									local1502 = 2;
									local1012++;
								}
								if (local1492 - local1488 > 0.5F) {
									local1500 = 1;
									local1492--;
								} else if (local1488 - local1492 > 0.5F) {
									local1500 = 2;
									local1492++;
								}
							} else {
								if (local1004 - local1490 > 0.5F) {
									local1004--;
									local1500 = 1;
								} else if (local1490 - local1004 > 0.5F) {
									local1500 = 2;
									local1004++;
								}
								if (local996 - local1490 > 0.5F) {
									local996--;
									local1502 = 1;
								} else if (local1490 - local996 > 0.5F) {
									local1502 = 2;
									local996++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray79 == null) {
				local1538 = 0;
			} else {
				local1538 = arg1.aByteArray79[local1441];
			}
			if (local1538 == 0) {
				@Pc(2684) long local2684 = ((long) local733 + (long) (local1448 << 8) + (long) (local1504 << 24) << 32) + (long) (local1161 << 2);
				local1555 = arg1.aShortArray91[local1441];
				local1560 = arg1.aShortArray97[local1441];
				local1565 = arg1.aShortArray98[local1441];
				@Pc(2703) Class17 local2703 = local430[local1555];
				this.aShortArray26[local1435] = this.method1449(local2703.anInt736, local2684, local1490, local2703.anInt737, local1555, local2703.anInt734, local1488, local2703.anInt732, arg1);
				@Pc(2727) Class17 local2727 = local430[local1560];
				this.aShortArray25[local1435] = this.method1449(local2727.anInt736, local2684 + (long) local1500, local1004, local2727.anInt737, local1560, local2727.anInt734, local1492, local2727.anInt732, arg1);
				@Pc(2754) Class17 local2754 = local430[local1565];
				this.aShortArray29[local1435] = this.method1449(local2754.anInt736, (long) local1502 + local2684, local996, local2754.anInt737, local1565, local2754.anInt734, local1012, local2754.anInt732, arg1);
			} else if (local1538 == 1) {
				@Pc(2786) Class126 local2786 = local1121[local1441];
				@Pc(2831) long local2831 = (long) ((local2786.anInt3875 + 256 << 12) + (local1161 << 2) + (local2786.anInt3873 > 0 ? 1024 : 2048) + (local2786.anInt3874 - -256 << 22)) + ((long) (local1504 << 24) + (long) (local1448 << 8) + (long) local733 << 32);
				this.aShortArray26[local1435] = this.method1449(local2786.anInt3874, local2831, local1490, local2786.anInt3875, arg1.aShortArray91[local1441], local2786.anInt3873, local1488, 0, arg1);
				this.aShortArray25[local1435] = this.method1449(local2786.anInt3874, (long) local1500 + local2831, local1004, local2786.anInt3875, arg1.aShortArray97[local1441], local2786.anInt3873, local1492, 0, arg1);
				this.aShortArray29[local1435] = this.method1449(local2786.anInt3874, (long) local1502 + local2831, local996, local2786.anInt3875, arg1.aShortArray98[local1441], local2786.anInt3873, local1012, 0, arg1);
			}
			if (arg1.aShortArray90 == null) {
				this.aShortArray21[local1435] = -1;
			} else {
				this.aShortArray21[local1435] = arg1.aShortArray90[local1441];
			}
			if (arg1.aByteArray80 != null) {
				this.aByteArray23[local1435] = arg1.aByteArray80[local1441];
			}
			if (arg1.aShortArray93 != null) {
				this.aShortArray24[local1435] = arg1.aShortArray93[local1441];
			}
			this.aShortArray28[local1435] = arg1.aShortArray95[local1441];
		}
		local1441 = 0;
		local1140 = -10000;
		for (local1151 = 0; local1151 < this.anInt1752; local1151++) {
			@Pc(2969) short local2969 = this.aShortArray21[local1151];
			if (local1140 != local2969) {
				local1140 = local2969;
				local1441++;
			}
		}
		this.anIntArray158 = new int[local1441 + 1];
		local1140 = -10000;
		local1441 = 0;
		for (local1161 = 0; local1161 < this.anInt1752; local1161++) {
			@Pc(3007) short local3007 = this.aShortArray21[local1161];
			if (local3007 != local1140) {
				this.anIntArray158[local1441++] = local1161;
				local1140 = local3007;
			}
		}
		this.anIntArray158[local1441] = this.anInt1752;
		Static277.aLongArray4 = null;
		this.aShortArray27 = Static364.method5137(this.aShortArray27, this.anInt1761);
		this.aShortArray22 = Static364.method5137(this.aShortArray22, this.anInt1761);
		this.aShortArray20 = Static364.method5137(this.aShortArray20, this.anInt1761);
		this.aByteArray22 = Static430.method5691(this.aByteArray22, this.anInt1761);
		this.aFloatArray13 = Static397.method5355(this.aFloatArray13, this.anInt1761);
		this.aFloatArray12 = Static397.method5355(this.aFloatArray12, this.anInt1761);
		if (arg1.anIntArray508 != null && Static168.method2914(arg2, this.anInt1804)) {
			this.anIntArrayArray21 = arg1.method5545();
		}
		if (arg1.aClass266Array1 != null && Static224.method3528(this.anInt1804, arg2)) {
			this.anIntArrayArray19 = arg1.method5550();
		}
		if (arg1.anIntArray507 != null && Static428.method5678(this.anInt1804, arg2)) {
			local733 = 0;
			@Pc(3129) int[] local3129 = new int[256];
			for (local780 = 0; local780 < this.anInt1769; local780++) {
				local793 = arg1.anIntArray507[local114[local780]];
				if (local793 >= 0) {
					if (local733 < local793) {
						local733 = local793;
					}
					@Pc(3155) int local3155 = local3129[local793]++;
				}
			}
			this.anIntArrayArray20 = new int[local733 + 1][];
			for (local793 = 0; local793 <= local733; local793++) {
				this.anIntArrayArray20[local793] = new int[local3129[local793]];
				local3129[local793] = 0;
			}
			for (local795 = 0; local795 < this.anInt1769; local795++) {
				local1222 = arg1.anIntArray507[local114[local795]];
				if (local1222 >= 0) {
					this.anIntArrayArray20[local1222][local3129[local1222]++] = local795;
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "XA", descriptor = "(III)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1762; local3++) {
			if (arg0 != 128) {
				this.anIntArray156[local3] = arg0 * this.anIntArray156[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray155[local3] = this.anIntArray155[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray159[local3] = arg2 * this.anIntArray159[local3] >> 7;
			}
		}
		if (this.aClass225_2 != null) {
			this.aClass225_2.anInterface5_7 = null;
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!du", name = "la", descriptor = "()I")
	@Override
	public int la() {
		if (!this.aBoolean140) {
			this.method1454();
		}
		return this.aShort47;
	}

	@OriginalMember(owner = "client!du", name = "K", descriptor = "(IIII)V")
	@Override
	protected void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static2.anInt58 = 0;
			Static310.anInt7038 = 0;
			Static406.anInt7056 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt1762; local17++) {
				Static2.anInt58 += this.anIntArray156[local17];
				Static310.anInt7038 += this.anIntArray155[local17];
				Static406.anInt7056 += this.anIntArray159[local17];
				local15++;
			}
			if (local15 <= 0) {
				Static2.anInt58 = arg1;
				Static406.anInt7056 = arg3;
				Static310.anInt7038 = arg2;
			} else {
				Static310.anInt7038 = Static310.anInt7038 / local15 + arg2;
				Static406.anInt7056 = Static406.anInt7056 / local15 + arg3;
				Static2.anInt58 = arg1 + Static2.anInt58 / local15;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt1762; local15++) {
				this.anIntArray156[local15] += arg1;
				this.anIntArray155[local15] += arg2;
				this.anIntArray159[local15] += arg3;
			}
		} else {
			@Pc(159) int local159;
			@Pc(178) int local178;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt1762; local15++) {
					this.anIntArray156[local15] -= Static2.anInt58;
					this.anIntArray155[local15] -= Static310.anInt7038;
					this.anIntArray159[local15] -= Static406.anInt7056;
					if (arg3 != 0) {
						local17 = Applet_Sub1.anIntArray85[arg3];
						local159 = Applet_Sub1.anIntArray87[arg3];
						local178 = local17 * this.anIntArray155[local15] + this.anIntArray156[local15] * local159 + 32767 >> 15;
						this.anIntArray155[local15] = local159 * this.anIntArray155[local15] + 32767 - local17 * this.anIntArray156[local15] >> 15;
						this.anIntArray156[local15] = local178;
					}
					if (arg1 != 0) {
						local17 = Applet_Sub1.anIntArray85[arg1];
						local159 = Applet_Sub1.anIntArray87[arg1];
						local178 = this.anIntArray155[local15] * local159 + 32767 - local17 * this.anIntArray159[local15] >> 15;
						this.anIntArray159[local15] = local159 * this.anIntArray159[local15] + this.anIntArray155[local15] * local17 + 32767 >> 15;
						this.anIntArray155[local15] = local178;
					}
					if (arg2 != 0) {
						local17 = Applet_Sub1.anIntArray85[arg2];
						local159 = Applet_Sub1.anIntArray87[arg2];
						local178 = this.anIntArray156[local15] * local159 + local17 * this.anIntArray159[local15] + 32767 >> 15;
						this.anIntArray159[local15] = local159 * this.anIntArray159[local15] + 32767 - local17 * this.anIntArray156[local15] >> 15;
						this.anIntArray156[local15] = local178;
					}
					this.anIntArray156[local15] += Static2.anInt58;
					this.anIntArray155[local15] += Static310.anInt7038;
					this.anIntArray159[local15] += Static406.anInt7056;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt1762; local15++) {
					this.anIntArray156[local15] -= Static2.anInt58;
					this.anIntArray155[local15] -= Static310.anInt7038;
					this.anIntArray159[local15] -= Static406.anInt7056;
					this.anIntArray156[local15] = this.anIntArray156[local15] * arg1 / 128;
					this.anIntArray155[local15] = this.anIntArray155[local15] * arg2 / 128;
					this.anIntArray159[local15] = arg3 * this.anIntArray159[local15] / 128;
					this.anIntArray156[local15] += Static2.anInt58;
					this.anIntArray155[local15] += Static310.anInt7038;
					this.anIntArray159[local15] += Static406.anInt7056;
				}
			} else {
				@Pc(518) Class108 local518;
				@Pc(523) Class232 local523;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt1769; local15++) {
						local17 = (this.aByteArray23[local15] & 0xFF) + (arg1 * 8);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray23[local15] = (byte) local17;
					}
					if (this.aClass225_1 != null) {
						this.aClass225_1.anInterface5_7 = null;
					}
					if (this.aClass108Array1 != null) {
						for (local17 = 0; local17 < this.anInt1798; local17++) {
							local518 = this.aClass108Array1[local17];
							local523 = this.aClass232Array1[local17];
							local523.anInt6891 = local523.anInt6891 & 0xFFFFFF | 255 - (this.aByteArray23[local518.anInt3575] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt1769; local15++) {
						local17 = this.aShortArray28[local15] & 0xFFFF;
						local159 = local17 >> 10 & 0x3F;
						local178 = local17 >> 7 & 0x7;
						local178 += arg2 / 4;
						@Pc(590) int local590 = local17 & 0x7F;
						@Pc(596) int local596 = local159 + arg1 & 0x3F;
						if (local178 < 0) {
							local178 = 0;
						} else if (local178 > 7) {
							local178 = 7;
						}
						local590 += arg3;
						if (local590 < 0) {
							local590 = 0;
						} else if (local590 > 127) {
							local590 = 127;
						}
						this.aShortArray28[local15] = (short) (local590 | local596 << 10 | local178 << 7);
					}
					if (this.aClass225_1 != null) {
						this.aClass225_1.anInterface5_7 = null;
					}
					if (this.aClass108Array1 != null) {
						for (local17 = 0; local17 < this.anInt1798; local17++) {
							local518 = this.aClass108Array1[local17];
							local523 = this.aClass232Array1[local17];
							local523.anInt6891 = Static168.anIntArray264[this.aShortArray28[local518.anInt3575] & 0xFFFF] & 0xFFFFFF | local523.anInt6891 & 0xFF000000;
						}
					}
				} else {
					@Pc(715) Class232 local715;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt1798; local15++) {
							local715 = this.aClass232Array1[local15];
							local715.anInt6900 += arg2;
							local715.anInt6895 += arg1;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt1798; local15++) {
							local715 = this.aClass232Array1[local15];
							local715.anInt6904 = local715.anInt6904 * arg2 >> 7;
							local715.anInt6890 = arg1 * local715.anInt6890 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt1798; local15++) {
							local715 = this.aClass232Array1[local15];
							local715.anInt6896 = local715.anInt6896 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!ia;Lclient!aq;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class13_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1761 == 0) {
			return;
		}
		@Pc(16) Class106_Sub2 local16 = this.aClass75_Sub2_10.aClass106_Sub2_4;
		@Pc(19) Class106_Sub2 local19 = (Class106_Sub2) arg0;
		if (!this.aBoolean140) {
			this.method1454();
		}
		this.method1453(local19);
		Static339.aFloat74 = local19.aFloat77 * local16.aFloat80 + local16.aFloat81 * local19.aFloat82 + local19.aFloat85 * local16.aFloat77;
		Static65.aFloat90 = local16.aFloat76 + local19.aFloat76 * local16.aFloat80 + local19.aFloat86 * local16.aFloat77 + local19.aFloat83 * local16.aFloat81;
		@Pc(76) float local76 = Static339.aFloat74 * (float) this.aShort48 + Static65.aFloat90;
		@Pc(84) float local84 = Static339.aFloat74 * (float) this.aShort46 + Static65.aFloat90;
		@Pc(95) float local95;
		@Pc(101) float local101;
		if (local76 > local84) {
			local101 = (float) this.aShort45 + local76;
			local95 = (float) -this.aShort45 + local84;
		} else {
			local95 = (float) -this.aShort45 + local76;
			local101 = (float) this.aShort45 + local84;
		}
		if (this.aClass75_Sub2_10.aFloat41 <= local95 || local101 <= (float) this.aClass75_Sub2_10.anInt3122) {
			return;
		}
		Static329.aFloat73 = local19.aFloat82 * local16.aFloat78 + local19.aFloat85 * local16.aFloat82 + local19.aFloat77 * local16.aFloat79;
		Static158.aFloat50 = local19.aFloat86 * local16.aFloat82 + local16.aFloat78 * local19.aFloat83 + local16.aFloat79 * local19.aFloat76 + local16.aFloat83;
		@Pc(178) float local178 = Static158.aFloat50 + Static329.aFloat73 * (float) this.aShort48;
		@Pc(186) float local186 = Static158.aFloat50 + (float) this.aShort46 * Static329.aFloat73;
		@Pc(212) float local212;
		@Pc(201) float local201;
		if (local186 < local178) {
			local201 = (float) this.aClass75_Sub2_10.anInt3092 * (local178 + (float) this.aShort45);
			local212 = (local186 - (float) this.aShort45) * (float) this.aClass75_Sub2_10.anInt3092;
		} else {
			local201 = (float) this.aClass75_Sub2_10.anInt3092 * (local186 + (float) this.aShort45);
			local212 = ((float) -this.aShort45 + local178) * (float) this.aClass75_Sub2_10.anInt3092;
		}
		if (this.aClass75_Sub2_10.aFloat30 <= local212 / local101 || this.aClass75_Sub2_10.aFloat31 >= local201 / local101) {
			return;
		}
		Static211.aFloat56 = local16.aFloat86 + local16.aFloat87 * local19.aFloat83 + local19.aFloat86 * local16.aFloat85 + local19.aFloat76 * local16.aFloat84;
		Static202.aFloat53 = local19.aFloat82 * local16.aFloat87 + local16.aFloat85 * local19.aFloat85 + local16.aFloat84 * local19.aFloat77;
		@Pc(302) float local302 = Static211.aFloat56 + (float) this.aShort48 * Static202.aFloat53;
		@Pc(310) float local310 = (float) this.aShort46 * Static202.aFloat53 + Static211.aFloat56;
		@Pc(326) float local326;
		@Pc(337) float local337;
		if (local302 > local310) {
			local326 = ((float) -this.aShort45 + local310) * (float) this.aClass75_Sub2_10.anInt3100;
			local337 = (local302 + (float) this.aShort45) * (float) this.aClass75_Sub2_10.anInt3100;
		} else {
			local326 = (float) this.aClass75_Sub2_10.anInt3100 * ((float) -this.aShort45 + local302);
			local337 = (float) this.aClass75_Sub2_10.anInt3100 * ((float) this.aShort45 + local310);
		}
		if (local326 / local101 >= this.aClass75_Sub2_10.aFloat35 || this.aClass75_Sub2_10.aFloat44 >= local337 / local101) {
			return;
		}
		if (arg1 != null || this.aClass108Array1 != null) {
			Static291.aFloat68 = local19.aFloat80 * local16.aFloat80 + local19.aFloat84 * local16.aFloat77 + local16.aFloat81 * local19.aFloat79;
			Static317.aFloat71 = local19.aFloat87 * local16.aFloat82 + local16.aFloat78 * local19.aFloat78 + local19.aFloat81 * local16.aFloat79;
			Static274.aFloat67 = local16.aFloat85 * local19.aFloat87 + local16.aFloat87 * local19.aFloat78 + local19.aFloat81 * local16.aFloat84;
			Static148.aFloat49 = local19.aFloat84 * local16.aFloat82 + local19.aFloat79 * local16.aFloat78 + local16.aFloat79 * local19.aFloat80;
			Static77.aFloat21 = local19.aFloat84 * local16.aFloat85 + local16.aFloat87 * local19.aFloat79 + local19.aFloat80 * local16.aFloat84;
			Static11.aFloat2 = local19.aFloat81 * local16.aFloat80 + local19.aFloat78 * local16.aFloat81 + local16.aFloat77 * local19.aFloat87;
		}
		if (arg1 != null) {
			@Pc(497) boolean local497 = false;
			@Pc(499) boolean local499 = true;
			@Pc(507) int local507 = this.aShort44 + this.aShort47 >> 1;
			@Pc(516) int local516 = this.aShort43 + this.aShort51 >> 1;
			@Pc(535) int local535 = (int) ((float) local516 * Static148.aFloat49 + (float) this.aShort48 * Static329.aFloat73 + Static158.aFloat50 + (float) local507 * Static317.aFloat71);
			@Pc(554) int local554 = (int) (Static211.aFloat56 + Static274.aFloat67 * (float) local507 + Static202.aFloat53 * (float) this.aShort48 + Static77.aFloat21 * (float) local516);
			@Pc(573) int local573 = (int) (Static291.aFloat68 * (float) local516 + Static11.aFloat2 * (float) local507 + Static65.aFloat90 + Static339.aFloat74 * (float) this.aShort48);
			if (this.aClass75_Sub2_10.anInt3122 > local573) {
				local497 = true;
			} else {
				arg1.anInt556 = this.aClass75_Sub2_10.anInt3102 + this.aClass75_Sub2_10.anInt3100 * local554 / local573;
				arg1.anInt557 = local535 * this.aClass75_Sub2_10.anInt3092 / local573 + this.aClass75_Sub2_10.anInt3097;
			}
			@Pc(632) int local632 = (int) ((float) local516 * Static148.aFloat49 + (float) this.aShort46 * Static329.aFloat73 + (float) local507 * Static317.aFloat71 + Static158.aFloat50);
			@Pc(651) int local651 = (int) ((float) local516 * Static77.aFloat21 + Static202.aFloat53 * (float) this.aShort46 + Static211.aFloat56 + (float) local507 * Static274.aFloat67);
			@Pc(670) int local670 = (int) (Static291.aFloat68 * (float) local516 + (float) local507 * Static11.aFloat2 + Static65.aFloat90 + (float) this.aShort46 * Static339.aFloat74);
			if (local670 >= this.aClass75_Sub2_10.anInt3122) {
				arg1.anInt555 = this.aClass75_Sub2_10.anInt3097 + local632 * this.aClass75_Sub2_10.anInt3092 / local670;
				arg1.anInt559 = this.aClass75_Sub2_10.anInt3100 * local651 / local670 + this.aClass75_Sub2_10.anInt3102;
			} else {
				local497 = true;
			}
			if (local497) {
				if (local573 < this.aClass75_Sub2_10.anInt3122 && local670 < this.aClass75_Sub2_10.anInt3122) {
					local499 = false;
				} else {
					@Pc(744) int local744;
					@Pc(754) int local754;
					@Pc(781) int local781;
					if (this.aClass75_Sub2_10.anInt3122 > local573) {
						local744 = (local670 - this.aClass75_Sub2_10.anInt3122 << 16) / (local670 - local573);
						local754 = (local744 * (local632 - local535) >> 16) + local632;
						arg1.anInt557 = this.aClass75_Sub2_10.anInt3097 + this.aClass75_Sub2_10.anInt3092 * local754 / this.aClass75_Sub2_10.anInt3122;
						local781 = local651 + (local744 * (local651 - local554) >> 16);
						arg1.anInt556 = this.aClass75_Sub2_10.anInt3102 + this.aClass75_Sub2_10.anInt3100 * local781 / this.aClass75_Sub2_10.anInt3122;
					} else if (this.aClass75_Sub2_10.anInt3122 > local670) {
						local744 = (local573 - this.aClass75_Sub2_10.anInt3122 << 16) / (local573 - local670);
						local754 = (local744 * (local535 - local632) >> 16) + local535;
						local781 = local554 + ((local554 - local651) * local744 >> 16);
						arg1.anInt557 = local754 * this.aClass75_Sub2_10.anInt3092 / this.aClass75_Sub2_10.anInt3122 + this.aClass75_Sub2_10.anInt3097;
						arg1.anInt556 = local781 * this.aClass75_Sub2_10.anInt3100 / this.aClass75_Sub2_10.anInt3122 + this.aClass75_Sub2_10.anInt3102;
					}
				}
			}
			if (local499) {
				if (local670 < local573) {
					arg1.anInt558 = (this.aShort45 + local535) * this.aClass75_Sub2_10.anInt3092 / local573 + this.aClass75_Sub2_10.anInt3097 - arg1.anInt557;
				} else {
					arg1.anInt558 = this.aClass75_Sub2_10.anInt3097 + this.aClass75_Sub2_10.anInt3092 * (this.aShort45 + local632) / local670 - arg1.anInt555;
				}
				arg1.aBoolean23 = true;
			}
		}
		this.aClass75_Sub2_10.method2478();
		this.aClass75_Sub2_10.method2481(local19);
		this.method1457();
		this.aClass75_Sub2_10.method2480();
		this.method1458();
	}

	@OriginalMember(owner = "client!du", name = "N", descriptor = "(SS)V")
	@Override
	public void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1769; local3++) {
			if (this.aShortArray28[local3] == arg0) {
				this.aShortArray28[local3] = arg1;
			}
		}
		if (this.aClass108Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt1798; local38++) {
				@Pc(45) Class108 local45 = this.aClass108Array1[local38];
				@Pc(50) Class232 local50 = this.aClass232Array1[local38];
				local50.anInt6891 = local50.anInt6891 & 0xFF000000 | Static168.anIntArray264[this.aShortArray28[local45.anInt3575] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass225_1 != null) {
			this.aClass225_1.anInterface5_7 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "WA", descriptor = "(I)V")
	@Override
	public void WA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Applet_Sub1.anIntArray85[arg0];
		@Pc(13) int local13 = Applet_Sub1.anIntArray87[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1762; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray155[local15] - this.anIntArray159[local15] * local9 >> 15;
			this.anIntArray159[local15] = local13 * this.anIntArray159[local15] + this.anIntArray155[local15] * local9 >> 15;
			this.anIntArray155[local15] = local34;
		}
		this.aBoolean140 = false;
		if (this.aClass225_2 != null) {
			this.aClass225_2.anInterface5_7 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "ra", descriptor = "()I")
	@Override
	public int ra() {
		if (!this.aBoolean140) {
			this.method1454();
		}
		return this.aShort45;
	}

	@OriginalMember(owner = "client!du", name = "FA", descriptor = "()Z")
	@Override
	protected boolean FA() {
		if (this.anIntArrayArray21 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt1793; local12++) {
			this.anIntArray156[local12] <<= 0x4;
			this.anIntArray155[local12] <<= 0x4;
			this.anIntArray159[local12] <<= 0x4;
		}
		Static2.anInt58 = 0;
		Static406.anInt7056 = 0;
		Static310.anInt7038 = 0;
		return true;
	}

	@OriginalMember(owner = "client!du", name = "sa", descriptor = "()V")
	@Override
	public void sa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1762; local3++) {
			this.anIntArray159[local3] = -this.anIntArray159[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1761; local25++) {
			this.aShortArray20[local25] = (short) -this.aShortArray20[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt1769; local48++) {
			@Pc(55) short local55 = this.aShortArray26[local48];
			this.aShortArray26[local48] = this.aShortArray29[local48];
			this.aShortArray29[local48] = local55;
		}
		if (this.aClass225_4 == null && this.aClass225_1 != null) {
			this.aClass225_1.anInterface5_7 = null;
		}
		if (this.aClass225_4 != null) {
			this.aClass225_4.anInterface5_7 = null;
		}
		this.aBoolean140 = false;
		if (this.aClass225_2 != null) {
			this.aClass225_2.anInterface5_7 = null;
		}
		if (this.aClass269_1 != null) {
			this.aClass269_1.anInterface1_5 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "n", descriptor = "()I")
	@Override
	public int n() {
		return this.anInt1802;
	}

	@OriginalMember(owner = "client!du", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		this.aShort49 = (short) arg0;
		if (this.aClass225_1 != null) {
			this.aClass225_1.anInterface5_7 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!ia;Lclient!aq;II)V")
	@Override
	public void method5706(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class13_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1761 == 0) {
			return;
		}
		@Pc(16) Class106_Sub2 local16 = this.aClass75_Sub2_10.aClass106_Sub2_4;
		@Pc(19) Class106_Sub2 local19 = (Class106_Sub2) arg0;
		if (!this.aBoolean140) {
			this.method1454();
		}
		Static65.aFloat90 = local16.aFloat80 * local19.aFloat76 + local19.aFloat86 * local16.aFloat77 + local19.aFloat83 * local16.aFloat81 + local16.aFloat76;
		Static339.aFloat74 = local19.aFloat82 * local16.aFloat81 + local16.aFloat77 * local19.aFloat85 + local16.aFloat80 * local19.aFloat77;
		@Pc(72) float local72 = Static65.aFloat90 + (float) this.aShort48 * Static339.aFloat74;
		@Pc(80) float local80 = Static339.aFloat74 * (float) this.aShort46 + Static65.aFloat90;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.aShort45 + local72;
			local97 = (float) -this.aShort45 + local80;
		} else {
			local90 = (float) this.aShort45 + local80;
			local97 = (float) -this.aShort45 + local72;
		}
		if (local97 >= this.aClass75_Sub2_10.aFloat33 || local90 <= (float) this.aClass75_Sub2_10.anInt3122) {
			return;
		}
		Static329.aFloat73 = local16.aFloat82 * local19.aFloat85 + local16.aFloat78 * local19.aFloat82 + local19.aFloat77 * local16.aFloat79;
		Static158.aFloat50 = local16.aFloat83 + local19.aFloat86 * local16.aFloat82 + local16.aFloat78 * local19.aFloat83 + local16.aFloat79 * local19.aFloat76;
		@Pc(174) float local174 = Static158.aFloat50 + (float) this.aShort48 * Static329.aFloat73;
		@Pc(182) float local182 = Static329.aFloat73 * (float) this.aShort46 + Static158.aFloat50;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local182 < local174) {
			local197 = (local182 - (float) this.aShort45) * (float) this.aClass75_Sub2_10.anInt3092;
			local208 = (float) this.aClass75_Sub2_10.anInt3092 * (local174 + (float) this.aShort45);
		} else {
			local197 = (local174 - (float) this.aShort45) * (float) this.aClass75_Sub2_10.anInt3092;
			local208 = (float) this.aClass75_Sub2_10.anInt3092 * ((float) this.aShort45 + local182);
		}
		if (local197 / (float) arg2 >= this.aClass75_Sub2_10.aFloat30 || local208 / (float) arg2 <= this.aClass75_Sub2_10.aFloat31) {
			return;
		}
		Static202.aFloat53 = local19.aFloat82 * local16.aFloat87 + local16.aFloat85 * local19.aFloat85 + local19.aFloat77 * local16.aFloat84;
		Static211.aFloat56 = local16.aFloat86 + local16.aFloat84 * local19.aFloat76 + local19.aFloat86 * local16.aFloat85 + local16.aFloat87 * local19.aFloat83;
		@Pc(299) float local299 = Static211.aFloat56 + (float) this.aShort48 * Static202.aFloat53;
		@Pc(307) float local307 = Static211.aFloat56 + Static202.aFloat53 * (float) this.aShort46;
		@Pc(333) float local333;
		@Pc(322) float local322;
		if (local307 < local299) {
			local322 = (float) this.aClass75_Sub2_10.anInt3100 * ((float) this.aShort45 + local299);
			local333 = (float) this.aClass75_Sub2_10.anInt3100 * ((float) -this.aShort45 + local307);
		} else {
			local322 = (float) this.aClass75_Sub2_10.anInt3100 * (local307 + (float) this.aShort45);
			local333 = (float) this.aClass75_Sub2_10.anInt3100 * (local299 - (float) this.aShort45);
		}
		if (local333 / (float) arg2 >= this.aClass75_Sub2_10.aFloat35 || local322 / (float) arg2 <= this.aClass75_Sub2_10.aFloat44) {
			return;
		}
		if (arg1 != null || this.aClass108Array1 != null) {
			Static11.aFloat2 = local19.aFloat87 * local16.aFloat77 + local19.aFloat78 * local16.aFloat81 + local19.aFloat81 * local16.aFloat80;
			Static77.aFloat21 = local16.aFloat84 * local19.aFloat80 + local19.aFloat79 * local16.aFloat87 + local16.aFloat85 * local19.aFloat84;
			Static291.aFloat68 = local19.aFloat84 * local16.aFloat77 + local19.aFloat79 * local16.aFloat81 + local16.aFloat80 * local19.aFloat80;
			Static317.aFloat71 = local16.aFloat79 * local19.aFloat81 + local16.aFloat78 * local19.aFloat78 + local19.aFloat87 * local16.aFloat82;
			Static148.aFloat49 = local19.aFloat80 * local16.aFloat79 + local19.aFloat84 * local16.aFloat82 + local16.aFloat78 * local19.aFloat79;
			Static274.aFloat67 = local19.aFloat81 * local16.aFloat84 + local16.aFloat85 * local19.aFloat87 + local19.aFloat78 * local16.aFloat87;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.aShort47 + this.aShort44 >> 1;
			@Pc(510) int local510 = this.aShort51 + this.aShort43 >> 1;
			@Pc(529) int local529 = (int) (Static329.aFloat73 * (float) this.aShort48 + Static317.aFloat71 * (float) local502 + Static158.aFloat50 + (float) local510 * Static148.aFloat49);
			@Pc(548) int local548 = (int) ((float) this.aShort48 * Static202.aFloat53 + Static274.aFloat67 * (float) local502 + Static211.aFloat56 + (float) local510 * Static77.aFloat21);
			@Pc(567) int local567 = (int) (Static291.aFloat68 * (float) local510 + Static65.aFloat90 + (float) local502 * Static11.aFloat2 + Static339.aFloat74 * (float) this.aShort48);
			@Pc(586) int local586 = (int) ((float) this.aShort46 * Static329.aFloat73 + Static158.aFloat50 + (float) local502 * Static317.aFloat71 + (float) local510 * Static148.aFloat49);
			@Pc(605) int local605 = (int) ((float) local510 * Static77.aFloat21 + Static202.aFloat53 * (float) this.aShort46 + (float) local502 * Static274.aFloat67 + Static211.aFloat56);
			arg1.anInt555 = local586 * this.aClass75_Sub2_10.anInt3092 / arg2 + this.aClass75_Sub2_10.anInt3097;
			arg1.anInt559 = this.aClass75_Sub2_10.anInt3100 * local605 / arg2 + this.aClass75_Sub2_10.anInt3102;
			@Pc(650) int local650 = (int) (Static339.aFloat74 * (float) this.aShort46 + Static65.aFloat90 + (float) local502 * Static11.aFloat2 + Static291.aFloat68 * (float) local510);
			arg1.anInt557 = this.aClass75_Sub2_10.anInt3097 + local529 * this.aClass75_Sub2_10.anInt3092 / arg2;
			arg1.anInt556 = local548 * this.aClass75_Sub2_10.anInt3100 / arg2 + this.aClass75_Sub2_10.anInt3102;
			if (local567 < this.aClass75_Sub2_10.anInt3122 && this.aClass75_Sub2_10.anInt3122 > local650) {
				arg1.aBoolean23 = true;
				arg1.anInt558 = this.aClass75_Sub2_10.anInt3092 * (local529 + this.aShort45) / arg2 + this.aClass75_Sub2_10.anInt3097 - arg1.anInt557;
			}
		}
		this.aClass75_Sub2_10.method2433((float) arg2);
		this.aClass75_Sub2_10.method2411();
		this.aClass75_Sub2_10.method2481(local19);
		this.method1457();
		this.aClass75_Sub2_10.method2480();
		this.method1458();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BSIII)I")
	private int method1445(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = Static168.anIntArray264[Static195.method3197(arg3, arg2)];
		if (arg1 != -1) {
			@Pc(26) Class62 local26 = this.aClass75_Sub2_10.anInterface7_6.method2131(arg1 & 0xFFFF);
			@Pc(31) int local31 = local26.aByte24 & 0xFF;
			@Pc(48) int local48;
			@Pc(70) int local70;
			if (local31 != 0) {
				if (arg3 < 0) {
					local48 = 0;
				} else if (arg3 > 127) {
					local48 = 16777215;
				} else {
					local48 = arg3 * 131586;
				}
				if (local31 == 256) {
					local14 = local48;
				} else {
					local70 = 256 - local31;
					local14 = (local70 * (local14 & 0xFF00FF) + local31 * (local48 & 0xFF00FF) & 0xFF00FF00) + (local70 * (local14 & 0xFF00) + local31 * (local48 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local48 = local26.aByte27 & 0xFF;
			if (local48 != 0) {
				local48 += 256;
				@Pc(123) int local123 = local48 * (local14 >> 16 & 0xFF);
				if (local123 > 65535) {
					local123 = 65535;
				}
				local70 = local48 * (local14 >> 8 & 0xFF);
				if (local70 > 65535) {
					local70 = 65535;
				}
				@Pc(149) int local149 = local48 * (local14 & 0xFF);
				if (local149 > 65535) {
					local149 = 65535;
				}
				local14 = (local149 >> 8) + (local70 & 0xFF00) + (local123 << 8 & 0xFF00A5);
			}
		}
		return (local14 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IILclient!ia;Z)Z")
	@Override
	public boolean method5702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class106_Sub2 local8 = (Class106_Sub2) arg2;
		@Pc(12) Class106_Sub2 local12 = this.aClass75_Sub2_10.aClass106_Sub2_4;
		@Pc(33) float local33 = local12.aFloat83 + local12.aFloat82 * local8.aFloat86 + local8.aFloat83 * local12.aFloat78 + local8.aFloat76 * local12.aFloat79;
		@Pc(54) float local54 = local12.aFloat86 + local8.aFloat83 * local12.aFloat87 + local8.aFloat86 * local12.aFloat85 + local12.aFloat84 * local8.aFloat76;
		@Pc(75) float local75 = local12.aFloat80 * local8.aFloat76 + local12.aFloat81 * local8.aFloat83 + local12.aFloat77 * local8.aFloat86 + local12.aFloat76;
		Static291.aFloat68 = local8.aFloat79 * local12.aFloat81 + local12.aFloat77 * local8.aFloat84 + local8.aFloat80 * local12.aFloat80;
		Static11.aFloat2 = local8.aFloat87 * local12.aFloat77 + local12.aFloat81 * local8.aFloat78 + local8.aFloat81 * local12.aFloat80;
		Static339.aFloat74 = local8.aFloat85 * local12.aFloat77 + local8.aFloat82 * local12.aFloat81 + local8.aFloat77 * local12.aFloat80;
		Static317.aFloat71 = local12.aFloat78 * local8.aFloat78 + local12.aFloat82 * local8.aFloat87 + local8.aFloat81 * local12.aFloat79;
		Static148.aFloat49 = local12.aFloat79 * local8.aFloat80 + local8.aFloat84 * local12.aFloat82 + local12.aFloat78 * local8.aFloat79;
		Static77.aFloat21 = local12.aFloat84 * local8.aFloat80 + local12.aFloat85 * local8.aFloat84 + local8.aFloat79 * local12.aFloat87;
		Static329.aFloat73 = local8.aFloat85 * local12.aFloat82 + local12.aFloat78 * local8.aFloat82 + local12.aFloat79 * local8.aFloat77;
		Static202.aFloat53 = local12.aFloat84 * local8.aFloat77 + local8.aFloat85 * local12.aFloat85 + local12.aFloat87 * local8.aFloat82;
		Static274.aFloat67 = local12.aFloat85 * local8.aFloat87 + local8.aFloat78 * local12.aFloat87 + local8.aFloat81 * local12.aFloat84;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass75_Sub2_10.anInt3092;
		@Pc(255) int local255 = this.aClass75_Sub2_10.anInt3100;
		if (!this.aBoolean140) {
			this.method1454();
		}
		Static125.anIntArray63[0] = this.aShort47;
		Static375.anIntArray472[0] = this.aShort48;
		Static384.anIntArray481[0] = this.aShort43;
		Static125.anIntArray63[1] = this.aShort44;
		Static375.anIntArray472[1] = this.aShort48;
		Static384.anIntArray481[1] = this.aShort43;
		Static125.anIntArray63[2] = this.aShort47;
		Static375.anIntArray472[2] = this.aShort46;
		Static384.anIntArray481[2] = this.aShort43;
		Static125.anIntArray63[3] = this.aShort44;
		Static375.anIntArray472[3] = this.aShort46;
		Static384.anIntArray481[3] = this.aShort43;
		Static125.anIntArray63[4] = this.aShort47;
		Static375.anIntArray472[4] = this.aShort48;
		Static125.anIntArray63[5] = this.aShort44;
		Static384.anIntArray481[4] = this.aShort51;
		Static375.anIntArray472[5] = this.aShort48;
		Static384.anIntArray481[5] = this.aShort51;
		Static125.anIntArray63[6] = this.aShort47;
		Static375.anIntArray472[6] = this.aShort46;
		Static384.anIntArray481[6] = this.aShort51;
		Static125.anIntArray63[7] = this.aShort44;
		Static375.anIntArray472[7] = this.aShort46;
		Static384.anIntArray481[7] = this.aShort51;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(395) float local395;
		@Pc(390) float local390;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static375.anIntArray472[local383];
			local395 = Static125.anIntArray63[local383];
			local400 = Static384.anIntArray481[local383];
			local414 = local54 + Static202.aFloat53 * local390 + local395 * Static274.aFloat67 + Static77.aFloat21 * local400;
			local428 = local75 + local400 * Static291.aFloat68 + local390 * Static339.aFloat74 + Static11.aFloat2 * local395;
			local442 = local400 * Static148.aFloat49 + local395 * Static317.aFloat71 + Static329.aFloat73 * local390 + local33;
			if ((float) this.aClass75_Sub2_10.anInt3122 <= local428) {
				@Pc(461) float local461 = (float) this.aClass75_Sub2_10.anInt3097 + (float) local251 * local442 / local428;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local241 > local461) {
					local241 = local461;
				}
				@Pc(485) float local485 = (float) local255 * local414 / local428 + (float) this.aClass75_Sub2_10.anInt3102;
				if (local245 > local485) {
					local245 = local485;
				}
				if (local247 < local485) {
					local247 = local485;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (Static428.anIntArray515.length < this.anInt1761) {
				Static428.anIntArray515 = new int[this.anInt1761];
				Static267.anIntArray387 = new int[this.anInt1761];
			}
			@Pc(618) int local618;
			for (@Pc(544) int local544 = 0; local544 < this.anInt1762; local544++) {
				local395 = this.anIntArray156[local544];
				local400 = this.anIntArray159[local544];
				local390 = this.anIntArray155[local544];
				local442 = Static148.aFloat49 * local400 + local395 * Static317.aFloat71 + local390 * Static329.aFloat73 + local33;
				local428 = local400 * Static291.aFloat68 + Static339.aFloat74 * local390 + Static11.aFloat2 * local395 + local75;
				local414 = local54 + Static274.aFloat67 * local395 + local390 * Static202.aFloat53 + local400 * Static77.aFloat21;
				@Pc(625) int local625;
				@Pc(627) int local627;
				@Pc(636) int local636;
				if ((float) this.aClass75_Sub2_10.anInt3122 <= local428) {
					local618 = (int) ((float) this.aClass75_Sub2_10.anInt3097 + (float) local251 * local442 / local428);
					local625 = (int) ((float) this.aClass75_Sub2_10.anInt3102 + (float) local255 * local414 / local428);
					local627 = this.anIntArray157[local544];
					local636 = this.anIntArray157[local544 + 1];
					for (@Pc(698) int local698 = local627; local698 < local636; local698++) {
						@Pc(707) int local707 = this.lb[local698] - 1;
						if (local707 == -1) {
							break;
						}
						Static428.anIntArray515[local707] = local618;
						Static267.anIntArray387[local707] = local625;
					}
				} else {
					local618 = this.anIntArray157[local544];
					local625 = this.anIntArray157[local544 + 1];
					for (local627 = local618; local627 < local625; local627++) {
						local636 = this.lb[local627] - 1;
						if (local636 == -1) {
							break;
						}
						Static428.anIntArray515[this.lb[local627] - 1] = -999999;
					}
				}
			}
			for (local618 = 0; local618 < this.anInt1769; local618++) {
				if (Static428.anIntArray515[this.aShortArray26[local618]] != -999999 && Static428.anIntArray515[this.aShortArray25[local618]] != -999999 && Static428.anIntArray515[this.aShortArray29[local618]] != -999999 && this.method1450(Static428.anIntArray515[this.aShortArray26[local618]], arg0, Static267.anIntArray387[this.aShortArray29[local618]], Static267.anIntArray387[this.aShortArray26[local618]], arg1, Static267.anIntArray387[this.aShortArray25[local618]], Static428.anIntArray515[this.aShortArray25[local618]], Static428.anIntArray515[this.aShortArray29[local618]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!du", name = "C", descriptor = "()I")
	@Override
	public int C() {
		if (!this.aBoolean140) {
			this.method1454();
		}
		return this.aShort51;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZ)V")
	private void method1446(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass225_1 != null && this.aClass225_1.anInterface5_7 == null;
		@Pc(27) boolean local27 = this.aClass225_4 != null && this.aClass225_4.anInterface5_7 == null;
		@Pc(38) boolean local38 = this.aClass225_2 != null && this.aClass225_2.anInterface5_7 == null;
		@Pc(49) boolean local49 = this.aClass225_3 != null && this.aClass225_3.anInterface5_7 == null;
		if (arg0) {
			local16 &= (this.aByte21 & 0x2) != 0;
			local38 &= (this.aByte21 & 0x1) != 0;
			local49 &= (this.aByte21 & 0x8) != 0;
			local27 &= (this.aByte21 & 0x4) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		@Pc(114) byte local114 = 0;
		if (local38) {
			local106 = 12;
		}
		if (local16) {
			local110 = local106;
			local106 = (byte) (local106 + 4);
		}
		if (local27) {
			local112 = local106;
			local106 = (byte) (local106 + 12);
		}
		if (local49) {
			local114 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (Static258.aClass3_Sub2_Sub1_6.aByteArray95.length >= local106 * this.anInt1761) {
			Static258.aClass3_Sub2_Sub1_6.anInt7620 = 0;
		} else {
			Static258.aClass3_Sub2_Sub1_6 = new Class3_Sub2_Sub1((this.anInt1761 + 100) * local106);
		}
		@Pc(188) int local188;
		@Pc(197) int local197;
		@Pc(225) int local225;
		@Pc(234) int local234;
		if (local38) {
			@Pc(204) int local204;
			@Pc(211) int local211;
			@Pc(216) int local216;
			@Pc(223) int local223;
			if (this.aClass75_Sub2_10.aBoolean228) {
				for (local188 = 0; local188 < this.anInt1762; local188++) {
					local197 = NativeStream.floatToRawIntBits((float) this.anIntArray156[local188]);
					local204 = NativeStream.floatToRawIntBits((float) this.anIntArray155[local188]);
					local211 = NativeStream.floatToRawIntBits((float) this.anIntArray159[local188]);
					local216 = this.anIntArray157[local188];
					local223 = this.anIntArray157[local188 + 1];
					for (local225 = local216; local225 < local223; local225++) {
						local234 = this.lb[local225] - 1;
						if (local234 == -1) {
							break;
						}
						Static258.aClass3_Sub2_Sub1_6.anInt7620 = local106 * local234;
						Static258.aClass3_Sub2_Sub1_6.method6008(local197);
						Static258.aClass3_Sub2_Sub1_6.method6008(local204);
						Static258.aClass3_Sub2_Sub1_6.method6008(local211);
					}
				}
			} else {
				for (local188 = 0; local188 < this.anInt1762; local188++) {
					local197 = NativeStream.floatToRawIntBits((float) this.anIntArray156[local188]);
					local204 = NativeStream.floatToRawIntBits((float) this.anIntArray155[local188]);
					local211 = NativeStream.floatToRawIntBits((float) this.anIntArray159[local188]);
					local216 = this.anIntArray157[local188];
					local223 = this.anIntArray157[local188 + 1];
					for (local225 = local216; local225 < local223; local225++) {
						local234 = this.lb[local225] - 1;
						if (local234 == -1) {
							break;
						}
						Static258.aClass3_Sub2_Sub1_6.anInt7620 = local106 * local234;
						Static258.aClass3_Sub2_Sub1_6.method6015(local197);
						Static258.aClass3_Sub2_Sub1_6.method6015(local204);
						Static258.aClass3_Sub2_Sub1_6.method6015(local211);
					}
				}
			}
		}
		@Pc(575) float local575;
		@Pc(451) short[] local451;
		@Pc(457) short[] local457;
		@Pc(448) short[] local448;
		@Pc(454) byte[] local454;
		@Pc(608) float local608;
		if (local16) {
			if (this.aClass225_4 == null) {
				if (this.aClass132_1 == null) {
					local448 = this.aShortArray20;
					local451 = this.aShortArray27;
					local454 = this.aByteArray22;
					local457 = this.aShortArray22;
				} else {
					local448 = this.aClass132_1.aShortArray47;
					local451 = this.aClass132_1.aShortArray48;
					local454 = this.aClass132_1.aByteArray46;
					local457 = this.aClass132_1.aShortArray49;
				}
				@Pc(481) float local481 = this.aClass75_Sub2_10.aFloatArray23[0];
				@Pc(487) float local487 = this.aClass75_Sub2_10.aFloatArray23[1];
				@Pc(493) float local493 = this.aClass75_Sub2_10.aFloatArray23[2];
				@Pc(497) float local497 = this.aClass75_Sub2_10.aFloat45;
				@Pc(507) float local507 = this.aClass75_Sub2_10.aFloat39 * 768.0F / (float) this.aShort50;
				@Pc(517) float local517 = this.aClass75_Sub2_10.aFloat29 * 768.0F / (float) this.aShort50;
				for (@Pc(519) int local519 = 0; local519 < this.anInt1769; local519++) {
					@Pc(539) int local539 = this.method1445(this.aByteArray23[local519], this.aShortArray21[local519], this.aShortArray28[local519], this.aShort49);
					@Pc(548) float local548 = this.aClass75_Sub2_10.aFloat43 * (float) (local539 >>> 24);
					@Pc(559) float local559 = this.aClass75_Sub2_10.aFloat37 * (float) (local539 >> 8 & 0xFF);
					@Pc(564) short local564 = this.aShortArray26[local519];
					local575 = this.aClass75_Sub2_10.aFloat47 * (float) (local539 >> 16 & 0xFF);
					@Pc(580) short local580 = (short) local454[local564];
					if (local580 == 0) {
						local608 = ((float) local448[local564] * local493 + (float) local457[local564] * local487 + local481 * (float) local451[local564]) * 0.0026041667F;
					} else {
						local608 = (local481 * (float) local451[local564] + local487 * (float) local457[local564] + local493 * (float) local448[local564]) / (float) (local580 * 256);
					}
					@Pc(645) float local645 = local497 + local608 * (local608 < 0.0F ? local517 : local507);
					@Pc(650) int local650 = (int) (local548 * local645);
					if (local650 < 0) {
						local650 = 0;
					} else if (local650 > 255) {
						local650 = 255;
					}
					@Pc(668) int local668 = (int) (local575 * local645);
					if (local668 < 0) {
						local668 = 0;
					} else if (local668 > 255) {
						local668 = 255;
					}
					@Pc(686) int local686 = (int) (local559 * local645);
					if (local686 < 0) {
						local686 = 0;
					} else if (local686 > 255) {
						local686 = 255;
					}
					Static258.aClass3_Sub2_Sub1_6.anInt7620 = local564 * local106 + local110;
					Static258.aClass3_Sub2_Sub1_6.method6001(local650);
					Static258.aClass3_Sub2_Sub1_6.method6001(local668);
					Static258.aClass3_Sub2_Sub1_6.method6001(local686);
					Static258.aClass3_Sub2_Sub1_6.method6001(255 - (this.aByteArray23[local519] & 0xFF));
					local564 = this.aShortArray25[local519];
					local580 = local454[local564];
					if (local580 == 0) {
						local608 = ((float) local448[local564] * local493 + (float) local451[local564] * local481 + local487 * (float) local457[local564]) * 0.0026041667F;
					} else {
						local608 = ((float) local457[local564] * local487 + (float) local451[local564] * local481 + (float) local448[local564] * local493) / (float) (local580 * 256);
					}
					local645 = local497 + (local608 < 0.0F ? local517 : local507) * local608;
					local650 = (int) (local548 * local645);
					if (local650 < 0) {
						local650 = 0;
					} else if (local650 > 255) {
						local650 = 255;
					}
					local668 = (int) (local575 * local645);
					if (local668 < 0) {
						local668 = 0;
					} else if (local668 > 255) {
						local668 = 255;
					}
					local686 = (int) (local645 * local559);
					if (local686 < 0) {
						local686 = 0;
					} else if (local686 > 255) {
						local686 = 255;
					}
					Static258.aClass3_Sub2_Sub1_6.anInt7620 = local110 + local564 * local106;
					Static258.aClass3_Sub2_Sub1_6.method6001(local650);
					Static258.aClass3_Sub2_Sub1_6.method6001(local668);
					Static258.aClass3_Sub2_Sub1_6.method6001(local686);
					Static258.aClass3_Sub2_Sub1_6.method6001(255 - (this.aByteArray23[local519] & 0xFF));
					local564 = this.aShortArray29[local519];
					local580 = local454[local564];
					if (local580 == 0) {
						local608 = ((float) local457[local564] * local487 + local481 * (float) local451[local564] + local493 * (float) local448[local564]) * 0.0026041667F;
					} else {
						local608 = (local493 * (float) local448[local564] + (float) local457[local564] * local487 + (float) local451[local564] * local481) / (float) (local580 * 256);
					}
					local645 = local608 * (local608 < 0.0F ? local517 : local507) + local497;
					local650 = (int) (local645 * local548);
					local668 = (int) (local575 * local645);
					if (local650 < 0) {
						local650 = 0;
					} else if (local650 > 255) {
						local650 = 255;
					}
					if (local668 < 0) {
						local668 = 0;
					} else if (local668 > 255) {
						local668 = 255;
					}
					local686 = (int) (local645 * local559);
					if (local686 < 0) {
						local686 = 0;
					} else if (local686 > 255) {
						local686 = 255;
					}
					Static258.aClass3_Sub2_Sub1_6.anInt7620 = local564 * local106 + local110;
					Static258.aClass3_Sub2_Sub1_6.method6001(local650);
					Static258.aClass3_Sub2_Sub1_6.method6001(local668);
					Static258.aClass3_Sub2_Sub1_6.method6001(local686);
					Static258.aClass3_Sub2_Sub1_6.method6001(255 - (this.aByteArray23[local519] & 0xFF));
				}
			} else {
				for (local188 = 0; local188 < this.anInt1769; local188++) {
					local197 = this.method1445(this.aByteArray23[local188], this.aShortArray21[local188], this.aShortArray28[local188], this.aShort49);
					Static258.aClass3_Sub2_Sub1_6.anInt7620 = local106 * this.aShortArray26[local188] + local110;
					Static258.aClass3_Sub2_Sub1_6.method6008(local197);
					Static258.aClass3_Sub2_Sub1_6.anInt7620 = local110 + local106 * this.aShortArray25[local188];
					Static258.aClass3_Sub2_Sub1_6.method6008(local197);
					Static258.aClass3_Sub2_Sub1_6.anInt7620 = local106 * this.aShortArray29[local188] + local110;
					Static258.aClass3_Sub2_Sub1_6.method6008(local197);
				}
			}
		}
		if (local27) {
			if (this.aClass132_1 == null) {
				local457 = this.aShortArray22;
				local454 = this.aByteArray22;
				local451 = this.aShortArray27;
				local448 = this.aShortArray20;
			} else {
				local451 = this.aClass132_1.aShortArray48;
				local457 = this.aClass132_1.aShortArray49;
				local448 = this.aClass132_1.aShortArray47;
				local454 = this.aClass132_1.aByteArray46;
			}
			@Pc(1111) float local1111 = 3.0F / (float) this.aShort50;
			Static258.aClass3_Sub2_Sub1_6.anInt7620 = local112;
			local608 = 3.0F / (float) (this.aShort50 / 2 + this.aShort50);
			if (this.aClass75_Sub2_10.aBoolean228) {
				for (local225 = 0; local225 < this.anInt1761; local225++) {
					local234 = local454[local225] & 0xFF;
					if (local234 == 0) {
						Static258.aClass3_Sub2_Sub1_6.method400(local608 * (float) local451[local225]);
						Static258.aClass3_Sub2_Sub1_6.method400(local608 * (float) local457[local225]);
						Static258.aClass3_Sub2_Sub1_6.method400(local608 * (float) local448[local225]);
					} else {
						local575 = local1111 / (float) local234;
						Static258.aClass3_Sub2_Sub1_6.method400((float) local451[local225] * local575);
						Static258.aClass3_Sub2_Sub1_6.method400((float) local457[local225] * local575);
						Static258.aClass3_Sub2_Sub1_6.method400((float) local448[local225] * local575);
					}
					Static258.aClass3_Sub2_Sub1_6.anInt7620 += local106 - 12;
				}
			} else {
				for (local225 = 0; local225 < this.anInt1761; local225++) {
					local234 = local454[local225] & 0xFF;
					if (local234 == 0) {
						Static258.aClass3_Sub2_Sub1_6.method395((float) local451[local225] * local608);
						Static258.aClass3_Sub2_Sub1_6.method395(local608 * (float) local457[local225]);
						Static258.aClass3_Sub2_Sub1_6.method395((float) local448[local225] * local608);
					} else {
						local575 = local1111 / (float) local234;
						Static258.aClass3_Sub2_Sub1_6.method395(local575 * (float) local451[local225]);
						Static258.aClass3_Sub2_Sub1_6.method395(local575 * (float) local457[local225]);
						Static258.aClass3_Sub2_Sub1_6.method395((float) local448[local225] * local575);
					}
					Static258.aClass3_Sub2_Sub1_6.anInt7620 += local106 - 12;
				}
			}
		}
		if (local49) {
			Static258.aClass3_Sub2_Sub1_6.anInt7620 = local114;
			if (this.aClass75_Sub2_10.aBoolean228) {
				for (local188 = 0; local188 < this.anInt1761; local188++) {
					Static258.aClass3_Sub2_Sub1_6.method400(this.aFloatArray13[local188]);
					Static258.aClass3_Sub2_Sub1_6.method400(this.aFloatArray12[local188]);
					Static258.aClass3_Sub2_Sub1_6.anInt7620 += local106 - 8;
				}
			} else {
				for (local188 = 0; local188 < this.anInt1761; local188++) {
					Static258.aClass3_Sub2_Sub1_6.method395(this.aFloatArray13[local188]);
					Static258.aClass3_Sub2_Sub1_6.method395(this.aFloatArray12[local188]);
					Static258.aClass3_Sub2_Sub1_6.anInt7620 += local106 - 8;
				}
			}
		}
		Static258.aClass3_Sub2_Sub1_6.anInt7620 = local106 * this.anInt1761;
		@Pc(1431) Interface5 local1431;
		if (arg0) {
			if (this.anInterface5_1 == null) {
				this.anInterface5_1 = this.aClass75_Sub2_10.method2435(Static258.aClass3_Sub2_Sub1_6.anInt7620, Static258.aClass3_Sub2_Sub1_6.aByteArray95, true, local106);
			} else {
				this.anInterface5_1.method4784(local106, Static258.aClass3_Sub2_Sub1_6.aByteArray95, Static258.aClass3_Sub2_Sub1_6.anInt7620);
			}
			this.aByte21 = 0;
			local1431 = this.anInterface5_1;
		} else {
			local1431 = this.aClass75_Sub2_10.method2435(Static258.aClass3_Sub2_Sub1_6.anInt7620, Static258.aClass3_Sub2_Sub1_6.aByteArray95, false, local106);
			this.aBoolean139 = true;
		}
		if (local38) {
			this.aClass225_2.anInterface5_7 = local1431;
			this.aClass225_2.aByte96 = 0;
		}
		if (local49) {
			this.aClass225_3.aByte96 = local114;
			this.aClass225_3.anInterface5_7 = local1431;
		}
		if (local16) {
			this.aClass225_1.anInterface5_7 = local1431;
			this.aClass225_1.aByte96 = local110;
		}
		if (local27) {
			this.aClass225_4.anInterface5_7 = local1431;
			this.aClass225_4.aByte96 = local112;
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
	private void method1447() {
		if (!this.aBoolean139) {
			return;
		}
		this.aBoolean139 = false;
		if (this.aClass209Array1 == null && this.aClass178Array1 == null && this.aClass108Array1 == null) {
			if (this.anIntArray156 != null && !Static380.method5241(this.anInt1802, this.anInt1804)) {
				if (this.aClass225_2 != null && this.aClass225_2.anInterface5_7 == null) {
					this.aBoolean139 = true;
				} else {
					if (!this.aBoolean140) {
						this.method1454();
					}
					this.anIntArray156 = null;
				}
			}
			if (this.anIntArray155 != null && !Static169.method2917(this.anInt1804, this.anInt1802)) {
				if (this.aClass225_2 != null && this.aClass225_2.anInterface5_7 == null) {
					this.aBoolean139 = true;
				} else {
					if (!this.aBoolean140) {
						this.method1454();
					}
					this.anIntArray155 = null;
				}
			}
			if (this.anIntArray159 != null && !Static138.method2519(this.anInt1802, this.anInt1804)) {
				if (this.aClass225_2 != null && this.aClass225_2.anInterface5_7 == null) {
					this.aBoolean139 = true;
				} else {
					if (!this.aBoolean140) {
						this.method1454();
					}
					this.anIntArray159 = null;
				}
			}
		}
		if (this.lb != null && this.anIntArray156 == null && this.anIntArray155 == null && this.anIntArray159 == null) {
			this.anIntArray157 = null;
			this.lb = null;
		}
		if (this.aByteArray22 != null && !Static304.method4489(this.anInt1804, this.anInt1802)) {
			if (this.aClass225_4 == null) {
				if (this.aClass225_1 != null && this.aClass225_1.anInterface5_7 == null) {
					this.aBoolean139 = true;
				} else {
					this.aShortArray27 = this.aShortArray22 = this.aShortArray20 = null;
					this.aByteArray22 = null;
				}
			} else if (this.aClass225_4.anInterface5_7 == null) {
				this.aBoolean139 = true;
			} else {
				this.aByteArray22 = null;
				this.aShortArray27 = this.aShortArray22 = this.aShortArray20 = null;
			}
		}
		if (this.aShortArray28 != null && !Static264.method3990(this.anInt1802, this.anInt1804)) {
			if (this.aClass225_1 != null && this.aClass225_1.anInterface5_7 == null) {
				this.aBoolean139 = true;
			} else {
				this.aShortArray28 = null;
			}
		}
		if (this.aByteArray23 != null && !Static276.method4121(this.anInt1804, this.anInt1802)) {
			if (this.aClass225_1 != null && this.aClass225_1.anInterface5_7 == null) {
				this.aBoolean139 = true;
			} else {
				this.aByteArray23 = null;
			}
		}
		if (this.aFloatArray13 != null && !Static146.method2658(this.anInt1804, this.anInt1802)) {
			if (this.aClass225_3 != null && this.aClass225_3.anInterface5_7 == null) {
				this.aBoolean139 = true;
			} else {
				this.aFloatArray13 = this.aFloatArray12 = null;
			}
		}
		if (this.aShortArray21 != null && !Static61.method1204(this.anInt1804, this.anInt1802)) {
			if (this.aClass225_1 != null && this.aClass225_1.anInterface5_7 == null) {
				this.aBoolean139 = true;
			} else {
				this.aShortArray21 = null;
			}
		}
		if (this.aShortArray26 != null && !Static305.method4504(this.anInt1802, this.anInt1804)) {
			if (this.aClass269_1 != null && this.aClass269_1.anInterface1_5 == null || this.aClass225_1 != null && this.aClass225_1.anInterface5_7 == null) {
				this.aBoolean139 = true;
			} else {
				this.aShortArray26 = this.aShortArray25 = this.aShortArray29 = null;
			}
		}
		if (this.anIntArrayArray20 != null && !Static428.method5678(this.anInt1804, this.anInt1802)) {
			this.anIntArrayArray20 = null;
			this.aShortArray24 = null;
		}
		if (this.anIntArrayArray21 != null && !Static168.method2914(this.anInt1802, this.anInt1804)) {
			this.anIntArrayArray21 = null;
			this.aShortArray23 = null;
		}
		if (this.anIntArrayArray19 != null && !Static224.method3528(this.anInt1804, this.anInt1802)) {
			this.anIntArrayArray19 = null;
		}
		if (this.anIntArray158 != null && (this.anInt1802 & 0x800) == 0 && (this.anInt1802 & 0x40000) == 0) {
			this.anIntArray158 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "YA", descriptor = "(SS)V")
	@Override
	public void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass75_Sub2_10.anInterface7_6;
		for (@Pc(11) int local11 = 0; local11 < this.anInt1769; local11++) {
			if (this.aShortArray21[local11] == arg0) {
				this.aShortArray21[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(43) Class62 local43 = local9.method2131(arg0 & 0xFFFF);
			local31 = local43.aByte24;
			local33 = local43.aByte27;
		}
		@Pc(51) byte local51 = 0;
		@Pc(53) byte local53 = 0;
		if (arg1 != -1) {
			@Pc(63) Class62 local63 = local9.method2131(arg1 & 0xFFFF);
			local51 = local63.aByte24;
			local53 = local63.aByte27;
		}
		if (!(local51 != local31 | local33 != local53)) {
			return;
		}
		if (this.aClass108Array1 != null) {
			for (@Pc(92) int local92 = 0; local92 < this.anInt1798; local92++) {
				@Pc(99) Class108 local99 = this.aClass108Array1[local92];
				@Pc(104) Class232 local104 = this.aClass232Array1[local92];
				local104.anInt6891 = Static168.anIntArray264[this.aShortArray28[local99.anInt3575] & 0xFFFF] & 0xFFFFFF | local104.anInt6891 & 0xFF000000;
			}
		}
		if (this.aClass225_1 != null) {
			this.aClass225_1.anInterface5_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!du", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		return this.aShort49;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "()I")
	@Override
	public int b() {
		if (!this.aBoolean140) {
			this.method1454();
		}
		return this.aShort48;
	}

	@OriginalMember(owner = "client!du", name = "ja", descriptor = "(III)V")
	@Override
	public void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1762; local3++) {
			if (arg0 != 0) {
				this.anIntArray156[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray155[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray159[local3] += arg2;
			}
		}
		if (this.aClass225_2 != null) {
			this.aClass225_2.anInterface5_7 = null;
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!du", name = "d", descriptor = "()[Lclient!sm;")
	@Override
	public Class209[] method5707() {
		return this.aClass209Array1;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	@Override
	public void method5700(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class31_Sub1 local8 = (Class31_Sub1) arg0;
		if (this.anInt1769 == 0 || local8.anInt1769 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt1762;
		@Pc(21) int[] local21 = local8.anIntArray156;
		@Pc(24) int[] local24 = local8.anIntArray155;
		@Pc(27) int[] local27 = local8.anIntArray159;
		@Pc(30) short[] local30 = local8.aShortArray27;
		@Pc(33) short[] local33 = local8.aShortArray22;
		@Pc(36) short[] local36 = local8.aShortArray20;
		@Pc(39) byte[] local39 = local8.aByteArray22;
		@Pc(58) short[] local58;
		@Pc(54) short[] local54;
		@Pc(50) short[] local50;
		@Pc(46) byte[] local46;
		if (this.aClass132_1 == null) {
			local54 = null;
			local50 = null;
			local58 = null;
			local46 = null;
		} else {
			local46 = this.aClass132_1.aByteArray46;
			local50 = this.aClass132_1.aShortArray47;
			local54 = this.aClass132_1.aShortArray49;
			local58 = this.aClass132_1.aShortArray48;
		}
		@Pc(79) short[] local79;
		@Pc(75) short[] local75;
		@Pc(87) short[] local87;
		@Pc(83) byte[] local83;
		if (local8.aClass132_1 == null) {
			local75 = null;
			local87 = null;
			local79 = null;
			local83 = null;
		} else {
			local75 = local8.aClass132_1.aShortArray49;
			local79 = local8.aClass132_1.aShortArray48;
			local83 = local8.aClass132_1.aByteArray46;
			local87 = local8.aClass132_1.aShortArray47;
		}
		@Pc(100) int[] local100 = local8.anIntArray157;
		@Pc(103) short[] local103 = local8.lb;
		if (!local8.aBoolean140) {
			local8.method1454();
		}
		@Pc(112) short local112 = local8.aShort48;
		@Pc(115) short local115 = local8.aShort46;
		@Pc(118) short local118 = local8.aShort47;
		@Pc(121) short local121 = local8.aShort44;
		@Pc(124) short local124 = local8.aShort43;
		@Pc(127) short local127 = local8.aShort51;
		for (@Pc(129) int local129 = 0; local129 < this.anInt1762; local129++) {
			@Pc(139) int local139 = this.anIntArray155[local129] - arg2;
			if (local112 <= local139 && local139 <= local115) {
				@Pc(163) int local163 = this.anIntArray156[local129] - arg1;
				if (local118 <= local163 && local121 >= local163) {
					@Pc(183) int local183 = this.anIntArray159[local129] - arg3;
					if (local124 <= local183 && local127 >= local183) {
						@Pc(201) int local201 = -1;
						@Pc(206) int local206 = this.anIntArray157[local129];
						@Pc(213) int local213 = this.anIntArray157[local129 + 1];
						for (@Pc(215) int local215 = local206; local215 < local213; local215++) {
							local201 = this.lb[local215] - 1;
							if (local201 == -1 || this.aByteArray22[local201] != 0) {
								break;
							}
						}
						if (local201 != -1) {
							for (@Pc(247) int local247 = 0; local247 < local18; local247++) {
								if (local163 == local21[local247] && local183 == local27[local247] && local24[local247] == local139) {
									@Pc(278) int local278 = -1;
									local213 = local100[local247 + 1];
									local206 = local100[local247];
									for (@Pc(290) int local290 = local206; local290 < local213; local290++) {
										local278 = local103[local290] - 1;
										if (local278 == -1 || local39[local278] != 0) {
											break;
										}
									}
									if (local278 != -1) {
										if (local58 == null) {
											this.aClass132_1 = new Class132();
											local58 = this.aClass132_1.aShortArray48 = Static258.method5844(this.aShortArray27);
											local54 = this.aClass132_1.aShortArray49 = Static258.method5844(this.aShortArray22);
											local50 = this.aClass132_1.aShortArray47 = Static258.method5844(this.aShortArray20);
											local46 = this.aClass132_1.aByteArray46 = Static151.method2694(this.aByteArray22);
										}
										if (local79 == null) {
											@Pc(371) Class132 local371 = local8.aClass132_1 = new Class132();
											local79 = local371.aShortArray48 = Static258.method5844(local30);
											local75 = local371.aShortArray49 = Static258.method5844(local33);
											local87 = local371.aShortArray47 = Static258.method5844(local36);
											local83 = local371.aByteArray46 = Static151.method2694(local39);
										}
										@Pc(404) short local404 = this.aShortArray27[local201];
										@Pc(409) short local409 = this.aShortArray22[local201];
										@Pc(414) short local414 = this.aShortArray20[local201];
										@Pc(419) byte local419 = this.aByteArray22[local201];
										local213 = local100[local247 + 1];
										local206 = local100[local247];
										@Pc(439) int local439;
										for (@Pc(431) int local431 = local206; local431 < local213; local431++) {
											local439 = local103[local431] - 1;
											if (local439 == -1) {
												break;
											}
											if (local83[local439] != 0) {
												local79[local439] += local404;
												local75[local439] += local409;
												local87[local439] += local414;
												local83[local439] += local419;
											}
										}
										local409 = local33[local278];
										local404 = local30[local278];
										local419 = local39[local278];
										local206 = this.anIntArray157[local129];
										local213 = this.anIntArray157[local129 + 1];
										local414 = local36[local278];
										for (local439 = local206; local439 < local213; local439++) {
											@Pc(529) int local529 = this.lb[local439] - 1;
											if (local529 == -1) {
												break;
											}
											if (local46[local529] != 0) {
												local58[local529] += local404;
												local54[local529] += local409;
												local50[local529] += local414;
												local46[local529] += local419;
											}
										}
										if (this.aClass225_4 == null && this.aClass225_1 != null) {
											this.aClass225_1.anInterface5_7 = null;
										}
										if (this.aClass225_4 != null) {
											this.aClass225_4.anInterface5_7 = null;
										}
										if (local8.aClass225_4 == null && local8.aClass225_1 != null) {
											local8.aClass225_1.anInterface5_7 = null;
										}
										if (local8.aClass225_4 != null) {
											local8.aClass225_4.anInterface5_7 = null;
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

	@OriginalMember(owner = "client!du", name = "VA", descriptor = "()I")
	@Override
	public int VA() {
		if (!this.aBoolean140) {
			this.method1454();
		}
		return this.aShort44;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IJFIIBIFILclient!uu;)S")
	private short method1449(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class242 arg8) {
		@Pc(10) int local10 = this.anIntArray157[arg4];
		@Pc(17) int local17 = this.anIntArray157[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.lb[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg1 == Static277.aLongArray4[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.lb[local19] = (short) (this.anInt1761 + 1);
		Static277.aLongArray4[local19] = arg1;
		this.aShortArray27[this.anInt1761] = (short) arg5;
		this.aShortArray22[this.anInt1761] = (short) arg3;
		this.aShortArray20[this.anInt1761] = (short) arg0;
		this.aByteArray22[this.anInt1761] = (byte) arg7;
		this.aFloatArray13[this.anInt1761] = arg6;
		this.aFloatArray12[this.anInt1761] = arg2;
		return (short) this.anInt1761++;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "()Z")
	@Override
	public boolean method5701() {
		if (this.aShortArray21 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray21.length; local12++) {
			if (this.aShortArray21[local12] != -1 && !this.aClass75_Sub2_10.anInterface7_6.method2132(this.aShortArray21[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method1450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg3 && arg4 < arg5 && arg4 < arg2) {
			return false;
		} else if (arg3 < arg4 && arg4 > arg5 && arg4 > arg2) {
			return false;
		} else if (arg1 < arg0 && arg1 < arg6 && arg1 < arg7) {
			return false;
		} else {
			return arg0 >= arg1 || arg1 <= arg6 || arg7 >= arg1;
		}
	}

	@OriginalMember(owner = "client!du", name = "e", descriptor = "()V")
	@Override
	public void method5716() {
		if (this.anInt1761 <= 0 || this.anInt1752 <= 0) {
			return;
		}
		this.method1446(false);
		if ((this.aByte21 & 0x10) == 0 && this.aClass269_1.anInterface1_5 == null) {
			this.method1451(false);
		}
		this.method1447();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZZ)V")
	private void method1451(@OriginalArg(0) boolean arg0) {
		if (Static258.aClass3_Sub2_Sub1_6.aByteArray95.length >= this.anInt1752 * 6) {
			Static258.aClass3_Sub2_Sub1_6.anInt7620 = 0;
		} else {
			Static258.aClass3_Sub2_Sub1_6 = new Class3_Sub2_Sub1((this.anInt1752 + 100) * 6);
		}
		@Pc(43) int local43;
		if (this.aClass75_Sub2_10.aBoolean228) {
			for (local43 = 0; local43 < this.anInt1752; local43++) {
				Static258.aClass3_Sub2_Sub1_6.method6045(this.aShortArray26[local43]);
				Static258.aClass3_Sub2_Sub1_6.method6045(this.aShortArray25[local43]);
				Static258.aClass3_Sub2_Sub1_6.method6045(this.aShortArray29[local43]);
			}
		} else {
			for (local43 = 0; local43 < this.anInt1752; local43++) {
				Static258.aClass3_Sub2_Sub1_6.method6000(this.aShortArray26[local43]);
				Static258.aClass3_Sub2_Sub1_6.method6000(this.aShortArray25[local43]);
				Static258.aClass3_Sub2_Sub1_6.method6000(this.aShortArray29[local43]);
			}
		}
		if (Static258.aClass3_Sub2_Sub1_6.anInt7620 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface1_1 == null) {
				this.anInterface1_1 = this.aClass75_Sub2_10.method2437(Static258.aClass3_Sub2_Sub1_6.aByteArray95, true, Static258.aClass3_Sub2_Sub1_6.anInt7620);
			} else {
				this.anInterface1_1.method5470(Static258.aClass3_Sub2_Sub1_6.aByteArray95, Static258.aClass3_Sub2_Sub1_6.anInt7620);
			}
			this.aClass269_1.anInterface1_5 = this.anInterface1_1;
		} else {
			this.aClass269_1.anInterface1_5 = this.aClass75_Sub2_10.method2437(Static258.aClass3_Sub2_Sub1_6.aByteArray95, false, Static258.aClass3_Sub2_Sub1_6.anInt7620);
		}
		if (!arg0) {
			this.aBoolean139 = true;
		}
	}

	@OriginalMember(owner = "client!du", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aShort50 = (short) arg0;
		if (this.aClass225_1 != null) {
			this.aClass225_1.anInterface5_7 = null;
		}
		if (this.aClass225_4 != null) {
			this.aClass225_4.anInterface5_7 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "va", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static2.anInt58 = 0;
			Static406.anInt7056 = 0;
			Static310.anInt7038 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray21.length > local41) {
					local51 = this.anIntArrayArray21[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray23 == null || (this.aShortArray23[local59] & arg6) != 0) {
							Static2.anInt58 += this.anIntArray156[local59];
							Static310.anInt7038 += this.anIntArray155[local59];
							Static406.anInt7056 += this.anIntArray159[local59];
							local33++;
						}
					}
				}
			}
			if (local33 > 0) {
				Static406.anInt7056 = arg4 + Static406.anInt7056 / local33;
				Static310.anInt7038 = Static310.anInt7038 / local33 + arg3;
				Static2.anInt58 = arg2 + Static2.anInt58 / local33;
				Static350.aBoolean442 = true;
			} else {
				Static2.anInt58 = arg2;
				Static406.anInt7056 = arg4;
				Static310.anInt7038 = arg3;
			}
			return;
		}
		@Pc(246) int[] local246;
		@Pc(248) int local248;
		if (arg0 == 1) {
			if (arg7 != null) {
				local33 = arg4 * arg7[2] + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
				local35 = arg7[4] * arg3 + arg2 * arg7[3] + arg7[5] * arg4 + 16384 >> 15;
				local41 = arg7[6] * arg2 + arg3 * arg7[7] + arg7[8] * arg4 + 16384 >> 15;
				arg3 = local35;
				arg2 = local33;
				arg4 = local41;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray21.length > local35) {
					local246 = this.anIntArrayArray21[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local53 = local246[local248];
						if (this.aShortArray23 == null || (this.aShortArray23[local53] & arg6) != 0) {
							this.anIntArray156[local53] += arg2;
							this.anIntArray155[local53] += arg3;
							this.anIntArray159[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(384) int local384;
		@Pc(402) int local402;
		@Pc(634) int local634;
		@Pc(643) int local643;
		@Pc(653) int local653;
		@Pc(657) int local657;
		@Pc(675) int local675;
		@Pc(1020) int local1020;
		@Pc(1028) int local1028;
		@Pc(1185) int local1185;
		@Pc(1210) int local1210;
		@Pc(1214) int local1214;
		@Pc(1223) int local1223;
		@Pc(1228) int local1228;
		@Pc(1232) int local1232;
		@Pc(1236) int local1236;
		@Pc(1238) int local1238;
		@Pc(1369) int[] local1369;
		@Pc(1371) int local1371;
		@Pc(1375) int local1375;
		@Pc(1379) int local1379;
		@Pc(1381) int local1381;
		@Pc(1512) int local1512;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray21.length) {
						local246 = this.anIntArrayArray21[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local53 = local246[local248];
							if (this.aShortArray23 == null || (this.aShortArray23[local53] & arg6) != 0) {
								this.anIntArray156[local53] -= Static2.anInt58;
								this.anIntArray155[local53] -= Static310.anInt7038;
								this.anIntArray159[local53] -= Static406.anInt7056;
								if (arg4 != 0) {
									local59 = Applet_Sub1.anIntArray85[arg4];
									local384 = Applet_Sub1.anIntArray87[arg4];
									local402 = local59 * this.anIntArray155[local53] + local384 * this.anIntArray156[local53] + 32767 >> 15;
									this.anIntArray155[local53] = this.anIntArray155[local53] * local384 + 32767 - local59 * this.anIntArray156[local53] >> 15;
									this.anIntArray156[local53] = local402;
								}
								if (arg2 != 0) {
									local59 = Applet_Sub1.anIntArray85[arg2];
									local384 = Applet_Sub1.anIntArray87[arg2];
									local402 = this.anIntArray155[local53] * local384 + 32767 - this.anIntArray159[local53] * local59 >> 15;
									this.anIntArray159[local53] = local59 * this.anIntArray155[local53] + this.anIntArray159[local53] * local384 + 32767 >> 15;
									this.anIntArray155[local53] = local402;
								}
								if (arg3 != 0) {
									local59 = Applet_Sub1.anIntArray85[arg3];
									local384 = Applet_Sub1.anIntArray87[arg3];
									local402 = local384 * this.anIntArray156[local53] + local59 * this.anIntArray159[local53] + 32767 >> 15;
									this.anIntArray159[local53] = local384 * this.anIntArray159[local53] + 32767 - this.anIntArray156[local53] * local59 >> 15;
									this.anIntArray156[local53] = local402;
								}
								this.anIntArray156[local53] += Static2.anInt58;
								this.anIntArray155[local53] += Static310.anInt7038;
								this.anIntArray159[local53] += Static406.anInt7056;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray21.length > local41) {
							local51 = this.anIntArrayArray21[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local59]) != 0) {
									local384 = this.anIntArray157[local59];
									local402 = this.anIntArray157[local59 + 1];
									for (local634 = local384; local634 < local402; local634++) {
										local643 = this.lb[local634] - 1;
										if (local643 == -1) {
											break;
										}
										if (arg4 != 0) {
											local653 = Applet_Sub1.anIntArray85[arg4];
											local657 = Applet_Sub1.anIntArray87[arg4];
											local675 = this.aShortArray22[local643] * local653 + this.aShortArray27[local643] * local657 + 32767 >> 15;
											this.aShortArray22[local643] = (short) (this.aShortArray22[local643] * local657 + 32767 - local653 * this.aShortArray27[local643] >> 15);
											this.aShortArray27[local643] = (short) local675;
										}
										if (arg2 != 0) {
											local653 = Applet_Sub1.anIntArray85[arg2];
											local657 = Applet_Sub1.anIntArray87[arg2];
											local675 = local657 * this.aShortArray22[local643] + 32767 - local653 * this.aShortArray20[local643] >> 15;
											this.aShortArray20[local643] = (short) (this.aShortArray20[local643] * local657 + local653 * this.aShortArray22[local643] + 32767 >> 15);
											this.aShortArray22[local643] = (short) local675;
										}
										if (arg3 != 0) {
											local653 = Applet_Sub1.anIntArray85[arg3];
											local657 = Applet_Sub1.anIntArray87[arg3];
											local675 = this.aShortArray27[local643] * local657 + local653 * this.aShortArray20[local643] + 32767 >> 15;
											this.aShortArray20[local643] = (short) (local657 * this.aShortArray20[local643] + 32767 - local653 * this.aShortArray27[local643] >> 15);
											this.aShortArray27[local643] = (short) local675;
										}
									}
								}
							}
						}
					}
					if (this.aClass225_4 == null && this.aClass225_1 != null) {
						this.aClass225_1.anInterface5_7 = null;
					}
					if (this.aClass225_4 != null) {
						this.aClass225_4.anInterface5_7 = null;
						return;
					}
				}
			} else {
				local33 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local248 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static350.aBoolean442) {
					local384 = arg7[6] * Static406.anInt7056 + Static2.anInt58 * arg7[0] + Static310.anInt7038 * arg7[3] + 16384 >> 15;
					local402 = Static406.anInt7056 * arg7[7] + Static2.anInt58 * arg7[1] + Static310.anInt7038 * arg7[4] + 16384 >> 15;
					local384 += local248;
					local634 = Static406.anInt7056 * arg7[8] + Static2.anInt58 * arg7[2] + arg7[5] * Static310.anInt7038 + 16384 >> 15;
					local402 += local53;
					Static2.anInt58 = local384;
					local634 += local59;
					Static310.anInt7038 = local402;
					Static406.anInt7056 = local634;
					Static350.aBoolean442 = false;
				}
				@Pc(988) int[] local988 = new int[9];
				local402 = Applet_Sub1.anIntArray87[arg2];
				local634 = Applet_Sub1.anIntArray85[arg2];
				local643 = Applet_Sub1.anIntArray87[arg3];
				local653 = Applet_Sub1.anIntArray85[arg3];
				local657 = Applet_Sub1.anIntArray87[arg4];
				local675 = Applet_Sub1.anIntArray85[arg4];
				local1020 = local634 * local657 + 16384 >> 15;
				local1028 = local675 * local634 + 16384 >> 15;
				local988[5] = -local634;
				local988[6] = local1028 * local643 + local657 * -local653 + 16384 >> 15;
				local988[1] = local675 * -local643 + local1020 * local653 + 16384 >> 15;
				local988[4] = local402 * local657 + 16384 >> 15;
				local988[3] = local675 * local402 + 16384 >> 15;
				local988[2] = local653 * local402 + 16384 >> 15;
				local988[7] = local653 * local675 + local1020 * local643 + 16384 >> 15;
				local988[8] = local643 * local402 + 16384 >> 15;
				local988[0] = local643 * local657 + local1028 * local653 + 16384 >> 15;
				@Pc(1160) int local1160 = local988[0] * -Static2.anInt58 + local988[1] * -Static310.anInt7038 + local988[2] * -Static406.anInt7056 + 16384 >> 15;
				local1185 = -Static406.anInt7056 * local988[5] + local988[4] * -Static310.anInt7038 + -Static2.anInt58 * local988[3] + 16384 >> 15;
				local1210 = -Static406.anInt7056 * local988[8] + -Static310.anInt7038 * local988[7] + -Static2.anInt58 * local988[6] + 16384 >> 15;
				local1214 = local1160 + Static2.anInt58;
				@Pc(1218) int local1218 = local1185 + Static310.anInt7038;
				local1223 = local1210 + Static406.anInt7056;
				@Pc(1226) int[] local1226 = new int[9];
				for (local1228 = 0; local1228 < 3; local1228++) {
					for (local1232 = 0; local1232 < 3; local1232++) {
						local1236 = 0;
						for (local1238 = 0; local1238 < 3; local1238++) {
							local1236 += arg7[local1238 + local1232 * 3] * local988[local1238 + local1228 * 3];
						}
						local1226[local1232 + local1228 * 3] = local1236 + 16384 >> 15;
					}
				}
				local1232 = local59 * local988[2] + local53 * local988[1] + local248 * local988[0] + 16384 >> 15;
				local1236 = local988[5] * local59 + local988[3] * local248 + local988[4] * local53 + 16384 >> 15;
				local1232 += local1214;
				local1236 += local1218;
				local1238 = local988[8] * local59 + local53 * local988[7] + local988[6] * local248 + 16384 >> 15;
				local1238 += local1223;
				local1369 = new int[9];
				for (local1371 = 0; local1371 < 3; local1371++) {
					for (local1375 = 0; local1375 < 3; local1375++) {
						local1379 = 0;
						for (local1381 = 0; local1381 < 3; local1381++) {
							local1379 += local1226[local1375 + local1381 * 3] * arg7[local1381 + local1371 * 3];
						}
						local1369[local1371 * 3 + local1375] = local1379 + 16384 >> 15;
					}
				}
				local1375 = local1232 * arg7[0] + arg7[1] * local1236 + local1238 * arg7[2] + 16384 >> 15;
				local1379 = arg7[5] * local1238 + local1232 * arg7[3] + arg7[4] * local1236 + 16384 >> 15;
				local1379 += local35;
				local1381 = local1238 * arg7[8] + local1232 * arg7[6] + local1236 * arg7[7] + 16384 >> 15;
				local1375 += local33;
				local1381 += local41;
				for (local1512 = 0; local1512 < local8; local1512++) {
					@Pc(1518) int local1518 = arg1[local1512];
					if (local1518 < this.anIntArrayArray21.length) {
						@Pc(1528) int[] local1528 = this.anIntArrayArray21[local1518];
						for (@Pc(1530) int local1530 = 0; local1530 < local1528.length; local1530++) {
							@Pc(1536) int local1536 = local1528[local1530];
							if (this.aShortArray23 == null || (this.aShortArray23[local1536] & arg6) != 0) {
								@Pc(1581) int local1581 = local1369[2] * this.anIntArray159[local1536] + local1369[0] * this.anIntArray156[local1536] + local1369[1] * this.anIntArray155[local1536] + 16384 >> 15;
								@Pc(1613) int local1613 = local1369[4] * this.anIntArray155[local1536] + local1369[3] * this.anIntArray156[local1536] + local1369[5] * this.anIntArray159[local1536] + 16384 >> 15;
								@Pc(1617) int local1617 = local1613 + local1379;
								@Pc(1649) int local1649 = this.anIntArray156[local1536] * local1369[6] + local1369[7] * this.anIntArray155[local1536] + local1369[8] * this.anIntArray159[local1536] + 16384 >> 15;
								@Pc(1653) int local1653 = local1581 + local1375;
								this.anIntArray156[local1536] = local1653;
								@Pc(1662) int local1662 = local1649 + local1381;
								this.anIntArray155[local1536] = local1617;
								this.anIntArray159[local1536] = local1662;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2588) Class108 local2588;
			@Pc(2593) Class232 local2593;
			if (arg0 == 5) {
				if (this.anIntArrayArray20 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray20.length) {
							local246 = this.anIntArrayArray20[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local53 = local246[local248];
								if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local53]) != 0) {
									local59 = arg2 * 8 + (this.aByteArray23[local53] & 0xFF);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray23[local53] = (byte) local59;
									if (this.aClass225_1 != null) {
										this.aClass225_1.anInterface5_7 = null;
									}
								}
							}
						}
					}
					if (this.aClass108Array1 != null) {
						for (local35 = 0; local35 < this.anInt1798; local35++) {
							local2588 = this.aClass108Array1[local35];
							local2593 = this.aClass232Array1[local35];
							local2593.anInt6891 = local2593.anInt6891 & 0xFFFFFF | 255 - (this.aByteArray23[local2588.anInt3575] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2847) Class232 local2847;
				if (arg0 == 8) {
					if (this.anIntArrayArray19 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (local35 < this.anIntArrayArray19.length) {
								local246 = this.anIntArrayArray19[local35];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2847 = this.aClass232Array1[local246[local248]];
									local2847.anInt6895 += arg2;
									local2847.anInt6900 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray19 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (local35 < this.anIntArrayArray19.length) {
								local246 = this.anIntArrayArray19[local35];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2847 = this.aClass232Array1[local246[local248]];
									local2847.anInt6904 = arg3 * local2847.anInt6904 >> 7;
									local2847.anInt6890 = local2847.anInt6890 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray19 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray19.length) {
							local246 = this.anIntArrayArray19[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2847 = this.aClass232Array1[local246[local248]];
								local2847.anInt6896 = arg2 + local2847.anInt6896 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray20 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray20.length) {
						local246 = this.anIntArrayArray20[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local53 = local246[local248];
							if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local53]) != 0) {
								local59 = this.aShortArray28[local53] & 0xFFFF;
								local384 = local59 >> 10 & 0x3F;
								local402 = local59 >> 7 & 0x7;
								@Pc(2693) int local2693 = arg2 + local384 & 0x3F;
								local634 = local59 & 0x7F;
								local402 += arg3 / 4;
								local634 += arg4;
								if (local402 < 0) {
									local402 = 0;
								} else if (local402 > 7) {
									local402 = 7;
								}
								if (local634 < 0) {
									local634 = 0;
								} else if (local634 > 127) {
									local634 = 127;
								}
								this.aShortArray28[local53] = (short) (local402 << 7 | local2693 << 10 | local634);
								if (this.aClass225_1 != null) {
									this.aClass225_1.anInterface5_7 = null;
								}
							}
						}
					}
				}
				if (this.aClass108Array1 != null) {
					for (local35 = 0; local35 < this.anInt1798; local35++) {
						local2588 = this.aClass108Array1[local35];
						local2593 = this.aClass232Array1[local35];
						local2593.anInt6891 = local2593.anInt6891 & 0xFF000000 | Static168.anIntArray264[this.aShortArray28[local2588.anInt3575] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray21.length > local35) {
					local246 = this.anIntArrayArray21[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local53 = local246[local248];
						if (this.aShortArray23 == null || (this.aShortArray23[local53] & arg6) != 0) {
							this.anIntArray156[local53] -= Static2.anInt58;
							this.anIntArray155[local53] -= Static310.anInt7038;
							this.anIntArray159[local53] -= Static406.anInt7056;
							this.anIntArray156[local53] = arg2 * this.anIntArray156[local53] >> 7;
							this.anIntArray155[local53] = this.anIntArray155[local53] * arg3 >> 7;
							this.anIntArray159[local53] = this.anIntArray159[local53] * arg4 >> 7;
							this.anIntArray156[local53] += Static2.anInt58;
							this.anIntArray155[local53] += Static310.anInt7038;
							this.anIntArray159[local53] += Static406.anInt7056;
						}
					}
				}
			}
		} else {
			local33 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local248 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static350.aBoolean442) {
				local384 = arg7[0] * Static2.anInt58 + arg7[3] * Static310.anInt7038 + Static406.anInt7056 * arg7[6] + 16384 >> 15;
				local402 = Static406.anInt7056 * arg7[7] + arg7[1] * Static2.anInt58 + arg7[4] * Static310.anInt7038 + 16384 >> 15;
				local384 += local248;
				local402 += local53;
				local634 = Static310.anInt7038 * arg7[5] + arg7[2] * Static2.anInt58 + arg7[8] * Static406.anInt7056 + 16384 >> 15;
				local634 += local59;
				Static310.anInt7038 = local402;
				Static2.anInt58 = local384;
				Static406.anInt7056 = local634;
				Static350.aBoolean442 = false;
			}
			local384 = arg2 << 15 >> 7;
			local402 = arg3 << 15 >> 7;
			local634 = arg4 << 15 >> 7;
			local643 = local384 * -Static2.anInt58 + 16384 >> 15;
			local653 = -Static310.anInt7038 * local402 + 16384 >> 15;
			local657 = local634 * -Static406.anInt7056 + 16384 >> 15;
			local675 = Static2.anInt58 + local643;
			local1020 = local653 + Static310.anInt7038;
			local1028 = Static406.anInt7056 + local657;
			@Pc(1880) int[] local1880 = new int[] { arg7[0] * local384 + 16384 >> 15, arg7[3] * local384 + 16384 >> 15, arg7[6] * local384 + 16384 >> 15, local402 * arg7[1] + 16384 >> 15, local402 * arg7[4] + 16384 >> 15, local402 * arg7[7] + 16384 >> 15, arg7[2] * local634 + 16384 >> 15, arg7[5] * local634 + 16384 >> 15, arg7[8] * local634 + 16384 >> 15 };
			local1185 = local248 * local384 + 16384 >> 15;
			local1210 = local53 * local402 + 16384 >> 15;
			@Pc(2008) int local2008 = local1185 + local675;
			@Pc(2012) int local2012 = local1210 + local1020;
			local1214 = local634 * local59 + 16384 >> 15;
			@Pc(2024) int local2024 = local1214 + local1028;
			@Pc(2027) int[] local2027 = new int[9];
			@Pc(2033) int local2033;
			for (local1223 = 0; local1223 < 3; local1223++) {
				for (local2033 = 0; local2033 < 3; local2033++) {
					local1228 = 0;
					for (local1232 = 0; local1232 < 3; local1232++) {
						local1228 += arg7[local1232 + local1223 * 3] * local1880[local1232 * 3 + local2033];
					}
					local2027[local1223 * 3 + local2033] = local1228 + 16384 >> 15;
				}
			}
			local2033 = local2008 * arg7[0] + arg7[1] * local2012 + arg7[2] * local2024 + 16384 >> 15;
			local1228 = local2012 * arg7[4] + arg7[3] * local2008 + local2024 * arg7[5] + 16384 >> 15;
			local1232 = arg7[8] * local2024 + local2012 * arg7[7] + arg7[6] * local2008 + 16384 >> 15;
			local1228 += local35;
			local2033 += local33;
			local1232 += local41;
			for (local1236 = 0; local1236 < local8; local1236++) {
				local1238 = arg1[local1236];
				if (this.anIntArrayArray21.length > local1238) {
					local1369 = this.anIntArrayArray21[local1238];
					for (local1371 = 0; local1371 < local1369.length; local1371++) {
						local1375 = local1369[local1371];
						if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local1375]) != 0) {
							local1379 = this.anIntArray155[local1375] * local2027[1] + this.anIntArray156[local1375] * local2027[0] + this.anIntArray159[local1375] * local2027[2] + 16384 >> 15;
							local1381 = local2027[5] * this.anIntArray159[local1375] + local2027[3] * this.anIntArray156[local1375] + local2027[4] * this.anIntArray155[local1375] + 16384 >> 15;
							local1512 = this.anIntArray155[local1375] * local2027[7] + local2027[6] * this.anIntArray156[local1375] + local2027[8] * this.anIntArray159[local1375] + 16384 >> 15;
							@Pc(2299) int local2299 = local1381 + local1228;
							@Pc(2303) int local2303 = local1379 + local2033;
							@Pc(2307) int local2307 = local1512 + local1232;
							this.anIntArray156[local1375] = local2303;
							this.anIntArray155[local1375] = local2299;
							this.anIntArray159[local1375] = local2307;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "X", descriptor = "()I")
	@Override
	public int X() {
		if (!this.aBoolean140) {
			this.method1454();
		}
		return this.aShort43;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!sf;I)V")
	private void method1453(@OriginalArg(0) Class106_Sub2 arg0) {
		@Pc(6) int local6;
		if (this.aClass209Array1 != null) {
			for (local6 = 0; local6 < this.aClass209Array1.length; local6++) {
				@Pc(13) Class209 local13 = this.aClass209Array1[local6];
				@Pc(15) Class209 local15 = local13;
				if (local13.aClass209_2 != null) {
					local15 = local13.aClass209_2;
				}
				local15.anInt6549 = (int) (arg0.aFloat82 * (float) this.anIntArray155[local13.anInt6545] + arg0.aFloat78 * (float) this.anIntArray156[local13.anInt6545] + arg0.aFloat79 * (float) this.anIntArray159[local13.anInt6545] + arg0.aFloat83);
				local15.anInt6551 = (int) (arg0.aFloat84 * (float) this.anIntArray159[local13.anInt6545] + (float) this.anIntArray156[local13.anInt6545] * arg0.aFloat87 + arg0.aFloat85 * (float) this.anIntArray155[local13.anInt6545] + arg0.aFloat86);
				local15.anInt6548 = (int) (arg0.aFloat76 + arg0.aFloat81 * (float) this.anIntArray156[local13.anInt6545] + arg0.aFloat77 * (float) this.anIntArray155[local13.anInt6545] + (float) this.anIntArray159[local13.anInt6545] * arg0.aFloat80);
				local15.anInt6554 = (int) (arg0.aFloat83 + (float) this.anIntArray159[local13.anInt6557] * arg0.aFloat79 + (float) this.anIntArray156[local13.anInt6557] * arg0.aFloat78 + (float) this.anIntArray155[local13.anInt6557] * arg0.aFloat82);
				local15.anInt6543 = (int) (arg0.aFloat86 + (float) this.anIntArray159[local13.anInt6557] * arg0.aFloat84 + arg0.aFloat85 * (float) this.anIntArray155[local13.anInt6557] + (float) this.anIntArray156[local13.anInt6557] * arg0.aFloat87);
				local15.anInt6547 = (int) ((float) this.anIntArray155[local13.anInt6557] * arg0.aFloat77 + (float) this.anIntArray156[local13.anInt6557] * arg0.aFloat81 + arg0.aFloat80 * (float) this.anIntArray159[local13.anInt6557] + arg0.aFloat76);
				local15.anInt6552 = (int) ((float) this.anIntArray156[local13.anInt6544] * arg0.aFloat78 + (float) this.anIntArray155[local13.anInt6544] * arg0.aFloat82 + arg0.aFloat79 * (float) this.anIntArray159[local13.anInt6544] + arg0.aFloat83);
				local15.anInt6559 = (int) (arg0.aFloat86 + arg0.aFloat85 * (float) this.anIntArray155[local13.anInt6544] + arg0.aFloat87 * (float) this.anIntArray156[local13.anInt6544] + (float) this.anIntArray159[local13.anInt6544] * arg0.aFloat84);
				local15.anInt6546 = (int) (arg0.aFloat80 * (float) this.anIntArray159[local13.anInt6544] + arg0.aFloat81 * (float) this.anIntArray156[local13.anInt6544] + arg0.aFloat77 * (float) this.anIntArray155[local13.anInt6544] + arg0.aFloat76);
			}
		}
		if (this.aClass178Array1 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass178Array1.length; local6++) {
			@Pc(365) Class178 local365 = this.aClass178Array1[local6];
			@Pc(367) Class178 local367 = local365;
			if (local365.aClass178_2 != null) {
				local367 = local365.aClass178_2;
			}
			if (local365.aClass106_4 == null) {
				local365.aClass106_4 = arg0.method5103();
			} else {
				local365.aClass106_4.ba(arg0);
			}
			local367.anInt5415 = (int) ((float) this.anIntArray156[local365.anInt5411] * arg0.aFloat78 + (float) this.anIntArray155[local365.anInt5411] * arg0.aFloat82 + (float) this.anIntArray159[local365.anInt5411] * arg0.aFloat79 + arg0.aFloat83);
			local367.anInt5410 = (int) (arg0.aFloat86 + arg0.aFloat85 * (float) this.anIntArray155[local365.anInt5411] + arg0.aFloat87 * (float) this.anIntArray156[local365.anInt5411] + (float) this.anIntArray159[local365.anInt5411] * arg0.aFloat84);
			local367.anInt5414 = (int) (arg0.aFloat76 + (float) this.anIntArray159[local365.anInt5411] * arg0.aFloat80 + arg0.aFloat77 * (float) this.anIntArray155[local365.anInt5411] + arg0.aFloat81 * (float) this.anIntArray156[local365.anInt5411]);
		}
	}

	@OriginalMember(owner = "client!du", name = "xa", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			Static406.anInt7056 = 0;
			Static310.anInt7038 = 0;
			local28 = 0;
			Static2.anInt58 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray21.length) {
					local48 = this.anIntArrayArray21[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static2.anInt58 += this.anIntArray156[local56];
						Static310.anInt7038 += this.anIntArray155[local56];
						Static406.anInt7056 += this.anIntArray159[local56];
						local28++;
					}
				}
			}
			if (local28 <= 0) {
				Static2.anInt58 = local14;
				Static310.anInt7038 = local18;
				Static406.anInt7056 = local22;
			} else {
				Static2.anInt58 = local14 + Static2.anInt58 / local28;
				Static406.anInt7056 = Static406.anInt7056 / local28 + local22;
				Static310.anInt7038 = local18 + Static310.anInt7038 / local28;
			}
			return;
		}
		@Pc(151) int[] local151;
		@Pc(153) int local153;
		if (arg0 == 1) {
			local18 = arg3 << 4;
			local14 = arg2 << 4;
			local22 = arg4 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray21.length) {
					local151 = this.anIntArrayArray21[local32];
					for (local153 = 0; local153 < local151.length; local153++) {
						local50 = local151[local153];
						this.anIntArray156[local50] += local14;
						this.anIntArray155[local50] += local18;
						this.anIntArray159[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(277) int local277;
		@Pc(295) int local295;
		@Pc(747) int local747;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray21.length > local32) {
					local151 = this.anIntArrayArray21[local32];
					if ((arg5 & 0x1) == 0) {
						for (local153 = 0; local153 < local151.length; local153++) {
							local50 = local151[local153];
							this.anIntArray156[local50] -= Static2.anInt58;
							this.anIntArray155[local50] -= Static310.anInt7038;
							this.anIntArray159[local50] -= Static406.anInt7056;
							if (arg4 != 0) {
								local56 = Applet_Sub1.anIntArray85[arg4];
								local277 = Applet_Sub1.anIntArray87[arg4];
								local295 = this.anIntArray156[local50] * local277 + local56 * this.anIntArray155[local50] + 32767 >> 15;
								this.anIntArray155[local50] = local277 * this.anIntArray155[local50] + 32767 - this.anIntArray156[local50] * local56 >> 15;
								this.anIntArray156[local50] = local295;
							}
							if (arg2 != 0) {
								local56 = Applet_Sub1.anIntArray85[arg2];
								local277 = Applet_Sub1.anIntArray87[arg2];
								local295 = this.anIntArray155[local50] * local277 + 32767 - this.anIntArray159[local50] * local56 >> 15;
								this.anIntArray159[local50] = this.anIntArray159[local50] * local277 + this.anIntArray155[local50] * local56 + 32767 >> 15;
								this.anIntArray155[local50] = local295;
							}
							if (arg3 != 0) {
								local56 = Applet_Sub1.anIntArray85[arg3];
								local277 = Applet_Sub1.anIntArray87[arg3];
								local295 = this.anIntArray159[local50] * local56 + this.anIntArray156[local50] * local277 + 32767 >> 15;
								this.anIntArray159[local50] = local277 * this.anIntArray159[local50] + 32767 - this.anIntArray156[local50] * local56 >> 15;
								this.anIntArray156[local50] = local295;
							}
							this.anIntArray156[local50] += Static2.anInt58;
							this.anIntArray155[local50] += Static310.anInt7038;
							this.anIntArray159[local50] += Static406.anInt7056;
						}
					} else {
						for (local153 = 0; local153 < local151.length; local153++) {
							local50 = local151[local153];
							this.anIntArray156[local50] -= Static2.anInt58;
							this.anIntArray155[local50] -= Static310.anInt7038;
							this.anIntArray159[local50] -= Static406.anInt7056;
							if (arg2 != 0) {
								local56 = Applet_Sub1.anIntArray85[arg2];
								local277 = Applet_Sub1.anIntArray87[arg2];
								local295 = this.anIntArray155[local50] * local277 + 32767 - this.anIntArray159[local50] * local56 >> 15;
								this.anIntArray159[local50] = this.anIntArray159[local50] * local277 + this.anIntArray155[local50] * local56 + 32767 >> 15;
								this.anIntArray155[local50] = local295;
							}
							if (arg4 != 0) {
								local56 = Applet_Sub1.anIntArray85[arg4];
								local277 = Applet_Sub1.anIntArray87[arg4];
								local295 = this.anIntArray156[local50] * local277 + local56 * this.anIntArray155[local50] + 32767 >> 15;
								this.anIntArray155[local50] = local277 * this.anIntArray155[local50] + 32767 - local56 * this.anIntArray156[local50] >> 15;
								this.anIntArray156[local50] = local295;
							}
							if (arg3 != 0) {
								local56 = Applet_Sub1.anIntArray85[arg3];
								local277 = Applet_Sub1.anIntArray87[arg3];
								local295 = local277 * this.anIntArray156[local50] + local56 * this.anIntArray159[local50] + 32767 >> 15;
								this.anIntArray159[local50] = this.anIntArray159[local50] * local277 + 32767 - this.anIntArray156[local50] * local56 >> 15;
								this.anIntArray156[local50] = local295;
							}
							this.anIntArray156[local50] += Static2.anInt58;
							this.anIntArray155[local50] += Static310.anInt7038;
							this.anIntArray159[local50] += Static406.anInt7056;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray21.length) {
						local48 = this.anIntArrayArray21[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local277 = this.anIntArray157[local56];
							local295 = this.anIntArray157[local56 + 1];
							for (local747 = local277; local747 < local295; local747++) {
								@Pc(756) int local756 = this.lb[local747] - 1;
								if (local756 == -1) {
									break;
								}
								@Pc(765) int local765;
								@Pc(769) int local769;
								@Pc(787) int local787;
								if (arg4 != 0) {
									local765 = Applet_Sub1.anIntArray85[arg4];
									local769 = Applet_Sub1.anIntArray87[arg4];
									local787 = local769 * this.aShortArray27[local756] + this.aShortArray22[local756] * local765 + 32767 >> 15;
									this.aShortArray22[local756] = (short) (this.aShortArray22[local756] * local769 + 32767 - local765 * this.aShortArray27[local756] >> 15);
									this.aShortArray27[local756] = (short) local787;
								}
								if (arg2 != 0) {
									local765 = Applet_Sub1.anIntArray85[arg2];
									local769 = Applet_Sub1.anIntArray87[arg2];
									local787 = local769 * this.aShortArray22[local756] + 32767 - this.aShortArray20[local756] * local765 >> 15;
									this.aShortArray20[local756] = (short) (local769 * this.aShortArray20[local756] + this.aShortArray22[local756] * local765 + 32767 >> 15);
									this.aShortArray22[local756] = (short) local787;
								}
								if (arg3 != 0) {
									local765 = Applet_Sub1.anIntArray85[arg3];
									local769 = Applet_Sub1.anIntArray87[arg3];
									local787 = local769 * this.aShortArray27[local756] + local765 * this.aShortArray20[local756] + 32767 >> 15;
									this.aShortArray20[local756] = (short) (local769 * this.aShortArray20[local756] + 32767 - this.aShortArray27[local756] * local765 >> 15);
									this.aShortArray27[local756] = (short) local787;
								}
							}
						}
					}
				}
				if (this.aClass225_4 == null && this.aClass225_1 != null) {
					this.aClass225_1.anInterface5_7 = null;
				}
				if (this.aClass225_4 != null) {
					this.aClass225_4.anInterface5_7 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray21.length > local32) {
					local151 = this.anIntArrayArray21[local32];
					for (local153 = 0; local153 < local151.length; local153++) {
						local50 = local151[local153];
						this.anIntArray156[local50] -= Static2.anInt58;
						this.anIntArray155[local50] -= Static310.anInt7038;
						this.anIntArray159[local50] -= Static406.anInt7056;
						this.anIntArray156[local50] = this.anIntArray156[local50] * arg2 >> 7;
						this.anIntArray155[local50] = arg3 * this.anIntArray155[local50] >> 7;
						this.anIntArray159[local50] = this.anIntArray159[local50] * arg4 >> 7;
						this.anIntArray156[local50] += Static2.anInt58;
						this.anIntArray155[local50] += Static310.anInt7038;
						this.anIntArray159[local50] += Static406.anInt7056;
					}
				}
			}
		} else {
			@Pc(1189) Class108 local1189;
			@Pc(1194) Class232 local1194;
			if (arg0 == 5) {
				if (this.anIntArrayArray20 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray20.length) {
							local151 = this.anIntArrayArray20[local32];
							for (local153 = 0; local153 < local151.length; local153++) {
								local50 = local151[local153];
								local56 = arg2 * 8 + (this.aByteArray23[local50] & 0xFF);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray23[local50] = (byte) local56;
							}
							if (local151.length > 0 && this.aClass225_1 != null) {
								this.aClass225_1.anInterface5_7 = null;
							}
						}
					}
					if (this.aClass108Array1 != null) {
						for (local32 = 0; local32 < this.anInt1798; local32++) {
							local1189 = this.aClass108Array1[local32];
							local1194 = this.aClass232Array1[local32];
							local1194.anInt6891 = local1194.anInt6891 & 0xFFFFFF | 255 - (this.aByteArray23[local1189.anInt3575] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1438) Class232 local1438;
				if (arg0 == 8) {
					if (this.anIntArrayArray19 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray19.length > local32) {
								local151 = this.anIntArrayArray19[local32];
								for (local153 = 0; local153 < local151.length; local153++) {
									local1438 = this.aClass232Array1[local151[local153]];
									local1438.anInt6900 += arg3;
									local1438.anInt6895 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray19 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray19.length > local32) {
								local151 = this.anIntArrayArray19[local32];
								for (local153 = 0; local153 < local151.length; local153++) {
									local1438 = this.aClass232Array1[local151[local153]];
									local1438.anInt6904 = arg3 * local1438.anInt6904 >> 7;
									local1438.anInt6890 = arg2 * local1438.anInt6890 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray19 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray19.length > local32) {
							local151 = this.anIntArrayArray19[local32];
							for (local153 = 0; local153 < local151.length; local153++) {
								local1438 = this.aClass232Array1[local151[local153]];
								local1438.anInt6896 = local1438.anInt6896 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray20 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray20.length > local32) {
						local151 = this.anIntArrayArray20[local32];
						for (local153 = 0; local153 < local151.length; local153++) {
							local50 = local151[local153];
							local56 = this.aShortArray28[local50] & 0xFFFF;
							local277 = local56 >> 10 & 0x3F;
							local295 = local56 >> 7 & 0x7;
							local295 += arg3 / 4;
							local747 = local56 & 0x7F;
							@Pc(1290) int local1290 = local277 + arg2 & 0x3F;
							local747 += arg4;
							if (local295 < 0) {
								local295 = 0;
							} else if (local295 > 7) {
								local295 = 7;
							}
							if (local747 < 0) {
								local747 = 0;
							} else if (local747 > 127) {
								local747 = 127;
							}
							this.aShortArray28[local50] = (short) (local747 | local295 << 7 | local1290 << 10);
						}
						if (local151.length > 0 && this.aClass225_1 != null) {
							this.aClass225_1.anInterface5_7 = null;
						}
					}
				}
				if (this.aClass108Array1 != null) {
					for (local32 = 0; local32 < this.anInt1798; local32++) {
						local1189 = this.aClass108Array1[local32];
						local1194 = this.aClass232Array1[local32];
						local1194.anInt6891 = local1194.anInt6891 & 0xFF000000 | Static168.anIntArray264[this.aShortArray28[local1189.anInt3575] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt1769; local3++) {
			local12 = this.aShortArray28[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg2 != -1) {
				local28 += arg3 * (arg2 - local28) >> 7;
			}
			this.aShortArray28[local3] = (short) (local28 | local24 << 7 | local18 << 10);
		}
		if (this.aClass108Array1 != null) {
			for (local12 = 0; local12 < this.anInt1798; local12++) {
				@Pc(106) Class108 local106 = this.aClass108Array1[local12];
				@Pc(111) Class232 local111 = this.aClass232Array1[local12];
				local111.anInt6891 = Static168.anIntArray264[this.aShortArray28[local106.anInt3575] & 0xFFFF] & 0xFFFFFF | local111.anInt6891 & 0xFF000000;
			}
		}
		if (this.aClass225_1 != null) {
			this.aClass225_1.anInterface5_7 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Applet_Sub1.anIntArray85[arg0];
		@Pc(13) int local13 = Applet_Sub1.anIntArray87[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1762; local15++) {
			@Pc(33) int local33 = this.anIntArray156[local15] * local13 + local9 * this.anIntArray159[local15] >> 15;
			this.anIntArray159[local15] = this.anIntArray159[local15] * local13 - local9 * this.anIntArray156[local15] >> 15;
			this.anIntArray156[local15] = local33;
		}
		this.aBoolean140 = false;
		if (this.aClass225_2 != null) {
			this.aClass225_2.anInterface5_7 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BIZ)Lclient!c;")
	@Override
	public Class31 method5710(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(26) Class31_Sub1 local26;
		@Pc(22) Class31_Sub1 local22;
		if (arg0 == 1) {
			local26 = this.aClass75_Sub2_10.aClass31_Sub1_1;
			local22 = this.aClass75_Sub2_10.aClass31_Sub1_5;
		} else if (arg0 == 2) {
			local26 = this.aClass75_Sub2_10.aClass31_Sub1_7;
			local22 = this.aClass75_Sub2_10.aClass31_Sub1_4;
		} else if (arg0 == 3) {
			local22 = this.aClass75_Sub2_10.aClass31_Sub1_8;
			local26 = this.aClass75_Sub2_10.aClass31_Sub1_3;
		} else if (arg0 == 4) {
			local26 = this.aClass75_Sub2_10.aClass31_Sub1_10;
			local22 = this.aClass75_Sub2_10.aClass31_Sub1_9;
		} else if (arg0 == 5) {
			local26 = this.aClass75_Sub2_10.aClass31_Sub1_2;
			local22 = this.aClass75_Sub2_10.aClass31_Sub1_6;
		} else {
			local26 = local22 = new Class31_Sub1(this.aClass75_Sub2_10);
		}
		return this.method1456(arg0 != 0, arg2, local26, arg1, local22);
	}

	@OriginalMember(owner = "client!du", name = "W", descriptor = "()V")
	@Override
	protected void W() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1793; local3++) {
			this.anIntArray156[local3] = this.anIntArray156[local3] + 7 >> 4;
			this.anIntArray155[local3] = this.anIntArray155[local3] + 7 >> 4;
			this.anIntArray159[local3] = this.anIntArray159[local3] + 7 >> 4;
		}
		this.aBoolean140 = false;
		if (this.aClass225_2 != null) {
			this.aClass225_2.anInterface5_7 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(B)V")
	private void method1454() {
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = 32767;
		@Pc(17) int local17 = 32767;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1762; local29++) {
			@Pc(36) int local36 = this.anIntArray156[local29];
			@Pc(41) int local41 = this.anIntArray155[local29];
			if (local13 > local36) {
				local13 = local36;
			}
			@Pc(51) int local51 = this.anIntArray159[local29];
			if (local41 > local21) {
				local21 = local41;
			}
			if (local36 > local19) {
				local19 = local36;
			}
			if (local41 < local15) {
				local15 = local41;
			}
			if (local51 < local17) {
				local17 = local51;
			}
			if (local23 < local51) {
				local23 = local51;
			}
			@Pc(88) int local88 = local51 * local51 + local36 * local36;
			if (local25 < local88) {
				local25 = local88;
			}
			local88 = local51 * local51 + local36 * local36 + local41 * local41;
			if (local88 > local27) {
				local27 = local88;
			}
		}
		this.aShort51 = (short) local23;
		this.aShort47 = (short) local13;
		this.aShort43 = (short) local17;
		this.aShort48 = (short) local15;
		this.aShort46 = (short) local21;
		this.aShort44 = (short) local19;
		this.aShort45 = (short) (Math.sqrt((double) local25) + 0.99D);
		Math.sqrt((double) local27);
		this.aBoolean140 = true;
	}

	@OriginalMember(owner = "client!du", name = "u", descriptor = "(I)V")
	@Override
	public void u(@OriginalArg(0) int arg0) {
		this.anInt1802 = arg0;
		if (this.aClass132_1 != null && (this.anInt1802 & 0x10000) == 0) {
			this.aByteArray22 = this.aClass132_1.aByteArray46;
			this.aShortArray27 = this.aClass132_1.aShortArray48;
			this.aShortArray20 = this.aClass132_1.aShortArray47;
			this.aShortArray22 = this.aClass132_1.aShortArray49;
			this.aClass132_1 = null;
		}
		this.aBoolean139 = true;
		this.method1447();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!cb;I)V")
	private void method1455(@OriginalArg(0) Class3_Sub3_Sub4_Sub1 arg0) {
		if (Static428.anIntArray515.length < this.anInt1761) {
			Static267.anIntArray387 = new int[this.anInt1761];
			Static428.anIntArray515 = new int[this.anInt1761];
		}
		@Pc(47) int local47;
		@Pc(86) int local86;
		@Pc(95) int local95;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1762; local20++) {
			local47 = (this.anIntArray156[local20] - (this.anIntArray155[local20] * this.aClass75_Sub2_10.anInt3113 >> 8) >> this.aClass75_Sub2_10.anInt3078) - arg0.anInt1144;
			@Pc(72) int local72 = (this.anIntArray159[local20] - (this.anIntArray155[local20] * this.aClass75_Sub2_10.anInt3118 >> 8) >> this.aClass75_Sub2_10.anInt3078) - arg0.anInt1135;
			@Pc(77) int local77 = this.anIntArray157[local20];
			@Pc(84) int local84 = this.anIntArray157[local20 + 1];
			for (local86 = local77; local86 < local84; local86++) {
				local95 = this.lb[local86] - 1;
				if (local95 == -1) {
					break;
				}
				Static428.anIntArray515[local95] = local47;
				Static267.anIntArray387[local95] = local72;
			}
		}
		for (local47 = 0; local47 < this.anInt1752; local47++) {
			if (this.aByteArray23 == null || this.aByteArray23[local47] <= 128) {
				@Pc(136) short local136 = this.aShortArray26[local47];
				@Pc(141) short local141 = this.aShortArray25[local47];
				@Pc(146) short local146 = this.aShortArray29[local47];
				local86 = Static428.anIntArray515[local136];
				local95 = Static428.anIntArray515[local141];
				@Pc(158) int local158 = Static428.anIntArray515[local146];
				@Pc(162) int local162 = Static267.anIntArray387[local136];
				@Pc(166) int local166 = Static267.anIntArray387[local141];
				@Pc(170) int local170 = Static267.anIntArray387[local146];
				if (-((local158 - local95) * (local166 - local162)) + (local86 - local95) * (local166 - local170) > 0) {
					arg0.method995(local166, local162, local86, local95, local170, local158);
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	@Override
	public void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) Class64 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean140) {
			this.method1454();
		}
		@Pc(16) int local16 = this.aShort47 + arg4;
		@Pc(21) int local21 = arg4 + this.aShort44;
		@Pc(26) int local26 = this.aShort43 + arg6;
		@Pc(31) int local31 = this.aShort51 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt7007 + local21 >> arg2.anInt7004 >= arg2.anInt7006 || local26 < 0 || arg2.anInt7005 <= arg2.anInt7007 + local31 >> arg2.anInt7004)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt7006 <= local21 + arg3.anInt7007 >> arg3.anInt7004 || local26 < 0 || arg3.anInt7005 <= arg3.anInt7007 + local31 >> arg3.anInt7004) {
				return;
			}
		} else {
			local16 >>= arg2.anInt7004;
			local21 = arg2.anInt7007 + local21 - 1 >> arg2.anInt7004;
			local26 >>= arg2.anInt7004;
			local31 = local31 + arg2.anInt7007 - 1 >> arg2.anInt7004;
			if (arg5 == arg2.I(local16, local26) && arg5 == arg2.I(local21, local26) && arg5 == arg2.I(local16, local31) && arg5 == arg2.I(local21, local31)) {
				return;
			}
		}
		@Pc(187) int local187;
		if (arg0 == 1) {
			for (local187 = 0; local187 < this.anInt1762; local187++) {
				this.anIntArray155[local187] += arg2.va(arg4 + this.anIntArray156[local187], this.anIntArray159[local187] - -arg6) - arg5;
			}
		} else {
			@Pc(246) int local246;
			@Pc(254) int local254;
			if (arg0 == 2) {
				@Pc(453) short local453 = this.aShort48;
				if (local453 == 0) {
					return;
				}
				for (local246 = 0; local246 < this.anInt1762; local246++) {
					local254 = (this.anIntArray155[local246] << 16) / local453;
					if (arg1 > local254) {
						this.anIntArray155[local246] -= -((arg1 - local254) * (arg2.va(this.anIntArray156[local246] - -arg4, arg6 + this.anIntArray159[local246]) - arg5) / arg1);
					}
				}
			} else {
				@Pc(262) int local262;
				if (arg0 == 3) {
					local187 = (arg1 & 0xFF) * 4;
					local246 = (arg1 >> 8 & 0xFF) * 4;
					local254 = (arg1 >> 16 & 0xFF) << 6;
					local262 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local187 >> 1) < 0 || arg2.anInt7006 << arg2.anInt7004 <= (local187 >> 1) + arg4 + arg2.anInt7007 || arg6 - (local246 >> 1) < 0 || (local246 >> 1) + arg6 + arg2.anInt7007 >= arg2.anInt7005 << arg2.anInt7004) {
						return;
					}
					this.method5712(local254, local262, local246, local187, arg5, arg6, arg4, arg2);
				} else if (arg0 == 4) {
					local187 = this.aShort46 - this.aShort48;
					for (local246 = 0; local246 < this.anInt1762; local246++) {
						this.anIntArray155[local246] = this.anIntArray155[local246] + arg3.va(this.anIntArray156[local246] + arg4, arg6 + this.anIntArray159[local246]) + local187 - arg5;
					}
				} else if (arg0 == 5) {
					local187 = this.aShort46 - this.aShort48;
					for (local246 = 0; local246 < this.anInt1762; local246++) {
						local254 = this.anIntArray156[local246] + arg4;
						local262 = this.anIntArray159[local246] + arg6;
						@Pc(360) int local360 = arg2.va(local254, local262);
						@Pc(365) int local365 = arg3.va(local254, local262);
						@Pc(370) int local370 = local360 - local365;
						this.anIntArray155[local246] = local360 + ((this.anIntArray155[local246] << 8) / local187 * local370 >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass225_2 != null) {
			this.aClass225_2.anInterface5_7 = null;
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "()[Lclient!ot;")
	@Override
	public Class178[] method5705() {
		return this.aClass178Array1;
	}

	@OriginalMember(owner = "client!du", name = "E", descriptor = "()I")
	@Override
	public int E() {
		if (!this.aBoolean140) {
			this.method1454();
		}
		return this.aShort46;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZZLclient!du;ILclient!du;B)Lclient!c;")
	private Class31 method1456(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class31_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class31_Sub1 arg4) {
		arg2.aShort49 = this.aShort49;
		arg2.anInt1802 = arg3;
		arg2.aShort50 = this.aShort50;
		arg2.anInt1798 = this.anInt1798;
		arg2.anInt1793 = this.anInt1793;
		arg2.anInt1762 = this.anInt1762;
		arg2.anInt1804 = this.anInt1804;
		arg2.anInt1752 = this.anInt1752;
		arg2.anInt1769 = this.anInt1769;
		arg2.aByte21 = 0;
		arg2.anInt1761 = this.anInt1761;
		@Pc(53) boolean local53 = Static12.method401(arg3, this.anInt1804);
		@Pc(59) boolean local59 = Static276.method4120(arg3, this.anInt1804);
		@Pc(65) boolean local65 = Static147.method2665(this.anInt1804, arg3);
		@Pc(71) boolean local71 = local53 | local59 | local65;
		@Pc(176) int local176;
		if (local71) {
			if (!local53) {
				arg2.anIntArray156 = this.anIntArray156;
			} else if (arg4.anIntArray156 == null || this.anInt1793 > arg4.anIntArray156.length) {
				arg2.anIntArray156 = arg4.anIntArray156 = new int[this.anInt1793];
			} else {
				arg2.anIntArray156 = arg4.anIntArray156;
			}
			if (!local59) {
				arg2.anIntArray155 = this.anIntArray155;
			} else if (arg4.anIntArray155 == null || this.anInt1793 > arg4.anIntArray155.length) {
				arg2.anIntArray155 = arg4.anIntArray155 = new int[this.anInt1793];
			} else {
				arg2.anIntArray155 = arg4.anIntArray155;
			}
			if (!local65) {
				arg2.anIntArray159 = this.anIntArray159;
			} else if (arg4.anIntArray159 == null || this.anInt1793 > arg4.anIntArray159.length) {
				arg2.anIntArray159 = arg4.anIntArray159 = new int[this.anInt1793];
			} else {
				arg2.anIntArray159 = arg4.anIntArray159;
			}
			for (local176 = 0; local176 < this.anInt1793; local176++) {
				if (local53) {
					arg2.anIntArray156[local176] = this.anIntArray156[local176];
				}
				if (local59) {
					arg2.anIntArray155[local176] = this.anIntArray155[local176];
				}
				if (local65) {
					arg2.anIntArray159[local176] = this.anIntArray159[local176];
				}
			}
		} else {
			arg2.anIntArray156 = this.anIntArray156;
			arg2.anIntArray159 = this.anIntArray159;
			arg2.anIntArray155 = this.anIntArray155;
		}
		if (Static247.method3788(arg3, this.anInt1804)) {
			if (arg0) {
				arg2.aByte21 = (byte) (arg2.aByte21 | 0x1);
			}
			arg2.aClass225_2 = arg4.aClass225_2;
			arg2.aClass225_2.anInterface5_7 = this.aClass225_2.anInterface5_7;
			arg2.aClass225_2.aByte96 = this.aClass225_2.aByte96;
		} else if (Static167.method5105(arg3, this.anInt1804)) {
			arg2.aClass225_2 = this.aClass225_2;
		} else {
			arg2.aClass225_2 = null;
		}
		if (Static320.method4653(arg3, this.anInt1804)) {
			if (arg4.aShortArray28 == null || arg4.aShortArray28.length < this.anInt1769) {
				arg2.aShortArray28 = arg4.aShortArray28 = new short[this.anInt1769];
			} else {
				arg2.aShortArray28 = arg4.aShortArray28;
			}
			for (local176 = 0; local176 < this.anInt1769; local176++) {
				arg2.aShortArray28[local176] = this.aShortArray28[local176];
			}
		} else {
			arg2.aShortArray28 = this.aShortArray28;
		}
		if (Static414.method5561(arg3, this.anInt1804)) {
			if (arg4.aByteArray23 == null || arg4.aByteArray23.length < this.anInt1769) {
				arg2.aByteArray23 = arg4.aByteArray23 = new byte[this.anInt1769];
			} else {
				arg2.aByteArray23 = arg4.aByteArray23;
			}
			for (local176 = 0; local176 < this.anInt1769; local176++) {
				arg2.aByteArray23[local176] = this.aByteArray23[local176];
			}
		} else {
			arg2.aByteArray23 = this.aByteArray23;
		}
		if (Static64.method1273(this.anInt1804, arg3)) {
			arg2.aClass225_1 = arg4.aClass225_1;
			if (arg0) {
				arg2.aByte21 = (byte) (arg2.aByte21 | 0x2);
			}
			arg2.aClass225_1.aByte96 = this.aClass225_1.aByte96;
			arg2.aClass225_1.anInterface5_7 = this.aClass225_1.anInterface5_7;
		} else if (Static413.method3224(arg3, this.anInt1804)) {
			arg2.aClass225_1 = this.aClass225_1;
		} else {
			arg2.aClass225_1 = null;
		}
		@Pc(586) int local586;
		if (Static79.method1403(this.anInt1804, arg3)) {
			if (arg4.aShortArray27 == null || arg4.aShortArray27.length < this.anInt1761) {
				local176 = this.anInt1761;
				arg2.aShortArray20 = arg4.aShortArray20 = new short[local176];
				arg2.aShortArray22 = arg4.aShortArray22 = new short[local176];
				arg2.aShortArray27 = arg4.aShortArray27 = new short[local176];
			} else {
				arg2.aShortArray27 = arg4.aShortArray27;
				arg2.aShortArray20 = arg4.aShortArray20;
				arg2.aShortArray22 = arg4.aShortArray22;
			}
			if (this.aClass132_1 == null) {
				for (local176 = 0; local176 < this.anInt1761; local176++) {
					arg2.aShortArray27[local176] = this.aShortArray27[local176];
					arg2.aShortArray22[local176] = this.aShortArray22[local176];
					arg2.aShortArray20[local176] = this.aShortArray20[local176];
				}
			} else {
				if (arg4.aClass132_1 == null) {
					arg4.aClass132_1 = new Class132();
				}
				@Pc(570) Class132 local570 = arg2.aClass132_1 = arg4.aClass132_1;
				if (local570.aShortArray48 == null || this.anInt1761 > local570.aShortArray48.length) {
					local586 = this.anInt1761;
					local570.aShortArray47 = new short[local586];
					local570.aByteArray46 = new byte[local586];
					local570.aShortArray48 = new short[local586];
					local570.aShortArray49 = new short[local586];
				}
				for (local586 = 0; local586 < this.anInt1761; local586++) {
					arg2.aShortArray27[local586] = this.aShortArray27[local586];
					arg2.aShortArray22[local586] = this.aShortArray22[local586];
					arg2.aShortArray20[local586] = this.aShortArray20[local586];
					local570.aShortArray48[local586] = this.aClass132_1.aShortArray48[local586];
					local570.aShortArray49[local586] = this.aClass132_1.aShortArray49[local586];
					local570.aShortArray47[local586] = this.aClass132_1.aShortArray47[local586];
					local570.aByteArray46[local586] = this.aClass132_1.aByteArray46[local586];
				}
			}
			arg2.aByteArray22 = this.aByteArray22;
		} else {
			arg2.aShortArray22 = this.aShortArray22;
			arg2.aByteArray22 = this.aByteArray22;
			arg2.aShortArray20 = this.aShortArray20;
			arg2.aShortArray27 = this.aShortArray27;
			arg2.aClass132_1 = this.aClass132_1;
		}
		if (Static215.method3448(this.anInt1804, arg3)) {
			arg2.aClass225_4 = arg4.aClass225_4;
			if (arg0) {
				arg2.aByte21 = (byte) (arg2.aByte21 | 0x4);
			}
			arg2.aClass225_4.aByte96 = this.aClass225_4.aByte96;
			arg2.aClass225_4.anInterface5_7 = this.aClass225_4.anInterface5_7;
		} else if (Static433.method5746(this.anInt1804, arg3)) {
			arg2.aClass225_4 = this.aClass225_4;
		} else {
			arg2.aClass225_4 = null;
		}
		if (Static152.method2705(this.anInt1804, arg3)) {
			if (arg4.aFloatArray13 == null || arg4.aFloatArray13.length < this.anInt1769) {
				local176 = this.anInt1761;
				arg2.aFloatArray12 = arg4.aFloatArray12 = new float[local176];
				arg2.aFloatArray13 = arg4.aFloatArray13 = new float[local176];
			} else {
				arg2.aFloatArray12 = arg4.aFloatArray12;
				arg2.aFloatArray13 = arg4.aFloatArray13;
			}
			for (local176 = 0; local176 < this.anInt1761; local176++) {
				arg2.aFloatArray13[local176] = this.aFloatArray13[local176];
				arg2.aFloatArray12[local176] = this.aFloatArray12[local176];
			}
		} else {
			arg2.aFloatArray13 = this.aFloatArray13;
			arg2.aFloatArray12 = this.aFloatArray12;
		}
		if (Static199.method3243(arg3, this.anInt1804)) {
			arg2.aClass225_3 = arg4.aClass225_3;
			if (arg0) {
				arg2.aByte21 = (byte) (arg2.aByte21 | 0x8);
			}
			arg2.aClass225_3.aByte96 = this.aClass225_3.aByte96;
			arg2.aClass225_3.anInterface5_7 = this.aClass225_3.anInterface5_7;
		} else if (Static129.method2234(arg3, this.anInt1804)) {
			arg2.aClass225_3 = this.aClass225_3;
		} else {
			arg2.aClass225_3 = null;
		}
		if (Static192.method3183(arg3, this.anInt1804)) {
			if (arg4.aShortArray26 == null || arg4.aShortArray26.length < this.anInt1769) {
				local176 = this.anInt1769;
				arg2.aShortArray26 = arg4.aShortArray26 = new short[local176];
				arg2.aShortArray29 = arg4.aShortArray29 = new short[local176];
				arg2.aShortArray25 = arg4.aShortArray25 = new short[local176];
			} else {
				arg2.aShortArray29 = arg4.aShortArray29;
				arg2.aShortArray26 = arg4.aShortArray26;
				arg2.aShortArray25 = arg4.aShortArray25;
			}
			for (local176 = 0; local176 < this.anInt1769; local176++) {
				arg2.aShortArray26[local176] = this.aShortArray26[local176];
				arg2.aShortArray25[local176] = this.aShortArray25[local176];
				arg2.aShortArray29[local176] = this.aShortArray29[local176];
			}
		} else {
			arg2.aShortArray25 = this.aShortArray25;
			arg2.aShortArray29 = this.aShortArray29;
			arg2.aShortArray26 = this.aShortArray26;
		}
		if (Static384.method5257(this.anInt1804, arg3)) {
			if (arg0) {
				arg2.aByte21 = (byte) (arg2.aByte21 | 0x10);
			}
			arg2.aClass269_1 = arg4.aClass269_1;
			arg2.aClass269_1.anInterface1_5 = this.aClass269_1.anInterface1_5;
		} else if (Static85.method5961(arg3, this.anInt1804)) {
			arg2.aClass269_1 = this.aClass269_1;
		} else {
			arg2.aClass269_1 = null;
		}
		if (Static348.method5826(arg3, this.anInt1804)) {
			if (arg4.aShortArray21 == null || arg4.aShortArray21.length < this.anInt1769) {
				local176 = this.anInt1769;
				arg2.aShortArray21 = arg4.aShortArray21 = new short[local176];
			} else {
				arg2.aShortArray21 = arg4.aShortArray21;
			}
			for (local176 = 0; local176 < this.anInt1769; local176++) {
				arg2.aShortArray21[local176] = this.aShortArray21[local176];
			}
		} else {
			arg2.aShortArray21 = this.aShortArray21;
		}
		if (!Static207.method3387(arg3, this.anInt1804)) {
			arg2.aClass232Array1 = this.aClass232Array1;
		} else if (arg4.aClass232Array1 == null || arg4.aClass232Array1.length < this.anInt1798) {
			local176 = this.anInt1798;
			arg2.aClass232Array1 = arg4.aClass232Array1 = new Class232[local176];
			for (local586 = 0; local586 < this.anInt1798; local586++) {
				arg2.aClass232Array1[local586] = this.aClass232Array1[local586].method5367();
			}
		} else {
			arg2.aClass232Array1 = arg4.aClass232Array1;
			for (local176 = 0; local176 < this.anInt1798; local176++) {
				arg2.aClass232Array1[local176].method5369(this.aClass232Array1[local176]);
			}
		}
		arg2.anIntArray158 = this.anIntArray158;
		if (this.aBoolean140) {
			arg2.aShort45 = this.aShort45;
			arg2.aShort47 = this.aShort47;
			arg2.aShort46 = this.aShort46;
			arg2.aShort44 = this.aShort44;
			arg2.aShort43 = this.aShort43;
			arg2.aShort51 = this.aShort51;
			arg2.aShort48 = this.aShort48;
			arg2.aBoolean140 = true;
		} else {
			arg2.aBoolean140 = false;
		}
		arg2.anIntArrayArray20 = this.anIntArrayArray20;
		arg2.anIntArray157 = this.anIntArray157;
		arg2.lb = this.lb;
		arg2.anIntArrayArray19 = this.anIntArrayArray19;
		arg2.anIntArrayArray21 = this.anIntArrayArray21;
		arg2.aClass209Array1 = this.aClass209Array1;
		arg2.aShortArray23 = this.aShortArray23;
		arg2.aClass108Array1 = this.aClass108Array1;
		arg2.aClass178Array1 = this.aClass178Array1;
		arg2.aShortArray24 = this.aShortArray24;
		return arg2;
	}

	@OriginalMember(owner = "client!du", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Applet_Sub1.anIntArray85[arg0];
		@Pc(13) int local13 = Applet_Sub1.anIntArray87[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1762; local15++) {
			local34 = this.anIntArray159[local15] * local9 + local13 * this.anIntArray156[local15] >> 15;
			this.anIntArray159[local15] = this.anIntArray159[local15] * local13 - local9 * this.anIntArray156[local15] >> 15;
			this.anIntArray156[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt1761; local34++) {
			@Pc(89) int local89 = local9 * this.aShortArray20[local34] + local13 * this.aShortArray27[local34] >> 15;
			this.aShortArray20[local34] = (short) (this.aShortArray20[local34] * local13 - local9 * this.aShortArray27[local34] >> 15);
			this.aShortArray27[local34] = (short) local89;
		}
		if (this.aClass225_4 == null && this.aClass225_1 != null) {
			this.aClass225_1.anInterface5_7 = null;
		}
		if (this.aClass225_4 != null) {
			this.aClass225_4.anInterface5_7 = null;
		}
		if (this.aClass225_2 != null) {
			this.aClass225_2.anInterface5_7 = null;
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!du", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.aShort50;
	}

	@OriginalMember(owner = "client!du", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Applet_Sub1.anIntArray85[arg0];
		@Pc(13) int local13 = Applet_Sub1.anIntArray87[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1762; local15++) {
			@Pc(33) int local33 = this.anIntArray155[local15] * local9 + this.anIntArray156[local15] * local13 >> 15;
			this.anIntArray155[local15] = local13 * this.anIntArray155[local15] - this.anIntArray156[local15] * local9 >> 15;
			this.anIntArray156[local15] = local33;
		}
		this.aBoolean140 = false;
		if (this.aClass225_2 != null) {
			this.aClass225_2.anInterface5_7 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(B)V")
	private void method1457() {
		if (this.anInt1752 == 0) {
			return;
		}
		if (this.aByte21 != 0) {
			this.method1446(true);
		}
		this.method1446(false);
		if (this.aClass269_1 != null) {
			if (this.aClass269_1.anInterface1_5 == null) {
				this.method1451((this.aByte21 & 0x10) != 0);
			}
			if (this.aClass269_1.anInterface1_5 != null) {
				this.aClass75_Sub2_10.method2482(this.aClass225_4 != null);
				this.aClass75_Sub2_10.method2473(this.aClass225_4, this.aClass225_2, this.aClass225_1, this.aClass225_3);
				@Pc(79) int local79 = this.anIntArray158.length - 1;
				for (@Pc(81) int local81 = 0; local81 < local79; local81++) {
					@Pc(88) int local88 = this.anIntArray158[local81];
					@Pc(95) int local95 = this.anIntArray158[local81 + 1];
					@Pc(102) int local102 = this.aShortArray21[local88] & 0xFFFF;
					if (local102 == 65535) {
						local102 = -1;
					}
					this.aClass75_Sub2_10.method2423(local102, this.aClass225_4 != null);
					this.aClass75_Sub2_10.method2454(local88 * 3, this.aClass269_1.anInterface1_5, (local95 - local88) * 3);
				}
			}
		}
		this.method1447();
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(I)V")
	private void method1458() {
		if (this.aClass108Array1 == null) {
			return;
		}
		@Pc(8) Class106_Sub2 local8 = this.aClass75_Sub2_10.aClass106_Sub2_2;
		@Pc(12) float local12 = this.aClass75_Sub2_10.w();
		@Pc(16) float local16 = this.aClass75_Sub2_10.la();
		this.aClass75_Sub2_10.method2446();
		this.aClass75_Sub2_10.method2572(false);
		this.aClass75_Sub2_10.method2482(false);
		this.aClass75_Sub2_10.method2473(null, this.aClass75_Sub2_10.aClass225_9, null, this.aClass75_Sub2_10.aClass225_10);
		for (@Pc(45) int local45 = 0; local45 < this.anInt1798; local45++) {
			@Pc(52) Class108 local52 = this.aClass108Array1[local45];
			@Pc(57) Class232 local57 = this.aClass232Array1[local45];
			if (!local52.aBoolean276 || !this.aClass75_Sub2_10.method2609()) {
				@Pc(85) float local85 = (float) (this.anIntArray156[local52.anInt3578] + this.anIntArray156[local52.anInt3577] + this.anIntArray156[local52.anInt3579]) * 0.3333333F;
				@Pc(106) float local106 = (float) (this.anIntArray155[local52.anInt3578] + this.anIntArray155[local52.anInt3577] + this.anIntArray155[local52.anInt3579]) * 0.3333333F;
				@Pc(128) float local128 = (float) (this.anIntArray159[local52.anInt3579] + this.anIntArray159[local52.anInt3577] + this.anIntArray159[local52.anInt3578]) * 0.3333333F;
				@Pc(142) float local142 = local128 * Static148.aFloat49 + local106 * Static329.aFloat73 + local85 * Static317.aFloat71 + Static158.aFloat50;
				@Pc(156) float local156 = local85 * Static274.aFloat67 + local106 * Static202.aFloat53 + local128 * Static77.aFloat21 + Static211.aFloat56;
				@Pc(170) float local170 = Static65.aFloat90 + Static11.aFloat2 * local85 + local106 * Static339.aFloat74 + local128 * Static291.aFloat68;
				local8.method5113((float) local57.anInt6900 - local156, local52.aShort105 * local57.anInt6890 >> 7, -local170, local57.anInt6904 * local52.aShort106 >> 7, (float) local57.anInt6895 + local142, local57.anInt6896);
				this.aClass75_Sub2_10.method2429(local8);
				this.aClass75_Sub2_10.o(local16, local12 - (float) local52.anInt3576 * 1.5F);
				@Pc(223) int local223 = local57.anInt6891;
				OpenGL.glColor4ub((byte) (local223 >> 16), (byte) (local223 >> 8), (byte) local223, (byte) (local223 >> 24));
				this.aClass75_Sub2_10.method2440(local52.aShort104);
				this.aClass75_Sub2_10.method2445(local52.aByte46);
				this.aClass75_Sub2_10.method2424(local52.aByte47);
				this.aClass75_Sub2_10.method2431(4);
			}
		}
		this.aClass75_Sub2_10.o(local16, local12);
		this.aClass75_Sub2_10.method2572(true);
		this.aClass75_Sub2_10.method2480();
	}

	@OriginalMember(owner = "client!du", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	@Override
	public Class3_Sub3_Sub4 ua(@OriginalArg(0) Class3_Sub3_Sub4 arg0) {
		if (this.anInt1761 == 0) {
			return null;
		}
		if (!this.aBoolean140) {
			this.method1454();
		}
		@Pc(39) int local39;
		@Pc(55) int local55;
		if (this.aClass75_Sub2_10.anInt3113 > 0) {
			local39 = this.aShort47 - (this.aShort46 * this.aClass75_Sub2_10.anInt3113 >> 8) >> this.aClass75_Sub2_10.anInt3078;
			local55 = this.aShort44 - (this.aClass75_Sub2_10.anInt3113 * this.aShort48 >> 8) >> this.aClass75_Sub2_10.anInt3078;
		} else {
			local39 = this.aShort47 - (this.aShort48 * this.aClass75_Sub2_10.anInt3113 >> 8) >> this.aClass75_Sub2_10.anInt3078;
			local55 = this.aShort44 - (this.aShort46 * this.aClass75_Sub2_10.anInt3113 >> 8) >> this.aClass75_Sub2_10.anInt3078;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass75_Sub2_10.anInt3118 <= 0) {
			local114 = this.aShort43 - (this.aShort48 * this.aClass75_Sub2_10.anInt3118 >> 8) >> this.aClass75_Sub2_10.anInt3078;
			local131 = this.aShort51 - (this.aShort46 * this.aClass75_Sub2_10.anInt3118 >> 8) >> this.aClass75_Sub2_10.anInt3078;
		} else {
			local114 = this.aShort43 - (this.aShort46 * this.aClass75_Sub2_10.anInt3118 >> 8) >> this.aClass75_Sub2_10.anInt3078;
			local131 = this.aShort51 - (this.aShort48 * this.aClass75_Sub2_10.anInt3118 >> 8) >> this.aClass75_Sub2_10.anInt3078;
		}
		@Pc(174) int local174 = local55 + 1 - local39;
		@Pc(180) int local180 = local131 + 1 - local114;
		@Pc(183) Class3_Sub3_Sub4_Sub1 local183 = (Class3_Sub3_Sub4_Sub1) arg0;
		@Pc(193) Class3_Sub3_Sub4_Sub1 local193;
		if (local183 != null && local183.method997(local180, local174)) {
			local193 = local183;
			local183.method998();
		} else {
			local193 = new Class3_Sub3_Sub4_Sub1(this.aClass75_Sub2_10, local174, local180);
		}
		local193.method1000(local131, local114, local55, local39);
		this.method1455(local193);
		return local193;
	}
}
