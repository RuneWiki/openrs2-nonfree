import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Lclient!dw;")
	private Class77 aClass77_1;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Z")
	private boolean aBoolean155;

	@OriginalMember(owner = "client!d", name = "z", descriptor = "I")
	private int anInt1757;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "I")
	private int anInt1760;

	@OriginalMember(owner = "client!d", name = "H", descriptor = "Lclient!mj;")
	private final Class45_Sub2 aClass45_Sub2_3;

	@OriginalMember(owner = "client!d", name = "R", descriptor = "I")
	private int anInt1769;

	@OriginalMember(owner = "client!d", name = "V", descriptor = "I")
	private int anInt1773;

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "Lclient!li;")
	private Class193 aClass193_1;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "Lclient!dw;")
	private Class77 aClass77_2;

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "Lclient!dw;")
	private Class77 aClass77_3;

	@OriginalMember(owner = "client!d", name = "wb", descriptor = "Lclient!dw;")
	private Class77 aClass77_4;

	@OriginalMember(owner = "client!d", name = "Bb", descriptor = "Z")
	private boolean aBoolean157;

	@OriginalMember(owner = "client!d", name = "Gb", descriptor = "Z")
	private boolean aBoolean158;

	@OriginalMember(owner = "client!d", name = "Pb", descriptor = "I")
	private int anInt1801;

	@OriginalMember(owner = "client!d", name = "Xb", descriptor = "Lclient!rw;")
	private Class301 aClass301_1;

	@OriginalMember(owner = "client!d", name = "lc", descriptor = "I")
	private int anInt1813;

	@OriginalMember(owner = "client!d", name = "nc", descriptor = "I")
	private int anInt1815;

	@OriginalMember(owner = "client!d", name = "xc", descriptor = "I")
	private int anInt1821;

	@OriginalMember(owner = "client!d", name = "yc", descriptor = "I")
	private int anInt1822;

	@OriginalMember(owner = "client!d", name = "zc", descriptor = "I")
	private int anInt1823;

	@OriginalMember(owner = "client!d", name = "Gc", descriptor = "I")
	private int anInt1828;

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!d", name = "Mb", descriptor = "I")
	private int anInt1798;

	@OriginalMember(owner = "client!d", name = "nb", descriptor = "I")
	private int anInt1781;

	@OriginalMember(owner = "client!d", name = "x", descriptor = "Z")
	private boolean aBoolean156;

	@OriginalMember(owner = "client!d", name = "jc", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!d", name = "X", descriptor = "I")
	private int anInt1775;

	@OriginalMember(owner = "client!d", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!d", name = "tb", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!d", name = "Kb", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!d", name = "Wb", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!d", name = "Cc", descriptor = "[Lclient!ow;")
	private Class248[] aClass248Array1;

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "[Lclient!qr;")
	private Class281[] aClass281Array1;

	@OriginalMember(owner = "client!d", name = "pc", descriptor = "I")
	private int anInt1817;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "[Lclient!ida;")
	private Class141[] aClass141Array1;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "[Lclient!kq;")
	private Class184[] aClass184Array1;

	@OriginalMember(owner = "client!d", name = "qc", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!d", name = "Yb", descriptor = "[F")
	private float[] aFloatArray15;

	@OriginalMember(owner = "client!d", name = "M", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!d", name = "Ib", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!d", name = "wc", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!d", name = "ac", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!d", name = "Hb", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!d", name = "Zb", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!d", name = "Rb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!d", name = "rb", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!d", name = "Fc", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "[F")
	private float[] aFloatArray14;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!d", name = "Qb", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!d", name = "L", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!d", name = "bc", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!d", name = "vc", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!d", name = "kc", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!mj;Lclient!ef;IIII)V")
	public Class60_Sub1(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface3 local11 = arg0.anInterface3_12;
		@Pc(15) int[] local15 = new int[arg1.anInt2720];
		this.anIntArray81 = new int[arg1.anInt2719 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt2720; local24++) {
			if ((arg1.aByteArray25 == null || arg1.aByteArray25[local24] != 2) && (arg1.aShortArray25 == null || arg1.aShortArray25[local24] == -1 || !local11.method4776(arg1.aShortArray25[local24] & 0xFFFF).aBoolean142)) {
				local15[this.anInt1798++] = local24;
				this.anIntArray81[arg1.aShortArray26[local24]]++;
				this.anIntArray81[arg1.aShortArray27[local24]]++;
				this.anIntArray81[arg1.aShortArray32[local24]]++;
			}
		}
		this.anInt1781 = this.anInt1798;
		@Pc(113) long[] local113 = new long[this.anInt1798];
		@Pc(125) boolean local125 = (this.anInt1828 & 0x100) != 0;
		@Pc(137) int local137;
		@Pc(148) int local148;
		@Pc(284) int local284;
		label501: for (@Pc(127) int local127 = 0; local127 < this.anInt1798; local127++) {
			@Pc(133) int local133 = local15[local127];
			@Pc(135) Class55 local135 = null;
			local137 = 0;
			@Pc(139) byte local139 = 0;
			@Pc(141) byte local141 = 0;
			@Pc(143) byte local143 = 0;
			if (arg1.aClass168Array1 != null) {
				for (local148 = 0; local148 < arg1.aClass168Array1.length; local148++) {
					@Pc(155) Class168 local155 = arg1.aClass168Array1[local148];
					if (local155.anInt4620 == local133) {
						@Pc(164) Class31 local164 = Static14.method211(local155.anInt4622);
						if (local164.aBoolean73) {
							local113[local127] = Long.MAX_VALUE;
							this.anInt1781--;
							continue label501;
						}
					}
				}
			}
			@Pc(191) short local191 = -1;
			if (arg1.aShortArray25 != null) {
				local191 = arg1.aShortArray25[local133];
				if (local191 != -1) {
					local135 = local11.method4776(local191 & 0xFFFF);
					local143 = local135.aByte20;
					local141 = local135.aByte16;
				}
			}
			@Pc(240) boolean local240 = arg1.aByteArray29 != null && arg1.aByteArray29[local133] != 0 || local135 != null && local135.aBoolean140 | !local135.aBoolean139;
			if ((local125 || local240) && arg1.aByteArray26 != null) {
				local137 += arg1.aByteArray26[local133] << 17;
			}
			if (local240) {
				local137 += 65536;
			}
			local137 += (local141 & 0xFF) << 8;
			local137 += local143 & 0xFF;
			local284 = local139 + ((local191 & 0xFFFF) << 16);
			@Pc(290) int local290 = local284 + (local127 & 0xFFFF);
			local113[local127] = ((long) local137 << 32) + (long) local290;
			this.aBoolean156 |= local240;
		}
		Static38.method624(local113, local15);
		this.anIntArray85 = arg1.anIntArray115;
		this.anInt1775 = arg1.anInt2719;
		this.lb = arg1.anInt2728;
		this.anIntArray82 = arg1.anIntArray113;
		this.aShortArray19 = arg1.aShortArray31;
		this.anIntArray83 = arg1.anIntArray111;
		this.aClass248Array1 = arg1.aClass248Array2;
		this.aClass281Array1 = arg1.aClass281Array2;
		@Pc(355) Class194[] local355 = new Class194[this.anInt1775];
		@Pc(375) int local375;
		@Pc(389) int local389;
		if (arg1.aClass168Array1 != null) {
			this.anInt1817 = arg1.aClass168Array1.length;
			this.aClass141Array1 = new Class141[this.anInt1817];
			this.aClass184Array1 = new Class184[this.anInt1817];
			for (local375 = 0; local375 < this.anInt1817; local375++) {
				@Pc(382) Class168 local382 = arg1.aClass168Array1[local375];
				@Pc(387) Class31 local387 = Static14.method211(local382.anInt4622);
				local389 = -1;
				for (@Pc(391) int local391 = 0; local391 < this.anInt1798; local391++) {
					if (local382.anInt4620 == local15[local391]) {
						local389 = local391;
						break;
					}
				}
				if (local389 == -1) {
					throw new RuntimeException();
				}
				local148 = Static214.anIntArray203[arg1.aShortArray29[local382.anInt4620] & 0xFFFF] & 0xFFFFFF;
				local148 |= 255 - (arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local382.anInt4620]) << 24;
				this.aClass141Array1[local375] = new Class141(local389, arg1.aShortArray26[local382.anInt4620], arg1.aShortArray27[local382.anInt4620], arg1.aShortArray32[local382.anInt4620], local387.anInt751, local387.anInt746, local387.anInt752, local387.anInt741, local387.anInt743, local387.aBoolean73, local387.aBoolean74, local382.anInt4625);
				this.aClass184Array1[local375] = new Class184(local148);
			}
		}
		local375 = this.anInt1798 * 3;
		this.aByteArray21 = new byte[local375];
		this.aFloatArray15 = new float[local375];
		this.aShortArray13 = new short[this.anInt1798];
		this.aShortArray14 = new short[this.anInt1798];
		if (arg1.aShortArray30 != null) {
			this.aShortArray18 = new short[this.anInt1798];
		}
		this.aShortArray24 = new short[this.anInt1798];
		this.aShortArray23 = new short[local375];
		this.aShort23 = (short) arg4;
		Static562.aLongArray15 = new long[local375];
		this.aShortArray17 = new short[local375];
		this.aShortArray22 = new short[local375];
		this.aShort22 = (short) arg3;
		this.aShortArray21 = new short[local375];
		this.aShortArray16 = new short[this.anInt1798];
		this.aByteArray22 = new byte[this.anInt1798];
		this.aFloatArray14 = new float[local375];
		this.aShortArray15 = new short[this.anInt1798];
		this.aShortArray20 = new short[local375];
		this.aShortArray12 = new short[local375];
		local137 = 0;
		for (local284 = 0; local284 < arg1.anInt2719; local284++) {
			local389 = this.anIntArray81[local284];
			this.anIntArray81[local284] = local137;
			local137 += local389;
			local355[local284] = new Class194();
		}
		this.anIntArray81[arg1.anInt2719] = local137;
		@Pc(634) int[] local634 = null;
		@Pc(636) int[] local636 = null;
		@Pc(638) int[] local638 = null;
		@Pc(640) float[][] local640 = null;
		@Pc(658) int[] local658;
		@Pc(666) int local666;
		@Pc(708) int local708;
		@Pc(714) int local714;
		@Pc(728) int local728;
		@Pc(730) int local730;
		@Pc(763) int local763;
		@Pc(768) int local768;
		@Pc(916) float local916;
		@Pc(932) float local932;
		@Pc(924) float local924;
		if (arg1.aByteArray27 != null) {
			@Pc(646) int local646 = arg1.anInt2716;
			@Pc(649) int[] local649 = new int[local646];
			@Pc(652) int[] local652 = new int[local646];
			@Pc(655) int[] local655 = new int[local646];
			local658 = new int[local646];
			@Pc(661) int[] local661 = new int[local646];
			@Pc(664) int[] local664 = new int[local646];
			for (local666 = 0; local666 < local646; local666++) {
				local649[local666] = Integer.MAX_VALUE;
				local652[local666] = -2147483647;
				local655[local666] = Integer.MAX_VALUE;
				local658[local666] = -2147483647;
				local661[local666] = Integer.MAX_VALUE;
				local664[local666] = -2147483647;
			}
			local636 = new int[local646];
			local634 = new int[local646];
			for (local708 = 0; local708 < this.anInt1798; local708++) {
				local714 = local15[local708];
				if (arg1.aByteArray27[local714] != -1) {
					local728 = arg1.aByteArray27[local714] & 0xFF;
					for (local730 = 0; local730 < 3; local730++) {
						@Pc(744) short local744;
						if (local730 == 0) {
							local744 = arg1.aShortArray26[local714];
						} else if (local730 == 1) {
							local744 = arg1.aShortArray27[local714];
						} else {
							local744 = arg1.aShortArray32[local714];
						}
						local763 = arg1.anIntArray111[local744];
						local768 = arg1.anIntArray113[local744];
						@Pc(773) int local773 = arg1.anIntArray115[local744];
						if (local763 < local649[local728]) {
							local649[local728] = local763;
						}
						if (local652[local728] < local763) {
							local652[local728] = local763;
						}
						if (local655[local728] > local768) {
							local655[local728] = local768;
						}
						if (local768 > local658[local728]) {
							local658[local728] = local768;
						}
						if (local773 < local661[local728]) {
							local661[local728] = local773;
						}
						if (local664[local728] < local773) {
							local664[local728] = local773;
						}
					}
				}
			}
			local640 = new float[local646][];
			local638 = new int[local646];
			for (local714 = 0; local714 < local646; local714++) {
				@Pc(861) byte local861 = arg1.aByteArray31[local714];
				if (local861 > 0) {
					local634[local714] = (local652[local714] + local649[local714]) / 2;
					local636[local714] = (local658[local714] + local655[local714]) / 2;
					local638[local714] = (local664[local714] + local661[local714]) / 2;
					if (local861 == 1) {
						local768 = arg1.anIntArray119[local714];
						if (local768 == 0) {
							local916 = 1.0F;
							local932 = 1.0F;
						} else if (local768 <= 0) {
							local916 = (float) -local768 / 1024.0F;
							local932 = 1.0F;
						} else {
							local932 = (float) local768 / 1024.0F;
							local916 = 1.0F;
						}
						local924 = 64.0F / (float) arg1.anIntArray117[local714];
					} else if (local861 == 2) {
						local916 = 64.0F / (float) arg1.anIntArray119[local714];
						local924 = 64.0F / (float) arg1.anIntArray117[local714];
						local932 = 64.0F / (float) arg1.anIntArray116[local714];
					} else {
						local916 = (float) arg1.anIntArray119[local714] / 1024.0F;
						local932 = (float) arg1.anIntArray116[local714] / 1024.0F;
						local924 = (float) arg1.anIntArray117[local714] / 1024.0F;
					}
					local640[local714] = Static305.method4615(local916, arg1.aShortArray34[local714], local924, local932, arg1.aShortArray28[local714], arg1.aByteArray28[local714] & 0xFF, arg1.aShortArray33[local714]);
				}
			}
		}
		@Pc(1034) Class261[] local1034 = new Class261[arg1.anInt2720];
		@Pc(1053) short local1053;
		@Pc(1064) int local1064;
		@Pc(1075) int local1075;
		for (@Pc(1036) int local1036 = 0; local1036 < arg1.anInt2720; local1036++) {
			@Pc(1043) short local1043 = arg1.aShortArray26[local1036];
			@Pc(1048) short local1048 = arg1.aShortArray27[local1036];
			local1053 = arg1.aShortArray32[local1036];
			local1064 = this.anIntArray83[local1048] - this.anIntArray83[local1043];
			local1075 = this.anIntArray82[local1048] - this.anIntArray82[local1043];
			local666 = this.anIntArray85[local1048] - this.anIntArray85[local1043];
			local708 = this.anIntArray83[local1053] - this.anIntArray83[local1043];
			local714 = this.anIntArray82[local1053] - this.anIntArray82[local1043];
			local728 = this.anIntArray85[local1053] - this.anIntArray85[local1043];
			local730 = local728 * local1075 - local714 * local666;
			@Pc(1136) int local1136 = local666 * local708 - local728 * local1064;
			local763 = local714 * local1064 - local708 * local1075;
			while (local730 > 8192 || local1136 > 8192 || local763 > 8192 || local730 < -8192 || local1136 < -8192 || local763 < -8192) {
				local1136 >>= 0x1;
				local763 >>= 0x1;
				local730 >>= 0x1;
			}
			local768 = (int) Math.sqrt((double) (local763 * local763 + local1136 * local1136 + local730 * local730));
			if (local768 <= 0) {
				local768 = 1;
			}
			local1136 = local1136 * 256 / local768;
			local730 = local730 * 256 / local768;
			local763 = local763 * 256 / local768;
			@Pc(1227) byte local1227 = arg1.aByteArray25 == null ? 0 : arg1.aByteArray25[local1036];
			if (local1227 == 0) {
				@Pc(1233) Class194 local1233 = local355[local1043];
				local1233.anInt5139 += local763;
				local1233.anInt5140++;
				local1233.anInt5138 += local1136;
				local1233.anInt5137 += local730;
				@Pc(1261) Class194 local1261 = local355[local1048];
				local1261.anInt5140++;
				local1261.anInt5137 += local730;
				local1261.anInt5139 += local763;
				local1261.anInt5138 += local1136;
				@Pc(1289) Class194 local1289 = local355[local1053];
				local1289.anInt5138 += local1136;
				local1289.anInt5137 += local730;
				local1289.anInt5139 += local763;
				local1289.anInt5140++;
			} else if (local1227 == 1) {
				@Pc(1326) Class261 local1326 = local1034[local1036] = new Class261();
				local1326.anInt7052 = local763;
				local1326.anInt7046 = local730;
				local1326.anInt7049 = local1136;
			}
		}
		@Pc(1352) int local1352;
		for (@Pc(1346) int local1346 = 0; local1346 < this.anInt1798; local1346++) {
			local1352 = local15[local1346];
			@Pc(1359) int local1359 = arg1.aShortArray29[local1352] & 0xFFFF;
			@Pc(1367) short local1367;
			if (arg1.aShortArray25 == null) {
				local1367 = -1;
			} else {
				local1367 = arg1.aShortArray25[local1352];
			}
			if (arg1.aByteArray27 == null) {
				local1075 = -1;
			} else {
				local1075 = arg1.aByteArray27[local1352];
			}
			if (arg1.aByteArray29 == null) {
				local666 = 0;
			} else {
				local666 = arg1.aByteArray29[local1352] & 0xFF;
			}
			@Pc(1399) float local1399 = 0.0F;
			@Pc(1401) float local1401 = 0.0F;
			@Pc(1403) float local1403 = 0.0F;
			local916 = 0.0F;
			local924 = 0.0F;
			local932 = 0.0F;
			@Pc(1411) byte local1411 = 0;
			@Pc(1413) byte local1413 = 0;
			@Pc(1415) int local1415 = 0;
			@Pc(1448) byte local1448;
			@Pc(1468) short local1468;
			@Pc(2214) short local2214;
			@Pc(2219) short local2219;
			if (local1367 != -1) {
				if (local1075 == -1) {
					local916 = 1.0F;
					local1403 = 1.0F;
					local1401 = 1.0F;
					local1413 = 2;
					local1411 = 1;
					local932 = 0.0F;
					local924 = 0.0F;
					local1399 = 0.0F;
				} else {
					local1075 &= 0xFF;
					local1448 = arg1.aByteArray31[local1075];
					@Pc(1458) short local1458;
					@Pc(1463) short local1463;
					@Pc(1497) float local1497;
					@Pc(1706) float local1706;
					@Pc(1714) float local1714;
					@Pc(1815) float local1815;
					@Pc(1823) float local1823;
					@Pc(1831) float local1831;
					@Pc(1854) float local1854;
					@Pc(1877) float local1877;
					@Pc(1900) float local1900;
					if (local1448 == 0) {
						local1458 = arg1.aShortArray26[local1352];
						local1463 = arg1.aShortArray27[local1352];
						local1468 = arg1.aShortArray32[local1352];
						local2214 = arg1.aShortArray34[local1075];
						local2219 = arg1.aShortArray28[local1075];
						@Pc(2224) short local2224 = arg1.aShortArray33[local1075];
						@Pc(2230) float local2230 = (float) arg1.anIntArray111[local2214];
						@Pc(2236) float local2236 = (float) arg1.anIntArray113[local2214];
						local1497 = arg1.anIntArray115[local2214];
						local1706 = (float) arg1.anIntArray111[local2219] - local2230;
						local1714 = (float) arg1.anIntArray113[local2219] - local2236;
						@Pc(2268) float local2268 = (float) arg1.anIntArray115[local2219] - local1497;
						@Pc(2277) float local2277 = (float) arg1.anIntArray111[local2224] - local2230;
						@Pc(2286) float local2286 = (float) arg1.anIntArray113[local2224] - local2236;
						@Pc(2295) float local2295 = (float) arg1.anIntArray115[local2224] - local1497;
						@Pc(2303) float local2303 = (float) arg1.anIntArray111[local1458] - local2230;
						@Pc(2312) float local2312 = (float) arg1.anIntArray113[local1458] - local2236;
						@Pc(2321) float local2321 = (float) arg1.anIntArray115[local1458] - local1497;
						@Pc(2330) float local2330 = (float) arg1.anIntArray111[local1463] - local2230;
						@Pc(2338) float local2338 = (float) arg1.anIntArray113[local1463] - local2236;
						local1815 = (float) arg1.anIntArray115[local1463] - local1497;
						local1823 = (float) arg1.anIntArray111[local1468] - local2230;
						local1831 = (float) arg1.anIntArray113[local1468] - local2236;
						local1854 = (float) arg1.anIntArray115[local1468] - local1497;
						local1877 = local1714 * local2295 - local2286 * local2268;
						local1900 = local2268 * local2277 - local2295 * local1706;
						@Pc(2398) float local2398 = local2286 * local1706 - local1714 * local2277;
						@Pc(2406) float local2406 = local2286 * local2398 - local1900 * local2295;
						@Pc(2414) float local2414 = local1877 * local2295 - local2277 * local2398;
						@Pc(2422) float local2422 = local1900 * local2277 - local2286 * local1877;
						@Pc(2436) float local2436 = 1.0F / (local2422 * local2268 + local2406 * local1706 + local2414 * local1714);
						local1399 = (local2321 * local2422 + local2414 * local2312 + local2406 * local2303) * local2436;
						local1403 = (local1815 * local2422 + local2338 * local2414 + local2406 * local2330) * local2436;
						local924 = (local2406 * local1823 + local1831 * local2414 + local1854 * local2422) * local2436;
						@Pc(2487) float local2487 = local2268 * local1877 - local2398 * local1706;
						@Pc(2495) float local2495 = local1900 * local1706 - local1714 * local1877;
						@Pc(2504) float local2504 = local2398 * local1714 - local1900 * local2268;
						@Pc(2518) float local2518 = 1.0F / (local2495 * local2295 + local2504 * local2277 + local2286 * local2487);
						local932 = local2518 * (local1854 * local2495 + local2504 * local1823 + local1831 * local2487);
						local1401 = (local2495 * local2321 + local2303 * local2504 + local2312 * local2487) * local2518;
						local916 = local2518 * (local2504 * local2330 + local2338 * local2487 + local1815 * local2495);
					} else {
						local1458 = arg1.aShortArray26[local1352];
						local1463 = arg1.aShortArray27[local1352];
						local1468 = arg1.aShortArray32[local1352];
						@Pc(1472) int local1472 = local634[local1075];
						@Pc(1476) int local1476 = local636[local1075];
						@Pc(1480) int local1480 = local638[local1075];
						@Pc(1484) float[] local1484 = local640[local1075];
						@Pc(1489) byte local1489 = arg1.aByteArray30[local1075];
						local1497 = (float) arg1.anIntArray118[local1075] / 256.0F;
						if (local1448 == 1) {
							local1706 = (float) arg1.anIntArray116[local1075] / 1024.0F;
							Static341.method5072(local1472, arg1.anIntArray111[local1458], local1706, arg1.anIntArray115[local1458], local1484, local1497, local1489, arg1.anIntArray113[local1458], local1476, local1480);
							local1401 = Static346.aFloat137;
							local1399 = Static497.aFloat152;
							Static341.method5072(local1472, arg1.anIntArray111[local1463], local1706, arg1.anIntArray115[local1463], local1484, local1497, local1489, arg1.anIntArray113[local1463], local1476, local1480);
							local1403 = Static497.aFloat152;
							local916 = Static346.aFloat137;
							Static341.method5072(local1472, arg1.anIntArray111[local1468], local1706, arg1.anIntArray115[local1468], local1484, local1497, local1489, arg1.anIntArray113[local1468], local1476, local1480);
							local924 = Static497.aFloat152;
							local932 = Static346.aFloat137;
							local1714 = local1706 / 2.0F;
							if ((local1489 & 0x1) == 0) {
								if (local1714 < local924 - local1399) {
									local924 -= local1706;
									local1413 = 1;
								} else if (local1714 < local1399 - local924) {
									local1413 = 2;
									local924 += local1706;
								}
								if (local1714 < local1403 - local1399) {
									local1403 -= local1706;
									local1411 = 1;
								} else if (local1714 < local1399 - local1403) {
									local1411 = 2;
									local1403 += local1706;
								}
							} else {
								if (local1714 < local916 - local1401) {
									local916 -= local1706;
									local1411 = 1;
								} else if (local1401 - local916 > local1714) {
									local916 += local1706;
									local1411 = 2;
								}
								if (local932 - local1401 > local1714) {
									local932 -= local1706;
									local1413 = 1;
								} else if (local1401 - local932 > local1714) {
									local1413 = 2;
									local932 += local1706;
								}
							}
						} else if (local1448 == 2) {
							local1706 = (float) arg1.anIntArray112[local1075] / 256.0F;
							local1714 = (float) arg1.anIntArray114[local1075] / 256.0F;
							@Pc(1725) int local1725 = arg1.anIntArray111[local1463] - arg1.anIntArray111[local1458];
							@Pc(1736) int local1736 = arg1.anIntArray113[local1463] - arg1.anIntArray113[local1458];
							@Pc(1747) int local1747 = arg1.anIntArray115[local1463] - arg1.anIntArray115[local1458];
							@Pc(1758) int local1758 = arg1.anIntArray111[local1468] - arg1.anIntArray111[local1458];
							@Pc(1769) int local1769 = arg1.anIntArray113[local1468] - arg1.anIntArray113[local1458];
							@Pc(1780) int local1780 = arg1.anIntArray115[local1468] - arg1.anIntArray115[local1458];
							@Pc(1789) int local1789 = local1736 * local1780 - local1769 * local1747;
							@Pc(1798) int local1798 = local1758 * local1747 - local1780 * local1725;
							@Pc(1807) int local1807 = local1769 * local1725 - local1758 * local1736;
							local1815 = 64.0F / (float) arg1.anIntArray119[local1075];
							local1823 = 64.0F / (float) arg1.anIntArray117[local1075];
							local1831 = 64.0F / (float) arg1.anIntArray116[local1075];
							local1854 = (local1484[0] * (float) local1789 + local1484[1] * (float) local1798 + (float) local1807 * local1484[2]) / local1815;
							local1877 = (local1484[5] * (float) local1807 + local1484[3] * (float) local1789 + (float) local1798 * local1484[4]) / local1823;
							local1900 = (local1484[8] * (float) local1807 + local1484[7] * (float) local1798 + (float) local1789 * local1484[6]) / local1831;
							local1415 = Static60.method1238(local1900, local1854, local1877);
							Static85.method1683(local1480, local1497, local1415, arg1.anIntArray113[local1458], local1472, local1706, local1489, local1714, arg1.anIntArray115[local1458], local1476, arg1.anIntArray111[local1458], local1484);
							local1401 = Static277.aFloat101;
							local1399 = Static559.aFloat201;
							Static85.method1683(local1480, local1497, local1415, arg1.anIntArray113[local1463], local1472, local1706, local1489, local1714, arg1.anIntArray115[local1463], local1476, arg1.anIntArray111[local1463], local1484);
							local1403 = Static559.aFloat201;
							local916 = Static277.aFloat101;
							Static85.method1683(local1480, local1497, local1415, arg1.anIntArray113[local1468], local1472, local1706, local1489, local1714, arg1.anIntArray115[local1468], local1476, arg1.anIntArray111[local1468], local1484);
							local932 = Static277.aFloat101;
							local924 = Static559.aFloat201;
						} else if (local1448 == 3) {
							Static185.method3152(local1472, arg1.anIntArray115[local1458], arg1.anIntArray113[local1458], local1476, arg1.anIntArray111[local1458], local1497, local1489, local1484, local1480);
							local1399 = Static233.aFloat98;
							local1401 = Static105.aFloat46;
							Static185.method3152(local1472, arg1.anIntArray115[local1463], arg1.anIntArray113[local1463], local1476, arg1.anIntArray111[local1463], local1497, local1489, local1484, local1480);
							local1403 = Static233.aFloat98;
							local916 = Static105.aFloat46;
							Static185.method3152(local1472, arg1.anIntArray115[local1468], arg1.anIntArray113[local1468], local1476, arg1.anIntArray111[local1468], local1497, local1489, local1484, local1480);
							local932 = Static105.aFloat46;
							local924 = Static233.aFloat98;
							if ((local1489 & 0x1) == 0) {
								if (local1403 - local1399 > 0.5F) {
									local1411 = 1;
									local1403--;
								} else if (local1399 - local1403 > 0.5F) {
									local1411 = 2;
									local1403++;
								}
								if (local924 - local1399 > 0.5F) {
									local924--;
									local1413 = 1;
								} else if (local1399 - local924 > 0.5F) {
									local1413 = 2;
									local924++;
								}
							} else {
								if (local932 - local1401 > 0.5F) {
									local1413 = 1;
									local932--;
								} else if (local1401 - local932 > 0.5F) {
									local932++;
									local1413 = 2;
								}
								if (local916 - local1401 > 0.5F) {
									local916--;
									local1411 = 1;
								} else if (local1401 - local916 > 0.5F) {
									local1411 = 2;
									local916++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray25 == null) {
				local1448 = 0;
			} else {
				local1448 = arg1.aByteArray25[local1352];
			}
			if (local1448 == 0) {
				@Pc(2726) long local2726 = (long) (local1075 << 2) + ((long) (local1415 << 24) + (long) (local1359 << 8) + (long) local666 << 32);
				local1468 = arg1.aShortArray26[local1352];
				local2214 = arg1.aShortArray27[local1352];
				local2219 = arg1.aShortArray32[local1352];
				@Pc(2745) Class194 local2745 = local355[local1468];
				this.aShortArray15[local1346] = this.method1669(local2745.anInt5139, local1346, local2745.anInt5137, arg1, local2745.anInt5140, local2745.anInt5138, local2726, local1401, local1468, local1399);
				@Pc(2770) Class194 local2770 = local355[local2214];
				this.aShortArray24[local1346] = this.method1669(local2770.anInt5139, local1346, local2770.anInt5137, arg1, local2770.anInt5140, local2770.anInt5138, (long) local1411 + local2726, local916, local2214, local1403);
				@Pc(2798) Class194 local2798 = local355[local2219];
				this.aShortArray13[local1346] = this.method1669(local2798.anInt5139, local1346, local2798.anInt5137, arg1, local2798.anInt5140, local2798.anInt5138, local2726 + (long) local1413, local932, local2219, local924);
			} else if (local1448 == 1) {
				@Pc(2583) Class261 local2583 = local1034[local1352];
				@Pc(2628) long local2628 = (long) ((local2583.anInt7052 + 256 << 22) + (local2583.anInt7049 + 256 << 12) + (local1075 << 2) + (local2583.anInt7046 <= 0 ? 2048 : 1024)) + ((long) (local1415 << 24) + (long) (local1359 << 8) + (long) local666 << 32);
				this.aShortArray15[local1346] = this.method1669(local2583.anInt7052, local1346, local2583.anInt7046, arg1, 0, local2583.anInt7049, local2628, local1401, arg1.aShortArray26[local1352], local1399);
				this.aShortArray24[local1346] = this.method1669(local2583.anInt7052, local1346, local2583.anInt7046, arg1, 0, local2583.anInt7049, local2628 + (long) local1411, local916, arg1.aShortArray27[local1352], local1403);
				this.aShortArray13[local1346] = this.method1669(local2583.anInt7052, local1346, local2583.anInt7046, arg1, 0, local2583.anInt7049, (long) local1413 + local2628, local932, arg1.aShortArray32[local1352], local924);
			}
			if (arg1.aShortArray25 == null) {
				this.aShortArray16[local1346] = -1;
			} else {
				this.aShortArray16[local1346] = arg1.aShortArray25[local1352];
			}
			if (arg1.aByteArray29 != null) {
				this.aByteArray22[local1346] = arg1.aByteArray29[local1352];
			}
			if (arg1.aShortArray30 != null) {
				this.aShortArray18[local1346] = arg1.aShortArray30[local1352];
			}
			this.aShortArray14[local1346] = arg1.aShortArray29[local1352];
		}
		if (this.anInt1781 > 0) {
			local1352 = 1;
			local1053 = this.aShortArray16[0];
			for (local1064 = 0; local1064 < this.anInt1781; local1064++) {
				@Pc(2898) short local2898 = this.aShortArray16[local1064];
				if (local1053 != local2898) {
					local1352++;
					local1053 = local2898;
				}
			}
			this.anIntArray79 = new int[local1352];
			this.anIntArray80 = new int[local1352 + 1];
			this.anIntArray84 = new int[local1352];
			this.anIntArray80[0] = 0;
			local1075 = this.anInt1813;
			local1352 = 0;
			@Pc(2935) short local2935 = 0;
			local1053 = this.aShortArray16[0];
			for (local708 = 0; local708 < this.anInt1781; local708++) {
				@Pc(2949) short local2949 = this.aShortArray16[local708];
				if (local2949 != local1053) {
					this.anIntArray79[local1352] = local1075;
					this.anIntArray84[local1352] = local2935 + 1 - local1075;
					local1352++;
					this.anIntArray80[local1352] = local708;
					local1075 = this.anInt1813;
					local2935 = 0;
					local1053 = local2949;
				}
				@Pc(2988) short local2988 = this.aShortArray15[local708];
				if (local1075 > local2988) {
					local1075 = local2988;
				}
				if (local2988 > local2935) {
					local2935 = local2988;
				}
				local2988 = this.aShortArray24[local708];
				if (local2988 > local2935) {
					local2935 = local2988;
				}
				if (local2988 < local1075) {
					local1075 = local2988;
				}
				local2988 = this.aShortArray13[local708];
				if (local1075 > local2988) {
					local1075 = local2988;
				}
				if (local2988 > local2935) {
					local2935 = local2988;
				}
			}
			this.anIntArray79[local1352] = local1075;
			this.anIntArray84[local1352] = local2935 + 1 - local1075;
			local1352++;
			this.anIntArray80[local1352] = this.anInt1781;
		}
		Static562.aLongArray15 = null;
		this.aShortArray20 = Static557.method7483(this.aShortArray20, this.anInt1813);
		this.aShortArray22 = Static557.method7483(this.aShortArray22, this.anInt1813);
		this.aShortArray12 = Static557.method7483(this.aShortArray12, this.anInt1813);
		this.aShortArray17 = Static557.method7483(this.aShortArray17, this.anInt1813);
		this.aShortArray23 = Static557.method7483(this.aShortArray23, this.anInt1813);
		this.aByteArray21 = Static168.method3019(this.aByteArray21, this.anInt1813);
		this.aFloatArray15 = Static161.method2959(this.anInt1813, this.aFloatArray15);
		this.aFloatArray14 = Static161.method2959(this.anInt1813, this.aFloatArray14);
		if (arg1.anIntArray109 != null && Static314.method4612(arg2, this.anInt1757)) {
			this.anIntArrayArray33 = arg1.method2444(false);
		}
		if (arg1.aClass168Array1 != null && Static285.method4237(this.anInt1757, arg2)) {
			this.anIntArrayArray35 = arg1.method2437();
		}
		if (arg1.anIntArray110 != null && Static176.method3090(this.anInt1757, arg2)) {
			local1352 = 0;
			local658 = new int[256];
			for (local1064 = 0; local1064 < this.anInt1798; local1064++) {
				local1075 = arg1.anIntArray110[local15[local1064]];
				if (local1075 >= 0) {
					@Pc(3196) int local3196 = local658[local1075]++;
					if (local1075 > local1352) {
						local1352 = local1075;
					}
				}
			}
			this.anIntArrayArray34 = new int[local1352 + 1][];
			for (local1075 = 0; local1075 <= local1352; local1075++) {
				this.anIntArrayArray34[local1075] = new int[local658[local1075]];
				local658[local1075] = 0;
			}
			for (local666 = 0; local666 < this.anInt1798; local666++) {
				local708 = arg1.anIntArray110[local15[local666]];
				if (local708 >= 0) {
					this.anIntArrayArray34[local708][local658[local708]++] = local666;
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!mj;IIZZ)V")
	public Class60_Sub1(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1775 = 0;
		this.aBoolean158 = true;
		this.aBoolean156 = false;
		this.aBoolean157 = false;
		this.anInt1798 = 0;
		this.aBoolean155 = false;
		this.anInt1813 = 0;
		this.lb = 0;
		this.anInt1781 = 0;
		this.anInt1757 = arg2;
		this.aBoolean155 = arg4;
		this.anInt1828 = arg1;
		this.aClass45_Sub2_3 = arg0;
		if (arg3 || Static169.method3029(this.anInt1828, this.anInt1757)) {
			this.aClass77_4 = new Class77(Static321.method4673(this.anInt1757, this.anInt1828));
		}
		if (arg3 || Static368.method5394(this.anInt1757, this.anInt1828)) {
			this.aClass77_2 = new Class77(Static227.method3537(this.anInt1757, this.anInt1828));
		}
		if (arg3 || Static421.method5999(this.anInt1828, this.anInt1757)) {
			this.aClass77_3 = new Class77(Static171.method3051(this.anInt1828, this.anInt1757));
		}
		if (arg3 || Static422.method7213(this.anInt1757, this.anInt1828)) {
			this.aClass77_1 = new Class77(Static317.method4651(this.anInt1757, this.anInt1828));
		}
		if (arg3 || Static120.method2484(this.anInt1757, this.anInt1828)) {
			this.aClass193_1 = new Class193(Static365.method5322(this.anInt1828, this.anInt1757));
		}
	}

	@OriginalMember(owner = "client!d", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean157) {
			this.method1661();
		}
		return this.anInt1769;
	}

	@OriginalMember(owner = "client!d", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort22 = (short) arg0;
		this.method1667();
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "()V")
	@Override
	protected void method7245() {
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "()Z")
	@Override
	public boolean method7242() {
		if (this.aShortArray16 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray16.length; local12++) {
			if (this.aShortArray16[local12] != -1 && !this.aClass45_Sub2_3.anInterface3_12.method4774(this.aShortArray16[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!d", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort22;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt1798; local3++) {
			local12 = this.aShortArray14[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			@Pc(42) int local42 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local42 += arg3 * (arg2 - local42) >> 7;
			}
			this.aShortArray14[local3] = (short) (local24 << 7 | local18 << 10 | local42);
		}
		if (this.aClass141Array1 != null) {
			for (local12 = 0; local12 < this.anInt1817; local12++) {
				@Pc(106) Class141 local106 = this.aClass141Array1[local12];
				@Pc(111) Class184 local111 = this.aClass184Array1[local12];
				local111.anInt4892 = Static214.anIntArray203[this.aShortArray14[local106.anInt3919] & 0xFFFF] & 0xFFFFFF | local111.anInt4892 & 0xFF000000;
			}
		}
		this.method1667();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!re;I)V")
	private void method1651(@OriginalArg(0) Class3_Sub7_Sub13_Sub2 arg0) {
		if (this.anInt1813 > Static2.anIntArray4.length) {
			Static2.anIntArray4 = new int[this.anInt1813];
			Static294.anIntArray466 = new int[this.anInt1813];
		}
		@Pc(56) int local56;
		@Pc(95) int local95;
		@Pc(104) int local104;
		for (@Pc(24) int local24 = 0; local24 < this.anInt1775; local24++) {
			local56 = (this.anIntArray83[local24] - (this.anIntArray82[local24] * this.aClass45_Sub2_3.anInt5850 >> 8) >> this.aClass45_Sub2_3.anInt5858) - arg0.anInt7677;
			@Pc(81) int local81 = (this.anIntArray85[local24] - (this.aClass45_Sub2_3.anInt5867 * this.anIntArray82[local24] >> 8) >> this.aClass45_Sub2_3.anInt5858) - arg0.anInt7668;
			@Pc(86) int local86 = this.anIntArray81[local24];
			@Pc(93) int local93 = this.anIntArray81[local24 + 1];
			for (local95 = local86; local95 < local93; local95++) {
				local104 = this.aShortArray21[local95] - 1;
				if (local104 == -1) {
					break;
				}
				Static2.anIntArray4[local104] = local56;
				Static294.anIntArray466[local104] = local81;
			}
		}
		for (local56 = 0; local56 < this.anInt1781; local56++) {
			if (this.aByteArray22 == null || this.aByteArray22[local56] <= 128) {
				@Pc(146) short local146 = this.aShortArray15[local56];
				@Pc(151) short local151 = this.aShortArray24[local56];
				@Pc(156) short local156 = this.aShortArray13[local56];
				local95 = Static2.anIntArray4[local146];
				local104 = Static2.anIntArray4[local151];
				@Pc(168) int local168 = Static2.anIntArray4[local156];
				@Pc(172) int local172 = Static294.anIntArray466[local146];
				@Pc(176) int local176 = Static294.anIntArray466[local151];
				@Pc(180) int local180 = Static294.anIntArray466[local156];
				if ((local176 - local180) * (local95 - local104) - (local168 - local104) * (local176 - local172) > 0) {
					arg0.method6387(local172, local104, local180, local95, local176, local168);
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!q;IIZI)Z")
	private boolean method1652(@OriginalArg(0) int arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class11_Sub1 local8 = (Class11_Sub1) arg1;
		@Pc(12) Class11_Sub1 local12 = this.aClass45_Sub2_3.aClass11_Sub1_16;
		@Pc(33) float local33 = local8.aFloat10 * local12.aFloat3 + local12.aFloat4 * local8.aFloat12 + local12.aFloat9 * local8.aFloat2 + local12.aFloat10;
		@Pc(54) float local54 = local12.aFloat11 * local8.aFloat2 + local8.aFloat12 * local12.aFloat5 + local12.aFloat8 * local8.aFloat10 + local12.aFloat12;
		Static19.aFloat15 = local12.aFloat3 * local8.aFloat3 + local8.aFloat8 * local12.aFloat4 + local12.aFloat9 * local8.aFloat6;
		Static573.aFloat205 = local8.aFloat11 * local12.aFloat4 + local12.aFloat3 * local8.aFloat9 + local12.aFloat9 * local8.aFloat7;
		Static34.aFloat16 = local12.aFloat9 * local8.aFloat13 + local12.aFloat4 * local8.aFloat5 + local8.aFloat4 * local12.aFloat3;
		Static465.aFloat148 = local12.aFloat5 * local8.aFloat11 + local12.aFloat8 * local8.aFloat9 + local12.aFloat11 * local8.aFloat7;
		Static267.aFloat100 = local8.aFloat4 * local12.aFloat6 + local8.aFloat5 * local12.aFloat13 + local8.aFloat13 * local12.aFloat7;
		Static204.aFloat93 = local8.aFloat6 * local12.aFloat11 + local8.aFloat8 * local12.aFloat5 + local12.aFloat8 * local8.aFloat3;
		Static183.aFloat90 = local8.aFloat13 * local12.aFloat11 + local12.aFloat8 * local8.aFloat4 + local8.aFloat5 * local12.aFloat5;
		Static14.aFloat14 = local12.aFloat7 * local8.aFloat6 + local8.aFloat3 * local12.aFloat6 + local8.aFloat8 * local12.aFloat13;
		Static530.aFloat157 = local8.aFloat7 * local12.aFloat7 + local12.aFloat13 * local8.aFloat11 + local8.aFloat9 * local12.aFloat6;
		@Pc(237) float local237 = local8.aFloat2 * local12.aFloat7 + local12.aFloat6 * local8.aFloat10 + local12.aFloat13 * local8.aFloat12 + local12.aFloat2;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass45_Sub2_3.anInt5849;
		@Pc(261) int local261 = this.aClass45_Sub2_3.anInt5870;
		if (!this.aBoolean157) {
			this.method1661();
		}
		Static492.anIntArray512[0] = this.anInt1815;
		Static454.anIntArray483[0] = this.anInt1773;
		Static492.anIntArray512[1] = this.anInt1821;
		Static442.anIntArray463[0] = this.anInt1801;
		Static454.anIntArray483[1] = this.anInt1773;
		Static442.anIntArray463[1] = this.anInt1801;
		Static492.anIntArray512[2] = this.anInt1815;
		Static454.anIntArray483[2] = this.anInt1769;
		Static492.anIntArray512[3] = this.anInt1821;
		Static442.anIntArray463[2] = this.anInt1801;
		Static454.anIntArray483[3] = this.anInt1769;
		Static492.anIntArray512[4] = this.anInt1815;
		Static442.anIntArray463[3] = this.anInt1801;
		Static454.anIntArray483[4] = this.anInt1773;
		Static442.anIntArray463[4] = this.anInt1760;
		Static492.anIntArray512[5] = this.anInt1821;
		Static454.anIntArray483[5] = this.anInt1773;
		Static492.anIntArray512[6] = this.anInt1815;
		Static442.anIntArray463[5] = this.anInt1760;
		Static454.anIntArray483[6] = this.anInt1769;
		Static442.anIntArray463[6] = this.anInt1760;
		Static492.anIntArray512[7] = this.anInt1821;
		Static454.anIntArray483[7] = this.anInt1769;
		Static442.anIntArray463[7] = this.anInt1760;
		@Pc(448) float local448;
		@Pc(420) float local420;
		@Pc(434) float local434;
		@Pc(396) float local396;
		@Pc(406) float local406;
		@Pc(401) float local401;
		for (@Pc(389) int local389 = 0; local389 < 8; local389++) {
			local396 = Static492.anIntArray512[local389];
			local401 = Static442.anIntArray463[local389];
			local406 = Static454.anIntArray483[local389];
			local420 = local401 * Static465.aFloat148 + local396 * Static204.aFloat93 + local406 * Static183.aFloat90 + local54;
			local434 = local237 + Static530.aFloat157 * local401 + local396 * Static14.aFloat14 + local406 * Static267.aFloat100;
			local448 = local401 * Static573.aFloat205 + local406 * Static34.aFloat16 + Static19.aFloat15 * local396 + local33;
			if ((float) this.aClass45_Sub2_3.anInt5836 <= local434) {
				if (arg4 > 0) {
					local434 = arg4;
				}
				@Pc(472) float local472 = (float) local257 * local448 / local434 + (float) this.aClass45_Sub2_3.anInt5857;
				if (local472 < local241) {
					local241 = local472;
				}
				if (local472 > local243) {
					local243 = local472;
				}
				@Pc(496) float local496 = (float) this.aClass45_Sub2_3.anInt5862 + (float) local261 * local420 / local434;
				if (local496 > local247) {
					local247 = local496;
				}
				local239 = true;
				if (local496 < local245) {
					local245 = local496;
				}
			}
		}
		if (local239 && (float) arg2 > local241 && (float) arg2 < local243 && (float) arg0 > local245 && (float) arg0 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt1813 > Static2.anIntArray4.length) {
				Static294.anIntArray466 = new int[this.anInt1813];
				Static2.anIntArray4 = new int[this.anInt1813];
			}
			@Pc(633) int local633;
			for (@Pc(559) int local559 = 0; local559 < this.anInt1775; local559++) {
				local406 = this.anIntArray82[local559];
				local396 = this.anIntArray83[local559];
				local401 = this.anIntArray85[local559];
				local448 = local33 + Static34.aFloat16 * local406 + Static19.aFloat15 * local396 + local401 * Static573.aFloat205;
				local420 = local54 + Static465.aFloat148 * local401 + local396 * Static204.aFloat93 + Static183.aFloat90 * local406;
				local434 = Static267.aFloat100 * local406 + local396 * Static14.aFloat14 + local401 * Static530.aFloat157 + local237;
				@Pc(640) int local640;
				@Pc(642) int local642;
				@Pc(651) int local651;
				if (local434 >= (float) this.aClass45_Sub2_3.anInt5836) {
					if (arg4 > 0) {
						local434 = arg4;
					}
					local633 = (int) ((float) local257 * local448 / local434 + (float) this.aClass45_Sub2_3.anInt5857);
					local640 = (int) (local420 * (float) local261 / local434 + (float) this.aClass45_Sub2_3.anInt5862);
					local642 = this.anIntArray81[local559];
					local651 = this.anIntArray81[local559 + 1];
					for (@Pc(717) int local717 = local642; local717 < local651; local717++) {
						@Pc(726) int local726 = this.aShortArray21[local717] - 1;
						if (local726 == -1) {
							break;
						}
						Static2.anIntArray4[local726] = local633;
						Static294.anIntArray466[local726] = local640;
					}
				} else {
					local633 = this.anIntArray81[local559];
					local640 = this.anIntArray81[local559 + 1];
					for (local642 = local633; local642 < local640; local642++) {
						local651 = this.aShortArray21[local642] - 1;
						if (local651 == -1) {
							break;
						}
						Static2.anIntArray4[this.aShortArray21[local642] - 1] = -999999;
					}
				}
			}
			for (local633 = 0; local633 < this.anInt1798; local633++) {
				if (Static2.anIntArray4[this.aShortArray15[local633]] != -999999 && Static2.anIntArray4[this.aShortArray24[local633]] != -999999 && Static2.anIntArray4[this.aShortArray13[local633]] != -999999 && this.method1657(Static294.anIntArray466[this.aShortArray13[local633]], Static294.anIntArray466[this.aShortArray24[local633]], Static2.anIntArray4[this.aShortArray13[local633]], Static294.anIntArray466[this.aShortArray15[local633]], arg2, arg0, Static2.anIntArray4[this.aShortArray24[local633]], Static2.anIntArray4[this.aShortArray15[local633]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!d", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt1828;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
	private void method1654() {
		if (this.aClass141Array1 == null) {
			return;
		}
		this.aClass45_Sub2_3.ZA(false);
		this.aClass45_Sub2_3.method4905(false);
		this.aClass45_Sub2_3.method4953(1, Static62.aClass108_1);
		this.aClass45_Sub2_3.method4900(1, Static62.aClass108_1);
		for (@Pc(37) int local37 = 0; local37 < this.anInt1817; local37++) {
			@Pc(44) Class141 local44 = this.aClass141Array1[local37];
			@Pc(49) Class184 local49 = this.aClass184Array1[local37];
			if (!local44.aBoolean298 || !this.aClass45_Sub2_3.method7363()) {
				@Pc(78) float local78 = (float) (this.anIntArray83[local44.anInt3917] + this.anIntArray83[local44.anInt3920] + this.anIntArray83[local44.anInt3916]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray82[local44.anInt3916] + this.anIntArray82[local44.anInt3917] + this.anIntArray82[local44.anInt3920]) * 0.3333333F;
				@Pc(121) float local121 = (float) (this.anIntArray85[local44.anInt3917] + this.anIntArray85[local44.anInt3920] + this.anIntArray85[local44.anInt3916]) * 0.3333333F;
				@Pc(135) float local135 = Static124.aFloat172 + Static573.aFloat205 * local121 + Static34.aFloat16 * local99 + Static19.aFloat15 * local78;
				@Pc(149) float local149 = Static230.aFloat97 + Static183.aFloat90 * local99 + local78 * Static204.aFloat93 + Static465.aFloat148 * local121;
				@Pc(163) float local163 = Static552.aFloat179 + local121 * Static530.aFloat157 + local78 * Static14.aFloat14 + Static267.aFloat100 * local99;
				@Pc(168) Class11_Sub1 local168 = this.aClass45_Sub2_3.method4960();
				local168.method177(local49.anInt4889, local44.aShort48 * local49.anInt4887 >> 7, local163 - (float) local44.anInt3918, local44.aShort49 * local49.anInt4891 >> 7, (float) local49.anInt4893 + local149, local135 + (float) local49.anInt4884);
				local168.method183(this.aClass45_Sub2_3.aClass11_Sub1_17);
				this.aClass45_Sub2_3.method4992();
				@Pc(215) int local215 = local49.anInt4892;
				this.aClass45_Sub2_3.method4947(false, local44.aShort50, false);
				this.aClass45_Sub2_3.method5019(local44.aByte42);
				this.aClass45_Sub2_3.method4912(local215);
				this.aClass45_Sub2_3.method4902();
			}
		}
		this.aClass45_Sub2_3.method4900(1, Static160.aClass108_2);
		this.aClass45_Sub2_3.method4953(1, Static160.aClass108_2);
		this.aClass45_Sub2_3.ZA(true);
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(B)Z")
	private boolean method1655() {
		if (this.aClass193_1.aBoolean380) {
			return true;
		}
		if (this.aClass193_1.anInterface13_6 == null) {
			this.aClass193_1.anInterface13_6 = this.aClass45_Sub2_3.method4945(this.aBoolean155);
		}
		@Pc(36) Interface13 local36 = this.aClass193_1.anInterface13_6;
		local36.method6435(this.anInt1781 * 6);
		@Pc(48) Buffer local48 = local36.method6437();
		if (local48 != null) {
			@Pc(56) Stream local56 = this.aClass45_Sub2_3.method4901(local48);
			@Pc(60) int local60;
			if (Stream.c()) {
				for (local60 = 0; local60 < this.anInt1781; local60++) {
					local56.b(this.aShortArray15[local60]);
					local56.b(this.aShortArray24[local60]);
					local56.b(this.aShortArray13[local60]);
				}
			} else {
				for (local60 = 0; local60 < this.anInt1781; local60++) {
					local56.e(this.aShortArray15[local60]);
					local56.e(this.aShortArray24[local60]);
					local56.e(this.aShortArray13[local60]);
				}
			}
			local56.a();
			if (local36.method6433()) {
				this.aClass193_1.aBoolean380 = true;
				this.aClass193_1.anInterface13_5 = local36;
				this.aBoolean158 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!d", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean157) {
			this.method1661();
		}
		return this.anInt1801;
	}

	@OriginalMember(owner = "client!d", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class356.anIntArray597[arg0];
		@Pc(13) int local13 = Class356.anIntArray598[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1775; local15++) {
			local33 = local13 * this.anIntArray83[local15] + local9 * this.anIntArray85[local15] >> 14;
			this.anIntArray85[local15] = local13 * this.anIntArray85[local15] - local9 * this.anIntArray83[local15] >> 14;
			this.anIntArray83[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt1813; local33++) {
			@Pc(87) int local87 = this.aShortArray12[local33] * local13 + this.aShortArray23[local33] * local9 >> 14;
			this.aShortArray23[local33] = (short) (this.aShortArray23[local33] * local13 - this.aShortArray12[local33] * local9 >> 14);
			this.aShortArray12[local33] = (short) local87;
		}
		this.method1660();
		this.method1664();
		this.aBoolean157 = false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) boolean arg3) {
		return this.method1652(arg1, arg2, arg0, arg3, -1);
	}

	@OriginalMember(owner = "client!d", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean157) {
			this.method1661();
		}
		return this.anInt1823;
	}

	@OriginalMember(owner = "client!d", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean157) {
			this.method1661();
		}
		return this.anInt1773;
	}

	@OriginalMember(owner = "client!d", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean157) {
			this.method1661();
		}
		return this.anInt1821;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()V")
	@Override
	public void method7231() {
		if (this.anInt1813 > 0 && this.anInt1781 > 0) {
			this.method1665();
			this.method1655();
			this.method1659();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method1657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > arg5 && arg5 < arg1 && arg5 < arg0) {
			return false;
		} else if (arg5 > arg3 && arg1 < arg5 && arg5 > arg0) {
			return false;
		} else if (arg4 < arg7 && arg6 > arg4 && arg4 < arg2) {
			return false;
		} else {
			return arg7 >= arg4 || arg4 <= arg6 || arg4 <= arg2;
		}
	}

	@OriginalMember(owner = "client!d", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub7_Sub13 S(@OriginalArg(0) Class3_Sub7_Sub13 arg0) {
		if (this.anInt1813 == 0) {
			return null;
		}
		if (!this.aBoolean157) {
			this.method1661();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass45_Sub2_3.anInt5850 <= 0) {
			local40 = this.anInt1815 - (this.aClass45_Sub2_3.anInt5850 * this.anInt1773 >> 8) >> this.aClass45_Sub2_3.anInt5858;
			local57 = this.anInt1821 - (this.aClass45_Sub2_3.anInt5850 * this.anInt1769 >> 8) >> this.aClass45_Sub2_3.anInt5858;
		} else {
			local40 = this.anInt1815 - (this.aClass45_Sub2_3.anInt5850 * this.anInt1769 >> 8) >> this.aClass45_Sub2_3.anInt5858;
			local57 = this.anInt1821 - (this.aClass45_Sub2_3.anInt5850 * this.anInt1773 >> 8) >> this.aClass45_Sub2_3.anInt5858;
		}
		@Pc(113) int local113;
		@Pc(129) int local129;
		if (this.aClass45_Sub2_3.anInt5867 <= 0) {
			local113 = this.anInt1801 - (this.aClass45_Sub2_3.anInt5867 * this.anInt1773 >> 8) >> this.aClass45_Sub2_3.anInt5858;
			local129 = this.anInt1760 - (this.aClass45_Sub2_3.anInt5867 * this.anInt1769 >> 8) >> this.aClass45_Sub2_3.anInt5858;
		} else {
			local113 = this.anInt1801 - (this.anInt1769 * this.aClass45_Sub2_3.anInt5867 >> 8) >> this.aClass45_Sub2_3.anInt5858;
			local129 = this.anInt1760 - (this.aClass45_Sub2_3.anInt5867 * this.anInt1773 >> 8) >> this.aClass45_Sub2_3.anInt5858;
		}
		@Pc(172) int local172 = local57 + 1 - local40;
		@Pc(179) int local179 = local129 + 1 - local113;
		@Pc(182) Class3_Sub7_Sub13_Sub2 local182 = (Class3_Sub7_Sub13_Sub2) arg0;
		@Pc(192) Class3_Sub7_Sub13_Sub2 local192;
		if (local182 != null && local182.method6386(local172, local179)) {
			local192 = local182;
			local182.method6389();
		} else {
			local192 = new Class3_Sub7_Sub13_Sub2(this.aClass45_Sub2_3, local172, local179);
		}
		local192.method6391(local57, local113, local40, local129);
		this.method1651(local192);
		return local192;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!q;Lclient!ufa;II)V")
	@Override
	public void method7224(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class41_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1813 == 0) {
			return;
		}
		@Pc(13) Class11_Sub1 local13 = this.aClass45_Sub2_3.aClass11_Sub1_16;
		@Pc(16) Class11_Sub1 local16 = (Class11_Sub1) arg0;
		if (!this.aBoolean157) {
			this.method1661();
		}
		Static552.aFloat179 = local13.aFloat6 * local16.aFloat10 + local16.aFloat12 * local13.aFloat13 + local13.aFloat7 * local16.aFloat2 + local13.aFloat2;
		Static267.aFloat100 = local16.aFloat13 * local13.aFloat7 + local16.aFloat4 * local13.aFloat6 + local16.aFloat5 * local13.aFloat13;
		@Pc(69) float local69 = (float) this.anInt1773 * Static267.aFloat100 + Static552.aFloat179;
		@Pc(77) float local77 = Static552.aFloat179 + (float) this.anInt1769 * Static267.aFloat100;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.anInt1822;
			local93 = (float) -this.anInt1822 + local77;
		} else {
			local87 = (float) this.anInt1822 + local77;
			local93 = local69 - (float) this.anInt1822;
		}
		if (local93 >= this.aClass45_Sub2_3.aFloat130 || local87 <= (float) this.aClass45_Sub2_3.anInt5836) {
			return;
		}
		Static124.aFloat172 = local13.aFloat10 + local13.aFloat4 * local16.aFloat12 + local16.aFloat10 * local13.aFloat3 + local16.aFloat2 * local13.aFloat9;
		Static34.aFloat16 = local16.aFloat4 * local13.aFloat3 + local13.aFloat4 * local16.aFloat5 + local16.aFloat13 * local13.aFloat9;
		@Pc(170) float local170 = Static124.aFloat172 + Static34.aFloat16 * (float) this.anInt1773;
		@Pc(178) float local178 = (float) this.anInt1769 * Static34.aFloat16 + Static124.aFloat172;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local178 < local170) {
			local194 = (float) this.aClass45_Sub2_3.anInt5849 * (local178 - (float) this.anInt1822);
			local205 = ((float) this.anInt1822 + local170) * (float) this.aClass45_Sub2_3.anInt5849;
		} else {
			local194 = (float) this.aClass45_Sub2_3.anInt5849 * ((float) -this.anInt1822 + local170);
			local205 = (local178 + (float) this.anInt1822) * (float) this.aClass45_Sub2_3.anInt5849;
		}
		if (this.aClass45_Sub2_3.aFloat125 <= local194 / (float) arg2 || local205 / (float) arg2 <= this.aClass45_Sub2_3.aFloat124) {
			return;
		}
		Static230.aFloat97 = local13.aFloat12 + local16.aFloat12 * local13.aFloat5 + local13.aFloat8 * local16.aFloat10 + local16.aFloat2 * local13.aFloat11;
		Static183.aFloat90 = local16.aFloat4 * local13.aFloat8 + local16.aFloat5 * local13.aFloat5 + local16.aFloat13 * local13.aFloat11;
		@Pc(296) float local296 = (float) this.anInt1773 * Static183.aFloat90 + Static230.aFloat97;
		@Pc(304) float local304 = Static230.aFloat97 + Static183.aFloat90 * (float) this.anInt1769;
		@Pc(331) float local331;
		@Pc(319) float local319;
		if (local304 < local296) {
			local319 = ((float) this.anInt1822 + local296) * (float) this.aClass45_Sub2_3.anInt5870;
			local331 = (float) this.aClass45_Sub2_3.anInt5870 * ((float) -this.anInt1822 + local304);
		} else {
			local331 = (float) this.aClass45_Sub2_3.anInt5870 * ((float) -this.anInt1822 + local296);
			local319 = (float) this.aClass45_Sub2_3.anInt5870 * (local304 + (float) this.anInt1822);
		}
		if (local331 / (float) arg2 >= this.aClass45_Sub2_3.aFloat126 || local319 / (float) arg2 <= this.aClass45_Sub2_3.aFloat122) {
			return;
		}
		if (arg1 != null || this.aClass141Array1 != null) {
			Static14.aFloat14 = local13.aFloat7 * local16.aFloat6 + local16.aFloat3 * local13.aFloat6 + local16.aFloat8 * local13.aFloat13;
			Static19.aFloat15 = local16.aFloat6 * local13.aFloat9 + local13.aFloat4 * local16.aFloat8 + local13.aFloat3 * local16.aFloat3;
			Static465.aFloat148 = local13.aFloat5 * local16.aFloat11 + local13.aFloat8 * local16.aFloat9 + local13.aFloat11 * local16.aFloat7;
			Static204.aFloat93 = local16.aFloat3 * local13.aFloat8 + local13.aFloat5 * local16.aFloat8 + local16.aFloat6 * local13.aFloat11;
			Static530.aFloat157 = local13.aFloat13 * local16.aFloat11 + local13.aFloat6 * local16.aFloat9 + local16.aFloat7 * local13.aFloat7;
			Static573.aFloat205 = local13.aFloat3 * local16.aFloat9 + local13.aFloat4 * local16.aFloat11 + local13.aFloat9 * local16.aFloat7;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.anInt1815 + this.anInt1821 >> 1;
			@Pc(507) int local507 = this.anInt1801 + this.anInt1760 >> 1;
			@Pc(526) int local526 = (int) (Static19.aFloat15 * (float) local499 + Static124.aFloat172 + (float) this.anInt1773 * Static34.aFloat16 + (float) local507 * Static573.aFloat205);
			@Pc(545) int local545 = (int) ((float) local507 * Static465.aFloat148 + Static230.aFloat97 + (float) local499 * Static204.aFloat93 + Static183.aFloat90 * (float) this.anInt1773);
			@Pc(564) int local564 = (int) (Static552.aFloat179 + (float) local499 * Static14.aFloat14 + Static267.aFloat100 * (float) this.anInt1773 + Static530.aFloat157 * (float) local507);
			@Pc(583) int local583 = (int) ((float) local507 * Static573.aFloat205 + Static124.aFloat172 + Static19.aFloat15 * (float) local499 + (float) this.anInt1769 * Static34.aFloat16);
			@Pc(602) int local602 = (int) (Static230.aFloat97 + (float) local499 * Static204.aFloat93 + (float) this.anInt1769 * Static183.aFloat90 + Static465.aFloat148 * (float) local507);
			arg1.anInt8514 = this.aClass45_Sub2_3.anInt5870 * local602 / arg2 + this.aClass45_Sub2_3.anInt5862;
			arg1.anInt8512 = this.aClass45_Sub2_3.anInt5857 + this.aClass45_Sub2_3.anInt5849 * local583 / arg2;
			arg1.anInt8516 = this.aClass45_Sub2_3.anInt5862 + this.aClass45_Sub2_3.anInt5870 * local545 / arg2;
			@Pc(660) int local660 = (int) (Static530.aFloat157 * (float) local507 + Static14.aFloat14 * (float) local499 + Static552.aFloat179 + (float) this.anInt1769 * Static267.aFloat100);
			arg1.anInt8513 = this.aClass45_Sub2_3.anInt5857 + this.aClass45_Sub2_3.anInt5849 * local526 / arg2;
			if (this.aClass45_Sub2_3.anInt5836 <= local564 || this.aClass45_Sub2_3.anInt5836 <= local660) {
				arg1.aBoolean658 = true;
				arg1.anInt8515 = (local526 + this.anInt1822) * this.aClass45_Sub2_3.anInt5849 / arg2 + this.aClass45_Sub2_3.anInt5857 - arg1.anInt8513;
			}
		}
		this.aClass45_Sub2_3.method4962((float) arg2);
		this.aClass45_Sub2_3.method4938();
		this.aClass45_Sub2_3.method4966(local16);
		this.method1662();
		this.method1654();
	}

	@OriginalMember(owner = "client!d", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static447.anInt7476 = 0;
			local29 = 0;
			Static32.anInt606 = 0;
			Static528.anInt8169 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray33.length) {
					local51 = this.anIntArrayArray33[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray19 == null || (arg6 & this.aShortArray19[local59]) != 0) {
							Static528.anInt8169 += this.anIntArray83[local59];
							Static32.anInt606 += this.anIntArray82[local59];
							local29++;
							Static447.anInt7476 += this.anIntArray85[local59];
						}
					}
				}
			}
			if (local29 > 0) {
				Static55.aBoolean101 = true;
				Static32.anInt606 = arg3 + Static32.anInt606 / local29;
				Static528.anInt8169 = arg2 + Static528.anInt8169 / local29;
				Static447.anInt7476 = Static447.anInt7476 / local29 + arg4;
			} else {
				Static528.anInt8169 = arg2;
				Static447.anInt7476 = arg4;
				Static32.anInt606 = arg3;
			}
			return;
		}
		@Pc(253) int[] local253;
		@Pc(255) int local255;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[2] * arg4 + arg3 * arg7[1] + arg7[0] * arg2 + 8192 >> 14;
				local35 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local41 = arg2 * arg7[6] + arg3 * arg7[7] + arg7[8] * arg4 + 8192 >> 14;
				arg3 = local35;
				arg2 = local29;
				arg4 = local41;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray33.length) {
					local253 = this.anIntArrayArray33[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local53 = local253[local255];
						if (this.aShortArray19 == null || (this.aShortArray19[local53] & arg6) != 0) {
							this.anIntArray83[local53] += arg2;
							this.anIntArray82[local53] += arg3;
							this.anIntArray85[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(383) int local383;
		@Pc(402) int local402;
		@Pc(628) int local628;
		@Pc(637) int local637;
		@Pc(646) int local646;
		@Pc(650) int local650;
		@Pc(668) int local668;
		@Pc(1003) int local1003;
		@Pc(1011) int local1011;
		@Pc(1166) int local1166;
		@Pc(1191) int local1191;
		@Pc(1195) int local1195;
		@Pc(1204) int local1204;
		@Pc(1209) int local1209;
		@Pc(1213) int local1213;
		@Pc(1217) int local1217;
		@Pc(1219) int local1219;
		@Pc(1350) int[] local1350;
		@Pc(1352) int local1352;
		@Pc(1356) int local1356;
		@Pc(1360) int local1360;
		@Pc(1362) int local1362;
		@Pc(1489) int local1489;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray33.length) {
						local253 = this.anIntArrayArray33[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local53 = local253[local255];
							if (this.aShortArray19 == null || (arg6 & this.aShortArray19[local53]) != 0) {
								this.anIntArray83[local53] -= Static528.anInt8169;
								this.anIntArray82[local53] -= Static32.anInt606;
								this.anIntArray85[local53] -= Static447.anInt7476;
								if (arg4 != 0) {
									local59 = Class356.anIntArray597[arg4];
									local383 = Class356.anIntArray598[arg4];
									local402 = this.anIntArray82[local53] * local59 + this.anIntArray83[local53] * local383 + 16383 >> 14;
									this.anIntArray82[local53] = local383 * this.anIntArray82[local53] + 16383 - this.anIntArray83[local53] * local59 >> 14;
									this.anIntArray83[local53] = local402;
								}
								if (arg2 != 0) {
									local59 = Class356.anIntArray597[arg2];
									local383 = Class356.anIntArray598[arg2];
									local402 = this.anIntArray82[local53] * local383 + 16383 - this.anIntArray85[local53] * local59 >> 14;
									this.anIntArray85[local53] = local59 * this.anIntArray82[local53] + this.anIntArray85[local53] * local383 + 16383 >> 14;
									this.anIntArray82[local53] = local402;
								}
								if (arg3 != 0) {
									local59 = Class356.anIntArray597[arg3];
									local383 = Class356.anIntArray598[arg3];
									local402 = this.anIntArray85[local53] * local59 + this.anIntArray83[local53] * local383 + 16383 >> 14;
									this.anIntArray85[local53] = this.anIntArray85[local53] * local383 + 16383 - local59 * this.anIntArray83[local53] >> 14;
									this.anIntArray83[local53] = local402;
								}
								this.anIntArray83[local53] += Static528.anInt8169;
								this.anIntArray82[local53] += Static32.anInt606;
								this.anIntArray85[local53] += Static447.anInt7476;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray33.length) {
							local51 = this.anIntArrayArray33[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray19 == null || (arg6 & this.aShortArray19[local59]) != 0) {
									local383 = this.anIntArray81[local59];
									local402 = this.anIntArray81[local59 + 1];
									for (local628 = local383; local628 < local402; local628++) {
										local637 = this.aShortArray21[local628] - 1;
										if (local637 == -1) {
											break;
										}
										if (arg4 != 0) {
											local646 = Class356.anIntArray597[arg4];
											local650 = Class356.anIntArray598[arg4];
											local668 = local650 * this.aShortArray12[local637] + this.aShortArray17[local637] * local646 + 16383 >> 14;
											this.aShortArray17[local637] = (short) (local650 * this.aShortArray17[local637] + 16383 - this.aShortArray12[local637] * local646 >> 14);
											this.aShortArray12[local637] = (short) local668;
										}
										if (arg2 != 0) {
											local646 = Class356.anIntArray597[arg2];
											local650 = Class356.anIntArray598[arg2];
											local668 = this.aShortArray17[local637] * local650 + 16383 - this.aShortArray23[local637] * local646 >> 14;
											this.aShortArray23[local637] = (short) (local646 * this.aShortArray17[local637] + local650 * this.aShortArray23[local637] + 16383 >> 14);
											this.aShortArray17[local637] = (short) local668;
										}
										if (arg3 != 0) {
											local646 = Class356.anIntArray597[arg3];
											local650 = Class356.anIntArray598[arg3];
											local668 = local646 * this.aShortArray23[local637] + this.aShortArray12[local637] * local650 + 16383 >> 14;
											this.aShortArray23[local637] = (short) (this.aShortArray23[local637] * local650 + 16383 - this.aShortArray12[local637] * local646 >> 14);
											this.aShortArray12[local637] = (short) local668;
										}
									}
								}
							}
						}
					}
					this.method1664();
					return;
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local255 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static55.aBoolean101) {
					local383 = arg7[0] * Static528.anInt8169 + arg7[3] * Static32.anInt606 + arg7[6] * Static447.anInt7476 + 8192 >> 14;
					local402 = arg7[7] * Static447.anInt7476 + arg7[4] * Static32.anInt606 + Static528.anInt8169 * arg7[1] + 8192 >> 14;
					local402 += local53;
					local383 += local255;
					local628 = Static447.anInt7476 * arg7[8] + Static528.anInt8169 * arg7[2] + arg7[5] * Static32.anInt606 + 8192 >> 14;
					local628 += local59;
					Static32.anInt606 = local402;
					Static528.anInt8169 = local383;
					Static55.aBoolean101 = false;
					Static447.anInt7476 = local628;
				}
				@Pc(971) int[] local971 = new int[9];
				local402 = Class356.anIntArray598[arg2];
				local628 = Class356.anIntArray597[arg2];
				local637 = Class356.anIntArray598[arg3];
				local646 = Class356.anIntArray597[arg3];
				local650 = Class356.anIntArray598[arg4];
				local668 = Class356.anIntArray597[arg4];
				local1003 = local628 * local650 + 8192 >> 14;
				local1011 = local628 * local668 + 8192 >> 14;
				local971[1] = local1003 * local646 + local668 * -local637 + 8192 >> 14;
				local971[2] = local646 * local402 + 8192 >> 14;
				local971[8] = local402 * local637 + 8192 >> 14;
				local971[0] = local646 * local1011 + local650 * local637 + 8192 >> 14;
				local971[7] = local1003 * local637 + local668 * local646 + 8192 >> 14;
				local971[4] = local650 * local402 + 8192 >> 14;
				local971[5] = -local628;
				local971[3] = local668 * local402 + 8192 >> 14;
				local971[6] = local1011 * local637 + local650 * -local646 + 8192 >> 14;
				@Pc(1140) int local1140 = -Static32.anInt606 * local971[1] + local971[0] * -Static528.anInt8169 + local971[2] * -Static447.anInt7476 + 8192 >> 14;
				local1166 = -Static32.anInt606 * local971[4] + -Static528.anInt8169 * local971[3] + -Static447.anInt7476 * local971[5] + 8192 >> 14;
				local1191 = -Static447.anInt7476 * local971[8] + local971[7] * -Static32.anInt606 + local971[6] * -Static528.anInt8169 + 8192 >> 14;
				local1195 = Static528.anInt8169 + local1140;
				@Pc(1200) int local1200 = local1166 + Static32.anInt606;
				local1204 = Static447.anInt7476 + local1191;
				@Pc(1207) int[] local1207 = new int[9];
				for (local1209 = 0; local1209 < 3; local1209++) {
					for (local1213 = 0; local1213 < 3; local1213++) {
						local1217 = 0;
						for (local1219 = 0; local1219 < 3; local1219++) {
							local1217 += local971[local1209 * 3 + local1219] * arg7[local1213 * 3 + local1219];
						}
						local1207[local1213 + local1209 * 3] = local1217 + 8192 >> 14;
					}
				}
				local1213 = local59 * local971[2] + local971[0] * local255 + local971[1] * local53 + 8192 >> 14;
				local1217 = local971[3] * local255 + local971[4] * local53 + local971[5] * local59 + 8192 >> 14;
				local1219 = local971[8] * local59 + local971[6] * local255 + local53 * local971[7] + 8192 >> 14;
				local1213 += local1195;
				local1217 += local1200;
				local1219 += local1204;
				local1350 = new int[9];
				for (local1352 = 0; local1352 < 3; local1352++) {
					for (local1356 = 0; local1356 < 3; local1356++) {
						local1360 = 0;
						for (local1362 = 0; local1362 < 3; local1362++) {
							local1360 += arg7[local1352 * 3 + local1362] * local1207[local1362 * 3 + local1356];
						}
						local1350[local1352 * 3 + local1356] = local1360 + 8192 >> 14;
					}
				}
				local1356 = arg7[0] * local1213 + local1217 * arg7[1] + local1219 * arg7[2] + 8192 >> 14;
				local1360 = local1219 * arg7[5] + local1217 * arg7[4] + arg7[3] * local1213 + 8192 >> 14;
				local1360 += local35;
				local1362 = local1213 * arg7[6] + arg7[7] * local1217 + local1219 * arg7[8] + 8192 >> 14;
				local1356 += local29;
				local1362 += local41;
				for (local1489 = 0; local1489 < local8; local1489++) {
					@Pc(1495) int local1495 = arg1[local1489];
					if (this.anIntArrayArray33.length > local1495) {
						@Pc(1505) int[] local1505 = this.anIntArrayArray33[local1495];
						for (@Pc(1507) int local1507 = 0; local1507 < local1505.length; local1507++) {
							@Pc(1513) int local1513 = local1505[local1507];
							if (this.aShortArray19 == null || (this.aShortArray19[local1513] & arg6) != 0) {
								@Pc(1557) int local1557 = local1350[1] * this.anIntArray82[local1513] + this.anIntArray83[local1513] * local1350[0] + this.anIntArray85[local1513] * local1350[2] + 8192 >> 14;
								@Pc(1588) int local1588 = this.anIntArray82[local1513] * local1350[4] + this.anIntArray83[local1513] * local1350[3] + local1350[5] * this.anIntArray85[local1513] + 8192 >> 14;
								@Pc(1592) int local1592 = local1588 + local1360;
								@Pc(1623) int local1623 = this.anIntArray85[local1513] * local1350[8] + local1350[6] * this.anIntArray83[local1513] + this.anIntArray82[local1513] * local1350[7] + 8192 >> 14;
								@Pc(1627) int local1627 = local1557 + local1356;
								@Pc(1631) int local1631 = local1623 + local1362;
								this.anIntArray83[local1513] = local1627;
								this.anIntArray82[local1513] = local1592;
								this.anIntArray85[local1513] = local1631;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2583) Class184 local2583;
			@Pc(2468) boolean local2468;
			@Pc(2578) Class141 local2578;
			if (arg0 == 5) {
				if (this.anIntArrayArray34 != null) {
					local2468 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray34.length) {
							local51 = this.anIntArrayArray34[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray18 == null || (arg6 & this.aShortArray18[local59]) != 0) {
									local383 = arg2 * 8 + (this.aByteArray22[local59] & 0xFF);
									if (local383 < 0) {
										local383 = 0;
									} else if (local383 > 255) {
										local383 = 255;
									}
									this.aByteArray22[local59] = (byte) local383;
								}
							}
							local2468 |= local51.length > 0;
						}
					}
					if (local2468) {
						if (this.aClass141Array1 != null) {
							for (local41 = 0; local41 < this.anInt1817; local41++) {
								local2578 = this.aClass141Array1[local41];
								local2583 = this.aClass184Array1[local41];
								local2583.anInt4892 = local2583.anInt4892 & 0xFFFFFF | 255 - (this.aByteArray22[local2578.anInt3919] & 0xFF) << 24;
							}
						}
						this.method1667();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray34 != null) {
					local2468 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray34.length > local41) {
							local51 = this.anIntArrayArray34[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray18 == null || (arg6 & this.aShortArray18[local59]) != 0) {
									local383 = this.aShortArray14[local59] & 0xFFFF;
									local402 = local383 >> 10 & 0x3F;
									local628 = local383 >> 7 & 0x7;
									local637 = local383 & 0x7F;
									local628 += arg3 / 4;
									@Pc(2695) int local2695 = local402 + arg2 & 0x3F;
									if (local628 < 0) {
										local628 = 0;
									} else if (local628 > 7) {
										local628 = 7;
									}
									local637 += arg4;
									if (local637 < 0) {
										local637 = 0;
									} else if (local637 > 127) {
										local637 = 127;
									}
									this.aShortArray14[local59] = (short) (local637 | local2695 << 10 | local628 << 7);
								}
							}
							local2468 |= local51.length > 0;
						}
					}
					if (local2468) {
						if (this.aClass141Array1 != null) {
							for (local41 = 0; local41 < this.anInt1817; local41++) {
								local2578 = this.aClass141Array1[local41];
								local2583 = this.aClass184Array1[local41];
								local2583.anInt4892 = local2583.anInt4892 & 0xFF000000 | Static214.anIntArray203[this.aShortArray14[local2578.anInt3919] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method1667();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray35 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray35.length > local35) {
							local253 = this.anIntArrayArray35[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2583 = this.aClass184Array1[local253[local255]];
								local2583.anInt4893 += arg3;
								local2583.anInt4884 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray35 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray35.length > local35) {
							local253 = this.anIntArrayArray35[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2583 = this.aClass184Array1[local253[local255]];
								local2583.anInt4887 = local2583.anInt4887 * arg3 >> 7;
								local2583.anInt4891 = arg2 * local2583.anInt4891 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray35 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray35.length > local35) {
						local253 = this.anIntArrayArray35[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local2583 = this.aClass184Array1[local253[local255]];
							local2583.anInt4889 = arg2 + local2583.anInt4889 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray33.length > local35) {
					local253 = this.anIntArrayArray33[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local53 = local253[local255];
						if (this.aShortArray19 == null || (this.aShortArray19[local53] & arg6) != 0) {
							this.anIntArray83[local53] -= Static528.anInt8169;
							this.anIntArray82[local53] -= Static32.anInt606;
							this.anIntArray85[local53] -= Static447.anInt7476;
							this.anIntArray83[local53] = arg2 * this.anIntArray83[local53] >> 7;
							this.anIntArray82[local53] = this.anIntArray82[local53] * arg3 >> 7;
							this.anIntArray85[local53] = arg4 * this.anIntArray85[local53] >> 7;
							this.anIntArray83[local53] += Static528.anInt8169;
							this.anIntArray82[local53] += Static32.anInt606;
							this.anIntArray85[local53] += Static447.anInt7476;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local255 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static55.aBoolean101) {
				local383 = arg7[6] * Static447.anInt7476 + arg7[0] * Static528.anInt8169 + arg7[3] * Static32.anInt606 + 8192 >> 14;
				local402 = arg7[7] * Static447.anInt7476 + arg7[1] * Static528.anInt8169 + Static32.anInt606 * arg7[4] + 8192 >> 14;
				local402 += local53;
				local628 = arg7[8] * Static447.anInt7476 + arg7[5] * Static32.anInt606 + arg7[2] * Static528.anInt8169 + 8192 >> 14;
				local383 += local255;
				local628 += local59;
				Static528.anInt8169 = local383;
				Static32.anInt606 = local402;
				Static55.aBoolean101 = false;
				Static447.anInt7476 = local628;
			}
			local383 = arg2 << 15 >> 7;
			local402 = arg3 << 15 >> 7;
			local628 = arg4 << 15 >> 7;
			local637 = local383 * -Static528.anInt8169 + 8192 >> 14;
			local646 = local402 * -Static32.anInt606 + 8192 >> 14;
			local650 = local628 * -Static447.anInt7476 + 8192 >> 14;
			local668 = local637 + Static528.anInt8169;
			local1003 = local646 + Static32.anInt606;
			local1011 = Static447.anInt7476 + local650;
			@Pc(1852) int[] local1852 = new int[] { local383 * arg7[0] + 8192 >> 14, local383 * arg7[3] + 8192 >> 14, local383 * arg7[6] + 8192 >> 14, local402 * arg7[1] + 8192 >> 14, arg7[4] * local402 + 8192 >> 14, arg7[7] * local402 + 8192 >> 14, local628 * arg7[2] + 8192 >> 14, local628 * arg7[5] + 8192 >> 14, local628 * arg7[8] + 8192 >> 14 };
			local1166 = local383 * local255 + 8192 >> 14;
			local1191 = local53 * local402 + 8192 >> 14;
			@Pc(1980) int local1980 = local1166 + local668;
			local1195 = local628 * local59 + 8192 >> 14;
			@Pc(1992) int local1992 = local1191 + local1003;
			@Pc(1996) int local1996 = local1195 + local1011;
			@Pc(1999) int[] local1999 = new int[9];
			@Pc(2005) int local2005;
			for (local1204 = 0; local1204 < 3; local1204++) {
				for (local2005 = 0; local2005 < 3; local2005++) {
					local1209 = 0;
					for (local1213 = 0; local1213 < 3; local1213++) {
						local1209 += local1852[local2005 + local1213 * 3] * arg7[local1213 + local1204 * 3];
					}
					local1999[local1204 * 3 + local2005] = local1209 + 8192 >> 14;
				}
			}
			local2005 = arg7[2] * local1996 + arg7[1] * local1992 + local1980 * arg7[0] + 8192 >> 14;
			local1209 = local1996 * arg7[5] + local1980 * arg7[3] + local1992 * arg7[4] + 8192 >> 14;
			local1209 += local35;
			local1213 = local1980 * arg7[6] + arg7[7] * local1992 + local1996 * arg7[8] + 8192 >> 14;
			local2005 += local29;
			local1213 += local41;
			for (local1217 = 0; local1217 < local8; local1217++) {
				local1219 = arg1[local1217];
				if (local1219 < this.anIntArrayArray33.length) {
					local1350 = this.anIntArrayArray33[local1219];
					for (local1352 = 0; local1352 < local1350.length; local1352++) {
						local1356 = local1350[local1352];
						if (this.aShortArray19 == null || (this.aShortArray19[local1356] & arg6) != 0) {
							local1360 = local1999[1] * this.anIntArray82[local1356] + this.anIntArray83[local1356] * local1999[0] + this.anIntArray85[local1356] * local1999[2] + 8192 >> 14;
							local1362 = this.anIntArray85[local1356] * local1999[5] + local1999[4] * this.anIntArray82[local1356] + local1999[3] * this.anIntArray83[local1356] + 8192 >> 14;
							@Pc(2247) int local2247 = local1360 + local2005;
							local1489 = this.anIntArray85[local1356] * local1999[8] + local1999[6] * this.anIntArray83[local1356] + local1999[7] * this.anIntArray82[local1356] + 8192 >> 14;
							@Pc(2283) int local2283 = local1362 + local1209;
							this.anIntArray83[local1356] = local2247;
							@Pc(2292) int local2292 = local1489 + local1213;
							this.anIntArray82[local1356] = local2283;
							this.anIntArray85[local1356] = local2292;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class60 method7229(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(33) Class60_Sub1 local33;
		@Pc(29) Class60_Sub1 local29;
		if (arg0 == 1) {
			local29 = this.aClass45_Sub2_3.aClass60_Sub1_30;
			local33 = this.aClass45_Sub2_3.aClass60_Sub1_29;
		} else if (arg0 == 2) {
			local29 = this.aClass45_Sub2_3.aClass60_Sub1_27;
			local33 = this.aClass45_Sub2_3.aClass60_Sub1_24;
		} else if (arg0 == 3) {
			local29 = this.aClass45_Sub2_3.aClass60_Sub1_25;
			local33 = this.aClass45_Sub2_3.aClass60_Sub1_26;
		} else if (arg0 == 4) {
			local29 = this.aClass45_Sub2_3.aClass60_Sub1_21;
			local33 = this.aClass45_Sub2_3.aClass60_Sub1_22;
		} else if (arg0 == 5) {
			local33 = this.aClass45_Sub2_3.aClass60_Sub1_23;
			local29 = this.aClass45_Sub2_3.aClass60_Sub1_28;
		} else {
			local33 = local29 = new Class60_Sub1(this.aClass45_Sub2_3, 0, 0, true, false);
		}
		return this.method1666(arg1, local33, arg2, arg0 != 0, local29);
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
	private void method1658() {
		if (this.aClass193_1 != null) {
			this.aClass193_1.aBoolean380 = false;
		}
	}

	@OriginalMember(owner = "client!d", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class356.anIntArray597[arg0];
		@Pc(13) int local13 = Class356.anIntArray598[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1775; local15++) {
			@Pc(33) int local33 = this.anIntArray85[local15] * local9 + local13 * this.anIntArray83[local15] >> 14;
			this.anIntArray85[local15] = local13 * this.anIntArray85[local15] - this.anIntArray83[local15] * local9 >> 14;
			this.anIntArray83[local15] = local33;
		}
		this.method1660();
		this.aBoolean157 = false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7236(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			Static32.anInt606 = 0;
			local26 = 0;
			Static447.anInt7476 = 0;
			Static528.anInt8169 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray33.length > local38) {
					local52 = this.anIntArrayArray33[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static528.anInt8169 += this.anIntArray83[local60];
						Static32.anInt606 += this.anIntArray82[local60];
						local26++;
						Static447.anInt7476 += this.anIntArray85[local60];
					}
				}
			}
			if (local26 <= 0) {
				Static528.anInt8169 = local14;
				Static32.anInt606 = local22;
				Static447.anInt7476 = local18;
			} else {
				Static447.anInt7476 = local18 + Static447.anInt7476 / local26;
				Static528.anInt8169 = Static528.anInt8169 / local26 + local14;
				Static32.anInt606 = local22 + Static32.anInt606 / local26;
			}
			return;
		}
		@Pc(152) int[] local152;
		@Pc(154) int local154;
		if (arg0 == 1) {
			local18 = arg4 << 4;
			local14 = arg2 << 4;
			local22 = arg3 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray33.length) {
					local152 = this.anIntArrayArray33[local32];
					for (local154 = 0; local154 < local152.length; local154++) {
						local54 = local152[local154];
						this.anIntArray83[local54] += local14;
						this.anIntArray82[local54] += local22;
						this.anIntArray85[local54] += local18;
					}
				}
			}
			return;
		}
		@Pc(274) int local274;
		@Pc(293) int local293;
		@Pc(747) int local747;
		@Pc(756) int local756;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray33.length > local32) {
					local152 = this.anIntArrayArray33[local32];
					if ((arg5 & 0x1) == 0) {
						for (local154 = 0; local154 < local152.length; local154++) {
							local54 = local152[local154];
							this.anIntArray83[local54] -= Static528.anInt8169;
							this.anIntArray82[local54] -= Static32.anInt606;
							this.anIntArray85[local54] -= Static447.anInt7476;
							if (arg4 != 0) {
								local60 = Class356.anIntArray597[arg4];
								local274 = Class356.anIntArray598[arg4];
								local293 = this.anIntArray82[local54] * local60 + this.anIntArray83[local54] * local274 + 16383 >> 14;
								this.anIntArray82[local54] = local274 * this.anIntArray82[local54] + 16383 - local60 * this.anIntArray83[local54] >> 14;
								this.anIntArray83[local54] = local293;
							}
							if (arg2 != 0) {
								local60 = Class356.anIntArray597[arg2];
								local274 = Class356.anIntArray598[arg2];
								local293 = this.anIntArray82[local54] * local274 + 16383 - this.anIntArray85[local54] * local60 >> 14;
								this.anIntArray85[local54] = this.anIntArray85[local54] * local274 + local60 * this.anIntArray82[local54] + 16383 >> 14;
								this.anIntArray82[local54] = local293;
							}
							if (arg3 != 0) {
								local60 = Class356.anIntArray597[arg3];
								local274 = Class356.anIntArray598[arg3];
								local293 = local274 * this.anIntArray83[local54] + this.anIntArray85[local54] * local60 + 16383 >> 14;
								this.anIntArray85[local54] = this.anIntArray85[local54] * local274 + 16383 - local60 * this.anIntArray83[local54] >> 14;
								this.anIntArray83[local54] = local293;
							}
							this.anIntArray83[local54] += Static528.anInt8169;
							this.anIntArray82[local54] += Static32.anInt606;
							this.anIntArray85[local54] += Static447.anInt7476;
						}
					} else {
						for (local154 = 0; local154 < local152.length; local154++) {
							local54 = local152[local154];
							this.anIntArray83[local54] -= Static528.anInt8169;
							this.anIntArray82[local54] -= Static32.anInt606;
							this.anIntArray85[local54] -= Static447.anInt7476;
							if (arg2 != 0) {
								local60 = Class356.anIntArray597[arg2];
								local274 = Class356.anIntArray598[arg2];
								local293 = this.anIntArray82[local54] * local274 + 16383 - this.anIntArray85[local54] * local60 >> 14;
								this.anIntArray85[local54] = local60 * this.anIntArray82[local54] + local274 * this.anIntArray85[local54] + 16383 >> 14;
								this.anIntArray82[local54] = local293;
							}
							if (arg4 != 0) {
								local60 = Class356.anIntArray597[arg4];
								local274 = Class356.anIntArray598[arg4];
								local293 = local60 * this.anIntArray82[local54] + this.anIntArray83[local54] * local274 + 16383 >> 14;
								this.anIntArray82[local54] = this.anIntArray82[local54] * local274 + 16383 - this.anIntArray83[local54] * local60 >> 14;
								this.anIntArray83[local54] = local293;
							}
							if (arg3 != 0) {
								local60 = Class356.anIntArray597[arg3];
								local274 = Class356.anIntArray598[arg3];
								local293 = this.anIntArray85[local54] * local60 + this.anIntArray83[local54] * local274 + 16383 >> 14;
								this.anIntArray85[local54] = this.anIntArray85[local54] * local274 + 16383 - local60 * this.anIntArray83[local54] >> 14;
								this.anIntArray83[local54] = local293;
							}
							this.anIntArray83[local54] += Static528.anInt8169;
							this.anIntArray82[local54] += Static32.anInt606;
							this.anIntArray85[local54] += Static447.anInt7476;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray33.length) {
						local52 = this.anIntArrayArray33[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local274 = this.anIntArray81[local60];
							local293 = this.anIntArray81[local60 + 1];
							for (local747 = local274; local747 < local293; local747++) {
								local756 = this.aShortArray21[local747] - 1;
								if (local756 == -1) {
									break;
								}
								@Pc(765) int local765;
								@Pc(769) int local769;
								@Pc(788) int local788;
								if (arg4 != 0) {
									local765 = Class356.anIntArray597[arg4];
									local769 = Class356.anIntArray598[arg4];
									local788 = this.aShortArray17[local756] * local765 + this.aShortArray12[local756] * local769 + 16383 >> 14;
									this.aShortArray17[local756] = (short) (this.aShortArray17[local756] * local769 + 16383 - local765 * this.aShortArray12[local756] >> 14);
									this.aShortArray12[local756] = (short) local788;
								}
								if (arg2 != 0) {
									local765 = Class356.anIntArray597[arg2];
									local769 = Class356.anIntArray598[arg2];
									local788 = this.aShortArray17[local756] * local769 + 16383 - this.aShortArray23[local756] * local765 >> 14;
									this.aShortArray23[local756] = (short) (this.aShortArray17[local756] * local765 + local769 * this.aShortArray23[local756] + 16383 >> 14);
									this.aShortArray17[local756] = (short) local788;
								}
								if (arg3 != 0) {
									local765 = Class356.anIntArray597[arg3];
									local769 = Class356.anIntArray598[arg3];
									local788 = this.aShortArray12[local756] * local769 + local765 * this.aShortArray23[local756] + 16383 >> 14;
									this.aShortArray23[local756] = (short) (this.aShortArray23[local756] * local769 + 16383 - local765 * this.aShortArray12[local756] >> 14);
									this.aShortArray12[local756] = (short) local788;
								}
							}
						}
					}
				}
				this.method1664();
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray33.length > local32) {
					local152 = this.anIntArrayArray33[local32];
					for (local154 = 0; local154 < local152.length; local154++) {
						local54 = local152[local154];
						this.anIntArray83[local54] -= Static528.anInt8169;
						this.anIntArray82[local54] -= Static32.anInt606;
						this.anIntArray85[local54] -= Static447.anInt7476;
						this.anIntArray83[local54] = arg2 * this.anIntArray83[local54] >> 7;
						this.anIntArray82[local54] = arg3 * this.anIntArray82[local54] >> 7;
						this.anIntArray85[local54] = arg4 * this.anIntArray85[local54] >> 7;
						this.anIntArray83[local54] += Static528.anInt8169;
						this.anIntArray82[local54] += Static32.anInt606;
						this.anIntArray85[local54] += Static447.anInt7476;
					}
				}
			}
		} else {
			@Pc(1200) Class184 local1200;
			@Pc(1094) boolean local1094;
			@Pc(1195) Class141 local1195;
			if (arg0 == 5) {
				if (this.anIntArrayArray34 != null) {
					local1094 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray34.length) {
							local52 = this.anIntArrayArray34[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local274 = arg2 * 8 + (this.aByteArray22[local60] & 0xFF);
								if (local274 < 0) {
									local274 = 0;
								} else if (local274 > 255) {
									local274 = 255;
								}
								this.aByteArray22[local60] = (byte) local274;
							}
							local1094 |= local52.length > 0;
						}
					}
					if (local1094) {
						if (this.aClass141Array1 != null) {
							for (local38 = 0; local38 < this.anInt1817; local38++) {
								local1195 = this.aClass141Array1[local38];
								local1200 = this.aClass184Array1[local38];
								local1200.anInt4892 = local1200.anInt4892 & 0xFFFFFF | 255 - (this.aByteArray22[local1195.anInt3919] & 0xFF) << 24;
							}
						}
						this.method1667();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray34 != null) {
					local1094 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray34.length) {
							local52 = this.anIntArrayArray34[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local274 = this.aShortArray14[local60] & 0xFFFF;
								local293 = local274 >> 10 & 0x3F;
								local747 = local274 >> 7 & 0x7;
								local747 += arg3 / 4;
								local756 = local274 & 0x7F;
								@Pc(1301) int local1301 = arg2 + local293 & 0x3F;
								if (local747 < 0) {
									local747 = 0;
								} else if (local747 > 7) {
									local747 = 7;
								}
								local756 += arg4;
								if (local756 < 0) {
									local756 = 0;
								} else if (local756 > 127) {
									local756 = 127;
								}
								this.aShortArray14[local60] = (short) (local747 << 7 | local1301 << 10 | local756);
							}
							local1094 |= local52.length > 0;
						}
					}
					if (local1094) {
						if (this.aClass141Array1 != null) {
							for (local38 = 0; local38 < this.anInt1817; local38++) {
								local1195 = this.aClass141Array1[local38];
								local1200 = this.aClass184Array1[local38];
								local1200.anInt4892 = local1200.anInt4892 & 0xFF000000 | Static214.anIntArray203[this.aShortArray14[local1195.anInt3919] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method1667();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray35 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray35.length) {
							local152 = this.anIntArrayArray35[local32];
							for (local154 = 0; local154 < local152.length; local154++) {
								local1200 = this.aClass184Array1[local152[local154]];
								local1200.anInt4893 += arg3;
								local1200.anInt4884 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray35 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray35.length) {
							local152 = this.anIntArrayArray35[local32];
							for (local154 = 0; local154 < local152.length; local154++) {
								local1200 = this.aClass184Array1[local152[local154]];
								local1200.anInt4887 = arg3 * local1200.anInt4887 >> 7;
								local1200.anInt4891 = local1200.anInt4891 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray35 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray35.length) {
						local152 = this.anIntArrayArray35[local32];
						for (local154 = 0; local154 < local152.length; local154++) {
							local1200 = this.aClass184Array1[local152[local154]];
							local1200.anInt4889 = arg2 + local1200.anInt4889 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V")
	private void method1659() {
		if (!this.aBoolean158) {
			return;
		}
		this.aBoolean158 = false;
		if (this.aClass248Array1 == null && this.aClass281Array1 == null && this.aClass141Array1 == null) {
			if (this.anIntArray83 != null && !Static389.method377(this.anInt1757, this.anInt1828)) {
				if (this.aClass77_4 == null || this.aClass77_4.method1899()) {
					if (!this.aBoolean157) {
						this.method1661();
					}
					this.anIntArray83 = null;
				} else {
					this.aBoolean158 = true;
				}
			}
			if (this.anIntArray82 != null && !Static145.method2804(this.anInt1828, this.anInt1757)) {
				if (this.aClass77_4 == null || this.aClass77_4.method1899()) {
					if (!this.aBoolean157) {
						this.method1661();
					}
					this.anIntArray82 = null;
				} else {
					this.aBoolean158 = true;
				}
			}
			if (this.anIntArray85 != null && !Static10.method150(this.anInt1828, this.anInt1757)) {
				if (this.aClass77_4 == null || this.aClass77_4.method1899()) {
					if (!this.aBoolean157) {
						this.method1661();
					}
					this.anIntArray85 = null;
				} else {
					this.aBoolean158 = true;
				}
			}
		}
		if (this.aShortArray21 != null && this.anIntArray83 == null && this.anIntArray82 == null && this.anIntArray85 == null) {
			this.aShortArray21 = null;
			this.anIntArray81 = null;
		}
		if (this.aByteArray21 != null && !Static402.method5822(this.anInt1757, this.anInt1828)) {
			label195: {
				label194: {
					@Pc(159) boolean local159;
					if ((this.anInt1757 & 0x37) == 0) {
						if (this.aClass77_3 == null || this.aClass77_3.method1899()) {
							break label194;
						}
						local159 = false;
					} else {
						if (this.aClass77_1 == null || this.aClass77_1.method1899()) {
							break label194;
						}
						local159 = false;
					}
					if (!local159) {
						this.aBoolean158 = true;
						break label195;
					}
				}
				this.aByteArray21 = null;
				this.aShortArray12 = this.aShortArray17 = this.aShortArray23 = null;
			}
		}
		if (this.aShortArray14 != null && !Static339.method5037(this.anInt1828, this.anInt1757)) {
			if (this.aClass77_3 == null || this.aClass77_3.method1899()) {
				this.aShortArray14 = null;
			} else {
				this.aBoolean158 = true;
			}
		}
		if (this.aByteArray22 != null && !Static509.method6876(this.anInt1828, this.anInt1757)) {
			if (this.aClass77_3 == null || this.aClass77_3.method1899()) {
				this.aByteArray22 = null;
			} else {
				this.aBoolean158 = true;
			}
		}
		if (this.aFloatArray15 != null && !Static561.method2425(this.anInt1828, this.anInt1757)) {
			if (this.aClass77_2 == null || this.aClass77_2.method1899()) {
				this.aFloatArray15 = this.aFloatArray14 = null;
			} else {
				this.aBoolean158 = true;
			}
		}
		if (this.aShortArray16 != null && !Static510.method6881(this.anInt1757, this.anInt1828)) {
			if (this.aClass77_3 == null || this.aClass77_3.method1899()) {
				this.aShortArray16 = null;
			} else {
				this.aBoolean158 = true;
			}
		}
		if (this.aShortArray15 != null && !Static382.method5657(this.anInt1757, this.anInt1828)) {
			if ((this.aClass193_1 == null || this.aClass193_1.method4457()) && (this.aClass77_3 == null || this.aClass77_3.method1899())) {
				this.aShortArray15 = this.aShortArray24 = this.aShortArray13 = null;
			} else {
				this.aBoolean158 = true;
			}
		}
		if (this.aShortArray20 != null) {
			if (this.aClass77_4 == null || this.aClass77_4.method1899()) {
				this.aShortArray20 = null;
			} else {
				this.aBoolean158 = true;
			}
		}
		if (this.aShortArray22 != null) {
			if (this.aClass77_3 == null || this.aClass77_3.method1899()) {
				this.aShortArray22 = null;
			} else {
				this.aBoolean158 = true;
			}
		}
		if (this.anIntArrayArray34 != null && !Static176.method3090(this.anInt1757, this.anInt1828)) {
			this.aShortArray18 = null;
			this.anIntArrayArray34 = null;
		}
		if (this.anIntArrayArray33 != null && !Static314.method4612(this.anInt1828, this.anInt1757)) {
			this.anIntArrayArray33 = null;
			this.aShortArray19 = null;
		}
		if (this.anIntArrayArray35 != null && !Static285.method4237(this.anInt1757, this.anInt1828)) {
			this.anIntArrayArray35 = null;
		}
		if (this.anIntArray80 != null && (this.anInt1828 & 0x800) == 0 && (this.anInt1828 & 0x40000) == 0) {
			this.anIntArray80 = null;
			this.anIntArray84 = null;
			this.anIntArray79 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1798; local7++) {
			if (this.aShortArray14[local7] == arg0) {
				this.aShortArray14[local7] = arg1;
			}
		}
		if (this.aClass141Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt1817; local38++) {
				@Pc(45) Class141 local45 = this.aClass141Array1[local38];
				@Pc(50) Class184 local50 = this.aClass184Array1[local38];
				local50.anInt4892 = Static214.anIntArray203[this.aShortArray14[local45.anInt3919] & 0xFFFF] & 0xFFFFFF | local50.anInt4892 & 0xFF000000;
			}
		}
		this.method1667();
	}

	@OriginalMember(owner = "client!d", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort23 = (short) arg0;
		this.method1660();
		this.method1664();
	}

	@OriginalMember(owner = "client!d", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class356.anIntArray597[arg0];
		@Pc(13) int local13 = Class356.anIntArray598[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1775; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray82[local15] - local9 * this.anIntArray85[local15] >> 14;
			this.anIntArray85[local15] = this.anIntArray85[local15] * local13 + local9 * this.anIntArray82[local15] >> 14;
			this.anIntArray82[local15] = local34;
		}
		this.method1660();
		this.aBoolean157 = false;
	}

	@OriginalMember(owner = "client!d", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1775; local7++) {
			if (arg0 != 128) {
				this.anIntArray83[local7] = arg0 * this.anIntArray83[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray82[local7] = this.anIntArray82[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray85[local7] = arg2 * this.anIntArray85[local7] >> 7;
			}
		}
		this.method1660();
		this.aBoolean157 = false;
	}

	@OriginalMember(owner = "client!d", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean157) {
			this.method1661();
		}
		return this.anInt1822;
	}

	@OriginalMember(owner = "client!d", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort23;
	}

	@OriginalMember(owner = "client!d", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1775; local3++) {
			this.anIntArray85[local3] = -this.anIntArray85[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt1813; local29++) {
			this.aShortArray23[local29] = (short) -this.aShortArray23[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt1798; local52++) {
			@Pc(59) short local59 = this.aShortArray15[local52];
			this.aShortArray15[local52] = this.aShortArray13[local52];
			this.aShortArray13[local52] = local59;
		}
		this.method1660();
		this.method1664();
		this.method1658();
		this.aBoolean157 = false;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	private void method1660() {
		if (this.aClass77_4 != null) {
			this.aClass77_4.aBoolean169 = false;
		}
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
	private void method1661() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1775; local23++) {
			@Pc(30) int local30 = this.anIntArray83[local23];
			@Pc(35) int local35 = this.anIntArray82[local23];
			if (local35 > local15) {
				local15 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			@Pc(63) int local63 = this.anIntArray85[local23];
			if (local30 < local7) {
				local7 = local30;
			}
			if (local63 > local17) {
				local17 = local63;
			}
			if (local63 < local11) {
				local11 = local63;
			}
			@Pc(90) int local90 = local63 * local63 + local30 * local30;
			if (local19 < local90) {
				local19 = local90;
			}
			local90 = local63 * local63 + local30 * local30 + local35 * local35;
			if (local90 > local21) {
				local21 = local90;
			}
		}
		this.anInt1815 = local7;
		this.anInt1760 = local17;
		this.anInt1773 = local9;
		this.anInt1801 = local11;
		this.anInt1769 = local15;
		this.anInt1821 = local13;
		this.anInt1822 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt1823 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean157 = true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7234(@OriginalArg(0) Class11 arg0) {
		@Pc(8) Class11_Sub1 local8 = (Class11_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass248Array1 != null) {
			for (local13 = 0; local13 < this.aClass248Array1.length; local13++) {
				@Pc(20) Class248 local20 = this.aClass248Array1[local13];
				@Pc(22) Class248 local22 = local20;
				if (local20.aClass248_2 != null) {
					local22 = local20.aClass248_2;
				}
				local22.anInt6903 = (int) (local8.aFloat10 + (float) this.anIntArray85[local20.anInt6893] * local8.aFloat9 + local8.aFloat4 * (float) this.anIntArray82[local20.anInt6893] + local8.aFloat3 * (float) this.anIntArray83[local20.anInt6893]);
				local22.anInt6895 = (int) (local8.aFloat12 + (float) this.anIntArray85[local20.anInt6893] * local8.aFloat11 + (float) this.anIntArray83[local20.anInt6893] * local8.aFloat8 + local8.aFloat5 * (float) this.anIntArray82[local20.anInt6893]);
				local22.anInt6898 = (int) (local8.aFloat2 + local8.aFloat6 * (float) this.anIntArray83[local20.anInt6893] + (float) this.anIntArray82[local20.anInt6893] * local8.aFloat13 + local8.aFloat7 * (float) this.anIntArray85[local20.anInt6893]);
				local22.anInt6906 = (int) (local8.aFloat10 + (float) this.anIntArray85[local20.anInt6900] * local8.aFloat9 + (float) this.anIntArray83[local20.anInt6900] * local8.aFloat3 + local8.aFloat4 * (float) this.anIntArray82[local20.anInt6900]);
				local22.anInt6902 = (int) (local8.aFloat5 * (float) this.anIntArray82[local20.anInt6900] + (float) this.anIntArray83[local20.anInt6900] * local8.aFloat8 + (float) this.anIntArray85[local20.anInt6900] * local8.aFloat11 + local8.aFloat12);
				local22.anInt6910 = (int) (local8.aFloat7 * (float) this.anIntArray85[local20.anInt6900] + (float) this.anIntArray83[local20.anInt6900] * local8.aFloat6 + local8.aFloat13 * (float) this.anIntArray82[local20.anInt6900] + local8.aFloat2);
				local22.anInt6892 = (int) (local8.aFloat9 * (float) this.anIntArray85[local20.anInt6907] + local8.aFloat4 * (float) this.anIntArray82[local20.anInt6907] + local8.aFloat3 * (float) this.anIntArray83[local20.anInt6907] + local8.aFloat10);
				local22.anInt6909 = (int) (local8.aFloat12 + local8.aFloat11 * (float) this.anIntArray85[local20.anInt6907] + local8.aFloat8 * (float) this.anIntArray83[local20.anInt6907] + local8.aFloat5 * (float) this.anIntArray82[local20.anInt6907]);
				local22.anInt6911 = (int) ((float) this.anIntArray85[local20.anInt6907] * local8.aFloat7 + local8.aFloat6 * (float) this.anIntArray83[local20.anInt6907] + (float) this.anIntArray82[local20.anInt6907] * local8.aFloat13 + local8.aFloat2);
			}
		}
		if (this.aClass281Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass281Array1.length; local13++) {
			@Pc(365) Class281 local365 = this.aClass281Array1[local13];
			@Pc(367) Class281 local367 = local365;
			if (local365.aClass281_2 != null) {
				local367 = local365.aClass281_2;
			}
			if (local365.aClass11_5 == null) {
				local365.aClass11_5 = local8.method7214();
			} else {
				local365.aClass11_5.M(local8);
			}
			local367.anInt7418 = (int) ((float) this.anIntArray83[local365.anInt7415] * local8.aFloat3 + local8.aFloat4 * (float) this.anIntArray82[local365.anInt7415] + local8.aFloat9 * (float) this.anIntArray85[local365.anInt7415] + local8.aFloat10);
			local367.anInt7412 = (int) (local8.aFloat11 * (float) this.anIntArray85[local365.anInt7415] + local8.aFloat5 * (float) this.anIntArray82[local365.anInt7415] + (float) this.anIntArray83[local365.anInt7415] * local8.aFloat8 + local8.aFloat12);
			local367.anInt7413 = (int) (local8.aFloat7 * (float) this.anIntArray85[local365.anInt7415] + local8.aFloat13 * (float) this.anIntArray82[local365.anInt7415] + (float) this.anIntArray83[local365.anInt7415] * local8.aFloat6 + local8.aFloat2);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	private void method1662() {
		if (this.anInt1781 == 0) {
			return;
		}
		if (this.method1665() && this.method1655()) {
			this.aClass45_Sub2_3.method4910(this.aClass77_4.anInterface19_6, 0);
			this.aClass45_Sub2_3.method4910(this.aClass77_3.anInterface19_6, 1);
			this.aClass45_Sub2_3.method4910(this.aClass77_2.anInterface19_6, 2);
			@Pc(65) boolean local65;
			if ((this.anInt1757 & 0x37) == 0) {
				local65 = false;
				this.aClass45_Sub2_3.method4905(false);
				this.aClass45_Sub2_3.method4957(this.aClass45_Sub2_3.aClass7_18);
			} else {
				local65 = true;
				this.aClass45_Sub2_3.method4905(true);
				this.aClass45_Sub2_3.method4910(this.aClass77_1.anInterface19_6, 3);
				this.aClass45_Sub2_3.method4957(this.aClass45_Sub2_3.aClass7_15);
			}
			for (@Pc(107) int local107 = 0; local107 < this.anIntArray79.length; local107++) {
				@Pc(114) int local114 = this.anIntArray80[local107];
				@Pc(121) int local121 = this.anIntArray80[local107 + 1];
				@Pc(128) int local128 = this.aShortArray16[local114] & 0xFFFF;
				if (local128 == 65535) {
					local128 = -1;
				}
				this.aClass45_Sub2_3.method4947(true, local128, local65);
				this.aClass45_Sub2_3.method4967(local114 * 3, local121 - local114, this.anIntArray84[local107], Static379.aClass40_9, this.aClass193_1.anInterface13_5, this.anIntArray79[local107]);
			}
		}
		this.method1659();
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(B)V")
	public void method1663() {
		if (this.aClass77_4 != null) {
			this.aClass77_4.method1897();
		}
		if (this.aClass77_2 != null) {
			this.aClass77_2.method1897();
		}
		if (this.aClass77_3 != null) {
			this.aClass77_3.method1897();
		}
		if (this.aClass77_1 != null) {
			this.aClass77_1.method1897();
		}
		if (this.aClass193_1 != null) {
			this.aClass193_1.method4455();
		}
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
	private void method1664() {
		if ((this.anInt1757 & 0x37) == 0) {
			if (this.aClass77_3 != null) {
				this.aClass77_3.aBoolean169 = false;
			}
		} else if (this.aClass77_1 != null) {
			this.aClass77_1.aBoolean169 = false;
		}
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(B)Z")
	private boolean method1665() {
		@Pc(13) boolean local13 = !this.aClass77_3.aBoolean169;
		@Pc(26) boolean local26 = (this.anInt1757 & 0x37) != 0 && !this.aClass77_1.aBoolean169;
		@Pc(34) boolean local34 = !this.aClass77_4.aBoolean169;
		@Pc(42) boolean local42 = !this.aClass77_2.aBoolean169;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(59) boolean local59 = true;
		@Pc(78) Interface19 local78;
		@Pc(92) Buffer local92;
		if (local34) {
			if (this.aClass77_4.anInterface19_5 == null) {
				this.aClass77_4.anInterface19_5 = this.aClass45_Sub2_3.method5009(this.aBoolean155);
			}
			local78 = this.aClass77_4.anInterface19_5;
			local78.method6255(this.anInt1813 * 12, 12);
			local92 = local78.method6252();
			if (local92 == null) {
				local59 = false;
			} else {
				this.aClass45_Sub2_3.aNativeInterface3.copyPositions(this.anIntArray83, this.anIntArray82, this.anIntArray85, this.aShortArray20, 0, 12, this.anInt1813, local92.getAddress());
				if (local78.method6251()) {
					this.aClass77_4.anInterface19_6 = local78;
					this.aClass77_4.aBoolean169 = true;
				} else {
					local59 = false;
				}
			}
		}
		@Pc(220) short[] local220;
		@Pc(216) short[] local216;
		@Pc(208) short[] local208;
		@Pc(212) byte[] local212;
		if (local13) {
			if (this.aClass77_3.anInterface19_5 == null) {
				this.aClass77_3.anInterface19_5 = this.aClass45_Sub2_3.method5009(this.aBoolean155);
			}
			local78 = this.aClass77_3.anInterface19_5;
			local78.method6255(this.anInt1813 * 4, 4);
			local92 = local78.method6252();
			if (local92 == null) {
				local59 = false;
			} else {
				if ((this.anInt1757 & 0x37) == 0) {
					if (this.aClass301_1 == null) {
						local216 = this.aShortArray17;
						local212 = this.aByteArray21;
						local220 = this.aShortArray12;
						local208 = this.aShortArray23;
					} else {
						local208 = this.aClass301_1.aShortArray123;
						local212 = this.aClass301_1.aByteArray88;
						local216 = this.aClass301_1.aShortArray125;
						local220 = this.aClass301_1.aShortArray124;
					}
					this.aClass45_Sub2_3.aNativeInterface3.copyLighting(this.aShortArray14, this.aByteArray22, this.aShortArray16, local220, local216, local208, local212, this.aShort22, this.aShort23, this.aShortArray22, 0, 4, this.anInt1813, local92.getAddress());
				} else {
					this.aClass45_Sub2_3.aNativeInterface3.copyColours(this.aShortArray14, this.aByteArray22, this.aShortArray16, this.aShort22, this.aShortArray22, 0, 4, this.anInt1813, local92.getAddress());
				}
				if (local78.method6251()) {
					this.aClass77_3.anInterface19_6 = local78;
					this.aClass77_3.aBoolean169 = true;
				} else {
					local59 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass77_1.anInterface19_5 == null) {
				this.aClass77_1.anInterface19_5 = this.aClass45_Sub2_3.method5009(this.aBoolean155);
			}
			local78 = this.aClass77_1.anInterface19_5;
			local78.method6255(this.anInt1813 * 12, 12);
			local92 = local78.method6252();
			if (local92 == null) {
				local59 = false;
			} else {
				if (this.aClass301_1 == null) {
					local212 = this.aByteArray21;
					local208 = this.aShortArray23;
					local216 = this.aShortArray17;
					local220 = this.aShortArray12;
				} else {
					local216 = this.aClass301_1.aShortArray125;
					local220 = this.aClass301_1.aShortArray124;
					local212 = this.aClass301_1.aByteArray88;
					local208 = this.aClass301_1.aShortArray123;
				}
				this.aClass45_Sub2_3.aNativeInterface3.copyNormals(local220, local216, local208, local212, 3.0F / (float) this.aShort23, 3.0F / (float) (this.aShort23 / 2 + this.aShort23), 0, 12, this.anInt1813, local92.getAddress());
				if (local78.method6251()) {
					this.aClass77_1.aBoolean169 = true;
					this.aClass77_1.anInterface19_6 = local78;
				} else {
					local59 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass77_2.anInterface19_5 == null) {
				this.aClass77_2.anInterface19_5 = this.aClass45_Sub2_3.method5009(this.aBoolean155);
			}
			local78 = this.aClass77_2.anInterface19_5;
			local78.method6255(this.anInt1813 * 8, 8);
			local92 = local78.method6252();
			if (local92 == null) {
				local59 = false;
			} else {
				this.aClass45_Sub2_3.aNativeInterface3.copyTexCoords(this.aFloatArray15, this.aFloatArray14, 0, 8, this.anInt1813, local92.getAddress());
				if (local78.method6251()) {
					this.aClass77_2.aBoolean169 = true;
					this.aClass77_2.anInterface19_6 = local78;
				} else {
					local59 = false;
				}
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method1652(arg1, arg2, arg0, arg3, arg4);
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "()[Lclient!qr;")
	@Override
	public Class281[] method7244() {
		return this.aClass281Array1;
	}

	@OriginalMember(owner = "client!d", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(3) int local3 = 0; local3 < this.lb; local3++) {
			this.anIntArray83[local3] = this.anIntArray83[local3] + 7 >> 4;
			this.anIntArray82[local3] = this.anIntArray82[local3] + 7 >> 4;
			this.anIntArray85[local3] = this.anIntArray85[local3] + 7 >> 4;
		}
		this.method1660();
		this.aBoolean157 = false;
	}

	@OriginalMember(owner = "client!d", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean157) {
			this.method1661();
		}
		return this.anInt1760;
	}

	@OriginalMember(owner = "client!d", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static447.anInt7476 = 0;
			local14 = 0;
			Static32.anInt606 = 0;
			Static528.anInt8169 = 0;
			for (local20 = 0; local20 < this.anInt1775; local20++) {
				Static528.anInt8169 += this.anIntArray83[local20];
				Static32.anInt606 += this.anIntArray82[local20];
				local14++;
				Static447.anInt7476 += this.anIntArray85[local20];
			}
			if (local14 > 0) {
				Static528.anInt8169 = arg1 + Static528.anInt8169 / local14;
				Static447.anInt7476 = arg3 + Static447.anInt7476 / local14;
				Static32.anInt606 = arg2 + Static32.anInt606 / local14;
			} else {
				Static32.anInt606 = arg2;
				Static528.anInt8169 = arg1;
				Static447.anInt7476 = arg3;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt1775; local14++) {
				this.anIntArray83[local14] += arg1;
				this.anIntArray82[local14] += arg2;
				this.anIntArray85[local14] += arg3;
			}
		} else {
			@Pc(173) int local173;
			@Pc(191) int local191;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt1775; local14++) {
					this.anIntArray83[local14] -= Static528.anInt8169;
					this.anIntArray82[local14] -= Static32.anInt606;
					this.anIntArray85[local14] -= Static447.anInt7476;
					if (arg3 != 0) {
						local20 = Class356.anIntArray597[arg3];
						local173 = Class356.anIntArray598[arg3];
						local191 = local20 * this.anIntArray82[local14] + this.anIntArray83[local14] * local173 + 16383 >> 14;
						this.anIntArray82[local14] = this.anIntArray82[local14] * local173 + 16383 - this.anIntArray83[local14] * local20 >> 14;
						this.anIntArray83[local14] = local191;
					}
					if (arg1 != 0) {
						local20 = Class356.anIntArray597[arg1];
						local173 = Class356.anIntArray598[arg1];
						local191 = this.anIntArray82[local14] * local173 + 16383 - this.anIntArray85[local14] * local20 >> 14;
						this.anIntArray85[local14] = this.anIntArray85[local14] * local173 + local20 * this.anIntArray82[local14] + 16383 >> 14;
						this.anIntArray82[local14] = local191;
					}
					if (arg2 != 0) {
						local20 = Class356.anIntArray597[arg2];
						local173 = Class356.anIntArray598[arg2];
						local191 = local173 * this.anIntArray83[local14] + this.anIntArray85[local14] * local20 + 16383 >> 14;
						this.anIntArray85[local14] = local173 * this.anIntArray85[local14] + 16383 - this.anIntArray83[local14] * local20 >> 14;
						this.anIntArray83[local14] = local191;
					}
					this.anIntArray83[local14] += Static528.anInt8169;
					this.anIntArray82[local14] += Static32.anInt606;
					this.anIntArray85[local14] += Static447.anInt7476;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt1775; local14++) {
					this.anIntArray83[local14] -= Static528.anInt8169;
					this.anIntArray82[local14] -= Static32.anInt606;
					this.anIntArray85[local14] -= Static447.anInt7476;
					this.anIntArray83[local14] = this.anIntArray83[local14] * arg1 / 128;
					this.anIntArray82[local14] = this.anIntArray82[local14] * arg2 / 128;
					this.anIntArray85[local14] = this.anIntArray85[local14] * arg3 / 128;
					this.anIntArray83[local14] += Static528.anInt8169;
					this.anIntArray82[local14] += Static32.anInt606;
					this.anIntArray85[local14] += Static447.anInt7476;
				}
			} else {
				@Pc(528) Class141 local528;
				@Pc(533) Class184 local533;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt1798; local14++) {
						local20 = arg1 * 8 + (this.aByteArray22[local14] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray22[local14] = (byte) local20;
					}
					if (this.aClass141Array1 != null) {
						for (local20 = 0; local20 < this.anInt1817; local20++) {
							local528 = this.aClass141Array1[local20];
							local533 = this.aClass184Array1[local20];
							local533.anInt4892 = 255 - (this.aByteArray22[local528.anInt3919] & 0xFF) << 24 | local533.anInt4892 & 0xFFFFFF;
						}
					}
					this.method1667();
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt1798; local14++) {
						local20 = this.aShortArray14[local14] & 0xFFFF;
						local173 = local20 >> 10 & 0x3F;
						local191 = local20 >> 7 & 0x7;
						@Pc(599) int local599 = arg1 + local173 & 0x3F;
						@Pc(603) int local603 = local20 & 0x7F;
						local191 += arg2 / 4;
						local603 += arg3;
						if (local191 < 0) {
							local191 = 0;
						} else if (local191 > 7) {
							local191 = 7;
						}
						if (local603 < 0) {
							local603 = 0;
						} else if (local603 > 127) {
							local603 = 127;
						}
						this.aShortArray14[local14] = (short) (local599 << 10 | local191 << 7 | local603);
					}
					if (this.aClass141Array1 != null) {
						for (local20 = 0; local20 < this.anInt1817; local20++) {
							local528 = this.aClass141Array1[local20];
							local533 = this.aClass184Array1[local20];
							local533.anInt4892 = Static214.anIntArray203[this.aShortArray14[local528.anInt3919] & 0xFFFF] & 0xFFFFFF | local533.anInt4892 & 0xFF000000;
						}
					}
					this.method1667();
				} else {
					@Pc(720) Class184 local720;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt1817; local14++) {
							local720 = this.aClass184Array1[local14];
							local720.anInt4884 += arg1;
							local720.anInt4893 += arg2;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt1817; local14++) {
							local720 = this.aClass184Array1[local14];
							local720.anInt4887 = local720.anInt4887 * arg2 >> 7;
							local720.anInt4891 = arg1 * local720.anInt4891 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt1817; local14++) {
							local720 = this.aClass184Array1[local14];
							local720.anInt4889 = local720.anInt4889 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!d;ZZLclient!d;)Lclient!da;")
	private Class60 method1666(@OriginalArg(1) int arg0, @OriginalArg(2) Class60_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class60_Sub1 arg4) {
		arg1.aShort23 = this.aShort23;
		arg1.anInt1757 = this.anInt1757;
		arg1.anInt1781 = this.anInt1781;
		arg1.anInt1798 = this.anInt1798;
		arg1.anInt1817 = this.anInt1817;
		arg1.anInt1828 = arg0;
		arg1.anInt1775 = this.anInt1775;
		arg1.lb = this.lb;
		arg1.anInt1813 = this.anInt1813;
		arg1.aShort22 = this.aShort22;
		if ((arg0 & 0x100) == 0) {
			arg1.aBoolean156 = this.aBoolean156;
		} else {
			arg1.aBoolean156 = true;
		}
		@Pc(71) boolean local71 = Static432.method6082(arg0, this.anInt1757);
		@Pc(77) boolean local77 = Static9.method3872(arg0, this.anInt1757);
		@Pc(83) boolean local83 = Static547.method7285(arg0, this.anInt1757);
		@Pc(89) boolean local89 = local71 | local77 | local83;
		@Pc(190) int local190;
		if (local89) {
			if (!local71) {
				arg1.anIntArray83 = this.anIntArray83;
			} else if (arg4.anIntArray83 == null || arg4.anIntArray83.length < this.lb) {
				arg1.anIntArray83 = arg4.anIntArray83 = new int[this.lb];
			} else {
				arg1.anIntArray83 = arg4.anIntArray83;
			}
			if (!local77) {
				arg1.anIntArray82 = this.anIntArray82;
			} else if (arg4.anIntArray82 == null || this.lb > arg4.anIntArray82.length) {
				arg1.anIntArray82 = arg4.anIntArray82 = new int[this.lb];
			} else {
				arg1.anIntArray82 = arg4.anIntArray82;
			}
			if (!local83) {
				arg1.anIntArray85 = this.anIntArray85;
			} else if (arg4.anIntArray85 == null || arg4.anIntArray85.length < this.lb) {
				arg1.anIntArray85 = arg4.anIntArray85 = new int[this.lb];
			} else {
				arg1.anIntArray85 = arg4.anIntArray85;
			}
			for (local190 = 0; local190 < this.lb; local190++) {
				if (local71) {
					arg1.anIntArray83[local190] = this.anIntArray83[local190];
				}
				if (local77) {
					arg1.anIntArray82[local190] = this.anIntArray82[local190];
				}
				if (local83) {
					arg1.anIntArray85[local190] = this.anIntArray85[local190];
				}
			}
		} else {
			arg1.anIntArray83 = this.anIntArray83;
			arg1.anIntArray85 = this.anIntArray85;
			arg1.anIntArray82 = this.anIntArray82;
		}
		if (Static321.method4673(this.anInt1757, arg0)) {
			arg1.aClass77_4 = arg4.aClass77_4;
			arg1.aClass77_4.anInterface19_6 = this.aClass77_4.anInterface19_6;
			arg1.aClass77_4.aBoolean169 = this.aClass77_4.aBoolean169;
			arg1.aClass77_4.aBoolean168 = true;
		} else if (Static169.method3029(arg0, this.anInt1757)) {
			arg1.aClass77_4 = this.aClass77_4;
		} else {
			arg1.aClass77_4 = null;
		}
		if (Static559.method7530(this.anInt1757, arg0)) {
			if (arg4.aShortArray14 == null || this.anInt1798 > arg4.aShortArray14.length) {
				arg1.aShortArray14 = arg4.aShortArray14 = new short[this.anInt1798];
			} else {
				arg1.aShortArray14 = arg4.aShortArray14;
			}
			for (local190 = 0; local190 < this.anInt1798; local190++) {
				arg1.aShortArray14[local190] = this.aShortArray14[local190];
			}
		} else {
			arg1.aShortArray14 = this.aShortArray14;
		}
		if (Static134.method2625(this.anInt1757, arg0)) {
			if (arg4.aByteArray22 == null || arg4.aByteArray22.length < this.anInt1798) {
				arg1.aByteArray22 = arg4.aByteArray22 = new byte[this.anInt1798];
			} else {
				arg1.aByteArray22 = arg4.aByteArray22;
			}
			for (local190 = 0; local190 < this.anInt1798; local190++) {
				arg1.aByteArray22[local190] = this.aByteArray22[local190];
			}
		} else {
			arg1.aByteArray22 = this.aByteArray22;
		}
		if (Static171.method3051(arg0, this.anInt1757)) {
			arg1.aClass77_3 = arg4.aClass77_3;
			arg1.aClass77_3.aBoolean169 = this.aClass77_3.aBoolean169;
			arg1.aClass77_3.aBoolean168 = true;
			arg1.aClass77_3.anInterface19_6 = this.aClass77_3.anInterface19_6;
		} else if (Static421.method5999(arg0, this.anInt1757)) {
			arg1.aClass77_3 = this.aClass77_3;
		} else {
			arg1.aClass77_3 = null;
		}
		@Pc(539) int local539;
		if (Static269.method4101(arg0, this.anInt1757)) {
			if (arg4.aShortArray12 == null || this.anInt1813 > arg4.aShortArray12.length) {
				local190 = this.anInt1813;
				arg1.aShortArray12 = arg4.aShortArray12 = new short[local190];
				arg1.aShortArray23 = arg4.aShortArray23 = new short[local190];
				arg1.aShortArray17 = arg4.aShortArray17 = new short[local190];
			} else {
				arg1.aShortArray23 = arg4.aShortArray23;
				arg1.aShortArray12 = arg4.aShortArray12;
				arg1.aShortArray17 = arg4.aShortArray17;
			}
			if (this.aClass301_1 == null) {
				arg1.aClass301_1 = null;
				for (local190 = 0; local190 < this.anInt1813; local190++) {
					arg1.aShortArray12[local190] = this.aShortArray12[local190];
					arg1.aShortArray17[local190] = this.aShortArray17[local190];
					arg1.aShortArray23[local190] = this.aShortArray23[local190];
				}
			} else {
				if (arg4.aClass301_1 == null) {
					arg4.aClass301_1 = new Class301();
				}
				@Pc(527) Class301 local527 = arg1.aClass301_1 = arg4.aClass301_1;
				if (local527.aShortArray124 == null || local527.aShortArray124.length < this.anInt1813) {
					local539 = this.anInt1813;
					local527.aShortArray125 = new short[local539];
					local527.aShortArray124 = new short[local539];
					local527.aShortArray123 = new short[local539];
					local527.aByteArray88 = new byte[local539];
				}
				for (local539 = 0; local539 < this.anInt1813; local539++) {
					arg1.aShortArray12[local539] = this.aShortArray12[local539];
					arg1.aShortArray17[local539] = this.aShortArray17[local539];
					arg1.aShortArray23[local539] = this.aShortArray23[local539];
					local527.aShortArray124[local539] = this.aClass301_1.aShortArray124[local539];
					local527.aShortArray125[local539] = this.aClass301_1.aShortArray125[local539];
					local527.aShortArray123[local539] = this.aClass301_1.aShortArray123[local539];
					local527.aByteArray88[local539] = this.aClass301_1.aByteArray88[local539];
				}
			}
			arg1.aByteArray21 = this.aByteArray21;
		} else {
			arg1.aClass301_1 = this.aClass301_1;
			arg1.aByteArray21 = this.aByteArray21;
			arg1.aShortArray23 = this.aShortArray23;
			arg1.aShortArray17 = this.aShortArray17;
			arg1.aShortArray12 = this.aShortArray12;
		}
		if (Static317.method4651(this.anInt1757, arg0)) {
			arg1.aClass77_1 = arg4.aClass77_1;
			arg1.aClass77_1.aBoolean168 = true;
			arg1.aClass77_1.anInterface19_6 = this.aClass77_1.anInterface19_6;
			arg1.aClass77_1.aBoolean169 = this.aClass77_1.aBoolean169;
		} else if (Static422.method7213(this.anInt1757, arg0)) {
			arg1.aClass77_1 = this.aClass77_1;
		} else {
			arg1.aClass77_1 = null;
		}
		if (Static313.method4597(this.anInt1757, arg0)) {
			if (arg4.aFloatArray15 == null || arg4.aFloatArray15.length < this.anInt1798) {
				local190 = this.anInt1813;
				arg1.aFloatArray14 = arg4.aFloatArray14 = new float[local190];
				arg1.aFloatArray15 = arg4.aFloatArray15 = new float[local190];
			} else {
				arg1.aFloatArray14 = arg4.aFloatArray14;
				arg1.aFloatArray15 = arg4.aFloatArray15;
			}
			for (local190 = 0; local190 < this.anInt1813; local190++) {
				arg1.aFloatArray15[local190] = this.aFloatArray15[local190];
				arg1.aFloatArray14[local190] = this.aFloatArray14[local190];
			}
		} else {
			arg1.aFloatArray15 = this.aFloatArray15;
			arg1.aFloatArray14 = this.aFloatArray14;
		}
		if (Static227.method3537(this.anInt1757, arg0)) {
			arg1.aClass77_2 = arg4.aClass77_2;
			arg1.aClass77_2.anInterface19_6 = this.aClass77_2.anInterface19_6;
			arg1.aClass77_2.aBoolean169 = this.aClass77_2.aBoolean169;
			arg1.aClass77_2.aBoolean168 = true;
		} else if (Static368.method5394(this.anInt1757, arg0)) {
			arg1.aClass77_2 = this.aClass77_2;
		} else {
			arg1.aClass77_2 = null;
		}
		if (Static352.method5160(arg0, this.anInt1757)) {
			if (arg4.aShortArray15 == null || arg4.aShortArray15.length < this.anInt1798) {
				local190 = this.anInt1798;
				arg1.aShortArray13 = arg4.aShortArray13 = new short[local190];
				arg1.aShortArray15 = arg4.aShortArray15 = new short[local190];
				arg1.aShortArray24 = arg4.aShortArray24 = new short[local190];
			} else {
				arg1.aShortArray24 = arg4.aShortArray24;
				arg1.aShortArray13 = arg4.aShortArray13;
				arg1.aShortArray15 = arg4.aShortArray15;
			}
			for (local190 = 0; local190 < this.anInt1798; local190++) {
				arg1.aShortArray15[local190] = this.aShortArray15[local190];
				arg1.aShortArray24[local190] = this.aShortArray24[local190];
				arg1.aShortArray13[local190] = this.aShortArray13[local190];
			}
		} else {
			arg1.aShortArray15 = this.aShortArray15;
			arg1.aShortArray24 = this.aShortArray24;
			arg1.aShortArray13 = this.aShortArray13;
		}
		if (Static365.method5322(arg0, this.anInt1757)) {
			arg1.aClass193_1 = arg4.aClass193_1;
			arg1.aClass193_1.aBoolean379 = true;
			arg1.aClass193_1.aBoolean380 = this.aClass193_1.aBoolean380;
			arg1.aClass193_1.anInterface13_5 = this.aClass193_1.anInterface13_5;
		} else if (Static120.method2484(this.anInt1757, arg0)) {
			arg1.aClass193_1 = this.aClass193_1;
		} else {
			arg1.aClass193_1 = null;
		}
		if (Static329.method6552(arg0, this.anInt1757)) {
			if (arg4.aShortArray16 == null || this.anInt1798 > arg4.aShortArray16.length) {
				local190 = this.anInt1798;
				arg1.aShortArray16 = arg4.aShortArray16 = new short[local190];
			} else {
				arg1.aShortArray16 = arg4.aShortArray16;
			}
			for (local190 = 0; local190 < this.anInt1798; local190++) {
				arg1.aShortArray16[local190] = this.aShortArray16[local190];
			}
		} else {
			arg1.aShortArray16 = this.aShortArray16;
		}
		if (!Static69.method1487(this.anInt1757, arg0)) {
			arg1.aClass184Array1 = this.aClass184Array1;
		} else if (arg4.aClass184Array1 == null || this.anInt1817 > arg4.aClass184Array1.length) {
			local190 = this.anInt1817;
			arg1.aClass184Array1 = arg4.aClass184Array1 = new Class184[local190];
			for (local539 = 0; local539 < this.anInt1817; local539++) {
				arg1.aClass184Array1[local539] = this.aClass184Array1[local539].method4234();
			}
		} else {
			arg1.aClass184Array1 = arg4.aClass184Array1;
			for (local190 = 0; local190 < this.anInt1817; local190++) {
				arg1.aClass184Array1[local190].method4238(this.aClass184Array1[local190]);
			}
		}
		arg1.aClass281Array1 = this.aClass281Array1;
		arg1.aShortArray22 = this.aShortArray22;
		arg1.anIntArray79 = this.anIntArray79;
		arg1.anIntArray80 = this.anIntArray80;
		arg1.aShortArray19 = this.aShortArray19;
		arg1.anIntArrayArray35 = this.anIntArrayArray35;
		arg1.aShortArray21 = this.aShortArray21;
		arg1.anIntArrayArray33 = this.anIntArrayArray33;
		arg1.aClass248Array1 = this.aClass248Array1;
		arg1.aShortArray18 = this.aShortArray18;
		if (this.aBoolean157) {
			arg1.anInt1769 = this.anInt1769;
			arg1.anInt1773 = this.anInt1773;
			arg1.anInt1822 = this.anInt1822;
			arg1.anInt1823 = this.anInt1823;
			arg1.anInt1821 = this.anInt1821;
			arg1.aBoolean157 = true;
			arg1.anInt1760 = this.anInt1760;
			arg1.anInt1815 = this.anInt1815;
			arg1.anInt1801 = this.anInt1801;
		} else {
			arg1.aBoolean157 = false;
		}
		arg1.anIntArray84 = this.anIntArray84;
		arg1.anIntArrayArray34 = this.anIntArrayArray34;
		arg1.anIntArray81 = this.anIntArray81;
		arg1.aShortArray20 = this.aShortArray20;
		arg1.aClass141Array1 = this.aClass141Array1;
		return arg1;
	}

	@OriginalMember(owner = "client!d", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class356.anIntArray597[arg0];
		@Pc(13) int local13 = Class356.anIntArray598[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1775; local15++) {
			@Pc(34) int local34 = this.anIntArray82[local15] * local9 + this.anIntArray83[local15] * local13 >> 14;
			this.anIntArray82[local15] = local13 * this.anIntArray82[local15] - local9 * this.anIntArray83[local15] >> 14;
			this.anIntArray83[local15] = local34;
		}
		this.method1660();
		this.aBoolean157 = false;
	}

	@OriginalMember(owner = "client!d", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray33 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.lb; local12++) {
			this.anIntArray83[local12] <<= 0x4;
			this.anIntArray82[local12] <<= 0x4;
			this.anIntArray85[local12] <<= 0x4;
		}
		Static32.anInt606 = 0;
		Static528.anInt8169 = 0;
		Static447.anInt7476 = 0;
		return true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
	@Override
	protected void method7228() {
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V")
	private void method1667() {
		if (this.aClass77_3 != null) {
			this.aClass77_3.aBoolean169 = false;
		}
	}

	@OriginalMember(owner = "client!d", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass45_Sub2_3.anInterface3_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt1798; local11++) {
			if (this.aShortArray16[local11] == arg0) {
				this.aShortArray16[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class55 local48 = local9.method4776(arg0 & 0xFFFF);
			local35 = local48.aByte17;
			local37 = local48.aByte15;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(68) Class55 local68 = local9.method4776(arg1 & 0xFFFF);
			local58 = local68.aByte15;
			local56 = local68.aByte17;
		}
		if (!(local35 != local56 | local37 != local58)) {
			return;
		}
		if (this.aClass141Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt1817; local97++) {
				@Pc(104) Class141 local104 = this.aClass141Array1[local97];
				@Pc(109) Class184 local109 = this.aClass184Array1[local97];
				local109.anInt4892 = local109.anInt4892 & 0xFF000000 | Static214.anIntArray203[this.aShortArray14[local104.anInt3919] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method1667();
	}

	@OriginalMember(owner = "client!d", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		if (this.aClass77_4 != null) {
			this.aClass77_4.aBoolean168 = Static321.method4673(this.anInt1757, arg0);
		}
		if (this.aClass77_2 != null) {
			this.aClass77_2.aBoolean168 = Static227.method3537(this.anInt1757, arg0);
		}
		if (this.aClass77_3 != null) {
			this.aClass77_3.aBoolean168 = Static171.method3051(arg0, this.anInt1757);
		}
		if (this.aClass77_1 != null) {
			this.aClass77_1.aBoolean168 = Static317.method4651(this.anInt1757, arg0);
		}
		this.anInt1828 = arg0;
		this.aBoolean158 = true;
		if (this.aClass301_1 != null && (this.anInt1828 & 0x10000) == 0) {
			this.aShortArray12 = this.aClass301_1.aShortArray124;
			this.aByteArray21 = this.aClass301_1.aByteArray88;
			this.aShortArray23 = this.aClass301_1.aShortArray123;
			this.aShortArray17 = this.aClass301_1.aShortArray125;
			this.aClass301_1 = null;
		}
		this.method1659();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIIILclient!ef;IIJFIF)S")
	private short method1669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class84 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(15) int local15 = this.anIntArray81[arg8];
		@Pc(22) int local22 = this.anIntArray81[arg8 + 1];
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = local15; local26 < local22; local26++) {
			@Pc(33) short local33 = this.aShortArray21[local26];
			if (local33 == 0) {
				local24 = local26;
				break;
			}
			if (arg6 == Static562.aLongArray15[local26]) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray21[local24] = (short) (this.anInt1813 + 1);
		Static562.aLongArray15[local24] = arg6;
		this.aShortArray22[this.anInt1813] = (short) arg1;
		this.aShortArray20[this.anInt1813] = (short) arg8;
		this.aShortArray12[this.anInt1813] = (short) arg2;
		this.aShortArray17[this.anInt1813] = (short) arg5;
		this.aShortArray23[this.anInt1813] = (short) arg0;
		this.aByteArray21[this.anInt1813] = (byte) arg4;
		this.aFloatArray15[this.anInt1813] = arg9;
		this.aFloatArray14[this.anInt1813] = arg7;
		return (short) this.anInt1813++;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()[Lclient!ow;")
	@Override
	public Class248[] method7238() {
		return this.aClass248Array1;
	}

	@OriginalMember(owner = "client!d", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean157) {
			this.method1661();
		}
		@Pc(16) int local16 = this.anInt1815 + arg4;
		@Pc(21) int local21 = arg4 + this.anInt1821;
		@Pc(26) int local26 = arg6 + this.anInt1801;
		@Pc(31) int local31 = arg6 + this.anInt1760;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt7850 + local21 >> arg2.anInt7856 >= arg2.anInt7854 || local26 < 0 || arg2.anInt7850 + local31 >> arg2.anInt7856 >= arg2.anInt7852)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt7854 <= local21 + arg3.anInt7850 >> arg3.anInt7856 || local26 < 0 || local31 + arg3.anInt7850 >> arg3.anInt7856 >= arg3.anInt7852) {
				return;
			}
		} else {
			local16 >>= arg2.anInt7856;
			local21 = local21 + arg2.anInt7850 - 1 >> arg2.anInt7856;
			local26 >>= arg2.anInt7856;
			local31 = local31 + arg2.anInt7850 - 1 >> arg2.anInt7856;
			if (arg2.method6525(local26, local16) == arg5 && arg5 == arg2.method6525(local26, local21) && arg2.method6525(local31, local16) == arg5 && arg2.method6525(local31, local21) == arg5) {
				return;
			}
		}
		@Pc(188) int local188;
		if (arg0 == 1) {
			for (local188 = 0; local188 < this.anInt1775; local188++) {
				this.anIntArray82[local188] = this.anIntArray82[local188] + arg2.method6530(arg4 + this.anIntArray83[local188], this.anIntArray85[local188] - -arg6) - arg5;
			}
		} else {
			@Pc(242) int local242;
			@Pc(253) int local253;
			if (arg0 == 2) {
				local188 = this.anInt1773;
				if (local188 == 0) {
					return;
				}
				for (local242 = 0; local242 < this.anInt1775; local242++) {
					local253 = (this.anIntArray82[local242] << 16) / local188;
					if (arg1 > local253) {
						this.anIntArray82[local242] += (arg2.method6530(arg4 + this.anIntArray83[local242], this.anIntArray85[local242] + arg6) - arg5) * (-local253 + arg1) / arg1;
					}
				}
			} else {
				@Pc(332) int local332;
				if (arg0 == 3) {
					local188 = (arg1 & 0xFF) * 4;
					local242 = (arg1 >> 8 & 0xFF) * 4;
					local253 = (arg1 >> 16 & 0xFF) << 6;
					local332 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local188 >> 1) < 0 || (local188 >> 1) + arg4 + arg2.anInt7850 >= arg2.anInt7854 << arg2.anInt7856 || arg6 - (local242 >> 1) < 0 || arg2.anInt7852 << arg2.anInt7856 <= arg6 + (local242 >> 1) + arg2.anInt7850) {
						return;
					}
					this.method7225(local253, local188, arg4, local242, local332, arg5, arg2, arg6);
				} else if (arg0 == 4) {
					local188 = this.anInt1769 - this.anInt1773;
					for (local242 = 0; local242 < this.anInt1775; local242++) {
						this.anIntArray82[local242] = local188 + this.anIntArray82[local242] + arg3.method6530(arg4 + this.anIntArray83[local242], arg6 + this.anIntArray85[local242]) - arg5;
					}
				} else if (arg0 == 5) {
					local188 = this.anInt1769 - this.anInt1773;
					for (local242 = 0; local242 < this.anInt1775; local242++) {
						local253 = this.anIntArray83[local242] + arg4;
						local332 = arg6 + this.anIntArray85[local242];
						@Pc(485) int local485 = arg2.method6530(local253, local332);
						@Pc(491) int local491 = arg3.method6530(local253, local332);
						@Pc(498) int local498 = local485 - local491 - arg1;
						this.anIntArray82[local242] = (local498 * ((this.anIntArray82[local242] << 8) / local188) >> 8) + local485 - arg5;
					}
				}
			}
		}
		this.method1660();
		this.aBoolean157 = false;
	}

	@OriginalMember(owner = "client!d", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean157) {
			this.method1661();
		}
		return this.anInt1815;
	}

	@OriginalMember(owner = "client!d", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean156;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!q;Lclient!ufa;I)V")
	@Override
	public void method7230(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class41_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1813 == 0) {
			return;
		}
		@Pc(16) Class11_Sub1 local16 = this.aClass45_Sub2_3.aClass11_Sub1_16;
		@Pc(19) Class11_Sub1 local19 = (Class11_Sub1) arg0;
		if (!this.aBoolean157) {
			this.method1661();
		}
		Static267.aFloat100 = local16.aFloat13 * local19.aFloat5 + local16.aFloat6 * local19.aFloat4 + local19.aFloat13 * local16.aFloat7;
		Static552.aFloat179 = local16.aFloat13 * local19.aFloat12 + local16.aFloat6 * local19.aFloat10 + local19.aFloat2 * local16.aFloat7 + local16.aFloat2;
		@Pc(72) float local72 = Static552.aFloat179 + (float) this.anInt1773 * Static267.aFloat100;
		@Pc(80) float local80 = Static267.aFloat100 * (float) this.anInt1769 + Static552.aFloat179;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.anInt1822 + local72;
			local97 = (float) -this.anInt1822 + local80;
		} else {
			local97 = local72 - (float) this.anInt1822;
			local90 = local80 + (float) this.anInt1822;
		}
		if (this.aClass45_Sub2_3.aFloat132 <= local97 || (float) this.aClass45_Sub2_3.anInt5836 >= local90) {
			return;
		}
		Static124.aFloat172 = local16.aFloat10 + local16.aFloat3 * local19.aFloat10 + local19.aFloat12 * local16.aFloat4 + local16.aFloat9 * local19.aFloat2;
		Static34.aFloat16 = local16.aFloat9 * local19.aFloat13 + local16.aFloat3 * local19.aFloat4 + local19.aFloat5 * local16.aFloat4;
		@Pc(173) float local173 = Static124.aFloat172 + Static34.aFloat16 * (float) this.anInt1773;
		@Pc(181) float local181 = Static124.aFloat172 + (float) this.anInt1769 * Static34.aFloat16;
		@Pc(207) float local207;
		@Pc(196) float local196;
		if (local173 > local181) {
			local196 = (float) this.aClass45_Sub2_3.anInt5849 * ((float) this.anInt1822 + local173);
			local207 = (local181 - (float) this.anInt1822) * (float) this.aClass45_Sub2_3.anInt5849;
		} else {
			local207 = (float) this.aClass45_Sub2_3.anInt5849 * (local173 - (float) this.anInt1822);
			local196 = (float) this.aClass45_Sub2_3.anInt5849 * ((float) this.anInt1822 + local181);
		}
		if (this.aClass45_Sub2_3.aFloat125 <= local207 / local90 || this.aClass45_Sub2_3.aFloat124 >= local196 / local90) {
			return;
		}
		Static230.aFloat97 = local19.aFloat10 * local16.aFloat8 + local16.aFloat5 * local19.aFloat12 + local16.aFloat11 * local19.aFloat2 + local16.aFloat12;
		Static183.aFloat90 = local16.aFloat5 * local19.aFloat5 + local16.aFloat8 * local19.aFloat4 + local19.aFloat13 * local16.aFloat11;
		@Pc(296) float local296 = (float) this.anInt1773 * Static183.aFloat90 + Static230.aFloat97;
		@Pc(304) float local304 = Static230.aFloat97 + Static183.aFloat90 * (float) this.anInt1769;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local296 > local304) {
			local331 = ((float) this.anInt1822 + local296) * (float) this.aClass45_Sub2_3.anInt5870;
			local320 = (float) this.aClass45_Sub2_3.anInt5870 * (local304 - (float) this.anInt1822);
		} else {
			local320 = ((float) -this.anInt1822 + local296) * (float) this.aClass45_Sub2_3.anInt5870;
			local331 = (float) this.aClass45_Sub2_3.anInt5870 * (local304 + (float) this.anInt1822);
		}
		if (this.aClass45_Sub2_3.aFloat126 <= local320 / local90 || local331 / local90 <= this.aClass45_Sub2_3.aFloat122) {
			return;
		}
		if (arg1 != null || this.aClass141Array1 != null) {
			Static14.aFloat14 = local16.aFloat13 * local19.aFloat8 + local16.aFloat6 * local19.aFloat3 + local19.aFloat6 * local16.aFloat7;
			Static530.aFloat157 = local19.aFloat9 * local16.aFloat6 + local19.aFloat11 * local16.aFloat13 + local19.aFloat7 * local16.aFloat7;
			Static465.aFloat148 = local19.aFloat7 * local16.aFloat11 + local19.aFloat9 * local16.aFloat8 + local19.aFloat11 * local16.aFloat5;
			Static204.aFloat93 = local19.aFloat6 * local16.aFloat11 + local16.aFloat8 * local19.aFloat3 + local19.aFloat8 * local16.aFloat5;
			Static19.aFloat15 = local16.aFloat9 * local19.aFloat6 + local19.aFloat8 * local16.aFloat4 + local19.aFloat3 * local16.aFloat3;
			Static573.aFloat205 = local19.aFloat11 * local16.aFloat4 + local19.aFloat9 * local16.aFloat3 + local19.aFloat7 * local16.aFloat9;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(500) int local500 = this.anInt1815 + this.anInt1821 >> 1;
			@Pc(509) int local509 = this.anInt1801 + this.anInt1760 >> 1;
			@Pc(528) int local528 = (int) (Static573.aFloat205 * (float) local509 + Static34.aFloat16 * (float) this.anInt1773 + (float) local500 * Static19.aFloat15 + Static124.aFloat172);
			@Pc(547) int local547 = (int) (Static465.aFloat148 * (float) local509 + Static204.aFloat93 * (float) local500 + Static230.aFloat97 + (float) this.anInt1773 * Static183.aFloat90);
			@Pc(566) int local566 = (int) ((float) this.anInt1773 * Static267.aFloat100 + Static552.aFloat179 + Static14.aFloat14 * (float) local500 + (float) local509 * Static530.aFloat157);
			if (local566 >= this.aClass45_Sub2_3.anInt5836) {
				arg1.anInt8513 = this.aClass45_Sub2_3.anInt5849 * local528 / local566 + this.aClass45_Sub2_3.anInt5857;
				arg1.anInt8516 = local547 * this.aClass45_Sub2_3.anInt5870 / local566 + this.aClass45_Sub2_3.anInt5862;
			} else {
				local490 = true;
			}
			@Pc(620) int local620 = (int) (Static34.aFloat16 * (float) this.anInt1769 + Static124.aFloat172 + (float) local500 * Static19.aFloat15 + (float) local509 * Static573.aFloat205);
			@Pc(639) int local639 = (int) (Static230.aFloat97 + (float) local500 * Static204.aFloat93 + (float) this.anInt1769 * Static183.aFloat90 + (float) local509 * Static465.aFloat148);
			@Pc(658) int local658 = (int) ((float) local509 * Static530.aFloat157 + Static267.aFloat100 * (float) this.anInt1769 + Static552.aFloat179 + (float) local500 * Static14.aFloat14);
			if (local658 < this.aClass45_Sub2_3.anInt5836) {
				local490 = true;
			} else {
				arg1.anInt8512 = this.aClass45_Sub2_3.anInt5857 + this.aClass45_Sub2_3.anInt5849 * local620 / local658;
				arg1.anInt8514 = local639 * this.aClass45_Sub2_3.anInt5870 / local658 + this.aClass45_Sub2_3.anInt5862;
			}
			if (local490) {
				if (this.aClass45_Sub2_3.anInt5836 > local566 && local658 < this.aClass45_Sub2_3.anInt5836) {
					local492 = false;
				} else {
					@Pc(737) int local737;
					@Pc(748) int local748;
					@Pc(775) int local775;
					if (local566 < this.aClass45_Sub2_3.anInt5836) {
						local737 = (local658 - this.aClass45_Sub2_3.anInt5836 << 16) / (local658 - local566);
						local748 = local620 + (local737 * (local620 - local528) >> 16);
						arg1.anInt8513 = this.aClass45_Sub2_3.anInt5857 + this.aClass45_Sub2_3.anInt5849 * local748 / this.aClass45_Sub2_3.anInt5836;
						local775 = local639 + ((local639 - local547) * local737 >> 16);
						arg1.anInt8516 = this.aClass45_Sub2_3.anInt5862 + this.aClass45_Sub2_3.anInt5870 * local775 / this.aClass45_Sub2_3.anInt5836;
					} else if (local658 < this.aClass45_Sub2_3.anInt5836) {
						local737 = (local566 - this.aClass45_Sub2_3.anInt5836 << 16) / (local566 - local658);
						local748 = local528 + ((local528 - local620) * local737 >> 16);
						local775 = local547 + ((local547 - local639) * local737 >> 16);
						arg1.anInt8513 = this.aClass45_Sub2_3.anInt5849 * local748 / this.aClass45_Sub2_3.anInt5836 + this.aClass45_Sub2_3.anInt5857;
						arg1.anInt8516 = local775 * this.aClass45_Sub2_3.anInt5870 / this.aClass45_Sub2_3.anInt5836 + this.aClass45_Sub2_3.anInt5862;
					}
				}
			}
			if (local492) {
				arg1.aBoolean658 = true;
				if (local658 >= local566) {
					arg1.anInt8515 = this.aClass45_Sub2_3.anInt5857 + this.aClass45_Sub2_3.anInt5849 * (this.anInt1822 + local620) / local658 - arg1.anInt8512;
				} else {
					arg1.anInt8515 = this.aClass45_Sub2_3.anInt5857 + (local528 + this.anInt1822) * this.aClass45_Sub2_3.anInt5849 / local566 - arg1.anInt8513;
				}
			}
		}
		this.aClass45_Sub2_3.method4971();
		this.aClass45_Sub2_3.method4966(local19);
		this.method1662();
		this.method1654();
	}

	@OriginalMember(owner = "client!d", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1775; local7++) {
			if (arg0 != 0) {
				this.anIntArray83[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray82[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray85[local7] += arg2;
			}
		}
		this.method1660();
		this.aBoolean157 = false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7233(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class60_Sub1 local8 = (Class60_Sub1) arg0;
		if (this.anInt1798 == 0 || local8.anInt1798 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt1775;
		@Pc(27) int[] local27 = local8.anIntArray83;
		@Pc(30) int[] local30 = local8.anIntArray82;
		@Pc(33) int[] local33 = local8.anIntArray85;
		@Pc(36) short[] local36 = local8.aShortArray12;
		@Pc(39) short[] local39 = local8.aShortArray17;
		@Pc(42) short[] local42 = local8.aShortArray23;
		@Pc(45) byte[] local45 = local8.aByteArray21;
		@Pc(56) short[] local56;
		@Pc(64) short[] local64;
		@Pc(52) short[] local52;
		@Pc(60) byte[] local60;
		if (this.aClass301_1 == null) {
			local52 = null;
			local56 = null;
			local60 = null;
			local64 = null;
		} else {
			local52 = this.aClass301_1.aShortArray123;
			local56 = this.aClass301_1.aShortArray124;
			local60 = this.aClass301_1.aByteArray88;
			local64 = this.aClass301_1.aShortArray125;
		}
		@Pc(93) short[] local93;
		@Pc(89) short[] local89;
		@Pc(85) short[] local85;
		@Pc(81) byte[] local81;
		if (local8.aClass301_1 == null) {
			local89 = null;
			local85 = null;
			local81 = null;
			local93 = null;
		} else {
			local81 = local8.aClass301_1.aByteArray88;
			local85 = local8.aClass301_1.aShortArray123;
			local89 = local8.aClass301_1.aShortArray125;
			local93 = local8.aClass301_1.aShortArray124;
		}
		@Pc(106) int[] local106 = local8.anIntArray81;
		@Pc(109) short[] local109 = local8.aShortArray21;
		if (!local8.aBoolean157) {
			local8.method1661();
		}
		@Pc(118) int local118 = local8.anInt1773;
		@Pc(121) int local121 = local8.anInt1769;
		@Pc(124) int local124 = local8.anInt1815;
		@Pc(127) int local127 = local8.anInt1821;
		@Pc(130) int local130 = local8.anInt1801;
		@Pc(133) int local133 = local8.anInt1760;
		for (@Pc(135) int local135 = 0; local135 < this.anInt1775; local135++) {
			@Pc(145) int local145 = this.anIntArray82[local135] - arg2;
			if (local145 >= local118 && local145 <= local121) {
				@Pc(164) int local164 = this.anIntArray83[local135] - arg1;
				if (local124 <= local164 && local164 <= local127) {
					@Pc(180) int local180 = this.anIntArray85[local135] - arg3;
					if (local130 <= local180 && local133 >= local180) {
						@Pc(194) int local194 = -1;
						@Pc(199) int local199 = this.anIntArray81[local135];
						@Pc(206) int local206 = this.anIntArray81[local135 + 1];
						for (@Pc(208) int local208 = local199; local208 < local206; local208++) {
							local194 = this.aShortArray21[local208] - 1;
							if (local194 == -1 || this.aByteArray21[local194] != 0) {
								break;
							}
						}
						if (local194 != -1) {
							for (@Pc(245) int local245 = 0; local245 < local24; local245++) {
								if (local164 == local27[local245] && local180 == local33[local245] && local30[local245] == local145) {
									local199 = local106[local245];
									local206 = local106[local245 + 1];
									@Pc(278) int local278 = -1;
									for (@Pc(280) int local280 = local199; local280 < local206; local280++) {
										local278 = local109[local280] - 1;
										if (local278 == -1 || local45[local278] != 0) {
											break;
										}
									}
									if (local278 != -1) {
										if (local56 == null) {
											this.aClass301_1 = new Class301();
											local56 = this.aClass301_1.aShortArray124 = Static391.method5749(this.aShortArray12);
											local64 = this.aClass301_1.aShortArray125 = Static391.method5749(this.aShortArray17);
											local52 = this.aClass301_1.aShortArray123 = Static391.method5749(this.aShortArray23);
											local60 = this.aClass301_1.aByteArray88 = Static214.method3436(this.aByteArray21);
										}
										if (local93 == null) {
											@Pc(364) Class301 local364 = local8.aClass301_1 = new Class301();
											local93 = local364.aShortArray124 = Static391.method5749(local36);
											local89 = local364.aShortArray125 = Static391.method5749(local39);
											local85 = local364.aShortArray123 = Static391.method5749(local42);
											local81 = local364.aByteArray88 = Static214.method3436(local45);
										}
										@Pc(397) short local397 = this.aShortArray12[local194];
										@Pc(402) short local402 = this.aShortArray17[local194];
										@Pc(407) short local407 = this.aShortArray23[local194];
										local206 = local106[local245 + 1];
										@Pc(418) byte local418 = this.aByteArray21[local194];
										local199 = local106[local245];
										@Pc(432) int local432;
										for (@Pc(424) int local424 = local199; local424 < local206; local424++) {
											local432 = local109[local424] - 1;
											if (local432 == -1) {
												break;
											}
											if (local81[local432] != 0) {
												local93[local432] += local397;
												local89[local432] += local402;
												local85[local432] += local407;
												local81[local432] += local418;
											}
										}
										local397 = local36[local278];
										local199 = this.anIntArray81[local135];
										local206 = this.anIntArray81[local135 + 1];
										local402 = local39[local278];
										local418 = local45[local278];
										local407 = local42[local278];
										for (local432 = local199; local432 < local206; local432++) {
											@Pc(517) int local517 = this.aShortArray21[local432] - 1;
											if (local517 == -1) {
												break;
											}
											if (local60[local517] != 0) {
												local56[local517] += local397;
												local64[local517] += local402;
												local52[local517] += local407;
												local60[local517] += local418;
											}
										}
										local8.method1664();
										this.method1664();
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
