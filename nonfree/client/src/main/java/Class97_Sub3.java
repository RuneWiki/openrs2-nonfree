import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class97_Sub3 extends Class97 {

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "[J")
	public static final long[] aLongArray15 = new long[256];

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
	private int anInt7623;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "B")
	private byte aByte87;

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "[S")
	private short[] aShortArray129;

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "[S")
	private short[] aShortArray130;

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!sb", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray103;

	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "[I")
	private int[] anIntArray717;

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "[I")
	private int[] anIntArray718;

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "[S")
	private short[] aShortArray131;

	@OriginalMember(owner = "client!sb", name = "cb", descriptor = "[I")
	private int[] anIntArray719;

	@OriginalMember(owner = "client!sb", name = "eb", descriptor = "[Lclient!st;")
	private Class274[] aClass274Array1;

	@OriginalMember(owner = "client!sb", name = "fb", descriptor = "[I")
	private int[] anIntArray720;

	@OriginalMember(owner = "client!sb", name = "kb", descriptor = "[B")
	private byte[] aByteArray101;

	@OriginalMember(owner = "client!sb", name = "nb", descriptor = "[S")
	private short[] aShortArray132;

	@OriginalMember(owner = "client!sb", name = "qb", descriptor = "I")
	private int anInt7653;

	@OriginalMember(owner = "client!sb", name = "sb", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!sb", name = "ub", descriptor = "[S")
	private short[] aShortArray133;

	@OriginalMember(owner = "client!sb", name = "xb", descriptor = "[S")
	private short[] aShortArray134;

	@OriginalMember(owner = "client!sb", name = "Bb", descriptor = "S")
	private short aShort105;

	@OriginalMember(owner = "client!sb", name = "Db", descriptor = "S")
	private short aShort106;

	@OriginalMember(owner = "client!sb", name = "Eb", descriptor = "[S")
	private short[] aShortArray135;

	@OriginalMember(owner = "client!sb", name = "Fb", descriptor = "[F")
	private float[] aFloatArray64;

	@OriginalMember(owner = "client!sb", name = "Mb", descriptor = "S")
	private short aShort107;

	@OriginalMember(owner = "client!sb", name = "Nb", descriptor = "Lclient!qo;")
	private Interface15 anInterface15_7;

	@OriginalMember(owner = "client!sb", name = "Pb", descriptor = "[[I")
	private int[][] anIntArrayArray104;

	@OriginalMember(owner = "client!sb", name = "Sb", descriptor = "[S")
	private short[] aShortArray136;

	@OriginalMember(owner = "client!sb", name = "Tb", descriptor = "[F")
	private float[] aFloatArray65;

	@OriginalMember(owner = "client!sb", name = "Ub", descriptor = "[S")
	private short[] aShortArray137;

	@OriginalMember(owner = "client!sb", name = "Vb", descriptor = "[B")
	private byte[] aByteArray102;

	@OriginalMember(owner = "client!sb", name = "Wb", descriptor = "S")
	private short aShort108;

	@OriginalMember(owner = "client!sb", name = "cc", descriptor = "S")
	private short aShort109;

	@OriginalMember(owner = "client!sb", name = "dc", descriptor = "S")
	private short aShort110;

	@OriginalMember(owner = "client!sb", name = "gc", descriptor = "S")
	private short aShort111;

	@OriginalMember(owner = "client!sb", name = "ic", descriptor = "[[I")
	private int[][] anIntArrayArray105;

	@OriginalMember(owner = "client!sb", name = "mc", descriptor = "Lclient!wj;")
	private Interface20 anInterface20_4;

	@OriginalMember(owner = "client!sb", name = "nc", descriptor = "I")
	private int anInt7677;

	@OriginalMember(owner = "client!sb", name = "pc", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!sb", name = "qc", descriptor = "[I")
	private int[] anIntArray721;

	@OriginalMember(owner = "client!sb", name = "rc", descriptor = "Lclient!ks;")
	private Class170 aClass170_1;

	@OriginalMember(owner = "client!sb", name = "vc", descriptor = "[Lclient!dl;")
	private Class68[] aClass68Array7;

	@OriginalMember(owner = "client!sb", name = "wc", descriptor = "[Lclient!mj;")
	private Class186[] aClass186Array1;

	@OriginalMember(owner = "client!sb", name = "yc", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!sb", name = "zc", descriptor = "[Lclient!fr;")
	private Class106[] aClass106Array7;

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
	private int anInt7637 = 0;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Z")
	private boolean aBoolean569 = false;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
	private int anInt7625 = 0;

	@OriginalMember(owner = "client!sb", name = "Lb", descriptor = "I")
	private int anInt7666 = 0;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
	private int anInt7621 = 0;

	@OriginalMember(owner = "client!sb", name = "sc", descriptor = "I")
	private int anInt7679 = 0;

	@OriginalMember(owner = "client!sb", name = "xc", descriptor = "Z")
	private boolean aBoolean570 = true;

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_38;

	@OriginalMember(owner = "client!sb", name = "Xb", descriptor = "Lclient!ro;")
	private Class258 aClass258_16;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "Lclient!ro;")
	private Class258 aClass258_13;

	@OriginalMember(owner = "client!sb", name = "Rb", descriptor = "Lclient!ro;")
	private Class258 aClass258_15;

	@OriginalMember(owner = "client!sb", name = "Kb", descriptor = "Lclient!ro;")
	private Class258 aClass258_14;

	@OriginalMember(owner = "client!sb", name = "fc", descriptor = "Lclient!sr;")
	private Class272 aClass272_1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray15[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class97_Sub3(@OriginalArg(0) Class4_Sub3 arg0) {
		this.aClass4_Sub3_38 = arg0;
		this.aClass258_16 = new Class258(null, 5126, 3, 0);
		this.aClass258_13 = new Class258(null, 5126, 2, 0);
		this.aClass258_15 = new Class258(null, 5126, 3, 0);
		this.aClass258_14 = new Class258(null, 5121, 4, 0);
		this.aClass272_1 = new Class272();
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!mh;Lclient!ei;IIII)V")
	public Class97_Sub3(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass4_Sub3_38 = arg0;
		this.anInt7623 = arg2;
		this.anInt7677 = arg5;
		if (Static81.method1805(arg5, arg2)) {
			this.aClass258_16 = new Class258(null, 5126, 3, 0);
		}
		if (Static461.method7928(arg2, arg5)) {
			this.aClass258_13 = new Class258(null, 5126, 2, 0);
		}
		if (Static281.method4924(arg5, arg2)) {
			this.aClass258_15 = new Class258(null, 5126, 3, 0);
		}
		if (Static129.method2484(arg5, arg2)) {
			this.aClass258_14 = new Class258(null, 5121, 4, 0);
		}
		if (Static132.method2520(arg2, arg5)) {
			this.aClass272_1 = new Class272();
		}
		@Pc(102) Interface13 local102 = arg0.anInterface13_13;
		@Pc(106) int[] local106 = new int[arg1.anInt2239];
		this.anIntArray719 = new int[arg1.anInt2240 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt2239; local115++) {
			if ((arg1.aByteArray29 == null || arg1.aByteArray29[local115] != 2) && (arg1.aShortArray43 == null || arg1.aShortArray43[local115] == -1 || !local102.method5789(arg1.aShortArray43[local115] & 0xFFFF).aBoolean642)) {
				local106[this.anInt7679++] = local115;
				this.anIntArray719[arg1.aShortArray39[local115]]++;
				this.anIntArray719[arg1.aShortArray45[local115]]++;
				this.anIntArray719[arg1.aShortArray41[local115]]++;
			}
		}
		this.anInt7625 = this.anInt7679;
		@Pc(203) long[] local203 = new long[this.anInt7679];
		@Pc(215) boolean local215 = (this.anInt7623 & 0x100) != 0;
		@Pc(227) int local227;
		@Pc(238) int local238;
		@Pc(373) int local373;
		label493: for (@Pc(217) int local217 = 0; local217 < this.anInt7679; local217++) {
			@Pc(223) int local223 = local106[local217];
			@Pc(225) Class296 local225 = null;
			local227 = 0;
			@Pc(229) byte local229 = 0;
			@Pc(231) byte local231 = 0;
			@Pc(233) byte local233 = 0;
			if (arg1.aClass256Array1 != null) {
				for (local238 = 0; local238 < arg1.aClass256Array1.length; local238++) {
					@Pc(245) Class256 local245 = arg1.aClass256Array1[local238];
					if (local245.anInt7426 == local223) {
						@Pc(254) Class34 local254 = Static461.method7929(local245.anInt7427);
						if (local254.aBoolean100) {
							local203[local217] = Long.MAX_VALUE;
							this.anInt7625--;
							continue label493;
						}
					}
				}
			}
			@Pc(277) short local277 = -1;
			if (arg1.aShortArray43 != null) {
				local277 = arg1.aShortArray43[local223];
				if (local277 != -1) {
					local225 = local102.method5789(local277 & 0xFFFF);
					local231 = local225.aByte104;
					local233 = local225.aByte100;
				}
			}
			@Pc(329) boolean local329 = arg1.aByteArray25 != null && arg1.aByteArray25[local223] != 0 || local225 != null && !local225.aBoolean641 | local225.aBoolean637;
			if ((local215 || local329) && arg1.aByteArray28 != null) {
				local227 += arg1.aByteArray28[local223] << 17;
			}
			if (local329) {
				local227 += 65536;
			}
			local227 += (local231 & 0xFF) << 8;
			local227 += local233 & 0xFF;
			local373 = local229 + ((local277 & 0xFFFF) << 16);
			@Pc(379) int local379 = local373 + (local217 & 0xFFFF);
			local203[local217] = ((long) local227 << 32) + (long) local379;
		}
		Static260.method4697(local203, local106);
		this.aShortArray136 = arg1.aShortArray44;
		this.anIntArray717 = arg1.anIntArray165;
		this.anIntArray721 = arg1.anIntArray170;
		this.anIntArray720 = arg1.anIntArray174;
		this.anInt7666 = arg1.anInt2251;
		this.anInt7637 = arg1.anInt2240;
		this.aClass68Array7 = arg1.aClass68Array1;
		this.aClass106Array7 = arg1.aClass106Array1;
		@Pc(434) Class88[] local434 = new Class88[this.anInt7637];
		@Pc(454) int local454;
		@Pc(468) int local468;
		if (arg1.aClass256Array1 != null) {
			this.anInt7653 = arg1.aClass256Array1.length;
			this.aClass274Array1 = new Class274[this.anInt7653];
			this.aClass186Array1 = new Class186[this.anInt7653];
			for (local454 = 0; local454 < this.anInt7653; local454++) {
				@Pc(461) Class256 local461 = arg1.aClass256Array1[local454];
				@Pc(466) Class34 local466 = Static461.method7929(local461.anInt7427);
				local468 = -1;
				for (@Pc(470) int local470 = 0; local470 < this.anInt7679; local470++) {
					if (local106[local470] == local461.anInt7426) {
						local468 = local470;
						break;
					}
				}
				if (local468 == -1) {
					throw new RuntimeException();
				}
				local238 = Static107.anIntArray176[arg1.aShortArray42[local461.anInt7426] & 0xFFFF] & 0xFFFFFF;
				local238 |= 255 - (arg1.aByteArray25 == null ? 0 : arg1.aByteArray25[local461.anInt7426]) << 24;
				this.aClass186Array1[local454] = new Class186(local468, arg1.aShortArray39[local461.anInt7426], arg1.aShortArray45[local461.anInt7426], arg1.aShortArray41[local461.anInt7426], local466.anInt1150, local466.anInt1151, local466.anInt1153, local466.anInt1154, local466.anInt1157, local466.aBoolean100, local466.aBoolean99, local461.anInt7424);
				this.aClass274Array1[local454] = new Class274(local238);
			}
		}
		local454 = this.anInt7679 * 3;
		this.aByteArray101 = new byte[local454];
		this.aShortArray137 = new short[this.anInt7679];
		this.aShortArray132 = new short[local454];
		this.aShortArray131 = new short[local454];
		this.aShortArray130 = new short[this.anInt7679];
		this.aFloatArray65 = new float[local454];
		this.aShortArray139 = new short[local454];
		this.aShortArray129 = new short[this.anInt7679];
		this.aShort108 = (short) arg4;
		this.aShortArray134 = new short[this.anInt7679];
		this.aByteArray102 = new byte[this.anInt7679];
		this.aShortArray135 = new short[this.anInt7679];
		if (arg1.aShortArray46 != null) {
			this.aShortArray138 = new short[this.anInt7679];
		}
		this.aShortArray133 = new short[local454];
		Static481.aLongArray14 = new long[local454];
		this.aShort111 = (short) arg3;
		this.aFloatArray64 = new float[local454];
		local227 = 0;
		for (local373 = 0; local373 < arg1.anInt2240; local373++) {
			local468 = this.anIntArray719[local373];
			this.anIntArray719[local373] = local227;
			local227 += local468;
			local434[local373] = new Class88();
		}
		this.anIntArray719[arg1.anInt2240] = local227;
		@Pc(709) int[] local709 = null;
		@Pc(711) int[] local711 = null;
		@Pc(713) int[] local713 = null;
		@Pc(715) float[][] local715 = null;
		@Pc(741) int local741;
		@Pc(779) int local779;
		@Pc(785) int local785;
		@Pc(798) int local798;
		@Pc(800) int local800;
		@Pc(836) int local836;
		@Pc(841) int local841;
		@Pc(1004) float local1004;
		@Pc(998) float local998;
		@Pc(1002) float local1002;
		if (arg1.aByteArray27 != null) {
			@Pc(721) int local721 = arg1.anInt2249;
			@Pc(724) int[] local724 = new int[local721];
			@Pc(727) int[] local727 = new int[local721];
			@Pc(730) int[] local730 = new int[local721];
			@Pc(733) int[] local733 = new int[local721];
			@Pc(736) int[] local736 = new int[local721];
			@Pc(739) int[] local739 = new int[local721];
			for (local741 = 0; local741 < local721; local741++) {
				local724[local741] = Integer.MAX_VALUE;
				local727[local741] = -2147483647;
				local730[local741] = Integer.MAX_VALUE;
				local733[local741] = -2147483647;
				local736[local741] = Integer.MAX_VALUE;
				local739[local741] = -2147483647;
			}
			local715 = new float[local721][];
			local713 = new int[local721];
			for (local779 = 0; local779 < this.anInt7679; local779++) {
				local785 = local106[local779];
				if (arg1.aByteArray27[local785] != -1) {
					local798 = arg1.aByteArray27[local785] & 0xFF;
					for (local800 = 0; local800 < 3; local800++) {
						@Pc(817) short local817;
						if (local800 == 0) {
							local817 = arg1.aShortArray39[local785];
						} else if (local800 == 1) {
							local817 = arg1.aShortArray45[local785];
						} else {
							local817 = arg1.aShortArray41[local785];
						}
						local836 = arg1.anIntArray174[local817];
						local841 = arg1.anIntArray165[local817];
						@Pc(846) int local846 = arg1.anIntArray170[local817];
						if (local836 < local724[local798]) {
							local724[local798] = local836;
						}
						if (local727[local798] < local836) {
							local727[local798] = local836;
						}
						if (local730[local798] > local841) {
							local730[local798] = local841;
						}
						if (local841 > local733[local798]) {
							local733[local798] = local841;
						}
						if (local846 < local736[local798]) {
							local736[local798] = local846;
						}
						if (local739[local798] < local846) {
							local739[local798] = local846;
						}
					}
				}
			}
			local709 = new int[local721];
			local711 = new int[local721];
			for (local785 = 0; local785 < local721; local785++) {
				@Pc(940) byte local940 = arg1.aByteArray26[local785];
				if (local940 > 0) {
					local709[local785] = (local724[local785] + local727[local785]) / 2;
					local711[local785] = (local730[local785] + local733[local785]) / 2;
					local713[local785] = (local736[local785] + local739[local785]) / 2;
					if (local940 == 1) {
						local841 = arg1.anIntArray166[local785];
						local998 = 64.0F / (float) arg1.anIntArray168[local785];
						if (local841 == 0) {
							local1002 = 1.0F;
							local1004 = 1.0F;
						} else if (local841 > 0) {
							local1002 = (float) local841 / 1024.0F;
							local1004 = 1.0F;
						} else {
							local1004 = (float) -local841 / 1024.0F;
							local1002 = 1.0F;
						}
					} else if (local940 == 2) {
						local1002 = 64.0F / (float) arg1.anIntArray171[local785];
						local998 = 64.0F / (float) arg1.anIntArray168[local785];
						local1004 = 64.0F / (float) arg1.anIntArray166[local785];
					} else {
						local998 = (float) arg1.anIntArray168[local785] / 1024.0F;
						local1004 = (float) arg1.anIntArray166[local785] / 1024.0F;
						local1002 = (float) arg1.anIntArray171[local785] / 1024.0F;
					}
					local715[local785] = Static13.method511(arg1.aByteArray24[local785] & 0xFF, arg1.aShortArray47[local785], arg1.aShortArray48[local785], arg1.aShortArray40[local785], local1002, local1004, local998);
				}
			}
		}
		@Pc(1117) Class26[] local1117 = new Class26[arg1.anInt2239];
		@Pc(1136) short local1136;
		@Pc(1147) int local1147;
		@Pc(1158) int local1158;
		@Pc(1218) int local1218;
		for (@Pc(1119) int local1119 = 0; local1119 < arg1.anInt2239; local1119++) {
			@Pc(1126) short local1126 = arg1.aShortArray39[local1119];
			@Pc(1131) short local1131 = arg1.aShortArray45[local1119];
			local1136 = arg1.aShortArray41[local1119];
			local1147 = this.anIntArray720[local1131] - this.anIntArray720[local1126];
			local1158 = this.anIntArray717[local1131] - this.anIntArray717[local1126];
			local741 = this.anIntArray721[local1131] - this.anIntArray721[local1126];
			local779 = this.anIntArray720[local1136] - this.anIntArray720[local1126];
			local785 = this.anIntArray717[local1136] - this.anIntArray717[local1126];
			local798 = this.anIntArray721[local1136] - this.anIntArray721[local1126];
			local800 = local1158 * local798 - local741 * local785;
			local1218 = local741 * local779 - local1147 * local798;
			local836 = local1147 * local785 - local779 * local1158;
			while (local800 > 8192 || local1218 > 8192 || local836 > 8192 || local800 < -8192 || local1218 < -8192 || local836 < -8192) {
				local836 >>= 0x1;
				local1218 >>= 0x1;
				local800 >>= 0x1;
			}
			local841 = (int) Math.sqrt((double) (local836 * local836 + local1218 * local1218 + local800 * local800));
			if (local841 <= 0) {
				local841 = 1;
			}
			local836 = local836 * 256 / local841;
			local1218 = local1218 * 256 / local841;
			local800 = local800 * 256 / local841;
			@Pc(1313) byte local1313 = arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local1119];
			if (local1313 == 0) {
				@Pc(1341) Class88 local1341 = local434[local1126];
				local1341.anInt2328++;
				local1341.anInt2326 += local1218;
				local1341.anInt2329 += local800;
				local1341.anInt2327 += local836;
				@Pc(1369) Class88 local1369 = local434[local1131];
				local1369.anInt2327 += local836;
				local1369.anInt2329 += local800;
				local1369.anInt2328++;
				local1369.anInt2326 += local1218;
				@Pc(1397) Class88 local1397 = local434[local1136];
				local1397.anInt2327 += local836;
				local1397.anInt2328++;
				local1397.anInt2326 += local1218;
				local1397.anInt2329 += local800;
			} else if (local1313 == 1) {
				@Pc(1326) Class26 local1326 = local1117[local1119] = new Class26();
				local1326.anInt785 = local1218;
				local1326.anInt787 = local836;
				local1326.anInt790 = local800;
			}
		}
		@Pc(1434) int local1434;
		for (@Pc(1428) int local1428 = 0; local1428 < this.anInt7679; local1428++) {
			local1434 = local106[local1428];
			@Pc(1441) int local1441 = arg1.aShortArray42[local1434] & 0xFFFF;
			@Pc(1446) short local1446;
			if (arg1.aShortArray43 == null) {
				local1446 = -1;
			} else {
				local1446 = arg1.aShortArray43[local1434];
			}
			if (arg1.aByteArray27 == null) {
				local1158 = -1;
			} else {
				local1158 = arg1.aByteArray27[local1434];
			}
			if (arg1.aByteArray25 == null) {
				local741 = 0;
			} else {
				local741 = arg1.aByteArray25[local1434] & 0xFF;
			}
			@Pc(1481) float local1481 = 0.0F;
			@Pc(1483) float local1483 = 0.0F;
			@Pc(1485) float local1485 = 0.0F;
			local1004 = 0.0F;
			local998 = 0.0F;
			local1002 = 0.0F;
			@Pc(1493) byte local1493 = 0;
			@Pc(1495) byte local1495 = 0;
			@Pc(1497) int local1497 = 0;
			@Pc(1512) byte local1512;
			@Pc(1529) short local1529;
			@Pc(2275) short local2275;
			@Pc(2280) short local2280;
			if (local1446 != -1) {
				if (local1158 == -1) {
					local1495 = 2;
					local1481 = 0.0F;
					local998 = 0.0F;
					local1493 = 1;
					local1004 = 1.0F;
					local1483 = 1.0F;
					local1002 = 0.0F;
					local1485 = 1.0F;
				} else {
					local1158 &= 0xFF;
					local1512 = arg1.aByteArray26[local1158];
					@Pc(1519) short local1519;
					@Pc(1524) short local1524;
					@Pc(1558) float local1558;
					@Pc(1772) float local1772;
					@Pc(1780) float local1780;
					@Pc(1879) float local1879;
					@Pc(1887) float local1887;
					@Pc(1895) float local1895;
					@Pc(1918) float local1918;
					@Pc(1941) float local1941;
					@Pc(1964) float local1964;
					if (local1512 == 0) {
						local1519 = arg1.aShortArray39[local1434];
						local1524 = arg1.aShortArray45[local1434];
						local1529 = arg1.aShortArray41[local1434];
						local2275 = arg1.aShortArray48[local1158];
						local2280 = arg1.aShortArray40[local1158];
						@Pc(2285) short local2285 = arg1.aShortArray47[local1158];
						@Pc(2291) float local2291 = (float) arg1.anIntArray174[local2275];
						@Pc(2297) float local2297 = (float) arg1.anIntArray165[local2275];
						local1558 = arg1.anIntArray170[local2275];
						local1772 = (float) arg1.anIntArray174[local2280] - local2291;
						local1780 = (float) arg1.anIntArray165[local2280] - local2297;
						@Pc(2329) float local2329 = (float) arg1.anIntArray170[local2280] - local1558;
						@Pc(2338) float local2338 = (float) arg1.anIntArray174[local2285] - local2291;
						@Pc(2346) float local2346 = (float) arg1.anIntArray165[local2285] - local2297;
						@Pc(2354) float local2354 = (float) arg1.anIntArray170[local2285] - local1558;
						@Pc(2362) float local2362 = (float) arg1.anIntArray174[local1519] - local2291;
						@Pc(2371) float local2371 = (float) arg1.anIntArray165[local1519] - local2297;
						@Pc(2380) float local2380 = (float) arg1.anIntArray170[local1519] - local1558;
						@Pc(2389) float local2389 = (float) arg1.anIntArray174[local1524] - local2291;
						@Pc(2398) float local2398 = (float) arg1.anIntArray165[local1524] - local2297;
						local1879 = (float) arg1.anIntArray170[local1524] - local1558;
						local1887 = (float) arg1.anIntArray174[local1529] - local2291;
						local1895 = (float) arg1.anIntArray165[local1529] - local2297;
						local1918 = (float) arg1.anIntArray170[local1529] - local1558;
						local1941 = local2354 * local1780 - local2329 * local2346;
						local1964 = local2329 * local2338 - local2354 * local1772;
						@Pc(2458) float local2458 = local1772 * local2346 - local1780 * local2338;
						@Pc(2467) float local2467 = local2346 * local2458 - local2354 * local1964;
						@Pc(2476) float local2476 = local2354 * local1941 - local2338 * local2458;
						@Pc(2484) float local2484 = local1964 * local2338 - local2346 * local1941;
						@Pc(2498) float local2498 = 1.0F / (local2476 * local1780 + local2467 * local1772 + local2329 * local2484);
						local998 = (local2467 * local1887 + local1895 * local2476 + local1918 * local2484) * local2498;
						local1481 = local2498 * (local2484 * local2380 + local2371 * local2476 + local2467 * local2362);
						local1485 = local2498 * (local1879 * local2484 + local2398 * local2476 + local2389 * local2467);
						@Pc(2549) float local2549 = local1772 * local1964 - local1941 * local1780;
						@Pc(2558) float local2558 = local2458 * local1780 - local2329 * local1964;
						@Pc(2566) float local2566 = local2329 * local1941 - local1772 * local2458;
						@Pc(2580) float local2580 = 1.0F / (local2346 * local2566 + local2338 * local2558 + local2549 * local2354);
						local1483 = (local2380 * local2549 + local2566 * local2371 + local2362 * local2558) * local2580;
						local1002 = (local2566 * local1895 + local1887 * local2558 + local1918 * local2549) * local2580;
						local1004 = (local1879 * local2549 + local2566 * local2398 + local2389 * local2558) * local2580;
					} else {
						local1519 = arg1.aShortArray39[local1434];
						local1524 = arg1.aShortArray45[local1434];
						local1529 = arg1.aShortArray41[local1434];
						@Pc(1533) int local1533 = local709[local1158];
						@Pc(1537) int local1537 = local711[local1158];
						@Pc(1541) int local1541 = local713[local1158];
						@Pc(1545) float[] local1545 = local715[local1158];
						@Pc(1550) byte local1550 = arg1.aByteArray30[local1158];
						local1558 = (float) arg1.anIntArray169[local1158] / 256.0F;
						if (local1512 == 1) {
							local1772 = (float) arg1.anIntArray171[local1158] / 1024.0F;
							Static71.method1698(local1772, arg1.anIntArray165[local1519], local1558, arg1.anIntArray174[local1519], local1533, arg1.anIntArray170[local1519], local1545, local1550, local1537, local1541);
							local1481 = Static183.aFloat80;
							local1483 = Static403.aFloat144;
							Static71.method1698(local1772, arg1.anIntArray165[local1524], local1558, arg1.anIntArray174[local1524], local1533, arg1.anIntArray170[local1524], local1545, local1550, local1537, local1541);
							local1485 = Static183.aFloat80;
							local1004 = Static403.aFloat144;
							Static71.method1698(local1772, arg1.anIntArray165[local1529], local1558, arg1.anIntArray174[local1529], local1533, arg1.anIntArray170[local1529], local1545, local1550, local1537, local1541);
							local998 = Static183.aFloat80;
							local1002 = Static403.aFloat144;
							local1780 = local1772 / 2.0F;
							if ((local1550 & 0x1) == 0) {
								if (local1780 < local998 - local1481) {
									local998 -= local1772;
									local1495 = 1;
								} else if (local1481 - local998 > local1780) {
									local1495 = 2;
									local998 += local1772;
								}
								if (local1780 < local1485 - local1481) {
									local1485 -= local1772;
									local1493 = 1;
								} else if (local1780 < local1481 - local1485) {
									local1493 = 2;
									local1485 += local1772;
								}
							} else {
								if (local1002 - local1483 > local1780) {
									local1495 = 1;
									local1002 -= local1772;
								} else if (local1780 < local1483 - local1002) {
									local1002 += local1772;
									local1495 = 2;
								}
								if (local1004 - local1483 > local1780) {
									local1004 -= local1772;
									local1493 = 1;
								} else if (local1780 < local1483 - local1004) {
									local1004 += local1772;
									local1493 = 2;
								}
							}
						} else if (local1512 == 2) {
							local1772 = (float) arg1.anIntArray175[local1158] / 256.0F;
							local1780 = (float) arg1.anIntArray167[local1158] / 256.0F;
							@Pc(1791) int local1791 = arg1.anIntArray174[local1524] - arg1.anIntArray174[local1519];
							@Pc(1802) int local1802 = arg1.anIntArray165[local1524] - arg1.anIntArray165[local1519];
							@Pc(1813) int local1813 = arg1.anIntArray170[local1524] - arg1.anIntArray170[local1519];
							@Pc(1824) int local1824 = arg1.anIntArray174[local1529] - arg1.anIntArray174[local1519];
							@Pc(1835) int local1835 = arg1.anIntArray165[local1529] - arg1.anIntArray165[local1519];
							@Pc(1845) int local1845 = arg1.anIntArray170[local1529] - arg1.anIntArray170[local1519];
							@Pc(1854) int local1854 = local1802 * local1845 - local1835 * local1813;
							@Pc(1862) int local1862 = local1813 * local1824 - local1845 * local1791;
							@Pc(1871) int local1871 = local1835 * local1791 - local1802 * local1824;
							local1879 = 64.0F / (float) arg1.anIntArray166[local1158];
							local1887 = 64.0F / (float) arg1.anIntArray168[local1158];
							local1895 = 64.0F / (float) arg1.anIntArray171[local1158];
							local1918 = ((float) local1862 * local1545[1] + local1545[0] * (float) local1854 + (float) local1871 * local1545[2]) / local1879;
							local1941 = (local1545[4] * (float) local1862 + local1545[3] * (float) local1854 + (float) local1871 * local1545[5]) / local1887;
							local1964 = (local1545[6] * (float) local1854 + local1545[7] * (float) local1862 + local1545[8] * (float) local1871) / local1895;
							local1497 = Static544.method6946(local1964, local1918, local1941);
							Static505.method5585(arg1.anIntArray165[local1519], local1772, local1780, local1545, local1533, arg1.anIntArray174[local1519], local1550, local1537, local1497, arg1.anIntArray170[local1519], local1558, local1541);
							local1481 = Static220.aFloat86;
							local1483 = Static494.aFloat185;
							Static505.method5585(arg1.anIntArray165[local1524], local1772, local1780, local1545, local1533, arg1.anIntArray174[local1524], local1550, local1537, local1497, arg1.anIntArray170[local1524], local1558, local1541);
							local1485 = Static220.aFloat86;
							local1004 = Static494.aFloat185;
							Static505.method5585(arg1.anIntArray165[local1529], local1772, local1780, local1545, local1533, arg1.anIntArray174[local1529], local1550, local1537, local1497, arg1.anIntArray170[local1529], local1558, local1541);
							local1002 = Static494.aFloat185;
							local998 = Static220.aFloat86;
						} else if (local1512 == 3) {
							Static495.method7594(local1550, local1541, local1533, local1558, arg1.anIntArray170[local1519], arg1.anIntArray174[local1519], local1545, local1537, arg1.anIntArray165[local1519]);
							local1481 = Static440.aFloat148;
							local1483 = Static425.aFloat147;
							Static495.method7594(local1550, local1541, local1533, local1558, arg1.anIntArray170[local1524], arg1.anIntArray174[local1524], local1545, local1537, arg1.anIntArray165[local1524]);
							local1004 = Static425.aFloat147;
							local1485 = Static440.aFloat148;
							Static495.method7594(local1550, local1541, local1533, local1558, arg1.anIntArray170[local1529], arg1.anIntArray174[local1529], local1545, local1537, arg1.anIntArray165[local1529]);
							local1002 = Static425.aFloat147;
							local998 = Static440.aFloat148;
							if ((local1550 & 0x1) == 0) {
								if (local1485 - local1481 > 0.5F) {
									local1485--;
									local1493 = 1;
								} else if (local1481 - local1485 > 0.5F) {
									local1485++;
									local1493 = 2;
								}
								if (local998 - local1481 > 0.5F) {
									local1495 = 1;
									local998--;
								} else if (local1481 - local998 > 0.5F) {
									local1495 = 2;
									local998++;
								}
							} else {
								if (local1004 - local1483 > 0.5F) {
									local1493 = 1;
									local1004--;
								} else if (local1483 - local1004 > 0.5F) {
									local1493 = 2;
									local1004++;
								}
								if (local1002 - local1483 > 0.5F) {
									local1495 = 1;
									local1002--;
								} else if (local1483 - local1002 > 0.5F) {
									local1002++;
									local1495 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray29 == null) {
				local1512 = 0;
			} else {
				local1512 = arg1.aByteArray29[local1434];
			}
			if (local1512 == 0) {
				@Pc(2803) long local2803 = (long) (local1158 << 2) + ((long) (local1441 << 8) + (long) (local1497 << 24) + (long) local741 << 32);
				local1529 = arg1.aShortArray39[local1434];
				local2275 = arg1.aShortArray45[local1434];
				local2280 = arg1.aShortArray41[local1434];
				@Pc(2822) Class88 local2822 = local434[local1529];
				this.aShortArray134[local1428] = this.method6801(local2822.anInt2328, local1529, local2822.anInt2326, local2822.anInt2327, local1483, arg1, local1481, local2803, local2822.anInt2329);
				@Pc(2846) Class88 local2846 = local434[local2275];
				this.aShortArray135[local1428] = this.method6801(local2846.anInt2328, local2275, local2846.anInt2326, local2846.anInt2327, local1004, arg1, local1485, (long) local1493 + local2803, local2846.anInt2329);
				@Pc(2873) Class88 local2873 = local434[local2280];
				this.aShortArray130[local1428] = this.method6801(local2873.anInt2328, local2280, local2873.anInt2326, local2873.anInt2327, local1002, arg1, local998, (long) local1495 + local2803, local2873.anInt2329);
			} else if (local1512 == 1) {
				@Pc(2661) Class26 local2661 = local1117[local1434];
				@Pc(2708) long local2708 = ((long) (local1497 << 24) + (long) (local1441 << 8) + (long) local741 << 32) + (long) ((local2661.anInt787 + 256 << 22) + ((local1158 << 2) + (local2661.anInt790 <= 0 ? 2048 : 1024) + (local2661.anInt785 + 256 << 12)));
				this.aShortArray134[local1428] = this.method6801(0, arg1.aShortArray39[local1434], local2661.anInt785, local2661.anInt787, local1483, arg1, local1481, local2708, local2661.anInt790);
				this.aShortArray135[local1428] = this.method6801(0, arg1.aShortArray45[local1434], local2661.anInt785, local2661.anInt787, local1004, arg1, local1485, (long) local1493 + local2708, local2661.anInt790);
				this.aShortArray130[local1428] = this.method6801(0, arg1.aShortArray41[local1434], local2661.anInt785, local2661.anInt787, local1002, arg1, local998, (long) local1495 + local2708, local2661.anInt790);
			}
			if (arg1.aShortArray43 == null) {
				this.aShortArray129[local1428] = -1;
			} else {
				this.aShortArray129[local1428] = arg1.aShortArray43[local1434];
			}
			if (arg1.aByteArray25 != null) {
				this.aByteArray102[local1428] = arg1.aByteArray25[local1434];
			}
			if (arg1.aShortArray46 != null) {
				this.aShortArray138[local1428] = arg1.aShortArray46[local1434];
			}
			this.aShortArray137[local1428] = arg1.aShortArray42[local1434];
		}
		local1434 = 0;
		local1136 = -10000;
		for (local1147 = 0; local1147 < this.anInt7625; local1147++) {
			@Pc(2966) short local2966 = this.aShortArray129[local1147];
			if (local2966 != local1136) {
				local1434++;
				local1136 = local2966;
			}
		}
		this.anIntArray718 = new int[local1434 + 1];
		local1136 = -10000;
		local1434 = 0;
		for (local1158 = 0; local1158 < this.anInt7625; local1158++) {
			@Pc(3004) short local3004 = this.aShortArray129[local1158];
			if (local1136 != local3004) {
				this.anIntArray718[local1434++] = local1158;
				local1136 = local3004;
			}
		}
		this.anIntArray718[local1434] = this.anInt7625;
		Static481.aLongArray14 = null;
		this.aShortArray133 = Static77.method1768(this.aShortArray133, this.anInt7621);
		this.aShortArray131 = Static77.method1768(this.aShortArray131, this.anInt7621);
		this.aShortArray132 = Static77.method1768(this.aShortArray132, this.anInt7621);
		this.aByteArray101 = Static437.method4250(this.aByteArray101, this.anInt7621);
		this.aFloatArray65 = Static354.method5821(this.aFloatArray65, this.anInt7621);
		this.aFloatArray64 = Static354.method5821(this.aFloatArray64, this.anInt7621);
		if (arg1.anIntArray172 != null && Static543.method8257(arg2, this.anInt7677)) {
			this.anIntArrayArray105 = arg1.method2159(false);
		}
		if (arg1.aClass256Array1 != null && Static262.method4707(this.anInt7677, arg2)) {
			this.anIntArrayArray104 = arg1.method2166();
		}
		if (arg1.anIntArray173 != null && Static301.method5329(arg2, this.anInt7677)) {
			local741 = 0;
			@Pc(3127) int[] local3127 = new int[256];
			for (local785 = 0; local785 < this.anInt7679; local785++) {
				local798 = arg1.anIntArray173[local106[local785]];
				if (local798 >= 0) {
					@Pc(3147) int local3147 = local3127[local798]++;
					if (local741 < local798) {
						local741 = local798;
					}
				}
			}
			this.anIntArrayArray103 = new int[local741 + 1][];
			for (local798 = 0; local798 <= local741; local798++) {
				this.anIntArrayArray103[local798] = new int[local3127[local798]];
				local3127[local798] = 0;
			}
			for (local800 = 0; local800 < this.anInt7679; local800++) {
				local1218 = arg1.anIntArray173[local106[local800]];
				if (local1218 >= 0) {
					this.anIntArrayArray103[local1218][local3127[local1218]++] = local800;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		if (this.aClass258_14 != null) {
			this.aClass258_14.anInterface15_6 = null;
		}
		this.aShort111 = (short) arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method6785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class128_Sub2 local8 = (Class128_Sub2) arg2;
		@Pc(12) Class128_Sub2 local12 = this.aClass4_Sub3_38.aClass128_Sub2_3;
		@Pc(33) float local33 = local12.aFloat93 + local8.aFloat94 * local12.aFloat98 + local8.aFloat93 * local12.aFloat100 + local8.aFloat96 * local12.aFloat95;
		@Pc(54) float local54 = local12.aFloat94 + local12.aFloat89 * local8.aFloat93 + local12.aFloat90 * local8.aFloat94 + local8.aFloat96 * local12.aFloat97;
		Static350.aFloat137 = local12.aFloat97 * local8.aFloat92 + local8.aFloat100 * local12.aFloat89 + local12.aFloat90 * local8.aFloat89;
		Static26.aFloat8 = local8.aFloat90 * local12.aFloat90 + local12.aFloat89 * local8.aFloat98 + local8.aFloat91 * local12.aFloat97;
		Static179.aFloat79 = local12.aFloat99 * local8.aFloat92 + local8.aFloat100 * local12.aFloat92 + local8.aFloat89 * local12.aFloat91;
		Static378.aFloat142 = local8.aFloat99 * local12.aFloat99 + local12.aFloat91 * local8.aFloat97 + local8.aFloat95 * local12.aFloat92;
		Static313.aFloat132 = local12.aFloat95 * local8.aFloat91 + local8.aFloat90 * local12.aFloat98 + local12.aFloat100 * local8.aFloat98;
		Static39.aFloat28 = local8.aFloat95 * local12.aFloat89 + local8.aFloat97 * local12.aFloat90 + local12.aFloat97 * local8.aFloat99;
		Static301.aFloat131 = local8.aFloat90 * local12.aFloat91 + local12.aFloat92 * local8.aFloat98 + local8.aFloat91 * local12.aFloat99;
		Static57.aFloat33 = local8.aFloat99 * local12.aFloat95 + local8.aFloat95 * local12.aFloat100 + local8.aFloat97 * local12.aFloat98;
		@Pc(219) float local219 = local12.aFloat96 + local12.aFloat92 * local8.aFloat93 + local12.aFloat91 * local8.aFloat94 + local12.aFloat99 * local8.aFloat96;
		Static128.aFloat106 = local8.aFloat89 * local12.aFloat98 + local8.aFloat100 * local12.aFloat100 + local12.aFloat95 * local8.aFloat92;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass4_Sub3_38.anInt5834;
		@Pc(255) int local255 = this.aClass4_Sub3_38.anInt5805;
		if (!this.aBoolean569) {
			this.method6787();
		}
		Static262.anIntArray420[0] = this.aShort103;
		Static386.anIntArray741[0] = this.aShort109;
		Static135.anIntArray834[0] = this.aShort105;
		Static262.anIntArray420[1] = this.aShort106;
		Static386.anIntArray741[1] = this.aShort109;
		Static135.anIntArray834[1] = this.aShort105;
		Static262.anIntArray420[2] = this.aShort103;
		Static386.anIntArray741[2] = this.aShort107;
		Static135.anIntArray834[2] = this.aShort105;
		Static262.anIntArray420[3] = this.aShort106;
		Static386.anIntArray741[3] = this.aShort107;
		Static135.anIntArray834[3] = this.aShort105;
		Static262.anIntArray420[4] = this.aShort103;
		Static386.anIntArray741[4] = this.aShort109;
		Static135.anIntArray834[4] = this.aShort110;
		Static262.anIntArray420[5] = this.aShort106;
		Static386.anIntArray741[5] = this.aShort109;
		Static135.anIntArray834[5] = this.aShort110;
		Static262.anIntArray420[6] = this.aShort103;
		Static386.anIntArray741[6] = this.aShort107;
		Static262.anIntArray420[7] = this.aShort106;
		Static135.anIntArray834[6] = this.aShort110;
		Static386.anIntArray741[7] = this.aShort107;
		Static135.anIntArray834[7] = this.aShort110;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(442) float local442;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static262.anIntArray420[local383];
			local395 = Static135.anIntArray834[local383];
			local400 = Static386.anIntArray741[local383];
			local414 = local54 + Static350.aFloat137 * local390 + local400 * Static26.aFloat8 + local395 * Static39.aFloat28;
			local428 = local33 + Static57.aFloat33 * local395 + local400 * Static313.aFloat132 + local390 * Static128.aFloat106;
			local442 = local219 + Static301.aFloat131 * local400 + Static179.aFloat79 * local390 + Static378.aFloat142 * local395;
			if (local442 >= (float) this.aClass4_Sub3_38.anInt5823) {
				@Pc(461) float local461 = (float) local251 * local428 / local442 + (float) this.aClass4_Sub3_38.anInt5822;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local461 < local241) {
					local241 = local461;
				}
				@Pc(485) float local485 = local414 * (float) local255 / local442 + (float) this.aClass4_Sub3_38.anInt5811;
				if (local485 > local247) {
					local247 = local485;
				}
				if (local485 < local245) {
					local245 = local485;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.aClass4_Sub3_38.anIntArray454.length < this.anInt7621) {
				this.aClass4_Sub3_38.anIntArray452 = new int[this.anInt7621];
				this.aClass4_Sub3_38.anIntArray454 = new int[this.anInt7621];
			}
			@Pc(552) int[] local552 = this.aClass4_Sub3_38.anIntArray454;
			@Pc(556) int[] local556 = this.aClass4_Sub3_38.anIntArray452;
			@Pc(640) int local640;
			for (@Pc(558) int local558 = 0; local558 < this.anInt7637; local558++) {
				local395 = this.anIntArray721[local558];
				local400 = this.anIntArray717[local558];
				local390 = this.anIntArray720[local558];
				local442 = local219 + local395 * Static378.aFloat142 + local400 * Static301.aFloat131 + local390 * Static179.aFloat79;
				local414 = local395 * Static39.aFloat28 + local390 * Static350.aFloat137 + local400 * Static26.aFloat8 + local54;
				local428 = local395 * Static57.aFloat33 + local400 * Static313.aFloat132 + local390 * Static128.aFloat106 + local33;
				@Pc(653) int local653;
				@Pc(658) int local658;
				@Pc(665) int local665;
				if ((float) this.aClass4_Sub3_38.anInt5823 <= local442) {
					local640 = (int) ((float) this.aClass4_Sub3_38.anInt5822 + (float) local251 * local428 / local442);
					local653 = (int) ((float) local255 * local414 / local442 + (float) this.aClass4_Sub3_38.anInt5811);
					local658 = this.anIntArray719[local558];
					local665 = this.anIntArray719[local558 + 1];
					for (@Pc(667) int local667 = local658; local667 < local665; local667++) {
						@Pc(676) int local676 = this.aShortArray139[local667] - 1;
						if (local676 == -1) {
							break;
						}
						local552[local676] = local640;
						local556[local676] = local653;
					}
				} else {
					local640 = this.anIntArray719[local558];
					local653 = this.anIntArray719[local558 + 1];
					for (local658 = local640; local658 < local653; local658++) {
						local665 = this.aShortArray139[local658] - 1;
						if (local665 == -1) {
							break;
						}
						local552[this.aShortArray139[local658] - 1] = -999999;
					}
				}
			}
			for (local640 = 0; local640 < this.anInt7679; local640++) {
				if (local552[this.aShortArray134[local640]] != -999999 && local552[this.aShortArray135[local640]] != -999999 && local552[this.aShortArray130[local640]] != -999999 && this.method6791(local556[this.aShortArray134[local640]], arg1, local556[this.aShortArray130[local640]], local552[this.aShortArray130[local640]], local552[this.aShortArray135[local640]], arg0, local552[this.aShortArray134[local640]], local556[this.aShortArray135[local640]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sb", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		if (!this.aBoolean569) {
			this.method6787();
		}
		return this.aShort109;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	private void method6786() {
		if (!this.aBoolean570) {
			return;
		}
		this.aBoolean570 = false;
		if (this.aClass68Array7 == null && this.aClass106Array7 == null && this.aClass186Array1 == null) {
			if (this.anIntArray720 != null && !Static463.method7059(this.anInt7623, this.anInt7677)) {
				if (this.aClass258_16 != null && this.aClass258_16.anInterface15_6 == null) {
					this.aBoolean570 = true;
				} else {
					if (!this.aBoolean569) {
						this.method6787();
					}
					this.anIntArray720 = null;
				}
			}
			if (this.anIntArray717 != null && !Static540.method8221(this.anInt7623, this.anInt7677)) {
				if (this.aClass258_16 != null && this.aClass258_16.anInterface15_6 == null) {
					this.aBoolean570 = true;
				} else {
					if (!this.aBoolean569) {
						this.method6787();
					}
					this.anIntArray717 = null;
				}
			}
			if (this.anIntArray721 != null && !Static443.method6864(this.anInt7623, this.anInt7677)) {
				if (this.aClass258_16 != null && this.aClass258_16.anInterface15_6 == null) {
					this.aBoolean570 = true;
				} else {
					if (!this.aBoolean569) {
						this.method6787();
					}
					this.anIntArray721 = null;
				}
			}
		}
		if (this.aShortArray139 != null && this.anIntArray720 == null && this.anIntArray717 == null && this.anIntArray721 == null) {
			this.aShortArray139 = null;
			this.anIntArray719 = null;
		}
		if (this.aByteArray101 != null && !Static526.method8053(this.anInt7623, this.anInt7677)) {
			if (this.aClass258_15 == null) {
				if (this.aClass258_14 != null && this.aClass258_14.anInterface15_6 == null) {
					this.aBoolean570 = true;
				} else {
					this.aShortArray133 = this.aShortArray131 = this.aShortArray132 = null;
					this.aByteArray101 = null;
				}
			} else if (this.aClass258_15.anInterface15_6 == null) {
				this.aBoolean570 = true;
			} else {
				this.aByteArray101 = null;
				this.aShortArray133 = this.aShortArray131 = this.aShortArray132 = null;
			}
		}
		if (this.aShortArray137 != null && !Static306.method5364(this.anInt7677, this.anInt7623)) {
			if (this.aClass258_14 != null && this.aClass258_14.anInterface15_6 == null) {
				this.aBoolean570 = true;
			} else {
				this.aShortArray137 = null;
			}
		}
		if (this.aByteArray102 != null && !Static220.method4019(this.anInt7623, this.anInt7677)) {
			if (this.aClass258_14 != null && this.aClass258_14.anInterface15_6 == null) {
				this.aBoolean570 = true;
			} else {
				this.aByteArray102 = null;
			}
		}
		if (this.aFloatArray65 != null && !Static148.method2767(this.anInt7623, this.anInt7677)) {
			if (this.aClass258_13 != null && this.aClass258_13.anInterface15_6 == null) {
				this.aBoolean570 = true;
			} else {
				this.aFloatArray65 = this.aFloatArray64 = null;
			}
		}
		if (this.aShortArray129 != null && !Static278.method4879(this.anInt7677, this.anInt7623)) {
			if (this.aClass258_14 != null && this.aClass258_14.anInterface15_6 == null) {
				this.aBoolean570 = true;
			} else {
				this.aShortArray129 = null;
			}
		}
		if (this.aShortArray134 != null && !Static327.method5595(this.anInt7677, this.anInt7623)) {
			if (this.aClass272_1 != null && this.aClass272_1.anInterface20_5 == null || this.aClass258_14 != null && this.aClass258_14.anInterface15_6 == null) {
				this.aBoolean570 = true;
			} else {
				this.aShortArray134 = this.aShortArray135 = this.aShortArray130 = null;
			}
		}
		if (this.anIntArrayArray103 != null && !Static301.method5329(this.anInt7623, this.anInt7677)) {
			this.anIntArrayArray103 = null;
			this.aShortArray138 = null;
		}
		if (this.anIntArrayArray105 != null && !Static543.method8257(this.anInt7623, this.anInt7677)) {
			this.anIntArrayArray105 = null;
			this.aShortArray136 = null;
		}
		if (this.anIntArrayArray104 != null && !Static262.method4707(this.anInt7677, this.anInt7623)) {
			this.anIntArrayArray104 = null;
		}
		if (this.anIntArray718 != null && (this.anInt7623 & 0x800) == 0 && (this.anInt7623 & 0x40000) == 0) {
			this.anIntArray718 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	private void method6787() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt7637; local23++) {
			@Pc(30) int local30 = this.anIntArray720[local23];
			@Pc(35) int local35 = this.anIntArray717[local23];
			if (local35 < local9) {
				local9 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			@Pc(72) int local72 = this.anIntArray721[local23];
			if (local17 < local72) {
				local17 = local72;
			}
			if (local72 < local11) {
				local11 = local72;
			}
			@Pc(98) int local98 = local30 * local30 + local72 * local72;
			if (local98 > local19) {
				local19 = local98;
			}
			local98 = local35 * local35 + local30 * local30 + local72 * local72;
			if (local98 > local21) {
				local21 = local98;
			}
		}
		this.aShort106 = (short) local13;
		this.aShort109 = (short) local9;
		this.aShort110 = (short) local17;
		this.aShort103 = (short) local7;
		this.aShort107 = (short) local15;
		this.aShort105 = (short) local11;
		this.aShort104 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean569 = true;
	}

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		if (this.aClass258_14 != null) {
			this.aClass258_14.anInterface15_6 = null;
		}
		this.aShort108 = (short) arg0;
		if (this.aClass258_15 != null) {
			this.aClass258_15.anInterface15_6 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "()V")
	@Override
	public void method6777() {
		if (this.anInt7621 <= 0 || this.anInt7625 <= 0) {
			return;
		}
		this.method6799(false);
		if ((this.aByte87 & 0x10) == 0 && this.aClass272_1.anInterface20_5 == null) {
			this.method6788(false);
		}
		this.method6786();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method6769(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class97_Sub3 local8 = (Class97_Sub3) arg0;
		if (this.anInt7679 == 0 || local8.anInt7679 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt7637;
		@Pc(24) int[] local24 = local8.anIntArray720;
		@Pc(27) int[] local27 = local8.anIntArray717;
		@Pc(30) int[] local30 = local8.anIntArray721;
		@Pc(33) short[] local33 = local8.aShortArray133;
		@Pc(36) short[] local36 = local8.aShortArray131;
		@Pc(39) short[] local39 = local8.aShortArray132;
		@Pc(42) byte[] local42 = local8.aByteArray101;
		@Pc(53) short[] local53;
		@Pc(57) short[] local57;
		@Pc(61) short[] local61;
		@Pc(49) byte[] local49;
		if (this.aClass170_1 == null) {
			local53 = null;
			local57 = null;
			local61 = null;
			local49 = null;
		} else {
			local49 = this.aClass170_1.aByteArray71;
			local53 = this.aClass170_1.aShortArray89;
			local57 = this.aClass170_1.aShortArray91;
			local61 = this.aClass170_1.aShortArray90;
		}
		@Pc(82) short[] local82;
		@Pc(86) short[] local86;
		@Pc(90) short[] local90;
		@Pc(78) byte[] local78;
		if (local8.aClass170_1 == null) {
			local86 = null;
			local90 = null;
			local82 = null;
			local78 = null;
		} else {
			local78 = local8.aClass170_1.aByteArray71;
			local82 = local8.aClass170_1.aShortArray89;
			local86 = local8.aClass170_1.aShortArray91;
			local90 = local8.aClass170_1.aShortArray90;
		}
		@Pc(103) int[] local103 = local8.anIntArray719;
		@Pc(106) short[] local106 = local8.aShortArray139;
		if (!local8.aBoolean569) {
			local8.method6787();
		}
		@Pc(115) short local115 = local8.aShort109;
		@Pc(118) short local118 = local8.aShort107;
		@Pc(121) short local121 = local8.aShort103;
		@Pc(124) short local124 = local8.aShort106;
		@Pc(127) short local127 = local8.aShort105;
		@Pc(130) short local130 = local8.aShort110;
		for (@Pc(132) int local132 = 0; local132 < this.anInt7637; local132++) {
			@Pc(141) int local141 = this.anIntArray717[local132] - arg2;
			if (local141 >= local115 && local141 <= local118) {
				@Pc(161) int local161 = this.anIntArray720[local132] - arg1;
				if (local161 >= local121 && local124 >= local161) {
					@Pc(180) int local180 = this.anIntArray721[local132] - arg3;
					if (local180 >= local127 && local180 <= local130) {
						@Pc(198) int local198 = -1;
						@Pc(203) int local203 = this.anIntArray719[local132];
						@Pc(210) int local210 = this.anIntArray719[local132 + 1];
						for (@Pc(212) int local212 = local203; local212 < local210; local212++) {
							local198 = this.aShortArray139[local212] - 1;
							if (local198 == -1 || this.aByteArray101[local198] != 0) {
								break;
							}
						}
						if (local198 != -1) {
							for (@Pc(249) int local249 = 0; local249 < local21; local249++) {
								if (local161 == local24[local249] && local30[local249] == local180 && local27[local249] == local141) {
									@Pc(272) int local272 = -1;
									local210 = local103[local249 + 1];
									local203 = local103[local249];
									for (@Pc(284) int local284 = local203; local284 < local210; local284++) {
										local272 = local106[local284] - 1;
										if (local272 == -1 || local42[local272] != 0) {
											break;
										}
									}
									if (local272 != -1) {
										if (local53 == null) {
											this.aClass170_1 = new Class170();
											local53 = this.aClass170_1.aShortArray89 = Static8.method396(this.aShortArray133);
											local57 = this.aClass170_1.aShortArray91 = Static8.method396(this.aShortArray131);
											local61 = this.aClass170_1.aShortArray90 = Static8.method396(this.aShortArray132);
											local49 = this.aClass170_1.aByteArray71 = Static236.method4200(this.aByteArray101);
										}
										if (local82 == null) {
											@Pc(365) Class170 local365 = local8.aClass170_1 = new Class170();
											local82 = local365.aShortArray89 = Static8.method396(local33);
											local86 = local365.aShortArray91 = Static8.method396(local36);
											local90 = local365.aShortArray90 = Static8.method396(local39);
											local78 = local365.aByteArray71 = Static236.method4200(local42);
										}
										@Pc(398) short local398 = this.aShortArray133[local198];
										@Pc(403) short local403 = this.aShortArray131[local198];
										@Pc(408) short local408 = this.aShortArray132[local198];
										local203 = local103[local249];
										@Pc(417) byte local417 = this.aByteArray101[local198];
										local210 = local103[local249 + 1];
										@Pc(433) int local433;
										for (@Pc(425) int local425 = local203; local425 < local210; local425++) {
											local433 = local106[local425] - 1;
											if (local433 == -1) {
												break;
											}
											if (local78[local433] != 0) {
												local82[local433] += local398;
												local86[local433] += local403;
												local90[local433] += local408;
												local78[local433] += local417;
											}
										}
										local203 = this.anIntArray719[local132];
										local398 = local33[local272];
										local417 = local42[local272];
										local408 = local39[local272];
										local210 = this.anIntArray719[local132 + 1];
										local403 = local36[local272];
										for (local433 = local203; local433 < local210; local433++) {
											@Pc(522) int local522 = this.aShortArray139[local433] - 1;
											if (local522 == -1) {
												break;
											}
											if (local49[local522] != 0) {
												local53[local522] += local398;
												local57[local522] += local403;
												local61[local522] += local408;
												local49[local522] += local417;
											}
										}
										if (this.aClass258_15 == null && this.aClass258_14 != null) {
											this.aClass258_14.anInterface15_6 = null;
										}
										if (this.aClass258_15 != null) {
											this.aClass258_15.anInterface15_6 = null;
										}
										if (local8.aClass258_15 == null && local8.aClass258_14 != null) {
											local8.aClass258_14.anInterface15_6 = null;
										}
										if (local8.aClass258_15 != null) {
											local8.aClass258_15.anInterface15_6 = null;
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

	@OriginalMember(owner = "client!sb", name = "BA", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static403.anInt7100 = 0;
			local29 = 0;
			Static184.anInt3827 = 0;
			Static249.anInt4797 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray105.length) {
					local55 = this.anIntArrayArray105[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray136 == null || (arg6 & this.aShortArray136[local63]) != 0) {
							Static249.anInt4797 += this.anIntArray720[local63];
							Static184.anInt3827 += this.anIntArray717[local63];
							local29++;
							Static403.anInt7100 += this.anIntArray721[local63];
						}
					}
				}
			}
			if (local29 <= 0) {
				Static249.anInt4797 = arg2;
				Static403.anInt7100 = arg4;
				Static184.anInt3827 = arg3;
			} else {
				Static184.anInt3827 = Static184.anInt3827 / local29 + arg3;
				Static249.anInt4797 = arg2 + Static249.anInt4797 / local29;
				Static403.anInt7100 = Static403.anInt7100 / local29 + arg4;
				Static36.aBoolean94 = true;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[1] * arg3 + arg7[0] * arg2 + arg7[2] * arg4 + 16384 >> 15;
				local35 = arg4 * arg7[5] + arg3 * arg7[4] + arg7[3] * arg2 + 16384 >> 15;
				local41 = arg7[6] * arg2 + arg3 * arg7[7] + arg4 * arg7[8] + 16384 >> 15;
				arg4 = local41;
				arg2 = local29;
				arg3 = local35;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray105.length) {
					local250 = this.anIntArrayArray105[local35];
					for (local252 = 0; local252 < local250.length; local252++) {
						local57 = local250[local252];
						if (this.aShortArray136 == null || (arg6 & this.aShortArray136[local57]) != 0) {
							this.anIntArray720[local57] += arg2;
							this.anIntArray717[local57] += arg3;
							this.anIntArray721[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(373) int local373;
		@Pc(395) int local395;
		@Pc(426) int local426;
		@Pc(453) int local453;
		@Pc(457) int local457;
		@Pc(461) int local461;
		@Pc(465) int local465;
		@Pc(473) int local473;
		@Pc(481) int local481;
		@Pc(636) int local636;
		@Pc(662) int local662;
		@Pc(666) int local666;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(683) int local683;
		@Pc(687) int local687;
		@Pc(689) int local689;
		@Pc(817) int[] local817;
		@Pc(819) int local819;
		@Pc(823) int local823;
		@Pc(827) int local827;
		@Pc(829) int local829;
		@Pc(960) int local960;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray105.length > local35) {
						local250 = this.anIntArrayArray105[local35];
						for (local252 = 0; local252 < local250.length; local252++) {
							local57 = local250[local252];
							if (this.aShortArray136 == null || (this.aShortArray136[local57] & arg6) != 0) {
								this.anIntArray720[local57] -= Static249.anInt4797;
								this.anIntArray717[local57] -= Static184.anInt3827;
								this.anIntArray721[local57] -= Static403.anInt7100;
								if (arg4 != 0) {
									local63 = Class200_Sub1.lb[arg4];
									local373 = Class200_Sub1.anIntArray576[arg4];
									local395 = local63 * this.anIntArray717[local57] + local373 * this.anIntArray720[local57] + 32767 >> 15;
									this.anIntArray717[local57] = local373 * this.anIntArray717[local57] + 32767 - local63 * this.anIntArray720[local57] >> 15;
									this.anIntArray720[local57] = local395;
								}
								if (arg2 != 0) {
									local63 = Class200_Sub1.lb[arg2];
									local373 = Class200_Sub1.anIntArray576[arg2];
									local395 = this.anIntArray717[local57] * local373 + 32767 - this.anIntArray721[local57] * local63 >> 15;
									this.anIntArray721[local57] = local373 * this.anIntArray721[local57] + this.anIntArray717[local57] * local63 + 32767 >> 15;
									this.anIntArray717[local57] = local395;
								}
								if (arg3 != 0) {
									local63 = Class200_Sub1.lb[arg3];
									local373 = Class200_Sub1.anIntArray576[arg3];
									local395 = local373 * this.anIntArray720[local57] + local63 * this.anIntArray721[local57] + 32767 >> 15;
									this.anIntArray721[local57] = local373 * this.anIntArray721[local57] + 32767 - this.anIntArray720[local57] * local63 >> 15;
									this.anIntArray720[local57] = local395;
								}
								this.anIntArray720[local57] += Static249.anInt4797;
								this.anIntArray717[local57] += Static184.anInt3827;
								this.anIntArray721[local57] += Static403.anInt7100;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray105.length > local41) {
							local55 = this.anIntArrayArray105[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray136 == null || (this.aShortArray136[local63] & arg6) != 0) {
									local373 = this.anIntArray719[local63];
									local395 = this.anIntArray719[local63 + 1];
									for (local426 = local373; local426 < local395; local426++) {
										local453 = this.aShortArray139[local426] - 1;
										if (local453 == -1) {
											break;
										}
										if (arg4 != 0) {
											local457 = Class200_Sub1.lb[arg4];
											local461 = Class200_Sub1.anIntArray576[arg4];
											local465 = local461 * this.aShortArray133[local453] + local457 * this.aShortArray131[local453] + 32767 >> 15;
											this.aShortArray131[local453] = (short) (local461 * this.aShortArray131[local453] + 32767 - this.aShortArray133[local453] * local457 >> 15);
											this.aShortArray133[local453] = (short) local465;
										}
										if (arg2 != 0) {
											local457 = Class200_Sub1.lb[arg2];
											local461 = Class200_Sub1.anIntArray576[arg2];
											local465 = this.aShortArray131[local453] * local461 + 32767 - local457 * this.aShortArray132[local453] >> 15;
											this.aShortArray132[local453] = (short) (local461 * this.aShortArray132[local453] + local457 * this.aShortArray131[local453] + 32767 >> 15);
											this.aShortArray131[local453] = (short) local465;
										}
										if (arg3 != 0) {
											local457 = Class200_Sub1.lb[arg3];
											local461 = Class200_Sub1.anIntArray576[arg3];
											local465 = local457 * this.aShortArray132[local453] + local461 * this.aShortArray133[local453] + 32767 >> 15;
											this.aShortArray132[local453] = (short) (local461 * this.aShortArray132[local453] + 32767 - this.aShortArray133[local453] * local457 >> 15);
											this.aShortArray133[local453] = (short) local465;
										}
									}
								}
							}
						}
					}
					if (this.aClass258_15 == null && this.aClass258_14 != null) {
						this.aClass258_14.anInterface15_6 = null;
					}
					if (this.aClass258_15 != null) {
						this.aClass258_15.anInterface15_6 = null;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static36.aBoolean94) {
					local373 = arg7[3] * Static184.anInt3827 + arg7[0] * Static249.anInt4797 + Static403.anInt7100 * arg7[6] + 16384 >> 15;
					local395 = Static403.anInt7100 * arg7[7] + Static249.anInt4797 * arg7[1] + arg7[4] * Static184.anInt3827 + 16384 >> 15;
					local373 += local252;
					local395 += local57;
					local426 = arg7[2] * Static249.anInt4797 + Static184.anInt3827 * arg7[5] + Static403.anInt7100 * arg7[8] + 16384 >> 15;
					Static249.anInt4797 = local373;
					local426 += local63;
					Static184.anInt3827 = local395;
					Static36.aBoolean94 = false;
					Static403.anInt7100 = local426;
				}
				@Pc(441) int[] local441 = new int[9];
				local395 = Class200_Sub1.anIntArray576[arg2];
				local426 = Class200_Sub1.lb[arg2];
				local453 = Class200_Sub1.anIntArray576[arg3];
				local457 = Class200_Sub1.lb[arg3];
				local461 = Class200_Sub1.anIntArray576[arg4];
				local465 = Class200_Sub1.lb[arg4];
				local473 = local426 * local461 + 16384 >> 15;
				local481 = local426 * local465 + 16384 >> 15;
				local441[2] = local457 * local395 + 16384 >> 15;
				local441[0] = local461 * local453 + local457 * local481 + 16384 >> 15;
				local441[6] = local453 * local481 + -local457 * local461 + 16384 >> 15;
				local441[5] = -local426;
				local441[7] = local465 * local457 + local473 * local453 + 16384 >> 15;
				local441[3] = local465 * local395 + 16384 >> 15;
				local441[1] = local457 * local473 + local465 * -local453 + 16384 >> 15;
				local441[8] = local453 * local395 + 16384 >> 15;
				local441[4] = local395 * local461 + 16384 >> 15;
				@Pc(610) int local610 = -Static403.anInt7100 * local441[2] + -Static249.anInt4797 * local441[0] + -Static184.anInt3827 * local441[1] + 16384 >> 15;
				local636 = -Static184.anInt3827 * local441[4] + local441[3] * -Static249.anInt4797 + local441[5] * -Static403.anInt7100 + 16384 >> 15;
				local662 = local441[8] * -Static403.anInt7100 + local441[6] * -Static249.anInt4797 + local441[7] * -Static184.anInt3827 + 16384 >> 15;
				local666 = Static249.anInt4797 + local610;
				@Pc(670) int local670 = Static184.anInt3827 + local636;
				local674 = Static403.anInt7100 + local662;
				@Pc(677) int[] local677 = new int[9];
				for (local679 = 0; local679 < 3; local679++) {
					for (local683 = 0; local683 < 3; local683++) {
						local687 = 0;
						for (local689 = 0; local689 < 3; local689++) {
							local687 += arg7[local689 + local683 * 3] * local441[local689 + local679 * 3];
						}
						local677[local679 * 3 + local683] = local687 + 16384 >> 15;
					}
				}
				local683 = local441[2] * local63 + local441[1] * local57 + local441[0] * local252 + 16384 >> 15;
				local687 = local441[5] * local63 + local441[3] * local252 + local57 * local441[4] + 16384 >> 15;
				local687 += local670;
				local683 += local666;
				local689 = local441[7] * local57 + local252 * local441[6] + local441[8] * local63 + 16384 >> 15;
				local689 += local674;
				local817 = new int[9];
				for (local819 = 0; local819 < 3; local819++) {
					for (local823 = 0; local823 < 3; local823++) {
						local827 = 0;
						for (local829 = 0; local829 < 3; local829++) {
							local827 += local677[local823 + local829 * 3] * arg7[local819 * 3 + local829];
						}
						local817[local819 * 3 + local823] = local827 + 16384 >> 15;
					}
				}
				local823 = local689 * arg7[2] + arg7[1] * local687 + arg7[0] * local683 + 16384 >> 15;
				local827 = local689 * arg7[5] + arg7[3] * local683 + local687 * arg7[4] + 16384 >> 15;
				local827 += local35;
				local829 = arg7[7] * local687 + arg7[6] * local683 + arg7[8] * local689 + 16384 >> 15;
				local823 += local29;
				local829 += local41;
				for (local960 = 0; local960 < local8; local960++) {
					@Pc(966) int local966 = arg1[local960];
					if (local966 < this.anIntArrayArray105.length) {
						@Pc(976) int[] local976 = this.anIntArrayArray105[local966];
						for (@Pc(978) int local978 = 0; local978 < local976.length; local978++) {
							@Pc(984) int local984 = local976[local978];
							if (this.aShortArray136 == null || (arg6 & this.aShortArray136[local984]) != 0) {
								@Pc(1028) int local1028 = this.anIntArray720[local984] * local817[0] + local817[1] * this.anIntArray717[local984] + local817[2] * this.anIntArray721[local984] + 16384 >> 15;
								@Pc(1059) int local1059 = local817[5] * this.anIntArray721[local984] + local817[4] * this.anIntArray717[local984] + local817[3] * this.anIntArray720[local984] + 16384 >> 15;
								@Pc(1063) int local1063 = local1059 + local827;
								@Pc(1067) int local1067 = local1028 + local823;
								@Pc(1098) int local1098 = this.anIntArray717[local984] * local817[7] + this.anIntArray720[local984] * local817[6] + this.anIntArray721[local984] * local817[8] + 16384 >> 15;
								this.anIntArray720[local984] = local1067;
								@Pc(1107) int local1107 = local1098 + local829;
								this.anIntArray717[local984] = local1063;
								this.anIntArray721[local984] = local1107;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2577) Class186 local2577;
			@Pc(2582) Class274 local2582;
			if (arg0 == 5) {
				if (this.anIntArrayArray103 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray103.length) {
							local250 = this.anIntArrayArray103[local35];
							for (local252 = 0; local252 < local250.length; local252++) {
								local57 = local250[local252];
								if (this.aShortArray138 == null || (this.aShortArray138[local57] & arg6) != 0) {
									local63 = arg2 * 8 + (this.aByteArray102[local57] & 0xFF);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray102[local57] = (byte) local63;
									if (this.aClass258_14 != null) {
										this.aClass258_14.anInterface15_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass186Array1 != null) {
						for (local35 = 0; local35 < this.anInt7653; local35++) {
							local2577 = this.aClass186Array1[local35];
							local2582 = this.aClass274Array1[local35];
							local2582.anInt7948 = 255 - (this.aByteArray102[local2577.anInt5846] & 0xFF) << 24 | local2582.anInt7948 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2833) Class274 local2833;
				if (arg0 == 8) {
					if (this.anIntArrayArray104 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray104.length > local35) {
								local250 = this.anIntArrayArray104[local35];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2833 = this.aClass274Array1[local250[local252]];
									local2833.anInt7944 += arg2;
									local2833.anInt7950 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray104 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray104.length > local35) {
								local250 = this.anIntArrayArray104[local35];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2833 = this.aClass274Array1[local250[local252]];
									local2833.anInt7943 = arg3 * local2833.anInt7943 >> 7;
									local2833.anInt7949 = arg2 * local2833.anInt7949 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray104 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray104.length) {
							local250 = this.anIntArrayArray104[local35];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2833 = this.aClass274Array1[local250[local252]];
								local2833.anInt7945 = local2833.anInt7945 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray103 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray103.length) {
						local250 = this.anIntArrayArray103[local35];
						for (local252 = 0; local252 < local250.length; local252++) {
							local57 = local250[local252];
							if (this.aShortArray138 == null || (arg6 & this.aShortArray138[local57]) != 0) {
								local63 = this.aShortArray137[local57] & 0xFFFF;
								local373 = local63 >> 10 & 0x3F;
								local395 = local63 >> 7 & 0x7;
								local395 += arg3 / 4;
								local426 = local63 & 0x7F;
								@Pc(2690) int local2690 = local373 + arg2 & 0x3F;
								local426 += arg4;
								if (local395 < 0) {
									local395 = 0;
								} else if (local395 > 7) {
									local395 = 7;
								}
								if (local426 < 0) {
									local426 = 0;
								} else if (local426 > 127) {
									local426 = 127;
								}
								this.aShortArray137[local57] = (short) (local395 << 7 | local2690 << 10 | local426);
								if (this.aClass258_14 != null) {
									this.aClass258_14.anInterface15_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass186Array1 != null) {
					for (local35 = 0; local35 < this.anInt7653; local35++) {
						local2577 = this.aClass186Array1[local35];
						local2582 = this.aClass274Array1[local35];
						local2582.anInt7948 = local2582.anInt7948 & 0xFF000000 | Static107.anIntArray176[this.aShortArray137[local2577.anInt5846] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray105.length) {
					local250 = this.anIntArrayArray105[local35];
					for (local252 = 0; local252 < local250.length; local252++) {
						local57 = local250[local252];
						if (this.aShortArray136 == null || (arg6 & this.aShortArray136[local57]) != 0) {
							this.anIntArray720[local57] -= Static249.anInt4797;
							this.anIntArray717[local57] -= Static184.anInt3827;
							this.anIntArray721[local57] -= Static403.anInt7100;
							this.anIntArray720[local57] = arg2 * this.anIntArray720[local57] >> 7;
							this.anIntArray717[local57] = this.anIntArray717[local57] * arg3 >> 7;
							this.anIntArray721[local57] = this.anIntArray721[local57] * arg4 >> 7;
							this.anIntArray720[local57] += Static249.anInt4797;
							this.anIntArray717[local57] += Static184.anInt3827;
							this.anIntArray721[local57] += Static403.anInt7100;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static36.aBoolean94) {
				local373 = arg7[6] * Static403.anInt7100 + Static249.anInt4797 * arg7[0] + Static184.anInt3827 * arg7[3] + 16384 >> 15;
				local395 = arg7[7] * Static403.anInt7100 + arg7[4] * Static184.anInt3827 + arg7[1] * Static249.anInt4797 + 16384 >> 15;
				local426 = arg7[8] * Static403.anInt7100 + arg7[5] * Static184.anInt3827 + arg7[2] * Static249.anInt4797 + 16384 >> 15;
				local373 += local252;
				local395 += local57;
				local426 += local63;
				Static249.anInt4797 = local373;
				Static184.anInt3827 = local395;
				Static403.anInt7100 = local426;
				Static36.aBoolean94 = false;
			}
			local373 = arg2 << 15 >> 7;
			local395 = arg3 << 15 >> 7;
			local426 = arg4 << 15 >> 7;
			local453 = local373 * -Static249.anInt4797 + 16384 >> 15;
			local457 = -Static184.anInt3827 * local395 + 16384 >> 15;
			local461 = -Static403.anInt7100 * local426 + 16384 >> 15;
			local465 = Static249.anInt4797 + local453;
			local473 = Static184.anInt3827 + local457;
			local481 = local461 + Static403.anInt7100;
			@Pc(1861) int[] local1861 = new int[] { arg7[0] * local373 + 16384 >> 15, local373 * arg7[3] + 16384 >> 15, arg7[6] * local373 + 16384 >> 15, arg7[1] * local395 + 16384 >> 15, local395 * arg7[4] + 16384 >> 15, arg7[7] * local395 + 16384 >> 15, local426 * arg7[2] + 16384 >> 15, local426 * arg7[5] + 16384 >> 15, local426 * arg7[8] + 16384 >> 15 };
			local636 = local373 * local252 + 16384 >> 15;
			local662 = local395 * local57 + 16384 >> 15;
			@Pc(1989) int local1989 = local636 + local465;
			local666 = local426 * local63 + 16384 >> 15;
			@Pc(2001) int local2001 = local662 + local473;
			@Pc(2005) int local2005 = local666 + local481;
			@Pc(2008) int[] local2008 = new int[9];
			@Pc(2014) int local2014;
			for (local674 = 0; local674 < 3; local674++) {
				for (local2014 = 0; local2014 < 3; local2014++) {
					local679 = 0;
					for (local683 = 0; local683 < 3; local683++) {
						local679 += local1861[local683 * 3 + local2014] * arg7[local674 * 3 + local683];
					}
					local2008[local2014 + local674 * 3] = local679 + 16384 >> 15;
				}
			}
			local2014 = local1989 * arg7[0] + local2001 * arg7[1] + local2005 * arg7[2] + 16384 >> 15;
			local679 = local1989 * arg7[3] + local2001 * arg7[4] + arg7[5] * local2005 + 16384 >> 15;
			local683 = arg7[6] * local1989 + arg7[7] * local2001 + local2005 * arg7[8] + 16384 >> 15;
			local679 += local35;
			local2014 += local29;
			local683 += local41;
			for (local687 = 0; local687 < local8; local687++) {
				local689 = arg1[local687];
				if (local689 < this.anIntArrayArray105.length) {
					local817 = this.anIntArrayArray105[local689];
					for (local819 = 0; local819 < local817.length; local819++) {
						local823 = local817[local819];
						if (this.aShortArray136 == null || (arg6 & this.aShortArray136[local823]) != 0) {
							local827 = this.anIntArray720[local823] * local2008[0] + this.anIntArray717[local823] * local2008[1] + this.anIntArray721[local823] * local2008[2] + 16384 >> 15;
							local829 = local2008[4] * this.anIntArray717[local823] + this.anIntArray720[local823] * local2008[3] + this.anIntArray721[local823] * local2008[5] + 16384 >> 15;
							@Pc(2253) int local2253 = local827 + local2014;
							@Pc(2257) int local2257 = local829 + local679;
							local960 = this.anIntArray721[local823] * local2008[8] + this.anIntArray720[local823] * local2008[6] + local2008[7] * this.anIntArray717[local823] + 16384 >> 15;
							this.anIntArray720[local823] = local2253;
							@Pc(2297) int local2297 = local960 + local683;
							this.anIntArray717[local823] = local2257;
							this.anIntArray721[local823] = local2297;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class97 method6770(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class97_Sub3 local12;
		@Pc(16) Class97_Sub3 local16;
		if (arg0 == 1) {
			local12 = this.aClass4_Sub3_38.aClass97_Sub3_9;
			local16 = this.aClass4_Sub3_38.aClass97_Sub3_7;
		} else if (arg0 == 2) {
			local16 = this.aClass4_Sub3_38.aClass97_Sub3_10;
			local12 = this.aClass4_Sub3_38.aClass97_Sub3_3;
		} else if (arg0 == 3) {
			local16 = this.aClass4_Sub3_38.aClass97_Sub3_2;
			local12 = this.aClass4_Sub3_38.aClass97_Sub3_8;
		} else if (arg0 == 4) {
			local12 = this.aClass4_Sub3_38.aClass97_Sub3_4;
			local16 = this.aClass4_Sub3_38.aClass97_Sub3_1;
		} else if (arg0 == 5) {
			local12 = this.aClass4_Sub3_38.aClass97_Sub3_5;
			local16 = this.aClass4_Sub3_38.aClass97_Sub3_6;
		} else {
			local12 = local16 = new Class97_Sub3(this.aClass4_Sub3_38);
		}
		return this.method6796(arg0 != 0, local12, local16, arg1, arg2);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZ)V")
	private void method6788(@OriginalArg(1) boolean arg0) {
		if (this.anInt7625 * 6 <= this.aClass4_Sub3_38.aClass1_Sub17_Sub1_2.aByteArray58.length) {
			this.aClass4_Sub3_38.aClass1_Sub17_Sub1_2.anInt4872 = 0;
		} else {
			this.aClass4_Sub3_38.aClass1_Sub17_Sub1_2 = new Class1_Sub17_Sub1((this.anInt7625 + 100) * 6);
		}
		@Pc(38) Class1_Sub17_Sub1 local38 = this.aClass4_Sub3_38.aClass1_Sub17_Sub1_2;
		@Pc(44) int local44;
		if (this.aClass4_Sub3_38.aBoolean421) {
			for (local44 = 0; local44 < this.anInt7625; local44++) {
				local38.method4473(this.aShortArray134[local44]);
				local38.method4473(this.aShortArray135[local44]);
				local38.method4473(this.aShortArray130[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt7625; local44++) {
				local38.method4455(this.aShortArray134[local44]);
				local38.method4455(this.aShortArray135[local44]);
				local38.method4455(this.aShortArray130[local44]);
			}
		}
		if (local38.anInt4872 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface20_4 == null) {
				this.anInterface20_4 = this.aClass4_Sub3_38.method5304(local38.aByteArray58, true, local38.anInt4872);
			} else {
				this.anInterface20_4.method8129(local38.anInt4872, local38.aByteArray58);
			}
			this.aClass272_1.anInterface20_5 = this.anInterface20_4;
		} else {
			this.aClass272_1.anInterface20_5 = this.aClass4_Sub3_38.method5304(local38.aByteArray58, false, local38.anInt4872);
		}
		if (!arg0) {
			this.aBoolean570 = true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(SIIZB)I")
	private int method6789(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(12) int local12 = Static107.anIntArray176[Static205.method5908(arg1, arg2)];
		if (arg0 != -1) {
			@Pc(30) Class296 local30 = this.aClass4_Sub3_38.anInterface13_13.method5789(arg0 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte103 & 0xFF;
			@Pc(51) int local51;
			@Pc(69) int local69;
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
					local69 = 256 - local35;
					local12 = (local35 * (local51 & 0xFF00FF) + (local12 & 0xFF00FF) * local69 & 0xFF00FF00) + (local69 * (local12 & 0xFF00) + local35 * (local51 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local51 = local30.aByte99 & 0xFF;
			if (local51 != 0) {
				local51 += 256;
				@Pc(121) int local121 = local51 * (local12 >> 16 & 0xFF);
				if (local121 > 65535) {
					local121 = 65535;
				}
				local69 = local51 * (local12 >> 8 & 0xFF);
				if (local69 > 65535) {
					local69 = 65535;
				}
				@Pc(145) int local145 = (local12 & 0xFF) * local51;
				if (local145 > 65535) {
					local145 = 65535;
				}
				local12 = (local121 << 8 & 0xFF00A6) + (local69 & 0xFF00) + (local145 >> 8);
			}
		}
		return (local12 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!m;Lclient!cf;II)V")
	@Override
	public void method6778(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class46_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7621 == 0) {
			return;
		}
		@Pc(13) Class128_Sub2 local13 = this.aClass4_Sub3_38.aClass128_Sub2_3;
		@Pc(16) Class128_Sub2 local16 = (Class128_Sub2) arg0;
		if (!this.aBoolean569) {
			this.method6787();
		}
		Static124.aFloat48 = local13.aFloat96 + local16.aFloat94 * local13.aFloat91 + local13.aFloat92 * local16.aFloat93 + local16.aFloat96 * local13.aFloat99;
		Static301.aFloat131 = local13.aFloat99 * local16.aFloat91 + local16.aFloat98 * local13.aFloat92 + local13.aFloat91 * local16.aFloat90;
		@Pc(69) float local69 = Static124.aFloat48 + Static301.aFloat131 * (float) this.aShort109;
		@Pc(77) float local77 = Static124.aFloat48 + Static301.aFloat131 * (float) this.aShort107;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.aShort104;
			local93 = local77 - (float) this.aShort104;
		} else {
			local87 = local77 + (float) this.aShort104;
			local93 = local69 - (float) this.aShort104;
		}
		if (this.aClass4_Sub3_38.aFloat118 <= local93 || (float) this.aClass4_Sub3_38.anInt5823 >= local87) {
			return;
		}
		Static313.aFloat132 = local16.aFloat98 * local13.aFloat100 + local13.aFloat98 * local16.aFloat90 + local13.aFloat95 * local16.aFloat91;
		Static207.aFloat85 = local13.aFloat93 + local16.aFloat94 * local13.aFloat98 + local16.aFloat93 * local13.aFloat100 + local13.aFloat95 * local16.aFloat96;
		@Pc(169) float local169 = Static313.aFloat132 * (float) this.aShort109 + Static207.aFloat85;
		@Pc(177) float local177 = (float) this.aShort107 * Static313.aFloat132 + Static207.aFloat85;
		@Pc(204) float local204;
		@Pc(192) float local192;
		if (local169 > local177) {
			local192 = (local169 + (float) this.aShort104) * (float) this.aClass4_Sub3_38.anInt5834;
			local204 = ((float) -this.aShort104 + local177) * (float) this.aClass4_Sub3_38.anInt5834;
		} else {
			local192 = ((float) this.aShort104 + local177) * (float) this.aClass4_Sub3_38.anInt5834;
			local204 = (float) this.aClass4_Sub3_38.anInt5834 * ((float) -this.aShort104 + local169);
		}
		if (local204 / (float) arg2 >= this.aClass4_Sub3_38.aFloat115 || this.aClass4_Sub3_38.aFloat120 >= local192 / (float) arg2) {
			return;
		}
		Static256.aFloat105 = local13.aFloat94 + local13.aFloat97 * local16.aFloat96 + local16.aFloat94 * local13.aFloat90 + local13.aFloat89 * local16.aFloat93;
		Static26.aFloat8 = local16.aFloat91 * local13.aFloat97 + local13.aFloat90 * local16.aFloat90 + local16.aFloat98 * local13.aFloat89;
		@Pc(296) float local296 = Static26.aFloat8 * (float) this.aShort109 + Static256.aFloat105;
		@Pc(304) float local304 = (float) this.aShort107 * Static26.aFloat8 + Static256.aFloat105;
		@Pc(330) float local330;
		@Pc(319) float local319;
		if (local296 > local304) {
			local330 = (float) this.aClass4_Sub3_38.anInt5805 * ((float) -this.aShort104 + local304);
			local319 = (float) this.aClass4_Sub3_38.anInt5805 * ((float) this.aShort104 + local296);
		} else {
			local319 = ((float) this.aShort104 + local304) * (float) this.aClass4_Sub3_38.anInt5805;
			local330 = (float) this.aClass4_Sub3_38.anInt5805 * (local296 - (float) this.aShort104);
		}
		if (local330 / (float) arg2 >= this.aClass4_Sub3_38.aFloat108 || local319 / (float) arg2 <= this.aClass4_Sub3_38.aFloat111) {
			return;
		}
		if (arg1 != null || this.aClass186Array1 != null) {
			Static39.aFloat28 = local16.aFloat99 * local13.aFloat97 + local16.aFloat95 * local13.aFloat89 + local16.aFloat97 * local13.aFloat90;
			Static179.aFloat79 = local16.aFloat92 * local13.aFloat99 + local16.aFloat100 * local13.aFloat92 + local13.aFloat91 * local16.aFloat89;
			Static57.aFloat33 = local13.aFloat100 * local16.aFloat95 + local13.aFloat98 * local16.aFloat97 + local13.aFloat95 * local16.aFloat99;
			Static378.aFloat142 = local16.aFloat99 * local13.aFloat99 + local16.aFloat95 * local13.aFloat92 + local16.aFloat97 * local13.aFloat91;
			Static350.aFloat137 = local16.aFloat92 * local13.aFloat97 + local16.aFloat89 * local13.aFloat90 + local16.aFloat100 * local13.aFloat89;
			Static128.aFloat106 = local13.aFloat100 * local16.aFloat100 + local13.aFloat98 * local16.aFloat89 + local16.aFloat92 * local13.aFloat95;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.aShort103 + this.aShort106 >> 1;
			@Pc(507) int local507 = this.aShort110 + this.aShort105 >> 1;
			@Pc(526) int local526 = (int) ((float) this.aShort109 * Static313.aFloat132 + Static128.aFloat106 * (float) local499 + Static207.aFloat85 + Static57.aFloat33 * (float) local507);
			@Pc(545) int local545 = (int) ((float) this.aShort109 * Static26.aFloat8 + (float) local499 * Static350.aFloat137 + Static256.aFloat105 + Static39.aFloat28 * (float) local507);
			@Pc(564) int local564 = (int) ((float) local499 * Static179.aFloat79 + Static124.aFloat48 + (float) this.aShort109 * Static301.aFloat131 + Static378.aFloat142 * (float) local507);
			@Pc(583) int local583 = (int) (Static57.aFloat33 * (float) local507 + Static207.aFloat85 + (float) local499 * Static128.aFloat106 + (float) this.aShort107 * Static313.aFloat132);
			@Pc(602) int local602 = (int) ((float) local499 * Static350.aFloat137 + Static256.aFloat105 + Static26.aFloat8 * (float) this.aShort107 + Static39.aFloat28 * (float) local507);
			@Pc(621) int local621 = (int) ((float) local507 * Static378.aFloat142 + (float) this.aShort107 * Static301.aFloat131 + Static124.aFloat48 + (float) local499 * Static179.aFloat79);
			arg1.anInt1437 = local583 * this.aClass4_Sub3_38.anInt5834 / arg2 + this.aClass4_Sub3_38.anInt5822;
			arg1.anInt1434 = this.aClass4_Sub3_38.anInt5805 * local602 / arg2 + this.aClass4_Sub3_38.anInt5811;
			arg1.anInt1435 = this.aClass4_Sub3_38.anInt5805 * local545 / arg2 + this.aClass4_Sub3_38.anInt5811;
			arg1.anInt1433 = this.aClass4_Sub3_38.anInt5834 * local526 / arg2 + this.aClass4_Sub3_38.anInt5822;
			if (local564 < this.aClass4_Sub3_38.anInt5823 && this.aClass4_Sub3_38.anInt5823 > local621) {
				arg1.aBoolean109 = true;
				arg1.anInt1436 = (this.aShort104 + local526) * this.aClass4_Sub3_38.anInt5834 / arg2 + this.aClass4_Sub3_38.anInt5822 - arg1.anInt1433;
			}
		}
		this.aClass4_Sub3_38.method5252((float) arg2);
		this.aClass4_Sub3_38.method5251();
		this.aClass4_Sub3_38.method5257(local16);
		this.method6800();
		this.aClass4_Sub3_38.method5247();
		this.method6790();
	}

	@OriginalMember(owner = "client!sb", name = "OA", descriptor = "(I)V")
	@Override
	public void OA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200_Sub1.lb[arg0];
		@Pc(13) int local13 = Class200_Sub1.anIntArray576[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7637; local15++) {
			@Pc(33) int local33 = this.anIntArray720[local15] * local13 + local9 * this.anIntArray721[local15] >> 15;
			this.anIntArray721[local15] = this.anIntArray721[local15] * local13 - this.anIntArray720[local15] * local9 >> 15;
			this.anIntArray720[local15] = local33;
		}
		this.aBoolean569 = false;
		if (this.aClass258_16 != null) {
			this.aClass258_16.anInterface15_6 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.aShort108;
	}

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200_Sub1.lb[arg0];
		@Pc(13) int local13 = Class200_Sub1.anIntArray576[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7637; local15++) {
			@Pc(34) int local34 = this.anIntArray717[local15] * local13 - this.anIntArray721[local15] * local9 >> 15;
			this.anIntArray721[local15] = this.anIntArray721[local15] * local13 + local9 * this.anIntArray717[local15] >> 15;
			this.anIntArray717[local15] = local34;
		}
		if (this.aClass258_16 != null) {
			this.aClass258_16.anInterface15_6 = null;
		}
		this.aBoolean569 = false;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "()I")
	@Override
	public int e() {
		if (!this.aBoolean569) {
			this.method6787();
		}
		return this.aShort104;
	}

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200_Sub1.lb[arg0];
		@Pc(13) int local13 = Class200_Sub1.anIntArray576[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7637; local15++) {
			local33 = local9 * this.anIntArray721[local15] + this.anIntArray720[local15] * local13 >> 15;
			this.anIntArray721[local15] = this.anIntArray721[local15] * local13 - local9 * this.anIntArray720[local15] >> 15;
			this.anIntArray720[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7621; local33++) {
			@Pc(83) int local83 = local13 * this.aShortArray133[local33] + local9 * this.aShortArray132[local33] >> 15;
			this.aShortArray132[local33] = (short) (this.aShortArray132[local33] * local13 - this.aShortArray133[local33] * local9 >> 15);
			this.aShortArray133[local33] = (short) local83;
		}
		if (this.aClass258_15 == null && this.aClass258_14 != null) {
			this.aClass258_14.anInterface15_6 = null;
		}
		if (this.aClass258_15 != null) {
			this.aClass258_15.anInterface15_6 = null;
		}
		this.aBoolean569 = false;
		if (this.aClass258_16 != null) {
			this.aClass258_16.anInterface15_6 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	private void method6790() {
		if (this.aClass186Array1 == null) {
			return;
		}
		@Pc(14) Class128_Sub2 local14 = this.aClass4_Sub3_38.aClass128_Sub2_2;
		@Pc(18) float local18 = this.aClass4_Sub3_38.ra();
		@Pc(22) float local22 = this.aClass4_Sub3_38.P();
		this.aClass4_Sub3_38.method5279();
		this.aClass4_Sub3_38.method7214(false);
		this.aClass4_Sub3_38.method5273(false);
		this.aClass4_Sub3_38.method5298(this.aClass4_Sub3_38.aClass258_7, null, this.aClass4_Sub3_38.aClass258_8, null);
		for (@Pc(49) int local49 = 0; local49 < this.anInt7653; local49++) {
			@Pc(56) Class186 local56 = this.aClass186Array1[local49];
			@Pc(61) Class274 local61 = this.aClass274Array1[local49];
			if (!local56.aBoolean449 || !this.aClass4_Sub3_38.method7182()) {
				@Pc(89) float local89 = (float) (this.anIntArray720[local56.anInt5848] + this.anIntArray720[local56.anInt5850] + this.anIntArray720[local56.anInt5847]) * 0.3333333F;
				@Pc(111) float local111 = (float) (this.anIntArray717[local56.anInt5847] + this.anIntArray717[local56.anInt5848] + this.anIntArray717[local56.anInt5850]) * 0.3333333F;
				@Pc(132) float local132 = (float) (this.anIntArray721[local56.anInt5847] + this.anIntArray721[local56.anInt5850] + this.anIntArray721[local56.anInt5848]) * 0.3333333F;
				@Pc(146) float local146 = Static57.aFloat33 * local132 + Static128.aFloat106 * local89 + Static313.aFloat132 * local111 + Static207.aFloat85;
				@Pc(160) float local160 = Static256.aFloat105 + local132 * Static39.aFloat28 + Static350.aFloat137 * local89 + Static26.aFloat8 * local111;
				@Pc(174) float local174 = Static301.aFloat131 * local111 + Static179.aFloat79 * local89 + Static378.aFloat142 * local132 + Static124.aFloat48;
				local14.method4324(local56.aShort69 * local61.anInt7949 >> 7, -local174, (float) local61.anInt7944 + local146, local56.aShort67 * local61.anInt7943 >> 7, (float) local61.anInt7950 - local160, local61.anInt7945);
				this.aClass4_Sub3_38.method5285(local14);
				this.aClass4_Sub3_38.la(local22, local18 - (float) local56.anInt5851 * 1.5F);
				@Pc(230) int local230 = local61.anInt7948;
				OpenGL.glColor4ub((byte) (local230 >> 16), (byte) (local230 >> 8), (byte) local230, (byte) (local230 >> 24));
				this.aClass4_Sub3_38.method5238(local56.aShort68);
				this.aClass4_Sub3_38.method5225(local56.aByte73);
				this.aClass4_Sub3_38.method5230(local56.aByte72);
				this.aClass4_Sub3_38.method5236(4);
			}
		}
		this.aClass4_Sub3_38.la(local22, local18);
		this.aClass4_Sub3_38.method7214(true);
		this.aClass4_Sub3_38.method5247();
	}

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "(SS)V")
	@Override
	public void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface13 local9 = this.aClass4_Sub3_38.anInterface13_13;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7679; local11++) {
			if (arg0 == this.aShortArray129[local11]) {
				this.aShortArray129[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class296 local48 = local9.method5789(arg0 & 0xFFFF);
			local35 = local48.aByte103;
			local37 = local48.aByte99;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(68) Class296 local68 = local9.method5789(arg1 & 0xFFFF);
			local56 = local68.aByte103;
			local58 = local68.aByte99;
		}
		if (!(local35 != local56 | local37 != local58)) {
			return;
		}
		if (this.aClass186Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt7653; local97++) {
				@Pc(104) Class186 local104 = this.aClass186Array1[local97];
				@Pc(109) Class274 local109 = this.aClass274Array1[local97];
				local109.anInt7948 = Static107.anIntArray176[this.aShortArray137[local104.anInt5846] & 0xFFFF] & 0xFFFFFF | local109.anInt7948 & 0xFF000000;
			}
		}
		if (this.aClass258_14 != null) {
			this.aClass258_14.anInterface15_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7637; local7++) {
			if (arg0 != 128) {
				this.anIntArray720[local7] = this.anIntArray720[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray717[local7] = this.anIntArray717[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray721[local7] = this.anIntArray721[local7] * arg2 >> 7;
			}
		}
		this.aBoolean569 = false;
		if (this.aClass258_16 != null) {
			this.aClass258_16.anInterface15_6 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "MA", descriptor = "()V")
	@Override
	protected void MA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7666; local3++) {
			this.anIntArray720[local3] = this.anIntArray720[local3] + 7 >> 4;
			this.anIntArray717[local3] = this.anIntArray717[local3] + 7 >> 4;
			this.anIntArray721[local3] = this.anIntArray721[local3] + 7 >> 4;
		}
		if (this.aClass258_16 != null) {
			this.aClass258_16.anInterface15_6 = null;
		}
		this.aBoolean569 = false;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIIBI)Z")
	private boolean method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > arg1 && arg1 < arg7 && arg1 < arg2) {
			return false;
		} else if (arg1 > arg0 && arg1 > arg7 && arg2 < arg1) {
			return false;
		} else if (arg5 < arg6 && arg5 < arg4 && arg3 > arg5) {
			return false;
		} else {
			return arg6 >= arg5 || arg4 >= arg5 || arg5 <= arg3;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!m;Lclient!cf;I)V")
	@Override
	public void method6773(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class46_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7621 == 0) {
			return;
		}
		@Pc(16) Class128_Sub2 local16 = this.aClass4_Sub3_38.aClass128_Sub2_3;
		if (!this.aBoolean569) {
			this.method6787();
		}
		@Pc(25) Class128_Sub2 local25 = (Class128_Sub2) arg0;
		this.method6794(local25);
		Static124.aFloat48 = local16.aFloat96 + local16.aFloat91 * local25.aFloat94 + local25.aFloat93 * local16.aFloat92 + local25.aFloat96 * local16.aFloat99;
		Static301.aFloat131 = local25.aFloat90 * local16.aFloat91 + local16.aFloat92 * local25.aFloat98 + local25.aFloat91 * local16.aFloat99;
		@Pc(76) float local76 = Static124.aFloat48 + (float) this.aShort109 * Static301.aFloat131;
		@Pc(84) float local84 = Static124.aFloat48 + (float) this.aShort107 * Static301.aFloat131;
		@Pc(95) float local95;
		@Pc(101) float local101;
		if (local76 > local84) {
			local101 = local76 + (float) this.aShort104;
			local95 = (float) -this.aShort104 + local84;
		} else {
			local95 = (float) -this.aShort104 + local76;
			local101 = local84 + (float) this.aShort104;
		}
		if (local95 >= this.aClass4_Sub3_38.aFloat126 || (float) this.aClass4_Sub3_38.anInt5823 >= local101) {
			return;
		}
		Static313.aFloat132 = local16.aFloat100 * local25.aFloat98 + local25.aFloat90 * local16.aFloat98 + local16.aFloat95 * local25.aFloat91;
		Static207.aFloat85 = local25.aFloat94 * local16.aFloat98 + local25.aFloat93 * local16.aFloat100 + local16.aFloat95 * local25.aFloat96 + local16.aFloat93;
		@Pc(178) float local178 = Static207.aFloat85 + Static313.aFloat132 * (float) this.aShort109;
		@Pc(186) float local186 = Static207.aFloat85 + Static313.aFloat132 * (float) this.aShort107;
		@Pc(202) float local202;
		@Pc(213) float local213;
		if (local178 > local186) {
			local202 = (local186 - (float) this.aShort104) * (float) this.aClass4_Sub3_38.anInt5834;
			local213 = (float) this.aClass4_Sub3_38.anInt5834 * ((float) this.aShort104 + local178);
		} else {
			local202 = (float) this.aClass4_Sub3_38.anInt5834 * ((float) -this.aShort104 + local178);
			local213 = ((float) this.aShort104 + local186) * (float) this.aClass4_Sub3_38.anInt5834;
		}
		if (local202 / local101 >= this.aClass4_Sub3_38.aFloat115 || this.aClass4_Sub3_38.aFloat120 >= local213 / local101) {
			return;
		}
		Static256.aFloat105 = local25.aFloat96 * local16.aFloat97 + local16.aFloat89 * local25.aFloat93 + local25.aFloat94 * local16.aFloat90 + local16.aFloat94;
		Static26.aFloat8 = local16.aFloat97 * local25.aFloat91 + local25.aFloat90 * local16.aFloat90 + local25.aFloat98 * local16.aFloat89;
		@Pc(302) float local302 = Static256.aFloat105 + Static26.aFloat8 * (float) this.aShort109;
		@Pc(310) float local310 = Static256.aFloat105 + Static26.aFloat8 * (float) this.aShort107;
		@Pc(337) float local337;
		@Pc(325) float local325;
		if (local302 > local310) {
			local325 = (float) this.aClass4_Sub3_38.anInt5805 * (local302 + (float) this.aShort104);
			local337 = (float) this.aClass4_Sub3_38.anInt5805 * ((float) -this.aShort104 + local310);
		} else {
			local337 = (local302 - (float) this.aShort104) * (float) this.aClass4_Sub3_38.anInt5805;
			local325 = ((float) this.aShort104 + local310) * (float) this.aClass4_Sub3_38.anInt5805;
		}
		if (this.aClass4_Sub3_38.aFloat108 <= local337 / local101 || local325 / local101 <= this.aClass4_Sub3_38.aFloat111) {
			return;
		}
		if (arg1 != null || this.aClass186Array1 != null) {
			Static350.aFloat137 = local16.aFloat89 * local25.aFloat100 + local16.aFloat90 * local25.aFloat89 + local25.aFloat92 * local16.aFloat97;
			Static57.aFloat33 = local16.aFloat100 * local25.aFloat95 + local25.aFloat97 * local16.aFloat98 + local16.aFloat95 * local25.aFloat99;
			Static39.aFloat28 = local25.aFloat97 * local16.aFloat90 + local16.aFloat89 * local25.aFloat95 + local16.aFloat97 * local25.aFloat99;
			Static179.aFloat79 = local25.aFloat89 * local16.aFloat91 + local25.aFloat100 * local16.aFloat92 + local25.aFloat92 * local16.aFloat99;
			Static128.aFloat106 = local16.aFloat100 * local25.aFloat100 + local25.aFloat89 * local16.aFloat98 + local16.aFloat95 * local25.aFloat92;
			Static378.aFloat142 = local16.aFloat92 * local25.aFloat95 + local25.aFloat97 * local16.aFloat91 + local25.aFloat99 * local16.aFloat99;
		}
		if (arg1 != null) {
			@Pc(496) boolean local496 = false;
			@Pc(498) boolean local498 = true;
			@Pc(506) int local506 = this.aShort106 + this.aShort103 >> 1;
			@Pc(514) int local514 = this.aShort110 + this.aShort105 >> 1;
			@Pc(533) int local533 = (int) ((float) local514 * Static57.aFloat33 + Static313.aFloat132 * (float) this.aShort109 + Static207.aFloat85 + (float) local506 * Static128.aFloat106);
			@Pc(552) int local552 = (int) ((float) this.aShort109 * Static26.aFloat8 + Static350.aFloat137 * (float) local506 + Static256.aFloat105 + Static39.aFloat28 * (float) local514);
			@Pc(571) int local571 = (int) (Static124.aFloat48 + (float) local506 * Static179.aFloat79 + Static301.aFloat131 * (float) this.aShort109 + (float) local514 * Static378.aFloat142);
			if (this.aClass4_Sub3_38.anInt5823 > local571) {
				local496 = true;
			} else {
				arg1.anInt1433 = local533 * this.aClass4_Sub3_38.anInt5834 / local571 + this.aClass4_Sub3_38.anInt5822;
				arg1.anInt1435 = local552 * this.aClass4_Sub3_38.anInt5805 / local571 + this.aClass4_Sub3_38.anInt5811;
			}
			@Pc(629) int local629 = (int) (Static57.aFloat33 * (float) local514 + (float) this.aShort107 * Static313.aFloat132 + Static128.aFloat106 * (float) local506 + Static207.aFloat85);
			@Pc(648) int local648 = (int) ((float) local514 * Static39.aFloat28 + Static256.aFloat105 + (float) local506 * Static350.aFloat137 + Static26.aFloat8 * (float) this.aShort107);
			@Pc(667) int local667 = (int) (Static301.aFloat131 * (float) this.aShort107 + Static124.aFloat48 + Static179.aFloat79 * (float) local506 + Static378.aFloat142 * (float) local514);
			if (this.aClass4_Sub3_38.anInt5823 > local667) {
				local496 = true;
			} else {
				arg1.anInt1437 = this.aClass4_Sub3_38.anInt5822 + this.aClass4_Sub3_38.anInt5834 * local629 / local667;
				arg1.anInt1434 = this.aClass4_Sub3_38.anInt5805 * local648 / local667 + this.aClass4_Sub3_38.anInt5811;
			}
			if (local496) {
				if (local571 < this.aClass4_Sub3_38.anInt5823 && local667 < this.aClass4_Sub3_38.anInt5823) {
					local498 = false;
				} else {
					@Pc(742) int local742;
					@Pc(754) int local754;
					@Pc(780) int local780;
					if (local571 < this.aClass4_Sub3_38.anInt5823) {
						local742 = (local667 - this.aClass4_Sub3_38.anInt5823 << 16) / (local667 - local571);
						local754 = local629 + (local742 * (local629 - local533) >> 16);
						arg1.anInt1433 = local754 * this.aClass4_Sub3_38.anInt5834 / this.aClass4_Sub3_38.anInt5823 + this.aClass4_Sub3_38.anInt5822;
						local780 = local648 + (local742 * (local648 - local552) >> 16);
						arg1.anInt1435 = this.aClass4_Sub3_38.anInt5811 + this.aClass4_Sub3_38.anInt5805 * local780 / this.aClass4_Sub3_38.anInt5823;
					} else if (local667 < this.aClass4_Sub3_38.anInt5823) {
						local742 = (local571 - this.aClass4_Sub3_38.anInt5823 << 16) / (local571 - local667);
						local754 = ((local533 - local629) * local742 >> 16) + local533;
						local780 = local552 + ((local552 - local648) * local742 >> 16);
						arg1.anInt1433 = this.aClass4_Sub3_38.anInt5822 + this.aClass4_Sub3_38.anInt5834 * local754 / this.aClass4_Sub3_38.anInt5823;
						arg1.anInt1435 = this.aClass4_Sub3_38.anInt5805 * local780 / this.aClass4_Sub3_38.anInt5823 + this.aClass4_Sub3_38.anInt5811;
					}
				}
			}
			if (local498) {
				if (local667 < local571) {
					arg1.anInt1436 = this.aClass4_Sub3_38.anInt5822 + (this.aShort104 + local533) * this.aClass4_Sub3_38.anInt5834 / local571 - arg1.anInt1433;
				} else {
					arg1.anInt1436 = this.aClass4_Sub3_38.anInt5822 + this.aClass4_Sub3_38.anInt5834 * (this.aShort104 + local629) / local667 - arg1.anInt1437;
				}
				arg1.aBoolean109 = true;
			}
		}
		this.aClass4_Sub3_38.method5254();
		this.aClass4_Sub3_38.method5257(local25);
		this.method6800();
		this.aClass4_Sub3_38.method5247();
		this.method6790();
	}

	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		if (!this.aBoolean569) {
			this.method6787();
		}
		return this.aShort105;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	@Override
	public void b(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200_Sub1.lb[arg0];
		@Pc(13) int local13 = Class200_Sub1.anIntArray576[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7637; local15++) {
			@Pc(33) int local33 = this.anIntArray717[local15] * local9 + this.anIntArray720[local15] * local13 >> 15;
			this.anIntArray717[local15] = local13 * this.anIntArray717[local15] - this.anIntArray720[local15] * local9 >> 15;
			this.anIntArray720[local15] = local33;
		}
		if (this.aClass258_16 != null) {
			this.aClass258_16.anInterface15_6 = null;
		}
		this.aBoolean569 = false;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()[Lclient!fr;")
	@Override
	public Class106[] method6767() {
		return this.aClass106Array7;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!kc;B)V")
	private void method6794(@OriginalArg(0) Class128_Sub2 arg0) {
		@Pc(12) int local12;
		if (this.aClass68Array7 != null) {
			for (local12 = 0; local12 < this.aClass68Array7.length; local12++) {
				@Pc(19) Class68 local19 = this.aClass68Array7[local12];
				@Pc(21) Class68 local21 = local19;
				if (local19.aClass68_1 != null) {
					local21 = local19.aClass68_1;
				}
				local21.anInt1946 = (int) ((float) this.anIntArray720[local19.anInt1933] * arg0.aFloat100 + arg0.aFloat98 * (float) this.anIntArray717[local19.anInt1933] + arg0.aFloat95 * (float) this.anIntArray721[local19.anInt1933] + arg0.aFloat93);
				local21.anInt1940 = (int) (arg0.aFloat90 * (float) this.anIntArray717[local19.anInt1933] + arg0.aFloat89 * (float) this.anIntArray720[local19.anInt1933] + arg0.aFloat97 * (float) this.anIntArray721[local19.anInt1933] + arg0.aFloat94);
				local21.anInt1935 = (int) (arg0.aFloat96 + (float) this.anIntArray721[local19.anInt1933] * arg0.aFloat99 + (float) this.anIntArray717[local19.anInt1933] * arg0.aFloat91 + arg0.aFloat92 * (float) this.anIntArray720[local19.anInt1933]);
				local21.anInt1939 = (int) (arg0.aFloat100 * (float) this.anIntArray720[local19.anInt1944] + arg0.aFloat98 * (float) this.anIntArray717[local19.anInt1944] + arg0.aFloat95 * (float) this.anIntArray721[local19.anInt1944] + arg0.aFloat93);
				local21.anInt1934 = (int) (arg0.aFloat89 * (float) this.anIntArray720[local19.anInt1944] + arg0.aFloat90 * (float) this.anIntArray717[local19.anInt1944] + arg0.aFloat97 * (float) this.anIntArray721[local19.anInt1944] + arg0.aFloat94);
				local21.anInt1943 = (int) (arg0.aFloat96 + arg0.aFloat91 * (float) this.anIntArray717[local19.anInt1944] + (float) this.anIntArray720[local19.anInt1944] * arg0.aFloat92 + (float) this.anIntArray721[local19.anInt1944] * arg0.aFloat99);
				local21.anInt1941 = (int) (arg0.aFloat98 * (float) this.anIntArray717[local19.anInt1938] + (float) this.anIntArray720[local19.anInt1938] * arg0.aFloat100 + arg0.aFloat95 * (float) this.anIntArray721[local19.anInt1938] + arg0.aFloat93);
				local21.anInt1947 = (int) (arg0.aFloat94 + (float) this.anIntArray721[local19.anInt1938] * arg0.aFloat97 + (float) this.anIntArray720[local19.anInt1938] * arg0.aFloat89 + arg0.aFloat90 * (float) this.anIntArray717[local19.anInt1938]);
				local21.anInt1936 = (int) (arg0.aFloat96 + (float) this.anIntArray721[local19.anInt1938] * arg0.aFloat99 + arg0.aFloat91 * (float) this.anIntArray717[local19.anInt1938] + (float) this.anIntArray720[local19.anInt1938] * arg0.aFloat92);
			}
		}
		if (this.aClass106Array7 == null) {
			return;
		}
		for (local12 = 0; local12 < this.aClass106Array7.length; local12++) {
			@Pc(368) Class106 local368 = this.aClass106Array7[local12];
			@Pc(370) Class106 local370 = local368;
			if (local368.aClass106_1 != null) {
				local370 = local368.aClass106_1;
			}
			if (local368.aClass128_3 == null) {
				local368.aClass128_3 = arg0.method6887();
			} else {
				local368.aClass128_3.EA(arg0);
			}
			local370.anInt2800 = (int) (arg0.aFloat93 + arg0.aFloat95 * (float) this.anIntArray721[local368.anInt2810] + (float) this.anIntArray717[local368.anInt2810] * arg0.aFloat98 + (float) this.anIntArray720[local368.anInt2810] * arg0.aFloat100);
			local370.anInt2801 = (int) ((float) this.anIntArray720[local368.anInt2810] * arg0.aFloat89 + arg0.aFloat90 * (float) this.anIntArray717[local368.anInt2810] + arg0.aFloat97 * (float) this.anIntArray721[local368.anInt2810] + arg0.aFloat94);
			local370.anInt2809 = (int) (arg0.aFloat96 + arg0.aFloat99 * (float) this.anIntArray721[local368.anInt2810] + (float) this.anIntArray720[local368.anInt2810] * arg0.aFloat92 + (float) this.anIntArray717[local368.anInt2810] * arg0.aFloat91);
		}
	}

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "()I")
	@Override
	public int M() {
		return this.aShort111;
	}

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "()V")
	@Override
	public void X() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7637; local3++) {
			this.anIntArray721[local3] = -this.anIntArray721[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt7621; local25++) {
			this.aShortArray132[local25] = (short) -this.aShortArray132[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt7679; local44++) {
			@Pc(51) short local51 = this.aShortArray134[local44];
			this.aShortArray134[local44] = this.aShortArray130[local44];
			this.aShortArray130[local44] = local51;
		}
		if (this.aClass258_15 == null && this.aClass258_14 != null) {
			this.aClass258_14.anInterface15_6 = null;
		}
		if (this.aClass258_15 != null) {
			this.aClass258_15.anInterface15_6 = null;
		}
		if (this.aClass258_16 != null) {
			this.aClass258_16.anInterface15_6 = null;
		}
		if (this.aClass272_1 != null) {
			this.aClass272_1.anInterface20_5 = null;
		}
		this.aBoolean569 = false;
	}

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "(IIII)V")
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static184.anInt3827 = 0;
			Static403.anInt7100 = 0;
			Static249.anInt4797 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt7637; local17++) {
				Static249.anInt4797 += this.anIntArray720[local17];
				Static184.anInt3827 += this.anIntArray717[local17];
				local15++;
				Static403.anInt7100 += this.anIntArray721[local17];
			}
			if (local15 > 0) {
				Static249.anInt4797 = Static249.anInt4797 / local15 + arg1;
				Static184.anInt3827 = arg2 + Static184.anInt3827 / local15;
				Static403.anInt7100 = Static403.anInt7100 / local15 + arg3;
			} else {
				Static403.anInt7100 = arg3;
				Static249.anInt4797 = arg1;
				Static184.anInt3827 = arg2;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt7637; local15++) {
				this.anIntArray720[local15] += arg1;
				this.anIntArray717[local15] += arg2;
				this.anIntArray721[local15] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt7637; local15++) {
					this.anIntArray720[local15] -= Static249.anInt4797;
					this.anIntArray717[local15] -= Static184.anInt3827;
					this.anIntArray721[local15] -= Static403.anInt7100;
					if (arg3 != 0) {
						local17 = Class200_Sub1.lb[arg3];
						local164 = Class200_Sub1.anIntArray576[arg3];
						local182 = this.anIntArray720[local15] * local164 + this.anIntArray717[local15] * local17 + 32767 >> 15;
						this.anIntArray717[local15] = this.anIntArray717[local15] * local164 + 32767 - this.anIntArray720[local15] * local17 >> 15;
						this.anIntArray720[local15] = local182;
					}
					if (arg1 != 0) {
						local17 = Class200_Sub1.lb[arg1];
						local164 = Class200_Sub1.anIntArray576[arg1];
						local182 = this.anIntArray717[local15] * local164 + 32767 - this.anIntArray721[local15] * local17 >> 15;
						this.anIntArray721[local15] = local164 * this.anIntArray721[local15] + this.anIntArray717[local15] * local17 + 32767 >> 15;
						this.anIntArray717[local15] = local182;
					}
					if (arg2 != 0) {
						local17 = Class200_Sub1.lb[arg2];
						local164 = Class200_Sub1.anIntArray576[arg2];
						local182 = this.anIntArray721[local15] * local17 + local164 * this.anIntArray720[local15] + 32767 >> 15;
						this.anIntArray721[local15] = this.anIntArray721[local15] * local164 + 32767 - local17 * this.anIntArray720[local15] >> 15;
						this.anIntArray720[local15] = local182;
					}
					this.anIntArray720[local15] += Static249.anInt4797;
					this.anIntArray717[local15] += Static184.anInt3827;
					this.anIntArray721[local15] += Static403.anInt7100;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt7637; local15++) {
					this.anIntArray720[local15] -= Static249.anInt4797;
					this.anIntArray717[local15] -= Static184.anInt3827;
					this.anIntArray721[local15] -= Static403.anInt7100;
					this.anIntArray720[local15] = this.anIntArray720[local15] * arg1 / 128;
					this.anIntArray717[local15] = this.anIntArray717[local15] * arg2 / 128;
					this.anIntArray721[local15] = arg3 * this.anIntArray721[local15] / 128;
					this.anIntArray720[local15] += Static249.anInt4797;
					this.anIntArray717[local15] += Static184.anInt3827;
					this.anIntArray721[local15] += Static403.anInt7100;
				}
			} else {
				@Pc(514) Class186 local514;
				@Pc(519) Class274 local519;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt7679; local15++) {
						local17 = arg1 * 8 + (this.aByteArray102[local15] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray102[local15] = (byte) local17;
					}
					if (this.aClass258_14 != null) {
						this.aClass258_14.anInterface15_6 = null;
					}
					if (this.aClass186Array1 != null) {
						for (local17 = 0; local17 < this.anInt7653; local17++) {
							local514 = this.aClass186Array1[local17];
							local519 = this.aClass274Array1[local17];
							local519.anInt7948 = local519.anInt7948 & 0xFFFFFF | 255 - (this.aByteArray102[local514.anInt5846] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt7679; local15++) {
						local17 = this.aShortArray137[local15] & 0xFFFF;
						local164 = local17 >> 10 & 0x3F;
						local182 = local17 >> 7 & 0x7;
						@Pc(574) int local574 = local17 & 0x7F;
						local182 += arg2 / 4;
						@Pc(587) int local587 = local164 + arg1 & 0x3F;
						local574 += arg3;
						if (local182 < 0) {
							local182 = 0;
						} else if (local182 > 7) {
							local182 = 7;
						}
						if (local574 < 0) {
							local574 = 0;
						} else if (local574 > 127) {
							local574 = 127;
						}
						this.aShortArray137[local15] = (short) (local574 | local587 << 10 | local182 << 7);
					}
					if (this.aClass258_14 != null) {
						this.aClass258_14.anInterface15_6 = null;
					}
					if (this.aClass186Array1 != null) {
						for (local17 = 0; local17 < this.anInt7653; local17++) {
							local514 = this.aClass186Array1[local17];
							local519 = this.aClass274Array1[local17];
							local519.anInt7948 = local519.anInt7948 & 0xFF000000 | Static107.anIntArray176[this.aShortArray137[local514.anInt5846] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(699) Class274 local699;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt7653; local15++) {
							local699 = this.aClass274Array1[local15];
							local699.anInt7944 += arg1;
							local699.anInt7950 += arg2;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt7653; local15++) {
							local699 = this.aClass274Array1[local15];
							local699.anInt7949 = arg1 * local699.anInt7949 >> 7;
							local699.anInt7943 = local699.anInt7943 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt7653; local15++) {
							local699 = this.aClass274Array1[local15];
							local699.anInt7945 = local699.anInt7945 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt7679; local7++) {
			local16 = this.aShortArray137[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			@Pc(47) int local47 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local47 += (arg2 - local47) * arg3 >> 7;
			}
			this.aShortArray137[local7] = (short) (local28 << 7 | local22 << 10 | local47);
		}
		if (this.aClass186Array1 != null) {
			for (local16 = 0; local16 < this.anInt7653; local16++) {
				@Pc(108) Class186 local108 = this.aClass186Array1[local16];
				@Pc(113) Class274 local113 = this.aClass274Array1[local16];
				local113.anInt7948 = local113.anInt7948 & 0xFF000000 | Static107.anIntArray176[this.aShortArray137[local108.anInt5846] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass258_14 != null) {
			this.aClass258_14.anInterface15_6 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "()I")
	@Override
	public int n() {
		if (!this.aBoolean569) {
			this.method6787();
		}
		return this.aShort107;
	}

	@OriginalMember(owner = "client!sb", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		if (!this.aBoolean569) {
			this.method6787();
		}
		return this.aShort103;
	}

	@OriginalMember(owner = "client!sb", name = "ea", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
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
			Static249.anInt4797 = 0;
			Static403.anInt7100 = 0;
			Static184.anInt3827 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray105.length) {
					local51 = this.anIntArrayArray105[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static249.anInt4797 += this.anIntArray720[local59];
						Static184.anInt3827 += this.anIntArray717[local59];
						local33++;
						Static403.anInt7100 += this.anIntArray721[local59];
					}
				}
			}
			if (local33 > 0) {
				Static249.anInt4797 = Static249.anInt4797 / local33 + local25;
				Static184.anInt3827 = Static184.anInt3827 / local33 + local17;
				Static403.anInt7100 = local21 + Static403.anInt7100 / local33;
			} else {
				Static184.anInt3827 = local17;
				Static249.anInt4797 = local25;
				Static403.anInt7100 = local21;
			}
			return;
		}
		@Pc(166) int[] local166;
		@Pc(168) int local168;
		if (arg0 == 1) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray105.length) {
					local166 = this.anIntArrayArray105[local35];
					for (local168 = 0; local168 < local166.length; local168++) {
						local53 = local166[local168];
						this.anIntArray720[local53] += local25;
						this.anIntArray717[local53] += local17;
						this.anIntArray721[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(279) int local279;
		@Pc(297) int local297;
		@Pc(754) int local754;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray105.length > local35) {
					local166 = this.anIntArrayArray105[local35];
					if ((arg5 & 0x1) == 0) {
						for (local168 = 0; local168 < local166.length; local168++) {
							local53 = local166[local168];
							this.anIntArray720[local53] -= Static249.anInt4797;
							this.anIntArray717[local53] -= Static184.anInt3827;
							this.anIntArray721[local53] -= Static403.anInt7100;
							if (arg4 != 0) {
								local59 = Class200_Sub1.lb[arg4];
								local279 = Class200_Sub1.anIntArray576[arg4];
								local297 = this.anIntArray717[local53] * local59 + local279 * this.anIntArray720[local53] + 32767 >> 15;
								this.anIntArray717[local53] = this.anIntArray717[local53] * local279 + 32767 - local59 * this.anIntArray720[local53] >> 15;
								this.anIntArray720[local53] = local297;
							}
							if (arg2 != 0) {
								local59 = Class200_Sub1.lb[arg2];
								local279 = Class200_Sub1.anIntArray576[arg2];
								local297 = local279 * this.anIntArray717[local53] + 32767 - local59 * this.anIntArray721[local53] >> 15;
								this.anIntArray721[local53] = local59 * this.anIntArray717[local53] + this.anIntArray721[local53] * local279 + 32767 >> 15;
								this.anIntArray717[local53] = local297;
							}
							if (arg3 != 0) {
								local59 = Class200_Sub1.lb[arg3];
								local279 = Class200_Sub1.anIntArray576[arg3];
								local297 = local279 * this.anIntArray720[local53] + this.anIntArray721[local53] * local59 + 32767 >> 15;
								this.anIntArray721[local53] = this.anIntArray721[local53] * local279 + 32767 - this.anIntArray720[local53] * local59 >> 15;
								this.anIntArray720[local53] = local297;
							}
							this.anIntArray720[local53] += Static249.anInt4797;
							this.anIntArray717[local53] += Static184.anInt3827;
							this.anIntArray721[local53] += Static403.anInt7100;
						}
					} else {
						for (local168 = 0; local168 < local166.length; local168++) {
							local53 = local166[local168];
							this.anIntArray720[local53] -= Static249.anInt4797;
							this.anIntArray717[local53] -= Static184.anInt3827;
							this.anIntArray721[local53] -= Static403.anInt7100;
							if (arg2 != 0) {
								local59 = Class200_Sub1.lb[arg2];
								local279 = Class200_Sub1.anIntArray576[arg2];
								local297 = local279 * this.anIntArray717[local53] + 32767 - local59 * this.anIntArray721[local53] >> 15;
								this.anIntArray721[local53] = local59 * this.anIntArray717[local53] + this.anIntArray721[local53] * local279 + 32767 >> 15;
								this.anIntArray717[local53] = local297;
							}
							if (arg4 != 0) {
								local59 = Class200_Sub1.lb[arg4];
								local279 = Class200_Sub1.anIntArray576[arg4];
								local297 = local59 * this.anIntArray717[local53] + this.anIntArray720[local53] * local279 + 32767 >> 15;
								this.anIntArray717[local53] = local279 * this.anIntArray717[local53] + 32767 - this.anIntArray720[local53] * local59 >> 15;
								this.anIntArray720[local53] = local297;
							}
							if (arg3 != 0) {
								local59 = Class200_Sub1.lb[arg3];
								local279 = Class200_Sub1.anIntArray576[arg3];
								local297 = local59 * this.anIntArray721[local53] + local279 * this.anIntArray720[local53] + 32767 >> 15;
								this.anIntArray721[local53] = local279 * this.anIntArray721[local53] + 32767 - this.anIntArray720[local53] * local59 >> 15;
								this.anIntArray720[local53] = local297;
							}
							this.anIntArray720[local53] += Static249.anInt4797;
							this.anIntArray717[local53] += Static184.anInt3827;
							this.anIntArray721[local53] += Static403.anInt7100;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray105.length) {
						local51 = this.anIntArrayArray105[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local279 = this.anIntArray719[local59];
							local297 = this.anIntArray719[local59 + 1];
							for (local754 = local279; local754 < local297; local754++) {
								@Pc(763) int local763 = this.aShortArray139[local754] - 1;
								if (local763 == -1) {
									break;
								}
								@Pc(775) int local775;
								@Pc(779) int local779;
								@Pc(798) int local798;
								if (arg4 != 0) {
									local775 = Class200_Sub1.lb[arg4];
									local779 = Class200_Sub1.anIntArray576[arg4];
									local798 = this.aShortArray131[local763] * local775 + this.aShortArray133[local763] * local779 + 32767 >> 15;
									this.aShortArray131[local763] = (short) (local779 * this.aShortArray131[local763] + 32767 - this.aShortArray133[local763] * local775 >> 15);
									this.aShortArray133[local763] = (short) local798;
								}
								if (arg2 != 0) {
									local775 = Class200_Sub1.lb[arg2];
									local779 = Class200_Sub1.anIntArray576[arg2];
									local798 = this.aShortArray131[local763] * local779 + 32767 - local775 * this.aShortArray132[local763] >> 15;
									this.aShortArray132[local763] = (short) (local775 * this.aShortArray131[local763] + this.aShortArray132[local763] * local779 + 32767 >> 15);
									this.aShortArray131[local763] = (short) local798;
								}
								if (arg3 != 0) {
									local775 = Class200_Sub1.lb[arg3];
									local779 = Class200_Sub1.anIntArray576[arg3];
									local798 = local775 * this.aShortArray132[local763] + this.aShortArray133[local763] * local779 + 32767 >> 15;
									this.aShortArray132[local763] = (short) (local779 * this.aShortArray132[local763] + 32767 - local775 * this.aShortArray133[local763] >> 15);
									this.aShortArray133[local763] = (short) local798;
								}
							}
						}
					}
				}
				if (this.aClass258_15 == null && this.aClass258_14 != null) {
					this.aClass258_14.anInterface15_6 = null;
				}
				if (this.aClass258_15 != null) {
					this.aClass258_15.anInterface15_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray105.length > local35) {
					local166 = this.anIntArrayArray105[local35];
					for (local168 = 0; local168 < local166.length; local168++) {
						local53 = local166[local168];
						this.anIntArray720[local53] -= Static249.anInt4797;
						this.anIntArray717[local53] -= Static184.anInt3827;
						this.anIntArray721[local53] -= Static403.anInt7100;
						this.anIntArray720[local53] = this.anIntArray720[local53] * arg2 >> 7;
						this.anIntArray717[local53] = arg3 * this.anIntArray717[local53] >> 7;
						this.anIntArray721[local53] = this.anIntArray721[local53] * arg4 >> 7;
						this.anIntArray720[local53] += Static249.anInt4797;
						this.anIntArray717[local53] += Static184.anInt3827;
						this.anIntArray721[local53] += Static403.anInt7100;
					}
				}
			}
		} else {
			@Pc(1200) Class186 local1200;
			@Pc(1205) Class274 local1205;
			if (arg0 == 5) {
				if (this.anIntArrayArray103 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray103.length > local35) {
							local166 = this.anIntArrayArray103[local35];
							for (local168 = 0; local168 < local166.length; local168++) {
								local53 = local166[local168];
								local59 = (this.aByteArray102[local53] & 0xFF) + (arg2 * 8);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray102[local53] = (byte) local59;
							}
							if (local166.length > 0 && this.aClass258_14 != null) {
								this.aClass258_14.anInterface15_6 = null;
							}
						}
					}
					if (this.aClass186Array1 != null) {
						for (local35 = 0; local35 < this.anInt7653; local35++) {
							local1200 = this.aClass186Array1[local35];
							local1205 = this.aClass274Array1[local35];
							local1205.anInt7948 = local1205.anInt7948 & 0xFFFFFF | 255 - (this.aByteArray102[local1200.anInt5846] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1451) Class274 local1451;
				if (arg0 == 8) {
					if (this.anIntArrayArray104 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (local35 < this.anIntArrayArray104.length) {
								local166 = this.anIntArrayArray104[local35];
								for (local168 = 0; local168 < local166.length; local168++) {
									local1451 = this.aClass274Array1[local166[local168]];
									local1451.anInt7950 += arg3;
									local1451.anInt7944 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray104 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (this.anIntArrayArray104.length > local35) {
								local166 = this.anIntArrayArray104[local35];
								for (local168 = 0; local168 < local166.length; local168++) {
									local1451 = this.aClass274Array1[local166[local168]];
									local1451.anInt7949 = arg2 * local1451.anInt7949 >> 7;
									local1451.anInt7943 = arg3 * local1451.anInt7943 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray104 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray104.length > local35) {
							local166 = this.anIntArrayArray104[local35];
							for (local168 = 0; local168 < local166.length; local168++) {
								local1451 = this.aClass274Array1[local166[local168]];
								local1451.anInt7945 = local1451.anInt7945 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray103 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray103.length > local35) {
						local166 = this.anIntArrayArray103[local35];
						for (local168 = 0; local168 < local166.length; local168++) {
							local53 = local166[local168];
							local59 = this.aShortArray137[local53] & 0xFFFF;
							local279 = local59 >> 10 & 0x3F;
							local297 = local59 >> 7 & 0x7;
							@Pc(1286) int local1286 = arg2 + local279 & 0x3F;
							local754 = local59 & 0x7F;
							local297 += arg3 / 4;
							if (local297 < 0) {
								local297 = 0;
							} else if (local297 > 7) {
								local297 = 7;
							}
							local754 += arg4;
							if (local754 < 0) {
								local754 = 0;
							} else if (local754 > 127) {
								local754 = 127;
							}
							this.aShortArray137[local53] = (short) (local754 | local1286 << 10 | local297 << 7);
						}
						if (local166.length > 0 && this.aClass258_14 != null) {
							this.aClass258_14.anInterface15_6 = null;
						}
					}
				}
				if (this.aClass186Array1 != null) {
					for (local35 = 0; local35 < this.anInt7653; local35++) {
						local1200 = this.aClass186Array1[local35];
						local1205 = this.aClass274Array1[local35];
						local1205.anInt7948 = local1205.anInt7948 & 0xFF000000 | Static107.anIntArray176[this.aShortArray137[local1200.anInt5846] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	@Override
	public Class1_Sub2_Sub2 EA(@OriginalArg(0) Class1_Sub2_Sub2 arg0) {
		if (this.anInt7621 == 0) {
			return null;
		}
		if (!this.aBoolean569) {
			this.method6787();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass4_Sub3_38.anInt5820 > 0) {
			local43 = this.aShort103 - (this.aShort107 * this.aClass4_Sub3_38.anInt5820 >> 8) >> this.aClass4_Sub3_38.anInt5795;
			local60 = this.aShort106 - (this.aShort109 * this.aClass4_Sub3_38.anInt5820 >> 8) >> this.aClass4_Sub3_38.anInt5795;
		} else {
			local43 = this.aShort103 - (this.aClass4_Sub3_38.anInt5820 * this.aShort109 >> 8) >> this.aClass4_Sub3_38.anInt5795;
			local60 = this.aShort106 - (this.aShort107 * this.aClass4_Sub3_38.anInt5820 >> 8) >> this.aClass4_Sub3_38.anInt5795;
		}
		@Pc(117) int local117;
		@Pc(134) int local134;
		if (this.aClass4_Sub3_38.anInt5815 > 0) {
			local117 = this.aShort105 - (this.aClass4_Sub3_38.anInt5815 * this.aShort107 >> 8) >> this.aClass4_Sub3_38.anInt5795;
			local134 = this.aShort110 - (this.aShort109 * this.aClass4_Sub3_38.anInt5815 >> 8) >> this.aClass4_Sub3_38.anInt5795;
		} else {
			local117 = this.aShort105 - (this.aClass4_Sub3_38.anInt5815 * this.aShort109 >> 8) >> this.aClass4_Sub3_38.anInt5795;
			local134 = this.aShort110 - (this.aClass4_Sub3_38.anInt5815 * this.aShort107 >> 8) >> this.aClass4_Sub3_38.anInt5795;
		}
		@Pc(174) int local174 = local60 + 1 - local43;
		@Pc(181) int local181 = local134 + 1 - local117;
		@Pc(184) Class1_Sub2_Sub2_Sub2 local184 = (Class1_Sub2_Sub2_Sub2) arg0;
		@Pc(200) Class1_Sub2_Sub2_Sub2 local200;
		if (local184 != null && local184.method6202(local181, local174)) {
			local200 = local184;
			local184.method6200();
		} else {
			local200 = new Class1_Sub2_Sub2_Sub2(this.aClass4_Sub3_38, local174, local181);
		}
		local200.method6205(local43, local117, local134, local60);
		this.method6795(local200);
		return local200;
	}

	@OriginalMember(owner = "client!sb", name = "sa", descriptor = "()Z")
	@Override
	protected boolean sa() {
		if (this.anIntArrayArray105 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7666; local12++) {
			this.anIntArray720[local12] <<= 0x4;
			this.anIntArray717[local12] <<= 0x4;
			this.anIntArray721[local12] <<= 0x4;
		}
		Static403.anInt7100 = 0;
		Static249.anInt4797 = 0;
		Static184.anInt3827 = 0;
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!qba;I)V")
	private void method6795(@OriginalArg(0) Class1_Sub2_Sub2_Sub2 arg0) {
		if (this.anInt7621 > this.aClass4_Sub3_38.anIntArray454.length) {
			this.aClass4_Sub3_38.anIntArray454 = new int[this.anInt7621];
			this.aClass4_Sub3_38.anIntArray452 = new int[this.anInt7621];
		}
		@Pc(28) int[] local28 = this.aClass4_Sub3_38.anIntArray454;
		@Pc(32) int[] local32 = this.aClass4_Sub3_38.anIntArray452;
		@Pc(63) int local63;
		@Pc(102) int local102;
		@Pc(111) int local111;
		for (@Pc(38) int local38 = 0; local38 < this.anInt7637; local38++) {
			local63 = (this.anIntArray720[local38] - (this.aClass4_Sub3_38.anInt5820 * this.anIntArray717[local38] >> 8) >> this.aClass4_Sub3_38.anInt5795) - arg0.anInt6880;
			@Pc(88) int local88 = (this.anIntArray721[local38] - (this.aClass4_Sub3_38.anInt5815 * this.anIntArray717[local38] >> 8) >> this.aClass4_Sub3_38.anInt5795) - arg0.anInt6882;
			@Pc(93) int local93 = this.anIntArray719[local38];
			@Pc(100) int local100 = this.anIntArray719[local38 + 1];
			for (local102 = local93; local102 < local100; local102++) {
				local111 = this.aShortArray139[local102] - 1;
				if (local111 == -1) {
					break;
				}
				local28[local111] = local63;
				local32[local111] = local88;
			}
		}
		for (local63 = 0; local63 < this.anInt7625; local63++) {
			if (this.aByteArray102 == null || this.aByteArray102[local63] <= 128) {
				@Pc(159) short local159 = this.aShortArray134[local63];
				@Pc(164) short local164 = this.aShortArray135[local63];
				@Pc(169) short local169 = this.aShortArray130[local63];
				local102 = local28[local159];
				local111 = local28[local164];
				@Pc(181) int local181 = local28[local169];
				@Pc(185) int local185 = local32[local159];
				@Pc(189) int local189 = local32[local164];
				@Pc(193) int local193 = local32[local169];
				if ((local102 - local111) * (local189 - local193) - (local181 - local111) * (local189 - local185) > 0) {
					arg0.method6203(local189, local193, local102, local181, local185, local111);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "()Z")
	@Override
	public boolean method6784() {
		if (this.aShortArray129 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray129.length; local12++) {
			if (this.aShortArray129[local12] != -1 && !this.aClass4_Sub3_38.anInterface13_13.method5788(this.aShortArray129[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "()[Lclient!dl;")
	@Override
	public Class68[] method6782() {
		return this.aClass68Array7;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZLclient!sb;Lclient!sb;IZ)Lclient!r;")
	private Class97 method6796(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class97_Sub3 arg1, @OriginalArg(3) Class97_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		arg1.aShort111 = this.aShort111;
		arg1.anInt7666 = this.anInt7666;
		arg1.anInt7653 = this.anInt7653;
		arg1.anInt7637 = this.anInt7637;
		arg1.aShort108 = this.aShort108;
		arg1.anInt7677 = this.anInt7677;
		arg1.aByte87 = 0;
		arg1.anInt7623 = arg3;
		arg1.anInt7625 = this.anInt7625;
		arg1.anInt7679 = this.anInt7679;
		arg1.anInt7621 = this.anInt7621;
		@Pc(58) boolean local58 = Static135.method8180(arg3, this.anInt7677);
		@Pc(64) boolean local64 = Static514.method7863(this.anInt7677, arg3);
		@Pc(70) boolean local70 = Static340.method5717(arg3, this.anInt7677);
		@Pc(76) boolean local76 = local64 | local58 | local70;
		@Pc(195) int local195;
		if (local76) {
			if (!local58) {
				arg1.anIntArray720 = this.anIntArray720;
			} else if (arg2.anIntArray720 == null || arg2.anIntArray720.length < this.anInt7666) {
				arg1.anIntArray720 = arg2.anIntArray720 = new int[this.anInt7666];
			} else {
				arg1.anIntArray720 = arg2.anIntArray720;
			}
			if (!local64) {
				arg1.anIntArray717 = this.anIntArray717;
			} else if (arg2.anIntArray717 == null || arg2.anIntArray717.length < this.anInt7666) {
				arg1.anIntArray717 = arg2.anIntArray717 = new int[this.anInt7666];
			} else {
				arg1.anIntArray717 = arg2.anIntArray717;
			}
			if (!local70) {
				arg1.anIntArray721 = this.anIntArray721;
			} else if (arg2.anIntArray721 == null || this.anInt7666 > arg2.anIntArray721.length) {
				arg1.anIntArray721 = arg2.anIntArray721 = new int[this.anInt7666];
			} else {
				arg1.anIntArray721 = arg2.anIntArray721;
			}
			for (local195 = 0; local195 < this.anInt7666; local195++) {
				if (local58) {
					arg1.anIntArray720[local195] = this.anIntArray720[local195];
				}
				if (local64) {
					arg1.anIntArray717[local195] = this.anIntArray717[local195];
				}
				if (local70) {
					arg1.anIntArray721[local195] = this.anIntArray721[local195];
				}
			}
		} else {
			arg1.anIntArray717 = this.anIntArray717;
			arg1.anIntArray720 = this.anIntArray720;
			arg1.anIntArray721 = this.anIntArray721;
		}
		if (Static319.method5470(arg3, this.anInt7677)) {
			if (arg0) {
				arg1.aByte87 = (byte) (arg1.aByte87 | 0x1);
			}
			arg1.aClass258_16 = arg2.aClass258_16;
			arg1.aClass258_16.aByte85 = this.aClass258_16.aByte85;
			arg1.aClass258_16.anInterface15_6 = this.aClass258_16.anInterface15_6;
		} else if (Static81.method1805(this.anInt7677, arg3)) {
			arg1.aClass258_16 = this.aClass258_16;
		} else {
			arg1.aClass258_16 = null;
		}
		if (Static516.method7901(this.anInt7677, arg3)) {
			if (arg2.aShortArray137 == null || arg2.aShortArray137.length < this.anInt7679) {
				arg1.aShortArray137 = arg2.aShortArray137 = new short[this.anInt7679];
			} else {
				arg1.aShortArray137 = arg2.aShortArray137;
			}
			for (local195 = 0; local195 < this.anInt7679; local195++) {
				arg1.aShortArray137[local195] = this.aShortArray137[local195];
			}
		} else {
			arg1.aShortArray137 = this.aShortArray137;
		}
		if (Static29.method807(this.anInt7677, arg3)) {
			if (arg2.aByteArray102 == null || arg2.aByteArray102.length < this.anInt7679) {
				arg1.aByteArray102 = arg2.aByteArray102 = new byte[this.anInt7679];
			} else {
				arg1.aByteArray102 = arg2.aByteArray102;
			}
			for (local195 = 0; local195 < this.anInt7679; local195++) {
				arg1.aByteArray102[local195] = this.aByteArray102[local195];
			}
		} else {
			arg1.aByteArray102 = this.aByteArray102;
		}
		if (Static420.method6572(this.anInt7677, arg3)) {
			if (arg0) {
				arg1.aByte87 = (byte) (arg1.aByte87 | 0x2);
			}
			arg1.aClass258_14 = arg2.aClass258_14;
			arg1.aClass258_14.aByte85 = this.aClass258_14.aByte85;
			arg1.aClass258_14.anInterface15_6 = this.aClass258_14.anInterface15_6;
		} else if (Static129.method2484(this.anInt7677, arg3)) {
			arg1.aClass258_14 = this.aClass258_14;
		} else {
			arg1.aClass258_14 = null;
		}
		@Pc(518) int local518;
		if (Static447.method6927(arg3, this.anInt7677)) {
			if (arg2.aShortArray133 == null || this.anInt7621 > arg2.aShortArray133.length) {
				local195 = this.anInt7621;
				arg1.aShortArray131 = arg2.aShortArray131 = new short[local195];
				arg1.aShortArray132 = arg2.aShortArray132 = new short[local195];
				arg1.aShortArray133 = arg2.aShortArray133 = new short[local195];
			} else {
				arg1.aShortArray131 = arg2.aShortArray131;
				arg1.aShortArray132 = arg2.aShortArray132;
				arg1.aShortArray133 = arg2.aShortArray133;
			}
			if (this.aClass170_1 == null) {
				for (local195 = 0; local195 < this.anInt7621; local195++) {
					arg1.aShortArray133[local195] = this.aShortArray133[local195];
					arg1.aShortArray131[local195] = this.aShortArray131[local195];
					arg1.aShortArray132[local195] = this.aShortArray132[local195];
				}
			} else {
				if (arg2.aClass170_1 == null) {
					arg2.aClass170_1 = new Class170();
				}
				@Pc(502) Class170 local502 = arg1.aClass170_1 = arg2.aClass170_1;
				if (local502.aShortArray89 == null || local502.aShortArray89.length < this.anInt7621) {
					local518 = this.anInt7621;
					local502.aByteArray71 = new byte[local518];
					local502.aShortArray91 = new short[local518];
					local502.aShortArray90 = new short[local518];
					local502.aShortArray89 = new short[local518];
				}
				for (local518 = 0; local518 < this.anInt7621; local518++) {
					arg1.aShortArray133[local518] = this.aShortArray133[local518];
					arg1.aShortArray131[local518] = this.aShortArray131[local518];
					arg1.aShortArray132[local518] = this.aShortArray132[local518];
					local502.aShortArray89[local518] = this.aClass170_1.aShortArray89[local518];
					local502.aShortArray91[local518] = this.aClass170_1.aShortArray91[local518];
					local502.aShortArray90[local518] = this.aClass170_1.aShortArray90[local518];
					local502.aByteArray71[local518] = this.aClass170_1.aByteArray71[local518];
				}
			}
			arg1.aByteArray101 = this.aByteArray101;
		} else {
			arg1.aShortArray133 = this.aShortArray133;
			arg1.aShortArray132 = this.aShortArray132;
			arg1.aShortArray131 = this.aShortArray131;
			arg1.aClass170_1 = this.aClass170_1;
			arg1.aByteArray101 = this.aByteArray101;
		}
		if (Static508.method7752(this.anInt7677, arg3)) {
			arg1.aClass258_15 = arg2.aClass258_15;
			if (arg0) {
				arg1.aByte87 = (byte) (arg1.aByte87 | 0x4);
			}
			arg1.aClass258_15.aByte85 = this.aClass258_15.aByte85;
			arg1.aClass258_15.anInterface15_6 = this.aClass258_15.anInterface15_6;
		} else if (Static281.method4924(this.anInt7677, arg3)) {
			arg1.aClass258_15 = this.aClass258_15;
		} else {
			arg1.aClass258_15 = null;
		}
		if (Static373.method6001(arg3, this.anInt7677)) {
			if (arg2.aFloatArray65 == null || arg2.aFloatArray65.length < this.anInt7679) {
				local195 = this.anInt7621;
				arg1.aFloatArray64 = arg2.aFloatArray64 = new float[local195];
				arg1.aFloatArray65 = arg2.aFloatArray65 = new float[local195];
			} else {
				arg1.aFloatArray64 = arg2.aFloatArray64;
				arg1.aFloatArray65 = arg2.aFloatArray65;
			}
			for (local195 = 0; local195 < this.anInt7621; local195++) {
				arg1.aFloatArray65[local195] = this.aFloatArray65[local195];
				arg1.aFloatArray64[local195] = this.aFloatArray64[local195];
			}
		} else {
			arg1.aFloatArray65 = this.aFloatArray65;
			arg1.aFloatArray64 = this.aFloatArray64;
		}
		if (Static311.method5394(this.anInt7677, arg3)) {
			arg1.aClass258_13 = arg2.aClass258_13;
			if (arg0) {
				arg1.aByte87 = (byte) (arg1.aByte87 | 0x8);
			}
			arg1.aClass258_13.anInterface15_6 = this.aClass258_13.anInterface15_6;
			arg1.aClass258_13.aByte85 = this.aClass258_13.aByte85;
		} else if (Static461.method7928(arg3, this.anInt7677)) {
			arg1.aClass258_13 = this.aClass258_13;
		} else {
			arg1.aClass258_13 = null;
		}
		if (Static20.method592(arg3, this.anInt7677)) {
			if (arg2.aShortArray134 == null || arg2.aShortArray134.length < this.anInt7679) {
				local195 = this.anInt7679;
				arg1.aShortArray130 = arg2.aShortArray130 = new short[local195];
				arg1.aShortArray134 = arg2.aShortArray134 = new short[local195];
				arg1.aShortArray135 = arg2.aShortArray135 = new short[local195];
			} else {
				arg1.aShortArray135 = arg2.aShortArray135;
				arg1.aShortArray130 = arg2.aShortArray130;
				arg1.aShortArray134 = arg2.aShortArray134;
			}
			for (local195 = 0; local195 < this.anInt7679; local195++) {
				arg1.aShortArray134[local195] = this.aShortArray134[local195];
				arg1.aShortArray135[local195] = this.aShortArray135[local195];
				arg1.aShortArray130[local195] = this.aShortArray130[local195];
			}
		} else {
			arg1.aShortArray135 = this.aShortArray135;
			arg1.aShortArray130 = this.aShortArray130;
			arg1.aShortArray134 = this.aShortArray134;
		}
		if (Static170.method3194(arg3, this.anInt7677)) {
			if (arg0) {
				arg1.aByte87 = (byte) (arg1.aByte87 | 0x10);
			}
			arg1.aClass272_1 = arg2.aClass272_1;
			arg1.aClass272_1.anInterface20_5 = this.aClass272_1.anInterface20_5;
		} else if (Static132.method2520(arg3, this.anInt7677)) {
			arg1.aClass272_1 = this.aClass272_1;
		} else {
			arg1.aClass272_1 = null;
		}
		if (Static254.method4603(this.anInt7677, arg3)) {
			if (arg2.aShortArray129 == null || this.anInt7679 > arg2.aShortArray129.length) {
				local195 = this.anInt7679;
				arg1.aShortArray129 = arg2.aShortArray129 = new short[local195];
			} else {
				arg1.aShortArray129 = arg2.aShortArray129;
			}
			for (local195 = 0; local195 < this.anInt7679; local195++) {
				arg1.aShortArray129[local195] = this.aShortArray129[local195];
			}
		} else {
			arg1.aShortArray129 = this.aShortArray129;
		}
		if (!Static50.method1401(this.anInt7677, arg3)) {
			arg1.aClass274Array1 = this.aClass274Array1;
		} else if (arg2.aClass274Array1 == null || this.anInt7653 > arg2.aClass274Array1.length) {
			local195 = this.anInt7653;
			arg1.aClass274Array1 = arg2.aClass274Array1 = new Class274[local195];
			for (local518 = 0; local518 < this.anInt7653; local518++) {
				arg1.aClass274Array1[local518] = this.aClass274Array1[local518].method7002();
			}
		} else {
			arg1.aClass274Array1 = arg2.aClass274Array1;
			for (local195 = 0; local195 < this.anInt7653; local195++) {
				arg1.aClass274Array1[local195].method7003(this.aClass274Array1[local195]);
			}
		}
		arg1.aShortArray136 = this.aShortArray136;
		arg1.aShortArray138 = this.aShortArray138;
		arg1.aClass68Array7 = this.aClass68Array7;
		if (this.aBoolean569) {
			arg1.aShort104 = this.aShort104;
			arg1.aBoolean569 = true;
			arg1.aShort105 = this.aShort105;
			arg1.aShort107 = this.aShort107;
			arg1.aShort110 = this.aShort110;
			arg1.aShort109 = this.aShort109;
			arg1.aShort103 = this.aShort103;
			arg1.aShort106 = this.aShort106;
		} else {
			arg1.aBoolean569 = false;
		}
		arg1.anIntArrayArray104 = this.anIntArrayArray104;
		arg1.anIntArray718 = this.anIntArray718;
		arg1.aClass106Array7 = this.aClass106Array7;
		arg1.anIntArrayArray105 = this.anIntArrayArray105;
		arg1.anIntArray719 = this.anIntArray719;
		arg1.anIntArrayArray103 = this.anIntArrayArray103;
		arg1.aShortArray139 = this.aShortArray139;
		arg1.aClass186Array1 = this.aClass186Array1;
		return arg1;
	}

	@OriginalMember(owner = "client!sb", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	@Override
	public void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean569) {
			this.method6787();
		}
		@Pc(16) int local16 = arg4 + this.aShort103;
		@Pc(21) int local21 = arg4 + this.aShort106;
		@Pc(27) int local27 = arg6 + this.aShort105;
		@Pc(32) int local32 = this.aShort110 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt9576 >> arg2.anInt9573 >= arg2.anInt9577 || local27 < 0 || arg2.anInt9575 <= arg2.anInt9576 + local32 >> arg2.anInt9573)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9577 <= arg3.anInt9576 + local21 >> arg3.anInt9573 || local27 < 0 || local32 + arg3.anInt9576 >> arg3.anInt9573 >= arg3.anInt9575) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9573;
			local21 = arg2.anInt9576 + local21 - 1 >> arg2.anInt9573;
			local27 >>= arg2.anInt9573;
			local32 = local32 + arg2.anInt9576 - 1 >> arg2.anInt9573;
			if (arg5 == arg2.ba(local16, local27) && arg5 == arg2.ba(local21, local27) && arg2.ba(local16, local32) == arg5 && arg5 == arg2.ba(local21, local32)) {
				return;
			}
		}
		@Pc(224) int local224;
		if (arg0 == 1) {
			for (local224 = 0; local224 < this.anInt7637; local224++) {
				this.anIntArray717[local224] = this.anIntArray717[local224] + arg2.aa(this.anIntArray720[local224] + arg4, arg6 + this.anIntArray721[local224]) - arg5;
			}
		} else {
			@Pc(226) int local226;
			@Pc(235) int local235;
			if (arg0 == 2) {
				@Pc(438) short local438 = this.aShort109;
				if (local438 == 0) {
					return;
				}
				for (local226 = 0; local226 < this.anInt7637; local226++) {
					local235 = (this.anIntArray717[local226] << 16) / local438;
					if (local235 < arg1) {
						this.anIntArray717[local226] += (arg2.aa(arg4 + this.anIntArray720[local226], arg6 + this.anIntArray721[local226]) - arg5) * (-local235 + arg1) / arg1;
					}
				}
			} else {
				@Pc(242) int local242;
				if (arg0 == 3) {
					local224 = (arg1 & 0xFF) * 4;
					local226 = (arg1 >> 8 & 0xFF) * 4;
					local235 = (arg1 >> 16 & 0xFF) << 6;
					local242 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local224 >> 1) < 0 || arg2.anInt9577 << arg2.anInt9573 <= arg4 + (local224 >> 1) + arg2.anInt9576 || arg6 - (local226 >> 1) < 0 || arg2.anInt9575 << arg2.anInt9573 <= arg2.anInt9576 + arg6 + (local226 >> 1)) {
						return;
					}
					this.method6774(local242, local235, arg6, local226, arg4, arg2, local224, arg5);
				} else if (arg0 == 4) {
					local224 = this.aShort107 - this.aShort109;
					for (local226 = 0; local226 < this.anInt7637; local226++) {
						this.anIntArray717[local226] = local224 + this.anIntArray717[local226] + arg3.aa(this.anIntArray720[local226] + arg4, this.anIntArray721[local226] + arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local224 = this.aShort107 - this.aShort109;
					for (local226 = 0; local226 < this.anInt7637; local226++) {
						local235 = this.anIntArray720[local226] + arg4;
						local242 = arg6 + this.anIntArray721[local226];
						@Pc(247) int local247 = arg2.aa(local235, local242);
						@Pc(252) int local252 = arg3.aa(local235, local242);
						@Pc(260) int local260 = local247 - arg1 - local252;
						this.anIntArray717[local226] = (local260 * ((this.anIntArray717[local226] << 8) / local224) >> 8) + local247 - arg5;
					}
				}
			}
		}
		this.aBoolean569 = false;
		if (this.aClass258_16 != null) {
			this.aClass258_16.anInterface15_6 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		return this.anInt7623;
	}

	@OriginalMember(owner = "client!sb", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean569) {
			this.method6787();
		}
		return this.aShort110;
	}

	@OriginalMember(owner = "client!sb", name = "va", descriptor = "()I")
	@Override
	public int va() {
		if (!this.aBoolean569) {
			this.method6787();
		}
		return this.aShort106;
	}

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "(I)V")
	@Override
	public void m(@OriginalArg(0) int arg0) {
		this.anInt7623 = arg0;
		if (this.aClass170_1 != null && (this.anInt7623 & 0x10000) == 0) {
			this.aShortArray131 = this.aClass170_1.aShortArray91;
			this.aShortArray132 = this.aClass170_1.aShortArray90;
			this.aShortArray133 = this.aClass170_1.aShortArray89;
			this.aByteArray101 = this.aClass170_1.aByteArray71;
			this.aClass170_1 = null;
		}
		this.aBoolean570 = true;
		this.method6786();
	}

	@OriginalMember(owner = "client!sb", name = "ca", descriptor = "(III)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7637; local7++) {
			if (arg0 != 0) {
				this.anIntArray720[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray717[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray721[local7] += arg2;
			}
		}
		this.aBoolean569 = false;
		if (this.aClass258_16 != null) {
			this.aClass258_16.anInterface15_6 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)V")
	private void method6799(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass258_14 != null && this.aClass258_14.anInterface15_6 == null;
		@Pc(27) boolean local27 = this.aClass258_15 != null && this.aClass258_15.anInterface15_6 == null;
		@Pc(38) boolean local38 = this.aClass258_16 != null && this.aClass258_16.anInterface15_6 == null;
		@Pc(49) boolean local49 = this.aClass258_13 != null && this.aClass258_13.anInterface15_6 == null;
		if (arg0) {
			local16 &= (this.aByte87 & 0x2) != 0;
			local49 &= (this.aByte87 & 0x8) != 0;
			local27 &= (this.aByte87 & 0x4) != 0;
			local38 &= (this.aByte87 & 0x1) != 0;
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
		if (this.aClass4_Sub3_38.aClass1_Sub17_Sub1_2.aByteArray58.length < local100 * this.anInt7621) {
			this.aClass4_Sub3_38.aClass1_Sub17_Sub1_2 = new Class1_Sub17_Sub1(local100 * (this.anInt7621 + 100));
		} else {
			this.aClass4_Sub3_38.aClass1_Sub17_Sub1_2.anInt4872 = 0;
		}
		@Pc(189) Class1_Sub17_Sub1 local189 = this.aClass4_Sub3_38.aClass1_Sub17_Sub1_2;
		@Pc(197) int local197;
		@Pc(206) int local206;
		@Pc(234) int local234;
		@Pc(243) int local243;
		if (local38) {
			@Pc(213) int local213;
			@Pc(220) int local220;
			@Pc(225) int local225;
			@Pc(232) int local232;
			if (this.aClass4_Sub3_38.aBoolean421) {
				for (local197 = 0; local197 < this.anInt7637; local197++) {
					local206 = Stream.floatToRawIntBits((float) this.anIntArray720[local197]);
					local213 = Stream.floatToRawIntBits((float) this.anIntArray717[local197]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray721[local197]);
					local225 = this.anIntArray719[local197];
					local232 = this.anIntArray719[local197 + 1];
					for (local234 = local225; local234 < local232; local234++) {
						local243 = this.aShortArray139[local234] - 1;
						if (local243 == -1) {
							break;
						}
						local189.anInt4872 = local100 * local243;
						local189.method4489(local206);
						local189.method4489(local213);
						local189.method4489(local220);
					}
				}
			} else {
				for (local197 = 0; local197 < this.anInt7637; local197++) {
					local206 = Stream.floatToRawIntBits((float) this.anIntArray720[local197]);
					local213 = Stream.floatToRawIntBits((float) this.anIntArray717[local197]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray721[local197]);
					local225 = this.anIntArray719[local197];
					local232 = this.anIntArray719[local197 + 1];
					for (local234 = local225; local234 < local232; local234++) {
						local243 = this.aShortArray139[local234] - 1;
						if (local243 == -1) {
							break;
						}
						local189.anInt4872 = local243 * local100;
						local189.method4450(local206);
						local189.method4450(local213);
						local189.method4450(local220);
					}
				}
			}
		}
		@Pc(476) float local476;
		@Pc(379) short[] local379;
		@Pc(375) short[] local375;
		@Pc(383) short[] local383;
		@Pc(387) byte[] local387;
		@Pc(537) float local537;
		if (local16) {
			if (this.aClass258_15 == null) {
				if (this.aClass170_1 == null) {
					local387 = this.aByteArray101;
					local379 = this.aShortArray133;
					local375 = this.aShortArray131;
					local383 = this.aShortArray132;
				} else {
					local375 = this.aClass170_1.aShortArray91;
					local379 = this.aClass170_1.aShortArray89;
					local383 = this.aClass170_1.aShortArray90;
					local387 = this.aClass170_1.aByteArray71;
				}
				@Pc(407) float local407 = this.aClass4_Sub3_38.aFloatArray52[0];
				@Pc(413) float local413 = this.aClass4_Sub3_38.aFloatArray52[1];
				@Pc(419) float local419 = this.aClass4_Sub3_38.aFloatArray52[2];
				@Pc(423) float local423 = this.aClass4_Sub3_38.aFloat121;
				@Pc(433) float local433 = this.aClass4_Sub3_38.aFloat114 * 768.0F / (float) this.aShort108;
				@Pc(443) float local443 = this.aClass4_Sub3_38.aFloat117 * 768.0F / (float) this.aShort108;
				for (@Pc(445) int local445 = 0; local445 < this.anInt7679; local445++) {
					@Pc(465) int local465 = this.method6789(this.aShortArray129[local445], this.aShortArray137[local445], this.aShort111, this.aByteArray102[local445]);
					local476 = (float) (local465 >> 16 & 0xFF) * this.aClass4_Sub3_38.aFloat112;
					@Pc(485) float local485 = (float) (local465 >>> 24) * this.aClass4_Sub3_38.aFloat128;
					@Pc(496) float local496 = this.aClass4_Sub3_38.aFloat116 * (float) (local465 >> 8 & 0xFF);
					@Pc(501) short local501 = this.aShortArray134[local445];
					@Pc(506) short local506 = (short) local387[local501];
					if (local506 == 0) {
						local537 = (local407 * (float) local379[local501] + (float) local375[local501] * local413 + local419 * (float) local383[local501]) * 0.0026041667F;
					} else {
						local537 = (local413 * (float) local375[local501] + (float) local379[local501] * local407 + local419 * (float) local383[local501]) / (float) (local506 * 256);
					}
					@Pc(574) float local574 = (local537 < 0.0F ? local443 : local433) * local537 + local423;
					@Pc(579) int local579 = (int) (local485 * local574);
					@Pc(584) int local584 = (int) (local476 * local574);
					if (local579 < 0) {
						local579 = 0;
					} else if (local579 > 255) {
						local579 = 255;
					}
					@Pc(602) int local602 = (int) (local496 * local574);
					if (local584 < 0) {
						local584 = 0;
					} else if (local584 > 255) {
						local584 = 255;
					}
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					local189.anInt4872 = local100 * local501 + local104;
					local189.method4451(local579);
					local189.method4451(local584);
					local189.method4451(local602);
					local189.method4451(255 - (this.aByteArray102[local445] & 0xFF));
					local501 = this.aShortArray135[local445];
					local506 = local387[local501];
					if (local506 == 0) {
						local537 = (local419 * (float) local383[local501] + (float) local375[local501] * local413 + (float) local379[local501] * local407) * 0.0026041667F;
					} else {
						local537 = ((float) local383[local501] * local419 + (float) local379[local501] * local407 + (float) local375[local501] * local413) / (float) (local506 * 256);
					}
					local574 = local423 + local537 * (local537 < 0.0F ? local443 : local433);
					local579 = (int) (local574 * local485);
					if (local579 < 0) {
						local579 = 0;
					} else if (local579 > 255) {
						local579 = 255;
					}
					local584 = (int) (local476 * local574);
					if (local584 < 0) {
						local584 = 0;
					} else if (local584 > 255) {
						local584 = 255;
					}
					local602 = (int) (local496 * local574);
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					local189.anInt4872 = local100 * local501 + local104;
					local189.method4451(local579);
					local189.method4451(local584);
					local189.method4451(local602);
					local189.method4451(255 - (this.aByteArray102[local445] & 0xFF));
					local501 = this.aShortArray130[local445];
					local506 = local387[local501];
					if (local506 == 0) {
						local537 = (local419 * (float) local383[local501] + (float) local375[local501] * local413 + (float) local379[local501] * local407) * 0.0026041667F;
					} else {
						local537 = (local413 * (float) local375[local501] + local407 * (float) local379[local501] + local419 * (float) local383[local501]) / (float) (local506 * 256);
					}
					local574 = local423 + (local537 < 0.0F ? local443 : local433) * local537;
					local579 = (int) (local485 * local574);
					if (local579 < 0) {
						local579 = 0;
					} else if (local579 > 255) {
						local579 = 255;
					}
					local584 = (int) (local574 * local476);
					local602 = (int) (local574 * local496);
					if (local584 < 0) {
						local584 = 0;
					} else if (local584 > 255) {
						local584 = 255;
					}
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					local189.anInt4872 = local100 * local501 + local104;
					local189.method4451(local579);
					local189.method4451(local584);
					local189.method4451(local602);
					local189.method4451(255 - (this.aByteArray102[local445] & 0xFF));
				}
			} else {
				for (local197 = 0; local197 < this.anInt7679; local197++) {
					local206 = this.method6789(this.aShortArray129[local197], this.aShortArray137[local197], this.aShort111, this.aByteArray102[local197]);
					local189.anInt4872 = local100 * this.aShortArray134[local197] + local104;
					local189.method4489(local206);
					local189.anInt4872 = local100 * this.aShortArray135[local197] + local104;
					local189.method4489(local206);
					local189.anInt4872 = local104 + this.aShortArray130[local197] * local100;
					local189.method4489(local206);
				}
			}
		}
		if (local27) {
			if (this.aClass170_1 == null) {
				local387 = this.aByteArray101;
				local375 = this.aShortArray131;
				local383 = this.aShortArray132;
				local379 = this.aShortArray133;
			} else {
				local383 = this.aClass170_1.aShortArray90;
				local387 = this.aClass170_1.aByteArray71;
				local375 = this.aClass170_1.aShortArray91;
				local379 = this.aClass170_1.aShortArray89;
			}
			@Pc(1122) float local1122 = 3.0F / (float) this.aShort108;
			local189.anInt4872 = local106;
			local537 = 3.0F / (float) (this.aShort108 + this.aShort108 / 2);
			if (this.aClass4_Sub3_38.aBoolean421) {
				for (local234 = 0; local234 < this.anInt7621; local234++) {
					local243 = local387[local234] & 0xFF;
					if (local243 == 0) {
						local189.method3096(local537 * (float) local379[local234]);
						local189.method3096((float) local375[local234] * local537);
						local189.method3096((float) local383[local234] * local537);
					} else {
						local476 = local1122 / (float) local243;
						local189.method3096(local476 * (float) local379[local234]);
						local189.method3096((float) local375[local234] * local476);
						local189.method3096(local476 * (float) local383[local234]);
					}
					local189.anInt4872 += local100 - 12;
				}
			} else {
				for (local234 = 0; local234 < this.anInt7621; local234++) {
					local243 = local387[local234] & 0xFF;
					if (local243 == 0) {
						local189.method3095((float) local379[local234] * local537);
						local189.method3095(local537 * (float) local375[local234]);
						local189.method3095((float) local383[local234] * local537);
					} else {
						local476 = local1122 / (float) local243;
						local189.method3095(local476 * (float) local379[local234]);
						local189.method3095(local476 * (float) local375[local234]);
						local189.method3095(local476 * (float) local383[local234]);
					}
					local189.anInt4872 += local100 - 12;
				}
			}
		}
		if (local49) {
			local189.anInt4872 = local108;
			if (this.aClass4_Sub3_38.aBoolean421) {
				for (local197 = 0; local197 < this.anInt7621; local197++) {
					local189.method3096(this.aFloatArray65[local197]);
					local189.method3096(this.aFloatArray64[local197]);
					local189.anInt4872 += local100 - 8;
				}
			} else {
				for (local197 = 0; local197 < this.anInt7621; local197++) {
					local189.method3095(this.aFloatArray65[local197]);
					local189.method3095(this.aFloatArray64[local197]);
					local189.anInt4872 += local100 - 8;
				}
			}
		}
		local189.anInt4872 = this.anInt7621 * local100;
		@Pc(1436) Interface15 local1436;
		if (arg0) {
			if (this.anInterface15_7 == null) {
				this.anInterface15_7 = this.aClass4_Sub3_38.method5299(local189.anInt4872, local100, local189.aByteArray58, true);
			} else {
				this.anInterface15_7.method3792(local189.anInt4872, local189.aByteArray58, local100);
			}
			local1436 = this.anInterface15_7;
			this.aByte87 = 0;
		} else {
			local1436 = this.aClass4_Sub3_38.method5299(local189.anInt4872, local100, local189.aByteArray58, false);
			this.aBoolean570 = true;
		}
		if (local38) {
			this.aClass258_16.anInterface15_6 = local1436;
			this.aClass258_16.aByte85 = 0;
		}
		if (local49) {
			this.aClass258_13.aByte85 = local108;
			this.aClass258_13.anInterface15_6 = local1436;
		}
		if (local16) {
			this.aClass258_14.anInterface15_6 = local1436;
			this.aClass258_14.aByte85 = local104;
		}
		if (local27) {
			this.aClass258_15.aByte85 = local106;
			this.aClass258_15.anInterface15_6 = local1436;
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
	private void method6800() {
		if (this.anInt7625 == 0) {
			return;
		}
		if (this.aByte87 != 0) {
			this.method6799(true);
		}
		this.method6799(false);
		if (this.aClass272_1 != null) {
			if (this.aClass272_1.anInterface20_5 == null) {
				this.method6788((this.aByte87 & 0x10) != 0);
			}
			if (this.aClass272_1.anInterface20_5 != null) {
				this.aClass4_Sub3_38.method5273(this.aClass258_15 != null);
				this.aClass4_Sub3_38.method5298(this.aClass258_13, this.aClass258_14, this.aClass258_16, this.aClass258_15);
				@Pc(77) int local77 = this.anIntArray718.length - 1;
				for (@Pc(79) int local79 = 0; local79 < local77; local79++) {
					@Pc(86) int local86 = this.anIntArray718[local79];
					@Pc(93) int local93 = this.anIntArray718[local79 + 1];
					@Pc(100) int local100 = this.aShortArray129[local86] & 0xFFFF;
					if (local100 == 65535) {
						local100 = -1;
					}
					this.aClass4_Sub3_38.method5228(this.aClass258_15 != null, local100);
					this.aClass4_Sub3_38.method5287((local93 - local86) * 3, this.aClass272_1.anInterface20_5, local86 * 3);
				}
			}
		}
		this.method6786();
	}

	@OriginalMember(owner = "client!sb", name = "pa", descriptor = "(SS)V")
	@Override
	public void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7679; local3++) {
			if (arg0 == this.aShortArray137[local3]) {
				this.aShortArray137[local3] = arg1;
			}
		}
		if (this.aClass186Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt7653; local30++) {
				@Pc(37) Class186 local37 = this.aClass186Array1[local30];
				@Pc(42) Class274 local42 = this.aClass274Array1[local30];
				local42.anInt7948 = Static107.anIntArray176[this.aShortArray137[local37.anInt5846] & 0xFFFF] & 0xFFFFFF | local42.anInt7948 & 0xFF000000;
			}
		}
		if (this.aClass258_14 != null) {
			this.aClass258_14.anInterface15_6 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIFBLclient!ei;FJI)S")
	private short method6801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) Class81 arg5, @OriginalArg(7) float arg6, @OriginalArg(8) long arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray719[arg1];
		@Pc(17) int local17 = this.anIntArray719[arg1 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray139[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static481.aLongArray14[local21] == arg7) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray139[local19] = (short) (this.anInt7621 + 1);
		Static481.aLongArray14[local19] = arg7;
		this.aShortArray133[this.anInt7621] = (short) arg8;
		this.aShortArray131[this.anInt7621] = (short) arg2;
		this.aShortArray132[this.anInt7621] = (short) arg3;
		this.aByteArray101[this.anInt7621] = (byte) arg0;
		this.aFloatArray65[this.anInt7621] = arg6;
		this.aFloatArray64[this.anInt7621] = arg4;
		return (short) this.anInt7621++;
	}
}
