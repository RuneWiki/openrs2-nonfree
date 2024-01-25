import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "[F")
	private float[] aFloatArray1;

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "S")
	private short aShort1;

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "[Lclient!gr;")
	private Class97[] aClass97Array1;

	@OriginalMember(owner = "client!ag", name = "C", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ag", name = "E", descriptor = "[F")
	private float[] aFloatArray2;

	@OriginalMember(owner = "client!ag", name = "G", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "Lclient!tu;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!ag", name = "X", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!ag", name = "Y", descriptor = "S")
	private short aShort2;

	@OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!ag", name = "bb", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!ag", name = "fb", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!ag", name = "jb", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!ag", name = "kb", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!ag", name = "ob", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!ag", name = "rb", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!ag", name = "wb", descriptor = "Lclient!ws;")
	private Class269 aClass269_1;

	@OriginalMember(owner = "client!ag", name = "zb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!ag", name = "Bb", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!ag", name = "Eb", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ag", name = "Hb", descriptor = "B")
	private byte aByte1;

	@OriginalMember(owner = "client!ag", name = "Kb", descriptor = "[Lclient!il;")
	private Class120[] aClass120Array1;

	@OriginalMember(owner = "client!ag", name = "Lb", descriptor = "[Lclient!e;")
	private Class56[] aClass56Array1;

	@OriginalMember(owner = "client!ag", name = "Mb", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!ag", name = "Pb", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!ag", name = "Sb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!ag", name = "Vb", descriptor = "Lclient!gf;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!ag", name = "Wb", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ag", name = "bc", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!ag", name = "cc", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ag", name = "hc", descriptor = "[Lclient!dn;")
	private Class51[] aClass51Array1;

	@OriginalMember(owner = "client!ag", name = "kc", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!ag", name = "lc", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!ag", name = "qc", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!ag", name = "tc", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ag", name = "Nb", descriptor = "I")
	private int anInt301 = 0;

	@OriginalMember(owner = "client!ag", name = "Db", descriptor = "Z")
	private boolean aBoolean13 = true;

	@OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
	private int anInt280 = 0;

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
	private int anInt276 = 0;

	@OriginalMember(owner = "client!ag", name = "yb", descriptor = "I")
	private int anInt296 = 0;

	@OriginalMember(owner = "client!ag", name = "Qb", descriptor = "I")
	private int anInt303 = 0;

	@OriginalMember(owner = "client!ag", name = "Fb", descriptor = "Z")
	private boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ag", name = "pc", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_4;

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "Lclient!it;")
	private Class124 aClass124_2;

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "Lclient!it;")
	private Class124 aClass124_3;

	@OriginalMember(owner = "client!ag", name = "O", descriptor = "Lclient!it;")
	private Class124 aClass124_1;

	@OriginalMember(owner = "client!ag", name = "Ab", descriptor = "Lclient!it;")
	private Class124 aClass124_4;

	@OriginalMember(owner = "client!ag", name = "qb", descriptor = "Lclient!ed;")
	private Class60 aClass60_1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class7_Sub1(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aClass30_Sub1_4 = arg0;
		this.aClass124_2 = new Class124(null, 5126, 3, 0);
		this.aClass124_3 = new Class124(null, 5126, 2, 0);
		this.aClass124_1 = new Class124(null, 5126, 3, 0);
		this.aClass124_4 = new Class124(null, 5121, 4, 0);
		this.aClass60_1 = new Class60();
	}

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!bv;Lclient!ro;IIII)V")
	public Class7_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt279 = arg2;
		this.aClass30_Sub1_4 = arg0;
		this.anInt266 = arg5;
		if (Static229.method3192(arg2, arg5)) {
			this.aClass124_2 = new Class124(null, 5126, 3, 0);
		}
		if (Static158.method2335(arg5, arg2)) {
			this.aClass124_3 = new Class124(null, 5126, 2, 0);
		}
		if (Static344.method4803(arg5, arg2)) {
			this.aClass124_1 = new Class124(null, 5126, 3, 0);
		}
		if (Static100.method1585(arg5, arg2)) {
			this.aClass124_4 = new Class124(null, 5121, 4, 0);
		}
		if (Static267.method3633(arg2, arg5)) {
			this.aClass60_1 = new Class60();
		}
		@Pc(102) Interface10 local102 = arg0.anInterface10_7;
		@Pc(106) int[] local106 = new int[arg1.anInt6196];
		this.anIntArray22 = new int[arg1.anInt6212 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt6196; local115++) {
			if ((arg1.aByteArray73 == null || arg1.aByteArray73[local115] != 2) && (arg1.aShortArray80 == null || arg1.aShortArray80[local115] == -1 || !local102.method4241(arg1.aShortArray80[local115] & 0xFFFF).aBoolean232)) {
				local106[this.anInt303++] = local115;
				this.anIntArray22[arg1.aShortArray85[local115]]++;
				this.anIntArray22[arg1.aShortArray82[local115]]++;
				this.anIntArray22[arg1.aShortArray78[local115]]++;
			}
		}
		this.anInt280 = this.anInt303;
		@Pc(202) long[] local202 = new long[this.anInt303];
		@Pc(211) boolean local211 = (this.anInt279 & 0x100) != 0;
		@Pc(223) int local223;
		@Pc(234) int local234;
		@Pc(365) int local365;
		label490: for (@Pc(213) int local213 = 0; local213 < this.anInt303; local213++) {
			@Pc(219) int local219 = local106[local213];
			@Pc(221) Class118 local221 = null;
			local223 = 0;
			@Pc(225) byte local225 = 0;
			@Pc(227) byte local227 = 0;
			@Pc(229) byte local229 = 0;
			if (arg1.aClass11Array1 != null) {
				for (local234 = 0; local234 < arg1.aClass11Array1.length; local234++) {
					@Pc(241) Class11 local241 = arg1.aClass11Array1[local234];
					if (local219 == local241.anInt395) {
						@Pc(250) Class102 local250 = Static123.method5298(local241.anInt391);
						if (local250.aBoolean196) {
							local202[local213] = Long.MAX_VALUE;
							this.anInt280--;
							continue label490;
						}
					}
				}
			}
			@Pc(277) short local277 = -1;
			if (arg1.aShortArray80 != null) {
				local277 = arg1.aShortArray80[local219];
				if (local277 != -1) {
					local221 = local102.method4241(local277 & 0xFFFF);
					local227 = local221.aByte56;
					local229 = local221.aByte52;
				}
			}
			@Pc(321) boolean local321 = arg1.aByteArray74 != null && arg1.aByteArray74[local219] != 0 || local221 != null && !local221.aBoolean237;
			if ((local211 || local321) && arg1.aByteArray76 != null) {
				local223 += arg1.aByteArray76[local219] << 17;
			}
			if (local321) {
				local223 += 65536;
			}
			local223 += (local227 & 0xFF) << 8;
			local223 += local229 & 0xFF;
			local365 = local225 + ((local277 & 0xFFFF) << 16);
			@Pc(371) int local371 = local365 + (local213 & 0xFFFF);
			local202[local213] = (long) local371 + ((long) local223 << 32);
		}
		Static23.method488(local106, local202);
		this.aShortArray6 = arg1.aShortArray84;
		this.anIntArray20 = arg1.anIntArray546;
		this.anInt301 = arg1.anInt6207;
		this.anIntArray21 = arg1.anIntArray540;
		this.anIntArray24 = arg1.anIntArray545;
		this.anInt296 = arg1.anInt6212;
		@Pc(418) Class22[] local418 = new Class22[this.anInt296];
		this.aClass120Array1 = arg1.aClass120Array4;
		this.aClass56Array1 = arg1.aClass56Array4;
		@Pc(446) int local446;
		@Pc(460) int local460;
		if (arg1.aClass11Array1 != null) {
			this.anInt283 = arg1.aClass11Array1.length;
			this.aClass51Array1 = new Class51[this.anInt283];
			this.aClass97Array1 = new Class97[this.anInt283];
			for (local446 = 0; local446 < this.anInt283; local446++) {
				@Pc(453) Class11 local453 = arg1.aClass11Array1[local446];
				@Pc(458) Class102 local458 = Static123.method5298(local453.anInt391);
				local460 = -1;
				for (@Pc(462) int local462 = 0; local462 < this.anInt303; local462++) {
					if (local453.anInt395 == local106[local462]) {
						local460 = local462;
						break;
					}
				}
				if (local460 == -1) {
					throw new RuntimeException();
				}
				local234 = Static154.anIntArray246[arg1.aShortArray77[local453.anInt395] & 0xFFFF] & 0xFFFFFF;
				local234 |= 255 - (arg1.aByteArray74 == null ? 0 : arg1.aByteArray74[local453.anInt395]) << 24;
				this.aClass51Array1[local446] = new Class51(local460, arg1.aShortArray85[local453.anInt395], arg1.aShortArray82[local453.anInt395], arg1.aShortArray78[local453.anInt395], local458.anInt2708, local458.anInt2714, local458.anInt2709, local458.anInt2715, local458.anInt2710, local458.aBoolean196, local458.aBoolean195, local453.anInt392);
				this.aClass97Array1[local446] = new Class97(local234);
			}
		}
		local446 = this.anInt303 * 3;
		this.aShortArray8 = new short[this.anInt303];
		if (arg1.aShortArray76 != null) {
			this.aShortArray4 = new short[this.anInt303];
		}
		this.aShortArray10 = new short[this.anInt303];
		this.aShortArray3 = new short[local446];
		this.aShortArray11 = new short[local446];
		this.aFloatArray1 = new float[local446];
		this.aShort9 = (short) arg3;
		this.aShortArray1 = new short[this.anInt303];
		this.aByteArray5 = new byte[local446];
		this.aFloatArray2 = new float[local446];
		Static403.aLongArray8 = new long[local446];
		this.aShortArray5 = new short[this.anInt303];
		this.aShortArray9 = new short[local446];
		this.aByteArray4 = new byte[this.anInt303];
		this.aShortArray2 = new short[this.anInt303];
		this.aShortArray7 = new short[local446];
		this.aShort4 = (short) arg4;
		local223 = 0;
		for (local365 = 0; local365 < arg1.anInt6212; local365++) {
			local460 = this.anIntArray22[local365];
			this.anIntArray22[local365] = local223;
			local418[local365] = new Class22();
			local223 += local460;
		}
		this.anIntArray22[arg1.anInt6212] = local223;
		@Pc(693) int[] local693 = null;
		@Pc(695) int[] local695 = null;
		@Pc(697) int[] local697 = null;
		@Pc(699) float[][] local699 = null;
		@Pc(725) int local725;
		@Pc(764) int local764;
		@Pc(770) int local770;
		@Pc(784) int local784;
		@Pc(786) int local786;
		@Pc(822) int local822;
		@Pc(827) int local827;
		@Pc(998) float local998;
		@Pc(1006) float local1006;
		@Pc(990) float local990;
		if (arg1.aByteArray77 != null) {
			@Pc(705) int local705 = arg1.anInt6203;
			@Pc(708) int[] local708 = new int[local705];
			@Pc(711) int[] local711 = new int[local705];
			@Pc(714) int[] local714 = new int[local705];
			@Pc(717) int[] local717 = new int[local705];
			@Pc(720) int[] local720 = new int[local705];
			@Pc(723) int[] local723 = new int[local705];
			for (local725 = 0; local725 < local705; local725++) {
				local708[local725] = Integer.MAX_VALUE;
				local711[local725] = -2147483647;
				local714[local725] = Integer.MAX_VALUE;
				local717[local725] = -2147483647;
				local720[local725] = Integer.MAX_VALUE;
				local723[local725] = -2147483647;
			}
			local693 = new int[local705];
			for (local764 = 0; local764 < this.anInt303; local764++) {
				local770 = local106[local764];
				if (arg1.aByteArray77[local770] != -1) {
					local784 = arg1.aByteArray77[local770] & 0xFF;
					for (local786 = 0; local786 < 3; local786++) {
						@Pc(798) short local798;
						if (local786 == 0) {
							local798 = arg1.aShortArray85[local770];
						} else if (local786 == 1) {
							local798 = arg1.aShortArray82[local770];
						} else {
							local798 = arg1.aShortArray78[local770];
						}
						local822 = arg1.anIntArray540[local798];
						local827 = arg1.anIntArray546[local798];
						@Pc(832) int local832 = arg1.anIntArray545[local798];
						if (local708[local784] > local822) {
							local708[local784] = local822;
						}
						if (local822 > local711[local784]) {
							local711[local784] = local822;
						}
						if (local827 < local714[local784]) {
							local714[local784] = local827;
						}
						if (local717[local784] < local827) {
							local717[local784] = local827;
						}
						if (local720[local784] > local832) {
							local720[local784] = local832;
						}
						if (local832 > local723[local784]) {
							local723[local784] = local832;
						}
					}
				}
			}
			local695 = new int[local705];
			local697 = new int[local705];
			local699 = new float[local705][];
			for (local770 = 0; local770 < local705; local770++) {
				@Pc(935) byte local935 = arg1.aByteArray72[local770];
				if (local935 > 0) {
					local693[local770] = (local708[local770] + local711[local770]) / 2;
					local695[local770] = (local714[local770] + local717[local770]) / 2;
					local697[local770] = (local723[local770] + local720[local770]) / 2;
					if (local935 == 1) {
						local827 = arg1.anIntArray543[local770];
						local1006 = 64.0F / (float) arg1.anIntArray544[local770];
						if (local827 == 0) {
							local990 = 1.0F;
							local998 = 1.0F;
						} else if (local827 > 0) {
							local998 = 1.0F;
							local990 = (float) local827 / 1024.0F;
						} else {
							local998 = (float) -local827 / 1024.0F;
							local990 = 1.0F;
						}
					} else if (local935 == 2) {
						local990 = 64.0F / (float) arg1.anIntArray548[local770];
						local998 = 64.0F / (float) arg1.anIntArray543[local770];
						local1006 = 64.0F / (float) arg1.anIntArray544[local770];
					} else {
						local998 = (float) arg1.anIntArray543[local770] / 1024.0F;
						local1006 = (float) arg1.anIntArray544[local770] / 1024.0F;
						local990 = (float) arg1.anIntArray548[local770] / 1024.0F;
					}
					local699[local770] = Static366.method5057(local990, local1006, arg1.aShortArray83[local770], arg1.aByteArray78[local770] & 0xFF, arg1.aShortArray81[local770], local998, arg1.aShortArray79[local770]);
				}
			}
		}
		@Pc(1114) Class222[] local1114 = new Class222[arg1.anInt6196];
		@Pc(1133) short local1133;
		@Pc(1144) int local1144;
		@Pc(1155) int local1155;
		@Pc(1215) int local1215;
		for (@Pc(1116) int local1116 = 0; local1116 < arg1.anInt6196; local1116++) {
			@Pc(1123) short local1123 = arg1.aShortArray85[local1116];
			@Pc(1128) short local1128 = arg1.aShortArray82[local1116];
			local1133 = arg1.aShortArray78[local1116];
			local1144 = this.anIntArray21[local1128] - this.anIntArray21[local1123];
			local1155 = this.anIntArray20[local1128] - this.anIntArray20[local1123];
			local725 = this.anIntArray24[local1128] - this.anIntArray24[local1123];
			local764 = this.anIntArray21[local1133] - this.anIntArray21[local1123];
			local770 = this.anIntArray20[local1133] - this.anIntArray20[local1123];
			local784 = this.anIntArray24[local1133] - this.anIntArray24[local1123];
			local786 = local784 * local1155 - local770 * local725;
			local1215 = local725 * local764 - local784 * local1144;
			local822 = local1144 * local770 - local764 * local1155;
			while (local786 > 8192 || local1215 > 8192 || local822 > 8192 || local786 < -8192 || local1215 < -8192 || local822 < -8192) {
				local1215 >>= 0x1;
				local822 >>= 0x1;
				local786 >>= 0x1;
			}
			local827 = (int) Math.sqrt((double) (local786 * local786 + local1215 * local1215 + local822 * local822));
			if (local827 <= 0) {
				local827 = 1;
			}
			local786 = local786 * 256 / local827;
			local1215 = local1215 * 256 / local827;
			local822 = local822 * 256 / local827;
			@Pc(1313) byte local1313 = arg1.aByteArray73 == null ? 0 : arg1.aByteArray73[local1116];
			if (local1313 == 0) {
				@Pc(1322) Class22 local1322 = local418[local1123];
				local1322.anInt684++;
				local1322.anInt683 += local786;
				local1322.anInt686 += local1215;
				local1322.anInt688 += local822;
				@Pc(1350) Class22 local1350 = local418[local1128];
				local1350.anInt686 += local1215;
				local1350.anInt683 += local786;
				local1350.anInt684++;
				local1350.anInt688 += local822;
				@Pc(1378) Class22 local1378 = local418[local1133];
				local1378.anInt683 += local786;
				local1378.anInt688 += local822;
				local1378.anInt686 += local1215;
				local1378.anInt684++;
			} else if (local1313 == 1) {
				@Pc(1417) Class222 local1417 = local1114[local1116] = new Class222();
				local1417.anInt6524 = local1215;
				local1417.anInt6525 = local822;
				local1417.anInt6520 = local786;
			}
		}
		@Pc(1443) int local1443;
		for (@Pc(1437) int local1437 = 0; local1437 < this.anInt303; local1437++) {
			local1443 = local106[local1437];
			@Pc(1450) int local1450 = arg1.aShortArray77[local1443] & 0xFFFF;
			@Pc(1455) short local1455;
			if (arg1.aShortArray80 == null) {
				local1455 = -1;
			} else {
				local1455 = arg1.aShortArray80[local1443];
			}
			if (arg1.aByteArray77 == null) {
				local1155 = -1;
			} else {
				local1155 = arg1.aByteArray77[local1443];
			}
			if (arg1.aByteArray74 == null) {
				local725 = 0;
			} else {
				local725 = arg1.aByteArray74[local1443] & 0xFF;
			}
			@Pc(1490) float local1490 = 0.0F;
			@Pc(1492) float local1492 = 0.0F;
			@Pc(1494) float local1494 = 0.0F;
			local998 = 0.0F;
			local1006 = 0.0F;
			local990 = 0.0F;
			@Pc(1502) byte local1502 = 0;
			@Pc(1504) byte local1504 = 0;
			@Pc(1506) int local1506 = 0;
			@Pc(1540) byte local1540;
			@Pc(1557) short local1557;
			@Pc(2302) short local2302;
			@Pc(2307) short local2307;
			if (local1455 != -1) {
				if (local1155 == -1) {
					local1494 = 1.0F;
					local1006 = 0.0F;
					local990 = 0.0F;
					local1504 = 2;
					local1490 = 0.0F;
					local1492 = 1.0F;
					local1502 = 1;
					local998 = 1.0F;
				} else {
					local1155 &= 0xFF;
					local1540 = arg1.aByteArray72[local1155];
					@Pc(1547) short local1547;
					@Pc(1552) short local1552;
					@Pc(1586) float local1586;
					@Pc(1799) float local1799;
					@Pc(1807) float local1807;
					@Pc(1904) float local1904;
					@Pc(1912) float local1912;
					@Pc(1920) float local1920;
					@Pc(1943) float local1943;
					@Pc(1966) float local1966;
					@Pc(1989) float local1989;
					if (local1540 == 0) {
						local1547 = arg1.aShortArray85[local1443];
						local1552 = arg1.aShortArray82[local1443];
						local1557 = arg1.aShortArray78[local1443];
						local2302 = arg1.aShortArray83[local1155];
						local2307 = arg1.aShortArray79[local1155];
						@Pc(2312) short local2312 = arg1.aShortArray81[local1155];
						@Pc(2318) float local2318 = (float) arg1.anIntArray540[local2302];
						@Pc(2324) float local2324 = (float) arg1.anIntArray546[local2302];
						local1586 = arg1.anIntArray545[local2302];
						local1799 = (float) arg1.anIntArray540[local2307] - local2318;
						local1807 = (float) arg1.anIntArray546[local2307] - local2324;
						@Pc(2355) float local2355 = (float) arg1.anIntArray545[local2307] - local1586;
						@Pc(2363) float local2363 = (float) arg1.anIntArray540[local2312] - local2318;
						@Pc(2371) float local2371 = (float) arg1.anIntArray546[local2312] - local2324;
						@Pc(2379) float local2379 = (float) arg1.anIntArray545[local2312] - local1586;
						@Pc(2387) float local2387 = (float) arg1.anIntArray540[local1547] - local2318;
						@Pc(2396) float local2396 = (float) arg1.anIntArray546[local1547] - local2324;
						@Pc(2405) float local2405 = (float) arg1.anIntArray545[local1547] - local1586;
						@Pc(2413) float local2413 = (float) arg1.anIntArray540[local1552] - local2318;
						@Pc(2422) float local2422 = (float) arg1.anIntArray546[local1552] - local2324;
						local1904 = (float) arg1.anIntArray545[local1552] - local1586;
						local1912 = (float) arg1.anIntArray540[local1557] - local2318;
						local1920 = (float) arg1.anIntArray546[local1557] - local2324;
						local1943 = (float) arg1.anIntArray545[local1557] - local1586;
						local1966 = local2379 * local1807 - local2371 * local2355;
						local1989 = local2355 * local2363 - local1799 * local2379;
						@Pc(2481) float local2481 = local1799 * local2371 - local1807 * local2363;
						@Pc(2489) float local2489 = local2371 * local2481 - local1989 * local2379;
						@Pc(2498) float local2498 = local1966 * local2379 - local2481 * local2363;
						@Pc(2507) float local2507 = local1989 * local2363 - local2371 * local1966;
						@Pc(2521) float local2521 = 1.0F / (local1807 * local2498 + local1799 * local2489 + local2507 * local2355);
						local1006 = (local1943 * local2507 + local2498 * local1920 + local2489 * local1912) * local2521;
						local1490 = local2521 * (local2507 * local2405 + local2498 * local2396 + local2489 * local2387);
						local1494 = local2521 * (local2507 * local1904 + local2489 * local2413 + local2422 * local2498);
						@Pc(2571) float local2571 = local1989 * local1799 - local1966 * local1807;
						@Pc(2580) float local2580 = local1807 * local2481 - local1989 * local2355;
						@Pc(2589) float local2589 = local2355 * local1966 - local2481 * local1799;
						@Pc(2603) float local2603 = 1.0F / (local2589 * local2371 + local2363 * local2580 + local2379 * local2571);
						local1492 = local2603 * (local2387 * local2580 + local2589 * local2396 + local2571 * local2405);
						local998 = local2603 * (local2413 * local2580 + local2589 * local2422 + local1904 * local2571);
						local990 = local2603 * (local2589 * local1920 + local1912 * local2580 + local2571 * local1943);
					} else {
						local1547 = arg1.aShortArray85[local1443];
						local1552 = arg1.aShortArray82[local1443];
						local1557 = arg1.aShortArray78[local1443];
						@Pc(1561) int local1561 = local693[local1155];
						@Pc(1565) int local1565 = local695[local1155];
						@Pc(1569) int local1569 = local697[local1155];
						@Pc(1573) float[] local1573 = local699[local1155];
						@Pc(1578) byte local1578 = arg1.aByteArray75[local1155];
						local1586 = (float) arg1.anIntArray547[local1155] / 256.0F;
						if (local1540 == 1) {
							local1799 = (float) arg1.anIntArray548[local1155] / 1024.0F;
							Static9.method277(local1569, arg1.anIntArray540[local1547], local1573, local1578, arg1.anIntArray545[local1547], local1586, local1799, local1561, arg1.anIntArray546[local1547], local1565);
							local1492 = Static230.aFloat118;
							local1490 = Static338.aFloat178;
							Static9.method277(local1569, arg1.anIntArray540[local1552], local1573, local1578, arg1.anIntArray545[local1552], local1586, local1799, local1561, arg1.anIntArray546[local1552], local1565);
							local1494 = Static338.aFloat178;
							local998 = Static230.aFloat118;
							Static9.method277(local1569, arg1.anIntArray540[local1557], local1573, local1578, arg1.anIntArray545[local1557], local1586, local1799, local1561, arg1.anIntArray546[local1557], local1565);
							local990 = Static230.aFloat118;
							local1006 = Static338.aFloat178;
							local1807 = local1799 / 2.0F;
							if ((local1578 & 0x1) == 0) {
								if (local1807 < local1006 - local1490) {
									local1504 = 1;
									local1006 -= local1799;
								} else if (local1807 < local1490 - local1006) {
									local1006 += local1799;
									local1504 = 2;
								}
								if (local1807 < local1494 - local1490) {
									local1502 = 1;
									local1494 -= local1799;
								} else if (local1807 < local1490 - local1494) {
									local1494 += local1799;
									local1502 = 2;
								}
							} else {
								if (local998 - local1492 > local1807) {
									local1502 = 1;
									local998 -= local1799;
								} else if (local1807 < local1492 - local998) {
									local1502 = 2;
									local998 += local1799;
								}
								if (local990 - local1492 > local1807) {
									local1504 = 1;
									local990 -= local1799;
								} else if (local1807 < local1492 - local990) {
									local1504 = 2;
									local990 += local1799;
								}
							}
						} else if (local1540 == 2) {
							local1799 = (float) arg1.anIntArray541[local1155] / 256.0F;
							local1807 = (float) arg1.anIntArray549[local1155] / 256.0F;
							@Pc(1818) int local1818 = arg1.anIntArray540[local1552] - arg1.anIntArray540[local1547];
							@Pc(1829) int local1829 = arg1.anIntArray546[local1552] - arg1.anIntArray546[local1547];
							@Pc(1839) int local1839 = arg1.anIntArray545[local1552] - arg1.anIntArray545[local1547];
							@Pc(1849) int local1849 = arg1.anIntArray540[local1557] - arg1.anIntArray540[local1547];
							@Pc(1860) int local1860 = arg1.anIntArray546[local1557] - arg1.anIntArray546[local1547];
							@Pc(1870) int local1870 = arg1.anIntArray545[local1557] - arg1.anIntArray545[local1547];
							@Pc(1879) int local1879 = local1870 * local1829 - local1860 * local1839;
							@Pc(1888) int local1888 = local1839 * local1849 - local1870 * local1818;
							@Pc(1896) int local1896 = local1818 * local1860 - local1849 * local1829;
							local1904 = 64.0F / (float) arg1.anIntArray543[local1155];
							local1912 = 64.0F / (float) arg1.anIntArray544[local1155];
							local1920 = 64.0F / (float) arg1.anIntArray548[local1155];
							local1943 = ((float) local1896 * local1573[2] + (float) local1888 * local1573[1] + (float) local1879 * local1573[0]) / local1904;
							local1966 = (local1573[5] * (float) local1896 + (float) local1879 * local1573[3] + (float) local1888 * local1573[4]) / local1912;
							local1989 = ((float) local1896 * local1573[8] + (float) local1879 * local1573[6] + (float) local1888 * local1573[7]) / local1920;
							local1506 = Static57.method1160(local1943, local1989, local1966);
							Static245.method3380(local1565, local1506, local1561, local1799, local1569, local1578, local1807, arg1.anIntArray546[local1547], arg1.anIntArray540[local1547], arg1.anIntArray545[local1547], local1573, local1586);
							local1492 = Static43.aFloat7;
							local1490 = Static249.aFloat126;
							Static245.method3380(local1565, local1506, local1561, local1799, local1569, local1578, local1807, arg1.anIntArray546[local1552], arg1.anIntArray540[local1552], arg1.anIntArray545[local1552], local1573, local1586);
							local998 = Static43.aFloat7;
							local1494 = Static249.aFloat126;
							Static245.method3380(local1565, local1506, local1561, local1799, local1569, local1578, local1807, arg1.anIntArray546[local1557], arg1.anIntArray540[local1557], arg1.anIntArray545[local1557], local1573, local1586);
							local990 = Static43.aFloat7;
							local1006 = Static249.aFloat126;
						} else if (local1540 == 3) {
							Static329.method4481(local1586, local1578, arg1.anIntArray546[local1547], arg1.anIntArray540[local1547], local1565, local1561, arg1.anIntArray545[local1547], local1569, local1573);
							local1492 = Static370.aFloat192;
							local1490 = Static399.aFloat198;
							Static329.method4481(local1586, local1578, arg1.anIntArray546[local1552], arg1.anIntArray540[local1552], local1565, local1561, arg1.anIntArray545[local1552], local1569, local1573);
							local1494 = Static399.aFloat198;
							local998 = Static370.aFloat192;
							Static329.method4481(local1586, local1578, arg1.anIntArray546[local1557], arg1.anIntArray540[local1557], local1565, local1561, arg1.anIntArray545[local1557], local1569, local1573);
							local1006 = Static399.aFloat198;
							local990 = Static370.aFloat192;
							if ((local1578 & 0x1) == 0) {
								if (local1006 - local1490 > 0.5F) {
									local1504 = 1;
									local1006--;
								} else if (local1490 - local1006 > 0.5F) {
									local1504 = 2;
									local1006++;
								}
								if (local1494 - local1490 > 0.5F) {
									local1502 = 1;
									local1494--;
								} else if (local1490 - local1494 > 0.5F) {
									local1494++;
									local1502 = 2;
								}
							} else {
								if (local998 - local1492 > 0.5F) {
									local1502 = 1;
									local998--;
								} else if (local1492 - local998 > 0.5F) {
									local1502 = 2;
									local998++;
								}
								if (local990 - local1492 > 0.5F) {
									local990--;
									local1504 = 1;
								} else if (local1492 - local990 > 0.5F) {
									local1504 = 2;
									local990++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray73 == null) {
				local1540 = 0;
			} else {
				local1540 = arg1.aByteArray73[local1443];
			}
			if (local1540 == 0) {
				@Pc(2806) long local2806 = (long) (local1155 << 2) + ((long) (local1450 << 8) + (long) (local1506 << 24) + (long) local725 << 32);
				local1557 = arg1.aShortArray85[local1443];
				local2302 = arg1.aShortArray82[local1443];
				local2307 = arg1.aShortArray78[local1443];
				@Pc(2825) Class22 local2825 = local418[local1557];
				this.aShortArray8[local1437] = this.method264(local2825.anInt688, local1490, local1557, arg1, local2825.anInt686, local2806, local2825.anInt684, local1492, local2825.anInt683);
				@Pc(2849) Class22 local2849 = local418[local2302];
				this.aShortArray5[local1437] = this.method264(local2849.anInt688, local1494, local2302, arg1, local2849.anInt686, (long) local1502 + local2806, local2849.anInt684, local998, local2849.anInt683);
				@Pc(2876) Class22 local2876 = local418[local2307];
				this.aShortArray10[local1437] = this.method264(local2876.anInt688, local1006, local2307, arg1, local2876.anInt686, local2806 + (long) local1504, local2876.anInt684, local990, local2876.anInt683);
			} else if (local1540 == 1) {
				@Pc(2666) Class222 local2666 = local1114[local1443];
				@Pc(2711) long local2711 = ((long) (local1450 << 8) + (long) (local1506 << 24) + (long) local725 << 32) + (long) ((local2666.anInt6525 + 256 << 22) + (local2666.anInt6524 + 256 << 12) + (local2666.anInt6520 <= 0 ? 2048 : 1024) + (local1155 << 2));
				this.aShortArray8[local1437] = this.method264(local2666.anInt6525, local1490, arg1.aShortArray85[local1443], arg1, local2666.anInt6524, local2711, 0, local1492, local2666.anInt6520);
				this.aShortArray5[local1437] = this.method264(local2666.anInt6525, local1494, arg1.aShortArray82[local1443], arg1, local2666.anInt6524, (long) local1502 + local2711, 0, local998, local2666.anInt6520);
				this.aShortArray10[local1437] = this.method264(local2666.anInt6525, local1006, arg1.aShortArray78[local1443], arg1, local2666.anInt6524, (long) local1504 + local2711, 0, local990, local2666.anInt6520);
			}
			if (arg1.aShortArray80 == null) {
				this.aShortArray1[local1437] = -1;
			} else {
				this.aShortArray1[local1437] = arg1.aShortArray80[local1443];
			}
			if (arg1.aByteArray74 != null) {
				this.aByteArray4[local1437] = arg1.aByteArray74[local1443];
			}
			if (arg1.aShortArray76 != null) {
				this.aShortArray4[local1437] = arg1.aShortArray76[local1443];
			}
			this.aShortArray2[local1437] = arg1.aShortArray77[local1443];
		}
		local1443 = 0;
		local1133 = -10000;
		for (local1144 = 0; local1144 < this.anInt280; local1144++) {
			@Pc(2965) short local2965 = this.aShortArray1[local1144];
			if (local2965 != local1133) {
				local1443++;
				local1133 = local2965;
			}
		}
		this.anIntArray19 = new int[local1443 + 1];
		local1133 = -10000;
		local1443 = 0;
		for (local1155 = 0; local1155 < this.anInt280; local1155++) {
			@Pc(2995) short local2995 = this.aShortArray1[local1155];
			if (local1133 != local2995) {
				local1133 = local2995;
				this.anIntArray19[local1443++] = local1155;
			}
		}
		this.anIntArray19[local1443] = this.anInt280;
		Static403.aLongArray8 = null;
		this.aShortArray7 = Static140.method2009(this.anInt276, this.aShortArray7);
		this.aShortArray3 = Static140.method2009(this.anInt276, this.aShortArray3);
		this.aShortArray11 = Static140.method2009(this.anInt276, this.aShortArray11);
		this.aByteArray5 = Static179.method2617(this.anInt276, this.aByteArray5);
		this.aFloatArray1 = Static4.method116(this.aFloatArray1, this.anInt276);
		this.aFloatArray2 = Static4.method116(this.aFloatArray2, this.anInt276);
		if (arg1.anIntArray542 != null && Static290.method4028(this.anInt266, arg2)) {
			this.anIntArrayArray1 = arg1.method4809();
		}
		if (arg1.aClass11Array1 != null && Static74.method1345(arg2, this.anInt266)) {
			this.anIntArrayArray2 = arg1.method4807();
		}
		if (arg1.anIntArray550 != null && Static365.method5051(this.anInt266, arg2)) {
			local725 = 0;
			@Pc(3117) int[] local3117 = new int[256];
			for (local770 = 0; local770 < this.anInt303; local770++) {
				local784 = arg1.anIntArray550[local106[local770]];
				if (local784 >= 0) {
					if (local725 < local784) {
						local725 = local784;
					}
					@Pc(3146) int local3146 = local3117[local784]++;
				}
			}
			this.anIntArrayArray3 = new int[local725 + 1][];
			for (local784 = 0; local784 <= local725; local784++) {
				this.anIntArrayArray3[local784] = new int[local3117[local784]];
				local3117[local784] = 0;
			}
			for (local786 = 0; local786 < this.anInt303; local786++) {
				local1215 = arg1.anIntArray550[local106[local786]];
				if (local1215 >= 0) {
					this.anIntArrayArray3[local1215][local3117[local1215]++] = local786;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ia;Lclient!mn;I)V")
	@Override
	public void method4091(@OriginalArg(0) Class116 arg0, @OriginalArg(1) Class41_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt276 == 0) {
			return;
		}
		@Pc(16) Class116_Sub2 local16 = this.aClass30_Sub1_4.aClass116_Sub2_4;
		@Pc(19) Class116_Sub2 local19 = (Class116_Sub2) arg0;
		if (!this.aBoolean14) {
			this.method251();
		}
		this.method261(local19);
		Static194.aFloat106 = local19.aFloat176 * local16.aFloat172 + local16.aFloat174 * local19.aFloat168 + local16.aFloat170 * local19.aFloat175 + local16.aFloat175;
		Static316.aFloat179 = local16.aFloat174 * local19.aFloat166 + local19.aFloat171 * local16.aFloat172 + local19.aFloat174 * local16.aFloat170;
		@Pc(76) float local76 = Static194.aFloat106 + (float) this.aShort7 * Static316.aFloat179;
		@Pc(84) float local84 = Static194.aFloat106 + Static316.aFloat179 * (float) this.aShort6;
		@Pc(100) float local100;
		@Pc(94) float local94;
		if (local76 > local84) {
			local94 = (float) this.aShort5 + local76;
			local100 = local84 - (float) this.aShort5;
		} else {
			local100 = local76 - (float) this.aShort5;
			local94 = local84 + (float) this.aShort5;
		}
		if (local100 >= this.aClass30_Sub1_4.aFloat25 || (float) this.aClass30_Sub1_4.anInt1252 >= local94) {
			return;
		}
		Static387.aFloat195 = local16.aFloat176 + local16.aFloat165 * local19.aFloat175 + local19.aFloat176 * local16.aFloat169 + local19.aFloat168 * local16.aFloat171;
		Static52.aFloat53 = local16.aFloat171 * local19.aFloat166 + local19.aFloat171 * local16.aFloat169 + local16.aFloat165 * local19.aFloat174;
		@Pc(176) float local176 = Static387.aFloat195 + (float) this.aShort7 * Static52.aFloat53;
		@Pc(184) float local184 = Static387.aFloat195 + (float) this.aShort6 * Static52.aFloat53;
		@Pc(210) float local210;
		@Pc(199) float local199;
		if (local176 > local184) {
			local199 = (local176 + (float) this.aShort5) * (float) this.aClass30_Sub1_4.anInt1285;
			local210 = (float) this.aClass30_Sub1_4.anInt1285 * (local184 - (float) this.aShort5);
		} else {
			local210 = ((float) -this.aShort5 + local176) * (float) this.aClass30_Sub1_4.anInt1285;
			local199 = (float) this.aClass30_Sub1_4.anInt1285 * ((float) this.aShort5 + local184);
		}
		if (this.aClass30_Sub1_4.aFloat41 <= local210 / local94 || local199 / local94 <= this.aClass30_Sub1_4.aFloat33) {
			return;
		}
		Static157.aFloat91 = local16.aFloat173 * local19.aFloat175 + local16.aFloat166 * local19.aFloat168 + local19.aFloat176 * local16.aFloat167 + local16.aFloat168;
		Static10.aFloat9 = local16.aFloat173 * local19.aFloat174 + local19.aFloat171 * local16.aFloat167 + local16.aFloat166 * local19.aFloat166;
		@Pc(300) float local300 = (float) this.aShort7 * Static10.aFloat9 + Static157.aFloat91;
		@Pc(308) float local308 = (float) this.aShort6 * Static10.aFloat9 + Static157.aFloat91;
		@Pc(334) float local334;
		@Pc(323) float local323;
		if (local308 < local300) {
			local323 = ((float) this.aShort5 + local300) * (float) this.aClass30_Sub1_4.anInt1281;
			local334 = (float) this.aClass30_Sub1_4.anInt1281 * (local308 - (float) this.aShort5);
		} else {
			local323 = (float) this.aClass30_Sub1_4.anInt1281 * (local308 + (float) this.aShort5);
			local334 = (float) this.aClass30_Sub1_4.anInt1281 * (local300 - (float) this.aShort5);
		}
		if (this.aClass30_Sub1_4.aFloat40 <= local334 / local94 || this.aClass30_Sub1_4.aFloat28 >= local323 / local94) {
			return;
		}
		if (arg1 != null || this.aClass51Array1 != null) {
			Static319.aFloat159 = local16.aFloat167 * local19.aFloat165 + local19.aFloat173 * local16.aFloat166 + local16.aFloat173 * local19.aFloat170;
			Static291.aFloat147 = local16.aFloat171 * local19.aFloat167 + local19.aFloat169 * local16.aFloat169 + local16.aFloat165 * local19.aFloat172;
			Static420.aFloat222 = local19.aFloat172 * local16.aFloat170 + local19.aFloat167 * local16.aFloat174 + local19.aFloat169 * local16.aFloat172;
			Static309.aFloat152 = local16.aFloat173 * local19.aFloat172 + local16.aFloat166 * local19.aFloat167 + local19.aFloat169 * local16.aFloat167;
			Static354.aFloat185 = local19.aFloat170 * local16.aFloat165 + local19.aFloat165 * local16.aFloat169 + local16.aFloat171 * local19.aFloat173;
			Static264.aFloat133 = local19.aFloat170 * local16.aFloat170 + local19.aFloat165 * local16.aFloat172 + local16.aFloat174 * local19.aFloat173;
		}
		if (arg1 != null) {
			@Pc(493) boolean local493 = false;
			@Pc(495) boolean local495 = true;
			@Pc(503) int local503 = this.aShort2 + this.aShort8 >> 1;
			@Pc(511) int local511 = this.aShort3 + this.aShort1 >> 1;
			@Pc(530) int local530 = (int) ((float) local511 * Static354.aFloat185 + Static387.aFloat195 + (float) local503 * Static291.aFloat147 + (float) this.aShort7 * Static52.aFloat53);
			@Pc(549) int local549 = (int) ((float) local511 * Static319.aFloat159 + Static157.aFloat91 + (float) local503 * Static309.aFloat152 + (float) this.aShort7 * Static10.aFloat9);
			@Pc(568) int local568 = (int) ((float) this.aShort7 * Static316.aFloat179 + Static420.aFloat222 * (float) local503 + Static194.aFloat106 + (float) local511 * Static264.aFloat133);
			if (this.aClass30_Sub1_4.anInt1252 > local568) {
				local493 = true;
			} else {
				arg1.anInt4533 = this.aClass30_Sub1_4.anInt1259 + this.aClass30_Sub1_4.anInt1281 * local549 / local568;
				arg1.anInt4531 = local530 * this.aClass30_Sub1_4.anInt1285 / local568 + this.aClass30_Sub1_4.anInt1288;
			}
			@Pc(627) int local627 = (int) ((float) this.aShort6 * Static52.aFloat53 + Static387.aFloat195 + Static291.aFloat147 * (float) local503 + (float) local511 * Static354.aFloat185);
			@Pc(646) int local646 = (int) (Static319.aFloat159 * (float) local511 + Static10.aFloat9 * (float) this.aShort6 + Static157.aFloat91 + (float) local503 * Static309.aFloat152);
			@Pc(665) int local665 = (int) (Static264.aFloat133 * (float) local511 + (float) this.aShort6 * Static316.aFloat179 + Static194.aFloat106 + Static420.aFloat222 * (float) local503);
			if (local665 >= this.aClass30_Sub1_4.anInt1252) {
				arg1.anInt4534 = this.aClass30_Sub1_4.anInt1288 + local627 * this.aClass30_Sub1_4.anInt1285 / local665;
				arg1.anInt4535 = this.aClass30_Sub1_4.anInt1259 + local646 * this.aClass30_Sub1_4.anInt1281 / local665;
			} else {
				local493 = true;
			}
			if (local493) {
				if (this.aClass30_Sub1_4.anInt1252 > local568 && local665 < this.aClass30_Sub1_4.anInt1252) {
					local495 = false;
				} else {
					@Pc(742) int local742;
					@Pc(752) int local752;
					@Pc(764) int local764;
					if (this.aClass30_Sub1_4.anInt1252 > local568) {
						local742 = (local665 - this.aClass30_Sub1_4.anInt1252 << 16) / (local665 - local568);
						local752 = local627 + (local742 * (local627 - local530) >> 16);
						arg1.anInt4531 = this.aClass30_Sub1_4.anInt1288 + local752 * this.aClass30_Sub1_4.anInt1285 / this.aClass30_Sub1_4.anInt1252;
						local764 = local646 + (local742 * (local646 - local549) >> 16);
						arg1.anInt4533 = this.aClass30_Sub1_4.anInt1259 + this.aClass30_Sub1_4.anInt1281 * local764 / this.aClass30_Sub1_4.anInt1252;
					} else if (this.aClass30_Sub1_4.anInt1252 > local665) {
						local742 = (local568 - this.aClass30_Sub1_4.anInt1252 << 16) / (local568 - local665);
						local752 = local530 + (local742 * (local530 - local627) >> 16);
						local764 = local549 + ((local549 - local646) * local742 >> 16);
						arg1.anInt4531 = this.aClass30_Sub1_4.anInt1285 * local752 / this.aClass30_Sub1_4.anInt1252 + this.aClass30_Sub1_4.anInt1288;
						arg1.anInt4533 = this.aClass30_Sub1_4.anInt1259 + this.aClass30_Sub1_4.anInt1281 * local764 / this.aClass30_Sub1_4.anInt1252;
					}
				}
			}
			if (local495) {
				arg1.aBoolean334 = true;
				if (local568 > local665) {
					arg1.anInt4532 = (local530 + this.aShort5) * this.aClass30_Sub1_4.anInt1285 / local568 + this.aClass30_Sub1_4.anInt1288 - arg1.anInt4531;
				} else {
					arg1.anInt4532 = this.aClass30_Sub1_4.anInt1285 * (this.aShort5 + local627) / local665 + this.aClass30_Sub1_4.anInt1288 - arg1.anInt4534;
				}
			}
		}
		this.aClass30_Sub1_4.method911();
		this.aClass30_Sub1_4.method907(local19);
		this.method263();
		this.aClass30_Sub1_4.method925();
		this.method257();
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
	private void method251() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(41) int local41 = 0; local41 < this.anInt296; local41++) {
			@Pc(48) int local48 = this.anIntArray21[local41];
			@Pc(53) int local53 = this.anIntArray20[local41];
			if (local15 < local53) {
				local15 = local53;
			}
			if (local53 < local9) {
				local9 = local53;
			}
			@Pc(72) int local72 = this.anIntArray24[local41];
			if (local48 < local7) {
				local7 = local48;
			}
			if (local13 < local48) {
				local13 = local48;
			}
			if (local72 < local11) {
				local11 = local72;
			}
			if (local72 > local17) {
				local17 = local72;
			}
			@Pc(116) int local116 = local72 * local72 + local48 * local48;
			if (local116 > local19) {
				local19 = local116;
			}
			local116 = local48 * local48 + local72 * local72 + local53 * local53;
			if (local116 > local21) {
				local21 = local116;
			}
		}
		this.aShort7 = (short) local9;
		this.aShort6 = (short) local15;
		this.aShort1 = (short) local11;
		this.aShort3 = (short) local17;
		this.aShort8 = (short) local13;
		this.aShort2 = (short) local7;
		this.aShort5 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean14 = true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > arg6 && arg5 > arg6 && arg0 > arg6) {
			return false;
		} else if (arg4 < arg6 && arg5 < arg6 && arg6 > arg0) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg3 && arg1 > arg2) {
			return false;
		} else {
			return arg7 >= arg2 || arg3 >= arg2 || arg2 <= arg1;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(SIIBI)I")
	private int method254(@OriginalArg(0) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18 = Static154.anIntArray246[Static246.method3387(arg3, arg1)];
		if (arg0 != -1) {
			@Pc(31) Class118 local31 = this.aClass30_Sub1_4.anInterface10_7.method4241(arg0 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte53 & 0xFF;
			@Pc(45) int local45;
			@Pc(68) int local68;
			if (local36 != 0) {
				if (arg1 < 0) {
					local45 = 0;
				} else if (arg1 > 127) {
					local45 = 16777215;
				} else {
					local45 = arg1 * 131586;
				}
				if (local36 == 256) {
					local18 = local45;
				} else {
					local68 = 256 - local36;
					local18 = (local68 * (local18 & 0xFF00FF) + local36 * (local45 & 0xFF00FF) & 0xFF00FF00) + (local36 * (local45 & 0xFF00) + (local18 & 0xFF00) * local68 & 0xFF0000) >> 8;
				}
			}
			local45 = local31.aByte54 & 0xFF;
			if (local45 != 0) {
				local45 += 256;
				@Pc(119) int local119 = local45 * (local18 >> 16 & 0xFF);
				if (local119 > 65535) {
					local119 = 65535;
				}
				local68 = local45 * (local18 >> 8 & 0xFF);
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(145) int local145 = (local18 & 0xFF) * local45;
				if (local145 > 65535) {
					local145 = 65535;
				}
				local18 = (local145 >> 8) + (local68 & 0xFF00) + (local119 << 8 & 0xFF0028);
			}
		}
		return (local18 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class56.anIntArray119[arg0];
		@Pc(13) int local13 = Class56.anIntArray120[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt296; local15++) {
			@Pc(33) int local33 = this.anIntArray21[local15] * local13 + local9 * this.anIntArray24[local15] >> 15;
			this.anIntArray24[local15] = this.anIntArray24[local15] * local13 - local9 * this.anIntArray21[local15] >> 15;
			this.anIntArray21[local15] = local33;
		}
		if (this.aClass124_2 != null) {
			this.aClass124_2.anInterface6_4 = null;
		}
		this.aBoolean14 = false;
	}

	@OriginalMember(owner = "client!ag", name = "WA", descriptor = "(I)V")
	@Override
	public void WA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class56.anIntArray119[arg0];
		@Pc(13) int local13 = Class56.anIntArray120[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt296; local15++) {
			@Pc(34) int local34 = this.anIntArray20[local15] * local13 - this.anIntArray24[local15] * local9 >> 15;
			this.anIntArray24[local15] = local13 * this.anIntArray24[local15] + local9 * this.anIntArray20[local15] >> 15;
			this.anIntArray20[local15] = local34;
		}
		this.aBoolean14 = false;
		if (this.aClass124_2 != null) {
			this.aClass124_2.anInterface6_4 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt303; local7++) {
			local16 = this.aShortArray2[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg2 != -1) {
				local32 += (arg2 - local32) * arg3 >> 7;
			}
			this.aShortArray2[local7] = (short) (local28 << 7 | local22 << 10 | local32);
		}
		if (this.aClass51Array1 != null) {
			for (local16 = 0; local16 < this.anInt283; local16++) {
				@Pc(108) Class51 local108 = this.aClass51Array1[local16];
				@Pc(113) Class97 local113 = this.aClass97Array1[local16];
				local113.anInt2660 = local113.anInt2660 & 0xFF000000 | Static154.anIntArray246[this.aShortArray2[local108.anInt1831] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass124_4 != null) {
			this.aClass124_4.anInterface6_4 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!fi;)V")
	private void method255(@OriginalArg(1) Class4_Sub1_Sub7_Sub1 arg0) {
		if (this.anInt276 > Static119.anIntArray164.length) {
			Static119.anIntArray164 = new int[this.anInt276];
			Static455.anIntArray674 = new int[this.anInt276];
		}
		@Pc(47) int local47;
		@Pc(86) int local86;
		@Pc(95) int local95;
		for (@Pc(20) int local20 = 0; local20 < this.anInt296; local20++) {
			local47 = (this.anIntArray21[local20] - (this.aClass30_Sub1_4.anInt1282 * this.anIntArray20[local20] >> 8) >> this.aClass30_Sub1_4.anInt1242) - arg0.anInt2408;
			@Pc(72) int local72 = (this.anIntArray24[local20] - (this.anIntArray20[local20] * this.aClass30_Sub1_4.anInt1260 >> 8) >> this.aClass30_Sub1_4.anInt1242) - arg0.anInt2409;
			@Pc(77) int local77 = this.anIntArray22[local20];
			@Pc(84) int local84 = this.anIntArray22[local20 + 1];
			for (local86 = local77; local86 < local84; local86++) {
				local95 = this.aShortArray9[local86] - 1;
				if (local95 == -1) {
					break;
				}
				Static119.anIntArray164[local95] = local47;
				Static455.anIntArray674[local95] = local72;
			}
		}
		for (local47 = 0; local47 < this.anInt280; local47++) {
			if (this.aByteArray4 == null || this.aByteArray4[local47] <= 128) {
				@Pc(142) short local142 = this.aShortArray8[local47];
				@Pc(147) short local147 = this.aShortArray5[local47];
				@Pc(152) short local152 = this.aShortArray10[local47];
				local86 = Static119.anIntArray164[local142];
				local95 = Static119.anIntArray164[local147];
				@Pc(164) int local164 = Static119.anIntArray164[local152];
				@Pc(168) int local168 = Static455.anIntArray674[local142];
				@Pc(172) int local172 = Static455.anIntArray674[local147];
				@Pc(176) int local176 = Static455.anIntArray674[local152];
				if (-((local172 - local168) * (-local95 + local164)) + (local86 - local95) * (local172 + -local176) > 0) {
					arg0.method1810(local164, local168, local172, local95, local86, local176);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()[Lclient!il;")
	@Override
	public Class120[] method4088() {
		return this.aClass120Array1;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "()[Lclient!e;")
	@Override
	public Class56[] method4092() {
		return this.aClass56Array1;
	}

	@OriginalMember(owner = "client!ag", name = "ra", descriptor = "()I")
	@Override
	public int ra() {
		if (!this.aBoolean14) {
			this.method251();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.aShort4;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V")
	private void method256(@OriginalArg(1) boolean arg0) {
		if (this.anInt280 * 6 > Static298.aClass4_Sub30_Sub2_3.aByteArray79.length) {
			Static298.aClass4_Sub30_Sub2_3 = new Class4_Sub30_Sub2(this.anInt280 * 6 + 600);
		} else {
			Static298.aClass4_Sub30_Sub2_3.anInt6244 = 0;
		}
		@Pc(42) int local42;
		if (this.aClass30_Sub1_4.aBoolean76) {
			for (local42 = 0; local42 < this.anInt280; local42++) {
				Static298.aClass4_Sub30_Sub2_3.method4846(this.aShortArray8[local42]);
				Static298.aClass4_Sub30_Sub2_3.method4846(this.aShortArray5[local42]);
				Static298.aClass4_Sub30_Sub2_3.method4846(this.aShortArray10[local42]);
			}
		} else {
			for (local42 = 0; local42 < this.anInt280; local42++) {
				Static298.aClass4_Sub30_Sub2_3.method4874(this.aShortArray8[local42]);
				Static298.aClass4_Sub30_Sub2_3.method4874(this.aShortArray5[local42]);
				Static298.aClass4_Sub30_Sub2_3.method4874(this.aShortArray10[local42]);
			}
		}
		if (Static298.aClass4_Sub30_Sub2_3.anInt6244 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface12_1 == null) {
				this.anInterface12_1 = this.aClass30_Sub1_4.method945(Static298.aClass4_Sub30_Sub2_3.aByteArray79, true, Static298.aClass4_Sub30_Sub2_3.anInt6244);
			} else {
				this.anInterface12_1.method4734(Static298.aClass4_Sub30_Sub2_3.anInt6244, Static298.aClass4_Sub30_Sub2_3.aByteArray79);
			}
			this.aClass60_1.anInterface12_3 = this.anInterface12_1;
		} else {
			this.aClass60_1.anInterface12_3 = this.aClass30_Sub1_4.method945(Static298.aClass4_Sub30_Sub2_3.aByteArray79, false, Static298.aClass4_Sub30_Sub2_3.anInt6244);
		}
		if (!arg0) {
			this.aBoolean13 = true;
		}
	}

	@OriginalMember(owner = "client!ag", name = "XA", descriptor = "(III)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt296; local3++) {
			if (arg0 != 128) {
				this.anIntArray21[local3] = this.anIntArray21[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray20[local3] = this.anIntArray20[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray24[local3] = this.anIntArray24[local3] * arg2 >> 7;
			}
		}
		if (this.aClass124_2 != null) {
			this.aClass124_2.anInterface6_4 = null;
		}
		this.aBoolean14 = false;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	private void method257() {
		if (this.aClass51Array1 == null) {
			return;
		}
		@Pc(12) Class116_Sub2 local12 = this.aClass30_Sub1_4.aClass116_Sub2_2;
		@Pc(16) float local16 = this.aClass30_Sub1_4.w();
		@Pc(20) float local20 = this.aClass30_Sub1_4.la();
		this.aClass30_Sub1_4.method938();
		this.aClass30_Sub1_4.method4663(false);
		this.aClass30_Sub1_4.method952(false);
		this.aClass30_Sub1_4.method919(this.aClass30_Sub1_4.aClass124_6, this.aClass30_Sub1_4.aClass124_5, null, null);
		for (@Pc(47) int local47 = 0; local47 < this.anInt283; local47++) {
			@Pc(54) Class51 local54 = this.aClass51Array1[local47];
			@Pc(59) Class97 local59 = this.aClass97Array1[local47];
			if (!local54.aBoolean124 || !this.aClass30_Sub1_4.method4666()) {
				@Pc(88) float local88 = (float) (this.anIntArray21[local54.anInt1836] + this.anIntArray21[local54.anInt1835] + this.anIntArray21[local54.anInt1833]) * 0.3333333F;
				@Pc(110) float local110 = (float) (this.anIntArray20[local54.anInt1836] + this.anIntArray20[local54.anInt1835] + this.anIntArray20[local54.anInt1833]) * 0.3333333F;
				@Pc(131) float local131 = (float) (this.anIntArray24[local54.anInt1833] + this.anIntArray24[local54.anInt1836] + this.anIntArray24[local54.anInt1835]) * 0.3333333F;
				@Pc(145) float local145 = Static354.aFloat185 * local131 + Static291.aFloat147 * local88 + local110 * Static52.aFloat53 + Static387.aFloat195;
				@Pc(159) float local159 = Static157.aFloat91 + local131 * Static319.aFloat159 + local88 * Static309.aFloat152 + local110 * Static10.aFloat9;
				@Pc(173) float local173 = Static194.aFloat106 + Static264.aFloat133 * local131 + Static420.aFloat222 * local88 + Static316.aFloat179 * local110;
				local12.method4598(local54.aShort36 * local59.anInt2656 >> 7, (float) local59.anInt2657 + local145, -local159 + (float) local59.anInt2658, local59.anInt2659 * local54.aShort35 >> 7, local59.anInt2661, -local173);
				this.aClass30_Sub1_4.method975(local12);
				this.aClass30_Sub1_4.o(local20, local16 - (float) local54.anInt1829 * 1.5F);
				@Pc(224) int local224 = local59.anInt2660;
				OpenGL.glColor4ub((byte) (local224 >> 16), (byte) (local224 >> 8), (byte) local224, (byte) (local224 >> 24));
				this.aClass30_Sub1_4.method940(local54.aShort37);
				this.aClass30_Sub1_4.method931(local54.aByte32);
				this.aClass30_Sub1_4.method923(local54.aByte33);
				this.aClass30_Sub1_4.method926(4);
			}
		}
		this.aClass30_Sub1_4.o(local20, local16);
		this.aClass30_Sub1_4.method4663(true);
		this.aClass30_Sub1_4.method925();
	}

	@OriginalMember(owner = "client!ag", name = "X", descriptor = "()I")
	@Override
	public int X() {
		if (!this.aBoolean14) {
			this.method251();
		}
		return this.aShort1;
	}

	@OriginalMember(owner = "client!ag", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	@Override
	public Class4_Sub1_Sub7 ua(@OriginalArg(0) Class4_Sub1_Sub7 arg0) {
		if (this.anInt276 == 0) {
			return null;
		}
		if (!this.aBoolean14) {
			this.method251();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass30_Sub1_4.anInt1282 > 0) {
			local37 = this.aShort2 - (this.aClass30_Sub1_4.anInt1282 * this.aShort6 >> 8) >> this.aClass30_Sub1_4.anInt1242;
			local54 = this.aShort8 - (this.aClass30_Sub1_4.anInt1282 * this.aShort7 >> 8) >> this.aClass30_Sub1_4.anInt1242;
		} else {
			local37 = this.aShort2 - (this.aClass30_Sub1_4.anInt1282 * this.aShort7 >> 8) >> this.aClass30_Sub1_4.anInt1242;
			local54 = this.aShort8 - (this.aShort6 * this.aClass30_Sub1_4.anInt1282 >> 8) >> this.aClass30_Sub1_4.anInt1242;
		}
		@Pc(108) int local108;
		@Pc(125) int local125;
		if (this.aClass30_Sub1_4.anInt1260 > 0) {
			local108 = this.aShort1 - (this.aShort6 * this.aClass30_Sub1_4.anInt1260 >> 8) >> this.aClass30_Sub1_4.anInt1242;
			local125 = this.aShort3 - (this.aClass30_Sub1_4.anInt1260 * this.aShort7 >> 8) >> this.aClass30_Sub1_4.anInt1242;
		} else {
			local108 = this.aShort1 - (this.aClass30_Sub1_4.anInt1260 * this.aShort7 >> 8) >> this.aClass30_Sub1_4.anInt1242;
			local125 = this.aShort3 - (this.aClass30_Sub1_4.anInt1260 * this.aShort6 >> 8) >> this.aClass30_Sub1_4.anInt1242;
		}
		@Pc(166) int local166 = local54 + 1 - local37;
		@Pc(173) int local173 = local125 + 1 - local108;
		@Pc(176) Class4_Sub1_Sub7_Sub1 local176 = (Class4_Sub1_Sub7_Sub1) arg0;
		@Pc(186) Class4_Sub1_Sub7_Sub1 local186;
		if (local176 != null && local176.method1809(local166, local173)) {
			local186 = local176;
			local176.method1806();
		} else {
			local186 = new Class4_Sub1_Sub7_Sub1(this.aClass30_Sub1_4, local166, local173);
		}
		local186.method1805(local108, local125, local37, local54);
		this.method255(local186);
		return local186;
	}

	@OriginalMember(owner = "client!ag", name = "ja", descriptor = "(III)V")
	@Override
	public void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt296; local3++) {
			if (arg0 != 0) {
				this.anIntArray21[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray20[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray24[local3] += arg2;
			}
		}
		this.aBoolean14 = false;
		if (this.aClass124_2 != null) {
			this.aClass124_2.anInterface6_4 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "()I")
	@Override
	public int b() {
		if (!this.aBoolean14) {
			this.method251();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "(I)V")
	@Override
	public void u(@OriginalArg(0) int arg0) {
		this.anInt279 = arg0;
		if (this.aClass269_1 != null && (this.anInt279 & 0x10000) == 0) {
			this.aShortArray3 = this.aClass269_1.aShortArray114;
			this.aByteArray5 = this.aClass269_1.aByteArray95;
			this.aShortArray11 = this.aClass269_1.aShortArray116;
			this.aShortArray7 = this.aClass269_1.aShortArray115;
			this.aClass269_1 = null;
		}
		this.aBoolean13 = true;
		this.method260();
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "()V")
	@Override
	public void method4095() {
		if (this.anInt276 <= 0 || this.anInt280 <= 0) {
			return;
		}
		this.method258(false);
		if ((this.aByte1 & 0x10) == 0 && this.aClass60_1.anInterface12_3 == null) {
			this.method256(false);
		}
		this.method260();
	}

	@OriginalMember(owner = "client!ag", name = "la", descriptor = "()I")
	@Override
	public int la() {
		if (!this.aBoolean14) {
			this.method251();
		}
		return this.aShort2;
	}

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "()I")
	@Override
	public int n() {
		return this.anInt279;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ia;Lclient!mn;II)V")
	@Override
	public void method4086(@OriginalArg(0) Class116 arg0, @OriginalArg(1) Class41_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt276 == 0) {
			return;
		}
		@Pc(13) Class116_Sub2 local13 = this.aClass30_Sub1_4.aClass116_Sub2_4;
		@Pc(16) Class116_Sub2 local16 = (Class116_Sub2) arg0;
		if (!this.aBoolean14) {
			this.method251();
		}
		Static194.aFloat106 = local13.aFloat170 * local16.aFloat175 + local16.aFloat168 * local13.aFloat174 + local13.aFloat172 * local16.aFloat176 + local13.aFloat175;
		Static316.aFloat179 = local13.aFloat170 * local16.aFloat174 + local13.aFloat174 * local16.aFloat166 + local16.aFloat171 * local13.aFloat172;
		@Pc(69) float local69 = Static316.aFloat179 * (float) this.aShort7 + Static194.aFloat106;
		@Pc(77) float local77 = Static316.aFloat179 * (float) this.aShort6 + Static194.aFloat106;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local77 < local69) {
			local88 = (float) -this.aShort5 + local77;
			local94 = (float) this.aShort5 + local69;
		} else {
			local94 = local77 + (float) this.aShort5;
			local88 = (float) -this.aShort5 + local69;
		}
		if (this.aClass30_Sub1_4.aFloat30 <= local88 || (float) this.aClass30_Sub1_4.anInt1252 >= local94) {
			return;
		}
		Static387.aFloat195 = local13.aFloat176 + local16.aFloat176 * local13.aFloat169 + local16.aFloat168 * local13.aFloat171 + local13.aFloat165 * local16.aFloat175;
		Static52.aFloat53 = local13.aFloat171 * local16.aFloat166 + local16.aFloat171 * local13.aFloat169 + local16.aFloat174 * local13.aFloat165;
		@Pc(171) float local171 = (float) this.aShort7 * Static52.aFloat53 + Static387.aFloat195;
		@Pc(179) float local179 = (float) this.aShort6 * Static52.aFloat53 + Static387.aFloat195;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local179 < local171) {
			local194 = (local179 - (float) this.aShort5) * (float) this.aClass30_Sub1_4.anInt1285;
			local205 = (float) this.aClass30_Sub1_4.anInt1285 * (local171 + (float) this.aShort5);
		} else {
			local205 = ((float) this.aShort5 + local179) * (float) this.aClass30_Sub1_4.anInt1285;
			local194 = (local171 - (float) this.aShort5) * (float) this.aClass30_Sub1_4.anInt1285;
		}
		if (this.aClass30_Sub1_4.aFloat41 <= local194 / (float) arg2 || this.aClass30_Sub1_4.aFloat33 >= local205 / (float) arg2) {
			return;
		}
		Static157.aFloat91 = local13.aFloat168 + local13.aFloat166 * local16.aFloat168 + local13.aFloat167 * local16.aFloat176 + local16.aFloat175 * local13.aFloat173;
		Static10.aFloat9 = local16.aFloat174 * local13.aFloat173 + local16.aFloat171 * local13.aFloat167 + local13.aFloat166 * local16.aFloat166;
		@Pc(296) float local296 = Static157.aFloat91 + Static10.aFloat9 * (float) this.aShort7;
		@Pc(304) float local304 = (float) this.aShort6 * Static10.aFloat9 + Static157.aFloat91;
		@Pc(331) float local331;
		@Pc(319) float local319;
		if (local296 > local304) {
			local319 = (float) this.aClass30_Sub1_4.anInt1281 * (local296 + (float) this.aShort5);
			local331 = ((float) -this.aShort5 + local304) * (float) this.aClass30_Sub1_4.anInt1281;
		} else {
			local331 = (float) this.aClass30_Sub1_4.anInt1281 * (local296 - (float) this.aShort5);
			local319 = (float) this.aClass30_Sub1_4.anInt1281 * ((float) this.aShort5 + local304);
		}
		if (this.aClass30_Sub1_4.aFloat40 <= local331 / (float) arg2 || this.aClass30_Sub1_4.aFloat28 >= local319 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass51Array1 != null) {
			Static420.aFloat222 = local16.aFloat169 * local13.aFloat172 + local16.aFloat167 * local13.aFloat174 + local16.aFloat172 * local13.aFloat170;
			Static354.aFloat185 = local16.aFloat170 * local13.aFloat165 + local16.aFloat165 * local13.aFloat169 + local13.aFloat171 * local16.aFloat173;
			Static319.aFloat159 = local13.aFloat167 * local16.aFloat165 + local13.aFloat166 * local16.aFloat173 + local16.aFloat170 * local13.aFloat173;
			Static291.aFloat147 = local16.aFloat172 * local13.aFloat165 + local13.aFloat171 * local16.aFloat167 + local13.aFloat169 * local16.aFloat169;
			Static309.aFloat152 = local13.aFloat173 * local16.aFloat172 + local16.aFloat167 * local13.aFloat166 + local16.aFloat169 * local13.aFloat167;
			Static264.aFloat133 = local13.aFloat172 * local16.aFloat165 + local13.aFloat174 * local16.aFloat173 + local16.aFloat170 * local13.aFloat170;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.aShort8 + this.aShort2 >> 1;
			@Pc(506) int local506 = this.aShort3 + this.aShort1 >> 1;
			@Pc(525) int local525 = (int) ((float) this.aShort7 * Static52.aFloat53 + Static291.aFloat147 * (float) local498 + Static387.aFloat195 + (float) local506 * Static354.aFloat185);
			@Pc(544) int local544 = (int) (Static10.aFloat9 * (float) this.aShort7 + Static309.aFloat152 * (float) local498 + Static157.aFloat91 + (float) local506 * Static319.aFloat159);
			@Pc(563) int local563 = (int) (Static264.aFloat133 * (float) local506 + Static194.aFloat106 + (float) local498 * Static420.aFloat222 + (float) this.aShort7 * Static316.aFloat179);
			@Pc(582) int local582 = (int) ((float) local506 * Static354.aFloat185 + Static52.aFloat53 * (float) this.aShort6 + Static291.aFloat147 * (float) local498 + Static387.aFloat195);
			@Pc(601) int local601 = (int) (Static309.aFloat152 * (float) local498 + Static157.aFloat91 + Static10.aFloat9 * (float) this.aShort6 + Static319.aFloat159 * (float) local506);
			arg1.anInt4533 = this.aClass30_Sub1_4.anInt1259 + local544 * this.aClass30_Sub1_4.anInt1281 / arg2;
			arg1.anInt4534 = this.aClass30_Sub1_4.anInt1285 * local582 / arg2 + this.aClass30_Sub1_4.anInt1288;
			arg1.anInt4535 = this.aClass30_Sub1_4.anInt1259 + this.aClass30_Sub1_4.anInt1281 * local601 / arg2;
			arg1.anInt4531 = this.aClass30_Sub1_4.anInt1285 * local525 / arg2 + this.aClass30_Sub1_4.anInt1288;
			@Pc(674) int local674 = (int) (Static316.aFloat179 * (float) this.aShort6 + (float) local498 * Static420.aFloat222 + Static194.aFloat106 + Static264.aFloat133 * (float) local506);
			if (this.aClass30_Sub1_4.anInt1252 > local563 && this.aClass30_Sub1_4.anInt1252 > local674) {
				arg1.aBoolean334 = true;
				arg1.anInt4532 = this.aClass30_Sub1_4.anInt1288 + this.aClass30_Sub1_4.anInt1285 * (local525 + this.aShort5) / arg2 - arg1.anInt4531;
			}
		}
		this.aClass30_Sub1_4.method963((float) arg2);
		this.aClass30_Sub1_4.method974();
		this.aClass30_Sub1_4.method907(local16);
		this.method263();
		this.aClass30_Sub1_4.method925();
		this.method257();
	}

	@OriginalMember(owner = "client!ag", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		this.aShort9 = (short) arg0;
		if (this.aClass124_4 != null) {
			this.aClass124_4.anInterface6_4 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)V")
	private void method258(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass124_4 != null && this.aClass124_4.anInterface6_4 == null;
		@Pc(27) boolean local27 = this.aClass124_1 != null && this.aClass124_1.anInterface6_4 == null;
		@Pc(38) boolean local38 = this.aClass124_2 != null && this.aClass124_2.anInterface6_4 == null;
		@Pc(49) boolean local49 = this.aClass124_3 != null && this.aClass124_3.anInterface6_4 == null;
		if (arg0) {
			local49 &= (this.aByte1 & 0x8) != 0;
			local16 &= (this.aByte1 & 0x2) != 0;
			local38 &= (this.aByte1 & 0x1) != 0;
			local27 &= (this.aByte1 & 0x4) != 0;
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
		if (Static298.aClass4_Sub30_Sub2_3.aByteArray79.length < this.anInt276 * local103) {
			Static298.aClass4_Sub30_Sub2_3 = new Class4_Sub30_Sub2((this.anInt276 + 100) * local103);
		} else {
			Static298.aClass4_Sub30_Sub2_3.anInt6244 = 0;
		}
		@Pc(191) int local191;
		@Pc(200) int local200;
		@Pc(228) int local228;
		@Pc(237) int local237;
		if (local38) {
			@Pc(207) int local207;
			@Pc(214) int local214;
			@Pc(219) int local219;
			@Pc(226) int local226;
			if (this.aClass30_Sub1_4.aBoolean76) {
				for (local191 = 0; local191 < this.anInt296; local191++) {
					local200 = NativeStream.floatToRawIntBits((float) this.anIntArray21[local191]);
					local207 = NativeStream.floatToRawIntBits((float) this.anIntArray20[local191]);
					local214 = NativeStream.floatToRawIntBits((float) this.anIntArray24[local191]);
					local219 = this.anIntArray22[local191];
					local226 = this.anIntArray22[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray9[local228] - 1;
						if (local237 == -1) {
							break;
						}
						Static298.aClass4_Sub30_Sub2_3.anInt6244 = local237 * local103;
						Static298.aClass4_Sub30_Sub2_3.method4861(local200);
						Static298.aClass4_Sub30_Sub2_3.method4861(local207);
						Static298.aClass4_Sub30_Sub2_3.method4861(local214);
					}
				}
			} else {
				for (local191 = 0; local191 < this.anInt296; local191++) {
					local200 = NativeStream.floatToRawIntBits((float) this.anIntArray21[local191]);
					local207 = NativeStream.floatToRawIntBits((float) this.anIntArray20[local191]);
					local214 = NativeStream.floatToRawIntBits((float) this.anIntArray24[local191]);
					local219 = this.anIntArray22[local191];
					local226 = this.anIntArray22[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray9[local228] - 1;
						if (local237 == -1) {
							break;
						}
						Static298.aClass4_Sub30_Sub2_3.anInt6244 = local237 * local103;
						Static298.aClass4_Sub30_Sub2_3.method4834(local200);
						Static298.aClass4_Sub30_Sub2_3.method4834(local207);
						Static298.aClass4_Sub30_Sub2_3.method4834(local214);
					}
				}
			}
		}
		@Pc(492) float local492;
		@Pc(368) short[] local368;
		@Pc(374) short[] local374;
		@Pc(365) short[] local365;
		@Pc(371) byte[] local371;
		@Pc(528) float local528;
		if (local16) {
			if (this.aClass124_1 == null) {
				if (this.aClass269_1 == null) {
					local365 = this.aShortArray11;
					local368 = this.aShortArray7;
					local371 = this.aByteArray5;
					local374 = this.aShortArray3;
				} else {
					local365 = this.aClass269_1.aShortArray116;
					local371 = this.aClass269_1.aByteArray95;
					local368 = this.aClass269_1.aShortArray115;
					local374 = this.aClass269_1.aShortArray114;
				}
				@Pc(398) float local398 = this.aClass30_Sub1_4.aFloatArray8[0];
				@Pc(404) float local404 = this.aClass30_Sub1_4.aFloatArray8[1];
				@Pc(410) float local410 = this.aClass30_Sub1_4.aFloatArray8[2];
				@Pc(414) float local414 = this.aClass30_Sub1_4.aFloat37;
				@Pc(424) float local424 = this.aClass30_Sub1_4.aFloat31 * 768.0F / (float) this.aShort4;
				@Pc(434) float local434 = this.aClass30_Sub1_4.aFloat35 * 768.0F / (float) this.aShort4;
				for (@Pc(436) int local436 = 0; local436 < this.anInt303; local436++) {
					@Pc(456) int local456 = this.method254(this.aShortArray1[local436], this.aShort9, this.aByteArray4[local436], this.aShortArray2[local436]);
					@Pc(465) float local465 = (float) (local456 >>> 24) * this.aClass30_Sub1_4.aFloat23;
					@Pc(476) float local476 = this.aClass30_Sub1_4.aFloat38 * (float) (local456 >> 8 & 0xFF);
					@Pc(481) short local481 = this.aShortArray8[local436];
					local492 = this.aClass30_Sub1_4.aFloat36 * (float) (local456 >> 16 & 0xFF);
					@Pc(497) short local497 = (short) local371[local481];
					if (local497 == 0) {
						local528 = ((float) local365[local481] * local410 + local398 * (float) local368[local481] + (float) local374[local481] * local404) * 0.0026041667F;
					} else {
						local528 = (local398 * (float) local368[local481] + (float) local374[local481] * local404 + local410 * (float) local365[local481]) / (float) (local497 * 256);
					}
					@Pc(565) float local565 = local414 + local528 * (local528 < 0.0F ? local434 : local424);
					@Pc(570) int local570 = (int) (local565 * local465);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					@Pc(591) int local591 = (int) (local492 * local565);
					@Pc(596) int local596 = (int) (local476 * local565);
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					Static298.aClass4_Sub30_Sub2_3.anInt6244 = local107 + local103 * local481;
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					Static298.aClass4_Sub30_Sub2_3.method4871(local570);
					Static298.aClass4_Sub30_Sub2_3.method4871(local591);
					Static298.aClass4_Sub30_Sub2_3.method4871(local596);
					Static298.aClass4_Sub30_Sub2_3.method4871(255 - (this.aByteArray4[local436] & 0xFF));
					local481 = this.aShortArray5[local436];
					local497 = local371[local481];
					if (local497 == 0) {
						local528 = ((float) local365[local481] * local410 + (float) local368[local481] * local398 + (float) local374[local481] * local404) * 0.0026041667F;
					} else {
						local528 = ((float) local368[local481] * local398 + local404 * (float) local374[local481] + (float) local365[local481] * local410) / (float) (local497 * 256);
					}
					local565 = (local528 < 0.0F ? local434 : local424) * local528 + local414;
					local570 = (int) (local465 * local565);
					local591 = (int) (local492 * local565);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local596 = (int) (local476 * local565);
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					Static298.aClass4_Sub30_Sub2_3.anInt6244 = local107 + local481 * local103;
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					Static298.aClass4_Sub30_Sub2_3.method4871(local570);
					Static298.aClass4_Sub30_Sub2_3.method4871(local591);
					Static298.aClass4_Sub30_Sub2_3.method4871(local596);
					Static298.aClass4_Sub30_Sub2_3.method4871(255 - (this.aByteArray4[local436] & 0xFF));
					local481 = this.aShortArray10[local436];
					local497 = local371[local481];
					if (local497 == 0) {
						local528 = ((float) local365[local481] * local410 + (float) local374[local481] * local404 + local398 * (float) local368[local481]) * 0.0026041667F;
					} else {
						local528 = (local398 * (float) local368[local481] + (float) local374[local481] * local404 + local410 * (float) local365[local481]) / (float) (local497 * 256);
					}
					local565 = (local528 < 0.0F ? local434 : local424) * local528 + local414;
					local570 = (int) (local465 * local565);
					local591 = (int) (local565 * local492);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local596 = (int) (local565 * local476);
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					Static298.aClass4_Sub30_Sub2_3.anInt6244 = local107 + local481 * local103;
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					Static298.aClass4_Sub30_Sub2_3.method4871(local570);
					Static298.aClass4_Sub30_Sub2_3.method4871(local591);
					Static298.aClass4_Sub30_Sub2_3.method4871(local596);
					Static298.aClass4_Sub30_Sub2_3.method4871(255 - (this.aByteArray4[local436] & 0xFF));
				}
			} else {
				for (local191 = 0; local191 < this.anInt303; local191++) {
					local200 = this.method254(this.aShortArray1[local191], this.aShort9, this.aByteArray4[local191], this.aShortArray2[local191]);
					Static298.aClass4_Sub30_Sub2_3.anInt6244 = this.aShortArray8[local191] * local103 + local107;
					Static298.aClass4_Sub30_Sub2_3.method4861(local200);
					Static298.aClass4_Sub30_Sub2_3.anInt6244 = this.aShortArray5[local191] * local103 + local107;
					Static298.aClass4_Sub30_Sub2_3.method4861(local200);
					Static298.aClass4_Sub30_Sub2_3.anInt6244 = this.aShortArray10[local191] * local103 + local107;
					Static298.aClass4_Sub30_Sub2_3.method4861(local200);
				}
			}
		}
		if (local27) {
			if (this.aClass269_1 == null) {
				local365 = this.aShortArray11;
				local371 = this.aByteArray5;
				local368 = this.aShortArray7;
				local374 = this.aShortArray3;
			} else {
				local365 = this.aClass269_1.aShortArray116;
				local368 = this.aClass269_1.aShortArray115;
				local374 = this.aClass269_1.aShortArray114;
				local371 = this.aClass269_1.aByteArray95;
			}
			@Pc(1104) float local1104 = 3.0F / (float) this.aShort4;
			Static298.aClass4_Sub30_Sub2_3.anInt6244 = local109;
			local528 = 3.0F / (float) (this.aShort4 / 2 + this.aShort4);
			if (this.aClass30_Sub1_4.aBoolean76) {
				for (local228 = 0; local228 < this.anInt276; local228++) {
					local237 = local371[local228] & 0xFF;
					if (local237 == 0) {
						Static298.aClass4_Sub30_Sub2_3.method4896(local528 * (float) local368[local228]);
						Static298.aClass4_Sub30_Sub2_3.method4896(local528 * (float) local374[local228]);
						Static298.aClass4_Sub30_Sub2_3.method4896(local528 * (float) local365[local228]);
					} else {
						local492 = local1104 / (float) local237;
						Static298.aClass4_Sub30_Sub2_3.method4896((float) local368[local228] * local492);
						Static298.aClass4_Sub30_Sub2_3.method4896(local492 * (float) local374[local228]);
						Static298.aClass4_Sub30_Sub2_3.method4896((float) local365[local228] * local492);
					}
					Static298.aClass4_Sub30_Sub2_3.anInt6244 += local103 - 12;
				}
			} else {
				for (local228 = 0; local228 < this.anInt276; local228++) {
					local237 = local371[local228] & 0xFF;
					if (local237 == 0) {
						Static298.aClass4_Sub30_Sub2_3.method4892(local528 * (float) local368[local228]);
						Static298.aClass4_Sub30_Sub2_3.method4892(local528 * (float) local374[local228]);
						Static298.aClass4_Sub30_Sub2_3.method4892(local528 * (float) local365[local228]);
					} else {
						local492 = local1104 / (float) local237;
						Static298.aClass4_Sub30_Sub2_3.method4892(local492 * (float) local368[local228]);
						Static298.aClass4_Sub30_Sub2_3.method4892(local492 * (float) local374[local228]);
						Static298.aClass4_Sub30_Sub2_3.method4892((float) local365[local228] * local492);
					}
					Static298.aClass4_Sub30_Sub2_3.anInt6244 += local103 - 12;
				}
			}
		}
		if (local49) {
			Static298.aClass4_Sub30_Sub2_3.anInt6244 = local111;
			if (this.aClass30_Sub1_4.aBoolean76) {
				for (local191 = 0; local191 < this.anInt276; local191++) {
					Static298.aClass4_Sub30_Sub2_3.method4896(this.aFloatArray1[local191]);
					Static298.aClass4_Sub30_Sub2_3.method4896(this.aFloatArray2[local191]);
					Static298.aClass4_Sub30_Sub2_3.anInt6244 += local103 - 8;
				}
			} else {
				for (local191 = 0; local191 < this.anInt276; local191++) {
					Static298.aClass4_Sub30_Sub2_3.method4892(this.aFloatArray1[local191]);
					Static298.aClass4_Sub30_Sub2_3.method4892(this.aFloatArray2[local191]);
					Static298.aClass4_Sub30_Sub2_3.anInt6244 += local103 - 8;
				}
			}
		}
		Static298.aClass4_Sub30_Sub2_3.anInt6244 = this.anInt276 * local103;
		@Pc(1399) Interface6 local1399;
		if (arg0) {
			if (this.anInterface6_1 == null) {
				this.anInterface6_1 = this.aClass30_Sub1_4.method941(local103, Static298.aClass4_Sub30_Sub2_3.aByteArray79, Static298.aClass4_Sub30_Sub2_3.anInt6244, true);
			} else {
				this.anInterface6_1.method2114(Static298.aClass4_Sub30_Sub2_3.aByteArray79, Static298.aClass4_Sub30_Sub2_3.anInt6244, local103);
			}
			this.aByte1 = 0;
			local1399 = this.anInterface6_1;
		} else {
			local1399 = this.aClass30_Sub1_4.method941(local103, Static298.aClass4_Sub30_Sub2_3.aByteArray79, Static298.aClass4_Sub30_Sub2_3.anInt6244, false);
			this.aBoolean13 = true;
		}
		if (local38) {
			this.aClass124_2.anInterface6_4 = local1399;
			this.aClass124_2.aByte59 = 0;
		}
		if (local49) {
			this.aClass124_3.aByte59 = local111;
			this.aClass124_3.anInterface6_4 = local1399;
		}
		if (local16) {
			this.aClass124_4.aByte59 = local107;
			this.aClass124_4.anInterface6_4 = local1399;
		}
		if (local27) {
			this.aClass124_1.anInterface6_4 = local1399;
			this.aClass124_1.aByte59 = local109;
		}
	}

	@OriginalMember(owner = "client!ag", name = "YA", descriptor = "(SS)V")
	@Override
	public void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface10 local9 = this.aClass30_Sub1_4.anInterface10_7;
		for (@Pc(11) int local11 = 0; local11 < this.anInt303; local11++) {
			if (this.aShortArray1[local11] == arg0) {
				this.aShortArray1[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(51) Class118 local51 = local9.method4241(arg0 & 0xFFFF);
			local39 = local51.aByte53;
			local41 = local51.aByte54;
		}
		@Pc(59) byte local59 = 0;
		@Pc(61) byte local61 = 0;
		if (arg1 != -1) {
			@Pc(72) Class118 local72 = local9.method4241(arg1 & 0xFFFF);
			local59 = local72.aByte53;
			local61 = local72.aByte54;
		}
		if (!(local39 != local59 | local41 != local61)) {
			return;
		}
		if (this.aClass51Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt283; local101++) {
				@Pc(108) Class51 local108 = this.aClass51Array1[local101];
				@Pc(113) Class97 local113 = this.aClass97Array1[local101];
				local113.anInt2660 = local113.anInt2660 & 0xFF000000 | Static154.anIntArray246[this.aShortArray2[local108.anInt1831] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass124_4 != null) {
			this.aClass124_4.anInterface6_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ag", name = "VA", descriptor = "()I")
	@Override
	public int VA() {
		if (!this.aBoolean14) {
			this.method251();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!ag", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		if (this.aClass124_4 != null) {
			this.aClass124_4.anInterface6_4 = null;
		}
		this.aShort4 = (short) arg0;
		if (this.aClass124_1 != null) {
			this.aClass124_1.anInterface6_4 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "E", descriptor = "()I")
	@Override
	public int E() {
		if (!this.aBoolean14) {
			this.method251();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!ag", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class56.anIntArray119[arg0];
		@Pc(13) int local13 = Class56.anIntArray120[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt296; local15++) {
			local33 = local13 * this.anIntArray21[local15] + this.anIntArray24[local15] * local9 >> 15;
			this.anIntArray24[local15] = local13 * this.anIntArray24[local15] - local9 * this.anIntArray21[local15] >> 15;
			this.anIntArray21[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt276; local33++) {
			@Pc(86) int local86 = local13 * this.aShortArray7[local33] + local9 * this.aShortArray11[local33] >> 15;
			this.aShortArray11[local33] = (short) (this.aShortArray11[local33] * local13 - this.aShortArray7[local33] * local9 >> 15);
			this.aShortArray7[local33] = (short) local86;
		}
		if (this.aClass124_1 == null && this.aClass124_4 != null) {
			this.aClass124_4.anInterface6_4 = null;
		}
		if (this.aClass124_1 != null) {
			this.aClass124_1.anInterface6_4 = null;
		}
		this.aBoolean14 = false;
		if (this.aClass124_2 != null) {
			this.aClass124_2.anInterface6_4 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "va", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			Static122.anInt2516 = 0;
			local29 = 0;
			Static154.anInt2945 = 0;
			Static287.anInt5209 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray1.length) {
					local51 = this.anIntArrayArray1[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray6 == null || (arg6 & this.aShortArray6[local59]) != 0) {
							Static287.anInt5209 += this.anIntArray21[local59];
							Static122.anInt2516 += this.anIntArray20[local59];
							local29++;
							Static154.anInt2945 += this.anIntArray24[local59];
						}
					}
				}
			}
			if (local29 > 0) {
				Static154.anInt2945 = arg4 + Static154.anInt2945 / local29;
				Static34.aBoolean40 = true;
				Static122.anInt2516 = arg3 + Static122.anInt2516 / local29;
				Static287.anInt5209 = arg2 + Static287.anInt5209 / local29;
			} else {
				Static122.anInt2516 = arg3;
				Static287.anInt5209 = arg2;
				Static154.anInt2945 = arg4;
			}
			return;
		}
		@Pc(240) int[] local240;
		@Pc(242) int local242;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[0] * arg2 + arg7[1] * arg3 + arg4 * arg7[2] + 16384 >> 15;
				local35 = arg4 * arg7[5] + arg3 * arg7[4] + arg7[3] * arg2 + 16384 >> 15;
				local41 = arg7[8] * arg4 + arg7[6] * arg2 + arg3 * arg7[7] + 16384 >> 15;
				arg2 = local29;
				arg4 = local41;
				arg3 = local35;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray1.length > local35) {
					local240 = this.anIntArrayArray1[local35];
					for (local242 = 0; local242 < local240.length; local242++) {
						local53 = local240[local242];
						if (this.aShortArray6 == null || (arg6 & this.aShortArray6[local53]) != 0) {
							this.anIntArray21[local53] += arg2;
							this.anIntArray20[local53] += arg3;
							this.anIntArray24[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(361) int local361;
		@Pc(384) int local384;
		@Pc(414) int local414;
		@Pc(441) int local441;
		@Pc(445) int local445;
		@Pc(449) int local449;
		@Pc(453) int local453;
		@Pc(461) int local461;
		@Pc(469) int local469;
		@Pc(625) int local625;
		@Pc(651) int local651;
		@Pc(655) int local655;
		@Pc(663) int local663;
		@Pc(668) int local668;
		@Pc(672) int local672;
		@Pc(676) int local676;
		@Pc(678) int local678;
		@Pc(809) int[] local809;
		@Pc(811) int local811;
		@Pc(815) int local815;
		@Pc(819) int local819;
		@Pc(821) int local821;
		@Pc(951) int local951;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray1.length > local35) {
						local240 = this.anIntArrayArray1[local35];
						for (local242 = 0; local242 < local240.length; local242++) {
							local53 = local240[local242];
							if (this.aShortArray6 == null || (arg6 & this.aShortArray6[local53]) != 0) {
								this.anIntArray21[local53] -= Static287.anInt5209;
								this.anIntArray20[local53] -= Static122.anInt2516;
								this.anIntArray24[local53] -= Static154.anInt2945;
								if (arg4 != 0) {
									local59 = Class56.anIntArray119[arg4];
									local361 = Class56.anIntArray120[arg4];
									local384 = this.anIntArray21[local53] * local361 + this.anIntArray20[local53] * local59 + 32767 >> 15;
									this.anIntArray20[local53] = this.anIntArray20[local53] * local361 + 32767 - this.anIntArray21[local53] * local59 >> 15;
									this.anIntArray21[local53] = local384;
								}
								if (arg2 != 0) {
									local59 = Class56.anIntArray119[arg2];
									local361 = Class56.anIntArray120[arg2];
									local384 = local361 * this.anIntArray20[local53] + 32767 - this.anIntArray24[local53] * local59 >> 15;
									this.anIntArray24[local53] = local59 * this.anIntArray20[local53] + this.anIntArray24[local53] * local361 + 32767 >> 15;
									this.anIntArray20[local53] = local384;
								}
								if (arg3 != 0) {
									local59 = Class56.anIntArray119[arg3];
									local361 = Class56.anIntArray120[arg3];
									local384 = this.anIntArray24[local53] * local59 + local361 * this.anIntArray21[local53] + 32767 >> 15;
									this.anIntArray24[local53] = local361 * this.anIntArray24[local53] + 32767 - local59 * this.anIntArray21[local53] >> 15;
									this.anIntArray21[local53] = local384;
								}
								this.anIntArray21[local53] += Static287.anInt5209;
								this.anIntArray20[local53] += Static122.anInt2516;
								this.anIntArray24[local53] += Static154.anInt2945;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray1.length > local41) {
							local51 = this.anIntArrayArray1[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray6 == null || (arg6 & this.aShortArray6[local59]) != 0) {
									local361 = this.anIntArray22[local59];
									local384 = this.anIntArray22[local59 + 1];
									for (local414 = local361; local414 < local384; local414++) {
										local441 = this.aShortArray9[local414] - 1;
										if (local441 == -1) {
											break;
										}
										if (arg4 != 0) {
											local445 = Class56.anIntArray119[arg4];
											local449 = Class56.anIntArray120[arg4];
											local453 = this.aShortArray3[local441] * local445 + this.aShortArray7[local441] * local449 + 32767 >> 15;
											this.aShortArray3[local441] = (short) (this.aShortArray3[local441] * local449 + 32767 - this.aShortArray7[local441] * local445 >> 15);
											this.aShortArray7[local441] = (short) local453;
										}
										if (arg2 != 0) {
											local445 = Class56.anIntArray119[arg2];
											local449 = Class56.anIntArray120[arg2];
											local453 = local449 * this.aShortArray3[local441] + 32767 - this.aShortArray11[local441] * local445 >> 15;
											this.aShortArray11[local441] = (short) (this.aShortArray3[local441] * local445 + local449 * this.aShortArray11[local441] + 32767 >> 15);
											this.aShortArray3[local441] = (short) local453;
										}
										if (arg3 != 0) {
											local445 = Class56.anIntArray119[arg3];
											local449 = Class56.anIntArray120[arg3];
											local453 = local449 * this.aShortArray7[local441] + local445 * this.aShortArray11[local441] + 32767 >> 15;
											this.aShortArray11[local441] = (short) (this.aShortArray11[local441] * local449 + 32767 - this.aShortArray7[local441] * local445 >> 15);
											this.aShortArray7[local441] = (short) local453;
										}
									}
								}
							}
						}
					}
					if (this.aClass124_1 == null && this.aClass124_4 != null) {
						this.aClass124_4.anInterface6_4 = null;
					}
					if (this.aClass124_1 != null) {
						this.aClass124_1.anInterface6_4 = null;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local242 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static34.aBoolean40) {
					local361 = arg7[0] * Static287.anInt5209 + Static122.anInt2516 * arg7[3] + arg7[6] * Static154.anInt2945 + 16384 >> 15;
					local384 = arg7[7] * Static154.anInt2945 + Static287.anInt5209 * arg7[1] + Static122.anInt2516 * arg7[4] + 16384 >> 15;
					local361 += local242;
					local384 += local53;
					local414 = arg7[5] * Static122.anInt2516 + Static287.anInt5209 * arg7[2] + Static154.anInt2945 * arg7[8] + 16384 >> 15;
					Static287.anInt5209 = local361;
					local414 += local59;
					Static122.anInt2516 = local384;
					Static154.anInt2945 = local414;
					Static34.aBoolean40 = false;
				}
				@Pc(429) int[] local429 = new int[9];
				local384 = Class56.anIntArray120[arg2];
				local414 = Class56.anIntArray119[arg2];
				local441 = Class56.anIntArray120[arg3];
				local445 = Class56.anIntArray119[arg3];
				local449 = Class56.anIntArray120[arg4];
				local453 = Class56.anIntArray119[arg4];
				local461 = local414 * local449 + 16384 >> 15;
				local469 = local453 * local414 + 16384 >> 15;
				local429[4] = local384 * local449 + 16384 >> 15;
				local429[0] = local441 * local449 + local469 * local445 + 16384 >> 15;
				local429[6] = -local445 * local449 + local469 * local441 + 16384 >> 15;
				local429[8] = local384 * local441 + 16384 >> 15;
				local429[2] = local445 * local384 + 16384 >> 15;
				local429[3] = local453 * local384 + 16384 >> 15;
				local429[1] = -local441 * local453 + local445 * local461 + 16384 >> 15;
				local429[7] = local461 * local441 + local445 * local453 + 16384 >> 15;
				local429[5] = -local414;
				@Pc(600) int local600 = -Static154.anInt2945 * local429[2] + local429[0] * -Static287.anInt5209 + local429[1] * -Static122.anInt2516 + 16384 >> 15;
				local625 = -Static154.anInt2945 * local429[5] + -Static122.anInt2516 * local429[4] + local429[3] * -Static287.anInt5209 + 16384 >> 15;
				local651 = local429[8] * -Static154.anInt2945 + local429[6] * -Static287.anInt5209 + local429[7] * -Static122.anInt2516 + 16384 >> 15;
				local655 = Static287.anInt5209 + local600;
				@Pc(659) int local659 = local625 + Static122.anInt2516;
				local663 = Static154.anInt2945 + local651;
				@Pc(666) int[] local666 = new int[9];
				for (local668 = 0; local668 < 3; local668++) {
					for (local672 = 0; local672 < 3; local672++) {
						local676 = 0;
						for (local678 = 0; local678 < 3; local678++) {
							local676 += local429[local668 * 3 + local678] * arg7[local672 * 3 + local678];
						}
						local666[local672 + local668 * 3] = local676 + 16384 >> 15;
					}
				}
				local672 = local429[2] * local59 + local429[1] * local53 + local429[0] * local242 + 16384 >> 15;
				local676 = local429[4] * local53 + local242 * local429[3] + local59 * local429[5] + 16384 >> 15;
				local672 += local655;
				local678 = local429[7] * local53 + local429[6] * local242 + local59 * local429[8] + 16384 >> 15;
				local676 += local659;
				local678 += local663;
				local809 = new int[9];
				for (local811 = 0; local811 < 3; local811++) {
					for (local815 = 0; local815 < 3; local815++) {
						local819 = 0;
						for (local821 = 0; local821 < 3; local821++) {
							local819 += arg7[local821 + local811 * 3] * local666[local821 * 3 + local815];
						}
						local809[local811 * 3 + local815] = local819 + 16384 >> 15;
					}
				}
				local815 = arg7[0] * local672 + local676 * arg7[1] + arg7[2] * local678 + 16384 >> 15;
				local819 = local678 * arg7[5] + arg7[3] * local672 + local676 * arg7[4] + 16384 >> 15;
				local821 = local676 * arg7[7] + local672 * arg7[6] + local678 * arg7[8] + 16384 >> 15;
				local819 += local35;
				local815 += local29;
				local821 += local41;
				for (local951 = 0; local951 < local8; local951++) {
					@Pc(957) int local957 = arg1[local951];
					if (local957 < this.anIntArrayArray1.length) {
						@Pc(967) int[] local967 = this.anIntArrayArray1[local957];
						for (@Pc(969) int local969 = 0; local969 < local967.length; local969++) {
							@Pc(975) int local975 = local967[local969];
							if (this.aShortArray6 == null || (arg6 & this.aShortArray6[local975]) != 0) {
								@Pc(1019) int local1019 = local809[2] * this.anIntArray24[local975] + local809[0] * this.anIntArray21[local975] + local809[1] * this.anIntArray20[local975] + 16384 >> 15;
								@Pc(1050) int local1050 = local809[5] * this.anIntArray24[local975] + this.anIntArray21[local975] * local809[3] + this.anIntArray20[local975] * local809[4] + 16384 >> 15;
								@Pc(1054) int local1054 = local1050 + local819;
								@Pc(1058) int local1058 = local1019 + local815;
								@Pc(1090) int local1090 = local809[7] * this.anIntArray20[local975] + local809[6] * this.anIntArray21[local975] + local809[8] * this.anIntArray24[local975] + 16384 >> 15;
								@Pc(1094) int local1094 = local1090 + local821;
								this.anIntArray21[local975] = local1058;
								this.anIntArray20[local975] = local1054;
								this.anIntArray24[local975] = local1094;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2568) Class51 local2568;
			@Pc(2573) Class97 local2573;
			if (arg0 == 5) {
				if (this.anIntArrayArray3 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray3.length) {
							local240 = this.anIntArrayArray3[local35];
							for (local242 = 0; local242 < local240.length; local242++) {
								local53 = local240[local242];
								if (this.aShortArray4 == null || (arg6 & this.aShortArray4[local53]) != 0) {
									local59 = arg2 * 8 + (this.aByteArray4[local53] & 0xFF);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray4[local53] = (byte) local59;
									if (this.aClass124_4 != null) {
										this.aClass124_4.anInterface6_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass51Array1 != null) {
						for (local35 = 0; local35 < this.anInt283; local35++) {
							local2568 = this.aClass51Array1[local35];
							local2573 = this.aClass97Array1[local35];
							local2573.anInt2660 = 255 - (this.aByteArray4[local2568.anInt1831] & 0xFF) << 24 | local2573.anInt2660 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2830) Class97 local2830;
				if (arg0 == 8) {
					if (this.anIntArrayArray2 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray2.length > local35) {
								local240 = this.anIntArrayArray2[local35];
								for (local242 = 0; local242 < local240.length; local242++) {
									local2830 = this.aClass97Array1[local240[local242]];
									local2830.anInt2657 += arg2;
									local2830.anInt2658 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray2 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray2.length) {
								local240 = this.anIntArrayArray2[local35];
								for (local242 = 0; local242 < local240.length; local242++) {
									local2830 = this.aClass97Array1[local240[local242]];
									local2830.anInt2659 = arg2 * local2830.anInt2659 >> 7;
									local2830.anInt2656 = local2830.anInt2656 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray2 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray2.length) {
							local240 = this.anIntArrayArray2[local35];
							for (local242 = 0; local242 < local240.length; local242++) {
								local2830 = this.aClass97Array1[local240[local242]];
								local2830.anInt2661 = local2830.anInt2661 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray3 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray3.length) {
						local240 = this.anIntArrayArray3[local35];
						for (local242 = 0; local242 < local240.length; local242++) {
							local53 = local240[local242];
							if (this.aShortArray4 == null || (this.aShortArray4[local53] & arg6) != 0) {
								local59 = this.aShortArray2[local53] & 0xFFFF;
								local361 = local59 >> 10 & 0x3F;
								local384 = local59 >> 7 & 0x7;
								local414 = local59 & 0x7F;
								@Pc(2680) int local2680 = local361 + arg2 & 0x3F;
								local384 += arg3 / 4;
								if (local384 < 0) {
									local384 = 0;
								} else if (local384 > 7) {
									local384 = 7;
								}
								local414 += arg4;
								if (local414 < 0) {
									local414 = 0;
								} else if (local414 > 127) {
									local414 = 127;
								}
								this.aShortArray2[local53] = (short) (local414 | local384 << 7 | local2680 << 10);
								if (this.aClass124_4 != null) {
									this.aClass124_4.anInterface6_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass51Array1 != null) {
					for (local35 = 0; local35 < this.anInt283; local35++) {
						local2568 = this.aClass51Array1[local35];
						local2573 = this.aClass97Array1[local35];
						local2573.anInt2660 = local2573.anInt2660 & 0xFF000000 | Static154.anIntArray246[this.aShortArray2[local2568.anInt1831] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray1.length) {
					local240 = this.anIntArrayArray1[local35];
					for (local242 = 0; local242 < local240.length; local242++) {
						local53 = local240[local242];
						if (this.aShortArray6 == null || (this.aShortArray6[local53] & arg6) != 0) {
							this.anIntArray21[local53] -= Static287.anInt5209;
							this.anIntArray20[local53] -= Static122.anInt2516;
							this.anIntArray24[local53] -= Static154.anInt2945;
							this.anIntArray21[local53] = arg2 * this.anIntArray21[local53] >> 7;
							this.anIntArray20[local53] = this.anIntArray20[local53] * arg3 >> 7;
							this.anIntArray24[local53] = this.anIntArray24[local53] * arg4 >> 7;
							this.anIntArray21[local53] += Static287.anInt5209;
							this.anIntArray20[local53] += Static122.anInt2516;
							this.anIntArray24[local53] += Static154.anInt2945;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local242 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static34.aBoolean40) {
				local361 = arg7[6] * Static154.anInt2945 + Static122.anInt2516 * arg7[3] + Static287.anInt5209 * arg7[0] + 16384 >> 15;
				local384 = Static154.anInt2945 * arg7[7] + arg7[4] * Static122.anInt2516 + Static287.anInt5209 * arg7[1] + 16384 >> 15;
				local414 = Static122.anInt2516 * arg7[5] + Static287.anInt5209 * arg7[2] + Static154.anInt2945 * arg7[8] + 16384 >> 15;
				local384 += local53;
				local361 += local242;
				local414 += local59;
				Static122.anInt2516 = local384;
				Static287.anInt5209 = local361;
				Static154.anInt2945 = local414;
				Static34.aBoolean40 = false;
			}
			local361 = arg2 << 15 >> 7;
			local384 = arg3 << 15 >> 7;
			local414 = arg4 << 15 >> 7;
			local441 = local361 * -Static287.anInt5209 + 16384 >> 15;
			local445 = -Static122.anInt2516 * local384 + 16384 >> 15;
			local449 = local414 * -Static154.anInt2945 + 16384 >> 15;
			local453 = Static287.anInt5209 + local441;
			local461 = Static122.anInt2516 + local445;
			local469 = Static154.anInt2945 + local449;
			@Pc(1872) int[] local1872 = new int[] { arg7[0] * local361 + 16384 >> 15, local361 * arg7[3] + 16384 >> 15, arg7[6] * local361 + 16384 >> 15, local384 * arg7[1] + 16384 >> 15, arg7[4] * local384 + 16384 >> 15, local384 * arg7[7] + 16384 >> 15, local414 * arg7[2] + 16384 >> 15, arg7[5] * local414 + 16384 >> 15, local414 * arg7[8] + 16384 >> 15 };
			local625 = local361 * local242 + 16384 >> 15;
			local651 = local384 * local53 + 16384 >> 15;
			local655 = local59 * local414 + 16384 >> 15;
			@Pc(2008) int local2008 = local651 + local461;
			@Pc(2012) int local2012 = local625 + local453;
			@Pc(2016) int local2016 = local655 + local469;
			@Pc(2019) int[] local2019 = new int[9];
			@Pc(2025) int local2025;
			for (local663 = 0; local663 < 3; local663++) {
				for (local2025 = 0; local2025 < 3; local2025++) {
					local668 = 0;
					for (local672 = 0; local672 < 3; local672++) {
						local668 += arg7[local663 * 3 + local672] * local1872[local672 * 3 + local2025];
					}
					local2019[local2025 + local663 * 3] = local668 + 16384 >> 15;
				}
			}
			local2025 = arg7[2] * local2016 + arg7[1] * local2008 + local2012 * arg7[0] + 16384 >> 15;
			local668 = arg7[3] * local2012 + arg7[4] * local2008 + arg7[5] * local2016 + 16384 >> 15;
			local672 = arg7[8] * local2016 + local2012 * arg7[6] + local2008 * arg7[7] + 16384 >> 15;
			local2025 += local29;
			local668 += local35;
			local672 += local41;
			for (local676 = 0; local676 < local8; local676++) {
				local678 = arg1[local676];
				if (local678 < this.anIntArrayArray1.length) {
					local809 = this.anIntArrayArray1[local678];
					for (local811 = 0; local811 < local809.length; local811++) {
						local815 = local809[local811];
						if (this.aShortArray6 == null || (this.aShortArray6[local815] & arg6) != 0) {
							local819 = this.anIntArray24[local815] * local2019[2] + local2019[1] * this.anIntArray20[local815] + this.anIntArray21[local815] * local2019[0] + 16384 >> 15;
							local821 = this.anIntArray24[local815] * local2019[5] + this.anIntArray21[local815] * local2019[3] + local2019[4] * this.anIntArray20[local815] + 16384 >> 15;
							@Pc(2261) int local2261 = local821 + local668;
							@Pc(2265) int local2265 = local819 + local2025;
							local951 = local2019[8] * this.anIntArray24[local815] + this.anIntArray20[local815] * local2019[7] + local2019[6] * this.anIntArray21[local815] + 16384 >> 15;
							this.anIntArray21[local815] = local2265;
							@Pc(2305) int local2305 = local951 + local672;
							this.anIntArray20[local815] = local2261;
							this.anIntArray24[local815] = local2305;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
	private void method260() {
		if (!this.aBoolean13) {
			return;
		}
		this.aBoolean13 = false;
		if (this.aClass56Array1 == null && this.aClass120Array1 == null && this.aClass51Array1 == null) {
			if (this.anIntArray21 != null && !Static259.method3548(this.anInt266, this.anInt279)) {
				if (this.aClass124_2 != null && this.aClass124_2.anInterface6_4 == null) {
					this.aBoolean13 = true;
				} else {
					if (!this.aBoolean14) {
						this.method251();
					}
					this.anIntArray21 = null;
				}
			}
			if (this.anIntArray20 != null && !Static434.method5578(this.anInt266, this.anInt279)) {
				if (this.aClass124_2 != null && this.aClass124_2.anInterface6_4 == null) {
					this.aBoolean13 = true;
				} else {
					if (!this.aBoolean14) {
						this.method251();
					}
					this.anIntArray20 = null;
				}
			}
			if (this.anIntArray24 != null && !Static309.method4261(this.anInt279, this.anInt266)) {
				if (this.aClass124_2 != null && this.aClass124_2.anInterface6_4 == null) {
					this.aBoolean13 = true;
				} else {
					if (!this.aBoolean14) {
						this.method251();
					}
					this.anIntArray24 = null;
				}
			}
		}
		if (this.aShortArray9 != null && this.anIntArray21 == null && this.anIntArray20 == null && this.anIntArray24 == null) {
			this.anIntArray22 = null;
			this.aShortArray9 = null;
		}
		if (this.aByteArray5 != null && !Static343.method4796(this.anInt266, this.anInt279)) {
			if (this.aClass124_1 == null) {
				if (this.aClass124_4 != null && this.aClass124_4.anInterface6_4 == null) {
					this.aBoolean13 = true;
				} else {
					this.aShortArray7 = this.aShortArray3 = this.aShortArray11 = null;
					this.aByteArray5 = null;
				}
			} else if (this.aClass124_1.anInterface6_4 == null) {
				this.aBoolean13 = true;
			} else {
				this.aByteArray5 = null;
				this.aShortArray7 = this.aShortArray3 = this.aShortArray11 = null;
			}
		}
		if (this.aShortArray2 != null && !Static147.method2181(this.anInt266, this.anInt279)) {
			if (this.aClass124_4 != null && this.aClass124_4.anInterface6_4 == null) {
				this.aBoolean13 = true;
			} else {
				this.aShortArray2 = null;
			}
		}
		if (this.aByteArray4 != null && !Static176.method2581(this.anInt266, this.anInt279)) {
			if (this.aClass124_4 != null && this.aClass124_4.anInterface6_4 == null) {
				this.aBoolean13 = true;
			} else {
				this.aByteArray4 = null;
			}
		}
		if (this.aFloatArray1 != null && !Static337.method4617(this.anInt266, this.anInt279)) {
			if (this.aClass124_3 != null && this.aClass124_3.anInterface6_4 == null) {
				this.aBoolean13 = true;
			} else {
				this.aFloatArray1 = this.aFloatArray2 = null;
			}
		}
		if (this.aShortArray1 != null && !Static29.method542(this.anInt266, this.anInt279)) {
			if (this.aClass124_4 != null && this.aClass124_4.anInterface6_4 == null) {
				this.aBoolean13 = true;
			} else {
				this.aShortArray1 = null;
			}
		}
		if (this.aShortArray8 != null && !Static444.method5720(this.anInt279, this.anInt266)) {
			if (this.aClass60_1 != null && this.aClass60_1.anInterface12_3 == null || this.aClass124_4 != null && this.aClass124_4.anInterface6_4 == null) {
				this.aBoolean13 = true;
			} else {
				this.aShortArray8 = this.aShortArray5 = this.aShortArray10 = null;
			}
		}
		if (this.anIntArrayArray3 != null && !Static365.method5051(this.anInt266, this.anInt279)) {
			this.anIntArrayArray3 = null;
			this.aShortArray4 = null;
		}
		if (this.anIntArrayArray1 != null && !Static290.method4028(this.anInt266, this.anInt279)) {
			this.anIntArrayArray1 = null;
			this.aShortArray6 = null;
		}
		if (this.anIntArrayArray2 != null && !Static74.method1345(this.anInt279, this.anInt266)) {
			this.anIntArrayArray2 = null;
		}
		if (this.anIntArray19 != null && (this.anInt279 & 0x800) == 0 && (this.anInt279 & 0x40000) == 0) {
			this.anIntArray19 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	@Override
	public void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) Class146 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean14) {
			this.method251();
		}
		@Pc(16) int local16 = this.aShort2 + arg4;
		@Pc(21) int local21 = arg4 + this.aShort8;
		@Pc(26) int local26 = this.aShort1 + arg6;
		@Pc(31) int local31 = this.aShort3 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt4730 <= arg2.anInt4733 + local21 >> arg2.anInt4734 || local26 < 0 || arg2.anInt4733 + local31 >> arg2.anInt4734 >= arg2.anInt4732)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt4733 + local21 >> arg3.anInt4734 >= arg3.anInt4730 || local26 < 0 || arg3.anInt4733 + local31 >> arg3.anInt4734 >= arg3.anInt4732) {
				return;
			}
		} else {
			local16 >>= arg2.anInt4734;
			local21 = arg2.anInt4733 + local21 - 1 >> arg2.anInt4734;
			local26 >>= arg2.anInt4734;
			local31 = arg2.anInt4733 + local31 - 1 >> arg2.anInt4734;
			if (arg2.I(local16, local26) == arg5 && arg5 == arg2.I(local21, local26) && arg2.I(local16, local31) == arg5 && arg5 == arg2.I(local21, local31)) {
				return;
			}
		}
		@Pc(188) int local188;
		if (arg0 == 1) {
			for (local188 = 0; local188 < this.anInt296; local188++) {
				this.anIntArray20[local188] = this.anIntArray20[local188] + arg2.va(arg4 + this.anIntArray21[local188], this.anIntArray24[local188] - -arg6) - arg5;
			}
		} else {
			@Pc(254) int local254;
			@Pc(264) int local264;
			if (arg0 == 2) {
				@Pc(461) short local461 = this.aShort7;
				if (local461 == 0) {
					return;
				}
				for (local254 = 0; local254 < this.anInt296; local254++) {
					local264 = (this.anIntArray20[local254] << 16) / local461;
					if (arg1 > local264) {
						this.anIntArray20[local254] += (arg1 - local264) * (-arg5 + arg2.va(arg4 + this.anIntArray21[local254], this.anIntArray24[local254] + arg6)) / arg1;
					}
				}
			} else {
				@Pc(271) int local271;
				if (arg0 == 3) {
					local188 = (arg1 & 0xFF) * 4;
					local254 = (arg1 >> 8 & 0xFF) * 4;
					local264 = (arg1 >> 16 & 0xFF) << 6;
					local271 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local188 >> 1) < 0 || arg4 + (local188 >> 1) + arg2.anInt4733 >= arg2.anInt4730 << arg2.anInt4734 || arg6 - (local254 >> 1) < 0 || arg2.anInt4732 << arg2.anInt4734 <= arg2.anInt4733 + (local254 >> 1) + arg6) {
						return;
					}
					this.method4094(local271, arg5, local254, local264, local188, arg2, arg6, arg4);
				} else if (arg0 == 4) {
					local188 = this.aShort6 - this.aShort7;
					for (local254 = 0; local254 < this.anInt296; local254++) {
						this.anIntArray20[local254] = local188 + this.anIntArray20[local254] + arg3.va(this.anIntArray21[local254] - -arg4, this.anIntArray24[local254] + arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local188 = this.aShort6 - this.aShort7;
					for (local254 = 0; local254 < this.anInt296; local254++) {
						local264 = this.anIntArray21[local254] + arg4;
						local271 = arg6 + this.anIntArray24[local254];
						@Pc(276) int local276 = arg2.va(local264, local271);
						@Pc(281) int local281 = arg3.va(local264, local271);
						@Pc(285) int local285 = local276 - local281;
						this.anIntArray20[local254] = ((this.anIntArray20[local254] << 8) / local188 * local285 >> 8) - (arg5 - local276);
					}
				}
			}
		}
		this.aBoolean14 = false;
		if (this.aClass124_2 != null) {
			this.aClass124_2.anInterface6_4 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!rc;I)V")
	private void method261(@OriginalArg(0) Class116_Sub2 arg0) {
		@Pc(10) int local10;
		if (this.aClass56Array1 != null) {
			for (local10 = 0; local10 < this.aClass56Array1.length; local10++) {
				@Pc(17) Class56 local17 = this.aClass56Array1[local10];
				@Pc(19) Class56 local19 = local17;
				if (local17.aClass56_1 != null) {
					local19 = local17.aClass56_1;
				}
				local19.anInt1931 = (int) (arg0.aFloat176 + (float) this.anIntArray20[local17.anInt1933] * arg0.aFloat171 + (float) this.anIntArray21[local17.anInt1933] * arg0.aFloat169 + (float) this.anIntArray24[local17.anInt1933] * arg0.aFloat165);
				local19.anInt1930 = (int) (arg0.aFloat168 + (float) this.anIntArray24[local17.anInt1933] * arg0.aFloat173 + (float) this.anIntArray21[local17.anInt1933] * arg0.aFloat167 + arg0.aFloat166 * (float) this.anIntArray20[local17.anInt1933]);
				local19.anInt1941 = (int) (arg0.aFloat175 + (float) this.anIntArray24[local17.anInt1933] * arg0.aFloat170 + arg0.aFloat174 * (float) this.anIntArray20[local17.anInt1933] + (float) this.anIntArray21[local17.anInt1933] * arg0.aFloat172);
				local19.anInt1937 = (int) ((float) this.anIntArray24[local17.anInt1940] * arg0.aFloat165 + (float) this.anIntArray20[local17.anInt1940] * arg0.aFloat171 + (float) this.anIntArray21[local17.anInt1940] * arg0.aFloat169 + arg0.aFloat176);
				local19.anInt1942 = (int) (arg0.aFloat166 * (float) this.anIntArray20[local17.anInt1940] + arg0.aFloat167 * (float) this.anIntArray21[local17.anInt1940] + arg0.aFloat173 * (float) this.anIntArray24[local17.anInt1940] + arg0.aFloat168);
				local19.anInt1934 = (int) ((float) this.anIntArray24[local17.anInt1940] * arg0.aFloat170 + (float) this.anIntArray20[local17.anInt1940] * arg0.aFloat174 + arg0.aFloat172 * (float) this.anIntArray21[local17.anInt1940] + arg0.aFloat175);
				local19.anInt1928 = (int) (arg0.aFloat171 * (float) this.anIntArray20[local17.anInt1943] + arg0.aFloat169 * (float) this.anIntArray21[local17.anInt1943] + arg0.aFloat165 * (float) this.anIntArray24[local17.anInt1943] + arg0.aFloat176);
				local19.anInt1939 = (int) ((float) this.anIntArray21[local17.anInt1943] * arg0.aFloat167 + (float) this.anIntArray20[local17.anInt1943] * arg0.aFloat166 + (float) this.anIntArray24[local17.anInt1943] * arg0.aFloat173 + arg0.aFloat168);
				local19.anInt1932 = (int) ((float) this.anIntArray24[local17.anInt1943] * arg0.aFloat170 + arg0.aFloat174 * (float) this.anIntArray20[local17.anInt1943] + (float) this.anIntArray21[local17.anInt1943] * arg0.aFloat172 + arg0.aFloat175);
			}
		}
		if (this.aClass120Array1 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass120Array1.length; local10++) {
			@Pc(366) Class120 local366 = this.aClass120Array1[local10];
			@Pc(368) Class120 local368 = local366;
			if (local366.aClass120_2 != null) {
				local368 = local366.aClass120_2;
			}
			if (local366.aClass116_2 == null) {
				local366.aClass116_2 = arg0.method4951();
			} else {
				local366.aClass116_2.ba(arg0);
			}
			local368.anInt3179 = (int) (arg0.aFloat176 + (float) this.anIntArray24[local366.anInt3172] * arg0.aFloat165 + (float) this.anIntArray20[local366.anInt3172] * arg0.aFloat171 + (float) this.anIntArray21[local366.anInt3172] * arg0.aFloat169);
			local368.anInt3176 = (int) ((float) this.anIntArray20[local366.anInt3172] * arg0.aFloat166 + arg0.aFloat167 * (float) this.anIntArray21[local366.anInt3172] + arg0.aFloat173 * (float) this.anIntArray24[local366.anInt3172] + arg0.aFloat168);
			local368.anInt3174 = (int) (arg0.aFloat175 + (float) this.anIntArray24[local366.anInt3172] * arg0.aFloat170 + (float) this.anIntArray21[local366.anInt3172] * arg0.aFloat172 + arg0.aFloat174 * (float) this.anIntArray20[local366.anInt3172]);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BZZLclient!ag;ILclient!ag;)Lclient!c;")
	private Class7 method262(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class7_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class7_Sub1 arg4) {
		arg4.anInt303 = this.anInt303;
		arg4.aByte1 = 0;
		arg4.anInt279 = arg3;
		arg4.anInt301 = this.anInt301;
		arg4.anInt296 = this.anInt296;
		arg4.anInt280 = this.anInt280;
		arg4.anInt276 = this.anInt276;
		arg4.anInt266 = this.anInt266;
		arg4.anInt283 = this.anInt283;
		arg4.aShort4 = this.aShort4;
		arg4.aShort9 = this.aShort9;
		@Pc(59) boolean local59 = Static348.method4902(arg3, this.anInt266);
		@Pc(65) boolean local65 = Static435.method5599(arg3, this.anInt266);
		@Pc(71) boolean local71 = Static10.method287(this.anInt266, arg3);
		@Pc(77) boolean local77 = local71 | local65 | local59;
		@Pc(200) int local200;
		if (local77) {
			if (!local59) {
				arg4.anIntArray21 = this.anIntArray21;
			} else if (arg2.anIntArray21 == null || this.anInt301 > arg2.anIntArray21.length) {
				arg4.anIntArray21 = arg2.anIntArray21 = new int[this.anInt301];
			} else {
				arg4.anIntArray21 = arg2.anIntArray21;
			}
			if (!local65) {
				arg4.anIntArray20 = this.anIntArray20;
			} else if (arg2.anIntArray20 == null || arg2.anIntArray20.length < this.anInt301) {
				arg4.anIntArray20 = arg2.anIntArray20 = new int[this.anInt301];
			} else {
				arg4.anIntArray20 = arg2.anIntArray20;
			}
			if (!local71) {
				arg4.anIntArray24 = this.anIntArray24;
			} else if (arg2.anIntArray24 == null || this.anInt301 > arg2.anIntArray24.length) {
				arg4.anIntArray24 = arg2.anIntArray24 = new int[this.anInt301];
			} else {
				arg4.anIntArray24 = arg2.anIntArray24;
			}
			for (local200 = 0; local200 < this.anInt301; local200++) {
				if (local59) {
					arg4.anIntArray21[local200] = this.anIntArray21[local200];
				}
				if (local65) {
					arg4.anIntArray20[local200] = this.anIntArray20[local200];
				}
				if (local71) {
					arg4.anIntArray24[local200] = this.anIntArray24[local200];
				}
			}
		} else {
			arg4.anIntArray24 = this.anIntArray24;
			arg4.anIntArray20 = this.anIntArray20;
			arg4.anIntArray21 = this.anIntArray21;
		}
		if (Static74.method1341(arg3, this.anInt266)) {
			arg4.aClass124_2 = arg2.aClass124_2;
			if (arg1) {
				arg4.aByte1 = (byte) (arg4.aByte1 | 0x1);
			}
			arg4.aClass124_2.aByte59 = this.aClass124_2.aByte59;
			arg4.aClass124_2.anInterface6_4 = this.aClass124_2.anInterface6_4;
		} else if (Static229.method3192(arg3, this.anInt266)) {
			arg4.aClass124_2 = this.aClass124_2;
		} else {
			arg4.aClass124_2 = null;
		}
		if (Static314.method4330(arg3, this.anInt266)) {
			if (arg2.aShortArray2 == null || arg2.aShortArray2.length < this.anInt303) {
				arg4.aShortArray2 = arg2.aShortArray2 = new short[this.anInt303];
			} else {
				arg4.aShortArray2 = arg2.aShortArray2;
			}
			for (local200 = 0; local200 < this.anInt303; local200++) {
				arg4.aShortArray2[local200] = this.aShortArray2[local200];
			}
		} else {
			arg4.aShortArray2 = this.aShortArray2;
		}
		if (Static223.method3134(this.anInt266, arg3)) {
			if (arg2.aByteArray4 == null || arg2.aByteArray4.length < this.anInt303) {
				arg4.aByteArray4 = arg2.aByteArray4 = new byte[this.anInt303];
			} else {
				arg4.aByteArray4 = arg2.aByteArray4;
			}
			for (local200 = 0; local200 < this.anInt303; local200++) {
				arg4.aByteArray4[local200] = this.aByteArray4[local200];
			}
		} else {
			arg4.aByteArray4 = this.aByteArray4;
		}
		if (Static105.method1658(arg3, this.anInt266)) {
			if (arg1) {
				arg4.aByte1 = (byte) (arg4.aByte1 | 0x2);
			}
			arg4.aClass124_4 = arg2.aClass124_4;
			arg4.aClass124_4.aByte59 = this.aClass124_4.aByte59;
			arg4.aClass124_4.anInterface6_4 = this.aClass124_4.anInterface6_4;
		} else if (Static100.method1585(this.anInt266, arg3)) {
			arg4.aClass124_4 = this.aClass124_4;
		} else {
			arg4.aClass124_4 = null;
		}
		@Pc(531) int local531;
		if (Static287.method4005(arg3, this.anInt266)) {
			if (arg2.aShortArray7 == null || arg2.aShortArray7.length < this.anInt276) {
				local200 = this.anInt276;
				arg4.aShortArray3 = arg2.aShortArray3 = new short[local200];
				arg4.aShortArray7 = arg2.aShortArray7 = new short[local200];
				arg4.aShortArray11 = arg2.aShortArray11 = new short[local200];
			} else {
				arg4.aShortArray7 = arg2.aShortArray7;
				arg4.aShortArray11 = arg2.aShortArray11;
				arg4.aShortArray3 = arg2.aShortArray3;
			}
			if (this.aClass269_1 == null) {
				for (local200 = 0; local200 < this.anInt276; local200++) {
					arg4.aShortArray7[local200] = this.aShortArray7[local200];
					arg4.aShortArray3[local200] = this.aShortArray3[local200];
					arg4.aShortArray11[local200] = this.aShortArray11[local200];
				}
			} else {
				if (arg2.aClass269_1 == null) {
					arg2.aClass269_1 = new Class269();
				}
				@Pc(519) Class269 local519 = arg4.aClass269_1 = arg2.aClass269_1;
				if (local519.aShortArray115 == null || this.anInt276 > local519.aShortArray115.length) {
					local531 = this.anInt276;
					local519.aShortArray116 = new short[local531];
					local519.aByteArray95 = new byte[local531];
					local519.aShortArray115 = new short[local531];
					local519.aShortArray114 = new short[local531];
				}
				for (local531 = 0; local531 < this.anInt276; local531++) {
					arg4.aShortArray7[local531] = this.aShortArray7[local531];
					arg4.aShortArray3[local531] = this.aShortArray3[local531];
					arg4.aShortArray11[local531] = this.aShortArray11[local531];
					local519.aShortArray115[local531] = this.aClass269_1.aShortArray115[local531];
					local519.aShortArray114[local531] = this.aClass269_1.aShortArray114[local531];
					local519.aShortArray116[local531] = this.aClass269_1.aShortArray116[local531];
					local519.aByteArray95[local531] = this.aClass269_1.aByteArray95[local531];
				}
			}
			arg4.aByteArray5 = this.aByteArray5;
		} else {
			arg4.aClass269_1 = this.aClass269_1;
			arg4.aShortArray11 = this.aShortArray11;
			arg4.aByteArray5 = this.aByteArray5;
			arg4.aShortArray3 = this.aShortArray3;
			arg4.aShortArray7 = this.aShortArray7;
		}
		if (Static141.method2011(arg3, this.anInt266)) {
			if (arg1) {
				arg4.aByte1 = (byte) (arg4.aByte1 | 0x4);
			}
			arg4.aClass124_1 = arg2.aClass124_1;
			arg4.aClass124_1.anInterface6_4 = this.aClass124_1.anInterface6_4;
			arg4.aClass124_1.aByte59 = this.aClass124_1.aByte59;
		} else if (Static344.method4803(this.anInt266, arg3)) {
			arg4.aClass124_1 = this.aClass124_1;
		} else {
			arg4.aClass124_1 = null;
		}
		if (Static433.method5558(this.anInt266, arg3)) {
			if (arg2.aFloatArray1 == null || arg2.aFloatArray1.length < this.anInt303) {
				local200 = this.anInt276;
				arg4.aFloatArray2 = arg2.aFloatArray2 = new float[local200];
				arg4.aFloatArray1 = arg2.aFloatArray1 = new float[local200];
			} else {
				arg4.aFloatArray1 = arg2.aFloatArray1;
				arg4.aFloatArray2 = arg2.aFloatArray2;
			}
			for (local200 = 0; local200 < this.anInt276; local200++) {
				arg4.aFloatArray1[local200] = this.aFloatArray1[local200];
				arg4.aFloatArray2[local200] = this.aFloatArray2[local200];
			}
		} else {
			arg4.aFloatArray2 = this.aFloatArray2;
			arg4.aFloatArray1 = this.aFloatArray1;
		}
		if (Static314.method4329(this.anInt266, arg3)) {
			arg4.aClass124_3 = arg2.aClass124_3;
			if (arg1) {
				arg4.aByte1 = (byte) (arg4.aByte1 | 0x8);
			}
			arg4.aClass124_3.aByte59 = this.aClass124_3.aByte59;
			arg4.aClass124_3.anInterface6_4 = this.aClass124_3.anInterface6_4;
		} else if (Static158.method2335(this.anInt266, arg3)) {
			arg4.aClass124_3 = this.aClass124_3;
		} else {
			arg4.aClass124_3 = null;
		}
		if (Static114.method1814(this.anInt266, arg3)) {
			if (arg2.aShortArray8 == null || arg2.aShortArray8.length < this.anInt303) {
				local200 = this.anInt303;
				arg4.aShortArray8 = arg2.aShortArray8 = new short[local200];
				arg4.aShortArray10 = arg2.aShortArray10 = new short[local200];
				arg4.aShortArray5 = arg2.aShortArray5 = new short[local200];
			} else {
				arg4.aShortArray8 = arg2.aShortArray8;
				arg4.aShortArray10 = arg2.aShortArray10;
				arg4.aShortArray5 = arg2.aShortArray5;
			}
			for (local200 = 0; local200 < this.anInt303; local200++) {
				arg4.aShortArray8[local200] = this.aShortArray8[local200];
				arg4.aShortArray5[local200] = this.aShortArray5[local200];
				arg4.aShortArray10[local200] = this.aShortArray10[local200];
			}
		} else {
			arg4.aShortArray10 = this.aShortArray10;
			arg4.aShortArray8 = this.aShortArray8;
			arg4.aShortArray5 = this.aShortArray5;
		}
		if (Static153.method2273(arg3, this.anInt266)) {
			arg4.aClass60_1 = arg2.aClass60_1;
			if (arg1) {
				arg4.aByte1 = (byte) (arg4.aByte1 | 0x10);
			}
			arg4.aClass60_1.anInterface12_3 = this.aClass60_1.anInterface12_3;
		} else if (Static267.method3633(arg3, this.anInt266)) {
			arg4.aClass60_1 = this.aClass60_1;
		} else {
			arg4.aClass60_1 = null;
		}
		if (Static441.method3963(arg3, this.anInt266)) {
			if (arg2.aShortArray1 == null || arg2.aShortArray1.length < this.anInt303) {
				local200 = this.anInt303;
				arg4.aShortArray1 = arg2.aShortArray1 = new short[local200];
			} else {
				arg4.aShortArray1 = arg2.aShortArray1;
			}
			for (local200 = 0; local200 < this.anInt303; local200++) {
				arg4.aShortArray1[local200] = this.aShortArray1[local200];
			}
		} else {
			arg4.aShortArray1 = this.aShortArray1;
		}
		if (!Static215.method5515(this.anInt266, arg3)) {
			arg4.aClass97Array1 = this.aClass97Array1;
		} else if (arg2.aClass97Array1 == null || this.anInt283 > arg2.aClass97Array1.length) {
			local200 = this.anInt283;
			arg4.aClass97Array1 = arg2.aClass97Array1 = new Class97[local200];
			for (local531 = 0; local531 < this.anInt283; local531++) {
				arg4.aClass97Array1[local531] = this.aClass97Array1[local531].method1999();
			}
		} else {
			arg4.aClass97Array1 = arg2.aClass97Array1;
			for (local200 = 0; local200 < this.anInt283; local200++) {
				arg4.aClass97Array1[local200].method2002(this.aClass97Array1[local200]);
			}
		}
		arg4.aShortArray6 = this.aShortArray6;
		arg4.anIntArray19 = this.anIntArray19;
		arg4.anIntArrayArray3 = this.anIntArrayArray3;
		arg4.aShortArray4 = this.aShortArray4;
		if (this.aBoolean14) {
			arg4.aShort7 = this.aShort7;
			arg4.aBoolean14 = true;
			arg4.aShort3 = this.aShort3;
			arg4.aShort5 = this.aShort5;
			arg4.aShort6 = this.aShort6;
			arg4.aShort2 = this.aShort2;
			arg4.aShort1 = this.aShort1;
			arg4.aShort8 = this.aShort8;
		} else {
			arg4.aBoolean14 = false;
		}
		arg4.aClass51Array1 = this.aClass51Array1;
		arg4.aClass120Array1 = this.aClass120Array1;
		arg4.anIntArrayArray2 = this.anIntArrayArray2;
		arg4.anIntArrayArray1 = this.anIntArrayArray1;
		arg4.aClass56Array1 = this.aClass56Array1;
		arg4.aShortArray9 = this.aShortArray9;
		arg4.anIntArray22 = this.anIntArray22;
		return arg4;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	private void method263() {
		if (this.anInt280 == 0) {
			return;
		}
		if (this.aByte1 != 0) {
			this.method258(true);
		}
		this.method258(false);
		if (this.aClass60_1 != null) {
			if (this.aClass60_1.anInterface12_3 == null) {
				this.method256((this.aByte1 & 0x10) != 0);
			}
			if (this.aClass60_1.anInterface12_3 != null) {
				this.aClass30_Sub1_4.method952(this.aClass124_1 != null);
				this.aClass30_Sub1_4.method919(this.aClass124_3, this.aClass124_2, this.aClass124_1, this.aClass124_4);
				@Pc(79) int local79 = this.anIntArray19.length - 1;
				for (@Pc(81) int local81 = 0; local81 < local79; local81++) {
					@Pc(88) int local88 = this.anIntArray19[local81];
					@Pc(95) int local95 = this.anIntArray19[local81 + 1];
					@Pc(102) int local102 = this.aShortArray1[local88] & 0xFFFF;
					if (local102 == 65535) {
						local102 = -1;
					}
					this.aClass30_Sub1_4.method914(this.aClass124_1 != null, local102);
					this.aClass30_Sub1_4.method958(local88 * 3, (local95 - local88) * 3, this.aClass60_1.anInterface12_3);
				}
			}
		}
		this.method260();
	}

	@OriginalMember(owner = "client!ag", name = "xa", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			local22 = arg2 << 4;
			Static154.anInt2945 = 0;
			Static287.anInt5209 = 0;
			local28 = 0;
			Static122.anInt2516 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray1.length > local38) {
					local48 = this.anIntArrayArray1[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static287.anInt5209 += this.anIntArray21[local56];
						Static122.anInt2516 += this.anIntArray20[local56];
						Static154.anInt2945 += this.anIntArray24[local56];
						local28++;
					}
				}
			}
			if (local28 <= 0) {
				Static287.anInt5209 = local22;
				Static122.anInt2516 = local18;
				Static154.anInt2945 = local14;
			} else {
				Static154.anInt2945 = local14 + Static154.anInt2945 / local28;
				Static287.anInt5209 = Static287.anInt5209 / local28 + local22;
				Static122.anInt2516 = local18 + Static122.anInt2516 / local28;
			}
			return;
		}
		@Pc(158) int[] local158;
		@Pc(160) int local160;
		if (arg0 == 1) {
			local14 = arg4 << 4;
			local22 = arg2 << 4;
			local18 = arg3 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray1.length > local32) {
					local158 = this.anIntArrayArray1[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local50 = local158[local160];
						this.anIntArray21[local50] += local22;
						this.anIntArray20[local50] += local18;
						this.anIntArray24[local50] += local14;
					}
				}
			}
			return;
		}
		@Pc(279) int local279;
		@Pc(297) int local297;
		@Pc(749) int local749;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray1.length > local32) {
					local158 = this.anIntArrayArray1[local32];
					if ((arg5 & 0x1) == 0) {
						for (local160 = 0; local160 < local158.length; local160++) {
							local50 = local158[local160];
							this.anIntArray21[local50] -= Static287.anInt5209;
							this.anIntArray20[local50] -= Static122.anInt2516;
							this.anIntArray24[local50] -= Static154.anInt2945;
							if (arg4 != 0) {
								local56 = Class56.anIntArray119[arg4];
								local279 = Class56.anIntArray120[arg4];
								local297 = this.anIntArray21[local50] * local279 + local56 * this.anIntArray20[local50] + 32767 >> 15;
								this.anIntArray20[local50] = local279 * this.anIntArray20[local50] + 32767 - local56 * this.anIntArray21[local50] >> 15;
								this.anIntArray21[local50] = local297;
							}
							if (arg2 != 0) {
								local56 = Class56.anIntArray119[arg2];
								local279 = Class56.anIntArray120[arg2];
								local297 = this.anIntArray20[local50] * local279 + 32767 - local56 * this.anIntArray24[local50] >> 15;
								this.anIntArray24[local50] = this.anIntArray24[local50] * local279 + this.anIntArray20[local50] * local56 + 32767 >> 15;
								this.anIntArray20[local50] = local297;
							}
							if (arg3 != 0) {
								local56 = Class56.anIntArray119[arg3];
								local279 = Class56.anIntArray120[arg3];
								local297 = local279 * this.anIntArray21[local50] + this.anIntArray24[local50] * local56 + 32767 >> 15;
								this.anIntArray24[local50] = this.anIntArray24[local50] * local279 + 32767 - local56 * this.anIntArray21[local50] >> 15;
								this.anIntArray21[local50] = local297;
							}
							this.anIntArray21[local50] += Static287.anInt5209;
							this.anIntArray20[local50] += Static122.anInt2516;
							this.anIntArray24[local50] += Static154.anInt2945;
						}
					} else {
						for (local160 = 0; local160 < local158.length; local160++) {
							local50 = local158[local160];
							this.anIntArray21[local50] -= Static287.anInt5209;
							this.anIntArray20[local50] -= Static122.anInt2516;
							this.anIntArray24[local50] -= Static154.anInt2945;
							if (arg2 != 0) {
								local56 = Class56.anIntArray119[arg2];
								local279 = Class56.anIntArray120[arg2];
								local297 = this.anIntArray20[local50] * local279 + 32767 - local56 * this.anIntArray24[local50] >> 15;
								this.anIntArray24[local50] = this.anIntArray24[local50] * local279 + this.anIntArray20[local50] * local56 + 32767 >> 15;
								this.anIntArray20[local50] = local297;
							}
							if (arg4 != 0) {
								local56 = Class56.anIntArray119[arg4];
								local279 = Class56.anIntArray120[arg4];
								local297 = this.anIntArray20[local50] * local56 + local279 * this.anIntArray21[local50] + 32767 >> 15;
								this.anIntArray20[local50] = this.anIntArray20[local50] * local279 + 32767 - this.anIntArray21[local50] * local56 >> 15;
								this.anIntArray21[local50] = local297;
							}
							if (arg3 != 0) {
								local56 = Class56.anIntArray119[arg3];
								local279 = Class56.anIntArray120[arg3];
								local297 = this.anIntArray21[local50] * local279 + this.anIntArray24[local50] * local56 + 32767 >> 15;
								this.anIntArray24[local50] = this.anIntArray24[local50] * local279 + 32767 - this.anIntArray21[local50] * local56 >> 15;
								this.anIntArray21[local50] = local297;
							}
							this.anIntArray21[local50] += Static287.anInt5209;
							this.anIntArray20[local50] += Static122.anInt2516;
							this.anIntArray24[local50] += Static154.anInt2945;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray1.length > local38) {
						local48 = this.anIntArrayArray1[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local279 = this.anIntArray22[local56];
							local297 = this.anIntArray22[local56 + 1];
							for (local749 = local279; local749 < local297; local749++) {
								@Pc(758) int local758 = this.aShortArray9[local749] - 1;
								if (local758 == -1) {
									break;
								}
								@Pc(768) int local768;
								@Pc(772) int local772;
								@Pc(791) int local791;
								if (arg4 != 0) {
									local768 = Class56.anIntArray119[arg4];
									local772 = Class56.anIntArray120[arg4];
									local791 = local768 * this.aShortArray3[local758] + this.aShortArray7[local758] * local772 + 32767 >> 15;
									this.aShortArray3[local758] = (short) (this.aShortArray3[local758] * local772 + 32767 - local768 * this.aShortArray7[local758] >> 15);
									this.aShortArray7[local758] = (short) local791;
								}
								if (arg2 != 0) {
									local768 = Class56.anIntArray119[arg2];
									local772 = Class56.anIntArray120[arg2];
									local791 = this.aShortArray3[local758] * local772 + 32767 - this.aShortArray11[local758] * local768 >> 15;
									this.aShortArray11[local758] = (short) (this.aShortArray11[local758] * local772 + local768 * this.aShortArray3[local758] + 32767 >> 15);
									this.aShortArray3[local758] = (short) local791;
								}
								if (arg3 != 0) {
									local768 = Class56.anIntArray119[arg3];
									local772 = Class56.anIntArray120[arg3];
									local791 = local772 * this.aShortArray7[local758] + this.aShortArray11[local758] * local768 + 32767 >> 15;
									this.aShortArray11[local758] = (short) (local772 * this.aShortArray11[local758] + 32767 - this.aShortArray7[local758] * local768 >> 15);
									this.aShortArray7[local758] = (short) local791;
								}
							}
						}
					}
				}
				if (this.aClass124_1 == null && this.aClass124_4 != null) {
					this.aClass124_4.anInterface6_4 = null;
				}
				if (this.aClass124_1 != null) {
					this.aClass124_1.anInterface6_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray1.length > local32) {
					local158 = this.anIntArrayArray1[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local50 = local158[local160];
						this.anIntArray21[local50] -= Static287.anInt5209;
						this.anIntArray20[local50] -= Static122.anInt2516;
						this.anIntArray24[local50] -= Static154.anInt2945;
						this.anIntArray21[local50] = arg2 * this.anIntArray21[local50] >> 7;
						this.anIntArray20[local50] = this.anIntArray20[local50] * arg3 >> 7;
						this.anIntArray24[local50] = this.anIntArray24[local50] * arg4 >> 7;
						this.anIntArray21[local50] += Static287.anInt5209;
						this.anIntArray20[local50] += Static122.anInt2516;
						this.anIntArray24[local50] += Static154.anInt2945;
					}
				}
			}
		} else {
			@Pc(1211) Class51 local1211;
			@Pc(1216) Class97 local1216;
			if (arg0 == 5) {
				if (this.anIntArrayArray3 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray3.length > local32) {
							local158 = this.anIntArrayArray3[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local50 = local158[local160];
								local56 = arg2 * 8 + (this.aByteArray4[local50] & 0xFF);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray4[local50] = (byte) local56;
							}
							if (local158.length > 0 && this.aClass124_4 != null) {
								this.aClass124_4.anInterface6_4 = null;
							}
						}
					}
					if (this.aClass51Array1 != null) {
						for (local32 = 0; local32 < this.anInt283; local32++) {
							local1211 = this.aClass51Array1[local32];
							local1216 = this.aClass97Array1[local32];
							local1216.anInt2660 = 255 - (this.aByteArray4[local1211.anInt1831] & 0xFF) << 24 | local1216.anInt2660 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1465) Class97 local1465;
				if (arg0 == 8) {
					if (this.anIntArrayArray2 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray2.length) {
								local158 = this.anIntArrayArray2[local32];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1465 = this.aClass97Array1[local158[local160]];
									local1465.anInt2658 += arg3;
									local1465.anInt2657 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray2 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray2.length > local32) {
								local158 = this.anIntArrayArray2[local32];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1465 = this.aClass97Array1[local158[local160]];
									local1465.anInt2656 = local1465.anInt2656 * arg3 >> 7;
									local1465.anInt2659 = local1465.anInt2659 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray2 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray2.length) {
							local158 = this.anIntArrayArray2[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local1465 = this.aClass97Array1[local158[local160]];
								local1465.anInt2661 = local1465.anInt2661 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray3 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray3.length) {
						local158 = this.anIntArrayArray3[local32];
						for (local160 = 0; local160 < local158.length; local160++) {
							local50 = local158[local160];
							local56 = this.aShortArray2[local50] & 0xFFFF;
							local279 = local56 >> 10 & 0x3F;
							local297 = local56 >> 7 & 0x7;
							@Pc(1308) int local1308 = local279 + arg2 & 0x3F;
							local749 = local56 & 0x7F;
							local297 += arg3 / 4;
							if (local297 < 0) {
								local297 = 0;
							} else if (local297 > 7) {
								local297 = 7;
							}
							local749 += arg4;
							if (local749 < 0) {
								local749 = 0;
							} else if (local749 > 127) {
								local749 = 127;
							}
							this.aShortArray2[local50] = (short) (local749 | local1308 << 10 | local297 << 7);
						}
						if (local158.length > 0 && this.aClass124_4 != null) {
							this.aClass124_4.anInterface6_4 = null;
						}
					}
				}
				if (this.aClass51Array1 != null) {
					for (local32 = 0; local32 < this.anInt283; local32++) {
						local1211 = this.aClass51Array1[local32];
						local1216 = this.aClass97Array1[local32];
						local1216.anInt2660 = Static154.anIntArray246[this.aShortArray2[local1211.anInt1831] & 0xFFFF] & 0xFFFFFF | local1216.anInt2660 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		return this.aShort9;
	}

	@OriginalMember(owner = "client!ag", name = "C", descriptor = "()I")
	@Override
	public int C() {
		if (!this.aBoolean14) {
			this.method251();
		}
		return this.aShort3;
	}

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "(SS)V")
	@Override
	public void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt303; local7++) {
			if (this.aShortArray2[local7] == arg0) {
				this.aShortArray2[local7] = arg1;
			}
		}
		if (this.aClass51Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt283; local34++) {
				@Pc(41) Class51 local41 = this.aClass51Array1[local34];
				@Pc(46) Class97 local46 = this.aClass97Array1[local34];
				local46.anInt2660 = local46.anInt2660 & 0xFF000000 | Static154.anIntArray246[this.aShortArray2[local41.anInt1831] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass124_4 != null) {
			this.aClass124_4.anInterface6_4 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	@Override
	public void method4078(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class7_Sub1 local8 = (Class7_Sub1) arg0;
		if (this.anInt303 == 0 || local8.anInt303 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt296;
		@Pc(21) int[] local21 = local8.anIntArray21;
		@Pc(24) int[] local24 = local8.anIntArray20;
		@Pc(27) int[] local27 = local8.anIntArray24;
		@Pc(30) short[] local30 = local8.aShortArray7;
		@Pc(33) short[] local33 = local8.aShortArray3;
		@Pc(36) short[] local36 = local8.aShortArray11;
		@Pc(39) byte[] local39 = local8.aByteArray5;
		@Pc(58) short[] local58;
		@Pc(50) short[] local50;
		@Pc(54) short[] local54;
		@Pc(46) byte[] local46;
		if (this.aClass269_1 == null) {
			local54 = null;
			local46 = null;
			local58 = null;
			local50 = null;
		} else {
			local46 = this.aClass269_1.aByteArray95;
			local50 = this.aClass269_1.aShortArray114;
			local54 = this.aClass269_1.aShortArray116;
			local58 = this.aClass269_1.aShortArray115;
		}
		@Pc(87) short[] local87;
		@Pc(75) short[] local75;
		@Pc(79) short[] local79;
		@Pc(83) byte[] local83;
		if (local8.aClass269_1 == null) {
			local83 = null;
			local75 = null;
			local87 = null;
			local79 = null;
		} else {
			local75 = local8.aClass269_1.aShortArray114;
			local79 = local8.aClass269_1.aShortArray116;
			local83 = local8.aClass269_1.aByteArray95;
			local87 = local8.aClass269_1.aShortArray115;
		}
		@Pc(100) int[] local100 = local8.anIntArray22;
		@Pc(103) short[] local103 = local8.aShortArray9;
		if (!local8.aBoolean14) {
			local8.method251();
		}
		@Pc(112) short local112 = local8.aShort7;
		@Pc(115) short local115 = local8.aShort6;
		@Pc(118) short local118 = local8.aShort2;
		@Pc(121) short local121 = local8.aShort8;
		@Pc(124) short local124 = local8.aShort1;
		@Pc(127) short local127 = local8.aShort3;
		for (@Pc(129) int local129 = 0; local129 < this.anInt296; local129++) {
			@Pc(138) int local138 = this.anIntArray20[local129] - arg2;
			if (local138 >= local112 && local138 <= local115) {
				@Pc(158) int local158 = this.anIntArray21[local129] - arg1;
				if (local118 <= local158 && local158 <= local121) {
					@Pc(178) int local178 = this.anIntArray24[local129] - arg3;
					if (local178 >= local124 && local178 <= local127) {
						@Pc(196) int local196 = -1;
						@Pc(201) int local201 = this.anIntArray22[local129];
						@Pc(208) int local208 = this.anIntArray22[local129 + 1];
						for (@Pc(210) int local210 = local201; local210 < local208; local210++) {
							local196 = this.aShortArray9[local210] - 1;
							if (local196 == -1 || this.aByteArray5[local196] != 0) {
								break;
							}
						}
						if (local196 != -1) {
							for (@Pc(245) int local245 = 0; local245 < local18; local245++) {
								if (local21[local245] == local158 && local178 == local27[local245] && local138 == local24[local245]) {
									local201 = local100[local245];
									local208 = local100[local245 + 1];
									@Pc(282) int local282 = -1;
									for (@Pc(284) int local284 = local201; local284 < local208; local284++) {
										local282 = local103[local284] - 1;
										if (local282 == -1 || local39[local282] != 0) {
											break;
										}
									}
									if (local282 != -1) {
										if (local58 == null) {
											this.aClass269_1 = new Class269();
											local58 = this.aClass269_1.aShortArray115 = Static103.method1617(this.aShortArray7);
											local50 = this.aClass269_1.aShortArray114 = Static103.method1617(this.aShortArray3);
											local54 = this.aClass269_1.aShortArray116 = Static103.method1617(this.aShortArray11);
											local46 = this.aClass269_1.aByteArray95 = Static348.method4903(this.aByteArray5);
										}
										if (local87 == null) {
											@Pc(365) Class269 local365 = local8.aClass269_1 = new Class269();
											local87 = local365.aShortArray115 = Static103.method1617(local30);
											local75 = local365.aShortArray114 = Static103.method1617(local33);
											local79 = local365.aShortArray116 = Static103.method1617(local36);
											local83 = local365.aByteArray95 = Static348.method4903(local39);
										}
										@Pc(398) short local398 = this.aShortArray7[local196];
										@Pc(403) short local403 = this.aShortArray3[local196];
										@Pc(408) short local408 = this.aShortArray11[local196];
										local201 = local100[local245];
										@Pc(417) byte local417 = this.aByteArray5[local196];
										local208 = local100[local245 + 1];
										@Pc(433) int local433;
										for (@Pc(425) int local425 = local201; local425 < local208; local425++) {
											local433 = local103[local425] - 1;
											if (local433 == -1) {
												break;
											}
											if (local83[local433] != 0) {
												local87[local433] += local398;
												local75[local433] += local403;
												local79[local433] += local408;
												local83[local433] += local417;
											}
										}
										local417 = local39[local282];
										local408 = local36[local282];
										local201 = this.anIntArray22[local129];
										local398 = local30[local282];
										local208 = this.anIntArray22[local129 + 1];
										local403 = local33[local282];
										for (local433 = local201; local433 < local208; local433++) {
											@Pc(520) int local520 = this.aShortArray9[local433] - 1;
											if (local520 == -1) {
												break;
											}
											if (local46[local520] != 0) {
												local58[local520] += local398;
												local50[local520] += local403;
												local54[local520] += local408;
												local46[local520] += local417;
											}
										}
										if (this.aClass124_1 == null && this.aClass124_4 != null) {
											this.aClass124_4.anInterface6_4 = null;
										}
										if (this.aClass124_1 != null) {
											this.aClass124_1.anInterface6_4 = null;
										}
										if (local8.aClass124_1 == null && local8.aClass124_4 != null) {
											local8.aClass124_4.anInterface6_4 = null;
										}
										if (local8.aClass124_1 != null) {
											local8.aClass124_1.anInterface6_4 = null;
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

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "()Z")
	@Override
	public boolean method4090() {
		if (this.aShortArray1 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray1.length; local12++) {
			if (this.aShortArray1[local12] != -1 && !this.aClass30_Sub1_4.anInterface10_7.method4242(this.aShortArray1[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "K", descriptor = "(IIII)V")
	@Override
	protected void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static122.anInt2516 = 0;
			local14 = 0;
			Static154.anInt2945 = 0;
			Static287.anInt5209 = 0;
			for (local20 = 0; local20 < this.anInt296; local20++) {
				Static287.anInt5209 += this.anIntArray21[local20];
				Static122.anInt2516 += this.anIntArray20[local20];
				Static154.anInt2945 += this.anIntArray24[local20];
				local14++;
			}
			if (local14 <= 0) {
				Static122.anInt2516 = arg2;
				Static154.anInt2945 = arg3;
				Static287.anInt5209 = arg1;
			} else {
				Static122.anInt2516 = Static122.anInt2516 / local14 + arg2;
				Static287.anInt5209 = Static287.anInt5209 / local14 + arg1;
				Static154.anInt2945 = Static154.anInt2945 / local14 + arg3;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt296; local14++) {
				this.anIntArray21[local14] += arg1;
				this.anIntArray20[local14] += arg2;
				this.anIntArray24[local14] += arg3;
			}
		} else {
			@Pc(159) int local159;
			@Pc(177) int local177;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt296; local14++) {
					this.anIntArray21[local14] -= Static287.anInt5209;
					this.anIntArray20[local14] -= Static122.anInt2516;
					this.anIntArray24[local14] -= Static154.anInt2945;
					if (arg3 != 0) {
						local20 = Class56.anIntArray119[arg3];
						local159 = Class56.anIntArray120[arg3];
						local177 = this.anIntArray21[local14] * local159 + this.anIntArray20[local14] * local20 + 32767 >> 15;
						this.anIntArray20[local14] = this.anIntArray20[local14] * local159 + 32767 - local20 * this.anIntArray21[local14] >> 15;
						this.anIntArray21[local14] = local177;
					}
					if (arg1 != 0) {
						local20 = Class56.anIntArray119[arg1];
						local159 = Class56.anIntArray120[arg1];
						local177 = local159 * this.anIntArray20[local14] + 32767 - local20 * this.anIntArray24[local14] >> 15;
						this.anIntArray24[local14] = local159 * this.anIntArray24[local14] + local20 * this.anIntArray20[local14] + 32767 >> 15;
						this.anIntArray20[local14] = local177;
					}
					if (arg2 != 0) {
						local20 = Class56.anIntArray119[arg2];
						local159 = Class56.anIntArray120[arg2];
						local177 = this.anIntArray21[local14] * local159 + this.anIntArray24[local14] * local20 + 32767 >> 15;
						this.anIntArray24[local14] = local159 * this.anIntArray24[local14] + 32767 - local20 * this.anIntArray21[local14] >> 15;
						this.anIntArray21[local14] = local177;
					}
					this.anIntArray21[local14] += Static287.anInt5209;
					this.anIntArray20[local14] += Static122.anInt2516;
					this.anIntArray24[local14] += Static154.anInt2945;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt296; local14++) {
					this.anIntArray21[local14] -= Static287.anInt5209;
					this.anIntArray20[local14] -= Static122.anInt2516;
					this.anIntArray24[local14] -= Static154.anInt2945;
					this.anIntArray21[local14] = this.anIntArray21[local14] * arg1 / 128;
					this.anIntArray20[local14] = this.anIntArray20[local14] * arg2 / 128;
					this.anIntArray24[local14] = arg3 * this.anIntArray24[local14] / 128;
					this.anIntArray21[local14] += Static287.anInt5209;
					this.anIntArray20[local14] += Static122.anInt2516;
					this.anIntArray24[local14] += Static154.anInt2945;
				}
			} else {
				@Pc(516) Class51 local516;
				@Pc(521) Class97 local521;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt303; local14++) {
						local20 = (this.aByteArray4[local14] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray4[local14] = (byte) local20;
					}
					if (this.aClass124_4 != null) {
						this.aClass124_4.anInterface6_4 = null;
					}
					if (this.aClass51Array1 != null) {
						for (local20 = 0; local20 < this.anInt283; local20++) {
							local516 = this.aClass51Array1[local20];
							local521 = this.aClass97Array1[local20];
							local521.anInt2660 = 255 - (this.aByteArray4[local516.anInt1831] & 0xFF) << 24 | local521.anInt2660 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt303; local14++) {
						local20 = this.aShortArray2[local14] & 0xFFFF;
						local159 = local20 >> 10 & 0x3F;
						local177 = local20 >> 7 & 0x7;
						@Pc(582) int local582 = arg1 + local159 & 0x3F;
						@Pc(586) int local586 = local20 & 0x7F;
						local177 += arg2 / 4;
						if (local177 < 0) {
							local177 = 0;
						} else if (local177 > 7) {
							local177 = 7;
						}
						local586 += arg3;
						if (local586 < 0) {
							local586 = 0;
						} else if (local586 > 127) {
							local586 = 127;
						}
						this.aShortArray2[local14] = (short) (local582 << 10 | local177 << 7 | local586);
					}
					if (this.aClass124_4 != null) {
						this.aClass124_4.anInterface6_4 = null;
					}
					if (this.aClass51Array1 != null) {
						for (local20 = 0; local20 < this.anInt283; local20++) {
							local516 = this.aClass51Array1[local20];
							local521 = this.aClass97Array1[local20];
							local521.anInt2660 = Static154.anIntArray246[this.aShortArray2[local516.anInt1831] & 0xFFFF] & 0xFFFFFF | local521.anInt2660 & 0xFF000000;
						}
					}
				} else {
					@Pc(708) Class97 local708;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt283; local14++) {
							local708 = this.aClass97Array1[local14];
							local708.anInt2658 += arg2;
							local708.anInt2657 += arg1;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt283; local14++) {
							local708 = this.aClass97Array1[local14];
							local708.anInt2659 = arg1 * local708.anInt2659 >> 7;
							local708.anInt2656 = local708.anInt2656 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt283; local14++) {
							local708 = this.aClass97Array1[local14];
							local708.anInt2661 = local708.anInt2661 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BIZ)Lclient!c;")
	@Override
	public Class7 method4077(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class7_Sub1 local18;
		@Pc(14) Class7_Sub1 local14;
		if (arg0 == 1) {
			local14 = this.aClass30_Sub1_4.aClass7_Sub1_4;
			local18 = this.aClass30_Sub1_4.aClass7_Sub1_3;
		} else if (arg0 == 2) {
			local18 = this.aClass30_Sub1_4.aClass7_Sub1_2;
			local14 = this.aClass30_Sub1_4.aClass7_Sub1_5;
		} else if (arg0 == 3) {
			local14 = this.aClass30_Sub1_4.aClass7_Sub1_8;
			local18 = this.aClass30_Sub1_4.aClass7_Sub1_10;
		} else if (arg0 == 4) {
			local14 = this.aClass30_Sub1_4.aClass7_Sub1_7;
			local18 = this.aClass30_Sub1_4.aClass7_Sub1_1;
		} else if (arg0 == 5) {
			local18 = this.aClass30_Sub1_4.aClass7_Sub1_6;
			local14 = this.aClass30_Sub1_4.aClass7_Sub1_9;
		} else {
			local18 = local14 = new Class7_Sub1(this.aClass30_Sub1_4);
		}
		return this.method262(arg2, arg0 != 0, local14, arg1, local18);
	}

	@OriginalMember(owner = "client!ag", name = "W", descriptor = "()V")
	@Override
	protected void W() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt301; local3++) {
			this.anIntArray21[local3] = this.anIntArray21[local3] + 7 >> 4;
			this.anIntArray20[local3] = this.anIntArray20[local3] + 7 >> 4;
			this.anIntArray24[local3] = this.anIntArray24[local3] + 7 >> 4;
		}
		this.aBoolean14 = false;
		if (this.aClass124_2 != null) {
			this.aClass124_2.anInterface6_4 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!ia;Z)Z")
	@Override
	public boolean method4082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class116_Sub2 local8 = (Class116_Sub2) arg2;
		@Pc(12) Class116_Sub2 local12 = this.aClass30_Sub1_4.aClass116_Sub2_4;
		@Pc(33) float local33 = local12.aFloat176 + local12.aFloat171 * local8.aFloat168 + local8.aFloat176 * local12.aFloat169 + local12.aFloat165 * local8.aFloat175;
		@Pc(54) float local54 = local12.aFloat168 + local12.aFloat167 * local8.aFloat176 + local12.aFloat166 * local8.aFloat168 + local12.aFloat173 * local8.aFloat175;
		Static319.aFloat159 = local8.aFloat173 * local12.aFloat166 + local8.aFloat165 * local12.aFloat167 + local12.aFloat173 * local8.aFloat170;
		Static309.aFloat152 = local8.aFloat172 * local12.aFloat173 + local8.aFloat167 * local12.aFloat166 + local12.aFloat167 * local8.aFloat169;
		Static291.aFloat147 = local12.aFloat171 * local8.aFloat167 + local12.aFloat169 * local8.aFloat169 + local8.aFloat172 * local12.aFloat165;
		Static316.aFloat179 = local8.aFloat174 * local12.aFloat170 + local12.aFloat172 * local8.aFloat171 + local8.aFloat166 * local12.aFloat174;
		@Pc(147) float local147 = local8.aFloat175 * local12.aFloat170 + local12.aFloat172 * local8.aFloat176 + local12.aFloat174 * local8.aFloat168 + local12.aFloat175;
		Static420.aFloat222 = local8.aFloat167 * local12.aFloat174 + local8.aFloat169 * local12.aFloat172 + local12.aFloat170 * local8.aFloat172;
		Static264.aFloat133 = local12.aFloat170 * local8.aFloat170 + local12.aFloat172 * local8.aFloat165 + local12.aFloat174 * local8.aFloat173;
		Static52.aFloat53 = local12.aFloat165 * local8.aFloat174 + local12.aFloat169 * local8.aFloat171 + local8.aFloat166 * local12.aFloat171;
		Static10.aFloat9 = local12.aFloat167 * local8.aFloat171 + local12.aFloat166 * local8.aFloat166 + local8.aFloat174 * local12.aFloat173;
		Static354.aFloat185 = local12.aFloat169 * local8.aFloat165 + local12.aFloat171 * local8.aFloat173 + local8.aFloat170 * local12.aFloat165;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass30_Sub1_4.anInt1285;
		@Pc(255) int local255 = this.aClass30_Sub1_4.anInt1281;
		if (!this.aBoolean14) {
			this.method251();
		}
		Static392.anIntArray372[0] = this.aShort2;
		Static47.anIntArray82[0] = this.aShort7;
		Static392.anIntArray372[1] = this.aShort8;
		Static385.anIntArray501[0] = this.aShort1;
		Static47.anIntArray82[1] = this.aShort7;
		Static385.anIntArray501[1] = this.aShort1;
		Static392.anIntArray372[2] = this.aShort2;
		Static47.anIntArray82[2] = this.aShort6;
		Static392.anIntArray372[3] = this.aShort8;
		Static385.anIntArray501[2] = this.aShort1;
		Static47.anIntArray82[3] = this.aShort6;
		Static392.anIntArray372[4] = this.aShort2;
		Static385.anIntArray501[3] = this.aShort1;
		Static47.anIntArray82[4] = this.aShort7;
		Static385.anIntArray501[4] = this.aShort3;
		Static392.anIntArray372[5] = this.aShort8;
		Static47.anIntArray82[5] = this.aShort7;
		Static385.anIntArray501[5] = this.aShort3;
		Static392.anIntArray372[6] = this.aShort2;
		Static47.anIntArray82[6] = this.aShort6;
		Static392.anIntArray372[7] = this.aShort8;
		Static385.anIntArray501[6] = this.aShort3;
		Static47.anIntArray82[7] = this.aShort6;
		Static385.anIntArray501[7] = this.aShort3;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(395) float local395;
		@Pc(390) float local390;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static47.anIntArray82[local383];
			local395 = Static392.anIntArray372[local383];
			local400 = Static385.anIntArray501[local383];
			local414 = local400 * Static264.aFloat133 + Static420.aFloat222 * local395 + Static316.aFloat179 * local390 + local147;
			local428 = local54 + local400 * Static319.aFloat159 + Static309.aFloat152 * local395 + local390 * Static10.aFloat9;
			local442 = local33 + Static291.aFloat147 * local395 + local390 * Static52.aFloat53 + Static354.aFloat185 * local400;
			if (local414 >= (float) this.aClass30_Sub1_4.anInt1252) {
				@Pc(461) float local461 = local442 * (float) local251 / local414 + (float) this.aClass30_Sub1_4.anInt1288;
				@Pc(473) float local473 = local428 * (float) local255 / local414 + (float) this.aClass30_Sub1_4.anInt1259;
				if (local241 > local461) {
					local241 = local461;
				}
				if (local461 > local243) {
					local243 = local461;
				}
				if (local247 < local473) {
					local247 = local473;
				}
				if (local473 < local245) {
					local245 = local473;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg0 && local243 > (float) arg0 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt276 > Static119.anIntArray164.length) {
				Static455.anIntArray674 = new int[this.anInt276];
				Static119.anIntArray164 = new int[this.anInt276];
			}
			@Pc(630) int local630;
			for (@Pc(548) int local548 = 0; local548 < this.anInt296; local548++) {
				local395 = this.anIntArray21[local548];
				local390 = this.anIntArray20[local548];
				local400 = this.anIntArray24[local548];
				local414 = local147 + local400 * Static264.aFloat133 + Static420.aFloat222 * local395 + Static316.aFloat179 * local390;
				local428 = local54 + local400 * Static319.aFloat159 + Static309.aFloat152 * local395 + local390 * Static10.aFloat9;
				local442 = Static291.aFloat147 * local395 + Static52.aFloat53 * local390 + local400 * Static354.aFloat185 + local33;
				@Pc(643) int local643;
				@Pc(648) int local648;
				@Pc(655) int local655;
				if ((float) this.aClass30_Sub1_4.anInt1252 <= local414) {
					local630 = (int) ((float) this.aClass30_Sub1_4.anInt1288 + local442 * (float) local251 / local414);
					local643 = (int) (local428 * (float) local255 / local414 + (float) this.aClass30_Sub1_4.anInt1259);
					local648 = this.anIntArray22[local548];
					local655 = this.anIntArray22[local548 + 1];
					for (@Pc(657) int local657 = local648; local657 < local655; local657++) {
						@Pc(666) int local666 = this.aShortArray9[local657] - 1;
						if (local666 == -1) {
							break;
						}
						Static119.anIntArray164[local666] = local630;
						Static455.anIntArray674[local666] = local643;
					}
				} else {
					local630 = this.anIntArray22[local548];
					local643 = this.anIntArray22[local548 + 1];
					for (local648 = local630; local648 < local643; local648++) {
						local655 = this.aShortArray9[local648] - 1;
						if (local655 == -1) {
							break;
						}
						Static119.anIntArray164[this.aShortArray9[local648] - 1] = -999999;
					}
				}
			}
			for (local630 = 0; local630 < this.anInt303; local630++) {
				if (Static119.anIntArray164[this.aShortArray8[local630]] != -999999 && Static119.anIntArray164[this.aShortArray5[local630]] != -999999 && Static119.anIntArray164[this.aShortArray10[local630]] != -999999 && this.method253(Static455.anIntArray674[this.aShortArray10[local630]], Static119.anIntArray164[this.aShortArray10[local630]], arg0, Static119.anIntArray164[this.aShortArray5[local630]], Static455.anIntArray674[this.aShortArray8[local630]], Static455.anIntArray674[this.aShortArray5[local630]], arg1, Static119.anIntArray164[this.aShortArray8[local630]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "FA", descriptor = "()Z")
	@Override
	protected boolean FA() {
		if (this.anIntArrayArray1 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt301; local12++) {
			this.anIntArray21[local12] <<= 0x4;
			this.anIntArray20[local12] <<= 0x4;
			this.anIntArray24[local12] <<= 0x4;
		}
		Static154.anInt2945 = 0;
		Static287.anInt5209 = 0;
		Static122.anInt2516 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IFIILclient!ro;IJIFI)S")
	private short method264(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class208 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray22[arg2];
		@Pc(17) int local17 = this.anIntArray22[arg2 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray9[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg5 == Static403.aLongArray8[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray9[local19] = (short) (this.anInt276 + 1);
		Static403.aLongArray8[local19] = arg5;
		this.aShortArray7[this.anInt276] = (short) arg8;
		this.aShortArray3[this.anInt276] = (short) arg4;
		this.aShortArray11[this.anInt276] = (short) arg0;
		this.aByteArray5[this.anInt276] = (byte) arg6;
		this.aFloatArray1[this.anInt276] = arg1;
		this.aFloatArray2[this.anInt276] = arg7;
		return (short) this.anInt276++;
	}

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class56.anIntArray119[arg0];
		@Pc(13) int local13 = Class56.anIntArray120[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt296; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray21[local15] + this.anIntArray20[local15] * local9 >> 15;
			this.anIntArray20[local15] = local13 * this.anIntArray20[local15] - this.anIntArray21[local15] * local9 >> 15;
			this.anIntArray21[local15] = local33;
		}
		if (this.aClass124_2 != null) {
			this.aClass124_2.anInterface6_4 = null;
		}
		this.aBoolean14 = false;
	}

	@OriginalMember(owner = "client!ag", name = "sa", descriptor = "()V")
	@Override
	public void sa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt296; local3++) {
			this.anIntArray24[local3] = -this.anIntArray24[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt276; local25++) {
			this.aShortArray11[local25] = (short) -this.aShortArray11[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt303; local48++) {
			@Pc(55) short local55 = this.aShortArray8[local48];
			this.aShortArray8[local48] = this.aShortArray10[local48];
			this.aShortArray10[local48] = local55;
		}
		if (this.aClass124_1 == null && this.aClass124_4 != null) {
			this.aClass124_4.anInterface6_4 = null;
		}
		if (this.aClass124_1 != null) {
			this.aClass124_1.anInterface6_4 = null;
		}
		if (this.aClass124_2 != null) {
			this.aClass124_2.anInterface6_4 = null;
		}
		this.aBoolean14 = false;
		if (this.aClass60_1 != null) {
			this.aClass60_1.anInterface12_3 = null;
		}
	}
}
