import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class26_Sub3 extends Class26 {

	@OriginalMember(owner = "client!ww", name = "o", descriptor = "S")
	private short aShort118;

	@OriginalMember(owner = "client!ww", name = "p", descriptor = "[I")
	private int[] anIntArray703;

	@OriginalMember(owner = "client!ww", name = "r", descriptor = "Lclient!qd;")
	private Interface14 anInterface14_7;

	@OriginalMember(owner = "client!ww", name = "s", descriptor = "S")
	private short aShort119;

	@OriginalMember(owner = "client!ww", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray87;

	@OriginalMember(owner = "client!ww", name = "w", descriptor = "[I")
	private int[] anIntArray704;

	@OriginalMember(owner = "client!ww", name = "x", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!ww", name = "y", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!ww", name = "A", descriptor = "[Lclient!ig;")
	private Class142[] aClass142Array7;

	@OriginalMember(owner = "client!ww", name = "G", descriptor = "S")
	private short aShort120;

	@OriginalMember(owner = "client!ww", name = "K", descriptor = "[S")
	private short[] aShortArray143;

	@OriginalMember(owner = "client!ww", name = "M", descriptor = "B")
	private byte aByte110;

	@OriginalMember(owner = "client!ww", name = "P", descriptor = "[F")
	private float[] aFloatArray70;

	@OriginalMember(owner = "client!ww", name = "Q", descriptor = "Lclient!caa;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!ww", name = "S", descriptor = "I")
	private int anInt9679;

	@OriginalMember(owner = "client!ww", name = "W", descriptor = "[I")
	private int[] anIntArray705;

	@OriginalMember(owner = "client!ww", name = "Z", descriptor = "I")
	private int anInt9685;

	@OriginalMember(owner = "client!ww", name = "db", descriptor = "[S")
	private short[] aShortArray144;

	@OriginalMember(owner = "client!ww", name = "gb", descriptor = "[B")
	private byte[] aByteArray117;

	@OriginalMember(owner = "client!ww", name = "ib", descriptor = "[Lclient!rn;")
	private Class265[] aClass265Array7;

	@OriginalMember(owner = "client!ww", name = "lb", descriptor = "S")
	private short lb;

	@OriginalMember(owner = "client!ww", name = "nb", descriptor = "S")
	private short aShort121;

	@OriginalMember(owner = "client!ww", name = "pb", descriptor = "S")
	private short aShort122;

	@OriginalMember(owner = "client!ww", name = "wb", descriptor = "[[I")
	private int[][] anIntArrayArray88;

	@OriginalMember(owner = "client!ww", name = "xb", descriptor = "[S")
	private short[] aShortArray145;

	@OriginalMember(owner = "client!ww", name = "Bb", descriptor = "S")
	private short aShort123;

	@OriginalMember(owner = "client!ww", name = "Eb", descriptor = "[B")
	private byte[] aByteArray118;

	@OriginalMember(owner = "client!ww", name = "Fb", descriptor = "[F")
	private float[] aFloatArray71;

	@OriginalMember(owner = "client!ww", name = "Gb", descriptor = "[I")
	private int[] anIntArray706;

	@OriginalMember(owner = "client!ww", name = "Jb", descriptor = "I")
	private int anInt9707;

	@OriginalMember(owner = "client!ww", name = "Lb", descriptor = "[S")
	private short[] aShortArray146;

	@OriginalMember(owner = "client!ww", name = "Rb", descriptor = "[I")
	private int[] anIntArray707;

	@OriginalMember(owner = "client!ww", name = "ac", descriptor = "[[I")
	private int[][] anIntArrayArray89;

	@OriginalMember(owner = "client!ww", name = "bc", descriptor = "S")
	private short aShort124;

	@OriginalMember(owner = "client!ww", name = "dc", descriptor = "S")
	private short aShort125;

	@OriginalMember(owner = "client!ww", name = "ec", descriptor = "[S")
	private short[] aShortArray147;

	@OriginalMember(owner = "client!ww", name = "gc", descriptor = "[S")
	private short[] aShortArray148;

	@OriginalMember(owner = "client!ww", name = "ic", descriptor = "[S")
	private short[] aShortArray149;

	@OriginalMember(owner = "client!ww", name = "jc", descriptor = "[Lclient!mo;")
	private Class205[] aClass205Array1;

	@OriginalMember(owner = "client!ww", name = "lc", descriptor = "[Lclient!dq;")
	private Class74[] aClass74Array1;

	@OriginalMember(owner = "client!ww", name = "nc", descriptor = "[S")
	private short[] aShortArray150;

	@OriginalMember(owner = "client!ww", name = "oc", descriptor = "Lclient!ah;")
	private Interface2 anInterface2_5;

	@OriginalMember(owner = "client!ww", name = "pc", descriptor = "[S")
	private short[] aShortArray151;

	@OriginalMember(owner = "client!ww", name = "R", descriptor = "Z")
	private boolean aBoolean686 = false;

	@OriginalMember(owner = "client!ww", name = "J", descriptor = "I")
	private int anInt9675 = 0;

	@OriginalMember(owner = "client!ww", name = "zb", descriptor = "I")
	private int anInt9702 = 0;

	@OriginalMember(owner = "client!ww", name = "tb", descriptor = "I")
	private int anInt9698 = 0;

	@OriginalMember(owner = "client!ww", name = "Ib", descriptor = "Z")
	private boolean aBoolean687 = true;

	@OriginalMember(owner = "client!ww", name = "Hb", descriptor = "I")
	private int anInt9706 = 0;

	@OriginalMember(owner = "client!ww", name = "Zb", descriptor = "I")
	private int anInt9719 = 0;

	@OriginalMember(owner = "client!ww", name = "fc", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_43;

	@OriginalMember(owner = "client!ww", name = "Xb", descriptor = "Lclient!dd;")
	private Class65 aClass65_15;

	@OriginalMember(owner = "client!ww", name = "mc", descriptor = "Lclient!dd;")
	private Class65 aClass65_16;

	@OriginalMember(owner = "client!ww", name = "sb", descriptor = "Lclient!dd;")
	private Class65 aClass65_13;

	@OriginalMember(owner = "client!ww", name = "Sb", descriptor = "Lclient!dd;")
	private Class65 aClass65_14;

	@OriginalMember(owner = "client!ww", name = "C", descriptor = "Lclient!gp;")
	private Class121 aClass121_1;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class26_Sub3(@OriginalArg(0) Class42_Sub3 arg0) {
		this.aClass42_Sub3_43 = arg0;
		this.aClass65_15 = new Class65(null, 5126, 3, 0);
		this.aClass65_16 = new Class65(null, 5126, 2, 0);
		this.aClass65_13 = new Class65(null, 5126, 3, 0);
		this.aClass65_14 = new Class65(null, 5121, 4, 0);
		this.aClass121_1 = new Class121();
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!gi;Lclient!ln;IIII)V")
	public Class26_Sub3(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9685 = arg2;
		this.aClass42_Sub3_43 = arg0;
		this.anInt9679 = arg5;
		if (Static368.method5723(arg2, arg5)) {
			this.aClass65_15 = new Class65(null, 5126, 3, 0);
		}
		if (Static122.method2533(arg5, arg2)) {
			this.aClass65_16 = new Class65(null, 5126, 2, 0);
		}
		if (Static136.method2793(arg2, arg5)) {
			this.aClass65_13 = new Class65(null, 5126, 3, 0);
		}
		if (Static125.method2670(arg5, arg2)) {
			this.aClass65_14 = new Class65(null, 5121, 4, 0);
		}
		if (Static201.method3810(arg5, arg2)) {
			this.aClass121_1 = new Class121();
		}
		@Pc(102) Interface11 local102 = arg0.anInterface11_11;
		@Pc(106) int[] local106 = new int[arg1.anInt5556];
		this.anIntArray704 = new int[arg1.anInt5546 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt5556; local115++) {
			if ((arg1.aByteArray65 == null || arg1.aByteArray65[local115] != 2) && (arg1.aShortArray80 == null || arg1.aShortArray80[local115] == -1 || !local102.method6215(arg1.aShortArray80[local115] & 0xFFFF).aBoolean573)) {
				local106[this.anInt9706++] = local115;
				this.anIntArray704[arg1.aShortArray84[local115]]++;
				this.anIntArray704[arg1.aShortArray86[local115]]++;
				this.anIntArray704[arg1.aShortArray82[local115]]++;
			}
		}
		this.anInt9719 = this.anInt9706;
		@Pc(203) long[] local203 = new long[this.anInt9706];
		@Pc(215) boolean local215 = (this.anInt9685 & 0x100) != 0;
		@Pc(227) int local227;
		@Pc(238) int local238;
		@Pc(371) int local371;
		label493: for (@Pc(217) int local217 = 0; local217 < this.anInt9706; local217++) {
			@Pc(223) int local223 = local106[local217];
			@Pc(225) Class278 local225 = null;
			local227 = 0;
			@Pc(229) byte local229 = 0;
			@Pc(231) byte local231 = 0;
			@Pc(233) byte local233 = 0;
			if (arg1.aClass2Array1 != null) {
				for (local238 = 0; local238 < arg1.aClass2Array1.length; local238++) {
					@Pc(245) Class2 local245 = arg1.aClass2Array1[local238];
					if (local245.anInt52 == local223) {
						@Pc(258) Class271 local258 = Static267.method4553(local245.anInt56);
						if (local258.aBoolean555) {
							local203[local217] = Long.MAX_VALUE;
							this.anInt9719--;
							continue label493;
						}
					}
				}
			}
			@Pc(281) short local281 = -1;
			if (arg1.aShortArray80 != null) {
				local281 = arg1.aShortArray80[local223];
				if (local281 != -1) {
					local225 = local102.method6215(local281 & 0xFFFF);
					local231 = local225.aByte87;
					local233 = local225.aByte83;
				}
			}
			@Pc(333) boolean local333 = arg1.aByteArray62 != null && arg1.aByteArray62[local223] != 0 || local225 != null && !local225.aBoolean571 | local225.aBoolean569;
			if ((local215 || local333) && arg1.aByteArray66 != null) {
				local227 += arg1.aByteArray66[local223] << 17;
			}
			if (local333) {
				local227 += 65536;
			}
			local227 += (local231 & 0xFF) << 8;
			local371 = local229 + ((local281 & 0xFFFF) << 16);
			local227 += local233 & 0xFF;
			@Pc(383) int local383 = local371 + (local217 & 0xFFFF);
			local203[local217] = ((long) local227 << 32) + ((long) local383);
		}
		Static218.method4015(local106, local203);
		this.anInt9675 = arg1.anInt5546;
		this.anInt9698 = arg1.anInt5543;
		this.anIntArray705 = arg1.anIntArray387;
		this.aShortArray144 = arg1.aShortArray77;
		this.anIntArray703 = arg1.anIntArray394;
		this.anIntArray707 = arg1.anIntArray386;
		@Pc(435) Class267[] local435 = new Class267[this.anInt9675];
		this.aClass142Array7 = arg1.aClass142Array5;
		this.aClass265Array7 = arg1.aClass265Array5;
		@Pc(463) int local463;
		@Pc(477) int local477;
		if (arg1.aClass2Array1 != null) {
			this.anInt9707 = arg1.aClass2Array1.length;
			this.aClass205Array1 = new Class205[this.anInt9707];
			this.aClass74Array1 = new Class74[this.anInt9707];
			for (local463 = 0; local463 < this.anInt9707; local463++) {
				@Pc(470) Class2 local470 = arg1.aClass2Array1[local463];
				@Pc(475) Class271 local475 = Static267.method4553(local470.anInt56);
				local477 = -1;
				for (@Pc(479) int local479 = 0; local479 < this.anInt9706; local479++) {
					if (local470.anInt52 == local106[local479]) {
						local477 = local479;
						break;
					}
				}
				if (local477 == -1) {
					throw new RuntimeException();
				}
				local238 = Static141.anIntArray234[arg1.aShortArray85[local470.anInt52] & 0xFFFF] & 0xFFFFFF;
				local238 |= 255 - (arg1.aByteArray62 == null ? 0 : arg1.aByteArray62[local470.anInt52]) << 24;
				this.aClass205Array1[local463] = new Class205(local477, arg1.aShortArray84[local470.anInt52], arg1.aShortArray86[local470.anInt52], arg1.aShortArray82[local470.anInt52], local475.anInt8113, local475.anInt8111, local475.anInt8107, local475.anInt8109, local475.anInt8112, local475.aBoolean555, local475.aBoolean556, local470.anInt51);
				this.aClass74Array1[local463] = new Class74(local238);
			}
		}
		local463 = this.anInt9706 * 3;
		this.aFloatArray70 = new float[local463];
		this.aShortArray147 = new short[local463];
		this.aShort124 = (short) arg3;
		this.aShortArray148 = new short[this.anInt9706];
		this.aShortArray143 = new short[local463];
		Static51.aLongArray21 = new long[local463];
		this.aShortArray145 = new short[local463];
		if (arg1.aShortArray79 != null) {
			this.aShortArray149 = new short[this.anInt9706];
		}
		this.aByteArray117 = new byte[this.anInt9706];
		this.aShortArray146 = new short[this.anInt9706];
		this.aFloatArray71 = new float[local463];
		this.lb = (short) arg4;
		this.aShortArray142 = new short[this.anInt9706];
		this.aByteArray118 = new byte[local463];
		this.aShortArray151 = new short[local463];
		this.aShortArray141 = new short[this.anInt9706];
		this.aShortArray150 = new short[this.anInt9706];
		local227 = 0;
		for (local371 = 0; local371 < arg1.anInt5546; local371++) {
			local477 = this.anIntArray704[local371];
			this.anIntArray704[local371] = local227;
			local435[local371] = new Class267();
			local227 += local477;
		}
		this.anIntArray704[arg1.anInt5546] = local227;
		@Pc(713) int[] local713 = null;
		@Pc(715) int[] local715 = null;
		@Pc(717) int[] local717 = null;
		@Pc(719) float[][] local719 = null;
		@Pc(745) int local745;
		@Pc(783) int local783;
		@Pc(789) int local789;
		@Pc(802) int local802;
		@Pc(804) int local804;
		@Pc(837) int local837;
		@Pc(842) int local842;
		@Pc(1008) float local1008;
		@Pc(997) float local997;
		@Pc(1006) float local1006;
		if (arg1.aByteArray63 != null) {
			@Pc(725) int local725 = arg1.anInt5557;
			@Pc(728) int[] local728 = new int[local725];
			@Pc(731) int[] local731 = new int[local725];
			@Pc(734) int[] local734 = new int[local725];
			@Pc(737) int[] local737 = new int[local725];
			@Pc(740) int[] local740 = new int[local725];
			@Pc(743) int[] local743 = new int[local725];
			for (local745 = 0; local745 < local725; local745++) {
				local728[local745] = Integer.MAX_VALUE;
				local731[local745] = -2147483647;
				local734[local745] = Integer.MAX_VALUE;
				local737[local745] = -2147483647;
				local740[local745] = Integer.MAX_VALUE;
				local743[local745] = -2147483647;
			}
			local715 = new int[local725];
			local713 = new int[local725];
			for (local783 = 0; local783 < this.anInt9706; local783++) {
				local789 = local106[local783];
				if (arg1.aByteArray63[local789] != -1) {
					local802 = arg1.aByteArray63[local789] & 0xFF;
					for (local804 = 0; local804 < 3; local804++) {
						@Pc(818) short local818;
						if (local804 == 0) {
							local818 = arg1.aShortArray84[local789];
						} else if (local804 == 1) {
							local818 = arg1.aShortArray86[local789];
						} else {
							local818 = arg1.aShortArray82[local789];
						}
						local837 = arg1.anIntArray386[local818];
						local842 = arg1.anIntArray394[local818];
						@Pc(847) int local847 = arg1.anIntArray387[local818];
						if (local837 < local728[local802]) {
							local728[local802] = local837;
						}
						if (local837 > local731[local802]) {
							local731[local802] = local837;
						}
						if (local842 < local734[local802]) {
							local734[local802] = local842;
						}
						if (local842 > local737[local802]) {
							local737[local802] = local842;
						}
						if (local847 < local740[local802]) {
							local740[local802] = local847;
						}
						if (local743[local802] < local847) {
							local743[local802] = local847;
						}
					}
				}
			}
			local719 = new float[local725][];
			local717 = new int[local725];
			for (local789 = 0; local789 < local725; local789++) {
				@Pc(939) byte local939 = arg1.aByteArray68[local789];
				if (local939 > 0) {
					local713[local789] = (local731[local789] + local728[local789]) / 2;
					local715[local789] = (local734[local789] + local737[local789]) / 2;
					local717[local789] = (local740[local789] + local743[local789]) / 2;
					if (local939 == 1) {
						local842 = arg1.anIntArray392[local789];
						local997 = 64.0F / (float) arg1.anIntArray385[local789];
						if (local842 == 0) {
							local1008 = 1.0F;
							local1006 = 1.0F;
						} else if (local842 > 0) {
							local1006 = (float) local842 / 1024.0F;
							local1008 = 1.0F;
						} else {
							local1008 = (float) -local842 / 1024.0F;
							local1006 = 1.0F;
						}
					} else if (local939 == 2) {
						local997 = 64.0F / (float) arg1.anIntArray385[local789];
						local1008 = 64.0F / (float) arg1.anIntArray392[local789];
						local1006 = 64.0F / (float) arg1.anIntArray393[local789];
					} else {
						local1006 = (float) arg1.anIntArray393[local789] / 1024.0F;
						local997 = (float) arg1.anIntArray385[local789] / 1024.0F;
						local1008 = (float) arg1.anIntArray392[local789] / 1024.0F;
					}
					local719[local789] = Static298.method2939(arg1.aByteArray67[local789] & 0xFF, local997, arg1.aShortArray78[local789], local1006, arg1.aShortArray83[local789], arg1.aShortArray81[local789], local1008);
				}
			}
		}
		@Pc(1117) Class167[] local1117 = new Class167[arg1.anInt5556];
		@Pc(1136) short local1136;
		@Pc(1146) int local1146;
		@Pc(1157) int local1157;
		@Pc(1217) int local1217;
		for (@Pc(1119) int local1119 = 0; local1119 < arg1.anInt5556; local1119++) {
			@Pc(1126) short local1126 = arg1.aShortArray84[local1119];
			@Pc(1131) short local1131 = arg1.aShortArray86[local1119];
			local1136 = arg1.aShortArray82[local1119];
			local1146 = this.anIntArray707[local1131] - this.anIntArray707[local1126];
			local1157 = this.anIntArray703[local1131] - this.anIntArray703[local1126];
			local745 = this.anIntArray705[local1131] - this.anIntArray705[local1126];
			local783 = this.anIntArray707[local1136] - this.anIntArray707[local1126];
			local789 = this.anIntArray703[local1136] - this.anIntArray703[local1126];
			local802 = this.anIntArray705[local1136] - this.anIntArray705[local1126];
			local804 = local802 * local1157 - local745 * local789;
			local1217 = local783 * local745 - local1146 * local802;
			local837 = local789 * local1146 - local1157 * local783;
			while (local804 > 8192 || local1217 > 8192 || local837 > 8192 || local804 < -8192 || local1217 < -8192 || local837 < -8192) {
				local837 >>= 0x1;
				local1217 >>= 0x1;
				local804 >>= 0x1;
			}
			local842 = (int) Math.sqrt((double) (local1217 * local1217 + local804 * local804 + local837 * local837));
			if (local842 <= 0) {
				local842 = 1;
			}
			local837 = local837 * 256 / local842;
			local1217 = local1217 * 256 / local842;
			local804 = local804 * 256 / local842;
			@Pc(1316) byte local1316 = arg1.aByteArray65 == null ? 0 : arg1.aByteArray65[local1119];
			if (local1316 == 0) {
				@Pc(1322) Class267 local1322 = local435[local1126];
				local1322.anInt8002 += local837;
				local1322.anInt8004 += local1217;
				local1322.anInt8003 += local804;
				local1322.anInt8001++;
				@Pc(1350) Class267 local1350 = local435[local1131];
				local1350.anInt8003 += local804;
				local1350.anInt8004 += local1217;
				local1350.anInt8002 += local837;
				local1350.anInt8001++;
				@Pc(1378) Class267 local1378 = local435[local1136];
				local1378.anInt8004 += local1217;
				local1378.anInt8001++;
				local1378.anInt8003 += local804;
				local1378.anInt8002 += local837;
			} else if (local1316 == 1) {
				@Pc(1417) Class167 local1417 = local1117[local1119] = new Class167();
				local1417.anInt5003 = local1217;
				local1417.anInt5000 = local837;
				local1417.anInt5001 = local804;
			}
		}
		@Pc(1439) int local1439;
		for (@Pc(1433) int local1433 = 0; local1433 < this.anInt9706; local1433++) {
			local1439 = local106[local1433];
			@Pc(1446) int local1446 = arg1.aShortArray85[local1439] & 0xFFFF;
			@Pc(1451) short local1451;
			if (arg1.aShortArray80 == null) {
				local1451 = -1;
			} else {
				local1451 = arg1.aShortArray80[local1439];
			}
			if (arg1.aByteArray63 == null) {
				local1157 = -1;
			} else {
				local1157 = arg1.aByteArray63[local1439];
			}
			if (arg1.aByteArray62 == null) {
				local745 = 0;
			} else {
				local745 = arg1.aByteArray62[local1439] & 0xFF;
			}
			@Pc(1486) float local1486 = 0.0F;
			@Pc(1488) float local1488 = 0.0F;
			@Pc(1490) float local1490 = 0.0F;
			local1008 = 0.0F;
			local997 = 0.0F;
			local1006 = 0.0F;
			@Pc(1498) byte local1498 = 0;
			@Pc(1500) byte local1500 = 0;
			@Pc(1502) int local1502 = 0;
			@Pc(1536) byte local1536;
			@Pc(1553) short local1553;
			@Pc(2303) short local2303;
			@Pc(2308) short local2308;
			if (local1451 != -1) {
				if (local1157 == -1) {
					local1486 = 0.0F;
					local1488 = 1.0F;
					local1008 = 1.0F;
					local1006 = 0.0F;
					local1490 = 1.0F;
					local1498 = 1;
					local1500 = 2;
					local997 = 0.0F;
				} else {
					local1157 &= 0xFF;
					local1536 = arg1.aByteArray68[local1157];
					@Pc(1543) short local1543;
					@Pc(1548) short local1548;
					@Pc(1582) float local1582;
					@Pc(1595) float local1595;
					@Pc(1674) float local1674;
					@Pc(1913) float local1913;
					@Pc(1921) float local1921;
					@Pc(1929) float local1929;
					@Pc(1952) float local1952;
					@Pc(1975) float local1975;
					@Pc(1998) float local1998;
					if (local1536 == 0) {
						local1543 = arg1.aShortArray84[local1439];
						local1548 = arg1.aShortArray86[local1439];
						local1553 = arg1.aShortArray82[local1439];
						local2303 = arg1.aShortArray78[local1157];
						local2308 = arg1.aShortArray83[local1157];
						@Pc(2313) short local2313 = arg1.aShortArray81[local1157];
						@Pc(2319) float local2319 = (float) arg1.anIntArray386[local2303];
						@Pc(2325) float local2325 = (float) arg1.anIntArray394[local2303];
						local1582 = arg1.anIntArray387[local2303];
						local1595 = (float) arg1.anIntArray386[local2308] - local2319;
						local1674 = (float) arg1.anIntArray394[local2308] - local2325;
						@Pc(2358) float local2358 = (float) arg1.anIntArray387[local2308] - local1582;
						@Pc(2367) float local2367 = (float) arg1.anIntArray386[local2313] - local2319;
						@Pc(2375) float local2375 = (float) arg1.anIntArray394[local2313] - local2325;
						@Pc(2384) float local2384 = (float) arg1.anIntArray387[local2313] - local1582;
						@Pc(2393) float local2393 = (float) arg1.anIntArray386[local1543] - local2319;
						@Pc(2402) float local2402 = (float) arg1.anIntArray394[local1543] - local2325;
						@Pc(2411) float local2411 = (float) arg1.anIntArray387[local1543] - local1582;
						@Pc(2419) float local2419 = (float) arg1.anIntArray386[local1548] - local2319;
						@Pc(2428) float local2428 = (float) arg1.anIntArray394[local1548] - local2325;
						local1913 = (float) arg1.anIntArray387[local1548] - local1582;
						local1921 = (float) arg1.anIntArray386[local1553] - local2319;
						local1929 = (float) arg1.anIntArray394[local1553] - local2325;
						local1952 = (float) arg1.anIntArray387[local1553] - local1582;
						local1975 = local2384 * local1674 - local2375 * local2358;
						local1998 = local2358 * local2367 - local1595 * local2384;
						@Pc(2488) float local2488 = local1595 * local2375 - local1674 * local2367;
						@Pc(2497) float local2497 = local2375 * local2488 - local1998 * local2384;
						@Pc(2506) float local2506 = local1975 * local2384 - local2367 * local2488;
						@Pc(2515) float local2515 = local1998 * local2367 - local1975 * local2375;
						@Pc(2529) float local2529 = 1.0F / (local2358 * local2515 + local1674 * local2506 + local1595 * local2497);
						local1490 = local2529 * (local2515 * local1913 + local2428 * local2506 + local2419 * local2497);
						local997 = local2529 * (local1952 * local2515 + local2506 * local1929 + local1921 * local2497);
						local1486 = local2529 * (local2411 * local2515 + local2402 * local2506 + local2497 * local2393);
						@Pc(2580) float local2580 = local1595 * local1998 - local1674 * local1975;
						@Pc(2588) float local2588 = local1975 * local2358 - local1595 * local2488;
						@Pc(2597) float local2597 = local2488 * local1674 - local2358 * local1998;
						@Pc(2611) float local2611 = 1.0F / (local2384 * local2580 + local2588 * local2375 + local2597 * local2367);
						local1006 = local2611 * (local1921 * local2597 + local1929 * local2588 + local2580 * local1952);
						local1008 = (local2597 * local2419 + local2588 * local2428 + local2580 * local1913) * local2611;
						local1488 = local2611 * (local2580 * local2411 + local2597 * local2393 + local2402 * local2588);
					} else {
						local1543 = arg1.aShortArray84[local1439];
						local1548 = arg1.aShortArray86[local1439];
						local1553 = arg1.aShortArray82[local1439];
						@Pc(1557) int local1557 = local713[local1157];
						@Pc(1561) int local1561 = local715[local1157];
						@Pc(1565) int local1565 = local717[local1157];
						@Pc(1569) float[] local1569 = local719[local1157];
						@Pc(1574) byte local1574 = arg1.aByteArray69[local1157];
						local1582 = (float) arg1.anIntArray395[local1157] / 256.0F;
						if (local1536 == 1) {
							local1595 = (float) arg1.anIntArray393[local1157] / 1024.0F;
							Static212.method4975(local1595, arg1.anIntArray387[local1543], arg1.anIntArray386[local1543], local1574, local1565, local1561, local1569, arg1.anIntArray394[local1543], local1557, local1582);
							local1488 = Static280.aFloat118;
							local1486 = Static11.aFloat4;
							Static212.method4975(local1595, arg1.anIntArray387[local1548], arg1.anIntArray386[local1548], local1574, local1565, local1561, local1569, arg1.anIntArray394[local1548], local1557, local1582);
							local1008 = Static280.aFloat118;
							local1490 = Static11.aFloat4;
							Static212.method4975(local1595, arg1.anIntArray387[local1553], arg1.anIntArray386[local1553], local1574, local1565, local1561, local1569, arg1.anIntArray394[local1553], local1557, local1582);
							local1006 = Static280.aFloat118;
							local997 = Static11.aFloat4;
							local1674 = local1595 / 2.0F;
							if ((local1574 & 0x1) == 0) {
								if (local1490 - local1486 > local1674) {
									local1490 -= local1595;
									local1498 = 1;
								} else if (local1486 - local1490 > local1674) {
									local1498 = 2;
									local1490 += local1595;
								}
								if (local997 - local1486 > local1674) {
									local997 -= local1595;
									local1500 = 1;
								} else if (local1486 - local997 > local1674) {
									local1500 = 2;
									local997 += local1595;
								}
							} else {
								if (local1674 < local1006 - local1488) {
									local1500 = 1;
									local1006 -= local1595;
								} else if (local1488 - local1006 > local1674) {
									local1006 += local1595;
									local1500 = 2;
								}
								if (local1674 < local1008 - local1488) {
									local1498 = 1;
									local1008 -= local1595;
								} else if (local1488 - local1008 > local1674) {
									local1008 += local1595;
									local1498 = 2;
								}
							}
						} else if (local1536 == 2) {
							local1595 = (float) arg1.anIntArray389[local1157] / 256.0F;
							local1674 = (float) arg1.anIntArray391[local1157] / 256.0F;
							@Pc(1826) int local1826 = arg1.anIntArray386[local1548] - arg1.anIntArray386[local1543];
							@Pc(1836) int local1836 = arg1.anIntArray394[local1548] - arg1.anIntArray394[local1543];
							@Pc(1847) int local1847 = arg1.anIntArray387[local1548] - arg1.anIntArray387[local1543];
							@Pc(1857) int local1857 = arg1.anIntArray386[local1553] - arg1.anIntArray386[local1543];
							@Pc(1868) int local1868 = arg1.anIntArray394[local1553] - arg1.anIntArray394[local1543];
							@Pc(1879) int local1879 = arg1.anIntArray387[local1553] - arg1.anIntArray387[local1543];
							@Pc(1887) int local1887 = local1879 * local1836 - local1847 * local1868;
							@Pc(1896) int local1896 = local1857 * local1847 - local1879 * local1826;
							@Pc(1905) int local1905 = local1868 * local1826 - local1857 * local1836;
							local1913 = 64.0F / (float) arg1.anIntArray392[local1157];
							local1921 = 64.0F / (float) arg1.anIntArray385[local1157];
							local1929 = 64.0F / (float) arg1.anIntArray393[local1157];
							local1952 = ((float) local1896 * local1569[1] + local1569[0] * (float) local1887 + local1569[2] * (float) local1905) / local1913;
							local1975 = (local1569[3] * (float) local1887 + (float) local1896 * local1569[4] + local1569[5] * (float) local1905) / local1921;
							local1998 = (local1569[8] * (float) local1905 + local1569[7] * (float) local1896 + (float) local1887 * local1569[6]) / local1929;
							local1502 = Static257.method4389(local1998, local1975, local1952);
							Static17.method394(arg1.anIntArray394[local1543], arg1.anIntArray386[local1543], local1582, local1557, local1569, local1674, local1574, local1561, local1565, local1502, local1595, arg1.anIntArray387[local1543]);
							local1486 = Static191.aFloat112;
							local1488 = Static155.aFloat82;
							Static17.method394(arg1.anIntArray394[local1548], arg1.anIntArray386[local1548], local1582, local1557, local1569, local1674, local1574, local1561, local1565, local1502, local1595, arg1.anIntArray387[local1548]);
							local1008 = Static155.aFloat82;
							local1490 = Static191.aFloat112;
							Static17.method394(arg1.anIntArray394[local1553], arg1.anIntArray386[local1553], local1582, local1557, local1569, local1674, local1574, local1561, local1565, local1502, local1595, arg1.anIntArray387[local1553]);
							local1006 = Static155.aFloat82;
							local997 = Static191.aFloat112;
						} else if (local1536 == 3) {
							Static415.method3330(local1569, arg1.anIntArray386[local1543], local1582, local1574, arg1.anIntArray387[local1543], local1565, arg1.anIntArray394[local1543], local1561, local1557);
							local1488 = Static191.aFloat111;
							local1486 = Static147.aFloat80;
							Static415.method3330(local1569, arg1.anIntArray386[local1548], local1582, local1574, arg1.anIntArray387[local1548], local1565, arg1.anIntArray394[local1548], local1561, local1557);
							local1008 = Static191.aFloat111;
							local1490 = Static147.aFloat80;
							Static415.method3330(local1569, arg1.anIntArray386[local1553], local1582, local1574, arg1.anIntArray387[local1553], local1565, arg1.anIntArray394[local1553], local1561, local1557);
							local1006 = Static191.aFloat111;
							local997 = Static147.aFloat80;
							if ((local1574 & 0x1) == 0) {
								if (local1490 - local1486 > 0.5F) {
									local1498 = 1;
									local1490--;
								} else if (local1486 - local1490 > 0.5F) {
									local1490++;
									local1498 = 2;
								}
								if (local997 - local1486 > 0.5F) {
									local1500 = 1;
									local997--;
								} else if (local1486 - local997 > 0.5F) {
									local997++;
									local1500 = 2;
								}
							} else {
								if (local1006 - local1488 > 0.5F) {
									local1006--;
									local1500 = 1;
								} else if (local1488 - local1006 > 0.5F) {
									local1500 = 2;
									local1006++;
								}
								if (local1008 - local1488 > 0.5F) {
									local1008--;
									local1498 = 1;
								} else if (local1488 - local1008 > 0.5F) {
									local1008++;
									local1498 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray65 == null) {
				local1536 = 0;
			} else {
				local1536 = arg1.aByteArray65[local1439];
			}
			if (local1536 == 0) {
				@Pc(2819) long local2819 = ((long) (local1446 << 8) + (long) (local1502 << 24) + (long) local745 << 32) + (long) (local1157 << 2);
				local1553 = arg1.aShortArray84[local1439];
				local2303 = arg1.aShortArray86[local1439];
				local2308 = arg1.aShortArray82[local1439];
				@Pc(2838) Class267 local2838 = local435[local1553];
				this.aShortArray142[local1433] = this.method8014(local2838.anInt8001, local2838.anInt8002, arg1, local2838.anInt8003, local1488, local1486, local2819, local2838.anInt8004, local1553);
				@Pc(2862) Class267 local2862 = local435[local2303];
				this.aShortArray148[local1433] = this.method8014(local2862.anInt8001, local2862.anInt8002, arg1, local2862.anInt8003, local1008, local1490, (long) local1498 + local2819, local2862.anInt8004, local2303);
				@Pc(2889) Class267 local2889 = local435[local2308];
				this.aShortArray146[local1433] = this.method8014(local2889.anInt8001, local2889.anInt8002, arg1, local2889.anInt8003, local1006, local997, (long) local1500 + local2819, local2889.anInt8004, local2308);
			} else if (local1536 == 1) {
				@Pc(2679) Class167 local2679 = local1117[local1439];
				@Pc(2725) long local2725 = (long) ((local2679.anInt5000 + 256 << 22) + (local2679.anInt5001 <= 0 ? 2048 : 1024) + (local1157 << 2) + (local2679.anInt5003 - -256 << 12)) + ((long) (local1502 << 24) + (long) (local1446 << 8) + (long) local745 << 32);
				this.aShortArray142[local1433] = this.method8014(0, local2679.anInt5000, arg1, local2679.anInt5001, local1488, local1486, local2725, local2679.anInt5003, arg1.aShortArray84[local1439]);
				this.aShortArray148[local1433] = this.method8014(0, local2679.anInt5000, arg1, local2679.anInt5001, local1008, local1490, (long) local1498 + local2725, local2679.anInt5003, arg1.aShortArray86[local1439]);
				this.aShortArray146[local1433] = this.method8014(0, local2679.anInt5000, arg1, local2679.anInt5001, local1006, local997, local2725 + (long) local1500, local2679.anInt5003, arg1.aShortArray82[local1439]);
			}
			if (arg1.aShortArray80 == null) {
				this.aShortArray141[local1433] = -1;
			} else {
				this.aShortArray141[local1433] = arg1.aShortArray80[local1439];
			}
			if (arg1.aByteArray62 != null) {
				this.aByteArray117[local1433] = arg1.aByteArray62[local1439];
			}
			if (arg1.aShortArray79 != null) {
				this.aShortArray149[local1433] = arg1.aShortArray79[local1439];
			}
			this.aShortArray150[local1433] = arg1.aShortArray85[local1439];
		}
		local1439 = 0;
		local1136 = -10000;
		for (local1146 = 0; local1146 < this.anInt9719; local1146++) {
			@Pc(2978) short local2978 = this.aShortArray141[local1146];
			if (local2978 != local1136) {
				local1439++;
				local1136 = local2978;
			}
		}
		this.anIntArray706 = new int[local1439 + 1];
		local1136 = -10000;
		local1439 = 0;
		for (local1157 = 0; local1157 < this.anInt9719; local1157++) {
			@Pc(3012) short local3012 = this.aShortArray141[local1157];
			if (local1136 != local3012) {
				this.anIntArray706[local1439++] = local1157;
				local1136 = local3012;
			}
		}
		this.anIntArray706[local1439] = this.anInt9719;
		Static51.aLongArray21 = null;
		this.aShortArray147 = Static511.method7593(this.aShortArray147, this.anInt9702);
		this.aShortArray151 = Static511.method7593(this.aShortArray151, this.anInt9702);
		this.aShortArray145 = Static511.method7593(this.aShortArray145, this.anInt9702);
		this.aByteArray118 = Static25.method530(this.aByteArray118, this.anInt9702);
		this.aFloatArray70 = Static82.method1830(this.anInt9702, this.aFloatArray70);
		this.aFloatArray71 = Static82.method1830(this.anInt9702, this.aFloatArray71);
		if (arg1.anIntArray390 != null && Static469.method7055(arg2, this.anInt9679)) {
			this.anIntArrayArray88 = arg1.method4656(false);
		}
		if (arg1.aClass2Array1 != null && Static389.method6153(arg2, this.anInt9679)) {
			this.anIntArrayArray87 = arg1.method4661();
		}
		if (arg1.anIntArray388 != null && Static507.method7524(this.anInt9679, arg2)) {
			local745 = 0;
			@Pc(3131) int[] local3131 = new int[256];
			for (local789 = 0; local789 < this.anInt9706; local789++) {
				local802 = arg1.anIntArray388[local106[local789]];
				if (local802 >= 0) {
					@Pc(3151) int local3151 = local3131[local802]++;
					if (local745 < local802) {
						local745 = local802;
					}
				}
			}
			this.anIntArrayArray89 = new int[local745 + 1][];
			for (local802 = 0; local802 <= local745; local802++) {
				this.anIntArrayArray89[local802] = new int[local3131[local802]];
				local3131[local802] = 0;
			}
			for (local804 = 0; local804 < this.anInt9706; local804++) {
				local1217 = arg1.anIntArray388[local106[local804]];
				if (local1217 >= 0) {
					this.anIntArrayArray89[local1217][local3131[local1217]++] = local804;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZI)V")
	private void method8011(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass65_14 != null && this.aClass65_14.anInterface14_1 == null;
		@Pc(27) boolean local27 = this.aClass65_13 != null && this.aClass65_13.anInterface14_1 == null;
		@Pc(38) boolean local38 = this.aClass65_15 != null && this.aClass65_15.anInterface14_1 == null;
		@Pc(49) boolean local49 = this.aClass65_16 != null && this.aClass65_16.anInterface14_1 == null;
		if (arg0) {
			local16 &= (this.aByte110 & 0x2) != 0;
			local38 &= (this.aByte110 & 0x1) != 0;
			local27 &= (this.aByte110 & 0x4) != 0;
			local49 &= (this.aByte110 & 0x8) != 0;
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
		if (local106 * this.anInt9702 <= this.aClass42_Sub3_43.aClass12_Sub8_Sub1_1.aByteArray82.length) {
			this.aClass42_Sub3_43.aClass12_Sub8_Sub1_1.anInt6217 = 0;
		} else {
			this.aClass42_Sub3_43.aClass12_Sub8_Sub1_1 = new Class12_Sub8_Sub1((this.anInt9702 + 100) * local106);
		}
		@Pc(191) Class12_Sub8_Sub1 local191 = this.aClass42_Sub3_43.aClass12_Sub8_Sub1_1;
		@Pc(199) int local199;
		@Pc(208) int local208;
		@Pc(236) int local236;
		@Pc(245) int local245;
		if (local38) {
			@Pc(215) int local215;
			@Pc(222) int local222;
			@Pc(227) int local227;
			@Pc(234) int local234;
			if (this.aClass42_Sub3_43.aBoolean292) {
				for (local199 = 0; local199 < this.anInt9675; local199++) {
					local208 = Stream.floatToRawIntBits((float) this.anIntArray707[local199]);
					local215 = Stream.floatToRawIntBits((float) this.anIntArray703[local199]);
					local222 = Stream.floatToRawIntBits((float) this.anIntArray705[local199]);
					local227 = this.anIntArray704[local199];
					local234 = this.anIntArray704[local199 + 1];
					for (local236 = local227; local236 < local234; local236++) {
						local245 = this.aShortArray143[local236] - 1;
						if (local245 == -1) {
							break;
						}
						local191.anInt6217 = local106 * local245;
						local191.method5223(local208);
						local191.method5223(local215);
						local191.method5223(local222);
					}
				}
			} else {
				for (local199 = 0; local199 < this.anInt9675; local199++) {
					local208 = Stream.floatToRawIntBits((float) this.anIntArray707[local199]);
					local215 = Stream.floatToRawIntBits((float) this.anIntArray703[local199]);
					local222 = Stream.floatToRawIntBits((float) this.anIntArray705[local199]);
					local227 = this.anIntArray704[local199];
					local234 = this.anIntArray704[local199 + 1];
					for (local236 = local227; local236 < local234; local236++) {
						local245 = this.aShortArray143[local236] - 1;
						if (local245 == -1) {
							break;
						}
						local191.anInt6217 = local106 * local245;
						local191.method5231(local208);
						local191.method5231(local215);
						local191.method5231(local222);
					}
				}
			}
		}
		@Pc(546) float local546;
		@Pc(444) short[] local444;
		@Pc(450) short[] local450;
		@Pc(453) short[] local453;
		@Pc(447) byte[] local447;
		@Pc(604) float local604;
		if (local16) {
			if (this.aClass65_13 == null) {
				if (this.aClass43_1 == null) {
					local444 = this.aShortArray151;
					local447 = this.aByteArray118;
					local450 = this.aShortArray147;
					local453 = this.aShortArray145;
				} else {
					local444 = this.aClass43_1.aShortArray24;
					local450 = this.aClass43_1.aShortArray23;
					local453 = this.aClass43_1.aShortArray22;
					local447 = this.aClass43_1.aByteArray23;
				}
				@Pc(477) float local477 = this.aClass42_Sub3_43.aFloatArray33[0];
				@Pc(483) float local483 = this.aClass42_Sub3_43.aFloatArray33[1];
				@Pc(489) float local489 = this.aClass42_Sub3_43.aFloatArray33[2];
				@Pc(493) float local493 = this.aClass42_Sub3_43.aFloat85;
				@Pc(503) float local503 = this.aClass42_Sub3_43.aFloat100 * 768.0F / (float) this.lb;
				@Pc(513) float local513 = this.aClass42_Sub3_43.aFloat88 * 768.0F / (float) this.lb;
				for (@Pc(515) int local515 = 0; local515 < this.anInt9706; local515++) {
					@Pc(535) int local535 = this.method8022(this.aByteArray117[local515], this.aShortArray150[local515], this.aShort124, this.aShortArray141[local515]);
					local546 = (float) (local535 >> 16 & 0xFF) * this.aClass42_Sub3_43.aFloat104;
					@Pc(555) float local555 = (float) (local535 >>> 24) * this.aClass42_Sub3_43.aFloat99;
					@Pc(560) short local560 = this.aShortArray142[local515];
					@Pc(571) float local571 = (float) (local535 >> 8 & 0xFF) * this.aClass42_Sub3_43.aFloat93;
					@Pc(576) short local576 = (short) local447[local560];
					if (local576 == 0) {
						local604 = ((float) local444[local560] * local483 + (float) local450[local560] * local477 + (float) local453[local560] * local489) * 0.0026041667F;
					} else {
						local604 = ((float) local444[local560] * local483 + (float) local450[local560] * local477 + local489 * (float) local453[local560]) / (float) (local576 * 256);
					}
					@Pc(641) float local641 = local493 + (local604 < 0.0F ? local513 : local503) * local604;
					@Pc(646) int local646 = (int) (local555 * local641);
					if (local646 < 0) {
						local646 = 0;
					} else if (local646 > 255) {
						local646 = 255;
					}
					@Pc(667) int local667 = (int) (local546 * local641);
					if (local667 < 0) {
						local667 = 0;
					} else if (local667 > 255) {
						local667 = 255;
					}
					@Pc(683) int local683 = (int) (local571 * local641);
					local191.anInt6217 = local560 * local106 + local110;
					if (local683 < 0) {
						local683 = 0;
					} else if (local683 > 255) {
						local683 = 255;
					}
					local191.method5214(local646);
					local191.method5214(local667);
					local191.method5214(local683);
					local191.method5214(255 - (this.aByteArray117[local515] & 0xFF));
					local560 = this.aShortArray148[local515];
					local576 = local447[local560];
					if (local576 == 0) {
						local604 = (local489 * (float) local453[local560] + (float) local450[local560] * local477 + local483 * (float) local444[local560]) * 0.0026041667F;
					} else {
						local604 = ((float) local444[local560] * local483 + (float) local450[local560] * local477 + (float) local453[local560] * local489) / (float) (local576 * 256);
					}
					local641 = local604 * (local604 < 0.0F ? local513 : local503) + local493;
					local646 = (int) (local555 * local641);
					if (local646 < 0) {
						local646 = 0;
					} else if (local646 > 255) {
						local646 = 255;
					}
					local667 = (int) (local641 * local546);
					if (local667 < 0) {
						local667 = 0;
					} else if (local667 > 255) {
						local667 = 255;
					}
					local683 = (int) (local641 * local571);
					local191.anInt6217 = local560 * local106 + local110;
					if (local683 < 0) {
						local683 = 0;
					} else if (local683 > 255) {
						local683 = 255;
					}
					local191.method5214(local646);
					local191.method5214(local667);
					local191.method5214(local683);
					local191.method5214(255 - (this.aByteArray117[local515] & 0xFF));
					local560 = this.aShortArray146[local515];
					local576 = local447[local560];
					if (local576 == 0) {
						local604 = ((float) local444[local560] * local483 + (float) local450[local560] * local477 + local489 * (float) local453[local560]) * 0.0026041667F;
					} else {
						local604 = ((float) local453[local560] * local489 + local477 * (float) local450[local560] + (float) local444[local560] * local483) / (float) (local576 * 256);
					}
					local641 = local493 + (local604 < 0.0F ? local513 : local503) * local604;
					local646 = (int) (local641 * local555);
					local667 = (int) (local546 * local641);
					if (local646 < 0) {
						local646 = 0;
					} else if (local646 > 255) {
						local646 = 255;
					}
					local683 = (int) (local641 * local571);
					if (local667 < 0) {
						local667 = 0;
					} else if (local667 > 255) {
						local667 = 255;
					}
					if (local683 < 0) {
						local683 = 0;
					} else if (local683 > 255) {
						local683 = 255;
					}
					local191.anInt6217 = local560 * local106 + local110;
					local191.method5214(local646);
					local191.method5214(local667);
					local191.method5214(local683);
					local191.method5214(255 - (this.aByteArray117[local515] & 0xFF));
				}
			} else {
				for (local199 = 0; local199 < this.anInt9706; local199++) {
					local208 = this.method8022(this.aByteArray117[local199], this.aShortArray150[local199], this.aShort124, this.aShortArray141[local199]);
					local191.anInt6217 = this.aShortArray142[local199] * local106 + local110;
					local191.method5223(local208);
					local191.anInt6217 = local110 + local106 * this.aShortArray148[local199];
					local191.method5223(local208);
					local191.anInt6217 = local106 * this.aShortArray146[local199] + local110;
					local191.method5223(local208);
				}
			}
		}
		if (local27) {
			if (this.aClass43_1 == null) {
				local447 = this.aByteArray118;
				local444 = this.aShortArray151;
				local450 = this.aShortArray147;
				local453 = this.aShortArray145;
			} else {
				local447 = this.aClass43_1.aByteArray23;
				local444 = this.aClass43_1.aShortArray24;
				local453 = this.aClass43_1.aShortArray22;
				local450 = this.aClass43_1.aShortArray23;
			}
			@Pc(1088) float local1088 = 3.0F / (float) this.lb;
			local604 = 3.0F / (float) (this.lb / 2 + this.lb);
			local191.anInt6217 = local112;
			if (this.aClass42_Sub3_43.aBoolean292) {
				for (local236 = 0; local236 < this.anInt9702; local236++) {
					local245 = local447[local236] & 0xFF;
					if (local245 == 0) {
						local191.method4923(local604 * (float) local450[local236]);
						local191.method4923(local604 * (float) local444[local236]);
						local191.method4923(local604 * (float) local453[local236]);
					} else {
						local546 = local1088 / (float) local245;
						local191.method4923((float) local450[local236] * local546);
						local191.method4923((float) local444[local236] * local546);
						local191.method4923((float) local453[local236] * local546);
					}
					local191.anInt6217 += local106 - 12;
				}
			} else {
				for (local236 = 0; local236 < this.anInt9702; local236++) {
					local245 = local447[local236] & 0xFF;
					if (local245 == 0) {
						local191.method4924((float) local450[local236] * local604);
						local191.method4924((float) local444[local236] * local604);
						local191.method4924(local604 * (float) local453[local236]);
					} else {
						local546 = local1088 / (float) local245;
						local191.method4924((float) local450[local236] * local546);
						local191.method4924((float) local444[local236] * local546);
						local191.method4924((float) local453[local236] * local546);
					}
					local191.anInt6217 += local106 - 12;
				}
			}
		}
		if (local49) {
			local191.anInt6217 = local114;
			if (this.aClass42_Sub3_43.aBoolean292) {
				for (local199 = 0; local199 < this.anInt9702; local199++) {
					local191.method4923(this.aFloatArray70[local199]);
					local191.method4923(this.aFloatArray71[local199]);
					local191.anInt6217 += local106 - 8;
				}
			} else {
				for (local199 = 0; local199 < this.anInt9702; local199++) {
					local191.method4924(this.aFloatArray70[local199]);
					local191.method4924(this.aFloatArray71[local199]);
					local191.anInt6217 += local106 - 8;
				}
			}
		}
		local191.anInt6217 = this.anInt9702 * local106;
		@Pc(1420) Interface14 local1420;
		if (arg0) {
			if (this.anInterface14_7 == null) {
				this.anInterface14_7 = this.aClass42_Sub3_43.method3261(local106, true, local191.anInt6217, local191.aByteArray82);
			} else {
				this.anInterface14_7.method6394(local191.anInt6217, local191.aByteArray82, local106);
			}
			local1420 = this.anInterface14_7;
			this.aByte110 = 0;
		} else {
			local1420 = this.aClass42_Sub3_43.method3261(local106, false, local191.anInt6217, local191.aByteArray82);
			this.aBoolean687 = true;
		}
		if (local38) {
			this.aClass65_15.aByte35 = 0;
			this.aClass65_15.anInterface14_1 = local1420;
		}
		if (local49) {
			this.aClass65_16.aByte35 = local114;
			this.aClass65_16.anInterface14_1 = local1420;
		}
		if (local16) {
			this.aClass65_14.aByte35 = local110;
			this.aClass65_14.anInterface14_1 = local1420;
		}
		if (local27) {
			this.aClass65_13.anInterface14_1 = local1420;
			this.aClass65_13.aByte35 = local112;
		}
	}

	@OriginalMember(owner = "client!ww", name = "ea", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			Static520.anInt9345 = 0;
			local26 = 0;
			Static211.anInt4657 = 0;
			Static375.anInt6907 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray88.length > local38) {
					local52 = this.anIntArrayArray88[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static520.anInt9345 += this.anIntArray707[local60];
						Static211.anInt4657 += this.anIntArray703[local60];
						Static375.anInt6907 += this.anIntArray705[local60];
						local26++;
					}
				}
			}
			if (local26 > 0) {
				Static211.anInt4657 = Static211.anInt4657 / local26 + local22;
				Static520.anInt9345 = Static520.anInt9345 / local26 + local14;
				Static375.anInt6907 = local18 + Static375.anInt6907 / local26;
			} else {
				Static211.anInt4657 = local22;
				Static520.anInt9345 = local14;
				Static375.anInt6907 = local18;
			}
			return;
		}
		@Pc(158) int[] local158;
		@Pc(160) int local160;
		if (arg0 == 1) {
			local18 = arg4 << 4;
			local14 = arg2 << 4;
			local22 = arg3 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray88.length > local32) {
					local158 = this.anIntArrayArray88[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local54 = local158[local160];
						this.anIntArray707[local54] += local14;
						this.anIntArray703[local54] += local22;
						this.anIntArray705[local54] += local18;
					}
				}
			}
			return;
		}
		@Pc(281) int local281;
		@Pc(300) int local300;
		@Pc(762) int local762;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray88.length > local32) {
					local158 = this.anIntArrayArray88[local32];
					if ((arg5 & 0x1) == 0) {
						for (local160 = 0; local160 < local158.length; local160++) {
							local54 = local158[local160];
							this.anIntArray707[local54] -= Static520.anInt9345;
							this.anIntArray703[local54] -= Static211.anInt4657;
							this.anIntArray705[local54] -= Static375.anInt6907;
							if (arg4 != 0) {
								local60 = Class12_Sub1_Sub36.anIntArray667[arg4];
								local281 = Class12_Sub1_Sub36.anIntArray668[arg4];
								local300 = this.anIntArray703[local54] * local60 + local281 * this.anIntArray707[local54] + 32767 >> 15;
								this.anIntArray703[local54] = local281 * this.anIntArray703[local54] + 32767 - this.anIntArray707[local54] * local60 >> 15;
								this.anIntArray707[local54] = local300;
							}
							if (arg2 != 0) {
								local60 = Class12_Sub1_Sub36.anIntArray667[arg2];
								local281 = Class12_Sub1_Sub36.anIntArray668[arg2];
								local300 = this.anIntArray703[local54] * local281 + 32767 - this.anIntArray705[local54] * local60 >> 15;
								this.anIntArray705[local54] = local281 * this.anIntArray705[local54] + local60 * this.anIntArray703[local54] + 32767 >> 15;
								this.anIntArray703[local54] = local300;
							}
							if (arg3 != 0) {
								local60 = Class12_Sub1_Sub36.anIntArray667[arg3];
								local281 = Class12_Sub1_Sub36.anIntArray668[arg3];
								local300 = local60 * this.anIntArray705[local54] + this.anIntArray707[local54] * local281 + 32767 >> 15;
								this.anIntArray705[local54] = local281 * this.anIntArray705[local54] + 32767 - local60 * this.anIntArray707[local54] >> 15;
								this.anIntArray707[local54] = local300;
							}
							this.anIntArray707[local54] += Static520.anInt9345;
							this.anIntArray703[local54] += Static211.anInt4657;
							this.anIntArray705[local54] += Static375.anInt6907;
						}
					} else {
						for (local160 = 0; local160 < local158.length; local160++) {
							local54 = local158[local160];
							this.anIntArray707[local54] -= Static520.anInt9345;
							this.anIntArray703[local54] -= Static211.anInt4657;
							this.anIntArray705[local54] -= Static375.anInt6907;
							if (arg2 != 0) {
								local60 = Class12_Sub1_Sub36.anIntArray667[arg2];
								local281 = Class12_Sub1_Sub36.anIntArray668[arg2];
								local300 = local281 * this.anIntArray703[local54] + 32767 - local60 * this.anIntArray705[local54] >> 15;
								this.anIntArray705[local54] = local60 * this.anIntArray703[local54] + local281 * this.anIntArray705[local54] + 32767 >> 15;
								this.anIntArray703[local54] = local300;
							}
							if (arg4 != 0) {
								local60 = Class12_Sub1_Sub36.anIntArray667[arg4];
								local281 = Class12_Sub1_Sub36.anIntArray668[arg4];
								local300 = this.anIntArray707[local54] * local281 + local60 * this.anIntArray703[local54] + 32767 >> 15;
								this.anIntArray703[local54] = this.anIntArray703[local54] * local281 + 32767 - this.anIntArray707[local54] * local60 >> 15;
								this.anIntArray707[local54] = local300;
							}
							if (arg3 != 0) {
								local60 = Class12_Sub1_Sub36.anIntArray667[arg3];
								local281 = Class12_Sub1_Sub36.anIntArray668[arg3];
								local300 = this.anIntArray707[local54] * local281 + local60 * this.anIntArray705[local54] + 32767 >> 15;
								this.anIntArray705[local54] = this.anIntArray705[local54] * local281 + 32767 - this.anIntArray707[local54] * local60 >> 15;
								this.anIntArray707[local54] = local300;
							}
							this.anIntArray707[local54] += Static520.anInt9345;
							this.anIntArray703[local54] += Static211.anInt4657;
							this.anIntArray705[local54] += Static375.anInt6907;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray88.length) {
						local52 = this.anIntArrayArray88[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local281 = this.anIntArray704[local60];
							local300 = this.anIntArray704[local60 + 1];
							for (local762 = local281; local762 < local300; local762++) {
								@Pc(771) int local771 = this.aShortArray143[local762] - 1;
								if (local771 == -1) {
									break;
								}
								@Pc(781) int local781;
								@Pc(785) int local785;
								@Pc(803) int local803;
								if (arg4 != 0) {
									local781 = Class12_Sub1_Sub36.anIntArray667[arg4];
									local785 = Class12_Sub1_Sub36.anIntArray668[arg4];
									local803 = this.aShortArray147[local771] * local785 + this.aShortArray151[local771] * local781 + 32767 >> 15;
									this.aShortArray151[local771] = (short) (this.aShortArray151[local771] * local785 + 32767 - local781 * this.aShortArray147[local771] >> 15);
									this.aShortArray147[local771] = (short) local803;
								}
								if (arg2 != 0) {
									local781 = Class12_Sub1_Sub36.anIntArray667[arg2];
									local785 = Class12_Sub1_Sub36.anIntArray668[arg2];
									local803 = local785 * this.aShortArray151[local771] + 32767 - this.aShortArray145[local771] * local781 >> 15;
									this.aShortArray145[local771] = (short) (this.aShortArray151[local771] * local781 + local785 * this.aShortArray145[local771] + 32767 >> 15);
									this.aShortArray151[local771] = (short) local803;
								}
								if (arg3 != 0) {
									local781 = Class12_Sub1_Sub36.anIntArray667[arg3];
									local785 = Class12_Sub1_Sub36.anIntArray668[arg3];
									local803 = this.aShortArray147[local771] * local785 + this.aShortArray145[local771] * local781 + 32767 >> 15;
									this.aShortArray145[local771] = (short) (this.aShortArray145[local771] * local785 + 32767 - local781 * this.aShortArray147[local771] >> 15);
									this.aShortArray147[local771] = (short) local803;
								}
							}
						}
					}
				}
				if (this.aClass65_13 == null && this.aClass65_14 != null) {
					this.aClass65_14.anInterface14_1 = null;
				}
				if (this.aClass65_13 != null) {
					this.aClass65_13.anInterface14_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray88.length) {
					local158 = this.anIntArrayArray88[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local54 = local158[local160];
						this.anIntArray707[local54] -= Static520.anInt9345;
						this.anIntArray703[local54] -= Static211.anInt4657;
						this.anIntArray705[local54] -= Static375.anInt6907;
						this.anIntArray707[local54] = this.anIntArray707[local54] * arg2 >> 7;
						this.anIntArray703[local54] = arg3 * this.anIntArray703[local54] >> 7;
						this.anIntArray705[local54] = this.anIntArray705[local54] * arg4 >> 7;
						this.anIntArray707[local54] += Static520.anInt9345;
						this.anIntArray703[local54] += Static211.anInt4657;
						this.anIntArray705[local54] += Static375.anInt6907;
					}
				}
			}
		} else {
			@Pc(1222) Class205 local1222;
			@Pc(1227) Class74 local1227;
			if (arg0 == 5) {
				if (this.anIntArrayArray89 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray89.length) {
							local158 = this.anIntArrayArray89[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local54 = local158[local160];
								local60 = (this.aByteArray117[local54] & 0xFF) + (arg2 * 8);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray117[local54] = (byte) local60;
							}
							if (local158.length > 0 && this.aClass65_14 != null) {
								this.aClass65_14.anInterface14_1 = null;
							}
						}
					}
					if (this.aClass205Array1 != null) {
						for (local32 = 0; local32 < this.anInt9707; local32++) {
							local1222 = this.aClass205Array1[local32];
							local1227 = this.aClass74Array1[local32];
							local1227.anInt2285 = local1227.anInt2285 & 0xFFFFFF | 255 - (this.aByteArray117[local1222.anInt5980] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1476) Class74 local1476;
				if (arg0 == 8) {
					if (this.anIntArrayArray87 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray87.length > local32) {
								local158 = this.anIntArrayArray87[local32];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1476 = this.aClass74Array1[local158[local160]];
									local1476.anInt2286 += arg2;
									local1476.anInt2278 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray87 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray87.length) {
								local158 = this.anIntArrayArray87[local32];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1476 = this.aClass74Array1[local158[local160]];
									local1476.anInt2280 = local1476.anInt2280 * arg3 >> 7;
									local1476.anInt2282 = arg2 * local1476.anInt2282 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray87 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray87.length) {
							local158 = this.anIntArrayArray87[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local1476 = this.aClass74Array1[local158[local160]];
								local1476.anInt2276 = arg2 + local1476.anInt2276 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray89 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray89.length > local32) {
						local158 = this.anIntArrayArray89[local32];
						for (local160 = 0; local160 < local158.length; local160++) {
							local54 = local158[local160];
							local60 = this.aShortArray150[local54] & 0xFFFF;
							local281 = local60 >> 10 & 0x3F;
							local300 = local60 >> 7 & 0x7;
							local762 = local60 & 0x7F;
							@Pc(1318) int local1318 = local281 + arg2 & 0x3F;
							local300 += arg3 / 4;
							if (local300 < 0) {
								local300 = 0;
							} else if (local300 > 7) {
								local300 = 7;
							}
							local762 += arg4;
							if (local762 < 0) {
								local762 = 0;
							} else if (local762 > 127) {
								local762 = 127;
							}
							this.aShortArray150[local54] = (short) (local1318 << 10 | local300 << 7 | local762);
						}
						if (local158.length > 0 && this.aClass65_14 != null) {
							this.aClass65_14.anInterface14_1 = null;
						}
					}
				}
				if (this.aClass205Array1 != null) {
					for (local32 = 0; local32 < this.anInt9707; local32++) {
						local1222 = this.aClass205Array1[local32];
						local1227 = this.aClass74Array1[local32];
						local1227.anInt2285 = Static141.anIntArray234[this.aShortArray150[local1222.anInt5980] & 0xFFFF] & 0xFFFFFF | local1227.anInt2285 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "OA", descriptor = "(I)V")
	@Override
	public void OA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub1_Sub36.anIntArray667[arg0];
		@Pc(13) int local13 = Class12_Sub1_Sub36.anIntArray668[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9675; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray707[local15] + local9 * this.anIntArray705[local15] >> 15;
			this.anIntArray705[local15] = this.anIntArray705[local15] * local13 - local9 * this.anIntArray707[local15] >> 15;
			this.anIntArray707[local15] = local33;
		}
		this.aBoolean686 = false;
		if (this.aClass65_15 != null) {
			this.aClass65_15.anInterface14_1 = null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		if (!this.aBoolean686) {
			this.method8015();
		}
		return this.aShort119;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Z)V")
	private void method8012() {
		if (!this.aBoolean687) {
			return;
		}
		this.aBoolean687 = false;
		if (this.aClass142Array7 == null && this.aClass265Array7 == null && this.aClass205Array1 == null) {
			if (this.anIntArray707 != null && !Static206.method7971(this.anInt9685, this.anInt9679)) {
				if (this.aClass65_15 != null && this.aClass65_15.anInterface14_1 == null) {
					this.aBoolean687 = true;
				} else {
					if (!this.aBoolean686) {
						this.method8015();
					}
					this.anIntArray707 = null;
				}
			}
			if (this.anIntArray703 != null && !Static226.method4097(this.anInt9679, this.anInt9685)) {
				if (this.aClass65_15 != null && this.aClass65_15.anInterface14_1 == null) {
					this.aBoolean687 = true;
				} else {
					if (!this.aBoolean686) {
						this.method8015();
					}
					this.anIntArray703 = null;
				}
			}
			if (this.anIntArray705 != null && !Static480.method7204(this.anInt9679, this.anInt9685)) {
				if (this.aClass65_15 != null && this.aClass65_15.anInterface14_1 == null) {
					this.aBoolean687 = true;
				} else {
					if (!this.aBoolean686) {
						this.method8015();
					}
					this.anIntArray705 = null;
				}
			}
		}
		if (this.aShortArray143 != null && this.anIntArray707 == null && this.anIntArray703 == null && this.anIntArray705 == null) {
			this.aShortArray143 = null;
			this.anIntArray704 = null;
		}
		if (this.aByteArray118 != null && !Static513.method7615(this.anInt9685, this.anInt9679)) {
			if (this.aClass65_13 == null) {
				if (this.aClass65_14 != null && this.aClass65_14.anInterface14_1 == null) {
					this.aBoolean687 = true;
				} else {
					this.aShortArray147 = this.aShortArray151 = this.aShortArray145 = null;
					this.aByteArray118 = null;
				}
			} else if (this.aClass65_13.anInterface14_1 == null) {
				this.aBoolean687 = true;
			} else {
				this.aShortArray147 = this.aShortArray151 = this.aShortArray145 = null;
				this.aByteArray118 = null;
			}
		}
		if (this.aShortArray150 != null && !Static363.method5668(this.anInt9679, this.anInt9685)) {
			if (this.aClass65_14 != null && this.aClass65_14.anInterface14_1 == null) {
				this.aBoolean687 = true;
			} else {
				this.aShortArray150 = null;
			}
		}
		if (this.aByteArray117 != null && !Static107.method2241(this.anInt9679, this.anInt9685)) {
			if (this.aClass65_14 != null && this.aClass65_14.anInterface14_1 == null) {
				this.aBoolean687 = true;
			} else {
				this.aByteArray117 = null;
			}
		}
		if (this.aFloatArray70 != null && !Static219.method4019(this.anInt9679, this.anInt9685)) {
			if (this.aClass65_16 != null && this.aClass65_16.anInterface14_1 == null) {
				this.aBoolean687 = true;
			} else {
				this.aFloatArray70 = this.aFloatArray71 = null;
			}
		}
		if (this.aShortArray141 != null && !Static447.method6759(this.anInt9685, this.anInt9679)) {
			if (this.aClass65_14 != null && this.aClass65_14.anInterface14_1 == null) {
				this.aBoolean687 = true;
			} else {
				this.aShortArray141 = null;
			}
		}
		if (this.aShortArray142 != null && !Static137.method2804(this.anInt9679, this.anInt9685)) {
			if ((this.aClass121_1 == null || this.aClass121_1.anInterface2_2 != null) && (this.aClass65_14 == null || this.aClass65_14.anInterface14_1 != null)) {
				this.aShortArray142 = this.aShortArray148 = this.aShortArray146 = null;
			} else {
				this.aBoolean687 = true;
			}
		}
		if (this.anIntArrayArray89 != null && !Static507.method7524(this.anInt9679, this.anInt9685)) {
			this.anIntArrayArray89 = null;
			this.aShortArray149 = null;
		}
		if (this.anIntArrayArray88 != null && !Static469.method7055(this.anInt9685, this.anInt9679)) {
			this.aShortArray144 = null;
			this.anIntArrayArray88 = null;
		}
		if (this.anIntArrayArray87 != null && !Static389.method6153(this.anInt9685, this.anInt9679)) {
			this.anIntArrayArray87 = null;
		}
		if (this.anIntArray706 != null && (this.anInt9685 & 0x800) == 0 && (this.anInt9685 & 0x40000) == 0) {
			this.anIntArray706 = null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "m", descriptor = "(I)V")
	@Override
	public void m(@OriginalArg(0) int arg0) {
		this.anInt9685 = arg0;
		this.aBoolean687 = true;
		if (this.aClass43_1 != null && (this.anInt9685 & 0x10000) == 0) {
			this.aByteArray118 = this.aClass43_1.aByteArray23;
			this.aShortArray145 = this.aClass43_1.aShortArray22;
			this.aShortArray151 = this.aClass43_1.aShortArray24;
			this.aShortArray147 = this.aClass43_1.aShortArray23;
			this.aClass43_1 = null;
		}
		this.method8012();
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method7998(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class26_Sub3 local8 = (Class26_Sub3) arg0;
		if (this.anInt9706 == 0 || local8.anInt9706 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt9675;
		@Pc(27) int[] local27 = local8.anIntArray707;
		@Pc(30) int[] local30 = local8.anIntArray703;
		@Pc(33) int[] local33 = local8.anIntArray705;
		@Pc(36) short[] local36 = local8.aShortArray147;
		@Pc(39) short[] local39 = local8.aShortArray151;
		@Pc(42) short[] local42 = local8.aShortArray145;
		@Pc(45) byte[] local45 = local8.aByteArray118;
		@Pc(60) short[] local60;
		@Pc(56) short[] local56;
		@Pc(52) short[] local52;
		@Pc(64) byte[] local64;
		if (this.aClass43_1 == null) {
			local52 = null;
			local60 = null;
			local64 = null;
			local56 = null;
		} else {
			local52 = this.aClass43_1.aShortArray22;
			local56 = this.aClass43_1.aShortArray24;
			local60 = this.aClass43_1.aShortArray23;
			local64 = this.aClass43_1.aByteArray23;
		}
		@Pc(85) short[] local85;
		@Pc(81) short[] local81;
		@Pc(89) short[] local89;
		@Pc(93) byte[] local93;
		if (local8.aClass43_1 == null) {
			local89 = null;
			local85 = null;
			local81 = null;
			local93 = null;
		} else {
			local81 = local8.aClass43_1.aShortArray24;
			local85 = local8.aClass43_1.aShortArray23;
			local89 = local8.aClass43_1.aShortArray22;
			local93 = local8.aClass43_1.aByteArray23;
		}
		@Pc(106) int[] local106 = local8.anIntArray704;
		@Pc(109) short[] local109 = local8.aShortArray143;
		if (!local8.aBoolean686) {
			local8.method8015();
		}
		@Pc(118) short local118 = local8.aShort125;
		@Pc(121) short local121 = local8.aShort120;
		@Pc(124) short local124 = local8.aShort118;
		@Pc(127) short local127 = local8.aShort123;
		@Pc(130) short local130 = local8.aShort119;
		@Pc(133) short local133 = local8.aShort122;
		for (@Pc(135) int local135 = 0; local135 < this.anInt9675; local135++) {
			@Pc(144) int local144 = this.anIntArray703[local135] - arg2;
			if (local144 >= local118 && local121 >= local144) {
				@Pc(163) int local163 = this.anIntArray707[local135] - arg1;
				if (local124 <= local163 && local127 >= local163) {
					@Pc(179) int local179 = this.anIntArray705[local135] - arg3;
					if (local179 >= local130 && local179 <= local133) {
						@Pc(197) int local197 = -1;
						@Pc(202) int local202 = this.anIntArray704[local135];
						@Pc(209) int local209 = this.anIntArray704[local135 + 1];
						for (@Pc(211) int local211 = local202; local211 < local209; local211++) {
							local197 = this.aShortArray143[local211] - 1;
							if (local197 == -1 || this.aByteArray118[local197] != 0) {
								break;
							}
						}
						if (local197 != -1) {
							for (@Pc(247) int local247 = 0; local247 < local24; local247++) {
								if (local163 == local27[local247] && local33[local247] == local179 && local30[local247] == local144) {
									@Pc(266) int local266 = -1;
									local209 = local106[local247 + 1];
									local202 = local106[local247];
									for (@Pc(278) int local278 = local202; local278 < local209; local278++) {
										local266 = local109[local278] - 1;
										if (local266 == -1 || local45[local266] != 0) {
											break;
										}
									}
									if (local266 != -1) {
										if (local60 == null) {
											this.aClass43_1 = new Class43();
											local60 = this.aClass43_1.aShortArray23 = Static531.method7868(this.aShortArray147);
											local56 = this.aClass43_1.aShortArray24 = Static531.method7868(this.aShortArray151);
											local52 = this.aClass43_1.aShortArray22 = Static531.method7868(this.aShortArray145);
											local64 = this.aClass43_1.aByteArray23 = Static530.method7853(this.aByteArray118);
										}
										if (local85 == null) {
											@Pc(362) Class43 local362 = local8.aClass43_1 = new Class43();
											local85 = local362.aShortArray23 = Static531.method7868(local36);
											local81 = local362.aShortArray24 = Static531.method7868(local39);
											local89 = local362.aShortArray22 = Static531.method7868(local42);
											local93 = local362.aByteArray23 = Static530.method7853(local45);
										}
										@Pc(395) short local395 = this.aShortArray147[local197];
										@Pc(400) short local400 = this.aShortArray151[local197];
										@Pc(405) short local405 = this.aShortArray145[local197];
										@Pc(410) byte local410 = this.aByteArray118[local197];
										local202 = local106[local247];
										local209 = local106[local247 + 1];
										@Pc(430) int local430;
										for (@Pc(422) int local422 = local202; local422 < local209; local422++) {
											local430 = local109[local422] - 1;
											if (local430 == -1) {
												break;
											}
											if (local93[local430] != 0) {
												local85[local430] += local395;
												local81[local430] += local400;
												local89[local430] += local405;
												local93[local430] += local410;
											}
										}
										local202 = this.anIntArray704[local135];
										local400 = local39[local266];
										local209 = this.anIntArray704[local135 + 1];
										local405 = local42[local266];
										local410 = local45[local266];
										local395 = local36[local266];
										for (local430 = local202; local430 < local209; local430++) {
											@Pc(516) int local516 = this.aShortArray143[local430] - 1;
											if (local516 == -1) {
												break;
											}
											if (local64[local516] != 0) {
												local60[local516] += local395;
												local56[local516] += local400;
												local52[local516] += local405;
												local64[local516] += local410;
											}
										}
										if (this.aClass65_13 == null && this.aClass65_14 != null) {
											this.aClass65_14.anInterface14_1 = null;
										}
										if (this.aClass65_13 != null) {
											this.aClass65_13.anInterface14_1 = null;
										}
										if (local8.aClass65_13 == null && local8.aClass65_14 != null) {
											local8.aClass65_14.anInterface14_1 = null;
										}
										if (local8.aClass65_13 != null) {
											local8.aClass65_13.anInterface14_1 = null;
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

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!vh;)V")
	private void method8013(@OriginalArg(1) Class12_Sub4_Sub10_Sub2 arg0) {
		if (this.anInt9702 > this.aClass42_Sub3_43.anIntArray296.length) {
			this.aClass42_Sub3_43.anIntArray294 = new int[this.anInt9702];
			this.aClass42_Sub3_43.anIntArray296 = new int[this.anInt9702];
		}
		@Pc(28) int[] local28 = this.aClass42_Sub3_43.anIntArray296;
		@Pc(32) int[] local32 = this.aClass42_Sub3_43.anIntArray294;
		@Pc(65) int local65;
		@Pc(103) int local103;
		@Pc(112) int local112;
		for (@Pc(38) int local38 = 0; local38 < this.anInt9675; local38++) {
			local65 = (this.anIntArray707[local38] - (this.anIntArray703[local38] * this.aClass42_Sub3_43.anInt3693 >> 8) >> this.aClass42_Sub3_43.anInt3672) - arg0.anInt9236;
			@Pc(89) int local89 = (this.anIntArray705[local38] - (this.aClass42_Sub3_43.anInt3683 * this.anIntArray703[local38] >> 8) >> this.aClass42_Sub3_43.anInt3672) - arg0.anInt9237;
			@Pc(94) int local94 = this.anIntArray704[local38];
			@Pc(101) int local101 = this.anIntArray704[local38 + 1];
			for (local103 = local94; local103 < local101; local103++) {
				local112 = this.aShortArray143[local103] - 1;
				if (local112 == -1) {
					break;
				}
				local28[local112] = local65;
				local32[local112] = local89;
			}
		}
		for (local65 = 0; local65 < this.anInt9719; local65++) {
			if (this.aByteArray117 == null || this.aByteArray117[local65] <= 128) {
				@Pc(155) short local155 = this.aShortArray142[local65];
				@Pc(160) short local160 = this.aShortArray148[local65];
				@Pc(165) short local165 = this.aShortArray146[local65];
				local103 = local28[local155];
				local112 = local28[local160];
				@Pc(177) int local177 = local28[local165];
				@Pc(181) int local181 = local32[local155];
				@Pc(185) int local185 = local32[local160];
				@Pc(189) int local189 = local32[local165];
				if (-((local177 - local112) * (local185 + -local181)) + (local185 - local189) * (local103 - local112) > 0) {
					arg0.method7616(local185, local181, local112, local103, local177, local189);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		return this.anInt9685;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZIILclient!ln;IFFJII)S")
	private short method8014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class192 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray704[arg8];
		@Pc(17) int local17 = this.anIntArray704[arg8 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray143[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static51.aLongArray21[local21] == arg6) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray143[local19] = (short) (this.anInt9702 + 1);
		Static51.aLongArray21[local19] = arg6;
		this.aShortArray147[this.anInt9702] = (short) arg3;
		this.aShortArray151[this.anInt9702] = (short) arg7;
		this.aShortArray145[this.anInt9702] = (short) arg1;
		this.aByteArray118[this.anInt9702] = (byte) arg0;
		this.aFloatArray70[this.anInt9702] = arg5;
		this.aFloatArray71[this.anInt9702] = arg4;
		return (short) this.anInt9702++;
	}

	@OriginalMember(owner = "client!ww", name = "n", descriptor = "()I")
	@Override
	public int n() {
		if (!this.aBoolean686) {
			this.method8015();
		}
		return this.aShort120;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V")
	private void method8015() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(24) int local24 = -32768;
		@Pc(26) int local26 = -32768;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < this.anInt9675; local32++) {
			@Pc(39) int local39 = this.anIntArray707[local32];
			@Pc(44) int local44 = this.anIntArray703[local32];
			@Pc(49) int local49 = this.anIntArray705[local32];
			if (local24 < local44) {
				local24 = local44;
			}
			if (local39 < local7) {
				local7 = local39;
			}
			if (local44 < local9) {
				local9 = local44;
			}
			if (local39 > local13) {
				local13 = local39;
			}
			if (local49 > local26) {
				local26 = local49;
			}
			if (local49 < local11) {
				local11 = local49;
			}
			@Pc(95) int local95 = local49 * local49 + local39 * local39;
			if (local28 < local95) {
				local28 = local95;
			}
			local95 = local39 * local39 + local49 * local49 + local44 * local44;
			if (local95 > local30) {
				local30 = local95;
			}
		}
		this.aShort118 = (short) local7;
		this.aShort125 = (short) local9;
		this.aShort122 = (short) local26;
		this.aShort120 = (short) local24;
		this.aShort123 = (short) local13;
		this.aShort119 = (short) local11;
		this.aShort121 = (short) (Math.sqrt((double) local28) + 0.99D);
		Math.sqrt((double) local30);
		this.aBoolean686 = true;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZLclient!ww;ILclient!ww;IZ)Lclient!r;")
	private Class26 method8016(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class26_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26_Sub3 arg3, @OriginalArg(5) boolean arg4) {
		arg3.anInt9719 = this.anInt9719;
		arg3.anInt9698 = this.anInt9698;
		arg3.anInt9679 = this.anInt9679;
		arg3.anInt9685 = arg2;
		arg3.aByte110 = 0;
		arg3.lb = this.lb;
		arg3.aShort124 = this.aShort124;
		arg3.anInt9702 = this.anInt9702;
		arg3.anInt9675 = this.anInt9675;
		arg3.anInt9707 = this.anInt9707;
		arg3.anInt9706 = this.anInt9706;
		@Pc(53) boolean local53 = Static334.method5354(arg2, this.anInt9679);
		@Pc(59) boolean local59 = Static437.method6659(this.anInt9679, arg2);
		@Pc(65) boolean local65 = Static190.method3667(arg2, this.anInt9679);
		@Pc(77) boolean local77 = local59 | local53 | local65;
		@Pc(186) int local186;
		if (local77) {
			if (!local53) {
				arg3.anIntArray707 = this.anIntArray707;
			} else if (arg1.anIntArray707 == null || arg1.anIntArray707.length < this.anInt9698) {
				arg3.anIntArray707 = arg1.anIntArray707 = new int[this.anInt9698];
			} else {
				arg3.anIntArray707 = arg1.anIntArray707;
			}
			if (!local59) {
				arg3.anIntArray703 = this.anIntArray703;
			} else if (arg1.anIntArray703 == null || this.anInt9698 > arg1.anIntArray703.length) {
				arg3.anIntArray703 = arg1.anIntArray703 = new int[this.anInt9698];
			} else {
				arg3.anIntArray703 = arg1.anIntArray703;
			}
			if (!local65) {
				arg3.anIntArray705 = this.anIntArray705;
			} else if (arg1.anIntArray705 == null || arg1.anIntArray705.length < this.anInt9698) {
				arg3.anIntArray705 = arg1.anIntArray705 = new int[this.anInt9698];
			} else {
				arg3.anIntArray705 = arg1.anIntArray705;
			}
			for (local186 = 0; local186 < this.anInt9698; local186++) {
				if (local53) {
					arg3.anIntArray707[local186] = this.anIntArray707[local186];
				}
				if (local59) {
					arg3.anIntArray703[local186] = this.anIntArray703[local186];
				}
				if (local65) {
					arg3.anIntArray705[local186] = this.anIntArray705[local186];
				}
			}
		} else {
			arg3.anIntArray707 = this.anIntArray707;
			arg3.anIntArray703 = this.anIntArray703;
			arg3.anIntArray705 = this.anIntArray705;
		}
		if (Static203.method3818(arg2, this.anInt9679)) {
			if (arg4) {
				arg3.aByte110 = (byte) (arg3.aByte110 | 0x1);
			}
			arg3.aClass65_15 = arg1.aClass65_15;
			arg3.aClass65_15.aByte35 = this.aClass65_15.aByte35;
			arg3.aClass65_15.anInterface14_1 = this.aClass65_15.anInterface14_1;
		} else if (Static368.method5723(arg2, this.anInt9679)) {
			arg3.aClass65_15 = this.aClass65_15;
		} else {
			arg3.aClass65_15 = null;
		}
		if (Static231.method4128(arg2, this.anInt9679)) {
			if (arg1.aShortArray150 == null || arg1.aShortArray150.length < this.anInt9706) {
				arg3.aShortArray150 = arg1.aShortArray150 = new short[this.anInt9706];
			} else {
				arg3.aShortArray150 = arg1.aShortArray150;
			}
			for (local186 = 0; local186 < this.anInt9706; local186++) {
				arg3.aShortArray150[local186] = this.aShortArray150[local186];
			}
		} else {
			arg3.aShortArray150 = this.aShortArray150;
		}
		if (Static486.method7266(arg2, this.anInt9679)) {
			if (arg1.aByteArray117 == null || this.anInt9706 > arg1.aByteArray117.length) {
				arg3.aByteArray117 = arg1.aByteArray117 = new byte[this.anInt9706];
			} else {
				arg3.aByteArray117 = arg1.aByteArray117;
			}
			for (local186 = 0; local186 < this.anInt9706; local186++) {
				arg3.aByteArray117[local186] = this.aByteArray117[local186];
			}
		} else {
			arg3.aByteArray117 = this.aByteArray117;
		}
		if (Static226.method4100(arg2, this.anInt9679)) {
			arg3.aClass65_14 = arg1.aClass65_14;
			if (arg4) {
				arg3.aByte110 = (byte) (arg3.aByte110 | 0x2);
			}
			arg3.aClass65_14.anInterface14_1 = this.aClass65_14.anInterface14_1;
			arg3.aClass65_14.aByte35 = this.aClass65_14.aByte35;
		} else if (Static125.method2670(this.anInt9679, arg2)) {
			arg3.aClass65_14 = this.aClass65_14;
		} else {
			arg3.aClass65_14 = null;
		}
		@Pc(551) int local551;
		if (Static133.method2769(this.anInt9679, arg2)) {
			if (arg1.aShortArray147 == null || arg1.aShortArray147.length < this.anInt9702) {
				local186 = this.anInt9702;
				arg3.aShortArray151 = arg1.aShortArray151 = new short[local186];
				arg3.aShortArray145 = arg1.aShortArray145 = new short[local186];
				arg3.aShortArray147 = arg1.aShortArray147 = new short[local186];
			} else {
				arg3.aShortArray147 = arg1.aShortArray147;
				arg3.aShortArray145 = arg1.aShortArray145;
				arg3.aShortArray151 = arg1.aShortArray151;
			}
			if (this.aClass43_1 == null) {
				for (local186 = 0; local186 < this.anInt9702; local186++) {
					arg3.aShortArray147[local186] = this.aShortArray147[local186];
					arg3.aShortArray151[local186] = this.aShortArray151[local186];
					arg3.aShortArray145[local186] = this.aShortArray145[local186];
				}
			} else {
				if (arg1.aClass43_1 == null) {
					arg1.aClass43_1 = new Class43();
				}
				@Pc(535) Class43 local535 = arg3.aClass43_1 = arg1.aClass43_1;
				if (local535.aShortArray23 == null || this.anInt9702 > local535.aShortArray23.length) {
					local551 = this.anInt9702;
					local535.aShortArray24 = new short[local551];
					local535.aShortArray22 = new short[local551];
					local535.aShortArray23 = new short[local551];
					local535.aByteArray23 = new byte[local551];
				}
				for (local551 = 0; local551 < this.anInt9702; local551++) {
					arg3.aShortArray147[local551] = this.aShortArray147[local551];
					arg3.aShortArray151[local551] = this.aShortArray151[local551];
					arg3.aShortArray145[local551] = this.aShortArray145[local551];
					local535.aShortArray23[local551] = this.aClass43_1.aShortArray23[local551];
					local535.aShortArray24[local551] = this.aClass43_1.aShortArray24[local551];
					local535.aShortArray22[local551] = this.aClass43_1.aShortArray22[local551];
					local535.aByteArray23[local551] = this.aClass43_1.aByteArray23[local551];
				}
			}
			arg3.aByteArray118 = this.aByteArray118;
		} else {
			arg3.aClass43_1 = this.aClass43_1;
			arg3.aByteArray118 = this.aByteArray118;
			arg3.aShortArray147 = this.aShortArray147;
			arg3.aShortArray151 = this.aShortArray151;
			arg3.aShortArray145 = this.aShortArray145;
		}
		if (Static108.method2268(this.anInt9679, arg2)) {
			if (arg4) {
				arg3.aByte110 = (byte) (arg3.aByte110 | 0x4);
			}
			arg3.aClass65_13 = arg1.aClass65_13;
			arg3.aClass65_13.aByte35 = this.aClass65_13.aByte35;
			arg3.aClass65_13.anInterface14_1 = this.aClass65_13.anInterface14_1;
		} else if (Static136.method2793(arg2, this.anInt9679)) {
			arg3.aClass65_13 = this.aClass65_13;
		} else {
			arg3.aClass65_13 = null;
		}
		if (Static172.method6604(arg2, this.anInt9679)) {
			if (arg1.aFloatArray70 == null || this.anInt9706 > arg1.aFloatArray70.length) {
				local186 = this.anInt9702;
				arg3.aFloatArray71 = arg1.aFloatArray71 = new float[local186];
				arg3.aFloatArray70 = arg1.aFloatArray70 = new float[local186];
			} else {
				arg3.aFloatArray71 = arg1.aFloatArray71;
				arg3.aFloatArray70 = arg1.aFloatArray70;
			}
			for (local186 = 0; local186 < this.anInt9702; local186++) {
				arg3.aFloatArray70[local186] = this.aFloatArray70[local186];
				arg3.aFloatArray71[local186] = this.aFloatArray71[local186];
			}
		} else {
			arg3.aFloatArray70 = this.aFloatArray70;
			arg3.aFloatArray71 = this.aFloatArray71;
		}
		if (Static462.method6933(arg2, this.anInt9679)) {
			if (arg4) {
				arg3.aByte110 = (byte) (arg3.aByte110 | 0x8);
			}
			arg3.aClass65_16 = arg1.aClass65_16;
			arg3.aClass65_16.anInterface14_1 = this.aClass65_16.anInterface14_1;
			arg3.aClass65_16.aByte35 = this.aClass65_16.aByte35;
		} else if (Static122.method2533(this.anInt9679, arg2)) {
			arg3.aClass65_16 = this.aClass65_16;
		} else {
			arg3.aClass65_16 = null;
		}
		if (Static403.method6321(this.anInt9679, arg2)) {
			if (arg1.aShortArray142 == null || this.anInt9706 > arg1.aShortArray142.length) {
				local186 = this.anInt9706;
				arg3.aShortArray148 = arg1.aShortArray148 = new short[local186];
				arg3.aShortArray146 = arg1.aShortArray146 = new short[local186];
				arg3.aShortArray142 = arg1.aShortArray142 = new short[local186];
			} else {
				arg3.aShortArray142 = arg1.aShortArray142;
				arg3.aShortArray146 = arg1.aShortArray146;
				arg3.aShortArray148 = arg1.aShortArray148;
			}
			for (local186 = 0; local186 < this.anInt9706; local186++) {
				arg3.aShortArray142[local186] = this.aShortArray142[local186];
				arg3.aShortArray148[local186] = this.aShortArray148[local186];
				arg3.aShortArray146[local186] = this.aShortArray146[local186];
			}
		} else {
			arg3.aShortArray142 = this.aShortArray142;
			arg3.aShortArray148 = this.aShortArray148;
			arg3.aShortArray146 = this.aShortArray146;
		}
		if (Static530.method7857(arg2, this.anInt9679)) {
			if (arg4) {
				arg3.aByte110 = (byte) (arg3.aByte110 | 0x10);
			}
			arg3.aClass121_1 = arg1.aClass121_1;
			arg3.aClass121_1.anInterface2_2 = this.aClass121_1.anInterface2_2;
		} else if (Static201.method3810(this.anInt9679, arg2)) {
			arg3.aClass121_1 = this.aClass121_1;
		} else {
			arg3.aClass121_1 = null;
		}
		if (Static412.method6427(arg2, this.anInt9679)) {
			if (arg1.aShortArray141 == null || arg1.aShortArray141.length < this.anInt9706) {
				local186 = this.anInt9706;
				arg3.aShortArray141 = arg1.aShortArray141 = new short[local186];
			} else {
				arg3.aShortArray141 = arg1.aShortArray141;
			}
			for (local186 = 0; local186 < this.anInt9706; local186++) {
				arg3.aShortArray141[local186] = this.aShortArray141[local186];
			}
		} else {
			arg3.aShortArray141 = this.aShortArray141;
		}
		if (!Static112.method2320(arg2, this.anInt9679)) {
			arg3.aClass74Array1 = this.aClass74Array1;
		} else if (arg1.aClass74Array1 == null || this.anInt9707 > arg1.aClass74Array1.length) {
			local186 = this.anInt9707;
			arg3.aClass74Array1 = arg1.aClass74Array1 = new Class74[local186];
			for (local551 = 0; local551 < this.anInt9707; local551++) {
				arg3.aClass74Array1[local551] = this.aClass74Array1[local551].method2074();
			}
		} else {
			arg3.aClass74Array1 = arg1.aClass74Array1;
			for (local186 = 0; local186 < this.anInt9707; local186++) {
				arg3.aClass74Array1[local186].method2079(this.aClass74Array1[local186]);
			}
		}
		arg3.aClass142Array7 = this.aClass142Array7;
		arg3.anIntArrayArray87 = this.anIntArrayArray87;
		arg3.anIntArray706 = this.anIntArray706;
		arg3.aShortArray149 = this.aShortArray149;
		arg3.aShortArray144 = this.aShortArray144;
		arg3.aShortArray143 = this.aShortArray143;
		if (this.aBoolean686) {
			arg3.aShort125 = this.aShort125;
			arg3.aShort123 = this.aShort123;
			arg3.aShort122 = this.aShort122;
			arg3.aShort121 = this.aShort121;
			arg3.aShort120 = this.aShort120;
			arg3.aShort118 = this.aShort118;
			arg3.aShort119 = this.aShort119;
			arg3.aBoolean686 = true;
		} else {
			arg3.aBoolean686 = false;
		}
		arg3.aClass265Array7 = this.aClass265Array7;
		arg3.aClass205Array1 = this.aClass205Array1;
		arg3.anIntArray704 = this.anIntArray704;
		arg3.anIntArrayArray88 = this.anIntArrayArray88;
		arg3.anIntArrayArray89 = this.anIntArrayArray89;
		return arg3;
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "()V")
	@Override
	public void method8004() {
		if (this.anInt9702 <= 0 || this.anInt9719 <= 0) {
			return;
		}
		this.method8011(false);
		if ((this.aByte110 & 0x10) == 0 && this.aClass121_1.anInterface2_2 == null) {
			this.method8018(false);
		}
		this.method8012();
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class26 method7992(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(19) Class26_Sub3 local19;
		@Pc(15) Class26_Sub3 local15;
		if (arg0 == 1) {
			local19 = this.aClass42_Sub3_43.aClass26_Sub3_3;
			local15 = this.aClass42_Sub3_43.aClass26_Sub3_2;
		} else if (arg0 == 2) {
			local15 = this.aClass42_Sub3_43.aClass26_Sub3_1;
			local19 = this.aClass42_Sub3_43.aClass26_Sub3_8;
		} else if (arg0 == 3) {
			local15 = this.aClass42_Sub3_43.aClass26_Sub3_9;
			local19 = this.aClass42_Sub3_43.aClass26_Sub3_5;
		} else if (arg0 == 4) {
			local15 = this.aClass42_Sub3_43.aClass26_Sub3_6;
			local19 = this.aClass42_Sub3_43.aClass26_Sub3_7;
		} else if (arg0 == 5) {
			local19 = this.aClass42_Sub3_43.aClass26_Sub3_10;
			local15 = this.aClass42_Sub3_43.aClass26_Sub3_4;
		} else {
			local19 = local15 = new Class26_Sub3(this.aClass42_Sub3_43);
		}
		return this.method8016(arg2, local15, arg1, local19, arg0 != 0);
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)V")
	@Override
	public void b(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub1_Sub36.anIntArray667[arg0];
		@Pc(13) int local13 = Class12_Sub1_Sub36.anIntArray668[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9675; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray707[local15] + this.anIntArray703[local15] * local9 >> 15;
			this.anIntArray703[local15] = local13 * this.anIntArray703[local15] - local9 * this.anIntArray707[local15] >> 15;
			this.anIntArray707[local15] = local33;
		}
		this.aBoolean686 = false;
		if (this.aClass65_15 != null) {
			this.aClass65_15.anInterface14_1 = null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!m;Lclient!kn;I)V")
	@Override
	public void method8003(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class7_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9702 == 0) {
			return;
		}
		@Pc(16) Class91_Sub1 local16 = this.aClass42_Sub3_43.aClass91_Sub1_4;
		if (!this.aBoolean686) {
			this.method8015();
		}
		@Pc(25) Class91_Sub1 local25 = (Class91_Sub1) arg0;
		this.method8017(local25);
		Static500.aFloat187 = local16.aFloat67 * local25.aFloat68 + local16.aFloat71 * local25.aFloat69 + local16.aFloat70 * local25.aFloat61 + local16.aFloat68;
		Static526.aFloat192 = local16.aFloat67 * local25.aFloat71 + local25.aFloat62 * local16.aFloat71 + local25.aFloat65 * local16.aFloat70;
		@Pc(76) float local76 = Static500.aFloat187 + Static526.aFloat192 * (float) this.aShort125;
		@Pc(84) float local84 = (float) this.aShort120 * Static526.aFloat192 + Static500.aFloat187;
		@Pc(101) float local101;
		@Pc(94) float local94;
		if (local84 < local76) {
			local94 = (float) this.aShort121 + local76;
			local101 = local84 - (float) this.aShort121;
		} else {
			local94 = local84 + (float) this.aShort121;
			local101 = (float) -this.aShort121 + local76;
		}
		if (local101 >= this.aClass42_Sub3_43.aFloat98 || (float) this.aClass42_Sub3_43.anInt3715 >= local94) {
			return;
		}
		Static72.aFloat51 = local16.aFloat61 + local16.aFloat64 * local25.aFloat61 + local25.aFloat69 * local16.aFloat65 + local25.aFloat68 * local16.aFloat72;
		Static337.aFloat130 = local25.aFloat65 * local16.aFloat64 + local25.aFloat62 * local16.aFloat65 + local16.aFloat72 * local25.aFloat71;
		@Pc(177) float local177 = Static337.aFloat130 * (float) this.aShort125 + Static72.aFloat51;
		@Pc(185) float local185 = Static72.aFloat51 + Static337.aFloat130 * (float) this.aShort120;
		@Pc(201) float local201;
		@Pc(212) float local212;
		if (local177 > local185) {
			local201 = ((float) -this.aShort121 + local185) * (float) this.aClass42_Sub3_43.anInt3689;
			local212 = (float) this.aClass42_Sub3_43.anInt3689 * ((float) this.aShort121 + local177);
		} else {
			local212 = ((float) this.aShort121 + local185) * (float) this.aClass42_Sub3_43.anInt3689;
			local201 = (float) this.aClass42_Sub3_43.anInt3689 * ((float) -this.aShort121 + local177);
		}
		if (this.aClass42_Sub3_43.aFloat102 <= local201 / local94 || local212 / local94 <= this.aClass42_Sub3_43.aFloat89) {
			return;
		}
		Static444.aFloat180 = local25.aFloat68 * local16.aFloat63 + local16.aFloat62 * local25.aFloat69 + local16.aFloat66 * local25.aFloat61 + local16.aFloat69;
		Static143.aFloat79 = local16.aFloat63 * local25.aFloat71 + local25.aFloat65 * local16.aFloat66 + local25.aFloat62 * local16.aFloat62;
		@Pc(302) float local302 = Static444.aFloat180 + (float) this.aShort125 * Static143.aFloat79;
		@Pc(310) float local310 = Static143.aFloat79 * (float) this.aShort120 + Static444.aFloat180;
		@Pc(326) float local326;
		@Pc(337) float local337;
		if (local302 > local310) {
			local326 = ((float) -this.aShort121 + local310) * (float) this.aClass42_Sub3_43.anInt3713;
			local337 = (local302 + (float) this.aShort121) * (float) this.aClass42_Sub3_43.anInt3713;
		} else {
			local326 = (float) this.aClass42_Sub3_43.anInt3713 * (local302 - (float) this.aShort121);
			local337 = (float) this.aClass42_Sub3_43.anInt3713 * (local310 + (float) this.aShort121);
		}
		if (local326 / local94 >= this.aClass42_Sub3_43.aFloat105 || local337 / local94 <= this.aClass42_Sub3_43.aFloat91) {
			return;
		}
		if (arg1 != null || this.aClass205Array1 != null) {
			Static522.aFloat190 = local25.aFloat70 * local16.aFloat63 + local25.aFloat64 * local16.aFloat66 + local25.aFloat66 * local16.aFloat62;
			Static273.aFloat116 = local16.aFloat67 * local25.aFloat70 + local25.aFloat64 * local16.aFloat70 + local16.aFloat71 * local25.aFloat66;
			Static58.aFloat49 = local16.aFloat62 * local25.aFloat63 + local25.aFloat72 * local16.aFloat66 + local16.aFloat63 * local25.aFloat67;
			Static400.aFloat175 = local25.aFloat63 * local16.aFloat65 + local25.aFloat72 * local16.aFloat64 + local25.aFloat67 * local16.aFloat72;
			Static380.aFloat176 = local16.aFloat71 * local25.aFloat63 + local16.aFloat70 * local25.aFloat72 + local16.aFloat67 * local25.aFloat67;
			Static66.aFloat50 = local16.aFloat72 * local25.aFloat70 + local25.aFloat64 * local16.aFloat64 + local16.aFloat65 * local25.aFloat66;
		}
		if (arg1 != null) {
			@Pc(496) boolean local496 = false;
			@Pc(498) boolean local498 = true;
			@Pc(506) int local506 = this.aShort123 + this.aShort118 >> 1;
			@Pc(514) int local514 = this.aShort122 + this.aShort119 >> 1;
			@Pc(533) int local533 = (int) (Static400.aFloat175 * (float) local514 + (float) this.aShort125 * Static337.aFloat130 + Static72.aFloat51 + (float) local506 * Static66.aFloat50);
			@Pc(552) int local552 = (int) (Static58.aFloat49 * (float) local514 + Static444.aFloat180 + Static522.aFloat190 * (float) local506 + (float) this.aShort125 * Static143.aFloat79);
			@Pc(571) int local571 = (int) (Static526.aFloat192 * (float) this.aShort125 + Static500.aFloat187 + Static273.aFloat116 * (float) local506 + Static380.aFloat176 * (float) local514);
			if (local571 < this.aClass42_Sub3_43.anInt3715) {
				local496 = true;
			} else {
				arg1.anInt5261 = this.aClass42_Sub3_43.anInt3689 * local533 / local571 + this.aClass42_Sub3_43.anInt3706;
				arg1.anInt5260 = this.aClass42_Sub3_43.anInt3713 * local552 / local571 + this.aClass42_Sub3_43.anInt3681;
			}
			@Pc(629) int local629 = (int) (Static400.aFloat175 * (float) local514 + (float) this.aShort120 * Static337.aFloat130 + Static72.aFloat51 + Static66.aFloat50 * (float) local506);
			@Pc(648) int local648 = (int) ((float) local514 * Static58.aFloat49 + (float) local506 * Static522.aFloat190 + Static444.aFloat180 + Static143.aFloat79 * (float) this.aShort120);
			@Pc(667) int local667 = (int) (Static380.aFloat176 * (float) local514 + Static500.aFloat187 + Static273.aFloat116 * (float) local506 + (float) this.aShort120 * Static526.aFloat192);
			if (local667 < this.aClass42_Sub3_43.anInt3715) {
				local496 = true;
			} else {
				arg1.anInt5259 = this.aClass42_Sub3_43.anInt3681 + this.aClass42_Sub3_43.anInt3713 * local648 / local667;
				arg1.anInt5262 = this.aClass42_Sub3_43.anInt3706 + this.aClass42_Sub3_43.anInt3689 * local629 / local667;
			}
			if (local496) {
				if (this.aClass42_Sub3_43.anInt3715 > local571 && local667 < this.aClass42_Sub3_43.anInt3715) {
					local498 = false;
				} else {
					@Pc(754) int local754;
					@Pc(765) int local765;
					@Pc(791) int local791;
					if (this.aClass42_Sub3_43.anInt3715 > local571) {
						local754 = (local667 - this.aClass42_Sub3_43.anInt3715 << 16) / (local667 - local571);
						local765 = (local754 * (local629 - local533) >> 16) + local629;
						local791 = (local754 * (local648 - local552) >> 16) + local648;
						arg1.anInt5261 = this.aClass42_Sub3_43.anInt3689 * local765 / this.aClass42_Sub3_43.anInt3715 + this.aClass42_Sub3_43.anInt3706;
						arg1.anInt5260 = this.aClass42_Sub3_43.anInt3681 + local791 * this.aClass42_Sub3_43.anInt3713 / this.aClass42_Sub3_43.anInt3715;
					} else if (this.aClass42_Sub3_43.anInt3715 > local667) {
						local754 = (local571 - this.aClass42_Sub3_43.anInt3715 << 16) / (local571 - local667);
						local765 = (local754 * (local533 - local629) >> 16) + local533;
						arg1.anInt5261 = local765 * this.aClass42_Sub3_43.anInt3689 / this.aClass42_Sub3_43.anInt3715 + this.aClass42_Sub3_43.anInt3706;
						local791 = (local754 * (local552 - local648) >> 16) + local552;
						arg1.anInt5260 = local791 * this.aClass42_Sub3_43.anInt3713 / this.aClass42_Sub3_43.anInt3715 + this.aClass42_Sub3_43.anInt3681;
					}
				}
			}
			if (local498) {
				if (local571 <= local667) {
					arg1.anInt5258 = this.aClass42_Sub3_43.anInt3689 * (local629 + this.aShort121) / local667 + this.aClass42_Sub3_43.anInt3706 - arg1.anInt5262;
				} else {
					arg1.anInt5258 = (this.aShort121 + local533) * this.aClass42_Sub3_43.anInt3689 / local571 + this.aClass42_Sub3_43.anInt3706 - arg1.anInt5261;
				}
				arg1.aBoolean404 = true;
			}
		}
		this.aClass42_Sub3_43.method3190();
		this.aClass42_Sub3_43.method3246(local25);
		this.method8019();
		this.aClass42_Sub3_43.method3195();
		this.method8020();
	}

	@OriginalMember(owner = "client!ww", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		if (!this.aBoolean686) {
			this.method8015();
		}
		return this.aShort118;
	}

	@OriginalMember(owner = "client!ww", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		if (!this.aBoolean686) {
			this.method8015();
		}
		return this.aShort125;
	}

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "()I")
	@Override
	public int e() {
		if (!this.aBoolean686) {
			this.method8015();
		}
		return this.aShort121;
	}

	@OriginalMember(owner = "client!ww", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	@Override
	public Class12_Sub4_Sub10 EA(@OriginalArg(0) Class12_Sub4_Sub10 arg0) {
		if (this.anInt9702 == 0) {
			return null;
		}
		if (!this.aBoolean686) {
			this.method8015();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass42_Sub3_43.anInt3693 > 0) {
			local37 = this.aShort118 - (this.aShort120 * this.aClass42_Sub3_43.anInt3693 >> 8) >> this.aClass42_Sub3_43.anInt3672;
			local54 = this.aShort123 - (this.aShort125 * this.aClass42_Sub3_43.anInt3693 >> 8) >> this.aClass42_Sub3_43.anInt3672;
		} else {
			local37 = this.aShort118 - (this.aClass42_Sub3_43.anInt3693 * this.aShort125 >> 8) >> this.aClass42_Sub3_43.anInt3672;
			local54 = this.aShort123 - (this.aShort120 * this.aClass42_Sub3_43.anInt3693 >> 8) >> this.aClass42_Sub3_43.anInt3672;
		}
		@Pc(111) int local111;
		@Pc(128) int local128;
		if (this.aClass42_Sub3_43.anInt3683 <= 0) {
			local111 = this.aShort119 - (this.aShort125 * this.aClass42_Sub3_43.anInt3683 >> 8) >> this.aClass42_Sub3_43.anInt3672;
			local128 = this.aShort122 - (this.aShort120 * this.aClass42_Sub3_43.anInt3683 >> 8) >> this.aClass42_Sub3_43.anInt3672;
		} else {
			local111 = this.aShort119 - (this.aClass42_Sub3_43.anInt3683 * this.aShort120 >> 8) >> this.aClass42_Sub3_43.anInt3672;
			local128 = this.aShort122 - (this.aShort125 * this.aClass42_Sub3_43.anInt3683 >> 8) >> this.aClass42_Sub3_43.anInt3672;
		}
		@Pc(169) int local169 = local54 + 1 - local37;
		@Pc(176) int local176 = local128 + 1 - local111;
		@Pc(179) Class12_Sub4_Sub10_Sub2 local179 = (Class12_Sub4_Sub10_Sub2) arg0;
		@Pc(195) Class12_Sub4_Sub10_Sub2 local195;
		if (local179 != null && local179.method7617(local176, local169)) {
			local195 = local179;
			local179.method7614();
		} else {
			local195 = new Class12_Sub4_Sub10_Sub2(this.aClass42_Sub3_43, local169, local176);
		}
		local195.method7613(local111, local37, local54, local128);
		this.method8013(local195);
		return local195;
	}

	@OriginalMember(owner = "client!ww", name = "pa", descriptor = "(SS)V")
	@Override
	public void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9706; local3++) {
			if (arg0 == this.aShortArray150[local3]) {
				this.aShortArray150[local3] = arg1;
			}
		}
		if (this.aClass205Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt9707; local30++) {
				@Pc(37) Class205 local37 = this.aClass205Array1[local30];
				@Pc(42) Class74 local42 = this.aClass74Array1[local30];
				local42.anInt2285 = local42.anInt2285 & 0xFF000000 | Static141.anIntArray234[this.aShortArray150[local37.anInt5980] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass65_14 != null) {
			this.aClass65_14.anInterface14_1 = null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!m;Lclient!kn;II)V")
	@Override
	public void method7994(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class7_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9702 == 0) {
			return;
		}
		@Pc(16) Class91_Sub1 local16 = this.aClass42_Sub3_43.aClass91_Sub1_4;
		@Pc(19) Class91_Sub1 local19 = (Class91_Sub1) arg0;
		if (!this.aBoolean686) {
			this.method8015();
		}
		Static500.aFloat187 = local16.aFloat68 + local19.aFloat68 * local16.aFloat67 + local16.aFloat71 * local19.aFloat69 + local19.aFloat61 * local16.aFloat70;
		Static526.aFloat192 = local16.aFloat70 * local19.aFloat65 + local16.aFloat71 * local19.aFloat62 + local19.aFloat71 * local16.aFloat67;
		@Pc(72) float local72 = Static500.aFloat187 + Static526.aFloat192 * (float) this.aShort125;
		@Pc(80) float local80 = (float) this.aShort120 * Static526.aFloat192 + Static500.aFloat187;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local97 = local80 - (float) this.aShort121;
			local90 = local72 + (float) this.aShort121;
		} else {
			local90 = local80 + (float) this.aShort121;
			local97 = (float) -this.aShort121 + local72;
		}
		if (local97 >= this.aClass42_Sub3_43.aFloat86 || local90 <= (float) this.aClass42_Sub3_43.anInt3715) {
			return;
		}
		Static337.aFloat130 = local16.aFloat64 * local19.aFloat65 + local16.aFloat65 * local19.aFloat62 + local19.aFloat71 * local16.aFloat72;
		Static72.aFloat51 = local16.aFloat61 + local19.aFloat69 * local16.aFloat65 + local19.aFloat61 * local16.aFloat64 + local19.aFloat68 * local16.aFloat72;
		@Pc(173) float local173 = (float) this.aShort125 * Static337.aFloat130 + Static72.aFloat51;
		@Pc(181) float local181 = Static72.aFloat51 + Static337.aFloat130 * (float) this.aShort120;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local181 < local173) {
			local197 = ((float) -this.aShort121 + local181) * (float) this.aClass42_Sub3_43.anInt3689;
			local208 = ((float) this.aShort121 + local173) * (float) this.aClass42_Sub3_43.anInt3689;
		} else {
			local208 = (local181 + (float) this.aShort121) * (float) this.aClass42_Sub3_43.anInt3689;
			local197 = (float) this.aClass42_Sub3_43.anInt3689 * (local173 - (float) this.aShort121);
		}
		if (this.aClass42_Sub3_43.aFloat102 <= local197 / (float) arg2 || local208 / (float) arg2 <= this.aClass42_Sub3_43.aFloat89) {
			return;
		}
		Static143.aFloat79 = local19.aFloat65 * local16.aFloat66 + local16.aFloat62 * local19.aFloat62 + local16.aFloat63 * local19.aFloat71;
		Static444.aFloat180 = local19.aFloat68 * local16.aFloat63 + local19.aFloat69 * local16.aFloat62 + local19.aFloat61 * local16.aFloat66 + local16.aFloat69;
		@Pc(299) float local299 = Static444.aFloat180 + (float) this.aShort125 * Static143.aFloat79;
		@Pc(307) float local307 = (float) this.aShort120 * Static143.aFloat79 + Static444.aFloat180;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local307 < local299) {
			local323 = (float) this.aClass42_Sub3_43.anInt3713 * ((float) -this.aShort121 + local307);
			local334 = (local299 + (float) this.aShort121) * (float) this.aClass42_Sub3_43.anInt3713;
		} else {
			local323 = (float) this.aClass42_Sub3_43.anInt3713 * ((float) -this.aShort121 + local299);
			local334 = ((float) this.aShort121 + local307) * (float) this.aClass42_Sub3_43.anInt3713;
		}
		if (local323 / (float) arg2 >= this.aClass42_Sub3_43.aFloat105 || this.aClass42_Sub3_43.aFloat91 >= local334 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass205Array1 != null) {
			Static400.aFloat175 = local16.aFloat65 * local19.aFloat63 + local16.aFloat64 * local19.aFloat72 + local19.aFloat67 * local16.aFloat72;
			Static273.aFloat116 = local19.aFloat66 * local16.aFloat71 + local19.aFloat64 * local16.aFloat70 + local19.aFloat70 * local16.aFloat67;
			Static380.aFloat176 = local19.aFloat63 * local16.aFloat71 + local19.aFloat72 * local16.aFloat70 + local16.aFloat67 * local19.aFloat67;
			Static522.aFloat190 = local16.aFloat63 * local19.aFloat70 + local16.aFloat66 * local19.aFloat64 + local19.aFloat66 * local16.aFloat62;
			Static66.aFloat50 = local16.aFloat64 * local19.aFloat64 + local19.aFloat66 * local16.aFloat65 + local19.aFloat70 * local16.aFloat72;
			Static58.aFloat49 = local16.aFloat66 * local19.aFloat72 + local16.aFloat62 * local19.aFloat63 + local19.aFloat67 * local16.aFloat63;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.aShort123 + this.aShort118 >> 1;
			@Pc(510) int local510 = this.aShort119 + this.aShort122 >> 1;
			@Pc(529) int local529 = (int) (Static337.aFloat130 * (float) this.aShort125 + Static72.aFloat51 + Static66.aFloat50 * (float) local502 + Static400.aFloat175 * (float) local510);
			@Pc(548) int local548 = (int) (Static522.aFloat190 * (float) local502 + Static444.aFloat180 + Static143.aFloat79 * (float) this.aShort125 + (float) local510 * Static58.aFloat49);
			@Pc(567) int local567 = (int) (Static380.aFloat176 * (float) local510 + Static273.aFloat116 * (float) local502 + Static500.aFloat187 + Static526.aFloat192 * (float) this.aShort125);
			@Pc(586) int local586 = (int) (Static400.aFloat175 * (float) local510 + Static72.aFloat51 + Static66.aFloat50 * (float) local502 + (float) this.aShort120 * Static337.aFloat130);
			@Pc(605) int local605 = (int) (Static143.aFloat79 * (float) this.aShort120 + Static444.aFloat180 + (float) local502 * Static522.aFloat190 + Static58.aFloat49 * (float) local510);
			arg1.anInt5261 = this.aClass42_Sub3_43.anInt3706 + this.aClass42_Sub3_43.anInt3689 * local529 / arg2;
			arg1.anInt5260 = this.aClass42_Sub3_43.anInt3681 + local548 * this.aClass42_Sub3_43.anInt3713 / arg2;
			arg1.anInt5262 = local586 * this.aClass42_Sub3_43.anInt3689 / arg2 + this.aClass42_Sub3_43.anInt3706;
			arg1.anInt5259 = local605 * this.aClass42_Sub3_43.anInt3713 / arg2 + this.aClass42_Sub3_43.anInt3681;
			@Pc(677) int local677 = (int) (Static380.aFloat176 * (float) local510 + Static273.aFloat116 * (float) local502 + Static500.aFloat187 + (float) this.aShort120 * Static526.aFloat192);
			if (local567 < this.aClass42_Sub3_43.anInt3715 && this.aClass42_Sub3_43.anInt3715 > local677) {
				arg1.aBoolean404 = true;
				arg1.anInt5258 = this.aClass42_Sub3_43.anInt3689 * (this.aShort121 + local529) / arg2 + this.aClass42_Sub3_43.anInt3706 - arg1.anInt5261;
			}
		}
		this.aClass42_Sub3_43.method3226((float) arg2);
		this.aClass42_Sub3_43.method3208();
		this.aClass42_Sub3_43.method3246(local19);
		this.method8019();
		this.aClass42_Sub3_43.method3195();
		this.method8020();
	}

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "()[Lclient!ig;")
	@Override
	public Class142[] method8006() {
		return this.aClass142Array7;
	}

	@OriginalMember(owner = "client!ww", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub1_Sub36.anIntArray667[arg0];
		@Pc(13) int local13 = Class12_Sub1_Sub36.anIntArray668[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9675; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray703[local15] - local9 * this.anIntArray705[local15] >> 15;
			this.anIntArray705[local15] = local13 * this.anIntArray705[local15] + local9 * this.anIntArray703[local15] >> 15;
			this.anIntArray703[local15] = local34;
		}
		if (this.aClass65_15 != null) {
			this.aClass65_15.anInterface14_1 = null;
		}
		this.aBoolean686 = false;
	}

	@OriginalMember(owner = "client!ww", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub1_Sub36.anIntArray667[arg0];
		@Pc(13) int local13 = Class12_Sub1_Sub36.anIntArray668[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt9675; local15++) {
			local34 = local9 * this.anIntArray705[local15] + this.anIntArray707[local15] * local13 >> 15;
			this.anIntArray705[local15] = this.anIntArray705[local15] * local13 - local9 * this.anIntArray707[local15] >> 15;
			this.anIntArray707[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt9702; local34++) {
			@Pc(87) int local87 = local9 * this.aShortArray145[local34] + this.aShortArray147[local34] * local13 >> 15;
			this.aShortArray145[local34] = (short) (this.aShortArray145[local34] * local13 - this.aShortArray147[local34] * local9 >> 15);
			this.aShortArray147[local34] = (short) local87;
		}
		if (this.aClass65_13 == null && this.aClass65_14 != null) {
			this.aClass65_14.anInterface14_1 = null;
		}
		if (this.aClass65_13 != null) {
			this.aClass65_13.anInterface14_1 = null;
		}
		if (this.aClass65_15 != null) {
			this.aClass65_15.anInterface14_1 = null;
		}
		this.aBoolean686 = false;
	}

	@OriginalMember(owner = "client!ww", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	@Override
	public void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class215 arg2, @OriginalArg(3) Class215 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean686) {
			this.method8015();
		}
		@Pc(16) int local16 = this.aShort118 + arg4;
		@Pc(21) int local21 = this.aShort123 + arg4;
		@Pc(26) int local26 = arg6 + this.aShort119;
		@Pc(31) int local31 = arg6 + this.aShort122;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt9451 >> arg2.anInt9453 >= arg2.anInt9452 || local26 < 0 || local31 + arg2.anInt9451 >> arg2.anInt9453 >= arg2.anInt9450)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9452 <= arg3.anInt9451 + local21 >> arg3.anInt9453 || local26 < 0 || arg3.anInt9451 + local31 >> arg3.anInt9453 >= arg3.anInt9450) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9453;
			local21 = arg2.anInt9451 + local21 - 1 >> arg2.anInt9453;
			local26 >>= arg2.anInt9453;
			local31 = arg2.anInt9451 + local31 - 1 >> arg2.anInt9453;
			if (arg2.ba(local16, local26) == arg5 && arg5 == arg2.ba(local21, local26) && arg5 == arg2.ba(local16, local31) && arg2.ba(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(193) int local193;
		if (arg0 == 1) {
			for (local193 = 0; local193 < this.anInt9675; local193++) {
				this.anIntArray703[local193] = this.anIntArray703[local193] + arg2.aa(arg4 + this.anIntArray707[local193], arg6 + this.anIntArray705[local193]) - arg5;
			}
		} else {
			@Pc(243) int local243;
			@Pc(254) int local254;
			if (arg0 == 2) {
				@Pc(235) short local235 = this.aShort125;
				if (local235 == 0) {
					return;
				}
				for (local243 = 0; local243 < this.anInt9675; local243++) {
					local254 = (this.anIntArray703[local243] << 16) / local235;
					if (arg1 > local254) {
						this.anIntArray703[local243] += (arg1 - local254) * (arg2.aa(this.anIntArray707[local243] - -arg4, this.anIntArray705[local243] - -arg6) - arg5) / arg1;
					}
				}
			} else {
				@Pc(393) int local393;
				if (arg0 == 3) {
					local193 = (arg1 & 0xFF) * 4;
					local243 = (arg1 >> 8 & 0xFF) * 4;
					local254 = (arg1 >> 16 & 0xFF) << 6;
					local393 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local193 >> 1) < 0 || arg2.anInt9451 + (local193 >> 1) + arg4 >= arg2.anInt9452 << arg2.anInt9453 || arg6 - (local243 >> 1) < 0 || arg2.anInt9451 + arg6 + (local243 >> 1) >= arg2.anInt9450 << arg2.anInt9453) {
						return;
					}
					this.method7993(arg5, arg2, local254, arg4, local243, arg6, local393, local193);
				} else if (arg0 == 4) {
					local193 = this.aShort120 - this.aShort125;
					for (local243 = 0; local243 < this.anInt9675; local243++) {
						this.anIntArray703[local243] = local193 + this.anIntArray703[local243] + arg3.aa(this.anIntArray707[local243] - -arg4, this.anIntArray705[local243] + arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local193 = this.aShort120 - this.aShort125;
					for (local243 = 0; local243 < this.anInt9675; local243++) {
						local254 = arg4 + this.anIntArray707[local243];
						local393 = this.anIntArray705[local243] + arg6;
						@Pc(398) int local398 = arg2.aa(local254, local393);
						@Pc(403) int local403 = arg3.aa(local254, local393);
						@Pc(411) int local411 = local398 - local403 - arg1;
						this.anIntArray703[local243] = local398 + ((this.anIntArray703[local243] << 8) / local193 * local411 >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass65_15 != null) {
			this.aClass65_15.anInterface14_1 = null;
		}
		this.aBoolean686 = false;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BLclient!en;)V")
	private void method8017(@OriginalArg(1) Class91_Sub1 arg0) {
		@Pc(12) int local12;
		if (this.aClass142Array7 != null) {
			for (local12 = 0; local12 < this.aClass142Array7.length; local12++) {
				@Pc(19) Class142 local19 = this.aClass142Array7[local12];
				@Pc(21) Class142 local21 = local19;
				if (local19.aClass142_1 != null) {
					local21 = local19.aClass142_1;
				}
				local21.anInt4543 = (int) (arg0.aFloat61 + arg0.aFloat64 * (float) this.anIntArray707[local19.anInt4538] + (float) this.anIntArray703[local19.anInt4538] * arg0.aFloat65 + (float) this.anIntArray705[local19.anInt4538] * arg0.aFloat72);
				local21.anInt4545 = (int) ((float) this.anIntArray705[local19.anInt4538] * arg0.aFloat63 + (float) this.anIntArray707[local19.anInt4538] * arg0.aFloat66 + arg0.aFloat62 * (float) this.anIntArray703[local19.anInt4538] + arg0.aFloat69);
				local21.anInt4551 = (int) (arg0.aFloat71 * (float) this.anIntArray703[local19.anInt4538] + (float) this.anIntArray707[local19.anInt4538] * arg0.aFloat70 + (float) this.anIntArray705[local19.anInt4538] * arg0.aFloat67 + arg0.aFloat68);
				local21.anInt4547 = (int) ((float) this.anIntArray703[local19.anInt4540] * arg0.aFloat65 + (float) this.anIntArray707[local19.anInt4540] * arg0.aFloat64 + arg0.aFloat72 * (float) this.anIntArray705[local19.anInt4540] + arg0.aFloat61);
				local21.anInt4541 = (int) ((float) this.anIntArray705[local19.anInt4540] * arg0.aFloat63 + arg0.aFloat62 * (float) this.anIntArray703[local19.anInt4540] + arg0.aFloat66 * (float) this.anIntArray707[local19.anInt4540] + arg0.aFloat69);
				local21.anInt4550 = (int) (arg0.aFloat68 + (float) this.anIntArray705[local19.anInt4540] * arg0.aFloat67 + arg0.aFloat70 * (float) this.anIntArray707[local19.anInt4540] + (float) this.anIntArray703[local19.anInt4540] * arg0.aFloat71);
				local21.anInt4535 = (int) ((float) this.anIntArray705[local19.anInt4542] * arg0.aFloat72 + arg0.aFloat64 * (float) this.anIntArray707[local19.anInt4542] + (float) this.anIntArray703[local19.anInt4542] * arg0.aFloat65 + arg0.aFloat61);
				local21.anInt4548 = (int) (arg0.aFloat69 + arg0.aFloat63 * (float) this.anIntArray705[local19.anInt4542] + arg0.aFloat62 * (float) this.anIntArray703[local19.anInt4542] + arg0.aFloat66 * (float) this.anIntArray707[local19.anInt4542]);
				local21.anInt4546 = (int) (arg0.aFloat68 + arg0.aFloat71 * (float) this.anIntArray703[local19.anInt4542] + (float) this.anIntArray707[local19.anInt4542] * arg0.aFloat70 + arg0.aFloat67 * (float) this.anIntArray705[local19.anInt4542]);
			}
		}
		if (this.aClass265Array7 == null) {
			return;
		}
		for (local12 = 0; local12 < this.aClass265Array7.length; local12++) {
			@Pc(364) Class265 local364 = this.aClass265Array7[local12];
			@Pc(366) Class265 local366 = local364;
			if (local364.aClass265_1 != null) {
				local366 = local364.aClass265_1;
			}
			if (local364.aClass91_6 == null) {
				local364.aClass91_6 = arg0.method7050();
			} else {
				local364.aClass91_6.EA(arg0);
			}
			local366.anInt7974 = (int) (arg0.aFloat61 + (float) this.anIntArray705[local364.anInt7977] * arg0.aFloat72 + arg0.aFloat64 * (float) this.anIntArray707[local364.anInt7977] + (float) this.anIntArray703[local364.anInt7977] * arg0.aFloat65);
			local366.anInt7975 = (int) (arg0.aFloat69 + (float) this.anIntArray705[local364.anInt7977] * arg0.aFloat63 + arg0.aFloat66 * (float) this.anIntArray707[local364.anInt7977] + (float) this.anIntArray703[local364.anInt7977] * arg0.aFloat62);
			local366.anInt7972 = (int) (arg0.aFloat68 + arg0.aFloat71 * (float) this.anIntArray703[local364.anInt7977] + (float) this.anIntArray707[local364.anInt7977] * arg0.aFloat70 + (float) this.anIntArray705[local364.anInt7977] * arg0.aFloat67);
		}
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(ZI)V")
	private void method8018(@OriginalArg(0) boolean arg0) {
		if (this.aClass42_Sub3_43.aClass12_Sub8_Sub1_1.aByteArray82.length >= this.anInt9719 * 6) {
			this.aClass42_Sub3_43.aClass12_Sub8_Sub1_1.anInt6217 = 0;
		} else {
			this.aClass42_Sub3_43.aClass12_Sub8_Sub1_1 = new Class12_Sub8_Sub1(this.anInt9719 * 6 + 600);
		}
		@Pc(38) Class12_Sub8_Sub1 local38 = this.aClass42_Sub3_43.aClass12_Sub8_Sub1_1;
		@Pc(48) int local48;
		if (this.aClass42_Sub3_43.aBoolean292) {
			for (local48 = 0; local48 < this.anInt9719; local48++) {
				local38.method5190(this.aShortArray142[local48]);
				local38.method5190(this.aShortArray148[local48]);
				local38.method5190(this.aShortArray146[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt9719; local48++) {
				local38.method5201(this.aShortArray142[local48]);
				local38.method5201(this.aShortArray148[local48]);
				local38.method5201(this.aShortArray146[local48]);
			}
		}
		if (local38.anInt6217 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface2_5 == null) {
				this.anInterface2_5 = this.aClass42_Sub3_43.method3252(local38.anInt6217, true, local38.aByteArray82);
			} else {
				this.anInterface2_5.method7247(local38.aByteArray82, local38.anInt6217);
			}
			this.aClass121_1.anInterface2_2 = this.anInterface2_5;
		} else {
			this.aClass121_1.anInterface2_2 = this.aClass42_Sub3_43.method3252(local38.anInt6217, false, local38.aByteArray82);
		}
		if (!arg0) {
			this.aBoolean687 = true;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt9706; local7++) {
			local16 = this.aShortArray150[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			@Pc(45) int local45 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg2 != -1) {
				local45 -= -(arg3 * (arg2 - local45) >> 7);
			}
			this.aShortArray150[local7] = (short) (local28 << 7 | local22 << 10 | local45);
		}
		if (this.aClass205Array1 != null) {
			for (local16 = 0; local16 < this.anInt9707; local16++) {
				@Pc(105) Class205 local105 = this.aClass205Array1[local16];
				@Pc(110) Class74 local110 = this.aClass74Array1[local16];
				local110.anInt2285 = Static141.anIntArray234[this.aShortArray150[local105.anInt5980] & 0xFFFF] & 0xFFFFFF | local110.anInt2285 & 0xFF000000;
			}
		}
		if (this.aClass65_14 != null) {
			this.aClass65_14.anInterface14_1 = null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "MA", descriptor = "()V")
	@Override
	protected void MA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9698; local3++) {
			this.anIntArray707[local3] = this.anIntArray707[local3] + 7 >> 4;
			this.anIntArray703[local3] = this.anIntArray703[local3] + 7 >> 4;
			this.anIntArray705[local3] = this.anIntArray705[local3] + 7 >> 4;
		}
		if (this.aClass65_15 != null) {
			this.aClass65_15.anInterface14_1 = null;
		}
		this.aBoolean686 = false;
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "()[Lclient!rn;")
	@Override
	public Class265[] method7999() {
		return this.aClass265Array7;
	}

	@OriginalMember(owner = "client!ww", name = "sa", descriptor = "()Z")
	@Override
	protected boolean sa() {
		if (this.anIntArrayArray88 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt9698; local12++) {
			this.anIntArray707[local12] <<= 0x4;
			this.anIntArray703[local12] <<= 0x4;
			this.anIntArray705[local12] <<= 0x4;
		}
		Static211.anInt4657 = 0;
		Static520.anInt9345 = 0;
		Static375.anInt6907 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "()Z")
	@Override
	public boolean method7997() {
		if (this.aShortArray141 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray141.length; local12++) {
			if (this.aShortArray141[local12] != -1 && !this.aClass42_Sub3_43.anInterface11_11.method6213(this.aShortArray141[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ww", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.lb;
	}

	@OriginalMember(owner = "client!ww", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		this.lb = (short) arg0;
		if (this.aClass65_14 != null) {
			this.aClass65_14.anInterface14_1 = null;
		}
		if (this.aClass65_13 != null) {
			this.aClass65_13.anInterface14_1 = null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9675; local3++) {
			if (arg0 != 128) {
				this.anIntArray707[local3] = arg0 * this.anIntArray707[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray703[local3] = this.anIntArray703[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray705[local3] = arg2 * this.anIntArray705[local3] >> 7;
			}
		}
		this.aBoolean686 = false;
		if (this.aClass65_15 != null) {
			this.aClass65_15.anInterface14_1 = null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "BA", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static520.anInt9345 = 0;
			Static375.anInt6907 = 0;
			local28 = 0;
			Static211.anInt4657 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray88.length) {
					local48 = this.anIntArrayArray88[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray144 == null || (this.aShortArray144[local56] & arg6) != 0) {
							Static520.anInt9345 += this.anIntArray707[local56];
							Static211.anInt4657 += this.anIntArray703[local56];
							Static375.anInt6907 += this.anIntArray705[local56];
							local28++;
						}
					}
				}
			}
			if (local28 <= 0) {
				Static375.anInt6907 = arg4;
				Static211.anInt4657 = arg3;
				Static520.anInt9345 = arg2;
			} else {
				Static375.anInt6907 = Static375.anInt6907 / local28 + arg4;
				Static119.aBoolean222 = true;
				Static211.anInt4657 = Static211.anInt4657 / local28 + arg3;
				Static520.anInt9345 = Static520.anInt9345 / local28 + arg2;
			}
			return;
		}
		@Pc(240) int[] local240;
		@Pc(242) int local242;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg4 * arg7[2] + arg7[1] * arg3 + arg2 * arg7[0] + 16384 >> 15;
				local32 = arg4 * arg7[5] + arg3 * arg7[4] + arg2 * arg7[3] + 16384 >> 15;
				local38 = arg3 * arg7[7] + arg7[6] * arg2 + arg7[8] * arg4 + 16384 >> 15;
				arg3 = local32;
				arg2 = local28;
				arg4 = local38;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray88.length) {
					local240 = this.anIntArrayArray88[local32];
					for (local242 = 0; local242 < local240.length; local242++) {
						local50 = local240[local242];
						if (this.aShortArray144 == null || (arg6 & this.aShortArray144[local50]) != 0) {
							this.anIntArray707[local50] += arg2;
							this.anIntArray703[local50] += arg3;
							this.anIntArray705[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(364) int local364;
		@Pc(387) int local387;
		@Pc(414) int local414;
		@Pc(445) int local445;
		@Pc(449) int local449;
		@Pc(453) int local453;
		@Pc(457) int local457;
		@Pc(465) int local465;
		@Pc(473) int local473;
		@Pc(629) int local629;
		@Pc(654) int local654;
		@Pc(658) int local658;
		@Pc(667) int local667;
		@Pc(672) int local672;
		@Pc(676) int local676;
		@Pc(680) int local680;
		@Pc(682) int local682;
		@Pc(808) int[] local808;
		@Pc(810) int local810;
		@Pc(814) int local814;
		@Pc(818) int local818;
		@Pc(820) int local820;
		@Pc(946) int local946;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray88.length) {
						local240 = this.anIntArrayArray88[local32];
						for (local242 = 0; local242 < local240.length; local242++) {
							local50 = local240[local242];
							if (this.aShortArray144 == null || (arg6 & this.aShortArray144[local50]) != 0) {
								this.anIntArray707[local50] -= Static520.anInt9345;
								this.anIntArray703[local50] -= Static211.anInt4657;
								this.anIntArray705[local50] -= Static375.anInt6907;
								if (arg4 != 0) {
									local56 = Class12_Sub1_Sub36.anIntArray667[arg4];
									local364 = Class12_Sub1_Sub36.anIntArray668[arg4];
									local387 = this.anIntArray707[local50] * local364 + this.anIntArray703[local50] * local56 + 32767 >> 15;
									this.anIntArray703[local50] = local364 * this.anIntArray703[local50] + 32767 - local56 * this.anIntArray707[local50] >> 15;
									this.anIntArray707[local50] = local387;
								}
								if (arg2 != 0) {
									local56 = Class12_Sub1_Sub36.anIntArray667[arg2];
									local364 = Class12_Sub1_Sub36.anIntArray668[arg2];
									local387 = this.anIntArray703[local50] * local364 + 32767 - this.anIntArray705[local50] * local56 >> 15;
									this.anIntArray705[local50] = local56 * this.anIntArray703[local50] + local364 * this.anIntArray705[local50] + 32767 >> 15;
									this.anIntArray703[local50] = local387;
								}
								if (arg3 != 0) {
									local56 = Class12_Sub1_Sub36.anIntArray667[arg3];
									local364 = Class12_Sub1_Sub36.anIntArray668[arg3];
									local387 = this.anIntArray705[local50] * local56 + this.anIntArray707[local50] * local364 + 32767 >> 15;
									this.anIntArray705[local50] = this.anIntArray705[local50] * local364 + 32767 - this.anIntArray707[local50] * local56 >> 15;
									this.anIntArray707[local50] = local387;
								}
								this.anIntArray707[local50] += Static520.anInt9345;
								this.anIntArray703[local50] += Static211.anInt4657;
								this.anIntArray705[local50] += Static375.anInt6907;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray88.length > local38) {
							local48 = this.anIntArrayArray88[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray144 == null || (arg6 & this.aShortArray144[local56]) != 0) {
									local364 = this.anIntArray704[local56];
									local387 = this.anIntArray704[local56 + 1];
									for (local414 = local364; local414 < local387; local414++) {
										local445 = this.aShortArray143[local414] - 1;
										if (local445 == -1) {
											break;
										}
										if (arg4 != 0) {
											local449 = Class12_Sub1_Sub36.anIntArray667[arg4];
											local453 = Class12_Sub1_Sub36.anIntArray668[arg4];
											local457 = local453 * this.aShortArray147[local445] + this.aShortArray151[local445] * local449 + 32767 >> 15;
											this.aShortArray151[local445] = (short) (local453 * this.aShortArray151[local445] + 32767 - this.aShortArray147[local445] * local449 >> 15);
											this.aShortArray147[local445] = (short) local457;
										}
										if (arg2 != 0) {
											local449 = Class12_Sub1_Sub36.anIntArray667[arg2];
											local453 = Class12_Sub1_Sub36.anIntArray668[arg2];
											local457 = local453 * this.aShortArray151[local445] + 32767 - this.aShortArray145[local445] * local449 >> 15;
											this.aShortArray145[local445] = (short) (this.aShortArray145[local445] * local453 + local449 * this.aShortArray151[local445] + 32767 >> 15);
											this.aShortArray151[local445] = (short) local457;
										}
										if (arg3 != 0) {
											local449 = Class12_Sub1_Sub36.anIntArray667[arg3];
											local453 = Class12_Sub1_Sub36.anIntArray668[arg3];
											local457 = local453 * this.aShortArray147[local445] + this.aShortArray145[local445] * local449 + 32767 >> 15;
											this.aShortArray145[local445] = (short) (this.aShortArray145[local445] * local453 + 32767 - this.aShortArray147[local445] * local449 >> 15);
											this.aShortArray147[local445] = (short) local457;
										}
									}
								}
							}
						}
					}
					if (this.aClass65_13 == null && this.aClass65_14 != null) {
						this.aClass65_14.anInterface14_1 = null;
					}
					if (this.aClass65_13 != null) {
						this.aClass65_13.anInterface14_1 = null;
					}
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local242 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static119.aBoolean222) {
					local364 = arg7[3] * Static211.anInt4657 + arg7[0] * Static520.anInt9345 + arg7[6] * Static375.anInt6907 + 16384 >> 15;
					local387 = arg7[4] * Static211.anInt4657 + Static520.anInt9345 * arg7[1] + Static375.anInt6907 * arg7[7] + 16384 >> 15;
					local387 += local50;
					local414 = arg7[5] * Static211.anInt4657 + arg7[2] * Static520.anInt9345 + arg7[8] * Static375.anInt6907 + 16384 >> 15;
					local364 += local242;
					Static520.anInt9345 = local364;
					Static211.anInt4657 = local387;
					local414 += local56;
					Static119.aBoolean222 = false;
					Static375.anInt6907 = local414;
				}
				@Pc(433) int[] local433 = new int[9];
				local387 = Class12_Sub1_Sub36.anIntArray668[arg2];
				local414 = Class12_Sub1_Sub36.anIntArray667[arg2];
				local445 = Class12_Sub1_Sub36.anIntArray668[arg3];
				local449 = Class12_Sub1_Sub36.anIntArray667[arg3];
				local453 = Class12_Sub1_Sub36.anIntArray668[arg4];
				local457 = Class12_Sub1_Sub36.anIntArray667[arg4];
				local465 = local414 * local453 + 16384 >> 15;
				local473 = local457 * local414 + 16384 >> 15;
				local433[6] = local453 * -local449 + local473 * local445 + 16384 >> 15;
				local433[8] = local387 * local445 + 16384 >> 15;
				local433[2] = local387 * local449 + 16384 >> 15;
				local433[3] = local457 * local387 + 16384 >> 15;
				local433[5] = -local414;
				local433[4] = local453 * local387 + 16384 >> 15;
				local433[7] = local449 * local457 + local445 * local465 + 16384 >> 15;
				local433[1] = -local445 * local457 + local465 * local449 + 16384 >> 15;
				local433[0] = local449 * local473 + local445 * local453 + 16384 >> 15;
				@Pc(604) int local604 = local433[1] * -Static211.anInt4657 + local433[0] * -Static520.anInt9345 + -Static375.anInt6907 * local433[2] + 16384 >> 15;
				local629 = local433[5] * -Static375.anInt6907 + -Static211.anInt4657 * local433[4] + local433[3] * -Static520.anInt9345 + 16384 >> 15;
				local654 = local433[6] * -Static520.anInt9345 + local433[7] * -Static211.anInt4657 + -Static375.anInt6907 * local433[8] + 16384 >> 15;
				local658 = Static520.anInt9345 + local604;
				@Pc(662) int local662 = Static211.anInt4657 + local629;
				local667 = local654 + Static375.anInt6907;
				@Pc(670) int[] local670 = new int[9];
				for (local672 = 0; local672 < 3; local672++) {
					for (local676 = 0; local676 < 3; local676++) {
						local680 = 0;
						for (local682 = 0; local682 < 3; local682++) {
							local680 += local433[local672 * 3 + local682] * arg7[local682 + local676 * 3];
						}
						local670[local676 + local672 * 3] = local680 + 16384 >> 15;
					}
				}
				local676 = local56 * local433[2] + local50 * local433[1] + local242 * local433[0] + 16384 >> 15;
				local680 = local433[3] * local242 + local50 * local433[4] + local56 * local433[5] + 16384 >> 15;
				local680 += local662;
				local682 = local56 * local433[8] + local242 * local433[6] + local50 * local433[7] + 16384 >> 15;
				local676 += local658;
				local682 += local667;
				local808 = new int[9];
				for (local810 = 0; local810 < 3; local810++) {
					for (local814 = 0; local814 < 3; local814++) {
						local818 = 0;
						for (local820 = 0; local820 < 3; local820++) {
							local818 += local670[local820 * 3 + local814] * arg7[local820 + local810 * 3];
						}
						local808[local810 * 3 + local814] = local818 + 16384 >> 15;
					}
				}
				local814 = arg7[2] * local682 + local676 * arg7[0] + local680 * arg7[1] + 16384 >> 15;
				local818 = arg7[4] * local680 + arg7[3] * local676 + local682 * arg7[5] + 16384 >> 15;
				local820 = arg7[8] * local682 + arg7[7] * local680 + local676 * arg7[6] + 16384 >> 15;
				local818 += local32;
				local814 += local28;
				local820 += local38;
				for (local946 = 0; local946 < local8; local946++) {
					@Pc(952) int local952 = arg1[local946];
					if (this.anIntArrayArray88.length > local952) {
						@Pc(962) int[] local962 = this.anIntArrayArray88[local952];
						for (@Pc(964) int local964 = 0; local964 < local962.length; local964++) {
							@Pc(970) int local970 = local962[local964];
							if (this.aShortArray144 == null || (this.aShortArray144[local970] & arg6) != 0) {
								@Pc(1011) int local1011 = local808[2] * this.anIntArray705[local970] + local808[1] * this.anIntArray703[local970] + local808[0] * this.anIntArray707[local970] + 16384 >> 15;
								@Pc(1043) int local1043 = local808[4] * this.anIntArray703[local970] + this.anIntArray707[local970] * local808[3] + this.anIntArray705[local970] * local808[5] + 16384 >> 15;
								@Pc(1047) int local1047 = local1011 + local814;
								@Pc(1051) int local1051 = local1043 + local818;
								@Pc(1083) int local1083 = local808[6] * this.anIntArray707[local970] + local808[7] * this.anIntArray703[local970] + local808[8] * this.anIntArray705[local970] + 16384 >> 15;
								@Pc(1087) int local1087 = local1083 + local820;
								this.anIntArray707[local970] = local1047;
								this.anIntArray703[local970] = local1051;
								this.anIntArray705[local970] = local1087;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2581) Class205 local2581;
			@Pc(2586) Class74 local2586;
			if (arg0 == 5) {
				if (this.anIntArrayArray89 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray89.length > local32) {
							local240 = this.anIntArrayArray89[local32];
							for (local242 = 0; local242 < local240.length; local242++) {
								local50 = local240[local242];
								if (this.aShortArray149 == null || (this.aShortArray149[local50] & arg6) != 0) {
									local56 = arg2 * 8 + (this.aByteArray117[local50] & 0xFF);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray117[local50] = (byte) local56;
									if (this.aClass65_14 != null) {
										this.aClass65_14.anInterface14_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass205Array1 != null) {
						for (local32 = 0; local32 < this.anInt9707; local32++) {
							local2581 = this.aClass205Array1[local32];
							local2586 = this.aClass74Array1[local32];
							local2586.anInt2285 = local2586.anInt2285 & 0xFFFFFF | 255 - (this.aByteArray117[local2581.anInt5980] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2839) Class74 local2839;
				if (arg0 == 8) {
					if (this.anIntArrayArray87 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray87.length > local32) {
								local240 = this.anIntArrayArray87[local32];
								for (local242 = 0; local242 < local240.length; local242++) {
									local2839 = this.aClass74Array1[local240[local242]];
									local2839.anInt2286 += arg2;
									local2839.anInt2278 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray87 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray87.length > local32) {
								local240 = this.anIntArrayArray87[local32];
								for (local242 = 0; local242 < local240.length; local242++) {
									local2839 = this.aClass74Array1[local240[local242]];
									local2839.anInt2282 = local2839.anInt2282 * arg2 >> 7;
									local2839.anInt2280 = arg3 * local2839.anInt2280 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray87 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray87.length) {
							local240 = this.anIntArrayArray87[local32];
							for (local242 = 0; local242 < local240.length; local242++) {
								local2839 = this.aClass74Array1[local240[local242]];
								local2839.anInt2276 = local2839.anInt2276 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray89 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray89.length) {
						local240 = this.anIntArrayArray89[local32];
						for (local242 = 0; local242 < local240.length; local242++) {
							local50 = local240[local242];
							if (this.aShortArray149 == null || (this.aShortArray149[local50] & arg6) != 0) {
								local56 = this.aShortArray150[local50] & 0xFFFF;
								local364 = local56 >> 10 & 0x3F;
								local387 = local56 >> 7 & 0x7;
								local387 += arg3 / 4;
								@Pc(2693) int local2693 = arg2 + local364 & 0x3F;
								local414 = local56 & 0x7F;
								if (local387 < 0) {
									local387 = 0;
								} else if (local387 > 7) {
									local387 = 7;
								}
								local414 += arg4;
								if (local414 < 0) {
									local414 = 0;
								} else if (local414 > 127) {
									local414 = 127;
								}
								this.aShortArray150[local50] = (short) (local414 | local387 << 7 | local2693 << 10);
								if (this.aClass65_14 != null) {
									this.aClass65_14.anInterface14_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass205Array1 != null) {
					for (local32 = 0; local32 < this.anInt9707; local32++) {
						local2581 = this.aClass205Array1[local32];
						local2586 = this.aClass74Array1[local32];
						local2586.anInt2285 = local2586.anInt2285 & 0xFF000000 | Static141.anIntArray234[this.aShortArray150[local2581.anInt5980] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray88.length) {
					local240 = this.anIntArrayArray88[local32];
					for (local242 = 0; local242 < local240.length; local242++) {
						local50 = local240[local242];
						if (this.aShortArray144 == null || (arg6 & this.aShortArray144[local50]) != 0) {
							this.anIntArray707[local50] -= Static520.anInt9345;
							this.anIntArray703[local50] -= Static211.anInt4657;
							this.anIntArray705[local50] -= Static375.anInt6907;
							this.anIntArray707[local50] = this.anIntArray707[local50] * arg2 >> 7;
							this.anIntArray703[local50] = this.anIntArray703[local50] * arg3 >> 7;
							this.anIntArray705[local50] = this.anIntArray705[local50] * arg4 >> 7;
							this.anIntArray707[local50] += Static520.anInt9345;
							this.anIntArray703[local50] += Static211.anInt4657;
							this.anIntArray705[local50] += Static375.anInt6907;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local242 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static119.aBoolean222) {
				local364 = arg7[0] * Static520.anInt9345 + Static211.anInt4657 * arg7[3] + arg7[6] * Static375.anInt6907 + 16384 >> 15;
				local387 = Static375.anInt6907 * arg7[7] + Static520.anInt9345 * arg7[1] + Static211.anInt4657 * arg7[4] + 16384 >> 15;
				local387 += local50;
				local364 += local242;
				local414 = arg7[8] * Static375.anInt6907 + arg7[5] * Static211.anInt4657 + arg7[2] * Static520.anInt9345 + 16384 >> 15;
				local414 += local56;
				Static520.anInt9345 = local364;
				Static211.anInt4657 = local387;
				Static119.aBoolean222 = false;
				Static375.anInt6907 = local414;
			}
			local364 = arg2 << 15 >> 7;
			local387 = arg3 << 15 >> 7;
			local414 = arg4 << 15 >> 7;
			local445 = local364 * -Static520.anInt9345 + 16384 >> 15;
			local449 = -Static211.anInt4657 * local387 + 16384 >> 15;
			local453 = local414 * -Static375.anInt6907 + 16384 >> 15;
			local457 = Static520.anInt9345 + local445;
			local465 = local449 + Static211.anInt4657;
			local473 = Static375.anInt6907 + local453;
			@Pc(2009) int[] local2009 = new int[] { arg7[0] * local364 + 16384 >> 15, arg7[3] * local364 + 16384 >> 15, local364 * arg7[6] + 16384 >> 15, local387 * arg7[1] + 16384 >> 15, local387 * arg7[4] + 16384 >> 15, local387 * arg7[7] + 16384 >> 15, arg7[2] * local414 + 16384 >> 15, arg7[5] * local414 + 16384 >> 15, arg7[8] * local414 + 16384 >> 15 };
			local629 = local364 * local242 + 16384 >> 15;
			local654 = local387 * local50 + 16384 >> 15;
			local658 = local56 * local414 + 16384 >> 15;
			@Pc(2145) int local2145 = local629 + local457;
			@Pc(2149) int local2149 = local654 + local465;
			@Pc(2153) int local2153 = local658 + local473;
			@Pc(2156) int[] local2156 = new int[9];
			@Pc(2162) int local2162;
			for (local667 = 0; local667 < 3; local667++) {
				for (local2162 = 0; local2162 < 3; local2162++) {
					local672 = 0;
					for (local676 = 0; local676 < 3; local676++) {
						local672 += arg7[local667 * 3 + local676] * local2009[local676 * 3 + local2162];
					}
					local2156[local667 * 3 + local2162] = local672 + 16384 >> 15;
				}
			}
			local2162 = local2153 * arg7[2] + arg7[0] * local2145 + arg7[1] * local2149 + 16384 >> 15;
			local672 = local2153 * arg7[5] + arg7[4] * local2149 + local2145 * arg7[3] + 16384 >> 15;
			local672 += local32;
			local676 = arg7[8] * local2153 + arg7[7] * local2149 + local2145 * arg7[6] + 16384 >> 15;
			local2162 += local28;
			local676 += local38;
			for (local680 = 0; local680 < local8; local680++) {
				local682 = arg1[local680];
				if (this.anIntArrayArray88.length > local682) {
					local808 = this.anIntArrayArray88[local682];
					for (local810 = 0; local810 < local808.length; local810++) {
						local814 = local808[local810];
						if (this.aShortArray144 == null || (arg6 & this.aShortArray144[local814]) != 0) {
							local818 = this.anIntArray703[local814] * local2156[1] + this.anIntArray707[local814] * local2156[0] + local2156[2] * this.anIntArray705[local814] + 16384 >> 15;
							local820 = local2156[4] * this.anIntArray703[local814] + local2156[3] * this.anIntArray707[local814] + local2156[5] * this.anIntArray705[local814] + 16384 >> 15;
							local946 = local2156[6] * this.anIntArray707[local814] + local2156[7] * this.anIntArray703[local814] + this.anIntArray705[local814] * local2156[8] + 16384 >> 15;
							@Pc(2436) int local2436 = local818 + local2162;
							@Pc(2440) int local2440 = local820 + local672;
							this.anIntArray707[local814] = local2436;
							@Pc(2449) int local2449 = local946 + local676;
							this.anIntArray703[local814] = local2440;
							this.anIntArray705[local814] = local2449;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)V")
	private void method8019() {
		if (this.anInt9719 == 0) {
			return;
		}
		if (this.aByte110 != 0) {
			this.method8011(true);
		}
		this.method8011(false);
		if (this.aClass121_1 != null) {
			if (this.aClass121_1.anInterface2_2 == null) {
				this.method8018((this.aByte110 & 0x10) != 0);
			}
			if (this.aClass121_1.anInterface2_2 != null) {
				this.aClass42_Sub3_43.method3191(this.aClass65_13 != null);
				this.aClass42_Sub3_43.method3241(this.aClass65_14, this.aClass65_13, this.aClass65_15, this.aClass65_16);
				@Pc(72) int local72 = this.anIntArray706.length - 1;
				for (@Pc(74) int local74 = 0; local74 < local72; local74++) {
					@Pc(81) int local81 = this.anIntArray706[local74];
					@Pc(88) int local88 = this.anIntArray706[local74 + 1];
					@Pc(95) int local95 = this.aShortArray141[local81] & 0xFFFF;
					if (local95 == 65535) {
						local95 = -1;
					}
					this.aClass42_Sub3_43.method3199(local95, this.aClass65_13 != null);
					this.aClass42_Sub3_43.method3227(this.aClass121_1.anInterface2_2, (local88 - local81) * 3, local81 * 3);
				}
			}
		}
		this.method8012();
	}

	@OriginalMember(owner = "client!ww", name = "ca", descriptor = "(III)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9675; local3++) {
			if (arg0 != 0) {
				this.anIntArray707[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray703[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray705[local3] += arg2;
			}
		}
		if (this.aClass65_15 != null) {
			this.aClass65_15.anInterface14_1 = null;
		}
		this.aBoolean686 = false;
	}

	@OriginalMember(owner = "client!ww", name = "M", descriptor = "()I")
	@Override
	public int M() {
		return this.aShort124;
	}

	@OriginalMember(owner = "client!ww", name = "L", descriptor = "(SS)V")
	@Override
	public void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface11 local9 = this.aClass42_Sub3_43.anInterface11_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt9706; local11++) {
			if (arg0 == this.aShortArray141[local11]) {
				this.aShortArray141[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class278 local44 = local9.method6215(arg0 & 0xFFFF);
			local31 = local44.aByte84;
			local33 = local44.aByte85;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(65) Class278 local65 = local9.method6215(arg1 & 0xFFFF);
			local54 = local65.aByte85;
			local52 = local65.aByte84;
		}
		if (!(local33 != local54 | local31 != local52)) {
			return;
		}
		if (this.aClass205Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt9707; local94++) {
				@Pc(101) Class205 local101 = this.aClass205Array1[local94];
				@Pc(106) Class74 local106 = this.aClass74Array1[local94];
				local106.anInt2285 = local106.anInt2285 & 0xFF000000 | Static141.anIntArray234[this.aShortArray150[local101.anInt5980] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass65_14 != null) {
			this.aClass65_14.anInterface14_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ww", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean686) {
			this.method8015();
		}
		return this.aShort122;
	}

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "(I)V")
	private void method8020() {
		if (this.aClass205Array1 == null) {
			return;
		}
		@Pc(8) Class91_Sub1 local8 = this.aClass42_Sub3_43.aClass91_Sub1_2;
		@Pc(12) float local12 = this.aClass42_Sub3_43.ra();
		@Pc(16) float local16 = this.aClass42_Sub3_43.P();
		this.aClass42_Sub3_43.method3245();
		this.aClass42_Sub3_43.method5822(false);
		this.aClass42_Sub3_43.method3191(false);
		this.aClass42_Sub3_43.method3241(null, null, this.aClass42_Sub3_43.aClass65_1, this.aClass42_Sub3_43.aClass65_2);
		for (@Pc(43) int local43 = 0; local43 < this.anInt9707; local43++) {
			@Pc(50) Class205 local50 = this.aClass205Array1[local43];
			@Pc(55) Class74 local55 = this.aClass74Array1[local43];
			if (!local50.aBoolean453 || !this.aClass42_Sub3_43.method5836()) {
				@Pc(84) float local84 = (float) (this.anIntArray707[local50.anInt5981] + this.anIntArray707[local50.anInt5977] + this.anIntArray707[local50.anInt5978]) * 0.3333333F;
				@Pc(105) float local105 = (float) (this.anIntArray703[local50.anInt5981] + this.anIntArray703[local50.anInt5977] + this.anIntArray703[local50.anInt5978]) * 0.3333333F;
				@Pc(127) float local127 = (float) (this.anIntArray705[local50.anInt5977] + this.anIntArray705[local50.anInt5981] + this.anIntArray705[local50.anInt5978]) * 0.3333333F;
				@Pc(141) float local141 = Static400.aFloat175 * local127 + Static337.aFloat130 * local105 + local84 * Static66.aFloat50 + Static72.aFloat51;
				@Pc(155) float local155 = Static444.aFloat180 + local127 * Static58.aFloat49 + Static143.aFloat79 * local105 + local84 * Static522.aFloat190;
				@Pc(169) float local169 = Static500.aFloat187 + local105 * Static526.aFloat192 + local84 * Static273.aFloat116 + Static380.aFloat176 * local127;
				local8.method2460(local55.anInt2280 * local50.aShort80 >> 7, (float) local55.anInt2286 + local141, local55.anInt2276, (float) local55.anInt2278 - local155, local55.anInt2282 * local50.aShort79 >> 7, -local169);
				this.aClass42_Sub3_43.method3253(local8);
				this.aClass42_Sub3_43.la(local16, local12 - (float) local50.anInt5982 * 1.5F);
				@Pc(219) int local219 = local55.anInt2285;
				OpenGL.glColor4ub((byte) (local219 >> 16), (byte) (local219 >> 8), (byte) local219, (byte) (local219 >> 24));
				this.aClass42_Sub3_43.method3269(local50.aShort81);
				this.aClass42_Sub3_43.method3209(local50.aByte75);
				this.aClass42_Sub3_43.method3257(local50.aByte74);
				this.aClass42_Sub3_43.method3203(4);
			}
		}
		this.aClass42_Sub3_43.la(local16, local12);
		this.aClass42_Sub3_43.method5822(true);
		this.aClass42_Sub3_43.method3195();
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIBIIII)Z")
	private boolean method8021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > arg0 && arg7 > arg0 && arg0 < arg6) {
			return false;
		} else if (arg5 < arg0 && arg0 > arg7 && arg6 < arg0) {
			return false;
		} else if (arg4 < arg3 && arg4 < arg2 && arg4 < arg1) {
			return false;
		} else {
			return arg3 >= arg4 || arg2 >= arg4 || arg4 <= arg1;
		}
	}

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aShort124 = (short) arg0;
		if (this.aClass65_14 != null) {
			this.aClass65_14.anInterface14_1 = null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BIIBS)I")
	private int method8022(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3) {
		@Pc(12) int local12 = Static141.anIntArray234[Static195.method3694(arg1, arg2)];
		if (arg3 != -1) {
			@Pc(30) Class278 local30 = this.aClass42_Sub3_43.anInterface11_11.method6215(arg3 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte84 & 0xFF;
			@Pc(51) int local51;
			@Pc(71) int local71;
			if (local35 != 0) {
				if (arg2 < 0) {
					local51 = 0;
				} else if (arg2 <= 127) {
					local51 = arg2 * 131586;
				} else {
					local51 = 16777215;
				}
				if (local35 == 256) {
					local12 = local51;
				} else {
					local71 = 256 - local35;
					local12 = ((local12 & 0xFF00) * local71 + (local51 & 0xFF00) * local35 & 0xFF0000) + (local71 * (local12 & 0xFF00FF) + local35 * (local51 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local51 = local30.aByte85 & 0xFF;
			if (local51 != 0) {
				local51 += 256;
				@Pc(121) int local121 = (local12 >> 16 & 0xFF) * local51;
				if (local121 > 65535) {
					local121 = 65535;
				}
				local71 = local51 * (local12 >> 8 & 0xFF);
				if (local71 > 65535) {
					local71 = 65535;
				}
				@Pc(147) int local147 = local51 * (local12 & 0xFF);
				if (local147 > 65535) {
					local147 = 65535;
				}
				local12 = (local71 & 0xFF00) + (local121 << 8 & 0xFF0044) + (local147 >> 8);
			}
		}
		return (local12 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "(IIII)V")
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static520.anInt9345 = 0;
			local14 = 0;
			Static375.anInt6907 = 0;
			Static211.anInt4657 = 0;
			for (local20 = 0; local20 < this.anInt9675; local20++) {
				Static520.anInt9345 += this.anIntArray707[local20];
				Static211.anInt4657 += this.anIntArray703[local20];
				Static375.anInt6907 += this.anIntArray705[local20];
				local14++;
			}
			if (local14 <= 0) {
				Static520.anInt9345 = arg1;
				Static211.anInt4657 = arg2;
				Static375.anInt6907 = arg3;
			} else {
				Static375.anInt6907 = arg3 + Static375.anInt6907 / local14;
				Static211.anInt4657 = Static211.anInt4657 / local14 + arg2;
				Static520.anInt9345 = Static520.anInt9345 / local14 + arg1;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt9675; local14++) {
				this.anIntArray707[local14] += arg1;
				this.anIntArray703[local14] += arg2;
				this.anIntArray705[local14] += arg3;
			}
		} else {
			@Pc(163) int local163;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt9675; local14++) {
					this.anIntArray707[local14] -= Static520.anInt9345;
					this.anIntArray703[local14] -= Static211.anInt4657;
					this.anIntArray705[local14] -= Static375.anInt6907;
					if (arg3 != 0) {
						local20 = Class12_Sub1_Sub36.anIntArray667[arg3];
						local163 = Class12_Sub1_Sub36.anIntArray668[arg3];
						local182 = this.anIntArray703[local14] * local20 + this.anIntArray707[local14] * local163 + 32767 >> 15;
						this.anIntArray703[local14] = this.anIntArray703[local14] * local163 + 32767 - this.anIntArray707[local14] * local20 >> 15;
						this.anIntArray707[local14] = local182;
					}
					if (arg1 != 0) {
						local20 = Class12_Sub1_Sub36.anIntArray667[arg1];
						local163 = Class12_Sub1_Sub36.anIntArray668[arg1];
						local182 = this.anIntArray703[local14] * local163 + 32767 - local20 * this.anIntArray705[local14] >> 15;
						this.anIntArray705[local14] = this.anIntArray703[local14] * local20 + this.anIntArray705[local14] * local163 + 32767 >> 15;
						this.anIntArray703[local14] = local182;
					}
					if (arg2 != 0) {
						local20 = Class12_Sub1_Sub36.anIntArray667[arg2];
						local163 = Class12_Sub1_Sub36.anIntArray668[arg2];
						local182 = local20 * this.anIntArray705[local14] + local163 * this.anIntArray707[local14] + 32767 >> 15;
						this.anIntArray705[local14] = local163 * this.anIntArray705[local14] + 32767 - local20 * this.anIntArray707[local14] >> 15;
						this.anIntArray707[local14] = local182;
					}
					this.anIntArray707[local14] += Static520.anInt9345;
					this.anIntArray703[local14] += Static211.anInt4657;
					this.anIntArray705[local14] += Static375.anInt6907;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt9675; local14++) {
					this.anIntArray707[local14] -= Static520.anInt9345;
					this.anIntArray703[local14] -= Static211.anInt4657;
					this.anIntArray705[local14] -= Static375.anInt6907;
					this.anIntArray707[local14] = arg1 * this.anIntArray707[local14] / 128;
					this.anIntArray703[local14] = this.anIntArray703[local14] * arg2 / 128;
					this.anIntArray705[local14] = arg3 * this.anIntArray705[local14] / 128;
					this.anIntArray707[local14] += Static520.anInt9345;
					this.anIntArray703[local14] += Static211.anInt4657;
					this.anIntArray705[local14] += Static375.anInt6907;
				}
			} else {
				@Pc(525) Class205 local525;
				@Pc(530) Class74 local530;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt9706; local14++) {
						local20 = (this.aByteArray117[local14] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray117[local14] = (byte) local20;
					}
					if (this.aClass65_14 != null) {
						this.aClass65_14.anInterface14_1 = null;
					}
					if (this.aClass205Array1 != null) {
						for (local20 = 0; local20 < this.anInt9707; local20++) {
							local525 = this.aClass205Array1[local20];
							local530 = this.aClass74Array1[local20];
							local530.anInt2285 = local530.anInt2285 & 0xFFFFFF | 255 - (this.aByteArray117[local525.anInt5980] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt9706; local14++) {
						local20 = this.aShortArray150[local14] & 0xFFFF;
						local163 = local20 >> 10 & 0x3F;
						local182 = local20 >> 7 & 0x7;
						local182 += arg2 / 4;
						@Pc(595) int local595 = local20 & 0x7F;
						@Pc(601) int local601 = arg1 + local163 & 0x3F;
						if (local182 < 0) {
							local182 = 0;
						} else if (local182 > 7) {
							local182 = 7;
						}
						local595 += arg3;
						if (local595 < 0) {
							local595 = 0;
						} else if (local595 > 127) {
							local595 = 127;
						}
						this.aShortArray150[local14] = (short) (local182 << 7 | local601 << 10 | local595);
					}
					if (this.aClass65_14 != null) {
						this.aClass65_14.anInterface14_1 = null;
					}
					if (this.aClass205Array1 != null) {
						for (local20 = 0; local20 < this.anInt9707; local20++) {
							local525 = this.aClass205Array1[local20];
							local530 = this.aClass74Array1[local20];
							local530.anInt2285 = local530.anInt2285 & 0xFF000000 | Static141.anIntArray234[this.aShortArray150[local525.anInt5980] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(713) Class74 local713;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt9707; local14++) {
							local713 = this.aClass74Array1[local14];
							local713.anInt2286 += arg1;
							local713.anInt2278 += arg2;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt9707; local14++) {
							local713 = this.aClass74Array1[local14];
							local713.anInt2282 = arg1 * local713.anInt2282 >> 7;
							local713.anInt2280 = local713.anInt2280 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt9707; local14++) {
							local713 = this.aClass74Array1[local14];
							local713.anInt2276 = local713.anInt2276 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "va", descriptor = "()I")
	@Override
	public int va() {
		if (!this.aBoolean686) {
			this.method8015();
		}
		return this.aShort123;
	}

	@OriginalMember(owner = "client!ww", name = "X", descriptor = "()V")
	@Override
	public void X() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9675; local7++) {
			this.anIntArray705[local7] = -this.anIntArray705[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt9702; local25++) {
			this.aShortArray145[local25] = (short) -this.aShortArray145[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt9706; local44++) {
			@Pc(51) short local51 = this.aShortArray142[local44];
			this.aShortArray142[local44] = this.aShortArray146[local44];
			this.aShortArray146[local44] = local51;
		}
		if (this.aClass65_13 == null && this.aClass65_14 != null) {
			this.aClass65_14.anInterface14_1 = null;
		}
		if (this.aClass65_13 != null) {
			this.aClass65_13.anInterface14_1 = null;
		}
		if (this.aClass65_15 != null) {
			this.aClass65_15.anInterface14_1 = null;
		}
		if (this.aClass121_1 != null) {
			this.aClass121_1.anInterface2_2 = null;
		}
		this.aBoolean686 = false;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method8005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class91_Sub1 local8 = (Class91_Sub1) arg2;
		@Pc(12) Class91_Sub1 local12 = this.aClass42_Sub3_43.aClass91_Sub1_4;
		@Pc(33) float local33 = local12.aFloat72 * local8.aFloat68 + local12.aFloat64 * local8.aFloat61 + local8.aFloat69 * local12.aFloat65 + local12.aFloat61;
		@Pc(54) float local54 = local12.aFloat63 * local8.aFloat68 + local8.aFloat61 * local12.aFloat66 + local8.aFloat69 * local12.aFloat62 + local12.aFloat69;
		Static522.aFloat190 = local8.aFloat70 * local12.aFloat63 + local12.aFloat66 * local8.aFloat64 + local8.aFloat66 * local12.aFloat62;
		Static337.aFloat130 = local12.aFloat72 * local8.aFloat71 + local12.aFloat64 * local8.aFloat65 + local8.aFloat62 * local12.aFloat65;
		Static400.aFloat175 = local8.aFloat67 * local12.aFloat72 + local12.aFloat65 * local8.aFloat63 + local12.aFloat64 * local8.aFloat72;
		@Pc(129) float local129 = local12.aFloat70 * local8.aFloat61 + local12.aFloat71 * local8.aFloat69 + local8.aFloat68 * local12.aFloat67 + local12.aFloat68;
		Static273.aFloat116 = local12.aFloat70 * local8.aFloat64 + local12.aFloat71 * local8.aFloat66 + local8.aFloat70 * local12.aFloat67;
		Static380.aFloat176 = local8.aFloat67 * local12.aFloat67 + local12.aFloat70 * local8.aFloat72 + local12.aFloat71 * local8.aFloat63;
		Static66.aFloat50 = local8.aFloat70 * local12.aFloat72 + local12.aFloat65 * local8.aFloat66 + local12.aFloat64 * local8.aFloat64;
		Static58.aFloat49 = local12.aFloat63 * local8.aFloat67 + local12.aFloat62 * local8.aFloat63 + local8.aFloat72 * local12.aFloat66;
		Static143.aFloat79 = local8.aFloat71 * local12.aFloat63 + local8.aFloat62 * local12.aFloat62 + local12.aFloat66 * local8.aFloat65;
		Static526.aFloat192 = local8.aFloat62 * local12.aFloat71 + local8.aFloat65 * local12.aFloat70 + local8.aFloat71 * local12.aFloat67;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass42_Sub3_43.anInt3689;
		@Pc(255) int local255 = this.aClass42_Sub3_43.anInt3713;
		if (!this.aBoolean686) {
			this.method8015();
		}
		Static433.anIntArray600[0] = this.aShort118;
		Static452.anIntArray614[0] = this.aShort125;
		Static162.anIntArray297[0] = this.aShort119;
		Static433.anIntArray600[1] = this.aShort123;
		Static452.anIntArray614[1] = this.aShort125;
		Static162.anIntArray297[1] = this.aShort119;
		Static433.anIntArray600[2] = this.aShort118;
		Static452.anIntArray614[2] = this.aShort120;
		Static433.anIntArray600[3] = this.aShort123;
		Static162.anIntArray297[2] = this.aShort119;
		Static452.anIntArray614[3] = this.aShort120;
		Static433.anIntArray600[4] = this.aShort118;
		Static162.anIntArray297[3] = this.aShort119;
		Static452.anIntArray614[4] = this.aShort125;
		Static433.anIntArray600[5] = this.aShort123;
		Static162.anIntArray297[4] = this.aShort122;
		Static452.anIntArray614[5] = this.aShort125;
		Static162.anIntArray297[5] = this.aShort122;
		Static433.anIntArray600[6] = this.aShort118;
		Static452.anIntArray614[6] = this.aShort120;
		Static433.anIntArray600[7] = this.aShort123;
		Static162.anIntArray297[6] = this.aShort122;
		Static452.anIntArray614[7] = this.aShort120;
		Static162.anIntArray297[7] = this.aShort122;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(400) float local400;
		@Pc(390) float local390;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static452.anIntArray614[local383];
			local395 = Static162.anIntArray297[local383];
			local400 = Static433.anIntArray600[local383];
			local414 = local129 + local395 * Static380.aFloat176 + Static273.aFloat116 * local400 + Static526.aFloat192 * local390;
			local428 = local54 + Static143.aFloat79 * local390 + local400 * Static522.aFloat190 + local395 * Static58.aFloat49;
			local442 = local400 * Static66.aFloat50 + local390 * Static337.aFloat130 + Static400.aFloat175 * local395 + local33;
			if ((float) this.aClass42_Sub3_43.anInt3715 <= local414) {
				@Pc(461) float local461 = (float) local251 * local442 / local414 + (float) this.aClass42_Sub3_43.anInt3706;
				if (local461 < local241) {
					local241 = local461;
				}
				@Pc(479) float local479 = (float) local255 * local428 / local414 + (float) this.aClass42_Sub3_43.anInt3681;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local245 > local479) {
					local245 = local479;
				}
				if (local479 > local247) {
					local247 = local479;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt9702 > this.aClass42_Sub3_43.anIntArray296.length) {
				this.aClass42_Sub3_43.anIntArray296 = new int[this.anInt9702];
				this.aClass42_Sub3_43.anIntArray294 = new int[this.anInt9702];
			}
			@Pc(552) int[] local552 = this.aClass42_Sub3_43.anIntArray296;
			@Pc(556) int[] local556 = this.aClass42_Sub3_43.anIntArray294;
			@Pc(632) int local632;
			for (@Pc(558) int local558 = 0; local558 < this.anInt9675; local558++) {
				local400 = this.anIntArray707[local558];
				local395 = this.anIntArray705[local558];
				local390 = this.anIntArray703[local558];
				local442 = local33 + Static66.aFloat50 * local400 + Static337.aFloat130 * local390 + local395 * Static400.aFloat175;
				local428 = local54 + Static58.aFloat49 * local395 + Static143.aFloat79 * local390 + local400 * Static522.aFloat190;
				local414 = local129 + local390 * Static526.aFloat192 + Static273.aFloat116 * local400 + local395 * Static380.aFloat176;
				@Pc(639) int local639;
				@Pc(641) int local641;
				@Pc(650) int local650;
				if (local414 >= (float) this.aClass42_Sub3_43.anInt3715) {
					local632 = (int) ((float) this.aClass42_Sub3_43.anInt3706 + local442 * (float) local251 / local414);
					local639 = (int) ((float) this.aClass42_Sub3_43.anInt3681 + local428 * (float) local255 / local414);
					local641 = this.anIntArray704[local558];
					local650 = this.anIntArray704[local558 + 1];
					for (@Pc(713) int local713 = local641; local713 < local650; local713++) {
						@Pc(722) int local722 = this.aShortArray143[local713] - 1;
						if (local722 == -1) {
							break;
						}
						local552[local722] = local632;
						local556[local722] = local639;
					}
				} else {
					local632 = this.anIntArray704[local558];
					local639 = this.anIntArray704[local558 + 1];
					for (local641 = local632; local641 < local639; local641++) {
						local650 = this.aShortArray143[local641] - 1;
						if (local650 == -1) {
							break;
						}
						local552[this.aShortArray143[local641] - 1] = -999999;
					}
				}
			}
			for (local632 = 0; local632 < this.anInt9706; local632++) {
				if (local552[this.aShortArray142[local632]] != -999999 && local552[this.aShortArray148[local632]] != -999999 && local552[this.aShortArray146[local632]] != -999999 && this.method8021(arg1, local552[this.aShortArray146[local632]], local552[this.aShortArray148[local632]], local552[this.aShortArray142[local632]], arg0, local556[this.aShortArray142[local632]], local556[this.aShortArray146[local632]], local556[this.aShortArray148[local632]])) {
					return true;
				}
			}
		}
		return false;
	}
}
