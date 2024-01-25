import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class110_Sub1 extends Class110 {

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "[F")
	private float[] aFloatArray20;

	@OriginalMember(owner = "client!ip", name = "r", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!ip", name = "x", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!ip", name = "B", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!ip", name = "D", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!ip", name = "E", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!ip", name = "F", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!ip", name = "K", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!ip", name = "R", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!ip", name = "U", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!ip", name = "Y", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!ip", name = "eb", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!ip", name = "hb", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!ip", name = "jb", descriptor = "[Lclient!go;")
	private Class85[] aClass85Array1;

	@OriginalMember(owner = "client!ip", name = "lb", descriptor = "S")
	private short lb;

	@OriginalMember(owner = "client!ip", name = "qb", descriptor = "B")
	private byte aByte19;

	@OriginalMember(owner = "client!ip", name = "tb", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!ip", name = "ub", descriptor = "Lclient!ll;")
	private Class137 aClass137_1;

	@OriginalMember(owner = "client!ip", name = "zb", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!ip", name = "Ab", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!ip", name = "Cb", descriptor = "I")
	private int anInt3338;

	@OriginalMember(owner = "client!ip", name = "Fb", descriptor = "[F")
	private float[] aFloatArray21;

	@OriginalMember(owner = "client!ip", name = "Gb", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!ip", name = "Hb", descriptor = "I")
	private int anInt3341;

	@OriginalMember(owner = "client!ip", name = "Ib", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!ip", name = "Nb", descriptor = "[Lclient!pf;")
	private Class179[] aClass179Array2;

	@OriginalMember(owner = "client!ip", name = "Ob", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!ip", name = "Pb", descriptor = "[Lclient!bu;")
	private Class29[] aClass29Array2;

	@OriginalMember(owner = "client!ip", name = "Qb", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!ip", name = "Rb", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!ip", name = "Yb", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!ip", name = "ac", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!ip", name = "bc", descriptor = "[Lclient!j;")
	private Class115[] aClass115Array1;

	@OriginalMember(owner = "client!ip", name = "fc", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!ip", name = "gc", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!ip", name = "ic", descriptor = "I")
	private int anInt3354;

	@OriginalMember(owner = "client!ip", name = "jc", descriptor = "Lclient!bk;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ip", name = "pc", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!ip", name = "tc", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!ip", name = "wc", descriptor = "Lclient!vd;")
	private Interface11 anInterface11_4;

	@OriginalMember(owner = "client!ip", name = "V", descriptor = "Z")
	private boolean aBoolean280 = false;

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
	private int anInt3301 = 0;

	@OriginalMember(owner = "client!ip", name = "Db", descriptor = "I")
	private int anInt3339 = 0;

	@OriginalMember(owner = "client!ip", name = "Zb", descriptor = "I")
	private int anInt3350 = 0;

	@OriginalMember(owner = "client!ip", name = "sb", descriptor = "Z")
	private boolean aBoolean281 = true;

	@OriginalMember(owner = "client!ip", name = "yb", descriptor = "I")
	private int anInt3336 = 0;

	@OriginalMember(owner = "client!ip", name = "kc", descriptor = "I")
	private int anInt3355 = 0;

	@OriginalMember(owner = "client!ip", name = "Wb", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_21;

	@OriginalMember(owner = "client!ip", name = "C", descriptor = "Lclient!pc;")
	private Class177 aClass177_7;

	@OriginalMember(owner = "client!ip", name = "Mb", descriptor = "Lclient!pc;")
	private Class177 aClass177_9;

	@OriginalMember(owner = "client!ip", name = "cc", descriptor = "Lclient!pc;")
	private Class177 aClass177_10;

	@OriginalMember(owner = "client!ip", name = "L", descriptor = "Lclient!pc;")
	private Class177 aClass177_8;

	@OriginalMember(owner = "client!ip", name = "J", descriptor = "Lclient!to;")
	private Class230 aClass230_1;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class110_Sub1(@OriginalArg(0) Class19_Sub2 arg0) {
		this.aClass19_Sub2_21 = arg0;
		this.aClass177_7 = new Class177(null, 5126, 3, 0);
		this.aClass177_9 = new Class177(null, 5126, 2, 0);
		this.aClass177_10 = new Class177(null, 5126, 3, 0);
		this.aClass177_8 = new Class177(null, 5121, 4, 0);
		this.aClass230_1 = new Class230();
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!fd;Lclient!jq;IIII)V")
	public Class110_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3338 = arg5;
		this.aClass19_Sub2_21 = arg0;
		this.anInt3341 = arg2;
		if (Static426.method5437(arg5, arg2)) {
			this.aClass177_7 = new Class177(null, 5126, 3, 0);
		}
		if (Static8.method87(arg2, arg5)) {
			this.aClass177_9 = new Class177(null, 5126, 2, 0);
		}
		if (Static49.method2002(arg2, arg5)) {
			this.aClass177_10 = new Class177(null, 5126, 3, 0);
		}
		if (Static44.method760(arg5, arg2)) {
			this.aClass177_8 = new Class177(null, 5121, 4, 0);
		}
		if (Static399.method5172(arg5, arg2)) {
			this.aClass230_1 = new Class230();
		}
		@Pc(102) Interface7 local102 = arg0.anInterface7_6;
		@Pc(106) int[] local106 = new int[arg1.anInt3686];
		this.anIntArray214 = new int[arg1.anInt3677 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt3686; local115++) {
			if ((arg1.aByteArray43 == null || arg1.aByteArray43[local115] != 2) && (arg1.aShortArray125 == null || arg1.aShortArray125[local115] == -1 || !local102.method2396(arg1.aShortArray125[local115] & 0xFFFF).aBoolean642)) {
				local106[this.anInt3355++] = local115;
				this.anIntArray214[arg1.aShortArray120[local115]]++;
				this.anIntArray214[arg1.aShortArray119[local115]]++;
				this.anIntArray214[arg1.aShortArray117[local115]]++;
			}
		}
		this.anInt3301 = this.anInt3355;
		@Pc(203) long[] local203 = new long[this.anInt3355];
		@Pc(212) boolean local212 = (this.anInt3341 & 0x100) != 0;
		@Pc(224) int local224;
		@Pc(235) int local235;
		@Pc(367) int local367;
		label488: for (@Pc(214) int local214 = 0; local214 < this.anInt3355; local214++) {
			@Pc(220) int local220 = local106[local214];
			@Pc(222) Class251 local222 = null;
			local224 = 0;
			@Pc(226) byte local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			if (arg1.aClass147Array1 != null) {
				for (local235 = 0; local235 < arg1.aClass147Array1.length; local235++) {
					@Pc(242) Class147 local242 = arg1.aClass147Array1[local235];
					if (local220 == local242.anInt4521) {
						@Pc(255) Class118 local255 = Static435.method5501(local242.anInt4526);
						if (local255.aBoolean324) {
							local203[local214] = Long.MAX_VALUE;
							this.anInt3301--;
							continue label488;
						}
					}
				}
			}
			@Pc(282) short local282 = -1;
			if (arg1.aShortArray125 != null) {
				local282 = arg1.aShortArray125[local220];
				if (local282 != -1) {
					local222 = local102.method2396(local282 & 0xFFFF);
					local228 = local222.aByte89;
					local230 = local222.aByte88;
				}
			}
			@Pc(323) boolean local323 = arg1.aByteArray44 != null && arg1.aByteArray44[local220] != 0 || local222 != null && !local222.aBoolean640;
			if ((local212 || local323) && arg1.aByteArray42 != null) {
				local224 += arg1.aByteArray42[local220] << 17;
			}
			if (local323) {
				local224 += 65536;
			}
			local224 += (local228 & 0xFF) << 8;
			local224 += local230 & 0xFF;
			local367 = local226 + ((local282 & 0xFFFF) << 16);
			@Pc(373) int local373 = local367 + (local214 & 0xFFFF);
			local203[local214] = ((long) local224 << 32) + ((long) local373);
		}
		Static410.method5270(local106, local203);
		this.anInt3350 = arg1.anInt3677;
		this.anIntArray212 = arg1.anIntArray244;
		this.anIntArray216 = arg1.anIntArray242;
		this.anInt3339 = arg1.anInt3668;
		this.anIntArray213 = arg1.anIntArray251;
		this.aShortArray99 = arg1.aShortArray122;
		this.aClass29Array2 = arg1.aClass29Array3;
		this.aClass179Array2 = arg1.aClass179Array3;
		@Pc(429) Class196[] local429 = new Class196[this.anInt3350];
		@Pc(449) int local449;
		@Pc(463) int local463;
		if (arg1.aClass147Array1 != null) {
			this.anInt3354 = arg1.aClass147Array1.length;
			this.aClass115Array1 = new Class115[this.anInt3354];
			this.aClass85Array1 = new Class85[this.anInt3354];
			for (local449 = 0; local449 < this.anInt3354; local449++) {
				@Pc(456) Class147 local456 = arg1.aClass147Array1[local449];
				@Pc(461) Class118 local461 = Static435.method5501(local456.anInt4526);
				local463 = -1;
				for (@Pc(465) int local465 = 0; local465 < this.anInt3355; local465++) {
					if (local106[local465] == local456.anInt4521) {
						local463 = local465;
						break;
					}
				}
				if (local463 == -1) {
					throw new RuntimeException();
				}
				local235 = Static72.anIntArray115[arg1.aShortArray123[local456.anInt4521] & 0xFFFF] & 0xFFFFFF;
				local235 |= 255 - (arg1.aByteArray44 == null ? 0 : arg1.aByteArray44[local456.anInt4521]) << 24;
				this.aClass115Array1[local449] = new Class115(local463, arg1.aShortArray120[local456.anInt4521], arg1.aShortArray119[local456.anInt4521], arg1.aShortArray117[local456.anInt4521], local461.anInt3538, local461.anInt3543, local461.anInt3536, local461.anInt3535, local461.anInt3542, local461.aBoolean324, local461.aBoolean323, local456.anInt4528);
				this.aClass85Array1[local449] = new Class85(local235);
			}
		}
		local449 = this.anInt3355 * 3;
		this.aFloatArray21 = new float[local449];
		this.aByteArray38 = new byte[this.anInt3355];
		this.aFloatArray20 = new float[local449];
		this.aShortArray107 = new short[this.anInt3355];
		this.aShort32 = (short) arg3;
		this.aShortArray109 = new short[local449];
		this.aShortArray101 = new short[local449];
		Static429.aLongArray9 = new long[local449];
		this.aShortArray102 = new short[local449];
		if (arg1.aShortArray121 != null) {
			this.aShortArray104 = new short[this.anInt3355];
		}
		this.aShortArray103 = new short[local449];
		this.aShortArray108 = new short[this.anInt3355];
		this.aShort30 = (short) arg4;
		this.aShortArray105 = new short[this.anInt3355];
		this.aShortArray106 = new short[this.anInt3355];
		this.aShortArray100 = new short[this.anInt3355];
		this.aByteArray39 = new byte[local449];
		local224 = 0;
		for (local367 = 0; local367 < arg1.anInt3677; local367++) {
			local463 = this.anIntArray214[local367];
			this.anIntArray214[local367] = local224;
			local429[local367] = new Class196();
			local224 += local463;
		}
		this.anIntArray214[arg1.anInt3677] = local224;
		@Pc(701) int[] local701 = null;
		@Pc(703) int[] local703 = null;
		@Pc(705) int[] local705 = null;
		@Pc(707) float[][] local707 = null;
		@Pc(733) int local733;
		@Pc(768) int local768;
		@Pc(774) int local774;
		@Pc(788) int local788;
		@Pc(790) int local790;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(991) float local991;
		@Pc(987) float local987;
		@Pc(993) float local993;
		if (arg1.aByteArray46 != null) {
			@Pc(713) int local713 = arg1.anInt3689;
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
			local705 = new int[local713];
			for (local768 = 0; local768 < this.anInt3355; local768++) {
				local774 = local106[local768];
				if (arg1.aByteArray46[local774] != -1) {
					local788 = arg1.aByteArray46[local774] & 0xFF;
					for (local790 = 0; local790 < 3; local790++) {
						@Pc(802) short local802;
						if (local790 == 0) {
							local802 = arg1.aShortArray120[local774];
						} else if (local790 == 1) {
							local802 = arg1.aShortArray119[local774];
						} else {
							local802 = arg1.aShortArray117[local774];
						}
						local824 = arg1.anIntArray244[local802];
						local829 = arg1.anIntArray242[local802];
						@Pc(834) int local834 = arg1.anIntArray251[local802];
						if (local716[local788] > local824) {
							local716[local788] = local824;
						}
						if (local824 > local719[local788]) {
							local719[local788] = local824;
						}
						if (local829 < local722[local788]) {
							local722[local788] = local829;
						}
						if (local829 > local725[local788]) {
							local725[local788] = local829;
						}
						if (local728[local788] > local834) {
							local728[local788] = local834;
						}
						if (local731[local788] < local834) {
							local731[local788] = local834;
						}
					}
				}
			}
			local701 = new int[local713];
			local703 = new int[local713];
			local707 = new float[local713][];
			for (local774 = 0; local774 < local713; local774++) {
				@Pc(931) byte local931 = arg1.aByteArray47[local774];
				if (local931 > 0) {
					local701[local774] = (local716[local774] + local719[local774]) / 2;
					local703[local774] = (local722[local774] + local725[local774]) / 2;
					local705[local774] = (local731[local774] + local728[local774]) / 2;
					if (local931 == 1) {
						local829 = arg1.anIntArray249[local774];
						local987 = 64.0F / (float) arg1.anIntArray248[local774];
						if (local829 == 0) {
							local991 = 1.0F;
							local993 = 1.0F;
						} else if (local829 > 0) {
							local991 = 1.0F;
							local993 = (float) local829 / 1024.0F;
						} else {
							local993 = 1.0F;
							local991 = (float) -local829 / 1024.0F;
						}
					} else if (local931 == 2) {
						local993 = 64.0F / (float) arg1.anIntArray250[local774];
						local991 = 64.0F / (float) arg1.anIntArray249[local774];
						local987 = 64.0F / (float) arg1.anIntArray248[local774];
					} else {
						local993 = (float) arg1.anIntArray250[local774] / 1024.0F;
						local987 = (float) arg1.anIntArray248[local774] / 1024.0F;
						local991 = (float) arg1.anIntArray249[local774] / 1024.0F;
					}
					local707[local774] = Static449.method5652(local991, arg1.aByteArray41[local774] & 0xFF, arg1.aShortArray116[local774], arg1.aShortArray124[local774], arg1.aShortArray118[local774], local987, local993);
				}
			}
		}
		@Pc(1107) Class92[] local1107 = new Class92[arg1.anInt3686];
		@Pc(1126) short local1126;
		@Pc(1136) int local1136;
		@Pc(1147) int local1147;
		@Pc(1209) int local1209;
		for (@Pc(1109) int local1109 = 0; local1109 < arg1.anInt3686; local1109++) {
			@Pc(1116) short local1116 = arg1.aShortArray120[local1109];
			@Pc(1121) short local1121 = arg1.aShortArray119[local1109];
			local1126 = arg1.aShortArray117[local1109];
			local1136 = this.anIntArray212[local1121] - this.anIntArray212[local1116];
			local1147 = this.anIntArray216[local1121] - this.anIntArray216[local1116];
			local733 = this.anIntArray213[local1121] - this.anIntArray213[local1116];
			local768 = this.anIntArray212[local1126] - this.anIntArray212[local1116];
			local774 = this.anIntArray216[local1126] - this.anIntArray216[local1116];
			local788 = this.anIntArray213[local1126] - this.anIntArray213[local1116];
			local790 = local788 * local1147 - local774 * local733;
			local1209 = local768 * local733 - local788 * local1136;
			for (local824 = local1136 * local774 - local768 * local1147; local790 > 8192 || local1209 > 8192 || local824 > 8192 || local790 < -8192 || local1209 < -8192 || local824 < -8192; local824 >>= 0x1) {
				local1209 >>= 0x1;
				local790 >>= 0x1;
			}
			local829 = (int) Math.sqrt((double) (local824 * local824 + local1209 * local1209 + local790 * local790));
			if (local829 <= 0) {
				local829 = 1;
			}
			local790 = local790 * 256 / local829;
			local1209 = local1209 * 256 / local829;
			local824 = local824 * 256 / local829;
			@Pc(1301) byte local1301 = arg1.aByteArray43 == null ? 0 : arg1.aByteArray43[local1109];
			if (local1301 == 0) {
				@Pc(1334) Class196 local1334 = local429[local1116];
				local1334.anInt5690++;
				local1334.anInt5687 += local1209;
				local1334.anInt5683 += local790;
				local1334.anInt5680 += local824;
				@Pc(1362) Class196 local1362 = local429[local1121];
				local1362.anInt5683 += local790;
				local1362.anInt5687 += local1209;
				local1362.anInt5690++;
				local1362.anInt5680 += local824;
				@Pc(1390) Class196 local1390 = local429[local1126];
				local1390.anInt5683 += local790;
				local1390.anInt5680 += local824;
				local1390.anInt5687 += local1209;
				local1390.anInt5690++;
			} else if (local1301 == 1) {
				@Pc(1319) Class92 local1319 = local1107[local1109] = new Class92();
				local1319.anInt2882 = local1209;
				local1319.anInt2883 = local824;
				local1319.anInt2885 = local790;
			}
		}
		@Pc(1427) int local1427;
		for (@Pc(1421) int local1421 = 0; local1421 < this.anInt3355; local1421++) {
			local1427 = local106[local1421];
			@Pc(1434) int local1434 = arg1.aShortArray123[local1427] & 0xFFFF;
			@Pc(1439) short local1439;
			if (arg1.aShortArray125 == null) {
				local1439 = -1;
			} else {
				local1439 = arg1.aShortArray125[local1427];
			}
			if (arg1.aByteArray46 == null) {
				local1147 = -1;
			} else {
				local1147 = arg1.aByteArray46[local1427];
			}
			if (arg1.aByteArray44 == null) {
				local733 = 0;
			} else {
				local733 = arg1.aByteArray44[local1427] & 0xFF;
			}
			@Pc(1474) float local1474 = 0.0F;
			@Pc(1476) float local1476 = 0.0F;
			@Pc(1478) float local1478 = 0.0F;
			local991 = 0.0F;
			local987 = 0.0F;
			local993 = 0.0F;
			@Pc(1486) byte local1486 = 0;
			@Pc(1488) byte local1488 = 0;
			@Pc(1490) int local1490 = 0;
			@Pc(1523) byte local1523;
			@Pc(1540) short local1540;
			@Pc(2280) short local2280;
			@Pc(2285) short local2285;
			if (local1439 != -1) {
				if (local1147 == -1) {
					local1486 = 1;
					local991 = 1.0F;
					local993 = 0.0F;
					local1476 = 1.0F;
					local1474 = 0.0F;
					local1488 = 2;
					local987 = 0.0F;
					local1478 = 1.0F;
				} else {
					local1147 &= 0xFF;
					local1523 = arg1.aByteArray47[local1147];
					@Pc(1530) short local1530;
					@Pc(1535) short local1535;
					@Pc(1569) float local1569;
					@Pc(1580) float local1580;
					@Pc(1659) float local1659;
					@Pc(2086) float local2086;
					@Pc(2094) float local2094;
					@Pc(2102) float local2102;
					@Pc(2125) float local2125;
					@Pc(2148) float local2148;
					@Pc(2171) float local2171;
					if (local1523 == 0) {
						local1530 = arg1.aShortArray120[local1427];
						local1535 = arg1.aShortArray119[local1427];
						local1540 = arg1.aShortArray117[local1427];
						local2280 = arg1.aShortArray118[local1147];
						local2285 = arg1.aShortArray116[local1147];
						@Pc(2290) short local2290 = arg1.aShortArray124[local1147];
						@Pc(2296) float local2296 = (float) arg1.anIntArray244[local2280];
						@Pc(2302) float local2302 = (float) arg1.anIntArray242[local2280];
						local1569 = arg1.anIntArray251[local2280];
						local1580 = (float) arg1.anIntArray244[local2285] - local2296;
						local1659 = (float) arg1.anIntArray242[local2285] - local2302;
						@Pc(2333) float local2333 = (float) arg1.anIntArray251[local2285] - local1569;
						@Pc(2341) float local2341 = (float) arg1.anIntArray244[local2290] - local2296;
						@Pc(2349) float local2349 = (float) arg1.anIntArray242[local2290] - local2302;
						@Pc(2357) float local2357 = (float) arg1.anIntArray251[local2290] - local1569;
						@Pc(2365) float local2365 = (float) arg1.anIntArray244[local1530] - local2296;
						@Pc(2373) float local2373 = (float) arg1.anIntArray242[local1530] - local2302;
						@Pc(2381) float local2381 = (float) arg1.anIntArray251[local1530] - local1569;
						@Pc(2389) float local2389 = (float) arg1.anIntArray244[local1535] - local2296;
						@Pc(2398) float local2398 = (float) arg1.anIntArray242[local1535] - local2302;
						local2086 = (float) arg1.anIntArray251[local1535] - local1569;
						local2094 = (float) arg1.anIntArray244[local1540] - local2296;
						local2102 = (float) arg1.anIntArray242[local1540] - local2302;
						local2125 = (float) arg1.anIntArray251[local1540] - local1569;
						local2148 = local1659 * local2357 - local2349 * local2333;
						local2171 = local2341 * local2333 - local2357 * local1580;
						@Pc(2460) float local2460 = local1580 * local2349 - local1659 * local2341;
						@Pc(2469) float local2469 = local2460 * local2349 - local2171 * local2357;
						@Pc(2477) float local2477 = local2148 * local2357 - local2460 * local2341;
						@Pc(2486) float local2486 = local2171 * local2341 - local2349 * local2148;
						@Pc(2500) float local2500 = 1.0F / (local2469 * local1580 + local2477 * local1659 + local2486 * local2333);
						local1478 = local2500 * (local2477 * local2398 + local2469 * local2389 + local2086 * local2486);
						local1474 = (local2477 * local2373 + local2365 * local2469 + local2381 * local2486) * local2500;
						local987 = local2500 * (local2125 * local2486 + local2477 * local2102 + local2094 * local2469);
						@Pc(2551) float local2551 = local2171 * local1580 - local2148 * local1659;
						@Pc(2559) float local2559 = local2460 * local1659 - local2171 * local2333;
						@Pc(2567) float local2567 = local2148 * local2333 - local2460 * local1580;
						@Pc(2581) float local2581 = 1.0F / (local2551 * local2357 + local2567 * local2349 + local2341 * local2559);
						local991 = (local2567 * local2398 + local2389 * local2559 + local2551 * local2086) * local2581;
						local1476 = (local2551 * local2381 + local2567 * local2373 + local2365 * local2559) * local2581;
						local993 = local2581 * (local2551 * local2125 + local2102 * local2567 + local2559 * local2094);
					} else {
						local1530 = arg1.aShortArray120[local1427];
						local1535 = arg1.aShortArray119[local1427];
						local1540 = arg1.aShortArray117[local1427];
						@Pc(1544) int local1544 = local701[local1147];
						@Pc(1548) int local1548 = local703[local1147];
						@Pc(1552) int local1552 = local705[local1147];
						@Pc(1556) float[] local1556 = local707[local1147];
						@Pc(1561) byte local1561 = arg1.aByteArray45[local1147];
						local1569 = (float) arg1.anIntArray252[local1147] / 256.0F;
						if (local1523 == 1) {
							local1580 = (float) arg1.anIntArray250[local1147] / 1024.0F;
							Static276.method875(arg1.anIntArray251[local1530], local1569, local1548, arg1.anIntArray242[local1530], local1556, arg1.anIntArray244[local1530], local1544, local1580, local1561, local1552);
							local1476 = Static244.aFloat102;
							local1474 = Static403.aFloat211;
							Static276.method875(arg1.anIntArray251[local1535], local1569, local1548, arg1.anIntArray242[local1535], local1556, arg1.anIntArray244[local1535], local1544, local1580, local1561, local1552);
							local1478 = Static403.aFloat211;
							local991 = Static244.aFloat102;
							Static276.method875(arg1.anIntArray251[local1540], local1569, local1548, arg1.anIntArray242[local1540], local1556, arg1.anIntArray244[local1540], local1544, local1580, local1561, local1552);
							local987 = Static403.aFloat211;
							local993 = Static244.aFloat102;
							local1659 = local1580 / 2.0F;
							if ((local1561 & 0x1) == 0) {
								if (local1478 - local1474 > local1659) {
									local1478 -= local1580;
									local1486 = 1;
								} else if (local1659 < local1474 - local1478) {
									local1486 = 2;
									local1478 += local1580;
								}
								if (local1659 < local987 - local1474) {
									local1488 = 1;
									local987 -= local1580;
								} else if (local1659 < local1474 - local987) {
									local987 += local1580;
									local1488 = 2;
								}
							} else {
								if (local1659 < local991 - local1476) {
									local991 -= local1580;
									local1486 = 1;
								} else if (local1476 - local991 > local1659) {
									local991 += local1580;
									local1486 = 2;
								}
								if (local993 - local1476 > local1659) {
									local1488 = 1;
									local993 -= local1580;
								} else if (local1476 - local993 > local1659) {
									local1488 = 2;
									local993 += local1580;
								}
							}
						} else if (local1523 == 2) {
							local1580 = (float) arg1.anIntArray243[local1147] / 256.0F;
							local1659 = (float) arg1.anIntArray247[local1147] / 256.0F;
							@Pc(1997) int local1997 = arg1.anIntArray244[local1535] - arg1.anIntArray244[local1530];
							@Pc(2008) int local2008 = arg1.anIntArray242[local1535] - arg1.anIntArray242[local1530];
							@Pc(2019) int local2019 = arg1.anIntArray251[local1535] - arg1.anIntArray251[local1530];
							@Pc(2030) int local2030 = arg1.anIntArray244[local1540] - arg1.anIntArray244[local1530];
							@Pc(2041) int local2041 = arg1.anIntArray242[local1540] - arg1.anIntArray242[local1530];
							@Pc(2052) int local2052 = arg1.anIntArray251[local1540] - arg1.anIntArray251[local1530];
							@Pc(2060) int local2060 = local2052 * local2008 - local2041 * local2019;
							@Pc(2069) int local2069 = local2030 * local2019 - local2052 * local1997;
							@Pc(2078) int local2078 = local1997 * local2041 - local2030 * local2008;
							local2086 = 64.0F / (float) arg1.anIntArray249[local1147];
							local2094 = 64.0F / (float) arg1.anIntArray248[local1147];
							local2102 = 64.0F / (float) arg1.anIntArray250[local1147];
							local2125 = (local1556[1] * (float) local2069 + (float) local2060 * local1556[0] + (float) local2078 * local1556[2]) / local2086;
							local2148 = (local1556[5] * (float) local2078 + local1556[4] * (float) local2069 + local1556[3] * (float) local2060) / local2094;
							local2171 = (local1556[7] * (float) local2069 + (float) local2060 * local1556[6] + (float) local2078 * local1556[8]) / local2102;
							local1490 = Static441.method5567(local2125, local2171, local2148);
							Static326.method4413(local1556, local1580, local1569, arg1.anIntArray244[local1530], local1659, arg1.anIntArray242[local1530], local1552, local1490, local1561, local1544, local1548, arg1.anIntArray251[local1530]);
							local1474 = Static204.aFloat127;
							local1476 = Static332.aFloat180;
							Static326.method4413(local1556, local1580, local1569, arg1.anIntArray244[local1535], local1659, arg1.anIntArray242[local1535], local1552, local1490, local1561, local1544, local1548, arg1.anIntArray251[local1535]);
							local1478 = Static204.aFloat127;
							local991 = Static332.aFloat180;
							Static326.method4413(local1556, local1580, local1569, arg1.anIntArray244[local1540], local1659, arg1.anIntArray242[local1540], local1552, local1490, local1561, local1544, local1548, arg1.anIntArray251[local1540]);
							local987 = Static204.aFloat127;
							local993 = Static332.aFloat180;
						} else if (local1523 == 3) {
							Static31.method619(arg1.anIntArray251[local1530], local1569, arg1.anIntArray244[local1530], local1544, arg1.anIntArray242[local1530], local1556, local1561, local1548, local1552);
							local1476 = Static164.aFloat143;
							local1474 = Static90.aFloat49;
							Static31.method619(arg1.anIntArray251[local1535], local1569, arg1.anIntArray244[local1535], local1544, arg1.anIntArray242[local1535], local1556, local1561, local1548, local1552);
							local1478 = Static90.aFloat49;
							local991 = Static164.aFloat143;
							Static31.method619(arg1.anIntArray251[local1540], local1569, arg1.anIntArray244[local1540], local1544, arg1.anIntArray242[local1540], local1556, local1561, local1548, local1552);
							local987 = Static90.aFloat49;
							local993 = Static164.aFloat143;
							if ((local1561 & 0x1) == 0) {
								if (local987 - local1474 > 0.5F) {
									local987--;
									local1488 = 1;
								} else if (local1474 - local987 > 0.5F) {
									local1488 = 2;
									local987++;
								}
								if (local1478 - local1474 > 0.5F) {
									local1478--;
									local1486 = 1;
								} else if (local1474 - local1478 > 0.5F) {
									local1486 = 2;
									local1478++;
								}
							} else {
								if (local991 - local1476 > 0.5F) {
									local991--;
									local1486 = 1;
								} else if (local1476 - local991 > 0.5F) {
									local991++;
									local1486 = 2;
								}
								if (local993 - local1476 > 0.5F) {
									local993--;
									local1488 = 1;
								} else if (local1476 - local993 > 0.5F) {
									local993++;
									local1488 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray43 == null) {
				local1523 = 0;
			} else {
				local1523 = arg1.aByteArray43[local1427];
			}
			if (local1523 == 0) {
				@Pc(2785) long local2785 = (long) (local1147 << 2) + ((long) (local1434 << 8) + (long) (local1490 << 24) + (long) local733 << 32);
				local1540 = arg1.aShortArray120[local1427];
				local2280 = arg1.aShortArray119[local1427];
				local2285 = arg1.aShortArray117[local1427];
				@Pc(2804) Class196 local2804 = local429[local1540];
				this.aShortArray108[local1421] = this.method2803(local2804.anInt5680, local2785, local1476, local1474, local2804.anInt5690, local2804.anInt5687, local1540, arg1, local2804.anInt5683);
				@Pc(2828) Class196 local2828 = local429[local2280];
				this.aShortArray105[local1421] = this.method2803(local2828.anInt5680, (long) local1486 + local2785, local991, local1478, local2828.anInt5690, local2828.anInt5687, local2280, arg1, local2828.anInt5683);
				@Pc(2855) Class196 local2855 = local429[local2285];
				this.aShortArray106[local1421] = this.method2803(local2855.anInt5680, (long) local1488 + local2785, local993, local987, local2855.anInt5690, local2855.anInt5687, local2285, arg1, local2855.anInt5683);
			} else if (local1523 == 1) {
				@Pc(2647) Class92 local2647 = local1107[local1427];
				@Pc(2691) long local2691 = ((long) (local1490 << 24) + (long) (local1434 << 8) + (long) local733 << 32) + (long) ((local2647.anInt2882 + 256 << 12) + (local2647.anInt2885 > 0 ? 1024 : 2048) + (local1147 << 2) + (local2647.anInt2883 + 256 << 22));
				this.aShortArray108[local1421] = this.method2803(local2647.anInt2883, local2691, local1476, local1474, 0, local2647.anInt2882, arg1.aShortArray120[local1427], arg1, local2647.anInt2885);
				this.aShortArray105[local1421] = this.method2803(local2647.anInt2883, local2691 + (long) local1486, local991, local1478, 0, local2647.anInt2882, arg1.aShortArray119[local1427], arg1, local2647.anInt2885);
				this.aShortArray106[local1421] = this.method2803(local2647.anInt2883, local2691 + (long) local1488, local993, local987, 0, local2647.anInt2882, arg1.aShortArray117[local1427], arg1, local2647.anInt2885);
			}
			if (arg1.aShortArray125 == null) {
				this.aShortArray107[local1421] = -1;
			} else {
				this.aShortArray107[local1421] = arg1.aShortArray125[local1427];
			}
			if (arg1.aByteArray44 != null) {
				this.aByteArray38[local1421] = arg1.aByteArray44[local1427];
			}
			if (arg1.aShortArray121 != null) {
				this.aShortArray104[local1421] = arg1.aShortArray121[local1427];
			}
			this.aShortArray100[local1421] = arg1.aShortArray123[local1427];
		}
		local1427 = 0;
		local1126 = -10000;
		for (local1136 = 0; local1136 < this.anInt3301; local1136++) {
			@Pc(2948) short local2948 = this.aShortArray107[local1136];
			if (local1126 != local2948) {
				local1427++;
				local1126 = local2948;
			}
		}
		this.anIntArray215 = new int[local1427 + 1];
		local1126 = -10000;
		local1427 = 0;
		for (local1147 = 0; local1147 < this.anInt3301; local1147++) {
			@Pc(2986) short local2986 = this.aShortArray107[local1147];
			if (local2986 != local1126) {
				local1126 = local2986;
				this.anIntArray215[local1427++] = local1147;
			}
		}
		this.anIntArray215[local1427] = this.anInt3301;
		Static429.aLongArray9 = null;
		this.aShortArray103 = Static221.method3347(this.aShortArray103, this.anInt3336);
		this.aShortArray101 = Static221.method3347(this.aShortArray101, this.anInt3336);
		this.aShortArray102 = Static221.method3347(this.aShortArray102, this.anInt3336);
		this.aByteArray39 = Static237.method5626(this.aByteArray39, this.anInt3336);
		this.aFloatArray21 = Static320.method4410(this.anInt3336, this.aFloatArray21);
		this.aFloatArray20 = Static320.method4410(this.anInt3336, this.aFloatArray20);
		if (arg1.anIntArray246 != null && Static39.method688(this.anInt3338, arg2)) {
			this.anIntArrayArray34 = arg1.method3050();
		}
		if (arg1.aClass147Array1 != null && Static301.method5343(arg2, this.anInt3338)) {
			this.anIntArrayArray32 = arg1.method3037();
		}
		if (arg1.anIntArray245 != null && Static397.method726(this.anInt3338, arg2)) {
			local733 = 0;
			@Pc(3100) int[] local3100 = new int[256];
			for (local774 = 0; local774 < this.anInt3355; local774++) {
				local788 = arg1.anIntArray245[local106[local774]];
				if (local788 >= 0) {
					@Pc(3117) int local3117 = local3100[local788]++;
					if (local788 > local733) {
						local733 = local788;
					}
				}
			}
			this.anIntArrayArray33 = new int[local733 + 1][];
			for (local788 = 0; local788 <= local733; local788++) {
				this.anIntArrayArray33[local788] = new int[local3100[local788]];
				local3100[local788] = 0;
			}
			for (local790 = 0; local790 < this.anInt3355; local790++) {
				local1209 = arg1.anIntArray245[local106[local790]];
				if (local1209 >= 0) {
					this.anIntArrayArray33[local1209][local3100[local1209]++] = local790;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "XA", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			local27 = 0;
			Static213.anInt3954 = 0;
			Static19.anInt255 = 0;
			Static185.anInt3541 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray34.length > local41) {
					local51 = this.anIntArrayArray34[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static19.anInt255 += this.anIntArray212[local59];
						Static185.anInt3541 += this.anIntArray216[local59];
						Static213.anInt3954 += this.anIntArray213[local59];
						local27++;
					}
				}
			}
			if (local27 > 0) {
				Static213.anInt3954 = Static213.anInt3954 / local27 + local21;
				Static19.anInt255 = local25 + Static19.anInt255 / local27;
				Static185.anInt3541 = Static185.anInt3541 / local27 + local17;
			} else {
				Static213.anInt3954 = local21;
				Static185.anInt3541 = local17;
				Static19.anInt255 = local25;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local25 = arg2 << 4;
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray34.length) {
					local159 = this.anIntArrayArray34[local35];
					for (local161 = 0; local161 < local159.length; local161++) {
						local53 = local159[local161];
						this.anIntArray212[local53] += local25;
						this.anIntArray216[local53] += local17;
						this.anIntArray213[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(282) int local282;
		@Pc(301) int local301;
		@Pc(757) int local757;
		if (arg0 == 2) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray34.length > local35) {
					local159 = this.anIntArrayArray34[local35];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local53 = local159[local161];
							this.anIntArray212[local53] -= Static19.anInt255;
							this.anIntArray216[local53] -= Static185.anInt3541;
							this.anIntArray213[local53] -= Static213.anInt3954;
							if (arg4 != 0) {
								local59 = Class50_Sub1.anIntArray225[arg4];
								local282 = Class50_Sub1.anIntArray224[arg4];
								local301 = local282 * this.anIntArray212[local53] + this.anIntArray216[local53] * local59 + 32767 >> 15;
								this.anIntArray216[local53] = this.anIntArray216[local53] * local282 + 32767 - local59 * this.anIntArray212[local53] >> 15;
								this.anIntArray212[local53] = local301;
							}
							if (arg2 != 0) {
								local59 = Class50_Sub1.anIntArray225[arg2];
								local282 = Class50_Sub1.anIntArray224[arg2];
								local301 = this.anIntArray216[local53] * local282 + 32767 - local59 * this.anIntArray213[local53] >> 15;
								this.anIntArray213[local53] = this.anIntArray213[local53] * local282 + this.anIntArray216[local53] * local59 + 32767 >> 15;
								this.anIntArray216[local53] = local301;
							}
							if (arg3 != 0) {
								local59 = Class50_Sub1.anIntArray225[arg3];
								local282 = Class50_Sub1.anIntArray224[arg3];
								local301 = this.anIntArray212[local53] * local282 + local59 * this.anIntArray213[local53] + 32767 >> 15;
								this.anIntArray213[local53] = local282 * this.anIntArray213[local53] + 32767 - this.anIntArray212[local53] * local59 >> 15;
								this.anIntArray212[local53] = local301;
							}
							this.anIntArray212[local53] += Static19.anInt255;
							this.anIntArray216[local53] += Static185.anInt3541;
							this.anIntArray213[local53] += Static213.anInt3954;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local53 = local159[local161];
							this.anIntArray212[local53] -= Static19.anInt255;
							this.anIntArray216[local53] -= Static185.anInt3541;
							this.anIntArray213[local53] -= Static213.anInt3954;
							if (arg2 != 0) {
								local59 = Class50_Sub1.anIntArray225[arg2];
								local282 = Class50_Sub1.anIntArray224[arg2];
								local301 = local282 * this.anIntArray216[local53] + 32767 - local59 * this.anIntArray213[local53] >> 15;
								this.anIntArray213[local53] = local282 * this.anIntArray213[local53] + local59 * this.anIntArray216[local53] + 32767 >> 15;
								this.anIntArray216[local53] = local301;
							}
							if (arg4 != 0) {
								local59 = Class50_Sub1.anIntArray225[arg4];
								local282 = Class50_Sub1.anIntArray224[arg4];
								local301 = local59 * this.anIntArray216[local53] + this.anIntArray212[local53] * local282 + 32767 >> 15;
								this.anIntArray216[local53] = local282 * this.anIntArray216[local53] + 32767 - local59 * this.anIntArray212[local53] >> 15;
								this.anIntArray212[local53] = local301;
							}
							if (arg3 != 0) {
								local59 = Class50_Sub1.anIntArray225[arg3];
								local282 = Class50_Sub1.anIntArray224[arg3];
								local301 = this.anIntArray212[local53] * local282 + this.anIntArray213[local53] * local59 + 32767 >> 15;
								this.anIntArray213[local53] = local282 * this.anIntArray213[local53] + 32767 - this.anIntArray212[local53] * local59 >> 15;
								this.anIntArray212[local53] = local301;
							}
							this.anIntArray212[local53] += Static19.anInt255;
							this.anIntArray216[local53] += Static185.anInt3541;
							this.anIntArray213[local53] += Static213.anInt3954;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray34.length) {
						local51 = this.anIntArrayArray34[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local282 = this.anIntArray214[local59];
							local301 = this.anIntArray214[local59 + 1];
							for (local757 = local282; local757 < local301; local757++) {
								@Pc(766) int local766 = this.aShortArray109[local757] - 1;
								if (local766 == -1) {
									break;
								}
								@Pc(778) int local778;
								@Pc(782) int local782;
								@Pc(801) int local801;
								if (arg4 != 0) {
									local778 = Class50_Sub1.anIntArray225[arg4];
									local782 = Class50_Sub1.anIntArray224[arg4];
									local801 = local778 * this.aShortArray101[local766] + local782 * this.aShortArray103[local766] + 32767 >> 15;
									this.aShortArray101[local766] = (short) (this.aShortArray101[local766] * local782 + 32767 - local778 * this.aShortArray103[local766] >> 15);
									this.aShortArray103[local766] = (short) local801;
								}
								if (arg2 != 0) {
									local778 = Class50_Sub1.anIntArray225[arg2];
									local782 = Class50_Sub1.anIntArray224[arg2];
									local801 = this.aShortArray101[local766] * local782 + 32767 - local778 * this.aShortArray102[local766] >> 15;
									this.aShortArray102[local766] = (short) (this.aShortArray101[local766] * local778 + this.aShortArray102[local766] * local782 + 32767 >> 15);
									this.aShortArray101[local766] = (short) local801;
								}
								if (arg3 != 0) {
									local778 = Class50_Sub1.anIntArray225[arg3];
									local782 = Class50_Sub1.anIntArray224[arg3];
									local801 = local778 * this.aShortArray102[local766] + this.aShortArray103[local766] * local782 + 32767 >> 15;
									this.aShortArray102[local766] = (short) (this.aShortArray102[local766] * local782 + 32767 - this.aShortArray103[local766] * local778 >> 15);
									this.aShortArray103[local766] = (short) local801;
								}
							}
						}
					}
				}
				if (this.aClass177_10 == null && this.aClass177_8 != null) {
					this.aClass177_8.anInterface11_7 = null;
				}
				if (this.aClass177_10 != null) {
					this.aClass177_10.anInterface11_7 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray34.length) {
					local159 = this.anIntArrayArray34[local35];
					for (local161 = 0; local161 < local159.length; local161++) {
						local53 = local159[local161];
						this.anIntArray212[local53] -= Static19.anInt255;
						this.anIntArray216[local53] -= Static185.anInt3541;
						this.anIntArray213[local53] -= Static213.anInt3954;
						this.anIntArray212[local53] = arg2 * this.anIntArray212[local53] >> 7;
						this.anIntArray216[local53] = this.anIntArray216[local53] * arg3 >> 7;
						this.anIntArray213[local53] = this.anIntArray213[local53] * arg4 >> 7;
						this.anIntArray212[local53] += Static19.anInt255;
						this.anIntArray216[local53] += Static185.anInt3541;
						this.anIntArray213[local53] += Static213.anInt3954;
					}
				}
			}
		} else {
			@Pc(1206) Class115 local1206;
			@Pc(1211) Class85 local1211;
			if (arg0 == 5) {
				if (this.anIntArrayArray33 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray33.length) {
							local159 = this.anIntArrayArray33[local35];
							for (local161 = 0; local161 < local159.length; local161++) {
								local53 = local159[local161];
								local59 = arg2 * 8 + (this.aByteArray38[local53] & 0xFF);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray38[local53] = (byte) local59;
							}
							if (local159.length > 0 && this.aClass177_8 != null) {
								this.aClass177_8.anInterface11_7 = null;
							}
						}
					}
					if (this.aClass115Array1 != null) {
						for (local35 = 0; local35 < this.anInt3354; local35++) {
							local1206 = this.aClass115Array1[local35];
							local1211 = this.aClass85Array1[local35];
							local1211.anInt2743 = 255 - (this.aByteArray38[local1206.anInt3416] & 0xFF) << 24 | local1211.anInt2743 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1466) Class85 local1466;
				if (arg0 == 8) {
					if (this.anIntArrayArray32 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (local35 < this.anIntArrayArray32.length) {
								local159 = this.anIntArrayArray32[local35];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1466 = this.aClass85Array1[local159[local161]];
									local1466.anInt2749 += arg2;
									local1466.anInt2746 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray32 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (local35 < this.anIntArrayArray32.length) {
								local159 = this.anIntArrayArray32[local35];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1466 = this.aClass85Array1[local159[local161]];
									local1466.anInt2741 = arg2 * local1466.anInt2741 >> 7;
									local1466.anInt2748 = local1466.anInt2748 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray32 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray32.length > local35) {
							local159 = this.anIntArrayArray32[local35];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1466 = this.aClass85Array1[local159[local161]];
								local1466.anInt2745 = arg2 + local1466.anInt2745 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray33 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray33.length) {
						local159 = this.anIntArrayArray33[local35];
						for (local161 = 0; local161 < local159.length; local161++) {
							local53 = local159[local161];
							local59 = this.aShortArray100[local53] & 0xFFFF;
							local282 = local59 >> 10 & 0x3F;
							local301 = local59 >> 7 & 0x7;
							local757 = local59 & 0x7F;
							local301 += arg3 / 4;
							@Pc(1309) int local1309 = arg2 + local282 & 0x3F;
							local757 += arg4;
							if (local301 < 0) {
								local301 = 0;
							} else if (local301 > 7) {
								local301 = 7;
							}
							if (local757 < 0) {
								local757 = 0;
							} else if (local757 > 127) {
								local757 = 127;
							}
							this.aShortArray100[local53] = (short) (local1309 << 10 | local301 << 7 | local757);
						}
						if (local159.length > 0 && this.aClass177_8 != null) {
							this.aClass177_8.anInterface11_7 = null;
						}
					}
				}
				if (this.aClass115Array1 != null) {
					for (local35 = 0; local35 < this.anInt3354; local35++) {
						local1206 = this.aClass115Array1[local35];
						local1211 = this.aClass85Array1[local35];
						local1211.anInt2743 = local1211.anInt2743 & 0xFF000000 | Static72.anIntArray115[this.aShortArray100[local1206.anInt3416] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "N", descriptor = "(IIII)V")
	@Override
	protected void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static19.anInt255 = 0;
			Static185.anInt3541 = 0;
			Static213.anInt3954 = 0;
			for (local17 = 0; local17 < this.anInt3350; local17++) {
				Static19.anInt255 += this.anIntArray212[local17];
				Static185.anInt3541 += this.anIntArray216[local17];
				local9++;
				Static213.anInt3954 += this.anIntArray213[local17];
			}
			if (local9 > 0) {
				Static19.anInt255 = arg1 + Static19.anInt255 / local9;
				Static185.anInt3541 = Static185.anInt3541 / local9 + arg2;
				Static213.anInt3954 = Static213.anInt3954 / local9 + arg3;
			} else {
				Static19.anInt255 = arg1;
				Static185.anInt3541 = arg2;
				Static213.anInt3954 = arg3;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt3350; local9++) {
				this.anIntArray212[local9] += arg1;
				this.anIntArray216[local9] += arg2;
				this.anIntArray213[local9] += arg3;
			}
		} else {
			@Pc(172) int local172;
			@Pc(190) int local190;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt3350; local9++) {
					this.anIntArray212[local9] -= Static19.anInt255;
					this.anIntArray216[local9] -= Static185.anInt3541;
					this.anIntArray213[local9] -= Static213.anInt3954;
					if (arg3 != 0) {
						local17 = Class50_Sub1.anIntArray225[arg3];
						local172 = Class50_Sub1.anIntArray224[arg3];
						local190 = local17 * this.anIntArray216[local9] + local172 * this.anIntArray212[local9] + 32767 >> 15;
						this.anIntArray216[local9] = this.anIntArray216[local9] * local172 + 32767 - local17 * this.anIntArray212[local9] >> 15;
						this.anIntArray212[local9] = local190;
					}
					if (arg1 != 0) {
						local17 = Class50_Sub1.anIntArray225[arg1];
						local172 = Class50_Sub1.anIntArray224[arg1];
						local190 = local172 * this.anIntArray216[local9] + 32767 - local17 * this.anIntArray213[local9] >> 15;
						this.anIntArray213[local9] = local172 * this.anIntArray213[local9] + this.anIntArray216[local9] * local17 + 32767 >> 15;
						this.anIntArray216[local9] = local190;
					}
					if (arg2 != 0) {
						local17 = Class50_Sub1.anIntArray225[arg2];
						local172 = Class50_Sub1.anIntArray224[arg2];
						local190 = this.anIntArray213[local9] * local17 + this.anIntArray212[local9] * local172 + 32767 >> 15;
						this.anIntArray213[local9] = this.anIntArray213[local9] * local172 + 32767 - local17 * this.anIntArray212[local9] >> 15;
						this.anIntArray212[local9] = local190;
					}
					this.anIntArray212[local9] += Static19.anInt255;
					this.anIntArray216[local9] += Static185.anInt3541;
					this.anIntArray213[local9] += Static213.anInt3954;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt3350; local9++) {
					this.anIntArray212[local9] -= Static19.anInt255;
					this.anIntArray216[local9] -= Static185.anInt3541;
					this.anIntArray213[local9] -= Static213.anInt3954;
					this.anIntArray212[local9] = this.anIntArray212[local9] * arg1 / 128;
					this.anIntArray216[local9] = arg2 * this.anIntArray216[local9] / 128;
					this.anIntArray213[local9] = this.anIntArray213[local9] * arg3 / 128;
					this.anIntArray212[local9] += Static19.anInt255;
					this.anIntArray216[local9] += Static185.anInt3541;
					this.anIntArray213[local9] += Static213.anInt3954;
				}
			} else {
				@Pc(519) Class115 local519;
				@Pc(524) Class85 local524;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt3355; local9++) {
						local17 = (this.aByteArray38[local9] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray38[local9] = (byte) local17;
					}
					if (this.aClass177_8 != null) {
						this.aClass177_8.anInterface11_7 = null;
					}
					if (this.aClass115Array1 != null) {
						for (local17 = 0; local17 < this.anInt3354; local17++) {
							local519 = this.aClass115Array1[local17];
							local524 = this.aClass85Array1[local17];
							local524.anInt2743 = local524.anInt2743 & 0xFFFFFF | 255 - (this.aByteArray38[local519.anInt3416] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt3355; local9++) {
						local17 = this.aShortArray100[local9] & 0xFFFF;
						local172 = local17 >> 10 & 0x3F;
						local190 = local17 >> 7 & 0x7;
						local190 += arg2 / 4;
						@Pc(587) int local587 = local17 & 0x7F;
						@Pc(594) int local594 = local172 + arg1 & 0x3F;
						local587 += arg3;
						if (local190 < 0) {
							local190 = 0;
						} else if (local190 > 7) {
							local190 = 7;
						}
						if (local587 < 0) {
							local587 = 0;
						} else if (local587 > 127) {
							local587 = 127;
						}
						this.aShortArray100[local9] = (short) (local594 << 10 | local190 << 7 | local587);
					}
					if (this.aClass177_8 != null) {
						this.aClass177_8.anInterface11_7 = null;
					}
					if (this.aClass115Array1 != null) {
						for (local17 = 0; local17 < this.anInt3354; local17++) {
							local519 = this.aClass115Array1[local17];
							local524 = this.aClass85Array1[local17];
							local524.anInt2743 = Static72.anIntArray115[this.aShortArray100[local519.anInt3416] & 0xFFFF] & 0xFFFFFF | local524.anInt2743 & 0xFF000000;
						}
					}
				} else {
					@Pc(706) Class85 local706;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt3354; local9++) {
							local706 = this.aClass85Array1[local9];
							local706.anInt2746 += arg2;
							local706.anInt2749 += arg1;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt3354; local9++) {
							local706 = this.aClass85Array1[local9];
							local706.anInt2748 = local706.anInt2748 * arg2 >> 7;
							local706.anInt2741 = local706.anInt2741 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt3354; local9++) {
							local706 = this.aClass85Array1[local9];
							local706.anInt2745 = local706.anInt2745 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "()V")
	@Override
	protected void j() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3339; local3++) {
			this.anIntArray212[local3] = this.anIntArray212[local3] + 7 >> 4;
			this.anIntArray216[local3] = this.anIntArray216[local3] + 7 >> 4;
			this.anIntArray213[local3] = this.anIntArray213[local3] + 7 >> 4;
		}
		if (this.aClass177_7 != null) {
			this.aClass177_7.anInterface11_7 = null;
		}
		this.aBoolean280 = false;
	}

	@OriginalMember(owner = "client!ip", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		if (!this.aBoolean280) {
			this.method2804();
		}
		return this.aShort27;
	}

	@OriginalMember(owner = "client!ip", name = "UA", descriptor = "(I)V")
	@Override
	public void UA(@OriginalArg(0) int arg0) {
		this.anInt3341 = arg0;
		this.aBoolean281 = true;
		if (this.aClass137_1 != null && (this.anInt3341 & 0x10000) == 0) {
			this.aShortArray101 = this.aClass137_1.aShortArray142;
			this.aShortArray102 = this.aClass137_1.aShortArray144;
			this.aByteArray39 = this.aClass137_1.aByteArray53;
			this.aShortArray103 = this.aClass137_1.aShortArray143;
			this.aClass137_1 = null;
		}
		this.method2807();
	}

	@OriginalMember(owner = "client!ip", name = "fa", descriptor = "(Lclient!ba;)Lclient!ba;")
	@Override
	public Class4_Sub1_Sub4 fa(@OriginalArg(0) Class4_Sub1_Sub4 arg0) {
		if (this.anInt3336 == 0) {
			return null;
		}
		if (!this.aBoolean280) {
			this.method2804();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass19_Sub2_21.anInt2289 > 0) {
			local40 = this.aShort29 - (this.aShort28 * this.aClass19_Sub2_21.anInt2289 >> 8) >> this.aClass19_Sub2_21.anInt2275;
			local57 = this.aShort31 - (this.lb * this.aClass19_Sub2_21.anInt2289 >> 8) >> this.aClass19_Sub2_21.anInt2275;
		} else {
			local40 = this.aShort29 - (this.lb * this.aClass19_Sub2_21.anInt2289 >> 8) >> this.aClass19_Sub2_21.anInt2275;
			local57 = this.aShort31 - (this.aShort28 * this.aClass19_Sub2_21.anInt2289 >> 8) >> this.aClass19_Sub2_21.anInt2275;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass19_Sub2_21.anInt2311 <= 0) {
			local114 = this.aShort27 - (this.aClass19_Sub2_21.anInt2311 * this.lb >> 8) >> this.aClass19_Sub2_21.anInt2275;
			local131 = this.aShort25 - (this.aClass19_Sub2_21.anInt2311 * this.aShort28 >> 8) >> this.aClass19_Sub2_21.anInt2275;
		} else {
			local114 = this.aShort27 - (this.aClass19_Sub2_21.anInt2311 * this.aShort28 >> 8) >> this.aClass19_Sub2_21.anInt2275;
			local131 = this.aShort25 - (this.lb * this.aClass19_Sub2_21.anInt2311 >> 8) >> this.aClass19_Sub2_21.anInt2275;
		}
		@Pc(172) int local172 = local57 + 1 - local40;
		@Pc(179) int local179 = local131 + 1 - local114;
		@Pc(182) Class4_Sub1_Sub4_Sub1 local182 = (Class4_Sub1_Sub4_Sub1) arg0;
		@Pc(198) Class4_Sub1_Sub4_Sub1 local198;
		if (local182 != null && local182.method2301(local172, local179)) {
			local198 = local182;
			local182.method2304();
		} else {
			local198 = new Class4_Sub1_Sub4_Sub1(this.aClass19_Sub2_21, local172, local179);
		}
		local198.method2299(local114, local40, local57, local131);
		this.method2800(local198);
		return local198;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!t;IIIZ)V")
	@Override
	public void method4891(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class110_Sub1 local8 = (Class110_Sub1) arg0;
		if (this.anInt3355 == 0 || local8.anInt3355 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt3350;
		@Pc(21) int[] local21 = local8.anIntArray212;
		@Pc(24) int[] local24 = local8.anIntArray216;
		@Pc(27) int[] local27 = local8.anIntArray213;
		@Pc(30) short[] local30 = local8.aShortArray103;
		@Pc(33) short[] local33 = local8.aShortArray101;
		@Pc(36) short[] local36 = local8.aShortArray102;
		@Pc(39) byte[] local39 = local8.aByteArray39;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(50) short[] local50;
		@Pc(46) byte[] local46;
		if (this.aClass137_1 == null) {
			local44 = null;
			local46 = null;
			local48 = null;
			local50 = null;
		} else {
			local48 = this.aClass137_1.aShortArray142;
			local46 = this.aClass137_1.aByteArray53;
			local50 = this.aClass137_1.aShortArray144;
			local44 = this.aClass137_1.aShortArray143;
		}
		@Pc(79) short[] local79;
		@Pc(83) short[] local83;
		@Pc(87) short[] local87;
		@Pc(75) byte[] local75;
		if (local8.aClass137_1 == null) {
			local75 = null;
			local79 = null;
			local83 = null;
			local87 = null;
		} else {
			local75 = local8.aClass137_1.aByteArray53;
			local79 = local8.aClass137_1.aShortArray143;
			local83 = local8.aClass137_1.aShortArray142;
			local87 = local8.aClass137_1.aShortArray144;
		}
		@Pc(100) int[] local100 = local8.anIntArray214;
		@Pc(103) short[] local103 = local8.aShortArray109;
		if (!local8.aBoolean280) {
			local8.method2804();
		}
		@Pc(112) short local112 = local8.lb;
		@Pc(115) short local115 = local8.aShort28;
		@Pc(118) short local118 = local8.aShort29;
		@Pc(121) short local121 = local8.aShort31;
		@Pc(124) short local124 = local8.aShort27;
		@Pc(127) short local127 = local8.aShort25;
		for (@Pc(129) int local129 = 0; local129 < this.anInt3350; local129++) {
			@Pc(139) int local139 = this.anIntArray216[local129] - arg2;
			if (local112 <= local139 && local115 >= local139) {
				@Pc(163) int local163 = this.anIntArray212[local129] - arg1;
				if (local163 >= local118 && local163 <= local121) {
					@Pc(178) int local178 = this.anIntArray213[local129] - arg3;
					if (local178 >= local124 && local127 >= local178) {
						@Pc(196) int local196 = -1;
						@Pc(201) int local201 = this.anIntArray214[local129];
						@Pc(208) int local208 = this.anIntArray214[local129 + 1];
						for (@Pc(210) int local210 = local201; local210 < local208; local210++) {
							local196 = this.aShortArray109[local210] - 1;
							if (local196 == -1 || this.aByteArray39[local196] != 0) {
								break;
							}
						}
						if (local196 != -1) {
							for (@Pc(243) int local243 = 0; local243 < local18; local243++) {
								if (local21[local243] == local163 && local27[local243] == local178 && local139 == local24[local243]) {
									@Pc(266) int local266 = -1;
									local201 = local100[local243];
									local208 = local100[local243 + 1];
									for (@Pc(278) int local278 = local201; local278 < local208; local278++) {
										local266 = local103[local278] - 1;
										if (local266 == -1 || local39[local266] != 0) {
											break;
										}
									}
									if (local266 != -1) {
										if (local44 == null) {
											this.aClass137_1 = new Class137();
											local44 = this.aClass137_1.aShortArray143 = Static112.method2031(this.aShortArray103);
											local48 = this.aClass137_1.aShortArray142 = Static112.method2031(this.aShortArray101);
											local50 = this.aClass137_1.aShortArray144 = Static112.method2031(this.aShortArray102);
											local46 = this.aClass137_1.aByteArray53 = Static52.method841(this.aByteArray39);
										}
										if (local79 == null) {
											@Pc(359) Class137 local359 = local8.aClass137_1 = new Class137();
											local79 = local359.aShortArray143 = Static112.method2031(local30);
											local83 = local359.aShortArray142 = Static112.method2031(local33);
											local87 = local359.aShortArray144 = Static112.method2031(local36);
											local75 = local359.aByteArray53 = Static52.method841(local39);
										}
										@Pc(392) short local392 = this.aShortArray103[local196];
										@Pc(397) short local397 = this.aShortArray101[local196];
										@Pc(402) short local402 = this.aShortArray102[local196];
										@Pc(407) byte local407 = this.aByteArray39[local196];
										local208 = local100[local243 + 1];
										local201 = local100[local243];
										@Pc(427) int local427;
										for (@Pc(419) int local419 = local201; local419 < local208; local419++) {
											local427 = local103[local419] - 1;
											if (local427 == -1) {
												break;
											}
											if (local75[local427] != 0) {
												local79[local427] += local392;
												local83[local427] += local397;
												local87[local427] += local402;
												local75[local427] += local407;
											}
										}
										local407 = local39[local266];
										local201 = this.anIntArray214[local129];
										local208 = this.anIntArray214[local129 + 1];
										local402 = local36[local266];
										local392 = local30[local266];
										local397 = local33[local266];
										for (local427 = local201; local427 < local208; local427++) {
											@Pc(510) int local510 = this.aShortArray109[local427] - 1;
											if (local510 == -1) {
												break;
											}
											if (local46[local510] != 0) {
												local44[local510] += local392;
												local48[local510] += local397;
												local50[local510] += local402;
												local46[local510] += local407;
											}
										}
										if (this.aClass177_10 == null && this.aClass177_8 != null) {
											this.aClass177_8.anInterface11_7 = null;
										}
										if (this.aClass177_10 != null) {
											this.aClass177_10.anInterface11_7 = null;
										}
										if (local8.aClass177_10 == null && local8.aClass177_8 != null) {
											local8.aClass177_8.anInterface11_7 = null;
										}
										if (local8.aClass177_10 != null) {
											local8.aClass177_10.anInterface11_7 = null;
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

	@OriginalMember(owner = "client!ip", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean280) {
			this.method2804();
		}
		return this.aShort26;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "()[Lclient!pf;")
	@Override
	public Class179[] method4885() {
		return this.aClass179Array2;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!tu;)V")
	private void method2794(@OriginalArg(1) Class31_Sub1 arg0) {
		@Pc(6) int local6;
		if (this.aClass29Array2 != null) {
			for (local6 = 0; local6 < this.aClass29Array2.length; local6++) {
				@Pc(13) Class29 local13 = this.aClass29Array2[local6];
				@Pc(15) Class29 local15 = local13;
				if (local13.aClass29_1 != null) {
					local15 = local13.aClass29_1;
				}
				local15.anInt699 = (int) ((float) this.anIntArray212[local13.anInt706] * arg0.aFloat202 + arg0.aFloat207 * (float) this.anIntArray216[local13.anInt706] + (float) this.anIntArray213[local13.anInt706] * arg0.aFloat208 + arg0.aFloat209);
				local15.anInt700 = (int) (arg0.aFloat205 + arg0.aFloat201 * (float) this.anIntArray213[local13.anInt706] + (float) this.anIntArray212[local13.anInt706] * arg0.aFloat200 + (float) this.anIntArray216[local13.anInt706] * arg0.aFloat204);
				local15.anInt711 = (int) (arg0.aFloat198 + arg0.aFloat199 * (float) this.anIntArray213[local13.anInt706] + (float) this.anIntArray216[local13.anInt706] * arg0.aFloat203 + arg0.aFloat206 * (float) this.anIntArray212[local13.anInt706]);
				local15.anInt701 = (int) (arg0.aFloat209 + arg0.aFloat208 * (float) this.anIntArray213[local13.anInt713] + arg0.aFloat207 * (float) this.anIntArray216[local13.anInt713] + (float) this.anIntArray212[local13.anInt713] * arg0.aFloat202);
				local15.anInt702 = (int) (arg0.aFloat200 * (float) this.anIntArray212[local13.anInt713] + arg0.aFloat204 * (float) this.anIntArray216[local13.anInt713] + arg0.aFloat201 * (float) this.anIntArray213[local13.anInt713] + arg0.aFloat205);
				local15.anInt707 = (int) ((float) this.anIntArray213[local13.anInt713] * arg0.aFloat199 + (float) this.anIntArray216[local13.anInt713] * arg0.aFloat203 + arg0.aFloat206 * (float) this.anIntArray212[local13.anInt713] + arg0.aFloat198);
				local15.anInt708 = (int) (arg0.aFloat209 + (float) this.anIntArray216[local13.anInt698] * arg0.aFloat207 + arg0.aFloat202 * (float) this.anIntArray212[local13.anInt698] + (float) this.anIntArray213[local13.anInt698] * arg0.aFloat208);
				local15.anInt703 = (int) (arg0.aFloat205 + (float) this.anIntArray213[local13.anInt698] * arg0.aFloat201 + arg0.aFloat204 * (float) this.anIntArray216[local13.anInt698] + (float) this.anIntArray212[local13.anInt698] * arg0.aFloat200);
				local15.anInt709 = (int) (arg0.aFloat198 + arg0.aFloat199 * (float) this.anIntArray213[local13.anInt698] + arg0.aFloat206 * (float) this.anIntArray212[local13.anInt698] + (float) this.anIntArray216[local13.anInt698] * arg0.aFloat203);
			}
		}
		if (this.aClass179Array2 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass179Array2.length; local6++) {
			@Pc(363) Class179 local363 = this.aClass179Array2[local6];
			@Pc(365) Class179 local365 = local363;
			if (local363.aClass179_2 != null) {
				local365 = local363.aClass179_2;
			}
			if (local363.aClass31_4 == null) {
				local363.aClass31_4 = arg0.method5657();
			} else {
				local363.aClass31_4.za(arg0);
			}
			local365.anInt5342 = (int) (arg0.aFloat209 + (float) this.anIntArray213[local363.anInt5338] * arg0.aFloat208 + arg0.aFloat207 * (float) this.anIntArray216[local363.anInt5338] + (float) this.anIntArray212[local363.anInt5338] * arg0.aFloat202);
			local365.anInt5340 = (int) ((float) this.anIntArray212[local363.anInt5338] * arg0.aFloat200 + arg0.aFloat204 * (float) this.anIntArray216[local363.anInt5338] + (float) this.anIntArray213[local363.anInt5338] * arg0.aFloat201 + arg0.aFloat205);
			local365.anInt5347 = (int) ((float) this.anIntArray213[local363.anInt5338] * arg0.aFloat199 + arg0.aFloat203 * (float) this.anIntArray216[local363.anInt5338] + arg0.aFloat206 * (float) this.anIntArray212[local363.anInt5338] + arg0.aFloat198);
		}
	}

	@OriginalMember(owner = "client!ip", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean280) {
			this.method2804();
		}
		return this.aShort29;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class50_Sub1.anIntArray225[arg0];
		@Pc(13) int local13 = Class50_Sub1.anIntArray224[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3350; local15++) {
			local33 = this.anIntArray212[local15] * local13 + this.anIntArray213[local15] * local9 >> 15;
			this.anIntArray213[local15] = local13 * this.anIntArray213[local15] - local9 * this.anIntArray212[local15] >> 15;
			this.anIntArray212[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt3336; local33++) {
			@Pc(83) int local83 = local13 * this.aShortArray103[local33] + this.aShortArray102[local33] * local9 >> 15;
			this.aShortArray102[local33] = (short) (local13 * this.aShortArray102[local33] - local9 * this.aShortArray103[local33] >> 15);
			this.aShortArray103[local33] = (short) local83;
		}
		if (this.aClass177_10 == null && this.aClass177_8 != null) {
			this.aClass177_8.anInterface11_7 = null;
		}
		if (this.aClass177_10 != null) {
			this.aClass177_10.anInterface11_7 = null;
		}
		this.aBoolean280 = false;
		if (this.aClass177_7 != null) {
			this.aClass177_7.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!ip", name = "D", descriptor = "()I")
	@Override
	public int D() {
		return this.aShort32;
	}

	@OriginalMember(owner = "client!ip", name = "BA", descriptor = "(SS)V")
	@Override
	public void BA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3355; local7++) {
			if (this.aShortArray100[local7] == arg0) {
				this.aShortArray100[local7] = arg1;
			}
		}
		if (this.aClass115Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt3354; local34++) {
				@Pc(41) Class115 local41 = this.aClass115Array1[local34];
				@Pc(46) Class85 local46 = this.aClass85Array1[local34];
				local46.anInt2743 = Static72.anIntArray115[this.aShortArray100[local41.anInt3416] & 0xFFFF] & 0xFFFFFF | local46.anInt2743 & 0xFF000000;
			}
		}
		if (this.aClass177_8 != null) {
			this.aClass177_8.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!ip", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class50_Sub1.anIntArray225[arg0];
		@Pc(13) int local13 = Class50_Sub1.anIntArray224[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3350; local15++) {
			@Pc(34) int local34 = this.anIntArray216[local15] * local13 - this.anIntArray213[local15] * local9 >> 15;
			this.anIntArray213[local15] = local13 * this.anIntArray213[local15] + this.anIntArray216[local15] * local9 >> 15;
			this.anIntArray216[local15] = local34;
		}
		if (this.aClass177_7 != null) {
			this.aClass177_7.anInterface11_7 = null;
		}
		this.aBoolean280 = false;
	}

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "(IILclient!ta;Lclient!ta;III)V")
	@Override
	public void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean280) {
			this.method2804();
		}
		@Pc(16) int local16 = arg4 + this.aShort29;
		@Pc(22) int local22 = arg4 + this.aShort31;
		@Pc(28) int local28 = arg6 + this.aShort27;
		@Pc(33) int local33 = this.aShort25 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local22 + arg2.anInt5261 >> arg2.anInt5256 >= arg2.anInt5262 || local28 < 0 || arg2.anInt5258 <= local33 + arg2.anInt5261 >> arg2.anInt5256)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local22 + arg3.anInt5261 >> arg3.anInt5256 >= arg3.anInt5262 || local28 < 0 || local33 + arg3.anInt5261 >> arg3.anInt5256 >= arg3.anInt5258) {
				return;
			}
		} else {
			local16 >>= arg2.anInt5256;
			local22 = arg2.anInt5261 + local22 - 1 >> arg2.anInt5256;
			local28 >>= arg2.anInt5256;
			local33 = arg2.anInt5261 + local33 - 1 >> arg2.anInt5256;
			if (arg5 == arg2.l(local16, local28) && arg2.l(local22, local28) == arg5 && arg5 == arg2.l(local16, local33) && arg5 == arg2.l(local22, local33)) {
				return;
			}
		}
		@Pc(209) int local209;
		if (arg0 == 1) {
			for (local209 = 0; local209 < this.anInt3350; local209++) {
				this.anIntArray216[local209] = this.anIntArray216[local209] + arg2.a(arg4 + this.anIntArray212[local209], this.anIntArray213[local209] - -arg6) - arg5;
			}
		} else {
			@Pc(211) int local211;
			@Pc(220) int local220;
			if (arg0 == 2) {
				@Pc(422) short local422 = this.lb;
				if (local422 == 0) {
					return;
				}
				for (local211 = 0; local211 < this.anInt3350; local211++) {
					local220 = (this.anIntArray216[local211] << 16) / local422;
					if (local220 < arg1) {
						this.anIntArray216[local211] += (arg1 - local220) * (-arg5 + arg2.a(arg4 + this.anIntArray212[local211], this.anIntArray213[local211] - -arg6)) / arg1;
					}
				}
			} else {
				@Pc(227) int local227;
				if (arg0 == 3) {
					local209 = (arg1 & 0xFF) * 4;
					local211 = (arg1 >> 8 & 0xFF) * 4;
					local220 = (arg1 >> 16 & 0xFF) << 6;
					local227 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local209 >> 1) < 0 || (local209 >> 1) + arg4 + arg2.anInt5261 >= arg2.anInt5262 << arg2.anInt5256 || arg6 - (local211 >> 1) < 0 || (local211 >> 1) + arg6 + arg2.anInt5261 >= arg2.anInt5258 << arg2.anInt5256) {
						return;
					}
					this.method4884(arg4, arg6, local211, local220, arg2, local209, local227, arg5);
				} else if (arg0 == 4) {
					local209 = this.aShort28 - this.lb;
					for (local211 = 0; local211 < this.anInt3350; local211++) {
						this.anIntArray216[local211] = local209 + this.anIntArray216[local211] + arg3.a(arg4 + this.anIntArray212[local211], arg6 + this.anIntArray213[local211]) - arg5;
					}
				} else if (arg0 == 5) {
					local209 = this.aShort28 - this.lb;
					for (local211 = 0; local211 < this.anInt3350; local211++) {
						local220 = arg4 + this.anIntArray212[local211];
						local227 = this.anIntArray213[local211] + arg6;
						@Pc(232) int local232 = arg2.a(local220, local227);
						@Pc(237) int local237 = arg3.a(local220, local227);
						@Pc(241) int local241 = local232 - local237;
						this.anIntArray216[local211] = local232 + (local241 * ((this.anIntArray216[local211] << 8) / local209) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass177_7 != null) {
			this.aClass177_7.anInterface11_7 = null;
		}
		this.aBoolean280 = false;
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "()Z")
	@Override
	public boolean method4890() {
		if (this.aShortArray107 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray107.length; local12++) {
			if (this.aShortArray107[local12] != -1 && !this.aClass19_Sub2_21.anInterface7_6.method2392(this.aShortArray107[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ip", name = "NA", descriptor = "()I")
	@Override
	public int NA() {
		if (!this.aBoolean280) {
			this.method2804();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "()I")
	@Override
	public int l() {
		return this.aShort30;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method4894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class31_Sub1 local8 = (Class31_Sub1) arg2;
		@Pc(12) Class31_Sub1 local12 = this.aClass19_Sub2_21.aClass31_Sub1_4;
		@Pc(33) float local33 = local12.aFloat209 + local8.aFloat205 * local12.aFloat207 + local8.aFloat209 * local12.aFloat202 + local8.aFloat198 * local12.aFloat208;
		@Pc(54) float local54 = local12.aFloat200 * local8.aFloat209 + local12.aFloat204 * local8.aFloat205 + local12.aFloat201 * local8.aFloat198 + local12.aFloat205;
		Static415.aFloat213 = local8.aFloat199 * local12.aFloat201 + local8.aFloat201 * local12.aFloat204 + local12.aFloat200 * local8.aFloat208;
		Static276.aFloat30 = local8.aFloat204 * local12.aFloat207 + local8.aFloat207 * local12.aFloat202 + local8.aFloat203 * local12.aFloat208;
		Static203.aFloat126 = local12.aFloat206 * local8.aFloat208 + local8.aFloat201 * local12.aFloat203 + local8.aFloat199 * local12.aFloat199;
		Static69.aFloat113 = local8.aFloat201 * local12.aFloat207 + local12.aFloat202 * local8.aFloat208 + local12.aFloat208 * local8.aFloat199;
		Static360.aFloat189 = local8.aFloat204 * local12.aFloat203 + local8.aFloat207 * local12.aFloat206 + local8.aFloat203 * local12.aFloat199;
		Static234.aFloat140 = local12.aFloat208 * local8.aFloat206 + local8.aFloat202 * local12.aFloat202 + local8.aFloat200 * local12.aFloat207;
		@Pc(183) float local183 = local8.aFloat209 * local12.aFloat206 + local12.aFloat203 * local8.aFloat205 + local8.aFloat198 * local12.aFloat199 + local12.aFloat198;
		Static452.aFloat227 = local8.aFloat202 * local12.aFloat206 + local12.aFloat203 * local8.aFloat200 + local12.aFloat199 * local8.aFloat206;
		Static287.aFloat163 = local8.aFloat204 * local12.aFloat204 + local12.aFloat200 * local8.aFloat207 + local12.aFloat201 * local8.aFloat203;
		Static344.aFloat184 = local12.aFloat201 * local8.aFloat206 + local8.aFloat200 * local12.aFloat204 + local8.aFloat202 * local12.aFloat200;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass19_Sub2_21.anInt2309;
		@Pc(255) int local255 = this.aClass19_Sub2_21.anInt2294;
		if (!this.aBoolean280) {
			this.method2804();
		}
		Static116.anIntArray328[0] = this.aShort29;
		Static273.anIntArray334[0] = this.lb;
		Static116.anIntArray328[1] = this.aShort31;
		Static20.anIntArray13[0] = this.aShort27;
		Static273.anIntArray334[1] = this.lb;
		Static20.anIntArray13[1] = this.aShort27;
		Static116.anIntArray328[2] = this.aShort29;
		Static273.anIntArray334[2] = this.aShort28;
		Static20.anIntArray13[2] = this.aShort27;
		Static116.anIntArray328[3] = this.aShort31;
		Static273.anIntArray334[3] = this.aShort28;
		Static116.anIntArray328[4] = this.aShort29;
		Static20.anIntArray13[3] = this.aShort27;
		Static273.anIntArray334[4] = this.lb;
		Static116.anIntArray328[5] = this.aShort31;
		Static20.anIntArray13[4] = this.aShort25;
		Static273.anIntArray334[5] = this.lb;
		Static116.anIntArray328[6] = this.aShort29;
		Static20.anIntArray13[5] = this.aShort25;
		Static273.anIntArray334[6] = this.aShort28;
		Static20.anIntArray13[6] = this.aShort25;
		Static116.anIntArray328[7] = this.aShort31;
		Static273.anIntArray334[7] = this.aShort28;
		Static20.anIntArray13[7] = this.aShort25;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(395) float local395;
		@Pc(390) float local390;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static273.anIntArray334[local383];
			local395 = Static116.anIntArray328[local383];
			local400 = Static20.anIntArray13[local383];
			local414 = Static203.aFloat126 * local400 + local395 * Static452.aFloat227 + Static360.aFloat189 * local390 + local183;
			local428 = local390 * Static287.aFloat163 + Static344.aFloat184 * local395 + local400 * Static415.aFloat213 + local54;
			local442 = local33 + local390 * Static276.aFloat30 + Static234.aFloat140 * local395 + Static69.aFloat113 * local400;
			if (local414 >= (float) this.aClass19_Sub2_21.anInt2290) {
				@Pc(461) float local461 = (float) this.aClass19_Sub2_21.anInt2295 + local442 * (float) local251 / local414;
				if (local461 < local241) {
					local241 = local461;
				}
				if (local461 > local243) {
					local243 = local461;
				}
				@Pc(485) float local485 = (float) this.aClass19_Sub2_21.anInt2297 + (float) local255 * local428 / local414;
				local239 = true;
				if (local245 > local485) {
					local245 = local485;
				}
				if (local247 < local485) {
					local247 = local485;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (Static231.anIntArray298.length < this.anInt3336) {
				Static173.anIntArray219 = new int[this.anInt3336];
				Static231.anIntArray298 = new int[this.anInt3336];
			}
			@Pc(628) int local628;
			for (@Pc(546) int local546 = 0; local546 < this.anInt3350; local546++) {
				local395 = this.anIntArray212[local546];
				local390 = this.anIntArray216[local546];
				local400 = this.anIntArray213[local546];
				local442 = local33 + local390 * Static276.aFloat30 + Static234.aFloat140 * local395 + Static69.aFloat113 * local400;
				local414 = local183 + Static203.aFloat126 * local400 + local390 * Static360.aFloat189 + local395 * Static452.aFloat227;
				local428 = local54 + Static415.aFloat213 * local400 + Static344.aFloat184 * local395 + local390 * Static287.aFloat163;
				@Pc(641) int local641;
				@Pc(646) int local646;
				@Pc(653) int local653;
				if ((float) this.aClass19_Sub2_21.anInt2290 <= local414) {
					local628 = (int) (local442 * (float) local251 / local414 + (float) this.aClass19_Sub2_21.anInt2295);
					local641 = (int) (local428 * (float) local255 / local414 + (float) this.aClass19_Sub2_21.anInt2297);
					local646 = this.anIntArray214[local546];
					local653 = this.anIntArray214[local546 + 1];
					for (@Pc(655) int local655 = local646; local655 < local653; local655++) {
						@Pc(664) int local664 = this.aShortArray109[local655] - 1;
						if (local664 == -1) {
							break;
						}
						Static231.anIntArray298[local664] = local628;
						Static173.anIntArray219[local664] = local641;
					}
				} else {
					local628 = this.anIntArray214[local546];
					local641 = this.anIntArray214[local546 + 1];
					for (local646 = local628; local646 < local641; local646++) {
						local653 = this.aShortArray109[local646] - 1;
						if (local653 == -1) {
							break;
						}
						Static231.anIntArray298[this.aShortArray109[local646] - 1] = -999999;
					}
				}
			}
			for (local628 = 0; local628 < this.anInt3355; local628++) {
				if (Static231.anIntArray298[this.aShortArray108[local628]] != -999999 && Static231.anIntArray298[this.aShortArray105[local628]] != -999999 && Static231.anIntArray298[this.aShortArray106[local628]] != -999999 && this.method2806(Static231.anIntArray298[this.aShortArray108[local628]], Static173.anIntArray219[this.aShortArray108[local628]], Static231.anIntArray298[this.aShortArray106[local628]], arg1, Static231.anIntArray298[this.aShortArray105[local628]], Static173.anIntArray219[this.aShortArray105[local628]], Static173.anIntArray219[this.aShortArray106[local628]], arg0)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "()I")
	@Override
	public int m() {
		if (!this.aBoolean280) {
			this.method2804();
		}
		return this.aShort25;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
	private void method2797() {
		if (this.anInt3301 == 0) {
			return;
		}
		if (this.aByte19 != 0) {
			this.method2799(true);
		}
		this.method2799(false);
		if (this.aClass230_1 != null) {
			if (this.aClass230_1.anInterface1_5 == null) {
				this.method2808((this.aByte19 & 0x10) != 0);
			}
			if (this.aClass230_1.anInterface1_5 != null) {
				this.aClass19_Sub2_21.method1906(this.aClass177_10 != null);
				this.aClass19_Sub2_21.method1934(this.aClass177_8, this.aClass177_10, this.aClass177_9, this.aClass177_7);
				@Pc(73) int local73 = this.anIntArray215.length - 1;
				for (@Pc(75) int local75 = 0; local75 < local73; local75++) {
					@Pc(82) int local82 = this.anIntArray215[local75];
					@Pc(89) int local89 = this.anIntArray215[local75 + 1];
					@Pc(96) int local96 = this.aShortArray107[local82] & 0xFFFF;
					if (local96 == 65535) {
						local96 = -1;
					}
					this.aClass19_Sub2_21.method1938(local96, this.aClass177_10 != null);
					this.aClass19_Sub2_21.method1967(local82 * 3, (local89 - local82) * 3, this.aClass230_1.anInterface1_5);
				}
			}
		}
		this.method2807();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIBBS)I")
	private int method2798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) short arg3) {
		@Pc(20) int local20 = Static72.anIntArray115[Static21.method236(arg1, arg0)];
		if (arg3 != -1) {
			@Pc(32) Class251 local32 = this.aClass19_Sub2_21.anInterface7_6.method2396(arg3 & 0xFFFF);
			@Pc(37) int local37 = local32.aByte90 & 0xFF;
			@Pc(51) int local51;
			@Pc(68) int local68;
			if (local37 != 0) {
				if (arg1 < 0) {
					local51 = 0;
				} else if (arg1 <= 127) {
					local51 = arg1 * 131586;
				} else {
					local51 = 16777215;
				}
				if (local37 == 256) {
					local20 = local51;
				} else {
					local68 = 256 - local37;
					local20 = (local37 * (local51 & 0xFF00FF) + local68 * (local20 & 0xFF00FF) & 0xFF00FF00) + (local68 * (local20 & 0xFF00) + local37 * (local51 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local51 = local32.aByte87 & 0xFF;
			if (local51 != 0) {
				local51 += 256;
				@Pc(119) int local119 = (local20 >> 16 & 0xFF) * local51;
				if (local119 > 65535) {
					local119 = 65535;
				}
				local68 = local51 * (local20 >> 8 & 0xFF);
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(145) int local145 = local51 * (local20 & 0xFF);
				if (local145 > 65535) {
					local145 = 65535;
				}
				local20 = (local68 & 0xFF00) + ((local119 << 8 & 0xFF00F4) + (local145 >> 8));
			}
		}
		return (local20 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IZ)V")
	private void method2799(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass177_8 != null && this.aClass177_8.anInterface11_7 == null;
		@Pc(27) boolean local27 = this.aClass177_10 != null && this.aClass177_10.anInterface11_7 == null;
		@Pc(38) boolean local38 = this.aClass177_7 != null && this.aClass177_7.anInterface11_7 == null;
		@Pc(49) boolean local49 = this.aClass177_9 != null && this.aClass177_9.anInterface11_7 == null;
		if (arg0) {
			local38 &= (this.aByte19 & 0x1) != 0;
			local27 &= (this.aByte19 & 0x4) != 0;
			local16 &= (this.aByte19 & 0x2) != 0;
			local49 &= (this.aByte19 & 0x8) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(116) byte local116 = 0;
		if (local38) {
			local106 = 12;
		}
		@Pc(127) byte local127 = 0;
		if (local16) {
			local110 = local106;
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
		if (Static370.aClass4_Sub12_Sub2_3.aByteArray36.length >= this.anInt3336 * local106) {
			Static370.aClass4_Sub12_Sub2_3.anInt2997 = 0;
		} else {
			Static370.aClass4_Sub12_Sub2_3 = new Class4_Sub12_Sub2(local106 * (this.anInt3336 + 100));
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
			if (this.aClass19_Sub2_21.aBoolean215) {
				for (local191 = 0; local191 < this.anInt3350; local191++) {
					local200 = NativeStream.floatToRawIntBits((float) this.anIntArray212[local191]);
					local207 = NativeStream.floatToRawIntBits((float) this.anIntArray216[local191]);
					local214 = NativeStream.floatToRawIntBits((float) this.anIntArray213[local191]);
					local219 = this.anIntArray214[local191];
					local226 = this.anIntArray214[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray109[local228] - 1;
						if (local237 == -1) {
							break;
						}
						Static370.aClass4_Sub12_Sub2_3.anInt2997 = local106 * local237;
						Static370.aClass4_Sub12_Sub2_3.method2531(local200);
						Static370.aClass4_Sub12_Sub2_3.method2531(local207);
						Static370.aClass4_Sub12_Sub2_3.method2531(local214);
					}
				}
			} else {
				for (local191 = 0; local191 < this.anInt3350; local191++) {
					local200 = NativeStream.floatToRawIntBits((float) this.anIntArray212[local191]);
					local207 = NativeStream.floatToRawIntBits((float) this.anIntArray216[local191]);
					local214 = NativeStream.floatToRawIntBits((float) this.anIntArray213[local191]);
					local219 = this.anIntArray214[local191];
					local226 = this.anIntArray214[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray109[local228] - 1;
						if (local237 == -1) {
							break;
						}
						Static370.aClass4_Sub12_Sub2_3.anInt2997 = local237 * local106;
						Static370.aClass4_Sub12_Sub2_3.method2550(local200);
						Static370.aClass4_Sub12_Sub2_3.method2550(local207);
						Static370.aClass4_Sub12_Sub2_3.method2550(local214);
					}
				}
			}
		}
		@Pc(565) float local565;
		@Pc(451) short[] local451;
		@Pc(447) short[] local447;
		@Pc(439) short[] local439;
		@Pc(443) byte[] local443;
		@Pc(598) float local598;
		if (local16) {
			if (this.aClass177_10 == null) {
				if (this.aClass137_1 == null) {
					local451 = this.aShortArray103;
					local447 = this.aShortArray101;
					local443 = this.aByteArray39;
					local439 = this.aShortArray102;
				} else {
					local439 = this.aClass137_1.aShortArray144;
					local443 = this.aClass137_1.aByteArray53;
					local447 = this.aClass137_1.aShortArray142;
					local451 = this.aClass137_1.aShortArray143;
				}
				@Pc(471) float local471 = this.aClass19_Sub2_21.aFloatArray19[0];
				@Pc(477) float local477 = this.aClass19_Sub2_21.aFloatArray19[1];
				@Pc(483) float local483 = this.aClass19_Sub2_21.aFloatArray19[2];
				@Pc(487) float local487 = this.aClass19_Sub2_21.aFloat70;
				@Pc(497) float local497 = this.aClass19_Sub2_21.aFloat73 * 768.0F / (float) this.aShort30;
				@Pc(507) float local507 = this.aClass19_Sub2_21.aFloat65 * 768.0F / (float) this.aShort30;
				for (@Pc(509) int local509 = 0; local509 < this.anInt3355; local509++) {
					@Pc(529) int local529 = this.method2798(this.aShortArray100[local509], this.aShort32, this.aByteArray38[local509], this.aShortArray107[local509]);
					@Pc(534) short local534 = this.aShortArray108[local509];
					@Pc(545) float local545 = (float) (local529 >> 8 & 0xFF) * this.aClass19_Sub2_21.aFloat74;
					@Pc(554) float local554 = this.aClass19_Sub2_21.aFloat72 * (float) (local529 >>> 24);
					local565 = (float) (local529 >> 16 & 0xFF) * this.aClass19_Sub2_21.aFloat58;
					@Pc(570) short local570 = (short) local443[local534];
					if (local570 == 0) {
						local598 = (local483 * (float) local439[local534] + (float) local447[local534] * local477 + local471 * (float) local451[local534]) * 0.0026041667F;
					} else {
						local598 = ((float) local439[local534] * local483 + local471 * (float) local451[local534] + (float) local447[local534] * local477) / (float) (local570 * 256);
					}
					@Pc(638) float local638 = local487 + (local598 < 0.0F ? local507 : local497) * local598;
					@Pc(643) int local643 = (int) (local554 * local638);
					@Pc(648) int local648 = (int) (local638 * local565);
					if (local643 < 0) {
						local643 = 0;
					} else if (local643 > 255) {
						local643 = 255;
					}
					if (local648 < 0) {
						local648 = 0;
					} else if (local648 > 255) {
						local648 = 255;
					}
					@Pc(682) int local682 = (int) (local545 * local638);
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					Static370.aClass4_Sub12_Sub2_3.anInt2997 = local534 * local106 + local110;
					Static370.aClass4_Sub12_Sub2_3.method2551(local643);
					Static370.aClass4_Sub12_Sub2_3.method2551(local648);
					Static370.aClass4_Sub12_Sub2_3.method2551(local682);
					Static370.aClass4_Sub12_Sub2_3.method2551(255 - (this.aByteArray38[local509] & 0xFF));
					local534 = this.aShortArray105[local509];
					local570 = local443[local534];
					if (local570 == 0) {
						local598 = (local471 * (float) local451[local534] + (float) local447[local534] * local477 + local483 * (float) local439[local534]) * 0.0026041667F;
					} else {
						local598 = ((float) local439[local534] * local483 + (float) local451[local534] * local471 + local477 * (float) local447[local534]) / (float) (local570 * 256);
					}
					local638 = local598 * (local598 < 0.0F ? local507 : local497) + local487;
					local643 = (int) (local554 * local638);
					local648 = (int) (local565 * local638);
					if (local643 < 0) {
						local643 = 0;
					} else if (local643 > 255) {
						local643 = 255;
					}
					if (local648 < 0) {
						local648 = 0;
					} else if (local648 > 255) {
						local648 = 255;
					}
					local682 = (int) (local545 * local638);
					Static370.aClass4_Sub12_Sub2_3.anInt2997 = local110 + local106 * local534;
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					Static370.aClass4_Sub12_Sub2_3.method2551(local643);
					Static370.aClass4_Sub12_Sub2_3.method2551(local648);
					Static370.aClass4_Sub12_Sub2_3.method2551(local682);
					Static370.aClass4_Sub12_Sub2_3.method2551(255 - (this.aByteArray38[local509] & 0xFF));
					local534 = this.aShortArray106[local509];
					local570 = local443[local534];
					if (local570 == 0) {
						local598 = ((float) local439[local534] * local483 + (float) local451[local534] * local471 + local477 * (float) local447[local534]) * 0.0026041667F;
					} else {
						local598 = (local483 * (float) local439[local534] + local471 * (float) local451[local534] + (float) local447[local534] * local477) / (float) (local570 * 256);
					}
					local638 = local487 + (local598 < 0.0F ? local507 : local497) * local598;
					local643 = (int) (local638 * local554);
					local648 = (int) (local565 * local638);
					if (local643 < 0) {
						local643 = 0;
					} else if (local643 > 255) {
						local643 = 255;
					}
					if (local648 < 0) {
						local648 = 0;
					} else if (local648 > 255) {
						local648 = 255;
					}
					local682 = (int) (local545 * local638);
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					Static370.aClass4_Sub12_Sub2_3.anInt2997 = local110 + local534 * local106;
					Static370.aClass4_Sub12_Sub2_3.method2551(local643);
					Static370.aClass4_Sub12_Sub2_3.method2551(local648);
					Static370.aClass4_Sub12_Sub2_3.method2551(local682);
					Static370.aClass4_Sub12_Sub2_3.method2551(255 - (this.aByteArray38[local509] & 0xFF));
				}
			} else {
				for (local191 = 0; local191 < this.anInt3355; local191++) {
					local200 = this.method2798(this.aShortArray100[local191], this.aShort32, this.aByteArray38[local191], this.aShortArray107[local191]);
					Static370.aClass4_Sub12_Sub2_3.anInt2997 = local110 + this.aShortArray108[local191] * local106;
					Static370.aClass4_Sub12_Sub2_3.method2531(local200);
					Static370.aClass4_Sub12_Sub2_3.anInt2997 = local110 + local106 * this.aShortArray105[local191];
					Static370.aClass4_Sub12_Sub2_3.method2531(local200);
					Static370.aClass4_Sub12_Sub2_3.anInt2997 = local106 * this.aShortArray106[local191] + local110;
					Static370.aClass4_Sub12_Sub2_3.method2531(local200);
				}
			}
		}
		if (local27) {
			if (this.aClass137_1 == null) {
				local447 = this.aShortArray101;
				local443 = this.aByteArray39;
				local439 = this.aShortArray102;
				local451 = this.aShortArray103;
			} else {
				local439 = this.aClass137_1.aShortArray144;
				local447 = this.aClass137_1.aShortArray142;
				local443 = this.aClass137_1.aByteArray53;
				local451 = this.aClass137_1.aShortArray143;
			}
			@Pc(1102) float local1102 = 3.0F / (float) this.aShort30;
			Static370.aClass4_Sub12_Sub2_3.anInt2997 = local116;
			local598 = 3.0F / (float) (this.aShort30 + this.aShort30 / 2);
			if (this.aClass19_Sub2_21.aBoolean215) {
				for (local228 = 0; local228 < this.anInt3336; local228++) {
					local237 = local443[local228] & 0xFF;
					if (local237 == 0) {
						Static370.aClass4_Sub12_Sub2_3.method2556(local598 * (float) local451[local228]);
						Static370.aClass4_Sub12_Sub2_3.method2556((float) local447[local228] * local598);
						Static370.aClass4_Sub12_Sub2_3.method2556((float) local439[local228] * local598);
					} else {
						local565 = local1102 / (float) local237;
						Static370.aClass4_Sub12_Sub2_3.method2556((float) local451[local228] * local565);
						Static370.aClass4_Sub12_Sub2_3.method2556((float) local447[local228] * local565);
						Static370.aClass4_Sub12_Sub2_3.method2556((float) local439[local228] * local565);
					}
					Static370.aClass4_Sub12_Sub2_3.anInt2997 += local106 - 12;
				}
			} else {
				for (local228 = 0; local228 < this.anInt3336; local228++) {
					local237 = local443[local228] & 0xFF;
					if (local237 == 0) {
						Static370.aClass4_Sub12_Sub2_3.method2552((float) local451[local228] * local598);
						Static370.aClass4_Sub12_Sub2_3.method2552((float) local447[local228] * local598);
						Static370.aClass4_Sub12_Sub2_3.method2552((float) local439[local228] * local598);
					} else {
						local565 = local1102 / (float) local237;
						Static370.aClass4_Sub12_Sub2_3.method2552(local565 * (float) local451[local228]);
						Static370.aClass4_Sub12_Sub2_3.method2552(local565 * (float) local447[local228]);
						Static370.aClass4_Sub12_Sub2_3.method2552((float) local439[local228] * local565);
					}
					Static370.aClass4_Sub12_Sub2_3.anInt2997 += local106 - 12;
				}
			}
		}
		if (local49) {
			Static370.aClass4_Sub12_Sub2_3.anInt2997 = local127;
			if (this.aClass19_Sub2_21.aBoolean215) {
				for (local191 = 0; local191 < this.anInt3336; local191++) {
					Static370.aClass4_Sub12_Sub2_3.method2556(this.aFloatArray21[local191]);
					Static370.aClass4_Sub12_Sub2_3.method2556(this.aFloatArray20[local191]);
					Static370.aClass4_Sub12_Sub2_3.anInt2997 += local106 - 8;
				}
			} else {
				for (local191 = 0; local191 < this.anInt3336; local191++) {
					Static370.aClass4_Sub12_Sub2_3.method2552(this.aFloatArray21[local191]);
					Static370.aClass4_Sub12_Sub2_3.method2552(this.aFloatArray20[local191]);
					Static370.aClass4_Sub12_Sub2_3.anInt2997 += local106 - 8;
				}
			}
		}
		Static370.aClass4_Sub12_Sub2_3.anInt2997 = this.anInt3336 * local106;
		@Pc(1410) Interface11 local1410;
		if (arg0) {
			if (this.anInterface11_4 == null) {
				this.anInterface11_4 = this.aClass19_Sub2_21.method1960(Static370.aClass4_Sub12_Sub2_3.anInt2997, Static370.aClass4_Sub12_Sub2_3.aByteArray36, true, local106);
			} else {
				this.anInterface11_4.method5184(Static370.aClass4_Sub12_Sub2_3.anInt2997, local106, Static370.aClass4_Sub12_Sub2_3.aByteArray36);
			}
			local1410 = this.anInterface11_4;
			this.aByte19 = 0;
		} else {
			local1410 = this.aClass19_Sub2_21.method1960(Static370.aClass4_Sub12_Sub2_3.anInt2997, Static370.aClass4_Sub12_Sub2_3.aByteArray36, false, local106);
			this.aBoolean281 = true;
		}
		if (local38) {
			this.aClass177_7.aByte55 = 0;
			this.aClass177_7.anInterface11_7 = local1410;
		}
		if (local49) {
			this.aClass177_9.anInterface11_7 = local1410;
			this.aClass177_9.aByte55 = local127;
		}
		if (local16) {
			this.aClass177_8.anInterface11_7 = local1410;
			this.aClass177_8.aByte55 = local110;
		}
		if (local27) {
			this.aClass177_10.aByte55 = local116;
			this.aClass177_10.anInterface11_7 = local1410;
		}
	}

	@OriginalMember(owner = "client!ip", name = "aa", descriptor = "(I)V")
	@Override
	public void aa(@OriginalArg(0) int arg0) {
		if (this.aClass177_8 != null) {
			this.aClass177_8.anInterface11_7 = null;
		}
		this.aShort30 = (short) arg0;
		if (this.aClass177_10 != null) {
			this.aClass177_10.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "()Z")
	@Override
	protected boolean w() {
		if (this.anIntArrayArray34 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt3339; local12++) {
			this.anIntArray212[local12] <<= 0x4;
			this.anIntArray216[local12] <<= 0x4;
			this.anIntArray213[local12] <<= 0x4;
		}
		Static185.anInt3541 = 0;
		Static19.anInt255 = 0;
		Static213.anInt3954 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!gm;I)V")
	private void method2800(@OriginalArg(0) Class4_Sub1_Sub4_Sub1 arg0) {
		if (Static231.anIntArray298.length < this.anInt3336) {
			Static231.anIntArray298 = new int[this.anInt3336];
			Static173.anIntArray219 = new int[this.anInt3336];
		}
		@Pc(55) int local55;
		@Pc(94) int local94;
		@Pc(103) int local103;
		for (@Pc(28) int local28 = 0; local28 < this.anInt3350; local28++) {
			local55 = (this.anIntArray212[local28] - (this.aClass19_Sub2_21.anInt2289 * this.anIntArray216[local28] >> 8) >> this.aClass19_Sub2_21.anInt2275) - arg0.anInt2727;
			@Pc(80) int local80 = (this.anIntArray213[local28] - (this.aClass19_Sub2_21.anInt2311 * this.anIntArray216[local28] >> 8) >> this.aClass19_Sub2_21.anInt2275) - arg0.anInt2725;
			@Pc(85) int local85 = this.anIntArray214[local28];
			@Pc(92) int local92 = this.anIntArray214[local28 + 1];
			for (local94 = local85; local94 < local92; local94++) {
				local103 = this.aShortArray109[local94] - 1;
				if (local103 == -1) {
					break;
				}
				Static231.anIntArray298[local103] = local55;
				Static173.anIntArray219[local103] = local80;
			}
		}
		for (local55 = 0; local55 < this.anInt3301; local55++) {
			if (this.aByteArray38 == null || this.aByteArray38[local55] <= 128) {
				@Pc(150) short local150 = this.aShortArray108[local55];
				@Pc(155) short local155 = this.aShortArray105[local55];
				@Pc(160) short local160 = this.aShortArray106[local55];
				local94 = Static231.anIntArray298[local150];
				local103 = Static231.anIntArray298[local155];
				@Pc(172) int local172 = Static231.anIntArray298[local160];
				@Pc(176) int local176 = Static173.anIntArray219[local150];
				@Pc(180) int local180 = Static173.anIntArray219[local155];
				@Pc(184) int local184 = Static173.anIntArray219[local160];
				if ((local94 - local103) * (local180 - local184) - (local172 - local103) * (local180 - local176) > 0) {
					arg0.method2303(local94, local180, local176, local103, local184, local172);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)V")
	private void method2801() {
		if (this.aClass115Array1 == null) {
			return;
		}
		@Pc(16) Class31_Sub1 local16 = this.aClass19_Sub2_21.aClass31_Sub1_2;
		@Pc(20) float local20 = this.aClass19_Sub2_21.xa();
		@Pc(24) float local24 = this.aClass19_Sub2_21.W();
		this.aClass19_Sub2_21.method1965();
		this.aClass19_Sub2_21.method4309(false);
		this.aClass19_Sub2_21.method1906(false);
		this.aClass19_Sub2_21.method1934(null, null, this.aClass19_Sub2_21.aClass177_5, this.aClass19_Sub2_21.aClass177_6);
		for (@Pc(51) int local51 = 0; local51 < this.anInt3354; local51++) {
			@Pc(58) Class115 local58 = this.aClass115Array1[local51];
			@Pc(63) Class85 local63 = this.aClass85Array1[local51];
			if (!local58.aBoolean287 || !this.aClass19_Sub2_21.method4301()) {
				@Pc(91) float local91 = (float) (this.anIntArray212[local58.anInt3417] + this.anIntArray212[local58.anInt3422] + this.anIntArray212[local58.anInt3420]) * 0.3333333F;
				@Pc(112) float local112 = (float) (this.anIntArray216[local58.anInt3417] + this.anIntArray216[local58.anInt3422] + this.anIntArray216[local58.anInt3420]) * 0.3333333F;
				@Pc(134) float local134 = (float) (this.anIntArray213[local58.anInt3422] + this.anIntArray213[local58.anInt3420] + this.anIntArray213[local58.anInt3417]) * 0.3333333F;
				@Pc(148) float local148 = Static445.aFloat222 + local112 * Static276.aFloat30 + Static234.aFloat140 * local91 + Static69.aFloat113 * local134;
				@Pc(162) float local162 = local134 * Static415.aFloat213 + Static344.aFloat184 * local91 + local112 * Static287.aFloat163 + Static102.aFloat56;
				@Pc(176) float local176 = Static444.aFloat223 + local134 * Static203.aFloat126 + local91 * Static452.aFloat227 + Static360.aFloat189 * local112;
				local16.method5159(local63.anInt2745, local63.anInt2741 * local58.aShort34 >> 7, (float) local63.anInt2746 - local162, local58.aShort33 * local63.anInt2748 >> 7, (float) local63.anInt2749 + local148, -local176);
				this.aClass19_Sub2_21.method1942(local16);
				this.aClass19_Sub2_21.g(local24, local20 - (float) local58.anInt3418 * 1.5F);
				@Pc(226) int local226 = local63.anInt2743;
				OpenGL.glColor4ub((byte) (local226 >> 16), (byte) (local226 >> 8), (byte) local226, (byte) (local226 >> 24));
				this.aClass19_Sub2_21.method1957(local58.aShort35);
				this.aClass19_Sub2_21.method1958(local58.aByte20);
				this.aClass19_Sub2_21.method1900(local58.aByte21);
				this.aClass19_Sub2_21.method1925(4);
			}
		}
		this.aClass19_Sub2_21.g(local24, local20);
		this.aClass19_Sub2_21.method4309(true);
		this.aClass19_Sub2_21.method1916();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!c;Lclient!mi;II)V")
	@Override
	public void method4880(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class3_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3336 == 0) {
			return;
		}
		@Pc(13) Class31_Sub1 local13 = this.aClass19_Sub2_21.aClass31_Sub1_4;
		if (!this.aBoolean280) {
			this.method2804();
		}
		@Pc(22) Class31_Sub1 local22 = (Class31_Sub1) arg0;
		Static444.aFloat223 = local13.aFloat199 * local22.aFloat198 + local13.aFloat203 * local22.aFloat205 + local13.aFloat206 * local22.aFloat209 + local13.aFloat198;
		Static360.aFloat189 = local13.aFloat199 * local22.aFloat203 + local22.aFloat207 * local13.aFloat206 + local22.aFloat204 * local13.aFloat203;
		@Pc(69) float local69 = Static444.aFloat223 + (float) this.lb * Static360.aFloat189;
		@Pc(77) float local77 = (float) this.aShort28 * Static360.aFloat189 + Static444.aFloat223;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.aShort26;
			local93 = local77 - (float) this.aShort26;
		} else {
			local87 = (float) this.aShort26 + local77;
			local93 = (float) -this.aShort26 + local69;
		}
		if (local93 >= this.aClass19_Sub2_21.aFloat77 || local87 <= (float) this.aClass19_Sub2_21.anInt2290) {
			return;
		}
		Static276.aFloat30 = local13.aFloat202 * local22.aFloat207 + local22.aFloat204 * local13.aFloat207 + local13.aFloat208 * local22.aFloat203;
		Static445.aFloat222 = local13.aFloat209 + local22.aFloat198 * local13.aFloat208 + local13.aFloat207 * local22.aFloat205 + local22.aFloat209 * local13.aFloat202;
		@Pc(170) float local170 = Static445.aFloat222 + (float) this.lb * Static276.aFloat30;
		@Pc(178) float local178 = Static276.aFloat30 * (float) this.aShort28 + Static445.aFloat222;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local178 < local170) {
			local193 = (local170 + (float) this.aShort26) * (float) this.aClass19_Sub2_21.anInt2309;
			local204 = (float) this.aClass19_Sub2_21.anInt2309 * (local178 - (float) this.aShort26);
		} else {
			local193 = (float) this.aClass19_Sub2_21.anInt2309 * (local178 + (float) this.aShort26);
			local204 = (float) this.aClass19_Sub2_21.anInt2309 * ((float) -this.aShort26 + local170);
		}
		if (local204 / (float) arg2 >= this.aClass19_Sub2_21.aFloat64 || local193 / (float) arg2 <= this.aClass19_Sub2_21.aFloat75) {
			return;
		}
		Static287.aFloat163 = local13.aFloat200 * local22.aFloat207 + local13.aFloat204 * local22.aFloat204 + local13.aFloat201 * local22.aFloat203;
		Static102.aFloat56 = local13.aFloat205 + local22.aFloat205 * local13.aFloat204 + local22.aFloat209 * local13.aFloat200 + local13.aFloat201 * local22.aFloat198;
		@Pc(296) float local296 = Static102.aFloat56 + Static287.aFloat163 * (float) this.lb;
		@Pc(304) float local304 = Static102.aFloat56 + Static287.aFloat163 * (float) this.aShort28;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local296 > local304) {
			local320 = ((float) -this.aShort26 + local304) * (float) this.aClass19_Sub2_21.anInt2294;
			local331 = ((float) this.aShort26 + local296) * (float) this.aClass19_Sub2_21.anInt2294;
		} else {
			local331 = (local304 + (float) this.aShort26) * (float) this.aClass19_Sub2_21.anInt2294;
			local320 = (local296 - (float) this.aShort26) * (float) this.aClass19_Sub2_21.anInt2294;
		}
		if (this.aClass19_Sub2_21.aFloat68 <= local320 / (float) arg2 || this.aClass19_Sub2_21.aFloat62 >= local331 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass115Array1 != null) {
			Static203.aFloat126 = local22.aFloat199 * local13.aFloat199 + local22.aFloat208 * local13.aFloat206 + local13.aFloat203 * local22.aFloat201;
			Static234.aFloat140 = local13.aFloat202 * local22.aFloat202 + local13.aFloat207 * local22.aFloat200 + local22.aFloat206 * local13.aFloat208;
			Static452.aFloat227 = local22.aFloat200 * local13.aFloat203 + local13.aFloat206 * local22.aFloat202 + local13.aFloat199 * local22.aFloat206;
			Static344.aFloat184 = local22.aFloat206 * local13.aFloat201 + local22.aFloat202 * local13.aFloat200 + local22.aFloat200 * local13.aFloat204;
			Static415.aFloat213 = local22.aFloat201 * local13.aFloat204 + local13.aFloat200 * local22.aFloat208 + local13.aFloat201 * local22.aFloat199;
			Static69.aFloat113 = local13.aFloat208 * local22.aFloat199 + local22.aFloat208 * local13.aFloat202 + local13.aFloat207 * local22.aFloat201;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.aShort31 + this.aShort29 >> 1;
			@Pc(507) int local507 = this.aShort27 + this.aShort25 >> 1;
			@Pc(526) int local526 = (int) (Static69.aFloat113 * (float) local507 + (float) this.lb * Static276.aFloat30 + (float) local498 * Static234.aFloat140 + Static445.aFloat222);
			@Pc(545) int local545 = (int) ((float) local498 * Static344.aFloat184 + Static102.aFloat56 + Static287.aFloat163 * (float) this.lb + Static415.aFloat213 * (float) local507);
			@Pc(564) int local564 = (int) ((float) local507 * Static203.aFloat126 + (float) local498 * Static452.aFloat227 + Static444.aFloat223 + Static360.aFloat189 * (float) this.lb);
			@Pc(583) int local583 = (int) ((float) local507 * Static69.aFloat113 + (float) local498 * Static234.aFloat140 + Static445.aFloat222 + (float) this.aShort28 * Static276.aFloat30);
			@Pc(602) int local602 = (int) (Static102.aFloat56 + Static344.aFloat184 * (float) local498 + Static287.aFloat163 * (float) this.aShort28 + (float) local507 * Static415.aFloat213);
			arg1.anInt4542 = this.aClass19_Sub2_21.anInt2309 * local526 / arg2 + this.aClass19_Sub2_21.anInt2295;
			arg1.anInt4540 = local545 * this.aClass19_Sub2_21.anInt2294 / arg2 + this.aClass19_Sub2_21.anInt2297;
			arg1.anInt4543 = this.aClass19_Sub2_21.anInt2295 + local583 * this.aClass19_Sub2_21.anInt2309 / arg2;
			arg1.anInt4541 = this.aClass19_Sub2_21.anInt2297 + local602 * this.aClass19_Sub2_21.anInt2294 / arg2;
			@Pc(674) int local674 = (int) ((float) this.aShort28 * Static360.aFloat189 + Static452.aFloat227 * (float) local498 + Static444.aFloat223 + (float) local507 * Static203.aFloat126);
			if (local564 < this.aClass19_Sub2_21.anInt2290 && this.aClass19_Sub2_21.anInt2290 > local674) {
				arg1.anInt4544 = this.aClass19_Sub2_21.anInt2295 + this.aClass19_Sub2_21.anInt2309 * (this.aShort26 + local526) / arg2 - arg1.anInt4542;
				arg1.aBoolean419 = true;
			}
		}
		this.aClass19_Sub2_21.method1937((float) arg2);
		this.aClass19_Sub2_21.method1928();
		this.aClass19_Sub2_21.method1948(local22);
		this.method2797();
		this.aClass19_Sub2_21.method1916();
		this.method2801();
	}

	@OriginalMember(owner = "client!ip", name = "JA", descriptor = "(III)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3350; local3++) {
			if (arg0 != 0) {
				this.anIntArray212[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray216[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray213[local3] += arg2;
			}
		}
		if (this.aClass177_7 != null) {
			this.aClass177_7.anInterface11_7 = null;
		}
		this.aBoolean280 = false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILclient!ip;ZLclient!ip;Z)Lclient!t;")
	private Class110 method2802(@OriginalArg(1) int arg0, @OriginalArg(2) Class110_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class110_Sub1 arg3, @OriginalArg(5) boolean arg4) {
		arg3.aShort32 = this.aShort32;
		arg3.anInt3339 = this.anInt3339;
		arg3.anInt3350 = this.anInt3350;
		arg3.anInt3354 = this.anInt3354;
		arg3.anInt3338 = this.anInt3338;
		arg3.anInt3341 = arg0;
		arg3.anInt3336 = this.anInt3336;
		arg3.aShort30 = this.aShort30;
		arg3.anInt3301 = this.anInt3301;
		arg3.aByte19 = 0;
		arg3.anInt3355 = this.anInt3355;
		@Pc(53) boolean local53 = Static245.method3594(this.anInt3338, arg0);
		@Pc(61) boolean local61 = Static190.method2975(arg0, this.anInt3338);
		@Pc(67) boolean local67 = Static83.method1510(arg0, this.anInt3338);
		@Pc(73) boolean local73 = local53 | local61 | local67;
		@Pc(184) int local184;
		if (local73) {
			if (!local53) {
				arg3.anIntArray212 = this.anIntArray212;
			} else if (arg1.anIntArray212 == null || arg1.anIntArray212.length < this.anInt3339) {
				arg3.anIntArray212 = arg1.anIntArray212 = new int[this.anInt3339];
			} else {
				arg3.anIntArray212 = arg1.anIntArray212;
			}
			if (!local61) {
				arg3.anIntArray216 = this.anIntArray216;
			} else if (arg1.anIntArray216 == null || arg1.anIntArray216.length < this.anInt3339) {
				arg3.anIntArray216 = arg1.anIntArray216 = new int[this.anInt3339];
			} else {
				arg3.anIntArray216 = arg1.anIntArray216;
			}
			if (!local67) {
				arg3.anIntArray213 = this.anIntArray213;
			} else if (arg1.anIntArray213 == null || arg1.anIntArray213.length < this.anInt3339) {
				arg3.anIntArray213 = arg1.anIntArray213 = new int[this.anInt3339];
			} else {
				arg3.anIntArray213 = arg1.anIntArray213;
			}
			for (local184 = 0; local184 < this.anInt3339; local184++) {
				if (local53) {
					arg3.anIntArray212[local184] = this.anIntArray212[local184];
				}
				if (local61) {
					arg3.anIntArray216[local184] = this.anIntArray216[local184];
				}
				if (local67) {
					arg3.anIntArray213[local184] = this.anIntArray213[local184];
				}
			}
		} else {
			arg3.anIntArray213 = this.anIntArray213;
			arg3.anIntArray216 = this.anIntArray216;
			arg3.anIntArray212 = this.anIntArray212;
		}
		if (Static273.method3914(this.anInt3338, arg0)) {
			arg3.aClass177_7 = arg1.aClass177_7;
			if (arg4) {
				arg3.aByte19 = (byte) (arg3.aByte19 | 0x1);
			}
			arg3.aClass177_7.aByte55 = this.aClass177_7.aByte55;
			arg3.aClass177_7.anInterface11_7 = this.aClass177_7.anInterface11_7;
		} else if (Static426.method5437(this.anInt3338, arg0)) {
			arg3.aClass177_7 = this.aClass177_7;
		} else {
			arg3.aClass177_7 = null;
		}
		if (Static93.method1643(this.anInt3338, arg0)) {
			if (arg1.aShortArray100 == null || arg1.aShortArray100.length < this.anInt3355) {
				arg3.aShortArray100 = arg1.aShortArray100 = new short[this.anInt3355];
			} else {
				arg3.aShortArray100 = arg1.aShortArray100;
			}
			for (local184 = 0; local184 < this.anInt3355; local184++) {
				arg3.aShortArray100[local184] = this.aShortArray100[local184];
			}
		} else {
			arg3.aShortArray100 = this.aShortArray100;
		}
		if (Static55.method934(arg0, this.anInt3338)) {
			if (arg1.aByteArray38 == null || this.anInt3355 > arg1.aByteArray38.length) {
				arg3.aByteArray38 = arg1.aByteArray38 = new byte[this.anInt3355];
			} else {
				arg3.aByteArray38 = arg1.aByteArray38;
			}
			for (local184 = 0; local184 < this.anInt3355; local184++) {
				arg3.aByteArray38[local184] = this.aByteArray38[local184];
			}
		} else {
			arg3.aByteArray38 = this.aByteArray38;
		}
		if (Static13.method137(this.anInt3338, arg0)) {
			if (arg4) {
				arg3.aByte19 = (byte) (arg3.aByte19 | 0x2);
			}
			arg3.aClass177_8 = arg1.aClass177_8;
			arg3.aClass177_8.aByte55 = this.aClass177_8.aByte55;
			arg3.aClass177_8.anInterface11_7 = this.aClass177_8.anInterface11_7;
		} else if (Static44.method760(this.anInt3338, arg0)) {
			arg3.aClass177_8 = this.aClass177_8;
		} else {
			arg3.aClass177_8 = null;
		}
		@Pc(560) int local560;
		if (Static72.method1353(this.anInt3338, arg0)) {
			if (arg1.aShortArray103 == null || arg1.aShortArray103.length < this.anInt3336) {
				local184 = this.anInt3336;
				arg3.aShortArray103 = arg1.aShortArray103 = new short[local184];
				arg3.aShortArray102 = arg1.aShortArray102 = new short[local184];
				arg3.aShortArray101 = arg1.aShortArray101 = new short[local184];
			} else {
				arg3.aShortArray103 = arg1.aShortArray103;
				arg3.aShortArray101 = arg1.aShortArray101;
				arg3.aShortArray102 = arg1.aShortArray102;
			}
			if (this.aClass137_1 == null) {
				for (local184 = 0; local184 < this.anInt3336; local184++) {
					arg3.aShortArray103[local184] = this.aShortArray103[local184];
					arg3.aShortArray101[local184] = this.aShortArray101[local184];
					arg3.aShortArray102[local184] = this.aShortArray102[local184];
				}
			} else {
				if (arg1.aClass137_1 == null) {
					arg1.aClass137_1 = new Class137();
				}
				@Pc(544) Class137 local544 = arg3.aClass137_1 = arg1.aClass137_1;
				if (local544.aShortArray143 == null || local544.aShortArray143.length < this.anInt3336) {
					local560 = this.anInt3336;
					local544.aShortArray143 = new short[local560];
					local544.aByteArray53 = new byte[local560];
					local544.aShortArray144 = new short[local560];
					local544.aShortArray142 = new short[local560];
				}
				for (local560 = 0; local560 < this.anInt3336; local560++) {
					arg3.aShortArray103[local560] = this.aShortArray103[local560];
					arg3.aShortArray101[local560] = this.aShortArray101[local560];
					arg3.aShortArray102[local560] = this.aShortArray102[local560];
					local544.aShortArray143[local560] = this.aClass137_1.aShortArray143[local560];
					local544.aShortArray142[local560] = this.aClass137_1.aShortArray142[local560];
					local544.aShortArray144[local560] = this.aClass137_1.aShortArray144[local560];
					local544.aByteArray53[local560] = this.aClass137_1.aByteArray53[local560];
				}
			}
			arg3.aByteArray39 = this.aByteArray39;
		} else {
			arg3.aByteArray39 = this.aByteArray39;
			arg3.aShortArray101 = this.aShortArray101;
			arg3.aShortArray102 = this.aShortArray102;
			arg3.aClass137_1 = this.aClass137_1;
			arg3.aShortArray103 = this.aShortArray103;
		}
		if (Static230.method3468(this.anInt3338, arg0)) {
			if (arg4) {
				arg3.aByte19 = (byte) (arg3.aByte19 | 0x4);
			}
			arg3.aClass177_10 = arg1.aClass177_10;
			arg3.aClass177_10.anInterface11_7 = this.aClass177_10.anInterface11_7;
			arg3.aClass177_10.aByte55 = this.aClass177_10.aByte55;
		} else if (Static49.method2002(arg0, this.anInt3338)) {
			arg3.aClass177_10 = this.aClass177_10;
		} else {
			arg3.aClass177_10 = null;
		}
		if (Static283.method3965(arg0, this.anInt3338)) {
			if (arg1.aFloatArray21 == null || arg1.aFloatArray21.length < this.anInt3355) {
				local184 = this.anInt3336;
				arg3.aFloatArray21 = arg1.aFloatArray21 = new float[local184];
				arg3.aFloatArray20 = arg1.aFloatArray20 = new float[local184];
			} else {
				arg3.aFloatArray20 = arg1.aFloatArray20;
				arg3.aFloatArray21 = arg1.aFloatArray21;
			}
			for (local184 = 0; local184 < this.anInt3336; local184++) {
				arg3.aFloatArray21[local184] = this.aFloatArray21[local184];
				arg3.aFloatArray20[local184] = this.aFloatArray20[local184];
			}
		} else {
			arg3.aFloatArray21 = this.aFloatArray21;
			arg3.aFloatArray20 = this.aFloatArray20;
		}
		if (Static23.method303(arg0, this.anInt3338)) {
			if (arg4) {
				arg3.aByte19 = (byte) (arg3.aByte19 | 0x8);
			}
			arg3.aClass177_9 = arg1.aClass177_9;
			arg3.aClass177_9.aByte55 = this.aClass177_9.aByte55;
			arg3.aClass177_9.anInterface11_7 = this.aClass177_9.anInterface11_7;
		} else if (Static8.method87(arg0, this.anInt3338)) {
			arg3.aClass177_9 = this.aClass177_9;
		} else {
			arg3.aClass177_9 = null;
		}
		if (Static92.method1613(arg0, this.anInt3338)) {
			if (arg1.aShortArray108 == null || arg1.aShortArray108.length < this.anInt3355) {
				local184 = this.anInt3355;
				arg3.aShortArray106 = arg1.aShortArray106 = new short[local184];
				arg3.aShortArray105 = arg1.aShortArray105 = new short[local184];
				arg3.aShortArray108 = arg1.aShortArray108 = new short[local184];
			} else {
				arg3.aShortArray106 = arg1.aShortArray106;
				arg3.aShortArray105 = arg1.aShortArray105;
				arg3.aShortArray108 = arg1.aShortArray108;
			}
			for (local184 = 0; local184 < this.anInt3355; local184++) {
				arg3.aShortArray108[local184] = this.aShortArray108[local184];
				arg3.aShortArray105[local184] = this.aShortArray105[local184];
				arg3.aShortArray106[local184] = this.aShortArray106[local184];
			}
		} else {
			arg3.aShortArray105 = this.aShortArray105;
			arg3.aShortArray106 = this.aShortArray106;
			arg3.aShortArray108 = this.aShortArray108;
		}
		if (Static299.method4090(arg0, this.anInt3338)) {
			if (arg4) {
				arg3.aByte19 = (byte) (arg3.aByte19 | 0x10);
			}
			arg3.aClass230_1 = arg1.aClass230_1;
			arg3.aClass230_1.anInterface1_5 = this.aClass230_1.anInterface1_5;
		} else if (Static399.method5172(this.anInt3338, arg0)) {
			arg3.aClass230_1 = this.aClass230_1;
		} else {
			arg3.aClass230_1 = null;
		}
		if (Static303.method4110(arg0, this.anInt3338)) {
			if (arg1.aShortArray107 == null || arg1.aShortArray107.length < this.anInt3355) {
				local184 = this.anInt3355;
				arg3.aShortArray107 = arg1.aShortArray107 = new short[local184];
			} else {
				arg3.aShortArray107 = arg1.aShortArray107;
			}
			for (local184 = 0; local184 < this.anInt3355; local184++) {
				arg3.aShortArray107[local184] = this.aShortArray107[local184];
			}
		} else {
			arg3.aShortArray107 = this.aShortArray107;
		}
		if (!Static193.method3032(this.anInt3338, arg0)) {
			arg3.aClass85Array1 = this.aClass85Array1;
		} else if (arg1.aClass85Array1 == null || arg1.aClass85Array1.length < this.anInt3354) {
			local184 = this.anInt3354;
			arg3.aClass85Array1 = arg1.aClass85Array1 = new Class85[local184];
			for (local560 = 0; local560 < this.anInt3354; local560++) {
				arg3.aClass85Array1[local560] = this.aClass85Array1[local560].method2317();
			}
		} else {
			arg3.aClass85Array1 = arg1.aClass85Array1;
			for (local184 = 0; local184 < this.anInt3354; local184++) {
				arg3.aClass85Array1[local184].method2314(this.aClass85Array1[local184]);
			}
		}
		arg3.aClass179Array2 = this.aClass179Array2;
		arg3.aClass115Array1 = this.aClass115Array1;
		arg3.aShortArray104 = this.aShortArray104;
		arg3.aShortArray109 = this.aShortArray109;
		arg3.anIntArrayArray33 = this.anIntArrayArray33;
		arg3.anIntArray215 = this.anIntArray215;
		arg3.aClass29Array2 = this.aClass29Array2;
		if (this.aBoolean280) {
			arg3.lb = this.lb;
			arg3.aShort29 = this.aShort29;
			arg3.aShort31 = this.aShort31;
			arg3.aShort27 = this.aShort27;
			arg3.aShort26 = this.aShort26;
			arg3.aBoolean280 = true;
			arg3.aShort28 = this.aShort28;
			arg3.aShort25 = this.aShort25;
		} else {
			arg3.aBoolean280 = false;
		}
		arg3.anIntArrayArray32 = this.anIntArrayArray32;
		arg3.anIntArray214 = this.anIntArray214;
		arg3.anIntArrayArray34 = this.anIntArrayArray34;
		arg3.aShortArray99 = this.aShortArray99;
		return arg3;
	}

	@OriginalMember(owner = "client!ip", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3350; local3++) {
			if (arg0 != 128) {
				this.anIntArray212[local3] = this.anIntArray212[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray216[local3] = arg1 * this.anIntArray216[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray213[local3] = arg2 * this.anIntArray213[local3] >> 7;
			}
		}
		if (this.aClass177_7 != null) {
			this.aClass177_7.anInterface11_7 = null;
		}
		this.aBoolean280 = false;
	}

	@OriginalMember(owner = "client!ip", name = "M", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void M(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static185.anInt3541 = 0;
			Static19.anInt255 = 0;
			local31 = 0;
			Static213.anInt3954 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray34.length > local41) {
					local55 = this.anIntArrayArray34[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray99 == null || (this.aShortArray99[local63] & arg6) != 0) {
							Static19.anInt255 += this.anIntArray212[local63];
							Static185.anInt3541 += this.anIntArray216[local63];
							Static213.anInt3954 += this.anIntArray213[local63];
							local31++;
						}
					}
				}
			}
			if (local31 > 0) {
				Static95.aBoolean178 = true;
				Static19.anInt255 = arg2 + Static19.anInt255 / local31;
				Static185.anInt3541 = Static185.anInt3541 / local31 + arg3;
				Static213.anInt3954 = Static213.anInt3954 / local31 + arg4;
			} else {
				Static185.anInt3541 = arg3;
				Static19.anInt255 = arg2;
				Static213.anInt3954 = arg4;
			}
			return;
		}
		@Pc(248) int[] local248;
		@Pc(250) int local250;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg7[0] * arg2 + arg3 * arg7[1] + arg7[2] * arg4 + 16384 >> 15;
				local35 = arg7[5] * arg4 + arg7[3] * arg2 + arg3 * arg7[4] + 16384 >> 15;
				local41 = arg7[6] * arg2 + arg3 * arg7[7] + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local31;
				arg4 = local41;
				arg3 = local35;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray34.length) {
					local248 = this.anIntArrayArray34[local35];
					for (local250 = 0; local250 < local248.length; local250++) {
						local57 = local248[local250];
						if (this.aShortArray99 == null || (arg6 & this.aShortArray99[local57]) != 0) {
							this.anIntArray212[local57] += arg2;
							this.anIntArray216[local57] += arg3;
							this.anIntArray213[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(370) int local370;
		@Pc(392) int local392;
		@Pc(422) int local422;
		@Pc(449) int local449;
		@Pc(453) int local453;
		@Pc(457) int local457;
		@Pc(461) int local461;
		@Pc(469) int local469;
		@Pc(477) int local477;
		@Pc(631) int local631;
		@Pc(657) int local657;
		@Pc(661) int local661;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(679) int local679;
		@Pc(683) int local683;
		@Pc(685) int local685;
		@Pc(813) int[] local813;
		@Pc(815) int local815;
		@Pc(819) int local819;
		@Pc(823) int local823;
		@Pc(825) int local825;
		@Pc(956) int local956;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray34.length > local35) {
						local248 = this.anIntArrayArray34[local35];
						for (local250 = 0; local250 < local248.length; local250++) {
							local57 = local248[local250];
							if (this.aShortArray99 == null || (arg6 & this.aShortArray99[local57]) != 0) {
								this.anIntArray212[local57] -= Static19.anInt255;
								this.anIntArray216[local57] -= Static185.anInt3541;
								this.anIntArray213[local57] -= Static213.anInt3954;
								if (arg4 != 0) {
									local63 = Class50_Sub1.anIntArray225[arg4];
									local370 = Class50_Sub1.anIntArray224[arg4];
									local392 = this.anIntArray216[local57] * local63 + this.anIntArray212[local57] * local370 + 32767 >> 15;
									this.anIntArray216[local57] = local370 * this.anIntArray216[local57] + 32767 - this.anIntArray212[local57] * local63 >> 15;
									this.anIntArray212[local57] = local392;
								}
								if (arg2 != 0) {
									local63 = Class50_Sub1.anIntArray225[arg2];
									local370 = Class50_Sub1.anIntArray224[arg2];
									local392 = local370 * this.anIntArray216[local57] + 32767 - this.anIntArray213[local57] * local63 >> 15;
									this.anIntArray213[local57] = this.anIntArray213[local57] * local370 + local63 * this.anIntArray216[local57] + 32767 >> 15;
									this.anIntArray216[local57] = local392;
								}
								if (arg3 != 0) {
									local63 = Class50_Sub1.anIntArray225[arg3];
									local370 = Class50_Sub1.anIntArray224[arg3];
									local392 = local63 * this.anIntArray213[local57] + this.anIntArray212[local57] * local370 + 32767 >> 15;
									this.anIntArray213[local57] = local370 * this.anIntArray213[local57] + 32767 - local63 * this.anIntArray212[local57] >> 15;
									this.anIntArray212[local57] = local392;
								}
								this.anIntArray212[local57] += Static19.anInt255;
								this.anIntArray216[local57] += Static185.anInt3541;
								this.anIntArray213[local57] += Static213.anInt3954;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray34.length) {
							local55 = this.anIntArrayArray34[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray99 == null || (arg6 & this.aShortArray99[local63]) != 0) {
									local370 = this.anIntArray214[local63];
									local392 = this.anIntArray214[local63 + 1];
									for (local422 = local370; local422 < local392; local422++) {
										local449 = this.aShortArray109[local422] - 1;
										if (local449 == -1) {
											break;
										}
										if (arg4 != 0) {
											local453 = Class50_Sub1.anIntArray225[arg4];
											local457 = Class50_Sub1.anIntArray224[arg4];
											local461 = this.aShortArray103[local449] * local457 + local453 * this.aShortArray101[local449] + 32767 >> 15;
											this.aShortArray101[local449] = (short) (this.aShortArray101[local449] * local457 + 32767 - local453 * this.aShortArray103[local449] >> 15);
											this.aShortArray103[local449] = (short) local461;
										}
										if (arg2 != 0) {
											local453 = Class50_Sub1.anIntArray225[arg2];
											local457 = Class50_Sub1.anIntArray224[arg2];
											local461 = local457 * this.aShortArray101[local449] + 32767 - local453 * this.aShortArray102[local449] >> 15;
											this.aShortArray102[local449] = (short) (this.aShortArray101[local449] * local453 + local457 * this.aShortArray102[local449] + 32767 >> 15);
											this.aShortArray101[local449] = (short) local461;
										}
										if (arg3 != 0) {
											local453 = Class50_Sub1.anIntArray225[arg3];
											local457 = Class50_Sub1.anIntArray224[arg3];
											local461 = local457 * this.aShortArray103[local449] + this.aShortArray102[local449] * local453 + 32767 >> 15;
											this.aShortArray102[local449] = (short) (this.aShortArray102[local449] * local457 + 32767 - this.aShortArray103[local449] * local453 >> 15);
											this.aShortArray103[local449] = (short) local461;
										}
									}
								}
							}
						}
					}
					if (this.aClass177_10 == null && this.aClass177_8 != null) {
						this.aClass177_8.anInterface11_7 = null;
					}
					if (this.aClass177_10 != null) {
						this.aClass177_10.anInterface11_7 = null;
					}
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local250 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static95.aBoolean178) {
					local370 = Static19.anInt255 * arg7[0] + arg7[3] * Static185.anInt3541 + Static213.anInt3954 * arg7[6] + 16384 >> 15;
					local392 = Static213.anInt3954 * arg7[7] + Static19.anInt255 * arg7[1] + Static185.anInt3541 * arg7[4] + 16384 >> 15;
					local392 += local57;
					local370 += local250;
					local422 = Static185.anInt3541 * arg7[5] + arg7[2] * Static19.anInt255 + Static213.anInt3954 * arg7[8] + 16384 >> 15;
					local422 += local63;
					Static19.anInt255 = local370;
					Static185.anInt3541 = local392;
					Static95.aBoolean178 = false;
					Static213.anInt3954 = local422;
				}
				@Pc(437) int[] local437 = new int[9];
				local392 = Class50_Sub1.anIntArray224[arg2];
				local422 = Class50_Sub1.anIntArray225[arg2];
				local449 = Class50_Sub1.anIntArray224[arg3];
				local453 = Class50_Sub1.anIntArray225[arg3];
				local457 = Class50_Sub1.anIntArray224[arg4];
				local461 = Class50_Sub1.anIntArray225[arg4];
				local469 = local457 * local422 + 16384 >> 15;
				local477 = local461 * local422 + 16384 >> 15;
				local437[3] = local461 * local392 + 16384 >> 15;
				local437[6] = local449 * local477 + local457 * -local453 + 16384 >> 15;
				local437[5] = -local422;
				local437[2] = local392 * local453 + 16384 >> 15;
				local437[8] = local449 * local392 + 16384 >> 15;
				local437[1] = local453 * local469 + -local449 * local461 + 16384 >> 15;
				local437[7] = local461 * local453 + local469 * local449 + 16384 >> 15;
				local437[0] = local477 * local453 + local449 * local457 + 16384 >> 15;
				local437[4] = local392 * local457 + 16384 >> 15;
				@Pc(606) int local606 = local437[1] * -Static185.anInt3541 + -Static19.anInt255 * local437[0] + -Static213.anInt3954 * local437[2] + 16384 >> 15;
				local631 = -Static213.anInt3954 * local437[5] + local437[4] * -Static185.anInt3541 + local437[3] * -Static19.anInt255 + 16384 >> 15;
				local657 = local437[6] * -Static19.anInt255 + local437[7] * -Static185.anInt3541 + -Static213.anInt3954 * local437[8] + 16384 >> 15;
				local661 = Static19.anInt255 + local606;
				@Pc(665) int local665 = local631 + Static185.anInt3541;
				local670 = local657 + Static213.anInt3954;
				@Pc(673) int[] local673 = new int[9];
				for (local675 = 0; local675 < 3; local675++) {
					for (local679 = 0; local679 < 3; local679++) {
						local683 = 0;
						for (local685 = 0; local685 < 3; local685++) {
							local683 += local437[local685 + local675 * 3] * arg7[local685 + local679 * 3];
						}
						local673[local675 * 3 + local679] = local683 + 16384 >> 15;
					}
				}
				local679 = local63 * local437[2] + local437[1] * local57 + local437[0] * local250 + 16384 >> 15;
				local683 = local63 * local437[5] + local437[3] * local250 + local437[4] * local57 + 16384 >> 15;
				local679 += local661;
				local683 += local665;
				local685 = local57 * local437[7] + local250 * local437[6] + local437[8] * local63 + 16384 >> 15;
				local685 += local670;
				local813 = new int[9];
				for (local815 = 0; local815 < 3; local815++) {
					for (local819 = 0; local819 < 3; local819++) {
						local823 = 0;
						for (local825 = 0; local825 < 3; local825++) {
							local823 += local673[local819 + local825 * 3] * arg7[local825 + local815 * 3];
						}
						local813[local819 + local815 * 3] = local823 + 16384 >> 15;
					}
				}
				local819 = arg7[1] * local683 + arg7[0] * local679 + local685 * arg7[2] + 16384 >> 15;
				local823 = arg7[3] * local679 + local683 * arg7[4] + arg7[5] * local685 + 16384 >> 15;
				local825 = local685 * arg7[8] + arg7[6] * local679 + arg7[7] * local683 + 16384 >> 15;
				local823 += local35;
				local819 += local31;
				local825 += local41;
				for (local956 = 0; local956 < local8; local956++) {
					@Pc(962) int local962 = arg1[local956];
					if (local962 < this.anIntArrayArray34.length) {
						@Pc(976) int[] local976 = this.anIntArrayArray34[local962];
						for (@Pc(978) int local978 = 0; local978 < local976.length; local978++) {
							@Pc(984) int local984 = local976[local978];
							if (this.aShortArray99 == null || (this.aShortArray99[local984] & arg6) != 0) {
								@Pc(1028) int local1028 = this.anIntArray213[local984] * local813[2] + this.anIntArray216[local984] * local813[1] + this.anIntArray212[local984] * local813[0] + 16384 >> 15;
								@Pc(1059) int local1059 = local813[5] * this.anIntArray213[local984] + local813[4] * this.anIntArray216[local984] + this.anIntArray212[local984] * local813[3] + 16384 >> 15;
								@Pc(1063) int local1063 = local1028 + local819;
								@Pc(1067) int local1067 = local1059 + local823;
								@Pc(1099) int local1099 = this.anIntArray213[local984] * local813[8] + this.anIntArray212[local984] * local813[6] + local813[7] * this.anIntArray216[local984] + 16384 >> 15;
								@Pc(1103) int local1103 = local1099 + local825;
								this.anIntArray212[local984] = local1063;
								this.anIntArray216[local984] = local1067;
								this.anIntArray213[local984] = local1103;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2609) Class115 local2609;
			@Pc(2614) Class85 local2614;
			if (arg0 == 5) {
				if (this.anIntArrayArray33 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray33.length) {
							local248 = this.anIntArrayArray33[local35];
							for (local250 = 0; local250 < local248.length; local250++) {
								local57 = local248[local250];
								if (this.aShortArray104 == null || (this.aShortArray104[local57] & arg6) != 0) {
									local63 = (this.aByteArray38[local57] & 0xFF) + (arg2 * 8);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray38[local57] = (byte) local63;
									if (this.aClass177_8 != null) {
										this.aClass177_8.anInterface11_7 = null;
									}
								}
							}
						}
					}
					if (this.aClass115Array1 != null) {
						for (local35 = 0; local35 < this.anInt3354; local35++) {
							local2609 = this.aClass115Array1[local35];
							local2614 = this.aClass85Array1[local35];
							local2614.anInt2743 = 255 - (this.aByteArray38[local2609.anInt3416] & 0xFF) << 24 | local2614.anInt2743 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2864) Class85 local2864;
				if (arg0 == 8) {
					if (this.anIntArrayArray32 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray32.length) {
								local248 = this.anIntArrayArray32[local35];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2864 = this.aClass85Array1[local248[local250]];
									local2864.anInt2746 += arg3;
									local2864.anInt2749 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray32 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray32.length > local35) {
								local248 = this.anIntArrayArray32[local35];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2864 = this.aClass85Array1[local248[local250]];
									local2864.anInt2748 = local2864.anInt2748 * arg3 >> 7;
									local2864.anInt2741 = local2864.anInt2741 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray32 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray32.length > local35) {
							local248 = this.anIntArrayArray32[local35];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2864 = this.aClass85Array1[local248[local250]];
								local2864.anInt2745 = arg2 + local2864.anInt2745 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray33 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray33.length > local35) {
						local248 = this.anIntArrayArray33[local35];
						for (local250 = 0; local250 < local248.length; local250++) {
							local57 = local248[local250];
							if (this.aShortArray104 == null || (arg6 & this.aShortArray104[local57]) != 0) {
								local63 = this.aShortArray100[local57] & 0xFFFF;
								local370 = local63 >> 10 & 0x3F;
								local392 = local63 >> 7 & 0x7;
								@Pc(2710) int local2710 = arg2 + local370 & 0x3F;
								local392 += arg3 / 4;
								local422 = local63 & 0x7F;
								if (local392 < 0) {
									local392 = 0;
								} else if (local392 > 7) {
									local392 = 7;
								}
								local422 += arg4;
								if (local422 < 0) {
									local422 = 0;
								} else if (local422 > 127) {
									local422 = 127;
								}
								this.aShortArray100[local57] = (short) (local422 | local392 << 7 | local2710 << 10);
								if (this.aClass177_8 != null) {
									this.aClass177_8.anInterface11_7 = null;
								}
							}
						}
					}
				}
				if (this.aClass115Array1 != null) {
					for (local35 = 0; local35 < this.anInt3354; local35++) {
						local2609 = this.aClass115Array1[local35];
						local2614 = this.aClass85Array1[local35];
						local2614.anInt2743 = local2614.anInt2743 & 0xFF000000 | Static72.anIntArray115[this.aShortArray100[local2609.anInt3416] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray34.length > local35) {
					local248 = this.anIntArrayArray34[local35];
					for (local250 = 0; local250 < local248.length; local250++) {
						local57 = local248[local250];
						if (this.aShortArray99 == null || (arg6 & this.aShortArray99[local57]) != 0) {
							this.anIntArray212[local57] -= Static19.anInt255;
							this.anIntArray216[local57] -= Static185.anInt3541;
							this.anIntArray213[local57] -= Static213.anInt3954;
							this.anIntArray212[local57] = this.anIntArray212[local57] * arg2 >> 7;
							this.anIntArray216[local57] = this.anIntArray216[local57] * arg3 >> 7;
							this.anIntArray213[local57] = this.anIntArray213[local57] * arg4 >> 7;
							this.anIntArray212[local57] += Static19.anInt255;
							this.anIntArray216[local57] += Static185.anInt3541;
							this.anIntArray213[local57] += Static213.anInt3954;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local250 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static95.aBoolean178) {
				local370 = arg7[6] * Static213.anInt3954 + arg7[3] * Static185.anInt3541 + Static19.anInt255 * arg7[0] + 16384 >> 15;
				local392 = arg7[4] * Static185.anInt3541 + arg7[1] * Static19.anInt255 + arg7[7] * Static213.anInt3954 + 16384 >> 15;
				local370 += local250;
				local392 += local57;
				local422 = Static19.anInt255 * arg7[2] + Static185.anInt3541 * arg7[5] + Static213.anInt3954 * arg7[8] + 16384 >> 15;
				local422 += local63;
				Static185.anInt3541 = local392;
				Static19.anInt255 = local370;
				Static95.aBoolean178 = false;
				Static213.anInt3954 = local422;
			}
			local370 = arg2 << 15 >> 7;
			local392 = arg3 << 15 >> 7;
			local422 = arg4 << 15 >> 7;
			local449 = local370 * -Static19.anInt255 + 16384 >> 15;
			local453 = -Static185.anInt3541 * local392 + 16384 >> 15;
			local457 = -Static213.anInt3954 * local422 + 16384 >> 15;
			local461 = Static19.anInt255 + local449;
			local469 = local453 + Static185.anInt3541;
			local477 = local457 + Static213.anInt3954;
			@Pc(1888) int[] local1888 = new int[] { local370 * arg7[0] + 16384 >> 15, arg7[3] * local370 + 16384 >> 15, local370 * arg7[6] + 16384 >> 15, arg7[1] * local392 + 16384 >> 15, arg7[4] * local392 + 16384 >> 15, arg7[7] * local392 + 16384 >> 15, local422 * arg7[2] + 16384 >> 15, local422 * arg7[5] + 16384 >> 15, local422 * arg7[8] + 16384 >> 15 };
			local631 = local250 * local370 + 16384 >> 15;
			local657 = local392 * local57 + 16384 >> 15;
			local661 = local63 * local422 + 16384 >> 15;
			@Pc(2024) int local2024 = local657 + local469;
			@Pc(2028) int local2028 = local631 + local461;
			@Pc(2032) int local2032 = local661 + local477;
			@Pc(2035) int[] local2035 = new int[9];
			@Pc(2041) int local2041;
			for (local670 = 0; local670 < 3; local670++) {
				for (local2041 = 0; local2041 < 3; local2041++) {
					local675 = 0;
					for (local679 = 0; local679 < 3; local679++) {
						local675 += arg7[local670 * 3 + local679] * local1888[local2041 + local679 * 3];
					}
					local2035[local670 * 3 + local2041] = local675 + 16384 >> 15;
				}
			}
			local2041 = local2028 * arg7[0] + local2024 * arg7[1] + local2032 * arg7[2] + 16384 >> 15;
			local675 = arg7[5] * local2032 + arg7[4] * local2024 + arg7[3] * local2028 + 16384 >> 15;
			local675 += local35;
			local2041 += local31;
			local679 = local2028 * arg7[6] + arg7[7] * local2024 + arg7[8] * local2032 + 16384 >> 15;
			local679 += local41;
			for (local683 = 0; local683 < local8; local683++) {
				local685 = arg1[local683];
				if (this.anIntArrayArray34.length > local685) {
					local813 = this.anIntArrayArray34[local685];
					for (local815 = 0; local815 < local813.length; local815++) {
						local819 = local813[local815];
						if (this.aShortArray99 == null || (arg6 & this.aShortArray99[local819]) != 0) {
							local823 = this.anIntArray212[local819] * local2035[0] + this.anIntArray216[local819] * local2035[1] + this.anIntArray213[local819] * local2035[2] + 16384 >> 15;
							local825 = local2035[3] * this.anIntArray212[local819] + local2035[4] * this.anIntArray216[local819] + local2035[5] * this.anIntArray213[local819] + 16384 >> 15;
							local956 = this.anIntArray213[local819] * local2035[8] + this.anIntArray216[local819] * local2035[7] + local2035[6] * this.anIntArray212[local819] + 16384 >> 15;
							@Pc(2318) int local2318 = local825 + local675;
							@Pc(2322) int local2322 = local823 + local2041;
							@Pc(2326) int local2326 = local956 + local679;
							this.anIntArray212[local819] = local2322;
							this.anIntArray216[local819] = local2318;
							this.anIntArray213[local819] = local2326;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "()[Lclient!bu;")
	@Override
	public Class29[] method4881() {
		return this.aClass29Array2;
	}

	@OriginalMember(owner = "client!ip", name = "E", descriptor = "(I)V")
	@Override
	public void E(@OriginalArg(0) int arg0) {
		if (this.aClass177_8 != null) {
			this.aClass177_8.anInterface11_7 = null;
		}
		this.aShort32 = (short) arg0;
	}

	@OriginalMember(owner = "client!ip", name = "Q", descriptor = "(I)V")
	@Override
	public void Q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class50_Sub1.anIntArray225[arg0];
		@Pc(13) int local13 = Class50_Sub1.anIntArray224[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3350; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray213[local15] + this.anIntArray212[local15] * local13 >> 15;
			this.anIntArray213[local15] = this.anIntArray213[local15] * local13 - this.anIntArray212[local15] * local9 >> 15;
			this.anIntArray212[local15] = local34;
		}
		this.aBoolean280 = false;
		if (this.aClass177_7 != null) {
			this.aClass177_7.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BIZ)Lclient!t;")
	@Override
	public Class110 method4887(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class110_Sub1 local14;
		@Pc(18) Class110_Sub1 local18;
		if (arg0 == 1) {
			local14 = this.aClass19_Sub2_21.aClass110_Sub1_7;
			local18 = this.aClass19_Sub2_21.aClass110_Sub1_1;
		} else if (arg0 == 2) {
			local14 = this.aClass19_Sub2_21.aClass110_Sub1_3;
			local18 = this.aClass19_Sub2_21.aClass110_Sub1_5;
		} else if (arg0 == 3) {
			local18 = this.aClass19_Sub2_21.aClass110_Sub1_10;
			local14 = this.aClass19_Sub2_21.aClass110_Sub1_9;
		} else if (arg0 == 4) {
			local18 = this.aClass19_Sub2_21.aClass110_Sub1_6;
			local14 = this.aClass19_Sub2_21.aClass110_Sub1_2;
		} else if (arg0 == 5) {
			local14 = this.aClass19_Sub2_21.aClass110_Sub1_8;
			local18 = this.aClass19_Sub2_21.aClass110_Sub1_4;
		} else {
			local14 = local18 = new Class110_Sub1(this.aClass19_Sub2_21);
		}
		return this.method2802(arg1, local18, arg2, local14, arg0 != 0);
	}

	@OriginalMember(owner = "client!ip", name = "R", descriptor = "(I)V")
	@Override
	public void R(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class50_Sub1.anIntArray225[arg0];
		@Pc(13) int local13 = Class50_Sub1.anIntArray224[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3350; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray212[local15] + this.anIntArray216[local15] * local9 >> 15;
			this.anIntArray216[local15] = local13 * this.anIntArray216[local15] - this.anIntArray212[local15] * local9 >> 15;
			this.anIntArray212[local15] = local33;
		}
		this.aBoolean280 = false;
		if (this.aClass177_7 != null) {
			this.aClass177_7.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IJFFIBIILclient!jq;I)S")
	private short method2803(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class122 arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray214[arg6];
		@Pc(17) int local17 = this.anIntArray214[arg6 + 1];
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = local10; local26 < local17; local26++) {
			@Pc(33) short local33 = this.aShortArray109[local26];
			if (local33 == 0) {
				local24 = local26;
				break;
			}
			if (Static429.aLongArray9[local26] == arg1) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray109[local24] = (short) (this.anInt3336 + 1);
		Static429.aLongArray9[local24] = arg1;
		this.aShortArray103[this.anInt3336] = (short) arg8;
		this.aShortArray101[this.anInt3336] = (short) arg5;
		this.aShortArray102[this.anInt3336] = (short) arg0;
		this.aByteArray39[this.anInt3336] = (byte) arg4;
		this.aFloatArray21[this.anInt3336] = arg3;
		this.aFloatArray20[this.anInt3336] = arg2;
		return (short) this.anInt3336++;
	}

	@OriginalMember(owner = "client!ip", name = "IA", descriptor = "()V")
	@Override
	public void IA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3350; local7++) {
			this.anIntArray213[local7] = -this.anIntArray213[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3336; local25++) {
			this.aShortArray102[local25] = (short) -this.aShortArray102[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt3355; local48++) {
			@Pc(55) short local55 = this.aShortArray108[local48];
			this.aShortArray108[local48] = this.aShortArray106[local48];
			this.aShortArray106[local48] = local55;
		}
		if (this.aClass177_10 == null && this.aClass177_8 != null) {
			this.aClass177_8.anInterface11_7 = null;
		}
		if (this.aClass177_10 != null) {
			this.aClass177_10.anInterface11_7 = null;
		}
		if (this.aClass177_7 != null) {
			this.aClass177_7.anInterface11_7 = null;
		}
		if (this.aClass230_1 != null) {
			this.aClass230_1.anInterface1_5 = null;
		}
		this.aBoolean280 = false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!c;Lclient!mi;I)V")
	@Override
	public void method4889(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class3_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3336 == 0) {
			return;
		}
		@Pc(13) Class31_Sub1 local13 = this.aClass19_Sub2_21.aClass31_Sub1_4;
		@Pc(16) Class31_Sub1 local16 = (Class31_Sub1) arg0;
		if (!this.aBoolean280) {
			this.method2804();
		}
		this.method2794(local16);
		Static444.aFloat223 = local16.aFloat209 * local13.aFloat206 + local13.aFloat203 * local16.aFloat205 + local16.aFloat198 * local13.aFloat199 + local13.aFloat198;
		Static360.aFloat189 = local13.aFloat199 * local16.aFloat203 + local16.aFloat207 * local13.aFloat206 + local13.aFloat203 * local16.aFloat204;
		@Pc(73) float local73 = Static360.aFloat189 * (float) this.lb + Static444.aFloat223;
		@Pc(81) float local81 = (float) this.aShort28 * Static360.aFloat189 + Static444.aFloat223;
		@Pc(98) float local98;
		@Pc(91) float local91;
		if (local73 > local81) {
			local91 = (float) this.aShort26 + local73;
			local98 = local81 - (float) this.aShort26;
		} else {
			local91 = (float) this.aShort26 + local81;
			local98 = (float) -this.aShort26 + local73;
		}
		if (this.aClass19_Sub2_21.aFloat61 <= local98 || local91 <= (float) this.aClass19_Sub2_21.anInt2290) {
			return;
		}
		Static445.aFloat222 = local13.aFloat202 * local16.aFloat209 + local13.aFloat207 * local16.aFloat205 + local16.aFloat198 * local13.aFloat208 + local13.aFloat209;
		Static276.aFloat30 = local16.aFloat203 * local13.aFloat208 + local16.aFloat204 * local13.aFloat207 + local13.aFloat202 * local16.aFloat207;
		@Pc(174) float local174 = Static276.aFloat30 * (float) this.lb + Static445.aFloat222;
		@Pc(182) float local182 = Static276.aFloat30 * (float) this.aShort28 + Static445.aFloat222;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local174 > local182) {
			local198 = (float) this.aClass19_Sub2_21.anInt2309 * ((float) -this.aShort26 + local182);
			local209 = (local174 + (float) this.aShort26) * (float) this.aClass19_Sub2_21.anInt2309;
		} else {
			local198 = ((float) -this.aShort26 + local174) * (float) this.aClass19_Sub2_21.anInt2309;
			local209 = (local182 + (float) this.aShort26) * (float) this.aClass19_Sub2_21.anInt2309;
		}
		if (this.aClass19_Sub2_21.aFloat64 <= local198 / local91 || local209 / local91 <= this.aClass19_Sub2_21.aFloat75) {
			return;
		}
		Static287.aFloat163 = local13.aFloat204 * local16.aFloat204 + local13.aFloat200 * local16.aFloat207 + local13.aFloat201 * local16.aFloat203;
		Static102.aFloat56 = local13.aFloat205 + local13.aFloat200 * local16.aFloat209 + local16.aFloat205 * local13.aFloat204 + local13.aFloat201 * local16.aFloat198;
		@Pc(299) float local299 = Static287.aFloat163 * (float) this.lb + Static102.aFloat56;
		@Pc(307) float local307 = Static102.aFloat56 + (float) this.aShort28 * Static287.aFloat163;
		@Pc(334) float local334;
		@Pc(322) float local322;
		if (local299 > local307) {
			local322 = (float) this.aClass19_Sub2_21.anInt2294 * (local299 + (float) this.aShort26);
			local334 = (float) this.aClass19_Sub2_21.anInt2294 * ((float) -this.aShort26 + local307);
		} else {
			local334 = (float) this.aClass19_Sub2_21.anInt2294 * (local299 - (float) this.aShort26);
			local322 = (local307 + (float) this.aShort26) * (float) this.aClass19_Sub2_21.anInt2294;
		}
		if (this.aClass19_Sub2_21.aFloat68 <= local334 / local91 || local322 / local91 <= this.aClass19_Sub2_21.aFloat62) {
			return;
		}
		if (arg1 != null || this.aClass115Array1 != null) {
			Static69.aFloat113 = local16.aFloat201 * local13.aFloat207 + local13.aFloat202 * local16.aFloat208 + local13.aFloat208 * local16.aFloat199;
			Static203.aFloat126 = local16.aFloat208 * local13.aFloat206 + local13.aFloat203 * local16.aFloat201 + local13.aFloat199 * local16.aFloat199;
			Static452.aFloat227 = local13.aFloat203 * local16.aFloat200 + local13.aFloat206 * local16.aFloat202 + local16.aFloat206 * local13.aFloat199;
			Static234.aFloat140 = local13.aFloat207 * local16.aFloat200 + local13.aFloat202 * local16.aFloat202 + local16.aFloat206 * local13.aFloat208;
			Static344.aFloat184 = local16.aFloat202 * local13.aFloat200 + local16.aFloat200 * local13.aFloat204 + local16.aFloat206 * local13.aFloat201;
			Static415.aFloat213 = local16.aFloat208 * local13.aFloat200 + local13.aFloat204 * local16.aFloat201 + local16.aFloat199 * local13.aFloat201;
		}
		if (arg1 != null) {
			@Pc(493) boolean local493 = false;
			@Pc(495) boolean local495 = true;
			@Pc(503) int local503 = this.aShort29 + this.aShort31 >> 1;
			@Pc(511) int local511 = this.aShort25 + this.aShort27 >> 1;
			@Pc(530) int local530 = (int) (Static69.aFloat113 * (float) local511 + Static234.aFloat140 * (float) local503 + Static445.aFloat222 + Static276.aFloat30 * (float) this.lb);
			@Pc(549) int local549 = (int) (Static415.aFloat213 * (float) local511 + Static287.aFloat163 * (float) this.lb + Static102.aFloat56 + (float) local503 * Static344.aFloat184);
			@Pc(568) int local568 = (int) ((float) this.lb * Static360.aFloat189 + (float) local503 * Static452.aFloat227 + Static444.aFloat223 + Static203.aFloat126 * (float) local511);
			if (local568 < this.aClass19_Sub2_21.anInt2290) {
				local493 = true;
			} else {
				arg1.anInt4542 = this.aClass19_Sub2_21.anInt2295 + this.aClass19_Sub2_21.anInt2309 * local530 / local568;
				arg1.anInt4540 = local549 * this.aClass19_Sub2_21.anInt2294 / local568 + this.aClass19_Sub2_21.anInt2297;
			}
			@Pc(627) int local627 = (int) ((float) local511 * Static69.aFloat113 + Static445.aFloat222 + Static234.aFloat140 * (float) local503 + Static276.aFloat30 * (float) this.aShort28);
			@Pc(646) int local646 = (int) ((float) local511 * Static415.aFloat213 + Static287.aFloat163 * (float) this.aShort28 + Static102.aFloat56 + (float) local503 * Static344.aFloat184);
			@Pc(665) int local665 = (int) (Static452.aFloat227 * (float) local503 + Static444.aFloat223 + (float) this.aShort28 * Static360.aFloat189 + (float) local511 * Static203.aFloat126);
			if (this.aClass19_Sub2_21.anInt2290 <= local665) {
				arg1.anInt4541 = local646 * this.aClass19_Sub2_21.anInt2294 / local665 + this.aClass19_Sub2_21.anInt2297;
				arg1.anInt4543 = this.aClass19_Sub2_21.anInt2295 + this.aClass19_Sub2_21.anInt2309 * local627 / local665;
			} else {
				local493 = true;
			}
			if (local493) {
				if (local568 < this.aClass19_Sub2_21.anInt2290 && local665 < this.aClass19_Sub2_21.anInt2290) {
					local495 = false;
				} else {
					@Pc(747) int local747;
					@Pc(759) int local759;
					@Pc(785) int local785;
					if (local568 < this.aClass19_Sub2_21.anInt2290) {
						local747 = (local665 - this.aClass19_Sub2_21.anInt2290 << 16) / (local665 - local568);
						local759 = ((local627 - local530) * local747 >> 16) + local627;
						local785 = local646 + ((local646 - local549) * local747 >> 16);
						arg1.anInt4542 = this.aClass19_Sub2_21.anInt2309 * local759 / this.aClass19_Sub2_21.anInt2290 + this.aClass19_Sub2_21.anInt2295;
						arg1.anInt4540 = this.aClass19_Sub2_21.anInt2297 + local785 * this.aClass19_Sub2_21.anInt2294 / this.aClass19_Sub2_21.anInt2290;
					} else if (local665 < this.aClass19_Sub2_21.anInt2290) {
						local747 = (local568 - this.aClass19_Sub2_21.anInt2290 << 16) / (local568 - local665);
						local759 = local530 + ((local530 - local627) * local747 >> 16);
						arg1.anInt4542 = this.aClass19_Sub2_21.anInt2309 * local759 / this.aClass19_Sub2_21.anInt2290 + this.aClass19_Sub2_21.anInt2295;
						local785 = local549 + ((local549 - local646) * local747 >> 16);
						arg1.anInt4540 = this.aClass19_Sub2_21.anInt2294 * local785 / this.aClass19_Sub2_21.anInt2290 + this.aClass19_Sub2_21.anInt2297;
					}
				}
			}
			if (local495) {
				if (local665 >= local568) {
					arg1.anInt4544 = this.aClass19_Sub2_21.anInt2295 + this.aClass19_Sub2_21.anInt2309 * (local627 - -this.aShort26) / local665 - arg1.anInt4543;
				} else {
					arg1.anInt4544 = (this.aShort26 + local530) * this.aClass19_Sub2_21.anInt2309 / local568 + this.aClass19_Sub2_21.anInt2295 - arg1.anInt4542;
				}
				arg1.aBoolean419 = true;
			}
		}
		this.aClass19_Sub2_21.method1904();
		this.aClass19_Sub2_21.method1948(local16);
		this.method2797();
		this.aClass19_Sub2_21.method1916();
		this.method2801();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3355; local7++) {
			local16 = this.aShortArray100[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			@Pc(47) int local47 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local47 += (arg2 - local47) * arg3 >> 7;
			}
			this.aShortArray100[local7] = (short) (local47 | local28 << 7 | local22 << 10);
		}
		if (this.aClass115Array1 != null) {
			for (local16 = 0; local16 < this.anInt3354; local16++) {
				@Pc(108) Class115 local108 = this.aClass115Array1[local16];
				@Pc(113) Class85 local113 = this.aClass85Array1[local16];
				local113.anInt2743 = local113.anInt2743 & 0xFF000000 | Static72.anIntArray115[this.aShortArray100[local108.anInt3416] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass177_8 != null) {
			this.aClass177_8.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	private void method2804() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt3350; local27++) {
			@Pc(34) int local34 = this.anIntArray212[local27];
			@Pc(39) int local39 = this.anIntArray216[local27];
			if (local13 < local34) {
				local13 = local34;
			}
			if (local39 < local9) {
				local9 = local39;
			}
			if (local15 < local39) {
				local15 = local39;
			}
			@Pc(67) int local67 = this.anIntArray213[local27];
			if (local7 > local34) {
				local7 = local34;
			}
			if (local11 > local67) {
				local11 = local67;
			}
			if (local17 < local67) {
				local17 = local67;
			}
			@Pc(94) int local94 = local67 * local67 + local34 * local34;
			if (local94 > local19) {
				local19 = local94;
			}
			local94 = local67 * local67 + local34 * local34 + local39 * local39;
			if (local21 < local94) {
				local21 = local94;
			}
		}
		this.aShort31 = (short) local13;
		this.aShort27 = (short) local11;
		this.aShort25 = (short) local17;
		this.aShort28 = (short) local15;
		this.aShort29 = (short) local7;
		this.lb = (short) local9;
		this.aShort26 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean280 = true;
	}

	@OriginalMember(owner = "client!ip", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		if (!this.aBoolean280) {
			this.method2804();
		}
		return this.aShort28;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "()V")
	@Override
	public void method4886() {
		if (this.anInt3336 <= 0 || this.anInt3301 <= 0) {
			return;
		}
		this.method2799(false);
		if ((this.aByte19 & 0x10) == 0 && this.aClass230_1.anInterface1_5 == null) {
			this.method2808(false);
		}
		this.method2807();
	}

	@OriginalMember(owner = "client!ip", name = "I", descriptor = "(SS)V")
	@Override
	public void I(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass19_Sub2_21.anInterface7_6;
		for (@Pc(11) int local11 = 0; local11 < this.anInt3355; local11++) {
			if (this.aShortArray107[local11] == arg0) {
				this.aShortArray107[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class251 local47 = local9.method2396(arg0 & 0xFFFF);
			local37 = local47.aByte87;
			local35 = local47.aByte90;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class251 local67 = local9.method2396(arg1 & 0xFFFF);
			local55 = local67.aByte90;
			local57 = local67.aByte87;
		}
		if (!(local35 != local55 | local37 != local57)) {
			return;
		}
		if (this.aClass115Array1 != null) {
			for (@Pc(96) int local96 = 0; local96 < this.anInt3354; local96++) {
				@Pc(103) Class115 local103 = this.aClass115Array1[local96];
				@Pc(108) Class85 local108 = this.aClass85Array1[local96];
				local108.anInt2743 = local108.anInt2743 & 0xFF000000 | Static72.anIntArray115[this.aShortArray100[local103.anInt3416] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass177_8 != null) {
			this.aClass177_8.anInterface11_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ip", name = "P", descriptor = "()I")
	@Override
	public int P() {
		return this.anInt3341;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZIIIIIIII)Z")
	private boolean method2806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > arg3 && arg3 < arg5 && arg6 > arg3) {
			return false;
		} else if (arg1 < arg3 && arg3 > arg5 && arg3 > arg6) {
			return false;
		} else if (arg7 < arg0 && arg4 > arg7 && arg2 > arg7) {
			return false;
		} else {
			return arg7 <= arg0 || arg7 <= arg4 || arg2 >= arg7;
		}
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)V")
	private void method2807() {
		if (!this.aBoolean281) {
			return;
		}
		this.aBoolean281 = false;
		if (this.aClass29Array2 == null && this.aClass179Array2 == null && this.aClass115Array1 == null) {
			if (this.anIntArray212 != null && !Static397.method723(this.anInt3338, this.anInt3341)) {
				if (this.aClass177_7 != null && this.aClass177_7.anInterface11_7 == null) {
					this.aBoolean281 = true;
				} else {
					if (!this.aBoolean280) {
						this.method2804();
					}
					this.anIntArray212 = null;
				}
			}
			if (this.anIntArray216 != null && !Static49.method1997(this.anInt3341, this.anInt3338)) {
				if (this.aClass177_7 != null && this.aClass177_7.anInterface11_7 == null) {
					this.aBoolean281 = true;
				} else {
					if (!this.aBoolean280) {
						this.method2804();
					}
					this.anIntArray216 = null;
				}
			}
			if (this.anIntArray213 != null && !Static344.method4656(this.anInt3338, this.anInt3341)) {
				if (this.aClass177_7 != null && this.aClass177_7.anInterface11_7 == null) {
					this.aBoolean281 = true;
				} else {
					if (!this.aBoolean280) {
						this.method2804();
					}
					this.anIntArray213 = null;
				}
			}
		}
		if (this.aShortArray109 != null && this.anIntArray212 == null && this.anIntArray216 == null && this.anIntArray213 == null) {
			this.anIntArray214 = null;
			this.aShortArray109 = null;
		}
		if (this.aByteArray39 != null && !Static112.method2029(this.anInt3338, this.anInt3341)) {
			if (this.aClass177_10 == null) {
				if (this.aClass177_8 != null && this.aClass177_8.anInterface11_7 == null) {
					this.aBoolean281 = true;
				} else {
					this.aByteArray39 = null;
					this.aShortArray103 = this.aShortArray101 = this.aShortArray102 = null;
				}
			} else if (this.aClass177_10.anInterface11_7 == null) {
				this.aBoolean281 = true;
			} else {
				this.aShortArray103 = this.aShortArray101 = this.aShortArray102 = null;
				this.aByteArray39 = null;
			}
		}
		if (this.aShortArray100 != null && !Static296.method4064(this.anInt3341, this.anInt3338)) {
			if (this.aClass177_8 != null && this.aClass177_8.anInterface11_7 == null) {
				this.aBoolean281 = true;
			} else {
				this.aShortArray100 = null;
			}
		}
		if (this.aByteArray38 != null && !Static124.method2246(this.anInt3338, this.anInt3341)) {
			if (this.aClass177_8 != null && this.aClass177_8.anInterface11_7 == null) {
				this.aBoolean281 = true;
			} else {
				this.aByteArray38 = null;
			}
		}
		if (this.aFloatArray21 != null && !Static391.method5119(this.anInt3338, this.anInt3341)) {
			if (this.aClass177_9 != null && this.aClass177_9.anInterface11_7 == null) {
				this.aBoolean281 = true;
			} else {
				this.aFloatArray21 = this.aFloatArray20 = null;
			}
		}
		if (this.aShortArray107 != null && !Static339.method4609(this.anInt3338, this.anInt3341)) {
			if (this.aClass177_8 != null && this.aClass177_8.anInterface11_7 == null) {
				this.aBoolean281 = true;
			} else {
				this.aShortArray107 = null;
			}
		}
		if (this.aShortArray108 != null && !Static312.method4173(this.anInt3338, this.anInt3341)) {
			if ((this.aClass230_1 == null || this.aClass230_1.anInterface1_5 != null) && (this.aClass177_8 == null || this.aClass177_8.anInterface11_7 != null)) {
				this.aShortArray108 = this.aShortArray105 = this.aShortArray106 = null;
			} else {
				this.aBoolean281 = true;
			}
		}
		if (this.anIntArrayArray33 != null && !Static397.method726(this.anInt3338, this.anInt3341)) {
			this.aShortArray104 = null;
			this.anIntArrayArray33 = null;
		}
		if (this.anIntArrayArray34 != null && !Static39.method688(this.anInt3338, this.anInt3341)) {
			this.anIntArrayArray34 = null;
			this.aShortArray99 = null;
		}
		if (this.anIntArrayArray32 != null && !Static301.method5343(this.anInt3341, this.anInt3338)) {
			this.anIntArrayArray32 = null;
		}
		if (this.anIntArray215 != null && (this.anInt3341 & 0x800) == 0 && (this.anInt3341 & 0x40000) == 0) {
			this.anIntArray215 = null;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZZ)V")
	private void method2808(@OriginalArg(0) boolean arg0) {
		if (this.anInt3301 * 6 > Static370.aClass4_Sub12_Sub2_3.aByteArray36.length) {
			Static370.aClass4_Sub12_Sub2_3 = new Class4_Sub12_Sub2(this.anInt3301 * 6 + 600);
		} else {
			Static370.aClass4_Sub12_Sub2_3.anInt2997 = 0;
		}
		@Pc(44) int local44;
		if (this.aClass19_Sub2_21.aBoolean215) {
			for (local44 = 0; local44 < this.anInt3301; local44++) {
				Static370.aClass4_Sub12_Sub2_3.method2524(this.aShortArray108[local44]);
				Static370.aClass4_Sub12_Sub2_3.method2524(this.aShortArray105[local44]);
				Static370.aClass4_Sub12_Sub2_3.method2524(this.aShortArray106[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt3301; local44++) {
				Static370.aClass4_Sub12_Sub2_3.method2541(this.aShortArray108[local44]);
				Static370.aClass4_Sub12_Sub2_3.method2541(this.aShortArray105[local44]);
				Static370.aClass4_Sub12_Sub2_3.method2541(this.aShortArray106[local44]);
			}
		}
		if (Static370.aClass4_Sub12_Sub2_3.anInt2997 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface1_2 == null) {
				this.anInterface1_2 = this.aClass19_Sub2_21.method1955(Static370.aClass4_Sub12_Sub2_3.anInt2997, true, Static370.aClass4_Sub12_Sub2_3.aByteArray36);
			} else {
				this.anInterface1_2.method3657(Static370.aClass4_Sub12_Sub2_3.aByteArray36, Static370.aClass4_Sub12_Sub2_3.anInt2997);
			}
			this.aClass230_1.anInterface1_5 = this.anInterface1_2;
		} else {
			this.aClass230_1.anInterface1_5 = this.aClass19_Sub2_21.method1955(Static370.aClass4_Sub12_Sub2_3.anInt2997, false, Static370.aClass4_Sub12_Sub2_3.aByteArray36);
		}
		if (!arg0) {
			this.aBoolean281 = true;
		}
	}

	@OriginalMember(owner = "client!ip", name = "MA", descriptor = "()I")
	@Override
	public int MA() {
		if (!this.aBoolean280) {
			this.method2804();
		}
		return this.lb;
	}
}
