import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class22_Sub3 extends Class22 {

	@OriginalMember(owner = "client!id", name = "q", descriptor = "I")
	private int anInt3513;

	@OriginalMember(owner = "client!id", name = "N", descriptor = "I")
	private int anInt3531;

	@OriginalMember(owner = "client!id", name = "bb", descriptor = "Lclient!it;")
	private Class151 aClass151_1;

	@OriginalMember(owner = "client!id", name = "lb", descriptor = "Lclient!it;")
	private Class151 lb;

	@OriginalMember(owner = "client!id", name = "pb", descriptor = "I")
	private int anInt3548;

	@OriginalMember(owner = "client!id", name = "rb", descriptor = "I")
	private int anInt3550;

	@OriginalMember(owner = "client!id", name = "wb", descriptor = "Lclient!it;")
	private Class151 aClass151_2;

	@OriginalMember(owner = "client!id", name = "Cb", descriptor = "I")
	private int anInt3558;

	@OriginalMember(owner = "client!id", name = "Jb", descriptor = "Lclient!up;")
	private Class321 aClass321_1;

	@OriginalMember(owner = "client!id", name = "Kb", descriptor = "Lclient!bn;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!id", name = "Ub", descriptor = "Z")
	private boolean aBoolean230;

	@OriginalMember(owner = "client!id", name = "ac", descriptor = "I")
	private int anInt3571;

	@OriginalMember(owner = "client!id", name = "ic", descriptor = "Z")
	private boolean aBoolean231;

	@OriginalMember(owner = "client!id", name = "jc", descriptor = "I")
	private int anInt3573;

	@OriginalMember(owner = "client!id", name = "mc", descriptor = "Lclient!sv;")
	private final Class121_Sub2 aClass121_Sub2_9;

	@OriginalMember(owner = "client!id", name = "rc", descriptor = "I")
	private int anInt3578;

	@OriginalMember(owner = "client!id", name = "sc", descriptor = "I")
	private int anInt3579;

	@OriginalMember(owner = "client!id", name = "uc", descriptor = "Lclient!it;")
	private Class151 aClass151_3;

	@OriginalMember(owner = "client!id", name = "vc", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!id", name = "wc", descriptor = "I")
	private int anInt3580;

	@OriginalMember(owner = "client!id", name = "Hb", descriptor = "[I")
	private int[] anIntArray400;

	@OriginalMember(owner = "client!id", name = "Pb", descriptor = "I")
	private int anInt3565;

	@OriginalMember(owner = "client!id", name = "nb", descriptor = "I")
	private int anInt3546;

	@OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
	private int anInt3544;

	@OriginalMember(owner = "client!id", name = "C", descriptor = "[I")
	private int[] anIntArray396;

	@OriginalMember(owner = "client!id", name = "U", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!id", name = "hb", descriptor = "I")
	private int anInt3543;

	@OriginalMember(owner = "client!id", name = "mb", descriptor = "[I")
	private int[] anIntArray398;

	@OriginalMember(owner = "client!id", name = "Cc", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!id", name = "Xb", descriptor = "[Lclient!pp;")
	private Class250[] aClass250Array4;

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "[Lclient!jq;")
	private Class163[] aClass163Array4;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "I")
	private int anInt3520;

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "[Lclient!od;")
	private Class223[] aClass223Array1;

	@OriginalMember(owner = "client!id", name = "ec", descriptor = "[Lclient!gt;")
	private Class126[] aClass126Array1;

	@OriginalMember(owner = "client!id", name = "pc", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!id", name = "lc", descriptor = "[F")
	private float[] aFloatArray18;

	@OriginalMember(owner = "client!id", name = "T", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "[F")
	private float[] aFloatArray17;

	@OriginalMember(owner = "client!id", name = "dc", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!id", name = "hc", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!id", name = "bc", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!id", name = "tc", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!id", name = "X", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!id", name = "Ob", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!id", name = "Fb", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!id", name = "kb", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!id", name = "cb", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!id", name = "tb", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!id", name = "fc", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!id", name = "Nb", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!id", name = "O", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!id", name = "gc", descriptor = "[I")
	private int[] anIntArray401;

	@OriginalMember(owner = "client!id", name = "vb", descriptor = "[I")
	private int[] anIntArray399;

	@OriginalMember(owner = "client!id", name = "Zb", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!id", name = "Sb", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!sv;Lclient!rf;IIII)V")
	public Class22_Sub3(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface7 local11 = arg0.anInterface7_14;
		this.anIntArray400 = new int[arg1.anInt7662 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt7656];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt7656; local24++) {
			if ((arg1.aByteArray97 == null || arg1.aByteArray97[local24] != 2) && (arg1.aShortArray131 == null || arg1.aShortArray131[local24] == -1 || !local11.method5209(arg1.aShortArray131[local24] & 0xFFFF).aBoolean111)) {
				local22[this.anInt3565++] = local24;
				this.anIntArray400[arg1.aShortArray122[local24]]++;
				this.anIntArray400[arg1.aShortArray126[local24]]++;
				this.anIntArray400[arg1.aShortArray125[local24]]++;
			}
		}
		this.anInt3546 = this.anInt3565;
		@Pc(117) long[] local117 = new long[this.anInt3565];
		@Pc(129) boolean local129 = (this.anInt3548 & 0x100) != 0;
		@Pc(141) int local141;
		@Pc(152) int local152;
		@Pc(277) int local277;
		label500: for (@Pc(131) int local131 = 0; local131 < this.anInt3565; local131++) {
			@Pc(137) int local137 = local22[local131];
			@Pc(139) Class76 local139 = null;
			local141 = 0;
			@Pc(143) byte local143 = 0;
			@Pc(145) byte local145 = 0;
			@Pc(147) byte local147 = 0;
			if (arg1.aClass55Array1 != null) {
				for (local152 = 0; local152 < arg1.aClass55Array1.length; local152++) {
					@Pc(159) Class55 local159 = arg1.aClass55Array1[local152];
					if (local159.anInt1155 == local137) {
						@Pc(168) Class26 local168 = Static459.method6466(local159.anInt1150);
						if (local168.aBoolean17) {
							local117[local131] = Long.MAX_VALUE;
							this.anInt3546--;
							continue label500;
						}
					}
				}
			}
			@Pc(195) short local195 = -1;
			if (arg1.aShortArray131 != null) {
				local195 = arg1.aShortArray131[local137];
				if (local195 != -1) {
					local139 = local11.method5209(local195 & 0xFFFF);
					local147 = local139.aByte22;
					local145 = local139.aByte24;
				}
			}
			@Pc(239) boolean local239 = arg1.aByteArray101 != null && arg1.aByteArray101[local137] != 0 || local139 != null && !local139.aBoolean110;
			if ((local129 || local239) && arg1.aByteArray100 != null) {
				local141 += arg1.aByteArray100[local137] << 17;
			}
			if (local239) {
				local141 += 65536;
			}
			local141 += (local145 & 0xFF) << 8;
			local277 = local143 + ((local195 & 0xFFFF) << 16);
			local141 += local147 & 0xFF;
			@Pc(289) int local289 = local277 + (local131 & 0xFFFF);
			local117[local131] = ((long) local141 << 32) + (long) local289;
		}
		Static517.method6761(local117, local22);
		this.anInt3544 = arg1.anInt7662;
		this.anIntArray396 = arg1.anIntArray603;
		this.aShortArray64 = arg1.aShortArray130;
		this.anInt3543 = arg1.anInt7672;
		this.anIntArray398 = arg1.anIntArray605;
		this.anIntArray403 = arg1.anIntArray612;
		@Pc(340) Class36[] local340 = new Class36[this.anInt3544];
		this.aClass250Array4 = arg1.aClass250Array7;
		this.aClass163Array4 = arg1.aClass163Array7;
		@Pc(368) int local368;
		@Pc(382) int local382;
		if (arg1.aClass55Array1 != null) {
			this.anInt3520 = arg1.aClass55Array1.length;
			this.aClass223Array1 = new Class223[this.anInt3520];
			this.aClass126Array1 = new Class126[this.anInt3520];
			for (local368 = 0; local368 < this.anInt3520; local368++) {
				@Pc(375) Class55 local375 = arg1.aClass55Array1[local368];
				@Pc(380) Class26 local380 = Static459.method6466(local375.anInt1150);
				local382 = -1;
				for (@Pc(384) int local384 = 0; local384 < this.anInt3565; local384++) {
					if (local22[local384] == local375.anInt1155) {
						local382 = local384;
						break;
					}
				}
				if (local382 == -1) {
					throw new RuntimeException();
				}
				local152 = Static101.anIntArray262[arg1.aShortArray127[local375.anInt1155] & 0xFFFF] & 0xFFFFFF;
				local152 |= 255 - (arg1.aByteArray101 == null ? 0 : arg1.aByteArray101[local375.anInt1155]) << 24;
				this.aClass126Array1[local368] = new Class126(local382, arg1.aShortArray122[local375.anInt1155], arg1.aShortArray126[local375.anInt1155], arg1.aShortArray125[local375.anInt1155], local380.anInt544, local380.anInt545, local380.anInt550, local380.anInt543, local380.anInt542, local380.aBoolean17, local380.aBoolean18, local375.anInt1153);
				this.aClass223Array1[local368] = new Class223(local152);
			}
		}
		local368 = this.anInt3565 * 3;
		this.aShortArray74 = new short[local368];
		this.aFloatArray18 = new float[local368];
		this.aShortArray63 = new short[this.anInt3565];
		this.aShort71 = (short) arg3;
		this.aFloatArray17 = new float[local368];
		this.aShortArray71 = new short[local368];
		this.aShortArray62 = new short[local368];
		this.aShortArray73 = new short[local368];
		this.aShortArray70 = new short[local368];
		this.aByteArray48 = new byte[local368];
		this.aShortArray65 = new short[this.anInt3565];
		Static389.aLongArray12 = new long[local368];
		if (arg1.aShortArray128 != null) {
			this.aShortArray69 = new short[this.anInt3565];
		}
		this.aByteArray47 = new byte[this.anInt3565];
		this.aShortArray67 = new short[this.anInt3565];
		this.aShortArray66 = new short[this.anInt3565];
		this.aShortArray68 = new short[local368];
		this.aShortArray72 = new short[this.anInt3565];
		this.aShort72 = (short) arg4;
		local141 = 0;
		for (local277 = 0; local277 < arg1.anInt7662; local277++) {
			local382 = this.anIntArray400[local277];
			this.anIntArray400[local277] = local141;
			local340[local277] = new Class36();
			local141 += local382;
		}
		this.anIntArray400[arg1.anInt7662] = local141;
		@Pc(624) int[] local624 = null;
		@Pc(626) int[] local626 = null;
		@Pc(628) int[] local628 = null;
		@Pc(630) float[][] local630 = null;
		@Pc(648) int[] local648;
		@Pc(656) int local656;
		@Pc(697) int local697;
		@Pc(703) int local703;
		@Pc(716) int local716;
		@Pc(718) int local718;
		@Pc(754) int local754;
		@Pc(759) int local759;
		@Pc(919) float local919;
		@Pc(927) float local927;
		@Pc(935) float local935;
		if (arg1.aByteArray102 != null) {
			@Pc(636) int local636 = arg1.anInt7653;
			@Pc(639) int[] local639 = new int[local636];
			@Pc(642) int[] local642 = new int[local636];
			@Pc(645) int[] local645 = new int[local636];
			local648 = new int[local636];
			@Pc(651) int[] local651 = new int[local636];
			@Pc(654) int[] local654 = new int[local636];
			for (local656 = 0; local656 < local636; local656++) {
				local639[local656] = Integer.MAX_VALUE;
				local642[local656] = -2147483647;
				local645[local656] = Integer.MAX_VALUE;
				local648[local656] = -2147483647;
				local651[local656] = Integer.MAX_VALUE;
				local654[local656] = -2147483647;
			}
			local628 = new int[local636];
			local630 = new float[local636][];
			local626 = new int[local636];
			for (local697 = 0; local697 < this.anInt3565; local697++) {
				local703 = local22[local697];
				if (arg1.aByteArray102[local703] != -1) {
					local716 = arg1.aByteArray102[local703] & 0xFF;
					for (local718 = 0; local718 < 3; local718++) {
						@Pc(730) short local730;
						if (local718 == 0) {
							local730 = arg1.aShortArray122[local703];
						} else if (local718 == 1) {
							local730 = arg1.aShortArray126[local703];
						} else {
							local730 = arg1.aShortArray125[local703];
						}
						local754 = arg1.anIntArray612[local730];
						local759 = arg1.anIntArray603[local730];
						@Pc(764) int local764 = arg1.anIntArray605[local730];
						if (local754 < local639[local716]) {
							local639[local716] = local754;
						}
						if (local754 > local642[local716]) {
							local642[local716] = local754;
						}
						if (local759 < local645[local716]) {
							local645[local716] = local759;
						}
						if (local648[local716] < local759) {
							local648[local716] = local759;
						}
						if (local651[local716] > local764) {
							local651[local716] = local764;
						}
						if (local764 > local654[local716]) {
							local654[local716] = local764;
						}
					}
				}
			}
			local624 = new int[local636];
			for (local703 = 0; local703 < local636; local703++) {
				@Pc(861) byte local861 = arg1.aByteArray99[local703];
				if (local861 > 0) {
					local624[local703] = (local639[local703] + local642[local703]) / 2;
					local626[local703] = (local645[local703] + local648[local703]) / 2;
					local628[local703] = (local651[local703] + local654[local703]) / 2;
					if (local861 == 1) {
						local759 = arg1.anIntArray610[local703];
						if (local759 == 0) {
							local927 = 1.0F;
							local919 = 1.0F;
						} else if (local759 > 0) {
							local927 = (float) local759 / 1024.0F;
							local919 = 1.0F;
						} else {
							local927 = 1.0F;
							local919 = (float) -local759 / 1024.0F;
						}
						local935 = 64.0F / (float) arg1.anIntArray611[local703];
					} else if (local861 == 2) {
						local919 = 64.0F / (float) arg1.anIntArray610[local703];
						local927 = 64.0F / (float) arg1.anIntArray606[local703];
						local935 = 64.0F / (float) arg1.anIntArray611[local703];
					} else {
						local935 = (float) arg1.anIntArray611[local703] / 1024.0F;
						local927 = (float) arg1.anIntArray606[local703] / 1024.0F;
						local919 = (float) arg1.anIntArray610[local703] / 1024.0F;
					}
					local630[local703] = Static477.method7225(local935, local927, local919, arg1.aShortArray124[local703], arg1.aShortArray123[local703], arg1.aShortArray129[local703], arg1.aByteArray98[local703] & 0xFF);
				}
			}
		}
		@Pc(1037) Class43[] local1037 = new Class43[arg1.anInt7656];
		@Pc(1056) short local1056;
		@Pc(1067) int local1067;
		@Pc(1078) int local1078;
		for (@Pc(1039) int local1039 = 0; local1039 < arg1.anInt7656; local1039++) {
			@Pc(1046) short local1046 = arg1.aShortArray122[local1039];
			@Pc(1051) short local1051 = arg1.aShortArray126[local1039];
			local1056 = arg1.aShortArray125[local1039];
			local1067 = this.anIntArray403[local1051] - this.anIntArray403[local1046];
			local1078 = this.anIntArray396[local1051] - this.anIntArray396[local1046];
			local656 = this.anIntArray398[local1051] - this.anIntArray398[local1046];
			local697 = this.anIntArray403[local1056] - this.anIntArray403[local1046];
			local703 = this.anIntArray396[local1056] - this.anIntArray396[local1046];
			local716 = this.anIntArray398[local1056] - this.anIntArray398[local1046];
			local718 = local1078 * local716 - local703 * local656;
			@Pc(1139) int local1139 = local656 * local697 - local1067 * local716;
			for (local754 = local703 * local1067 - local1078 * local697; local718 > 8192 || local1139 > 8192 || local754 > 8192 || local718 < -8192 || local1139 < -8192 || local754 < -8192; local754 >>= 0x1) {
				local718 >>= 0x1;
				local1139 >>= 0x1;
			}
			local759 = (int) Math.sqrt((double) (local718 * local718 + local1139 * local1139 + local754 * local754));
			if (local759 <= 0) {
				local759 = 1;
			}
			local754 = local754 * 256 / local759;
			local718 = local718 * 256 / local759;
			local1139 = local1139 * 256 / local759;
			@Pc(1237) byte local1237 = arg1.aByteArray97 == null ? 0 : arg1.aByteArray97[local1039];
			if (local1237 == 0) {
				@Pc(1243) Class36 local1243 = local340[local1046];
				local1243.anInt820 += local718;
				local1243.anInt817++;
				local1243.anInt819 += local1139;
				local1243.anInt816 += local754;
				@Pc(1271) Class36 local1271 = local340[local1051];
				local1271.anInt816 += local754;
				local1271.anInt819 += local1139;
				local1271.anInt817++;
				local1271.anInt820 += local718;
				@Pc(1299) Class36 local1299 = local340[local1056];
				local1299.anInt816 += local754;
				local1299.anInt819 += local1139;
				local1299.anInt817++;
				local1299.anInt820 += local718;
			} else if (local1237 == 1) {
				@Pc(1338) Class43 local1338 = local1037[local1039] = new Class43();
				local1338.anInt874 = local754;
				local1338.anInt871 = local718;
				local1338.anInt873 = local1139;
			}
		}
		@Pc(1360) int local1360;
		for (@Pc(1354) int local1354 = 0; local1354 < this.anInt3565; local1354++) {
			local1360 = local22[local1354];
			@Pc(1367) int local1367 = arg1.aShortArray127[local1360] & 0xFFFF;
			@Pc(1375) short local1375;
			if (arg1.aShortArray131 == null) {
				local1375 = -1;
			} else {
				local1375 = arg1.aShortArray131[local1360];
			}
			if (arg1.aByteArray102 == null) {
				local1078 = -1;
			} else {
				local1078 = arg1.aByteArray102[local1360];
			}
			if (arg1.aByteArray101 == null) {
				local656 = 0;
			} else {
				local656 = arg1.aByteArray101[local1360] & 0xFF;
			}
			@Pc(1407) float local1407 = 0.0F;
			@Pc(1409) float local1409 = 0.0F;
			@Pc(1411) float local1411 = 0.0F;
			local919 = 0.0F;
			local935 = 0.0F;
			local927 = 0.0F;
			@Pc(1419) byte local1419 = 0;
			@Pc(1421) byte local1421 = 0;
			@Pc(1423) int local1423 = 0;
			@Pc(1439) byte local1439;
			@Pc(1459) short local1459;
			@Pc(2209) short local2209;
			@Pc(2214) short local2214;
			if (local1375 != -1) {
				if (local1078 == -1) {
					local1409 = 1.0F;
					local1421 = 2;
					local927 = 0.0F;
					local1411 = 1.0F;
					local1407 = 0.0F;
					local1419 = 1;
					local919 = 1.0F;
					local935 = 0.0F;
				} else {
					local1078 &= 0xFF;
					local1439 = arg1.aByteArray99[local1078];
					@Pc(1449) short local1449;
					@Pc(1454) short local1454;
					@Pc(1488) float local1488;
					@Pc(1704) float local1704;
					@Pc(1712) float local1712;
					@Pc(1810) float local1810;
					@Pc(1818) float local1818;
					@Pc(1826) float local1826;
					@Pc(1849) float local1849;
					@Pc(1872) float local1872;
					@Pc(1895) float local1895;
					if (local1439 == 0) {
						local1449 = arg1.aShortArray122[local1360];
						local1454 = arg1.aShortArray126[local1360];
						local1459 = arg1.aShortArray125[local1360];
						local2209 = arg1.aShortArray123[local1078];
						local2214 = arg1.aShortArray129[local1078];
						@Pc(2219) short local2219 = arg1.aShortArray124[local1078];
						@Pc(2225) float local2225 = (float) arg1.anIntArray612[local2209];
						@Pc(2231) float local2231 = (float) arg1.anIntArray603[local2209];
						local1488 = arg1.anIntArray605[local2209];
						local1704 = (float) arg1.anIntArray612[local2214] - local2225;
						local1712 = (float) arg1.anIntArray603[local2214] - local2231;
						@Pc(2264) float local2264 = (float) arg1.anIntArray605[local2214] - local1488;
						@Pc(2272) float local2272 = (float) arg1.anIntArray612[local2219] - local2225;
						@Pc(2280) float local2280 = (float) arg1.anIntArray603[local2219] - local2231;
						@Pc(2288) float local2288 = (float) arg1.anIntArray605[local2219] - local1488;
						@Pc(2296) float local2296 = (float) arg1.anIntArray612[local1449] - local2225;
						@Pc(2304) float local2304 = (float) arg1.anIntArray603[local1449] - local2231;
						@Pc(2313) float local2313 = (float) arg1.anIntArray605[local1449] - local1488;
						@Pc(2321) float local2321 = (float) arg1.anIntArray612[local1454] - local2225;
						@Pc(2329) float local2329 = (float) arg1.anIntArray603[local1454] - local2231;
						local1810 = (float) arg1.anIntArray605[local1454] - local1488;
						local1818 = (float) arg1.anIntArray612[local1459] - local2225;
						local1826 = (float) arg1.anIntArray603[local1459] - local2231;
						local1849 = (float) arg1.anIntArray605[local1459] - local1488;
						local1872 = local1712 * local2288 - local2264 * local2280;
						local1895 = local2272 * local2264 - local1704 * local2288;
						@Pc(2389) float local2389 = local1704 * local2280 - local2272 * local1712;
						@Pc(2398) float local2398 = local2280 * local2389 - local1895 * local2288;
						@Pc(2407) float local2407 = local2288 * local1872 - local2272 * local2389;
						@Pc(2416) float local2416 = local1895 * local2272 - local1872 * local2280;
						@Pc(2430) float local2430 = 1.0F / (local1704 * local2398 + local1712 * local2407 + local2264 * local2416);
						local1407 = local2430 * (local2407 * local2304 + local2296 * local2398 + local2416 * local2313);
						local1411 = local2430 * (local2416 * local1810 + local2329 * local2407 + local2398 * local2321);
						local935 = (local1826 * local2407 + local2398 * local1818 + local2416 * local1849) * local2430;
						@Pc(2480) float local2480 = local2264 * local1872 - local1704 * local2389;
						@Pc(2488) float local2488 = local1712 * local2389 - local1895 * local2264;
						@Pc(2496) float local2496 = local1704 * local1895 - local1712 * local1872;
						@Pc(2510) float local2510 = 1.0F / (local2496 * local2288 + local2280 * local2480 + local2272 * local2488);
						local1409 = local2510 * (local2313 * local2496 + local2488 * local2296 + local2480 * local2304);
						local919 = local2510 * (local2480 * local2329 + local2321 * local2488 + local1810 * local2496);
						local927 = local2510 * (local2488 * local1818 + local2480 * local1826 + local1849 * local2496);
					} else {
						local1449 = arg1.aShortArray122[local1360];
						local1454 = arg1.aShortArray126[local1360];
						local1459 = arg1.aShortArray125[local1360];
						@Pc(1463) int local1463 = local624[local1078];
						@Pc(1467) int local1467 = local626[local1078];
						@Pc(1471) int local1471 = local628[local1078];
						@Pc(1475) float[] local1475 = local630[local1078];
						@Pc(1480) byte local1480 = arg1.aByteArray103[local1078];
						local1488 = (float) arg1.anIntArray607[local1078] / 256.0F;
						if (local1439 == 1) {
							local1704 = (float) arg1.anIntArray606[local1078] / 1024.0F;
							Static516.method7311(arg1.anIntArray603[local1449], local1463, local1475, arg1.anIntArray605[local1449], arg1.anIntArray612[local1449], local1467, local1704, local1471, local1480, local1488);
							local1409 = Static36.aFloat8;
							local1407 = Static99.aFloat18;
							Static516.method7311(arg1.anIntArray603[local1454], local1463, local1475, arg1.anIntArray605[local1454], arg1.anIntArray612[local1454], local1467, local1704, local1471, local1480, local1488);
							local1411 = Static99.aFloat18;
							local919 = Static36.aFloat8;
							Static516.method7311(arg1.anIntArray603[local1459], local1463, local1475, arg1.anIntArray605[local1459], arg1.anIntArray612[local1459], local1467, local1704, local1471, local1480, local1488);
							local927 = Static36.aFloat8;
							local935 = Static99.aFloat18;
							local1712 = local1704 / 2.0F;
							if ((local1480 & 0x1) == 0) {
								if (local1712 < local1411 - local1407) {
									local1411 -= local1704;
									local1419 = 1;
								} else if (local1712 < local1407 - local1411) {
									local1419 = 2;
									local1411 += local1704;
								}
								if (local935 - local1407 > local1712) {
									local1421 = 1;
									local935 -= local1704;
								} else if (local1712 < local1407 - local935) {
									local935 += local1704;
									local1421 = 2;
								}
							} else {
								if (local1712 < local919 - local1409) {
									local919 -= local1704;
									local1419 = 1;
								} else if (local1409 - local919 > local1712) {
									local1419 = 2;
									local919 += local1704;
								}
								if (local1712 < local927 - local1409) {
									local927 -= local1704;
									local1421 = 1;
								} else if (local1712 < local1409 - local927) {
									local1421 = 2;
									local927 += local1704;
								}
							}
						} else if (local1439 == 2) {
							local1704 = (float) arg1.anIntArray613[local1078] / 256.0F;
							local1712 = (float) arg1.anIntArray604[local1078] / 256.0F;
							@Pc(1723) int local1723 = arg1.anIntArray612[local1454] - arg1.anIntArray612[local1449];
							@Pc(1734) int local1734 = arg1.anIntArray603[local1454] - arg1.anIntArray603[local1449];
							@Pc(1744) int local1744 = arg1.anIntArray605[local1454] - arg1.anIntArray605[local1449];
							@Pc(1754) int local1754 = arg1.anIntArray612[local1459] - arg1.anIntArray612[local1449];
							@Pc(1765) int local1765 = arg1.anIntArray603[local1459] - arg1.anIntArray603[local1449];
							@Pc(1776) int local1776 = arg1.anIntArray605[local1459] - arg1.anIntArray605[local1449];
							@Pc(1785) int local1785 = local1776 * local1734 - local1765 * local1744;
							@Pc(1793) int local1793 = local1744 * local1754 - local1723 * local1776;
							@Pc(1802) int local1802 = local1765 * local1723 - local1734 * local1754;
							local1810 = 64.0F / (float) arg1.anIntArray610[local1078];
							local1818 = 64.0F / (float) arg1.anIntArray611[local1078];
							local1826 = 64.0F / (float) arg1.anIntArray606[local1078];
							local1849 = (local1475[1] * (float) local1793 + local1475[0] * (float) local1785 + local1475[2] * (float) local1802) / local1810;
							local1872 = (local1475[4] * (float) local1793 + (float) local1785 * local1475[3] + (float) local1802 * local1475[5]) / local1818;
							local1895 = (local1475[7] * (float) local1793 + local1475[6] * (float) local1785 + local1475[8] * (float) local1802) / local1826;
							local1423 = Static461.method6475(local1895, local1872, local1849);
							Static202.method3002(local1471, local1704, local1475, local1467, local1488, local1423, local1712, arg1.anIntArray603[local1449], arg1.anIntArray612[local1449], local1480, arg1.anIntArray605[local1449], local1463);
							local1407 = Static130.aFloat21;
							local1409 = Static323.aFloat132;
							Static202.method3002(local1471, local1704, local1475, local1467, local1488, local1423, local1712, arg1.anIntArray603[local1454], arg1.anIntArray612[local1454], local1480, arg1.anIntArray605[local1454], local1463);
							local1411 = Static130.aFloat21;
							local919 = Static323.aFloat132;
							Static202.method3002(local1471, local1704, local1475, local1467, local1488, local1423, local1712, arg1.anIntArray603[local1459], arg1.anIntArray612[local1459], local1480, arg1.anIntArray605[local1459], local1463);
							local935 = Static130.aFloat21;
							local927 = Static323.aFloat132;
						} else if (local1439 == 3) {
							Static534.method7440(local1463, local1475, local1480, arg1.anIntArray605[local1449], local1471, arg1.anIntArray603[local1449], local1488, arg1.anIntArray612[local1449], local1467);
							local1407 = Static523.aFloat201;
							local1409 = Static394.aFloat166;
							Static534.method7440(local1463, local1475, local1480, arg1.anIntArray605[local1454], local1471, arg1.anIntArray603[local1454], local1488, arg1.anIntArray612[local1454], local1467);
							local919 = Static394.aFloat166;
							local1411 = Static523.aFloat201;
							Static534.method7440(local1463, local1475, local1480, arg1.anIntArray605[local1459], local1471, arg1.anIntArray603[local1459], local1488, arg1.anIntArray612[local1459], local1467);
							local927 = Static394.aFloat166;
							local935 = Static523.aFloat201;
							if ((local1480 & 0x1) == 0) {
								if (local1411 - local1407 > 0.5F) {
									local1411--;
									local1419 = 1;
								} else if (local1407 - local1411 > 0.5F) {
									local1411++;
									local1419 = 2;
								}
								if (local935 - local1407 > 0.5F) {
									local935--;
									local1421 = 1;
								} else if (local1407 - local935 > 0.5F) {
									local1421 = 2;
									local935++;
								}
							} else {
								if (local919 - local1409 > 0.5F) {
									local1419 = 1;
									local919--;
								} else if (local1409 - local919 > 0.5F) {
									local1419 = 2;
									local919++;
								}
								if (local927 - local1409 > 0.5F) {
									local927--;
									local1421 = 1;
								} else if (local1409 - local927 > 0.5F) {
									local1421 = 2;
									local927++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray97 == null) {
				local1439 = 0;
			} else {
				local1439 = arg1.aByteArray97[local1360];
			}
			if (local1439 == 0) {
				@Pc(2606) long local2606 = (long) (local1078 << 2) + ((long) (local1423 << 24) + (long) (local1367 << 8) + (long) local656 << 32);
				local1459 = arg1.aShortArray122[local1360];
				local2209 = arg1.aShortArray126[local1360];
				local2214 = arg1.aShortArray125[local1360];
				@Pc(2625) Class36 local2625 = local340[local1459];
				this.aShortArray65[local1354] = this.method3072(local2625.anInt819, local2625.anInt820, local2606, local2625.anInt816, arg1, local1354, local1407, local1459, local1409, local2625.anInt817);
				@Pc(2650) Class36 local2650 = local340[local2209];
				this.aShortArray66[local1354] = this.method3072(local2650.anInt819, local2650.anInt820, (long) local1419 + local2606, local2650.anInt816, arg1, local1354, local1411, local2209, local919, local2650.anInt817);
				@Pc(2678) Class36 local2678 = local340[local2214];
				this.aShortArray67[local1354] = this.method3072(local2678.anInt819, local2678.anInt820, (long) local1421 + local2606, local2678.anInt816, arg1, local1354, local935, local2214, local927, local2678.anInt817);
			} else if (local1439 == 1) {
				@Pc(2711) Class43 local2711 = local1037[local1360];
				@Pc(2753) long local2753 = ((long) (local1423 << 24) + (long) (local1367 << 8) + (long) local656 << 32) + (long) ((local2711.anInt874 + 256 << 22) + (local2711.anInt873 + 256 << 12) + (local2711.anInt871 > 0 ? 1024 : 2048) + (local1078 << 2));
				this.aShortArray65[local1354] = this.method3072(local2711.anInt873, local2711.anInt871, local2753, local2711.anInt874, arg1, local1354, local1407, arg1.aShortArray122[local1360], local1409, 0);
				this.aShortArray66[local1354] = this.method3072(local2711.anInt873, local2711.anInt871, local2753 + (long) local1419, local2711.anInt874, arg1, local1354, local1411, arg1.aShortArray126[local1360], local919, 0);
				this.aShortArray67[local1354] = this.method3072(local2711.anInt873, local2711.anInt871, (long) local1421 + local2753, local2711.anInt874, arg1, local1354, local935, arg1.aShortArray125[local1360], local927, 0);
			}
			if (arg1.aShortArray131 == null) {
				this.aShortArray72[local1354] = -1;
			} else {
				this.aShortArray72[local1354] = arg1.aShortArray131[local1360];
			}
			if (arg1.aByteArray101 != null) {
				this.aByteArray47[local1354] = arg1.aByteArray101[local1360];
			}
			if (arg1.aShortArray128 != null) {
				this.aShortArray69[local1354] = arg1.aShortArray128[local1360];
			}
			this.aShortArray63[local1354] = arg1.aShortArray127[local1360];
		}
		if (this.anInt3546 > 0) {
			local1360 = 1;
			local1056 = this.aShortArray72[0];
			for (local1067 = 0; local1067 < this.anInt3546; local1067++) {
				@Pc(2907) short local2907 = this.aShortArray72[local1067];
				if (local2907 != local1056) {
					local1056 = local2907;
					local1360++;
				}
			}
			this.anIntArray397 = new int[local1360];
			this.anIntArray401 = new int[local1360];
			this.anIntArray399 = new int[local1360 + 1];
			this.anIntArray399[0] = 0;
			local1078 = this.anInt3580;
			@Pc(2950) short local2950 = 0;
			local1360 = 0;
			local1056 = this.aShortArray72[0];
			for (local697 = 0; local697 < this.anInt3546; local697++) {
				@Pc(2966) short local2966 = this.aShortArray72[local697];
				if (local2966 != local1056) {
					this.anIntArray401[local1360] = local1078;
					this.anIntArray397[local1360] = local2950 + 1 - local1078;
					local1360++;
					this.anIntArray399[local1360] = local697;
					local2950 = 0;
					local1078 = this.anInt3580;
					local1056 = local2966;
				}
				@Pc(3005) short local3005 = this.aShortArray65[local697];
				if (local3005 > local2950) {
					local2950 = local3005;
				}
				if (local1078 > local3005) {
					local1078 = local3005;
				}
				local3005 = this.aShortArray66[local697];
				if (local3005 < local1078) {
					local1078 = local3005;
				}
				if (local2950 < local3005) {
					local2950 = local3005;
				}
				local3005 = this.aShortArray67[local697];
				if (local3005 < local1078) {
					local1078 = local3005;
				}
				if (local3005 > local2950) {
					local2950 = local3005;
				}
			}
			this.anIntArray401[local1360] = local1078;
			this.anIntArray397[local1360] = local2950 + 1 - local1078;
			local1360++;
			this.anIntArray399[local1360] = this.anInt3546;
		}
		Static389.aLongArray12 = null;
		this.aShortArray68 = Static120.method1817(this.aShortArray68, this.anInt3580);
		this.aShortArray73 = Static120.method1817(this.aShortArray73, this.anInt3580);
		this.aShortArray62 = Static120.method1817(this.aShortArray62, this.anInt3580);
		this.aShortArray71 = Static120.method1817(this.aShortArray71, this.anInt3580);
		this.aShortArray70 = Static120.method1817(this.aShortArray70, this.anInt3580);
		this.aByteArray48 = Static229.method3371(this.aByteArray48, this.anInt3580);
		this.aFloatArray18 = Static402.method5897(this.aFloatArray18, this.anInt3580);
		this.aFloatArray17 = Static402.method5897(this.aFloatArray17, this.anInt3580);
		if (arg1.anIntArray608 != null && Static325.method5033(arg2, this.anInt3573)) {
			this.anIntArrayArray46 = arg1.method6331(false);
		}
		if (arg1.aClass55Array1 != null && Static168.method2625(arg2, this.anInt3573)) {
			this.anIntArrayArray45 = arg1.method6340();
		}
		if (arg1.anIntArray609 != null && Static79.method1196(arg2, this.anInt3573)) {
			local1360 = 0;
			local648 = new int[256];
			for (local1067 = 0; local1067 < this.anInt3565; local1067++) {
				local1078 = arg1.anIntArray609[local22[local1067]];
				if (local1078 >= 0) {
					if (local1078 > local1360) {
						local1360 = local1078;
					}
					@Pc(3218) int local3218 = local648[local1078]++;
				}
			}
			this.anIntArrayArray44 = new int[local1360 + 1][];
			for (local1078 = 0; local1078 <= local1360; local1078++) {
				this.anIntArrayArray44[local1078] = new int[local648[local1078]];
				local648[local1078] = 0;
			}
			for (local656 = 0; local656 < this.anInt3565; local656++) {
				local697 = arg1.anIntArray609[local22[local656]];
				if (local697 >= 0) {
					this.anIntArrayArray44[local697][local648[local697]++] = local656;
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!sv;IIZZ)V")
	public Class22_Sub3(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3565 = 0;
		this.aBoolean230 = false;
		this.anInt3544 = 0;
		this.aBoolean231 = true;
		this.anInt3543 = 0;
		this.anInt3546 = 0;
		this.aBoolean232 = false;
		this.anInt3580 = 0;
		this.aClass121_Sub2_9 = arg0;
		this.anInt3573 = arg2;
		this.anInt3548 = arg1;
		this.aBoolean232 = arg4;
		if (arg3 || Static300.method4186(this.anInt3548, this.anInt3573)) {
			this.aClass151_2 = new Class151(Static123.method1856(this.anInt3548, this.anInt3573));
		}
		if (arg3 || Static392.method5806(this.anInt3573, this.anInt3548)) {
			this.aClass151_3 = new Class151(Static477.method7208(this.anInt3573, this.anInt3548));
		}
		if (arg3 || Static573.method7837(this.anInt3573, this.anInt3548)) {
			this.lb = new Class151(Static85.method1344(this.anInt3573, this.anInt3548));
		}
		if (arg3 || Static398.method5865(this.anInt3573, this.anInt3548)) {
			this.aClass151_1 = new Class151(Static224.method3265(this.anInt3573, this.anInt3548));
		}
		if (arg3 || Static345.method5205(this.anInt3573, this.anInt3548)) {
			this.aClass32_1 = new Class32(Static318.method4937(this.anInt3573, this.anInt3548));
		}
	}

	@OriginalMember(owner = "client!id", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean230) {
			this.method3070();
		}
		return this.anInt3550;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)Z")
	private boolean method3058() {
		if (this.aClass32_1.aBoolean24) {
			return true;
		}
		if (this.aClass32_1.anInterface11_3 == null) {
			this.aClass32_1.anInterface11_3 = this.aClass121_Sub2_9.method7204(this.aBoolean232);
		}
		@Pc(28) Interface11 local28 = this.aClass32_1.anInterface11_3;
		local28.method7560(this.anInt3546 * 6);
		@Pc(40) Buffer local40 = local28.method7569();
		if (local40 != null) {
			@Pc(48) Stream local48 = this.aClass121_Sub2_9.method7200(local40);
			@Pc(52) int local52;
			if (Stream.a()) {
				for (local52 = 0; local52 < this.anInt3546; local52++) {
					local48.f(this.aShortArray65[local52]);
					local48.f(this.aShortArray66[local52]);
					local48.f(this.aShortArray67[local52]);
				}
			} else {
				for (local52 = 0; local52 < this.anInt3546; local52++) {
					local48.b(this.aShortArray65[local52]);
					local48.b(this.aShortArray66[local52]);
					local48.b(this.aShortArray67[local52]);
				}
			}
			local48.c();
			if (local28.method7563()) {
				this.aClass32_1.aBoolean24 = true;
				this.aClass32_1.anInterface11_2 = local28;
				this.aBoolean231 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!id", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class138.anIntArray392[arg0];
		@Pc(13) int local13 = Class138.anIntArray393[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3544; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray403[local15] + local9 * this.anIntArray396[local15] >> 14;
			this.anIntArray396[local15] = this.anIntArray396[local15] * local13 - this.anIntArray403[local15] * local9 >> 14;
			this.anIntArray403[local15] = local33;
		}
		this.method3063();
		this.aBoolean230 = false;
	}

	@OriginalMember(owner = "client!id", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort71;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!mn;)V")
	private void method3059(@OriginalArg(1) Class6_Sub1_Sub12_Sub1 arg0) {
		if (this.anInt3580 > Static189.anIntArray347.length) {
			Static554.anIntArray697 = new int[this.anInt3580];
			Static189.anIntArray347 = new int[this.anInt3580];
		}
		@Pc(59) int local59;
		@Pc(98) int local98;
		@Pc(107) int local107;
		for (@Pc(32) int local32 = 0; local32 < this.anInt3544; local32++) {
			local59 = (this.anIntArray403[local32] - (this.anIntArray396[local32] * this.aClass121_Sub2_9.anInt8911 >> 8) >> this.aClass121_Sub2_9.anInt8912) - arg0.anInt5690;
			@Pc(84) int local84 = (this.anIntArray398[local32] - (this.aClass121_Sub2_9.anInt8921 * this.anIntArray396[local32] >> 8) >> this.aClass121_Sub2_9.anInt8912) - arg0.anInt5685;
			@Pc(89) int local89 = this.anIntArray400[local32];
			@Pc(96) int local96 = this.anIntArray400[local32 + 1];
			for (local98 = local89; local98 < local96; local98++) {
				local107 = this.aShortArray74[local98] - 1;
				if (local107 == -1) {
					break;
				}
				Static189.anIntArray347[local107] = local59;
				Static554.anIntArray697[local107] = local84;
			}
		}
		for (local59 = 0; local59 < this.anInt3546; local59++) {
			if (this.aByteArray47 == null || this.aByteArray47[local59] <= 128) {
				@Pc(156) short local156 = this.aShortArray65[local59];
				@Pc(161) short local161 = this.aShortArray66[local59];
				@Pc(166) short local166 = this.aShortArray67[local59];
				local98 = Static189.anIntArray347[local156];
				local107 = Static189.anIntArray347[local161];
				@Pc(178) int local178 = Static189.anIntArray347[local166];
				@Pc(182) int local182 = Static554.anIntArray697[local156];
				@Pc(186) int local186 = Static554.anIntArray697[local161];
				@Pc(190) int local190 = Static554.anIntArray697[local166];
				if ((local98 - local107) * (local186 - local190) - (local186 - local182) * (local178 - local107) > 0) {
					arg0.method4893(local186, local98, local107, local178, local190, local182);
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class138.anIntArray392[arg0];
		@Pc(13) int local13 = Class138.anIntArray393[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3544; local15++) {
			local34 = local9 * this.anIntArray398[local15] + this.anIntArray403[local15] * local13 >> 14;
			this.anIntArray398[local15] = local13 * this.anIntArray398[local15] - local9 * this.anIntArray403[local15] >> 14;
			this.anIntArray403[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt3580; local34++) {
			@Pc(84) int local84 = this.aShortArray62[local34] * local13 + local9 * this.aShortArray70[local34] >> 14;
			this.aShortArray70[local34] = (short) (local13 * this.aShortArray70[local34] - local9 * this.aShortArray62[local34] >> 14);
			this.aShortArray62[local34] = (short) local84;
		}
		this.method3063();
		this.method3060();
		this.aBoolean230 = false;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "()Z")
	@Override
	public boolean method4709() {
		if (this.aShortArray72 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray72.length; local12++) {
			if (this.aShortArray72[local12] != -1 && !this.aClass121_Sub2_9.anInterface7_14.method5207(this.aShortArray72[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	private void method3060() {
		if ((this.anInt3573 & 0x37) == 0) {
			if (this.lb == null) {
				return;
			}
			this.lb.aBoolean249 = false;
		} else if (this.aClass151_1 != null) {
			this.aClass151_1.aBoolean249 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "()[Lclient!jq;")
	@Override
	public Class163[] method4708() {
		return this.aClass163Array4;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
	public void method3061() {
		if (this.aClass151_2 != null) {
			this.aClass151_2.method3237();
		}
		if (this.aClass151_3 != null) {
			this.aClass151_3.method3237();
		}
		if (this.lb != null) {
			this.lb.method3237();
		}
		if (this.aClass151_1 != null) {
			this.aClass151_1.method3237();
		}
		if (this.aClass32_1 != null) {
			this.aClass32_1.method570();
		}
	}

	@OriginalMember(owner = "client!id", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3544; local7++) {
			this.anIntArray398[local7] = -this.anIntArray398[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt3580; local29++) {
			this.aShortArray70[local29] = (short) -this.aShortArray70[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt3565; local52++) {
			@Pc(59) short local59 = this.aShortArray65[local52];
			this.aShortArray65[local52] = this.aShortArray67[local52];
			this.aShortArray67[local52] = local59;
		}
		this.method3063();
		this.method3060();
		this.method3074();
		this.aBoolean230 = false;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(Z)V")
	private void method3062() {
		if (this.aClass126Array1 == null) {
			return;
		}
		@Pc(8) float local8 = this.aClass121_Sub2_9.method7163();
		@Pc(12) float local12 = this.aClass121_Sub2_9.method7277();
		this.aClass121_Sub2_9.method7129(false);
		this.aClass121_Sub2_9.method7240(false);
		this.aClass121_Sub2_9.method7270(Static257.aClass305_4, 1);
		this.aClass121_Sub2_9.method7195(Static257.aClass305_4, 1);
		for (@Pc(35) int local35 = 0; local35 < this.anInt3520; local35++) {
			@Pc(42) Class126 local42 = this.aClass126Array1[local35];
			@Pc(47) Class223 local47 = this.aClass223Array1[local35];
			if (!local42.aBoolean209 || !this.aClass121_Sub2_9.method7141()) {
				@Pc(76) float local76 = (float) (this.anIntArray403[local42.anInt3088] + this.anIntArray403[local42.anInt3085] + this.anIntArray403[local42.anInt3086]) * 0.3333333F;
				@Pc(98) float local98 = (float) (this.anIntArray396[local42.anInt3086] + this.anIntArray396[local42.anInt3085] + this.anIntArray396[local42.anInt3088]) * 0.3333333F;
				@Pc(119) float local119 = (float) (this.anIntArray398[local42.anInt3088] + this.anIntArray398[local42.anInt3085] + this.anIntArray398[local42.anInt3086]) * 0.3333333F;
				@Pc(133) float local133 = Static222.aFloat53 * local76 + local98 * Static460.aFloat173 + local119 * Static164.aFloat39 + Static249.aFloat58;
				@Pc(147) float local147 = Static215.aFloat51 + Static9.aFloat4 * local76 + local98 * Static265.aFloat79 + local119 * Static260.aFloat67;
				@Pc(161) float local161 = local119 * Static517.aFloat175 + local98 * Static319.aFloat130 + local76 * Static414.aFloat168 + Static300.aFloat88;
				@Pc(166) Class34_Sub3 local166 = this.aClass121_Sub2_9.method7275();
				local166.method3765(local161, local133 + (float) local47.anInt6228, local47.anInt6227 * local42.aShort66 >> 7, (float) local47.anInt6236 + local147, local42.aShort67 * local47.anInt6230 >> 7, local47.anInt6231);
				local166.method3770(this.aClass121_Sub2_9.aClass34_Sub3_17);
				this.aClass121_Sub2_9.method7233();
				this.aClass121_Sub2_9.ka(local12, local8 - (float) local42.anInt3084 * 1.5F);
				@Pc(221) int local221 = local47.anInt6232;
				this.aClass121_Sub2_9.method7290(local42.aShort68, false, false);
				this.aClass121_Sub2_9.method7164(local42.aByte47);
				this.aClass121_Sub2_9.method7166(local221);
				this.aClass121_Sub2_9.method7292();
			}
		}
		this.aClass121_Sub2_9.method7195(Static197.aClass305_3, 1);
		this.aClass121_Sub2_9.method7270(Static197.aClass305_3, 1);
		this.aClass121_Sub2_9.ka(local12, local8);
		this.aClass121_Sub2_9.method7129(true);
	}

	@OriginalMember(owner = "client!id", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.aShort72 = (short) arg0;
		this.method3063();
		this.method3060();
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
	private void method3063() {
		if (this.aClass151_2 != null) {
			this.aClass151_2.aBoolean249 = false;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	private void method3064() {
		if (!this.aBoolean231) {
			return;
		}
		this.aBoolean231 = false;
		if (this.aClass163Array4 == null && this.aClass250Array4 == null && this.aClass126Array1 == null) {
			if (this.anIntArray403 != null && !Static546.method7525(this.anInt3573, this.anInt3548)) {
				if (this.aClass151_2 == null || this.aClass151_2.method3236()) {
					if (!this.aBoolean230) {
						this.method3070();
					}
					this.anIntArray403 = null;
				} else {
					this.aBoolean231 = true;
				}
			}
			if (this.anIntArray396 != null && !Static377.method5521(this.anInt3548, this.anInt3573)) {
				if (this.aClass151_2 == null || this.aClass151_2.method3236()) {
					if (!this.aBoolean230) {
						this.method3070();
					}
					this.anIntArray396 = null;
				} else {
					this.aBoolean231 = true;
				}
			}
			if (this.anIntArray398 != null && !Static359.method5335(this.anInt3548, this.anInt3573)) {
				if (this.aClass151_2 == null || this.aClass151_2.method3236()) {
					if (!this.aBoolean230) {
						this.method3070();
					}
					this.anIntArray398 = null;
				} else {
					this.aBoolean231 = true;
				}
			}
		}
		if (this.aShortArray74 != null && this.anIntArray403 == null && this.anIntArray396 == null && this.anIntArray398 == null) {
			this.anIntArray400 = null;
			this.aShortArray74 = null;
		}
		if (this.aByteArray48 != null && !Static330.method5150(this.anInt3573, this.anInt3548)) {
			label195: {
				label194: {
					@Pc(163) boolean local163;
					if ((this.anInt3573 & 0x37) == 0) {
						if (this.lb == null || this.lb.method3236()) {
							break label194;
						}
						local163 = false;
					} else {
						if (this.aClass151_1 == null || this.aClass151_1.method3236()) {
							break label194;
						}
						local163 = false;
					}
					if (!local163) {
						this.aBoolean231 = true;
						break label195;
					}
				}
				this.aByteArray48 = null;
				this.aShortArray62 = this.aShortArray71 = this.aShortArray70 = null;
			}
		}
		if (this.aShortArray63 != null && !Static414.method6082(this.anInt3573, this.anInt3548)) {
			if (this.lb == null || this.lb.method3236()) {
				this.aShortArray63 = null;
			} else {
				this.aBoolean231 = true;
			}
		}
		if (this.aByteArray47 != null && !Static84.method1340(this.anInt3573, this.anInt3548)) {
			if (this.lb == null || this.lb.method3236()) {
				this.aByteArray47 = null;
			} else {
				this.aBoolean231 = true;
			}
		}
		if (this.aFloatArray18 != null && !Static45.method617(this.anInt3573, this.anInt3548)) {
			if (this.aClass151_3 == null || this.aClass151_3.method3236()) {
				this.aFloatArray18 = this.aFloatArray17 = null;
			} else {
				this.aBoolean231 = true;
			}
		}
		if (this.aShortArray72 != null && !Static457.method3510(this.anInt3573, this.anInt3548)) {
			if (this.lb == null || this.lb.method3236()) {
				this.aShortArray72 = null;
			} else {
				this.aBoolean231 = true;
			}
		}
		if (this.aShortArray65 != null && !Static20.method288(this.anInt3548, this.anInt3573)) {
			if ((this.aClass32_1 == null || this.aClass32_1.method567()) && (this.lb == null || this.lb.method3236())) {
				this.aShortArray65 = this.aShortArray66 = this.aShortArray67 = null;
			} else {
				this.aBoolean231 = true;
			}
		}
		if (this.aShortArray68 != null) {
			if (this.aClass151_2 == null || this.aClass151_2.method3236()) {
				this.aShortArray68 = null;
			} else {
				this.aBoolean231 = true;
			}
		}
		if (this.aShortArray73 != null) {
			if (this.lb == null || this.lb.method3236()) {
				this.aShortArray73 = null;
			} else {
				this.aBoolean231 = true;
			}
		}
		if (this.anIntArrayArray44 != null && !Static79.method1196(this.anInt3548, this.anInt3573)) {
			this.aShortArray69 = null;
			this.anIntArrayArray44 = null;
		}
		if (this.anIntArrayArray46 != null && !Static325.method5033(this.anInt3548, this.anInt3573)) {
			this.anIntArrayArray46 = null;
			this.aShortArray64 = null;
		}
		if (this.anIntArrayArray45 != null && !Static168.method2625(this.anInt3548, this.anInt3573)) {
			this.anIntArrayArray45 = null;
		}
		if (this.anIntArray399 != null && (this.anInt3548 & 0x800) == 0 && (this.anInt3548 & 0x40000) == 0) {
			this.anIntArray401 = null;
			this.anIntArray399 = null;
			this.anIntArray397 = null;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()[Lclient!pp;")
	@Override
	public Class250[] method4692() {
		return this.aClass250Array4;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	private void method3065() {
		if (this.anInt3546 == 0) {
			return;
		}
		if (this.method3067() && this.method3058()) {
			this.aClass121_Sub2_9.method7297(0, this.aClass151_2.anInterface23_5);
			this.aClass121_Sub2_9.method7297(1, this.lb.anInterface23_5);
			this.aClass121_Sub2_9.method7297(2, this.aClass151_3.anInterface23_5);
			@Pc(48) boolean local48;
			if ((this.anInt3573 & 0x37) == 0) {
				local48 = false;
				this.aClass121_Sub2_9.method7240(false);
				this.aClass121_Sub2_9.method7263(this.aClass121_Sub2_9.aClass258_20);
			} else {
				local48 = true;
				this.aClass121_Sub2_9.method7240(true);
				this.aClass121_Sub2_9.method7297(3, this.aClass151_1.anInterface23_5);
				this.aClass121_Sub2_9.method7263(this.aClass121_Sub2_9.aClass258_17);
			}
			for (@Pc(86) int local86 = 0; local86 < this.anIntArray401.length; local86++) {
				@Pc(93) int local93 = this.anIntArray399[local86];
				@Pc(100) int local100 = this.anIntArray399[local86 + 1];
				@Pc(107) int local107 = this.aShortArray72[local93] & 0xFFFF;
				if (local107 == 65535) {
					local107 = -1;
				}
				this.aClass121_Sub2_9.method7290(local107, local48, true);
				this.aClass121_Sub2_9.method7239(this.anIntArray401[local86], this.anIntArray397[local86], this.aClass32_1.anInterface11_2, local100 - local93, Static503.aClass107_2, local93 * 3);
			}
		}
		this.method3064();
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()V")
	@Override
	public void method4706() {
		if (this.anInt3580 > 0 && this.anInt3546 > 0) {
			this.method3067();
			this.method3058();
			this.method3064();
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V")
	private void method3066() {
		if (this.lb != null) {
			this.lb.aBoolean249 = false;
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(Z)Z")
	private boolean method3067() {
		@Pc(13) boolean local13 = !this.lb.aBoolean249;
		@Pc(26) boolean local26 = (this.anInt3573 & 0x37) != 0 && !this.aClass151_1.aBoolean249;
		@Pc(34) boolean local34 = !this.aClass151_2.aBoolean249;
		@Pc(42) boolean local42 = !this.aClass151_3.aBoolean249;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(54) boolean local54 = true;
		@Pc(73) Interface23 local73;
		@Pc(87) Buffer local87;
		if (local34) {
			if (this.aClass151_2.anInterface23_4 == null) {
				this.aClass151_2.anInterface23_4 = this.aClass121_Sub2_9.method7201(this.aBoolean232);
			}
			local73 = this.aClass151_2.anInterface23_4;
			local73.method7571(12, this.anInt3580 * 12);
			local87 = local73.method7569();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass121_Sub2_9.aNativeInterface3.copyPositions(this.anIntArray403, this.anIntArray396, this.anIntArray398, this.aShortArray68, 0, 12, this.anInt3580, local87.getAddress());
				if (local73.method7563()) {
					this.aClass151_2.aBoolean249 = true;
					this.aClass151_2.anInterface23_5 = local73;
				} else {
					local54 = false;
				}
			}
		}
		@Pc(198) short[] local198;
		@Pc(204) short[] local204;
		@Pc(201) short[] local201;
		@Pc(195) byte[] local195;
		if (local13) {
			if (this.lb.anInterface23_4 == null) {
				this.lb.anInterface23_4 = this.aClass121_Sub2_9.method7201(this.aBoolean232);
			}
			local73 = this.lb.anInterface23_4;
			local73.method7571(4, this.anInt3580 * 4);
			local87 = local73.method7569();
			if (local87 == null) {
				local54 = false;
			} else {
				if ((this.anInt3573 & 0x37) == 0) {
					if (this.aClass321_1 == null) {
						local195 = this.aByteArray48;
						local198 = this.aShortArray62;
						local201 = this.aShortArray70;
						local204 = this.aShortArray71;
					} else {
						local195 = this.aClass321_1.aByteArray116;
						local198 = this.aClass321_1.aShortArray142;
						local201 = this.aClass321_1.aShortArray141;
						local204 = this.aClass321_1.aShortArray143;
					}
					this.aClass121_Sub2_9.aNativeInterface3.copyLighting(this.aShortArray63, this.aByteArray47, this.aShortArray72, local198, local204, local201, local195, this.aShort71, this.aShort72, this.aShortArray73, 0, 4, this.anInt3580, local87.getAddress());
				} else {
					this.aClass121_Sub2_9.aNativeInterface3.copyColours(this.aShortArray63, this.aByteArray47, this.aShortArray72, this.aShort71, this.aShortArray73, 0, 4, this.anInt3580, local87.getAddress());
				}
				if (local73.method7563()) {
					this.lb.aBoolean249 = true;
					this.lb.anInterface23_5 = local73;
				} else {
					local54 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass151_1.anInterface23_4 == null) {
				this.aClass151_1.anInterface23_4 = this.aClass121_Sub2_9.method7201(this.aBoolean232);
			}
			local73 = this.aClass151_1.anInterface23_4;
			local73.method7571(12, this.anInt3580 * 12);
			local87 = local73.method7569();
			if (local87 == null) {
				local54 = false;
			} else {
				if (this.aClass321_1 == null) {
					local204 = this.aShortArray71;
					local198 = this.aShortArray62;
					local201 = this.aShortArray70;
					local195 = this.aByteArray48;
				} else {
					local195 = this.aClass321_1.aByteArray116;
					local201 = this.aClass321_1.aShortArray141;
					local204 = this.aClass321_1.aShortArray143;
					local198 = this.aClass321_1.aShortArray142;
				}
				this.aClass121_Sub2_9.aNativeInterface3.copyNormals(local198, local204, local201, local195, 3.0F / (float) this.aShort72, 3.0F / (float) (this.aShort72 / 2 + this.aShort72), 0, 12, this.anInt3580, local87.getAddress());
				if (local73.method7563()) {
					this.aClass151_1.anInterface23_5 = local73;
					this.aClass151_1.aBoolean249 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass151_3.anInterface23_4 == null) {
				this.aClass151_3.anInterface23_4 = this.aClass121_Sub2_9.method7201(this.aBoolean232);
			}
			local73 = this.aClass151_3.anInterface23_4;
			local73.method7571(8, this.anInt3580 * 8);
			local87 = local73.method7569();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass121_Sub2_9.aNativeInterface3.copyTexCoords(this.aFloatArray18, this.aFloatArray17, 0, 8, this.anInt3580, local87.getAddress());
				if (local73.method7563()) {
					this.aClass151_3.aBoolean249 = true;
					this.aClass151_3.anInterface23_5 = local73;
				} else {
					local54 = false;
				}
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!id", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean230) {
			this.method3070();
		}
		return this.anInt3513;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > arg6 && arg6 < arg5 && arg3 > arg6) {
			return false;
		} else if (arg2 < arg6 && arg5 < arg6 && arg3 < arg6) {
			return false;
		} else if (arg7 > arg0 && arg0 < arg4 && arg1 > arg0) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg4 || arg1 >= arg0;
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	private void method3070() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt3544; local23++) {
			@Pc(30) int local30 = this.anIntArray403[local23];
			@Pc(35) int local35 = this.anIntArray396[local23];
			if (local7 > local30) {
				local7 = local30;
			}
			if (local30 > local13) {
				local13 = local30;
			}
			@Pc(50) int local50 = this.anIntArray398[local23];
			if (local15 < local35) {
				local15 = local35;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local17 < local50) {
				local17 = local50;
			}
			if (local50 < local11) {
				local11 = local50;
			}
			@Pc(87) int local87 = local30 * local30 + local50 * local50;
			if (local19 < local87) {
				local19 = local87;
			}
			local87 = local35 * local35 + local30 * local30 + local50 * local50;
			if (local87 > local21) {
				local21 = local87;
			}
		}
		this.anInt3571 = local13;
		this.anInt3550 = local11;
		this.anInt3578 = local17;
		this.anInt3579 = local15;
		this.anInt3531 = local7;
		this.anInt3558 = local9;
		this.anInt3513 = (int) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean230 = true;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class22 method4699(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(21) Class22_Sub3 local21;
		@Pc(17) Class22_Sub3 local17;
		if (arg0 == 1) {
			local21 = this.aClass121_Sub2_9.aClass22_Sub3_26;
			local17 = this.aClass121_Sub2_9.aClass22_Sub3_22;
		} else if (arg0 == 2) {
			local17 = this.aClass121_Sub2_9.aClass22_Sub3_28;
			local21 = this.aClass121_Sub2_9.aClass22_Sub3_30;
		} else if (arg0 == 3) {
			local17 = this.aClass121_Sub2_9.aClass22_Sub3_29;
			local21 = this.aClass121_Sub2_9.aClass22_Sub3_23;
		} else if (arg0 == 4) {
			local21 = this.aClass121_Sub2_9.aClass22_Sub3_24;
			local17 = this.aClass121_Sub2_9.aClass22_Sub3_25;
		} else if (arg0 == 5) {
			local21 = this.aClass121_Sub2_9.aClass22_Sub3_21;
			local17 = this.aClass121_Sub2_9.aClass22_Sub3_27;
		} else {
			local21 = local17 = new Class22_Sub3(this.aClass121_Sub2_9, 0, 0, true, false);
		}
		return this.method3071(arg0 != 0, arg1, local21, local17, arg2);
	}

	@OriginalMember(owner = "client!id", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) Class60 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean230) {
			this.method3070();
		}
		@Pc(16) int local16 = this.anInt3531 + arg4;
		@Pc(22) int local22 = arg4 + this.anInt3571;
		@Pc(27) int local27 = this.anInt3550 + arg6;
		@Pc(32) int local32 = this.anInt3578 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9656 <= arg2.anInt9652 + local22 >> arg2.anInt9654 || local27 < 0 || arg2.anInt9657 <= local32 + arg2.anInt9652 >> arg2.anInt9654)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local22 + arg3.anInt9652 >> arg3.anInt9654 >= arg3.anInt9656 || local27 < 0 || arg3.anInt9657 <= local32 + arg3.anInt9652 >> arg3.anInt9654) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9654;
			local22 = local22 + arg2.anInt9652 - 1 >> arg2.anInt9654;
			local27 >>= arg2.anInt9654;
			local32 = arg2.anInt9652 + local32 - 1 >> arg2.anInt9654;
			if (arg5 == arg2.JA(local16, local27) && arg5 == arg2.JA(local22, local27) && arg2.JA(local16, local32) == arg5 && arg2.JA(local22, local32) == arg5) {
				return;
			}
		}
		@Pc(179) int local179;
		if (arg0 == 1) {
			for (local179 = 0; local179 < this.anInt3544; local179++) {
				this.anIntArray396[local179] -= arg5 - arg2.sa(arg4 + this.anIntArray403[local179], this.anIntArray398[local179] + arg6);
			}
		} else {
			@Pc(229) int local229;
			@Pc(240) int local240;
			if (arg0 == 2) {
				local179 = this.anInt3558;
				if (local179 == 0) {
					return;
				}
				for (local229 = 0; local229 < this.anInt3544; local229++) {
					local240 = (this.anIntArray396[local229] << 16) / local179;
					if (local240 < arg1) {
						this.anIntArray396[local229] += (arg2.sa(arg4 + this.anIntArray403[local229], arg6 + this.anIntArray398[local229]) - arg5) * (-local240 + arg1) / arg1;
					}
				}
			} else {
				@Pc(376) int local376;
				if (arg0 == 3) {
					local179 = (arg1 & 0xFF) * 4;
					local229 = (arg1 >> 8 & 0xFF) * 4;
					local240 = (arg1 >> 16 & 0xFF) << 6;
					local376 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local179 >> 1) < 0 || arg2.anInt9652 + (local179 >> 1) + arg4 >= arg2.anInt9656 << arg2.anInt9654 || arg6 - (local229 >> 1) < 0 || arg2.anInt9657 << arg2.anInt9654 <= (local229 >> 1) + arg6 + arg2.anInt9652) {
						return;
					}
					this.method4696(local179, local376, local229, arg4, local240, arg5, arg6, arg2);
				} else if (arg0 == 4) {
					local179 = this.anInt3579 - this.anInt3558;
					for (local229 = 0; local229 < this.anInt3544; local229++) {
						this.anIntArray396[local229] = local179 + this.anIntArray396[local229] + arg3.sa(this.anIntArray403[local229] - -arg4, this.anIntArray398[local229] + arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local179 = this.anInt3579 - this.anInt3558;
					for (local229 = 0; local229 < this.anInt3544; local229++) {
						local240 = arg4 + this.anIntArray403[local229];
						local376 = arg6 + this.anIntArray398[local229];
						@Pc(381) int local381 = arg2.sa(local240, local376);
						@Pc(386) int local386 = arg3.sa(local240, local376);
						@Pc(390) int local390 = local381 - local386;
						this.anIntArray396[local229] = ((this.anIntArray396[local229] << 8) / local179 * local390 >> 8) - (arg5 - local381);
					}
				}
			}
		}
		this.method3063();
		this.aBoolean230 = false;
	}

	@OriginalMember(owner = "client!id", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass121_Sub2_9.anInterface7_14;
		for (@Pc(11) int local11 = 0; local11 < this.anInt3565; local11++) {
			if (this.aShortArray72[local11] == arg0) {
				this.aShortArray72[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class76 local48 = local9.method5209(arg0 & 0xFFFF);
			local37 = local48.aByte21;
			local35 = local48.aByte23;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(68) Class76 local68 = local9.method5209(arg1 & 0xFFFF);
			local56 = local68.aByte23;
			local58 = local68.aByte21;
		}
		if (!(local58 != local37 | local56 != local35)) {
			return;
		}
		if (this.aClass126Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt3520; local101++) {
				@Pc(108) Class126 local108 = this.aClass126Array1[local101];
				@Pc(113) Class223 local113 = this.aClass223Array1[local101];
				local113.anInt6232 = Static101.anIntArray262[this.aShortArray63[local108.anInt3089] & 0xFFFF] & 0xFFFFFF | local113.anInt6232 & 0xFF000000;
			}
		}
		this.method3066();
	}

	@OriginalMember(owner = "client!id", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static517.anInt8191 = 0;
			Static36.anInt603 = 0;
			Static121.anInt2105 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray46.length) {
					local51 = this.anIntArrayArray46[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray64 == null || (this.aShortArray64[local59] & arg6) != 0) {
							Static36.anInt603 += this.anIntArray403[local59];
							Static121.anInt2105 += this.anIntArray396[local59];
							Static517.anInt8191 += this.anIntArray398[local59];
							local33++;
						}
					}
				}
			}
			if (local33 > 0) {
				Static36.anInt603 = Static36.anInt603 / local33 + arg2;
				Static364.aBoolean435 = true;
				Static121.anInt2105 = arg3 + Static121.anInt2105 / local33;
				Static517.anInt8191 = Static517.anInt8191 / local33 + arg4;
			} else {
				Static121.anInt2105 = arg3;
				Static36.anInt603 = arg2;
				Static517.anInt8191 = arg4;
			}
			return;
		}
		@Pc(243) int[] local243;
		@Pc(245) int local245;
		if (arg0 == 1) {
			if (arg7 != null) {
				local33 = arg4 * arg7[2] + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
				local35 = arg7[5] * arg4 + arg3 * arg7[4] + arg7[3] * arg2 + 8192 >> 14;
				local41 = arg7[8] * arg4 + arg7[6] * arg2 + arg3 * arg7[7] + 8192 >> 14;
				arg4 = local41;
				arg3 = local35;
				arg2 = local33;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray46.length) {
					local243 = this.anIntArrayArray46[local35];
					for (local245 = 0; local245 < local243.length; local245++) {
						local53 = local243[local245];
						if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local53]) != 0) {
							this.anIntArray403[local53] += arg2;
							this.anIntArray396[local53] += arg3;
							this.anIntArray398[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(381) int local381;
		@Pc(399) int local399;
		@Pc(625) int local625;
		@Pc(634) int local634;
		@Pc(647) int local647;
		@Pc(651) int local651;
		@Pc(669) int local669;
		@Pc(990) int local990;
		@Pc(998) int local998;
		@Pc(1154) int local1154;
		@Pc(1179) int local1179;
		@Pc(1183) int local1183;
		@Pc(1191) int local1191;
		@Pc(1196) int local1196;
		@Pc(1200) int local1200;
		@Pc(1204) int local1204;
		@Pc(1206) int local1206;
		@Pc(1337) int[] local1337;
		@Pc(1339) int local1339;
		@Pc(1343) int local1343;
		@Pc(1347) int local1347;
		@Pc(1349) int local1349;
		@Pc(1478) int local1478;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray46.length) {
						local243 = this.anIntArrayArray46[local35];
						for (local245 = 0; local245 < local243.length; local245++) {
							local53 = local243[local245];
							if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local53]) != 0) {
								this.anIntArray403[local53] -= Static36.anInt603;
								this.anIntArray396[local53] -= Static121.anInt2105;
								this.anIntArray398[local53] -= Static517.anInt8191;
								if (arg4 != 0) {
									local59 = Class138.anIntArray392[arg4];
									local381 = Class138.anIntArray393[arg4];
									local399 = this.anIntArray403[local53] * local381 + local59 * this.anIntArray396[local53] + 16383 >> 14;
									this.anIntArray396[local53] = local381 * this.anIntArray396[local53] + 16383 - local59 * this.anIntArray403[local53] >> 14;
									this.anIntArray403[local53] = local399;
								}
								if (arg2 != 0) {
									local59 = Class138.anIntArray392[arg2];
									local381 = Class138.anIntArray393[arg2];
									local399 = this.anIntArray396[local53] * local381 + 16383 - this.anIntArray398[local53] * local59 >> 14;
									this.anIntArray398[local53] = local381 * this.anIntArray398[local53] + this.anIntArray396[local53] * local59 + 16383 >> 14;
									this.anIntArray396[local53] = local399;
								}
								if (arg3 != 0) {
									local59 = Class138.anIntArray392[arg3];
									local381 = Class138.anIntArray393[arg3];
									local399 = local59 * this.anIntArray398[local53] + local381 * this.anIntArray403[local53] + 16383 >> 14;
									this.anIntArray398[local53] = this.anIntArray398[local53] * local381 + 16383 - this.anIntArray403[local53] * local59 >> 14;
									this.anIntArray403[local53] = local399;
								}
								this.anIntArray403[local53] += Static36.anInt603;
								this.anIntArray396[local53] += Static121.anInt2105;
								this.anIntArray398[local53] += Static517.anInt8191;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray46.length) {
							local51 = this.anIntArrayArray46[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local59]) != 0) {
									local381 = this.anIntArray400[local59];
									local399 = this.anIntArray400[local59 + 1];
									for (local625 = local381; local625 < local399; local625++) {
										local634 = this.aShortArray74[local625] - 1;
										if (local634 == -1) {
											break;
										}
										if (arg4 != 0) {
											local647 = Class138.anIntArray392[arg4];
											local651 = Class138.anIntArray393[arg4];
											local669 = local651 * this.aShortArray62[local634] + this.aShortArray71[local634] * local647 + 16383 >> 14;
											this.aShortArray71[local634] = (short) (local651 * this.aShortArray71[local634] + 16383 - this.aShortArray62[local634] * local647 >> 14);
											this.aShortArray62[local634] = (short) local669;
										}
										if (arg2 != 0) {
											local647 = Class138.anIntArray392[arg2];
											local651 = Class138.anIntArray393[arg2];
											local669 = local651 * this.aShortArray71[local634] + 16383 - this.aShortArray70[local634] * local647 >> 14;
											this.aShortArray70[local634] = (short) (local647 * this.aShortArray71[local634] + this.aShortArray70[local634] * local651 + 16383 >> 14);
											this.aShortArray71[local634] = (short) local669;
										}
										if (arg3 != 0) {
											local647 = Class138.anIntArray392[arg3];
											local651 = Class138.anIntArray393[arg3];
											local669 = local651 * this.aShortArray62[local634] + this.aShortArray70[local634] * local647 + 16383 >> 14;
											this.aShortArray70[local634] = (short) (this.aShortArray70[local634] * local651 + 16383 - local647 * this.aShortArray62[local634] >> 14);
											this.aShortArray62[local634] = (short) local669;
										}
									}
								}
							}
						}
					}
					this.method3060();
					return;
				}
			} else {
				local33 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local245 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static364.aBoolean435) {
					local381 = arg7[0] * Static36.anInt603 + arg7[3] * Static121.anInt2105 + Static517.anInt8191 * arg7[6] + 8192 >> 14;
					local399 = Static36.anInt603 * arg7[1] + arg7[4] * Static121.anInt2105 + Static517.anInt8191 * arg7[7] + 8192 >> 14;
					local399 += local53;
					local625 = arg7[8] * Static517.anInt8191 + arg7[5] * Static121.anInt2105 + Static36.anInt603 * arg7[2] + 8192 >> 14;
					local381 += local245;
					Static36.anInt603 = local381;
					Static121.anInt2105 = local399;
					local625 += local59;
					Static364.aBoolean435 = false;
					Static517.anInt8191 = local625;
				}
				@Pc(958) int[] local958 = new int[9];
				local399 = Class138.anIntArray393[arg2];
				local625 = Class138.anIntArray392[arg2];
				local634 = Class138.anIntArray393[arg3];
				local647 = Class138.anIntArray392[arg3];
				local651 = Class138.anIntArray393[arg4];
				local669 = Class138.anIntArray392[arg4];
				local990 = local625 * local651 + 8192 >> 14;
				local998 = local669 * local625 + 8192 >> 14;
				local958[1] = local990 * local647 + local669 * -local634 + 8192 >> 14;
				local958[5] = -local625;
				local958[0] = local634 * local651 + local998 * local647 + 8192 >> 14;
				local958[7] = local634 * local990 + local647 * local669 + 8192 >> 14;
				local958[6] = local634 * local998 + local651 * -local647 + 8192 >> 14;
				local958[2] = local647 * local399 + 8192 >> 14;
				local958[4] = local651 * local399 + 8192 >> 14;
				local958[8] = local634 * local399 + 8192 >> 14;
				local958[3] = local399 * local669 + 8192 >> 14;
				@Pc(1128) int local1128 = local958[2] * -Static517.anInt8191 + local958[0] * -Static36.anInt603 + -Static121.anInt2105 * local958[1] + 8192 >> 14;
				local1154 = local958[4] * -Static121.anInt2105 + local958[3] * -Static36.anInt603 + local958[5] * -Static517.anInt8191 + 8192 >> 14;
				local1179 = local958[8] * -Static517.anInt8191 + local958[6] * -Static36.anInt603 + -Static121.anInt2105 * local958[7] + 8192 >> 14;
				local1183 = Static36.anInt603 + local1128;
				@Pc(1187) int local1187 = Static121.anInt2105 + local1154;
				local1191 = Static517.anInt8191 + local1179;
				@Pc(1194) int[] local1194 = new int[9];
				for (local1196 = 0; local1196 < 3; local1196++) {
					for (local1200 = 0; local1200 < 3; local1200++) {
						local1204 = 0;
						for (local1206 = 0; local1206 < 3; local1206++) {
							local1204 += arg7[local1206 + local1200 * 3] * local958[local1196 * 3 + local1206];
						}
						local1194[local1196 * 3 + local1200] = local1204 + 8192 >> 14;
					}
				}
				local1200 = local59 * local958[2] + local245 * local958[0] + local958[1] * local53 + 8192 >> 14;
				local1204 = local958[4] * local53 + local958[3] * local245 + local958[5] * local59 + 8192 >> 14;
				local1206 = local958[8] * local59 + local958[6] * local245 + local958[7] * local53 + 8192 >> 14;
				local1204 += local1187;
				local1200 += local1183;
				local1206 += local1191;
				local1337 = new int[9];
				for (local1339 = 0; local1339 < 3; local1339++) {
					for (local1343 = 0; local1343 < 3; local1343++) {
						local1347 = 0;
						for (local1349 = 0; local1349 < 3; local1349++) {
							local1347 += local1194[local1349 * 3 + local1343] * arg7[local1339 * 3 + local1349];
						}
						local1337[local1339 * 3 + local1343] = local1347 + 8192 >> 14;
					}
				}
				local1343 = arg7[2] * local1206 + arg7[1] * local1204 + arg7[0] * local1200 + 8192 >> 14;
				local1347 = arg7[3] * local1200 + arg7[4] * local1204 + arg7[5] * local1206 + 8192 >> 14;
				local1349 = arg7[8] * local1206 + arg7[6] * local1200 + arg7[7] * local1204 + 8192 >> 14;
				local1347 += local35;
				local1343 += local33;
				local1349 += local41;
				for (local1478 = 0; local1478 < local8; local1478++) {
					@Pc(1484) int local1484 = arg1[local1478];
					if (local1484 < this.anIntArrayArray46.length) {
						@Pc(1498) int[] local1498 = this.anIntArrayArray46[local1484];
						for (@Pc(1500) int local1500 = 0; local1500 < local1498.length; local1500++) {
							@Pc(1506) int local1506 = local1498[local1500];
							if (this.aShortArray64 == null || (this.aShortArray64[local1506] & arg6) != 0) {
								@Pc(1550) int local1550 = this.anIntArray396[local1506] * local1337[1] + local1337[0] * this.anIntArray403[local1506] + local1337[2] * this.anIntArray398[local1506] + 8192 >> 14;
								@Pc(1583) int local1583 = this.anIntArray403[local1506] * local1337[3] + this.anIntArray396[local1506] * local1337[4] + this.anIntArray398[local1506] * local1337[5] + 8192 >> 14;
								@Pc(1614) int local1614 = this.anIntArray396[local1506] * local1337[7] + local1337[6] * this.anIntArray403[local1506] + local1337[8] * this.anIntArray398[local1506] + 8192 >> 14;
								@Pc(1618) int local1618 = local1550 + local1343;
								@Pc(1622) int local1622 = local1583 + local1347;
								this.anIntArray403[local1506] = local1618;
								@Pc(1631) int local1631 = local1614 + local1349;
								this.anIntArray396[local1506] = local1622;
								this.anIntArray398[local1506] = local1631;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2568) Class223 local2568;
			@Pc(2453) boolean local2453;
			@Pc(2563) Class126 local2563;
			if (arg0 == 5) {
				if (this.anIntArrayArray44 != null) {
					local2453 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray44.length) {
							local51 = this.anIntArrayArray44[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray69 == null || (this.aShortArray69[local59] & arg6) != 0) {
									local381 = (this.aByteArray47[local59] & 0xFF) + (arg2 * 8);
									if (local381 < 0) {
										local381 = 0;
									} else if (local381 > 255) {
										local381 = 255;
									}
									this.aByteArray47[local59] = (byte) local381;
								}
							}
							local2453 |= local51.length > 0;
						}
					}
					if (local2453) {
						if (this.aClass126Array1 != null) {
							for (local41 = 0; local41 < this.anInt3520; local41++) {
								local2563 = this.aClass126Array1[local41];
								local2568 = this.aClass223Array1[local41];
								local2568.anInt6232 = 255 - (this.aByteArray47[local2563.anInt3089] & 0xFF) << 24 | local2568.anInt6232 & 0xFFFFFF;
							}
						}
						this.method3066();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray44 != null) {
					local2453 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray44.length) {
							local51 = this.anIntArrayArray44[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray69 == null || (arg6 & this.aShortArray69[local59]) != 0) {
									local381 = this.aShortArray63[local59] & 0xFFFF;
									local399 = local381 >> 10 & 0x3F;
									local625 = local381 >> 7 & 0x7;
									@Pc(2672) int local2672 = local399 + arg2 & 0x3F;
									local634 = local381 & 0x7F;
									local625 += arg3 / 4;
									local634 += arg4;
									if (local625 < 0) {
										local625 = 0;
									} else if (local625 > 7) {
										local625 = 7;
									}
									if (local634 < 0) {
										local634 = 0;
									} else if (local634 > 127) {
										local634 = 127;
									}
									this.aShortArray63[local59] = (short) (local625 << 7 | local2672 << 10 | local634);
								}
							}
							local2453 |= local51.length > 0;
						}
					}
					if (local2453) {
						if (this.aClass126Array1 != null) {
							for (local41 = 0; local41 < this.anInt3520; local41++) {
								local2563 = this.aClass126Array1[local41];
								local2568 = this.aClass223Array1[local41];
								local2568.anInt6232 = local2568.anInt6232 & 0xFF000000 | Static101.anIntArray262[this.aShortArray63[local2563.anInt3089] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method3066();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray45 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray45.length) {
							local243 = this.anIntArrayArray45[local35];
							for (local245 = 0; local245 < local243.length; local245++) {
								local2568 = this.aClass223Array1[local243[local245]];
								local2568.anInt6228 += arg2;
								local2568.anInt6236 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray45 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray45.length > local35) {
							local243 = this.anIntArrayArray45[local35];
							for (local245 = 0; local245 < local243.length; local245++) {
								local2568 = this.aClass223Array1[local243[local245]];
								local2568.anInt6230 = local2568.anInt6230 * arg2 >> 7;
								local2568.anInt6227 = arg3 * local2568.anInt6227 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray45 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray45.length > local35) {
						local243 = this.anIntArrayArray45[local35];
						for (local245 = 0; local245 < local243.length; local245++) {
							local2568 = this.aClass223Array1[local243[local245]];
							local2568.anInt6231 = local2568.anInt6231 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray46.length) {
					local243 = this.anIntArrayArray46[local35];
					for (local245 = 0; local245 < local243.length; local245++) {
						local53 = local243[local245];
						if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local53]) != 0) {
							this.anIntArray403[local53] -= Static36.anInt603;
							this.anIntArray396[local53] -= Static121.anInt2105;
							this.anIntArray398[local53] -= Static517.anInt8191;
							this.anIntArray403[local53] = this.anIntArray403[local53] * arg2 >> 7;
							this.anIntArray396[local53] = arg3 * this.anIntArray396[local53] >> 7;
							this.anIntArray398[local53] = this.anIntArray398[local53] * arg4 >> 7;
							this.anIntArray403[local53] += Static36.anInt603;
							this.anIntArray396[local53] += Static121.anInt2105;
							this.anIntArray398[local53] += Static517.anInt8191;
						}
					}
				}
			}
		} else {
			local33 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local245 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static364.aBoolean435) {
				local381 = arg7[0] * Static36.anInt603 + Static121.anInt2105 * arg7[3] + Static517.anInt8191 * arg7[6] + 8192 >> 14;
				local399 = Static517.anInt8191 * arg7[7] + Static36.anInt603 * arg7[1] + arg7[4] * Static121.anInt2105 + 8192 >> 14;
				local625 = arg7[5] * Static121.anInt2105 + Static36.anInt603 * arg7[2] + Static517.anInt8191 * arg7[8] + 8192 >> 14;
				local381 += local245;
				local399 += local53;
				Static121.anInt2105 = local399;
				local625 += local59;
				Static36.anInt603 = local381;
				Static517.anInt8191 = local625;
				Static364.aBoolean435 = false;
			}
			local381 = arg2 << 15 >> 7;
			local399 = arg3 << 15 >> 7;
			local625 = arg4 << 15 >> 7;
			local634 = -Static36.anInt603 * local381 + 8192 >> 14;
			local647 = -Static121.anInt2105 * local399 + 8192 >> 14;
			local651 = -Static517.anInt8191 * local625 + 8192 >> 14;
			local669 = local634 + Static36.anInt603;
			local990 = local647 + Static121.anInt2105;
			local998 = Static517.anInt8191 + local651;
			@Pc(1849) int[] local1849 = new int[] { arg7[0] * local381 + 8192 >> 14, local381 * arg7[3] + 8192 >> 14, arg7[6] * local381 + 8192 >> 14, arg7[1] * local399 + 8192 >> 14, arg7[4] * local399 + 8192 >> 14, local399 * arg7[7] + 8192 >> 14, arg7[2] * local625 + 8192 >> 14, local625 * arg7[5] + 8192 >> 14, local625 * arg7[8] + 8192 >> 14 };
			local1154 = local381 * local245 + 8192 >> 14;
			local1179 = local399 * local53 + 8192 >> 14;
			@Pc(1977) int local1977 = local1154 + local669;
			@Pc(1981) int local1981 = local1179 + local990;
			local1183 = local59 * local625 + 8192 >> 14;
			@Pc(1993) int local1993 = local1183 + local998;
			@Pc(1996) int[] local1996 = new int[9];
			@Pc(2002) int local2002;
			for (local1191 = 0; local1191 < 3; local1191++) {
				for (local2002 = 0; local2002 < 3; local2002++) {
					local1196 = 0;
					for (local1200 = 0; local1200 < 3; local1200++) {
						local1196 += local1849[local2002 + local1200 * 3] * arg7[local1200 + local1191 * 3];
					}
					local1996[local2002 + local1191 * 3] = local1196 + 8192 >> 14;
				}
			}
			local2002 = local1981 * arg7[1] + arg7[0] * local1977 + arg7[2] * local1993 + 8192 >> 14;
			local1196 = local1993 * arg7[5] + arg7[4] * local1981 + local1977 * arg7[3] + 8192 >> 14;
			local1200 = local1977 * arg7[6] + local1981 * arg7[7] + arg7[8] * local1993 + 8192 >> 14;
			local2002 += local33;
			local1196 += local35;
			local1200 += local41;
			for (local1204 = 0; local1204 < local8; local1204++) {
				local1206 = arg1[local1204];
				if (local1206 < this.anIntArrayArray46.length) {
					local1337 = this.anIntArrayArray46[local1206];
					for (local1339 = 0; local1339 < local1337.length; local1339++) {
						local1343 = local1337[local1339];
						if (this.aShortArray64 == null || (this.aShortArray64[local1343] & arg6) != 0) {
							local1347 = local1996[2] * this.anIntArray398[local1343] + local1996[1] * this.anIntArray396[local1343] + this.anIntArray403[local1343] * local1996[0] + 8192 >> 14;
							local1349 = this.anIntArray403[local1343] * local1996[3] + local1996[4] * this.anIntArray396[local1343] + local1996[5] * this.anIntArray398[local1343] + 8192 >> 14;
							@Pc(2236) int local2236 = local1349 + local1196;
							@Pc(2240) int local2240 = local1347 + local2002;
							local1478 = this.anIntArray398[local1343] * local1996[8] + this.anIntArray403[local1343] * local1996[6] + local1996[7] * this.anIntArray396[local1343] + 8192 >> 14;
							@Pc(2275) int local2275 = local1478 + local1200;
							this.anIntArray403[local1343] = local2240;
							this.anIntArray396[local1343] = local2236;
							this.anIntArray398[local1343] = local2275;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static36.anInt603 = 0;
			Static517.anInt8191 = 0;
			local16 = 0;
			Static121.anInt2105 = 0;
			for (local20 = 0; local20 < this.anInt3544; local20++) {
				Static36.anInt603 += this.anIntArray403[local20];
				Static121.anInt2105 += this.anIntArray396[local20];
				local16++;
				Static517.anInt8191 += this.anIntArray398[local20];
			}
			if (local16 <= 0) {
				Static121.anInt2105 = arg2;
				Static517.anInt8191 = arg3;
				Static36.anInt603 = arg1;
			} else {
				Static36.anInt603 = arg1 + Static36.anInt603 / local16;
				Static121.anInt2105 = Static121.anInt2105 / local16 + arg2;
				Static517.anInt8191 = Static517.anInt8191 / local16 + arg3;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt3544; local16++) {
				this.anIntArray403[local16] += arg1;
				this.anIntArray396[local16] += arg2;
				this.anIntArray398[local16] += arg3;
			}
		} else {
			@Pc(171) int local171;
			@Pc(189) int local189;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt3544; local16++) {
					this.anIntArray403[local16] -= Static36.anInt603;
					this.anIntArray396[local16] -= Static121.anInt2105;
					this.anIntArray398[local16] -= Static517.anInt8191;
					if (arg3 != 0) {
						local20 = Class138.anIntArray392[arg3];
						local171 = Class138.anIntArray393[arg3];
						local189 = this.anIntArray403[local16] * local171 + this.anIntArray396[local16] * local20 + 16383 >> 14;
						this.anIntArray396[local16] = this.anIntArray396[local16] * local171 + 16383 - this.anIntArray403[local16] * local20 >> 14;
						this.anIntArray403[local16] = local189;
					}
					if (arg1 != 0) {
						local20 = Class138.anIntArray392[arg1];
						local171 = Class138.anIntArray393[arg1];
						local189 = this.anIntArray396[local16] * local171 + 16383 - local20 * this.anIntArray398[local16] >> 14;
						this.anIntArray398[local16] = this.anIntArray396[local16] * local20 + this.anIntArray398[local16] * local171 + 16383 >> 14;
						this.anIntArray396[local16] = local189;
					}
					if (arg2 != 0) {
						local20 = Class138.anIntArray392[arg2];
						local171 = Class138.anIntArray393[arg2];
						local189 = local20 * this.anIntArray398[local16] + local171 * this.anIntArray403[local16] + 16383 >> 14;
						this.anIntArray398[local16] = this.anIntArray398[local16] * local171 + 16383 - local20 * this.anIntArray403[local16] >> 14;
						this.anIntArray403[local16] = local189;
					}
					this.anIntArray403[local16] += Static36.anInt603;
					this.anIntArray396[local16] += Static121.anInt2105;
					this.anIntArray398[local16] += Static517.anInt8191;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt3544; local16++) {
					this.anIntArray403[local16] -= Static36.anInt603;
					this.anIntArray396[local16] -= Static121.anInt2105;
					this.anIntArray398[local16] -= Static517.anInt8191;
					this.anIntArray403[local16] = arg1 * this.anIntArray403[local16] / 128;
					this.anIntArray396[local16] = arg2 * this.anIntArray396[local16] / 128;
					this.anIntArray398[local16] = this.anIntArray398[local16] * arg3 / 128;
					this.anIntArray403[local16] += Static36.anInt603;
					this.anIntArray396[local16] += Static121.anInt2105;
					this.anIntArray398[local16] += Static517.anInt8191;
				}
			} else {
				@Pc(516) Class126 local516;
				@Pc(521) Class223 local521;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt3565; local16++) {
						local20 = (this.aByteArray47[local16] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray47[local16] = (byte) local20;
					}
					if (this.aClass126Array1 != null) {
						for (local20 = 0; local20 < this.anInt3520; local20++) {
							local516 = this.aClass126Array1[local20];
							local521 = this.aClass223Array1[local20];
							local521.anInt6232 = 255 - (this.aByteArray47[local516.anInt3089] & 0xFF) << 24 | local521.anInt6232 & 0xFFFFFF;
						}
					}
					this.method3066();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt3565; local16++) {
						local20 = this.aShortArray63[local16] & 0xFFFF;
						local171 = local20 >> 10 & 0x3F;
						local189 = local20 >> 7 & 0x7;
						@Pc(582) int local582 = arg1 + local171 & 0x3F;
						@Pc(586) int local586 = local20 & 0x7F;
						local189 += arg2 / 4;
						local586 += arg3;
						if (local189 < 0) {
							local189 = 0;
						} else if (local189 > 7) {
							local189 = 7;
						}
						if (local586 < 0) {
							local586 = 0;
						} else if (local586 > 127) {
							local586 = 127;
						}
						this.aShortArray63[local16] = (short) (local582 << 10 | local189 << 7 | local586);
					}
					if (this.aClass126Array1 != null) {
						for (local20 = 0; local20 < this.anInt3520; local20++) {
							local516 = this.aClass126Array1[local20];
							local521 = this.aClass223Array1[local20];
							local521.anInt6232 = local521.anInt6232 & 0xFF000000 | Static101.anIntArray262[this.aShortArray63[local516.anInt3089] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method3066();
				} else {
					@Pc(695) Class223 local695;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt3520; local16++) {
							local695 = this.aClass223Array1[local16];
							local695.anInt6236 += arg2;
							local695.anInt6228 += arg1;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt3520; local16++) {
							local695 = this.aClass223Array1[local16];
							local695.anInt6227 = local695.anInt6227 * arg2 >> 7;
							local695.anInt6230 = local695.anInt6230 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt3520; local16++) {
							local695 = this.aClass223Array1[local16];
							local695.anInt6231 = local695.anInt6231 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZILclient!id;Lclient!id;BZ)Lclient!ba;")
	private Class22 method3071(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22_Sub3 arg2, @OriginalArg(3) Class22_Sub3 arg3, @OriginalArg(5) boolean arg4) {
		arg2.anInt3544 = this.anInt3544;
		arg2.anInt3543 = this.anInt3543;
		arg2.anInt3565 = this.anInt3565;
		arg2.anInt3548 = arg1;
		arg2.anInt3580 = this.anInt3580;
		arg2.aShort71 = this.aShort71;
		arg2.aShort72 = this.aShort72;
		arg2.anInt3573 = this.anInt3573;
		arg2.anInt3546 = this.anInt3546;
		arg2.anInt3520 = this.anInt3520;
		@Pc(55) boolean local55 = Static272.method3839(arg1, this.anInt3573);
		@Pc(61) boolean local61 = Static199.method2983(arg1, this.anInt3573);
		@Pc(67) boolean local67 = Static305.method4677(arg1, this.anInt3573);
		@Pc(73) boolean local73 = local67 | local55 | local61;
		@Pc(192) int local192;
		if (local73) {
			if (!local55) {
				arg2.anIntArray403 = this.anIntArray403;
			} else if (arg3.anIntArray403 == null || arg3.anIntArray403.length < this.anInt3543) {
				arg2.anIntArray403 = arg3.anIntArray403 = new int[this.anInt3543];
			} else {
				arg2.anIntArray403 = arg3.anIntArray403;
			}
			if (!local61) {
				arg2.anIntArray396 = this.anIntArray396;
			} else if (arg3.anIntArray396 == null || arg3.anIntArray396.length < this.anInt3543) {
				arg2.anIntArray396 = arg3.anIntArray396 = new int[this.anInt3543];
			} else {
				arg2.anIntArray396 = arg3.anIntArray396;
			}
			if (!local67) {
				arg2.anIntArray398 = this.anIntArray398;
			} else if (arg3.anIntArray398 == null || this.anInt3543 > arg3.anIntArray398.length) {
				arg2.anIntArray398 = arg3.anIntArray398 = new int[this.anInt3543];
			} else {
				arg2.anIntArray398 = arg3.anIntArray398;
			}
			for (local192 = 0; local192 < this.anInt3543; local192++) {
				if (local55) {
					arg2.anIntArray403[local192] = this.anIntArray403[local192];
				}
				if (local61) {
					arg2.anIntArray396[local192] = this.anIntArray396[local192];
				}
				if (local67) {
					arg2.anIntArray398[local192] = this.anIntArray398[local192];
				}
			}
		} else {
			arg2.anIntArray396 = this.anIntArray396;
			arg2.anIntArray403 = this.anIntArray403;
			arg2.anIntArray398 = this.anIntArray398;
		}
		if (Static123.method1856(arg1, this.anInt3573)) {
			arg2.aClass151_2 = arg3.aClass151_2;
			arg2.aClass151_2.anInterface23_5 = this.aClass151_2.anInterface23_5;
			arg2.aClass151_2.aBoolean249 = this.aClass151_2.aBoolean249;
			arg2.aClass151_2.aBoolean248 = true;
		} else if (Static300.method4186(arg1, this.anInt3573)) {
			arg2.aClass151_2 = this.aClass151_2;
		} else {
			arg2.aClass151_2 = null;
		}
		if (Static533.method7407(this.anInt3573, arg1)) {
			if (arg3.aShortArray63 == null || this.anInt3565 > arg3.aShortArray63.length) {
				arg2.aShortArray63 = arg3.aShortArray63 = new short[this.anInt3565];
			} else {
				arg2.aShortArray63 = arg3.aShortArray63;
			}
			for (local192 = 0; local192 < this.anInt3565; local192++) {
				arg2.aShortArray63[local192] = this.aShortArray63[local192];
			}
		} else {
			arg2.aShortArray63 = this.aShortArray63;
		}
		if (Static204.method3009(arg1, this.anInt3573)) {
			if (arg3.aByteArray47 == null || this.anInt3565 > arg3.aByteArray47.length) {
				arg2.aByteArray47 = arg3.aByteArray47 = new byte[this.anInt3565];
			} else {
				arg2.aByteArray47 = arg3.aByteArray47;
			}
			for (local192 = 0; local192 < this.anInt3565; local192++) {
				arg2.aByteArray47[local192] = this.aByteArray47[local192];
			}
		} else {
			arg2.aByteArray47 = this.aByteArray47;
		}
		if (Static85.method1344(this.anInt3573, arg1)) {
			arg2.lb = arg3.lb;
			arg2.lb.anInterface23_5 = this.lb.anInterface23_5;
			arg2.lb.aBoolean249 = this.lb.aBoolean249;
			arg2.lb.aBoolean248 = true;
		} else if (Static573.method7837(this.anInt3573, arg1)) {
			arg2.lb = this.lb;
		} else {
			arg2.lb = null;
		}
		@Pc(539) int local539;
		if (Static340.method5138(arg1, this.anInt3573)) {
			if (arg3.aShortArray62 == null || arg3.aShortArray62.length < this.anInt3580) {
				local192 = this.anInt3580;
				arg2.aShortArray70 = arg3.aShortArray70 = new short[local192];
				arg2.aShortArray62 = arg3.aShortArray62 = new short[local192];
				arg2.aShortArray71 = arg3.aShortArray71 = new short[local192];
			} else {
				arg2.aShortArray71 = arg3.aShortArray71;
				arg2.aShortArray70 = arg3.aShortArray70;
				arg2.aShortArray62 = arg3.aShortArray62;
			}
			if (this.aClass321_1 == null) {
				arg2.aClass321_1 = null;
				for (local192 = 0; local192 < this.anInt3580; local192++) {
					arg2.aShortArray62[local192] = this.aShortArray62[local192];
					arg2.aShortArray71[local192] = this.aShortArray71[local192];
					arg2.aShortArray70[local192] = this.aShortArray70[local192];
				}
			} else {
				if (arg3.aClass321_1 == null) {
					arg3.aClass321_1 = new Class321();
				}
				@Pc(527) Class321 local527 = arg2.aClass321_1 = arg3.aClass321_1;
				if (local527.aShortArray142 == null || this.anInt3580 > local527.aShortArray142.length) {
					local539 = this.anInt3580;
					local527.aShortArray143 = new short[local539];
					local527.aByteArray116 = new byte[local539];
					local527.aShortArray142 = new short[local539];
					local527.aShortArray141 = new short[local539];
				}
				for (local539 = 0; local539 < this.anInt3580; local539++) {
					arg2.aShortArray62[local539] = this.aShortArray62[local539];
					arg2.aShortArray71[local539] = this.aShortArray71[local539];
					arg2.aShortArray70[local539] = this.aShortArray70[local539];
					local527.aShortArray142[local539] = this.aClass321_1.aShortArray142[local539];
					local527.aShortArray143[local539] = this.aClass321_1.aShortArray143[local539];
					local527.aShortArray141[local539] = this.aClass321_1.aShortArray141[local539];
					local527.aByteArray116[local539] = this.aClass321_1.aByteArray116[local539];
				}
			}
			arg2.aByteArray48 = this.aByteArray48;
		} else {
			arg2.aShortArray62 = this.aShortArray62;
			arg2.aByteArray48 = this.aByteArray48;
			arg2.aClass321_1 = this.aClass321_1;
			arg2.aShortArray70 = this.aShortArray70;
			arg2.aShortArray71 = this.aShortArray71;
		}
		if (Static224.method3265(this.anInt3573, arg1)) {
			arg2.aClass151_1 = arg3.aClass151_1;
			arg2.aClass151_1.anInterface23_5 = this.aClass151_1.anInterface23_5;
			arg2.aClass151_1.aBoolean249 = this.aClass151_1.aBoolean249;
			arg2.aClass151_1.aBoolean248 = true;
		} else if (Static398.method5865(this.anInt3573, arg1)) {
			arg2.aClass151_1 = this.aClass151_1;
		} else {
			arg2.aClass151_1 = null;
		}
		if (Static137.method2057(arg1, this.anInt3573)) {
			if (arg3.aFloatArray18 == null || this.anInt3565 > arg3.aFloatArray18.length) {
				local192 = this.anInt3580;
				arg2.aFloatArray17 = arg3.aFloatArray17 = new float[local192];
				arg2.aFloatArray18 = arg3.aFloatArray18 = new float[local192];
			} else {
				arg2.aFloatArray18 = arg3.aFloatArray18;
				arg2.aFloatArray17 = arg3.aFloatArray17;
			}
			for (local192 = 0; local192 < this.anInt3580; local192++) {
				arg2.aFloatArray18[local192] = this.aFloatArray18[local192];
				arg2.aFloatArray17[local192] = this.aFloatArray17[local192];
			}
		} else {
			arg2.aFloatArray18 = this.aFloatArray18;
			arg2.aFloatArray17 = this.aFloatArray17;
		}
		if (Static477.method7208(this.anInt3573, arg1)) {
			arg2.aClass151_3 = arg3.aClass151_3;
			arg2.aClass151_3.aBoolean249 = this.aClass151_3.aBoolean249;
			arg2.aClass151_3.aBoolean248 = true;
			arg2.aClass151_3.anInterface23_5 = this.aClass151_3.anInterface23_5;
		} else if (Static392.method5806(this.anInt3573, arg1)) {
			arg2.aClass151_3 = this.aClass151_3;
		} else {
			arg2.aClass151_3 = null;
		}
		if (Static112.method1760(this.anInt3573, arg1)) {
			if (arg3.aShortArray65 == null || this.anInt3565 > arg3.aShortArray65.length) {
				local192 = this.anInt3565;
				arg2.aShortArray65 = arg3.aShortArray65 = new short[local192];
				arg2.aShortArray67 = arg3.aShortArray67 = new short[local192];
				arg2.aShortArray66 = arg3.aShortArray66 = new short[local192];
			} else {
				arg2.aShortArray66 = arg3.aShortArray66;
				arg2.aShortArray67 = arg3.aShortArray67;
				arg2.aShortArray65 = arg3.aShortArray65;
			}
			for (local192 = 0; local192 < this.anInt3565; local192++) {
				arg2.aShortArray65[local192] = this.aShortArray65[local192];
				arg2.aShortArray66[local192] = this.aShortArray66[local192];
				arg2.aShortArray67[local192] = this.aShortArray67[local192];
			}
		} else {
			arg2.aShortArray66 = this.aShortArray66;
			arg2.aShortArray65 = this.aShortArray65;
			arg2.aShortArray67 = this.aShortArray67;
		}
		if (Static318.method4937(this.anInt3573, arg1)) {
			arg2.aClass32_1 = arg3.aClass32_1;
			arg2.aClass32_1.aBoolean25 = true;
			arg2.aClass32_1.aBoolean24 = this.aClass32_1.aBoolean24;
			arg2.aClass32_1.anInterface11_2 = this.aClass32_1.anInterface11_2;
		} else if (Static345.method5205(this.anInt3573, arg1)) {
			arg2.aClass32_1 = this.aClass32_1;
		} else {
			arg2.aClass32_1 = null;
		}
		if (Static377.method5519(arg1, this.anInt3573)) {
			if (arg3.aShortArray72 == null || arg3.aShortArray72.length < this.anInt3565) {
				local192 = this.anInt3565;
				arg2.aShortArray72 = arg3.aShortArray72 = new short[local192];
			} else {
				arg2.aShortArray72 = arg3.aShortArray72;
			}
			for (local192 = 0; local192 < this.anInt3565; local192++) {
				arg2.aShortArray72[local192] = this.aShortArray72[local192];
			}
		} else {
			arg2.aShortArray72 = this.aShortArray72;
		}
		if (!Static4.method70(this.anInt3573, arg1)) {
			arg2.aClass223Array1 = this.aClass223Array1;
		} else if (arg3.aClass223Array1 == null || this.anInt3520 > arg3.aClass223Array1.length) {
			local192 = this.anInt3520;
			arg2.aClass223Array1 = arg3.aClass223Array1 = new Class223[local192];
			for (local539 = 0; local539 < this.anInt3520; local539++) {
				arg2.aClass223Array1[local539] = this.aClass223Array1[local539].method5296();
			}
		} else {
			arg2.aClass223Array1 = arg3.aClass223Array1;
			for (local192 = 0; local192 < this.anInt3520; local192++) {
				arg2.aClass223Array1[local192].method5294(this.aClass223Array1[local192]);
			}
		}
		arg2.anIntArray399 = this.anIntArray399;
		arg2.anIntArray397 = this.anIntArray397;
		arg2.anIntArrayArray44 = this.anIntArrayArray44;
		if (this.aBoolean230) {
			arg2.aBoolean230 = true;
			arg2.anInt3531 = this.anInt3531;
			arg2.anInt3579 = this.anInt3579;
			arg2.anInt3550 = this.anInt3550;
			arg2.anInt3558 = this.anInt3558;
			arg2.anInt3571 = this.anInt3571;
			arg2.anInt3578 = this.anInt3578;
			arg2.anInt3513 = this.anInt3513;
		} else {
			arg2.aBoolean230 = false;
		}
		arg2.aClass126Array1 = this.aClass126Array1;
		arg2.aClass250Array4 = this.aClass250Array4;
		arg2.anIntArray400 = this.anIntArray400;
		arg2.anIntArrayArray46 = this.anIntArrayArray46;
		arg2.aShortArray64 = this.aShortArray64;
		arg2.anIntArrayArray45 = this.anIntArrayArray45;
		arg2.aShortArray73 = this.aShortArray73;
		arg2.aClass163Array4 = this.aClass163Array4;
		arg2.aShortArray74 = this.aShortArray74;
		arg2.aShortArray69 = this.aShortArray69;
		arg2.aShortArray68 = this.aShortArray68;
		arg2.anIntArray401 = this.anIntArray401;
		return arg2;
	}

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3543; local3++) {
			this.anIntArray403[local3] = this.anIntArray403[local3] + 7 >> 4;
			this.anIntArray396[local3] = this.anIntArray396[local3] + 7 >> 4;
			this.anIntArray398[local3] = this.anIntArray398[local3] + 7 >> 4;
		}
		this.method3063();
		this.aBoolean230 = false;
	}

	@OriginalMember(owner = "client!id", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort72;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3565; local7++) {
			local16 = this.aShortArray63[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local22 -= -((arg0 - local22) * arg3 >> 7);
			}
			@Pc(60) int local60 = local16 & 0x7F;
			if (arg2 != -1) {
				local60 += (arg2 - local60) * arg3 >> 7;
			}
			this.aShortArray63[local7] = (short) (local22 << 10 | local28 << 7 | local60);
		}
		if (this.aClass126Array1 != null) {
			for (local16 = 0; local16 < this.anInt3520; local16++) {
				@Pc(108) Class126 local108 = this.aClass126Array1[local16];
				@Pc(113) Class223 local113 = this.aClass223Array1[local16];
				local113.anInt6232 = local113.anInt6232 & 0xFF000000 | Static101.anIntArray262[this.aShortArray63[local108.anInt3089] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3066();
	}

	@OriginalMember(owner = "client!id", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class6_Sub1_Sub12 Z(@OriginalArg(0) Class6_Sub1_Sub12 arg0) {
		if (this.anInt3580 == 0) {
			return null;
		}
		if (!this.aBoolean230) {
			this.method3070();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass121_Sub2_9.anInt8911 <= 0) {
			local40 = this.anInt3531 - (this.anInt3558 * this.aClass121_Sub2_9.anInt8911 >> 8) >> this.aClass121_Sub2_9.anInt8912;
			local57 = this.anInt3571 - (this.anInt3579 * this.aClass121_Sub2_9.anInt8911 >> 8) >> this.aClass121_Sub2_9.anInt8912;
		} else {
			local40 = this.anInt3531 - (this.aClass121_Sub2_9.anInt8911 * this.anInt3579 >> 8) >> this.aClass121_Sub2_9.anInt8912;
			local57 = this.anInt3571 - (this.aClass121_Sub2_9.anInt8911 * this.anInt3558 >> 8) >> this.aClass121_Sub2_9.anInt8912;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass121_Sub2_9.anInt8921 > 0) {
			local114 = this.anInt3550 - (this.aClass121_Sub2_9.anInt8921 * this.anInt3579 >> 8) >> this.aClass121_Sub2_9.anInt8912;
			local131 = this.anInt3578 - (this.aClass121_Sub2_9.anInt8921 * this.anInt3558 >> 8) >> this.aClass121_Sub2_9.anInt8912;
		} else {
			local114 = this.anInt3550 - (this.aClass121_Sub2_9.anInt8921 * this.anInt3558 >> 8) >> this.aClass121_Sub2_9.anInt8912;
			local131 = this.anInt3578 - (this.anInt3579 * this.aClass121_Sub2_9.anInt8921 >> 8) >> this.aClass121_Sub2_9.anInt8912;
		}
		@Pc(173) int local173 = local57 + 1 - local40;
		@Pc(180) int local180 = local131 + 1 - local114;
		@Pc(183) Class6_Sub1_Sub12_Sub1 local183 = (Class6_Sub1_Sub12_Sub1) arg0;
		@Pc(193) Class6_Sub1_Sub12_Sub1 local193;
		if (local183 != null && local183.method4890(local180, local173)) {
			local193 = local183;
			local183.method4891();
		} else {
			local193 = new Class6_Sub1_Sub12_Sub1(this.aClass121_Sub2_9, local173, local180);
		}
		local193.method4892(local114, local40, local131, local57);
		this.method3059(local193);
		return local193;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!q;Lclient!qn;I)V")
	@Override
	public void method4689(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class102_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3580 == 0) {
			return;
		}
		@Pc(13) Class34_Sub3 local13 = this.aClass121_Sub2_9.aClass34_Sub3_16;
		if (!this.aBoolean230) {
			this.method3070();
		}
		@Pc(22) Class34_Sub3 local22 = (Class34_Sub3) arg0;
		Static300.aFloat88 = local13.aFloat74 + local22.aFloat73 * local13.aFloat75 + local13.aFloat69 * local22.aFloat70 + local13.aFloat76 * local22.aFloat74;
		Static319.aFloat130 = local22.aFloat69 * local13.aFloat76 + local22.aFloat80 * local13.aFloat75 + local22.aFloat78 * local13.aFloat69;
		@Pc(69) float local69 = Static319.aFloat130 * (float) this.anInt3558 + Static300.aFloat88;
		@Pc(77) float local77 = Static300.aFloat88 + (float) this.anInt3579 * Static319.aFloat130;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local69 > local77) {
			local87 = local77 - (float) this.anInt3513;
			local93 = local69 + (float) this.anInt3513;
		} else {
			local87 = local69 - (float) this.anInt3513;
			local93 = (float) this.anInt3513 + local77;
		}
		if (local87 >= this.aClass121_Sub2_9.aFloat197 || (float) this.aClass121_Sub2_9.anInt8893 >= local93) {
			return;
		}
		Static460.aFloat173 = local22.aFloat78 * local13.aFloat80 + local22.aFloat80 * local13.aFloat77 + local13.aFloat71 * local22.aFloat69;
		Static249.aFloat58 = local13.aFloat73 + local13.aFloat77 * local22.aFloat73 + local13.aFloat80 * local22.aFloat70 + local22.aFloat74 * local13.aFloat71;
		@Pc(169) float local169 = Static249.aFloat58 + (float) this.anInt3558 * Static460.aFloat173;
		@Pc(177) float local177 = (float) this.anInt3579 * Static460.aFloat173 + Static249.aFloat58;
		@Pc(203) float local203;
		@Pc(192) float local192;
		if (local177 < local169) {
			local192 = (float) this.aClass121_Sub2_9.anInt8904 * ((float) this.anInt3513 + local169);
			local203 = (float) this.aClass121_Sub2_9.anInt8904 * (local177 - (float) this.anInt3513);
		} else {
			local192 = (local177 + (float) this.anInt3513) * (float) this.aClass121_Sub2_9.anInt8904;
			local203 = (float) this.aClass121_Sub2_9.anInt8904 * (local169 - (float) this.anInt3513);
		}
		if (this.aClass121_Sub2_9.aFloat196 <= local203 / local93 || this.aClass121_Sub2_9.aFloat184 >= local192 / local93) {
			return;
		}
		Static215.aFloat51 = local13.aFloat81 * local22.aFloat73 + local22.aFloat70 * local13.aFloat78 + local22.aFloat74 * local13.aFloat72 + local13.aFloat70;
		Static265.aFloat79 = local13.aFloat78 * local22.aFloat78 + local22.aFloat80 * local13.aFloat81 + local22.aFloat69 * local13.aFloat72;
		@Pc(292) float local292 = Static215.aFloat51 + (float) this.anInt3558 * Static265.aFloat79;
		@Pc(300) float local300 = (float) this.anInt3579 * Static265.aFloat79 + Static215.aFloat51;
		@Pc(315) float local315;
		@Pc(326) float local326;
		if (local300 < local292) {
			local315 = (local300 - (float) this.anInt3513) * (float) this.aClass121_Sub2_9.anInt8892;
			local326 = (float) this.aClass121_Sub2_9.anInt8892 * (local292 + (float) this.anInt3513);
		} else {
			local315 = (float) this.aClass121_Sub2_9.anInt8892 * ((float) -this.anInt3513 + local292);
			local326 = (float) this.aClass121_Sub2_9.anInt8892 * ((float) this.anInt3513 + local300);
		}
		if (local315 / local93 >= this.aClass121_Sub2_9.aFloat187 || local326 / local93 <= this.aClass121_Sub2_9.aFloat193) {
			return;
		}
		if (arg1 != null || this.aClass126Array1 != null) {
			Static9.aFloat4 = local22.aFloat75 * local13.aFloat72 + local13.aFloat81 * local22.aFloat77 + local22.aFloat81 * local13.aFloat78;
			Static414.aFloat168 = local22.aFloat77 * local13.aFloat75 + local13.aFloat69 * local22.aFloat81 + local13.aFloat76 * local22.aFloat75;
			Static164.aFloat39 = local13.aFloat71 * local22.aFloat76 + local13.aFloat80 * local22.aFloat72 + local22.aFloat71 * local13.aFloat77;
			Static222.aFloat53 = local22.aFloat75 * local13.aFloat71 + local13.aFloat77 * local22.aFloat77 + local22.aFloat81 * local13.aFloat80;
			Static517.aFloat175 = local13.aFloat76 * local22.aFloat76 + local22.aFloat71 * local13.aFloat75 + local13.aFloat69 * local22.aFloat72;
			Static260.aFloat67 = local22.aFloat72 * local13.aFloat78 + local22.aFloat71 * local13.aFloat81 + local22.aFloat76 * local13.aFloat72;
		}
		if (arg1 != null) {
			@Pc(486) boolean local486 = false;
			@Pc(488) boolean local488 = true;
			@Pc(497) int local497 = this.anInt3531 + this.anInt3571 >> 1;
			@Pc(506) int local506 = this.anInt3550 + this.anInt3578 >> 1;
			@Pc(525) int local525 = (int) ((float) local506 * Static164.aFloat39 + (float) this.anInt3558 * Static460.aFloat173 + Static249.aFloat58 + (float) local497 * Static222.aFloat53);
			@Pc(544) int local544 = (int) (Static265.aFloat79 * (float) this.anInt3558 + Static215.aFloat51 + (float) local497 * Static9.aFloat4 + Static260.aFloat67 * (float) local506);
			@Pc(563) int local563 = (int) (Static300.aFloat88 + (float) local497 * Static414.aFloat168 + (float) this.anInt3558 * Static319.aFloat130 + Static517.aFloat175 * (float) local506);
			if (this.aClass121_Sub2_9.anInt8893 > local563) {
				local486 = true;
			} else {
				arg1.anInt7450 = this.aClass121_Sub2_9.anInt8904 * local525 / local563 + this.aClass121_Sub2_9.anInt8915;
				arg1.anInt7449 = local544 * this.aClass121_Sub2_9.anInt8892 / local563 + this.aClass121_Sub2_9.anInt8908;
			}
			@Pc(617) int local617 = (int) ((float) this.anInt3579 * Static460.aFloat173 + Static222.aFloat53 * (float) local497 + Static249.aFloat58 + Static164.aFloat39 * (float) local506);
			@Pc(636) int local636 = (int) ((float) this.anInt3579 * Static265.aFloat79 + Static215.aFloat51 + Static9.aFloat4 * (float) local497 + Static260.aFloat67 * (float) local506);
			@Pc(655) int local655 = (int) (Static517.aFloat175 * (float) local506 + Static300.aFloat88 + (float) local497 * Static414.aFloat168 + (float) this.anInt3579 * Static319.aFloat130);
			if (local655 >= this.aClass121_Sub2_9.anInt8893) {
				arg1.anInt7452 = this.aClass121_Sub2_9.anInt8915 + this.aClass121_Sub2_9.anInt8904 * local617 / local655;
				arg1.anInt7448 = local636 * this.aClass121_Sub2_9.anInt8892 / local655 + this.aClass121_Sub2_9.anInt8908;
			} else {
				local486 = true;
			}
			if (local486) {
				if (this.aClass121_Sub2_9.anInt8893 > local563 && this.aClass121_Sub2_9.anInt8893 > local655) {
					local488 = false;
				} else {
					@Pc(738) int local738;
					@Pc(749) int local749;
					@Pc(776) int local776;
					if (this.aClass121_Sub2_9.anInt8893 > local563) {
						local738 = (local655 - this.aClass121_Sub2_9.anInt8893 << 16) / (local655 - local563);
						local749 = (local738 * (local617 - local525) >> 16) + local617;
						local776 = local636 + ((local636 - local544) * local738 >> 16);
						arg1.anInt7450 = this.aClass121_Sub2_9.anInt8915 + local749 * this.aClass121_Sub2_9.anInt8904 / this.aClass121_Sub2_9.anInt8893;
						arg1.anInt7449 = this.aClass121_Sub2_9.anInt8892 * local776 / this.aClass121_Sub2_9.anInt8893 + this.aClass121_Sub2_9.anInt8908;
					} else if (local655 < this.aClass121_Sub2_9.anInt8893) {
						local738 = (local563 - this.aClass121_Sub2_9.anInt8893 << 16) / (local563 - local655);
						local749 = local525 + ((local525 - local617) * local738 >> 16);
						arg1.anInt7450 = this.aClass121_Sub2_9.anInt8915 + this.aClass121_Sub2_9.anInt8904 * local749 / this.aClass121_Sub2_9.anInt8893;
						local776 = local544 + ((local544 - local636) * local738 >> 16);
						arg1.anInt7449 = this.aClass121_Sub2_9.anInt8908 + local776 * this.aClass121_Sub2_9.anInt8892 / this.aClass121_Sub2_9.anInt8893;
					}
				}
			}
			if (local488) {
				arg1.aBoolean515 = true;
				if (local655 >= local563) {
					arg1.anInt7451 = this.aClass121_Sub2_9.anInt8915 + (this.anInt3513 + local617) * this.aClass121_Sub2_9.anInt8904 / local655 - arg1.anInt7452;
				} else {
					arg1.anInt7451 = this.aClass121_Sub2_9.anInt8904 * (local525 + this.anInt3513) / local563 + this.aClass121_Sub2_9.anInt8915 - arg1.anInt7450;
				}
			}
		}
		this.aClass121_Sub2_9.method7232();
		this.aClass121_Sub2_9.method7286(local22);
		this.method3065();
		this.method3062();
	}

	@OriginalMember(owner = "client!id", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3544; local3++) {
			if (arg0 != 128) {
				this.anIntArray403[local3] = arg0 * this.anIntArray403[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray396[local3] = this.anIntArray396[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray398[local3] = this.anIntArray398[local3] * arg2 >> 7;
			}
		}
		this.method3063();
		this.aBoolean230 = false;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!q;Lclient!qn;II)V")
	@Override
	public void method4702(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class102_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3580 == 0) {
			return;
		}
		@Pc(13) Class34_Sub3 local13 = this.aClass121_Sub2_9.aClass34_Sub3_16;
		@Pc(16) Class34_Sub3 local16 = (Class34_Sub3) arg0;
		if (!this.aBoolean230) {
			this.method3070();
		}
		Static300.aFloat88 = local13.aFloat75 * local16.aFloat73 + local13.aFloat69 * local16.aFloat70 + local16.aFloat74 * local13.aFloat76 + local13.aFloat74;
		Static319.aFloat130 = local13.aFloat69 * local16.aFloat78 + local16.aFloat80 * local13.aFloat75 + local13.aFloat76 * local16.aFloat69;
		@Pc(69) float local69 = Static300.aFloat88 + Static319.aFloat130 * (float) this.anInt3558;
		@Pc(77) float local77 = Static300.aFloat88 + (float) this.anInt3579 * Static319.aFloat130;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = (float) this.anInt3513 + local69;
			local94 = local77 - (float) this.anInt3513;
		} else {
			local87 = (float) this.anInt3513 + local77;
			local94 = (float) -this.anInt3513 + local69;
		}
		if (this.aClass121_Sub2_9.aFloat189 <= local94 || (float) this.aClass121_Sub2_9.anInt8893 >= local87) {
			return;
		}
		Static249.aFloat58 = local13.aFloat73 + local13.aFloat71 * local16.aFloat74 + local16.aFloat73 * local13.aFloat77 + local16.aFloat70 * local13.aFloat80;
		Static460.aFloat173 = local16.aFloat78 * local13.aFloat80 + local13.aFloat77 * local16.aFloat80 + local16.aFloat69 * local13.aFloat71;
		@Pc(170) float local170 = Static249.aFloat58 + Static460.aFloat173 * (float) this.anInt3558;
		@Pc(178) float local178 = Static460.aFloat173 * (float) this.anInt3579 + Static249.aFloat58;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local178 < local170) {
			local194 = (local178 - (float) this.anInt3513) * (float) this.aClass121_Sub2_9.anInt8904;
			local205 = (float) this.aClass121_Sub2_9.anInt8904 * (local170 + (float) this.anInt3513);
		} else {
			local194 = (float) this.aClass121_Sub2_9.anInt8904 * ((float) -this.anInt3513 + local170);
			local205 = (local178 + (float) this.anInt3513) * (float) this.aClass121_Sub2_9.anInt8904;
		}
		if (local194 / (float) arg2 >= this.aClass121_Sub2_9.aFloat196 || local205 / (float) arg2 <= this.aClass121_Sub2_9.aFloat184) {
			return;
		}
		Static215.aFloat51 = local13.aFloat70 + local16.aFloat74 * local13.aFloat72 + local16.aFloat70 * local13.aFloat78 + local16.aFloat73 * local13.aFloat81;
		Static265.aFloat79 = local13.aFloat72 * local16.aFloat69 + local13.aFloat81 * local16.aFloat80 + local13.aFloat78 * local16.aFloat78;
		@Pc(296) float local296 = (float) this.anInt3558 * Static265.aFloat79 + Static215.aFloat51;
		@Pc(304) float local304 = Static215.aFloat51 + Static265.aFloat79 * (float) this.anInt3579;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local304 < local296) {
			local320 = ((float) -this.anInt3513 + local304) * (float) this.aClass121_Sub2_9.anInt8892;
			local331 = (float) this.aClass121_Sub2_9.anInt8892 * (local296 + (float) this.anInt3513);
		} else {
			local331 = (local304 + (float) this.anInt3513) * (float) this.aClass121_Sub2_9.anInt8892;
			local320 = (float) this.aClass121_Sub2_9.anInt8892 * (local296 - (float) this.anInt3513);
		}
		if (this.aClass121_Sub2_9.aFloat187 <= local320 / (float) arg2 || this.aClass121_Sub2_9.aFloat193 >= local331 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass126Array1 != null) {
			Static260.aFloat67 = local13.aFloat72 * local16.aFloat76 + local16.aFloat71 * local13.aFloat81 + local13.aFloat78 * local16.aFloat72;
			Static517.aFloat175 = local16.aFloat76 * local13.aFloat76 + local16.aFloat71 * local13.aFloat75 + local16.aFloat72 * local13.aFloat69;
			Static414.aFloat168 = local13.aFloat76 * local16.aFloat75 + local16.aFloat77 * local13.aFloat75 + local16.aFloat81 * local13.aFloat69;
			Static9.aFloat4 = local13.aFloat78 * local16.aFloat81 + local16.aFloat77 * local13.aFloat81 + local13.aFloat72 * local16.aFloat75;
			Static222.aFloat53 = local13.aFloat77 * local16.aFloat77 + local13.aFloat80 * local16.aFloat81 + local16.aFloat75 * local13.aFloat71;
			Static164.aFloat39 = local13.aFloat71 * local16.aFloat76 + local13.aFloat77 * local16.aFloat71 + local13.aFloat80 * local16.aFloat72;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.anInt3531 + this.anInt3571 >> 1;
			@Pc(507) int local507 = this.anInt3550 + this.anInt3578 >> 1;
			@Pc(526) int local526 = (int) ((float) local498 * Static222.aFloat53 + Static249.aFloat58 + Static460.aFloat173 * (float) this.anInt3558 + Static164.aFloat39 * (float) local507);
			@Pc(545) int local545 = (int) ((float) local507 * Static260.aFloat67 + Static215.aFloat51 + (float) local498 * Static9.aFloat4 + (float) this.anInt3558 * Static265.aFloat79);
			@Pc(564) int local564 = (int) (Static414.aFloat168 * (float) local498 + Static300.aFloat88 + Static319.aFloat130 * (float) this.anInt3558 + Static517.aFloat175 * (float) local507);
			@Pc(583) int local583 = (int) (Static460.aFloat173 * (float) this.anInt3579 + Static249.aFloat58 + (float) local498 * Static222.aFloat53 + Static164.aFloat39 * (float) local507);
			@Pc(602) int local602 = (int) ((float) local498 * Static9.aFloat4 + Static215.aFloat51 + Static265.aFloat79 * (float) this.anInt3579 + Static260.aFloat67 * (float) local507);
			arg1.anInt7448 = this.aClass121_Sub2_9.anInt8892 * local602 / arg2 + this.aClass121_Sub2_9.anInt8908;
			arg1.anInt7452 = this.aClass121_Sub2_9.anInt8915 + this.aClass121_Sub2_9.anInt8904 * local583 / arg2;
			arg1.anInt7449 = this.aClass121_Sub2_9.anInt8892 * local545 / arg2 + this.aClass121_Sub2_9.anInt8908;
			@Pc(661) int local661 = (int) (Static517.aFloat175 * (float) local507 + Static300.aFloat88 + (float) local498 * Static414.aFloat168 + (float) this.anInt3579 * Static319.aFloat130);
			arg1.anInt7450 = this.aClass121_Sub2_9.anInt8915 + this.aClass121_Sub2_9.anInt8904 * local526 / arg2;
			if (local564 < this.aClass121_Sub2_9.anInt8893 && this.aClass121_Sub2_9.anInt8893 > local661) {
				arg1.anInt7451 = this.aClass121_Sub2_9.anInt8904 * (this.anInt3513 + local526) / arg2 + this.aClass121_Sub2_9.anInt8915 - arg1.anInt7450;
				arg1.aBoolean515 = true;
			}
		}
		this.aClass121_Sub2_9.method7230((float) arg2);
		this.aClass121_Sub2_9.method7223();
		this.aClass121_Sub2_9.method7286(local16);
		this.method3065();
		this.method3062();
	}

	@OriginalMember(owner = "client!id", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.aShort71 = (short) arg0;
		this.method3066();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIJIILclient!rf;IFIFI)S")
	private short method3072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class274 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray400[arg7];
		@Pc(17) int local17 = this.anIntArray400[arg7 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray74[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static389.aLongArray12[local21] == arg2) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray74[local19] = (short) (this.anInt3580 + 1);
		Static389.aLongArray12[local19] = arg2;
		this.aShortArray73[this.anInt3580] = (short) arg5;
		this.aShortArray68[this.anInt3580] = (short) arg7;
		this.aShortArray62[this.anInt3580] = (short) arg1;
		this.aShortArray71[this.anInt3580] = (short) arg0;
		this.aShortArray70[this.anInt3580] = (short) arg3;
		this.aByteArray48[this.anInt3580] = (byte) arg9;
		this.aFloatArray18[this.anInt3580] = arg6;
		this.aFloatArray17[this.anInt3580] = arg8;
		return (short) this.anInt3580++;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4701(@OriginalArg(0) Class34 arg0) {
		@Pc(8) Class34_Sub3 local8 = (Class34_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass163Array4 != null) {
			for (local13 = 0; local13 < this.aClass163Array4.length; local13++) {
				@Pc(20) Class163 local20 = this.aClass163Array4[local13];
				@Pc(22) Class163 local22 = local20;
				if (local20.aClass163_1 != null) {
					local22 = local20.aClass163_1;
				}
				local22.anInt4051 = (int) (local8.aFloat73 + (float) this.anIntArray398[local20.anInt4049] * local8.aFloat71 + (float) this.anIntArray396[local20.anInt4049] * local8.aFloat80 + local8.aFloat77 * (float) this.anIntArray403[local20.anInt4049]);
				local22.anInt4038 = (int) (local8.aFloat70 + local8.aFloat72 * (float) this.anIntArray398[local20.anInt4049] + (float) this.anIntArray403[local20.anInt4049] * local8.aFloat81 + local8.aFloat78 * (float) this.anIntArray396[local20.anInt4049]);
				local22.anInt4047 = (int) (local8.aFloat74 + (float) this.anIntArray396[local20.anInt4049] * local8.aFloat69 + local8.aFloat75 * (float) this.anIntArray403[local20.anInt4049] + (float) this.anIntArray398[local20.anInt4049] * local8.aFloat76);
				local22.anInt4039 = (int) ((float) this.anIntArray403[local20.anInt4044] * local8.aFloat77 + (float) this.anIntArray396[local20.anInt4044] * local8.aFloat80 + (float) this.anIntArray398[local20.anInt4044] * local8.aFloat71 + local8.aFloat73);
				local22.anInt4052 = (int) (local8.aFloat70 + local8.aFloat78 * (float) this.anIntArray396[local20.anInt4044] + local8.aFloat81 * (float) this.anIntArray403[local20.anInt4044] + (float) this.anIntArray398[local20.anInt4044] * local8.aFloat72);
				local22.anInt4041 = (int) (local8.aFloat74 + local8.aFloat76 * (float) this.anIntArray398[local20.anInt4044] + local8.aFloat75 * (float) this.anIntArray403[local20.anInt4044] + local8.aFloat69 * (float) this.anIntArray396[local20.anInt4044]);
				local22.anInt4043 = (int) (local8.aFloat73 + (float) this.anIntArray403[local20.anInt4045] * local8.aFloat77 + local8.aFloat80 * (float) this.anIntArray396[local20.anInt4045] + (float) this.anIntArray398[local20.anInt4045] * local8.aFloat71);
				local22.anInt4042 = (int) (local8.aFloat70 + local8.aFloat72 * (float) this.anIntArray398[local20.anInt4045] + (float) this.anIntArray396[local20.anInt4045] * local8.aFloat78 + (float) this.anIntArray403[local20.anInt4045] * local8.aFloat81);
				local22.anInt4048 = (int) (local8.aFloat74 + local8.aFloat75 * (float) this.anIntArray403[local20.anInt4045] + local8.aFloat69 * (float) this.anIntArray396[local20.anInt4045] + local8.aFloat76 * (float) this.anIntArray398[local20.anInt4045]);
			}
		}
		if (this.aClass250Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass250Array4.length; local13++) {
			@Pc(365) Class250 local365 = this.aClass250Array4[local13];
			@Pc(367) Class250 local367 = local365;
			if (local365.aClass250_2 != null) {
				local367 = local365.aClass250_2;
			}
			if (local365.aClass34_10 == null) {
				local365.aClass34_10 = local8.method7612();
			} else {
				local365.aClass34_10.la(local8);
			}
			local367.anInt6992 = (int) ((float) this.anIntArray398[local365.anInt6989] * local8.aFloat71 + local8.aFloat77 * (float) this.anIntArray403[local365.anInt6989] + local8.aFloat80 * (float) this.anIntArray396[local365.anInt6989] + local8.aFloat73);
			local367.anInt6988 = (int) ((float) this.anIntArray403[local365.anInt6989] * local8.aFloat81 + local8.aFloat78 * (float) this.anIntArray396[local365.anInt6989] + (float) this.anIntArray398[local365.anInt6989] * local8.aFloat72 + local8.aFloat70);
			local367.anInt6987 = (int) (local8.aFloat75 * (float) this.anIntArray403[local365.anInt6989] + local8.aFloat69 * (float) this.anIntArray396[local365.anInt6989] + (float) this.anIntArray398[local365.anInt6989] * local8.aFloat76 + local8.aFloat74);
		}
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt3548;
	}

	@OriginalMember(owner = "client!id", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3565; local3++) {
			if (this.aShortArray63[local3] == arg0) {
				this.aShortArray63[local3] = arg1;
			}
		}
		if (this.aClass126Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt3520; local38++) {
				@Pc(45) Class126 local45 = this.aClass126Array1[local38];
				@Pc(50) Class223 local50 = this.aClass223Array1[local38];
				local50.anInt6232 = Static101.anIntArray262[this.aShortArray63[local45.anInt3089] & 0xFFFF] & 0xFFFFFF | local50.anInt6232 & 0xFF000000;
			}
		}
		this.method3066();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method4693(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class22_Sub3 local8 = (Class22_Sub3) arg0;
		if (this.anInt3565 == 0 || local8.anInt3565 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt3544;
		@Pc(21) int[] local21 = local8.anIntArray403;
		@Pc(24) int[] local24 = local8.anIntArray396;
		@Pc(27) int[] local27 = local8.anIntArray398;
		@Pc(30) short[] local30 = local8.aShortArray62;
		@Pc(33) short[] local33 = local8.aShortArray71;
		@Pc(36) short[] local36 = local8.aShortArray70;
		@Pc(39) byte[] local39 = local8.aByteArray48;
		@Pc(46) short[] local46;
		@Pc(50) short[] local50;
		@Pc(54) short[] local54;
		@Pc(58) byte[] local58;
		if (this.aClass321_1 == null) {
			local46 = null;
			local54 = null;
			local50 = null;
			local58 = null;
		} else {
			local46 = this.aClass321_1.aShortArray142;
			local50 = this.aClass321_1.aShortArray143;
			local54 = this.aClass321_1.aShortArray141;
			local58 = this.aClass321_1.aByteArray116;
		}
		@Pc(87) short[] local87;
		@Pc(75) short[] local75;
		@Pc(79) short[] local79;
		@Pc(83) byte[] local83;
		if (local8.aClass321_1 == null) {
			local79 = null;
			local75 = null;
			local87 = null;
			local83 = null;
		} else {
			local75 = local8.aClass321_1.aShortArray143;
			local79 = local8.aClass321_1.aShortArray141;
			local83 = local8.aClass321_1.aByteArray116;
			local87 = local8.aClass321_1.aShortArray142;
		}
		@Pc(100) int[] local100 = local8.anIntArray400;
		@Pc(103) short[] local103 = local8.aShortArray74;
		if (!local8.aBoolean230) {
			local8.method3070();
		}
		@Pc(112) int local112 = local8.anInt3558;
		@Pc(115) int local115 = local8.anInt3579;
		@Pc(118) int local118 = local8.anInt3531;
		@Pc(121) int local121 = local8.anInt3571;
		@Pc(124) int local124 = local8.anInt3550;
		@Pc(127) int local127 = local8.anInt3578;
		for (@Pc(129) int local129 = 0; local129 < this.anInt3544; local129++) {
			@Pc(138) int local138 = this.anIntArray396[local129] - arg2;
			if (local138 >= local112 && local115 >= local138) {
				@Pc(162) int local162 = this.anIntArray403[local129] - arg1;
				if (local118 <= local162 && local162 <= local121) {
					@Pc(182) int local182 = this.anIntArray398[local129] - arg3;
					if (local124 <= local182 && local127 >= local182) {
						@Pc(196) int local196 = -1;
						@Pc(201) int local201 = this.anIntArray400[local129];
						@Pc(208) int local208 = this.anIntArray400[local129 + 1];
						for (@Pc(210) int local210 = local201; local210 < local208; local210++) {
							local196 = this.aShortArray74[local210] - 1;
							if (local196 == -1 || this.aByteArray48[local196] != 0) {
								break;
							}
						}
						if (local196 != -1) {
							for (@Pc(238) int local238 = 0; local238 < local18; local238++) {
								if (local21[local238] == local162 && local27[local238] == local182 && local138 == local24[local238]) {
									local208 = local100[local238 + 1];
									local201 = local100[local238];
									@Pc(271) int local271 = -1;
									for (@Pc(273) int local273 = local201; local273 < local208; local273++) {
										local271 = local103[local273] - 1;
										if (local271 == -1 || local39[local271] != 0) {
											break;
										}
									}
									if (local271 != -1) {
										if (local46 == null) {
											this.aClass321_1 = new Class321();
											local46 = this.aClass321_1.aShortArray142 = Static155.method2277(this.aShortArray62);
											local50 = this.aClass321_1.aShortArray143 = Static155.method2277(this.aShortArray71);
											local54 = this.aClass321_1.aShortArray141 = Static155.method2277(this.aShortArray70);
											local58 = this.aClass321_1.aByteArray116 = Static332.method5088(this.aByteArray48);
										}
										if (local87 == null) {
											@Pc(353) Class321 local353 = local8.aClass321_1 = new Class321();
											local87 = local353.aShortArray142 = Static155.method2277(local30);
											local75 = local353.aShortArray143 = Static155.method2277(local33);
											local79 = local353.aShortArray141 = Static155.method2277(local36);
											local83 = local353.aByteArray116 = Static332.method5088(local39);
										}
										@Pc(386) short local386 = this.aShortArray62[local196];
										@Pc(391) short local391 = this.aShortArray71[local196];
										@Pc(396) short local396 = this.aShortArray70[local196];
										local201 = local100[local238];
										local208 = local100[local238 + 1];
										@Pc(411) byte local411 = this.aByteArray48[local196];
										@Pc(421) int local421;
										for (@Pc(413) int local413 = local201; local413 < local208; local413++) {
											local421 = local103[local413] - 1;
											if (local421 == -1) {
												break;
											}
											if (local83[local421] != 0) {
												local87[local421] += local386;
												local75[local421] += local391;
												local79[local421] += local396;
												local83[local421] += local411;
											}
										}
										local391 = local33[local271];
										local201 = this.anIntArray400[local129];
										local396 = local36[local271];
										local411 = local39[local271];
										local208 = this.anIntArray400[local129 + 1];
										local386 = local30[local271];
										for (local421 = local201; local421 < local208; local421++) {
											@Pc(507) int local507 = this.aShortArray74[local421] - 1;
											if (local507 == -1) {
												break;
											}
											if (local58[local507] != 0) {
												local46[local507] += local386;
												local50[local507] += local391;
												local54[local507] += local396;
												local58[local507] += local411;
											}
										}
										local8.method3060();
										this.method3060();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class138.anIntArray392[arg0];
		@Pc(13) int local13 = Class138.anIntArray393[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3544; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray398[local15] + local13 * this.anIntArray403[local15] >> 14;
			this.anIntArray398[local15] = this.anIntArray398[local15] * local13 - local9 * this.anIntArray403[local15] >> 14;
			this.anIntArray403[local15] = local34;
		}
		this.method3063();
		this.aBoolean230 = false;
	}

	@OriginalMember(owner = "client!id", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			Static517.anInt8191 = 0;
			Static36.anInt603 = 0;
			local31 = 0;
			Static121.anInt2105 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray46.length) {
					local55 = this.anIntArrayArray46[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static36.anInt603 += this.anIntArray403[local63];
						Static121.anInt2105 += this.anIntArray396[local63];
						Static517.anInt8191 += this.anIntArray398[local63];
						local31++;
					}
				}
			}
			if (local31 > 0) {
				Static121.anInt2105 = local17 + Static121.anInt2105 / local31;
				Static36.anInt603 = local25 + Static36.anInt603 / local31;
				Static517.anInt8191 = local21 + Static517.anInt8191 / local31;
			} else {
				Static36.anInt603 = local25;
				Static517.anInt8191 = local21;
				Static121.anInt2105 = local17;
			}
			return;
		}
		@Pc(164) int[] local164;
		@Pc(166) int local166;
		if (arg0 == 1) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray46.length > local35) {
					local164 = this.anIntArrayArray46[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local57 = local164[local166];
						this.anIntArray403[local57] += local25;
						this.anIntArray396[local57] += local17;
						this.anIntArray398[local57] += local21;
					}
				}
			}
			return;
		}
		@Pc(278) int local278;
		@Pc(297) int local297;
		@Pc(751) int local751;
		@Pc(760) int local760;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray46.length) {
					local164 = this.anIntArrayArray46[local35];
					if ((arg5 & 0x1) == 0) {
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							this.anIntArray403[local57] -= Static36.anInt603;
							this.anIntArray396[local57] -= Static121.anInt2105;
							this.anIntArray398[local57] -= Static517.anInt8191;
							if (arg4 != 0) {
								local63 = Class138.anIntArray392[arg4];
								local278 = Class138.anIntArray393[arg4];
								local297 = this.anIntArray396[local57] * local63 + this.anIntArray403[local57] * local278 + 16383 >> 14;
								this.anIntArray396[local57] = this.anIntArray396[local57] * local278 + 16383 - this.anIntArray403[local57] * local63 >> 14;
								this.anIntArray403[local57] = local297;
							}
							if (arg2 != 0) {
								local63 = Class138.anIntArray392[arg2];
								local278 = Class138.anIntArray393[arg2];
								local297 = this.anIntArray396[local57] * local278 + 16383 - local63 * this.anIntArray398[local57] >> 14;
								this.anIntArray398[local57] = local278 * this.anIntArray398[local57] + this.anIntArray396[local57] * local63 + 16383 >> 14;
								this.anIntArray396[local57] = local297;
							}
							if (arg3 != 0) {
								local63 = Class138.anIntArray392[arg3];
								local278 = Class138.anIntArray393[arg3];
								local297 = local278 * this.anIntArray403[local57] + local63 * this.anIntArray398[local57] + 16383 >> 14;
								this.anIntArray398[local57] = this.anIntArray398[local57] * local278 + 16383 - local63 * this.anIntArray403[local57] >> 14;
								this.anIntArray403[local57] = local297;
							}
							this.anIntArray403[local57] += Static36.anInt603;
							this.anIntArray396[local57] += Static121.anInt2105;
							this.anIntArray398[local57] += Static517.anInt8191;
						}
					} else {
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							this.anIntArray403[local57] -= Static36.anInt603;
							this.anIntArray396[local57] -= Static121.anInt2105;
							this.anIntArray398[local57] -= Static517.anInt8191;
							if (arg2 != 0) {
								local63 = Class138.anIntArray392[arg2];
								local278 = Class138.anIntArray393[arg2];
								local297 = local278 * this.anIntArray396[local57] + 16383 - this.anIntArray398[local57] * local63 >> 14;
								this.anIntArray398[local57] = this.anIntArray398[local57] * local278 + this.anIntArray396[local57] * local63 + 16383 >> 14;
								this.anIntArray396[local57] = local297;
							}
							if (arg4 != 0) {
								local63 = Class138.anIntArray392[arg4];
								local278 = Class138.anIntArray393[arg4];
								local297 = this.anIntArray396[local57] * local63 + this.anIntArray403[local57] * local278 + 16383 >> 14;
								this.anIntArray396[local57] = local278 * this.anIntArray396[local57] + 16383 - this.anIntArray403[local57] * local63 >> 14;
								this.anIntArray403[local57] = local297;
							}
							if (arg3 != 0) {
								local63 = Class138.anIntArray392[arg3];
								local278 = Class138.anIntArray393[arg3];
								local297 = local278 * this.anIntArray403[local57] + local63 * this.anIntArray398[local57] + 16383 >> 14;
								this.anIntArray398[local57] = local278 * this.anIntArray398[local57] + 16383 - local63 * this.anIntArray403[local57] >> 14;
								this.anIntArray403[local57] = local297;
							}
							this.anIntArray403[local57] += Static36.anInt603;
							this.anIntArray396[local57] += Static121.anInt2105;
							this.anIntArray398[local57] += Static517.anInt8191;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray46.length) {
						local55 = this.anIntArrayArray46[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local278 = this.anIntArray400[local63];
							local297 = this.anIntArray400[local63 + 1];
							for (local751 = local278; local751 < local297; local751++) {
								local760 = this.aShortArray74[local751] - 1;
								if (local760 == -1) {
									break;
								}
								@Pc(769) int local769;
								@Pc(773) int local773;
								@Pc(791) int local791;
								if (arg4 != 0) {
									local769 = Class138.anIntArray392[arg4];
									local773 = Class138.anIntArray393[arg4];
									local791 = this.aShortArray71[local760] * local769 + this.aShortArray62[local760] * local773 + 16383 >> 14;
									this.aShortArray71[local760] = (short) (this.aShortArray71[local760] * local773 + 16383 - this.aShortArray62[local760] * local769 >> 14);
									this.aShortArray62[local760] = (short) local791;
								}
								if (arg2 != 0) {
									local769 = Class138.anIntArray392[arg2];
									local773 = Class138.anIntArray393[arg2];
									local791 = local773 * this.aShortArray71[local760] + 16383 - local769 * this.aShortArray70[local760] >> 14;
									this.aShortArray70[local760] = (short) (this.aShortArray70[local760] * local773 + this.aShortArray71[local760] * local769 + 16383 >> 14);
									this.aShortArray71[local760] = (short) local791;
								}
								if (arg3 != 0) {
									local769 = Class138.anIntArray392[arg3];
									local773 = Class138.anIntArray393[arg3];
									local791 = local773 * this.aShortArray62[local760] + local769 * this.aShortArray70[local760] + 16383 >> 14;
									this.aShortArray70[local760] = (short) (this.aShortArray70[local760] * local773 + 16383 - local769 * this.aShortArray62[local760] >> 14);
									this.aShortArray62[local760] = (short) local791;
								}
							}
						}
					}
				}
				this.method3060();
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray46.length) {
					local164 = this.anIntArrayArray46[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local57 = local164[local166];
						this.anIntArray403[local57] -= Static36.anInt603;
						this.anIntArray396[local57] -= Static121.anInt2105;
						this.anIntArray398[local57] -= Static517.anInt8191;
						this.anIntArray403[local57] = arg2 * this.anIntArray403[local57] >> 7;
						this.anIntArray396[local57] = arg3 * this.anIntArray396[local57] >> 7;
						this.anIntArray398[local57] = this.anIntArray398[local57] * arg4 >> 7;
						this.anIntArray403[local57] += Static36.anInt603;
						this.anIntArray396[local57] += Static121.anInt2105;
						this.anIntArray398[local57] += Static517.anInt8191;
					}
				}
			}
		} else {
			@Pc(1205) Class223 local1205;
			@Pc(1100) boolean local1100;
			@Pc(1200) Class126 local1200;
			if (arg0 == 5) {
				if (this.anIntArrayArray44 != null) {
					local1100 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray44.length > local41) {
							local55 = this.anIntArrayArray44[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local278 = (this.aByteArray47[local63] & 0xFF) + (arg2 * 8);
								if (local278 < 0) {
									local278 = 0;
								} else if (local278 > 255) {
									local278 = 255;
								}
								this.aByteArray47[local63] = (byte) local278;
							}
							local1100 |= local55.length > 0;
						}
					}
					if (local1100) {
						if (this.aClass126Array1 != null) {
							for (local41 = 0; local41 < this.anInt3520; local41++) {
								local1200 = this.aClass126Array1[local41];
								local1205 = this.aClass223Array1[local41];
								local1205.anInt6232 = 255 - (this.aByteArray47[local1200.anInt3089] & 0xFF) << 24 | local1205.anInt6232 & 0xFFFFFF;
							}
						}
						this.method3066();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray44 != null) {
					local1100 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray44.length > local41) {
							local55 = this.anIntArrayArray44[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local278 = this.aShortArray63[local63] & 0xFFFF;
								local297 = local278 >> 10 & 0x3F;
								local751 = local278 >> 7 & 0x7;
								local760 = local278 & 0x7F;
								@Pc(1306) int local1306 = arg2 + local297 & 0x3F;
								local751 += arg3 / 4;
								local760 += arg4;
								if (local751 < 0) {
									local751 = 0;
								} else if (local751 > 7) {
									local751 = 7;
								}
								if (local760 < 0) {
									local760 = 0;
								} else if (local760 > 127) {
									local760 = 127;
								}
								this.aShortArray63[local63] = (short) (local760 | local751 << 7 | local1306 << 10);
							}
							local1100 |= local55.length > 0;
						}
					}
					if (local1100) {
						if (this.aClass126Array1 != null) {
							for (local41 = 0; local41 < this.anInt3520; local41++) {
								local1200 = this.aClass126Array1[local41];
								local1205 = this.aClass223Array1[local41];
								local1205.anInt6232 = local1205.anInt6232 & 0xFF000000 | Static101.anIntArray262[this.aShortArray63[local1200.anInt3089] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method3066();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray45 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray45.length > local35) {
							local164 = this.anIntArrayArray45[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1205 = this.aClass223Array1[local164[local166]];
								local1205.anInt6236 += arg3;
								local1205.anInt6228 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray45 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray45.length) {
							local164 = this.anIntArrayArray45[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1205 = this.aClass223Array1[local164[local166]];
								local1205.anInt6227 = arg3 * local1205.anInt6227 >> 7;
								local1205.anInt6230 = arg2 * local1205.anInt6230 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray45 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray45.length > local35) {
						local164 = this.anIntArrayArray45[local35];
						for (local166 = 0; local166 < local164.length; local166++) {
							local1205 = this.aClass223Array1[local164[local166]];
							local1205.anInt6231 = local1205.anInt6231 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray46 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt3543; local12++) {
			this.anIntArray403[local12] <<= 0x4;
			this.anIntArray396[local12] <<= 0x4;
			this.anIntArray398[local12] <<= 0x4;
		}
		Static517.anInt8191 = 0;
		Static36.anInt603 = 0;
		Static121.anInt2105 = 0;
		return true;
	}

	@OriginalMember(owner = "client!id", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean230) {
			this.method3070();
		}
		return this.anInt3578;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method4698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class34_Sub3 local8 = (Class34_Sub3) arg2;
		@Pc(12) Class34_Sub3 local12 = this.aClass121_Sub2_9.aClass34_Sub3_16;
		@Pc(33) float local33 = local12.aFloat73 + local12.aFloat77 * local8.aFloat73 + local8.aFloat70 * local12.aFloat80 + local8.aFloat74 * local12.aFloat71;
		@Pc(54) float local54 = local12.aFloat70 + local12.aFloat72 * local8.aFloat74 + local12.aFloat78 * local8.aFloat70 + local8.aFloat73 * local12.aFloat81;
		Static414.aFloat168 = local12.aFloat69 * local8.aFloat81 + local8.aFloat77 * local12.aFloat75 + local12.aFloat76 * local8.aFloat75;
		Static164.aFloat39 = local8.aFloat76 * local12.aFloat71 + local8.aFloat71 * local12.aFloat77 + local12.aFloat80 * local8.aFloat72;
		Static222.aFloat53 = local8.aFloat77 * local12.aFloat77 + local8.aFloat81 * local12.aFloat80 + local12.aFloat71 * local8.aFloat75;
		Static265.aFloat79 = local8.aFloat69 * local12.aFloat72 + local12.aFloat81 * local8.aFloat80 + local8.aFloat78 * local12.aFloat78;
		Static9.aFloat4 = local12.aFloat72 * local8.aFloat75 + local8.aFloat77 * local12.aFloat81 + local12.aFloat78 * local8.aFloat81;
		Static260.aFloat67 = local12.aFloat72 * local8.aFloat76 + local8.aFloat72 * local12.aFloat78 + local12.aFloat81 * local8.aFloat71;
		Static460.aFloat173 = local12.aFloat77 * local8.aFloat80 + local8.aFloat78 * local12.aFloat80 + local8.aFloat69 * local12.aFloat71;
		@Pc(201) float local201 = local12.aFloat74 + local12.aFloat69 * local8.aFloat70 + local12.aFloat75 * local8.aFloat73 + local12.aFloat76 * local8.aFloat74;
		Static319.aFloat130 = local12.aFloat76 * local8.aFloat69 + local8.aFloat80 * local12.aFloat75 + local8.aFloat78 * local12.aFloat69;
		Static517.aFloat175 = local12.aFloat76 * local8.aFloat76 + local8.aFloat71 * local12.aFloat75 + local8.aFloat72 * local12.aFloat69;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass121_Sub2_9.anInt8904;
		@Pc(255) int local255 = this.aClass121_Sub2_9.anInt8892;
		if (!this.aBoolean230) {
			this.method3070();
		}
		Static124.anIntArray282[0] = this.anInt3531;
		Static137.anIntArray299[0] = this.anInt3558;
		Static124.anIntArray282[1] = this.anInt3571;
		Static485.anIntArray632[0] = this.anInt3550;
		Static137.anIntArray299[1] = this.anInt3558;
		Static485.anIntArray632[1] = this.anInt3550;
		Static124.anIntArray282[2] = this.anInt3531;
		Static137.anIntArray299[2] = this.anInt3579;
		Static124.anIntArray282[3] = this.anInt3571;
		Static485.anIntArray632[2] = this.anInt3550;
		Static137.anIntArray299[3] = this.anInt3579;
		Static485.anIntArray632[3] = this.anInt3550;
		Static124.anIntArray282[4] = this.anInt3531;
		Static137.anIntArray299[4] = this.anInt3558;
		Static124.anIntArray282[5] = this.anInt3571;
		Static485.anIntArray632[4] = this.anInt3578;
		Static137.anIntArray299[5] = this.anInt3558;
		Static124.anIntArray282[6] = this.anInt3531;
		Static485.anIntArray632[5] = this.anInt3578;
		Static137.anIntArray299[6] = this.anInt3579;
		Static124.anIntArray282[7] = this.anInt3571;
		Static485.anIntArray632[6] = this.anInt3578;
		Static137.anIntArray299[7] = this.anInt3579;
		Static485.anIntArray632[7] = this.anInt3578;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(400) float local400;
		@Pc(395) float local395;
		@Pc(390) float local390;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static485.anIntArray632[local383];
			local395 = Static137.anIntArray299[local383];
			local400 = Static124.anIntArray282[local383];
			local414 = local400 * Static9.aFloat4 + local395 * Static265.aFloat79 + local390 * Static260.aFloat67 + local54;
			local428 = Static319.aFloat130 * local395 + local400 * Static414.aFloat168 + Static517.aFloat175 * local390 + local201;
			local442 = local400 * Static222.aFloat53 + local395 * Static460.aFloat173 + Static164.aFloat39 * local390 + local33;
			if ((float) this.aClass121_Sub2_9.anInt8893 <= local428) {
				@Pc(461) float local461 = (float) this.aClass121_Sub2_9.anInt8915 + (float) local251 * local442 / local428;
				if (local241 > local461) {
					local241 = local461;
				}
				if (local461 > local243) {
					local243 = local461;
				}
				@Pc(485) float local485 = local414 * (float) local255 / local428 + (float) this.aClass121_Sub2_9.anInt8908;
				local239 = true;
				if (local485 < local245) {
					local245 = local485;
				}
				if (local485 > local247) {
					local247 = local485;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && local245 < (float) arg1 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (Static189.anIntArray347.length < this.anInt3580) {
				Static189.anIntArray347 = new int[this.anInt3580];
				Static554.anIntArray697 = new int[this.anInt3580];
			}
			@Pc(632) int local632;
			for (@Pc(550) int local550 = 0; local550 < this.anInt3544; local550++) {
				local400 = this.anIntArray403[local550];
				local395 = this.anIntArray396[local550];
				local390 = this.anIntArray398[local550];
				local428 = local390 * Static517.aFloat175 + local395 * Static319.aFloat130 + Static414.aFloat168 * local400 + local201;
				local442 = local33 + local390 * Static164.aFloat39 + Static222.aFloat53 * local400 + Static460.aFloat173 * local395;
				local414 = Static265.aFloat79 * local395 + local400 * Static9.aFloat4 + Static260.aFloat67 * local390 + local54;
				@Pc(645) int local645;
				@Pc(650) int local650;
				@Pc(657) int local657;
				if ((float) this.aClass121_Sub2_9.anInt8893 <= local428) {
					local632 = (int) ((float) local251 * local442 / local428 + (float) this.aClass121_Sub2_9.anInt8915);
					local645 = (int) ((float) local255 * local414 / local428 + (float) this.aClass121_Sub2_9.anInt8908);
					local650 = this.anIntArray400[local550];
					local657 = this.anIntArray400[local550 + 1];
					for (@Pc(659) int local659 = local650; local659 < local657; local659++) {
						@Pc(668) int local668 = this.aShortArray74[local659] - 1;
						if (local668 == -1) {
							break;
						}
						Static189.anIntArray347[local668] = local632;
						Static554.anIntArray697[local668] = local645;
					}
				} else {
					local632 = this.anIntArray400[local550];
					local645 = this.anIntArray400[local550 + 1];
					for (local650 = local632; local650 < local645; local650++) {
						local657 = this.aShortArray74[local650] - 1;
						if (local657 == -1) {
							break;
						}
						Static189.anIntArray347[this.aShortArray74[local650] - 1] = -999999;
					}
				}
			}
			for (local632 = 0; local632 < this.anInt3565; local632++) {
				if (Static189.anIntArray347[this.aShortArray65[local632]] != -999999 && Static189.anIntArray347[this.aShortArray66[local632]] != -999999 && Static189.anIntArray347[this.aShortArray67[local632]] != -999999 && this.method3069(arg0, Static189.anIntArray347[this.aShortArray67[local632]], Static554.anIntArray697[this.aShortArray65[local632]], Static554.anIntArray697[this.aShortArray67[local632]], Static189.anIntArray347[this.aShortArray66[local632]], Static554.anIntArray697[this.aShortArray66[local632]], arg1, Static189.anIntArray347[this.aShortArray65[local632]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!id", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		if (this.aClass151_2 != null) {
			this.aClass151_2.aBoolean248 = Static123.method1856(arg0, this.anInt3573);
		}
		if (this.aClass151_3 != null) {
			this.aClass151_3.aBoolean248 = Static477.method7208(this.anInt3573, arg0);
		}
		if (this.lb != null) {
			this.lb.aBoolean248 = Static85.method1344(this.anInt3573, arg0);
		}
		if (this.aClass151_1 != null) {
			this.aClass151_1.aBoolean248 = Static224.method3265(this.anInt3573, arg0);
		}
		this.anInt3548 = arg0;
		this.aBoolean231 = true;
		if (this.aClass321_1 != null && (this.anInt3548 & 0x10000) == 0) {
			this.aShortArray71 = this.aClass321_1.aShortArray143;
			this.aShortArray70 = this.aClass321_1.aShortArray141;
			this.aByteArray48 = this.aClass321_1.aByteArray116;
			this.aShortArray62 = this.aClass321_1.aShortArray142;
			this.aClass321_1 = null;
		}
		this.method3064();
	}

	@OriginalMember(owner = "client!id", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean230) {
			this.method3070();
		}
		return this.anInt3571;
	}

	@OriginalMember(owner = "client!id", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean230) {
			this.method3070();
		}
		return this.anInt3579;
	}

	@OriginalMember(owner = "client!id", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class138.anIntArray392[arg0];
		@Pc(13) int local13 = Class138.anIntArray393[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3544; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray396[local15] - this.anIntArray398[local15] * local9 >> 14;
			this.anIntArray398[local15] = this.anIntArray398[local15] * local13 + this.anIntArray396[local15] * local9 >> 14;
			this.anIntArray396[local15] = local33;
		}
		this.method3063();
		this.aBoolean230 = false;
	}

	@OriginalMember(owner = "client!id", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3544; local7++) {
			if (arg0 != 0) {
				this.anIntArray403[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray396[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray398[local7] += arg2;
			}
		}
		this.method3063();
		this.aBoolean230 = false;
	}

	@OriginalMember(owner = "client!id", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean230) {
			this.method3070();
		}
		return this.anInt3531;
	}

	@OriginalMember(owner = "client!id", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean230) {
			this.method3070();
		}
		return this.anInt3558;
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(B)V")
	private void method3074() {
		if (this.aClass32_1 != null) {
			this.aClass32_1.aBoolean24 = false;
		}
	}
}
