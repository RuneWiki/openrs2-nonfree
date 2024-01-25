import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!to", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray164;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!to", name = "u", descriptor = "[I")
	private int[] anIntArray550;

	@OriginalMember(owner = "client!to", name = "y", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!to", name = "B", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!to", name = "C", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!to", name = "G", descriptor = "[I")
	private int[] anIntArray551;

	@OriginalMember(owner = "client!to", name = "J", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!to", name = "P", descriptor = "Lclient!fr;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "client!to", name = "R", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!to", name = "S", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!to", name = "T", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!to", name = "U", descriptor = "I")
	private int anInt6805;

	@OriginalMember(owner = "client!to", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray165;

	@OriginalMember(owner = "client!to", name = "Z", descriptor = "[F")
	private float[] aFloatArray19;

	@OriginalMember(owner = "client!to", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray166;

	@OriginalMember(owner = "client!to", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!to", name = "mb", descriptor = "[I")
	private int[] anIntArray552;

	@OriginalMember(owner = "client!to", name = "tb", descriptor = "I")
	private int anInt6820;

	@OriginalMember(owner = "client!to", name = "ub", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!to", name = "wb", descriptor = "[B")
	private byte[] aByteArray83;

	@OriginalMember(owner = "client!to", name = "xb", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!to", name = "zb", descriptor = "[Lclient!vh;")
	private Class258[] aClass258Array1;

	@OriginalMember(owner = "client!to", name = "Bb", descriptor = "I")
	private int anInt6823;

	@OriginalMember(owner = "client!to", name = "Fb", descriptor = "[Lclient!ol;")
	private Class191[] aClass191Array3;

	@OriginalMember(owner = "client!to", name = "Gb", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!to", name = "Hb", descriptor = "[Lclient!tl;")
	private Class239[] aClass239Array1;

	@OriginalMember(owner = "client!to", name = "Nb", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!to", name = "Pb", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!to", name = "Sb", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!to", name = "Tb", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!to", name = "Ub", descriptor = "[I")
	private int[] anIntArray553;

	@OriginalMember(owner = "client!to", name = "Yb", descriptor = "[I")
	private int[] anIntArray554;

	@OriginalMember(owner = "client!to", name = "ac", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!to", name = "bc", descriptor = "Lclient!tb;")
	private Interface11 anInterface11_3;

	@OriginalMember(owner = "client!to", name = "cc", descriptor = "B")
	private byte aByte83;

	@OriginalMember(owner = "client!to", name = "ec", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!to", name = "fc", descriptor = "Lclient!ui;")
	private Interface12 anInterface12_6;

	@OriginalMember(owner = "client!to", name = "lc", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!to", name = "nc", descriptor = "[Lclient!vc;")
	private Class254[] aClass254Array3;

	@OriginalMember(owner = "client!to", name = "pc", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!to", name = "rc", descriptor = "[F")
	private float[] aFloatArray20;

	@OriginalMember(owner = "client!to", name = "L", descriptor = "I")
	private int anInt6800 = 0;

	@OriginalMember(owner = "client!to", name = "K", descriptor = "I")
	private int anInt6799 = 0;

	@OriginalMember(owner = "client!to", name = "vb", descriptor = "Z")
	private boolean aBoolean460 = false;

	@OriginalMember(owner = "client!to", name = "qb", descriptor = "I")
	private int anInt6818 = 0;

	@OriginalMember(owner = "client!to", name = "W", descriptor = "I")
	private int anInt6807 = 0;

	@OriginalMember(owner = "client!to", name = "sb", descriptor = "Z")
	private boolean aBoolean459 = true;

	@OriginalMember(owner = "client!to", name = "Qb", descriptor = "I")
	private int anInt6833 = 0;

	@OriginalMember(owner = "client!to", name = "x", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_38;

	@OriginalMember(owner = "client!to", name = "Rb", descriptor = "Lclient!db;")
	private Class47 aClass47_14;

	@OriginalMember(owner = "client!to", name = "ib", descriptor = "Lclient!db;")
	private Class47 aClass47_12;

	@OriginalMember(owner = "client!to", name = "db", descriptor = "Lclient!db;")
	private Class47 aClass47_11;

	@OriginalMember(owner = "client!to", name = "ob", descriptor = "Lclient!db;")
	private Class47 aClass47_13;

	@OriginalMember(owner = "client!to", name = "F", descriptor = "Lclient!kh;")
	private Class144 aClass144_1;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class63_Sub2(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aClass75_Sub2_38 = arg0;
		this.aClass47_14 = new Class47(null, 5126, 3, 0);
		this.aClass47_12 = new Class47(null, 5126, 2, 0);
		this.aClass47_11 = new Class47(null, 5126, 3, 0);
		this.aClass47_13 = new Class47(null, 5121, 4, 0);
		this.aClass144_1 = new Class144();
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!na;Lclient!fc;IIII)V")
	public Class63_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6823 = arg5;
		this.anInt6805 = arg2;
		this.aClass75_Sub2_38 = arg0;
		if (Static42.method4657(arg2, arg5)) {
			this.aClass47_14 = new Class47(null, 5126, 3, 0);
		}
		if (Static212.method3007(arg2, arg5)) {
			this.aClass47_12 = new Class47(null, 5126, 2, 0);
		}
		if (Static380.method5247(arg2, arg5)) {
			this.aClass47_11 = new Class47(null, 5126, 3, 0);
		}
		if (Static139.method2169(arg2, arg5)) {
			this.aClass47_13 = new Class47(null, 5121, 4, 0);
		}
		if (Static368.method6261(arg2, arg5)) {
			this.aClass144_1 = new Class144();
		}
		@Pc(102) Interface7 local102 = arg0.anInterface7_8;
		this.anIntArray550 = new int[arg1.anInt1816 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt1812];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt1812; local115++) {
			if ((arg1.aByteArray22 == null || arg1.aByteArray22[local115] != 2) && (arg1.aShortArray19 == null || arg1.aShortArray19[local115] == -1 || !local102.method1170(arg1.aShortArray19[local115] & 0xFFFF).aBoolean489)) {
				local113[this.anInt6799++] = local115;
				this.anIntArray550[arg1.aShortArray17[local115]]++;
				this.anIntArray550[arg1.aShortArray25[local115]]++;
				this.anIntArray550[arg1.aShortArray20[local115]]++;
			}
		}
		this.anInt6818 = this.anInt6799;
		@Pc(207) long[] local207 = new long[this.anInt6799];
		@Pc(219) boolean local219 = (this.anInt6805 & 0x100) != 0;
		@Pc(231) int local231;
		@Pc(242) int local242;
		@Pc(382) int local382;
		label493: for (@Pc(221) int local221 = 0; local221 < this.anInt6799; local221++) {
			@Pc(227) int local227 = local113[local221];
			@Pc(229) Class257 local229 = null;
			local231 = 0;
			@Pc(233) byte local233 = 0;
			@Pc(235) byte local235 = 0;
			@Pc(237) byte local237 = 0;
			if (arg1.aClass117Array1 != null) {
				for (local242 = 0; local242 < arg1.aClass117Array1.length; local242++) {
					@Pc(249) Class117 local249 = arg1.aClass117Array1[local242];
					if (local249.anInt2910 == local227) {
						@Pc(262) Class172 local262 = Static261.method3685(local249.anInt2911);
						if (local262.aBoolean329) {
							local207[local221] = Long.MAX_VALUE;
							this.anInt6818--;
							continue label493;
						}
					}
				}
			}
			@Pc(289) short local289 = -1;
			if (arg1.aShortArray19 != null) {
				local289 = arg1.aShortArray19[local227];
				if (local289 != -1) {
					local229 = local102.method1170(local289 & 0xFFFF);
					local237 = local229.aByte94;
					local235 = local229.aByte96;
				}
			}
			@Pc(338) boolean local338 = arg1.aByteArray21 != null && arg1.aByteArray21[local227] != 0 || local229 != null && local229.aBoolean487 | !local229.aBoolean492;
			if ((local219 || local338) && arg1.aByteArray18 != null) {
				local231 += arg1.aByteArray18[local227] << 17;
			}
			if (local338) {
				local231 += 65536;
			}
			local231 += (local235 & 0xFF) << 8;
			local231 += local237 & 0xFF;
			local382 = local233 + ((local289 & 0xFFFF) << 16);
			@Pc(388) int local388 = local382 + (local221 & 0xFFFF);
			local207[local221] = (long) local388 + ((long) local231 << 32);
		}
		Static352.method4955(local113, local207);
		this.anInt6807 = arg1.anInt1808;
		this.anInt6800 = arg1.anInt1816;
		this.aShortArray109 = arg1.aShortArray26;
		this.anIntArray553 = arg1.anIntArray128;
		this.anIntArray551 = arg1.anIntArray129;
		this.anIntArray552 = arg1.anIntArray130;
		this.aClass191Array3 = arg1.aClass191Array1;
		@Pc(443) Class104[] local443 = new Class104[this.anInt6800];
		this.aClass254Array3 = arg1.aClass254Array1;
		@Pc(467) int local467;
		@Pc(481) int local481;
		if (arg1.aClass117Array1 != null) {
			this.anInt6820 = arg1.aClass117Array1.length;
			this.aClass239Array1 = new Class239[this.anInt6820];
			this.aClass258Array1 = new Class258[this.anInt6820];
			for (local467 = 0; local467 < this.anInt6820; local467++) {
				@Pc(474) Class117 local474 = arg1.aClass117Array1[local467];
				@Pc(479) Class172 local479 = Static261.method3685(local474.anInt2911);
				local481 = -1;
				for (@Pc(483) int local483 = 0; local483 < this.anInt6799; local483++) {
					if (local474.anInt2910 == local113[local483]) {
						local481 = local483;
						break;
					}
				}
				if (local481 == -1) {
					throw new RuntimeException();
				}
				local242 = Static64.anIntArray85[arg1.aShortArray24[local474.anInt2910] & 0xFFFF] & 0xFFFFFF;
				local242 |= 255 - (arg1.aByteArray21 == null ? 0 : arg1.aByteArray21[local474.anInt2910]) << 24;
				this.aClass258Array1[local467] = new Class258(local481, arg1.aShortArray17[local474.anInt2910], arg1.aShortArray25[local474.anInt2910], arg1.aShortArray20[local474.anInt2910], local479.anInt4596, local479.anInt4600, local479.anInt4597, local479.anInt4598, local479.anInt4595, local479.aBoolean329, local479.aBoolean330, local474.anInt2913);
				this.aClass239Array1[local467] = new Class239(local242);
			}
		}
		local467 = this.anInt6799 * 3;
		this.aShort93 = (short) arg4;
		this.aShortArray110 = new short[local467];
		this.lb = new short[this.anInt6799];
		this.aByteArray82 = new byte[local467];
		this.aFloatArray20 = new float[local467];
		Static67.aLongArray1 = new long[local467];
		this.aFloatArray19 = new float[local467];
		this.aShortArray114 = new short[this.anInt6799];
		this.aShortArray108 = new short[local467];
		this.aShortArray116 = new short[this.anInt6799];
		this.aShortArray107 = new short[this.anInt6799];
		if (arg1.aShortArray18 != null) {
			this.aShortArray113 = new short[this.anInt6799];
		}
		this.aShortArray111 = new short[local467];
		this.aByteArray83 = new byte[this.anInt6799];
		this.aShortArray115 = new short[this.anInt6799];
		this.aShort95 = (short) arg3;
		this.aShortArray112 = new short[local467];
		local231 = 0;
		for (local382 = 0; local382 < arg1.anInt1816; local382++) {
			local481 = this.anIntArray550[local382];
			this.anIntArray550[local382] = local231;
			local231 += local481;
			local443[local382] = new Class104();
		}
		this.anIntArray550[arg1.anInt1816] = local231;
		@Pc(718) int[] local718 = null;
		@Pc(720) int[] local720 = null;
		@Pc(722) int[] local722 = null;
		@Pc(724) float[][] local724 = null;
		@Pc(750) int local750;
		@Pc(782) int local782;
		@Pc(788) int local788;
		@Pc(801) int local801;
		@Pc(803) int local803;
		@Pc(837) int local837;
		@Pc(842) int local842;
		@Pc(1010) float local1010;
		@Pc(1003) float local1003;
		@Pc(1012) float local1012;
		if (arg1.aByteArray20 != null) {
			@Pc(730) int local730 = arg1.anInt1813;
			@Pc(733) int[] local733 = new int[local730];
			@Pc(736) int[] local736 = new int[local730];
			@Pc(739) int[] local739 = new int[local730];
			@Pc(742) int[] local742 = new int[local730];
			@Pc(745) int[] local745 = new int[local730];
			@Pc(748) int[] local748 = new int[local730];
			for (local750 = 0; local750 < local730; local750++) {
				local733[local750] = Integer.MAX_VALUE;
				local736[local750] = -2147483647;
				local739[local750] = Integer.MAX_VALUE;
				local742[local750] = -2147483647;
				local745[local750] = Integer.MAX_VALUE;
				local748[local750] = -2147483647;
			}
			for (local782 = 0; local782 < this.anInt6799; local782++) {
				local788 = local113[local782];
				if (arg1.aByteArray20[local788] != -1) {
					local801 = arg1.aByteArray20[local788] & 0xFF;
					for (local803 = 0; local803 < 3; local803++) {
						@Pc(815) short local815;
						if (local803 == 0) {
							local815 = arg1.aShortArray17[local788];
						} else if (local803 == 1) {
							local815 = arg1.aShortArray25[local788];
						} else {
							local815 = arg1.aShortArray20[local788];
						}
						local837 = arg1.anIntArray128[local815];
						local842 = arg1.anIntArray130[local815];
						@Pc(847) int local847 = arg1.anIntArray129[local815];
						if (local837 < local733[local801]) {
							local733[local801] = local837;
						}
						if (local736[local801] < local837) {
							local736[local801] = local837;
						}
						if (local842 < local739[local801]) {
							local739[local801] = local842;
						}
						if (local842 > local742[local801]) {
							local742[local801] = local842;
						}
						if (local745[local801] > local847) {
							local745[local801] = local847;
						}
						if (local748[local801] < local847) {
							local748[local801] = local847;
						}
					}
				}
			}
			local720 = new int[local730];
			local722 = new int[local730];
			local724 = new float[local730][];
			local718 = new int[local730];
			for (local788 = 0; local788 < local730; local788++) {
				@Pc(945) byte local945 = arg1.aByteArray19[local788];
				if (local945 > 0) {
					local718[local788] = (local733[local788] + local736[local788]) / 2;
					local720[local788] = (local742[local788] + local739[local788]) / 2;
					local722[local788] = (local748[local788] + local745[local788]) / 2;
					if (local945 == 1) {
						local842 = arg1.anIntArray133[local788];
						local1003 = 64.0F / (float) arg1.anIntArray136[local788];
						if (local842 == 0) {
							local1010 = 1.0F;
							local1012 = 1.0F;
						} else if (local842 <= 0) {
							local1012 = 1.0F;
							local1010 = (float) -local842 / 1024.0F;
						} else {
							local1012 = (float) local842 / 1024.0F;
							local1010 = 1.0F;
						}
					} else if (local945 == 2) {
						local1012 = 64.0F / (float) arg1.anIntArray126[local788];
						local1003 = 64.0F / (float) arg1.anIntArray136[local788];
						local1010 = 64.0F / (float) arg1.anIntArray133[local788];
					} else {
						local1003 = (float) arg1.anIntArray136[local788] / 1024.0F;
						local1010 = (float) arg1.anIntArray133[local788] / 1024.0F;
						local1012 = (float) arg1.anIntArray126[local788] / 1024.0F;
					}
					local724[local788] = Static414.method5685(local1012, local1003, arg1.aShortArray23[local788], arg1.aByteArray16[local788] & 0xFF, local1010, arg1.aShortArray21[local788], arg1.aShortArray22[local788]);
				}
			}
		}
		@Pc(1131) Class17[] local1131 = new Class17[arg1.anInt1812];
		@Pc(1150) short local1150;
		@Pc(1161) int local1161;
		@Pc(1172) int local1172;
		@Pc(1231) int local1231;
		for (@Pc(1133) int local1133 = 0; local1133 < arg1.anInt1812; local1133++) {
			@Pc(1140) short local1140 = arg1.aShortArray17[local1133];
			@Pc(1145) short local1145 = arg1.aShortArray25[local1133];
			local1150 = arg1.aShortArray20[local1133];
			local1161 = this.anIntArray553[local1145] - this.anIntArray553[local1140];
			local1172 = this.anIntArray552[local1145] - this.anIntArray552[local1140];
			local750 = this.anIntArray551[local1145] - this.anIntArray551[local1140];
			local782 = this.anIntArray553[local1150] - this.anIntArray553[local1140];
			local788 = this.anIntArray552[local1150] - this.anIntArray552[local1140];
			local801 = this.anIntArray551[local1150] - this.anIntArray551[local1140];
			local803 = local1172 * local801 - local750 * local788;
			local1231 = local782 * local750 - local1161 * local801;
			local837 = local1161 * local788 - local1172 * local782;
			while (local803 > 8192 || local1231 > 8192 || local837 > 8192 || local803 < -8192 || local1231 < -8192 || local837 < -8192) {
				local803 >>= 0x1;
				local837 >>= 0x1;
				local1231 >>= 0x1;
			}
			local842 = (int) Math.sqrt((double) (local837 * local837 + local1231 * local1231 + local803 * local803));
			if (local842 <= 0) {
				local842 = 1;
			}
			local1231 = local1231 * 256 / local842;
			local837 = local837 * 256 / local842;
			local803 = local803 * 256 / local842;
			@Pc(1325) byte local1325 = arg1.aByteArray22 == null ? 0 : arg1.aByteArray22[local1133];
			if (local1325 == 0) {
				@Pc(1331) Class104 local1331 = local443[local1140];
				local1331.anInt2673 += local1231;
				local1331.anInt2676++;
				local1331.anInt2675 += local803;
				local1331.anInt2668 += local837;
				@Pc(1359) Class104 local1359 = local443[local1145];
				local1359.anInt2673 += local1231;
				local1359.anInt2676++;
				local1359.anInt2675 += local803;
				local1359.anInt2668 += local837;
				@Pc(1387) Class104 local1387 = local443[local1150];
				local1387.anInt2676++;
				local1387.anInt2673 += local1231;
				local1387.anInt2675 += local803;
				local1387.anInt2668 += local837;
			} else if (local1325 == 1) {
				@Pc(1424) Class17 local1424 = local1131[local1133] = new Class17();
				local1424.anInt378 = local803;
				local1424.anInt377 = local837;
				local1424.anInt379 = local1231;
			}
		}
		@Pc(1450) int local1450;
		for (@Pc(1444) int local1444 = 0; local1444 < this.anInt6799; local1444++) {
			local1450 = local113[local1444];
			@Pc(1457) int local1457 = arg1.aShortArray24[local1450] & 0xFFFF;
			@Pc(1465) short local1465;
			if (arg1.aShortArray19 == null) {
				local1465 = -1;
			} else {
				local1465 = arg1.aShortArray19[local1450];
			}
			if (arg1.aByteArray20 == null) {
				local1172 = -1;
			} else {
				local1172 = arg1.aByteArray20[local1450];
			}
			if (arg1.aByteArray21 == null) {
				local750 = 0;
			} else {
				local750 = arg1.aByteArray21[local1450] & 0xFF;
			}
			@Pc(1497) float local1497 = 0.0F;
			@Pc(1499) float local1499 = 0.0F;
			@Pc(1501) float local1501 = 0.0F;
			local1010 = 0.0F;
			local1003 = 0.0F;
			local1012 = 0.0F;
			@Pc(1509) byte local1509 = 0;
			@Pc(1511) byte local1511 = 0;
			@Pc(1513) int local1513 = 0;
			@Pc(1548) byte local1548;
			@Pc(1565) short local1565;
			@Pc(1570) short local1570;
			@Pc(1575) short local1575;
			if (local1465 != -1) {
				if (local1172 == -1) {
					local1012 = 0.0F;
					local1497 = 0.0F;
					local1501 = 1.0F;
					local1509 = 1;
					local1003 = 0.0F;
					local1010 = 1.0F;
					local1511 = 2;
					local1499 = 1.0F;
				} else {
					local1172 &= 0xFF;
					local1548 = arg1.aByteArray19[local1172];
					@Pc(1555) short local1555;
					@Pc(1560) short local1560;
					@Pc(1598) float local1598;
					@Pc(1606) float local1606;
					@Pc(1615) float local1615;
					@Pc(1697) float local1697;
					@Pc(1706) float local1706;
					@Pc(1715) float local1715;
					@Pc(1723) float local1723;
					@Pc(1732) float local1732;
					@Pc(1740) float local1740;
					if (local1548 == 0) {
						local1555 = arg1.aShortArray17[local1450];
						local1560 = arg1.aShortArray25[local1450];
						local1565 = arg1.aShortArray20[local1450];
						local1570 = arg1.aShortArray21[local1172];
						local1575 = arg1.aShortArray23[local1172];
						@Pc(1580) short local1580 = arg1.aShortArray22[local1172];
						@Pc(1586) float local1586 = (float) arg1.anIntArray128[local1570];
						@Pc(1592) float local1592 = (float) arg1.anIntArray130[local1570];
						local1598 = arg1.anIntArray129[local1570];
						local1606 = (float) arg1.anIntArray128[local1575] - local1586;
						local1615 = (float) arg1.anIntArray130[local1575] - local1592;
						@Pc(1623) float local1623 = (float) arg1.anIntArray129[local1575] - local1598;
						@Pc(1631) float local1631 = (float) arg1.anIntArray128[local1580] - local1586;
						@Pc(1640) float local1640 = (float) arg1.anIntArray130[local1580] - local1592;
						@Pc(1648) float local1648 = (float) arg1.anIntArray129[local1580] - local1598;
						@Pc(1656) float local1656 = (float) arg1.anIntArray128[local1555] - local1586;
						@Pc(1664) float local1664 = (float) arg1.anIntArray130[local1555] - local1592;
						@Pc(1672) float local1672 = (float) arg1.anIntArray129[local1555] - local1598;
						@Pc(1680) float local1680 = (float) arg1.anIntArray128[local1560] - local1586;
						@Pc(1688) float local1688 = (float) arg1.anIntArray130[local1560] - local1592;
						local1697 = (float) arg1.anIntArray129[local1560] - local1598;
						local1706 = (float) arg1.anIntArray128[local1565] - local1586;
						local1715 = (float) arg1.anIntArray130[local1565] - local1592;
						local1723 = (float) arg1.anIntArray129[local1565] - local1598;
						local1732 = local1615 * local1648 - local1623 * local1640;
						local1740 = local1623 * local1631 - local1648 * local1606;
						@Pc(1749) float local1749 = local1606 * local1640 - local1631 * local1615;
						@Pc(1757) float local1757 = local1640 * local1749 - local1648 * local1740;
						@Pc(1765) float local1765 = local1648 * local1732 - local1631 * local1749;
						@Pc(1774) float local1774 = local1631 * local1740 - local1640 * local1732;
						@Pc(1788) float local1788 = 1.0F / (local1774 * local1623 + local1765 * local1615 + local1757 * local1606);
						local1003 = local1788 * (local1757 * local1706 + local1765 * local1715 + local1723 * local1774);
						local1497 = local1788 * (local1774 * local1672 + local1765 * local1664 + local1757 * local1656);
						local1501 = local1788 * (local1774 * local1697 + local1688 * local1765 + local1757 * local1680);
						@Pc(1838) float local1838 = local1615 * local1749 - local1623 * local1740;
						@Pc(1847) float local1847 = local1740 * local1606 - local1732 * local1615;
						@Pc(1856) float local1856 = local1732 * local1623 - local1606 * local1749;
						@Pc(1870) float local1870 = 1.0F / (local1856 * local1640 + local1838 * local1631 + local1847 * local1648);
						local1010 = (local1680 * local1838 + local1856 * local1688 + local1847 * local1697) * local1870;
						local1012 = (local1723 * local1847 + local1706 * local1838 + local1715 * local1856) * local1870;
						local1499 = local1870 * (local1664 * local1856 + local1656 * local1838 + local1672 * local1847);
					} else {
						local1555 = arg1.aShortArray17[local1450];
						local1560 = arg1.aShortArray25[local1450];
						local1565 = arg1.aShortArray20[local1450];
						@Pc(1933) int local1933 = local718[local1172];
						@Pc(1937) int local1937 = local720[local1172];
						@Pc(1941) int local1941 = local722[local1172];
						@Pc(1945) float[] local1945 = local724[local1172];
						@Pc(1950) byte local1950 = arg1.aByteArray17[local1172];
						local1598 = (float) arg1.anIntArray127[local1172] / 256.0F;
						if (local1548 == 1) {
							local1606 = (float) arg1.anIntArray126[local1172] / 1024.0F;
							Static388.method5381(local1941, local1950, local1933, arg1.anIntArray129[local1555], local1598, local1945, local1937, arg1.anIntArray130[local1555], arg1.anIntArray128[local1555], local1606);
							local1499 = Static141.aFloat92;
							local1497 = Static19.aFloat5;
							Static388.method5381(local1941, local1950, local1933, arg1.anIntArray129[local1560], local1598, local1945, local1937, arg1.anIntArray130[local1560], arg1.anIntArray128[local1560], local1606);
							local1501 = Static19.aFloat5;
							local1010 = Static141.aFloat92;
							Static388.method5381(local1941, local1950, local1933, arg1.anIntArray129[local1565], local1598, local1945, local1937, arg1.anIntArray130[local1565], arg1.anIntArray128[local1565], local1606);
							local1012 = Static141.aFloat92;
							local1003 = Static19.aFloat5;
							local1615 = local1606 / 2.0F;
							if ((local1950 & 0x1) == 0) {
								if (local1615 < local1003 - local1497) {
									local1003 -= local1606;
									local1511 = 1;
								} else if (local1615 < local1497 - local1003) {
									local1003 += local1606;
									local1511 = 2;
								}
								if (local1615 < local1501 - local1497) {
									local1501 -= local1606;
									local1509 = 1;
								} else if (local1615 < local1497 - local1501) {
									local1509 = 2;
									local1501 += local1606;
								}
							} else {
								if (local1012 - local1499 > local1615) {
									local1511 = 1;
									local1012 -= local1606;
								} else if (local1499 - local1012 > local1615) {
									local1012 += local1606;
									local1511 = 2;
								}
								if (local1615 < local1010 - local1499) {
									local1010 -= local1606;
									local1509 = 1;
								} else if (local1499 - local1010 > local1615) {
									local1509 = 2;
									local1010 += local1606;
								}
							}
						} else if (local1548 == 2) {
							local1606 = (float) arg1.anIntArray134[local1172] / 256.0F;
							local1615 = (float) arg1.anIntArray131[local1172] / 256.0F;
							@Pc(2194) int local2194 = arg1.anIntArray128[local1560] - arg1.anIntArray128[local1555];
							@Pc(2205) int local2205 = arg1.anIntArray130[local1560] - arg1.anIntArray130[local1555];
							@Pc(2215) int local2215 = arg1.anIntArray129[local1560] - arg1.anIntArray129[local1555];
							@Pc(2225) int local2225 = arg1.anIntArray128[local1565] - arg1.anIntArray128[local1555];
							@Pc(2236) int local2236 = arg1.anIntArray130[local1565] - arg1.anIntArray130[local1555];
							@Pc(2247) int local2247 = arg1.anIntArray129[local1565] - arg1.anIntArray129[local1555];
							@Pc(2255) int local2255 = local2247 * local2205 - local2215 * local2236;
							@Pc(2264) int local2264 = local2225 * local2215 - local2247 * local2194;
							@Pc(2272) int local2272 = local2236 * local2194 - local2205 * local2225;
							local1697 = 64.0F / (float) arg1.anIntArray133[local1172];
							local1706 = 64.0F / (float) arg1.anIntArray136[local1172];
							local1715 = 64.0F / (float) arg1.anIntArray126[local1172];
							local1723 = (local1945[2] * (float) local2272 + local1945[0] * (float) local2255 + (float) local2264 * local1945[1]) / local1697;
							local1732 = (local1945[3] * (float) local2255 + (float) local2264 * local1945[4] + local1945[5] * (float) local2272) / local1706;
							local1740 = ((float) local2264 * local1945[7] + local1945[6] * (float) local2255 + (float) local2272 * local1945[8]) / local1715;
							local1513 = Static182.method2625(local1732, local1740, local1723);
							Static377.method5240(local1937, arg1.anIntArray129[local1555], local1598, local1945, local1941, local1950, local1615, local1513, local1933, local1606, arg1.anIntArray130[local1555], arg1.anIntArray128[local1555]);
							local1499 = Static236.aFloat31;
							local1497 = Static213.aFloat28;
							Static377.method5240(local1937, arg1.anIntArray129[local1560], local1598, local1945, local1941, local1950, local1615, local1513, local1933, local1606, arg1.anIntArray130[local1560], arg1.anIntArray128[local1560]);
							local1010 = Static236.aFloat31;
							local1501 = Static213.aFloat28;
							Static377.method5240(local1937, arg1.anIntArray129[local1565], local1598, local1945, local1941, local1950, local1615, local1513, local1933, local1606, arg1.anIntArray130[local1565], arg1.anIntArray128[local1565]);
							local1003 = Static213.aFloat28;
							local1012 = Static236.aFloat31;
						} else if (local1548 == 3) {
							Static78.method1175(local1937, local1933, local1950, arg1.anIntArray129[local1555], local1598, local1941, arg1.anIntArray128[local1555], local1945, arg1.anIntArray130[local1555]);
							local1497 = Static213.aFloat27;
							local1499 = Static396.aFloat90;
							Static78.method1175(local1937, local1933, local1950, arg1.anIntArray129[local1560], local1598, local1941, arg1.anIntArray128[local1560], local1945, arg1.anIntArray130[local1560]);
							local1010 = Static396.aFloat90;
							local1501 = Static213.aFloat27;
							Static78.method1175(local1937, local1933, local1950, arg1.anIntArray129[local1565], local1598, local1941, arg1.anIntArray128[local1565], local1945, arg1.anIntArray130[local1565]);
							local1003 = Static213.aFloat27;
							local1012 = Static396.aFloat90;
							if ((local1950 & 0x1) == 0) {
								if (local1003 - local1497 > 0.5F) {
									local1003--;
									local1511 = 1;
								} else if (local1497 - local1003 > 0.5F) {
									local1003++;
									local1511 = 2;
								}
								if (local1501 - local1497 > 0.5F) {
									local1509 = 1;
									local1501--;
								} else if (local1497 - local1501 > 0.5F) {
									local1501++;
									local1509 = 2;
								}
							} else {
								if (local1010 - local1499 > 0.5F) {
									local1010--;
									local1509 = 1;
								} else if (local1499 - local1010 > 0.5F) {
									local1010++;
									local1509 = 2;
								}
								if (local1012 - local1499 > 0.5F) {
									local1012--;
									local1511 = 1;
								} else if (local1499 - local1012 > 0.5F) {
									local1511 = 2;
									local1012++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray22 == null) {
				local1548 = 0;
			} else {
				local1548 = arg1.aByteArray22[local1450];
			}
			if (local1548 == 0) {
				@Pc(2806) long local2806 = ((long) local750 + (long) (local1513 << 24) + (long) (local1457 << 8) << 32) + (long) (local1172 << 2);
				local1565 = arg1.aShortArray17[local1450];
				local1570 = arg1.aShortArray25[local1450];
				local1575 = arg1.aShortArray20[local1450];
				@Pc(2825) Class104 local2825 = local443[local1565];
				this.aShortArray114[local1444] = this.method5466(local1497, arg1, local2825.anInt2668, local2825.anInt2673, local2806, local1565, local1499, local2825.anInt2676, local2825.anInt2675);
				@Pc(2849) Class104 local2849 = local443[local1570];
				this.aShortArray107[local1444] = this.method5466(local1501, arg1, local2849.anInt2668, local2849.anInt2673, (long) local1509 + local2806, local1570, local1010, local2849.anInt2676, local2849.anInt2675);
				@Pc(2876) Class104 local2876 = local443[local1575];
				this.aShortArray116[local1444] = this.method5466(local1003, arg1, local2876.anInt2668, local2876.anInt2673, local2806 + (long) local1511, local1575, local1012, local2876.anInt2676, local2876.anInt2675);
			} else if (local1548 == 1) {
				@Pc(2667) Class17 local2667 = local1131[local1450];
				@Pc(2711) long local2711 = ((long) (local1513 << 24) + (long) (local1457 << 8) + (long) local750 << 32) + (long) ((local2667.anInt377 + 256 << 22) + (local2667.anInt378 <= 0 ? 2048 : 1024) + (local1172 << 2) + (local2667.anInt379 + 256 << 12));
				this.aShortArray114[local1444] = this.method5466(local1497, arg1, local2667.anInt377, local2667.anInt379, local2711, arg1.aShortArray17[local1450], local1499, 0, local2667.anInt378);
				this.aShortArray107[local1444] = this.method5466(local1501, arg1, local2667.anInt377, local2667.anInt379, local2711 + (long) local1509, arg1.aShortArray25[local1450], local1010, 0, local2667.anInt378);
				this.aShortArray116[local1444] = this.method5466(local1003, arg1, local2667.anInt377, local2667.anInt379, (long) local1511 + local2711, arg1.aShortArray20[local1450], local1012, 0, local2667.anInt378);
			}
			if (arg1.aShortArray19 == null) {
				this.lb[local1444] = -1;
			} else {
				this.lb[local1444] = arg1.aShortArray19[local1450];
			}
			if (arg1.aByteArray21 != null) {
				this.aByteArray83[local1444] = arg1.aByteArray21[local1450];
			}
			if (arg1.aShortArray18 != null) {
				this.aShortArray113[local1444] = arg1.aShortArray18[local1450];
			}
			this.aShortArray115[local1444] = arg1.aShortArray24[local1450];
		}
		local1450 = 0;
		local1150 = -10000;
		for (local1161 = 0; local1161 < this.anInt6818; local1161++) {
			@Pc(2965) short local2965 = this.lb[local1161];
			if (local1150 != local2965) {
				local1450++;
				local1150 = local2965;
			}
		}
		this.anIntArray554 = new int[local1450 + 1];
		local1150 = -10000;
		local1450 = 0;
		for (local1172 = 0; local1172 < this.anInt6818; local1172++) {
			@Pc(2999) short local2999 = this.lb[local1172];
			if (local1150 != local2999) {
				this.anIntArray554[local1450++] = local1172;
				local1150 = local2999;
			}
		}
		this.anIntArray554[local1450] = this.anInt6818;
		Static67.aLongArray1 = null;
		this.aShortArray110 = Static96.method1424(this.anInt6833, this.aShortArray110);
		this.aShortArray112 = Static96.method1424(this.anInt6833, this.aShortArray112);
		this.aShortArray108 = Static96.method1424(this.anInt6833, this.aShortArray108);
		this.aByteArray82 = Static129.method2039(this.aByteArray82, this.anInt6833);
		this.aFloatArray19 = Static237.method3227(this.aFloatArray19, this.anInt6833);
		this.aFloatArray20 = Static237.method3227(this.aFloatArray20, this.anInt6833);
		if (arg1.anIntArray135 != null && Static273.method3912(arg2, this.anInt6823)) {
			this.anIntArrayArray164 = arg1.method1787();
		}
		if (arg1.aClass117Array1 != null && Static70.method1097(this.anInt6823, arg2)) {
			this.anIntArrayArray166 = arg1.method1786();
		}
		if (arg1.anIntArray132 != null && Static271.method3894(this.anInt6823, arg2)) {
			local750 = 0;
			@Pc(3117) int[] local3117 = new int[256];
			for (local788 = 0; local788 < this.anInt6799; local788++) {
				local801 = arg1.anIntArray132[local113[local788]];
				if (local801 >= 0) {
					@Pc(3137) int local3137 = local3117[local801]++;
					if (local801 > local750) {
						local750 = local801;
					}
				}
			}
			this.anIntArrayArray165 = new int[local750 + 1][];
			for (local801 = 0; local801 <= local750; local801++) {
				this.anIntArrayArray165[local801] = new int[local3117[local801]];
				local3117[local801] = 0;
			}
			for (local803 = 0; local803 < this.anInt6799; local803++) {
				local1231 = arg1.anIntArray132[local113[local803]];
				if (local1231 >= 0) {
					this.anIntArrayArray165[local1231][local3117[local1231]++] = local803;
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean460) {
			this.method5467();
		}
		return this.aShort88;
	}

	@OriginalMember(owner = "client!to", name = "MA", descriptor = "()I")
	@Override
	public int MA() {
		if (!this.aBoolean460) {
			this.method5467();
		}
		return this.aShort89;
	}

	@OriginalMember(owner = "client!to", name = "Z", descriptor = "()I")
	@Override
	public int Z() {
		if (!this.aBoolean460) {
			this.method5467();
		}
		return this.aShort92;
	}

	@OriginalMember(owner = "client!to", name = "h", descriptor = "()Z")
	@Override
	protected boolean h() {
		if (this.anIntArrayArray164 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6807; local12++) {
			this.anIntArray553[local12] <<= 0x4;
			this.anIntArray552[local12] <<= 0x4;
			this.anIntArray551[local12] <<= 0x4;
		}
		Static170.anInt3067 = 0;
		Static355.anInt6254 = 0;
		Static139.anInt2569 = 0;
		return true;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIBIIIII)Z")
	private boolean method5461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > arg7 && arg0 > arg7 && arg1 > arg7) {
			return false;
		} else if (arg2 < arg7 && arg0 < arg7 && arg1 < arg7) {
			return false;
		} else if (arg4 < arg5 && arg4 < arg6 && arg4 < arg3) {
			return false;
		} else {
			return arg4 <= arg5 || arg4 <= arg6 || arg4 <= arg3;
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "()[Lclient!ol;")
	@Override
	public Class191[] method6288() {
		return this.aClass191Array3;
	}

	@OriginalMember(owner = "client!to", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	@Override
	public Class2_Sub1_Sub5 EA(@OriginalArg(0) Class2_Sub1_Sub5 arg0) {
		if (this.anInt6833 == 0) {
			return null;
		}
		if (!this.aBoolean460) {
			this.method5467();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass75_Sub2_38.anInt4875 <= 0) {
			local40 = this.aShort91 - (this.aClass75_Sub2_38.anInt4875 * this.aShort90 >> 8) >> this.aClass75_Sub2_38.anInt4859;
			local57 = this.aShort89 - (this.aShort88 * this.aClass75_Sub2_38.anInt4875 >> 8) >> this.aClass75_Sub2_38.anInt4859;
		} else {
			local40 = this.aShort91 - (this.aClass75_Sub2_38.anInt4875 * this.aShort88 >> 8) >> this.aClass75_Sub2_38.anInt4859;
			local57 = this.aShort89 - (this.aShort90 * this.aClass75_Sub2_38.anInt4875 >> 8) >> this.aClass75_Sub2_38.anInt4859;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass75_Sub2_38.anInt4891 > 0) {
			local114 = this.aShort92 - (this.aShort88 * this.aClass75_Sub2_38.anInt4891 >> 8) >> this.aClass75_Sub2_38.anInt4859;
			local131 = this.aShort94 - (this.aShort90 * this.aClass75_Sub2_38.anInt4891 >> 8) >> this.aClass75_Sub2_38.anInt4859;
		} else {
			local114 = this.aShort92 - (this.aClass75_Sub2_38.anInt4891 * this.aShort90 >> 8) >> this.aClass75_Sub2_38.anInt4859;
			local131 = this.aShort94 - (this.aShort88 * this.aClass75_Sub2_38.anInt4891 >> 8) >> this.aClass75_Sub2_38.anInt4859;
		}
		@Pc(174) int local174 = local57 + 1 - local40;
		@Pc(181) int local181 = local131 + 1 - local114;
		@Pc(184) Class2_Sub1_Sub5_Sub1 local184 = (Class2_Sub1_Sub5_Sub1) arg0;
		@Pc(194) Class2_Sub1_Sub5_Sub1 local194;
		if (local184 != null && local184.method5041(local181, local174)) {
			local194 = local184;
			local184.method5042();
		} else {
			local194 = new Class2_Sub1_Sub5_Sub1(this.aClass75_Sub2_38, local174, local181);
		}
		local194.method5043(local114, local131, local57, local40);
		this.method5472(local194);
		return local194;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!to;IZIZLclient!to;)Lclient!e;")
	private Class63 method5462(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class63_Sub2 arg4) {
		arg0.anInt6807 = this.anInt6807;
		arg0.anInt6820 = this.anInt6820;
		arg0.aShort93 = this.aShort93;
		arg0.anInt6799 = this.anInt6799;
		arg0.anInt6833 = this.anInt6833;
		arg0.aShort95 = this.aShort95;
		arg0.aByte83 = 0;
		arg0.anInt6818 = this.anInt6818;
		arg0.anInt6800 = this.anInt6800;
		arg0.anInt6823 = this.anInt6823;
		arg0.anInt6805 = arg1;
		@Pc(59) boolean local59 = Static129.method2037(arg1, this.anInt6823);
		@Pc(65) boolean local65 = Static126.method1971(arg1, this.anInt6823);
		@Pc(71) boolean local71 = Static326.method4644(arg1, this.anInt6823);
		@Pc(77) boolean local77 = local71 | local59 | local65;
		@Pc(178) int local178;
		if (local77) {
			if (!local59) {
				arg0.anIntArray553 = this.anIntArray553;
			} else if (arg4.anIntArray553 == null || this.anInt6807 > arg4.anIntArray553.length) {
				arg0.anIntArray553 = arg4.anIntArray553 = new int[this.anInt6807];
			} else {
				arg0.anIntArray553 = arg4.anIntArray553;
			}
			if (!local65) {
				arg0.anIntArray552 = this.anIntArray552;
			} else if (arg4.anIntArray552 == null || arg4.anIntArray552.length < this.anInt6807) {
				arg0.anIntArray552 = arg4.anIntArray552 = new int[this.anInt6807];
			} else {
				arg0.anIntArray552 = arg4.anIntArray552;
			}
			if (!local71) {
				arg0.anIntArray551 = this.anIntArray551;
			} else if (arg4.anIntArray551 == null || this.anInt6807 > arg4.anIntArray551.length) {
				arg0.anIntArray551 = arg4.anIntArray551 = new int[this.anInt6807];
			} else {
				arg0.anIntArray551 = arg4.anIntArray551;
			}
			for (local178 = 0; local178 < this.anInt6807; local178++) {
				if (local59) {
					arg0.anIntArray553[local178] = this.anIntArray553[local178];
				}
				if (local65) {
					arg0.anIntArray552[local178] = this.anIntArray552[local178];
				}
				if (local71) {
					arg0.anIntArray551[local178] = this.anIntArray551[local178];
				}
			}
		} else {
			arg0.anIntArray553 = this.anIntArray553;
			arg0.anIntArray552 = this.anIntArray552;
			arg0.anIntArray551 = this.anIntArray551;
		}
		if (Static81.method1197(arg1, this.anInt6823)) {
			arg0.aClass47_14 = arg4.aClass47_14;
			if (arg3) {
				arg0.aByte83 = (byte) (arg0.aByte83 | 0x1);
			}
			arg0.aClass47_14.anInterface12_1 = this.aClass47_14.anInterface12_1;
			arg0.aClass47_14.aByte9 = this.aClass47_14.aByte9;
		} else if (Static42.method4657(arg1, this.anInt6823)) {
			arg0.aClass47_14 = this.aClass47_14;
		} else {
			arg0.aClass47_14 = null;
		}
		if (Static298.method4273(this.anInt6823, arg1)) {
			if (arg4.aShortArray115 == null || arg4.aShortArray115.length < this.anInt6799) {
				arg0.aShortArray115 = arg4.aShortArray115 = new short[this.anInt6799];
			} else {
				arg0.aShortArray115 = arg4.aShortArray115;
			}
			for (local178 = 0; local178 < this.anInt6799; local178++) {
				arg0.aShortArray115[local178] = this.aShortArray115[local178];
			}
		} else {
			arg0.aShortArray115 = this.aShortArray115;
		}
		if (Static213.method3021(arg1, this.anInt6823)) {
			if (arg4.aByteArray83 == null || this.anInt6799 > arg4.aByteArray83.length) {
				arg0.aByteArray83 = arg4.aByteArray83 = new byte[this.anInt6799];
			} else {
				arg0.aByteArray83 = arg4.aByteArray83;
			}
			for (local178 = 0; local178 < this.anInt6799; local178++) {
				arg0.aByteArray83[local178] = this.aByteArray83[local178];
			}
		} else {
			arg0.aByteArray83 = this.aByteArray83;
		}
		if (Static296.method4225(this.anInt6823, arg1)) {
			if (arg3) {
				arg0.aByte83 = (byte) (arg0.aByte83 | 0x2);
			}
			arg0.aClass47_13 = arg4.aClass47_13;
			arg0.aClass47_13.aByte9 = this.aClass47_13.aByte9;
			arg0.aClass47_13.anInterface12_1 = this.aClass47_13.anInterface12_1;
		} else if (Static139.method2169(arg1, this.anInt6823)) {
			arg0.aClass47_13 = this.aClass47_13;
		} else {
			arg0.aClass47_13 = null;
		}
		@Pc(554) int local554;
		if (Static140.method2190(this.anInt6823, arg1)) {
			if (arg4.aShortArray110 == null || this.anInt6833 > arg4.aShortArray110.length) {
				local178 = this.anInt6833;
				arg0.aShortArray108 = arg4.aShortArray108 = new short[local178];
				arg0.aShortArray112 = arg4.aShortArray112 = new short[local178];
				arg0.aShortArray110 = arg4.aShortArray110 = new short[local178];
			} else {
				arg0.aShortArray108 = arg4.aShortArray108;
				arg0.aShortArray110 = arg4.aShortArray110;
				arg0.aShortArray112 = arg4.aShortArray112;
			}
			if (this.aClass85_1 == null) {
				for (local178 = 0; local178 < this.anInt6833; local178++) {
					arg0.aShortArray110[local178] = this.aShortArray110[local178];
					arg0.aShortArray112[local178] = this.aShortArray112[local178];
					arg0.aShortArray108[local178] = this.aShortArray108[local178];
				}
			} else {
				if (arg4.aClass85_1 == null) {
					arg4.aClass85_1 = new Class85();
				}
				@Pc(538) Class85 local538 = arg0.aClass85_1 = arg4.aClass85_1;
				if (local538.aShortArray33 == null || local538.aShortArray33.length < this.anInt6833) {
					local554 = this.anInt6833;
					local538.aByteArray25 = new byte[local554];
					local538.aShortArray33 = new short[local554];
					local538.aShortArray32 = new short[local554];
					local538.aShortArray31 = new short[local554];
				}
				for (local554 = 0; local554 < this.anInt6833; local554++) {
					arg0.aShortArray110[local554] = this.aShortArray110[local554];
					arg0.aShortArray112[local554] = this.aShortArray112[local554];
					arg0.aShortArray108[local554] = this.aShortArray108[local554];
					local538.aShortArray33[local554] = this.aClass85_1.aShortArray33[local554];
					local538.aShortArray32[local554] = this.aClass85_1.aShortArray32[local554];
					local538.aShortArray31[local554] = this.aClass85_1.aShortArray31[local554];
					local538.aByteArray25[local554] = this.aClass85_1.aByteArray25[local554];
				}
			}
			arg0.aByteArray82 = this.aByteArray82;
		} else {
			arg0.aClass85_1 = this.aClass85_1;
			arg0.aShortArray110 = this.aShortArray110;
			arg0.aByteArray82 = this.aByteArray82;
			arg0.aShortArray112 = this.aShortArray112;
			arg0.aShortArray108 = this.aShortArray108;
		}
		if (Static7.method94(this.anInt6823, arg1)) {
			if (arg3) {
				arg0.aByte83 = (byte) (arg0.aByte83 | 0x4);
			}
			arg0.aClass47_11 = arg4.aClass47_11;
			arg0.aClass47_11.anInterface12_1 = this.aClass47_11.anInterface12_1;
			arg0.aClass47_11.aByte9 = this.aClass47_11.aByte9;
		} else if (Static380.method5247(arg1, this.anInt6823)) {
			arg0.aClass47_11 = this.aClass47_11;
		} else {
			arg0.aClass47_11 = null;
		}
		if (Static108.method1798(this.anInt6823, arg1)) {
			if (arg4.aFloatArray19 == null || arg4.aFloatArray19.length < this.anInt6799) {
				local178 = this.anInt6833;
				arg0.aFloatArray19 = arg4.aFloatArray19 = new float[local178];
				arg0.aFloatArray20 = arg4.aFloatArray20 = new float[local178];
			} else {
				arg0.aFloatArray20 = arg4.aFloatArray20;
				arg0.aFloatArray19 = arg4.aFloatArray19;
			}
			for (local178 = 0; local178 < this.anInt6833; local178++) {
				arg0.aFloatArray19[local178] = this.aFloatArray19[local178];
				arg0.aFloatArray20[local178] = this.aFloatArray20[local178];
			}
		} else {
			arg0.aFloatArray19 = this.aFloatArray19;
			arg0.aFloatArray20 = this.aFloatArray20;
		}
		if (Static181.method2421(arg1, this.anInt6823)) {
			arg0.aClass47_12 = arg4.aClass47_12;
			if (arg3) {
				arg0.aByte83 = (byte) (arg0.aByte83 | 0x8);
			}
			arg0.aClass47_12.aByte9 = this.aClass47_12.aByte9;
			arg0.aClass47_12.anInterface12_1 = this.aClass47_12.anInterface12_1;
		} else if (Static212.method3007(arg1, this.anInt6823)) {
			arg0.aClass47_12 = this.aClass47_12;
		} else {
			arg0.aClass47_12 = null;
		}
		if (Static330.method4706(arg1, this.anInt6823)) {
			if (arg4.aShortArray114 == null || this.anInt6799 > arg4.aShortArray114.length) {
				local178 = this.anInt6799;
				arg0.aShortArray107 = arg4.aShortArray107 = new short[local178];
				arg0.aShortArray116 = arg4.aShortArray116 = new short[local178];
				arg0.aShortArray114 = arg4.aShortArray114 = new short[local178];
			} else {
				arg0.aShortArray116 = arg4.aShortArray116;
				arg0.aShortArray107 = arg4.aShortArray107;
				arg0.aShortArray114 = arg4.aShortArray114;
			}
			for (local178 = 0; local178 < this.anInt6799; local178++) {
				arg0.aShortArray114[local178] = this.aShortArray114[local178];
				arg0.aShortArray107[local178] = this.aShortArray107[local178];
				arg0.aShortArray116[local178] = this.aShortArray116[local178];
			}
		} else {
			arg0.aShortArray116 = this.aShortArray116;
			arg0.aShortArray107 = this.aShortArray107;
			arg0.aShortArray114 = this.aShortArray114;
		}
		if (Static283.method4019(this.anInt6823, arg1)) {
			arg0.aClass144_1 = arg4.aClass144_1;
			if (arg3) {
				arg0.aByte83 = (byte) (arg0.aByte83 | 0x10);
			}
			arg0.aClass144_1.anInterface11_1 = this.aClass144_1.anInterface11_1;
		} else if (Static368.method6261(arg1, this.anInt6823)) {
			arg0.aClass144_1 = this.aClass144_1;
		} else {
			arg0.aClass144_1 = null;
		}
		if (Static97.method1427(arg1, this.anInt6823)) {
			if (arg4.lb == null || this.anInt6799 > arg4.lb.length) {
				local178 = this.anInt6799;
				arg0.lb = arg4.lb = new short[local178];
			} else {
				arg0.lb = arg4.lb;
			}
			for (local178 = 0; local178 < this.anInt6799; local178++) {
				arg0.lb[local178] = this.lb[local178];
			}
		} else {
			arg0.lb = this.lb;
		}
		if (!Static213.method3024(arg1, this.anInt6823)) {
			arg0.aClass239Array1 = this.aClass239Array1;
		} else if (arg4.aClass239Array1 == null || arg4.aClass239Array1.length < this.anInt6820) {
			local178 = this.anInt6820;
			arg0.aClass239Array1 = arg4.aClass239Array1 = new Class239[local178];
			for (local554 = 0; local554 < this.anInt6820; local554++) {
				arg0.aClass239Array1[local554] = this.aClass239Array1[local554].method5438();
			}
		} else {
			arg0.aClass239Array1 = arg4.aClass239Array1;
			for (local178 = 0; local178 < this.anInt6820; local178++) {
				arg0.aClass239Array1[local178].method5439(this.aClass239Array1[local178]);
			}
		}
		arg0.aClass254Array3 = this.aClass254Array3;
		arg0.anIntArray550 = this.anIntArray550;
		arg0.anIntArray554 = this.anIntArray554;
		arg0.anIntArrayArray166 = this.anIntArrayArray166;
		arg0.aClass191Array3 = this.aClass191Array3;
		arg0.aShortArray113 = this.aShortArray113;
		if (this.aBoolean460) {
			arg0.aShort94 = this.aShort94;
			arg0.aShort89 = this.aShort89;
			arg0.aShort92 = this.aShort92;
			arg0.aShort90 = this.aShort90;
			arg0.aShort88 = this.aShort88;
			arg0.aShort87 = this.aShort87;
			arg0.aBoolean460 = true;
			arg0.aShort91 = this.aShort91;
		} else {
			arg0.aBoolean460 = false;
		}
		arg0.anIntArrayArray165 = this.anIntArrayArray165;
		arg0.aClass258Array1 = this.aClass258Array1;
		arg0.anIntArrayArray164 = this.anIntArrayArray164;
		arg0.aShortArray111 = this.aShortArray111;
		arg0.aShortArray109 = this.aShortArray109;
		return arg0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt6799; local7++) {
			local16 = this.aShortArray115[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			@Pc(61) int local61 = local16 & 0x7F;
			if (arg2 != -1) {
				local61 += (arg2 - local61) * arg3 >> 7;
			}
			this.aShortArray115[local7] = (short) (local22 << 10 | local28 << 7 | local61);
		}
		if (this.aClass258Array1 != null) {
			for (local16 = 0; local16 < this.anInt6820; local16++) {
				@Pc(110) Class258 local110 = this.aClass258Array1[local16];
				@Pc(115) Class239 local115 = this.aClass239Array1[local16];
				local115.anInt6768 = Static64.anIntArray85[this.aShortArray115[local110.anInt7257] & 0xFFFF] & 0xFFFFFF | local115.anInt6768 & 0xFF000000;
			}
		}
		if (this.aClass47_13 != null) {
			this.aClass47_13.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "S", descriptor = "()I")
	@Override
	public int S() {
		if (!this.aBoolean460) {
			this.method5467();
		}
		return this.aShort94;
	}

	@OriginalMember(owner = "client!to", name = "K", descriptor = "(I)V")
	@Override
	public void K(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class229.anIntArray537[arg0];
		@Pc(13) int local13 = Class229.anIntArray536[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6800; local15++) {
			@Pc(34) int local34 = this.anIntArray552[local15] * local9 + this.anIntArray553[local15] * local13 >> 15;
			this.anIntArray552[local15] = this.anIntArray552[local15] * local13 - local9 * this.anIntArray553[local15] >> 15;
			this.anIntArray553[local15] = local34;
		}
		this.aBoolean460 = false;
		if (this.aClass47_14 != null) {
			this.aClass47_14.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V")
	private void method5464() {
		if (this.aClass258Array1 == null) {
			return;
		}
		@Pc(16) Class6_Sub2 local16 = this.aClass75_Sub2_38.aClass6_Sub2_2;
		@Pc(20) float local20 = this.aClass75_Sub2_38.aa();
		@Pc(24) float local24 = this.aClass75_Sub2_38.T();
		this.aClass75_Sub2_38.method3874();
		this.aClass75_Sub2_38.method5971(false);
		this.aClass75_Sub2_38.method3808(false);
		this.aClass75_Sub2_38.method3852(null, this.aClass75_Sub2_38.aClass47_5, this.aClass75_Sub2_38.aClass47_6, null);
		for (@Pc(51) int local51 = 0; local51 < this.anInt6820; local51++) {
			@Pc(58) Class258 local58 = this.aClass258Array1[local51];
			@Pc(63) Class239 local63 = this.aClass239Array1[local51];
			if (!local58.aBoolean494 || !this.aClass75_Sub2_38.method5972()) {
				@Pc(91) float local91 = (float) (this.anIntArray553[local58.anInt7256] + this.anIntArray553[local58.anInt7258] + this.anIntArray553[local58.anInt7262]) * 0.3333333F;
				@Pc(113) float local113 = (float) (this.anIntArray552[local58.anInt7256] + this.anIntArray552[local58.anInt7258] + this.anIntArray552[local58.anInt7262]) * 0.3333333F;
				@Pc(134) float local134 = (float) (this.anIntArray551[local58.anInt7256] + this.anIntArray551[local58.anInt7262] + this.anIntArray551[local58.anInt7258]) * 0.3333333F;
				@Pc(148) float local148 = Static238.aFloat32 + local134 * Static35.aFloat8 + local91 * Static93.aFloat12 + local113 * Static211.aFloat26;
				@Pc(162) float local162 = Static163.aFloat22 + Static350.aFloat80 * local134 + local91 * Static117.aFloat17 + local113 * Static64.aFloat10;
				@Pc(176) float local176 = Static31.aFloat24 + local113 * Static323.aFloat79 + Static158.aFloat19 * local91 + Static244.aFloat35 * local134;
				local16.method3925(-local176, local63.anInt6771, local63.anInt6769 * local58.aShort103 >> 7, (float) local63.anInt6775 - local162, local63.anInt6770 * local58.aShort104 >> 7, (float) local63.anInt6772 + local148);
				this.aClass75_Sub2_38.method3837(local16);
				this.aClass75_Sub2_38.da(local24, local20 - (float) local58.anInt7263 * 1.5F);
				@Pc(226) int local226 = local63.anInt6768;
				OpenGL.glColor4ub((byte) (local226 >> 16), (byte) (local226 >> 8), (byte) local226, (byte) (local226 >> 24));
				this.aClass75_Sub2_38.method3857(local58.aShort102);
				this.aClass75_Sub2_38.method3870(local58.aByte99);
				this.aClass75_Sub2_38.method3798(local58.aByte98);
				this.aClass75_Sub2_38.method3871(4);
			}
		}
		this.aClass75_Sub2_38.da(local24, local20);
		this.aClass75_Sub2_38.method5971(true);
		this.aClass75_Sub2_38.method3845();
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	private void method5465() {
		if (this.anInt6818 == 0) {
			return;
		}
		if (this.aByte83 != 0) {
			this.method5470(true);
		}
		this.method5470(false);
		if (this.aClass144_1 != null) {
			if (this.aClass144_1.anInterface11_1 == null) {
				this.method5469((this.aByte83 & 0x10) != 0);
			}
			if (this.aClass144_1.anInterface11_1 != null) {
				this.aClass75_Sub2_38.method3808(this.aClass47_11 != null);
				this.aClass75_Sub2_38.method3852(this.aClass47_13, this.aClass47_14, this.aClass47_12, this.aClass47_11);
				@Pc(76) int local76 = this.anIntArray554.length - 1;
				for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
					@Pc(85) int local85 = this.anIntArray554[local78];
					@Pc(92) int local92 = this.anIntArray554[local78 + 1];
					@Pc(99) int local99 = this.lb[local85] & 0xFFFF;
					if (local99 == 65535) {
						local99 = -1;
					}
					this.aClass75_Sub2_38.method3801(this.aClass47_11 != null, local99);
					this.aClass75_Sub2_38.method3841(this.aClass144_1.anInterface11_1, local85 * 3, (local92 - local85) * 3);
				}
			}
		}
		this.method5476();
	}

	@OriginalMember(owner = "client!to", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class229.anIntArray537[arg0];
		@Pc(13) int local13 = Class229.anIntArray536[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6800; local15++) {
			@Pc(34) int local34 = this.anIntArray552[local15] * local13 - local9 * this.anIntArray551[local15] >> 15;
			this.anIntArray551[local15] = this.anIntArray551[local15] * local13 + this.anIntArray552[local15] * local9 >> 15;
			this.anIntArray552[local15] = local34;
		}
		if (this.aClass47_14 != null) {
			this.aClass47_14.anInterface12_1 = null;
		}
		this.aBoolean460 = false;
	}

	@OriginalMember(owner = "client!to", name = "ta", descriptor = "()I")
	@Override
	public int ta() {
		if (!this.aBoolean460) {
			this.method5467();
		}
		return this.aShort91;
	}

	@OriginalMember(owner = "client!to", name = "va", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			local24 = 0;
			Static170.anInt3067 = 0;
			Static139.anInt2569 = 0;
			Static355.anInt6254 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray164.length > local38) {
					local48 = this.anIntArrayArray164[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static355.anInt6254 += this.anIntArray553[local56];
						Static170.anInt3067 += this.anIntArray552[local56];
						local24++;
						Static139.anInt2569 += this.anIntArray551[local56];
					}
				}
			}
			if (local24 > 0) {
				Static355.anInt6254 = Static355.anInt6254 / local24 + local14;
				Static170.anInt3067 = local18 + Static170.anInt3067 / local24;
				Static139.anInt2569 = local22 + Static139.anInt2569 / local24;
			} else {
				Static139.anInt2569 = local22;
				Static170.anInt3067 = local18;
				Static355.anInt6254 = local14;
			}
			return;
		}
		@Pc(157) int[] local157;
		@Pc(159) int local159;
		if (arg0 == 1) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray164.length) {
					local157 = this.anIntArrayArray164[local32];
					for (local159 = 0; local159 < local157.length; local159++) {
						local50 = local157[local159];
						this.anIntArray553[local50] += local14;
						this.anIntArray552[local50] += local18;
						this.anIntArray551[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(279) int local279;
		@Pc(298) int local298;
		@Pc(755) int local755;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray164.length) {
					local157 = this.anIntArrayArray164[local32];
					if ((arg5 & 0x1) == 0) {
						for (local159 = 0; local159 < local157.length; local159++) {
							local50 = local157[local159];
							this.anIntArray553[local50] -= Static355.anInt6254;
							this.anIntArray552[local50] -= Static170.anInt3067;
							this.anIntArray551[local50] -= Static139.anInt2569;
							if (arg4 != 0) {
								local56 = Class229.anIntArray537[arg4];
								local279 = Class229.anIntArray536[arg4];
								local298 = local56 * this.anIntArray552[local50] + this.anIntArray553[local50] * local279 + 32767 >> 15;
								this.anIntArray552[local50] = local279 * this.anIntArray552[local50] + 32767 - this.anIntArray553[local50] * local56 >> 15;
								this.anIntArray553[local50] = local298;
							}
							if (arg2 != 0) {
								local56 = Class229.anIntArray537[arg2];
								local279 = Class229.anIntArray536[arg2];
								local298 = this.anIntArray552[local50] * local279 + 32767 - local56 * this.anIntArray551[local50] >> 15;
								this.anIntArray551[local50] = local56 * this.anIntArray552[local50] + this.anIntArray551[local50] * local279 + 32767 >> 15;
								this.anIntArray552[local50] = local298;
							}
							if (arg3 != 0) {
								local56 = Class229.anIntArray537[arg3];
								local279 = Class229.anIntArray536[arg3];
								local298 = this.anIntArray551[local50] * local56 + local279 * this.anIntArray553[local50] + 32767 >> 15;
								this.anIntArray551[local50] = this.anIntArray551[local50] * local279 + 32767 - local56 * this.anIntArray553[local50] >> 15;
								this.anIntArray553[local50] = local298;
							}
							this.anIntArray553[local50] += Static355.anInt6254;
							this.anIntArray552[local50] += Static170.anInt3067;
							this.anIntArray551[local50] += Static139.anInt2569;
						}
					} else {
						for (local159 = 0; local159 < local157.length; local159++) {
							local50 = local157[local159];
							this.anIntArray553[local50] -= Static355.anInt6254;
							this.anIntArray552[local50] -= Static170.anInt3067;
							this.anIntArray551[local50] -= Static139.anInt2569;
							if (arg2 != 0) {
								local56 = Class229.anIntArray537[arg2];
								local279 = Class229.anIntArray536[arg2];
								local298 = this.anIntArray552[local50] * local279 + 32767 - local56 * this.anIntArray551[local50] >> 15;
								this.anIntArray551[local50] = this.anIntArray551[local50] * local279 + local56 * this.anIntArray552[local50] + 32767 >> 15;
								this.anIntArray552[local50] = local298;
							}
							if (arg4 != 0) {
								local56 = Class229.anIntArray537[arg4];
								local279 = Class229.anIntArray536[arg4];
								local298 = this.anIntArray552[local50] * local56 + this.anIntArray553[local50] * local279 + 32767 >> 15;
								this.anIntArray552[local50] = local279 * this.anIntArray552[local50] + 32767 - this.anIntArray553[local50] * local56 >> 15;
								this.anIntArray553[local50] = local298;
							}
							if (arg3 != 0) {
								local56 = Class229.anIntArray537[arg3];
								local279 = Class229.anIntArray536[arg3];
								local298 = local56 * this.anIntArray551[local50] + local279 * this.anIntArray553[local50] + 32767 >> 15;
								this.anIntArray551[local50] = local279 * this.anIntArray551[local50] + 32767 - local56 * this.anIntArray553[local50] >> 15;
								this.anIntArray553[local50] = local298;
							}
							this.anIntArray553[local50] += Static355.anInt6254;
							this.anIntArray552[local50] += Static170.anInt3067;
							this.anIntArray551[local50] += Static139.anInt2569;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray164.length > local38) {
						local48 = this.anIntArrayArray164[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local279 = this.anIntArray550[local56];
							local298 = this.anIntArray550[local56 + 1];
							for (local755 = local279; local755 < local298; local755++) {
								@Pc(764) int local764 = this.aShortArray111[local755] - 1;
								if (local764 == -1) {
									break;
								}
								@Pc(777) int local777;
								@Pc(781) int local781;
								@Pc(800) int local800;
								if (arg4 != 0) {
									local777 = Class229.anIntArray537[arg4];
									local781 = Class229.anIntArray536[arg4];
									local800 = local777 * this.aShortArray112[local764] + this.aShortArray110[local764] * local781 + 32767 >> 15;
									this.aShortArray112[local764] = (short) (local781 * this.aShortArray112[local764] + 32767 - local777 * this.aShortArray110[local764] >> 15);
									this.aShortArray110[local764] = (short) local800;
								}
								if (arg2 != 0) {
									local777 = Class229.anIntArray537[arg2];
									local781 = Class229.anIntArray536[arg2];
									local800 = this.aShortArray112[local764] * local781 + 32767 - this.aShortArray108[local764] * local777 >> 15;
									this.aShortArray108[local764] = (short) (this.aShortArray108[local764] * local781 + local777 * this.aShortArray112[local764] + 32767 >> 15);
									this.aShortArray112[local764] = (short) local800;
								}
								if (arg3 != 0) {
									local777 = Class229.anIntArray537[arg3];
									local781 = Class229.anIntArray536[arg3];
									local800 = this.aShortArray108[local764] * local777 + this.aShortArray110[local764] * local781 + 32767 >> 15;
									this.aShortArray108[local764] = (short) (this.aShortArray108[local764] * local781 + 32767 - this.aShortArray110[local764] * local777 >> 15);
									this.aShortArray110[local764] = (short) local800;
								}
							}
						}
					}
				}
				if (this.aClass47_11 == null && this.aClass47_13 != null) {
					this.aClass47_13.anInterface12_1 = null;
				}
				if (this.aClass47_11 != null) {
					this.aClass47_11.anInterface12_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray164.length) {
					local157 = this.anIntArrayArray164[local32];
					for (local159 = 0; local159 < local157.length; local159++) {
						local50 = local157[local159];
						this.anIntArray553[local50] -= Static355.anInt6254;
						this.anIntArray552[local50] -= Static170.anInt3067;
						this.anIntArray551[local50] -= Static139.anInt2569;
						this.anIntArray553[local50] = arg2 * this.anIntArray553[local50] >> 7;
						this.anIntArray552[local50] = this.anIntArray552[local50] * arg3 >> 7;
						this.anIntArray551[local50] = arg4 * this.anIntArray551[local50] >> 7;
						this.anIntArray553[local50] += Static355.anInt6254;
						this.anIntArray552[local50] += Static170.anInt3067;
						this.anIntArray551[local50] += Static139.anInt2569;
					}
				}
			}
		} else {
			@Pc(1216) Class258 local1216;
			@Pc(1221) Class239 local1221;
			if (arg0 == 5) {
				if (this.anIntArrayArray165 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray165.length > local32) {
							local157 = this.anIntArrayArray165[local32];
							for (local159 = 0; local159 < local157.length; local159++) {
								local50 = local157[local159];
								local56 = (this.aByteArray83[local50] & 0xFF) + (arg2 * 8);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray83[local50] = (byte) local56;
							}
							if (local157.length > 0 && this.aClass47_13 != null) {
								this.aClass47_13.anInterface12_1 = null;
							}
						}
					}
					if (this.aClass258Array1 != null) {
						for (local32 = 0; local32 < this.anInt6820; local32++) {
							local1216 = this.aClass258Array1[local32];
							local1221 = this.aClass239Array1[local32];
							local1221.anInt6768 = local1221.anInt6768 & 0xFFFFFF | 255 - (this.aByteArray83[local1216.anInt7257] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1459) Class239 local1459;
				if (arg0 == 8) {
					if (this.anIntArrayArray166 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray166.length > local32) {
								local157 = this.anIntArrayArray166[local32];
								for (local159 = 0; local159 < local157.length; local159++) {
									local1459 = this.aClass239Array1[local157[local159]];
									local1459.anInt6775 += arg3;
									local1459.anInt6772 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray166 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray166.length) {
								local157 = this.anIntArrayArray166[local32];
								for (local159 = 0; local159 < local157.length; local159++) {
									local1459 = this.aClass239Array1[local157[local159]];
									local1459.anInt6769 = local1459.anInt6769 * arg2 >> 7;
									local1459.anInt6770 = local1459.anInt6770 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray166 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray166.length) {
							local157 = this.anIntArrayArray166[local32];
							for (local159 = 0; local159 < local157.length; local159++) {
								local1459 = this.aClass239Array1[local157[local159]];
								local1459.anInt6771 = local1459.anInt6771 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray165 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray165.length) {
						local157 = this.anIntArrayArray165[local32];
						for (local159 = 0; local159 < local157.length; local159++) {
							local50 = local157[local159];
							local56 = this.aShortArray115[local50] & 0xFFFF;
							local279 = local56 >> 10 & 0x3F;
							local298 = local56 >> 7 & 0x7;
							@Pc(1307) int local1307 = arg2 + local279 & 0x3F;
							local298 += arg3 / 4;
							local755 = local56 & 0x7F;
							local755 += arg4;
							if (local298 < 0) {
								local298 = 0;
							} else if (local298 > 7) {
								local298 = 7;
							}
							if (local755 < 0) {
								local755 = 0;
							} else if (local755 > 127) {
								local755 = 127;
							}
							this.aShortArray115[local50] = (short) (local1307 << 10 | local298 << 7 | local755);
						}
						if (local157.length > 0 && this.aClass47_13 != null) {
							this.aClass47_13.anInterface12_1 = null;
						}
					}
				}
				if (this.aClass258Array1 != null) {
					for (local32 = 0; local32 < this.anInt6820; local32++) {
						local1216 = this.aClass258Array1[local32];
						local1221 = this.aClass239Array1[local32];
						local1221.anInt6768 = Static64.anIntArray85[this.aShortArray115[local1216.anInt7257] & 0xFFFF] & 0xFFFFFF | local1221.anInt6768 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "()Z")
	@Override
	public boolean method6280() {
		if (this.lb == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.lb.length; local12++) {
			if (this.lb[local12] != -1 && !this.aClass75_Sub2_38.anInterface7_8.method1168(this.lb[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!to", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt6805;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IFLclient!fc;IIJIFII)S")
	private short method5466(@OriginalArg(1) float arg0, @OriginalArg(2) Class76 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray550[arg5];
		@Pc(17) int local17 = this.anIntArray550[arg5 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray111[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg4 == Static67.aLongArray1[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray111[local19] = (short) (this.anInt6833 + 1);
		Static67.aLongArray1[local19] = arg4;
		this.aShortArray110[this.anInt6833] = (short) arg8;
		this.aShortArray112[this.anInt6833] = (short) arg3;
		this.aShortArray108[this.anInt6833] = (short) arg2;
		this.aByteArray82[this.anInt6833] = (byte) arg7;
		this.aFloatArray19[this.anInt6833] = arg0;
		this.aFloatArray20[this.anInt6833] = arg6;
		return (short) this.anInt6833++;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6800; local3++) {
			if (arg0 != 0) {
				this.anIntArray553[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray552[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray551[local3] += arg2;
			}
		}
		this.aBoolean460 = false;
		if (this.aClass47_14 != null) {
			this.aClass47_14.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "()[Lclient!vc;")
	@Override
	public Class254[] method6291() {
		return this.aClass254Array3;
	}

	@OriginalMember(owner = "client!to", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.aShort93;
	}

	@OriginalMember(owner = "client!to", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aShort93 = (short) arg0;
		if (this.aClass47_13 != null) {
			this.aClass47_13.anInterface12_1 = null;
		}
		if (this.aClass47_11 != null) {
			this.aClass47_11.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "n", descriptor = "(III)V")
	@Override
	public void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6800; local7++) {
			if (arg0 != 128) {
				this.anIntArray553[local7] = this.anIntArray553[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray552[local7] = this.anIntArray552[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray551[local7] = arg2 * this.anIntArray551[local7] >> 7;
			}
		}
		this.aBoolean460 = false;
		if (this.aClass47_14 != null) {
			this.aClass47_14.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "u", descriptor = "(SS)V")
	@Override
	public void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass75_Sub2_38.anInterface7_8;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6799; local11++) {
			if (arg0 == this.lb[local11]) {
				this.lb[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class257 local47 = local9.method1170(arg0 & 0xFFFF);
			local35 = local47.aByte97;
			local37 = local47.aByte93;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class257 local68 = local9.method1170(arg1 & 0xFFFF);
			local57 = local68.aByte93;
			local55 = local68.aByte97;
		}
		if (!(local55 != local35 | local37 != local57)) {
			return;
		}
		if (this.aClass258Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt6820; local97++) {
				@Pc(104) Class258 local104 = this.aClass258Array1[local97];
				@Pc(109) Class239 local109 = this.aClass239Array1[local97];
				local109.anInt6768 = Static64.anIntArray85[this.aShortArray115[local104.anInt7257] & 0xFFFF] & 0xFFFFFF | local109.anInt6768 & 0xFF000000;
			}
		}
		if (this.aClass47_13 != null) {
			this.aClass47_13.anInterface12_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V")
	private void method5467() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt6800; local27++) {
			@Pc(34) int local34 = this.anIntArray553[local27];
			@Pc(39) int local39 = this.anIntArray552[local27];
			if (local39 < local9) {
				local9 = local39;
			}
			if (local19 < local39) {
				local19 = local39;
			}
			if (local7 > local34) {
				local7 = local34;
			}
			@Pc(67) int local67 = this.anIntArray551[local27];
			if (local13 < local34) {
				local13 = local34;
			}
			if (local21 < local67) {
				local21 = local67;
			}
			if (local11 > local67) {
				local11 = local67;
			}
			@Pc(98) int local98 = local67 * local67 + local34 * local34;
			if (local23 < local98) {
				local23 = local98;
			}
			local98 = local34 * local34 + local67 * local67 + local39 * local39;
			if (local25 < local98) {
				local25 = local98;
			}
		}
		this.aShort92 = (short) local11;
		this.aShort90 = (short) local9;
		this.aShort89 = (short) local13;
		this.aShort94 = (short) local21;
		this.aShort88 = (short) local19;
		this.aShort91 = (short) local7;
		this.aShort87 = (short) (Math.sqrt((double) local23) + 0.99D);
		Math.sqrt((double) local25);
		this.aBoolean460 = true;
	}

	@OriginalMember(owner = "client!to", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		return this.aShort95;
	}

	@OriginalMember(owner = "client!to", name = "B", descriptor = "()I")
	@Override
	public int B() {
		if (!this.aBoolean460) {
			this.method5467();
		}
		return this.aShort90;
	}

	@OriginalMember(owner = "client!to", name = "za", descriptor = "(IIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		if (arg0 == 0) {
			local12 = 0;
			Static170.anInt3067 = 0;
			Static139.anInt2569 = 0;
			Static355.anInt6254 = 0;
			for (local20 = 0; local20 < this.anInt6800; local20++) {
				Static355.anInt6254 += this.anIntArray553[local20];
				Static170.anInt3067 += this.anIntArray552[local20];
				Static139.anInt2569 += this.anIntArray551[local20];
				local12++;
			}
			if (local12 > 0) {
				Static355.anInt6254 = Static355.anInt6254 / local12 + arg1;
				Static170.anInt3067 = Static170.anInt3067 / local12 + arg2;
				Static139.anInt2569 = Static139.anInt2569 / local12 + arg3;
			} else {
				Static170.anInt3067 = arg2;
				Static355.anInt6254 = arg1;
				Static139.anInt2569 = arg3;
			}
		} else if (arg0 == 1) {
			for (local12 = 0; local12 < this.anInt6800; local12++) {
				this.anIntArray553[local12] += arg1;
				this.anIntArray552[local12] += arg2;
				this.anIntArray551[local12] += arg3;
			}
		} else {
			@Pc(166) int local166;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local12 = 0; local12 < this.anInt6800; local12++) {
					this.anIntArray553[local12] -= Static355.anInt6254;
					this.anIntArray552[local12] -= Static170.anInt3067;
					this.anIntArray551[local12] -= Static139.anInt2569;
					if (arg3 != 0) {
						local20 = Class229.anIntArray537[arg3];
						local166 = Class229.anIntArray536[arg3];
						local185 = this.anIntArray552[local12] * local20 + this.anIntArray553[local12] * local166 + 32767 >> 15;
						this.anIntArray552[local12] = this.anIntArray552[local12] * local166 + 32767 - this.anIntArray553[local12] * local20 >> 15;
						this.anIntArray553[local12] = local185;
					}
					if (arg1 != 0) {
						local20 = Class229.anIntArray537[arg1];
						local166 = Class229.anIntArray536[arg1];
						local185 = local166 * this.anIntArray552[local12] + 32767 - local20 * this.anIntArray551[local12] >> 15;
						this.anIntArray551[local12] = local20 * this.anIntArray552[local12] + local166 * this.anIntArray551[local12] + 32767 >> 15;
						this.anIntArray552[local12] = local185;
					}
					if (arg2 != 0) {
						local20 = Class229.anIntArray537[arg2];
						local166 = Class229.anIntArray536[arg2];
						local185 = this.anIntArray551[local12] * local20 + this.anIntArray553[local12] * local166 + 32767 >> 15;
						this.anIntArray551[local12] = local166 * this.anIntArray551[local12] + 32767 - this.anIntArray553[local12] * local20 >> 15;
						this.anIntArray553[local12] = local185;
					}
					this.anIntArray553[local12] += Static355.anInt6254;
					this.anIntArray552[local12] += Static170.anInt3067;
					this.anIntArray551[local12] += Static139.anInt2569;
				}
			} else if (arg0 == 3) {
				for (local12 = 0; local12 < this.anInt6800; local12++) {
					this.anIntArray553[local12] -= Static355.anInt6254;
					this.anIntArray552[local12] -= Static170.anInt3067;
					this.anIntArray551[local12] -= Static139.anInt2569;
					this.anIntArray553[local12] = this.anIntArray553[local12] * arg1 / 128;
					this.anIntArray552[local12] = arg2 * this.anIntArray552[local12] / 128;
					this.anIntArray551[local12] = this.anIntArray551[local12] * arg3 / 128;
					this.anIntArray553[local12] += Static355.anInt6254;
					this.anIntArray552[local12] += Static170.anInt3067;
					this.anIntArray551[local12] += Static139.anInt2569;
				}
			} else {
				@Pc(523) Class258 local523;
				@Pc(528) Class239 local528;
				if (arg0 == 5) {
					for (local12 = 0; local12 < this.anInt6799; local12++) {
						local20 = (this.aByteArray83[local12] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray83[local12] = (byte) local20;
					}
					if (this.aClass47_13 != null) {
						this.aClass47_13.anInterface12_1 = null;
					}
					if (this.aClass258Array1 != null) {
						for (local20 = 0; local20 < this.anInt6820; local20++) {
							local523 = this.aClass258Array1[local20];
							local528 = this.aClass239Array1[local20];
							local528.anInt6768 = 255 - (this.aByteArray83[local523.anInt7257] & 0xFF) << 24 | local528.anInt6768 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local12 = 0; local12 < this.anInt6799; local12++) {
						local20 = this.aShortArray115[local12] & 0xFFFF;
						local166 = local20 >> 10 & 0x3F;
						local185 = local20 >> 7 & 0x7;
						@Pc(587) int local587 = local20 & 0x7F;
						local185 += arg2 / 4;
						@Pc(599) int local599 = local166 + arg1 & 0x3F;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local587 += arg3;
						if (local587 < 0) {
							local587 = 0;
						} else if (local587 > 127) {
							local587 = 127;
						}
						this.aShortArray115[local12] = (short) (local599 << 10 | local185 << 7 | local587);
					}
					if (this.aClass47_13 != null) {
						this.aClass47_13.anInterface12_1 = null;
					}
					if (this.aClass258Array1 != null) {
						for (local20 = 0; local20 < this.anInt6820; local20++) {
							local523 = this.aClass258Array1[local20];
							local528 = this.aClass239Array1[local20];
							local528.anInt6768 = Static64.anIntArray85[this.aShortArray115[local523.anInt7257] & 0xFFFF] & 0xFFFFFF | local528.anInt6768 & 0xFF000000;
						}
					}
				} else {
					@Pc(714) Class239 local714;
					if (arg0 == 8) {
						for (local12 = 0; local12 < this.anInt6820; local12++) {
							local714 = this.aClass239Array1[local12];
							local714.anInt6772 += arg1;
							local714.anInt6775 += arg2;
						}
					} else if (arg0 == 10) {
						for (local12 = 0; local12 < this.anInt6820; local12++) {
							local714 = this.aClass239Array1[local12];
							local714.anInt6770 = arg2 * local714.anInt6770 >> 7;
							local714.anInt6769 = arg1 * local714.anInt6769 >> 7;
						}
					} else if (arg0 == 9) {
						for (local12 = 0; local12 < this.anInt6820; local12++) {
							local714 = this.aClass239Array1[local12];
							local714.anInt6771 = local714.anInt6771 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class229.anIntArray537[arg0];
		@Pc(13) int local13 = Class229.anIntArray536[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6800; local15++) {
			local34 = this.anIntArray551[local15] * local9 + local13 * this.anIntArray553[local15] >> 15;
			this.anIntArray551[local15] = this.anIntArray551[local15] * local13 - local9 * this.anIntArray553[local15] >> 15;
			this.anIntArray553[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt6833; local34++) {
			@Pc(88) int local88 = this.aShortArray110[local34] * local13 + local9 * this.aShortArray108[local34] >> 15;
			this.aShortArray108[local34] = (short) (this.aShortArray108[local34] * local13 - this.aShortArray110[local34] * local9 >> 15);
			this.aShortArray110[local34] = (short) local88;
		}
		if (this.aClass47_11 == null && this.aClass47_13 != null) {
			this.aClass47_13.anInterface12_1 = null;
		}
		if (this.aClass47_11 != null) {
			this.aClass47_11.anInterface12_1 = null;
		}
		this.aBoolean460 = false;
		if (this.aClass47_14 != null) {
			this.aClass47_14.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BZ)V")
	private void method5469(@OriginalArg(1) boolean arg0) {
		if (this.aClass75_Sub2_38.aClass2_Sub17_Sub2_1.aByteArray94.length >= this.anInt6818 * 6) {
			this.aClass75_Sub2_38.aClass2_Sub17_Sub2_1.anInt7523 = 0;
		} else {
			this.aClass75_Sub2_38.aClass2_Sub17_Sub2_1 = new Class2_Sub17_Sub2((this.anInt6818 + 100) * 6);
		}
		@Pc(38) Class2_Sub17_Sub2 local38 = this.aClass75_Sub2_38.aClass2_Sub17_Sub2_1;
		@Pc(44) int local44;
		if (this.aClass75_Sub2_38.aBoolean349) {
			for (local44 = 0; local44 < this.anInt6818; local44++) {
				local38.method6130(this.aShortArray114[local44]);
				local38.method6130(this.aShortArray107[local44]);
				local38.method6130(this.aShortArray116[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt6818; local44++) {
				local38.method6160(this.aShortArray114[local44]);
				local38.method6160(this.aShortArray107[local44]);
				local38.method6160(this.aShortArray116[local44]);
			}
		}
		if (local38.anInt7523 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface11_3 == null) {
				this.anInterface11_3 = this.aClass75_Sub2_38.method3818(local38.anInt7523, true, local38.aByteArray94);
			} else {
				this.anInterface11_3.method5887(local38.anInt7523, local38.aByteArray94);
			}
			this.aClass144_1.anInterface11_1 = this.anInterface11_3;
		} else {
			this.aClass144_1.anInterface11_1 = this.aClass75_Sub2_38.method3818(local38.anInt7523, false, local38.aByteArray94);
		}
		if (!arg0) {
			this.aBoolean459 = true;
		}
	}

	@OriginalMember(owner = "client!to", name = "KA", descriptor = "()V")
	@Override
	protected void KA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6807; local7++) {
			this.anIntArray553[local7] = this.anIntArray553[local7] + 7 >> 4;
			this.anIntArray552[local7] = this.anIntArray552[local7] + 7 >> 4;
			this.anIntArray551[local7] = this.anIntArray551[local7] + 7 >> 4;
		}
		this.aBoolean460 = false;
		if (this.aClass47_14 != null) {
			this.aClass47_14.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!c;Lclient!kk;II)V")
	@Override
	public void method6287(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class28_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6833 == 0) {
			return;
		}
		@Pc(16) Class6_Sub2 local16 = this.aClass75_Sub2_38.aClass6_Sub2_4;
		if (!this.aBoolean460) {
			this.method5467();
		}
		@Pc(25) Class6_Sub2 local25 = (Class6_Sub2) arg0;
		Static31.aFloat24 = local16.aFloat59 + local25.aFloat59 * local16.aFloat65 + local25.aFloat60 * local16.aFloat64 + local25.aFloat68 * local16.aFloat69;
		Static323.aFloat79 = local25.aFloat61 * local16.aFloat64 + local25.aFloat67 * local16.aFloat69 + local25.aFloat69 * local16.aFloat65;
		@Pc(72) float local72 = Static31.aFloat24 + Static323.aFloat79 * (float) this.aShort90;
		@Pc(80) float local80 = (float) this.aShort88 * Static323.aFloat79 + Static31.aFloat24;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local96 = local72 + (float) this.aShort87;
			local90 = local80 - (float) this.aShort87;
		} else {
			local90 = local72 - (float) this.aShort87;
			local96 = local80 + (float) this.aShort87;
		}
		if (this.aClass75_Sub2_38.aFloat58 <= local90 || (float) this.aClass75_Sub2_38.anInt4880 >= local96) {
			return;
		}
		Static238.aFloat32 = local16.aFloat60 + local16.aFloat61 * local25.aFloat68 + local16.aFloat63 * local25.aFloat60 + local16.aFloat62 * local25.aFloat59;
		Static211.aFloat26 = local25.aFloat61 * local16.aFloat63 + local25.aFloat67 * local16.aFloat61 + local25.aFloat69 * local16.aFloat62;
		@Pc(172) float local172 = Static211.aFloat26 * (float) this.aShort90 + Static238.aFloat32;
		@Pc(180) float local180 = Static238.aFloat32 + (float) this.aShort88 * Static211.aFloat26;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local180 < local172) {
			local195 = (local180 - (float) this.aShort87) * (float) this.aClass75_Sub2_38.anInt4892;
			local206 = (local172 + (float) this.aShort87) * (float) this.aClass75_Sub2_38.anInt4892;
		} else {
			local206 = (local180 + (float) this.aShort87) * (float) this.aClass75_Sub2_38.anInt4892;
			local195 = (local172 - (float) this.aShort87) * (float) this.aClass75_Sub2_38.anInt4892;
		}
		if (local195 / (float) arg2 >= this.aClass75_Sub2_38.aFloat48 || this.aClass75_Sub2_38.aFloat41 >= local206 / (float) arg2) {
			return;
		}
		Static64.aFloat10 = local25.aFloat69 * local16.aFloat70 + local16.aFloat66 * local25.aFloat61 + local25.aFloat67 * local16.aFloat67;
		Static163.aFloat22 = local16.aFloat70 * local25.aFloat59 + local25.aFloat68 * local16.aFloat67 + local25.aFloat60 * local16.aFloat66 + local16.aFloat68;
		@Pc(297) float local297 = Static163.aFloat22 + Static64.aFloat10 * (float) this.aShort90;
		@Pc(305) float local305 = Static163.aFloat22 + Static64.aFloat10 * (float) this.aShort88;
		@Pc(332) float local332;
		@Pc(320) float local320;
		if (local297 > local305) {
			local332 = (float) this.aClass75_Sub2_38.anInt4895 * ((float) -this.aShort87 + local305);
			local320 = (float) this.aClass75_Sub2_38.anInt4895 * (local297 + (float) this.aShort87);
		} else {
			local320 = (local305 + (float) this.aShort87) * (float) this.aClass75_Sub2_38.anInt4895;
			local332 = (float) this.aClass75_Sub2_38.anInt4895 * ((float) -this.aShort87 + local297);
		}
		if (this.aClass75_Sub2_38.aFloat46 <= local332 / (float) arg2 || local320 / (float) arg2 <= this.aClass75_Sub2_38.aFloat42) {
			return;
		}
		if (arg1 != null || this.aClass258Array1 != null) {
			Static93.aFloat12 = local25.aFloat64 * local16.aFloat62 + local16.aFloat63 * local25.aFloat63 + local25.aFloat66 * local16.aFloat61;
			Static244.aFloat35 = local25.aFloat70 * local16.aFloat69 + local16.aFloat64 * local25.aFloat62 + local16.aFloat65 * local25.aFloat65;
			Static350.aFloat80 = local16.aFloat70 * local25.aFloat65 + local25.aFloat62 * local16.aFloat66 + local25.aFloat70 * local16.aFloat67;
			Static35.aFloat8 = local25.aFloat62 * local16.aFloat63 + local16.aFloat61 * local25.aFloat70 + local16.aFloat62 * local25.aFloat65;
			Static117.aFloat17 = local25.aFloat66 * local16.aFloat67 + local16.aFloat66 * local25.aFloat63 + local16.aFloat70 * local25.aFloat64;
			Static158.aFloat19 = local25.aFloat64 * local16.aFloat65 + local25.aFloat66 * local16.aFloat69 + local25.aFloat63 * local16.aFloat64;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort91 + this.aShort89 >> 1;
			@Pc(510) int local510 = this.aShort92 + this.aShort94 >> 1;
			@Pc(529) int local529 = (int) (Static35.aFloat8 * (float) local510 + Static211.aFloat26 * (float) this.aShort90 + (float) local501 * Static93.aFloat12 + Static238.aFloat32);
			@Pc(548) int local548 = (int) ((float) local510 * Static350.aFloat80 + Static163.aFloat22 + Static117.aFloat17 * (float) local501 + (float) this.aShort90 * Static64.aFloat10);
			@Pc(567) int local567 = (int) (Static323.aFloat79 * (float) this.aShort90 + (float) local501 * Static158.aFloat19 + Static31.aFloat24 + Static244.aFloat35 * (float) local510);
			@Pc(586) int local586 = (int) (Static238.aFloat32 + (float) local501 * Static93.aFloat12 + (float) this.aShort88 * Static211.aFloat26 + Static35.aFloat8 * (float) local510);
			@Pc(605) int local605 = (int) (Static350.aFloat80 * (float) local510 + Static117.aFloat17 * (float) local501 + Static163.aFloat22 + Static64.aFloat10 * (float) this.aShort88);
			@Pc(624) int local624 = (int) ((float) this.aShort88 * Static323.aFloat79 + (float) local501 * Static158.aFloat19 + Static31.aFloat24 + (float) local510 * Static244.aFloat35);
			arg1.anInt3691 = local605 * this.aClass75_Sub2_38.anInt4895 / arg2 + this.aClass75_Sub2_38.anInt4876;
			arg1.anInt3689 = this.aClass75_Sub2_38.anInt4871 + this.aClass75_Sub2_38.anInt4892 * local586 / arg2;
			arg1.anInt3690 = local529 * this.aClass75_Sub2_38.anInt4892 / arg2 + this.aClass75_Sub2_38.anInt4871;
			arg1.anInt3687 = this.aClass75_Sub2_38.anInt4895 * local548 / arg2 + this.aClass75_Sub2_38.anInt4876;
			if (local567 < this.aClass75_Sub2_38.anInt4880 && this.aClass75_Sub2_38.anInt4880 > local624) {
				arg1.anInt3688 = this.aClass75_Sub2_38.anInt4871 + this.aClass75_Sub2_38.anInt4892 * (this.aShort87 + local529) / arg2 - arg1.anInt3690;
				arg1.aBoolean246 = true;
			}
		}
		this.aClass75_Sub2_38.method3861((float) arg2);
		this.aClass75_Sub2_38.method3846();
		this.aClass75_Sub2_38.method3805(local25);
		this.method5465();
		this.aClass75_Sub2_38.method3845();
		this.method5464();
	}

	@OriginalMember(owner = "client!to", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean460) {
			this.method5467();
		}
		@Pc(16) int local16 = this.aShort91 + arg4;
		@Pc(21) int local21 = this.aShort89 + arg4;
		@Pc(26) int local26 = arg6 + this.aShort92;
		@Pc(31) int local31 = arg6 + this.aShort94;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt2818 + local21 >> arg2.anInt2817 >= arg2.anInt2819 || local26 < 0 || local31 + arg2.anInt2818 >> arg2.anInt2817 >= arg2.anInt2816)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt2819 <= local21 + arg3.anInt2818 >> arg3.anInt2817 || local26 < 0 || arg3.anInt2818 + local31 >> arg3.anInt2817 >= arg3.anInt2816) {
				return;
			}
		} else {
			local16 >>= arg2.anInt2817;
			local21 = arg2.anInt2818 + local21 - 1 >> arg2.anInt2817;
			local26 >>= arg2.anInt2817;
			local31 = local31 + arg2.anInt2818 - 1 >> arg2.anInt2817;
			if (arg2.ua(local16, local26) == arg5 && arg2.ua(local21, local26) == arg5 && arg5 == arg2.ua(local16, local31) && arg2.ua(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(190) int local190;
		if (arg0 == 1) {
			for (local190 = 0; local190 < this.anInt6800; local190++) {
				this.anIntArray552[local190] = this.anIntArray552[local190] + arg2.ca(this.anIntArray553[local190] + arg4, arg6 + this.anIntArray551[local190]) - arg5;
			}
		} else {
			@Pc(255) int local255;
			@Pc(263) int local263;
			if (arg0 == 2) {
				@Pc(457) short local457 = this.aShort90;
				if (local457 == 0) {
					return;
				}
				for (local255 = 0; local255 < this.anInt6800; local255++) {
					local263 = (this.anIntArray552[local255] << 16) / local457;
					if (arg1 > local263) {
						this.anIntArray552[local255] += (arg2.ca(arg4 + this.anIntArray553[local255], arg6 + this.anIntArray551[local255]) - arg5) * (arg1 - local263) / arg1;
					}
				}
			} else {
				@Pc(271) int local271;
				if (arg0 == 3) {
					local190 = (arg1 & 0xFF) * 4;
					local255 = (arg1 >> 8 & 0xFF) * 4;
					local263 = (arg1 >> 16 & 0xFF) << 6;
					local271 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local190 >> 1) < 0 || arg2.anInt2819 << arg2.anInt2817 <= (local190 >> 1) + (arg4 + arg2.anInt2818) || arg6 - (local255 >> 1) < 0 || arg2.anInt2816 << arg2.anInt2817 <= arg6 + (local255 >> 1) + arg2.anInt2818) {
						return;
					}
					this.method6286(local263, local271, arg6, arg4, arg5, local255, arg2, local190);
				} else if (arg0 == 4) {
					local190 = this.aShort88 - this.aShort90;
					for (local255 = 0; local255 < this.anInt6800; local255++) {
						this.anIntArray552[local255] = local190 + this.anIntArray552[local255] + arg3.ca(this.anIntArray553[local255] + arg4, arg6 + this.anIntArray551[local255]) - arg5;
					}
				} else if (arg0 == 5) {
					local190 = this.aShort88 - this.aShort90;
					for (local255 = 0; local255 < this.anInt6800; local255++) {
						local263 = arg4 + this.anIntArray553[local255];
						local271 = arg6 + this.anIntArray551[local255];
						@Pc(416) int local416 = arg2.ca(local263, local271);
						@Pc(421) int local421 = arg3.ca(local263, local271);
						@Pc(426) int local426 = local416 - local421;
						this.anIntArray552[local255] = local416 + ((this.anIntArray552[local255] << 8) / local190 * local426 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean460 = false;
		if (this.aClass47_14 != null) {
			this.aClass47_14.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "q", descriptor = "(SS)V")
	@Override
	public void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6799; local7++) {
			if (arg0 == this.aShortArray115[local7]) {
				this.aShortArray115[local7] = arg1;
			}
		}
		if (this.aClass258Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt6820; local34++) {
				@Pc(41) Class258 local41 = this.aClass258Array1[local34];
				@Pc(46) Class239 local46 = this.aClass239Array1[local34];
				local46.anInt6768 = local46.anInt6768 & 0xFF000000 | Static64.anIntArray85[this.aShortArray115[local41.anInt7257] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass47_13 != null) {
			this.aClass47_13.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "k", descriptor = "()I")
	@Override
	public int k() {
		if (!this.aBoolean460) {
			this.method5467();
		}
		return this.aShort87;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!c;Lclient!kk;I)V")
	@Override
	public void method6293(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class28_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6833 == 0) {
			return;
		}
		@Pc(16) Class6_Sub2 local16 = this.aClass75_Sub2_38.aClass6_Sub2_4;
		@Pc(19) Class6_Sub2 local19 = (Class6_Sub2) arg0;
		if (!this.aBoolean460) {
			this.method5467();
		}
		this.method5473(local19);
		Static323.aFloat79 = local16.aFloat65 * local19.aFloat69 + local16.aFloat64 * local19.aFloat61 + local16.aFloat69 * local19.aFloat67;
		Static31.aFloat24 = local16.aFloat65 * local19.aFloat59 + local16.aFloat69 * local19.aFloat68 + local16.aFloat64 * local19.aFloat60 + local16.aFloat59;
		@Pc(76) float local76 = (float) this.aShort90 * Static323.aFloat79 + Static31.aFloat24;
		@Pc(84) float local84 = Static31.aFloat24 + Static323.aFloat79 * (float) this.aShort88;
		@Pc(95) float local95;
		@Pc(101) float local101;
		if (local76 > local84) {
			local95 = (float) -this.aShort87 + local84;
			local101 = (float) this.aShort87 + local76;
		} else {
			local95 = (float) -this.aShort87 + local76;
			local101 = (float) this.aShort87 + local84;
		}
		if (this.aClass75_Sub2_38.aFloat54 <= local95 || local101 <= (float) this.aClass75_Sub2_38.anInt4880) {
			return;
		}
		Static211.aFloat26 = local16.aFloat62 * local19.aFloat69 + local19.aFloat67 * local16.aFloat61 + local19.aFloat61 * local16.aFloat63;
		Static238.aFloat32 = local16.aFloat60 + local19.aFloat59 * local16.aFloat62 + local19.aFloat60 * local16.aFloat63 + local19.aFloat68 * local16.aFloat61;
		@Pc(178) float local178 = (float) this.aShort90 * Static211.aFloat26 + Static238.aFloat32;
		@Pc(186) float local186 = Static238.aFloat32 + Static211.aFloat26 * (float) this.aShort88;
		@Pc(212) float local212;
		@Pc(201) float local201;
		if (local178 > local186) {
			local201 = (local178 + (float) this.aShort87) * (float) this.aClass75_Sub2_38.anInt4892;
			local212 = (local186 - (float) this.aShort87) * (float) this.aClass75_Sub2_38.anInt4892;
		} else {
			local212 = (local178 - (float) this.aShort87) * (float) this.aClass75_Sub2_38.anInt4892;
			local201 = ((float) this.aShort87 + local186) * (float) this.aClass75_Sub2_38.anInt4892;
		}
		if (this.aClass75_Sub2_38.aFloat48 <= local212 / local101 || local201 / local101 <= this.aClass75_Sub2_38.aFloat41) {
			return;
		}
		Static64.aFloat10 = local16.aFloat70 * local19.aFloat69 + local16.aFloat66 * local19.aFloat61 + local19.aFloat67 * local16.aFloat67;
		Static163.aFloat22 = local19.aFloat60 * local16.aFloat66 + local16.aFloat67 * local19.aFloat68 + local19.aFloat59 * local16.aFloat70 + local16.aFloat68;
		@Pc(301) float local301 = Static64.aFloat10 * (float) this.aShort90 + Static163.aFloat22;
		@Pc(309) float local309 = Static163.aFloat22 + (float) this.aShort88 * Static64.aFloat10;
		@Pc(335) float local335;
		@Pc(324) float local324;
		if (local301 > local309) {
			local324 = (float) this.aClass75_Sub2_38.anInt4895 * (local301 + (float) this.aShort87);
			local335 = ((float) -this.aShort87 + local309) * (float) this.aClass75_Sub2_38.anInt4895;
		} else {
			local324 = (float) this.aClass75_Sub2_38.anInt4895 * (local309 + (float) this.aShort87);
			local335 = (float) this.aClass75_Sub2_38.anInt4895 * (local301 - (float) this.aShort87);
		}
		if (local335 / local101 >= this.aClass75_Sub2_38.aFloat46 || this.aClass75_Sub2_38.aFloat42 >= local324 / local101) {
			return;
		}
		if (arg1 != null || this.aClass258Array1 != null) {
			Static117.aFloat17 = local16.aFloat70 * local19.aFloat64 + local19.aFloat63 * local16.aFloat66 + local19.aFloat66 * local16.aFloat67;
			Static35.aFloat8 = local19.aFloat70 * local16.aFloat61 + local19.aFloat62 * local16.aFloat63 + local16.aFloat62 * local19.aFloat65;
			Static158.aFloat19 = local19.aFloat64 * local16.aFloat65 + local16.aFloat64 * local19.aFloat63 + local19.aFloat66 * local16.aFloat69;
			Static93.aFloat12 = local16.aFloat61 * local19.aFloat66 + local16.aFloat63 * local19.aFloat63 + local16.aFloat62 * local19.aFloat64;
			Static244.aFloat35 = local19.aFloat62 * local16.aFloat64 + local16.aFloat69 * local19.aFloat70 + local16.aFloat65 * local19.aFloat65;
			Static350.aFloat80 = local19.aFloat65 * local16.aFloat70 + local19.aFloat70 * local16.aFloat67 + local19.aFloat62 * local16.aFloat66;
		}
		if (arg1 != null) {
			@Pc(495) boolean local495 = false;
			@Pc(497) boolean local497 = true;
			@Pc(505) int local505 = this.aShort89 + this.aShort91 >> 1;
			@Pc(513) int local513 = this.aShort94 + this.aShort92 >> 1;
			@Pc(532) int local532 = (int) (Static238.aFloat32 + (float) local505 * Static93.aFloat12 + Static211.aFloat26 * (float) this.aShort90 + (float) local513 * Static35.aFloat8);
			@Pc(551) int local551 = (int) (Static350.aFloat80 * (float) local513 + (float) local505 * Static117.aFloat17 + Static163.aFloat22 + (float) this.aShort90 * Static64.aFloat10);
			@Pc(570) int local570 = (int) ((float) local513 * Static244.aFloat35 + (float) this.aShort90 * Static323.aFloat79 + (float) local505 * Static158.aFloat19 + Static31.aFloat24);
			if (local570 < this.aClass75_Sub2_38.anInt4880) {
				local495 = true;
			} else {
				arg1.anInt3690 = this.aClass75_Sub2_38.anInt4871 + this.aClass75_Sub2_38.anInt4892 * local532 / local570;
				arg1.anInt3687 = local551 * this.aClass75_Sub2_38.anInt4895 / local570 + this.aClass75_Sub2_38.anInt4876;
			}
			@Pc(625) int local625 = (int) (Static238.aFloat32 + (float) local505 * Static93.aFloat12 + Static211.aFloat26 * (float) this.aShort88 + (float) local513 * Static35.aFloat8);
			@Pc(644) int local644 = (int) (Static163.aFloat22 + (float) local505 * Static117.aFloat17 + Static64.aFloat10 * (float) this.aShort88 + (float) local513 * Static350.aFloat80);
			@Pc(663) int local663 = (int) ((float) this.aShort88 * Static323.aFloat79 + Static31.aFloat24 + Static158.aFloat19 * (float) local505 + Static244.aFloat35 * (float) local513);
			if (this.aClass75_Sub2_38.anInt4880 <= local663) {
				arg1.anInt3691 = local644 * this.aClass75_Sub2_38.anInt4895 / local663 + this.aClass75_Sub2_38.anInt4876;
				arg1.anInt3689 = this.aClass75_Sub2_38.anInt4871 + this.aClass75_Sub2_38.anInt4892 * local625 / local663;
			} else {
				local495 = true;
			}
			if (local495) {
				if (local570 < this.aClass75_Sub2_38.anInt4880 && local663 < this.aClass75_Sub2_38.anInt4880) {
					local497 = false;
				} else {
					@Pc(747) int local747;
					@Pc(759) int local759;
					@Pc(786) int local786;
					if (this.aClass75_Sub2_38.anInt4880 > local570) {
						local747 = (local663 - this.aClass75_Sub2_38.anInt4880 << 16) / (local663 - local570);
						local759 = local625 + (local747 * (local625 - local532) >> 16);
						local786 = local644 + ((local644 - local551) * local747 >> 16);
						arg1.anInt3690 = local759 * this.aClass75_Sub2_38.anInt4892 / this.aClass75_Sub2_38.anInt4880 + this.aClass75_Sub2_38.anInt4871;
						arg1.anInt3687 = this.aClass75_Sub2_38.anInt4876 + this.aClass75_Sub2_38.anInt4895 * local786 / this.aClass75_Sub2_38.anInt4880;
					} else if (local663 < this.aClass75_Sub2_38.anInt4880) {
						local747 = (local570 - this.aClass75_Sub2_38.anInt4880 << 16) / (local570 - local663);
						local759 = local532 + ((local532 - local625) * local747 >> 16);
						arg1.anInt3690 = local759 * this.aClass75_Sub2_38.anInt4892 / this.aClass75_Sub2_38.anInt4880 + this.aClass75_Sub2_38.anInt4871;
						local786 = local551 + (local747 * (local551 - local644) >> 16);
						arg1.anInt3687 = this.aClass75_Sub2_38.anInt4876 + this.aClass75_Sub2_38.anInt4895 * local786 / this.aClass75_Sub2_38.anInt4880;
					}
				}
			}
			if (local497) {
				if (local663 < local570) {
					arg1.anInt3688 = this.aClass75_Sub2_38.anInt4871 + (local532 + this.aShort87) * this.aClass75_Sub2_38.anInt4892 / local570 - arg1.anInt3690;
				} else {
					arg1.anInt3688 = this.aClass75_Sub2_38.anInt4871 + this.aClass75_Sub2_38.anInt4892 * (this.aShort87 + local625) / local663 - arg1.anInt3689;
				}
				arg1.aBoolean246 = true;
			}
		}
		this.aClass75_Sub2_38.method3863();
		this.aClass75_Sub2_38.method3805(local19);
		this.method5465();
		this.aClass75_Sub2_38.method3845();
		this.method5464();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZB)V")
	private void method5470(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass47_13 != null && this.aClass47_13.anInterface12_1 == null;
		@Pc(27) boolean local27 = this.aClass47_11 != null && this.aClass47_11.anInterface12_1 == null;
		@Pc(38) boolean local38 = this.aClass47_14 != null && this.aClass47_14.anInterface12_1 == null;
		@Pc(49) boolean local49 = this.aClass47_12 != null && this.aClass47_12.anInterface12_1 == null;
		if (arg0) {
			local49 &= (this.aByte83 & 0x8) != 0;
			local27 &= (this.aByte83 & 0x4) != 0;
			local38 &= (this.aByte83 & 0x1) != 0;
			local16 &= (this.aByte83 & 0x2) != 0;
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
		if (this.aClass75_Sub2_38.aClass2_Sub17_Sub2_1.aByteArray94.length >= this.anInt6833 * local100) {
			this.aClass75_Sub2_38.aClass2_Sub17_Sub2_1.anInt7523 = 0;
		} else {
			this.aClass75_Sub2_38.aClass2_Sub17_Sub2_1 = new Class2_Sub17_Sub2(local100 * (this.anInt6833 + 100));
		}
		@Pc(183) Class2_Sub17_Sub2 local183 = this.aClass75_Sub2_38.aClass2_Sub17_Sub2_1;
		@Pc(191) int local191;
		@Pc(200) int local200;
		@Pc(228) int local228;
		@Pc(237) int local237;
		if (local38) {
			@Pc(207) int local207;
			@Pc(214) int local214;
			@Pc(219) int local219;
			@Pc(226) int local226;
			if (this.aClass75_Sub2_38.aBoolean349) {
				for (local191 = 0; local191 < this.anInt6800; local191++) {
					local200 = NativeStream.floatToRawIntBits((float) this.anIntArray553[local191]);
					local207 = NativeStream.floatToRawIntBits((float) this.anIntArray552[local191]);
					local214 = NativeStream.floatToRawIntBits((float) this.anIntArray551[local191]);
					local219 = this.anIntArray550[local191];
					local226 = this.anIntArray550[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray111[local228] - 1;
						if (local237 == -1) {
							break;
						}
						local183.anInt7523 = local237 * local100;
						local183.method6170(local200);
						local183.method6170(local207);
						local183.method6170(local214);
					}
				}
			} else {
				for (local191 = 0; local191 < this.anInt6800; local191++) {
					local200 = NativeStream.floatToRawIntBits((float) this.anIntArray553[local191]);
					local207 = NativeStream.floatToRawIntBits((float) this.anIntArray552[local191]);
					local214 = NativeStream.floatToRawIntBits((float) this.anIntArray551[local191]);
					local219 = this.anIntArray550[local191];
					local226 = this.anIntArray550[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray111[local228] - 1;
						if (local237 == -1) {
							break;
						}
						local183.anInt7523 = local237 * local100;
						local183.method6155(local200);
						local183.method6155(local207);
						local183.method6155(local214);
					}
				}
			}
		}
		@Pc(475) float local475;
		@Pc(382) short[] local382;
		@Pc(373) short[] local373;
		@Pc(379) short[] local379;
		@Pc(376) byte[] local376;
		@Pc(533) float local533;
		if (local16) {
			if (this.aClass47_11 == null) {
				if (this.aClass85_1 == null) {
					local373 = this.aShortArray112;
					local376 = this.aByteArray82;
					local379 = this.aShortArray108;
					local382 = this.aShortArray110;
				} else {
					local376 = this.aClass85_1.aByteArray25;
					local382 = this.aClass85_1.aShortArray33;
					local379 = this.aClass85_1.aShortArray31;
					local373 = this.aClass85_1.aShortArray32;
				}
				@Pc(406) float local406 = this.aClass75_Sub2_38.aFloatArray9[0];
				@Pc(412) float local412 = this.aClass75_Sub2_38.aFloatArray9[1];
				@Pc(418) float local418 = this.aClass75_Sub2_38.aFloatArray9[2];
				@Pc(422) float local422 = this.aClass75_Sub2_38.aFloat57;
				@Pc(432) float local432 = this.aClass75_Sub2_38.aFloat55 * 768.0F / (float) this.aShort93;
				@Pc(442) float local442 = this.aClass75_Sub2_38.aFloat47 * 768.0F / (float) this.aShort93;
				for (@Pc(444) int local444 = 0; local444 < this.anInt6799; local444++) {
					@Pc(464) int local464 = this.method5475(this.lb[local444], this.aShort95, this.aByteArray83[local444], this.aShortArray115[local444]);
					local475 = this.aClass75_Sub2_38.aFloat40 * (float) (local464 >> 16 & 0xFF);
					@Pc(480) short local480 = this.aShortArray114[local444];
					@Pc(489) float local489 = this.aClass75_Sub2_38.aFloat56 * (float) (local464 >>> 24);
					@Pc(500) float local500 = (float) (local464 >> 8 & 0xFF) * this.aClass75_Sub2_38.aFloat45;
					@Pc(505) short local505 = (short) local376[local480];
					if (local505 == 0) {
						local533 = (local412 * (float) local373[local480] + (float) local382[local480] * local406 + (float) local379[local480] * local418) * 0.0026041667F;
					} else {
						local533 = (local406 * (float) local382[local480] + local412 * (float) local373[local480] + (float) local379[local480] * local418) / (float) (local505 * 256);
					}
					@Pc(573) float local573 = local533 * (local533 < 0.0F ? local442 : local432) + local422;
					@Pc(578) int local578 = (int) (local573 * local489);
					if (local578 < 0) {
						local578 = 0;
					} else if (local578 > 255) {
						local578 = 255;
					}
					@Pc(599) int local599 = (int) (local475 * local573);
					if (local599 < 0) {
						local599 = 0;
					} else if (local599 > 255) {
						local599 = 255;
					}
					@Pc(620) int local620 = (int) (local573 * local500);
					if (local620 < 0) {
						local620 = 0;
					} else if (local620 > 255) {
						local620 = 255;
					}
					local183.anInt7523 = local480 * local100 + local104;
					local183.method6172(local578);
					local183.method6172(local599);
					local183.method6172(local620);
					local183.method6172(255 - (this.aByteArray83[local444] & 0xFF));
					local480 = this.aShortArray107[local444];
					local505 = local376[local480];
					if (local505 == 0) {
						local533 = (local418 * (float) local379[local480] + local412 * (float) local373[local480] + local406 * (float) local382[local480]) * 0.0026041667F;
					} else {
						local533 = ((float) local379[local480] * local418 + (float) local382[local480] * local406 + (float) local373[local480] * local412) / (float) (local505 * 256);
					}
					local573 = local422 + local533 * (local533 < 0.0F ? local442 : local432);
					local578 = (int) (local573 * local489);
					local599 = (int) (local573 * local475);
					if (local578 < 0) {
						local578 = 0;
					} else if (local578 > 255) {
						local578 = 255;
					}
					if (local599 < 0) {
						local599 = 0;
					} else if (local599 > 255) {
						local599 = 255;
					}
					local620 = (int) (local500 * local573);
					if (local620 < 0) {
						local620 = 0;
					} else if (local620 > 255) {
						local620 = 255;
					}
					local183.anInt7523 = local480 * local100 + local104;
					local183.method6172(local578);
					local183.method6172(local599);
					local183.method6172(local620);
					local183.method6172(255 - (this.aByteArray83[local444] & 0xFF));
					local480 = this.aShortArray116[local444];
					local505 = local376[local480];
					if (local505 == 0) {
						local533 = (local412 * (float) local373[local480] + local406 * (float) local382[local480] + (float) local379[local480] * local418) * 0.0026041667F;
					} else {
						local533 = (local418 * (float) local379[local480] + local406 * (float) local382[local480] + (float) local373[local480] * local412) / (float) (local505 * 256);
					}
					local573 = local533 * (local533 < 0.0F ? local442 : local432) + local422;
					local578 = (int) (local573 * local489);
					local599 = (int) (local573 * local475);
					if (local578 < 0) {
						local578 = 0;
					} else if (local578 > 255) {
						local578 = 255;
					}
					local620 = (int) (local500 * local573);
					if (local599 < 0) {
						local599 = 0;
					} else if (local599 > 255) {
						local599 = 255;
					}
					local183.anInt7523 = local480 * local100 + local104;
					if (local620 < 0) {
						local620 = 0;
					} else if (local620 > 255) {
						local620 = 255;
					}
					local183.method6172(local578);
					local183.method6172(local599);
					local183.method6172(local620);
					local183.method6172(255 - (this.aByteArray83[local444] & 0xFF));
				}
			} else {
				for (local191 = 0; local191 < this.anInt6799; local191++) {
					local200 = this.method5475(this.lb[local191], this.aShort95, this.aByteArray83[local191], this.aShortArray115[local191]);
					local183.anInt7523 = local100 * this.aShortArray114[local191] + local104;
					local183.method6170(local200);
					local183.anInt7523 = this.aShortArray107[local191] * local100 + local104;
					local183.method6170(local200);
					local183.anInt7523 = this.aShortArray116[local191] * local100 + local104;
					local183.method6170(local200);
				}
			}
		}
		if (local27) {
			if (this.aClass85_1 == null) {
				local379 = this.aShortArray108;
				local382 = this.aShortArray110;
				local376 = this.aByteArray82;
				local373 = this.aShortArray112;
			} else {
				local376 = this.aClass85_1.aByteArray25;
				local382 = this.aClass85_1.aShortArray33;
				local373 = this.aClass85_1.aShortArray32;
				local379 = this.aClass85_1.aShortArray31;
			}
			@Pc(1114) float local1114 = 3.0F / (float) this.aShort93;
			local533 = 3.0F / (float) (this.aShort93 / 2 + this.aShort93);
			local183.anInt7523 = local106;
			if (this.aClass75_Sub2_38.aBoolean349) {
				for (local228 = 0; local228 < this.anInt6833; local228++) {
					local237 = local376[local228] & 0xFF;
					if (local237 == 0) {
						local183.method6175((float) local382[local228] * local533);
						local183.method6175((float) local373[local228] * local533);
						local183.method6175(local533 * (float) local379[local228]);
					} else {
						local475 = local1114 / (float) local237;
						local183.method6175((float) local382[local228] * local475);
						local183.method6175((float) local373[local228] * local475);
						local183.method6175((float) local379[local228] * local475);
					}
					local183.anInt7523 += local100 - 12;
				}
			} else {
				for (local228 = 0; local228 < this.anInt6833; local228++) {
					local237 = local376[local228] & 0xFF;
					if (local237 == 0) {
						local183.method6179((float) local382[local228] * local533);
						local183.method6179(local533 * (float) local373[local228]);
						local183.method6179((float) local379[local228] * local533);
					} else {
						local475 = local1114 / (float) local237;
						local183.method6179(local475 * (float) local382[local228]);
						local183.method6179(local475 * (float) local373[local228]);
						local183.method6179(local475 * (float) local379[local228]);
					}
					local183.anInt7523 += local100 - 12;
				}
			}
		}
		if (local49) {
			local183.anInt7523 = local108;
			if (this.aClass75_Sub2_38.aBoolean349) {
				for (local191 = 0; local191 < this.anInt6833; local191++) {
					local183.method6175(this.aFloatArray19[local191]);
					local183.method6175(this.aFloatArray20[local191]);
					local183.anInt7523 += local100 - 8;
				}
			} else {
				for (local191 = 0; local191 < this.anInt6833; local191++) {
					local183.method6179(this.aFloatArray19[local191]);
					local183.method6179(this.aFloatArray20[local191]);
					local183.anInt7523 += local100 - 8;
				}
			}
		}
		local183.anInt7523 = local100 * this.anInt6833;
		@Pc(1450) Interface12 local1450;
		if (arg0) {
			if (this.anInterface12_6 == null) {
				this.anInterface12_6 = this.aClass75_Sub2_38.method3848(local100, local183.anInt7523, local183.aByteArray94, true);
			} else {
				this.anInterface12_6.method5416(local183.anInt7523, local100, local183.aByteArray94);
			}
			this.aByte83 = 0;
			local1450 = this.anInterface12_6;
		} else {
			local1450 = this.aClass75_Sub2_38.method3848(local100, local183.anInt7523, local183.aByteArray94, false);
			this.aBoolean459 = true;
		}
		if (local38) {
			this.aClass47_14.anInterface12_1 = local1450;
			this.aClass47_14.aByte9 = 0;
		}
		if (local49) {
			this.aClass47_12.aByte9 = local108;
			this.aClass47_12.anInterface12_1 = local1450;
		}
		if (local16) {
			this.aClass47_13.aByte9 = local104;
			this.aClass47_13.anInterface12_1 = local1450;
		}
		if (local27) {
			this.aClass47_11.aByte9 = local106;
			this.aClass47_11.anInterface12_1 = local1450;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class6_Sub2 local8 = (Class6_Sub2) arg2;
		@Pc(12) Class6_Sub2 local12 = this.aClass75_Sub2_38.aClass6_Sub2_4;
		@Pc(33) float local33 = local12.aFloat60 + local8.aFloat68 * local12.aFloat61 + local8.aFloat60 * local12.aFloat63 + local12.aFloat62 * local8.aFloat59;
		@Pc(54) float local54 = local12.aFloat70 * local8.aFloat59 + local8.aFloat60 * local12.aFloat66 + local12.aFloat67 * local8.aFloat68 + local12.aFloat68;
		Static93.aFloat12 = local12.aFloat62 * local8.aFloat64 + local8.aFloat66 * local12.aFloat61 + local12.aFloat63 * local8.aFloat63;
		Static350.aFloat80 = local12.aFloat70 * local8.aFloat65 + local12.aFloat66 * local8.aFloat62 + local12.aFloat67 * local8.aFloat70;
		Static244.aFloat35 = local8.aFloat65 * local12.aFloat65 + local8.aFloat62 * local12.aFloat64 + local12.aFloat69 * local8.aFloat70;
		@Pc(129) float local129 = local12.aFloat59 + local12.aFloat64 * local8.aFloat60 + local8.aFloat68 * local12.aFloat69 + local8.aFloat59 * local12.aFloat65;
		Static323.aFloat79 = local12.aFloat69 * local8.aFloat67 + local12.aFloat64 * local8.aFloat61 + local12.aFloat65 * local8.aFloat69;
		Static35.aFloat8 = local8.aFloat65 * local12.aFloat62 + local8.aFloat62 * local12.aFloat63 + local12.aFloat61 * local8.aFloat70;
		Static64.aFloat10 = local12.aFloat70 * local8.aFloat69 + local8.aFloat61 * local12.aFloat66 + local12.aFloat67 * local8.aFloat67;
		Static211.aFloat26 = local8.aFloat61 * local12.aFloat63 + local12.aFloat61 * local8.aFloat67 + local12.aFloat62 * local8.aFloat69;
		Static117.aFloat17 = local8.aFloat63 * local12.aFloat66 + local12.aFloat67 * local8.aFloat66 + local8.aFloat64 * local12.aFloat70;
		Static158.aFloat19 = local12.aFloat69 * local8.aFloat66 + local12.aFloat64 * local8.aFloat63 + local8.aFloat64 * local12.aFloat65;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass75_Sub2_38.anInt4892;
		@Pc(255) int local255 = this.aClass75_Sub2_38.anInt4895;
		if (!this.aBoolean460) {
			this.method5467();
		}
		Static349.anIntArray516[0] = this.aShort91;
		Static292.anIntArray442[0] = this.aShort90;
		Static140.anIntArray220[0] = this.aShort92;
		Static349.anIntArray516[1] = this.aShort89;
		Static292.anIntArray442[1] = this.aShort90;
		Static140.anIntArray220[1] = this.aShort92;
		Static349.anIntArray516[2] = this.aShort91;
		Static292.anIntArray442[2] = this.aShort88;
		Static349.anIntArray516[3] = this.aShort89;
		Static140.anIntArray220[2] = this.aShort92;
		Static292.anIntArray442[3] = this.aShort88;
		Static140.anIntArray220[3] = this.aShort92;
		Static349.anIntArray516[4] = this.aShort91;
		Static292.anIntArray442[4] = this.aShort90;
		Static140.anIntArray220[4] = this.aShort94;
		Static349.anIntArray516[5] = this.aShort89;
		Static292.anIntArray442[5] = this.aShort90;
		Static140.anIntArray220[5] = this.aShort94;
		Static349.anIntArray516[6] = this.aShort91;
		Static292.anIntArray442[6] = this.aShort88;
		Static140.anIntArray220[6] = this.aShort94;
		Static349.anIntArray516[7] = this.aShort89;
		Static292.anIntArray442[7] = this.aShort88;
		Static140.anIntArray220[7] = this.aShort94;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(390) float local390;
		@Pc(395) float local395;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static349.anIntArray516[local383];
			local395 = Static292.anIntArray442[local383];
			local400 = Static140.anIntArray220[local383];
			local414 = local33 + Static35.aFloat8 * local400 + local395 * Static211.aFloat26 + Static93.aFloat12 * local390;
			local428 = local54 + local390 * Static117.aFloat17 + local395 * Static64.aFloat10 + Static350.aFloat80 * local400;
			local442 = local129 + Static158.aFloat19 * local390 + Static323.aFloat79 * local395 + Static244.aFloat35 * local400;
			if (local442 >= (float) this.aClass75_Sub2_38.anInt4880) {
				@Pc(461) float local461 = local414 * (float) local251 / local442 + (float) this.aClass75_Sub2_38.anInt4871;
				if (local243 < local461) {
					local243 = local461;
				}
				if (local461 < local241) {
					local241 = local461;
				}
				@Pc(485) float local485 = (float) this.aClass75_Sub2_38.anInt4876 + (float) local255 * local428 / local442;
				local239 = true;
				if (local247 < local485) {
					local247 = local485;
				}
				if (local245 > local485) {
					local245 = local485;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && local243 > (float) arg0 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt6833 > this.aClass75_Sub2_38.anIntArray406.length) {
				this.aClass75_Sub2_38.anIntArray406 = new int[this.anInt6833];
				this.aClass75_Sub2_38.anIntArray405 = new int[this.anInt6833];
			}
			@Pc(552) int[] local552 = this.aClass75_Sub2_38.anIntArray406;
			@Pc(556) int[] local556 = this.aClass75_Sub2_38.anIntArray405;
			@Pc(640) int local640;
			for (@Pc(558) int local558 = 0; local558 < this.anInt6800; local558++) {
				local395 = this.anIntArray552[local558];
				local400 = this.anIntArray551[local558];
				local390 = this.anIntArray553[local558];
				local442 = local129 + local395 * Static323.aFloat79 + local390 * Static158.aFloat19 + Static244.aFloat35 * local400;
				local428 = local54 + local390 * Static117.aFloat17 + local395 * Static64.aFloat10 + local400 * Static350.aFloat80;
				local414 = local33 + Static35.aFloat8 * local400 + Static93.aFloat12 * local390 + Static211.aFloat26 * local395;
				@Pc(653) int local653;
				@Pc(658) int local658;
				@Pc(665) int local665;
				if (local442 >= (float) this.aClass75_Sub2_38.anInt4880) {
					local640 = (int) ((float) this.aClass75_Sub2_38.anInt4871 + (float) local251 * local414 / local442);
					local653 = (int) ((float) this.aClass75_Sub2_38.anInt4876 + (float) local255 * local428 / local442);
					local658 = this.anIntArray550[local558];
					local665 = this.anIntArray550[local558 + 1];
					for (@Pc(667) int local667 = local658; local667 < local665; local667++) {
						@Pc(676) int local676 = this.aShortArray111[local667] - 1;
						if (local676 == -1) {
							break;
						}
						local552[local676] = local640;
						local556[local676] = local653;
					}
				} else {
					local640 = this.anIntArray550[local558];
					local653 = this.anIntArray550[local558 + 1];
					for (local658 = local640; local658 < local653; local658++) {
						local665 = this.aShortArray111[local658] - 1;
						if (local665 == -1) {
							break;
						}
						local552[this.aShortArray111[local658] - 1] = -999999;
					}
				}
			}
			for (local640 = 0; local640 < this.anInt6799; local640++) {
				if (local552[this.aShortArray114[local640]] != -999999 && local552[this.aShortArray107[local640]] != -999999 && local552[this.aShortArray116[local640]] != -999999 && this.method5461(local556[this.aShortArray107[local640]], local556[this.aShortArray116[local640]], local556[this.aShortArray114[local640]], local552[this.aShortArray116[local640]], arg0, local552[this.aShortArray114[local640]], local552[this.aShortArray107[local640]], arg1)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!rr;)V")
	private void method5472(@OriginalArg(1) Class2_Sub1_Sub5_Sub1 arg0) {
		if (this.aClass75_Sub2_38.anIntArray406.length < this.anInt6833) {
			this.aClass75_Sub2_38.anIntArray406 = new int[this.anInt6833];
			this.aClass75_Sub2_38.anIntArray405 = new int[this.anInt6833];
		}
		@Pc(28) int[] local28 = this.aClass75_Sub2_38.anIntArray406;
		@Pc(32) int[] local32 = this.aClass75_Sub2_38.anIntArray405;
		@Pc(61) int local61;
		@Pc(100) int local100;
		@Pc(109) int local109;
		for (@Pc(34) int local34 = 0; local34 < this.anInt6800; local34++) {
			local61 = (this.anIntArray553[local34] - (this.aClass75_Sub2_38.anInt4875 * this.anIntArray552[local34] >> 8) >> this.aClass75_Sub2_38.anInt4859) - arg0.anInt6343;
			@Pc(86) int local86 = (this.anIntArray551[local34] - (this.aClass75_Sub2_38.anInt4891 * this.anIntArray552[local34] >> 8) >> this.aClass75_Sub2_38.anInt4859) - arg0.anInt6348;
			@Pc(91) int local91 = this.anIntArray550[local34];
			@Pc(98) int local98 = this.anIntArray550[local34 + 1];
			for (local100 = local91; local100 < local98; local100++) {
				local109 = this.aShortArray111[local100] - 1;
				if (local109 == -1) {
					break;
				}
				local28[local109] = local61;
				local32[local109] = local86;
			}
		}
		for (local61 = 0; local61 < this.anInt6818; local61++) {
			if (this.aByteArray83 == null || this.aByteArray83[local61] <= 128) {
				@Pc(150) short local150 = this.aShortArray114[local61];
				@Pc(155) short local155 = this.aShortArray107[local61];
				@Pc(160) short local160 = this.aShortArray116[local61];
				local100 = local28[local150];
				local109 = local28[local155];
				@Pc(172) int local172 = local28[local160];
				@Pc(176) int local176 = local32[local150];
				@Pc(180) int local180 = local32[local155];
				@Pc(184) int local184 = local32[local160];
				if ((local180 - local184) * (local100 - local109) - (local180 - local176) * (-local109 + local172) > 0) {
					arg0.method5044(local176, local172, local184, local109, local100, local180);
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!nf;)V")
	private void method5473(@OriginalArg(1) Class6_Sub2 arg0) {
		@Pc(15) int local15;
		if (this.aClass191Array3 != null) {
			for (local15 = 0; local15 < this.aClass191Array3.length; local15++) {
				@Pc(22) Class191 local22 = this.aClass191Array3[local15];
				@Pc(24) Class191 local24 = local22;
				if (local22.aClass191_1 != null) {
					local24 = local22.aClass191_1;
				}
				local24.anInt5320 = (int) (arg0.aFloat60 + (float) this.anIntArray551[local22.anInt5316] * arg0.aFloat62 + (float) this.anIntArray553[local22.anInt5316] * arg0.aFloat63 + (float) this.anIntArray552[local22.anInt5316] * arg0.aFloat61);
				local24.anInt5319 = (int) ((float) this.anIntArray553[local22.anInt5316] * arg0.aFloat66 + arg0.aFloat67 * (float) this.anIntArray552[local22.anInt5316] + arg0.aFloat70 * (float) this.anIntArray551[local22.anInt5316] + arg0.aFloat68);
				local24.anInt5317 = (int) (arg0.aFloat59 + arg0.aFloat69 * (float) this.anIntArray552[local22.anInt5316] + (float) this.anIntArray553[local22.anInt5316] * arg0.aFloat64 + arg0.aFloat65 * (float) this.anIntArray551[local22.anInt5316]);
				local24.anInt5332 = (int) (arg0.aFloat60 + (float) this.anIntArray552[local22.anInt5331] * arg0.aFloat61 + (float) this.anIntArray553[local22.anInt5331] * arg0.aFloat63 + (float) this.anIntArray551[local22.anInt5331] * arg0.aFloat62);
				local24.anInt5327 = (int) ((float) this.anIntArray552[local22.anInt5331] * arg0.aFloat67 + (float) this.anIntArray553[local22.anInt5331] * arg0.aFloat66 + (float) this.anIntArray551[local22.anInt5331] * arg0.aFloat70 + arg0.aFloat68);
				local24.anInt5322 = (int) (arg0.aFloat59 + arg0.aFloat69 * (float) this.anIntArray552[local22.anInt5331] + (float) this.anIntArray553[local22.anInt5331] * arg0.aFloat64 + arg0.aFloat65 * (float) this.anIntArray551[local22.anInt5331]);
				local24.anInt5324 = (int) (arg0.aFloat60 + (float) this.anIntArray553[local22.anInt5329] * arg0.aFloat63 + (float) this.anIntArray552[local22.anInt5329] * arg0.aFloat61 + (float) this.anIntArray551[local22.anInt5329] * arg0.aFloat62);
				local24.anInt5325 = (int) (arg0.aFloat68 + arg0.aFloat67 * (float) this.anIntArray552[local22.anInt5329] + arg0.aFloat66 * (float) this.anIntArray553[local22.anInt5329] + arg0.aFloat70 * (float) this.anIntArray551[local22.anInt5329]);
				local24.anInt5323 = (int) (arg0.aFloat59 + (float) this.anIntArray551[local22.anInt5329] * arg0.aFloat65 + arg0.aFloat69 * (float) this.anIntArray552[local22.anInt5329] + arg0.aFloat64 * (float) this.anIntArray553[local22.anInt5329]);
			}
		}
		if (this.aClass254Array3 == null) {
			return;
		}
		for (local15 = 0; local15 < this.aClass254Array3.length; local15++) {
			@Pc(371) Class254 local371 = this.aClass254Array3[local15];
			@Pc(373) Class254 local373 = local371;
			if (local371.aClass254_2 != null) {
				local373 = local371.aClass254_2;
			}
			if (local371.aClass6_4 == null) {
				local371.aClass6_4 = arg0.method4655();
			} else {
				local371.aClass6_4.ha(arg0);
			}
			local373.anInt7208 = (int) ((float) this.anIntArray553[local371.anInt7217] * arg0.aFloat63 + arg0.aFloat61 * (float) this.anIntArray552[local371.anInt7217] + (float) this.anIntArray551[local371.anInt7217] * arg0.aFloat62 + arg0.aFloat60);
			local373.anInt7210 = (int) (arg0.aFloat68 + arg0.aFloat70 * (float) this.anIntArray551[local371.anInt7217] + arg0.aFloat67 * (float) this.anIntArray552[local371.anInt7217] + (float) this.anIntArray553[local371.anInt7217] * arg0.aFloat66);
			local373.anInt7218 = (int) (arg0.aFloat65 * (float) this.anIntArray551[local371.anInt7217] + arg0.aFloat64 * (float) this.anIntArray553[local371.anInt7217] + (float) this.anIntArray552[local371.anInt7217] * arg0.aFloat69 + arg0.aFloat59);
		}
	}

	@OriginalMember(owner = "client!to", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.aShort95 = (short) arg0;
		if (this.aClass47_13 != null) {
			this.aClass47_13.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anInt6805 = arg0;
		this.aBoolean459 = true;
		if (this.aClass85_1 != null && (this.anInt6805 & 0x10000) == 0) {
			this.aByteArray82 = this.aClass85_1.aByteArray25;
			this.aShortArray108 = this.aClass85_1.aShortArray31;
			this.aShortArray112 = this.aClass85_1.aShortArray32;
			this.aShortArray110 = this.aClass85_1.aShortArray33;
			this.aClass85_1 = null;
		}
		this.method5476();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(SIBBI)I")
	private int method5475(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18 = Static64.anIntArray85[Static51.method806(arg1, arg3)];
		if (arg0 != -1) {
			@Pc(30) Class257 local30 = this.aClass75_Sub2_38.anInterface7_8.method1170(arg0 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte97 & 0xFF;
			@Pc(41) int local41;
			@Pc(68) int local68;
			if (local35 != 0) {
				if (arg1 < 0) {
					local41 = 0;
				} else if (arg1 > 127) {
					local41 = 16777215;
				} else {
					local41 = arg1 * 131586;
				}
				if (local35 == 256) {
					local18 = local41;
				} else {
					local68 = 256 - local35;
					local18 = ((local18 & 0xFF00) * local68 + local35 * (local41 & 0xFF00) & 0xFF0000) + (local68 * (local18 & 0xFF00FF) + (local41 & 0xFF00FF) * local35 & 0xFF00FF00) >> 8;
				}
			}
			local41 = local30.aByte93 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(117) int local117 = (local18 >> 16 & 0xFF) * local41;
				if (local117 > 65535) {
					local117 = 65535;
				}
				local68 = (local18 >> 8 & 0xFF) * local41;
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(141) int local141 = local41 * (local18 & 0xFF);
				if (local141 > 65535) {
					local141 = 65535;
				}
				local18 = (local141 >> 8) + ((local117 & 0x4200FF00) << 8) + (local68 & 0xFF00);
			}
		}
		return (local18 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!to", name = "aa", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			local24 = 0;
			Static139.anInt2569 = 0;
			Static170.anInt3067 = 0;
			Static355.anInt6254 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray164.length) {
					local52 = this.anIntArrayArray164[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray109 == null || (this.aShortArray109[local60] & arg6) != 0) {
							Static355.anInt6254 += this.anIntArray553[local60];
							Static170.anInt3067 += this.anIntArray552[local60];
							Static139.anInt2569 += this.anIntArray551[local60];
							local24++;
						}
					}
				}
			}
			if (local24 > 0) {
				Static355.anInt6254 = Static355.anInt6254 / local24 + arg2;
				Static170.anInt3067 = arg3 + Static170.anInt3067 / local24;
				Static80.aBoolean429 = true;
				Static139.anInt2569 = Static139.anInt2569 / local24 + arg4;
			} else {
				Static139.anInt2569 = arg4;
				Static170.anInt3067 = arg3;
				Static355.anInt6254 = arg2;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg4 * arg7[2] + arg7[1] * arg3 + arg2 * arg7[0] + 16384 >> 15;
				local32 = arg7[5] * arg4 + arg2 * arg7[3] + arg3 * arg7[4] + 16384 >> 15;
				local38 = arg7[8] * arg4 + arg3 * arg7[7] + arg2 * arg7[6] + 16384 >> 15;
				arg3 = local32;
				arg4 = local38;
				arg2 = local24;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray164.length) {
					local250 = this.anIntArrayArray164[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local54 = local250[local252];
						if (this.aShortArray109 == null || (arg6 & this.aShortArray109[local54]) != 0) {
							this.anIntArray553[local54] += arg2;
							this.anIntArray552[local54] += arg3;
							this.anIntArray551[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(369) int local369;
		@Pc(392) int local392;
		@Pc(419) int local419;
		@Pc(450) int local450;
		@Pc(454) int local454;
		@Pc(458) int local458;
		@Pc(462) int local462;
		@Pc(470) int local470;
		@Pc(478) int local478;
		@Pc(632) int local632;
		@Pc(658) int local658;
		@Pc(662) int local662;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(679) int local679;
		@Pc(683) int local683;
		@Pc(685) int local685;
		@Pc(811) int[] local811;
		@Pc(813) int local813;
		@Pc(817) int local817;
		@Pc(821) int local821;
		@Pc(823) int local823;
		@Pc(952) int local952;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray164.length) {
						local250 = this.anIntArrayArray164[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local54 = local250[local252];
							if (this.aShortArray109 == null || (arg6 & this.aShortArray109[local54]) != 0) {
								this.anIntArray553[local54] -= Static355.anInt6254;
								this.anIntArray552[local54] -= Static170.anInt3067;
								this.anIntArray551[local54] -= Static139.anInt2569;
								if (arg4 != 0) {
									local60 = Class229.anIntArray537[arg4];
									local369 = Class229.anIntArray536[arg4];
									local392 = this.anIntArray552[local54] * local60 + this.anIntArray553[local54] * local369 + 32767 >> 15;
									this.anIntArray552[local54] = this.anIntArray552[local54] * local369 + 32767 - this.anIntArray553[local54] * local60 >> 15;
									this.anIntArray553[local54] = local392;
								}
								if (arg2 != 0) {
									local60 = Class229.anIntArray537[arg2];
									local369 = Class229.anIntArray536[arg2];
									local392 = this.anIntArray552[local54] * local369 + 32767 - this.anIntArray551[local54] * local60 >> 15;
									this.anIntArray551[local54] = this.anIntArray551[local54] * local369 + local60 * this.anIntArray552[local54] + 32767 >> 15;
									this.anIntArray552[local54] = local392;
								}
								if (arg3 != 0) {
									local60 = Class229.anIntArray537[arg3];
									local369 = Class229.anIntArray536[arg3];
									local392 = this.anIntArray551[local54] * local60 + this.anIntArray553[local54] * local369 + 32767 >> 15;
									this.anIntArray551[local54] = this.anIntArray551[local54] * local369 + 32767 - this.anIntArray553[local54] * local60 >> 15;
									this.anIntArray553[local54] = local392;
								}
								this.anIntArray553[local54] += Static355.anInt6254;
								this.anIntArray552[local54] += Static170.anInt3067;
								this.anIntArray551[local54] += Static139.anInt2569;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray164.length) {
							local52 = this.anIntArrayArray164[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray109 == null || (this.aShortArray109[local60] & arg6) != 0) {
									local369 = this.anIntArray550[local60];
									local392 = this.anIntArray550[local60 + 1];
									for (local419 = local369; local419 < local392; local419++) {
										local450 = this.aShortArray111[local419] - 1;
										if (local450 == -1) {
											break;
										}
										if (arg4 != 0) {
											local454 = Class229.anIntArray537[arg4];
											local458 = Class229.anIntArray536[arg4];
											local462 = local458 * this.aShortArray110[local450] + this.aShortArray112[local450] * local454 + 32767 >> 15;
											this.aShortArray112[local450] = (short) (local458 * this.aShortArray112[local450] + 32767 - local454 * this.aShortArray110[local450] >> 15);
											this.aShortArray110[local450] = (short) local462;
										}
										if (arg2 != 0) {
											local454 = Class229.anIntArray537[arg2];
											local458 = Class229.anIntArray536[arg2];
											local462 = this.aShortArray112[local450] * local458 + 32767 - local454 * this.aShortArray108[local450] >> 15;
											this.aShortArray108[local450] = (short) (local458 * this.aShortArray108[local450] + this.aShortArray112[local450] * local454 + 32767 >> 15);
											this.aShortArray112[local450] = (short) local462;
										}
										if (arg3 != 0) {
											local454 = Class229.anIntArray537[arg3];
											local458 = Class229.anIntArray536[arg3];
											local462 = this.aShortArray110[local450] * local458 + this.aShortArray108[local450] * local454 + 32767 >> 15;
											this.aShortArray108[local450] = (short) (local458 * this.aShortArray108[local450] + 32767 - this.aShortArray110[local450] * local454 >> 15);
											this.aShortArray110[local450] = (short) local462;
										}
									}
								}
							}
						}
					}
					if (this.aClass47_11 == null && this.aClass47_13 != null) {
						this.aClass47_13.anInterface12_1 = null;
					}
					if (this.aClass47_11 != null) {
						this.aClass47_11.anInterface12_1 = null;
					}
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static80.aBoolean429) {
					local369 = Static139.anInt2569 * arg7[6] + Static355.anInt6254 * arg7[0] + Static170.anInt3067 * arg7[3] + 16384 >> 15;
					local392 = Static139.anInt2569 * arg7[7] + arg7[1] * Static355.anInt6254 + Static170.anInt3067 * arg7[4] + 16384 >> 15;
					local369 += local252;
					local419 = Static139.anInt2569 * arg7[8] + arg7[2] * Static355.anInt6254 + Static170.anInt3067 * arg7[5] + 16384 >> 15;
					local392 += local54;
					Static170.anInt3067 = local392;
					Static355.anInt6254 = local369;
					local419 += local60;
					Static139.anInt2569 = local419;
					Static80.aBoolean429 = false;
				}
				@Pc(438) int[] local438 = new int[9];
				local392 = Class229.anIntArray536[arg2];
				local419 = Class229.anIntArray537[arg2];
				local450 = Class229.anIntArray536[arg3];
				local454 = Class229.anIntArray537[arg3];
				local458 = Class229.anIntArray536[arg4];
				local462 = Class229.anIntArray537[arg4];
				local470 = local458 * local419 + 16384 >> 15;
				local478 = local462 * local419 + 16384 >> 15;
				local438[2] = local392 * local454 + 16384 >> 15;
				local438[6] = -local454 * local458 + local450 * local478 + 16384 >> 15;
				local438[7] = local462 * local454 + local470 * local450 + 16384 >> 15;
				local438[8] = local392 * local450 + 16384 >> 15;
				local438[0] = local454 * local478 + local458 * local450 + 16384 >> 15;
				local438[1] = local454 * local470 + -local450 * local462 + 16384 >> 15;
				local438[4] = local458 * local392 + 16384 >> 15;
				local438[5] = -local419;
				local438[3] = local392 * local462 + 16384 >> 15;
				@Pc(607) int local607 = local438[0] * -Static355.anInt6254 + -Static170.anInt3067 * local438[1] + -Static139.anInt2569 * local438[2] + 16384 >> 15;
				local632 = -Static139.anInt2569 * local438[5] + local438[4] * -Static170.anInt3067 + local438[3] * -Static355.anInt6254 + 16384 >> 15;
				local658 = -Static139.anInt2569 * local438[8] + -Static355.anInt6254 * local438[6] + local438[7] * -Static170.anInt3067 + 16384 >> 15;
				local662 = Static355.anInt6254 + local607;
				@Pc(666) int local666 = local632 + Static170.anInt3067;
				local670 = Static139.anInt2569 + local658;
				@Pc(673) int[] local673 = new int[9];
				for (local675 = 0; local675 < 3; local675++) {
					for (local679 = 0; local679 < 3; local679++) {
						local683 = 0;
						for (local685 = 0; local685 < 3; local685++) {
							local683 += arg7[local679 * 3 + local685] * local438[local685 + local675 * 3];
						}
						local673[local679 + local675 * 3] = local683 + 16384 >> 15;
					}
				}
				local679 = local438[2] * local60 + local54 * local438[1] + local252 * local438[0] + 16384 >> 15;
				local683 = local60 * local438[5] + local252 * local438[3] + local438[4] * local54 + 16384 >> 15;
				local679 += local662;
				local683 += local666;
				local685 = local60 * local438[8] + local54 * local438[7] + local252 * local438[6] + 16384 >> 15;
				local685 += local670;
				local811 = new int[9];
				for (local813 = 0; local813 < 3; local813++) {
					for (local817 = 0; local817 < 3; local817++) {
						local821 = 0;
						for (local823 = 0; local823 < 3; local823++) {
							local821 += arg7[local813 * 3 + local823] * local673[local823 * 3 + local817];
						}
						local811[local813 * 3 + local817] = local821 + 16384 >> 15;
					}
				}
				local817 = arg7[2] * local685 + local679 * arg7[0] + local683 * arg7[1] + 16384 >> 15;
				local821 = arg7[5] * local685 + local679 * arg7[3] + local683 * arg7[4] + 16384 >> 15;
				local817 += local24;
				local823 = local683 * arg7[7] + arg7[6] * local679 + local685 * arg7[8] + 16384 >> 15;
				local821 += local32;
				local823 += local38;
				for (local952 = 0; local952 < local8; local952++) {
					@Pc(958) int local958 = arg1[local952];
					if (this.anIntArrayArray164.length > local958) {
						@Pc(968) int[] local968 = this.anIntArrayArray164[local958];
						for (@Pc(970) int local970 = 0; local970 < local968.length; local970++) {
							@Pc(976) int local976 = local968[local970];
							if (this.aShortArray109 == null || (arg6 & this.aShortArray109[local976]) != 0) {
								@Pc(1022) int local1022 = local811[0] * this.anIntArray553[local976] + local811[1] * this.anIntArray552[local976] + this.anIntArray551[local976] * local811[2] + 16384 >> 15;
								@Pc(1053) int local1053 = this.anIntArray551[local976] * local811[5] + this.anIntArray553[local976] * local811[3] + this.anIntArray552[local976] * local811[4] + 16384 >> 15;
								@Pc(1057) int local1057 = local1022 + local817;
								@Pc(1088) int local1088 = this.anIntArray551[local976] * local811[8] + this.anIntArray553[local976] * local811[6] + local811[7] * this.anIntArray552[local976] + 16384 >> 15;
								@Pc(1092) int local1092 = local1053 + local821;
								@Pc(1096) int local1096 = local1088 + local823;
								this.anIntArray553[local976] = local1057;
								this.anIntArray552[local976] = local1092;
								this.anIntArray551[local976] = local1096;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2579) Class258 local2579;
			@Pc(2584) Class239 local2584;
			if (arg0 == 5) {
				if (this.anIntArrayArray165 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray165.length) {
							local250 = this.anIntArrayArray165[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local54 = local250[local252];
								if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local54]) != 0) {
									local60 = arg2 * 8 + (this.aByteArray83[local54] & 0xFF);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray83[local54] = (byte) local60;
									if (this.aClass47_13 != null) {
										this.aClass47_13.anInterface12_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass258Array1 != null) {
						for (local32 = 0; local32 < this.anInt6820; local32++) {
							local2579 = this.aClass258Array1[local32];
							local2584 = this.aClass239Array1[local32];
							local2584.anInt6768 = local2584.anInt6768 & 0xFFFFFF | 255 - (this.aByteArray83[local2579.anInt7257] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2839) Class239 local2839;
				if (arg0 == 8) {
					if (this.anIntArrayArray166 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray166.length > local32) {
								local250 = this.anIntArrayArray166[local32];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2839 = this.aClass239Array1[local250[local252]];
									local2839.anInt6772 += arg2;
									local2839.anInt6775 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray166 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray166.length > local32) {
								local250 = this.anIntArrayArray166[local32];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2839 = this.aClass239Array1[local250[local252]];
									local2839.anInt6770 = local2839.anInt6770 * arg3 >> 7;
									local2839.anInt6769 = local2839.anInt6769 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray166 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray166.length > local32) {
							local250 = this.anIntArrayArray166[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2839 = this.aClass239Array1[local250[local252]];
								local2839.anInt6771 = arg2 + local2839.anInt6771 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray165 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray165.length > local32) {
						local250 = this.anIntArrayArray165[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local54 = local250[local252];
							if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local54]) != 0) {
								local60 = this.aShortArray115[local54] & 0xFFFF;
								local369 = local60 >> 10 & 0x3F;
								local392 = local60 >> 7 & 0x7;
								local419 = local60 & 0x7F;
								local392 += arg3 / 4;
								@Pc(2694) int local2694 = local369 + arg2 & 0x3F;
								local419 += arg4;
								if (local392 < 0) {
									local392 = 0;
								} else if (local392 > 7) {
									local392 = 7;
								}
								if (local419 < 0) {
									local419 = 0;
								} else if (local419 > 127) {
									local419 = 127;
								}
								this.aShortArray115[local54] = (short) (local419 | local2694 << 10 | local392 << 7);
								if (this.aClass47_13 != null) {
									this.aClass47_13.anInterface12_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass258Array1 != null) {
					for (local32 = 0; local32 < this.anInt6820; local32++) {
						local2579 = this.aClass258Array1[local32];
						local2584 = this.aClass239Array1[local32];
						local2584.anInt6768 = Static64.anIntArray85[this.aShortArray115[local2579.anInt7257] & 0xFFFF] & 0xFFFFFF | local2584.anInt6768 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray164.length > local32) {
					local250 = this.anIntArrayArray164[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local54 = local250[local252];
						if (this.aShortArray109 == null || (this.aShortArray109[local54] & arg6) != 0) {
							this.anIntArray553[local54] -= Static355.anInt6254;
							this.anIntArray552[local54] -= Static170.anInt3067;
							this.anIntArray551[local54] -= Static139.anInt2569;
							this.anIntArray553[local54] = arg2 * this.anIntArray553[local54] >> 7;
							this.anIntArray552[local54] = arg3 * this.anIntArray552[local54] >> 7;
							this.anIntArray551[local54] = arg4 * this.anIntArray551[local54] >> 7;
							this.anIntArray553[local54] += Static355.anInt6254;
							this.anIntArray552[local54] += Static170.anInt3067;
							this.anIntArray551[local54] += Static139.anInt2569;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static80.aBoolean429) {
				local369 = Static139.anInt2569 * arg7[6] + Static355.anInt6254 * arg7[0] + arg7[3] * Static170.anInt3067 + 16384 >> 15;
				local392 = arg7[7] * Static139.anInt2569 + Static170.anInt3067 * arg7[4] + Static355.anInt6254 * arg7[1] + 16384 >> 15;
				local392 += local54;
				local419 = Static139.anInt2569 * arg7[8] + Static170.anInt3067 * arg7[5] + arg7[2] * Static355.anInt6254 + 16384 >> 15;
				local369 += local252;
				local419 += local60;
				Static170.anInt3067 = local392;
				Static355.anInt6254 = local369;
				Static80.aBoolean429 = false;
				Static139.anInt2569 = local419;
			}
			local369 = arg2 << 15 >> 7;
			local392 = arg3 << 15 >> 7;
			local419 = arg4 << 15 >> 7;
			local450 = local369 * -Static355.anInt6254 + 16384 >> 15;
			local454 = local392 * -Static170.anInt3067 + 16384 >> 15;
			local458 = local419 * -Static139.anInt2569 + 16384 >> 15;
			local462 = local450 + Static355.anInt6254;
			local470 = Static170.anInt3067 + local454;
			local478 = local458 + Static139.anInt2569;
			@Pc(2006) int[] local2006 = new int[] { arg7[0] * local369 + 16384 >> 15, local369 * arg7[3] + 16384 >> 15, local369 * arg7[6] + 16384 >> 15, arg7[1] * local392 + 16384 >> 15, arg7[4] * local392 + 16384 >> 15, arg7[7] * local392 + 16384 >> 15, arg7[2] * local419 + 16384 >> 15, local419 * arg7[5] + 16384 >> 15, local419 * arg7[8] + 16384 >> 15 };
			local632 = local369 * local252 + 16384 >> 15;
			local658 = local54 * local392 + 16384 >> 15;
			@Pc(2134) int local2134 = local632 + local462;
			@Pc(2138) int local2138 = local658 + local470;
			local662 = local60 * local419 + 16384 >> 15;
			@Pc(2150) int local2150 = local662 + local478;
			@Pc(2153) int[] local2153 = new int[9];
			@Pc(2159) int local2159;
			for (local670 = 0; local670 < 3; local670++) {
				for (local2159 = 0; local2159 < 3; local2159++) {
					local675 = 0;
					for (local679 = 0; local679 < 3; local679++) {
						local675 += arg7[local670 * 3 + local679] * local2006[local679 * 3 + local2159];
					}
					local2153[local2159 + local670 * 3] = local675 + 16384 >> 15;
				}
			}
			local2159 = local2134 * arg7[0] + arg7[1] * local2138 + arg7[2] * local2150 + 16384 >> 15;
			local675 = arg7[4] * local2138 + local2134 * arg7[3] + local2150 * arg7[5] + 16384 >> 15;
			local675 += local32;
			local679 = arg7[6] * local2134 + arg7[7] * local2138 + arg7[8] * local2150 + 16384 >> 15;
			local2159 += local24;
			local679 += local38;
			for (local683 = 0; local683 < local8; local683++) {
				local685 = arg1[local683];
				if (local685 < this.anIntArrayArray164.length) {
					local811 = this.anIntArrayArray164[local685];
					for (local813 = 0; local813 < local811.length; local813++) {
						local817 = local811[local813];
						if (this.aShortArray109 == null || (this.aShortArray109[local817] & arg6) != 0) {
							local821 = local2153[0] * this.anIntArray553[local817] + local2153[1] * this.anIntArray552[local817] + this.anIntArray551[local817] * local2153[2] + 16384 >> 15;
							local823 = this.anIntArray552[local817] * local2153[4] + this.anIntArray553[local817] * local2153[3] + local2153[5] * this.anIntArray551[local817] + 16384 >> 15;
							@Pc(2399) int local2399 = local821 + local2159;
							@Pc(2403) int local2403 = local823 + local675;
							local952 = this.anIntArray551[local817] * local2153[8] + local2153[7] * this.anIntArray552[local817] + local2153[6] * this.anIntArray553[local817] + 16384 >> 15;
							@Pc(2438) int local2438 = local952 + local679;
							this.anIntArray553[local817] = local2399;
							this.anIntArray552[local817] = local2403;
							this.anIntArray551[local817] = local2438;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6800; local3++) {
			this.anIntArray551[local3] = -this.anIntArray551[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt6833; local25++) {
			this.aShortArray108[local25] = (short) -this.aShortArray108[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt6799; local44++) {
			@Pc(51) short local51 = this.aShortArray114[local44];
			this.aShortArray114[local44] = this.aShortArray116[local44];
			this.aShortArray116[local44] = local51;
		}
		if (this.aClass47_11 == null && this.aClass47_13 != null) {
			this.aClass47_13.anInterface12_1 = null;
		}
		if (this.aClass47_11 != null) {
			this.aClass47_11.anInterface12_1 = null;
		}
		if (this.aClass47_14 != null) {
			this.aClass47_14.anInterface12_1 = null;
		}
		this.aBoolean460 = false;
		if (this.aClass144_1 != null) {
			this.aClass144_1.anInterface11_1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BIZ)Lclient!e;")
	@Override
	public Class63 method6296(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class63_Sub2 local16;
		@Pc(12) Class63_Sub2 local12;
		if (arg0 == 1) {
			local12 = this.aClass75_Sub2_38.aClass63_Sub2_4;
			local16 = this.aClass75_Sub2_38.aClass63_Sub2_7;
		} else if (arg0 == 2) {
			local12 = this.aClass75_Sub2_38.aClass63_Sub2_10;
			local16 = this.aClass75_Sub2_38.aClass63_Sub2_9;
		} else if (arg0 == 3) {
			local12 = this.aClass75_Sub2_38.aClass63_Sub2_2;
			local16 = this.aClass75_Sub2_38.aClass63_Sub2_3;
		} else if (arg0 == 4) {
			local12 = this.aClass75_Sub2_38.aClass63_Sub2_6;
			local16 = this.aClass75_Sub2_38.aClass63_Sub2_1;
		} else if (arg0 == 5) {
			local12 = this.aClass75_Sub2_38.aClass63_Sub2_5;
			local16 = this.aClass75_Sub2_38.aClass63_Sub2_8;
		} else {
			local16 = local12 = new Class63_Sub2(this.aClass75_Sub2_38);
		}
		return this.method5462(local16, arg1, arg2, arg0 != 0, local12);
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
	private void method5476() {
		if (!this.aBoolean459) {
			return;
		}
		this.aBoolean459 = false;
		if (this.aClass191Array3 == null && this.aClass254Array3 == null && this.aClass258Array1 == null) {
			if (this.anIntArray553 != null && !Static383.method5266(this.anInt6823, this.anInt6805)) {
				if (this.aClass47_14 != null && this.aClass47_14.anInterface12_1 == null) {
					this.aBoolean459 = true;
				} else {
					if (!this.aBoolean460) {
						this.method5467();
					}
					this.anIntArray553 = null;
				}
			}
			if (this.anIntArray552 != null && !Static173.method2539(this.anInt6805, this.anInt6823)) {
				if (this.aClass47_14 != null && this.aClass47_14.anInterface12_1 == null) {
					this.aBoolean459 = true;
				} else {
					if (!this.aBoolean460) {
						this.method5467();
					}
					this.anIntArray552 = null;
				}
			}
			if (this.anIntArray551 != null && !Static127.method2018(this.anInt6823, this.anInt6805)) {
				if (this.aClass47_14 != null && this.aClass47_14.anInterface12_1 == null) {
					this.aBoolean459 = true;
				} else {
					if (!this.aBoolean460) {
						this.method5467();
					}
					this.anIntArray551 = null;
				}
			}
		}
		if (this.aShortArray111 != null && this.anIntArray553 == null && this.anIntArray552 == null && this.anIntArray551 == null) {
			this.aShortArray111 = null;
			this.anIntArray550 = null;
		}
		if (this.aByteArray82 != null && !Static31.method2712(this.anInt6823, this.anInt6805)) {
			if (this.aClass47_11 == null) {
				if (this.aClass47_13 != null && this.aClass47_13.anInterface12_1 == null) {
					this.aBoolean459 = true;
				} else {
					this.aShortArray110 = this.aShortArray112 = this.aShortArray108 = null;
					this.aByteArray82 = null;
				}
			} else if (this.aClass47_11.anInterface12_1 == null) {
				this.aBoolean459 = true;
			} else {
				this.aShortArray110 = this.aShortArray112 = this.aShortArray108 = null;
				this.aByteArray82 = null;
			}
		}
		if (this.aShortArray115 != null && !Static78.method1176(this.anInt6823, this.anInt6805)) {
			if (this.aClass47_13 != null && this.aClass47_13.anInterface12_1 == null) {
				this.aBoolean459 = true;
			} else {
				this.aShortArray115 = null;
			}
		}
		if (this.aByteArray83 != null && !Static216.method6223(this.anInt6823, this.anInt6805)) {
			if (this.aClass47_13 != null && this.aClass47_13.anInterface12_1 == null) {
				this.aBoolean459 = true;
			} else {
				this.aByteArray83 = null;
			}
		}
		if (this.aFloatArray19 != null && !Static114.method1876(this.anInt6805, this.anInt6823)) {
			if (this.aClass47_12 != null && this.aClass47_12.anInterface12_1 == null) {
				this.aBoolean459 = true;
			} else {
				this.aFloatArray19 = this.aFloatArray20 = null;
			}
		}
		if (this.lb != null && !Static250.method3458(this.anInt6805, this.anInt6823)) {
			if (this.aClass47_13 != null && this.aClass47_13.anInterface12_1 == null) {
				this.aBoolean459 = true;
			} else {
				this.lb = null;
			}
		}
		if (this.aShortArray114 != null && !Static382.method5260(this.anInt6805, this.anInt6823)) {
			if (this.aClass144_1 != null && this.aClass144_1.anInterface11_1 == null || this.aClass47_13 != null && this.aClass47_13.anInterface12_1 == null) {
				this.aBoolean459 = true;
			} else {
				this.aShortArray114 = this.aShortArray107 = this.aShortArray116 = null;
			}
		}
		if (this.anIntArrayArray165 != null && !Static271.method3894(this.anInt6823, this.anInt6805)) {
			this.anIntArrayArray165 = null;
			this.aShortArray113 = null;
		}
		if (this.anIntArrayArray164 != null && !Static273.method3912(this.anInt6805, this.anInt6823)) {
			this.anIntArrayArray164 = null;
			this.aShortArray109 = null;
		}
		if (this.anIntArrayArray166 != null && !Static70.method1097(this.anInt6823, this.anInt6805)) {
			this.anIntArrayArray166 = null;
		}
		if (this.anIntArray554 != null && (this.anInt6805 & 0x800) == 0 && (this.anInt6805 & 0x40000) == 0) {
			this.anIntArray554 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class229.anIntArray537[arg0];
		@Pc(13) int local13 = Class229.anIntArray536[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6800; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray551[local15] + this.anIntArray553[local15] * local13 >> 15;
			this.anIntArray551[local15] = local13 * this.anIntArray551[local15] - local9 * this.anIntArray553[local15] >> 15;
			this.anIntArray553[local15] = local34;
		}
		this.aBoolean460 = false;
		if (this.aClass47_14 != null) {
			this.aClass47_14.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method6284(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class63_Sub2 local8 = (Class63_Sub2) arg0;
		if (this.anInt6799 == 0 || local8.anInt6799 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt6800;
		@Pc(27) int[] local27 = local8.anIntArray553;
		@Pc(30) int[] local30 = local8.anIntArray552;
		@Pc(33) int[] local33 = local8.anIntArray551;
		@Pc(36) short[] local36 = local8.aShortArray110;
		@Pc(39) short[] local39 = local8.aShortArray112;
		@Pc(42) short[] local42 = local8.aShortArray108;
		@Pc(45) byte[] local45 = local8.aByteArray82;
		@Pc(52) short[] local52;
		@Pc(54) short[] local54;
		@Pc(56) short[] local56;
		@Pc(50) byte[] local50;
		if (this.aClass85_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local52 = this.aClass85_1.aShortArray33;
			local54 = this.aClass85_1.aShortArray32;
			local56 = this.aClass85_1.aShortArray31;
			local50 = this.aClass85_1.aByteArray25;
		}
		@Pc(89) short[] local89;
		@Pc(81) short[] local81;
		@Pc(85) short[] local85;
		@Pc(93) byte[] local93;
		if (local8.aClass85_1 == null) {
			local81 = null;
			local89 = null;
			local93 = null;
			local85 = null;
		} else {
			local81 = local8.aClass85_1.aShortArray32;
			local85 = local8.aClass85_1.aShortArray31;
			local89 = local8.aClass85_1.aShortArray33;
			local93 = local8.aClass85_1.aByteArray25;
		}
		@Pc(106) int[] local106 = local8.anIntArray550;
		@Pc(109) short[] local109 = local8.aShortArray111;
		if (!local8.aBoolean460) {
			local8.method5467();
		}
		@Pc(118) short local118 = local8.aShort90;
		@Pc(121) short local121 = local8.aShort88;
		@Pc(124) short local124 = local8.aShort91;
		@Pc(127) short local127 = local8.aShort89;
		@Pc(130) short local130 = local8.aShort92;
		@Pc(133) short local133 = local8.aShort94;
		for (@Pc(135) int local135 = 0; local135 < this.anInt6800; local135++) {
			@Pc(145) int local145 = this.anIntArray552[local135] - arg2;
			if (local145 >= local118 && local145 <= local121) {
				@Pc(165) int local165 = this.anIntArray553[local135] - arg1;
				if (local165 >= local124 && local127 >= local165) {
					@Pc(188) int local188 = this.anIntArray551[local135] - arg3;
					if (local130 <= local188 && local188 <= local133) {
						@Pc(202) int local202 = -1;
						@Pc(207) int local207 = this.anIntArray550[local135];
						@Pc(214) int local214 = this.anIntArray550[local135 + 1];
						for (@Pc(216) int local216 = local207; local216 < local214; local216++) {
							local202 = this.aShortArray111[local216] - 1;
							if (local202 == -1 || this.aByteArray82[local202] != 0) {
								break;
							}
						}
						if (local202 != -1) {
							for (@Pc(248) int local248 = 0; local248 < local24; local248++) {
								if (local27[local248] == local165 && local33[local248] == local188 && local145 == local30[local248]) {
									local214 = local106[local248 + 1];
									@Pc(281) int local281 = -1;
									local207 = local106[local248];
									for (@Pc(287) int local287 = local207; local287 < local214; local287++) {
										local281 = local109[local287] - 1;
										if (local281 == -1 || local45[local281] != 0) {
											break;
										}
									}
									if (local281 != -1) {
										if (local52 == null) {
											this.aClass85_1 = new Class85();
											local52 = this.aClass85_1.aShortArray33 = Static98.method4123(this.aShortArray110);
											local54 = this.aClass85_1.aShortArray32 = Static98.method4123(this.aShortArray112);
											local56 = this.aClass85_1.aShortArray31 = Static98.method4123(this.aShortArray108);
											local50 = this.aClass85_1.aByteArray25 = Static326.method4638(this.aByteArray82);
										}
										if (local89 == null) {
											@Pc(365) Class85 local365 = local8.aClass85_1 = new Class85();
											local89 = local365.aShortArray33 = Static98.method4123(local36);
											local81 = local365.aShortArray32 = Static98.method4123(local39);
											local85 = local365.aShortArray31 = Static98.method4123(local42);
											local93 = local365.aByteArray25 = Static326.method4638(local45);
										}
										@Pc(398) short local398 = this.aShortArray110[local202];
										@Pc(403) short local403 = this.aShortArray112[local202];
										@Pc(408) short local408 = this.aShortArray108[local202];
										@Pc(413) byte local413 = this.aByteArray82[local202];
										local214 = local106[local248 + 1];
										local207 = local106[local248];
										@Pc(433) int local433;
										for (@Pc(425) int local425 = local207; local425 < local214; local425++) {
											local433 = local109[local425] - 1;
											if (local433 == -1) {
												break;
											}
											if (local93[local433] != 0) {
												local89[local433] += local398;
												local81[local433] += local403;
												local85[local433] += local408;
												local93[local433] += local413;
											}
										}
										local214 = this.anIntArray550[local135 + 1];
										local207 = this.anIntArray550[local135];
										local403 = local39[local281];
										local408 = local42[local281];
										local413 = local45[local281];
										local398 = local36[local281];
										for (local433 = local207; local433 < local214; local433++) {
											@Pc(519) int local519 = this.aShortArray111[local433] - 1;
											if (local519 == -1) {
												break;
											}
											if (local50[local519] != 0) {
												local52[local519] += local398;
												local54[local519] += local403;
												local56[local519] += local408;
												local50[local519] += local413;
											}
										}
										if (this.aClass47_11 == null && this.aClass47_13 != null) {
											this.aClass47_13.anInterface12_1 = null;
										}
										if (this.aClass47_11 != null) {
											this.aClass47_11.anInterface12_1 = null;
										}
										if (local8.aClass47_11 == null && local8.aClass47_13 != null) {
											local8.aClass47_13.anInterface12_1 = null;
										}
										if (local8.aClass47_11 != null) {
											local8.aClass47_11.anInterface12_1 = null;
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

	@OriginalMember(owner = "client!to", name = "d", descriptor = "()V")
	@Override
	public void method6298() {
		if (this.anInt6833 <= 0 || this.anInt6818 <= 0) {
			return;
		}
		this.method5470(false);
		if ((this.aByte83 & 0x10) == 0 && this.aClass144_1.anInterface11_1 == null) {
			this.method5469(false);
		}
		this.method5476();
	}
}
