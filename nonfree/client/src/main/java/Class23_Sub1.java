import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	private int anInt3730;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
	private int anInt3734;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Z")
	private boolean aBoolean313;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!fo;")
	private final Class9_Sub3 aClass9_Sub3_8;

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
	private int anInt3740;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
	private int anInt3741;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "Z")
	private boolean aBoolean314;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
	private int anInt3747;

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "Lclient!ts;")
	private Class307 aClass307_1;

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
	private int anInt3749;

	@OriginalMember(owner = "client!ge", name = "mb", descriptor = "I")
	private int anInt3762;

	@OriginalMember(owner = "client!ge", name = "pb", descriptor = "Lclient!rba;")
	private Class274 aClass274_1;

	@OriginalMember(owner = "client!ge", name = "Lb", descriptor = "I")
	private int anInt3774;

	@OriginalMember(owner = "client!ge", name = "Mb", descriptor = "Lclient!ts;")
	private Class307 aClass307_2;

	@OriginalMember(owner = "client!ge", name = "Sb", descriptor = "Lclient!daa;")
	private Class63 aClass63_1;

	@OriginalMember(owner = "client!ge", name = "Tb", descriptor = "Lclient!ts;")
	private Class307 aClass307_3;

	@OriginalMember(owner = "client!ge", name = "Vb", descriptor = "I")
	private int anInt3781;

	@OriginalMember(owner = "client!ge", name = "gc", descriptor = "Z")
	private boolean aBoolean315;

	@OriginalMember(owner = "client!ge", name = "hc", descriptor = "I")
	private int anInt3789;

	@OriginalMember(owner = "client!ge", name = "qc", descriptor = "Lclient!ts;")
	private Class307 aClass307_4;

	@OriginalMember(owner = "client!ge", name = "wb", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
	private int anInt3756;

	@OriginalMember(owner = "client!ge", name = "nc", descriptor = "I")
	private int anInt3793;

	@OriginalMember(owner = "client!ge", name = "Ob", descriptor = "I")
	private int anInt3776;

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!ge", name = "zc", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!ge", name = "Db", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!ge", name = "kc", descriptor = "I")
	private int anInt3792;

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!ge", name = "tb", descriptor = "[Lclient!haa;")
	private Class128[] aClass128Array1;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "[Lclient!dg;")
	private Class69[] aClass69Array1;

	@OriginalMember(owner = "client!ge", name = "ic", descriptor = "I")
	private int anInt3790;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "[Lclient!is;")
	private Class157[] aClass157Array1;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "[Lclient!lk;")
	private Class201[] aClass201Array1;

	@OriginalMember(owner = "client!ge", name = "xb", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!ge", name = "Ab", descriptor = "[F")
	private float[] aFloatArray31;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!ge", name = "cb", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!ge", name = "ub", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!ge", name = "db", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!ge", name = "mc", descriptor = "[F")
	private float[] aFloatArray32;

	@OriginalMember(owner = "client!ge", name = "O", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!ge", name = "oc", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!ge", name = "sb", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!ge", name = "xc", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!ge", name = "Wb", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!ge", name = "bc", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!ge", name = "Ib", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!ge", name = "Eb", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!ge", name = "Gb", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ge", name = "yb", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!fo;Lclient!qda;IIII)V")
	public Class23_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface2 local11 = arg0.anInterface2_11;
		this.anIntArray249 = new int[arg1.anInt7707 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt7710];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt7710; local24++) {
			if ((arg1.aByteArray88 == null || arg1.aByteArray88[local24] != 2) && (arg1.aShortArray98 == null || arg1.aShortArray98[local24] == -1 || !local11.method3585(arg1.aShortArray98[local24] & 0xFFFF).aBoolean660)) {
				local22[this.anInt3756++] = local24;
				this.anIntArray249[arg1.aShortArray104[local24]]++;
				this.anIntArray249[arg1.aShortArray105[local24]]++;
				this.anIntArray249[arg1.aShortArray99[local24]]++;
			}
		}
		this.anInt3793 = this.anInt3756;
		@Pc(117) long[] local117 = new long[this.anInt3756];
		@Pc(129) boolean local129 = (this.anInt3781 & 0x100) != 0;
		@Pc(141) int local141;
		@Pc(152) int local152;
		@Pc(281) int local281;
		label500: for (@Pc(131) int local131 = 0; local131 < this.anInt3756; local131++) {
			@Pc(137) int local137 = local22[local131];
			@Pc(139) Class296 local139 = null;
			local141 = 0;
			@Pc(143) byte local143 = 0;
			@Pc(145) byte local145 = 0;
			@Pc(147) byte local147 = 0;
			if (arg1.aClass346Array1 != null) {
				for (local152 = 0; local152 < arg1.aClass346Array1.length; local152++) {
					@Pc(159) Class346 local159 = arg1.aClass346Array1[local152];
					if (local159.anInt9613 == local137) {
						@Pc(168) Class235 local168 = Static139.method2602(local159.anInt9616);
						if (local168.aBoolean518) {
							local117[local131] = Long.MAX_VALUE;
							this.anInt3793--;
							continue label500;
						}
					}
				}
			}
			@Pc(195) short local195 = -1;
			if (arg1.aShortArray98 != null) {
				local195 = arg1.aShortArray98[local137];
				if (local195 != -1) {
					local139 = local11.method3585(local195 & 0xFFFF);
					local147 = local139.aByte102;
					local145 = local139.aByte104;
				}
			}
			@Pc(237) boolean local237 = arg1.aByteArray93 != null && arg1.aByteArray93[local137] != 0 || local139 != null && !local139.aBoolean652;
			if ((local129 || local237) && arg1.aByteArray87 != null) {
				local141 += arg1.aByteArray87[local137] << 17;
			}
			if (local237) {
				local141 += 65536;
			}
			local141 += (local145 & 0xFF) << 8;
			local141 += local147 & 0xFF;
			local281 = local143 + ((local195 & 0xFFFF) << 16);
			@Pc(287) int local287 = local281 + (local131 & 0xFFFF);
			local117[local131] = (long) local287 + ((long) local141 << 32);
		}
		Static275.method4585(local117, local22);
		this.anInt3776 = arg1.anInt7712;
		this.aShortArray42 = arg1.aShortArray103;
		this.anIntArray255 = arg1.anIntArray550;
		this.anIntArray250 = arg1.anIntArray548;
		this.anInt3792 = arg1.anInt7707;
		this.anIntArray247 = arg1.anIntArray542;
		this.aClass128Array1 = arg1.aClass128Array3;
		@Pc(338) Class243[] local338 = new Class243[this.anInt3792];
		this.aClass69Array1 = arg1.aClass69Array3;
		@Pc(362) int local362;
		@Pc(376) int local376;
		if (arg1.aClass346Array1 != null) {
			this.anInt3790 = arg1.aClass346Array1.length;
			this.aClass157Array1 = new Class157[this.anInt3790];
			this.aClass201Array1 = new Class201[this.anInt3790];
			for (local362 = 0; local362 < this.anInt3790; local362++) {
				@Pc(369) Class346 local369 = arg1.aClass346Array1[local362];
				@Pc(374) Class235 local374 = Static139.method2602(local369.anInt9616);
				local376 = -1;
				for (@Pc(378) int local378 = 0; local378 < this.anInt3756; local378++) {
					if (local369.anInt9613 == local22[local378]) {
						local376 = local378;
						break;
					}
				}
				if (local376 == -1) {
					throw new RuntimeException();
				}
				local152 = Static223.anIntArray301[arg1.aShortArray102[local369.anInt9613] & 0xFFFF] & 0xFFFFFF;
				local152 |= 255 - (arg1.aByteArray93 == null ? 0 : arg1.aByteArray93[local369.anInt9613]) << 24;
				this.aClass201Array1[local362] = new Class201(local376, arg1.aShortArray104[local369.anInt9613], arg1.aShortArray105[local369.anInt9613], arg1.aShortArray99[local369.anInt9613], local374.anInt6927, local374.anInt6932, local374.anInt6930, local374.anInt6928, local374.anInt6929, local374.aBoolean518, local374.aBoolean517, local369.anInt9620);
				this.aClass157Array1[local362] = new Class157(local152);
			}
		}
		local362 = this.anInt3756 * 3;
		this.aShortArray48 = new short[local362];
		this.aFloatArray31 = new float[local362];
		this.aByteArray46 = new byte[local362];
		this.aShortArray44 = new short[local362];
		this.aShortArray47 = new short[local362];
		this.aShortArray45 = new short[this.anInt3756];
		this.aShortArray38 = new short[local362];
		this.aShortArray39 = new short[this.anInt3756];
		this.aShort34 = (short) arg3;
		this.aFloatArray32 = new float[local362];
		if (arg1.aShortArray96 != null) {
			this.aShortArray41 = new short[this.anInt3756];
		}
		this.aShortArray49 = new short[this.anInt3756];
		Static304.aLongArray7 = new long[local362];
		this.aShortArray46 = new short[local362];
		this.aShortArray40 = new short[this.anInt3756];
		this.aByteArray47 = new byte[this.anInt3756];
		this.aShort35 = (short) arg4;
		this.aShortArray37 = new short[this.anInt3756];
		this.aShortArray43 = new short[local362];
		local141 = 0;
		for (local281 = 0; local281 < arg1.anInt7707; local281++) {
			local376 = this.anIntArray249[local281];
			this.anIntArray249[local281] = local141;
			local141 += local376;
			local338[local281] = new Class243();
		}
		this.anIntArray249[arg1.anInt7707] = local141;
		@Pc(625) int[] local625 = null;
		@Pc(627) int[] local627 = null;
		@Pc(629) int[] local629 = null;
		@Pc(631) float[][] local631 = null;
		@Pc(649) int[] local649;
		@Pc(657) int local657;
		@Pc(702) int local702;
		@Pc(708) int local708;
		@Pc(721) int local721;
		@Pc(723) int local723;
		@Pc(754) int local754;
		@Pc(759) int local759;
		@Pc(915) float local915;
		@Pc(938) float local938;
		@Pc(909) float local909;
		if (arg1.aByteArray92 != null) {
			@Pc(637) int local637 = arg1.anInt7702;
			@Pc(640) int[] local640 = new int[local637];
			@Pc(643) int[] local643 = new int[local637];
			@Pc(646) int[] local646 = new int[local637];
			local649 = new int[local637];
			@Pc(652) int[] local652 = new int[local637];
			@Pc(655) int[] local655 = new int[local637];
			for (local657 = 0; local657 < local637; local657++) {
				local640[local657] = Integer.MAX_VALUE;
				local643[local657] = -2147483647;
				local646[local657] = Integer.MAX_VALUE;
				local649[local657] = -2147483647;
				local652[local657] = Integer.MAX_VALUE;
				local655[local657] = -2147483647;
			}
			local631 = new float[local637][];
			local625 = new int[local637];
			local629 = new int[local637];
			for (local702 = 0; local702 < this.anInt3756; local702++) {
				local708 = local22[local702];
				if (arg1.aByteArray92[local708] != -1) {
					local721 = arg1.aByteArray92[local708] & 0xFF;
					for (local723 = 0; local723 < 3; local723++) {
						@Pc(735) short local735;
						if (local723 == 0) {
							local735 = arg1.aShortArray104[local708];
						} else if (local723 == 1) {
							local735 = arg1.aShortArray105[local708];
						} else {
							local735 = arg1.aShortArray99[local708];
						}
						local754 = arg1.anIntArray550[local735];
						local759 = arg1.anIntArray548[local735];
						@Pc(764) int local764 = arg1.anIntArray542[local735];
						if (local640[local721] > local754) {
							local640[local721] = local754;
						}
						if (local754 > local643[local721]) {
							local643[local721] = local754;
						}
						if (local759 < local646[local721]) {
							local646[local721] = local759;
						}
						if (local759 > local649[local721]) {
							local649[local721] = local759;
						}
						if (local652[local721] > local764) {
							local652[local721] = local764;
						}
						if (local764 > local655[local721]) {
							local655[local721] = local764;
						}
					}
				}
			}
			local627 = new int[local637];
			for (local708 = 0; local708 < local637; local708++) {
				@Pc(849) byte local849 = arg1.aByteArray91[local708];
				if (local849 > 0) {
					local625[local708] = (local643[local708] + local640[local708]) / 2;
					local627[local708] = (local649[local708] + local646[local708]) / 2;
					local629[local708] = (local652[local708] + local655[local708]) / 2;
					if (local849 == 1) {
						local759 = arg1.anIntArray544[local708];
						if (local759 == 0) {
							local909 = 1.0F;
							local915 = 1.0F;
						} else if (local759 <= 0) {
							local909 = 1.0F;
							local915 = (float) -local759 / 1024.0F;
						} else {
							local909 = (float) local759 / 1024.0F;
							local915 = 1.0F;
						}
						local938 = 64.0F / (float) arg1.anIntArray543[local708];
					} else if (local849 == 2) {
						local909 = 64.0F / (float) arg1.anIntArray551[local708];
						local915 = 64.0F / (float) arg1.anIntArray544[local708];
						local938 = 64.0F / (float) arg1.anIntArray543[local708];
					} else {
						local938 = (float) arg1.anIntArray543[local708] / 1024.0F;
						local909 = (float) arg1.anIntArray551[local708] / 1024.0F;
						local915 = (float) arg1.anIntArray544[local708] / 1024.0F;
					}
					local631[local708] = Static112.method2293(local915, arg1.aShortArray97[local708], arg1.aByteArray90[local708] & 0xFF, arg1.aShortArray100[local708], local938, local909, arg1.aShortArray101[local708]);
				}
			}
		}
		@Pc(1027) Class102[] local1027 = new Class102[arg1.anInt7710];
		@Pc(1046) short local1046;
		@Pc(1057) int local1057;
		@Pc(1068) int local1068;
		for (@Pc(1029) int local1029 = 0; local1029 < arg1.anInt7710; local1029++) {
			@Pc(1036) short local1036 = arg1.aShortArray104[local1029];
			@Pc(1041) short local1041 = arg1.aShortArray105[local1029];
			local1046 = arg1.aShortArray99[local1029];
			local1057 = this.anIntArray255[local1041] - this.anIntArray255[local1036];
			local1068 = this.anIntArray250[local1041] - this.anIntArray250[local1036];
			local657 = this.anIntArray247[local1041] - this.anIntArray247[local1036];
			local702 = this.anIntArray255[local1046] - this.anIntArray255[local1036];
			local708 = this.anIntArray250[local1046] - this.anIntArray250[local1036];
			local721 = this.anIntArray247[local1046] - this.anIntArray247[local1036];
			local723 = local1068 * local721 - local708 * local657;
			@Pc(1127) int local1127 = local702 * local657 - local721 * local1057;
			local754 = local1057 * local708 - local702 * local1068;
			while (local723 > 8192 || local1127 > 8192 || local754 > 8192 || local723 < -8192 || local1127 < -8192 || local754 < -8192) {
				local754 >>= 0x1;
				local723 >>= 0x1;
				local1127 >>= 0x1;
			}
			local759 = (int) Math.sqrt((double) (local723 * local723 + local1127 * local1127 + local754 * local754));
			if (local759 <= 0) {
				local759 = 1;
			}
			local754 = local754 * 256 / local759;
			local723 = local723 * 256 / local759;
			local1127 = local1127 * 256 / local759;
			@Pc(1224) byte local1224 = arg1.aByteArray88 == null ? 0 : arg1.aByteArray88[local1029];
			if (local1224 == 0) {
				@Pc(1233) Class243 local1233 = local338[local1036];
				local1233.anInt7176 += local1127;
				local1233.anInt7179 += local754;
				local1233.anInt7171++;
				local1233.anInt7172 += local723;
				@Pc(1261) Class243 local1261 = local338[local1041];
				local1261.anInt7176 += local1127;
				local1261.anInt7172 += local723;
				local1261.anInt7171++;
				local1261.anInt7179 += local754;
				@Pc(1289) Class243 local1289 = local338[local1046];
				local1289.anInt7179 += local754;
				local1289.anInt7171++;
				local1289.anInt7172 += local723;
				local1289.anInt7176 += local1127;
			} else if (local1224 == 1) {
				@Pc(1328) Class102 local1328 = local1027[local1029] = new Class102();
				local1328.anInt2951 = local754;
				local1328.anInt2948 = local723;
				local1328.anInt2949 = local1127;
			}
		}
		@Pc(1354) int local1354;
		for (@Pc(1348) int local1348 = 0; local1348 < this.anInt3756; local1348++) {
			local1354 = local22[local1348];
			@Pc(1361) int local1361 = arg1.aShortArray102[local1354] & 0xFFFF;
			@Pc(1369) short local1369;
			if (arg1.aShortArray98 == null) {
				local1369 = -1;
			} else {
				local1369 = arg1.aShortArray98[local1354];
			}
			if (arg1.aByteArray92 == null) {
				local1068 = -1;
			} else {
				local1068 = arg1.aByteArray92[local1354];
			}
			if (arg1.aByteArray93 == null) {
				local657 = 0;
			} else {
				local657 = arg1.aByteArray93[local1354] & 0xFF;
			}
			@Pc(1401) float local1401 = 0.0F;
			@Pc(1403) float local1403 = 0.0F;
			@Pc(1405) float local1405 = 0.0F;
			local915 = 0.0F;
			local938 = 0.0F;
			local909 = 0.0F;
			@Pc(1413) byte local1413 = 0;
			@Pc(1415) byte local1415 = 0;
			@Pc(1417) int local1417 = 0;
			@Pc(1451) byte local1451;
			@Pc(1468) short local1468;
			@Pc(2211) short local2211;
			@Pc(2216) short local2216;
			if (local1369 != -1) {
				if (local1068 == -1) {
					local1415 = 2;
					local1401 = 0.0F;
					local938 = 0.0F;
					local909 = 0.0F;
					local1405 = 1.0F;
					local915 = 1.0F;
					local1413 = 1;
					local1403 = 1.0F;
				} else {
					local1068 &= 0xFF;
					local1451 = arg1.aByteArray91[local1068];
					@Pc(1458) short local1458;
					@Pc(1463) short local1463;
					@Pc(1497) float local1497;
					@Pc(1508) float local1508;
					@Pc(1587) float local1587;
					@Pc(1824) float local1824;
					@Pc(1832) float local1832;
					@Pc(1840) float local1840;
					@Pc(1863) float local1863;
					@Pc(1886) float local1886;
					@Pc(1909) float local1909;
					if (local1451 == 0) {
						local1458 = arg1.aShortArray104[local1354];
						local1463 = arg1.aShortArray105[local1354];
						local1468 = arg1.aShortArray99[local1354];
						local2211 = arg1.aShortArray100[local1068];
						local2216 = arg1.aShortArray101[local1068];
						@Pc(2221) short local2221 = arg1.aShortArray97[local1068];
						@Pc(2227) float local2227 = (float) arg1.anIntArray550[local2211];
						@Pc(2233) float local2233 = (float) arg1.anIntArray548[local2211];
						local1497 = arg1.anIntArray542[local2211];
						local1508 = (float) arg1.anIntArray550[local2216] - local2227;
						local1587 = (float) arg1.anIntArray548[local2216] - local2233;
						@Pc(2264) float local2264 = (float) arg1.anIntArray542[local2216] - local1497;
						@Pc(2273) float local2273 = (float) arg1.anIntArray550[local2221] - local2227;
						@Pc(2282) float local2282 = (float) arg1.anIntArray548[local2221] - local2233;
						@Pc(2290) float local2290 = (float) arg1.anIntArray542[local2221] - local1497;
						@Pc(2299) float local2299 = (float) arg1.anIntArray550[local1458] - local2227;
						@Pc(2308) float local2308 = (float) arg1.anIntArray548[local1458] - local2233;
						@Pc(2316) float local2316 = (float) arg1.anIntArray542[local1458] - local1497;
						@Pc(2324) float local2324 = (float) arg1.anIntArray550[local1463] - local2227;
						@Pc(2332) float local2332 = (float) arg1.anIntArray548[local1463] - local2233;
						local1824 = (float) arg1.anIntArray542[local1463] - local1497;
						local1832 = (float) arg1.anIntArray550[local1468] - local2227;
						local1840 = (float) arg1.anIntArray548[local1468] - local2233;
						local1863 = (float) arg1.anIntArray542[local1468] - local1497;
						local1886 = local1587 * local2290 - local2282 * local2264;
						local1909 = local2273 * local2264 - local2290 * local1508;
						@Pc(2390) float local2390 = local2282 * local1508 - local1587 * local2273;
						@Pc(2398) float local2398 = local2390 * local2282 - local1909 * local2290;
						@Pc(2407) float local2407 = local2290 * local1886 - local2390 * local2273;
						@Pc(2416) float local2416 = local1909 * local2273 - local2282 * local1886;
						@Pc(2430) float local2430 = 1.0F / (local2398 * local1508 + local2407 * local1587 + local2264 * local2416);
						local1405 = (local2332 * local2407 + local2398 * local2324 + local1824 * local2416) * local2430;
						local1401 = local2430 * (local2398 * local2299 + local2407 * local2308 + local2316 * local2416);
						local938 = local2430 * (local1832 * local2398 + local2407 * local1840 + local1863 * local2416);
						@Pc(2481) float local2481 = local1587 * local2390 - local1909 * local2264;
						@Pc(2489) float local2489 = local1508 * local1909 - local1886 * local1587;
						@Pc(2497) float local2497 = local2264 * local1886 - local1508 * local2390;
						@Pc(2511) float local2511 = 1.0F / (local2290 * local2489 + local2273 * local2481 + local2282 * local2497);
						local909 = local2511 * (local1863 * local2489 + local1840 * local2497 + local1832 * local2481);
						local915 = local2511 * (local2481 * local2324 + local2497 * local2332 + local2489 * local1824);
						local1403 = local2511 * (local2308 * local2497 + local2299 * local2481 + local2316 * local2489);
					} else {
						local1458 = arg1.aShortArray104[local1354];
						local1463 = arg1.aShortArray105[local1354];
						local1468 = arg1.aShortArray99[local1354];
						@Pc(1472) int local1472 = local625[local1068];
						@Pc(1476) int local1476 = local627[local1068];
						@Pc(1480) int local1480 = local629[local1068];
						@Pc(1484) float[] local1484 = local631[local1068];
						@Pc(1489) byte local1489 = arg1.aByteArray89[local1068];
						local1497 = (float) arg1.anIntArray547[local1068] / 256.0F;
						if (local1451 == 1) {
							local1508 = (float) arg1.anIntArray551[local1068] / 1024.0F;
							Static9.method616(local1480, local1476, arg1.anIntArray550[local1458], local1489, local1497, arg1.anIntArray542[local1458], local1472, local1508, arg1.anIntArray548[local1458], local1484);
							local1403 = Static298.aFloat123;
							local1401 = Static568.aFloat195;
							Static9.method616(local1480, local1476, arg1.anIntArray550[local1463], local1489, local1497, arg1.anIntArray542[local1463], local1472, local1508, arg1.anIntArray548[local1463], local1484);
							local915 = Static298.aFloat123;
							local1405 = Static568.aFloat195;
							Static9.method616(local1480, local1476, arg1.anIntArray550[local1468], local1489, local1497, arg1.anIntArray542[local1468], local1472, local1508, arg1.anIntArray548[local1468], local1484);
							local909 = Static298.aFloat123;
							local938 = Static568.aFloat195;
							local1587 = local1508 / 2.0F;
							if ((local1489 & 0x1) == 0) {
								if (local1587 < local938 - local1401) {
									local1415 = 1;
									local938 -= local1508;
								} else if (local1401 - local938 > local1587) {
									local938 += local1508;
									local1415 = 2;
								}
								if (local1405 - local1401 > local1587) {
									local1413 = 1;
									local1405 -= local1508;
								} else if (local1401 - local1405 > local1587) {
									local1413 = 2;
									local1405 += local1508;
								}
							} else {
								if (local915 - local1403 > local1587) {
									local915 -= local1508;
									local1413 = 1;
								} else if (local1587 < local1403 - local915) {
									local915 += local1508;
									local1413 = 2;
								}
								if (local909 - local1403 > local1587) {
									local1415 = 1;
									local909 -= local1508;
								} else if (local1403 - local909 > local1587) {
									local1415 = 2;
									local909 += local1508;
								}
							}
						} else if (local1451 == 2) {
							local1508 = (float) arg1.anIntArray552[local1068] / 256.0F;
							local1587 = (float) arg1.anIntArray549[local1068] / 256.0F;
							@Pc(1736) int local1736 = arg1.anIntArray550[local1463] - arg1.anIntArray550[local1458];
							@Pc(1747) int local1747 = arg1.anIntArray548[local1463] - arg1.anIntArray548[local1458];
							@Pc(1757) int local1757 = arg1.anIntArray542[local1463] - arg1.anIntArray542[local1458];
							@Pc(1768) int local1768 = arg1.anIntArray550[local1468] - arg1.anIntArray550[local1458];
							@Pc(1779) int local1779 = arg1.anIntArray548[local1468] - arg1.anIntArray548[local1458];
							@Pc(1790) int local1790 = arg1.anIntArray542[local1468] - arg1.anIntArray542[local1458];
							@Pc(1799) int local1799 = local1747 * local1790 - local1757 * local1779;
							@Pc(1808) int local1808 = local1768 * local1757 - local1736 * local1790;
							@Pc(1816) int local1816 = local1736 * local1779 - local1768 * local1747;
							local1824 = 64.0F / (float) arg1.anIntArray544[local1068];
							local1832 = 64.0F / (float) arg1.anIntArray543[local1068];
							local1840 = 64.0F / (float) arg1.anIntArray551[local1068];
							local1863 = (local1484[0] * (float) local1799 + (float) local1808 * local1484[1] + local1484[2] * (float) local1816) / local1824;
							local1886 = ((float) local1808 * local1484[4] + local1484[3] * (float) local1799 + (float) local1816 * local1484[5]) / local1832;
							local1909 = (local1484[6] * (float) local1799 + (float) local1808 * local1484[7] + (float) local1816 * local1484[8]) / local1840;
							local1417 = Static400.method6285(local1909, local1863, local1886);
							Static18.method847(local1417, local1472, local1489, local1587, local1508, arg1.anIntArray548[local1458], local1497, arg1.anIntArray542[local1458], local1480, local1484, arg1.anIntArray550[local1458], local1476);
							local1403 = Static116.aFloat48;
							local1401 = Static432.aFloat177;
							Static18.method847(local1417, local1472, local1489, local1587, local1508, arg1.anIntArray548[local1463], local1497, arg1.anIntArray542[local1463], local1480, local1484, arg1.anIntArray550[local1463], local1476);
							local1405 = Static432.aFloat177;
							local915 = Static116.aFloat48;
							Static18.method847(local1417, local1472, local1489, local1587, local1508, arg1.anIntArray548[local1468], local1497, arg1.anIntArray542[local1468], local1480, local1484, arg1.anIntArray550[local1468], local1476);
							local938 = Static432.aFloat177;
							local909 = Static116.aFloat48;
						} else if (local1451 == 3) {
							Static186.method3606(local1484, local1489, local1497, local1480, arg1.anIntArray550[local1458], arg1.anIntArray542[local1458], local1472, local1476, arg1.anIntArray548[local1458]);
							local1403 = Static233.aFloat107;
							local1401 = Static462.aFloat181;
							Static186.method3606(local1484, local1489, local1497, local1480, arg1.anIntArray550[local1463], arg1.anIntArray542[local1463], local1472, local1476, arg1.anIntArray548[local1463]);
							local915 = Static233.aFloat107;
							local1405 = Static462.aFloat181;
							Static186.method3606(local1484, local1489, local1497, local1480, arg1.anIntArray550[local1468], arg1.anIntArray542[local1468], local1472, local1476, arg1.anIntArray548[local1468]);
							local938 = Static462.aFloat181;
							local909 = Static233.aFloat107;
							if ((local1489 & 0x1) == 0) {
								if (local1405 - local1401 > 0.5F) {
									local1413 = 1;
									local1405--;
								} else if (local1401 - local1405 > 0.5F) {
									local1413 = 2;
									local1405++;
								}
								if (local938 - local1401 > 0.5F) {
									local938--;
									local1415 = 1;
								} else if (local1401 - local938 > 0.5F) {
									local938++;
									local1415 = 2;
								}
							} else {
								if (local915 - local1403 > 0.5F) {
									local915--;
									local1413 = 1;
								} else if (local1403 - local915 > 0.5F) {
									local915++;
									local1413 = 2;
								}
								if (local909 - local1403 > 0.5F) {
									local1415 = 1;
									local909--;
								} else if (local1403 - local909 > 0.5F) {
									local1415 = 2;
									local909++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray88 == null) {
				local1451 = 0;
			} else {
				local1451 = arg1.aByteArray88[local1354];
			}
			if (local1451 == 0) {
				@Pc(2590) long local2590 = ((long) (local1361 << 8) + (long) (local1417 << 24) + (long) local657 << 32) + (long) (local1068 << 2);
				local1468 = arg1.aShortArray104[local1354];
				local2211 = arg1.aShortArray105[local1354];
				local2216 = arg1.aShortArray99[local1354];
				@Pc(2609) Class243 local2609 = local338[local1468];
				this.aShortArray49[local1348] = this.method3355(local2609.anInt7179, local2590, local1348, local2609.anInt7176, local1401, arg1, local1403, local1468, local2609.anInt7171, local2609.anInt7172);
				@Pc(2634) Class243 local2634 = local338[local2211];
				this.aShortArray37[local1348] = this.method3355(local2634.anInt7179, local2590 + (long) local1413, local1348, local2634.anInt7176, local1405, arg1, local915, local2211, local2634.anInt7171, local2634.anInt7172);
				@Pc(2662) Class243 local2662 = local338[local2216];
				this.aShortArray39[local1348] = this.method3355(local2662.anInt7179, local2590 + (long) local1415, local1348, local2662.anInt7176, local938, arg1, local909, local2216, local2662.anInt7171, local2662.anInt7172);
			} else if (local1451 == 1) {
				@Pc(2695) Class102 local2695 = local1027[local1354];
				@Pc(2736) long local2736 = (long) ((local2695.anInt2951 + 256 << 22) + (local2695.anInt2949 + 256 << 12) + (local1068 << 2) + (local2695.anInt2948 > 0 ? 1024 : 2048)) + ((long) local657 + (long) (local1361 << 8) + (long) (local1417 << 24) << 32);
				this.aShortArray49[local1348] = this.method3355(local2695.anInt2951, local2736, local1348, local2695.anInt2949, local1401, arg1, local1403, arg1.aShortArray104[local1354], 0, local2695.anInt2948);
				this.aShortArray37[local1348] = this.method3355(local2695.anInt2951, local2736 + (long) local1413, local1348, local2695.anInt2949, local1405, arg1, local915, arg1.aShortArray105[local1354], 0, local2695.anInt2948);
				this.aShortArray39[local1348] = this.method3355(local2695.anInt2951, local2736 + (long) local1415, local1348, local2695.anInt2949, local938, arg1, local909, arg1.aShortArray99[local1354], 0, local2695.anInt2948);
			}
			if (arg1.aShortArray98 == null) {
				this.aShortArray45[local1348] = -1;
			} else {
				this.aShortArray45[local1348] = arg1.aShortArray98[local1354];
			}
			if (arg1.aByteArray93 != null) {
				this.aByteArray47[local1348] = arg1.aByteArray93[local1354];
			}
			if (arg1.aShortArray96 != null) {
				this.aShortArray41[local1348] = arg1.aShortArray96[local1354];
			}
			this.aShortArray40[local1348] = arg1.aShortArray102[local1354];
		}
		if (this.anInt3793 > 0) {
			local1354 = 1;
			local1046 = this.aShortArray45[0];
			for (local1057 = 0; local1057 < this.anInt3793; local1057++) {
				@Pc(2886) short local2886 = this.aShortArray45[local1057];
				if (local2886 != local1046) {
					local1046 = local2886;
					local1354++;
				}
			}
			this.anIntArray254 = new int[local1354];
			this.anIntArray252 = new int[local1354];
			this.anIntArray251 = new int[local1354 + 1];
			this.anIntArray251[0] = 0;
			local1068 = this.anInt3774;
			@Pc(2929) short local2929 = 0;
			local1354 = 0;
			local1046 = this.aShortArray45[0];
			for (local702 = 0; local702 < this.anInt3793; local702++) {
				@Pc(2945) short local2945 = this.aShortArray45[local702];
				if (local1046 != local2945) {
					this.anIntArray254[local1354] = local1068;
					this.anIntArray252[local1354] = local2929 + 1 - local1068;
					local1354++;
					this.anIntArray251[local1354] = local702;
					local1046 = local2945;
					local1068 = this.anInt3774;
					local2929 = 0;
				}
				@Pc(2980) short local2980 = this.aShortArray49[local702];
				if (local2980 < local1068) {
					local1068 = local2980;
				}
				if (local2980 > local2929) {
					local2929 = local2980;
				}
				local2980 = this.aShortArray37[local702];
				if (local1068 > local2980) {
					local1068 = local2980;
				}
				if (local2980 > local2929) {
					local2929 = local2980;
				}
				local2980 = this.aShortArray39[local702];
				if (local2929 < local2980) {
					local2929 = local2980;
				}
				if (local2980 < local1068) {
					local1068 = local2980;
				}
			}
			this.anIntArray254[local1354] = local1068;
			this.anIntArray252[local1354] = local2929 + 1 - local1068;
			local1354++;
			this.anIntArray251[local1354] = this.anInt3793;
		}
		Static304.aLongArray7 = null;
		this.aShortArray48 = Static61.method1330(this.anInt3774, this.aShortArray48);
		this.aShortArray47 = Static61.method1330(this.anInt3774, this.aShortArray47);
		this.aShortArray38 = Static61.method1330(this.anInt3774, this.aShortArray38);
		this.aShortArray44 = Static61.method1330(this.anInt3774, this.aShortArray44);
		this.aShortArray43 = Static61.method1330(this.anInt3774, this.aShortArray43);
		this.aByteArray46 = Static450.method6897(this.anInt3774, this.aByteArray46);
		this.aFloatArray31 = Static19.method1019(this.aFloatArray31, this.anInt3774);
		this.aFloatArray32 = Static19.method1019(this.aFloatArray32, this.anInt3774);
		if (arg1.anIntArray546 != null && Static225.method4050(this.anInt3749, arg2)) {
			this.anIntArrayArray23 = arg1.method6437(false);
		}
		if (arg1.aClass346Array1 != null && Static275.method4580(this.anInt3749, arg2)) {
			this.anIntArrayArray22 = arg1.method6438();
		}
		if (arg1.anIntArray545 != null && Static469.method7232(arg2, this.anInt3749)) {
			local1354 = 0;
			local649 = new int[256];
			for (local1057 = 0; local1057 < this.anInt3756; local1057++) {
				local1068 = arg1.anIntArray545[local22[local1057]];
				if (local1068 >= 0) {
					if (local1068 > local1354) {
						local1354 = local1068;
					}
					@Pc(3192) int local3192 = local649[local1068]++;
				}
			}
			this.anIntArrayArray21 = new int[local1354 + 1][];
			for (local1068 = 0; local1068 <= local1354; local1068++) {
				this.anIntArrayArray21[local1068] = new int[local649[local1068]];
				local649[local1068] = 0;
			}
			for (local657 = 0; local657 < this.anInt3756; local657++) {
				local702 = arg1.anIntArray545[local22[local657]];
				if (local702 >= 0) {
					this.anIntArrayArray21[local702][local649[local702]++] = local657;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!fo;IIZZ)V")
	public Class23_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean314 = false;
		this.anInt3756 = 0;
		this.aBoolean313 = false;
		this.aBoolean315 = true;
		this.anInt3793 = 0;
		this.anInt3792 = 0;
		this.anInt3776 = 0;
		this.anInt3774 = 0;
		this.anInt3781 = arg1;
		this.aBoolean313 = arg4;
		this.aClass9_Sub3_8 = arg0;
		this.anInt3749 = arg2;
		if (arg3 || Static235.method4124(this.anInt3749, this.anInt3781)) {
			this.aClass307_4 = new Class307(Static188.method3617(this.anInt3781, this.anInt3749));
		}
		if (arg3 || Static204.method3803(this.anInt3781, this.anInt3749)) {
			this.aClass307_3 = new Class307(Static44.method1138(this.anInt3749, this.anInt3781));
		}
		if (arg3 || Static151.method2917(this.anInt3749, this.anInt3781)) {
			this.aClass307_2 = new Class307(Static331.method8155(this.anInt3749, this.anInt3781));
		}
		if (arg3 || Static242.method4246(this.anInt3781, this.anInt3749)) {
			this.aClass307_1 = new Class307(Static104.method6583(this.anInt3781, this.anInt3749));
		}
		if (arg3 || Static436.method6661(this.anInt3781, this.anInt3749)) {
			this.aClass274_1 = new Class274(Static240.method4633(this.anInt3749, this.anInt3781));
		}
	}

	@OriginalMember(owner = "client!ge", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) Class62 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean314) {
			this.method3350();
		}
		@Pc(17) int local17 = arg4 + this.anInt3734;
		@Pc(22) int local22 = arg4 + this.anInt3741;
		@Pc(27) int local27 = this.anInt3789 + arg6;
		@Pc(33) int local33 = arg6 + this.anInt3747;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || local22 + arg2.anInt9884 >> arg2.anInt9883 >= arg2.anInt9881 || local27 < 0 || arg2.anInt9885 <= arg2.anInt9884 + local33 >> arg2.anInt9883)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || local22 + arg3.anInt9884 >> arg3.anInt9883 >= arg3.anInt9881 || local27 < 0 || local33 + arg3.anInt9884 >> arg3.anInt9883 >= arg3.anInt9885) {
				return;
			}
		} else {
			local17 >>= arg2.anInt9883;
			local22 = arg2.anInt9884 + local22 - 1 >> arg2.anInt9883;
			local27 >>= arg2.anInt9883;
			local33 = arg2.anInt9884 + local33 - 1 >> arg2.anInt9883;
			if (arg2.JA(local17, local27) == arg5 && arg2.JA(local22, local27) == arg5 && arg5 == arg2.JA(local17, local33) && arg5 == arg2.JA(local22, local33)) {
				return;
			}
		}
		@Pc(192) int local192;
		if (arg0 == 1) {
			for (local192 = 0; local192 < this.anInt3792; local192++) {
				this.anIntArray250[local192] = this.anIntArray250[local192] + arg2.sa(arg4 + this.anIntArray255[local192], this.anIntArray247[local192] + arg6) - arg5;
			}
		} else {
			@Pc(253) int local253;
			@Pc(261) int local261;
			if (arg0 == 2) {
				local192 = this.anInt3762;
				if (local192 == 0) {
					return;
				}
				for (local253 = 0; local253 < this.anInt3792; local253++) {
					local261 = (this.anIntArray250[local253] << 16) / local192;
					if (arg1 > local261) {
						this.anIntArray250[local253] += (arg2.sa(this.anIntArray255[local253] + arg4, this.anIntArray247[local253] + arg6) - arg5) * (-local261 + arg1) / arg1;
					}
				}
			} else {
				@Pc(269) int local269;
				if (arg0 == 3) {
					local192 = (arg1 & 0xFF) * 4;
					local253 = (arg1 >> 8 & 0xFF) * 4;
					local261 = (arg1 >> 16 & 0xFF) << 6;
					local269 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local192 >> 1) < 0 || arg4 + (local192 >> 1) + arg2.anInt9884 >= arg2.anInt9881 << arg2.anInt9883 || arg6 - (local253 >> 1) < 0 || (local253 >> 1) + arg6 + arg2.anInt9884 >= arg2.anInt9885 << arg2.anInt9883) {
						return;
					}
					this.method7082(arg5, arg6, arg2, local261, arg4, local192, local269, local253);
				} else if (arg0 == 4) {
					local192 = this.anInt3730 - this.anInt3762;
					for (local253 = 0; local253 < this.anInt3792; local253++) {
						this.anIntArray250[local253] += arg3.sa(arg4 + this.anIntArray255[local253], arg6 + this.anIntArray247[local253]) + local192 - arg5;
					}
				} else if (arg0 == 5) {
					local192 = this.anInt3730 - this.anInt3762;
					for (local253 = 0; local253 < this.anInt3792; local253++) {
						local261 = arg4 + this.anIntArray255[local253];
						local269 = this.anIntArray247[local253] + arg6;
						@Pc(369) int local369 = arg2.sa(local261, local269);
						@Pc(374) int local374 = arg3.sa(local261, local269);
						@Pc(379) int local379 = local369 - local374;
						this.anIntArray250[local253] = local369 + ((this.anIntArray250[local253] << 8) / local192 * local379 >> 8) - arg5;
					}
				}
			}
		}
		this.method3360();
		this.aBoolean314 = false;
	}

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean314) {
			this.method3350();
		}
		return this.anInt3741;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "()[Lclient!haa;")
	@Override
	public Class128[] method7071() {
		return this.aClass128Array1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIIIIIIII)Z")
	private boolean method3345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg2 && arg7 > arg5 && arg4 > arg5) {
			return false;
		} else if (arg5 > arg2 && arg7 < arg5 && arg4 < arg5) {
			return false;
		} else if (arg0 > arg6 && arg3 > arg6 && arg6 < arg1) {
			return false;
		} else {
			return arg0 >= arg6 || arg3 >= arg6 || arg6 <= arg1;
		}
	}

	@OriginalMember(owner = "client!ge", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class6_Sub4_Sub2 Z(@OriginalArg(0) Class6_Sub4_Sub2 arg0) {
		if (this.anInt3774 == 0) {
			return null;
		}
		if (!this.aBoolean314) {
			this.method3350();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass9_Sub3_8.anInt6564 > 0) {
			local43 = this.anInt3734 - (this.aClass9_Sub3_8.anInt6564 * this.anInt3730 >> 8) >> this.aClass9_Sub3_8.anInt6529;
			local60 = this.anInt3741 - (this.aClass9_Sub3_8.anInt6564 * this.anInt3762 >> 8) >> this.aClass9_Sub3_8.anInt6529;
		} else {
			local43 = this.anInt3734 - (this.anInt3762 * this.aClass9_Sub3_8.anInt6564 >> 8) >> this.aClass9_Sub3_8.anInt6529;
			local60 = this.anInt3741 - (this.aClass9_Sub3_8.anInt6564 * this.anInt3730 >> 8) >> this.aClass9_Sub3_8.anInt6529;
		}
		@Pc(120) int local120;
		@Pc(137) int local137;
		if (this.aClass9_Sub3_8.anInt6558 <= 0) {
			local120 = this.anInt3789 - (this.aClass9_Sub3_8.anInt6558 * this.anInt3762 >> 8) >> this.aClass9_Sub3_8.anInt6529;
			local137 = this.anInt3747 - (this.anInt3730 * this.aClass9_Sub3_8.anInt6558 >> 8) >> this.aClass9_Sub3_8.anInt6529;
		} else {
			local120 = this.anInt3789 - (this.anInt3730 * this.aClass9_Sub3_8.anInt6558 >> 8) >> this.aClass9_Sub3_8.anInt6529;
			local137 = this.anInt3747 - (this.anInt3762 * this.aClass9_Sub3_8.anInt6558 >> 8) >> this.aClass9_Sub3_8.anInt6529;
		}
		@Pc(180) int local180 = local60 + 1 - local43;
		@Pc(186) int local186 = local137 + 1 - local120;
		@Pc(189) Class6_Sub4_Sub2_Sub2 local189 = (Class6_Sub4_Sub2_Sub2) arg0;
		@Pc(199) Class6_Sub4_Sub2_Sub2 local199;
		if (local189 != null && local189.method7651(local186, local180)) {
			local199 = local189;
			local189.method7648();
		} else {
			local199 = new Class6_Sub4_Sub2_Sub2(this.aClass9_Sub3_8, local180, local186);
		}
		local199.method7650(local137, local43, local120, local60);
		this.method3362(local199);
		return local199;
	}

	@OriginalMember(owner = "client!ge", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean314) {
			this.method3350();
		}
		return this.anInt3734;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!q;Lclient!mr;II)V")
	@Override
	public void method7075(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class5_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3774 == 0) {
			return;
		}
		@Pc(16) Class8_Sub3 local16 = this.aClass9_Sub3_8.aClass8_Sub3_16;
		@Pc(19) Class8_Sub3 local19 = (Class8_Sub3) arg0;
		if (!this.aBoolean314) {
			this.method3350();
		}
		Static238.aFloat111 = local19.aFloat215 * local16.aFloat216 + local19.aFloat205 * local16.aFloat215 + local19.aFloat210 * local16.aFloat214;
		Static435.aFloat178 = local16.aFloat211 + local16.aFloat215 * local19.aFloat213 + local19.aFloat206 * local16.aFloat214 + local19.aFloat211 * local16.aFloat216;
		@Pc(72) float local72 = Static435.aFloat178 + (float) this.anInt3762 * Static238.aFloat111;
		@Pc(80) float local80 = (float) this.anInt3730 * Static238.aFloat111 + Static435.aFloat178;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local91 = (float) -this.anInt3740 + local80;
			local97 = local72 + (float) this.anInt3740;
		} else {
			local97 = local80 + (float) this.anInt3740;
			local91 = (float) -this.anInt3740 + local72;
		}
		if (this.aClass9_Sub3_8.aFloat146 <= local91 || (float) this.aClass9_Sub3_8.anInt6540 >= local97) {
			return;
		}
		Static114.aFloat47 = local19.aFloat205 * local16.aFloat210 + local19.aFloat210 * local16.aFloat207 + local19.aFloat215 * local16.aFloat208;
		Static529.aFloat192 = local16.aFloat206 + local19.aFloat211 * local16.aFloat208 + local16.aFloat210 * local19.aFloat213 + local16.aFloat207 * local19.aFloat206;
		@Pc(174) float local174 = Static114.aFloat47 * (float) this.anInt3762 + Static529.aFloat192;
		@Pc(182) float local182 = (float) this.anInt3730 * Static114.aFloat47 + Static529.aFloat192;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local174 > local182) {
			local197 = (float) this.aClass9_Sub3_8.anInt6549 * (local174 + (float) this.anInt3740);
			local209 = (float) this.aClass9_Sub3_8.anInt6549 * ((float) -this.anInt3740 + local182);
		} else {
			local209 = (local174 - (float) this.anInt3740) * (float) this.aClass9_Sub3_8.anInt6549;
			local197 = ((float) this.anInt3740 + local182) * (float) this.aClass9_Sub3_8.anInt6549;
		}
		if (local209 / (float) arg2 >= this.aClass9_Sub3_8.aFloat132 || this.aClass9_Sub3_8.aFloat133 >= local197 / (float) arg2) {
			return;
		}
		Static288.aFloat120 = local19.aFloat215 * local16.aFloat212 + local16.aFloat205 * local19.aFloat205 + local19.aFloat210 * local16.aFloat209;
		Static77.aFloat45 = local19.aFloat211 * local16.aFloat212 + local16.aFloat205 * local19.aFloat213 + local16.aFloat209 * local19.aFloat206 + local16.aFloat213;
		@Pc(300) float local300 = (float) this.anInt3762 * Static288.aFloat120 + Static77.aFloat45;
		@Pc(308) float local308 = Static77.aFloat45 + (float) this.anInt3730 * Static288.aFloat120;
		@Pc(334) float local334;
		@Pc(323) float local323;
		if (local300 > local308) {
			local323 = (local300 + (float) this.anInt3740) * (float) this.aClass9_Sub3_8.anInt6527;
			local334 = (float) this.aClass9_Sub3_8.anInt6527 * ((float) -this.anInt3740 + local308);
		} else {
			local323 = ((float) this.anInt3740 + local308) * (float) this.aClass9_Sub3_8.anInt6527;
			local334 = (float) this.aClass9_Sub3_8.anInt6527 * (local300 - (float) this.anInt3740);
		}
		if (local334 / (float) arg2 >= this.aClass9_Sub3_8.aFloat136 || local323 / (float) arg2 <= this.aClass9_Sub3_8.aFloat134) {
			return;
		}
		if (arg1 != null || this.aClass201Array1 != null) {
			Static321.aFloat127 = local19.aFloat209 * local16.aFloat215 + local19.aFloat207 * local16.aFloat214 + local19.aFloat214 * local16.aFloat216;
			Static234.aFloat108 = local16.aFloat215 * local19.aFloat212 + local19.aFloat208 * local16.aFloat214 + local16.aFloat216 * local19.aFloat216;
			Static439.aFloat179 = local19.aFloat214 * local16.aFloat212 + local19.aFloat209 * local16.aFloat205 + local16.aFloat209 * local19.aFloat207;
			Static377.aFloat189 = local19.aFloat214 * local16.aFloat208 + local19.aFloat209 * local16.aFloat210 + local16.aFloat207 * local19.aFloat207;
			Static518.aFloat191 = local19.aFloat216 * local16.aFloat212 + local16.aFloat205 * local19.aFloat212 + local16.aFloat209 * local19.aFloat208;
			Static224.aFloat104 = local19.aFloat208 * local16.aFloat207 + local16.aFloat210 * local19.aFloat212 + local19.aFloat216 * local16.aFloat208;
		}
		if (arg1 != null) {
			@Pc(503) int local503 = this.anInt3734 + this.anInt3741 >> 1;
			@Pc(511) int local511 = this.anInt3747 + this.anInt3789 >> 1;
			@Pc(530) int local530 = (int) ((float) this.anInt3762 * Static114.aFloat47 + Static377.aFloat189 * (float) local503 + Static529.aFloat192 + Static224.aFloat104 * (float) local511);
			@Pc(549) int local549 = (int) (Static288.aFloat120 * (float) this.anInt3762 + Static439.aFloat179 * (float) local503 + Static77.aFloat45 + Static518.aFloat191 * (float) local511);
			@Pc(568) int local568 = (int) (Static238.aFloat111 * (float) this.anInt3762 + Static321.aFloat127 * (float) local503 + Static435.aFloat178 + (float) local511 * Static234.aFloat108);
			@Pc(587) int local587 = (int) (Static224.aFloat104 * (float) local511 + (float) this.anInt3730 * Static114.aFloat47 + Static529.aFloat192 + Static377.aFloat189 * (float) local503);
			@Pc(606) int local606 = (int) ((float) local511 * Static518.aFloat191 + Static288.aFloat120 * (float) this.anInt3730 + Static439.aFloat179 * (float) local503 + Static77.aFloat45);
			arg1.anInt6177 = this.aClass9_Sub3_8.anInt6527 * local549 / arg2 + this.aClass9_Sub3_8.anInt6544;
			arg1.anInt6179 = this.aClass9_Sub3_8.anInt6527 * local606 / arg2 + this.aClass9_Sub3_8.anInt6544;
			@Pc(651) int local651 = (int) ((float) local511 * Static234.aFloat108 + (float) this.anInt3730 * Static238.aFloat111 + Static435.aFloat178 + (float) local503 * Static321.aFloat127);
			arg1.anInt6180 = this.aClass9_Sub3_8.anInt6535 + local530 * this.aClass9_Sub3_8.anInt6549 / arg2;
			arg1.anInt6178 = this.aClass9_Sub3_8.anInt6535 + local587 * this.aClass9_Sub3_8.anInt6549 / arg2;
			if (local568 < this.aClass9_Sub3_8.anInt6540 && this.aClass9_Sub3_8.anInt6540 > local651) {
				arg1.anInt6181 = this.aClass9_Sub3_8.anInt6549 * (local530 + this.anInt3740) / arg2 + this.aClass9_Sub3_8.anInt6535 - arg1.anInt6180;
				arg1.aBoolean456 = true;
			}
		}
		this.aClass9_Sub3_8.method5579((float) arg2);
		this.aClass9_Sub3_8.method5506();
		this.aClass9_Sub3_8.method5583(local19);
		this.method3361();
		this.method3365();
	}

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort34;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Z")
	private boolean method3348() {
		@Pc(13) boolean local13 = !this.aClass307_2.aBoolean673;
		@Pc(26) boolean local26 = (this.anInt3749 & 0x37) != 0 && !this.aClass307_1.aBoolean673;
		@Pc(34) boolean local34 = !this.aClass307_4.aBoolean673;
		@Pc(42) boolean local42 = !this.aClass307_3.aBoolean673;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(59) boolean local59 = true;
		@Pc(78) Interface20 local78;
		@Pc(92) Buffer local92;
		if (local34) {
			if (this.aClass307_4.anInterface20_13 == null) {
				this.aClass307_4.anInterface20_13 = this.aClass9_Sub3_8.method5528(this.aBoolean313);
			}
			local78 = this.aClass307_4.anInterface20_13;
			local78.method6523(this.anInt3774 * 12, 12);
			local92 = local78.method6521();
			if (local92 == null) {
				local59 = false;
			} else {
				this.aClass9_Sub3_8.aNativeInterface3.copyPositions(this.anIntArray255, this.anIntArray250, this.anIntArray247, this.aShortArray48, 0, 12, this.anInt3774, local92.getAddress());
				if (local78.method6524()) {
					this.aClass307_4.aBoolean673 = true;
					this.aClass307_4.anInterface20_12 = local78;
				} else {
					local59 = false;
				}
			}
		}
		@Pc(184) short[] local184;
		@Pc(181) short[] local181;
		@Pc(187) short[] local187;
		@Pc(190) byte[] local190;
		if (local13) {
			if (this.aClass307_2.anInterface20_13 == null) {
				this.aClass307_2.anInterface20_13 = this.aClass9_Sub3_8.method5528(this.aBoolean313);
			}
			local78 = this.aClass307_2.anInterface20_13;
			local78.method6523(this.anInt3774 * 4, 4);
			local92 = local78.method6521();
			if (local92 == null) {
				local59 = false;
			} else {
				if ((this.anInt3749 & 0x37) == 0) {
					if (this.aClass63_1 == null) {
						local181 = this.aShortArray44;
						local184 = this.aShortArray38;
						local187 = this.aShortArray43;
						local190 = this.aByteArray46;
					} else {
						local187 = this.aClass63_1.aShortArray29;
						local181 = this.aClass63_1.aShortArray28;
						local184 = this.aClass63_1.aShortArray27;
						local190 = this.aClass63_1.aByteArray39;
					}
					this.aClass9_Sub3_8.aNativeInterface3.copyLighting(this.aShortArray40, this.aByteArray47, this.aShortArray45, local184, local181, local187, local190, this.aShort34, this.aShort35, this.aShortArray47, 0, 4, this.anInt3774, local92.getAddress());
				} else {
					this.aClass9_Sub3_8.aNativeInterface3.copyColours(this.aShortArray40, this.aByteArray47, this.aShortArray45, this.aShort34, this.aShortArray47, 0, 4, this.anInt3774, local92.getAddress());
				}
				if (local78.method6524()) {
					this.aClass307_2.aBoolean673 = true;
					this.aClass307_2.anInterface20_12 = local78;
				} else {
					local59 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass307_1.anInterface20_13 == null) {
				this.aClass307_1.anInterface20_13 = this.aClass9_Sub3_8.method5528(this.aBoolean313);
			}
			local78 = this.aClass307_1.anInterface20_13;
			local78.method6523(this.anInt3774 * 12, 12);
			local92 = local78.method6521();
			if (local92 == null) {
				local59 = false;
			} else {
				if (this.aClass63_1 == null) {
					local184 = this.aShortArray38;
					local190 = this.aByteArray46;
					local187 = this.aShortArray43;
					local181 = this.aShortArray44;
				} else {
					local187 = this.aClass63_1.aShortArray29;
					local190 = this.aClass63_1.aByteArray39;
					local181 = this.aClass63_1.aShortArray28;
					local184 = this.aClass63_1.aShortArray27;
				}
				this.aClass9_Sub3_8.aNativeInterface3.copyNormals(local184, local181, local187, local190, 3.0F / (float) this.aShort35, 3.0F / (float) (this.aShort35 + this.aShort35 / 2), 0, 12, this.anInt3774, local92.getAddress());
				if (local78.method6524()) {
					this.aClass307_1.aBoolean673 = true;
					this.aClass307_1.anInterface20_12 = local78;
				} else {
					local59 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass307_3.anInterface20_13 == null) {
				this.aClass307_3.anInterface20_13 = this.aClass9_Sub3_8.method5528(this.aBoolean313);
			}
			local78 = this.aClass307_3.anInterface20_13;
			local78.method6523(this.anInt3774 * 8, 8);
			local92 = local78.method6521();
			if (local92 == null) {
				local59 = false;
			} else {
				this.aClass9_Sub3_8.aNativeInterface3.copyTexCoords(this.aFloatArray31, this.aFloatArray32, 0, 8, this.anInt3774, local92.getAddress());
				if (local78.method6524()) {
					this.aClass307_3.aBoolean673 = true;
					this.aClass307_3.anInterface20_12 = local78;
				} else {
					local59 = false;
				}
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class179.anIntArray756[arg0];
		@Pc(13) int local13 = Class179.anIntArray757[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3792; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray255[local15] + local9 * this.anIntArray250[local15] >> 14;
			this.anIntArray250[local15] = this.anIntArray250[local15] * local13 - local9 * this.anIntArray255[local15] >> 14;
			this.anIntArray255[local15] = local33;
		}
		this.method3360();
		this.aBoolean314 = false;
	}

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean314) {
			this.method3350();
		}
		return this.anInt3747;
	}

	@OriginalMember(owner = "client!ge", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static110.anInt2518 = 0;
			Static170.anInt3902 = 0;
			Static472.anInt6156 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray23.length > local38) {
					local52 = this.anIntArrayArray23[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray42 == null || (arg6 & this.aShortArray42[local60]) != 0) {
							Static170.anInt3902 += this.anIntArray255[local60];
							Static472.anInt6156 += this.anIntArray250[local60];
							Static110.anInt2518 += this.anIntArray247[local60];
							local30++;
						}
					}
				}
			}
			if (local30 <= 0) {
				Static472.anInt6156 = arg3;
				Static110.anInt2518 = arg4;
				Static170.anInt3902 = arg2;
			} else {
				Static250.aBoolean384 = true;
				Static170.anInt3902 = Static170.anInt3902 / local30 + arg2;
				Static110.anInt2518 = arg4 + Static110.anInt2518 / local30;
				Static472.anInt6156 = arg3 + Static472.anInt6156 / local30;
			}
			return;
		}
		@Pc(249) int[] local249;
		@Pc(251) int local251;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg2 * arg7[0] + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
				local38 = arg2 * arg7[6] + arg7[7] * arg3 + arg4 * arg7[8] + 8192 >> 14;
				arg2 = local30;
				arg4 = local38;
				arg3 = local32;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray23.length) {
					local249 = this.anIntArrayArray23[local32];
					for (local251 = 0; local251 < local249.length; local251++) {
						local54 = local249[local251];
						if (this.aShortArray42 == null || (this.aShortArray42[local54] & arg6) != 0) {
							this.anIntArray255[local54] += arg2;
							this.anIntArray250[local54] += arg3;
							this.anIntArray247[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(371) int local371;
		@Pc(394) int local394;
		@Pc(421) int local421;
		@Pc(452) int local452;
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(464) int local464;
		@Pc(472) int local472;
		@Pc(480) int local480;
		@Pc(634) int local634;
		@Pc(659) int local659;
		@Pc(663) int local663;
		@Pc(671) int local671;
		@Pc(676) int local676;
		@Pc(680) int local680;
		@Pc(684) int local684;
		@Pc(686) int local686;
		@Pc(815) int[] local815;
		@Pc(817) int local817;
		@Pc(821) int local821;
		@Pc(825) int local825;
		@Pc(827) int local827;
		@Pc(957) int local957;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray23.length) {
						local249 = this.anIntArrayArray23[local32];
						for (local251 = 0; local251 < local249.length; local251++) {
							local54 = local249[local251];
							if (this.aShortArray42 == null || (this.aShortArray42[local54] & arg6) != 0) {
								this.anIntArray255[local54] -= Static170.anInt3902;
								this.anIntArray250[local54] -= Static472.anInt6156;
								this.anIntArray247[local54] -= Static110.anInt2518;
								if (arg4 != 0) {
									local60 = Class179.anIntArray756[arg4];
									local371 = Class179.anIntArray757[arg4];
									local394 = this.anIntArray255[local54] * local371 + local60 * this.anIntArray250[local54] + 16383 >> 14;
									this.anIntArray250[local54] = this.anIntArray250[local54] * local371 + 16383 - this.anIntArray255[local54] * local60 >> 14;
									this.anIntArray255[local54] = local394;
								}
								if (arg2 != 0) {
									local60 = Class179.anIntArray756[arg2];
									local371 = Class179.anIntArray757[arg2];
									local394 = local371 * this.anIntArray250[local54] + 16383 - local60 * this.anIntArray247[local54] >> 14;
									this.anIntArray247[local54] = this.anIntArray247[local54] * local371 + local60 * this.anIntArray250[local54] + 16383 >> 14;
									this.anIntArray250[local54] = local394;
								}
								if (arg3 != 0) {
									local60 = Class179.anIntArray756[arg3];
									local371 = Class179.anIntArray757[arg3];
									local394 = local60 * this.anIntArray247[local54] + this.anIntArray255[local54] * local371 + 16383 >> 14;
									this.anIntArray247[local54] = this.anIntArray247[local54] * local371 + 16383 - this.anIntArray255[local54] * local60 >> 14;
									this.anIntArray255[local54] = local394;
								}
								this.anIntArray255[local54] += Static170.anInt3902;
								this.anIntArray250[local54] += Static472.anInt6156;
								this.anIntArray247[local54] += Static110.anInt2518;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray23.length > local38) {
							local52 = this.anIntArrayArray23[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray42 == null || (arg6 & this.aShortArray42[local60]) != 0) {
									local371 = this.anIntArray249[local60];
									local394 = this.anIntArray249[local60 + 1];
									for (local421 = local371; local421 < local394; local421++) {
										local452 = this.aShortArray46[local421] - 1;
										if (local452 == -1) {
											break;
										}
										if (arg4 != 0) {
											local456 = Class179.anIntArray756[arg4];
											local460 = Class179.anIntArray757[arg4];
											local464 = local460 * this.aShortArray38[local452] + local456 * this.aShortArray44[local452] + 16383 >> 14;
											this.aShortArray44[local452] = (short) (local460 * this.aShortArray44[local452] + 16383 - local456 * this.aShortArray38[local452] >> 14);
											this.aShortArray38[local452] = (short) local464;
										}
										if (arg2 != 0) {
											local456 = Class179.anIntArray756[arg2];
											local460 = Class179.anIntArray757[arg2];
											local464 = this.aShortArray44[local452] * local460 + 16383 - this.aShortArray43[local452] * local456 >> 14;
											this.aShortArray43[local452] = (short) (local456 * this.aShortArray44[local452] + local460 * this.aShortArray43[local452] + 16383 >> 14);
											this.aShortArray44[local452] = (short) local464;
										}
										if (arg3 != 0) {
											local456 = Class179.anIntArray756[arg3];
											local460 = Class179.anIntArray757[arg3];
											local464 = this.aShortArray43[local452] * local456 + local460 * this.aShortArray38[local452] + 16383 >> 14;
											this.aShortArray43[local452] = (short) (this.aShortArray43[local452] * local460 + 16383 - local456 * this.aShortArray38[local452] >> 14);
											this.aShortArray38[local452] = (short) local464;
										}
									}
								}
							}
						}
					}
					this.method3357();
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local251 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static250.aBoolean384) {
					local371 = arg7[6] * Static110.anInt2518 + arg7[0] * Static170.anInt3902 + Static472.anInt6156 * arg7[3] + 8192 >> 14;
					local394 = arg7[1] * Static170.anInt3902 + Static472.anInt6156 * arg7[4] + arg7[7] * Static110.anInt2518 + 8192 >> 14;
					local371 += local251;
					local421 = Static110.anInt2518 * arg7[8] + Static170.anInt3902 * arg7[2] + arg7[5] * Static472.anInt6156 + 8192 >> 14;
					local394 += local54;
					Static472.anInt6156 = local394;
					Static170.anInt3902 = local371;
					local421 += local60;
					Static110.anInt2518 = local421;
					Static250.aBoolean384 = false;
				}
				@Pc(440) int[] local440 = new int[9];
				local394 = Class179.anIntArray757[arg2];
				local421 = Class179.anIntArray756[arg2];
				local452 = Class179.anIntArray757[arg3];
				local456 = Class179.anIntArray756[arg3];
				local460 = Class179.anIntArray757[arg4];
				local464 = Class179.anIntArray756[arg4];
				local472 = local421 * local460 + 8192 >> 14;
				local480 = local464 * local421 + 8192 >> 14;
				local440[6] = local460 * -local456 + local480 * local452 + 8192 >> 14;
				local440[1] = local472 * local456 + -local452 * local464 + 8192 >> 14;
				local440[8] = local394 * local452 + 8192 >> 14;
				local440[5] = -local421;
				local440[7] = local456 * local464 + local452 * local472 + 8192 >> 14;
				local440[0] = local460 * local452 + local456 * local480 + 8192 >> 14;
				local440[4] = local394 * local460 + 8192 >> 14;
				local440[3] = local394 * local464 + 8192 >> 14;
				local440[2] = local394 * local456 + 8192 >> 14;
				@Pc(609) int local609 = local440[2] * -Static110.anInt2518 + -Static472.anInt6156 * local440[1] + -Static170.anInt3902 * local440[0] + 8192 >> 14;
				local634 = local440[3] * -Static170.anInt3902 + -Static472.anInt6156 * local440[4] + -Static110.anInt2518 * local440[5] + 8192 >> 14;
				local659 = -Static110.anInt2518 * local440[8] + -Static170.anInt3902 * local440[6] + -Static472.anInt6156 * local440[7] + 8192 >> 14;
				local663 = local609 + Static170.anInt3902;
				@Pc(667) int local667 = Static472.anInt6156 + local634;
				local671 = Static110.anInt2518 + local659;
				@Pc(674) int[] local674 = new int[9];
				for (local676 = 0; local676 < 3; local676++) {
					for (local680 = 0; local680 < 3; local680++) {
						local684 = 0;
						for (local686 = 0; local686 < 3; local686++) {
							local684 += local440[local676 * 3 + local686] * arg7[local686 + local680 * 3];
						}
						local674[local676 * 3 + local680] = local684 + 8192 >> 14;
					}
				}
				local680 = local440[2] * local60 + local54 * local440[1] + local251 * local440[0] + 8192 >> 14;
				local684 = local440[5] * local60 + local440[4] * local54 + local440[3] * local251 + 8192 >> 14;
				local680 += local663;
				local686 = local60 * local440[8] + local251 * local440[6] + local440[7] * local54 + 8192 >> 14;
				local684 += local667;
				local686 += local671;
				local815 = new int[9];
				for (local817 = 0; local817 < 3; local817++) {
					for (local821 = 0; local821 < 3; local821++) {
						local825 = 0;
						for (local827 = 0; local827 < 3; local827++) {
							local825 += arg7[local827 + local817 * 3] * local674[local827 * 3 + local821];
						}
						local815[local817 * 3 + local821] = local825 + 8192 >> 14;
					}
				}
				local821 = arg7[2] * local686 + arg7[0] * local680 + arg7[1] * local684 + 8192 >> 14;
				local825 = arg7[5] * local686 + arg7[3] * local680 + arg7[4] * local684 + 8192 >> 14;
				local825 += local32;
				local827 = arg7[7] * local684 + arg7[6] * local680 + local686 * arg7[8] + 8192 >> 14;
				local821 += local30;
				local827 += local38;
				for (local957 = 0; local957 < local8; local957++) {
					@Pc(963) int local963 = arg1[local957];
					if (local963 < this.anIntArrayArray23.length) {
						@Pc(973) int[] local973 = this.anIntArrayArray23[local963];
						for (@Pc(975) int local975 = 0; local975 < local973.length; local975++) {
							@Pc(981) int local981 = local973[local975];
							if (this.aShortArray42 == null || (this.aShortArray42[local981] & arg6) != 0) {
								@Pc(1022) int local1022 = this.anIntArray247[local981] * local815[2] + local815[1] * this.anIntArray250[local981] + local815[0] * this.anIntArray255[local981] + 8192 >> 14;
								@Pc(1053) int local1053 = local815[5] * this.anIntArray247[local981] + local815[4] * this.anIntArray250[local981] + this.anIntArray255[local981] * local815[3] + 8192 >> 14;
								@Pc(1057) int local1057 = local1022 + local821;
								@Pc(1061) int local1061 = local1053 + local825;
								@Pc(1092) int local1092 = this.anIntArray247[local981] * local815[8] + local815[7] * this.anIntArray250[local981] + local815[6] * this.anIntArray255[local981] + 8192 >> 14;
								this.anIntArray255[local981] = local1057;
								@Pc(1101) int local1101 = local1092 + local827;
								this.anIntArray250[local981] = local1061;
								this.anIntArray247[local981] = local1101;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2560) Class157 local2560;
			@Pc(2450) boolean local2450;
			@Pc(2555) Class201 local2555;
			if (arg0 == 5) {
				if (this.anIntArrayArray21 != null) {
					local2450 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray21.length > local38) {
							local52 = this.anIntArrayArray21[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray41 == null || (arg6 & this.aShortArray41[local60]) != 0) {
									local371 = (this.aByteArray47[local60] & 0xFF) + (arg2 * 8);
									if (local371 < 0) {
										local371 = 0;
									} else if (local371 > 255) {
										local371 = 255;
									}
									this.aByteArray47[local60] = (byte) local371;
								}
							}
							local2450 |= local52.length > 0;
						}
					}
					if (local2450) {
						if (this.aClass201Array1 != null) {
							for (local38 = 0; local38 < this.anInt3790; local38++) {
								local2555 = this.aClass201Array1[local38];
								local2560 = this.aClass157Array1[local38];
								local2560.anInt4789 = local2560.anInt4789 & 0xFFFFFF | 255 - (this.aByteArray47[local2555.anInt5694] & 0xFF) << 24;
							}
						}
						this.method3353();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray21 != null) {
					local2450 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray21.length > local38) {
							local52 = this.anIntArrayArray21[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray41 == null || (this.aShortArray41[local60] & arg6) != 0) {
									local371 = this.aShortArray40[local60] & 0xFFFF;
									local394 = local371 >> 10 & 0x3F;
									local421 = local371 >> 7 & 0x7;
									@Pc(2664) int local2664 = arg2 + local394 & 0x3F;
									local421 += arg3 / 4;
									local452 = local371 & 0x7F;
									if (local421 < 0) {
										local421 = 0;
									} else if (local421 > 7) {
										local421 = 7;
									}
									local452 += arg4;
									if (local452 < 0) {
										local452 = 0;
									} else if (local452 > 127) {
										local452 = 127;
									}
									this.aShortArray40[local60] = (short) (local2664 << 10 | local421 << 7 | local452);
								}
							}
							local2450 |= local52.length > 0;
						}
					}
					if (local2450) {
						if (this.aClass201Array1 != null) {
							for (local38 = 0; local38 < this.anInt3790; local38++) {
								local2555 = this.aClass201Array1[local38];
								local2560 = this.aClass157Array1[local38];
								local2560.anInt4789 = local2560.anInt4789 & 0xFF000000 | Static223.anIntArray301[this.aShortArray40[local2555.anInt5694] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method3353();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray22 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray22.length) {
							local249 = this.anIntArrayArray22[local32];
							for (local251 = 0; local251 < local249.length; local251++) {
								local2560 = this.aClass157Array1[local249[local251]];
								local2560.anInt4793 += arg3;
								local2560.anInt4788 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray22 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray22.length > local32) {
							local249 = this.anIntArrayArray22[local32];
							for (local251 = 0; local251 < local249.length; local251++) {
								local2560 = this.aClass157Array1[local249[local251]];
								local2560.anInt4790 = local2560.anInt4790 * arg3 >> 7;
								local2560.anInt4794 = local2560.anInt4794 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray22 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray22.length) {
						local249 = this.anIntArrayArray22[local32];
						for (local251 = 0; local251 < local249.length; local251++) {
							local2560 = this.aClass157Array1[local249[local251]];
							local2560.anInt4792 = arg2 + local2560.anInt4792 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray23.length > local32) {
					local249 = this.anIntArrayArray23[local32];
					for (local251 = 0; local251 < local249.length; local251++) {
						local54 = local249[local251];
						if (this.aShortArray42 == null || (this.aShortArray42[local54] & arg6) != 0) {
							this.anIntArray255[local54] -= Static170.anInt3902;
							this.anIntArray250[local54] -= Static472.anInt6156;
							this.anIntArray247[local54] -= Static110.anInt2518;
							this.anIntArray255[local54] = this.anIntArray255[local54] * arg2 >> 7;
							this.anIntArray250[local54] = this.anIntArray250[local54] * arg3 >> 7;
							this.anIntArray247[local54] = this.anIntArray247[local54] * arg4 >> 7;
							this.anIntArray255[local54] += Static170.anInt3902;
							this.anIntArray250[local54] += Static472.anInt6156;
							this.anIntArray247[local54] += Static110.anInt2518;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local251 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static250.aBoolean384) {
				local371 = arg7[3] * Static472.anInt6156 + Static170.anInt3902 * arg7[0] + Static110.anInt2518 * arg7[6] + 8192 >> 14;
				local394 = arg7[7] * Static110.anInt2518 + arg7[1] * Static170.anInt3902 + Static472.anInt6156 * arg7[4] + 8192 >> 14;
				local394 += local54;
				local421 = arg7[8] * Static110.anInt2518 + arg7[2] * Static170.anInt3902 + arg7[5] * Static472.anInt6156 + 8192 >> 14;
				local371 += local251;
				local421 += local60;
				Static472.anInt6156 = local394;
				Static170.anInt3902 = local371;
				Static250.aBoolean384 = false;
				Static110.anInt2518 = local421;
			}
			local371 = arg2 << 15 >> 7;
			local394 = arg3 << 15 >> 7;
			local421 = arg4 << 15 >> 7;
			local452 = -Static170.anInt3902 * local371 + 8192 >> 14;
			local456 = local394 * -Static472.anInt6156 + 8192 >> 14;
			local460 = local421 * -Static110.anInt2518 + 8192 >> 14;
			local464 = local452 + Static170.anInt3902;
			local472 = local456 + Static472.anInt6156;
			local480 = Static110.anInt2518 + local460;
			@Pc(1985) int[] local1985 = new int[] { local371 * arg7[0] + 8192 >> 14, arg7[3] * local371 + 8192 >> 14, local371 * arg7[6] + 8192 >> 14, arg7[1] * local394 + 8192 >> 14, local394 * arg7[4] + 8192 >> 14, local394 * arg7[7] + 8192 >> 14, arg7[2] * local421 + 8192 >> 14, arg7[5] * local421 + 8192 >> 14, arg7[8] * local421 + 8192 >> 14 };
			local634 = local251 * local371 + 8192 >> 14;
			local659 = local54 * local394 + 8192 >> 14;
			@Pc(2113) int local2113 = local634 + local464;
			@Pc(2117) int local2117 = local659 + local472;
			local663 = local421 * local60 + 8192 >> 14;
			@Pc(2129) int local2129 = local663 + local480;
			@Pc(2132) int[] local2132 = new int[9];
			@Pc(2138) int local2138;
			for (local671 = 0; local671 < 3; local671++) {
				for (local2138 = 0; local2138 < 3; local2138++) {
					local676 = 0;
					for (local680 = 0; local680 < 3; local680++) {
						local676 += local1985[local2138 + local680 * 3] * arg7[local671 * 3 + local680];
					}
					local2132[local2138 + local671 * 3] = local676 + 8192 >> 14;
				}
			}
			local2138 = arg7[0] * local2113 + arg7[1] * local2117 + local2129 * arg7[2] + 8192 >> 14;
			local676 = local2129 * arg7[5] + local2113 * arg7[3] + local2117 * arg7[4] + 8192 >> 14;
			local2138 += local30;
			local680 = arg7[8] * local2129 + local2113 * arg7[6] + local2117 * arg7[7] + 8192 >> 14;
			local676 += local32;
			local680 += local38;
			for (local684 = 0; local684 < local8; local684++) {
				local686 = arg1[local684];
				if (this.anIntArrayArray23.length > local686) {
					local815 = this.anIntArrayArray23[local686];
					for (local817 = 0; local817 < local815.length; local817++) {
						local821 = local815[local817];
						if (this.aShortArray42 == null || (this.aShortArray42[local821] & arg6) != 0) {
							local825 = this.anIntArray247[local821] * local2132[2] + local2132[1] * this.anIntArray250[local821] + this.anIntArray255[local821] * local2132[0] + 8192 >> 14;
							local827 = this.anIntArray247[local821] * local2132[5] + this.anIntArray250[local821] * local2132[4] + this.anIntArray255[local821] * local2132[3] + 8192 >> 14;
							@Pc(2376) int local2376 = local825 + local2138;
							@Pc(2380) int local2380 = local827 + local676;
							local957 = local2132[7] * this.anIntArray250[local821] + local2132[6] * this.anIntArray255[local821] + this.anIntArray247[local821] * local2132[8] + 8192 >> 14;
							this.anIntArray255[local821] = local2376;
							@Pc(2420) int local2420 = local957 + local680;
							this.anIntArray250[local821] = local2380;
							this.anIntArray247[local821] = local2420;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7078(@OriginalArg(0) Class8 arg0) {
		@Pc(8) Class8_Sub3 local8 = (Class8_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass69Array1 != null) {
			for (local13 = 0; local13 < this.aClass69Array1.length; local13++) {
				@Pc(20) Class69 local20 = this.aClass69Array1[local13];
				@Pc(22) Class69 local22 = local20;
				if (local20.aClass69_1 != null) {
					local22 = local20.aClass69_1;
				}
				local22.anInt2219 = (int) ((float) this.anIntArray250[local20.anInt2226] * local8.aFloat210 + (float) this.anIntArray255[local20.anInt2226] * local8.aFloat207 + local8.aFloat208 * (float) this.anIntArray247[local20.anInt2226] + local8.aFloat206);
				local22.anInt2217 = (int) (local8.aFloat213 + local8.aFloat212 * (float) this.anIntArray247[local20.anInt2226] + local8.aFloat205 * (float) this.anIntArray250[local20.anInt2226] + (float) this.anIntArray255[local20.anInt2226] * local8.aFloat209);
				local22.anInt2215 = (int) (local8.aFloat215 * (float) this.anIntArray250[local20.anInt2226] + (float) this.anIntArray255[local20.anInt2226] * local8.aFloat214 + local8.aFloat216 * (float) this.anIntArray247[local20.anInt2226] + local8.aFloat211);
				local22.anInt2218 = (int) (local8.aFloat206 + (float) this.anIntArray247[local20.anInt2232] * local8.aFloat208 + (float) this.anIntArray255[local20.anInt2232] * local8.aFloat207 + local8.aFloat210 * (float) this.anIntArray250[local20.anInt2232]);
				local22.anInt2224 = (int) (local8.aFloat205 * (float) this.anIntArray250[local20.anInt2232] + local8.aFloat209 * (float) this.anIntArray255[local20.anInt2232] + (float) this.anIntArray247[local20.anInt2232] * local8.aFloat212 + local8.aFloat213);
				local22.anInt2233 = (int) ((float) this.anIntArray247[local20.anInt2232] * local8.aFloat216 + (float) this.anIntArray250[local20.anInt2232] * local8.aFloat215 + (float) this.anIntArray255[local20.anInt2232] * local8.aFloat214 + local8.aFloat211);
				local22.anInt2228 = (int) ((float) this.anIntArray250[local20.anInt2230] * local8.aFloat210 + local8.aFloat207 * (float) this.anIntArray255[local20.anInt2230] + local8.aFloat208 * (float) this.anIntArray247[local20.anInt2230] + local8.aFloat206);
				local22.anInt2229 = (int) ((float) this.anIntArray250[local20.anInt2230] * local8.aFloat205 + (float) this.anIntArray255[local20.anInt2230] * local8.aFloat209 + local8.aFloat212 * (float) this.anIntArray247[local20.anInt2230] + local8.aFloat213);
				local22.anInt2216 = (int) ((float) this.anIntArray247[local20.anInt2230] * local8.aFloat216 + (float) this.anIntArray255[local20.anInt2230] * local8.aFloat214 + (float) this.anIntArray250[local20.anInt2230] * local8.aFloat215 + local8.aFloat211);
			}
		}
		if (this.aClass128Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass128Array1.length; local13++) {
			@Pc(361) Class128 local361 = this.aClass128Array1[local13];
			@Pc(363) Class128 local363 = local361;
			if (local361.aClass128_1 != null) {
				local363 = local361.aClass128_1;
			}
			if (local361.aClass8_5 == null) {
				local361.aClass8_5 = local8.method8175();
			} else {
				local361.aClass8_5.la(local8);
			}
			local363.anInt4091 = (int) (local8.aFloat206 + local8.aFloat208 * (float) this.anIntArray247[local361.anInt4093] + (float) this.anIntArray255[local361.anInt4093] * local8.aFloat207 + (float) this.anIntArray250[local361.anInt4093] * local8.aFloat210);
			local363.anInt4086 = (int) (local8.aFloat209 * (float) this.anIntArray255[local361.anInt4093] + local8.aFloat205 * (float) this.anIntArray250[local361.anInt4093] + local8.aFloat212 * (float) this.anIntArray247[local361.anInt4093] + local8.aFloat213);
			local363.anInt4089 = (int) ((float) this.anIntArray247[local361.anInt4093] * local8.aFloat216 + local8.aFloat215 * (float) this.anIntArray250[local361.anInt4093] + local8.aFloat214 * (float) this.anIntArray255[local361.anInt4093] + local8.aFloat211);
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
	private void method3349() {
		if (!this.aBoolean315) {
			return;
		}
		this.aBoolean315 = false;
		if (this.aClass69Array1 == null && this.aClass128Array1 == null && this.aClass201Array1 == null) {
			if (this.anIntArray255 != null && !Static96.method2074(this.anInt3781, this.anInt3749)) {
				if (this.aClass307_4 == null || this.aClass307_4.method7454()) {
					if (!this.aBoolean314) {
						this.method3350();
					}
					this.anIntArray255 = null;
				} else {
					this.aBoolean315 = true;
				}
			}
			if (this.anIntArray250 != null && !Static144.method2664(this.anInt3749, this.anInt3781)) {
				if (this.aClass307_4 == null || this.aClass307_4.method7454()) {
					if (!this.aBoolean314) {
						this.method3350();
					}
					this.anIntArray250 = null;
				} else {
					this.aBoolean315 = true;
				}
			}
			if (this.anIntArray247 != null && !Static55.method1266(this.anInt3749, this.anInt3781)) {
				if (this.aClass307_4 == null || this.aClass307_4.method7454()) {
					if (!this.aBoolean314) {
						this.method3350();
					}
					this.anIntArray247 = null;
				} else {
					this.aBoolean315 = true;
				}
			}
		}
		if (this.aShortArray46 != null && this.anIntArray255 == null && this.anIntArray250 == null && this.anIntArray247 == null) {
			this.aShortArray46 = null;
			this.anIntArray249 = null;
		}
		if (this.aByteArray46 != null && !Static136.method2551(this.anInt3781, this.anInt3749)) {
			label195: {
				label194: {
					@Pc(168) boolean local168;
					if ((this.anInt3749 & 0x37) == 0) {
						if (this.aClass307_2 == null || this.aClass307_2.method7454()) {
							break label194;
						}
						local168 = false;
					} else {
						if (this.aClass307_1 == null || this.aClass307_1.method7454()) {
							break label194;
						}
						local168 = false;
					}
					if (!local168) {
						this.aBoolean315 = true;
						break label195;
					}
				}
				this.aByteArray46 = null;
				this.aShortArray38 = this.aShortArray44 = this.aShortArray43 = null;
			}
		}
		if (this.aShortArray40 != null && !Static205.method3807(this.anInt3749, this.anInt3781)) {
			if (this.aClass307_2 == null || this.aClass307_2.method7454()) {
				this.aShortArray40 = null;
			} else {
				this.aBoolean315 = true;
			}
		}
		if (this.aByteArray47 != null && !Static106.method2196(this.anInt3749, this.anInt3781)) {
			if (this.aClass307_2 == null || this.aClass307_2.method7454()) {
				this.aByteArray47 = null;
			} else {
				this.aBoolean315 = true;
			}
		}
		if (this.aFloatArray31 != null && !Static94.method2049(this.anInt3749, this.anInt3781)) {
			if (this.aClass307_3 == null || this.aClass307_3.method7454()) {
				this.aFloatArray31 = this.aFloatArray32 = null;
			} else {
				this.aBoolean315 = true;
			}
		}
		if (this.aShortArray45 != null && !Static439.method6703(this.anInt3781, this.anInt3749)) {
			if (this.aClass307_2 == null || this.aClass307_2.method7454()) {
				this.aShortArray45 = null;
			} else {
				this.aBoolean315 = true;
			}
		}
		if (this.aShortArray49 != null && !Static85.method1888(this.anInt3781, this.anInt3749)) {
			if ((this.aClass274_1 == null || this.aClass274_1.method6628()) && (this.aClass307_2 == null || this.aClass307_2.method7454())) {
				this.aShortArray49 = this.aShortArray37 = this.aShortArray39 = null;
			} else {
				this.aBoolean315 = true;
			}
		}
		if (this.aShortArray48 != null) {
			if (this.aClass307_4 == null || this.aClass307_4.method7454()) {
				this.aShortArray48 = null;
			} else {
				this.aBoolean315 = true;
			}
		}
		if (this.aShortArray47 != null) {
			if (this.aClass307_2 == null || this.aClass307_2.method7454()) {
				this.aShortArray47 = null;
			} else {
				this.aBoolean315 = true;
			}
		}
		if (this.anIntArrayArray21 != null && !Static469.method7232(this.anInt3781, this.anInt3749)) {
			this.anIntArrayArray21 = null;
			this.aShortArray41 = null;
		}
		if (this.anIntArrayArray23 != null && !Static225.method4050(this.anInt3749, this.anInt3781)) {
			this.aShortArray42 = null;
			this.anIntArrayArray23 = null;
		}
		if (this.anIntArrayArray22 != null && !Static275.method4580(this.anInt3749, this.anInt3781)) {
			this.anIntArrayArray22 = null;
		}
		if (this.anIntArray251 != null && (this.anInt3781 & 0x800) == 0 && (this.anInt3781 & 0x40000) == 0) {
			this.anIntArray254 = null;
			this.anIntArray252 = null;
			this.anIntArray251 = null;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	private void method3350() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt3792; local27++) {
			@Pc(34) int local34 = this.anIntArray255[local27];
			@Pc(39) int local39 = this.anIntArray250[local27];
			if (local34 > local13) {
				local13 = local34;
			}
			@Pc(49) int local49 = this.anIntArray247[local27];
			if (local39 < local9) {
				local9 = local39;
			}
			if (local7 > local34) {
				local7 = local34;
			}
			if (local15 < local39) {
				local15 = local39;
			}
			if (local17 < local49) {
				local17 = local49;
			}
			if (local49 < local11) {
				local11 = local49;
			}
			@Pc(86) int local86 = local49 * local49 + local34 * local34;
			if (local19 < local86) {
				local19 = local86;
			}
			local86 = local49 * local49 + local34 * local34 + local39 * local39;
			if (local86 > local21) {
				local21 = local86;
			}
		}
		this.anInt3762 = local9;
		this.anInt3789 = local11;
		this.anInt3730 = local15;
		this.anInt3734 = local7;
		this.anInt3747 = local17;
		this.anInt3741 = local13;
		this.anInt3740 = (int) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean314 = true;
	}

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class179.anIntArray756[arg0];
		@Pc(13) int local13 = Class179.anIntArray757[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3792; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray247[local15] + local13 * this.anIntArray255[local15] >> 14;
			this.anIntArray247[local15] = local13 * this.anIntArray247[local15] - this.anIntArray255[local15] * local9 >> 14;
			this.anIntArray255[local15] = local33;
		}
		this.method3360();
		this.aBoolean314 = false;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "()Z")
	@Override
	public boolean method7066() {
		if (this.aShortArray45 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray45.length; local12++) {
			if (this.aShortArray45[local12] != -1 && !this.aClass9_Sub3_8.anInterface2_11.method3583(this.aShortArray45[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort35;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public void method3352() {
		if (this.aClass307_4 != null) {
			this.aClass307_4.method7456();
		}
		if (this.aClass307_3 != null) {
			this.aClass307_3.method7456();
		}
		if (this.aClass307_2 != null) {
			this.aClass307_2.method7456();
		}
		if (this.aClass307_1 != null) {
			this.aClass307_1.method7456();
		}
		if (this.aClass274_1 != null) {
			this.aClass274_1.method6626();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3756; local7++) {
			local16 = this.aShortArray40[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 -= -(arg3 * (arg1 - local28) >> 7);
			}
			@Pc(47) int local47 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg2 != -1) {
				local47 -= -((arg2 - local47) * arg3 >> 7);
			}
			this.aShortArray40[local7] = (short) (local22 << 10 | local28 << 7 | local47);
		}
		if (this.aClass201Array1 != null) {
			for (local16 = 0; local16 < this.anInt3790; local16++) {
				@Pc(110) Class201 local110 = this.aClass201Array1[local16];
				@Pc(115) Class157 local115 = this.aClass157Array1[local16];
				local115.anInt4789 = Static223.anIntArray301[this.aShortArray40[local110.anInt5694] & 0xFFFF] & 0xFFFFFF | local115.anInt4789 & 0xFF000000;
			}
		}
		this.method3353();
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt3781;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
	private void method3353() {
		if (this.aClass307_2 != null) {
			this.aClass307_2.aBoolean673 = false;
		}
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3792; local7++) {
			if (arg0 != 128) {
				this.anIntArray255[local7] = arg0 * this.anIntArray255[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray250[local7] = arg1 * this.anIntArray250[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray247[local7] = arg2 * this.anIntArray247[local7] >> 7;
			}
		}
		this.method3360();
		this.aBoolean314 = false;
	}

	@OriginalMember(owner = "client!ge", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean314) {
			this.method3350();
		}
		return this.anInt3789;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IJIIFLclient!qda;FIIII)S")
	private short method3355(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) Class260 arg5, @OriginalArg(6) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray249[arg7];
		@Pc(17) int local17 = this.anIntArray249[arg7 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray46[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg1 == Static304.aLongArray7[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray46[local19] = (short) (this.anInt3774 + 1);
		Static304.aLongArray7[local19] = arg1;
		this.aShortArray47[this.anInt3774] = (short) arg2;
		this.aShortArray48[this.anInt3774] = (short) arg7;
		this.aShortArray38[this.anInt3774] = (short) arg9;
		this.aShortArray44[this.anInt3774] = (short) arg3;
		this.aShortArray43[this.anInt3774] = (short) arg0;
		this.aByteArray46[this.anInt3774] = (byte) arg8;
		this.aFloatArray31[this.anInt3774] = arg4;
		this.aFloatArray32[this.anInt3774] = arg6;
		return (short) this.anInt3774++;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
	private void method3357() {
		if ((this.anInt3749 & 0x37) != 0) {
			if (this.aClass307_1 == null) {
				return;
			}
			this.aClass307_1.aBoolean673 = false;
		} else if (this.aClass307_2 != null) {
			this.aClass307_2.aBoolean673 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3792; local7++) {
			this.anIntArray247[local7] = -this.anIntArray247[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt3774; local29++) {
			this.aShortArray43[local29] = (short) -this.aShortArray43[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt3756; local52++) {
			@Pc(59) short local59 = this.aShortArray49[local52];
			this.aShortArray49[local52] = this.aShortArray39[local52];
			this.aShortArray39[local52] = local59;
		}
		this.method3360();
		this.method3357();
		this.method3359();
		this.aBoolean314 = false;
	}

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray23 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt3776; local12++) {
			this.anIntArray255[local12] <<= 0x4;
			this.anIntArray250[local12] <<= 0x4;
			this.anIntArray247[local12] <<= 0x4;
		}
		Static472.anInt6156 = 0;
		Static170.anInt3902 = 0;
		Static110.anInt2518 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ge;ZIZLclient!ge;)Lclient!ba;")
	private Class23 method3358(@OriginalArg(0) int arg0, @OriginalArg(1) Class23_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class23_Sub1 arg4) {
		arg4.anInt3792 = this.anInt3792;
		arg4.anInt3776 = this.anInt3776;
		arg4.anInt3756 = this.anInt3756;
		arg4.anInt3793 = this.anInt3793;
		arg4.anInt3749 = this.anInt3749;
		arg4.anInt3774 = this.anInt3774;
		arg4.anInt3790 = this.anInt3790;
		arg4.anInt3781 = arg0;
		arg4.aShort35 = this.aShort35;
		arg4.aShort34 = this.aShort34;
		@Pc(52) boolean local52 = Static499.method7468(arg0, this.anInt3749);
		@Pc(58) boolean local58 = Static238.method4200(arg0, this.anInt3749);
		@Pc(64) boolean local64 = Static263.method4528(arg0, this.anInt3749);
		@Pc(70) boolean local70 = local58 | local52 | local64;
		@Pc(189) int local189;
		if (local70) {
			if (!local52) {
				arg4.anIntArray255 = this.anIntArray255;
			} else if (arg1.anIntArray255 == null || arg1.anIntArray255.length < this.anInt3776) {
				arg4.anIntArray255 = arg1.anIntArray255 = new int[this.anInt3776];
			} else {
				arg4.anIntArray255 = arg1.anIntArray255;
			}
			if (!local58) {
				arg4.anIntArray250 = this.anIntArray250;
			} else if (arg1.anIntArray250 == null || this.anInt3776 > arg1.anIntArray250.length) {
				arg4.anIntArray250 = arg1.anIntArray250 = new int[this.anInt3776];
			} else {
				arg4.anIntArray250 = arg1.anIntArray250;
			}
			if (!local64) {
				arg4.anIntArray247 = this.anIntArray247;
			} else if (arg1.anIntArray247 == null || arg1.anIntArray247.length < this.anInt3776) {
				arg4.anIntArray247 = arg1.anIntArray247 = new int[this.anInt3776];
			} else {
				arg4.anIntArray247 = arg1.anIntArray247;
			}
			for (local189 = 0; local189 < this.anInt3776; local189++) {
				if (local52) {
					arg4.anIntArray255[local189] = this.anIntArray255[local189];
				}
				if (local58) {
					arg4.anIntArray250[local189] = this.anIntArray250[local189];
				}
				if (local64) {
					arg4.anIntArray247[local189] = this.anIntArray247[local189];
				}
			}
		} else {
			arg4.anIntArray247 = this.anIntArray247;
			arg4.anIntArray250 = this.anIntArray250;
			arg4.anIntArray255 = this.anIntArray255;
		}
		if (Static188.method3617(arg0, this.anInt3749)) {
			arg4.aClass307_4 = arg1.aClass307_4;
			arg4.aClass307_4.anInterface20_12 = this.aClass307_4.anInterface20_12;
			arg4.aClass307_4.aBoolean672 = true;
			arg4.aClass307_4.aBoolean673 = this.aClass307_4.aBoolean673;
		} else if (Static235.method4124(this.anInt3749, arg0)) {
			arg4.aClass307_4 = this.aClass307_4;
		} else {
			arg4.aClass307_4 = null;
		}
		if (Static445.method6833(arg0, this.anInt3749)) {
			if (arg1.aShortArray40 == null || this.anInt3756 > arg1.aShortArray40.length) {
				arg4.aShortArray40 = arg1.aShortArray40 = new short[this.anInt3756];
			} else {
				arg4.aShortArray40 = arg1.aShortArray40;
			}
			for (local189 = 0; local189 < this.anInt3756; local189++) {
				arg4.aShortArray40[local189] = this.aShortArray40[local189];
			}
		} else {
			arg4.aShortArray40 = this.aShortArray40;
		}
		if (Static261.method4523(this.anInt3749, arg0)) {
			if (arg1.aByteArray47 == null || arg1.aByteArray47.length < this.anInt3756) {
				arg4.aByteArray47 = arg1.aByteArray47 = new byte[this.anInt3756];
			} else {
				arg4.aByteArray47 = arg1.aByteArray47;
			}
			for (local189 = 0; local189 < this.anInt3756; local189++) {
				arg4.aByteArray47[local189] = this.aByteArray47[local189];
			}
		} else {
			arg4.aByteArray47 = this.aByteArray47;
		}
		if (Static331.method8155(this.anInt3749, arg0)) {
			arg4.aClass307_2 = arg1.aClass307_2;
			arg4.aClass307_2.aBoolean673 = this.aClass307_2.aBoolean673;
			arg4.aClass307_2.anInterface20_12 = this.aClass307_2.anInterface20_12;
			arg4.aClass307_2.aBoolean672 = true;
		} else if (Static151.method2917(this.anInt3749, arg0)) {
			arg4.aClass307_2 = this.aClass307_2;
		} else {
			arg4.aClass307_2 = null;
		}
		@Pc(581) int local581;
		if (Static396.method6260(this.anInt3749, arg0)) {
			if (arg1.aShortArray38 == null || arg1.aShortArray38.length < this.anInt3774) {
				local189 = this.anInt3774;
				arg4.aShortArray43 = arg1.aShortArray43 = new short[local189];
				arg4.aShortArray38 = arg1.aShortArray38 = new short[local189];
				arg4.aShortArray44 = arg1.aShortArray44 = new short[local189];
			} else {
				arg4.aShortArray44 = arg1.aShortArray44;
				arg4.aShortArray38 = arg1.aShortArray38;
				arg4.aShortArray43 = arg1.aShortArray43;
			}
			if (this.aClass63_1 == null) {
				arg4.aClass63_1 = null;
				for (local189 = 0; local189 < this.anInt3774; local189++) {
					arg4.aShortArray38[local189] = this.aShortArray38[local189];
					arg4.aShortArray44[local189] = this.aShortArray44[local189];
					arg4.aShortArray43[local189] = this.aShortArray43[local189];
				}
			} else {
				if (arg1.aClass63_1 == null) {
					arg1.aClass63_1 = new Class63();
				}
				@Pc(569) Class63 local569 = arg4.aClass63_1 = arg1.aClass63_1;
				if (local569.aShortArray27 == null || this.anInt3774 > local569.aShortArray27.length) {
					local581 = this.anInt3774;
					local569.aShortArray29 = new short[local581];
					local569.aShortArray28 = new short[local581];
					local569.aByteArray39 = new byte[local581];
					local569.aShortArray27 = new short[local581];
				}
				for (local581 = 0; local581 < this.anInt3774; local581++) {
					arg4.aShortArray38[local581] = this.aShortArray38[local581];
					arg4.aShortArray44[local581] = this.aShortArray44[local581];
					arg4.aShortArray43[local581] = this.aShortArray43[local581];
					local569.aShortArray27[local581] = this.aClass63_1.aShortArray27[local581];
					local569.aShortArray28[local581] = this.aClass63_1.aShortArray28[local581];
					local569.aShortArray29[local581] = this.aClass63_1.aShortArray29[local581];
					local569.aByteArray39[local581] = this.aClass63_1.aByteArray39[local581];
				}
			}
			arg4.aByteArray46 = this.aByteArray46;
		} else {
			arg4.aShortArray38 = this.aShortArray38;
			arg4.aClass63_1 = this.aClass63_1;
			arg4.aShortArray43 = this.aShortArray43;
			arg4.aShortArray44 = this.aShortArray44;
			arg4.aByteArray46 = this.aByteArray46;
		}
		if (Static104.method6583(arg0, this.anInt3749)) {
			arg4.aClass307_1 = arg1.aClass307_1;
			arg4.aClass307_1.aBoolean672 = true;
			arg4.aClass307_1.anInterface20_12 = this.aClass307_1.anInterface20_12;
			arg4.aClass307_1.aBoolean673 = this.aClass307_1.aBoolean673;
		} else if (Static242.method4246(arg0, this.anInt3749)) {
			arg4.aClass307_1 = this.aClass307_1;
		} else {
			arg4.aClass307_1 = null;
		}
		if (Static110.method2276(this.anInt3749, arg0)) {
			if (arg1.aFloatArray31 == null || this.anInt3756 > arg1.aFloatArray31.length) {
				local189 = this.anInt3774;
				arg4.aFloatArray32 = arg1.aFloatArray32 = new float[local189];
				arg4.aFloatArray31 = arg1.aFloatArray31 = new float[local189];
			} else {
				arg4.aFloatArray31 = arg1.aFloatArray31;
				arg4.aFloatArray32 = arg1.aFloatArray32;
			}
			for (local189 = 0; local189 < this.anInt3774; local189++) {
				arg4.aFloatArray31[local189] = this.aFloatArray31[local189];
				arg4.aFloatArray32[local189] = this.aFloatArray32[local189];
			}
		} else {
			arg4.aFloatArray32 = this.aFloatArray32;
			arg4.aFloatArray31 = this.aFloatArray31;
		}
		if (Static44.method1138(this.anInt3749, arg0)) {
			arg4.aClass307_3 = arg1.aClass307_3;
			arg4.aClass307_3.aBoolean673 = this.aClass307_3.aBoolean673;
			arg4.aClass307_3.aBoolean672 = true;
			arg4.aClass307_3.anInterface20_12 = this.aClass307_3.anInterface20_12;
		} else if (Static204.method3803(arg0, this.anInt3749)) {
			arg4.aClass307_3 = this.aClass307_3;
		} else {
			arg4.aClass307_3 = null;
		}
		if (Static103.method2158(arg0, this.anInt3749)) {
			if (arg1.aShortArray49 == null || arg1.aShortArray49.length < this.anInt3756) {
				local189 = this.anInt3756;
				arg4.aShortArray49 = arg1.aShortArray49 = new short[local189];
				arg4.aShortArray37 = arg1.aShortArray37 = new short[local189];
				arg4.aShortArray39 = arg1.aShortArray39 = new short[local189];
			} else {
				arg4.aShortArray49 = arg1.aShortArray49;
				arg4.aShortArray37 = arg1.aShortArray37;
				arg4.aShortArray39 = arg1.aShortArray39;
			}
			for (local189 = 0; local189 < this.anInt3756; local189++) {
				arg4.aShortArray49[local189] = this.aShortArray49[local189];
				arg4.aShortArray37[local189] = this.aShortArray37[local189];
				arg4.aShortArray39[local189] = this.aShortArray39[local189];
			}
		} else {
			arg4.aShortArray39 = this.aShortArray39;
			arg4.aShortArray49 = this.aShortArray49;
			arg4.aShortArray37 = this.aShortArray37;
		}
		if (Static240.method4633(this.anInt3749, arg0)) {
			arg4.aClass274_1 = arg1.aClass274_1;
			arg4.aClass274_1.aBoolean584 = this.aClass274_1.aBoolean584;
			arg4.aClass274_1.anInterface21_7 = this.aClass274_1.anInterface21_7;
			arg4.aClass274_1.aBoolean585 = true;
		} else if (Static436.method6661(arg0, this.anInt3749)) {
			arg4.aClass274_1 = this.aClass274_1;
		} else {
			arg4.aClass274_1 = null;
		}
		if (Static272.method4573(arg0, this.anInt3749)) {
			if (arg1.aShortArray45 == null || arg1.aShortArray45.length < this.anInt3756) {
				local189 = this.anInt3756;
				arg4.aShortArray45 = arg1.aShortArray45 = new short[local189];
			} else {
				arg4.aShortArray45 = arg1.aShortArray45;
			}
			for (local189 = 0; local189 < this.anInt3756; local189++) {
				arg4.aShortArray45[local189] = this.aShortArray45[local189];
			}
		} else {
			arg4.aShortArray45 = this.aShortArray45;
		}
		if (!Static159.method3025(arg0, this.anInt3749)) {
			arg4.aClass157Array1 = this.aClass157Array1;
		} else if (arg1.aClass157Array1 == null || arg1.aClass157Array1.length < this.anInt3790) {
			local189 = this.anInt3790;
			arg4.aClass157Array1 = arg1.aClass157Array1 = new Class157[local189];
			for (local581 = 0; local581 < this.anInt3790; local581++) {
				arg4.aClass157Array1[local581] = this.aClass157Array1[local581].method4110();
			}
		} else {
			arg4.aClass157Array1 = arg1.aClass157Array1;
			for (local189 = 0; local189 < this.anInt3790; local189++) {
				arg4.aClass157Array1[local189].method4114(this.aClass157Array1[local189]);
			}
		}
		arg4.aShortArray41 = this.aShortArray41;
		arg4.aShortArray42 = this.aShortArray42;
		arg4.anIntArrayArray22 = this.anIntArrayArray22;
		arg4.aClass128Array1 = this.aClass128Array1;
		arg4.anIntArray252 = this.anIntArray252;
		arg4.aClass69Array1 = this.aClass69Array1;
		arg4.anIntArray249 = this.anIntArray249;
		arg4.anIntArrayArray21 = this.anIntArrayArray21;
		arg4.aClass201Array1 = this.aClass201Array1;
		if (this.aBoolean314) {
			arg4.anInt3741 = this.anInt3741;
			arg4.anInt3740 = this.anInt3740;
			arg4.anInt3789 = this.anInt3789;
			arg4.anInt3730 = this.anInt3730;
			arg4.aBoolean314 = true;
			arg4.anInt3734 = this.anInt3734;
			arg4.anInt3762 = this.anInt3762;
			arg4.anInt3747 = this.anInt3747;
		} else {
			arg4.aBoolean314 = false;
		}
		arg4.aShortArray48 = this.aShortArray48;
		arg4.anIntArray254 = this.anIntArray254;
		arg4.anIntArray251 = this.anIntArray251;
		arg4.anIntArrayArray23 = this.anIntArrayArray23;
		arg4.aShortArray47 = this.aShortArray47;
		arg4.aShortArray46 = this.aShortArray46;
		return arg4;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	private void method3359() {
		if (this.aClass274_1 != null) {
			this.aClass274_1.aBoolean584 = false;
		}
	}

	@OriginalMember(owner = "client!ge", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3756; local3++) {
			if (this.aShortArray40[local3] == arg0) {
				this.aShortArray40[local3] = arg1;
			}
		}
		if (this.aClass201Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt3790; local30++) {
				@Pc(37) Class201 local37 = this.aClass201Array1[local30];
				@Pc(42) Class157 local42 = this.aClass157Array1[local30];
				local42.anInt4789 = local42.anInt4789 & 0xFF000000 | Static223.anIntArray301[this.aShortArray40[local37.anInt5694] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3353();
	}

	@OriginalMember(owner = "client!ge", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean314) {
			this.method3350();
		}
		return this.anInt3740;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	private void method3360() {
		if (this.aClass307_4 != null) {
			this.aClass307_4.aBoolean673 = false;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class8_Sub3 local8 = (Class8_Sub3) arg2;
		@Pc(12) Class8_Sub3 local12 = this.aClass9_Sub3_8.aClass8_Sub3_16;
		@Pc(33) float local33 = local12.aFloat208 * local8.aFloat211 + local8.aFloat206 * local12.aFloat207 + local12.aFloat210 * local8.aFloat213 + local12.aFloat206;
		@Pc(54) float local54 = local12.aFloat213 + local8.aFloat213 * local12.aFloat205 + local12.aFloat209 * local8.aFloat206 + local8.aFloat211 * local12.aFloat212;
		Static224.aFloat104 = local8.aFloat216 * local12.aFloat208 + local12.aFloat207 * local8.aFloat208 + local8.aFloat212 * local12.aFloat210;
		Static518.aFloat191 = local12.aFloat212 * local8.aFloat216 + local12.aFloat209 * local8.aFloat208 + local12.aFloat205 * local8.aFloat212;
		Static288.aFloat120 = local8.aFloat210 * local12.aFloat209 + local8.aFloat205 * local12.aFloat205 + local8.aFloat215 * local12.aFloat212;
		Static439.aFloat179 = local12.aFloat212 * local8.aFloat214 + local12.aFloat209 * local8.aFloat207 + local8.aFloat209 * local12.aFloat205;
		@Pc(147) float local147 = local12.aFloat211 + local8.aFloat211 * local12.aFloat216 + local8.aFloat213 * local12.aFloat215 + local12.aFloat214 * local8.aFloat206;
		Static114.aFloat47 = local12.aFloat208 * local8.aFloat215 + local12.aFloat210 * local8.aFloat205 + local8.aFloat210 * local12.aFloat207;
		Static234.aFloat108 = local8.aFloat216 * local12.aFloat216 + local12.aFloat215 * local8.aFloat212 + local12.aFloat214 * local8.aFloat208;
		Static321.aFloat127 = local8.aFloat207 * local12.aFloat214 + local8.aFloat209 * local12.aFloat215 + local8.aFloat214 * local12.aFloat216;
		Static238.aFloat111 = local12.aFloat216 * local8.aFloat215 + local8.aFloat210 * local12.aFloat214 + local12.aFloat215 * local8.aFloat205;
		Static377.aFloat189 = local12.aFloat210 * local8.aFloat209 + local12.aFloat207 * local8.aFloat207 + local12.aFloat208 * local8.aFloat214;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass9_Sub3_8.anInt6549;
		@Pc(255) int local255 = this.aClass9_Sub3_8.anInt6527;
		if (!this.aBoolean314) {
			this.method3350();
		}
		Static570.anIntArray828[0] = this.anInt3734;
		Static118.anIntArray205[0] = this.anInt3762;
		Static459.anIntArray291[0] = this.anInt3789;
		Static570.anIntArray828[1] = this.anInt3741;
		Static118.anIntArray205[1] = this.anInt3762;
		Static459.anIntArray291[1] = this.anInt3789;
		Static570.anIntArray828[2] = this.anInt3734;
		Static118.anIntArray205[2] = this.anInt3730;
		Static570.anIntArray828[3] = this.anInt3741;
		Static459.anIntArray291[2] = this.anInt3789;
		Static118.anIntArray205[3] = this.anInt3730;
		Static570.anIntArray828[4] = this.anInt3734;
		Static459.anIntArray291[3] = this.anInt3789;
		Static118.anIntArray205[4] = this.anInt3762;
		Static570.anIntArray828[5] = this.anInt3741;
		Static459.anIntArray291[4] = this.anInt3747;
		Static118.anIntArray205[5] = this.anInt3762;
		Static459.anIntArray291[5] = this.anInt3747;
		Static570.anIntArray828[6] = this.anInt3734;
		Static118.anIntArray205[6] = this.anInt3730;
		Static570.anIntArray828[7] = this.anInt3741;
		Static459.anIntArray291[6] = this.anInt3747;
		Static118.anIntArray205[7] = this.anInt3730;
		Static459.anIntArray291[7] = this.anInt3747;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(442) float local442;
		@Pc(395) float local395;
		@Pc(400) float local400;
		@Pc(390) float local390;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static459.anIntArray291[local383];
			local395 = Static570.anIntArray828[local383];
			local400 = Static118.anIntArray205[local383];
			local414 = local400 * Static288.aFloat120 + Static439.aFloat179 * local395 + local390 * Static518.aFloat191 + local54;
			local428 = Static224.aFloat104 * local390 + local400 * Static114.aFloat47 + local395 * Static377.aFloat189 + local33;
			local442 = local147 + local395 * Static321.aFloat127 + Static238.aFloat111 * local400 + local390 * Static234.aFloat108;
			if (local442 >= (float) this.aClass9_Sub3_8.anInt6540) {
				@Pc(461) float local461 = (float) this.aClass9_Sub3_8.anInt6535 + local428 * (float) local251 / local442;
				@Pc(473) float local473 = (float) this.aClass9_Sub3_8.anInt6544 + (float) local255 * local414 / local442;
				if (local241 > local461) {
					local241 = local461;
				}
				if (local243 < local461) {
					local243 = local461;
				}
				if (local245 > local473) {
					local245 = local473;
				}
				local239 = true;
				if (local247 < local473) {
					local247 = local473;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && local245 < (float) arg1 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.anInt3774 > Static211.anIntArray842.length) {
				Static264.anIntArray459 = new int[this.anInt3774];
				Static211.anIntArray842 = new int[this.anInt3774];
			}
			@Pc(624) int local624;
			for (@Pc(550) int local550 = 0; local550 < this.anInt3792; local550++) {
				local395 = this.anIntArray255[local550];
				local400 = this.anIntArray250[local550];
				local390 = this.anIntArray247[local550];
				local442 = local147 + Static238.aFloat111 * local400 + Static321.aFloat127 * local395 + Static234.aFloat108 * local390;
				local428 = local33 + local390 * Static224.aFloat104 + local395 * Static377.aFloat189 + Static114.aFloat47 * local400;
				local414 = Static518.aFloat191 * local390 + Static439.aFloat179 * local395 + Static288.aFloat120 * local400 + local54;
				@Pc(631) int local631;
				@Pc(633) int local633;
				@Pc(642) int local642;
				if ((float) this.aClass9_Sub3_8.anInt6540 <= local442) {
					local624 = (int) ((float) this.aClass9_Sub3_8.anInt6535 + local428 * (float) local251 / local442);
					local631 = (int) ((float) local255 * local414 / local442 + (float) this.aClass9_Sub3_8.anInt6544);
					local633 = this.anIntArray249[local550];
					local642 = this.anIntArray249[local550 + 1];
					for (@Pc(701) int local701 = local633; local701 < local642; local701++) {
						@Pc(710) int local710 = this.aShortArray46[local701] - 1;
						if (local710 == -1) {
							break;
						}
						Static211.anIntArray842[local710] = local624;
						Static264.anIntArray459[local710] = local631;
					}
				} else {
					local624 = this.anIntArray249[local550];
					local631 = this.anIntArray249[local550 + 1];
					for (local633 = local624; local633 < local631; local633++) {
						local642 = this.aShortArray46[local633] - 1;
						if (local642 == -1) {
							break;
						}
						Static211.anIntArray842[this.aShortArray46[local633] - 1] = -999999;
					}
				}
			}
			for (local624 = 0; local624 < this.anInt3756; local624++) {
				if (Static211.anIntArray842[this.aShortArray49[local624]] != -999999 && Static211.anIntArray842[this.aShortArray37[local624]] != -999999 && Static211.anIntArray842[this.aShortArray39[local624]] != -999999 && this.method3345(Static211.anIntArray842[this.aShortArray49[local624]], Static211.anIntArray842[this.aShortArray39[local624]], Static264.anIntArray459[this.aShortArray49[local624]], Static211.anIntArray842[this.aShortArray37[local624]], Static264.anIntArray459[this.aShortArray39[local624]], arg1, arg0, Static264.anIntArray459[this.aShortArray37[local624]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3776; local7++) {
			this.anIntArray255[local7] = this.anIntArray255[local7] + 7 >> 4;
			this.anIntArray250[local7] = this.anIntArray250[local7] + 7 >> 4;
			this.anIntArray247[local7] = this.anIntArray247[local7] + 7 >> 4;
		}
		this.method3360();
		this.aBoolean314 = false;
	}

	@OriginalMember(owner = "client!ge", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static170.anInt3902 = 0;
			Static472.anInt6156 = 0;
			local16 = 0;
			Static110.anInt2518 = 0;
			for (local20 = 0; local20 < this.anInt3792; local20++) {
				Static170.anInt3902 += this.anIntArray255[local20];
				Static472.anInt6156 += this.anIntArray250[local20];
				local16++;
				Static110.anInt2518 += this.anIntArray247[local20];
			}
			if (local16 > 0) {
				Static170.anInt3902 = arg1 + Static170.anInt3902 / local16;
				Static110.anInt2518 = Static110.anInt2518 / local16 + arg3;
				Static472.anInt6156 = Static472.anInt6156 / local16 + arg2;
			} else {
				Static472.anInt6156 = arg2;
				Static170.anInt3902 = arg1;
				Static110.anInt2518 = arg3;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt3792; local16++) {
				this.anIntArray255[local16] += arg1;
				this.anIntArray250[local16] += arg2;
				this.anIntArray247[local16] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(186) int local186;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt3792; local16++) {
					this.anIntArray255[local16] -= Static170.anInt3902;
					this.anIntArray250[local16] -= Static472.anInt6156;
					this.anIntArray247[local16] -= Static110.anInt2518;
					if (arg3 != 0) {
						local20 = Class179.anIntArray756[arg3];
						local167 = Class179.anIntArray757[arg3];
						local186 = local20 * this.anIntArray250[local16] + local167 * this.anIntArray255[local16] + 16383 >> 14;
						this.anIntArray250[local16] = this.anIntArray250[local16] * local167 + 16383 - local20 * this.anIntArray255[local16] >> 14;
						this.anIntArray255[local16] = local186;
					}
					if (arg1 != 0) {
						local20 = Class179.anIntArray756[arg1];
						local167 = Class179.anIntArray757[arg1];
						local186 = this.anIntArray250[local16] * local167 + 16383 - this.anIntArray247[local16] * local20 >> 14;
						this.anIntArray247[local16] = this.anIntArray247[local16] * local167 + local20 * this.anIntArray250[local16] + 16383 >> 14;
						this.anIntArray250[local16] = local186;
					}
					if (arg2 != 0) {
						local20 = Class179.anIntArray756[arg2];
						local167 = Class179.anIntArray757[arg2];
						local186 = local20 * this.anIntArray247[local16] + this.anIntArray255[local16] * local167 + 16383 >> 14;
						this.anIntArray247[local16] = local167 * this.anIntArray247[local16] + 16383 - local20 * this.anIntArray255[local16] >> 14;
						this.anIntArray255[local16] = local186;
					}
					this.anIntArray255[local16] += Static170.anInt3902;
					this.anIntArray250[local16] += Static472.anInt6156;
					this.anIntArray247[local16] += Static110.anInt2518;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt3792; local16++) {
					this.anIntArray255[local16] -= Static170.anInt3902;
					this.anIntArray250[local16] -= Static472.anInt6156;
					this.anIntArray247[local16] -= Static110.anInt2518;
					this.anIntArray255[local16] = arg1 * this.anIntArray255[local16] / 128;
					this.anIntArray250[local16] = arg2 * this.anIntArray250[local16] / 128;
					this.anIntArray247[local16] = this.anIntArray247[local16] * arg3 / 128;
					this.anIntArray255[local16] += Static170.anInt3902;
					this.anIntArray250[local16] += Static472.anInt6156;
					this.anIntArray247[local16] += Static110.anInt2518;
				}
			} else {
				@Pc(512) Class201 local512;
				@Pc(517) Class157 local517;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt3756; local16++) {
						local20 = (this.aByteArray47[local16] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray47[local16] = (byte) local20;
					}
					if (this.aClass201Array1 != null) {
						for (local20 = 0; local20 < this.anInt3790; local20++) {
							local512 = this.aClass201Array1[local20];
							local517 = this.aClass157Array1[local20];
							local517.anInt4789 = 255 - (this.aByteArray47[local512.anInt5694] & 0xFF) << 24 | local517.anInt4789 & 0xFFFFFF;
						}
					}
					this.method3353();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt3756; local16++) {
						local20 = this.aShortArray40[local16] & 0xFFFF;
						local167 = local20 >> 10 & 0x3F;
						local186 = local20 >> 7 & 0x7;
						@Pc(581) int local581 = arg1 + local167 & 0x3F;
						@Pc(585) int local585 = local20 & 0x7F;
						local186 += arg2 / 4;
						local585 += arg3;
						if (local186 < 0) {
							local186 = 0;
						} else if (local186 > 7) {
							local186 = 7;
						}
						if (local585 < 0) {
							local585 = 0;
						} else if (local585 > 127) {
							local585 = 127;
						}
						this.aShortArray40[local16] = (short) (local585 | local581 << 10 | local186 << 7);
					}
					if (this.aClass201Array1 != null) {
						for (local20 = 0; local20 < this.anInt3790; local20++) {
							local512 = this.aClass201Array1[local20];
							local517 = this.aClass157Array1[local20];
							local517.anInt4789 = local517.anInt4789 & 0xFF000000 | Static223.anIntArray301[this.aShortArray40[local512.anInt5694] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method3353();
				} else {
					@Pc(710) Class157 local710;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt3790; local16++) {
							local710 = this.aClass157Array1[local16];
							local710.anInt4793 += arg2;
							local710.anInt4788 += arg1;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt3790; local16++) {
							local710 = this.aClass157Array1[local16];
							local710.anInt4794 = arg1 * local710.anInt4794 >> 7;
							local710.anInt4790 = local710.anInt4790 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt3790; local16++) {
							local710 = this.aClass157Array1[local16];
							local710.anInt4792 = local710.anInt4792 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.aShort34 = (short) arg0;
		this.method3353();
	}

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3792; local3++) {
			if (arg0 != 0) {
				this.anIntArray255[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray250[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray247[local3] += arg2;
			}
		}
		this.method3360();
		this.aBoolean314 = false;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "()V")
	@Override
	public void method7069() {
		if (this.anInt3774 > 0 && this.anInt3793 > 0) {
			this.method3348();
			this.method3364();
			this.method3349();
		}
	}

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class179.anIntArray756[arg0];
		@Pc(13) int local13 = Class179.anIntArray757[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3792; local15++) {
			local33 = this.anIntArray255[local15] * local13 + this.anIntArray247[local15] * local9 >> 14;
			this.anIntArray247[local15] = this.anIntArray247[local15] * local13 - this.anIntArray255[local15] * local9 >> 14;
			this.anIntArray255[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt3774; local33++) {
			@Pc(87) int local87 = this.aShortArray43[local33] * local9 + this.aShortArray38[local33] * local13 >> 14;
			this.aShortArray43[local33] = (short) (this.aShortArray43[local33] * local13 - this.aShortArray38[local33] * local9 >> 14);
			this.aShortArray38[local33] = (short) local87;
		}
		this.method3360();
		this.method3357();
		this.aBoolean314 = false;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)V")
	private void method3361() {
		if (this.anInt3793 == 0) {
			return;
		}
		if (this.method3348() && this.method3364()) {
			this.aClass9_Sub3_8.method5513(0, this.aClass307_4.anInterface20_12);
			this.aClass9_Sub3_8.method5513(1, this.aClass307_2.anInterface20_12);
			this.aClass9_Sub3_8.method5513(2, this.aClass307_3.anInterface20_12);
			@Pc(53) boolean local53;
			if ((this.anInt3749 & 0x37) == 0) {
				this.aClass9_Sub3_8.method5502(false);
				local53 = false;
				this.aClass9_Sub3_8.method5535(this.aClass9_Sub3_8.aClass88_17);
			} else {
				this.aClass9_Sub3_8.method5502(true);
				local53 = true;
				this.aClass9_Sub3_8.method5513(3, this.aClass307_1.anInterface20_12);
				this.aClass9_Sub3_8.method5535(this.aClass9_Sub3_8.aClass88_16);
			}
			for (@Pc(88) int local88 = 0; local88 < this.anIntArray254.length; local88++) {
				@Pc(95) int local95 = this.anIntArray251[local88];
				@Pc(102) int local102 = this.anIntArray251[local88 + 1];
				@Pc(109) int local109 = this.aShortArray45[local95] & 0xFFFF;
				if (local109 == 65535) {
					local109 = -1;
				}
				this.aClass9_Sub3_8.method5559(local109, local53, true);
				this.aClass9_Sub3_8.method5539(local95 * 3, this.anIntArray254[local88], Static492.aClass328_6, this.aClass274_1.anInterface21_7, local102 - local95, this.anIntArray252[local88]);
			}
		}
		this.method3349();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class23 method7068(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class23_Sub1 local14;
		@Pc(18) Class23_Sub1 local18;
		if (arg0 == 1) {
			local14 = this.aClass9_Sub3_8.aClass23_Sub1_23;
			local18 = this.aClass9_Sub3_8.aClass23_Sub1_28;
		} else if (arg0 == 2) {
			local18 = this.aClass9_Sub3_8.aClass23_Sub1_25;
			local14 = this.aClass9_Sub3_8.aClass23_Sub1_29;
		} else if (arg0 == 3) {
			local14 = this.aClass9_Sub3_8.aClass23_Sub1_27;
			local18 = this.aClass9_Sub3_8.aClass23_Sub1_30;
		} else if (arg0 == 4) {
			local18 = this.aClass9_Sub3_8.aClass23_Sub1_24;
			local14 = this.aClass9_Sub3_8.aClass23_Sub1_26;
		} else if (arg0 == 5) {
			local18 = this.aClass9_Sub3_8.aClass23_Sub1_22;
			local14 = this.aClass9_Sub3_8.aClass23_Sub1_21;
		} else {
			local14 = local18 = new Class23_Sub1(this.aClass9_Sub3_8, 0, 0, true, false);
		}
		return this.method3358(arg1, local18, arg0 != 0, arg2, local14);
	}

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			local27 = 0;
			Static170.anInt3902 = 0;
			Static472.anInt6156 = 0;
			Static110.anInt2518 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray23.length) {
					local51 = this.anIntArrayArray23[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static170.anInt3902 += this.anIntArray255[local59];
						Static472.anInt6156 += this.anIntArray250[local59];
						Static110.anInt2518 += this.anIntArray247[local59];
						local27++;
					}
				}
			}
			if (local27 > 0) {
				Static110.anInt2518 = local21 + Static110.anInt2518 / local27;
				Static472.anInt6156 = Static472.anInt6156 / local27 + local17;
				Static170.anInt3902 = Static170.anInt3902 / local27 + local25;
			} else {
				Static170.anInt3902 = local25;
				Static472.anInt6156 = local17;
				Static110.anInt2518 = local21;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray23.length) {
					local162 = this.anIntArrayArray23[local35];
					for (local164 = 0; local164 < local162.length; local164++) {
						local53 = local162[local164];
						this.anIntArray255[local53] += local25;
						this.anIntArray250[local53] += local17;
						this.anIntArray247[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(284) int local284;
		@Pc(303) int local303;
		@Pc(755) int local755;
		@Pc(764) int local764;
		if (arg0 == 2) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray23.length > local35) {
					local162 = this.anIntArrayArray23[local35];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local53 = local162[local164];
							this.anIntArray255[local53] -= Static170.anInt3902;
							this.anIntArray250[local53] -= Static472.anInt6156;
							this.anIntArray247[local53] -= Static110.anInt2518;
							if (arg4 != 0) {
								local59 = Class179.anIntArray756[arg4];
								local284 = Class179.anIntArray757[arg4];
								local303 = this.anIntArray255[local53] * local284 + local59 * this.anIntArray250[local53] + 16383 >> 14;
								this.anIntArray250[local53] = this.anIntArray250[local53] * local284 + 16383 - this.anIntArray255[local53] * local59 >> 14;
								this.anIntArray255[local53] = local303;
							}
							if (arg2 != 0) {
								local59 = Class179.anIntArray756[arg2];
								local284 = Class179.anIntArray757[arg2];
								local303 = this.anIntArray250[local53] * local284 + 16383 - local59 * this.anIntArray247[local53] >> 14;
								this.anIntArray247[local53] = this.anIntArray247[local53] * local284 + this.anIntArray250[local53] * local59 + 16383 >> 14;
								this.anIntArray250[local53] = local303;
							}
							if (arg3 != 0) {
								local59 = Class179.anIntArray756[arg3];
								local284 = Class179.anIntArray757[arg3];
								local303 = local59 * this.anIntArray247[local53] + this.anIntArray255[local53] * local284 + 16383 >> 14;
								this.anIntArray247[local53] = this.anIntArray247[local53] * local284 + 16383 - this.anIntArray255[local53] * local59 >> 14;
								this.anIntArray255[local53] = local303;
							}
							this.anIntArray255[local53] += Static170.anInt3902;
							this.anIntArray250[local53] += Static472.anInt6156;
							this.anIntArray247[local53] += Static110.anInt2518;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local53 = local162[local164];
							this.anIntArray255[local53] -= Static170.anInt3902;
							this.anIntArray250[local53] -= Static472.anInt6156;
							this.anIntArray247[local53] -= Static110.anInt2518;
							if (arg2 != 0) {
								local59 = Class179.anIntArray756[arg2];
								local284 = Class179.anIntArray757[arg2];
								local303 = this.anIntArray250[local53] * local284 + 16383 - local59 * this.anIntArray247[local53] >> 14;
								this.anIntArray247[local53] = this.anIntArray247[local53] * local284 + this.anIntArray250[local53] * local59 + 16383 >> 14;
								this.anIntArray250[local53] = local303;
							}
							if (arg4 != 0) {
								local59 = Class179.anIntArray756[arg4];
								local284 = Class179.anIntArray757[arg4];
								local303 = this.anIntArray250[local53] * local59 + local284 * this.anIntArray255[local53] + 16383 >> 14;
								this.anIntArray250[local53] = this.anIntArray250[local53] * local284 + 16383 - this.anIntArray255[local53] * local59 >> 14;
								this.anIntArray255[local53] = local303;
							}
							if (arg3 != 0) {
								local59 = Class179.anIntArray756[arg3];
								local284 = Class179.anIntArray757[arg3];
								local303 = this.anIntArray255[local53] * local284 + local59 * this.anIntArray247[local53] + 16383 >> 14;
								this.anIntArray247[local53] = local284 * this.anIntArray247[local53] + 16383 - local59 * this.anIntArray255[local53] >> 14;
								this.anIntArray255[local53] = local303;
							}
							this.anIntArray255[local53] += Static170.anInt3902;
							this.anIntArray250[local53] += Static472.anInt6156;
							this.anIntArray247[local53] += Static110.anInt2518;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray23.length) {
						local51 = this.anIntArrayArray23[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local284 = this.anIntArray249[local59];
							local303 = this.anIntArray249[local59 + 1];
							for (local755 = local284; local755 < local303; local755++) {
								local764 = this.aShortArray46[local755] - 1;
								if (local764 == -1) {
									break;
								}
								@Pc(776) int local776;
								@Pc(780) int local780;
								@Pc(798) int local798;
								if (arg4 != 0) {
									local776 = Class179.anIntArray756[arg4];
									local780 = Class179.anIntArray757[arg4];
									local798 = this.aShortArray44[local764] * local776 + local780 * this.aShortArray38[local764] + 16383 >> 14;
									this.aShortArray44[local764] = (short) (this.aShortArray44[local764] * local780 + 16383 - this.aShortArray38[local764] * local776 >> 14);
									this.aShortArray38[local764] = (short) local798;
								}
								if (arg2 != 0) {
									local776 = Class179.anIntArray756[arg2];
									local780 = Class179.anIntArray757[arg2];
									local798 = local780 * this.aShortArray44[local764] + 16383 - local776 * this.aShortArray43[local764] >> 14;
									this.aShortArray43[local764] = (short) (local776 * this.aShortArray44[local764] + local780 * this.aShortArray43[local764] + 16383 >> 14);
									this.aShortArray44[local764] = (short) local798;
								}
								if (arg3 != 0) {
									local776 = Class179.anIntArray756[arg3];
									local780 = Class179.anIntArray757[arg3];
									local798 = local780 * this.aShortArray38[local764] + local776 * this.aShortArray43[local764] + 16383 >> 14;
									this.aShortArray43[local764] = (short) (local780 * this.aShortArray43[local764] + 16383 - this.aShortArray38[local764] * local776 >> 14);
									this.aShortArray38[local764] = (short) local798;
								}
							}
						}
					}
				}
				this.method3357();
			}
		} else if (arg0 == 3) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray23.length > local35) {
					local162 = this.anIntArrayArray23[local35];
					for (local164 = 0; local164 < local162.length; local164++) {
						local53 = local162[local164];
						this.anIntArray255[local53] -= Static170.anInt3902;
						this.anIntArray250[local53] -= Static472.anInt6156;
						this.anIntArray247[local53] -= Static110.anInt2518;
						this.anIntArray255[local53] = this.anIntArray255[local53] * arg2 >> 7;
						this.anIntArray250[local53] = arg3 * this.anIntArray250[local53] >> 7;
						this.anIntArray247[local53] = this.anIntArray247[local53] * arg4 >> 7;
						this.anIntArray255[local53] += Static170.anInt3902;
						this.anIntArray250[local53] += Static472.anInt6156;
						this.anIntArray247[local53] += Static110.anInt2518;
					}
				}
			}
		} else {
			@Pc(1215) Class157 local1215;
			@Pc(1111) boolean local1111;
			@Pc(1210) Class201 local1210;
			if (arg0 == 5) {
				if (this.anIntArrayArray21 != null) {
					local1111 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray21.length > local41) {
							local51 = this.anIntArrayArray21[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local284 = (this.aByteArray47[local59] & 0xFF) + (arg2 * 8);
								if (local284 < 0) {
									local284 = 0;
								} else if (local284 > 255) {
									local284 = 255;
								}
								this.aByteArray47[local59] = (byte) local284;
							}
							local1111 |= local51.length > 0;
						}
					}
					if (local1111) {
						if (this.aClass201Array1 != null) {
							for (local41 = 0; local41 < this.anInt3790; local41++) {
								local1210 = this.aClass201Array1[local41];
								local1215 = this.aClass157Array1[local41];
								local1215.anInt4789 = local1215.anInt4789 & 0xFFFFFF | 255 - (this.aByteArray47[local1210.anInt5694] & 0xFF) << 24;
							}
						}
						this.method3353();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray21 != null) {
					local1111 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray21.length) {
							local51 = this.anIntArrayArray21[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local284 = this.aShortArray40[local59] & 0xFFFF;
								local303 = local284 >> 10 & 0x3F;
								local755 = local284 >> 7 & 0x7;
								local764 = local284 & 0x7F;
								local755 += arg3 / 4;
								@Pc(1323) int local1323 = local303 + arg2 & 0x3F;
								local764 += arg4;
								if (local755 < 0) {
									local755 = 0;
								} else if (local755 > 7) {
									local755 = 7;
								}
								if (local764 < 0) {
									local764 = 0;
								} else if (local764 > 127) {
									local764 = 127;
								}
								this.aShortArray40[local59] = (short) (local764 | local755 << 7 | local1323 << 10);
							}
							local1111 |= local51.length > 0;
						}
					}
					if (local1111) {
						if (this.aClass201Array1 != null) {
							for (local41 = 0; local41 < this.anInt3790; local41++) {
								local1210 = this.aClass201Array1[local41];
								local1215 = this.aClass157Array1[local41];
								local1215.anInt4789 = local1215.anInt4789 & 0xFF000000 | Static223.anIntArray301[this.aShortArray40[local1210.anInt5694] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method3353();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray22 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray22.length) {
							local162 = this.anIntArrayArray22[local35];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1215 = this.aClass157Array1[local162[local164]];
								local1215.anInt4793 += arg3;
								local1215.anInt4788 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray22 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray22.length) {
							local162 = this.anIntArrayArray22[local35];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1215 = this.aClass157Array1[local162[local164]];
								local1215.anInt4790 = local1215.anInt4790 * arg3 >> 7;
								local1215.anInt4794 = arg2 * local1215.anInt4794 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray22 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray22.length) {
						local162 = this.anIntArrayArray22[local35];
						for (local164 = 0; local164 < local162.length; local164++) {
							local1215 = this.aClass157Array1[local162[local164]];
							local1215.anInt4792 = local1215.anInt4792 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		if (this.aClass307_4 != null) {
			this.aClass307_4.aBoolean672 = Static188.method3617(arg0, this.anInt3749);
		}
		if (this.aClass307_3 != null) {
			this.aClass307_3.aBoolean672 = Static44.method1138(this.anInt3749, arg0);
		}
		if (this.aClass307_2 != null) {
			this.aClass307_2.aBoolean672 = Static331.method8155(this.anInt3749, arg0);
		}
		if (this.aClass307_1 != null) {
			this.aClass307_1.aBoolean672 = Static104.method6583(arg0, this.anInt3749);
		}
		this.anInt3781 = arg0;
		this.aBoolean315 = true;
		if (this.aClass63_1 != null && (this.anInt3781 & 0x10000) == 0) {
			this.aShortArray38 = this.aClass63_1.aShortArray27;
			this.aByteArray46 = this.aClass63_1.aByteArray39;
			this.aShortArray44 = this.aClass63_1.aShortArray28;
			this.aShortArray43 = this.aClass63_1.aShortArray29;
			this.aClass63_1 = null;
		}
		this.method3349();
	}

	@OriginalMember(owner = "client!ge", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean314) {
			this.method3350();
		}
		return this.anInt3762;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ur;Z)V")
	private void method3362(@OriginalArg(0) Class6_Sub4_Sub2_Sub2 arg0) {
		if (this.anInt3774 > Static211.anIntArray842.length) {
			Static211.anIntArray842 = new int[this.anInt3774];
			Static264.anIntArray459 = new int[this.anInt3774];
		}
		@Pc(53) int local53;
		@Pc(91) int local91;
		@Pc(100) int local100;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3792; local20++) {
			local53 = (this.anIntArray255[local20] - (this.aClass9_Sub3_8.anInt6564 * this.anIntArray250[local20] >> 8) >> this.aClass9_Sub3_8.anInt6529) - arg0.anInt9115;
			@Pc(77) int local77 = (this.anIntArray247[local20] - (this.anIntArray250[local20] * this.aClass9_Sub3_8.anInt6558 >> 8) >> this.aClass9_Sub3_8.anInt6529) - arg0.anInt9110;
			@Pc(82) int local82 = this.anIntArray249[local20];
			@Pc(89) int local89 = this.anIntArray249[local20 + 1];
			for (local91 = local82; local91 < local89; local91++) {
				local100 = this.aShortArray46[local91] - 1;
				if (local100 == -1) {
					break;
				}
				Static211.anIntArray842[local100] = local53;
				Static264.anIntArray459[local100] = local77;
			}
		}
		for (local53 = 0; local53 < this.anInt3793; local53++) {
			if (this.aByteArray47 == null || this.aByteArray47[local53] <= 128) {
				@Pc(142) short local142 = this.aShortArray49[local53];
				@Pc(147) short local147 = this.aShortArray37[local53];
				@Pc(152) short local152 = this.aShortArray39[local53];
				local91 = Static211.anIntArray842[local142];
				local100 = Static211.anIntArray842[local147];
				@Pc(164) int local164 = Static211.anIntArray842[local152];
				@Pc(168) int local168 = Static264.anIntArray459[local142];
				@Pc(172) int local172 = Static264.anIntArray459[local147];
				@Pc(176) int local176 = Static264.anIntArray459[local152];
				if ((local91 - local100) * (local172 - local176) - (local172 - local168) * (local164 - local100) > 0) {
					arg0.method7647(local164, local91, local176, local100, local172, local168);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!q;Lclient!mr;I)V")
	@Override
	public void method7077(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class5_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3774 == 0) {
			return;
		}
		@Pc(13) Class8_Sub3 local13 = this.aClass9_Sub3_8.aClass8_Sub3_16;
		@Pc(16) Class8_Sub3 local16 = (Class8_Sub3) arg0;
		if (!this.aBoolean314) {
			this.method3350();
		}
		Static238.aFloat111 = local16.aFloat215 * local13.aFloat216 + local13.aFloat215 * local16.aFloat205 + local13.aFloat214 * local16.aFloat210;
		Static435.aFloat178 = local13.aFloat211 + local16.aFloat211 * local13.aFloat216 + local16.aFloat213 * local13.aFloat215 + local16.aFloat206 * local13.aFloat214;
		@Pc(69) float local69 = (float) this.anInt3762 * Static238.aFloat111 + Static435.aFloat178;
		@Pc(77) float local77 = (float) this.anInt3730 * Static238.aFloat111 + Static435.aFloat178;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = local69 + (float) this.anInt3740;
			local94 = (float) -this.anInt3740 + local77;
		} else {
			local87 = local77 + (float) this.anInt3740;
			local94 = (float) -this.anInt3740 + local69;
		}
		if (local94 >= this.aClass9_Sub3_8.aFloat147 || local87 <= (float) this.aClass9_Sub3_8.anInt6540) {
			return;
		}
		Static114.aFloat47 = local16.aFloat210 * local13.aFloat207 + local13.aFloat210 * local16.aFloat205 + local16.aFloat215 * local13.aFloat208;
		Static529.aFloat192 = local13.aFloat206 + local13.aFloat210 * local16.aFloat213 + local13.aFloat207 * local16.aFloat206 + local16.aFloat211 * local13.aFloat208;
		@Pc(171) float local171 = Static529.aFloat192 + (float) this.anInt3762 * Static114.aFloat47;
		@Pc(179) float local179 = Static114.aFloat47 * (float) this.anInt3730 + Static529.aFloat192;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local179 < local171) {
			local206 = (float) this.aClass9_Sub3_8.anInt6549 * ((float) this.anInt3740 + local171);
			local195 = (local179 - (float) this.anInt3740) * (float) this.aClass9_Sub3_8.anInt6549;
		} else {
			local195 = (float) this.aClass9_Sub3_8.anInt6549 * ((float) -this.anInt3740 + local171);
			local206 = (local179 + (float) this.anInt3740) * (float) this.aClass9_Sub3_8.anInt6549;
		}
		if (this.aClass9_Sub3_8.aFloat132 <= local195 / local87 || local206 / local87 <= this.aClass9_Sub3_8.aFloat133) {
			return;
		}
		Static77.aFloat45 = local13.aFloat213 + local13.aFloat212 * local16.aFloat211 + local16.aFloat206 * local13.aFloat209 + local13.aFloat205 * local16.aFloat213;
		Static288.aFloat120 = local13.aFloat212 * local16.aFloat215 + local16.aFloat210 * local13.aFloat209 + local13.aFloat205 * local16.aFloat205;
		@Pc(295) float local295 = Static77.aFloat45 + Static288.aFloat120 * (float) this.anInt3762;
		@Pc(303) float local303 = Static288.aFloat120 * (float) this.anInt3730 + Static77.aFloat45;
		@Pc(329) float local329;
		@Pc(318) float local318;
		if (local303 < local295) {
			local318 = (float) this.aClass9_Sub3_8.anInt6527 * (local295 + (float) this.anInt3740);
			local329 = (float) this.aClass9_Sub3_8.anInt6527 * (local303 - (float) this.anInt3740);
		} else {
			local318 = (local303 + (float) this.anInt3740) * (float) this.aClass9_Sub3_8.anInt6527;
			local329 = (local295 - (float) this.anInt3740) * (float) this.aClass9_Sub3_8.anInt6527;
		}
		if (this.aClass9_Sub3_8.aFloat136 <= local329 / local87 || this.aClass9_Sub3_8.aFloat134 >= local318 / local87) {
			return;
		}
		if (arg1 != null || this.aClass201Array1 != null) {
			Static377.aFloat189 = local16.aFloat207 * local13.aFloat207 + local13.aFloat210 * local16.aFloat209 + local13.aFloat208 * local16.aFloat214;
			Static518.aFloat191 = local16.aFloat208 * local13.aFloat209 + local16.aFloat212 * local13.aFloat205 + local16.aFloat216 * local13.aFloat212;
			Static439.aFloat179 = local16.aFloat207 * local13.aFloat209 + local16.aFloat209 * local13.aFloat205 + local16.aFloat214 * local13.aFloat212;
			Static321.aFloat127 = local13.aFloat214 * local16.aFloat207 + local16.aFloat209 * local13.aFloat215 + local16.aFloat214 * local13.aFloat216;
			Static224.aFloat104 = local13.aFloat208 * local16.aFloat216 + local16.aFloat208 * local13.aFloat207 + local16.aFloat212 * local13.aFloat210;
			Static234.aFloat108 = local16.aFloat216 * local13.aFloat216 + local16.aFloat208 * local13.aFloat214 + local13.aFloat215 * local16.aFloat212;
		}
		if (arg1 != null) {
			@Pc(488) boolean local488 = false;
			@Pc(490) boolean local490 = true;
			@Pc(498) int local498 = this.anInt3741 + this.anInt3734 >> 1;
			@Pc(506) int local506 = this.anInt3747 + this.anInt3789 >> 1;
			@Pc(525) int local525 = (int) (Static114.aFloat47 * (float) this.anInt3762 + (float) local498 * Static377.aFloat189 + Static529.aFloat192 + Static224.aFloat104 * (float) local506);
			@Pc(544) int local544 = (int) ((float) local498 * Static439.aFloat179 + Static77.aFloat45 + Static288.aFloat120 * (float) this.anInt3762 + Static518.aFloat191 * (float) local506);
			@Pc(563) int local563 = (int) (Static435.aFloat178 + (float) local498 * Static321.aFloat127 + Static238.aFloat111 * (float) this.anInt3762 + Static234.aFloat108 * (float) local506);
			if (this.aClass9_Sub3_8.anInt6540 > local563) {
				local488 = true;
			} else {
				arg1.anInt6177 = local544 * this.aClass9_Sub3_8.anInt6527 / local563 + this.aClass9_Sub3_8.anInt6544;
				arg1.anInt6180 = local525 * this.aClass9_Sub3_8.anInt6549 / local563 + this.aClass9_Sub3_8.anInt6535;
			}
			@Pc(621) int local621 = (int) ((float) local506 * Static224.aFloat104 + (float) local498 * Static377.aFloat189 + Static529.aFloat192 + (float) this.anInt3730 * Static114.aFloat47);
			@Pc(640) int local640 = (int) (Static77.aFloat45 + Static439.aFloat179 * (float) local498 + (float) this.anInt3730 * Static288.aFloat120 + (float) local506 * Static518.aFloat191);
			@Pc(659) int local659 = (int) ((float) local506 * Static234.aFloat108 + Static238.aFloat111 * (float) this.anInt3730 + Static321.aFloat127 * (float) local498 + Static435.aFloat178);
			if (this.aClass9_Sub3_8.anInt6540 > local659) {
				local488 = true;
			} else {
				arg1.anInt6179 = this.aClass9_Sub3_8.anInt6544 + this.aClass9_Sub3_8.anInt6527 * local640 / local659;
				arg1.anInt6178 = this.aClass9_Sub3_8.anInt6549 * local621 / local659 + this.aClass9_Sub3_8.anInt6535;
			}
			if (local488) {
				if (local563 < this.aClass9_Sub3_8.anInt6540 && this.aClass9_Sub3_8.anInt6540 > local659) {
					local490 = false;
				} else {
					@Pc(727) int local727;
					@Pc(737) int local737;
					@Pc(748) int local748;
					if (this.aClass9_Sub3_8.anInt6540 > local563) {
						local727 = (local659 - this.aClass9_Sub3_8.anInt6540 << 16) / (local659 - local563);
						local737 = ((local621 - local525) * local727 >> 16) + local621;
						local748 = ((local640 - local544) * local727 >> 16) + local640;
						arg1.anInt6180 = this.aClass9_Sub3_8.anInt6535 + this.aClass9_Sub3_8.anInt6549 * local737 / this.aClass9_Sub3_8.anInt6540;
						arg1.anInt6177 = this.aClass9_Sub3_8.anInt6544 + this.aClass9_Sub3_8.anInt6527 * local748 / this.aClass9_Sub3_8.anInt6540;
					} else if (local659 < this.aClass9_Sub3_8.anInt6540) {
						local727 = (local563 - this.aClass9_Sub3_8.anInt6540 << 16) / (local563 - local659);
						local737 = ((local525 - local621) * local727 >> 16) + local525;
						arg1.anInt6180 = this.aClass9_Sub3_8.anInt6535 + this.aClass9_Sub3_8.anInt6549 * local737 / this.aClass9_Sub3_8.anInt6540;
						local748 = (local727 * (local544 - local640) >> 16) + local544;
						arg1.anInt6177 = this.aClass9_Sub3_8.anInt6544 + local748 * this.aClass9_Sub3_8.anInt6527 / this.aClass9_Sub3_8.anInt6540;
					}
				}
			}
			if (local490) {
				if (local659 >= local563) {
					arg1.anInt6181 = this.aClass9_Sub3_8.anInt6535 + (local621 + this.anInt3740) * this.aClass9_Sub3_8.anInt6549 / local659 - arg1.anInt6178;
				} else {
					arg1.anInt6181 = this.aClass9_Sub3_8.anInt6535 + (local525 + this.anInt3740) * this.aClass9_Sub3_8.anInt6549 / local563 - arg1.anInt6180;
				}
				arg1.aBoolean456 = true;
			}
		}
		this.aClass9_Sub3_8.method5495();
		this.aClass9_Sub3_8.method5583(local16);
		this.method3361();
		this.method3365();
	}

	@OriginalMember(owner = "client!ge", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class179.anIntArray756[arg0];
		@Pc(13) int local13 = Class179.anIntArray757[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3792; local15++) {
			@Pc(34) int local34 = this.anIntArray250[local15] * local13 - this.anIntArray247[local15] * local9 >> 14;
			this.anIntArray247[local15] = local9 * this.anIntArray250[local15] + this.anIntArray247[local15] * local13 >> 14;
			this.anIntArray250[local15] = local34;
		}
		this.method3360();
		this.aBoolean314 = false;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)Z")
	private boolean method3364() {
		if (this.aClass274_1.aBoolean584) {
			return true;
		}
		if (this.aClass274_1.anInterface21_6 == null) {
			this.aClass274_1.anInterface21_6 = this.aClass9_Sub3_8.method5550(this.aBoolean313);
		}
		@Pc(34) Interface21 local34 = this.aClass274_1.anInterface21_6;
		local34.method5022(this.anInt3793 * 6);
		@Pc(46) Buffer local46 = local34.method6521();
		if (local46 != null) {
			@Pc(54) Stream local54 = this.aClass9_Sub3_8.method5524(local46);
			@Pc(58) int local58;
			if (Stream.c()) {
				for (local58 = 0; local58 < this.anInt3793; local58++) {
					local54.c(this.aShortArray49[local58]);
					local54.c(this.aShortArray37[local58]);
					local54.c(this.aShortArray39[local58]);
				}
			} else {
				for (local58 = 0; local58 < this.anInt3793; local58++) {
					local54.d(this.aShortArray49[local58]);
					local54.d(this.aShortArray37[local58]);
					local54.d(this.aShortArray39[local58]);
				}
			}
			local54.a();
			if (local34.method6524()) {
				this.aClass274_1.aBoolean584 = true;
				this.aBoolean315 = true;
				this.aClass274_1.anInterface21_7 = local34;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.aShort35 = (short) arg0;
		this.method3360();
		this.method3357();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method7072(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class23_Sub1 local8 = (Class23_Sub1) arg0;
		if (this.anInt3756 == 0 || local8.anInt3756 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt3792;
		@Pc(21) int[] local21 = local8.anIntArray255;
		@Pc(24) int[] local24 = local8.anIntArray250;
		@Pc(27) int[] local27 = local8.anIntArray247;
		@Pc(30) short[] local30 = local8.aShortArray38;
		@Pc(33) short[] local33 = local8.aShortArray44;
		@Pc(36) short[] local36 = local8.aShortArray43;
		@Pc(39) byte[] local39 = local8.aByteArray46;
		@Pc(46) short[] local46;
		@Pc(54) short[] local54;
		@Pc(50) short[] local50;
		@Pc(58) byte[] local58;
		if (this.aClass63_1 == null) {
			local54 = null;
			local50 = null;
			local58 = null;
			local46 = null;
		} else {
			local46 = this.aClass63_1.aShortArray27;
			local50 = this.aClass63_1.aShortArray29;
			local54 = this.aClass63_1.aShortArray28;
			local58 = this.aClass63_1.aByteArray39;
		}
		@Pc(83) short[] local83;
		@Pc(75) short[] local75;
		@Pc(87) short[] local87;
		@Pc(79) byte[] local79;
		if (local8.aClass63_1 == null) {
			local75 = null;
			local79 = null;
			local87 = null;
			local83 = null;
		} else {
			local75 = local8.aClass63_1.aShortArray28;
			local79 = local8.aClass63_1.aByteArray39;
			local83 = local8.aClass63_1.aShortArray27;
			local87 = local8.aClass63_1.aShortArray29;
		}
		@Pc(100) int[] local100 = local8.anIntArray249;
		@Pc(103) short[] local103 = local8.aShortArray46;
		if (!local8.aBoolean314) {
			local8.method3350();
		}
		@Pc(112) int local112 = local8.anInt3762;
		@Pc(115) int local115 = local8.anInt3730;
		@Pc(118) int local118 = local8.anInt3734;
		@Pc(121) int local121 = local8.anInt3741;
		@Pc(124) int local124 = local8.anInt3789;
		@Pc(127) int local127 = local8.anInt3747;
		for (@Pc(129) int local129 = 0; local129 < this.anInt3792; local129++) {
			@Pc(138) int local138 = this.anIntArray250[local129] - arg2;
			if (local112 <= local138 && local115 >= local138) {
				@Pc(154) int local154 = this.anIntArray255[local129] - arg1;
				if (local118 <= local154 && local121 >= local154) {
					@Pc(177) int local177 = this.anIntArray247[local129] - arg3;
					if (local124 <= local177 && local177 <= local127) {
						@Pc(187) int local187 = -1;
						@Pc(192) int local192 = this.anIntArray249[local129];
						@Pc(199) int local199 = this.anIntArray249[local129 + 1];
						for (@Pc(201) int local201 = local192; local201 < local199; local201++) {
							local187 = this.aShortArray46[local201] - 1;
							if (local187 == -1 || this.aByteArray46[local187] != 0) {
								break;
							}
						}
						if (local187 != -1) {
							for (@Pc(232) int local232 = 0; local232 < local18; local232++) {
								if (local21[local232] == local154 && local27[local232] == local177 && local138 == local24[local232]) {
									local199 = local100[local232 + 1];
									@Pc(257) int local257 = -1;
									local192 = local100[local232];
									for (@Pc(263) int local263 = local192; local263 < local199; local263++) {
										local257 = local103[local263] - 1;
										if (local257 == -1 || local39[local257] != 0) {
											break;
										}
									}
									if (local257 != -1) {
										if (local46 == null) {
											this.aClass63_1 = new Class63();
											local46 = this.aClass63_1.aShortArray27 = Static460.method7135(this.aShortArray38);
											local54 = this.aClass63_1.aShortArray28 = Static460.method7135(this.aShortArray44);
											local50 = this.aClass63_1.aShortArray29 = Static460.method7135(this.aShortArray43);
											local58 = this.aClass63_1.aByteArray39 = Static352.method5720(this.aByteArray46);
										}
										if (local83 == null) {
											@Pc(344) Class63 local344 = local8.aClass63_1 = new Class63();
											local83 = local344.aShortArray27 = Static460.method7135(local30);
											local75 = local344.aShortArray28 = Static460.method7135(local33);
											local87 = local344.aShortArray29 = Static460.method7135(local36);
											local79 = local344.aByteArray39 = Static352.method5720(local39);
										}
										@Pc(377) short local377 = this.aShortArray38[local187];
										@Pc(382) short local382 = this.aShortArray44[local187];
										@Pc(387) short local387 = this.aShortArray43[local187];
										@Pc(392) byte local392 = this.aByteArray46[local187];
										local192 = local100[local232];
										local199 = local100[local232 + 1];
										@Pc(412) int local412;
										for (@Pc(404) int local404 = local192; local404 < local199; local404++) {
											local412 = local103[local404] - 1;
											if (local412 == -1) {
												break;
											}
											if (local79[local412] != 0) {
												local83[local412] += local377;
												local75[local412] += local382;
												local87[local412] += local387;
												local79[local412] += local392;
											}
										}
										local392 = local39[local257];
										local199 = this.anIntArray249[local129 + 1];
										local192 = this.anIntArray249[local129];
										local377 = local30[local257];
										local382 = local33[local257];
										local387 = local36[local257];
										for (local412 = local192; local412 < local199; local412++) {
											@Pc(497) int local497 = this.aShortArray46[local412] - 1;
											if (local497 == -1) {
												break;
											}
											if (local58[local497] != 0) {
												local46[local497] += local377;
												local54[local497] += local382;
												local50[local497] += local387;
												local58[local497] += local392;
											}
										}
										local8.method3357();
										this.method3357();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "()[Lclient!dg;")
	@Override
	public Class69[] method7080() {
		return this.aClass69Array1;
	}

	@OriginalMember(owner = "client!ge", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface2 local9 = this.aClass9_Sub3_8.anInterface2_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt3756; local11++) {
			if (this.aShortArray45[local11] == arg0) {
				this.aShortArray45[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class296 local47 = local9.method3585(arg0 & 0xFFFF);
			local37 = local47.aByte101;
			local35 = local47.aByte103;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class296 local67 = local9.method3585(arg1 & 0xFFFF);
			local55 = local67.aByte103;
			local57 = local67.aByte101;
		}
		if (!(local35 != local55 | local57 != local37)) {
			return;
		}
		if (this.aClass201Array1 != null) {
			for (@Pc(92) int local92 = 0; local92 < this.anInt3790; local92++) {
				@Pc(99) Class201 local99 = this.aClass201Array1[local92];
				@Pc(104) Class157 local104 = this.aClass157Array1[local92];
				local104.anInt4789 = local104.anInt4789 & 0xFF000000 | Static223.anIntArray301[this.aShortArray40[local99.anInt5694] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3353();
	}

	@OriginalMember(owner = "client!ge", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean314) {
			this.method3350();
		}
		return this.anInt3730;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)V")
	private void method3365() {
		if (this.aClass201Array1 == null) {
			return;
		}
		@Pc(16) float local16 = this.aClass9_Sub3_8.method5537();
		@Pc(20) float local20 = this.aClass9_Sub3_8.method5576();
		this.aClass9_Sub3_8.method5455(false);
		this.aClass9_Sub3_8.method5502(false);
		this.aClass9_Sub3_8.method5596(Static140.aClass50_2, 1);
		this.aClass9_Sub3_8.method5543(Static140.aClass50_2, 1);
		for (@Pc(43) int local43 = 0; local43 < this.anInt3790; local43++) {
			@Pc(50) Class201 local50 = this.aClass201Array1[local43];
			@Pc(55) Class157 local55 = this.aClass157Array1[local43];
			if (!local50.aBoolean433 || !this.aClass9_Sub3_8.method5398()) {
				@Pc(84) float local84 = (float) (this.anIntArray255[local50.anInt5695] + this.anIntArray255[local50.anInt5691] + this.anIntArray255[local50.anInt5692]) * 0.3333333F;
				@Pc(106) float local106 = (float) (this.anIntArray250[local50.anInt5691] + this.anIntArray250[local50.anInt5692] + this.anIntArray250[local50.anInt5695]) * 0.3333333F;
				@Pc(128) float local128 = (float) (this.anIntArray247[local50.anInt5695] + this.anIntArray247[local50.anInt5691] + this.anIntArray247[local50.anInt5692]) * 0.3333333F;
				@Pc(142) float local142 = Static114.aFloat47 * local106 + local84 * Static377.aFloat189 + local128 * Static224.aFloat104 + Static529.aFloat192;
				@Pc(156) float local156 = local128 * Static518.aFloat191 + Static439.aFloat179 * local84 + local106 * Static288.aFloat120 + Static77.aFloat45;
				@Pc(170) float local170 = Static435.aFloat178 + local106 * Static238.aFloat111 + local84 * Static321.aFloat127 + Static234.aFloat108 * local128;
				@Pc(175) Class8_Sub3 local175 = this.aClass9_Sub3_8.method5590();
				local175.method8199(local170, local156 + (float) local55.anInt4793, local55.anInt4790 * local50.aShort51 >> 7, local55.anInt4794 * local50.aShort50 >> 7, local55.anInt4792, local142 + (float) local55.anInt4788);
				local175.method8188(this.aClass9_Sub3_8.aClass8_Sub3_17);
				this.aClass9_Sub3_8.method5487();
				this.aClass9_Sub3_8.ka(local20, local16 - (float) local50.anInt5690 * 1.5F);
				@Pc(230) int local230 = local55.anInt4789;
				this.aClass9_Sub3_8.method5559(local50.aShort52, false, false);
				this.aClass9_Sub3_8.method5587(local50.aByte52);
				this.aClass9_Sub3_8.method5536(local230);
				this.aClass9_Sub3_8.method5552();
			}
		}
		this.aClass9_Sub3_8.method5543(Static49.aClass50_1, 1);
		this.aClass9_Sub3_8.method5596(Static49.aClass50_1, 1);
		this.aClass9_Sub3_8.ka(local20, local16);
		this.aClass9_Sub3_8.method5455(true);
	}
}
