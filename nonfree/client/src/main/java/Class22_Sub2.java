import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!eca", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!eca", name = "q", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!eca", name = "u", descriptor = "[F")
	private float[] aFloatArray9;

	@OriginalMember(owner = "client!eca", name = "w", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!eca", name = "y", descriptor = "I")
	private int anInt1906;

	@OriginalMember(owner = "client!eca", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!eca", name = "E", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!eca", name = "K", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!eca", name = "N", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!eca", name = "P", descriptor = "[Lclient!jq;")
	private Class163[] aClass163Array3;

	@OriginalMember(owner = "client!eca", name = "R", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!eca", name = "ab", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!eca", name = "cb", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!eca", name = "jb", descriptor = "[F")
	private float[] aFloatArray10;

	@OriginalMember(owner = "client!eca", name = "lb", descriptor = "[[I")
	private int[][] lb;

	@OriginalMember(owner = "client!eca", name = "mb", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!eca", name = "rb", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!eca", name = "tb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!eca", name = "vb", descriptor = "[Lclient!qv;")
	private Class266[] aClass266Array1;

	@OriginalMember(owner = "client!eca", name = "xb", descriptor = "Lclient!fr;")
	private Class109 aClass109_1;

	@OriginalMember(owner = "client!eca", name = "yb", descriptor = "[Lclient!pp;")
	private Class250[] aClass250Array3;

	@OriginalMember(owner = "client!eca", name = "zb", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!eca", name = "Cb", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!eca", name = "Eb", descriptor = "[Lclient!vfa;")
	private Class329[] aClass329Array1;

	@OriginalMember(owner = "client!eca", name = "Gb", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!eca", name = "Jb", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!eca", name = "Kb", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!eca", name = "Lb", descriptor = "Lclient!av;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!eca", name = "Nb", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!eca", name = "Rb", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!eca", name = "Sb", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!eca", name = "Tb", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!eca", name = "Ub", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!eca", name = "Zb", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!eca", name = "dc", descriptor = "Lclient!rm;")
	private Interface19 anInterface19_2;

	@OriginalMember(owner = "client!eca", name = "ec", descriptor = "B")
	private byte aByte37;

	@OriginalMember(owner = "client!eca", name = "fc", descriptor = "I")
	private int anInt1952;

	@OriginalMember(owner = "client!eca", name = "hc", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!eca", name = "kc", descriptor = "S")
	private short aShort50;

	@OriginalMember(owner = "client!eca", name = "mc", descriptor = "S")
	private short aShort51;

	@OriginalMember(owner = "client!eca", name = "nc", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!eca", name = "oc", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!eca", name = "rc", descriptor = "I")
	private int anInt1959;

	@OriginalMember(owner = "client!eca", name = "Q", descriptor = "I")
	private int anInt1918 = 0;

	@OriginalMember(owner = "client!eca", name = "V", descriptor = "I")
	private int anInt1922 = 0;

	@OriginalMember(owner = "client!eca", name = "B", descriptor = "I")
	private int anInt1908 = 0;

	@OriginalMember(owner = "client!eca", name = "A", descriptor = "Z")
	private boolean aBoolean126 = true;

	@OriginalMember(owner = "client!eca", name = "X", descriptor = "I")
	private int anInt1924 = 0;

	@OriginalMember(owner = "client!eca", name = "eb", descriptor = "Z")
	private boolean aBoolean127 = false;

	@OriginalMember(owner = "client!eca", name = "W", descriptor = "I")
	private int anInt1923 = 0;

	@OriginalMember(owner = "client!eca", name = "Vb", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_11;

	@OriginalMember(owner = "client!eca", name = "cc", descriptor = "Lclient!cm;")
	private Class53 aClass53_7;

	@OriginalMember(owner = "client!eca", name = "Fb", descriptor = "Lclient!cm;")
	private Class53 aClass53_4;

	@OriginalMember(owner = "client!eca", name = "Xb", descriptor = "Lclient!cm;")
	private Class53 aClass53_6;

	@OriginalMember(owner = "client!eca", name = "Ib", descriptor = "Lclient!cm;")
	private Class53 aClass53_5;

	@OriginalMember(owner = "client!eca", name = "pb", descriptor = "Lclient!vaa;")
	private Class326 aClass326_1;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!pea;)V")
	public Class22_Sub2(@OriginalArg(0) Class121_Sub3 arg0) {
		this.aClass121_Sub3_11 = arg0;
		this.aClass53_7 = new Class53(null, 5126, 3, 0);
		this.aClass53_4 = new Class53(null, 5126, 2, 0);
		this.aClass53_6 = new Class53(null, 5126, 3, 0);
		this.aClass53_5 = new Class53(null, 5121, 4, 0);
		this.aClass326_1 = new Class326();
	}

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!pea;Lclient!rf;IIII)V")
	public Class22_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1906 = arg2;
		this.aClass121_Sub3_11 = arg0;
		this.anInt1952 = arg5;
		if (Static325.method5030(arg5, arg2)) {
			this.aClass53_7 = new Class53(null, 5126, 3, 0);
		}
		if (Static544.method7518(arg2, arg5)) {
			this.aClass53_4 = new Class53(null, 5126, 2, 0);
		}
		if (Static152.method2237(arg5, arg2)) {
			this.aClass53_6 = new Class53(null, 5126, 3, 0);
		}
		if (Static101.method1651(arg2, arg5)) {
			this.aClass53_5 = new Class53(null, 5121, 4, 0);
		}
		if (Static544.method7514(arg2, arg5)) {
			this.aClass326_1 = new Class326();
		}
		@Pc(102) Interface7 local102 = arg0.anInterface7_14;
		this.anIntArray263 = new int[arg1.anInt7662 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt7656];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt7656; local115++) {
			if ((arg1.aByteArray97 == null || arg1.aByteArray97[local115] != 2) && (arg1.aShortArray131 == null || arg1.aShortArray131[local115] == -1 || !local102.method5209(arg1.aShortArray131[local115] & 0xFFFF).aBoolean111)) {
				local113[this.anInt1922++] = local115;
				this.anIntArray263[arg1.aShortArray122[local115]]++;
				this.anIntArray263[arg1.aShortArray126[local115]]++;
				this.anIntArray263[arg1.aShortArray125[local115]]++;
			}
		}
		this.anInt1918 = this.anInt1922;
		@Pc(208) long[] local208 = new long[this.anInt1922];
		@Pc(217) boolean local217 = (this.anInt1906 & 0x100) != 0;
		@Pc(229) int local229;
		@Pc(240) int local240;
		@Pc(373) int local373;
		label497: for (@Pc(219) int local219 = 0; local219 < this.anInt1922; local219++) {
			@Pc(225) int local225 = local113[local219];
			@Pc(227) Class76 local227 = null;
			local229 = 0;
			@Pc(231) byte local231 = 0;
			@Pc(233) byte local233 = 0;
			@Pc(235) byte local235 = 0;
			if (arg1.aClass55Array1 != null) {
				for (local240 = 0; local240 < arg1.aClass55Array1.length; local240++) {
					@Pc(247) Class55 local247 = arg1.aClass55Array1[local240];
					if (local247.anInt1155 == local225) {
						@Pc(260) Class26 local260 = Static459.method6466(local247.anInt1150);
						if (local260.aBoolean17) {
							local208[local219] = Long.MAX_VALUE;
							this.anInt1918--;
							continue label497;
						}
					}
				}
			}
			@Pc(283) short local283 = -1;
			if (arg1.aShortArray131 != null) {
				local283 = arg1.aShortArray131[local225];
				if (local283 != -1) {
					local227 = local102.method5209(local283 & 0xFFFF);
					local233 = local227.aByte24;
					local235 = local227.aByte22;
				}
			}
			@Pc(335) boolean local335 = arg1.aByteArray101 != null && arg1.aByteArray101[local225] != 0 || local227 != null && !local227.aBoolean110 | local227.aBoolean113;
			if ((local217 || local335) && arg1.aByteArray100 != null) {
				local229 += arg1.aByteArray100[local225] << 17;
			}
			if (local335) {
				local229 += 65536;
			}
			local229 += (local233 & 0xFF) << 8;
			local373 = local231 + ((local283 & 0xFFFF) << 16);
			local229 += local235 & 0xFF;
			@Pc(385) int local385 = local373 + (local219 & 0xFFFF);
			local208[local219] = ((long) local229 << 32) + (long) local385;
		}
		Static517.method6761(local208, local113);
		this.aShortArray31 = arg1.aShortArray130;
		this.anIntArray266 = arg1.anIntArray612;
		this.anInt1924 = arg1.anInt7672;
		this.anInt1908 = arg1.anInt7662;
		this.anIntArray265 = arg1.anIntArray603;
		this.anIntArray264 = arg1.anIntArray605;
		@Pc(432) Class316[] local432 = new Class316[this.anInt1908];
		this.aClass250Array3 = arg1.aClass250Array7;
		this.aClass163Array3 = arg1.aClass163Array7;
		@Pc(460) int local460;
		@Pc(474) int local474;
		if (arg1.aClass55Array1 != null) {
			this.anInt1959 = arg1.aClass55Array1.length;
			this.aClass329Array1 = new Class329[this.anInt1959];
			this.aClass266Array1 = new Class266[this.anInt1959];
			for (local460 = 0; local460 < this.anInt1959; local460++) {
				@Pc(467) Class55 local467 = arg1.aClass55Array1[local460];
				@Pc(472) Class26 local472 = Static459.method6466(local467.anInt1150);
				local474 = -1;
				for (@Pc(476) int local476 = 0; local476 < this.anInt1922; local476++) {
					if (local113[local476] == local467.anInt1155) {
						local474 = local476;
						break;
					}
				}
				if (local474 == -1) {
					throw new RuntimeException();
				}
				local240 = Static101.anIntArray262[arg1.aShortArray127[local467.anInt1155] & 0xFFFF] & 0xFFFFFF;
				local240 |= 255 - (arg1.aByteArray101 == null ? 0 : arg1.aByteArray101[local467.anInt1155]) << 24;
				this.aClass266Array1[local460] = new Class266(local474, arg1.aShortArray122[local467.anInt1155], arg1.aShortArray126[local467.anInt1155], arg1.aShortArray125[local467.anInt1155], local472.anInt544, local472.anInt545, local472.anInt550, local472.anInt543, local472.anInt542, local472.aBoolean17, local472.aBoolean18, local467.anInt1153);
				this.aClass329Array1[local460] = new Class329(local240);
			}
		}
		local460 = this.anInt1922 * 3;
		this.aShortArray40 = new short[this.anInt1922];
		this.aFloatArray9 = new float[local460];
		this.aByteArray33 = new byte[local460];
		this.aShortArray34 = new short[local460];
		this.aShortArray33 = new short[this.anInt1922];
		this.aShortArray36 = new short[this.anInt1922];
		this.aShortArray38 = new short[local460];
		this.aShortArray41 = new short[this.anInt1922];
		Static486.aLongArray13 = new long[local460];
		this.aShort49 = (short) arg4;
		this.aShortArray37 = new short[local460];
		this.aShort51 = (short) arg3;
		this.aShortArray35 = new short[local460];
		this.aByteArray32 = new byte[this.anInt1922];
		if (arg1.aShortArray128 != null) {
			this.aShortArray32 = new short[this.anInt1922];
		}
		this.aShortArray39 = new short[this.anInt1922];
		this.aFloatArray10 = new float[local460];
		local229 = 0;
		for (local373 = 0; local373 < arg1.anInt7662; local373++) {
			local474 = this.anIntArray263[local373];
			this.anIntArray263[local373] = local229;
			local432[local373] = new Class316();
			local229 += local474;
		}
		this.anIntArray263[arg1.anInt7662] = local229;
		@Pc(711) int[] local711 = null;
		@Pc(713) int[] local713 = null;
		@Pc(715) int[] local715 = null;
		@Pc(717) float[][] local717 = null;
		@Pc(743) int local743;
		@Pc(775) int local775;
		@Pc(781) int local781;
		@Pc(795) int local795;
		@Pc(797) int local797;
		@Pc(833) int local833;
		@Pc(838) int local838;
		@Pc(996) float local996;
		@Pc(1004) float local1004;
		@Pc(1012) float local1012;
		if (arg1.aByteArray102 != null) {
			@Pc(723) int local723 = arg1.anInt7653;
			@Pc(726) int[] local726 = new int[local723];
			@Pc(729) int[] local729 = new int[local723];
			@Pc(732) int[] local732 = new int[local723];
			@Pc(735) int[] local735 = new int[local723];
			@Pc(738) int[] local738 = new int[local723];
			@Pc(741) int[] local741 = new int[local723];
			for (local743 = 0; local743 < local723; local743++) {
				local726[local743] = Integer.MAX_VALUE;
				local729[local743] = -2147483647;
				local732[local743] = Integer.MAX_VALUE;
				local735[local743] = -2147483647;
				local738[local743] = Integer.MAX_VALUE;
				local741[local743] = -2147483647;
			}
			for (local775 = 0; local775 < this.anInt1922; local775++) {
				local781 = local113[local775];
				if (arg1.aByteArray102[local781] != -1) {
					local795 = arg1.aByteArray102[local781] & 0xFF;
					for (local797 = 0; local797 < 3; local797++) {
						@Pc(814) short local814;
						if (local797 == 0) {
							local814 = arg1.aShortArray122[local781];
						} else if (local797 == 1) {
							local814 = arg1.aShortArray126[local781];
						} else {
							local814 = arg1.aShortArray125[local781];
						}
						local833 = arg1.anIntArray612[local814];
						local838 = arg1.anIntArray603[local814];
						@Pc(843) int local843 = arg1.anIntArray605[local814];
						if (local726[local795] > local833) {
							local726[local795] = local833;
						}
						if (local833 > local729[local795]) {
							local729[local795] = local833;
						}
						if (local732[local795] > local838) {
							local732[local795] = local838;
						}
						if (local735[local795] < local838) {
							local735[local795] = local838;
						}
						if (local843 < local738[local795]) {
							local738[local795] = local843;
						}
						if (local843 > local741[local795]) {
							local741[local795] = local843;
						}
					}
				}
			}
			local711 = new int[local723];
			local713 = new int[local723];
			local717 = new float[local723][];
			local715 = new int[local723];
			for (local781 = 0; local781 < local723; local781++) {
				@Pc(941) byte local941 = arg1.aByteArray99[local781];
				if (local941 > 0) {
					local711[local781] = (local726[local781] + local729[local781]) / 2;
					local713[local781] = (local735[local781] + local732[local781]) / 2;
					local715[local781] = (local741[local781] + local738[local781]) / 2;
					if (local941 == 1) {
						local838 = arg1.anIntArray610[local781];
						if (local838 == 0) {
							local996 = 1.0F;
							local1004 = 1.0F;
						} else if (local838 > 0) {
							local996 = 1.0F;
							local1004 = (float) local838 / 1024.0F;
						} else {
							local1004 = 1.0F;
							local996 = (float) -local838 / 1024.0F;
						}
						local1012 = 64.0F / (float) arg1.anIntArray611[local781];
					} else if (local941 == 2) {
						local996 = 64.0F / (float) arg1.anIntArray610[local781];
						local1004 = 64.0F / (float) arg1.anIntArray606[local781];
						local1012 = 64.0F / (float) arg1.anIntArray611[local781];
					} else {
						local996 = (float) arg1.anIntArray610[local781] / 1024.0F;
						local1004 = (float) arg1.anIntArray606[local781] / 1024.0F;
						local1012 = (float) arg1.anIntArray611[local781] / 1024.0F;
					}
					local717[local781] = Static146.method2178(local1012, local1004, arg1.aShortArray124[local781], local996, arg1.aByteArray98[local781] & 0xFF, arg1.aShortArray129[local781], arg1.aShortArray123[local781]);
				}
			}
		}
		@Pc(1121) Class303[] local1121 = new Class303[arg1.anInt7656];
		@Pc(1140) short local1140;
		@Pc(1151) int local1151;
		@Pc(1161) int local1161;
		@Pc(1222) int local1222;
		for (@Pc(1123) int local1123 = 0; local1123 < arg1.anInt7656; local1123++) {
			@Pc(1130) short local1130 = arg1.aShortArray122[local1123];
			@Pc(1135) short local1135 = arg1.aShortArray126[local1123];
			local1140 = arg1.aShortArray125[local1123];
			local1151 = this.anIntArray266[local1135] - this.anIntArray266[local1130];
			local1161 = this.anIntArray265[local1135] - this.anIntArray265[local1130];
			local743 = this.anIntArray264[local1135] - this.anIntArray264[local1130];
			local775 = this.anIntArray266[local1140] - this.anIntArray266[local1130];
			local781 = this.anIntArray265[local1140] - this.anIntArray265[local1130];
			local795 = this.anIntArray264[local1140] - this.anIntArray264[local1130];
			local797 = local1161 * local795 - local781 * local743;
			local1222 = local743 * local775 - local795 * local1151;
			local833 = local1151 * local781 - local1161 * local775;
			while (local797 > 8192 || local1222 > 8192 || local833 > 8192 || local797 < -8192 || local1222 < -8192 || local833 < -8192) {
				local797 >>= 0x1;
				local833 >>= 0x1;
				local1222 >>= 0x1;
			}
			local838 = (int) Math.sqrt((double) (local833 * local833 + local797 * local797 + local1222 * local1222));
			if (local838 <= 0) {
				local838 = 1;
			}
			local797 = local797 * 256 / local838;
			local1222 = local1222 * 256 / local838;
			local833 = local833 * 256 / local838;
			@Pc(1316) byte local1316 = arg1.aByteArray97 == null ? 0 : arg1.aByteArray97[local1123];
			if (local1316 == 0) {
				@Pc(1344) Class316 local1344 = local432[local1130];
				local1344.anInt8680++;
				local1344.anInt8678 += local1222;
				local1344.anInt8677 += local833;
				local1344.anInt8676 += local797;
				@Pc(1372) Class316 local1372 = local432[local1135];
				local1372.anInt8680++;
				local1372.anInt8677 += local833;
				local1372.anInt8676 += local797;
				local1372.anInt8678 += local1222;
				@Pc(1400) Class316 local1400 = local432[local1140];
				local1400.anInt8678 += local1222;
				local1400.anInt8677 += local833;
				local1400.anInt8676 += local797;
				local1400.anInt8680++;
			} else if (local1316 == 1) {
				@Pc(1329) Class303 local1329 = local1121[local1123] = new Class303();
				local1329.anInt8130 = local1222;
				local1329.anInt8127 = local833;
				local1329.anInt8131 = local797;
			}
		}
		@Pc(1437) int local1437;
		for (@Pc(1431) int local1431 = 0; local1431 < this.anInt1922; local1431++) {
			local1437 = local113[local1431];
			@Pc(1444) int local1444 = arg1.aShortArray127[local1437] & 0xFFFF;
			@Pc(1452) short local1452;
			if (arg1.aShortArray131 == null) {
				local1452 = -1;
			} else {
				local1452 = arg1.aShortArray131[local1437];
			}
			if (arg1.aByteArray102 == null) {
				local1161 = -1;
			} else {
				local1161 = arg1.aByteArray102[local1437];
			}
			if (arg1.aByteArray101 == null) {
				local743 = 0;
			} else {
				local743 = arg1.aByteArray101[local1437] & 0xFF;
			}
			@Pc(1484) float local1484 = 0.0F;
			@Pc(1486) float local1486 = 0.0F;
			@Pc(1488) float local1488 = 0.0F;
			local996 = 0.0F;
			local1012 = 0.0F;
			local1004 = 0.0F;
			@Pc(1496) byte local1496 = 0;
			@Pc(1498) byte local1498 = 0;
			@Pc(1500) int local1500 = 0;
			@Pc(1534) byte local1534;
			@Pc(1554) short local1554;
			@Pc(1559) short local1559;
			@Pc(1564) short local1564;
			if (local1452 != -1) {
				if (local1161 == -1) {
					local1012 = 0.0F;
					local1484 = 0.0F;
					local996 = 1.0F;
					local1486 = 1.0F;
					local1004 = 0.0F;
					local1498 = 2;
					local1496 = 1;
					local1488 = 1.0F;
				} else {
					local1161 &= 0xFF;
					local1534 = arg1.aByteArray99[local1161];
					@Pc(1544) short local1544;
					@Pc(1549) short local1549;
					@Pc(1587) float local1587;
					@Pc(1596) float local1596;
					@Pc(1604) float local1604;
					@Pc(1689) float local1689;
					@Pc(1698) float local1698;
					@Pc(1706) float local1706;
					@Pc(1714) float local1714;
					@Pc(1723) float local1723;
					@Pc(1732) float local1732;
					if (local1534 == 0) {
						local1544 = arg1.aShortArray122[local1437];
						local1549 = arg1.aShortArray126[local1437];
						local1554 = arg1.aShortArray125[local1437];
						local1559 = arg1.aShortArray123[local1161];
						local1564 = arg1.aShortArray129[local1161];
						@Pc(1569) short local1569 = arg1.aShortArray124[local1161];
						@Pc(1575) float local1575 = (float) arg1.anIntArray612[local1559];
						@Pc(1581) float local1581 = (float) arg1.anIntArray603[local1559];
						local1587 = arg1.anIntArray605[local1559];
						local1596 = (float) arg1.anIntArray612[local1564] - local1575;
						local1604 = (float) arg1.anIntArray603[local1564] - local1581;
						@Pc(1612) float local1612 = (float) arg1.anIntArray605[local1564] - local1587;
						@Pc(1621) float local1621 = (float) arg1.anIntArray612[local1569] - local1575;
						@Pc(1630) float local1630 = (float) arg1.anIntArray603[local1569] - local1581;
						@Pc(1638) float local1638 = (float) arg1.anIntArray605[local1569] - local1587;
						@Pc(1646) float local1646 = (float) arg1.anIntArray612[local1544] - local1575;
						@Pc(1655) float local1655 = (float) arg1.anIntArray603[local1544] - local1581;
						@Pc(1663) float local1663 = (float) arg1.anIntArray605[local1544] - local1587;
						@Pc(1672) float local1672 = (float) arg1.anIntArray612[local1549] - local1575;
						@Pc(1681) float local1681 = (float) arg1.anIntArray603[local1549] - local1581;
						local1689 = (float) arg1.anIntArray605[local1549] - local1587;
						local1698 = (float) arg1.anIntArray612[local1554] - local1575;
						local1706 = (float) arg1.anIntArray603[local1554] - local1581;
						local1714 = (float) arg1.anIntArray605[local1554] - local1587;
						local1723 = local1638 * local1604 - local1612 * local1630;
						local1732 = local1612 * local1621 - local1638 * local1596;
						@Pc(1741) float local1741 = local1630 * local1596 - local1621 * local1604;
						@Pc(1750) float local1750 = local1630 * local1741 - local1732 * local1638;
						@Pc(1758) float local1758 = local1723 * local1638 - local1621 * local1741;
						@Pc(1767) float local1767 = local1621 * local1732 - local1630 * local1723;
						@Pc(1781) float local1781 = 1.0F / (local1767 * local1612 + local1604 * local1758 + local1750 * local1596);
						local1484 = (local1663 * local1767 + local1758 * local1655 + local1750 * local1646) * local1781;
						local1488 = (local1672 * local1750 + local1758 * local1681 + local1689 * local1767) * local1781;
						local1012 = (local1714 * local1767 + local1698 * local1750 + local1758 * local1706) * local1781;
						@Pc(1832) float local1832 = local1596 * local1732 - local1723 * local1604;
						@Pc(1840) float local1840 = local1612 * local1723 - local1596 * local1741;
						@Pc(1848) float local1848 = local1604 * local1741 - local1732 * local1612;
						@Pc(1862) float local1862 = 1.0F / (local1848 * local1621 + local1840 * local1630 + local1832 * local1638);
						local1486 = local1862 * (local1663 * local1832 + local1848 * local1646 + local1655 * local1840);
						local1004 = local1862 * (local1706 * local1840 + local1848 * local1698 + local1714 * local1832);
						local996 = local1862 * (local1832 * local1689 + local1672 * local1848 + local1681 * local1840);
					} else {
						local1544 = arg1.aShortArray122[local1437];
						local1549 = arg1.aShortArray126[local1437];
						local1554 = arg1.aShortArray125[local1437];
						@Pc(1925) int local1925 = local711[local1161];
						@Pc(1929) int local1929 = local713[local1161];
						@Pc(1933) int local1933 = local715[local1161];
						@Pc(1937) float[] local1937 = local717[local1161];
						@Pc(1942) byte local1942 = arg1.aByteArray103[local1161];
						local1587 = (float) arg1.anIntArray607[local1161] / 256.0F;
						if (local1534 == 1) {
							local1596 = (float) arg1.anIntArray606[local1161] / 1024.0F;
							Static549.method7572(local1596, arg1.anIntArray612[local1544], local1933, local1929, local1925, arg1.anIntArray605[local1544], arg1.anIntArray603[local1544], local1937, local1587, local1942);
							local1486 = Static353.aFloat139;
							local1484 = Static108.aFloat19;
							Static549.method7572(local1596, arg1.anIntArray612[local1549], local1933, local1929, local1925, arg1.anIntArray605[local1549], arg1.anIntArray603[local1549], local1937, local1587, local1942);
							local1488 = Static108.aFloat19;
							local996 = Static353.aFloat139;
							Static549.method7572(local1596, arg1.anIntArray612[local1554], local1933, local1929, local1925, arg1.anIntArray605[local1554], arg1.anIntArray603[local1554], local1937, local1587, local1942);
							local1004 = Static353.aFloat139;
							local1012 = Static108.aFloat19;
							local1604 = local1596 / 2.0F;
							if ((local1942 & 0x1) == 0) {
								if (local1604 < local1012 - local1484) {
									local1498 = 1;
									local1012 -= local1596;
								} else if (local1484 - local1012 > local1604) {
									local1498 = 2;
									local1012 += local1596;
								}
								if (local1604 < local1488 - local1484) {
									local1496 = 1;
									local1488 -= local1596;
								} else if (local1604 < local1484 - local1488) {
									local1488 += local1596;
									local1496 = 2;
								}
							} else {
								if (local996 - local1486 > local1604) {
									local996 -= local1596;
									local1496 = 1;
								} else if (local1486 - local996 > local1604) {
									local996 += local1596;
									local1496 = 2;
								}
								if (local1004 - local1486 > local1604) {
									local1498 = 1;
									local1004 -= local1596;
								} else if (local1486 - local1004 > local1604) {
									local1004 += local1596;
									local1498 = 2;
								}
							}
						} else if (local1534 == 2) {
							local1596 = (float) arg1.anIntArray613[local1161] / 256.0F;
							local1604 = (float) arg1.anIntArray604[local1161] / 256.0F;
							@Pc(2189) int local2189 = arg1.anIntArray612[local1549] - arg1.anIntArray612[local1544];
							@Pc(2200) int local2200 = arg1.anIntArray603[local1549] - arg1.anIntArray603[local1544];
							@Pc(2211) int local2211 = arg1.anIntArray605[local1549] - arg1.anIntArray605[local1544];
							@Pc(2221) int local2221 = arg1.anIntArray612[local1554] - arg1.anIntArray612[local1544];
							@Pc(2232) int local2232 = arg1.anIntArray603[local1554] - arg1.anIntArray603[local1544];
							@Pc(2242) int local2242 = arg1.anIntArray605[local1554] - arg1.anIntArray605[local1544];
							@Pc(2250) int local2250 = local2242 * local2200 - local2211 * local2232;
							@Pc(2258) int local2258 = local2211 * local2221 - local2242 * local2189;
							@Pc(2267) int local2267 = local2232 * local2189 - local2200 * local2221;
							local1689 = 64.0F / (float) arg1.anIntArray610[local1161];
							local1698 = 64.0F / (float) arg1.anIntArray611[local1161];
							local1706 = 64.0F / (float) arg1.anIntArray606[local1161];
							local1714 = (local1937[0] * (float) local2250 + local1937[1] * (float) local2258 + local1937[2] * (float) local2267) / local1689;
							local1723 = ((float) local2267 * local1937[5] + local1937[4] * (float) local2258 + local1937[3] * (float) local2250) / local1698;
							local1732 = ((float) local2258 * local1937[7] + local1937[6] * (float) local2250 + local1937[8] * (float) local2267) / local1706;
							local1500 = Static23.method301(local1714, local1723, local1732);
							Static86.method5986(local1587, local1596, arg1.anIntArray612[local1544], local1937, local1925, local1604, local1929, local1933, arg1.anIntArray605[local1544], local1500, local1942, arg1.anIntArray603[local1544]);
							local1484 = Static362.aFloat141;
							local1486 = Static403.aFloat204;
							Static86.method5986(local1587, local1596, arg1.anIntArray612[local1549], local1937, local1925, local1604, local1929, local1933, arg1.anIntArray605[local1549], local1500, local1942, arg1.anIntArray603[local1549]);
							local1488 = Static362.aFloat141;
							local996 = Static403.aFloat204;
							Static86.method5986(local1587, local1596, arg1.anIntArray612[local1554], local1937, local1925, local1604, local1929, local1933, arg1.anIntArray605[local1554], local1500, local1942, arg1.anIntArray603[local1554]);
							local1004 = Static403.aFloat204;
							local1012 = Static362.aFloat141;
						} else if (local1534 == 3) {
							Static120.method1812(arg1.anIntArray603[local1544], local1929, arg1.anIntArray612[local1544], local1925, local1937, local1942, arg1.anIntArray605[local1544], local1587, local1933);
							local1486 = Static173.aFloat44;
							local1484 = Static304.aFloat127;
							Static120.method1812(arg1.anIntArray603[local1549], local1929, arg1.anIntArray612[local1549], local1925, local1937, local1942, arg1.anIntArray605[local1549], local1587, local1933);
							local1488 = Static304.aFloat127;
							local996 = Static173.aFloat44;
							Static120.method1812(arg1.anIntArray603[local1554], local1929, arg1.anIntArray612[local1554], local1925, local1937, local1942, arg1.anIntArray605[local1554], local1587, local1933);
							local1004 = Static173.aFloat44;
							local1012 = Static304.aFloat127;
							if ((local1942 & 0x1) == 0) {
								if (local1488 - local1484 > 0.5F) {
									local1496 = 1;
									local1488--;
								} else if (local1484 - local1488 > 0.5F) {
									local1488++;
									local1496 = 2;
								}
								if (local1012 - local1484 > 0.5F) {
									local1012--;
									local1498 = 1;
								} else if (local1484 - local1012 > 0.5F) {
									local1498 = 2;
									local1012++;
								}
							} else {
								if (local1004 - local1486 > 0.5F) {
									local1498 = 1;
									local1004--;
								} else if (local1486 - local1004 > 0.5F) {
									local1498 = 2;
									local1004++;
								}
								if (local996 - local1486 > 0.5F) {
									local1496 = 1;
									local996--;
								} else if (local1486 - local996 > 0.5F) {
									local996++;
									local1496 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray97 == null) {
				local1534 = 0;
			} else {
				local1534 = arg1.aByteArray97[local1437];
			}
			if (local1534 == 0) {
				@Pc(2677) long local2677 = ((long) (local1500 << 24) + (long) (local1444 << 8) + (long) local743 << 32) + (long) (local1161 << 2);
				local1554 = arg1.aShortArray122[local1437];
				local1559 = arg1.aShortArray126[local1437];
				local1564 = arg1.aShortArray125[local1437];
				@Pc(2696) Class316 local2696 = local432[local1554];
				this.aShortArray40[local1431] = this.method1689(local2677, local2696.anInt8677, local1486, local2696.anInt8680, local2696.anInt8676, arg1, local1554, local2696.anInt8678, local1484);
				@Pc(2720) Class316 local2720 = local432[local1559];
				this.aShortArray33[local1431] = this.method1689((long) local1496 + local2677, local2720.anInt8677, local996, local2720.anInt8680, local2720.anInt8676, arg1, local1559, local2720.anInt8678, local1488);
				@Pc(2747) Class316 local2747 = local432[local1564];
				this.aShortArray41[local1431] = this.method1689(local2677 + (long) local1498, local2747.anInt8677, local1004, local2747.anInt8680, local2747.anInt8676, arg1, local1564, local2747.anInt8678, local1012);
			} else if (local1534 == 1) {
				@Pc(2781) Class303 local2781 = local1121[local1437];
				@Pc(2825) long local2825 = (long) ((local2781.anInt8127 + 256 << 22) + (local2781.anInt8130 + 256 << 12) + (local2781.anInt8131 <= 0 ? 2048 : 1024) + (local1161 << 2)) + ((long) local743 + (long) (local1444 << 8) + (long) (local1500 << 24) << 32);
				this.aShortArray40[local1431] = this.method1689(local2825, local2781.anInt8127, local1486, 0, local2781.anInt8131, arg1, arg1.aShortArray122[local1437], local2781.anInt8130, local1484);
				this.aShortArray33[local1431] = this.method1689(local2825 + (long) local1496, local2781.anInt8127, local996, 0, local2781.anInt8131, arg1, arg1.aShortArray126[local1437], local2781.anInt8130, local1488);
				this.aShortArray41[local1431] = this.method1689(local2825 + (long) local1498, local2781.anInt8127, local1004, 0, local2781.anInt8131, arg1, arg1.aShortArray125[local1437], local2781.anInt8130, local1012);
			}
			if (arg1.aShortArray131 == null) {
				this.aShortArray36[local1431] = -1;
			} else {
				this.aShortArray36[local1431] = arg1.aShortArray131[local1437];
			}
			if (arg1.aByteArray101 != null) {
				this.aByteArray32[local1431] = arg1.aByteArray101[local1437];
			}
			if (arg1.aShortArray128 != null) {
				this.aShortArray32[local1431] = arg1.aShortArray128[local1437];
			}
			this.aShortArray39[local1431] = arg1.aShortArray127[local1437];
		}
		local1437 = 0;
		local1140 = -10000;
		for (local1151 = 0; local1151 < this.anInt1918; local1151++) {
			@Pc(2963) short local2963 = this.aShortArray36[local1151];
			if (local2963 != local1140) {
				local1140 = local2963;
				local1437++;
			}
		}
		this.anIntArray267 = new int[local1437 + 1];
		local1437 = 0;
		local1140 = -10000;
		for (local1161 = 0; local1161 < this.anInt1918; local1161++) {
			@Pc(2993) short local2993 = this.aShortArray36[local1161];
			if (local2993 != local1140) {
				local1140 = local2993;
				this.anIntArray267[local1437++] = local1161;
			}
		}
		this.anIntArray267[local1437] = this.anInt1918;
		Static486.aLongArray13 = null;
		this.aShortArray38 = Static511.method7042(this.anInt1923, this.aShortArray38);
		this.aShortArray35 = Static511.method7042(this.anInt1923, this.aShortArray35);
		this.aShortArray34 = Static511.method7042(this.anInt1923, this.aShortArray34);
		this.aByteArray33 = Static353.method5288(this.aByteArray33, this.anInt1923);
		this.aFloatArray9 = Static75.method7895(this.anInt1923, this.aFloatArray9);
		this.aFloatArray10 = Static75.method7895(this.anInt1923, this.aFloatArray10);
		if (arg1.anIntArray608 != null && Static120.method1815(this.anInt1952, arg2)) {
			this.lb = arg1.method6331(false);
		}
		if (arg1.aClass55Array1 != null && Static275.method3943(this.anInt1952, arg2)) {
			this.anIntArrayArray30 = arg1.method6340();
		}
		if (arg1.anIntArray609 != null && Static93.method1476(this.anInt1952, arg2)) {
			local743 = 0;
			@Pc(3112) int[] local3112 = new int[256];
			for (local781 = 0; local781 < this.anInt1922; local781++) {
				local795 = arg1.anIntArray609[local113[local781]];
				if (local795 >= 0) {
					if (local795 > local743) {
						local743 = local795;
					}
					@Pc(3134) int local3134 = local3112[local795]++;
				}
			}
			this.anIntArrayArray31 = new int[local743 + 1][];
			for (local795 = 0; local795 <= local743; local795++) {
				this.anIntArrayArray31[local795] = new int[local3112[local795]];
				local3112[local795] = 0;
			}
			for (local797 = 0; local797 < this.anInt1922; local797++) {
				local1222 = arg1.anIntArray609[local113[local797]];
				if (local1222 >= 0) {
					this.anIntArrayArray31[local1222][local3112[local1222]++] = local797;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZZLclient!eca;IILclient!eca;)Lclient!ba;")
	private Class22 method1682(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class22_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class22_Sub2 arg4) {
		arg4.aShort51 = this.aShort51;
		arg4.aByte37 = 0;
		arg4.aShort49 = this.aShort49;
		arg4.anInt1906 = arg3;
		arg4.anInt1923 = this.anInt1923;
		arg4.anInt1908 = this.anInt1908;
		arg4.anInt1924 = this.anInt1924;
		arg4.anInt1959 = this.anInt1959;
		arg4.anInt1952 = this.anInt1952;
		arg4.anInt1918 = this.anInt1918;
		arg4.anInt1922 = this.anInt1922;
		@Pc(53) boolean local53 = Static36.method512(arg3, this.anInt1952);
		@Pc(61) boolean local61 = Static39.method562(this.anInt1952, arg3);
		@Pc(67) boolean local67 = Static149.method2197(arg3, this.anInt1952);
		@Pc(73) boolean local73 = local53 | local61 | local67;
		@Pc(178) int local178;
		if (local73) {
			if (!local53) {
				arg4.anIntArray266 = this.anIntArray266;
			} else if (arg2.anIntArray266 == null || arg2.anIntArray266.length < this.anInt1924) {
				arg4.anIntArray266 = arg2.anIntArray266 = new int[this.anInt1924];
			} else {
				arg4.anIntArray266 = arg2.anIntArray266;
			}
			if (!local61) {
				arg4.anIntArray265 = this.anIntArray265;
			} else if (arg2.anIntArray265 == null || this.anInt1924 > arg2.anIntArray265.length) {
				arg4.anIntArray265 = arg2.anIntArray265 = new int[this.anInt1924];
			} else {
				arg4.anIntArray265 = arg2.anIntArray265;
			}
			if (!local67) {
				arg4.anIntArray264 = this.anIntArray264;
			} else if (arg2.anIntArray264 == null || arg2.anIntArray264.length < this.anInt1924) {
				arg4.anIntArray264 = arg2.anIntArray264 = new int[this.anInt1924];
			} else {
				arg4.anIntArray264 = arg2.anIntArray264;
			}
			for (local178 = 0; local178 < this.anInt1924; local178++) {
				if (local53) {
					arg4.anIntArray266[local178] = this.anIntArray266[local178];
				}
				if (local61) {
					arg4.anIntArray265[local178] = this.anIntArray265[local178];
				}
				if (local67) {
					arg4.anIntArray264[local178] = this.anIntArray264[local178];
				}
			}
		} else {
			arg4.anIntArray264 = this.anIntArray264;
			arg4.anIntArray266 = this.anIntArray266;
			arg4.anIntArray265 = this.anIntArray265;
		}
		if (Static24.method4707(arg3, this.anInt1952)) {
			arg4.aClass53_7 = arg2.aClass53_7;
			if (arg1) {
				arg4.aByte37 = (byte) (arg4.aByte37 | 0x1);
			}
			arg4.aClass53_7.anInterface2_1 = this.aClass53_7.anInterface2_1;
			arg4.aClass53_7.aByte14 = this.aClass53_7.aByte14;
		} else if (Static325.method5030(this.anInt1952, arg3)) {
			arg4.aClass53_7 = this.aClass53_7;
		} else {
			arg4.aClass53_7 = null;
		}
		if (Static177.method2709(arg3, this.anInt1952)) {
			if (arg2.aShortArray39 == null || this.anInt1922 > arg2.aShortArray39.length) {
				arg4.aShortArray39 = arg2.aShortArray39 = new short[this.anInt1922];
			} else {
				arg4.aShortArray39 = arg2.aShortArray39;
			}
			for (local178 = 0; local178 < this.anInt1922; local178++) {
				arg4.aShortArray39[local178] = this.aShortArray39[local178];
			}
		} else {
			arg4.aShortArray39 = this.aShortArray39;
		}
		if (Static378.method5524(this.anInt1952, arg3)) {
			if (arg2.aByteArray32 == null || arg2.aByteArray32.length < this.anInt1922) {
				arg4.aByteArray32 = arg2.aByteArray32 = new byte[this.anInt1922];
			} else {
				arg4.aByteArray32 = arg2.aByteArray32;
			}
			for (local178 = 0; local178 < this.anInt1922; local178++) {
				arg4.aByteArray32[local178] = this.aByteArray32[local178];
			}
		} else {
			arg4.aByteArray32 = this.aByteArray32;
		}
		if (Static252.method3570(this.anInt1952, arg3)) {
			arg4.aClass53_5 = arg2.aClass53_5;
			if (arg1) {
				arg4.aByte37 = (byte) (arg4.aByte37 | 0x2);
			}
			arg4.aClass53_5.aByte14 = this.aClass53_5.aByte14;
			arg4.aClass53_5.anInterface2_1 = this.aClass53_5.anInterface2_1;
		} else if (Static101.method1651(arg3, this.anInt1952)) {
			arg4.aClass53_5 = this.aClass53_5;
		} else {
			arg4.aClass53_5 = null;
		}
		@Pc(558) int local558;
		if (Static550.method7576(this.anInt1952, arg3)) {
			if (arg2.aShortArray38 == null || this.anInt1923 > arg2.aShortArray38.length) {
				local178 = this.anInt1923;
				arg4.aShortArray34 = arg2.aShortArray34 = new short[local178];
				arg4.aShortArray38 = arg2.aShortArray38 = new short[local178];
				arg4.aShortArray35 = arg2.aShortArray35 = new short[local178];
			} else {
				arg4.aShortArray35 = arg2.aShortArray35;
				arg4.aShortArray34 = arg2.aShortArray34;
				arg4.aShortArray38 = arg2.aShortArray38;
			}
			if (this.aClass109_1 == null) {
				for (local178 = 0; local178 < this.anInt1923; local178++) {
					arg4.aShortArray38[local178] = this.aShortArray38[local178];
					arg4.aShortArray35[local178] = this.aShortArray35[local178];
					arg4.aShortArray34[local178] = this.aShortArray34[local178];
				}
			} else {
				if (arg2.aClass109_1 == null) {
					arg2.aClass109_1 = new Class109();
				}
				@Pc(546) Class109 local546 = arg4.aClass109_1 = arg2.aClass109_1;
				if (local546.aShortArray54 == null || local546.aShortArray54.length < this.anInt1923) {
					local558 = this.anInt1923;
					local546.aShortArray54 = new short[local558];
					local546.aByteArray40 = new byte[local558];
					local546.aShortArray52 = new short[local558];
					local546.aShortArray53 = new short[local558];
				}
				for (local558 = 0; local558 < this.anInt1923; local558++) {
					arg4.aShortArray38[local558] = this.aShortArray38[local558];
					arg4.aShortArray35[local558] = this.aShortArray35[local558];
					arg4.aShortArray34[local558] = this.aShortArray34[local558];
					local546.aShortArray54[local558] = this.aClass109_1.aShortArray54[local558];
					local546.aShortArray53[local558] = this.aClass109_1.aShortArray53[local558];
					local546.aShortArray52[local558] = this.aClass109_1.aShortArray52[local558];
					local546.aByteArray40[local558] = this.aClass109_1.aByteArray40[local558];
				}
			}
			arg4.aByteArray33 = this.aByteArray33;
		} else {
			arg4.aShortArray38 = this.aShortArray38;
			arg4.aByteArray33 = this.aByteArray33;
			arg4.aShortArray34 = this.aShortArray34;
			arg4.aClass109_1 = this.aClass109_1;
			arg4.aShortArray35 = this.aShortArray35;
		}
		if (Static374.method5478(this.anInt1952, arg3)) {
			if (arg1) {
				arg4.aByte37 = (byte) (arg4.aByte37 | 0x4);
			}
			arg4.aClass53_6 = arg2.aClass53_6;
			arg4.aClass53_6.aByte14 = this.aClass53_6.aByte14;
			arg4.aClass53_6.anInterface2_1 = this.aClass53_6.anInterface2_1;
		} else if (Static152.method2237(this.anInt1952, arg3)) {
			arg4.aClass53_6 = this.aClass53_6;
		} else {
			arg4.aClass53_6 = null;
		}
		if (Static519.method7319(arg3, this.anInt1952)) {
			if (arg2.aFloatArray9 == null || arg2.aFloatArray9.length < this.anInt1922) {
				local178 = this.anInt1923;
				arg4.aFloatArray10 = arg2.aFloatArray10 = new float[local178];
				arg4.aFloatArray9 = arg2.aFloatArray9 = new float[local178];
			} else {
				arg4.aFloatArray9 = arg2.aFloatArray9;
				arg4.aFloatArray10 = arg2.aFloatArray10;
			}
			for (local178 = 0; local178 < this.anInt1923; local178++) {
				arg4.aFloatArray9[local178] = this.aFloatArray9[local178];
				arg4.aFloatArray10[local178] = this.aFloatArray10[local178];
			}
		} else {
			arg4.aFloatArray10 = this.aFloatArray10;
			arg4.aFloatArray9 = this.aFloatArray9;
		}
		if (Static143.method6496(arg3, this.anInt1952)) {
			arg4.aClass53_4 = arg2.aClass53_4;
			if (arg1) {
				arg4.aByte37 = (byte) (arg4.aByte37 | 0x8);
			}
			arg4.aClass53_4.anInterface2_1 = this.aClass53_4.anInterface2_1;
			arg4.aClass53_4.aByte14 = this.aClass53_4.aByte14;
		} else if (Static544.method7518(arg3, this.anInt1952)) {
			arg4.aClass53_4 = this.aClass53_4;
		} else {
			arg4.aClass53_4 = null;
		}
		if (Static275.method3945(arg3, this.anInt1952)) {
			if (arg2.aShortArray40 == null || this.anInt1922 > arg2.aShortArray40.length) {
				local178 = this.anInt1922;
				arg4.aShortArray33 = arg2.aShortArray33 = new short[local178];
				arg4.aShortArray41 = arg2.aShortArray41 = new short[local178];
				arg4.aShortArray40 = arg2.aShortArray40 = new short[local178];
			} else {
				arg4.aShortArray33 = arg2.aShortArray33;
				arg4.aShortArray40 = arg2.aShortArray40;
				arg4.aShortArray41 = arg2.aShortArray41;
			}
			for (local178 = 0; local178 < this.anInt1922; local178++) {
				arg4.aShortArray40[local178] = this.aShortArray40[local178];
				arg4.aShortArray33[local178] = this.aShortArray33[local178];
				arg4.aShortArray41[local178] = this.aShortArray41[local178];
			}
		} else {
			arg4.aShortArray41 = this.aShortArray41;
			arg4.aShortArray40 = this.aShortArray40;
			arg4.aShortArray33 = this.aShortArray33;
		}
		if (Static288.method4064(this.anInt1952, arg3)) {
			arg4.aClass326_1 = arg2.aClass326_1;
			if (arg1) {
				arg4.aByte37 = (byte) (arg4.aByte37 | 0x10);
			}
			arg4.aClass326_1.anInterface19_5 = this.aClass326_1.anInterface19_5;
		} else if (Static544.method7514(arg3, this.anInt1952)) {
			arg4.aClass326_1 = this.aClass326_1;
		} else {
			arg4.aClass326_1 = null;
		}
		if (Static485.method6714(this.anInt1952, arg3)) {
			if (arg2.aShortArray36 == null || this.anInt1922 > arg2.aShortArray36.length) {
				local178 = this.anInt1922;
				arg4.aShortArray36 = arg2.aShortArray36 = new short[local178];
			} else {
				arg4.aShortArray36 = arg2.aShortArray36;
			}
			for (local178 = 0; local178 < this.anInt1922; local178++) {
				arg4.aShortArray36[local178] = this.aShortArray36[local178];
			}
		} else {
			arg4.aShortArray36 = this.aShortArray36;
		}
		if (!Static272.method3833(this.anInt1952, arg3)) {
			arg4.aClass329Array1 = this.aClass329Array1;
		} else if (arg2.aClass329Array1 == null || this.anInt1959 > arg2.aClass329Array1.length) {
			local178 = this.anInt1959;
			arg4.aClass329Array1 = arg2.aClass329Array1 = new Class329[local178];
			for (local558 = 0; local558 < this.anInt1959; local558++) {
				arg4.aClass329Array1[local558] = this.aClass329Array1[local558].method7487();
			}
		} else {
			arg4.aClass329Array1 = arg2.aClass329Array1;
			for (local178 = 0; local178 < this.anInt1959; local178++) {
				arg4.aClass329Array1[local178].method7484(this.aClass329Array1[local178]);
			}
		}
		arg4.anIntArrayArray31 = this.anIntArrayArray31;
		arg4.aShortArray37 = this.aShortArray37;
		arg4.aShortArray31 = this.aShortArray31;
		arg4.anIntArray263 = this.anIntArray263;
		arg4.aClass163Array3 = this.aClass163Array3;
		arg4.anIntArrayArray30 = this.anIntArrayArray30;
		arg4.anIntArray267 = this.anIntArray267;
		arg4.lb = this.lb;
		arg4.aClass266Array1 = this.aClass266Array1;
		if (this.aBoolean127) {
			arg4.aShort45 = this.aShort45;
			arg4.aShort48 = this.aShort48;
			arg4.aShort44 = this.aShort44;
			arg4.aShort47 = this.aShort47;
			arg4.aShort50 = this.aShort50;
			arg4.aShort43 = this.aShort43;
			arg4.aBoolean127 = true;
			arg4.aShort46 = this.aShort46;
		} else {
			arg4.aBoolean127 = false;
		}
		arg4.aShortArray32 = this.aShortArray32;
		arg4.aClass250Array3 = this.aClass250Array3;
		return arg4;
	}

	@OriginalMember(owner = "client!eca", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) Class60 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean127) {
			this.method1686();
		}
		@Pc(16) int local16 = this.aShort45 + arg4;
		@Pc(21) int local21 = arg4 + this.aShort47;
		@Pc(26) int local26 = this.aShort46 + arg6;
		@Pc(31) int local31 = this.aShort43 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9656 <= arg2.anInt9652 + local21 >> arg2.anInt9654 || local26 < 0 || arg2.anInt9652 + local31 >> arg2.anInt9654 >= arg2.anInt9657)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9656 <= local21 + arg3.anInt9652 >> arg3.anInt9654 || local26 < 0 || arg3.anInt9652 + local31 >> arg3.anInt9654 >= arg3.anInt9657) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9654;
			local21 = local21 + arg2.anInt9652 - 1 >> arg2.anInt9654;
			local26 >>= arg2.anInt9654;
			local31 = arg2.anInt9652 + local31 - 1 >> arg2.anInt9654;
			if (arg2.JA(local16, local26) == arg5 && arg5 == arg2.JA(local21, local26) && arg2.JA(local16, local31) == arg5 && arg5 == arg2.JA(local21, local31)) {
				return;
			}
		}
		@Pc(211) int local211;
		if (arg0 == 1) {
			for (local211 = 0; local211 < this.anInt1908; local211++) {
				this.anIntArray265[local211] = this.anIntArray265[local211] + arg2.sa(this.anIntArray266[local211] + arg4, arg6 + this.anIntArray264[local211]) - arg5;
			}
		} else {
			@Pc(273) int local273;
			@Pc(281) int local281;
			if (arg0 == 2) {
				@Pc(492) short local492 = this.aShort50;
				if (local492 == 0) {
					return;
				}
				for (local273 = 0; local273 < this.anInt1908; local273++) {
					local281 = (this.anIntArray265[local273] << 16) / local492;
					if (local281 < arg1) {
						this.anIntArray265[local273] += (arg2.sa(this.anIntArray266[local273] + arg4, arg6 + this.anIntArray264[local273]) - arg5) * (arg1 - local281) / arg1;
					}
				}
			} else {
				@Pc(289) int local289;
				if (arg0 == 3) {
					local211 = (arg1 & 0xFF) * 4;
					local273 = (arg1 >> 8 & 0xFF) * 4;
					local281 = (arg1 >> 16 & 0xFF) << 6;
					local289 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local211 >> 1) < 0 || arg2.anInt9652 + arg4 + (local211 >> 1) >= arg2.anInt9656 << arg2.anInt9654 || arg6 - (local273 >> 1) < 0 || arg6 + (local273 >> 1) + arg2.anInt9652 >= arg2.anInt9657 << arg2.anInt9654) {
						return;
					}
					this.method4696(local211, local289, local273, arg4, local281, arg5, arg6, arg2);
				} else if (arg0 == 4) {
					local211 = this.aShort48 - this.aShort50;
					for (local273 = 0; local273 < this.anInt1908; local273++) {
						this.anIntArray265[local273] = this.anIntArray265[local273] + arg3.sa(arg4 + this.anIntArray266[local273], this.anIntArray264[local273] + arg6) + local211 - arg5;
					}
				} else if (arg0 == 5) {
					local211 = this.aShort48 - this.aShort50;
					for (local273 = 0; local273 < this.anInt1908; local273++) {
						local281 = this.anIntArray266[local273] + arg4;
						local289 = this.anIntArray264[local273] + arg6;
						@Pc(447) int local447 = arg2.sa(local281, local289);
						@Pc(452) int local452 = arg3.sa(local281, local289);
						@Pc(460) int local460 = local447 - arg1 - local452;
						this.anIntArray265[local273] = ((this.anIntArray265[local273] << 8) / local211 * local460 >> 8) + (local447 - arg5);
					}
				}
			}
		}
		this.aBoolean127 = false;
		if (this.aClass53_7 != null) {
			this.aClass53_7.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!eca", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort49;
	}

	@OriginalMember(owner = "client!eca", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean127) {
			this.method1686();
		}
		return this.aShort46;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V")
	private void method1683() {
		if (this.aClass266Array1 == null) {
			return;
		}
		@Pc(18) Class34_Sub2 local18 = this.aClass121_Sub3_11.aClass34_Sub2_2;
		@Pc(22) float local22 = this.aClass121_Sub3_11.method5674();
		@Pc(26) float local26 = this.aClass121_Sub3_11.method5722();
		this.aClass121_Sub3_11.method5646();
		this.aClass121_Sub3_11.method7129(false);
		this.aClass121_Sub3_11.method5680(false);
		this.aClass121_Sub3_11.method5727(null, this.aClass121_Sub3_11.aClass53_15, this.aClass121_Sub3_11.aClass53_14, null);
		for (@Pc(55) int local55 = 0; local55 < this.anInt1959; local55++) {
			@Pc(62) Class266 local62 = this.aClass266Array1[local55];
			@Pc(67) Class329 local67 = this.aClass329Array1[local55];
			if (!local62.aBoolean521 || !this.aClass121_Sub3_11.method7141()) {
				@Pc(97) float local97 = (float) (this.anIntArray266[local62.anInt7542] + this.anIntArray266[local62.anInt7546] + this.anIntArray266[local62.anInt7545]) * 0.3333333F;
				@Pc(118) float local118 = (float) (this.anIntArray265[local62.anInt7545] + this.anIntArray265[local62.anInt7546] + this.anIntArray265[local62.anInt7542]) * 0.3333333F;
				@Pc(140) float local140 = (float) (this.anIntArray264[local62.anInt7546] + this.anIntArray264[local62.anInt7542] + this.anIntArray264[local62.anInt7545]) * 0.3333333F;
				@Pc(154) float local154 = Static553.aFloat203 * local118 + local97 * Static291.aFloat87 + local140 * Static256.aFloat60 + Static16.aFloat7;
				@Pc(168) float local168 = Static253.aFloat59 + local140 * Static383.aFloat142 + local97 * Static187.aFloat46 + Static266.aFloat82 * local118;
				@Pc(182) float local182 = Static355.aFloat140 + Static511.aFloat181 * local97 + local118 * Static426.aFloat171 + local140 * Static323.aFloat131;
				local18.method2286(local62.aShort103 * local67.anInt9143 >> 7, (float) local67.anInt9146 + local154, -local168 + (float) local67.anInt9138, -local182, local67.anInt9140 * local62.aShort104 >> 7, local67.anInt9145);
				this.aClass121_Sub3_11.method5712(local18);
				this.aClass121_Sub3_11.ka(local26, local22 - (float) local62.anInt7543 * 1.5F);
				@Pc(233) int local233 = local67.anInt9144;
				OpenGL.glColor4ub((byte) (local233 >> 16), (byte) (local233 >> 8), (byte) local233, (byte) (local233 >> 24));
				this.aClass121_Sub3_11.method5690(local62.aShort105);
				this.aClass121_Sub3_11.method5707(local62.aByte84);
				this.aClass121_Sub3_11.method5667(4);
			}
		}
		this.aClass121_Sub3_11.ka(local26, local22);
		this.aClass121_Sub3_11.method7129(true);
		this.aClass121_Sub3_11.method5662();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt1922; local3++) {
			local12 = this.aShortArray39[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			@Pc(56) int local56 = local12 & 0x7F;
			if (arg2 != -1) {
				local56 += arg3 * (arg2 - local56) >> 7;
			}
			this.aShortArray39[local3] = (short) (local56 | local24 << 7 | local18 << 10);
		}
		if (this.aClass266Array1 != null) {
			for (local12 = 0; local12 < this.anInt1959; local12++) {
				@Pc(109) Class266 local109 = this.aClass266Array1[local12];
				@Pc(114) Class329 local114 = this.aClass329Array1[local12];
				local114.anInt9144 = Static101.anIntArray262[this.aShortArray39[local109.anInt7544] & 0xFFFF] & 0xFFFFFF | local114.anInt9144 & 0xFF000000;
			}
		}
		if (this.aClass53_5 != null) {
			this.aClass53_5.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!eca", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static431.anInt7550 = 0;
			local29 = 0;
			Static284.anInt4690 = 0;
			Static545.anInt9205 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.lb.length > local41) {
					local51 = this.lb[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray31 == null || (this.aShortArray31[local59] & arg6) != 0) {
							Static545.anInt9205 += this.anIntArray266[local59];
							Static284.anInt4690 += this.anIntArray265[local59];
							Static431.anInt7550 += this.anIntArray264[local59];
							local29++;
						}
					}
				}
			}
			if (local29 <= 0) {
				Static545.anInt9205 = arg2;
				Static431.anInt7550 = arg4;
				Static284.anInt4690 = arg3;
			} else {
				Static284.anInt4690 = arg3 + Static284.anInt4690 / local29;
				Static7.aBoolean6 = true;
				Static545.anInt9205 = arg2 + Static545.anInt9205 / local29;
				Static431.anInt7550 = Static431.anInt7550 / local29 + arg4;
			}
			return;
		}
		@Pc(248) int[] local248;
		@Pc(250) int local250;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[0] * arg2 + arg7[1] * arg3 + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg3 * arg7[4] + arg2 * arg7[3] + 8192 >> 14;
				local41 = arg4 * arg7[8] + arg7[7] * arg3 + arg2 * arg7[6] + 8192 >> 14;
				arg4 = local41;
				arg2 = local29;
				arg3 = local35;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.lb.length) {
					local248 = this.lb[local35];
					for (local250 = 0; local250 < local248.length; local250++) {
						local53 = local248[local250];
						if (this.aShortArray31 == null || (arg6 & this.aShortArray31[local53]) != 0) {
							this.anIntArray266[local53] += arg2;
							this.anIntArray265[local53] += arg3;
							this.anIntArray264[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(376) int local376;
		@Pc(398) int local398;
		@Pc(422) int local422;
		@Pc(457) int local457;
		@Pc(461) int local461;
		@Pc(465) int local465;
		@Pc(469) int local469;
		@Pc(477) int local477;
		@Pc(485) int local485;
		@Pc(640) int local640;
		@Pc(666) int local666;
		@Pc(671) int local671;
		@Pc(679) int local679;
		@Pc(684) int local684;
		@Pc(688) int local688;
		@Pc(692) int local692;
		@Pc(694) int local694;
		@Pc(827) int[] local827;
		@Pc(829) int local829;
		@Pc(833) int local833;
		@Pc(837) int local837;
		@Pc(839) int local839;
		@Pc(970) int local970;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.lb.length > local35) {
						local248 = this.lb[local35];
						for (local250 = 0; local250 < local248.length; local250++) {
							local53 = local248[local250];
							if (this.aShortArray31 == null || (this.aShortArray31[local53] & arg6) != 0) {
								this.anIntArray266[local53] -= Static545.anInt9205;
								this.anIntArray265[local53] -= Static284.anInt4690;
								this.anIntArray264[local53] -= Static431.anInt7550;
								if (arg4 != 0) {
									local59 = Class138.anIntArray392[arg4];
									local376 = Class138.anIntArray393[arg4];
									local398 = this.anIntArray266[local53] * local376 + local59 * this.anIntArray265[local53] + 16383 >> 14;
									this.anIntArray265[local53] = this.anIntArray265[local53] * local376 + 16383 - local59 * this.anIntArray266[local53] >> 14;
									this.anIntArray266[local53] = local398;
								}
								if (arg2 != 0) {
									local59 = Class138.anIntArray392[arg2];
									local376 = Class138.anIntArray393[arg2];
									local398 = local376 * this.anIntArray265[local53] + 16383 - this.anIntArray264[local53] * local59 >> 14;
									this.anIntArray264[local53] = this.anIntArray265[local53] * local59 + this.anIntArray264[local53] * local376 + 16383 >> 14;
									this.anIntArray265[local53] = local398;
								}
								if (arg3 != 0) {
									local59 = Class138.anIntArray392[arg3];
									local376 = Class138.anIntArray393[arg3];
									local398 = local59 * this.anIntArray264[local53] + local376 * this.anIntArray266[local53] + 16383 >> 14;
									this.anIntArray264[local53] = this.anIntArray264[local53] * local376 + 16383 - local59 * this.anIntArray266[local53] >> 14;
									this.anIntArray266[local53] = local398;
								}
								this.anIntArray266[local53] += Static545.anInt9205;
								this.anIntArray265[local53] += Static284.anInt4690;
								this.anIntArray264[local53] += Static431.anInt7550;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.lb.length) {
							local51 = this.lb[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray31 == null || (this.aShortArray31[local59] & arg6) != 0) {
									local376 = this.anIntArray263[local59];
									local398 = this.anIntArray263[local59 + 1];
									for (local422 = local376; local422 < local398; local422++) {
										local457 = this.aShortArray37[local422] - 1;
										if (local457 == -1) {
											break;
										}
										if (arg4 != 0) {
											local461 = Class138.anIntArray392[arg4];
											local465 = Class138.anIntArray393[arg4];
											local469 = this.aShortArray35[local457] * local461 + local465 * this.aShortArray38[local457] + 16383 >> 14;
											this.aShortArray35[local457] = (short) (local465 * this.aShortArray35[local457] + 16383 - local461 * this.aShortArray38[local457] >> 14);
											this.aShortArray38[local457] = (short) local469;
										}
										if (arg2 != 0) {
											local461 = Class138.anIntArray392[arg2];
											local465 = Class138.anIntArray393[arg2];
											local469 = this.aShortArray35[local457] * local465 + 16383 - local461 * this.aShortArray34[local457] >> 14;
											this.aShortArray34[local457] = (short) (this.aShortArray34[local457] * local465 + this.aShortArray35[local457] * local461 + 16383 >> 14);
											this.aShortArray35[local457] = (short) local469;
										}
										if (arg3 != 0) {
											local461 = Class138.anIntArray392[arg3];
											local465 = Class138.anIntArray393[arg3];
											local469 = this.aShortArray34[local457] * local461 + local465 * this.aShortArray38[local457] + 16383 >> 14;
											this.aShortArray34[local457] = (short) (this.aShortArray34[local457] * local465 + 16383 - local461 * this.aShortArray38[local457] >> 14);
											this.aShortArray38[local457] = (short) local469;
										}
									}
								}
							}
						}
					}
					if (this.aClass53_6 == null && this.aClass53_5 != null) {
						this.aClass53_5.anInterface2_1 = null;
					}
					if (this.aClass53_6 != null) {
						this.aClass53_6.anInterface2_1 = null;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local250 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static7.aBoolean6) {
					local376 = arg7[6] * Static431.anInt7550 + Static284.anInt4690 * arg7[3] + Static545.anInt9205 * arg7[0] + 8192 >> 14;
					local398 = Static431.anInt7550 * arg7[7] + Static545.anInt9205 * arg7[1] + arg7[4] * Static284.anInt4690 + 8192 >> 14;
					local422 = Static545.anInt9205 * arg7[2] + arg7[5] * Static284.anInt4690 + Static431.anInt7550 * arg7[8] + 8192 >> 14;
					local376 += local250;
					local398 += local53;
					Static545.anInt9205 = local376;
					Static284.anInt4690 = local398;
					local422 += local59;
					Static7.aBoolean6 = false;
					Static431.anInt7550 = local422;
				}
				@Pc(445) int[] local445 = new int[9];
				local398 = Class138.anIntArray393[arg2];
				local422 = Class138.anIntArray392[arg2];
				local457 = Class138.anIntArray393[arg3];
				local461 = Class138.anIntArray392[arg3];
				local465 = Class138.anIntArray393[arg4];
				local469 = Class138.anIntArray392[arg4];
				local477 = local465 * local422 + 8192 >> 14;
				local485 = local422 * local469 + 8192 >> 14;
				local445[3] = local398 * local469 + 8192 >> 14;
				local445[8] = local398 * local457 + 8192 >> 14;
				local445[2] = local398 * local461 + 8192 >> 14;
				local445[4] = local398 * local465 + 8192 >> 14;
				local445[7] = local457 * local477 + local461 * local469 + 8192 >> 14;
				local445[1] = local461 * local477 + local469 * -local457 + 8192 >> 14;
				local445[6] = -local461 * local465 + local485 * local457 + 8192 >> 14;
				local445[5] = -local422;
				local445[0] = local485 * local461 + local457 * local465 + 8192 >> 14;
				@Pc(615) int local615 = -Static431.anInt7550 * local445[2] + -Static545.anInt9205 * local445[0] + local445[1] * -Static284.anInt4690 + 8192 >> 14;
				local640 = local445[5] * -Static431.anInt7550 + -Static284.anInt4690 * local445[4] + -Static545.anInt9205 * local445[3] + 8192 >> 14;
				local666 = -Static431.anInt7550 * local445[8] + local445[6] * -Static545.anInt9205 + local445[7] * -Static284.anInt4690 + 8192 >> 14;
				local671 = local615 + Static545.anInt9205;
				@Pc(675) int local675 = Static284.anInt4690 + local640;
				local679 = local666 + Static431.anInt7550;
				@Pc(682) int[] local682 = new int[9];
				for (local684 = 0; local684 < 3; local684++) {
					for (local688 = 0; local688 < 3; local688++) {
						local692 = 0;
						for (local694 = 0; local694 < 3; local694++) {
							local692 += arg7[local694 + local688 * 3] * local445[local684 * 3 + local694];
						}
						local682[local684 * 3 + local688] = local692 + 8192 >> 14;
					}
				}
				local688 = local59 * local445[2] + local445[0] * local250 + local53 * local445[1] + 8192 >> 14;
				local692 = local59 * local445[5] + local250 * local445[3] + local445[4] * local53 + 8192 >> 14;
				local692 += local675;
				local694 = local445[8] * local59 + local445[6] * local250 + local445[7] * local53 + 8192 >> 14;
				local688 += local671;
				local694 += local679;
				local827 = new int[9];
				for (local829 = 0; local829 < 3; local829++) {
					for (local833 = 0; local833 < 3; local833++) {
						local837 = 0;
						for (local839 = 0; local839 < 3; local839++) {
							local837 += arg7[local839 + local829 * 3] * local682[local839 * 3 + local833];
						}
						local827[local829 * 3 + local833] = local837 + 8192 >> 14;
					}
				}
				local833 = arg7[0] * local688 + arg7[1] * local692 + local694 * arg7[2] + 8192 >> 14;
				local837 = arg7[5] * local694 + local688 * arg7[3] + local692 * arg7[4] + 8192 >> 14;
				local837 += local35;
				local839 = local688 * arg7[6] + arg7[7] * local692 + arg7[8] * local694 + 8192 >> 14;
				local833 += local29;
				local839 += local41;
				for (local970 = 0; local970 < local8; local970++) {
					@Pc(976) int local976 = arg1[local970];
					if (this.lb.length > local976) {
						@Pc(986) int[] local986 = this.lb[local976];
						for (@Pc(988) int local988 = 0; local988 < local986.length; local988++) {
							@Pc(994) int local994 = local986[local988];
							if (this.aShortArray31 == null || (arg6 & this.aShortArray31[local994]) != 0) {
								@Pc(1039) int local1039 = local827[2] * this.anIntArray264[local994] + this.anIntArray266[local994] * local827[0] + this.anIntArray265[local994] * local827[1] + 8192 >> 14;
								@Pc(1071) int local1071 = local827[5] * this.anIntArray264[local994] + local827[3] * this.anIntArray266[local994] + this.anIntArray265[local994] * local827[4] + 8192 >> 14;
								@Pc(1075) int local1075 = local1039 + local833;
								@Pc(1106) int local1106 = this.anIntArray264[local994] * local827[8] + local827[7] * this.anIntArray265[local994] + this.anIntArray266[local994] * local827[6] + 8192 >> 14;
								@Pc(1110) int local1110 = local1071 + local837;
								this.anIntArray266[local994] = local1075;
								@Pc(1119) int local1119 = local1106 + local839;
								this.anIntArray265[local994] = local1110;
								this.anIntArray264[local994] = local1119;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2586) Class266 local2586;
			@Pc(2591) Class329 local2591;
			if (arg0 == 5) {
				if (this.anIntArrayArray31 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray31.length) {
							local248 = this.anIntArrayArray31[local35];
							for (local250 = 0; local250 < local248.length; local250++) {
								local53 = local248[local250];
								if (this.aShortArray32 == null || (this.aShortArray32[local53] & arg6) != 0) {
									local59 = (this.aByteArray32[local53] & 0xFF) + (arg2 * 8);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray32[local53] = (byte) local59;
									if (this.aClass53_5 != null) {
										this.aClass53_5.anInterface2_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass266Array1 != null) {
						for (local35 = 0; local35 < this.anInt1959; local35++) {
							local2586 = this.aClass266Array1[local35];
							local2591 = this.aClass329Array1[local35];
							local2591.anInt9144 = local2591.anInt9144 & 0xFFFFFF | 255 - (this.aByteArray32[local2586.anInt7544] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2847) Class329 local2847;
				if (arg0 == 8) {
					if (this.anIntArrayArray30 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray30.length > local35) {
								local248 = this.anIntArrayArray30[local35];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2847 = this.aClass329Array1[local248[local250]];
									local2847.anInt9138 += arg3;
									local2847.anInt9146 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray30 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray30.length) {
								local248 = this.anIntArrayArray30[local35];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2847 = this.aClass329Array1[local248[local250]];
									local2847.anInt9140 = arg2 * local2847.anInt9140 >> 7;
									local2847.anInt9143 = arg3 * local2847.anInt9143 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray30 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray30.length > local35) {
							local248 = this.anIntArrayArray30[local35];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2847 = this.aClass329Array1[local248[local250]];
								local2847.anInt9145 = local2847.anInt9145 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray31 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray31.length) {
						local248 = this.anIntArrayArray31[local35];
						for (local250 = 0; local250 < local248.length; local250++) {
							local53 = local248[local250];
							if (this.aShortArray32 == null || (this.aShortArray32[local53] & arg6) != 0) {
								local59 = this.aShortArray39[local53] & 0xFFFF;
								local376 = local59 >> 10 & 0x3F;
								local398 = local59 >> 7 & 0x7;
								local422 = local59 & 0x7F;
								@Pc(2698) int local2698 = arg2 + local376 & 0x3F;
								local398 += arg3 / 4;
								if (local398 < 0) {
									local398 = 0;
								} else if (local398 > 7) {
									local398 = 7;
								}
								local422 += arg4;
								if (local422 < 0) {
									local422 = 0;
								} else if (local422 > 127) {
									local422 = 127;
								}
								this.aShortArray39[local53] = (short) (local422 | local398 << 7 | local2698 << 10);
								if (this.aClass53_5 != null) {
									this.aClass53_5.anInterface2_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass266Array1 != null) {
					for (local35 = 0; local35 < this.anInt1959; local35++) {
						local2586 = this.aClass266Array1[local35];
						local2591 = this.aClass329Array1[local35];
						local2591.anInt9144 = Static101.anIntArray262[this.aShortArray39[local2586.anInt7544] & 0xFFFF] & 0xFFFFFF | local2591.anInt9144 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.lb.length > local35) {
					local248 = this.lb[local35];
					for (local250 = 0; local250 < local248.length; local250++) {
						local53 = local248[local250];
						if (this.aShortArray31 == null || (arg6 & this.aShortArray31[local53]) != 0) {
							this.anIntArray266[local53] -= Static545.anInt9205;
							this.anIntArray265[local53] -= Static284.anInt4690;
							this.anIntArray264[local53] -= Static431.anInt7550;
							this.anIntArray266[local53] = arg2 * this.anIntArray266[local53] >> 7;
							this.anIntArray265[local53] = this.anIntArray265[local53] * arg3 >> 7;
							this.anIntArray264[local53] = arg4 * this.anIntArray264[local53] >> 7;
							this.anIntArray266[local53] += Static545.anInt9205;
							this.anIntArray265[local53] += Static284.anInt4690;
							this.anIntArray264[local53] += Static431.anInt7550;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local250 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static7.aBoolean6) {
				local376 = Static545.anInt9205 * arg7[0] + Static284.anInt4690 * arg7[3] + arg7[6] * Static431.anInt7550 + 8192 >> 14;
				local398 = Static431.anInt7550 * arg7[7] + arg7[4] * Static284.anInt4690 + arg7[1] * Static545.anInt9205 + 8192 >> 14;
				local398 += local53;
				local376 += local250;
				local422 = arg7[8] * Static431.anInt7550 + Static545.anInt9205 * arg7[2] + arg7[5] * Static284.anInt4690 + 8192 >> 14;
				Static545.anInt9205 = local376;
				local422 += local59;
				Static284.anInt4690 = local398;
				Static431.anInt7550 = local422;
				Static7.aBoolean6 = false;
			}
			local376 = arg2 << 15 >> 7;
			local398 = arg3 << 15 >> 7;
			local422 = arg4 << 15 >> 7;
			local457 = -Static545.anInt9205 * local376 + 8192 >> 14;
			local461 = -Static284.anInt4690 * local398 + 8192 >> 14;
			local465 = local422 * -Static431.anInt7550 + 8192 >> 14;
			local469 = Static545.anInt9205 + local457;
			local477 = local461 + Static284.anInt4690;
			local485 = Static431.anInt7550 + local465;
			@Pc(2025) int[] local2025 = new int[] { arg7[0] * local376 + 8192 >> 14, local376 * arg7[3] + 8192 >> 14, local376 * arg7[6] + 8192 >> 14, arg7[1] * local398 + 8192 >> 14, local398 * arg7[4] + 8192 >> 14, arg7[7] * local398 + 8192 >> 14, local422 * arg7[2] + 8192 >> 14, local422 * arg7[5] + 8192 >> 14, local422 * arg7[8] + 8192 >> 14 };
			local640 = local250 * local376 + 8192 >> 14;
			local666 = local398 * local53 + 8192 >> 14;
			local671 = local59 * local422 + 8192 >> 14;
			@Pc(2161) int local2161 = local666 + local477;
			@Pc(2165) int local2165 = local640 + local469;
			@Pc(2169) int local2169 = local671 + local485;
			@Pc(2172) int[] local2172 = new int[9];
			@Pc(2178) int local2178;
			for (local679 = 0; local679 < 3; local679++) {
				for (local2178 = 0; local2178 < 3; local2178++) {
					local684 = 0;
					for (local688 = 0; local688 < 3; local688++) {
						local684 += local2025[local2178 + local688 * 3] * arg7[local679 * 3 + local688];
					}
					local2172[local2178 + local679 * 3] = local684 + 8192 >> 14;
				}
			}
			local2178 = arg7[1] * local2161 + local2165 * arg7[0] + arg7[2] * local2169 + 8192 >> 14;
			local684 = local2165 * arg7[3] + arg7[4] * local2161 + arg7[5] * local2169 + 8192 >> 14;
			local688 = arg7[6] * local2165 + local2161 * arg7[7] + local2169 * arg7[8] + 8192 >> 14;
			local684 += local35;
			local2178 += local29;
			local688 += local41;
			for (local692 = 0; local692 < local8; local692++) {
				local694 = arg1[local692];
				if (this.lb.length > local694) {
					local827 = this.lb[local694];
					for (local829 = 0; local829 < local827.length; local829++) {
						local833 = local827[local829];
						if (this.aShortArray31 == null || (this.aShortArray31[local833] & arg6) != 0) {
							local837 = local2172[1] * this.anIntArray265[local833] + this.anIntArray266[local833] * local2172[0] + local2172[2] * this.anIntArray264[local833] + 8192 >> 14;
							local839 = local2172[4] * this.anIntArray265[local833] + this.anIntArray266[local833] * local2172[3] + local2172[5] * this.anIntArray264[local833] + 8192 >> 14;
							@Pc(2412) int local2412 = local839 + local684;
							@Pc(2416) int local2416 = local837 + local2178;
							local970 = this.anIntArray266[local833] * local2172[6] + local2172[7] * this.anIntArray265[local833] + local2172[8] * this.anIntArray264[local833] + 8192 >> 14;
							@Pc(2451) int local2451 = local970 + local688;
							this.anIntArray266[local833] = local2416;
							this.anIntArray265[local833] = local2412;
							this.anIntArray264[local833] = local2451;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1922; local7++) {
			if (this.aShortArray39[local7] == arg0) {
				this.aShortArray39[local7] = arg1;
			}
		}
		if (this.aClass266Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt1959; local38++) {
				@Pc(45) Class266 local45 = this.aClass266Array1[local38];
				@Pc(50) Class329 local50 = this.aClass329Array1[local38];
				local50.anInt9144 = local50.anInt9144 & 0xFF000000 | Static101.anIntArray262[this.aShortArray39[local45.anInt7544] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass53_5 != null) {
			this.aClass53_5.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt1906;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
	private void method1684() {
		if (this.anInt1918 == 0) {
			return;
		}
		if (this.aByte37 != 0) {
			this.method1692(true);
		}
		this.method1692(false);
		if (this.aClass326_1 != null) {
			if (this.aClass326_1.anInterface19_5 == null) {
				this.method1685((this.aByte37 & 0x10) != 0);
			}
			if (this.aClass326_1.anInterface19_5 != null) {
				this.aClass121_Sub3_11.method5680(this.aClass53_6 != null);
				this.aClass121_Sub3_11.method5727(this.aClass53_6, this.aClass53_4, this.aClass53_7, this.aClass53_5);
				@Pc(81) int local81 = this.anIntArray267.length - 1;
				for (@Pc(83) int local83 = 0; local83 < local81; local83++) {
					@Pc(90) int local90 = this.anIntArray267[local83];
					@Pc(97) int local97 = this.anIntArray267[local83 + 1];
					@Pc(104) int local104 = this.aShortArray36[local90] & 0xFFFF;
					if (local104 == 65535) {
						local104 = -1;
					}
					this.aClass121_Sub3_11.method5692(this.aClass53_6 != null, local104);
					this.aClass121_Sub3_11.method5657((local97 - local90) * 3, local90 * 3, this.aClass326_1.anInterface19_5);
				}
			}
		}
		this.method1687();
	}

	@OriginalMember(owner = "client!eca", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class138.anIntArray392[arg0];
		@Pc(13) int local13 = Class138.anIntArray393[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1908; local15++) {
			local34 = this.anIntArray264[local15] * local9 + this.anIntArray266[local15] * local13 >> 14;
			this.anIntArray264[local15] = local13 * this.anIntArray264[local15] - this.anIntArray266[local15] * local9 >> 14;
			this.anIntArray266[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt1923; local34++) {
			@Pc(83) int local83 = local13 * this.aShortArray38[local34] + this.aShortArray34[local34] * local9 >> 14;
			this.aShortArray34[local34] = (short) (this.aShortArray34[local34] * local13 - this.aShortArray38[local34] * local9 >> 14);
			this.aShortArray38[local34] = (short) local83;
		}
		if (this.aClass53_6 == null && this.aClass53_5 != null) {
			this.aClass53_5.anInterface2_1 = null;
		}
		if (this.aClass53_6 != null) {
			this.aClass53_6.anInterface2_1 = null;
		}
		this.aBoolean127 = false;
		if (this.aClass53_7 != null) {
			this.aClass53_7.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!eca", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
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
			Static431.anInt7550 = 0;
			local29 = 0;
			Static284.anInt4690 = 0;
			Static545.anInt9205 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.lb.length > local41) {
					local55 = this.lb[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static545.anInt9205 += this.anIntArray266[local63];
						Static284.anInt4690 += this.anIntArray265[local63];
						local29++;
						Static431.anInt7550 += this.anIntArray264[local63];
					}
				}
			}
			if (local29 <= 0) {
				Static284.anInt4690 = local25;
				Static431.anInt7550 = local21;
				Static545.anInt9205 = local17;
			} else {
				Static284.anInt4690 = local25 + Static284.anInt4690 / local29;
				Static431.anInt7550 = local21 + Static431.anInt7550 / local29;
				Static545.anInt9205 = local17 + Static545.anInt9205 / local29;
			}
			return;
		}
		@Pc(160) int[] local160;
		@Pc(162) int local162;
		if (arg0 == 1) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.lb.length > local35) {
					local160 = this.lb[local35];
					for (local162 = 0; local162 < local160.length; local162++) {
						local57 = local160[local162];
						this.anIntArray266[local57] += local17;
						this.anIntArray265[local57] += local25;
						this.anIntArray264[local57] += local21;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(290) int local290;
		@Pc(743) int local743;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.lb.length) {
					local160 = this.lb[local35];
					if ((arg5 & 0x1) == 0) {
						for (local162 = 0; local162 < local160.length; local162++) {
							local57 = local160[local162];
							this.anIntArray266[local57] -= Static545.anInt9205;
							this.anIntArray265[local57] -= Static284.anInt4690;
							this.anIntArray264[local57] -= Static431.anInt7550;
							if (arg4 != 0) {
								local63 = Class138.anIntArray392[arg4];
								local271 = Class138.anIntArray393[arg4];
								local290 = local271 * this.anIntArray266[local57] + this.anIntArray265[local57] * local63 + 16383 >> 14;
								this.anIntArray265[local57] = local271 * this.anIntArray265[local57] + 16383 - this.anIntArray266[local57] * local63 >> 14;
								this.anIntArray266[local57] = local290;
							}
							if (arg2 != 0) {
								local63 = Class138.anIntArray392[arg2];
								local271 = Class138.anIntArray393[arg2];
								local290 = this.anIntArray265[local57] * local271 + 16383 - local63 * this.anIntArray264[local57] >> 14;
								this.anIntArray264[local57] = this.anIntArray264[local57] * local271 + local63 * this.anIntArray265[local57] + 16383 >> 14;
								this.anIntArray265[local57] = local290;
							}
							if (arg3 != 0) {
								local63 = Class138.anIntArray392[arg3];
								local271 = Class138.anIntArray393[arg3];
								local290 = local271 * this.anIntArray266[local57] + this.anIntArray264[local57] * local63 + 16383 >> 14;
								this.anIntArray264[local57] = this.anIntArray264[local57] * local271 + 16383 - local63 * this.anIntArray266[local57] >> 14;
								this.anIntArray266[local57] = local290;
							}
							this.anIntArray266[local57] += Static545.anInt9205;
							this.anIntArray265[local57] += Static284.anInt4690;
							this.anIntArray264[local57] += Static431.anInt7550;
						}
					} else {
						for (local162 = 0; local162 < local160.length; local162++) {
							local57 = local160[local162];
							this.anIntArray266[local57] -= Static545.anInt9205;
							this.anIntArray265[local57] -= Static284.anInt4690;
							this.anIntArray264[local57] -= Static431.anInt7550;
							if (arg2 != 0) {
								local63 = Class138.anIntArray392[arg2];
								local271 = Class138.anIntArray393[arg2];
								local290 = this.anIntArray265[local57] * local271 + 16383 - local63 * this.anIntArray264[local57] >> 14;
								this.anIntArray264[local57] = this.anIntArray264[local57] * local271 + this.anIntArray265[local57] * local63 + 16383 >> 14;
								this.anIntArray265[local57] = local290;
							}
							if (arg4 != 0) {
								local63 = Class138.anIntArray392[arg4];
								local271 = Class138.anIntArray393[arg4];
								local290 = local63 * this.anIntArray265[local57] + this.anIntArray266[local57] * local271 + 16383 >> 14;
								this.anIntArray265[local57] = this.anIntArray265[local57] * local271 + 16383 - this.anIntArray266[local57] * local63 >> 14;
								this.anIntArray266[local57] = local290;
							}
							if (arg3 != 0) {
								local63 = Class138.anIntArray392[arg3];
								local271 = Class138.anIntArray393[arg3];
								local290 = this.anIntArray264[local57] * local63 + local271 * this.anIntArray266[local57] + 16383 >> 14;
								this.anIntArray264[local57] = this.anIntArray264[local57] * local271 + 16383 - local63 * this.anIntArray266[local57] >> 14;
								this.anIntArray266[local57] = local290;
							}
							this.anIntArray266[local57] += Static545.anInt9205;
							this.anIntArray265[local57] += Static284.anInt4690;
							this.anIntArray264[local57] += Static431.anInt7550;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.lb.length) {
						local55 = this.lb[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local271 = this.anIntArray263[local63];
							local290 = this.anIntArray263[local63 + 1];
							for (local743 = local271; local743 < local290; local743++) {
								@Pc(752) int local752 = this.aShortArray37[local743] - 1;
								if (local752 == -1) {
									break;
								}
								@Pc(765) int local765;
								@Pc(769) int local769;
								@Pc(787) int local787;
								if (arg4 != 0) {
									local765 = Class138.anIntArray392[arg4];
									local769 = Class138.anIntArray393[arg4];
									local787 = this.aShortArray35[local752] * local765 + this.aShortArray38[local752] * local769 + 16383 >> 14;
									this.aShortArray35[local752] = (short) (this.aShortArray35[local752] * local769 + 16383 - this.aShortArray38[local752] * local765 >> 14);
									this.aShortArray38[local752] = (short) local787;
								}
								if (arg2 != 0) {
									local765 = Class138.anIntArray392[arg2];
									local769 = Class138.anIntArray393[arg2];
									local787 = this.aShortArray35[local752] * local769 + 16383 - this.aShortArray34[local752] * local765 >> 14;
									this.aShortArray34[local752] = (short) (local765 * this.aShortArray35[local752] + local769 * this.aShortArray34[local752] + 16383 >> 14);
									this.aShortArray35[local752] = (short) local787;
								}
								if (arg3 != 0) {
									local765 = Class138.anIntArray392[arg3];
									local769 = Class138.anIntArray393[arg3];
									local787 = this.aShortArray38[local752] * local769 + local765 * this.aShortArray34[local752] + 16383 >> 14;
									this.aShortArray34[local752] = (short) (local769 * this.aShortArray34[local752] + 16383 - this.aShortArray38[local752] * local765 >> 14);
									this.aShortArray38[local752] = (short) local787;
								}
							}
						}
					}
				}
				if (this.aClass53_6 == null && this.aClass53_5 != null) {
					this.aClass53_5.anInterface2_1 = null;
				}
				if (this.aClass53_6 != null) {
					this.aClass53_6.anInterface2_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.lb.length) {
					local160 = this.lb[local35];
					for (local162 = 0; local162 < local160.length; local162++) {
						local57 = local160[local162];
						this.anIntArray266[local57] -= Static545.anInt9205;
						this.anIntArray265[local57] -= Static284.anInt4690;
						this.anIntArray264[local57] -= Static431.anInt7550;
						this.anIntArray266[local57] = arg2 * this.anIntArray266[local57] >> 7;
						this.anIntArray265[local57] = this.anIntArray265[local57] * arg3 >> 7;
						this.anIntArray264[local57] = this.anIntArray264[local57] * arg4 >> 7;
						this.anIntArray266[local57] += Static545.anInt9205;
						this.anIntArray265[local57] += Static284.anInt4690;
						this.anIntArray264[local57] += Static431.anInt7550;
					}
				}
			}
		} else {
			@Pc(1199) Class266 local1199;
			@Pc(1204) Class329 local1204;
			if (arg0 == 5) {
				if (this.anIntArrayArray31 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray31.length > local35) {
							local160 = this.anIntArrayArray31[local35];
							for (local162 = 0; local162 < local160.length; local162++) {
								local57 = local160[local162];
								local63 = (this.aByteArray32[local57] & 0xFF) + (arg2 * 8);
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray32[local57] = (byte) local63;
							}
							if (local160.length > 0 && this.aClass53_5 != null) {
								this.aClass53_5.anInterface2_1 = null;
							}
						}
					}
					if (this.aClass266Array1 != null) {
						for (local35 = 0; local35 < this.anInt1959; local35++) {
							local1199 = this.aClass266Array1[local35];
							local1204 = this.aClass329Array1[local35];
							local1204.anInt9144 = 255 - (this.aByteArray32[local1199.anInt7544] & 0xFF) << 24 | local1204.anInt9144 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1456) Class329 local1456;
				if (arg0 == 8) {
					if (this.anIntArrayArray30 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray30.length > local35) {
								local160 = this.anIntArrayArray30[local35];
								for (local162 = 0; local162 < local160.length; local162++) {
									local1456 = this.aClass329Array1[local160[local162]];
									local1456.anInt9146 += arg2;
									local1456.anInt9138 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray30 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray30.length) {
								local160 = this.anIntArrayArray30[local35];
								for (local162 = 0; local162 < local160.length; local162++) {
									local1456 = this.aClass329Array1[local160[local162]];
									local1456.anInt9143 = local1456.anInt9143 * arg3 >> 7;
									local1456.anInt9140 = local1456.anInt9140 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray30 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray30.length > local35) {
							local160 = this.anIntArrayArray30[local35];
							for (local162 = 0; local162 < local160.length; local162++) {
								local1456 = this.aClass329Array1[local160[local162]];
								local1456.anInt9145 = arg2 + local1456.anInt9145 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray31 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray31.length) {
						local160 = this.anIntArrayArray31[local35];
						for (local162 = 0; local162 < local160.length; local162++) {
							local57 = local160[local162];
							local63 = this.aShortArray39[local57] & 0xFFFF;
							local271 = local63 >> 10 & 0x3F;
							local290 = local63 >> 7 & 0x7;
							local743 = local63 & 0x7F;
							@Pc(1301) int local1301 = local271 + arg2 & 0x3F;
							local290 += arg3 / 4;
							local743 += arg4;
							if (local290 < 0) {
								local290 = 0;
							} else if (local290 > 7) {
								local290 = 7;
							}
							if (local743 < 0) {
								local743 = 0;
							} else if (local743 > 127) {
								local743 = 127;
							}
							this.aShortArray39[local57] = (short) (local1301 << 10 | local290 << 7 | local743);
						}
						if (local160.length > 0 && this.aClass53_5 != null) {
							this.aClass53_5.anInterface2_1 = null;
						}
					}
				}
				if (this.aClass266Array1 != null) {
					for (local35 = 0; local35 < this.anInt1959; local35++) {
						local1199 = this.aClass266Array1[local35];
						local1204 = this.aClass329Array1[local35];
						local1204.anInt9144 = local1204.anInt9144 & 0xFF000000 | Static101.anIntArray262[this.aShortArray39[local1199.anInt7544] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!q;Lclient!qn;I)V")
	@Override
	public void method4689(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class102_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1923 == 0) {
			return;
		}
		@Pc(16) Class34_Sub2 local16 = this.aClass121_Sub3_11.aClass34_Sub2_4;
		if (!this.aBoolean127) {
			this.method1686();
		}
		@Pc(25) Class34_Sub2 local25 = (Class34_Sub2) arg0;
		Static355.aFloat140 = local16.aFloat36 + local25.aFloat28 * local16.aFloat27 + local16.aFloat34 * local25.aFloat33 + local25.aFloat36 * local16.aFloat32;
		Static426.aFloat171 = local25.aFloat35 * local16.aFloat34 + local16.aFloat27 * local25.aFloat30 + local16.aFloat32 * local25.aFloat27;
		@Pc(72) float local72 = (float) this.aShort50 * Static426.aFloat171 + Static355.aFloat140;
		@Pc(80) float local80 = Static355.aFloat140 + Static426.aFloat171 * (float) this.aShort48;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local96 = local72 + (float) this.aShort44;
			local90 = local80 - (float) this.aShort44;
		} else {
			local90 = local72 - (float) this.aShort44;
			local96 = local80 + (float) this.aShort44;
		}
		if (this.aClass121_Sub3_11.aFloat144 <= local90 || local96 <= (float) this.aClass121_Sub3_11.anInt6833) {
			return;
		}
		Static553.aFloat203 = local16.aFloat37 * local25.aFloat35 + local16.aFloat35 * local25.aFloat30 + local16.aFloat29 * local25.aFloat27;
		Static16.aFloat7 = local25.aFloat28 * local16.aFloat35 + local25.aFloat33 * local16.aFloat37 + local16.aFloat29 * local25.aFloat36 + local16.aFloat33;
		@Pc(172) float local172 = Static553.aFloat203 * (float) this.aShort50 + Static16.aFloat7;
		@Pc(180) float local180 = Static553.aFloat203 * (float) this.aShort48 + Static16.aFloat7;
		@Pc(207) float local207;
		@Pc(195) float local195;
		if (local180 < local172) {
			local195 = (float) this.aClass121_Sub3_11.anInt6821 * (local172 + (float) this.aShort44);
			local207 = (float) this.aClass121_Sub3_11.anInt6821 * ((float) -this.aShort44 + local180);
		} else {
			local207 = (float) this.aClass121_Sub3_11.anInt6821 * (local172 - (float) this.aShort44);
			local195 = ((float) this.aShort44 + local180) * (float) this.aClass121_Sub3_11.anInt6821;
		}
		if (local207 / local96 >= this.aClass121_Sub3_11.aFloat164 || local195 / local96 <= this.aClass121_Sub3_11.aFloat165) {
			return;
		}
		Static253.aFloat59 = local16.aFloat28 + local25.aFloat28 * local16.aFloat30 + local25.aFloat33 * local16.aFloat38 + local25.aFloat36 * local16.aFloat31;
		Static266.aFloat82 = local16.aFloat38 * local25.aFloat35 + local25.aFloat30 * local16.aFloat30 + local25.aFloat27 * local16.aFloat31;
		@Pc(296) float local296 = (float) this.aShort50 * Static266.aFloat82 + Static253.aFloat59;
		@Pc(304) float local304 = Static253.aFloat59 + Static266.aFloat82 * (float) this.aShort48;
		@Pc(330) float local330;
		@Pc(319) float local319;
		if (local296 > local304) {
			local330 = (float) this.aClass121_Sub3_11.anInt6831 * (local304 - (float) this.aShort44);
			local319 = (float) this.aClass121_Sub3_11.anInt6831 * (local296 + (float) this.aShort44);
		} else {
			local319 = (float) this.aClass121_Sub3_11.anInt6831 * (local304 + (float) this.aShort44);
			local330 = (local296 - (float) this.aShort44) * (float) this.aClass121_Sub3_11.anInt6831;
		}
		if (this.aClass121_Sub3_11.aFloat154 <= local330 / local96 || local319 / local96 <= this.aClass121_Sub3_11.aFloat149) {
			return;
		}
		if (arg1 != null || this.aClass266Array1 != null) {
			Static256.aFloat60 = local25.aFloat29 * local16.aFloat37 + local25.aFloat31 * local16.aFloat35 + local25.aFloat32 * local16.aFloat29;
			Static511.aFloat181 = local16.aFloat32 * local25.aFloat34 + local16.aFloat27 * local25.aFloat38 + local25.aFloat37 * local16.aFloat34;
			Static187.aFloat46 = local25.aFloat34 * local16.aFloat31 + local25.aFloat38 * local16.aFloat30 + local16.aFloat38 * local25.aFloat37;
			Static291.aFloat87 = local25.aFloat34 * local16.aFloat29 + local25.aFloat38 * local16.aFloat35 + local25.aFloat37 * local16.aFloat37;
			Static383.aFloat142 = local25.aFloat32 * local16.aFloat31 + local16.aFloat30 * local25.aFloat31 + local16.aFloat38 * local25.aFloat29;
			Static323.aFloat131 = local25.aFloat31 * local16.aFloat27 + local16.aFloat34 * local25.aFloat29 + local16.aFloat32 * local25.aFloat32;
		}
		if (arg1 != null) {
			@Pc(489) boolean local489 = false;
			@Pc(491) boolean local491 = true;
			@Pc(499) int local499 = this.aShort47 + this.aShort45 >> 1;
			@Pc(507) int local507 = this.aShort43 + this.aShort46 >> 1;
			@Pc(526) int local526 = (int) (Static256.aFloat60 * (float) local507 + Static16.aFloat7 + Static291.aFloat87 * (float) local499 + (float) this.aShort50 * Static553.aFloat203);
			@Pc(545) int local545 = (int) (Static253.aFloat59 + Static187.aFloat46 * (float) local499 + (float) this.aShort50 * Static266.aFloat82 + Static383.aFloat142 * (float) local507);
			@Pc(564) int local564 = (int) (Static323.aFloat131 * (float) local507 + Static426.aFloat171 * (float) this.aShort50 + Static355.aFloat140 + (float) local499 * Static511.aFloat181);
			if (local564 < this.aClass121_Sub3_11.anInt6833) {
				local489 = true;
			} else {
				arg1.anInt7450 = this.aClass121_Sub3_11.anInt6838 + local526 * this.aClass121_Sub3_11.anInt6821 / local564;
				arg1.anInt7449 = local545 * this.aClass121_Sub3_11.anInt6831 / local564 + this.aClass121_Sub3_11.anInt6841;
			}
			@Pc(619) int local619 = (int) (Static553.aFloat203 * (float) this.aShort48 + Static16.aFloat7 + Static291.aFloat87 * (float) local499 + (float) local507 * Static256.aFloat60);
			@Pc(638) int local638 = (int) (Static383.aFloat142 * (float) local507 + Static266.aFloat82 * (float) this.aShort48 + Static187.aFloat46 * (float) local499 + Static253.aFloat59);
			@Pc(657) int local657 = (int) (Static511.aFloat181 * (float) local499 + Static355.aFloat140 + Static426.aFloat171 * (float) this.aShort48 + (float) local507 * Static323.aFloat131);
			if (this.aClass121_Sub3_11.anInt6833 > local657) {
				local489 = true;
			} else {
				arg1.anInt7452 = this.aClass121_Sub3_11.anInt6821 * local619 / local657 + this.aClass121_Sub3_11.anInt6838;
				arg1.anInt7448 = local638 * this.aClass121_Sub3_11.anInt6831 / local657 + this.aClass121_Sub3_11.anInt6841;
			}
			if (local489) {
				if (local564 < this.aClass121_Sub3_11.anInt6833 && local657 < this.aClass121_Sub3_11.anInt6833) {
					local491 = false;
				} else {
					@Pc(726) int local726;
					@Pc(737) int local737;
					@Pc(764) int local764;
					if (local564 < this.aClass121_Sub3_11.anInt6833) {
						local726 = (local657 - this.aClass121_Sub3_11.anInt6833 << 16) / (local657 - local564);
						local737 = local619 + ((local619 - local526) * local726 >> 16);
						arg1.anInt7450 = this.aClass121_Sub3_11.anInt6838 + local737 * this.aClass121_Sub3_11.anInt6821 / this.aClass121_Sub3_11.anInt6833;
						local764 = local638 + (local726 * (local638 - local545) >> 16);
						arg1.anInt7449 = this.aClass121_Sub3_11.anInt6841 + local764 * this.aClass121_Sub3_11.anInt6831 / this.aClass121_Sub3_11.anInt6833;
					} else if (local657 < this.aClass121_Sub3_11.anInt6833) {
						local726 = (local564 - this.aClass121_Sub3_11.anInt6833 << 16) / (local564 - local657);
						local737 = (local726 * (local526 - local619) >> 16) + local526;
						arg1.anInt7450 = this.aClass121_Sub3_11.anInt6821 * local737 / this.aClass121_Sub3_11.anInt6833 + this.aClass121_Sub3_11.anInt6838;
						local764 = (local726 * (local545 - local638) >> 16) + local545;
						arg1.anInt7449 = local764 * this.aClass121_Sub3_11.anInt6831 / this.aClass121_Sub3_11.anInt6833 + this.aClass121_Sub3_11.anInt6841;
					}
				}
			}
			if (local491) {
				arg1.aBoolean515 = true;
				if (local657 >= local564) {
					arg1.anInt7451 = (local619 + this.aShort44) * this.aClass121_Sub3_11.anInt6821 / local657 + this.aClass121_Sub3_11.anInt6838 - arg1.anInt7452;
				} else {
					arg1.anInt7451 = this.aClass121_Sub3_11.anInt6838 + (this.aShort44 + local526) * this.aClass121_Sub3_11.anInt6821 / local564 - arg1.anInt7450;
				}
			}
		}
		this.aClass121_Sub3_11.method5693();
		this.aClass121_Sub3_11.method5668(local25);
		this.method1684();
		this.aClass121_Sub3_11.method5662();
		this.method1683();
	}

	@OriginalMember(owner = "client!eca", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean127) {
			this.method1686();
		}
		return this.aShort44;
	}

	@OriginalMember(owner = "client!eca", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class6_Sub1_Sub12 Z(@OriginalArg(0) Class6_Sub1_Sub12 arg0) {
		if (this.anInt1923 == 0) {
			return null;
		}
		if (!this.aBoolean127) {
			this.method1686();
		}
		@Pc(39) int local39;
		@Pc(56) int local56;
		if (this.aClass121_Sub3_11.anInt6826 > 0) {
			local39 = this.aShort45 - (this.aClass121_Sub3_11.anInt6826 * this.aShort48 >> 8) >> this.aClass121_Sub3_11.anInt6798;
			local56 = this.aShort47 - (this.aClass121_Sub3_11.anInt6826 * this.aShort50 >> 8) >> this.aClass121_Sub3_11.anInt6798;
		} else {
			local39 = this.aShort45 - (this.aClass121_Sub3_11.anInt6826 * this.aShort50 >> 8) >> this.aClass121_Sub3_11.anInt6798;
			local56 = this.aShort47 - (this.aShort48 * this.aClass121_Sub3_11.anInt6826 >> 8) >> this.aClass121_Sub3_11.anInt6798;
		}
		@Pc(112) int local112;
		@Pc(129) int local129;
		if (this.aClass121_Sub3_11.anInt6810 <= 0) {
			local112 = this.aShort46 - (this.aShort50 * this.aClass121_Sub3_11.anInt6810 >> 8) >> this.aClass121_Sub3_11.anInt6798;
			local129 = this.aShort43 - (this.aShort48 * this.aClass121_Sub3_11.anInt6810 >> 8) >> this.aClass121_Sub3_11.anInt6798;
		} else {
			local112 = this.aShort46 - (this.aClass121_Sub3_11.anInt6810 * this.aShort48 >> 8) >> this.aClass121_Sub3_11.anInt6798;
			local129 = this.aShort43 - (this.aShort50 * this.aClass121_Sub3_11.anInt6810 >> 8) >> this.aClass121_Sub3_11.anInt6798;
		}
		@Pc(172) int local172 = local56 + 1 - local39;
		@Pc(179) int local179 = local129 + 1 - local112;
		@Pc(182) Class6_Sub1_Sub12_Sub2 local182 = (Class6_Sub1_Sub12_Sub2) arg0;
		@Pc(192) Class6_Sub1_Sub12_Sub2 local192;
		if (local182 != null && local182.method7080(local172, local179)) {
			local192 = local182;
			local182.method7079();
		} else {
			local192 = new Class6_Sub1_Sub12_Sub2(this.aClass121_Sub3_11, local172, local179);
		}
		local192.method7075(local112, local56, local39, local129);
		this.method1690(local192);
		return local192;
	}

	@OriginalMember(owner = "client!eca", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.lb == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt1924; local12++) {
			this.anIntArray266[local12] <<= 0x4;
			this.anIntArray265[local12] <<= 0x4;
			this.anIntArray264[local12] <<= 0x4;
		}
		Static284.anInt4690 = 0;
		Static431.anInt7550 = 0;
		Static545.anInt9205 = 0;
		return true;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZ)V")
	private void method1685(@OriginalArg(1) boolean arg0) {
		if (this.anInt1918 * 6 <= this.aClass121_Sub3_11.aClass6_Sub14_Sub1_3.aByteArray88.length) {
			this.aClass121_Sub3_11.aClass6_Sub14_Sub1_3.anInt7244 = 0;
		} else {
			this.aClass121_Sub3_11.aClass6_Sub14_Sub1_3 = new Class6_Sub14_Sub1(this.anInt1918 * 6 + 600);
		}
		@Pc(42) Class6_Sub14_Sub1 local42 = this.aClass121_Sub3_11.aClass6_Sub14_Sub1_3;
		@Pc(48) int local48;
		if (this.aClass121_Sub3_11.aBoolean458) {
			for (local48 = 0; local48 < this.anInt1918; local48++) {
				local42.method5999(this.aShortArray40[local48]);
				local42.method5999(this.aShortArray33[local48]);
				local42.method5999(this.aShortArray41[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt1918; local48++) {
				local42.method6038(this.aShortArray40[local48]);
				local42.method6038(this.aShortArray33[local48]);
				local42.method6038(this.aShortArray41[local48]);
			}
		}
		if (local42.anInt7244 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface19_2 == null) {
				this.anInterface19_2 = this.aClass121_Sub3_11.method5658(local42.anInt7244, true, local42.aByteArray88);
			} else {
				this.anInterface19_2.method6484(local42.aByteArray88, local42.anInt7244);
			}
			this.aClass326_1.anInterface19_5 = this.anInterface19_2;
		} else {
			this.aClass326_1.anInterface19_5 = this.aClass121_Sub3_11.method5658(local42.anInt7244, false, local42.aByteArray88);
		}
		if (!arg0) {
			this.aBoolean126 = true;
		}
	}

	@OriginalMember(owner = "client!eca", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean127) {
			this.method1686();
		}
		return this.aShort50;
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)V")
	private void method1686() {
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = 32767;
		@Pc(16) int local16 = 32767;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = -32768;
		@Pc(22) int local22 = -32768;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1908; local28++) {
			@Pc(35) int local35 = this.anIntArray266[local28];
			@Pc(40) int local40 = this.anIntArray265[local28];
			if (local18 < local35) {
				local18 = local35;
			}
			if (local12 > local35) {
				local12 = local35;
			}
			@Pc(63) int local63 = this.anIntArray264[local28];
			if (local40 > local20) {
				local20 = local40;
			}
			if (local40 < local14) {
				local14 = local40;
			}
			if (local63 > local22) {
				local22 = local63;
			}
			if (local16 > local63) {
				local16 = local63;
			}
			@Pc(95) int local95 = local63 * local63 + local35 * local35;
			if (local95 > local24) {
				local24 = local95;
			}
			local95 = local40 * local40 + local63 * local63 + local35 * local35;
			if (local26 < local95) {
				local26 = local95;
			}
		}
		this.aShort46 = (short) local16;
		this.aShort47 = (short) local18;
		this.aShort50 = (short) local14;
		this.aShort45 = (short) local12;
		this.aShort48 = (short) local20;
		this.aShort43 = (short) local22;
		this.aShort44 = (short) (Math.sqrt((double) local24) + 0.99D);
		Math.sqrt((double) local26);
		this.aBoolean127 = true;
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)V")
	private void method1687() {
		if (!this.aBoolean126) {
			return;
		}
		this.aBoolean126 = false;
		if (this.aClass163Array3 == null && this.aClass250Array3 == null && this.aClass266Array1 == null) {
			if (this.anIntArray266 != null && !Static321.method4979(this.anInt1952, this.anInt1906)) {
				if (this.aClass53_7 != null && this.aClass53_7.anInterface2_1 == null) {
					this.aBoolean126 = true;
				} else {
					if (!this.aBoolean127) {
						this.method1686();
					}
					this.anIntArray266 = null;
				}
			}
			if (this.anIntArray265 != null && !Static298.method4144(this.anInt1952, this.anInt1906)) {
				if (this.aClass53_7 != null && this.aClass53_7.anInterface2_1 == null) {
					this.aBoolean126 = true;
				} else {
					if (!this.aBoolean127) {
						this.method1686();
					}
					this.anIntArray265 = null;
				}
			}
			if (this.anIntArray264 != null && !Static54.method691(this.anInt1906, this.anInt1952)) {
				if (this.aClass53_7 != null && this.aClass53_7.anInterface2_1 == null) {
					this.aBoolean126 = true;
				} else {
					if (!this.aBoolean127) {
						this.method1686();
					}
					this.anIntArray264 = null;
				}
			}
		}
		if (this.aShortArray37 != null && this.anIntArray266 == null && this.anIntArray265 == null && this.anIntArray264 == null) {
			this.aShortArray37 = null;
			this.anIntArray263 = null;
		}
		if (this.aByteArray33 != null && !Static42.method7541(this.anInt1952, this.anInt1906)) {
			if (this.aClass53_6 == null) {
				if (this.aClass53_5 != null && this.aClass53_5.anInterface2_1 == null) {
					this.aBoolean126 = true;
				} else {
					this.aByteArray33 = null;
					this.aShortArray38 = this.aShortArray35 = this.aShortArray34 = null;
				}
			} else if (this.aClass53_6.anInterface2_1 == null) {
				this.aBoolean126 = true;
			} else {
				this.aShortArray38 = this.aShortArray35 = this.aShortArray34 = null;
				this.aByteArray33 = null;
			}
		}
		if (this.aShortArray39 != null && !Static544.method7517(this.anInt1906, this.anInt1952)) {
			if (this.aClass53_5 != null && this.aClass53_5.anInterface2_1 == null) {
				this.aBoolean126 = true;
			} else {
				this.aShortArray39 = null;
			}
		}
		if (this.aByteArray32 != null && !Static571.method7813(this.anInt1952, this.anInt1906)) {
			if (this.aClass53_5 != null && this.aClass53_5.anInterface2_1 == null) {
				this.aBoolean126 = true;
			} else {
				this.aByteArray32 = null;
			}
		}
		if (this.aFloatArray9 != null && !Static489.method6755(this.anInt1952, this.anInt1906)) {
			if (this.aClass53_4 != null && this.aClass53_4.anInterface2_1 == null) {
				this.aBoolean126 = true;
			} else {
				this.aFloatArray9 = this.aFloatArray10 = null;
			}
		}
		if (this.aShortArray36 != null && !Static171.method2652(this.anInt1906, this.anInt1952)) {
			if (this.aClass53_5 != null && this.aClass53_5.anInterface2_1 == null) {
				this.aBoolean126 = true;
			} else {
				this.aShortArray36 = null;
			}
		}
		if (this.aShortArray40 != null && !Static66.method871(this.anInt1906, this.anInt1952)) {
			if ((this.aClass326_1 == null || this.aClass326_1.anInterface19_5 != null) && (this.aClass53_5 == null || this.aClass53_5.anInterface2_1 != null)) {
				this.aShortArray40 = this.aShortArray33 = this.aShortArray41 = null;
			} else {
				this.aBoolean126 = true;
			}
		}
		if (this.anIntArrayArray31 != null && !Static93.method1476(this.anInt1952, this.anInt1906)) {
			this.anIntArrayArray31 = null;
			this.aShortArray32 = null;
		}
		if (this.lb != null && !Static120.method1815(this.anInt1952, this.anInt1906)) {
			this.lb = null;
			this.aShortArray31 = null;
		}
		if (this.anIntArrayArray30 != null && !Static275.method3943(this.anInt1952, this.anInt1906)) {
			this.anIntArrayArray30 = null;
		}
		if (this.anIntArray267 != null && (this.anInt1906 & 0x800) == 0 && (this.anInt1906 & 0x40000) == 0) {
			this.anIntArray267 = null;
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIBS)I")
	private int method1688(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) short arg3) {
		@Pc(12) int local12 = Static101.anIntArray262[Static314.method4889(arg1, arg0)];
		if (arg3 != -1) {
			@Pc(30) Class76 local30 = this.aClass121_Sub3_11.anInterface7_14.method5209(arg3 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte23 & 0xFF;
			@Pc(44) int local44;
			@Pc(72) int local72;
			if (local35 != 0) {
				if (arg1 < 0) {
					local44 = 0;
				} else if (arg1 > 127) {
					local44 = 16777215;
				} else {
					local44 = arg1 * 131586;
				}
				if (local35 == 256) {
					local12 = local44;
				} else {
					local72 = 256 - local35;
					local12 = (local35 * (local44 & 0xFF00) + local72 * (local12 & 0xFF00) & 0xFF0000) + ((local44 & 0xFF00FF) * local35 + (local72 * (local12 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local44 = local30.aByte21 & 0xFF;
			if (local44 != 0) {
				local44 += 256;
				@Pc(120) int local120 = (local12 >> 16 & 0xFF) * local44;
				if (local120 > 65535) {
					local120 = 65535;
				}
				local72 = (local12 >> 8 & 0xFF) * local44;
				if (local72 > 65535) {
					local72 = 65535;
				}
				@Pc(148) int local148 = (local12 & 0xFF) * local44;
				if (local148 > 65535) {
					local148 = 65535;
				}
				local12 = (local148 >> 8) + ((local120 & 0x3000FF00) << 8) + (local72 & 0xFF00);
			}
		}
		return (local12 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!eca", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static284.anInt4690 = 0;
			local11 = 0;
			Static431.anInt7550 = 0;
			Static545.anInt9205 = 0;
			for (local17 = 0; local17 < this.anInt1908; local17++) {
				Static545.anInt9205 += this.anIntArray266[local17];
				Static284.anInt4690 += this.anIntArray265[local17];
				local11++;
				Static431.anInt7550 += this.anIntArray264[local17];
			}
			if (local11 > 0) {
				Static545.anInt9205 = Static545.anInt9205 / local11 + arg1;
				Static284.anInt4690 = Static284.anInt4690 / local11 + arg2;
				Static431.anInt7550 = arg3 + Static431.anInt7550 / local11;
			} else {
				Static545.anInt9205 = arg1;
				Static431.anInt7550 = arg3;
				Static284.anInt4690 = arg2;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt1908; local11++) {
				this.anIntArray266[local11] += arg1;
				this.anIntArray265[local11] += arg2;
				this.anIntArray264[local11] += arg3;
			}
		} else {
			@Pc(163) int local163;
			@Pc(181) int local181;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt1908; local11++) {
					this.anIntArray266[local11] -= Static545.anInt9205;
					this.anIntArray265[local11] -= Static284.anInt4690;
					this.anIntArray264[local11] -= Static431.anInt7550;
					if (arg3 != 0) {
						local17 = Class138.anIntArray392[arg3];
						local163 = Class138.anIntArray393[arg3];
						local181 = local163 * this.anIntArray266[local11] + local17 * this.anIntArray265[local11] + 16383 >> 14;
						this.anIntArray265[local11] = this.anIntArray265[local11] * local163 + 16383 - this.anIntArray266[local11] * local17 >> 14;
						this.anIntArray266[local11] = local181;
					}
					if (arg1 != 0) {
						local17 = Class138.anIntArray392[arg1];
						local163 = Class138.anIntArray393[arg1];
						local181 = local163 * this.anIntArray265[local11] + 16383 - local17 * this.anIntArray264[local11] >> 14;
						this.anIntArray264[local11] = this.anIntArray264[local11] * local163 + local17 * this.anIntArray265[local11] + 16383 >> 14;
						this.anIntArray265[local11] = local181;
					}
					if (arg2 != 0) {
						local17 = Class138.anIntArray392[arg2];
						local163 = Class138.anIntArray393[arg2];
						local181 = this.anIntArray264[local11] * local17 + this.anIntArray266[local11] * local163 + 16383 >> 14;
						this.anIntArray264[local11] = local163 * this.anIntArray264[local11] + 16383 - local17 * this.anIntArray266[local11] >> 14;
						this.anIntArray266[local11] = local181;
					}
					this.anIntArray266[local11] += Static545.anInt9205;
					this.anIntArray265[local11] += Static284.anInt4690;
					this.anIntArray264[local11] += Static431.anInt7550;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt1908; local11++) {
					this.anIntArray266[local11] -= Static545.anInt9205;
					this.anIntArray265[local11] -= Static284.anInt4690;
					this.anIntArray264[local11] -= Static431.anInt7550;
					this.anIntArray266[local11] = arg1 * this.anIntArray266[local11] / 128;
					this.anIntArray265[local11] = this.anIntArray265[local11] * arg2 / 128;
					this.anIntArray264[local11] = this.anIntArray264[local11] * arg3 / 128;
					this.anIntArray266[local11] += Static545.anInt9205;
					this.anIntArray265[local11] += Static284.anInt4690;
					this.anIntArray264[local11] += Static431.anInt7550;
				}
			} else {
				@Pc(522) Class266 local522;
				@Pc(527) Class329 local527;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt1922; local11++) {
						local17 = (this.aByteArray32[local11] & 0xFF) + (arg1 * 8);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray32[local11] = (byte) local17;
					}
					if (this.aClass53_5 != null) {
						this.aClass53_5.anInterface2_1 = null;
					}
					if (this.aClass266Array1 != null) {
						for (local17 = 0; local17 < this.anInt1959; local17++) {
							local522 = this.aClass266Array1[local17];
							local527 = this.aClass329Array1[local17];
							local527.anInt9144 = local527.anInt9144 & 0xFFFFFF | 255 - (this.aByteArray32[local522.anInt7544] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt1922; local11++) {
						local17 = this.aShortArray39[local11] & 0xFFFF;
						local163 = local17 >> 10 & 0x3F;
						local181 = local17 >> 7 & 0x7;
						@Pc(584) int local584 = local163 + arg1 & 0x3F;
						local181 += arg2 / 4;
						@Pc(594) int local594 = local17 & 0x7F;
						local594 += arg3;
						if (local181 < 0) {
							local181 = 0;
						} else if (local181 > 7) {
							local181 = 7;
						}
						if (local594 < 0) {
							local594 = 0;
						} else if (local594 > 127) {
							local594 = 127;
						}
						this.aShortArray39[local11] = (short) (local584 << 10 | local181 << 7 | local594);
					}
					if (this.aClass53_5 != null) {
						this.aClass53_5.anInterface2_1 = null;
					}
					if (this.aClass266Array1 != null) {
						for (local17 = 0; local17 < this.anInt1959; local17++) {
							local522 = this.aClass266Array1[local17];
							local527 = this.aClass329Array1[local17];
							local527.anInt9144 = local527.anInt9144 & 0xFF000000 | Static101.anIntArray262[this.aShortArray39[local522.anInt7544] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(706) Class329 local706;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt1959; local11++) {
							local706 = this.aClass329Array1[local11];
							local706.anInt9138 += arg2;
							local706.anInt9146 += arg1;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt1959; local11++) {
							local706 = this.aClass329Array1[local11];
							local706.anInt9140 = arg1 * local706.anInt9140 >> 7;
							local706.anInt9143 = arg2 * local706.anInt9143 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt1959; local11++) {
							local706 = this.aClass329Array1[local11];
							local706.anInt9145 = arg1 + local706.anInt9145 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean127) {
			this.method1686();
		}
		return this.aShort45;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method4698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class34_Sub2 local8 = (Class34_Sub2) arg2;
		@Pc(12) Class34_Sub2 local12 = this.aClass121_Sub3_11.aClass34_Sub2_4;
		@Pc(33) float local33 = local12.aFloat33 + local12.aFloat29 * local8.aFloat36 + local8.aFloat28 * local12.aFloat35 + local12.aFloat37 * local8.aFloat33;
		@Pc(54) float local54 = local12.aFloat28 + local12.aFloat38 * local8.aFloat33 + local12.aFloat30 * local8.aFloat28 + local8.aFloat36 * local12.aFloat31;
		Static266.aFloat82 = local8.aFloat27 * local12.aFloat31 + local12.aFloat30 * local8.aFloat30 + local12.aFloat38 * local8.aFloat35;
		Static383.aFloat142 = local8.aFloat32 * local12.aFloat31 + local12.aFloat30 * local8.aFloat31 + local12.aFloat38 * local8.aFloat29;
		Static323.aFloat131 = local12.aFloat34 * local8.aFloat29 + local8.aFloat31 * local12.aFloat27 + local8.aFloat32 * local12.aFloat32;
		Static187.aFloat46 = local8.aFloat38 * local12.aFloat30 + local12.aFloat38 * local8.aFloat37 + local8.aFloat34 * local12.aFloat31;
		@Pc(147) float local147 = local12.aFloat36 + local12.aFloat27 * local8.aFloat28 + local8.aFloat33 * local12.aFloat34 + local12.aFloat32 * local8.aFloat36;
		Static291.aFloat87 = local8.aFloat38 * local12.aFloat35 + local8.aFloat37 * local12.aFloat37 + local12.aFloat29 * local8.aFloat34;
		Static511.aFloat181 = local12.aFloat27 * local8.aFloat38 + local8.aFloat37 * local12.aFloat34 + local12.aFloat32 * local8.aFloat34;
		Static256.aFloat60 = local12.aFloat37 * local8.aFloat29 + local8.aFloat31 * local12.aFloat35 + local12.aFloat29 * local8.aFloat32;
		Static553.aFloat203 = local12.aFloat37 * local8.aFloat35 + local8.aFloat30 * local12.aFloat35 + local12.aFloat29 * local8.aFloat27;
		Static426.aFloat171 = local8.aFloat35 * local12.aFloat34 + local12.aFloat27 * local8.aFloat30 + local12.aFloat32 * local8.aFloat27;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass121_Sub3_11.anInt6821;
		@Pc(255) int local255 = this.aClass121_Sub3_11.anInt6831;
		if (!this.aBoolean127) {
			this.method1686();
		}
		Static410.anIntArray576[0] = this.aShort45;
		Static452.anIntArray618[0] = this.aShort50;
		Static410.anIntArray576[1] = this.aShort47;
		Static267.anIntArray439[0] = this.aShort46;
		Static452.anIntArray618[1] = this.aShort50;
		Static267.anIntArray439[1] = this.aShort46;
		Static410.anIntArray576[2] = this.aShort45;
		Static452.anIntArray618[2] = this.aShort48;
		Static267.anIntArray439[2] = this.aShort46;
		Static410.anIntArray576[3] = this.aShort47;
		Static452.anIntArray618[3] = this.aShort48;
		Static410.anIntArray576[4] = this.aShort45;
		Static267.anIntArray439[3] = this.aShort46;
		Static452.anIntArray618[4] = this.aShort50;
		Static410.anIntArray576[5] = this.aShort47;
		Static267.anIntArray439[4] = this.aShort43;
		Static452.anIntArray618[5] = this.aShort50;
		Static267.anIntArray439[5] = this.aShort43;
		Static410.anIntArray576[6] = this.aShort45;
		Static452.anIntArray618[6] = this.aShort48;
		Static267.anIntArray439[6] = this.aShort43;
		Static410.anIntArray576[7] = this.aShort47;
		Static452.anIntArray618[7] = this.aShort48;
		Static267.anIntArray439[7] = this.aShort43;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(400) float local400;
		@Pc(390) float local390;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static452.anIntArray618[local383];
			local395 = Static267.anIntArray439[local383];
			local400 = Static410.anIntArray576[local383];
			local414 = Static511.aFloat181 * local400 + local390 * Static426.aFloat171 + Static323.aFloat131 * local395 + local147;
			local428 = local33 + Static553.aFloat203 * local390 + local400 * Static291.aFloat87 + local395 * Static256.aFloat60;
			local442 = local54 + local395 * Static383.aFloat142 + Static187.aFloat46 * local400 + local390 * Static266.aFloat82;
			if (local414 >= (float) this.aClass121_Sub3_11.anInt6833) {
				@Pc(461) float local461 = (float) this.aClass121_Sub3_11.anInt6838 + (float) local251 * local428 / local414;
				if (local461 > local243) {
					local243 = local461;
				}
				@Pc(479) float local479 = (float) local255 * local442 / local414 + (float) this.aClass121_Sub3_11.anInt6841;
				if (local461 < local241) {
					local241 = local461;
				}
				local239 = true;
				if (local245 > local479) {
					local245 = local479;
				}
				if (local247 < local479) {
					local247 = local479;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.anInt1923 > this.aClass121_Sub3_11.anIntArray560.length) {
				this.aClass121_Sub3_11.anIntArray560 = new int[this.anInt1923];
				this.aClass121_Sub3_11.anIntArray559 = new int[this.anInt1923];
			}
			@Pc(558) int[] local558 = this.aClass121_Sub3_11.anIntArray560;
			@Pc(562) int[] local562 = this.aClass121_Sub3_11.anIntArray559;
			@Pc(638) int local638;
			for (@Pc(564) int local564 = 0; local564 < this.anInt1908; local564++) {
				local395 = this.anIntArray264[local564];
				local390 = this.anIntArray265[local564];
				local400 = this.anIntArray266[local564];
				local414 = local147 + Static511.aFloat181 * local400 + local390 * Static426.aFloat171 + Static323.aFloat131 * local395;
				local442 = local54 + local390 * Static266.aFloat82 + local400 * Static187.aFloat46 + local395 * Static383.aFloat142;
				local428 = local33 + Static256.aFloat60 * local395 + Static553.aFloat203 * local390 + local400 * Static291.aFloat87;
				@Pc(645) int local645;
				@Pc(647) int local647;
				@Pc(656) int local656;
				if ((float) this.aClass121_Sub3_11.anInt6833 <= local414) {
					local638 = (int) ((float) local251 * local428 / local414 + (float) this.aClass121_Sub3_11.anInt6838);
					local645 = (int) ((float) this.aClass121_Sub3_11.anInt6841 + local442 * (float) local255 / local414);
					local647 = this.anIntArray263[local564];
					local656 = this.anIntArray263[local564 + 1];
					for (@Pc(719) int local719 = local647; local719 < local656; local719++) {
						@Pc(728) int local728 = this.aShortArray37[local719] - 1;
						if (local728 == -1) {
							break;
						}
						local558[local728] = local638;
						local562[local728] = local645;
					}
				} else {
					local638 = this.anIntArray263[local564];
					local645 = this.anIntArray263[local564 + 1];
					for (local647 = local638; local647 < local645; local647++) {
						local656 = this.aShortArray37[local647] - 1;
						if (local656 == -1) {
							break;
						}
						local558[this.aShortArray37[local647] - 1] = -999999;
					}
				}
			}
			for (local638 = 0; local638 < this.anInt1922; local638++) {
				if (local558[this.aShortArray40[local638]] != -999999 && local558[this.aShortArray33[local638]] != -999999 && local558[this.aShortArray41[local638]] != -999999 && this.method1691(local562[this.aShortArray33[local638]], arg1, local562[this.aShortArray40[local638]], local558[this.aShortArray41[local638]], local558[this.aShortArray40[local638]], arg0, local562[this.aShortArray41[local638]], local558[this.aShortArray33[local638]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!q;Lclient!qn;II)V")
	@Override
	public void method4702(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class102_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1923 == 0) {
			return;
		}
		@Pc(13) Class34_Sub2 local13 = this.aClass121_Sub3_11.aClass34_Sub2_4;
		@Pc(16) Class34_Sub2 local16 = (Class34_Sub2) arg0;
		if (!this.aBoolean127) {
			this.method1686();
		}
		Static355.aFloat140 = local13.aFloat36 + local13.aFloat27 * local16.aFloat28 + local13.aFloat34 * local16.aFloat33 + local16.aFloat36 * local13.aFloat32;
		Static426.aFloat171 = local13.aFloat32 * local16.aFloat27 + local16.aFloat35 * local13.aFloat34 + local16.aFloat30 * local13.aFloat27;
		@Pc(69) float local69 = Static355.aFloat140 + Static426.aFloat171 * (float) this.aShort50;
		@Pc(77) float local77 = (float) this.aShort48 * Static426.aFloat171 + Static355.aFloat140;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = (float) this.aShort44 + local69;
			local93 = local77 - (float) this.aShort44;
		} else {
			local87 = local77 + (float) this.aShort44;
			local93 = (float) -this.aShort44 + local69;
		}
		if (this.aClass121_Sub3_11.aFloat147 <= local93 || (float) this.aClass121_Sub3_11.anInt6833 >= local87) {
			return;
		}
		Static16.aFloat7 = local16.aFloat28 * local13.aFloat35 + local13.aFloat37 * local16.aFloat33 + local13.aFloat29 * local16.aFloat36 + local13.aFloat33;
		Static553.aFloat203 = local13.aFloat29 * local16.aFloat27 + local13.aFloat37 * local16.aFloat35 + local16.aFloat30 * local13.aFloat35;
		@Pc(170) float local170 = Static553.aFloat203 * (float) this.aShort50 + Static16.aFloat7;
		@Pc(178) float local178 = Static16.aFloat7 + (float) this.aShort48 * Static553.aFloat203;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local170 > local178) {
			local193 = (local170 + (float) this.aShort44) * (float) this.aClass121_Sub3_11.anInt6821;
			local204 = (float) this.aClass121_Sub3_11.anInt6821 * (local178 - (float) this.aShort44);
		} else {
			local193 = (float) this.aClass121_Sub3_11.anInt6821 * (local178 + (float) this.aShort44);
			local204 = (float) this.aClass121_Sub3_11.anInt6821 * (local170 - (float) this.aShort44);
		}
		if (this.aClass121_Sub3_11.aFloat164 <= local204 / (float) arg2 || local193 / (float) arg2 <= this.aClass121_Sub3_11.aFloat165) {
			return;
		}
		Static266.aFloat82 = local13.aFloat30 * local16.aFloat30 + local13.aFloat38 * local16.aFloat35 + local13.aFloat31 * local16.aFloat27;
		Static253.aFloat59 = local13.aFloat28 + local13.aFloat38 * local16.aFloat33 + local16.aFloat28 * local13.aFloat30 + local16.aFloat36 * local13.aFloat31;
		@Pc(295) float local295 = Static253.aFloat59 + Static266.aFloat82 * (float) this.aShort50;
		@Pc(303) float local303 = Static253.aFloat59 + Static266.aFloat82 * (float) this.aShort48;
		@Pc(318) float local318;
		@Pc(329) float local329;
		if (local295 > local303) {
			local318 = (local303 - (float) this.aShort44) * (float) this.aClass121_Sub3_11.anInt6831;
			local329 = (float) this.aClass121_Sub3_11.anInt6831 * (local295 + (float) this.aShort44);
		} else {
			local329 = (local303 + (float) this.aShort44) * (float) this.aClass121_Sub3_11.anInt6831;
			local318 = ((float) -this.aShort44 + local295) * (float) this.aClass121_Sub3_11.anInt6831;
		}
		if (this.aClass121_Sub3_11.aFloat154 <= local318 / (float) arg2 || local329 / (float) arg2 <= this.aClass121_Sub3_11.aFloat149) {
			return;
		}
		if (arg1 != null || this.aClass266Array1 != null) {
			Static256.aFloat60 = local13.aFloat35 * local16.aFloat31 + local16.aFloat29 * local13.aFloat37 + local16.aFloat32 * local13.aFloat29;
			Static511.aFloat181 = local16.aFloat34 * local13.aFloat32 + local16.aFloat37 * local13.aFloat34 + local13.aFloat27 * local16.aFloat38;
			Static291.aFloat87 = local13.aFloat35 * local16.aFloat38 + local13.aFloat37 * local16.aFloat37 + local13.aFloat29 * local16.aFloat34;
			Static187.aFloat46 = local13.aFloat31 * local16.aFloat34 + local13.aFloat38 * local16.aFloat37 + local13.aFloat30 * local16.aFloat38;
			Static383.aFloat142 = local16.aFloat29 * local13.aFloat38 + local16.aFloat31 * local13.aFloat30 + local16.aFloat32 * local13.aFloat31;
			Static323.aFloat131 = local16.aFloat32 * local13.aFloat32 + local16.aFloat29 * local13.aFloat34 + local16.aFloat31 * local13.aFloat27;
		}
		if (arg1 != null) {
			@Pc(497) int local497 = this.aShort47 + this.aShort45 >> 1;
			@Pc(505) int local505 = this.aShort46 + this.aShort43 >> 1;
			@Pc(524) int local524 = (int) (Static256.aFloat60 * (float) local505 + (float) local497 * Static291.aFloat87 + Static16.aFloat7 + Static553.aFloat203 * (float) this.aShort50);
			@Pc(543) int local543 = (int) ((float) local505 * Static383.aFloat142 + Static266.aFloat82 * (float) this.aShort50 + Static253.aFloat59 + Static187.aFloat46 * (float) local497);
			@Pc(562) int local562 = (int) ((float) local497 * Static511.aFloat181 + Static355.aFloat140 + Static426.aFloat171 * (float) this.aShort50 + (float) local505 * Static323.aFloat131);
			@Pc(581) int local581 = (int) (Static553.aFloat203 * (float) this.aShort48 + Static16.aFloat7 + (float) local497 * Static291.aFloat87 + Static256.aFloat60 * (float) local505);
			@Pc(600) int local600 = (int) (Static253.aFloat59 + Static187.aFloat46 * (float) local497 + Static266.aFloat82 * (float) this.aShort48 + (float) local505 * Static383.aFloat142);
			arg1.anInt7449 = this.aClass121_Sub3_11.anInt6841 + local543 * this.aClass121_Sub3_11.anInt6831 / arg2;
			@Pc(633) int local633 = (int) (Static355.aFloat140 + (float) local497 * Static511.aFloat181 + Static426.aFloat171 * (float) this.aShort48 + Static323.aFloat131 * (float) local505);
			arg1.anInt7452 = local581 * this.aClass121_Sub3_11.anInt6821 / arg2 + this.aClass121_Sub3_11.anInt6838;
			arg1.anInt7450 = this.aClass121_Sub3_11.anInt6821 * local524 / arg2 + this.aClass121_Sub3_11.anInt6838;
			arg1.anInt7448 = this.aClass121_Sub3_11.anInt6841 + this.aClass121_Sub3_11.anInt6831 * local600 / arg2;
			if (local562 < this.aClass121_Sub3_11.anInt6833 && local633 < this.aClass121_Sub3_11.anInt6833) {
				arg1.anInt7451 = this.aClass121_Sub3_11.anInt6821 * (this.aShort44 + local524) / arg2 + this.aClass121_Sub3_11.anInt6838 - arg1.anInt7450;
				arg1.aBoolean515 = true;
			}
		}
		this.aClass121_Sub3_11.method5656((float) arg2);
		this.aClass121_Sub3_11.method5687();
		this.aClass121_Sub3_11.method5668(local16);
		this.method1684();
		this.aClass121_Sub3_11.method5662();
		this.method1683();
	}

	@OriginalMember(owner = "client!eca", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class138.anIntArray392[arg0];
		@Pc(13) int local13 = Class138.anIntArray393[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1908; local15++) {
			@Pc(34) int local34 = this.anIntArray265[local15] * local13 - local9 * this.anIntArray264[local15] >> 14;
			this.anIntArray264[local15] = this.anIntArray264[local15] * local13 + this.anIntArray265[local15] * local9 >> 14;
			this.anIntArray265[local15] = local34;
		}
		if (this.aClass53_7 != null) {
			this.aClass53_7.anInterface2_1 = null;
		}
		this.aBoolean127 = false;
	}

	@OriginalMember(owner = "client!eca", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean127) {
			this.method1686();
		}
		return this.aShort48;
	}

	@OriginalMember(owner = "client!eca", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		this.anInt1906 = arg0;
		if (this.aClass109_1 != null && (this.anInt1906 & 0x10000) == 0) {
			this.aShortArray34 = this.aClass109_1.aShortArray52;
			this.aByteArray33 = this.aClass109_1.aByteArray40;
			this.aShortArray35 = this.aClass109_1.aShortArray53;
			this.aShortArray38 = this.aClass109_1.aShortArray54;
			this.aClass109_1 = null;
		}
		this.aBoolean126 = true;
		this.method1687();
	}

	@OriginalMember(owner = "client!eca", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort51;
	}

	@OriginalMember(owner = "client!eca", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1924; local3++) {
			this.anIntArray266[local3] = this.anIntArray266[local3] + 7 >> 4;
			this.anIntArray265[local3] = this.anIntArray265[local3] + 7 >> 4;
			this.anIntArray264[local3] = this.anIntArray264[local3] + 7 >> 4;
		}
		if (this.aClass53_7 != null) {
			this.aClass53_7.anInterface2_1 = null;
		}
		this.aBoolean127 = false;
	}

	@OriginalMember(owner = "client!eca", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass121_Sub3_11.anInterface7_14;
		for (@Pc(11) int local11 = 0; local11 < this.anInt1922; local11++) {
			if (this.aShortArray36[local11] == arg0) {
				this.aShortArray36[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class76 local48 = local9.method5209(arg0 & 0xFFFF);
			local37 = local48.aByte21;
			local35 = local48.aByte23;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(68) Class76 local68 = local9.method5209(arg1 & 0xFFFF);
			local58 = local68.aByte21;
			local56 = local68.aByte23;
		}
		if (!(local56 != local35 | local37 != local58)) {
			return;
		}
		if (this.aClass266Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt1959; local101++) {
				@Pc(108) Class266 local108 = this.aClass266Array1[local101];
				@Pc(113) Class329 local113 = this.aClass329Array1[local101];
				local113.anInt9144 = local113.anInt9144 & 0xFF000000 | Static101.anIntArray262[this.aShortArray39[local108.anInt7544] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass53_5 != null) {
			this.aClass53_5.anInterface2_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!eca", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.aShort49 = (short) arg0;
		if (this.aClass53_5 != null) {
			this.aClass53_5.anInterface2_1 = null;
		}
		if (this.aClass53_6 != null) {
			this.aClass53_6.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method4693(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class22_Sub2 local8 = (Class22_Sub2) arg0;
		if (this.anInt1922 == 0 || local8.anInt1922 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt1908;
		@Pc(27) int[] local27 = local8.anIntArray266;
		@Pc(30) int[] local30 = local8.anIntArray265;
		@Pc(33) int[] local33 = local8.anIntArray264;
		@Pc(36) short[] local36 = local8.aShortArray38;
		@Pc(39) short[] local39 = local8.aShortArray35;
		@Pc(42) short[] local42 = local8.aShortArray34;
		@Pc(45) byte[] local45 = local8.aByteArray33;
		@Pc(56) short[] local56;
		@Pc(64) short[] local64;
		@Pc(60) short[] local60;
		@Pc(52) byte[] local52;
		if (this.aClass109_1 == null) {
			local56 = null;
			local64 = null;
			local52 = null;
			local60 = null;
		} else {
			local52 = this.aClass109_1.aByteArray40;
			local56 = this.aClass109_1.aShortArray54;
			local60 = this.aClass109_1.aShortArray52;
			local64 = this.aClass109_1.aShortArray53;
		}
		@Pc(85) short[] local85;
		@Pc(81) short[] local81;
		@Pc(93) short[] local93;
		@Pc(89) byte[] local89;
		if (local8.aClass109_1 == null) {
			local89 = null;
			local85 = null;
			local93 = null;
			local81 = null;
		} else {
			local81 = local8.aClass109_1.aShortArray53;
			local85 = local8.aClass109_1.aShortArray54;
			local89 = local8.aClass109_1.aByteArray40;
			local93 = local8.aClass109_1.aShortArray52;
		}
		@Pc(106) int[] local106 = local8.anIntArray263;
		@Pc(109) short[] local109 = local8.aShortArray37;
		if (!local8.aBoolean127) {
			local8.method1686();
		}
		@Pc(118) short local118 = local8.aShort50;
		@Pc(121) short local121 = local8.aShort48;
		@Pc(124) short local124 = local8.aShort45;
		@Pc(127) short local127 = local8.aShort47;
		@Pc(130) short local130 = local8.aShort46;
		@Pc(133) short local133 = local8.aShort43;
		for (@Pc(135) int local135 = 0; local135 < this.anInt1908; local135++) {
			@Pc(145) int local145 = this.anIntArray265[local135] - arg2;
			if (local118 <= local145 && local121 >= local145) {
				@Pc(165) int local165 = this.anIntArray266[local135] - arg1;
				if (local165 >= local124 && local165 <= local127) {
					@Pc(189) int local189 = this.anIntArray264[local135] - arg3;
					if (local189 >= local130 && local189 <= local133) {
						@Pc(207) int local207 = -1;
						@Pc(212) int local212 = this.anIntArray263[local135];
						@Pc(219) int local219 = this.anIntArray263[local135 + 1];
						for (@Pc(221) int local221 = local212; local221 < local219; local221++) {
							local207 = this.aShortArray37[local221] - 1;
							if (local207 == -1 || this.aByteArray33[local207] != 0) {
								break;
							}
						}
						if (local207 != -1) {
							for (@Pc(254) int local254 = 0; local254 < local24; local254++) {
								if (local27[local254] == local165 && local33[local254] == local189 && local30[local254] == local145) {
									local219 = local106[local254 + 1];
									local212 = local106[local254];
									@Pc(287) int local287 = -1;
									for (@Pc(289) int local289 = local212; local289 < local219; local289++) {
										local287 = local109[local289] - 1;
										if (local287 == -1 || local45[local287] != 0) {
											break;
										}
									}
									if (local287 != -1) {
										if (local56 == null) {
											this.aClass109_1 = new Class109();
											local56 = this.aClass109_1.aShortArray54 = Static155.method2277(this.aShortArray38);
											local64 = this.aClass109_1.aShortArray53 = Static155.method2277(this.aShortArray35);
											local60 = this.aClass109_1.aShortArray52 = Static155.method2277(this.aShortArray34);
											local52 = this.aClass109_1.aByteArray40 = Static332.method5088(this.aByteArray33);
										}
										if (local85 == null) {
											@Pc(370) Class109 local370 = local8.aClass109_1 = new Class109();
											local85 = local370.aShortArray54 = Static155.method2277(local36);
											local81 = local370.aShortArray53 = Static155.method2277(local39);
											local93 = local370.aShortArray52 = Static155.method2277(local42);
											local89 = local370.aByteArray40 = Static332.method5088(local45);
										}
										@Pc(403) short local403 = this.aShortArray38[local207];
										@Pc(408) short local408 = this.aShortArray35[local207];
										@Pc(413) short local413 = this.aShortArray34[local207];
										@Pc(418) byte local418 = this.aByteArray33[local207];
										local212 = local106[local254];
										local219 = local106[local254 + 1];
										@Pc(438) int local438;
										for (@Pc(430) int local430 = local212; local430 < local219; local430++) {
											local438 = local109[local430] - 1;
											if (local438 == -1) {
												break;
											}
											if (local89[local438] != 0) {
												local85[local438] += local403;
												local81[local438] += local408;
												local93[local438] += local413;
												local89[local438] += local418;
											}
										}
										local219 = this.anIntArray263[local135 + 1];
										local212 = this.anIntArray263[local135];
										local413 = local42[local287];
										local408 = local39[local287];
										local403 = local36[local287];
										local418 = local45[local287];
										for (local438 = local212; local438 < local219; local438++) {
											@Pc(528) int local528 = this.aShortArray37[local438] - 1;
											if (local528 == -1) {
												break;
											}
											if (local52[local528] != 0) {
												local56[local528] += local403;
												local64[local528] += local408;
												local60[local528] += local413;
												local52[local528] += local418;
											}
										}
										if (this.aClass53_6 == null && this.aClass53_5 != null) {
											this.aClass53_5.anInterface2_1 = null;
										}
										if (this.aClass53_6 != null) {
											this.aClass53_6.anInterface2_1 = null;
										}
										if (local8.aClass53_6 == null && local8.aClass53_5 != null) {
											local8.aClass53_5.anInterface2_1 = null;
										}
										if (local8.aClass53_6 != null) {
											local8.aClass53_6.anInterface2_1 = null;
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

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "()Z")
	@Override
	public boolean method4709() {
		if (this.aShortArray36 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray36.length; local12++) {
			if (this.aShortArray36[local12] != -1 && !this.aClass121_Sub3_11.anInterface7_14.method5207(this.aShortArray36[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "()[Lclient!pp;")
	@Override
	public Class250[] method4692() {
		return this.aClass250Array3;
	}

	@OriginalMember(owner = "client!eca", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class138.anIntArray392[arg0];
		@Pc(13) int local13 = Class138.anIntArray393[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1908; local15++) {
			@Pc(33) int local33 = this.anIntArray266[local15] * local13 + local9 * this.anIntArray264[local15] >> 14;
			this.anIntArray264[local15] = local13 * this.anIntArray264[local15] - this.anIntArray266[local15] * local9 >> 14;
			this.anIntArray266[local15] = local33;
		}
		this.aBoolean127 = false;
		if (this.aClass53_7 != null) {
			this.aClass53_7.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4701(@OriginalArg(0) Class34 arg0) {
		@Pc(8) Class34_Sub2 local8 = (Class34_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass163Array3 != null) {
			for (local13 = 0; local13 < this.aClass163Array3.length; local13++) {
				@Pc(20) Class163 local20 = this.aClass163Array3[local13];
				@Pc(22) Class163 local22 = local20;
				if (local20.aClass163_1 != null) {
					local22 = local20.aClass163_1;
				}
				local22.anInt4051 = (int) (local8.aFloat33 + local8.aFloat29 * (float) this.anIntArray264[local20.anInt4049] + local8.aFloat35 * (float) this.anIntArray265[local20.anInt4049] + (float) this.anIntArray266[local20.anInt4049] * local8.aFloat37);
				local22.anInt4038 = (int) (local8.aFloat28 + local8.aFloat30 * (float) this.anIntArray265[local20.anInt4049] + (float) this.anIntArray266[local20.anInt4049] * local8.aFloat38 + local8.aFloat31 * (float) this.anIntArray264[local20.anInt4049]);
				local22.anInt4047 = (int) (local8.aFloat36 + local8.aFloat27 * (float) this.anIntArray265[local20.anInt4049] + local8.aFloat34 * (float) this.anIntArray266[local20.anInt4049] + local8.aFloat32 * (float) this.anIntArray264[local20.anInt4049]);
				local22.anInt4039 = (int) (local8.aFloat33 + local8.aFloat29 * (float) this.anIntArray264[local20.anInt4044] + (float) this.anIntArray266[local20.anInt4044] * local8.aFloat37 + local8.aFloat35 * (float) this.anIntArray265[local20.anInt4044]);
				local22.anInt4052 = (int) (local8.aFloat38 * (float) this.anIntArray266[local20.anInt4044] + (float) this.anIntArray265[local20.anInt4044] * local8.aFloat30 + local8.aFloat31 * (float) this.anIntArray264[local20.anInt4044] + local8.aFloat28);
				local22.anInt4041 = (int) (local8.aFloat36 + (float) this.anIntArray264[local20.anInt4044] * local8.aFloat32 + (float) this.anIntArray265[local20.anInt4044] * local8.aFloat27 + (float) this.anIntArray266[local20.anInt4044] * local8.aFloat34);
				local22.anInt4043 = (int) (local8.aFloat33 + local8.aFloat37 * (float) this.anIntArray266[local20.anInt4045] + (float) this.anIntArray265[local20.anInt4045] * local8.aFloat35 + local8.aFloat29 * (float) this.anIntArray264[local20.anInt4045]);
				local22.anInt4042 = (int) (local8.aFloat28 + (float) this.anIntArray266[local20.anInt4045] * local8.aFloat38 + (float) this.anIntArray265[local20.anInt4045] * local8.aFloat30 + (float) this.anIntArray264[local20.anInt4045] * local8.aFloat31);
				local22.anInt4048 = (int) (local8.aFloat32 * (float) this.anIntArray264[local20.anInt4045] + (float) this.anIntArray266[local20.anInt4045] * local8.aFloat34 + local8.aFloat27 * (float) this.anIntArray265[local20.anInt4045] + local8.aFloat36);
			}
		}
		if (this.aClass250Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass250Array3.length; local13++) {
			@Pc(365) Class250 local365 = this.aClass250Array3[local13];
			@Pc(367) Class250 local367 = local365;
			if (local365.aClass250_2 != null) {
				local367 = local365.aClass250_2;
			}
			if (local365.aClass34_10 == null) {
				local365.aClass34_10 = local8.method7612();
			} else {
				local365.aClass34_10.la(local8);
			}
			local367.anInt6992 = (int) (local8.aFloat35 * (float) this.anIntArray265[local365.anInt6989] + local8.aFloat37 * (float) this.anIntArray266[local365.anInt6989] + local8.aFloat29 * (float) this.anIntArray264[local365.anInt6989] + local8.aFloat33);
			local367.anInt6988 = (int) ((float) this.anIntArray265[local365.anInt6989] * local8.aFloat30 + local8.aFloat38 * (float) this.anIntArray266[local365.anInt6989] + (float) this.anIntArray264[local365.anInt6989] * local8.aFloat31 + local8.aFloat28);
			local367.anInt6987 = (int) ((float) this.anIntArray265[local365.anInt6989] * local8.aFloat27 + local8.aFloat34 * (float) this.anIntArray266[local365.anInt6989] + (float) this.anIntArray264[local365.anInt6989] * local8.aFloat32 + local8.aFloat36);
		}
	}

	@OriginalMember(owner = "client!eca", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1908; local7++) {
			if (arg0 != 0) {
				this.anIntArray266[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray265[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray264[local7] += arg2;
			}
		}
		if (this.aClass53_7 != null) {
			this.aClass53_7.anInterface2_1 = null;
		}
		this.aBoolean127 = false;
	}

	@OriginalMember(owner = "client!eca", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1908; local7++) {
			if (arg0 != 128) {
				this.anIntArray266[local7] = this.anIntArray266[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray265[local7] = arg1 * this.anIntArray265[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray264[local7] = arg2 * this.anIntArray264[local7] >> 7;
			}
		}
		if (this.aClass53_7 != null) {
			this.aClass53_7.anInterface2_1 = null;
		}
		this.aBoolean127 = false;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(JIFBIILclient!rf;IIF)S")
	private short method1689(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class274 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(16) int local16 = this.anIntArray263[arg6];
		@Pc(23) int local23 = this.anIntArray263[arg6 + 1];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = local16; local27 < local23; local27++) {
			@Pc(34) short local34 = this.aShortArray37[local27];
			if (local34 == 0) {
				local25 = local27;
				break;
			}
			if (arg0 == Static486.aLongArray13[local27]) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray37[local25] = (short) (this.anInt1923 + 1);
		Static486.aLongArray13[local25] = arg0;
		this.aShortArray38[this.anInt1923] = (short) arg4;
		this.aShortArray35[this.anInt1923] = (short) arg7;
		this.aShortArray34[this.anInt1923] = (short) arg1;
		this.aByteArray33[this.anInt1923] = (byte) arg3;
		this.aFloatArray9[this.anInt1923] = arg8;
		this.aFloatArray10[this.anInt1923] = arg2;
		return (short) this.anInt1923++;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZLclient!uh;)V")
	private void method1690(@OriginalArg(1) Class6_Sub1_Sub12_Sub2 arg0) {
		if (this.anInt1923 > this.aClass121_Sub3_11.anIntArray560.length) {
			this.aClass121_Sub3_11.anIntArray559 = new int[this.anInt1923];
			this.aClass121_Sub3_11.anIntArray560 = new int[this.anInt1923];
		}
		@Pc(28) int[] local28 = this.aClass121_Sub3_11.anIntArray560;
		@Pc(32) int[] local32 = this.aClass121_Sub3_11.anIntArray559;
		@Pc(67) int local67;
		@Pc(106) int local106;
		@Pc(115) int local115;
		for (@Pc(40) int local40 = 0; local40 < this.anInt1908; local40++) {
			local67 = (this.anIntArray266[local40] - (this.anIntArray265[local40] * this.aClass121_Sub3_11.anInt6826 >> 8) >> this.aClass121_Sub3_11.anInt6798) - arg0.anInt8702;
			@Pc(92) int local92 = (this.anIntArray264[local40] - (this.aClass121_Sub3_11.anInt6810 * this.anIntArray265[local40] >> 8) >> this.aClass121_Sub3_11.anInt6798) - arg0.anInt8696;
			@Pc(97) int local97 = this.anIntArray263[local40];
			@Pc(104) int local104 = this.anIntArray263[local40 + 1];
			for (local106 = local97; local106 < local104; local106++) {
				local115 = this.aShortArray37[local106] - 1;
				if (local115 == -1) {
					break;
				}
				local28[local115] = local67;
				local32[local115] = local92;
			}
		}
		for (local67 = 0; local67 < this.anInt1918; local67++) {
			if (this.aByteArray32 == null || this.aByteArray32[local67] <= 128) {
				@Pc(156) short local156 = this.aShortArray40[local67];
				@Pc(161) short local161 = this.aShortArray33[local67];
				@Pc(166) short local166 = this.aShortArray41[local67];
				local106 = local28[local156];
				local115 = local28[local161];
				@Pc(178) int local178 = local28[local166];
				@Pc(182) int local182 = local32[local156];
				@Pc(186) int local186 = local32[local161];
				@Pc(190) int local190 = local32[local166];
				if ((local186 - local190) * (local106 - local115) - (local186 - local182) * (-local115 + local178) > 0) {
					arg0.method7078(local106, local178, local182, local190, local115, local186);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIIIIIBI)Z")
	private boolean method1691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg2 && arg0 > arg1 && arg6 > arg1) {
			return false;
		} else if (arg1 > arg2 && arg0 < arg1 && arg1 > arg6) {
			return false;
		} else if (arg4 > arg5 && arg5 < arg7 && arg5 < arg3) {
			return false;
		} else {
			return arg5 <= arg4 || arg7 >= arg5 || arg5 <= arg3;
		}
	}

	@OriginalMember(owner = "client!eca", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1908; local3++) {
			this.anIntArray264[local3] = -this.anIntArray264[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt1923; local29++) {
			this.aShortArray34[local29] = (short) -this.aShortArray34[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt1922; local52++) {
			@Pc(59) short local59 = this.aShortArray40[local52];
			this.aShortArray40[local52] = this.aShortArray41[local52];
			this.aShortArray41[local52] = local59;
		}
		if (this.aClass53_6 == null && this.aClass53_5 != null) {
			this.aClass53_5.anInterface2_1 = null;
		}
		if (this.aClass53_6 != null) {
			this.aClass53_6.anInterface2_1 = null;
		}
		if (this.aClass53_7 != null) {
			this.aClass53_7.anInterface2_1 = null;
		}
		this.aBoolean127 = false;
		if (this.aClass326_1 != null) {
			this.aClass326_1.anInterface19_5 = null;
		}
	}

	@OriginalMember(owner = "client!eca", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class138.anIntArray392[arg0];
		@Pc(13) int local13 = Class138.anIntArray393[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1908; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray265[local15] + local13 * this.anIntArray266[local15] >> 14;
			this.anIntArray265[local15] = local13 * this.anIntArray265[local15] - this.anIntArray266[local15] * local9 >> 14;
			this.anIntArray266[local15] = local34;
		}
		this.aBoolean127 = false;
		if (this.aClass53_7 != null) {
			this.aClass53_7.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!eca", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean127) {
			this.method1686();
		}
		return this.aShort47;
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "()[Lclient!jq;")
	@Override
	public Class163[] method4708() {
		return this.aClass163Array3;
	}

	@OriginalMember(owner = "client!eca", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean127) {
			this.method1686();
		}
		return this.aShort43;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class22 method4699(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(20) Class22_Sub2 local20;
		@Pc(24) Class22_Sub2 local24;
		if (arg0 == 1) {
			local20 = this.aClass121_Sub3_11.aClass22_Sub2_5;
			local24 = this.aClass121_Sub3_11.aClass22_Sub2_8;
		} else if (arg0 == 2) {
			local24 = this.aClass121_Sub3_11.aClass22_Sub2_1;
			local20 = this.aClass121_Sub3_11.aClass22_Sub2_3;
		} else if (arg0 == 3) {
			local20 = this.aClass121_Sub3_11.aClass22_Sub2_6;
			local24 = this.aClass121_Sub3_11.aClass22_Sub2_4;
		} else if (arg0 == 4) {
			local24 = this.aClass121_Sub3_11.aClass22_Sub2_7;
			local20 = this.aClass121_Sub3_11.aClass22_Sub2_9;
		} else if (arg0 == 5) {
			local24 = this.aClass121_Sub3_11.aClass22_Sub2_2;
			local20 = this.aClass121_Sub3_11.aClass22_Sub2_10;
		} else {
			local20 = local24 = new Class22_Sub2(this.aClass121_Sub3_11);
		}
		return this.method1682(arg2, arg0 != 0, local24, arg1, local20);
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "()V")
	@Override
	public void method4706() {
		if (this.anInt1923 <= 0 || this.anInt1918 <= 0) {
			return;
		}
		this.method1692(false);
		if ((this.aByte37 & 0x10) == 0 && this.aClass326_1.anInterface19_5 == null) {
			this.method1685(false);
		}
		this.method1687();
	}

	@OriginalMember(owner = "client!eca", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		if (this.aClass53_5 != null) {
			this.aClass53_5.anInterface2_1 = null;
		}
		this.aShort51 = (short) arg0;
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(IZ)V")
	private void method1692(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass53_5 != null && this.aClass53_5.anInterface2_1 == null;
		@Pc(27) boolean local27 = this.aClass53_6 != null && this.aClass53_6.anInterface2_1 == null;
		@Pc(38) boolean local38 = this.aClass53_7 != null && this.aClass53_7.anInterface2_1 == null;
		@Pc(49) boolean local49 = this.aClass53_4 != null && this.aClass53_4.anInterface2_1 == null;
		if (arg0) {
			local27 &= (this.aByte37 & 0x4) != 0;
			local49 &= (this.aByte37 & 0x8) != 0;
			local16 &= (this.aByte37 & 0x2) != 0;
			local38 &= (this.aByte37 & 0x1) != 0;
		}
		@Pc(100) byte local100 = 0;
		@Pc(104) byte local104 = 0;
		@Pc(106) byte local106 = 0;
		@Pc(108) byte local108 = 0;
		if (local38) {
			local100 = 12;
		}
		if (local16) {
			local104 = local100;
			local100 = (byte) (local100 + 4);
		}
		if (local27) {
			local106 = local100;
			local100 = (byte) (local100 + 12);
		}
		if (local49) {
			local108 = local100;
			local100 = (byte) (local100 + 8);
		}
		if (local100 == 0) {
			return;
		}
		if (this.aClass121_Sub3_11.aClass6_Sub14_Sub1_3.aByteArray88.length < local100 * this.anInt1923) {
			this.aClass121_Sub3_11.aClass6_Sub14_Sub1_3 = new Class6_Sub14_Sub1(local100 * (this.anInt1923 + 100));
		} else {
			this.aClass121_Sub3_11.aClass6_Sub14_Sub1_3.anInt7244 = 0;
		}
		@Pc(186) Class6_Sub14_Sub1 local186 = this.aClass121_Sub3_11.aClass6_Sub14_Sub1_3;
		@Pc(194) int local194;
		@Pc(203) int local203;
		@Pc(231) int local231;
		@Pc(240) int local240;
		if (local38) {
			@Pc(210) int local210;
			@Pc(217) int local217;
			@Pc(222) int local222;
			@Pc(229) int local229;
			if (this.aClass121_Sub3_11.aBoolean458) {
				for (local194 = 0; local194 < this.anInt1908; local194++) {
					local203 = Stream.floatToRawIntBits((float) this.anIntArray266[local194]);
					local210 = Stream.floatToRawIntBits((float) this.anIntArray265[local194]);
					local217 = Stream.floatToRawIntBits((float) this.anIntArray264[local194]);
					local222 = this.anIntArray263[local194];
					local229 = this.anIntArray263[local194 + 1];
					for (local231 = local222; local231 < local229; local231++) {
						local240 = this.aShortArray37[local231] - 1;
						if (local240 == -1) {
							break;
						}
						local186.anInt7244 = local240 * local100;
						local186.method5990(local203);
						local186.method5990(local210);
						local186.method5990(local217);
					}
				}
			} else {
				for (local194 = 0; local194 < this.anInt1908; local194++) {
					local203 = Stream.floatToRawIntBits((float) this.anIntArray266[local194]);
					local210 = Stream.floatToRawIntBits((float) this.anIntArray265[local194]);
					local217 = Stream.floatToRawIntBits((float) this.anIntArray264[local194]);
					local222 = this.anIntArray263[local194];
					local229 = this.anIntArray263[local194 + 1];
					for (local231 = local222; local231 < local229; local231++) {
						local240 = this.aShortArray37[local231] - 1;
						if (local240 == -1) {
							break;
						}
						local186.anInt7244 = local240 * local100;
						local186.method6031(local203);
						local186.method6031(local210);
						local186.method6031(local217);
					}
				}
			}
		}
		@Pc(553) float local553;
		@Pc(456) short[] local456;
		@Pc(460) short[] local460;
		@Pc(452) short[] local452;
		@Pc(464) byte[] local464;
		@Pc(611) float local611;
		if (local16) {
			if (this.aClass53_6 == null) {
				if (this.aClass109_1 == null) {
					local464 = this.aByteArray33;
					local456 = this.aShortArray38;
					local460 = this.aShortArray35;
					local452 = this.aShortArray34;
				} else {
					local452 = this.aClass109_1.aShortArray52;
					local456 = this.aClass109_1.aShortArray54;
					local460 = this.aClass109_1.aShortArray53;
					local464 = this.aClass109_1.aByteArray40;
				}
				@Pc(484) float local484 = this.aClass121_Sub3_11.aFloatArray41[0];
				@Pc(490) float local490 = this.aClass121_Sub3_11.aFloatArray41[1];
				@Pc(496) float local496 = this.aClass121_Sub3_11.aFloatArray41[2];
				@Pc(500) float local500 = this.aClass121_Sub3_11.aFloat150;
				@Pc(510) float local510 = this.aClass121_Sub3_11.aFloat148 * 768.0F / (float) this.aShort49;
				@Pc(520) float local520 = this.aClass121_Sub3_11.aFloat158 * 768.0F / (float) this.aShort49;
				for (@Pc(522) int local522 = 0; local522 < this.anInt1922; local522++) {
					@Pc(542) int local542 = this.method1688(this.aShortArray39[local522], this.aShort51, this.aByteArray32[local522], this.aShortArray36[local522]);
					local553 = this.aClass121_Sub3_11.aFloat143 * (float) (local542 >> 16 & 0xFF);
					@Pc(564) float local564 = this.aClass121_Sub3_11.aFloat163 * (float) (local542 >> 8 & 0xFF);
					@Pc(569) short local569 = this.aShortArray40[local522];
					@Pc(578) float local578 = this.aClass121_Sub3_11.aFloat159 * (float) (local542 >>> 24);
					@Pc(583) short local583 = (short) local464[local569];
					if (local583 == 0) {
						local611 = ((float) local452[local569] * local496 + local490 * (float) local460[local569] + local484 * (float) local456[local569]) * 0.0026041667F;
					} else {
						local611 = (local490 * (float) local460[local569] + (float) local456[local569] * local484 + (float) local452[local569] * local496) / (float) (local583 * 256);
					}
					@Pc(651) float local651 = (local611 < 0.0F ? local520 : local510) * local611 + local500;
					@Pc(656) int local656 = (int) (local651 * local578);
					@Pc(661) int local661 = (int) (local651 * local553);
					if (local656 < 0) {
						local656 = 0;
					} else if (local656 > 255) {
						local656 = 255;
					}
					@Pc(682) int local682 = (int) (local651 * local564);
					if (local661 < 0) {
						local661 = 0;
					} else if (local661 > 255) {
						local661 = 255;
					}
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					local186.anInt7244 = local104 + local100 * local569;
					local186.method6035(local656);
					local186.method6035(local661);
					local186.method6035(local682);
					local186.method6035(255 - (this.aByteArray32[local522] & 0xFF));
					local569 = this.aShortArray33[local522];
					local583 = local464[local569];
					if (local583 == 0) {
						local611 = (local496 * (float) local452[local569] + (float) local460[local569] * local490 + local484 * (float) local456[local569]) * 0.0026041667F;
					} else {
						local611 = ((float) local460[local569] * local490 + (float) local456[local569] * local484 + local496 * (float) local452[local569]) / (float) (local583 * 256);
					}
					local651 = local500 + (local611 < 0.0F ? local520 : local510) * local611;
					local656 = (int) (local651 * local578);
					if (local656 < 0) {
						local656 = 0;
					} else if (local656 > 255) {
						local656 = 255;
					}
					local661 = (int) (local651 * local553);
					local682 = (int) (local651 * local564);
					if (local661 < 0) {
						local661 = 0;
					} else if (local661 > 255) {
						local661 = 255;
					}
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					local186.anInt7244 = local100 * local569 + local104;
					local186.method6035(local656);
					local186.method6035(local661);
					local186.method6035(local682);
					local186.method6035(255 - (this.aByteArray32[local522] & 0xFF));
					local569 = this.aShortArray41[local522];
					local583 = local464[local569];
					if (local583 == 0) {
						local611 = ((float) local460[local569] * local490 + local484 * (float) local456[local569] + local496 * (float) local452[local569]) * 0.0026041667F;
					} else {
						local611 = (local496 * (float) local452[local569] + (float) local456[local569] * local484 + (float) local460[local569] * local490) / (float) (local583 * 256);
					}
					local651 = local500 + (local611 < 0.0F ? local520 : local510) * local611;
					local656 = (int) (local651 * local578);
					if (local656 < 0) {
						local656 = 0;
					} else if (local656 > 255) {
						local656 = 255;
					}
					local661 = (int) (local651 * local553);
					if (local661 < 0) {
						local661 = 0;
					} else if (local661 > 255) {
						local661 = 255;
					}
					local682 = (int) (local651 * local564);
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					local186.anInt7244 = local104 + local100 * local569;
					local186.method6035(local656);
					local186.method6035(local661);
					local186.method6035(local682);
					local186.method6035(255 - (this.aByteArray32[local522] & 0xFF));
				}
			} else {
				for (local194 = 0; local194 < this.anInt1922; local194++) {
					local203 = this.method1688(this.aShortArray39[local194], this.aShort51, this.aByteArray32[local194], this.aShortArray36[local194]);
					local186.anInt7244 = local104 + local100 * this.aShortArray40[local194];
					local186.method5990(local203);
					local186.anInt7244 = this.aShortArray33[local194] * local100 + local104;
					local186.method5990(local203);
					local186.anInt7244 = local104 + local100 * this.aShortArray41[local194];
					local186.method5990(local203);
				}
			}
		}
		if (local27) {
			if (this.aClass109_1 == null) {
				local456 = this.aShortArray38;
				local464 = this.aByteArray33;
				local460 = this.aShortArray35;
				local452 = this.aShortArray34;
			} else {
				local464 = this.aClass109_1.aByteArray40;
				local456 = this.aClass109_1.aShortArray54;
				local460 = this.aClass109_1.aShortArray53;
				local452 = this.aClass109_1.aShortArray52;
			}
			@Pc(1108) float local1108 = 3.0F / (float) this.aShort49;
			local611 = 3.0F / (float) (this.aShort49 + this.aShort49 / 2);
			local186.anInt7244 = local106;
			if (this.aClass121_Sub3_11.aBoolean458) {
				for (local231 = 0; local231 < this.anInt1923; local231++) {
					local240 = local464[local231] & 0xFF;
					if (local240 == 0) {
						local186.method3726((float) local456[local231] * local611);
						local186.method3726((float) local460[local231] * local611);
						local186.method3726((float) local452[local231] * local611);
					} else {
						local553 = local1108 / (float) local240;
						local186.method3726((float) local456[local231] * local553);
						local186.method3726((float) local460[local231] * local553);
						local186.method3726(local553 * (float) local452[local231]);
					}
					local186.anInt7244 += local100 - 12;
				}
			} else {
				for (local231 = 0; local231 < this.anInt1923; local231++) {
					local240 = local464[local231] & 0xFF;
					if (local240 == 0) {
						local186.method3725(local611 * (float) local456[local231]);
						local186.method3725((float) local460[local231] * local611);
						local186.method3725((float) local452[local231] * local611);
					} else {
						local553 = local1108 / (float) local240;
						local186.method3725((float) local456[local231] * local553);
						local186.method3725((float) local460[local231] * local553);
						local186.method3725((float) local452[local231] * local553);
					}
					local186.anInt7244 += local100 - 12;
				}
			}
		}
		if (local49) {
			local186.anInt7244 = local108;
			if (this.aClass121_Sub3_11.aBoolean458) {
				for (local194 = 0; local194 < this.anInt1923; local194++) {
					local186.method3726(this.aFloatArray9[local194]);
					local186.method3726(this.aFloatArray10[local194]);
					local186.anInt7244 += local100 - 8;
				}
			} else {
				for (local194 = 0; local194 < this.anInt1923; local194++) {
					local186.method3725(this.aFloatArray9[local194]);
					local186.method3725(this.aFloatArray10[local194]);
					local186.anInt7244 += local100 - 8;
				}
			}
		}
		local186.anInt7244 = local100 * this.anInt1923;
		@Pc(1420) Interface2 local1420;
		if (arg0) {
			if (this.anInterface2_3 == null) {
				this.anInterface2_3 = this.aClass121_Sub3_11.method5654(true, local186.aByteArray88, local100, local186.anInt7244);
			} else {
				this.anInterface2_3.method6952(local186.anInt7244, local186.aByteArray88, local100);
			}
			local1420 = this.anInterface2_3;
			this.aByte37 = 0;
		} else {
			local1420 = this.aClass121_Sub3_11.method5654(false, local186.aByteArray88, local100, local186.anInt7244);
			this.aBoolean126 = true;
		}
		if (local38) {
			this.aClass53_7.aByte14 = 0;
			this.aClass53_7.anInterface2_1 = local1420;
		}
		if (local49) {
			this.aClass53_4.aByte14 = local108;
			this.aClass53_4.anInterface2_1 = local1420;
		}
		if (local16) {
			this.aClass53_5.anInterface2_1 = local1420;
			this.aClass53_5.aByte14 = local104;
		}
		if (local27) {
			this.aClass53_6.anInterface2_1 = local1420;
			this.aClass53_6.aByte14 = local106;
		}
	}
}
