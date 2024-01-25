import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "[Lclient!kd;")
	private Class139[] aClass139Array1;

	@OriginalMember(owner = "client!gm", name = "v", descriptor = "[I")
	private int[] anIntArray277;

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "[I")
	private int[] anIntArray278;

	@OriginalMember(owner = "client!gm", name = "B", descriptor = "[Lclient!gq;")
	private Class96[] aClass96Array1;

	@OriginalMember(owner = "client!gm", name = "D", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "[F")
	private float[] aFloatArray22;

	@OriginalMember(owner = "client!gm", name = "I", descriptor = "Lclient!gg;")
	private Interface4 anInterface4_5;

	@OriginalMember(owner = "client!gm", name = "K", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!gm", name = "L", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!gm", name = "M", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!gm", name = "P", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!gm", name = "S", descriptor = "Lclient!na;")
	private Class171 aClass171_1;

	@OriginalMember(owner = "client!gm", name = "U", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!gm", name = "W", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!gm", name = "Z", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!gm", name = "db", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!gm", name = "ib", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!gm", name = "jb", descriptor = "[I")
	private int[] anIntArray281;

	@OriginalMember(owner = "client!gm", name = "kb", descriptor = "I")
	private int anInt2805;

	@OriginalMember(owner = "client!gm", name = "ob", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!gm", name = "qb", descriptor = "Lclient!af;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!gm", name = "wb", descriptor = "[F")
	private float[] aFloatArray23;

	@OriginalMember(owner = "client!gm", name = "yb", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!gm", name = "Db", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!gm", name = "Gb", descriptor = "I")
	private int anInt2816;

	@OriginalMember(owner = "client!gm", name = "Ib", descriptor = "B")
	private byte aByte23;

	@OriginalMember(owner = "client!gm", name = "Lb", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!gm", name = "Mb", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!gm", name = "Nb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!gm", name = "Ob", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!gm", name = "Pb", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!gm", name = "Rb", descriptor = "[Lclient!fi;")
	private Class78[] aClass78Array2;

	@OriginalMember(owner = "client!gm", name = "Zb", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!gm", name = "gc", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!gm", name = "hc", descriptor = "I")
	private int anInt2833;

	@OriginalMember(owner = "client!gm", name = "nc", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!gm", name = "qc", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!gm", name = "sc", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!gm", name = "tc", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!gm", name = "uc", descriptor = "[Lclient!kh;")
	private Class141[] aClass141Array2;

	@OriginalMember(owner = "client!gm", name = "vc", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!gm", name = "nb", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!gm", name = "ac", descriptor = "I")
	private int anInt2828 = 0;

	@OriginalMember(owner = "client!gm", name = "Xb", descriptor = "I")
	private int anInt2826 = 0;

	@OriginalMember(owner = "client!gm", name = "ub", descriptor = "I")
	private int anInt2810 = 0;

	@OriginalMember(owner = "client!gm", name = "bc", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!gm", name = "ic", descriptor = "I")
	private int anInt2834 = 0;

	@OriginalMember(owner = "client!gm", name = "rc", descriptor = "I")
	private int anInt2839 = 0;

	@OriginalMember(owner = "client!gm", name = "kc", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_18;

	@OriginalMember(owner = "client!gm", name = "xb", descriptor = "Lclient!er;")
	private Class71 aClass71_8;

	@OriginalMember(owner = "client!gm", name = "zb", descriptor = "Lclient!er;")
	private Class71 aClass71_9;

	@OriginalMember(owner = "client!gm", name = "mb", descriptor = "Lclient!er;")
	private Class71 aClass71_7;

	@OriginalMember(owner = "client!gm", name = "bb", descriptor = "Lclient!er;")
	private Class71 aClass71_6;

	@OriginalMember(owner = "client!gm", name = "mc", descriptor = "Lclient!ni;")
	private Class173 aClass173_1;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class63_Sub2(@OriginalArg(0) Class50_Sub1 arg0) {
		this.aClass50_Sub1_18 = arg0;
		this.aClass71_8 = new Class71(null, 5126, 3, 0);
		this.aClass71_9 = new Class71(null, 5126, 2, 0);
		this.aClass71_7 = new Class71(null, 5126, 3, 0);
		this.aClass71_6 = new Class71(null, 5121, 4, 0);
		this.aClass173_1 = new Class173();
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!da;Lclient!pn;IIII)V")
	public Class63_Sub2(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2816 = arg5;
		this.anInt2833 = arg2;
		this.aClass50_Sub1_18 = arg0;
		if (Static41.method648(arg5, arg2)) {
			this.aClass71_8 = new Class71(null, 5126, 3, 0);
		}
		if (Static372.method4979(arg2, arg5)) {
			this.aClass71_9 = new Class71(null, 5126, 2, 0);
		}
		if (Static119.method2055(arg5, arg2)) {
			this.aClass71_7 = new Class71(null, 5126, 3, 0);
		}
		if (Static166.method2767(arg5, arg2)) {
			this.aClass71_6 = new Class71(null, 5121, 4, 0);
		}
		if (Static373.method4981(arg5, arg2)) {
			this.aClass173_1 = new Class173();
		}
		@Pc(102) Interface7 local102 = arg0.anInterface7_8;
		this.anIntArray283 = new int[arg1.anInt5445 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt5448];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt5448; local115++) {
			if ((arg1.aByteArray63 == null || arg1.aByteArray63[local115] != 2) && (arg1.aShortArray96 == null || arg1.aShortArray96[local115] == -1 || !local102.method4447(arg1.aShortArray96[local115] & 0xFFFF).aBoolean479)) {
				local113[this.anInt2839++] = local115;
				this.anIntArray283[arg1.aShortArray97[local115]]++;
				this.anIntArray283[arg1.aShortArray94[local115]]++;
				this.anIntArray283[arg1.aShortArray93[local115]]++;
			}
		}
		this.anInt2826 = this.anInt2839;
		@Pc(203) long[] local203 = new long[this.anInt2839];
		@Pc(212) boolean local212 = (this.anInt2833 & 0x100) != 0;
		@Pc(224) int local224;
		@Pc(235) int local235;
		@Pc(363) int local363;
		label492: for (@Pc(214) int local214 = 0; local214 < this.anInt2839; local214++) {
			@Pc(220) int local220 = local113[local214];
			@Pc(222) Class259 local222 = null;
			local224 = 0;
			@Pc(226) byte local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			if (arg1.aClass162Array1 != null) {
				for (local235 = 0; local235 < arg1.aClass162Array1.length; local235++) {
					@Pc(242) Class162 local242 = arg1.aClass162Array1[local235];
					if (local242.anInt4484 == local220) {
						@Pc(255) Class231 local255 = Static231.method3446(local242.anInt4483);
						if (local255.aBoolean434) {
							local203[local214] = Long.MAX_VALUE;
							this.anInt2826--;
							continue label492;
						}
					}
				}
			}
			@Pc(278) short local278 = -1;
			if (arg1.aShortArray96 != null) {
				local278 = arg1.aShortArray96[local220];
				if (local278 != -1) {
					local222 = local102.method4447(local278 & 0xFFFF);
					local230 = local222.aByte105;
					local228 = local222.aByte100;
				}
			}
			@Pc(319) boolean local319 = arg1.aByteArray67 != null && arg1.aByteArray67[local220] != 0 || local222 != null && !local222.aBoolean475;
			if ((local212 || local319) && arg1.aByteArray66 != null) {
				local224 += arg1.aByteArray66[local220] << 17;
			}
			if (local319) {
				local224 += 65536;
			}
			local224 += (local228 & 0xFF) << 8;
			local224 += local230 & 0xFF;
			local363 = local226 + ((local278 & 0xFFFF) << 16);
			@Pc(369) int local369 = local363 + (local214 & 0xFFFF);
			local203[local214] = (long) local369 + ((long) local224 << 32);
		}
		Static4.method4577(local203, local113);
		this.anIntArray280 = arg1.anIntArray520;
		this.anInt2834 = arg1.anInt5453;
		this.anIntArray277 = arg1.anIntArray519;
		this.anInt2810 = arg1.anInt5445;
		this.aShortArray36 = arg1.aShortArray98;
		this.anIntArray278 = arg1.anIntArray527;
		this.aClass141Array2 = arg1.aClass141Array3;
		@Pc(424) Class247[] local424 = new Class247[this.anInt2810];
		this.aClass78Array2 = arg1.aClass78Array3;
		@Pc(448) int local448;
		@Pc(462) int local462;
		if (arg1.aClass162Array1 != null) {
			this.anInt2805 = arg1.aClass162Array1.length;
			this.aClass139Array1 = new Class139[this.anInt2805];
			this.aClass96Array1 = new Class96[this.anInt2805];
			for (local448 = 0; local448 < this.anInt2805; local448++) {
				@Pc(455) Class162 local455 = arg1.aClass162Array1[local448];
				@Pc(460) Class231 local460 = Static231.method3446(local455.anInt4483);
				local462 = -1;
				for (@Pc(464) int local464 = 0; local464 < this.anInt2839; local464++) {
					if (local455.anInt4484 == local113[local464]) {
						local462 = local464;
						break;
					}
				}
				if (local462 == -1) {
					throw new RuntimeException();
				}
				local235 = Static451.anIntArray744[arg1.aShortArray91[local455.anInt4484] & 0xFFFF] & 0xFFFFFF;
				local235 |= 255 - (arg1.aByteArray67 == null ? 0 : arg1.aByteArray67[local455.anInt4484]) << 24;
				this.aClass96Array1[local448] = new Class96(local462, arg1.aShortArray97[local455.anInt4484], arg1.aShortArray94[local455.anInt4484], arg1.aShortArray93[local455.anInt4484], local460.anInt6572, local460.anInt6571, local460.anInt6566, local460.anInt6567, local460.anInt6565, local460.aBoolean434, local460.aBoolean435, local455.anInt4482);
				this.aClass139Array1[local448] = new Class139(local235);
			}
		}
		local448 = this.anInt2839 * 3;
		this.aShortArray38 = new short[this.anInt2839];
		this.aShort27 = (short) arg4;
		if (arg1.aShortArray90 != null) {
			this.aShortArray40 = new short[this.anInt2839];
		}
		this.aShortArray41 = new short[local448];
		this.aByteArray30 = new byte[this.anInt2839];
		this.aShortArray32 = new short[local448];
		this.aFloatArray23 = new float[local448];
		this.aShortArray33 = new short[this.anInt2839];
		this.aShortArray31 = new short[local448];
		this.aShortArray39 = new short[local448];
		this.aFloatArray22 = new float[local448];
		this.aShort32 = (short) arg3;
		this.aShortArray37 = new short[this.anInt2839];
		this.aByteArray31 = new byte[local448];
		this.aShortArray34 = new short[this.anInt2839];
		this.aShortArray35 = new short[this.anInt2839];
		Static168.aLongArray4 = new long[local448];
		local224 = 0;
		for (local363 = 0; local363 < arg1.anInt5445; local363++) {
			local462 = this.anIntArray283[local363];
			this.anIntArray283[local363] = local224;
			local224 += local462;
			local424[local363] = new Class247();
		}
		this.anIntArray283[arg1.anInt5445] = local224;
		@Pc(704) int[] local704 = null;
		@Pc(706) int[] local706 = null;
		@Pc(708) int[] local708 = null;
		@Pc(710) float[][] local710 = null;
		@Pc(736) int local736;
		@Pc(775) int local775;
		@Pc(781) int local781;
		@Pc(794) int local794;
		@Pc(796) int local796;
		@Pc(830) int local830;
		@Pc(835) int local835;
		@Pc(978) float local978;
		@Pc(1007) float local1007;
		@Pc(976) float local976;
		if (arg1.aByteArray69 != null) {
			@Pc(716) int local716 = arg1.anInt5444;
			@Pc(719) int[] local719 = new int[local716];
			@Pc(722) int[] local722 = new int[local716];
			@Pc(725) int[] local725 = new int[local716];
			@Pc(728) int[] local728 = new int[local716];
			@Pc(731) int[] local731 = new int[local716];
			@Pc(734) int[] local734 = new int[local716];
			for (local736 = 0; local736 < local716; local736++) {
				local719[local736] = Integer.MAX_VALUE;
				local722[local736] = -2147483647;
				local725[local736] = Integer.MAX_VALUE;
				local728[local736] = -2147483647;
				local731[local736] = Integer.MAX_VALUE;
				local734[local736] = -2147483647;
			}
			local710 = new float[local716][];
			for (local775 = 0; local775 < this.anInt2839; local775++) {
				local781 = local113[local775];
				if (arg1.aByteArray69[local781] != -1) {
					local794 = arg1.aByteArray69[local781] & 0xFF;
					for (local796 = 0; local796 < 3; local796++) {
						@Pc(811) short local811;
						if (local796 == 0) {
							local811 = arg1.aShortArray97[local781];
						} else if (local796 == 1) {
							local811 = arg1.aShortArray94[local781];
						} else {
							local811 = arg1.aShortArray93[local781];
						}
						local830 = arg1.anIntArray519[local811];
						local835 = arg1.anIntArray527[local811];
						@Pc(840) int local840 = arg1.anIntArray520[local811];
						if (local719[local794] > local830) {
							local719[local794] = local830;
						}
						if (local830 > local722[local794]) {
							local722[local794] = local830;
						}
						if (local835 < local725[local794]) {
							local725[local794] = local835;
						}
						if (local728[local794] < local835) {
							local728[local794] = local835;
						}
						if (local840 < local731[local794]) {
							local731[local794] = local840;
						}
						if (local734[local794] < local840) {
							local734[local794] = local840;
						}
					}
				}
			}
			local704 = new int[local716];
			local708 = new int[local716];
			local706 = new int[local716];
			for (local781 = 0; local781 < local716; local781++) {
				@Pc(923) byte local923 = arg1.aByteArray68[local781];
				if (local923 > 0) {
					local704[local781] = (local719[local781] + local722[local781]) / 2;
					local706[local781] = (local725[local781] + local728[local781]) / 2;
					local708[local781] = (local734[local781] + local731[local781]) / 2;
					if (local923 == 1) {
						local835 = arg1.anIntArray529[local781];
						if (local835 == 0) {
							local976 = 1.0F;
							local978 = 1.0F;
						} else if (local835 <= 0) {
							local976 = 1.0F;
							local978 = (float) -local835 / 1024.0F;
						} else {
							local978 = 1.0F;
							local976 = (float) local835 / 1024.0F;
						}
						local1007 = 64.0F / (float) arg1.anIntArray524[local781];
					} else if (local923 == 2) {
						local1007 = 64.0F / (float) arg1.anIntArray524[local781];
						local978 = 64.0F / (float) arg1.anIntArray529[local781];
						local976 = 64.0F / (float) arg1.anIntArray523[local781];
					} else {
						local978 = (float) arg1.anIntArray529[local781] / 1024.0F;
						local1007 = (float) arg1.anIntArray524[local781] / 1024.0F;
						local976 = (float) arg1.anIntArray523[local781] / 1024.0F;
					}
					local710[local781] = Static97.method1069(arg1.aShortArray89[local781], arg1.aShortArray92[local781], local976, arg1.aByteArray64[local781] & 0xFF, local1007, arg1.aShortArray95[local781], local978);
				}
			}
		}
		@Pc(1098) Class195[] local1098 = new Class195[arg1.anInt5448];
		@Pc(1117) short local1117;
		@Pc(1128) int local1128;
		@Pc(1139) int local1139;
		@Pc(1199) int local1199;
		for (@Pc(1100) int local1100 = 0; local1100 < arg1.anInt5448; local1100++) {
			@Pc(1107) short local1107 = arg1.aShortArray97[local1100];
			@Pc(1112) short local1112 = arg1.aShortArray94[local1100];
			local1117 = arg1.aShortArray93[local1100];
			local1128 = this.anIntArray277[local1112] - this.anIntArray277[local1107];
			local1139 = this.anIntArray278[local1112] - this.anIntArray278[local1107];
			local736 = this.anIntArray280[local1112] - this.anIntArray280[local1107];
			local775 = this.anIntArray277[local1117] - this.anIntArray277[local1107];
			local781 = this.anIntArray278[local1117] - this.anIntArray278[local1107];
			local794 = this.anIntArray280[local1117] - this.anIntArray280[local1107];
			local796 = local794 * local1139 - local736 * local781;
			local1199 = local736 * local775 - local1128 * local794;
			local830 = local781 * local1128 - local1139 * local775;
			while (local796 > 8192 || local1199 > 8192 || local830 > 8192 || local796 < -8192 || local1199 < -8192 || local830 < -8192) {
				local830 >>= 0x1;
				local1199 >>= 0x1;
				local796 >>= 0x1;
			}
			local835 = (int) Math.sqrt((double) (local830 * local830 + local796 * local796 + local1199 * local1199));
			if (local835 <= 0) {
				local835 = 1;
			}
			local796 = local796 * 256 / local835;
			local830 = local830 * 256 / local835;
			local1199 = local1199 * 256 / local835;
			@Pc(1293) byte local1293 = arg1.aByteArray63 == null ? 0 : arg1.aByteArray63[local1100];
			if (local1293 == 0) {
				@Pc(1299) Class247 local1299 = local424[local1107];
				local1299.anInt6788++;
				local1299.anInt6790 += local830;
				local1299.anInt6796 += local796;
				local1299.anInt6792 += local1199;
				@Pc(1327) Class247 local1327 = local424[local1112];
				local1327.anInt6790 += local830;
				local1327.anInt6796 += local796;
				local1327.anInt6792 += local1199;
				local1327.anInt6788++;
				@Pc(1355) Class247 local1355 = local424[local1117];
				local1355.anInt6788++;
				local1355.anInt6796 += local796;
				local1355.anInt6790 += local830;
				local1355.anInt6792 += local1199;
			} else if (local1293 == 1) {
				@Pc(1394) Class195 local1394 = local1098[local1100] = new Class195();
				local1394.anInt5491 = local1199;
				local1394.anInt5492 = local830;
				local1394.anInt5489 = local796;
			}
		}
		@Pc(1416) int local1416;
		for (@Pc(1410) int local1410 = 0; local1410 < this.anInt2839; local1410++) {
			local1416 = local113[local1410];
			@Pc(1423) int local1423 = arg1.aShortArray91[local1416] & 0xFFFF;
			@Pc(1431) short local1431;
			if (arg1.aShortArray96 == null) {
				local1431 = -1;
			} else {
				local1431 = arg1.aShortArray96[local1416];
			}
			if (arg1.aByteArray69 == null) {
				local1139 = -1;
			} else {
				local1139 = arg1.aByteArray69[local1416];
			}
			if (arg1.aByteArray67 == null) {
				local736 = 0;
			} else {
				local736 = arg1.aByteArray67[local1416] & 0xFF;
			}
			@Pc(1463) float local1463 = 0.0F;
			@Pc(1465) float local1465 = 0.0F;
			@Pc(1467) float local1467 = 0.0F;
			local978 = 0.0F;
			local1007 = 0.0F;
			local976 = 0.0F;
			@Pc(1475) byte local1475 = 0;
			@Pc(1477) byte local1477 = 0;
			@Pc(1479) int local1479 = 0;
			@Pc(1494) byte local1494;
			@Pc(1511) short local1511;
			@Pc(2255) short local2255;
			@Pc(2260) short local2260;
			if (local1431 != -1) {
				if (local1139 == -1) {
					local1467 = 1.0F;
					local978 = 1.0F;
					local1477 = 2;
					local1465 = 1.0F;
					local1463 = 0.0F;
					local976 = 0.0F;
					local1475 = 1;
					local1007 = 0.0F;
				} else {
					local1139 &= 0xFF;
					local1494 = arg1.aByteArray68[local1139];
					@Pc(1501) short local1501;
					@Pc(1506) short local1506;
					@Pc(1540) float local1540;
					@Pc(1553) float local1553;
					@Pc(1632) float local1632;
					@Pc(1869) float local1869;
					@Pc(1877) float local1877;
					@Pc(1885) float local1885;
					@Pc(1908) float local1908;
					@Pc(1931) float local1931;
					@Pc(1954) float local1954;
					if (local1494 == 0) {
						local1501 = arg1.aShortArray97[local1416];
						local1506 = arg1.aShortArray94[local1416];
						local1511 = arg1.aShortArray93[local1416];
						local2255 = arg1.aShortArray95[local1139];
						local2260 = arg1.aShortArray92[local1139];
						@Pc(2265) short local2265 = arg1.aShortArray89[local1139];
						@Pc(2271) float local2271 = (float) arg1.anIntArray519[local2255];
						@Pc(2277) float local2277 = (float) arg1.anIntArray527[local2255];
						local1540 = arg1.anIntArray520[local2255];
						local1553 = (float) arg1.anIntArray519[local2260] - local2271;
						local1632 = (float) arg1.anIntArray527[local2260] - local2277;
						@Pc(2309) float local2309 = (float) arg1.anIntArray520[local2260] - local1540;
						@Pc(2318) float local2318 = (float) arg1.anIntArray519[local2265] - local2271;
						@Pc(2327) float local2327 = (float) arg1.anIntArray527[local2265] - local2277;
						@Pc(2336) float local2336 = (float) arg1.anIntArray520[local2265] - local1540;
						@Pc(2344) float local2344 = (float) arg1.anIntArray519[local1501] - local2271;
						@Pc(2353) float local2353 = (float) arg1.anIntArray527[local1501] - local2277;
						@Pc(2362) float local2362 = (float) arg1.anIntArray520[local1501] - local1540;
						@Pc(2371) float local2371 = (float) arg1.anIntArray519[local1506] - local2271;
						@Pc(2379) float local2379 = (float) arg1.anIntArray527[local1506] - local2277;
						local1869 = (float) arg1.anIntArray520[local1506] - local1540;
						local1877 = (float) arg1.anIntArray519[local1511] - local2271;
						local1885 = (float) arg1.anIntArray527[local1511] - local2277;
						local1908 = (float) arg1.anIntArray520[local1511] - local1540;
						local1931 = local1632 * local2336 - local2327 * local2309;
						local1954 = local2318 * local2309 - local1553 * local2336;
						@Pc(2438) float local2438 = local1553 * local2327 - local1632 * local2318;
						@Pc(2446) float local2446 = local2327 * local2438 - local1954 * local2336;
						@Pc(2455) float local2455 = local2336 * local1931 - local2438 * local2318;
						@Pc(2464) float local2464 = local1954 * local2318 - local1931 * local2327;
						@Pc(2478) float local2478 = 1.0F / (local1632 * local2455 + local1553 * local2446 + local2309 * local2464);
						local1007 = (local2446 * local1877 + local2455 * local1885 + local2464 * local1908) * local2478;
						local1463 = (local2362 * local2464 + local2446 * local2344 + local2455 * local2353) * local2478;
						local1467 = local2478 * (local2455 * local2379 + local2371 * local2446 + local1869 * local2464);
						@Pc(2528) float local2528 = local1931 * local2309 - local1553 * local2438;
						@Pc(2536) float local2536 = local1632 * local2438 - local2309 * local1954;
						@Pc(2545) float local2545 = local1954 * local1553 - local1632 * local1931;
						@Pc(2559) float local2559 = 1.0F / (local2327 * local2528 + local2536 * local2318 + local2336 * local2545);
						local978 = local2559 * (local1869 * local2545 + local2528 * local2379 + local2371 * local2536);
						local1465 = (local2528 * local2353 + local2344 * local2536 + local2362 * local2545) * local2559;
						local976 = local2559 * (local2536 * local1877 + local1885 * local2528 + local2545 * local1908);
					} else {
						local1501 = arg1.aShortArray97[local1416];
						local1506 = arg1.aShortArray94[local1416];
						local1511 = arg1.aShortArray93[local1416];
						@Pc(1515) int local1515 = local704[local1139];
						@Pc(1519) int local1519 = local706[local1139];
						@Pc(1523) int local1523 = local708[local1139];
						@Pc(1527) float[] local1527 = local710[local1139];
						@Pc(1532) byte local1532 = arg1.aByteArray65[local1139];
						local1540 = (float) arg1.anIntArray525[local1139] / 256.0F;
						if (local1494 == 1) {
							local1553 = (float) arg1.anIntArray523[local1139] / 1024.0F;
							Static139.method2393(local1553, local1523, arg1.anIntArray520[local1501], local1540, local1527, arg1.anIntArray519[local1501], arg1.anIntArray527[local1501], local1515, local1519, local1532);
							local1465 = Static190.aFloat61;
							local1463 = Static17.aFloat7;
							Static139.method2393(local1553, local1523, arg1.anIntArray520[local1506], local1540, local1527, arg1.anIntArray519[local1506], arg1.anIntArray527[local1506], local1515, local1519, local1532);
							local978 = Static190.aFloat61;
							local1467 = Static17.aFloat7;
							Static139.method2393(local1553, local1523, arg1.anIntArray520[local1511], local1540, local1527, arg1.anIntArray519[local1511], arg1.anIntArray527[local1511], local1515, local1519, local1532);
							local976 = Static190.aFloat61;
							local1007 = Static17.aFloat7;
							local1632 = local1553 / 2.0F;
							if ((local1532 & 0x1) == 0) {
								if (local1007 - local1463 > local1632) {
									local1477 = 1;
									local1007 -= local1553;
								} else if (local1632 < local1463 - local1007) {
									local1477 = 2;
									local1007 += local1553;
								}
								if (local1632 < local1467 - local1463) {
									local1475 = 1;
									local1467 -= local1553;
								} else if (local1463 - local1467 > local1632) {
									local1475 = 2;
									local1467 += local1553;
								}
							} else {
								if (local1632 < local978 - local1465) {
									local1475 = 1;
									local978 -= local1553;
								} else if (local1632 < local1465 - local978) {
									local1475 = 2;
									local978 += local1553;
								}
								if (local976 - local1465 > local1632) {
									local976 -= local1553;
									local1477 = 1;
								} else if (local1632 < local1465 - local976) {
									local1477 = 2;
									local976 += local1553;
								}
							}
						} else if (local1494 == 2) {
							local1553 = (float) arg1.anIntArray522[local1139] / 256.0F;
							local1632 = (float) arg1.anIntArray521[local1139] / 256.0F;
							@Pc(1781) int local1781 = arg1.anIntArray519[local1506] - arg1.anIntArray519[local1501];
							@Pc(1792) int local1792 = arg1.anIntArray527[local1506] - arg1.anIntArray527[local1501];
							@Pc(1803) int local1803 = arg1.anIntArray520[local1506] - arg1.anIntArray520[local1501];
							@Pc(1814) int local1814 = arg1.anIntArray519[local1511] - arg1.anIntArray519[local1501];
							@Pc(1825) int local1825 = arg1.anIntArray527[local1511] - arg1.anIntArray527[local1501];
							@Pc(1836) int local1836 = arg1.anIntArray520[local1511] - arg1.anIntArray520[local1501];
							@Pc(1844) int local1844 = local1792 * local1836 - local1803 * local1825;
							@Pc(1852) int local1852 = local1814 * local1803 - local1836 * local1781;
							@Pc(1861) int local1861 = local1781 * local1825 - local1814 * local1792;
							local1869 = 64.0F / (float) arg1.anIntArray529[local1139];
							local1877 = 64.0F / (float) arg1.anIntArray524[local1139];
							local1885 = 64.0F / (float) arg1.anIntArray523[local1139];
							local1908 = ((float) local1852 * local1527[1] + (float) local1844 * local1527[0] + local1527[2] * (float) local1861) / local1869;
							local1931 = (local1527[3] * (float) local1844 + (float) local1852 * local1527[4] + local1527[5] * (float) local1861) / local1877;
							local1954 = (local1527[8] * (float) local1861 + local1527[7] * (float) local1852 + (float) local1844 * local1527[6]) / local1885;
							local1479 = Static359.method4807(local1908, local1954, local1931);
							Static53.method912(local1632, local1523, local1527, local1515, local1519, local1553, local1532, arg1.anIntArray519[local1501], arg1.anIntArray527[local1501], local1540, local1479, arg1.anIntArray520[local1501]);
							local1463 = Static55.aFloat12;
							local1465 = Static387.aFloat111;
							Static53.method912(local1632, local1523, local1527, local1515, local1519, local1553, local1532, arg1.anIntArray519[local1506], arg1.anIntArray527[local1506], local1540, local1479, arg1.anIntArray520[local1506]);
							local978 = Static387.aFloat111;
							local1467 = Static55.aFloat12;
							Static53.method912(local1632, local1523, local1527, local1515, local1519, local1553, local1532, arg1.anIntArray519[local1511], arg1.anIntArray527[local1511], local1540, local1479, arg1.anIntArray520[local1511]);
							local976 = Static387.aFloat111;
							local1007 = Static55.aFloat12;
						} else if (local1494 == 3) {
							Static30.method435(local1523, local1527, arg1.anIntArray520[local1501], local1532, local1519, local1515, local1540, arg1.anIntArray519[local1501], arg1.anIntArray527[local1501]);
							local1463 = Static413.aFloat118;
							local1465 = Static415.aFloat119;
							Static30.method435(local1523, local1527, arg1.anIntArray520[local1506], local1532, local1519, local1515, local1540, arg1.anIntArray519[local1506], arg1.anIntArray527[local1506]);
							local978 = Static415.aFloat119;
							local1467 = Static413.aFloat118;
							Static30.method435(local1523, local1527, arg1.anIntArray520[local1511], local1532, local1519, local1515, local1540, arg1.anIntArray519[local1511], arg1.anIntArray527[local1511]);
							local1007 = Static413.aFloat118;
							local976 = Static415.aFloat119;
							if ((local1532 & 0x1) == 0) {
								if (local1467 - local1463 > 0.5F) {
									local1467--;
									local1475 = 1;
								} else if (local1463 - local1467 > 0.5F) {
									local1475 = 2;
									local1467++;
								}
								if (local1007 - local1463 > 0.5F) {
									local1477 = 1;
									local1007--;
								} else if (local1463 - local1007 > 0.5F) {
									local1477 = 2;
									local1007++;
								}
							} else {
								if (local976 - local1465 > 0.5F) {
									local1477 = 1;
									local976--;
								} else if (local1465 - local976 > 0.5F) {
									local976++;
									local1477 = 2;
								}
								if (local978 - local1465 > 0.5F) {
									local978--;
									local1475 = 1;
								} else if (local1465 - local978 > 0.5F) {
									local978++;
									local1475 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray63 == null) {
				local1494 = 0;
			} else {
				local1494 = arg1.aByteArray63[local1416];
			}
			if (local1494 == 0) {
				@Pc(2780) long local2780 = ((long) local736 + (long) (local1423 << 8) + (long) (local1479 << 24) << 32) + (long) (local1139 << 2);
				local1511 = arg1.aShortArray97[local1416];
				local2255 = arg1.aShortArray94[local1416];
				local2260 = arg1.aShortArray93[local1416];
				@Pc(2799) Class247 local2799 = local424[local1511];
				this.aShortArray34[local1410] = this.method2335(local1465, local1463, local2780, local2799.anInt6788, local1511, arg1, local2799.anInt6790, local2799.anInt6792, local2799.anInt6796);
				@Pc(2823) Class247 local2823 = local424[local2255];
				this.aShortArray38[local1410] = this.method2335(local978, local1467, local2780 + (long) local1475, local2823.anInt6788, local2255, arg1, local2823.anInt6790, local2823.anInt6792, local2823.anInt6796);
				@Pc(2850) Class247 local2850 = local424[local2260];
				this.aShortArray37[local1410] = this.method2335(local976, local1007, local2780 + (long) local1477, local2850.anInt6788, local2260, arg1, local2850.anInt6790, local2850.anInt6792, local2850.anInt6796);
			} else if (local1494 == 1) {
				@Pc(2645) Class195 local2645 = local1098[local1416];
				@Pc(2686) long local2686 = ((long) local736 + (long) (local1479 << 24) + (long) (local1423 << 8) << 32) + (long) ((local2645.anInt5492 + 256 << 22) + (local2645.anInt5491 + 256 << 12) + (local2645.anInt5489 <= 0 ? 2048 : 1024) + (local1139 << 2));
				this.aShortArray34[local1410] = this.method2335(local1465, local1463, local2686, 0, arg1.aShortArray97[local1416], arg1, local2645.anInt5492, local2645.anInt5491, local2645.anInt5489);
				this.aShortArray38[local1410] = this.method2335(local978, local1467, local2686 + (long) local1475, 0, arg1.aShortArray94[local1416], arg1, local2645.anInt5492, local2645.anInt5491, local2645.anInt5489);
				this.aShortArray37[local1410] = this.method2335(local976, local1007, (long) local1477 + local2686, 0, arg1.aShortArray93[local1416], arg1, local2645.anInt5492, local2645.anInt5491, local2645.anInt5489);
			}
			if (arg1.aShortArray96 == null) {
				this.aShortArray33[local1410] = -1;
			} else {
				this.aShortArray33[local1410] = arg1.aShortArray96[local1416];
			}
			if (arg1.aByteArray67 != null) {
				this.aByteArray30[local1410] = arg1.aByteArray67[local1416];
			}
			if (arg1.aShortArray90 != null) {
				this.aShortArray40[local1410] = arg1.aShortArray90[local1416];
			}
			this.aShortArray35[local1410] = arg1.aShortArray91[local1416];
		}
		local1416 = 0;
		local1117 = -10000;
		for (local1128 = 0; local1128 < this.anInt2826; local1128++) {
			@Pc(2939) short local2939 = this.aShortArray33[local1128];
			if (local2939 != local1117) {
				local1117 = local2939;
				local1416++;
			}
		}
		this.anIntArray281 = new int[local1416 + 1];
		local1416 = 0;
		local1117 = -10000;
		for (local1139 = 0; local1139 < this.anInt2826; local1139++) {
			@Pc(2973) short local2973 = this.aShortArray33[local1139];
			if (local2973 != local1117) {
				local1117 = local2973;
				this.anIntArray281[local1416++] = local1139;
			}
		}
		this.anIntArray281[local1416] = this.anInt2826;
		Static168.aLongArray4 = null;
		this.aShortArray39 = Static14.method196(this.aShortArray39, this.anInt2828);
		this.aShortArray41 = Static14.method196(this.aShortArray41, this.anInt2828);
		this.aShortArray32 = Static14.method196(this.aShortArray32, this.anInt2828);
		this.aByteArray31 = Static206.method3212(this.aByteArray31, this.anInt2828);
		this.aFloatArray22 = Static178.method2953(this.aFloatArray22, this.anInt2828);
		this.aFloatArray23 = Static178.method2953(this.aFloatArray23, this.anInt2828);
		if (arg1.anIntArray528 != null && Static21.method289(this.anInt2816, arg2)) {
			this.anIntArrayArray29 = arg1.method4335();
		}
		if (arg1.aClass162Array1 != null && Static286.method4049(this.anInt2816, arg2)) {
			this.anIntArrayArray30 = arg1.method4334();
		}
		if (arg1.anIntArray526 != null && Static56.method1009(arg2, this.anInt2816)) {
			local736 = 0;
			@Pc(3091) int[] local3091 = new int[256];
			for (local781 = 0; local781 < this.anInt2839; local781++) {
				local794 = arg1.anIntArray526[local113[local781]];
				if (local794 >= 0) {
					if (local794 > local736) {
						local736 = local794;
					}
					@Pc(3117) int local3117 = local3091[local794]++;
				}
			}
			this.anIntArrayArray28 = new int[local736 + 1][];
			for (local794 = 0; local794 <= local736; local794++) {
				this.anIntArrayArray28[local794] = new int[local3091[local794]];
				local3091[local794] = 0;
			}
			for (local796 = 0; local796 < this.anInt2839; local796++) {
				local1199 = arg1.anIntArray526[local113[local796]];
				if (local1199 >= 0) {
					this.anIntArrayArray28[local1199][local3091[local1199]++] = local796;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "MA", descriptor = "()I")
	@Override
	public int MA() {
		if (!this.aBoolean209) {
			this.method2339();
		}
		return this.aShort33;
	}

	@OriginalMember(owner = "client!gm", name = "u", descriptor = "(SS)V")
	@Override
	public void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass50_Sub1_18.anInterface7_8;
		for (@Pc(11) int local11 = 0; local11 < this.anInt2839; local11++) {
			if (this.aShortArray33[local11] == arg0) {
				this.aShortArray33[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class259 local47 = local9.method4447(arg0 & 0xFFFF);
			local35 = local47.aByte99;
			local37 = local47.aByte102;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class259 local68 = local9.method4447(arg1 & 0xFFFF);
			local55 = local68.aByte99;
			local57 = local68.aByte102;
		}
		if (!(local57 != local37 | local55 != local35)) {
			return;
		}
		if (this.aClass96Array1 != null) {
			for (@Pc(93) int local93 = 0; local93 < this.anInt2805; local93++) {
				@Pc(100) Class96 local100 = this.aClass96Array1[local93];
				@Pc(105) Class139 local105 = this.aClass139Array1[local93];
				local105.anInt4072 = local105.anInt4072 & 0xFF000000 | Static451.anIntArray744[this.aShortArray35[local100.anInt2883] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass71_6 != null) {
			this.aClass71_6.anInterface4_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()V")
	@Override
	public void method6089() {
		if (this.anInt2828 <= 0 || this.anInt2826 <= 0) {
			return;
		}
		this.method2329(false);
		if ((this.aByte23 & 0x10) == 0 && this.aClass173_1.anInterface1_3 == null) {
			this.method2338(false);
		}
		this.method2336();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZZ)V")
	private void method2329(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass71_6 != null && this.aClass71_6.anInterface4_4 == null;
		@Pc(27) boolean local27 = this.aClass71_7 != null && this.aClass71_7.anInterface4_4 == null;
		@Pc(38) boolean local38 = this.aClass71_8 != null && this.aClass71_8.anInterface4_4 == null;
		@Pc(49) boolean local49 = this.aClass71_9 != null && this.aClass71_9.anInterface4_4 == null;
		if (arg0) {
			local16 &= (this.aByte23 & 0x2) != 0;
			local38 &= (this.aByte23 & 0x1) != 0;
			local49 &= (this.aByte23 & 0x8) != 0;
			local27 &= (this.aByte23 & 0x4) != 0;
		}
		@Pc(100) byte local100 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (local38) {
			local100 = 12;
		}
		@Pc(123) byte local123 = 0;
		if (local16) {
			local110 = local100;
			local100 = (byte) (local100 + 4);
		}
		if (local27) {
			local112 = local100;
			local100 = (byte) (local100 + 12);
		}
		if (local49) {
			local123 = local100;
			local100 = (byte) (local100 + 8);
		}
		if (local100 == 0) {
			return;
		}
		if (this.anInt2828 * local100 <= this.aClass50_Sub1_18.aClass10_Sub8_Sub1_2.aByteArray44.length) {
			this.aClass50_Sub1_18.aClass10_Sub8_Sub1_2.anInt2989 = 0;
		} else {
			this.aClass50_Sub1_18.aClass10_Sub8_Sub1_2 = new Class10_Sub8_Sub1(local100 * (this.anInt2828 + 100));
		}
		@Pc(186) Class10_Sub8_Sub1 local186 = this.aClass50_Sub1_18.aClass10_Sub8_Sub1_2;
		@Pc(194) int local194;
		@Pc(203) int local203;
		@Pc(231) int local231;
		@Pc(240) int local240;
		if (local38) {
			@Pc(210) int local210;
			@Pc(217) int local217;
			@Pc(222) int local222;
			@Pc(229) int local229;
			if (this.aClass50_Sub1_18.aBoolean99) {
				for (local194 = 0; local194 < this.anInt2810; local194++) {
					local203 = NativeStream.floatToRawIntBits((float) this.anIntArray277[local194]);
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray278[local194]);
					local217 = NativeStream.floatToRawIntBits((float) this.anIntArray280[local194]);
					local222 = this.anIntArray283[local194];
					local229 = this.anIntArray283[local194 + 1];
					for (local231 = local222; local231 < local229; local231++) {
						local240 = this.aShortArray31[local231] - 1;
						if (local240 == -1) {
							break;
						}
						local186.anInt2989 = local100 * local240;
						local186.method2506(local203);
						local186.method2506(local210);
						local186.method2506(local217);
					}
				}
			} else {
				for (local194 = 0; local194 < this.anInt2810; local194++) {
					local203 = NativeStream.floatToRawIntBits((float) this.anIntArray277[local194]);
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray278[local194]);
					local217 = NativeStream.floatToRawIntBits((float) this.anIntArray280[local194]);
					local222 = this.anIntArray283[local194];
					local229 = this.anIntArray283[local194 + 1];
					for (local231 = local222; local231 < local229; local231++) {
						local240 = this.aShortArray31[local231] - 1;
						if (local240 == -1) {
							break;
						}
						local186.anInt2989 = local240 * local100;
						local186.method2456(local203);
						local186.method2456(local210);
						local186.method2456(local217);
					}
				}
			}
		}
		@Pc(478) float local478;
		@Pc(373) short[] local373;
		@Pc(370) short[] local370;
		@Pc(376) short[] local376;
		@Pc(367) byte[] local367;
		@Pc(530) float local530;
		if (local16) {
			if (this.aClass71_7 == null) {
				if (this.aClass171_1 == null) {
					local367 = this.aByteArray31;
					local370 = this.aShortArray41;
					local373 = this.aShortArray39;
					local376 = this.aShortArray32;
				} else {
					local373 = this.aClass171_1.aShortArray72;
					local367 = this.aClass171_1.aByteArray54;
					local370 = this.aClass171_1.aShortArray71;
					local376 = this.aClass171_1.aShortArray70;
				}
				@Pc(400) float local400 = this.aClass50_Sub1_18.aFloatArray8[0];
				@Pc(406) float local406 = this.aClass50_Sub1_18.aFloatArray8[1];
				@Pc(412) float local412 = this.aClass50_Sub1_18.aFloatArray8[2];
				@Pc(416) float local416 = this.aClass50_Sub1_18.aFloat34;
				@Pc(426) float local426 = this.aClass50_Sub1_18.aFloat35 * 768.0F / (float) this.aShort27;
				@Pc(436) float local436 = this.aClass50_Sub1_18.aFloat30 * 768.0F / (float) this.aShort27;
				for (@Pc(438) int local438 = 0; local438 < this.anInt2839; local438++) {
					@Pc(458) int local458 = this.method2342(this.aShort32, this.aByteArray30[local438], this.aShortArray33[local438], this.aShortArray35[local438]);
					@Pc(467) float local467 = this.aClass50_Sub1_18.aFloat23 * (float) (local458 >>> 24);
					local478 = this.aClass50_Sub1_18.aFloat24 * (float) (local458 >> 16 & 0xFF);
					@Pc(489) float local489 = (float) (local458 >> 8 & 0xFF) * this.aClass50_Sub1_18.aFloat32;
					@Pc(494) short local494 = this.aShortArray34[local438];
					@Pc(499) short local499 = (short) local367[local494];
					if (local499 == 0) {
						local530 = ((float) local373[local494] * local400 + local406 * (float) local370[local494] + local412 * (float) local376[local494]) * 0.0026041667F;
					} else {
						local530 = (local400 * (float) local373[local494] + local406 * (float) local370[local494] + local412 * (float) local376[local494]) / (float) (local499 * 256);
					}
					@Pc(567) float local567 = local416 + (local530 < 0.0F ? local436 : local426) * local530;
					@Pc(572) int local572 = (int) (local467 * local567);
					if (local572 < 0) {
						local572 = 0;
					} else if (local572 > 255) {
						local572 = 255;
					}
					@Pc(591) int local591 = (int) (local478 * local567);
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					@Pc(610) int local610 = (int) (local567 * local489);
					if (local610 < 0) {
						local610 = 0;
					} else if (local610 > 255) {
						local610 = 255;
					}
					local186.anInt2989 = local110 + local100 * local494;
					local186.method2458(local572);
					local186.method2458(local591);
					local186.method2458(local610);
					local186.method2458(255 - (this.aByteArray30[local438] & 0xFF));
					local494 = this.aShortArray38[local438];
					local499 = local367[local494];
					if (local499 == 0) {
						local530 = ((float) local373[local494] * local400 + local406 * (float) local370[local494] + local412 * (float) local376[local494]) * 0.0026041667F;
					} else {
						local530 = ((float) local370[local494] * local406 + (float) local373[local494] * local400 + (float) local376[local494] * local412) / (float) (local499 * 256);
					}
					local567 = local416 + local530 * (local530 < 0.0F ? local436 : local426);
					local572 = (int) (local567 * local467);
					local591 = (int) (local478 * local567);
					if (local572 < 0) {
						local572 = 0;
					} else if (local572 > 255) {
						local572 = 255;
					}
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					local610 = (int) (local567 * local489);
					local186.anInt2989 = local110 + local494 * local100;
					if (local610 < 0) {
						local610 = 0;
					} else if (local610 > 255) {
						local610 = 255;
					}
					local186.method2458(local572);
					local186.method2458(local591);
					local186.method2458(local610);
					local186.method2458(255 - (this.aByteArray30[local438] & 0xFF));
					local494 = this.aShortArray37[local438];
					local499 = local367[local494];
					if (local499 == 0) {
						local530 = ((float) local373[local494] * local400 + local406 * (float) local370[local494] + local412 * (float) local376[local494]) * 0.0026041667F;
					} else {
						local530 = ((float) local376[local494] * local412 + local406 * (float) local370[local494] + local400 * (float) local373[local494]) / (float) (local499 * 256);
					}
					local567 = local416 + (local530 < 0.0F ? local436 : local426) * local530;
					local572 = (int) (local467 * local567);
					local591 = (int) (local567 * local478);
					if (local572 < 0) {
						local572 = 0;
					} else if (local572 > 255) {
						local572 = 255;
					}
					local610 = (int) (local489 * local567);
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					if (local610 < 0) {
						local610 = 0;
					} else if (local610 > 255) {
						local610 = 255;
					}
					local186.anInt2989 = local100 * local494 + local110;
					local186.method2458(local572);
					local186.method2458(local591);
					local186.method2458(local610);
					local186.method2458(255 - (this.aByteArray30[local438] & 0xFF));
				}
			} else {
				for (local194 = 0; local194 < this.anInt2839; local194++) {
					local203 = this.method2342(this.aShort32, this.aByteArray30[local194], this.aShortArray33[local194], this.aShortArray35[local194]);
					local186.anInt2989 = local110 + this.aShortArray34[local194] * local100;
					local186.method2506(local203);
					local186.anInt2989 = local100 * this.aShortArray38[local194] + local110;
					local186.method2506(local203);
					local186.anInt2989 = this.aShortArray37[local194] * local100 + local110;
					local186.method2506(local203);
				}
			}
		}
		if (local27) {
			if (this.aClass171_1 == null) {
				local367 = this.aByteArray31;
				local373 = this.aShortArray39;
				local376 = this.aShortArray32;
				local370 = this.aShortArray41;
			} else {
				local376 = this.aClass171_1.aShortArray70;
				local367 = this.aClass171_1.aByteArray54;
				local373 = this.aClass171_1.aShortArray72;
				local370 = this.aClass171_1.aShortArray71;
			}
			@Pc(1106) float local1106 = 3.0F / (float) this.aShort27;
			local530 = 3.0F / (float) (this.aShort27 + this.aShort27 / 2);
			local186.anInt2989 = local112;
			if (this.aClass50_Sub1_18.aBoolean99) {
				for (local231 = 0; local231 < this.anInt2828; local231++) {
					local240 = local367[local231] & 0xFF;
					if (local240 == 0) {
						local186.method835((float) local373[local231] * local530);
						local186.method835((float) local370[local231] * local530);
						local186.method835((float) local376[local231] * local530);
					} else {
						local478 = local1106 / (float) local240;
						local186.method835((float) local373[local231] * local478);
						local186.method835((float) local370[local231] * local478);
						local186.method835(local478 * (float) local376[local231]);
					}
					local186.anInt2989 += local100 - 12;
				}
			} else {
				for (local231 = 0; local231 < this.anInt2828; local231++) {
					local240 = local367[local231] & 0xFF;
					if (local240 == 0) {
						local186.method833(local530 * (float) local373[local231]);
						local186.method833((float) local370[local231] * local530);
						local186.method833(local530 * (float) local376[local231]);
					} else {
						local478 = local1106 / (float) local240;
						local186.method833((float) local373[local231] * local478);
						local186.method833(local478 * (float) local370[local231]);
						local186.method833(local478 * (float) local376[local231]);
					}
					local186.anInt2989 += local100 - 12;
				}
			}
		}
		if (local49) {
			local186.anInt2989 = local123;
			if (this.aClass50_Sub1_18.aBoolean99) {
				for (local194 = 0; local194 < this.anInt2828; local194++) {
					local186.method835(this.aFloatArray22[local194]);
					local186.method835(this.aFloatArray23[local194]);
					local186.anInt2989 += local100 - 8;
				}
			} else {
				for (local194 = 0; local194 < this.anInt2828; local194++) {
					local186.method833(this.aFloatArray22[local194]);
					local186.method833(this.aFloatArray23[local194]);
					local186.anInt2989 += local100 - 8;
				}
			}
		}
		local186.anInt2989 = local100 * this.anInt2828;
		@Pc(1419) Interface4 local1419;
		if (arg0) {
			if (this.anInterface4_5 == null) {
				this.anInterface4_5 = this.aClass50_Sub1_18.method1253(local186.anInt2989, local100, local186.aByteArray44, true);
			} else {
				this.anInterface4_5.method5476(local186.aByteArray44, local186.anInt2989, local100);
			}
			this.aByte23 = 0;
			local1419 = this.anInterface4_5;
		} else {
			local1419 = this.aClass50_Sub1_18.method1253(local186.anInt2989, local100, local186.aByteArray44, false);
			this.aBoolean208 = true;
		}
		if (local38) {
			this.aClass71_8.aByte15 = 0;
			this.aClass71_8.anInterface4_4 = local1419;
		}
		if (local49) {
			this.aClass71_9.anInterface4_4 = local1419;
			this.aClass71_9.aByte15 = local123;
		}
		if (local16) {
			this.aClass71_6.aByte15 = local110;
			this.aClass71_6.anInterface4_4 = local1419;
		}
		if (local27) {
			this.aClass71_7.aByte15 = local112;
			this.aClass71_7.anInterface4_4 = local1419;
		}
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "()[Lclient!kh;")
	@Override
	public Class141[] method6098() {
		return this.aClass141Array2;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!c;Lclient!pr;II)V")
	@Override
	public void method6097(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class40_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2828 == 0) {
			return;
		}
		@Pc(16) Class34_Sub1 local16 = this.aClass50_Sub1_18.aClass34_Sub1_4;
		@Pc(19) Class34_Sub1 local19 = (Class34_Sub1) arg0;
		if (!this.aBoolean209) {
			this.method2339();
		}
		Static182.aFloat58 = local19.aFloat79 * local16.aFloat85 + local16.aFloat79 * local19.aFloat87 + local19.aFloat82 * local16.aFloat84;
		Static60.aFloat122 = local16.aFloat85 * local19.aFloat83 + local19.aFloat90 * local16.aFloat79 + local19.aFloat80 * local16.aFloat84 + local16.aFloat83;
		@Pc(72) float local72 = (float) this.aShort30 * Static182.aFloat58 + Static60.aFloat122;
		@Pc(80) float local80 = (float) this.aShort26 * Static182.aFloat58 + Static60.aFloat122;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = local72 + (float) this.aShort31;
			local96 = local80 - (float) this.aShort31;
		} else {
			local90 = local80 + (float) this.aShort31;
			local96 = (float) -this.aShort31 + local72;
		}
		if (local96 >= this.aClass50_Sub1_18.aFloat16 || local90 <= (float) this.aClass50_Sub1_18.anInt1440) {
			return;
		}
		Static221.aFloat64 = local16.aFloat82 * local19.aFloat87 + local16.aFloat86 * local19.aFloat82 + local16.aFloat81 * local19.aFloat79;
		Static317.aFloat100 = local16.aFloat82 * local19.aFloat90 + local19.aFloat80 * local16.aFloat86 + local16.aFloat81 * local19.aFloat83 + local16.aFloat80;
		@Pc(173) float local173 = Static317.aFloat100 + (float) this.aShort30 * Static221.aFloat64;
		@Pc(181) float local181 = Static317.aFloat100 + Static221.aFloat64 * (float) this.aShort26;
		@Pc(208) float local208;
		@Pc(196) float local196;
		if (local173 > local181) {
			local208 = (float) this.aClass50_Sub1_18.anInt1437 * (local181 - (float) this.aShort31);
			local196 = (local173 + (float) this.aShort31) * (float) this.aClass50_Sub1_18.anInt1437;
		} else {
			local196 = (local181 + (float) this.aShort31) * (float) this.aClass50_Sub1_18.anInt1437;
			local208 = (float) this.aClass50_Sub1_18.anInt1437 * ((float) -this.aShort31 + local173);
		}
		if (local208 / (float) arg2 >= this.aClass50_Sub1_18.aFloat33 || this.aClass50_Sub1_18.aFloat21 >= local196 / (float) arg2) {
			return;
		}
		Static354.aFloat106 = local16.aFloat88 * local19.aFloat83 + local19.aFloat90 * local16.aFloat87 + local19.aFloat80 * local16.aFloat89 + local16.aFloat90;
		Static108.aFloat42 = local19.aFloat79 * local16.aFloat88 + local16.aFloat87 * local19.aFloat87 + local16.aFloat89 * local19.aFloat82;
		@Pc(299) float local299 = Static354.aFloat106 + Static108.aFloat42 * (float) this.aShort30;
		@Pc(307) float local307 = Static354.aFloat106 + Static108.aFloat42 * (float) this.aShort26;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local299 > local307) {
			local334 = (float) this.aClass50_Sub1_18.anInt1420 * ((float) this.aShort31 + local299);
			local323 = (float) this.aClass50_Sub1_18.anInt1420 * (local307 - (float) this.aShort31);
		} else {
			local323 = ((float) -this.aShort31 + local299) * (float) this.aClass50_Sub1_18.anInt1420;
			local334 = (local307 + (float) this.aShort31) * (float) this.aClass50_Sub1_18.anInt1420;
		}
		if (local323 / (float) arg2 >= this.aClass50_Sub1_18.aFloat17 || local334 / (float) arg2 <= this.aClass50_Sub1_18.aFloat20) {
			return;
		}
		if (arg1 != null || this.aClass96Array1 != null) {
			Static302.aFloat91 = local19.aFloat86 * local16.aFloat86 + local16.aFloat82 * local19.aFloat89 + local19.aFloat84 * local16.aFloat81;
			Static57.aFloat13 = local16.aFloat88 * local19.aFloat85 + local19.aFloat81 * local16.aFloat89 + local19.aFloat88 * local16.aFloat87;
			Static424.aFloat121 = local16.aFloat88 * local19.aFloat84 + local16.aFloat89 * local19.aFloat86 + local19.aFloat89 * local16.aFloat87;
			Static273.aFloat75 = local16.aFloat84 * local19.aFloat81 + local19.aFloat88 * local16.aFloat79 + local16.aFloat85 * local19.aFloat85;
			Static135.aFloat117 = local19.aFloat84 * local16.aFloat85 + local16.aFloat84 * local19.aFloat86 + local19.aFloat89 * local16.aFloat79;
			Static294.aFloat125 = local19.aFloat85 * local16.aFloat81 + local19.aFloat81 * local16.aFloat86 + local19.aFloat88 * local16.aFloat82;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort33 + this.aShort25 >> 1;
			@Pc(510) int local510 = this.aShort29 + this.aShort28 >> 1;
			@Pc(529) int local529 = (int) (Static317.aFloat100 + (float) local501 * Static302.aFloat91 + Static221.aFloat64 * (float) this.aShort30 + Static294.aFloat125 * (float) local510);
			@Pc(548) int local548 = (int) ((float) this.aShort30 * Static108.aFloat42 + Static354.aFloat106 + (float) local501 * Static424.aFloat121 + (float) local510 * Static57.aFloat13);
			@Pc(567) int local567 = (int) (Static273.aFloat75 * (float) local510 + Static60.aFloat122 + (float) local501 * Static135.aFloat117 + Static182.aFloat58 * (float) this.aShort30);
			@Pc(586) int local586 = (int) (Static317.aFloat100 + (float) local501 * Static302.aFloat91 + (float) this.aShort26 * Static221.aFloat64 + (float) local510 * Static294.aFloat125);
			@Pc(605) int local605 = (int) ((float) local510 * Static57.aFloat13 + Static108.aFloat42 * (float) this.aShort26 + Static424.aFloat121 * (float) local501 + Static354.aFloat106);
			@Pc(624) int local624 = (int) ((float) local510 * Static273.aFloat75 + Static182.aFloat58 * (float) this.aShort26 + Static60.aFloat122 + Static135.aFloat117 * (float) local501);
			arg1.anInt5482 = local586 * this.aClass50_Sub1_18.anInt1437 / arg2 + this.aClass50_Sub1_18.anInt1447;
			arg1.anInt5478 = this.aClass50_Sub1_18.anInt1422 + local605 * this.aClass50_Sub1_18.anInt1420 / arg2;
			arg1.anInt5479 = local548 * this.aClass50_Sub1_18.anInt1420 / arg2 + this.aClass50_Sub1_18.anInt1422;
			arg1.anInt5480 = this.aClass50_Sub1_18.anInt1447 + local529 * this.aClass50_Sub1_18.anInt1437 / arg2;
			if (this.aClass50_Sub1_18.anInt1440 > local567 && local624 < this.aClass50_Sub1_18.anInt1440) {
				arg1.aBoolean362 = true;
				arg1.anInt5481 = (local529 + this.aShort31) * this.aClass50_Sub1_18.anInt1437 / arg2 + this.aClass50_Sub1_18.anInt1447 - arg1.anInt5480;
			}
		}
		this.aClass50_Sub1_18.method1292((float) arg2);
		this.aClass50_Sub1_18.method1328();
		this.aClass50_Sub1_18.method1324(local19);
		this.method2331();
		this.aClass50_Sub1_18.method1282();
		this.method2341();
	}

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "()I")
	@Override
	public int k() {
		if (!this.aBoolean209) {
			this.method2339();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!c;Lclient!pr;I)V")
	@Override
	public void method6090(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class40_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2828 == 0) {
			return;
		}
		@Pc(13) Class34_Sub1 local13 = this.aClass50_Sub1_18.aClass34_Sub1_4;
		if (!this.aBoolean209) {
			this.method2339();
		}
		@Pc(22) Class34_Sub1 local22 = (Class34_Sub1) arg0;
		this.method2332(local22);
		Static60.aFloat122 = local13.aFloat83 + local13.aFloat79 * local22.aFloat90 + local22.aFloat80 * local13.aFloat84 + local13.aFloat85 * local22.aFloat83;
		Static182.aFloat58 = local13.aFloat85 * local22.aFloat79 + local22.aFloat82 * local13.aFloat84 + local22.aFloat87 * local13.aFloat79;
		@Pc(73) float local73 = (float) this.aShort30 * Static182.aFloat58 + Static60.aFloat122;
		@Pc(81) float local81 = Static60.aFloat122 + Static182.aFloat58 * (float) this.aShort26;
		@Pc(97) float local97;
		@Pc(91) float local91;
		if (local73 > local81) {
			local91 = (float) this.aShort31 + local73;
			local97 = (float) -this.aShort31 + local81;
		} else {
			local91 = (float) this.aShort31 + local81;
			local97 = local73 - (float) this.aShort31;
		}
		if (this.aClass50_Sub1_18.aFloat19 <= local97 || (float) this.aClass50_Sub1_18.anInt1440 >= local91) {
			return;
		}
		Static221.aFloat64 = local22.aFloat79 * local13.aFloat81 + local22.aFloat82 * local13.aFloat86 + local22.aFloat87 * local13.aFloat82;
		Static317.aFloat100 = local13.aFloat80 + local13.aFloat81 * local22.aFloat83 + local22.aFloat90 * local13.aFloat82 + local13.aFloat86 * local22.aFloat80;
		@Pc(174) float local174 = Static317.aFloat100 + (float) this.aShort30 * Static221.aFloat64;
		@Pc(182) float local182 = (float) this.aShort26 * Static221.aFloat64 + Static317.aFloat100;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local174 > local182) {
			local209 = ((float) -this.aShort31 + local182) * (float) this.aClass50_Sub1_18.anInt1437;
			local197 = (float) this.aClass50_Sub1_18.anInt1437 * ((float) this.aShort31 + local174);
		} else {
			local197 = (local182 + (float) this.aShort31) * (float) this.aClass50_Sub1_18.anInt1437;
			local209 = (float) this.aClass50_Sub1_18.anInt1437 * ((float) -this.aShort31 + local174);
		}
		if (local209 / local91 >= this.aClass50_Sub1_18.aFloat33 || this.aClass50_Sub1_18.aFloat21 >= local197 / local91) {
			return;
		}
		Static108.aFloat42 = local13.aFloat87 * local22.aFloat87 + local22.aFloat82 * local13.aFloat89 + local13.aFloat88 * local22.aFloat79;
		Static354.aFloat106 = local13.aFloat90 + local13.aFloat88 * local22.aFloat83 + local22.aFloat80 * local13.aFloat89 + local13.aFloat87 * local22.aFloat90;
		@Pc(299) float local299 = (float) this.aShort30 * Static108.aFloat42 + Static354.aFloat106;
		@Pc(307) float local307 = Static354.aFloat106 + (float) this.aShort26 * Static108.aFloat42;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local299 > local307) {
			local322 = (local307 - (float) this.aShort31) * (float) this.aClass50_Sub1_18.anInt1420;
			local333 = ((float) this.aShort31 + local299) * (float) this.aClass50_Sub1_18.anInt1420;
		} else {
			local322 = (local299 - (float) this.aShort31) * (float) this.aClass50_Sub1_18.anInt1420;
			local333 = (float) this.aClass50_Sub1_18.anInt1420 * ((float) this.aShort31 + local307);
		}
		if (local322 / local91 >= this.aClass50_Sub1_18.aFloat17 || local333 / local91 <= this.aClass50_Sub1_18.aFloat20) {
			return;
		}
		if (arg1 != null || this.aClass96Array1 != null) {
			Static302.aFloat91 = local22.aFloat84 * local13.aFloat81 + local13.aFloat86 * local22.aFloat86 + local22.aFloat89 * local13.aFloat82;
			Static273.aFloat75 = local13.aFloat85 * local22.aFloat85 + local13.aFloat84 * local22.aFloat81 + local22.aFloat88 * local13.aFloat79;
			Static135.aFloat117 = local22.aFloat89 * local13.aFloat79 + local13.aFloat84 * local22.aFloat86 + local13.aFloat85 * local22.aFloat84;
			Static424.aFloat121 = local22.aFloat84 * local13.aFloat88 + local13.aFloat89 * local22.aFloat86 + local22.aFloat89 * local13.aFloat87;
			Static57.aFloat13 = local13.aFloat88 * local22.aFloat85 + local22.aFloat88 * local13.aFloat87 + local22.aFloat81 * local13.aFloat89;
			Static294.aFloat125 = local13.aFloat81 * local22.aFloat85 + local13.aFloat82 * local22.aFloat88 + local22.aFloat81 * local13.aFloat86;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(502) int local502 = this.aShort33 + this.aShort25 >> 1;
			@Pc(510) int local510 = this.aShort29 + this.aShort28 >> 1;
			@Pc(529) int local529 = (int) ((float) local510 * Static294.aFloat125 + Static317.aFloat100 + Static302.aFloat91 * (float) local502 + (float) this.aShort30 * Static221.aFloat64);
			@Pc(548) int local548 = (int) ((float) this.aShort30 * Static108.aFloat42 + Static354.aFloat106 + (float) local502 * Static424.aFloat121 + Static57.aFloat13 * (float) local510);
			@Pc(567) int local567 = (int) (Static182.aFloat58 * (float) this.aShort30 + Static60.aFloat122 + Static135.aFloat117 * (float) local502 + (float) local510 * Static273.aFloat75);
			if (local567 < this.aClass50_Sub1_18.anInt1440) {
				local492 = true;
			} else {
				arg1.anInt5480 = this.aClass50_Sub1_18.anInt1447 + this.aClass50_Sub1_18.anInt1437 * local529 / local567;
				arg1.anInt5479 = this.aClass50_Sub1_18.anInt1422 + local548 * this.aClass50_Sub1_18.anInt1420 / local567;
			}
			@Pc(623) int local623 = (int) (Static221.aFloat64 * (float) this.aShort26 + (float) local502 * Static302.aFloat91 + Static317.aFloat100 + (float) local510 * Static294.aFloat125);
			@Pc(642) int local642 = (int) (Static57.aFloat13 * (float) local510 + (float) local502 * Static424.aFloat121 + Static354.aFloat106 + Static108.aFloat42 * (float) this.aShort26);
			@Pc(661) int local661 = (int) (Static60.aFloat122 + Static135.aFloat117 * (float) local502 + (float) this.aShort26 * Static182.aFloat58 + Static273.aFloat75 * (float) local510);
			if (this.aClass50_Sub1_18.anInt1440 <= local661) {
				arg1.anInt5478 = this.aClass50_Sub1_18.anInt1422 + this.aClass50_Sub1_18.anInt1420 * local642 / local661;
				arg1.anInt5482 = local623 * this.aClass50_Sub1_18.anInt1437 / local661 + this.aClass50_Sub1_18.anInt1447;
			} else {
				local492 = true;
			}
			if (local492) {
				if (this.aClass50_Sub1_18.anInt1440 > local567 && local661 < this.aClass50_Sub1_18.anInt1440) {
					local494 = false;
				} else {
					@Pc(738) int local738;
					@Pc(750) int local750;
					@Pc(762) int local762;
					if (local567 < this.aClass50_Sub1_18.anInt1440) {
						local738 = (local661 - this.aClass50_Sub1_18.anInt1440 << 16) / (local661 - local567);
						local750 = local623 + (local738 * (local623 - local529) >> 16);
						local762 = local642 + (local738 * (local642 - local548) >> 16);
						arg1.anInt5480 = this.aClass50_Sub1_18.anInt1447 + this.aClass50_Sub1_18.anInt1437 * local750 / this.aClass50_Sub1_18.anInt1440;
						arg1.anInt5479 = this.aClass50_Sub1_18.anInt1420 * local762 / this.aClass50_Sub1_18.anInt1440 + this.aClass50_Sub1_18.anInt1422;
					} else if (this.aClass50_Sub1_18.anInt1440 > local661) {
						local738 = (local567 - this.aClass50_Sub1_18.anInt1440 << 16) / (local567 - local661);
						local750 = local529 + ((local529 - local623) * local738 >> 16);
						arg1.anInt5480 = local750 * this.aClass50_Sub1_18.anInt1437 / this.aClass50_Sub1_18.anInt1440 + this.aClass50_Sub1_18.anInt1447;
						local762 = local548 + ((local548 - local642) * local738 >> 16);
						arg1.anInt5479 = this.aClass50_Sub1_18.anInt1422 + local762 * this.aClass50_Sub1_18.anInt1420 / this.aClass50_Sub1_18.anInt1440;
					}
				}
			}
			if (local494) {
				if (local661 >= local567) {
					arg1.anInt5481 = this.aClass50_Sub1_18.anInt1447 + (this.aShort31 + local623) * this.aClass50_Sub1_18.anInt1437 / local661 - arg1.anInt5482;
				} else {
					arg1.anInt5481 = this.aClass50_Sub1_18.anInt1447 + this.aClass50_Sub1_18.anInt1437 * (this.aShort31 + local529) / local567 - arg1.anInt5480;
				}
				arg1.aBoolean362 = true;
			}
		}
		this.aClass50_Sub1_18.method1265();
		this.aClass50_Sub1_18.method1324(local22);
		this.method2331();
		this.aClass50_Sub1_18.method1282();
		this.method2341();
	}

	@OriginalMember(owner = "client!gm", name = "va", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			Static186.anInt3748 = 0;
			local29 = 0;
			Static88.anInt6878 = 0;
			Static358.anInt6085 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray29.length > local41) {
					local55 = this.anIntArrayArray29[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static186.anInt3748 += this.anIntArray277[local63];
						Static88.anInt6878 += this.anIntArray278[local63];
						local29++;
						Static358.anInt6085 += this.anIntArray280[local63];
					}
				}
			}
			if (local29 <= 0) {
				Static186.anInt3748 = local25;
				Static88.anInt6878 = local17;
				Static358.anInt6085 = local21;
			} else {
				Static88.anInt6878 = local17 + Static88.anInt6878 / local29;
				Static358.anInt6085 = local21 + Static358.anInt6085 / local29;
				Static186.anInt3748 = Static186.anInt3748 / local29 + local25;
			}
			return;
		}
		@Pc(165) int[] local165;
		@Pc(167) int local167;
		if (arg0 == 1) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray29.length > local35) {
					local165 = this.anIntArrayArray29[local35];
					for (local167 = 0; local167 < local165.length; local167++) {
						local57 = local165[local167];
						this.anIntArray277[local57] += local25;
						this.anIntArray278[local57] += local17;
						this.anIntArray280[local57] += local21;
					}
				}
			}
			return;
		}
		@Pc(283) int local283;
		@Pc(301) int local301;
		@Pc(755) int local755;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray29.length > local35) {
					local165 = this.anIntArrayArray29[local35];
					if ((arg5 & 0x1) == 0) {
						for (local167 = 0; local167 < local165.length; local167++) {
							local57 = local165[local167];
							this.anIntArray277[local57] -= Static186.anInt3748;
							this.anIntArray278[local57] -= Static88.anInt6878;
							this.anIntArray280[local57] -= Static358.anInt6085;
							if (arg4 != 0) {
								local63 = Class250.anIntArray675[arg4];
								local283 = Class250.anIntArray674[arg4];
								local301 = local283 * this.anIntArray277[local57] + local63 * this.anIntArray278[local57] + 32767 >> 15;
								this.anIntArray278[local57] = this.anIntArray278[local57] * local283 + 32767 - this.anIntArray277[local57] * local63 >> 15;
								this.anIntArray277[local57] = local301;
							}
							if (arg2 != 0) {
								local63 = Class250.anIntArray675[arg2];
								local283 = Class250.anIntArray674[arg2];
								local301 = this.anIntArray278[local57] * local283 + 32767 - local63 * this.anIntArray280[local57] >> 15;
								this.anIntArray280[local57] = local283 * this.anIntArray280[local57] + this.anIntArray278[local57] * local63 + 32767 >> 15;
								this.anIntArray278[local57] = local301;
							}
							if (arg3 != 0) {
								local63 = Class250.anIntArray675[arg3];
								local283 = Class250.anIntArray674[arg3];
								local301 = local63 * this.anIntArray280[local57] + local283 * this.anIntArray277[local57] + 32767 >> 15;
								this.anIntArray280[local57] = local283 * this.anIntArray280[local57] + 32767 - this.anIntArray277[local57] * local63 >> 15;
								this.anIntArray277[local57] = local301;
							}
							this.anIntArray277[local57] += Static186.anInt3748;
							this.anIntArray278[local57] += Static88.anInt6878;
							this.anIntArray280[local57] += Static358.anInt6085;
						}
					} else {
						for (local167 = 0; local167 < local165.length; local167++) {
							local57 = local165[local167];
							this.anIntArray277[local57] -= Static186.anInt3748;
							this.anIntArray278[local57] -= Static88.anInt6878;
							this.anIntArray280[local57] -= Static358.anInt6085;
							if (arg2 != 0) {
								local63 = Class250.anIntArray675[arg2];
								local283 = Class250.anIntArray674[arg2];
								local301 = this.anIntArray278[local57] * local283 + 32767 - local63 * this.anIntArray280[local57] >> 15;
								this.anIntArray280[local57] = this.anIntArray280[local57] * local283 + this.anIntArray278[local57] * local63 + 32767 >> 15;
								this.anIntArray278[local57] = local301;
							}
							if (arg4 != 0) {
								local63 = Class250.anIntArray675[arg4];
								local283 = Class250.anIntArray674[arg4];
								local301 = local63 * this.anIntArray278[local57] + this.anIntArray277[local57] * local283 + 32767 >> 15;
								this.anIntArray278[local57] = local283 * this.anIntArray278[local57] + 32767 - this.anIntArray277[local57] * local63 >> 15;
								this.anIntArray277[local57] = local301;
							}
							if (arg3 != 0) {
								local63 = Class250.anIntArray675[arg3];
								local283 = Class250.anIntArray674[arg3];
								local301 = local283 * this.anIntArray277[local57] + local63 * this.anIntArray280[local57] + 32767 >> 15;
								this.anIntArray280[local57] = this.anIntArray280[local57] * local283 + 32767 - this.anIntArray277[local57] * local63 >> 15;
								this.anIntArray277[local57] = local301;
							}
							this.anIntArray277[local57] += Static186.anInt3748;
							this.anIntArray278[local57] += Static88.anInt6878;
							this.anIntArray280[local57] += Static358.anInt6085;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray29.length) {
						local55 = this.anIntArrayArray29[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local283 = this.anIntArray283[local63];
							local301 = this.anIntArray283[local63 + 1];
							for (local755 = local283; local755 < local301; local755++) {
								@Pc(764) int local764 = this.aShortArray31[local755] - 1;
								if (local764 == -1) {
									break;
								}
								@Pc(776) int local776;
								@Pc(780) int local780;
								@Pc(798) int local798;
								if (arg4 != 0) {
									local776 = Class250.anIntArray675[arg4];
									local780 = Class250.anIntArray674[arg4];
									local798 = this.aShortArray39[local764] * local780 + this.aShortArray41[local764] * local776 + 32767 >> 15;
									this.aShortArray41[local764] = (short) (this.aShortArray41[local764] * local780 + 32767 - this.aShortArray39[local764] * local776 >> 15);
									this.aShortArray39[local764] = (short) local798;
								}
								if (arg2 != 0) {
									local776 = Class250.anIntArray675[arg2];
									local780 = Class250.anIntArray674[arg2];
									local798 = this.aShortArray41[local764] * local780 + 32767 - this.aShortArray32[local764] * local776 >> 15;
									this.aShortArray32[local764] = (short) (local780 * this.aShortArray32[local764] + this.aShortArray41[local764] * local776 + 32767 >> 15);
									this.aShortArray41[local764] = (short) local798;
								}
								if (arg3 != 0) {
									local776 = Class250.anIntArray675[arg3];
									local780 = Class250.anIntArray674[arg3];
									local798 = this.aShortArray39[local764] * local780 + local776 * this.aShortArray32[local764] + 32767 >> 15;
									this.aShortArray32[local764] = (short) (local780 * this.aShortArray32[local764] + 32767 - this.aShortArray39[local764] * local776 >> 15);
									this.aShortArray39[local764] = (short) local798;
								}
							}
						}
					}
				}
				if (this.aClass71_7 == null && this.aClass71_6 != null) {
					this.aClass71_6.anInterface4_4 = null;
				}
				if (this.aClass71_7 != null) {
					this.aClass71_7.anInterface4_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray29.length) {
					local165 = this.anIntArrayArray29[local35];
					for (local167 = 0; local167 < local165.length; local167++) {
						local57 = local165[local167];
						this.anIntArray277[local57] -= Static186.anInt3748;
						this.anIntArray278[local57] -= Static88.anInt6878;
						this.anIntArray280[local57] -= Static358.anInt6085;
						this.anIntArray277[local57] = arg2 * this.anIntArray277[local57] >> 7;
						this.anIntArray278[local57] = this.anIntArray278[local57] * arg3 >> 7;
						this.anIntArray280[local57] = this.anIntArray280[local57] * arg4 >> 7;
						this.anIntArray277[local57] += Static186.anInt3748;
						this.anIntArray278[local57] += Static88.anInt6878;
						this.anIntArray280[local57] += Static358.anInt6085;
					}
				}
			}
		} else {
			@Pc(1214) Class96 local1214;
			@Pc(1219) Class139 local1219;
			if (arg0 == 5) {
				if (this.anIntArrayArray28 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray28.length) {
							local165 = this.anIntArrayArray28[local35];
							for (local167 = 0; local167 < local165.length; local167++) {
								local57 = local165[local167];
								local63 = (this.aByteArray30[local57] & 0xFF) + (arg2 * 8);
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray30[local57] = (byte) local63;
							}
							if (local165.length > 0 && this.aClass71_6 != null) {
								this.aClass71_6.anInterface4_4 = null;
							}
						}
					}
					if (this.aClass96Array1 != null) {
						for (local35 = 0; local35 < this.anInt2805; local35++) {
							local1214 = this.aClass96Array1[local35];
							local1219 = this.aClass139Array1[local35];
							local1219.anInt4072 = local1219.anInt4072 & 0xFFFFFF | 255 - (this.aByteArray30[local1214.anInt2883] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1466) Class139 local1466;
				if (arg0 == 8) {
					if (this.anIntArrayArray30 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray30.length) {
								local165 = this.anIntArrayArray30[local35];
								for (local167 = 0; local167 < local165.length; local167++) {
									local1466 = this.aClass139Array1[local165[local167]];
									local1466.anInt4071 += arg2;
									local1466.anInt4074 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray30 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray30.length) {
								local165 = this.anIntArrayArray30[local35];
								for (local167 = 0; local167 < local165.length; local167++) {
									local1466 = this.aClass139Array1[local165[local167]];
									local1466.anInt4076 = arg2 * local1466.anInt4076 >> 7;
									local1466.anInt4078 = local1466.anInt4078 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray30 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray30.length) {
							local165 = this.anIntArrayArray30[local35];
							for (local167 = 0; local167 < local165.length; local167++) {
								local1466 = this.aClass139Array1[local165[local167]];
								local1466.anInt4077 = local1466.anInt4077 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray28 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray28.length > local35) {
						local165 = this.anIntArrayArray28[local35];
						for (local167 = 0; local167 < local165.length; local167++) {
							local57 = local165[local167];
							local63 = this.aShortArray35[local57] & 0xFFFF;
							local283 = local63 >> 10 & 0x3F;
							local301 = local63 >> 7 & 0x7;
							local755 = local63 & 0x7F;
							@Pc(1308) int local1308 = local283 + arg2 & 0x3F;
							local301 += arg3 / 4;
							local755 += arg4;
							if (local301 < 0) {
								local301 = 0;
							} else if (local301 > 7) {
								local301 = 7;
							}
							if (local755 < 0) {
								local755 = 0;
							} else if (local755 > 127) {
								local755 = 127;
							}
							this.aShortArray35[local57] = (short) (local301 << 7 | local1308 << 10 | local755);
						}
						if (local165.length > 0 && this.aClass71_6 != null) {
							this.aClass71_6.anInterface4_4 = null;
						}
					}
				}
				if (this.aClass96Array1 != null) {
					for (local35 = 0; local35 < this.anInt2805; local35++) {
						local1214 = this.aClass96Array1[local35];
						local1219 = this.aClass139Array1[local35];
						local1219.anInt4072 = local1219.anInt4072 & 0xFF000000 | Static451.anIntArray744[this.aShortArray35[local1214.anInt2883] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class250.anIntArray675[arg0];
		@Pc(13) int local13 = Class250.anIntArray674[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2810; local15++) {
			@Pc(33) int local33 = this.anIntArray278[local15] * local13 - local9 * this.anIntArray280[local15] >> 15;
			this.anIntArray280[local15] = this.anIntArray280[local15] * local13 + this.anIntArray278[local15] * local9 >> 15;
			this.anIntArray278[local15] = local33;
		}
		if (this.aClass71_8 != null) {
			this.aClass71_8.anInterface4_4 = null;
		}
		this.aBoolean209 = false;
	}

	@OriginalMember(owner = "client!gm", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2810; local3++) {
			this.anIntArray280[local3] = -this.anIntArray280[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2828; local25++) {
			this.aShortArray32[local25] = (short) -this.aShortArray32[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt2839; local48++) {
			@Pc(55) short local55 = this.aShortArray34[local48];
			this.aShortArray34[local48] = this.aShortArray37[local48];
			this.aShortArray37[local48] = local55;
		}
		if (this.aClass71_7 == null && this.aClass71_6 != null) {
			this.aClass71_6.anInterface4_4 = null;
		}
		if (this.aClass71_7 != null) {
			this.aClass71_7.anInterface4_4 = null;
		}
		if (this.aClass173_1 != null) {
			this.aClass173_1.anInterface1_3 = null;
		}
		if (this.aClass71_8 != null) {
			this.aClass71_8.anInterface4_4 = null;
		}
		this.aBoolean209 = false;
	}

	@OriginalMember(owner = "client!gm", name = "aa", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static88.anInt6878 = 0;
			Static186.anInt3748 = 0;
			local31 = 0;
			Static358.anInt6085 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray29.length) {
					local55 = this.anIntArrayArray29[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray36 == null || (arg6 & this.aShortArray36[local63]) != 0) {
							Static186.anInt3748 += this.anIntArray277[local63];
							Static88.anInt6878 += this.anIntArray278[local63];
							Static358.anInt6085 += this.anIntArray280[local63];
							local31++;
						}
					}
				}
			}
			if (local31 > 0) {
				Static88.anInt6878 = Static88.anInt6878 / local31 + arg3;
				Static358.anInt6085 = Static358.anInt6085 / local31 + arg4;
				Static186.anInt3748 = Static186.anInt3748 / local31 + arg2;
				Static205.aBoolean270 = true;
			} else {
				Static88.anInt6878 = arg3;
				Static358.anInt6085 = arg4;
				Static186.anInt3748 = arg2;
			}
			return;
		}
		@Pc(252) int[] local252;
		@Pc(254) int local254;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg7[2] * arg4 + arg7[1] * arg3 + arg2 * arg7[0] + 16384 >> 15;
				local35 = arg4 * arg7[5] + arg3 * arg7[4] + arg7[3] * arg2 + 16384 >> 15;
				local41 = arg7[8] * arg4 + arg3 * arg7[7] + arg7[6] * arg2 + 16384 >> 15;
				arg2 = local31;
				arg4 = local41;
				arg3 = local35;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray29.length > local35) {
					local252 = this.anIntArrayArray29[local35];
					for (local254 = 0; local254 < local252.length; local254++) {
						local57 = local252[local254];
						if (this.aShortArray36 == null || (arg6 & this.aShortArray36[local57]) != 0) {
							this.anIntArray277[local57] += arg2;
							this.anIntArray278[local57] += arg3;
							this.anIntArray280[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(389) int local389;
		@Pc(407) int local407;
		@Pc(627) int local627;
		@Pc(636) int local636;
		@Pc(649) int local649;
		@Pc(653) int local653;
		@Pc(671) int local671;
		@Pc(1016) int local1016;
		@Pc(1024) int local1024;
		@Pc(1178) int local1178;
		@Pc(1203) int local1203;
		@Pc(1207) int local1207;
		@Pc(1215) int local1215;
		@Pc(1220) int local1220;
		@Pc(1224) int local1224;
		@Pc(1228) int local1228;
		@Pc(1230) int local1230;
		@Pc(1360) int[] local1360;
		@Pc(1362) int local1362;
		@Pc(1366) int local1366;
		@Pc(1370) int local1370;
		@Pc(1372) int local1372;
		@Pc(1497) int local1497;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray29.length) {
						local252 = this.anIntArrayArray29[local35];
						for (local254 = 0; local254 < local252.length; local254++) {
							local57 = local252[local254];
							if (this.aShortArray36 == null || (this.aShortArray36[local57] & arg6) != 0) {
								this.anIntArray277[local57] -= Static186.anInt3748;
								this.anIntArray278[local57] -= Static88.anInt6878;
								this.anIntArray280[local57] -= Static358.anInt6085;
								if (arg4 != 0) {
									local63 = Class250.anIntArray675[arg4];
									local389 = Class250.anIntArray674[arg4];
									local407 = this.anIntArray277[local57] * local389 + this.anIntArray278[local57] * local63 + 32767 >> 15;
									this.anIntArray278[local57] = local389 * this.anIntArray278[local57] + 32767 - local63 * this.anIntArray277[local57] >> 15;
									this.anIntArray277[local57] = local407;
								}
								if (arg2 != 0) {
									local63 = Class250.anIntArray675[arg2];
									local389 = Class250.anIntArray674[arg2];
									local407 = this.anIntArray278[local57] * local389 + 32767 - local63 * this.anIntArray280[local57] >> 15;
									this.anIntArray280[local57] = local389 * this.anIntArray280[local57] + local63 * this.anIntArray278[local57] + 32767 >> 15;
									this.anIntArray278[local57] = local407;
								}
								if (arg3 != 0) {
									local63 = Class250.anIntArray675[arg3];
									local389 = Class250.anIntArray674[arg3];
									local407 = this.anIntArray277[local57] * local389 + local63 * this.anIntArray280[local57] + 32767 >> 15;
									this.anIntArray280[local57] = local389 * this.anIntArray280[local57] + 32767 - this.anIntArray277[local57] * local63 >> 15;
									this.anIntArray277[local57] = local407;
								}
								this.anIntArray277[local57] += Static186.anInt3748;
								this.anIntArray278[local57] += Static88.anInt6878;
								this.anIntArray280[local57] += Static358.anInt6085;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray29.length > local41) {
							local55 = this.anIntArrayArray29[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray36 == null || (this.aShortArray36[local63] & arg6) != 0) {
									local389 = this.anIntArray283[local63];
									local407 = this.anIntArray283[local63 + 1];
									for (local627 = local389; local627 < local407; local627++) {
										local636 = this.aShortArray31[local627] - 1;
										if (local636 == -1) {
											break;
										}
										if (arg4 != 0) {
											local649 = Class250.anIntArray675[arg4];
											local653 = Class250.anIntArray674[arg4];
											local671 = local649 * this.aShortArray41[local636] + this.aShortArray39[local636] * local653 + 32767 >> 15;
											this.aShortArray41[local636] = (short) (this.aShortArray41[local636] * local653 + 32767 - local649 * this.aShortArray39[local636] >> 15);
											this.aShortArray39[local636] = (short) local671;
										}
										if (arg2 != 0) {
											local649 = Class250.anIntArray675[arg2];
											local653 = Class250.anIntArray674[arg2];
											local671 = local653 * this.aShortArray41[local636] + 32767 - this.aShortArray32[local636] * local649 >> 15;
											this.aShortArray32[local636] = (short) (this.aShortArray41[local636] * local649 + local653 * this.aShortArray32[local636] + 32767 >> 15);
											this.aShortArray41[local636] = (short) local671;
										}
										if (arg3 != 0) {
											local649 = Class250.anIntArray675[arg3];
											local653 = Class250.anIntArray674[arg3];
											local671 = this.aShortArray39[local636] * local653 + local649 * this.aShortArray32[local636] + 32767 >> 15;
											this.aShortArray32[local636] = (short) (local653 * this.aShortArray32[local636] + 32767 - this.aShortArray39[local636] * local649 >> 15);
											this.aShortArray39[local636] = (short) local671;
										}
									}
								}
							}
						}
					}
					if (this.aClass71_7 == null && this.aClass71_6 != null) {
						this.aClass71_6.anInterface4_4 = null;
					}
					if (this.aClass71_7 != null) {
						this.aClass71_7.anInterface4_4 = null;
						return;
					}
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local254 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static205.aBoolean270) {
					local389 = arg7[6] * Static358.anInt6085 + arg7[0] * Static186.anInt3748 + arg7[3] * Static88.anInt6878 + 16384 >> 15;
					local407 = arg7[7] * Static358.anInt6085 + Static88.anInt6878 * arg7[4] + Static186.anInt3748 * arg7[1] + 16384 >> 15;
					local389 += local254;
					local627 = arg7[2] * Static186.anInt3748 + arg7[5] * Static88.anInt6878 + arg7[8] * Static358.anInt6085 + 16384 >> 15;
					local407 += local57;
					local627 += local63;
					Static88.anInt6878 = local407;
					Static186.anInt3748 = local389;
					Static205.aBoolean270 = false;
					Static358.anInt6085 = local627;
				}
				@Pc(984) int[] local984 = new int[9];
				local407 = Class250.anIntArray674[arg2];
				local627 = Class250.anIntArray675[arg2];
				local636 = Class250.anIntArray674[arg3];
				local649 = Class250.anIntArray675[arg3];
				local653 = Class250.anIntArray674[arg4];
				local671 = Class250.anIntArray675[arg4];
				local1016 = local653 * local627 + 16384 >> 15;
				local1024 = local627 * local671 + 16384 >> 15;
				local984[3] = local671 * local407 + 16384 >> 15;
				local984[8] = local636 * local407 + 16384 >> 15;
				local984[0] = local653 * local636 + local1024 * local649 + 16384 >> 15;
				local984[1] = local671 * -local636 + local1016 * local649 + 16384 >> 15;
				local984[2] = local649 * local407 + 16384 >> 15;
				local984[6] = -local649 * local653 + local1024 * local636 + 16384 >> 15;
				local984[5] = -local627;
				local984[4] = local653 * local407 + 16384 >> 15;
				local984[7] = local1016 * local636 + local649 * local671 + 16384 >> 15;
				@Pc(1153) int local1153 = -Static358.anInt6085 * local984[2] + -Static186.anInt3748 * local984[0] + local984[1] * -Static88.anInt6878 + 16384 >> 15;
				local1178 = local984[5] * -Static358.anInt6085 + local984[4] * -Static88.anInt6878 + local984[3] * -Static186.anInt3748 + 16384 >> 15;
				local1203 = -Static88.anInt6878 * local984[7] + local984[6] * -Static186.anInt3748 + -Static358.anInt6085 * local984[8] + 16384 >> 15;
				local1207 = Static186.anInt3748 + local1153;
				@Pc(1211) int local1211 = local1178 + Static88.anInt6878;
				local1215 = Static358.anInt6085 + local1203;
				@Pc(1218) int[] local1218 = new int[9];
				for (local1220 = 0; local1220 < 3; local1220++) {
					for (local1224 = 0; local1224 < 3; local1224++) {
						local1228 = 0;
						for (local1230 = 0; local1230 < 3; local1230++) {
							local1228 += arg7[local1224 * 3 + local1230] * local984[local1230 + local1220 * 3];
						}
						local1218[local1220 * 3 + local1224] = local1228 + 16384 >> 15;
					}
				}
				local1224 = local984[2] * local63 + local254 * local984[0] + local984[1] * local57 + 16384 >> 15;
				local1228 = local984[3] * local254 + local57 * local984[4] + local63 * local984[5] + 16384 >> 15;
				local1228 += local1211;
				local1224 += local1207;
				local1230 = local984[8] * local63 + local984[7] * local57 + local984[6] * local254 + 16384 >> 15;
				local1230 += local1215;
				local1360 = new int[9];
				for (local1362 = 0; local1362 < 3; local1362++) {
					for (local1366 = 0; local1366 < 3; local1366++) {
						local1370 = 0;
						for (local1372 = 0; local1372 < 3; local1372++) {
							local1370 += local1218[local1372 * 3 + local1366] * arg7[local1372 + local1362 * 3];
						}
						local1360[local1362 * 3 + local1366] = local1370 + 16384 >> 15;
					}
				}
				local1366 = local1228 * arg7[1] + arg7[0] * local1224 + local1230 * arg7[2] + 16384 >> 15;
				local1370 = local1230 * arg7[5] + local1224 * arg7[3] + arg7[4] * local1228 + 16384 >> 15;
				local1372 = arg7[6] * local1224 + local1228 * arg7[7] + arg7[8] * local1230 + 16384 >> 15;
				local1370 += local35;
				local1366 += local31;
				local1372 += local41;
				for (local1497 = 0; local1497 < local8; local1497++) {
					@Pc(1503) int local1503 = arg1[local1497];
					if (local1503 < this.anIntArrayArray29.length) {
						@Pc(1513) int[] local1513 = this.anIntArrayArray29[local1503];
						for (@Pc(1515) int local1515 = 0; local1515 < local1513.length; local1515++) {
							@Pc(1521) int local1521 = local1513[local1515];
							if (this.aShortArray36 == null || (arg6 & this.aShortArray36[local1521]) != 0) {
								@Pc(1565) int local1565 = local1360[2] * this.anIntArray280[local1521] + local1360[1] * this.anIntArray278[local1521] + local1360[0] * this.anIntArray277[local1521] + 16384 >> 15;
								@Pc(1596) int local1596 = local1360[4] * this.anIntArray278[local1521] + this.anIntArray277[local1521] * local1360[3] + this.anIntArray280[local1521] * local1360[5] + 16384 >> 15;
								@Pc(1600) int local1600 = local1565 + local1366;
								@Pc(1604) int local1604 = local1596 + local1370;
								@Pc(1635) int local1635 = this.anIntArray280[local1521] * local1360[8] + local1360[6] * this.anIntArray277[local1521] + local1360[7] * this.anIntArray278[local1521] + 16384 >> 15;
								this.anIntArray277[local1521] = local1600;
								@Pc(1644) int local1644 = local1635 + local1372;
								this.anIntArray278[local1521] = local1604;
								this.anIntArray280[local1521] = local1644;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2576) Class96 local2576;
			@Pc(2581) Class139 local2581;
			if (arg0 == 5) {
				if (this.anIntArrayArray28 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray28.length) {
							local252 = this.anIntArrayArray28[local35];
							for (local254 = 0; local254 < local252.length; local254++) {
								local57 = local252[local254];
								if (this.aShortArray40 == null || (arg6 & this.aShortArray40[local57]) != 0) {
									local63 = arg2 * 8 + (this.aByteArray30[local57] & 0xFF);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray30[local57] = (byte) local63;
									if (this.aClass71_6 != null) {
										this.aClass71_6.anInterface4_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass96Array1 != null) {
						for (local35 = 0; local35 < this.anInt2805; local35++) {
							local2576 = this.aClass96Array1[local35];
							local2581 = this.aClass139Array1[local35];
							local2581.anInt4072 = local2581.anInt4072 & 0xFFFFFF | 255 - (this.aByteArray30[local2576.anInt2883] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2835) Class139 local2835;
				if (arg0 == 8) {
					if (this.anIntArrayArray30 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray30.length) {
								local252 = this.anIntArrayArray30[local35];
								for (local254 = 0; local254 < local252.length; local254++) {
									local2835 = this.aClass139Array1[local252[local254]];
									local2835.anInt4074 += arg3;
									local2835.anInt4071 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray30 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray30.length) {
								local252 = this.anIntArrayArray30[local35];
								for (local254 = 0; local254 < local252.length; local254++) {
									local2835 = this.aClass139Array1[local252[local254]];
									local2835.anInt4078 = local2835.anInt4078 * arg3 >> 7;
									local2835.anInt4076 = local2835.anInt4076 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray30 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray30.length) {
							local252 = this.anIntArrayArray30[local35];
							for (local254 = 0; local254 < local252.length; local254++) {
								local2835 = this.aClass139Array1[local252[local254]];
								local2835.anInt4077 = local2835.anInt4077 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray28 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray28.length > local35) {
						local252 = this.anIntArrayArray28[local35];
						for (local254 = 0; local254 < local252.length; local254++) {
							local57 = local252[local254];
							if (this.aShortArray40 == null || (this.aShortArray40[local57] & arg6) != 0) {
								local63 = this.aShortArray35[local57] & 0xFFFF;
								local389 = local63 >> 10 & 0x3F;
								local407 = local63 >> 7 & 0x7;
								@Pc(2679) int local2679 = arg2 + local389 & 0x3F;
								local407 += arg3 / 4;
								local627 = local63 & 0x7F;
								local627 += arg4;
								if (local407 < 0) {
									local407 = 0;
								} else if (local407 > 7) {
									local407 = 7;
								}
								if (local627 < 0) {
									local627 = 0;
								} else if (local627 > 127) {
									local627 = 127;
								}
								this.aShortArray35[local57] = (short) (local627 | local407 << 7 | local2679 << 10);
								if (this.aClass71_6 != null) {
									this.aClass71_6.anInterface4_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass96Array1 != null) {
					for (local35 = 0; local35 < this.anInt2805; local35++) {
						local2576 = this.aClass96Array1[local35];
						local2581 = this.aClass139Array1[local35];
						local2581.anInt4072 = local2581.anInt4072 & 0xFF000000 | Static451.anIntArray744[this.aShortArray35[local2576.anInt2883] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray29.length) {
					local252 = this.anIntArrayArray29[local35];
					for (local254 = 0; local254 < local252.length; local254++) {
						local57 = local252[local254];
						if (this.aShortArray36 == null || (this.aShortArray36[local57] & arg6) != 0) {
							this.anIntArray277[local57] -= Static186.anInt3748;
							this.anIntArray278[local57] -= Static88.anInt6878;
							this.anIntArray280[local57] -= Static358.anInt6085;
							this.anIntArray277[local57] = arg2 * this.anIntArray277[local57] >> 7;
							this.anIntArray278[local57] = this.anIntArray278[local57] * arg3 >> 7;
							this.anIntArray280[local57] = arg4 * this.anIntArray280[local57] >> 7;
							this.anIntArray277[local57] += Static186.anInt3748;
							this.anIntArray278[local57] += Static88.anInt6878;
							this.anIntArray280[local57] += Static358.anInt6085;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local254 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static205.aBoolean270) {
				local389 = Static186.anInt3748 * arg7[0] + arg7[3] * Static88.anInt6878 + arg7[6] * Static358.anInt6085 + 16384 >> 15;
				local407 = Static358.anInt6085 * arg7[7] + Static186.anInt3748 * arg7[1] + Static88.anInt6878 * arg7[4] + 16384 >> 15;
				local627 = arg7[5] * Static88.anInt6878 + Static186.anInt3748 * arg7[2] + arg7[8] * Static358.anInt6085 + 16384 >> 15;
				local389 += local254;
				local407 += local57;
				Static186.anInt3748 = local389;
				local627 += local63;
				Static88.anInt6878 = local407;
				Static358.anInt6085 = local627;
				Static205.aBoolean270 = false;
			}
			local389 = arg2 << 15 >> 7;
			local407 = arg3 << 15 >> 7;
			local627 = arg4 << 15 >> 7;
			local636 = -Static186.anInt3748 * local389 + 16384 >> 15;
			local649 = local407 * -Static88.anInt6878 + 16384 >> 15;
			local653 = local627 * -Static358.anInt6085 + 16384 >> 15;
			local671 = Static186.anInt3748 + local636;
			local1016 = local649 + Static88.anInt6878;
			local1024 = Static358.anInt6085 + local653;
			@Pc(1998) int[] local1998 = new int[] { arg7[0] * local389 + 16384 >> 15, local389 * arg7[3] + 16384 >> 15, local389 * arg7[6] + 16384 >> 15, local407 * arg7[1] + 16384 >> 15, arg7[4] * local407 + 16384 >> 15, local407 * arg7[7] + 16384 >> 15, local627 * arg7[2] + 16384 >> 15, arg7[5] * local627 + 16384 >> 15, local627 * arg7[8] + 16384 >> 15 };
			local1178 = local389 * local254 + 16384 >> 15;
			local1203 = local407 * local57 + 16384 >> 15;
			@Pc(2126) int local2126 = local1178 + local671;
			local1207 = local627 * local63 + 16384 >> 15;
			@Pc(2138) int local2138 = local1203 + local1016;
			@Pc(2142) int local2142 = local1207 + local1024;
			@Pc(2145) int[] local2145 = new int[9];
			@Pc(2151) int local2151;
			for (local1215 = 0; local1215 < 3; local1215++) {
				for (local2151 = 0; local2151 < 3; local2151++) {
					local1220 = 0;
					for (local1224 = 0; local1224 < 3; local1224++) {
						local1220 += local1998[local1224 * 3 + local2151] * arg7[local1215 * 3 + local1224];
					}
					local2145[local1215 * 3 + local2151] = local1220 + 16384 >> 15;
				}
			}
			local2151 = arg7[2] * local2142 + local2126 * arg7[0] + local2138 * arg7[1] + 16384 >> 15;
			local1220 = local2126 * arg7[3] + arg7[4] * local2138 + local2142 * arg7[5] + 16384 >> 15;
			local1224 = arg7[8] * local2142 + local2138 * arg7[7] + arg7[6] * local2126 + 16384 >> 15;
			local1220 += local35;
			local2151 += local31;
			local1224 += local41;
			for (local1228 = 0; local1228 < local8; local1228++) {
				local1230 = arg1[local1228];
				if (local1230 < this.anIntArrayArray29.length) {
					local1360 = this.anIntArrayArray29[local1230];
					for (local1362 = 0; local1362 < local1360.length; local1362++) {
						local1366 = local1360[local1362];
						if (this.aShortArray36 == null || (this.aShortArray36[local1366] & arg6) != 0) {
							local1370 = local2145[2] * this.anIntArray280[local1366] + local2145[0] * this.anIntArray277[local1366] + this.anIntArray278[local1366] * local2145[1] + 16384 >> 15;
							local1372 = this.anIntArray278[local1366] * local2145[4] + local2145[3] * this.anIntArray277[local1366] + this.anIntArray280[local1366] * local2145[5] + 16384 >> 15;
							local1497 = local2145[8] * this.anIntArray280[local1366] + this.anIntArray278[local1366] * local2145[7] + this.anIntArray277[local1366] * local2145[6] + 16384 >> 15;
							@Pc(2424) int local2424 = local1372 + local1220;
							@Pc(2428) int local2428 = local1370 + local2151;
							this.anIntArray277[local1366] = local2428;
							@Pc(2437) int local2437 = local1497 + local1224;
							this.anIntArray278[local1366] = local2424;
							this.anIntArray280[local1366] = local2437;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "Z", descriptor = "()I")
	@Override
	public int Z() {
		if (!this.aBoolean209) {
			this.method2339();
		}
		return this.aShort29;
	}

	@OriginalMember(owner = "client!gm", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.aShort27;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2810; local3++) {
			if (arg0 != 0) {
				this.anIntArray277[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray278[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray280[local3] += arg2;
			}
		}
		this.aBoolean209 = false;
		if (this.aClass71_8 != null) {
			this.aClass71_8.anInterface4_4 = null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	@Override
	public Class10_Sub1_Sub7 EA(@OriginalArg(0) Class10_Sub1_Sub7 arg0) {
		if (this.anInt2828 == 0) {
			return null;
		}
		if (!this.aBoolean209) {
			this.method2339();
		}
		@Pc(39) int local39;
		@Pc(56) int local56;
		if (this.aClass50_Sub1_18.anInt1427 > 0) {
			local39 = this.aShort25 - (this.aClass50_Sub1_18.anInt1427 * this.aShort26 >> 8) >> this.aClass50_Sub1_18.anInt1404;
			local56 = this.aShort33 - (this.aShort30 * this.aClass50_Sub1_18.anInt1427 >> 8) >> this.aClass50_Sub1_18.anInt1404;
		} else {
			local39 = this.aShort25 - (this.aShort30 * this.aClass50_Sub1_18.anInt1427 >> 8) >> this.aClass50_Sub1_18.anInt1404;
			local56 = this.aShort33 - (this.aShort26 * this.aClass50_Sub1_18.anInt1427 >> 8) >> this.aClass50_Sub1_18.anInt1404;
		}
		@Pc(115) int local115;
		@Pc(132) int local132;
		if (this.aClass50_Sub1_18.anInt1431 > 0) {
			local115 = this.aShort29 - (this.aClass50_Sub1_18.anInt1431 * this.aShort26 >> 8) >> this.aClass50_Sub1_18.anInt1404;
			local132 = this.aShort28 - (this.aClass50_Sub1_18.anInt1431 * this.aShort30 >> 8) >> this.aClass50_Sub1_18.anInt1404;
		} else {
			local115 = this.aShort29 - (this.aClass50_Sub1_18.anInt1431 * this.aShort30 >> 8) >> this.aClass50_Sub1_18.anInt1404;
			local132 = this.aShort28 - (this.aShort26 * this.aClass50_Sub1_18.anInt1431 >> 8) >> this.aClass50_Sub1_18.anInt1404;
		}
		@Pc(174) int local174 = local56 + 1 - local39;
		@Pc(181) int local181 = local132 + 1 - local115;
		@Pc(184) Class10_Sub1_Sub7_Sub1 local184 = (Class10_Sub1_Sub7_Sub1) arg0;
		@Pc(200) Class10_Sub1_Sub7_Sub1 local200;
		if (local184 != null && local184.method5201(local174, local181)) {
			local200 = local184;
			local184.method5203();
		} else {
			local200 = new Class10_Sub1_Sub7_Sub1(this.aClass50_Sub1_18, local174, local181);
		}
		local200.method5198(local132, local115, local39, local56);
		this.method2337(local200);
		return local200;
	}

	@OriginalMember(owner = "client!gm", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anInt2833 = arg0;
		if (this.aClass171_1 != null && (this.anInt2833 & 0x10000) == 0) {
			this.aShortArray41 = this.aClass171_1.aShortArray71;
			this.aShortArray32 = this.aClass171_1.aShortArray70;
			this.aShortArray39 = this.aClass171_1.aShortArray72;
			this.aByteArray31 = this.aClass171_1.aByteArray54;
			this.aClass171_1 = null;
		}
		this.aBoolean208 = true;
		this.method2336();
	}

	@OriginalMember(owner = "client!gm", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		return this.aShort32;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!gm;ILclient!gm;ZZ)Lclient!e;")
	private Class63 method2330(@OriginalArg(1) Class63_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class63_Sub2 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		arg0.anInt2828 = this.anInt2828;
		arg0.aByte23 = 0;
		arg0.anInt2839 = this.anInt2839;
		arg0.anInt2810 = this.anInt2810;
		arg0.anInt2816 = this.anInt2816;
		arg0.anInt2805 = this.anInt2805;
		arg0.anInt2833 = arg1;
		arg0.anInt2826 = this.anInt2826;
		arg0.aShort27 = this.aShort27;
		arg0.anInt2834 = this.anInt2834;
		arg0.aShort32 = this.aShort32;
		@Pc(53) boolean local53 = Static68.method1345(this.anInt2816, arg1);
		@Pc(59) boolean local59 = Static68.method1351(this.anInt2816, arg1);
		@Pc(65) boolean local65 = Static62.method1044(arg1, this.anInt2816);
		@Pc(71) boolean local71 = local65 | local53 | local59;
		@Pc(176) int local176;
		if (local71) {
			if (!local53) {
				arg0.anIntArray277 = this.anIntArray277;
			} else if (arg2.anIntArray277 == null || arg2.anIntArray277.length < this.anInt2834) {
				arg0.anIntArray277 = arg2.anIntArray277 = new int[this.anInt2834];
			} else {
				arg0.anIntArray277 = arg2.anIntArray277;
			}
			if (!local59) {
				arg0.anIntArray278 = this.anIntArray278;
			} else if (arg2.anIntArray278 == null || this.anInt2834 > arg2.anIntArray278.length) {
				arg0.anIntArray278 = arg2.anIntArray278 = new int[this.anInt2834];
			} else {
				arg0.anIntArray278 = arg2.anIntArray278;
			}
			if (!local65) {
				arg0.anIntArray280 = this.anIntArray280;
			} else if (arg2.anIntArray280 == null || this.anInt2834 > arg2.anIntArray280.length) {
				arg0.anIntArray280 = arg2.anIntArray280 = new int[this.anInt2834];
			} else {
				arg0.anIntArray280 = arg2.anIntArray280;
			}
			for (local176 = 0; local176 < this.anInt2834; local176++) {
				if (local53) {
					arg0.anIntArray277[local176] = this.anIntArray277[local176];
				}
				if (local59) {
					arg0.anIntArray278[local176] = this.anIntArray278[local176];
				}
				if (local65) {
					arg0.anIntArray280[local176] = this.anIntArray280[local176];
				}
			}
		} else {
			arg0.anIntArray277 = this.anIntArray277;
			arg0.anIntArray278 = this.anIntArray278;
			arg0.anIntArray280 = this.anIntArray280;
		}
		if (Static214.method3288(arg1, this.anInt2816)) {
			arg0.aClass71_8 = arg2.aClass71_8;
			if (arg4) {
				arg0.aByte23 = (byte) (arg0.aByte23 | 0x1);
			}
			arg0.aClass71_8.anInterface4_4 = this.aClass71_8.anInterface4_4;
			arg0.aClass71_8.aByte15 = this.aClass71_8.aByte15;
		} else if (Static41.method648(this.anInt2816, arg1)) {
			arg0.aClass71_8 = this.aClass71_8;
		} else {
			arg0.aClass71_8 = null;
		}
		if (Static279.method3941(arg1, this.anInt2816)) {
			if (arg2.aShortArray35 == null || arg2.aShortArray35.length < this.anInt2839) {
				arg0.aShortArray35 = arg2.aShortArray35 = new short[this.anInt2839];
			} else {
				arg0.aShortArray35 = arg2.aShortArray35;
			}
			for (local176 = 0; local176 < this.anInt2839; local176++) {
				arg0.aShortArray35[local176] = this.aShortArray35[local176];
			}
		} else {
			arg0.aShortArray35 = this.aShortArray35;
		}
		if (Static258.method3720(arg1, this.anInt2816)) {
			if (arg2.aByteArray30 == null || arg2.aByteArray30.length < this.anInt2839) {
				arg0.aByteArray30 = arg2.aByteArray30 = new byte[this.anInt2839];
			} else {
				arg0.aByteArray30 = arg2.aByteArray30;
			}
			for (local176 = 0; local176 < this.anInt2839; local176++) {
				arg0.aByteArray30[local176] = this.aByteArray30[local176];
			}
		} else {
			arg0.aByteArray30 = this.aByteArray30;
		}
		if (Static445.method5935(arg1, this.anInt2816)) {
			arg0.aClass71_6 = arg2.aClass71_6;
			if (arg4) {
				arg0.aByte23 = (byte) (arg0.aByte23 | 0x2);
			}
			arg0.aClass71_6.anInterface4_4 = this.aClass71_6.anInterface4_4;
			arg0.aClass71_6.aByte15 = this.aClass71_6.aByte15;
		} else if (Static166.method2767(this.anInt2816, arg1)) {
			arg0.aClass71_6 = this.aClass71_6;
		} else {
			arg0.aClass71_6 = null;
		}
		@Pc(519) int local519;
		if (Static90.method1690(arg1, this.anInt2816)) {
			if (arg2.aShortArray39 == null || this.anInt2828 > arg2.aShortArray39.length) {
				local176 = this.anInt2828;
				arg0.aShortArray41 = arg2.aShortArray41 = new short[local176];
				arg0.aShortArray32 = arg2.aShortArray32 = new short[local176];
				arg0.aShortArray39 = arg2.aShortArray39 = new short[local176];
			} else {
				arg0.aShortArray41 = arg2.aShortArray41;
				arg0.aShortArray39 = arg2.aShortArray39;
				arg0.aShortArray32 = arg2.aShortArray32;
			}
			if (this.aClass171_1 == null) {
				for (local176 = 0; local176 < this.anInt2828; local176++) {
					arg0.aShortArray39[local176] = this.aShortArray39[local176];
					arg0.aShortArray41[local176] = this.aShortArray41[local176];
					arg0.aShortArray32[local176] = this.aShortArray32[local176];
				}
			} else {
				if (arg2.aClass171_1 == null) {
					arg2.aClass171_1 = new Class171();
				}
				@Pc(503) Class171 local503 = arg0.aClass171_1 = arg2.aClass171_1;
				if (local503.aShortArray72 == null || this.anInt2828 > local503.aShortArray72.length) {
					local519 = this.anInt2828;
					local503.aShortArray70 = new short[local519];
					local503.aShortArray72 = new short[local519];
					local503.aByteArray54 = new byte[local519];
					local503.aShortArray71 = new short[local519];
				}
				for (local519 = 0; local519 < this.anInt2828; local519++) {
					arg0.aShortArray39[local519] = this.aShortArray39[local519];
					arg0.aShortArray41[local519] = this.aShortArray41[local519];
					arg0.aShortArray32[local519] = this.aShortArray32[local519];
					local503.aShortArray72[local519] = this.aClass171_1.aShortArray72[local519];
					local503.aShortArray71[local519] = this.aClass171_1.aShortArray71[local519];
					local503.aShortArray70[local519] = this.aClass171_1.aShortArray70[local519];
					local503.aByteArray54[local519] = this.aClass171_1.aByteArray54[local519];
				}
			}
			arg0.aByteArray31 = this.aByteArray31;
		} else {
			arg0.aByteArray31 = this.aByteArray31;
			arg0.aShortArray32 = this.aShortArray32;
			arg0.aShortArray41 = this.aShortArray41;
			arg0.aClass171_1 = this.aClass171_1;
			arg0.aShortArray39 = this.aShortArray39;
		}
		if (Static152.method2605(arg1, this.anInt2816)) {
			if (arg4) {
				arg0.aByte23 = (byte) (arg0.aByte23 | 0x4);
			}
			arg0.aClass71_7 = arg2.aClass71_7;
			arg0.aClass71_7.anInterface4_4 = this.aClass71_7.anInterface4_4;
			arg0.aClass71_7.aByte15 = this.aClass71_7.aByte15;
		} else if (Static119.method2055(this.anInt2816, arg1)) {
			arg0.aClass71_7 = this.aClass71_7;
		} else {
			arg0.aClass71_7 = null;
		}
		if (Static228.method3401(arg1, this.anInt2816)) {
			if (arg2.aFloatArray22 == null || arg2.aFloatArray22.length < this.anInt2839) {
				local176 = this.anInt2828;
				arg0.aFloatArray22 = arg2.aFloatArray22 = new float[local176];
				arg0.aFloatArray23 = arg2.aFloatArray23 = new float[local176];
			} else {
				arg0.aFloatArray22 = arg2.aFloatArray22;
				arg0.aFloatArray23 = arg2.aFloatArray23;
			}
			for (local176 = 0; local176 < this.anInt2828; local176++) {
				arg0.aFloatArray22[local176] = this.aFloatArray22[local176];
				arg0.aFloatArray23[local176] = this.aFloatArray23[local176];
			}
		} else {
			arg0.aFloatArray23 = this.aFloatArray23;
			arg0.aFloatArray22 = this.aFloatArray22;
		}
		if (Static344.method4659(this.anInt2816, arg1)) {
			if (arg4) {
				arg0.aByte23 = (byte) (arg0.aByte23 | 0x8);
			}
			arg0.aClass71_9 = arg2.aClass71_9;
			arg0.aClass71_9.anInterface4_4 = this.aClass71_9.anInterface4_4;
			arg0.aClass71_9.aByte15 = this.aClass71_9.aByte15;
		} else if (Static372.method4979(arg1, this.anInt2816)) {
			arg0.aClass71_9 = this.aClass71_9;
		} else {
			arg0.aClass71_9 = null;
		}
		if (Static107.method1886(arg1, this.anInt2816)) {
			if (arg2.aShortArray34 == null || this.anInt2839 > arg2.aShortArray34.length) {
				local176 = this.anInt2839;
				arg0.aShortArray38 = arg2.aShortArray38 = new short[local176];
				arg0.aShortArray37 = arg2.aShortArray37 = new short[local176];
				arg0.aShortArray34 = arg2.aShortArray34 = new short[local176];
			} else {
				arg0.aShortArray37 = arg2.aShortArray37;
				arg0.aShortArray34 = arg2.aShortArray34;
				arg0.aShortArray38 = arg2.aShortArray38;
			}
			for (local176 = 0; local176 < this.anInt2839; local176++) {
				arg0.aShortArray34[local176] = this.aShortArray34[local176];
				arg0.aShortArray38[local176] = this.aShortArray38[local176];
				arg0.aShortArray37[local176] = this.aShortArray37[local176];
			}
		} else {
			arg0.aShortArray34 = this.aShortArray34;
			arg0.aShortArray37 = this.aShortArray37;
			arg0.aShortArray38 = this.aShortArray38;
		}
		if (Static457.method6053(arg1, this.anInt2816)) {
			arg0.aClass173_1 = arg2.aClass173_1;
			if (arg4) {
				arg0.aByte23 = (byte) (arg0.aByte23 | 0x10);
			}
			arg0.aClass173_1.anInterface1_3 = this.aClass173_1.anInterface1_3;
		} else if (Static373.method4981(this.anInt2816, arg1)) {
			arg0.aClass173_1 = this.aClass173_1;
		} else {
			arg0.aClass173_1 = null;
		}
		if (Static165.method5194(this.anInt2816, arg1)) {
			if (arg2.aShortArray33 == null || arg2.aShortArray33.length < this.anInt2839) {
				local176 = this.anInt2839;
				arg0.aShortArray33 = arg2.aShortArray33 = new short[local176];
			} else {
				arg0.aShortArray33 = arg2.aShortArray33;
			}
			for (local176 = 0; local176 < this.anInt2839; local176++) {
				arg0.aShortArray33[local176] = this.aShortArray33[local176];
			}
		} else {
			arg0.aShortArray33 = this.aShortArray33;
		}
		if (!Static352.method4775(this.anInt2816, arg1)) {
			arg0.aClass139Array1 = this.aClass139Array1;
		} else if (arg2.aClass139Array1 == null || this.anInt2805 > arg2.aClass139Array1.length) {
			local176 = this.anInt2805;
			arg0.aClass139Array1 = arg2.aClass139Array1 = new Class139[local176];
			for (local519 = 0; local519 < this.anInt2805; local519++) {
				arg0.aClass139Array1[local519] = this.aClass139Array1[local519].method3242();
			}
		} else {
			arg0.aClass139Array1 = arg2.aClass139Array1;
			for (local176 = 0; local176 < this.anInt2805; local176++) {
				arg0.aClass139Array1[local176].method3247(this.aClass139Array1[local176]);
			}
		}
		arg0.aShortArray36 = this.aShortArray36;
		arg0.aClass78Array2 = this.aClass78Array2;
		arg0.anIntArrayArray29 = this.anIntArrayArray29;
		arg0.anIntArray283 = this.anIntArray283;
		arg0.anIntArrayArray28 = this.anIntArrayArray28;
		if (this.aBoolean209) {
			arg0.aShort31 = this.aShort31;
			arg0.aBoolean209 = true;
			arg0.aShort26 = this.aShort26;
			arg0.aShort25 = this.aShort25;
			arg0.aShort30 = this.aShort30;
			arg0.aShort28 = this.aShort28;
			arg0.aShort29 = this.aShort29;
			arg0.aShort33 = this.aShort33;
		} else {
			arg0.aBoolean209 = false;
		}
		arg0.aClass96Array1 = this.aClass96Array1;
		arg0.anIntArrayArray30 = this.anIntArrayArray30;
		arg0.aShortArray31 = this.aShortArray31;
		arg0.aClass141Array2 = this.aClass141Array2;
		arg0.aShortArray40 = this.aShortArray40;
		arg0.anIntArray281 = this.anIntArray281;
		return arg0;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	private void method2331() {
		if (this.anInt2826 == 0) {
			return;
		}
		if (this.aByte23 != 0) {
			this.method2329(true);
		}
		this.method2329(false);
		if (this.aClass173_1 != null) {
			if (this.aClass173_1.anInterface1_3 == null) {
				this.method2338((this.aByte23 & 0x10) != 0);
			}
			if (this.aClass173_1.anInterface1_3 != null) {
				this.aClass50_Sub1_18.method1298(this.aClass71_7 != null);
				this.aClass50_Sub1_18.method1283(this.aClass71_8, this.aClass71_9, this.aClass71_7, this.aClass71_6);
				@Pc(82) int local82 = this.anIntArray281.length - 1;
				for (@Pc(84) int local84 = 0; local84 < local82; local84++) {
					@Pc(91) int local91 = this.anIntArray281[local84];
					@Pc(98) int local98 = this.anIntArray281[local84 + 1];
					@Pc(105) int local105 = this.aShortArray33[local91] & 0xFFFF;
					if (local105 == 65535) {
						local105 = -1;
					}
					this.aClass50_Sub1_18.method1280(local105, this.aClass71_7 != null);
					this.aClass50_Sub1_18.method1290((local98 - local91) * 3, local91 * 3, this.aClass173_1.anInterface1_3);
				}
			}
		}
		this.method2336();
	}

	@OriginalMember(owner = "client!gm", name = "B", descriptor = "()I")
	@Override
	public int B() {
		if (!this.aBoolean209) {
			this.method2339();
		}
		return this.aShort30;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "()[Lclient!fi;")
	@Override
	public Class78[] method6094() {
		return this.aClass78Array2;
	}

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "(III)V")
	@Override
	public void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2810; local7++) {
			if (arg0 != 128) {
				this.anIntArray277[local7] = this.anIntArray277[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray278[local7] = this.anIntArray278[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray280[local7] = arg2 * this.anIntArray280[local7] >> 7;
			}
		}
		if (this.aClass71_8 != null) {
			this.aClass71_8.anInterface4_4 = null;
		}
		this.aBoolean209 = false;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!oq;)V")
	private void method2332(@OriginalArg(1) Class34_Sub1 arg0) {
		@Pc(6) int local6;
		if (this.aClass78Array2 != null) {
			for (local6 = 0; local6 < this.aClass78Array2.length; local6++) {
				@Pc(13) Class78 local13 = this.aClass78Array2[local6];
				@Pc(15) Class78 local15 = local13;
				if (local13.aClass78_1 != null) {
					local15 = local13.aClass78_1;
				}
				local15.anInt2265 = (int) (arg0.aFloat86 * (float) this.anIntArray277[local13.anInt2278] + (float) this.anIntArray278[local13.anInt2278] * arg0.aFloat82 + (float) this.anIntArray280[local13.anInt2278] * arg0.aFloat81 + arg0.aFloat80);
				local15.anInt2272 = (int) ((float) this.anIntArray280[local13.anInt2278] * arg0.aFloat88 + (float) this.anIntArray277[local13.anInt2278] * arg0.aFloat89 + arg0.aFloat87 * (float) this.anIntArray278[local13.anInt2278] + arg0.aFloat90);
				local15.anInt2276 = (int) (arg0.aFloat83 + arg0.aFloat85 * (float) this.anIntArray280[local13.anInt2278] + (float) this.anIntArray278[local13.anInt2278] * arg0.aFloat79 + (float) this.anIntArray277[local13.anInt2278] * arg0.aFloat84);
				local15.anInt2279 = (int) ((float) this.anIntArray277[local13.anInt2275] * arg0.aFloat86 + (float) this.anIntArray278[local13.anInt2275] * arg0.aFloat82 + (float) this.anIntArray280[local13.anInt2275] * arg0.aFloat81 + arg0.aFloat80);
				local15.anInt2274 = (int) (arg0.aFloat87 * (float) this.anIntArray278[local13.anInt2275] + arg0.aFloat89 * (float) this.anIntArray277[local13.anInt2275] + (float) this.anIntArray280[local13.anInt2275] * arg0.aFloat88 + arg0.aFloat90);
				local15.anInt2269 = (int) ((float) this.anIntArray278[local13.anInt2275] * arg0.aFloat79 + arg0.aFloat84 * (float) this.anIntArray277[local13.anInt2275] + arg0.aFloat85 * (float) this.anIntArray280[local13.anInt2275] + arg0.aFloat83);
				local15.anInt2277 = (int) (arg0.aFloat80 + arg0.aFloat81 * (float) this.anIntArray280[local13.anInt2271] + arg0.aFloat82 * (float) this.anIntArray278[local13.anInt2271] + (float) this.anIntArray277[local13.anInt2271] * arg0.aFloat86);
				local15.anInt2266 = (int) (arg0.aFloat90 + (float) this.anIntArray280[local13.anInt2271] * arg0.aFloat88 + (float) this.anIntArray277[local13.anInt2271] * arg0.aFloat89 + (float) this.anIntArray278[local13.anInt2271] * arg0.aFloat87);
				local15.anInt2268 = (int) ((float) this.anIntArray277[local13.anInt2271] * arg0.aFloat84 + arg0.aFloat79 * (float) this.anIntArray278[local13.anInt2271] + (float) this.anIntArray280[local13.anInt2271] * arg0.aFloat85 + arg0.aFloat83);
			}
		}
		if (this.aClass141Array2 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass141Array2.length; local6++) {
			@Pc(364) Class141 local364 = this.aClass141Array2[local6];
			@Pc(366) Class141 local366 = local364;
			if (local364.aClass141_1 != null) {
				local366 = local364.aClass141_1;
			}
			if (local364.aClass34_3 == null) {
				local364.aClass34_3 = arg0.method5777();
			} else {
				local364.aClass34_3.ha(arg0);
			}
			local366.anInt4095 = (int) (arg0.aFloat81 * (float) this.anIntArray280[local364.anInt4090] + (float) this.anIntArray277[local364.anInt4090] * arg0.aFloat86 + arg0.aFloat82 * (float) this.anIntArray278[local364.anInt4090] + arg0.aFloat80);
			local366.anInt4093 = (int) (arg0.aFloat90 + arg0.aFloat88 * (float) this.anIntArray280[local364.anInt4090] + arg0.aFloat87 * (float) this.anIntArray278[local364.anInt4090] + arg0.aFloat89 * (float) this.anIntArray277[local364.anInt4090]);
			local366.anInt4092 = (int) (arg0.aFloat85 * (float) this.anIntArray280[local364.anInt4090] + arg0.aFloat79 * (float) this.anIntArray278[local364.anInt4090] + (float) this.anIntArray277[local364.anInt4090] * arg0.aFloat84 + arg0.aFloat83);
		}
	}

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "()Z")
	@Override
	protected boolean h() {
		if (this.anIntArrayArray29 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt2834; local12++) {
			this.anIntArray277[local12] <<= 0x4;
			this.anIntArray278[local12] <<= 0x4;
			this.anIntArray280[local12] <<= 0x4;
		}
		Static88.anInt6878 = 0;
		Static186.anInt3748 = 0;
		Static358.anInt6085 = 0;
		return true;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method6086(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class63_Sub2 local8 = (Class63_Sub2) arg0;
		if (this.anInt2839 == 0 || local8.anInt2839 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt2810;
		@Pc(21) int[] local21 = local8.anIntArray277;
		@Pc(24) int[] local24 = local8.anIntArray278;
		@Pc(27) int[] local27 = local8.anIntArray280;
		@Pc(30) short[] local30 = local8.aShortArray39;
		@Pc(33) short[] local33 = local8.aShortArray41;
		@Pc(36) short[] local36 = local8.aShortArray32;
		@Pc(39) byte[] local39 = local8.aByteArray31;
		@Pc(54) short[] local54;
		@Pc(50) short[] local50;
		@Pc(58) short[] local58;
		@Pc(46) byte[] local46;
		if (this.aClass171_1 == null) {
			local58 = null;
			local50 = null;
			local54 = null;
			local46 = null;
		} else {
			local46 = this.aClass171_1.aByteArray54;
			local50 = this.aClass171_1.aShortArray71;
			local54 = this.aClass171_1.aShortArray72;
			local58 = this.aClass171_1.aShortArray70;
		}
		@Pc(83) short[] local83;
		@Pc(87) short[] local87;
		@Pc(79) short[] local79;
		@Pc(75) byte[] local75;
		if (local8.aClass171_1 == null) {
			local87 = null;
			local75 = null;
			local79 = null;
			local83 = null;
		} else {
			local75 = local8.aClass171_1.aByteArray54;
			local79 = local8.aClass171_1.aShortArray70;
			local83 = local8.aClass171_1.aShortArray72;
			local87 = local8.aClass171_1.aShortArray71;
		}
		@Pc(100) int[] local100 = local8.anIntArray283;
		@Pc(103) short[] local103 = local8.aShortArray31;
		if (!local8.aBoolean209) {
			local8.method2339();
		}
		@Pc(112) short local112 = local8.aShort30;
		@Pc(115) short local115 = local8.aShort26;
		@Pc(118) short local118 = local8.aShort25;
		@Pc(121) short local121 = local8.aShort33;
		@Pc(124) short local124 = local8.aShort29;
		@Pc(127) short local127 = local8.aShort28;
		for (@Pc(129) int local129 = 0; local129 < this.anInt2810; local129++) {
			@Pc(139) int local139 = this.anIntArray278[local129] - arg2;
			if (local112 <= local139 && local115 >= local139) {
				@Pc(158) int local158 = this.anIntArray277[local129] - arg1;
				if (local118 <= local158 && local158 <= local121) {
					@Pc(173) int local173 = this.anIntArray280[local129] - arg3;
					if (local124 <= local173 && local173 <= local127) {
						@Pc(187) int local187 = -1;
						@Pc(192) int local192 = this.anIntArray283[local129];
						@Pc(199) int local199 = this.anIntArray283[local129 + 1];
						for (@Pc(201) int local201 = local192; local201 < local199; local201++) {
							local187 = this.aShortArray31[local201] - 1;
							if (local187 == -1 || this.aByteArray31[local187] != 0) {
								break;
							}
						}
						if (local187 != -1) {
							for (@Pc(236) int local236 = 0; local236 < local18; local236++) {
								if (local158 == local21[local236] && local173 == local27[local236] && local139 == local24[local236]) {
									local199 = local100[local236 + 1];
									local192 = local100[local236];
									@Pc(273) int local273 = -1;
									for (@Pc(275) int local275 = local192; local275 < local199; local275++) {
										local273 = local103[local275] - 1;
										if (local273 == -1 || local39[local273] != 0) {
											break;
										}
									}
									if (local273 != -1) {
										if (local54 == null) {
											this.aClass171_1 = new Class171();
											local54 = this.aClass171_1.aShortArray72 = Static290.method4077(this.aShortArray39);
											local50 = this.aClass171_1.aShortArray71 = Static290.method4077(this.aShortArray41);
											local58 = this.aClass171_1.aShortArray70 = Static290.method4077(this.aShortArray32);
											local46 = this.aClass171_1.aByteArray54 = Static198.method3140(this.aByteArray31);
										}
										if (local83 == null) {
											@Pc(359) Class171 local359 = local8.aClass171_1 = new Class171();
											local83 = local359.aShortArray72 = Static290.method4077(local30);
											local87 = local359.aShortArray71 = Static290.method4077(local33);
											local79 = local359.aShortArray70 = Static290.method4077(local36);
											local75 = local359.aByteArray54 = Static198.method3140(local39);
										}
										@Pc(392) short local392 = this.aShortArray39[local187];
										@Pc(397) short local397 = this.aShortArray41[local187];
										@Pc(402) short local402 = this.aShortArray32[local187];
										local192 = local100[local236];
										local199 = local100[local236 + 1];
										@Pc(417) byte local417 = this.aByteArray31[local187];
										@Pc(427) int local427;
										for (@Pc(419) int local419 = local192; local419 < local199; local419++) {
											local427 = local103[local419] - 1;
											if (local427 == -1) {
												break;
											}
											if (local75[local427] != 0) {
												local83[local427] += local392;
												local87[local427] += local397;
												local79[local427] += local402;
												local75[local427] += local417;
											}
										}
										local417 = local39[local273];
										local199 = this.anIntArray283[local129 + 1];
										local397 = local33[local273];
										local402 = local36[local273];
										local192 = this.anIntArray283[local129];
										local392 = local30[local273];
										for (local427 = local192; local427 < local199; local427++) {
											@Pc(514) int local514 = this.aShortArray31[local427] - 1;
											if (local514 == -1) {
												break;
											}
											if (local46[local514] != 0) {
												local54[local514] += local392;
												local50[local514] += local397;
												local58[local514] += local402;
												local46[local514] += local417;
											}
										}
										if (this.aClass71_7 == null && this.aClass71_6 != null) {
											this.aClass71_6.anInterface4_4 = null;
										}
										if (this.aClass71_7 != null) {
											this.aClass71_7.anInterface4_4 = null;
										}
										if (local8.aClass71_7 == null && local8.aClass71_6 != null) {
											local8.aClass71_6.anInterface4_4 = null;
										}
										if (local8.aClass71_7 != null) {
											local8.aClass71_7.anInterface4_4 = null;
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

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method2333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > arg5 && arg6 > arg5 && arg1 > arg5) {
			return false;
		} else if (arg5 > arg4 && arg5 > arg6 && arg5 > arg1) {
			return false;
		} else if (arg2 > arg7 && arg7 < arg0 && arg3 > arg7) {
			return false;
		} else {
			return arg7 <= arg2 || arg7 <= arg0 || arg3 >= arg7;
		}
	}

	@OriginalMember(owner = "client!gm", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean209) {
			this.method2339();
		}
		return this.aShort26;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(FFJIILclient!pn;IBII)S")
	private short method2335(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class192 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray283[arg4];
		@Pc(17) int local17 = this.anIntArray283[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(41) short local41 = this.aShortArray31[local21];
			if (local41 == 0) {
				local19 = local21;
				break;
			}
			if (arg2 == Static168.aLongArray4[local21]) {
				return (short) (local41 - 1);
			}
		}
		this.aShortArray31[local19] = (short) (this.anInt2828 + 1);
		Static168.aLongArray4[local19] = arg2;
		this.aShortArray39[this.anInt2828] = (short) arg8;
		this.aShortArray41[this.anInt2828] = (short) arg7;
		this.aShortArray32[this.anInt2828] = (short) arg6;
		this.aByteArray31[this.anInt2828] = (byte) arg3;
		this.aFloatArray22[this.anInt2828] = arg1;
		this.aFloatArray23[this.anInt2828] = arg0;
		return (short) this.anInt2828++;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BIZ)Lclient!e;")
	@Override
	public Class63 method6093(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(17) Class63_Sub2 local17;
		@Pc(21) Class63_Sub2 local21;
		if (arg0 == 1) {
			local21 = this.aClass50_Sub1_18.aClass63_Sub2_3;
			local17 = this.aClass50_Sub1_18.aClass63_Sub2_10;
		} else if (arg0 == 2) {
			local17 = this.aClass50_Sub1_18.aClass63_Sub2_8;
			local21 = this.aClass50_Sub1_18.aClass63_Sub2_2;
		} else if (arg0 == 3) {
			local17 = this.aClass50_Sub1_18.aClass63_Sub2_1;
			local21 = this.aClass50_Sub1_18.aClass63_Sub2_7;
		} else if (arg0 == 4) {
			local17 = this.aClass50_Sub1_18.aClass63_Sub2_4;
			local21 = this.aClass50_Sub1_18.aClass63_Sub2_5;
		} else if (arg0 == 5) {
			local17 = this.aClass50_Sub1_18.aClass63_Sub2_9;
			local21 = this.aClass50_Sub1_18.aClass63_Sub2_6;
		} else {
			local17 = local21 = new Class63_Sub2(this.aClass50_Sub1_18);
		}
		return this.method2330(local17, arg1, local21, arg2, arg0 != 0);
	}

	@OriginalMember(owner = "client!gm", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.aShort32 = (short) arg0;
		if (this.aClass71_6 != null) {
			this.aClass71_6.anInterface4_4 = null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aShort27 = (short) arg0;
		if (this.aClass71_6 != null) {
			this.aClass71_6.anInterface4_4 = null;
		}
		if (this.aClass71_7 != null) {
			this.aClass71_7.anInterface4_4 = null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class250.anIntArray675[arg0];
		@Pc(13) int local13 = Class250.anIntArray674[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2810; local15++) {
			local34 = local9 * this.anIntArray280[local15] + this.anIntArray277[local15] * local13 >> 15;
			this.anIntArray280[local15] = local13 * this.anIntArray280[local15] - this.anIntArray277[local15] * local9 >> 15;
			this.anIntArray277[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt2828; local34++) {
			@Pc(83) int local83 = this.aShortArray32[local34] * local9 + this.aShortArray39[local34] * local13 >> 15;
			this.aShortArray32[local34] = (short) (local13 * this.aShortArray32[local34] - local9 * this.aShortArray39[local34] >> 15);
			this.aShortArray39[local34] = (short) local83;
		}
		if (this.aClass71_7 == null && this.aClass71_6 != null) {
			this.aClass71_6.anInterface4_4 = null;
		}
		if (this.aClass71_7 != null) {
			this.aClass71_7.anInterface4_4 = null;
		}
		if (this.aClass71_8 != null) {
			this.aClass71_8.anInterface4_4 = null;
		}
		this.aBoolean209 = false;
	}

	@OriginalMember(owner = "client!gm", name = "ta", descriptor = "()I")
	@Override
	public int ta() {
		if (!this.aBoolean209) {
			this.method2339();
		}
		return this.aShort25;
	}

	@OriginalMember(owner = "client!gm", name = "S", descriptor = "()I")
	@Override
	public int S() {
		if (!this.aBoolean209) {
			this.method2339();
		}
		return this.aShort28;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V")
	private void method2336() {
		if (!this.aBoolean208) {
			return;
		}
		this.aBoolean208 = false;
		if (this.aClass78Array2 == null && this.aClass141Array2 == null && this.aClass96Array1 == null) {
			if (this.anIntArray277 != null && !Static165.method5196(this.anInt2833, this.anInt2816)) {
				if (this.aClass71_8 != null && this.aClass71_8.anInterface4_4 == null) {
					this.aBoolean208 = true;
				} else {
					if (!this.aBoolean209) {
						this.method2339();
					}
					this.anIntArray277 = null;
				}
			}
			if (this.anIntArray278 != null && !Static418.method5485(this.anInt2816, this.anInt2833)) {
				if (this.aClass71_8 != null && this.aClass71_8.anInterface4_4 == null) {
					this.aBoolean208 = true;
				} else {
					if (!this.aBoolean209) {
						this.method2339();
					}
					this.anIntArray278 = null;
				}
			}
			if (this.anIntArray280 != null && !Static425.method5651(this.anInt2816, this.anInt2833)) {
				if (this.aClass71_8 != null && this.aClass71_8.anInterface4_4 == null) {
					this.aBoolean208 = true;
				} else {
					if (!this.aBoolean209) {
						this.method2339();
					}
					this.anIntArray280 = null;
				}
			}
		}
		if (this.aShortArray31 != null && this.anIntArray277 == null && this.anIntArray278 == null && this.anIntArray280 == null) {
			this.anIntArray283 = null;
			this.aShortArray31 = null;
		}
		if (this.aByteArray31 != null && !Static301.method4178(this.anInt2816, this.anInt2833)) {
			if (this.aClass71_7 == null) {
				if (this.aClass71_6 != null && this.aClass71_6.anInterface4_4 == null) {
					this.aBoolean208 = true;
				} else {
					this.aShortArray39 = this.aShortArray41 = this.aShortArray32 = null;
					this.aByteArray31 = null;
				}
			} else if (this.aClass71_7.anInterface4_4 == null) {
				this.aBoolean208 = true;
			} else {
				this.aByteArray31 = null;
				this.aShortArray39 = this.aShortArray41 = this.aShortArray32 = null;
			}
		}
		if (this.aShortArray35 != null && !Static193.method3061(this.anInt2833, this.anInt2816)) {
			if (this.aClass71_6 != null && this.aClass71_6.anInterface4_4 == null) {
				this.aBoolean208 = true;
			} else {
				this.aShortArray35 = null;
			}
		}
		if (this.aByteArray30 != null && !Static241.method3526(this.anInt2833, this.anInt2816)) {
			if (this.aClass71_6 != null && this.aClass71_6.anInterface4_4 == null) {
				this.aBoolean208 = true;
			} else {
				this.aByteArray30 = null;
			}
		}
		if (this.aFloatArray22 != null && !Static122.method2115(this.anInt2816, this.anInt2833)) {
			if (this.aClass71_9 != null && this.aClass71_9.anInterface4_4 == null) {
				this.aBoolean208 = true;
			} else {
				this.aFloatArray22 = this.aFloatArray23 = null;
			}
		}
		if (this.aShortArray33 != null && !Static290.method4078(this.anInt2816, this.anInt2833)) {
			if (this.aClass71_6 != null && this.aClass71_6.anInterface4_4 == null) {
				this.aBoolean208 = true;
			} else {
				this.aShortArray33 = null;
			}
		}
		if (this.aShortArray34 != null && !Static163.method2719(this.anInt2833, this.anInt2816)) {
			if ((this.aClass173_1 == null || this.aClass173_1.anInterface1_3 != null) && (this.aClass71_6 == null || this.aClass71_6.anInterface4_4 != null)) {
				this.aShortArray34 = this.aShortArray38 = this.aShortArray37 = null;
			} else {
				this.aBoolean208 = true;
			}
		}
		if (this.anIntArrayArray28 != null && !Static56.method1009(this.anInt2833, this.anInt2816)) {
			this.anIntArrayArray28 = null;
			this.aShortArray40 = null;
		}
		if (this.anIntArrayArray29 != null && !Static21.method289(this.anInt2816, this.anInt2833)) {
			this.anIntArrayArray29 = null;
			this.aShortArray36 = null;
		}
		if (this.anIntArrayArray30 != null && !Static286.method4049(this.anInt2816, this.anInt2833)) {
			this.anIntArrayArray30 = null;
		}
		if (this.anIntArray281 != null && (this.anInt2833 & 0x800) == 0 && (this.anInt2833 & 0x40000) == 0) {
			this.anIntArray281 = null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLclient!tj;)V")
	private void method2337(@OriginalArg(1) Class10_Sub1_Sub7_Sub1 arg0) {
		if (this.aClass50_Sub1_18.anIntArray108.length < this.anInt2828) {
			this.aClass50_Sub1_18.anIntArray109 = new int[this.anInt2828];
			this.aClass50_Sub1_18.anIntArray108 = new int[this.anInt2828];
		}
		@Pc(28) int[] local28 = this.aClass50_Sub1_18.anIntArray108;
		@Pc(32) int[] local32 = this.aClass50_Sub1_18.anIntArray109;
		@Pc(60) int local60;
		@Pc(99) int local99;
		@Pc(108) int local108;
		for (@Pc(34) int local34 = 0; local34 < this.anInt2810; local34++) {
			local60 = (this.anIntArray277[local34] - (this.aClass50_Sub1_18.anInt1427 * this.anIntArray278[local34] >> 8) >> this.aClass50_Sub1_18.anInt1404) - arg0.anInt6635;
			@Pc(85) int local85 = (this.anIntArray280[local34] - (this.aClass50_Sub1_18.anInt1431 * this.anIntArray278[local34] >> 8) >> this.aClass50_Sub1_18.anInt1404) - arg0.anInt6636;
			@Pc(90) int local90 = this.anIntArray283[local34];
			@Pc(97) int local97 = this.anIntArray283[local34 + 1];
			for (local99 = local90; local99 < local97; local99++) {
				local108 = this.aShortArray31[local99] - 1;
				if (local108 == -1) {
					break;
				}
				local28[local108] = local60;
				local32[local108] = local85;
			}
		}
		for (local60 = 0; local60 < this.anInt2826; local60++) {
			if (this.aByteArray30 == null || this.aByteArray30[local60] <= 128) {
				@Pc(152) short local152 = this.aShortArray34[local60];
				@Pc(157) short local157 = this.aShortArray38[local60];
				@Pc(162) short local162 = this.aShortArray37[local60];
				local99 = local28[local152];
				local108 = local28[local157];
				@Pc(174) int local174 = local28[local162];
				@Pc(178) int local178 = local32[local152];
				@Pc(182) int local182 = local32[local157];
				@Pc(186) int local186 = local32[local162];
				if (-((local174 - local108) * (local182 - local178)) + (local182 - local186) * (local99 - local108) > 0) {
					arg0.method5200(local178, local182, local108, local174, local99, local186);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "K", descriptor = "(I)V")
	@Override
	public void K(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class250.anIntArray675[arg0];
		@Pc(13) int local13 = Class250.anIntArray674[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2810; local15++) {
			@Pc(33) int local33 = this.anIntArray277[local15] * local13 + this.anIntArray278[local15] * local9 >> 15;
			this.anIntArray278[local15] = this.anIntArray278[local15] * local13 - local9 * this.anIntArray277[local15] >> 15;
			this.anIntArray277[local15] = local33;
		}
		if (this.aClass71_8 != null) {
			this.aClass71_8.anInterface4_4 = null;
		}
		this.aBoolean209 = false;
	}

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "(SS)V")
	@Override
	public void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2839; local3++) {
			if (this.aShortArray35[local3] == arg0) {
				this.aShortArray35[local3] = arg1;
			}
		}
		if (this.aClass96Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt2805; local30++) {
				@Pc(37) Class96 local37 = this.aClass96Array1[local30];
				@Pc(42) Class139 local42 = this.aClass139Array1[local30];
				local42.anInt4072 = Static451.anIntArray744[this.aShortArray35[local37.anInt2883] & 0xFFFF] & 0xFFFFFF | local42.anInt4072 & 0xFF000000;
			}
		}
		if (this.aClass71_6 != null) {
			this.aClass71_6.anInterface4_4 = null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt2839; local3++) {
			local12 = this.aShortArray35[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			@Pc(41) int local41 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			if (arg2 != -1) {
				local41 += arg3 * (arg2 - local41) >> 7;
			}
			this.aShortArray35[local3] = (short) (local41 | local24 << 7 | local18 << 10);
		}
		if (this.aClass96Array1 != null) {
			for (local12 = 0; local12 < this.anInt2805; local12++) {
				@Pc(107) Class96 local107 = this.aClass96Array1[local12];
				@Pc(112) Class139 local112 = this.aClass139Array1[local12];
				local112.anInt4072 = Static451.anIntArray744[this.aShortArray35[local107.anInt2883] & 0xFFFF] & 0xFFFFFF | local112.anInt4072 & 0xFF000000;
			}
		}
		if (this.aClass71_6 != null) {
			this.aClass71_6.anInterface4_4 = null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)V")
	private void method2338(@OriginalArg(0) boolean arg0) {
		if (this.aClass50_Sub1_18.aClass10_Sub8_Sub1_2.aByteArray44.length < this.anInt2826 * 6) {
			this.aClass50_Sub1_18.aClass10_Sub8_Sub1_2 = new Class10_Sub8_Sub1((this.anInt2826 + 100) * 6);
		} else {
			this.aClass50_Sub1_18.aClass10_Sub8_Sub1_2.anInt2989 = 0;
		}
		@Pc(38) Class10_Sub8_Sub1 local38 = this.aClass50_Sub1_18.aClass10_Sub8_Sub1_2;
		@Pc(44) int local44;
		if (this.aClass50_Sub1_18.aBoolean99) {
			for (local44 = 0; local44 < this.anInt2826; local44++) {
				local38.method2509(this.aShortArray34[local44]);
				local38.method2509(this.aShortArray38[local44]);
				local38.method2509(this.aShortArray37[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt2826; local44++) {
				local38.method2496(this.aShortArray34[local44]);
				local38.method2496(this.aShortArray38[local44]);
				local38.method2496(this.aShortArray37[local44]);
			}
		}
		if (local38.anInt2989 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface1_2 == null) {
				this.anInterface1_2 = this.aClass50_Sub1_18.method1305(local38.anInt2989, true, local38.aByteArray44);
			} else {
				this.anInterface1_2.method1769(local38.aByteArray44, local38.anInt2989);
			}
			this.aClass173_1.anInterface1_3 = this.anInterface1_2;
		} else {
			this.aClass173_1.anInterface1_3 = this.aClass50_Sub1_18.method1305(local38.anInt2989, false, local38.aByteArray44);
		}
		if (!arg0) {
			this.aBoolean208 = true;
		}
	}

	@OriginalMember(owner = "client!gm", name = "KA", descriptor = "()V")
	@Override
	protected void KA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2834; local7++) {
			this.anIntArray277[local7] = this.anIntArray277[local7] + 7 >> 4;
			this.anIntArray278[local7] = this.anIntArray278[local7] + 7 >> 4;
			this.anIntArray280[local7] = this.anIntArray280[local7] + 7 >> 4;
		}
		this.aBoolean209 = false;
		if (this.aClass71_8 != null) {
			this.aClass71_8.anInterface4_4 = null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
	private void method2339() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2810; local23++) {
			@Pc(30) int local30 = this.anIntArray277[local23];
			@Pc(35) int local35 = this.anIntArray278[local23];
			@Pc(40) int local40 = this.anIntArray280[local23];
			if (local9 > local35) {
				local9 = local35;
			}
			if (local30 > local13) {
				local13 = local30;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			if (local40 < local11) {
				local11 = local40;
			}
			if (local40 > local17) {
				local17 = local40;
			}
			@Pc(86) int local86 = local40 * local40 + local30 * local30;
			if (local86 > local19) {
				local19 = local86;
			}
			local86 = local30 * local30 + local40 * local40 + local35 * local35;
			if (local21 < local86) {
				local21 = local86;
			}
		}
		this.aShort33 = (short) local13;
		this.aShort25 = (short) local7;
		this.aShort26 = (short) local15;
		this.aShort28 = (short) local17;
		this.aShort30 = (short) local9;
		this.aShort29 = (short) local11;
		this.aShort31 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean209 = true;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "()Z")
	@Override
	public boolean method6096() {
		if (this.aShortArray33 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray33.length; local12++) {
			if (this.aShortArray33[local12] != -1 && !this.aClass50_Sub1_18.anInterface7_8.method4450(this.aShortArray33[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
	private void method2341() {
		if (this.aClass96Array1 == null) {
			return;
		}
		@Pc(19) Class34_Sub1 local19 = this.aClass50_Sub1_18.aClass34_Sub1_2;
		@Pc(23) float local23 = this.aClass50_Sub1_18.aa();
		@Pc(27) float local27 = this.aClass50_Sub1_18.T();
		this.aClass50_Sub1_18.method1291();
		this.aClass50_Sub1_18.method5837(false);
		this.aClass50_Sub1_18.method1298(false);
		this.aClass50_Sub1_18.method1283(this.aClass50_Sub1_18.aClass71_5, this.aClass50_Sub1_18.aClass71_4, null, null);
		for (@Pc(54) int local54 = 0; local54 < this.anInt2805; local54++) {
			@Pc(61) Class96 local61 = this.aClass96Array1[local54];
			@Pc(66) Class139 local66 = this.aClass139Array1[local54];
			if (!local61.aBoolean210 || !this.aClass50_Sub1_18.method5882()) {
				@Pc(95) float local95 = (float) (this.anIntArray277[local61.anInt2882] + this.anIntArray277[local61.anInt2886] + this.anIntArray277[local61.anInt2880]) * 0.3333333F;
				@Pc(117) float local117 = (float) (this.anIntArray278[local61.anInt2886] + this.anIntArray278[local61.anInt2882] + this.anIntArray278[local61.anInt2880]) * 0.3333333F;
				@Pc(139) float local139 = (float) (this.anIntArray280[local61.anInt2882] + this.anIntArray280[local61.anInt2886] + this.anIntArray280[local61.anInt2880]) * 0.3333333F;
				@Pc(153) float local153 = Static317.aFloat100 + local117 * Static221.aFloat64 + local95 * Static302.aFloat91 + Static294.aFloat125 * local139;
				@Pc(167) float local167 = Static354.aFloat106 + Static57.aFloat13 * local139 + local117 * Static108.aFloat42 + local95 * Static424.aFloat121;
				@Pc(181) float local181 = Static182.aFloat58 * local117 + local95 * Static135.aFloat117 + local139 * Static273.aFloat75 + Static60.aFloat122;
				local19.method4149((float) local66.anInt4074 - local167, local153 + (float) local66.anInt4071, -local181, local61.aShort35 * local66.anInt4076 >> 7, local66.anInt4077, local61.aShort36 * local66.anInt4078 >> 7);
				this.aClass50_Sub1_18.method1322(local19);
				this.aClass50_Sub1_18.da(local27, local23 - (float) local61.anInt2881 * 1.5F);
				@Pc(231) int local231 = local66.anInt4072;
				OpenGL.glColor4ub((byte) (local231 >> 16), (byte) (local231 >> 8), (byte) local231, (byte) (local231 >> 24));
				this.aClass50_Sub1_18.method1318(local61.aShort34);
				this.aClass50_Sub1_18.method1279(local61.aByte24);
				this.aClass50_Sub1_18.method1256(local61.aByte25);
				this.aClass50_Sub1_18.method1269(4);
			}
		}
		this.aClass50_Sub1_18.da(local27, local23);
		this.aClass50_Sub1_18.method5837(true);
		this.aClass50_Sub1_18.method1282();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method6101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class34_Sub1 local8 = (Class34_Sub1) arg2;
		@Pc(12) Class34_Sub1 local12 = this.aClass50_Sub1_18.aClass34_Sub1_4;
		@Pc(33) float local33 = local12.aFloat80 + local12.aFloat86 * local8.aFloat80 + local12.aFloat82 * local8.aFloat90 + local8.aFloat83 * local12.aFloat81;
		@Pc(54) float local54 = local12.aFloat88 * local8.aFloat83 + local12.aFloat89 * local8.aFloat80 + local12.aFloat87 * local8.aFloat90 + local12.aFloat90;
		Static182.aFloat58 = local8.aFloat82 * local12.aFloat84 + local8.aFloat87 * local12.aFloat79 + local12.aFloat85 * local8.aFloat79;
		@Pc(93) float local93 = local12.aFloat84 * local8.aFloat80 + local12.aFloat79 * local8.aFloat90 + local8.aFloat83 * local12.aFloat85 + local12.aFloat83;
		Static135.aFloat117 = local12.aFloat85 * local8.aFloat84 + local8.aFloat86 * local12.aFloat84 + local12.aFloat79 * local8.aFloat89;
		Static273.aFloat75 = local8.aFloat85 * local12.aFloat85 + local12.aFloat79 * local8.aFloat88 + local8.aFloat81 * local12.aFloat84;
		Static221.aFloat64 = local12.aFloat81 * local8.aFloat79 + local12.aFloat82 * local8.aFloat87 + local12.aFloat86 * local8.aFloat82;
		Static108.aFloat42 = local8.aFloat82 * local12.aFloat89 + local12.aFloat87 * local8.aFloat87 + local8.aFloat79 * local12.aFloat88;
		Static294.aFloat125 = local12.aFloat86 * local8.aFloat81 + local8.aFloat88 * local12.aFloat82 + local12.aFloat81 * local8.aFloat85;
		Static424.aFloat121 = local8.aFloat84 * local12.aFloat88 + local8.aFloat89 * local12.aFloat87 + local8.aFloat86 * local12.aFloat89;
		Static302.aFloat91 = local12.aFloat81 * local8.aFloat84 + local8.aFloat86 * local12.aFloat86 + local8.aFloat89 * local12.aFloat82;
		Static57.aFloat13 = local8.aFloat88 * local12.aFloat87 + local8.aFloat81 * local12.aFloat89 + local8.aFloat85 * local12.aFloat88;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass50_Sub1_18.anInt1437;
		@Pc(255) int local255 = this.aClass50_Sub1_18.anInt1420;
		if (!this.aBoolean209) {
			this.method2339();
		}
		Static371.anIntArray623[0] = this.aShort25;
		Static179.anIntArray372[0] = this.aShort30;
		Static371.anIntArray623[1] = this.aShort33;
		Static218.anIntArray411[0] = this.aShort29;
		Static179.anIntArray372[1] = this.aShort30;
		Static218.anIntArray411[1] = this.aShort29;
		Static371.anIntArray623[2] = this.aShort25;
		Static179.anIntArray372[2] = this.aShort26;
		Static371.anIntArray623[3] = this.aShort33;
		Static218.anIntArray411[2] = this.aShort29;
		Static179.anIntArray372[3] = this.aShort26;
		Static218.anIntArray411[3] = this.aShort29;
		Static371.anIntArray623[4] = this.aShort25;
		Static179.anIntArray372[4] = this.aShort30;
		Static371.anIntArray623[5] = this.aShort33;
		Static218.anIntArray411[4] = this.aShort28;
		Static179.anIntArray372[5] = this.aShort30;
		Static371.anIntArray623[6] = this.aShort25;
		Static218.anIntArray411[5] = this.aShort28;
		Static179.anIntArray372[6] = this.aShort26;
		Static218.anIntArray411[6] = this.aShort28;
		Static371.anIntArray623[7] = this.aShort33;
		Static179.anIntArray372[7] = this.aShort26;
		Static218.anIntArray411[7] = this.aShort28;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(390) float local390;
		@Pc(395) float local395;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static371.anIntArray623[local383];
			local395 = Static179.anIntArray372[local383];
			local400 = Static218.anIntArray411[local383];
			local414 = local390 * Static135.aFloat117 + local395 * Static182.aFloat58 + Static273.aFloat75 * local400 + local93;
			local428 = local54 + Static108.aFloat42 * local395 + Static424.aFloat121 * local390 + Static57.aFloat13 * local400;
			local442 = local33 + local395 * Static221.aFloat64 + Static302.aFloat91 * local390 + local400 * Static294.aFloat125;
			if ((float) this.aClass50_Sub1_18.anInt1440 <= local414) {
				@Pc(461) float local461 = (float) this.aClass50_Sub1_18.anInt1447 + (float) local251 * local442 / local414;
				@Pc(473) float local473 = (float) local255 * local428 / local414 + (float) this.aClass50_Sub1_18.anInt1422;
				if (local461 < local241) {
					local241 = local461;
				}
				if (local243 < local461) {
					local243 = local461;
				}
				local239 = true;
				if (local245 > local473) {
					local245 = local473;
				}
				if (local247 < local473) {
					local247 = local473;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && local243 > (float) arg0 && local245 < (float) arg1 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.aClass50_Sub1_18.anIntArray108.length < this.anInt2828) {
				this.aClass50_Sub1_18.anIntArray109 = new int[this.anInt2828];
				this.aClass50_Sub1_18.anIntArray108 = new int[this.anInt2828];
			}
			@Pc(558) int[] local558 = this.aClass50_Sub1_18.anIntArray108;
			@Pc(562) int[] local562 = this.aClass50_Sub1_18.anIntArray109;
			@Pc(646) int local646;
			for (@Pc(564) int local564 = 0; local564 < this.anInt2810; local564++) {
				local390 = this.anIntArray277[local564];
				local400 = this.anIntArray280[local564];
				local395 = this.anIntArray278[local564];
				local428 = Static57.aFloat13 * local400 + local395 * Static108.aFloat42 + local390 * Static424.aFloat121 + local54;
				local442 = local33 + local400 * Static294.aFloat125 + local395 * Static221.aFloat64 + Static302.aFloat91 * local390;
				local414 = local93 + local400 * Static273.aFloat75 + Static135.aFloat117 * local390 + local395 * Static182.aFloat58;
				@Pc(659) int local659;
				@Pc(664) int local664;
				@Pc(671) int local671;
				if (local414 >= (float) this.aClass50_Sub1_18.anInt1440) {
					local646 = (int) ((float) this.aClass50_Sub1_18.anInt1447 + (float) local251 * local442 / local414);
					local659 = (int) ((float) this.aClass50_Sub1_18.anInt1422 + (float) local255 * local428 / local414);
					local664 = this.anIntArray283[local564];
					local671 = this.anIntArray283[local564 + 1];
					for (@Pc(673) int local673 = local664; local673 < local671; local673++) {
						@Pc(682) int local682 = this.aShortArray31[local673] - 1;
						if (local682 == -1) {
							break;
						}
						local558[local682] = local646;
						local562[local682] = local659;
					}
				} else {
					local646 = this.anIntArray283[local564];
					local659 = this.anIntArray283[local564 + 1];
					for (local664 = local646; local664 < local659; local664++) {
						local671 = this.aShortArray31[local664] - 1;
						if (local671 == -1) {
							break;
						}
						local558[this.aShortArray31[local664] - 1] = -999999;
					}
				}
			}
			for (local646 = 0; local646 < this.anInt2839; local646++) {
				if (local558[this.aShortArray34[local646]] != -999999 && local558[this.aShortArray38[local646]] != -999999 && local558[this.aShortArray37[local646]] != -999999 && this.method2333(local558[this.aShortArray38[local646]], local562[this.aShortArray37[local646]], local558[this.aShortArray34[local646]], local558[this.aShortArray37[local646]], local562[this.aShortArray34[local646]], arg1, local562[this.aShortArray38[local646]], arg0)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gm", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class154 arg2, @OriginalArg(3) Class154 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean209) {
			this.method2339();
		}
		@Pc(16) int local16 = this.aShort25 + arg4;
		@Pc(21) int local21 = arg4 + this.aShort33;
		@Pc(26) int local26 = this.aShort29 + arg6;
		@Pc(31) int local31 = this.aShort28 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt7615 >> arg2.anInt7617 >= arg2.anInt7614 || local26 < 0 || arg2.anInt7616 <= arg2.anInt7615 + local31 >> arg2.anInt7617)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local21 + arg3.anInt7615 >> arg3.anInt7617 >= arg3.anInt7614 || local26 < 0 || arg3.anInt7615 + local31 >> arg3.anInt7617 >= arg3.anInt7616) {
				return;
			}
		} else {
			local16 >>= arg2.anInt7617;
			local21 = arg2.anInt7615 + local21 - 1 >> arg2.anInt7617;
			local26 >>= arg2.anInt7617;
			local31 = local31 + arg2.anInt7615 - 1 >> arg2.anInt7617;
			if (arg5 == arg2.ua(local16, local26) && arg5 == arg2.ua(local21, local26) && arg2.ua(local16, local31) == arg5 && arg5 == arg2.ua(local21, local31)) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt2810; local195++) {
				this.anIntArray278[local195] = this.anIntArray278[local195] + arg2.ca(this.anIntArray277[local195] + arg4, this.anIntArray280[local195] + arg6) - arg5;
			}
		} else {
			@Pc(247) int local247;
			@Pc(258) int local258;
			if (arg0 == 2) {
				@Pc(242) short local242 = this.aShort30;
				if (local242 == 0) {
					return;
				}
				for (local247 = 0; local247 < this.anInt2810; local247++) {
					local258 = (this.anIntArray278[local247] << 16) / local242;
					if (arg1 > local258) {
						this.anIntArray278[local247] += (arg2.ca(arg4 + this.anIntArray277[local247], this.anIntArray280[local247] - -arg6) - arg5) * (-local258 + arg1) / arg1;
					}
				}
			} else {
				@Pc(349) int local349;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 4;
					local247 = (arg1 >> 8 & 0xFF) * 4;
					local258 = (arg1 >> 16 & 0xFF) << 6;
					local349 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg2.anInt7615 + arg4 + (local195 >> 1) >= arg2.anInt7614 << arg2.anInt7617 || arg6 - (local247 >> 1) < 0 || arg2.anInt7616 << arg2.anInt7617 <= (local247 >> 1) + arg6 + arg2.anInt7615) {
						return;
					}
					this.method6099(local258, arg6, arg5, arg2, local247, local195, arg4, local349);
				} else if (arg0 == 4) {
					local195 = this.aShort26 - this.aShort30;
					for (local247 = 0; local247 < this.anInt2810; local247++) {
						this.anIntArray278[local247] += arg3.ca(arg4 + this.anIntArray277[local247], arg6 + this.anIntArray280[local247]) + local195 - arg5;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort26 - this.aShort30;
					for (local247 = 0; local247 < this.anInt2810; local247++) {
						local258 = this.anIntArray277[local247] + arg4;
						local349 = this.anIntArray280[local247] + arg6;
						@Pc(354) int local354 = arg2.ca(local258, local349);
						@Pc(359) int local359 = arg3.ca(local258, local349);
						@Pc(364) int local364 = local354 - local359;
						this.anIntArray278[local247] = ((this.anIntArray278[local247] << 8) / local195 * local364 >> 8) + local354 - arg5;
					}
				}
			}
		}
		if (this.aClass71_8 != null) {
			this.aClass71_8.anInterface4_4 = null;
		}
		this.aBoolean209 = false;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIBSI)I")
	private int method2342(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) short arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17 = Static451.anIntArray744[Static226.method3379(arg3, arg0)];
		if (arg2 != -1) {
			@Pc(32) Class259 local32 = this.aClass50_Sub1_18.anInterface7_8.method4447(arg2 & 0xFFFF);
			@Pc(37) int local37 = local32.aByte99 & 0xFF;
			@Pc(46) int local46;
			@Pc(74) int local74;
			if (local37 != 0) {
				if (arg0 < 0) {
					local46 = 0;
				} else if (arg0 <= 127) {
					local46 = arg0 * 131586;
				} else {
					local46 = 16777215;
				}
				if (local37 == 256) {
					local17 = local46;
				} else {
					local74 = 256 - local37;
					local17 = (local37 * (local46 & 0xFF00) + local74 * (local17 & 0xFF00) & 0xFF0000) + (local74 * (local17 & 0xFF00FF) + (local46 & 0xFF00FF) * local37 & 0xFF00FF00) >> 8;
				}
			}
			local46 = local32.aByte102 & 0xFF;
			if (local46 != 0) {
				local46 += 256;
				@Pc(123) int local123 = (local17 >> 16 & 0xFF) * local46;
				if (local123 > 65535) {
					local123 = 65535;
				}
				local74 = (local17 >> 8 & 0xFF) * local46;
				if (local74 > 65535) {
					local74 = 65535;
				}
				@Pc(151) int local151 = (local17 & 0xFF) * local46;
				if (local151 > 65535) {
					local151 = 65535;
				}
				local17 = (local74 & 0xFF00) + ((local123 << 8 & 0xFF00CB) + (local151 >> 8));
			}
		}
		return (local17 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!gm", name = "za", descriptor = "(IIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static88.anInt6878 = 0;
			local11 = 0;
			Static186.anInt3748 = 0;
			Static358.anInt6085 = 0;
			for (local17 = 0; local17 < this.anInt2810; local17++) {
				Static186.anInt3748 += this.anIntArray277[local17];
				Static88.anInt6878 += this.anIntArray278[local17];
				local11++;
				Static358.anInt6085 += this.anIntArray280[local17];
			}
			if (local11 > 0) {
				Static358.anInt6085 = Static358.anInt6085 / local11 + arg3;
				Static186.anInt3748 = Static186.anInt3748 / local11 + arg1;
				Static88.anInt6878 = arg2 + Static88.anInt6878 / local11;
			} else {
				Static186.anInt3748 = arg1;
				Static88.anInt6878 = arg2;
				Static358.anInt6085 = arg3;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt2810; local11++) {
				this.anIntArray277[local11] += arg1;
				this.anIntArray278[local11] += arg2;
				this.anIntArray280[local11] += arg3;
			}
		} else {
			@Pc(161) int local161;
			@Pc(179) int local179;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt2810; local11++) {
					this.anIntArray277[local11] -= Static186.anInt3748;
					this.anIntArray278[local11] -= Static88.anInt6878;
					this.anIntArray280[local11] -= Static358.anInt6085;
					if (arg3 != 0) {
						local17 = Class250.anIntArray675[arg3];
						local161 = Class250.anIntArray674[arg3];
						local179 = this.anIntArray277[local11] * local161 + this.anIntArray278[local11] * local17 + 32767 >> 15;
						this.anIntArray278[local11] = local161 * this.anIntArray278[local11] + 32767 - local17 * this.anIntArray277[local11] >> 15;
						this.anIntArray277[local11] = local179;
					}
					if (arg1 != 0) {
						local17 = Class250.anIntArray675[arg1];
						local161 = Class250.anIntArray674[arg1];
						local179 = local161 * this.anIntArray278[local11] + 32767 - this.anIntArray280[local11] * local17 >> 15;
						this.anIntArray280[local11] = this.anIntArray280[local11] * local161 + this.anIntArray278[local11] * local17 + 32767 >> 15;
						this.anIntArray278[local11] = local179;
					}
					if (arg2 != 0) {
						local17 = Class250.anIntArray675[arg2];
						local161 = Class250.anIntArray674[arg2];
						local179 = this.anIntArray280[local11] * local17 + local161 * this.anIntArray277[local11] + 32767 >> 15;
						this.anIntArray280[local11] = local161 * this.anIntArray280[local11] + 32767 - local17 * this.anIntArray277[local11] >> 15;
						this.anIntArray277[local11] = local179;
					}
					this.anIntArray277[local11] += Static186.anInt3748;
					this.anIntArray278[local11] += Static88.anInt6878;
					this.anIntArray280[local11] += Static358.anInt6085;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt2810; local11++) {
					this.anIntArray277[local11] -= Static186.anInt3748;
					this.anIntArray278[local11] -= Static88.anInt6878;
					this.anIntArray280[local11] -= Static358.anInt6085;
					this.anIntArray277[local11] = this.anIntArray277[local11] * arg1 / 128;
					this.anIntArray278[local11] = this.anIntArray278[local11] * arg2 / 128;
					this.anIntArray280[local11] = this.anIntArray280[local11] * arg3 / 128;
					this.anIntArray277[local11] += Static186.anInt3748;
					this.anIntArray278[local11] += Static88.anInt6878;
					this.anIntArray280[local11] += Static358.anInt6085;
				}
			} else {
				@Pc(515) Class96 local515;
				@Pc(520) Class139 local520;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt2839; local11++) {
						local17 = arg1 * 8 + (this.aByteArray30[local11] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray30[local11] = (byte) local17;
					}
					if (this.aClass71_6 != null) {
						this.aClass71_6.anInterface4_4 = null;
					}
					if (this.aClass96Array1 != null) {
						for (local17 = 0; local17 < this.anInt2805; local17++) {
							local515 = this.aClass96Array1[local17];
							local520 = this.aClass139Array1[local17];
							local520.anInt4072 = local520.anInt4072 & 0xFFFFFF | 255 - (this.aByteArray30[local515.anInt2883] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt2839; local11++) {
						local17 = this.aShortArray35[local11] & 0xFFFF;
						local161 = local17 >> 10 & 0x3F;
						local179 = local17 >> 7 & 0x7;
						@Pc(578) int local578 = local17 & 0x7F;
						@Pc(585) int local585 = local161 + arg1 & 0x3F;
						local179 += arg2 / 4;
						if (local179 < 0) {
							local179 = 0;
						} else if (local179 > 7) {
							local179 = 7;
						}
						local578 += arg3;
						if (local578 < 0) {
							local578 = 0;
						} else if (local578 > 127) {
							local578 = 127;
						}
						this.aShortArray35[local11] = (short) (local578 | local179 << 7 | local585 << 10);
					}
					if (this.aClass71_6 != null) {
						this.aClass71_6.anInterface4_4 = null;
					}
					if (this.aClass96Array1 != null) {
						for (local17 = 0; local17 < this.anInt2805; local17++) {
							local515 = this.aClass96Array1[local17];
							local520 = this.aClass139Array1[local17];
							local520.anInt4072 = local520.anInt4072 & 0xFF000000 | Static451.anIntArray744[this.aShortArray35[local515.anInt2883] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(709) Class139 local709;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt2805; local11++) {
							local709 = this.aClass139Array1[local11];
							local709.anInt4074 += arg2;
							local709.anInt4071 += arg1;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt2805; local11++) {
							local709 = this.aClass139Array1[local11];
							local709.anInt4076 = local709.anInt4076 * arg1 >> 7;
							local709.anInt4078 = arg2 * local709.anInt4078 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt2805; local11++) {
							local709 = this.aClass139Array1[local11];
							local709.anInt4077 = local709.anInt4077 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt2833;
	}

	@OriginalMember(owner = "client!gm", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class250.anIntArray675[arg0];
		@Pc(13) int local13 = Class250.anIntArray674[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2810; local15++) {
			@Pc(33) int local33 = this.anIntArray277[local15] * local13 + local9 * this.anIntArray280[local15] >> 15;
			this.anIntArray280[local15] = local13 * this.anIntArray280[local15] - this.anIntArray277[local15] * local9 >> 15;
			this.anIntArray277[local15] = local33;
		}
		this.aBoolean209 = false;
		if (this.aClass71_8 != null) {
			this.aClass71_8.anInterface4_4 = null;
		}
	}
}
