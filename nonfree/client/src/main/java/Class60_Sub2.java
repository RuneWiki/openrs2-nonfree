import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class60_Sub2 extends Class60 {

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "[F")
	private float[] aFloatArray48;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "[Lclient!rf;")
	private Class287[] aClass287Array1;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "[F")
	private float[] aFloatArray49;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!jg", name = "Q", descriptor = "Lclient!cn;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!jg", name = "ab", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!jg", name = "mb", descriptor = "I")
	private int anInt4399;

	@OriginalMember(owner = "client!jg", name = "nb", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!jg", name = "rb", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!jg", name = "sb", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!jg", name = "tb", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!jg", name = "vb", descriptor = "Lclient!ut;")
	private Interface21 anInterface21_3;

	@OriginalMember(owner = "client!jg", name = "wb", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!jg", name = "zb", descriptor = "[[I")
	private int[][] anIntArrayArray99;

	@OriginalMember(owner = "client!jg", name = "Ab", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!jg", name = "Cb", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!jg", name = "Db", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!jg", name = "Fb", descriptor = "[Lclient!tg;")
	private Class324[] aClass324Array1;

	@OriginalMember(owner = "client!jg", name = "Hb", descriptor = "I")
	private int anInt4408;

	@OriginalMember(owner = "client!jg", name = "Kb", descriptor = "[[I")
	private int[][] anIntArrayArray100;

	@OriginalMember(owner = "client!jg", name = "Mb", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!jg", name = "Nb", descriptor = "I")
	private int anInt4412;

	@OriginalMember(owner = "client!jg", name = "Pb", descriptor = "[[I")
	private int[][] anIntArrayArray101;

	@OriginalMember(owner = "client!jg", name = "Qb", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!jg", name = "Vb", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!jg", name = "Wb", descriptor = "[Lclient!qr;")
	private Class281[] aClass281Array3;

	@OriginalMember(owner = "client!jg", name = "Xb", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!jg", name = "Yb", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!jg", name = "ac", descriptor = "Lclient!hw;")
	private Class139 aClass139_1;

	@OriginalMember(owner = "client!jg", name = "ic", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!jg", name = "lc", descriptor = "B")
	private byte aByte56;

	@OriginalMember(owner = "client!jg", name = "mc", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!jg", name = "nc", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!jg", name = "pc", descriptor = "[Lclient!ow;")
	private Class248[] aClass248Array3;

	@OriginalMember(owner = "client!jg", name = "rc", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!jg", name = "uc", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!jg", name = "vc", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
	private int anInt4368 = 0;

	@OriginalMember(owner = "client!jg", name = "ob", descriptor = "I")
	private int anInt4400 = 0;

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
	private int anInt4372 = 0;

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "Z")
	private boolean aBoolean328 = true;

	@OriginalMember(owner = "client!jg", name = "gc", descriptor = "I")
	private int anInt4423 = 0;

	@OriginalMember(owner = "client!jg", name = "oc", descriptor = "I")
	private int anInt4427 = 0;

	@OriginalMember(owner = "client!jg", name = "Bb", descriptor = "Z")
	private boolean aBoolean329 = false;

	@OriginalMember(owner = "client!jg", name = "xc", descriptor = "Z")
	private boolean aBoolean330 = false;

	@OriginalMember(owner = "client!jg", name = "U", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_28;

	@OriginalMember(owner = "client!jg", name = "kb", descriptor = "Lclient!hea;")
	private Class126 aClass126_7;

	@OriginalMember(owner = "client!jg", name = "bc", descriptor = "Lclient!hea;")
	private Class126 aClass126_8;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "Lclient!hea;")
	private Class126 aClass126_5;

	@OriginalMember(owner = "client!jg", name = "eb", descriptor = "Lclient!hea;")
	private Class126 aClass126_6;

	@OriginalMember(owner = "client!jg", name = "jb", descriptor = "Lclient!dr;")
	private Class74 aClass74_1;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class60_Sub2(@OriginalArg(0) Class45_Sub3 arg0) {
		this.aClass45_Sub3_28 = arg0;
		this.aClass126_7 = new Class126(null, 5126, 3, 0);
		this.aClass126_8 = new Class126(null, 5126, 2, 0);
		this.aClass126_5 = new Class126(null, 5126, 3, 0);
		this.aClass126_6 = new Class126(null, 5121, 4, 0);
		this.aClass74_1 = new Class74();
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!vj;Lclient!ef;IIII)V")
	public Class60_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4412 = arg5;
		this.aClass45_Sub3_28 = arg0;
		this.anInt4408 = arg2;
		if (Static338.method4801(arg2, arg5)) {
			this.aClass126_7 = new Class126(null, 5126, 3, 0);
		}
		if (Static43.method703(arg5, arg2)) {
			this.aClass126_8 = new Class126(null, 5126, 2, 0);
		}
		if (Static574.method7711(arg5, arg2)) {
			this.aClass126_5 = new Class126(null, 5126, 3, 0);
		}
		if (Static317.method4652(arg2, arg5)) {
			this.aClass126_6 = new Class126(null, 5121, 4, 0);
		}
		if (Static142.method2761(arg2, arg5)) {
			this.aClass74_1 = new Class74();
		}
		@Pc(105) Interface3 local105 = arg0.anInterface3_12;
		@Pc(109) int[] local109 = new int[arg1.anInt2720];
		this.anIntArray236 = new int[arg1.anInt2719 + 1];
		for (@Pc(118) int local118 = 0; local118 < arg1.anInt2720; local118++) {
			if ((arg1.aByteArray25 == null || arg1.aByteArray25[local118] != 2) && (arg1.aShortArray25 == null || arg1.aShortArray25[local118] == -1 || !local105.method4776(arg1.aShortArray25[local118] & 0xFFFF).aBoolean142)) {
				local109[this.anInt4423++] = local118;
				this.anIntArray236[arg1.aShortArray26[local118]]++;
				this.anIntArray236[arg1.aShortArray27[local118]]++;
				this.anIntArray236[arg1.aShortArray32[local118]]++;
			}
		}
		this.anInt4372 = this.anInt4423;
		@Pc(207) long[] local207 = new long[this.anInt4423];
		@Pc(216) boolean local216 = (this.anInt4408 & 0x100) != 0;
		@Pc(228) int local228;
		@Pc(239) int local239;
		@Pc(372) int local372;
		label497: for (@Pc(218) int local218 = 0; local218 < this.anInt4423; local218++) {
			@Pc(224) int local224 = local109[local218];
			@Pc(226) Class55 local226 = null;
			local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			@Pc(234) byte local234 = 0;
			if (arg1.aClass168Array1 != null) {
				for (local239 = 0; local239 < arg1.aClass168Array1.length; local239++) {
					@Pc(246) Class168 local246 = arg1.aClass168Array1[local239];
					if (local246.anInt4620 == local224) {
						@Pc(255) Class31 local255 = Static14.method211(local246.anInt4622);
						if (local255.aBoolean73) {
							local207[local218] = Long.MAX_VALUE;
							this.anInt4372--;
							continue label497;
						}
					}
				}
			}
			@Pc(282) short local282 = -1;
			if (arg1.aShortArray25 != null) {
				local282 = arg1.aShortArray25[local224];
				if (local282 != -1) {
					local226 = local105.method4776(local282 & 0xFFFF);
					local234 = local226.aByte20;
					local232 = local226.aByte16;
				}
			}
			@Pc(334) boolean local334 = arg1.aByteArray29 != null && arg1.aByteArray29[local224] != 0 || local226 != null && local226.aBoolean140 | !local226.aBoolean139;
			if ((local216 || local334) && arg1.aByteArray26 != null) {
				local228 += arg1.aByteArray26[local224] << 17;
			}
			if (local334) {
				local228 += 65536;
			}
			local228 += (local232 & 0xFF) << 8;
			local372 = local230 + ((local282 & 0xFFFF) << 16);
			local228 += local234 & 0xFF;
			@Pc(384) int local384 = local372 + (local218 & 0xFFFF);
			local207[local218] = (long) local384 + ((long) local228 << 32);
			this.aBoolean329 |= local334;
		}
		Static38.method624(local207, local109);
		this.anIntArray237 = arg1.anIntArray113;
		this.anInt4427 = arg1.anInt2728;
		this.anInt4368 = arg1.anInt2719;
		this.anIntArray233 = arg1.anIntArray115;
		this.anIntArray235 = arg1.anIntArray111;
		this.aShortArray75 = arg1.aShortArray31;
		@Pc(441) Class265[] local441 = new Class265[this.anInt4368];
		this.aClass281Array3 = arg1.aClass281Array2;
		this.aClass248Array3 = arg1.aClass248Array2;
		@Pc(469) int local469;
		@Pc(483) int local483;
		if (arg1.aClass168Array1 != null) {
			this.anInt4399 = arg1.aClass168Array1.length;
			this.aClass324Array1 = new Class324[this.anInt4399];
			this.aClass287Array1 = new Class287[this.anInt4399];
			for (local469 = 0; local469 < this.anInt4399; local469++) {
				@Pc(476) Class168 local476 = arg1.aClass168Array1[local469];
				@Pc(481) Class31 local481 = Static14.method211(local476.anInt4622);
				local483 = -1;
				for (@Pc(485) int local485 = 0; local485 < this.anInt4423; local485++) {
					if (local109[local485] == local476.anInt4620) {
						local483 = local485;
						break;
					}
				}
				if (local483 == -1) {
					throw new RuntimeException();
				}
				local239 = Static214.anIntArray203[arg1.aShortArray29[local476.anInt4620] & 0xFFFF] & 0xFFFFFF;
				local239 |= 255 - (arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local476.anInt4620]) << 24;
				this.aClass324Array1[local469] = new Class324(local483, arg1.aShortArray26[local476.anInt4620], arg1.aShortArray27[local476.anInt4620], arg1.aShortArray32[local476.anInt4620], local481.anInt751, local481.anInt746, local481.anInt752, local481.anInt741, local481.anInt743, local481.aBoolean73, local481.aBoolean74, local476.anInt4625);
				this.aClass287Array1[local469] = new Class287(local239);
			}
		}
		local469 = this.anInt4423 * 3;
		this.aShortArray70 = new short[this.anInt4423];
		this.aShortArray68 = new short[this.anInt4423];
		if (arg1.aShortArray30 != null) {
			this.aShortArray71 = new short[this.anInt4423];
		}
		this.aFloatArray48 = new float[local469];
		this.aShortArray67 = new short[this.anInt4423];
		this.aShort67 = (short) arg3;
		Static191.aLongArray7 = new long[local469];
		this.aFloatArray49 = new float[local469];
		this.aByteArray53 = new byte[this.anInt4423];
		this.aShortArray77 = new short[local469];
		this.aByteArray54 = new byte[local469];
		this.aShortArray73 = new short[this.anInt4423];
		this.aShort75 = (short) arg4;
		this.aShortArray74 = new short[local469];
		this.aShortArray76 = new short[this.anInt4423];
		this.aShortArray72 = new short[local469];
		this.aShortArray69 = new short[local469];
		local228 = 0;
		for (local372 = 0; local372 < arg1.anInt2719; local372++) {
			local483 = this.anIntArray236[local372];
			this.anIntArray236[local372] = local228;
			local228 += local483;
			local441[local372] = new Class265();
		}
		this.anIntArray236[arg1.anInt2719] = local228;
		@Pc(720) int[] local720 = null;
		@Pc(722) int[] local722 = null;
		@Pc(724) int[] local724 = null;
		@Pc(726) float[][] local726 = null;
		@Pc(752) int local752;
		@Pc(791) int local791;
		@Pc(797) int local797;
		@Pc(811) int local811;
		@Pc(813) int local813;
		@Pc(847) int local847;
		@Pc(852) int local852;
		@Pc(1003) float local1003;
		@Pc(1011) float local1011;
		@Pc(1019) float local1019;
		if (arg1.aByteArray27 != null) {
			@Pc(732) int local732 = arg1.anInt2716;
			@Pc(735) int[] local735 = new int[local732];
			@Pc(738) int[] local738 = new int[local732];
			@Pc(741) int[] local741 = new int[local732];
			@Pc(744) int[] local744 = new int[local732];
			@Pc(747) int[] local747 = new int[local732];
			@Pc(750) int[] local750 = new int[local732];
			for (local752 = 0; local752 < local732; local752++) {
				local735[local752] = Integer.MAX_VALUE;
				local738[local752] = -2147483647;
				local741[local752] = Integer.MAX_VALUE;
				local744[local752] = -2147483647;
				local747[local752] = Integer.MAX_VALUE;
				local750[local752] = -2147483647;
			}
			local724 = new int[local732];
			for (local791 = 0; local791 < this.anInt4423; local791++) {
				local797 = local109[local791];
				if (arg1.aByteArray27[local797] != -1) {
					local811 = arg1.aByteArray27[local797] & 0xFF;
					for (local813 = 0; local813 < 3; local813++) {
						@Pc(825) short local825;
						if (local813 == 0) {
							local825 = arg1.aShortArray26[local797];
						} else if (local813 == 1) {
							local825 = arg1.aShortArray27[local797];
						} else {
							local825 = arg1.aShortArray32[local797];
						}
						local847 = arg1.anIntArray111[local825];
						local852 = arg1.anIntArray113[local825];
						@Pc(857) int local857 = arg1.anIntArray115[local825];
						if (local847 < local735[local811]) {
							local735[local811] = local847;
						}
						if (local847 > local738[local811]) {
							local738[local811] = local847;
						}
						if (local852 < local741[local811]) {
							local741[local811] = local852;
						}
						if (local744[local811] < local852) {
							local744[local811] = local852;
						}
						if (local857 < local747[local811]) {
							local747[local811] = local857;
						}
						if (local857 > local750[local811]) {
							local750[local811] = local857;
						}
					}
				}
			}
			local722 = new int[local732];
			local720 = new int[local732];
			local726 = new float[local732][];
			for (local797 = 0; local797 < local732; local797++) {
				@Pc(946) byte local946 = arg1.aByteArray31[local797];
				if (local946 > 0) {
					local720[local797] = (local735[local797] + local738[local797]) / 2;
					local722[local797] = (local744[local797] + local741[local797]) / 2;
					local724[local797] = (local750[local797] + local747[local797]) / 2;
					if (local946 == 1) {
						local852 = arg1.anIntArray119[local797];
						if (local852 == 0) {
							local1003 = 1.0F;
							local1011 = 1.0F;
						} else if (local852 <= 0) {
							local1011 = 1.0F;
							local1003 = (float) -local852 / 1024.0F;
						} else {
							local1003 = 1.0F;
							local1011 = (float) local852 / 1024.0F;
						}
						local1019 = 64.0F / (float) arg1.anIntArray117[local797];
					} else if (local946 == 2) {
						local1011 = 64.0F / (float) arg1.anIntArray116[local797];
						local1003 = 64.0F / (float) arg1.anIntArray119[local797];
						local1019 = 64.0F / (float) arg1.anIntArray117[local797];
					} else {
						local1003 = (float) arg1.anIntArray119[local797] / 1024.0F;
						local1011 = (float) arg1.anIntArray116[local797] / 1024.0F;
						local1019 = (float) arg1.anIntArray117[local797] / 1024.0F;
					}
					local726[local797] = Static4.method7341(arg1.aShortArray33[local797], arg1.aShortArray28[local797], arg1.aByteArray28[local797] & 0xFF, local1011, arg1.aShortArray34[local797], local1019, local1003);
				}
			}
		}
		@Pc(1124) Class19[] local1124 = new Class19[arg1.anInt2720];
		@Pc(1143) short local1143;
		@Pc(1154) int local1154;
		@Pc(1165) int local1165;
		@Pc(1225) int local1225;
		for (@Pc(1126) int local1126 = 0; local1126 < arg1.anInt2720; local1126++) {
			@Pc(1133) short local1133 = arg1.aShortArray26[local1126];
			@Pc(1138) short local1138 = arg1.aShortArray27[local1126];
			local1143 = arg1.aShortArray32[local1126];
			local1154 = this.anIntArray235[local1138] - this.anIntArray235[local1133];
			local1165 = this.anIntArray237[local1138] - this.anIntArray237[local1133];
			local752 = this.anIntArray233[local1138] - this.anIntArray233[local1133];
			local791 = this.anIntArray235[local1143] - this.anIntArray235[local1133];
			local797 = this.anIntArray237[local1143] - this.anIntArray237[local1133];
			local811 = this.anIntArray233[local1143] - this.anIntArray233[local1133];
			local813 = local811 * local1165 - local797 * local752;
			local1225 = local791 * local752 - local1154 * local811;
			local847 = local1154 * local797 - local791 * local1165;
			while (local813 > 8192 || local1225 > 8192 || local847 > 8192 || local813 < -8192 || local1225 < -8192 || local847 < -8192) {
				local1225 >>= 0x1;
				local847 >>= 0x1;
				local813 >>= 0x1;
			}
			local852 = (int) Math.sqrt((double) (local847 * local847 + local1225 * local1225 + local813 * local813));
			if (local852 <= 0) {
				local852 = 1;
			}
			local1225 = local1225 * 256 / local852;
			local847 = local847 * 256 / local852;
			local813 = local813 * 256 / local852;
			@Pc(1320) byte local1320 = arg1.aByteArray25 == null ? 0 : arg1.aByteArray25[local1126];
			if (local1320 == 0) {
				@Pc(1351) Class265 local1351 = local441[local1133];
				local1351.anInt7199 += local847;
				local1351.anInt7201++;
				local1351.anInt7198 += local1225;
				local1351.anInt7200 += local813;
				@Pc(1379) Class265 local1379 = local441[local1138];
				local1379.anInt7198 += local1225;
				local1379.anInt7199 += local847;
				local1379.anInt7200 += local813;
				local1379.anInt7201++;
				@Pc(1407) Class265 local1407 = local441[local1143];
				local1407.anInt7199 += local847;
				local1407.anInt7198 += local1225;
				local1407.anInt7200 += local813;
				local1407.anInt7201++;
			} else if (local1320 == 1) {
				@Pc(1336) Class19 local1336 = local1124[local1126] = new Class19();
				local1336.anInt347 = local1225;
				local1336.anInt348 = local813;
				local1336.anInt350 = local847;
			}
		}
		@Pc(1444) int local1444;
		for (@Pc(1438) int local1438 = 0; local1438 < this.anInt4423; local1438++) {
			local1444 = local109[local1438];
			@Pc(1451) int local1451 = arg1.aShortArray29[local1444] & 0xFFFF;
			@Pc(1456) short local1456;
			if (arg1.aShortArray25 == null) {
				local1456 = -1;
			} else {
				local1456 = arg1.aShortArray25[local1444];
			}
			if (arg1.aByteArray27 == null) {
				local1165 = -1;
			} else {
				local1165 = arg1.aByteArray27[local1444];
			}
			if (arg1.aByteArray29 == null) {
				local752 = 0;
			} else {
				local752 = arg1.aByteArray29[local1444] & 0xFF;
			}
			@Pc(1491) float local1491 = 0.0F;
			@Pc(1493) float local1493 = 0.0F;
			@Pc(1495) float local1495 = 0.0F;
			local1003 = 0.0F;
			local1019 = 0.0F;
			local1011 = 0.0F;
			@Pc(1503) byte local1503 = 0;
			@Pc(1505) byte local1505 = 0;
			@Pc(1507) int local1507 = 0;
			@Pc(1523) byte local1523;
			@Pc(1540) short local1540;
			@Pc(1545) short local1545;
			@Pc(1550) short local1550;
			if (local1456 != -1) {
				if (local1165 == -1) {
					local1503 = 1;
					local1495 = 1.0F;
					local1003 = 1.0F;
					local1505 = 2;
					local1011 = 0.0F;
					local1493 = 1.0F;
					local1491 = 0.0F;
					local1019 = 0.0F;
				} else {
					local1165 &= 0xFF;
					local1523 = arg1.aByteArray31[local1165];
					@Pc(1530) short local1530;
					@Pc(1535) short local1535;
					@Pc(1573) float local1573;
					@Pc(1581) float local1581;
					@Pc(1590) float local1590;
					@Pc(1673) float local1673;
					@Pc(1681) float local1681;
					@Pc(1690) float local1690;
					@Pc(1698) float local1698;
					@Pc(1706) float local1706;
					@Pc(1715) float local1715;
					if (local1523 == 0) {
						local1530 = arg1.aShortArray26[local1444];
						local1535 = arg1.aShortArray27[local1444];
						local1540 = arg1.aShortArray32[local1444];
						local1545 = arg1.aShortArray34[local1165];
						local1550 = arg1.aShortArray28[local1165];
						@Pc(1555) short local1555 = arg1.aShortArray33[local1165];
						@Pc(1561) float local1561 = (float) arg1.anIntArray111[local1545];
						@Pc(1567) float local1567 = (float) arg1.anIntArray113[local1545];
						local1573 = arg1.anIntArray115[local1545];
						local1581 = (float) arg1.anIntArray111[local1550] - local1561;
						local1590 = (float) arg1.anIntArray113[local1550] - local1567;
						@Pc(1598) float local1598 = (float) arg1.anIntArray115[local1550] - local1573;
						@Pc(1607) float local1607 = (float) arg1.anIntArray111[local1555] - local1561;
						@Pc(1616) float local1616 = (float) arg1.anIntArray113[local1555] - local1567;
						@Pc(1624) float local1624 = (float) arg1.anIntArray115[local1555] - local1573;
						@Pc(1632) float local1632 = (float) arg1.anIntArray111[local1530] - local1561;
						@Pc(1640) float local1640 = (float) arg1.anIntArray113[local1530] - local1567;
						@Pc(1648) float local1648 = (float) arg1.anIntArray115[local1530] - local1573;
						@Pc(1656) float local1656 = (float) arg1.anIntArray111[local1535] - local1561;
						@Pc(1665) float local1665 = (float) arg1.anIntArray113[local1535] - local1567;
						local1673 = (float) arg1.anIntArray115[local1535] - local1573;
						local1681 = (float) arg1.anIntArray111[local1540] - local1561;
						local1690 = (float) arg1.anIntArray113[local1540] - local1567;
						local1698 = (float) arg1.anIntArray115[local1540] - local1573;
						local1706 = local1590 * local1624 - local1598 * local1616;
						local1715 = local1607 * local1598 - local1581 * local1624;
						@Pc(1724) float local1724 = local1581 * local1616 - local1590 * local1607;
						@Pc(1732) float local1732 = local1724 * local1616 - local1624 * local1715;
						@Pc(1740) float local1740 = local1624 * local1706 - local1607 * local1724;
						@Pc(1749) float local1749 = local1607 * local1715 - local1706 * local1616;
						@Pc(1763) float local1763 = 1.0F / (local1590 * local1740 + local1732 * local1581 + local1598 * local1749);
						local1495 = (local1656 * local1732 + local1740 * local1665 + local1673 * local1749) * local1763;
						local1019 = local1763 * (local1749 * local1698 + local1732 * local1681 + local1740 * local1690);
						local1491 = (local1648 * local1749 + local1640 * local1740 + local1732 * local1632) * local1763;
						@Pc(1814) float local1814 = local1581 * local1715 - local1590 * local1706;
						@Pc(1823) float local1823 = local1724 * local1590 - local1715 * local1598;
						@Pc(1832) float local1832 = local1706 * local1598 - local1581 * local1724;
						@Pc(1846) float local1846 = 1.0F / (local1616 * local1832 + local1607 * local1823 + local1814 * local1624);
						local1493 = (local1648 * local1814 + local1823 * local1632 + local1640 * local1832) * local1846;
						local1011 = (local1698 * local1814 + local1690 * local1832 + local1823 * local1681) * local1846;
						local1003 = (local1673 * local1814 + local1656 * local1823 + local1832 * local1665) * local1846;
					} else {
						local1530 = arg1.aShortArray26[local1444];
						local1535 = arg1.aShortArray27[local1444];
						local1540 = arg1.aShortArray32[local1444];
						@Pc(1909) int local1909 = local720[local1165];
						@Pc(1913) int local1913 = local722[local1165];
						@Pc(1917) int local1917 = local724[local1165];
						@Pc(1921) float[] local1921 = local726[local1165];
						@Pc(1926) byte local1926 = arg1.aByteArray30[local1165];
						local1573 = (float) arg1.anIntArray118[local1165] / 256.0F;
						if (local1523 == 1) {
							local1581 = (float) arg1.anIntArray116[local1165] / 1024.0F;
							Static73.method1567(arg1.anIntArray115[local1530], arg1.anIntArray113[local1530], local1921, local1581, local1926, arg1.anIntArray111[local1530], local1913, local1917, local1909, local1573);
							local1491 = Static237.aFloat99;
							local1493 = Static196.aFloat202;
							Static73.method1567(arg1.anIntArray115[local1535], arg1.anIntArray113[local1535], local1921, local1581, local1926, arg1.anIntArray111[local1535], local1913, local1917, local1909, local1573);
							local1003 = Static196.aFloat202;
							local1495 = Static237.aFloat99;
							Static73.method1567(arg1.anIntArray115[local1540], arg1.anIntArray113[local1540], local1921, local1581, local1926, arg1.anIntArray111[local1540], local1913, local1917, local1909, local1573);
							local1019 = Static237.aFloat99;
							local1011 = Static196.aFloat202;
							local1590 = local1581 / 2.0F;
							if ((local1926 & 0x1) == 0) {
								if (local1590 < local1019 - local1491) {
									local1019 -= local1581;
									local1505 = 1;
								} else if (local1491 - local1019 > local1590) {
									local1019 += local1581;
									local1505 = 2;
								}
								if (local1495 - local1491 > local1590) {
									local1503 = 1;
									local1495 -= local1581;
								} else if (local1590 < local1491 - local1495) {
									local1495 += local1581;
									local1503 = 2;
								}
							} else {
								if (local1003 - local1493 > local1590) {
									local1503 = 1;
									local1003 -= local1581;
								} else if (local1590 < local1493 - local1003) {
									local1003 += local1581;
									local1503 = 2;
								}
								if (local1590 < local1011 - local1493) {
									local1011 -= local1581;
									local1505 = 1;
								} else if (local1493 - local1011 > local1590) {
									local1505 = 2;
									local1011 += local1581;
								}
							}
						} else if (local1523 == 2) {
							local1581 = (float) arg1.anIntArray112[local1165] / 256.0F;
							local1590 = (float) arg1.anIntArray114[local1165] / 256.0F;
							@Pc(1967) int local1967 = arg1.anIntArray111[local1535] - arg1.anIntArray111[local1530];
							@Pc(1977) int local1977 = arg1.anIntArray113[local1535] - arg1.anIntArray113[local1530];
							@Pc(1988) int local1988 = arg1.anIntArray115[local1535] - arg1.anIntArray115[local1530];
							@Pc(1999) int local1999 = arg1.anIntArray111[local1540] - arg1.anIntArray111[local1530];
							@Pc(2009) int local2009 = arg1.anIntArray113[local1540] - arg1.anIntArray113[local1530];
							@Pc(2019) int local2019 = arg1.anIntArray115[local1540] - arg1.anIntArray115[local1530];
							@Pc(2028) int local2028 = local1977 * local2019 - local2009 * local1988;
							@Pc(2036) int local2036 = local1988 * local1999 - local1967 * local2019;
							@Pc(2044) int local2044 = local1967 * local2009 - local1977 * local1999;
							local1673 = 64.0F / (float) arg1.anIntArray119[local1165];
							local1681 = 64.0F / (float) arg1.anIntArray117[local1165];
							local1690 = 64.0F / (float) arg1.anIntArray116[local1165];
							local1698 = (local1921[2] * (float) local2044 + local1921[1] * (float) local2036 + (float) local2028 * local1921[0]) / local1673;
							local1706 = ((float) local2044 * local1921[5] + local1921[4] * (float) local2036 + (float) local2028 * local1921[3]) / local1681;
							local1715 = (local1921[7] * (float) local2036 + (float) local2028 * local1921[6] + (float) local2044 * local1921[8]) / local1690;
							local1507 = Static286.method4257(local1706, local1698, local1715);
							Static66.method1440(local1921, local1917, local1581, arg1.anIntArray111[local1530], local1909, local1913, arg1.anIntArray115[local1530], local1507, local1926, local1590, local1573, arg1.anIntArray113[local1530]);
							local1491 = Static141.aFloat85;
							local1493 = Static448.aFloat180;
							Static66.method1440(local1921, local1917, local1581, arg1.anIntArray111[local1535], local1909, local1913, arg1.anIntArray115[local1535], local1507, local1926, local1590, local1573, arg1.anIntArray113[local1535]);
							local1003 = Static448.aFloat180;
							local1495 = Static141.aFloat85;
							Static66.method1440(local1921, local1917, local1581, arg1.anIntArray111[local1540], local1909, local1913, arg1.anIntArray115[local1540], local1507, local1926, local1590, local1573, arg1.anIntArray113[local1540]);
							local1019 = Static141.aFloat85;
							local1011 = Static448.aFloat180;
						} else if (local1523 == 3) {
							Static12.method6300(local1909, local1917, arg1.anIntArray113[local1530], arg1.anIntArray115[local1530], local1913, arg1.anIntArray111[local1530], local1573, local1926, local1921);
							local1493 = Static452.aFloat144;
							local1491 = Static590.aFloat206;
							Static12.method6300(local1909, local1917, arg1.anIntArray113[local1535], arg1.anIntArray115[local1535], local1913, arg1.anIntArray111[local1535], local1573, local1926, local1921);
							local1495 = Static590.aFloat206;
							local1003 = Static452.aFloat144;
							Static12.method6300(local1909, local1917, arg1.anIntArray113[local1540], arg1.anIntArray115[local1540], local1913, arg1.anIntArray111[local1540], local1573, local1926, local1921);
							local1019 = Static590.aFloat206;
							local1011 = Static452.aFloat144;
							if ((local1926 & 0x1) == 0) {
								if (local1495 - local1491 > 0.5F) {
									local1495--;
									local1503 = 1;
								} else if (local1491 - local1495 > 0.5F) {
									local1503 = 2;
									local1495++;
								}
								if (local1019 - local1491 > 0.5F) {
									local1505 = 1;
									local1019--;
								} else if (local1491 - local1019 > 0.5F) {
									local1019++;
									local1505 = 2;
								}
							} else {
								if (local1003 - local1493 > 0.5F) {
									local1503 = 1;
									local1003--;
								} else if (local1493 - local1003 > 0.5F) {
									local1003++;
									local1503 = 2;
								}
								if (local1011 - local1493 > 0.5F) {
									local1505 = 1;
									local1011--;
								} else if (local1493 - local1011 > 0.5F) {
									local1011++;
									local1505 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray25 == null) {
				local1523 = 0;
			} else {
				local1523 = arg1.aByteArray25[local1444];
			}
			if (local1523 == 0) {
				@Pc(2805) long local2805 = (long) (local1165 << 2) + ((long) local752 + (long) (local1507 << 24) + (long) (local1451 << 8) << 32);
				local1540 = arg1.aShortArray26[local1444];
				local1545 = arg1.aShortArray27[local1444];
				local1550 = arg1.aShortArray32[local1444];
				@Pc(2824) Class265 local2824 = local441[local1540];
				this.aShortArray70[local1438] = this.method3841(arg1, local1491, local2824.anInt7200, local2824.anInt7199, local2805, local1493, local2824.anInt7198, local1540, local2824.anInt7201);
				@Pc(2848) Class265 local2848 = local441[local1545];
				this.aShortArray76[local1438] = this.method3841(arg1, local1495, local2848.anInt7200, local2848.anInt7199, (long) local1503 + local2805, local1003, local2848.anInt7198, local1545, local2848.anInt7201);
				@Pc(2875) Class265 local2875 = local441[local1550];
				this.aShortArray67[local1438] = this.method3841(arg1, local1019, local2875.anInt7200, local2875.anInt7199, (long) local1505 + local2805, local1011, local2875.anInt7198, local1550, local2875.anInt7201);
			} else if (local1523 == 1) {
				@Pc(2667) Class19 local2667 = local1124[local1444];
				@Pc(2711) long local2711 = (long) ((local2667.anInt350 + 256 << 22) + (local2667.anInt347 + 256 << 12) + (local2667.anInt348 <= 0 ? 2048 : 1024) + (local1165 << 2)) + ((long) local752 + (long) (local1507 << 24) + (long) (local1451 << 8) << 32);
				this.aShortArray70[local1438] = this.method3841(arg1, local1491, local2667.anInt348, local2667.anInt350, local2711, local1493, local2667.anInt347, arg1.aShortArray26[local1444], 0);
				this.aShortArray76[local1438] = this.method3841(arg1, local1495, local2667.anInt348, local2667.anInt350, (long) local1503 + local2711, local1003, local2667.anInt347, arg1.aShortArray27[local1444], 0);
				this.aShortArray67[local1438] = this.method3841(arg1, local1019, local2667.anInt348, local2667.anInt350, local2711 + (long) local1505, local1011, local2667.anInt347, arg1.aShortArray32[local1444], 0);
			}
			if (arg1.aShortArray25 == null) {
				this.aShortArray73[local1438] = -1;
			} else {
				this.aShortArray73[local1438] = arg1.aShortArray25[local1444];
			}
			if (arg1.aByteArray29 != null) {
				this.aByteArray53[local1438] = arg1.aByteArray29[local1444];
			}
			if (arg1.aShortArray30 != null) {
				this.aShortArray71[local1438] = arg1.aShortArray30[local1444];
			}
			this.aShortArray68[local1438] = arg1.aShortArray29[local1444];
		}
		local1444 = 0;
		local1143 = -10000;
		for (local1154 = 0; local1154 < this.anInt4372; local1154++) {
			@Pc(2964) short local2964 = this.aShortArray73[local1154];
			if (local1143 != local2964) {
				local1143 = local2964;
				local1444++;
			}
		}
		this.anIntArray234 = new int[local1444 + 1];
		local1444 = 0;
		local1143 = -10000;
		for (local1165 = 0; local1165 < this.anInt4372; local1165++) {
			@Pc(3002) short local3002 = this.aShortArray73[local1165];
			if (local3002 != local1143) {
				local1143 = local3002;
				this.anIntArray234[local1444++] = local1165;
			}
		}
		this.anIntArray234[local1444] = this.anInt4372;
		Static191.aLongArray7 = null;
		this.aShortArray77 = Static254.method3914(this.anInt4400, this.aShortArray77);
		this.aShortArray72 = Static254.method3914(this.anInt4400, this.aShortArray72);
		this.aShortArray74 = Static254.method3914(this.anInt4400, this.aShortArray74);
		this.aByteArray54 = Static324.method4690(this.aByteArray54, this.anInt4400);
		this.aFloatArray48 = Static77.method1597(this.aFloatArray48, this.anInt4400);
		this.aFloatArray49 = Static77.method1597(this.aFloatArray49, this.anInt4400);
		if (arg1.anIntArray109 != null && Static193.method3257(this.anInt4412, arg2)) {
			this.anIntArrayArray99 = arg1.method2444(false);
		}
		if (arg1.aClass168Array1 != null && Static165.method2986(arg2, this.anInt4412)) {
			this.anIntArrayArray100 = arg1.method2437();
		}
		if (arg1.anIntArray110 != null && Static452.method6286(this.anInt4412, arg2)) {
			local752 = 0;
			@Pc(3121) int[] local3121 = new int[256];
			for (local797 = 0; local797 < this.anInt4423; local797++) {
				local811 = arg1.anIntArray110[local109[local797]];
				if (local811 >= 0) {
					if (local811 > local752) {
						local752 = local811;
					}
					@Pc(3150) int local3150 = local3121[local811]++;
				}
			}
			this.anIntArrayArray101 = new int[local752 + 1][];
			for (local811 = 0; local811 <= local752; local811++) {
				this.anIntArrayArray101[local811] = new int[local3121[local811]];
				local3121[local811] = 0;
			}
			for (local813 = 0; local813 < this.anInt4423; local813++) {
				local1225 = arg1.anIntArray110[local109[local813]];
				if (local1225 >= 0) {
					this.anIntArrayArray101[local1225][local3121[local1225]++] = local813;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4423; local7++) {
			if (this.aShortArray68[local7] == arg0) {
				this.aShortArray68[local7] = arg1;
			}
		}
		if (this.aClass324Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt4399; local38++) {
				@Pc(45) Class324 local45 = this.aClass324Array1[local38];
				@Pc(50) Class287 local50 = this.aClass287Array1[local38];
				local50.anInt7689 = Static214.anIntArray203[this.aShortArray68[local45.anInt8247] & 0xFFFF] & 0xFFFFFF | local50.anInt7689 & 0xFF000000;
			}
		}
		if (this.aClass126_6 != null) {
			this.aClass126_6.anInterface21_2 = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	private void method3833() {
		if (!this.aBoolean328) {
			return;
		}
		this.aBoolean328 = false;
		if (this.aClass248Array3 == null && this.aClass281Array3 == null && this.aClass324Array1 == null) {
			if (this.anIntArray235 != null && !Static502.method6762(this.anInt4408, this.anInt4412)) {
				if (this.aClass126_7 != null && this.aClass126_7.anInterface21_2 == null) {
					this.aBoolean328 = true;
				} else {
					if (!this.aBoolean330) {
						this.method3836();
					}
					this.anIntArray235 = null;
				}
			}
			if (this.anIntArray237 != null && !Static215.method3458(this.anInt4408, this.anInt4412)) {
				if (this.aClass126_7 != null && this.aClass126_7.anInterface21_2 == null) {
					this.aBoolean328 = true;
				} else {
					if (!this.aBoolean330) {
						this.method3836();
					}
					this.anIntArray237 = null;
				}
			}
			if (this.anIntArray233 != null && !Static277.method4173(this.anInt4408, this.anInt4412)) {
				if (this.aClass126_7 != null && this.aClass126_7.anInterface21_2 == null) {
					this.aBoolean328 = true;
				} else {
					if (!this.aBoolean330) {
						this.method3836();
					}
					this.anIntArray233 = null;
				}
			}
		}
		if (this.aShortArray69 != null && this.anIntArray235 == null && this.anIntArray237 == null && this.anIntArray233 == null) {
			this.anIntArray236 = null;
			this.aShortArray69 = null;
		}
		if (this.aByteArray54 != null && !Static33.method542(this.anInt4412, this.anInt4408)) {
			if (this.aClass126_5 == null) {
				if (this.aClass126_6 != null && this.aClass126_6.anInterface21_2 == null) {
					this.aBoolean328 = true;
				} else {
					this.aShortArray77 = this.aShortArray72 = this.aShortArray74 = null;
					this.aByteArray54 = null;
				}
			} else if (this.aClass126_5.anInterface21_2 == null) {
				this.aBoolean328 = true;
			} else {
				this.aByteArray54 = null;
				this.aShortArray77 = this.aShortArray72 = this.aShortArray74 = null;
			}
		}
		if (this.aShortArray68 != null && !Static62.method1395(this.anInt4408, this.anInt4412)) {
			if (this.aClass126_6 != null && this.aClass126_6.anInterface21_2 == null) {
				this.aBoolean328 = true;
			} else {
				this.aShortArray68 = null;
			}
		}
		if (this.aByteArray53 != null && !Static191.method3236(this.anInt4408, this.anInt4412)) {
			if (this.aClass126_6 != null && this.aClass126_6.anInterface21_2 == null) {
				this.aBoolean328 = true;
			} else {
				this.aByteArray53 = null;
			}
		}
		if (this.aFloatArray48 != null && !Static429.method6066(this.anInt4408, this.anInt4412)) {
			if (this.aClass126_8 != null && this.aClass126_8.anInterface21_2 == null) {
				this.aBoolean328 = true;
			} else {
				this.aFloatArray48 = this.aFloatArray49 = null;
			}
		}
		if (this.aShortArray73 != null && !Static509.method6874(this.anInt4408, this.anInt4412)) {
			if (this.aClass126_6 != null && this.aClass126_6.anInterface21_2 == null) {
				this.aBoolean328 = true;
			} else {
				this.aShortArray73 = null;
			}
		}
		if (this.aShortArray70 != null && !Static190.method3221(this.anInt4408, this.anInt4412)) {
			if (this.aClass74_1 != null && this.aClass74_1.anInterface2_1 == null || this.aClass126_6 != null && this.aClass126_6.anInterface21_2 == null) {
				this.aBoolean328 = true;
			} else {
				this.aShortArray70 = this.aShortArray76 = this.aShortArray67 = null;
			}
		}
		if (this.anIntArrayArray101 != null && !Static452.method6286(this.anInt4412, this.anInt4408)) {
			this.anIntArrayArray101 = null;
			this.aShortArray71 = null;
		}
		if (this.anIntArrayArray99 != null && !Static193.method3257(this.anInt4412, this.anInt4408)) {
			this.aShortArray75 = null;
			this.anIntArrayArray99 = null;
		}
		if (this.anIntArrayArray100 != null && !Static165.method2986(this.anInt4408, this.anInt4412)) {
			this.anIntArrayArray100 = null;
		}
		if (this.anIntArray234 != null && (this.anInt4408 & 0x800) == 0 && (this.anInt4408 & 0x40000) == 0) {
			this.anIntArray234 = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			Static389.anInt409 = 0;
			Static525.anInt8434 = 0;
			Static585.anInt9432 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray99.length > local38) {
					local52 = this.anIntArrayArray99[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray75 == null || (this.aShortArray75[local60] & arg6) != 0) {
							Static585.anInt9432 += this.anIntArray235[local60];
							Static389.anInt409 += this.anIntArray237[local60];
							local30++;
							Static525.anInt8434 += this.anIntArray233[local60];
						}
					}
				}
			}
			if (local30 <= 0) {
				Static389.anInt409 = arg3;
				Static585.anInt9432 = arg2;
				Static525.anInt8434 = arg4;
			} else {
				Static389.anInt409 = arg3 + Static389.anInt409 / local30;
				Static585.anInt9432 = arg2 + Static585.anInt9432 / local30;
				Static525.anInt8434 = arg4 + Static525.anInt8434 / local30;
				Static121.aBoolean227 = true;
			}
			return;
		}
		@Pc(259) int[] local259;
		@Pc(261) int local261;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg7[1] * arg3 + arg2 * arg7[0] + arg4 * arg7[2] + 8192 >> 14;
				local32 = arg4 * arg7[5] + arg3 * arg7[4] + arg7[3] * arg2 + 8192 >> 14;
				local38 = arg7[6] * arg2 + arg3 * arg7[7] + arg4 * arg7[8] + 8192 >> 14;
				arg3 = local32;
				arg2 = local30;
				arg4 = local38;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray99.length > local32) {
					local259 = this.anIntArrayArray99[local32];
					for (local261 = 0; local261 < local259.length; local261++) {
						local54 = local259[local261];
						if (this.aShortArray75 == null || (arg6 & this.aShortArray75[local54]) != 0) {
							this.anIntArray235[local54] += arg2;
							this.anIntArray237[local54] += arg3;
							this.anIntArray233[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(403) int local403;
		@Pc(421) int local421;
		@Pc(650) int local650;
		@Pc(659) int local659;
		@Pc(668) int local668;
		@Pc(672) int local672;
		@Pc(690) int local690;
		@Pc(1028) int local1028;
		@Pc(1036) int local1036;
		@Pc(1191) int local1191;
		@Pc(1216) int local1216;
		@Pc(1220) int local1220;
		@Pc(1229) int local1229;
		@Pc(1234) int local1234;
		@Pc(1238) int local1238;
		@Pc(1242) int local1242;
		@Pc(1244) int local1244;
		@Pc(1380) int[] local1380;
		@Pc(1382) int local1382;
		@Pc(1386) int local1386;
		@Pc(1390) int local1390;
		@Pc(1392) int local1392;
		@Pc(1522) int local1522;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray99.length) {
						local259 = this.anIntArrayArray99[local32];
						for (local261 = 0; local261 < local259.length; local261++) {
							local54 = local259[local261];
							if (this.aShortArray75 == null || (arg6 & this.aShortArray75[local54]) != 0) {
								this.anIntArray235[local54] -= Static585.anInt9432;
								this.anIntArray237[local54] -= Static389.anInt409;
								this.anIntArray233[local54] -= Static525.anInt8434;
								if (arg4 != 0) {
									local60 = Class356.anIntArray597[arg4];
									local403 = Class356.anIntArray598[arg4];
									local421 = local60 * this.anIntArray237[local54] + this.anIntArray235[local54] * local403 + 16383 >> 14;
									this.anIntArray237[local54] = this.anIntArray237[local54] * local403 + 16383 - this.anIntArray235[local54] * local60 >> 14;
									this.anIntArray235[local54] = local421;
								}
								if (arg2 != 0) {
									local60 = Class356.anIntArray597[arg2];
									local403 = Class356.anIntArray598[arg2];
									local421 = local403 * this.anIntArray237[local54] + 16383 - this.anIntArray233[local54] * local60 >> 14;
									this.anIntArray233[local54] = local60 * this.anIntArray237[local54] + local403 * this.anIntArray233[local54] + 16383 >> 14;
									this.anIntArray237[local54] = local421;
								}
								if (arg3 != 0) {
									local60 = Class356.anIntArray597[arg3];
									local403 = Class356.anIntArray598[arg3];
									local421 = local403 * this.anIntArray235[local54] + local60 * this.anIntArray233[local54] + 16383 >> 14;
									this.anIntArray233[local54] = this.anIntArray233[local54] * local403 + 16383 - this.anIntArray235[local54] * local60 >> 14;
									this.anIntArray235[local54] = local421;
								}
								this.anIntArray235[local54] += Static585.anInt9432;
								this.anIntArray237[local54] += Static389.anInt409;
								this.anIntArray233[local54] += Static525.anInt8434;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray99.length) {
							local52 = this.anIntArrayArray99[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray75 == null || (arg6 & this.aShortArray75[local60]) != 0) {
									local403 = this.anIntArray236[local60];
									local421 = this.anIntArray236[local60 + 1];
									for (local650 = local403; local650 < local421; local650++) {
										local659 = this.aShortArray69[local650] - 1;
										if (local659 == -1) {
											break;
										}
										if (arg4 != 0) {
											local668 = Class356.anIntArray597[arg4];
											local672 = Class356.anIntArray598[arg4];
											local690 = local668 * this.aShortArray72[local659] + local672 * this.aShortArray77[local659] + 16383 >> 14;
											this.aShortArray72[local659] = (short) (local672 * this.aShortArray72[local659] + 16383 - this.aShortArray77[local659] * local668 >> 14);
											this.aShortArray77[local659] = (short) local690;
										}
										if (arg2 != 0) {
											local668 = Class356.anIntArray597[arg2];
											local672 = Class356.anIntArray598[arg2];
											local690 = this.aShortArray72[local659] * local672 + 16383 - local668 * this.aShortArray74[local659] >> 14;
											this.aShortArray74[local659] = (short) (local668 * this.aShortArray72[local659] + local672 * this.aShortArray74[local659] + 16383 >> 14);
											this.aShortArray72[local659] = (short) local690;
										}
										if (arg3 != 0) {
											local668 = Class356.anIntArray597[arg3];
											local672 = Class356.anIntArray598[arg3];
											local690 = this.aShortArray74[local659] * local668 + local672 * this.aShortArray77[local659] + 16383 >> 14;
											this.aShortArray74[local659] = (short) (local672 * this.aShortArray74[local659] + 16383 - this.aShortArray77[local659] * local668 >> 14);
											this.aShortArray77[local659] = (short) local690;
										}
									}
								}
							}
						}
					}
					if (this.aClass126_5 == null && this.aClass126_6 != null) {
						this.aClass126_6.anInterface21_2 = null;
					}
					if (this.aClass126_5 != null) {
						this.aClass126_5.anInterface21_2 = null;
						return;
					}
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local261 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static121.aBoolean227) {
					local403 = Static585.anInt9432 * arg7[0] + arg7[3] * Static389.anInt409 + Static525.anInt8434 * arg7[6] + 8192 >> 14;
					local421 = arg7[7] * Static525.anInt8434 + arg7[1] * Static585.anInt9432 + Static389.anInt409 * arg7[4] + 8192 >> 14;
					local421 += local54;
					local403 += local261;
					local650 = Static585.anInt9432 * arg7[2] + Static389.anInt409 * arg7[5] + arg7[8] * Static525.anInt8434 + 8192 >> 14;
					local650 += local60;
					Static389.anInt409 = local421;
					Static585.anInt9432 = local403;
					Static121.aBoolean227 = false;
					Static525.anInt8434 = local650;
				}
				@Pc(996) int[] local996 = new int[9];
				local421 = Class356.anIntArray598[arg2];
				local650 = Class356.anIntArray597[arg2];
				local659 = Class356.anIntArray598[arg3];
				local668 = Class356.anIntArray597[arg3];
				local672 = Class356.anIntArray598[arg4];
				local690 = Class356.anIntArray597[arg4];
				local1028 = local672 * local650 + 8192 >> 14;
				local1036 = local690 * local650 + 8192 >> 14;
				local996[5] = -local650;
				local996[0] = local659 * local672 + local1036 * local668 + 8192 >> 14;
				local996[8] = local421 * local659 + 8192 >> 14;
				local996[2] = local421 * local668 + 8192 >> 14;
				local996[7] = local1028 * local659 + local690 * local668 + 8192 >> 14;
				local996[4] = local421 * local672 + 8192 >> 14;
				local996[1] = local668 * local1028 + local690 * -local659 + 8192 >> 14;
				local996[6] = -local668 * local672 + local659 * local1036 + 8192 >> 14;
				local996[3] = local690 * local421 + 8192 >> 14;
				@Pc(1165) int local1165 = local996[2] * -Static525.anInt8434 + -Static585.anInt9432 * local996[0] + local996[1] * -Static389.anInt409 + 8192 >> 14;
				local1191 = -Static389.anInt409 * local996[4] + local996[3] * -Static585.anInt9432 + local996[5] * -Static525.anInt8434 + 8192 >> 14;
				local1216 = -Static585.anInt9432 * local996[6] + -Static389.anInt409 * local996[7] + -Static525.anInt8434 * local996[8] + 8192 >> 14;
				local1220 = local1165 + Static585.anInt9432;
				@Pc(1225) int local1225 = local1191 + Static389.anInt409;
				local1229 = Static525.anInt8434 + local1216;
				@Pc(1232) int[] local1232 = new int[9];
				for (local1234 = 0; local1234 < 3; local1234++) {
					for (local1238 = 0; local1238 < 3; local1238++) {
						local1242 = 0;
						for (local1244 = 0; local1244 < 3; local1244++) {
							local1242 += local996[local1244 + local1234 * 3] * arg7[local1238 * 3 + local1244];
						}
						local1232[local1234 * 3 + local1238] = local1242 + 8192 >> 14;
					}
				}
				local1238 = local996[0] * local261 + local996[1] * local54 + local60 * local996[2] + 8192 >> 14;
				local1242 = local996[5] * local60 + local261 * local996[3] + local996[4] * local54 + 8192 >> 14;
				local1238 += local1220;
				local1242 += local1225;
				local1244 = local996[6] * local261 + local54 * local996[7] + local996[8] * local60 + 8192 >> 14;
				local1244 += local1229;
				local1380 = new int[9];
				for (local1382 = 0; local1382 < 3; local1382++) {
					for (local1386 = 0; local1386 < 3; local1386++) {
						local1390 = 0;
						for (local1392 = 0; local1392 < 3; local1392++) {
							local1390 += local1232[local1392 * 3 + local1386] * arg7[local1382 * 3 + local1392];
						}
						local1380[local1382 * 3 + local1386] = local1390 + 8192 >> 14;
					}
				}
				local1386 = arg7[0] * local1238 + local1242 * arg7[1] + local1244 * arg7[2] + 8192 >> 14;
				local1390 = arg7[5] * local1244 + local1238 * arg7[3] + local1242 * arg7[4] + 8192 >> 14;
				local1392 = arg7[7] * local1242 + local1238 * arg7[6] + local1244 * arg7[8] + 8192 >> 14;
				local1390 += local32;
				local1386 += local30;
				local1392 += local38;
				for (local1522 = 0; local1522 < local8; local1522++) {
					@Pc(1528) int local1528 = arg1[local1522];
					if (this.anIntArrayArray99.length > local1528) {
						@Pc(1538) int[] local1538 = this.anIntArrayArray99[local1528];
						for (@Pc(1540) int local1540 = 0; local1540 < local1538.length; local1540++) {
							@Pc(1546) int local1546 = local1538[local1540];
							if (this.aShortArray75 == null || (arg6 & this.aShortArray75[local1546]) != 0) {
								@Pc(1587) int local1587 = local1380[1] * this.anIntArray237[local1546] + this.anIntArray235[local1546] * local1380[0] + local1380[2] * this.anIntArray233[local1546] + 8192 >> 14;
								@Pc(1620) int local1620 = this.anIntArray235[local1546] * local1380[3] + this.anIntArray237[local1546] * local1380[4] + local1380[5] * this.anIntArray233[local1546] + 8192 >> 14;
								@Pc(1624) int local1624 = local1620 + local1390;
								@Pc(1656) int local1656 = local1380[7] * this.anIntArray237[local1546] + this.anIntArray235[local1546] * local1380[6] + this.anIntArray233[local1546] * local1380[8] + 8192 >> 14;
								@Pc(1660) int local1660 = local1587 + local1386;
								@Pc(1664) int local1664 = local1656 + local1392;
								this.anIntArray235[local1546] = local1660;
								this.anIntArray237[local1546] = local1624;
								this.anIntArray233[local1546] = local1664;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2594) Class324 local2594;
			@Pc(2599) Class287 local2599;
			if (arg0 == 5) {
				if (this.anIntArrayArray101 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray101.length > local32) {
							local259 = this.anIntArrayArray101[local32];
							for (local261 = 0; local261 < local259.length; local261++) {
								local54 = local259[local261];
								if (this.aShortArray71 == null || (this.aShortArray71[local54] & arg6) != 0) {
									local60 = (this.aByteArray53[local54] & 0xFF) + (arg2 * 8);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray53[local54] = (byte) local60;
									if (this.aClass126_6 != null) {
										this.aClass126_6.anInterface21_2 = null;
									}
								}
							}
						}
					}
					if (this.aClass324Array1 != null) {
						for (local32 = 0; local32 < this.anInt4399; local32++) {
							local2594 = this.aClass324Array1[local32];
							local2599 = this.aClass287Array1[local32];
							local2599.anInt7689 = local2599.anInt7689 & 0xFFFFFF | 255 - (this.aByteArray53[local2594.anInt8247] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2848) Class287 local2848;
				if (arg0 == 8) {
					if (this.anIntArrayArray100 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray100.length) {
								local259 = this.anIntArrayArray100[local32];
								for (local261 = 0; local261 < local259.length; local261++) {
									local2848 = this.aClass287Array1[local259[local261]];
									local2848.anInt7692 += arg3;
									local2848.anInt7686 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray100 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (this.anIntArrayArray100.length > local32) {
								local259 = this.anIntArrayArray100[local32];
								for (local261 = 0; local261 < local259.length; local261++) {
									local2848 = this.aClass287Array1[local259[local261]];
									local2848.anInt7687 = local2848.anInt7687 * arg3 >> 7;
									local2848.anInt7693 = local2848.anInt7693 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray100 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray100.length) {
							local259 = this.anIntArrayArray100[local32];
							for (local261 = 0; local261 < local259.length; local261++) {
								local2848 = this.aClass287Array1[local259[local261]];
								local2848.anInt7690 = arg2 + local2848.anInt7690 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray101 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray101.length) {
						local259 = this.anIntArrayArray101[local32];
						for (local261 = 0; local261 < local259.length; local261++) {
							local54 = local259[local261];
							if (this.aShortArray71 == null || (this.aShortArray71[local54] & arg6) != 0) {
								local60 = this.aShortArray68[local54] & 0xFFFF;
								local403 = local60 >> 10 & 0x3F;
								local421 = local60 >> 7 & 0x7;
								@Pc(2701) int local2701 = local403 + arg2 & 0x3F;
								local421 += arg3 / 4;
								local650 = local60 & 0x7F;
								local650 += arg4;
								if (local421 < 0) {
									local421 = 0;
								} else if (local421 > 7) {
									local421 = 7;
								}
								if (local650 < 0) {
									local650 = 0;
								} else if (local650 > 127) {
									local650 = 127;
								}
								this.aShortArray68[local54] = (short) (local2701 << 10 | local421 << 7 | local650);
								if (this.aClass126_6 != null) {
									this.aClass126_6.anInterface21_2 = null;
								}
							}
						}
					}
				}
				if (this.aClass324Array1 != null) {
					for (local32 = 0; local32 < this.anInt4399; local32++) {
						local2594 = this.aClass324Array1[local32];
						local2599 = this.aClass287Array1[local32];
						local2599.anInt7689 = Static214.anIntArray203[this.aShortArray68[local2594.anInt8247] & 0xFFFF] & 0xFFFFFF | local2599.anInt7689 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray99.length) {
					local259 = this.anIntArrayArray99[local32];
					for (local261 = 0; local261 < local259.length; local261++) {
						local54 = local259[local261];
						if (this.aShortArray75 == null || (arg6 & this.aShortArray75[local54]) != 0) {
							this.anIntArray235[local54] -= Static585.anInt9432;
							this.anIntArray237[local54] -= Static389.anInt409;
							this.anIntArray233[local54] -= Static525.anInt8434;
							this.anIntArray235[local54] = this.anIntArray235[local54] * arg2 >> 7;
							this.anIntArray237[local54] = arg3 * this.anIntArray237[local54] >> 7;
							this.anIntArray233[local54] = arg4 * this.anIntArray233[local54] >> 7;
							this.anIntArray235[local54] += Static585.anInt9432;
							this.anIntArray237[local54] += Static389.anInt409;
							this.anIntArray233[local54] += Static525.anInt8434;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local261 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static121.aBoolean227) {
				local403 = Static525.anInt8434 * arg7[6] + arg7[3] * Static389.anInt409 + Static585.anInt9432 * arg7[0] + 8192 >> 14;
				local421 = Static585.anInt9432 * arg7[1] + Static389.anInt409 * arg7[4] + arg7[7] * Static525.anInt8434 + 8192 >> 14;
				local403 += local261;
				local650 = arg7[8] * Static525.anInt8434 + arg7[5] * Static389.anInt409 + Static585.anInt9432 * arg7[2] + 8192 >> 14;
				local421 += local54;
				Static585.anInt9432 = local403;
				local650 += local60;
				Static389.anInt409 = local421;
				Static121.aBoolean227 = false;
				Static525.anInt8434 = local650;
			}
			local403 = arg2 << 15 >> 7;
			local421 = arg3 << 15 >> 7;
			local650 = arg4 << 15 >> 7;
			local659 = local403 * -Static585.anInt9432 + 8192 >> 14;
			local668 = -Static389.anInt409 * local421 + 8192 >> 14;
			local672 = -Static525.anInt8434 * local650 + 8192 >> 14;
			local690 = local659 + Static585.anInt9432;
			local1028 = local668 + Static389.anInt409;
			local1036 = Static525.anInt8434 + local672;
			@Pc(1886) int[] local1886 = new int[] { local403 * arg7[0] + 8192 >> 14, arg7[3] * local403 + 8192 >> 14, arg7[6] * local403 + 8192 >> 14, local421 * arg7[1] + 8192 >> 14, local421 * arg7[4] + 8192 >> 14, arg7[7] * local421 + 8192 >> 14, local650 * arg7[2] + 8192 >> 14, arg7[5] * local650 + 8192 >> 14, arg7[8] * local650 + 8192 >> 14 };
			local1191 = local261 * local403 + 8192 >> 14;
			local1216 = local54 * local421 + 8192 >> 14;
			local1220 = local60 * local650 + 8192 >> 14;
			@Pc(2022) int local2022 = local1216 + local1028;
			@Pc(2026) int local2026 = local1191 + local690;
			@Pc(2030) int local2030 = local1220 + local1036;
			@Pc(2033) int[] local2033 = new int[9];
			@Pc(2039) int local2039;
			for (local1229 = 0; local1229 < 3; local1229++) {
				for (local2039 = 0; local2039 < 3; local2039++) {
					local1234 = 0;
					for (local1238 = 0; local1238 < 3; local1238++) {
						local1234 += arg7[local1238 + local1229 * 3] * local1886[local2039 + local1238 * 3];
					}
					local2033[local1229 * 3 + local2039] = local1234 + 8192 >> 14;
				}
			}
			local2039 = arg7[1] * local2022 + arg7[0] * local2026 + arg7[2] * local2030 + 8192 >> 14;
			local1234 = local2022 * arg7[4] + local2026 * arg7[3] + local2030 * arg7[5] + 8192 >> 14;
			local1238 = arg7[8] * local2030 + local2022 * arg7[7] + local2026 * arg7[6] + 8192 >> 14;
			local1234 += local32;
			local2039 += local30;
			local1238 += local38;
			for (local1242 = 0; local1242 < local8; local1242++) {
				local1244 = arg1[local1242];
				if (this.anIntArrayArray99.length > local1244) {
					local1380 = this.anIntArrayArray99[local1244];
					for (local1382 = 0; local1382 < local1380.length; local1382++) {
						local1386 = local1380[local1382];
						if (this.aShortArray75 == null || (this.aShortArray75[local1386] & arg6) != 0) {
							local1390 = this.anIntArray233[local1386] * local2033[2] + this.anIntArray237[local1386] * local2033[1] + this.anIntArray235[local1386] * local2033[0] + 8192 >> 14;
							local1392 = local2033[5] * this.anIntArray233[local1386] + local2033[3] * this.anIntArray235[local1386] + local2033[4] * this.anIntArray237[local1386] + 8192 >> 14;
							local1522 = local2033[8] * this.anIntArray233[local1386] + local2033[7] * this.anIntArray237[local1386] + this.anIntArray235[local1386] * local2033[6] + 8192 >> 14;
							@Pc(2314) int local2314 = local1392 + local1234;
							@Pc(2318) int local2318 = local1390 + local2039;
							this.anIntArray235[local1386] = local2318;
							@Pc(2327) int local2327 = local1522 + local1238;
							this.anIntArray237[local1386] = local2314;
							this.anIntArray233[local1386] = local2327;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "()[Lclient!qr;")
	@Override
	public Class281[] method7244() {
		return this.aClass281Array3;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	private void method3834() {
		if (this.anInt4372 == 0) {
			return;
		}
		if (this.aByte56 != 0) {
			this.method3846(true);
		}
		this.method3846(false);
		if (this.aClass74_1 != null) {
			if (this.aClass74_1.anInterface2_1 == null) {
				this.method3835((this.aByte56 & 0x10) != 0);
			}
			if (this.aClass74_1.anInterface2_1 != null) {
				this.aClass45_Sub3_28.method7489(this.aClass126_5 != null);
				this.aClass45_Sub3_28.method7498(this.aClass126_7, this.aClass126_6, this.aClass126_8, this.aClass126_5);
				@Pc(73) int local73 = this.anIntArray234.length - 1;
				for (@Pc(75) int local75 = 0; local75 < local73; local75++) {
					@Pc(82) int local82 = this.anIntArray234[local75];
					@Pc(89) int local89 = this.anIntArray234[local75 + 1];
					@Pc(96) int local96 = this.aShortArray73[local82] & 0xFFFF;
					if (local96 == 65535) {
						local96 = -1;
					}
					this.aClass45_Sub3_28.method7479(this.aClass126_5 != null, local96);
					this.aClass45_Sub3_28.method7482(this.aClass74_1.anInterface2_1, local82 * 3, (local89 - local82) * 3);
				}
			}
		}
		this.method3833();
	}

	@OriginalMember(owner = "client!jg", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean330) {
			this.method3836();
		}
		return this.aShort66;
	}

	@OriginalMember(owner = "client!jg", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static525.anInt8434 = 0;
			local11 = 0;
			Static389.anInt409 = 0;
			Static585.anInt9432 = 0;
			for (local17 = 0; local17 < this.anInt4368; local17++) {
				Static585.anInt9432 += this.anIntArray235[local17];
				Static389.anInt409 += this.anIntArray237[local17];
				local11++;
				Static525.anInt8434 += this.anIntArray233[local17];
			}
			if (local11 > 0) {
				Static585.anInt9432 = arg1 + Static585.anInt9432 / local11;
				Static525.anInt8434 = Static525.anInt8434 / local11 + arg3;
				Static389.anInt409 = Static389.anInt409 / local11 + arg2;
			} else {
				Static585.anInt9432 = arg1;
				Static389.anInt409 = arg2;
				Static525.anInt8434 = arg3;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt4368; local11++) {
				this.anIntArray235[local11] += arg1;
				this.anIntArray237[local11] += arg2;
				this.anIntArray233[local11] += arg3;
			}
		} else {
			@Pc(156) int local156;
			@Pc(174) int local174;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt4368; local11++) {
					this.anIntArray235[local11] -= Static585.anInt9432;
					this.anIntArray237[local11] -= Static389.anInt409;
					this.anIntArray233[local11] -= Static525.anInt8434;
					if (arg3 != 0) {
						local17 = Class356.anIntArray597[arg3];
						local156 = Class356.anIntArray598[arg3];
						local174 = local156 * this.anIntArray235[local11] + this.anIntArray237[local11] * local17 + 16383 >> 14;
						this.anIntArray237[local11] = this.anIntArray237[local11] * local156 + 16383 - local17 * this.anIntArray235[local11] >> 14;
						this.anIntArray235[local11] = local174;
					}
					if (arg1 != 0) {
						local17 = Class356.anIntArray597[arg1];
						local156 = Class356.anIntArray598[arg1];
						local174 = this.anIntArray237[local11] * local156 + 16383 - local17 * this.anIntArray233[local11] >> 14;
						this.anIntArray233[local11] = local17 * this.anIntArray237[local11] + this.anIntArray233[local11] * local156 + 16383 >> 14;
						this.anIntArray237[local11] = local174;
					}
					if (arg2 != 0) {
						local17 = Class356.anIntArray597[arg2];
						local156 = Class356.anIntArray598[arg2];
						local174 = this.anIntArray235[local11] * local156 + this.anIntArray233[local11] * local17 + 16383 >> 14;
						this.anIntArray233[local11] = this.anIntArray233[local11] * local156 + 16383 - this.anIntArray235[local11] * local17 >> 14;
						this.anIntArray235[local11] = local174;
					}
					this.anIntArray235[local11] += Static585.anInt9432;
					this.anIntArray237[local11] += Static389.anInt409;
					this.anIntArray233[local11] += Static525.anInt8434;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt4368; local11++) {
					this.anIntArray235[local11] -= Static585.anInt9432;
					this.anIntArray237[local11] -= Static389.anInt409;
					this.anIntArray233[local11] -= Static525.anInt8434;
					this.anIntArray235[local11] = this.anIntArray235[local11] * arg1 / 128;
					this.anIntArray237[local11] = arg2 * this.anIntArray237[local11] / 128;
					this.anIntArray233[local11] = this.anIntArray233[local11] * arg3 / 128;
					this.anIntArray235[local11] += Static585.anInt9432;
					this.anIntArray237[local11] += Static389.anInt409;
					this.anIntArray233[local11] += Static525.anInt8434;
				}
			} else {
				@Pc(508) Class324 local508;
				@Pc(513) Class287 local513;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt4423; local11++) {
						local17 = arg1 * 8 + (this.aByteArray53[local11] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray53[local11] = (byte) local17;
					}
					if (this.aClass126_6 != null) {
						this.aClass126_6.anInterface21_2 = null;
					}
					if (this.aClass324Array1 != null) {
						for (local17 = 0; local17 < this.anInt4399; local17++) {
							local508 = this.aClass324Array1[local17];
							local513 = this.aClass287Array1[local17];
							local513.anInt7689 = local513.anInt7689 & 0xFFFFFF | 255 - (this.aByteArray53[local508.anInt8247] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt4423; local11++) {
						local17 = this.aShortArray68[local11] & 0xFFFF;
						local156 = local17 >> 10 & 0x3F;
						local174 = local17 >> 7 & 0x7;
						@Pc(572) int local572 = local17 & 0x7F;
						@Pc(578) int local578 = local156 + arg1 & 0x3F;
						local174 += arg2 / 4;
						local572 += arg3;
						if (local174 < 0) {
							local174 = 0;
						} else if (local174 > 7) {
							local174 = 7;
						}
						if (local572 < 0) {
							local572 = 0;
						} else if (local572 > 127) {
							local572 = 127;
						}
						this.aShortArray68[local11] = (short) (local572 | local174 << 7 | local578 << 10);
					}
					if (this.aClass126_6 != null) {
						this.aClass126_6.anInterface21_2 = null;
					}
					if (this.aClass324Array1 != null) {
						for (local17 = 0; local17 < this.anInt4399; local17++) {
							local508 = this.aClass324Array1[local17];
							local513 = this.aClass287Array1[local17];
							local513.anInt7689 = Static214.anIntArray203[this.aShortArray68[local508.anInt8247] & 0xFFFF] & 0xFFFFFF | local513.anInt7689 & 0xFF000000;
						}
					}
				} else {
					@Pc(696) Class287 local696;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt4399; local11++) {
							local696 = this.aClass287Array1[local11];
							local696.anInt7692 += arg2;
							local696.anInt7686 += arg1;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt4399; local11++) {
							local696 = this.aClass287Array1[local11];
							local696.anInt7693 = arg1 * local696.anInt7693 >> 7;
							local696.anInt7687 = arg2 * local696.anInt7687 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt4399; local11++) {
							local696 = this.aClass287Array1[local11];
							local696.anInt7690 = arg1 + local696.anInt7690 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "()V")
	@Override
	public void method7231() {
		if (this.anInt4400 <= 0 || this.anInt4372 <= 0) {
			return;
		}
		this.method3846(false);
		if ((this.aByte56 & 0x10) == 0 && this.aClass74_1.anInterface2_1 == null) {
			this.method3835(false);
		}
		this.method3833();
	}

	@OriginalMember(owner = "client!jg", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class356.anIntArray597[arg0];
		@Pc(13) int local13 = Class356.anIntArray598[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4368; local15++) {
			@Pc(34) int local34 = this.anIntArray237[local15] * local13 - this.anIntArray233[local15] * local9 >> 14;
			this.anIntArray233[local15] = this.anIntArray237[local15] * local9 + local13 * this.anIntArray233[local15] >> 14;
			this.anIntArray237[local15] = local34;
		}
		if (this.aClass126_7 != null) {
			this.aClass126_7.anInterface21_2 = null;
		}
		this.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!jg", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort75;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V")
	private void method3835(@OriginalArg(0) boolean arg0) {
		if (this.anInt4372 * 6 <= this.aClass45_Sub3_28.aClass3_Sub11_Sub2_3.aByteArray62.length) {
			this.aClass45_Sub3_28.aClass3_Sub11_Sub2_3.anInt6128 = 0;
		} else {
			this.aClass45_Sub3_28.aClass3_Sub11_Sub2_3 = new Class3_Sub11_Sub2((this.anInt4372 + 100) * 6);
		}
		@Pc(42) Class3_Sub11_Sub2 local42 = this.aClass45_Sub3_28.aClass3_Sub11_Sub2_3;
		@Pc(48) int local48;
		if (this.aClass45_Sub3_28.aBoolean687) {
			for (local48 = 0; local48 < this.anInt4372; local48++) {
				local42.method5200(this.aShortArray70[local48]);
				local42.method5200(this.aShortArray76[local48]);
				local42.method5200(this.aShortArray67[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt4372; local48++) {
				local42.method5222(this.aShortArray70[local48]);
				local42.method5222(this.aShortArray76[local48]);
				local42.method5222(this.aShortArray67[local48]);
			}
		}
		if (local42.anInt6128 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface2_2 == null) {
				this.anInterface2_2 = this.aClass45_Sub3_28.method7477(local42.anInt6128, true, local42.aByteArray62);
			} else {
				this.anInterface2_2.method7527(local42.aByteArray62, local42.anInt6128);
			}
			this.aClass74_1.anInterface2_1 = this.anInterface2_2;
		} else {
			this.aClass74_1.anInterface2_1 = this.aClass45_Sub3_28.method7477(local42.anInt6128, false, local42.aByteArray62);
		}
		if (!arg0) {
			this.aBoolean328 = true;
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V")
	private void method3836() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(25) int local25 = -32768;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt4368; local31++) {
			@Pc(38) int local38 = this.anIntArray235[local31];
			@Pc(43) int local43 = this.anIntArray237[local31];
			if (local43 < local9) {
				local9 = local43;
			}
			if (local13 < local38) {
				local13 = local38;
			}
			if (local7 > local38) {
				local7 = local38;
			}
			if (local15 < local43) {
				local15 = local43;
			}
			@Pc(76) int local76 = this.anIntArray233[local31];
			if (local25 < local76) {
				local25 = local76;
			}
			if (local76 < local11) {
				local11 = local76;
			}
			@Pc(98) int local98 = local76 * local76 + local38 * local38;
			if (local27 < local98) {
				local27 = local98;
			}
			local98 = local43 * local43 + local38 * local38 + local76 * local76;
			if (local98 > local29) {
				local29 = local98;
			}
		}
		this.aShort72 = (short) local25;
		this.aShort66 = (short) local11;
		this.aShort68 = (short) local7;
		this.aShort71 = (short) local13;
		this.aShort74 = (short) local9;
		this.aShort73 = (short) local15;
		this.aShort70 = (short) (Math.sqrt((double) local27) + 0.99D);
		this.aShort69 = (short) (Math.sqrt((double) local29) + 0.99D);
		this.aBoolean330 = true;
	}

	@OriginalMember(owner = "client!jg", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean330) {
			this.method3836();
		}
		@Pc(16) int local16 = this.aShort68 + arg4;
		@Pc(22) int local22 = arg4 + this.aShort71;
		@Pc(28) int local28 = arg6 + this.aShort66;
		@Pc(33) int local33 = arg6 + this.aShort72;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt7854 <= local22 + arg2.anInt7850 >> arg2.anInt7856 || local28 < 0 || arg2.anInt7850 + local33 >> arg2.anInt7856 >= arg2.anInt7852)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local22 + arg3.anInt7850 >> arg3.anInt7856 >= arg3.anInt7854 || local28 < 0 || arg3.anInt7850 + local33 >> arg3.anInt7856 >= arg3.anInt7852) {
				return;
			}
		} else {
			local16 >>= arg2.anInt7856;
			local22 = local22 + arg2.anInt7850 - 1 >> arg2.anInt7856;
			local28 >>= arg2.anInt7856;
			local33 = local33 + arg2.anInt7850 - 1 >> arg2.anInt7856;
			if (arg2.method6525(local28, local16) == arg5 && arg5 == arg2.method6525(local28, local22) && arg5 == arg2.method6525(local33, local16) && arg5 == arg2.method6525(local33, local22)) {
				return;
			}
		}
		@Pc(210) int local210;
		if (arg0 == 1) {
			for (local210 = 0; local210 < this.anInt4368; local210++) {
				this.anIntArray237[local210] = this.anIntArray237[local210] + arg2.method6530(arg4 + this.anIntArray235[local210], arg6 + this.anIntArray233[local210]) - arg5;
			}
		} else {
			@Pc(266) int local266;
			@Pc(277) int local277;
			if (arg0 == 2) {
				@Pc(258) short local258 = this.aShort74;
				if (local258 == 0) {
					return;
				}
				for (local266 = 0; local266 < this.anInt4368; local266++) {
					local277 = (this.anIntArray237[local266] << 16) / local258;
					if (arg1 > local277) {
						this.anIntArray237[local266] += (arg1 - local277) * (-arg5 + arg2.method6530(this.anIntArray235[local266] - -arg4, this.anIntArray233[local266] + arg6)) / arg1;
					}
				}
			} else {
				@Pc(367) int local367;
				if (arg0 == 3) {
					local210 = (arg1 & 0xFF) * 4;
					local266 = (arg1 >> 8 & 0xFF) * 4;
					local277 = (arg1 >> 16 & 0xFF) << 6;
					local367 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local210 >> 1) < 0 || arg4 + (local210 >> 1) + arg2.anInt7850 >= arg2.anInt7854 << arg2.anInt7856 || arg6 - (local266 >> 1) < 0 || arg6 + (local266 >> 1) + arg2.anInt7850 >= arg2.anInt7852 << arg2.anInt7856) {
						return;
					}
					this.method7225(local277, local210, arg4, local266, local367, arg5, arg2, arg6);
				} else if (arg0 == 4) {
					local210 = this.aShort73 - this.aShort74;
					for (local266 = 0; local266 < this.anInt4368; local266++) {
						this.anIntArray237[local266] = local210 + this.anIntArray237[local266] + arg3.method6530(this.anIntArray235[local266] - -arg4, arg6 + this.anIntArray233[local266]) - arg5;
					}
				} else if (arg0 == 5) {
					local210 = this.aShort73 - this.aShort74;
					for (local266 = 0; local266 < this.anInt4368; local266++) {
						local277 = this.anIntArray235[local266] + arg4;
						local367 = arg6 + this.anIntArray233[local266];
						@Pc(373) int local373 = arg2.method6530(local277, local367);
						@Pc(379) int local379 = arg3.method6530(local277, local367);
						@Pc(387) int local387 = local373 - arg1 - local379;
						this.anIntArray237[local266] = (local387 * ((this.anIntArray237[local266] << 8) / local210) >> 8) + local373 - arg5;
					}
				}
			}
		}
		if (this.aClass126_7 != null) {
			this.aClass126_7.anInterface21_2 = null;
		}
		this.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!jg", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean330) {
			this.method3836();
		}
		return this.aShort72;
	}

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class356.anIntArray597[arg0];
		@Pc(13) int local13 = Class356.anIntArray598[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4368; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray233[local15] + local13 * this.anIntArray235[local15] >> 14;
			this.anIntArray233[local15] = local13 * this.anIntArray233[local15] - local9 * this.anIntArray235[local15] >> 14;
			this.anIntArray235[local15] = local34;
		}
		this.aBoolean330 = false;
		if (this.aClass126_7 != null) {
			this.aClass126_7.anInterface21_2 = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!og;I)V")
	private void method3837(@OriginalArg(0) Class3_Sub7_Sub13_Sub1 arg0) {
		if (this.aClass45_Sub3_28.anIntArray583.length < this.anInt4400) {
			this.aClass45_Sub3_28.anIntArray582 = new int[this.anInt4400];
			this.aClass45_Sub3_28.anIntArray583 = new int[this.anInt4400];
		}
		@Pc(28) int[] local28 = this.aClass45_Sub3_28.anIntArray583;
		@Pc(32) int[] local32 = this.aClass45_Sub3_28.anIntArray582;
		@Pc(61) int local61;
		@Pc(100) int local100;
		@Pc(109) int local109;
		for (@Pc(34) int local34 = 0; local34 < this.anInt4368; local34++) {
			local61 = (this.anIntArray235[local34] - (this.anIntArray237[local34] * this.aClass45_Sub3_28.anInt9057 >> 8) >> this.aClass45_Sub3_28.anInt9043) - arg0.anInt6519;
			@Pc(86) int local86 = (this.anIntArray233[local34] - (this.aClass45_Sub3_28.anInt9061 * this.anIntArray237[local34] >> 8) >> this.aClass45_Sub3_28.anInt9043) - arg0.anInt6512;
			@Pc(91) int local91 = this.anIntArray236[local34];
			@Pc(98) int local98 = this.anIntArray236[local34 + 1];
			for (local100 = local91; local100 < local98; local100++) {
				local109 = this.aShortArray69[local100] - 1;
				if (local109 == -1) {
					break;
				}
				local28[local109] = local61;
				local32[local109] = local86;
			}
		}
		for (local61 = 0; local61 < this.anInt4372; local61++) {
			if (this.aByteArray53 == null || this.aByteArray53[local61] <= 128) {
				@Pc(155) short local155 = this.aShortArray70[local61];
				@Pc(160) short local160 = this.aShortArray76[local61];
				@Pc(165) short local165 = this.aShortArray67[local61];
				local100 = local28[local155];
				local109 = local28[local160];
				@Pc(177) int local177 = local28[local165];
				@Pc(181) int local181 = local32[local155];
				@Pc(185) int local185 = local32[local160];
				@Pc(189) int local189 = local32[local165];
				if ((local185 - local189) * (local100 - local109) - (local177 - local109) * (-local181 + local185) > 0) {
					arg0.method5561(local181, local100, local177, local185, local189, local109);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class356.anIntArray597[arg0];
		@Pc(13) int local13 = Class356.anIntArray598[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4368; local15++) {
			@Pc(33) int local33 = this.anIntArray237[local15] * local9 + this.anIntArray235[local15] * local13 >> 14;
			this.anIntArray237[local15] = this.anIntArray237[local15] * local13 - local9 * this.anIntArray235[local15] >> 14;
			this.anIntArray235[local15] = local33;
		}
		if (this.aClass126_7 != null) {
			this.aClass126_7.anInterface21_2 = null;
		}
		this.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7234(@OriginalArg(0) Class11 arg0) {
		@Pc(8) Class11_Sub2 local8 = (Class11_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass248Array3 != null) {
			for (local13 = 0; local13 < this.aClass248Array3.length; local13++) {
				@Pc(20) Class248 local20 = this.aClass248Array3[local13];
				@Pc(22) Class248 local22 = local20;
				if (local20.aClass248_2 != null) {
					local22 = local20.aClass248_2;
				}
				local22.anInt6903 = (int) (local8.aFloat105 + (float) this.anIntArray233[local20.anInt6893] * local8.aFloat104 + (float) this.anIntArray235[local20.anInt6893] * local8.aFloat114 + (float) this.anIntArray237[local20.anInt6893] * local8.aFloat108);
				local22.anInt6895 = (int) ((float) this.anIntArray233[local20.anInt6893] * local8.aFloat107 + local8.aFloat113 * (float) this.anIntArray235[local20.anInt6893] + local8.aFloat109 * (float) this.anIntArray237[local20.anInt6893] + local8.aFloat106);
				local22.anInt6898 = (int) (local8.aFloat103 + (float) this.anIntArray235[local20.anInt6893] * local8.aFloat111 + local8.aFloat112 * (float) this.anIntArray237[local20.anInt6893] + (float) this.anIntArray233[local20.anInt6893] * local8.aFloat110);
				local22.anInt6906 = (int) (local8.aFloat104 * (float) this.anIntArray233[local20.anInt6900] + (float) this.anIntArray235[local20.anInt6900] * local8.aFloat114 + local8.aFloat108 * (float) this.anIntArray237[local20.anInt6900] + local8.aFloat105);
				local22.anInt6902 = (int) (local8.aFloat106 + local8.aFloat113 * (float) this.anIntArray235[local20.anInt6900] + local8.aFloat109 * (float) this.anIntArray237[local20.anInt6900] + local8.aFloat107 * (float) this.anIntArray233[local20.anInt6900]);
				local22.anInt6910 = (int) (local8.aFloat112 * (float) this.anIntArray237[local20.anInt6900] + (float) this.anIntArray235[local20.anInt6900] * local8.aFloat111 + local8.aFloat110 * (float) this.anIntArray233[local20.anInt6900] + local8.aFloat103);
				local22.anInt6892 = (int) (local8.aFloat105 + local8.aFloat114 * (float) this.anIntArray235[local20.anInt6907] + (float) this.anIntArray237[local20.anInt6907] * local8.aFloat108 + local8.aFloat104 * (float) this.anIntArray233[local20.anInt6907]);
				local22.anInt6909 = (int) (local8.aFloat109 * (float) this.anIntArray237[local20.anInt6907] + (float) this.anIntArray235[local20.anInt6907] * local8.aFloat113 + local8.aFloat107 * (float) this.anIntArray233[local20.anInt6907] + local8.aFloat106);
				local22.anInt6911 = (int) (local8.aFloat110 * (float) this.anIntArray233[local20.anInt6907] + (float) this.anIntArray235[local20.anInt6907] * local8.aFloat111 + (float) this.anIntArray237[local20.anInt6907] * local8.aFloat112 + local8.aFloat103);
			}
		}
		if (this.aClass281Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass281Array3.length; local13++) {
			@Pc(365) Class281 local365 = this.aClass281Array3[local13];
			@Pc(367) Class281 local367 = local365;
			if (local365.aClass281_2 != null) {
				local367 = local365.aClass281_2;
			}
			if (local365.aClass11_5 == null) {
				local365.aClass11_5 = local8.method7214();
			} else {
				local365.aClass11_5.M(local8);
			}
			local367.anInt7418 = (int) (local8.aFloat105 + (float) this.anIntArray235[local365.anInt7415] * local8.aFloat114 + (float) this.anIntArray237[local365.anInt7415] * local8.aFloat108 + (float) this.anIntArray233[local365.anInt7415] * local8.aFloat104);
			local367.anInt7412 = (int) (local8.aFloat107 * (float) this.anIntArray233[local365.anInt7415] + local8.aFloat109 * (float) this.anIntArray237[local365.anInt7415] + (float) this.anIntArray235[local365.anInt7415] * local8.aFloat113 + local8.aFloat106);
			local367.anInt7413 = (int) (local8.aFloat103 + (float) this.anIntArray235[local365.anInt7415] * local8.aFloat111 + (float) this.anIntArray237[local365.anInt7415] * local8.aFloat112 + local8.aFloat110 * (float) this.anIntArray233[local365.anInt7415]);
		}
	}

	@OriginalMember(owner = "client!jg", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort67;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
	@Override
	protected void method7228() {
	}

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub7_Sub13 S(@OriginalArg(0) Class3_Sub7_Sub13 arg0) {
		if (this.anInt4400 == 0) {
			return null;
		}
		if (!this.aBoolean330) {
			this.method3836();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass45_Sub3_28.anInt9057 <= 0) {
			local37 = this.aShort68 - (this.aClass45_Sub3_28.anInt9057 * this.aShort74 >> 8) >> this.aClass45_Sub3_28.anInt9043;
			local54 = this.aShort71 - (this.aClass45_Sub3_28.anInt9057 * this.aShort73 >> 8) >> this.aClass45_Sub3_28.anInt9043;
		} else {
			local37 = this.aShort68 - (this.aShort73 * this.aClass45_Sub3_28.anInt9057 >> 8) >> this.aClass45_Sub3_28.anInt9043;
			local54 = this.aShort71 - (this.aShort74 * this.aClass45_Sub3_28.anInt9057 >> 8) >> this.aClass45_Sub3_28.anInt9043;
		}
		@Pc(110) int local110;
		@Pc(127) int local127;
		if (this.aClass45_Sub3_28.anInt9061 <= 0) {
			local110 = this.aShort66 - (this.aShort74 * this.aClass45_Sub3_28.anInt9061 >> 8) >> this.aClass45_Sub3_28.anInt9043;
			local127 = this.aShort72 - (this.aShort73 * this.aClass45_Sub3_28.anInt9061 >> 8) >> this.aClass45_Sub3_28.anInt9043;
		} else {
			local110 = this.aShort66 - (this.aShort73 * this.aClass45_Sub3_28.anInt9061 >> 8) >> this.aClass45_Sub3_28.anInt9043;
			local127 = this.aShort72 - (this.aClass45_Sub3_28.anInt9061 * this.aShort74 >> 8) >> this.aClass45_Sub3_28.anInt9043;
		}
		@Pc(167) int local167 = local54 + 1 - local37;
		@Pc(174) int local174 = local127 + 1 - local110;
		@Pc(177) Class3_Sub7_Sub13_Sub1 local177 = (Class3_Sub7_Sub13_Sub1) arg0;
		@Pc(187) Class3_Sub7_Sub13_Sub1 local187;
		if (local177 != null && local177.method5562(local174, local167)) {
			local187 = local177;
			local177.method5564();
		} else {
			local187 = new Class3_Sub7_Sub13_Sub1(this.aClass45_Sub3_28, local167, local174);
		}
		local187.method5567(local54, local37, local127, local110);
		this.method3837(local187);
		return local187;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg1 && arg4 < arg3 && arg5 > arg4) {
			return false;
		} else if (arg1 < arg4 && arg3 < arg4 && arg5 < arg4) {
			return false;
		} else if (arg0 > arg2 && arg6 > arg2 && arg7 > arg2) {
			return false;
		} else {
			return arg2 <= arg0 || arg2 <= arg6 || arg2 <= arg7;
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "()[Lclient!ow;")
	@Override
	public Class248[] method7238() {
		return this.aClass248Array3;
	}

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray99 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4427; local12++) {
			this.anIntArray235[local12] <<= 0x4;
			this.anIntArray237[local12] <<= 0x4;
			this.anIntArray233[local12] <<= 0x4;
		}
		Static585.anInt9432 = 0;
		Static525.anInt8434 = 0;
		Static389.anInt409 = 0;
		return true;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7233(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class60_Sub2 local8 = (Class60_Sub2) arg0;
		if (this.anInt4423 == 0 || local8.anInt4423 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt4368;
		@Pc(21) int[] local21 = local8.anIntArray235;
		@Pc(24) int[] local24 = local8.anIntArray237;
		@Pc(27) int[] local27 = local8.anIntArray233;
		@Pc(30) short[] local30 = local8.aShortArray77;
		@Pc(33) short[] local33 = local8.aShortArray72;
		@Pc(36) short[] local36 = local8.aShortArray74;
		@Pc(39) byte[] local39 = local8.aByteArray54;
		@Pc(58) short[] local58;
		@Pc(46) short[] local46;
		@Pc(54) short[] local54;
		@Pc(50) byte[] local50;
		if (this.aClass139_1 == null) {
			local50 = null;
			local58 = null;
			local54 = null;
			local46 = null;
		} else {
			local46 = this.aClass139_1.aShortArray52;
			local50 = this.aClass139_1.aByteArray42;
			local54 = this.aClass139_1.aShortArray54;
			local58 = this.aClass139_1.aShortArray53;
		}
		@Pc(83) short[] local83;
		@Pc(75) short[] local75;
		@Pc(79) short[] local79;
		@Pc(87) byte[] local87;
		if (local8.aClass139_1 == null) {
			local83 = null;
			local75 = null;
			local87 = null;
			local79 = null;
		} else {
			local75 = local8.aClass139_1.aShortArray52;
			local79 = local8.aClass139_1.aShortArray54;
			local83 = local8.aClass139_1.aShortArray53;
			local87 = local8.aClass139_1.aByteArray42;
		}
		@Pc(100) int[] local100 = local8.anIntArray236;
		@Pc(103) short[] local103 = local8.aShortArray69;
		if (!local8.aBoolean330) {
			local8.method3836();
		}
		@Pc(112) short local112 = local8.aShort74;
		@Pc(115) short local115 = local8.aShort73;
		@Pc(118) short local118 = local8.aShort68;
		@Pc(121) short local121 = local8.aShort71;
		@Pc(124) short local124 = local8.aShort66;
		@Pc(127) short local127 = local8.aShort72;
		for (@Pc(129) int local129 = 0; local129 < this.anInt4368; local129++) {
			@Pc(139) int local139 = this.anIntArray237[local129] - arg2;
			if (local112 <= local139 && local115 >= local139) {
				@Pc(159) int local159 = this.anIntArray235[local129] - arg1;
				if (local118 <= local159 && local159 <= local121) {
					@Pc(183) int local183 = this.anIntArray233[local129] - arg3;
					if (local124 <= local183 && local183 <= local127) {
						@Pc(193) int local193 = -1;
						@Pc(198) int local198 = this.anIntArray236[local129];
						@Pc(205) int local205 = this.anIntArray236[local129 + 1];
						for (@Pc(207) int local207 = local198; local207 < local205; local207++) {
							local193 = this.aShortArray69[local207] - 1;
							if (local193 == -1 || this.aByteArray54[local193] != 0) {
								break;
							}
						}
						if (local193 != -1) {
							for (@Pc(236) int local236 = 0; local236 < local18; local236++) {
								if (local159 == local21[local236] && local27[local236] == local183 && local139 == local24[local236]) {
									@Pc(259) int local259 = -1;
									local205 = local100[local236 + 1];
									local198 = local100[local236];
									for (@Pc(271) int local271 = local198; local271 < local205; local271++) {
										local259 = local103[local271] - 1;
										if (local259 == -1 || local39[local259] != 0) {
											break;
										}
									}
									if (local259 != -1) {
										if (local58 == null) {
											this.aClass139_1 = new Class139();
											local58 = this.aClass139_1.aShortArray53 = Static391.method5749(this.aShortArray77);
											local46 = this.aClass139_1.aShortArray52 = Static391.method5749(this.aShortArray72);
											local54 = this.aClass139_1.aShortArray54 = Static391.method5749(this.aShortArray74);
											local50 = this.aClass139_1.aByteArray42 = Static214.method3436(this.aByteArray54);
										}
										if (local83 == null) {
											@Pc(348) Class139 local348 = local8.aClass139_1 = new Class139();
											local83 = local348.aShortArray53 = Static391.method5749(local30);
											local75 = local348.aShortArray52 = Static391.method5749(local33);
											local79 = local348.aShortArray54 = Static391.method5749(local36);
											local87 = local348.aByteArray42 = Static214.method3436(local39);
										}
										@Pc(381) short local381 = this.aShortArray77[local193];
										@Pc(386) short local386 = this.aShortArray72[local193];
										@Pc(391) short local391 = this.aShortArray74[local193];
										local205 = local100[local236 + 1];
										@Pc(402) byte local402 = this.aByteArray54[local193];
										local198 = local100[local236];
										@Pc(416) int local416;
										for (@Pc(408) int local408 = local198; local408 < local205; local408++) {
											local416 = local103[local408] - 1;
											if (local416 == -1) {
												break;
											}
											if (local87[local416] != 0) {
												local83[local416] += local381;
												local75[local416] += local386;
												local79[local416] += local391;
												local87[local416] += local402;
											}
										}
										local402 = local39[local259];
										local391 = local36[local259];
										local205 = this.anIntArray236[local129 + 1];
										local386 = local33[local259];
										local198 = this.anIntArray236[local129];
										local381 = local30[local259];
										for (local416 = local198; local416 < local205; local416++) {
											@Pc(506) int local506 = this.aShortArray69[local416] - 1;
											if (local506 == -1) {
												break;
											}
											if (local50[local506] != 0) {
												local58[local506] += local381;
												local46[local506] += local386;
												local54[local506] += local391;
												local50[local506] += local402;
											}
										}
										if (this.aClass126_5 == null && this.aClass126_6 != null) {
											this.aClass126_6.anInterface21_2 = null;
										}
										if (this.aClass126_5 != null) {
											this.aClass126_5.anInterface21_2 = null;
										}
										if (local8.aClass126_5 == null && local8.aClass126_6 != null) {
											local8.aClass126_6.anInterface21_2 = null;
										}
										if (local8.aClass126_5 != null) {
											local8.aClass126_5.anInterface21_2 = null;
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

	@OriginalMember(owner = "client!jg", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean329;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BSIIZ)I")
	private int method3840(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(17) int local17 = Static214.anIntArray203[Static338.method4799(arg2, arg3)];
		if (arg1 != -1) {
			@Pc(30) Class55 local30 = this.aClass45_Sub3_28.anInterface3_12.method4776(arg1 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte17 & 0xFF;
			@Pc(47) int local47;
			@Pc(73) int local73;
			if (local35 != 0) {
				if (arg3 < 0) {
					local47 = 0;
				} else if (arg3 <= 127) {
					local47 = arg3 * 131586;
				} else {
					local47 = 16777215;
				}
				if (local35 == 256) {
					local17 = local47;
				} else {
					local73 = 256 - local35;
					local17 = ((local47 & 0xFF00) * local35 + (local17 & 0xFF00) * local73 & 0xFF0000) + ((local17 & 0xFF00FF) * local73 + (local47 & 0xFF00FF) * local35 & 0xFF00FF00) >> 8;
				}
			}
			local47 = local30.aByte15 & 0xFF;
			if (local47 != 0) {
				local47 += 256;
				@Pc(123) int local123 = local47 * (local17 >> 16 & 0xFF);
				if (local123 > 65535) {
					local123 = 65535;
				}
				local73 = local47 * (local17 >> 8 & 0xFF);
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(149) int local149 = local47 * (local17 & 0xFF);
				if (local149 > 65535) {
					local149 = 65535;
				}
				local17 = (local149 >> 8) + (local73 & 0xFF00) + ((local123 & 0xD400FF00) << 8);
			}
		}
		return (local17 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ef;FIIIJFIII)S")
	private short method3841(@OriginalArg(0) Class84 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray236[arg7];
		@Pc(17) int local17 = this.anIntArray236[arg7 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray69[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg4 == Static191.aLongArray7[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray69[local19] = (short) (this.anInt4400 + 1);
		Static191.aLongArray7[local19] = arg4;
		this.aShortArray77[this.anInt4400] = (short) arg2;
		this.aShortArray72[this.anInt4400] = (short) arg6;
		this.aShortArray74[this.anInt4400] = (short) arg3;
		this.aByteArray54[this.anInt4400] = (byte) arg8;
		this.aFloatArray48[this.anInt4400] = arg1;
		this.aFloatArray49[this.anInt4400] = arg5;
		return (short) this.anInt4400++;
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)V")
	private void method3842() {
		if (this.aClass324Array1 == null) {
			return;
		}
		@Pc(21) Class11_Sub2 local21 = this.aClass45_Sub3_28.aClass11_Sub2_2;
		this.aClass45_Sub3_28.method7490();
		this.aClass45_Sub3_28.ZA(false);
		this.aClass45_Sub3_28.method7489(false);
		this.aClass45_Sub3_28.method7498(this.aClass45_Sub3_28.aClass126_15, null, this.aClass45_Sub3_28.aClass126_16, null);
		for (@Pc(48) int local48 = 0; local48 < this.anInt4399; local48++) {
			@Pc(55) Class324 local55 = this.aClass324Array1[local48];
			@Pc(60) Class287 local60 = this.aClass287Array1[local48];
			if (!local55.aBoolean634 || !this.aClass45_Sub3_28.method7363()) {
				@Pc(88) float local88 = (float) (this.anIntArray235[local55.anInt8245] + this.anIntArray235[local55.anInt8248] + this.anIntArray235[local55.anInt8249]) * 0.3333333F;
				@Pc(109) float local109 = (float) (this.anIntArray237[local55.anInt8245] + this.anIntArray237[local55.anInt8248] + this.anIntArray237[local55.anInt8249]) * 0.3333333F;
				@Pc(130) float local130 = (float) (this.anIntArray233[local55.anInt8245] + this.anIntArray233[local55.anInt8248] + this.anIntArray233[local55.anInt8249]) * 0.3333333F;
				@Pc(144) float local144 = Static464.aFloat147 * local109 + local88 * Static229.aFloat96 + local130 * Static36.aFloat17 + Static461.aFloat145;
				@Pc(158) float local158 = Static537.aFloat158 + Static417.aFloat142 * local109 + Static153.aFloat87 * local88 + local130 * Static218.aFloat95;
				@Pc(172) float local172 = Static473.aFloat150 + local130 * Static306.aFloat116 + local88 * Static94.aFloat44 + Static160.aFloat89 * local109;
				local21.method4274((float) local60.anInt7692 - local158, local60.anInt7690, local144 + (float) local60.anInt7686, (float) local55.anInt8246 + -local172, local60.anInt7687 * local55.aShort137 >> 7, local60.anInt7693 * local55.aShort135 >> 7);
				this.aClass45_Sub3_28.method7474(local21);
				@Pc(215) int local215 = local60.anInt7689;
				OpenGL.glColor4ub((byte) (local215 >> 16), (byte) (local215 >> 8), (byte) local215, (byte) (local215 >> 24));
				this.aClass45_Sub3_28.method7505(local55.aShort136);
				this.aClass45_Sub3_28.method7465(local55.aByte109);
				this.aClass45_Sub3_28.method7457(4);
			}
		}
		this.aClass45_Sub3_28.ZA(true);
		this.aClass45_Sub3_28.method7449();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!q;Lclient!ufa;I)V")
	@Override
	public void method7230(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class41_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4400 == 0) {
			return;
		}
		@Pc(16) Class11_Sub2 local16 = this.aClass45_Sub3_28.aClass11_Sub2_3;
		@Pc(19) Class11_Sub2 local19 = (Class11_Sub2) arg0;
		if (!this.aBoolean330) {
			this.method3836();
		}
		Static160.aFloat89 = local16.aFloat110 * local19.aFloat112 + local19.aFloat109 * local16.aFloat112 + local16.aFloat111 * local19.aFloat108;
		Static473.aFloat150 = local16.aFloat110 * local19.aFloat103 + local19.aFloat105 * local16.aFloat111 + local19.aFloat106 * local16.aFloat112 + local16.aFloat103;
		@Pc(72) float local72 = (float) this.aShort74 * Static160.aFloat89 + Static473.aFloat150;
		@Pc(80) float local80 = Static473.aFloat150 + Static160.aFloat89 * (float) this.aShort73;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local80 < local72) {
			local97 = (float) -this.aShort70 + local80;
			local90 = (float) this.aShort70 + local72;
		} else {
			local90 = local80 + (float) this.aShort70;
			local97 = (float) -this.aShort70 + local72;
		}
		if (local97 >= this.aClass45_Sub3_28.aFloat182 || (float) this.aClass45_Sub3_28.anInt9081 >= local90) {
			return;
		}
		Static464.aFloat147 = local16.aFloat104 * local19.aFloat112 + local19.aFloat109 * local16.aFloat108 + local16.aFloat114 * local19.aFloat108;
		Static461.aFloat145 = local16.aFloat108 * local19.aFloat106 + local16.aFloat114 * local19.aFloat105 + local19.aFloat103 * local16.aFloat104 + local16.aFloat105;
		@Pc(174) float local174 = (float) this.aShort74 * Static464.aFloat147 + Static461.aFloat145;
		@Pc(182) float local182 = Static461.aFloat145 + Static464.aFloat147 * (float) this.aShort73;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local182 < local174) {
			local198 = ((float) -this.aShort70 + local182) * (float) this.aClass45_Sub3_28.anInt9066;
			local209 = (local174 + (float) this.aShort70) * (float) this.aClass45_Sub3_28.anInt9066;
		} else {
			local198 = (local174 - (float) this.aShort70) * (float) this.aClass45_Sub3_28.anInt9066;
			local209 = (float) this.aClass45_Sub3_28.anInt9066 * ((float) this.aShort70 + local182);
		}
		if (local198 / local90 >= this.aClass45_Sub3_28.aFloat183 || this.aClass45_Sub3_28.aFloat200 >= local209 / local90) {
			return;
		}
		Static417.aFloat142 = local16.aFloat113 * local19.aFloat108 + local16.aFloat109 * local19.aFloat109 + local16.aFloat107 * local19.aFloat112;
		Static537.aFloat158 = local16.aFloat107 * local19.aFloat103 + local16.aFloat109 * local19.aFloat106 + local16.aFloat113 * local19.aFloat105 + local16.aFloat106;
		@Pc(298) float local298 = Static537.aFloat158 + Static417.aFloat142 * (float) this.aShort74;
		@Pc(306) float local306 = Static537.aFloat158 + Static417.aFloat142 * (float) this.aShort73;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local298 > local306) {
			local322 = ((float) -this.aShort70 + local306) * (float) this.aClass45_Sub3_28.anInt9086;
			local333 = (float) this.aClass45_Sub3_28.anInt9086 * ((float) this.aShort70 + local298);
		} else {
			local333 = (float) this.aClass45_Sub3_28.anInt9086 * ((float) this.aShort70 + local306);
			local322 = ((float) -this.aShort70 + local298) * (float) this.aClass45_Sub3_28.anInt9086;
		}
		if (local322 / local90 >= this.aClass45_Sub3_28.aFloat193 || local333 / local90 <= this.aClass45_Sub3_28.aFloat199) {
			return;
		}
		if (arg1 != null || this.aClass324Array1 != null) {
			Static36.aFloat17 = local16.aFloat108 * local19.aFloat107 + local19.aFloat104 * local16.aFloat114 + local19.aFloat110 * local16.aFloat104;
			Static94.aFloat44 = local16.aFloat110 * local19.aFloat111 + local16.aFloat112 * local19.aFloat113 + local19.aFloat114 * local16.aFloat111;
			Static229.aFloat96 = local19.aFloat113 * local16.aFloat108 + local16.aFloat114 * local19.aFloat114 + local19.aFloat111 * local16.aFloat104;
			Static306.aFloat116 = local19.aFloat104 * local16.aFloat111 + local19.aFloat107 * local16.aFloat112 + local16.aFloat110 * local19.aFloat110;
			Static153.aFloat87 = local16.aFloat109 * local19.aFloat113 + local16.aFloat113 * local19.aFloat114 + local19.aFloat111 * local16.aFloat107;
			Static218.aFloat95 = local19.aFloat110 * local16.aFloat107 + local16.aFloat113 * local19.aFloat104 + local19.aFloat107 * local16.aFloat109;
		}
		if (arg1 != null) {
			@Pc(493) boolean local493 = false;
			@Pc(495) boolean local495 = true;
			@Pc(503) int local503 = this.aShort68 + this.aShort71 >> 1;
			@Pc(511) int local511 = this.aShort66 + this.aShort72 >> 1;
			@Pc(530) int local530 = (int) ((float) local511 * Static36.aFloat17 + Static229.aFloat96 * (float) local503 + Static461.aFloat145 + Static464.aFloat147 * (float) this.aShort74);
			@Pc(549) int local549 = (int) (Static537.aFloat158 + (float) local503 * Static153.aFloat87 + (float) this.aShort74 * Static417.aFloat142 + Static218.aFloat95 * (float) local511);
			@Pc(568) int local568 = (int) (Static160.aFloat89 * (float) this.aShort74 + Static94.aFloat44 * (float) local503 + Static473.aFloat150 + (float) local511 * Static306.aFloat116);
			if (this.aClass45_Sub3_28.anInt9081 <= local568) {
				arg1.anInt8516 = this.aClass45_Sub3_28.anInt9083 + local549 * this.aClass45_Sub3_28.anInt9086 / local568;
				arg1.anInt8513 = this.aClass45_Sub3_28.anInt9066 * local530 / local568 + this.aClass45_Sub3_28.anInt9073;
			} else {
				local493 = true;
			}
			@Pc(623) int local623 = (int) (Static464.aFloat147 * (float) this.aShort73 + Static229.aFloat96 * (float) local503 + Static461.aFloat145 + Static36.aFloat17 * (float) local511);
			@Pc(642) int local642 = (int) ((float) local503 * Static153.aFloat87 + Static537.aFloat158 + (float) this.aShort73 * Static417.aFloat142 + Static218.aFloat95 * (float) local511);
			@Pc(661) int local661 = (int) (Static160.aFloat89 * (float) this.aShort73 + Static94.aFloat44 * (float) local503 + Static473.aFloat150 + Static306.aFloat116 * (float) local511);
			if (this.aClass45_Sub3_28.anInt9081 <= local661) {
				arg1.anInt8512 = this.aClass45_Sub3_28.anInt9073 + local623 * this.aClass45_Sub3_28.anInt9066 / local661;
				arg1.anInt8514 = this.aClass45_Sub3_28.anInt9086 * local642 / local661 + this.aClass45_Sub3_28.anInt9083;
			} else {
				local493 = true;
			}
			if (local493) {
				if (this.aClass45_Sub3_28.anInt9081 > local568 && this.aClass45_Sub3_28.anInt9081 > local661) {
					local495 = false;
				} else {
					@Pc(739) int local739;
					@Pc(750) int local750;
					@Pc(760) int local760;
					if (this.aClass45_Sub3_28.anInt9081 > local568) {
						local739 = (local661 - this.aClass45_Sub3_28.anInt9081 << 16) / (local661 - local568);
						local750 = ((local623 - local530) * local739 >> 16) + local623;
						local760 = local642 + ((local642 - local549) * local739 >> 16);
						arg1.anInt8513 = this.aClass45_Sub3_28.anInt9073 + this.aClass45_Sub3_28.anInt9066 * local750 / this.aClass45_Sub3_28.anInt9081;
						arg1.anInt8516 = this.aClass45_Sub3_28.anInt9083 + local760 * this.aClass45_Sub3_28.anInt9086 / this.aClass45_Sub3_28.anInt9081;
					} else if (local661 < this.aClass45_Sub3_28.anInt9081) {
						local739 = (local568 - this.aClass45_Sub3_28.anInt9081 << 16) / (local568 - local661);
						local750 = (local739 * (local530 - local623) >> 16) + local530;
						local760 = ((local549 - local642) * local739 >> 16) + local549;
						arg1.anInt8513 = this.aClass45_Sub3_28.anInt9073 + this.aClass45_Sub3_28.anInt9066 * local750 / this.aClass45_Sub3_28.anInt9081;
						arg1.anInt8516 = this.aClass45_Sub3_28.anInt9083 + this.aClass45_Sub3_28.anInt9086 * local760 / this.aClass45_Sub3_28.anInt9081;
					}
				}
			}
			if (local495) {
				if (local661 < local568) {
					arg1.anInt8515 = this.aClass45_Sub3_28.anInt9066 * (local530 + this.aShort70) / local568 + this.aClass45_Sub3_28.anInt9073 - arg1.anInt8513;
				} else {
					arg1.anInt8515 = (this.aShort70 + local623) * this.aClass45_Sub3_28.anInt9066 / local661 + this.aClass45_Sub3_28.anInt9073 - arg1.anInt8512;
				}
				arg1.aBoolean658 = true;
			}
		}
		this.aClass45_Sub3_28.method7493();
		this.aClass45_Sub3_28.method7472(local19);
		this.method3834();
		this.aClass45_Sub3_28.method7449();
		this.method3842();
	}

	@OriginalMember(owner = "client!jg", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean330) {
			this.method3836();
		}
		return this.aShort68;
	}

	@OriginalMember(owner = "client!jg", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean330) {
			this.method3836();
		}
		return this.aShort70;
	}

	@OriginalMember(owner = "client!jg", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean330) {
			this.method3836();
		}
		return this.aShort74;
	}

	@OriginalMember(owner = "client!jg", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort67 = (short) arg0;
		if (this.aClass126_6 != null) {
			this.aClass126_6.anInterface21_2 = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!q;IZIII)Z")
	private boolean method3843(@OriginalArg(0) Class11 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class11_Sub2 local8 = (Class11_Sub2) arg0;
		@Pc(12) Class11_Sub2 local12 = this.aClass45_Sub3_28.aClass11_Sub2_3;
		@Pc(33) float local33 = local12.aFloat105 + local12.aFloat114 * local8.aFloat105 + local12.aFloat108 * local8.aFloat106 + local8.aFloat103 * local12.aFloat104;
		@Pc(54) float local54 = local12.aFloat106 + local8.aFloat106 * local12.aFloat109 + local8.aFloat105 * local12.aFloat113 + local8.aFloat103 * local12.aFloat107;
		Static417.aFloat142 = local12.aFloat107 * local8.aFloat112 + local8.aFloat109 * local12.aFloat109 + local12.aFloat113 * local8.aFloat108;
		Static94.aFloat44 = local8.aFloat114 * local12.aFloat111 + local12.aFloat112 * local8.aFloat113 + local12.aFloat110 * local8.aFloat111;
		Static160.aFloat89 = local12.aFloat111 * local8.aFloat108 + local8.aFloat109 * local12.aFloat112 + local8.aFloat112 * local12.aFloat110;
		Static36.aFloat17 = local12.aFloat104 * local8.aFloat110 + local12.aFloat114 * local8.aFloat104 + local8.aFloat107 * local12.aFloat108;
		Static306.aFloat116 = local8.aFloat104 * local12.aFloat111 + local12.aFloat112 * local8.aFloat107 + local8.aFloat110 * local12.aFloat110;
		Static229.aFloat96 = local12.aFloat104 * local8.aFloat111 + local12.aFloat108 * local8.aFloat113 + local12.aFloat114 * local8.aFloat114;
		Static218.aFloat95 = local12.aFloat107 * local8.aFloat110 + local8.aFloat104 * local12.aFloat113 + local8.aFloat107 * local12.aFloat109;
		@Pc(201) float local201 = local12.aFloat110 * local8.aFloat103 + local8.aFloat105 * local12.aFloat111 + local12.aFloat112 * local8.aFloat106 + local12.aFloat103;
		Static153.aFloat87 = local8.aFloat113 * local12.aFloat109 + local12.aFloat113 * local8.aFloat114 + local12.aFloat107 * local8.aFloat111;
		Static464.aFloat147 = local8.aFloat112 * local12.aFloat104 + local12.aFloat114 * local8.aFloat108 + local8.aFloat109 * local12.aFloat108;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass45_Sub3_28.anInt9066;
		@Pc(255) int local255 = this.aClass45_Sub3_28.anInt9086;
		if (!this.aBoolean330) {
			this.method3836();
		}
		Static579.anIntArray607[0] = this.aShort68;
		Static298.anIntArray288[0] = this.aShort74;
		Static113.anIntArray100[0] = this.aShort66;
		Static579.anIntArray607[1] = this.aShort71;
		Static298.anIntArray288[1] = this.aShort74;
		Static113.anIntArray100[1] = this.aShort66;
		Static579.anIntArray607[2] = this.aShort68;
		Static298.anIntArray288[2] = this.aShort73;
		Static113.anIntArray100[2] = this.aShort66;
		Static579.anIntArray607[3] = this.aShort71;
		Static298.anIntArray288[3] = this.aShort73;
		Static579.anIntArray607[4] = this.aShort68;
		Static113.anIntArray100[3] = this.aShort66;
		Static298.anIntArray288[4] = this.aShort74;
		Static113.anIntArray100[4] = this.aShort72;
		Static579.anIntArray607[5] = this.aShort71;
		Static298.anIntArray288[5] = this.aShort74;
		Static579.anIntArray607[6] = this.aShort68;
		Static113.anIntArray100[5] = this.aShort72;
		Static298.anIntArray288[6] = this.aShort73;
		Static579.anIntArray607[7] = this.aShort71;
		Static113.anIntArray100[6] = this.aShort72;
		Static298.anIntArray288[7] = this.aShort73;
		Static113.anIntArray100[7] = this.aShort72;
		@Pc(436) float local436;
		@Pc(450) float local450;
		@Pc(422) float local422;
		@Pc(398) float local398;
		@Pc(408) float local408;
		@Pc(403) float local403;
		for (@Pc(391) int local391 = 0; local391 < 8; local391++) {
			local398 = Static579.anIntArray607[local391];
			local403 = Static113.anIntArray100[local391];
			local408 = Static298.anIntArray288[local391];
			local422 = local201 + Static306.aFloat116 * local403 + local408 * Static160.aFloat89 + Static94.aFloat44 * local398;
			local436 = local33 + local408 * Static464.aFloat147 + local398 * Static229.aFloat96 + local403 * Static36.aFloat17;
			local450 = local54 + Static218.aFloat95 * local403 + local408 * Static417.aFloat142 + Static153.aFloat87 * local398;
			if (local422 >= (float) this.aClass45_Sub3_28.anInt9081) {
				if (arg3 > 0) {
					local422 = arg3;
				}
				@Pc(474) float local474 = local436 * (float) local251 / local422 + (float) this.aClass45_Sub3_28.anInt9073;
				if (local474 > local243) {
					local243 = local474;
				}
				@Pc(492) float local492 = (float) this.aClass45_Sub3_28.anInt9083 + (float) local255 * local450 / local422;
				if (local474 < local241) {
					local241 = local474;
				}
				local239 = true;
				if (local247 < local492) {
					local247 = local492;
				}
				if (local492 < local245) {
					local245 = local492;
				}
			}
		}
		if (local239 && local241 < (float) arg2 && local243 > (float) arg2 && (float) arg4 > local245 && local247 > (float) arg4) {
			if (arg1) {
				return true;
			}
			if (this.aClass45_Sub3_28.anIntArray583.length < this.anInt4400) {
				this.aClass45_Sub3_28.anIntArray582 = new int[this.anInt4400];
				this.aClass45_Sub3_28.anIntArray583 = new int[this.anInt4400];
			}
			@Pc(571) int[] local571 = this.aClass45_Sub3_28.anIntArray583;
			@Pc(575) int[] local575 = this.aClass45_Sub3_28.anIntArray582;
			@Pc(651) int local651;
			for (@Pc(577) int local577 = 0; local577 < this.anInt4368; local577++) {
				local408 = this.anIntArray237[local577];
				local398 = this.anIntArray235[local577];
				local403 = this.anIntArray233[local577];
				local436 = Static36.aFloat17 * local403 + local408 * Static464.aFloat147 + local398 * Static229.aFloat96 + local33;
				local422 = local408 * Static160.aFloat89 + Static94.aFloat44 * local398 + Static306.aFloat116 * local403 + local201;
				local450 = Static218.aFloat95 * local403 + Static153.aFloat87 * local398 + local408 * Static417.aFloat142 + local54;
				@Pc(658) int local658;
				@Pc(660) int local660;
				@Pc(669) int local669;
				if (local422 >= (float) this.aClass45_Sub3_28.anInt9081) {
					if (arg3 > 0) {
						local422 = arg3;
					}
					local651 = (int) ((float) local251 * local436 / local422 + (float) this.aClass45_Sub3_28.anInt9073);
					local658 = (int) (local450 * (float) local255 / local422 + (float) this.aClass45_Sub3_28.anInt9083);
					local660 = this.anIntArray236[local577];
					local669 = this.anIntArray236[local577 + 1];
					for (@Pc(737) int local737 = local660; local737 < local669; local737++) {
						@Pc(746) int local746 = this.aShortArray69[local737] - 1;
						if (local746 == -1) {
							break;
						}
						local571[local746] = local651;
						local575[local746] = local658;
					}
				} else {
					local651 = this.anIntArray236[local577];
					local658 = this.anIntArray236[local577 + 1];
					for (local660 = local651; local660 < local658; local660++) {
						local669 = this.aShortArray69[local660] - 1;
						if (local669 == -1) {
							break;
						}
						local571[this.aShortArray69[local660] - 1] = -999999;
					}
				}
			}
			for (local651 = 0; local651 < this.anInt4423; local651++) {
				if (local571[this.aShortArray70[local651]] != -999999 && local571[this.aShortArray76[local651]] != -999999 && local571[this.aShortArray67[local651]] != -999999 && this.method3838(local571[this.aShortArray70[local651]], local575[this.aShortArray70[local651]], arg2, local575[this.aShortArray76[local651]], arg4, local575[this.aShortArray67[local651]], local571[this.aShortArray76[local651]], local571[this.aShortArray67[local651]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jg", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4368; local7++) {
			this.anIntArray233[local7] = -this.anIntArray233[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt4400; local25++) {
			this.aShortArray74[local25] = (short) -this.aShortArray74[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt4423; local48++) {
			@Pc(55) short local55 = this.aShortArray70[local48];
			this.aShortArray70[local48] = this.aShortArray67[local48];
			this.aShortArray67[local48] = local55;
		}
		if (this.aClass126_5 == null && this.aClass126_6 != null) {
			this.aClass126_6.anInterface21_2 = null;
		}
		if (this.aClass126_5 != null) {
			this.aClass126_5.anInterface21_2 = null;
		}
		if (this.aClass74_1 != null) {
			this.aClass74_1.anInterface2_1 = null;
		}
		this.aBoolean330 = false;
		if (this.aClass126_7 != null) {
			this.aClass126_7.anInterface21_2 = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7236(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
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
			Static389.anInt409 = 0;
			Static585.anInt9432 = 0;
			local31 = 0;
			Static525.anInt8434 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray99.length) {
					local55 = this.anIntArrayArray99[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static585.anInt9432 += this.anIntArray235[local63];
						Static389.anInt409 += this.anIntArray237[local63];
						Static525.anInt8434 += this.anIntArray233[local63];
						local31++;
					}
				}
			}
			if (local31 <= 0) {
				Static525.anInt8434 = local21;
				Static585.anInt9432 = local17;
				Static389.anInt409 = local25;
			} else {
				Static525.anInt8434 = Static525.anInt8434 / local31 + local21;
				Static585.anInt9432 = local17 + Static585.anInt9432 / local31;
				Static389.anInt409 = local25 + Static389.anInt409 / local31;
			}
			return;
		}
		@Pc(167) int[] local167;
		@Pc(169) int local169;
		if (arg0 == 1) {
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			local17 = arg2 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray99.length) {
					local167 = this.anIntArrayArray99[local35];
					for (local169 = 0; local169 < local167.length; local169++) {
						local57 = local167[local169];
						this.anIntArray235[local57] += local17;
						this.anIntArray237[local57] += local25;
						this.anIntArray233[local57] += local21;
					}
				}
			}
			return;
		}
		@Pc(288) int local288;
		@Pc(307) int local307;
		@Pc(753) int local753;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray99.length > local35) {
					local167 = this.anIntArrayArray99[local35];
					if ((arg5 & 0x1) == 0) {
						for (local169 = 0; local169 < local167.length; local169++) {
							local57 = local167[local169];
							this.anIntArray235[local57] -= Static585.anInt9432;
							this.anIntArray237[local57] -= Static389.anInt409;
							this.anIntArray233[local57] -= Static525.anInt8434;
							if (arg4 != 0) {
								local63 = Class356.anIntArray597[arg4];
								local288 = Class356.anIntArray598[arg4];
								local307 = local288 * this.anIntArray235[local57] + this.anIntArray237[local57] * local63 + 16383 >> 14;
								this.anIntArray237[local57] = local288 * this.anIntArray237[local57] + 16383 - this.anIntArray235[local57] * local63 >> 14;
								this.anIntArray235[local57] = local307;
							}
							if (arg2 != 0) {
								local63 = Class356.anIntArray597[arg2];
								local288 = Class356.anIntArray598[arg2];
								local307 = this.anIntArray237[local57] * local288 + 16383 - local63 * this.anIntArray233[local57] >> 14;
								this.anIntArray233[local57] = this.anIntArray237[local57] * local63 + local288 * this.anIntArray233[local57] + 16383 >> 14;
								this.anIntArray237[local57] = local307;
							}
							if (arg3 != 0) {
								local63 = Class356.anIntArray597[arg3];
								local288 = Class356.anIntArray598[arg3];
								local307 = local63 * this.anIntArray233[local57] + local288 * this.anIntArray235[local57] + 16383 >> 14;
								this.anIntArray233[local57] = local288 * this.anIntArray233[local57] + 16383 - this.anIntArray235[local57] * local63 >> 14;
								this.anIntArray235[local57] = local307;
							}
							this.anIntArray235[local57] += Static585.anInt9432;
							this.anIntArray237[local57] += Static389.anInt409;
							this.anIntArray233[local57] += Static525.anInt8434;
						}
					} else {
						for (local169 = 0; local169 < local167.length; local169++) {
							local57 = local167[local169];
							this.anIntArray235[local57] -= Static585.anInt9432;
							this.anIntArray237[local57] -= Static389.anInt409;
							this.anIntArray233[local57] -= Static525.anInt8434;
							if (arg2 != 0) {
								local63 = Class356.anIntArray597[arg2];
								local288 = Class356.anIntArray598[arg2];
								local307 = this.anIntArray237[local57] * local288 + 16383 - local63 * this.anIntArray233[local57] >> 14;
								this.anIntArray233[local57] = local288 * this.anIntArray233[local57] + this.anIntArray237[local57] * local63 + 16383 >> 14;
								this.anIntArray237[local57] = local307;
							}
							if (arg4 != 0) {
								local63 = Class356.anIntArray597[arg4];
								local288 = Class356.anIntArray598[arg4];
								local307 = this.anIntArray235[local57] * local288 + local63 * this.anIntArray237[local57] + 16383 >> 14;
								this.anIntArray237[local57] = this.anIntArray237[local57] * local288 + 16383 - this.anIntArray235[local57] * local63 >> 14;
								this.anIntArray235[local57] = local307;
							}
							if (arg3 != 0) {
								local63 = Class356.anIntArray597[arg3];
								local288 = Class356.anIntArray598[arg3];
								local307 = local288 * this.anIntArray235[local57] + local63 * this.anIntArray233[local57] + 16383 >> 14;
								this.anIntArray233[local57] = this.anIntArray233[local57] * local288 + 16383 - this.anIntArray235[local57] * local63 >> 14;
								this.anIntArray235[local57] = local307;
							}
							this.anIntArray235[local57] += Static585.anInt9432;
							this.anIntArray237[local57] += Static389.anInt409;
							this.anIntArray233[local57] += Static525.anInt8434;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray99.length > local41) {
						local55 = this.anIntArrayArray99[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local288 = this.anIntArray236[local63];
							local307 = this.anIntArray236[local63 + 1];
							for (local753 = local288; local753 < local307; local753++) {
								@Pc(762) int local762 = this.aShortArray69[local753] - 1;
								if (local762 == -1) {
									break;
								}
								@Pc(772) int local772;
								@Pc(776) int local776;
								@Pc(794) int local794;
								if (arg4 != 0) {
									local772 = Class356.anIntArray597[arg4];
									local776 = Class356.anIntArray598[arg4];
									local794 = this.aShortArray72[local762] * local772 + local776 * this.aShortArray77[local762] + 16383 >> 14;
									this.aShortArray72[local762] = (short) (this.aShortArray72[local762] * local776 + 16383 - local772 * this.aShortArray77[local762] >> 14);
									this.aShortArray77[local762] = (short) local794;
								}
								if (arg2 != 0) {
									local772 = Class356.anIntArray597[arg2];
									local776 = Class356.anIntArray598[arg2];
									local794 = this.aShortArray72[local762] * local776 + 16383 - local772 * this.aShortArray74[local762] >> 14;
									this.aShortArray74[local762] = (short) (this.aShortArray74[local762] * local776 + this.aShortArray72[local762] * local772 + 16383 >> 14);
									this.aShortArray72[local762] = (short) local794;
								}
								if (arg3 != 0) {
									local772 = Class356.anIntArray597[arg3];
									local776 = Class356.anIntArray598[arg3];
									local794 = this.aShortArray77[local762] * local776 + local772 * this.aShortArray74[local762] + 16383 >> 14;
									this.aShortArray74[local762] = (short) (this.aShortArray74[local762] * local776 + 16383 - local772 * this.aShortArray77[local762] >> 14);
									this.aShortArray77[local762] = (short) local794;
								}
							}
						}
					}
				}
				if (this.aClass126_5 == null && this.aClass126_6 != null) {
					this.aClass126_6.anInterface21_2 = null;
				}
				if (this.aClass126_5 != null) {
					this.aClass126_5.anInterface21_2 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray99.length > local35) {
					local167 = this.anIntArrayArray99[local35];
					for (local169 = 0; local169 < local167.length; local169++) {
						local57 = local167[local169];
						this.anIntArray235[local57] -= Static585.anInt9432;
						this.anIntArray237[local57] -= Static389.anInt409;
						this.anIntArray233[local57] -= Static525.anInt8434;
						this.anIntArray235[local57] = this.anIntArray235[local57] * arg2 >> 7;
						this.anIntArray237[local57] = this.anIntArray237[local57] * arg3 >> 7;
						this.anIntArray233[local57] = this.anIntArray233[local57] * arg4 >> 7;
						this.anIntArray235[local57] += Static585.anInt9432;
						this.anIntArray237[local57] += Static389.anInt409;
						this.anIntArray233[local57] += Static525.anInt8434;
					}
				}
			}
		} else {
			@Pc(1200) Class324 local1200;
			@Pc(1205) Class287 local1205;
			if (arg0 == 5) {
				if (this.anIntArrayArray101 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray101.length > local35) {
							local167 = this.anIntArrayArray101[local35];
							for (local169 = 0; local169 < local167.length; local169++) {
								local57 = local167[local169];
								local63 = arg2 * 8 + (this.aByteArray53[local57] & 0xFF);
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray53[local57] = (byte) local63;
							}
							if (local167.length > 0 && this.aClass126_6 != null) {
								this.aClass126_6.anInterface21_2 = null;
							}
						}
					}
					if (this.aClass324Array1 != null) {
						for (local35 = 0; local35 < this.anInt4399; local35++) {
							local1200 = this.aClass324Array1[local35];
							local1205 = this.aClass287Array1[local35];
							local1205.anInt7689 = local1205.anInt7689 & 0xFFFFFF | 255 - (this.aByteArray53[local1200.anInt8247] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1451) Class287 local1451;
				if (arg0 == 8) {
					if (this.anIntArrayArray100 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray100.length > local35) {
								local167 = this.anIntArrayArray100[local35];
								for (local169 = 0; local169 < local167.length; local169++) {
									local1451 = this.aClass287Array1[local167[local169]];
									local1451.anInt7686 += arg2;
									local1451.anInt7692 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray100 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray100.length > local35) {
								local167 = this.anIntArrayArray100[local35];
								for (local169 = 0; local169 < local167.length; local169++) {
									local1451 = this.aClass287Array1[local167[local169]];
									local1451.anInt7687 = local1451.anInt7687 * arg3 >> 7;
									local1451.anInt7693 = arg2 * local1451.anInt7693 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray100 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray100.length > local35) {
							local167 = this.anIntArrayArray100[local35];
							for (local169 = 0; local169 < local167.length; local169++) {
								local1451 = this.aClass287Array1[local167[local169]];
								local1451.anInt7690 = arg2 + local1451.anInt7690 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray101 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray101.length) {
						local167 = this.anIntArrayArray101[local35];
						for (local169 = 0; local169 < local167.length; local169++) {
							local57 = local167[local169];
							local63 = this.aShortArray68[local57] & 0xFFFF;
							local288 = local63 >> 10 & 0x3F;
							local307 = local63 >> 7 & 0x7;
							@Pc(1291) int local1291 = arg2 + local288 & 0x3F;
							local753 = local63 & 0x7F;
							local307 += arg3 / 4;
							local753 += arg4;
							if (local307 < 0) {
								local307 = 0;
							} else if (local307 > 7) {
								local307 = 7;
							}
							if (local753 < 0) {
								local753 = 0;
							} else if (local753 > 127) {
								local753 = 127;
							}
							this.aShortArray68[local57] = (short) (local307 << 7 | local1291 << 10 | local753);
						}
						if (local167.length > 0 && this.aClass126_6 != null) {
							this.aClass126_6.anInterface21_2 = null;
						}
					}
				}
				if (this.aClass324Array1 != null) {
					for (local35 = 0; local35 < this.anInt4399; local35++) {
						local1200 = this.aClass324Array1[local35];
						local1205 = this.aClass287Array1[local35];
						local1205.anInt7689 = local1205.anInt7689 & 0xFF000000 | Static214.anIntArray203[this.aShortArray68[local1200.anInt8247] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean330) {
			this.method3836();
		}
		return this.aShort73;
	}

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4427; local7++) {
			this.anIntArray235[local7] = this.anIntArray235[local7] + 7 >> 4;
			this.anIntArray237[local7] = this.anIntArray237[local7] + 7 >> 4;
			this.anIntArray233[local7] = this.anIntArray233[local7] + 7 >> 4;
		}
		this.aBoolean330 = false;
		if (this.aClass126_7 != null) {
			this.aClass126_7.anInterface21_2 = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!q;Lclient!ufa;II)V")
	@Override
	public void method7224(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class41_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4400 == 0) {
			return;
		}
		@Pc(16) Class11_Sub2 local16 = this.aClass45_Sub3_28.aClass11_Sub2_3;
		@Pc(19) Class11_Sub2 local19 = (Class11_Sub2) arg0;
		if (!this.aBoolean330) {
			this.method3836();
		}
		Static473.aFloat150 = local16.aFloat110 * local19.aFloat103 + local19.aFloat105 * local16.aFloat111 + local16.aFloat112 * local19.aFloat106 + local16.aFloat103;
		Static160.aFloat89 = local19.aFloat112 * local16.aFloat110 + local16.aFloat111 * local19.aFloat108 + local19.aFloat109 * local16.aFloat112;
		@Pc(72) float local72 = Static473.aFloat150 + Static160.aFloat89 * (float) this.aShort74;
		@Pc(80) float local80 = Static160.aFloat89 * (float) this.aShort73 + Static473.aFloat150;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local80 < local72) {
			local97 = local80 - (float) this.aShort70;
			local90 = (float) this.aShort70 + local72;
		} else {
			local90 = (float) this.aShort70 + local80;
			local97 = (float) -this.aShort70 + local72;
		}
		if (local97 >= this.aClass45_Sub3_28.aFloat190 || (float) this.aClass45_Sub3_28.anInt9081 >= local90) {
			return;
		}
		Static461.aFloat145 = local16.aFloat105 + local19.aFloat103 * local16.aFloat104 + local19.aFloat105 * local16.aFloat114 + local16.aFloat108 * local19.aFloat106;
		Static464.aFloat147 = local16.aFloat104 * local19.aFloat112 + local16.aFloat108 * local19.aFloat109 + local16.aFloat114 * local19.aFloat108;
		@Pc(173) float local173 = Static464.aFloat147 * (float) this.aShort74 + Static461.aFloat145;
		@Pc(181) float local181 = Static461.aFloat145 + (float) this.aShort73 * Static464.aFloat147;
		@Pc(208) float local208;
		@Pc(196) float local196;
		if (local181 < local173) {
			local196 = ((float) this.aShort70 + local173) * (float) this.aClass45_Sub3_28.anInt9066;
			local208 = (float) this.aClass45_Sub3_28.anInt9066 * ((float) -this.aShort70 + local181);
		} else {
			local196 = (float) this.aClass45_Sub3_28.anInt9066 * ((float) this.aShort70 + local181);
			local208 = (float) this.aClass45_Sub3_28.anInt9066 * ((float) -this.aShort70 + local173);
		}
		if (local208 / (float) arg2 >= this.aClass45_Sub3_28.aFloat183 || this.aClass45_Sub3_28.aFloat200 >= local196 / (float) arg2) {
			return;
		}
		Static537.aFloat158 = local16.aFloat106 + local16.aFloat107 * local19.aFloat103 + local19.aFloat105 * local16.aFloat113 + local16.aFloat109 * local19.aFloat106;
		Static417.aFloat142 = local16.aFloat107 * local19.aFloat112 + local16.aFloat109 * local19.aFloat109 + local19.aFloat108 * local16.aFloat113;
		@Pc(300) float local300 = Static537.aFloat158 + (float) this.aShort74 * Static417.aFloat142;
		@Pc(308) float local308 = (float) this.aShort73 * Static417.aFloat142 + Static537.aFloat158;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local308 < local300) {
			local323 = (float) this.aClass45_Sub3_28.anInt9086 * (local308 - (float) this.aShort70);
			local334 = ((float) this.aShort70 + local300) * (float) this.aClass45_Sub3_28.anInt9086;
		} else {
			local323 = (local300 - (float) this.aShort70) * (float) this.aClass45_Sub3_28.anInt9086;
			local334 = (local308 + (float) this.aShort70) * (float) this.aClass45_Sub3_28.anInt9086;
		}
		if (local323 / (float) arg2 >= this.aClass45_Sub3_28.aFloat193 || this.aClass45_Sub3_28.aFloat199 >= local334 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass324Array1 != null) {
			Static36.aFloat17 = local19.aFloat110 * local16.aFloat104 + local16.aFloat114 * local19.aFloat104 + local19.aFloat107 * local16.aFloat108;
			Static94.aFloat44 = local19.aFloat113 * local16.aFloat112 + local16.aFloat111 * local19.aFloat114 + local19.aFloat111 * local16.aFloat110;
			Static306.aFloat116 = local16.aFloat110 * local19.aFloat110 + local19.aFloat104 * local16.aFloat111 + local16.aFloat112 * local19.aFloat107;
			Static229.aFloat96 = local16.aFloat104 * local19.aFloat111 + local16.aFloat108 * local19.aFloat113 + local16.aFloat114 * local19.aFloat114;
			Static153.aFloat87 = local19.aFloat113 * local16.aFloat109 + local16.aFloat113 * local19.aFloat114 + local19.aFloat111 * local16.aFloat107;
			Static218.aFloat95 = local16.aFloat107 * local19.aFloat110 + local16.aFloat109 * local19.aFloat107 + local16.aFloat113 * local19.aFloat104;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort68 + this.aShort71 >> 1;
			@Pc(509) int local509 = this.aShort72 + this.aShort66 >> 1;
			@Pc(528) int local528 = (int) ((float) local509 * Static36.aFloat17 + Static229.aFloat96 * (float) local501 + Static461.aFloat145 + Static464.aFloat147 * (float) this.aShort74);
			@Pc(547) int local547 = (int) ((float) local509 * Static218.aFloat95 + (float) this.aShort74 * Static417.aFloat142 + Static537.aFloat158 + (float) local501 * Static153.aFloat87);
			@Pc(566) int local566 = (int) (Static306.aFloat116 * (float) local509 + (float) this.aShort74 * Static160.aFloat89 + Static473.aFloat150 + Static94.aFloat44 * (float) local501);
			@Pc(585) int local585 = (int) ((float) local509 * Static36.aFloat17 + Static461.aFloat145 + Static229.aFloat96 * (float) local501 + Static464.aFloat147 * (float) this.aShort73);
			@Pc(604) int local604 = (int) ((float) local509 * Static218.aFloat95 + Static417.aFloat142 * (float) this.aShort73 + Static537.aFloat158 + Static153.aFloat87 * (float) local501);
			@Pc(623) int local623 = (int) (Static306.aFloat116 * (float) local509 + Static94.aFloat44 * (float) local501 + Static473.aFloat150 + (float) this.aShort73 * Static160.aFloat89);
			arg1.anInt8512 = local585 * this.aClass45_Sub3_28.anInt9066 / arg2 + this.aClass45_Sub3_28.anInt9073;
			arg1.anInt8516 = this.aClass45_Sub3_28.anInt9083 + this.aClass45_Sub3_28.anInt9086 * local547 / arg2;
			arg1.anInt8514 = this.aClass45_Sub3_28.anInt9083 + local604 * this.aClass45_Sub3_28.anInt9086 / arg2;
			arg1.anInt8513 = this.aClass45_Sub3_28.anInt9073 + local528 * this.aClass45_Sub3_28.anInt9066 / arg2;
			if (local566 >= this.aClass45_Sub3_28.anInt9081 || local623 >= this.aClass45_Sub3_28.anInt9081) {
				arg1.aBoolean658 = true;
				arg1.anInt8515 = (local528 + this.aShort70) * this.aClass45_Sub3_28.anInt9066 / arg2 + this.aClass45_Sub3_28.anInt9073 - arg1.anInt8513;
			}
		}
		this.aClass45_Sub3_28.method7455((float) arg2);
		this.aClass45_Sub3_28.method7511();
		this.aClass45_Sub3_28.method7472(local19);
		this.method3834();
		this.aClass45_Sub3_28.method7449();
		this.method3842();
	}

	@OriginalMember(owner = "client!jg", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4368; local3++) {
			if (arg0 != 0) {
				this.anIntArray235[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray237[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray233[local3] += arg2;
			}
		}
		this.aBoolean330 = false;
		if (this.aClass126_7 != null) {
			this.aClass126_7.anInterface21_2 = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "()Z")
	@Override
	public boolean method7242() {
		if (this.aShortArray73 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray73.length; local12++) {
			if (this.aShortArray73[local12] != -1 && !this.aClass45_Sub3_28.anInterface3_12.method4774(this.aShortArray73[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!jg;ZIZLclient!jg;)Lclient!da;")
	private Class60 method3844(@OriginalArg(1) Class60_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class60_Sub2 arg4) {
		arg4.anInt4368 = this.anInt4368;
		arg4.anInt4399 = this.anInt4399;
		arg4.aByte56 = 0;
		arg4.anInt4372 = this.anInt4372;
		arg4.aShort67 = this.aShort67;
		if ((arg2 & 0x100) == 0) {
			arg4.aBoolean329 = this.aBoolean329;
		} else {
			arg4.aBoolean329 = true;
		}
		arg4.anInt4412 = this.anInt4412;
		arg4.anInt4423 = this.anInt4423;
		arg4.aShort75 = this.aShort75;
		arg4.anInt4408 = arg2;
		arg4.anInt4400 = this.anInt4400;
		arg4.anInt4427 = this.anInt4427;
		@Pc(69) boolean local69 = Static230.method3587(this.anInt4412, arg2);
		@Pc(75) boolean local75 = Static246.method3792(this.anInt4412, arg2);
		@Pc(87) boolean local87 = Static64.method1419(this.anInt4412, arg2);
		@Pc(93) boolean local93 = local69 | local75 | local87;
		@Pc(198) int local198;
		if (local93) {
			if (!local69) {
				arg4.anIntArray235 = this.anIntArray235;
			} else if (arg0.anIntArray235 == null || arg0.anIntArray235.length < this.anInt4427) {
				arg4.anIntArray235 = arg0.anIntArray235 = new int[this.anInt4427];
			} else {
				arg4.anIntArray235 = arg0.anIntArray235;
			}
			if (!local75) {
				arg4.anIntArray237 = this.anIntArray237;
			} else if (arg0.anIntArray237 == null || this.anInt4427 > arg0.anIntArray237.length) {
				arg4.anIntArray237 = arg0.anIntArray237 = new int[this.anInt4427];
			} else {
				arg4.anIntArray237 = arg0.anIntArray237;
			}
			if (!local87) {
				arg4.anIntArray233 = this.anIntArray233;
			} else if (arg0.anIntArray233 == null || this.anInt4427 > arg0.anIntArray233.length) {
				arg4.anIntArray233 = arg0.anIntArray233 = new int[this.anInt4427];
			} else {
				arg4.anIntArray233 = arg0.anIntArray233;
			}
			for (local198 = 0; local198 < this.anInt4427; local198++) {
				if (local69) {
					arg4.anIntArray235[local198] = this.anIntArray235[local198];
				}
				if (local75) {
					arg4.anIntArray237[local198] = this.anIntArray237[local198];
				}
				if (local87) {
					arg4.anIntArray233[local198] = this.anIntArray233[local198];
				}
			}
		} else {
			arg4.anIntArray233 = this.anIntArray233;
			arg4.anIntArray235 = this.anIntArray235;
			arg4.anIntArray237 = this.anIntArray237;
		}
		if (Static429.method6065(this.anInt4412, arg2)) {
			if (arg1) {
				arg4.aByte56 = (byte) (arg4.aByte56 | 0x1);
			}
			arg4.aClass126_7 = arg0.aClass126_7;
			arg4.aClass126_7.anInterface21_2 = this.aClass126_7.anInterface21_2;
			arg4.aClass126_7.aByte36 = this.aClass126_7.aByte36;
		} else if (Static338.method4801(arg2, this.anInt4412)) {
			arg4.aClass126_7 = this.aClass126_7;
		} else {
			arg4.aClass126_7 = null;
		}
		if (Static595.method7948(this.anInt4412, arg2)) {
			if (arg0.aShortArray68 == null || arg0.aShortArray68.length < this.anInt4423) {
				arg4.aShortArray68 = arg0.aShortArray68 = new short[this.anInt4423];
			} else {
				arg4.aShortArray68 = arg0.aShortArray68;
			}
			for (local198 = 0; local198 < this.anInt4423; local198++) {
				arg4.aShortArray68[local198] = this.aShortArray68[local198];
			}
		} else {
			arg4.aShortArray68 = this.aShortArray68;
		}
		if (Static504.method6792(this.anInt4412, arg2)) {
			if (arg0.aByteArray53 == null || this.anInt4423 > arg0.aByteArray53.length) {
				arg4.aByteArray53 = arg0.aByteArray53 = new byte[this.anInt4423];
			} else {
				arg4.aByteArray53 = arg0.aByteArray53;
			}
			for (local198 = 0; local198 < this.anInt4423; local198++) {
				arg4.aByteArray53[local198] = this.aByteArray53[local198];
			}
		} else {
			arg4.aByteArray53 = this.aByteArray53;
		}
		if (Static380.method5566(this.anInt4412, arg2)) {
			if (arg1) {
				arg4.aByte56 = (byte) (arg4.aByte56 | 0x2);
			}
			arg4.aClass126_6 = arg0.aClass126_6;
			arg4.aClass126_6.anInterface21_2 = this.aClass126_6.anInterface21_2;
			arg4.aClass126_6.aByte36 = this.aClass126_6.aByte36;
		} else if (Static317.method4652(arg2, this.anInt4412)) {
			arg4.aClass126_6 = this.aClass126_6;
		} else {
			arg4.aClass126_6 = null;
		}
		@Pc(600) int local600;
		if (Static382.method5659(this.anInt4412, arg2)) {
			if (arg0.aShortArray77 == null || this.anInt4400 > arg0.aShortArray77.length) {
				local198 = this.anInt4400;
				arg4.aShortArray72 = arg0.aShortArray72 = new short[local198];
				arg4.aShortArray74 = arg0.aShortArray74 = new short[local198];
				arg4.aShortArray77 = arg0.aShortArray77 = new short[local198];
			} else {
				arg4.aShortArray77 = arg0.aShortArray77;
				arg4.aShortArray72 = arg0.aShortArray72;
				arg4.aShortArray74 = arg0.aShortArray74;
			}
			if (this.aClass139_1 == null) {
				for (local198 = 0; local198 < this.anInt4400; local198++) {
					arg4.aShortArray77[local198] = this.aShortArray77[local198];
					arg4.aShortArray72[local198] = this.aShortArray72[local198];
					arg4.aShortArray74[local198] = this.aShortArray74[local198];
				}
			} else {
				if (arg0.aClass139_1 == null) {
					arg0.aClass139_1 = new Class139();
				}
				@Pc(588) Class139 local588 = arg4.aClass139_1 = arg0.aClass139_1;
				if (local588.aShortArray53 == null || local588.aShortArray53.length < this.anInt4400) {
					local600 = this.anInt4400;
					local588.aByteArray42 = new byte[local600];
					local588.aShortArray54 = new short[local600];
					local588.aShortArray53 = new short[local600];
					local588.aShortArray52 = new short[local600];
				}
				for (local600 = 0; local600 < this.anInt4400; local600++) {
					arg4.aShortArray77[local600] = this.aShortArray77[local600];
					arg4.aShortArray72[local600] = this.aShortArray72[local600];
					arg4.aShortArray74[local600] = this.aShortArray74[local600];
					local588.aShortArray53[local600] = this.aClass139_1.aShortArray53[local600];
					local588.aShortArray52[local600] = this.aClass139_1.aShortArray52[local600];
					local588.aShortArray54[local600] = this.aClass139_1.aShortArray54[local600];
					local588.aByteArray42[local600] = this.aClass139_1.aByteArray42[local600];
				}
			}
			arg4.aByteArray54 = this.aByteArray54;
		} else {
			arg4.aByteArray54 = this.aByteArray54;
			arg4.aShortArray77 = this.aShortArray77;
			arg4.aClass139_1 = this.aClass139_1;
			arg4.aShortArray72 = this.aShortArray72;
			arg4.aShortArray74 = this.aShortArray74;
		}
		if (Static366.method5363(arg2, this.anInt4412)) {
			if (arg1) {
				arg4.aByte56 = (byte) (arg4.aByte56 | 0x4);
			}
			arg4.aClass126_5 = arg0.aClass126_5;
			arg4.aClass126_5.anInterface21_2 = this.aClass126_5.anInterface21_2;
			arg4.aClass126_5.aByte36 = this.aClass126_5.aByte36;
		} else if (Static574.method7711(this.anInt4412, arg2)) {
			arg4.aClass126_5 = this.aClass126_5;
		} else {
			arg4.aClass126_5 = null;
		}
		if (Static302.method4446(arg2, this.anInt4412)) {
			if (arg0.aFloatArray48 == null || arg0.aFloatArray48.length < this.anInt4423) {
				local198 = this.anInt4400;
				arg4.aFloatArray49 = arg0.aFloatArray49 = new float[local198];
				arg4.aFloatArray48 = arg0.aFloatArray48 = new float[local198];
			} else {
				arg4.aFloatArray48 = arg0.aFloatArray48;
				arg4.aFloatArray49 = arg0.aFloatArray49;
			}
			for (local198 = 0; local198 < this.anInt4400; local198++) {
				arg4.aFloatArray48[local198] = this.aFloatArray48[local198];
				arg4.aFloatArray49[local198] = this.aFloatArray49[local198];
			}
		} else {
			arg4.aFloatArray49 = this.aFloatArray49;
			arg4.aFloatArray48 = this.aFloatArray48;
		}
		if (Static187.method3171(arg2, this.anInt4412)) {
			arg4.aClass126_8 = arg0.aClass126_8;
			if (arg1) {
				arg4.aByte56 = (byte) (arg4.aByte56 | 0x8);
			}
			arg4.aClass126_8.aByte36 = this.aClass126_8.aByte36;
			arg4.aClass126_8.anInterface21_2 = this.aClass126_8.anInterface21_2;
		} else if (Static43.method703(this.anInt4412, arg2)) {
			arg4.aClass126_8 = this.aClass126_8;
		} else {
			arg4.aClass126_8 = null;
		}
		if (Static322.method4682(arg2, this.anInt4412)) {
			if (arg0.aShortArray70 == null || arg0.aShortArray70.length < this.anInt4423) {
				local198 = this.anInt4423;
				arg4.aShortArray76 = arg0.aShortArray76 = new short[local198];
				arg4.aShortArray70 = arg0.aShortArray70 = new short[local198];
				arg4.aShortArray67 = arg0.aShortArray67 = new short[local198];
			} else {
				arg4.aShortArray70 = arg0.aShortArray70;
				arg4.aShortArray67 = arg0.aShortArray67;
				arg4.aShortArray76 = arg0.aShortArray76;
			}
			for (local198 = 0; local198 < this.anInt4423; local198++) {
				arg4.aShortArray70[local198] = this.aShortArray70[local198];
				arg4.aShortArray76[local198] = this.aShortArray76[local198];
				arg4.aShortArray67[local198] = this.aShortArray67[local198];
			}
		} else {
			arg4.aShortArray67 = this.aShortArray67;
			arg4.aShortArray70 = this.aShortArray70;
			arg4.aShortArray76 = this.aShortArray76;
		}
		if (Static285.method4239(arg2, this.anInt4412)) {
			if (arg1) {
				arg4.aByte56 = (byte) (arg4.aByte56 | 0x10);
			}
			arg4.aClass74_1 = arg0.aClass74_1;
			arg4.aClass74_1.anInterface2_1 = this.aClass74_1.anInterface2_1;
		} else if (Static142.method2761(arg2, this.anInt4412)) {
			arg4.aClass74_1 = this.aClass74_1;
		} else {
			arg4.aClass74_1 = null;
		}
		if (Static407.method5863(arg2, this.anInt4412)) {
			if (arg0.aShortArray73 == null || arg0.aShortArray73.length < this.anInt4423) {
				local198 = this.anInt4423;
				arg4.aShortArray73 = arg0.aShortArray73 = new short[local198];
			} else {
				arg4.aShortArray73 = arg0.aShortArray73;
			}
			for (local198 = 0; local198 < this.anInt4423; local198++) {
				arg4.aShortArray73[local198] = this.aShortArray73[local198];
			}
		} else {
			arg4.aShortArray73 = this.aShortArray73;
		}
		if (!Static415.method7905(this.anInt4412, arg2)) {
			arg4.aClass287Array1 = this.aClass287Array1;
		} else if (arg0.aClass287Array1 == null || this.anInt4399 > arg0.aClass287Array1.length) {
			local198 = this.anInt4399;
			arg4.aClass287Array1 = arg0.aClass287Array1 = new Class287[local198];
			for (local600 = 0; local600 < this.anInt4399; local600++) {
				arg4.aClass287Array1[local600] = this.aClass287Array1[local600].method6405();
			}
		} else {
			arg4.aClass287Array1 = arg0.aClass287Array1;
			for (local198 = 0; local198 < this.anInt4399; local198++) {
				arg4.aClass287Array1[local198].method6407(this.aClass287Array1[local198]);
			}
		}
		arg4.aShortArray71 = this.aShortArray71;
		arg4.aShortArray69 = this.aShortArray69;
		arg4.aClass281Array3 = this.aClass281Array3;
		arg4.aShortArray75 = this.aShortArray75;
		arg4.anIntArrayArray99 = this.anIntArrayArray99;
		arg4.anIntArrayArray101 = this.anIntArrayArray101;
		arg4.anIntArray236 = this.anIntArray236;
		arg4.anIntArrayArray100 = this.anIntArrayArray100;
		arg4.aClass248Array3 = this.aClass248Array3;
		arg4.aClass324Array1 = this.aClass324Array1;
		if (this.aBoolean330) {
			arg4.aBoolean330 = true;
			arg4.aShort66 = this.aShort66;
			arg4.aShort68 = this.aShort68;
			arg4.aShort74 = this.aShort74;
			arg4.aShort72 = this.aShort72;
			arg4.aShort69 = this.aShort69;
			arg4.aShort70 = this.aShort70;
			arg4.aShort71 = this.aShort71;
			arg4.aShort73 = this.aShort73;
		} else {
			arg4.aBoolean330 = false;
		}
		arg4.anIntArray234 = this.anIntArray234;
		return arg4;
	}

	@OriginalMember(owner = "client!jg", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt4408;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZB)V")
	private void method3846(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass126_6 != null && this.aClass126_6.anInterface21_2 == null;
		@Pc(27) boolean local27 = this.aClass126_5 != null && this.aClass126_5.anInterface21_2 == null;
		@Pc(44) boolean local44 = this.aClass126_7 != null && this.aClass126_7.anInterface21_2 == null;
		@Pc(55) boolean local55 = this.aClass126_8 != null && this.aClass126_8.anInterface21_2 == null;
		if (arg0) {
			local44 &= (this.aByte56 & 0x1) != 0;
			local16 &= (this.aByte56 & 0x2) != 0;
			local27 &= (this.aByte56 & 0x4) != 0;
			local55 &= (this.aByte56 & 0x8) != 0;
		}
		@Pc(109) byte local109 = 0;
		@Pc(113) byte local113 = 0;
		@Pc(115) byte local115 = 0;
		if (local44) {
			local109 = 12;
		}
		@Pc(126) byte local126 = 0;
		if (local16) {
			local113 = local109;
			local109 = (byte) (local109 + 4);
		}
		if (local27) {
			local115 = local109;
			local109 = (byte) (local109 + 12);
		}
		if (local55) {
			local126 = local109;
			local109 = (byte) (local109 + 8);
		}
		if (local109 == 0) {
			return;
		}
		if (this.aClass45_Sub3_28.aClass3_Sub11_Sub2_3.aByteArray62.length < local109 * this.anInt4400) {
			this.aClass45_Sub3_28.aClass3_Sub11_Sub2_3 = new Class3_Sub11_Sub2(local109 * (this.anInt4400 + 100));
		} else {
			this.aClass45_Sub3_28.aClass3_Sub11_Sub2_3.anInt6128 = 0;
		}
		@Pc(189) Class3_Sub11_Sub2 local189 = this.aClass45_Sub3_28.aClass3_Sub11_Sub2_3;
		@Pc(197) int local197;
		@Pc(206) int local206;
		@Pc(234) int local234;
		@Pc(243) int local243;
		if (local44) {
			@Pc(213) int local213;
			@Pc(220) int local220;
			@Pc(225) int local225;
			@Pc(232) int local232;
			if (this.aClass45_Sub3_28.aBoolean687) {
				for (local197 = 0; local197 < this.anInt4368; local197++) {
					local206 = Stream.floatToRawIntBits((float) this.anIntArray235[local197]);
					local213 = Stream.floatToRawIntBits((float) this.anIntArray237[local197]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray233[local197]);
					local225 = this.anIntArray236[local197];
					local232 = this.anIntArray236[local197 + 1];
					for (local234 = local225; local234 < local232; local234++) {
						local243 = this.aShortArray69[local234] - 1;
						if (local243 == -1) {
							break;
						}
						local189.anInt6128 = local243 * local109;
						local189.method5215(local206);
						local189.method5215(local213);
						local189.method5215(local220);
					}
				}
			} else {
				for (local197 = 0; local197 < this.anInt4368; local197++) {
					local206 = Stream.floatToRawIntBits((float) this.anIntArray235[local197]);
					local213 = Stream.floatToRawIntBits((float) this.anIntArray237[local197]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray233[local197]);
					local225 = this.anIntArray236[local197];
					local232 = this.anIntArray236[local197 + 1];
					for (local234 = local225; local234 < local232; local234++) {
						local243 = this.aShortArray69[local234] - 1;
						if (local243 == -1) {
							break;
						}
						local189.anInt6128 = local243 * local109;
						local189.method5191(local206);
						local189.method5191(local213);
						local189.method5191(local220);
					}
				}
			}
		}
		@Pc(493) float local493;
		@Pc(366) short[] local366;
		@Pc(369) short[] local369;
		@Pc(372) short[] local372;
		@Pc(375) byte[] local375;
		@Pc(523) float local523;
		if (local16) {
			if (this.aClass126_5 == null) {
				if (this.aClass139_1 == null) {
					local366 = this.aShortArray77;
					local369 = this.aShortArray72;
					local372 = this.aShortArray74;
					local375 = this.aByteArray54;
				} else {
					local369 = this.aClass139_1.aShortArray52;
					local372 = this.aClass139_1.aShortArray54;
					local375 = this.aClass139_1.aByteArray42;
					local366 = this.aClass139_1.aShortArray53;
				}
				@Pc(399) float local399 = this.aClass45_Sub3_28.aFloatArray98[0];
				@Pc(405) float local405 = this.aClass45_Sub3_28.aFloatArray98[1];
				@Pc(411) float local411 = this.aClass45_Sub3_28.aFloatArray98[2];
				@Pc(415) float local415 = this.aClass45_Sub3_28.aFloat197;
				@Pc(425) float local425 = this.aClass45_Sub3_28.aFloat194 * 768.0F / (float) this.aShort75;
				@Pc(435) float local435 = this.aClass45_Sub3_28.aFloat181 * 768.0F / (float) this.aShort75;
				for (@Pc(437) int local437 = 0; local437 < this.anInt4423; local437++) {
					@Pc(457) int local457 = this.method3840(this.aByteArray53[local437], this.aShortArray73[local437], this.aShortArray68[local437], this.aShort67);
					@Pc(466) float local466 = (float) (local457 >>> 24) * this.aClass45_Sub3_28.aFloat196;
					@Pc(477) float local477 = (float) (local457 >> 8 & 0xFF) * this.aClass45_Sub3_28.aFloat184;
					@Pc(482) short local482 = this.aShortArray70[local437];
					local493 = this.aClass45_Sub3_28.aFloat186 * (float) (local457 >> 16 & 0xFF);
					@Pc(498) short local498 = (short) local375[local482];
					if (local498 == 0) {
						local523 = (local405 * (float) local369[local482] + (float) local366[local482] * local399 + local411 * (float) local372[local482]) * 0.0026041667F;
					} else {
						local523 = ((float) local372[local482] * local411 + local399 * (float) local366[local482] + (float) local369[local482] * local405) / (float) (local498 * 256);
					}
					@Pc(563) float local563 = local415 + local523 * (local523 < 0.0F ? local435 : local425);
					@Pc(568) int local568 = (int) (local563 * local466);
					if (local568 < 0) {
						local568 = 0;
					} else if (local568 > 255) {
						local568 = 255;
					}
					@Pc(584) int local584 = (int) (local563 * local493);
					if (local584 < 0) {
						local584 = 0;
					} else if (local584 > 255) {
						local584 = 255;
					}
					@Pc(602) int local602 = (int) (local477 * local563);
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					local189.anInt6128 = local482 * local109 + local113;
					local189.method5213(local568);
					local189.method5213(local584);
					local189.method5213(local602);
					local189.method5213(255 - (this.aByteArray53[local437] & 0xFF));
					local482 = this.aShortArray76[local437];
					local498 = local375[local482];
					if (local498 == 0) {
						local523 = ((float) local369[local482] * local405 + local399 * (float) local366[local482] + local411 * (float) local372[local482]) * 0.0026041667F;
					} else {
						local523 = ((float) local369[local482] * local405 + (float) local366[local482] * local399 + (float) local372[local482] * local411) / (float) (local498 * 256);
					}
					local563 = local415 + (local523 < 0.0F ? local435 : local425) * local523;
					local568 = (int) (local466 * local563);
					if (local568 < 0) {
						local568 = 0;
					} else if (local568 > 255) {
						local568 = 255;
					}
					local584 = (int) (local563 * local493);
					local602 = (int) (local563 * local477);
					if (local584 < 0) {
						local584 = 0;
					} else if (local584 > 255) {
						local584 = 255;
					}
					local189.anInt6128 = local482 * local109 + local113;
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					local189.method5213(local568);
					local189.method5213(local584);
					local189.method5213(local602);
					local189.method5213(255 - (this.aByteArray53[local437] & 0xFF));
					local482 = this.aShortArray67[local437];
					local498 = local375[local482];
					if (local498 == 0) {
						local523 = ((float) local372[local482] * local411 + (float) local366[local482] * local399 + (float) local369[local482] * local405) * 0.0026041667F;
					} else {
						local523 = ((float) local366[local482] * local399 + (float) local369[local482] * local405 + (float) local372[local482] * local411) / (float) (local498 * 256);
					}
					local563 = (local523 < 0.0F ? local435 : local425) * local523 + local415;
					local568 = (int) (local563 * local466);
					local584 = (int) (local493 * local563);
					if (local568 < 0) {
						local568 = 0;
					} else if (local568 > 255) {
						local568 = 255;
					}
					local602 = (int) (local477 * local563);
					if (local584 < 0) {
						local584 = 0;
					} else if (local584 > 255) {
						local584 = 255;
					}
					local189.anInt6128 = local109 * local482 + local113;
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					local189.method5213(local568);
					local189.method5213(local584);
					local189.method5213(local602);
					local189.method5213(255 - (this.aByteArray53[local437] & 0xFF));
				}
			} else {
				for (local197 = 0; local197 < this.anInt4423; local197++) {
					local206 = this.method3840(this.aByteArray53[local197], this.aShortArray73[local197], this.aShortArray68[local197], this.aShort67);
					local189.anInt6128 = local113 + this.aShortArray70[local197] * local109;
					local189.method5215(local206);
					local189.anInt6128 = local109 * this.aShortArray76[local197] + local113;
					local189.method5215(local206);
					local189.anInt6128 = local113 + this.aShortArray67[local197] * local109;
					local189.method5215(local206);
				}
			}
		}
		if (local27) {
			if (this.aClass139_1 == null) {
				local369 = this.aShortArray72;
				local372 = this.aShortArray74;
				local366 = this.aShortArray77;
				local375 = this.aByteArray54;
			} else {
				local375 = this.aClass139_1.aByteArray42;
				local369 = this.aClass139_1.aShortArray52;
				local366 = this.aClass139_1.aShortArray53;
				local372 = this.aClass139_1.aShortArray54;
			}
			@Pc(1101) float local1101 = 3.0F / (float) this.aShort75;
			local523 = 3.0F / (float) (this.aShort75 + this.aShort75 / 2);
			local189.anInt6128 = local115;
			if (this.aClass45_Sub3_28.aBoolean687) {
				for (local234 = 0; local234 < this.anInt4400; local234++) {
					local243 = local375[local234] & 0xFF;
					if (local243 == 0) {
						local189.method5233(local523 * (float) local366[local234]);
						local189.method5233((float) local369[local234] * local523);
						local189.method5233(local523 * (float) local372[local234]);
					} else {
						local493 = local1101 / (float) local243;
						local189.method5233(local493 * (float) local366[local234]);
						local189.method5233((float) local369[local234] * local493);
						local189.method5233((float) local372[local234] * local493);
					}
					local189.anInt6128 += local109 - 12;
				}
			} else {
				for (local234 = 0; local234 < this.anInt4400; local234++) {
					local243 = local375[local234] & 0xFF;
					if (local243 == 0) {
						local189.method5234(local523 * (float) local366[local234]);
						local189.method5234(local523 * (float) local369[local234]);
						local189.method5234(local523 * (float) local372[local234]);
					} else {
						local493 = local1101 / (float) local243;
						local189.method5234((float) local366[local234] * local493);
						local189.method5234((float) local369[local234] * local493);
						local189.method5234(local493 * (float) local372[local234]);
					}
					local189.anInt6128 += local109 - 12;
				}
			}
		}
		if (local55) {
			local189.anInt6128 = local126;
			if (this.aClass45_Sub3_28.aBoolean687) {
				for (local197 = 0; local197 < this.anInt4400; local197++) {
					local189.method5233(this.aFloatArray48[local197]);
					local189.method5233(this.aFloatArray49[local197]);
					local189.anInt6128 += local109 - 8;
				}
			} else {
				for (local197 = 0; local197 < this.anInt4400; local197++) {
					local189.method5234(this.aFloatArray48[local197]);
					local189.method5234(this.aFloatArray49[local197]);
					local189.anInt6128 += local109 - 8;
				}
			}
		}
		local189.anInt6128 = local109 * this.anInt4400;
		@Pc(1395) Interface21 local1395;
		if (arg0) {
			if (this.anInterface21_3 == null) {
				this.anInterface21_3 = this.aClass45_Sub3_28.method7517(local189.aByteArray62, local109, true, local189.anInt6128);
			} else {
				this.anInterface21_3.method7596(local189.anInt6128, local189.aByteArray62, local109);
			}
			local1395 = this.anInterface21_3;
			this.aByte56 = 0;
		} else {
			local1395 = this.aClass45_Sub3_28.method7517(local189.aByteArray62, local109, false, local189.anInt6128);
			this.aBoolean328 = true;
		}
		if (local44) {
			this.aClass126_7.aByte36 = 0;
			this.aClass126_7.anInterface21_2 = local1395;
		}
		if (local55) {
			this.aClass126_8.anInterface21_2 = local1395;
			this.aClass126_8.aByte36 = local126;
		}
		if (local16) {
			this.aClass126_6.aByte36 = local113;
			this.aClass126_6.anInterface21_2 = local1395;
		}
		if (local27) {
			this.aClass126_5.aByte36 = local115;
			this.aClass126_5.anInterface21_2 = local1395;
		}
	}

	@OriginalMember(owner = "client!jg", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean330) {
			this.method3836();
		}
		return this.aShort69;
	}

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean330) {
			this.method3836();
		}
		return this.aShort71;
	}

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4368; local3++) {
			if (arg0 != 128) {
				this.anIntArray235[local3] = arg0 * this.anIntArray235[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray237[local3] = arg1 * this.anIntArray237[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray233[local3] = this.anIntArray233[local3] * arg2 >> 7;
			}
		}
		if (this.aClass126_7 != null) {
			this.aClass126_7.anInterface21_2 = null;
		}
		this.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4423; local7++) {
			local16 = this.aShortArray68[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 -= -(arg3 * (arg1 - local28) >> 7);
			}
			@Pc(48) int local48 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg2 != -1) {
				local48 += (arg2 - local48) * arg3 >> 7;
			}
			this.aShortArray68[local7] = (short) (local28 << 7 | local22 << 10 | local48);
		}
		if (this.aClass324Array1 != null) {
			for (local16 = 0; local16 < this.anInt4399; local16++) {
				@Pc(108) Class324 local108 = this.aClass324Array1[local16];
				@Pc(113) Class287 local113 = this.aClass287Array1[local16];
				local113.anInt7689 = Static214.anIntArray203[this.aShortArray68[local108.anInt8247] & 0xFFFF] & 0xFFFFFF | local113.anInt7689 & 0xFF000000;
			}
		}
		if (this.aClass126_6 != null) {
			this.aClass126_6.anInterface21_2 = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass45_Sub3_28.anInterface3_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4423; local11++) {
			if (this.aShortArray73[local11] == arg0) {
				this.aShortArray73[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class55 local47 = local9.method4776(arg0 & 0xFFFF);
			local37 = local47.aByte15;
			local35 = local47.aByte17;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class55 local68 = local9.method4776(arg1 & 0xFFFF);
			local55 = local68.aByte17;
			local57 = local68.aByte15;
		}
		if (!(local37 != local57 | local55 != local35)) {
			return;
		}
		if (this.aClass324Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt4399; local97++) {
				@Pc(104) Class324 local104 = this.aClass324Array1[local97];
				@Pc(109) Class287 local109 = this.aClass287Array1[local97];
				local109.anInt7689 = Static214.anIntArray203[this.aShortArray68[local104.anInt8247] & 0xFFFF] & 0xFFFFFF | local109.anInt7689 & 0xFF000000;
			}
		}
		if (this.aClass126_6 != null) {
			this.aClass126_6.anInterface21_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!jg", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		if (this.aClass126_6 != null) {
			this.aClass126_6.anInterface21_2 = null;
		}
		this.aShort75 = (short) arg0;
		if (this.aClass126_5 != null) {
			this.aClass126_5.anInterface21_2 = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class60 method7229(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(19) Class60_Sub2 local19;
		@Pc(15) Class60_Sub2 local15;
		if (arg0 == 1) {
			local19 = this.aClass45_Sub3_28.aClass60_Sub2_2;
			local15 = this.aClass45_Sub3_28.aClass60_Sub2_5;
		} else if (arg0 == 2) {
			local15 = this.aClass45_Sub3_28.aClass60_Sub2_8;
			local19 = this.aClass45_Sub3_28.aClass60_Sub2_7;
		} else if (arg0 == 3) {
			local19 = this.aClass45_Sub3_28.aClass60_Sub2_1;
			local15 = this.aClass45_Sub3_28.aClass60_Sub2_10;
		} else if (arg0 == 4) {
			local15 = this.aClass45_Sub3_28.aClass60_Sub2_6;
			local19 = this.aClass45_Sub3_28.aClass60_Sub2_3;
		} else if (arg0 == 5) {
			local15 = this.aClass45_Sub3_28.aClass60_Sub2_4;
			local19 = this.aClass45_Sub3_28.aClass60_Sub2_9;
		} else {
			local19 = local15 = new Class60_Sub2(this.aClass45_Sub3_28);
		}
		return this.method3844(local15, arg0 != 0, arg1, arg2, local19);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method3843(arg2, arg3, arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) boolean arg3) {
		return this.method3843(arg2, arg3, arg0, -1, arg1);
	}

	@OriginalMember(owner = "client!jg", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.anInt4408 = arg0;
		if (this.aClass139_1 != null && (this.anInt4408 & 0x10000) == 0) {
			this.aShortArray77 = this.aClass139_1.aShortArray53;
			this.aByteArray54 = this.aClass139_1.aByteArray42;
			this.aShortArray74 = this.aClass139_1.aShortArray54;
			this.aShortArray72 = this.aClass139_1.aShortArray52;
			this.aClass139_1 = null;
		}
		this.aBoolean328 = true;
		this.method3833();
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "()V")
	@Override
	protected void method7245() {
	}

	@OriginalMember(owner = "client!jg", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class356.anIntArray597[arg0];
		@Pc(13) int local13 = Class356.anIntArray598[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4368; local15++) {
			local33 = this.anIntArray233[local15] * local9 + local13 * this.anIntArray235[local15] >> 14;
			this.anIntArray233[local15] = local13 * this.anIntArray233[local15] - this.anIntArray235[local15] * local9 >> 14;
			this.anIntArray235[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt4400; local33++) {
			@Pc(87) int local87 = this.aShortArray77[local33] * local13 + this.aShortArray74[local33] * local9 >> 14;
			this.aShortArray74[local33] = (short) (this.aShortArray74[local33] * local13 - this.aShortArray77[local33] * local9 >> 14);
			this.aShortArray77[local33] = (short) local87;
		}
		if (this.aClass126_5 == null && this.aClass126_6 != null) {
			this.aClass126_6.anInterface21_2 = null;
		}
		if (this.aClass126_5 != null) {
			this.aClass126_5.anInterface21_2 = null;
		}
		if (this.aClass126_7 != null) {
			this.aClass126_7.anInterface21_2 = null;
		}
		this.aBoolean330 = false;
	}
}
