import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class24_Sub3 extends Class24 {

	@OriginalMember(owner = "client!na", name = "x", descriptor = "Lclient!oca;")
	private Class227 aClass227_1;

	@OriginalMember(owner = "client!na", name = "A", descriptor = "I")
	private int anInt6294;

	@OriginalMember(owner = "client!na", name = "F", descriptor = "I")
	private int anInt6296;

	@OriginalMember(owner = "client!na", name = "S", descriptor = "I")
	private int anInt6306;

	@OriginalMember(owner = "client!na", name = "db", descriptor = "Lclient!jj;")
	private Class155 aClass155_1;

	@OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
	private int anInt6315;

	@OriginalMember(owner = "client!na", name = "hb", descriptor = "Lclient!oca;")
	private Class227 aClass227_2;

	@OriginalMember(owner = "client!na", name = "kb", descriptor = "I")
	private int anInt6317;

	@OriginalMember(owner = "client!na", name = "lb", descriptor = "Lclient!oca;")
	private Class227 lb;

	@OriginalMember(owner = "client!na", name = "rb", descriptor = "Z")
	private boolean aBoolean445;

	@OriginalMember(owner = "client!na", name = "Ab", descriptor = "Lclient!gj;")
	private final Class90_Sub3 aClass90_Sub3_9;

	@OriginalMember(owner = "client!na", name = "Kb", descriptor = "Z")
	private boolean aBoolean446;

	@OriginalMember(owner = "client!na", name = "Lb", descriptor = "I")
	private int anInt6332;

	@OriginalMember(owner = "client!na", name = "Nb", descriptor = "I")
	private int anInt6333;

	@OriginalMember(owner = "client!na", name = "Sb", descriptor = "I")
	private int anInt6337;

	@OriginalMember(owner = "client!na", name = "Ub", descriptor = "I")
	private int anInt6339;

	@OriginalMember(owner = "client!na", name = "bc", descriptor = "Lclient!oca;")
	private Class227 aClass227_3;

	@OriginalMember(owner = "client!na", name = "gc", descriptor = "I")
	private int anInt6345;

	@OriginalMember(owner = "client!na", name = "ic", descriptor = "Lclient!af;")
	private Class9 aClass9_1;

	@OriginalMember(owner = "client!na", name = "pc", descriptor = "Z")
	private boolean aBoolean447;

	@OriginalMember(owner = "client!na", name = "R", descriptor = "[I")
	private int[] anIntArray447;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "I")
	private int anInt6285;

	@OriginalMember(owner = "client!na", name = "sb", descriptor = "I")
	private int anInt6322;

	@OriginalMember(owner = "client!na", name = "wb", descriptor = "I")
	private int anInt6324;

	@OriginalMember(owner = "client!na", name = "zb", descriptor = "[I")
	private int[] anIntArray450;

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "[I")
	private int[] anIntArray448;

	@OriginalMember(owner = "client!na", name = "X", descriptor = "I")
	private int anInt6309;

	@OriginalMember(owner = "client!na", name = "Wb", descriptor = "[I")
	private int[] anIntArray451;

	@OriginalMember(owner = "client!na", name = "Jb", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!na", name = "Yb", descriptor = "[Lclient!bh;")
	private Class33[] aClass33Array6;

	@OriginalMember(owner = "client!na", name = "sc", descriptor = "[Lclient!vp;")
	private Class335[] aClass335Array6;

	@OriginalMember(owner = "client!na", name = "yb", descriptor = "I")
	private int anInt6326;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "[Lclient!ke;")
	private Class169[] aClass169Array1;

	@OriginalMember(owner = "client!na", name = "hc", descriptor = "[Lclient!uca;")
	private Class317[] aClass317Array1;

	@OriginalMember(owner = "client!na", name = "cb", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!na", name = "uc", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!na", name = "Rb", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!na", name = "tb", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!na", name = "Gb", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!na", name = "V", descriptor = "[F")
	private float[] aFloatArray54;

	@OriginalMember(owner = "client!na", name = "wc", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!na", name = "u", descriptor = "[B")
	private byte[] aByteArray81;

	@OriginalMember(owner = "client!na", name = "W", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!na", name = "Mb", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!na", name = "Xb", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!na", name = "nc", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!na", name = "jc", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!na", name = "Zb", descriptor = "[B")
	private byte[] aByteArray83;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "[F")
	private float[] aFloatArray53;

	@OriginalMember(owner = "client!na", name = "E", descriptor = "[I")
	private int[] anIntArray446;

	@OriginalMember(owner = "client!na", name = "nb", descriptor = "[I")
	private int[] anIntArray449;

	@OriginalMember(owner = "client!na", name = "lc", descriptor = "[I")
	private int[] anIntArray452;

	@OriginalMember(owner = "client!na", name = "vb", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!na", name = "jb", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!na", name = "Eb", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!gj;Lclient!hn;IIII)V")
	public Class24_Sub3(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface2 local11 = arg0.anInterface2_15;
		this.anIntArray447 = new int[arg1.anInt3867 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt3853];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt3853; local24++) {
			if ((arg1.aByteArray46 == null || arg1.aByteArray46[local24] != 2) && (arg1.aShortArray58 == null || arg1.aShortArray58[local24] == -1 || !local11.method3085(arg1.aShortArray58[local24] & 0xFFFF).aBoolean235)) {
				local22[this.anInt6285++] = local24;
				this.anIntArray447[arg1.aShortArray52[local24]]++;
				this.anIntArray447[arg1.aShortArray55[local24]]++;
				this.anIntArray447[arg1.aShortArray60[local24]]++;
			}
		}
		this.anInt6322 = this.anInt6285;
		@Pc(113) long[] local113 = new long[this.anInt6285];
		@Pc(122) boolean local122 = (this.anInt6317 & 0x100) != 0;
		@Pc(134) int local134;
		@Pc(145) int local145;
		@Pc(270) int local270;
		label500: for (@Pc(124) int local124 = 0; local124 < this.anInt6285; local124++) {
			@Pc(130) int local130 = local22[local124];
			@Pc(132) Class115 local132 = null;
			local134 = 0;
			@Pc(136) byte local136 = 0;
			@Pc(138) byte local138 = 0;
			@Pc(140) byte local140 = 0;
			if (arg1.aClass143Array1 != null) {
				for (local145 = 0; local145 < arg1.aClass143Array1.length; local145++) {
					@Pc(152) Class143 local152 = arg1.aClass143Array1[local145];
					if (local152.anInt4099 == local130) {
						@Pc(161) Class276 local161 = Static116.method1819(local152.anInt4098);
						if (local161.aBoolean518) {
							local113[local124] = Long.MAX_VALUE;
							this.anInt6322--;
							continue label500;
						}
					}
				}
			}
			@Pc(184) short local184 = -1;
			if (arg1.aShortArray58 != null) {
				local184 = arg1.aShortArray58[local130];
				if (local184 != -1) {
					local132 = local11.method3085(local184 & 0xFFFF);
					local138 = local132.aByte34;
					local140 = local132.aByte39;
				}
			}
			@Pc(226) boolean local226 = arg1.aByteArray48 != null && arg1.aByteArray48[local130] != 0 || local132 != null && !local132.aBoolean226;
			if ((local122 || local226) && arg1.aByteArray49 != null) {
				local134 += arg1.aByteArray49[local130] << 17;
			}
			if (local226) {
				local134 += 65536;
			}
			local134 += (local138 & 0xFF) << 8;
			local134 += local140 & 0xFF;
			local270 = local136 + ((local184 & 0xFFFF) << 16);
			@Pc(276) int local276 = local270 + (local124 & 0xFFFF);
			local113[local124] = ((long) local134 << 32) + (long) local276;
		}
		Static15.method201(local22, local113);
		this.anInt6324 = arg1.anInt3857;
		this.anIntArray450 = arg1.anIntArray326;
		this.anIntArray448 = arg1.anIntArray336;
		this.anInt6309 = arg1.anInt3867;
		this.anIntArray451 = arg1.anIntArray328;
		this.aShortArray93 = arg1.aShortArray53;
		this.aClass33Array6 = arg1.aClass33Array3;
		this.aClass335Array6 = arg1.aClass335Array3;
		@Pc(331) Class157[] local331 = new Class157[this.anInt6309];
		@Pc(351) int local351;
		@Pc(365) int local365;
		if (arg1.aClass143Array1 != null) {
			this.anInt6326 = arg1.aClass143Array1.length;
			this.aClass169Array1 = new Class169[this.anInt6326];
			this.aClass317Array1 = new Class317[this.anInt6326];
			for (local351 = 0; local351 < this.anInt6326; local351++) {
				@Pc(358) Class143 local358 = arg1.aClass143Array1[local351];
				@Pc(363) Class276 local363 = Static116.method1819(local358.anInt4098);
				local365 = -1;
				for (@Pc(367) int local367 = 0; local367 < this.anInt6285; local367++) {
					if (local22[local367] == local358.anInt4099) {
						local365 = local367;
						break;
					}
				}
				if (local365 == -1) {
					throw new RuntimeException();
				}
				local145 = Static36.anIntArray31[arg1.aShortArray51[local358.anInt4099] & 0xFFFF] & 0xFFFFFF;
				local145 |= 255 - (arg1.aByteArray48 == null ? 0 : arg1.aByteArray48[local358.anInt4099]) << 24;
				this.aClass317Array1[local351] = new Class317(local365, arg1.aShortArray52[local358.anInt4099], arg1.aShortArray55[local358.anInt4099], arg1.aShortArray60[local358.anInt4099], local363.anInt7927, local363.anInt7920, local363.anInt7928, local363.anInt7923, local363.anInt7922, local363.aBoolean518, local363.aBoolean519, local358.anInt4100);
				this.aClass169Array1[local351] = new Class169(local145);
			}
		}
		local351 = this.anInt6285 * 3;
		this.aShortArray90 = new short[local351];
		this.aShort84 = (short) arg3;
		this.aShortArray95 = new short[this.anInt6285];
		this.aShortArray91 = new short[this.anInt6285];
		this.aShortArray92 = new short[local351];
		this.aFloatArray54 = new float[local351];
		this.aShortArray99 = new short[this.anInt6285];
		this.aByteArray81 = new byte[local351];
		Static488.aLongArray22 = new long[local351];
		this.aShort83 = (short) arg4;
		this.aShortArray94 = new short[local351];
		if (arg1.aShortArray59 != null) {
			this.aShortArray89 = new short[this.anInt6285];
		}
		this.aShortArray87 = new short[this.anInt6285];
		this.aShortArray88 = new short[this.anInt6285];
		this.aShortArray96 = new short[local351];
		this.aShortArray98 = new short[local351];
		this.aShortArray97 = new short[local351];
		this.aByteArray83 = new byte[this.anInt6285];
		this.aFloatArray53 = new float[local351];
		local134 = 0;
		for (local270 = 0; local270 < arg1.anInt3867; local270++) {
			local365 = this.anIntArray447[local270];
			this.anIntArray447[local270] = local134;
			local134 += local365;
			local331[local270] = new Class157();
		}
		this.anIntArray447[arg1.anInt3867] = local134;
		@Pc(606) int[] local606 = null;
		@Pc(608) int[] local608 = null;
		@Pc(610) int[] local610 = null;
		@Pc(612) float[][] local612 = null;
		@Pc(630) int[] local630;
		@Pc(638) int local638;
		@Pc(683) int local683;
		@Pc(689) int local689;
		@Pc(703) int local703;
		@Pc(705) int local705;
		@Pc(741) int local741;
		@Pc(746) int local746;
		@Pc(891) float local891;
		@Pc(889) float local889;
		@Pc(920) float local920;
		if (arg1.aByteArray47 != null) {
			@Pc(618) int local618 = arg1.anInt3860;
			@Pc(621) int[] local621 = new int[local618];
			@Pc(624) int[] local624 = new int[local618];
			@Pc(627) int[] local627 = new int[local618];
			local630 = new int[local618];
			@Pc(633) int[] local633 = new int[local618];
			@Pc(636) int[] local636 = new int[local618];
			for (local638 = 0; local638 < local618; local638++) {
				local621[local638] = Integer.MAX_VALUE;
				local624[local638] = -2147483647;
				local627[local638] = Integer.MAX_VALUE;
				local630[local638] = -2147483647;
				local633[local638] = Integer.MAX_VALUE;
				local636[local638] = -2147483647;
			}
			local606 = new int[local618];
			local608 = new int[local618];
			local612 = new float[local618][];
			for (local683 = 0; local683 < this.anInt6285; local683++) {
				local689 = local22[local683];
				if (arg1.aByteArray47[local689] != -1) {
					local703 = arg1.aByteArray47[local689] & 0xFF;
					for (local705 = 0; local705 < 3; local705++) {
						@Pc(722) short local722;
						if (local705 == 0) {
							local722 = arg1.aShortArray52[local689];
						} else if (local705 == 1) {
							local722 = arg1.aShortArray55[local689];
						} else {
							local722 = arg1.aShortArray60[local689];
						}
						local741 = arg1.anIntArray326[local722];
						local746 = arg1.anIntArray328[local722];
						@Pc(751) int local751 = arg1.anIntArray336[local722];
						if (local621[local703] > local741) {
							local621[local703] = local741;
						}
						if (local741 > local624[local703]) {
							local624[local703] = local741;
						}
						if (local627[local703] > local746) {
							local627[local703] = local746;
						}
						if (local630[local703] < local746) {
							local630[local703] = local746;
						}
						if (local751 < local633[local703]) {
							local633[local703] = local751;
						}
						if (local636[local703] < local751) {
							local636[local703] = local751;
						}
					}
				}
			}
			local610 = new int[local618];
			for (local689 = 0; local689 < local618; local689++) {
				@Pc(834) byte local834 = arg1.aByteArray45[local689];
				if (local834 > 0) {
					local606[local689] = (local624[local689] + local621[local689]) / 2;
					local608[local689] = (local630[local689] + local627[local689]) / 2;
					local610[local689] = (local636[local689] + local633[local689]) / 2;
					if (local834 == 1) {
						local746 = arg1.anIntArray331[local689];
						if (local746 == 0) {
							local889 = 1.0F;
							local891 = 1.0F;
						} else if (local746 > 0) {
							local891 = 1.0F;
							local889 = (float) local746 / 1024.0F;
						} else {
							local889 = 1.0F;
							local891 = (float) -local746 / 1024.0F;
						}
						local920 = 64.0F / (float) arg1.anIntArray327[local689];
					} else if (local834 == 2) {
						local889 = 64.0F / (float) arg1.anIntArray333[local689];
						local891 = 64.0F / (float) arg1.anIntArray331[local689];
						local920 = 64.0F / (float) arg1.anIntArray327[local689];
					} else {
						local889 = (float) arg1.anIntArray333[local689] / 1024.0F;
						local920 = (float) arg1.anIntArray327[local689] / 1024.0F;
						local891 = (float) arg1.anIntArray331[local689] / 1024.0F;
					}
					local612[local689] = Static518.method7075(arg1.aShortArray56[local689], arg1.aShortArray57[local689], arg1.aShortArray54[local689], local891, local889, arg1.aByteArray51[local689] & 0xFF, local920);
				}
			}
		}
		@Pc(1015) Class130[] local1015 = new Class130[arg1.anInt3853];
		@Pc(1034) short local1034;
		@Pc(1045) int local1045;
		@Pc(1056) int local1056;
		for (@Pc(1017) int local1017 = 0; local1017 < arg1.anInt3853; local1017++) {
			@Pc(1024) short local1024 = arg1.aShortArray52[local1017];
			@Pc(1029) short local1029 = arg1.aShortArray55[local1017];
			local1034 = arg1.aShortArray60[local1017];
			local1045 = this.anIntArray450[local1029] - this.anIntArray450[local1024];
			local1056 = this.anIntArray451[local1029] - this.anIntArray451[local1024];
			local638 = this.anIntArray448[local1029] - this.anIntArray448[local1024];
			local683 = this.anIntArray450[local1034] - this.anIntArray450[local1024];
			local689 = this.anIntArray451[local1034] - this.anIntArray451[local1024];
			local703 = this.anIntArray448[local1034] - this.anIntArray448[local1024];
			local705 = local1056 * local703 - local689 * local638;
			@Pc(1116) int local1116 = local638 * local683 - local703 * local1045;
			for (local741 = local1045 * local689 - local1056 * local683; local705 > 8192 || local1116 > 8192 || local741 > 8192 || local705 < -8192 || local1116 < -8192 || local741 < -8192; local741 >>= 0x1) {
				local1116 >>= 0x1;
				local705 >>= 0x1;
			}
			local746 = (int) Math.sqrt((double) (local741 * local741 + local1116 * local1116 + local705 * local705));
			if (local746 <= 0) {
				local746 = 1;
			}
			local705 = local705 * 256 / local746;
			local1116 = local1116 * 256 / local746;
			local741 = local741 * 256 / local746;
			@Pc(1208) byte local1208 = arg1.aByteArray46 == null ? 0 : arg1.aByteArray46[local1017];
			if (local1208 == 0) {
				@Pc(1236) Class157 local1236 = local331[local1024];
				local1236.anInt4576 += local1116;
				local1236.anInt4577++;
				local1236.anInt4579 += local741;
				local1236.anInt4571 += local705;
				@Pc(1264) Class157 local1264 = local331[local1029];
				local1264.anInt4576 += local1116;
				local1264.anInt4579 += local741;
				local1264.anInt4571 += local705;
				local1264.anInt4577++;
				@Pc(1292) Class157 local1292 = local331[local1034];
				local1292.anInt4571 += local705;
				local1292.anInt4579 += local741;
				local1292.anInt4576 += local1116;
				local1292.anInt4577++;
			} else if (local1208 == 1) {
				@Pc(1221) Class130 local1221 = local1015[local1017] = new Class130();
				local1221.anInt3821 = local1116;
				local1221.anInt3822 = local741;
				local1221.anInt3823 = local705;
			}
		}
		@Pc(1333) int local1333;
		for (@Pc(1327) int local1327 = 0; local1327 < this.anInt6285; local1327++) {
			local1333 = local22[local1327];
			@Pc(1340) int local1340 = arg1.aShortArray51[local1333] & 0xFFFF;
			@Pc(1348) short local1348;
			if (arg1.aShortArray58 == null) {
				local1348 = -1;
			} else {
				local1348 = arg1.aShortArray58[local1333];
			}
			if (arg1.aByteArray47 == null) {
				local1056 = -1;
			} else {
				local1056 = arg1.aByteArray47[local1333];
			}
			if (arg1.aByteArray48 == null) {
				local638 = 0;
			} else {
				local638 = arg1.aByteArray48[local1333] & 0xFF;
			}
			@Pc(1380) float local1380 = 0.0F;
			@Pc(1382) float local1382 = 0.0F;
			@Pc(1384) float local1384 = 0.0F;
			local891 = 0.0F;
			local920 = 0.0F;
			local889 = 0.0F;
			@Pc(1392) byte local1392 = 0;
			@Pc(1394) byte local1394 = 0;
			@Pc(1396) int local1396 = 0;
			@Pc(1412) byte local1412;
			@Pc(1429) short local1429;
			@Pc(1434) short local1434;
			@Pc(1439) short local1439;
			if (local1348 != -1) {
				if (local1056 == -1) {
					local891 = 1.0F;
					local889 = 0.0F;
					local1392 = 1;
					local1380 = 0.0F;
					local1384 = 1.0F;
					local1394 = 2;
					local1382 = 1.0F;
					local920 = 0.0F;
				} else {
					local1056 &= 0xFF;
					local1412 = arg1.aByteArray45[local1056];
					@Pc(1419) short local1419;
					@Pc(1424) short local1424;
					@Pc(1462) float local1462;
					@Pc(1470) float local1470;
					@Pc(1479) float local1479;
					@Pc(1563) float local1563;
					@Pc(1571) float local1571;
					@Pc(1580) float local1580;
					@Pc(1588) float local1588;
					@Pc(1596) float local1596;
					@Pc(1605) float local1605;
					if (local1412 == 0) {
						local1419 = arg1.aShortArray52[local1333];
						local1424 = arg1.aShortArray55[local1333];
						local1429 = arg1.aShortArray60[local1333];
						local1434 = arg1.aShortArray56[local1056];
						local1439 = arg1.aShortArray57[local1056];
						@Pc(1444) short local1444 = arg1.aShortArray54[local1056];
						@Pc(1450) float local1450 = (float) arg1.anIntArray326[local1434];
						@Pc(1456) float local1456 = (float) arg1.anIntArray328[local1434];
						local1462 = arg1.anIntArray336[local1434];
						local1470 = (float) arg1.anIntArray326[local1439] - local1450;
						local1479 = (float) arg1.anIntArray328[local1439] - local1456;
						@Pc(1487) float local1487 = (float) arg1.anIntArray336[local1439] - local1462;
						@Pc(1496) float local1496 = (float) arg1.anIntArray326[local1444] - local1450;
						@Pc(1504) float local1504 = (float) arg1.anIntArray328[local1444] - local1456;
						@Pc(1512) float local1512 = (float) arg1.anIntArray336[local1444] - local1462;
						@Pc(1520) float local1520 = (float) arg1.anIntArray326[local1419] - local1450;
						@Pc(1528) float local1528 = (float) arg1.anIntArray328[local1419] - local1456;
						@Pc(1537) float local1537 = (float) arg1.anIntArray336[local1419] - local1462;
						@Pc(1546) float local1546 = (float) arg1.anIntArray326[local1424] - local1450;
						@Pc(1555) float local1555 = (float) arg1.anIntArray328[local1424] - local1456;
						local1563 = (float) arg1.anIntArray336[local1424] - local1462;
						local1571 = (float) arg1.anIntArray326[local1429] - local1450;
						local1580 = (float) arg1.anIntArray328[local1429] - local1456;
						local1588 = (float) arg1.anIntArray336[local1429] - local1462;
						local1596 = local1479 * local1512 - local1504 * local1487;
						local1605 = local1487 * local1496 - local1470 * local1512;
						@Pc(1614) float local1614 = local1470 * local1504 - local1496 * local1479;
						@Pc(1622) float local1622 = local1614 * local1504 - local1512 * local1605;
						@Pc(1630) float local1630 = local1596 * local1512 - local1496 * local1614;
						@Pc(1639) float local1639 = local1496 * local1605 - local1504 * local1596;
						@Pc(1653) float local1653 = 1.0F / (local1639 * local1487 + local1470 * local1622 + local1479 * local1630);
						local1380 = local1653 * (local1520 * local1622 + local1528 * local1630 + local1639 * local1537);
						local920 = local1653 * (local1588 * local1639 + local1622 * local1571 + local1630 * local1580);
						local1384 = (local1563 * local1639 + local1555 * local1630 + local1622 * local1546) * local1653;
						@Pc(1703) float local1703 = local1605 * local1470 - local1596 * local1479;
						@Pc(1711) float local1711 = local1596 * local1487 - local1614 * local1470;
						@Pc(1720) float local1720 = local1479 * local1614 - local1605 * local1487;
						@Pc(1734) float local1734 = 1.0F / (local1703 * local1512 + local1711 * local1504 + local1720 * local1496);
						local889 = (local1588 * local1703 + local1720 * local1571 + local1580 * local1711) * local1734;
						local891 = local1734 * (local1720 * local1546 + local1711 * local1555 + local1563 * local1703);
						local1382 = (local1537 * local1703 + local1720 * local1520 + local1528 * local1711) * local1734;
					} else {
						local1419 = arg1.aShortArray52[local1333];
						local1424 = arg1.aShortArray55[local1333];
						local1429 = arg1.aShortArray60[local1333];
						@Pc(1797) int local1797 = local606[local1056];
						@Pc(1801) int local1801 = local608[local1056];
						@Pc(1805) int local1805 = local610[local1056];
						@Pc(1809) float[] local1809 = local612[local1056];
						@Pc(1814) byte local1814 = arg1.aByteArray50[local1056];
						local1462 = (float) arg1.anIntArray335[local1056] / 256.0F;
						if (local1412 == 1) {
							local1470 = (float) arg1.anIntArray333[local1056] / 1024.0F;
							Static3.method5665(arg1.anIntArray336[local1419], arg1.anIntArray328[local1419], local1801, local1809, local1797, local1462, local1805, local1814, local1470, arg1.anIntArray326[local1419]);
							local1382 = Static301.aFloat130;
							local1380 = Static23.aFloat18;
							Static3.method5665(arg1.anIntArray336[local1424], arg1.anIntArray328[local1424], local1801, local1809, local1797, local1462, local1805, local1814, local1470, arg1.anIntArray326[local1424]);
							local1384 = Static23.aFloat18;
							local891 = Static301.aFloat130;
							Static3.method5665(arg1.anIntArray336[local1429], arg1.anIntArray328[local1429], local1801, local1809, local1797, local1462, local1805, local1814, local1470, arg1.anIntArray326[local1429]);
							local920 = Static23.aFloat18;
							local889 = Static301.aFloat130;
							local1479 = local1470 / 2.0F;
							if ((local1814 & 0x1) == 0) {
								if (local1384 - local1380 > local1479) {
									local1392 = 1;
									local1384 -= local1470;
								} else if (local1380 - local1384 > local1479) {
									local1392 = 2;
									local1384 += local1470;
								}
								if (local920 - local1380 > local1479) {
									local1394 = 1;
									local920 -= local1470;
								} else if (local1380 - local920 > local1479) {
									local920 += local1470;
									local1394 = 2;
								}
							} else {
								if (local889 - local1382 > local1479) {
									local889 -= local1470;
									local1394 = 1;
								} else if (local1479 < local1382 - local889) {
									local889 += local1470;
									local1394 = 2;
								}
								if (local891 - local1382 > local1479) {
									local891 -= local1470;
									local1392 = 1;
								} else if (local1382 - local891 > local1479) {
									local891 += local1470;
									local1392 = 2;
								}
							}
						} else if (local1412 == 2) {
							local1470 = (float) arg1.anIntArray334[local1056] / 256.0F;
							local1479 = (float) arg1.anIntArray332[local1056] / 256.0F;
							@Pc(2053) int local2053 = arg1.anIntArray326[local1424] - arg1.anIntArray326[local1419];
							@Pc(2064) int local2064 = arg1.anIntArray328[local1424] - arg1.anIntArray328[local1419];
							@Pc(2075) int local2075 = arg1.anIntArray336[local1424] - arg1.anIntArray336[local1419];
							@Pc(2085) int local2085 = arg1.anIntArray326[local1429] - arg1.anIntArray326[local1419];
							@Pc(2096) int local2096 = arg1.anIntArray328[local1429] - arg1.anIntArray328[local1419];
							@Pc(2107) int local2107 = arg1.anIntArray336[local1429] - arg1.anIntArray336[local1419];
							@Pc(2116) int local2116 = local2064 * local2107 - local2075 * local2096;
							@Pc(2125) int local2125 = local2075 * local2085 - local2053 * local2107;
							@Pc(2134) int local2134 = local2096 * local2053 - local2085 * local2064;
							local1563 = 64.0F / (float) arg1.anIntArray331[local1056];
							local1571 = 64.0F / (float) arg1.anIntArray327[local1056];
							local1580 = 64.0F / (float) arg1.anIntArray333[local1056];
							local1588 = ((float) local2125 * local1809[1] + local1809[0] * (float) local2116 + local1809[2] * (float) local2134) / local1563;
							local1596 = (local1809[5] * (float) local2134 + (float) local2116 * local1809[3] + (float) local2125 * local1809[4]) / local1571;
							local1605 = (local1809[6] * (float) local2116 + (float) local2125 * local1809[7] + local1809[8] * (float) local2134) / local1580;
							local1396 = Static272.method4087(local1605, local1588, local1596);
							Static48.method7039(local1797, local1470, arg1.anIntArray336[local1419], local1396, local1809, local1462, arg1.anIntArray326[local1419], local1805, local1801, arg1.anIntArray328[local1419], local1814, local1479);
							local1382 = Static41.aFloat21;
							local1380 = Static460.aFloat174;
							Static48.method7039(local1797, local1470, arg1.anIntArray336[local1424], local1396, local1809, local1462, arg1.anIntArray326[local1424], local1805, local1801, arg1.anIntArray328[local1424], local1814, local1479);
							local1384 = Static460.aFloat174;
							local891 = Static41.aFloat21;
							Static48.method7039(local1797, local1470, arg1.anIntArray336[local1429], local1396, local1809, local1462, arg1.anIntArray326[local1429], local1805, local1801, arg1.anIntArray328[local1429], local1814, local1479);
							local889 = Static41.aFloat21;
							local920 = Static460.aFloat174;
						} else if (local1412 == 3) {
							Static576.method7865(local1797, arg1.anIntArray326[local1419], local1805, arg1.anIntArray328[local1419], local1809, local1462, local1814, local1801, arg1.anIntArray336[local1419]);
							local1380 = Static4.aFloat5;
							local1382 = Static166.aFloat118;
							Static576.method7865(local1797, arg1.anIntArray326[local1424], local1805, arg1.anIntArray328[local1424], local1809, local1462, local1814, local1801, arg1.anIntArray336[local1424]);
							local891 = Static166.aFloat118;
							local1384 = Static4.aFloat5;
							Static576.method7865(local1797, arg1.anIntArray326[local1429], local1805, arg1.anIntArray328[local1429], local1809, local1462, local1814, local1801, arg1.anIntArray336[local1429]);
							local889 = Static166.aFloat118;
							local920 = Static4.aFloat5;
							if ((local1814 & 0x1) == 0) {
								if (local920 - local1380 > 0.5F) {
									local1394 = 1;
									local920--;
								} else if (local1380 - local920 > 0.5F) {
									local920++;
									local1394 = 2;
								}
								if (local1384 - local1380 > 0.5F) {
									local1392 = 1;
									local1384--;
								} else if (local1380 - local1384 > 0.5F) {
									local1384++;
									local1392 = 2;
								}
							} else {
								if (local889 - local1382 > 0.5F) {
									local1394 = 1;
									local889--;
								} else if (local1382 - local889 > 0.5F) {
									local1394 = 2;
									local889++;
								}
								if (local891 - local1382 > 0.5F) {
									local1392 = 1;
									local891--;
								} else if (local1382 - local891 > 0.5F) {
									local1392 = 2;
									local891++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray46 == null) {
				local1412 = 0;
			} else {
				local1412 = arg1.aByteArray46[local1333];
			}
			if (local1412 == 0) {
				@Pc(2573) long local2573 = (long) (local1056 << 2) + ((long) (local1396 << 24) + (long) (local1340 << 8) + (long) local638 << 32);
				local1429 = arg1.aShortArray52[local1333];
				local1434 = arg1.aShortArray55[local1333];
				local1439 = arg1.aShortArray60[local1333];
				@Pc(2592) Class157 local2592 = local331[local1429];
				this.aShortArray87[local1327] = this.method5115(local1327, local1429, local2592.anInt4579, local2592.anInt4577, local1382, local2592.anInt4571, local1380, local2592.anInt4576, local2573, arg1);
				@Pc(2617) Class157 local2617 = local331[local1434];
				this.aShortArray88[local1327] = this.method5115(local1327, local1434, local2617.anInt4579, local2617.anInt4577, local891, local2617.anInt4571, local1384, local2617.anInt4576, local2573 + (long) local1392, arg1);
				@Pc(2645) Class157 local2645 = local331[local1439];
				this.aShortArray99[local1327] = this.method5115(local1327, local1439, local2645.anInt4579, local2645.anInt4577, local889, local2645.anInt4571, local920, local2645.anInt4576, (long) local1394 + local2573, arg1);
			} else if (local1412 == 1) {
				@Pc(2680) Class130 local2680 = local1015[local1333];
				@Pc(2724) long local2724 = (long) ((local2680.anInt3822 + 256 << 22) + (local2680.anInt3821 + 256 << 12) + (local2680.anInt3823 > 0 ? 1024 : 2048) + (local1056 << 2)) + ((long) local638 + (long) (local1340 << 8) + (long) (local1396 << 24) << 32);
				this.aShortArray87[local1327] = this.method5115(local1327, arg1.aShortArray52[local1333], local2680.anInt3822, 0, local1382, local2680.anInt3823, local1380, local2680.anInt3821, local2724, arg1);
				this.aShortArray88[local1327] = this.method5115(local1327, arg1.aShortArray55[local1333], local2680.anInt3822, 0, local891, local2680.anInt3823, local1384, local2680.anInt3821, local2724 + (long) local1392, arg1);
				this.aShortArray99[local1327] = this.method5115(local1327, arg1.aShortArray60[local1333], local2680.anInt3822, 0, local889, local2680.anInt3823, local920, local2680.anInt3821, local2724 + (long) local1394, arg1);
			}
			if (arg1.aShortArray58 == null) {
				this.aShortArray91[local1327] = -1;
			} else {
				this.aShortArray91[local1327] = arg1.aShortArray58[local1333];
			}
			if (arg1.aByteArray48 != null) {
				this.aByteArray83[local1327] = arg1.aByteArray48[local1333];
			}
			if (arg1.aShortArray59 != null) {
				this.aShortArray89[local1327] = arg1.aShortArray59[local1333];
			}
			this.aShortArray95[local1327] = arg1.aShortArray51[local1333];
		}
		if (this.anInt6322 > 0) {
			local1333 = 1;
			local1034 = this.aShortArray91[0];
			for (local1045 = 0; local1045 < this.anInt6322; local1045++) {
				@Pc(2874) short local2874 = this.aShortArray91[local1045];
				if (local2874 != local1034) {
					local1333++;
					local1034 = local2874;
				}
			}
			this.anIntArray446 = new int[local1333];
			this.anIntArray449 = new int[local1333];
			this.anIntArray452 = new int[local1333 + 1];
			this.anIntArray452[0] = 0;
			local1056 = this.anInt6339;
			local1333 = 0;
			@Pc(2915) short local2915 = 0;
			local1034 = this.aShortArray91[0];
			for (local683 = 0; local683 < this.anInt6322; local683++) {
				@Pc(2929) short local2929 = this.aShortArray91[local683];
				if (local1034 != local2929) {
					this.anIntArray449[local1333] = local1056;
					this.anIntArray446[local1333] = local2915 + 1 - local1056;
					local1333++;
					this.anIntArray452[local1333] = local683;
					local1034 = local2929;
					local1056 = this.anInt6339;
					local2915 = 0;
				}
				@Pc(2965) short local2965 = this.aShortArray87[local683];
				if (local1056 > local2965) {
					local1056 = local2965;
				}
				if (local2965 > local2915) {
					local2915 = local2965;
				}
				local2965 = this.aShortArray88[local683];
				if (local1056 > local2965) {
					local1056 = local2965;
				}
				if (local2965 > local2915) {
					local2915 = local2965;
				}
				local2965 = this.aShortArray99[local683];
				if (local1056 > local2965) {
					local1056 = local2965;
				}
				if (local2965 > local2915) {
					local2915 = local2965;
				}
			}
			this.anIntArray449[local1333] = local1056;
			this.anIntArray446[local1333] = local2915 + 1 - local1056;
			local1333++;
			this.anIntArray452[local1333] = this.anInt6322;
		}
		Static488.aLongArray22 = null;
		this.aShortArray90 = Static461.method6451(this.anInt6339, this.aShortArray90);
		this.aShortArray96 = Static461.method6451(this.anInt6339, this.aShortArray96);
		this.aShortArray98 = Static461.method6451(this.anInt6339, this.aShortArray98);
		this.aShortArray94 = Static461.method6451(this.anInt6339, this.aShortArray94);
		this.aShortArray97 = Static461.method6451(this.anInt6339, this.aShortArray97);
		this.aByteArray81 = Static140.method2332(this.anInt6339, this.aByteArray81);
		this.aFloatArray54 = Static413.method5909(this.anInt6339, this.aFloatArray54);
		this.aFloatArray53 = Static413.method5909(this.anInt6339, this.aFloatArray53);
		if (arg1.anIntArray329 != null && Static293.method4413(arg2, this.anInt6337)) {
			this.anIntArrayArray52 = arg1.method3349(false);
		}
		if (arg1.aClass143Array1 != null && Static340.method5221(this.anInt6337, arg2)) {
			this.anIntArrayArray51 = arg1.method3350();
		}
		if (arg1.anIntArray330 != null && Static204.method3361(arg2, this.anInt6337)) {
			local1333 = 0;
			local630 = new int[256];
			for (local1045 = 0; local1045 < this.anInt6285; local1045++) {
				local1056 = arg1.anIntArray330[local22[local1045]];
				if (local1056 >= 0) {
					if (local1056 > local1333) {
						local1333 = local1056;
					}
					@Pc(3167) int local3167 = local630[local1056]++;
				}
			}
			this.anIntArrayArray53 = new int[local1333 + 1][];
			for (local1056 = 0; local1056 <= local1333; local1056++) {
				this.anIntArrayArray53[local1056] = new int[local630[local1056]];
				local630[local1056] = 0;
			}
			for (local638 = 0; local638 < this.anInt6285; local638++) {
				local683 = arg1.anIntArray330[local22[local638]];
				if (local683 >= 0) {
					this.anIntArrayArray53[local683][local630[local683]++] = local638;
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!gj;IIZZ)V")
	public Class24_Sub3(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6285 = 0;
		this.anInt6322 = 0;
		this.anInt6309 = 0;
		this.anInt6324 = 0;
		this.anInt6339 = 0;
		this.aBoolean446 = true;
		this.aBoolean445 = false;
		this.aBoolean447 = false;
		this.anInt6317 = arg1;
		this.aBoolean445 = arg4;
		this.anInt6337 = arg2;
		this.aClass90_Sub3_9 = arg0;
		if (arg3 || Static287.method4361(this.anInt6337, this.anInt6317)) {
			this.lb = new Class227(Static19.method253(this.anInt6317, this.anInt6337));
		}
		if (arg3 || Static170.method2695(this.anInt6317, this.anInt6337)) {
			this.aClass227_2 = new Class227(Static236.method3675(this.anInt6337, this.anInt6317));
		}
		if (arg3 || Static428.method6089(this.anInt6317, this.anInt6337)) {
			this.aClass227_1 = new Class227(Static317.method4952(this.anInt6337, this.anInt6317));
		}
		if (arg3 || Static500.method6917(this.anInt6337, this.anInt6317)) {
			this.aClass227_3 = new Class227(Static366.method5423(this.anInt6317, this.anInt6337));
		}
		if (arg3 || Static337.method5191(this.anInt6337, this.anInt6317)) {
			this.aClass9_1 = new Class9(Static461.method6453(this.anInt6337, this.anInt6317));
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	private void method5103() {
		if (this.aClass317Array1 == null) {
			return;
		}
		@Pc(20) float local20 = this.aClass90_Sub3_9.method7590();
		@Pc(24) float local24 = this.aClass90_Sub3_9.method7535();
		this.aClass90_Sub3_9.method7500(false);
		this.aClass90_Sub3_9.method7528(false);
		this.aClass90_Sub3_9.method7540(1, Static20.aClass150_1);
		this.aClass90_Sub3_9.method7630(Static20.aClass150_1, 1);
		for (@Pc(47) int local47 = 0; local47 < this.anInt6326; local47++) {
			@Pc(54) Class317 local54 = this.aClass317Array1[local47];
			@Pc(59) Class169 local59 = this.aClass169Array1[local47];
			if (!local54.aBoolean574 || !this.aClass90_Sub3_9.method7496()) {
				@Pc(87) float local87 = (float) (this.anIntArray450[local54.anInt8892] + this.anIntArray450[local54.anInt8888] + this.anIntArray450[local54.anInt8890]) * 0.3333333F;
				@Pc(108) float local108 = (float) (this.anIntArray451[local54.anInt8892] + this.anIntArray451[local54.anInt8890] + this.anIntArray451[local54.anInt8888]) * 0.3333333F;
				@Pc(129) float local129 = (float) (this.anIntArray448[local54.anInt8888] + this.anIntArray448[local54.anInt8890] + this.anIntArray448[local54.anInt8892]) * 0.3333333F;
				@Pc(143) float local143 = Static144.aFloat184 + local87 * Static257.aFloat162 + Static68.aFloat22 * local108 + Static500.aFloat180 * local129;
				@Pc(157) float local157 = Static259.aFloat124 * local87 + local108 * Static445.aFloat168 + local129 * Static202.aFloat90 + Static76.aFloat24;
				@Pc(171) float local171 = local108 * Static518.aFloat183 + Static459.aFloat173 * local87 + local129 * Static400.aFloat165 + Static491.aFloat179;
				@Pc(176) Class93_Sub3 local176 = this.aClass90_Sub3_9.method7602();
				local176.method3767(local59.anInt4730, (float) local59.anInt4722 + local157, local59.anInt4728 * local54.aShort112 >> 7, (float) local59.anInt4727 + local143, local54.aShort111 * local59.anInt4725 >> 7, local171);
				local176.method3759(this.aClass90_Sub3_9.aClass93_Sub3_17);
				this.aClass90_Sub3_9.method7619();
				this.aClass90_Sub3_9.ka(local24, local20 - (float) local54.anInt8887 * 1.5F);
				@Pc(231) int local231 = local59.anInt4726;
				this.aClass90_Sub3_9.method7548(false, local54.aShort113, false);
				this.aClass90_Sub3_9.method7640(local54.aByte96);
				this.aClass90_Sub3_9.method7650(local231);
				this.aClass90_Sub3_9.method7559();
			}
		}
		this.aClass90_Sub3_9.method7630(Static422.aClass150_7, 1);
		this.aClass90_Sub3_9.method7540(1, Static422.aClass150_7);
		this.aClass90_Sub3_9.ka(local24, local20);
		this.aClass90_Sub3_9.method7500(true);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
	private void method5104() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt6309; local23++) {
			@Pc(30) int local30 = this.anIntArray450[local23];
			@Pc(35) int local35 = this.anIntArray451[local23];
			if (local7 > local30) {
				local7 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			@Pc(58) int local58 = this.anIntArray448[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local11 > local58) {
				local11 = local58;
			}
			if (local58 > local17) {
				local17 = local58;
			}
			@Pc(95) int local95 = local30 * local30 + local58 * local58;
			if (local19 < local95) {
				local19 = local95;
			}
			local95 = local58 * local58 + local30 * local30 + local35 * local35;
			if (local21 < local95) {
				local21 = local95;
			}
		}
		this.anInt6345 = local9;
		this.anInt6296 = local13;
		this.anInt6332 = local15;
		this.anInt6333 = local7;
		this.anInt6315 = local11;
		this.anInt6306 = local17;
		this.anInt6294 = (int) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean447 = true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt6285; local7++) {
			local16 = this.aShortArray95[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 += (arg2 - local32) * arg3 >> 7;
			}
			this.aShortArray95[local7] = (short) (local22 << 10 | local28 << 7 | local32);
		}
		if (this.aClass317Array1 != null) {
			for (local16 = 0; local16 < this.anInt6326; local16++) {
				@Pc(111) Class317 local111 = this.aClass317Array1[local16];
				@Pc(116) Class169 local116 = this.aClass169Array1[local16];
				local116.anInt4726 = local116.anInt4726 & 0xFF000000 | Static36.anIntArray31[this.aShortArray95[local111.anInt8893] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5108();
	}

	@OriginalMember(owner = "client!na", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) Class46 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean447) {
			this.method5104();
		}
		@Pc(16) int local16 = arg4 + this.anInt6333;
		@Pc(21) int local21 = this.anInt6296 + arg4;
		@Pc(27) int local27 = arg6 + this.anInt6315;
		@Pc(32) int local32 = arg6 + this.anInt6306;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt9998 >> arg2.anInt10000 >= arg2.anInt9997 || local27 < 0 || arg2.anInt9995 <= local32 + arg2.anInt9998 >> arg2.anInt10000)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9997 <= local21 + arg3.anInt9998 >> arg3.anInt10000 || local27 < 0 || local32 + arg3.anInt9998 >> arg3.anInt10000 >= arg3.anInt9995) {
				return;
			}
		} else {
			local16 >>= arg2.anInt10000;
			local21 = local21 + arg2.anInt9998 - 1 >> arg2.anInt10000;
			local27 >>= arg2.anInt10000;
			local32 = local32 + arg2.anInt9998 - 1 >> arg2.anInt10000;
			if (arg5 == arg2.JA(local16, local27) && arg5 == arg2.JA(local21, local27) && arg5 == arg2.JA(local16, local32) && arg5 == arg2.JA(local21, local32)) {
				return;
			}
		}
		@Pc(204) int local204;
		if (arg0 == 1) {
			for (local204 = 0; local204 < this.anInt6309; local204++) {
				this.anIntArray451[local204] = this.anIntArray451[local204] + arg2.sa(arg4 + this.anIntArray450[local204], this.anIntArray448[local204] - -arg6) - arg5;
			}
		} else {
			@Pc(212) int local212;
			@Pc(220) int local220;
			if (arg0 == 2) {
				local204 = this.anInt6345;
				if (local204 == 0) {
					return;
				}
				for (local212 = 0; local212 < this.anInt6309; local212++) {
					local220 = (this.anIntArray451[local212] << 16) / local204;
					if (local220 < arg1) {
						this.anIntArray451[local212] -= -((arg1 - local220) * (-arg5 + arg2.sa(arg4 + this.anIntArray450[local212], arg6 + this.anIntArray448[local212])) / arg1);
					}
				}
			} else {
				@Pc(228) int local228;
				if (arg0 == 3) {
					local204 = (arg1 & 0xFF) * 4;
					local212 = (arg1 >> 8 & 0xFF) * 4;
					local220 = (arg1 >> 16 & 0xFF) << 6;
					local228 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local204 >> 1) < 0 || (local204 >> 1) + (arg4 + arg2.anInt9998) >= arg2.anInt9997 << arg2.anInt10000 || arg6 - (local212 >> 1) < 0 || arg2.anInt9995 << arg2.anInt10000 <= arg6 + (local212 >> 1) + arg2.anInt9998) {
						return;
					}
					this.method7396(arg4, arg5, local220, arg6, local228, local212, local204, arg2);
				} else if (arg0 == 4) {
					local204 = this.anInt6332 - this.anInt6345;
					for (local212 = 0; local212 < this.anInt6309; local212++) {
						this.anIntArray451[local212] = local204 + this.anIntArray451[local212] + arg3.sa(this.anIntArray450[local212] - -arg4, arg6 + this.anIntArray448[local212]) - arg5;
					}
				} else if (arg0 == 5) {
					local204 = this.anInt6332 - this.anInt6345;
					for (local212 = 0; local212 < this.anInt6309; local212++) {
						local220 = this.anIntArray450[local212] + arg4;
						local228 = arg6 + this.anIntArray448[local212];
						@Pc(330) int local330 = arg2.sa(local220, local228);
						@Pc(335) int local335 = arg3.sa(local220, local228);
						@Pc(339) int local339 = local330 - local335;
						this.anIntArray451[local212] = local330 + (local339 * ((this.anIntArray451[local212] << 8) / local204) >> 8) - arg5;
					}
				}
			}
		}
		this.method5113();
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!na", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class22.anIntArray20[arg0];
		@Pc(13) int local13 = Class22.anIntArray19[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6309; local15++) {
			local33 = local9 * this.anIntArray448[local15] + local13 * this.anIntArray450[local15] >> 14;
			this.anIntArray448[local15] = this.anIntArray448[local15] * local13 - this.anIntArray450[local15] * local9 >> 14;
			this.anIntArray450[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6339; local33++) {
			@Pc(87) int local87 = local9 * this.aShortArray97[local33] + this.aShortArray98[local33] * local13 >> 14;
			this.aShortArray97[local33] = (short) (local13 * this.aShortArray97[local33] - local9 * this.aShortArray98[local33] >> 14);
			this.aShortArray98[local33] = (short) local87;
		}
		this.method5113();
		this.method5116();
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt6317;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public void method5105() {
		if (this.lb != null) {
			this.lb.method5393();
		}
		if (this.aClass227_2 != null) {
			this.aClass227_2.method5393();
		}
		if (this.aClass227_1 != null) {
			this.aClass227_1.method5393();
		}
		if (this.aClass227_3 != null) {
			this.aClass227_3.method5393();
		}
		if (this.aClass9_1 != null) {
			this.aClass9_1.method136();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!lb;)V")
	private void method5106(@OriginalArg(1) Class6_Sub5_Sub10_Sub1 arg0) {
		if (this.anInt6339 > Static342.anIntArray454.length) {
			Static342.anIntArray454 = new int[this.anInt6339];
			Static499.anIntArray639 = new int[this.anInt6339];
		}
		@Pc(47) int local47;
		@Pc(95) int local95;
		for (@Pc(20) int local20 = 0; local20 < this.anInt6309; local20++) {
			local47 = (this.anIntArray450[local20] - (this.aClass90_Sub3_9.anInt9583 * this.anIntArray451[local20] >> 8) >> this.aClass90_Sub3_9.anInt9574) - arg0.anInt5249;
			@Pc(72) int local72 = (this.anIntArray448[local20] - (this.aClass90_Sub3_9.anInt9578 * this.anIntArray451[local20] >> 8) >> this.aClass90_Sub3_9.anInt9574) - arg0.anInt5254;
			@Pc(77) int local77 = this.anIntArray447[local20];
			@Pc(84) int local84 = this.anIntArray447[local20 + 1];
			for (@Pc(86) int local86 = local77; local86 < local84; local86++) {
				local95 = this.aShortArray92[local86] - 1;
				if (local95 == -1) {
					break;
				}
				Static342.anIntArray454[local95] = local47;
				Static499.anIntArray639[local95] = local72;
			}
		}
		for (local47 = 0; local47 < this.anInt6322; local47++) {
			if (this.aByteArray83 == null || this.aByteArray83[local47] <= 128) {
				@Pc(152) short local152 = this.aShortArray87[local47];
				@Pc(157) short local157 = this.aShortArray88[local47];
				@Pc(162) short local162 = this.aShortArray99[local47];
				local95 = Static342.anIntArray454[local152];
				@Pc(170) int local170 = Static342.anIntArray454[local157];
				@Pc(174) int local174 = Static342.anIntArray454[local162];
				@Pc(178) int local178 = Static499.anIntArray639[local152];
				@Pc(182) int local182 = Static499.anIntArray639[local157];
				@Pc(186) int local186 = Static499.anIntArray639[local162];
				if (-((local174 - local170) * (-local178 + local182)) + (local182 - local186) * (local95 - local170) > 0) {
					arg0.method4338(local178, local182, local95, local186, local170, local174);
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V")
	private void method5107() {
		if (this.anInt6322 == 0) {
			return;
		}
		if (this.method5114() && this.method5111()) {
			this.aClass90_Sub3_9.method7658(this.lb.anInterface8_12, 0);
			this.aClass90_Sub3_9.method7658(this.aClass227_1.anInterface8_12, 1);
			this.aClass90_Sub3_9.method7658(this.aClass227_2.anInterface8_12, 2);
			@Pc(59) boolean local59;
			if ((this.anInt6337 & 0x37) == 0) {
				this.aClass90_Sub3_9.method7528(false);
				local59 = false;
				this.aClass90_Sub3_9.method7553(this.aClass90_Sub3_9.aClass107_15);
			} else {
				local59 = true;
				this.aClass90_Sub3_9.method7528(true);
				this.aClass90_Sub3_9.method7658(this.aClass227_3.anInterface8_12, 3);
				this.aClass90_Sub3_9.method7553(this.aClass90_Sub3_9.aClass107_20);
			}
			for (@Pc(94) int local94 = 0; local94 < this.anIntArray449.length; local94++) {
				@Pc(101) int local101 = this.anIntArray452[local94];
				@Pc(108) int local108 = this.anIntArray452[local94 + 1];
				@Pc(115) int local115 = this.aShortArray91[local101] & 0xFFFF;
				if (local115 == 65535) {
					local115 = -1;
				}
				this.aClass90_Sub3_9.method7548(local59, local115, true);
				this.aClass90_Sub3_9.method7560(this.anIntArray446[local94], local108 - local101, this.anIntArray449[local94], this.aClass9_1.anInterface9_1, Static104.aClass321_1, local101 * 3);
			}
		}
		this.method5110();
	}

	@OriginalMember(owner = "client!na", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6309; local7++) {
			this.anIntArray448[local7] = -this.anIntArray448[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt6339; local29++) {
			this.aShortArray97[local29] = (short) -this.aShortArray97[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt6285; local52++) {
			@Pc(59) short local59 = this.aShortArray87[local52];
			this.aShortArray87[local52] = this.aShortArray99[local52];
			this.aShortArray99[local52] = local59;
		}
		this.method5113();
		this.method5116();
		this.method5112();
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
	private void method5108() {
		if (this.aClass227_1 != null) {
			this.aClass227_1.aBoolean464 = false;
		}
	}

	@OriginalMember(owner = "client!na", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean447) {
			this.method5104();
		}
		return this.anInt6294;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	private void method5110() {
		if (!this.aBoolean446) {
			return;
		}
		this.aBoolean446 = false;
		if (this.aClass33Array6 == null && this.aClass335Array6 == null && this.aClass317Array1 == null) {
			if (this.anIntArray450 != null && !Static242.method3766(this.anInt6337, this.anInt6317)) {
				if (this.lb == null || this.lb.method5392()) {
					if (!this.aBoolean447) {
						this.method5104();
					}
					this.anIntArray450 = null;
				} else {
					this.aBoolean446 = true;
				}
			}
			if (this.anIntArray451 != null && !Static565.method7805(this.anInt6337, this.anInt6317)) {
				if (this.lb == null || this.lb.method5392()) {
					if (!this.aBoolean447) {
						this.method5104();
					}
					this.anIntArray451 = null;
				} else {
					this.aBoolean446 = true;
				}
			}
			if (this.anIntArray448 != null && !Static120.method1870(this.anInt6337, this.anInt6317)) {
				if (this.lb == null || this.lb.method5392()) {
					if (!this.aBoolean447) {
						this.method5104();
					}
					this.anIntArray448 = null;
				} else {
					this.aBoolean446 = true;
				}
			}
		}
		if (this.aShortArray92 != null && this.anIntArray450 == null && this.anIntArray451 == null && this.anIntArray448 == null) {
			this.aShortArray92 = null;
			this.anIntArray447 = null;
		}
		if (this.aByteArray81 != null && !Static313.method4909(this.anInt6337, this.anInt6317)) {
			label195: {
				label194: {
					@Pc(167) boolean local167;
					if ((this.anInt6337 & 0x37) == 0) {
						if (this.aClass227_1 == null || this.aClass227_1.method5392()) {
							break label194;
						}
						local167 = false;
					} else {
						if (this.aClass227_3 == null || this.aClass227_3.method5392()) {
							break label194;
						}
						local167 = false;
					}
					if (!local167) {
						this.aBoolean446 = true;
						break label195;
					}
				}
				this.aByteArray81 = null;
				this.aShortArray98 = this.aShortArray94 = this.aShortArray97 = null;
			}
		}
		if (this.aShortArray95 != null && !Static383.method5606(this.anInt6317, this.anInt6337)) {
			if (this.aClass227_1 == null || this.aClass227_1.method5392()) {
				this.aShortArray95 = null;
			} else {
				this.aBoolean446 = true;
			}
		}
		if (this.aByteArray83 != null && !Static512.method7029(this.anInt6337, this.anInt6317)) {
			if (this.aClass227_1 == null || this.aClass227_1.method5392()) {
				this.aByteArray83 = null;
			} else {
				this.aBoolean446 = true;
			}
		}
		if (this.aFloatArray54 != null && !Static177.method2958(this.anInt6337, this.anInt6317)) {
			if (this.aClass227_2 == null || this.aClass227_2.method5392()) {
				this.aFloatArray54 = this.aFloatArray53 = null;
			} else {
				this.aBoolean446 = true;
			}
		}
		if (this.aShortArray91 != null && !Static204.method3360(this.anInt6337, this.anInt6317)) {
			if (this.aClass227_1 == null || this.aClass227_1.method5392()) {
				this.aShortArray91 = null;
			} else {
				this.aBoolean446 = true;
			}
		}
		if (this.aShortArray87 != null && !Static246.method7302(this.anInt6337, this.anInt6317)) {
			if ((this.aClass9_1 == null || this.aClass9_1.method135()) && (this.aClass227_1 == null || this.aClass227_1.method5392())) {
				this.aShortArray87 = this.aShortArray88 = this.aShortArray99 = null;
			} else {
				this.aBoolean446 = true;
			}
		}
		if (this.aShortArray90 != null) {
			if (this.lb == null || this.lb.method5392()) {
				this.aShortArray90 = null;
			} else {
				this.aBoolean446 = true;
			}
		}
		if (this.aShortArray96 != null) {
			if (this.aClass227_1 == null || this.aClass227_1.method5392()) {
				this.aShortArray96 = null;
			} else {
				this.aBoolean446 = true;
			}
		}
		if (this.anIntArrayArray53 != null && !Static204.method3361(this.anInt6317, this.anInt6337)) {
			this.aShortArray89 = null;
			this.anIntArrayArray53 = null;
		}
		if (this.anIntArrayArray52 != null && !Static293.method4413(this.anInt6317, this.anInt6337)) {
			this.anIntArrayArray52 = null;
			this.aShortArray93 = null;
		}
		if (this.anIntArrayArray51 != null && !Static340.method5221(this.anInt6337, this.anInt6317)) {
			this.anIntArrayArray51 = null;
		}
		if (this.anIntArray452 != null && (this.anInt6317 & 0x800) == 0 && (this.anInt6317 & 0x40000) == 0) {
			this.anIntArray452 = null;
			this.anIntArray449 = null;
			this.anIntArray446 = null;
		}
	}

	@OriginalMember(owner = "client!na", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean447) {
			this.method5104();
		}
		return this.anInt6306;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!q;Lclient!rc;II)V")
	@Override
	public void method7392(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class60_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6339 == 0) {
			return;
		}
		@Pc(16) Class93_Sub3 local16 = this.aClass90_Sub3_9.aClass93_Sub3_16;
		@Pc(19) Class93_Sub3 local19 = (Class93_Sub3) arg0;
		if (!this.aBoolean447) {
			this.method5104();
		}
		Static518.aFloat183 = local16.aFloat114 * local19.aFloat117 + local16.aFloat116 * local19.aFloat108 + local16.aFloat117 * local19.aFloat115;
		Static491.aFloat179 = local16.aFloat106 + local16.aFloat117 * local19.aFloat113 + local16.aFloat116 * local19.aFloat110 + local19.aFloat106 * local16.aFloat114;
		@Pc(72) float local72 = Static491.aFloat179 + (float) this.anInt6345 * Static518.aFloat183;
		@Pc(80) float local80 = Static518.aFloat183 * (float) this.anInt6332 + Static491.aFloat179;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local72 > local80) {
			local97 = local72 + (float) this.anInt6294;
			local91 = local80 - (float) this.anInt6294;
		} else {
			local91 = (float) -this.anInt6294 + local72;
			local97 = (float) this.anInt6294 + local80;
		}
		if (this.aClass90_Sub3_9.aFloat196 <= local91 || local97 <= (float) this.aClass90_Sub3_9.anInt9557) {
			return;
		}
		Static68.aFloat22 = local19.aFloat117 * local16.aFloat109 + local16.aFloat112 * local19.aFloat108 + local16.aFloat108 * local19.aFloat115;
		Static144.aFloat184 = local16.aFloat110 + local19.aFloat110 * local16.aFloat112 + local16.aFloat108 * local19.aFloat113 + local19.aFloat106 * local16.aFloat109;
		@Pc(173) float local173 = Static144.aFloat184 + Static68.aFloat22 * (float) this.anInt6345;
		@Pc(181) float local181 = Static144.aFloat184 + (float) this.anInt6332 * Static68.aFloat22;
		@Pc(208) float local208;
		@Pc(196) float local196;
		if (local181 < local173) {
			local196 = (local173 + (float) this.anInt6294) * (float) this.aClass90_Sub3_9.anInt9575;
			local208 = ((float) -this.anInt6294 + local181) * (float) this.aClass90_Sub3_9.anInt9575;
		} else {
			local196 = ((float) this.anInt6294 + local181) * (float) this.aClass90_Sub3_9.anInt9575;
			local208 = (float) this.aClass90_Sub3_9.anInt9575 * ((float) -this.anInt6294 + local173);
		}
		if (this.aClass90_Sub3_9.aFloat197 <= local208 / (float) arg2 || this.aClass90_Sub3_9.aFloat203 >= local196 / (float) arg2) {
			return;
		}
		Static445.aFloat168 = local19.aFloat108 * local16.aFloat111 + local16.aFloat115 * local19.aFloat115 + local19.aFloat117 * local16.aFloat107;
		Static76.aFloat24 = local19.aFloat110 * local16.aFloat111 + local16.aFloat115 * local19.aFloat113 + local19.aFloat106 * local16.aFloat107 + local16.aFloat113;
		@Pc(300) float local300 = (float) this.anInt6345 * Static445.aFloat168 + Static76.aFloat24;
		@Pc(308) float local308 = Static76.aFloat24 + Static445.aFloat168 * (float) this.anInt6332;
		@Pc(335) float local335;
		@Pc(323) float local323;
		if (local300 > local308) {
			local335 = (float) this.aClass90_Sub3_9.anInt9586 * ((float) -this.anInt6294 + local308);
			local323 = (float) this.aClass90_Sub3_9.anInt9586 * (local300 + (float) this.anInt6294);
		} else {
			local323 = (float) this.aClass90_Sub3_9.anInt9586 * (local308 + (float) this.anInt6294);
			local335 = ((float) -this.anInt6294 + local300) * (float) this.aClass90_Sub3_9.anInt9586;
		}
		if (this.aClass90_Sub3_9.aFloat195 <= local335 / (float) arg2 || this.aClass90_Sub3_9.aFloat191 >= local323 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass317Array1 != null) {
			Static400.aFloat165 = local16.aFloat114 * local19.aFloat114 + local19.aFloat109 * local16.aFloat116 + local19.aFloat107 * local16.aFloat117;
			Static259.aFloat124 = local19.aFloat112 * local16.aFloat111 + local16.aFloat115 * local19.aFloat111 + local19.aFloat116 * local16.aFloat107;
			Static257.aFloat162 = local16.aFloat108 * local19.aFloat111 + local16.aFloat112 * local19.aFloat112 + local16.aFloat109 * local19.aFloat116;
			Static459.aFloat173 = local19.aFloat116 * local16.aFloat114 + local19.aFloat111 * local16.aFloat117 + local19.aFloat112 * local16.aFloat116;
			Static202.aFloat90 = local19.aFloat114 * local16.aFloat107 + local16.aFloat111 * local19.aFloat109 + local19.aFloat107 * local16.aFloat115;
			Static500.aFloat180 = local16.aFloat108 * local19.aFloat107 + local16.aFloat112 * local19.aFloat109 + local19.aFloat114 * local16.aFloat109;
		}
		if (arg1 != null) {
			@Pc(503) int local503 = this.anInt6296 + this.anInt6333 >> 1;
			@Pc(511) int local511 = this.anInt6306 + this.anInt6315 >> 1;
			@Pc(530) int local530 = (int) (Static144.aFloat184 + Static257.aFloat162 * (float) local503 + (float) this.anInt6345 * Static68.aFloat22 + (float) local511 * Static500.aFloat180);
			@Pc(549) int local549 = (int) ((float) local511 * Static202.aFloat90 + Static445.aFloat168 * (float) this.anInt6345 + Static259.aFloat124 * (float) local503 + Static76.aFloat24);
			@Pc(568) int local568 = (int) ((float) local511 * Static400.aFloat165 + Static518.aFloat183 * (float) this.anInt6345 + Static491.aFloat179 + Static459.aFloat173 * (float) local503);
			@Pc(587) int local587 = (int) (Static500.aFloat180 * (float) local511 + Static144.aFloat184 + (float) local503 * Static257.aFloat162 + (float) this.anInt6332 * Static68.aFloat22);
			@Pc(606) int local606 = (int) ((float) local511 * Static202.aFloat90 + (float) this.anInt6332 * Static445.aFloat168 + Static76.aFloat24 + Static259.aFloat124 * (float) local503);
			arg1.anInt7808 = local530 * this.aClass90_Sub3_9.anInt9575 / arg2 + this.aClass90_Sub3_9.anInt9552;
			@Pc(638) int local638 = (int) (Static459.aFloat173 * (float) local503 + Static491.aFloat179 + (float) this.anInt6332 * Static518.aFloat183 + (float) local511 * Static400.aFloat165);
			arg1.anInt7810 = this.aClass90_Sub3_9.anInt9586 * local606 / arg2 + this.aClass90_Sub3_9.anInt9576;
			arg1.anInt7809 = this.aClass90_Sub3_9.anInt9575 * local587 / arg2 + this.aClass90_Sub3_9.anInt9552;
			arg1.anInt7807 = this.aClass90_Sub3_9.anInt9576 + local549 * this.aClass90_Sub3_9.anInt9586 / arg2;
			if (local568 < this.aClass90_Sub3_9.anInt9557 && this.aClass90_Sub3_9.anInt9557 > local638) {
				arg1.aBoolean513 = true;
				arg1.anInt7806 = this.aClass90_Sub3_9.anInt9552 + (local530 + this.anInt6294) * this.aClass90_Sub3_9.anInt9575 / arg2 - arg1.anInt7808;
			}
		}
		this.aClass90_Sub3_9.method7608((float) arg2);
		this.aClass90_Sub3_9.method7604();
		this.aClass90_Sub3_9.method7586(local19);
		this.method5107();
		this.method5103();
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)Z")
	private boolean method5111() {
		if (this.aClass9_1.aBoolean11) {
			return true;
		}
		if (this.aClass9_1.anInterface9_2 == null) {
			this.aClass9_1.anInterface9_2 = this.aClass90_Sub3_9.method7545(this.aBoolean445);
		}
		@Pc(33) Interface9 local33 = this.aClass9_1.anInterface9_2;
		local33.method5935(this.anInt6322 * 6);
		@Pc(45) Buffer local45 = local33.method6462();
		if (local45 != null) {
			@Pc(53) Stream local53 = this.aClass90_Sub3_9.method7595(local45);
			@Pc(57) int local57;
			if (Stream.a()) {
				for (local57 = 0; local57 < this.anInt6322; local57++) {
					local53.e(this.aShortArray87[local57]);
					local53.e(this.aShortArray88[local57]);
					local53.e(this.aShortArray99[local57]);
				}
			} else {
				for (local57 = 0; local57 < this.anInt6322; local57++) {
					local53.a(this.aShortArray87[local57]);
					local53.a(this.aShortArray88[local57]);
					local53.a(this.aShortArray99[local57]);
				}
			}
			local53.b();
			if (local33.method6460()) {
				this.aClass9_1.anInterface9_1 = local33;
				this.aClass9_1.aBoolean11 = true;
				this.aBoolean446 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!na", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class6_Sub5_Sub10 Z(@OriginalArg(0) Class6_Sub5_Sub10 arg0) {
		if (this.anInt6339 == 0) {
			return null;
		}
		if (!this.aBoolean447) {
			this.method5104();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass90_Sub3_9.anInt9583 <= 0) {
			local40 = this.anInt6333 - (this.anInt6345 * this.aClass90_Sub3_9.anInt9583 >> 8) >> this.aClass90_Sub3_9.anInt9574;
			local57 = this.anInt6296 - (this.aClass90_Sub3_9.anInt9583 * this.anInt6332 >> 8) >> this.aClass90_Sub3_9.anInt9574;
		} else {
			local40 = this.anInt6333 - (this.aClass90_Sub3_9.anInt9583 * this.anInt6332 >> 8) >> this.aClass90_Sub3_9.anInt9574;
			local57 = this.anInt6296 - (this.anInt6345 * this.aClass90_Sub3_9.anInt9583 >> 8) >> this.aClass90_Sub3_9.anInt9574;
		}
		@Pc(117) int local117;
		@Pc(134) int local134;
		if (this.aClass90_Sub3_9.anInt9578 > 0) {
			local117 = this.anInt6315 - (this.anInt6332 * this.aClass90_Sub3_9.anInt9578 >> 8) >> this.aClass90_Sub3_9.anInt9574;
			local134 = this.anInt6306 - (this.aClass90_Sub3_9.anInt9578 * this.anInt6345 >> 8) >> this.aClass90_Sub3_9.anInt9574;
		} else {
			local117 = this.anInt6315 - (this.anInt6345 * this.aClass90_Sub3_9.anInt9578 >> 8) >> this.aClass90_Sub3_9.anInt9574;
			local134 = this.anInt6306 - (this.anInt6332 * this.aClass90_Sub3_9.anInt9578 >> 8) >> this.aClass90_Sub3_9.anInt9574;
		}
		@Pc(177) int local177 = local57 + 1 - local40;
		@Pc(184) int local184 = local134 + 1 - local117;
		@Pc(187) Class6_Sub5_Sub10_Sub1 local187 = (Class6_Sub5_Sub10_Sub1) arg0;
		@Pc(197) Class6_Sub5_Sub10_Sub1 local197;
		if (local187 != null && local187.method4341(local177, local184)) {
			local197 = local187;
			local187.method4339();
		} else {
			local197 = new Class6_Sub5_Sub10_Sub1(this.aClass90_Sub3_9, local177, local184);
		}
		local197.method4340(local117, local57, local40, local134);
		this.method5106(local197);
		return local197;
	}

	@OriginalMember(owner = "client!na", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			local22 = arg2 << 4;
			Static331.anInt6267 = 0;
			Static117.anInt2015 = 0;
			Static150.anInt2794 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray52.length) {
					local52 = this.anIntArrayArray52[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static331.anInt6267 += this.anIntArray450[local60];
						Static117.anInt2015 += this.anIntArray451[local60];
						local30++;
						Static150.anInt2794 += this.anIntArray448[local60];
					}
				}
			}
			if (local30 <= 0) {
				Static150.anInt2794 = local14;
				Static331.anInt6267 = local22;
				Static117.anInt2015 = local18;
			} else {
				Static117.anInt2015 = local18 + Static117.anInt2015 / local30;
				Static150.anInt2794 = local14 + Static150.anInt2794 / local30;
				Static331.anInt6267 = local22 + Static331.anInt6267 / local30;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			local22 = arg2 << 4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray52.length > local32) {
					local162 = this.anIntArrayArray52[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local54 = local162[local164];
						this.anIntArray450[local54] += local22;
						this.anIntArray451[local54] += local18;
						this.anIntArray448[local54] += local14;
					}
				}
			}
			return;
		}
		@Pc(286) int local286;
		@Pc(304) int local304;
		@Pc(760) int local760;
		@Pc(769) int local769;
		if (arg0 == 2) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray52.length) {
					local162 = this.anIntArrayArray52[local32];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							this.anIntArray450[local54] -= Static331.anInt6267;
							this.anIntArray451[local54] -= Static117.anInt2015;
							this.anIntArray448[local54] -= Static150.anInt2794;
							if (arg4 != 0) {
								local60 = Class22.anIntArray20[arg4];
								local286 = Class22.anIntArray19[arg4];
								local304 = local286 * this.anIntArray450[local54] + this.anIntArray451[local54] * local60 + 16383 >> 14;
								this.anIntArray451[local54] = this.anIntArray451[local54] * local286 + 16383 - this.anIntArray450[local54] * local60 >> 14;
								this.anIntArray450[local54] = local304;
							}
							if (arg2 != 0) {
								local60 = Class22.anIntArray20[arg2];
								local286 = Class22.anIntArray19[arg2];
								local304 = local286 * this.anIntArray451[local54] + 16383 - local60 * this.anIntArray448[local54] >> 14;
								this.anIntArray448[local54] = local286 * this.anIntArray448[local54] + this.anIntArray451[local54] * local60 + 16383 >> 14;
								this.anIntArray451[local54] = local304;
							}
							if (arg3 != 0) {
								local60 = Class22.anIntArray20[arg3];
								local286 = Class22.anIntArray19[arg3];
								local304 = this.anIntArray450[local54] * local286 + local60 * this.anIntArray448[local54] + 16383 >> 14;
								this.anIntArray448[local54] = this.anIntArray448[local54] * local286 + 16383 - this.anIntArray450[local54] * local60 >> 14;
								this.anIntArray450[local54] = local304;
							}
							this.anIntArray450[local54] += Static331.anInt6267;
							this.anIntArray451[local54] += Static117.anInt2015;
							this.anIntArray448[local54] += Static150.anInt2794;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							this.anIntArray450[local54] -= Static331.anInt6267;
							this.anIntArray451[local54] -= Static117.anInt2015;
							this.anIntArray448[local54] -= Static150.anInt2794;
							if (arg2 != 0) {
								local60 = Class22.anIntArray20[arg2];
								local286 = Class22.anIntArray19[arg2];
								local304 = local286 * this.anIntArray451[local54] + 16383 - local60 * this.anIntArray448[local54] >> 14;
								this.anIntArray448[local54] = local60 * this.anIntArray451[local54] + local286 * this.anIntArray448[local54] + 16383 >> 14;
								this.anIntArray451[local54] = local304;
							}
							if (arg4 != 0) {
								local60 = Class22.anIntArray20[arg4];
								local286 = Class22.anIntArray19[arg4];
								local304 = this.anIntArray450[local54] * local286 + this.anIntArray451[local54] * local60 + 16383 >> 14;
								this.anIntArray451[local54] = local286 * this.anIntArray451[local54] + 16383 - local60 * this.anIntArray450[local54] >> 14;
								this.anIntArray450[local54] = local304;
							}
							if (arg3 != 0) {
								local60 = Class22.anIntArray20[arg3];
								local286 = Class22.anIntArray19[arg3];
								local304 = this.anIntArray448[local54] * local60 + local286 * this.anIntArray450[local54] + 16383 >> 14;
								this.anIntArray448[local54] = local286 * this.anIntArray448[local54] + 16383 - this.anIntArray450[local54] * local60 >> 14;
								this.anIntArray450[local54] = local304;
							}
							this.anIntArray450[local54] += Static331.anInt6267;
							this.anIntArray451[local54] += Static117.anInt2015;
							this.anIntArray448[local54] += Static150.anInt2794;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray52.length) {
						local52 = this.anIntArrayArray52[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local286 = this.anIntArray447[local60];
							local304 = this.anIntArray447[local60 + 1];
							for (local760 = local286; local760 < local304; local760++) {
								local769 = this.aShortArray92[local760] - 1;
								if (local769 == -1) {
									break;
								}
								@Pc(779) int local779;
								@Pc(783) int local783;
								@Pc(801) int local801;
								if (arg4 != 0) {
									local779 = Class22.anIntArray20[arg4];
									local783 = Class22.anIntArray19[arg4];
									local801 = this.aShortArray98[local769] * local783 + this.aShortArray94[local769] * local779 + 16383 >> 14;
									this.aShortArray94[local769] = (short) (local783 * this.aShortArray94[local769] + 16383 - local779 * this.aShortArray98[local769] >> 14);
									this.aShortArray98[local769] = (short) local801;
								}
								if (arg2 != 0) {
									local779 = Class22.anIntArray20[arg2];
									local783 = Class22.anIntArray19[arg2];
									local801 = local783 * this.aShortArray94[local769] + 16383 - this.aShortArray97[local769] * local779 >> 14;
									this.aShortArray97[local769] = (short) (local783 * this.aShortArray97[local769] + local779 * this.aShortArray94[local769] + 16383 >> 14);
									this.aShortArray94[local769] = (short) local801;
								}
								if (arg3 != 0) {
									local779 = Class22.anIntArray20[arg3];
									local783 = Class22.anIntArray19[arg3];
									local801 = this.aShortArray98[local769] * local783 + local779 * this.aShortArray97[local769] + 16383 >> 14;
									this.aShortArray97[local769] = (short) (this.aShortArray97[local769] * local783 + 16383 - this.aShortArray98[local769] * local779 >> 14);
									this.aShortArray98[local769] = (short) local801;
								}
							}
						}
					}
				}
				this.method5116();
			}
		} else if (arg0 == 3) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray52.length) {
					local162 = this.anIntArrayArray52[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local54 = local162[local164];
						this.anIntArray450[local54] -= Static331.anInt6267;
						this.anIntArray451[local54] -= Static117.anInt2015;
						this.anIntArray448[local54] -= Static150.anInt2794;
						this.anIntArray450[local54] = arg2 * this.anIntArray450[local54] >> 7;
						this.anIntArray451[local54] = this.anIntArray451[local54] * arg3 >> 7;
						this.anIntArray448[local54] = arg4 * this.anIntArray448[local54] >> 7;
						this.anIntArray450[local54] += Static331.anInt6267;
						this.anIntArray451[local54] += Static117.anInt2015;
						this.anIntArray448[local54] += Static150.anInt2794;
					}
				}
			}
		} else {
			@Pc(1207) Class169 local1207;
			@Pc(1106) boolean local1106;
			@Pc(1202) Class317 local1202;
			if (arg0 == 5) {
				if (this.anIntArrayArray53 != null) {
					local1106 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray53.length) {
							local52 = this.anIntArrayArray53[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local286 = (this.aByteArray83[local60] & 0xFF) + (arg2 * 8);
								if (local286 < 0) {
									local286 = 0;
								} else if (local286 > 255) {
									local286 = 255;
								}
								this.aByteArray83[local60] = (byte) local286;
							}
							local1106 |= local52.length > 0;
						}
					}
					if (local1106) {
						if (this.aClass317Array1 != null) {
							for (local38 = 0; local38 < this.anInt6326; local38++) {
								local1202 = this.aClass317Array1[local38];
								local1207 = this.aClass169Array1[local38];
								local1207.anInt4726 = local1207.anInt4726 & 0xFFFFFF | 255 - (this.aByteArray83[local1202.anInt8893] & 0xFF) << 24;
							}
						}
						this.method5108();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray53 != null) {
					local1106 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray53.length > local38) {
							local52 = this.anIntArrayArray53[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local286 = this.aShortArray95[local60] & 0xFFFF;
								local304 = local286 >> 10 & 0x3F;
								local760 = local286 >> 7 & 0x7;
								local769 = local286 & 0x7F;
								@Pc(1304) int local1304 = arg2 + local304 & 0x3F;
								local760 += arg3 / 4;
								local769 += arg4;
								if (local760 < 0) {
									local760 = 0;
								} else if (local760 > 7) {
									local760 = 7;
								}
								if (local769 < 0) {
									local769 = 0;
								} else if (local769 > 127) {
									local769 = 127;
								}
								this.aShortArray95[local60] = (short) (local1304 << 10 | local760 << 7 | local769);
							}
							local1106 |= local52.length > 0;
						}
					}
					if (local1106) {
						if (this.aClass317Array1 != null) {
							for (local38 = 0; local38 < this.anInt6326; local38++) {
								local1202 = this.aClass317Array1[local38];
								local1207 = this.aClass169Array1[local38];
								local1207.anInt4726 = Static36.anIntArray31[this.aShortArray95[local1202.anInt8893] & 0xFFFF] & 0xFFFFFF | local1207.anInt4726 & 0xFF000000;
							}
						}
						this.method5108();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray51 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray51.length > local32) {
							local162 = this.anIntArrayArray51[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1207 = this.aClass169Array1[local162[local164]];
								local1207.anInt4727 += arg2;
								local1207.anInt4722 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray51 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray51.length) {
							local162 = this.anIntArrayArray51[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1207 = this.aClass169Array1[local162[local164]];
								local1207.anInt4728 = local1207.anInt4728 * arg2 >> 7;
								local1207.anInt4725 = arg3 * local1207.anInt4725 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray51 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray51.length) {
						local162 = this.anIntArrayArray51[local32];
						for (local164 = 0; local164 < local162.length; local164++) {
							local1207 = this.aClass169Array1[local162[local164]];
							local1207.anInt4730 = local1207.anInt4730 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
	private void method5112() {
		if (this.aClass9_1 != null) {
			this.aClass9_1.aBoolean11 = false;
		}
	}

	@OriginalMember(owner = "client!na", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface2 local9 = this.aClass90_Sub3_9.anInterface2_15;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6285; local11++) {
			if (this.aShortArray91[local11] == arg0) {
				this.aShortArray91[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class115 local44 = local9.method3085(arg0 & 0xFFFF);
			local31 = local44.aByte40;
			local33 = local44.aByte38;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(64) Class115 local64 = local9.method3085(arg1 & 0xFFFF);
			local52 = local64.aByte40;
			local54 = local64.aByte38;
		}
		if (!(local54 != local33 | local52 != local31)) {
			return;
		}
		if (this.aClass317Array1 != null) {
			for (@Pc(89) int local89 = 0; local89 < this.anInt6326; local89++) {
				@Pc(96) Class317 local96 = this.aClass317Array1[local89];
				@Pc(101) Class169 local101 = this.aClass169Array1[local89];
				local101.anInt4726 = Static36.anIntArray31[this.aShortArray95[local96.anInt8893] & 0xFFFF] & 0xFFFFFF | local101.anInt4726 & 0xFF000000;
			}
		}
		this.method5108();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!q;Lclient!rc;I)V")
	@Override
	public void method7393(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class60_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6339 == 0) {
			return;
		}
		@Pc(16) Class93_Sub3 local16 = this.aClass90_Sub3_9.aClass93_Sub3_16;
		if (!this.aBoolean447) {
			this.method5104();
		}
		@Pc(25) Class93_Sub3 local25 = (Class93_Sub3) arg0;
		Static518.aFloat183 = local16.aFloat114 * local25.aFloat117 + local25.aFloat115 * local16.aFloat117 + local16.aFloat116 * local25.aFloat108;
		Static491.aFloat179 = local25.aFloat106 * local16.aFloat114 + local25.aFloat113 * local16.aFloat117 + local25.aFloat110 * local16.aFloat116 + local16.aFloat106;
		@Pc(72) float local72 = Static491.aFloat179 + Static518.aFloat183 * (float) this.anInt6345;
		@Pc(80) float local80 = (float) this.anInt6332 * Static518.aFloat183 + Static491.aFloat179;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local90 = local80 - (float) this.anInt6294;
			local96 = local72 + (float) this.anInt6294;
		} else {
			local90 = local72 - (float) this.anInt6294;
			local96 = (float) this.anInt6294 + local80;
		}
		if (local90 >= this.aClass90_Sub3_9.aFloat193 || (float) this.aClass90_Sub3_9.anInt9557 >= local96) {
			return;
		}
		Static144.aFloat184 = local16.aFloat110 + local16.aFloat108 * local25.aFloat113 + local16.aFloat112 * local25.aFloat110 + local25.aFloat106 * local16.aFloat109;
		Static68.aFloat22 = local25.aFloat115 * local16.aFloat108 + local25.aFloat108 * local16.aFloat112 + local25.aFloat117 * local16.aFloat109;
		@Pc(172) float local172 = Static144.aFloat184 + Static68.aFloat22 * (float) this.anInt6345;
		@Pc(180) float local180 = (float) this.anInt6332 * Static68.aFloat22 + Static144.aFloat184;
		@Pc(206) float local206;
		@Pc(195) float local195;
		if (local172 > local180) {
			local195 = (float) this.aClass90_Sub3_9.anInt9575 * ((float) this.anInt6294 + local172);
			local206 = (local180 - (float) this.anInt6294) * (float) this.aClass90_Sub3_9.anInt9575;
		} else {
			local206 = ((float) -this.anInt6294 + local172) * (float) this.aClass90_Sub3_9.anInt9575;
			local195 = (local180 + (float) this.anInt6294) * (float) this.aClass90_Sub3_9.anInt9575;
		}
		if (local206 / local96 >= this.aClass90_Sub3_9.aFloat197 || local195 / local96 <= this.aClass90_Sub3_9.aFloat203) {
			return;
		}
		Static76.aFloat24 = local16.aFloat113 + local25.aFloat113 * local16.aFloat115 + local25.aFloat110 * local16.aFloat111 + local16.aFloat107 * local25.aFloat106;
		Static445.aFloat168 = local16.aFloat107 * local25.aFloat117 + local16.aFloat115 * local25.aFloat115 + local16.aFloat111 * local25.aFloat108;
		@Pc(296) float local296 = (float) this.anInt6345 * Static445.aFloat168 + Static76.aFloat24;
		@Pc(304) float local304 = Static76.aFloat24 + (float) this.anInt6332 * Static445.aFloat168;
		@Pc(331) float local331;
		@Pc(319) float local319;
		if (local304 < local296) {
			local331 = (float) this.aClass90_Sub3_9.anInt9586 * ((float) -this.anInt6294 + local304);
			local319 = (local296 + (float) this.anInt6294) * (float) this.aClass90_Sub3_9.anInt9586;
		} else {
			local319 = (float) this.aClass90_Sub3_9.anInt9586 * ((float) this.anInt6294 + local304);
			local331 = (float) this.aClass90_Sub3_9.anInt9586 * ((float) -this.anInt6294 + local296);
		}
		if (local331 / local96 >= this.aClass90_Sub3_9.aFloat195 || this.aClass90_Sub3_9.aFloat191 >= local319 / local96) {
			return;
		}
		if (arg1 != null || this.aClass317Array1 != null) {
			Static259.aFloat124 = local25.aFloat116 * local16.aFloat107 + local25.aFloat111 * local16.aFloat115 + local16.aFloat111 * local25.aFloat112;
			Static400.aFloat165 = local16.aFloat114 * local25.aFloat114 + local25.aFloat107 * local16.aFloat117 + local16.aFloat116 * local25.aFloat109;
			Static257.aFloat162 = local25.aFloat112 * local16.aFloat112 + local16.aFloat108 * local25.aFloat111 + local16.aFloat109 * local25.aFloat116;
			Static202.aFloat90 = local25.aFloat114 * local16.aFloat107 + local16.aFloat115 * local25.aFloat107 + local16.aFloat111 * local25.aFloat109;
			Static500.aFloat180 = local16.aFloat112 * local25.aFloat109 + local25.aFloat107 * local16.aFloat108 + local16.aFloat109 * local25.aFloat114;
			Static459.aFloat173 = local16.aFloat114 * local25.aFloat116 + local16.aFloat117 * local25.aFloat111 + local16.aFloat116 * local25.aFloat112;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.anInt6296 + this.anInt6333 >> 1;
			@Pc(509) int local509 = this.anInt6315 + this.anInt6306 >> 1;
			@Pc(528) int local528 = (int) ((float) local509 * Static500.aFloat180 + Static68.aFloat22 * (float) this.anInt6345 + Static257.aFloat162 * (float) local501 + Static144.aFloat184);
			@Pc(547) int local547 = (int) ((float) local509 * Static202.aFloat90 + (float) this.anInt6345 * Static445.aFloat168 + Static76.aFloat24 + Static259.aFloat124 * (float) local501);
			@Pc(566) int local566 = (int) (Static491.aFloat179 + Static459.aFloat173 * (float) local501 + Static518.aFloat183 * (float) this.anInt6345 + (float) local509 * Static400.aFloat165);
			if (this.aClass90_Sub3_9.anInt9557 > local566) {
				local491 = true;
			} else {
				arg1.anInt7808 = this.aClass90_Sub3_9.anInt9575 * local528 / local566 + this.aClass90_Sub3_9.anInt9552;
				arg1.anInt7807 = this.aClass90_Sub3_9.anInt9576 + local547 * this.aClass90_Sub3_9.anInt9586 / local566;
			}
			@Pc(624) int local624 = (int) (Static257.aFloat162 * (float) local501 + Static144.aFloat184 + (float) this.anInt6332 * Static68.aFloat22 + (float) local509 * Static500.aFloat180);
			@Pc(643) int local643 = (int) (Static445.aFloat168 * (float) this.anInt6332 + Static76.aFloat24 + (float) local501 * Static259.aFloat124 + (float) local509 * Static202.aFloat90);
			@Pc(662) int local662 = (int) ((float) local509 * Static400.aFloat165 + Static459.aFloat173 * (float) local501 + Static491.aFloat179 + (float) this.anInt6332 * Static518.aFloat183);
			if (this.aClass90_Sub3_9.anInt9557 <= local662) {
				arg1.anInt7809 = this.aClass90_Sub3_9.anInt9552 + this.aClass90_Sub3_9.anInt9575 * local624 / local662;
				arg1.anInt7810 = this.aClass90_Sub3_9.anInt9576 + local643 * this.aClass90_Sub3_9.anInt9586 / local662;
			} else {
				local491 = true;
			}
			if (local491) {
				if (local566 < this.aClass90_Sub3_9.anInt9557 && this.aClass90_Sub3_9.anInt9557 > local662) {
					local493 = false;
				} else {
					@Pc(745) int local745;
					@Pc(757) int local757;
					@Pc(768) int local768;
					if (this.aClass90_Sub3_9.anInt9557 > local566) {
						local745 = (local662 - this.aClass90_Sub3_9.anInt9557 << 16) / (local662 - local566);
						local757 = local624 + (local745 * (local624 - local528) >> 16);
						local768 = ((local643 - local547) * local745 >> 16) + local643;
						arg1.anInt7808 = local757 * this.aClass90_Sub3_9.anInt9575 / this.aClass90_Sub3_9.anInt9557 + this.aClass90_Sub3_9.anInt9552;
						arg1.anInt7807 = local768 * this.aClass90_Sub3_9.anInt9586 / this.aClass90_Sub3_9.anInt9557 + this.aClass90_Sub3_9.anInt9576;
					} else if (local662 < this.aClass90_Sub3_9.anInt9557) {
						local745 = (local566 - this.aClass90_Sub3_9.anInt9557 << 16) / (local566 - local662);
						local757 = local528 + ((local528 - local624) * local745 >> 16);
						local768 = local547 + (local745 * (local547 - local643) >> 16);
						arg1.anInt7808 = local757 * this.aClass90_Sub3_9.anInt9575 / this.aClass90_Sub3_9.anInt9557 + this.aClass90_Sub3_9.anInt9552;
						arg1.anInt7807 = this.aClass90_Sub3_9.anInt9586 * local768 / this.aClass90_Sub3_9.anInt9557 + this.aClass90_Sub3_9.anInt9576;
					}
				}
			}
			if (local493) {
				if (local662 >= local566) {
					arg1.anInt7806 = this.aClass90_Sub3_9.anInt9552 + this.aClass90_Sub3_9.anInt9575 * (local624 + this.anInt6294) / local662 - arg1.anInt7809;
				} else {
					arg1.anInt7806 = this.aClass90_Sub3_9.anInt9552 + this.aClass90_Sub3_9.anInt9575 * (local528 + this.anInt6294) / local566 - arg1.anInt7808;
				}
				arg1.aBoolean513 = true;
			}
		}
		this.aClass90_Sub3_9.method7598();
		this.aClass90_Sub3_9.method7586(local25);
		this.method5107();
		this.method5103();
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()[Lclient!vp;")
	@Override
	public Class335[] method7402() {
		return this.aClass335Array6;
	}

	@OriginalMember(owner = "client!na", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			local24 = 0;
			Static117.anInt2015 = 0;
			Static331.anInt6267 = 0;
			Static150.anInt2794 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray52.length > local38) {
					local52 = this.anIntArrayArray52[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray93 == null || (this.aShortArray93[local60] & arg6) != 0) {
							Static331.anInt6267 += this.anIntArray450[local60];
							Static117.anInt2015 += this.anIntArray451[local60];
							Static150.anInt2794 += this.anIntArray448[local60];
							local24++;
						}
					}
				}
			}
			if (local24 <= 0) {
				Static331.anInt6267 = arg2;
				Static150.anInt2794 = arg4;
				Static117.anInt2015 = arg3;
			} else {
				Static331.anInt6267 = Static331.anInt6267 / local24 + arg2;
				Static117.anInt2015 = arg3 + Static117.anInt2015 / local24;
				Static33.aBoolean36 = true;
				Static150.anInt2794 = arg4 + Static150.anInt2794 / local24;
			}
			return;
		}
		@Pc(252) int[] local252;
		@Pc(254) int local254;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg7[4] * arg3 + arg2 * arg7[3] + 8192 >> 14;
				local38 = arg2 * arg7[6] + arg7[7] * arg3 + arg4 * arg7[8] + 8192 >> 14;
				arg4 = local38;
				arg3 = local32;
				arg2 = local24;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray52.length > local32) {
					local252 = this.anIntArrayArray52[local32];
					for (local254 = 0; local254 < local252.length; local254++) {
						local54 = local252[local254];
						if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local54]) != 0) {
							this.anIntArray450[local54] += arg2;
							this.anIntArray451[local54] += arg3;
							this.anIntArray448[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(398) int local398;
		@Pc(416) int local416;
		@Pc(644) int local644;
		@Pc(653) int local653;
		@Pc(666) int local666;
		@Pc(670) int local670;
		@Pc(688) int local688;
		@Pc(1012) int local1012;
		@Pc(1020) int local1020;
		@Pc(1173) int local1173;
		@Pc(1199) int local1199;
		@Pc(1203) int local1203;
		@Pc(1211) int local1211;
		@Pc(1216) int local1216;
		@Pc(1220) int local1220;
		@Pc(1224) int local1224;
		@Pc(1226) int local1226;
		@Pc(1355) int[] local1355;
		@Pc(1357) int local1357;
		@Pc(1361) int local1361;
		@Pc(1365) int local1365;
		@Pc(1367) int local1367;
		@Pc(1497) int local1497;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray52.length) {
						local252 = this.anIntArrayArray52[local32];
						for (local254 = 0; local254 < local252.length; local254++) {
							local54 = local252[local254];
							if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local54]) != 0) {
								this.anIntArray450[local54] -= Static331.anInt6267;
								this.anIntArray451[local54] -= Static117.anInt2015;
								this.anIntArray448[local54] -= Static150.anInt2794;
								if (arg4 != 0) {
									local60 = Class22.anIntArray20[arg4];
									local398 = Class22.anIntArray19[arg4];
									local416 = this.anIntArray450[local54] * local398 + local60 * this.anIntArray451[local54] + 16383 >> 14;
									this.anIntArray451[local54] = this.anIntArray451[local54] * local398 + 16383 - this.anIntArray450[local54] * local60 >> 14;
									this.anIntArray450[local54] = local416;
								}
								if (arg2 != 0) {
									local60 = Class22.anIntArray20[arg2];
									local398 = Class22.anIntArray19[arg2];
									local416 = local398 * this.anIntArray451[local54] + 16383 - local60 * this.anIntArray448[local54] >> 14;
									this.anIntArray448[local54] = this.anIntArray451[local54] * local60 + this.anIntArray448[local54] * local398 + 16383 >> 14;
									this.anIntArray451[local54] = local416;
								}
								if (arg3 != 0) {
									local60 = Class22.anIntArray20[arg3];
									local398 = Class22.anIntArray19[arg3];
									local416 = this.anIntArray448[local54] * local60 + this.anIntArray450[local54] * local398 + 16383 >> 14;
									this.anIntArray448[local54] = local398 * this.anIntArray448[local54] + 16383 - local60 * this.anIntArray450[local54] >> 14;
									this.anIntArray450[local54] = local416;
								}
								this.anIntArray450[local54] += Static331.anInt6267;
								this.anIntArray451[local54] += Static117.anInt2015;
								this.anIntArray448[local54] += Static150.anInt2794;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray52.length > local38) {
							local52 = this.anIntArrayArray52[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local60]) != 0) {
									local398 = this.anIntArray447[local60];
									local416 = this.anIntArray447[local60 + 1];
									for (local644 = local398; local644 < local416; local644++) {
										local653 = this.aShortArray92[local644] - 1;
										if (local653 == -1) {
											break;
										}
										if (arg4 != 0) {
											local666 = Class22.anIntArray20[arg4];
											local670 = Class22.anIntArray19[arg4];
											local688 = local670 * this.aShortArray98[local653] + local666 * this.aShortArray94[local653] + 16383 >> 14;
											this.aShortArray94[local653] = (short) (this.aShortArray94[local653] * local670 + 16383 - local666 * this.aShortArray98[local653] >> 14);
											this.aShortArray98[local653] = (short) local688;
										}
										if (arg2 != 0) {
											local666 = Class22.anIntArray20[arg2];
											local670 = Class22.anIntArray19[arg2];
											local688 = this.aShortArray94[local653] * local670 + 16383 - this.aShortArray97[local653] * local666 >> 14;
											this.aShortArray97[local653] = (short) (local666 * this.aShortArray94[local653] + this.aShortArray97[local653] * local670 + 16383 >> 14);
											this.aShortArray94[local653] = (short) local688;
										}
										if (arg3 != 0) {
											local666 = Class22.anIntArray20[arg3];
											local670 = Class22.anIntArray19[arg3];
											local688 = local670 * this.aShortArray98[local653] + local666 * this.aShortArray97[local653] + 16383 >> 14;
											this.aShortArray97[local653] = (short) (this.aShortArray97[local653] * local670 + 16383 - local666 * this.aShortArray98[local653] >> 14);
											this.aShortArray98[local653] = (short) local688;
										}
									}
								}
							}
						}
					}
					this.method5116();
					return;
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local254 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static33.aBoolean36) {
					local398 = Static331.anInt6267 * arg7[0] + arg7[3] * Static117.anInt2015 + Static150.anInt2794 * arg7[6] + 8192 >> 14;
					local416 = arg7[7] * Static150.anInt2794 + Static331.anInt6267 * arg7[1] + arg7[4] * Static117.anInt2015 + 8192 >> 14;
					local398 += local254;
					local644 = arg7[2] * Static331.anInt6267 + Static117.anInt2015 * arg7[5] + Static150.anInt2794 * arg7[8] + 8192 >> 14;
					local416 += local54;
					Static117.anInt2015 = local416;
					Static331.anInt6267 = local398;
					local644 += local60;
					Static150.anInt2794 = local644;
					Static33.aBoolean36 = false;
				}
				@Pc(980) int[] local980 = new int[9];
				local416 = Class22.anIntArray19[arg2];
				local644 = Class22.anIntArray20[arg2];
				local653 = Class22.anIntArray19[arg3];
				local666 = Class22.anIntArray20[arg3];
				local670 = Class22.anIntArray19[arg4];
				local688 = Class22.anIntArray20[arg4];
				local1012 = local644 * local670 + 8192 >> 14;
				local1020 = local688 * local644 + 8192 >> 14;
				local980[4] = local670 * local416 + 8192 >> 14;
				local980[6] = local1020 * local653 + -local666 * local670 + 8192 >> 14;
				local980[5] = -local644;
				local980[1] = local1012 * local666 + -local653 * local688 + 8192 >> 14;
				local980[8] = local416 * local653 + 8192 >> 14;
				local980[0] = local670 * local653 + local1020 * local666 + 8192 >> 14;
				local980[3] = local688 * local416 + 8192 >> 14;
				local980[7] = local666 * local688 + local1012 * local653 + 8192 >> 14;
				local980[2] = local666 * local416 + 8192 >> 14;
				@Pc(1148) int local1148 = local980[1] * -Static117.anInt2015 + local980[0] * -Static331.anInt6267 + -Static150.anInt2794 * local980[2] + 8192 >> 14;
				local1173 = local980[3] * -Static331.anInt6267 + local980[4] * -Static117.anInt2015 + -Static150.anInt2794 * local980[5] + 8192 >> 14;
				local1199 = -Static150.anInt2794 * local980[8] + -Static331.anInt6267 * local980[6] + local980[7] * -Static117.anInt2015 + 8192 >> 14;
				local1203 = Static331.anInt6267 + local1148;
				@Pc(1207) int local1207 = local1173 + Static117.anInt2015;
				local1211 = local1199 + Static150.anInt2794;
				@Pc(1214) int[] local1214 = new int[9];
				for (local1216 = 0; local1216 < 3; local1216++) {
					for (local1220 = 0; local1220 < 3; local1220++) {
						local1224 = 0;
						for (local1226 = 0; local1226 < 3; local1226++) {
							local1224 += arg7[local1220 * 3 + local1226] * local980[local1226 + local1216 * 3];
						}
						local1214[local1220 + local1216 * 3] = local1224 + 8192 >> 14;
					}
				}
				local1220 = local54 * local980[1] + local980[0] * local254 + local60 * local980[2] + 8192 >> 14;
				local1224 = local980[5] * local60 + local54 * local980[4] + local980[3] * local254 + 8192 >> 14;
				local1224 += local1207;
				local1220 += local1203;
				local1226 = local980[8] * local60 + local54 * local980[7] + local254 * local980[6] + 8192 >> 14;
				local1226 += local1211;
				local1355 = new int[9];
				for (local1357 = 0; local1357 < 3; local1357++) {
					for (local1361 = 0; local1361 < 3; local1361++) {
						local1365 = 0;
						for (local1367 = 0; local1367 < 3; local1367++) {
							local1365 += local1214[local1367 * 3 + local1361] * arg7[local1367 + local1357 * 3];
						}
						local1355[local1357 * 3 + local1361] = local1365 + 8192 >> 14;
					}
				}
				local1361 = arg7[2] * local1226 + local1220 * arg7[0] + arg7[1] * local1224 + 8192 >> 14;
				local1365 = arg7[3] * local1220 + local1224 * arg7[4] + arg7[5] * local1226 + 8192 >> 14;
				local1367 = arg7[6] * local1220 + local1224 * arg7[7] + local1226 * arg7[8] + 8192 >> 14;
				local1365 += local32;
				local1361 += local24;
				local1367 += local38;
				for (local1497 = 0; local1497 < local8; local1497++) {
					@Pc(1503) int local1503 = arg1[local1497];
					if (local1503 < this.anIntArrayArray52.length) {
						@Pc(1517) int[] local1517 = this.anIntArrayArray52[local1503];
						for (@Pc(1519) int local1519 = 0; local1519 < local1517.length; local1519++) {
							@Pc(1525) int local1525 = local1517[local1519];
							if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local1525]) != 0) {
								@Pc(1569) int local1569 = this.anIntArray448[local1525] * local1355[2] + local1355[1] * this.anIntArray451[local1525] + local1355[0] * this.anIntArray450[local1525] + 8192 >> 14;
								@Pc(1601) int local1601 = local1355[4] * this.anIntArray451[local1525] + local1355[3] * this.anIntArray450[local1525] + this.anIntArray448[local1525] * local1355[5] + 8192 >> 14;
								@Pc(1605) int local1605 = local1601 + local1365;
								@Pc(1609) int local1609 = local1569 + local1361;
								@Pc(1640) int local1640 = this.anIntArray448[local1525] * local1355[8] + local1355[7] * this.anIntArray451[local1525] + this.anIntArray450[local1525] * local1355[6] + 8192 >> 14;
								this.anIntArray450[local1525] = local1609;
								@Pc(1649) int local1649 = local1640 + local1367;
								this.anIntArray451[local1525] = local1605;
								this.anIntArray448[local1525] = local1649;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2597) Class169 local2597;
			@Pc(2488) boolean local2488;
			@Pc(2592) Class317 local2592;
			if (arg0 == 5) {
				if (this.anIntArrayArray53 != null) {
					local2488 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray53.length) {
							local52 = this.anIntArrayArray53[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray89 == null || (arg6 & this.aShortArray89[local60]) != 0) {
									local398 = arg2 * 8 + (this.aByteArray83[local60] & 0xFF);
									if (local398 < 0) {
										local398 = 0;
									} else if (local398 > 255) {
										local398 = 255;
									}
									this.aByteArray83[local60] = (byte) local398;
								}
							}
							local2488 |= local52.length > 0;
						}
					}
					if (local2488) {
						if (this.aClass317Array1 != null) {
							for (local38 = 0; local38 < this.anInt6326; local38++) {
								local2592 = this.aClass317Array1[local38];
								local2597 = this.aClass169Array1[local38];
								local2597.anInt4726 = local2597.anInt4726 & 0xFFFFFF | 255 - (this.aByteArray83[local2592.anInt8893] & 0xFF) << 24;
							}
						}
						this.method5108();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray53 != null) {
					local2488 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray53.length > local38) {
							local52 = this.anIntArrayArray53[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray89 == null || (this.aShortArray89[local60] & arg6) != 0) {
									local398 = this.aShortArray95[local60] & 0xFFFF;
									local416 = local398 >> 10 & 0x3F;
									local644 = local398 >> 7 & 0x7;
									local644 += arg3 / 4;
									local653 = local398 & 0x7F;
									@Pc(2710) int local2710 = local416 + arg2 & 0x3F;
									local653 += arg4;
									if (local644 < 0) {
										local644 = 0;
									} else if (local644 > 7) {
										local644 = 7;
									}
									if (local653 < 0) {
										local653 = 0;
									} else if (local653 > 127) {
										local653 = 127;
									}
									this.aShortArray95[local60] = (short) (local644 << 7 | local2710 << 10 | local653);
								}
							}
							local2488 |= local52.length > 0;
						}
					}
					if (local2488) {
						if (this.aClass317Array1 != null) {
							for (local38 = 0; local38 < this.anInt6326; local38++) {
								local2592 = this.aClass317Array1[local38];
								local2597 = this.aClass169Array1[local38];
								local2597.anInt4726 = local2597.anInt4726 & 0xFF000000 | Static36.anIntArray31[this.aShortArray95[local2592.anInt8893] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method5108();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray51 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray51.length) {
							local252 = this.anIntArrayArray51[local32];
							for (local254 = 0; local254 < local252.length; local254++) {
								local2597 = this.aClass169Array1[local252[local254]];
								local2597.anInt4727 += arg2;
								local2597.anInt4722 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray51 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray51.length) {
							local252 = this.anIntArrayArray51[local32];
							for (local254 = 0; local254 < local252.length; local254++) {
								local2597 = this.aClass169Array1[local252[local254]];
								local2597.anInt4725 = arg3 * local2597.anInt4725 >> 7;
								local2597.anInt4728 = arg2 * local2597.anInt4728 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray51 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray51.length) {
						local252 = this.anIntArrayArray51[local32];
						for (local254 = 0; local254 < local252.length; local254++) {
							local2597 = this.aClass169Array1[local252[local254]];
							local2597.anInt4730 = local2597.anInt4730 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray52.length > local32) {
					local252 = this.anIntArrayArray52[local32];
					for (local254 = 0; local254 < local252.length; local254++) {
						local54 = local252[local254];
						if (this.aShortArray93 == null || (this.aShortArray93[local54] & arg6) != 0) {
							this.anIntArray450[local54] -= Static331.anInt6267;
							this.anIntArray451[local54] -= Static117.anInt2015;
							this.anIntArray448[local54] -= Static150.anInt2794;
							this.anIntArray450[local54] = this.anIntArray450[local54] * arg2 >> 7;
							this.anIntArray451[local54] = arg3 * this.anIntArray451[local54] >> 7;
							this.anIntArray448[local54] = arg4 * this.anIntArray448[local54] >> 7;
							this.anIntArray450[local54] += Static331.anInt6267;
							this.anIntArray451[local54] += Static117.anInt2015;
							this.anIntArray448[local54] += Static150.anInt2794;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local254 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static33.aBoolean36) {
				local398 = arg7[0] * Static331.anInt6267 + arg7[3] * Static117.anInt2015 + Static150.anInt2794 * arg7[6] + 8192 >> 14;
				local416 = arg7[7] * Static150.anInt2794 + Static117.anInt2015 * arg7[4] + Static331.anInt6267 * arg7[1] + 8192 >> 14;
				local398 += local254;
				local416 += local54;
				local644 = Static117.anInt2015 * arg7[5] + arg7[2] * Static331.anInt6267 + arg7[8] * Static150.anInt2794 + 8192 >> 14;
				local644 += local60;
				Static331.anInt6267 = local398;
				Static117.anInt2015 = local416;
				Static33.aBoolean36 = false;
				Static150.anInt2794 = local644;
			}
			local398 = arg2 << 15 >> 7;
			local416 = arg3 << 15 >> 7;
			local644 = arg4 << 15 >> 7;
			local653 = -Static331.anInt6267 * local398 + 8192 >> 14;
			local666 = -Static117.anInt2015 * local416 + 8192 >> 14;
			local670 = local644 * -Static150.anInt2794 + 8192 >> 14;
			local688 = Static331.anInt6267 + local653;
			local1012 = Static117.anInt2015 + local666;
			local1020 = local670 + Static150.anInt2794;
			@Pc(2010) int[] local2010 = new int[] { local398 * arg7[0] + 8192 >> 14, arg7[3] * local398 + 8192 >> 14, local398 * arg7[6] + 8192 >> 14, arg7[1] * local416 + 8192 >> 14, local416 * arg7[4] + 8192 >> 14, local416 * arg7[7] + 8192 >> 14, local644 * arg7[2] + 8192 >> 14, local644 * arg7[5] + 8192 >> 14, local644 * arg7[8] + 8192 >> 14 };
			local1173 = local398 * local254 + 8192 >> 14;
			local1199 = local416 * local54 + 8192 >> 14;
			local1203 = local60 * local644 + 8192 >> 14;
			@Pc(2146) int local2146 = local1199 + local1012;
			@Pc(2150) int local2150 = local1173 + local688;
			@Pc(2154) int local2154 = local1203 + local1020;
			@Pc(2157) int[] local2157 = new int[9];
			@Pc(2163) int local2163;
			for (local1211 = 0; local1211 < 3; local1211++) {
				for (local2163 = 0; local2163 < 3; local2163++) {
					local1216 = 0;
					for (local1220 = 0; local1220 < 3; local1220++) {
						local1216 += arg7[local1211 * 3 + local1220] * local2010[local1220 * 3 + local2163];
					}
					local2157[local1211 * 3 + local2163] = local1216 + 8192 >> 14;
				}
			}
			local2163 = arg7[1] * local2146 + arg7[0] * local2150 + local2154 * arg7[2] + 8192 >> 14;
			local1216 = local2154 * arg7[5] + arg7[3] * local2150 + arg7[4] * local2146 + 8192 >> 14;
			local1216 += local32;
			local1220 = local2154 * arg7[8] + local2150 * arg7[6] + arg7[7] * local2146 + 8192 >> 14;
			local2163 += local24;
			local1220 += local38;
			for (local1224 = 0; local1224 < local8; local1224++) {
				local1226 = arg1[local1224];
				if (local1226 < this.anIntArrayArray52.length) {
					local1355 = this.anIntArrayArray52[local1226];
					for (local1357 = 0; local1357 < local1355.length; local1357++) {
						local1361 = local1355[local1357];
						if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local1361]) != 0) {
							local1365 = this.anIntArray448[local1361] * local2157[2] + local2157[0] * this.anIntArray450[local1361] + local2157[1] * this.anIntArray451[local1361] + 8192 >> 14;
							local1367 = this.anIntArray450[local1361] * local2157[3] + local2157[4] * this.anIntArray451[local1361] + local2157[5] * this.anIntArray448[local1361] + 8192 >> 14;
							@Pc(2405) int local2405 = local1367 + local1216;
							@Pc(2409) int local2409 = local1365 + local2163;
							local1497 = local2157[6] * this.anIntArray450[local1361] + local2157[7] * this.anIntArray451[local1361] + local2157[8] * this.anIntArray448[local1361] + 8192 >> 14;
							@Pc(2445) int local2445 = local1497 + local1220;
							this.anIntArray450[local1361] = local2409;
							this.anIntArray451[local1361] = local2405;
							this.anIntArray448[local1361] = local2445;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.aShort83 = (short) arg0;
		this.method5113();
		this.method5116();
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()Z")
	@Override
	public boolean method7397() {
		if (this.aShortArray91 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray91.length; local12++) {
			if (this.aShortArray91[local12] != -1 && !this.aClass90_Sub3_9.anInterface2_15.method3089(this.aShortArray91[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray52 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6324; local12++) {
			this.anIntArray450[local12] <<= 0x4;
			this.anIntArray451[local12] <<= 0x4;
			this.anIntArray448[local12] <<= 0x4;
		}
		Static117.anInt2015 = 0;
		Static150.anInt2794 = 0;
		Static331.anInt6267 = 0;
		return true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7388(@OriginalArg(0) Class93 arg0) {
		@Pc(8) Class93_Sub3 local8 = (Class93_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass33Array6 != null) {
			for (local13 = 0; local13 < this.aClass33Array6.length; local13++) {
				@Pc(20) Class33 local20 = this.aClass33Array6[local13];
				@Pc(22) Class33 local22 = local20;
				if (local20.aClass33_1 != null) {
					local22 = local20.aClass33_1;
				}
				local22.anInt769 = (int) (local8.aFloat110 + (float) this.anIntArray451[local20.anInt768] * local8.aFloat108 + local8.aFloat112 * (float) this.anIntArray450[local20.anInt768] + (float) this.anIntArray448[local20.anInt768] * local8.aFloat109);
				local22.anInt782 = (int) ((float) this.anIntArray448[local20.anInt768] * local8.aFloat107 + (float) this.anIntArray451[local20.anInt768] * local8.aFloat115 + (float) this.anIntArray450[local20.anInt768] * local8.aFloat111 + local8.aFloat113);
				local22.anInt780 = (int) (local8.aFloat117 * (float) this.anIntArray451[local20.anInt768] + (float) this.anIntArray450[local20.anInt768] * local8.aFloat116 + local8.aFloat114 * (float) this.anIntArray448[local20.anInt768] + local8.aFloat106);
				local22.anInt770 = (int) (local8.aFloat110 + local8.aFloat109 * (float) this.anIntArray448[local20.anInt775] + (float) this.anIntArray450[local20.anInt775] * local8.aFloat112 + local8.aFloat108 * (float) this.anIntArray451[local20.anInt775]);
				local22.anInt776 = (int) (local8.aFloat113 + local8.aFloat107 * (float) this.anIntArray448[local20.anInt775] + (float) this.anIntArray450[local20.anInt775] * local8.aFloat111 + local8.aFloat115 * (float) this.anIntArray451[local20.anInt775]);
				local22.anInt777 = (int) (local8.aFloat106 + local8.aFloat117 * (float) this.anIntArray451[local20.anInt775] + local8.aFloat116 * (float) this.anIntArray450[local20.anInt775] + (float) this.anIntArray448[local20.anInt775] * local8.aFloat114);
				local22.anInt771 = (int) (local8.aFloat110 + local8.aFloat109 * (float) this.anIntArray448[local20.anInt774] + (float) this.anIntArray450[local20.anInt774] * local8.aFloat112 + (float) this.anIntArray451[local20.anInt774] * local8.aFloat108);
				local22.anInt773 = (int) (local8.aFloat111 * (float) this.anIntArray450[local20.anInt774] + (float) this.anIntArray451[local20.anInt774] * local8.aFloat115 + (float) this.anIntArray448[local20.anInt774] * local8.aFloat107 + local8.aFloat113);
				local22.anInt778 = (int) (local8.aFloat106 + local8.aFloat116 * (float) this.anIntArray450[local20.anInt774] + local8.aFloat117 * (float) this.anIntArray451[local20.anInt774] + (float) this.anIntArray448[local20.anInt774] * local8.aFloat114);
			}
		}
		if (this.aClass335Array6 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass335Array6.length; local13++) {
			@Pc(365) Class335 local365 = this.aClass335Array6[local13];
			@Pc(367) Class335 local367 = local365;
			if (local365.aClass335_2 != null) {
				local367 = local365.aClass335_2;
			}
			if (local365.aClass93_9 == null) {
				local365.aClass93_9 = local8.method7795();
			} else {
				local365.aClass93_9.la(local8);
			}
			local367.anInt9658 = (int) (local8.aFloat110 + (float) this.anIntArray451[local365.anInt9662] * local8.aFloat108 + local8.aFloat112 * (float) this.anIntArray450[local365.anInt9662] + local8.aFloat109 * (float) this.anIntArray448[local365.anInt9662]);
			local367.anInt9655 = (int) (local8.aFloat115 * (float) this.anIntArray451[local365.anInt9662] + local8.aFloat111 * (float) this.anIntArray450[local365.anInt9662] + (float) this.anIntArray448[local365.anInt9662] * local8.aFloat107 + local8.aFloat113);
			local367.anInt9657 = (int) ((float) this.anIntArray448[local365.anInt9662] * local8.aFloat114 + local8.aFloat116 * (float) this.anIntArray450[local365.anInt9662] + local8.aFloat117 * (float) this.anIntArray451[local365.anInt9662] + local8.aFloat106);
		}
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	private void method5113() {
		if (this.lb != null) {
			this.lb.aBoolean464 = false;
		}
	}

	@OriginalMember(owner = "client!na", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6285; local3++) {
			if (arg0 == this.aShortArray95[local3]) {
				this.aShortArray95[local3] = arg1;
			}
		}
		if (this.aClass317Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt6326; local30++) {
				@Pc(37) Class317 local37 = this.aClass317Array1[local30];
				@Pc(42) Class169 local42 = this.aClass169Array1[local30];
				local42.anInt4726 = local42.anInt4726 & 0xFF000000 | Static36.anIntArray31[this.aShortArray95[local37.anInt8893] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5108();
	}

	@OriginalMember(owner = "client!na", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean447) {
			this.method5104();
		}
		return this.anInt6333;
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)Z")
	private boolean method5114() {
		@Pc(13) boolean local13 = !this.aClass227_1.aBoolean464;
		@Pc(26) boolean local26 = (this.anInt6337 & 0x37) != 0 && !this.aClass227_3.aBoolean464;
		@Pc(34) boolean local34 = !this.lb.aBoolean464;
		@Pc(42) boolean local42 = !this.aClass227_2.aBoolean464;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(54) boolean local54 = true;
		@Pc(73) Interface8 local73;
		@Pc(87) Buffer local87;
		if (local34) {
			if (this.lb.anInterface8_11 == null) {
				this.lb.anInterface8_11 = this.aClass90_Sub3_9.method7562(this.aBoolean445);
			}
			local73 = this.lb.anInterface8_11;
			local73.method6463(this.anInt6339 * 12, 12);
			local87 = local73.method6462();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass90_Sub3_9.aNativeInterface3.copyPositions(this.anIntArray450, this.anIntArray451, this.anIntArray448, this.aShortArray90, 0, 12, this.anInt6339, local87.getAddress());
				if (local73.method6460()) {
					this.lb.anInterface8_12 = local73;
					this.lb.aBoolean464 = true;
				} else {
					local54 = false;
				}
			}
		}
		@Pc(204) short[] local204;
		@Pc(200) short[] local200;
		@Pc(208) short[] local208;
		@Pc(212) byte[] local212;
		if (local13) {
			if (this.aClass227_1.anInterface8_11 == null) {
				this.aClass227_1.anInterface8_11 = this.aClass90_Sub3_9.method7562(this.aBoolean445);
			}
			local73 = this.aClass227_1.anInterface8_11;
			local73.method6463(this.anInt6339 * 4, 4);
			local87 = local73.method6462();
			if (local87 == null) {
				local54 = false;
			} else {
				if ((this.anInt6337 & 0x37) == 0) {
					if (this.aClass155_1 == null) {
						local200 = this.aShortArray94;
						local204 = this.aShortArray98;
						local208 = this.aShortArray97;
						local212 = this.aByteArray81;
					} else {
						local200 = this.aClass155_1.aShortArray79;
						local204 = this.aClass155_1.aShortArray77;
						local208 = this.aClass155_1.aShortArray78;
						local212 = this.aClass155_1.aByteArray59;
					}
					this.aClass90_Sub3_9.aNativeInterface3.copyLighting(this.aShortArray95, this.aByteArray83, this.aShortArray91, local204, local200, local208, local212, this.aShort84, this.aShort83, this.aShortArray96, 0, 4, this.anInt6339, local87.getAddress());
				} else {
					this.aClass90_Sub3_9.aNativeInterface3.copyColours(this.aShortArray95, this.aByteArray83, this.aShortArray91, this.aShort84, this.aShortArray96, 0, 4, this.anInt6339, local87.getAddress());
				}
				if (local73.method6460()) {
					this.aClass227_1.anInterface8_12 = local73;
					this.aClass227_1.aBoolean464 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass227_3.anInterface8_11 == null) {
				this.aClass227_3.anInterface8_11 = this.aClass90_Sub3_9.method7562(this.aBoolean445);
			}
			local73 = this.aClass227_3.anInterface8_11;
			local73.method6463(this.anInt6339 * 12, 12);
			local87 = local73.method6462();
			if (local87 == null) {
				local54 = false;
			} else {
				if (this.aClass155_1 == null) {
					local204 = this.aShortArray98;
					local212 = this.aByteArray81;
					local200 = this.aShortArray94;
					local208 = this.aShortArray97;
				} else {
					local200 = this.aClass155_1.aShortArray79;
					local204 = this.aClass155_1.aShortArray77;
					local212 = this.aClass155_1.aByteArray59;
					local208 = this.aClass155_1.aShortArray78;
				}
				this.aClass90_Sub3_9.aNativeInterface3.copyNormals(local204, local200, local208, local212, 3.0F / (float) this.aShort83, 3.0F / (float) (this.aShort83 + this.aShort83 / 2), 0, 12, this.anInt6339, local87.getAddress());
				if (local73.method6460()) {
					this.aClass227_3.aBoolean464 = true;
					this.aClass227_3.anInterface8_12 = local73;
				} else {
					local54 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass227_2.anInterface8_11 == null) {
				this.aClass227_2.anInterface8_11 = this.aClass90_Sub3_9.method7562(this.aBoolean445);
			}
			local73 = this.aClass227_2.anInterface8_11;
			local73.method6463(this.anInt6339 * 8, 8);
			local87 = local73.method6462();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass90_Sub3_9.aNativeInterface3.copyTexCoords(this.aFloatArray54, this.aFloatArray53, 0, 8, this.anInt6339, local87.getAddress());
				if (local73.method6460()) {
					this.aClass227_2.anInterface8_12 = local73;
					this.aClass227_2.aBoolean464 = true;
				} else {
					local54 = false;
				}
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!na", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		if (this.lb != null) {
			this.lb.aBoolean465 = Static19.method253(arg0, this.anInt6337);
		}
		if (this.aClass227_2 != null) {
			this.aClass227_2.aBoolean465 = Static236.method3675(this.anInt6337, arg0);
		}
		if (this.aClass227_1 != null) {
			this.aClass227_1.aBoolean465 = Static317.method4952(this.anInt6337, arg0);
		}
		if (this.aClass227_3 != null) {
			this.aClass227_3.aBoolean465 = Static366.method5423(arg0, this.anInt6337);
		}
		this.anInt6317 = arg0;
		if (this.aClass155_1 != null && (this.anInt6317 & 0x10000) == 0) {
			this.aByteArray81 = this.aClass155_1.aByteArray59;
			this.aShortArray94 = this.aClass155_1.aShortArray79;
			this.aShortArray97 = this.aClass155_1.aShortArray78;
			this.aShortArray98 = this.aClass155_1.aShortArray77;
			this.aClass155_1 = null;
		}
		this.aBoolean446 = true;
		this.method5110();
	}

	@OriginalMember(owner = "client!na", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6309; local3++) {
			if (arg0 != 128) {
				this.anIntArray450[local3] = this.anIntArray450[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray451[local3] = this.anIntArray451[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray448[local3] = this.anIntArray448[local3] * arg2 >> 7;
			}
		}
		this.method5113();
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIFIFIJLclient!hn;)S")
	private short method5115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) Class134 arg9) {
		@Pc(10) int local10 = this.anIntArray447[arg1];
		@Pc(17) int local17 = this.anIntArray447[arg1 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(27) int local27 = local10; local27 < local17; local27++) {
			@Pc(34) short local34 = this.aShortArray92[local27];
			if (local34 == 0) {
				local19 = local27;
				break;
			}
			if (Static488.aLongArray22[local27] == arg8) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray92[local19] = (short) (this.anInt6339 + 1);
		Static488.aLongArray22[local19] = arg8;
		this.aShortArray96[this.anInt6339] = (short) arg0;
		this.aShortArray90[this.anInt6339] = (short) arg1;
		this.aShortArray98[this.anInt6339] = (short) arg5;
		this.aShortArray94[this.anInt6339] = (short) arg7;
		this.aShortArray97[this.anInt6339] = (short) arg2;
		this.aByteArray81[this.anInt6339] = (byte) arg3;
		this.aFloatArray54[this.anInt6339] = arg6;
		this.aFloatArray53[this.anInt6339] = arg4;
		return (short) this.anInt6339++;
	}

	@OriginalMember(owner = "client!na", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean447) {
			this.method5104();
		}
		return this.anInt6315;
	}

	@OriginalMember(owner = "client!na", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean447) {
			this.method5104();
		}
		return this.anInt6345;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()[Lclient!bh;")
	@Override
	public Class33[] method7383() {
		return this.aClass33Array6;
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(I)V")
	private void method5116() {
		if ((this.anInt6337 & 0x37) == 0) {
			if (this.aClass227_1 != null) {
				this.aClass227_1.aBoolean464 = false;
			}
		} else if (this.aClass227_3 != null) {
			this.aClass227_3.aBoolean464 = false;
		}
	}

	@OriginalMember(owner = "client!na", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class22.anIntArray20[arg0];
		@Pc(13) int local13 = Class22.anIntArray19[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6309; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray451[local15] + this.anIntArray450[local15] * local13 >> 14;
			this.anIntArray451[local15] = this.anIntArray451[local15] * local13 - local9 * this.anIntArray450[local15] >> 14;
			this.anIntArray450[local15] = local34;
		}
		this.method5113();
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!na", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6309; local7++) {
			if (arg0 != 0) {
				this.anIntArray450[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray451[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray448[local7] += arg2;
			}
		}
		this.method5113();
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!na", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class22.anIntArray20[arg0];
		@Pc(13) int local13 = Class22.anIntArray19[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6309; local15++) {
			@Pc(33) int local33 = this.anIntArray450[local15] * local13 + local9 * this.anIntArray448[local15] >> 14;
			this.anIntArray448[local15] = this.anIntArray448[local15] * local13 - this.anIntArray450[local15] * local9 >> 14;
			this.anIntArray450[local15] = local33;
		}
		this.method5113();
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIBIIII)Z")
	private boolean method5117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg3 && arg6 < arg1 && arg6 < arg7) {
			return false;
		} else if (arg6 > arg3 && arg1 < arg6 && arg6 > arg7) {
			return false;
		} else if (arg2 < arg4 && arg2 < arg0 && arg5 > arg2) {
			return false;
		} else {
			return arg4 >= arg2 || arg0 >= arg2 || arg5 >= arg2;
		}
	}

	@OriginalMember(owner = "client!na", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort84;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "()V")
	@Override
	public void method7401() {
		if (this.anInt6339 > 0 && this.anInt6322 > 0) {
			this.method5114();
			this.method5111();
			this.method5110();
		}
	}

	@OriginalMember(owner = "client!na", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean447) {
			this.method5104();
		}
		return this.anInt6296;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method7389(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class24_Sub3 local8 = (Class24_Sub3) arg0;
		if (this.anInt6285 == 0 || local8.anInt6285 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt6309;
		@Pc(27) int[] local27 = local8.anIntArray450;
		@Pc(30) int[] local30 = local8.anIntArray451;
		@Pc(33) int[] local33 = local8.anIntArray448;
		@Pc(36) short[] local36 = local8.aShortArray98;
		@Pc(39) short[] local39 = local8.aShortArray94;
		@Pc(42) short[] local42 = local8.aShortArray97;
		@Pc(45) byte[] local45 = local8.aByteArray81;
		@Pc(50) short[] local50;
		@Pc(56) short[] local56;
		@Pc(54) short[] local54;
		@Pc(52) byte[] local52;
		if (this.aClass155_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local52 = this.aClass155_1.aByteArray59;
			local50 = this.aClass155_1.aShortArray77;
			local54 = this.aClass155_1.aShortArray78;
			local56 = this.aClass155_1.aShortArray79;
		}
		@Pc(81) short[] local81;
		@Pc(79) short[] local79;
		@Pc(83) short[] local83;
		@Pc(85) byte[] local85;
		if (local8.aClass155_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local83 = local8.aClass155_1.aShortArray78;
			local81 = local8.aClass155_1.aShortArray77;
			local79 = local8.aClass155_1.aShortArray79;
			local85 = local8.aClass155_1.aByteArray59;
		}
		@Pc(106) int[] local106 = local8.anIntArray447;
		@Pc(109) short[] local109 = local8.aShortArray92;
		if (!local8.aBoolean447) {
			local8.method5104();
		}
		@Pc(118) int local118 = local8.anInt6345;
		@Pc(121) int local121 = local8.anInt6332;
		@Pc(124) int local124 = local8.anInt6333;
		@Pc(127) int local127 = local8.anInt6296;
		@Pc(130) int local130 = local8.anInt6315;
		@Pc(133) int local133 = local8.anInt6306;
		for (@Pc(135) int local135 = 0; local135 < this.anInt6309; local135++) {
			@Pc(145) int local145 = this.anIntArray451[local135] - arg2;
			if (local118 <= local145 && local145 <= local121) {
				@Pc(164) int local164 = this.anIntArray450[local135] - arg1;
				if (local164 >= local124 && local164 <= local127) {
					@Pc(184) int local184 = this.anIntArray448[local135] - arg3;
					if (local130 <= local184 && local133 >= local184) {
						@Pc(202) int local202 = -1;
						@Pc(207) int local207 = this.anIntArray447[local135];
						@Pc(214) int local214 = this.anIntArray447[local135 + 1];
						for (@Pc(216) int local216 = local207; local216 < local214; local216++) {
							local202 = this.aShortArray92[local216] - 1;
							if (local202 == -1 || this.aByteArray81[local202] != 0) {
								break;
							}
						}
						if (local202 != -1) {
							for (@Pc(249) int local249 = 0; local249 < local24; local249++) {
								if (local164 == local27[local249] && local184 == local33[local249] && local145 == local30[local249]) {
									local214 = local106[local249 + 1];
									local207 = local106[local249];
									@Pc(286) int local286 = -1;
									for (@Pc(288) int local288 = local207; local288 < local214; local288++) {
										local286 = local109[local288] - 1;
										if (local286 == -1 || local45[local286] != 0) {
											break;
										}
									}
									if (local286 != -1) {
										if (local50 == null) {
											this.aClass155_1 = new Class155();
											local50 = this.aClass155_1.aShortArray77 = Static288.method6410(this.aShortArray98);
											local56 = this.aClass155_1.aShortArray79 = Static288.method6410(this.aShortArray94);
											local54 = this.aClass155_1.aShortArray78 = Static288.method6410(this.aShortArray97);
											local52 = this.aClass155_1.aByteArray59 = Static81.method1145(this.aByteArray81);
										}
										if (local81 == null) {
											@Pc(369) Class155 local369 = local8.aClass155_1 = new Class155();
											local81 = local369.aShortArray77 = Static288.method6410(local36);
											local79 = local369.aShortArray79 = Static288.method6410(local39);
											local83 = local369.aShortArray78 = Static288.method6410(local42);
											local85 = local369.aByteArray59 = Static81.method1145(local45);
										}
										@Pc(402) short local402 = this.aShortArray98[local202];
										@Pc(407) short local407 = this.aShortArray94[local202];
										@Pc(412) short local412 = this.aShortArray97[local202];
										@Pc(417) byte local417 = this.aByteArray81[local202];
										local207 = local106[local249];
										local214 = local106[local249 + 1];
										@Pc(437) int local437;
										for (@Pc(429) int local429 = local207; local429 < local214; local429++) {
											local437 = local109[local429] - 1;
											if (local437 == -1) {
												break;
											}
											if (local85[local437] != 0) {
												local81[local437] += local402;
												local79[local437] += local407;
												local83[local437] += local412;
												local85[local437] += local417;
											}
										}
										local402 = local36[local286];
										local214 = this.anIntArray447[local135 + 1];
										local412 = local42[local286];
										local417 = local45[local286];
										local207 = this.anIntArray447[local135];
										local407 = local39[local286];
										for (local437 = local207; local437 < local214; local437++) {
											@Pc(524) int local524 = this.aShortArray92[local437] - 1;
											if (local524 == -1) {
												break;
											}
											if (local52[local524] != 0) {
												local50[local524] += local402;
												local56[local524] += local407;
												local54[local524] += local412;
												local52[local524] += local417;
											}
										}
										local8.method5116();
										this.method5116();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6324; local7++) {
			this.anIntArray450[local7] = this.anIntArray450[local7] + 7 >> 4;
			this.anIntArray451[local7] = this.anIntArray451[local7] + 7 >> 4;
			this.anIntArray448[local7] = this.anIntArray448[local7] + 7 >> 4;
		}
		this.method5113();
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!na", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class22.anIntArray20[arg0];
		@Pc(13) int local13 = Class22.anIntArray19[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6309; local15++) {
			@Pc(34) int local34 = this.anIntArray451[local15] * local13 - this.anIntArray448[local15] * local9 >> 14;
			this.anIntArray448[local15] = this.anIntArray448[local15] * local13 + local9 * this.anIntArray451[local15] >> 14;
			this.anIntArray451[local15] = local34;
		}
		this.method5113();
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!na", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort83;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class24 method7398(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class24_Sub3 local18;
		@Pc(22) Class24_Sub3 local22;
		if (arg0 == 1) {
			local22 = this.aClass90_Sub3_9.aClass24_Sub3_21;
			local18 = this.aClass90_Sub3_9.aClass24_Sub3_28;
		} else if (arg0 == 2) {
			local22 = this.aClass90_Sub3_9.aClass24_Sub3_29;
			local18 = this.aClass90_Sub3_9.aClass24_Sub3_22;
		} else if (arg0 == 3) {
			local18 = this.aClass90_Sub3_9.aClass24_Sub3_30;
			local22 = this.aClass90_Sub3_9.aClass24_Sub3_25;
		} else if (arg0 == 4) {
			local18 = this.aClass90_Sub3_9.aClass24_Sub3_27;
			local22 = this.aClass90_Sub3_9.aClass24_Sub3_26;
		} else if (arg0 == 5) {
			local22 = this.aClass90_Sub3_9.aClass24_Sub3_24;
			local18 = this.aClass90_Sub3_9.aClass24_Sub3_23;
		} else {
			local18 = local22 = new Class24_Sub3(this.aClass90_Sub3_9, 0, 0, true, false);
		}
		return this.method5119(arg0 != 0, local22, arg2, arg1, local18);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLclient!na;ZZILclient!na;)Lclient!ba;")
	private Class24 method5119(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class24_Sub3 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class24_Sub3 arg4) {
		arg4.anInt6322 = this.anInt6322;
		arg4.aShort83 = this.aShort83;
		arg4.anInt6337 = this.anInt6337;
		arg4.aShort84 = this.aShort84;
		arg4.anInt6339 = this.anInt6339;
		arg4.anInt6326 = this.anInt6326;
		arg4.anInt6324 = this.anInt6324;
		arg4.anInt6309 = this.anInt6309;
		arg4.anInt6285 = this.anInt6285;
		arg4.anInt6317 = arg3;
		@Pc(50) boolean local50 = Static2.method56(arg3, this.anInt6337);
		@Pc(56) boolean local56 = Static583.method7927(arg3, this.anInt6337);
		@Pc(62) boolean local62 = Static366.method5425(arg3, this.anInt6337);
		@Pc(68) boolean local68 = local62 | local56 | local50;
		@Pc(169) int local169;
		if (local68) {
			if (!local50) {
				arg4.anIntArray450 = this.anIntArray450;
			} else if (arg1.anIntArray450 == null || arg1.anIntArray450.length < this.anInt6324) {
				arg4.anIntArray450 = arg1.anIntArray450 = new int[this.anInt6324];
			} else {
				arg4.anIntArray450 = arg1.anIntArray450;
			}
			if (!local56) {
				arg4.anIntArray451 = this.anIntArray451;
			} else if (arg1.anIntArray451 == null || arg1.anIntArray451.length < this.anInt6324) {
				arg4.anIntArray451 = arg1.anIntArray451 = new int[this.anInt6324];
			} else {
				arg4.anIntArray451 = arg1.anIntArray451;
			}
			if (!local62) {
				arg4.anIntArray448 = this.anIntArray448;
			} else if (arg1.anIntArray448 == null || this.anInt6324 > arg1.anIntArray448.length) {
				arg4.anIntArray448 = arg1.anIntArray448 = new int[this.anInt6324];
			} else {
				arg4.anIntArray448 = arg1.anIntArray448;
			}
			for (local169 = 0; local169 < this.anInt6324; local169++) {
				if (local50) {
					arg4.anIntArray450[local169] = this.anIntArray450[local169];
				}
				if (local56) {
					arg4.anIntArray451[local169] = this.anIntArray451[local169];
				}
				if (local62) {
					arg4.anIntArray448[local169] = this.anIntArray448[local169];
				}
			}
		} else {
			arg4.anIntArray448 = this.anIntArray448;
			arg4.anIntArray451 = this.anIntArray451;
			arg4.anIntArray450 = this.anIntArray450;
		}
		if (Static19.method253(arg3, this.anInt6337)) {
			arg4.lb = arg1.lb;
			arg4.lb.aBoolean465 = true;
			arg4.lb.anInterface8_12 = this.lb.anInterface8_12;
			arg4.lb.aBoolean464 = this.lb.aBoolean464;
		} else if (Static287.method4361(this.anInt6337, arg3)) {
			arg4.lb = this.lb;
		} else {
			arg4.lb = null;
		}
		if (Static314.method4912(this.anInt6337, arg3)) {
			if (arg1.aShortArray95 == null || this.anInt6285 > arg1.aShortArray95.length) {
				arg4.aShortArray95 = arg1.aShortArray95 = new short[this.anInt6285];
			} else {
				arg4.aShortArray95 = arg1.aShortArray95;
			}
			for (local169 = 0; local169 < this.anInt6285; local169++) {
				arg4.aShortArray95[local169] = this.aShortArray95[local169];
			}
		} else {
			arg4.aShortArray95 = this.aShortArray95;
		}
		if (Static30.method469(this.anInt6337, arg3)) {
			if (arg1.aByteArray83 == null || this.anInt6285 > arg1.aByteArray83.length) {
				arg4.aByteArray83 = arg1.aByteArray83 = new byte[this.anInt6285];
			} else {
				arg4.aByteArray83 = arg1.aByteArray83;
			}
			for (local169 = 0; local169 < this.anInt6285; local169++) {
				arg4.aByteArray83[local169] = this.aByteArray83[local169];
			}
		} else {
			arg4.aByteArray83 = this.aByteArray83;
		}
		if (Static317.method4952(this.anInt6337, arg3)) {
			arg4.aClass227_1 = arg1.aClass227_1;
			arg4.aClass227_1.aBoolean464 = this.aClass227_1.aBoolean464;
			arg4.aClass227_1.aBoolean465 = true;
			arg4.aClass227_1.anInterface8_12 = this.aClass227_1.anInterface8_12;
		} else if (Static428.method6089(arg3, this.anInt6337)) {
			arg4.aClass227_1 = this.aClass227_1;
		} else {
			arg4.aClass227_1 = null;
		}
		@Pc(546) int local546;
		if (Static24.method349(this.anInt6337, arg3)) {
			if (arg1.aShortArray98 == null || arg1.aShortArray98.length < this.anInt6339) {
				local169 = this.anInt6339;
				arg4.aShortArray94 = arg1.aShortArray94 = new short[local169];
				arg4.aShortArray97 = arg1.aShortArray97 = new short[local169];
				arg4.aShortArray98 = arg1.aShortArray98 = new short[local169];
			} else {
				arg4.aShortArray98 = arg1.aShortArray98;
				arg4.aShortArray94 = arg1.aShortArray94;
				arg4.aShortArray97 = arg1.aShortArray97;
			}
			if (this.aClass155_1 == null) {
				arg4.aClass155_1 = null;
				for (local169 = 0; local169 < this.anInt6339; local169++) {
					arg4.aShortArray98[local169] = this.aShortArray98[local169];
					arg4.aShortArray94[local169] = this.aShortArray94[local169];
					arg4.aShortArray97[local169] = this.aShortArray97[local169];
				}
			} else {
				if (arg1.aClass155_1 == null) {
					arg1.aClass155_1 = new Class155();
				}
				@Pc(530) Class155 local530 = arg4.aClass155_1 = arg1.aClass155_1;
				if (local530.aShortArray77 == null || this.anInt6339 > local530.aShortArray77.length) {
					local546 = this.anInt6339;
					local530.aByteArray59 = new byte[local546];
					local530.aShortArray77 = new short[local546];
					local530.aShortArray78 = new short[local546];
					local530.aShortArray79 = new short[local546];
				}
				for (local546 = 0; local546 < this.anInt6339; local546++) {
					arg4.aShortArray98[local546] = this.aShortArray98[local546];
					arg4.aShortArray94[local546] = this.aShortArray94[local546];
					arg4.aShortArray97[local546] = this.aShortArray97[local546];
					local530.aShortArray77[local546] = this.aClass155_1.aShortArray77[local546];
					local530.aShortArray79[local546] = this.aClass155_1.aShortArray79[local546];
					local530.aShortArray78[local546] = this.aClass155_1.aShortArray78[local546];
					local530.aByteArray59[local546] = this.aClass155_1.aByteArray59[local546];
				}
			}
			arg4.aByteArray81 = this.aByteArray81;
		} else {
			arg4.aShortArray94 = this.aShortArray94;
			arg4.aClass155_1 = this.aClass155_1;
			arg4.aShortArray97 = this.aShortArray97;
			arg4.aByteArray81 = this.aByteArray81;
			arg4.aShortArray98 = this.aShortArray98;
		}
		if (Static366.method5423(arg3, this.anInt6337)) {
			arg4.aClass227_3 = arg1.aClass227_3;
			arg4.aClass227_3.aBoolean465 = true;
			arg4.aClass227_3.anInterface8_12 = this.aClass227_3.anInterface8_12;
			arg4.aClass227_3.aBoolean464 = this.aClass227_3.aBoolean464;
		} else if (Static500.method6917(this.anInt6337, arg3)) {
			arg4.aClass227_3 = this.aClass227_3;
		} else {
			arg4.aClass227_3 = null;
		}
		if (Static189.method3219(this.anInt6337, arg3)) {
			if (arg1.aFloatArray54 == null || this.anInt6285 > arg1.aFloatArray54.length) {
				local169 = this.anInt6339;
				arg4.aFloatArray53 = arg1.aFloatArray53 = new float[local169];
				arg4.aFloatArray54 = arg1.aFloatArray54 = new float[local169];
			} else {
				arg4.aFloatArray54 = arg1.aFloatArray54;
				arg4.aFloatArray53 = arg1.aFloatArray53;
			}
			for (local169 = 0; local169 < this.anInt6339; local169++) {
				arg4.aFloatArray54[local169] = this.aFloatArray54[local169];
				arg4.aFloatArray53[local169] = this.aFloatArray53[local169];
			}
		} else {
			arg4.aFloatArray53 = this.aFloatArray53;
			arg4.aFloatArray54 = this.aFloatArray54;
		}
		if (Static236.method3675(this.anInt6337, arg3)) {
			arg4.aClass227_2 = arg1.aClass227_2;
			arg4.aClass227_2.anInterface8_12 = this.aClass227_2.anInterface8_12;
			arg4.aClass227_2.aBoolean464 = this.aClass227_2.aBoolean464;
			arg4.aClass227_2.aBoolean465 = true;
		} else if (Static170.method2695(arg3, this.anInt6337)) {
			arg4.aClass227_2 = this.aClass227_2;
		} else {
			arg4.aClass227_2 = null;
		}
		if (Static173.method2703(arg3, this.anInt6337)) {
			if (arg1.aShortArray87 == null || arg1.aShortArray87.length < this.anInt6285) {
				local169 = this.anInt6285;
				arg4.aShortArray87 = arg1.aShortArray87 = new short[local169];
				arg4.aShortArray99 = arg1.aShortArray99 = new short[local169];
				arg4.aShortArray88 = arg1.aShortArray88 = new short[local169];
			} else {
				arg4.aShortArray87 = arg1.aShortArray87;
				arg4.aShortArray99 = arg1.aShortArray99;
				arg4.aShortArray88 = arg1.aShortArray88;
			}
			for (local169 = 0; local169 < this.anInt6285; local169++) {
				arg4.aShortArray87[local169] = this.aShortArray87[local169];
				arg4.aShortArray88[local169] = this.aShortArray88[local169];
				arg4.aShortArray99[local169] = this.aShortArray99[local169];
			}
		} else {
			arg4.aShortArray88 = this.aShortArray88;
			arg4.aShortArray87 = this.aShortArray87;
			arg4.aShortArray99 = this.aShortArray99;
		}
		if (Static461.method6453(this.anInt6337, arg3)) {
			arg4.aClass9_1 = arg1.aClass9_1;
			arg4.aClass9_1.aBoolean11 = this.aClass9_1.aBoolean11;
			arg4.aClass9_1.anInterface9_1 = this.aClass9_1.anInterface9_1;
			arg4.aClass9_1.aBoolean10 = true;
		} else if (Static337.method5191(this.anInt6337, arg3)) {
			arg4.aClass9_1 = this.aClass9_1;
		} else {
			arg4.aClass9_1 = null;
		}
		if (Static206.method3381(arg3, this.anInt6337)) {
			if (arg1.aShortArray91 == null || arg1.aShortArray91.length < this.anInt6285) {
				local169 = this.anInt6285;
				arg4.aShortArray91 = arg1.aShortArray91 = new short[local169];
			} else {
				arg4.aShortArray91 = arg1.aShortArray91;
			}
			for (local169 = 0; local169 < this.anInt6285; local169++) {
				arg4.aShortArray91[local169] = this.aShortArray91[local169];
			}
		} else {
			arg4.aShortArray91 = this.aShortArray91;
		}
		if (!Static68.method964(this.anInt6337, arg3)) {
			arg4.aClass169Array1 = this.aClass169Array1;
		} else if (arg1.aClass169Array1 == null || arg1.aClass169Array1.length < this.anInt6326) {
			local169 = this.anInt6326;
			arg4.aClass169Array1 = arg1.aClass169Array1 = new Class169[local169];
			for (local546 = 0; local546 < this.anInt6326; local546++) {
				arg4.aClass169Array1[local546] = this.aClass169Array1[local546].method4008();
			}
		} else {
			arg4.aClass169Array1 = arg1.aClass169Array1;
			for (local169 = 0; local169 < this.anInt6326; local169++) {
				arg4.aClass169Array1[local169].method4004(this.aClass169Array1[local169]);
			}
		}
		arg4.anIntArray446 = this.anIntArray446;
		arg4.aShortArray89 = this.aShortArray89;
		arg4.aShortArray96 = this.aShortArray96;
		arg4.anIntArrayArray52 = this.anIntArrayArray52;
		arg4.aShortArray93 = this.aShortArray93;
		arg4.aClass33Array6 = this.aClass33Array6;
		arg4.anIntArrayArray51 = this.anIntArrayArray51;
		arg4.aShortArray92 = this.aShortArray92;
		if (this.aBoolean447) {
			arg4.anInt6294 = this.anInt6294;
			arg4.anInt6345 = this.anInt6345;
			arg4.anInt6332 = this.anInt6332;
			arg4.anInt6315 = this.anInt6315;
			arg4.anInt6333 = this.anInt6333;
			arg4.aBoolean447 = true;
			arg4.anInt6296 = this.anInt6296;
			arg4.anInt6306 = this.anInt6306;
		} else {
			arg4.aBoolean447 = false;
		}
		arg4.anIntArray452 = this.anIntArray452;
		arg4.aShortArray90 = this.aShortArray90;
		arg4.anIntArrayArray53 = this.anIntArrayArray53;
		arg4.anIntArray449 = this.anIntArray449;
		arg4.aClass335Array6 = this.aClass335Array6;
		arg4.anIntArray447 = this.anIntArray447;
		arg4.aClass317Array1 = this.aClass317Array1;
		return arg4;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class93_Sub3 local8 = (Class93_Sub3) arg2;
		@Pc(12) Class93_Sub3 local12 = this.aClass90_Sub3_9.aClass93_Sub3_16;
		@Pc(33) float local33 = local8.aFloat106 * local12.aFloat109 + local12.aFloat112 * local8.aFloat110 + local12.aFloat108 * local8.aFloat113 + local12.aFloat110;
		@Pc(54) float local54 = local8.aFloat106 * local12.aFloat107 + local8.aFloat113 * local12.aFloat115 + local8.aFloat110 * local12.aFloat111 + local12.aFloat113;
		Static518.aFloat183 = local12.aFloat117 * local8.aFloat115 + local8.aFloat108 * local12.aFloat116 + local12.aFloat114 * local8.aFloat117;
		Static445.aFloat168 = local12.aFloat115 * local8.aFloat115 + local12.aFloat111 * local8.aFloat108 + local12.aFloat107 * local8.aFloat117;
		Static259.aFloat124 = local8.aFloat116 * local12.aFloat107 + local12.aFloat111 * local8.aFloat112 + local8.aFloat111 * local12.aFloat115;
		Static202.aFloat90 = local12.aFloat111 * local8.aFloat109 + local12.aFloat115 * local8.aFloat107 + local12.aFloat107 * local8.aFloat114;
		Static459.aFloat173 = local8.aFloat116 * local12.aFloat114 + local12.aFloat117 * local8.aFloat111 + local12.aFloat116 * local8.aFloat112;
		Static400.aFloat165 = local8.aFloat114 * local12.aFloat114 + local12.aFloat117 * local8.aFloat107 + local8.aFloat109 * local12.aFloat116;
		Static257.aFloat162 = local8.aFloat112 * local12.aFloat112 + local12.aFloat108 * local8.aFloat111 + local12.aFloat109 * local8.aFloat116;
		@Pc(201) float local201 = local12.aFloat106 + local12.aFloat117 * local8.aFloat113 + local8.aFloat110 * local12.aFloat116 + local12.aFloat114 * local8.aFloat106;
		Static500.aFloat180 = local8.aFloat114 * local12.aFloat109 + local12.aFloat108 * local8.aFloat107 + local12.aFloat112 * local8.aFloat109;
		Static68.aFloat22 = local12.aFloat109 * local8.aFloat117 + local8.aFloat108 * local12.aFloat112 + local8.aFloat115 * local12.aFloat108;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass90_Sub3_9.anInt9575;
		@Pc(255) int local255 = this.aClass90_Sub3_9.anInt9586;
		if (!this.aBoolean447) {
			this.method5104();
		}
		Static277.anIntArray401[0] = this.anInt6333;
		Static583.anIntArray727[0] = this.anInt6345;
		Static208.anIntArray342[0] = this.anInt6315;
		Static277.anIntArray401[1] = this.anInt6296;
		Static583.anIntArray727[1] = this.anInt6345;
		Static208.anIntArray342[1] = this.anInt6315;
		Static277.anIntArray401[2] = this.anInt6333;
		Static583.anIntArray727[2] = this.anInt6332;
		Static208.anIntArray342[2] = this.anInt6315;
		Static277.anIntArray401[3] = this.anInt6296;
		Static583.anIntArray727[3] = this.anInt6332;
		Static277.anIntArray401[4] = this.anInt6333;
		Static208.anIntArray342[3] = this.anInt6315;
		Static583.anIntArray727[4] = this.anInt6345;
		Static208.anIntArray342[4] = this.anInt6306;
		Static277.anIntArray401[5] = this.anInt6296;
		Static583.anIntArray727[5] = this.anInt6345;
		Static208.anIntArray342[5] = this.anInt6306;
		Static277.anIntArray401[6] = this.anInt6333;
		Static583.anIntArray727[6] = this.anInt6332;
		Static277.anIntArray401[7] = this.anInt6296;
		Static208.anIntArray342[6] = this.anInt6306;
		Static583.anIntArray727[7] = this.anInt6332;
		Static208.anIntArray342[7] = this.anInt6306;
		@Pc(414) float local414;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(400) float local400;
		@Pc(395) float local395;
		@Pc(390) float local390;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static208.anIntArray342[local383];
			local395 = Static583.anIntArray727[local383];
			local400 = Static277.anIntArray401[local383];
			local414 = local33 + local390 * Static500.aFloat180 + local400 * Static257.aFloat162 + Static68.aFloat22 * local395;
			local428 = local201 + Static400.aFloat165 * local390 + Static518.aFloat183 * local395 + Static459.aFloat173 * local400;
			local442 = Static202.aFloat90 * local390 + local395 * Static445.aFloat168 + Static259.aFloat124 * local400 + local54;
			if ((float) this.aClass90_Sub3_9.anInt9557 <= local428) {
				@Pc(461) float local461 = (float) local251 * local414 / local428 + (float) this.aClass90_Sub3_9.anInt9552;
				@Pc(473) float local473 = (float) this.aClass90_Sub3_9.anInt9576 + local442 * (float) local255 / local428;
				if (local461 < local241) {
					local241 = local461;
				}
				if (local461 > local243) {
					local243 = local461;
				}
				if (local247 < local473) {
					local247 = local473;
				}
				local239 = true;
				if (local473 < local245) {
					local245 = local473;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.anInt6339 > Static342.anIntArray454.length) {
				Static499.anIntArray639 = new int[this.anInt6339];
				Static342.anIntArray454 = new int[this.anInt6339];
			}
			@Pc(632) int local632;
			for (@Pc(550) int local550 = 0; local550 < this.anInt6309; local550++) {
				local395 = this.anIntArray451[local550];
				local390 = this.anIntArray448[local550];
				local400 = this.anIntArray450[local550];
				local414 = local390 * Static500.aFloat180 + local395 * Static68.aFloat22 + Static257.aFloat162 * local400 + local33;
				local442 = local54 + Static445.aFloat168 * local395 + local400 * Static259.aFloat124 + local390 * Static202.aFloat90;
				local428 = local201 + local390 * Static400.aFloat165 + Static459.aFloat173 * local400 + Static518.aFloat183 * local395;
				@Pc(645) int local645;
				@Pc(650) int local650;
				@Pc(657) int local657;
				if ((float) this.aClass90_Sub3_9.anInt9557 <= local428) {
					local632 = (int) (local414 * (float) local251 / local428 + (float) this.aClass90_Sub3_9.anInt9552);
					local645 = (int) ((float) this.aClass90_Sub3_9.anInt9576 + local442 * (float) local255 / local428);
					local650 = this.anIntArray447[local550];
					local657 = this.anIntArray447[local550 + 1];
					for (@Pc(659) int local659 = local650; local659 < local657; local659++) {
						@Pc(668) int local668 = this.aShortArray92[local659] - 1;
						if (local668 == -1) {
							break;
						}
						Static342.anIntArray454[local668] = local632;
						Static499.anIntArray639[local668] = local645;
					}
				} else {
					local632 = this.anIntArray447[local550];
					local645 = this.anIntArray447[local550 + 1];
					for (local650 = local632; local650 < local645; local650++) {
						local657 = this.aShortArray92[local650] - 1;
						if (local657 == -1) {
							break;
						}
						Static342.anIntArray454[this.aShortArray92[local650] - 1] = -999999;
					}
				}
			}
			for (local632 = 0; local632 < this.anInt6285; local632++) {
				if (Static342.anIntArray454[this.aShortArray87[local632]] != -999999 && Static342.anIntArray454[this.aShortArray88[local632]] != -999999 && Static342.anIntArray454[this.aShortArray99[local632]] != -999999 && this.method5117(Static342.anIntArray454[this.aShortArray88[local632]], Static499.anIntArray639[this.aShortArray88[local632]], arg0, Static499.anIntArray639[this.aShortArray87[local632]], Static342.anIntArray454[this.aShortArray87[local632]], Static342.anIntArray454[this.aShortArray99[local632]], arg1, Static499.anIntArray639[this.aShortArray99[local632]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!na", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.aShort84 = (short) arg0;
		this.method5108();
	}

	@OriginalMember(owner = "client!na", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean447) {
			this.method5104();
		}
		return this.anInt6332;
	}

	@OriginalMember(owner = "client!na", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static117.anInt2015 = 0;
			local14 = 0;
			Static331.anInt6267 = 0;
			Static150.anInt2794 = 0;
			for (local20 = 0; local20 < this.anInt6309; local20++) {
				Static331.anInt6267 += this.anIntArray450[local20];
				Static117.anInt2015 += this.anIntArray451[local20];
				local14++;
				Static150.anInt2794 += this.anIntArray448[local20];
			}
			if (local14 > 0) {
				Static150.anInt2794 = Static150.anInt2794 / local14 + arg3;
				Static331.anInt6267 = Static331.anInt6267 / local14 + arg1;
				Static117.anInt2015 = Static117.anInt2015 / local14 + arg2;
			} else {
				Static331.anInt6267 = arg1;
				Static117.anInt2015 = arg2;
				Static150.anInt2794 = arg3;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt6309; local14++) {
				this.anIntArray450[local14] += arg1;
				this.anIntArray451[local14] += arg2;
				this.anIntArray448[local14] += arg3;
			}
		} else {
			@Pc(166) int local166;
			@Pc(184) int local184;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt6309; local14++) {
					this.anIntArray450[local14] -= Static331.anInt6267;
					this.anIntArray451[local14] -= Static117.anInt2015;
					this.anIntArray448[local14] -= Static150.anInt2794;
					if (arg3 != 0) {
						local20 = Class22.anIntArray20[arg3];
						local166 = Class22.anIntArray19[arg3];
						local184 = this.anIntArray451[local14] * local20 + this.anIntArray450[local14] * local166 + 16383 >> 14;
						this.anIntArray451[local14] = this.anIntArray451[local14] * local166 + 16383 - this.anIntArray450[local14] * local20 >> 14;
						this.anIntArray450[local14] = local184;
					}
					if (arg1 != 0) {
						local20 = Class22.anIntArray20[arg1];
						local166 = Class22.anIntArray19[arg1];
						local184 = local166 * this.anIntArray451[local14] + 16383 - local20 * this.anIntArray448[local14] >> 14;
						this.anIntArray448[local14] = local20 * this.anIntArray451[local14] + local166 * this.anIntArray448[local14] + 16383 >> 14;
						this.anIntArray451[local14] = local184;
					}
					if (arg2 != 0) {
						local20 = Class22.anIntArray20[arg2];
						local166 = Class22.anIntArray19[arg2];
						local184 = local20 * this.anIntArray448[local14] + local166 * this.anIntArray450[local14] + 16383 >> 14;
						this.anIntArray448[local14] = this.anIntArray448[local14] * local166 + 16383 - this.anIntArray450[local14] * local20 >> 14;
						this.anIntArray450[local14] = local184;
					}
					this.anIntArray450[local14] += Static331.anInt6267;
					this.anIntArray451[local14] += Static117.anInt2015;
					this.anIntArray448[local14] += Static150.anInt2794;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt6309; local14++) {
					this.anIntArray450[local14] -= Static331.anInt6267;
					this.anIntArray451[local14] -= Static117.anInt2015;
					this.anIntArray448[local14] -= Static150.anInt2794;
					this.anIntArray450[local14] = this.anIntArray450[local14] * arg1 / 128;
					this.anIntArray451[local14] = this.anIntArray451[local14] * arg2 / 128;
					this.anIntArray448[local14] = this.anIntArray448[local14] * arg3 / 128;
					this.anIntArray450[local14] += Static331.anInt6267;
					this.anIntArray451[local14] += Static117.anInt2015;
					this.anIntArray448[local14] += Static150.anInt2794;
				}
			} else {
				@Pc(508) Class317 local508;
				@Pc(513) Class169 local513;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt6285; local14++) {
						local20 = (this.aByteArray83[local14] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray83[local14] = (byte) local20;
					}
					if (this.aClass317Array1 != null) {
						for (local20 = 0; local20 < this.anInt6326; local20++) {
							local508 = this.aClass317Array1[local20];
							local513 = this.aClass169Array1[local20];
							local513.anInt4726 = 255 - (this.aByteArray83[local508.anInt8893] & 0xFF) << 24 | local513.anInt4726 & 0xFFFFFF;
						}
					}
					this.method5108();
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt6285; local14++) {
						local20 = this.aShortArray95[local14] & 0xFFFF;
						local166 = local20 >> 10 & 0x3F;
						local184 = local20 >> 7 & 0x7;
						@Pc(577) int local577 = local20 & 0x7F;
						local184 += arg2 / 4;
						@Pc(590) int local590 = local166 + arg1 & 0x3F;
						local577 += arg3;
						if (local184 < 0) {
							local184 = 0;
						} else if (local184 > 7) {
							local184 = 7;
						}
						if (local577 < 0) {
							local577 = 0;
						} else if (local577 > 127) {
							local577 = 127;
						}
						this.aShortArray95[local14] = (short) (local577 | local590 << 10 | local184 << 7);
					}
					if (this.aClass317Array1 != null) {
						for (local20 = 0; local20 < this.anInt6326; local20++) {
							local508 = this.aClass317Array1[local20];
							local513 = this.aClass169Array1[local20];
							local513.anInt4726 = local513.anInt4726 & 0xFF000000 | Static36.anIntArray31[this.aShortArray95[local508.anInt8893] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5108();
				} else {
					@Pc(695) Class169 local695;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt6326; local14++) {
							local695 = this.aClass169Array1[local14];
							local695.anInt4727 += arg1;
							local695.anInt4722 += arg2;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt6326; local14++) {
							local695 = this.aClass169Array1[local14];
							local695.anInt4728 = arg1 * local695.anInt4728 >> 7;
							local695.anInt4725 = local695.anInt4725 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt6326; local14++) {
							local695 = this.aClass169Array1[local14];
							local695.anInt4730 = local695.anInt4730 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}
}
