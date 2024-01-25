import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class66_Sub1 extends Class66 {

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
	private int anInt4415;

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "Lclient!uf;")
	private Class332 aClass332_1;

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
	private int anInt4423;

	@OriginalMember(owner = "client!ja", name = "P", descriptor = "Lclient!gm;")
	private Class126 aClass126_1;

	@OriginalMember(owner = "client!ja", name = "Q", descriptor = "Lclient!gm;")
	private Class126 aClass126_2;

	@OriginalMember(owner = "client!ja", name = "ab", descriptor = "Z")
	private boolean aBoolean355;

	@OriginalMember(owner = "client!ja", name = "ib", descriptor = "I")
	private int anInt4432;

	@OriginalMember(owner = "client!ja", name = "pb", descriptor = "I")
	private int anInt4437;

	@OriginalMember(owner = "client!ja", name = "sb", descriptor = "I")
	private int anInt4438;

	@OriginalMember(owner = "client!ja", name = "yb", descriptor = "Lclient!gm;")
	private Class126 aClass126_3;

	@OriginalMember(owner = "client!ja", name = "Fb", descriptor = "I")
	private int anInt4446;

	@OriginalMember(owner = "client!ja", name = "Jb", descriptor = "I")
	private int anInt4449;

	@OriginalMember(owner = "client!ja", name = "Nb", descriptor = "Lclient!en;")
	private final Class100_Sub1 aClass100_Sub1_11;

	@OriginalMember(owner = "client!ja", name = "Pb", descriptor = "I")
	private int anInt4453;

	@OriginalMember(owner = "client!ja", name = "fc", descriptor = "Lclient!gm;")
	private Class126 aClass126_4;

	@OriginalMember(owner = "client!ja", name = "oc", descriptor = "I")
	private int anInt4472;

	@OriginalMember(owner = "client!ja", name = "pc", descriptor = "I")
	private int anInt4473;

	@OriginalMember(owner = "client!ja", name = "vc", descriptor = "I")
	private int anInt4476;

	@OriginalMember(owner = "client!ja", name = "zc", descriptor = "Z")
	private boolean aBoolean357;

	@OriginalMember(owner = "client!ja", name = "Gc", descriptor = "Z")
	private boolean aBoolean358;

	@OriginalMember(owner = "client!ja", name = "Jc", descriptor = "Lclient!fs;")
	private Class118 aClass118_1;

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!ja", name = "uc", descriptor = "I")
	private int anInt4475;

	@OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
	private int anInt4425;

	@OriginalMember(owner = "client!ja", name = "vb", descriptor = "Z")
	private boolean aBoolean356;

	@OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
	private int anInt4429;

	@OriginalMember(owner = "client!ja", name = "jc", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!ja", name = "Db", descriptor = "I")
	private int anInt4444;

	@OriginalMember(owner = "client!ja", name = "kc", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!ja", name = "Ib", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!ja", name = "Z", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!ja", name = "Bb", descriptor = "[Lclient!hi;")
	private Class139[] aClass139Array2;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "[Lclient!qg;")
	private Class270[] aClass270Array2;

	@OriginalMember(owner = "client!ja", name = "Wb", descriptor = "I")
	private int anInt4459;

	@OriginalMember(owner = "client!ja", name = "db", descriptor = "[Lclient!mfa;")
	private Class219[] aClass219Array1;

	@OriginalMember(owner = "client!ja", name = "U", descriptor = "[Lclient!oh;")
	private Class242[] aClass242Array1;

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "[F")
	private float[] aFloatArray38;

	@OriginalMember(owner = "client!ja", name = "Kb", descriptor = "[F")
	private float[] aFloatArray39;

	@OriginalMember(owner = "client!ja", name = "bb", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!ja", name = "T", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!ja", name = "Fc", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!ja", name = "nb", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!ja", name = "sc", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!ja", name = "gb", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!ja", name = "Qb", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!ja", name = "rb", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!ja", name = "bc", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!ja", name = "hb", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!ja", name = "rc", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!ja", name = "fb", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!ja", name = "V", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!ja", name = "J", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!ja", name = "qb", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!ja", name = "tc", descriptor = "[I")
	private int[] anIntArray288;

	@OriginalMember(owner = "client!ja", name = "xb", descriptor = "[I")
	private int[] anIntArray284;

	@OriginalMember(owner = "client!ja", name = "lc", descriptor = "[I")
	private int[] anIntArray287;

	@OriginalMember(owner = "client!ja", name = "Ab", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!ja", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!en;Lclient!eg;IIII)V")
	public Class66_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface5 local11 = arg0.anInterface5_10;
		@Pc(15) int[] local15 = new int[arg1.anInt2351];
		this.anIntArray282 = new int[arg1.anInt2343 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt2351; local24++) {
			if ((arg1.aByteArray31 == null || arg1.aByteArray31[local24] != 2) && (arg1.aShortArray33 == null || arg1.aShortArray33[local24] == -1 || !local11.method917(arg1.aShortArray33[local24] & 0xFFFF).aBoolean705)) {
				local15[this.anInt4475++] = local24;
				this.anIntArray282[arg1.aShortArray35[local24]]++;
				this.anIntArray282[arg1.aShortArray31[local24]]++;
				this.anIntArray282[arg1.aShortArray27[local24]]++;
			}
		}
		this.anInt4425 = this.anInt4475;
		@Pc(111) long[] local111 = new long[this.anInt4475];
		@Pc(123) boolean local123 = (this.anInt4432 & 0x100) != 0;
		@Pc(135) int local135;
		@Pc(146) int local146;
		@Pc(281) int local281;
		label499: for (@Pc(125) int local125 = 0; local125 < this.anInt4475; local125++) {
			@Pc(131) int local131 = local15[local125];
			@Pc(133) Class343 local133 = null;
			local135 = 0;
			@Pc(137) byte local137 = 0;
			@Pc(139) byte local139 = 0;
			@Pc(141) byte local141 = 0;
			if (arg1.aClass214Array1 != null) {
				for (local146 = 0; local146 < arg1.aClass214Array1.length; local146++) {
					@Pc(153) Class214 local153 = arg1.aClass214Array1[local146];
					if (local131 == local153.anInt5956) {
						@Pc(162) Class55 local162 = Static276.method3098(local153.anInt5958);
						if (local162.aBoolean108) {
							local111[local125] = Long.MAX_VALUE;
							this.anInt4425--;
							continue label499;
						}
					}
				}
			}
			@Pc(189) short local189 = -1;
			if (arg1.aShortArray33 != null) {
				local189 = arg1.aShortArray33[local131];
				if (local189 != -1) {
					local133 = local11.method917(local189 & 0xFFFF);
					local139 = local133.aByte117;
					local141 = local133.aByte120;
				}
			}
			@Pc(237) boolean local237 = arg1.aByteArray27 != null && arg1.aByteArray27[local131] != 0 || local133 != null && !local133.aBoolean696 | local133.aBoolean702;
			if ((local123 || local237) && arg1.aByteArray28 != null) {
				local135 += arg1.aByteArray28[local131] << 17;
			}
			if (local237) {
				local135 += 65536;
			}
			local135 += (local139 & 0xFF) << 8;
			local135 += local141 & 0xFF;
			local281 = local137 + ((local189 & 0xFFFF) << 16);
			@Pc(287) int local287 = local281 + (local125 & 0xFFFF);
			local111[local125] = ((long) local135 << 32) + (long) local287;
			this.aBoolean356 |= local237;
		}
		Static438.method6351(local111, local15);
		this.anInt4429 = arg1.anInt2348;
		this.anIntArray286 = arg1.anIntArray155;
		this.anInt4444 = arg1.anInt2343;
		this.aShortArray87 = arg1.aShortArray28;
		this.anIntArray285 = arg1.anIntArray152;
		this.anIntArray283 = arg1.anIntArray148;
		@Pc(344) Class108[] local344 = new Class108[this.anInt4444];
		this.aClass139Array2 = arg1.aClass139Array1;
		this.aClass270Array2 = arg1.aClass270Array1;
		@Pc(372) int local372;
		@Pc(386) int local386;
		if (arg1.aClass214Array1 != null) {
			this.anInt4459 = arg1.aClass214Array1.length;
			this.aClass219Array1 = new Class219[this.anInt4459];
			this.aClass242Array1 = new Class242[this.anInt4459];
			for (local372 = 0; local372 < this.anInt4459; local372++) {
				@Pc(379) Class214 local379 = arg1.aClass214Array1[local372];
				@Pc(384) Class55 local384 = Static276.method3098(local379.anInt5958);
				local386 = -1;
				for (@Pc(388) int local388 = 0; local388 < this.anInt4475; local388++) {
					if (local15[local388] == local379.anInt5956) {
						local386 = local388;
						break;
					}
				}
				if (local386 == -1) {
					throw new RuntimeException();
				}
				local146 = Static250.anIntArray314[arg1.aShortArray36[local379.anInt5956] & 0xFFFF] & 0xFFFFFF;
				local146 |= 255 - (arg1.aByteArray27 == null ? 0 : arg1.aByteArray27[local379.anInt5956]) << 24;
				this.aClass242Array1[local372] = new Class242(local386, arg1.aShortArray35[local379.anInt5956], arg1.aShortArray31[local379.anInt5956], arg1.aShortArray27[local379.anInt5956], local384.anInt1474, local384.anInt1480, local384.anInt1476, local384.anInt1473, local384.anInt1479, local384.aBoolean108, local384.aBoolean107, local379.anInt5954);
				this.aClass219Array1[local372] = new Class219(local146);
			}
		}
		local372 = this.anInt4475 * 3;
		this.aFloatArray38 = new float[local372];
		this.aFloatArray39 = new float[local372];
		this.aShortArray81 = new short[this.anInt4475];
		this.aShortArray79 = new short[this.anInt4475];
		this.aShortArray89 = new short[this.anInt4475];
		this.aShort48 = (short) arg4;
		this.aShortArray88 = new short[this.anInt4475];
		if (arg1.aShortArray34 != null) {
			this.aShortArray83 = new short[this.anInt4475];
		}
		this.aShort49 = (short) arg3;
		this.aShortArray85 = new short[local372];
		this.aShortArray86 = new short[this.anInt4475];
		this.aShortArray84 = new short[local372];
		this.aByteArray53 = new byte[local372];
		this.aShortArray77 = new short[local372];
		this.aShortArray82 = new short[local372];
		this.aShortArray80 = new short[local372];
		Static479.aLongArray12 = new long[local372];
		this.aShortArray78 = new short[local372];
		this.aByteArray52 = new byte[this.anInt4475];
		local135 = 0;
		for (local281 = 0; local281 < arg1.anInt2343; local281++) {
			local386 = this.anIntArray282[local281];
			this.anIntArray282[local281] = local135;
			local135 += local386;
			local344[local281] = new Class108();
		}
		this.anIntArray282[arg1.anInt2343] = local135;
		@Pc(628) int[] local628 = null;
		@Pc(630) int[] local630 = null;
		@Pc(632) int[] local632 = null;
		@Pc(634) float[][] local634 = null;
		@Pc(652) int[] local652;
		@Pc(660) int local660;
		@Pc(695) int local695;
		@Pc(701) int local701;
		@Pc(715) int local715;
		@Pc(717) int local717;
		@Pc(753) int local753;
		@Pc(758) int local758;
		@Pc(933) float local933;
		@Pc(918) float local918;
		@Pc(927) float local927;
		if (arg1.aByteArray26 != null) {
			@Pc(640) int local640 = arg1.anInt2356;
			@Pc(643) int[] local643 = new int[local640];
			@Pc(646) int[] local646 = new int[local640];
			@Pc(649) int[] local649 = new int[local640];
			local652 = new int[local640];
			@Pc(655) int[] local655 = new int[local640];
			@Pc(658) int[] local658 = new int[local640];
			for (local660 = 0; local660 < local640; local660++) {
				local643[local660] = Integer.MAX_VALUE;
				local646[local660] = -2147483647;
				local649[local660] = Integer.MAX_VALUE;
				local652[local660] = -2147483647;
				local655[local660] = Integer.MAX_VALUE;
				local658[local660] = -2147483647;
			}
			local634 = new float[local640][];
			for (local695 = 0; local695 < this.anInt4475; local695++) {
				local701 = local15[local695];
				if (arg1.aByteArray26[local701] != -1) {
					local715 = arg1.aByteArray26[local701] & 0xFF;
					for (local717 = 0; local717 < 3; local717++) {
						@Pc(734) short local734;
						if (local717 == 0) {
							local734 = arg1.aShortArray35[local701];
						} else if (local717 == 1) {
							local734 = arg1.aShortArray31[local701];
						} else {
							local734 = arg1.aShortArray27[local701];
						}
						local753 = arg1.anIntArray148[local734];
						local758 = arg1.anIntArray155[local734];
						@Pc(763) int local763 = arg1.anIntArray152[local734];
						if (local753 < local643[local715]) {
							local643[local715] = local753;
						}
						if (local753 > local646[local715]) {
							local646[local715] = local753;
						}
						if (local758 < local649[local715]) {
							local649[local715] = local758;
						}
						if (local652[local715] < local758) {
							local652[local715] = local758;
						}
						if (local763 < local655[local715]) {
							local655[local715] = local763;
						}
						if (local763 > local658[local715]) {
							local658[local715] = local763;
						}
					}
				}
			}
			local630 = new int[local640];
			local628 = new int[local640];
			local632 = new int[local640];
			for (local701 = 0; local701 < local640; local701++) {
				@Pc(860) byte local860 = arg1.aByteArray30[local701];
				if (local860 > 0) {
					local628[local701] = (local643[local701] + local646[local701]) / 2;
					local630[local701] = (local649[local701] + local652[local701]) / 2;
					local632[local701] = (local658[local701] + local655[local701]) / 2;
					if (local860 == 1) {
						local758 = arg1.anIntArray153[local701];
						local918 = 64.0F / (float) arg1.anIntArray146[local701];
						if (local758 == 0) {
							local927 = 1.0F;
							local933 = 1.0F;
						} else if (local758 <= 0) {
							local927 = 1.0F;
							local933 = (float) -local758 / 1024.0F;
						} else {
							local927 = (float) local758 / 1024.0F;
							local933 = 1.0F;
						}
					} else if (local860 == 2) {
						local918 = 64.0F / (float) arg1.anIntArray146[local701];
						local933 = 64.0F / (float) arg1.anIntArray153[local701];
						local927 = 64.0F / (float) arg1.anIntArray150[local701];
					} else {
						local918 = (float) arg1.anIntArray146[local701] / 1024.0F;
						local933 = (float) arg1.anIntArray153[local701] / 1024.0F;
						local927 = (float) arg1.anIntArray150[local701] / 1024.0F;
					}
					local634[local701] = Static173.method2984(local918, local927, arg1.aByteArray32[local701] & 0xFF, local933, arg1.aShortArray29[local701], arg1.aShortArray32[local701], arg1.aShortArray30[local701]);
				}
			}
		}
		@Pc(1037) Class143[] local1037 = new Class143[arg1.anInt2351];
		@Pc(1056) short local1056;
		@Pc(1067) int local1067;
		@Pc(1077) int local1077;
		for (@Pc(1039) int local1039 = 0; local1039 < arg1.anInt2351; local1039++) {
			@Pc(1046) short local1046 = arg1.aShortArray35[local1039];
			@Pc(1051) short local1051 = arg1.aShortArray31[local1039];
			local1056 = arg1.aShortArray27[local1039];
			local1067 = this.anIntArray283[local1051] - this.anIntArray283[local1046];
			local1077 = this.anIntArray286[local1051] - this.anIntArray286[local1046];
			local660 = this.anIntArray285[local1051] - this.anIntArray285[local1046];
			local695 = this.anIntArray283[local1056] - this.anIntArray283[local1046];
			local701 = this.anIntArray286[local1056] - this.anIntArray286[local1046];
			local715 = this.anIntArray285[local1056] - this.anIntArray285[local1046];
			local717 = local715 * local1077 - local701 * local660;
			@Pc(1137) int local1137 = local660 * local695 - local715 * local1067;
			for (local753 = local701 * local1067 - local695 * local1077; local717 > 8192 || local1137 > 8192 || local753 > 8192 || local717 < -8192 || local1137 < -8192 || local753 < -8192; local753 >>= 0x1) {
				local1137 >>= 0x1;
				local717 >>= 0x1;
			}
			local758 = (int) Math.sqrt((double) (local753 * local753 + local1137 * local1137 + local717 * local717));
			if (local758 <= 0) {
				local758 = 1;
			}
			local717 = local717 * 256 / local758;
			local1137 = local1137 * 256 / local758;
			local753 = local753 * 256 / local758;
			@Pc(1231) byte local1231 = arg1.aByteArray31 == null ? 0 : arg1.aByteArray31[local1039];
			if (local1231 == 0) {
				@Pc(1261) Class108 local1261 = local344[local1046];
				local1261.anInt2840 += local717;
				local1261.anInt2842 += local1137;
				local1261.anInt2839 += local753;
				local1261.anInt2841++;
				@Pc(1289) Class108 local1289 = local344[local1051];
				local1289.anInt2842 += local1137;
				local1289.anInt2841++;
				local1289.anInt2840 += local717;
				local1289.anInt2839 += local753;
				@Pc(1317) Class108 local1317 = local344[local1056];
				local1317.anInt2839 += local753;
				local1317.anInt2840 += local717;
				local1317.anInt2841++;
				local1317.anInt2842 += local1137;
			} else if (local1231 == 1) {
				@Pc(1246) Class143 local1246 = local1037[local1039] = new Class143();
				local1246.anInt3974 = local753;
				local1246.anInt3972 = local717;
				local1246.anInt3970 = local1137;
			}
		}
		@Pc(1354) int local1354;
		for (@Pc(1348) int local1348 = 0; local1348 < this.anInt4475; local1348++) {
			local1354 = local15[local1348];
			@Pc(1361) int local1361 = arg1.aShortArray36[local1354] & 0xFFFF;
			@Pc(1366) short local1366;
			if (arg1.aShortArray33 == null) {
				local1366 = -1;
			} else {
				local1366 = arg1.aShortArray33[local1354];
			}
			if (arg1.aByteArray26 == null) {
				local1077 = -1;
			} else {
				local1077 = arg1.aByteArray26[local1354];
			}
			if (arg1.aByteArray27 == null) {
				local660 = 0;
			} else {
				local660 = arg1.aByteArray27[local1354] & 0xFF;
			}
			@Pc(1401) float local1401 = 0.0F;
			@Pc(1403) float local1403 = 0.0F;
			@Pc(1405) float local1405 = 0.0F;
			local933 = 0.0F;
			local918 = 0.0F;
			local927 = 0.0F;
			@Pc(1413) byte local1413 = 0;
			@Pc(1415) byte local1415 = 0;
			@Pc(1417) int local1417 = 0;
			@Pc(1432) byte local1432;
			@Pc(1449) short local1449;
			@Pc(2185) short local2185;
			@Pc(2190) short local2190;
			if (local1366 != -1) {
				if (local1077 == -1) {
					local933 = 1.0F;
					local1405 = 1.0F;
					local927 = 0.0F;
					local1415 = 2;
					local1413 = 1;
					local1403 = 1.0F;
					local918 = 0.0F;
					local1401 = 0.0F;
				} else {
					local1077 &= 0xFF;
					local1432 = arg1.aByteArray30[local1077];
					@Pc(1439) short local1439;
					@Pc(1444) short local1444;
					@Pc(1478) float local1478;
					@Pc(1684) float local1684;
					@Pc(1692) float local1692;
					@Pc(1789) float local1789;
					@Pc(1797) float local1797;
					@Pc(1805) float local1805;
					@Pc(1828) float local1828;
					@Pc(1851) float local1851;
					@Pc(1874) float local1874;
					if (local1432 == 0) {
						local1439 = arg1.aShortArray35[local1354];
						local1444 = arg1.aShortArray31[local1354];
						local1449 = arg1.aShortArray27[local1354];
						local2185 = arg1.aShortArray30[local1077];
						local2190 = arg1.aShortArray29[local1077];
						@Pc(2195) short local2195 = arg1.aShortArray32[local1077];
						@Pc(2201) float local2201 = (float) arg1.anIntArray148[local2185];
						@Pc(2207) float local2207 = (float) arg1.anIntArray155[local2185];
						local1478 = arg1.anIntArray152[local2185];
						local1684 = (float) arg1.anIntArray148[local2190] - local2201;
						local1692 = (float) arg1.anIntArray155[local2190] - local2207;
						@Pc(2239) float local2239 = (float) arg1.anIntArray152[local2190] - local1478;
						@Pc(2247) float local2247 = (float) arg1.anIntArray148[local2195] - local2201;
						@Pc(2256) float local2256 = (float) arg1.anIntArray155[local2195] - local2207;
						@Pc(2264) float local2264 = (float) arg1.anIntArray152[local2195] - local1478;
						@Pc(2273) float local2273 = (float) arg1.anIntArray148[local1439] - local2201;
						@Pc(2282) float local2282 = (float) arg1.anIntArray155[local1439] - local2207;
						@Pc(2290) float local2290 = (float) arg1.anIntArray152[local1439] - local1478;
						@Pc(2298) float local2298 = (float) arg1.anIntArray148[local1444] - local2201;
						@Pc(2307) float local2307 = (float) arg1.anIntArray155[local1444] - local2207;
						local1789 = (float) arg1.anIntArray152[local1444] - local1478;
						local1797 = (float) arg1.anIntArray148[local1449] - local2201;
						local1805 = (float) arg1.anIntArray155[local1449] - local2207;
						local1828 = (float) arg1.anIntArray152[local1449] - local1478;
						local1851 = local1692 * local2264 - local2256 * local2239;
						local1874 = local2247 * local2239 - local2264 * local1684;
						@Pc(2363) float local2363 = local1684 * local2256 - local1692 * local2247;
						@Pc(2371) float local2371 = local2256 * local2363 - local2264 * local1874;
						@Pc(2380) float local2380 = local1851 * local2264 - local2247 * local2363;
						@Pc(2389) float local2389 = local1874 * local2247 - local1851 * local2256;
						@Pc(2403) float local2403 = 1.0F / (local2239 * local2389 + local2380 * local1692 + local1684 * local2371);
						local1405 = local2403 * (local2371 * local2298 + local2380 * local2307 + local1789 * local2389);
						local918 = (local2371 * local1797 + local2380 * local1805 + local1828 * local2389) * local2403;
						local1401 = (local2380 * local2282 + local2371 * local2273 + local2290 * local2389) * local2403;
						@Pc(2453) float local2453 = local1874 * local1684 - local1692 * local1851;
						@Pc(2462) float local2462 = local1692 * local2363 - local1874 * local2239;
						@Pc(2471) float local2471 = local1851 * local2239 - local2363 * local1684;
						@Pc(2485) float local2485 = 1.0F / (local2264 * local2453 + local2256 * local2471 + local2462 * local2247);
						local927 = (local2471 * local1805 + local2462 * local1797 + local2453 * local1828) * local2485;
						local1403 = (local2453 * local2290 + local2273 * local2462 + local2471 * local2282) * local2485;
						local933 = local2485 * (local2453 * local1789 + local2462 * local2298 + local2471 * local2307);
					} else {
						local1439 = arg1.aShortArray35[local1354];
						local1444 = arg1.aShortArray31[local1354];
						local1449 = arg1.aShortArray27[local1354];
						@Pc(1453) int local1453 = local628[local1077];
						@Pc(1457) int local1457 = local630[local1077];
						@Pc(1461) int local1461 = local632[local1077];
						@Pc(1465) float[] local1465 = local634[local1077];
						@Pc(1470) byte local1470 = arg1.aByteArray29[local1077];
						local1478 = (float) arg1.anIntArray154[local1077] / 256.0F;
						if (local1432 == 1) {
							local1684 = (float) arg1.anIntArray150[local1077] / 1024.0F;
							Static572.method7724(arg1.anIntArray155[local1439], local1470, local1453, local1478, arg1.anIntArray152[local1439], local1684, arg1.anIntArray148[local1439], local1461, local1465, local1457);
							local1401 = Static318.aFloat169;
							local1403 = Static148.aFloat101;
							Static572.method7724(arg1.anIntArray155[local1444], local1470, local1453, local1478, arg1.anIntArray152[local1444], local1684, arg1.anIntArray148[local1444], local1461, local1465, local1457);
							local1405 = Static318.aFloat169;
							local933 = Static148.aFloat101;
							Static572.method7724(arg1.anIntArray155[local1449], local1470, local1453, local1478, arg1.anIntArray152[local1449], local1684, arg1.anIntArray148[local1449], local1461, local1465, local1457);
							local918 = Static318.aFloat169;
							local927 = Static148.aFloat101;
							local1692 = local1684 / 2.0F;
							if ((local1470 & 0x1) == 0) {
								if (local918 - local1401 > local1692) {
									local918 -= local1684;
									local1415 = 1;
								} else if (local1692 < local1401 - local918) {
									local1415 = 2;
									local918 += local1684;
								}
								if (local1692 < local1405 - local1401) {
									local1405 -= local1684;
									local1413 = 1;
								} else if (local1692 < local1401 - local1405) {
									local1405 += local1684;
									local1413 = 2;
								}
							} else {
								if (local927 - local1403 > local1692) {
									local927 -= local1684;
									local1415 = 1;
								} else if (local1403 - local927 > local1692) {
									local927 += local1684;
									local1415 = 2;
								}
								if (local1692 < local933 - local1403) {
									local933 -= local1684;
									local1413 = 1;
								} else if (local1692 < local1403 - local933) {
									local933 += local1684;
									local1413 = 2;
								}
							}
						} else if (local1432 == 2) {
							local1684 = (float) arg1.anIntArray147[local1077] / 256.0F;
							local1692 = (float) arg1.anIntArray145[local1077] / 256.0F;
							@Pc(1703) int local1703 = arg1.anIntArray148[local1444] - arg1.anIntArray148[local1439];
							@Pc(1713) int local1713 = arg1.anIntArray155[local1444] - arg1.anIntArray155[local1439];
							@Pc(1723) int local1723 = arg1.anIntArray152[local1444] - arg1.anIntArray152[local1439];
							@Pc(1734) int local1734 = arg1.anIntArray148[local1449] - arg1.anIntArray148[local1439];
							@Pc(1745) int local1745 = arg1.anIntArray155[local1449] - arg1.anIntArray155[local1439];
							@Pc(1756) int local1756 = arg1.anIntArray152[local1449] - arg1.anIntArray152[local1439];
							@Pc(1764) int local1764 = local1713 * local1756 - local1723 * local1745;
							@Pc(1772) int local1772 = local1723 * local1734 - local1703 * local1756;
							@Pc(1781) int local1781 = local1703 * local1745 - local1734 * local1713;
							local1789 = 64.0F / (float) arg1.anIntArray153[local1077];
							local1797 = 64.0F / (float) arg1.anIntArray146[local1077];
							local1805 = 64.0F / (float) arg1.anIntArray150[local1077];
							local1828 = (local1465[2] * (float) local1781 + (float) local1772 * local1465[1] + local1465[0] * (float) local1764) / local1789;
							local1851 = ((float) local1781 * local1465[5] + (float) local1772 * local1465[4] + (float) local1764 * local1465[3]) / local1797;
							local1874 = ((float) local1781 * local1465[8] + local1465[6] * (float) local1764 + (float) local1772 * local1465[7]) / local1805;
							local1417 = Static18.method324(local1851, local1874, local1828);
							Static409.method5955(local1478, local1461, local1692, local1457, local1417, local1470, arg1.anIntArray155[local1439], local1465, local1453, arg1.anIntArray148[local1439], arg1.anIntArray152[local1439], local1684);
							local1403 = Static119.aFloat63;
							local1401 = Static576.aFloat249;
							Static409.method5955(local1478, local1461, local1692, local1457, local1417, local1470, arg1.anIntArray155[local1444], local1465, local1453, arg1.anIntArray148[local1444], arg1.anIntArray152[local1444], local1684);
							local1405 = Static576.aFloat249;
							local933 = Static119.aFloat63;
							Static409.method5955(local1478, local1461, local1692, local1457, local1417, local1470, arg1.anIntArray155[local1449], local1465, local1453, arg1.anIntArray148[local1449], arg1.anIntArray152[local1449], local1684);
							local927 = Static119.aFloat63;
							local918 = Static576.aFloat249;
						} else if (local1432 == 3) {
							Static283.method4212(local1470, local1465, local1478, local1457, local1453, arg1.anIntArray152[local1439], arg1.anIntArray148[local1439], arg1.anIntArray155[local1439], local1461);
							local1401 = Static307.aFloat150;
							local1403 = Static181.aFloat122;
							Static283.method4212(local1470, local1465, local1478, local1457, local1453, arg1.anIntArray152[local1444], arg1.anIntArray148[local1444], arg1.anIntArray155[local1444], local1461);
							local1405 = Static307.aFloat150;
							local933 = Static181.aFloat122;
							Static283.method4212(local1470, local1465, local1478, local1457, local1453, arg1.anIntArray152[local1449], arg1.anIntArray148[local1449], arg1.anIntArray155[local1449], local1461);
							local918 = Static307.aFloat150;
							local927 = Static181.aFloat122;
							if ((local1470 & 0x1) == 0) {
								if (local1405 - local1401 > 0.5F) {
									local1413 = 1;
									local1405--;
								} else if (local1401 - local1405 > 0.5F) {
									local1413 = 2;
									local1405++;
								}
								if (local918 - local1401 > 0.5F) {
									local918--;
									local1415 = 1;
								} else if (local1401 - local918 > 0.5F) {
									local1415 = 2;
									local918++;
								}
							} else {
								if (local927 - local1403 > 0.5F) {
									local1415 = 1;
									local927--;
								} else if (local1403 - local927 > 0.5F) {
									local927++;
									local1415 = 2;
								}
								if (local933 - local1403 > 0.5F) {
									local933--;
									local1413 = 1;
								} else if (local1403 - local933 > 0.5F) {
									local1413 = 2;
									local933++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray31 == null) {
				local1432 = 0;
			} else {
				local1432 = arg1.aByteArray31[local1354];
			}
			if (local1432 == 0) {
				@Pc(2580) long local2580 = (long) (local1077 << 2) + ((long) local660 + (long) (local1361 << 8) + (long) (local1417 << 24) << 32);
				local1449 = arg1.aShortArray35[local1354];
				local2185 = arg1.aShortArray31[local1354];
				local2190 = arg1.aShortArray27[local1354];
				@Pc(2599) Class108 local2599 = local344[local1449];
				this.aShortArray81[local1348] = this.method3696(local2599.anInt2840, local2599.anInt2841, local1401, local2580, arg1, local2599.anInt2842, local1449, local1403, local1348, local2599.anInt2839);
				@Pc(2624) Class108 local2624 = local344[local2185];
				this.aShortArray79[local1348] = this.method3696(local2624.anInt2840, local2624.anInt2841, local1405, local2580 + (long) local1413, arg1, local2624.anInt2842, local2185, local933, local1348, local2624.anInt2839);
				@Pc(2652) Class108 local2652 = local344[local2190];
				this.aShortArray88[local1348] = this.method3696(local2652.anInt2840, local2652.anInt2841, local918, local2580 + (long) local1415, arg1, local2652.anInt2842, local2190, local927, local1348, local2652.anInt2839);
			} else if (local1432 == 1) {
				@Pc(2687) Class143 local2687 = local1037[local1354];
				@Pc(2733) long local2733 = (long) ((local2687.anInt3970 + 256 << 12) + (local1077 << 2) + (local2687.anInt3972 > 0 ? 1024 : 2048) + (local2687.anInt3974 - -256 << 22)) + ((long) (local1417 << 24) + (long) (local1361 << 8) + (long) local660 << 32);
				this.aShortArray81[local1348] = this.method3696(local2687.anInt3972, 0, local1401, local2733, arg1, local2687.anInt3970, arg1.aShortArray35[local1354], local1403, local1348, local2687.anInt3974);
				this.aShortArray79[local1348] = this.method3696(local2687.anInt3972, 0, local1405, local2733 + (long) local1413, arg1, local2687.anInt3970, arg1.aShortArray31[local1354], local933, local1348, local2687.anInt3974);
				this.aShortArray88[local1348] = this.method3696(local2687.anInt3972, 0, local918, (long) local1415 + local2733, arg1, local2687.anInt3970, arg1.aShortArray27[local1354], local927, local1348, local2687.anInt3974);
			}
			if (arg1.aShortArray33 == null) {
				this.aShortArray86[local1348] = -1;
			} else {
				this.aShortArray86[local1348] = arg1.aShortArray33[local1354];
			}
			if (arg1.aByteArray27 != null) {
				this.aByteArray52[local1348] = arg1.aByteArray27[local1354];
			}
			if (arg1.aShortArray34 != null) {
				this.aShortArray83[local1348] = arg1.aShortArray34[local1354];
			}
			this.aShortArray89[local1348] = arg1.aShortArray36[local1354];
		}
		if (this.anInt4425 > 0) {
			local1354 = 1;
			local1056 = this.aShortArray86[0];
			for (local1067 = 0; local1067 < this.anInt4425; local1067++) {
				@Pc(2883) short local2883 = this.aShortArray86[local1067];
				if (local1056 != local2883) {
					local1056 = local2883;
					local1354++;
				}
			}
			this.anIntArray288 = new int[local1354];
			this.anIntArray284 = new int[local1354 + 1];
			this.anIntArray287 = new int[local1354];
			this.anIntArray284[0] = 0;
			local1077 = this.anInt4437;
			local1354 = 0;
			@Pc(2924) short local2924 = 0;
			local1056 = this.aShortArray86[0];
			for (local695 = 0; local695 < this.anInt4425; local695++) {
				@Pc(2938) short local2938 = this.aShortArray86[local695];
				if (local2938 != local1056) {
					this.anIntArray287[local1354] = local1077;
					this.anIntArray288[local1354] = local2924 + 1 - local1077;
					local1354++;
					this.anIntArray284[local1354] = local695;
					local1077 = this.anInt4437;
					local1056 = local2938;
					local2924 = 0;
				}
				@Pc(2978) short local2978 = this.aShortArray81[local695];
				if (local2924 < local2978) {
					local2924 = local2978;
				}
				if (local1077 > local2978) {
					local1077 = local2978;
				}
				local2978 = this.aShortArray79[local695];
				if (local1077 > local2978) {
					local1077 = local2978;
				}
				if (local2978 > local2924) {
					local2924 = local2978;
				}
				local2978 = this.aShortArray88[local695];
				if (local2978 > local2924) {
					local2924 = local2978;
				}
				if (local1077 > local2978) {
					local1077 = local2978;
				}
			}
			this.anIntArray287[local1354] = local1077;
			this.anIntArray288[local1354] = local2924 + 1 - local1077;
			local1354++;
			this.anIntArray284[local1354] = this.anInt4425;
		}
		Static479.aLongArray12 = null;
		this.aShortArray77 = Static173.method2985(this.aShortArray77, this.anInt4437);
		this.aShortArray84 = Static173.method2985(this.aShortArray84, this.anInt4437);
		this.aShortArray82 = Static173.method2985(this.aShortArray82, this.anInt4437);
		this.aShortArray80 = Static173.method2985(this.aShortArray80, this.anInt4437);
		this.aShortArray78 = Static173.method2985(this.aShortArray78, this.anInt4437);
		this.aByteArray53 = Static93.method1455(this.anInt4437, this.aByteArray53);
		this.aFloatArray39 = Static232.method3614(this.anInt4437, this.aFloatArray39);
		this.aFloatArray38 = Static232.method3614(this.anInt4437, this.aFloatArray38);
		if (arg1.anIntArray151 != null && Static227.method3535(this.anInt4472, arg2)) {
			this.anIntArrayArray27 = arg1.method1757(false);
		}
		if (arg1.aClass214Array1 != null && Static318.method4930(arg2, this.anInt4472)) {
			this.anIntArrayArray25 = arg1.method1768();
		}
		if (arg1.anIntArray149 != null && Static164.method2882(this.anInt4472, arg2)) {
			local1354 = 0;
			local652 = new int[256];
			for (local1067 = 0; local1067 < this.anInt4475; local1067++) {
				local1077 = arg1.anIntArray149[local15[local1067]];
				if (local1077 >= 0) {
					@Pc(3179) int local3179 = local652[local1077]++;
					if (local1354 < local1077) {
						local1354 = local1077;
					}
				}
			}
			this.anIntArrayArray26 = new int[local1354 + 1][];
			for (local1077 = 0; local1077 <= local1354; local1077++) {
				this.anIntArrayArray26[local1077] = new int[local652[local1077]];
				local652[local1077] = 0;
			}
			for (local660 = 0; local660 < this.anInt4475; local660++) {
				local695 = arg1.anIntArray149[local15[local660]];
				if (local695 >= 0) {
					this.anIntArrayArray26[local695][local652[local695]++] = local660;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!en;IIZZ)V")
	public Class66_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean355 = false;
		this.aBoolean356 = false;
		this.anInt4429 = 0;
		this.anInt4444 = 0;
		this.anInt4437 = 0;
		this.aBoolean357 = false;
		this.anInt4475 = 0;
		this.anInt4425 = 0;
		this.aBoolean358 = true;
		this.anInt4432 = arg1;
		this.anInt4472 = arg2;
		this.aBoolean357 = arg4;
		this.aClass100_Sub1_11 = arg0;
		if (arg3 || Static374.method5547(this.anInt4472, this.anInt4432)) {
			this.aClass126_1 = new Class126(Static379.method5606(this.anInt4432, this.anInt4472));
		}
		if (arg3 || Static242.method3758(this.anInt4472, this.anInt4432)) {
			this.aClass126_3 = new Class126(Static287.method4272(this.anInt4472, this.anInt4432));
		}
		if (arg3 || Static480.method6784(this.anInt4472, this.anInt4432)) {
			this.aClass126_2 = new Class126(Static263.method4046(this.anInt4432, this.anInt4472));
		}
		if (arg3 || Static176.method3014(this.anInt4432, this.anInt4472)) {
			this.aClass126_4 = new Class126(Static41.method700(this.anInt4472, this.anInt4432));
		}
		if (arg3 || Static490.method6858(this.anInt4432, this.anInt4472)) {
			this.aClass118_1 = new Class118(Static384.method7165(this.anInt4432, this.anInt4472));
		}
	}

	@OriginalMember(owner = "client!ja", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean355) {
			this.method3701();
		}
		return this.anInt4476;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!q;Lclient!pba;II)V")
	@Override
	public void method7556(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class6_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4437 == 0) {
			return;
		}
		@Pc(16) Class68_Sub2 local16 = this.aClass100_Sub1_11.aClass68_Sub2_16;
		@Pc(19) Class68_Sub2 local19 = (Class68_Sub2) arg0;
		if (!this.aBoolean355) {
			this.method3701();
		}
		Static103.aFloat55 = local16.aFloat183 + local16.aFloat186 * local19.aFloat183 + local19.aFloat182 * local16.aFloat185 + local19.aFloat180 * local16.aFloat190;
		Static593.aFloat268 = local16.aFloat190 * local19.aFloat188 + local19.aFloat181 * local16.aFloat185 + local16.aFloat186 * local19.aFloat190;
		@Pc(72) float local72 = Static593.aFloat268 * (float) this.anInt4476 + Static103.aFloat55;
		@Pc(80) float local80 = (float) this.anInt4449 * Static593.aFloat268 + Static103.aFloat55;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local97 = (float) this.anInt4446 + local72;
			local91 = local80 - (float) this.anInt4446;
		} else {
			local91 = (float) -this.anInt4446 + local72;
			local97 = (float) this.anInt4446 + local80;
		}
		if (local91 >= this.aClass100_Sub1_11.aFloat164 || (float) this.aClass100_Sub1_11.anInt5786 >= local97) {
			return;
		}
		Static586.aFloat266 = local16.aFloat187 * local19.aFloat181 + local16.aFloat181 * local19.aFloat188 + local16.aFloat191 * local19.aFloat190;
		Static112.aFloat60 = local19.aFloat183 * local16.aFloat191 + local19.aFloat180 * local16.aFloat181 + local16.aFloat187 * local19.aFloat182 + local16.aFloat182;
		@Pc(173) float local173 = (float) this.anInt4476 * Static586.aFloat266 + Static112.aFloat60;
		@Pc(181) float local181 = Static112.aFloat60 + (float) this.anInt4449 * Static586.aFloat266;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local173 > local181) {
			local197 = (float) this.aClass100_Sub1_11.anInt5755 * ((float) -this.anInt4446 + local181);
			local208 = (float) this.aClass100_Sub1_11.anInt5755 * (local173 + (float) this.anInt4446);
		} else {
			local208 = (float) this.aClass100_Sub1_11.anInt5755 * ((float) this.anInt4446 + local181);
			local197 = ((float) -this.anInt4446 + local173) * (float) this.aClass100_Sub1_11.anInt5755;
		}
		if (this.aClass100_Sub1_11.aFloat155 <= local197 / (float) arg2 || this.aClass100_Sub1_11.aFloat160 >= local208 / (float) arg2) {
			return;
		}
		Static109.aFloat59 = local19.aFloat190 * local16.aFloat184 + local19.aFloat188 * local16.aFloat188 + local19.aFloat181 * local16.aFloat189;
		Static228.aFloat130 = local16.aFloat180 + local19.aFloat180 * local16.aFloat188 + local19.aFloat182 * local16.aFloat189 + local16.aFloat184 * local19.aFloat183;
		@Pc(300) float local300 = Static228.aFloat130 + (float) this.anInt4476 * Static109.aFloat59;
		@Pc(308) float local308 = Static228.aFloat130 + Static109.aFloat59 * (float) this.anInt4449;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local300 > local308) {
			local323 = (float) this.aClass100_Sub1_11.anInt5774 * (local308 - (float) this.anInt4446);
			local334 = ((float) this.anInt4446 + local300) * (float) this.aClass100_Sub1_11.anInt5774;
		} else {
			local323 = (float) this.aClass100_Sub1_11.anInt5774 * (local300 - (float) this.anInt4446);
			local334 = ((float) this.anInt4446 + local308) * (float) this.aClass100_Sub1_11.anInt5774;
		}
		if (local323 / (float) arg2 >= this.aClass100_Sub1_11.aFloat153 || this.aClass100_Sub1_11.aFloat158 >= local334 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass242Array1 != null) {
			Static484.aFloat252 = local16.aFloat191 * local19.aFloat185 + local16.aFloat181 * local19.aFloat189 + local19.aFloat187 * local16.aFloat187;
			Static454.aFloat238 = local19.aFloat185 * local16.aFloat186 + local16.aFloat190 * local19.aFloat189 + local19.aFloat187 * local16.aFloat185;
			Static67.aFloat28 = local16.aFloat191 * local19.aFloat186 + local16.aFloat187 * local19.aFloat191 + local19.aFloat184 * local16.aFloat181;
			Static351.aFloat193 = local19.aFloat186 * local16.aFloat184 + local16.aFloat189 * local19.aFloat191 + local19.aFloat184 * local16.aFloat188;
			Static391.aFloat201 = local19.aFloat189 * local16.aFloat188 + local19.aFloat187 * local16.aFloat189 + local16.aFloat184 * local19.aFloat185;
			Static437.aFloat210 = local16.aFloat186 * local19.aFloat186 + local19.aFloat191 * local16.aFloat185 + local16.aFloat190 * local19.aFloat184;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.anInt4473 + this.anInt4423 >> 1;
			@Pc(509) int local509 = this.anInt4438 + this.anInt4453 >> 1;
			@Pc(528) int local528 = (int) (Static112.aFloat60 + (float) local501 * Static484.aFloat252 + (float) this.anInt4476 * Static586.aFloat266 + Static67.aFloat28 * (float) local509);
			@Pc(547) int local547 = (int) (Static109.aFloat59 * (float) this.anInt4476 + Static228.aFloat130 + Static391.aFloat201 * (float) local501 + (float) local509 * Static351.aFloat193);
			@Pc(566) int local566 = (int) ((float) this.anInt4476 * Static593.aFloat268 + (float) local501 * Static454.aFloat238 + Static103.aFloat55 + Static437.aFloat210 * (float) local509);
			@Pc(585) int local585 = (int) (Static67.aFloat28 * (float) local509 + Static484.aFloat252 * (float) local501 + Static112.aFloat60 + (float) this.anInt4449 * Static586.aFloat266);
			@Pc(604) int local604 = (int) ((float) this.anInt4449 * Static109.aFloat59 + Static228.aFloat130 + Static391.aFloat201 * (float) local501 + Static351.aFloat193 * (float) local509);
			arg1.anInt6923 = this.aClass100_Sub1_11.anInt5764 + local604 * this.aClass100_Sub1_11.anInt5774 / arg2;
			@Pc(636) int local636 = (int) ((float) this.anInt4449 * Static593.aFloat268 + Static454.aFloat238 * (float) local501 + Static103.aFloat55 + Static437.aFloat210 * (float) local509);
			arg1.anInt6925 = local528 * this.aClass100_Sub1_11.anInt5755 / arg2 + this.aClass100_Sub1_11.anInt5788;
			arg1.anInt6926 = this.aClass100_Sub1_11.anInt5755 * local585 / arg2 + this.aClass100_Sub1_11.anInt5788;
			arg1.anInt6922 = this.aClass100_Sub1_11.anInt5764 + local547 * this.aClass100_Sub1_11.anInt5774 / arg2;
			if (local566 >= this.aClass100_Sub1_11.anInt5786 || this.aClass100_Sub1_11.anInt5786 <= local636) {
				arg1.aBoolean539 = true;
				arg1.anInt6924 = (this.anInt4446 + local528) * this.aClass100_Sub1_11.anInt5755 / arg2 + this.aClass100_Sub1_11.anInt5788 - arg1.anInt6925;
			}
		}
		this.aClass100_Sub1_11.method4844((float) arg2);
		this.aClass100_Sub1_11.method4833();
		this.aClass100_Sub1_11.method4850(local19);
		this.method3703();
		this.method3704();
	}

	@OriginalMember(owner = "client!ja", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort48;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public void method3691() {
		if (this.aClass126_1 != null) {
			this.aClass126_1.method3016();
		}
		if (this.aClass126_3 != null) {
			this.aClass126_3.method3016();
		}
		if (this.aClass126_2 != null) {
			this.aClass126_2.method3016();
		}
		if (this.aClass126_4 != null) {
			this.aClass126_4.method3016();
		}
		if (this.aClass118_1 != null) {
			this.aClass118_1.method2488();
		}
	}

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static237.anInt8063 = 0;
			Static72.anInt1637 = 0;
			Static427.anInt7296 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray27.length > local41) {
					local55 = this.anIntArrayArray27[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray87 == null || (arg6 & this.aShortArray87[local63]) != 0) {
							Static72.anInt1637 += this.anIntArray283[local63];
							Static237.anInt8063 += this.anIntArray286[local63];
							local33++;
							Static427.anInt7296 += this.anIntArray285[local63];
						}
					}
				}
			}
			if (local33 <= 0) {
				Static237.anInt8063 = arg3;
				Static72.anInt1637 = arg2;
				Static427.anInt7296 = arg4;
			} else {
				Static427.anInt7296 = Static427.anInt7296 / local33 + arg4;
				Static72.anInt1637 = Static72.anInt1637 / local33 + arg2;
				Static237.anInt8063 = Static237.anInt8063 / local33 + arg3;
				Static421.aBoolean620 = true;
			}
			return;
		}
		@Pc(253) int[] local253;
		@Pc(255) int local255;
		if (arg0 == 1) {
			if (arg7 != null) {
				local33 = arg7[1] * arg3 + arg2 * arg7[0] + arg7[2] * arg4 + 8192 >> 14;
				local35 = arg2 * arg7[3] + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local41 = arg7[8] * arg4 + arg3 * arg7[7] + arg7[6] * arg2 + 8192 >> 14;
				arg4 = local41;
				arg3 = local35;
				arg2 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray27.length > local35) {
					local253 = this.anIntArrayArray27[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local57 = local253[local255];
						if (this.aShortArray87 == null || (arg6 & this.aShortArray87[local57]) != 0) {
							this.anIntArray283[local57] += arg2;
							this.anIntArray286[local57] += arg3;
							this.anIntArray285[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(391) int local391;
		@Pc(410) int local410;
		@Pc(640) int local640;
		@Pc(649) int local649;
		@Pc(662) int local662;
		@Pc(666) int local666;
		@Pc(685) int local685;
		@Pc(1009) int local1009;
		@Pc(1017) int local1017;
		@Pc(1175) int local1175;
		@Pc(1201) int local1201;
		@Pc(1206) int local1206;
		@Pc(1215) int local1215;
		@Pc(1220) int local1220;
		@Pc(1224) int local1224;
		@Pc(1228) int local1228;
		@Pc(1230) int local1230;
		@Pc(1362) int[] local1362;
		@Pc(1364) int local1364;
		@Pc(1368) int local1368;
		@Pc(1372) int local1372;
		@Pc(1374) int local1374;
		@Pc(1502) int local1502;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray27.length > local35) {
						local253 = this.anIntArrayArray27[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local57 = local253[local255];
							if (this.aShortArray87 == null || (this.aShortArray87[local57] & arg6) != 0) {
								this.anIntArray283[local57] -= Static72.anInt1637;
								this.anIntArray286[local57] -= Static237.anInt8063;
								this.anIntArray285[local57] -= Static427.anInt7296;
								if (arg4 != 0) {
									local63 = Class363.anIntArray697[arg4];
									local391 = Class363.anIntArray698[arg4];
									local410 = this.anIntArray286[local57] * local63 + this.anIntArray283[local57] * local391 + 16383 >> 14;
									this.anIntArray286[local57] = this.anIntArray286[local57] * local391 + 16383 - local63 * this.anIntArray283[local57] >> 14;
									this.anIntArray283[local57] = local410;
								}
								if (arg2 != 0) {
									local63 = Class363.anIntArray697[arg2];
									local391 = Class363.anIntArray698[arg2];
									local410 = local391 * this.anIntArray286[local57] + 16383 - this.anIntArray285[local57] * local63 >> 14;
									this.anIntArray285[local57] = local63 * this.anIntArray286[local57] + this.anIntArray285[local57] * local391 + 16383 >> 14;
									this.anIntArray286[local57] = local410;
								}
								if (arg3 != 0) {
									local63 = Class363.anIntArray697[arg3];
									local391 = Class363.anIntArray698[arg3];
									local410 = this.anIntArray285[local57] * local63 + local391 * this.anIntArray283[local57] + 16383 >> 14;
									this.anIntArray285[local57] = local391 * this.anIntArray285[local57] + 16383 - local63 * this.anIntArray283[local57] >> 14;
									this.anIntArray283[local57] = local410;
								}
								this.anIntArray283[local57] += Static72.anInt1637;
								this.anIntArray286[local57] += Static237.anInt8063;
								this.anIntArray285[local57] += Static427.anInt7296;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray27.length > local41) {
							local55 = this.anIntArrayArray27[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray87 == null || (arg6 & this.aShortArray87[local63]) != 0) {
									local391 = this.anIntArray282[local63];
									local410 = this.anIntArray282[local63 + 1];
									for (local640 = local391; local640 < local410; local640++) {
										local649 = this.aShortArray85[local640] - 1;
										if (local649 == -1) {
											break;
										}
										if (arg4 != 0) {
											local662 = Class363.anIntArray697[arg4];
											local666 = Class363.anIntArray698[arg4];
											local685 = local662 * this.aShortArray80[local649] + this.aShortArray82[local649] * local666 + 16383 >> 14;
											this.aShortArray80[local649] = (short) (local666 * this.aShortArray80[local649] + 16383 - local662 * this.aShortArray82[local649] >> 14);
											this.aShortArray82[local649] = (short) local685;
										}
										if (arg2 != 0) {
											local662 = Class363.anIntArray697[arg2];
											local666 = Class363.anIntArray698[arg2];
											local685 = this.aShortArray80[local649] * local666 + 16383 - this.aShortArray78[local649] * local662 >> 14;
											this.aShortArray78[local649] = (short) (local666 * this.aShortArray78[local649] + local662 * this.aShortArray80[local649] + 16383 >> 14);
											this.aShortArray80[local649] = (short) local685;
										}
										if (arg3 != 0) {
											local662 = Class363.anIntArray697[arg3];
											local666 = Class363.anIntArray698[arg3];
											local685 = this.aShortArray82[local649] * local666 + local662 * this.aShortArray78[local649] + 16383 >> 14;
											this.aShortArray78[local649] = (short) (this.aShortArray78[local649] * local666 + 16383 - local662 * this.aShortArray82[local649] >> 14);
											this.aShortArray82[local649] = (short) local685;
										}
									}
								}
							}
						}
					}
					this.method3706();
					return;
				}
			} else {
				local33 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local255 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static421.aBoolean620) {
					local391 = Static427.anInt7296 * arg7[6] + arg7[0] * Static72.anInt1637 + arg7[3] * Static237.anInt8063 + 8192 >> 14;
					local410 = arg7[4] * Static237.anInt8063 + Static72.anInt1637 * arg7[1] + arg7[7] * Static427.anInt7296 + 8192 >> 14;
					local410 += local57;
					local391 += local255;
					local640 = arg7[2] * Static72.anInt1637 + Static237.anInt8063 * arg7[5] + arg7[8] * Static427.anInt7296 + 8192 >> 14;
					Static72.anInt1637 = local391;
					Static237.anInt8063 = local410;
					local640 += local63;
					Static421.aBoolean620 = false;
					Static427.anInt7296 = local640;
				}
				@Pc(977) int[] local977 = new int[9];
				local410 = Class363.anIntArray698[arg2];
				local640 = Class363.anIntArray697[arg2];
				local649 = Class363.anIntArray698[arg3];
				local662 = Class363.anIntArray697[arg3];
				local666 = Class363.anIntArray698[arg4];
				local685 = Class363.anIntArray697[arg4];
				local1009 = local666 * local640 + 8192 >> 14;
				local1017 = local685 * local640 + 8192 >> 14;
				local977[4] = local666 * local410 + 8192 >> 14;
				local977[6] = local649 * local1017 + local666 * -local662 + 8192 >> 14;
				local977[5] = -local640;
				local977[2] = local410 * local662 + 8192 >> 14;
				local977[0] = local1017 * local662 + local666 * local649 + 8192 >> 14;
				local977[8] = local649 * local410 + 8192 >> 14;
				local977[3] = local685 * local410 + 8192 >> 14;
				local977[7] = local685 * local662 + local1009 * local649 + 8192 >> 14;
				local977[1] = local685 * -local649 + local662 * local1009 + 8192 >> 14;
				@Pc(1148) int local1148 = -Static72.anInt1637 * local977[0] + local977[1] * -Static237.anInt8063 + local977[2] * -Static427.anInt7296 + 8192 >> 14;
				local1175 = -Static72.anInt1637 * local977[3] + -Static237.anInt8063 * local977[4] + -Static427.anInt7296 * local977[5] + 8192 >> 14;
				local1201 = local977[7] * -Static237.anInt8063 + local977[6] * -Static72.anInt1637 + local977[8] * -Static427.anInt7296 + 8192 >> 14;
				local1206 = local1148 + Static72.anInt1637;
				@Pc(1211) int local1211 = local1175 + Static237.anInt8063;
				local1215 = Static427.anInt7296 + local1201;
				@Pc(1218) int[] local1218 = new int[9];
				for (local1220 = 0; local1220 < 3; local1220++) {
					for (local1224 = 0; local1224 < 3; local1224++) {
						local1228 = 0;
						for (local1230 = 0; local1230 < 3; local1230++) {
							local1228 += local977[local1220 * 3 + local1230] * arg7[local1224 * 3 + local1230];
						}
						local1218[local1220 * 3 + local1224] = local1228 + 8192 >> 14;
					}
				}
				local1224 = local57 * local977[1] + local977[0] * local255 + local63 * local977[2] + 8192 >> 14;
				local1228 = local977[5] * local63 + local57 * local977[4] + local977[3] * local255 + 8192 >> 14;
				local1224 += local1206;
				local1228 += local1211;
				local1230 = local977[7] * local57 + local255 * local977[6] + local63 * local977[8] + 8192 >> 14;
				local1230 += local1215;
				local1362 = new int[9];
				for (local1364 = 0; local1364 < 3; local1364++) {
					for (local1368 = 0; local1368 < 3; local1368++) {
						local1372 = 0;
						for (local1374 = 0; local1374 < 3; local1374++) {
							local1372 += local1218[local1368 + local1374 * 3] * arg7[local1374 + local1364 * 3];
						}
						local1362[local1368 + local1364 * 3] = local1372 + 8192 >> 14;
					}
				}
				local1368 = local1230 * arg7[2] + local1228 * arg7[1] + arg7[0] * local1224 + 8192 >> 14;
				local1372 = local1228 * arg7[4] + arg7[3] * local1224 + arg7[5] * local1230 + 8192 >> 14;
				local1368 += local33;
				local1372 += local35;
				local1374 = local1224 * arg7[6] + arg7[7] * local1228 + local1230 * arg7[8] + 8192 >> 14;
				local1374 += local41;
				for (local1502 = 0; local1502 < local8; local1502++) {
					@Pc(1508) int local1508 = arg1[local1502];
					if (this.anIntArrayArray27.length > local1508) {
						@Pc(1522) int[] local1522 = this.anIntArrayArray27[local1508];
						for (@Pc(1524) int local1524 = 0; local1524 < local1522.length; local1524++) {
							@Pc(1530) int local1530 = local1522[local1524];
							if (this.aShortArray87 == null || (arg6 & this.aShortArray87[local1530]) != 0) {
								@Pc(1571) int local1571 = local1362[2] * this.anIntArray285[local1530] + this.anIntArray283[local1530] * local1362[0] + this.anIntArray286[local1530] * local1362[1] + 8192 >> 14;
								@Pc(1603) int local1603 = this.anIntArray283[local1530] * local1362[3] + local1362[4] * this.anIntArray286[local1530] + this.anIntArray285[local1530] * local1362[5] + 8192 >> 14;
								@Pc(1607) int local1607 = local1603 + local1372;
								@Pc(1640) int local1640 = local1362[6] * this.anIntArray283[local1530] + this.anIntArray286[local1530] * local1362[7] + local1362[8] * this.anIntArray285[local1530] + 8192 >> 14;
								@Pc(1644) int local1644 = local1571 + local1368;
								@Pc(1648) int local1648 = local1640 + local1374;
								this.anIntArray283[local1530] = local1644;
								this.anIntArray286[local1530] = local1607;
								this.anIntArray285[local1530] = local1648;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2600) Class219 local2600;
			@Pc(2487) boolean local2487;
			@Pc(2595) Class242 local2595;
			if (arg0 == 5) {
				if (this.anIntArrayArray26 != null) {
					local2487 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray26.length > local41) {
							local55 = this.anIntArrayArray26[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray83 == null || (this.aShortArray83[local63] & arg6) != 0) {
									local391 = arg2 * 8 + (this.aByteArray52[local63] & 0xFF);
									if (local391 < 0) {
										local391 = 0;
									} else if (local391 > 255) {
										local391 = 255;
									}
									this.aByteArray52[local63] = (byte) local391;
								}
							}
							local2487 |= local55.length > 0;
						}
					}
					if (local2487) {
						if (this.aClass242Array1 != null) {
							for (local41 = 0; local41 < this.anInt4459; local41++) {
								local2595 = this.aClass242Array1[local41];
								local2600 = this.aClass219Array1[local41];
								local2600.anInt6105 = local2600.anInt6105 & 0xFFFFFF | 255 - (this.aByteArray52[local2595.anInt6776] & 0xFF) << 24;
							}
						}
						this.method3695();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray26 != null) {
					local2487 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray26.length) {
							local55 = this.anIntArrayArray26[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray83 == null || (this.aShortArray83[local63] & arg6) != 0) {
									local391 = this.aShortArray89[local63] & 0xFFFF;
									local410 = local391 >> 10 & 0x3F;
									local640 = local391 >> 7 & 0x7;
									local649 = local391 & 0x7F;
									@Pc(2712) int local2712 = arg2 + local410 & 0x3F;
									local640 += arg3 / 4;
									if (local640 < 0) {
										local640 = 0;
									} else if (local640 > 7) {
										local640 = 7;
									}
									local649 += arg4;
									if (local649 < 0) {
										local649 = 0;
									} else if (local649 > 127) {
										local649 = 127;
									}
									this.aShortArray89[local63] = (short) (local2712 << 10 | local640 << 7 | local649);
								}
							}
							local2487 |= local55.length > 0;
						}
					}
					if (local2487) {
						if (this.aClass242Array1 != null) {
							for (local41 = 0; local41 < this.anInt4459; local41++) {
								local2595 = this.aClass242Array1[local41];
								local2600 = this.aClass219Array1[local41];
								local2600.anInt6105 = local2600.anInt6105 & 0xFF000000 | Static250.anIntArray314[this.aShortArray89[local2595.anInt6776] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method3695();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray25 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray25.length) {
							local253 = this.anIntArrayArray25[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2600 = this.aClass219Array1[local253[local255]];
								local2600.anInt6101 += arg3;
								local2600.anInt6103 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray25 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray25.length > local35) {
							local253 = this.anIntArrayArray25[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2600 = this.aClass219Array1[local253[local255]];
								local2600.anInt6107 = arg2 * local2600.anInt6107 >> 7;
								local2600.anInt6100 = local2600.anInt6100 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray25 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray25.length > local35) {
						local253 = this.anIntArrayArray25[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local2600 = this.aClass219Array1[local253[local255]];
							local2600.anInt6106 = arg2 + local2600.anInt6106 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray27.length) {
					local253 = this.anIntArrayArray27[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local57 = local253[local255];
						if (this.aShortArray87 == null || (this.aShortArray87[local57] & arg6) != 0) {
							this.anIntArray283[local57] -= Static72.anInt1637;
							this.anIntArray286[local57] -= Static237.anInt8063;
							this.anIntArray285[local57] -= Static427.anInt7296;
							this.anIntArray283[local57] = arg2 * this.anIntArray283[local57] >> 7;
							this.anIntArray286[local57] = arg3 * this.anIntArray286[local57] >> 7;
							this.anIntArray285[local57] = arg4 * this.anIntArray285[local57] >> 7;
							this.anIntArray283[local57] += Static72.anInt1637;
							this.anIntArray286[local57] += Static237.anInt8063;
							this.anIntArray285[local57] += Static427.anInt7296;
						}
					}
				}
			}
		} else {
			local33 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local255 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static421.aBoolean620) {
				local391 = Static72.anInt1637 * arg7[0] + Static237.anInt8063 * arg7[3] + arg7[6] * Static427.anInt7296 + 8192 >> 14;
				local410 = arg7[7] * Static427.anInt7296 + Static237.anInt8063 * arg7[4] + Static72.anInt1637 * arg7[1] + 8192 >> 14;
				local640 = Static72.anInt1637 * arg7[2] + Static237.anInt8063 * arg7[5] + Static427.anInt7296 * arg7[8] + 8192 >> 14;
				local410 += local57;
				local391 += local255;
				local640 += local63;
				Static72.anInt1637 = local391;
				Static237.anInt8063 = local410;
				Static427.anInt7296 = local640;
				Static421.aBoolean620 = false;
			}
			local391 = arg2 << 15 >> 7;
			local410 = arg3 << 15 >> 7;
			local640 = arg4 << 15 >> 7;
			local649 = -Static72.anInt1637 * local391 + 8192 >> 14;
			local662 = -Static237.anInt8063 * local410 + 8192 >> 14;
			local666 = -Static427.anInt7296 * local640 + 8192 >> 14;
			local685 = local649 + Static72.anInt1637;
			local1009 = local662 + Static237.anInt8063;
			local1017 = local666 + Static427.anInt7296;
			@Pc(2013) int[] local2013 = new int[] { arg7[0] * local391 + 8192 >> 14, local391 * arg7[3] + 8192 >> 14, arg7[6] * local391 + 8192 >> 14, arg7[1] * local410 + 8192 >> 14, local410 * arg7[4] + 8192 >> 14, arg7[7] * local410 + 8192 >> 14, arg7[2] * local640 + 8192 >> 14, local640 * arg7[5] + 8192 >> 14, local640 * arg7[8] + 8192 >> 14 };
			local1175 = local255 * local391 + 8192 >> 14;
			local1201 = local410 * local57 + 8192 >> 14;
			local1206 = local63 * local640 + 8192 >> 14;
			@Pc(2149) int local2149 = local1201 + local1009;
			@Pc(2153) int local2153 = local1175 + local685;
			@Pc(2157) int local2157 = local1206 + local1017;
			@Pc(2160) int[] local2160 = new int[9];
			@Pc(2166) int local2166;
			for (local1215 = 0; local1215 < 3; local1215++) {
				for (local2166 = 0; local2166 < 3; local2166++) {
					local1220 = 0;
					for (local1224 = 0; local1224 < 3; local1224++) {
						local1220 += local2013[local1224 * 3 + local2166] * arg7[local1215 * 3 + local1224];
					}
					local2160[local1215 * 3 + local2166] = local1220 + 8192 >> 14;
				}
			}
			local2166 = local2153 * arg7[0] + arg7[1] * local2149 + arg7[2] * local2157 + 8192 >> 14;
			local1220 = local2153 * arg7[3] + local2149 * arg7[4] + arg7[5] * local2157 + 8192 >> 14;
			local1220 += local35;
			local1224 = arg7[8] * local2157 + local2153 * arg7[6] + arg7[7] * local2149 + 8192 >> 14;
			local2166 += local33;
			local1224 += local41;
			for (local1228 = 0; local1228 < local8; local1228++) {
				local1230 = arg1[local1228];
				if (this.anIntArrayArray27.length > local1230) {
					local1362 = this.anIntArrayArray27[local1230];
					for (local1364 = 0; local1364 < local1362.length; local1364++) {
						local1368 = local1362[local1364];
						if (this.aShortArray87 == null || (arg6 & this.aShortArray87[local1368]) != 0) {
							local1372 = local2160[0] * this.anIntArray283[local1368] + local2160[1] * this.anIntArray286[local1368] + local2160[2] * this.anIntArray285[local1368] + 8192 >> 14;
							local1374 = local2160[3] * this.anIntArray283[local1368] + this.anIntArray286[local1368] * local2160[4] + this.anIntArray285[local1368] * local2160[5] + 8192 >> 14;
							@Pc(2405) int local2405 = local1374 + local1220;
							local1502 = this.anIntArray286[local1368] * local2160[7] + local2160[6] * this.anIntArray283[local1368] + this.anIntArray285[local1368] * local2160[8] + 8192 >> 14;
							@Pc(2440) int local2440 = local1372 + local2166;
							this.anIntArray283[local1368] = local2440;
							@Pc(2449) int local2449 = local1502 + local1224;
							this.anIntArray286[local1368] = local2405;
							this.anIntArray285[local1368] = local2449;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	private void method3692() {
		if (!this.aBoolean358) {
			return;
		}
		this.aBoolean358 = false;
		if (this.aClass139Array2 == null && this.aClass270Array2 == null && this.aClass242Array1 == null) {
			if (this.anIntArray283 != null && !Static557.method7610(this.anInt4432, this.anInt4472)) {
				if (this.aClass126_1 == null || this.aClass126_1.method3015()) {
					if (!this.aBoolean355) {
						this.method3701();
					}
					this.anIntArray283 = null;
				} else {
					this.aBoolean358 = true;
				}
			}
			if (this.anIntArray286 != null && !Static177.method3054(this.anInt4432, this.anInt4472)) {
				if (this.aClass126_1 == null || this.aClass126_1.method3015()) {
					if (!this.aBoolean355) {
						this.method3701();
					}
					this.anIntArray286 = null;
				} else {
					this.aBoolean358 = true;
				}
			}
			if (this.anIntArray285 != null && !Static237.method6645(this.anInt4432, this.anInt4472)) {
				if (this.aClass126_1 == null || this.aClass126_1.method3015()) {
					if (!this.aBoolean355) {
						this.method3701();
					}
					this.anIntArray285 = null;
				} else {
					this.aBoolean358 = true;
				}
			}
		}
		if (this.aShortArray85 != null && this.anIntArray283 == null && this.anIntArray286 == null && this.anIntArray285 == null) {
			this.aShortArray85 = null;
			this.anIntArray282 = null;
		}
		if (this.aByteArray53 != null && !Static40.method698(this.anInt4472, this.anInt4432)) {
			label197: {
				label196: {
					@Pc(163) boolean local163;
					if ((this.anInt4472 & 0x37) == 0) {
						if (this.aClass126_2 == null || this.aClass126_2.method3015()) {
							break label196;
						}
						local163 = false;
					} else {
						if (this.aClass126_4 == null || this.aClass126_4.method3015()) {
							break label196;
						}
						local163 = false;
					}
					if (!local163) {
						this.aBoolean358 = true;
						break label197;
					}
				}
				this.aShortArray82 = this.aShortArray80 = this.aShortArray78 = null;
				this.aByteArray53 = null;
			}
		}
		if (this.aShortArray89 != null && !Static138.method2342(this.anInt4432, this.anInt4472)) {
			if (this.aClass126_2 == null || this.aClass126_2.method3015()) {
				this.aShortArray89 = null;
			} else {
				this.aBoolean358 = true;
			}
		}
		if (this.aByteArray52 != null && !Static487.method6827(this.anInt4432, this.anInt4472)) {
			if (this.aClass126_2 == null || this.aClass126_2.method3015()) {
				this.aByteArray52 = null;
			} else {
				this.aBoolean358 = true;
			}
		}
		if (this.aFloatArray39 != null && !Static267.method4089(this.anInt4432, this.anInt4472)) {
			if (this.aClass126_3 == null || this.aClass126_3.method3015()) {
				this.aFloatArray39 = this.aFloatArray38 = null;
			} else {
				this.aBoolean358 = true;
			}
		}
		if (this.aShortArray86 != null && !Static26.method452(this.anInt4432, this.anInt4472)) {
			if (this.aClass126_2 == null || this.aClass126_2.method3015()) {
				this.aShortArray86 = null;
			} else {
				this.aBoolean358 = true;
			}
		}
		if (this.aShortArray81 != null && !Static373.method5530(this.anInt4432, this.anInt4472)) {
			if ((this.aClass118_1 == null || this.aClass118_1.method2487()) && (this.aClass126_2 == null || this.aClass126_2.method3015())) {
				this.aShortArray81 = this.aShortArray79 = this.aShortArray88 = null;
			} else {
				this.aBoolean358 = true;
			}
		}
		if (this.aShortArray77 != null) {
			if (this.aClass126_1 == null || this.aClass126_1.method3015()) {
				this.aShortArray77 = null;
			} else {
				this.aBoolean358 = true;
			}
		}
		if (this.aShortArray84 != null) {
			if (this.aClass126_2 == null || this.aClass126_2.method3015()) {
				this.aShortArray84 = null;
			} else {
				this.aBoolean358 = true;
			}
		}
		if (this.anIntArrayArray26 != null && !Static164.method2882(this.anInt4472, this.anInt4432)) {
			this.aShortArray83 = null;
			this.anIntArrayArray26 = null;
		}
		if (this.anIntArrayArray27 != null && !Static227.method3535(this.anInt4472, this.anInt4432)) {
			this.aShortArray87 = null;
			this.anIntArrayArray27 = null;
		}
		if (this.anIntArrayArray25 != null && !Static318.method4930(this.anInt4432, this.anInt4472)) {
			this.anIntArrayArray25 = null;
		}
		if (this.anIntArray284 != null && (this.anInt4432 & 0x800) == 0 && (this.anInt4432 & 0x40000) == 0) {
			this.anIntArray288 = null;
			this.anIntArray287 = null;
			this.anIntArray284 = null;
		}
	}

	@OriginalMember(owner = "client!ja", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean355) {
			this.method3701();
		}
		return this.anInt4415;
	}

	@OriginalMember(owner = "client!ja", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean355) {
			this.method3701();
		}
		return this.anInt4453;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)Z")
	private boolean method3694() {
		if (this.aClass118_1.aBoolean250) {
			return true;
		}
		if (this.aClass118_1.anInterface11_3 == null) {
			this.aClass118_1.anInterface11_3 = this.aClass100_Sub1_11.method4777(this.aBoolean357);
		}
		@Pc(28) Interface11 local28 = this.aClass118_1.anInterface11_3;
		local28.method4117(this.anInt4425 * 6);
		@Pc(45) Buffer local45 = local28.method4114();
		if (local45 != null) {
			@Pc(53) Stream local53 = this.aClass100_Sub1_11.method4834(local45);
			@Pc(57) int local57;
			if (Stream.a()) {
				for (local57 = 0; local57 < this.anInt4425; local57++) {
					local53.c(this.aShortArray81[local57]);
					local53.c(this.aShortArray79[local57]);
					local53.c(this.aShortArray88[local57]);
				}
			} else {
				for (local57 = 0; local57 < this.anInt4425; local57++) {
					local53.e(this.aShortArray81[local57]);
					local53.e(this.aShortArray79[local57]);
					local53.e(this.aShortArray88[local57]);
				}
			}
			local53.c();
			if (local28.method4118()) {
				this.aClass118_1.anInterface11_2 = local28;
				this.aBoolean358 = true;
				this.aClass118_1.aBoolean250 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)V")
	private void method3695() {
		if (this.aClass126_2 != null) {
			this.aClass126_2.aBoolean302 = false;
		}
	}

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean355) {
			this.method3701();
		}
		return this.anInt4446;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIFJLclient!eg;IIFIII)S")
	private short method3696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) long arg3, @OriginalArg(4) Class93 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(16) int local16 = this.anIntArray282[arg6];
		@Pc(23) int local23 = this.anIntArray282[arg6 + 1];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = local16; local27 < local23; local27++) {
			@Pc(34) short local34 = this.aShortArray85[local27];
			if (local34 == 0) {
				local25 = local27;
				break;
			}
			if (arg3 == Static479.aLongArray12[local27]) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray85[local25] = (short) (this.anInt4437 + 1);
		Static479.aLongArray12[local25] = arg3;
		this.aShortArray84[this.anInt4437] = (short) arg8;
		this.aShortArray77[this.anInt4437] = (short) arg6;
		this.aShortArray82[this.anInt4437] = (short) arg0;
		this.aShortArray80[this.anInt4437] = (short) arg5;
		this.aShortArray78[this.anInt4437] = (short) arg9;
		this.aByteArray53[this.anInt4437] = (byte) arg1;
		this.aFloatArray39[this.anInt4437] = arg2;
		this.aFloatArray38[this.anInt4437] = arg7;
		return (short) this.anInt4437++;
	}

	@OriginalMember(owner = "client!ja", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean355) {
			this.method3701();
		}
		return this.anInt4449;
	}

	@OriginalMember(owner = "client!ja", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4444; local7++) {
			if (arg0 != 128) {
				this.anIntArray283[local7] = arg0 * this.anIntArray283[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray286[local7] = arg1 * this.anIntArray286[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray285[local7] = this.anIntArray285[local7] * arg2 >> 7;
			}
		}
		this.method3697();
		this.aBoolean355 = false;
	}

	@OriginalMember(owner = "client!ja", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4429; local7++) {
			this.anIntArray283[local7] = this.anIntArray283[local7] + 7 >> 4;
			this.anIntArray286[local7] = this.anIntArray286[local7] + 7 >> 4;
			this.anIntArray285[local7] = this.anIntArray285[local7] + 7 >> 4;
		}
		this.method3697();
		this.aBoolean355 = false;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	private void method3697() {
		if (this.aClass126_1 != null) {
			this.aClass126_1.aBoolean302 = false;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) boolean arg3) {
		return this.method3707(-1, arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(Z)Z")
	private boolean method3698() {
		@Pc(13) boolean local13 = !this.aClass126_2.aBoolean302;
		@Pc(26) boolean local26 = (this.anInt4472 & 0x37) != 0 && !this.aClass126_4.aBoolean302;
		@Pc(34) boolean local34 = !this.aClass126_1.aBoolean302;
		@Pc(42) boolean local42 = !this.aClass126_3.aBoolean302;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(61) boolean local61 = true;
		@Pc(80) Interface16 local80;
		@Pc(94) Buffer local94;
		if (local34) {
			if (this.aClass126_1.anInterface16_9 == null) {
				this.aClass126_1.anInterface16_9 = this.aClass100_Sub1_11.method4837(this.aBoolean357);
			}
			local80 = this.aClass126_1.anInterface16_9;
			local80.method5776(12, this.anInt4437 * 12);
			local94 = local80.method5775();
			if (local94 == null) {
				local61 = false;
			} else {
				this.aClass100_Sub1_11.aNativeInterface3.copyPositions(this.anIntArray283, this.anIntArray286, this.anIntArray285, this.aShortArray77, 0, 12, this.anInt4437, local94.getAddress());
				if (local80.method5774()) {
					this.aClass126_1.anInterface16_10 = local80;
					this.aClass126_1.aBoolean302 = true;
				} else {
					local61 = false;
				}
			}
		}
		@Pc(192) short[] local192;
		@Pc(188) short[] local188;
		@Pc(196) short[] local196;
		@Pc(200) byte[] local200;
		if (local13) {
			if (this.aClass126_2.anInterface16_9 == null) {
				this.aClass126_2.anInterface16_9 = this.aClass100_Sub1_11.method4837(this.aBoolean357);
			}
			local80 = this.aClass126_2.anInterface16_9;
			local80.method5776(4, this.anInt4437 * 4);
			local94 = local80.method5775();
			if (local94 == null) {
				local61 = false;
			} else {
				if ((this.anInt4472 & 0x37) == 0) {
					if (this.aClass332_1 == null) {
						local192 = this.aShortArray82;
						local196 = this.aShortArray78;
						local200 = this.aByteArray53;
						local188 = this.aShortArray80;
					} else {
						local188 = this.aClass332_1.aShortArray119;
						local192 = this.aClass332_1.aShortArray117;
						local196 = this.aClass332_1.aShortArray118;
						local200 = this.aClass332_1.aByteArray87;
					}
					this.aClass100_Sub1_11.aNativeInterface3.copyLighting(this.aShortArray89, this.aByteArray52, this.aShortArray86, local192, local188, local196, local200, this.aShort49, this.aShort48, this.aShortArray84, 0, 4, this.anInt4437, local94.getAddress());
				} else {
					this.aClass100_Sub1_11.aNativeInterface3.copyColours(this.aShortArray89, this.aByteArray52, this.aShortArray86, this.aShort49, this.aShortArray84, 0, 4, this.anInt4437, local94.getAddress());
				}
				if (local80.method5774()) {
					this.aClass126_2.anInterface16_10 = local80;
					this.aClass126_2.aBoolean302 = true;
				} else {
					local61 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass126_4.anInterface16_9 == null) {
				this.aClass126_4.anInterface16_9 = this.aClass100_Sub1_11.method4837(this.aBoolean357);
			}
			local80 = this.aClass126_4.anInterface16_9;
			local80.method5776(12, this.anInt4437 * 12);
			local94 = local80.method5775();
			if (local94 == null) {
				local61 = false;
			} else {
				if (this.aClass332_1 == null) {
					local188 = this.aShortArray80;
					local200 = this.aByteArray53;
					local192 = this.aShortArray82;
					local196 = this.aShortArray78;
				} else {
					local192 = this.aClass332_1.aShortArray117;
					local200 = this.aClass332_1.aByteArray87;
					local188 = this.aClass332_1.aShortArray119;
					local196 = this.aClass332_1.aShortArray118;
				}
				this.aClass100_Sub1_11.aNativeInterface3.copyNormals(local192, local188, local196, local200, 3.0F / (float) this.aShort48, 3.0F / (float) (this.aShort48 / 2 + this.aShort48), 0, 12, this.anInt4437, local94.getAddress());
				if (local80.method5774()) {
					this.aClass126_4.anInterface16_10 = local80;
					this.aClass126_4.aBoolean302 = true;
				} else {
					local61 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass126_3.anInterface16_9 == null) {
				this.aClass126_3.anInterface16_9 = this.aClass100_Sub1_11.method4837(this.aBoolean357);
			}
			local80 = this.aClass126_3.anInterface16_9;
			local80.method5776(8, this.anInt4437 * 8);
			local94 = local80.method5775();
			if (local94 == null) {
				local61 = false;
			} else {
				this.aClass100_Sub1_11.aNativeInterface3.copyTexCoords(this.aFloatArray39, this.aFloatArray38, 0, 8, this.anInt4437, local94.getAddress());
				if (local80.method5774()) {
					this.aClass126_3.anInterface16_10 = local80;
					this.aClass126_3.aBoolean302 = true;
				} else {
					local61 = false;
				}
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!q;Lclient!pba;I)V")
	@Override
	public void method7558(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class6_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4437 == 0) {
			return;
		}
		@Pc(16) Class68_Sub2 local16 = this.aClass100_Sub1_11.aClass68_Sub2_16;
		if (!this.aBoolean355) {
			this.method3701();
		}
		@Pc(25) Class68_Sub2 local25 = (Class68_Sub2) arg0;
		Static593.aFloat268 = local25.aFloat190 * local16.aFloat186 + local16.aFloat185 * local25.aFloat181 + local16.aFloat190 * local25.aFloat188;
		Static103.aFloat55 = local16.aFloat183 + local25.aFloat180 * local16.aFloat190 + local16.aFloat185 * local25.aFloat182 + local16.aFloat186 * local25.aFloat183;
		@Pc(72) float local72 = Static103.aFloat55 + (float) this.anInt4476 * Static593.aFloat268;
		@Pc(80) float local80 = Static593.aFloat268 * (float) this.anInt4449 + Static103.aFloat55;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = local72 + (float) this.anInt4446;
			local97 = (float) -this.anInt4446 + local80;
		} else {
			local97 = (float) -this.anInt4446 + local72;
			local90 = local80 + (float) this.anInt4446;
		}
		if (local97 >= this.aClass100_Sub1_11.aFloat154 || local90 <= (float) this.aClass100_Sub1_11.anInt5786) {
			return;
		}
		Static112.aFloat60 = local16.aFloat182 + local25.aFloat183 * local16.aFloat191 + local25.aFloat180 * local16.aFloat181 + local16.aFloat187 * local25.aFloat182;
		Static586.aFloat266 = local16.aFloat191 * local25.aFloat190 + local25.aFloat181 * local16.aFloat187 + local25.aFloat188 * local16.aFloat181;
		@Pc(174) float local174 = Static112.aFloat60 + Static586.aFloat266 * (float) this.anInt4476;
		@Pc(182) float local182 = Static112.aFloat60 + Static586.aFloat266 * (float) this.anInt4449;
		@Pc(208) float local208;
		@Pc(197) float local197;
		if (local182 < local174) {
			local197 = ((float) this.anInt4446 + local174) * (float) this.aClass100_Sub1_11.anInt5755;
			local208 = (float) this.aClass100_Sub1_11.anInt5755 * (local182 - (float) this.anInt4446);
		} else {
			local197 = ((float) this.anInt4446 + local182) * (float) this.aClass100_Sub1_11.anInt5755;
			local208 = ((float) -this.anInt4446 + local174) * (float) this.aClass100_Sub1_11.anInt5755;
		}
		if (local208 / local90 >= this.aClass100_Sub1_11.aFloat155 || local197 / local90 <= this.aClass100_Sub1_11.aFloat160) {
			return;
		}
		Static228.aFloat130 = local25.aFloat182 * local16.aFloat189 + local16.aFloat188 * local25.aFloat180 + local16.aFloat184 * local25.aFloat183 + local16.aFloat180;
		Static109.aFloat59 = local16.aFloat188 * local25.aFloat188 + local25.aFloat181 * local16.aFloat189 + local16.aFloat184 * local25.aFloat190;
		@Pc(298) float local298 = Static228.aFloat130 + (float) this.anInt4476 * Static109.aFloat59;
		@Pc(306) float local306 = Static228.aFloat130 + Static109.aFloat59 * (float) this.anInt4449;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local298 > local306) {
			local333 = (float) this.aClass100_Sub1_11.anInt5774 * (local298 + (float) this.anInt4446);
			local322 = (float) this.aClass100_Sub1_11.anInt5774 * (local306 - (float) this.anInt4446);
		} else {
			local322 = ((float) -this.anInt4446 + local298) * (float) this.aClass100_Sub1_11.anInt5774;
			local333 = (local306 + (float) this.anInt4446) * (float) this.aClass100_Sub1_11.anInt5774;
		}
		if (local322 / local90 >= this.aClass100_Sub1_11.aFloat153 || this.aClass100_Sub1_11.aFloat158 >= local333 / local90) {
			return;
		}
		if (arg1 != null || this.aClass242Array1 != null) {
			Static437.aFloat210 = local16.aFloat186 * local25.aFloat186 + local25.aFloat184 * local16.aFloat190 + local25.aFloat191 * local16.aFloat185;
			Static351.aFloat193 = local25.aFloat184 * local16.aFloat188 + local25.aFloat191 * local16.aFloat189 + local16.aFloat184 * local25.aFloat186;
			Static454.aFloat238 = local16.aFloat185 * local25.aFloat187 + local25.aFloat189 * local16.aFloat190 + local16.aFloat186 * local25.aFloat185;
			Static484.aFloat252 = local25.aFloat187 * local16.aFloat187 + local16.aFloat181 * local25.aFloat189 + local25.aFloat185 * local16.aFloat191;
			Static391.aFloat201 = local16.aFloat189 * local25.aFloat187 + local25.aFloat189 * local16.aFloat188 + local16.aFloat184 * local25.aFloat185;
			Static67.aFloat28 = local25.aFloat186 * local16.aFloat191 + local16.aFloat187 * local25.aFloat191 + local16.aFloat181 * local25.aFloat184;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(502) int local502 = this.anInt4473 + this.anInt4423 >> 1;
			@Pc(510) int local510 = this.anInt4453 + this.anInt4438 >> 1;
			@Pc(529) int local529 = (int) (Static67.aFloat28 * (float) local510 + Static586.aFloat266 * (float) this.anInt4476 + (float) local502 * Static484.aFloat252 + Static112.aFloat60);
			@Pc(548) int local548 = (int) ((float) this.anInt4476 * Static109.aFloat59 + (float) local502 * Static391.aFloat201 + Static228.aFloat130 + (float) local510 * Static351.aFloat193);
			@Pc(567) int local567 = (int) ((float) this.anInt4476 * Static593.aFloat268 + (float) local502 * Static454.aFloat238 + Static103.aFloat55 + (float) local510 * Static437.aFloat210);
			if (local567 < this.aClass100_Sub1_11.anInt5786) {
				local492 = true;
			} else {
				arg1.anInt6925 = this.aClass100_Sub1_11.anInt5755 * local529 / local567 + this.aClass100_Sub1_11.anInt5788;
				arg1.anInt6922 = this.aClass100_Sub1_11.anInt5764 + local548 * this.aClass100_Sub1_11.anInt5774 / local567;
			}
			@Pc(626) int local626 = (int) (Static484.aFloat252 * (float) local502 + Static112.aFloat60 + (float) this.anInt4449 * Static586.aFloat266 + (float) local510 * Static67.aFloat28);
			@Pc(645) int local645 = (int) (Static228.aFloat130 + (float) local502 * Static391.aFloat201 + Static109.aFloat59 * (float) this.anInt4449 + (float) local510 * Static351.aFloat193);
			@Pc(664) int local664 = (int) ((float) this.anInt4449 * Static593.aFloat268 + Static103.aFloat55 + Static454.aFloat238 * (float) local502 + Static437.aFloat210 * (float) local510);
			if (this.aClass100_Sub1_11.anInt5786 <= local664) {
				arg1.anInt6923 = local645 * this.aClass100_Sub1_11.anInt5774 / local664 + this.aClass100_Sub1_11.anInt5764;
				arg1.anInt6926 = this.aClass100_Sub1_11.anInt5755 * local626 / local664 + this.aClass100_Sub1_11.anInt5788;
			} else {
				local492 = true;
			}
			if (local492) {
				if (local567 < this.aClass100_Sub1_11.anInt5786 && this.aClass100_Sub1_11.anInt5786 > local664) {
					local494 = false;
				} else {
					@Pc(730) int local730;
					@Pc(740) int local740;
					@Pc(766) int local766;
					if (local567 < this.aClass100_Sub1_11.anInt5786) {
						local730 = (local664 - this.aClass100_Sub1_11.anInt5786 << 16) / (local664 - local567);
						local740 = local626 + ((local626 - local529) * local730 >> 16);
						arg1.anInt6925 = local740 * this.aClass100_Sub1_11.anInt5755 / this.aClass100_Sub1_11.anInt5786 + this.aClass100_Sub1_11.anInt5788;
						local766 = local645 + ((local645 - local548) * local730 >> 16);
						arg1.anInt6922 = local766 * this.aClass100_Sub1_11.anInt5774 / this.aClass100_Sub1_11.anInt5786 + this.aClass100_Sub1_11.anInt5764;
					} else if (local664 < this.aClass100_Sub1_11.anInt5786) {
						local730 = (local567 - this.aClass100_Sub1_11.anInt5786 << 16) / (local567 - local664);
						local740 = (local730 * (local529 - local626) >> 16) + local529;
						arg1.anInt6925 = this.aClass100_Sub1_11.anInt5755 * local740 / this.aClass100_Sub1_11.anInt5786 + this.aClass100_Sub1_11.anInt5788;
						local766 = ((local548 - local645) * local730 >> 16) + local548;
						arg1.anInt6922 = local766 * this.aClass100_Sub1_11.anInt5774 / this.aClass100_Sub1_11.anInt5786 + this.aClass100_Sub1_11.anInt5764;
					}
				}
			}
			if (local494) {
				arg1.aBoolean539 = true;
				if (local664 >= local567) {
					arg1.anInt6924 = (this.anInt4446 + local626) * this.aClass100_Sub1_11.anInt5755 / local664 + this.aClass100_Sub1_11.anInt5788 - arg1.anInt6926;
				} else {
					arg1.anInt6924 = this.aClass100_Sub1_11.anInt5788 + (this.anInt4446 + local529) * this.aClass100_Sub1_11.anInt5755 / local567 - arg1.anInt6925;
				}
			}
		}
		this.aClass100_Sub1_11.method4828();
		this.aClass100_Sub1_11.method4850(local25);
		this.method3703();
		this.method3704();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
	@Override
	public void method7546() {
		if (this.anInt4437 > 0 && this.anInt4425 > 0) {
			this.method3698();
			this.method3694();
			this.method3692();
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "()Z")
	@Override
	public boolean method7549() {
		if (this.aShortArray86 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray86.length; local12++) {
			if (this.aShortArray86[local12] != -1 && !this.aClass100_Sub1_11.anInterface5_10.method914(this.aShortArray86[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7545(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			Static72.anInt1637 = 0;
			local29 = 0;
			Static427.anInt7296 = 0;
			Static237.anInt8063 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray27.length > local41) {
					local51 = this.anIntArrayArray27[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static72.anInt1637 += this.anIntArray283[local59];
						Static237.anInt8063 += this.anIntArray286[local59];
						Static427.anInt7296 += this.anIntArray285[local59];
						local29++;
					}
				}
			}
			if (local29 > 0) {
				Static72.anInt1637 = Static72.anInt1637 / local29 + local17;
				Static427.anInt7296 = local21 + Static427.anInt7296 / local29;
				Static237.anInt8063 = local25 + Static237.anInt8063 / local29;
			} else {
				Static72.anInt1637 = local17;
				Static237.anInt8063 = local25;
				Static427.anInt7296 = local21;
			}
			return;
		}
		@Pc(155) int[] local155;
		@Pc(157) int local157;
		if (arg0 == 1) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray27.length) {
					local155 = this.anIntArrayArray27[local35];
					for (local157 = 0; local157 < local155.length; local157++) {
						local53 = local155[local157];
						this.anIntArray283[local53] += local17;
						this.anIntArray286[local53] += local25;
						this.anIntArray285[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(272) int local272;
		@Pc(290) int local290;
		@Pc(747) int local747;
		@Pc(756) int local756;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray27.length > local35) {
					local155 = this.anIntArrayArray27[local35];
					if ((arg5 & 0x1) == 0) {
						for (local157 = 0; local157 < local155.length; local157++) {
							local53 = local155[local157];
							this.anIntArray283[local53] -= Static72.anInt1637;
							this.anIntArray286[local53] -= Static237.anInt8063;
							this.anIntArray285[local53] -= Static427.anInt7296;
							if (arg4 != 0) {
								local59 = Class363.anIntArray697[arg4];
								local272 = Class363.anIntArray698[arg4];
								local290 = local272 * this.anIntArray283[local53] + this.anIntArray286[local53] * local59 + 16383 >> 14;
								this.anIntArray286[local53] = local272 * this.anIntArray286[local53] + 16383 - local59 * this.anIntArray283[local53] >> 14;
								this.anIntArray283[local53] = local290;
							}
							if (arg2 != 0) {
								local59 = Class363.anIntArray697[arg2];
								local272 = Class363.anIntArray698[arg2];
								local290 = this.anIntArray286[local53] * local272 + 16383 - local59 * this.anIntArray285[local53] >> 14;
								this.anIntArray285[local53] = this.anIntArray286[local53] * local59 + local272 * this.anIntArray285[local53] + 16383 >> 14;
								this.anIntArray286[local53] = local290;
							}
							if (arg3 != 0) {
								local59 = Class363.anIntArray697[arg3];
								local272 = Class363.anIntArray698[arg3];
								local290 = this.anIntArray283[local53] * local272 + this.anIntArray285[local53] * local59 + 16383 >> 14;
								this.anIntArray285[local53] = local272 * this.anIntArray285[local53] + 16383 - this.anIntArray283[local53] * local59 >> 14;
								this.anIntArray283[local53] = local290;
							}
							this.anIntArray283[local53] += Static72.anInt1637;
							this.anIntArray286[local53] += Static237.anInt8063;
							this.anIntArray285[local53] += Static427.anInt7296;
						}
					} else {
						for (local157 = 0; local157 < local155.length; local157++) {
							local53 = local155[local157];
							this.anIntArray283[local53] -= Static72.anInt1637;
							this.anIntArray286[local53] -= Static237.anInt8063;
							this.anIntArray285[local53] -= Static427.anInt7296;
							if (arg2 != 0) {
								local59 = Class363.anIntArray697[arg2];
								local272 = Class363.anIntArray698[arg2];
								local290 = local272 * this.anIntArray286[local53] + 16383 - local59 * this.anIntArray285[local53] >> 14;
								this.anIntArray285[local53] = local59 * this.anIntArray286[local53] + local272 * this.anIntArray285[local53] + 16383 >> 14;
								this.anIntArray286[local53] = local290;
							}
							if (arg4 != 0) {
								local59 = Class363.anIntArray697[arg4];
								local272 = Class363.anIntArray698[arg4];
								local290 = this.anIntArray283[local53] * local272 + this.anIntArray286[local53] * local59 + 16383 >> 14;
								this.anIntArray286[local53] = this.anIntArray286[local53] * local272 + 16383 - local59 * this.anIntArray283[local53] >> 14;
								this.anIntArray283[local53] = local290;
							}
							if (arg3 != 0) {
								local59 = Class363.anIntArray697[arg3];
								local272 = Class363.anIntArray698[arg3];
								local290 = this.anIntArray285[local53] * local59 + local272 * this.anIntArray283[local53] + 16383 >> 14;
								this.anIntArray285[local53] = this.anIntArray285[local53] * local272 + 16383 - this.anIntArray283[local53] * local59 >> 14;
								this.anIntArray283[local53] = local290;
							}
							this.anIntArray283[local53] += Static72.anInt1637;
							this.anIntArray286[local53] += Static237.anInt8063;
							this.anIntArray285[local53] += Static427.anInt7296;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray27.length > local41) {
						local51 = this.anIntArrayArray27[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local272 = this.anIntArray282[local59];
							local290 = this.anIntArray282[local59 + 1];
							for (local747 = local272; local747 < local290; local747++) {
								local756 = this.aShortArray85[local747] - 1;
								if (local756 == -1) {
									break;
								}
								@Pc(768) int local768;
								@Pc(772) int local772;
								@Pc(790) int local790;
								if (arg4 != 0) {
									local768 = Class363.anIntArray697[arg4];
									local772 = Class363.anIntArray698[arg4];
									local790 = this.aShortArray82[local756] * local772 + this.aShortArray80[local756] * local768 + 16383 >> 14;
									this.aShortArray80[local756] = (short) (local772 * this.aShortArray80[local756] + 16383 - local768 * this.aShortArray82[local756] >> 14);
									this.aShortArray82[local756] = (short) local790;
								}
								if (arg2 != 0) {
									local768 = Class363.anIntArray697[arg2];
									local772 = Class363.anIntArray698[arg2];
									local790 = local772 * this.aShortArray80[local756] + 16383 - this.aShortArray78[local756] * local768 >> 14;
									this.aShortArray78[local756] = (short) (this.aShortArray80[local756] * local768 + local772 * this.aShortArray78[local756] + 16383 >> 14);
									this.aShortArray80[local756] = (short) local790;
								}
								if (arg3 != 0) {
									local768 = Class363.anIntArray697[arg3];
									local772 = Class363.anIntArray698[arg3];
									local790 = this.aShortArray82[local756] * local772 + this.aShortArray78[local756] * local768 + 16383 >> 14;
									this.aShortArray78[local756] = (short) (this.aShortArray78[local756] * local772 + 16383 - this.aShortArray82[local756] * local768 >> 14);
									this.aShortArray82[local756] = (short) local790;
								}
							}
						}
					}
				}
				this.method3706();
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray27.length) {
					local155 = this.anIntArrayArray27[local35];
					for (local157 = 0; local157 < local155.length; local157++) {
						local53 = local155[local157];
						this.anIntArray283[local53] -= Static72.anInt1637;
						this.anIntArray286[local53] -= Static237.anInt8063;
						this.anIntArray285[local53] -= Static427.anInt7296;
						this.anIntArray283[local53] = this.anIntArray283[local53] * arg2 >> 7;
						this.anIntArray286[local53] = this.anIntArray286[local53] * arg3 >> 7;
						this.anIntArray285[local53] = this.anIntArray285[local53] * arg4 >> 7;
						this.anIntArray283[local53] += Static72.anInt1637;
						this.anIntArray286[local53] += Static237.anInt8063;
						this.anIntArray285[local53] += Static427.anInt7296;
					}
				}
			}
		} else {
			@Pc(1189) Class219 local1189;
			@Pc(1095) boolean local1095;
			@Pc(1184) Class242 local1184;
			if (arg0 == 5) {
				if (this.anIntArrayArray26 != null) {
					local1095 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray26.length > local41) {
							local51 = this.anIntArrayArray26[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local272 = (this.aByteArray52[local59] & 0xFF) + (arg2 * 8);
								if (local272 < 0) {
									local272 = 0;
								} else if (local272 > 255) {
									local272 = 255;
								}
								this.aByteArray52[local59] = (byte) local272;
							}
							local1095 |= local51.length > 0;
						}
					}
					if (local1095) {
						if (this.aClass242Array1 != null) {
							for (local41 = 0; local41 < this.anInt4459; local41++) {
								local1184 = this.aClass242Array1[local41];
								local1189 = this.aClass219Array1[local41];
								local1189.anInt6105 = local1189.anInt6105 & 0xFFFFFF | 255 - (this.aByteArray52[local1184.anInt6776] & 0xFF) << 24;
							}
						}
						this.method3695();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray26 != null) {
					local1095 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray26.length > local41) {
							local51 = this.anIntArrayArray26[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local272 = this.aShortArray89[local59] & 0xFFFF;
								local290 = local272 >> 10 & 0x3F;
								local747 = local272 >> 7 & 0x7;
								local747 += arg3 / 4;
								@Pc(1290) int local1290 = arg2 + local290 & 0x3F;
								local756 = local272 & 0x7F;
								local756 += arg4;
								if (local747 < 0) {
									local747 = 0;
								} else if (local747 > 7) {
									local747 = 7;
								}
								if (local756 < 0) {
									local756 = 0;
								} else if (local756 > 127) {
									local756 = 127;
								}
								this.aShortArray89[local59] = (short) (local747 << 7 | local1290 << 10 | local756);
							}
							local1095 |= local51.length > 0;
						}
					}
					if (local1095) {
						if (this.aClass242Array1 != null) {
							for (local41 = 0; local41 < this.anInt4459; local41++) {
								local1184 = this.aClass242Array1[local41];
								local1189 = this.aClass219Array1[local41];
								local1189.anInt6105 = Static250.anIntArray314[this.aShortArray89[local1184.anInt6776] & 0xFFFF] & 0xFFFFFF | local1189.anInt6105 & 0xFF000000;
							}
						}
						this.method3695();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray25 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray25.length) {
							local155 = this.anIntArrayArray25[local35];
							for (local157 = 0; local157 < local155.length; local157++) {
								local1189 = this.aClass219Array1[local155[local157]];
								local1189.anInt6101 += arg3;
								local1189.anInt6103 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray25 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray25.length > local35) {
							local155 = this.anIntArrayArray25[local35];
							for (local157 = 0; local157 < local155.length; local157++) {
								local1189 = this.aClass219Array1[local155[local157]];
								local1189.anInt6107 = arg2 * local1189.anInt6107 >> 7;
								local1189.anInt6100 = local1189.anInt6100 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray25 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray25.length > local35) {
						local155 = this.anIntArrayArray25[local35];
						for (local157 = 0; local157 < local155.length; local157++) {
							local1189 = this.aClass219Array1[local155[local157]];
							local1189.anInt6106 = arg2 + local1189.anInt6106 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean355) {
			this.method3701();
		}
		return this.anInt4473;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "()V")
	@Override
	protected void method7555() {
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ok;B)V")
	private void method3699(@OriginalArg(0) Class2_Sub3_Sub6_Sub1 arg0) {
		if (this.anInt4437 > Static75.anIntArray88.length) {
			Static293.anIntArray372 = new int[this.anInt4437];
			Static75.anIntArray88 = new int[this.anInt4437];
		}
		@Pc(47) int local47;
		@Pc(86) int local86;
		@Pc(95) int local95;
		for (@Pc(20) int local20 = 0; local20 < this.anInt4444; local20++) {
			local47 = (this.anIntArray283[local20] - (this.anIntArray286[local20] * this.aClass100_Sub1_11.anInt5777 >> 8) >> this.aClass100_Sub1_11.anInt5756) - arg0.anInt6818;
			@Pc(72) int local72 = (this.anIntArray285[local20] - (this.aClass100_Sub1_11.anInt5769 * this.anIntArray286[local20] >> 8) >> this.aClass100_Sub1_11.anInt5756) - arg0.anInt6820;
			@Pc(77) int local77 = this.anIntArray282[local20];
			@Pc(84) int local84 = this.anIntArray282[local20 + 1];
			for (local86 = local77; local86 < local84; local86++) {
				local95 = this.aShortArray85[local86] - 1;
				if (local95 == -1) {
					break;
				}
				Static75.anIntArray88[local95] = local47;
				Static293.anIntArray372[local95] = local72;
			}
		}
		for (local47 = 0; local47 < this.anInt4425; local47++) {
			if (this.aByteArray52 == null || this.aByteArray52[local47] <= 128) {
				@Pc(139) short local139 = this.aShortArray81[local47];
				@Pc(144) short local144 = this.aShortArray79[local47];
				@Pc(149) short local149 = this.aShortArray88[local47];
				local86 = Static75.anIntArray88[local139];
				local95 = Static75.anIntArray88[local144];
				@Pc(161) int local161 = Static75.anIntArray88[local149];
				@Pc(165) int local165 = Static293.anIntArray372[local139];
				@Pc(169) int local169 = Static293.anIntArray372[local144];
				@Pc(173) int local173 = Static293.anIntArray372[local149];
				if (-((local169 - local165) * (-local95 + local161)) + (local86 - local95) * (local169 - local173) > 0) {
					arg0.method5711(local161, local165, local173, local86, local95, local169);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(Z)V")
	private void method3700() {
		if (this.aClass118_1 != null) {
			this.aClass118_1.aBoolean250 = false;
		}
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(Z)V")
	private void method3701() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt4444; local29++) {
			@Pc(36) int local36 = this.anIntArray283[local29];
			@Pc(41) int local41 = this.anIntArray286[local29];
			@Pc(46) int local46 = this.anIntArray285[local29];
			if (local15 < local41) {
				local15 = local41;
			}
			if (local9 > local41) {
				local9 = local41;
			}
			if (local36 < local7) {
				local7 = local36;
			}
			if (local36 > local13) {
				local13 = local36;
			}
			if (local11 > local46) {
				local11 = local46;
			}
			if (local23 < local46) {
				local23 = local46;
			}
			@Pc(100) int local100 = local36 * local36 + local46 * local46;
			if (local25 < local100) {
				local25 = local100;
			}
			local100 = local41 * local41 + local36 * local36 + local46 * local46;
			if (local27 < local100) {
				local27 = local100;
			}
		}
		this.anInt4449 = local15;
		this.anInt4423 = local7;
		this.anInt4473 = local13;
		this.anInt4438 = local11;
		this.anInt4476 = local9;
		this.anInt4453 = local23;
		this.anInt4446 = (int) (Math.sqrt((double) local25) + 0.99D);
		this.anInt4415 = (int) (Math.sqrt((double) local27) + 0.99D);
		this.aBoolean355 = true;
	}

	@OriginalMember(owner = "client!ja", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class363.anIntArray697[arg0];
		@Pc(13) int local13 = Class363.anIntArray698[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4444; local15++) {
			@Pc(34) int local34 = this.anIntArray286[local15] * local13 - local9 * this.anIntArray285[local15] >> 14;
			this.anIntArray285[local15] = this.anIntArray286[local15] * local9 + local13 * this.anIntArray285[local15] >> 14;
			this.anIntArray286[local15] = local34;
		}
		this.method3697();
		this.aBoolean355 = false;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method3707(arg4, arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7553(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class66_Sub1 local8 = (Class66_Sub1) arg0;
		if (this.anInt4475 == 0 || local8.anInt4475 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt4444;
		@Pc(24) int[] local24 = local8.anIntArray283;
		@Pc(27) int[] local27 = local8.anIntArray286;
		@Pc(30) int[] local30 = local8.anIntArray285;
		@Pc(33) short[] local33 = local8.aShortArray82;
		@Pc(36) short[] local36 = local8.aShortArray80;
		@Pc(39) short[] local39 = local8.aShortArray78;
		@Pc(42) byte[] local42 = local8.aByteArray53;
		@Pc(51) short[] local51;
		@Pc(53) short[] local53;
		@Pc(49) short[] local49;
		@Pc(47) byte[] local47;
		if (this.aClass332_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local51 = this.aClass332_1.aShortArray117;
			local49 = this.aClass332_1.aShortArray118;
			local53 = this.aClass332_1.aShortArray119;
			local47 = this.aClass332_1.aByteArray87;
		}
		@Pc(80) short[] local80;
		@Pc(76) short[] local76;
		@Pc(82) short[] local82;
		@Pc(78) byte[] local78;
		if (local8.aClass332_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local78 = local8.aClass332_1.aByteArray87;
			local76 = local8.aClass332_1.aShortArray119;
			local80 = local8.aClass332_1.aShortArray117;
			local82 = local8.aClass332_1.aShortArray118;
		}
		@Pc(103) int[] local103 = local8.anIntArray282;
		@Pc(106) short[] local106 = local8.aShortArray85;
		if (!local8.aBoolean355) {
			local8.method3701();
		}
		@Pc(115) int local115 = local8.anInt4476;
		@Pc(118) int local118 = local8.anInt4449;
		@Pc(121) int local121 = local8.anInt4423;
		@Pc(124) int local124 = local8.anInt4473;
		@Pc(127) int local127 = local8.anInt4438;
		@Pc(130) int local130 = local8.anInt4453;
		for (@Pc(132) int local132 = 0; local132 < this.anInt4444; local132++) {
			@Pc(142) int local142 = this.anIntArray286[local132] - arg2;
			if (local115 <= local142 && local118 >= local142) {
				@Pc(158) int local158 = this.anIntArray283[local132] - arg1;
				if (local158 >= local121 && local124 >= local158) {
					@Pc(174) int local174 = this.anIntArray285[local132] - arg3;
					if (local174 >= local127 && local130 >= local174) {
						@Pc(188) int local188 = -1;
						@Pc(193) int local193 = this.anIntArray282[local132];
						@Pc(200) int local200 = this.anIntArray282[local132 + 1];
						for (@Pc(202) int local202 = local193; local202 < local200; local202++) {
							local188 = this.aShortArray85[local202] - 1;
							if (local188 == -1 || this.aByteArray53[local188] != 0) {
								break;
							}
						}
						if (local188 != -1) {
							for (@Pc(231) int local231 = 0; local231 < local21; local231++) {
								if (local24[local231] == local158 && local30[local231] == local174 && local27[local231] == local142) {
									local193 = local103[local231];
									local200 = local103[local231 + 1];
									@Pc(268) int local268 = -1;
									for (@Pc(270) int local270 = local193; local270 < local200; local270++) {
										local268 = local106[local270] - 1;
										if (local268 == -1 || local42[local268] != 0) {
											break;
										}
									}
									if (local268 != -1) {
										if (local51 == null) {
											this.aClass332_1 = new Class332();
											local51 = this.aClass332_1.aShortArray117 = Static325.method7942(this.aShortArray82);
											local53 = this.aClass332_1.aShortArray119 = Static325.method7942(this.aShortArray80);
											local49 = this.aClass332_1.aShortArray118 = Static325.method7942(this.aShortArray78);
											local47 = this.aClass332_1.aByteArray87 = Static54.method924(this.aByteArray53);
										}
										if (local80 == null) {
											@Pc(352) Class332 local352 = local8.aClass332_1 = new Class332();
											local80 = local352.aShortArray117 = Static325.method7942(local33);
											local76 = local352.aShortArray119 = Static325.method7942(local36);
											local82 = local352.aShortArray118 = Static325.method7942(local39);
											local78 = local352.aByteArray87 = Static54.method924(local42);
										}
										@Pc(385) short local385 = this.aShortArray82[local188];
										@Pc(390) short local390 = this.aShortArray80[local188];
										@Pc(395) short local395 = this.aShortArray78[local188];
										@Pc(400) byte local400 = this.aByteArray53[local188];
										local200 = local103[local231 + 1];
										local193 = local103[local231];
										@Pc(420) int local420;
										for (@Pc(412) int local412 = local193; local412 < local200; local412++) {
											local420 = local106[local412] - 1;
											if (local420 == -1) {
												break;
											}
											if (local78[local420] != 0) {
												local80[local420] += local385;
												local76[local420] += local390;
												local82[local420] += local395;
												local78[local420] += local400;
											}
										}
										local193 = this.anIntArray282[local132];
										local390 = local36[local268];
										local200 = this.anIntArray282[local132 + 1];
										local400 = local42[local268];
										local385 = local33[local268];
										local395 = local39[local268];
										for (local420 = local193; local420 < local200; local420++) {
											@Pc(506) int local506 = this.aShortArray85[local420] - 1;
											if (local506 == -1) {
												break;
											}
											if (local47[local506] != 0) {
												local51[local506] += local385;
												local53[local506] += local390;
												local49[local506] += local395;
												local47[local506] += local400;
											}
										}
										local8.method3706();
										this.method3706();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ja;Lclient!ja;ZIIZ)Lclient!da;")
	private Class66 method3702(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) Class66_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		arg0.aShort48 = this.aShort48;
		arg0.anInt4444 = this.anInt4444;
		if ((arg3 & 0x100) == 0) {
			arg0.aBoolean356 = this.aBoolean356;
		} else {
			arg0.aBoolean356 = true;
		}
		arg0.anInt4429 = this.anInt4429;
		arg0.anInt4472 = this.anInt4472;
		arg0.anInt4475 = this.anInt4475;
		arg0.anInt4425 = this.anInt4425;
		arg0.anInt4437 = this.anInt4437;
		arg0.aShort49 = this.aShort49;
		arg0.anInt4459 = this.anInt4459;
		arg0.anInt4432 = arg3;
		@Pc(69) boolean local69 = Static581.method7883(this.anInt4472, arg3);
		@Pc(75) boolean local75 = Static132.method6006(arg3, this.anInt4472);
		@Pc(81) boolean local81 = Static508.method7043(this.anInt4472, arg3);
		@Pc(87) boolean local87 = local75 | local69 | local81;
		@Pc(198) int local198;
		if (local87) {
			if (!local69) {
				arg0.anIntArray283 = this.anIntArray283;
			} else if (arg1.anIntArray283 == null || this.anInt4429 > arg1.anIntArray283.length) {
				arg0.anIntArray283 = arg1.anIntArray283 = new int[this.anInt4429];
			} else {
				arg0.anIntArray283 = arg1.anIntArray283;
			}
			if (!local75) {
				arg0.anIntArray286 = this.anIntArray286;
			} else if (arg1.anIntArray286 == null || this.anInt4429 > arg1.anIntArray286.length) {
				arg0.anIntArray286 = arg1.anIntArray286 = new int[this.anInt4429];
			} else {
				arg0.anIntArray286 = arg1.anIntArray286;
			}
			if (!local81) {
				arg0.anIntArray285 = this.anIntArray285;
			} else if (arg1.anIntArray285 == null || this.anInt4429 > arg1.anIntArray285.length) {
				arg0.anIntArray285 = arg1.anIntArray285 = new int[this.anInt4429];
			} else {
				arg0.anIntArray285 = arg1.anIntArray285;
			}
			for (local198 = 0; local198 < this.anInt4429; local198++) {
				if (local69) {
					arg0.anIntArray283[local198] = this.anIntArray283[local198];
				}
				if (local75) {
					arg0.anIntArray286[local198] = this.anIntArray286[local198];
				}
				if (local81) {
					arg0.anIntArray285[local198] = this.anIntArray285[local198];
				}
			}
		} else {
			arg0.anIntArray286 = this.anIntArray286;
			arg0.anIntArray283 = this.anIntArray283;
			arg0.anIntArray285 = this.anIntArray285;
		}
		if (Static379.method5606(arg3, this.anInt4472)) {
			arg0.aClass126_1 = arg1.aClass126_1;
			arg0.aClass126_1.aBoolean302 = this.aClass126_1.aBoolean302;
			arg0.aClass126_1.anInterface16_10 = this.aClass126_1.anInterface16_10;
			arg0.aClass126_1.aBoolean303 = true;
		} else if (Static374.method5547(this.anInt4472, arg3)) {
			arg0.aClass126_1 = this.aClass126_1;
		} else {
			arg0.aClass126_1 = null;
		}
		if (Static282.method4208(this.anInt4472, arg3)) {
			if (arg1.aShortArray89 == null || this.anInt4475 > arg1.aShortArray89.length) {
				arg0.aShortArray89 = arg1.aShortArray89 = new short[this.anInt4475];
			} else {
				arg0.aShortArray89 = arg1.aShortArray89;
			}
			for (local198 = 0; local198 < this.anInt4475; local198++) {
				arg0.aShortArray89[local198] = this.aShortArray89[local198];
			}
		} else {
			arg0.aShortArray89 = this.aShortArray89;
		}
		if (Static236.method3656(arg3, this.anInt4472)) {
			if (arg1.aByteArray52 == null || this.anInt4475 > arg1.aByteArray52.length) {
				arg0.aByteArray52 = arg1.aByteArray52 = new byte[this.anInt4475];
			} else {
				arg0.aByteArray52 = arg1.aByteArray52;
			}
			for (local198 = 0; local198 < this.anInt4475; local198++) {
				arg0.aByteArray52[local198] = this.aByteArray52[local198];
			}
		} else {
			arg0.aByteArray52 = this.aByteArray52;
		}
		if (Static263.method4046(arg3, this.anInt4472)) {
			arg0.aClass126_2 = arg1.aClass126_2;
			arg0.aClass126_2.aBoolean302 = this.aClass126_2.aBoolean302;
			arg0.aClass126_2.anInterface16_10 = this.aClass126_2.anInterface16_10;
			arg0.aClass126_2.aBoolean303 = true;
		} else if (Static480.method6784(this.anInt4472, arg3)) {
			arg0.aClass126_2 = this.aClass126_2;
		} else {
			arg0.aClass126_2 = null;
		}
		@Pc(557) int local557;
		if (Static64.method1032(this.anInt4472, arg3)) {
			if (arg1.aShortArray82 == null || this.anInt4437 > arg1.aShortArray82.length) {
				local198 = this.anInt4437;
				arg0.aShortArray80 = arg1.aShortArray80 = new short[local198];
				arg0.aShortArray82 = arg1.aShortArray82 = new short[local198];
				arg0.aShortArray78 = arg1.aShortArray78 = new short[local198];
			} else {
				arg0.aShortArray82 = arg1.aShortArray82;
				arg0.aShortArray78 = arg1.aShortArray78;
				arg0.aShortArray80 = arg1.aShortArray80;
			}
			if (this.aClass332_1 == null) {
				arg0.aClass332_1 = null;
				for (local198 = 0; local198 < this.anInt4437; local198++) {
					arg0.aShortArray82[local198] = this.aShortArray82[local198];
					arg0.aShortArray80[local198] = this.aShortArray80[local198];
					arg0.aShortArray78[local198] = this.aShortArray78[local198];
				}
			} else {
				if (arg1.aClass332_1 == null) {
					arg1.aClass332_1 = new Class332();
				}
				@Pc(545) Class332 local545 = arg0.aClass332_1 = arg1.aClass332_1;
				if (local545.aShortArray117 == null || local545.aShortArray117.length < this.anInt4437) {
					local557 = this.anInt4437;
					local545.aShortArray118 = new short[local557];
					local545.aShortArray119 = new short[local557];
					local545.aByteArray87 = new byte[local557];
					local545.aShortArray117 = new short[local557];
				}
				for (local557 = 0; local557 < this.anInt4437; local557++) {
					arg0.aShortArray82[local557] = this.aShortArray82[local557];
					arg0.aShortArray80[local557] = this.aShortArray80[local557];
					arg0.aShortArray78[local557] = this.aShortArray78[local557];
					local545.aShortArray117[local557] = this.aClass332_1.aShortArray117[local557];
					local545.aShortArray119[local557] = this.aClass332_1.aShortArray119[local557];
					local545.aShortArray118[local557] = this.aClass332_1.aShortArray118[local557];
					local545.aByteArray87[local557] = this.aClass332_1.aByteArray87[local557];
				}
			}
			arg0.aByteArray53 = this.aByteArray53;
		} else {
			arg0.aShortArray78 = this.aShortArray78;
			arg0.aByteArray53 = this.aByteArray53;
			arg0.aShortArray82 = this.aShortArray82;
			arg0.aClass332_1 = this.aClass332_1;
			arg0.aShortArray80 = this.aShortArray80;
		}
		if (Static41.method700(this.anInt4472, arg3)) {
			arg0.aClass126_4 = arg1.aClass126_4;
			arg0.aClass126_4.aBoolean303 = true;
			arg0.aClass126_4.anInterface16_10 = this.aClass126_4.anInterface16_10;
			arg0.aClass126_4.aBoolean302 = this.aClass126_4.aBoolean302;
		} else if (Static176.method3014(arg3, this.anInt4472)) {
			arg0.aClass126_4 = this.aClass126_4;
		} else {
			arg0.aClass126_4 = null;
		}
		if (Static67.method1100(this.anInt4472, arg3)) {
			if (arg1.aFloatArray39 == null || this.anInt4475 > arg1.aFloatArray39.length) {
				local198 = this.anInt4437;
				arg0.aFloatArray38 = arg1.aFloatArray38 = new float[local198];
				arg0.aFloatArray39 = arg1.aFloatArray39 = new float[local198];
			} else {
				arg0.aFloatArray39 = arg1.aFloatArray39;
				arg0.aFloatArray38 = arg1.aFloatArray38;
			}
			for (local198 = 0; local198 < this.anInt4437; local198++) {
				arg0.aFloatArray39[local198] = this.aFloatArray39[local198];
				arg0.aFloatArray38[local198] = this.aFloatArray38[local198];
			}
		} else {
			arg0.aFloatArray39 = this.aFloatArray39;
			arg0.aFloatArray38 = this.aFloatArray38;
		}
		if (Static287.method4272(this.anInt4472, arg3)) {
			arg0.aClass126_3 = arg1.aClass126_3;
			arg0.aClass126_3.aBoolean302 = this.aClass126_3.aBoolean302;
			arg0.aClass126_3.aBoolean303 = true;
			arg0.aClass126_3.anInterface16_10 = this.aClass126_3.anInterface16_10;
		} else if (Static242.method3758(this.anInt4472, arg3)) {
			arg0.aClass126_3 = this.aClass126_3;
		} else {
			arg0.aClass126_3 = null;
		}
		if (Static186.method3177(arg3, this.anInt4472)) {
			if (arg1.aShortArray81 == null || arg1.aShortArray81.length < this.anInt4475) {
				local198 = this.anInt4475;
				arg0.aShortArray88 = arg1.aShortArray88 = new short[local198];
				arg0.aShortArray79 = arg1.aShortArray79 = new short[local198];
				arg0.aShortArray81 = arg1.aShortArray81 = new short[local198];
			} else {
				arg0.aShortArray79 = arg1.aShortArray79;
				arg0.aShortArray81 = arg1.aShortArray81;
				arg0.aShortArray88 = arg1.aShortArray88;
			}
			for (local198 = 0; local198 < this.anInt4475; local198++) {
				arg0.aShortArray81[local198] = this.aShortArray81[local198];
				arg0.aShortArray79[local198] = this.aShortArray79[local198];
				arg0.aShortArray88[local198] = this.aShortArray88[local198];
			}
		} else {
			arg0.aShortArray88 = this.aShortArray88;
			arg0.aShortArray81 = this.aShortArray81;
			arg0.aShortArray79 = this.aShortArray79;
		}
		if (Static384.method7165(arg3, this.anInt4472)) {
			arg0.aClass118_1 = arg1.aClass118_1;
			arg0.aClass118_1.anInterface11_2 = this.aClass118_1.anInterface11_2;
			arg0.aClass118_1.aBoolean251 = true;
			arg0.aClass118_1.aBoolean250 = this.aClass118_1.aBoolean250;
		} else if (Static490.method6858(arg3, this.anInt4472)) {
			arg0.aClass118_1 = this.aClass118_1;
		} else {
			arg0.aClass118_1 = null;
		}
		if (Static274.method4152(this.anInt4472, arg3)) {
			if (arg1.aShortArray86 == null || arg1.aShortArray86.length < this.anInt4475) {
				local198 = this.anInt4475;
				arg0.aShortArray86 = arg1.aShortArray86 = new short[local198];
			} else {
				arg0.aShortArray86 = arg1.aShortArray86;
			}
			for (local198 = 0; local198 < this.anInt4475; local198++) {
				arg0.aShortArray86[local198] = this.aShortArray86[local198];
			}
		} else {
			arg0.aShortArray86 = this.aShortArray86;
		}
		if (!Static516.method7138(arg3, this.anInt4472)) {
			arg0.aClass219Array1 = this.aClass219Array1;
		} else if (arg1.aClass219Array1 == null || arg1.aClass219Array1.length < this.anInt4459) {
			local198 = this.anInt4459;
			arg0.aClass219Array1 = arg1.aClass219Array1 = new Class219[local198];
			for (local557 = 0; local557 < this.anInt4459; local557++) {
				arg0.aClass219Array1[local557] = this.aClass219Array1[local557].method5068();
			}
		} else {
			arg0.aClass219Array1 = arg1.aClass219Array1;
			for (local198 = 0; local198 < this.anInt4459; local198++) {
				arg0.aClass219Array1[local198].method5072(this.aClass219Array1[local198]);
			}
		}
		arg0.anIntArrayArray25 = this.anIntArrayArray25;
		arg0.aShortArray85 = this.aShortArray85;
		arg0.anIntArray287 = this.anIntArray287;
		arg0.anIntArrayArray26 = this.anIntArrayArray26;
		arg0.aShortArray77 = this.aShortArray77;
		if (this.aBoolean355) {
			arg0.anInt4453 = this.anInt4453;
			arg0.aBoolean355 = true;
			arg0.anInt4423 = this.anInt4423;
			arg0.anInt4415 = this.anInt4415;
			arg0.anInt4473 = this.anInt4473;
			arg0.anInt4449 = this.anInt4449;
			arg0.anInt4446 = this.anInt4446;
			arg0.anInt4476 = this.anInt4476;
			arg0.anInt4438 = this.anInt4438;
		} else {
			arg0.aBoolean355 = false;
		}
		arg0.aShortArray84 = this.aShortArray84;
		arg0.anIntArray288 = this.anIntArray288;
		arg0.anIntArray282 = this.anIntArray282;
		arg0.aShortArray83 = this.aShortArray83;
		arg0.aClass139Array2 = this.aClass139Array2;
		arg0.anIntArrayArray27 = this.anIntArrayArray27;
		arg0.aClass242Array1 = this.aClass242Array1;
		arg0.aClass270Array2 = this.aClass270Array2;
		arg0.aShortArray87 = this.aShortArray87;
		arg0.anIntArray284 = this.anIntArray284;
		return arg0;
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
	private void method3703() {
		if (this.anInt4425 == 0) {
			return;
		}
		if (this.method3698() && this.method3694()) {
			this.aClass100_Sub1_11.method4863(this.aClass126_1.anInterface16_10, 0);
			this.aClass100_Sub1_11.method4863(this.aClass126_2.anInterface16_10, 1);
			this.aClass100_Sub1_11.method4863(this.aClass126_3.anInterface16_10, 2);
			@Pc(61) boolean local61;
			if ((this.anInt4472 & 0x37) == 0) {
				this.aClass100_Sub1_11.method4774(false);
				local61 = false;
				this.aClass100_Sub1_11.method4757(this.aClass100_Sub1_11.aClass199_14);
			} else {
				local61 = true;
				this.aClass100_Sub1_11.method4774(true);
				this.aClass100_Sub1_11.method4863(this.aClass126_4.anInterface16_10, 3);
				this.aClass100_Sub1_11.method4757(this.aClass100_Sub1_11.aClass199_16);
			}
			for (@Pc(101) int local101 = 0; local101 < this.anIntArray287.length; local101++) {
				@Pc(108) int local108 = this.anIntArray284[local101];
				@Pc(115) int local115 = this.anIntArray284[local101 + 1];
				@Pc(122) int local122 = this.aShortArray86[local108] & 0xFFFF;
				if (local122 == 65535) {
					local122 = -1;
				}
				this.aClass100_Sub1_11.method4761(local122, local61, true);
				this.aClass100_Sub1_11.method4764(this.anIntArray288[local101], Static341.aClass213_5, local108 * 3, local115 - local108, this.anIntArray287[local101], this.aClass118_1.anInterface11_2);
			}
		}
		this.method3692();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class66 method7551(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class66_Sub1 local12;
		@Pc(16) Class66_Sub1 local16;
		if (arg0 == 1) {
			local12 = this.aClass100_Sub1_11.aClass66_Sub1_26;
			local16 = this.aClass100_Sub1_11.aClass66_Sub1_24;
		} else if (arg0 == 2) {
			local12 = this.aClass100_Sub1_11.aClass66_Sub1_25;
			local16 = this.aClass100_Sub1_11.aClass66_Sub1_30;
		} else if (arg0 == 3) {
			local12 = this.aClass100_Sub1_11.aClass66_Sub1_27;
			local16 = this.aClass100_Sub1_11.aClass66_Sub1_28;
		} else if (arg0 == 4) {
			local16 = this.aClass100_Sub1_11.aClass66_Sub1_21;
			local12 = this.aClass100_Sub1_11.aClass66_Sub1_23;
		} else if (arg0 == 5) {
			local12 = this.aClass100_Sub1_11.aClass66_Sub1_22;
			local16 = this.aClass100_Sub1_11.aClass66_Sub1_29;
		} else {
			local12 = local16 = new Class66_Sub1(this.aClass100_Sub1_11, 0, 0, true, false);
		}
		return this.method3702(local12, local16, arg2, arg1, arg0 != 0);
	}

	@OriginalMember(owner = "client!ja", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) Class67 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean355) {
			this.method3701();
		}
		@Pc(16) int local16 = this.anInt4423 + arg4;
		@Pc(21) int local21 = this.anInt4473 + arg4;
		@Pc(26) int local26 = this.anInt4438 + arg6;
		@Pc(31) int local31 = this.anInt4453 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8104 + local21 >> arg2.anInt8108 >= arg2.anInt8111 || local26 < 0 || local31 + arg2.anInt8104 >> arg2.anInt8108 >= arg2.anInt8110)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8111 <= arg3.anInt8104 + local21 >> arg3.anInt8108 || local26 < 0 || local31 + arg3.anInt8104 >> arg3.anInt8108 >= arg3.anInt8110) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8108;
			local21 = arg2.anInt8104 + local21 - 1 >> arg2.anInt8108;
			local26 >>= arg2.anInt8108;
			local31 = local31 + arg2.anInt8104 - 1 >> arg2.anInt8108;
			if (arg5 == arg2.method6707(local26, local16) && arg5 == arg2.method6707(local26, local21) && arg2.method6707(local31, local16) == arg5 && arg2.method6707(local31, local21) == arg5) {
				return;
			}
		}
		@Pc(221) int local221;
		if (arg0 == 1) {
			for (local221 = 0; local221 < this.anInt4444; local221++) {
				this.anIntArray286[local221] = this.anIntArray286[local221] + arg2.method6711(this.anIntArray285[local221] + arg6, this.anIntArray283[local221] + arg4) - arg5;
			}
		} else {
			@Pc(229) int local229;
			@Pc(237) int local237;
			if (arg0 == 2) {
				local221 = this.anInt4476;
				if (local221 == 0) {
					return;
				}
				for (local229 = 0; local229 < this.anInt4444; local229++) {
					local237 = (this.anIntArray286[local229] << 16) / local221;
					if (arg1 > local237) {
						this.anIntArray286[local229] -= -((arg1 - local237) * (-arg5 + arg2.method6711(arg6 + this.anIntArray285[local229], arg4 + this.anIntArray283[local229])) / arg1);
					}
				}
			} else {
				@Pc(245) int local245;
				if (arg0 == 3) {
					local221 = (arg1 & 0xFF) * 4;
					local229 = (arg1 >> 8 & 0xFF) * 4;
					local237 = (arg1 >> 16 & 0xFF) << 6;
					local245 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local221 >> 1) < 0 || arg2.anInt8111 << arg2.anInt8108 <= (local221 >> 1) + arg4 + arg2.anInt8104 || arg6 - (local229 >> 1) < 0 || arg2.anInt8104 + (local229 >> 1) + arg6 >= arg2.anInt8110 << arg2.anInt8108) {
						return;
					}
					this.method7540(local229, arg2, arg4, local237, local221, arg5, local245, arg6);
				} else if (arg0 == 4) {
					local221 = this.anInt4449 - this.anInt4476;
					for (local229 = 0; local229 < this.anInt4444; local229++) {
						this.anIntArray286[local229] = this.anIntArray286[local229] + arg3.method6711(arg6 + this.anIntArray285[local229], arg4 + this.anIntArray283[local229]) + local221 - arg5;
					}
				} else if (arg0 == 5) {
					local221 = this.anInt4449 - this.anInt4476;
					for (local229 = 0; local229 < this.anInt4444; local229++) {
						local237 = arg4 + this.anIntArray283[local229];
						local245 = this.anIntArray285[local229] + arg6;
						@Pc(347) int local347 = arg2.method6711(local245, local237);
						@Pc(353) int local353 = arg3.method6711(local245, local237);
						@Pc(360) int local360 = local347 - arg1 - local353;
						this.anIntArray286[local229] = local347 + (local360 * ((this.anIntArray286[local229] << 8) / local221) >> 8) - arg5;
					}
				}
			}
		}
		this.method3697();
		this.aBoolean355 = false;
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "()[Lclient!qg;")
	@Override
	public Class270[] method7561() {
		return this.aClass270Array2;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4475; local7++) {
			if (this.aShortArray89[local7] == arg0) {
				this.aShortArray89[local7] = arg1;
			}
		}
		if (this.aClass242Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt4459; local38++) {
				@Pc(45) Class242 local45 = this.aClass242Array1[local38];
				@Pc(50) Class219 local50 = this.aClass219Array1[local38];
				local50.anInt6105 = Static250.anIntArray314[this.aShortArray89[local45.anInt6776] & 0xFFFF] & 0xFFFFFF | local50.anInt6105 & 0xFF000000;
			}
		}
		this.method3695();
	}

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray27 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4429; local12++) {
			this.anIntArray283[local12] <<= 0x4;
			this.anIntArray286[local12] <<= 0x4;
			this.anIntArray285[local12] <<= 0x4;
		}
		Static427.anInt7296 = 0;
		Static237.anInt8063 = 0;
		Static72.anInt1637 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ja", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt4432;
	}

	@OriginalMember(owner = "client!ja", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean355) {
			this.method3701();
		}
		return this.anInt4438;
	}

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class363.anIntArray697[arg0];
		@Pc(13) int local13 = Class363.anIntArray698[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4444; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray285[local15] + this.anIntArray283[local15] * local13 >> 14;
			this.anIntArray285[local15] = this.anIntArray285[local15] * local13 - local9 * this.anIntArray283[local15] >> 14;
			this.anIntArray283[local15] = local34;
		}
		this.method3697();
		this.aBoolean355 = false;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "()[Lclient!hi;")
	@Override
	public Class139[] method7550() {
		return this.aClass139Array2;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4475; local7++) {
			local16 = this.aShortArray89[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			@Pc(46) int local46 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg2 != -1) {
				local46 -= -(arg3 * (arg2 - local46) >> 7);
			}
			this.aShortArray89[local7] = (short) (local22 << 10 | local28 << 7 | local46);
		}
		if (this.aClass242Array1 != null) {
			for (local16 = 0; local16 < this.anInt4459; local16++) {
				@Pc(111) Class242 local111 = this.aClass242Array1[local16];
				@Pc(116) Class219 local116 = this.aClass219Array1[local16];
				local116.anInt6105 = local116.anInt6105 & 0xFF000000 | Static250.anIntArray314[this.aShortArray89[local111.anInt6776] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3695();
	}

	@OriginalMember(owner = "client!ja", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4444; local7++) {
			if (arg0 != 0) {
				this.anIntArray283[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray286[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray285[local7] += arg2;
			}
		}
		this.method3697();
		this.aBoolean355 = false;
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(Z)V")
	private void method3704() {
		if (this.aClass242Array1 == null) {
			return;
		}
		this.aClass100_Sub1_11.ZA(false);
		this.aClass100_Sub1_11.method4774(false);
		this.aClass100_Sub1_11.method4883(1, Static224.aClass119_18);
		this.aClass100_Sub1_11.method4816(1, Static224.aClass119_18);
		for (@Pc(27) int local27 = 0; local27 < this.anInt4459; local27++) {
			@Pc(34) Class242 local34 = this.aClass242Array1[local27];
			@Pc(39) Class219 local39 = this.aClass219Array1[local27];
			if (!local34.aBoolean525 || !this.aClass100_Sub1_11.method6248()) {
				@Pc(68) float local68 = (float) (this.anIntArray283[local34.anInt6775] + this.anIntArray283[local34.anInt6779] + this.anIntArray283[local34.anInt6781]) * 0.3333333F;
				@Pc(89) float local89 = (float) (this.anIntArray286[local34.anInt6781] + this.anIntArray286[local34.anInt6775] + this.anIntArray286[local34.anInt6779]) * 0.3333333F;
				@Pc(111) float local111 = (float) (this.anIntArray285[local34.anInt6775] + this.anIntArray285[local34.anInt6779] + this.anIntArray285[local34.anInt6781]) * 0.3333333F;
				@Pc(125) float local125 = Static484.aFloat252 * local68 + Static586.aFloat266 * local89 + local111 * Static67.aFloat28 + Static112.aFloat60;
				@Pc(139) float local139 = Static228.aFloat130 + local111 * Static351.aFloat193 + Static109.aFloat59 * local89 + local68 * Static391.aFloat201;
				@Pc(153) float local153 = Static103.aFloat55 + local111 * Static437.aFloat210 + Static593.aFloat268 * local89 + local68 * Static454.aFloat238;
				@Pc(158) Class68_Sub2 local158 = this.aClass100_Sub1_11.method4878();
				local158.method5109(local39.anInt6107 * local34.aShort79 >> 7, (float) local39.anInt6101 + local139, (float) -local34.anInt6784 + local153, local125 + (float) local39.anInt6103, local39.anInt6100 * local34.aShort81 >> 7, local39.anInt6106);
				local158.method5112(this.aClass100_Sub1_11.aClass68_Sub2_17);
				this.aClass100_Sub1_11.method4858();
				@Pc(206) int local206 = local39.anInt6105;
				this.aClass100_Sub1_11.method4761(local34.aShort80, false, false);
				this.aClass100_Sub1_11.method4801(local34.aByte91);
				this.aClass100_Sub1_11.method4877(local206);
				this.aClass100_Sub1_11.method4796();
			}
		}
		this.aClass100_Sub1_11.method4816(1, Static48.aClass119_5);
		this.aClass100_Sub1_11.method4883(1, Static48.aClass119_5);
		this.aClass100_Sub1_11.ZA(true);
	}

	@OriginalMember(owner = "client!ja", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4444; local3++) {
			this.anIntArray285[local3] = -this.anIntArray285[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt4437; local29++) {
			this.aShortArray78[local29] = (short) -this.aShortArray78[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt4475; local48++) {
			@Pc(55) short local55 = this.aShortArray81[local48];
			this.aShortArray81[local48] = this.aShortArray88[local48];
			this.aShortArray88[local48] = local55;
		}
		this.method3697();
		this.method3706();
		this.method3700();
		this.aBoolean355 = false;
	}

	@OriginalMember(owner = "client!ja", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass100_Sub1_11.anInterface5_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4475; local11++) {
			if (arg0 == this.aShortArray86[local11]) {
				this.aShortArray86[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(43) Class343 local43 = local9.method917(arg0 & 0xFFFF);
			local31 = local43.aByte119;
			local33 = local43.aByte115;
		}
		@Pc(51) byte local51 = 0;
		@Pc(53) byte local53 = 0;
		if (arg1 != -1) {
			@Pc(63) Class343 local63 = local9.method917(arg1 & 0xFFFF);
			local51 = local63.aByte119;
			local53 = local63.aByte115;
		}
		if (!(local33 != local53 | local31 != local51)) {
			return;
		}
		if (this.aClass242Array1 != null) {
			for (@Pc(92) int local92 = 0; local92 < this.anInt4459; local92++) {
				@Pc(99) Class242 local99 = this.aClass242Array1[local92];
				@Pc(104) Class219 local104 = this.aClass219Array1[local92];
				local104.anInt6105 = Static250.anIntArray314[this.aShortArray89[local99.anInt6776] & 0xFFFF] & 0xFFFFFF | local104.anInt6105 & 0xFF000000;
			}
		}
		this.method3695();
	}

	@OriginalMember(owner = "client!ja", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort48 = (short) arg0;
		this.method3697();
		this.method3706();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg5 && arg0 > arg3 && arg1 > arg3) {
			return false;
		} else if (arg3 > arg5 && arg0 < arg3 && arg1 < arg3) {
			return false;
		} else if (arg6 < arg7 && arg4 > arg6 && arg2 > arg6) {
			return false;
		} else {
			return arg6 <= arg7 || arg6 <= arg4 || arg2 >= arg6;
		}
	}

	@OriginalMember(owner = "client!ja", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		if (this.aClass126_1 != null) {
			this.aClass126_1.aBoolean303 = Static379.method5606(arg0, this.anInt4472);
		}
		if (this.aClass126_3 != null) {
			this.aClass126_3.aBoolean303 = Static287.method4272(this.anInt4472, arg0);
		}
		if (this.aClass126_2 != null) {
			this.aClass126_2.aBoolean303 = Static263.method4046(arg0, this.anInt4472);
		}
		if (this.aClass126_4 != null) {
			this.aClass126_4.aBoolean303 = Static41.method700(this.anInt4472, arg0);
		}
		this.anInt4432 = arg0;
		this.aBoolean358 = true;
		if (this.aClass332_1 != null && (this.anInt4432 & 0x10000) == 0) {
			this.aByteArray53 = this.aClass332_1.aByteArray87;
			this.aShortArray82 = this.aClass332_1.aShortArray117;
			this.aShortArray80 = this.aClass332_1.aShortArray119;
			this.aShortArray78 = this.aClass332_1.aShortArray118;
			this.aClass332_1 = null;
		}
		this.method3692();
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
	private void method3706() {
		if ((this.anInt4472 & 0x37) == 0) {
			if (this.aClass126_2 != null) {
				this.aClass126_2.aBoolean302 = false;
			}
		} else if (this.aClass126_4 != null) {
			this.aClass126_4.aBoolean302 = false;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIZLclient!q;II)Z")
	private boolean method3707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class68 arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class68_Sub2 local8 = (Class68_Sub2) arg3;
		@Pc(12) Class68_Sub2 local12 = this.aClass100_Sub1_11.aClass68_Sub2_16;
		@Pc(33) float local33 = local12.aFloat182 + local12.aFloat187 * local8.aFloat182 + local8.aFloat180 * local12.aFloat181 + local12.aFloat191 * local8.aFloat183;
		@Pc(54) float local54 = local8.aFloat182 * local12.aFloat189 + local8.aFloat180 * local12.aFloat188 + local12.aFloat184 * local8.aFloat183 + local12.aFloat180;
		Static593.aFloat268 = local12.aFloat186 * local8.aFloat190 + local12.aFloat190 * local8.aFloat188 + local8.aFloat181 * local12.aFloat185;
		@Pc(93) float local93 = local8.aFloat183 * local12.aFloat186 + local8.aFloat180 * local12.aFloat190 + local8.aFloat182 * local12.aFloat185 + local12.aFloat183;
		Static67.aFloat28 = local8.aFloat191 * local12.aFloat187 + local8.aFloat184 * local12.aFloat181 + local12.aFloat191 * local8.aFloat186;
		Static484.aFloat252 = local12.aFloat187 * local8.aFloat187 + local8.aFloat189 * local12.aFloat181 + local12.aFloat191 * local8.aFloat185;
		Static391.aFloat201 = local8.aFloat185 * local12.aFloat184 + local8.aFloat187 * local12.aFloat189 + local12.aFloat188 * local8.aFloat189;
		Static351.aFloat193 = local12.aFloat189 * local8.aFloat191 + local12.aFloat188 * local8.aFloat184 + local8.aFloat186 * local12.aFloat184;
		Static454.aFloat238 = local12.aFloat186 * local8.aFloat185 + local8.aFloat189 * local12.aFloat190 + local12.aFloat185 * local8.aFloat187;
		Static109.aFloat59 = local8.aFloat190 * local12.aFloat184 + local12.aFloat189 * local8.aFloat181 + local12.aFloat188 * local8.aFloat188;
		Static586.aFloat266 = local8.aFloat190 * local12.aFloat191 + local12.aFloat181 * local8.aFloat188 + local12.aFloat187 * local8.aFloat181;
		Static437.aFloat210 = local8.aFloat186 * local12.aFloat186 + local8.aFloat191 * local12.aFloat185 + local8.aFloat184 * local12.aFloat190;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass100_Sub1_11.anInt5755;
		@Pc(255) int local255 = this.aClass100_Sub1_11.anInt5774;
		if (!this.aBoolean355) {
			this.method3701();
		}
		Static271.anIntArray338[0] = this.anInt4423;
		Static175.anIntArray204[0] = this.anInt4476;
		Static515.anIntArray618[0] = this.anInt4438;
		Static271.anIntArray338[1] = this.anInt4473;
		Static175.anIntArray204[1] = this.anInt4476;
		Static271.anIntArray338[2] = this.anInt4423;
		Static515.anIntArray618[1] = this.anInt4438;
		Static175.anIntArray204[2] = this.anInt4449;
		Static515.anIntArray618[2] = this.anInt4438;
		Static271.anIntArray338[3] = this.anInt4473;
		Static175.anIntArray204[3] = this.anInt4449;
		Static515.anIntArray618[3] = this.anInt4438;
		Static271.anIntArray338[4] = this.anInt4423;
		Static175.anIntArray204[4] = this.anInt4476;
		Static515.anIntArray618[4] = this.anInt4453;
		Static271.anIntArray338[5] = this.anInt4473;
		Static175.anIntArray204[5] = this.anInt4476;
		Static515.anIntArray618[5] = this.anInt4453;
		Static271.anIntArray338[6] = this.anInt4423;
		Static175.anIntArray204[6] = this.anInt4449;
		Static271.anIntArray338[7] = this.anInt4473;
		Static515.anIntArray618[6] = this.anInt4453;
		Static175.anIntArray204[7] = this.anInt4449;
		Static515.anIntArray618[7] = this.anInt4453;
		@Pc(434) float local434;
		@Pc(448) float local448;
		@Pc(420) float local420;
		@Pc(396) float local396;
		@Pc(401) float local401;
		@Pc(406) float local406;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local396 = Static271.anIntArray338[local383];
			local401 = Static175.anIntArray204[local383];
			local406 = Static515.anIntArray618[local383];
			local420 = local93 + local396 * Static454.aFloat238 + Static593.aFloat268 * local401 + Static437.aFloat210 * local406;
			local434 = local33 + local406 * Static67.aFloat28 + Static586.aFloat266 * local401 + Static484.aFloat252 * local396;
			local448 = Static109.aFloat59 * local401 + Static391.aFloat201 * local396 + Static351.aFloat193 * local406 + local54;
			if (local420 >= (float) this.aClass100_Sub1_11.anInt5786) {
				if (arg0 > 0) {
					local420 = arg0;
				}
				@Pc(475) float local475 = (float) this.aClass100_Sub1_11.anInt5788 + (float) local251 * local434 / local420;
				@Pc(487) float local487 = (float) this.aClass100_Sub1_11.anInt5764 + (float) local255 * local448 / local420;
				if (local475 < local241) {
					local241 = local475;
				}
				if (local243 < local475) {
					local243 = local475;
				}
				if (local487 > local247) {
					local247 = local487;
				}
				if (local245 > local487) {
					local245 = local487;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg4 && (float) arg4 < local243 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg2) {
				return true;
			}
			if (Static75.anIntArray88.length < this.anInt4437) {
				Static293.anIntArray372 = new int[this.anInt4437];
				Static75.anIntArray88 = new int[this.anInt4437];
			}
			@Pc(632) int local632;
			for (@Pc(558) int local558 = 0; local558 < this.anInt4444; local558++) {
				local406 = this.anIntArray285[local558];
				local401 = this.anIntArray286[local558];
				local396 = this.anIntArray283[local558];
				local420 = local93 + local406 * Static437.aFloat210 + Static593.aFloat268 * local401 + local396 * Static454.aFloat238;
				local434 = local396 * Static484.aFloat252 + Static586.aFloat266 * local401 + Static67.aFloat28 * local406 + local33;
				local448 = local396 * Static391.aFloat201 + local401 * Static109.aFloat59 + local406 * Static351.aFloat193 + local54;
				@Pc(639) int local639;
				@Pc(641) int local641;
				@Pc(650) int local650;
				if (local420 >= (float) this.aClass100_Sub1_11.anInt5786) {
					if (arg0 > 0) {
						local420 = arg0;
					}
					local632 = (int) ((float) this.aClass100_Sub1_11.anInt5788 + (float) local251 * local434 / local420);
					local639 = (int) ((float) this.aClass100_Sub1_11.anInt5764 + local448 * (float) local255 / local420);
					local641 = this.anIntArray282[local558];
					local650 = this.anIntArray282[local558 + 1];
					for (@Pc(721) int local721 = local641; local721 < local650; local721++) {
						@Pc(730) int local730 = this.aShortArray85[local721] - 1;
						if (local730 == -1) {
							break;
						}
						Static75.anIntArray88[local730] = local632;
						Static293.anIntArray372[local730] = local639;
					}
				} else {
					local632 = this.anIntArray282[local558];
					local639 = this.anIntArray282[local558 + 1];
					for (local641 = local632; local641 < local639; local641++) {
						local650 = this.aShortArray85[local641] - 1;
						if (local650 == -1) {
							break;
						}
						Static75.anIntArray88[this.aShortArray85[local641] - 1] = -999999;
					}
				}
			}
			for (local632 = 0; local632 < this.anInt4475; local632++) {
				if (Static75.anIntArray88[this.aShortArray81[local632]] != -999999 && Static75.anIntArray88[this.aShortArray79[local632]] != -999999 && Static75.anIntArray88[this.aShortArray88[local632]] != -999999 && this.method3705(Static293.anIntArray372[this.aShortArray79[local632]], Static293.anIntArray372[this.aShortArray88[local632]], Static75.anIntArray88[this.aShortArray88[local632]], arg1, Static75.anIntArray88[this.aShortArray79[local632]], Static293.anIntArray372[this.aShortArray81[local632]], arg4, Static75.anIntArray88[this.aShortArray81[local632]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ja", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class363.anIntArray697[arg0];
		@Pc(13) int local13 = Class363.anIntArray698[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4444; local15++) {
			@Pc(34) int local34 = this.anIntArray286[local15] * local9 + this.anIntArray283[local15] * local13 >> 14;
			this.anIntArray286[local15] = local13 * this.anIntArray286[local15] - this.anIntArray283[local15] * local9 >> 14;
			this.anIntArray283[local15] = local34;
		}
		this.method3697();
		this.aBoolean355 = false;
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "()V")
	@Override
	protected void method7557() {
	}

	@OriginalMember(owner = "client!ja", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean355) {
			this.method3701();
		}
		return this.anInt4423;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7552(@OriginalArg(0) Class68 arg0) {
		@Pc(8) Class68_Sub2 local8 = (Class68_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass139Array2 != null) {
			for (local13 = 0; local13 < this.aClass139Array2.length; local13++) {
				@Pc(20) Class139 local20 = this.aClass139Array2[local13];
				@Pc(22) Class139 local22 = local20;
				if (local20.aClass139_2 != null) {
					local22 = local20.aClass139_2;
				}
				local22.anInt3916 = (int) (local8.aFloat182 + (float) this.anIntArray285[local20.anInt3911] * local8.aFloat191 + local8.aFloat181 * (float) this.anIntArray286[local20.anInt3911] + (float) this.anIntArray283[local20.anInt3911] * local8.aFloat187);
				local22.anInt3908 = (int) (local8.aFloat180 + (float) this.anIntArray285[local20.anInt3911] * local8.aFloat184 + local8.aFloat188 * (float) this.anIntArray286[local20.anInt3911] + (float) this.anIntArray283[local20.anInt3911] * local8.aFloat189);
				local22.anInt3917 = (int) (local8.aFloat183 + (float) this.anIntArray285[local20.anInt3911] * local8.aFloat186 + (float) this.anIntArray283[local20.anInt3911] * local8.aFloat185 + local8.aFloat190 * (float) this.anIntArray286[local20.anInt3911]);
				local22.anInt3909 = (int) ((float) this.anIntArray286[local20.anInt3913] * local8.aFloat181 + local8.aFloat187 * (float) this.anIntArray283[local20.anInt3913] + (float) this.anIntArray285[local20.anInt3913] * local8.aFloat191 + local8.aFloat182);
				local22.anInt3910 = (int) ((float) this.anIntArray285[local20.anInt3913] * local8.aFloat184 + local8.aFloat189 * (float) this.anIntArray283[local20.anInt3913] + local8.aFloat188 * (float) this.anIntArray286[local20.anInt3913] + local8.aFloat180);
				local22.anInt3918 = (int) (local8.aFloat190 * (float) this.anIntArray286[local20.anInt3913] + local8.aFloat185 * (float) this.anIntArray283[local20.anInt3913] + local8.aFloat186 * (float) this.anIntArray285[local20.anInt3913] + local8.aFloat183);
				local22.anInt3923 = (int) (local8.aFloat187 * (float) this.anIntArray283[local20.anInt3912] + local8.aFloat181 * (float) this.anIntArray286[local20.anInt3912] + (float) this.anIntArray285[local20.anInt3912] * local8.aFloat191 + local8.aFloat182);
				local22.anInt3920 = (int) (local8.aFloat180 + (float) this.anIntArray286[local20.anInt3912] * local8.aFloat188 + (float) this.anIntArray283[local20.anInt3912] * local8.aFloat189 + local8.aFloat184 * (float) this.anIntArray285[local20.anInt3912]);
				local22.anInt3919 = (int) (local8.aFloat183 + (float) this.anIntArray285[local20.anInt3912] * local8.aFloat186 + local8.aFloat185 * (float) this.anIntArray283[local20.anInt3912] + local8.aFloat190 * (float) this.anIntArray286[local20.anInt3912]);
			}
		}
		if (this.aClass270Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass270Array2.length; local13++) {
			@Pc(361) Class270 local361 = this.aClass270Array2[local13];
			@Pc(363) Class270 local363 = local361;
			if (local361.aClass270_2 != null) {
				local363 = local361.aClass270_2;
			}
			if (local361.aClass68_6 == null) {
				local361.aClass68_6 = local8.method6462();
			} else {
				local361.aClass68_6.M(local8);
			}
			local363.anInt7321 = (int) ((float) this.anIntArray283[local361.anInt7311] * local8.aFloat187 + (float) this.anIntArray286[local361.anInt7311] * local8.aFloat181 + local8.aFloat191 * (float) this.anIntArray285[local361.anInt7311] + local8.aFloat182);
			local363.anInt7314 = (int) ((float) this.anIntArray285[local361.anInt7311] * local8.aFloat184 + local8.aFloat189 * (float) this.anIntArray283[local361.anInt7311] + (float) this.anIntArray286[local361.anInt7311] * local8.aFloat188 + local8.aFloat180);
			local363.anInt7320 = (int) ((float) this.anIntArray285[local361.anInt7311] * local8.aFloat186 + (float) this.anIntArray283[local361.anInt7311] * local8.aFloat185 + (float) this.anIntArray286[local361.anInt7311] * local8.aFloat190 + local8.aFloat183);
		}
	}

	@OriginalMember(owner = "client!ja", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static237.anInt8063 = 0;
			Static72.anInt1637 = 0;
			local16 = 0;
			Static427.anInt7296 = 0;
			for (local20 = 0; local20 < this.anInt4444; local20++) {
				Static72.anInt1637 += this.anIntArray283[local20];
				Static237.anInt8063 += this.anIntArray286[local20];
				Static427.anInt7296 += this.anIntArray285[local20];
				local16++;
			}
			if (local16 <= 0) {
				Static427.anInt7296 = arg3;
				Static237.anInt8063 = arg2;
				Static72.anInt1637 = arg1;
			} else {
				Static427.anInt7296 = arg3 + Static427.anInt7296 / local16;
				Static72.anInt1637 = arg1 + Static72.anInt1637 / local16;
				Static237.anInt8063 = Static237.anInt8063 / local16 + arg2;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt4444; local16++) {
				this.anIntArray283[local16] += arg1;
				this.anIntArray286[local16] += arg2;
				this.anIntArray285[local16] += arg3;
			}
		} else {
			@Pc(174) int local174;
			@Pc(193) int local193;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt4444; local16++) {
					this.anIntArray283[local16] -= Static72.anInt1637;
					this.anIntArray286[local16] -= Static237.anInt8063;
					this.anIntArray285[local16] -= Static427.anInt7296;
					if (arg3 != 0) {
						local20 = Class363.anIntArray697[arg3];
						local174 = Class363.anIntArray698[arg3];
						local193 = this.anIntArray286[local16] * local20 + this.anIntArray283[local16] * local174 + 16383 >> 14;
						this.anIntArray286[local16] = this.anIntArray286[local16] * local174 + 16383 - local20 * this.anIntArray283[local16] >> 14;
						this.anIntArray283[local16] = local193;
					}
					if (arg1 != 0) {
						local20 = Class363.anIntArray697[arg1];
						local174 = Class363.anIntArray698[arg1];
						local193 = local174 * this.anIntArray286[local16] + 16383 - this.anIntArray285[local16] * local20 >> 14;
						this.anIntArray285[local16] = this.anIntArray286[local16] * local20 + local174 * this.anIntArray285[local16] + 16383 >> 14;
						this.anIntArray286[local16] = local193;
					}
					if (arg2 != 0) {
						local20 = Class363.anIntArray697[arg2];
						local174 = Class363.anIntArray698[arg2];
						local193 = this.anIntArray285[local16] * local20 + local174 * this.anIntArray283[local16] + 16383 >> 14;
						this.anIntArray285[local16] = local174 * this.anIntArray285[local16] + 16383 - this.anIntArray283[local16] * local20 >> 14;
						this.anIntArray283[local16] = local193;
					}
					this.anIntArray283[local16] += Static72.anInt1637;
					this.anIntArray286[local16] += Static237.anInt8063;
					this.anIntArray285[local16] += Static427.anInt7296;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt4444; local16++) {
					this.anIntArray283[local16] -= Static72.anInt1637;
					this.anIntArray286[local16] -= Static237.anInt8063;
					this.anIntArray285[local16] -= Static427.anInt7296;
					this.anIntArray283[local16] = this.anIntArray283[local16] * arg1 / 128;
					this.anIntArray286[local16] = arg2 * this.anIntArray286[local16] / 128;
					this.anIntArray285[local16] = this.anIntArray285[local16] * arg3 / 128;
					this.anIntArray283[local16] += Static72.anInt1637;
					this.anIntArray286[local16] += Static237.anInt8063;
					this.anIntArray285[local16] += Static427.anInt7296;
				}
			} else {
				@Pc(529) Class242 local529;
				@Pc(534) Class219 local534;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt4475; local16++) {
						local20 = (this.aByteArray52[local16] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray52[local16] = (byte) local20;
					}
					if (this.aClass242Array1 != null) {
						for (local20 = 0; local20 < this.anInt4459; local20++) {
							local529 = this.aClass242Array1[local20];
							local534 = this.aClass219Array1[local20];
							local534.anInt6105 = 255 - (this.aByteArray52[local529.anInt6776] & 0xFF) << 24 | local534.anInt6105 & 0xFFFFFF;
						}
					}
					this.method3695();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt4475; local16++) {
						local20 = this.aShortArray89[local16] & 0xFFFF;
						local174 = local20 >> 10 & 0x3F;
						local193 = local20 >> 7 & 0x7;
						@Pc(598) int local598 = local174 + arg1 & 0x3F;
						@Pc(602) int local602 = local20 & 0x7F;
						local193 += arg2 / 4;
						if (local193 < 0) {
							local193 = 0;
						} else if (local193 > 7) {
							local193 = 7;
						}
						local602 += arg3;
						if (local602 < 0) {
							local602 = 0;
						} else if (local602 > 127) {
							local602 = 127;
						}
						this.aShortArray89[local16] = (short) (local598 << 10 | local193 << 7 | local602);
					}
					if (this.aClass242Array1 != null) {
						for (local20 = 0; local20 < this.anInt4459; local20++) {
							local529 = this.aClass242Array1[local20];
							local534 = this.aClass219Array1[local20];
							local534.anInt6105 = local534.anInt6105 & 0xFF000000 | Static250.anIntArray314[this.aShortArray89[local529.anInt6776] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method3695();
				} else {
					@Pc(718) Class219 local718;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt4459; local16++) {
							local718 = this.aClass219Array1[local16];
							local718.anInt6103 += arg1;
							local718.anInt6101 += arg2;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt4459; local16++) {
							local718 = this.aClass219Array1[local16];
							local718.anInt6107 = local718.anInt6107 * arg1 >> 7;
							local718.anInt6100 = local718.anInt6100 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt4459; local16++) {
							local718 = this.aClass219Array1[local16];
							local718.anInt6106 = local718.anInt6106 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort49;
	}

	@OriginalMember(owner = "client!ja", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean356;
	}

	@OriginalMember(owner = "client!ja", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class2_Sub3_Sub6 S(@OriginalArg(0) Class2_Sub3_Sub6 arg0) {
		if (this.anInt4437 == 0) {
			return null;
		}
		if (!this.aBoolean355) {
			this.method3701();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass100_Sub1_11.anInt5777 <= 0) {
			local43 = this.anInt4423 - (this.aClass100_Sub1_11.anInt5777 * this.anInt4476 >> 8) >> this.aClass100_Sub1_11.anInt5756;
			local60 = this.anInt4473 - (this.anInt4449 * this.aClass100_Sub1_11.anInt5777 >> 8) >> this.aClass100_Sub1_11.anInt5756;
		} else {
			local43 = this.anInt4423 - (this.anInt4449 * this.aClass100_Sub1_11.anInt5777 >> 8) >> this.aClass100_Sub1_11.anInt5756;
			local60 = this.anInt4473 - (this.anInt4476 * this.aClass100_Sub1_11.anInt5777 >> 8) >> this.aClass100_Sub1_11.anInt5756;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass100_Sub1_11.anInt5769 <= 0) {
			local116 = this.anInt4438 - (this.aClass100_Sub1_11.anInt5769 * this.anInt4476 >> 8) >> this.aClass100_Sub1_11.anInt5756;
			local133 = this.anInt4453 - (this.aClass100_Sub1_11.anInt5769 * this.anInt4449 >> 8) >> this.aClass100_Sub1_11.anInt5756;
		} else {
			local116 = this.anInt4438 - (this.aClass100_Sub1_11.anInt5769 * this.anInt4449 >> 8) >> this.aClass100_Sub1_11.anInt5756;
			local133 = this.anInt4453 - (this.anInt4476 * this.aClass100_Sub1_11.anInt5769 >> 8) >> this.aClass100_Sub1_11.anInt5756;
		}
		@Pc(175) int local175 = local60 + 1 - local43;
		@Pc(182) int local182 = local133 + 1 - local116;
		@Pc(185) Class2_Sub3_Sub6_Sub1 local185 = (Class2_Sub3_Sub6_Sub1) arg0;
		@Pc(201) Class2_Sub3_Sub6_Sub1 local201;
		if (local185 != null && local185.method5709(local175, local182)) {
			local201 = local185;
			local185.method5712();
		} else {
			local201 = new Class2_Sub3_Sub6_Sub1(this.aClass100_Sub1_11, local175, local182);
		}
		local201.method5708(local133, local116, local43, local60);
		this.method3699(local201);
		return local201;
	}

	@OriginalMember(owner = "client!ja", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort49 = (short) arg0;
		this.method3695();
	}

	@OriginalMember(owner = "client!ja", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class363.anIntArray697[arg0];
		@Pc(13) int local13 = Class363.anIntArray698[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4444; local15++) {
			local33 = local13 * this.anIntArray283[local15] + local9 * this.anIntArray285[local15] >> 14;
			this.anIntArray285[local15] = this.anIntArray285[local15] * local13 - this.anIntArray283[local15] * local9 >> 14;
			this.anIntArray283[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt4437; local33++) {
			@Pc(82) int local82 = local9 * this.aShortArray78[local33] + this.aShortArray82[local33] * local13 >> 14;
			this.aShortArray78[local33] = (short) (local13 * this.aShortArray78[local33] - this.aShortArray82[local33] * local9 >> 14);
			this.aShortArray82[local33] = (short) local82;
		}
		this.method3697();
		this.method3706();
		this.aBoolean355 = false;
	}
}
