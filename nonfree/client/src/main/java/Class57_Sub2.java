import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
	private int anInt7590;

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!vs", name = "A", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!vs", name = "E", descriptor = "[I")
	private int[] anIntArray608;

	@OriginalMember(owner = "client!vs", name = "F", descriptor = "[I")
	private int[] anIntArray609;

	@OriginalMember(owner = "client!vs", name = "M", descriptor = "[I")
	private int[] anIntArray610;

	@OriginalMember(owner = "client!vs", name = "P", descriptor = "[B")
	private byte[] aByteArray95;

	@OriginalMember(owner = "client!vs", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!vs", name = "S", descriptor = "B")
	private byte aByte102;

	@OriginalMember(owner = "client!vs", name = "U", descriptor = "Lclient!wk;")
	private Class272 aClass272_1;

	@OriginalMember(owner = "client!vs", name = "Y", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!vs", name = "Z", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!vs", name = "fb", descriptor = "Lclient!us;")
	private Interface9 anInterface9_7;

	@OriginalMember(owner = "client!vs", name = "jb", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!vs", name = "kb", descriptor = "[I")
	private int[] anIntArray611;

	@OriginalMember(owner = "client!vs", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!vs", name = "nb", descriptor = "I")
	private int anInt7617;

	@OriginalMember(owner = "client!vs", name = "ob", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!vs", name = "qb", descriptor = "[Lclient!to;")
	private Class245[] aClass245Array1;

	@OriginalMember(owner = "client!vs", name = "tb", descriptor = "[F")
	private float[] aFloatArray44;

	@OriginalMember(owner = "client!vs", name = "ub", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!vs", name = "yb", descriptor = "Lclient!vn;")
	private Interface11 anInterface11_5;

	@OriginalMember(owner = "client!vs", name = "zb", descriptor = "[Lclient!wd;")
	private Class267[] aClass267Array1;

	@OriginalMember(owner = "client!vs", name = "Bb", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!vs", name = "Jb", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!vs", name = "Ob", descriptor = "[B")
	private byte[] aByteArray96;

	@OriginalMember(owner = "client!vs", name = "Pb", descriptor = "[I")
	private int[] anIntArray612;

	@OriginalMember(owner = "client!vs", name = "Rb", descriptor = "[Lclient!eh;")
	private Class61[] aClass61Array4;

	@OriginalMember(owner = "client!vs", name = "Sb", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!vs", name = "Tb", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!vs", name = "Vb", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!vs", name = "Wb", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!vs", name = "fc", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!vs", name = "gc", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!vs", name = "hc", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!vs", name = "ic", descriptor = "I")
	private int anInt7644;

	@OriginalMember(owner = "client!vs", name = "oc", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!vs", name = "pc", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!vs", name = "qc", descriptor = "[Lclient!tb;")
	private Class239[] aClass239Array4;

	@OriginalMember(owner = "client!vs", name = "tc", descriptor = "[F")
	private float[] aFloatArray45;

	@OriginalMember(owner = "client!vs", name = "vc", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!vs", name = "B", descriptor = "I")
	private int anInt7595 = 0;

	@OriginalMember(owner = "client!vs", name = "rb", descriptor = "I")
	private int anInt7619 = 0;

	@OriginalMember(owner = "client!vs", name = "N", descriptor = "I")
	private int anInt7604 = 0;

	@OriginalMember(owner = "client!vs", name = "Yb", descriptor = "I")
	private int anInt7637 = 0;

	@OriginalMember(owner = "client!vs", name = "jc", descriptor = "I")
	private int anInt7645 = 0;

	@OriginalMember(owner = "client!vs", name = "gb", descriptor = "Z")
	private boolean aBoolean560 = true;

	@OriginalMember(owner = "client!vs", name = "lc", descriptor = "Z")
	private boolean aBoolean561 = false;

	@OriginalMember(owner = "client!vs", name = "cb", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_43;

	@OriginalMember(owner = "client!vs", name = "Lb", descriptor = "Lclient!jd;")
	private Class118 aClass118_15;

	@OriginalMember(owner = "client!vs", name = "Mb", descriptor = "Lclient!jd;")
	private Class118 aClass118_16;

	@OriginalMember(owner = "client!vs", name = "t", descriptor = "Lclient!jd;")
	private Class118 aClass118_13;

	@OriginalMember(owner = "client!vs", name = "mb", descriptor = "Lclient!jd;")
	private Class118 aClass118_14;

	@OriginalMember(owner = "client!vs", name = "y", descriptor = "Lclient!jl;")
	private Class123 aClass123_1;

	static {
		new Class21("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class57_Sub2(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aClass30_Sub1_43 = arg0;
		this.aClass118_15 = new Class118(null, 5126, 3, 0);
		this.aClass118_16 = new Class118(null, 5126, 2, 0);
		this.aClass118_13 = new Class118(null, 5126, 3, 0);
		this.aClass118_14 = new Class118(null, 5121, 4, 0);
		this.aClass123_1 = new Class123();
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!bt;Lclient!ch;IIII)V")
	public Class57_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7644 = arg2;
		this.anInt7590 = arg5;
		this.aClass30_Sub1_43 = arg0;
		if (Static78.method1655(arg2, arg5)) {
			this.aClass118_15 = new Class118(null, 5126, 3, 0);
		}
		if (Static329.method4879(arg5, arg2)) {
			this.aClass118_16 = new Class118(null, 5126, 2, 0);
		}
		if (Static322.method4802(arg5, arg2)) {
			this.aClass118_13 = new Class118(null, 5126, 3, 0);
		}
		if (Static275.method4382(arg5, arg2)) {
			this.aClass118_14 = new Class118(null, 5121, 4, 0);
		}
		if (Static456.method6196(arg2, arg5)) {
			this.aClass123_1 = new Class123();
		}
		@Pc(102) Interface4 local102 = arg0.anInterface4_5;
		@Pc(106) int[] local106 = new int[arg1.anInt1041];
		this.anIntArray610 = new int[arg1.anInt1042 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt1041; local115++) {
			if ((arg1.aByteArray8 == null || arg1.aByteArray8[local115] != 2) && (arg1.aShortArray11 == null || arg1.aShortArray11[local115] == -1 || !local102.method5685(arg1.aShortArray11[local115] & 0xFFFF).aBoolean328)) {
				local106[this.anInt7637++] = local115;
				this.anIntArray610[arg1.aShortArray9[local115]]++;
				this.anIntArray610[arg1.aShortArray4[local115]]++;
				this.anIntArray610[arg1.aShortArray3[local115]]++;
			}
		}
		this.anInt7619 = this.anInt7637;
		@Pc(205) long[] local205 = new long[this.anInt7637];
		@Pc(217) boolean local217 = (this.anInt7644 & 0x100) != 0;
		@Pc(229) int local229;
		@Pc(240) int local240;
		@Pc(365) int local365;
		label493: for (@Pc(219) int local219 = 0; local219 < this.anInt7637; local219++) {
			@Pc(225) int local225 = local106[local219];
			@Pc(227) Class160 local227 = null;
			local229 = 0;
			@Pc(231) byte local231 = 0;
			@Pc(233) byte local233 = 0;
			@Pc(235) byte local235 = 0;
			if (arg1.aClass158Array1 != null) {
				for (local240 = 0; local240 < arg1.aClass158Array1.length; local240++) {
					@Pc(247) Class158 local247 = arg1.aClass158Array1[local240];
					if (local225 == local247.anInt4729) {
						@Pc(256) Class203 local256 = Static273.method4373(local247.anInt4732);
						if (local256.aBoolean439) {
							local205[local219] = Long.MAX_VALUE;
							this.anInt7619--;
							continue label493;
						}
					}
				}
			}
			@Pc(279) short local279 = -1;
			if (arg1.aShortArray11 != null) {
				local279 = arg1.aShortArray11[local225];
				if (local279 != -1) {
					local227 = local102.method5685(local279 & 0xFFFF);
					local233 = local227.aByte51;
					local235 = local227.aByte52;
				}
			}
			@Pc(327) boolean local327 = arg1.aByteArray12 != null && arg1.aByteArray12[local225] != 0 || local227 != null && !local227.aBoolean327 | local227.aBoolean320;
			if ((local217 || local327) && arg1.aByteArray9 != null) {
				local229 += arg1.aByteArray9[local225] << 17;
			}
			if (local327) {
				local229 += 65536;
			}
			local229 += (local233 & 0xFF) << 8;
			local365 = local231 + ((local279 & 0xFFFF) << 16);
			local229 += local235 & 0xFF;
			@Pc(377) int local377 = local365 + (local219 & 0xFFFF);
			local205[local219] = ((long) local229 << 32) + (long) local377;
		}
		Static345.method5039(local205, local106);
		this.anInt7604 = arg1.anInt1042;
		this.anIntArray611 = arg1.anIntArray69;
		this.anInt7595 = arg1.anInt1051;
		this.anIntArray609 = arg1.anIntArray66;
		this.anIntArray612 = arg1.anIntArray67;
		this.aShortArray113 = arg1.aShortArray2;
		this.aClass61Array4 = arg1.aClass61Array1;
		@Pc(428) Class104[] local428 = new Class104[this.anInt7604];
		this.aClass239Array4 = arg1.aClass239Array1;
		@Pc(452) int local452;
		@Pc(466) int local466;
		if (arg1.aClass158Array1 != null) {
			this.anInt7617 = arg1.aClass158Array1.length;
			this.aClass267Array1 = new Class267[this.anInt7617];
			this.aClass245Array1 = new Class245[this.anInt7617];
			for (local452 = 0; local452 < this.anInt7617; local452++) {
				@Pc(459) Class158 local459 = arg1.aClass158Array1[local452];
				@Pc(464) Class203 local464 = Static273.method4373(local459.anInt4732);
				local466 = -1;
				for (@Pc(468) int local468 = 0; local468 < this.anInt7637; local468++) {
					if (local106[local468] == local459.anInt4729) {
						local466 = local468;
						break;
					}
				}
				if (local466 == -1) {
					throw new RuntimeException();
				}
				local240 = Static323.anIntArray198[arg1.aShortArray10[local459.anInt4729] & 0xFFFF] & 0xFFFFFF;
				local240 |= 255 - (arg1.aByteArray12 == null ? 0 : arg1.aByteArray12[local459.anInt4729]) << 24;
				this.aClass245Array1[local452] = new Class245(local466, arg1.aShortArray9[local459.anInt4729], arg1.aShortArray4[local459.anInt4729], arg1.aShortArray3[local459.anInt4729], local464.anInt5853, local464.anInt5857, local464.anInt5856, local464.anInt5860, local464.anInt5859, local464.aBoolean439, local464.aBoolean438, local459.anInt4734);
				this.aClass267Array1[local452] = new Class267(local240);
			}
		}
		local452 = this.anInt7637 * 3;
		this.aShortArray115 = new short[local452];
		if (arg1.aShortArray8 != null) {
			this.aShortArray116 = new short[this.anInt7637];
		}
		this.aShortArray107 = new short[local452];
		this.aByteArray96 = new byte[this.anInt7637];
		this.aFloatArray44 = new float[local452];
		this.aShortArray111 = new short[this.anInt7637];
		this.aFloatArray45 = new float[local452];
		this.aShortArray108 = new short[this.anInt7637];
		this.lb = new short[local452];
		this.aShortArray112 = new short[local452];
		this.aShortArray114 = new short[this.anInt7637];
		this.aShortArray110 = new short[this.anInt7637];
		this.aShort100 = (short) arg3;
		Static125.aLongArray1 = new long[local452];
		this.aShortArray109 = new short[this.anInt7637];
		this.aShort102 = (short) arg4;
		this.aByteArray95 = new byte[local452];
		local229 = 0;
		for (local365 = 0; local365 < arg1.anInt1042; local365++) {
			local466 = this.anIntArray610[local365];
			this.anIntArray610[local365] = local229;
			local229 += local466;
			local428[local365] = new Class104();
		}
		this.anIntArray610[arg1.anInt1042] = local229;
		@Pc(698) int[] local698 = null;
		@Pc(700) int[] local700 = null;
		@Pc(702) int[] local702 = null;
		@Pc(704) float[][] local704 = null;
		@Pc(730) int local730;
		@Pc(766) int local766;
		@Pc(772) int local772;
		@Pc(785) int local785;
		@Pc(787) int local787;
		@Pc(823) int local823;
		@Pc(828) int local828;
		@Pc(986) float local986;
		@Pc(994) float local994;
		@Pc(1002) float local1002;
		if (arg1.aByteArray7 != null) {
			@Pc(710) int local710 = arg1.anInt1038;
			@Pc(713) int[] local713 = new int[local710];
			@Pc(716) int[] local716 = new int[local710];
			@Pc(719) int[] local719 = new int[local710];
			@Pc(722) int[] local722 = new int[local710];
			@Pc(725) int[] local725 = new int[local710];
			@Pc(728) int[] local728 = new int[local710];
			for (local730 = 0; local730 < local710; local730++) {
				local713[local730] = Integer.MAX_VALUE;
				local716[local730] = -2147483647;
				local719[local730] = Integer.MAX_VALUE;
				local722[local730] = -2147483647;
				local725[local730] = Integer.MAX_VALUE;
				local728[local730] = -2147483647;
			}
			for (local766 = 0; local766 < this.anInt7637; local766++) {
				local772 = local106[local766];
				if (arg1.aByteArray7[local772] != -1) {
					local785 = arg1.aByteArray7[local772] & 0xFF;
					for (local787 = 0; local787 < 3; local787++) {
						@Pc(799) short local799;
						if (local787 == 0) {
							local799 = arg1.aShortArray9[local772];
						} else if (local787 == 1) {
							local799 = arg1.aShortArray4[local772];
						} else {
							local799 = arg1.aShortArray3[local772];
						}
						local823 = arg1.anIntArray69[local799];
						local828 = arg1.anIntArray67[local799];
						@Pc(833) int local833 = arg1.anIntArray66[local799];
						if (local823 < local713[local785]) {
							local713[local785] = local823;
						}
						if (local823 > local716[local785]) {
							local716[local785] = local823;
						}
						if (local719[local785] > local828) {
							local719[local785] = local828;
						}
						if (local828 > local722[local785]) {
							local722[local785] = local828;
						}
						if (local725[local785] > local833) {
							local725[local785] = local833;
						}
						if (local833 > local728[local785]) {
							local728[local785] = local833;
						}
					}
				}
			}
			local704 = new float[local710][];
			local702 = new int[local710];
			local698 = new int[local710];
			local700 = new int[local710];
			for (local772 = 0; local772 < local710; local772++) {
				@Pc(927) byte local927 = arg1.aByteArray11[local772];
				if (local927 > 0) {
					local698[local772] = (local713[local772] + local716[local772]) / 2;
					local700[local772] = (local719[local772] + local722[local772]) / 2;
					local702[local772] = (local725[local772] + local728[local772]) / 2;
					if (local927 == 1) {
						local828 = arg1.anIntArray63[local772];
						local994 = 64.0F / (float) arg1.anIntArray73[local772];
						if (local828 == 0) {
							local986 = 1.0F;
							local1002 = 1.0F;
						} else if (local828 > 0) {
							local986 = 1.0F;
							local1002 = (float) local828 / 1024.0F;
						} else {
							local986 = (float) -local828 / 1024.0F;
							local1002 = 1.0F;
						}
					} else if (local927 == 2) {
						local986 = 64.0F / (float) arg1.anIntArray63[local772];
						local994 = 64.0F / (float) arg1.anIntArray73[local772];
						local1002 = 64.0F / (float) arg1.anIntArray68[local772];
					} else {
						local986 = (float) arg1.anIntArray63[local772] / 1024.0F;
						local1002 = (float) arg1.anIntArray68[local772] / 1024.0F;
						local994 = (float) arg1.anIntArray73[local772] / 1024.0F;
					}
					local704[local772] = Static262.method4243(arg1.aByteArray13[local772] & 0xFF, arg1.aShortArray5[local772], arg1.aShortArray6[local772], local994, local986, arg1.aShortArray7[local772], local1002);
				}
			}
		}
		@Pc(1104) Class244[] local1104 = new Class244[arg1.anInt1041];
		@Pc(1123) short local1123;
		@Pc(1134) int local1134;
		@Pc(1145) int local1145;
		@Pc(1204) int local1204;
		for (@Pc(1106) int local1106 = 0; local1106 < arg1.anInt1041; local1106++) {
			@Pc(1113) short local1113 = arg1.aShortArray9[local1106];
			@Pc(1118) short local1118 = arg1.aShortArray4[local1106];
			local1123 = arg1.aShortArray3[local1106];
			local1134 = this.anIntArray611[local1118] - this.anIntArray611[local1113];
			local1145 = this.anIntArray612[local1118] - this.anIntArray612[local1113];
			local730 = this.anIntArray609[local1118] - this.anIntArray609[local1113];
			local766 = this.anIntArray611[local1123] - this.anIntArray611[local1113];
			local772 = this.anIntArray612[local1123] - this.anIntArray612[local1113];
			local785 = this.anIntArray609[local1123] - this.anIntArray609[local1113];
			local787 = local1145 * local785 - local772 * local730;
			local1204 = local730 * local766 - local785 * local1134;
			local823 = local1134 * local772 - local1145 * local766;
			while (local787 > 8192 || local1204 > 8192 || local823 > 8192 || local787 < -8192 || local1204 < -8192 || local823 < -8192) {
				local787 >>= 0x1;
				local823 >>= 0x1;
				local1204 >>= 0x1;
			}
			local828 = (int) Math.sqrt((double) (local823 * local823 + local787 * local787 + local1204 * local1204));
			if (local828 <= 0) {
				local828 = 1;
			}
			local787 = local787 * 256 / local828;
			local1204 = local1204 * 256 / local828;
			local823 = local823 * 256 / local828;
			@Pc(1299) byte local1299 = arg1.aByteArray8 == null ? 0 : arg1.aByteArray8[local1106];
			if (local1299 == 0) {
				@Pc(1329) Class104 local1329 = local428[local1113];
				local1329.anInt3261 += local1204;
				local1329.anInt3264++;
				local1329.anInt3266 += local787;
				local1329.anInt3265 += local823;
				@Pc(1357) Class104 local1357 = local428[local1118];
				local1357.anInt3266 += local787;
				local1357.anInt3265 += local823;
				local1357.anInt3261 += local1204;
				local1357.anInt3264++;
				@Pc(1385) Class104 local1385 = local428[local1123];
				local1385.anInt3265 += local823;
				local1385.anInt3266 += local787;
				local1385.anInt3261 += local1204;
				local1385.anInt3264++;
			} else if (local1299 == 1) {
				@Pc(1314) Class244 local1314 = local1104[local1106] = new Class244();
				local1314.anInt7074 = local823;
				local1314.anInt7072 = local1204;
				local1314.anInt7073 = local787;
			}
		}
		@Pc(1422) int local1422;
		for (@Pc(1416) int local1416 = 0; local1416 < this.anInt7637; local1416++) {
			local1422 = local106[local1416];
			@Pc(1429) int local1429 = arg1.aShortArray10[local1422] & 0xFFFF;
			@Pc(1434) short local1434;
			if (arg1.aShortArray11 == null) {
				local1434 = -1;
			} else {
				local1434 = arg1.aShortArray11[local1422];
			}
			if (arg1.aByteArray7 == null) {
				local1145 = -1;
			} else {
				local1145 = arg1.aByteArray7[local1422];
			}
			if (arg1.aByteArray12 == null) {
				local730 = 0;
			} else {
				local730 = arg1.aByteArray12[local1422] & 0xFF;
			}
			@Pc(1469) float local1469 = 0.0F;
			@Pc(1471) float local1471 = 0.0F;
			@Pc(1473) float local1473 = 0.0F;
			local986 = 0.0F;
			local994 = 0.0F;
			local1002 = 0.0F;
			@Pc(1481) byte local1481 = 0;
			@Pc(1483) byte local1483 = 0;
			@Pc(1485) int local1485 = 0;
			@Pc(1501) byte local1501;
			@Pc(1521) short local1521;
			@Pc(1526) short local1526;
			@Pc(1531) short local1531;
			if (local1434 != -1) {
				if (local1145 == -1) {
					local1469 = 0.0F;
					local1002 = 0.0F;
					local1483 = 2;
					local1481 = 1;
					local994 = 0.0F;
					local986 = 1.0F;
					local1471 = 1.0F;
					local1473 = 1.0F;
				} else {
					local1145 &= 0xFF;
					local1501 = arg1.aByteArray11[local1145];
					@Pc(1511) short local1511;
					@Pc(1516) short local1516;
					@Pc(1554) float local1554;
					@Pc(1562) float local1562;
					@Pc(1570) float local1570;
					@Pc(1655) float local1655;
					@Pc(1663) float local1663;
					@Pc(1671) float local1671;
					@Pc(1679) float local1679;
					@Pc(1688) float local1688;
					@Pc(1697) float local1697;
					if (local1501 == 0) {
						local1511 = arg1.aShortArray9[local1422];
						local1516 = arg1.aShortArray4[local1422];
						local1521 = arg1.aShortArray3[local1422];
						local1526 = arg1.aShortArray7[local1145];
						local1531 = arg1.aShortArray5[local1145];
						@Pc(1536) short local1536 = arg1.aShortArray6[local1145];
						@Pc(1542) float local1542 = (float) arg1.anIntArray69[local1526];
						@Pc(1548) float local1548 = (float) arg1.anIntArray67[local1526];
						local1554 = arg1.anIntArray66[local1526];
						local1562 = (float) arg1.anIntArray69[local1531] - local1542;
						local1570 = (float) arg1.anIntArray67[local1531] - local1548;
						@Pc(1579) float local1579 = (float) arg1.anIntArray66[local1531] - local1554;
						@Pc(1588) float local1588 = (float) arg1.anIntArray69[local1536] - local1542;
						@Pc(1597) float local1597 = (float) arg1.anIntArray67[local1536] - local1548;
						@Pc(1605) float local1605 = (float) arg1.anIntArray66[local1536] - local1554;
						@Pc(1613) float local1613 = (float) arg1.anIntArray69[local1511] - local1542;
						@Pc(1621) float local1621 = (float) arg1.anIntArray67[local1511] - local1548;
						@Pc(1629) float local1629 = (float) arg1.anIntArray66[local1511] - local1554;
						@Pc(1638) float local1638 = (float) arg1.anIntArray69[local1516] - local1542;
						@Pc(1647) float local1647 = (float) arg1.anIntArray67[local1516] - local1548;
						local1655 = (float) arg1.anIntArray66[local1516] - local1554;
						local1663 = (float) arg1.anIntArray69[local1521] - local1542;
						local1671 = (float) arg1.anIntArray67[local1521] - local1548;
						local1679 = (float) arg1.anIntArray66[local1521] - local1554;
						local1688 = local1605 * local1570 - local1579 * local1597;
						local1697 = local1579 * local1588 - local1605 * local1562;
						@Pc(1706) float local1706 = local1562 * local1597 - local1588 * local1570;
						@Pc(1714) float local1714 = local1706 * local1597 - local1697 * local1605;
						@Pc(1723) float local1723 = local1688 * local1605 - local1706 * local1588;
						@Pc(1731) float local1731 = local1588 * local1697 - local1597 * local1688;
						@Pc(1745) float local1745 = 1.0F / (local1731 * local1579 + local1714 * local1562 + local1570 * local1723);
						local994 = local1745 * (local1714 * local1663 + local1671 * local1723 + local1679 * local1731);
						local1473 = (local1638 * local1714 + local1647 * local1723 + local1731 * local1655) * local1745;
						local1469 = (local1723 * local1621 + local1613 * local1714 + local1629 * local1731) * local1745;
						@Pc(1795) float local1795 = local1562 * local1697 - local1570 * local1688;
						@Pc(1803) float local1803 = local1579 * local1688 - local1706 * local1562;
						@Pc(1811) float local1811 = local1570 * local1706 - local1697 * local1579;
						@Pc(1825) float local1825 = 1.0F / (local1605 * local1795 + local1597 * local1803 + local1811 * local1588);
						local1002 = (local1679 * local1795 + local1811 * local1663 + local1671 * local1803) * local1825;
						local1471 = (local1795 * local1629 + local1621 * local1803 + local1811 * local1613) * local1825;
						local986 = local1825 * (local1655 * local1795 + local1803 * local1647 + local1811 * local1638);
					} else {
						local1511 = arg1.aShortArray9[local1422];
						local1516 = arg1.aShortArray4[local1422];
						local1521 = arg1.aShortArray3[local1422];
						@Pc(1888) int local1888 = local698[local1145];
						@Pc(1892) int local1892 = local700[local1145];
						@Pc(1896) int local1896 = local702[local1145];
						@Pc(1900) float[] local1900 = local704[local1145];
						@Pc(1905) byte local1905 = arg1.aByteArray10[local1145];
						local1554 = (float) arg1.anIntArray64[local1145] / 256.0F;
						if (local1501 == 1) {
							local1562 = (float) arg1.anIntArray68[local1145] / 1024.0F;
							Static16.method273(arg1.anIntArray66[local1511], arg1.anIntArray69[local1511], local1888, local1905, local1554, local1896, local1892, local1900, local1562, arg1.anIntArray67[local1511]);
							local1471 = Static107.aFloat44;
							local1469 = Static433.aFloat30;
							Static16.method273(arg1.anIntArray66[local1516], arg1.anIntArray69[local1516], local1888, local1905, local1554, local1896, local1892, local1900, local1562, arg1.anIntArray67[local1516]);
							local986 = Static107.aFloat44;
							local1473 = Static433.aFloat30;
							Static16.method273(arg1.anIntArray66[local1521], arg1.anIntArray69[local1521], local1888, local1905, local1554, local1896, local1892, local1900, local1562, arg1.anIntArray67[local1521]);
							local994 = Static433.aFloat30;
							local1002 = Static107.aFloat44;
							local1570 = local1562 / 2.0F;
							if ((local1905 & 0x1) == 0) {
								if (local1570 < local994 - local1469) {
									local1483 = 1;
									local994 -= local1562;
								} else if (local1469 - local994 > local1570) {
									local1483 = 2;
									local994 += local1562;
								}
								if (local1570 < local1473 - local1469) {
									local1481 = 1;
									local1473 -= local1562;
								} else if (local1570 < local1469 - local1473) {
									local1473 += local1562;
									local1481 = 2;
								}
							} else {
								if (local986 - local1471 > local1570) {
									local1481 = 1;
									local986 -= local1562;
								} else if (local1471 - local986 > local1570) {
									local986 += local1562;
									local1481 = 2;
								}
								if (local1002 - local1471 > local1570) {
									local1002 -= local1562;
									local1483 = 1;
								} else if (local1570 < local1471 - local1002) {
									local1002 += local1562;
									local1483 = 2;
								}
							}
						} else if (local1501 == 2) {
							local1562 = (float) arg1.anIntArray70[local1145] / 256.0F;
							local1570 = (float) arg1.anIntArray65[local1145] / 256.0F;
							@Pc(1950) int local1950 = arg1.anIntArray69[local1516] - arg1.anIntArray69[local1511];
							@Pc(1961) int local1961 = arg1.anIntArray67[local1516] - arg1.anIntArray67[local1511];
							@Pc(1972) int local1972 = arg1.anIntArray66[local1516] - arg1.anIntArray66[local1511];
							@Pc(1982) int local1982 = arg1.anIntArray69[local1521] - arg1.anIntArray69[local1511];
							@Pc(1993) int local1993 = arg1.anIntArray67[local1521] - arg1.anIntArray67[local1511];
							@Pc(2003) int local2003 = arg1.anIntArray66[local1521] - arg1.anIntArray66[local1511];
							@Pc(2012) int local2012 = local2003 * local1961 - local1972 * local1993;
							@Pc(2020) int local2020 = local1972 * local1982 - local1950 * local2003;
							@Pc(2029) int local2029 = local1950 * local1993 - local1961 * local1982;
							local1655 = 64.0F / (float) arg1.anIntArray63[local1145];
							local1663 = 64.0F / (float) arg1.anIntArray73[local1145];
							local1671 = 64.0F / (float) arg1.anIntArray68[local1145];
							local1679 = (local1900[1] * (float) local2020 + local1900[0] * (float) local2012 + local1900[2] * (float) local2029) / local1655;
							local1688 = (local1900[3] * (float) local2012 + local1900[4] * (float) local2020 + local1900[5] * (float) local2029) / local1663;
							local1697 = ((float) local2029 * local1900[8] + local1900[7] * (float) local2020 + (float) local2012 * local1900[6]) / local1671;
							local1485 = Static171.method3017(local1688, local1679, local1697);
							Static233.method3943(local1554, arg1.anIntArray69[local1511], local1570, local1896, local1562, local1892, local1485, local1888, arg1.anIntArray67[local1511], local1905, local1900, arg1.anIntArray66[local1511]);
							local1471 = Static360.aFloat86;
							local1469 = Static428.aFloat93;
							Static233.method3943(local1554, arg1.anIntArray69[local1516], local1570, local1896, local1562, local1892, local1485, local1888, arg1.anIntArray67[local1516], local1905, local1900, arg1.anIntArray66[local1516]);
							local986 = Static360.aFloat86;
							local1473 = Static428.aFloat93;
							Static233.method3943(local1554, arg1.anIntArray69[local1521], local1570, local1896, local1562, local1892, local1485, local1888, arg1.anIntArray67[local1521], local1905, local1900, arg1.anIntArray66[local1521]);
							local1002 = Static360.aFloat86;
							local994 = Static428.aFloat93;
						} else if (local1501 == 3) {
							Static77.method1648(local1888, local1900, local1905, local1554, arg1.anIntArray66[local1511], arg1.anIntArray67[local1511], local1892, local1896, arg1.anIntArray69[local1511]);
							local1471 = Static46.aFloat28;
							local1469 = Static361.aFloat87;
							Static77.method1648(local1888, local1900, local1905, local1554, arg1.anIntArray66[local1516], arg1.anIntArray67[local1516], local1892, local1896, arg1.anIntArray69[local1516]);
							local986 = Static46.aFloat28;
							local1473 = Static361.aFloat87;
							Static77.method1648(local1888, local1900, local1905, local1554, arg1.anIntArray66[local1521], arg1.anIntArray67[local1521], local1892, local1896, arg1.anIntArray69[local1521]);
							local994 = Static361.aFloat87;
							local1002 = Static46.aFloat28;
							if ((local1905 & 0x1) == 0) {
								if (local994 - local1469 > 0.5F) {
									local994--;
									local1483 = 1;
								} else if (local1469 - local994 > 0.5F) {
									local994++;
									local1483 = 2;
								}
								if (local1473 - local1469 > 0.5F) {
									local1473--;
									local1481 = 1;
								} else if (local1469 - local1473 > 0.5F) {
									local1481 = 2;
									local1473++;
								}
							} else {
								if (local986 - local1471 > 0.5F) {
									local986--;
									local1481 = 1;
								} else if (local1471 - local986 > 0.5F) {
									local1481 = 2;
									local986++;
								}
								if (local1002 - local1471 > 0.5F) {
									local1483 = 1;
									local1002--;
								} else if (local1471 - local1002 > 0.5F) {
									local1002++;
									local1483 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray8 == null) {
				local1501 = 0;
			} else {
				local1501 = arg1.aByteArray8[local1422];
			}
			if (local1501 == 0) {
				@Pc(2666) long local2666 = (long) (local1145 << 2) + ((long) local730 + (long) (local1429 << 8) + (long) (local1485 << 24) << 32);
				local1521 = arg1.aShortArray9[local1422];
				local1526 = arg1.aShortArray4[local1422];
				local1531 = arg1.aShortArray3[local1422];
				@Pc(2685) Class104 local2685 = local428[local1521];
				this.aShortArray108[local1416] = this.method6093(local2685.anInt3261, local1471, local2666, arg1, local1469, local2685.anInt3264, local2685.anInt3265, local1521, local2685.anInt3266);
				@Pc(2709) Class104 local2709 = local428[local1526];
				this.aShortArray109[local1416] = this.method6093(local2709.anInt3261, local986, local2666 + (long) local1481, arg1, local1473, local2709.anInt3264, local2709.anInt3265, local1526, local2709.anInt3266);
				@Pc(2736) Class104 local2736 = local428[local1531];
				this.aShortArray110[local1416] = this.method6093(local2736.anInt3261, local1002, local2666 + (long) local1483, arg1, local994, local2736.anInt3264, local2736.anInt3265, local1531, local2736.anInt3266);
			} else if (local1501 == 1) {
				@Pc(2768) Class244 local2768 = local1104[local1422];
				@Pc(2814) long local2814 = (long) ((local1145 << 2) + (local2768.anInt7073 <= 0 ? 2048 : 1024) + (local2768.anInt7072 + 256 << 12) + (local2768.anInt7074 + 256 << 22)) + ((long) local730 + (long) (local1485 << 24) + (long) (local1429 << 8) << 32);
				this.aShortArray108[local1416] = this.method6093(local2768.anInt7072, local1471, local2814, arg1, local1469, 0, local2768.anInt7074, arg1.aShortArray9[local1422], local2768.anInt7073);
				this.aShortArray109[local1416] = this.method6093(local2768.anInt7072, local986, (long) local1481 + local2814, arg1, local1473, 0, local2768.anInt7074, arg1.aShortArray4[local1422], local2768.anInt7073);
				this.aShortArray110[local1416] = this.method6093(local2768.anInt7072, local1002, local2814 + (long) local1483, arg1, local994, 0, local2768.anInt7074, arg1.aShortArray3[local1422], local2768.anInt7073);
			}
			if (arg1.aShortArray11 == null) {
				this.aShortArray114[local1416] = -1;
			} else {
				this.aShortArray114[local1416] = arg1.aShortArray11[local1422];
			}
			if (arg1.aByteArray12 != null) {
				this.aByteArray96[local1416] = arg1.aByteArray12[local1422];
			}
			if (arg1.aShortArray8 != null) {
				this.aShortArray116[local1416] = arg1.aShortArray8[local1422];
			}
			this.aShortArray111[local1416] = arg1.aShortArray10[local1422];
		}
		local1422 = 0;
		local1123 = -10000;
		for (local1134 = 0; local1134 < this.anInt7619; local1134++) {
			@Pc(2952) short local2952 = this.aShortArray114[local1134];
			if (local1123 != local2952) {
				local1422++;
				local1123 = local2952;
			}
		}
		this.anIntArray608 = new int[local1422 + 1];
		local1422 = 0;
		local1123 = -10000;
		for (local1145 = 0; local1145 < this.anInt7619; local1145++) {
			@Pc(2986) short local2986 = this.aShortArray114[local1145];
			if (local1123 != local2986) {
				this.anIntArray608[local1422++] = local1145;
				local1123 = local2986;
			}
		}
		this.anIntArray608[local1422] = this.anInt7619;
		Static125.aLongArray1 = null;
		this.aShortArray107 = Static267.method4287(this.anInt7645, this.aShortArray107);
		this.aShortArray115 = Static267.method4287(this.anInt7645, this.aShortArray115);
		this.aShortArray112 = Static267.method4287(this.anInt7645, this.aShortArray112);
		this.aByteArray95 = Static299.method4625(this.aByteArray95, this.anInt7645);
		this.aFloatArray45 = Static101.method1902(this.aFloatArray45, this.anInt7645);
		this.aFloatArray44 = Static101.method1902(this.aFloatArray44, this.anInt7645);
		if (arg1.anIntArray72 != null && Static203.method3618(arg2, this.anInt7590)) {
			this.anIntArrayArray60 = arg1.method1012(false);
		}
		if (arg1.aClass158Array1 != null && Static28.method412(this.anInt7590, arg2)) {
			this.anIntArrayArray61 = arg1.method1004();
		}
		if (arg1.anIntArray71 != null && Static160.method2901(arg2, this.anInt7590)) {
			local730 = 0;
			@Pc(3101) int[] local3101 = new int[256];
			for (local772 = 0; local772 < this.anInt7637; local772++) {
				local785 = arg1.anIntArray71[local106[local772]];
				if (local785 >= 0) {
					@Pc(3121) int local3121 = local3101[local785]++;
					if (local785 > local730) {
						local730 = local785;
					}
				}
			}
			this.anIntArrayArray59 = new int[local730 + 1][];
			for (local785 = 0; local785 <= local730; local785++) {
				this.anIntArrayArray59[local785] = new int[local3101[local785]];
				local3101[local785] = 0;
			}
			for (local787 = 0; local787 < this.anInt7637; local787++) {
				local1204 = arg1.anIntArray71[local106[local787]];
				if (local1204 >= 0) {
					this.anIntArrayArray59[local1204][local3101[local1204]++] = local787;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IILclient!n;Z)Z")
	@Override
	public boolean method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class72_Sub2 local8 = (Class72_Sub2) arg2;
		@Pc(12) Class72_Sub2 local12 = this.aClass30_Sub1_43.aClass72_Sub2_3;
		@Pc(33) float local33 = local8.aFloat54 * local12.aFloat50 + local12.aFloat56 * local8.aFloat48 + local8.aFloat46 * local12.aFloat55 + local12.aFloat48;
		@Pc(54) float local54 = local12.aFloat53 * local8.aFloat48 + local12.aFloat47 * local8.aFloat46 + local12.aFloat49 * local8.aFloat54 + local12.aFloat46;
		Static458.aFloat98 = local8.aFloat45 * local12.aFloat49 + local8.aFloat49 * local12.aFloat47 + local8.aFloat50 * local12.aFloat53;
		Static233.aFloat68 = local8.aFloat53 * local12.aFloat47 + local8.aFloat56 * local12.aFloat53 + local12.aFloat49 * local8.aFloat52;
		Static44.aFloat27 = local12.aFloat45 * local8.aFloat52 + local8.aFloat56 * local12.aFloat52 + local12.aFloat51 * local8.aFloat53;
		Static324.aFloat83 = local12.aFloat45 * local8.aFloat51 + local8.aFloat47 * local12.aFloat51 + local12.aFloat52 * local8.aFloat55;
		Static6.aFloat1 = local8.aFloat50 * local12.aFloat52 + local12.aFloat51 * local8.aFloat49 + local8.aFloat45 * local12.aFloat45;
		Static292.aFloat78 = local8.aFloat47 * local12.aFloat55 + local8.aFloat55 * local12.aFloat56 + local8.aFloat51 * local12.aFloat50;
		@Pc(183) float local183 = local12.aFloat54 + local12.aFloat45 * local8.aFloat54 + local12.aFloat51 * local8.aFloat46 + local8.aFloat48 * local12.aFloat52;
		Static384.aFloat90 = local8.aFloat51 * local12.aFloat49 + local8.aFloat55 * local12.aFloat53 + local8.aFloat47 * local12.aFloat47;
		Static317.aFloat79 = local12.aFloat56 * local8.aFloat50 + local8.aFloat49 * local12.aFloat55 + local12.aFloat50 * local8.aFloat45;
		Static452.aFloat97 = local8.aFloat52 * local12.aFloat50 + local12.aFloat55 * local8.aFloat53 + local8.aFloat56 * local12.aFloat56;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass30_Sub1_43.anInt870;
		@Pc(255) int local255 = this.aClass30_Sub1_43.anInt873;
		if (!this.aBoolean561) {
			this.method6099();
		}
		Static456.anIntArray620[0] = this.aShort101;
		Static207.anIntArray322[0] = this.aShort104;
		Static456.anIntArray620[1] = this.aShort103;
		Static190.anIntArray298[0] = this.aShort98;
		Static207.anIntArray322[1] = this.aShort104;
		Static190.anIntArray298[1] = this.aShort98;
		Static456.anIntArray620[2] = this.aShort101;
		Static207.anIntArray322[2] = this.aShort97;
		Static456.anIntArray620[3] = this.aShort103;
		Static190.anIntArray298[2] = this.aShort98;
		Static207.anIntArray322[3] = this.aShort97;
		Static190.anIntArray298[3] = this.aShort98;
		Static456.anIntArray620[4] = this.aShort101;
		Static207.anIntArray322[4] = this.aShort104;
		Static456.anIntArray620[5] = this.aShort103;
		Static190.anIntArray298[4] = this.aShort96;
		Static207.anIntArray322[5] = this.aShort104;
		Static456.anIntArray620[6] = this.aShort101;
		Static190.anIntArray298[5] = this.aShort96;
		Static207.anIntArray322[6] = this.aShort97;
		Static456.anIntArray620[7] = this.aShort103;
		Static190.anIntArray298[6] = this.aShort96;
		Static207.anIntArray322[7] = this.aShort97;
		Static190.anIntArray298[7] = this.aShort96;
		@Pc(414) float local414;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(395) float local395;
		@Pc(390) float local390;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static207.anIntArray322[local383];
			local395 = Static456.anIntArray620[local383];
			local400 = Static190.anIntArray298[local383];
			local414 = local33 + local400 * Static317.aFloat79 + local395 * Static452.aFloat97 + local390 * Static292.aFloat78;
			local428 = Static324.aFloat83 * local390 + local395 * Static44.aFloat27 + local400 * Static6.aFloat1 + local183;
			local442 = local54 + Static458.aFloat98 * local400 + Static384.aFloat90 * local390 + Static233.aFloat68 * local395;
			if ((float) this.aClass30_Sub1_43.anInt877 <= local428) {
				@Pc(461) float local461 = (float) local251 * local414 / local428 + (float) this.aClass30_Sub1_43.anInt852;
				@Pc(473) float local473 = (float) this.aClass30_Sub1_43.anInt866 + (float) local255 * local442 / local428;
				if (local241 > local461) {
					local241 = local461;
				}
				if (local243 < local461) {
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
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.aClass30_Sub1_43.anIntArray47.length < this.anInt7645) {
				this.aClass30_Sub1_43.anIntArray46 = new int[this.anInt7645];
				this.aClass30_Sub1_43.anIntArray47 = new int[this.anInt7645];
			}
			@Pc(554) int[] local554 = this.aClass30_Sub1_43.anIntArray47;
			@Pc(558) int[] local558 = this.aClass30_Sub1_43.anIntArray46;
			@Pc(642) int local642;
			for (@Pc(560) int local560 = 0; local560 < this.anInt7604; local560++) {
				local395 = this.anIntArray611[local560];
				local400 = this.anIntArray609[local560];
				local390 = this.anIntArray612[local560];
				local428 = local183 + local400 * Static6.aFloat1 + local390 * Static324.aFloat83 + local395 * Static44.aFloat27;
				local442 = local54 + local390 * Static384.aFloat90 + local395 * Static233.aFloat68 + Static458.aFloat98 * local400;
				local414 = Static292.aFloat78 * local390 + local395 * Static452.aFloat97 + local400 * Static317.aFloat79 + local33;
				@Pc(655) int local655;
				@Pc(660) int local660;
				@Pc(667) int local667;
				if (local428 >= (float) this.aClass30_Sub1_43.anInt877) {
					local642 = (int) (local414 * (float) local251 / local428 + (float) this.aClass30_Sub1_43.anInt852);
					local655 = (int) ((float) this.aClass30_Sub1_43.anInt866 + local442 * (float) local255 / local428);
					local660 = this.anIntArray610[local560];
					local667 = this.anIntArray610[local560 + 1];
					for (@Pc(669) int local669 = local660; local669 < local667; local669++) {
						@Pc(678) int local678 = this.lb[local669] - 1;
						if (local678 == -1) {
							break;
						}
						local554[local678] = local642;
						local558[local678] = local655;
					}
				} else {
					local642 = this.anIntArray610[local560];
					local655 = this.anIntArray610[local560 + 1];
					for (local660 = local642; local660 < local655; local660++) {
						local667 = this.lb[local660] - 1;
						if (local667 == -1) {
							break;
						}
						local554[this.lb[local660] - 1] = -999999;
					}
				}
			}
			for (local642 = 0; local642 < this.anInt7637; local642++) {
				if (local554[this.aShortArray108[local642]] != -999999 && local554[this.aShortArray109[local642]] != -999999 && local554[this.aShortArray110[local642]] != -999999 && this.method6103(local554[this.aShortArray110[local642]], arg1, local558[this.aShortArray109[local642]], local558[this.aShortArray110[local642]], local558[this.aShortArray108[local642]], local554[this.aShortArray108[local642]], local554[this.aShortArray109[local642]], arg0)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "(IILclient!o;Lclient!o;III)V")
	@Override
	public void g(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean561) {
			this.method6099();
		}
		@Pc(16) int local16 = arg4 + this.aShort101;
		@Pc(21) int local21 = this.aShort103 + arg4;
		@Pc(26) int local26 = arg6 + this.aShort98;
		@Pc(31) int local31 = arg6 + this.aShort96;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt2832 <= local21 + arg2.anInt2831 >> arg2.anInt2830 || local26 < 0 || arg2.anInt2835 <= arg2.anInt2831 + local31 >> arg2.anInt2830)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt2832 <= local21 + arg3.anInt2831 >> arg3.anInt2830 || local26 < 0 || local31 + arg3.anInt2831 >> arg3.anInt2830 >= arg3.anInt2835) {
				return;
			}
		} else {
			local16 >>= arg2.anInt2830;
			local21 = arg2.anInt2831 + local21 - 1 >> arg2.anInt2830;
			local26 >>= arg2.anInt2830;
			local31 = local31 + arg2.anInt2831 - 1 >> arg2.anInt2830;
			if (arg2.oa(local16, local26) == arg5 && arg2.oa(local21, local26) == arg5 && arg2.oa(local16, local31) == arg5 && arg2.oa(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(216) int local216;
		if (arg0 == 1) {
			for (local216 = 0; local216 < this.anInt7604; local216++) {
				this.anIntArray612[local216] -= arg5 - arg2.R(this.anIntArray611[local216] + arg4, this.anIntArray609[local216] + arg6);
			}
		} else {
			@Pc(218) int local218;
			@Pc(228) int local228;
			if (arg0 == 2) {
				@Pc(430) short local430 = this.aShort104;
				if (local430 == 0) {
					return;
				}
				for (local218 = 0; local218 < this.anInt7604; local218++) {
					local228 = (this.anIntArray612[local218] << 16) / local430;
					if (arg1 > local228) {
						this.anIntArray612[local218] -= -((arg2.R(this.anIntArray611[local218] + arg4, arg6 + this.anIntArray609[local218]) - arg5) * (-local228 + arg1) / arg1);
					}
				}
			} else {
				@Pc(235) int local235;
				if (arg0 == 3) {
					local216 = (arg1 & 0xFF) * 4;
					local218 = (arg1 >> 8 & 0xFF) * 4;
					local228 = (arg1 >> 16 & 0xFF) << 6;
					local235 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local216 >> 1) < 0 || arg2.anInt2832 << arg2.anInt2830 <= (local216 >> 1) + arg4 + arg2.anInt2831 || arg6 - (local218 >> 1) < 0 || arg2.anInt2835 << arg2.anInt2830 <= (local218 >> 1) + (arg6 + arg2.anInt2831)) {
						return;
					}
					this.method6068(arg2, local218, local235, arg6, arg4, local216, local228, arg5);
				} else if (arg0 == 4) {
					local216 = this.aShort97 - this.aShort104;
					for (local218 = 0; local218 < this.anInt7604; local218++) {
						this.anIntArray612[local218] = this.anIntArray612[local218] + arg3.R(arg4 + this.anIntArray611[local218], this.anIntArray609[local218] + arg6) + local216 - arg5;
					}
				} else if (arg0 == 5) {
					local216 = this.aShort97 - this.aShort104;
					for (local218 = 0; local218 < this.anInt7604; local218++) {
						local228 = this.anIntArray611[local218] + arg4;
						local235 = this.anIntArray609[local218] + arg6;
						@Pc(240) int local240 = arg2.R(local228, local235);
						@Pc(245) int local245 = arg3.R(local228, local235);
						@Pc(253) int local253 = local240 - arg1 - local245;
						this.anIntArray612[local218] = ((this.anIntArray612[local218] << 8) / local216 * local253 >> 8) - (arg5 - local240);
					}
				}
			}
		}
		if (this.aClass118_15 != null) {
			this.aClass118_15.anInterface9_4 = null;
		}
		this.aBoolean561 = false;
	}

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "()[Lclient!tb;")
	@Override
	public Class239[] method6083() {
		return this.aClass239Array4;
	}

	@OriginalMember(owner = "client!vs", name = "B", descriptor = "(I)V")
	@Override
	public void B(@OriginalArg(0) int arg0) {
		this.anInt7644 = arg0;
		this.aBoolean560 = true;
		if (this.aClass272_1 != null && (this.anInt7644 & 0x10000) == 0) {
			this.aByteArray95 = this.aClass272_1.aByteArray97;
			this.aShortArray107 = this.aClass272_1.aShortArray117;
			this.aShortArray115 = this.aClass272_1.aShortArray118;
			this.aShortArray112 = this.aClass272_1.aShortArray119;
			this.aClass272_1 = null;
		}
		this.method6092();
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BLclient!vs;Lclient!vs;ZZI)Lclient!ka;")
	private Class57 method6089(@OriginalArg(1) Class57_Sub2 arg0, @OriginalArg(2) Class57_Sub2 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		arg1.anInt7637 = this.anInt7637;
		arg1.anInt7595 = this.anInt7595;
		arg1.anInt7619 = this.anInt7619;
		arg1.anInt7644 = arg4;
		arg1.anInt7617 = this.anInt7617;
		arg1.anInt7645 = this.anInt7645;
		arg1.aShort102 = this.aShort102;
		arg1.aByte102 = 0;
		arg1.anInt7604 = this.anInt7604;
		arg1.anInt7590 = this.anInt7590;
		arg1.aShort100 = this.aShort100;
		@Pc(68) boolean local68 = Static349.method5093(arg4, this.anInt7590);
		@Pc(74) boolean local74 = Static266.method4280(arg4, this.anInt7590);
		@Pc(80) boolean local80 = Static395.method5579(this.anInt7590, arg4);
		@Pc(86) boolean local86 = local68 | local74 | local80;
		@Pc(183) int local183;
		if (local86) {
			if (!local68) {
				arg1.anIntArray611 = this.anIntArray611;
			} else if (arg0.anIntArray611 == null || arg0.anIntArray611.length < this.anInt7595) {
				arg1.anIntArray611 = arg0.anIntArray611 = new int[this.anInt7595];
			} else {
				arg1.anIntArray611 = arg0.anIntArray611;
			}
			if (!local74) {
				arg1.anIntArray612 = this.anIntArray612;
			} else if (arg0.anIntArray612 == null || this.anInt7595 > arg0.anIntArray612.length) {
				arg1.anIntArray612 = arg0.anIntArray612 = new int[this.anInt7595];
			} else {
				arg1.anIntArray612 = arg0.anIntArray612;
			}
			if (!local80) {
				arg1.anIntArray609 = this.anIntArray609;
			} else if (arg0.anIntArray609 == null || this.anInt7595 > arg0.anIntArray609.length) {
				arg1.anIntArray609 = arg0.anIntArray609 = new int[this.anInt7595];
			} else {
				arg1.anIntArray609 = arg0.anIntArray609;
			}
			for (local183 = 0; local183 < this.anInt7595; local183++) {
				if (local68) {
					arg1.anIntArray611[local183] = this.anIntArray611[local183];
				}
				if (local74) {
					arg1.anIntArray612[local183] = this.anIntArray612[local183];
				}
				if (local80) {
					arg1.anIntArray609[local183] = this.anIntArray609[local183];
				}
			}
		} else {
			arg1.anIntArray612 = this.anIntArray612;
			arg1.anIntArray609 = this.anIntArray609;
			arg1.anIntArray611 = this.anIntArray611;
		}
		if (Static106.method6189(this.anInt7590, arg4)) {
			arg1.aClass118_15 = arg0.aClass118_15;
			if (arg3) {
				arg1.aByte102 = (byte) (arg1.aByte102 | 0x1);
			}
			arg1.aClass118_15.anInterface9_4 = this.aClass118_15.anInterface9_4;
			arg1.aClass118_15.aByte24 = this.aClass118_15.aByte24;
		} else if (Static78.method1655(arg4, this.anInt7590)) {
			arg1.aClass118_15 = this.aClass118_15;
		} else {
			arg1.aClass118_15 = null;
		}
		if (Static151.method2806(this.anInt7590, arg4)) {
			if (arg0.aShortArray111 == null || arg0.aShortArray111.length < this.anInt7637) {
				arg1.aShortArray111 = arg0.aShortArray111 = new short[this.anInt7637];
			} else {
				arg1.aShortArray111 = arg0.aShortArray111;
			}
			for (local183 = 0; local183 < this.anInt7637; local183++) {
				arg1.aShortArray111[local183] = this.aShortArray111[local183];
			}
		} else {
			arg1.aShortArray111 = this.aShortArray111;
		}
		if (Static395.method5585(this.anInt7590, arg4)) {
			if (arg0.aByteArray96 == null || arg0.aByteArray96.length < this.anInt7637) {
				arg1.aByteArray96 = arg0.aByteArray96 = new byte[this.anInt7637];
			} else {
				arg1.aByteArray96 = arg0.aByteArray96;
			}
			for (local183 = 0; local183 < this.anInt7637; local183++) {
				arg1.aByteArray96[local183] = this.aByteArray96[local183];
			}
		} else {
			arg1.aByteArray96 = this.aByteArray96;
		}
		if (Static45.method928(this.anInt7590, arg4)) {
			if (arg3) {
				arg1.aByte102 = (byte) (arg1.aByte102 | 0x2);
			}
			arg1.aClass118_14 = arg0.aClass118_14;
			arg1.aClass118_14.anInterface9_4 = this.aClass118_14.anInterface9_4;
			arg1.aClass118_14.aByte24 = this.aClass118_14.aByte24;
		} else if (Static275.method4382(this.anInt7590, arg4)) {
			arg1.aClass118_14 = this.aClass118_14;
		} else {
			arg1.aClass118_14 = null;
		}
		@Pc(532) int local532;
		if (Static244.method4059(this.anInt7590, arg4)) {
			if (arg0.aShortArray107 == null || arg0.aShortArray107.length < this.anInt7645) {
				local183 = this.anInt7645;
				arg1.aShortArray112 = arg0.aShortArray112 = new short[local183];
				arg1.aShortArray107 = arg0.aShortArray107 = new short[local183];
				arg1.aShortArray115 = arg0.aShortArray115 = new short[local183];
			} else {
				arg1.aShortArray112 = arg0.aShortArray112;
				arg1.aShortArray107 = arg0.aShortArray107;
				arg1.aShortArray115 = arg0.aShortArray115;
			}
			if (this.aClass272_1 == null) {
				for (local183 = 0; local183 < this.anInt7645; local183++) {
					arg1.aShortArray107[local183] = this.aShortArray107[local183];
					arg1.aShortArray115[local183] = this.aShortArray115[local183];
					arg1.aShortArray112[local183] = this.aShortArray112[local183];
				}
			} else {
				if (arg0.aClass272_1 == null) {
					arg0.aClass272_1 = new Class272();
				}
				@Pc(520) Class272 local520 = arg1.aClass272_1 = arg0.aClass272_1;
				if (local520.aShortArray117 == null || local520.aShortArray117.length < this.anInt7645) {
					local532 = this.anInt7645;
					local520.aShortArray117 = new short[local532];
					local520.aByteArray97 = new byte[local532];
					local520.aShortArray118 = new short[local532];
					local520.aShortArray119 = new short[local532];
				}
				for (local532 = 0; local532 < this.anInt7645; local532++) {
					arg1.aShortArray107[local532] = this.aShortArray107[local532];
					arg1.aShortArray115[local532] = this.aShortArray115[local532];
					arg1.aShortArray112[local532] = this.aShortArray112[local532];
					local520.aShortArray117[local532] = this.aClass272_1.aShortArray117[local532];
					local520.aShortArray118[local532] = this.aClass272_1.aShortArray118[local532];
					local520.aShortArray119[local532] = this.aClass272_1.aShortArray119[local532];
					local520.aByteArray97[local532] = this.aClass272_1.aByteArray97[local532];
				}
			}
			arg1.aByteArray95 = this.aByteArray95;
		} else {
			arg1.aShortArray107 = this.aShortArray107;
			arg1.aByteArray95 = this.aByteArray95;
			arg1.aShortArray115 = this.aShortArray115;
			arg1.aClass272_1 = this.aClass272_1;
			arg1.aShortArray112 = this.aShortArray112;
		}
		if (Static90.method5072(arg4, this.anInt7590)) {
			arg1.aClass118_13 = arg0.aClass118_13;
			if (arg3) {
				arg1.aByte102 = (byte) (arg1.aByte102 | 0x4);
			}
			arg1.aClass118_13.anInterface9_4 = this.aClass118_13.anInterface9_4;
			arg1.aClass118_13.aByte24 = this.aClass118_13.aByte24;
		} else if (Static322.method4802(this.anInt7590, arg4)) {
			arg1.aClass118_13 = this.aClass118_13;
		} else {
			arg1.aClass118_13 = null;
		}
		if (Static433.method1197(this.anInt7590, arg4)) {
			if (arg0.aFloatArray45 == null || this.anInt7637 > arg0.aFloatArray45.length) {
				local183 = this.anInt7645;
				arg1.aFloatArray44 = arg0.aFloatArray44 = new float[local183];
				arg1.aFloatArray45 = arg0.aFloatArray45 = new float[local183];
			} else {
				arg1.aFloatArray45 = arg0.aFloatArray45;
				arg1.aFloatArray44 = arg0.aFloatArray44;
			}
			for (local183 = 0; local183 < this.anInt7645; local183++) {
				arg1.aFloatArray45[local183] = this.aFloatArray45[local183];
				arg1.aFloatArray44[local183] = this.aFloatArray44[local183];
			}
		} else {
			arg1.aFloatArray45 = this.aFloatArray45;
			arg1.aFloatArray44 = this.aFloatArray44;
		}
		if (Static256.method4186(this.anInt7590, arg4)) {
			if (arg3) {
				arg1.aByte102 = (byte) (arg1.aByte102 | 0x8);
			}
			arg1.aClass118_16 = arg0.aClass118_16;
			arg1.aClass118_16.anInterface9_4 = this.aClass118_16.anInterface9_4;
			arg1.aClass118_16.aByte24 = this.aClass118_16.aByte24;
		} else if (Static329.method4879(this.anInt7590, arg4)) {
			arg1.aClass118_16 = this.aClass118_16;
		} else {
			arg1.aClass118_16 = null;
		}
		if (Static347.method5055(arg4, this.anInt7590)) {
			if (arg0.aShortArray108 == null || arg0.aShortArray108.length < this.anInt7637) {
				local183 = this.anInt7637;
				arg1.aShortArray110 = arg0.aShortArray110 = new short[local183];
				arg1.aShortArray109 = arg0.aShortArray109 = new short[local183];
				arg1.aShortArray108 = arg0.aShortArray108 = new short[local183];
			} else {
				arg1.aShortArray108 = arg0.aShortArray108;
				arg1.aShortArray110 = arg0.aShortArray110;
				arg1.aShortArray109 = arg0.aShortArray109;
			}
			for (local183 = 0; local183 < this.anInt7637; local183++) {
				arg1.aShortArray108[local183] = this.aShortArray108[local183];
				arg1.aShortArray109[local183] = this.aShortArray109[local183];
				arg1.aShortArray110[local183] = this.aShortArray110[local183];
			}
		} else {
			arg1.aShortArray110 = this.aShortArray110;
			arg1.aShortArray109 = this.aShortArray109;
			arg1.aShortArray108 = this.aShortArray108;
		}
		if (Static85.method1764(this.anInt7590, arg4)) {
			if (arg3) {
				arg1.aByte102 = (byte) (arg1.aByte102 | 0x10);
			}
			arg1.aClass123_1 = arg0.aClass123_1;
			arg1.aClass123_1.anInterface11_3 = this.aClass123_1.anInterface11_3;
		} else if (Static456.method6196(arg4, this.anInt7590)) {
			arg1.aClass123_1 = this.aClass123_1;
		} else {
			arg1.aClass123_1 = null;
		}
		if (Static154.method2867(this.anInt7590, arg4)) {
			if (arg0.aShortArray114 == null || this.anInt7637 > arg0.aShortArray114.length) {
				local183 = this.anInt7637;
				arg1.aShortArray114 = arg0.aShortArray114 = new short[local183];
			} else {
				arg1.aShortArray114 = arg0.aShortArray114;
			}
			for (local183 = 0; local183 < this.anInt7637; local183++) {
				arg1.aShortArray114[local183] = this.aShortArray114[local183];
			}
		} else {
			arg1.aShortArray114 = this.aShortArray114;
		}
		if (!Static413.method5732(arg4, this.anInt7590)) {
			arg1.aClass267Array1 = this.aClass267Array1;
		} else if (arg0.aClass267Array1 == null || this.anInt7617 > arg0.aClass267Array1.length) {
			local183 = this.anInt7617;
			arg1.aClass267Array1 = arg0.aClass267Array1 = new Class267[local183];
			for (local532 = 0; local532 < this.anInt7617; local532++) {
				arg1.aClass267Array1[local532] = this.aClass267Array1[local532].method6176();
			}
		} else {
			arg1.aClass267Array1 = arg0.aClass267Array1;
			for (local183 = 0; local183 < this.anInt7617; local183++) {
				arg1.aClass267Array1[local183].method6179(this.aClass267Array1[local183]);
			}
		}
		arg1.lb = this.lb;
		arg1.aClass61Array4 = this.aClass61Array4;
		arg1.anIntArray610 = this.anIntArray610;
		arg1.aShortArray113 = this.aShortArray113;
		arg1.anIntArray608 = this.anIntArray608;
		arg1.anIntArrayArray61 = this.anIntArrayArray61;
		arg1.anIntArrayArray59 = this.anIntArrayArray59;
		if (this.aBoolean561) {
			arg1.aShort97 = this.aShort97;
			arg1.aShort101 = this.aShort101;
			arg1.aShort103 = this.aShort103;
			arg1.aShort96 = this.aShort96;
			arg1.aShort98 = this.aShort98;
			arg1.aBoolean561 = true;
			arg1.aShort104 = this.aShort104;
			arg1.aShort99 = this.aShort99;
		} else {
			arg1.aBoolean561 = false;
		}
		arg1.aClass245Array1 = this.aClass245Array1;
		arg1.aShortArray116 = this.aShortArray116;
		arg1.aClass239Array4 = this.aClass239Array4;
		arg1.anIntArrayArray60 = this.anIntArrayArray60;
		return arg1;
	}

	@OriginalMember(owner = "client!vs", name = "ja", descriptor = "()I")
	@Override
	public int ja() {
		if (!this.aBoolean561) {
			this.method6099();
		}
		return this.aShort104;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZI)V")
	private void method6091(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass118_14 != null && this.aClass118_14.anInterface9_4 == null;
		@Pc(27) boolean local27 = this.aClass118_13 != null && this.aClass118_13.anInterface9_4 == null;
		@Pc(38) boolean local38 = this.aClass118_15 != null && this.aClass118_15.anInterface9_4 == null;
		@Pc(49) boolean local49 = this.aClass118_16 != null && this.aClass118_16.anInterface9_4 == null;
		if (arg0) {
			local16 &= (this.aByte102 & 0x2) != 0;
			local49 &= (this.aByte102 & 0x8) != 0;
			local38 &= (this.aByte102 & 0x1) != 0;
			local27 &= (this.aByte102 & 0x4) != 0;
		}
		@Pc(101) byte local101 = 0;
		@Pc(105) byte local105 = 0;
		@Pc(107) byte local107 = 0;
		if (local38) {
			local101 = 12;
		}
		@Pc(118) byte local118 = 0;
		if (local16) {
			local105 = local101;
			local101 = (byte) (local101 + 4);
		}
		if (local27) {
			local107 = local101;
			local101 = (byte) (local101 + 12);
		}
		if (local49) {
			local118 = local101;
			local101 = (byte) (local101 + 8);
		}
		if (local101 == 0) {
			return;
		}
		if (local101 * this.anInt7645 <= this.aClass30_Sub1_43.aClass4_Sub20_Sub2_1.aByteArray77.length) {
			this.aClass30_Sub1_43.aClass4_Sub20_Sub2_1.anInt5526 = 0;
		} else {
			this.aClass30_Sub1_43.aClass4_Sub20_Sub2_1 = new Class4_Sub20_Sub2(local101 * (this.anInt7645 + 100));
		}
		@Pc(181) Class4_Sub20_Sub2 local181 = this.aClass30_Sub1_43.aClass4_Sub20_Sub2_1;
		@Pc(189) int local189;
		@Pc(198) int local198;
		@Pc(226) int local226;
		@Pc(235) int local235;
		if (local38) {
			@Pc(205) int local205;
			@Pc(212) int local212;
			@Pc(217) int local217;
			@Pc(224) int local224;
			if (this.aClass30_Sub1_43.aBoolean51) {
				for (local189 = 0; local189 < this.anInt7604; local189++) {
					local198 = NativeStream.floatToRawIntBits((float) this.anIntArray611[local189]);
					local205 = NativeStream.floatToRawIntBits((float) this.anIntArray612[local189]);
					local212 = NativeStream.floatToRawIntBits((float) this.anIntArray609[local189]);
					local217 = this.anIntArray610[local189];
					local224 = this.anIntArray610[local189 + 1];
					for (local226 = local217; local226 < local224; local226++) {
						local235 = this.lb[local226] - 1;
						if (local235 == -1) {
							break;
						}
						local181.anInt5526 = local235 * local101;
						local181.method4561(local198);
						local181.method4561(local205);
						local181.method4561(local212);
					}
				}
			} else {
				for (local189 = 0; local189 < this.anInt7604; local189++) {
					local198 = NativeStream.floatToRawIntBits((float) this.anIntArray611[local189]);
					local205 = NativeStream.floatToRawIntBits((float) this.anIntArray612[local189]);
					local212 = NativeStream.floatToRawIntBits((float) this.anIntArray609[local189]);
					local217 = this.anIntArray610[local189];
					local224 = this.anIntArray610[local189 + 1];
					for (local226 = local217; local226 < local224; local226++) {
						local235 = this.lb[local226] - 1;
						if (local235 == -1) {
							break;
						}
						local181.anInt5526 = local101 * local235;
						local181.method4608(local198);
						local181.method4608(local205);
						local181.method4608(local212);
					}
				}
			}
		}
		@Pc(484) float local484;
		@Pc(377) short[] local377;
		@Pc(374) short[] local374;
		@Pc(368) short[] local368;
		@Pc(371) byte[] local371;
		@Pc(525) float local525;
		if (local16) {
			if (this.aClass118_13 == null) {
				if (this.aClass272_1 == null) {
					local368 = this.aShortArray112;
					local371 = this.aByteArray95;
					local374 = this.aShortArray115;
					local377 = this.aShortArray107;
				} else {
					local374 = this.aClass272_1.aShortArray118;
					local368 = this.aClass272_1.aShortArray119;
					local377 = this.aClass272_1.aShortArray117;
					local371 = this.aClass272_1.aByteArray97;
				}
				@Pc(401) float local401 = this.aClass30_Sub1_43.aFloatArray1[0];
				@Pc(407) float local407 = this.aClass30_Sub1_43.aFloatArray1[1];
				@Pc(413) float local413 = this.aClass30_Sub1_43.aFloatArray1[2];
				@Pc(417) float local417 = this.aClass30_Sub1_43.aFloat22;
				@Pc(427) float local427 = this.aClass30_Sub1_43.aFloat8 * 768.0F / (float) this.aShort102;
				@Pc(437) float local437 = this.aClass30_Sub1_43.aFloat23 * 768.0F / (float) this.aShort102;
				for (@Pc(439) int local439 = 0; local439 < this.anInt7637; local439++) {
					@Pc(459) int local459 = this.method6094(this.aShortArray111[local439], this.aByteArray96[local439], this.aShort100, this.aShortArray114[local439]);
					@Pc(464) short local464 = this.aShortArray108[local439];
					@Pc(473) float local473 = (float) (local459 >>> 24) * this.aClass30_Sub1_43.aFloat6;
					local484 = this.aClass30_Sub1_43.aFloat9 * (float) (local459 >> 16 & 0xFF);
					@Pc(495) float local495 = (float) (local459 >> 8 & 0xFF) * this.aClass30_Sub1_43.aFloat14;
					@Pc(500) short local500 = (short) local371[local464];
					if (local500 == 0) {
						local525 = ((float) local377[local464] * local401 + local407 * (float) local374[local464] + local413 * (float) local368[local464]) * 0.0026041667F;
					} else {
						local525 = ((float) local377[local464] * local401 + (float) local374[local464] * local407 + local413 * (float) local368[local464]) / (float) (local500 * 256);
					}
					@Pc(565) float local565 = local417 + (local525 < 0.0F ? local437 : local427) * local525;
					@Pc(570) int local570 = (int) (local473 * local565);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					@Pc(591) int local591 = (int) (local484 * local565);
					@Pc(596) int local596 = (int) (local495 * local565);
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					local181.anInt5526 = local105 + local101 * local464;
					local181.method4590(local570);
					local181.method4590(local591);
					local181.method4590(local596);
					local181.method4590(255 - (this.aByteArray96[local439] & 0xFF));
					local464 = this.aShortArray109[local439];
					local500 = local371[local464];
					if (local500 == 0) {
						local525 = (local401 * (float) local377[local464] + local407 * (float) local374[local464] + local413 * (float) local368[local464]) * 0.0026041667F;
					} else {
						local525 = (local413 * (float) local368[local464] + (float) local374[local464] * local407 + (float) local377[local464] * local401) / (float) (local500 * 256);
					}
					local565 = local525 * (local525 < 0.0F ? local437 : local427) + local417;
					local570 = (int) (local473 * local565);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local591 = (int) (local565 * local484);
					local596 = (int) (local495 * local565);
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					local181.anInt5526 = local464 * local101 + local105;
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					local181.method4590(local570);
					local181.method4590(local591);
					local181.method4590(local596);
					local181.method4590(255 - (this.aByteArray96[local439] & 0xFF));
					local464 = this.aShortArray110[local439];
					local500 = local371[local464];
					if (local500 == 0) {
						local525 = ((float) local368[local464] * local413 + (float) local374[local464] * local407 + local401 * (float) local377[local464]) * 0.0026041667F;
					} else {
						local525 = (local413 * (float) local368[local464] + (float) local377[local464] * local401 + local407 * (float) local374[local464]) / (float) (local500 * 256);
					}
					local565 = (local525 < 0.0F ? local437 : local427) * local525 + local417;
					local570 = (int) (local565 * local473);
					local591 = (int) (local484 * local565);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					local596 = (int) (local565 * local495);
					local181.anInt5526 = local105 + local464 * local101;
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					local181.method4590(local570);
					local181.method4590(local591);
					local181.method4590(local596);
					local181.method4590(255 - (this.aByteArray96[local439] & 0xFF));
				}
			} else {
				for (local189 = 0; local189 < this.anInt7637; local189++) {
					local198 = this.method6094(this.aShortArray111[local189], this.aByteArray96[local189], this.aShort100, this.aShortArray114[local189]);
					local181.anInt5526 = this.aShortArray108[local189] * local101 + local105;
					local181.method4561(local198);
					local181.anInt5526 = local101 * this.aShortArray109[local189] + local105;
					local181.method4561(local198);
					local181.anInt5526 = local105 + this.aShortArray110[local189] * local101;
					local181.method4561(local198);
				}
			}
		}
		if (local27) {
			if (this.aClass272_1 == null) {
				local371 = this.aByteArray95;
				local374 = this.aShortArray115;
				local368 = this.aShortArray112;
				local377 = this.aShortArray107;
			} else {
				local377 = this.aClass272_1.aShortArray117;
				local368 = this.aClass272_1.aShortArray119;
				local371 = this.aClass272_1.aByteArray97;
				local374 = this.aClass272_1.aShortArray118;
			}
			@Pc(1115) float local1115 = 3.0F / (float) this.aShort102;
			local525 = 3.0F / (float) (this.aShort102 + this.aShort102 / 2);
			local181.anInt5526 = local107;
			if (this.aClass30_Sub1_43.aBoolean51) {
				for (local226 = 0; local226 < this.anInt7645; local226++) {
					local235 = local371[local226] & 0xFF;
					if (local235 == 0) {
						local181.method4626((float) local377[local226] * local525);
						local181.method4626((float) local374[local226] * local525);
						local181.method4626(local525 * (float) local368[local226]);
					} else {
						local484 = local1115 / (float) local235;
						local181.method4626(local484 * (float) local377[local226]);
						local181.method4626((float) local374[local226] * local484);
						local181.method4626((float) local368[local226] * local484);
					}
					local181.anInt5526 += local101 - 12;
				}
			} else {
				for (local226 = 0; local226 < this.anInt7645; local226++) {
					local235 = local371[local226] & 0xFF;
					if (local235 == 0) {
						local181.method4627((float) local377[local226] * local525);
						local181.method4627(local525 * (float) local374[local226]);
						local181.method4627(local525 * (float) local368[local226]);
					} else {
						local484 = local1115 / (float) local235;
						local181.method4627((float) local377[local226] * local484);
						local181.method4627(local484 * (float) local374[local226]);
						local181.method4627(local484 * (float) local368[local226]);
					}
					local181.anInt5526 += local101 - 12;
				}
			}
		}
		if (local49) {
			local181.anInt5526 = local118;
			if (this.aClass30_Sub1_43.aBoolean51) {
				for (local189 = 0; local189 < this.anInt7645; local189++) {
					local181.method4626(this.aFloatArray45[local189]);
					local181.method4626(this.aFloatArray44[local189]);
					local181.anInt5526 += local101 - 8;
				}
			} else {
				for (local189 = 0; local189 < this.anInt7645; local189++) {
					local181.method4627(this.aFloatArray45[local189]);
					local181.method4627(this.aFloatArray44[local189]);
					local181.anInt5526 += local101 - 8;
				}
			}
		}
		local181.anInt5526 = this.anInt7645 * local101;
		@Pc(1419) Interface9 local1419;
		if (arg0) {
			if (this.anInterface9_7 == null) {
				this.anInterface9_7 = this.aClass30_Sub1_43.method686(true, local101, local181.anInt5526, local181.aByteArray77);
			} else {
				this.anInterface9_7.method4493(local101, local181.anInt5526, local181.aByteArray77);
			}
			this.aByte102 = 0;
			local1419 = this.anInterface9_7;
		} else {
			local1419 = this.aClass30_Sub1_43.method686(false, local101, local181.anInt5526, local181.aByteArray77);
			this.aBoolean560 = true;
		}
		if (local38) {
			this.aClass118_15.anInterface9_4 = local1419;
			this.aClass118_15.aByte24 = 0;
		}
		if (local49) {
			this.aClass118_16.aByte24 = local118;
			this.aClass118_16.anInterface9_4 = local1419;
		}
		if (local16) {
			this.aClass118_14.anInterface9_4 = local1419;
			this.aClass118_14.aByte24 = local105;
		}
		if (local27) {
			this.aClass118_13.anInterface9_4 = local1419;
			this.aClass118_13.aByte24 = local107;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	private void method6092() {
		if (!this.aBoolean560) {
			return;
		}
		this.aBoolean560 = false;
		if (this.aClass61Array4 == null && this.aClass239Array4 == null && this.aClass245Array1 == null) {
			if (this.anIntArray611 != null && !Static176.method3076(this.anInt7590, this.anInt7644)) {
				if (this.aClass118_15 != null && this.aClass118_15.anInterface9_4 == null) {
					this.aBoolean560 = true;
				} else {
					if (!this.aBoolean561) {
						this.method6099();
					}
					this.anIntArray611 = null;
				}
			}
			if (this.anIntArray612 != null && !Static403.method3041(this.anInt7590, this.anInt7644)) {
				if (this.aClass118_15 != null && this.aClass118_15.anInterface9_4 == null) {
					this.aBoolean560 = true;
				} else {
					if (!this.aBoolean561) {
						this.method6099();
					}
					this.anIntArray612 = null;
				}
			}
			if (this.anIntArray609 != null && !Static463.method6260(this.anInt7590, this.anInt7644)) {
				if (this.aClass118_15 != null && this.aClass118_15.anInterface9_4 == null) {
					this.aBoolean560 = true;
				} else {
					if (!this.aBoolean561) {
						this.method6099();
					}
					this.anIntArray609 = null;
				}
			}
		}
		if (this.lb != null && this.anIntArray611 == null && this.anIntArray612 == null && this.anIntArray609 == null) {
			this.lb = null;
			this.anIntArray610 = null;
		}
		if (this.aByteArray95 != null && !Static300.method4640(this.anInt7644, this.anInt7590)) {
			if (this.aClass118_13 == null) {
				if (this.aClass118_14 != null && this.aClass118_14.anInterface9_4 == null) {
					this.aBoolean560 = true;
				} else {
					this.aShortArray107 = this.aShortArray115 = this.aShortArray112 = null;
					this.aByteArray95 = null;
				}
			} else if (this.aClass118_13.anInterface9_4 == null) {
				this.aBoolean560 = true;
			} else {
				this.aByteArray95 = null;
				this.aShortArray107 = this.aShortArray115 = this.aShortArray112 = null;
			}
		}
		if (this.aShortArray111 != null && !Static340.method4981(this.anInt7644, this.anInt7590)) {
			if (this.aClass118_14 != null && this.aClass118_14.anInterface9_4 == null) {
				this.aBoolean560 = true;
			} else {
				this.aShortArray111 = null;
			}
		}
		if (this.aByteArray96 != null && !Static234.method3952(this.anInt7590, this.anInt7644)) {
			if (this.aClass118_14 != null && this.aClass118_14.anInterface9_4 == null) {
				this.aBoolean560 = true;
			} else {
				this.aByteArray96 = null;
			}
		}
		if (this.aFloatArray45 != null && !Static312.method5442(this.anInt7590, this.anInt7644)) {
			if (this.aClass118_16 != null && this.aClass118_16.anInterface9_4 == null) {
				this.aBoolean560 = true;
			} else {
				this.aFloatArray45 = this.aFloatArray44 = null;
			}
		}
		if (this.aShortArray114 != null && !Static33.method472(this.anInt7590, this.anInt7644)) {
			if (this.aClass118_14 != null && this.aClass118_14.anInterface9_4 == null) {
				this.aBoolean560 = true;
			} else {
				this.aShortArray114 = null;
			}
		}
		if (this.aShortArray108 != null && !Static413.method5729(this.anInt7590, this.anInt7644)) {
			if (this.aClass123_1 != null && this.aClass123_1.anInterface11_3 == null || this.aClass118_14 != null && this.aClass118_14.anInterface9_4 == null) {
				this.aBoolean560 = true;
			} else {
				this.aShortArray108 = this.aShortArray109 = this.aShortArray110 = null;
			}
		}
		if (this.anIntArrayArray59 != null && !Static160.method2901(this.anInt7644, this.anInt7590)) {
			this.anIntArrayArray59 = null;
			this.aShortArray116 = null;
		}
		if (this.anIntArrayArray60 != null && !Static203.method3618(this.anInt7644, this.anInt7590)) {
			this.anIntArrayArray60 = null;
			this.aShortArray113 = null;
		}
		if (this.anIntArrayArray61 != null && !Static28.method412(this.anInt7590, this.anInt7644)) {
			this.anIntArrayArray61 = null;
		}
		if (this.anIntArray608 != null && (this.anInt7644 & 0x800) == 0 && (this.anInt7644 & 0x40000) == 0) {
			this.anIntArray608 = null;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BIFJLclient!ch;FIIII)S")
	private short method6093(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) long arg2, @OriginalArg(4) Class37 arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray610[arg7];
		@Pc(26) int local26 = this.anIntArray610[arg7 + 1];
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = local10; local30 < local26; local30++) {
			@Pc(37) short local37 = this.lb[local30];
			if (local37 == 0) {
				local28 = local30;
				break;
			}
			if (arg2 == Static125.aLongArray1[local30]) {
				return (short) (local37 - 1);
			}
		}
		this.lb[local28] = (short) (this.anInt7645 + 1);
		Static125.aLongArray1[local28] = arg2;
		this.aShortArray107[this.anInt7645] = (short) arg8;
		this.aShortArray115[this.anInt7645] = (short) arg0;
		this.aShortArray112[this.anInt7645] = (short) arg6;
		this.aByteArray95[this.anInt7645] = (byte) arg5;
		this.aFloatArray45[this.anInt7645] = arg4;
		this.aFloatArray44[this.anInt7645] = arg1;
		return (short) this.anInt7645++;
	}

	@OriginalMember(owner = "client!vs", name = "Q", descriptor = "(I)V")
	@Override
	public void Q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub13.anIntArray497[arg0];
		@Pc(13) int local13 = Class4_Sub13.anIntArray496[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7604; local15++) {
			local33 = local13 * this.anIntArray611[local15] + local9 * this.anIntArray609[local15] >> 15;
			this.anIntArray609[local15] = this.anIntArray609[local15] * local13 - local9 * this.anIntArray611[local15] >> 15;
			this.anIntArray611[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7645; local33++) {
			@Pc(87) int local87 = this.aShortArray107[local33] * local13 + local9 * this.aShortArray112[local33] >> 15;
			this.aShortArray112[local33] = (short) (this.aShortArray112[local33] * local13 - local9 * this.aShortArray107[local33] >> 15);
			this.aShortArray107[local33] = (short) local87;
		}
		if (this.aClass118_13 == null && this.aClass118_14 != null) {
			this.aClass118_14.anInterface9_4 = null;
		}
		if (this.aClass118_13 != null) {
			this.aClass118_13.anInterface9_4 = null;
		}
		if (this.aClass118_15 != null) {
			this.aClass118_15.anInterface9_4 = null;
		}
		this.aBoolean561 = false;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "()V")
	@Override
	public void method6069() {
		if (this.anInt7645 <= 0 || this.anInt7619 <= 0) {
			return;
		}
		this.method6091(false);
		if ((this.aByte102 & 0x10) == 0 && this.aClass123_1.anInterface11_3 == null) {
			this.method6097(false);
		}
		this.method6092();
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt7637; local7++) {
			local16 = this.aShortArray111[local7] & 0xFFFF;
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
				local46 += arg3 * (arg2 - local46) >> 7;
			}
			this.aShortArray111[local7] = (short) (local22 << 10 | local28 << 7 | local46);
		}
		if (this.aClass245Array1 != null) {
			for (local16 = 0; local16 < this.anInt7617; local16++) {
				@Pc(111) Class245 local111 = this.aClass245Array1[local16];
				@Pc(116) Class267 local116 = this.aClass267Array1[local16];
				local116.anInt7749 = Static323.anIntArray198[this.aShortArray111[local111.anInt7080] & 0xFFFF] & 0xFFFFFF | local116.anInt7749 & 0xFF000000;
			}
		}
		if (this.aClass118_14 != null) {
			this.aClass118_14.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!vs", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7604; local7++) {
			this.anIntArray609[local7] = -this.anIntArray609[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt7645; local29++) {
			this.aShortArray112[local29] = (short) -this.aShortArray112[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt7637; local52++) {
			@Pc(59) short local59 = this.aShortArray108[local52];
			this.aShortArray108[local52] = this.aShortArray110[local52];
			this.aShortArray110[local52] = local59;
		}
		if (this.aClass118_13 == null && this.aClass118_14 != null) {
			this.aClass118_14.anInterface9_4 = null;
		}
		if (this.aClass118_13 != null) {
			this.aClass118_13.anInterface9_4 = null;
		}
		if (this.aClass118_15 != null) {
			this.aClass118_15.anInterface9_4 = null;
		}
		if (this.aClass123_1 != null) {
			this.aClass123_1.anInterface11_3 = null;
		}
		this.aBoolean561 = false;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBISZ)I")
	private int method6094(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		@Pc(12) int local12 = Static323.anIntArray198[Static98.method1862(arg2, arg0)];
		if (arg3 != -1) {
			@Pc(24) Class160 local24 = this.aClass30_Sub1_43.anInterface4_5.method5685(arg3 & 0xFFFF);
			@Pc(29) int local29 = local24.aByte49 & 0xFF;
			@Pc(38) int local38;
			@Pc(64) int local64;
			if (local29 != 0) {
				if (arg2 < 0) {
					local38 = 0;
				} else if (arg2 <= 127) {
					local38 = arg2 * 131586;
				} else {
					local38 = 16777215;
				}
				if (local29 == 256) {
					local12 = local38;
				} else {
					local64 = 256 - local29;
					local12 = ((local38 & 0xFF00FF) * local29 + local64 * (local12 & 0xFF00FF) & 0xFF00FF00) + (local64 * (local12 & 0xFF00) + local29 * (local38 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local38 = local24.aByte53 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(114) int local114 = local38 * (local12 >> 16 & 0xFF);
				if (local114 > 65535) {
					local114 = 65535;
				}
				local64 = (local12 >> 8 & 0xFF) * local38;
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(138) int local138 = (local12 & 0xFF) * local38;
				if (local138 > 65535) {
					local138 = 65535;
				}
				local12 = (local64 & 0xFF00) + (local114 << 8 & 0xFF0041) + (local138 >> 8);
			}
		}
		return (local12 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!vs", name = "F", descriptor = "()I")
	@Override
	public int F() {
		if (!this.aBoolean561) {
			this.method6099();
		}
		return this.aShort97;
	}

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "(I)V")
	@Override
	public void l(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub13.anIntArray497[arg0];
		@Pc(13) int local13 = Class4_Sub13.anIntArray496[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7604; local15++) {
			@Pc(34) int local34 = this.anIntArray609[local15] * local9 + local13 * this.anIntArray611[local15] >> 15;
			this.anIntArray609[local15] = this.anIntArray609[local15] * local13 - local9 * this.anIntArray611[local15] >> 15;
			this.anIntArray611[local15] = local34;
		}
		this.aBoolean561 = false;
		if (this.aClass118_15 != null) {
			this.aClass118_15.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		if (this.aClass118_14 != null) {
			this.aClass118_14.anInterface9_4 = null;
		}
		this.aShort100 = (short) arg0;
	}

	@OriginalMember(owner = "client!vs", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean561) {
			this.method6099();
		}
		return this.aShort103;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!dm;I)V")
	private void method6095(@OriginalArg(0) Class4_Sub1_Sub6_Sub1 arg0) {
		if (this.aClass30_Sub1_43.anIntArray47.length < this.anInt7645) {
			this.aClass30_Sub1_43.anIntArray47 = new int[this.anInt7645];
			this.aClass30_Sub1_43.anIntArray46 = new int[this.anInt7645];
		}
		@Pc(32) int[] local32 = this.aClass30_Sub1_43.anIntArray47;
		@Pc(36) int[] local36 = this.aClass30_Sub1_43.anIntArray46;
		@Pc(64) int local64;
		@Pc(102) int local102;
		@Pc(111) int local111;
		for (@Pc(38) int local38 = 0; local38 < this.anInt7604; local38++) {
			local64 = (this.anIntArray611[local38] - (this.anIntArray612[local38] * this.aClass30_Sub1_43.anInt861 >> 8) >> this.aClass30_Sub1_43.anInt839) - arg0.anInt1717;
			@Pc(88) int local88 = (this.anIntArray609[local38] - (this.anIntArray612[local38] * this.aClass30_Sub1_43.anInt879 >> 8) >> this.aClass30_Sub1_43.anInt839) - arg0.anInt1723;
			@Pc(93) int local93 = this.anIntArray610[local38];
			@Pc(100) int local100 = this.anIntArray610[local38 + 1];
			for (local102 = local93; local102 < local100; local102++) {
				local111 = this.lb[local102] - 1;
				if (local111 == -1) {
					break;
				}
				local32[local111] = local64;
				local36[local111] = local88;
			}
		}
		for (local64 = 0; local64 < this.anInt7619; local64++) {
			if (this.aByteArray96 == null || this.aByteArray96[local64] <= 128) {
				@Pc(162) short local162 = this.aShortArray108[local64];
				@Pc(167) short local167 = this.aShortArray109[local64];
				@Pc(172) short local172 = this.aShortArray110[local64];
				local102 = local32[local162];
				local111 = local32[local167];
				@Pc(184) int local184 = local32[local172];
				@Pc(188) int local188 = local36[local162];
				@Pc(192) int local192 = local36[local167];
				@Pc(196) int local196 = local36[local172];
				if ((local102 - local111) * (local192 - local196) - (local192 - local188) * (local184 - local111) > 0) {
					arg0.method1553(local188, local102, local111, local192, local196, local184);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "E", descriptor = "(I)V")
	@Override
	public void E(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub13.anIntArray497[arg0];
		@Pc(13) int local13 = Class4_Sub13.anIntArray496[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7604; local15++) {
			@Pc(34) int local34 = this.anIntArray612[local15] * local13 - this.anIntArray609[local15] * local9 >> 15;
			this.anIntArray609[local15] = this.anIntArray609[local15] * local13 + this.anIntArray612[local15] * local9 >> 15;
			this.anIntArray612[local15] = local34;
		}
		if (this.aClass118_15 != null) {
			this.aClass118_15.anInterface9_4 = null;
		}
		this.aBoolean561 = false;
	}

	@OriginalMember(owner = "client!vs", name = "Z", descriptor = "(III)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7604; local3++) {
			if (arg0 != 128) {
				this.anIntArray611[local3] = this.anIntArray611[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray612[local3] = this.anIntArray612[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray609[local3] = arg2 * this.anIntArray609[local3] >> 7;
			}
		}
		if (this.aClass118_15 != null) {
			this.aClass118_15.anInterface9_4 = null;
		}
		this.aBoolean561 = false;
	}

	@OriginalMember(owner = "client!vs", name = "da", descriptor = "()I")
	@Override
	public int da() {
		if (!this.aBoolean561) {
			this.method6099();
		}
		return this.aShort101;
	}

	@OriginalMember(owner = "client!vs", name = "AA", descriptor = "()Z")
	@Override
	protected boolean AA() {
		if (this.anIntArrayArray60 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7595; local12++) {
			this.anIntArray611[local12] <<= 0x4;
			this.anIntArray612[local12] <<= 0x4;
			this.anIntArray609[local12] <<= 0x4;
		}
		Static193.anInt3854 = 0;
		Static334.anInt5865 = 0;
		Static344.anInt6072 = 0;
		return true;
	}

	@OriginalMember(owner = "client!vs", name = "G", descriptor = "(SS)V")
	@Override
	public void G(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass30_Sub1_43.anInterface4_5;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7637; local11++) {
			if (arg0 == this.aShortArray114[local11]) {
				this.aShortArray114[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class160 local47 = local9.method5685(arg0 & 0xFFFF);
			local37 = local47.aByte53;
			local35 = local47.aByte49;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class160 local67 = local9.method5685(arg1 & 0xFFFF);
			local57 = local67.aByte53;
			local55 = local67.aByte49;
		}
		if (!(local55 != local35 | local37 != local57)) {
			return;
		}
		if (this.aClass245Array1 != null) {
			for (@Pc(92) int local92 = 0; local92 < this.anInt7617; local92++) {
				@Pc(99) Class245 local99 = this.aClass245Array1[local92];
				@Pc(104) Class267 local104 = this.aClass267Array1[local92];
				local104.anInt7749 = Static323.anIntArray198[this.aShortArray111[local99.anInt7080] & 0xFFFF] & 0xFFFFFF | local104.anInt7749 & 0xFF000000;
			}
		}
		if (this.aClass118_14 != null) {
			this.aClass118_14.anInterface9_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!vs", name = "ia", descriptor = "()I")
	@Override
	public int ia() {
		if (!this.aBoolean561) {
			this.method6099();
		}
		return this.aShort96;
	}

	@OriginalMember(owner = "client!vs", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.anInt7644;
	}

	@OriginalMember(owner = "client!vs", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7604; local7++) {
			if (arg0 != 0) {
				this.anIntArray611[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray612[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray609[local7] += arg2;
			}
		}
		if (this.aClass118_15 != null) {
			this.aClass118_15.anInterface9_4 = null;
		}
		this.aBoolean561 = false;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!n;Lclient!wc;II)V")
	@Override
	public void method6087(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class71_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7645 == 0) {
			return;
		}
		@Pc(16) Class72_Sub2 local16 = this.aClass30_Sub1_43.aClass72_Sub2_3;
		if (!this.aBoolean561) {
			this.method6099();
		}
		@Pc(25) Class72_Sub2 local25 = (Class72_Sub2) arg0;
		Static324.aFloat83 = local25.aFloat51 * local16.aFloat45 + local16.aFloat52 * local25.aFloat55 + local16.aFloat51 * local25.aFloat47;
		Static185.aFloat66 = local16.aFloat54 + local25.aFloat54 * local16.aFloat45 + local25.aFloat48 * local16.aFloat52 + local16.aFloat51 * local25.aFloat46;
		@Pc(72) float local72 = Static185.aFloat66 + (float) this.aShort104 * Static324.aFloat83;
		@Pc(80) float local80 = Static324.aFloat83 * (float) this.aShort97 + Static185.aFloat66;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local90 = (float) -this.aShort99 + local80;
			local96 = local72 + (float) this.aShort99;
		} else {
			local90 = local72 - (float) this.aShort99;
			local96 = local80 + (float) this.aShort99;
		}
		if (this.aClass30_Sub1_43.aFloat21 <= local90 || local96 <= (float) this.aClass30_Sub1_43.anInt877) {
			return;
		}
		Static144.aFloat59 = local25.aFloat48 * local16.aFloat56 + local25.aFloat46 * local16.aFloat55 + local25.aFloat54 * local16.aFloat50 + local16.aFloat48;
		Static292.aFloat78 = local16.aFloat56 * local25.aFloat55 + local16.aFloat55 * local25.aFloat47 + local25.aFloat51 * local16.aFloat50;
		@Pc(173) float local173 = (float) this.aShort104 * Static292.aFloat78 + Static144.aFloat59;
		@Pc(181) float local181 = Static144.aFloat59 + (float) this.aShort97 * Static292.aFloat78;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local181 < local173) {
			local196 = ((float) -this.aShort99 + local181) * (float) this.aClass30_Sub1_43.anInt870;
			local207 = (float) this.aClass30_Sub1_43.anInt870 * (local173 + (float) this.aShort99);
		} else {
			local196 = (local173 - (float) this.aShort99) * (float) this.aClass30_Sub1_43.anInt870;
			local207 = (float) this.aClass30_Sub1_43.anInt870 * ((float) this.aShort99 + local181);
		}
		if (this.aClass30_Sub1_43.aFloat18 <= local196 / (float) arg2 || this.aClass30_Sub1_43.aFloat19 >= local207 / (float) arg2) {
			return;
		}
		Static343.aFloat81 = local16.aFloat46 + local25.aFloat46 * local16.aFloat47 + local16.aFloat53 * local25.aFloat48 + local16.aFloat49 * local25.aFloat54;
		Static384.aFloat90 = local16.aFloat53 * local25.aFloat55 + local25.aFloat47 * local16.aFloat47 + local16.aFloat49 * local25.aFloat51;
		@Pc(299) float local299 = Static343.aFloat81 + Static384.aFloat90 * (float) this.aShort104;
		@Pc(307) float local307 = Static384.aFloat90 * (float) this.aShort97 + Static343.aFloat81;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local299 > local307) {
			local322 = (float) this.aClass30_Sub1_43.anInt873 * (local307 - (float) this.aShort99);
			local333 = (local299 + (float) this.aShort99) * (float) this.aClass30_Sub1_43.anInt873;
		} else {
			local322 = (local299 - (float) this.aShort99) * (float) this.aClass30_Sub1_43.anInt873;
			local333 = (float) this.aClass30_Sub1_43.anInt873 * (local307 + (float) this.aShort99);
		}
		if (this.aClass30_Sub1_43.aFloat10 <= local322 / (float) arg2 || this.aClass30_Sub1_43.aFloat11 >= local333 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass245Array1 != null) {
			Static452.aFloat97 = local16.aFloat56 * local25.aFloat56 + local25.aFloat53 * local16.aFloat55 + local25.aFloat52 * local16.aFloat50;
			Static458.aFloat98 = local25.aFloat45 * local16.aFloat49 + local25.aFloat50 * local16.aFloat53 + local16.aFloat47 * local25.aFloat49;
			Static44.aFloat27 = local16.aFloat45 * local25.aFloat52 + local16.aFloat51 * local25.aFloat53 + local25.aFloat56 * local16.aFloat52;
			Static6.aFloat1 = local16.aFloat52 * local25.aFloat50 + local25.aFloat49 * local16.aFloat51 + local25.aFloat45 * local16.aFloat45;
			Static317.aFloat79 = local16.aFloat50 * local25.aFloat45 + local16.aFloat55 * local25.aFloat49 + local16.aFloat56 * local25.aFloat50;
			Static233.aFloat68 = local25.aFloat52 * local16.aFloat49 + local25.aFloat56 * local16.aFloat53 + local25.aFloat53 * local16.aFloat47;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort101 + this.aShort103 >> 1;
			@Pc(509) int local509 = this.aShort98 + this.aShort96 >> 1;
			@Pc(528) int local528 = (int) ((float) this.aShort104 * Static292.aFloat78 + Static452.aFloat97 * (float) local501 + Static144.aFloat59 + Static317.aFloat79 * (float) local509);
			@Pc(547) int local547 = (int) ((float) this.aShort104 * Static384.aFloat90 + Static233.aFloat68 * (float) local501 + Static343.aFloat81 + (float) local509 * Static458.aFloat98);
			@Pc(566) int local566 = (int) (Static324.aFloat83 * (float) this.aShort104 + Static185.aFloat66 + (float) local501 * Static44.aFloat27 + Static6.aFloat1 * (float) local509);
			@Pc(585) int local585 = (int) (Static317.aFloat79 * (float) local509 + Static292.aFloat78 * (float) this.aShort97 + Static144.aFloat59 + Static452.aFloat97 * (float) local501);
			@Pc(604) int local604 = (int) ((float) this.aShort97 * Static384.aFloat90 + Static343.aFloat81 + (float) local501 * Static233.aFloat68 + (float) local509 * Static458.aFloat98);
			arg1.anInt7743 = this.aClass30_Sub1_43.anInt852 + this.aClass30_Sub1_43.anInt870 * local528 / arg2;
			arg1.anInt7742 = this.aClass30_Sub1_43.anInt870 * local585 / arg2 + this.aClass30_Sub1_43.anInt852;
			arg1.anInt7740 = this.aClass30_Sub1_43.anInt866 + this.aClass30_Sub1_43.anInt873 * local604 / arg2;
			arg1.anInt7744 = this.aClass30_Sub1_43.anInt866 + this.aClass30_Sub1_43.anInt873 * local547 / arg2;
			@Pc(678) int local678 = (int) ((float) local509 * Static6.aFloat1 + Static44.aFloat27 * (float) local501 + Static185.aFloat66 + Static324.aFloat83 * (float) this.aShort97);
			if (local566 < this.aClass30_Sub1_43.anInt877 && local678 < this.aClass30_Sub1_43.anInt877) {
				arg1.aBoolean566 = true;
				arg1.anInt7741 = this.aClass30_Sub1_43.anInt852 + (local528 + this.aShort99) * this.aClass30_Sub1_43.anInt870 / arg2 - arg1.anInt7743;
			}
		}
		this.aClass30_Sub1_43.method692((float) arg2);
		this.aClass30_Sub1_43.method754();
		this.aClass30_Sub1_43.method736(local25);
		this.method6098();
		this.aClass30_Sub1_43.method710();
		this.method6100();
	}

	@OriginalMember(owner = "client!vs", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub13.anIntArray497[arg0];
		@Pc(13) int local13 = Class4_Sub13.anIntArray496[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7604; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray612[local15] + this.anIntArray611[local15] * local13 >> 15;
			this.anIntArray612[local15] = local13 * this.anIntArray612[local15] - local9 * this.anIntArray611[local15] >> 15;
			this.anIntArray611[local15] = local33;
		}
		this.aBoolean561 = false;
		if (this.aClass118_15 != null) {
			this.aClass118_15.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BZ)V")
	private void method6097(@OriginalArg(1) boolean arg0) {
		if (this.anInt7619 * 6 > this.aClass30_Sub1_43.aClass4_Sub20_Sub2_1.aByteArray77.length) {
			this.aClass30_Sub1_43.aClass4_Sub20_Sub2_1 = new Class4_Sub20_Sub2(this.anInt7619 * 6 + 600);
		} else {
			this.aClass30_Sub1_43.aClass4_Sub20_Sub2_1.anInt5526 = 0;
		}
		@Pc(38) Class4_Sub20_Sub2 local38 = this.aClass30_Sub1_43.aClass4_Sub20_Sub2_1;
		@Pc(48) int local48;
		if (this.aClass30_Sub1_43.aBoolean51) {
			for (local48 = 0; local48 < this.anInt7619; local48++) {
				local38.method4558(this.aShortArray108[local48]);
				local38.method4558(this.aShortArray109[local48]);
				local38.method4558(this.aShortArray110[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt7619; local48++) {
				local38.method4604(this.aShortArray108[local48]);
				local38.method4604(this.aShortArray109[local48]);
				local38.method4604(this.aShortArray110[local48]);
			}
		}
		if (local38.anInt5526 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface11_5 == null) {
				this.anInterface11_5 = this.aClass30_Sub1_43.method723(true, local38.aByteArray77, local38.anInt5526);
			} else {
				this.anInterface11_5.method4363(local38.aByteArray77, local38.anInt5526);
			}
			this.aClass123_1.anInterface11_3 = this.anInterface11_5;
		} else {
			this.aClass123_1.anInterface11_3 = this.aClass30_Sub1_43.method723(false, local38.aByteArray77, local38.anInt5526);
		}
		if (!arg0) {
			this.aBoolean560 = true;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)V")
	private void method6098() {
		if (this.anInt7619 == 0) {
			return;
		}
		if (this.aByte102 != 0) {
			this.method6091(true);
		}
		this.method6091(false);
		if (this.aClass123_1 != null) {
			if (this.aClass123_1.anInterface11_3 == null) {
				this.method6097((this.aByte102 & 0x10) != 0);
			}
			if (this.aClass123_1.anInterface11_3 != null) {
				this.aClass30_Sub1_43.method704(this.aClass118_13 != null);
				this.aClass30_Sub1_43.method748(this.aClass118_14, this.aClass118_13, this.aClass118_16, this.aClass118_15);
				@Pc(76) int local76 = this.anIntArray608.length - 1;
				for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
					@Pc(85) int local85 = this.anIntArray608[local78];
					@Pc(92) int local92 = this.anIntArray608[local78 + 1];
					@Pc(99) int local99 = this.aShortArray114[local85] & 0xFFFF;
					if (local99 == 65535) {
						local99 = -1;
					}
					this.aClass30_Sub1_43.method740(local99, this.aClass118_13 != null);
					this.aClass30_Sub1_43.method721(local85 * 3, (local92 - local85) * 3, this.aClass123_1.anInterface11_3);
				}
			}
		}
		this.method6092();
	}

	@OriginalMember(owner = "client!vs", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		return this.aShort100;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6080(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class57_Sub2 local8 = (Class57_Sub2) arg0;
		if (this.anInt7637 == 0 || local8.anInt7637 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt7604;
		@Pc(27) int[] local27 = local8.anIntArray611;
		@Pc(30) int[] local30 = local8.anIntArray612;
		@Pc(33) int[] local33 = local8.anIntArray609;
		@Pc(36) short[] local36 = local8.aShortArray107;
		@Pc(39) short[] local39 = local8.aShortArray115;
		@Pc(42) short[] local42 = local8.aShortArray112;
		@Pc(45) byte[] local45 = local8.aByteArray95;
		@Pc(60) short[] local60;
		@Pc(64) short[] local64;
		@Pc(56) short[] local56;
		@Pc(52) byte[] local52;
		if (this.aClass272_1 == null) {
			local60 = null;
			local52 = null;
			local56 = null;
			local64 = null;
		} else {
			local52 = this.aClass272_1.aByteArray97;
			local56 = this.aClass272_1.aShortArray119;
			local60 = this.aClass272_1.aShortArray117;
			local64 = this.aClass272_1.aShortArray118;
		}
		@Pc(85) short[] local85;
		@Pc(89) short[] local89;
		@Pc(93) short[] local93;
		@Pc(81) byte[] local81;
		if (local8.aClass272_1 == null) {
			local85 = null;
			local93 = null;
			local89 = null;
			local81 = null;
		} else {
			local81 = local8.aClass272_1.aByteArray97;
			local85 = local8.aClass272_1.aShortArray117;
			local89 = local8.aClass272_1.aShortArray118;
			local93 = local8.aClass272_1.aShortArray119;
		}
		@Pc(106) int[] local106 = local8.anIntArray610;
		@Pc(109) short[] local109 = local8.lb;
		if (!local8.aBoolean561) {
			local8.method6099();
		}
		@Pc(118) short local118 = local8.aShort104;
		@Pc(121) short local121 = local8.aShort97;
		@Pc(124) short local124 = local8.aShort101;
		@Pc(127) short local127 = local8.aShort103;
		@Pc(130) short local130 = local8.aShort98;
		@Pc(133) short local133 = local8.aShort96;
		for (@Pc(135) int local135 = 0; local135 < this.anInt7604; local135++) {
			@Pc(145) int local145 = this.anIntArray612[local135] - arg2;
			if (local145 >= local118 && local145 <= local121) {
				@Pc(165) int local165 = this.anIntArray611[local135] - arg1;
				if (local165 >= local124 && local165 <= local127) {
					@Pc(189) int local189 = this.anIntArray609[local135] - arg3;
					if (local130 <= local189 && local189 <= local133) {
						@Pc(203) int local203 = -1;
						@Pc(208) int local208 = this.anIntArray610[local135];
						@Pc(215) int local215 = this.anIntArray610[local135 + 1];
						for (@Pc(217) int local217 = local208; local217 < local215; local217++) {
							local203 = this.lb[local217] - 1;
							if (local203 == -1 || this.aByteArray95[local203] != 0) {
								break;
							}
						}
						if (local203 != -1) {
							for (@Pc(250) int local250 = 0; local250 < local24; local250++) {
								if (local165 == local27[local250] && local33[local250] == local189 && local30[local250] == local145) {
									@Pc(277) int local277 = -1;
									local208 = local106[local250];
									local215 = local106[local250 + 1];
									for (@Pc(289) int local289 = local208; local289 < local215; local289++) {
										local277 = local109[local289] - 1;
										if (local277 == -1 || local45[local277] != 0) {
											break;
										}
									}
									if (local277 != -1) {
										if (local60 == null) {
											this.aClass272_1 = new Class272();
											local60 = this.aClass272_1.aShortArray117 = Static233.method3937(this.aShortArray107);
											local64 = this.aClass272_1.aShortArray118 = Static233.method3937(this.aShortArray115);
											local56 = this.aClass272_1.aShortArray119 = Static233.method3937(this.aShortArray112);
											local52 = this.aClass272_1.aByteArray97 = Static446.method6096(this.aByteArray95);
										}
										if (local85 == null) {
											@Pc(370) Class272 local370 = local8.aClass272_1 = new Class272();
											local85 = local370.aShortArray117 = Static233.method3937(local36);
											local89 = local370.aShortArray118 = Static233.method3937(local39);
											local93 = local370.aShortArray119 = Static233.method3937(local42);
											local81 = local370.aByteArray97 = Static446.method6096(local45);
										}
										@Pc(403) short local403 = this.aShortArray107[local203];
										@Pc(408) short local408 = this.aShortArray115[local203];
										@Pc(413) short local413 = this.aShortArray112[local203];
										@Pc(418) byte local418 = this.aByteArray95[local203];
										local215 = local106[local250 + 1];
										local208 = local106[local250];
										@Pc(438) int local438;
										for (@Pc(430) int local430 = local208; local430 < local215; local430++) {
											local438 = local109[local430] - 1;
											if (local438 == -1) {
												break;
											}
											if (local81[local438] != 0) {
												local85[local438] += local403;
												local89[local438] += local408;
												local93[local438] += local413;
												local81[local438] += local418;
											}
										}
										local413 = local42[local277];
										local408 = local39[local277];
										local215 = this.anIntArray610[local135 + 1];
										local208 = this.anIntArray610[local135];
										local418 = local45[local277];
										local403 = local36[local277];
										for (local438 = local208; local438 < local215; local438++) {
											@Pc(523) int local523 = this.lb[local438] - 1;
											if (local523 == -1) {
												break;
											}
											if (local52[local523] != 0) {
												local60[local523] += local403;
												local64[local523] += local408;
												local56[local523] += local413;
												local52[local523] += local418;
											}
										}
										if (this.aClass118_13 == null && this.aClass118_14 != null) {
											this.aClass118_14.anInterface9_4 = null;
										}
										if (this.aClass118_13 != null) {
											this.aClass118_13.anInterface9_4 = null;
										}
										if (local8.aClass118_13 == null && local8.aClass118_14 != null) {
											local8.aClass118_14.anInterface9_4 = null;
										}
										if (local8.aClass118_13 != null) {
											local8.aClass118_13.anInterface9_4 = null;
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

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	private void method6099() {
		@Pc(7) int local7 = 32767;
		@Pc(15) int local15 = 32767;
		@Pc(17) int local17 = 32767;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt7604; local29++) {
			@Pc(36) int local36 = this.anIntArray611[local29];
			@Pc(41) int local41 = this.anIntArray612[local29];
			if (local19 < local36) {
				local19 = local36;
			}
			if (local41 < local15) {
				local15 = local41;
			}
			if (local36 < local7) {
				local7 = local36;
			}
			if (local41 > local21) {
				local21 = local41;
			}
			@Pc(74) int local74 = this.anIntArray609[local29];
			if (local74 > local23) {
				local23 = local74;
			}
			if (local74 < local17) {
				local17 = local74;
			}
			@Pc(96) int local96 = local74 * local74 + local36 * local36;
			if (local96 > local25) {
				local25 = local96;
			}
			local96 = local74 * local74 + local36 * local36 + local41 * local41;
			if (local96 > local27) {
				local27 = local96;
			}
		}
		this.aShort101 = (short) local7;
		this.aShort97 = (short) local21;
		this.aShort104 = (short) local15;
		this.aShort96 = (short) local23;
		this.aShort103 = (short) local19;
		this.aShort98 = (short) local17;
		this.aShort99 = (short) (Math.sqrt((double) local25) + 0.99D);
		Math.sqrt((double) local27);
		this.aBoolean561 = true;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
	private void method6100() {
		if (this.aClass245Array1 == null) {
			return;
		}
		@Pc(8) Class72_Sub2 local8 = this.aClass30_Sub1_43.aClass72_Sub2_2;
		@Pc(12) float local12 = this.aClass30_Sub1_43.s();
		@Pc(16) float local16 = this.aClass30_Sub1_43.I();
		this.aClass30_Sub1_43.method680();
		this.aClass30_Sub1_43.method2106(false);
		this.aClass30_Sub1_43.method704(false);
		this.aClass30_Sub1_43.method748(null, null, this.aClass30_Sub1_43.aClass118_2, this.aClass30_Sub1_43.aClass118_1);
		for (@Pc(45) int local45 = 0; local45 < this.anInt7617; local45++) {
			@Pc(52) Class245 local52 = this.aClass245Array1[local45];
			@Pc(57) Class267 local57 = this.aClass267Array1[local45];
			if (!local52.aBoolean524 || !this.aClass30_Sub1_43.method2040()) {
				@Pc(85) float local85 = (float) (this.anIntArray611[local52.anInt7077] + this.anIntArray611[local52.anInt7076] + this.anIntArray611[local52.anInt7081]) * 0.3333333F;
				@Pc(107) float local107 = (float) (this.anIntArray612[local52.anInt7081] + this.anIntArray612[local52.anInt7076] + this.anIntArray612[local52.anInt7077]) * 0.3333333F;
				@Pc(129) float local129 = (float) (this.anIntArray609[local52.anInt7081] + this.anIntArray609[local52.anInt7076] + this.anIntArray609[local52.anInt7077]) * 0.3333333F;
				@Pc(143) float local143 = Static144.aFloat59 + local107 * Static292.aFloat78 + local85 * Static452.aFloat97 + local129 * Static317.aFloat79;
				@Pc(157) float local157 = Static458.aFloat98 * local129 + local107 * Static384.aFloat90 + Static233.aFloat68 * local85 + Static343.aFloat81;
				@Pc(171) float local171 = Static185.aFloat66 + local85 * Static44.aFloat27 + Static324.aFloat83 * local107 + Static6.aFloat1 * local129;
				local8.method2191(local52.aShort89 * local57.anInt7753 >> 7, local143 + (float) local57.anInt7750, -local171, local57.anInt7747 * local52.aShort90 >> 7, local57.anInt7754, (float) local57.anInt7755 - local157);
				this.aClass30_Sub1_43.method719(local8);
				this.aClass30_Sub1_43.PA(local16, local12 - (float) local52.anInt7083 * 1.5F);
				@Pc(223) int local223 = local57.anInt7749;
				OpenGL.glColor4ub((byte) (local223 >> 16), (byte) (local223 >> 8), (byte) local223, (byte) (local223 >> 24));
				this.aClass30_Sub1_43.method693(local52.aShort91);
				this.aClass30_Sub1_43.method703(local52.aByte98);
				this.aClass30_Sub1_43.method713(local52.aByte99);
				this.aClass30_Sub1_43.method757(4);
			}
		}
		this.aClass30_Sub1_43.PA(local16, local12);
		this.aClass30_Sub1_43.method2106(true);
		this.aClass30_Sub1_43.method710();
	}

	@OriginalMember(owner = "client!vs", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean561) {
			this.method6099();
		}
		return this.aShort98;
	}

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "(SS)V")
	@Override
	public void i(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7637; local7++) {
			if (arg0 == this.aShortArray111[local7]) {
				this.aShortArray111[local7] = arg1;
			}
		}
		if (this.aClass245Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt7617; local34++) {
				@Pc(41) Class245 local41 = this.aClass245Array1[local34];
				@Pc(46) Class267 local46 = this.aClass267Array1[local34];
				local46.anInt7749 = local46.anInt7749 & 0xFF000000 | Static323.anIntArray198[this.aShortArray111[local41.anInt7080] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass118_14 != null) {
			this.aClass118_14.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "()[Lclient!eh;")
	@Override
	public Class61[] method6076() {
		return this.aClass61Array4;
	}

	@OriginalMember(owner = "client!vs", name = "la", descriptor = "(IIII)V")
	@Override
	protected void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static344.anInt6072 = 0;
			local11 = 0;
			Static193.anInt3854 = 0;
			Static334.anInt5865 = 0;
			for (local17 = 0; local17 < this.anInt7604; local17++) {
				Static334.anInt5865 += this.anIntArray611[local17];
				Static193.anInt3854 += this.anIntArray612[local17];
				local11++;
				Static344.anInt6072 += this.anIntArray609[local17];
			}
			if (local11 <= 0) {
				Static344.anInt6072 = arg3;
				Static193.anInt3854 = arg2;
				Static334.anInt5865 = arg1;
			} else {
				Static334.anInt5865 = Static334.anInt5865 / local11 + arg1;
				Static344.anInt6072 = Static344.anInt6072 / local11 + arg3;
				Static193.anInt3854 = Static193.anInt3854 / local11 + arg2;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt7604; local11++) {
				this.anIntArray611[local11] += arg1;
				this.anIntArray612[local11] += arg2;
				this.anIntArray609[local11] += arg3;
			}
		} else {
			@Pc(165) int local165;
			@Pc(183) int local183;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt7604; local11++) {
					this.anIntArray611[local11] -= Static334.anInt5865;
					this.anIntArray612[local11] -= Static193.anInt3854;
					this.anIntArray609[local11] -= Static344.anInt6072;
					if (arg3 != 0) {
						local17 = Class4_Sub13.anIntArray497[arg3];
						local165 = Class4_Sub13.anIntArray496[arg3];
						local183 = local17 * this.anIntArray612[local11] + local165 * this.anIntArray611[local11] + 32767 >> 15;
						this.anIntArray612[local11] = local165 * this.anIntArray612[local11] + 32767 - this.anIntArray611[local11] * local17 >> 15;
						this.anIntArray611[local11] = local183;
					}
					if (arg1 != 0) {
						local17 = Class4_Sub13.anIntArray497[arg1];
						local165 = Class4_Sub13.anIntArray496[arg1];
						local183 = this.anIntArray612[local11] * local165 + 32767 - local17 * this.anIntArray609[local11] >> 15;
						this.anIntArray609[local11] = local165 * this.anIntArray609[local11] + this.anIntArray612[local11] * local17 + 32767 >> 15;
						this.anIntArray612[local11] = local183;
					}
					if (arg2 != 0) {
						local17 = Class4_Sub13.anIntArray497[arg2];
						local165 = Class4_Sub13.anIntArray496[arg2];
						local183 = this.anIntArray611[local11] * local165 + this.anIntArray609[local11] * local17 + 32767 >> 15;
						this.anIntArray609[local11] = this.anIntArray609[local11] * local165 + 32767 - local17 * this.anIntArray611[local11] >> 15;
						this.anIntArray611[local11] = local183;
					}
					this.anIntArray611[local11] += Static334.anInt5865;
					this.anIntArray612[local11] += Static193.anInt3854;
					this.anIntArray609[local11] += Static344.anInt6072;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt7604; local11++) {
					this.anIntArray611[local11] -= Static334.anInt5865;
					this.anIntArray612[local11] -= Static193.anInt3854;
					this.anIntArray609[local11] -= Static344.anInt6072;
					this.anIntArray611[local11] = arg1 * this.anIntArray611[local11] / 128;
					this.anIntArray612[local11] = this.anIntArray612[local11] * arg2 / 128;
					this.anIntArray609[local11] = this.anIntArray609[local11] * arg3 / 128;
					this.anIntArray611[local11] += Static334.anInt5865;
					this.anIntArray612[local11] += Static193.anInt3854;
					this.anIntArray609[local11] += Static344.anInt6072;
				}
			} else {
				@Pc(523) Class245 local523;
				@Pc(528) Class267 local528;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt7637; local11++) {
						local17 = (this.aByteArray96[local11] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray96[local11] = (byte) local17;
					}
					if (this.aClass118_14 != null) {
						this.aClass118_14.anInterface9_4 = null;
					}
					if (this.aClass245Array1 != null) {
						for (local17 = 0; local17 < this.anInt7617; local17++) {
							local523 = this.aClass245Array1[local17];
							local528 = this.aClass267Array1[local17];
							local528.anInt7749 = local528.anInt7749 & 0xFFFFFF | 255 - (this.aByteArray96[local523.anInt7080] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt7637; local11++) {
						local17 = this.aShortArray111[local11] & 0xFFFF;
						local165 = local17 >> 10 & 0x3F;
						local183 = local17 >> 7 & 0x7;
						@Pc(583) int local583 = local17 & 0x7F;
						local183 += arg2 / 4;
						@Pc(595) int local595 = local165 + arg1 & 0x3F;
						if (local183 < 0) {
							local183 = 0;
						} else if (local183 > 7) {
							local183 = 7;
						}
						local583 += arg3;
						if (local583 < 0) {
							local583 = 0;
						} else if (local583 > 127) {
							local583 = 127;
						}
						this.aShortArray111[local11] = (short) (local595 << 10 | local183 << 7 | local583);
					}
					if (this.aClass118_14 != null) {
						this.aClass118_14.anInterface9_4 = null;
					}
					if (this.aClass245Array1 != null) {
						for (local17 = 0; local17 < this.anInt7617; local17++) {
							local523 = this.aClass245Array1[local17];
							local528 = this.aClass267Array1[local17];
							local528.anInt7749 = local528.anInt7749 & 0xFF000000 | Static323.anIntArray198[this.aShortArray111[local523.anInt7080] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(717) Class267 local717;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt7617; local11++) {
							local717 = this.aClass267Array1[local11];
							local717.anInt7750 += arg1;
							local717.anInt7755 += arg2;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt7617; local11++) {
							local717 = this.aClass267Array1[local11];
							local717.anInt7747 = arg1 * local717.anInt7747 >> 7;
							local717.anInt7753 = local717.anInt7753 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt7617; local11++) {
							local717 = this.aClass267Array1[local11];
							local717.anInt7754 = local717.anInt7754 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class57 method6075(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class57_Sub2 local14;
		@Pc(18) Class57_Sub2 local18;
		if (arg0 == 1) {
			local14 = this.aClass30_Sub1_43.aClass57_Sub2_1;
			local18 = this.aClass30_Sub1_43.aClass57_Sub2_9;
		} else if (arg0 == 2) {
			local14 = this.aClass30_Sub1_43.bf;
			local18 = this.aClass30_Sub1_43.aClass57_Sub2_8;
		} else if (arg0 == 3) {
			local14 = this.aClass30_Sub1_43.aClass57_Sub2_3;
			local18 = this.aClass30_Sub1_43.aClass57_Sub2_4;
		} else if (arg0 == 4) {
			local18 = this.aClass30_Sub1_43.aClass57_Sub2_7;
			local14 = this.aClass30_Sub1_43.aClass57_Sub2_5;
		} else if (arg0 == 5) {
			local14 = this.aClass30_Sub1_43.aClass57_Sub2_6;
			local18 = this.aClass30_Sub1_43.aClass57_Sub2_2;
		} else {
			local14 = local18 = new Class57_Sub2(this.aClass30_Sub1_43);
		}
		return this.method6089(local18, local14, arg2, arg0 != 0, arg1);
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "()Z")
	@Override
	public boolean method6078() {
		if (this.aShortArray114 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray114.length; local12++) {
			if (this.aShortArray114[local12] != -1 && !this.aClass30_Sub1_43.anInterface4_5.method5684(this.aShortArray114[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vs", name = "W", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void W(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static344.anInt6072 = 0;
			local26 = 0;
			Static193.anInt3854 = 0;
			Static334.anInt5865 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray60.length > local38) {
					local52 = this.anIntArrayArray60[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local60]) != 0) {
							Static334.anInt5865 += this.anIntArray611[local60];
							Static193.anInt3854 += this.anIntArray612[local60];
							Static344.anInt6072 += this.anIntArray609[local60];
							local26++;
						}
					}
				}
			}
			if (local26 <= 0) {
				Static193.anInt3854 = arg3;
				Static344.anInt6072 = arg4;
				Static334.anInt5865 = arg2;
			} else {
				Static344.anInt6072 = arg4 + Static344.anInt6072 / local26;
				Static334.anInt5865 = arg2 + Static334.anInt5865 / local26;
				Static193.anInt3854 = arg3 + Static193.anInt3854 / local26;
				Static418.aBoolean197 = true;
			}
			return;
		}
		@Pc(258) int[] local258;
		@Pc(260) int local260;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg7[2] * arg4 + arg2 * arg7[0] + arg7[1] * arg3 + 16384 >> 15;
				local32 = arg7[5] * arg4 + arg3 * arg7[4] + arg2 * arg7[3] + 16384 >> 15;
				local38 = arg4 * arg7[8] + arg2 * arg7[6] + arg7[7] * arg3 + 16384 >> 15;
				arg2 = local26;
				arg3 = local32;
				arg4 = local38;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray60.length > local32) {
					local258 = this.anIntArrayArray60[local32];
					for (local260 = 0; local260 < local258.length; local260++) {
						local54 = local258[local260];
						if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local54]) != 0) {
							this.anIntArray611[local54] += arg2;
							this.anIntArray612[local54] += arg3;
							this.anIntArray609[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(388) int local388;
		@Pc(411) int local411;
		@Pc(433) int local433;
		@Pc(468) int local468;
		@Pc(472) int local472;
		@Pc(476) int local476;
		@Pc(480) int local480;
		@Pc(488) int local488;
		@Pc(496) int local496;
		@Pc(650) int local650;
		@Pc(675) int local675;
		@Pc(679) int local679;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(697) int local697;
		@Pc(701) int local701;
		@Pc(703) int local703;
		@Pc(830) int[] local830;
		@Pc(832) int local832;
		@Pc(836) int local836;
		@Pc(840) int local840;
		@Pc(842) int local842;
		@Pc(971) int local971;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray60.length) {
						local258 = this.anIntArrayArray60[local32];
						for (local260 = 0; local260 < local258.length; local260++) {
							local54 = local258[local260];
							if (this.aShortArray113 == null || (this.aShortArray113[local54] & arg6) != 0) {
								this.anIntArray611[local54] -= Static334.anInt5865;
								this.anIntArray612[local54] -= Static193.anInt3854;
								this.anIntArray609[local54] -= Static344.anInt6072;
								if (arg4 != 0) {
									local60 = Class4_Sub13.anIntArray497[arg4];
									local388 = Class4_Sub13.anIntArray496[arg4];
									local411 = local60 * this.anIntArray612[local54] + local388 * this.anIntArray611[local54] + 32767 >> 15;
									this.anIntArray612[local54] = this.anIntArray612[local54] * local388 + 32767 - this.anIntArray611[local54] * local60 >> 15;
									this.anIntArray611[local54] = local411;
								}
								if (arg2 != 0) {
									local60 = Class4_Sub13.anIntArray497[arg2];
									local388 = Class4_Sub13.anIntArray496[arg2];
									local411 = this.anIntArray612[local54] * local388 + 32767 - local60 * this.anIntArray609[local54] >> 15;
									this.anIntArray609[local54] = this.anIntArray609[local54] * local388 + this.anIntArray612[local54] * local60 + 32767 >> 15;
									this.anIntArray612[local54] = local411;
								}
								if (arg3 != 0) {
									local60 = Class4_Sub13.anIntArray497[arg3];
									local388 = Class4_Sub13.anIntArray496[arg3];
									local411 = this.anIntArray609[local54] * local60 + this.anIntArray611[local54] * local388 + 32767 >> 15;
									this.anIntArray609[local54] = local388 * this.anIntArray609[local54] + 32767 - this.anIntArray611[local54] * local60 >> 15;
									this.anIntArray611[local54] = local411;
								}
								this.anIntArray611[local54] += Static334.anInt5865;
								this.anIntArray612[local54] += Static193.anInt3854;
								this.anIntArray609[local54] += Static344.anInt6072;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray60.length) {
							local52 = this.anIntArrayArray60[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local60]) != 0) {
									local388 = this.anIntArray610[local60];
									local411 = this.anIntArray610[local60 + 1];
									for (local433 = local388; local433 < local411; local433++) {
										local468 = this.lb[local433] - 1;
										if (local468 == -1) {
											break;
										}
										if (arg4 != 0) {
											local472 = Class4_Sub13.anIntArray497[arg4];
											local476 = Class4_Sub13.anIntArray496[arg4];
											local480 = this.aShortArray107[local468] * local476 + this.aShortArray115[local468] * local472 + 32767 >> 15;
											this.aShortArray115[local468] = (short) (local476 * this.aShortArray115[local468] + 32767 - local472 * this.aShortArray107[local468] >> 15);
											this.aShortArray107[local468] = (short) local480;
										}
										if (arg2 != 0) {
											local472 = Class4_Sub13.anIntArray497[arg2];
											local476 = Class4_Sub13.anIntArray496[arg2];
											local480 = this.aShortArray115[local468] * local476 + 32767 - this.aShortArray112[local468] * local472 >> 15;
											this.aShortArray112[local468] = (short) (this.aShortArray115[local468] * local472 + local476 * this.aShortArray112[local468] + 32767 >> 15);
											this.aShortArray115[local468] = (short) local480;
										}
										if (arg3 != 0) {
											local472 = Class4_Sub13.anIntArray497[arg3];
											local476 = Class4_Sub13.anIntArray496[arg3];
											local480 = local472 * this.aShortArray112[local468] + this.aShortArray107[local468] * local476 + 32767 >> 15;
											this.aShortArray112[local468] = (short) (this.aShortArray112[local468] * local476 + 32767 - this.aShortArray107[local468] * local472 >> 15);
											this.aShortArray107[local468] = (short) local480;
										}
									}
								}
							}
						}
					}
					if (this.aClass118_13 == null && this.aClass118_14 != null) {
						this.aClass118_14.anInterface9_4 = null;
					}
					if (this.aClass118_13 != null) {
						this.aClass118_13.anInterface9_4 = null;
					}
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local260 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static418.aBoolean197) {
					local388 = arg7[3] * Static193.anInt3854 + Static334.anInt5865 * arg7[0] + arg7[6] * Static344.anInt6072 + 16384 >> 15;
					local411 = Static193.anInt3854 * arg7[4] + arg7[1] * Static334.anInt5865 + arg7[7] * Static344.anInt6072 + 16384 >> 15;
					local433 = Static193.anInt3854 * arg7[5] + Static334.anInt5865 * arg7[2] + Static344.anInt6072 * arg7[8] + 16384 >> 15;
					local411 += local54;
					local388 += local260;
					local433 += local60;
					Static334.anInt5865 = local388;
					Static193.anInt3854 = local411;
					Static344.anInt6072 = local433;
					Static418.aBoolean197 = false;
				}
				@Pc(456) int[] local456 = new int[9];
				local411 = Class4_Sub13.anIntArray496[arg2];
				local433 = Class4_Sub13.anIntArray497[arg2];
				local468 = Class4_Sub13.anIntArray496[arg3];
				local472 = Class4_Sub13.anIntArray497[arg3];
				local476 = Class4_Sub13.anIntArray496[arg4];
				local480 = Class4_Sub13.anIntArray497[arg4];
				local488 = local476 * local433 + 16384 >> 15;
				local496 = local480 * local433 + 16384 >> 15;
				local456[3] = local411 * local480 + 16384 >> 15;
				local456[0] = local476 * local468 + local496 * local472 + 16384 >> 15;
				local456[8] = local468 * local411 + 16384 >> 15;
				local456[1] = local480 * -local468 + local472 * local488 + 16384 >> 15;
				local456[7] = local480 * local472 + local488 * local468 + 16384 >> 15;
				local456[6] = local476 * -local472 + local468 * local496 + 16384 >> 15;
				local456[2] = local411 * local472 + 16384 >> 15;
				local456[5] = -local433;
				local456[4] = local411 * local476 + 16384 >> 15;
				@Pc(625) int local625 = -Static193.anInt3854 * local456[1] + -Static334.anInt5865 * local456[0] + -Static344.anInt6072 * local456[2] + 16384 >> 15;
				local650 = local456[5] * -Static344.anInt6072 + local456[4] * -Static193.anInt3854 + local456[3] * -Static334.anInt5865 + 16384 >> 15;
				local675 = local456[8] * -Static344.anInt6072 + -Static193.anInt3854 * local456[7] + -Static334.anInt5865 * local456[6] + 16384 >> 15;
				local679 = Static334.anInt5865 + local625;
				@Pc(683) int local683 = local650 + Static193.anInt3854;
				local688 = local675 + Static344.anInt6072;
				@Pc(691) int[] local691 = new int[9];
				for (local693 = 0; local693 < 3; local693++) {
					for (local697 = 0; local697 < 3; local697++) {
						local701 = 0;
						for (local703 = 0; local703 < 3; local703++) {
							local701 += local456[local703 + local693 * 3] * arg7[local703 + local697 * 3];
						}
						local691[local697 + local693 * 3] = local701 + 16384 >> 15;
					}
				}
				local697 = local456[1] * local54 + local260 * local456[0] + local456[2] * local60 + 16384 >> 15;
				local701 = local54 * local456[4] + local456[3] * local260 + local456[5] * local60 + 16384 >> 15;
				local703 = local456[8] * local60 + local260 * local456[6] + local456[7] * local54 + 16384 >> 15;
				local697 += local679;
				local701 += local683;
				local703 += local688;
				local830 = new int[9];
				for (local832 = 0; local832 < 3; local832++) {
					for (local836 = 0; local836 < 3; local836++) {
						local840 = 0;
						for (local842 = 0; local842 < 3; local842++) {
							local840 += local691[local836 + local842 * 3] * arg7[local832 * 3 + local842];
						}
						local830[local832 * 3 + local836] = local840 + 16384 >> 15;
					}
				}
				local836 = local697 * arg7[0] + local701 * arg7[1] + local703 * arg7[2] + 16384 >> 15;
				local840 = local701 * arg7[4] + arg7[3] * local697 + arg7[5] * local703 + 16384 >> 15;
				local840 += local32;
				local842 = local701 * arg7[7] + arg7[6] * local697 + arg7[8] * local703 + 16384 >> 15;
				local836 += local26;
				local842 += local38;
				for (local971 = 0; local971 < local8; local971++) {
					@Pc(977) int local977 = arg1[local971];
					if (local977 < this.anIntArrayArray60.length) {
						@Pc(991) int[] local991 = this.anIntArrayArray60[local977];
						for (@Pc(993) int local993 = 0; local993 < local991.length; local993++) {
							@Pc(999) int local999 = local991[local993];
							if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local999]) != 0) {
								@Pc(1043) int local1043 = this.anIntArray609[local999] * local830[2] + local830[0] * this.anIntArray611[local999] + this.anIntArray612[local999] * local830[1] + 16384 >> 15;
								@Pc(1074) int local1074 = this.anIntArray609[local999] * local830[5] + local830[4] * this.anIntArray612[local999] + this.anIntArray611[local999] * local830[3] + 16384 >> 15;
								@Pc(1078) int local1078 = local1043 + local836;
								@Pc(1082) int local1082 = local1074 + local840;
								@Pc(1114) int local1114 = local830[8] * this.anIntArray609[local999] + local830[6] * this.anIntArray611[local999] + this.anIntArray612[local999] * local830[7] + 16384 >> 15;
								this.anIntArray611[local999] = local1078;
								@Pc(1123) int local1123 = local1114 + local842;
								this.anIntArray612[local999] = local1082;
								this.anIntArray609[local999] = local1123;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2590) Class245 local2590;
			@Pc(2595) Class267 local2595;
			if (arg0 == 5) {
				if (this.anIntArrayArray59 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray59.length > local32) {
							local258 = this.anIntArrayArray59[local32];
							for (local260 = 0; local260 < local258.length; local260++) {
								local54 = local258[local260];
								if (this.aShortArray116 == null || (this.aShortArray116[local54] & arg6) != 0) {
									local60 = (this.aByteArray96[local54] & 0xFF) + (arg2 * 8);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray96[local54] = (byte) local60;
									if (this.aClass118_14 != null) {
										this.aClass118_14.anInterface9_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass245Array1 != null) {
						for (local32 = 0; local32 < this.anInt7617; local32++) {
							local2590 = this.aClass245Array1[local32];
							local2595 = this.aClass267Array1[local32];
							local2595.anInt7749 = local2595.anInt7749 & 0xFFFFFF | 255 - (this.aByteArray96[local2590.anInt7080] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2848) Class267 local2848;
				if (arg0 == 8) {
					if (this.anIntArrayArray61 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray61.length) {
								local258 = this.anIntArrayArray61[local32];
								for (local260 = 0; local260 < local258.length; local260++) {
									local2848 = this.aClass267Array1[local258[local260]];
									local2848.anInt7750 += arg2;
									local2848.anInt7755 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray61 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray61.length > local32) {
								local258 = this.anIntArrayArray61[local32];
								for (local260 = 0; local260 < local258.length; local260++) {
									local2848 = this.aClass267Array1[local258[local260]];
									local2848.anInt7753 = arg3 * local2848.anInt7753 >> 7;
									local2848.anInt7747 = arg2 * local2848.anInt7747 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray61 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray61.length > local32) {
							local258 = this.anIntArrayArray61[local32];
							for (local260 = 0; local260 < local258.length; local260++) {
								local2848 = this.aClass267Array1[local258[local260]];
								local2848.anInt7754 = local2848.anInt7754 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray59 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray59.length > local32) {
						local258 = this.anIntArrayArray59[local32];
						for (local260 = 0; local260 < local258.length; local260++) {
							local54 = local258[local260];
							if (this.aShortArray116 == null || (this.aShortArray116[local54] & arg6) != 0) {
								local60 = this.aShortArray111[local54] & 0xFFFF;
								local388 = local60 >> 10 & 0x3F;
								local411 = local60 >> 7 & 0x7;
								local411 += arg3 / 4;
								local433 = local60 & 0x7F;
								@Pc(2697) int local2697 = arg2 + local388 & 0x3F;
								local433 += arg4;
								if (local411 < 0) {
									local411 = 0;
								} else if (local411 > 7) {
									local411 = 7;
								}
								if (local433 < 0) {
									local433 = 0;
								} else if (local433 > 127) {
									local433 = 127;
								}
								this.aShortArray111[local54] = (short) (local433 | local411 << 7 | local2697 << 10);
								if (this.aClass118_14 != null) {
									this.aClass118_14.anInterface9_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass245Array1 != null) {
					for (local32 = 0; local32 < this.anInt7617; local32++) {
						local2590 = this.aClass245Array1[local32];
						local2595 = this.aClass267Array1[local32];
						local2595.anInt7749 = Static323.anIntArray198[this.aShortArray111[local2590.anInt7080] & 0xFFFF] & 0xFFFFFF | local2595.anInt7749 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray60.length > local32) {
					local258 = this.anIntArrayArray60[local32];
					for (local260 = 0; local260 < local258.length; local260++) {
						local54 = local258[local260];
						if (this.aShortArray113 == null || (this.aShortArray113[local54] & arg6) != 0) {
							this.anIntArray611[local54] -= Static334.anInt5865;
							this.anIntArray612[local54] -= Static193.anInt3854;
							this.anIntArray609[local54] -= Static344.anInt6072;
							this.anIntArray611[local54] = arg2 * this.anIntArray611[local54] >> 7;
							this.anIntArray612[local54] = arg3 * this.anIntArray612[local54] >> 7;
							this.anIntArray609[local54] = this.anIntArray609[local54] * arg4 >> 7;
							this.anIntArray611[local54] += Static334.anInt5865;
							this.anIntArray612[local54] += Static193.anInt3854;
							this.anIntArray609[local54] += Static344.anInt6072;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local260 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static418.aBoolean197) {
				local388 = arg7[6] * Static344.anInt6072 + Static334.anInt5865 * arg7[0] + arg7[3] * Static193.anInt3854 + 16384 >> 15;
				local411 = Static334.anInt5865 * arg7[1] + arg7[4] * Static193.anInt3854 + arg7[7] * Static344.anInt6072 + 16384 >> 15;
				local433 = Static344.anInt6072 * arg7[8] + Static334.anInt5865 * arg7[2] + Static193.anInt3854 * arg7[5] + 16384 >> 15;
				local411 += local54;
				local388 += local260;
				local433 += local60;
				Static334.anInt5865 = local388;
				Static193.anInt3854 = local411;
				Static344.anInt6072 = local433;
				Static418.aBoolean197 = false;
			}
			local388 = arg2 << 15 >> 7;
			local411 = arg3 << 15 >> 7;
			local433 = arg4 << 15 >> 7;
			local468 = -Static334.anInt5865 * local388 + 16384 >> 15;
			local472 = local411 * -Static193.anInt3854 + 16384 >> 15;
			local476 = local433 * -Static344.anInt6072 + 16384 >> 15;
			local480 = local468 + Static334.anInt5865;
			local488 = local472 + Static193.anInt3854;
			local496 = local476 + Static344.anInt6072;
			@Pc(2025) int[] local2025 = new int[] { local388 * arg7[0] + 16384 >> 15, local388 * arg7[3] + 16384 >> 15, arg7[6] * local388 + 16384 >> 15, local411 * arg7[1] + 16384 >> 15, local411 * arg7[4] + 16384 >> 15, arg7[7] * local411 + 16384 >> 15, local433 * arg7[2] + 16384 >> 15, arg7[5] * local433 + 16384 >> 15, arg7[8] * local433 + 16384 >> 15 };
			local650 = local388 * local260 + 16384 >> 15;
			local675 = local54 * local411 + 16384 >> 15;
			local679 = local60 * local433 + 16384 >> 15;
			@Pc(2161) int local2161 = local675 + local488;
			@Pc(2165) int local2165 = local650 + local480;
			@Pc(2169) int local2169 = local679 + local496;
			@Pc(2172) int[] local2172 = new int[9];
			@Pc(2178) int local2178;
			for (local688 = 0; local688 < 3; local688++) {
				for (local2178 = 0; local2178 < 3; local2178++) {
					local693 = 0;
					for (local697 = 0; local697 < 3; local697++) {
						local693 += local2025[local2178 + local697 * 3] * arg7[local688 * 3 + local697];
					}
					local2172[local688 * 3 + local2178] = local693 + 16384 >> 15;
				}
			}
			local2178 = arg7[2] * local2169 + local2161 * arg7[1] + local2165 * arg7[0] + 16384 >> 15;
			local693 = local2169 * arg7[5] + arg7[4] * local2161 + local2165 * arg7[3] + 16384 >> 15;
			local697 = arg7[7] * local2161 + arg7[6] * local2165 + arg7[8] * local2169 + 16384 >> 15;
			local2178 += local26;
			local693 += local32;
			local697 += local38;
			for (local701 = 0; local701 < local8; local701++) {
				local703 = arg1[local701];
				if (this.anIntArrayArray60.length > local703) {
					local830 = this.anIntArrayArray60[local703];
					for (local832 = 0; local832 < local830.length; local832++) {
						local836 = local830[local832];
						if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local836]) != 0) {
							local840 = local2172[1] * this.anIntArray612[local836] + local2172[0] * this.anIntArray611[local836] + local2172[2] * this.anIntArray609[local836] + 16384 >> 15;
							local842 = this.anIntArray609[local836] * local2172[5] + this.anIntArray612[local836] * local2172[4] + this.anIntArray611[local836] * local2172[3] + 16384 >> 15;
							@Pc(2422) int local2422 = local842 + local693;
							@Pc(2426) int local2426 = local840 + local2178;
							local971 = this.anIntArray611[local836] * local2172[6] + this.anIntArray612[local836] * local2172[7] + local2172[8] * this.anIntArray609[local836] + 16384 >> 15;
							@Pc(2461) int local2461 = local971 + local697;
							this.anIntArray611[local836] = local2426;
							this.anIntArray612[local836] = local2422;
							this.anIntArray609[local836] = local2461;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!fl;I)V")
	private void method6102(@OriginalArg(0) Class72_Sub2 arg0) {
		@Pc(10) int local10;
		if (this.aClass61Array4 != null) {
			for (local10 = 0; local10 < this.aClass61Array4.length; local10++) {
				@Pc(17) Class61 local17 = this.aClass61Array4[local10];
				@Pc(19) Class61 local19 = local17;
				if (local17.aClass61_1 != null) {
					local19 = local17.aClass61_1;
				}
				local19.anInt1976 = (int) (arg0.aFloat48 + arg0.aFloat50 * (float) this.anIntArray609[local17.anInt1987] + (float) this.anIntArray611[local17.anInt1987] * arg0.aFloat56 + (float) this.anIntArray612[local17.anInt1987] * arg0.aFloat55);
				local19.anInt1978 = (int) (arg0.aFloat46 + arg0.aFloat49 * (float) this.anIntArray609[local17.anInt1987] + (float) this.anIntArray612[local17.anInt1987] * arg0.aFloat47 + arg0.aFloat53 * (float) this.anIntArray611[local17.anInt1987]);
				local19.anInt1984 = (int) (arg0.aFloat54 + arg0.aFloat52 * (float) this.anIntArray611[local17.anInt1987] + (float) this.anIntArray612[local17.anInt1987] * arg0.aFloat51 + (float) this.anIntArray609[local17.anInt1987] * arg0.aFloat45);
				local19.anInt1980 = (int) (arg0.aFloat48 + arg0.aFloat55 * (float) this.anIntArray612[local17.anInt1985] + arg0.aFloat56 * (float) this.anIntArray611[local17.anInt1985] + (float) this.anIntArray609[local17.anInt1985] * arg0.aFloat50);
				local19.anInt1981 = (int) (arg0.aFloat46 + arg0.aFloat49 * (float) this.anIntArray609[local17.anInt1985] + arg0.aFloat53 * (float) this.anIntArray611[local17.anInt1985] + arg0.aFloat47 * (float) this.anIntArray612[local17.anInt1985]);
				local19.anInt1975 = (int) ((float) this.anIntArray609[local17.anInt1985] * arg0.aFloat45 + (float) this.anIntArray612[local17.anInt1985] * arg0.aFloat51 + arg0.aFloat52 * (float) this.anIntArray611[local17.anInt1985] + arg0.aFloat54);
				local19.anInt1989 = (int) (arg0.aFloat48 + (float) this.anIntArray611[local17.anInt1983] * arg0.aFloat56 + (float) this.anIntArray612[local17.anInt1983] * arg0.aFloat55 + (float) this.anIntArray609[local17.anInt1983] * arg0.aFloat50);
				local19.anInt1977 = (int) (arg0.aFloat46 + (float) this.anIntArray611[local17.anInt1983] * arg0.aFloat53 + arg0.aFloat47 * (float) this.anIntArray612[local17.anInt1983] + (float) this.anIntArray609[local17.anInt1983] * arg0.aFloat49);
				local19.anInt1982 = (int) (arg0.aFloat54 + (float) this.anIntArray612[local17.anInt1983] * arg0.aFloat51 + (float) this.anIntArray611[local17.anInt1983] * arg0.aFloat52 + arg0.aFloat45 * (float) this.anIntArray609[local17.anInt1983]);
			}
		}
		if (this.aClass239Array4 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass239Array4.length; local10++) {
			@Pc(358) Class239 local358 = this.aClass239Array4[local10];
			@Pc(360) Class239 local360 = local358;
			if (local358.aClass239_2 != null) {
				local360 = local358.aClass239_2;
			}
			if (local358.aClass72_6 == null) {
				local358.aClass72_6 = arg0.method3307();
			} else {
				local358.aClass72_6.ya(arg0);
			}
			local360.anInt6765 = (int) (arg0.aFloat48 + (float) this.anIntArray612[local358.anInt6763] * arg0.aFloat55 + (float) this.anIntArray611[local358.anInt6763] * arg0.aFloat56 + arg0.aFloat50 * (float) this.anIntArray609[local358.anInt6763]);
			local360.anInt6761 = (int) (arg0.aFloat46 + arg0.aFloat47 * (float) this.anIntArray612[local358.anInt6763] + (float) this.anIntArray611[local358.anInt6763] * arg0.aFloat53 + arg0.aFloat49 * (float) this.anIntArray609[local358.anInt6763]);
			local360.anInt6758 = (int) (arg0.aFloat51 * (float) this.anIntArray612[local358.anInt6763] + (float) this.anIntArray611[local358.anInt6763] * arg0.aFloat52 + arg0.aFloat45 * (float) this.anIntArray609[local358.anInt6763] + arg0.aFloat54);
		}
	}

	@OriginalMember(owner = "client!vs", name = "IA", descriptor = "(I)V")
	@Override
	public void IA(@OriginalArg(0) int arg0) {
		if (this.aClass118_14 != null) {
			this.aClass118_14.anInterface9_4 = null;
		}
		this.aShort102 = (short) arg0;
		if (this.aClass118_13 != null) {
			this.aClass118_13.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!vs", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean561) {
			this.method6099();
		}
		return this.aShort99;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!n;Lclient!wc;I)V")
	@Override
	public void method6073(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class71_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7645 == 0) {
			return;
		}
		@Pc(16) Class72_Sub2 local16 = this.aClass30_Sub1_43.aClass72_Sub2_3;
		@Pc(19) Class72_Sub2 local19 = (Class72_Sub2) arg0;
		if (!this.aBoolean561) {
			this.method6099();
		}
		this.method6102(local19);
		Static185.aFloat66 = local16.aFloat54 + local16.aFloat51 * local19.aFloat46 + local16.aFloat52 * local19.aFloat48 + local19.aFloat54 * local16.aFloat45;
		Static324.aFloat83 = local19.aFloat55 * local16.aFloat52 + local19.aFloat47 * local16.aFloat51 + local19.aFloat51 * local16.aFloat45;
		@Pc(76) float local76 = Static324.aFloat83 * (float) this.aShort104 + Static185.aFloat66;
		@Pc(84) float local84 = Static324.aFloat83 * (float) this.aShort97 + Static185.aFloat66;
		@Pc(94) float local94;
		@Pc(100) float local100;
		if (local76 > local84) {
			local94 = local84 - (float) this.aShort99;
			local100 = (float) this.aShort99 + local76;
		} else {
			local94 = local76 - (float) this.aShort99;
			local100 = (float) this.aShort99 + local84;
		}
		if (local94 >= this.aClass30_Sub1_43.aFloat24 || (float) this.aClass30_Sub1_43.anInt877 >= local100) {
			return;
		}
		Static292.aFloat78 = local19.aFloat47 * local16.aFloat55 + local16.aFloat56 * local19.aFloat55 + local19.aFloat51 * local16.aFloat50;
		Static144.aFloat59 = local19.aFloat54 * local16.aFloat50 + local19.aFloat48 * local16.aFloat56 + local19.aFloat46 * local16.aFloat55 + local16.aFloat48;
		@Pc(176) float local176 = (float) this.aShort104 * Static292.aFloat78 + Static144.aFloat59;
		@Pc(184) float local184 = (float) this.aShort97 * Static292.aFloat78 + Static144.aFloat59;
		@Pc(199) float local199;
		@Pc(210) float local210;
		if (local184 < local176) {
			local199 = (local184 - (float) this.aShort99) * (float) this.aClass30_Sub1_43.anInt870;
			local210 = ((float) this.aShort99 + local176) * (float) this.aClass30_Sub1_43.anInt870;
		} else {
			local199 = (float) this.aClass30_Sub1_43.anInt870 * (local176 - (float) this.aShort99);
			local210 = (float) this.aClass30_Sub1_43.anInt870 * ((float) this.aShort99 + local184);
		}
		if (this.aClass30_Sub1_43.aFloat18 <= local199 / local100 || this.aClass30_Sub1_43.aFloat19 >= local210 / local100) {
			return;
		}
		Static384.aFloat90 = local16.aFloat49 * local19.aFloat51 + local19.aFloat55 * local16.aFloat53 + local16.aFloat47 * local19.aFloat47;
		Static343.aFloat81 = local19.aFloat46 * local16.aFloat47 + local16.aFloat53 * local19.aFloat48 + local19.aFloat54 * local16.aFloat49 + local16.aFloat46;
		@Pc(299) float local299 = Static343.aFloat81 + (float) this.aShort104 * Static384.aFloat90;
		@Pc(307) float local307 = (float) this.aShort97 * Static384.aFloat90 + Static343.aFloat81;
		@Pc(333) float local333;
		@Pc(322) float local322;
		if (local307 < local299) {
			local333 = (float) this.aClass30_Sub1_43.anInt873 * (local307 - (float) this.aShort99);
			local322 = (local299 + (float) this.aShort99) * (float) this.aClass30_Sub1_43.anInt873;
		} else {
			local322 = (float) this.aClass30_Sub1_43.anInt873 * (local307 + (float) this.aShort99);
			local333 = (float) this.aClass30_Sub1_43.anInt873 * (local299 - (float) this.aShort99);
		}
		if (this.aClass30_Sub1_43.aFloat10 <= local333 / local100 || local322 / local100 <= this.aClass30_Sub1_43.aFloat11) {
			return;
		}
		if (arg1 != null || this.aClass245Array1 != null) {
			Static458.aFloat98 = local16.aFloat47 * local19.aFloat49 + local16.aFloat53 * local19.aFloat50 + local16.aFloat49 * local19.aFloat45;
			Static317.aFloat79 = local19.aFloat49 * local16.aFloat55 + local19.aFloat50 * local16.aFloat56 + local19.aFloat45 * local16.aFloat50;
			Static44.aFloat27 = local16.aFloat45 * local19.aFloat52 + local19.aFloat53 * local16.aFloat51 + local19.aFloat56 * local16.aFloat52;
			Static6.aFloat1 = local16.aFloat52 * local19.aFloat50 + local16.aFloat51 * local19.aFloat49 + local19.aFloat45 * local16.aFloat45;
			Static452.aFloat97 = local19.aFloat52 * local16.aFloat50 + local16.aFloat56 * local19.aFloat56 + local19.aFloat53 * local16.aFloat55;
			Static233.aFloat68 = local19.aFloat52 * local16.aFloat49 + local16.aFloat47 * local19.aFloat53 + local16.aFloat53 * local19.aFloat56;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(503) int local503 = this.aShort101 + this.aShort103 >> 1;
			@Pc(512) int local512 = this.aShort98 + this.aShort96 >> 1;
			@Pc(531) int local531 = (int) (Static452.aFloat97 * (float) local503 + Static144.aFloat59 + Static292.aFloat78 * (float) this.aShort104 + (float) local512 * Static317.aFloat79);
			@Pc(550) int local550 = (int) ((float) local512 * Static458.aFloat98 + (float) local503 * Static233.aFloat68 + Static343.aFloat81 + (float) this.aShort104 * Static384.aFloat90);
			@Pc(569) int local569 = (int) (Static6.aFloat1 * (float) local512 + Static44.aFloat27 * (float) local503 + Static185.aFloat66 + Static324.aFloat83 * (float) this.aShort104);
			if (this.aClass30_Sub1_43.anInt877 > local569) {
				local492 = true;
			} else {
				arg1.anInt7743 = this.aClass30_Sub1_43.anInt870 * local531 / local569 + this.aClass30_Sub1_43.anInt852;
				arg1.anInt7744 = this.aClass30_Sub1_43.anInt866 + local550 * this.aClass30_Sub1_43.anInt873 / local569;
			}
			@Pc(628) int local628 = (int) ((float) local512 * Static317.aFloat79 + Static292.aFloat78 * (float) this.aShort97 + Static452.aFloat97 * (float) local503 + Static144.aFloat59);
			@Pc(647) int local647 = (int) (Static233.aFloat68 * (float) local503 + Static343.aFloat81 + (float) this.aShort97 * Static384.aFloat90 + Static458.aFloat98 * (float) local512);
			@Pc(666) int local666 = (int) (Static6.aFloat1 * (float) local512 + (float) this.aShort97 * Static324.aFloat83 + Static185.aFloat66 + Static44.aFloat27 * (float) local503);
			if (this.aClass30_Sub1_43.anInt877 > local666) {
				local492 = true;
			} else {
				arg1.anInt7740 = local647 * this.aClass30_Sub1_43.anInt873 / local666 + this.aClass30_Sub1_43.anInt866;
				arg1.anInt7742 = this.aClass30_Sub1_43.anInt870 * local628 / local666 + this.aClass30_Sub1_43.anInt852;
			}
			if (local492) {
				if (local569 < this.aClass30_Sub1_43.anInt877 && local666 < this.aClass30_Sub1_43.anInt877) {
					local494 = false;
				} else {
					@Pc(744) int local744;
					@Pc(756) int local756;
					@Pc(782) int local782;
					if (local569 < this.aClass30_Sub1_43.anInt877) {
						local744 = (local666 - this.aClass30_Sub1_43.anInt877 << 16) / (local666 - local569);
						local756 = ((local628 - local531) * local744 >> 16) + local628;
						local782 = ((local647 - local550) * local744 >> 16) + local647;
						arg1.anInt7743 = this.aClass30_Sub1_43.anInt852 + local756 * this.aClass30_Sub1_43.anInt870 / this.aClass30_Sub1_43.anInt877;
						arg1.anInt7744 = this.aClass30_Sub1_43.anInt866 + this.aClass30_Sub1_43.anInt873 * local782 / this.aClass30_Sub1_43.anInt877;
					} else if (this.aClass30_Sub1_43.anInt877 > local666) {
						local744 = (local569 - this.aClass30_Sub1_43.anInt877 << 16) / (local569 - local666);
						local756 = local531 + ((local531 - local628) * local744 >> 16);
						arg1.anInt7743 = this.aClass30_Sub1_43.anInt852 + this.aClass30_Sub1_43.anInt870 * local756 / this.aClass30_Sub1_43.anInt877;
						local782 = ((local550 - local647) * local744 >> 16) + local550;
						arg1.anInt7744 = this.aClass30_Sub1_43.anInt866 + local782 * this.aClass30_Sub1_43.anInt873 / this.aClass30_Sub1_43.anInt877;
					}
				}
			}
			if (local494) {
				arg1.aBoolean566 = true;
				if (local569 <= local666) {
					arg1.anInt7741 = this.aClass30_Sub1_43.anInt852 + (this.aShort99 + local628) * this.aClass30_Sub1_43.anInt870 / local666 - arg1.anInt7742;
				} else {
					arg1.anInt7741 = (this.aShort99 + local531) * this.aClass30_Sub1_43.anInt870 / local569 + this.aClass30_Sub1_43.anInt852 - arg1.anInt7743;
				}
			}
		}
		this.aClass30_Sub1_43.method702();
		this.aClass30_Sub1_43.method736(local19);
		this.method6098();
		this.aClass30_Sub1_43.method710();
		this.method6100();
	}

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			local22 = arg4 << 4;
			Static334.anInt5865 = 0;
			Static193.anInt3854 = 0;
			Static344.anInt6072 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray60.length) {
					local52 = this.anIntArrayArray60[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static334.anInt5865 += this.anIntArray611[local60];
						Static193.anInt3854 += this.anIntArray612[local60];
						local30++;
						Static344.anInt6072 += this.anIntArray609[local60];
					}
				}
			}
			if (local30 <= 0) {
				Static334.anInt5865 = local18;
				Static193.anInt3854 = local14;
				Static344.anInt6072 = local22;
			} else {
				Static344.anInt6072 = local22 + Static344.anInt6072 / local30;
				Static193.anInt3854 = Static193.anInt3854 / local30 + local14;
				Static334.anInt5865 = local18 + Static334.anInt5865 / local30;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local14 = arg3 << 4;
			local22 = arg4 << 4;
			local18 = arg2 << 4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray60.length > local32) {
					local162 = this.anIntArrayArray60[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local54 = local162[local164];
						this.anIntArray611[local54] += local18;
						this.anIntArray612[local54] += local14;
						this.anIntArray609[local54] += local22;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(290) int local290;
		@Pc(750) int local750;
		if (arg0 == 2) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray60.length > local32) {
					local162 = this.anIntArrayArray60[local32];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							this.anIntArray611[local54] -= Static334.anInt5865;
							this.anIntArray612[local54] -= Static193.anInt3854;
							this.anIntArray609[local54] -= Static344.anInt6072;
							if (arg4 != 0) {
								local60 = Class4_Sub13.anIntArray497[arg4];
								local271 = Class4_Sub13.anIntArray496[arg4];
								local290 = this.anIntArray612[local54] * local60 + local271 * this.anIntArray611[local54] + 32767 >> 15;
								this.anIntArray612[local54] = this.anIntArray612[local54] * local271 + 32767 - local60 * this.anIntArray611[local54] >> 15;
								this.anIntArray611[local54] = local290;
							}
							if (arg2 != 0) {
								local60 = Class4_Sub13.anIntArray497[arg2];
								local271 = Class4_Sub13.anIntArray496[arg2];
								local290 = this.anIntArray612[local54] * local271 + 32767 - this.anIntArray609[local54] * local60 >> 15;
								this.anIntArray609[local54] = this.anIntArray612[local54] * local60 + local271 * this.anIntArray609[local54] + 32767 >> 15;
								this.anIntArray612[local54] = local290;
							}
							if (arg3 != 0) {
								local60 = Class4_Sub13.anIntArray497[arg3];
								local271 = Class4_Sub13.anIntArray496[arg3];
								local290 = local60 * this.anIntArray609[local54] + local271 * this.anIntArray611[local54] + 32767 >> 15;
								this.anIntArray609[local54] = local271 * this.anIntArray609[local54] + 32767 - this.anIntArray611[local54] * local60 >> 15;
								this.anIntArray611[local54] = local290;
							}
							this.anIntArray611[local54] += Static334.anInt5865;
							this.anIntArray612[local54] += Static193.anInt3854;
							this.anIntArray609[local54] += Static344.anInt6072;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							this.anIntArray611[local54] -= Static334.anInt5865;
							this.anIntArray612[local54] -= Static193.anInt3854;
							this.anIntArray609[local54] -= Static344.anInt6072;
							if (arg2 != 0) {
								local60 = Class4_Sub13.anIntArray497[arg2];
								local271 = Class4_Sub13.anIntArray496[arg2];
								local290 = this.anIntArray612[local54] * local271 + 32767 - local60 * this.anIntArray609[local54] >> 15;
								this.anIntArray609[local54] = local60 * this.anIntArray612[local54] + this.anIntArray609[local54] * local271 + 32767 >> 15;
								this.anIntArray612[local54] = local290;
							}
							if (arg4 != 0) {
								local60 = Class4_Sub13.anIntArray497[arg4];
								local271 = Class4_Sub13.anIntArray496[arg4];
								local290 = local60 * this.anIntArray612[local54] + local271 * this.anIntArray611[local54] + 32767 >> 15;
								this.anIntArray612[local54] = this.anIntArray612[local54] * local271 + 32767 - local60 * this.anIntArray611[local54] >> 15;
								this.anIntArray611[local54] = local290;
							}
							if (arg3 != 0) {
								local60 = Class4_Sub13.anIntArray497[arg3];
								local271 = Class4_Sub13.anIntArray496[arg3];
								local290 = this.anIntArray611[local54] * local271 + local60 * this.anIntArray609[local54] + 32767 >> 15;
								this.anIntArray609[local54] = this.anIntArray609[local54] * local271 + 32767 - local60 * this.anIntArray611[local54] >> 15;
								this.anIntArray611[local54] = local290;
							}
							this.anIntArray611[local54] += Static334.anInt5865;
							this.anIntArray612[local54] += Static193.anInt3854;
							this.anIntArray609[local54] += Static344.anInt6072;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray60.length > local38) {
						local52 = this.anIntArrayArray60[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local271 = this.anIntArray610[local60];
							local290 = this.anIntArray610[local60 + 1];
							for (local750 = local271; local750 < local290; local750++) {
								@Pc(759) int local759 = this.lb[local750] - 1;
								if (local759 == -1) {
									break;
								}
								@Pc(771) int local771;
								@Pc(775) int local775;
								@Pc(794) int local794;
								if (arg4 != 0) {
									local771 = Class4_Sub13.anIntArray497[arg4];
									local775 = Class4_Sub13.anIntArray496[arg4];
									local794 = this.aShortArray115[local759] * local771 + local775 * this.aShortArray107[local759] + 32767 >> 15;
									this.aShortArray115[local759] = (short) (this.aShortArray115[local759] * local775 + 32767 - this.aShortArray107[local759] * local771 >> 15);
									this.aShortArray107[local759] = (short) local794;
								}
								if (arg2 != 0) {
									local771 = Class4_Sub13.anIntArray497[arg2];
									local775 = Class4_Sub13.anIntArray496[arg2];
									local794 = this.aShortArray115[local759] * local775 + 32767 - local771 * this.aShortArray112[local759] >> 15;
									this.aShortArray112[local759] = (short) (local775 * this.aShortArray112[local759] + local771 * this.aShortArray115[local759] + 32767 >> 15);
									this.aShortArray115[local759] = (short) local794;
								}
								if (arg3 != 0) {
									local771 = Class4_Sub13.anIntArray497[arg3];
									local775 = Class4_Sub13.anIntArray496[arg3];
									local794 = local771 * this.aShortArray112[local759] + local775 * this.aShortArray107[local759] + 32767 >> 15;
									this.aShortArray112[local759] = (short) (local775 * this.aShortArray112[local759] + 32767 - this.aShortArray107[local759] * local771 >> 15);
									this.aShortArray107[local759] = (short) local794;
								}
							}
						}
					}
				}
				if (this.aClass118_13 == null && this.aClass118_14 != null) {
					this.aClass118_14.anInterface9_4 = null;
				}
				if (this.aClass118_13 != null) {
					this.aClass118_13.anInterface9_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray60.length) {
					local162 = this.anIntArrayArray60[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local54 = local162[local164];
						this.anIntArray611[local54] -= Static334.anInt5865;
						this.anIntArray612[local54] -= Static193.anInt3854;
						this.anIntArray609[local54] -= Static344.anInt6072;
						this.anIntArray611[local54] = this.anIntArray611[local54] * arg2 >> 7;
						this.anIntArray612[local54] = this.anIntArray612[local54] * arg3 >> 7;
						this.anIntArray609[local54] = this.anIntArray609[local54] * arg4 >> 7;
						this.anIntArray611[local54] += Static334.anInt5865;
						this.anIntArray612[local54] += Static193.anInt3854;
						this.anIntArray609[local54] += Static344.anInt6072;
					}
				}
			}
		} else {
			@Pc(1191) Class245 local1191;
			@Pc(1196) Class267 local1196;
			if (arg0 == 5) {
				if (this.anIntArrayArray59 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray59.length > local32) {
							local162 = this.anIntArrayArray59[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local54 = local162[local164];
								local60 = arg2 * 8 + (this.aByteArray96[local54] & 0xFF);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray96[local54] = (byte) local60;
							}
							if (local162.length > 0 && this.aClass118_14 != null) {
								this.aClass118_14.anInterface9_4 = null;
							}
						}
					}
					if (this.aClass245Array1 != null) {
						for (local32 = 0; local32 < this.anInt7617; local32++) {
							local1191 = this.aClass245Array1[local32];
							local1196 = this.aClass267Array1[local32];
							local1196.anInt7749 = local1196.anInt7749 & 0xFFFFFF | 255 - (this.aByteArray96[local1191.anInt7080] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1439) Class267 local1439;
				if (arg0 == 8) {
					if (this.anIntArrayArray61 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (this.anIntArrayArray61.length > local32) {
								local162 = this.anIntArrayArray61[local32];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1439 = this.aClass267Array1[local162[local164]];
									local1439.anInt7755 += arg3;
									local1439.anInt7750 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray61 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (this.anIntArrayArray61.length > local32) {
								local162 = this.anIntArrayArray61[local32];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1439 = this.aClass267Array1[local162[local164]];
									local1439.anInt7753 = local1439.anInt7753 * arg3 >> 7;
									local1439.anInt7747 = local1439.anInt7747 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray61 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray61.length) {
							local162 = this.anIntArrayArray61[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1439 = this.aClass267Array1[local162[local164]];
								local1439.anInt7754 = arg2 + local1439.anInt7754 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray59 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray59.length > local32) {
						local162 = this.anIntArrayArray59[local32];
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							local60 = this.aShortArray111[local54] & 0xFFFF;
							local271 = local60 >> 10 & 0x3F;
							local290 = local60 >> 7 & 0x7;
							local750 = local60 & 0x7F;
							local290 += arg3 / 4;
							@Pc(1290) int local1290 = arg2 + local271 & 0x3F;
							local750 += arg4;
							if (local290 < 0) {
								local290 = 0;
							} else if (local290 > 7) {
								local290 = 7;
							}
							if (local750 < 0) {
								local750 = 0;
							} else if (local750 > 127) {
								local750 = 127;
							}
							this.aShortArray111[local54] = (short) (local1290 << 10 | local290 << 7 | local750);
						}
						if (local162.length > 0 && this.aClass118_14 != null) {
							this.aClass118_14.anInterface9_4 = null;
						}
					}
				}
				if (this.aClass245Array1 != null) {
					for (local32 = 0; local32 < this.anInt7617; local32++) {
						local1191 = this.aClass245Array1[local32];
						local1196 = this.aClass267Array1[local32];
						local1196.anInt7749 = Static323.anIntArray198[this.aShortArray111[local1191.anInt7080] & 0xFFFF] & 0xFFFFFF | local1196.anInt7749 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method6103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > arg1 && arg2 > arg1 && arg3 > arg1) {
			return false;
		} else if (arg1 > arg4 && arg2 < arg1 && arg1 > arg3) {
			return false;
		} else if (arg5 > arg7 && arg6 > arg7 && arg7 < arg0) {
			return false;
		} else {
			return arg5 >= arg7 || arg7 <= arg6 || arg0 >= arg7;
		}
	}

	@OriginalMember(owner = "client!vs", name = "ha", descriptor = "()V")
	@Override
	protected void ha() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7595; local7++) {
			this.anIntArray611[local7] = this.anIntArray611[local7] + 7 >> 4;
			this.anIntArray612[local7] = this.anIntArray612[local7] + 7 >> 4;
			this.anIntArray609[local7] = this.anIntArray609[local7] + 7 >> 4;
		}
		this.aBoolean561 = false;
		if (this.aClass118_15 != null) {
			this.aClass118_15.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!vs", name = "LA", descriptor = "(Lclient!ia;)Lclient!ia;")
	@Override
	public Class4_Sub1_Sub6 LA(@OriginalArg(0) Class4_Sub1_Sub6 arg0) {
		if (this.anInt7645 == 0) {
			return null;
		}
		if (!this.aBoolean561) {
			this.method6099();
		}
		@Pc(39) int local39;
		@Pc(56) int local56;
		if (this.aClass30_Sub1_43.anInt861 > 0) {
			local39 = this.aShort101 - (this.aShort97 * this.aClass30_Sub1_43.anInt861 >> 8) >> this.aClass30_Sub1_43.anInt839;
			local56 = this.aShort103 - (this.aClass30_Sub1_43.anInt861 * this.aShort104 >> 8) >> this.aClass30_Sub1_43.anInt839;
		} else {
			local39 = this.aShort101 - (this.aClass30_Sub1_43.anInt861 * this.aShort104 >> 8) >> this.aClass30_Sub1_43.anInt839;
			local56 = this.aShort103 - (this.aClass30_Sub1_43.anInt861 * this.aShort97 >> 8) >> this.aClass30_Sub1_43.anInt839;
		}
		@Pc(115) int local115;
		@Pc(131) int local131;
		if (this.aClass30_Sub1_43.anInt879 <= 0) {
			local115 = this.aShort98 - (this.aShort104 * this.aClass30_Sub1_43.anInt879 >> 8) >> this.aClass30_Sub1_43.anInt839;
			local131 = this.aShort96 - (this.aClass30_Sub1_43.anInt879 * this.aShort97 >> 8) >> this.aClass30_Sub1_43.anInt839;
		} else {
			local115 = this.aShort98 - (this.aClass30_Sub1_43.anInt879 * this.aShort97 >> 8) >> this.aClass30_Sub1_43.anInt839;
			local131 = this.aShort96 - (this.aClass30_Sub1_43.anInt879 * this.aShort104 >> 8) >> this.aClass30_Sub1_43.anInt839;
		}
		@Pc(173) int local173 = local56 + 1 - local39;
		@Pc(180) int local180 = local131 + 1 - local115;
		@Pc(183) Class4_Sub1_Sub6_Sub1 local183 = (Class4_Sub1_Sub6_Sub1) arg0;
		@Pc(199) Class4_Sub1_Sub6_Sub1 local199;
		if (local183 != null && local183.method1548(local173, local180)) {
			local199 = local183;
			local183.method1549();
		} else {
			local199 = new Class4_Sub1_Sub6_Sub1(this.aClass30_Sub1_43, local173, local180);
		}
		local199.method1552(local39, local115, local56, local131);
		this.method6095(local199);
		return local199;
	}

	@OriginalMember(owner = "client!vs", name = "D", descriptor = "()I")
	@Override
	public int D() {
		return this.aShort102;
	}
}
