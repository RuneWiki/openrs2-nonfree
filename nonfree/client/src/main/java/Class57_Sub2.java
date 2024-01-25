import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "[Lclient!fk;")
	private Class103[] aClass103Array2;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!ji", name = "I", descriptor = "B")
	private byte aByte42;

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "[Lclient!uj;")
	private Class331[] aClass331Array1;

	@OriginalMember(owner = "client!ji", name = "N", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!ji", name = "Q", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!ji", name = "R", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!ji", name = "W", descriptor = "S")
	private short aShort50;

	@OriginalMember(owner = "client!ji", name = "Z", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
	private int anInt4434;

	@OriginalMember(owner = "client!ji", name = "eb", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!ji", name = "hb", descriptor = "[F")
	private float[] aFloatArray28;

	@OriginalMember(owner = "client!ji", name = "kb", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!ji", name = "lb", descriptor = "[I")
	private int[] lb;

	@OriginalMember(owner = "client!ji", name = "nb", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!ji", name = "ob", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!ji", name = "qb", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!ji", name = "rb", descriptor = "S")
	private short aShort51;

	@OriginalMember(owner = "client!ji", name = "tb", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!ji", name = "ub", descriptor = "[F")
	private float[] aFloatArray29;

	@OriginalMember(owner = "client!ji", name = "wb", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!ji", name = "xb", descriptor = "Lclient!cfa;")
	private Class49 aClass49_1;

	@OriginalMember(owner = "client!ji", name = "Cb", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!ji", name = "Pb", descriptor = "Lclient!uq;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!ji", name = "Qb", descriptor = "S")
	private short aShort52;

	@OriginalMember(owner = "client!ji", name = "Rb", descriptor = "S")
	private short aShort53;

	@OriginalMember(owner = "client!ji", name = "Tb", descriptor = "I")
	private int anInt4460;

	@OriginalMember(owner = "client!ji", name = "Yb", descriptor = "S")
	private short aShort54;

	@OriginalMember(owner = "client!ji", name = "bc", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!ji", name = "cc", descriptor = "Lclient!ew;")
	private Interface10 anInterface10_2;

	@OriginalMember(owner = "client!ji", name = "hc", descriptor = "S")
	private short aShort55;

	@OriginalMember(owner = "client!ji", name = "kc", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!ji", name = "pc", descriptor = "S")
	private short aShort56;

	@OriginalMember(owner = "client!ji", name = "uc", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!ji", name = "xc", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!ji", name = "yc", descriptor = "I")
	private int anInt4478;

	@OriginalMember(owner = "client!ji", name = "Ac", descriptor = "[Lclient!nba;")
	private Class227[] aClass227Array2;

	@OriginalMember(owner = "client!ji", name = "Bc", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!ji", name = "Ec", descriptor = "[Lclient!ir;")
	private Class160[] aClass160Array1;

	@OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
	private int anInt4429 = 0;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
	private int anInt4419 = 0;

	@OriginalMember(owner = "client!ji", name = "Ib", descriptor = "I")
	private int anInt4452 = 0;

	@OriginalMember(owner = "client!ji", name = "mc", descriptor = "I")
	private int anInt4470 = 0;

	@OriginalMember(owner = "client!ji", name = "ac", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!ji", name = "ec", descriptor = "Z")
	private boolean aBoolean323 = true;

	@OriginalMember(owner = "client!ji", name = "zc", descriptor = "I")
	private int anInt4479 = 0;

	@OriginalMember(owner = "client!ji", name = "cb", descriptor = "Z")
	private boolean aBoolean321 = false;

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_18;

	@OriginalMember(owner = "client!ji", name = "rc", descriptor = "Lclient!rba;")
	private Class284 aClass284_7;

	@OriginalMember(owner = "client!ji", name = "lc", descriptor = "Lclient!rba;")
	private Class284 aClass284_6;

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "Lclient!rba;")
	private Class284 aClass284_4;

	@OriginalMember(owner = "client!ji", name = "mb", descriptor = "Lclient!rba;")
	private Class284 aClass284_5;

	@OriginalMember(owner = "client!ji", name = "Xb", descriptor = "Lclient!rk;")
	private Class291 aClass291_1;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class57_Sub2(@OriginalArg(0) Class44_Sub3 arg0) {
		this.aClass44_Sub3_18 = arg0;
		this.aClass284_7 = new Class284(null, 5126, 3, 0);
		this.aClass284_6 = new Class284(null, 5126, 2, 0);
		this.aClass284_4 = new Class284(null, 5126, 3, 0);
		this.aClass284_5 = new Class284(null, 5121, 4, 0);
		this.aClass291_1 = new Class291();
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!kga;Lclient!kk;IIII)V")
	public Class57_Sub2(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4460 = arg2;
		this.anInt4478 = arg5;
		this.aClass44_Sub3_18 = arg0;
		if (Static286.method4962(arg5, arg2)) {
			this.aClass284_7 = new Class284(null, 5126, 3, 0);
		}
		if (Static264.method4446(arg2, arg5)) {
			this.aClass284_6 = new Class284(null, 5126, 2, 0);
		}
		if (Static230.method3721(arg2, arg5)) {
			this.aClass284_4 = new Class284(null, 5126, 3, 0);
		}
		if (Static335.method5479(arg5, arg2)) {
			this.aClass284_5 = new Class284(null, 5121, 4, 0);
		}
		if (Static247.method3958(arg2, arg5)) {
			this.aClass291_1 = new Class291();
		}
		@Pc(105) Interface11 local105 = arg0.anInterface11_11;
		@Pc(109) int[] local109 = new int[arg1.anInt5626];
		this.anIntArray223 = new int[arg1.anInt5612 + 1];
		for (@Pc(118) int local118 = 0; local118 < arg1.anInt5626; local118++) {
			if ((arg1.aByteArray65 == null || arg1.aByteArray65[local118] != 2) && (arg1.aShortArray65 == null || arg1.aShortArray65[local118] == -1 || !local105.method7405(arg1.aShortArray65[local118] & 0xFFFF).aBoolean14)) {
				local109[this.anInt4429++] = local118;
				this.anIntArray223[arg1.aShortArray61[local118]]++;
				this.anIntArray223[arg1.aShortArray59[local118]]++;
				this.anIntArray223[arg1.aShortArray68[local118]]++;
			}
		}
		this.anInt4470 = this.anInt4429;
		@Pc(206) long[] local206 = new long[this.anInt4429];
		@Pc(218) boolean local218 = (this.anInt4460 & 0x100) != 0;
		@Pc(230) int local230;
		@Pc(241) int local241;
		@Pc(384) int local384;
		label495: for (@Pc(220) int local220 = 0; local220 < this.anInt4429; local220++) {
			@Pc(226) int local226 = local109[local220];
			@Pc(228) Class14 local228 = null;
			local230 = 0;
			@Pc(232) byte local232 = 0;
			@Pc(234) byte local234 = 0;
			@Pc(236) byte local236 = 0;
			if (arg1.aClass287Array1 != null) {
				for (local241 = 0; local241 < arg1.aClass287Array1.length; local241++) {
					@Pc(248) Class287 local248 = arg1.aClass287Array1[local241];
					if (local226 == local248.anInt8501) {
						@Pc(261) Class285 local261 = Static71.method1199(local248.anInt8499);
						if (local261.aBoolean580) {
							local206[local220] = Long.MAX_VALUE;
							this.anInt4470--;
							continue label495;
						}
					}
				}
			}
			@Pc(288) short local288 = -1;
			if (arg1.aShortArray65 != null) {
				local288 = arg1.aShortArray65[local226];
				if (local288 != -1) {
					local228 = local105.method7405(local288 & 0xFFFF);
					local236 = local228.aByte5;
					local234 = local228.aByte9;
				}
			}
			@Pc(340) boolean local340 = arg1.aByteArray61 != null && arg1.aByteArray61[local226] != 0 || local228 != null && local228.aBoolean15 | !local228.aBoolean10;
			if ((local218 || local340) && arg1.aByteArray62 != null) {
				local230 += arg1.aByteArray62[local226] << 17;
			}
			if (local340) {
				local230 += 65536;
			}
			local230 += (local234 & 0xFF) << 8;
			local230 += local236 & 0xFF;
			local384 = local232 + ((local288 & 0xFFFF) << 16);
			@Pc(390) int local390 = local384 + (local220 & 0xFFFF);
			local206[local220] = ((long) local230 << 32) + (long) local390;
			this.aBoolean322 |= local340;
		}
		Static475.method4820(local206, local109);
		this.aShortArray49 = arg1.aShortArray63;
		this.anInt4419 = arg1.anInt5618;
		this.lb = arg1.anIntArray278;
		this.anIntArray226 = arg1.anIntArray279;
		this.anInt4452 = arg1.anInt5612;
		this.anIntArray225 = arg1.anIntArray272;
		this.aClass227Array2 = arg1.aClass227Array3;
		@Pc(447) Class118[] local447 = new Class118[this.anInt4452];
		this.aClass103Array2 = arg1.aClass103Array3;
		@Pc(471) int local471;
		@Pc(485) int local485;
		if (arg1.aClass287Array1 != null) {
			this.anInt4434 = arg1.aClass287Array1.length;
			this.aClass331Array1 = new Class331[this.anInt4434];
			this.aClass160Array1 = new Class160[this.anInt4434];
			for (local471 = 0; local471 < this.anInt4434; local471++) {
				@Pc(478) Class287 local478 = arg1.aClass287Array1[local471];
				@Pc(483) Class285 local483 = Static71.method1199(local478.anInt8499);
				local485 = -1;
				for (@Pc(487) int local487 = 0; local487 < this.anInt4429; local487++) {
					if (local109[local487] == local478.anInt8501) {
						local485 = local487;
						break;
					}
				}
				if (local485 == -1) {
					throw new RuntimeException();
				}
				local241 = Static15.anIntArray11[arg1.aShortArray66[local478.anInt8501] & 0xFFFF] & 0xFFFFFF;
				local241 |= 255 - (arg1.aByteArray61 == null ? 0 : arg1.aByteArray61[local478.anInt8501]) << 24;
				this.aClass331Array1[local471] = new Class331(local485, arg1.aShortArray61[local478.anInt8501], arg1.aShortArray59[local478.anInt8501], arg1.aShortArray68[local478.anInt8501], local483.anInt8284, local483.anInt8281, local483.anInt8280, local483.anInt8289, local483.anInt8290, local483.aBoolean580, local483.aBoolean581, local478.anInt8500);
				this.aClass160Array1[local471] = new Class160(local241);
			}
		}
		local471 = this.anInt4429 * 3;
		this.aShortArray51 = new short[this.anInt4429];
		Static575.aLongArray17 = new long[local471];
		this.aShortArray55 = new short[local471];
		this.aShortArray48 = new short[local471];
		this.aFloatArray28 = new float[local471];
		this.aShortArray46 = new short[local471];
		if (arg1.aShortArray60 != null) {
			this.aShortArray56 = new short[this.anInt4429];
		}
		this.aByteArray55 = new byte[local471];
		this.aFloatArray29 = new float[local471];
		this.aShortArray54 = new short[this.anInt4429];
		this.aShortArray52 = new short[local471];
		this.aShort51 = (short) arg4;
		this.aShortArray53 = new short[this.anInt4429];
		this.aByteArray54 = new byte[this.anInt4429];
		this.aShortArray47 = new short[this.anInt4429];
		this.aShort55 = (short) arg3;
		this.aShortArray50 = new short[this.anInt4429];
		local230 = 0;
		for (local384 = 0; local384 < arg1.anInt5612; local384++) {
			local485 = this.anIntArray223[local384];
			this.anIntArray223[local384] = local230;
			local230 += local485;
			local447[local384] = new Class118();
		}
		this.anIntArray223[arg1.anInt5612] = local230;
		@Pc(731) int[] local731 = null;
		@Pc(733) int[] local733 = null;
		@Pc(735) int[] local735 = null;
		@Pc(737) float[][] local737 = null;
		@Pc(763) int local763;
		@Pc(799) int local799;
		@Pc(805) int local805;
		@Pc(819) int local819;
		@Pc(821) int local821;
		@Pc(855) int local855;
		@Pc(860) int local860;
		@Pc(1019) float local1019;
		@Pc(1035) float local1035;
		@Pc(1027) float local1027;
		if (arg1.aByteArray64 != null) {
			@Pc(743) int local743 = arg1.anInt5628;
			@Pc(746) int[] local746 = new int[local743];
			@Pc(749) int[] local749 = new int[local743];
			@Pc(752) int[] local752 = new int[local743];
			@Pc(755) int[] local755 = new int[local743];
			@Pc(758) int[] local758 = new int[local743];
			@Pc(761) int[] local761 = new int[local743];
			for (local763 = 0; local763 < local743; local763++) {
				local746[local763] = Integer.MAX_VALUE;
				local749[local763] = -2147483647;
				local752[local763] = Integer.MAX_VALUE;
				local755[local763] = -2147483647;
				local758[local763] = Integer.MAX_VALUE;
				local761[local763] = -2147483647;
			}
			for (local799 = 0; local799 < this.anInt4429; local799++) {
				local805 = local109[local799];
				if (arg1.aByteArray64[local805] != -1) {
					local819 = arg1.aByteArray64[local805] & 0xFF;
					for (local821 = 0; local821 < 3; local821++) {
						@Pc(836) short local836;
						if (local821 == 0) {
							local836 = arg1.aShortArray61[local805];
						} else if (local821 == 1) {
							local836 = arg1.aShortArray59[local805];
						} else {
							local836 = arg1.aShortArray68[local805];
						}
						local855 = arg1.anIntArray278[local836];
						local860 = arg1.anIntArray272[local836];
						@Pc(865) int local865 = arg1.anIntArray279[local836];
						if (local746[local819] > local855) {
							local746[local819] = local855;
						}
						if (local855 > local749[local819]) {
							local749[local819] = local855;
						}
						if (local860 < local752[local819]) {
							local752[local819] = local860;
						}
						if (local860 > local755[local819]) {
							local755[local819] = local860;
						}
						if (local865 < local758[local819]) {
							local758[local819] = local865;
						}
						if (local865 > local761[local819]) {
							local761[local819] = local865;
						}
					}
				}
			}
			local735 = new int[local743];
			local733 = new int[local743];
			local737 = new float[local743][];
			local731 = new int[local743];
			for (local805 = 0; local805 < local743; local805++) {
				@Pc(963) byte local963 = arg1.aByteArray60[local805];
				if (local963 > 0) {
					local731[local805] = (local749[local805] + local746[local805]) / 2;
					local733[local805] = (local755[local805] + local752[local805]) / 2;
					local735[local805] = (local758[local805] + local761[local805]) / 2;
					if (local963 == 1) {
						local860 = arg1.anIntArray277[local805];
						if (local860 == 0) {
							local1019 = 1.0F;
							local1035 = 1.0F;
						} else if (local860 > 0) {
							local1019 = 1.0F;
							local1035 = (float) local860 / 1024.0F;
						} else {
							local1035 = 1.0F;
							local1019 = (float) -local860 / 1024.0F;
						}
						local1027 = 64.0F / (float) arg1.anIntArray275[local805];
					} else if (local963 == 2) {
						local1019 = 64.0F / (float) arg1.anIntArray277[local805];
						local1035 = 64.0F / (float) arg1.anIntArray274[local805];
						local1027 = 64.0F / (float) arg1.anIntArray275[local805];
					} else {
						local1019 = (float) arg1.anIntArray277[local805] / 1024.0F;
						local1027 = (float) arg1.anIntArray275[local805] / 1024.0F;
						local1035 = (float) arg1.anIntArray274[local805] / 1024.0F;
					}
					local737[local805] = Static195.method3372(local1019, local1035, arg1.aByteArray63[local805] & 0xFF, arg1.aShortArray62[local805], local1027, arg1.aShortArray67[local805], arg1.aShortArray64[local805]);
				}
			}
		}
		@Pc(1144) Class126[] local1144 = new Class126[arg1.anInt5626];
		@Pc(1163) short local1163;
		@Pc(1174) int local1174;
		@Pc(1185) int local1185;
		@Pc(1245) int local1245;
		for (@Pc(1146) int local1146 = 0; local1146 < arg1.anInt5626; local1146++) {
			@Pc(1153) short local1153 = arg1.aShortArray61[local1146];
			@Pc(1158) short local1158 = arg1.aShortArray59[local1146];
			local1163 = arg1.aShortArray68[local1146];
			local1174 = this.lb[local1158] - this.lb[local1153];
			local1185 = this.anIntArray225[local1158] - this.anIntArray225[local1153];
			local763 = this.anIntArray226[local1158] - this.anIntArray226[local1153];
			local799 = this.lb[local1163] - this.lb[local1153];
			local805 = this.anIntArray225[local1163] - this.anIntArray225[local1153];
			local819 = this.anIntArray226[local1163] - this.anIntArray226[local1153];
			local821 = local819 * local1185 - local805 * local763;
			local1245 = local799 * local763 - local819 * local1174;
			for (local855 = local1174 * local805 - local1185 * local799; local821 > 8192 || local1245 > 8192 || local855 > 8192 || local821 < -8192 || local1245 < -8192 || local855 < -8192; local855 >>= 0x1) {
				local1245 >>= 0x1;
				local821 >>= 0x1;
			}
			local860 = (int) Math.sqrt((double) (local855 * local855 + local1245 * local1245 + local821 * local821));
			if (local860 <= 0) {
				local860 = 1;
			}
			local855 = local855 * 256 / local860;
			local821 = local821 * 256 / local860;
			local1245 = local1245 * 256 / local860;
			@Pc(1336) byte local1336 = arg1.aByteArray65 == null ? 0 : arg1.aByteArray65[local1146];
			if (local1336 == 0) {
				@Pc(1366) Class118 local1366 = local447[local1153];
				local1366.anInt3416 += local821;
				local1366.anInt3417 += local855;
				local1366.anInt3418++;
				local1366.anInt3415 += local1245;
				@Pc(1394) Class118 local1394 = local447[local1158];
				local1394.anInt3418++;
				local1394.anInt3416 += local821;
				local1394.anInt3417 += local855;
				local1394.anInt3415 += local1245;
				@Pc(1422) Class118 local1422 = local447[local1163];
				local1422.anInt3416 += local821;
				local1422.anInt3417 += local855;
				local1422.anInt3418++;
				local1422.anInt3415 += local1245;
			} else if (local1336 == 1) {
				@Pc(1351) Class126 local1351 = local1144[local1146] = new Class126();
				local1351.anInt3552 = local855;
				local1351.anInt3555 = local821;
				local1351.anInt3556 = local1245;
			}
		}
		@Pc(1459) int local1459;
		for (@Pc(1453) int local1453 = 0; local1453 < this.anInt4429; local1453++) {
			local1459 = local109[local1453];
			@Pc(1466) int local1466 = arg1.aShortArray66[local1459] & 0xFFFF;
			@Pc(1474) short local1474;
			if (arg1.aShortArray65 == null) {
				local1474 = -1;
			} else {
				local1474 = arg1.aShortArray65[local1459];
			}
			if (arg1.aByteArray64 == null) {
				local1185 = -1;
			} else {
				local1185 = arg1.aByteArray64[local1459];
			}
			if (arg1.aByteArray61 == null) {
				local763 = 0;
			} else {
				local763 = arg1.aByteArray61[local1459] & 0xFF;
			}
			@Pc(1506) float local1506 = 0.0F;
			@Pc(1508) float local1508 = 0.0F;
			@Pc(1510) float local1510 = 0.0F;
			local1019 = 0.0F;
			local1027 = 0.0F;
			local1035 = 0.0F;
			@Pc(1518) byte local1518 = 0;
			@Pc(1520) byte local1520 = 0;
			@Pc(1522) int local1522 = 0;
			@Pc(1538) byte local1538;
			@Pc(1555) short local1555;
			@Pc(2302) short local2302;
			@Pc(2307) short local2307;
			if (local1474 != -1) {
				if (local1185 == -1) {
					local1027 = 0.0F;
					local1518 = 1;
					local1510 = 1.0F;
					local1019 = 1.0F;
					local1508 = 1.0F;
					local1506 = 0.0F;
					local1520 = 2;
					local1035 = 0.0F;
				} else {
					local1185 &= 0xFF;
					local1538 = arg1.aByteArray60[local1185];
					@Pc(1545) short local1545;
					@Pc(1550) short local1550;
					@Pc(1584) float local1584;
					@Pc(1794) float local1794;
					@Pc(1802) float local1802;
					@Pc(1903) float local1903;
					@Pc(1911) float local1911;
					@Pc(1919) float local1919;
					@Pc(1942) float local1942;
					@Pc(1965) float local1965;
					@Pc(1988) float local1988;
					if (local1538 == 0) {
						local1545 = arg1.aShortArray61[local1459];
						local1550 = arg1.aShortArray59[local1459];
						local1555 = arg1.aShortArray68[local1459];
						local2302 = arg1.aShortArray67[local1185];
						local2307 = arg1.aShortArray64[local1185];
						@Pc(2312) short local2312 = arg1.aShortArray62[local1185];
						@Pc(2318) float local2318 = (float) arg1.anIntArray278[local2302];
						@Pc(2324) float local2324 = (float) arg1.anIntArray272[local2302];
						local1584 = arg1.anIntArray279[local2302];
						local1794 = (float) arg1.anIntArray278[local2307] - local2318;
						local1802 = (float) arg1.anIntArray272[local2307] - local2324;
						@Pc(2357) float local2357 = (float) arg1.anIntArray279[local2307] - local1584;
						@Pc(2365) float local2365 = (float) arg1.anIntArray278[local2312] - local2318;
						@Pc(2374) float local2374 = (float) arg1.anIntArray272[local2312] - local2324;
						@Pc(2382) float local2382 = (float) arg1.anIntArray279[local2312] - local1584;
						@Pc(2391) float local2391 = (float) arg1.anIntArray278[local1545] - local2318;
						@Pc(2399) float local2399 = (float) arg1.anIntArray272[local1545] - local2324;
						@Pc(2408) float local2408 = (float) arg1.anIntArray279[local1545] - local1584;
						@Pc(2417) float local2417 = (float) arg1.anIntArray278[local1550] - local2318;
						@Pc(2426) float local2426 = (float) arg1.anIntArray272[local1550] - local2324;
						local1903 = (float) arg1.anIntArray279[local1550] - local1584;
						local1911 = (float) arg1.anIntArray278[local1555] - local2318;
						local1919 = (float) arg1.anIntArray272[local1555] - local2324;
						local1942 = (float) arg1.anIntArray279[local1555] - local1584;
						local1965 = local1802 * local2382 - local2357 * local2374;
						local1988 = local2365 * local2357 - local2382 * local1794;
						@Pc(2486) float local2486 = local2374 * local1794 - local1802 * local2365;
						@Pc(2495) float local2495 = local2374 * local2486 - local1988 * local2382;
						@Pc(2503) float local2503 = local2382 * local1965 - local2365 * local2486;
						@Pc(2511) float local2511 = local1988 * local2365 - local1965 * local2374;
						@Pc(2525) float local2525 = 1.0F / (local2503 * local1802 + local1794 * local2495 + local2357 * local2511);
						local1506 = (local2391 * local2495 + local2503 * local2399 + local2511 * local2408) * local2525;
						local1510 = (local2503 * local2426 + local2417 * local2495 + local2511 * local1903) * local2525;
						local1027 = local2525 * (local1919 * local2503 + local1911 * local2495 + local2511 * local1942);
						@Pc(2575) float local2575 = local1794 * local1988 - local1965 * local1802;
						@Pc(2583) float local2583 = local2486 * local1802 - local1988 * local2357;
						@Pc(2592) float local2592 = local2357 * local1965 - local2486 * local1794;
						@Pc(2606) float local2606 = 1.0F / (local2583 * local2365 + local2374 * local2592 + local2382 * local2575);
						local1019 = (local2575 * local1903 + local2426 * local2592 + local2417 * local2583) * local2606;
						local1035 = (local1942 * local2575 + local1911 * local2583 + local1919 * local2592) * local2606;
						local1508 = local2606 * (local2575 * local2408 + local2391 * local2583 + local2592 * local2399);
					} else {
						local1545 = arg1.aShortArray61[local1459];
						local1550 = arg1.aShortArray59[local1459];
						local1555 = arg1.aShortArray68[local1459];
						@Pc(1559) int local1559 = local731[local1185];
						@Pc(1563) int local1563 = local733[local1185];
						@Pc(1567) int local1567 = local735[local1185];
						@Pc(1571) float[] local1571 = local737[local1185];
						@Pc(1576) byte local1576 = arg1.aByteArray66[local1185];
						local1584 = (float) arg1.anIntArray270[local1185] / 256.0F;
						if (local1538 == 1) {
							local1794 = (float) arg1.anIntArray274[local1185] / 1024.0F;
							Static37.method476(local1794, local1571, local1563, local1567, arg1.anIntArray278[local1545], local1559, arg1.anIntArray272[local1545], arg1.anIntArray279[local1545], local1584, local1576);
							local1508 = Static59.aFloat34;
							local1506 = Static321.aFloat193;
							Static37.method476(local1794, local1571, local1563, local1567, arg1.anIntArray278[local1550], local1559, arg1.anIntArray272[local1550], arg1.anIntArray279[local1550], local1584, local1576);
							local1019 = Static59.aFloat34;
							local1510 = Static321.aFloat193;
							Static37.method476(local1794, local1571, local1563, local1567, arg1.anIntArray278[local1555], local1559, arg1.anIntArray272[local1555], arg1.anIntArray279[local1555], local1584, local1576);
							local1027 = Static321.aFloat193;
							local1035 = Static59.aFloat34;
							local1802 = local1794 / 2.0F;
							if ((local1576 & 0x1) == 0) {
								if (local1027 - local1506 > local1802) {
									local1027 -= local1794;
									local1520 = 1;
								} else if (local1802 < local1506 - local1027) {
									local1520 = 2;
									local1027 += local1794;
								}
								if (local1802 < local1510 - local1506) {
									local1518 = 1;
									local1510 -= local1794;
								} else if (local1802 < local1506 - local1510) {
									local1510 += local1794;
									local1518 = 2;
								}
							} else {
								if (local1802 < local1035 - local1508) {
									local1035 -= local1794;
									local1520 = 1;
								} else if (local1508 - local1035 > local1802) {
									local1520 = 2;
									local1035 += local1794;
								}
								if (local1802 < local1019 - local1508) {
									local1019 -= local1794;
									local1518 = 1;
								} else if (local1508 - local1019 > local1802) {
									local1518 = 2;
									local1019 += local1794;
								}
							}
						} else if (local1538 == 2) {
							local1794 = (float) arg1.anIntArray273[local1185] / 256.0F;
							local1802 = (float) arg1.anIntArray276[local1185] / 256.0F;
							@Pc(1813) int local1813 = arg1.anIntArray278[local1550] - arg1.anIntArray278[local1545];
							@Pc(1824) int local1824 = arg1.anIntArray272[local1550] - arg1.anIntArray272[local1545];
							@Pc(1835) int local1835 = arg1.anIntArray279[local1550] - arg1.anIntArray279[local1545];
							@Pc(1846) int local1846 = arg1.anIntArray278[local1555] - arg1.anIntArray278[local1545];
							@Pc(1857) int local1857 = arg1.anIntArray272[local1555] - arg1.anIntArray272[local1545];
							@Pc(1868) int local1868 = arg1.anIntArray279[local1555] - arg1.anIntArray279[local1545];
							@Pc(1877) int local1877 = local1868 * local1824 - local1857 * local1835;
							@Pc(1886) int local1886 = local1846 * local1835 - local1813 * local1868;
							@Pc(1895) int local1895 = local1813 * local1857 - local1824 * local1846;
							local1903 = 64.0F / (float) arg1.anIntArray277[local1185];
							local1911 = 64.0F / (float) arg1.anIntArray275[local1185];
							local1919 = 64.0F / (float) arg1.anIntArray274[local1185];
							local1942 = (local1571[1] * (float) local1886 + (float) local1877 * local1571[0] + (float) local1895 * local1571[2]) / local1903;
							local1965 = ((float) local1886 * local1571[4] + (float) local1877 * local1571[3] + local1571[5] * (float) local1895) / local1911;
							local1988 = (local1571[6] * (float) local1877 + local1571[7] * (float) local1886 + (float) local1895 * local1571[8]) / local1919;
							local1522 = Static591.method8354(local1965, local1988, local1942);
							Static299.method5147(arg1.anIntArray272[local1545], local1584, local1563, local1522, local1576, arg1.anIntArray279[local1545], arg1.anIntArray278[local1545], local1571, local1567, local1559, local1794, local1802);
							local1508 = Static592.aFloat230;
							local1506 = Static56.aFloat28;
							Static299.method5147(arg1.anIntArray272[local1550], local1584, local1563, local1522, local1576, arg1.anIntArray279[local1550], arg1.anIntArray278[local1550], local1571, local1567, local1559, local1794, local1802);
							local1019 = Static592.aFloat230;
							local1510 = Static56.aFloat28;
							Static299.method5147(arg1.anIntArray272[local1555], local1584, local1563, local1522, local1576, arg1.anIntArray279[local1555], arg1.anIntArray278[local1555], local1571, local1567, local1559, local1794, local1802);
							local1035 = Static592.aFloat230;
							local1027 = Static56.aFloat28;
						} else if (local1538 == 3) {
							Static166.method3032(local1584, arg1.anIntArray278[local1545], local1571, arg1.anIntArray272[local1545], local1563, arg1.anIntArray279[local1545], local1567, local1576, local1559);
							local1506 = Static522.aFloat231;
							local1508 = Static438.aFloat211;
							Static166.method3032(local1584, arg1.anIntArray278[local1550], local1571, arg1.anIntArray272[local1550], local1563, arg1.anIntArray279[local1550], local1567, local1576, local1559);
							local1510 = Static522.aFloat231;
							local1019 = Static438.aFloat211;
							Static166.method3032(local1584, arg1.anIntArray278[local1555], local1571, arg1.anIntArray272[local1555], local1563, arg1.anIntArray279[local1555], local1567, local1576, local1559);
							local1027 = Static522.aFloat231;
							local1035 = Static438.aFloat211;
							if ((local1576 & 0x1) == 0) {
								if (local1510 - local1506 > 0.5F) {
									local1510--;
									local1518 = 1;
								} else if (local1506 - local1510 > 0.5F) {
									local1510++;
									local1518 = 2;
								}
								if (local1027 - local1506 > 0.5F) {
									local1520 = 1;
									local1027--;
								} else if (local1506 - local1027 > 0.5F) {
									local1027++;
									local1520 = 2;
								}
							} else {
								if (local1019 - local1508 > 0.5F) {
									local1019--;
									local1518 = 1;
								} else if (local1508 - local1019 > 0.5F) {
									local1019++;
									local1518 = 2;
								}
								if (local1035 - local1508 > 0.5F) {
									local1520 = 1;
									local1035--;
								} else if (local1508 - local1035 > 0.5F) {
									local1520 = 2;
									local1035++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray65 == null) {
				local1538 = 0;
			} else {
				local1538 = arg1.aByteArray65[local1459];
			}
			if (local1538 == 0) {
				@Pc(2702) long local2702 = (long) (local1185 << 2) + ((long) (local1466 << 8) + (long) (local1522 << 24) + (long) local763 << 32);
				local1555 = arg1.aShortArray61[local1459];
				local2302 = arg1.aShortArray59[local1459];
				local2307 = arg1.aShortArray68[local1459];
				@Pc(2721) Class118 local2721 = local447[local1555];
				this.aShortArray51[local1453] = this.method3919(local2702, local2721.anInt3417, local1508, arg1, local2721.anInt3415, local2721.anInt3418, local1506, local1555, local2721.anInt3416);
				@Pc(2745) Class118 local2745 = local447[local2302];
				this.aShortArray47[local1453] = this.method3919((long) local1518 + local2702, local2745.anInt3417, local1019, arg1, local2745.anInt3415, local2745.anInt3418, local1510, local2302, local2745.anInt3416);
				@Pc(2772) Class118 local2772 = local447[local2307];
				this.aShortArray53[local1453] = this.method3919((long) local1520 + local2702, local2772.anInt3417, local1035, arg1, local2772.anInt3415, local2772.anInt3418, local1027, local2307, local2772.anInt3416);
			} else if (local1538 == 1) {
				@Pc(2804) Class126 local2804 = local1144[local1459];
				@Pc(2845) long local2845 = (long) ((local2804.anInt3556 + 256 << 12) + (local1185 << 2) + (local2804.anInt3555 <= 0 ? 2048 : 1024) + (local2804.anInt3552 + 256 << 22)) + ((long) local763 + (long) (local1466 << 8) + (long) (local1522 << 24) << 32);
				this.aShortArray51[local1453] = this.method3919(local2845, local2804.anInt3552, local1508, arg1, local2804.anInt3556, 0, local1506, arg1.aShortArray61[local1459], local2804.anInt3555);
				this.aShortArray47[local1453] = this.method3919((long) local1518 + local2845, local2804.anInt3552, local1019, arg1, local2804.anInt3556, 0, local1510, arg1.aShortArray59[local1459], local2804.anInt3555);
				this.aShortArray53[local1453] = this.method3919(local2845 + (long) local1520, local2804.anInt3552, local1035, arg1, local2804.anInt3556, 0, local1027, arg1.aShortArray68[local1459], local2804.anInt3555);
			}
			if (arg1.aShortArray65 == null) {
				this.aShortArray54[local1453] = -1;
			} else {
				this.aShortArray54[local1453] = arg1.aShortArray65[local1459];
			}
			if (arg1.aByteArray61 != null) {
				this.aByteArray54[local1453] = arg1.aByteArray61[local1459];
			}
			if (arg1.aShortArray60 != null) {
				this.aShortArray56[local1453] = arg1.aShortArray60[local1459];
			}
			this.aShortArray50[local1453] = arg1.aShortArray66[local1459];
		}
		local1459 = 0;
		local1163 = -10000;
		for (local1174 = 0; local1174 < this.anInt4470; local1174++) {
			@Pc(2987) short local2987 = this.aShortArray54[local1174];
			if (local2987 != local1163) {
				local1459++;
				local1163 = local2987;
			}
		}
		this.anIntArray224 = new int[local1459 + 1];
		local1459 = 0;
		local1163 = -10000;
		for (local1185 = 0; local1185 < this.anInt4470; local1185++) {
			@Pc(3021) short local3021 = this.aShortArray54[local1185];
			if (local1163 != local3021) {
				this.anIntArray224[local1459++] = local1185;
				local1163 = local3021;
			}
		}
		this.anIntArray224[local1459] = this.anInt4470;
		Static575.aLongArray17 = null;
		this.aShortArray55 = Static289.method5060(this.anInt4479, this.aShortArray55);
		this.aShortArray48 = Static289.method5060(this.anInt4479, this.aShortArray48);
		this.aShortArray46 = Static289.method5060(this.anInt4479, this.aShortArray46);
		this.aByteArray55 = Static38.method486(this.anInt4479, this.aByteArray55);
		this.aFloatArray29 = Static42.method508(this.aFloatArray29, this.anInt4479);
		this.aFloatArray28 = Static42.method508(this.aFloatArray28, this.anInt4479);
		if (arg1.anIntArray271 != null && Static258.method4159(this.anInt4478, arg2)) {
			this.anIntArrayArray31 = arg1.method4764(false);
		}
		if (arg1.aClass287Array1 != null && Static416.method6527(arg2, this.anInt4478)) {
			this.anIntArrayArray29 = arg1.method4759();
		}
		if (arg1.anIntArray269 != null && Static66.method1079(this.anInt4478, arg2)) {
			local763 = 0;
			@Pc(3136) int[] local3136 = new int[256];
			for (local805 = 0; local805 < this.anInt4429; local805++) {
				local819 = arg1.anIntArray269[local109[local805]];
				if (local819 >= 0) {
					@Pc(3153) int local3153 = local3136[local819]++;
					if (local819 > local763) {
						local763 = local819;
					}
				}
			}
			this.anIntArrayArray30 = new int[local763 + 1][];
			for (local819 = 0; local819 <= local763; local819++) {
				this.anIntArrayArray30[local819] = new int[local3136[local819]];
				local3136[local819] = 0;
			}
			for (local821 = 0; local821 < this.anInt4429; local821++) {
				local1245 = arg1.anIntArray269[local109[local821]];
				if (local1245 >= 0) {
					this.anIntArrayArray30[local1245][local3136[local1245]++] = local821;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZIIILclient!q;I)Z")
	private boolean method3918(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class8_Sub2 local8 = (Class8_Sub2) arg3;
		@Pc(12) Class8_Sub2 local12 = this.aClass44_Sub3_18.aClass8_Sub2_3;
		@Pc(33) float local33 = local12.aFloat26 + local12.aFloat23 * local8.aFloat26 + local8.aFloat24 * local12.aFloat25 + local8.aFloat32 * local12.aFloat30;
		@Pc(54) float local54 = local8.aFloat24 * local12.aFloat20 + local8.aFloat26 * local12.aFloat31 + local12.aFloat29 * local8.aFloat32 + local12.aFloat24;
		Static56.aFloat33 = local12.aFloat21 * local8.aFloat23 + local12.aFloat22 * local8.aFloat31 + local8.aFloat21 * local12.aFloat27;
		Static300.aFloat191 = local12.aFloat29 * local8.aFloat22 + local12.aFloat20 * local8.aFloat20 + local12.aFloat31 * local8.aFloat25;
		Static194.aFloat126 = local12.aFloat23 * local8.aFloat25 + local8.aFloat20 * local12.aFloat25 + local8.aFloat22 * local12.aFloat30;
		Static163.aFloat117 = local8.aFloat31 * local12.aFloat20 + local8.aFloat23 * local12.aFloat31 + local12.aFloat29 * local8.aFloat21;
		@Pc(147) float local147 = local12.aFloat32 + local12.aFloat22 * local8.aFloat24 + local12.aFloat21 * local8.aFloat26 + local12.aFloat27 * local8.aFloat32;
		Static281.aFloat185 = local12.aFloat23 * local8.aFloat30 + local8.aFloat29 * local12.aFloat25 + local8.aFloat27 * local12.aFloat30;
		Static298.aFloat189 = local12.aFloat23 * local8.aFloat23 + local12.aFloat25 * local8.aFloat31 + local8.aFloat21 * local12.aFloat30;
		Static161.aFloat18 = local12.aFloat27 * local8.aFloat22 + local8.aFloat25 * local12.aFloat21 + local12.aFloat22 * local8.aFloat20;
		Static251.aFloat136 = local12.aFloat29 * local8.aFloat27 + local8.aFloat30 * local12.aFloat31 + local12.aFloat20 * local8.aFloat29;
		Static110.aFloat92 = local8.aFloat29 * local12.aFloat22 + local12.aFloat21 * local8.aFloat30 + local12.aFloat27 * local8.aFloat27;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass44_Sub3_18.anInt5493;
		@Pc(255) int local255 = this.aClass44_Sub3_18.anInt5500;
		if (!this.aBoolean321) {
			this.method3932();
		}
		Static249.anIntArray232[0] = this.aShort57;
		Static320.anIntArray303[0] = this.aShort53;
		Static249.anIntArray232[1] = this.aShort49;
		Static29.anIntArray20[0] = this.aShort50;
		Static320.anIntArray303[1] = this.aShort53;
		Static29.anIntArray20[1] = this.aShort50;
		Static249.anIntArray232[2] = this.aShort57;
		Static320.anIntArray303[2] = this.aShort48;
		Static29.anIntArray20[2] = this.aShort50;
		Static249.anIntArray232[3] = this.aShort49;
		Static320.anIntArray303[3] = this.aShort48;
		Static29.anIntArray20[3] = this.aShort50;
		Static249.anIntArray232[4] = this.aShort57;
		Static320.anIntArray303[4] = this.aShort53;
		Static29.anIntArray20[4] = this.aShort54;
		Static249.anIntArray232[5] = this.aShort49;
		Static320.anIntArray303[5] = this.aShort53;
		Static29.anIntArray20[5] = this.aShort54;
		Static249.anIntArray232[6] = this.aShort57;
		Static320.anIntArray303[6] = this.aShort48;
		Static29.anIntArray20[6] = this.aShort54;
		Static249.anIntArray232[7] = this.aShort49;
		Static320.anIntArray303[7] = this.aShort48;
		Static29.anIntArray20[7] = this.aShort54;
		@Pc(449) float local449;
		@Pc(421) float local421;
		@Pc(435) float local435;
		@Pc(402) float local402;
		@Pc(397) float local397;
		@Pc(407) float local407;
		for (@Pc(390) int local390 = 0; local390 < 8; local390++) {
			local397 = Static320.anIntArray303[local390];
			local402 = Static249.anIntArray232[local390];
			local407 = Static29.anIntArray20[local390];
			local421 = local54 + local407 * Static251.aFloat136 + Static300.aFloat191 * local397 + local402 * Static163.aFloat117;
			local435 = local402 * Static56.aFloat33 + local397 * Static161.aFloat18 + Static110.aFloat92 * local407 + local147;
			local449 = local33 + local397 * Static194.aFloat126 + local402 * Static298.aFloat189 + local407 * Static281.aFloat185;
			if ((float) this.aClass44_Sub3_18.anInt5492 <= local435) {
				if (arg4 > 0) {
					local435 = arg4;
				}
				@Pc(473) float local473 = local449 * (float) local251 / local435 + (float) this.aClass44_Sub3_18.anInt5494;
				if (local243 < local473) {
					local243 = local473;
				}
				if (local473 < local241) {
					local241 = local473;
				}
				@Pc(497) float local497 = (float) this.aClass44_Sub3_18.anInt5499 + (float) local255 * local421 / local435;
				if (local247 < local497) {
					local247 = local497;
				}
				if (local497 < local245) {
					local245 = local497;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg1 && (float) arg1 < local243 && local245 < (float) arg2 && (float) arg2 < local247) {
			if (arg0) {
				return true;
			}
			if (this.anInt4479 > this.aClass44_Sub3_18.anIntArray266.length) {
				this.aClass44_Sub3_18.anIntArray266 = new int[this.anInt4479];
				this.aClass44_Sub3_18.anIntArray265 = new int[this.anInt4479];
			}
			@Pc(568) int[] local568 = this.aClass44_Sub3_18.anIntArray266;
			@Pc(572) int[] local572 = this.aClass44_Sub3_18.anIntArray265;
			@Pc(664) int local664;
			for (@Pc(574) int local574 = 0; local574 < this.anInt4452; local574++) {
				local397 = this.anIntArray225[local574];
				local402 = this.lb[local574];
				local407 = this.anIntArray226[local574];
				local421 = local54 + local397 * Static300.aFloat191 + Static163.aFloat117 * local402 + Static251.aFloat136 * local407;
				local435 = local147 + Static110.aFloat92 * local407 + Static56.aFloat33 * local402 + Static161.aFloat18 * local397;
				local449 = local407 * Static281.aFloat185 + local402 * Static298.aFloat189 + local397 * Static194.aFloat126 + local33;
				@Pc(677) int local677;
				@Pc(682) int local682;
				@Pc(689) int local689;
				if ((float) this.aClass44_Sub3_18.anInt5492 <= local435) {
					if (arg4 > 0) {
						local435 = arg4;
					}
					local664 = (int) (local449 * (float) local251 / local435 + (float) this.aClass44_Sub3_18.anInt5494);
					local677 = (int) ((float) local255 * local421 / local435 + (float) this.aClass44_Sub3_18.anInt5499);
					local682 = this.anIntArray223[local574];
					local689 = this.anIntArray223[local574 + 1];
					for (@Pc(691) int local691 = local682; local691 < local689; local691++) {
						@Pc(700) int local700 = this.aShortArray52[local691] - 1;
						if (local700 == -1) {
							break;
						}
						local568[local700] = local664;
						local572[local700] = local677;
					}
				} else {
					local664 = this.anIntArray223[local574];
					local677 = this.anIntArray223[local574 + 1];
					for (local682 = local664; local682 < local677; local682++) {
						local689 = this.aShortArray52[local682] - 1;
						if (local689 == -1) {
							break;
						}
						local568[this.aShortArray52[local682] - 1] = -999999;
					}
				}
			}
			for (local664 = 0; local664 < this.anInt4429; local664++) {
				if (local568[this.aShortArray51[local664]] != -999999 && local568[this.aShortArray47[local664]] != -999999 && local568[this.aShortArray53[local664]] != -999999 && this.method3926(local572[this.aShortArray53[local664]], local568[this.aShortArray51[local664]], arg2, local568[this.aShortArray47[local664]], local572[this.aShortArray47[local664]], arg1, local568[this.aShortArray53[local664]], local572[this.aShortArray51[local664]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7926(@OriginalArg(0) Class8 arg0) {
		@Pc(8) Class8_Sub2 local8 = (Class8_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass227Array2 != null) {
			for (local13 = 0; local13 < this.aClass227Array2.length; local13++) {
				@Pc(20) Class227 local20 = this.aClass227Array2[local13];
				@Pc(22) Class227 local22 = local20;
				if (local20.aClass227_1 != null) {
					local22 = local20.aClass227_1;
				}
				local22.anInt6588 = (int) (local8.aFloat26 + (float) this.lb[local20.anInt6582] * local8.aFloat23 + local8.aFloat25 * (float) this.anIntArray225[local20.anInt6582] + (float) this.anIntArray226[local20.anInt6582] * local8.aFloat30);
				local22.anInt6586 = (int) (local8.aFloat20 * (float) this.anIntArray225[local20.anInt6582] + (float) this.lb[local20.anInt6582] * local8.aFloat31 + (float) this.anIntArray226[local20.anInt6582] * local8.aFloat29 + local8.aFloat24);
				local22.anInt6584 = (int) ((float) this.anIntArray226[local20.anInt6582] * local8.aFloat27 + local8.aFloat22 * (float) this.anIntArray225[local20.anInt6582] + (float) this.lb[local20.anInt6582] * local8.aFloat21 + local8.aFloat32);
				local22.anInt6590 = (int) (local8.aFloat26 + local8.aFloat30 * (float) this.anIntArray226[local20.anInt6581] + local8.aFloat25 * (float) this.anIntArray225[local20.anInt6581] + (float) this.lb[local20.anInt6581] * local8.aFloat23);
				local22.anInt6592 = (int) (local8.aFloat24 + (float) this.anIntArray225[local20.anInt6581] * local8.aFloat20 + (float) this.lb[local20.anInt6581] * local8.aFloat31 + local8.aFloat29 * (float) this.anIntArray226[local20.anInt6581]);
				local22.anInt6585 = (int) ((float) this.anIntArray225[local20.anInt6581] * local8.aFloat22 + local8.aFloat21 * (float) this.lb[local20.anInt6581] + local8.aFloat27 * (float) this.anIntArray226[local20.anInt6581] + local8.aFloat32);
				local22.anInt6580 = (int) (local8.aFloat26 + local8.aFloat30 * (float) this.anIntArray226[local20.anInt6587] + (float) this.anIntArray225[local20.anInt6587] * local8.aFloat25 + local8.aFloat23 * (float) this.lb[local20.anInt6587]);
				local22.anInt6589 = (int) (local8.aFloat24 + local8.aFloat29 * (float) this.anIntArray226[local20.anInt6587] + (float) this.anIntArray225[local20.anInt6587] * local8.aFloat20 + (float) this.lb[local20.anInt6587] * local8.aFloat31);
				local22.anInt6577 = (int) (local8.aFloat27 * (float) this.anIntArray226[local20.anInt6587] + (float) this.anIntArray225[local20.anInt6587] * local8.aFloat22 + (float) this.lb[local20.anInt6587] * local8.aFloat21 + local8.aFloat32);
			}
		}
		if (this.aClass103Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass103Array2.length; local13++) {
			@Pc(361) Class103 local361 = this.aClass103Array2[local13];
			@Pc(363) Class103 local363 = local361;
			if (local361.aClass103_1 != null) {
				local363 = local361.aClass103_1;
			}
			if (local361.aClass8_1 == null) {
				local361.aClass8_1 = local8.method6812();
			} else {
				local361.aClass8_1.M(local8);
			}
			local363.anInt2992 = (int) (local8.aFloat25 * (float) this.anIntArray225[local361.anInt2993] + (float) this.lb[local361.anInt2993] * local8.aFloat23 + (float) this.anIntArray226[local361.anInt2993] * local8.aFloat30 + local8.aFloat26);
			local363.anInt2990 = (int) (local8.aFloat24 + (float) this.anIntArray226[local361.anInt2993] * local8.aFloat29 + (float) this.anIntArray225[local361.anInt2993] * local8.aFloat20 + local8.aFloat31 * (float) this.lb[local361.anInt2993]);
			local363.anInt2991 = (int) (local8.aFloat32 + local8.aFloat21 * (float) this.lb[local361.anInt2993] + (float) this.anIntArray225[local361.anInt2993] * local8.aFloat22 + (float) this.anIntArray226[local361.anInt2993] * local8.aFloat27);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!q;IZ)V")
	@Override
	public void method7909(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray49 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4452; local14++) {
			if ((arg1 & this.aShortArray49[local14]) != 0) {
				if (arg2) {
					arg0.DA(this.lb[local14], this.anIntArray225[local14], this.anIntArray226[local14], local12);
				} else {
					arg0.method6811(this.lb[local14], this.anIntArray225[local14], this.anIntArray226[local14], local12);
				}
				this.lb[local14] = local12[0];
				this.anIntArray225[local14] = local12[1];
				this.anIntArray226[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4419; local7++) {
			this.lb[local7] = this.lb[local7] + 7 >> 4;
			this.anIntArray225[local7] = this.anIntArray225[local7] + 7 >> 4;
			this.anIntArray226[local7] = this.anIntArray226[local7] + 7 >> 4;
		}
		this.aBoolean321 = false;
		if (this.aClass284_7 != null) {
			this.aClass284_7.anInterface10_6 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class4_Sub5_Sub6 S(@OriginalArg(0) Class4_Sub5_Sub6 arg0) {
		if (this.anInt4479 == 0) {
			return null;
		}
		if (!this.aBoolean321) {
			this.method3932();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass44_Sub3_18.anInt5515 <= 0) {
			local40 = this.aShort57 - (this.aShort53 * this.aClass44_Sub3_18.anInt5515 >> 8) >> this.aClass44_Sub3_18.anInt5470;
			local57 = this.aShort49 - (this.aClass44_Sub3_18.anInt5515 * this.aShort48 >> 8) >> this.aClass44_Sub3_18.anInt5470;
		} else {
			local40 = this.aShort57 - (this.aClass44_Sub3_18.anInt5515 * this.aShort48 >> 8) >> this.aClass44_Sub3_18.anInt5470;
			local57 = this.aShort49 - (this.aClass44_Sub3_18.anInt5515 * this.aShort53 >> 8) >> this.aClass44_Sub3_18.anInt5470;
		}
		@Pc(113) int local113;
		@Pc(130) int local130;
		if (this.aClass44_Sub3_18.anInt5512 <= 0) {
			local113 = this.aShort50 - (this.aClass44_Sub3_18.anInt5512 * this.aShort53 >> 8) >> this.aClass44_Sub3_18.anInt5470;
			local130 = this.aShort54 - (this.aClass44_Sub3_18.anInt5512 * this.aShort48 >> 8) >> this.aClass44_Sub3_18.anInt5470;
		} else {
			local113 = this.aShort50 - (this.aClass44_Sub3_18.anInt5512 * this.aShort48 >> 8) >> this.aClass44_Sub3_18.anInt5470;
			local130 = this.aShort54 - (this.aShort53 * this.aClass44_Sub3_18.anInt5512 >> 8) >> this.aClass44_Sub3_18.anInt5470;
		}
		@Pc(173) int local173 = local57 + 1 - local40;
		@Pc(179) int local179 = local130 + 1 - local113;
		@Pc(182) Class4_Sub5_Sub6_Sub2 local182 = (Class4_Sub5_Sub6_Sub2) arg0;
		@Pc(198) Class4_Sub5_Sub6_Sub2 local198;
		if (local182 != null && local182.method7482(local179, local173)) {
			local198 = local182;
			local182.method7484();
		} else {
			local198 = new Class4_Sub5_Sub6_Sub2(this.aClass44_Sub3_18, local173, local179);
		}
		local198.method7486(local40, local130, local113, local57);
		this.method3925(local198);
		return local198;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!q;Lclient!mj;I)V")
	@Override
	public void method7927(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class1_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4479 == 0) {
			return;
		}
		@Pc(16) Class8_Sub2 local16 = this.aClass44_Sub3_18.aClass8_Sub2_3;
		@Pc(19) Class8_Sub2 local19 = (Class8_Sub2) arg0;
		if (!this.aBoolean321) {
			this.method3932();
		}
		Static528.aFloat219 = local19.aFloat32 * local16.aFloat27 + local19.aFloat26 * local16.aFloat21 + local16.aFloat22 * local19.aFloat24 + local16.aFloat32;
		Static161.aFloat18 = local16.aFloat27 * local19.aFloat22 + local16.aFloat22 * local19.aFloat20 + local16.aFloat21 * local19.aFloat25;
		@Pc(72) float local72 = (float) this.aShort53 * Static161.aFloat18 + Static528.aFloat219;
		@Pc(80) float local80 = Static161.aFloat18 * (float) this.aShort48 + Static528.aFloat219;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = local72 + (float) this.aShort56;
			local96 = local80 - (float) this.aShort56;
		} else {
			local90 = local80 + (float) this.aShort56;
			local96 = local72 - (float) this.aShort56;
		}
		if (this.aClass44_Sub3_18.aFloat167 <= local96 || (float) this.aClass44_Sub3_18.anInt5492 >= local90) {
			return;
		}
		Static185.aFloat123 = local16.aFloat26 + local16.aFloat23 * local19.aFloat26 + local16.aFloat25 * local19.aFloat24 + local16.aFloat30 * local19.aFloat32;
		Static194.aFloat126 = local19.aFloat20 * local16.aFloat25 + local16.aFloat23 * local19.aFloat25 + local19.aFloat22 * local16.aFloat30;
		@Pc(172) float local172 = Static185.aFloat123 + (float) this.aShort53 * Static194.aFloat126;
		@Pc(180) float local180 = Static194.aFloat126 * (float) this.aShort48 + Static185.aFloat123;
		@Pc(206) float local206;
		@Pc(195) float local195;
		if (local180 < local172) {
			local195 = (float) this.aClass44_Sub3_18.anInt5493 * (local172 + (float) this.aShort56);
			local206 = (local180 - (float) this.aShort56) * (float) this.aClass44_Sub3_18.anInt5493;
		} else {
			local206 = ((float) -this.aShort56 + local172) * (float) this.aClass44_Sub3_18.anInt5493;
			local195 = (float) this.aClass44_Sub3_18.anInt5493 * (local180 + (float) this.aShort56);
		}
		if (this.aClass44_Sub3_18.aFloat165 <= local206 / local90 || this.aClass44_Sub3_18.aFloat177 >= local195 / local90) {
			return;
		}
		Static185.aFloat124 = local16.aFloat24 + local19.aFloat26 * local16.aFloat31 + local16.aFloat20 * local19.aFloat24 + local19.aFloat32 * local16.aFloat29;
		Static300.aFloat191 = local16.aFloat29 * local19.aFloat22 + local16.aFloat20 * local19.aFloat20 + local16.aFloat31 * local19.aFloat25;
		@Pc(296) float local296 = Static300.aFloat191 * (float) this.aShort53 + Static185.aFloat124;
		@Pc(304) float local304 = Static185.aFloat124 + (float) this.aShort48 * Static300.aFloat191;
		@Pc(319) float local319;
		@Pc(330) float local330;
		if (local304 < local296) {
			local319 = (local304 - (float) this.aShort56) * (float) this.aClass44_Sub3_18.anInt5500;
			local330 = ((float) this.aShort56 + local296) * (float) this.aClass44_Sub3_18.anInt5500;
		} else {
			local319 = (float) this.aClass44_Sub3_18.anInt5500 * ((float) -this.aShort56 + local296);
			local330 = ((float) this.aShort56 + local304) * (float) this.aClass44_Sub3_18.anInt5500;
		}
		if (this.aClass44_Sub3_18.aFloat179 <= local319 / local90 || local330 / local90 <= this.aClass44_Sub3_18.aFloat161) {
			return;
		}
		if (arg1 != null || this.aClass331Array1 != null) {
			Static251.aFloat136 = local16.aFloat20 * local19.aFloat29 + local19.aFloat30 * local16.aFloat31 + local19.aFloat27 * local16.aFloat29;
			Static298.aFloat189 = local16.aFloat25 * local19.aFloat31 + local19.aFloat23 * local16.aFloat23 + local19.aFloat21 * local16.aFloat30;
			Static110.aFloat92 = local19.aFloat27 * local16.aFloat27 + local16.aFloat22 * local19.aFloat29 + local16.aFloat21 * local19.aFloat30;
			Static281.aFloat185 = local19.aFloat27 * local16.aFloat30 + local16.aFloat25 * local19.aFloat29 + local16.aFloat23 * local19.aFloat30;
			Static163.aFloat117 = local19.aFloat31 * local16.aFloat20 + local19.aFloat23 * local16.aFloat31 + local16.aFloat29 * local19.aFloat21;
			Static56.aFloat33 = local16.aFloat22 * local19.aFloat31 + local16.aFloat21 * local19.aFloat23 + local19.aFloat21 * local16.aFloat27;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(500) int local500 = this.aShort49 + this.aShort57 >> 1;
			@Pc(509) int local509 = this.aShort50 + this.aShort54 >> 1;
			@Pc(528) int local528 = (int) (Static281.aFloat185 * (float) local509 + Static298.aFloat189 * (float) local500 + Static185.aFloat123 + (float) this.aShort53 * Static194.aFloat126);
			@Pc(547) int local547 = (int) (Static251.aFloat136 * (float) local509 + Static185.aFloat124 + Static163.aFloat117 * (float) local500 + (float) this.aShort53 * Static300.aFloat191);
			@Pc(566) int local566 = (int) (Static161.aFloat18 * (float) this.aShort53 + Static528.aFloat219 + Static56.aFloat33 * (float) local500 + Static110.aFloat92 * (float) local509);
			if (this.aClass44_Sub3_18.anInt5492 <= local566) {
				arg1.anInt6297 = this.aClass44_Sub3_18.anInt5493 * local528 / local566 + this.aClass44_Sub3_18.anInt5494;
				arg1.anInt6299 = this.aClass44_Sub3_18.anInt5500 * local547 / local566 + this.aClass44_Sub3_18.anInt5499;
			} else {
				local490 = true;
			}
			@Pc(624) int local624 = (int) (Static185.aFloat123 + (float) local500 * Static298.aFloat189 + (float) this.aShort48 * Static194.aFloat126 + (float) local509 * Static281.aFloat185);
			@Pc(643) int local643 = (int) ((float) local509 * Static251.aFloat136 + Static163.aFloat117 * (float) local500 + Static185.aFloat124 + (float) this.aShort48 * Static300.aFloat191);
			@Pc(662) int local662 = (int) ((float) this.aShort48 * Static161.aFloat18 + (float) local500 * Static56.aFloat33 + Static528.aFloat219 + Static110.aFloat92 * (float) local509);
			if (local662 >= this.aClass44_Sub3_18.anInt5492) {
				arg1.anInt6300 = this.aClass44_Sub3_18.anInt5499 + local643 * this.aClass44_Sub3_18.anInt5500 / local662;
				arg1.anInt6301 = this.aClass44_Sub3_18.anInt5493 * local624 / local662 + this.aClass44_Sub3_18.anInt5494;
			} else {
				local490 = true;
			}
			if (local490) {
				if (this.aClass44_Sub3_18.anInt5492 > local566 && this.aClass44_Sub3_18.anInt5492 > local662) {
					local492 = false;
				} else {
					@Pc(745) int local745;
					@Pc(756) int local756;
					@Pc(767) int local767;
					if (this.aClass44_Sub3_18.anInt5492 > local566) {
						local745 = (local662 - this.aClass44_Sub3_18.anInt5492 << 16) / (local662 - local566);
						local756 = local624 + ((local624 - local528) * local745 >> 16);
						local767 = (local745 * (local643 - local547) >> 16) + local643;
						arg1.anInt6297 = local756 * this.aClass44_Sub3_18.anInt5493 / this.aClass44_Sub3_18.anInt5492 + this.aClass44_Sub3_18.anInt5494;
						arg1.anInt6299 = this.aClass44_Sub3_18.anInt5500 * local767 / this.aClass44_Sub3_18.anInt5492 + this.aClass44_Sub3_18.anInt5499;
					} else if (local662 < this.aClass44_Sub3_18.anInt5492) {
						local745 = (local566 - this.aClass44_Sub3_18.anInt5492 << 16) / (local566 - local662);
						local756 = ((local528 - local624) * local745 >> 16) + local528;
						local767 = (local745 * (local547 - local643) >> 16) + local547;
						arg1.anInt6297 = local756 * this.aClass44_Sub3_18.anInt5493 / this.aClass44_Sub3_18.anInt5492 + this.aClass44_Sub3_18.anInt5494;
						arg1.anInt6299 = this.aClass44_Sub3_18.anInt5500 * local767 / this.aClass44_Sub3_18.anInt5492 + this.aClass44_Sub3_18.anInt5499;
					}
				}
			}
			if (local492) {
				arg1.aBoolean461 = true;
				if (local662 < local566) {
					arg1.anInt6298 = (this.aShort56 + local528) * this.aClass44_Sub3_18.anInt5493 / local566 + this.aClass44_Sub3_18.anInt5494 - arg1.anInt6297;
				} else {
					arg1.anInt6298 = this.aClass44_Sub3_18.anInt5493 * (local624 + this.aShort56) / local662 + this.aClass44_Sub3_18.anInt5494 - arg1.anInt6301;
				}
			}
		}
		this.aClass44_Sub3_18.method4615();
		this.aClass44_Sub3_18.method4610(local19);
		this.method3923();
		this.aClass44_Sub3_18.method4686();
		this.method3928();
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4429; local7++) {
			if (arg0 == this.aShortArray50[local7]) {
				this.aShortArray50[local7] = arg1;
			}
		}
		if (this.aClass331Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt4434; local34++) {
				@Pc(41) Class331 local41 = this.aClass331Array1[local34];
				@Pc(46) Class160 local46 = this.aClass160Array1[local34];
				local46.anInt4129 = Static15.anIntArray11[this.aShortArray50[local41.anInt9530] & 0xFFFF] & 0xFFFFFF | local46.anInt4129 & 0xFF000000;
			}
		}
		if (this.aClass284_5 != null) {
			this.aClass284_5.anInterface10_6 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
	@Override
	protected void method7908() {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(JIFLclient!kk;IIFIII)S")
	private short method3919(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class191 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(16) int local16 = this.anIntArray223[arg7];
		@Pc(23) int local23 = this.anIntArray223[arg7 + 1];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = local16; local27 < local23; local27++) {
			@Pc(34) short local34 = this.aShortArray52[local27];
			if (local34 == 0) {
				local25 = local27;
				break;
			}
			if (Static575.aLongArray17[local27] == arg0) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray52[local25] = (short) (this.anInt4479 + 1);
		Static575.aLongArray17[local25] = arg0;
		this.aShortArray55[this.anInt4479] = (short) arg8;
		this.aShortArray48[this.anInt4479] = (short) arg4;
		this.aShortArray46[this.anInt4479] = (short) arg1;
		this.aByteArray55[this.anInt4479] = (byte) arg5;
		this.aFloatArray29[this.anInt4479] = arg6;
		this.aFloatArray28[this.anInt4479] = arg2;
		return (short) this.anInt4479++;
	}

	@OriginalMember(owner = "client!ji", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean321) {
			this.method3932();
		}
		return this.aShort52;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) boolean arg3) {
		return this.method3918(arg3, arg0, arg1, arg2, -1);
	}

	@OriginalMember(owner = "client!ji", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean321) {
			this.method3932();
		}
		return this.aShort56;
	}

	@OriginalMember(owner = "client!ji", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		if (arg0 == 0) {
			local12 = 0;
			Static182.anInt3641 = 0;
			Static39.anInt536 = 0;
			Static586.anInt10150 = 0;
			for (local20 = 0; local20 < this.anInt4452; local20++) {
				Static39.anInt536 += this.lb[local20];
				Static182.anInt3641 += this.anIntArray225[local20];
				Static586.anInt10150 += this.anIntArray226[local20];
				local12++;
			}
			if (local12 <= 0) {
				Static182.anInt3641 = arg2;
				Static586.anInt10150 = arg3;
				Static39.anInt536 = arg1;
			} else {
				Static182.anInt3641 = Static182.anInt3641 / local12 + arg2;
				Static586.anInt10150 = Static586.anInt10150 / local12 + arg3;
				Static39.anInt536 = arg1 + Static39.anInt536 / local12;
			}
		} else if (arg0 == 1) {
			for (local12 = 0; local12 < this.anInt4452; local12++) {
				this.lb[local12] += arg1;
				this.anIntArray225[local12] += arg2;
				this.anIntArray226[local12] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(183) int local183;
			if (arg0 == 2) {
				for (local12 = 0; local12 < this.anInt4452; local12++) {
					this.lb[local12] -= Static39.anInt536;
					this.anIntArray225[local12] -= Static182.anInt3641;
					this.anIntArray226[local12] -= Static586.anInt10150;
					if (arg3 != 0) {
						local20 = Class4_Sub27.anIntArray296[arg3];
						local164 = Class4_Sub27.anIntArray297[arg3];
						local183 = local20 * this.anIntArray225[local12] + local164 * this.lb[local12] + 16383 >> 14;
						this.anIntArray225[local12] = local164 * this.anIntArray225[local12] + 16383 - local20 * this.lb[local12] >> 14;
						this.lb[local12] = local183;
					}
					if (arg1 != 0) {
						local20 = Class4_Sub27.anIntArray296[arg1];
						local164 = Class4_Sub27.anIntArray297[arg1];
						local183 = this.anIntArray225[local12] * local164 + 16383 - this.anIntArray226[local12] * local20 >> 14;
						this.anIntArray226[local12] = local164 * this.anIntArray226[local12] + this.anIntArray225[local12] * local20 + 16383 >> 14;
						this.anIntArray225[local12] = local183;
					}
					if (arg2 != 0) {
						local20 = Class4_Sub27.anIntArray296[arg2];
						local164 = Class4_Sub27.anIntArray297[arg2];
						local183 = local20 * this.anIntArray226[local12] + local164 * this.lb[local12] + 16383 >> 14;
						this.anIntArray226[local12] = local164 * this.anIntArray226[local12] + 16383 - this.lb[local12] * local20 >> 14;
						this.lb[local12] = local183;
					}
					this.lb[local12] += Static39.anInt536;
					this.anIntArray225[local12] += Static182.anInt3641;
					this.anIntArray226[local12] += Static586.anInt10150;
				}
			} else if (arg0 == 3) {
				for (local12 = 0; local12 < this.anInt4452; local12++) {
					this.lb[local12] -= Static39.anInt536;
					this.anIntArray225[local12] -= Static182.anInt3641;
					this.anIntArray226[local12] -= Static586.anInt10150;
					this.lb[local12] = arg1 * this.lb[local12] / 128;
					this.anIntArray225[local12] = arg2 * this.anIntArray225[local12] / 128;
					this.anIntArray226[local12] = arg3 * this.anIntArray226[local12] / 128;
					this.lb[local12] += Static39.anInt536;
					this.anIntArray225[local12] += Static182.anInt3641;
					this.anIntArray226[local12] += Static586.anInt10150;
				}
			} else {
				@Pc(520) Class331 local520;
				@Pc(525) Class160 local525;
				if (arg0 == 5) {
					for (local12 = 0; local12 < this.anInt4429; local12++) {
						local20 = (this.aByteArray54[local12] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray54[local12] = (byte) local20;
					}
					if (this.aClass284_5 != null) {
						this.aClass284_5.anInterface10_6 = null;
					}
					if (this.aClass331Array1 != null) {
						for (local20 = 0; local20 < this.anInt4434; local20++) {
							local520 = this.aClass331Array1[local20];
							local525 = this.aClass160Array1[local20];
							local525.anInt4129 = local525.anInt4129 & 0xFFFFFF | 255 - (this.aByteArray54[local520.anInt9530] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local12 = 0; local12 < this.anInt4429; local12++) {
						local20 = this.aShortArray50[local12] & 0xFFFF;
						local164 = local20 >> 10 & 0x3F;
						local183 = local20 >> 7 & 0x7;
						@Pc(579) int local579 = local20 & 0x7F;
						@Pc(585) int local585 = local164 + arg1 & 0x3F;
						local183 += arg2 / 4;
						local579 += arg3;
						if (local183 < 0) {
							local183 = 0;
						} else if (local183 > 7) {
							local183 = 7;
						}
						if (local579 < 0) {
							local579 = 0;
						} else if (local579 > 127) {
							local579 = 127;
						}
						this.aShortArray50[local12] = (short) (local579 | local183 << 7 | local585 << 10);
					}
					if (this.aClass284_5 != null) {
						this.aClass284_5.anInterface10_6 = null;
					}
					if (this.aClass331Array1 != null) {
						for (local20 = 0; local20 < this.anInt4434; local20++) {
							local520 = this.aClass331Array1[local20];
							local525 = this.aClass160Array1[local20];
							local525.anInt4129 = Static15.anIntArray11[this.aShortArray50[local520.anInt9530] & 0xFFFF] & 0xFFFFFF | local525.anInt4129 & 0xFF000000;
						}
					}
				} else {
					@Pc(704) Class160 local704;
					if (arg0 == 8) {
						for (local12 = 0; local12 < this.anInt4434; local12++) {
							local704 = this.aClass160Array1[local12];
							local704.anInt4137 += arg2;
							local704.anInt4131 += arg1;
						}
					} else if (arg0 == 10) {
						for (local12 = 0; local12 < this.anInt4434; local12++) {
							local704 = this.aClass160Array1[local12];
							local704.anInt4135 = local704.anInt4135 * arg1 >> 7;
							local704.anInt4130 = local704.anInt4130 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local12 = 0; local12 < this.anInt4434; local12++) {
							local704 = this.aClass160Array1[local12];
							local704.anInt4128 = local704.anInt4128 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLclient!ji;IZLclient!ji;I)Lclient!da;")
	private Class57 method3921(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class57_Sub2 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class57_Sub2 arg3, @OriginalArg(5) int arg4) {
		arg3.anInt4478 = this.anInt4478;
		arg3.anInt4419 = this.anInt4419;
		arg3.anInt4460 = arg4;
		arg3.anInt4479 = this.anInt4479;
		arg3.aByte42 = 0;
		arg3.anInt4434 = this.anInt4434;
		arg3.anInt4470 = this.anInt4470;
		arg3.anInt4452 = this.anInt4452;
		if ((arg4 & 0x100) == 0) {
			arg3.aBoolean322 = this.aBoolean322;
		} else {
			arg3.aBoolean322 = true;
		}
		arg3.anInt4429 = this.anInt4429;
		arg3.aShort51 = this.aShort51;
		arg3.aShort55 = this.aShort55;
		@Pc(66) boolean local66 = Static438.method6801(this.anInt4478, arg4);
		@Pc(72) boolean local72 = Static107.method6922(arg4, this.anInt4478);
		@Pc(80) boolean local80 = Static448.method6946(this.anInt4478, arg4);
		@Pc(86) boolean local86 = local72 | local66 | local80;
		@Pc(197) int local197;
		if (local86) {
			if (!local66) {
				arg3.lb = this.lb;
			} else if (arg1.lb == null || arg1.lb.length < this.anInt4419) {
				arg3.lb = arg1.lb = new int[this.anInt4419];
			} else {
				arg3.lb = arg1.lb;
			}
			if (!local72) {
				arg3.anIntArray225 = this.anIntArray225;
			} else if (arg1.anIntArray225 == null || arg1.anIntArray225.length < this.anInt4419) {
				arg3.anIntArray225 = arg1.anIntArray225 = new int[this.anInt4419];
			} else {
				arg3.anIntArray225 = arg1.anIntArray225;
			}
			if (!local80) {
				arg3.anIntArray226 = this.anIntArray226;
			} else if (arg1.anIntArray226 == null || arg1.anIntArray226.length < this.anInt4419) {
				arg3.anIntArray226 = arg1.anIntArray226 = new int[this.anInt4419];
			} else {
				arg3.anIntArray226 = arg1.anIntArray226;
			}
			for (local197 = 0; local197 < this.anInt4419; local197++) {
				if (local66) {
					arg3.lb[local197] = this.lb[local197];
				}
				if (local72) {
					arg3.anIntArray225[local197] = this.anIntArray225[local197];
				}
				if (local80) {
					arg3.anIntArray226[local197] = this.anIntArray226[local197];
				}
			}
		} else {
			arg3.lb = this.lb;
			arg3.anIntArray226 = this.anIntArray226;
			arg3.anIntArray225 = this.anIntArray225;
		}
		if (Static335.method5481(this.anInt4478, arg4)) {
			arg3.aClass284_7 = arg1.aClass284_7;
			if (arg0) {
				arg3.aByte42 = (byte) (arg3.aByte42 | 0x1);
			}
			arg3.aClass284_7.aByte96 = this.aClass284_7.aByte96;
			arg3.aClass284_7.anInterface10_6 = this.aClass284_7.anInterface10_6;
		} else if (Static286.method4962(this.anInt4478, arg4)) {
			arg3.aClass284_7 = this.aClass284_7;
		} else {
			arg3.aClass284_7 = null;
		}
		if (Static297.method5126(this.anInt4478, arg4)) {
			if (arg1.aShortArray50 == null || arg1.aShortArray50.length < this.anInt4429) {
				arg3.aShortArray50 = arg1.aShortArray50 = new short[this.anInt4429];
			} else {
				arg3.aShortArray50 = arg1.aShortArray50;
			}
			for (local197 = 0; local197 < this.anInt4429; local197++) {
				arg3.aShortArray50[local197] = this.aShortArray50[local197];
			}
		} else {
			arg3.aShortArray50 = this.aShortArray50;
		}
		if (Static467.method7079(arg4, this.anInt4478)) {
			if (arg1.aByteArray54 == null || this.anInt4429 > arg1.aByteArray54.length) {
				arg3.aByteArray54 = arg1.aByteArray54 = new byte[this.anInt4429];
			} else {
				arg3.aByteArray54 = arg1.aByteArray54;
			}
			for (local197 = 0; local197 < this.anInt4429; local197++) {
				arg3.aByteArray54[local197] = this.aByteArray54[local197];
			}
		} else {
			arg3.aByteArray54 = this.aByteArray54;
		}
		if (Static363.method5856(arg4, this.anInt4478)) {
			arg3.aClass284_5 = arg1.aClass284_5;
			if (arg0) {
				arg3.aByte42 = (byte) (arg3.aByte42 | 0x2);
			}
			arg3.aClass284_5.aByte96 = this.aClass284_5.aByte96;
			arg3.aClass284_5.anInterface10_6 = this.aClass284_5.anInterface10_6;
		} else if (Static335.method5479(this.anInt4478, arg4)) {
			arg3.aClass284_5 = this.aClass284_5;
		} else {
			arg3.aClass284_5 = null;
		}
		@Pc(562) int local562;
		if (Static584.method8298(this.anInt4478, arg4)) {
			if (arg1.aShortArray55 == null || arg1.aShortArray55.length < this.anInt4479) {
				local197 = this.anInt4479;
				arg3.aShortArray48 = arg1.aShortArray48 = new short[local197];
				arg3.aShortArray46 = arg1.aShortArray46 = new short[local197];
				arg3.aShortArray55 = arg1.aShortArray55 = new short[local197];
			} else {
				arg3.aShortArray46 = arg1.aShortArray46;
				arg3.aShortArray55 = arg1.aShortArray55;
				arg3.aShortArray48 = arg1.aShortArray48;
			}
			if (this.aClass49_1 == null) {
				for (local197 = 0; local197 < this.anInt4479; local197++) {
					arg3.aShortArray55[local197] = this.aShortArray55[local197];
					arg3.aShortArray48[local197] = this.aShortArray48[local197];
					arg3.aShortArray46[local197] = this.aShortArray46[local197];
				}
			} else {
				if (arg1.aClass49_1 == null) {
					arg1.aClass49_1 = new Class49();
				}
				@Pc(546) Class49 local546 = arg3.aClass49_1 = arg1.aClass49_1;
				if (local546.aShortArray12 == null || local546.aShortArray12.length < this.anInt4479) {
					local562 = this.anInt4479;
					local546.aShortArray14 = new short[local562];
					local546.aShortArray12 = new short[local562];
					local546.aShortArray13 = new short[local562];
					local546.aByteArray11 = new byte[local562];
				}
				for (local562 = 0; local562 < this.anInt4479; local562++) {
					arg3.aShortArray55[local562] = this.aShortArray55[local562];
					arg3.aShortArray48[local562] = this.aShortArray48[local562];
					arg3.aShortArray46[local562] = this.aShortArray46[local562];
					local546.aShortArray12[local562] = this.aClass49_1.aShortArray12[local562];
					local546.aShortArray14[local562] = this.aClass49_1.aShortArray14[local562];
					local546.aShortArray13[local562] = this.aClass49_1.aShortArray13[local562];
					local546.aByteArray11[local562] = this.aClass49_1.aByteArray11[local562];
				}
			}
			arg3.aByteArray55 = this.aByteArray55;
		} else {
			arg3.aShortArray55 = this.aShortArray55;
			arg3.aByteArray55 = this.aByteArray55;
			arg3.aShortArray46 = this.aShortArray46;
			arg3.aClass49_1 = this.aClass49_1;
			arg3.aShortArray48 = this.aShortArray48;
		}
		if (Static121.method2547(this.anInt4478, arg4)) {
			arg3.aClass284_4 = arg1.aClass284_4;
			if (arg0) {
				arg3.aByte42 = (byte) (arg3.aByte42 | 0x4);
			}
			arg3.aClass284_4.anInterface10_6 = this.aClass284_4.anInterface10_6;
			arg3.aClass284_4.aByte96 = this.aClass284_4.aByte96;
		} else if (Static230.method3721(arg4, this.anInt4478)) {
			arg3.aClass284_4 = this.aClass284_4;
		} else {
			arg3.aClass284_4 = null;
		}
		if (Static232.method3741(arg4, this.anInt4478)) {
			if (arg1.aFloatArray29 == null || arg1.aFloatArray29.length < this.anInt4429) {
				local197 = this.anInt4479;
				arg3.aFloatArray28 = arg1.aFloatArray28 = new float[local197];
				arg3.aFloatArray29 = arg1.aFloatArray29 = new float[local197];
			} else {
				arg3.aFloatArray28 = arg1.aFloatArray28;
				arg3.aFloatArray29 = arg1.aFloatArray29;
			}
			for (local197 = 0; local197 < this.anInt4479; local197++) {
				arg3.aFloatArray29[local197] = this.aFloatArray29[local197];
				arg3.aFloatArray28[local197] = this.aFloatArray28[local197];
			}
		} else {
			arg3.aFloatArray28 = this.aFloatArray28;
			arg3.aFloatArray29 = this.aFloatArray29;
		}
		if (Static50.method667(this.anInt4478, arg4)) {
			arg3.aClass284_6 = arg1.aClass284_6;
			if (arg0) {
				arg3.aByte42 = (byte) (arg3.aByte42 | 0x8);
			}
			arg3.aClass284_6.anInterface10_6 = this.aClass284_6.anInterface10_6;
			arg3.aClass284_6.aByte96 = this.aClass284_6.aByte96;
		} else if (Static264.method4446(arg4, this.anInt4478)) {
			arg3.aClass284_6 = this.aClass284_6;
		} else {
			arg3.aClass284_6 = null;
		}
		if (Static321.method5320(this.anInt4478, arg4)) {
			if (arg1.aShortArray51 == null || arg1.aShortArray51.length < this.anInt4429) {
				local197 = this.anInt4429;
				arg3.aShortArray47 = arg1.aShortArray47 = new short[local197];
				arg3.aShortArray53 = arg1.aShortArray53 = new short[local197];
				arg3.aShortArray51 = arg1.aShortArray51 = new short[local197];
			} else {
				arg3.aShortArray51 = arg1.aShortArray51;
				arg3.aShortArray47 = arg1.aShortArray47;
				arg3.aShortArray53 = arg1.aShortArray53;
			}
			for (local197 = 0; local197 < this.anInt4429; local197++) {
				arg3.aShortArray51[local197] = this.aShortArray51[local197];
				arg3.aShortArray47[local197] = this.aShortArray47[local197];
				arg3.aShortArray53[local197] = this.aShortArray53[local197];
			}
		} else {
			arg3.aShortArray51 = this.aShortArray51;
			arg3.aShortArray47 = this.aShortArray47;
			arg3.aShortArray53 = this.aShortArray53;
		}
		if (Static261.method4412(arg4, this.anInt4478)) {
			if (arg0) {
				arg3.aByte42 = (byte) (arg3.aByte42 | 0x10);
			}
			arg3.aClass291_1 = arg1.aClass291_1;
			arg3.aClass291_1.anInterface22_5 = this.aClass291_1.anInterface22_5;
		} else if (Static247.method3958(arg4, this.anInt4478)) {
			arg3.aClass291_1 = this.aClass291_1;
		} else {
			arg3.aClass291_1 = null;
		}
		if (Static476.method7153(this.anInt4478, arg4)) {
			if (arg1.aShortArray54 == null || arg1.aShortArray54.length < this.anInt4429) {
				local197 = this.anInt4429;
				arg3.aShortArray54 = arg1.aShortArray54 = new short[local197];
			} else {
				arg3.aShortArray54 = arg1.aShortArray54;
			}
			for (local197 = 0; local197 < this.anInt4429; local197++) {
				arg3.aShortArray54[local197] = this.aShortArray54[local197];
			}
		} else {
			arg3.aShortArray54 = this.aShortArray54;
		}
		if (!Static595.method8401(arg4, this.anInt4478)) {
			arg3.aClass160Array1 = this.aClass160Array1;
		} else if (arg1.aClass160Array1 == null || this.anInt4434 > arg1.aClass160Array1.length) {
			local197 = this.anInt4434;
			arg3.aClass160Array1 = arg1.aClass160Array1 = new Class160[local197];
			for (local562 = 0; local562 < this.anInt4434; local562++) {
				arg3.aClass160Array1[local562] = this.aClass160Array1[local562].method3673();
			}
		} else {
			arg3.aClass160Array1 = arg1.aClass160Array1;
			for (local197 = 0; local197 < this.anInt4434; local197++) {
				arg3.aClass160Array1[local197].method3670(this.aClass160Array1[local197]);
			}
		}
		arg3.aShortArray56 = this.aShortArray56;
		arg3.aClass103Array2 = this.aClass103Array2;
		arg3.anIntArrayArray31 = this.anIntArrayArray31;
		arg3.aShortArray49 = this.aShortArray49;
		arg3.aClass331Array1 = this.aClass331Array1;
		if (this.aBoolean321) {
			arg3.aShort56 = this.aShort56;
			arg3.aShort50 = this.aShort50;
			arg3.aShort57 = this.aShort57;
			arg3.aShort52 = this.aShort52;
			arg3.aShort49 = this.aShort49;
			arg3.aShort48 = this.aShort48;
			arg3.aShort54 = this.aShort54;
			arg3.aShort53 = this.aShort53;
			arg3.aBoolean321 = true;
		} else {
			arg3.aBoolean321 = false;
		}
		arg3.aShortArray52 = this.aShortArray52;
		arg3.aClass227Array2 = this.aClass227Array2;
		arg3.anIntArray224 = this.anIntArray224;
		arg3.anIntArrayArray30 = this.anIntArrayArray30;
		arg3.anIntArrayArray29 = this.anIntArrayArray29;
		arg3.anIntArray223 = this.anIntArray223;
		return arg3;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZB)V")
	private void method3922(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass284_5 != null && this.aClass284_5.anInterface10_6 == null;
		@Pc(27) boolean local27 = this.aClass284_4 != null && this.aClass284_4.anInterface10_6 == null;
		@Pc(38) boolean local38 = this.aClass284_7 != null && this.aClass284_7.anInterface10_6 == null;
		@Pc(49) boolean local49 = this.aClass284_6 != null && this.aClass284_6.anInterface10_6 == null;
		if (arg0) {
			local27 &= (this.aByte42 & 0x4) != 0;
			local38 &= (this.aByte42 & 0x1) != 0;
			local49 &= (this.aByte42 & 0x8) != 0;
			local16 &= (this.aByte42 & 0x2) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(114) byte local114 = 0;
		@Pc(116) byte local116 = 0;
		if (local38) {
			local106 = 12;
		}
		@Pc(127) byte local127 = 0;
		if (local16) {
			local114 = local106;
			local106 = (byte) (local106 + 4);
		}
		if (local27) {
			local116 = local106;
			local106 = (byte) (local106 + 12);
		}
		if (local49) {
			local127 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (this.aClass44_Sub3_18.aClass4_Sub11_Sub2_2.aByteArray68.length >= this.anInt4479 * local106) {
			this.aClass44_Sub3_18.aClass4_Sub11_Sub2_2.anInt5831 = 0;
		} else {
			this.aClass44_Sub3_18.aClass4_Sub11_Sub2_2 = new Class4_Sub11_Sub2(local106 * (this.anInt4479 + 100));
		}
		@Pc(193) Class4_Sub11_Sub2 local193 = this.aClass44_Sub3_18.aClass4_Sub11_Sub2_2;
		@Pc(201) int local201;
		@Pc(210) int local210;
		@Pc(238) int local238;
		@Pc(247) int local247;
		if (local38) {
			@Pc(217) int local217;
			@Pc(224) int local224;
			@Pc(229) int local229;
			@Pc(236) int local236;
			if (this.aClass44_Sub3_18.aBoolean399) {
				for (local201 = 0; local201 < this.anInt4452; local201++) {
					local210 = Stream.floatToRawIntBits((float) this.lb[local201]);
					local217 = Stream.floatToRawIntBits((float) this.anIntArray225[local201]);
					local224 = Stream.floatToRawIntBits((float) this.anIntArray226[local201]);
					local229 = this.anIntArray223[local201];
					local236 = this.anIntArray223[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray52[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt5831 = local106 * local247;
						local193.method4909(local210);
						local193.method4909(local217);
						local193.method4909(local224);
					}
				}
			} else {
				for (local201 = 0; local201 < this.anInt4452; local201++) {
					local210 = Stream.floatToRawIntBits((float) this.lb[local201]);
					local217 = Stream.floatToRawIntBits((float) this.anIntArray225[local201]);
					local224 = Stream.floatToRawIntBits((float) this.anIntArray226[local201]);
					local229 = this.anIntArray223[local201];
					local236 = this.anIntArray223[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray52[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt5831 = local106 * local247;
						local193.method4949(local210);
						local193.method4949(local217);
						local193.method4949(local224);
					}
				}
			}
		}
		@Pc(574) float local574;
		@Pc(457) short[] local457;
		@Pc(465) short[] local465;
		@Pc(461) short[] local461;
		@Pc(453) byte[] local453;
		@Pc(609) float local609;
		if (local16) {
			if (this.aClass284_4 == null) {
				if (this.aClass49_1 == null) {
					local453 = this.aByteArray55;
					local461 = this.aShortArray46;
					local457 = this.aShortArray55;
					local465 = this.aShortArray48;
				} else {
					local453 = this.aClass49_1.aByteArray11;
					local457 = this.aClass49_1.aShortArray12;
					local461 = this.aClass49_1.aShortArray13;
					local465 = this.aClass49_1.aShortArray14;
				}
				@Pc(485) float local485 = this.aClass44_Sub3_18.aFloatArray41[0];
				@Pc(491) float local491 = this.aClass44_Sub3_18.aFloatArray41[1];
				@Pc(497) float local497 = this.aClass44_Sub3_18.aFloatArray41[2];
				@Pc(501) float local501 = this.aClass44_Sub3_18.aFloat163;
				@Pc(511) float local511 = this.aClass44_Sub3_18.aFloat181 * 768.0F / (float) this.aShort51;
				@Pc(521) float local521 = this.aClass44_Sub3_18.aFloat166 * 768.0F / (float) this.aShort51;
				for (@Pc(523) int local523 = 0; local523 < this.anInt4429; local523++) {
					@Pc(543) int local543 = this.method3931(this.aShortArray54[local523], this.aShort55, this.aShortArray50[local523], this.aByteArray54[local523]);
					@Pc(552) float local552 = (float) (local543 >>> 24) * this.aClass44_Sub3_18.aFloat169;
					@Pc(563) float local563 = (float) (local543 >> 8 & 0xFF) * this.aClass44_Sub3_18.aFloat162;
					local574 = this.aClass44_Sub3_18.aFloat176 * (float) (local543 >> 16 & 0xFF);
					@Pc(579) short local579 = this.aShortArray51[local523];
					@Pc(584) short local584 = (short) local453[local579];
					if (local584 == 0) {
						local609 = (local497 * (float) local461[local579] + local491 * (float) local465[local579] + local485 * (float) local457[local579]) * 0.0026041667F;
					} else {
						local609 = (local491 * (float) local465[local579] + (float) local457[local579] * local485 + (float) local461[local579] * local497) / (float) (local584 * 256);
					}
					@Pc(649) float local649 = local501 + (local609 < 0.0F ? local521 : local511) * local609;
					@Pc(654) int local654 = (int) (local649 * local552);
					if (local654 < 0) {
						local654 = 0;
					} else if (local654 > 255) {
						local654 = 255;
					}
					@Pc(673) int local673 = (int) (local574 * local649);
					@Pc(678) int local678 = (int) (local563 * local649);
					if (local673 < 0) {
						local673 = 0;
					} else if (local673 > 255) {
						local673 = 255;
					}
					local193.anInt5831 = local579 * local106 + local114;
					if (local678 < 0) {
						local678 = 0;
					} else if (local678 > 255) {
						local678 = 255;
					}
					local193.method4957(local654);
					local193.method4957(local673);
					local193.method4957(local678);
					local193.method4957(255 - (this.aByteArray54[local523] & 0xFF));
					local579 = this.aShortArray47[local523];
					local584 = local453[local579];
					if (local584 == 0) {
						local609 = (local497 * (float) local461[local579] + local491 * (float) local465[local579] + (float) local457[local579] * local485) * 0.0026041667F;
					} else {
						local609 = ((float) local457[local579] * local485 + (float) local465[local579] * local491 + (float) local461[local579] * local497) / (float) (local584 * 256);
					}
					local649 = (local609 < 0.0F ? local521 : local511) * local609 + local501;
					local654 = (int) (local552 * local649);
					local673 = (int) (local649 * local574);
					if (local654 < 0) {
						local654 = 0;
					} else if (local654 > 255) {
						local654 = 255;
					}
					if (local673 < 0) {
						local673 = 0;
					} else if (local673 > 255) {
						local673 = 255;
					}
					local678 = (int) (local649 * local563);
					if (local678 < 0) {
						local678 = 0;
					} else if (local678 > 255) {
						local678 = 255;
					}
					local193.anInt5831 = local579 * local106 + local114;
					local193.method4957(local654);
					local193.method4957(local673);
					local193.method4957(local678);
					local193.method4957(255 - (this.aByteArray54[local523] & 0xFF));
					local579 = this.aShortArray53[local523];
					local584 = local453[local579];
					if (local584 == 0) {
						local609 = ((float) local465[local579] * local491 + local485 * (float) local457[local579] + local497 * (float) local461[local579]) * 0.0026041667F;
					} else {
						local609 = (local485 * (float) local457[local579] + local491 * (float) local465[local579] + local497 * (float) local461[local579]) / (float) (local584 * 256);
					}
					local649 = local501 + (local609 < 0.0F ? local521 : local511) * local609;
					local654 = (int) (local552 * local649);
					if (local654 < 0) {
						local654 = 0;
					} else if (local654 > 255) {
						local654 = 255;
					}
					local673 = (int) (local649 * local574);
					if (local673 < 0) {
						local673 = 0;
					} else if (local673 > 255) {
						local673 = 255;
					}
					local678 = (int) (local649 * local563);
					local193.anInt5831 = local579 * local106 + local114;
					if (local678 < 0) {
						local678 = 0;
					} else if (local678 > 255) {
						local678 = 255;
					}
					local193.method4957(local654);
					local193.method4957(local673);
					local193.method4957(local678);
					local193.method4957(255 - (this.aByteArray54[local523] & 0xFF));
				}
			} else {
				for (local201 = 0; local201 < this.anInt4429; local201++) {
					local210 = this.method3931(this.aShortArray54[local201], this.aShort55, this.aShortArray50[local201], this.aByteArray54[local201]);
					local193.anInt5831 = local114 + this.aShortArray51[local201] * local106;
					local193.method4909(local210);
					local193.anInt5831 = local114 + local106 * this.aShortArray47[local201];
					local193.method4909(local210);
					local193.anInt5831 = local106 * this.aShortArray53[local201] + local114;
					local193.method4909(local210);
				}
			}
		}
		if (local27) {
			if (this.aClass49_1 == null) {
				local457 = this.aShortArray55;
				local465 = this.aShortArray48;
				local461 = this.aShortArray46;
				local453 = this.aByteArray55;
			} else {
				local457 = this.aClass49_1.aShortArray12;
				local461 = this.aClass49_1.aShortArray13;
				local453 = this.aClass49_1.aByteArray11;
				local465 = this.aClass49_1.aShortArray14;
			}
			@Pc(1107) float local1107 = 3.0F / (float) this.aShort51;
			local609 = 3.0F / (float) (this.aShort51 / 2 + this.aShort51);
			local193.anInt5831 = local116;
			if (this.aClass44_Sub3_18.aBoolean399) {
				for (local238 = 0; local238 < this.anInt4479; local238++) {
					local247 = local453[local238] & 0xFF;
					if (local247 == 0) {
						local193.method4961(local609 * (float) local457[local238]);
						local193.method4961((float) local465[local238] * local609);
						local193.method4961((float) local461[local238] * local609);
					} else {
						local574 = local1107 / (float) local247;
						local193.method4961((float) local457[local238] * local574);
						local193.method4961(local574 * (float) local465[local238]);
						local193.method4961((float) local461[local238] * local574);
					}
					local193.anInt5831 += local106 - 12;
				}
			} else {
				for (local238 = 0; local238 < this.anInt4479; local238++) {
					local247 = local453[local238] & 0xFF;
					if (local247 == 0) {
						local193.method4960(local609 * (float) local457[local238]);
						local193.method4960(local609 * (float) local465[local238]);
						local193.method4960(local609 * (float) local461[local238]);
					} else {
						local574 = local1107 / (float) local247;
						local193.method4960(local574 * (float) local457[local238]);
						local193.method4960((float) local465[local238] * local574);
						local193.method4960(local574 * (float) local461[local238]);
					}
					local193.anInt5831 += local106 - 12;
				}
			}
		}
		if (local49) {
			local193.anInt5831 = local127;
			if (this.aClass44_Sub3_18.aBoolean399) {
				for (local201 = 0; local201 < this.anInt4479; local201++) {
					local193.method4961(this.aFloatArray29[local201]);
					local193.method4961(this.aFloatArray28[local201]);
					local193.anInt5831 += local106 - 8;
				}
			} else {
				for (local201 = 0; local201 < this.anInt4479; local201++) {
					local193.method4960(this.aFloatArray29[local201]);
					local193.method4960(this.aFloatArray28[local201]);
					local193.anInt5831 += local106 - 8;
				}
			}
		}
		local193.anInt5831 = local106 * this.anInt4479;
		@Pc(1431) Interface10 local1431;
		if (arg0) {
			if (this.anInterface10_2 == null) {
				this.anInterface10_2 = this.aClass44_Sub3_18.method4636(local193.aByteArray68, true, local106, local193.anInt5831);
			} else {
				this.anInterface10_2.method6468(local193.aByteArray68, local193.anInt5831, local106);
			}
			local1431 = this.anInterface10_2;
			this.aByte42 = 0;
		} else {
			local1431 = this.aClass44_Sub3_18.method4636(local193.aByteArray68, false, local106, local193.anInt5831);
			this.aBoolean323 = true;
		}
		if (local38) {
			this.aClass284_7.anInterface10_6 = local1431;
			this.aClass284_7.aByte96 = 0;
		}
		if (local49) {
			this.aClass284_6.anInterface10_6 = local1431;
			this.aClass284_6.aByte96 = local127;
		}
		if (local16) {
			this.aClass284_5.anInterface10_6 = local1431;
			this.aClass284_5.aByte96 = local114;
		}
		if (local27) {
			this.aClass284_4.aByte96 = local116;
			this.aClass284_4.anInterface10_6 = local1431;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method3918(arg3, arg0, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	private void method3923() {
		if (this.anInt4470 == 0) {
			return;
		}
		if (this.aByte42 != 0) {
			this.method3922(true);
		}
		this.method3922(false);
		if (this.aClass291_1 != null) {
			if (this.aClass291_1.anInterface22_5 == null) {
				this.method3933((this.aByte42 & 0x10) != 0);
			}
			if (this.aClass291_1.anInterface22_5 != null) {
				this.aClass44_Sub3_18.method4642(this.aClass284_4 != null);
				this.aClass44_Sub3_18.method4633(this.aClass284_4, this.aClass284_7, this.aClass284_6, this.aClass284_5);
				@Pc(85) int local85 = this.anIntArray224.length - 1;
				for (@Pc(87) int local87 = 0; local87 < local85; local87++) {
					@Pc(94) int local94 = this.anIntArray224[local87];
					@Pc(101) int local101 = this.anIntArray224[local87 + 1];
					@Pc(108) int local108 = this.aShortArray54[local94] & 0xFFFF;
					if (local108 == 65535) {
						local108 = -1;
					}
					this.aClass44_Sub3_18.method4618(local108, this.aClass284_4 != null);
					this.aClass44_Sub3_18.method4657((local101 - local94) * 3, local94 * 3, this.aClass291_1.anInterface22_5);
				}
			}
		}
		this.method3927();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!tm;Z)V")
	private void method3925(@OriginalArg(0) Class4_Sub5_Sub6_Sub2 arg0) {
		if (this.aClass44_Sub3_18.anIntArray266.length < this.anInt4479) {
			this.aClass44_Sub3_18.anIntArray266 = new int[this.anInt4479];
			this.aClass44_Sub3_18.anIntArray265 = new int[this.anInt4479];
		}
		@Pc(32) int[] local32 = this.aClass44_Sub3_18.anIntArray266;
		@Pc(36) int[] local36 = this.aClass44_Sub3_18.anIntArray265;
		@Pc(64) int local64;
		@Pc(103) int local103;
		@Pc(112) int local112;
		for (@Pc(38) int local38 = 0; local38 < this.anInt4452; local38++) {
			local64 = (this.lb[local38] - (this.aClass44_Sub3_18.anInt5515 * this.anIntArray225[local38] >> 8) >> this.aClass44_Sub3_18.anInt5470) - arg0.anInt9187;
			@Pc(89) int local89 = (this.anIntArray226[local38] - (this.aClass44_Sub3_18.anInt5512 * this.anIntArray225[local38] >> 8) >> this.aClass44_Sub3_18.anInt5470) - arg0.anInt9191;
			@Pc(94) int local94 = this.anIntArray223[local38];
			@Pc(101) int local101 = this.anIntArray223[local38 + 1];
			for (local103 = local94; local103 < local101; local103++) {
				local112 = this.aShortArray52[local103] - 1;
				if (local112 == -1) {
					break;
				}
				local32[local112] = local64;
				local36[local112] = local89;
			}
		}
		for (local64 = 0; local64 < this.anInt4470; local64++) {
			if (this.aByteArray54 == null || this.aByteArray54[local64] <= 128) {
				@Pc(165) short local165 = this.aShortArray51[local64];
				@Pc(170) short local170 = this.aShortArray47[local64];
				@Pc(175) short local175 = this.aShortArray53[local64];
				local103 = local32[local165];
				local112 = local32[local170];
				@Pc(187) int local187 = local32[local175];
				@Pc(191) int local191 = local36[local165];
				@Pc(195) int local195 = local36[local170];
				@Pc(199) int local199 = local36[local175];
				if ((local103 - local112) * (-local199 + local195) - (local187 - local112) * (-local191 + local195) > 0) {
					arg0.method7481(local112, local191, local187, local103, local195, local199);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "()[Lclient!fk;")
	@Override
	public Class103[] method7920() {
		return this.aClass103Array2;
	}

	@OriginalMember(owner = "client!ji", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4452; local7++) {
			if (arg0 != 0) {
				this.lb[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray225[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray226[local7] += arg2;
			}
		}
		this.aBoolean321 = false;
		if (this.aClass284_7 != null) {
			this.aClass284_7.anInterface10_6 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean321) {
			this.method3932();
		}
		return this.aShort50;
	}

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean321) {
			this.method3932();
		}
		return this.aShort53;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIBIIII)Z")
	private boolean method3926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg7 && arg4 > arg2 && arg0 > arg2) {
			return false;
		} else if (arg2 > arg7 && arg2 > arg4 && arg2 > arg0) {
			return false;
		} else if (arg1 > arg5 && arg3 > arg5 && arg6 > arg5) {
			return false;
		} else {
			return arg1 >= arg5 || arg3 >= arg5 || arg6 >= arg5;
		}
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "()[Lclient!nba;")
	@Override
	public Class227[] method7915() {
		return this.aClass227Array2;
	}

	@OriginalMember(owner = "client!ji", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4452; local3++) {
			if (arg0 != 128) {
				this.lb[local3] = this.lb[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray225[local3] = this.anIntArray225[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray226[local3] = this.anIntArray226[local3] * arg2 >> 7;
			}
		}
		this.aBoolean321 = false;
		if (this.aClass284_7 != null) {
			this.aClass284_7.anInterface10_6 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4452; local7++) {
			this.anIntArray226[local7] = -this.anIntArray226[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt4479; local25++) {
			this.aShortArray46[local25] = (short) -this.aShortArray46[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt4429; local48++) {
			@Pc(55) short local55 = this.aShortArray51[local48];
			this.aShortArray51[local48] = this.aShortArray53[local48];
			this.aShortArray53[local48] = local55;
		}
		if (this.aClass284_4 == null && this.aClass284_5 != null) {
			this.aClass284_5.anInterface10_6 = null;
		}
		if (this.aClass284_4 != null) {
			this.aClass284_4.anInterface10_6 = null;
		}
		if (this.aClass284_7 != null) {
			this.aClass284_7.anInterface10_6 = null;
		}
		this.aBoolean321 = false;
		if (this.aClass291_1 != null) {
			this.aClass291_1.anInterface22_5 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort51 = (short) arg0;
		if (this.aClass284_5 != null) {
			this.aClass284_5.anInterface10_6 = null;
		}
		if (this.aClass284_4 != null) {
			this.aClass284_4.anInterface10_6 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort51;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4429; local7++) {
			local16 = this.aShortArray50[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 -= -((arg1 - local28) * arg3 >> 7);
			}
			@Pc(47) int local47 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local47 -= -((arg2 - local47) * arg3 >> 7);
			}
			this.aShortArray50[local7] = (short) (local47 | local22 << 10 | local28 << 7);
		}
		if (this.aClass331Array1 != null) {
			for (local16 = 0; local16 < this.anInt4434; local16++) {
				@Pc(111) Class331 local111 = this.aClass331Array1[local16];
				@Pc(116) Class160 local116 = this.aClass160Array1[local16];
				local116.anInt4129 = Static15.anIntArray11[this.aShortArray50[local111.anInt9530] & 0xFFFF] & 0xFFFFFF | local116.anInt4129 & 0xFF000000;
			}
		}
		if (this.aClass284_5 != null) {
			this.aClass284_5.anInterface10_6 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort55 = (short) arg0;
		if (this.aClass284_5 != null) {
			this.aClass284_5.anInterface10_6 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7931(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg2 << 4;
			local25 = arg4 << 4;
			Static182.anInt3641 = 0;
			local29 = 0;
			Static586.anInt10150 = 0;
			Static39.anInt536 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray31.length > local41) {
					local51 = this.anIntArrayArray31[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static39.anInt536 += this.lb[local59];
						Static182.anInt3641 += this.anIntArray225[local59];
						local29++;
						Static586.anInt10150 += this.anIntArray226[local59];
					}
				}
			}
			if (local29 > 0) {
				Static586.anInt10150 = local25 + Static586.anInt10150 / local29;
				Static182.anInt3641 = local17 + Static182.anInt3641 / local29;
				Static39.anInt536 = Static39.anInt536 / local29 + local21;
			} else {
				Static39.anInt536 = local21;
				Static586.anInt10150 = local25;
				Static182.anInt3641 = local17;
			}
			return;
		}
		@Pc(153) int[] local153;
		@Pc(155) int local155;
		if (arg0 == 1) {
			local25 = arg4 << 4;
			local21 = arg2 << 4;
			local17 = arg3 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray31.length > local35) {
					local153 = this.anIntArrayArray31[local35];
					for (local155 = 0; local155 < local153.length; local155++) {
						local53 = local153[local155];
						this.lb[local53] += local21;
						this.anIntArray225[local53] += local17;
						this.anIntArray226[local53] += local25;
					}
				}
			}
			return;
		}
		@Pc(266) int local266;
		@Pc(284) int local284;
		@Pc(740) int local740;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray31.length) {
					local153 = this.anIntArrayArray31[local35];
					if ((arg5 & 0x1) == 0) {
						for (local155 = 0; local155 < local153.length; local155++) {
							local53 = local153[local155];
							this.lb[local53] -= Static39.anInt536;
							this.anIntArray225[local53] -= Static182.anInt3641;
							this.anIntArray226[local53] -= Static586.anInt10150;
							if (arg4 != 0) {
								local59 = Class4_Sub27.anIntArray296[arg4];
								local266 = Class4_Sub27.anIntArray297[arg4];
								local284 = local59 * this.anIntArray225[local53] + local266 * this.lb[local53] + 16383 >> 14;
								this.anIntArray225[local53] = this.anIntArray225[local53] * local266 + 16383 - this.lb[local53] * local59 >> 14;
								this.lb[local53] = local284;
							}
							if (arg2 != 0) {
								local59 = Class4_Sub27.anIntArray296[arg2];
								local266 = Class4_Sub27.anIntArray297[arg2];
								local284 = this.anIntArray225[local53] * local266 + 16383 - local59 * this.anIntArray226[local53] >> 14;
								this.anIntArray226[local53] = local266 * this.anIntArray226[local53] + this.anIntArray225[local53] * local59 + 16383 >> 14;
								this.anIntArray225[local53] = local284;
							}
							if (arg3 != 0) {
								local59 = Class4_Sub27.anIntArray296[arg3];
								local266 = Class4_Sub27.anIntArray297[arg3];
								local284 = local59 * this.anIntArray226[local53] + local266 * this.lb[local53] + 16383 >> 14;
								this.anIntArray226[local53] = this.anIntArray226[local53] * local266 + 16383 - local59 * this.lb[local53] >> 14;
								this.lb[local53] = local284;
							}
							this.lb[local53] += Static39.anInt536;
							this.anIntArray225[local53] += Static182.anInt3641;
							this.anIntArray226[local53] += Static586.anInt10150;
						}
					} else {
						for (local155 = 0; local155 < local153.length; local155++) {
							local53 = local153[local155];
							this.lb[local53] -= Static39.anInt536;
							this.anIntArray225[local53] -= Static182.anInt3641;
							this.anIntArray226[local53] -= Static586.anInt10150;
							if (arg2 != 0) {
								local59 = Class4_Sub27.anIntArray296[arg2];
								local266 = Class4_Sub27.anIntArray297[arg2];
								local284 = this.anIntArray225[local53] * local266 + 16383 - this.anIntArray226[local53] * local59 >> 14;
								this.anIntArray226[local53] = local59 * this.anIntArray225[local53] + local266 * this.anIntArray226[local53] + 16383 >> 14;
								this.anIntArray225[local53] = local284;
							}
							if (arg4 != 0) {
								local59 = Class4_Sub27.anIntArray296[arg4];
								local266 = Class4_Sub27.anIntArray297[arg4];
								local284 = this.anIntArray225[local53] * local59 + this.lb[local53] * local266 + 16383 >> 14;
								this.anIntArray225[local53] = local266 * this.anIntArray225[local53] + 16383 - this.lb[local53] * local59 >> 14;
								this.lb[local53] = local284;
							}
							if (arg3 != 0) {
								local59 = Class4_Sub27.anIntArray296[arg3];
								local266 = Class4_Sub27.anIntArray297[arg3];
								local284 = local266 * this.lb[local53] + this.anIntArray226[local53] * local59 + 16383 >> 14;
								this.anIntArray226[local53] = local266 * this.anIntArray226[local53] + 16383 - this.lb[local53] * local59 >> 14;
								this.lb[local53] = local284;
							}
							this.lb[local53] += Static39.anInt536;
							this.anIntArray225[local53] += Static182.anInt3641;
							this.anIntArray226[local53] += Static586.anInt10150;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray31.length) {
						local51 = this.anIntArrayArray31[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local266 = this.anIntArray223[local59];
							local284 = this.anIntArray223[local59 + 1];
							for (local740 = local266; local740 < local284; local740++) {
								@Pc(749) int local749 = this.aShortArray52[local740] - 1;
								if (local749 == -1) {
									break;
								}
								@Pc(759) int local759;
								@Pc(763) int local763;
								@Pc(782) int local782;
								if (arg4 != 0) {
									local759 = Class4_Sub27.anIntArray296[arg4];
									local763 = Class4_Sub27.anIntArray297[arg4];
									local782 = local759 * this.aShortArray48[local749] + local763 * this.aShortArray55[local749] + 16383 >> 14;
									this.aShortArray48[local749] = (short) (this.aShortArray48[local749] * local763 + 16383 - this.aShortArray55[local749] * local759 >> 14);
									this.aShortArray55[local749] = (short) local782;
								}
								if (arg2 != 0) {
									local759 = Class4_Sub27.anIntArray296[arg2];
									local763 = Class4_Sub27.anIntArray297[arg2];
									local782 = this.aShortArray48[local749] * local763 + 16383 - local759 * this.aShortArray46[local749] >> 14;
									this.aShortArray46[local749] = (short) (local763 * this.aShortArray46[local749] + local759 * this.aShortArray48[local749] + 16383 >> 14);
									this.aShortArray48[local749] = (short) local782;
								}
								if (arg3 != 0) {
									local759 = Class4_Sub27.anIntArray296[arg3];
									local763 = Class4_Sub27.anIntArray297[arg3];
									local782 = this.aShortArray55[local749] * local763 + this.aShortArray46[local749] * local759 + 16383 >> 14;
									this.aShortArray46[local749] = (short) (this.aShortArray46[local749] * local763 + 16383 - local759 * this.aShortArray55[local749] >> 14);
									this.aShortArray55[local749] = (short) local782;
								}
							}
						}
					}
				}
				if (this.aClass284_4 == null && this.aClass284_5 != null) {
					this.aClass284_5.anInterface10_6 = null;
				}
				if (this.aClass284_4 != null) {
					this.aClass284_4.anInterface10_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray31.length) {
					local153 = this.anIntArrayArray31[local35];
					for (local155 = 0; local155 < local153.length; local155++) {
						local53 = local153[local155];
						this.lb[local53] -= Static39.anInt536;
						this.anIntArray225[local53] -= Static182.anInt3641;
						this.anIntArray226[local53] -= Static586.anInt10150;
						this.lb[local53] = this.lb[local53] * arg2 >> 7;
						this.anIntArray225[local53] = this.anIntArray225[local53] * arg3 >> 7;
						this.anIntArray226[local53] = this.anIntArray226[local53] * arg4 >> 7;
						this.lb[local53] += Static39.anInt536;
						this.anIntArray225[local53] += Static182.anInt3641;
						this.anIntArray226[local53] += Static586.anInt10150;
					}
				}
			}
		} else {
			@Pc(1195) Class331 local1195;
			@Pc(1200) Class160 local1200;
			if (arg0 == 5) {
				if (this.anIntArrayArray30 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray30.length > local35) {
							local153 = this.anIntArrayArray30[local35];
							for (local155 = 0; local155 < local153.length; local155++) {
								local53 = local153[local155];
								local59 = (this.aByteArray54[local53] & 0xFF) + (arg2 * 8);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray54[local53] = (byte) local59;
							}
							if (local153.length > 0 && this.aClass284_5 != null) {
								this.aClass284_5.anInterface10_6 = null;
							}
						}
					}
					if (this.aClass331Array1 != null) {
						for (local35 = 0; local35 < this.anInt4434; local35++) {
							local1195 = this.aClass331Array1[local35];
							local1200 = this.aClass160Array1[local35];
							local1200.anInt4129 = local1200.anInt4129 & 0xFFFFFF | 255 - (this.aByteArray54[local1195.anInt9530] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1443) Class160 local1443;
				if (arg0 == 8) {
					if (this.anIntArrayArray29 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray29.length > local35) {
								local153 = this.anIntArrayArray29[local35];
								for (local155 = 0; local155 < local153.length; local155++) {
									local1443 = this.aClass160Array1[local153[local155]];
									local1443.anInt4137 += arg3;
									local1443.anInt4131 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray29 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray29.length) {
								local153 = this.anIntArrayArray29[local35];
								for (local155 = 0; local155 < local153.length; local155++) {
									local1443 = this.aClass160Array1[local153[local155]];
									local1443.anInt4135 = local1443.anInt4135 * arg2 >> 7;
									local1443.anInt4130 = local1443.anInt4130 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray29 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray29.length > local35) {
							local153 = this.anIntArrayArray29[local35];
							for (local155 = 0; local155 < local153.length; local155++) {
								local1443 = this.aClass160Array1[local153[local155]];
								local1443.anInt4128 = local1443.anInt4128 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray30 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray30.length > local35) {
						local153 = this.anIntArrayArray30[local35];
						for (local155 = 0; local155 < local153.length; local155++) {
							local53 = local153[local155];
							local59 = this.aShortArray50[local53] & 0xFFFF;
							local266 = local59 >> 10 & 0x3F;
							local284 = local59 >> 7 & 0x7;
							local740 = local59 & 0x7F;
							@Pc(1285) int local1285 = arg2 + local266 & 0x3F;
							local284 += arg3 / 4;
							local740 += arg4;
							if (local284 < 0) {
								local284 = 0;
							} else if (local284 > 7) {
								local284 = 7;
							}
							if (local740 < 0) {
								local740 = 0;
							} else if (local740 > 127) {
								local740 = 127;
							}
							this.aShortArray50[local53] = (short) (local1285 << 10 | local284 << 7 | local740);
						}
						if (local153.length > 0 && this.aClass284_5 != null) {
							this.aClass284_5.anInterface10_6 = null;
						}
					}
				}
				if (this.aClass331Array1 != null) {
					for (local35 = 0; local35 < this.anInt4434; local35++) {
						local1195 = this.aClass331Array1[local35];
						local1200 = this.aClass160Array1[local35];
						local1200.anInt4129 = Static15.anIntArray11[this.aShortArray50[local1195.anInt9530] & 0xFFFF] & 0xFFFFFF | local1200.anInt4129 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7922(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class57_Sub2 local8 = (Class57_Sub2) arg0;
		if (this.anInt4429 == 0 || local8.anInt4429 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt4452;
		@Pc(27) int[] local27 = local8.lb;
		@Pc(30) int[] local30 = local8.anIntArray225;
		@Pc(33) int[] local33 = local8.anIntArray226;
		@Pc(36) short[] local36 = local8.aShortArray55;
		@Pc(39) short[] local39 = local8.aShortArray48;
		@Pc(42) short[] local42 = local8.aShortArray46;
		@Pc(45) byte[] local45 = local8.aByteArray55;
		@Pc(50) short[] local50;
		@Pc(56) short[] local56;
		@Pc(52) short[] local52;
		@Pc(54) byte[] local54;
		if (this.aClass49_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local56 = this.aClass49_1.aShortArray14;
			local52 = this.aClass49_1.aShortArray13;
			local54 = this.aClass49_1.aByteArray11;
			local50 = this.aClass49_1.aShortArray12;
		}
		@Pc(93) short[] local93;
		@Pc(81) short[] local81;
		@Pc(89) short[] local89;
		@Pc(85) byte[] local85;
		if (local8.aClass49_1 == null) {
			local89 = null;
			local81 = null;
			local93 = null;
			local85 = null;
		} else {
			local81 = local8.aClass49_1.aShortArray14;
			local85 = local8.aClass49_1.aByteArray11;
			local89 = local8.aClass49_1.aShortArray13;
			local93 = local8.aClass49_1.aShortArray12;
		}
		@Pc(106) int[] local106 = local8.anIntArray223;
		@Pc(109) short[] local109 = local8.aShortArray52;
		if (!local8.aBoolean321) {
			local8.method3932();
		}
		@Pc(118) short local118 = local8.aShort53;
		@Pc(121) short local121 = local8.aShort48;
		@Pc(124) short local124 = local8.aShort57;
		@Pc(127) short local127 = local8.aShort49;
		@Pc(130) short local130 = local8.aShort50;
		@Pc(133) short local133 = local8.aShort54;
		for (@Pc(135) int local135 = 0; local135 < this.anInt4452; local135++) {
			@Pc(145) int local145 = this.anIntArray225[local135] - arg2;
			if (local145 >= local118 && local145 <= local121) {
				@Pc(169) int local169 = this.lb[local135] - arg1;
				if (local124 <= local169 && local169 <= local127) {
					@Pc(189) int local189 = this.anIntArray226[local135] - arg3;
					if (local189 >= local130 && local133 >= local189) {
						@Pc(203) int local203 = -1;
						@Pc(208) int local208 = this.anIntArray223[local135];
						@Pc(215) int local215 = this.anIntArray223[local135 + 1];
						for (@Pc(217) int local217 = local208; local217 < local215; local217++) {
							local203 = this.aShortArray52[local217] - 1;
							if (local203 == -1 || this.aByteArray55[local203] != 0) {
								break;
							}
						}
						if (local203 != -1) {
							for (@Pc(246) int local246 = 0; local246 < local24; local246++) {
								if (local27[local246] == local169 && local33[local246] == local189 && local30[local246] == local145) {
									local208 = local106[local246];
									@Pc(269) int local269 = -1;
									local215 = local106[local246 + 1];
									for (@Pc(277) int local277 = local208; local277 < local215; local277++) {
										local269 = local109[local277] - 1;
										if (local269 == -1 || local45[local269] != 0) {
											break;
										}
									}
									if (local269 != -1) {
										if (local50 == null) {
											this.aClass49_1 = new Class49();
											local50 = this.aClass49_1.aShortArray12 = Static112.method2452(this.aShortArray55);
											local56 = this.aClass49_1.aShortArray14 = Static112.method2452(this.aShortArray48);
											local52 = this.aClass49_1.aShortArray13 = Static112.method2452(this.aShortArray46);
											local54 = this.aClass49_1.aByteArray11 = Static587.method8309(this.aByteArray55);
										}
										if (local93 == null) {
											@Pc(354) Class49 local354 = local8.aClass49_1 = new Class49();
											local93 = local354.aShortArray12 = Static112.method2452(local36);
											local81 = local354.aShortArray14 = Static112.method2452(local39);
											local89 = local354.aShortArray13 = Static112.method2452(local42);
											local85 = local354.aByteArray11 = Static587.method8309(local45);
										}
										@Pc(387) short local387 = this.aShortArray55[local203];
										@Pc(392) short local392 = this.aShortArray48[local203];
										@Pc(397) short local397 = this.aShortArray46[local203];
										@Pc(402) byte local402 = this.aByteArray55[local203];
										local208 = local106[local246];
										local215 = local106[local246 + 1];
										@Pc(422) int local422;
										for (@Pc(414) int local414 = local208; local414 < local215; local414++) {
											local422 = local109[local414] - 1;
											if (local422 == -1) {
												break;
											}
											if (local85[local422] != 0) {
												local93[local422] += local387;
												local81[local422] += local392;
												local89[local422] += local397;
												local85[local422] += local402;
											}
										}
										local215 = this.anIntArray223[local135 + 1];
										local397 = local42[local269];
										local392 = local39[local269];
										local402 = local45[local269];
										local208 = this.anIntArray223[local135];
										local387 = local36[local269];
										for (local422 = local208; local422 < local215; local422++) {
											@Pc(505) int local505 = this.aShortArray52[local422] - 1;
											if (local505 == -1) {
												break;
											}
											if (local54[local505] != 0) {
												local50[local505] += local387;
												local56[local505] += local392;
												local52[local505] += local397;
												local54[local505] += local402;
											}
										}
										if (this.aClass284_4 == null && this.aClass284_5 != null) {
											this.aClass284_5.anInterface10_6 = null;
										}
										if (this.aClass284_4 != null) {
											this.aClass284_4.anInterface10_6 = null;
										}
										if (local8.aClass284_4 == null && local8.aClass284_5 != null) {
											local8.aClass284_5.anInterface10_6 = null;
										}
										if (local8.aClass284_4 != null) {
											local8.aClass284_4.anInterface10_6 = null;
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

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "()V")
	@Override
	public void method7929() {
		if (this.anInt4479 <= 0 || this.anInt4470 <= 0) {
			return;
		}
		this.method3922(false);
		if ((this.aByte42 & 0x10) == 0 && this.aClass291_1.anInterface22_5 == null) {
			this.method3933(false);
		}
		this.method3927();
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	private void method3927() {
		if (!this.aBoolean323) {
			return;
		}
		this.aBoolean323 = false;
		if (this.aClass227Array2 == null && this.aClass103Array2 == null && this.aClass331Array1 == null) {
			if (this.lb != null && !Static274.method4761(this.anInt4478, this.anInt4460)) {
				if (this.aClass284_7 != null && this.aClass284_7.anInterface10_6 == null) {
					this.aBoolean323 = true;
				} else {
					if (!this.aBoolean321) {
						this.method3932();
					}
					this.lb = null;
				}
			}
			if (this.anIntArray225 != null && !Static394.method6249(this.anInt4478, this.anInt4460)) {
				if (this.aClass284_7 != null && this.aClass284_7.anInterface10_6 == null) {
					this.aBoolean323 = true;
				} else {
					if (!this.aBoolean321) {
						this.method3932();
					}
					this.anIntArray225 = null;
				}
			}
			if (this.anIntArray226 != null && !Static120.method2530(this.anInt4478, this.anInt4460)) {
				if (this.aClass284_7 != null && this.aClass284_7.anInterface10_6 == null) {
					this.aBoolean323 = true;
				} else {
					if (!this.aBoolean321) {
						this.method3932();
					}
					this.anIntArray226 = null;
				}
			}
		}
		if (this.aShortArray52 != null && this.lb == null && this.anIntArray225 == null && this.anIntArray226 == null) {
			this.anIntArray223 = null;
			this.aShortArray52 = null;
		}
		if (this.aByteArray55 != null && !Static479.method7192(this.anInt4478, this.anInt4460)) {
			if (this.aClass284_4 == null) {
				if (this.aClass284_5 != null && this.aClass284_5.anInterface10_6 == null) {
					this.aBoolean323 = true;
				} else {
					this.aByteArray55 = null;
					this.aShortArray55 = this.aShortArray48 = this.aShortArray46 = null;
				}
			} else if (this.aClass284_4.anInterface10_6 == null) {
				this.aBoolean323 = true;
			} else {
				this.aByteArray55 = null;
				this.aShortArray55 = this.aShortArray48 = this.aShortArray46 = null;
			}
		}
		if (this.aShortArray50 != null && !Static116.method2478(this.anInt4478, this.anInt4460)) {
			if (this.aClass284_5 != null && this.aClass284_5.anInterface10_6 == null) {
				this.aBoolean323 = true;
			} else {
				this.aShortArray50 = null;
			}
		}
		if (this.aByteArray54 != null && !Static372.method5966(this.anInt4478, this.anInt4460)) {
			if (this.aClass284_5 != null && this.aClass284_5.anInterface10_6 == null) {
				this.aBoolean323 = true;
			} else {
				this.aByteArray54 = null;
			}
		}
		if (this.aFloatArray29 != null && !Static345.method5589(this.anInt4460, this.anInt4478)) {
			if (this.aClass284_6 != null && this.aClass284_6.anInterface10_6 == null) {
				this.aBoolean323 = true;
			} else {
				this.aFloatArray29 = this.aFloatArray28 = null;
			}
		}
		if (this.aShortArray54 != null && !Static148.method8177(this.anInt4478, this.anInt4460)) {
			if (this.aClass284_5 != null && this.aClass284_5.anInterface10_6 == null) {
				this.aBoolean323 = true;
			} else {
				this.aShortArray54 = null;
			}
		}
		if (this.aShortArray51 != null && !Static547.method7951(this.anInt4460, this.anInt4478)) {
			if ((this.aClass291_1 == null || this.aClass291_1.anInterface22_5 != null) && (this.aClass284_5 == null || this.aClass284_5.anInterface10_6 != null)) {
				this.aShortArray51 = this.aShortArray47 = this.aShortArray53 = null;
			} else {
				this.aBoolean323 = true;
			}
		}
		if (this.anIntArrayArray30 != null && !Static66.method1079(this.anInt4478, this.anInt4460)) {
			this.aShortArray56 = null;
			this.anIntArrayArray30 = null;
		}
		if (this.anIntArrayArray31 != null && !Static258.method4159(this.anInt4478, this.anInt4460)) {
			this.aShortArray49 = null;
			this.anIntArrayArray31 = null;
		}
		if (this.anIntArrayArray29 != null && !Static416.method6527(this.anInt4460, this.anInt4478)) {
			this.anIntArrayArray29 = null;
		}
		if (this.anIntArray224 != null && (this.anInt4460 & 0x800) == 0 && (this.anInt4460 & 0x40000) == 0) {
			this.anIntArray224 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "()Z")
	@Override
	public boolean method7932() {
		if (this.aShortArray54 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray54.length; local12++) {
			if (this.aShortArray54[local12] != -1 && !this.aClass44_Sub3_18.anInterface11_11.method7407(this.aShortArray54[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) Class83 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean321) {
			this.method3932();
		}
		@Pc(17) int local17 = arg4 + this.aShort57;
		@Pc(23) int local23 = arg4 + this.aShort49;
		@Pc(28) int local28 = this.aShort50 + arg6;
		@Pc(33) int local33 = this.aShort54 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt8829 <= local23 + arg2.anInt8824 >> arg2.anInt8825 || local28 < 0 || arg2.anInt8830 <= arg2.anInt8824 + local33 >> arg2.anInt8825)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt8829 <= local23 + arg3.anInt8824 >> arg3.anInt8825 || local28 < 0 || local33 + arg3.anInt8824 >> arg3.anInt8825 >= arg3.anInt8830) {
				return;
			}
		} else {
			local17 >>= arg2.anInt8825;
			local23 = arg2.anInt8824 + local23 - 1 >> arg2.anInt8825;
			local28 >>= arg2.anInt8825;
			local33 = local33 + arg2.anInt8824 - 1 >> arg2.anInt8825;
			if (arg5 == arg2.method7217(local28, local17) && arg2.method7217(local28, local23) == arg5 && arg5 == arg2.method7217(local33, local17) && arg5 == arg2.method7217(local33, local23)) {
				return;
			}
		}
		@Pc(211) int local211;
		if (arg0 == 1) {
			for (local211 = 0; local211 < this.anInt4452; local211++) {
				this.anIntArray225[local211] = this.anIntArray225[local211] + arg2.method7213(arg4 + this.lb[local211], this.anIntArray226[local211] + arg6) - arg5;
			}
		} else {
			@Pc(219) int local219;
			@Pc(227) int local227;
			if (arg0 == 2) {
				@Pc(429) short local429 = this.aShort53;
				if (local429 == 0) {
					return;
				}
				for (local219 = 0; local219 < this.anInt4452; local219++) {
					local227 = (this.anIntArray225[local219] << 16) / local429;
					if (arg1 > local227) {
						this.anIntArray225[local219] -= -((arg1 - local227) * (arg2.method7213(this.lb[local219] + arg4, this.anIntArray226[local219] + arg6) - arg5) / arg1);
					}
				}
			} else {
				@Pc(235) int local235;
				if (arg0 == 3) {
					local211 = (arg1 & 0xFF) * 4;
					local219 = (arg1 >> 8 & 0xFF) * 4;
					local227 = (arg1 >> 16 & 0xFF) << 6;
					local235 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local211 >> 1) < 0 || (local211 >> 1) + arg4 + arg2.anInt8824 >= arg2.anInt8829 << arg2.anInt8825 || arg6 - (local219 >> 1) < 0 || arg2.anInt8830 << arg2.anInt8825 <= arg2.anInt8824 + (local219 >> 1) + arg6) {
						return;
					}
					this.method7913(arg5, local235, local211, local227, local219, arg4, arg2, arg6);
				} else if (arg0 == 4) {
					local211 = this.aShort48 - this.aShort53;
					for (local219 = 0; local219 < this.anInt4452; local219++) {
						this.anIntArray225[local219] += arg3.method7213(arg4 + this.lb[local219], this.anIntArray226[local219] + arg6) + local211 - arg5;
					}
				} else if (arg0 == 5) {
					local211 = this.aShort48 - this.aShort53;
					for (local219 = 0; local219 < this.anInt4452; local219++) {
						local227 = this.lb[local219] + arg4;
						local235 = this.anIntArray226[local219] + arg6;
						@Pc(339) int local339 = arg2.method7213(local227, local235);
						@Pc(345) int local345 = arg3.method7213(local227, local235);
						@Pc(351) int local351 = local339 - local345 - arg1;
						this.anIntArray225[local219] = (local351 * ((this.anIntArray225[local219] << 8) / local211) >> 8) - (arg5 - local339);
					}
				}
			}
		}
		this.aBoolean321 = false;
		if (this.aClass284_7 != null) {
			this.aClass284_7.anInterface10_6 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt4460;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
	private void method3928() {
		if (this.aClass331Array1 == null) {
			return;
		}
		@Pc(8) Class8_Sub2 local8 = this.aClass44_Sub3_18.aClass8_Sub2_2;
		this.aClass44_Sub3_18.method4680();
		this.aClass44_Sub3_18.ZA(false);
		this.aClass44_Sub3_18.method4642(false);
		this.aClass44_Sub3_18.method4633(null, this.aClass44_Sub3_18.aClass284_8, this.aClass44_Sub3_18.aClass284_9, null);
		for (@Pc(37) int local37 = 0; local37 < this.anInt4434; local37++) {
			@Pc(44) Class331 local44 = this.aClass331Array1[local37];
			@Pc(49) Class160 local49 = this.aClass160Array1[local37];
			if (!local44.aBoolean672 || !this.aClass44_Sub3_18.method5019()) {
				@Pc(77) float local77 = (float) (this.lb[local44.anInt9528] + this.lb[local44.anInt9526] + this.lb[local44.anInt9531]) * 0.3333333F;
				@Pc(98) float local98 = (float) (this.anIntArray225[local44.anInt9528] + this.anIntArray225[local44.anInt9531] + this.anIntArray225[local44.anInt9526]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray226[local44.anInt9528] + this.anIntArray226[local44.anInt9531] + this.anIntArray226[local44.anInt9526]) * 0.3333333F;
				@Pc(134) float local134 = Static185.aFloat123 + Static281.aFloat185 * local120 + local77 * Static298.aFloat189 + Static194.aFloat126 * local98;
				@Pc(148) float local148 = Static185.aFloat124 + Static251.aFloat136 * local120 + Static163.aFloat117 * local77 + local98 * Static300.aFloat191;
				@Pc(162) float local162 = Static528.aFloat219 + Static110.aFloat92 * local120 + local77 * Static56.aFloat33 + local98 * Static161.aFloat18;
				local8.method933(local49.anInt4128, local49.anInt4135 * local44.aShort112 >> 7, (float) local44.anInt9529 - local162, local44.aShort114 * local49.anInt4130 >> 7, (float) local49.anInt4137 - local148, local134 + (float) local49.anInt4131);
				this.aClass44_Sub3_18.method4660(local8);
				@Pc(206) int local206 = local49.anInt4129;
				OpenGL.glColor4ub((byte) (local206 >> 16), (byte) (local206 >> 8), (byte) local206, (byte) (local206 >> 24));
				this.aClass44_Sub3_18.method4661(local44.aShort113);
				this.aClass44_Sub3_18.method4669(local44.aByte122);
				this.aClass44_Sub3_18.method4673(4);
			}
		}
		this.aClass44_Sub3_18.ZA(true);
		this.aClass44_Sub3_18.method4686();
	}

	@OriginalMember(owner = "client!ji", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean322;
	}

	@OriginalMember(owner = "client!ji", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub27.anIntArray296[arg0];
		@Pc(13) int local13 = Class4_Sub27.anIntArray297[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4452; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray226[local15] + this.lb[local15] * local13 >> 14;
			this.anIntArray226[local15] = local13 * this.anIntArray226[local15] - this.lb[local15] * local9 >> 14;
			this.lb[local15] = local33;
		}
		if (this.aClass284_7 != null) {
			this.aClass284_7.anInterface10_6 = null;
		}
		this.aBoolean321 = false;
	}

	@OriginalMember(owner = "client!ji", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean321) {
			this.method3932();
		}
		return this.aShort57;
	}

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			local24 = 0;
			Static39.anInt536 = 0;
			Static182.anInt3641 = 0;
			Static586.anInt10150 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray31.length) {
					local48 = this.anIntArrayArray31[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray49 == null || (this.aShortArray49[local56] & arg6) != 0) {
							Static39.anInt536 += this.lb[local56];
							Static182.anInt3641 += this.anIntArray225[local56];
							local24++;
							Static586.anInt10150 += this.anIntArray226[local56];
						}
					}
				}
			}
			if (local24 > 0) {
				Static586.anInt10150 = Static586.anInt10150 / local24 + arg4;
				Static39.anInt536 = arg2 + Static39.anInt536 / local24;
				Static68.aBoolean56 = true;
				Static182.anInt3641 = arg3 + Static182.anInt3641 / local24;
			} else {
				Static39.anInt536 = arg2;
				Static182.anInt3641 = arg3;
				Static586.anInt10150 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg7[2] * arg4 + arg2 * arg7[0] + arg3 * arg7[1] + 8192 >> 14;
				local32 = arg2 * arg7[3] + arg3 * arg7[4] + arg4 * arg7[5] + 8192 >> 14;
				local38 = arg7[8] * arg4 + arg7[7] * arg3 + arg2 * arg7[6] + 8192 >> 14;
				arg3 = local32;
				arg2 = local24;
				arg4 = local38;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray31.length > local32) {
					local247 = this.anIntArrayArray31[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local50 = local247[local249];
						if (this.aShortArray49 == null || (arg6 & this.aShortArray49[local50]) != 0) {
							this.lb[local50] += arg2;
							this.anIntArray225[local50] += arg3;
							this.anIntArray226[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(375) int local375;
		@Pc(397) int local397;
		@Pc(423) int local423;
		@Pc(454) int local454;
		@Pc(458) int local458;
		@Pc(462) int local462;
		@Pc(466) int local466;
		@Pc(474) int local474;
		@Pc(482) int local482;
		@Pc(636) int local636;
		@Pc(663) int local663;
		@Pc(667) int local667;
		@Pc(676) int local676;
		@Pc(681) int local681;
		@Pc(685) int local685;
		@Pc(689) int local689;
		@Pc(691) int local691;
		@Pc(817) int[] local817;
		@Pc(819) int local819;
		@Pc(823) int local823;
		@Pc(827) int local827;
		@Pc(829) int local829;
		@Pc(960) int local960;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray31.length > local32) {
						local247 = this.anIntArrayArray31[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local50 = local247[local249];
							if (this.aShortArray49 == null || (this.aShortArray49[local50] & arg6) != 0) {
								this.lb[local50] -= Static39.anInt536;
								this.anIntArray225[local50] -= Static182.anInt3641;
								this.anIntArray226[local50] -= Static586.anInt10150;
								if (arg4 != 0) {
									local56 = Class4_Sub27.anIntArray296[arg4];
									local375 = Class4_Sub27.anIntArray297[arg4];
									local397 = local56 * this.anIntArray225[local50] + this.lb[local50] * local375 + 16383 >> 14;
									this.anIntArray225[local50] = this.anIntArray225[local50] * local375 + 16383 - this.lb[local50] * local56 >> 14;
									this.lb[local50] = local397;
								}
								if (arg2 != 0) {
									local56 = Class4_Sub27.anIntArray296[arg2];
									local375 = Class4_Sub27.anIntArray297[arg2];
									local397 = this.anIntArray225[local50] * local375 + 16383 - local56 * this.anIntArray226[local50] >> 14;
									this.anIntArray226[local50] = local375 * this.anIntArray226[local50] + this.anIntArray225[local50] * local56 + 16383 >> 14;
									this.anIntArray225[local50] = local397;
								}
								if (arg3 != 0) {
									local56 = Class4_Sub27.anIntArray296[arg3];
									local375 = Class4_Sub27.anIntArray297[arg3];
									local397 = local375 * this.lb[local50] + this.anIntArray226[local50] * local56 + 16383 >> 14;
									this.anIntArray226[local50] = local375 * this.anIntArray226[local50] + 16383 - this.lb[local50] * local56 >> 14;
									this.lb[local50] = local397;
								}
								this.lb[local50] += Static39.anInt536;
								this.anIntArray225[local50] += Static182.anInt3641;
								this.anIntArray226[local50] += Static586.anInt10150;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray31.length) {
							local48 = this.anIntArrayArray31[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray49 == null || (arg6 & this.aShortArray49[local56]) != 0) {
									local375 = this.anIntArray223[local56];
									local397 = this.anIntArray223[local56 + 1];
									for (local423 = local375; local423 < local397; local423++) {
										local454 = this.aShortArray52[local423] - 1;
										if (local454 == -1) {
											break;
										}
										if (arg4 != 0) {
											local458 = Class4_Sub27.anIntArray296[arg4];
											local462 = Class4_Sub27.anIntArray297[arg4];
											local466 = this.aShortArray55[local454] * local462 + local458 * this.aShortArray48[local454] + 16383 >> 14;
											this.aShortArray48[local454] = (short) (local462 * this.aShortArray48[local454] + 16383 - this.aShortArray55[local454] * local458 >> 14);
											this.aShortArray55[local454] = (short) local466;
										}
										if (arg2 != 0) {
											local458 = Class4_Sub27.anIntArray296[arg2];
											local462 = Class4_Sub27.anIntArray297[arg2];
											local466 = this.aShortArray48[local454] * local462 + 16383 - this.aShortArray46[local454] * local458 >> 14;
											this.aShortArray46[local454] = (short) (this.aShortArray46[local454] * local462 + this.aShortArray48[local454] * local458 + 16383 >> 14);
											this.aShortArray48[local454] = (short) local466;
										}
										if (arg3 != 0) {
											local458 = Class4_Sub27.anIntArray296[arg3];
											local462 = Class4_Sub27.anIntArray297[arg3];
											local466 = local458 * this.aShortArray46[local454] + this.aShortArray55[local454] * local462 + 16383 >> 14;
											this.aShortArray46[local454] = (short) (this.aShortArray46[local454] * local462 + 16383 - local458 * this.aShortArray55[local454] >> 14);
											this.aShortArray55[local454] = (short) local466;
										}
									}
								}
							}
						}
					}
					if (this.aClass284_4 == null && this.aClass284_5 != null) {
						this.aClass284_5.anInterface10_6 = null;
					}
					if (this.aClass284_4 != null) {
						this.aClass284_4.anInterface10_6 = null;
					}
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static68.aBoolean56) {
					local375 = Static586.anInt10150 * arg7[6] + arg7[3] * Static182.anInt3641 + Static39.anInt536 * arg7[0] + 8192 >> 14;
					local397 = Static182.anInt3641 * arg7[4] + Static39.anInt536 * arg7[1] + arg7[7] * Static586.anInt10150 + 8192 >> 14;
					local397 += local50;
					local423 = Static586.anInt10150 * arg7[8] + Static182.anInt3641 * arg7[5] + Static39.anInt536 * arg7[2] + 8192 >> 14;
					local375 += local249;
					local423 += local56;
					Static39.anInt536 = local375;
					Static182.anInt3641 = local397;
					Static68.aBoolean56 = false;
					Static586.anInt10150 = local423;
				}
				@Pc(442) int[] local442 = new int[9];
				local397 = Class4_Sub27.anIntArray297[arg2];
				local423 = Class4_Sub27.anIntArray296[arg2];
				local454 = Class4_Sub27.anIntArray297[arg3];
				local458 = Class4_Sub27.anIntArray296[arg3];
				local462 = Class4_Sub27.anIntArray297[arg4];
				local466 = Class4_Sub27.anIntArray296[arg4];
				local474 = local423 * local462 + 8192 >> 14;
				local482 = local423 * local466 + 8192 >> 14;
				local442[6] = local462 * -local458 + local482 * local454 + 8192 >> 14;
				local442[8] = local454 * local397 + 8192 >> 14;
				local442[4] = local397 * local462 + 8192 >> 14;
				local442[5] = -local423;
				local442[1] = local474 * local458 + -local454 * local466 + 8192 >> 14;
				local442[7] = local454 * local474 + local466 * local458 + 8192 >> 14;
				local442[2] = local458 * local397 + 8192 >> 14;
				local442[3] = local397 * local466 + 8192 >> 14;
				local442[0] = local462 * local454 + local482 * local458 + 8192 >> 14;
				@Pc(611) int local611 = -Static586.anInt10150 * local442[2] + local442[1] * -Static182.anInt3641 + local442[0] * -Static39.anInt536 + 8192 >> 14;
				local636 = -Static586.anInt10150 * local442[5] + local442[3] * -Static39.anInt536 + local442[4] * -Static182.anInt3641 + 8192 >> 14;
				local663 = local442[6] * -Static39.anInt536 + -Static182.anInt3641 * local442[7] + -Static586.anInt10150 * local442[8] + 8192 >> 14;
				local667 = local611 + Static39.anInt536;
				@Pc(671) int local671 = local636 + Static182.anInt3641;
				local676 = local663 + Static586.anInt10150;
				@Pc(679) int[] local679 = new int[9];
				for (local681 = 0; local681 < 3; local681++) {
					for (local685 = 0; local685 < 3; local685++) {
						local689 = 0;
						for (local691 = 0; local691 < 3; local691++) {
							local689 += arg7[local691 + local685 * 3] * local442[local691 + local681 * 3];
						}
						local679[local681 * 3 + local685] = local689 + 8192 >> 14;
					}
				}
				local685 = local56 * local442[2] + local442[1] * local50 + local249 * local442[0] + 8192 >> 14;
				local689 = local442[4] * local50 + local442[3] * local249 + local442[5] * local56 + 8192 >> 14;
				local685 += local667;
				local691 = local442[8] * local56 + local50 * local442[7] + local249 * local442[6] + 8192 >> 14;
				local689 += local671;
				local691 += local676;
				local817 = new int[9];
				for (local819 = 0; local819 < 3; local819++) {
					for (local823 = 0; local823 < 3; local823++) {
						local827 = 0;
						for (local829 = 0; local829 < 3; local829++) {
							local827 += arg7[local819 * 3 + local829] * local679[local829 * 3 + local823];
						}
						local817[local823 + local819 * 3] = local827 + 8192 >> 14;
					}
				}
				local823 = local689 * arg7[1] + arg7[0] * local685 + arg7[2] * local691 + 8192 >> 14;
				local827 = arg7[4] * local689 + arg7[3] * local685 + local691 * arg7[5] + 8192 >> 14;
				local829 = local689 * arg7[7] + local685 * arg7[6] + local691 * arg7[8] + 8192 >> 14;
				local827 += local32;
				local823 += local24;
				local829 += local38;
				for (local960 = 0; local960 < local8; local960++) {
					@Pc(966) int local966 = arg1[local960];
					if (local966 < this.anIntArrayArray31.length) {
						@Pc(980) int[] local980 = this.anIntArrayArray31[local966];
						for (@Pc(982) int local982 = 0; local982 < local980.length; local982++) {
							@Pc(988) int local988 = local980[local982];
							if (this.aShortArray49 == null || (this.aShortArray49[local988] & arg6) != 0) {
								@Pc(1030) int local1030 = local817[1] * this.anIntArray225[local988] + this.lb[local988] * local817[0] + local817[2] * this.anIntArray226[local988] + 8192 >> 14;
								@Pc(1062) int local1062 = this.lb[local988] * local817[3] + this.anIntArray225[local988] * local817[4] + local817[5] * this.anIntArray226[local988] + 8192 >> 14;
								@Pc(1093) int local1093 = local817[6] * this.lb[local988] + local817[7] * this.anIntArray225[local988] + local817[8] * this.anIntArray226[local988] + 8192 >> 14;
								@Pc(1097) int local1097 = local1062 + local827;
								@Pc(1101) int local1101 = local1030 + local823;
								@Pc(1105) int local1105 = local1093 + local829;
								this.lb[local988] = local1101;
								this.anIntArray225[local988] = local1097;
								this.anIntArray226[local988] = local1105;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2591) Class331 local2591;
			@Pc(2596) Class160 local2596;
			if (arg0 == 5) {
				if (this.anIntArrayArray30 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray30.length) {
							local247 = this.anIntArrayArray30[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local50 = local247[local249];
								if (this.aShortArray56 == null || (arg6 & this.aShortArray56[local50]) != 0) {
									local56 = (this.aByteArray54[local50] & 0xFF) + arg2 * 8;
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray54[local50] = (byte) local56;
									if (this.aClass284_5 != null) {
										this.aClass284_5.anInterface10_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass331Array1 != null) {
						for (local32 = 0; local32 < this.anInt4434; local32++) {
							local2591 = this.aClass331Array1[local32];
							local2596 = this.aClass160Array1[local32];
							local2596.anInt4129 = local2596.anInt4129 & 0xFFFFFF | 255 - (this.aByteArray54[local2591.anInt9530] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2851) Class160 local2851;
				if (arg0 == 8) {
					if (this.anIntArrayArray29 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray29.length > local32) {
								local247 = this.anIntArrayArray29[local32];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2851 = this.aClass160Array1[local247[local249]];
									local2851.anInt4131 += arg2;
									local2851.anInt4137 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray29 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray29.length > local32) {
								local247 = this.anIntArrayArray29[local32];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2851 = this.aClass160Array1[local247[local249]];
									local2851.anInt4130 = arg3 * local2851.anInt4130 >> 7;
									local2851.anInt4135 = local2851.anInt4135 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray29 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray29.length) {
							local247 = this.anIntArrayArray29[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2851 = this.aClass160Array1[local247[local249]];
								local2851.anInt4128 = local2851.anInt4128 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray30 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray30.length) {
						local247 = this.anIntArrayArray30[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local50 = local247[local249];
							if (this.aShortArray56 == null || (arg6 & this.aShortArray56[local50]) != 0) {
								local56 = this.aShortArray50[local50] & 0xFFFF;
								local375 = local56 >> 10 & 0x3F;
								local397 = local56 >> 7 & 0x7;
								local423 = local56 & 0x7F;
								@Pc(2701) int local2701 = arg2 + local375 & 0x3F;
								local397 += arg3 / 4;
								local423 += arg4;
								if (local397 < 0) {
									local397 = 0;
								} else if (local397 > 7) {
									local397 = 7;
								}
								if (local423 < 0) {
									local423 = 0;
								} else if (local423 > 127) {
									local423 = 127;
								}
								this.aShortArray50[local50] = (short) (local2701 << 10 | local397 << 7 | local423);
								if (this.aClass284_5 != null) {
									this.aClass284_5.anInterface10_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass331Array1 != null) {
					for (local32 = 0; local32 < this.anInt4434; local32++) {
						local2591 = this.aClass331Array1[local32];
						local2596 = this.aClass160Array1[local32];
						local2596.anInt4129 = Static15.anIntArray11[this.aShortArray50[local2591.anInt9530] & 0xFFFF] & 0xFFFFFF | local2596.anInt4129 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray31.length > local32) {
					local247 = this.anIntArrayArray31[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local50 = local247[local249];
						if (this.aShortArray49 == null || (arg6 & this.aShortArray49[local50]) != 0) {
							this.lb[local50] -= Static39.anInt536;
							this.anIntArray225[local50] -= Static182.anInt3641;
							this.anIntArray226[local50] -= Static586.anInt10150;
							this.lb[local50] = arg2 * this.lb[local50] >> 7;
							this.anIntArray225[local50] = arg3 * this.anIntArray225[local50] >> 7;
							this.anIntArray226[local50] = this.anIntArray226[local50] * arg4 >> 7;
							this.lb[local50] += Static39.anInt536;
							this.anIntArray225[local50] += Static182.anInt3641;
							this.anIntArray226[local50] += Static586.anInt10150;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static68.aBoolean56) {
				local375 = arg7[6] * Static586.anInt10150 + Static39.anInt536 * arg7[0] + arg7[3] * Static182.anInt3641 + 8192 >> 14;
				local397 = arg7[4] * Static182.anInt3641 + Static39.anInt536 * arg7[1] + Static586.anInt10150 * arg7[7] + 8192 >> 14;
				local375 += local249;
				local397 += local50;
				local423 = Static586.anInt10150 * arg7[8] + arg7[2] * Static39.anInt536 + arg7[5] * Static182.anInt3641 + 8192 >> 14;
				Static39.anInt536 = local375;
				Static182.anInt3641 = local397;
				local423 += local56;
				Static68.aBoolean56 = false;
				Static586.anInt10150 = local423;
			}
			local375 = arg2 << 15 >> 7;
			local397 = arg3 << 15 >> 7;
			local423 = arg4 << 15 >> 7;
			local454 = -Static39.anInt536 * local375 + 8192 >> 14;
			local458 = local397 * -Static182.anInt3641 + 8192 >> 14;
			local462 = local423 * -Static586.anInt10150 + 8192 >> 14;
			local466 = local454 + Static39.anInt536;
			local474 = Static182.anInt3641 + local458;
			local482 = Static586.anInt10150 + local462;
			@Pc(2012) int[] local2012 = new int[] { arg7[0] * local375 + 8192 >> 14, arg7[3] * local375 + 8192 >> 14, local375 * arg7[6] + 8192 >> 14, arg7[1] * local397 + 8192 >> 14, local397 * arg7[4] + 8192 >> 14, local397 * arg7[7] + 8192 >> 14, local423 * arg7[2] + 8192 >> 14, local423 * arg7[5] + 8192 >> 14, arg7[8] * local423 + 8192 >> 14 };
			local636 = local249 * local375 + 8192 >> 14;
			local663 = local397 * local50 + 8192 >> 14;
			@Pc(2140) int local2140 = local636 + local466;
			local667 = local423 * local56 + 8192 >> 14;
			@Pc(2152) int local2152 = local663 + local474;
			@Pc(2156) int local2156 = local667 + local482;
			@Pc(2159) int[] local2159 = new int[9];
			@Pc(2165) int local2165;
			for (local676 = 0; local676 < 3; local676++) {
				for (local2165 = 0; local2165 < 3; local2165++) {
					local681 = 0;
					for (local685 = 0; local685 < 3; local685++) {
						local681 += local2012[local2165 + local685 * 3] * arg7[local685 + local676 * 3];
					}
					local2159[local676 * 3 + local2165] = local681 + 8192 >> 14;
				}
			}
			local2165 = arg7[2] * local2156 + local2152 * arg7[1] + local2140 * arg7[0] + 8192 >> 14;
			local681 = arg7[3] * local2140 + local2152 * arg7[4] + arg7[5] * local2156 + 8192 >> 14;
			local685 = local2156 * arg7[8] + arg7[7] * local2152 + arg7[6] * local2140 + 8192 >> 14;
			local2165 += local24;
			local681 += local32;
			local685 += local38;
			for (local689 = 0; local689 < local8; local689++) {
				local691 = arg1[local689];
				if (this.anIntArrayArray31.length > local691) {
					local817 = this.anIntArrayArray31[local691];
					for (local819 = 0; local819 < local817.length; local819++) {
						local823 = local817[local819];
						if (this.aShortArray49 == null || (arg6 & this.aShortArray49[local823]) != 0) {
							local827 = this.anIntArray225[local823] * local2159[1] + this.lb[local823] * local2159[0] + this.anIntArray226[local823] * local2159[2] + 8192 >> 14;
							local829 = local2159[4] * this.anIntArray225[local823] + this.lb[local823] * local2159[3] + local2159[5] * this.anIntArray226[local823] + 8192 >> 14;
							@Pc(2409) int local2409 = local827 + local2165;
							@Pc(2413) int local2413 = local829 + local681;
							local960 = local2159[8] * this.anIntArray226[local823] + local2159[7] * this.anIntArray225[local823] + local2159[6] * this.lb[local823] + 8192 >> 14;
							this.lb[local823] = local2409;
							@Pc(2453) int local2453 = local960 + local685;
							this.anIntArray225[local823] = local2413;
							this.anIntArray226[local823] = local2453;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub27.anIntArray296[arg0];
		@Pc(13) int local13 = Class4_Sub27.anIntArray297[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4452; local15++) {
			@Pc(34) int local34 = this.anIntArray225[local15] * local13 - local9 * this.anIntArray226[local15] >> 14;
			this.anIntArray226[local15] = local9 * this.anIntArray225[local15] + this.anIntArray226[local15] * local13 >> 14;
			this.anIntArray225[local15] = local34;
		}
		this.aBoolean321 = false;
		if (this.aClass284_7 != null) {
			this.aClass284_7.anInterface10_6 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean321) {
			this.method3932();
		}
		return this.aShort48;
	}

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean321) {
			this.method3932();
		}
		return this.aShort49;
	}

	@OriginalMember(owner = "client!ji", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub27.anIntArray296[arg0];
		@Pc(13) int local13 = Class4_Sub27.anIntArray297[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4452; local15++) {
			local33 = this.lb[local15] * local13 + this.anIntArray226[local15] * local9 >> 14;
			this.anIntArray226[local15] = this.anIntArray226[local15] * local13 - this.lb[local15] * local9 >> 14;
			this.lb[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt4479; local33++) {
			@Pc(87) int local87 = this.aShortArray55[local33] * local13 + this.aShortArray46[local33] * local9 >> 14;
			this.aShortArray46[local33] = (short) (this.aShortArray46[local33] * local13 - this.aShortArray55[local33] * local9 >> 14);
			this.aShortArray55[local33] = (short) local87;
		}
		if (this.aClass284_4 == null && this.aClass284_5 != null) {
			this.aClass284_5.anInterface10_6 = null;
		}
		if (this.aClass284_4 != null) {
			this.aClass284_4.anInterface10_6 = null;
		}
		if (this.aClass284_7 != null) {
			this.aClass284_7.anInterface10_6 = null;
		}
		this.aBoolean321 = false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!q;Lclient!mj;II)V")
	@Override
	public void method7919(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class1_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4479 == 0) {
			return;
		}
		@Pc(13) Class8_Sub2 local13 = this.aClass44_Sub3_18.aClass8_Sub2_3;
		if (!this.aBoolean321) {
			this.method3932();
		}
		@Pc(22) Class8_Sub2 local22 = (Class8_Sub2) arg0;
		Static161.aFloat18 = local13.aFloat27 * local22.aFloat22 + local13.aFloat21 * local22.aFloat25 + local13.aFloat22 * local22.aFloat20;
		Static528.aFloat219 = local22.aFloat26 * local13.aFloat21 + local13.aFloat22 * local22.aFloat24 + local13.aFloat27 * local22.aFloat32 + local13.aFloat32;
		@Pc(69) float local69 = Static161.aFloat18 * (float) this.aShort53 + Static528.aFloat219;
		@Pc(77) float local77 = Static528.aFloat219 + Static161.aFloat18 * (float) this.aShort48;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local94 = local69 + (float) this.aShort56;
			local88 = local77 - (float) this.aShort56;
		} else {
			local88 = (float) -this.aShort56 + local69;
			local94 = (float) this.aShort56 + local77;
		}
		if (local88 >= this.aClass44_Sub3_18.aFloat178 || (float) this.aClass44_Sub3_18.anInt5492 >= local94) {
			return;
		}
		Static194.aFloat126 = local13.aFloat23 * local22.aFloat25 + local22.aFloat20 * local13.aFloat25 + local22.aFloat22 * local13.aFloat30;
		Static185.aFloat123 = local22.aFloat32 * local13.aFloat30 + local22.aFloat26 * local13.aFloat23 + local13.aFloat25 * local22.aFloat24 + local13.aFloat26;
		@Pc(170) float local170 = Static194.aFloat126 * (float) this.aShort53 + Static185.aFloat123;
		@Pc(178) float local178 = (float) this.aShort48 * Static194.aFloat126 + Static185.aFloat123;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local170 > local178) {
			local204 = (local178 - (float) this.aShort56) * (float) this.aClass44_Sub3_18.anInt5493;
			local193 = ((float) this.aShort56 + local170) * (float) this.aClass44_Sub3_18.anInt5493;
		} else {
			local193 = ((float) this.aShort56 + local178) * (float) this.aClass44_Sub3_18.anInt5493;
			local204 = (local170 - (float) this.aShort56) * (float) this.aClass44_Sub3_18.anInt5493;
		}
		if (this.aClass44_Sub3_18.aFloat165 <= local204 / (float) arg2 || this.aClass44_Sub3_18.aFloat177 >= local193 / (float) arg2) {
			return;
		}
		Static300.aFloat191 = local13.aFloat29 * local22.aFloat22 + local22.aFloat20 * local13.aFloat20 + local13.aFloat31 * local22.aFloat25;
		Static185.aFloat124 = local22.aFloat24 * local13.aFloat20 + local13.aFloat31 * local22.aFloat26 + local13.aFloat29 * local22.aFloat32 + local13.aFloat24;
		@Pc(295) float local295 = Static300.aFloat191 * (float) this.aShort53 + Static185.aFloat124;
		@Pc(303) float local303 = Static300.aFloat191 * (float) this.aShort48 + Static185.aFloat124;
		@Pc(318) float local318;
		@Pc(329) float local329;
		if (local303 < local295) {
			local329 = ((float) this.aShort56 + local295) * (float) this.aClass44_Sub3_18.anInt5500;
			local318 = ((float) -this.aShort56 + local303) * (float) this.aClass44_Sub3_18.anInt5500;
		} else {
			local318 = (float) this.aClass44_Sub3_18.anInt5500 * (local295 - (float) this.aShort56);
			local329 = ((float) this.aShort56 + local303) * (float) this.aClass44_Sub3_18.anInt5500;
		}
		if (this.aClass44_Sub3_18.aFloat179 <= local318 / (float) arg2 || local329 / (float) arg2 <= this.aClass44_Sub3_18.aFloat161) {
			return;
		}
		if (arg1 != null || this.aClass331Array1 != null) {
			Static251.aFloat136 = local13.aFloat29 * local22.aFloat27 + local13.aFloat31 * local22.aFloat30 + local13.aFloat20 * local22.aFloat29;
			Static56.aFloat33 = local22.aFloat21 * local13.aFloat27 + local22.aFloat23 * local13.aFloat21 + local22.aFloat31 * local13.aFloat22;
			Static298.aFloat189 = local13.aFloat30 * local22.aFloat21 + local22.aFloat23 * local13.aFloat23 + local22.aFloat31 * local13.aFloat25;
			Static163.aFloat117 = local13.aFloat20 * local22.aFloat31 + local22.aFloat23 * local13.aFloat31 + local22.aFloat21 * local13.aFloat29;
			Static110.aFloat92 = local13.aFloat22 * local22.aFloat29 + local13.aFloat21 * local22.aFloat30 + local13.aFloat27 * local22.aFloat27;
			Static281.aFloat185 = local13.aFloat25 * local22.aFloat29 + local13.aFloat23 * local22.aFloat30 + local22.aFloat27 * local13.aFloat30;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.aShort57 + this.aShort49 >> 1;
			@Pc(506) int local506 = this.aShort54 + this.aShort50 >> 1;
			@Pc(525) int local525 = (int) ((float) this.aShort53 * Static194.aFloat126 + Static185.aFloat123 + Static298.aFloat189 * (float) local498 + Static281.aFloat185 * (float) local506);
			@Pc(544) int local544 = (int) (Static251.aFloat136 * (float) local506 + Static163.aFloat117 * (float) local498 + Static185.aFloat124 + (float) this.aShort53 * Static300.aFloat191);
			@Pc(563) int local563 = (int) (Static56.aFloat33 * (float) local498 + Static528.aFloat219 + (float) this.aShort53 * Static161.aFloat18 + Static110.aFloat92 * (float) local506);
			@Pc(582) int local582 = (int) ((float) local506 * Static281.aFloat185 + (float) this.aShort48 * Static194.aFloat126 + Static185.aFloat123 + (float) local498 * Static298.aFloat189);
			@Pc(601) int local601 = (int) (Static251.aFloat136 * (float) local506 + Static185.aFloat124 + Static163.aFloat117 * (float) local498 + (float) this.aShort48 * Static300.aFloat191);
			arg1.anInt6301 = this.aClass44_Sub3_18.anInt5494 + this.aClass44_Sub3_18.anInt5493 * local582 / arg2;
			arg1.anInt6299 = this.aClass44_Sub3_18.anInt5499 + local544 * this.aClass44_Sub3_18.anInt5500 / arg2;
			@Pc(647) int local647 = (int) ((float) local498 * Static56.aFloat33 + Static528.aFloat219 + Static161.aFloat18 * (float) this.aShort48 + (float) local506 * Static110.aFloat92);
			arg1.anInt6297 = this.aClass44_Sub3_18.anInt5494 + this.aClass44_Sub3_18.anInt5493 * local525 / arg2;
			arg1.anInt6300 = this.aClass44_Sub3_18.anInt5499 + local601 * this.aClass44_Sub3_18.anInt5500 / arg2;
			if (this.aClass44_Sub3_18.anInt5492 <= local563 || this.aClass44_Sub3_18.anInt5492 <= local647) {
				arg1.anInt6298 = this.aClass44_Sub3_18.anInt5493 * (local525 + this.aShort56) / arg2 + this.aClass44_Sub3_18.anInt5494 - arg1.anInt6297;
				arg1.aBoolean461 = true;
			}
		}
		this.aClass44_Sub3_18.method4629((float) arg2);
		this.aClass44_Sub3_18.method4644();
		this.aClass44_Sub3_18.method4610(local22);
		this.method3923();
		this.aClass44_Sub3_18.method4686();
		this.method3928();
	}

	@OriginalMember(owner = "client!ji", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface11 local9 = this.aClass44_Sub3_18.anInterface11_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4429; local11++) {
			if (arg0 == this.aShortArray54[local11]) {
				this.aShortArray54[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class14 local52 = local9.method7405(arg0 & 0xFFFF);
			local39 = local52.aByte7;
			local41 = local52.aByte8;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(72) Class14 local72 = local9.method7405(arg1 & 0xFFFF);
			local60 = local72.aByte7;
			local62 = local72.aByte8;
		}
		if (!(local39 != local60 | local41 != local62)) {
			return;
		}
		if (this.aClass331Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt4434; local97++) {
				@Pc(104) Class331 local104 = this.aClass331Array1[local97];
				@Pc(109) Class160 local109 = this.aClass160Array1[local97];
				local109.anInt4129 = Static15.anIntArray11[this.aShortArray50[local104.anInt9530] & 0xFFFF] & 0xFFFFFF | local109.anInt4129 & 0xFF000000;
			}
		}
		if (this.aClass284_5 != null) {
			this.aClass284_5.anInterface10_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(SIIBB)I")
	private int method3931(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(18) int local18 = Static15.anIntArray11[Static505.method7414(arg2, arg1)];
		if (arg0 != -1) {
			@Pc(31) Class14 local31 = this.aClass44_Sub3_18.anInterface11_11.method7405(arg0 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte7 & 0xFF;
			@Pc(48) int local48;
			@Pc(72) int local72;
			if (local36 != 0) {
				if (arg1 < 0) {
					local48 = 0;
				} else if (arg1 > 127) {
					local48 = 16777215;
				} else {
					local48 = arg1 * 131586;
				}
				if (local36 == 256) {
					local18 = local48;
				} else {
					local72 = 256 - local36;
					local18 = ((local18 & 0xFF00) * local72 + (local48 & 0xFF00) * local36 & 0xFF0000) + (local72 * (local18 & 0xFF00FF) + local36 * (local48 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local48 = local31.aByte8 & 0xFF;
			if (local48 != 0) {
				local48 += 256;
				@Pc(121) int local121 = local48 * (local18 >> 16 & 0xFF);
				if (local121 > 65535) {
					local121 = 65535;
				}
				local72 = (local18 >> 8 & 0xFF) * local48;
				if (local72 > 65535) {
					local72 = 65535;
				}
				@Pc(147) int local147 = local48 * (local18 & 0xFF);
				if (local147 > 65535) {
					local147 = 65535;
				}
				local18 = (local72 & 0xFF00) + ((local121 & 0x5400FF00) << 8) + (local147 >> 8);
			}
		}
		return (local18 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray31 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4419; local12++) {
			this.lb[local12] <<= 0x4;
			this.anIntArray225[local12] <<= 0x4;
			this.anIntArray226[local12] <<= 0x4;
		}
		Static586.anInt10150 = 0;
		Static182.anInt3641 = 0;
		Static39.anInt536 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
	private void method3932() {
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = 32767;
		@Pc(17) int local17 = 32767;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt4452; local29++) {
			@Pc(36) int local36 = this.lb[local29];
			@Pc(41) int local41 = this.anIntArray225[local29];
			@Pc(46) int local46 = this.anIntArray226[local29];
			if (local21 < local41) {
				local21 = local41;
			}
			if (local19 < local36) {
				local19 = local36;
			}
			if (local36 < local13) {
				local13 = local36;
			}
			if (local15 > local41) {
				local15 = local41;
			}
			if (local46 > local23) {
				local23 = local46;
			}
			if (local17 > local46) {
				local17 = local46;
			}
			@Pc(96) int local96 = local36 * local36 + local46 * local46;
			if (local96 > local25) {
				local25 = local96;
			}
			local96 = local41 * local41 + local46 * local46 + local36 * local36;
			if (local27 < local96) {
				local27 = local96;
			}
		}
		this.aShort57 = (short) local13;
		this.aShort54 = (short) local23;
		this.aShort49 = (short) local19;
		this.aShort53 = (short) local15;
		this.aShort48 = (short) local21;
		this.aShort50 = (short) local17;
		this.aShort56 = (short) (Math.sqrt((double) local25) + 0.99D);
		this.aShort52 = (short) (Math.sqrt((double) local27) + 0.99D);
		this.aBoolean321 = true;
	}

	@OriginalMember(owner = "client!ji", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.anInt4460 = arg0;
		if (this.aClass49_1 != null && (this.anInt4460 & 0x10000) == 0) {
			this.aShortArray55 = this.aClass49_1.aShortArray12;
			this.aShortArray48 = this.aClass49_1.aShortArray14;
			this.aShortArray46 = this.aClass49_1.aShortArray13;
			this.aByteArray55 = this.aClass49_1.aByteArray11;
			this.aClass49_1 = null;
		}
		this.aBoolean323 = true;
		this.method3927();
	}

	@OriginalMember(owner = "client!ji", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort55;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)V")
	private void method3933(@OriginalArg(0) boolean arg0) {
		if (this.aClass44_Sub3_18.aClass4_Sub11_Sub2_2.aByteArray68.length < this.anInt4470 * 6) {
			this.aClass44_Sub3_18.aClass4_Sub11_Sub2_2 = new Class4_Sub11_Sub2(this.anInt4470 * 6 + 600);
		} else {
			this.aClass44_Sub3_18.aClass4_Sub11_Sub2_2.anInt5831 = 0;
		}
		@Pc(38) Class4_Sub11_Sub2 local38 = this.aClass44_Sub3_18.aClass4_Sub11_Sub2_2;
		@Pc(44) int local44;
		if (this.aClass44_Sub3_18.aBoolean399) {
			for (local44 = 0; local44 < this.anInt4470; local44++) {
				local38.method4937(this.aShortArray51[local44]);
				local38.method4937(this.aShortArray47[local44]);
				local38.method4937(this.aShortArray53[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt4470; local44++) {
				local38.method4912(this.aShortArray51[local44]);
				local38.method4912(this.aShortArray47[local44]);
				local38.method4912(this.aShortArray53[local44]);
			}
		}
		if (local38.anInt5831 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface22_1 == null) {
				this.anInterface22_1 = this.aClass44_Sub3_18.method4653(local38.aByteArray68, true, local38.anInt5831);
			} else {
				this.anInterface22_1.method7399(local38.aByteArray68, local38.anInt5831);
			}
			this.aClass291_1.anInterface22_5 = this.anInterface22_1;
		} else {
			this.aClass291_1.anInterface22_5 = this.aClass44_Sub3_18.method4653(local38.aByteArray68, false, local38.anInt5831);
		}
		if (!arg0) {
			this.aBoolean323 = true;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class57 method7912(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class57_Sub2 local18;
		@Pc(14) Class57_Sub2 local14;
		if (arg0 == 1) {
			local14 = this.aClass44_Sub3_18.aClass57_Sub2_5;
			local18 = this.aClass44_Sub3_18.aClass57_Sub2_3;
		} else if (arg0 == 2) {
			local14 = this.aClass44_Sub3_18.aClass57_Sub2_6;
			local18 = this.aClass44_Sub3_18.aClass57_Sub2_7;
		} else if (arg0 == 3) {
			local14 = this.aClass44_Sub3_18.aClass57_Sub2_2;
			local18 = this.aClass44_Sub3_18.aClass57_Sub2_1;
		} else if (arg0 == 4) {
			local14 = this.aClass44_Sub3_18.aClass57_Sub2_4;
			local18 = this.aClass44_Sub3_18.aClass57_Sub2_8;
		} else if (arg0 == 5) {
			local18 = this.aClass44_Sub3_18.aClass57_Sub2_10;
			local14 = this.aClass44_Sub3_18.aClass57_Sub2_9;
		} else {
			local18 = local14 = new Class57_Sub2(this.aClass44_Sub3_18);
		}
		return this.method3921(arg0 != 0, local14, arg2, local18, arg1);
	}

	@OriginalMember(owner = "client!ji", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean321) {
			this.method3932();
		}
		return this.aShort54;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "()V")
	@Override
	protected void method7911() {
	}

	@OriginalMember(owner = "client!ji", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub27.anIntArray296[arg0];
		@Pc(13) int local13 = Class4_Sub27.anIntArray297[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4452; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray225[local15] + local13 * this.lb[local15] >> 14;
			this.anIntArray225[local15] = this.anIntArray225[local15] * local13 - this.lb[local15] * local9 >> 14;
			this.lb[local15] = local34;
		}
		if (this.aClass284_7 != null) {
			this.aClass284_7.anInterface10_6 = null;
		}
		this.aBoolean321 = false;
	}
}
