import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "S")
	private short aShort50;

	@OriginalMember(owner = "client!gca", name = "y", descriptor = "[I")
	private int[] anIntArray353;

	@OriginalMember(owner = "client!gca", name = "A", descriptor = "[Lclient!br;")
	private Class36[] aClass36Array1;

	@OriginalMember(owner = "client!gca", name = "G", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!gca", name = "M", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!gca", name = "N", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!gca", name = "O", descriptor = "[I")
	private int[] anIntArray354;

	@OriginalMember(owner = "client!gca", name = "P", descriptor = "[I")
	private int[] anIntArray355;

	@OriginalMember(owner = "client!gca", name = "R", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!gca", name = "T", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!gca", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!gca", name = "V", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!gca", name = "W", descriptor = "S")
	private short aShort51;

	@OriginalMember(owner = "client!gca", name = "X", descriptor = "Lclient!nca;")
	private Class200 aClass200_1;

	@OriginalMember(owner = "client!gca", name = "Y", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!gca", name = "jb", descriptor = "[F")
	private float[] aFloatArray12;

	@OriginalMember(owner = "client!gca", name = "mb", descriptor = "S")
	private short aShort52;

	@OriginalMember(owner = "client!gca", name = "nb", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!gca", name = "pb", descriptor = "[Lclient!fca;")
	private Class83[] aClass83Array3;

	@OriginalMember(owner = "client!gca", name = "rb", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!gca", name = "ub", descriptor = "[F")
	private float[] aFloatArray13;

	@OriginalMember(owner = "client!gca", name = "vb", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!gca", name = "yb", descriptor = "S")
	private short aShort53;

	@OriginalMember(owner = "client!gca", name = "zb", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!gca", name = "Bb", descriptor = "[Lclient!di;")
	private Class61[] aClass61Array1;

	@OriginalMember(owner = "client!gca", name = "Eb", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!gca", name = "Hb", descriptor = "S")
	private short aShort54;

	@OriginalMember(owner = "client!gca", name = "Jb", descriptor = "[Lclient!gl;")
	private Class109[] aClass109Array3;

	@OriginalMember(owner = "client!gca", name = "Nb", descriptor = "I")
	private int anInt3111;

	@OriginalMember(owner = "client!gca", name = "Pb", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!gca", name = "Qb", descriptor = "B")
	private byte aByte33;

	@OriginalMember(owner = "client!gca", name = "Sb", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!gca", name = "Wb", descriptor = "I")
	private int anInt3116;

	@OriginalMember(owner = "client!gca", name = "Yb", descriptor = "I")
	private int anInt3118;

	@OriginalMember(owner = "client!gca", name = "bc", descriptor = "S")
	private short aShort55;

	@OriginalMember(owner = "client!gca", name = "cc", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!gca", name = "dc", descriptor = "S")
	private short aShort56;

	@OriginalMember(owner = "client!gca", name = "jc", descriptor = "Lclient!bo;")
	private Interface1 anInterface1_3;

	@OriginalMember(owner = "client!gca", name = "kc", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!gca", name = "nc", descriptor = "Lclient!il;")
	private Interface10 anInterface10_3;

	@OriginalMember(owner = "client!gca", name = "pc", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!gca", name = "rc", descriptor = "[I")
	private int[] anIntArray357;

	@OriginalMember(owner = "client!gca", name = "Ac", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!gca", name = "E", descriptor = "I")
	private int anInt3079 = 0;

	@OriginalMember(owner = "client!gca", name = "gb", descriptor = "I")
	private int anInt3094 = 0;

	@OriginalMember(owner = "client!gca", name = "J", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!gca", name = "Db", descriptor = "I")
	private int anInt3105 = 0;

	@OriginalMember(owner = "client!gca", name = "Ob", descriptor = "I")
	private int anInt3112 = 0;

	@OriginalMember(owner = "client!gca", name = "ib", descriptor = "I")
	private int anInt3096 = 0;

	@OriginalMember(owner = "client!gca", name = "Ub", descriptor = "Z")
	private boolean aBoolean223 = true;

	@OriginalMember(owner = "client!gca", name = "uc", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_12;

	@OriginalMember(owner = "client!gca", name = "qb", descriptor = "Lclient!gr;")
	private Class112 aClass112_5;

	@OriginalMember(owner = "client!gca", name = "Fb", descriptor = "Lclient!gr;")
	private Class112 aClass112_6;

	@OriginalMember(owner = "client!gca", name = "D", descriptor = "Lclient!gr;")
	private Class112 aClass112_4;

	@OriginalMember(owner = "client!gca", name = "z", descriptor = "Lclient!gr;")
	private Class112 aClass112_3;

	@OriginalMember(owner = "client!gca", name = "ac", descriptor = "Lclient!bp;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class2_Sub2(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_12 = arg0;
		this.aClass112_5 = new Class112(null, 5126, 3, 0);
		this.aClass112_6 = new Class112(null, 5126, 2, 0);
		this.aClass112_4 = new Class112(null, 5126, 3, 0);
		this.aClass112_3 = new Class112(null, 5121, 4, 0);
		this.aClass34_1 = new Class34();
	}

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!ad;Lclient!or;IIII)V")
	public Class2_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3116 = arg2;
		this.aClass5_Sub1_12 = arg0;
		this.anInt3118 = arg5;
		if (Static438.method6624(arg5, arg2)) {
			this.aClass112_5 = new Class112(null, 5126, 3, 0);
		}
		if (Static310.method5038(arg5, arg2)) {
			this.aClass112_6 = new Class112(null, 5126, 2, 0);
		}
		if (Static190.method3577(arg2, arg5)) {
			this.aClass112_4 = new Class112(null, 5126, 3, 0);
		}
		if (Static504.method7750(arg2, arg5)) {
			this.aClass112_3 = new Class112(null, 5121, 4, 0);
		}
		if (Static465.method6933(arg5, arg2)) {
			this.aClass34_1 = new Class34();
		}
		@Pc(102) Interface4 local102 = arg0.anInterface4_14;
		@Pc(106) int[] local106 = new int[arg1.anInt6712];
		this.anIntArray353 = new int[arg1.anInt6708 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt6712; local115++) {
			if ((arg1.aByteArray69 == null || arg1.aByteArray69[local115] != 2) && (arg1.aShortArray159 == null || arg1.aShortArray159[local115] == -1 || !local102.method6712(arg1.aShortArray159[local115] & 0xFFFF).aBoolean470)) {
				local106[this.anInt3079++] = local115;
				this.anIntArray353[arg1.aShortArray150[local115]]++;
				this.anIntArray353[arg1.aShortArray155[local115]]++;
				this.anIntArray353[arg1.aShortArray153[local115]]++;
			}
		}
		this.anInt3112 = this.anInt3079;
		@Pc(206) long[] local206 = new long[this.anInt3079];
		@Pc(215) boolean local215 = (this.anInt3116 & 0x100) != 0;
		@Pc(227) int local227;
		@Pc(238) int local238;
		@Pc(372) int local372;
		label497: for (@Pc(217) int local217 = 0; local217 < this.anInt3079; local217++) {
			@Pc(223) int local223 = local106[local217];
			@Pc(225) Class238 local225 = null;
			local227 = 0;
			@Pc(229) byte local229 = 0;
			@Pc(231) byte local231 = 0;
			@Pc(233) byte local233 = 0;
			if (arg1.aClass114Array1 != null) {
				for (local238 = 0; local238 < arg1.aClass114Array1.length; local238++) {
					@Pc(245) Class114 local245 = arg1.aClass114Array1[local238];
					if (local245.anInt3857 == local223) {
						@Pc(254) Class294 local254 = Static152.method2629(local245.anInt3854);
						if (local254.aBoolean646) {
							local206[local217] = Long.MAX_VALUE;
							this.anInt3112--;
							continue label497;
						}
					}
				}
			}
			@Pc(277) short local277 = -1;
			if (arg1.aShortArray159 != null) {
				local277 = arg1.aShortArray159[local223];
				if (local277 != -1) {
					local225 = local102.method6712(local277 & 0xFFFF);
					local231 = local225.aByte70;
					local233 = local225.aByte66;
				}
			}
			@Pc(328) boolean local328 = arg1.aByteArray67 != null && arg1.aByteArray67[local223] != 0 || local225 != null && !local225.aBoolean464 | local225.aBoolean465;
			if ((local215 || local328) && arg1.aByteArray70 != null) {
				local227 += arg1.aByteArray70[local223] << 17;
			}
			if (local328) {
				local227 += 65536;
			}
			local227 += (local231 & 0xFF) << 8;
			local227 += local233 & 0xFF;
			local372 = local229 + ((local277 & 0xFFFF) << 16);
			@Pc(378) int local378 = local372 + (local217 & 0xFFFF);
			local206[local217] = (long) local378 + ((long) local227 << 32);
		}
		Static229.method4101(local206, local106);
		this.anIntArray355 = arg1.anIntArray570;
		this.anInt3096 = arg1.anInt6692;
		this.anIntArray357 = arg1.anIntArray574;
		this.aShortArray70 = arg1.aShortArray152;
		this.anIntArray356 = arg1.anIntArray578;
		this.anInt3105 = arg1.anInt6708;
		this.aClass109Array3 = arg1.aClass109Array6;
		@Pc(429) Class262[] local429 = new Class262[this.anInt3105];
		this.aClass83Array3 = arg1.aClass83Array6;
		@Pc(453) int local453;
		@Pc(467) int local467;
		if (arg1.aClass114Array1 != null) {
			this.anInt3111 = arg1.aClass114Array1.length;
			this.aClass61Array1 = new Class61[this.anInt3111];
			this.aClass36Array1 = new Class36[this.anInt3111];
			for (local453 = 0; local453 < this.anInt3111; local453++) {
				@Pc(460) Class114 local460 = arg1.aClass114Array1[local453];
				@Pc(465) Class294 local465 = Static152.method2629(local460.anInt3854);
				local467 = -1;
				for (@Pc(469) int local469 = 0; local469 < this.anInt3079; local469++) {
					if (local460.anInt3857 == local106[local469]) {
						local467 = local469;
						break;
					}
				}
				if (local467 == -1) {
					throw new RuntimeException();
				}
				local238 = Static393.anIntArray638[arg1.aShortArray154[local460.anInt3857] & 0xFFFF] & 0xFFFFFF;
				local238 |= 255 - (arg1.aByteArray67 == null ? 0 : arg1.aByteArray67[local460.anInt3857]) << 24;
				this.aClass61Array1[local453] = new Class61(local467, arg1.aShortArray150[local460.anInt3857], arg1.aShortArray155[local460.anInt3857], arg1.aShortArray153[local460.anInt3857], local465.anInt8731, local465.anInt8725, local465.anInt8723, local465.anInt8726, local465.anInt8732, local465.aBoolean646, local465.aBoolean647, local460.anInt3858);
				this.aClass36Array1[local453] = new Class36(local238);
			}
		}
		local453 = this.anInt3079 * 3;
		this.aByteArray41 = new byte[local453];
		this.aShortArray73 = new short[local453];
		if (arg1.aShortArray158 != null) {
			this.aShortArray77 = new short[this.anInt3079];
		}
		this.aFloatArray12 = new float[local453];
		this.aShortArray72 = new short[local453];
		this.aShortArray71 = new short[this.anInt3079];
		this.aShortArray75 = new short[this.anInt3079];
		this.aShortArray69 = new short[this.anInt3079];
		this.aFloatArray13 = new float[local453];
		this.aShort58 = (short) arg3;
		this.aShortArray68 = new short[this.anInt3079];
		this.aShortArray74 = new short[this.anInt3079];
		this.aShort51 = (short) arg4;
		this.aShortArray67 = new short[local453];
		Static90.aLongArray5 = new long[local453];
		this.aByteArray42 = new byte[this.anInt3079];
		this.aShortArray76 = new short[local453];
		local227 = 0;
		for (local372 = 0; local372 < arg1.anInt6708; local372++) {
			local467 = this.anIntArray353[local372];
			this.anIntArray353[local372] = local227;
			local227 += local467;
			local429[local372] = new Class262();
		}
		this.anIntArray353[arg1.anInt6708] = local227;
		@Pc(704) int[] local704 = null;
		@Pc(706) int[] local706 = null;
		@Pc(708) int[] local708 = null;
		@Pc(710) float[][] local710 = null;
		@Pc(736) int local736;
		@Pc(774) int local774;
		@Pc(780) int local780;
		@Pc(794) int local794;
		@Pc(796) int local796;
		@Pc(827) int local827;
		@Pc(832) int local832;
		@Pc(994) float local994;
		@Pc(992) float local992;
		@Pc(1023) float local1023;
		if (arg1.aByteArray66 != null) {
			@Pc(716) int local716 = arg1.anInt6691;
			@Pc(719) int[] local719 = new int[local716];
			@Pc(722) int[] local722 = new int[local716];
			@Pc(725) int[] local725 = new int[local716];
			@Pc(728) int[] local728 = new int[local716];
			@Pc(731) int[] local731 = new int[local716];
			@Pc(734) int[] local734 = new int[local716];
			for (local736 = 0; local736 < local716; local736++) {
				local719[local736] = Integer.MAX_VALUE;
				local722[local736] = -2147483647;
				local725[local736] = Integer.MAX_VALUE;
				local728[local736] = -2147483647;
				local731[local736] = Integer.MAX_VALUE;
				local734[local736] = -2147483647;
			}
			local710 = new float[local716][];
			local704 = new int[local716];
			for (local774 = 0; local774 < this.anInt3079; local774++) {
				local780 = local106[local774];
				if (arg1.aByteArray66[local780] != -1) {
					local794 = arg1.aByteArray66[local780] & 0xFF;
					for (local796 = 0; local796 < 3; local796++) {
						@Pc(808) short local808;
						if (local796 == 0) {
							local808 = arg1.aShortArray150[local780];
						} else if (local796 == 1) {
							local808 = arg1.aShortArray155[local780];
						} else {
							local808 = arg1.aShortArray153[local780];
						}
						local827 = arg1.anIntArray578[local808];
						local832 = arg1.anIntArray574[local808];
						@Pc(837) int local837 = arg1.anIntArray570[local808];
						if (local827 < local719[local794]) {
							local719[local794] = local827;
						}
						if (local827 > local722[local794]) {
							local722[local794] = local827;
						}
						if (local832 < local725[local794]) {
							local725[local794] = local832;
						}
						if (local728[local794] < local832) {
							local728[local794] = local832;
						}
						if (local731[local794] > local837) {
							local731[local794] = local837;
						}
						if (local734[local794] < local837) {
							local734[local794] = local837;
						}
					}
				}
			}
			local706 = new int[local716];
			local708 = new int[local716];
			for (local780 = 0; local780 < local716; local780++) {
				@Pc(933) byte local933 = arg1.aByteArray71[local780];
				if (local933 > 0) {
					local704[local780] = (local722[local780] + local719[local780]) / 2;
					local706[local780] = (local728[local780] + local725[local780]) / 2;
					local708[local780] = (local731[local780] + local734[local780]) / 2;
					if (local933 == 1) {
						local832 = arg1.anIntArray568[local780];
						if (local832 == 0) {
							local992 = 1.0F;
							local994 = 1.0F;
						} else if (local832 > 0) {
							local994 = 1.0F;
							local992 = (float) local832 / 1024.0F;
						} else {
							local992 = 1.0F;
							local994 = (float) -local832 / 1024.0F;
						}
						local1023 = 64.0F / (float) arg1.anIntArray569[local780];
					} else if (local933 == 2) {
						local992 = 64.0F / (float) arg1.anIntArray573[local780];
						local994 = 64.0F / (float) arg1.anIntArray568[local780];
						local1023 = 64.0F / (float) arg1.anIntArray569[local780];
					} else {
						local994 = (float) arg1.anIntArray568[local780] / 1024.0F;
						local1023 = (float) arg1.anIntArray569[local780] / 1024.0F;
						local992 = (float) arg1.anIntArray573[local780] / 1024.0F;
					}
					local710[local780] = Static174.method3317(local1023, local992, local994, arg1.aShortArray157[local780], arg1.aShortArray151[local780], arg1.aShortArray156[local780], arg1.aByteArray68[local780] & 0xFF);
				}
			}
		}
		@Pc(1114) Class295[] local1114 = new Class295[arg1.anInt6712];
		@Pc(1133) short local1133;
		@Pc(1144) int local1144;
		@Pc(1155) int local1155;
		@Pc(1215) int local1215;
		for (@Pc(1116) int local1116 = 0; local1116 < arg1.anInt6712; local1116++) {
			@Pc(1123) short local1123 = arg1.aShortArray150[local1116];
			@Pc(1128) short local1128 = arg1.aShortArray155[local1116];
			local1133 = arg1.aShortArray153[local1116];
			local1144 = this.anIntArray356[local1128] - this.anIntArray356[local1123];
			local1155 = this.anIntArray357[local1128] - this.anIntArray357[local1123];
			local736 = this.anIntArray355[local1128] - this.anIntArray355[local1123];
			local774 = this.anIntArray356[local1133] - this.anIntArray356[local1123];
			local780 = this.anIntArray357[local1133] - this.anIntArray357[local1123];
			local794 = this.anIntArray355[local1133] - this.anIntArray355[local1123];
			local796 = local794 * local1155 - local736 * local780;
			local1215 = local736 * local774 - local794 * local1144;
			local827 = local1144 * local780 - local1155 * local774;
			while (local796 > 8192 || local1215 > 8192 || local827 > 8192 || local796 < -8192 || local1215 < -8192 || local827 < -8192) {
				local796 >>= 0x1;
				local827 >>= 0x1;
				local1215 >>= 0x1;
			}
			local832 = (int) Math.sqrt((double) (local796 * local796 + local1215 * local1215 + local827 * local827));
			if (local832 <= 0) {
				local832 = 1;
			}
			local796 = local796 * 256 / local832;
			local1215 = local1215 * 256 / local832;
			local827 = local827 * 256 / local832;
			@Pc(1316) byte local1316 = arg1.aByteArray69 == null ? 0 : arg1.aByteArray69[local1116];
			if (local1316 == 0) {
				@Pc(1344) Class262 local1344 = local429[local1123];
				local1344.anInt7894 += local827;
				local1344.anInt7895 += local1215;
				local1344.anInt7893 += local796;
				local1344.anInt7896++;
				@Pc(1372) Class262 local1372 = local429[local1128];
				local1372.anInt7894 += local827;
				local1372.anInt7893 += local796;
				local1372.anInt7895 += local1215;
				local1372.anInt7896++;
				@Pc(1400) Class262 local1400 = local429[local1133];
				local1400.anInt7893 += local796;
				local1400.anInt7894 += local827;
				local1400.anInt7896++;
				local1400.anInt7895 += local1215;
			} else if (local1316 == 1) {
				@Pc(1329) Class295 local1329 = local1114[local1116] = new Class295();
				local1329.anInt8733 = local827;
				local1329.anInt8736 = local796;
				local1329.anInt8735 = local1215;
			}
		}
		@Pc(1441) int local1441;
		for (@Pc(1435) int local1435 = 0; local1435 < this.anInt3079; local1435++) {
			local1441 = local106[local1435];
			@Pc(1448) int local1448 = arg1.aShortArray154[local1441] & 0xFFFF;
			@Pc(1453) short local1453;
			if (arg1.aShortArray159 == null) {
				local1453 = -1;
			} else {
				local1453 = arg1.aShortArray159[local1441];
			}
			if (arg1.aByteArray66 == null) {
				local1155 = -1;
			} else {
				local1155 = arg1.aByteArray66[local1441];
			}
			if (arg1.aByteArray67 == null) {
				local736 = 0;
			} else {
				local736 = arg1.aByteArray67[local1441] & 0xFF;
			}
			@Pc(1488) float local1488 = 0.0F;
			@Pc(1490) float local1490 = 0.0F;
			@Pc(1492) float local1492 = 0.0F;
			local994 = 0.0F;
			local1023 = 0.0F;
			local992 = 0.0F;
			@Pc(1500) byte local1500 = 0;
			@Pc(1502) byte local1502 = 0;
			@Pc(1504) int local1504 = 0;
			@Pc(1539) byte local1539;
			@Pc(1556) short local1556;
			@Pc(1561) short local1561;
			@Pc(1566) short local1566;
			if (local1453 != -1) {
				if (local1155 == -1) {
					local1488 = 0.0F;
					local1023 = 0.0F;
					local992 = 0.0F;
					local994 = 1.0F;
					local1490 = 1.0F;
					local1500 = 1;
					local1492 = 1.0F;
					local1502 = 2;
				} else {
					local1155 &= 0xFF;
					local1539 = arg1.aByteArray71[local1155];
					@Pc(1546) short local1546;
					@Pc(1551) short local1551;
					@Pc(1589) float local1589;
					@Pc(1598) float local1598;
					@Pc(1606) float local1606;
					@Pc(1692) float local1692;
					@Pc(1701) float local1701;
					@Pc(1709) float local1709;
					@Pc(1717) float local1717;
					@Pc(1726) float local1726;
					@Pc(1735) float local1735;
					if (local1539 == 0) {
						local1546 = arg1.aShortArray150[local1441];
						local1551 = arg1.aShortArray155[local1441];
						local1556 = arg1.aShortArray153[local1441];
						local1561 = arg1.aShortArray157[local1155];
						local1566 = arg1.aShortArray156[local1155];
						@Pc(1571) short local1571 = arg1.aShortArray151[local1155];
						@Pc(1577) float local1577 = (float) arg1.anIntArray578[local1561];
						@Pc(1583) float local1583 = (float) arg1.anIntArray574[local1561];
						local1589 = arg1.anIntArray570[local1561];
						local1598 = (float) arg1.anIntArray578[local1566] - local1577;
						local1606 = (float) arg1.anIntArray574[local1566] - local1583;
						@Pc(1615) float local1615 = (float) arg1.anIntArray570[local1566] - local1589;
						@Pc(1624) float local1624 = (float) arg1.anIntArray578[local1571] - local1577;
						@Pc(1632) float local1632 = (float) arg1.anIntArray574[local1571] - local1583;
						@Pc(1641) float local1641 = (float) arg1.anIntArray570[local1571] - local1589;
						@Pc(1649) float local1649 = (float) arg1.anIntArray578[local1546] - local1577;
						@Pc(1657) float local1657 = (float) arg1.anIntArray574[local1546] - local1583;
						@Pc(1666) float local1666 = (float) arg1.anIntArray570[local1546] - local1589;
						@Pc(1675) float local1675 = (float) arg1.anIntArray578[local1551] - local1577;
						@Pc(1684) float local1684 = (float) arg1.anIntArray574[local1551] - local1583;
						local1692 = (float) arg1.anIntArray570[local1551] - local1589;
						local1701 = (float) arg1.anIntArray578[local1556] - local1577;
						local1709 = (float) arg1.anIntArray574[local1556] - local1583;
						local1717 = (float) arg1.anIntArray570[local1556] - local1589;
						local1726 = local1641 * local1606 - local1615 * local1632;
						local1735 = local1624 * local1615 - local1598 * local1641;
						@Pc(1743) float local1743 = local1632 * local1598 - local1606 * local1624;
						@Pc(1751) float local1751 = local1632 * local1743 - local1641 * local1735;
						@Pc(1760) float local1760 = local1726 * local1641 - local1624 * local1743;
						@Pc(1768) float local1768 = local1624 * local1735 - local1632 * local1726;
						@Pc(1782) float local1782 = 1.0F / (local1768 * local1615 + local1606 * local1760 + local1751 * local1598);
						local1488 = (local1768 * local1666 + local1751 * local1649 + local1657 * local1760) * local1782;
						local1492 = (local1675 * local1751 + local1760 * local1684 + local1768 * local1692) * local1782;
						local1023 = local1782 * (local1768 * local1717 + local1709 * local1760 + local1751 * local1701);
						@Pc(1833) float local1833 = local1726 * local1615 - local1743 * local1598;
						@Pc(1841) float local1841 = local1735 * local1598 - local1606 * local1726;
						@Pc(1849) float local1849 = local1743 * local1606 - local1615 * local1735;
						@Pc(1863) float local1863 = 1.0F / (local1841 * local1641 + local1632 * local1833 + local1624 * local1849);
						local992 = local1863 * (local1849 * local1701 + local1833 * local1709 + local1717 * local1841);
						local994 = (local1841 * local1692 + local1833 * local1684 + local1849 * local1675) * local1863;
						local1490 = local1863 * (local1649 * local1849 + local1833 * local1657 + local1666 * local1841);
					} else {
						local1546 = arg1.aShortArray150[local1441];
						local1551 = arg1.aShortArray155[local1441];
						local1556 = arg1.aShortArray153[local1441];
						@Pc(1926) int local1926 = local704[local1155];
						@Pc(1930) int local1930 = local706[local1155];
						@Pc(1934) int local1934 = local708[local1155];
						@Pc(1938) float[] local1938 = local710[local1155];
						@Pc(1943) byte local1943 = arg1.aByteArray72[local1155];
						local1589 = (float) arg1.anIntArray571[local1155] / 256.0F;
						if (local1539 == 1) {
							local1598 = (float) arg1.anIntArray573[local1155] / 1024.0F;
							Static66.method1336(local1598, arg1.anIntArray574[local1546], local1930, local1934, arg1.anIntArray578[local1546], local1589, local1938, arg1.anIntArray570[local1546], local1943, local1926);
							local1490 = Static491.aFloat269;
							local1488 = Static75.aFloat257;
							Static66.method1336(local1598, arg1.anIntArray574[local1551], local1930, local1934, arg1.anIntArray578[local1551], local1589, local1938, arg1.anIntArray570[local1551], local1943, local1926);
							local994 = Static491.aFloat269;
							local1492 = Static75.aFloat257;
							Static66.method1336(local1598, arg1.anIntArray574[local1556], local1930, local1934, arg1.anIntArray578[local1556], local1589, local1938, arg1.anIntArray570[local1556], local1943, local1926);
							local1023 = Static75.aFloat257;
							local992 = Static491.aFloat269;
							local1606 = local1598 / 2.0F;
							if ((local1943 & 0x1) == 0) {
								if (local1606 < local1023 - local1488) {
									local1502 = 1;
									local1023 -= local1598;
								} else if (local1606 < local1488 - local1023) {
									local1023 += local1598;
									local1502 = 2;
								}
								if (local1492 - local1488 > local1606) {
									local1492 -= local1598;
									local1500 = 1;
								} else if (local1606 < local1488 - local1492) {
									local1492 += local1598;
									local1500 = 2;
								}
							} else {
								if (local994 - local1490 > local1606) {
									local994 -= local1598;
									local1500 = 1;
								} else if (local1490 - local994 > local1606) {
									local1500 = 2;
									local994 += local1598;
								}
								if (local1606 < local992 - local1490) {
									local992 -= local1598;
									local1502 = 1;
								} else if (local1606 < local1490 - local992) {
									local1502 = 2;
									local992 += local1598;
								}
							}
						} else if (local1539 == 2) {
							local1598 = (float) arg1.anIntArray576[local1155] / 256.0F;
							local1606 = (float) arg1.anIntArray572[local1155] / 256.0F;
							@Pc(1988) int local1988 = arg1.anIntArray578[local1551] - arg1.anIntArray578[local1546];
							@Pc(1999) int local1999 = arg1.anIntArray574[local1551] - arg1.anIntArray574[local1546];
							@Pc(2010) int local2010 = arg1.anIntArray570[local1551] - arg1.anIntArray570[local1546];
							@Pc(2020) int local2020 = arg1.anIntArray578[local1556] - arg1.anIntArray578[local1546];
							@Pc(2031) int local2031 = arg1.anIntArray574[local1556] - arg1.anIntArray574[local1546];
							@Pc(2042) int local2042 = arg1.anIntArray570[local1556] - arg1.anIntArray570[local1546];
							@Pc(2051) int local2051 = local2042 * local1999 - local2010 * local2031;
							@Pc(2060) int local2060 = local2010 * local2020 - local1988 * local2042;
							@Pc(2068) int local2068 = local1988 * local2031 - local2020 * local1999;
							local1692 = 64.0F / (float) arg1.anIntArray568[local1155];
							local1701 = 64.0F / (float) arg1.anIntArray569[local1155];
							local1709 = 64.0F / (float) arg1.anIntArray573[local1155];
							local1717 = (local1938[2] * (float) local2068 + (float) local2051 * local1938[0] + local1938[1] * (float) local2060) / local1692;
							local1726 = ((float) local2068 * local1938[5] + (float) local2051 * local1938[3] + (float) local2060 * local1938[4]) / local1701;
							local1735 = (local1938[8] * (float) local2068 + local1938[6] * (float) local2051 + local1938[7] * (float) local2060) / local1709;
							local1504 = Static349.method5543(local1717, local1726, local1735);
							Static88.method1791(local1504, local1938, local1943, local1934, arg1.anIntArray578[local1546], local1606, local1930, arg1.anIntArray574[local1546], local1926, local1598, local1589, arg1.anIntArray570[local1546]);
							local1490 = Static22.aFloat240;
							local1488 = Static75.aFloat256;
							Static88.method1791(local1504, local1938, local1943, local1934, arg1.anIntArray578[local1551], local1606, local1930, arg1.anIntArray574[local1551], local1926, local1598, local1589, arg1.anIntArray570[local1551]);
							local994 = Static22.aFloat240;
							local1492 = Static75.aFloat256;
							Static88.method1791(local1504, local1938, local1943, local1934, arg1.anIntArray578[local1556], local1606, local1930, arg1.anIntArray574[local1556], local1926, local1598, local1589, arg1.anIntArray570[local1556]);
							local1023 = Static75.aFloat256;
							local992 = Static22.aFloat240;
						} else if (local1539 == 3) {
							Static174.method3318(local1934, local1930, local1589, arg1.anIntArray574[local1546], local1943, local1938, arg1.anIntArray570[local1546], local1926, arg1.anIntArray578[local1546]);
							local1488 = Static518.aFloat63;
							local1490 = Static51.aFloat44;
							Static174.method3318(local1934, local1930, local1589, arg1.anIntArray574[local1551], local1943, local1938, arg1.anIntArray570[local1551], local1926, arg1.anIntArray578[local1551]);
							local994 = Static51.aFloat44;
							local1492 = Static518.aFloat63;
							Static174.method3318(local1934, local1930, local1589, arg1.anIntArray574[local1556], local1943, local1938, arg1.anIntArray570[local1556], local1926, arg1.anIntArray578[local1556]);
							local1023 = Static518.aFloat63;
							local992 = Static51.aFloat44;
							if ((local1943 & 0x1) == 0) {
								if (local1492 - local1488 > 0.5F) {
									local1492--;
									local1500 = 1;
								} else if (local1488 - local1492 > 0.5F) {
									local1492++;
									local1500 = 2;
								}
								if (local1023 - local1488 > 0.5F) {
									local1023--;
									local1502 = 1;
								} else if (local1488 - local1023 > 0.5F) {
									local1023++;
									local1502 = 2;
								}
							} else {
								if (local992 - local1490 > 0.5F) {
									local1502 = 1;
									local992--;
								} else if (local1490 - local992 > 0.5F) {
									local1502 = 2;
									local992++;
								}
								if (local994 - local1490 > 0.5F) {
									local1500 = 1;
									local994--;
								} else if (local1490 - local994 > 0.5F) {
									local994++;
									local1500 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray69 == null) {
				local1539 = 0;
			} else {
				local1539 = arg1.aByteArray69[local1441];
			}
			if (local1539 == 0) {
				@Pc(2807) long local2807 = (long) (local1155 << 2) + ((long) (local1448 << 8) + (long) (local1504 << 24) + (long) local736 << 32);
				local1556 = arg1.aShortArray150[local1441];
				local1561 = arg1.aShortArray155[local1441];
				local1566 = arg1.aShortArray153[local1441];
				@Pc(2826) Class262 local2826 = local429[local1556];
				this.aShortArray74[local1435] = this.method2635(local2826.anInt7893, local2807, local2826.anInt7895, local1488, local2826.anInt7896, arg1, local1490, local2826.anInt7894, local1556);
				@Pc(2850) Class262 local2850 = local429[local1561];
				this.aShortArray75[local1435] = this.method2635(local2850.anInt7893, (long) local1500 + local2807, local2850.anInt7895, local1492, local2850.anInt7896, arg1, local994, local2850.anInt7894, local1561);
				@Pc(2877) Class262 local2877 = local429[local1566];
				this.aShortArray69[local1435] = this.method2635(local2877.anInt7893, (long) local1502 + local2807, local2877.anInt7895, local1023, local2877.anInt7896, arg1, local992, local2877.anInt7894, local1566);
			} else if (local1539 == 1) {
				@Pc(2668) Class295 local2668 = local1114[local1441];
				@Pc(2713) long local2713 = ((long) local736 + (long) (local1504 << 24) + (long) (local1448 << 8) << 32) + (long) ((local2668.anInt8733 + 256 << 22) + (local2668.anInt8735 + 256 << 12) + (local1155 << 2) + (local2668.anInt8736 > 0 ? 1024 : 2048));
				this.aShortArray74[local1435] = this.method2635(local2668.anInt8736, local2713, local2668.anInt8735, local1488, 0, arg1, local1490, local2668.anInt8733, arg1.aShortArray150[local1441]);
				this.aShortArray75[local1435] = this.method2635(local2668.anInt8736, (long) local1500 + local2713, local2668.anInt8735, local1492, 0, arg1, local994, local2668.anInt8733, arg1.aShortArray155[local1441]);
				this.aShortArray69[local1435] = this.method2635(local2668.anInt8736, (long) local1502 + local2713, local2668.anInt8735, local1023, 0, arg1, local992, local2668.anInt8733, arg1.aShortArray153[local1441]);
			}
			if (arg1.aShortArray159 == null) {
				this.aShortArray71[local1435] = -1;
			} else {
				this.aShortArray71[local1435] = arg1.aShortArray159[local1441];
			}
			if (arg1.aByteArray67 != null) {
				this.aByteArray42[local1435] = arg1.aByteArray67[local1441];
			}
			if (arg1.aShortArray158 != null) {
				this.aShortArray77[local1435] = arg1.aShortArray158[local1441];
			}
			this.aShortArray68[local1435] = arg1.aShortArray154[local1441];
		}
		local1441 = 0;
		local1133 = -10000;
		for (local1144 = 0; local1144 < this.anInt3112; local1144++) {
			@Pc(2966) short local2966 = this.aShortArray71[local1144];
			if (local2966 != local1133) {
				local1133 = local2966;
				local1441++;
			}
		}
		this.anIntArray354 = new int[local1441 + 1];
		local1133 = -10000;
		local1441 = 0;
		for (local1155 = 0; local1155 < this.anInt3112; local1155++) {
			@Pc(3004) short local3004 = this.aShortArray71[local1155];
			if (local3004 != local1133) {
				local1133 = local3004;
				this.anIntArray354[local1441++] = local1155;
			}
		}
		this.anIntArray354[local1441] = this.anInt3112;
		Static90.aLongArray5 = null;
		this.aShortArray67 = Static392.method5991(this.aShortArray67, this.anInt3094);
		this.aShortArray76 = Static392.method5991(this.aShortArray76, this.anInt3094);
		this.aShortArray72 = Static392.method5991(this.aShortArray72, this.anInt3094);
		this.aByteArray41 = Static8.method615(this.aByteArray41, this.anInt3094);
		this.aFloatArray13 = Static443.method6716(this.aFloatArray13, this.anInt3094);
		this.aFloatArray12 = Static443.method6716(this.aFloatArray12, this.anInt3094);
		if (arg1.anIntArray575 != null && Static322.method5161(this.anInt3118, arg2)) {
			this.anIntArrayArray39 = arg1.method5607(false);
		}
		if (arg1.aClass114Array1 != null && Static286.method4859(arg2, this.anInt3118)) {
			this.anIntArrayArray37 = arg1.method5598();
		}
		if (arg1.anIntArray577 != null && Static245.method4224(arg2, this.anInt3118)) {
			local736 = 0;
			@Pc(3119) int[] local3119 = new int[256];
			for (local780 = 0; local780 < this.anInt3079; local780++) {
				local794 = arg1.anIntArray577[local106[local780]];
				if (local794 >= 0) {
					if (local736 < local794) {
						local736 = local794;
					}
					@Pc(3145) int local3145 = local3119[local794]++;
				}
			}
			this.anIntArrayArray38 = new int[local736 + 1][];
			for (local794 = 0; local794 <= local736; local794++) {
				this.anIntArrayArray38[local794] = new int[local3119[local794]];
				local3119[local794] = 0;
			}
			for (local796 = 0; local796 < this.anInt3079; local796++) {
				local1215 = arg1.anIntArray577[local106[local796]];
				if (local1215 >= 0) {
					this.anIntArrayArray38[local1215][local3119[local1215]++] = local796;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "()[Lclient!gl;")
	@Override
	public Class109[] method5789() {
		return this.aClass109Array3;
	}

	@OriginalMember(owner = "client!gca", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean222) {
			this.method2626();
		}
		return this.aShort53;
	}

	@OriginalMember(owner = "client!gca", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg2 << 4;
			local22 = arg3 << 4;
			local24 = 0;
			Static66.anInt1451 = 0;
			Static106.anInt2362 = 0;
			Static244.anInt5027 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray39.length > local38) {
					local48 = this.anIntArrayArray39[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static244.anInt5027 += this.anIntArray356[local56];
						Static66.anInt1451 += this.anIntArray357[local56];
						local24++;
						Static106.anInt2362 += this.anIntArray355[local56];
					}
				}
			}
			if (local24 > 0) {
				Static244.anInt5027 = local18 + Static244.anInt5027 / local24;
				Static106.anInt2362 = local14 + Static106.anInt2362 / local24;
				Static66.anInt1451 = local22 + Static66.anInt1451 / local24;
			} else {
				Static106.anInt2362 = local14;
				Static244.anInt5027 = local18;
				Static66.anInt1451 = local22;
			}
			return;
		}
		@Pc(152) int[] local152;
		@Pc(154) int local154;
		if (arg0 == 1) {
			local22 = arg3 << 4;
			local18 = arg2 << 4;
			local14 = arg4 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray39.length > local32) {
					local152 = this.anIntArrayArray39[local32];
					for (local154 = 0; local154 < local152.length; local154++) {
						local50 = local152[local154];
						this.anIntArray356[local50] += local18;
						this.anIntArray357[local50] += local22;
						this.anIntArray355[local50] += local14;
					}
				}
			}
			return;
		}
		@Pc(272) int local272;
		@Pc(290) int local290;
		@Pc(738) int local738;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray39.length > local32) {
					local152 = this.anIntArrayArray39[local32];
					if ((arg5 & 0x1) == 0) {
						for (local154 = 0; local154 < local152.length; local154++) {
							local50 = local152[local154];
							this.anIntArray356[local50] -= Static244.anInt5027;
							this.anIntArray357[local50] -= Static66.anInt1451;
							this.anIntArray355[local50] -= Static106.anInt2362;
							if (arg4 != 0) {
								local56 = Class5.anIntArray761[arg4];
								local272 = Class5.anIntArray760[arg4];
								local290 = this.anIntArray357[local50] * local56 + this.anIntArray356[local50] * local272 + 16383 >> 14;
								this.anIntArray357[local50] = this.anIntArray357[local50] * local272 + 16383 - local56 * this.anIntArray356[local50] >> 14;
								this.anIntArray356[local50] = local290;
							}
							if (arg2 != 0) {
								local56 = Class5.anIntArray761[arg2];
								local272 = Class5.anIntArray760[arg2];
								local290 = this.anIntArray357[local50] * local272 + 16383 - local56 * this.anIntArray355[local50] >> 14;
								this.anIntArray355[local50] = this.anIntArray357[local50] * local56 + local272 * this.anIntArray355[local50] + 16383 >> 14;
								this.anIntArray357[local50] = local290;
							}
							if (arg3 != 0) {
								local56 = Class5.anIntArray761[arg3];
								local272 = Class5.anIntArray760[arg3];
								local290 = local56 * this.anIntArray355[local50] + local272 * this.anIntArray356[local50] + 16383 >> 14;
								this.anIntArray355[local50] = local272 * this.anIntArray355[local50] + 16383 - local56 * this.anIntArray356[local50] >> 14;
								this.anIntArray356[local50] = local290;
							}
							this.anIntArray356[local50] += Static244.anInt5027;
							this.anIntArray357[local50] += Static66.anInt1451;
							this.anIntArray355[local50] += Static106.anInt2362;
						}
					} else {
						for (local154 = 0; local154 < local152.length; local154++) {
							local50 = local152[local154];
							this.anIntArray356[local50] -= Static244.anInt5027;
							this.anIntArray357[local50] -= Static66.anInt1451;
							this.anIntArray355[local50] -= Static106.anInt2362;
							if (arg2 != 0) {
								local56 = Class5.anIntArray761[arg2];
								local272 = Class5.anIntArray760[arg2];
								local290 = local272 * this.anIntArray357[local50] + 16383 - this.anIntArray355[local50] * local56 >> 14;
								this.anIntArray355[local50] = local56 * this.anIntArray357[local50] + this.anIntArray355[local50] * local272 + 16383 >> 14;
								this.anIntArray357[local50] = local290;
							}
							if (arg4 != 0) {
								local56 = Class5.anIntArray761[arg4];
								local272 = Class5.anIntArray760[arg4];
								local290 = local272 * this.anIntArray356[local50] + this.anIntArray357[local50] * local56 + 16383 >> 14;
								this.anIntArray357[local50] = local272 * this.anIntArray357[local50] + 16383 - this.anIntArray356[local50] * local56 >> 14;
								this.anIntArray356[local50] = local290;
							}
							if (arg3 != 0) {
								local56 = Class5.anIntArray761[arg3];
								local272 = Class5.anIntArray760[arg3];
								local290 = this.anIntArray356[local50] * local272 + local56 * this.anIntArray355[local50] + 16383 >> 14;
								this.anIntArray355[local50] = this.anIntArray355[local50] * local272 + 16383 - this.anIntArray356[local50] * local56 >> 14;
								this.anIntArray356[local50] = local290;
							}
							this.anIntArray356[local50] += Static244.anInt5027;
							this.anIntArray357[local50] += Static66.anInt1451;
							this.anIntArray355[local50] += Static106.anInt2362;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray39.length) {
						local48 = this.anIntArrayArray39[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local272 = this.anIntArray353[local56];
							local290 = this.anIntArray353[local56 + 1];
							for (local738 = local272; local738 < local290; local738++) {
								@Pc(747) int local747 = this.aShortArray73[local738] - 1;
								if (local747 == -1) {
									break;
								}
								@Pc(756) int local756;
								@Pc(760) int local760;
								@Pc(778) int local778;
								if (arg4 != 0) {
									local756 = Class5.anIntArray761[arg4];
									local760 = Class5.anIntArray760[arg4];
									local778 = local756 * this.aShortArray76[local747] + this.aShortArray67[local747] * local760 + 16383 >> 14;
									this.aShortArray76[local747] = (short) (this.aShortArray76[local747] * local760 + 16383 - this.aShortArray67[local747] * local756 >> 14);
									this.aShortArray67[local747] = (short) local778;
								}
								if (arg2 != 0) {
									local756 = Class5.anIntArray761[arg2];
									local760 = Class5.anIntArray760[arg2];
									local778 = this.aShortArray76[local747] * local760 + 16383 - local756 * this.aShortArray72[local747] >> 14;
									this.aShortArray72[local747] = (short) (this.aShortArray76[local747] * local756 + this.aShortArray72[local747] * local760 + 16383 >> 14);
									this.aShortArray76[local747] = (short) local778;
								}
								if (arg3 != 0) {
									local756 = Class5.anIntArray761[arg3];
									local760 = Class5.anIntArray760[arg3];
									local778 = local760 * this.aShortArray67[local747] + local756 * this.aShortArray72[local747] + 16383 >> 14;
									this.aShortArray72[local747] = (short) (this.aShortArray72[local747] * local760 + 16383 - local756 * this.aShortArray67[local747] >> 14);
									this.aShortArray67[local747] = (short) local778;
								}
							}
						}
					}
				}
				if (this.aClass112_4 == null && this.aClass112_3 != null) {
					this.aClass112_3.anInterface1_4 = null;
				}
				if (this.aClass112_4 != null) {
					this.aClass112_4.anInterface1_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray39.length > local32) {
					local152 = this.anIntArrayArray39[local32];
					for (local154 = 0; local154 < local152.length; local154++) {
						local50 = local152[local154];
						this.anIntArray356[local50] -= Static244.anInt5027;
						this.anIntArray357[local50] -= Static66.anInt1451;
						this.anIntArray355[local50] -= Static106.anInt2362;
						this.anIntArray356[local50] = arg2 * this.anIntArray356[local50] >> 7;
						this.anIntArray357[local50] = this.anIntArray357[local50] * arg3 >> 7;
						this.anIntArray355[local50] = arg4 * this.anIntArray355[local50] >> 7;
						this.anIntArray356[local50] += Static244.anInt5027;
						this.anIntArray357[local50] += Static66.anInt1451;
						this.anIntArray355[local50] += Static106.anInt2362;
					}
				}
			}
		} else {
			@Pc(1189) Class61 local1189;
			@Pc(1194) Class36 local1194;
			if (arg0 == 5) {
				if (this.anIntArrayArray38 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray38.length) {
							local152 = this.anIntArrayArray38[local32];
							for (local154 = 0; local154 < local152.length; local154++) {
								local50 = local152[local154];
								local56 = (this.aByteArray42[local50] & 0xFF) + (arg2 * 8);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray42[local50] = (byte) local56;
							}
							if (local152.length > 0 && this.aClass112_3 != null) {
								this.aClass112_3.anInterface1_4 = null;
							}
						}
					}
					if (this.aClass61Array1 != null) {
						for (local32 = 0; local32 < this.anInt3111; local32++) {
							local1189 = this.aClass61Array1[local32];
							local1194 = this.aClass36Array1[local32];
							local1194.anInt1008 = 255 - (this.aByteArray42[local1189.anInt1868] & 0xFF) << 24 | local1194.anInt1008 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1459) Class36 local1459;
				if (arg0 == 8) {
					if (this.anIntArrayArray37 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray37.length > local32) {
								local152 = this.anIntArrayArray37[local32];
								for (local154 = 0; local154 < local152.length; local154++) {
									local1459 = this.aClass36Array1[local152[local154]];
									local1459.anInt1010 += arg3;
									local1459.anInt1009 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray37 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray37.length) {
								local152 = this.anIntArrayArray37[local32];
								for (local154 = 0; local154 < local152.length; local154++) {
									local1459 = this.aClass36Array1[local152[local154]];
									local1459.anInt1011 = local1459.anInt1011 * arg2 >> 7;
									local1459.anInt1007 = local1459.anInt1007 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray37 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray37.length) {
							local152 = this.anIntArrayArray37[local32];
							for (local154 = 0; local154 < local152.length; local154++) {
								local1459 = this.aClass36Array1[local152[local154]];
								local1459.anInt1012 = arg2 + local1459.anInt1012 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray38 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray38.length) {
						local152 = this.anIntArrayArray38[local32];
						for (local154 = 0; local154 < local152.length; local154++) {
							local50 = local152[local154];
							local56 = this.aShortArray68[local50] & 0xFFFF;
							local272 = local56 >> 10 & 0x3F;
							local290 = local56 >> 7 & 0x7;
							local290 += arg3 / 4;
							@Pc(1292) int local1292 = local272 + arg2 & 0x3F;
							local738 = local56 & 0x7F;
							local738 += arg4;
							if (local290 < 0) {
								local290 = 0;
							} else if (local290 > 7) {
								local290 = 7;
							}
							if (local738 < 0) {
								local738 = 0;
							} else if (local738 > 127) {
								local738 = 127;
							}
							this.aShortArray68[local50] = (short) (local1292 << 10 | local290 << 7 | local738);
						}
						if (local152.length > 0 && this.aClass112_3 != null) {
							this.aClass112_3.anInterface1_4 = null;
						}
					}
				}
				if (this.aClass61Array1 != null) {
					for (local32 = 0; local32 < this.anInt3111; local32++) {
						local1189 = this.aClass61Array1[local32];
						local1194 = this.aClass36Array1[local32];
						local1194.anInt1008 = local1194.anInt1008 & 0xFF000000 | Static393.anIntArray638[this.aShortArray68[local1189.anInt1868] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3079; local3++) {
			if (arg0 == this.aShortArray68[local3]) {
				this.aShortArray68[local3] = arg1;
			}
		}
		if (this.aClass61Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt3111; local38++) {
				@Pc(45) Class61 local45 = this.aClass61Array1[local38];
				@Pc(50) Class36 local50 = this.aClass36Array1[local38];
				local50.anInt1008 = local50.anInt1008 & 0xFF000000 | Static393.anIntArray638[this.aShortArray68[local45.anInt1868] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass112_3 != null) {
			this.aClass112_3.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!gca", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean222) {
			this.method2626();
		}
		return this.aShort50;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "()[Lclient!fca;")
	@Override
	public Class83[] method5778() {
		return this.aClass83Array3;
	}

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3105; local3++) {
			if (arg0 != 0) {
				this.anIntArray356[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray357[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray355[local3] += arg2;
			}
		}
		if (this.aClass112_5 != null) {
			this.aClass112_5.anInterface1_4 = null;
		}
		this.aBoolean222 = false;
	}

	@OriginalMember(owner = "client!gca", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3105; local7++) {
			this.anIntArray355[local7] = -this.anIntArray355[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt3094; local29++) {
			this.aShortArray72[local29] = (short) -this.aShortArray72[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt3079; local52++) {
			@Pc(59) short local59 = this.aShortArray74[local52];
			this.aShortArray74[local52] = this.aShortArray69[local52];
			this.aShortArray69[local52] = local59;
		}
		if (this.aClass112_4 == null && this.aClass112_3 != null) {
			this.aClass112_3.anInterface1_4 = null;
		}
		if (this.aClass112_4 != null) {
			this.aClass112_4.anInterface1_4 = null;
		}
		if (this.aClass34_1 != null) {
			this.aClass34_1.anInterface10_2 = null;
		}
		this.aBoolean222 = false;
		if (this.aClass112_5 != null) {
			this.aClass112_5.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!gca", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static244.anInt5027 = 0;
			Static106.anInt2362 = 0;
			Static66.anInt1451 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray39.length > local38) {
					local52 = this.anIntArrayArray39[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local60]) != 0) {
							Static244.anInt5027 += this.anIntArray356[local60];
							Static66.anInt1451 += this.anIntArray357[local60];
							Static106.anInt2362 += this.anIntArray355[local60];
							local30++;
						}
					}
				}
			}
			if (local30 <= 0) {
				Static66.anInt1451 = arg3;
				Static106.anInt2362 = arg4;
				Static244.anInt5027 = arg2;
			} else {
				Static106.anInt2362 = Static106.anInt2362 / local30 + arg4;
				Static208.aBoolean330 = true;
				Static244.anInt5027 = arg2 + Static244.anInt5027 / local30;
				Static66.anInt1451 = Static66.anInt1451 / local30 + arg3;
			}
			return;
		}
		@Pc(245) int[] local245;
		@Pc(247) int local247;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg7[1] * arg3 + arg2 * arg7[0] + arg4 * arg7[2] + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg3 * arg7[4] + arg7[3] * arg2 + 8192 >> 14;
				local38 = arg7[7] * arg3 + arg7[6] * arg2 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local30;
				arg4 = local38;
				arg3 = local32;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray39.length > local32) {
					local245 = this.anIntArrayArray39[local32];
					for (local247 = 0; local247 < local245.length; local247++) {
						local54 = local245[local247];
						if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local54]) != 0) {
							this.anIntArray356[local54] += arg2;
							this.anIntArray357[local54] += arg3;
							this.anIntArray355[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(384) int local384;
		@Pc(402) int local402;
		@Pc(633) int local633;
		@Pc(642) int local642;
		@Pc(654) int local654;
		@Pc(658) int local658;
		@Pc(676) int local676;
		@Pc(1021) int local1021;
		@Pc(1029) int local1029;
		@Pc(1185) int local1185;
		@Pc(1211) int local1211;
		@Pc(1215) int local1215;
		@Pc(1224) int local1224;
		@Pc(1229) int local1229;
		@Pc(1233) int local1233;
		@Pc(1237) int local1237;
		@Pc(1239) int local1239;
		@Pc(1369) int[] local1369;
		@Pc(1371) int local1371;
		@Pc(1375) int local1375;
		@Pc(1379) int local1379;
		@Pc(1381) int local1381;
		@Pc(1508) int local1508;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray39.length > local32) {
						local245 = this.anIntArrayArray39[local32];
						for (local247 = 0; local247 < local245.length; local247++) {
							local54 = local245[local247];
							if (this.aShortArray70 == null || (this.aShortArray70[local54] & arg6) != 0) {
								this.anIntArray356[local54] -= Static244.anInt5027;
								this.anIntArray357[local54] -= Static66.anInt1451;
								this.anIntArray355[local54] -= Static106.anInt2362;
								if (arg4 != 0) {
									local60 = Class5.anIntArray761[arg4];
									local384 = Class5.anIntArray760[arg4];
									local402 = this.anIntArray356[local54] * local384 + local60 * this.anIntArray357[local54] + 16383 >> 14;
									this.anIntArray357[local54] = this.anIntArray357[local54] * local384 + 16383 - this.anIntArray356[local54] * local60 >> 14;
									this.anIntArray356[local54] = local402;
								}
								if (arg2 != 0) {
									local60 = Class5.anIntArray761[arg2];
									local384 = Class5.anIntArray760[arg2];
									local402 = local384 * this.anIntArray357[local54] + 16383 - local60 * this.anIntArray355[local54] >> 14;
									this.anIntArray355[local54] = this.anIntArray357[local54] * local60 + this.anIntArray355[local54] * local384 + 16383 >> 14;
									this.anIntArray357[local54] = local402;
								}
								if (arg3 != 0) {
									local60 = Class5.anIntArray761[arg3];
									local384 = Class5.anIntArray760[arg3];
									local402 = this.anIntArray355[local54] * local60 + this.anIntArray356[local54] * local384 + 16383 >> 14;
									this.anIntArray355[local54] = this.anIntArray355[local54] * local384 + 16383 - this.anIntArray356[local54] * local60 >> 14;
									this.anIntArray356[local54] = local402;
								}
								this.anIntArray356[local54] += Static244.anInt5027;
								this.anIntArray357[local54] += Static66.anInt1451;
								this.anIntArray355[local54] += Static106.anInt2362;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray39.length) {
							local52 = this.anIntArrayArray39[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local60]) != 0) {
									local384 = this.anIntArray353[local60];
									local402 = this.anIntArray353[local60 + 1];
									for (local633 = local384; local633 < local402; local633++) {
										local642 = this.aShortArray73[local633] - 1;
										if (local642 == -1) {
											break;
										}
										if (arg4 != 0) {
											local654 = Class5.anIntArray761[arg4];
											local658 = Class5.anIntArray760[arg4];
											local676 = local658 * this.aShortArray67[local642] + local654 * this.aShortArray76[local642] + 16383 >> 14;
											this.aShortArray76[local642] = (short) (this.aShortArray76[local642] * local658 + 16383 - this.aShortArray67[local642] * local654 >> 14);
											this.aShortArray67[local642] = (short) local676;
										}
										if (arg2 != 0) {
											local654 = Class5.anIntArray761[arg2];
											local658 = Class5.anIntArray760[arg2];
											local676 = local658 * this.aShortArray76[local642] + 16383 - this.aShortArray72[local642] * local654 >> 14;
											this.aShortArray72[local642] = (short) (this.aShortArray76[local642] * local654 + this.aShortArray72[local642] * local658 + 16383 >> 14);
											this.aShortArray76[local642] = (short) local676;
										}
										if (arg3 != 0) {
											local654 = Class5.anIntArray761[arg3];
											local658 = Class5.anIntArray760[arg3];
											local676 = this.aShortArray72[local642] * local654 + this.aShortArray67[local642] * local658 + 16383 >> 14;
											this.aShortArray72[local642] = (short) (local658 * this.aShortArray72[local642] + 16383 - local654 * this.aShortArray67[local642] >> 14);
											this.aShortArray67[local642] = (short) local676;
										}
									}
								}
							}
						}
					}
					if (this.aClass112_4 == null && this.aClass112_3 != null) {
						this.aClass112_3.anInterface1_4 = null;
					}
					if (this.aClass112_4 != null) {
						this.aClass112_4.anInterface1_4 = null;
						return;
					}
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local247 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static208.aBoolean330) {
					local384 = arg7[6] * Static106.anInt2362 + arg7[3] * Static66.anInt1451 + Static244.anInt5027 * arg7[0] + 8192 >> 14;
					local402 = arg7[7] * Static106.anInt2362 + Static244.anInt5027 * arg7[1] + Static66.anInt1451 * arg7[4] + 8192 >> 14;
					local384 += local247;
					local633 = Static66.anInt1451 * arg7[5] + Static244.anInt5027 * arg7[2] + Static106.anInt2362 * arg7[8] + 8192 >> 14;
					local402 += local54;
					local633 += local60;
					Static244.anInt5027 = local384;
					Static66.anInt1451 = local402;
					Static106.anInt2362 = local633;
					Static208.aBoolean330 = false;
				}
				@Pc(989) int[] local989 = new int[9];
				local402 = Class5.anIntArray760[arg2];
				local633 = Class5.anIntArray761[arg2];
				local642 = Class5.anIntArray760[arg3];
				local654 = Class5.anIntArray761[arg3];
				local658 = Class5.anIntArray760[arg4];
				local676 = Class5.anIntArray761[arg4];
				local1021 = local658 * local633 + 8192 >> 14;
				local1029 = local676 * local633 + 8192 >> 14;
				local989[2] = local402 * local654 + 8192 >> 14;
				local989[8] = local642 * local402 + 8192 >> 14;
				local989[0] = local658 * local642 + local654 * local1029 + 8192 >> 14;
				local989[5] = -local633;
				local989[1] = local676 * -local642 + local654 * local1021 + 8192 >> 14;
				local989[7] = local642 * local1021 + local676 * local654 + 8192 >> 14;
				local989[3] = local402 * local676 + 8192 >> 14;
				local989[6] = local642 * local1029 + local658 * -local654 + 8192 >> 14;
				local989[4] = local658 * local402 + 8192 >> 14;
				@Pc(1160) int local1160 = -Static244.anInt5027 * local989[0] + -Static66.anInt1451 * local989[1] + -Static106.anInt2362 * local989[2] + 8192 >> 14;
				local1185 = local989[5] * -Static106.anInt2362 + local989[4] * -Static66.anInt1451 + local989[3] * -Static244.anInt5027 + 8192 >> 14;
				local1211 = -Static106.anInt2362 * local989[8] + local989[6] * -Static244.anInt5027 + -Static66.anInt1451 * local989[7] + 8192 >> 14;
				local1215 = Static244.anInt5027 + local1160;
				@Pc(1220) int local1220 = local1185 + Static66.anInt1451;
				local1224 = Static106.anInt2362 + local1211;
				@Pc(1227) int[] local1227 = new int[9];
				for (local1229 = 0; local1229 < 3; local1229++) {
					for (local1233 = 0; local1233 < 3; local1233++) {
						local1237 = 0;
						for (local1239 = 0; local1239 < 3; local1239++) {
							local1237 += local989[local1239 + local1229 * 3] * arg7[local1239 + local1233 * 3];
						}
						local1227[local1229 * 3 + local1233] = local1237 + 8192 >> 14;
					}
				}
				local1233 = local60 * local989[2] + local989[1] * local54 + local989[0] * local247 + 8192 >> 14;
				local1237 = local60 * local989[5] + local54 * local989[4] + local989[3] * local247 + 8192 >> 14;
				local1239 = local989[8] * local60 + local989[7] * local54 + local247 * local989[6] + 8192 >> 14;
				local1237 += local1220;
				local1233 += local1215;
				local1239 += local1224;
				local1369 = new int[9];
				for (local1371 = 0; local1371 < 3; local1371++) {
					for (local1375 = 0; local1375 < 3; local1375++) {
						local1379 = 0;
						for (local1381 = 0; local1381 < 3; local1381++) {
							local1379 += local1227[local1375 + local1381 * 3] * arg7[local1381 + local1371 * 3];
						}
						local1369[local1371 * 3 + local1375] = local1379 + 8192 >> 14;
					}
				}
				local1375 = local1239 * arg7[2] + local1237 * arg7[1] + arg7[0] * local1233 + 8192 >> 14;
				local1379 = local1233 * arg7[3] + arg7[4] * local1237 + local1239 * arg7[5] + 8192 >> 14;
				local1375 += local30;
				local1379 += local32;
				local1381 = arg7[8] * local1239 + arg7[7] * local1237 + arg7[6] * local1233 + 8192 >> 14;
				local1381 += local38;
				for (local1508 = 0; local1508 < local8; local1508++) {
					@Pc(1514) int local1514 = arg1[local1508];
					if (this.anIntArrayArray39.length > local1514) {
						@Pc(1524) int[] local1524 = this.anIntArrayArray39[local1514];
						for (@Pc(1526) int local1526 = 0; local1526 < local1524.length; local1526++) {
							@Pc(1532) int local1532 = local1524[local1526];
							if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local1532]) != 0) {
								@Pc(1573) int local1573 = local1369[1] * this.anIntArray357[local1532] + this.anIntArray356[local1532] * local1369[0] + local1369[2] * this.anIntArray355[local1532] + 8192 >> 14;
								@Pc(1605) int local1605 = local1369[5] * this.anIntArray355[local1532] + this.anIntArray356[local1532] * local1369[3] + local1369[4] * this.anIntArray357[local1532] + 8192 >> 14;
								@Pc(1609) int local1609 = local1573 + local1375;
								@Pc(1613) int local1613 = local1605 + local1379;
								@Pc(1645) int local1645 = this.anIntArray356[local1532] * local1369[6] + this.anIntArray357[local1532] * local1369[7] + this.anIntArray355[local1532] * local1369[8] + 8192 >> 14;
								this.anIntArray356[local1532] = local1609;
								@Pc(1654) int local1654 = local1645 + local1381;
								this.anIntArray357[local1532] = local1613;
								this.anIntArray355[local1532] = local1654;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2583) Class61 local2583;
			@Pc(2588) Class36 local2588;
			if (arg0 == 5) {
				if (this.anIntArrayArray38 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray38.length > local32) {
							local245 = this.anIntArrayArray38[local32];
							for (local247 = 0; local247 < local245.length; local247++) {
								local54 = local245[local247];
								if (this.aShortArray77 == null || (this.aShortArray77[local54] & arg6) != 0) {
									local60 = arg2 * 8 + (this.aByteArray42[local54] & 0xFF);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray42[local54] = (byte) local60;
									if (this.aClass112_3 != null) {
										this.aClass112_3.anInterface1_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass61Array1 != null) {
						for (local32 = 0; local32 < this.anInt3111; local32++) {
							local2583 = this.aClass61Array1[local32];
							local2588 = this.aClass36Array1[local32];
							local2588.anInt1008 = local2588.anInt1008 & 0xFFFFFF | 255 - (this.aByteArray42[local2583.anInt1868] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2836) Class36 local2836;
				if (arg0 == 8) {
					if (this.anIntArrayArray37 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray37.length) {
								local245 = this.anIntArrayArray37[local32];
								for (local247 = 0; local247 < local245.length; local247++) {
									local2836 = this.aClass36Array1[local245[local247]];
									local2836.anInt1009 += arg2;
									local2836.anInt1010 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray37 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray37.length) {
								local245 = this.anIntArrayArray37[local32];
								for (local247 = 0; local247 < local245.length; local247++) {
									local2836 = this.aClass36Array1[local245[local247]];
									local2836.anInt1007 = arg3 * local2836.anInt1007 >> 7;
									local2836.anInt1011 = arg2 * local2836.anInt1011 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray37 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray37.length > local32) {
							local245 = this.anIntArrayArray37[local32];
							for (local247 = 0; local247 < local245.length; local247++) {
								local2836 = this.aClass36Array1[local245[local247]];
								local2836.anInt1012 = local2836.anInt1012 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray38 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray38.length > local32) {
						local245 = this.anIntArrayArray38[local32];
						for (local247 = 0; local247 < local245.length; local247++) {
							local54 = local245[local247];
							if (this.aShortArray77 == null || (arg6 & this.aShortArray77[local54]) != 0) {
								local60 = this.aShortArray68[local54] & 0xFFFF;
								local384 = local60 >> 10 & 0x3F;
								local402 = local60 >> 7 & 0x7;
								local402 += arg3 / 4;
								@Pc(2692) int local2692 = arg2 + local384 & 0x3F;
								local633 = local60 & 0x7F;
								local633 += arg4;
								if (local402 < 0) {
									local402 = 0;
								} else if (local402 > 7) {
									local402 = 7;
								}
								if (local633 < 0) {
									local633 = 0;
								} else if (local633 > 127) {
									local633 = 127;
								}
								this.aShortArray68[local54] = (short) (local2692 << 10 | local402 << 7 | local633);
								if (this.aClass112_3 != null) {
									this.aClass112_3.anInterface1_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass61Array1 != null) {
					for (local32 = 0; local32 < this.anInt3111; local32++) {
						local2583 = this.aClass61Array1[local32];
						local2588 = this.aClass36Array1[local32];
						local2588.anInt1008 = local2588.anInt1008 & 0xFF000000 | Static393.anIntArray638[this.aShortArray68[local2583.anInt1868] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray39.length > local32) {
					local245 = this.anIntArrayArray39[local32];
					for (local247 = 0; local247 < local245.length; local247++) {
						local54 = local245[local247];
						if (this.aShortArray70 == null || (this.aShortArray70[local54] & arg6) != 0) {
							this.anIntArray356[local54] -= Static244.anInt5027;
							this.anIntArray357[local54] -= Static66.anInt1451;
							this.anIntArray355[local54] -= Static106.anInt2362;
							this.anIntArray356[local54] = this.anIntArray356[local54] * arg2 >> 7;
							this.anIntArray357[local54] = arg3 * this.anIntArray357[local54] >> 7;
							this.anIntArray355[local54] = this.anIntArray355[local54] * arg4 >> 7;
							this.anIntArray356[local54] += Static244.anInt5027;
							this.anIntArray357[local54] += Static66.anInt1451;
							this.anIntArray355[local54] += Static106.anInt2362;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local247 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static208.aBoolean330) {
				local384 = arg7[0] * Static244.anInt5027 + Static66.anInt1451 * arg7[3] + arg7[6] * Static106.anInt2362 + 8192 >> 14;
				local402 = Static106.anInt2362 * arg7[7] + Static244.anInt5027 * arg7[1] + Static66.anInt1451 * arg7[4] + 8192 >> 14;
				local384 += local247;
				local633 = arg7[8] * Static106.anInt2362 + arg7[5] * Static66.anInt1451 + arg7[2] * Static244.anInt5027 + 8192 >> 14;
				local402 += local54;
				local633 += local60;
				Static66.anInt1451 = local402;
				Static244.anInt5027 = local384;
				Static208.aBoolean330 = false;
				Static106.anInt2362 = local633;
			}
			local384 = arg2 << 15 >> 7;
			local402 = arg3 << 15 >> 7;
			local633 = arg4 << 15 >> 7;
			local642 = -Static244.anInt5027 * local384 + 8192 >> 14;
			local654 = local402 * -Static66.anInt1451 + 8192 >> 14;
			local658 = -Static106.anInt2362 * local633 + 8192 >> 14;
			local676 = Static244.anInt5027 + local642;
			local1021 = local654 + Static66.anInt1451;
			local1029 = local658 + Static106.anInt2362;
			@Pc(2004) int[] local2004 = new int[] { local384 * arg7[0] + 8192 >> 14, local384 * arg7[3] + 8192 >> 14, arg7[6] * local384 + 8192 >> 14, arg7[1] * local402 + 8192 >> 14, local402 * arg7[4] + 8192 >> 14, arg7[7] * local402 + 8192 >> 14, arg7[2] * local633 + 8192 >> 14, arg7[5] * local633 + 8192 >> 14, arg7[8] * local633 + 8192 >> 14 };
			local1185 = local247 * local384 + 8192 >> 14;
			local1211 = local54 * local402 + 8192 >> 14;
			local1215 = local633 * local60 + 8192 >> 14;
			@Pc(2140) int local2140 = local1211 + local1021;
			@Pc(2144) int local2144 = local1185 + local676;
			@Pc(2148) int local2148 = local1215 + local1029;
			@Pc(2151) int[] local2151 = new int[9];
			@Pc(2157) int local2157;
			for (local1224 = 0; local1224 < 3; local1224++) {
				for (local2157 = 0; local2157 < 3; local2157++) {
					local1229 = 0;
					for (local1233 = 0; local1233 < 3; local1233++) {
						local1229 += arg7[local1233 + local1224 * 3] * local2004[local2157 + local1233 * 3];
					}
					local2151[local2157 + local1224 * 3] = local1229 + 8192 >> 14;
				}
			}
			local2157 = arg7[2] * local2148 + arg7[0] * local2144 + arg7[1] * local2140 + 8192 >> 14;
			local1229 = local2148 * arg7[5] + arg7[4] * local2140 + local2144 * arg7[3] + 8192 >> 14;
			local1229 += local32;
			local1233 = arg7[6] * local2144 + arg7[7] * local2140 + arg7[8] * local2148 + 8192 >> 14;
			local2157 += local30;
			local1233 += local38;
			for (local1237 = 0; local1237 < local8; local1237++) {
				local1239 = arg1[local1237];
				if (local1239 < this.anIntArrayArray39.length) {
					local1369 = this.anIntArrayArray39[local1239];
					for (local1371 = 0; local1371 < local1369.length; local1371++) {
						local1375 = local1369[local1371];
						if (this.aShortArray70 == null || (this.aShortArray70[local1375] & arg6) != 0) {
							local1379 = local2151[0] * this.anIntArray356[local1375] + this.anIntArray357[local1375] * local2151[1] + this.anIntArray355[local1375] * local2151[2] + 8192 >> 14;
							local1381 = this.anIntArray357[local1375] * local2151[4] + this.anIntArray356[local1375] * local2151[3] + local2151[5] * this.anIntArray355[local1375] + 8192 >> 14;
							local1508 = this.anIntArray357[local1375] * local2151[7] + local2151[6] * this.anIntArray356[local1375] + this.anIntArray355[local1375] * local2151[8] + 8192 >> 14;
							@Pc(2429) int local2429 = local1379 + local2157;
							@Pc(2433) int local2433 = local1381 + local1229;
							this.anIntArray356[local1375] = local2429;
							@Pc(2442) int local2442 = local1508 + local1233;
							this.anIntArray357[local1375] = local2433;
							this.anIntArray355[local1375] = local2442;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5.anIntArray761[arg0];
		@Pc(13) int local13 = Class5.anIntArray760[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3105; local15++) {
			local33 = this.anIntArray355[local15] * local9 + this.anIntArray356[local15] * local13 >> 14;
			this.anIntArray355[local15] = local13 * this.anIntArray355[local15] - local9 * this.anIntArray356[local15] >> 14;
			this.anIntArray356[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt3094; local33++) {
			@Pc(87) int local87 = local9 * this.aShortArray72[local33] + this.aShortArray67[local33] * local13 >> 14;
			this.aShortArray72[local33] = (short) (this.aShortArray72[local33] * local13 - local9 * this.aShortArray67[local33] >> 14);
			this.aShortArray67[local33] = (short) local87;
		}
		if (this.aClass112_4 == null && this.aClass112_3 != null) {
			this.aClass112_3.anInterface1_4 = null;
		}
		if (this.aClass112_4 != null) {
			this.aClass112_4.anInterface1_4 = null;
		}
		if (this.aClass112_5 != null) {
			this.aClass112_5.anInterface1_4 = null;
		}
		this.aBoolean222 = false;
	}

	@OriginalMember(owner = "client!gca", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5.anIntArray761[arg0];
		@Pc(13) int local13 = Class5.anIntArray760[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3105; local15++) {
			@Pc(33) int local33 = this.anIntArray357[local15] * local13 - local9 * this.anIntArray355[local15] >> 14;
			this.anIntArray355[local15] = this.anIntArray355[local15] * local13 + local9 * this.anIntArray357[local15] >> 14;
			this.anIntArray357[local15] = local33;
		}
		if (this.aClass112_5 != null) {
			this.aClass112_5.anInterface1_4 = null;
		}
		this.aBoolean222 = false;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
	private void method2624() {
		if (!this.aBoolean223) {
			return;
		}
		this.aBoolean223 = false;
		if (this.aClass83Array3 == null && this.aClass109Array3 == null && this.aClass61Array1 == null) {
			if (this.anIntArray356 != null && !Static314.method5097(this.anInt3116, this.anInt3118)) {
				if (this.aClass112_5 != null && this.aClass112_5.anInterface1_4 == null) {
					this.aBoolean223 = true;
				} else {
					if (!this.aBoolean222) {
						this.method2626();
					}
					this.anIntArray356 = null;
				}
			}
			if (this.anIntArray357 != null && !Static439.method6631(this.anInt3116, this.anInt3118)) {
				if (this.aClass112_5 != null && this.aClass112_5.anInterface1_4 == null) {
					this.aBoolean223 = true;
				} else {
					if (!this.aBoolean222) {
						this.method2626();
					}
					this.anIntArray357 = null;
				}
			}
			if (this.anIntArray355 != null && !Static426.method6519(this.anInt3116, this.anInt3118)) {
				if (this.aClass112_5 != null && this.aClass112_5.anInterface1_4 == null) {
					this.aBoolean223 = true;
				} else {
					if (!this.aBoolean222) {
						this.method2626();
					}
					this.anIntArray355 = null;
				}
			}
		}
		if (this.aShortArray73 != null && this.anIntArray356 == null && this.anIntArray357 == null && this.anIntArray355 == null) {
			this.aShortArray73 = null;
			this.anIntArray353 = null;
		}
		if (this.aByteArray41 != null && !Static428.method6539(this.anInt3116, this.anInt3118)) {
			if (this.aClass112_4 == null) {
				if (this.aClass112_3 != null && this.aClass112_3.anInterface1_4 == null) {
					this.aBoolean223 = true;
				} else {
					this.aByteArray41 = null;
					this.aShortArray67 = this.aShortArray76 = this.aShortArray72 = null;
				}
			} else if (this.aClass112_4.anInterface1_4 == null) {
				this.aBoolean223 = true;
			} else {
				this.aShortArray67 = this.aShortArray76 = this.aShortArray72 = null;
				this.aByteArray41 = null;
			}
		}
		if (this.aShortArray68 != null && !Static458.method6863(this.anInt3118, this.anInt3116)) {
			if (this.aClass112_3 != null && this.aClass112_3.anInterface1_4 == null) {
				this.aBoolean223 = true;
			} else {
				this.aShortArray68 = null;
			}
		}
		if (this.aByteArray42 != null && !Static298.method7723(this.anInt3118, this.anInt3116)) {
			if (this.aClass112_3 != null && this.aClass112_3.anInterface1_4 == null) {
				this.aBoolean223 = true;
			} else {
				this.aByteArray42 = null;
			}
		}
		if (this.aFloatArray13 != null && !Static266.method4659(this.anInt3118, this.anInt3116)) {
			if (this.aClass112_6 != null && this.aClass112_6.anInterface1_4 == null) {
				this.aBoolean223 = true;
			} else {
				this.aFloatArray13 = this.aFloatArray12 = null;
			}
		}
		if (this.aShortArray71 != null && !Static31.method810(this.anInt3118, this.anInt3116)) {
			if (this.aClass112_3 != null && this.aClass112_3.anInterface1_4 == null) {
				this.aBoolean223 = true;
			} else {
				this.aShortArray71 = null;
			}
		}
		if (this.aShortArray74 != null && !Static404.method6137(this.anInt3118, this.anInt3116)) {
			if (this.aClass34_1 != null && this.aClass34_1.anInterface10_2 == null || this.aClass112_3 != null && this.aClass112_3.anInterface1_4 == null) {
				this.aBoolean223 = true;
			} else {
				this.aShortArray74 = this.aShortArray75 = this.aShortArray69 = null;
			}
		}
		if (this.anIntArrayArray38 != null && !Static245.method4224(this.anInt3116, this.anInt3118)) {
			this.aShortArray77 = null;
			this.anIntArrayArray38 = null;
		}
		if (this.anIntArrayArray39 != null && !Static322.method5161(this.anInt3118, this.anInt3116)) {
			this.anIntArrayArray39 = null;
			this.aShortArray70 = null;
		}
		if (this.anIntArrayArray37 != null && !Static286.method4859(this.anInt3116, this.anInt3118)) {
			this.anIntArrayArray37 = null;
		}
		if (this.anIntArray354 != null && (this.anInt3116 & 0x800) == 0 && (this.anInt3116 & 0x40000) == 0) {
			this.anIntArray354 = null;
		}
	}

	@OriginalMember(owner = "client!gca", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean222) {
			this.method2626();
		}
		return this.aShort57;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method5781(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class2_Sub2 local8 = (Class2_Sub2) arg0;
		if (this.anInt3079 == 0 || local8.anInt3079 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt3105;
		@Pc(24) int[] local24 = local8.anIntArray356;
		@Pc(27) int[] local27 = local8.anIntArray357;
		@Pc(30) int[] local30 = local8.anIntArray355;
		@Pc(33) short[] local33 = local8.aShortArray67;
		@Pc(36) short[] local36 = local8.aShortArray76;
		@Pc(39) short[] local39 = local8.aShortArray72;
		@Pc(42) byte[] local42 = local8.aByteArray41;
		@Pc(49) short[] local49;
		@Pc(57) short[] local57;
		@Pc(61) short[] local61;
		@Pc(53) byte[] local53;
		if (this.aClass200_1 == null) {
			local61 = null;
			local49 = null;
			local57 = null;
			local53 = null;
		} else {
			local49 = this.aClass200_1.aShortArray123;
			local53 = this.aClass200_1.aByteArray61;
			local57 = this.aClass200_1.aShortArray121;
			local61 = this.aClass200_1.aShortArray122;
		}
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(90) short[] local90;
		@Pc(86) byte[] local86;
		if (local8.aClass200_1 == null) {
			local78 = null;
			local86 = null;
			local90 = null;
			local82 = null;
		} else {
			local78 = local8.aClass200_1.aShortArray123;
			local82 = local8.aClass200_1.aShortArray121;
			local86 = local8.aClass200_1.aByteArray61;
			local90 = local8.aClass200_1.aShortArray122;
		}
		@Pc(103) int[] local103 = local8.anIntArray353;
		@Pc(106) short[] local106 = local8.aShortArray73;
		if (!local8.aBoolean222) {
			local8.method2626();
		}
		@Pc(115) short local115 = local8.aShort52;
		@Pc(118) short local118 = local8.aShort50;
		@Pc(121) short local121 = local8.aShort53;
		@Pc(124) short local124 = local8.aShort55;
		@Pc(127) short local127 = local8.aShort54;
		@Pc(130) short local130 = local8.aShort56;
		for (@Pc(132) int local132 = 0; local132 < this.anInt3105; local132++) {
			@Pc(141) int local141 = this.anIntArray357[local132] - arg2;
			if (local141 >= local115 && local141 <= local118) {
				@Pc(165) int local165 = this.anIntArray356[local132] - arg1;
				if (local165 >= local121 && local165 <= local124) {
					@Pc(180) int local180 = this.anIntArray355[local132] - arg3;
					if (local180 >= local127 && local180 <= local130) {
						@Pc(190) int local190 = -1;
						@Pc(195) int local195 = this.anIntArray353[local132];
						@Pc(202) int local202 = this.anIntArray353[local132 + 1];
						for (@Pc(204) int local204 = local195; local204 < local202; local204++) {
							local190 = this.aShortArray73[local204] - 1;
							if (local190 == -1 || this.aByteArray41[local190] != 0) {
								break;
							}
						}
						if (local190 != -1) {
							for (@Pc(233) int local233 = 0; local233 < local21; local233++) {
								if (local165 == local24[local233] && local180 == local30[local233] && local141 == local27[local233]) {
									@Pc(260) int local260 = -1;
									local195 = local103[local233];
									local202 = local103[local233 + 1];
									for (@Pc(272) int local272 = local195; local272 < local202; local272++) {
										local260 = local106[local272] - 1;
										if (local260 == -1 || local42[local260] != 0) {
											break;
										}
									}
									if (local260 != -1) {
										if (local49 == null) {
											this.aClass200_1 = new Class200();
											local49 = this.aClass200_1.aShortArray123 = Static390.method5967(this.aShortArray67);
											local57 = this.aClass200_1.aShortArray121 = Static390.method5967(this.aShortArray76);
											local61 = this.aClass200_1.aShortArray122 = Static390.method5967(this.aShortArray72);
											local53 = this.aClass200_1.aByteArray61 = Static205.method3798(this.aByteArray41);
										}
										if (local78 == null) {
											@Pc(352) Class200 local352 = local8.aClass200_1 = new Class200();
											local78 = local352.aShortArray123 = Static390.method5967(local33);
											local82 = local352.aShortArray121 = Static390.method5967(local36);
											local90 = local352.aShortArray122 = Static390.method5967(local39);
											local86 = local352.aByteArray61 = Static205.method3798(local42);
										}
										@Pc(385) short local385 = this.aShortArray67[local190];
										@Pc(390) short local390 = this.aShortArray76[local190];
										@Pc(395) short local395 = this.aShortArray72[local190];
										@Pc(400) byte local400 = this.aByteArray41[local190];
										local195 = local103[local233];
										local202 = local103[local233 + 1];
										@Pc(420) int local420;
										for (@Pc(412) int local412 = local195; local412 < local202; local412++) {
											local420 = local106[local412] - 1;
											if (local420 == -1) {
												break;
											}
											if (local86[local420] != 0) {
												local78[local420] += local385;
												local82[local420] += local390;
												local90[local420] += local395;
												local86[local420] += local400;
											}
										}
										local400 = local42[local260];
										local395 = local39[local260];
										local202 = this.anIntArray353[local132 + 1];
										local390 = local36[local260];
										local385 = local33[local260];
										local195 = this.anIntArray353[local132];
										for (local420 = local195; local420 < local202; local420++) {
											@Pc(506) int local506 = this.aShortArray73[local420] - 1;
											if (local506 == -1) {
												break;
											}
											if (local53[local506] != 0) {
												local49[local506] += local385;
												local57[local506] += local390;
												local61[local506] += local395;
												local53[local506] += local400;
											}
										}
										if (this.aClass112_4 == null && this.aClass112_3 != null) {
											this.aClass112_3.anInterface1_4 = null;
										}
										if (this.aClass112_4 != null) {
											this.aClass112_4.anInterface1_4 = null;
										}
										if (local8.aClass112_4 == null && local8.aClass112_3 != null) {
											local8.aClass112_3.anInterface1_4 = null;
										}
										if (local8.aClass112_4 != null) {
											local8.aClass112_4.anInterface1_4 = null;
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

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIISB)I")
	private int method2625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) short arg2, @OriginalArg(4) byte arg3) {
		@Pc(12) int local12 = Static393.anIntArray638[Static466.method6957(arg1, arg0)];
		if (arg2 != -1) {
			@Pc(25) Class238 local25 = this.aClass5_Sub1_12.anInterface4_14.method6712(arg2 & 0xFFFF);
			@Pc(30) int local30 = local25.aByte67 & 0xFF;
			@Pc(43) int local43;
			@Pc(63) int local63;
			if (local30 != 0) {
				if (arg1 < 0) {
					local43 = 0;
				} else if (arg1 <= 127) {
					local43 = arg1 * 131586;
				} else {
					local43 = 16777215;
				}
				if (local30 == 256) {
					local12 = local43;
				} else {
					local63 = 256 - local30;
					local12 = ((local43 & 0xFF00FF) * local30 + local63 * (local12 & 0xFF00FF) & 0xFF00FF00) + ((local43 & 0xFF00) * local30 + ((local12 & 0xFF00) * local63) & 0xFF0000) >> 8;
				}
			}
			local43 = local25.aByte71 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(119) int local119 = (local12 >> 16 & 0xFF) * local43;
				if (local119 > 65535) {
					local119 = 65535;
				}
				local63 = local43 * (local12 >> 8 & 0xFF);
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(145) int local145 = (local12 & 0xFF) * local43;
				if (local145 > 65535) {
					local145 = 65535;
				}
				local12 = (local145 >> 8) + (local63 & 0xFF00) + ((local119 & 0x6400FF00) << 8);
			}
		}
		return (local12 << 8) - ((arg3 & 0xFF) - 255);
	}

	@OriginalMember(owner = "client!gca", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		if (this.aClass112_3 != null) {
			this.aClass112_3.anInterface1_4 = null;
		}
		this.aShort58 = (short) arg0;
	}

	@OriginalMember(owner = "client!gca", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort58;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!q;Lclient!sda;II)V")
	@Override
	public void method5772(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class4_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3094 == 0) {
			return;
		}
		@Pc(13) Class205_Sub3 local13 = this.aClass5_Sub1_12.aClass205_Sub3_4;
		if (!this.aBoolean222) {
			this.method2626();
		}
		@Pc(22) Class205_Sub3 local22 = (Class205_Sub3) arg0;
		Static223.aFloat154 = local13.aFloat276 * local22.aFloat272 + local22.aFloat271 * local13.aFloat275 + local13.aFloat278 * local22.aFloat279 + local13.aFloat272;
		Static528.aFloat265 = local22.aFloat274 * local13.aFloat278 + local13.aFloat275 * local22.aFloat280 + local13.aFloat276 * local22.aFloat275;
		@Pc(69) float local69 = Static528.aFloat265 * (float) this.aShort52 + Static223.aFloat154;
		@Pc(77) float local77 = Static223.aFloat154 + Static528.aFloat265 * (float) this.aShort50;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = (float) this.aShort57 + local69;
			local94 = (float) -this.aShort57 + local77;
		} else {
			local94 = (float) -this.aShort57 + local69;
			local87 = local77 + (float) this.aShort57;
		}
		if (this.aClass5_Sub1_12.aFloat21 <= local94 || (float) this.aClass5_Sub1_12.anInt406 >= local87) {
			return;
		}
		Static480.aFloat253 = local22.aFloat275 * local13.aFloat281 + local22.aFloat274 * local13.aFloat273 + local13.aFloat274 * local22.aFloat280;
		Static121.aFloat79 = local13.aFloat279 + local22.aFloat279 * local13.aFloat273 + local22.aFloat271 * local13.aFloat274 + local22.aFloat272 * local13.aFloat281;
		@Pc(171) float local171 = Static121.aFloat79 + (float) this.aShort52 * Static480.aFloat253;
		@Pc(179) float local179 = Static121.aFloat79 + (float) this.aShort50 * Static480.aFloat253;
		@Pc(206) float local206;
		@Pc(194) float local194;
		if (local179 < local171) {
			local194 = (float) this.aClass5_Sub1_12.anInt384 * ((float) this.aShort57 + local171);
			local206 = (float) this.aClass5_Sub1_12.anInt384 * ((float) -this.aShort57 + local179);
		} else {
			local206 = (local171 - (float) this.aShort57) * (float) this.aClass5_Sub1_12.anInt384;
			local194 = (local179 + (float) this.aShort57) * (float) this.aClass5_Sub1_12.anInt384;
		}
		if (local206 / (float) arg2 >= this.aClass5_Sub1_12.aFloat9 || local194 / (float) arg2 <= this.aClass5_Sub1_12.aFloat13) {
			return;
		}
		Static204.aFloat202 = local13.aFloat270 * local22.aFloat274 + local13.aFloat280 * local22.aFloat280 + local13.aFloat277 * local22.aFloat275;
		Static388.aFloat249 = local13.aFloat280 * local22.aFloat271 + local13.aFloat270 * local22.aFloat279 + local13.aFloat277 * local22.aFloat272 + local13.aFloat271;
		@Pc(297) float local297 = Static388.aFloat249 + (float) this.aShort52 * Static204.aFloat202;
		@Pc(305) float local305 = Static388.aFloat249 + (float) this.aShort50 * Static204.aFloat202;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local297 > local305) {
			local320 = (float) this.aClass5_Sub1_12.anInt416 * (local305 - (float) this.aShort57);
			local331 = (float) this.aClass5_Sub1_12.anInt416 * ((float) this.aShort57 + local297);
		} else {
			local331 = (float) this.aClass5_Sub1_12.anInt416 * ((float) this.aShort57 + local305);
			local320 = (local297 - (float) this.aShort57) * (float) this.aClass5_Sub1_12.anInt416;
		}
		if (local320 / (float) arg2 >= this.aClass5_Sub1_12.aFloat20 || this.aClass5_Sub1_12.aFloat28 >= local331 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass61Array1 != null) {
			Static122.aFloat83 = local13.aFloat281 * local22.aFloat278 + local22.aFloat273 * local13.aFloat273 + local13.aFloat274 * local22.aFloat270;
			Static21.aFloat33 = local13.aFloat276 * local22.aFloat276 + local13.aFloat275 * local22.aFloat277 + local13.aFloat278 * local22.aFloat281;
			Static96.aFloat70 = local13.aFloat274 * local22.aFloat277 + local13.aFloat273 * local22.aFloat281 + local13.aFloat281 * local22.aFloat276;
			Static268.aFloat168 = local22.aFloat276 * local13.aFloat277 + local22.aFloat281 * local13.aFloat270 + local13.aFloat280 * local22.aFloat277;
			Static403.aFloat212 = local22.aFloat273 * local13.aFloat278 + local22.aFloat270 * local13.aFloat275 + local13.aFloat276 * local22.aFloat278;
			Static528.aFloat266 = local22.aFloat278 * local13.aFloat277 + local13.aFloat270 * local22.aFloat273 + local13.aFloat280 * local22.aFloat270;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.aShort53 + this.aShort55 >> 1;
			@Pc(506) int local506 = this.aShort54 + this.aShort56 >> 1;
			@Pc(525) int local525 = (int) (Static480.aFloat253 * (float) this.aShort52 + Static121.aFloat79 + (float) local498 * Static122.aFloat83 + Static96.aFloat70 * (float) local506);
			@Pc(544) int local544 = (int) ((float) local506 * Static268.aFloat168 + Static204.aFloat202 * (float) this.aShort52 + (float) local498 * Static528.aFloat266 + Static388.aFloat249);
			@Pc(563) int local563 = (int) (Static528.aFloat265 * (float) this.aShort52 + Static403.aFloat212 * (float) local498 + Static223.aFloat154 + Static21.aFloat33 * (float) local506);
			@Pc(582) int local582 = (int) ((float) local506 * Static96.aFloat70 + (float) this.aShort50 * Static480.aFloat253 + Static121.aFloat79 + (float) local498 * Static122.aFloat83);
			@Pc(601) int local601 = (int) ((float) this.aShort50 * Static204.aFloat202 + Static388.aFloat249 + (float) local498 * Static528.aFloat266 + (float) local506 * Static268.aFloat168);
			arg1.anInt8051 = this.aClass5_Sub1_12.anInt407 + this.aClass5_Sub1_12.anInt416 * local601 / arg2;
			arg1.anInt8050 = this.aClass5_Sub1_12.anInt416 * local544 / arg2 + this.aClass5_Sub1_12.anInt407;
			arg1.anInt8049 = local525 * this.aClass5_Sub1_12.anInt384 / arg2 + this.aClass5_Sub1_12.anInt411;
			arg1.anInt8047 = this.aClass5_Sub1_12.anInt411 + this.aClass5_Sub1_12.anInt384 * local582 / arg2;
			@Pc(673) int local673 = (int) (Static528.aFloat265 * (float) this.aShort50 + Static223.aFloat154 + (float) local498 * Static403.aFloat212 + (float) local506 * Static21.aFloat33);
			if (local563 < this.aClass5_Sub1_12.anInt406 && local673 < this.aClass5_Sub1_12.anInt406) {
				arg1.anInt8048 = this.aClass5_Sub1_12.anInt384 * (this.aShort57 + local525) / arg2 + this.aClass5_Sub1_12.anInt411 - arg1.anInt8049;
				arg1.aBoolean573 = true;
			}
		}
		this.aClass5_Sub1_12.method432((float) arg2);
		this.aClass5_Sub1_12.method393();
		this.aClass5_Sub1_12.method456(local22);
		this.method2628();
		this.aClass5_Sub1_12.method390();
		this.method2637();
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
	private void method2626() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt3105; local23++) {
			@Pc(30) int local30 = this.anIntArray356[local23];
			@Pc(35) int local35 = this.anIntArray357[local23];
			if (local35 < local9) {
				local9 = local35;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			@Pc(68) int local68 = this.anIntArray355[local23];
			if (local17 < local68) {
				local17 = local68;
			}
			if (local11 > local68) {
				local11 = local68;
			}
			@Pc(90) int local90 = local30 * local30 + local68 * local68;
			if (local19 < local90) {
				local19 = local90;
			}
			local90 = local68 * local68 + local30 * local30 + local35 * local35;
			if (local21 < local90) {
				local21 = local90;
			}
		}
		this.aShort52 = (short) local9;
		this.aShort54 = (short) local11;
		this.aShort50 = (short) local15;
		this.aShort53 = (short) local7;
		this.aShort56 = (short) local17;
		this.aShort55 = (short) local13;
		this.aShort57 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean222 = true;
	}

	@OriginalMember(owner = "client!gca", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort51;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!gca;ZLclient!gca;IZ)Lclient!ba;")
	private Class2 method2627(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		arg0.aByte33 = 0;
		arg0.anInt3116 = arg3;
		arg0.anInt3079 = this.anInt3079;
		arg0.anInt3112 = this.anInt3112;
		arg0.anInt3096 = this.anInt3096;
		arg0.anInt3111 = this.anInt3111;
		arg0.aShort51 = this.aShort51;
		arg0.anInt3105 = this.anInt3105;
		arg0.aShort58 = this.aShort58;
		arg0.anInt3094 = this.anInt3094;
		arg0.anInt3118 = this.anInt3118;
		@Pc(61) boolean local61 = Static85.method1757(arg3, this.anInt3118);
		@Pc(67) boolean local67 = Static185.method3503(arg3, this.anInt3118);
		@Pc(73) boolean local73 = Static253.method4324(arg3, this.anInt3118);
		@Pc(79) boolean local79 = local73 | local61 | local67;
		@Pc(198) int local198;
		if (local79) {
			if (!local61) {
				arg0.anIntArray356 = this.anIntArray356;
			} else if (arg2.anIntArray356 == null || arg2.anIntArray356.length < this.anInt3096) {
				arg0.anIntArray356 = arg2.anIntArray356 = new int[this.anInt3096];
			} else {
				arg0.anIntArray356 = arg2.anIntArray356;
			}
			if (!local67) {
				arg0.anIntArray357 = this.anIntArray357;
			} else if (arg2.anIntArray357 == null || this.anInt3096 > arg2.anIntArray357.length) {
				arg0.anIntArray357 = arg2.anIntArray357 = new int[this.anInt3096];
			} else {
				arg0.anIntArray357 = arg2.anIntArray357;
			}
			if (!local73) {
				arg0.anIntArray355 = this.anIntArray355;
			} else if (arg2.anIntArray355 == null || arg2.anIntArray355.length < this.anInt3096) {
				arg0.anIntArray355 = arg2.anIntArray355 = new int[this.anInt3096];
			} else {
				arg0.anIntArray355 = arg2.anIntArray355;
			}
			for (local198 = 0; local198 < this.anInt3096; local198++) {
				if (local61) {
					arg0.anIntArray356[local198] = this.anIntArray356[local198];
				}
				if (local67) {
					arg0.anIntArray357[local198] = this.anIntArray357[local198];
				}
				if (local73) {
					arg0.anIntArray355[local198] = this.anIntArray355[local198];
				}
			}
		} else {
			arg0.anIntArray356 = this.anIntArray356;
			arg0.anIntArray355 = this.anIntArray355;
			arg0.anIntArray357 = this.anIntArray357;
		}
		if (Static372.method5860(arg3, this.anInt3118)) {
			if (arg1) {
				arg0.aByte33 = (byte) (arg0.aByte33 | 0x1);
			}
			arg0.aClass112_5 = arg2.aClass112_5;
			arg0.aClass112_5.anInterface1_4 = this.aClass112_5.anInterface1_4;
			arg0.aClass112_5.aByte37 = this.aClass112_5.aByte37;
		} else if (Static438.method6624(this.anInt3118, arg3)) {
			arg0.aClass112_5 = this.aClass112_5;
		} else {
			arg0.aClass112_5 = null;
		}
		if (Static225.method4080(arg3, this.anInt3118)) {
			if (arg2.aShortArray68 == null || this.anInt3079 > arg2.aShortArray68.length) {
				arg0.aShortArray68 = arg2.aShortArray68 = new short[this.anInt3079];
			} else {
				arg0.aShortArray68 = arg2.aShortArray68;
			}
			for (local198 = 0; local198 < this.anInt3079; local198++) {
				arg0.aShortArray68[local198] = this.aShortArray68[local198];
			}
		} else {
			arg0.aShortArray68 = this.aShortArray68;
		}
		if (Static268.method4692(this.anInt3118, arg3)) {
			if (arg2.aByteArray42 == null || this.anInt3079 > arg2.aByteArray42.length) {
				arg0.aByteArray42 = arg2.aByteArray42 = new byte[this.anInt3079];
			} else {
				arg0.aByteArray42 = arg2.aByteArray42;
			}
			for (local198 = 0; local198 < this.anInt3079; local198++) {
				arg0.aByteArray42[local198] = this.aByteArray42[local198];
			}
		} else {
			arg0.aByteArray42 = this.aByteArray42;
		}
		if (Static318.method4379(this.anInt3118, arg3)) {
			arg0.aClass112_3 = arg2.aClass112_3;
			if (arg1) {
				arg0.aByte33 = (byte) (arg0.aByte33 | 0x2);
			}
			arg0.aClass112_3.aByte37 = this.aClass112_3.aByte37;
			arg0.aClass112_3.anInterface1_4 = this.aClass112_3.anInterface1_4;
		} else if (Static504.method7750(arg3, this.anInt3118)) {
			arg0.aClass112_3 = this.aClass112_3;
		} else {
			arg0.aClass112_3 = null;
		}
		@Pc(594) int local594;
		if (Static191.method3679(arg3, this.anInt3118)) {
			if (arg2.aShortArray67 == null || this.anInt3094 > arg2.aShortArray67.length) {
				local198 = this.anInt3094;
				arg0.aShortArray67 = arg2.aShortArray67 = new short[local198];
				arg0.aShortArray72 = arg2.aShortArray72 = new short[local198];
				arg0.aShortArray76 = arg2.aShortArray76 = new short[local198];
			} else {
				arg0.aShortArray76 = arg2.aShortArray76;
				arg0.aShortArray72 = arg2.aShortArray72;
				arg0.aShortArray67 = arg2.aShortArray67;
			}
			if (this.aClass200_1 == null) {
				for (local198 = 0; local198 < this.anInt3094; local198++) {
					arg0.aShortArray67[local198] = this.aShortArray67[local198];
					arg0.aShortArray76[local198] = this.aShortArray76[local198];
					arg0.aShortArray72[local198] = this.aShortArray72[local198];
				}
			} else {
				if (arg2.aClass200_1 == null) {
					arg2.aClass200_1 = new Class200();
				}
				@Pc(578) Class200 local578 = arg0.aClass200_1 = arg2.aClass200_1;
				if (local578.aShortArray123 == null || local578.aShortArray123.length < this.anInt3094) {
					local594 = this.anInt3094;
					local578.aShortArray122 = new short[local594];
					local578.aByteArray61 = new byte[local594];
					local578.aShortArray123 = new short[local594];
					local578.aShortArray121 = new short[local594];
				}
				for (local594 = 0; local594 < this.anInt3094; local594++) {
					arg0.aShortArray67[local594] = this.aShortArray67[local594];
					arg0.aShortArray76[local594] = this.aShortArray76[local594];
					arg0.aShortArray72[local594] = this.aShortArray72[local594];
					local578.aShortArray123[local594] = this.aClass200_1.aShortArray123[local594];
					local578.aShortArray121[local594] = this.aClass200_1.aShortArray121[local594];
					local578.aShortArray122[local594] = this.aClass200_1.aShortArray122[local594];
					local578.aByteArray61[local594] = this.aClass200_1.aByteArray61[local594];
				}
			}
			arg0.aByteArray41 = this.aByteArray41;
		} else {
			arg0.aByteArray41 = this.aByteArray41;
			arg0.aClass200_1 = this.aClass200_1;
			arg0.aShortArray72 = this.aShortArray72;
			arg0.aShortArray67 = this.aShortArray67;
			arg0.aShortArray76 = this.aShortArray76;
		}
		if (Static315.method5106(arg3, this.anInt3118)) {
			arg0.aClass112_4 = arg2.aClass112_4;
			if (arg1) {
				arg0.aByte33 = (byte) (arg0.aByte33 | 0x4);
			}
			arg0.aClass112_4.aByte37 = this.aClass112_4.aByte37;
			arg0.aClass112_4.anInterface1_4 = this.aClass112_4.anInterface1_4;
		} else if (Static190.method3577(arg3, this.anInt3118)) {
			arg0.aClass112_4 = this.aClass112_4;
		} else {
			arg0.aClass112_4 = null;
		}
		if (Static29.method808(this.anInt3118, arg3)) {
			if (arg2.aFloatArray13 == null || this.anInt3079 > arg2.aFloatArray13.length) {
				local198 = this.anInt3094;
				arg0.aFloatArray12 = arg2.aFloatArray12 = new float[local198];
				arg0.aFloatArray13 = arg2.aFloatArray13 = new float[local198];
			} else {
				arg0.aFloatArray12 = arg2.aFloatArray12;
				arg0.aFloatArray13 = arg2.aFloatArray13;
			}
			for (local198 = 0; local198 < this.anInt3094; local198++) {
				arg0.aFloatArray13[local198] = this.aFloatArray13[local198];
				arg0.aFloatArray12[local198] = this.aFloatArray12[local198];
			}
		} else {
			arg0.aFloatArray13 = this.aFloatArray13;
			arg0.aFloatArray12 = this.aFloatArray12;
		}
		if (Static132.method2303(this.anInt3118, arg3)) {
			if (arg1) {
				arg0.aByte33 = (byte) (arg0.aByte33 | 0x8);
			}
			arg0.aClass112_6 = arg2.aClass112_6;
			arg0.aClass112_6.anInterface1_4 = this.aClass112_6.anInterface1_4;
			arg0.aClass112_6.aByte37 = this.aClass112_6.aByte37;
		} else if (Static310.method5038(this.anInt3118, arg3)) {
			arg0.aClass112_6 = this.aClass112_6;
		} else {
			arg0.aClass112_6 = null;
		}
		if (Static365.method5730(this.anInt3118, arg3)) {
			if (arg2.aShortArray74 == null || arg2.aShortArray74.length < this.anInt3079) {
				local198 = this.anInt3079;
				arg0.aShortArray69 = arg2.aShortArray69 = new short[local198];
				arg0.aShortArray74 = arg2.aShortArray74 = new short[local198];
				arg0.aShortArray75 = arg2.aShortArray75 = new short[local198];
			} else {
				arg0.aShortArray69 = arg2.aShortArray69;
				arg0.aShortArray74 = arg2.aShortArray74;
				arg0.aShortArray75 = arg2.aShortArray75;
			}
			for (local198 = 0; local198 < this.anInt3079; local198++) {
				arg0.aShortArray74[local198] = this.aShortArray74[local198];
				arg0.aShortArray75[local198] = this.aShortArray75[local198];
				arg0.aShortArray69[local198] = this.aShortArray69[local198];
			}
		} else {
			arg0.aShortArray75 = this.aShortArray75;
			arg0.aShortArray69 = this.aShortArray69;
			arg0.aShortArray74 = this.aShortArray74;
		}
		if (Static382.method5920(this.anInt3118, arg3)) {
			if (arg1) {
				arg0.aByte33 = (byte) (arg0.aByte33 | 0x10);
			}
			arg0.aClass34_1 = arg2.aClass34_1;
			arg0.aClass34_1.anInterface10_2 = this.aClass34_1.anInterface10_2;
		} else if (Static465.method6933(this.anInt3118, arg3)) {
			arg0.aClass34_1 = this.aClass34_1;
		} else {
			arg0.aClass34_1 = null;
		}
		if (Static228.method4098(arg3, this.anInt3118)) {
			if (arg2.aShortArray71 == null || this.anInt3079 > arg2.aShortArray71.length) {
				local198 = this.anInt3079;
				arg0.aShortArray71 = arg2.aShortArray71 = new short[local198];
			} else {
				arg0.aShortArray71 = arg2.aShortArray71;
			}
			for (local198 = 0; local198 < this.anInt3079; local198++) {
				arg0.aShortArray71[local198] = this.aShortArray71[local198];
			}
		} else {
			arg0.aShortArray71 = this.aShortArray71;
		}
		if (!Static231.method4111(this.anInt3118, arg3)) {
			arg0.aClass36Array1 = this.aClass36Array1;
		} else if (arg2.aClass36Array1 == null || this.anInt3111 > arg2.aClass36Array1.length) {
			local198 = this.anInt3111;
			arg0.aClass36Array1 = arg2.aClass36Array1 = new Class36[local198];
			for (local594 = 0; local594 < this.anInt3111; local594++) {
				arg0.aClass36Array1[local594] = this.aClass36Array1[local594].method952();
			}
		} else {
			arg0.aClass36Array1 = arg2.aClass36Array1;
			for (local198 = 0; local198 < this.anInt3111; local198++) {
				arg0.aClass36Array1[local198].method954(this.aClass36Array1[local198]);
			}
		}
		arg0.anIntArrayArray37 = this.anIntArrayArray37;
		if (this.aBoolean222) {
			arg0.aShort55 = this.aShort55;
			arg0.aShort53 = this.aShort53;
			arg0.aShort50 = this.aShort50;
			arg0.aShort54 = this.aShort54;
			arg0.aBoolean222 = true;
			arg0.aShort56 = this.aShort56;
			arg0.aShort57 = this.aShort57;
			arg0.aShort52 = this.aShort52;
		} else {
			arg0.aBoolean222 = false;
		}
		arg0.anIntArray354 = this.anIntArray354;
		arg0.aShortArray77 = this.aShortArray77;
		arg0.aClass61Array1 = this.aClass61Array1;
		arg0.aClass109Array3 = this.aClass109Array3;
		arg0.aClass83Array3 = this.aClass83Array3;
		arg0.aShortArray70 = this.aShortArray70;
		arg0.anIntArrayArray38 = this.anIntArrayArray38;
		arg0.anIntArrayArray39 = this.anIntArrayArray39;
		arg0.anIntArray353 = this.anIntArray353;
		arg0.aShortArray73 = this.aShortArray73;
		return arg0;
	}

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3105; local3++) {
			if (arg0 != 128) {
				this.anIntArray356[local3] = this.anIntArray356[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray357[local3] = arg1 * this.anIntArray357[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray355[local3] = this.anIntArray355[local3] * arg2 >> 7;
			}
		}
		this.aBoolean222 = false;
		if (this.aClass112_5 != null) {
			this.aClass112_5.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)V")
	private void method2628() {
		if (this.anInt3112 == 0) {
			return;
		}
		if (this.aByte33 != 0) {
			this.method2634(true);
		}
		this.method2634(false);
		if (this.aClass34_1 != null) {
			if (this.aClass34_1.anInterface10_2 == null) {
				this.method2633((this.aByte33 & 0x10) != 0);
			}
			if (this.aClass34_1.anInterface10_2 != null) {
				this.aClass5_Sub1_12.method454(this.aClass112_4 != null);
				this.aClass5_Sub1_12.method383(this.aClass112_5, this.aClass112_4, this.aClass112_3, this.aClass112_6);
				@Pc(81) int local81 = this.anIntArray354.length - 1;
				for (@Pc(83) int local83 = 0; local83 < local81; local83++) {
					@Pc(90) int local90 = this.anIntArray354[local83];
					@Pc(97) int local97 = this.anIntArray354[local83 + 1];
					@Pc(104) int local104 = this.aShortArray71[local90] & 0xFFFF;
					if (local104 == 65535) {
						local104 = -1;
					}
					this.aClass5_Sub1_12.method379(local104, this.aClass112_4 != null);
					this.aClass5_Sub1_12.method391(local90 * 3, (local97 - local90) * 3, this.aClass34_1.anInterface10_2);
				}
			}
		}
		this.method2624();
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method5770(@OriginalArg(0) Class205 arg0) {
		@Pc(8) Class205_Sub3 local8 = (Class205_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass83Array3 != null) {
			for (local13 = 0; local13 < this.aClass83Array3.length; local13++) {
				@Pc(20) Class83 local20 = this.aClass83Array3[local13];
				@Pc(22) Class83 local22 = local20;
				if (local20.aClass83_1 != null) {
					local22 = local20.aClass83_1;
				}
				local22.anInt2691 = (int) (local8.aFloat279 + (float) this.anIntArray356[local20.anInt2680] * local8.aFloat273 + (float) this.anIntArray357[local20.anInt2680] * local8.aFloat274 + (float) this.anIntArray355[local20.anInt2680] * local8.aFloat281);
				local22.anInt2684 = (int) ((float) this.anIntArray355[local20.anInt2680] * local8.aFloat277 + (float) this.anIntArray357[local20.anInt2680] * local8.aFloat280 + local8.aFloat270 * (float) this.anIntArray356[local20.anInt2680] + local8.aFloat271);
				local22.anInt2682 = (int) (local8.aFloat272 + local8.aFloat275 * (float) this.anIntArray357[local20.anInt2680] + (float) this.anIntArray356[local20.anInt2680] * local8.aFloat278 + (float) this.anIntArray355[local20.anInt2680] * local8.aFloat276);
				local22.anInt2686 = (int) (local8.aFloat279 + (float) this.anIntArray355[local20.anInt2681] * local8.aFloat281 + (float) this.anIntArray357[local20.anInt2681] * local8.aFloat274 + local8.aFloat273 * (float) this.anIntArray356[local20.anInt2681]);
				local22.anInt2690 = (int) (local8.aFloat271 + (float) this.anIntArray357[local20.anInt2681] * local8.aFloat280 + (float) this.anIntArray356[local20.anInt2681] * local8.aFloat270 + local8.aFloat277 * (float) this.anIntArray355[local20.anInt2681]);
				local22.anInt2683 = (int) (local8.aFloat272 + local8.aFloat276 * (float) this.anIntArray355[local20.anInt2681] + local8.aFloat275 * (float) this.anIntArray357[local20.anInt2681] + local8.aFloat278 * (float) this.anIntArray356[local20.anInt2681]);
				local22.anInt2689 = (int) ((float) this.anIntArray355[local20.anInt2687] * local8.aFloat281 + (float) this.anIntArray356[local20.anInt2687] * local8.aFloat273 + (float) this.anIntArray357[local20.anInt2687] * local8.aFloat274 + local8.aFloat279);
				local22.anInt2676 = (int) (local8.aFloat277 * (float) this.anIntArray355[local20.anInt2687] + local8.aFloat280 * (float) this.anIntArray357[local20.anInt2687] + local8.aFloat270 * (float) this.anIntArray356[local20.anInt2687] + local8.aFloat271);
				local22.anInt2677 = (int) (local8.aFloat275 * (float) this.anIntArray357[local20.anInt2687] + local8.aFloat278 * (float) this.anIntArray356[local20.anInt2687] + local8.aFloat276 * (float) this.anIntArray355[local20.anInt2687] + local8.aFloat272);
			}
		}
		if (this.aClass109Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass109Array3.length; local13++) {
			@Pc(361) Class109 local361 = this.aClass109Array3[local13];
			@Pc(363) Class109 local363 = local361;
			if (local361.aClass109_1 != null) {
				local363 = local361.aClass109_1;
			}
			if (local361.aClass205_4 == null) {
				local361.aClass205_4 = local8.method7801();
			} else {
				local361.aClass205_4.la(local8);
			}
			local363.anInt3778 = (int) (local8.aFloat273 * (float) this.anIntArray356[local361.anInt3776] + (float) this.anIntArray357[local361.anInt3776] * local8.aFloat274 + (float) this.anIntArray355[local361.anInt3776] * local8.aFloat281 + local8.aFloat279);
			local363.anInt3780 = (int) ((float) this.anIntArray355[local361.anInt3776] * local8.aFloat277 + local8.aFloat280 * (float) this.anIntArray357[local361.anInt3776] + local8.aFloat270 * (float) this.anIntArray356[local361.anInt3776] + local8.aFloat271);
			local363.anInt3779 = (int) (local8.aFloat272 + (float) this.anIntArray357[local361.anInt3776] * local8.aFloat275 + (float) this.anIntArray356[local361.anInt3776] * local8.aFloat278 + (float) this.anIntArray355[local361.anInt3776] * local8.aFloat276);
		}
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "()V")
	@Override
	public void method5785() {
		if (this.anInt3094 <= 0 || this.anInt3112 <= 0) {
			return;
		}
		this.method2634(false);
		if ((this.aByte33 & 0x10) == 0 && this.aClass34_1.anInterface10_2 == null) {
			this.method2633(false);
		}
		this.method2624();
	}

	@OriginalMember(owner = "client!gca", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray39 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt3096; local12++) {
			this.anIntArray356[local12] <<= 0x4;
			this.anIntArray357[local12] <<= 0x4;
			this.anIntArray355[local12] <<= 0x4;
		}
		Static106.anInt2362 = 0;
		Static244.anInt5027 = 0;
		Static66.anInt1451 = 0;
		return true;
	}

	@OriginalMember(owner = "client!gca", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean222) {
			this.method2626();
		}
		return this.aShort56;
	}

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt3116;
	}

	@OriginalMember(owner = "client!gca", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		this.anInt3116 = arg0;
		this.aBoolean223 = true;
		if (this.aClass200_1 != null && (this.anInt3116 & 0x10000) == 0) {
			this.aByteArray41 = this.aClass200_1.aByteArray61;
			this.aShortArray67 = this.aClass200_1.aShortArray123;
			this.aShortArray76 = this.aClass200_1.aShortArray121;
			this.aShortArray72 = this.aClass200_1.aShortArray122;
			this.aClass200_1 = null;
		}
		this.method2624();
	}

	@OriginalMember(owner = "client!gca", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static106.anInt2362 = 0;
			local14 = 0;
			Static66.anInt1451 = 0;
			Static244.anInt5027 = 0;
			for (local20 = 0; local20 < this.anInt3105; local20++) {
				Static244.anInt5027 += this.anIntArray356[local20];
				Static66.anInt1451 += this.anIntArray357[local20];
				local14++;
				Static106.anInt2362 += this.anIntArray355[local20];
			}
			if (local14 > 0) {
				Static106.anInt2362 = arg3 + Static106.anInt2362 / local14;
				Static244.anInt5027 = arg1 + Static244.anInt5027 / local14;
				Static66.anInt1451 = arg2 + Static66.anInt1451 / local14;
			} else {
				Static66.anInt1451 = arg2;
				Static244.anInt5027 = arg1;
				Static106.anInt2362 = arg3;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt3105; local14++) {
				this.anIntArray356[local14] += arg1;
				this.anIntArray357[local14] += arg2;
				this.anIntArray355[local14] += arg3;
			}
		} else {
			@Pc(162) int local162;
			@Pc(180) int local180;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt3105; local14++) {
					this.anIntArray356[local14] -= Static244.anInt5027;
					this.anIntArray357[local14] -= Static66.anInt1451;
					this.anIntArray355[local14] -= Static106.anInt2362;
					if (arg3 != 0) {
						local20 = Class5.anIntArray761[arg3];
						local162 = Class5.anIntArray760[arg3];
						local180 = this.anIntArray356[local14] * local162 + this.anIntArray357[local14] * local20 + 16383 >> 14;
						this.anIntArray357[local14] = this.anIntArray357[local14] * local162 + 16383 - this.anIntArray356[local14] * local20 >> 14;
						this.anIntArray356[local14] = local180;
					}
					if (arg1 != 0) {
						local20 = Class5.anIntArray761[arg1];
						local162 = Class5.anIntArray760[arg1];
						local180 = local162 * this.anIntArray357[local14] + 16383 - local20 * this.anIntArray355[local14] >> 14;
						this.anIntArray355[local14] = local162 * this.anIntArray355[local14] + local20 * this.anIntArray357[local14] + 16383 >> 14;
						this.anIntArray357[local14] = local180;
					}
					if (arg2 != 0) {
						local20 = Class5.anIntArray761[arg2];
						local162 = Class5.anIntArray760[arg2];
						local180 = this.anIntArray355[local14] * local20 + this.anIntArray356[local14] * local162 + 16383 >> 14;
						this.anIntArray355[local14] = this.anIntArray355[local14] * local162 + 16383 - local20 * this.anIntArray356[local14] >> 14;
						this.anIntArray356[local14] = local180;
					}
					this.anIntArray356[local14] += Static244.anInt5027;
					this.anIntArray357[local14] += Static66.anInt1451;
					this.anIntArray355[local14] += Static106.anInt2362;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt3105; local14++) {
					this.anIntArray356[local14] -= Static244.anInt5027;
					this.anIntArray357[local14] -= Static66.anInt1451;
					this.anIntArray355[local14] -= Static106.anInt2362;
					this.anIntArray356[local14] = arg1 * this.anIntArray356[local14] / 128;
					this.anIntArray357[local14] = arg2 * this.anIntArray357[local14] / 128;
					this.anIntArray355[local14] = arg3 * this.anIntArray355[local14] / 128;
					this.anIntArray356[local14] += Static244.anInt5027;
					this.anIntArray357[local14] += Static66.anInt1451;
					this.anIntArray355[local14] += Static106.anInt2362;
				}
			} else {
				@Pc(521) Class61 local521;
				@Pc(526) Class36 local526;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt3079; local14++) {
						local20 = (this.aByteArray42[local14] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray42[local14] = (byte) local20;
					}
					if (this.aClass112_3 != null) {
						this.aClass112_3.anInterface1_4 = null;
					}
					if (this.aClass61Array1 != null) {
						for (local20 = 0; local20 < this.anInt3111; local20++) {
							local521 = this.aClass61Array1[local20];
							local526 = this.aClass36Array1[local20];
							local526.anInt1008 = 255 - (this.aByteArray42[local521.anInt1868] & 0xFF) << 24 | local526.anInt1008 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt3079; local14++) {
						local20 = this.aShortArray68[local14] & 0xFFFF;
						local162 = local20 >> 10 & 0x3F;
						local180 = local20 >> 7 & 0x7;
						local180 += arg2 / 4;
						@Pc(595) int local595 = local162 + arg1 & 0x3F;
						@Pc(599) int local599 = local20 & 0x7F;
						local599 += arg3;
						if (local180 < 0) {
							local180 = 0;
						} else if (local180 > 7) {
							local180 = 7;
						}
						if (local599 < 0) {
							local599 = 0;
						} else if (local599 > 127) {
							local599 = 127;
						}
						this.aShortArray68[local14] = (short) (local595 << 10 | local180 << 7 | local599);
					}
					if (this.aClass112_3 != null) {
						this.aClass112_3.anInterface1_4 = null;
					}
					if (this.aClass61Array1 != null) {
						for (local20 = 0; local20 < this.anInt3111; local20++) {
							local521 = this.aClass61Array1[local20];
							local526 = this.aClass36Array1[local20];
							local526.anInt1008 = Static393.anIntArray638[this.aShortArray68[local521.anInt1868] & 0xFFFF] & 0xFFFFFF | local526.anInt1008 & 0xFF000000;
						}
					}
				} else {
					@Pc(707) Class36 local707;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt3111; local14++) {
							local707 = this.aClass36Array1[local14];
							local707.anInt1010 += arg2;
							local707.anInt1009 += arg1;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt3111; local14++) {
							local707 = this.aClass36Array1[local14];
							local707.anInt1011 = arg1 * local707.anInt1011 >> 7;
							local707.anInt1007 = arg2 * local707.anInt1007 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt3111; local14++) {
							local707 = this.aClass36Array1[local14];
							local707.anInt1012 = local707.anInt1012 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean222) {
			this.method2626();
		}
		return this.aShort52;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!q;Lclient!sda;I)V")
	@Override
	public void method5774(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class4_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3094 == 0) {
			return;
		}
		@Pc(13) Class205_Sub3 local13 = this.aClass5_Sub1_12.aClass205_Sub3_4;
		@Pc(16) Class205_Sub3 local16 = (Class205_Sub3) arg0;
		if (!this.aBoolean222) {
			this.method2626();
		}
		Static528.aFloat265 = local13.aFloat276 * local16.aFloat275 + local13.aFloat275 * local16.aFloat280 + local16.aFloat274 * local13.aFloat278;
		Static223.aFloat154 = local13.aFloat276 * local16.aFloat272 + local16.aFloat271 * local13.aFloat275 + local13.aFloat278 * local16.aFloat279 + local13.aFloat272;
		@Pc(69) float local69 = (float) this.aShort52 * Static528.aFloat265 + Static223.aFloat154;
		@Pc(77) float local77 = Static528.aFloat265 * (float) this.aShort50 + Static223.aFloat154;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = (float) this.aShort57 + local69;
			local93 = local77 - (float) this.aShort57;
		} else {
			local87 = local77 + (float) this.aShort57;
			local93 = local69 - (float) this.aShort57;
		}
		if (local93 >= this.aClass5_Sub1_12.aFloat25 || (float) this.aClass5_Sub1_12.anInt406 >= local87) {
			return;
		}
		Static480.aFloat253 = local16.aFloat280 * local13.aFloat274 + local16.aFloat274 * local13.aFloat273 + local13.aFloat281 * local16.aFloat275;
		Static121.aFloat79 = local13.aFloat279 + local13.aFloat273 * local16.aFloat279 + local16.aFloat271 * local13.aFloat274 + local16.aFloat272 * local13.aFloat281;
		@Pc(169) float local169 = Static480.aFloat253 * (float) this.aShort52 + Static121.aFloat79;
		@Pc(177) float local177 = Static121.aFloat79 + Static480.aFloat253 * (float) this.aShort50;
		@Pc(203) float local203;
		@Pc(192) float local192;
		if (local169 > local177) {
			local192 = (local169 + (float) this.aShort57) * (float) this.aClass5_Sub1_12.anInt384;
			local203 = (local177 - (float) this.aShort57) * (float) this.aClass5_Sub1_12.anInt384;
		} else {
			local203 = (local169 - (float) this.aShort57) * (float) this.aClass5_Sub1_12.anInt384;
			local192 = ((float) this.aShort57 + local177) * (float) this.aClass5_Sub1_12.anInt384;
		}
		if (local203 / local87 >= this.aClass5_Sub1_12.aFloat9 || local192 / local87 <= this.aClass5_Sub1_12.aFloat13) {
			return;
		}
		Static388.aFloat249 = local13.aFloat271 + local13.aFloat277 * local16.aFloat272 + local16.aFloat279 * local13.aFloat270 + local13.aFloat280 * local16.aFloat271;
		Static204.aFloat202 = local13.aFloat277 * local16.aFloat275 + local16.aFloat274 * local13.aFloat270 + local13.aFloat280 * local16.aFloat280;
		@Pc(292) float local292 = (float) this.aShort52 * Static204.aFloat202 + Static388.aFloat249;
		@Pc(300) float local300 = Static388.aFloat249 + (float) this.aShort50 * Static204.aFloat202;
		@Pc(315) float local315;
		@Pc(326) float local326;
		if (local292 > local300) {
			local315 = (float) this.aClass5_Sub1_12.anInt416 * (local300 - (float) this.aShort57);
			local326 = (local292 + (float) this.aShort57) * (float) this.aClass5_Sub1_12.anInt416;
		} else {
			local315 = (local292 - (float) this.aShort57) * (float) this.aClass5_Sub1_12.anInt416;
			local326 = (local300 + (float) this.aShort57) * (float) this.aClass5_Sub1_12.anInt416;
		}
		if (local315 / local87 >= this.aClass5_Sub1_12.aFloat20 || local326 / local87 <= this.aClass5_Sub1_12.aFloat28) {
			return;
		}
		if (arg1 != null || this.aClass61Array1 != null) {
			Static268.aFloat168 = local13.aFloat280 * local16.aFloat277 + local16.aFloat281 * local13.aFloat270 + local16.aFloat276 * local13.aFloat277;
			Static528.aFloat266 = local16.aFloat270 * local13.aFloat280 + local13.aFloat270 * local16.aFloat273 + local16.aFloat278 * local13.aFloat277;
			Static21.aFloat33 = local16.aFloat277 * local13.aFloat275 + local13.aFloat278 * local16.aFloat281 + local16.aFloat276 * local13.aFloat276;
			Static403.aFloat212 = local16.aFloat270 * local13.aFloat275 + local16.aFloat273 * local13.aFloat278 + local16.aFloat278 * local13.aFloat276;
			Static96.aFloat70 = local16.aFloat277 * local13.aFloat274 + local13.aFloat273 * local16.aFloat281 + local13.aFloat281 * local16.aFloat276;
			Static122.aFloat83 = local13.aFloat273 * local16.aFloat273 + local13.aFloat274 * local16.aFloat270 + local13.aFloat281 * local16.aFloat278;
		}
		if (arg1 != null) {
			@Pc(485) boolean local485 = false;
			@Pc(487) boolean local487 = true;
			@Pc(496) int local496 = this.aShort53 + this.aShort55 >> 1;
			@Pc(504) int local504 = this.aShort56 + this.aShort54 >> 1;
			@Pc(523) int local523 = (int) ((float) this.aShort52 * Static480.aFloat253 + Static122.aFloat83 * (float) local496 + Static121.aFloat79 + Static96.aFloat70 * (float) local504);
			@Pc(542) int local542 = (int) (Static204.aFloat202 * (float) this.aShort52 + Static388.aFloat249 + Static528.aFloat266 * (float) local496 + Static268.aFloat168 * (float) local504);
			@Pc(561) int local561 = (int) ((float) local504 * Static21.aFloat33 + Static528.aFloat265 * (float) this.aShort52 + Static223.aFloat154 + (float) local496 * Static403.aFloat212);
			if (local561 < this.aClass5_Sub1_12.anInt406) {
				local485 = true;
			} else {
				arg1.anInt8050 = this.aClass5_Sub1_12.anInt416 * local542 / local561 + this.aClass5_Sub1_12.anInt407;
				arg1.anInt8049 = this.aClass5_Sub1_12.anInt384 * local523 / local561 + this.aClass5_Sub1_12.anInt411;
			}
			@Pc(615) int local615 = (int) (Static480.aFloat253 * (float) this.aShort50 + Static121.aFloat79 + (float) local496 * Static122.aFloat83 + (float) local504 * Static96.aFloat70);
			@Pc(634) int local634 = (int) (Static268.aFloat168 * (float) local504 + (float) this.aShort50 * Static204.aFloat202 + Static388.aFloat249 + Static528.aFloat266 * (float) local496);
			@Pc(653) int local653 = (int) ((float) local504 * Static21.aFloat33 + Static223.aFloat154 + Static403.aFloat212 * (float) local496 + Static528.aFloat265 * (float) this.aShort50);
			if (local653 < this.aClass5_Sub1_12.anInt406) {
				local485 = true;
			} else {
				arg1.anInt8047 = this.aClass5_Sub1_12.anInt384 * local615 / local653 + this.aClass5_Sub1_12.anInt411;
				arg1.anInt8051 = this.aClass5_Sub1_12.anInt407 + local634 * this.aClass5_Sub1_12.anInt416 / local653;
			}
			if (local485) {
				if (local561 < this.aClass5_Sub1_12.anInt406 && this.aClass5_Sub1_12.anInt406 > local653) {
					local487 = false;
				} else {
					@Pc(735) int local735;
					@Pc(746) int local746;
					@Pc(772) int local772;
					if (this.aClass5_Sub1_12.anInt406 > local561) {
						local735 = (local653 - this.aClass5_Sub1_12.anInt406 << 16) / (local653 - local561);
						local746 = (local735 * (local615 - local523) >> 16) + local615;
						arg1.anInt8049 = this.aClass5_Sub1_12.anInt411 + local746 * this.aClass5_Sub1_12.anInt384 / this.aClass5_Sub1_12.anInt406;
						local772 = (local735 * (local634 - local542) >> 16) + local634;
						arg1.anInt8050 = local772 * this.aClass5_Sub1_12.anInt416 / this.aClass5_Sub1_12.anInt406 + this.aClass5_Sub1_12.anInt407;
					} else if (this.aClass5_Sub1_12.anInt406 > local653) {
						local735 = (local561 - this.aClass5_Sub1_12.anInt406 << 16) / (local561 - local653);
						local746 = (local735 * (local523 - local615) >> 16) + local523;
						arg1.anInt8049 = local746 * this.aClass5_Sub1_12.anInt384 / this.aClass5_Sub1_12.anInt406 + this.aClass5_Sub1_12.anInt411;
						local772 = local542 + (local735 * (local542 - local634) >> 16);
						arg1.anInt8050 = this.aClass5_Sub1_12.anInt407 + this.aClass5_Sub1_12.anInt416 * local772 / this.aClass5_Sub1_12.anInt406;
					}
				}
			}
			if (local487) {
				arg1.aBoolean573 = true;
				if (local653 >= local561) {
					arg1.anInt8048 = (local615 + this.aShort57) * this.aClass5_Sub1_12.anInt384 / local653 + this.aClass5_Sub1_12.anInt411 - arg1.anInt8047;
				} else {
					arg1.anInt8048 = this.aClass5_Sub1_12.anInt411 + this.aClass5_Sub1_12.anInt384 * (local523 + this.aShort57) / local561 - arg1.anInt8049;
				}
			}
		}
		this.aClass5_Sub1_12.method381();
		this.aClass5_Sub1_12.method456(local16);
		this.method2628();
		this.aClass5_Sub1_12.method390();
		this.method2637();
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method5786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class205_Sub3 local8 = (Class205_Sub3) arg2;
		@Pc(12) Class205_Sub3 local12 = this.aClass5_Sub1_12.aClass205_Sub3_4;
		@Pc(33) float local33 = local12.aFloat279 + local12.aFloat281 * local8.aFloat272 + local8.aFloat279 * local12.aFloat273 + local8.aFloat271 * local12.aFloat274;
		@Pc(54) float local54 = local12.aFloat271 + local8.aFloat271 * local12.aFloat280 + local8.aFloat279 * local12.aFloat270 + local8.aFloat272 * local12.aFloat277;
		Static21.aFloat33 = local8.aFloat281 * local12.aFloat278 + local8.aFloat277 * local12.aFloat275 + local8.aFloat276 * local12.aFloat276;
		Static528.aFloat266 = local8.aFloat278 * local12.aFloat277 + local12.aFloat270 * local8.aFloat273 + local12.aFloat280 * local8.aFloat270;
		Static403.aFloat212 = local12.aFloat276 * local8.aFloat278 + local12.aFloat275 * local8.aFloat270 + local12.aFloat278 * local8.aFloat273;
		Static480.aFloat253 = local8.aFloat274 * local12.aFloat273 + local8.aFloat280 * local12.aFloat274 + local8.aFloat275 * local12.aFloat281;
		@Pc(147) float local147 = local12.aFloat272 + local12.aFloat276 * local8.aFloat272 + local8.aFloat271 * local12.aFloat275 + local12.aFloat278 * local8.aFloat279;
		Static268.aFloat168 = local8.aFloat277 * local12.aFloat280 + local8.aFloat281 * local12.aFloat270 + local8.aFloat276 * local12.aFloat277;
		Static528.aFloat265 = local8.aFloat280 * local12.aFloat275 + local12.aFloat278 * local8.aFloat274 + local12.aFloat276 * local8.aFloat275;
		Static122.aFloat83 = local12.aFloat273 * local8.aFloat273 + local12.aFloat274 * local8.aFloat270 + local8.aFloat278 * local12.aFloat281;
		Static96.aFloat70 = local8.aFloat277 * local12.aFloat274 + local12.aFloat273 * local8.aFloat281 + local8.aFloat276 * local12.aFloat281;
		Static204.aFloat202 = local8.aFloat275 * local12.aFloat277 + local12.aFloat270 * local8.aFloat274 + local12.aFloat280 * local8.aFloat280;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass5_Sub1_12.anInt384;
		@Pc(255) int local255 = this.aClass5_Sub1_12.anInt416;
		if (!this.aBoolean222) {
			this.method2626();
		}
		Static230.anIntArray441[0] = this.aShort53;
		Static519.anIntArray758[0] = this.aShort52;
		Static118.anIntArray257[0] = this.aShort54;
		Static230.anIntArray441[1] = this.aShort55;
		Static519.anIntArray758[1] = this.aShort52;
		Static118.anIntArray257[1] = this.aShort54;
		Static230.anIntArray441[2] = this.aShort53;
		Static519.anIntArray758[2] = this.aShort50;
		Static230.anIntArray441[3] = this.aShort55;
		Static118.anIntArray257[2] = this.aShort54;
		Static519.anIntArray758[3] = this.aShort50;
		Static118.anIntArray257[3] = this.aShort54;
		Static230.anIntArray441[4] = this.aShort53;
		Static519.anIntArray758[4] = this.aShort52;
		Static230.anIntArray441[5] = this.aShort55;
		Static118.anIntArray257[4] = this.aShort56;
		Static519.anIntArray758[5] = this.aShort52;
		Static118.anIntArray257[5] = this.aShort56;
		Static230.anIntArray441[6] = this.aShort53;
		Static519.anIntArray758[6] = this.aShort50;
		Static118.anIntArray257[6] = this.aShort56;
		Static230.anIntArray441[7] = this.aShort55;
		Static519.anIntArray758[7] = this.aShort50;
		Static118.anIntArray257[7] = this.aShort56;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static230.anIntArray441[local383];
			local395 = Static118.anIntArray257[local383];
			local400 = Static519.anIntArray758[local383];
			local414 = Static96.aFloat70 * local395 + local400 * Static480.aFloat253 + Static122.aFloat83 * local390 + local33;
			local428 = Static528.aFloat266 * local390 + Static204.aFloat202 * local400 + local395 * Static268.aFloat168 + local54;
			local442 = local147 + local395 * Static21.aFloat33 + local390 * Static403.aFloat212 + local400 * Static528.aFloat265;
			if ((float) this.aClass5_Sub1_12.anInt406 <= local442) {
				@Pc(461) float local461 = (float) this.aClass5_Sub1_12.anInt411 + local414 * (float) local251 / local442;
				if (local243 < local461) {
					local243 = local461;
				}
				@Pc(479) float local479 = (float) this.aClass5_Sub1_12.anInt407 + (float) local255 * local428 / local442;
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
		if (local239 && local241 < (float) arg0 && local243 > (float) arg0 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.aClass5_Sub1_12.anIntArray83.length < this.anInt3094) {
				this.aClass5_Sub1_12.anIntArray83 = new int[this.anInt3094];
				this.aClass5_Sub1_12.anIntArray82 = new int[this.anInt3094];
			}
			@Pc(552) int[] local552 = this.aClass5_Sub1_12.anIntArray83;
			@Pc(556) int[] local556 = this.aClass5_Sub1_12.anIntArray82;
			@Pc(632) int local632;
			for (@Pc(558) int local558 = 0; local558 < this.anInt3105; local558++) {
				local390 = this.anIntArray356[local558];
				local395 = this.anIntArray355[local558];
				local400 = this.anIntArray357[local558];
				local428 = local54 + local400 * Static204.aFloat202 + local390 * Static528.aFloat266 + local395 * Static268.aFloat168;
				local442 = local147 + local395 * Static21.aFloat33 + Static403.aFloat212 * local390 + local400 * Static528.aFloat265;
				local414 = Static96.aFloat70 * local395 + Static480.aFloat253 * local400 + Static122.aFloat83 * local390 + local33;
				@Pc(639) int local639;
				@Pc(641) int local641;
				@Pc(650) int local650;
				if ((float) this.aClass5_Sub1_12.anInt406 <= local442) {
					local632 = (int) ((float) local251 * local414 / local442 + (float) this.aClass5_Sub1_12.anInt411);
					local639 = (int) ((float) local255 * local428 / local442 + (float) this.aClass5_Sub1_12.anInt407);
					local641 = this.anIntArray353[local558];
					local650 = this.anIntArray353[local558 + 1];
					for (@Pc(712) int local712 = local641; local712 < local650; local712++) {
						@Pc(721) int local721 = this.aShortArray73[local712] - 1;
						if (local721 == -1) {
							break;
						}
						local552[local721] = local632;
						local556[local721] = local639;
					}
				} else {
					local632 = this.anIntArray353[local558];
					local639 = this.anIntArray353[local558 + 1];
					for (local641 = local632; local641 < local639; local641++) {
						local650 = this.aShortArray73[local641] - 1;
						if (local650 == -1) {
							break;
						}
						local552[this.aShortArray73[local641] - 1] = -999999;
					}
				}
			}
			for (local632 = 0; local632 < this.anInt3079; local632++) {
				if (local552[this.aShortArray74[local632]] != -999999 && local552[this.aShortArray75[local632]] != -999999 && local552[this.aShortArray69[local632]] != -999999 && this.method2636(arg0, local552[this.aShortArray75[local632]], local552[this.aShortArray69[local632]], local552[this.aShortArray74[local632]], local556[this.aShortArray69[local632]], local556[this.aShortArray75[local632]], arg1, local556[this.aShortArray74[local632]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class2 method5775(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class2_Sub2 local12;
		@Pc(16) Class2_Sub2 local16;
		if (arg0 == 1) {
			local12 = this.aClass5_Sub1_12.aClass2_Sub2_5;
			local16 = this.aClass5_Sub1_12.aClass2_Sub2_9;
		} else if (arg0 == 2) {
			local12 = this.aClass5_Sub1_12.aClass2_Sub2_4;
			local16 = this.aClass5_Sub1_12.aClass2_Sub2_7;
		} else if (arg0 == 3) {
			local16 = this.aClass5_Sub1_12.aClass2_Sub2_2;
			local12 = this.aClass5_Sub1_12.aClass2_Sub2_8;
		} else if (arg0 == 4) {
			local12 = this.aClass5_Sub1_12.aClass2_Sub2_10;
			local16 = this.aClass5_Sub1_12.aClass2_Sub2_3;
		} else if (arg0 == 5) {
			local16 = this.aClass5_Sub1_12.aClass2_Sub2_1;
			local12 = this.aClass5_Sub1_12.aClass2_Sub2_6;
		} else {
			local12 = local16 = new Class2_Sub2(this.aClass5_Sub1_12);
		}
		return this.method2627(local12, arg0 != 0, local16, arg1, arg2);
	}

	@OriginalMember(owner = "client!gca", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean222) {
			this.method2626();
		}
		return this.aShort54;
	}

	@OriginalMember(owner = "client!gca", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5.anIntArray761[arg0];
		@Pc(13) int local13 = Class5.anIntArray760[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3105; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray355[local15] + local13 * this.anIntArray356[local15] >> 14;
			this.anIntArray355[local15] = this.anIntArray355[local15] * local13 - this.anIntArray356[local15] * local9 >> 14;
			this.anIntArray356[local15] = local33;
		}
		this.aBoolean222 = false;
		if (this.aClass112_5 != null) {
			this.aClass112_5.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!gca", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class3_Sub10_Sub18 Z(@OriginalArg(0) Class3_Sub10_Sub18 arg0) {
		if (this.anInt3094 == 0) {
			return null;
		}
		if (!this.aBoolean222) {
			this.method2626();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass5_Sub1_12.anInt404 <= 0) {
			local37 = this.aShort53 - (this.aShort52 * this.aClass5_Sub1_12.anInt404 >> 8) >> this.aClass5_Sub1_12.anInt375;
			local54 = this.aShort55 - (this.aClass5_Sub1_12.anInt404 * this.aShort50 >> 8) >> this.aClass5_Sub1_12.anInt375;
		} else {
			local37 = this.aShort53 - (this.aShort50 * this.aClass5_Sub1_12.anInt404 >> 8) >> this.aClass5_Sub1_12.anInt375;
			local54 = this.aShort55 - (this.aShort52 * this.aClass5_Sub1_12.anInt404 >> 8) >> this.aClass5_Sub1_12.anInt375;
		}
		@Pc(109) int local109;
		@Pc(125) int local125;
		if (this.aClass5_Sub1_12.anInt417 <= 0) {
			local109 = this.aShort54 - (this.aClass5_Sub1_12.anInt417 * this.aShort52 >> 8) >> this.aClass5_Sub1_12.anInt375;
			local125 = this.aShort56 - (this.aClass5_Sub1_12.anInt417 * this.aShort50 >> 8) >> this.aClass5_Sub1_12.anInt375;
		} else {
			local109 = this.aShort54 - (this.aShort50 * this.aClass5_Sub1_12.anInt417 >> 8) >> this.aClass5_Sub1_12.anInt375;
			local125 = this.aShort56 - (this.aShort52 * this.aClass5_Sub1_12.anInt417 >> 8) >> this.aClass5_Sub1_12.anInt375;
		}
		@Pc(168) int local168 = local54 + 1 - local37;
		@Pc(175) int local175 = local125 + 1 - local109;
		@Pc(178) Class3_Sub10_Sub18_Sub2 local178 = (Class3_Sub10_Sub18_Sub2) arg0;
		@Pc(188) Class3_Sub10_Sub18_Sub2 local188;
		if (local178 != null && local178.method7648(local175, local168)) {
			local188 = local178;
			local178.method7645();
		} else {
			local188 = new Class3_Sub10_Sub18_Sub2(this.aClass5_Sub1_12, local168, local175);
		}
		local188.method7649(local125, local37, local54, local109);
		this.method2638(local188);
		return local188;
	}

	@OriginalMember(owner = "client!gca", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3096; local3++) {
			this.anIntArray356[local3] = this.anIntArray356[local3] + 7 >> 4;
			this.anIntArray357[local3] = this.anIntArray357[local3] + 7 >> 4;
			this.anIntArray355[local3] = this.anIntArray355[local3] + 7 >> 4;
		}
		if (this.aClass112_5 != null) {
			this.aClass112_5.anInterface1_4 = null;
		}
		this.aBoolean222 = false;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZI)V")
	private void method2633(@OriginalArg(0) boolean arg0) {
		if (this.aClass5_Sub1_12.aClass3_Sub27_Sub2_1.aByteArray114.length < this.anInt3112 * 6) {
			this.aClass5_Sub1_12.aClass3_Sub27_Sub2_1 = new Class3_Sub27_Sub2((this.anInt3112 + 100) * 6);
		} else {
			this.aClass5_Sub1_12.aClass3_Sub27_Sub2_1.anInt9191 = 0;
		}
		@Pc(42) Class3_Sub27_Sub2 local42 = this.aClass5_Sub1_12.aClass3_Sub27_Sub2_1;
		@Pc(48) int local48;
		if (this.aClass5_Sub1_12.aBoolean39) {
			for (local48 = 0; local48 < this.anInt3112; local48++) {
				local42.method7600(this.aShortArray74[local48], 30364);
				local42.method7600(this.aShortArray75[local48], 30364);
				local42.method7600(this.aShortArray69[local48], 30364);
			}
		} else {
			for (local48 = 0; local48 < this.anInt3112; local48++) {
				local42.method7556(this.aShortArray74[local48]);
				local42.method7556(this.aShortArray75[local48]);
				local42.method7556(this.aShortArray69[local48]);
			}
		}
		if (local42.anInt9191 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface10_3 == null) {
				this.anInterface10_3 = this.aClass5_Sub1_12.method398(local42.aByteArray114, local42.anInt9191, true);
			} else {
				this.anInterface10_3.method5402(local42.aByteArray114, local42.anInt9191);
			}
			this.aClass34_1.anInterface10_2 = this.anInterface10_3;
		} else {
			this.aClass34_1.anInterface10_2 = this.aClass5_Sub1_12.method398(local42.aByteArray114, local42.anInt9191, false);
		}
		if (!arg0) {
			this.aBoolean223 = true;
		}
	}

	@OriginalMember(owner = "client!gca", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(3) Class52 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean222) {
			this.method2626();
		}
		@Pc(16) int local16 = arg4 + this.aShort53;
		@Pc(21) int local21 = this.aShort55 + arg4;
		@Pc(26) int local26 = this.aShort54 + arg6;
		@Pc(31) int local31 = this.aShort56 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9491 <= local21 + arg2.anInt9493 >> arg2.anInt9494 || local26 < 0 || arg2.anInt9492 <= arg2.anInt9493 + local31 >> arg2.anInt9494)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local21 + arg3.anInt9493 >> arg3.anInt9494 >= arg3.anInt9491 || local26 < 0 || local31 + arg3.anInt9493 >> arg3.anInt9494 >= arg3.anInt9492) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9494;
			local21 = local21 + arg2.anInt9493 - 1 >> arg2.anInt9494;
			local26 >>= arg2.anInt9494;
			local31 = arg2.anInt9493 + local31 - 1 >> arg2.anInt9494;
			if (arg2.JA(local16, local26) == arg5 && arg5 == arg2.JA(local21, local26) && arg5 == arg2.JA(local16, local31) && arg2.JA(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(205) int local205;
		if (arg0 == 1) {
			for (local205 = 0; local205 < this.anInt3105; local205++) {
				this.anIntArray357[local205] = this.anIntArray357[local205] + arg2.sa(arg4 + this.anIntArray356[local205], arg6 + this.anIntArray355[local205]) - arg5;
			}
		} else {
			@Pc(263) int local263;
			@Pc(271) int local271;
			if (arg0 == 2) {
				@Pc(477) short local477 = this.aShort52;
				if (local477 == 0) {
					return;
				}
				for (local263 = 0; local263 < this.anInt3105; local263++) {
					local271 = (this.anIntArray357[local263] << 16) / local477;
					if (arg1 > local271) {
						this.anIntArray357[local263] -= -((arg1 - local271) * (arg2.sa(arg4 + this.anIntArray356[local263], this.anIntArray355[local263] - -arg6) + -arg5) / arg1);
					}
				}
			} else {
				@Pc(279) int local279;
				if (arg0 == 3) {
					local205 = (arg1 & 0xFF) * 4;
					local263 = (arg1 >> 8 & 0xFF) * 4;
					local271 = (arg1 >> 16 & 0xFF) << 6;
					local279 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local205 >> 1) < 0 || arg2.anInt9491 << arg2.anInt9494 <= arg4 + (local205 >> 1) + arg2.anInt9493 || arg6 - (local263 >> 1) < 0 || arg2.anInt9493 + (local263 >> 1) + arg6 >= arg2.anInt9492 << arg2.anInt9494) {
						return;
					}
					this.method5787(arg2, local263, arg6, arg5, local271, local279, arg4, local205);
				} else if (arg0 == 4) {
					local205 = this.aShort50 - this.aShort52;
					for (local263 = 0; local263 < this.anInt3105; local263++) {
						this.anIntArray357[local263] -= arg5 - arg3.sa(this.anIntArray356[local263] + arg4, this.anIntArray355[local263] - -arg6) - local205;
					}
				} else if (arg0 == 5) {
					local205 = this.aShort50 - this.aShort52;
					for (local263 = 0; local263 < this.anInt3105; local263++) {
						local271 = arg4 + this.anIntArray356[local263];
						local279 = arg6 + this.anIntArray355[local263];
						@Pc(433) int local433 = arg2.sa(local271, local279);
						@Pc(438) int local438 = arg3.sa(local271, local279);
						@Pc(446) int local446 = local433 - local438 - arg1;
						this.anIntArray357[local263] = ((this.anIntArray357[local263] << 8) / local205 * local446 >> 8) - (arg5 - local433);
					}
				}
			}
		}
		this.aBoolean222 = false;
		if (this.aClass112_5 != null) {
			this.aClass112_5.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(ZI)V")
	private void method2634(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass112_3 != null && this.aClass112_3.anInterface1_4 == null;
		@Pc(27) boolean local27 = this.aClass112_4 != null && this.aClass112_4.anInterface1_4 == null;
		@Pc(38) boolean local38 = this.aClass112_5 != null && this.aClass112_5.anInterface1_4 == null;
		@Pc(49) boolean local49 = this.aClass112_6 != null && this.aClass112_6.anInterface1_4 == null;
		if (arg0) {
			local27 &= (this.aByte33 & 0x4) != 0;
			local49 &= (this.aByte33 & 0x8) != 0;
			local16 &= (this.aByte33 & 0x2) != 0;
			local38 &= (this.aByte33 & 0x1) != 0;
		}
		@Pc(100) byte local100 = 0;
		@Pc(104) byte local104 = 0;
		@Pc(112) byte local112 = 0;
		if (local38) {
			local100 = 12;
		}
		@Pc(123) byte local123 = 0;
		if (local16) {
			local104 = local100;
			local100 = (byte) (local100 + 4);
		}
		if (local27) {
			local112 = local100;
			local100 = (byte) (local100 + 12);
		}
		if (local49) {
			local123 = local100;
			local100 = (byte) (local100 + 8);
		}
		if (local100 == 0) {
			return;
		}
		if (this.anInt3094 * local100 > this.aClass5_Sub1_12.aClass3_Sub27_Sub2_1.aByteArray114.length) {
			this.aClass5_Sub1_12.aClass3_Sub27_Sub2_1 = new Class3_Sub27_Sub2((this.anInt3094 + 100) * local100);
		} else {
			this.aClass5_Sub1_12.aClass3_Sub27_Sub2_1.anInt9191 = 0;
		}
		@Pc(193) Class3_Sub27_Sub2 local193 = this.aClass5_Sub1_12.aClass3_Sub27_Sub2_1;
		@Pc(201) int local201;
		@Pc(210) int local210;
		@Pc(238) int local238;
		@Pc(247) int local247;
		if (local38) {
			@Pc(217) int local217;
			@Pc(224) int local224;
			@Pc(229) int local229;
			@Pc(236) int local236;
			if (this.aClass5_Sub1_12.aBoolean39) {
				for (local201 = 0; local201 < this.anInt3105; local201++) {
					local210 = Stream.floatToRawIntBits((float) this.anIntArray356[local201]);
					local217 = Stream.floatToRawIntBits((float) this.anIntArray357[local201]);
					local224 = Stream.floatToRawIntBits((float) this.anIntArray355[local201]);
					local229 = this.anIntArray353[local201];
					local236 = this.anIntArray353[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray73[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt9191 = local100 * local247;
						local193.method7594(local210);
						local193.method7594(local217);
						local193.method7594(local224);
					}
				}
			} else {
				for (local201 = 0; local201 < this.anInt3105; local201++) {
					local210 = Stream.floatToRawIntBits((float) this.anIntArray356[local201]);
					local217 = Stream.floatToRawIntBits((float) this.anIntArray357[local201]);
					local224 = Stream.floatToRawIntBits((float) this.anIntArray355[local201]);
					local229 = this.anIntArray353[local201];
					local236 = this.anIntArray353[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray73[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt9191 = local100 * local247;
						local193.method7578(local210);
						local193.method7578(local217);
						local193.method7578(local224);
					}
				}
			}
		}
		@Pc(504) float local504;
		@Pc(375) short[] local375;
		@Pc(384) short[] local384;
		@Pc(378) short[] local378;
		@Pc(381) byte[] local381;
		@Pc(540) float local540;
		if (local16) {
			if (this.aClass112_4 == null) {
				if (this.aClass200_1 == null) {
					local375 = this.aShortArray67;
					local378 = this.aShortArray72;
					local381 = this.aByteArray41;
					local384 = this.aShortArray76;
				} else {
					local381 = this.aClass200_1.aByteArray61;
					local378 = this.aClass200_1.aShortArray122;
					local384 = this.aClass200_1.aShortArray121;
					local375 = this.aClass200_1.aShortArray123;
				}
				@Pc(408) float local408 = this.aClass5_Sub1_12.bf[0];
				@Pc(414) float local414 = this.aClass5_Sub1_12.bf[1];
				@Pc(420) float local420 = this.aClass5_Sub1_12.bf[2];
				@Pc(424) float local424 = this.aClass5_Sub1_12.aFloat7;
				@Pc(434) float local434 = this.aClass5_Sub1_12.aFloat27 * 768.0F / (float) this.aShort51;
				@Pc(444) float local444 = this.aClass5_Sub1_12.aFloat23 * 768.0F / (float) this.aShort51;
				for (@Pc(446) int local446 = 0; local446 < this.anInt3079; local446++) {
					@Pc(468) int local468 = this.method2625(this.aShortArray68[local446], this.aShort58, this.aShortArray71[local446], this.aByteArray42[local446]);
					@Pc(477) float local477 = (float) (local468 >>> 24) * this.aClass5_Sub1_12.aFloat6;
					@Pc(482) short local482 = this.aShortArray74[local446];
					@Pc(493) float local493 = this.aClass5_Sub1_12.aFloat18 * (float) (local468 >> 8 & 0xFF);
					local504 = (float) (local468 >> 16 & 0xFF) * this.aClass5_Sub1_12.aFloat14;
					@Pc(509) short local509 = (short) local381[local482];
					if (local509 == 0) {
						local540 = ((float) local384[local482] * local414 + (float) local375[local482] * local408 + (float) local378[local482] * local420) * 0.0026041667F;
					} else {
						local540 = (local420 * (float) local378[local482] + (float) local375[local482] * local408 + (float) local384[local482] * local414) / (float) (local509 * 256);
					}
					@Pc(577) float local577 = local424 + (local540 < 0.0F ? local444 : local434) * local540;
					@Pc(582) int local582 = (int) (local477 * local577);
					@Pc(587) int local587 = (int) (local577 * local504);
					if (local582 < 0) {
						local582 = 0;
					} else if (local582 > 255) {
						local582 = 255;
					}
					@Pc(605) int local605 = (int) (local577 * local493);
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					if (local605 < 0) {
						local605 = 0;
					} else if (local605 > 255) {
						local605 = 255;
					}
					local193.anInt9191 = local100 * local482 + local104;
					local193.method7576(local582);
					local193.method7576(local587);
					local193.method7576(local605);
					local193.method7576(255 - (this.aByteArray42[local446] & 0xFF));
					local482 = this.aShortArray75[local446];
					local509 = local381[local482];
					if (local509 == 0) {
						local540 = ((float) local378[local482] * local420 + local408 * (float) local375[local482] + (float) local384[local482] * local414) * 0.0026041667F;
					} else {
						local540 = (local408 * (float) local375[local482] + local414 * (float) local384[local482] + (float) local378[local482] * local420) / (float) (local509 * 256);
					}
					local577 = local424 + (local540 < 0.0F ? local444 : local434) * local540;
					local582 = (int) (local577 * local477);
					local587 = (int) (local504 * local577);
					if (local582 < 0) {
						local582 = 0;
					} else if (local582 > 255) {
						local582 = 255;
					}
					local605 = (int) (local577 * local493);
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					if (local605 < 0) {
						local605 = 0;
					} else if (local605 > 255) {
						local605 = 255;
					}
					local193.anInt9191 = local104 + local100 * local482;
					local193.method7576(local582);
					local193.method7576(local587);
					local193.method7576(local605);
					local193.method7576(255 - (this.aByteArray42[local446] & 0xFF));
					local482 = this.aShortArray69[local446];
					local509 = local381[local482];
					if (local509 == 0) {
						local540 = ((float) local384[local482] * local414 + (float) local375[local482] * local408 + local420 * (float) local378[local482]) * 0.0026041667F;
					} else {
						local540 = (local408 * (float) local375[local482] + (float) local384[local482] * local414 + local420 * (float) local378[local482]) / (float) (local509 * 256);
					}
					local577 = (local540 < 0.0F ? local444 : local434) * local540 + local424;
					local582 = (int) (local477 * local577);
					local587 = (int) (local577 * local504);
					if (local582 < 0) {
						local582 = 0;
					} else if (local582 > 255) {
						local582 = 255;
					}
					local605 = (int) (local493 * local577);
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					if (local605 < 0) {
						local605 = 0;
					} else if (local605 > 255) {
						local605 = 255;
					}
					local193.anInt9191 = local104 + local100 * local482;
					local193.method7576(local582);
					local193.method7576(local587);
					local193.method7576(local605);
					local193.method7576(255 - (this.aByteArray42[local446] & 0xFF));
				}
			} else {
				for (local201 = 0; local201 < this.anInt3079; local201++) {
					local210 = this.method2625(this.aShortArray68[local201], this.aShort58, this.aShortArray71[local201], this.aByteArray42[local201]);
					local193.anInt9191 = local104 + this.aShortArray74[local201] * local100;
					local193.method7594(local210);
					local193.anInt9191 = this.aShortArray75[local201] * local100 + local104;
					local193.method7594(local210);
					local193.anInt9191 = local104 + local100 * this.aShortArray69[local201];
					local193.method7594(local210);
				}
			}
		}
		if (local27) {
			if (this.aClass200_1 == null) {
				local381 = this.aByteArray41;
				local375 = this.aShortArray67;
				local378 = this.aShortArray72;
				local384 = this.aShortArray76;
			} else {
				local384 = this.aClass200_1.aShortArray121;
				local378 = this.aClass200_1.aShortArray122;
				local381 = this.aClass200_1.aByteArray61;
				local375 = this.aClass200_1.aShortArray123;
			}
			@Pc(1112) float local1112 = 3.0F / (float) this.aShort51;
			local193.anInt9191 = local112;
			local540 = 3.0F / (float) (this.aShort51 / 2 + this.aShort51);
			if (this.aClass5_Sub1_12.aBoolean39) {
				for (local238 = 0; local238 < this.anInt3094; local238++) {
					local247 = local381[local238] & 0xFF;
					if (local247 == 0) {
						local193.method7616(local540 * (float) local375[local238]);
						local193.method7616(local540 * (float) local384[local238]);
						local193.method7616((float) local378[local238] * local540);
					} else {
						local504 = local1112 / (float) local247;
						local193.method7616(local504 * (float) local375[local238]);
						local193.method7616(local504 * (float) local384[local238]);
						local193.method7616(local504 * (float) local378[local238]);
					}
					local193.anInt9191 += local100 - 12;
				}
			} else {
				for (local238 = 0; local238 < this.anInt3094; local238++) {
					local247 = local381[local238] & 0xFF;
					if (local247 == 0) {
						local193.method7615((float) local375[local238] * local540);
						local193.method7615((float) local384[local238] * local540);
						local193.method7615((float) local378[local238] * local540);
					} else {
						local504 = local1112 / (float) local247;
						local193.method7615((float) local375[local238] * local504);
						local193.method7615(local504 * (float) local384[local238]);
						local193.method7615((float) local378[local238] * local504);
					}
					local193.anInt9191 += local100 - 12;
				}
			}
		}
		if (local49) {
			local193.anInt9191 = local123;
			if (this.aClass5_Sub1_12.aBoolean39) {
				for (local201 = 0; local201 < this.anInt3094; local201++) {
					local193.method7616(this.aFloatArray13[local201]);
					local193.method7616(this.aFloatArray12[local201]);
					local193.anInt9191 += local100 - 8;
				}
			} else {
				for (local201 = 0; local201 < this.anInt3094; local201++) {
					local193.method7615(this.aFloatArray13[local201]);
					local193.method7615(this.aFloatArray12[local201]);
					local193.anInt9191 += local100 - 8;
				}
			}
		}
		local193.anInt9191 = this.anInt3094 * local100;
		@Pc(1426) Interface1 local1426;
		if (arg0) {
			if (this.anInterface1_3 == null) {
				this.anInterface1_3 = this.aClass5_Sub1_12.method445(local100, true, local193.anInt9191, local193.aByteArray114);
			} else {
				this.anInterface1_3.method7113(local193.anInt9191, local193.aByteArray114, local100);
			}
			local1426 = this.anInterface1_3;
			this.aByte33 = 0;
		} else {
			local1426 = this.aClass5_Sub1_12.method445(local100, false, local193.anInt9191, local193.aByteArray114);
			this.aBoolean223 = true;
		}
		if (local38) {
			this.aClass112_5.anInterface1_4 = local1426;
			this.aClass112_5.aByte37 = 0;
		}
		if (local49) {
			this.aClass112_6.aByte37 = local123;
			this.aClass112_6.anInterface1_4 = local1426;
		}
		if (local16) {
			this.aClass112_3.anInterface1_4 = local1426;
			this.aClass112_3.aByte37 = local104;
		}
		if (local27) {
			this.aClass112_4.aByte37 = local112;
			this.aClass112_4.anInterface1_4 = local1426;
		}
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "()Z")
	@Override
	public boolean method5788() {
		if (this.aShortArray71 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray71.length; local12++) {
			if (this.aShortArray71[local12] != -1 && !this.aClass5_Sub1_12.anInterface4_14.method6708(this.aShortArray71[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gca", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.aShort51 = (short) arg0;
		if (this.aClass112_3 != null) {
			this.aClass112_3.anInterface1_4 = null;
		}
		if (this.aClass112_4 != null) {
			this.aClass112_4.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IJIFILclient!or;FIII)S")
	private short method2635(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class222 arg5, @OriginalArg(6) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = this.anIntArray353[arg8];
		@Pc(22) int local22 = this.anIntArray353[arg8 + 1];
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = local15; local26 < local22; local26++) {
			@Pc(33) short local33 = this.aShortArray73[local26];
			if (local33 == 0) {
				local24 = local26;
				break;
			}
			if (arg1 == Static90.aLongArray5[local26]) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray73[local24] = (short) (this.anInt3094 + 1);
		Static90.aLongArray5[local24] = arg1;
		this.aShortArray67[this.anInt3094] = (short) arg0;
		this.aShortArray76[this.anInt3094] = (short) arg2;
		this.aShortArray72[this.anInt3094] = (short) arg7;
		this.aByteArray41[this.anInt3094] = (byte) arg4;
		this.aFloatArray13[this.anInt3094] = arg3;
		this.aFloatArray12[this.anInt3094] = arg6;
		return (short) this.anInt3094++;
	}

	@OriginalMember(owner = "client!gca", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5.anIntArray761[arg0];
		@Pc(13) int local13 = Class5.anIntArray760[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3105; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray356[local15] + this.anIntArray357[local15] * local9 >> 14;
			this.anIntArray357[local15] = this.anIntArray357[local15] * local13 - local9 * this.anIntArray356[local15] >> 14;
			this.anIntArray356[local15] = local33;
		}
		if (this.aClass112_5 != null) {
			this.aClass112_5.anInterface1_4 = null;
		}
		this.aBoolean222 = false;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIBIIII)Z")
	private boolean method2636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > arg6 && arg6 < arg5 && arg4 > arg6) {
			return false;
		} else if (arg7 < arg6 && arg5 < arg6 && arg6 > arg4) {
			return false;
		} else if (arg3 > arg0 && arg0 < arg1 && arg0 < arg2) {
			return false;
		} else {
			return arg0 <= arg3 || arg0 <= arg1 || arg2 >= arg0;
		}
	}

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "(I)V")
	private void method2637() {
		if (this.aClass61Array1 == null) {
			return;
		}
		@Pc(12) Class205_Sub3 local12 = this.aClass5_Sub1_12.aClass205_Sub3_2;
		@Pc(16) float local16 = this.aClass5_Sub1_12.method395();
		@Pc(20) float local20 = this.aClass5_Sub1_12.method384();
		this.aClass5_Sub1_12.method403();
		this.aClass5_Sub1_12.method7412(false);
		this.aClass5_Sub1_12.method454(false);
		this.aClass5_Sub1_12.method383(this.aClass5_Sub1_12.aClass112_1, null, null, this.aClass5_Sub1_12.aClass112_2);
		for (@Pc(47) int local47 = 0; local47 < this.anInt3111; local47++) {
			@Pc(54) Class61 local54 = this.aClass61Array1[local47];
			@Pc(59) Class36 local59 = this.aClass36Array1[local47];
			if (!local54.aBoolean136 || !this.aClass5_Sub1_12.method7441()) {
				@Pc(87) float local87 = (float) (this.anIntArray356[local54.anInt1871] + this.anIntArray356[local54.anInt1869] + this.anIntArray356[local54.anInt1866]) * 0.3333333F;
				@Pc(108) float local108 = (float) (this.anIntArray357[local54.anInt1866] + this.anIntArray357[local54.anInt1869] + this.anIntArray357[local54.anInt1871]) * 0.3333333F;
				@Pc(131) float local131 = (float) (this.anIntArray355[local54.anInt1866] + this.anIntArray355[local54.anInt1869] + this.anIntArray355[local54.anInt1871]) * 0.3333333F;
				@Pc(145) float local145 = Static121.aFloat79 + local131 * Static96.aFloat70 + Static122.aFloat83 * local87 + local108 * Static480.aFloat253;
				@Pc(159) float local159 = local87 * Static528.aFloat266 + local108 * Static204.aFloat202 + Static268.aFloat168 * local131 + Static388.aFloat249;
				@Pc(173) float local173 = Static223.aFloat154 + local131 * Static21.aFloat33 + local87 * Static403.aFloat212 + local108 * Static528.aFloat265;
				local12.method7806((float) local59.anInt1009 + local145, -local159 + (float) local59.anInt1010, local59.anInt1012, local59.anInt1011 * local54.aShort21 >> 7, -local173, local54.aShort20 * local59.anInt1007 >> 7);
				this.aClass5_Sub1_12.method457(local12);
				this.aClass5_Sub1_12.ka(local20, local16 - (float) local54.anInt1870 * 1.5F);
				@Pc(224) int local224 = local59.anInt1008;
				OpenGL.glColor4ub((byte) (local224 >> 16), (byte) (local224 >> 8), (byte) local224, (byte) (local224 >> 24));
				this.aClass5_Sub1_12.method414(local54.aShort22);
				this.aClass5_Sub1_12.method455(local54.aByte8);
				this.aClass5_Sub1_12.method409(4);
			}
		}
		this.aClass5_Sub1_12.ka(local20, local16);
		this.aClass5_Sub1_12.method7412(true);
		this.aClass5_Sub1_12.method390();
	}

	@OriginalMember(owner = "client!gca", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass5_Sub1_12.anInterface4_14;
		for (@Pc(11) int local11 = 0; local11 < this.anInt3079; local11++) {
			if (arg0 == this.aShortArray71[local11]) {
				this.aShortArray71[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class238 local47 = local9.method6712(arg0 & 0xFFFF);
			local37 = local47.aByte71;
			local35 = local47.aByte67;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class238 local67 = local9.method6712(arg1 & 0xFFFF);
			local57 = local67.aByte71;
			local55 = local67.aByte67;
		}
		if (!(local55 != local35 | local57 != local37)) {
			return;
		}
		if (this.aClass61Array1 != null) {
			for (@Pc(100) int local100 = 0; local100 < this.anInt3111; local100++) {
				@Pc(107) Class61 local107 = this.aClass61Array1[local100];
				@Pc(112) Class36 local112 = this.aClass36Array1[local100];
				local112.anInt1008 = local112.anInt1008 & 0xFF000000 | Static393.anIntArray638[this.aShortArray68[local107.anInt1868] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass112_3 != null) {
			this.aClass112_3.anInterface1_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLclient!wca;)V")
	private void method2638(@OriginalArg(1) Class3_Sub10_Sub18_Sub2 arg0) {
		if (this.aClass5_Sub1_12.anIntArray83.length < this.anInt3094) {
			this.aClass5_Sub1_12.anIntArray83 = new int[this.anInt3094];
			this.aClass5_Sub1_12.anIntArray82 = new int[this.anInt3094];
		}
		@Pc(37) int[] local37 = this.aClass5_Sub1_12.anIntArray83;
		@Pc(41) int[] local41 = this.aClass5_Sub1_12.anIntArray82;
		@Pc(70) int local70;
		@Pc(109) int local109;
		@Pc(118) int local118;
		for (@Pc(43) int local43 = 0; local43 < this.anInt3105; local43++) {
			local70 = (this.anIntArray356[local43] - (this.aClass5_Sub1_12.anInt404 * this.anIntArray357[local43] >> 8) >> this.aClass5_Sub1_12.anInt375) - arg0.anInt9252;
			@Pc(95) int local95 = (this.anIntArray355[local43] - (this.aClass5_Sub1_12.anInt417 * this.anIntArray357[local43] >> 8) >> this.aClass5_Sub1_12.anInt375) - arg0.anInt9249;
			@Pc(100) int local100 = this.anIntArray353[local43];
			@Pc(107) int local107 = this.anIntArray353[local43 + 1];
			for (local109 = local100; local109 < local107; local109++) {
				local118 = this.aShortArray73[local109] - 1;
				if (local118 == -1) {
					break;
				}
				local37[local118] = local70;
				local41[local118] = local95;
			}
		}
		for (local70 = 0; local70 < this.anInt3112; local70++) {
			if (this.aByteArray42 == null || this.aByteArray42[local70] <= 128) {
				@Pc(162) short local162 = this.aShortArray74[local70];
				@Pc(167) short local167 = this.aShortArray75[local70];
				@Pc(172) short local172 = this.aShortArray69[local70];
				local109 = local37[local162];
				local118 = local37[local167];
				@Pc(184) int local184 = local37[local172];
				@Pc(188) int local188 = local41[local162];
				@Pc(192) int local192 = local41[local167];
				@Pc(196) int local196 = local41[local172];
				if ((local109 - local118) * (local192 - local196) - (local192 - local188) * (-local118 + local184) > 0) {
					arg0.method7647(local109, local192, local188, local196, local118, local184);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3079; local7++) {
			local16 = this.aShortArray68[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 += (arg2 - local32) * arg3 >> 7;
			}
			this.aShortArray68[local7] = (short) (local22 << 10 | local28 << 7 | local32);
		}
		if (this.aClass61Array1 != null) {
			for (local16 = 0; local16 < this.anInt3111; local16++) {
				@Pc(110) Class61 local110 = this.aClass61Array1[local16];
				@Pc(115) Class36 local115 = this.aClass36Array1[local16];
				local115.anInt1008 = local115.anInt1008 & 0xFF000000 | Static393.anIntArray638[this.aShortArray68[local110.anInt1868] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass112_3 != null) {
			this.aClass112_3.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!gca", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean222) {
			this.method2626();
		}
		return this.aShort55;
	}
}
