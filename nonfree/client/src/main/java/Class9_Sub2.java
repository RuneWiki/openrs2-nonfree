import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "Z")
	private boolean aBoolean135;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "Z")
	private boolean aBoolean136;

	@OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
	private int anInt1467;

	@OriginalMember(owner = "client!cn", name = "G", descriptor = "Lclient!qca;")
	private Class279 aClass279_1;

	@OriginalMember(owner = "client!cn", name = "O", descriptor = "I")
	private int anInt1476;

	@OriginalMember(owner = "client!cn", name = "V", descriptor = "Lclient!ms;")
	private Class233 aClass233_1;

	@OriginalMember(owner = "client!cn", name = "W", descriptor = "I")
	private int anInt1481;

	@OriginalMember(owner = "client!cn", name = "X", descriptor = "Lclient!ej;")
	private final Class66_Sub1 aClass66_Sub1_3;

	@OriginalMember(owner = "client!cn", name = "ob", descriptor = "Lclient!ms;")
	private Class233 aClass233_2;

	@OriginalMember(owner = "client!cn", name = "xb", descriptor = "I")
	private int anInt1496;

	@OriginalMember(owner = "client!cn", name = "yb", descriptor = "Lclient!ms;")
	private Class233 aClass233_3;

	@OriginalMember(owner = "client!cn", name = "Cb", descriptor = "I")
	private int anInt1498;

	@OriginalMember(owner = "client!cn", name = "Nb", descriptor = "Lclient!jg;")
	private Class177 aClass177_1;

	@OriginalMember(owner = "client!cn", name = "Qb", descriptor = "I")
	private int anInt1509;

	@OriginalMember(owner = "client!cn", name = "bc", descriptor = "I")
	private int anInt1518;

	@OriginalMember(owner = "client!cn", name = "ec", descriptor = "I")
	private int anInt1519;

	@OriginalMember(owner = "client!cn", name = "gc", descriptor = "I")
	private int anInt1520;

	@OriginalMember(owner = "client!cn", name = "rc", descriptor = "Lclient!ms;")
	private Class233 aClass233_4;

	@OriginalMember(owner = "client!cn", name = "vc", descriptor = "I")
	private int anInt1531;

	@OriginalMember(owner = "client!cn", name = "J", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!cn", name = "sc", descriptor = "I")
	private int anInt1528;

	@OriginalMember(owner = "client!cn", name = "Q", descriptor = "I")
	private int anInt1478;

	@OriginalMember(owner = "client!cn", name = "ic", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!cn", name = "Gb", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
	private int anInt1471;

	@OriginalMember(owner = "client!cn", name = "Ab", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!cn", name = "kc", descriptor = "I")
	private int anInt1523;

	@OriginalMember(owner = "client!cn", name = "tb", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!cn", name = "fc", descriptor = "[Lclient!jt;")
	private Class181[] aClass181Array4;

	@OriginalMember(owner = "client!cn", name = "ib", descriptor = "[Lclient!efa;")
	private Class89[] aClass89Array4;

	@OriginalMember(owner = "client!cn", name = "xc", descriptor = "I")
	private int anInt1533;

	@OriginalMember(owner = "client!cn", name = "cb", descriptor = "[Lclient!ug;")
	private Class333[] aClass333Array1;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "[Lclient!kaa;")
	private Class186[] aClass186Array1;

	@OriginalMember(owner = "client!cn", name = "Bb", descriptor = "[F")
	private float[] aFloatArray3;

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!cn", name = "Jb", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!cn", name = "sb", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!cn", name = "U", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!cn", name = "cc", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!cn", name = "jb", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!cn", name = "R", descriptor = "[F")
	private float[] aFloatArray2;

	@OriginalMember(owner = "client!cn", name = "Z", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!cn", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!cn", name = "K", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!cn", name = "D", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!cn", name = "lc", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!cn", name = "eb", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!cn", name = "H", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!cn", name = "Ub", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!cn", name = "qc", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!cn", name = "dc", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!cn", name = "rb", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!ej;Lclient!pf;IIII)V")
	public Class9_Sub2(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface3 local11 = arg0.anInterface3_15;
		@Pc(15) int[] local15 = new int[arg1.anInt7038];
		this.anIntArray196 = new int[arg1.anInt7033 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt7038; local24++) {
			if ((arg1.aByteArray85 == null || arg1.aByteArray85[local24] != 2) && (arg1.aShortArray124 == null || arg1.aShortArray124[local24] == -1 || !local11.method7249(arg1.aShortArray124[local24] & 0xFFFF).aBoolean512)) {
				local15[this.anInt1528++] = local24;
				this.anIntArray196[arg1.aShortArray128[local24]]++;
				this.anIntArray196[arg1.aShortArray127[local24]]++;
				this.anIntArray196[arg1.aShortArray121[local24]]++;
			}
		}
		this.anInt1478 = this.anInt1528;
		@Pc(118) long[] local118 = new long[this.anInt1528];
		@Pc(130) boolean local130 = (this.anInt1467 & 0x100) != 0;
		@Pc(142) int local142;
		@Pc(153) int local153;
		@Pc(276) int local276;
		label500: for (@Pc(132) int local132 = 0; local132 < this.anInt1528; local132++) {
			@Pc(138) int local138 = local15[local132];
			@Pc(140) Class271 local140 = null;
			local142 = 0;
			@Pc(144) byte local144 = 0;
			@Pc(146) byte local146 = 0;
			@Pc(148) byte local148 = 0;
			if (arg1.aClass253Array1 != null) {
				for (local153 = 0; local153 < arg1.aClass253Array1.length; local153++) {
					@Pc(160) Class253 local160 = arg1.aClass253Array1[local153];
					if (local160.anInt6798 == local138) {
						@Pc(169) Class97 local169 = Static504.method7176(local160.anInt6800);
						if (local169.aBoolean242) {
							local118[local132] = Long.MAX_VALUE;
							this.anInt1478--;
							continue label500;
						}
					}
				}
			}
			@Pc(196) short local196 = -1;
			if (arg1.aShortArray124 != null) {
				local196 = arg1.aShortArray124[local138];
				if (local196 != -1) {
					local140 = local11.method7249(local196 & 0xFFFF);
					local148 = local140.aByte81;
					local146 = local140.aByte84;
				}
			}
			@Pc(238) boolean local238 = arg1.aByteArray86 != null && arg1.aByteArray86[local138] != 0 || local140 != null && !local140.aBoolean513;
			if ((local130 || local238) && arg1.aByteArray87 != null) {
				local142 += arg1.aByteArray87[local138] << 17;
			}
			if (local238) {
				local142 += 65536;
			}
			local142 += (local146 & 0xFF) << 8;
			local276 = local144 + ((local196 & 0xFFFF) << 16);
			local142 += local148 & 0xFF;
			@Pc(288) int local288 = local276 + (local132 & 0xFFFF);
			local118[local132] = ((long) local142 << 32) + (long) local288;
		}
		Static497.method7074(local15, local118);
		this.anIntArray201 = arg1.anIntArray579;
		this.anIntArray199 = arg1.anIntArray580;
		this.anInt1471 = arg1.anInt7033;
		this.aShortArray41 = arg1.aShortArray123;
		this.anInt1523 = arg1.anInt7023;
		this.anIntArray198 = arg1.anIntArray581;
		this.aClass181Array4 = arg1.aClass181Array7;
		@Pc(339) Class90[] local339 = new Class90[this.anInt1471];
		this.aClass89Array4 = arg1.aClass89Array7;
		@Pc(363) int local363;
		@Pc(377) int local377;
		if (arg1.aClass253Array1 != null) {
			this.anInt1533 = arg1.aClass253Array1.length;
			this.aClass333Array1 = new Class333[this.anInt1533];
			this.aClass186Array1 = new Class186[this.anInt1533];
			for (local363 = 0; local363 < this.anInt1533; local363++) {
				@Pc(370) Class253 local370 = arg1.aClass253Array1[local363];
				@Pc(375) Class97 local375 = Static504.method7176(local370.anInt6800);
				local377 = -1;
				for (@Pc(379) int local379 = 0; local379 < this.anInt1528; local379++) {
					if (local370.anInt6798 == local15[local379]) {
						local377 = local379;
						break;
					}
				}
				if (local377 == -1) {
					throw new RuntimeException();
				}
				local153 = Static170.anIntArray696[arg1.aShortArray129[local370.anInt6798] & 0xFFFF] & 0xFFFFFF;
				local153 |= 255 - (arg1.aByteArray86 == null ? 0 : arg1.aByteArray86[local370.anInt6798]) << 24;
				this.aClass186Array1[local363] = new Class186(local377, arg1.aShortArray128[local370.anInt6798], arg1.aShortArray127[local370.anInt6798], arg1.aShortArray121[local370.anInt6798], local375.anInt3081, local375.anInt3078, local375.anInt3082, local375.anInt3076, local375.anInt3083, local375.aBoolean242, local375.aBoolean241, local370.anInt6797);
				this.aClass333Array1[local363] = new Class333(local153);
			}
		}
		local363 = this.anInt1528 * 3;
		this.aFloatArray3 = new float[local363];
		this.aByteArray23 = new byte[this.anInt1528];
		this.aShort38 = (short) arg4;
		if (arg1.aShortArray126 != null) {
			this.aShortArray42 = new short[this.anInt1528];
		}
		this.aShortArray40 = new short[local363];
		this.aByteArray24 = new byte[local363];
		this.aShort39 = (short) arg3;
		this.aShortArray32 = new short[local363];
		this.aShortArray39 = new short[this.anInt1528];
		Static174.aLongArray2 = new long[local363];
		this.aFloatArray2 = new float[local363];
		this.aShortArray38 = new short[this.anInt1528];
		this.lb = new short[this.anInt1528];
		this.aShortArray33 = new short[local363];
		this.aShortArray35 = new short[local363];
		this.aShortArray37 = new short[this.anInt1528];
		this.aShortArray34 = new short[local363];
		this.aShortArray36 = new short[this.anInt1528];
		this.aShortArray43 = new short[local363];
		local142 = 0;
		for (local276 = 0; local276 < arg1.anInt7033; local276++) {
			local377 = this.anIntArray196[local276];
			this.anIntArray196[local276] = local142;
			local339[local276] = new Class90();
			local142 += local377;
		}
		this.anIntArray196[arg1.anInt7033] = local142;
		@Pc(618) int[] local618 = null;
		@Pc(620) int[] local620 = null;
		@Pc(622) int[] local622 = null;
		@Pc(624) float[][] local624 = null;
		@Pc(642) int[] local642;
		@Pc(650) int local650;
		@Pc(698) int local698;
		@Pc(704) int local704;
		@Pc(718) int local718;
		@Pc(720) int local720;
		@Pc(756) int local756;
		@Pc(761) int local761;
		@Pc(912) float local912;
		@Pc(917) float local917;
		@Pc(941) float local941;
		if (arg1.aByteArray90 != null) {
			@Pc(630) int local630 = arg1.anInt7030;
			@Pc(633) int[] local633 = new int[local630];
			@Pc(636) int[] local636 = new int[local630];
			@Pc(639) int[] local639 = new int[local630];
			local642 = new int[local630];
			@Pc(645) int[] local645 = new int[local630];
			@Pc(648) int[] local648 = new int[local630];
			for (local650 = 0; local650 < local630; local650++) {
				local633[local650] = Integer.MAX_VALUE;
				local636[local650] = -2147483647;
				local639[local650] = Integer.MAX_VALUE;
				local642[local650] = -2147483647;
				local645[local650] = Integer.MAX_VALUE;
				local648[local650] = -2147483647;
			}
			local618 = new int[local630];
			local624 = new float[local630][];
			local622 = new int[local630];
			local620 = new int[local630];
			for (local698 = 0; local698 < this.anInt1528; local698++) {
				local704 = local15[local698];
				if (arg1.aByteArray90[local704] != -1) {
					local718 = arg1.aByteArray90[local704] & 0xFF;
					for (local720 = 0; local720 < 3; local720++) {
						@Pc(732) short local732;
						if (local720 == 0) {
							local732 = arg1.aShortArray128[local704];
						} else if (local720 == 1) {
							local732 = arg1.aShortArray127[local704];
						} else {
							local732 = arg1.aShortArray121[local704];
						}
						local756 = arg1.anIntArray581[local732];
						local761 = arg1.anIntArray580[local732];
						@Pc(766) int local766 = arg1.anIntArray579[local732];
						if (local633[local718] > local756) {
							local633[local718] = local756;
						}
						if (local636[local718] < local756) {
							local636[local718] = local756;
						}
						if (local639[local718] > local761) {
							local639[local718] = local761;
						}
						if (local761 > local642[local718]) {
							local642[local718] = local761;
						}
						if (local766 < local645[local718]) {
							local645[local718] = local766;
						}
						if (local766 > local648[local718]) {
							local648[local718] = local766;
						}
					}
				}
			}
			for (local704 = 0; local704 < local630; local704++) {
				@Pc(852) byte local852 = arg1.aByteArray89[local704];
				if (local852 > 0) {
					local618[local704] = (local636[local704] + local633[local704]) / 2;
					local620[local704] = (local642[local704] + local639[local704]) / 2;
					local622[local704] = (local648[local704] + local645[local704]) / 2;
					if (local852 == 1) {
						local761 = arg1.anIntArray586[local704];
						if (local761 == 0) {
							local912 = 1.0F;
							local917 = 1.0F;
						} else if (local761 > 0) {
							local912 = 1.0F;
							local917 = (float) local761 / 1024.0F;
						} else {
							local912 = (float) -local761 / 1024.0F;
							local917 = 1.0F;
						}
						local941 = 64.0F / (float) arg1.anIntArray578[local704];
					} else if (local852 == 2) {
						local941 = 64.0F / (float) arg1.anIntArray578[local704];
						local912 = 64.0F / (float) arg1.anIntArray586[local704];
						local917 = 64.0F / (float) arg1.anIntArray588[local704];
					} else {
						local917 = (float) arg1.anIntArray588[local704] / 1024.0F;
						local912 = (float) arg1.anIntArray586[local704] / 1024.0F;
						local941 = (float) arg1.anIntArray578[local704] / 1024.0F;
					}
					local624[local704] = Static162.method3176(arg1.aShortArray130[local704], arg1.aByteArray88[local704] & 0xFF, arg1.aShortArray125[local704], local917, arg1.aShortArray122[local704], local941, local912);
				}
			}
		}
		@Pc(1032) Class257[] local1032 = new Class257[arg1.anInt7038];
		@Pc(1051) short local1051;
		@Pc(1061) int local1061;
		@Pc(1072) int local1072;
		for (@Pc(1034) int local1034 = 0; local1034 < arg1.anInt7038; local1034++) {
			@Pc(1041) short local1041 = arg1.aShortArray128[local1034];
			@Pc(1046) short local1046 = arg1.aShortArray127[local1034];
			local1051 = arg1.aShortArray121[local1034];
			local1061 = this.anIntArray198[local1046] - this.anIntArray198[local1041];
			local1072 = this.anIntArray199[local1046] - this.anIntArray199[local1041];
			local650 = this.anIntArray201[local1046] - this.anIntArray201[local1041];
			local698 = this.anIntArray198[local1051] - this.anIntArray198[local1041];
			local704 = this.anIntArray199[local1051] - this.anIntArray199[local1041];
			local718 = this.anIntArray201[local1051] - this.anIntArray201[local1041];
			local720 = local718 * local1072 - local650 * local704;
			@Pc(1133) int local1133 = local698 * local650 - local1061 * local718;
			local756 = local704 * local1061 - local698 * local1072;
			while (local720 > 8192 || local1133 > 8192 || local756 > 8192 || local720 < -8192 || local1133 < -8192 || local756 < -8192) {
				local756 >>= 0x1;
				local720 >>= 0x1;
				local1133 >>= 0x1;
			}
			local761 = (int) Math.sqrt((double) (local720 * local720 + local1133 * local1133 + local756 * local756));
			if (local761 <= 0) {
				local761 = 1;
			}
			local720 = local720 * 256 / local761;
			local1133 = local1133 * 256 / local761;
			local756 = local756 * 256 / local761;
			@Pc(1230) byte local1230 = arg1.aByteArray85 == null ? 0 : arg1.aByteArray85[local1034];
			if (local1230 == 0) {
				@Pc(1263) Class90 local1263 = local339[local1041];
				local1263.anInt2751 += local1133;
				local1263.anInt2753++;
				local1263.anInt2752 += local720;
				local1263.anInt2750 += local756;
				@Pc(1291) Class90 local1291 = local339[local1046];
				local1291.anInt2753++;
				local1291.anInt2751 += local1133;
				local1291.anInt2750 += local756;
				local1291.anInt2752 += local720;
				@Pc(1319) Class90 local1319 = local339[local1051];
				local1319.anInt2753++;
				local1319.anInt2751 += local1133;
				local1319.anInt2750 += local756;
				local1319.anInt2752 += local720;
			} else if (local1230 == 1) {
				@Pc(1248) Class257 local1248 = local1032[local1034] = new Class257();
				local1248.anInt6846 = local1133;
				local1248.anInt6847 = local720;
				local1248.anInt6849 = local756;
			}
		}
		@Pc(1356) int local1356;
		for (@Pc(1350) int local1350 = 0; local1350 < this.anInt1528; local1350++) {
			local1356 = local15[local1350];
			@Pc(1363) int local1363 = arg1.aShortArray129[local1356] & 0xFFFF;
			@Pc(1371) short local1371;
			if (arg1.aShortArray124 == null) {
				local1371 = -1;
			} else {
				local1371 = arg1.aShortArray124[local1356];
			}
			if (arg1.aByteArray90 == null) {
				local1072 = -1;
			} else {
				local1072 = arg1.aByteArray90[local1356];
			}
			if (arg1.aByteArray86 == null) {
				local650 = 0;
			} else {
				local650 = arg1.aByteArray86[local1356] & 0xFF;
			}
			@Pc(1403) float local1403 = 0.0F;
			@Pc(1405) float local1405 = 0.0F;
			@Pc(1407) float local1407 = 0.0F;
			local912 = 0.0F;
			local941 = 0.0F;
			local917 = 0.0F;
			@Pc(1415) byte local1415 = 0;
			@Pc(1417) byte local1417 = 0;
			@Pc(1419) int local1419 = 0;
			@Pc(1435) byte local1435;
			@Pc(1455) short local1455;
			@Pc(2199) short local2199;
			@Pc(2204) short local2204;
			if (local1371 != -1) {
				if (local1072 == -1) {
					local1407 = 1.0F;
					local1403 = 0.0F;
					local1405 = 1.0F;
					local917 = 0.0F;
					local941 = 0.0F;
					local912 = 1.0F;
					local1417 = 2;
					local1415 = 1;
				} else {
					local1072 &= 0xFF;
					local1435 = arg1.aByteArray89[local1072];
					@Pc(1445) short local1445;
					@Pc(1450) short local1450;
					@Pc(1484) float local1484;
					@Pc(1497) float local1497;
					@Pc(1576) float local1576;
					@Pc(1810) float local1810;
					@Pc(1818) float local1818;
					@Pc(1826) float local1826;
					@Pc(1849) float local1849;
					@Pc(1872) float local1872;
					@Pc(1895) float local1895;
					if (local1435 == 0) {
						local1445 = arg1.aShortArray128[local1356];
						local1450 = arg1.aShortArray127[local1356];
						local1455 = arg1.aShortArray121[local1356];
						local2199 = arg1.aShortArray122[local1072];
						local2204 = arg1.aShortArray125[local1072];
						@Pc(2209) short local2209 = arg1.aShortArray130[local1072];
						@Pc(2215) float local2215 = (float) arg1.anIntArray581[local2199];
						@Pc(2221) float local2221 = (float) arg1.anIntArray580[local2199];
						local1484 = arg1.anIntArray579[local2199];
						local1497 = (float) arg1.anIntArray581[local2204] - local2215;
						local1576 = (float) arg1.anIntArray580[local2204] - local2221;
						@Pc(2251) float local2251 = (float) arg1.anIntArray579[local2204] - local1484;
						@Pc(2259) float local2259 = (float) arg1.anIntArray581[local2209] - local2215;
						@Pc(2268) float local2268 = (float) arg1.anIntArray580[local2209] - local2221;
						@Pc(2276) float local2276 = (float) arg1.anIntArray579[local2209] - local1484;
						@Pc(2284) float local2284 = (float) arg1.anIntArray581[local1445] - local2215;
						@Pc(2293) float local2293 = (float) arg1.anIntArray580[local1445] - local2221;
						@Pc(2302) float local2302 = (float) arg1.anIntArray579[local1445] - local1484;
						@Pc(2311) float local2311 = (float) arg1.anIntArray581[local1450] - local2215;
						@Pc(2320) float local2320 = (float) arg1.anIntArray580[local1450] - local2221;
						local1810 = (float) arg1.anIntArray579[local1450] - local1484;
						local1818 = (float) arg1.anIntArray581[local1455] - local2215;
						local1826 = (float) arg1.anIntArray580[local1455] - local2221;
						local1849 = (float) arg1.anIntArray579[local1455] - local1484;
						local1872 = local2276 * local1576 - local2251 * local2268;
						local1895 = local2259 * local2251 - local2276 * local1497;
						@Pc(2381) float local2381 = local2268 * local1497 - local2259 * local1576;
						@Pc(2390) float local2390 = local2381 * local2268 - local2276 * local1895;
						@Pc(2398) float local2398 = local2276 * local1872 - local2259 * local2381;
						@Pc(2407) float local2407 = local2259 * local1895 - local1872 * local2268;
						@Pc(2421) float local2421 = 1.0F / (local2390 * local1497 + local2398 * local1576 + local2407 * local2251);
						local1403 = local2421 * (local2293 * local2398 + local2284 * local2390 + local2302 * local2407);
						local941 = local2421 * (local2407 * local1849 + local2398 * local1826 + local2390 * local1818);
						local1407 = local2421 * (local2407 * local1810 + local2311 * local2390 + local2320 * local2398);
						@Pc(2472) float local2472 = local1497 * local1895 - local1872 * local1576;
						@Pc(2481) float local2481 = local1576 * local2381 - local1895 * local2251;
						@Pc(2490) float local2490 = local2251 * local1872 - local1497 * local2381;
						@Pc(2504) float local2504 = 1.0F / (local2276 * local2472 + local2259 * local2481 + local2268 * local2490);
						local917 = (local1849 * local2472 + local1826 * local2490 + local2481 * local1818) * local2504;
						local1405 = (local2302 * local2472 + local2481 * local2284 + local2293 * local2490) * local2504;
						local912 = local2504 * (local1810 * local2472 + local2490 * local2320 + local2311 * local2481);
					} else {
						local1445 = arg1.aShortArray128[local1356];
						local1450 = arg1.aShortArray127[local1356];
						local1455 = arg1.aShortArray121[local1356];
						@Pc(1459) int local1459 = local618[local1072];
						@Pc(1463) int local1463 = local620[local1072];
						@Pc(1467) int local1467 = local622[local1072];
						@Pc(1471) float[] local1471 = local624[local1072];
						@Pc(1476) byte local1476 = arg1.aByteArray91[local1072];
						local1484 = (float) arg1.anIntArray585[local1072] / 256.0F;
						if (local1435 == 1) {
							local1497 = (float) arg1.anIntArray588[local1072] / 1024.0F;
							Static468.method2156(local1471, arg1.anIntArray579[local1445], local1463, local1484, local1459, arg1.anIntArray581[local1445], local1476, local1497, arg1.anIntArray580[local1445], local1467);
							local1405 = Static393.aFloat201;
							local1403 = Static455.aFloat155;
							Static468.method2156(local1471, arg1.anIntArray579[local1450], local1463, local1484, local1459, arg1.anIntArray581[local1450], local1476, local1497, arg1.anIntArray580[local1450], local1467);
							local1407 = Static455.aFloat155;
							local912 = Static393.aFloat201;
							Static468.method2156(local1471, arg1.anIntArray579[local1455], local1463, local1484, local1459, arg1.anIntArray581[local1455], local1476, local1497, arg1.anIntArray580[local1455], local1467);
							local917 = Static393.aFloat201;
							local941 = Static455.aFloat155;
							local1576 = local1497 / 2.0F;
							if ((local1476 & 0x1) == 0) {
								if (local1576 < local941 - local1403) {
									local941 -= local1497;
									local1417 = 1;
								} else if (local1403 - local941 > local1576) {
									local1417 = 2;
									local941 += local1497;
								}
								if (local1576 < local1407 - local1403) {
									local1407 -= local1497;
									local1415 = 1;
								} else if (local1576 < local1403 - local1407) {
									local1407 += local1497;
									local1415 = 2;
								}
							} else {
								if (local917 - local1405 > local1576) {
									local917 -= local1497;
									local1417 = 1;
								} else if (local1576 < local1405 - local917) {
									local1417 = 2;
									local917 += local1497;
								}
								if (local912 - local1405 > local1576) {
									local912 -= local1497;
									local1415 = 1;
								} else if (local1576 < local1405 - local912) {
									local1415 = 2;
									local912 += local1497;
								}
							}
						} else if (local1435 == 2) {
							local1497 = (float) arg1.anIntArray583[local1072] / 256.0F;
							local1576 = (float) arg1.anIntArray587[local1072] / 256.0F;
							@Pc(1722) int local1722 = arg1.anIntArray581[local1450] - arg1.anIntArray581[local1445];
							@Pc(1733) int local1733 = arg1.anIntArray580[local1450] - arg1.anIntArray580[local1445];
							@Pc(1744) int local1744 = arg1.anIntArray579[local1450] - arg1.anIntArray579[local1445];
							@Pc(1755) int local1755 = arg1.anIntArray581[local1455] - arg1.anIntArray581[local1445];
							@Pc(1766) int local1766 = arg1.anIntArray580[local1455] - arg1.anIntArray580[local1445];
							@Pc(1776) int local1776 = arg1.anIntArray579[local1455] - arg1.anIntArray579[local1445];
							@Pc(1785) int local1785 = local1733 * local1776 - local1766 * local1744;
							@Pc(1794) int local1794 = local1755 * local1744 - local1776 * local1722;
							@Pc(1802) int local1802 = local1766 * local1722 - local1733 * local1755;
							local1810 = 64.0F / (float) arg1.anIntArray586[local1072];
							local1818 = 64.0F / (float) arg1.anIntArray578[local1072];
							local1826 = 64.0F / (float) arg1.anIntArray588[local1072];
							local1849 = (local1471[1] * (float) local1794 + local1471[0] * (float) local1785 + local1471[2] * (float) local1802) / local1810;
							local1872 = (local1471[5] * (float) local1802 + (float) local1785 * local1471[3] + (float) local1794 * local1471[4]) / local1818;
							local1895 = (local1471[8] * (float) local1802 + (float) local1794 * local1471[7] + (float) local1785 * local1471[6]) / local1826;
							local1419 = Static278.method4418(local1872, local1895, local1849);
							Static168.method3262(local1484, arg1.anIntArray580[local1445], local1467, arg1.anIntArray579[local1445], local1459, local1476, local1576, local1463, local1497, arg1.anIntArray581[local1445], local1419, local1471);
							local1403 = Static576.aFloat203;
							local1405 = Static485.aFloat165;
							Static168.method3262(local1484, arg1.anIntArray580[local1450], local1467, arg1.anIntArray579[local1450], local1459, local1476, local1576, local1463, local1497, arg1.anIntArray581[local1450], local1419, local1471);
							local912 = Static485.aFloat165;
							local1407 = Static576.aFloat203;
							Static168.method3262(local1484, arg1.anIntArray580[local1455], local1467, arg1.anIntArray579[local1455], local1459, local1476, local1576, local1463, local1497, arg1.anIntArray581[local1455], local1419, local1471);
							local917 = Static485.aFloat165;
							local941 = Static576.aFloat203;
						} else if (local1435 == 3) {
							Static255.method4261(local1476, arg1.anIntArray580[local1445], local1471, arg1.anIntArray581[local1445], local1459, local1463, local1484, local1467, arg1.anIntArray579[local1445]);
							local1403 = Static407.aFloat143;
							local1405 = Static453.aFloat153;
							Static255.method4261(local1476, arg1.anIntArray580[local1450], local1471, arg1.anIntArray581[local1450], local1459, local1463, local1484, local1467, arg1.anIntArray579[local1450]);
							local1407 = Static407.aFloat143;
							local912 = Static453.aFloat153;
							Static255.method4261(local1476, arg1.anIntArray580[local1455], local1471, arg1.anIntArray581[local1455], local1459, local1463, local1484, local1467, arg1.anIntArray579[local1455]);
							local941 = Static407.aFloat143;
							local917 = Static453.aFloat153;
							if ((local1476 & 0x1) == 0) {
								if (local1407 - local1403 > 0.5F) {
									local1415 = 1;
									local1407--;
								} else if (local1403 - local1407 > 0.5F) {
									local1407++;
									local1415 = 2;
								}
								if (local941 - local1403 > 0.5F) {
									local941--;
									local1417 = 1;
								} else if (local1403 - local941 > 0.5F) {
									local1417 = 2;
									local941++;
								}
							} else {
								if (local912 - local1405 > 0.5F) {
									local912--;
									local1415 = 1;
								} else if (local1405 - local912 > 0.5F) {
									local912++;
									local1415 = 2;
								}
								if (local917 - local1405 > 0.5F) {
									local917--;
									local1417 = 1;
								} else if (local1405 - local917 > 0.5F) {
									local1417 = 2;
									local917++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray85 == null) {
				local1435 = 0;
			} else {
				local1435 = arg1.aByteArray85[local1356];
			}
			if (local1435 == 0) {
				@Pc(2731) long local2731 = (long) (local1072 << 2) + ((long) (local1363 << 8) + (long) (local1419 << 24) + (long) local650 << 32);
				local1455 = arg1.aShortArray128[local1356];
				local2199 = arg1.aShortArray127[local1356];
				local2204 = arg1.aShortArray121[local1356];
				@Pc(2750) Class90 local2750 = local339[local1455];
				this.aShortArray39[local1350] = this.method1283(local1455, local1405, arg1, local2750.anInt2751, local2731, local2750.anInt2752, local2750.anInt2753, local1350, local2750.anInt2750, local1403);
				@Pc(2775) Class90 local2775 = local339[local2199];
				this.lb[local1350] = this.method1283(local2199, local912, arg1, local2775.anInt2751, local2731 + (long) local1415, local2775.anInt2752, local2775.anInt2753, local1350, local2775.anInt2750, local1407);
				@Pc(2803) Class90 local2803 = local339[local2204];
				this.aShortArray36[local1350] = this.method1283(local2204, local917, arg1, local2803.anInt2751, (long) local1417 + local2731, local2803.anInt2752, local2803.anInt2753, local1350, local2803.anInt2750, local941);
			} else if (local1435 == 1) {
				@Pc(2585) Class257 local2585 = local1032[local1356];
				@Pc(2633) long local2633 = (long) ((local1072 << 2) + (local2585.anInt6847 > 0 ? 1024 : 2048) + (local2585.anInt6846 + 256 << 12) + (local2585.anInt6849 + 256 << 22)) + ((long) local650 + (long) (local1419 << 24) + (long) (local1363 << 8) << 32);
				this.aShortArray39[local1350] = this.method1283(arg1.aShortArray128[local1356], local1405, arg1, local2585.anInt6846, local2633, local2585.anInt6847, 0, local1350, local2585.anInt6849, local1403);
				this.lb[local1350] = this.method1283(arg1.aShortArray127[local1356], local912, arg1, local2585.anInt6846, (long) local1415 + local2633, local2585.anInt6847, 0, local1350, local2585.anInt6849, local1407);
				this.aShortArray36[local1350] = this.method1283(arg1.aShortArray121[local1356], local917, arg1, local2585.anInt6846, (long) local1417 + local2633, local2585.anInt6847, 0, local1350, local2585.anInt6849, local941);
			}
			if (arg1.aShortArray124 == null) {
				this.aShortArray38[local1350] = -1;
			} else {
				this.aShortArray38[local1350] = arg1.aShortArray124[local1356];
			}
			if (arg1.aByteArray86 != null) {
				this.aByteArray23[local1350] = arg1.aByteArray86[local1356];
			}
			if (arg1.aShortArray126 != null) {
				this.aShortArray42[local1350] = arg1.aShortArray126[local1356];
			}
			this.aShortArray37[local1350] = arg1.aShortArray129[local1356];
		}
		if (this.anInt1478 > 0) {
			local1356 = 1;
			local1051 = this.aShortArray38[0];
			for (local1061 = 0; local1061 < this.anInt1478; local1061++) {
				@Pc(2899) short local2899 = this.aShortArray38[local1061];
				if (local2899 != local1051) {
					local1356++;
					local1051 = local2899;
				}
			}
			this.anIntArray197 = new int[local1356];
			this.anIntArray195 = new int[local1356];
			this.anIntArray200 = new int[local1356 + 1];
			this.anIntArray200[0] = 0;
			local1072 = this.anInt1509;
			local1051 = this.aShortArray38[0];
			local1356 = 0;
			@Pc(2949) short local2949 = 0;
			for (local698 = 0; local698 < this.anInt1478; local698++) {
				@Pc(2958) short local2958 = this.aShortArray38[local698];
				if (local2958 != local1051) {
					this.anIntArray197[local1356] = local1072;
					this.anIntArray195[local1356] = local2949 + 1 - local1072;
					local1356++;
					this.anIntArray200[local1356] = local698;
					local1072 = this.anInt1509;
					local2949 = 0;
					local1051 = local2958;
				}
				@Pc(2994) short local2994 = this.aShortArray39[local698];
				if (local2949 < local2994) {
					local2949 = local2994;
				}
				if (local2994 < local1072) {
					local1072 = local2994;
				}
				local2994 = this.lb[local698];
				if (local2994 < local1072) {
					local1072 = local2994;
				}
				if (local2949 < local2994) {
					local2949 = local2994;
				}
				local2994 = this.aShortArray36[local698];
				if (local2994 < local1072) {
					local1072 = local2994;
				}
				if (local2949 < local2994) {
					local2949 = local2994;
				}
			}
			this.anIntArray197[local1356] = local1072;
			this.anIntArray195[local1356] = local2949 + 1 - local1072;
			local1356++;
			this.anIntArray200[local1356] = this.anInt1478;
		}
		Static174.aLongArray2 = null;
		this.aShortArray32 = Static355.method5252(this.anInt1509, this.aShortArray32);
		this.aShortArray33 = Static355.method5252(this.anInt1509, this.aShortArray33);
		this.aShortArray40 = Static355.method5252(this.anInt1509, this.aShortArray40);
		this.aShortArray34 = Static355.method5252(this.anInt1509, this.aShortArray34);
		this.aShortArray35 = Static355.method5252(this.anInt1509, this.aShortArray35);
		this.aByteArray24 = Static514.method7260(this.aByteArray24, this.anInt1509);
		this.aFloatArray2 = Static481.method6702(this.anInt1509, this.aFloatArray2);
		this.aFloatArray3 = Static481.method6702(this.anInt1509, this.aFloatArray3);
		if (arg1.anIntArray584 != null && Static493.method7053(this.anInt1496, arg2)) {
			this.anIntArrayArray34 = arg1.method5858(false);
		}
		if (arg1.aClass253Array1 != null && Static151.method3065(this.anInt1496, arg2)) {
			this.anIntArrayArray33 = arg1.method5846();
		}
		if (arg1.anIntArray582 != null && Static360.method5416(this.anInt1496, arg2)) {
			local1356 = 0;
			local642 = new int[256];
			for (local1061 = 0; local1061 < this.anInt1528; local1061++) {
				local1072 = arg1.anIntArray582[local15[local1061]];
				if (local1072 >= 0) {
					if (local1356 < local1072) {
						local1356 = local1072;
					}
					@Pc(3216) int local3216 = local642[local1072]++;
				}
			}
			this.anIntArrayArray32 = new int[local1356 + 1][];
			for (local1072 = 0; local1072 <= local1356; local1072++) {
				this.anIntArrayArray32[local1072] = new int[local642[local1072]];
				local642[local1072] = 0;
			}
			for (local650 = 0; local650 < this.anInt1528; local650++) {
				local698 = arg1.anIntArray582[local15[local650]];
				if (local698 >= 0) {
					this.anIntArrayArray32[local698][local642[local698]++] = local650;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!ej;IIZZ)V")
	public Class9_Sub2(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1471 = 0;
		this.anInt1478 = 0;
		this.aBoolean134 = false;
		this.aBoolean135 = true;
		this.aBoolean136 = false;
		this.anInt1509 = 0;
		this.anInt1523 = 0;
		this.anInt1528 = 0;
		this.anInt1496 = arg2;
		this.aClass66_Sub1_3 = arg0;
		this.aBoolean136 = arg4;
		this.anInt1467 = arg1;
		if (arg3 || Static169.method3270(this.anInt1467, this.anInt1496)) {
			this.aClass233_4 = new Class233(Static183.method3404(this.anInt1467, this.anInt1496));
		}
		if (arg3 || Static91.method2096(this.anInt1467, this.anInt1496)) {
			this.aClass233_1 = new Class233(Static583.method7895(this.anInt1467, this.anInt1496));
		}
		if (arg3 || Static361.method5443(this.anInt1467, this.anInt1496)) {
			this.aClass233_3 = new Class233(Static515.method7276(this.anInt1496, this.anInt1467));
		}
		if (arg3 || Static379.method5833(this.anInt1496, this.anInt1467)) {
			this.aClass233_2 = new Class233(Static124.method2648(this.anInt1467, this.anInt1496));
		}
		if (arg3 || Static478.method6639(this.anInt1496, this.anInt1467)) {
			this.aClass177_1 = new Class177(Static378.method5648(this.anInt1467, this.anInt1496));
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	private void method1278() {
		if ((this.anInt1496 & 0x37) != 0) {
			if (this.aClass233_2 == null) {
				return;
			}
			this.aClass233_2.aBoolean445 = false;
		} else if (this.aClass233_3 != null) {
			this.aClass233_3.aBoolean445 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!cn", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass66_Sub1_3.anInterface3_15;
		for (@Pc(11) int local11 = 0; local11 < this.anInt1528; local11++) {
			if (this.aShortArray38[local11] == arg0) {
				this.aShortArray38[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(51) Class271 local51 = local9.method7249(arg0 & 0xFFFF);
			local39 = local51.aByte82;
			local41 = local51.aByte80;
		}
		@Pc(59) byte local59 = 0;
		@Pc(61) byte local61 = 0;
		if (arg1 != -1) {
			@Pc(72) Class271 local72 = local9.method7249(arg1 & 0xFFFF);
			local59 = local72.aByte82;
			local61 = local72.aByte80;
		}
		if (!(local41 != local61 | local39 != local59)) {
			return;
		}
		if (this.aClass186Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt1533; local101++) {
				@Pc(108) Class186 local108 = this.aClass186Array1[local101];
				@Pc(113) Class333 local113 = this.aClass333Array1[local101];
				local113.anInt9024 = Static170.anIntArray696[this.aShortArray37[local108.anInt5073] & 0xFFFF] & 0xFFFFFF | local113.anInt9024 & 0xFF000000;
			}
		}
		this.method1289();
	}

	@OriginalMember(owner = "client!cn", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean134) {
			this.method1292();
		}
		return this.anInt1520;
	}

	@OriginalMember(owner = "client!cn", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub11.anIntArray148[arg0];
		@Pc(13) int local13 = Class4_Sub11.anIntArray147[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1471; local15++) {
			local33 = this.anIntArray201[local15] * local9 + this.anIntArray198[local15] * local13 >> 14;
			this.anIntArray201[local15] = local13 * this.anIntArray201[local15] - this.anIntArray198[local15] * local9 >> 14;
			this.anIntArray198[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt1509; local33++) {
			@Pc(86) int local86 = this.aShortArray40[local33] * local13 + local9 * this.aShortArray35[local33] >> 14;
			this.aShortArray35[local33] = (short) (this.aShortArray35[local33] * local13 - this.aShortArray40[local33] * local9 >> 14);
			this.aShortArray40[local33] = (short) local86;
		}
		this.method1284();
		this.method1278();
		this.aBoolean134 = false;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "()[Lclient!efa;")
	@Override
	public Class89[] method4015() {
		return this.aClass89Array4;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!q;Lclient!ot;II)V")
	@Override
	public void method4004(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class26_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1509 == 0) {
			return;
		}
		@Pc(13) Class134_Sub1 local13 = this.aClass66_Sub1_3.aClass134_Sub1_16;
		@Pc(16) Class134_Sub1 local16 = (Class134_Sub1) arg0;
		if (!this.aBoolean134) {
			this.method1292();
		}
		Static594.aFloat205 = local13.aFloat71 + local13.aFloat75 * local16.aFloat71 + local16.aFloat77 * local13.aFloat72 + local16.aFloat67 * local13.aFloat69;
		Static454.aFloat154 = local13.aFloat72 * local16.aFloat74 + local13.aFloat69 * local16.aFloat73 + local13.aFloat75 * local16.aFloat69;
		@Pc(69) float local69 = Static594.aFloat205 + Static454.aFloat154 * (float) this.anInt1476;
		@Pc(77) float local77 = Static454.aFloat154 * (float) this.anInt1519 + Static594.aFloat205;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local94 = (float) -this.anInt1481 + local77;
			local87 = local69 + (float) this.anInt1481;
		} else {
			local87 = (float) this.anInt1481 + local77;
			local94 = (float) -this.anInt1481 + local69;
		}
		if (local94 >= this.aClass66_Sub1_3.aFloat177 || local87 <= (float) this.aClass66_Sub1_3.anInt8410) {
			return;
		}
		Static359.aFloat109 = local16.aFloat69 * local13.aFloat70 + local13.aFloat74 * local16.aFloat73 + local16.aFloat74 * local13.aFloat68;
		Static567.aFloat200 = local16.aFloat77 * local13.aFloat68 + local13.aFloat74 * local16.aFloat67 + local13.aFloat70 * local16.aFloat71 + local13.aFloat77;
		@Pc(171) float local171 = Static359.aFloat109 * (float) this.anInt1476 + Static567.aFloat200;
		@Pc(179) float local179 = Static567.aFloat200 + Static359.aFloat109 * (float) this.anInt1519;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local179 < local171) {
			local195 = ((float) -this.anInt1481 + local179) * (float) this.aClass66_Sub1_3.anInt8445;
			local206 = (local171 + (float) this.anInt1481) * (float) this.aClass66_Sub1_3.anInt8445;
		} else {
			local195 = (float) this.aClass66_Sub1_3.anInt8445 * ((float) -this.anInt1481 + local171);
			local206 = (float) this.aClass66_Sub1_3.anInt8445 * (local179 + (float) this.anInt1481);
		}
		if (local195 / (float) arg2 >= this.aClass66_Sub1_3.aFloat167 || this.aClass66_Sub1_3.aFloat181 >= local206 / (float) arg2) {
			return;
		}
		Static23.aFloat4 = local13.aFloat73 * local16.aFloat67 + local16.aFloat77 * local13.aFloat76 + local13.aFloat66 * local16.aFloat71 + local13.aFloat67;
		Static160.aFloat62 = local16.aFloat69 * local13.aFloat66 + local13.aFloat76 * local16.aFloat74 + local16.aFloat73 * local13.aFloat73;
		@Pc(298) float local298 = Static160.aFloat62 * (float) this.anInt1476 + Static23.aFloat4;
		@Pc(306) float local306 = Static23.aFloat4 + Static160.aFloat62 * (float) this.anInt1519;
		@Pc(332) float local332;
		@Pc(321) float local321;
		if (local306 < local298) {
			local321 = (local298 + (float) this.anInt1481) * (float) this.aClass66_Sub1_3.anInt8438;
			local332 = (local306 - (float) this.anInt1481) * (float) this.aClass66_Sub1_3.anInt8438;
		} else {
			local332 = (float) this.aClass66_Sub1_3.anInt8438 * ((float) -this.anInt1481 + local298);
			local321 = (local306 + (float) this.anInt1481) * (float) this.aClass66_Sub1_3.anInt8438;
		}
		if (this.aClass66_Sub1_3.aFloat175 <= local332 / (float) arg2 || local321 / (float) arg2 <= this.aClass66_Sub1_3.aFloat179) {
			return;
		}
		if (arg1 != null || this.aClass186Array1 != null) {
			Static562.aFloat199 = local13.aFloat70 * local16.aFloat72 + local13.aFloat74 * local16.aFloat76 + local16.aFloat68 * local13.aFloat68;
			Static522.aFloat191 = local13.aFloat76 * local16.aFloat70 + local13.aFloat73 * local16.aFloat66 + local13.aFloat66 * local16.aFloat75;
			Static289.aFloat99 = local16.aFloat72 * local13.aFloat75 + local16.aFloat68 * local13.aFloat72 + local13.aFloat69 * local16.aFloat76;
			Static179.aFloat64 = local16.aFloat75 * local13.aFloat70 + local16.aFloat70 * local13.aFloat68 + local13.aFloat74 * local16.aFloat66;
			Static244.aFloat94 = local16.aFloat66 * local13.aFloat69 + local13.aFloat72 * local16.aFloat70 + local13.aFloat75 * local16.aFloat75;
			Static532.aFloat193 = local16.aFloat72 * local13.aFloat66 + local13.aFloat73 * local16.aFloat76 + local13.aFloat76 * local16.aFloat68;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.anInt1498 + this.anInt1518 >> 1;
			@Pc(508) int local508 = this.anInt1520 + this.anInt1531 >> 1;
			@Pc(527) int local527 = (int) ((float) this.anInt1476 * Static359.aFloat109 + Static567.aFloat200 + Static562.aFloat199 * (float) local500 + Static179.aFloat64 * (float) local508);
			@Pc(546) int local546 = (int) (Static522.aFloat191 * (float) local508 + (float) this.anInt1476 * Static160.aFloat62 + Static23.aFloat4 + (float) local500 * Static532.aFloat193);
			@Pc(565) int local565 = (int) (Static244.aFloat94 * (float) local508 + Static594.aFloat205 + Static289.aFloat99 * (float) local500 + (float) this.anInt1476 * Static454.aFloat154);
			@Pc(584) int local584 = (int) ((float) local508 * Static179.aFloat64 + (float) local500 * Static562.aFloat199 + Static567.aFloat200 + (float) this.anInt1519 * Static359.aFloat109);
			@Pc(603) int local603 = (int) (Static522.aFloat191 * (float) local508 + Static532.aFloat193 * (float) local500 + Static23.aFloat4 + Static160.aFloat62 * (float) this.anInt1519);
			arg1.anInt6863 = this.aClass66_Sub1_3.anInt8424 + this.aClass66_Sub1_3.anInt8445 * local584 / arg2;
			arg1.anInt6866 = this.aClass66_Sub1_3.anInt8445 * local527 / arg2 + this.aClass66_Sub1_3.anInt8424;
			arg1.anInt6862 = this.aClass66_Sub1_3.anInt8438 * local603 / arg2 + this.aClass66_Sub1_3.anInt8413;
			@Pc(661) int local661 = (int) (Static244.aFloat94 * (float) local508 + (float) this.anInt1519 * Static454.aFloat154 + Static594.aFloat205 + (float) local500 * Static289.aFloat99);
			arg1.anInt6865 = local546 * this.aClass66_Sub1_3.anInt8438 / arg2 + this.aClass66_Sub1_3.anInt8413;
			if (local565 < this.aClass66_Sub1_3.anInt8410 && local661 < this.aClass66_Sub1_3.anInt8410) {
				arg1.anInt6864 = this.aClass66_Sub1_3.anInt8424 + this.aClass66_Sub1_3.anInt8445 * (this.anInt1481 + local527) / arg2 - arg1.anInt6866;
				arg1.aBoolean508 = true;
			}
		}
		this.aClass66_Sub1_3.method6960((float) arg2);
		this.aClass66_Sub1_3.method6889();
		this.aClass66_Sub1_3.method6967(local16);
		this.method1286();
		this.method1281();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!cn;IZZLclient!cn;I)Lclient!ba;")
	private Class9 method1279(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class9_Sub2 arg4) {
		arg0.anInt1533 = this.anInt1533;
		arg0.anInt1523 = this.anInt1523;
		arg0.anInt1478 = this.anInt1478;
		arg0.anInt1467 = arg1;
		arg0.aShort39 = this.aShort39;
		arg0.anInt1496 = this.anInt1496;
		arg0.anInt1509 = this.anInt1509;
		arg0.aShort38 = this.aShort38;
		arg0.anInt1528 = this.anInt1528;
		arg0.anInt1471 = this.anInt1471;
		@Pc(50) boolean local50 = Static425.method6081(this.anInt1496, arg1);
		@Pc(56) boolean local56 = Static39.method672(this.anInt1496, arg1);
		@Pc(62) boolean local62 = Static419.method6622(this.anInt1496, arg1);
		@Pc(68) boolean local68 = local56 | local50 | local62;
		@Pc(173) int local173;
		if (local68) {
			if (!local50) {
				arg0.anIntArray198 = this.anIntArray198;
			} else if (arg4.anIntArray198 == null || arg4.anIntArray198.length < this.anInt1523) {
				arg0.anIntArray198 = arg4.anIntArray198 = new int[this.anInt1523];
			} else {
				arg0.anIntArray198 = arg4.anIntArray198;
			}
			if (!local56) {
				arg0.anIntArray199 = this.anIntArray199;
			} else if (arg4.anIntArray199 == null || arg4.anIntArray199.length < this.anInt1523) {
				arg0.anIntArray199 = arg4.anIntArray199 = new int[this.anInt1523];
			} else {
				arg0.anIntArray199 = arg4.anIntArray199;
			}
			if (!local62) {
				arg0.anIntArray201 = this.anIntArray201;
			} else if (arg4.anIntArray201 == null || this.anInt1523 > arg4.anIntArray201.length) {
				arg0.anIntArray201 = arg4.anIntArray201 = new int[this.anInt1523];
			} else {
				arg0.anIntArray201 = arg4.anIntArray201;
			}
			for (local173 = 0; local173 < this.anInt1523; local173++) {
				if (local50) {
					arg0.anIntArray198[local173] = this.anIntArray198[local173];
				}
				if (local56) {
					arg0.anIntArray199[local173] = this.anIntArray199[local173];
				}
				if (local62) {
					arg0.anIntArray201[local173] = this.anIntArray201[local173];
				}
			}
		} else {
			arg0.anIntArray201 = this.anIntArray201;
			arg0.anIntArray198 = this.anIntArray198;
			arg0.anIntArray199 = this.anIntArray199;
		}
		if (Static183.method3404(arg1, this.anInt1496)) {
			arg0.aClass233_4 = arg4.aClass233_4;
			arg0.aClass233_4.anInterface4_11 = this.aClass233_4.anInterface4_11;
			arg0.aClass233_4.aBoolean445 = this.aClass233_4.aBoolean445;
			arg0.aClass233_4.aBoolean444 = true;
		} else if (Static169.method3270(arg1, this.anInt1496)) {
			arg0.aClass233_4 = this.aClass233_4;
		} else {
			arg0.aClass233_4 = null;
		}
		if (Static63.method1064(arg1, this.anInt1496)) {
			if (arg4.aShortArray37 == null || this.anInt1528 > arg4.aShortArray37.length) {
				arg0.aShortArray37 = arg4.aShortArray37 = new short[this.anInt1528];
			} else {
				arg0.aShortArray37 = arg4.aShortArray37;
			}
			for (local173 = 0; local173 < this.anInt1528; local173++) {
				arg0.aShortArray37[local173] = this.aShortArray37[local173];
			}
		} else {
			arg0.aShortArray37 = this.aShortArray37;
		}
		if (Static150.method7299(arg1, this.anInt1496)) {
			if (arg4.aByteArray23 == null || this.anInt1528 > arg4.aByteArray23.length) {
				arg0.aByteArray23 = arg4.aByteArray23 = new byte[this.anInt1528];
			} else {
				arg0.aByteArray23 = arg4.aByteArray23;
			}
			for (local173 = 0; local173 < this.anInt1528; local173++) {
				arg0.aByteArray23[local173] = this.aByteArray23[local173];
			}
		} else {
			arg0.aByteArray23 = this.aByteArray23;
		}
		if (Static515.method7276(this.anInt1496, arg1)) {
			arg0.aClass233_3 = arg4.aClass233_3;
			arg0.aClass233_3.aBoolean444 = true;
			arg0.aClass233_3.anInterface4_11 = this.aClass233_3.anInterface4_11;
			arg0.aClass233_3.aBoolean445 = this.aClass233_3.aBoolean445;
		} else if (Static361.method5443(arg1, this.anInt1496)) {
			arg0.aClass233_3 = this.aClass233_3;
		} else {
			arg0.aClass233_3 = null;
		}
		@Pc(568) int local568;
		if (Static260.method4300(this.anInt1496, arg1)) {
			if (arg4.aShortArray40 == null || arg4.aShortArray40.length < this.anInt1509) {
				local173 = this.anInt1509;
				arg0.aShortArray40 = arg4.aShortArray40 = new short[local173];
				arg0.aShortArray34 = arg4.aShortArray34 = new short[local173];
				arg0.aShortArray35 = arg4.aShortArray35 = new short[local173];
			} else {
				arg0.aShortArray35 = arg4.aShortArray35;
				arg0.aShortArray34 = arg4.aShortArray34;
				arg0.aShortArray40 = arg4.aShortArray40;
			}
			if (this.aClass279_1 == null) {
				arg0.aClass279_1 = null;
				for (local173 = 0; local173 < this.anInt1509; local173++) {
					arg0.aShortArray40[local173] = this.aShortArray40[local173];
					arg0.aShortArray34[local173] = this.aShortArray34[local173];
					arg0.aShortArray35[local173] = this.aShortArray35[local173];
				}
			} else {
				if (arg4.aClass279_1 == null) {
					arg4.aClass279_1 = new Class279();
				}
				@Pc(552) Class279 local552 = arg0.aClass279_1 = arg4.aClass279_1;
				if (local552.aShortArray136 == null || local552.aShortArray136.length < this.anInt1509) {
					local568 = this.anInt1509;
					local552.aByteArray100 = new byte[local568];
					local552.aShortArray137 = new short[local568];
					local552.aShortArray136 = new short[local568];
					local552.aShortArray135 = new short[local568];
				}
				for (local568 = 0; local568 < this.anInt1509; local568++) {
					arg0.aShortArray40[local568] = this.aShortArray40[local568];
					arg0.aShortArray34[local568] = this.aShortArray34[local568];
					arg0.aShortArray35[local568] = this.aShortArray35[local568];
					local552.aShortArray136[local568] = this.aClass279_1.aShortArray136[local568];
					local552.aShortArray137[local568] = this.aClass279_1.aShortArray137[local568];
					local552.aShortArray135[local568] = this.aClass279_1.aShortArray135[local568];
					local552.aByteArray100[local568] = this.aClass279_1.aByteArray100[local568];
				}
			}
			arg0.aByteArray24 = this.aByteArray24;
		} else {
			arg0.aByteArray24 = this.aByteArray24;
			arg0.aShortArray40 = this.aShortArray40;
			arg0.aClass279_1 = this.aClass279_1;
			arg0.aShortArray35 = this.aShortArray35;
			arg0.aShortArray34 = this.aShortArray34;
		}
		if (Static124.method2648(arg1, this.anInt1496)) {
			arg0.aClass233_2 = arg4.aClass233_2;
			arg0.aClass233_2.aBoolean445 = this.aClass233_2.aBoolean445;
			arg0.aClass233_2.anInterface4_11 = this.aClass233_2.anInterface4_11;
			arg0.aClass233_2.aBoolean444 = true;
		} else if (Static379.method5833(this.anInt1496, arg1)) {
			arg0.aClass233_2 = this.aClass233_2;
		} else {
			arg0.aClass233_2 = null;
		}
		if (Static252.method4228(arg1, this.anInt1496)) {
			if (arg4.aFloatArray2 == null || arg4.aFloatArray2.length < this.anInt1528) {
				local173 = this.anInt1509;
				arg0.aFloatArray3 = arg4.aFloatArray3 = new float[local173];
				arg0.aFloatArray2 = arg4.aFloatArray2 = new float[local173];
			} else {
				arg0.aFloatArray2 = arg4.aFloatArray2;
				arg0.aFloatArray3 = arg4.aFloatArray3;
			}
			for (local173 = 0; local173 < this.anInt1509; local173++) {
				arg0.aFloatArray2[local173] = this.aFloatArray2[local173];
				arg0.aFloatArray3[local173] = this.aFloatArray3[local173];
			}
		} else {
			arg0.aFloatArray3 = this.aFloatArray3;
			arg0.aFloatArray2 = this.aFloatArray2;
		}
		if (Static583.method7895(arg1, this.anInt1496)) {
			arg0.aClass233_1 = arg4.aClass233_1;
			arg0.aClass233_1.anInterface4_11 = this.aClass233_1.anInterface4_11;
			arg0.aClass233_1.aBoolean445 = this.aClass233_1.aBoolean445;
			arg0.aClass233_1.aBoolean444 = true;
		} else if (Static91.method2096(arg1, this.anInt1496)) {
			arg0.aClass233_1 = this.aClass233_1;
		} else {
			arg0.aClass233_1 = null;
		}
		if (Static211.method3680(this.anInt1496, arg1)) {
			if (arg4.aShortArray39 == null || arg4.aShortArray39.length < this.anInt1528) {
				local173 = this.anInt1528;
				arg0.aShortArray36 = arg4.aShortArray36 = new short[local173];
				arg0.aShortArray39 = arg4.aShortArray39 = new short[local173];
				arg0.lb = arg4.lb = new short[local173];
			} else {
				arg0.aShortArray36 = arg4.aShortArray36;
				arg0.aShortArray39 = arg4.aShortArray39;
				arg0.lb = arg4.lb;
			}
			for (local173 = 0; local173 < this.anInt1528; local173++) {
				arg0.aShortArray39[local173] = this.aShortArray39[local173];
				arg0.lb[local173] = this.lb[local173];
				arg0.aShortArray36[local173] = this.aShortArray36[local173];
			}
		} else {
			arg0.lb = this.lb;
			arg0.aShortArray39 = this.aShortArray39;
			arg0.aShortArray36 = this.aShortArray36;
		}
		if (Static378.method5648(arg1, this.anInt1496)) {
			arg0.aClass177_1 = arg4.aClass177_1;
			arg0.aClass177_1.anInterface8_7 = this.aClass177_1.anInterface8_7;
			arg0.aClass177_1.aBoolean362 = true;
			arg0.aClass177_1.aBoolean361 = this.aClass177_1.aBoolean361;
		} else if (Static478.method6639(this.anInt1496, arg1)) {
			arg0.aClass177_1 = this.aClass177_1;
		} else {
			arg0.aClass177_1 = null;
		}
		if (Static354.method5233(arg1, this.anInt1496)) {
			if (arg4.aShortArray38 == null || this.anInt1528 > arg4.aShortArray38.length) {
				local173 = this.anInt1528;
				arg0.aShortArray38 = arg4.aShortArray38 = new short[local173];
			} else {
				arg0.aShortArray38 = arg4.aShortArray38;
			}
			for (local173 = 0; local173 < this.anInt1528; local173++) {
				arg0.aShortArray38[local173] = this.aShortArray38[local173];
			}
		} else {
			arg0.aShortArray38 = this.aShortArray38;
		}
		if (!Static43.method723(this.anInt1496, arg1)) {
			arg0.aClass333Array1 = this.aClass333Array1;
		} else if (arg4.aClass333Array1 == null || arg4.aClass333Array1.length < this.anInt1533) {
			local173 = this.anInt1533;
			arg0.aClass333Array1 = arg4.aClass333Array1 = new Class333[local173];
			for (local568 = 0; local568 < this.anInt1533; local568++) {
				arg0.aClass333Array1[local568] = this.aClass333Array1[local568].method7404();
			}
		} else {
			arg0.aClass333Array1 = arg4.aClass333Array1;
			for (local173 = 0; local173 < this.anInt1533; local173++) {
				arg0.aClass333Array1[local173].method7406(this.aClass333Array1[local173]);
			}
		}
		arg0.aClass181Array4 = this.aClass181Array4;
		arg0.aShortArray33 = this.aShortArray33;
		arg0.anIntArrayArray34 = this.anIntArrayArray34;
		arg0.aShortArray41 = this.aShortArray41;
		arg0.aClass186Array1 = this.aClass186Array1;
		arg0.anIntArray196 = this.anIntArray196;
		arg0.anIntArray200 = this.anIntArray200;
		if (this.aBoolean134) {
			arg0.anInt1531 = this.anInt1531;
			arg0.anInt1476 = this.anInt1476;
			arg0.anInt1520 = this.anInt1520;
			arg0.anInt1481 = this.anInt1481;
			arg0.anInt1498 = this.anInt1498;
			arg0.anInt1519 = this.anInt1519;
			arg0.aBoolean134 = true;
			arg0.anInt1518 = this.anInt1518;
		} else {
			arg0.aBoolean134 = false;
		}
		arg0.aClass89Array4 = this.aClass89Array4;
		arg0.anIntArray197 = this.anIntArray197;
		arg0.aShortArray43 = this.aShortArray43;
		arg0.aShortArray32 = this.aShortArray32;
		arg0.anIntArray195 = this.anIntArray195;
		arg0.anIntArrayArray33 = this.anIntArrayArray33;
		arg0.anIntArrayArray32 = this.anIntArrayArray32;
		arg0.aShortArray42 = this.aShortArray42;
		return arg0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
	public void method1280() {
		if (this.aClass233_4 != null) {
			this.aClass233_4.method5030();
		}
		if (this.aClass233_1 != null) {
			this.aClass233_1.method5030();
		}
		if (this.aClass233_3 != null) {
			this.aClass233_3.method5030();
		}
		if (this.aClass233_2 != null) {
			this.aClass233_2.method5030();
		}
		if (this.aClass177_1 != null) {
			this.aClass177_1.method4112();
		}
	}

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1471; local7++) {
			if (arg0 != 128) {
				this.anIntArray198[local7] = arg0 * this.anIntArray198[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray199[local7] = this.anIntArray199[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray201[local7] = this.anIntArray201[local7] * arg2 >> 7;
			}
		}
		this.method1284();
		this.aBoolean134 = false;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
	private void method1281() {
		if (this.aClass186Array1 == null) {
			return;
		}
		@Pc(17) float local17 = this.aClass66_Sub1_3.method6874();
		@Pc(21) float local21 = this.aClass66_Sub1_3.method6974();
		this.aClass66_Sub1_3.method6857(false);
		this.aClass66_Sub1_3.method6985(false);
		this.aClass66_Sub1_3.method6923(Static19.aClass120_1, 1);
		this.aClass66_Sub1_3.method6866(Static19.aClass120_1, 1);
		for (@Pc(44) int local44 = 0; local44 < this.anInt1533; local44++) {
			@Pc(51) Class186 local51 = this.aClass186Array1[local44];
			@Pc(56) Class333 local56 = this.aClass333Array1[local44];
			if (!local51.aBoolean380 || !this.aClass66_Sub1_3.method6852()) {
				@Pc(84) float local84 = (float) (this.anIntArray198[local51.anInt5074] + this.anIntArray198[local51.anInt5070] + this.anIntArray198[local51.anInt5076]) * 0.3333333F;
				@Pc(106) float local106 = (float) (this.anIntArray199[local51.anInt5070] + this.anIntArray199[local51.anInt5076] + this.anIntArray199[local51.anInt5074]) * 0.3333333F;
				@Pc(128) float local128 = (float) (this.anIntArray201[local51.anInt5070] + this.anIntArray201[local51.anInt5076] + this.anIntArray201[local51.anInt5074]) * 0.3333333F;
				@Pc(142) float local142 = local106 * Static359.aFloat109 + local84 * Static562.aFloat199 + Static179.aFloat64 * local128 + Static567.aFloat200;
				@Pc(156) float local156 = local128 * Static522.aFloat191 + local84 * Static532.aFloat193 + Static160.aFloat62 * local106 + Static23.aFloat4;
				@Pc(170) float local170 = Static289.aFloat99 * local84 + local106 * Static454.aFloat154 + Static244.aFloat94 * local128 + Static594.aFloat205;
				@Pc(175) Class134_Sub1 local175 = this.aClass66_Sub1_3.method6919();
				local175.method3419(local142 + (float) local56.anInt9019, local56.anInt9025 * local51.aShort78 >> 7, local156 + (float) local56.anInt9021, local56.anInt9026, local170, local51.aShort77 * local56.anInt9023 >> 7);
				local175.method3396(this.aClass66_Sub1_3.aClass134_Sub1_17);
				this.aClass66_Sub1_3.method6902();
				this.aClass66_Sub1_3.ka(local21, local17 - (float) local51.anInt5072 * 1.5F);
				@Pc(230) int local230 = local56.anInt9024;
				this.aClass66_Sub1_3.method6899(false, local51.aShort76, false);
				this.aClass66_Sub1_3.method6984(local51.aByte65);
				this.aClass66_Sub1_3.method6932(local230);
				this.aClass66_Sub1_3.method6930();
			}
		}
		this.aClass66_Sub1_3.method6866(Static232.aClass120_4, 1);
		this.aClass66_Sub1_3.method6923(Static232.aClass120_4, 1);
		this.aClass66_Sub1_3.ka(local21, local17);
		this.aClass66_Sub1_3.method6857(true);
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)Z")
	private boolean method1282() {
		@Pc(13) boolean local13 = !this.aClass233_3.aBoolean445;
		@Pc(26) boolean local26 = (this.anInt1496 & 0x37) != 0 && !this.aClass233_2.aBoolean445;
		@Pc(34) boolean local34 = !this.aClass233_4.aBoolean445;
		@Pc(42) boolean local42 = !this.aClass233_1.aBoolean445;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(54) boolean local54 = true;
		@Pc(81) Interface4 local81;
		@Pc(95) Buffer local95;
		if (local34) {
			if (this.aClass233_4.anInterface4_12 == null) {
				this.aClass233_4.anInterface4_12 = this.aClass66_Sub1_3.method6931(this.aBoolean136);
			}
			local81 = this.aClass233_4.anInterface4_12;
			local81.method3559(12, this.anInt1509 * 12);
			local95 = local81.method7149();
			if (local95 == null) {
				local54 = false;
			} else {
				this.aClass66_Sub1_3.aNativeInterface3.copyPositions(this.anIntArray198, this.anIntArray199, this.anIntArray201, this.aShortArray32, 0, 12, this.anInt1509, local95.getAddress());
				if (local81.method7150()) {
					this.aClass233_4.anInterface4_11 = local81;
					this.aClass233_4.aBoolean445 = true;
				} else {
					local54 = false;
				}
			}
		}
		@Pc(219) short[] local219;
		@Pc(213) short[] local213;
		@Pc(216) short[] local216;
		@Pc(210) byte[] local210;
		if (local13) {
			if (this.aClass233_3.anInterface4_12 == null) {
				this.aClass233_3.anInterface4_12 = this.aClass66_Sub1_3.method6931(this.aBoolean136);
			}
			local81 = this.aClass233_3.anInterface4_12;
			local81.method3559(4, this.anInt1509 * 4);
			local95 = local81.method7149();
			if (local95 == null) {
				local54 = false;
			} else {
				if ((this.anInt1496 & 0x37) == 0) {
					if (this.aClass279_1 == null) {
						local210 = this.aByteArray24;
						local213 = this.aShortArray34;
						local216 = this.aShortArray35;
						local219 = this.aShortArray40;
					} else {
						local210 = this.aClass279_1.aByteArray100;
						local216 = this.aClass279_1.aShortArray135;
						local213 = this.aClass279_1.aShortArray137;
						local219 = this.aClass279_1.aShortArray136;
					}
					this.aClass66_Sub1_3.aNativeInterface3.copyLighting(this.aShortArray37, this.aByteArray23, this.aShortArray38, local219, local213, local216, local210, this.aShort39, this.aShort38, this.aShortArray33, 0, 4, this.anInt1509, local95.getAddress());
				} else {
					this.aClass66_Sub1_3.aNativeInterface3.copyColours(this.aShortArray37, this.aByteArray23, this.aShortArray38, this.aShort39, this.aShortArray33, 0, 4, this.anInt1509, local95.getAddress());
				}
				if (local81.method7150()) {
					this.aClass233_3.anInterface4_11 = local81;
					this.aClass233_3.aBoolean445 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass233_2.anInterface4_12 == null) {
				this.aClass233_2.anInterface4_12 = this.aClass66_Sub1_3.method6931(this.aBoolean136);
			}
			local81 = this.aClass233_2.anInterface4_12;
			local81.method3559(12, this.anInt1509 * 12);
			local95 = local81.method7149();
			if (local95 == null) {
				local54 = false;
			} else {
				if (this.aClass279_1 == null) {
					local216 = this.aShortArray35;
					local210 = this.aByteArray24;
					local213 = this.aShortArray34;
					local219 = this.aShortArray40;
				} else {
					local213 = this.aClass279_1.aShortArray137;
					local216 = this.aClass279_1.aShortArray135;
					local219 = this.aClass279_1.aShortArray136;
					local210 = this.aClass279_1.aByteArray100;
				}
				this.aClass66_Sub1_3.aNativeInterface3.copyNormals(local219, local213, local216, local210, 3.0F / (float) this.aShort38, 3.0F / (float) (this.aShort38 / 2 + this.aShort38), 0, 12, this.anInt1509, local95.getAddress());
				if (local81.method7150()) {
					this.aClass233_2.anInterface4_11 = local81;
					this.aClass233_2.aBoolean445 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass233_1.anInterface4_12 == null) {
				this.aClass233_1.anInterface4_12 = this.aClass66_Sub1_3.method6931(this.aBoolean136);
			}
			local81 = this.aClass233_1.anInterface4_12;
			local81.method3559(8, this.anInt1509 * 8);
			local95 = local81.method7149();
			if (local95 == null) {
				local54 = false;
			} else {
				this.aClass66_Sub1_3.aNativeInterface3.copyTexCoords(this.aFloatArray2, this.aFloatArray3, 0, 8, this.anInt1509, local95.getAddress());
				if (local81.method7150()) {
					this.aClass233_1.anInterface4_11 = local81;
					this.aClass233_1.aBoolean445 = true;
				} else {
					local54 = false;
				}
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort39;
	}

	@OriginalMember(owner = "client!cn", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		if (this.aClass233_4 != null) {
			this.aClass233_4.aBoolean444 = Static183.method3404(arg0, this.anInt1496);
		}
		if (this.aClass233_1 != null) {
			this.aClass233_1.aBoolean444 = Static583.method7895(arg0, this.anInt1496);
		}
		if (this.aClass233_3 != null) {
			this.aClass233_3.aBoolean444 = Static515.method7276(this.anInt1496, arg0);
		}
		if (this.aClass233_2 != null) {
			this.aClass233_2.aBoolean444 = Static124.method2648(arg0, this.anInt1496);
		}
		this.anInt1467 = arg0;
		this.aBoolean135 = true;
		if (this.aClass279_1 != null && (this.anInt1467 & 0x10000) == 0) {
			this.aShortArray35 = this.aClass279_1.aShortArray135;
			this.aByteArray24 = this.aClass279_1.aByteArray100;
			this.aShortArray40 = this.aClass279_1.aShortArray136;
			this.aShortArray34 = this.aClass279_1.aShortArray137;
			this.aClass279_1 = null;
		}
		this.method1290();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IFILclient!pf;IJIIIIF)S")
	private short method1283(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class266 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(10) int local10 = this.anIntArray196[arg0];
		@Pc(17) int local17 = this.anIntArray196[arg0 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray43[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg4 == Static174.aLongArray2[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray43[local19] = (short) (this.anInt1509 + 1);
		Static174.aLongArray2[local19] = arg4;
		this.aShortArray33[this.anInt1509] = (short) arg7;
		this.aShortArray32[this.anInt1509] = (short) arg0;
		this.aShortArray40[this.anInt1509] = (short) arg5;
		this.aShortArray34[this.anInt1509] = (short) arg3;
		this.aShortArray35[this.anInt1509] = (short) arg8;
		this.aByteArray24[this.anInt1509] = (byte) arg6;
		this.aFloatArray2[this.anInt1509] = arg9;
		this.aFloatArray3[this.anInt1509] = arg1;
		return (short) this.anInt1509++;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V")
	private void method1284() {
		if (this.aClass233_4 != null) {
			this.aClass233_4.aBoolean445 = false;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BIIIIIIII)Z")
	private boolean method1285(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg7 && arg1 > arg3 && arg0 > arg3) {
			return false;
		} else if (arg7 < arg3 && arg1 < arg3 && arg0 < arg3) {
			return false;
		} else if (arg4 > arg2 && arg2 < arg6 && arg2 < arg5) {
			return false;
		} else {
			return arg4 >= arg2 || arg2 <= arg6 || arg2 <= arg5;
		}
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V")
	private void method1286() {
		if (this.anInt1478 == 0) {
			return;
		}
		if (this.method1282() && this.method1291()) {
			this.aClass66_Sub1_3.method6941(this.aClass233_4.anInterface4_11, 0);
			this.aClass66_Sub1_3.method6941(this.aClass233_3.anInterface4_11, 1);
			this.aClass66_Sub1_3.method6941(this.aClass233_1.anInterface4_11, 2);
			@Pc(56) boolean local56;
			if ((this.anInt1496 & 0x37) == 0) {
				local56 = false;
				this.aClass66_Sub1_3.method6985(false);
				this.aClass66_Sub1_3.method6890(this.aClass66_Sub1_3.aClass321_20);
			} else {
				local56 = true;
				this.aClass66_Sub1_3.method6985(true);
				this.aClass66_Sub1_3.method6941(this.aClass233_2.anInterface4_11, 3);
				this.aClass66_Sub1_3.method6890(this.aClass66_Sub1_3.aClass321_15);
			}
			for (@Pc(94) int local94 = 0; local94 < this.anIntArray197.length; local94++) {
				@Pc(101) int local101 = this.anIntArray200[local94];
				@Pc(108) int local108 = this.anIntArray200[local94 + 1];
				@Pc(115) int local115 = this.aShortArray38[local101] & 0xFFFF;
				if (local115 == 65535) {
					local115 = -1;
				}
				this.aClass66_Sub1_3.method6899(true, local115, local56);
				this.aClass66_Sub1_3.method6917(this.anIntArray197[local94], Static453.aClass247_5, this.aClass177_1.anInterface8_7, local101 * 3, this.anIntArray195[local94], local108 - local101);
			}
		}
		this.method1290();
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "()Z")
	@Override
	public boolean method4018() {
		if (this.aShortArray38 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray38.length; local12++) {
			if (this.aShortArray38[local12] != -1 && !this.aClass66_Sub1_3.anInterface3_15.method7248(this.aShortArray38[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method4010(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class9_Sub2 local8 = (Class9_Sub2) arg0;
		if (this.anInt1528 == 0 || local8.anInt1528 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt1471;
		@Pc(21) int[] local21 = local8.anIntArray198;
		@Pc(24) int[] local24 = local8.anIntArray199;
		@Pc(27) int[] local27 = local8.anIntArray201;
		@Pc(30) short[] local30 = local8.aShortArray40;
		@Pc(33) short[] local33 = local8.aShortArray34;
		@Pc(36) short[] local36 = local8.aShortArray35;
		@Pc(39) byte[] local39 = local8.aByteArray24;
		@Pc(50) short[] local50;
		@Pc(46) short[] local46;
		@Pc(48) short[] local48;
		@Pc(44) byte[] local44;
		if (this.aClass279_1 == null) {
			local44 = null;
			local46 = null;
			local48 = null;
			local50 = null;
		} else {
			local44 = this.aClass279_1.aByteArray100;
			local46 = this.aClass279_1.aShortArray137;
			local48 = this.aClass279_1.aShortArray135;
			local50 = this.aClass279_1.aShortArray136;
		}
		@Pc(83) short[] local83;
		@Pc(87) short[] local87;
		@Pc(79) short[] local79;
		@Pc(75) byte[] local75;
		if (local8.aClass279_1 == null) {
			local83 = null;
			local79 = null;
			local87 = null;
			local75 = null;
		} else {
			local75 = local8.aClass279_1.aByteArray100;
			local79 = local8.aClass279_1.aShortArray135;
			local83 = local8.aClass279_1.aShortArray136;
			local87 = local8.aClass279_1.aShortArray137;
		}
		@Pc(100) int[] local100 = local8.anIntArray196;
		@Pc(103) short[] local103 = local8.aShortArray43;
		if (!local8.aBoolean134) {
			local8.method1292();
		}
		@Pc(112) int local112 = local8.anInt1476;
		@Pc(115) int local115 = local8.anInt1519;
		@Pc(118) int local118 = local8.anInt1518;
		@Pc(121) int local121 = local8.anInt1498;
		@Pc(124) int local124 = local8.anInt1520;
		@Pc(127) int local127 = local8.anInt1531;
		for (@Pc(129) int local129 = 0; local129 < this.anInt1471; local129++) {
			@Pc(139) int local139 = this.anIntArray199[local129] - arg2;
			if (local112 <= local139 && local115 >= local139) {
				@Pc(155) int local155 = this.anIntArray198[local129] - arg1;
				if (local118 <= local155 && local121 >= local155) {
					@Pc(171) int local171 = this.anIntArray201[local129] - arg3;
					if (local171 >= local124 && local171 <= local127) {
						@Pc(181) int local181 = -1;
						@Pc(186) int local186 = this.anIntArray196[local129];
						@Pc(193) int local193 = this.anIntArray196[local129 + 1];
						for (@Pc(195) int local195 = local186; local195 < local193; local195++) {
							local181 = this.aShortArray43[local195] - 1;
							if (local181 == -1 || this.aByteArray24[local181] != 0) {
								break;
							}
						}
						if (local181 != -1) {
							for (@Pc(230) int local230 = 0; local230 < local18; local230++) {
								if (local155 == local21[local230] && local171 == local27[local230] && local139 == local24[local230]) {
									local193 = local100[local230 + 1];
									@Pc(255) int local255 = -1;
									local186 = local100[local230];
									for (@Pc(261) int local261 = local186; local261 < local193; local261++) {
										local255 = local103[local261] - 1;
										if (local255 == -1 || local39[local255] != 0) {
											break;
										}
									}
									if (local255 != -1) {
										if (local50 == null) {
											this.aClass279_1 = new Class279();
											local50 = this.aClass279_1.aShortArray136 = Static580.method2380(this.aShortArray40);
											local46 = this.aClass279_1.aShortArray137 = Static580.method2380(this.aShortArray34);
											local48 = this.aClass279_1.aShortArray135 = Static580.method2380(this.aShortArray35);
											local44 = this.aClass279_1.aByteArray100 = Static496.method7066(this.aByteArray24);
										}
										if (local83 == null) {
											@Pc(341) Class279 local341 = local8.aClass279_1 = new Class279();
											local83 = local341.aShortArray136 = Static580.method2380(local30);
											local87 = local341.aShortArray137 = Static580.method2380(local33);
											local79 = local341.aShortArray135 = Static580.method2380(local36);
											local75 = local341.aByteArray100 = Static496.method7066(local39);
										}
										@Pc(374) short local374 = this.aShortArray40[local181];
										@Pc(379) short local379 = this.aShortArray34[local181];
										@Pc(384) short local384 = this.aShortArray35[local181];
										local193 = local100[local230 + 1];
										@Pc(395) byte local395 = this.aByteArray24[local181];
										local186 = local100[local230];
										@Pc(409) int local409;
										for (@Pc(401) int local401 = local186; local401 < local193; local401++) {
											local409 = local103[local401] - 1;
											if (local409 == -1) {
												break;
											}
											if (local75[local409] != 0) {
												local83[local409] += local374;
												local87[local409] += local379;
												local79[local409] += local384;
												local75[local409] += local395;
											}
										}
										local395 = local39[local255];
										local186 = this.anIntArray196[local129];
										local374 = local30[local255];
										local379 = local33[local255];
										local193 = this.anIntArray196[local129 + 1];
										local384 = local36[local255];
										for (local409 = local186; local409 < local193; local409++) {
											@Pc(492) int local492 = this.aShortArray43[local409] - 1;
											if (local492 == -1) {
												break;
											}
											if (local44[local492] != 0) {
												local50[local492] += local374;
												local46[local492] += local379;
												local48[local492] += local384;
												local44[local492] += local395;
											}
										}
										local8.method1278();
										this.method1278();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!df;B)V")
	private void method1287(@OriginalArg(0) Class4_Sub7_Sub3_Sub1 arg0) {
		if (Static508.anIntArray670.length < this.anInt1509) {
			Static218.anIntArray401 = new int[this.anInt1509];
			Static508.anIntArray670 = new int[this.anInt1509];
		}
		@Pc(47) int local47;
		@Pc(85) int local85;
		@Pc(94) int local94;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1471; local20++) {
			local47 = (this.anIntArray198[local20] - (this.aClass66_Sub1_3.anInt8420 * this.anIntArray199[local20] >> 8) >> this.aClass66_Sub1_3.anInt8437) - arg0.anInt2319;
			@Pc(71) int local71 = (this.anIntArray201[local20] - (this.aClass66_Sub1_3.anInt8440 * this.anIntArray199[local20] >> 8) >> this.aClass66_Sub1_3.anInt8437) - arg0.anInt2322;
			@Pc(76) int local76 = this.anIntArray196[local20];
			@Pc(83) int local83 = this.anIntArray196[local20 + 1];
			for (local85 = local76; local85 < local83; local85++) {
				local94 = this.aShortArray43[local85] - 1;
				if (local94 == -1) {
					break;
				}
				Static508.anIntArray670[local94] = local47;
				Static218.anIntArray401[local94] = local71;
			}
		}
		for (local47 = 0; local47 < this.anInt1478; local47++) {
			if (this.aByteArray23 == null || this.aByteArray23[local47] <= 128) {
				@Pc(137) short local137 = this.aShortArray39[local47];
				@Pc(142) short local142 = this.lb[local47];
				@Pc(147) short local147 = this.aShortArray36[local47];
				local85 = Static508.anIntArray670[local137];
				local94 = Static508.anIntArray670[local142];
				@Pc(159) int local159 = Static508.anIntArray670[local147];
				@Pc(163) int local163 = Static218.anIntArray401[local137];
				@Pc(167) int local167 = Static218.anIntArray401[local142];
				@Pc(171) int local171 = Static218.anIntArray401[local147];
				if (-((local159 - local94) * (-local163 + local167)) + (local167 - local171) * (local85 - local94) > 0) {
					arg0.method2091(local163, local85, local159, local167, local94, local171);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub11.anIntArray148[arg0];
		@Pc(13) int local13 = Class4_Sub11.anIntArray147[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1471; local15++) {
			@Pc(33) int local33 = this.anIntArray198[local15] * local13 + this.anIntArray201[local15] * local9 >> 14;
			this.anIntArray201[local15] = this.anIntArray201[local15] * local13 - local9 * this.anIntArray198[local15] >> 14;
			this.anIntArray198[local15] = local33;
		}
		this.method1284();
		this.aBoolean134 = false;
	}

	@OriginalMember(owner = "client!cn", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean134) {
			this.method1292();
		}
		return this.anInt1518;
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "()[Lclient!jt;")
	@Override
	public Class181[] method4019() {
		return this.aClass181Array4;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!q;Lclient!ot;I)V")
	@Override
	public void method4023(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class26_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1509 == 0) {
			return;
		}
		@Pc(13) Class134_Sub1 local13 = this.aClass66_Sub1_3.aClass134_Sub1_16;
		@Pc(16) Class134_Sub1 local16 = (Class134_Sub1) arg0;
		if (!this.aBoolean134) {
			this.method1292();
		}
		Static454.aFloat154 = local13.aFloat69 * local16.aFloat73 + local16.aFloat74 * local13.aFloat72 + local16.aFloat69 * local13.aFloat75;
		Static594.aFloat205 = local16.aFloat67 * local13.aFloat69 + local16.aFloat77 * local13.aFloat72 + local13.aFloat75 * local16.aFloat71 + local13.aFloat71;
		@Pc(69) float local69 = Static594.aFloat205 + Static454.aFloat154 * (float) this.anInt1476;
		@Pc(77) float local77 = Static594.aFloat205 + (float) this.anInt1519 * Static454.aFloat154;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local69 > local77) {
			local87 = local77 - (float) this.anInt1481;
			local93 = (float) this.anInt1481 + local69;
		} else {
			local93 = local77 + (float) this.anInt1481;
			local87 = local69 - (float) this.anInt1481;
		}
		if (this.aClass66_Sub1_3.aFloat182 <= local87 || (float) this.aClass66_Sub1_3.anInt8410 >= local93) {
			return;
		}
		Static359.aFloat109 = local13.aFloat68 * local16.aFloat74 + local13.aFloat74 * local16.aFloat73 + local13.aFloat70 * local16.aFloat69;
		Static567.aFloat200 = local13.aFloat77 + local16.aFloat67 * local13.aFloat74 + local16.aFloat77 * local13.aFloat68 + local13.aFloat70 * local16.aFloat71;
		@Pc(169) float local169 = Static359.aFloat109 * (float) this.anInt1476 + Static567.aFloat200;
		@Pc(177) float local177 = Static567.aFloat200 + (float) this.anInt1519 * Static359.aFloat109;
		@Pc(192) float local192;
		@Pc(203) float local203;
		if (local177 < local169) {
			local192 = (float) this.aClass66_Sub1_3.anInt8445 * (local177 - (float) this.anInt1481);
			local203 = (local169 + (float) this.anInt1481) * (float) this.aClass66_Sub1_3.anInt8445;
		} else {
			local192 = (local169 - (float) this.anInt1481) * (float) this.aClass66_Sub1_3.anInt8445;
			local203 = (float) this.aClass66_Sub1_3.anInt8445 * ((float) this.anInt1481 + local177);
		}
		if (local192 / local93 >= this.aClass66_Sub1_3.aFloat167 || local203 / local93 <= this.aClass66_Sub1_3.aFloat181) {
			return;
		}
		Static160.aFloat62 = local13.aFloat66 * local16.aFloat69 + local16.aFloat73 * local13.aFloat73 + local16.aFloat74 * local13.aFloat76;
		Static23.aFloat4 = local13.aFloat67 + local13.aFloat73 * local16.aFloat67 + local13.aFloat76 * local16.aFloat77 + local13.aFloat66 * local16.aFloat71;
		@Pc(292) float local292 = Static23.aFloat4 + Static160.aFloat62 * (float) this.anInt1476;
		@Pc(300) float local300 = (float) this.anInt1519 * Static160.aFloat62 + Static23.aFloat4;
		@Pc(327) float local327;
		@Pc(315) float local315;
		if (local292 > local300) {
			local315 = (local292 + (float) this.anInt1481) * (float) this.aClass66_Sub1_3.anInt8438;
			local327 = (float) this.aClass66_Sub1_3.anInt8438 * ((float) -this.anInt1481 + local300);
		} else {
			local315 = ((float) this.anInt1481 + local300) * (float) this.aClass66_Sub1_3.anInt8438;
			local327 = (float) this.aClass66_Sub1_3.anInt8438 * ((float) -this.anInt1481 + local292);
		}
		if (local327 / local93 >= this.aClass66_Sub1_3.aFloat175 || this.aClass66_Sub1_3.aFloat179 >= local315 / local93) {
			return;
		}
		if (arg1 != null || this.aClass186Array1 != null) {
			Static289.aFloat99 = local16.aFloat72 * local13.aFloat75 + local16.aFloat76 * local13.aFloat69 + local13.aFloat72 * local16.aFloat68;
			Static522.aFloat191 = local13.aFloat66 * local16.aFloat75 + local13.aFloat73 * local16.aFloat66 + local16.aFloat70 * local13.aFloat76;
			Static562.aFloat199 = local16.aFloat72 * local13.aFloat70 + local13.aFloat68 * local16.aFloat68 + local16.aFloat76 * local13.aFloat74;
			Static532.aFloat193 = local13.aFloat73 * local16.aFloat76 + local13.aFloat76 * local16.aFloat68 + local16.aFloat72 * local13.aFloat66;
			Static179.aFloat64 = local16.aFloat66 * local13.aFloat74 + local13.aFloat68 * local16.aFloat70 + local13.aFloat70 * local16.aFloat75;
			Static244.aFloat94 = local16.aFloat70 * local13.aFloat72 + local16.aFloat66 * local13.aFloat69 + local16.aFloat75 * local13.aFloat75;
		}
		if (arg1 != null) {
			@Pc(487) boolean local487 = false;
			@Pc(489) boolean local489 = true;
			@Pc(498) int local498 = this.anInt1518 + this.anInt1498 >> 1;
			@Pc(506) int local506 = this.anInt1531 + this.anInt1520 >> 1;
			@Pc(525) int local525 = (int) ((float) local506 * Static179.aFloat64 + (float) this.anInt1476 * Static359.aFloat109 + Static567.aFloat200 + Static562.aFloat199 * (float) local498);
			@Pc(544) int local544 = (int) (Static522.aFloat191 * (float) local506 + (float) this.anInt1476 * Static160.aFloat62 + Static23.aFloat4 + (float) local498 * Static532.aFloat193);
			@Pc(563) int local563 = (int) (Static454.aFloat154 * (float) this.anInt1476 + (float) local498 * Static289.aFloat99 + Static594.aFloat205 + (float) local506 * Static244.aFloat94);
			if (local563 >= this.aClass66_Sub1_3.anInt8410) {
				arg1.anInt6865 = this.aClass66_Sub1_3.anInt8413 + local544 * this.aClass66_Sub1_3.anInt8438 / local563;
				arg1.anInt6866 = local525 * this.aClass66_Sub1_3.anInt8445 / local563 + this.aClass66_Sub1_3.anInt8424;
			} else {
				local487 = true;
			}
			@Pc(622) int local622 = (int) (Static359.aFloat109 * (float) this.anInt1519 + (float) local498 * Static562.aFloat199 + Static567.aFloat200 + (float) local506 * Static179.aFloat64);
			@Pc(641) int local641 = (int) (Static522.aFloat191 * (float) local506 + Static23.aFloat4 + Static532.aFloat193 * (float) local498 + Static160.aFloat62 * (float) this.anInt1519);
			@Pc(660) int local660 = (int) ((float) this.anInt1519 * Static454.aFloat154 + Static594.aFloat205 + (float) local498 * Static289.aFloat99 + Static244.aFloat94 * (float) local506);
			if (this.aClass66_Sub1_3.anInt8410 <= local660) {
				arg1.anInt6863 = this.aClass66_Sub1_3.anInt8424 + local622 * this.aClass66_Sub1_3.anInt8445 / local660;
				arg1.anInt6862 = this.aClass66_Sub1_3.anInt8438 * local641 / local660 + this.aClass66_Sub1_3.anInt8413;
			} else {
				local487 = true;
			}
			if (local487) {
				if (local563 < this.aClass66_Sub1_3.anInt8410 && this.aClass66_Sub1_3.anInt8410 > local660) {
					local489 = false;
				} else {
					@Pc(747) int local747;
					@Pc(758) int local758;
					@Pc(770) int local770;
					if (local563 < this.aClass66_Sub1_3.anInt8410) {
						local747 = (local660 - this.aClass66_Sub1_3.anInt8410 << 16) / (local660 - local563);
						local758 = (local747 * (local622 - local525) >> 16) + local622;
						arg1.anInt6866 = this.aClass66_Sub1_3.anInt8445 * local758 / this.aClass66_Sub1_3.anInt8410 + this.aClass66_Sub1_3.anInt8424;
						local770 = local641 + ((local641 - local544) * local747 >> 16);
						arg1.anInt6865 = this.aClass66_Sub1_3.anInt8413 + local770 * this.aClass66_Sub1_3.anInt8438 / this.aClass66_Sub1_3.anInt8410;
					} else if (this.aClass66_Sub1_3.anInt8410 > local660) {
						local747 = (local563 - this.aClass66_Sub1_3.anInt8410 << 16) / (local563 - local660);
						local758 = ((local525 - local622) * local747 >> 16) + local525;
						local770 = local544 + ((local544 - local641) * local747 >> 16);
						arg1.anInt6866 = this.aClass66_Sub1_3.anInt8424 + this.aClass66_Sub1_3.anInt8445 * local758 / this.aClass66_Sub1_3.anInt8410;
						arg1.anInt6865 = this.aClass66_Sub1_3.anInt8438 * local770 / this.aClass66_Sub1_3.anInt8410 + this.aClass66_Sub1_3.anInt8413;
					}
				}
			}
			if (local489) {
				arg1.aBoolean508 = true;
				if (local660 < local563) {
					arg1.anInt6864 = this.aClass66_Sub1_3.anInt8424 + (local525 - -this.anInt1481) * this.aClass66_Sub1_3.anInt8445 / local563 - arg1.anInt6866;
				} else {
					arg1.anInt6864 = this.aClass66_Sub1_3.anInt8424 + (local622 + this.anInt1481) * this.aClass66_Sub1_3.anInt8445 / local660 - arg1.anInt6863;
				}
			}
		}
		this.aClass66_Sub1_3.method6980();
		this.aClass66_Sub1_3.method6967(local16);
		this.method1286();
		this.method1281();
	}

	@OriginalMember(owner = "client!cn", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean134) {
			this.method1292();
		}
		return this.anInt1498;
	}

	@OriginalMember(owner = "client!cn", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1471; local3++) {
			this.anIntArray201[local3] = -this.anIntArray201[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt1509; local29++) {
			this.aShortArray35[local29] = (short) -this.aShortArray35[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt1528; local48++) {
			@Pc(55) short local55 = this.aShortArray39[local48];
			this.aShortArray39[local48] = this.aShortArray36[local48];
			this.aShortArray36[local48] = local55;
		}
		this.method1284();
		this.method1278();
		this.method1288();
		this.aBoolean134 = false;
	}

	@OriginalMember(owner = "client!cn", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean134) {
			this.method1292();
		}
		@Pc(16) int local16 = this.anInt1518 + arg4;
		@Pc(21) int local21 = this.anInt1498 + arg4;
		@Pc(27) int local27 = arg6 + this.anInt1520;
		@Pc(33) int local33 = arg6 + this.anInt1531;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9838 <= local21 + arg2.anInt9841 >> arg2.anInt9837 || local27 < 0 || arg2.anInt9839 <= local33 + arg2.anInt9841 >> arg2.anInt9837)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9838 <= local21 + arg3.anInt9841 >> arg3.anInt9837 || local27 < 0 || arg3.anInt9841 + local33 >> arg3.anInt9837 >= arg3.anInt9839) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9837;
			local21 = local21 + arg2.anInt9841 - 1 >> arg2.anInt9837;
			local27 >>= arg2.anInt9837;
			local33 = arg2.anInt9841 + local33 - 1 >> arg2.anInt9837;
			if (arg2.JA(local16, local27) == arg5 && arg5 == arg2.JA(local21, local27) && arg5 == arg2.JA(local16, local33) && arg5 == arg2.JA(local21, local33)) {
				return;
			}
		}
		@Pc(210) int local210;
		if (arg0 == 1) {
			for (local210 = 0; local210 < this.anInt1471; local210++) {
				this.anIntArray199[local210] = this.anIntArray199[local210] + arg2.sa(this.anIntArray198[local210] + arg4, this.anIntArray201[local210] - -arg6) - arg5;
			}
		} else {
			@Pc(218) int local218;
			@Pc(226) int local226;
			if (arg0 == 2) {
				local210 = this.anInt1476;
				if (local210 == 0) {
					return;
				}
				for (local218 = 0; local218 < this.anInt1471; local218++) {
					local226 = (this.anIntArray199[local218] << 16) / local210;
					if (arg1 > local226) {
						this.anIntArray199[local218] += (arg2.sa(this.anIntArray198[local218] + arg4, arg6 + this.anIntArray201[local218]) - arg5) * (arg1 + -local226) / arg1;
					}
				}
			} else {
				@Pc(234) int local234;
				if (arg0 == 3) {
					local210 = (arg1 & 0xFF) * 4;
					local218 = (arg1 >> 8 & 0xFF) * 4;
					local226 = (arg1 >> 16 & 0xFF) << 6;
					local234 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local210 >> 1) < 0 || arg2.anInt9838 << arg2.anInt9837 <= arg2.anInt9841 + (local210 >> 1) + arg4 || arg6 - (local218 >> 1) < 0 || (local218 >> 1) + (arg6 + arg2.anInt9841) >= arg2.anInt9839 << arg2.anInt9837) {
						return;
					}
					this.method4003(local218, local210, arg6, arg2, arg5, local234, local226, arg4);
				} else if (arg0 == 4) {
					local210 = this.anInt1519 - this.anInt1476;
					for (local218 = 0; local218 < this.anInt1471; local218++) {
						this.anIntArray199[local218] = local210 + this.anIntArray199[local218] + arg3.sa(arg4 + this.anIntArray198[local218], arg6 + this.anIntArray201[local218]) - arg5;
					}
				} else if (arg0 == 5) {
					local210 = this.anInt1519 - this.anInt1476;
					for (local218 = 0; local218 < this.anInt1471; local218++) {
						local226 = this.anIntArray198[local218] + arg4;
						local234 = arg6 + this.anIntArray201[local218];
						@Pc(333) int local333 = arg2.sa(local226, local234);
						@Pc(338) int local338 = arg3.sa(local226, local234);
						@Pc(343) int local343 = local333 - local338;
						this.anIntArray199[local218] = local333 + (local343 * ((this.anIntArray199[local218] << 8) / local210) >> 8) - arg5;
					}
				}
			}
		}
		this.method1284();
		this.aBoolean134 = false;
	}

	@OriginalMember(owner = "client!cn", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean134) {
			this.method1292();
		}
		return this.anInt1531;
	}

	@OriginalMember(owner = "client!cn", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static238.anInt8689 = 0;
			Static443.anInt7576 = 0;
			local13 = 0;
			Static416.anInt7185 = 0;
			for (local17 = 0; local17 < this.anInt1471; local17++) {
				Static443.anInt7576 += this.anIntArray198[local17];
				Static416.anInt7185 += this.anIntArray199[local17];
				local13++;
				Static238.anInt8689 += this.anIntArray201[local17];
			}
			if (local13 > 0) {
				Static238.anInt8689 = arg3 + Static238.anInt8689 / local13;
				Static416.anInt7185 = arg2 + Static416.anInt7185 / local13;
				Static443.anInt7576 = Static443.anInt7576 / local13 + arg1;
			} else {
				Static443.anInt7576 = arg1;
				Static238.anInt8689 = arg3;
				Static416.anInt7185 = arg2;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt1471; local13++) {
				this.anIntArray198[local13] += arg1;
				this.anIntArray199[local13] += arg2;
				this.anIntArray201[local13] += arg3;
			}
		} else {
			@Pc(162) int local162;
			@Pc(180) int local180;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt1471; local13++) {
					this.anIntArray198[local13] -= Static443.anInt7576;
					this.anIntArray199[local13] -= Static416.anInt7185;
					this.anIntArray201[local13] -= Static238.anInt8689;
					if (arg3 != 0) {
						local17 = Class4_Sub11.anIntArray148[arg3];
						local162 = Class4_Sub11.anIntArray147[arg3];
						local180 = local162 * this.anIntArray198[local13] + this.anIntArray199[local13] * local17 + 16383 >> 14;
						this.anIntArray199[local13] = local162 * this.anIntArray199[local13] + 16383 - this.anIntArray198[local13] * local17 >> 14;
						this.anIntArray198[local13] = local180;
					}
					if (arg1 != 0) {
						local17 = Class4_Sub11.anIntArray148[arg1];
						local162 = Class4_Sub11.anIntArray147[arg1];
						local180 = this.anIntArray199[local13] * local162 + 16383 - this.anIntArray201[local13] * local17 >> 14;
						this.anIntArray201[local13] = local162 * this.anIntArray201[local13] + local17 * this.anIntArray199[local13] + 16383 >> 14;
						this.anIntArray199[local13] = local180;
					}
					if (arg2 != 0) {
						local17 = Class4_Sub11.anIntArray148[arg2];
						local162 = Class4_Sub11.anIntArray147[arg2];
						local180 = this.anIntArray198[local13] * local162 + local17 * this.anIntArray201[local13] + 16383 >> 14;
						this.anIntArray201[local13] = local162 * this.anIntArray201[local13] + 16383 - local17 * this.anIntArray198[local13] >> 14;
						this.anIntArray198[local13] = local180;
					}
					this.anIntArray198[local13] += Static443.anInt7576;
					this.anIntArray199[local13] += Static416.anInt7185;
					this.anIntArray201[local13] += Static238.anInt8689;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt1471; local13++) {
					this.anIntArray198[local13] -= Static443.anInt7576;
					this.anIntArray199[local13] -= Static416.anInt7185;
					this.anIntArray201[local13] -= Static238.anInt8689;
					this.anIntArray198[local13] = this.anIntArray198[local13] * arg1 / 128;
					this.anIntArray199[local13] = this.anIntArray199[local13] * arg2 / 128;
					this.anIntArray201[local13] = arg3 * this.anIntArray201[local13] / 128;
					this.anIntArray198[local13] += Static443.anInt7576;
					this.anIntArray199[local13] += Static416.anInt7185;
					this.anIntArray201[local13] += Static238.anInt8689;
				}
			} else {
				@Pc(512) Class186 local512;
				@Pc(517) Class333 local517;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt1528; local13++) {
						local17 = arg1 * 8 + (this.aByteArray23[local13] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray23[local13] = (byte) local17;
					}
					if (this.aClass186Array1 != null) {
						for (local17 = 0; local17 < this.anInt1533; local17++) {
							local512 = this.aClass186Array1[local17];
							local517 = this.aClass333Array1[local17];
							local517.anInt9024 = local517.anInt9024 & 0xFFFFFF | 255 - (this.aByteArray23[local512.anInt5073] & 0xFF) << 24;
						}
					}
					this.method1289();
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt1528; local13++) {
						local17 = this.aShortArray37[local13] & 0xFFFF;
						local162 = local17 >> 10 & 0x3F;
						local180 = local17 >> 7 & 0x7;
						local180 += arg2 / 4;
						@Pc(583) int local583 = local162 + arg1 & 0x3F;
						@Pc(587) int local587 = local17 & 0x7F;
						local587 += arg3;
						if (local180 < 0) {
							local180 = 0;
						} else if (local180 > 7) {
							local180 = 7;
						}
						if (local587 < 0) {
							local587 = 0;
						} else if (local587 > 127) {
							local587 = 127;
						}
						this.aShortArray37[local13] = (short) (local180 << 7 | local583 << 10 | local587);
					}
					if (this.aClass186Array1 != null) {
						for (local17 = 0; local17 < this.anInt1533; local17++) {
							local512 = this.aClass186Array1[local17];
							local517 = this.aClass333Array1[local17];
							local517.anInt9024 = local517.anInt9024 & 0xFF000000 | Static170.anIntArray696[this.aShortArray37[local512.anInt5073] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method1289();
				} else {
					@Pc(703) Class333 local703;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt1533; local13++) {
							local703 = this.aClass333Array1[local13];
							local703.anInt9021 += arg2;
							local703.anInt9019 += arg1;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt1533; local13++) {
							local703 = this.aClass333Array1[local13];
							local703.anInt9025 = arg1 * local703.anInt9025 >> 7;
							local703.anInt9023 = local703.anInt9023 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt1533; local13++) {
							local703 = this.aClass333Array1[local13];
							local703.anInt9026 = arg1 + local703.anInt9026 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean134) {
			this.method1292();
		}
		return this.anInt1519;
	}

	@OriginalMember(owner = "client!cn", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort38;
	}

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1471; local3++) {
			if (arg0 != 0) {
				this.anIntArray198[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray199[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray201[local3] += arg2;
			}
		}
		this.method1284();
		this.aBoolean134 = false;
	}

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "(I)V")
	private void method1288() {
		if (this.aClass177_1 != null) {
			this.aClass177_1.aBoolean361 = false;
		}
	}

	@OriginalMember(owner = "client!cn", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			local27 = 0;
			Static238.anInt8689 = 0;
			Static416.anInt7185 = 0;
			Static443.anInt7576 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray34.length > local41) {
					local51 = this.anIntArrayArray34[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray41 == null || (this.aShortArray41[local59] & arg6) != 0) {
							Static443.anInt7576 += this.anIntArray198[local59];
							Static416.anInt7185 += this.anIntArray199[local59];
							Static238.anInt8689 += this.anIntArray201[local59];
							local27++;
						}
					}
				}
			}
			if (local27 > 0) {
				Static238.anInt8689 = arg4 + Static238.anInt8689 / local27;
				Static443.anInt7576 = arg2 + Static443.anInt7576 / local27;
				Static416.anInt7185 = Static416.anInt7185 / local27 + arg3;
				Static1.aBoolean1 = true;
			} else {
				Static443.anInt7576 = arg2;
				Static416.anInt7185 = arg3;
				Static238.anInt8689 = arg4;
			}
			return;
		}
		@Pc(252) int[] local252;
		@Pc(254) int local254;
		if (arg0 == 1) {
			if (arg7 != null) {
				local27 = arg7[0] * arg2 + arg3 * arg7[1] + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg3 * arg7[4] + arg2 * arg7[3] + arg4 * arg7[5] + 8192 >> 14;
				local41 = arg4 * arg7[8] + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
				arg4 = local41;
				arg2 = local27;
				arg3 = local35;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray34.length) {
					local252 = this.anIntArrayArray34[local35];
					for (local254 = 0; local254 < local252.length; local254++) {
						local53 = local252[local254];
						if (this.aShortArray41 == null || (this.aShortArray41[local53] & arg6) != 0) {
							this.anIntArray198[local53] += arg2;
							this.anIntArray199[local53] += arg3;
							this.anIntArray201[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(376) int local376;
		@Pc(398) int local398;
		@Pc(421) int local421;
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(464) int local464;
		@Pc(468) int local468;
		@Pc(476) int local476;
		@Pc(484) int local484;
		@Pc(639) int local639;
		@Pc(664) int local664;
		@Pc(668) int local668;
		@Pc(676) int local676;
		@Pc(681) int local681;
		@Pc(685) int local685;
		@Pc(689) int local689;
		@Pc(691) int local691;
		@Pc(820) int[] local820;
		@Pc(822) int local822;
		@Pc(826) int local826;
		@Pc(830) int local830;
		@Pc(832) int local832;
		@Pc(959) int local959;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray34.length) {
						local252 = this.anIntArrayArray34[local35];
						for (local254 = 0; local254 < local252.length; local254++) {
							local53 = local252[local254];
							if (this.aShortArray41 == null || (arg6 & this.aShortArray41[local53]) != 0) {
								this.anIntArray198[local53] -= Static443.anInt7576;
								this.anIntArray199[local53] -= Static416.anInt7185;
								this.anIntArray201[local53] -= Static238.anInt8689;
								if (arg4 != 0) {
									local59 = Class4_Sub11.anIntArray148[arg4];
									local376 = Class4_Sub11.anIntArray147[arg4];
									local398 = local59 * this.anIntArray199[local53] + this.anIntArray198[local53] * local376 + 16383 >> 14;
									this.anIntArray199[local53] = this.anIntArray199[local53] * local376 + 16383 - local59 * this.anIntArray198[local53] >> 14;
									this.anIntArray198[local53] = local398;
								}
								if (arg2 != 0) {
									local59 = Class4_Sub11.anIntArray148[arg2];
									local376 = Class4_Sub11.anIntArray147[arg2];
									local398 = local376 * this.anIntArray199[local53] + 16383 - this.anIntArray201[local53] * local59 >> 14;
									this.anIntArray201[local53] = this.anIntArray201[local53] * local376 + local59 * this.anIntArray199[local53] + 16383 >> 14;
									this.anIntArray199[local53] = local398;
								}
								if (arg3 != 0) {
									local59 = Class4_Sub11.anIntArray148[arg3];
									local376 = Class4_Sub11.anIntArray147[arg3];
									local398 = local59 * this.anIntArray201[local53] + local376 * this.anIntArray198[local53] + 16383 >> 14;
									this.anIntArray201[local53] = this.anIntArray201[local53] * local376 + 16383 - this.anIntArray198[local53] * local59 >> 14;
									this.anIntArray198[local53] = local398;
								}
								this.anIntArray198[local53] += Static443.anInt7576;
								this.anIntArray199[local53] += Static416.anInt7185;
								this.anIntArray201[local53] += Static238.anInt8689;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray34.length) {
							local51 = this.anIntArrayArray34[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray41 == null || (this.aShortArray41[local59] & arg6) != 0) {
									local376 = this.anIntArray196[local59];
									local398 = this.anIntArray196[local59 + 1];
									for (local421 = local376; local421 < local398; local421++) {
										local456 = this.aShortArray43[local421] - 1;
										if (local456 == -1) {
											break;
										}
										if (arg4 != 0) {
											local460 = Class4_Sub11.anIntArray148[arg4];
											local464 = Class4_Sub11.anIntArray147[arg4];
											local468 = this.aShortArray40[local456] * local464 + local460 * this.aShortArray34[local456] + 16383 >> 14;
											this.aShortArray34[local456] = (short) (this.aShortArray34[local456] * local464 + 16383 - this.aShortArray40[local456] * local460 >> 14);
											this.aShortArray40[local456] = (short) local468;
										}
										if (arg2 != 0) {
											local460 = Class4_Sub11.anIntArray148[arg2];
											local464 = Class4_Sub11.anIntArray147[arg2];
											local468 = this.aShortArray34[local456] * local464 + 16383 - this.aShortArray35[local456] * local460 >> 14;
											this.aShortArray35[local456] = (short) (local464 * this.aShortArray35[local456] + this.aShortArray34[local456] * local460 + 16383 >> 14);
											this.aShortArray34[local456] = (short) local468;
										}
										if (arg3 != 0) {
											local460 = Class4_Sub11.anIntArray148[arg3];
											local464 = Class4_Sub11.anIntArray147[arg3];
											local468 = this.aShortArray40[local456] * local464 + local460 * this.aShortArray35[local456] + 16383 >> 14;
											this.aShortArray35[local456] = (short) (local464 * this.aShortArray35[local456] + 16383 - local460 * this.aShortArray40[local456] >> 14);
											this.aShortArray40[local456] = (short) local468;
										}
									}
								}
							}
						}
					}
					this.method1278();
				}
			} else {
				local27 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local254 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static1.aBoolean1) {
					local376 = arg7[3] * Static416.anInt7185 + arg7[0] * Static443.anInt7576 + Static238.anInt8689 * arg7[6] + 8192 >> 14;
					local398 = Static238.anInt8689 * arg7[7] + Static416.anInt7185 * arg7[4] + Static443.anInt7576 * arg7[1] + 8192 >> 14;
					local421 = arg7[5] * Static416.anInt7185 + Static443.anInt7576 * arg7[2] + arg7[8] * Static238.anInt8689 + 8192 >> 14;
					local398 += local53;
					local376 += local254;
					Static416.anInt7185 = local398;
					local421 += local59;
					Static443.anInt7576 = local376;
					Static1.aBoolean1 = false;
					Static238.anInt8689 = local421;
				}
				@Pc(444) int[] local444 = new int[9];
				local398 = Class4_Sub11.anIntArray147[arg2];
				local421 = Class4_Sub11.anIntArray148[arg2];
				local456 = Class4_Sub11.anIntArray147[arg3];
				local460 = Class4_Sub11.anIntArray148[arg3];
				local464 = Class4_Sub11.anIntArray147[arg4];
				local468 = Class4_Sub11.anIntArray148[arg4];
				local476 = local421 * local464 + 8192 >> 14;
				local484 = local421 * local468 + 8192 >> 14;
				local444[4] = local464 * local398 + 8192 >> 14;
				local444[7] = local476 * local456 + local468 * local460 + 8192 >> 14;
				local444[0] = local484 * local460 + local464 * local456 + 8192 >> 14;
				local444[6] = local484 * local456 + local464 * -local460 + 8192 >> 14;
				local444[3] = local468 * local398 + 8192 >> 14;
				local444[5] = -local421;
				local444[8] = local398 * local456 + 8192 >> 14;
				local444[1] = -local456 * local468 + local460 * local476 + 8192 >> 14;
				local444[2] = local460 * local398 + 8192 >> 14;
				@Pc(613) int local613 = local444[1] * -Static416.anInt7185 + local444[0] * -Static443.anInt7576 + -Static238.anInt8689 * local444[2] + 8192 >> 14;
				local639 = -Static443.anInt7576 * local444[3] + -Static416.anInt7185 * local444[4] + -Static238.anInt8689 * local444[5] + 8192 >> 14;
				local664 = -Static416.anInt7185 * local444[7] + -Static443.anInt7576 * local444[6] + -Static238.anInt8689 * local444[8] + 8192 >> 14;
				local668 = Static443.anInt7576 + local613;
				@Pc(672) int local672 = Static416.anInt7185 + local639;
				local676 = local664 + Static238.anInt8689;
				@Pc(679) int[] local679 = new int[9];
				for (local681 = 0; local681 < 3; local681++) {
					for (local685 = 0; local685 < 3; local685++) {
						local689 = 0;
						for (local691 = 0; local691 < 3; local691++) {
							local689 += local444[local691 + local681 * 3] * arg7[local691 + local685 * 3];
						}
						local679[local681 * 3 + local685] = local689 + 8192 >> 14;
					}
				}
				local685 = local59 * local444[2] + local444[0] * local254 + local444[1] * local53 + 8192 >> 14;
				local689 = local53 * local444[4] + local254 * local444[3] + local444[5] * local59 + 8192 >> 14;
				local685 += local668;
				local691 = local444[8] * local59 + local53 * local444[7] + local254 * local444[6] + 8192 >> 14;
				local689 += local672;
				local691 += local676;
				local820 = new int[9];
				for (local822 = 0; local822 < 3; local822++) {
					for (local826 = 0; local826 < 3; local826++) {
						local830 = 0;
						for (local832 = 0; local832 < 3; local832++) {
							local830 += arg7[local832 + local822 * 3] * local679[local826 + local832 * 3];
						}
						local820[local822 * 3 + local826] = local830 + 8192 >> 14;
					}
				}
				local826 = local691 * arg7[2] + local685 * arg7[0] + local689 * arg7[1] + 8192 >> 14;
				local830 = local691 * arg7[5] + arg7[4] * local689 + local685 * arg7[3] + 8192 >> 14;
				local832 = arg7[8] * local691 + local689 * arg7[7] + local685 * arg7[6] + 8192 >> 14;
				local830 += local35;
				local826 += local27;
				local832 += local41;
				for (local959 = 0; local959 < local8; local959++) {
					@Pc(965) int local965 = arg1[local959];
					if (this.anIntArrayArray34.length > local965) {
						@Pc(979) int[] local979 = this.anIntArrayArray34[local965];
						for (@Pc(981) int local981 = 0; local981 < local979.length; local981++) {
							@Pc(987) int local987 = local979[local981];
							if (this.aShortArray41 == null || (arg6 & this.aShortArray41[local987]) != 0) {
								@Pc(1029) int local1029 = this.anIntArray199[local987] * local820[1] + this.anIntArray198[local987] * local820[0] + local820[2] * this.anIntArray201[local987] + 8192 >> 14;
								@Pc(1062) int local1062 = local820[3] * this.anIntArray198[local987] + this.anIntArray199[local987] * local820[4] + local820[5] * this.anIntArray201[local987] + 8192 >> 14;
								@Pc(1066) int local1066 = local1062 + local830;
								@Pc(1097) int local1097 = this.anIntArray201[local987] * local820[8] + this.anIntArray199[local987] * local820[7] + local820[6] * this.anIntArray198[local987] + 8192 >> 14;
								@Pc(1101) int local1101 = local1029 + local826;
								this.anIntArray198[local987] = local1101;
								@Pc(1110) int local1110 = local1097 + local832;
								this.anIntArray199[local987] = local1066;
								this.anIntArray201[local987] = local1110;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2569) Class333 local2569;
			@Pc(2457) boolean local2457;
			@Pc(2564) Class186 local2564;
			if (arg0 == 5) {
				if (this.anIntArrayArray32 != null) {
					local2457 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray32.length) {
							local51 = this.anIntArrayArray32[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray42 == null || (this.aShortArray42[local59] & arg6) != 0) {
									local376 = arg2 * 8 + (this.aByteArray23[local59] & 0xFF);
									if (local376 < 0) {
										local376 = 0;
									} else if (local376 > 255) {
										local376 = 255;
									}
									this.aByteArray23[local59] = (byte) local376;
								}
							}
							local2457 |= local51.length > 0;
						}
					}
					if (local2457) {
						if (this.aClass186Array1 != null) {
							for (local41 = 0; local41 < this.anInt1533; local41++) {
								local2564 = this.aClass186Array1[local41];
								local2569 = this.aClass333Array1[local41];
								local2569.anInt9024 = 255 - (this.aByteArray23[local2564.anInt5073] & 0xFF) << 24 | local2569.anInt9024 & 0xFFFFFF;
							}
						}
						this.method1289();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray32 != null) {
					local2457 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray32.length) {
							local51 = this.anIntArrayArray32[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray42 == null || (this.aShortArray42[local59] & arg6) != 0) {
									local376 = this.aShortArray37[local59] & 0xFFFF;
									local398 = local376 >> 10 & 0x3F;
									local421 = local376 >> 7 & 0x7;
									local456 = local376 & 0x7F;
									local421 += arg3 / 4;
									@Pc(2679) int local2679 = arg2 + local398 & 0x3F;
									if (local421 < 0) {
										local421 = 0;
									} else if (local421 > 7) {
										local421 = 7;
									}
									local456 += arg4;
									if (local456 < 0) {
										local456 = 0;
									} else if (local456 > 127) {
										local456 = 127;
									}
									this.aShortArray37[local59] = (short) (local2679 << 10 | local421 << 7 | local456);
								}
							}
							local2457 |= local51.length > 0;
						}
					}
					if (local2457) {
						if (this.aClass186Array1 != null) {
							for (local41 = 0; local41 < this.anInt1533; local41++) {
								local2564 = this.aClass186Array1[local41];
								local2569 = this.aClass333Array1[local41];
								local2569.anInt9024 = local2569.anInt9024 & 0xFF000000 | Static170.anIntArray696[this.aShortArray37[local2564.anInt5073] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method1289();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray33 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray33.length) {
							local252 = this.anIntArrayArray33[local35];
							for (local254 = 0; local254 < local252.length; local254++) {
								local2569 = this.aClass333Array1[local252[local254]];
								local2569.anInt9019 += arg2;
								local2569.anInt9021 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray33 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray33.length) {
							local252 = this.anIntArrayArray33[local35];
							for (local254 = 0; local254 < local252.length; local254++) {
								local2569 = this.aClass333Array1[local252[local254]];
								local2569.anInt9023 = arg3 * local2569.anInt9023 >> 7;
								local2569.anInt9025 = arg2 * local2569.anInt9025 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray33 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray33.length) {
						local252 = this.anIntArrayArray33[local35];
						for (local254 = 0; local254 < local252.length; local254++) {
							local2569 = this.aClass333Array1[local252[local254]];
							local2569.anInt9026 = arg2 + local2569.anInt9026 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray34.length > local35) {
					local252 = this.anIntArrayArray34[local35];
					for (local254 = 0; local254 < local252.length; local254++) {
						local53 = local252[local254];
						if (this.aShortArray41 == null || (arg6 & this.aShortArray41[local53]) != 0) {
							this.anIntArray198[local53] -= Static443.anInt7576;
							this.anIntArray199[local53] -= Static416.anInt7185;
							this.anIntArray201[local53] -= Static238.anInt8689;
							this.anIntArray198[local53] = this.anIntArray198[local53] * arg2 >> 7;
							this.anIntArray199[local53] = this.anIntArray199[local53] * arg3 >> 7;
							this.anIntArray201[local53] = this.anIntArray201[local53] * arg4 >> 7;
							this.anIntArray198[local53] += Static443.anInt7576;
							this.anIntArray199[local53] += Static416.anInt7185;
							this.anIntArray201[local53] += Static238.anInt8689;
						}
					}
				}
			}
		} else {
			local27 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local254 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static1.aBoolean1) {
				local376 = Static443.anInt7576 * arg7[0] + arg7[3] * Static416.anInt7185 + arg7[6] * Static238.anInt8689 + 8192 >> 14;
				local398 = Static443.anInt7576 * arg7[1] + Static416.anInt7185 * arg7[4] + arg7[7] * Static238.anInt8689 + 8192 >> 14;
				local376 += local254;
				local421 = Static416.anInt7185 * arg7[5] + arg7[2] * Static443.anInt7576 + Static238.anInt8689 * arg7[8] + 8192 >> 14;
				local398 += local53;
				local421 += local59;
				Static416.anInt7185 = local398;
				Static443.anInt7576 = local376;
				Static1.aBoolean1 = false;
				Static238.anInt8689 = local421;
			}
			local376 = arg2 << 15 >> 7;
			local398 = arg3 << 15 >> 7;
			local421 = arg4 << 15 >> 7;
			local456 = -Static443.anInt7576 * local376 + 8192 >> 14;
			local460 = local398 * -Static416.anInt7185 + 8192 >> 14;
			local464 = local421 * -Static238.anInt8689 + 8192 >> 14;
			local468 = local456 + Static443.anInt7576;
			local476 = local460 + Static416.anInt7185;
			local484 = local464 + Static238.anInt8689;
			@Pc(1988) int[] local1988 = new int[] { local376 * arg7[0] + 8192 >> 14, local376 * arg7[3] + 8192 >> 14, arg7[6] * local376 + 8192 >> 14, local398 * arg7[1] + 8192 >> 14, local398 * arg7[4] + 8192 >> 14, local398 * arg7[7] + 8192 >> 14, arg7[2] * local421 + 8192 >> 14, local421 * arg7[5] + 8192 >> 14, local421 * arg7[8] + 8192 >> 14 };
			local639 = local254 * local376 + 8192 >> 14;
			local664 = local398 * local53 + 8192 >> 14;
			local668 = local59 * local421 + 8192 >> 14;
			@Pc(2124) int local2124 = local664 + local476;
			@Pc(2128) int local2128 = local639 + local468;
			@Pc(2132) int local2132 = local668 + local484;
			@Pc(2135) int[] local2135 = new int[9];
			@Pc(2141) int local2141;
			for (local676 = 0; local676 < 3; local676++) {
				for (local2141 = 0; local2141 < 3; local2141++) {
					local681 = 0;
					for (local685 = 0; local685 < 3; local685++) {
						local681 += local1988[local685 * 3 + local2141] * arg7[local685 + local676 * 3];
					}
					local2135[local2141 + local676 * 3] = local681 + 8192 >> 14;
				}
			}
			local2141 = local2124 * arg7[1] + arg7[0] * local2128 + local2132 * arg7[2] + 8192 >> 14;
			local681 = arg7[3] * local2128 + local2124 * arg7[4] + local2132 * arg7[5] + 8192 >> 14;
			local681 += local35;
			local2141 += local27;
			local685 = local2132 * arg7[8] + local2124 * arg7[7] + arg7[6] * local2128 + 8192 >> 14;
			local685 += local41;
			for (local689 = 0; local689 < local8; local689++) {
				local691 = arg1[local689];
				if (this.anIntArrayArray34.length > local691) {
					local820 = this.anIntArrayArray34[local691];
					for (local822 = 0; local822 < local820.length; local822++) {
						local826 = local820[local822];
						if (this.aShortArray41 == null || (this.aShortArray41[local826] & arg6) != 0) {
							local830 = this.anIntArray199[local826] * local2135[1] + local2135[0] * this.anIntArray198[local826] + this.anIntArray201[local826] * local2135[2] + 8192 >> 14;
							local832 = this.anIntArray201[local826] * local2135[5] + this.anIntArray198[local826] * local2135[3] + this.anIntArray199[local826] * local2135[4] + 8192 >> 14;
							@Pc(2381) int local2381 = local832 + local681;
							@Pc(2385) int local2385 = local830 + local2141;
							local959 = local2135[8] * this.anIntArray201[local826] + local2135[6] * this.anIntArray198[local826] + local2135[7] * this.anIntArray199[local826] + 8192 >> 14;
							this.anIntArray198[local826] = local2385;
							@Pc(2425) int local2425 = local959 + local685;
							this.anIntArray199[local826] = local2381;
							this.anIntArray201[local826] = local2425;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "()V")
	@Override
	public void method4016() {
		if (this.anInt1509 > 0 && this.anInt1478 > 0) {
			this.method1282();
			this.method1291();
			this.method1290();
		}
	}

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "(I)V")
	private void method1289() {
		if (this.aClass233_3 != null) {
			this.aClass233_3.aBoolean445 = false;
		}
	}

	@OriginalMember(owner = "client!cn", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1528; local3++) {
			if (arg0 == this.aShortArray37[local3]) {
				this.aShortArray37[local3] = arg1;
			}
		}
		if (this.aClass186Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt1533; local38++) {
				@Pc(45) Class186 local45 = this.aClass186Array1[local38];
				@Pc(50) Class333 local50 = this.aClass333Array1[local38];
				local50.anInt9024 = local50.anInt9024 & 0xFF000000 | Static170.anIntArray696[this.aShortArray37[local45.anInt5073] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method1289();
	}

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt1467;
	}

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub11.anIntArray148[arg0];
		@Pc(13) int local13 = Class4_Sub11.anIntArray147[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1471; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray199[local15] + this.anIntArray198[local15] * local13 >> 14;
			this.anIntArray199[local15] = this.anIntArray199[local15] * local13 - this.anIntArray198[local15] * local9 >> 14;
			this.anIntArray198[local15] = local33;
		}
		this.method1284();
		this.aBoolean134 = false;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class9 method4006(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(19) Class9_Sub2 local19;
		@Pc(15) Class9_Sub2 local15;
		if (arg0 == 1) {
			local19 = this.aClass66_Sub1_3.aClass9_Sub2_27;
			local15 = this.aClass66_Sub1_3.aClass9_Sub2_23;
		} else if (arg0 == 2) {
			local15 = this.aClass66_Sub1_3.aClass9_Sub2_26;
			local19 = this.aClass66_Sub1_3.aClass9_Sub2_21;
		} else if (arg0 == 3) {
			local15 = this.aClass66_Sub1_3.aClass9_Sub2_25;
			local19 = this.aClass66_Sub1_3.aClass9_Sub2_22;
		} else if (arg0 == 4) {
			local19 = this.aClass66_Sub1_3.aClass9_Sub2_30;
			local15 = this.aClass66_Sub1_3.aClass9_Sub2_24;
		} else if (arg0 == 5) {
			local19 = this.aClass66_Sub1_3.aClass9_Sub2_28;
			local15 = this.aClass66_Sub1_3.aClass9_Sub2_29;
		} else {
			local19 = local15 = new Class9_Sub2(this.aClass66_Sub1_3, 0, 0, true, false);
		}
		return this.method1279(local19, arg1, arg0 != 0, arg2, local15);
	}

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)V")
	private void method1290() {
		if (!this.aBoolean135) {
			return;
		}
		this.aBoolean135 = false;
		if (this.aClass181Array4 == null && this.aClass89Array4 == null && this.aClass186Array1 == null) {
			if (this.anIntArray198 != null && !Static563.method7748(this.anInt1496, this.anInt1467)) {
				if (this.aClass233_4 == null || this.aClass233_4.method5031()) {
					if (!this.aBoolean134) {
						this.method1292();
					}
					this.anIntArray198 = null;
				} else {
					this.aBoolean135 = true;
				}
			}
			if (this.anIntArray199 != null && !Static126.method2700(this.anInt1496, this.anInt1467)) {
				if (this.aClass233_4 == null || this.aClass233_4.method5031()) {
					if (!this.aBoolean134) {
						this.method1292();
					}
					this.anIntArray199 = null;
				} else {
					this.aBoolean135 = true;
				}
			}
			if (this.anIntArray201 != null && !Static555.method7672(this.anInt1496, this.anInt1467)) {
				if (this.aClass233_4 == null || this.aClass233_4.method5031()) {
					if (!this.aBoolean134) {
						this.method1292();
					}
					this.anIntArray201 = null;
				} else {
					this.aBoolean135 = true;
				}
			}
		}
		if (this.aShortArray43 != null && this.anIntArray198 == null && this.anIntArray199 == null && this.anIntArray201 == null) {
			this.anIntArray196 = null;
			this.aShortArray43 = null;
		}
		if (this.aByteArray24 != null && !Static474.method3729(this.anInt1496, this.anInt1467)) {
			label197: {
				label196: {
					@Pc(164) boolean local164;
					if ((this.anInt1496 & 0x37) == 0) {
						if (this.aClass233_3 == null || this.aClass233_3.method5031()) {
							break label196;
						}
						local164 = false;
					} else {
						if (this.aClass233_2 == null || this.aClass233_2.method5031()) {
							break label196;
						}
						local164 = false;
					}
					if (!local164) {
						this.aBoolean135 = true;
						break label197;
					}
				}
				this.aShortArray40 = this.aShortArray34 = this.aShortArray35 = null;
				this.aByteArray24 = null;
			}
		}
		if (this.aShortArray37 != null && !Static495.method7453(this.anInt1467, this.anInt1496)) {
			if (this.aClass233_3 == null || this.aClass233_3.method5031()) {
				this.aShortArray37 = null;
			} else {
				this.aBoolean135 = true;
			}
		}
		if (this.aByteArray23 != null && !Static35.method623(this.anInt1467, this.anInt1496)) {
			if (this.aClass233_3 == null || this.aClass233_3.method5031()) {
				this.aByteArray23 = null;
			} else {
				this.aBoolean135 = true;
			}
		}
		if (this.aFloatArray2 != null && !Static419.method6616(this.anInt1496, this.anInt1467)) {
			if (this.aClass233_1 == null || this.aClass233_1.method5031()) {
				this.aFloatArray2 = this.aFloatArray3 = null;
			} else {
				this.aBoolean135 = true;
			}
		}
		if (this.aShortArray38 != null && !Static86.method2043(this.anInt1496, this.anInt1467)) {
			if (this.aClass233_3 == null || this.aClass233_3.method5031()) {
				this.aShortArray38 = null;
			} else {
				this.aBoolean135 = true;
			}
		}
		if (this.aShortArray39 != null && !Static352.method7378(this.anInt1467, this.anInt1496)) {
			if ((this.aClass177_1 == null || this.aClass177_1.method4111()) && (this.aClass233_3 == null || this.aClass233_3.method5031())) {
				this.aShortArray39 = this.lb = this.aShortArray36 = null;
			} else {
				this.aBoolean135 = true;
			}
		}
		if (this.aShortArray32 != null) {
			if (this.aClass233_4 == null || this.aClass233_4.method5031()) {
				this.aShortArray32 = null;
			} else {
				this.aBoolean135 = true;
			}
		}
		if (this.aShortArray33 != null) {
			if (this.aClass233_3 == null || this.aClass233_3.method5031()) {
				this.aShortArray33 = null;
			} else {
				this.aBoolean135 = true;
			}
		}
		if (this.anIntArrayArray32 != null && !Static360.method5416(this.anInt1496, this.anInt1467)) {
			this.aShortArray42 = null;
			this.anIntArrayArray32 = null;
		}
		if (this.anIntArrayArray34 != null && !Static493.method7053(this.anInt1496, this.anInt1467)) {
			this.aShortArray41 = null;
			this.anIntArrayArray34 = null;
		}
		if (this.anIntArrayArray33 != null && !Static151.method3065(this.anInt1496, this.anInt1467)) {
			this.anIntArrayArray33 = null;
		}
		if (this.anIntArray200 != null && (this.anInt1467 & 0x800) == 0 && (this.anInt1467 & 0x40000) == 0) {
			this.anIntArray195 = null;
			this.anIntArray197 = null;
			this.anIntArray200 = null;
		}
	}

	@OriginalMember(owner = "client!cn", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.aShort38 = (short) arg0;
		this.method1284();
		this.method1278();
	}

	@OriginalMember(owner = "client!cn", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean134) {
			this.method1292();
		}
		return this.anInt1476;
	}

	@OriginalMember(owner = "client!cn", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1523; local7++) {
			this.anIntArray198[local7] = this.anIntArray198[local7] + 7 >> 4;
			this.anIntArray199[local7] = this.anIntArray199[local7] + 7 >> 4;
			this.anIntArray201[local7] = this.anIntArray201[local7] + 7 >> 4;
		}
		this.method1284();
		this.aBoolean134 = false;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt1528; local3++) {
			local12 = this.aShortArray37[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			@Pc(55) int local55 = local12 & 0x7F;
			if (arg2 != -1) {
				local55 -= -((arg2 - local55) * arg3 >> 7);
			}
			this.aShortArray37[local3] = (short) (local55 | local18 << 10 | local24 << 7);
		}
		if (this.aClass186Array1 != null) {
			for (local12 = 0; local12 < this.anInt1533; local12++) {
				@Pc(104) Class186 local104 = this.aClass186Array1[local12];
				@Pc(109) Class333 local109 = this.aClass333Array1[local12];
				local109.anInt9024 = local109.anInt9024 & 0xFF000000 | Static170.anIntArray696[this.aShortArray37[local104.anInt5073] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method1289();
	}

	@OriginalMember(owner = "client!cn", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.aShort39 = (short) arg0;
		this.method1289();
	}

	@OriginalMember(owner = "client!cn", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray34 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt1523; local12++) {
			this.anIntArray198[local12] <<= 0x4;
			this.anIntArray199[local12] <<= 0x4;
			this.anIntArray201[local12] <<= 0x4;
		}
		Static416.anInt7185 = 0;
		Static443.anInt7576 = 0;
		Static238.anInt8689 = 0;
		return true;
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(B)Z")
	private boolean method1291() {
		if (this.aClass177_1.aBoolean361) {
			return true;
		}
		if (this.aClass177_1.anInterface8_6 == null) {
			this.aClass177_1.anInterface8_6 = this.aClass66_Sub1_3.method6859(this.aBoolean136);
		}
		@Pc(28) Interface8 local28 = this.aClass177_1.anInterface8_6;
		local28.method7148(this.anInt1478 * 6);
		@Pc(40) Buffer local40 = local28.method7149();
		if (local40 != null) {
			@Pc(54) Stream local54 = this.aClass66_Sub1_3.method6978(local40);
			@Pc(58) int local58;
			if (Stream.b()) {
				for (local58 = 0; local58 < this.anInt1478; local58++) {
					local54.c(this.aShortArray39[local58]);
					local54.c(this.lb[local58]);
					local54.c(this.aShortArray36[local58]);
				}
			} else {
				for (local58 = 0; local58 < this.anInt1478; local58++) {
					local54.e(this.aShortArray39[local58]);
					local54.e(this.lb[local58]);
					local54.e(this.aShortArray36[local58]);
				}
			}
			local54.c();
			if (local28.method7150()) {
				this.aClass177_1.aBoolean361 = true;
				this.aBoolean135 = true;
				this.aClass177_1.anInterface8_7 = local28;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4011(@OriginalArg(0) Class134 arg0) {
		@Pc(8) Class134_Sub1 local8 = (Class134_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass181Array4 != null) {
			for (local13 = 0; local13 < this.aClass181Array4.length; local13++) {
				@Pc(20) Class181 local20 = this.aClass181Array4[local13];
				@Pc(22) Class181 local22 = local20;
				if (local20.aClass181_1 != null) {
					local22 = local20.aClass181_1;
				}
				local22.anInt5025 = (int) (local8.aFloat77 + (float) this.anIntArray201[local20.anInt5035] * local8.aFloat70 + (float) this.anIntArray199[local20.anInt5035] * local8.aFloat74 + local8.aFloat68 * (float) this.anIntArray198[local20.anInt5035]);
				local22.anInt5021 = (int) (local8.aFloat67 + local8.aFloat66 * (float) this.anIntArray201[local20.anInt5035] + (float) this.anIntArray199[local20.anInt5035] * local8.aFloat73 + (float) this.anIntArray198[local20.anInt5035] * local8.aFloat76);
				local22.anInt5019 = (int) ((float) this.anIntArray201[local20.anInt5035] * local8.aFloat75 + local8.aFloat72 * (float) this.anIntArray198[local20.anInt5035] + local8.aFloat69 * (float) this.anIntArray199[local20.anInt5035] + local8.aFloat71);
				local22.anInt5024 = (int) ((float) this.anIntArray198[local20.anInt5020] * local8.aFloat68 + (float) this.anIntArray199[local20.anInt5020] * local8.aFloat74 + local8.aFloat70 * (float) this.anIntArray201[local20.anInt5020] + local8.aFloat77);
				local22.anInt5017 = (int) (local8.aFloat67 + local8.aFloat66 * (float) this.anIntArray201[local20.anInt5020] + local8.aFloat76 * (float) this.anIntArray198[local20.anInt5020] + local8.aFloat73 * (float) this.anIntArray199[local20.anInt5020]);
				local22.anInt5032 = (int) (local8.aFloat75 * (float) this.anIntArray201[local20.anInt5020] + local8.aFloat69 * (float) this.anIntArray199[local20.anInt5020] + local8.aFloat72 * (float) this.anIntArray198[local20.anInt5020] + local8.aFloat71);
				local22.anInt5027 = (int) (local8.aFloat77 + local8.aFloat70 * (float) this.anIntArray201[local20.anInt5018] + local8.aFloat74 * (float) this.anIntArray199[local20.anInt5018] + local8.aFloat68 * (float) this.anIntArray198[local20.anInt5018]);
				local22.anInt5022 = (int) (local8.aFloat67 + local8.aFloat73 * (float) this.anIntArray199[local20.anInt5018] + (float) this.anIntArray198[local20.anInt5018] * local8.aFloat76 + (float) this.anIntArray201[local20.anInt5018] * local8.aFloat66);
				local22.anInt5029 = (int) (local8.aFloat71 + local8.aFloat72 * (float) this.anIntArray198[local20.anInt5018] + local8.aFloat69 * (float) this.anIntArray199[local20.anInt5018] + local8.aFloat75 * (float) this.anIntArray201[local20.anInt5018]);
			}
		}
		if (this.aClass89Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass89Array4.length; local13++) {
			@Pc(361) Class89 local361 = this.aClass89Array4[local13];
			@Pc(363) Class89 local363 = local361;
			if (local361.aClass89_1 != null) {
				local363 = local361.aClass89_1;
			}
			if (local361.aClass134_3 == null) {
				local361.aClass134_3 = local8.method7825();
			} else {
				local361.aClass134_3.la(local8);
			}
			local363.anInt2748 = (int) (local8.aFloat77 + local8.aFloat70 * (float) this.anIntArray201[local361.anInt2746] + local8.aFloat68 * (float) this.anIntArray198[local361.anInt2746] + (float) this.anIntArray199[local361.anInt2746] * local8.aFloat74);
			local363.anInt2741 = (int) ((float) this.anIntArray198[local361.anInt2746] * local8.aFloat76 + local8.aFloat73 * (float) this.anIntArray199[local361.anInt2746] + local8.aFloat66 * (float) this.anIntArray201[local361.anInt2746] + local8.aFloat67);
			local363.anInt2744 = (int) ((float) this.anIntArray201[local361.anInt2746] * local8.aFloat75 + local8.aFloat72 * (float) this.anIntArray198[local361.anInt2746] + local8.aFloat69 * (float) this.anIntArray199[local361.anInt2746] + local8.aFloat71);
		}
	}

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "(I)V")
	private void method1292() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1471; local23++) {
			@Pc(30) int local30 = this.anIntArray198[local23];
			@Pc(35) int local35 = this.anIntArray199[local23];
			@Pc(40) int local40 = this.anIntArray201[local23];
			if (local15 < local35) {
				local15 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local30 > local13) {
				local13 = local30;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local40 < local11) {
				local11 = local40;
			}
			if (local40 > local17) {
				local17 = local40;
			}
			@Pc(78) int local78 = local40 * local40 + local30 * local30;
			if (local19 < local78) {
				local19 = local78;
			}
			local78 = local35 * local35 + local40 * local40 + local30 * local30;
			if (local78 > local21) {
				local21 = local78;
			}
		}
		this.anInt1518 = local7;
		this.anInt1531 = local17;
		this.anInt1519 = local15;
		this.anInt1476 = local9;
		this.anInt1498 = local13;
		this.anInt1520 = local11;
		this.anInt1481 = (int) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean134 = true;
	}

	@OriginalMember(owner = "client!cn", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			Static443.anInt7576 = 0;
			local26 = 0;
			Static416.anInt7185 = 0;
			Static238.anInt8689 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray34.length > local38) {
					local48 = this.anIntArrayArray34[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static443.anInt7576 += this.anIntArray198[local56];
						Static416.anInt7185 += this.anIntArray199[local56];
						Static238.anInt8689 += this.anIntArray201[local56];
						local26++;
					}
				}
			}
			if (local26 > 0) {
				Static238.anInt8689 = local18 + Static238.anInt8689 / local26;
				Static443.anInt7576 = local22 + Static443.anInt7576 / local26;
				Static416.anInt7185 = Static416.anInt7185 / local26 + local14;
			} else {
				Static416.anInt7185 = local14;
				Static238.anInt8689 = local18;
				Static443.anInt7576 = local22;
			}
			return;
		}
		@Pc(156) int[] local156;
		@Pc(158) int local158;
		if (arg0 == 1) {
			local14 = arg3 << 4;
			local22 = arg2 << 4;
			local18 = arg4 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray34.length) {
					local156 = this.anIntArrayArray34[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local50 = local156[local158];
						this.anIntArray198[local50] += local22;
						this.anIntArray199[local50] += local14;
						this.anIntArray201[local50] += local18;
					}
				}
			}
			return;
		}
		@Pc(281) int local281;
		@Pc(299) int local299;
		@Pc(753) int local753;
		@Pc(762) int local762;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray34.length) {
					local156 = this.anIntArrayArray34[local32];
					if ((arg5 & 0x1) == 0) {
						for (local158 = 0; local158 < local156.length; local158++) {
							local50 = local156[local158];
							this.anIntArray198[local50] -= Static443.anInt7576;
							this.anIntArray199[local50] -= Static416.anInt7185;
							this.anIntArray201[local50] -= Static238.anInt8689;
							if (arg4 != 0) {
								local56 = Class4_Sub11.anIntArray148[arg4];
								local281 = Class4_Sub11.anIntArray147[arg4];
								local299 = local281 * this.anIntArray198[local50] + local56 * this.anIntArray199[local50] + 16383 >> 14;
								this.anIntArray199[local50] = local281 * this.anIntArray199[local50] + 16383 - this.anIntArray198[local50] * local56 >> 14;
								this.anIntArray198[local50] = local299;
							}
							if (arg2 != 0) {
								local56 = Class4_Sub11.anIntArray148[arg2];
								local281 = Class4_Sub11.anIntArray147[arg2];
								local299 = local281 * this.anIntArray199[local50] + 16383 - this.anIntArray201[local50] * local56 >> 14;
								this.anIntArray201[local50] = this.anIntArray201[local50] * local281 + this.anIntArray199[local50] * local56 + 16383 >> 14;
								this.anIntArray199[local50] = local299;
							}
							if (arg3 != 0) {
								local56 = Class4_Sub11.anIntArray148[arg3];
								local281 = Class4_Sub11.anIntArray147[arg3];
								local299 = local56 * this.anIntArray201[local50] + this.anIntArray198[local50] * local281 + 16383 >> 14;
								this.anIntArray201[local50] = this.anIntArray201[local50] * local281 + 16383 - local56 * this.anIntArray198[local50] >> 14;
								this.anIntArray198[local50] = local299;
							}
							this.anIntArray198[local50] += Static443.anInt7576;
							this.anIntArray199[local50] += Static416.anInt7185;
							this.anIntArray201[local50] += Static238.anInt8689;
						}
					} else {
						for (local158 = 0; local158 < local156.length; local158++) {
							local50 = local156[local158];
							this.anIntArray198[local50] -= Static443.anInt7576;
							this.anIntArray199[local50] -= Static416.anInt7185;
							this.anIntArray201[local50] -= Static238.anInt8689;
							if (arg2 != 0) {
								local56 = Class4_Sub11.anIntArray148[arg2];
								local281 = Class4_Sub11.anIntArray147[arg2];
								local299 = this.anIntArray199[local50] * local281 + 16383 - local56 * this.anIntArray201[local50] >> 14;
								this.anIntArray201[local50] = local281 * this.anIntArray201[local50] + local56 * this.anIntArray199[local50] + 16383 >> 14;
								this.anIntArray199[local50] = local299;
							}
							if (arg4 != 0) {
								local56 = Class4_Sub11.anIntArray148[arg4];
								local281 = Class4_Sub11.anIntArray147[arg4];
								local299 = this.anIntArray199[local50] * local56 + local281 * this.anIntArray198[local50] + 16383 >> 14;
								this.anIntArray199[local50] = local281 * this.anIntArray199[local50] + 16383 - local56 * this.anIntArray198[local50] >> 14;
								this.anIntArray198[local50] = local299;
							}
							if (arg3 != 0) {
								local56 = Class4_Sub11.anIntArray148[arg3];
								local281 = Class4_Sub11.anIntArray147[arg3];
								local299 = this.anIntArray198[local50] * local281 + local56 * this.anIntArray201[local50] + 16383 >> 14;
								this.anIntArray201[local50] = local281 * this.anIntArray201[local50] + 16383 - this.anIntArray198[local50] * local56 >> 14;
								this.anIntArray198[local50] = local299;
							}
							this.anIntArray198[local50] += Static443.anInt7576;
							this.anIntArray199[local50] += Static416.anInt7185;
							this.anIntArray201[local50] += Static238.anInt8689;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray34.length > local38) {
						local48 = this.anIntArrayArray34[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local281 = this.anIntArray196[local56];
							local299 = this.anIntArray196[local56 + 1];
							for (local753 = local281; local753 < local299; local753++) {
								local762 = this.aShortArray43[local753] - 1;
								if (local762 == -1) {
									break;
								}
								@Pc(772) int local772;
								@Pc(776) int local776;
								@Pc(794) int local794;
								if (arg4 != 0) {
									local772 = Class4_Sub11.anIntArray148[arg4];
									local776 = Class4_Sub11.anIntArray147[arg4];
									local794 = local776 * this.aShortArray40[local762] + this.aShortArray34[local762] * local772 + 16383 >> 14;
									this.aShortArray34[local762] = (short) (this.aShortArray34[local762] * local776 + 16383 - this.aShortArray40[local762] * local772 >> 14);
									this.aShortArray40[local762] = (short) local794;
								}
								if (arg2 != 0) {
									local772 = Class4_Sub11.anIntArray148[arg2];
									local776 = Class4_Sub11.anIntArray147[arg2];
									local794 = this.aShortArray34[local762] * local776 + 16383 - local772 * this.aShortArray35[local762] >> 14;
									this.aShortArray35[local762] = (short) (local776 * this.aShortArray35[local762] + local772 * this.aShortArray34[local762] + 16383 >> 14);
									this.aShortArray34[local762] = (short) local794;
								}
								if (arg3 != 0) {
									local772 = Class4_Sub11.anIntArray148[arg3];
									local776 = Class4_Sub11.anIntArray147[arg3];
									local794 = local772 * this.aShortArray35[local762] + local776 * this.aShortArray40[local762] + 16383 >> 14;
									this.aShortArray35[local762] = (short) (local776 * this.aShortArray35[local762] + 16383 - local772 * this.aShortArray40[local762] >> 14);
									this.aShortArray40[local762] = (short) local794;
								}
							}
						}
					}
				}
				this.method1278();
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray34.length) {
					local156 = this.anIntArrayArray34[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local50 = local156[local158];
						this.anIntArray198[local50] -= Static443.anInt7576;
						this.anIntArray199[local50] -= Static416.anInt7185;
						this.anIntArray201[local50] -= Static238.anInt8689;
						this.anIntArray198[local50] = arg2 * this.anIntArray198[local50] >> 7;
						this.anIntArray199[local50] = this.anIntArray199[local50] * arg3 >> 7;
						this.anIntArray201[local50] = arg4 * this.anIntArray201[local50] >> 7;
						this.anIntArray198[local50] += Static443.anInt7576;
						this.anIntArray199[local50] += Static416.anInt7185;
						this.anIntArray201[local50] += Static238.anInt8689;
					}
				}
			}
		} else {
			@Pc(1196) Class333 local1196;
			@Pc(1100) boolean local1100;
			@Pc(1191) Class186 local1191;
			if (arg0 == 5) {
				if (this.anIntArrayArray32 != null) {
					local1100 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray32.length > local38) {
							local48 = this.anIntArrayArray32[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local281 = (this.aByteArray23[local56] & 0xFF) + arg2 * 8;
								if (local281 < 0) {
									local281 = 0;
								} else if (local281 > 255) {
									local281 = 255;
								}
								this.aByteArray23[local56] = (byte) local281;
							}
							local1100 |= local48.length > 0;
						}
					}
					if (local1100) {
						if (this.aClass186Array1 != null) {
							for (local38 = 0; local38 < this.anInt1533; local38++) {
								local1191 = this.aClass186Array1[local38];
								local1196 = this.aClass333Array1[local38];
								local1196.anInt9024 = local1196.anInt9024 & 0xFFFFFF | 255 - (this.aByteArray23[local1191.anInt5073] & 0xFF) << 24;
							}
						}
						this.method1289();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray32 != null) {
					local1100 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray32.length) {
							local48 = this.anIntArrayArray32[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local281 = this.aShortArray37[local56] & 0xFFFF;
								local299 = local281 >> 10 & 0x3F;
								local753 = local281 >> 7 & 0x7;
								local762 = local281 & 0x7F;
								@Pc(1287) int local1287 = arg2 + local299 & 0x3F;
								local753 += arg3 / 4;
								local762 += arg4;
								if (local753 < 0) {
									local753 = 0;
								} else if (local753 > 7) {
									local753 = 7;
								}
								if (local762 < 0) {
									local762 = 0;
								} else if (local762 > 127) {
									local762 = 127;
								}
								this.aShortArray37[local56] = (short) (local753 << 7 | local1287 << 10 | local762);
							}
							local1100 |= local48.length > 0;
						}
					}
					if (local1100) {
						if (this.aClass186Array1 != null) {
							for (local38 = 0; local38 < this.anInt1533; local38++) {
								local1191 = this.aClass186Array1[local38];
								local1196 = this.aClass333Array1[local38];
								local1196.anInt9024 = local1196.anInt9024 & 0xFF000000 | Static170.anIntArray696[this.aShortArray37[local1191.anInt5073] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method1289();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray33 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray33.length > local32) {
							local156 = this.anIntArrayArray33[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local1196 = this.aClass333Array1[local156[local158]];
								local1196.anInt9021 += arg3;
								local1196.anInt9019 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray33 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray33.length) {
							local156 = this.anIntArrayArray33[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local1196 = this.aClass333Array1[local156[local158]];
								local1196.anInt9023 = arg3 * local1196.anInt9023 >> 7;
								local1196.anInt9025 = arg2 * local1196.anInt9025 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray33 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray33.length > local32) {
						local156 = this.anIntArrayArray33[local32];
						for (local158 = 0; local158 < local156.length; local158++) {
							local1196 = this.aClass333Array1[local156[local158]];
							local1196.anInt9026 = arg2 + local1196.anInt9026 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean134) {
			this.method1292();
		}
		return this.anInt1481;
	}

	@OriginalMember(owner = "client!cn", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub11.anIntArray148[arg0];
		@Pc(13) int local13 = Class4_Sub11.anIntArray147[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1471; local15++) {
			@Pc(34) int local34 = this.anIntArray199[local15] * local13 - local9 * this.anIntArray201[local15] >> 14;
			this.anIntArray201[local15] = local9 * this.anIntArray199[local15] + this.anIntArray201[local15] * local13 >> 14;
			this.anIntArray199[local15] = local34;
		}
		this.method1284();
		this.aBoolean134 = false;
	}

	@OriginalMember(owner = "client!cn", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class4_Sub7_Sub3 Z(@OriginalArg(0) Class4_Sub7_Sub3 arg0) {
		if (this.anInt1509 == 0) {
			return null;
		}
		if (!this.aBoolean134) {
			this.method1292();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass66_Sub1_3.anInt8420 <= 0) {
			local43 = this.anInt1518 - (this.aClass66_Sub1_3.anInt8420 * this.anInt1476 >> 8) >> this.aClass66_Sub1_3.anInt8437;
			local60 = this.anInt1498 - (this.anInt1519 * this.aClass66_Sub1_3.anInt8420 >> 8) >> this.aClass66_Sub1_3.anInt8437;
		} else {
			local43 = this.anInt1518 - (this.aClass66_Sub1_3.anInt8420 * this.anInt1519 >> 8) >> this.aClass66_Sub1_3.anInt8437;
			local60 = this.anInt1498 - (this.anInt1476 * this.aClass66_Sub1_3.anInt8420 >> 8) >> this.aClass66_Sub1_3.anInt8437;
		}
		@Pc(117) int local117;
		@Pc(134) int local134;
		if (this.aClass66_Sub1_3.anInt8440 <= 0) {
			local117 = this.anInt1520 - (this.aClass66_Sub1_3.anInt8440 * this.anInt1476 >> 8) >> this.aClass66_Sub1_3.anInt8437;
			local134 = this.anInt1531 - (this.aClass66_Sub1_3.anInt8440 * this.anInt1519 >> 8) >> this.aClass66_Sub1_3.anInt8437;
		} else {
			local117 = this.anInt1520 - (this.aClass66_Sub1_3.anInt8440 * this.anInt1519 >> 8) >> this.aClass66_Sub1_3.anInt8437;
			local134 = this.anInt1531 - (this.aClass66_Sub1_3.anInt8440 * this.anInt1476 >> 8) >> this.aClass66_Sub1_3.anInt8437;
		}
		@Pc(176) int local176 = local60 + 1 - local43;
		@Pc(183) int local183 = local134 + 1 - local117;
		@Pc(186) Class4_Sub7_Sub3_Sub1 local186 = (Class4_Sub7_Sub3_Sub1) arg0;
		@Pc(196) Class4_Sub7_Sub3_Sub1 local196;
		if (local186 != null && local186.method2094(local176, local183)) {
			local196 = local186;
			local186.method2089();
		} else {
			local196 = new Class4_Sub7_Sub3_Sub1(this.aClass66_Sub1_3, local176, local183);
		}
		local196.method2095(local60, local134, local117, local43);
		this.method1287(local196);
		return local196;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class134_Sub1 local8 = (Class134_Sub1) arg2;
		@Pc(12) Class134_Sub1 local12 = this.aClass66_Sub1_3.aClass134_Sub1_16;
		@Pc(33) float local33 = local12.aFloat70 * local8.aFloat71 + local12.aFloat74 * local8.aFloat67 + local8.aFloat77 * local12.aFloat68 + local12.aFloat77;
		@Pc(54) float local54 = local12.aFloat67 + local8.aFloat67 * local12.aFloat73 + local8.aFloat77 * local12.aFloat76 + local12.aFloat66 * local8.aFloat71;
		Static289.aFloat99 = local8.aFloat72 * local12.aFloat75 + local12.aFloat69 * local8.aFloat76 + local12.aFloat72 * local8.aFloat68;
		Static244.aFloat94 = local8.aFloat66 * local12.aFloat69 + local12.aFloat72 * local8.aFloat70 + local8.aFloat75 * local12.aFloat75;
		Static562.aFloat199 = local12.aFloat70 * local8.aFloat72 + local12.aFloat74 * local8.aFloat76 + local12.aFloat68 * local8.aFloat68;
		Static522.aFloat191 = local8.aFloat75 * local12.aFloat66 + local8.aFloat70 * local12.aFloat76 + local12.aFloat73 * local8.aFloat66;
		@Pc(147) float local147 = local8.aFloat71 * local12.aFloat75 + local8.aFloat77 * local12.aFloat72 + local8.aFloat67 * local12.aFloat69 + local12.aFloat71;
		Static179.aFloat64 = local8.aFloat70 * local12.aFloat68 + local12.aFloat74 * local8.aFloat66 + local8.aFloat75 * local12.aFloat70;
		Static160.aFloat62 = local12.aFloat73 * local8.aFloat73 + local12.aFloat76 * local8.aFloat74 + local8.aFloat69 * local12.aFloat66;
		Static532.aFloat193 = local8.aFloat68 * local12.aFloat76 + local8.aFloat76 * local12.aFloat73 + local12.aFloat66 * local8.aFloat72;
		Static454.aFloat154 = local8.aFloat69 * local12.aFloat75 + local12.aFloat72 * local8.aFloat74 + local8.aFloat73 * local12.aFloat69;
		Static359.aFloat109 = local8.aFloat69 * local12.aFloat70 + local8.aFloat74 * local12.aFloat68 + local12.aFloat74 * local8.aFloat73;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass66_Sub1_3.anInt8445;
		@Pc(255) int local255 = this.aClass66_Sub1_3.anInt8438;
		if (!this.aBoolean134) {
			this.method1292();
		}
		Static198.anIntArray392[0] = this.anInt1518;
		Static310.anIntArray466[0] = this.anInt1476;
		Static198.anIntArray392[1] = this.anInt1498;
		Static352.anIntArray682[0] = this.anInt1520;
		Static310.anIntArray466[1] = this.anInt1476;
		Static352.anIntArray682[1] = this.anInt1520;
		Static198.anIntArray392[2] = this.anInt1518;
		Static310.anIntArray466[2] = this.anInt1519;
		Static352.anIntArray682[2] = this.anInt1520;
		Static198.anIntArray392[3] = this.anInt1498;
		Static310.anIntArray466[3] = this.anInt1519;
		Static352.anIntArray682[3] = this.anInt1520;
		Static198.anIntArray392[4] = this.anInt1518;
		Static310.anIntArray466[4] = this.anInt1476;
		Static198.anIntArray392[5] = this.anInt1498;
		Static352.anIntArray682[4] = this.anInt1531;
		Static310.anIntArray466[5] = this.anInt1476;
		Static198.anIntArray392[6] = this.anInt1518;
		Static352.anIntArray682[5] = this.anInt1531;
		Static310.anIntArray466[6] = this.anInt1519;
		Static352.anIntArray682[6] = this.anInt1531;
		Static198.anIntArray392[7] = this.anInt1498;
		Static310.anIntArray466[7] = this.anInt1519;
		Static352.anIntArray682[7] = this.anInt1531;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(395) float local395;
		@Pc(390) float local390;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static310.anIntArray466[local383];
			local395 = Static198.anIntArray392[local383];
			local400 = Static352.anIntArray682[local383];
			local414 = local395 * Static289.aFloat99 + Static454.aFloat154 * local390 + Static244.aFloat94 * local400 + local147;
			local428 = Static179.aFloat64 * local400 + local395 * Static562.aFloat199 + Static359.aFloat109 * local390 + local33;
			local442 = local54 + local390 * Static160.aFloat62 + Static532.aFloat193 * local395 + Static522.aFloat191 * local400;
			if ((float) this.aClass66_Sub1_3.anInt8410 <= local414) {
				@Pc(461) float local461 = local428 * (float) local251 / local414 + (float) this.aClass66_Sub1_3.anInt8424;
				@Pc(473) float local473 = (float) this.aClass66_Sub1_3.anInt8413 + (float) local255 * local442 / local414;
				if (local243 < local461) {
					local243 = local461;
				}
				if (local241 > local461) {
					local241 = local461;
				}
				if (local245 > local473) {
					local245 = local473;
				}
				if (local473 > local247) {
					local247 = local473;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg0 > local241 && local243 > (float) arg0 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt1509 > Static508.anIntArray670.length) {
				Static508.anIntArray670 = new int[this.anInt1509];
				Static218.anIntArray401 = new int[this.anInt1509];
			}
			@Pc(624) int local624;
			for (@Pc(550) int local550 = 0; local550 < this.anInt1471; local550++) {
				local395 = this.anIntArray198[local550];
				local390 = this.anIntArray199[local550];
				local400 = this.anIntArray201[local550];
				local428 = local33 + local400 * Static179.aFloat64 + local390 * Static359.aFloat109 + Static562.aFloat199 * local395;
				local442 = local54 + Static532.aFloat193 * local395 + local390 * Static160.aFloat62 + local400 * Static522.aFloat191;
				local414 = local395 * Static289.aFloat99 + Static454.aFloat154 * local390 + local400 * Static244.aFloat94 + local147;
				@Pc(631) int local631;
				@Pc(633) int local633;
				@Pc(642) int local642;
				if ((float) this.aClass66_Sub1_3.anInt8410 <= local414) {
					local624 = (int) ((float) this.aClass66_Sub1_3.anInt8424 + local428 * (float) local251 / local414);
					local631 = (int) ((float) this.aClass66_Sub1_3.anInt8413 + (float) local255 * local442 / local414);
					local633 = this.anIntArray196[local550];
					local642 = this.anIntArray196[local550 + 1];
					for (@Pc(700) int local700 = local633; local700 < local642; local700++) {
						@Pc(709) int local709 = this.aShortArray43[local700] - 1;
						if (local709 == -1) {
							break;
						}
						Static508.anIntArray670[local709] = local624;
						Static218.anIntArray401[local709] = local631;
					}
				} else {
					local624 = this.anIntArray196[local550];
					local631 = this.anIntArray196[local550 + 1];
					for (local633 = local624; local633 < local631; local633++) {
						local642 = this.aShortArray43[local633] - 1;
						if (local642 == -1) {
							break;
						}
						Static508.anIntArray670[this.aShortArray43[local633] - 1] = -999999;
					}
				}
			}
			for (local624 = 0; local624 < this.anInt1528; local624++) {
				if (Static508.anIntArray670[this.aShortArray39[local624]] != -999999 && Static508.anIntArray670[this.lb[local624]] != -999999 && Static508.anIntArray670[this.aShortArray36[local624]] != -999999 && this.method1285(Static218.anIntArray401[this.aShortArray36[local624]], Static218.anIntArray401[this.lb[local624]], arg0, arg1, Static508.anIntArray670[this.aShortArray39[local624]], Static508.anIntArray670[this.aShortArray36[local624]], Static508.anIntArray670[this.lb[local624]], Static218.anIntArray401[this.aShortArray39[local624]])) {
					return true;
				}
			}
		}
		return false;
	}
}
