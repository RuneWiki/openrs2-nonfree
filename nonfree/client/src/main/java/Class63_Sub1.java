import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
	private int anInt1884;

	@OriginalMember(owner = "client!dm", name = "D", descriptor = "Lclient!gk;")
	private Class123 aClass123_1;

	@OriginalMember(owner = "client!dm", name = "K", descriptor = "Lclient!hea;")
	private final Class134_Sub1 aClass134_Sub1_9;

	@OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
	private int anInt1891;

	@OriginalMember(owner = "client!dm", name = "O", descriptor = "I")
	private int anInt1893;

	@OriginalMember(owner = "client!dm", name = "ib", descriptor = "I")
	private int anInt1909;

	@OriginalMember(owner = "client!dm", name = "kb", descriptor = "Lclient!k;")
	private Class180 aClass180_1;

	@OriginalMember(owner = "client!dm", name = "mb", descriptor = "Lclient!lc;")
	private Class202 aClass202_1;

	@OriginalMember(owner = "client!dm", name = "qb", descriptor = "I")
	private int anInt1913;

	@OriginalMember(owner = "client!dm", name = "vb", descriptor = "I")
	private int anInt1918;

	@OriginalMember(owner = "client!dm", name = "wb", descriptor = "I")
	private int anInt1919;

	@OriginalMember(owner = "client!dm", name = "xb", descriptor = "Lclient!gk;")
	private Class123 aClass123_2;

	@OriginalMember(owner = "client!dm", name = "Jb", descriptor = "I")
	private int anInt1928;

	@OriginalMember(owner = "client!dm", name = "fc", descriptor = "Lclient!gk;")
	private Class123 aClass123_3;

	@OriginalMember(owner = "client!dm", name = "kc", descriptor = "Z")
	private boolean aBoolean152;

	@OriginalMember(owner = "client!dm", name = "qc", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!dm", name = "rc", descriptor = "I")
	private int anInt1947;

	@OriginalMember(owner = "client!dm", name = "tc", descriptor = "Lclient!gk;")
	private Class123 aClass123_4;

	@OriginalMember(owner = "client!dm", name = "xc", descriptor = "I")
	private int anInt1950;

	@OriginalMember(owner = "client!dm", name = "Dc", descriptor = "Z")
	private boolean aBoolean155;

	@OriginalMember(owner = "client!dm", name = "Fc", descriptor = "I")
	private int anInt1956;

	@OriginalMember(owner = "client!dm", name = "Ec", descriptor = "[I")
	private int[] anIntArray165;

	@OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
	private int anInt1888;

	@OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
	private int anInt1889;

	@OriginalMember(owner = "client!dm", name = "Gb", descriptor = "Z")
	private boolean aBoolean151;

	@OriginalMember(owner = "client!dm", name = "Mb", descriptor = "I")
	private int anInt1930;

	@OriginalMember(owner = "client!dm", name = "Hb", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!dm", name = "I", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!dm", name = "Kb", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!dm", name = "E", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!dm", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!dm", name = "Jc", descriptor = "[Lclient!lea;")
	private Class206[] aClass206Array1;

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "[Lclient!in;")
	private Class158[] aClass158Array1;

	@OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
	private int anInt1886;

	@OriginalMember(owner = "client!dm", name = "nc", descriptor = "[Lclient!sr;")
	private Class311[] aClass311Array1;

	@OriginalMember(owner = "client!dm", name = "y", descriptor = "[Lclient!nc;")
	private Class232[] aClass232Array1;

	@OriginalMember(owner = "client!dm", name = "Ob", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!dm", name = "Xb", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!dm", name = "w", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!dm", name = "zb", descriptor = "[F")
	private float[] aFloatArray3;

	@OriginalMember(owner = "client!dm", name = "gc", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!dm", name = "cb", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!dm", name = "Gc", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!dm", name = "U", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!dm", name = "pc", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!dm", name = "ab", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!dm", name = "Yb", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!dm", name = "dc", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!dm", name = "Tb", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!dm", name = "hb", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!dm", name = "G", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!dm", name = "F", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!dm", name = "jc", descriptor = "[F")
	private float[] aFloatArray4;

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!dm", name = "vc", descriptor = "[I")
	private int[] anIntArray164;

	@OriginalMember(owner = "client!dm", name = "Ic", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!dm", name = "ob", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!dm", name = "ac", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!dm", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!dm", name = "ic", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!hea;Lclient!lm;IIII)V")
	public Class63_Sub1(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface7 local11 = arg0.anInterface7_10;
		@Pc(15) int[] local15 = new int[arg1.anInt5254];
		this.anIntArray165 = new int[arg1.anInt5242 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt5254; local24++) {
			if ((arg1.aByteArray57 == null || arg1.aByteArray57[local24] != 2) && (arg1.aShortArray88 == null || arg1.aShortArray88[local24] == -1 || !local11.method3874(arg1.aShortArray88[local24] & 0xFFFF).aBoolean11)) {
				local15[this.anInt1888++] = local24;
				this.anIntArray165[arg1.aShortArray89[local24]]++;
				this.anIntArray165[arg1.aShortArray93[local24]]++;
				this.anIntArray165[arg1.aShortArray84[local24]]++;
			}
		}
		this.anInt1889 = this.anInt1888;
		@Pc(112) long[] local112 = new long[this.anInt1888];
		@Pc(124) boolean local124 = (this.anInt1913 & 0x100) != 0;
		@Pc(136) int local136;
		@Pc(147) int local147;
		@Pc(286) int local286;
		label501: for (@Pc(126) int local126 = 0; local126 < this.anInt1888; local126++) {
			@Pc(132) int local132 = local15[local126];
			@Pc(134) Class3 local134 = null;
			local136 = 0;
			@Pc(138) byte local138 = 0;
			@Pc(140) byte local140 = 0;
			@Pc(142) byte local142 = 0;
			if (arg1.aClass264Array1 != null) {
				for (local147 = 0; local147 < arg1.aClass264Array1.length; local147++) {
					@Pc(154) Class264 local154 = arg1.aClass264Array1[local147];
					if (local154.anInt7109 == local132) {
						@Pc(163) Class352 local163 = Static548.method7013(local154.anInt7105);
						if (local163.aBoolean735) {
							local112[local126] = Long.MAX_VALUE;
							this.anInt1889--;
							continue label501;
						}
					}
				}
			}
			@Pc(190) short local190 = -1;
			if (arg1.aShortArray88 != null) {
				local190 = arg1.aShortArray88[local132];
				if (local190 != -1) {
					local134 = local11.method3874(local190 & 0xFFFF);
					local142 = local134.aByte1;
					local140 = local134.aByte7;
				}
			}
			@Pc(242) boolean local242 = arg1.aByteArray61 != null && arg1.aByteArray61[local132] != 0 || local134 != null && !local134.aBoolean8 | local134.aBoolean10;
			if ((local124 || local242) && arg1.aByteArray60 != null) {
				local136 += arg1.aByteArray60[local132] << 17;
			}
			if (local242) {
				local136 += 65536;
			}
			local136 += (local140 & 0xFF) << 8;
			local136 += local142 & 0xFF;
			local286 = local138 + ((local190 & 0xFFFF) << 16);
			@Pc(292) int local292 = local286 + (local126 & 0xFFFF);
			local112[local126] = ((long) local136 << 32) + ((long) local292);
			this.aBoolean151 |= local242;
		}
		Static320.method3905(local15, local112);
		this.anInt1930 = arg1.anInt5244;
		this.anIntArray162 = arg1.anIntArray409;
		this.anIntArray160 = arg1.anIntArray407;
		this.anIntArray163 = arg1.anIntArray405;
		this.aShortArray34 = arg1.aShortArray86;
		this.lb = arg1.anInt5242;
		@Pc(350) Class41[] local350 = new Class41[this.lb];
		this.aClass206Array1 = arg1.aClass206Array3;
		this.aClass158Array1 = arg1.aClass158Array3;
		@Pc(378) int local378;
		@Pc(392) int local392;
		if (arg1.aClass264Array1 != null) {
			this.anInt1886 = arg1.aClass264Array1.length;
			this.aClass311Array1 = new Class311[this.anInt1886];
			this.aClass232Array1 = new Class232[this.anInt1886];
			for (local378 = 0; local378 < this.anInt1886; local378++) {
				@Pc(385) Class264 local385 = arg1.aClass264Array1[local378];
				@Pc(390) Class352 local390 = Static548.method7013(local385.anInt7105);
				local392 = -1;
				for (@Pc(394) int local394 = 0; local394 < this.anInt1888; local394++) {
					if (local385.anInt7109 == local15[local394]) {
						local392 = local394;
						break;
					}
				}
				if (local392 == -1) {
					throw new RuntimeException();
				}
				local147 = Static379.anIntArray506[arg1.aShortArray87[local385.anInt7109] & 0xFFFF] & 0xFFFFFF;
				local147 |= 255 - (arg1.aByteArray61 == null ? 0 : arg1.aByteArray61[local385.anInt7109]) << 24;
				this.aClass232Array1[local378] = new Class232(local392, arg1.aShortArray89[local385.anInt7109], arg1.aShortArray93[local385.anInt7109], arg1.aShortArray84[local385.anInt7109], local390.anInt9415, local390.anInt9412, local390.anInt9416, local390.anInt9417, local390.anInt9410, local390.aBoolean735, local390.aBoolean736, local385.anInt7107);
				this.aClass311Array1[local378] = new Class311(local147);
			}
		}
		local378 = this.anInt1888 * 3;
		this.aShortArray40 = new short[local378];
		this.aShortArray41 = new short[this.anInt1888];
		this.aShortArray33 = new short[local378];
		this.aFloatArray3 = new float[local378];
		this.aShortArray43 = new short[local378];
		this.aShortArray38 = new short[this.anInt1888];
		this.aShortArray44 = new short[local378];
		this.aShortArray36 = new short[this.anInt1888];
		this.aShort35 = (short) arg3;
		this.aShortArray37 = new short[this.anInt1888];
		this.aByteArray17 = new byte[this.anInt1888];
		this.aShortArray42 = new short[this.anInt1888];
		this.aByteArray16 = new byte[local378];
		this.aShortArray39 = new short[local378];
		this.aShortArray35 = new short[local378];
		this.aShort34 = (short) arg4;
		this.aFloatArray4 = new float[local378];
		Static219.aLongArray22 = new long[local378];
		if (arg1.aShortArray90 != null) {
			this.aShortArray32 = new short[this.anInt1888];
		}
		local136 = 0;
		for (local286 = 0; local286 < arg1.anInt5242; local286++) {
			local392 = this.anIntArray165[local286];
			this.anIntArray165[local286] = local136;
			local136 += local392;
			local350[local286] = new Class41();
		}
		this.anIntArray165[arg1.anInt5242] = local136;
		@Pc(634) int[] local634 = null;
		@Pc(636) int[] local636 = null;
		@Pc(638) int[] local638 = null;
		@Pc(640) float[][] local640 = null;
		@Pc(658) int[] local658;
		@Pc(666) int local666;
		@Pc(702) int local702;
		@Pc(708) int local708;
		@Pc(722) int local722;
		@Pc(724) int local724;
		@Pc(755) int local755;
		@Pc(760) int local760;
		@Pc(922) float local922;
		@Pc(913) float local913;
		@Pc(920) float local920;
		if (arg1.aByteArray58 != null) {
			@Pc(646) int local646 = arg1.anInt5245;
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
			for (local702 = 0; local702 < this.anInt1888; local702++) {
				local708 = local15[local702];
				if (arg1.aByteArray58[local708] != -1) {
					local722 = arg1.aByteArray58[local708] & 0xFF;
					for (local724 = 0; local724 < 3; local724++) {
						@Pc(733) short local733;
						if (local724 == 0) {
							local733 = arg1.aShortArray89[local708];
						} else if (local724 == 1) {
							local733 = arg1.aShortArray93[local708];
						} else {
							local733 = arg1.aShortArray84[local708];
						}
						local755 = arg1.anIntArray407[local733];
						local760 = arg1.anIntArray409[local733];
						@Pc(765) int local765 = arg1.anIntArray405[local733];
						if (local649[local722] > local755) {
							local649[local722] = local755;
						}
						if (local755 > local652[local722]) {
							local652[local722] = local755;
						}
						if (local655[local722] > local760) {
							local655[local722] = local760;
						}
						if (local760 > local658[local722]) {
							local658[local722] = local760;
						}
						if (local661[local722] > local765) {
							local661[local722] = local765;
						}
						if (local765 > local664[local722]) {
							local664[local722] = local765;
						}
					}
				}
			}
			local636 = new int[local646];
			local640 = new float[local646][];
			local634 = new int[local646];
			local638 = new int[local646];
			for (local708 = 0; local708 < local646; local708++) {
				@Pc(857) byte local857 = arg1.aByteArray62[local708];
				if (local857 > 0) {
					local634[local708] = (local649[local708] + local652[local708]) / 2;
					local636[local708] = (local658[local708] + local655[local708]) / 2;
					local638[local708] = (local664[local708] + local661[local708]) / 2;
					if (local857 == 1) {
						local760 = arg1.anIntArray402[local708];
						local913 = 64.0F / (float) arg1.anIntArray404[local708];
						if (local760 == 0) {
							local920 = 1.0F;
							local922 = 1.0F;
						} else if (local760 <= 0) {
							local922 = (float) -local760 / 1024.0F;
							local920 = 1.0F;
						} else {
							local920 = (float) local760 / 1024.0F;
							local922 = 1.0F;
						}
					} else if (local857 == 2) {
						local913 = 64.0F / (float) arg1.anIntArray404[local708];
						local920 = 64.0F / (float) arg1.anIntArray412[local708];
						local922 = 64.0F / (float) arg1.anIntArray402[local708];
					} else {
						local913 = (float) arg1.anIntArray404[local708] / 1024.0F;
						local920 = (float) arg1.anIntArray412[local708] / 1024.0F;
						local922 = (float) arg1.anIntArray402[local708] / 1024.0F;
					}
					local640[local708] = Static214.method3339(local920, arg1.aShortArray91[local708], arg1.aShortArray92[local708], local922, arg1.aShortArray85[local708], local913, arg1.aByteArray59[local708] & 0xFF);
				}
			}
		}
		@Pc(1038) Class313[] local1038 = new Class313[arg1.anInt5254];
		@Pc(1057) short local1057;
		@Pc(1067) int local1067;
		@Pc(1078) int local1078;
		for (@Pc(1040) int local1040 = 0; local1040 < arg1.anInt5254; local1040++) {
			@Pc(1047) short local1047 = arg1.aShortArray89[local1040];
			@Pc(1052) short local1052 = arg1.aShortArray93[local1040];
			local1057 = arg1.aShortArray84[local1040];
			local1067 = this.anIntArray160[local1052] - this.anIntArray160[local1047];
			local1078 = this.anIntArray162[local1052] - this.anIntArray162[local1047];
			local666 = this.anIntArray163[local1052] - this.anIntArray163[local1047];
			local702 = this.anIntArray160[local1057] - this.anIntArray160[local1047];
			local708 = this.anIntArray162[local1057] - this.anIntArray162[local1047];
			local722 = this.anIntArray163[local1057] - this.anIntArray163[local1047];
			local724 = local722 * local1078 - local666 * local708;
			@Pc(1138) int local1138 = local666 * local702 - local1067 * local722;
			for (local755 = local708 * local1067 - local1078 * local702; local724 > 8192 || local1138 > 8192 || local755 > 8192 || local724 < -8192 || local1138 < -8192 || local755 < -8192; local755 >>= 0x1) {
				local1138 >>= 0x1;
				local724 >>= 0x1;
			}
			local760 = (int) Math.sqrt((double) (local1138 * local1138 + local724 * local724 + local755 * local755));
			if (local760 <= 0) {
				local760 = 1;
			}
			local724 = local724 * 256 / local760;
			local1138 = local1138 * 256 / local760;
			local755 = local755 * 256 / local760;
			@Pc(1237) byte local1237 = arg1.aByteArray57 == null ? 0 : arg1.aByteArray57[local1040];
			if (local1237 == 0) {
				@Pc(1268) Class41 local1268 = local350[local1047];
				local1268.anInt845++;
				local1268.anInt842 += local1138;
				local1268.anInt843 += local755;
				local1268.anInt844 += local724;
				@Pc(1296) Class41 local1296 = local350[local1052];
				local1296.anInt842 += local1138;
				local1296.anInt844 += local724;
				local1296.anInt845++;
				local1296.anInt843 += local755;
				@Pc(1324) Class41 local1324 = local350[local1057];
				local1324.anInt843 += local755;
				local1324.anInt844 += local724;
				local1324.anInt842 += local1138;
				local1324.anInt845++;
			} else if (local1237 == 1) {
				@Pc(1253) Class313 local1253 = local1038[local1040] = new Class313();
				local1253.anInt8241 = local724;
				local1253.anInt8237 = local755;
				local1253.anInt8235 = local1138;
			}
		}
		@Pc(1361) int local1361;
		for (@Pc(1355) int local1355 = 0; local1355 < this.anInt1888; local1355++) {
			local1361 = local15[local1355];
			@Pc(1368) int local1368 = arg1.aShortArray87[local1361] & 0xFFFF;
			@Pc(1376) short local1376;
			if (arg1.aShortArray88 == null) {
				local1376 = -1;
			} else {
				local1376 = arg1.aShortArray88[local1361];
			}
			if (arg1.aByteArray58 == null) {
				local1078 = -1;
			} else {
				local1078 = arg1.aByteArray58[local1361];
			}
			if (arg1.aByteArray61 == null) {
				local666 = 0;
			} else {
				local666 = arg1.aByteArray61[local1361] & 0xFF;
			}
			@Pc(1408) float local1408 = 0.0F;
			@Pc(1410) float local1410 = 0.0F;
			@Pc(1412) float local1412 = 0.0F;
			local922 = 0.0F;
			local913 = 0.0F;
			local920 = 0.0F;
			@Pc(1420) byte local1420 = 0;
			@Pc(1422) byte local1422 = 0;
			@Pc(1424) int local1424 = 0;
			@Pc(1459) byte local1459;
			@Pc(1476) short local1476;
			@Pc(1481) short local1481;
			@Pc(1486) short local1486;
			if (local1376 != -1) {
				if (local1078 == -1) {
					local1420 = 1;
					local920 = 0.0F;
					local922 = 1.0F;
					local1410 = 1.0F;
					local1412 = 1.0F;
					local1408 = 0.0F;
					local913 = 0.0F;
					local1422 = 2;
				} else {
					local1078 &= 0xFF;
					local1459 = arg1.aByteArray62[local1078];
					@Pc(1466) short local1466;
					@Pc(1471) short local1471;
					@Pc(1509) float local1509;
					@Pc(1517) float local1517;
					@Pc(1525) float local1525;
					@Pc(1608) float local1608;
					@Pc(1616) float local1616;
					@Pc(1624) float local1624;
					@Pc(1632) float local1632;
					@Pc(1640) float local1640;
					@Pc(1649) float local1649;
					if (local1459 == 0) {
						local1466 = arg1.aShortArray89[local1361];
						local1471 = arg1.aShortArray93[local1361];
						local1476 = arg1.aShortArray84[local1361];
						local1481 = arg1.aShortArray85[local1078];
						local1486 = arg1.aShortArray92[local1078];
						@Pc(1491) short local1491 = arg1.aShortArray91[local1078];
						@Pc(1497) float local1497 = (float) arg1.anIntArray407[local1481];
						@Pc(1503) float local1503 = (float) arg1.anIntArray409[local1481];
						local1509 = arg1.anIntArray405[local1481];
						local1517 = (float) arg1.anIntArray407[local1486] - local1497;
						local1525 = (float) arg1.anIntArray409[local1486] - local1503;
						@Pc(1533) float local1533 = (float) arg1.anIntArray405[local1486] - local1509;
						@Pc(1542) float local1542 = (float) arg1.anIntArray407[local1491] - local1497;
						@Pc(1550) float local1550 = (float) arg1.anIntArray409[local1491] - local1503;
						@Pc(1559) float local1559 = (float) arg1.anIntArray405[local1491] - local1509;
						@Pc(1567) float local1567 = (float) arg1.anIntArray407[local1466] - local1497;
						@Pc(1575) float local1575 = (float) arg1.anIntArray409[local1466] - local1503;
						@Pc(1583) float local1583 = (float) arg1.anIntArray405[local1466] - local1509;
						@Pc(1591) float local1591 = (float) arg1.anIntArray407[local1471] - local1497;
						@Pc(1599) float local1599 = (float) arg1.anIntArray409[local1471] - local1503;
						local1608 = (float) arg1.anIntArray405[local1471] - local1509;
						local1616 = (float) arg1.anIntArray407[local1476] - local1497;
						local1624 = (float) arg1.anIntArray409[local1476] - local1503;
						local1632 = (float) arg1.anIntArray405[local1476] - local1509;
						local1640 = local1559 * local1525 - local1533 * local1550;
						local1649 = local1533 * local1542 - local1559 * local1517;
						@Pc(1657) float local1657 = local1517 * local1550 - local1525 * local1542;
						@Pc(1665) float local1665 = local1550 * local1657 - local1559 * local1649;
						@Pc(1674) float local1674 = local1640 * local1559 - local1542 * local1657;
						@Pc(1683) float local1683 = local1542 * local1649 - local1550 * local1640;
						@Pc(1697) float local1697 = 1.0F / (local1665 * local1517 + local1674 * local1525 + local1683 * local1533);
						local1412 = local1697 * (local1591 * local1665 + local1674 * local1599 + local1608 * local1683);
						local913 = local1697 * (local1683 * local1632 + local1665 * local1616 + local1674 * local1624);
						local1408 = (local1683 * local1583 + local1575 * local1674 + local1665 * local1567) * local1697;
						@Pc(1748) float local1748 = local1517 * local1649 - local1525 * local1640;
						@Pc(1756) float local1756 = local1657 * local1525 - local1649 * local1533;
						@Pc(1765) float local1765 = local1640 * local1533 - local1657 * local1517;
						@Pc(1779) float local1779 = 1.0F / (local1748 * local1559 + local1550 * local1765 + local1756 * local1542);
						local920 = local1779 * (local1756 * local1616 + local1765 * local1624 + local1632 * local1748);
						local922 = (local1756 * local1591 + local1765 * local1599 + local1748 * local1608) * local1779;
						local1410 = (local1756 * local1567 + local1575 * local1765 + local1748 * local1583) * local1779;
					} else {
						local1466 = arg1.aShortArray89[local1361];
						local1471 = arg1.aShortArray93[local1361];
						local1476 = arg1.aShortArray84[local1361];
						@Pc(1842) int local1842 = local634[local1078];
						@Pc(1846) int local1846 = local636[local1078];
						@Pc(1850) int local1850 = local638[local1078];
						@Pc(1854) float[] local1854 = local640[local1078];
						@Pc(1859) byte local1859 = arg1.aByteArray63[local1078];
						local1509 = (float) arg1.anIntArray406[local1078] / 256.0F;
						if (local1459 == 1) {
							local1517 = (float) arg1.anIntArray412[local1078] / 1024.0F;
							Static329.method4513(local1850, arg1.anIntArray405[local1466], local1859, local1517, local1846, arg1.anIntArray407[local1466], local1842, local1854, arg1.anIntArray409[local1466], local1509);
							local1410 = Static419.aFloat163;
							local1408 = Static238.aFloat111;
							Static329.method4513(local1850, arg1.anIntArray405[local1471], local1859, local1517, local1846, arg1.anIntArray407[local1471], local1842, local1854, arg1.anIntArray409[local1471], local1509);
							local922 = Static419.aFloat163;
							local1412 = Static238.aFloat111;
							Static329.method4513(local1850, arg1.anIntArray405[local1476], local1859, local1517, local1846, arg1.anIntArray407[local1476], local1842, local1854, arg1.anIntArray409[local1476], local1509);
							local913 = Static238.aFloat111;
							local920 = Static419.aFloat163;
							local1525 = local1517 / 2.0F;
							if ((local1859 & 0x1) == 0) {
								if (local913 - local1408 > local1525) {
									local913 -= local1517;
									local1422 = 1;
								} else if (local1525 < local1408 - local913) {
									local913 += local1517;
									local1422 = 2;
								}
								if (local1525 < local1412 - local1408) {
									local1412 -= local1517;
									local1420 = 1;
								} else if (local1408 - local1412 > local1525) {
									local1412 += local1517;
									local1420 = 2;
								}
							} else {
								if (local920 - local1410 > local1525) {
									local920 -= local1517;
									local1422 = 1;
								} else if (local1525 < local1410 - local920) {
									local920 += local1517;
									local1422 = 2;
								}
								if (local922 - local1410 > local1525) {
									local922 -= local1517;
									local1420 = 1;
								} else if (local1525 < local1410 - local922) {
									local922 += local1517;
									local1420 = 2;
								}
							}
						} else if (local1459 == 2) {
							local1517 = (float) arg1.anIntArray403[local1078] / 256.0F;
							local1525 = (float) arg1.anIntArray411[local1078] / 256.0F;
							@Pc(2109) int local2109 = arg1.anIntArray407[local1471] - arg1.anIntArray407[local1466];
							@Pc(2120) int local2120 = arg1.anIntArray409[local1471] - arg1.anIntArray409[local1466];
							@Pc(2131) int local2131 = arg1.anIntArray405[local1471] - arg1.anIntArray405[local1466];
							@Pc(2142) int local2142 = arg1.anIntArray407[local1476] - arg1.anIntArray407[local1466];
							@Pc(2152) int local2152 = arg1.anIntArray409[local1476] - arg1.anIntArray409[local1466];
							@Pc(2163) int local2163 = arg1.anIntArray405[local1476] - arg1.anIntArray405[local1466];
							@Pc(2172) int local2172 = local2163 * local2120 - local2131 * local2152;
							@Pc(2181) int local2181 = local2142 * local2131 - local2163 * local2109;
							@Pc(2189) int local2189 = local2152 * local2109 - local2120 * local2142;
							local1608 = 64.0F / (float) arg1.anIntArray402[local1078];
							local1616 = 64.0F / (float) arg1.anIntArray404[local1078];
							local1624 = 64.0F / (float) arg1.anIntArray412[local1078];
							local1632 = (local1854[2] * (float) local2189 + local1854[0] * (float) local2172 + local1854[1] * (float) local2181) / local1608;
							local1640 = (local1854[5] * (float) local2189 + (float) local2181 * local1854[4] + (float) local2172 * local1854[3]) / local1616;
							local1649 = (local1854[6] * (float) local2172 + local1854[7] * (float) local2181 + (float) local2189 * local1854[8]) / local1624;
							local1424 = Static157.method2277(local1649, local1640, local1632);
							Static460.method7716(local1846, local1517, local1525, local1850, local1842, local1424, arg1.anIntArray407[local1466], local1859, local1509, arg1.anIntArray405[local1466], local1854, arg1.anIntArray409[local1466]);
							local1408 = Static341.aFloat61;
							local1410 = Static319.aFloat123;
							Static460.method7716(local1846, local1517, local1525, local1850, local1842, local1424, arg1.anIntArray407[local1471], local1859, local1509, arg1.anIntArray405[local1471], local1854, arg1.anIntArray409[local1471]);
							local922 = Static319.aFloat123;
							local1412 = Static341.aFloat61;
							Static460.method7716(local1846, local1517, local1525, local1850, local1842, local1424, arg1.anIntArray407[local1476], local1859, local1509, arg1.anIntArray405[local1476], local1854, arg1.anIntArray409[local1476]);
							local913 = Static341.aFloat61;
							local920 = Static319.aFloat123;
						} else if (local1459 == 3) {
							Static411.method5662(local1842, local1509, arg1.anIntArray407[local1466], local1859, arg1.anIntArray405[local1466], local1846, local1850, arg1.anIntArray409[local1466], local1854);
							local1410 = Static480.aFloat185;
							local1408 = Static522.aFloat205;
							Static411.method5662(local1842, local1509, arg1.anIntArray407[local1471], local1859, arg1.anIntArray405[local1471], local1846, local1850, arg1.anIntArray409[local1471], local1854);
							local922 = Static480.aFloat185;
							local1412 = Static522.aFloat205;
							Static411.method5662(local1842, local1509, arg1.anIntArray407[local1476], local1859, arg1.anIntArray405[local1476], local1846, local1850, arg1.anIntArray409[local1476], local1854);
							local920 = Static480.aFloat185;
							local913 = Static522.aFloat205;
							if ((local1859 & 0x1) == 0) {
								if (local1412 - local1408 > 0.5F) {
									local1420 = 1;
									local1412--;
								} else if (local1408 - local1412 > 0.5F) {
									local1412++;
									local1420 = 2;
								}
								if (local913 - local1408 > 0.5F) {
									local1422 = 1;
									local913--;
								} else if (local1408 - local913 > 0.5F) {
									local913++;
									local1422 = 2;
								}
							} else {
								if (local922 - local1410 > 0.5F) {
									local1420 = 1;
									local922--;
								} else if (local1410 - local922 > 0.5F) {
									local922++;
									local1420 = 2;
								}
								if (local920 - local1410 > 0.5F) {
									local920--;
									local1422 = 1;
								} else if (local1410 - local920 > 0.5F) {
									local1422 = 2;
									local920++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray57 == null) {
				local1459 = 0;
			} else {
				local1459 = arg1.aByteArray57[local1361];
			}
			if (local1459 == 0) {
				@Pc(2602) long local2602 = ((long) local666 + (long) (local1424 << 24) + (long) (local1368 << 8) << 32) + (long) (local1078 << 2);
				local1476 = arg1.aShortArray89[local1361];
				local1481 = arg1.aShortArray93[local1361];
				local1486 = arg1.aShortArray84[local1361];
				@Pc(2621) Class41 local2621 = local350[local1476];
				this.aShortArray41[local1355] = this.method1594(local2621.anInt845, local2621.anInt843, local1476, local2602, local2621.anInt844, arg1, local1410, local1408, local1355, local2621.anInt842);
				@Pc(2646) Class41 local2646 = local350[local1481];
				this.aShortArray38[local1355] = this.method1594(local2646.anInt845, local2646.anInt843, local1481, (long) local1420 + local2602, local2646.anInt844, arg1, local922, local1412, local1355, local2646.anInt842);
				@Pc(2674) Class41 local2674 = local350[local1486];
				this.aShortArray42[local1355] = this.method1594(local2674.anInt845, local2674.anInt843, local1486, local2602 + (long) local1422, local2674.anInt844, arg1, local920, local913, local1355, local2674.anInt842);
			} else if (local1459 == 1) {
				@Pc(2707) Class313 local2707 = local1038[local1361];
				@Pc(2753) long local2753 = ((long) (local1424 << 24) + (long) (local1368 << 8) + (long) local666 << 32) + (long) ((local2707.anInt8237 + 256 << 22) + (local2707.anInt8235 + 256 << 12) + ((local1078 << 2) - -(local2707.anInt8241 > 0 ? 1024 : 2048)));
				this.aShortArray41[local1355] = this.method1594(0, local2707.anInt8237, arg1.aShortArray89[local1361], local2753, local2707.anInt8241, arg1, local1410, local1408, local1355, local2707.anInt8235);
				this.aShortArray38[local1355] = this.method1594(0, local2707.anInt8237, arg1.aShortArray93[local1361], (long) local1420 + local2753, local2707.anInt8241, arg1, local922, local1412, local1355, local2707.anInt8235);
				this.aShortArray42[local1355] = this.method1594(0, local2707.anInt8237, arg1.aShortArray84[local1361], (long) local1422 + local2753, local2707.anInt8241, arg1, local920, local913, local1355, local2707.anInt8235);
			}
			if (arg1.aShortArray88 == null) {
				this.aShortArray37[local1355] = -1;
			} else {
				this.aShortArray37[local1355] = arg1.aShortArray88[local1361];
			}
			if (arg1.aByteArray61 != null) {
				this.aByteArray17[local1355] = arg1.aByteArray61[local1361];
			}
			if (arg1.aShortArray90 != null) {
				this.aShortArray32[local1355] = arg1.aShortArray90[local1361];
			}
			this.aShortArray36[local1355] = arg1.aShortArray87[local1361];
		}
		if (this.anInt1889 > 0) {
			local1361 = 1;
			local1057 = this.aShortArray37[0];
			for (local1067 = 0; local1067 < this.anInt1889; local1067++) {
				@Pc(2900) short local2900 = this.aShortArray37[local1067];
				if (local1057 != local2900) {
					local1361++;
					local1057 = local2900;
				}
			}
			this.anIntArray164 = new int[local1361];
			this.anIntArray166 = new int[local1361];
			this.anIntArray161 = new int[local1361 + 1];
			this.anIntArray161[0] = 0;
			local1078 = this.anInt1928;
			@Pc(2943) short local2943 = 0;
			local1361 = 0;
			local1057 = this.aShortArray37[0];
			for (local702 = 0; local702 < this.anInt1889; local702++) {
				@Pc(2959) short local2959 = this.aShortArray37[local702];
				if (local2959 != local1057) {
					this.anIntArray164[local1361] = local1078;
					this.anIntArray166[local1361] = local2943 + 1 - local1078;
					local1361++;
					this.anIntArray161[local1361] = local702;
					local2943 = 0;
					local1057 = local2959;
					local1078 = this.anInt1928;
				}
				@Pc(2999) short local2999 = this.aShortArray41[local702];
				if (local1078 > local2999) {
					local1078 = local2999;
				}
				if (local2999 > local2943) {
					local2943 = local2999;
				}
				local2999 = this.aShortArray38[local702];
				if (local1078 > local2999) {
					local1078 = local2999;
				}
				if (local2999 > local2943) {
					local2943 = local2999;
				}
				local2999 = this.aShortArray42[local702];
				if (local2999 > local2943) {
					local2943 = local2999;
				}
				if (local2999 < local1078) {
					local1078 = local2999;
				}
			}
			this.anIntArray164[local1361] = local1078;
			this.anIntArray166[local1361] = local2943 + 1 - local1078;
			local1361++;
			this.anIntArray161[local1361] = this.anInt1889;
		}
		Static219.aLongArray22 = null;
		this.aShortArray33 = Static159.method2291(this.anInt1928, this.aShortArray33);
		this.aShortArray44 = Static159.method2291(this.anInt1928, this.aShortArray44);
		this.aShortArray35 = Static159.method2291(this.anInt1928, this.aShortArray35);
		this.aShortArray39 = Static159.method2291(this.anInt1928, this.aShortArray39);
		this.aShortArray40 = Static159.method2291(this.anInt1928, this.aShortArray40);
		this.aByteArray16 = Static469.method6432(this.aByteArray16, this.anInt1928);
		this.aFloatArray3 = Static541.method7394(this.aFloatArray3, this.anInt1928);
		this.aFloatArray4 = Static541.method7394(this.aFloatArray4, this.anInt1928);
		if (arg1.anIntArray408 != null && Static503.method7040(arg2, this.anInt1919)) {
			this.anIntArrayArray45 = arg1.method4265(false);
		}
		if (arg1.aClass264Array1 != null && Static188.method2905(arg2, this.anInt1919)) {
			this.anIntArrayArray44 = arg1.method4266();
		}
		if (arg1.anIntArray410 != null && Static557.method7587(this.anInt1919, arg2)) {
			local1361 = 0;
			local658 = new int[256];
			for (local1067 = 0; local1067 < this.anInt1888; local1067++) {
				local1078 = arg1.anIntArray410[local15[local1067]];
				if (local1078 >= 0) {
					if (local1078 > local1361) {
						local1361 = local1078;
					}
					@Pc(3208) int local3208 = local658[local1078]++;
				}
			}
			this.anIntArrayArray46 = new int[local1361 + 1][];
			for (local1078 = 0; local1078 <= local1361; local1078++) {
				this.anIntArrayArray46[local1078] = new int[local658[local1078]];
				local658[local1078] = 0;
			}
			for (local666 = 0; local666 < this.anInt1888; local666++) {
				local702 = arg1.anIntArray410[local15[local666]];
				if (local702 >= 0) {
					this.anIntArrayArray46[local702][local658[local702]++] = local666;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!hea;IIZZ)V")
	public Class63_Sub1(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1888 = 0;
		this.anInt1889 = 0;
		this.lb = 0;
		this.aBoolean152 = true;
		this.aBoolean151 = false;
		this.anInt1928 = 0;
		this.anInt1930 = 0;
		this.aBoolean153 = false;
		this.aBoolean155 = false;
		this.anInt1919 = arg2;
		this.aClass134_Sub1_9 = arg0;
		this.anInt1913 = arg1;
		this.aBoolean155 = arg4;
		if (arg3 || Static116.method1841(this.anInt1919, this.anInt1913)) {
			this.aClass123_1 = new Class123(Static69.method1218(this.anInt1913, this.anInt1919));
		}
		if (arg3 || Static218.method3385(this.anInt1913, this.anInt1919)) {
			this.aClass123_2 = new Class123(Static376.method5046(this.anInt1919, this.anInt1913));
		}
		if (arg3 || Static17.method163(this.anInt1913, this.anInt1919)) {
			this.aClass123_4 = new Class123(Static113.method1787(this.anInt1919, this.anInt1913));
		}
		if (arg3 || Static275.method3875(this.anInt1919, this.anInt1913)) {
			this.aClass123_3 = new Class123(Static10.method103(this.anInt1919, this.anInt1913));
		}
		if (arg3 || Static565.method7759(this.anInt1919, this.anInt1913)) {
			this.aClass180_1 = new Class180(Static208.method3294(this.anInt1913, this.anInt1919));
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "()[Lclient!in;")
	@Override
	public Class158[] method7413() {
		return this.aClass158Array1;
	}

	@OriginalMember(owner = "client!dm", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean153) {
			this.method1586();
		}
		return this.anInt1918;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Z")
	private boolean method1577() {
		if (this.aClass180_1.aBoolean349) {
			return true;
		}
		if (this.aClass180_1.anInterface20_5 == null) {
			this.aClass180_1.anInterface20_5 = this.aClass134_Sub1_9.method6804(this.aBoolean155);
		}
		@Pc(28) Interface20 local28 = this.aClass180_1.anInterface20_5;
		local28.method7376(this.anInt1889 * 6);
		@Pc(47) Buffer local47 = local28.method7387();
		if (local47 != null) {
			@Pc(55) Stream local55 = this.aClass134_Sub1_9.method6846(local47);
			@Pc(59) int local59;
			if (Stream.c()) {
				for (local59 = 0; local59 < this.anInt1889; local59++) {
					local55.c(this.aShortArray41[local59]);
					local55.c(this.aShortArray38[local59]);
					local55.c(this.aShortArray42[local59]);
				}
			} else {
				for (local59 = 0; local59 < this.anInt1889; local59++) {
					local55.a(this.aShortArray41[local59]);
					local55.a(this.aShortArray38[local59]);
					local55.a(this.aShortArray42[local59]);
				}
			}
			local55.a();
			if (local28.method7389()) {
				this.aClass180_1.aBoolean349 = true;
				this.aBoolean152 = true;
				this.aClass180_1.anInterface20_6 = local28;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public void method1578() {
		if (this.aClass123_1 != null) {
			this.aClass123_1.method2415();
		}
		if (this.aClass123_2 != null) {
			this.aClass123_2.method2415();
		}
		if (this.aClass123_4 != null) {
			this.aClass123_4.method2415();
		}
		if (this.aClass123_3 != null) {
			this.aClass123_3.method2415();
		}
		if (this.aClass180_1 != null) {
			this.aClass180_1.method3755();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method1581(arg1, arg0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!dm", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub6_Sub2.anIntArray675[arg0];
		@Pc(13) int local13 = Class1_Sub6_Sub2.anIntArray676[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.lb; local15++) {
			@Pc(34) int local34 = this.anIntArray162[local15] * local9 + this.anIntArray160[local15] * local13 >> 14;
			this.anIntArray162[local15] = local13 * this.anIntArray162[local15] - local9 * this.anIntArray160[local15] >> 14;
			this.anIntArray160[local15] = local34;
		}
		this.method1593();
		this.aBoolean153 = false;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!q;Lclient!kd;II)V")
	@Override
	public void method7420(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class8_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1928 == 0) {
			return;
		}
		@Pc(16) Class113_Sub3 local16 = this.aClass134_Sub1_9.aClass113_Sub3_16;
		if (!this.aBoolean153) {
			this.method1586();
		}
		@Pc(25) Class113_Sub3 local25 = (Class113_Sub3) arg0;
		Static537.aFloat206 = local16.aFloat167 * local25.aFloat177 + local25.aFloat170 * local16.aFloat169 + local25.aFloat167 * local16.aFloat175;
		Static79.aFloat16 = local16.aFloat172 + local25.aFloat172 * local16.aFloat175 + local16.aFloat169 * local25.aFloat168 + local25.aFloat178 * local16.aFloat167;
		@Pc(72) float local72 = Static537.aFloat206 * (float) this.anInt1918 + Static79.aFloat16;
		@Pc(80) float local80 = (float) this.anInt1947 * Static537.aFloat206 + Static79.aFloat16;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local96 = (float) this.anInt1956 + local72;
			local90 = local80 - (float) this.anInt1956;
		} else {
			local90 = local72 - (float) this.anInt1956;
			local96 = local80 + (float) this.anInt1956;
		}
		if (this.aClass134_Sub1_9.aFloat197 <= local90 || (float) this.aClass134_Sub1_9.anInt8463 >= local96) {
			return;
		}
		Static473.aFloat184 = local16.aFloat168 + local16.aFloat171 * local25.aFloat172 + local25.aFloat178 * local16.aFloat170 + local25.aFloat168 * local16.aFloat173;
		Static89.aFloat20 = local25.aFloat177 * local16.aFloat170 + local25.aFloat170 * local16.aFloat173 + local16.aFloat171 * local25.aFloat167;
		@Pc(172) float local172 = Static473.aFloat184 + Static89.aFloat20 * (float) this.anInt1918;
		@Pc(180) float local180 = (float) this.anInt1947 * Static89.aFloat20 + Static473.aFloat184;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local180 < local172) {
			local206 = (float) this.aClass134_Sub1_9.anInt8427 * (local172 + (float) this.anInt1956);
			local195 = ((float) -this.anInt1956 + local180) * (float) this.aClass134_Sub1_9.anInt8427;
		} else {
			local195 = (float) this.aClass134_Sub1_9.anInt8427 * (local172 - (float) this.anInt1956);
			local206 = (float) this.aClass134_Sub1_9.anInt8427 * (local180 + (float) this.anInt1956);
		}
		if (this.aClass134_Sub1_9.aFloat188 <= local195 / (float) arg2 || local206 / (float) arg2 <= this.aClass134_Sub1_9.aFloat186) {
			return;
		}
		Static352.aFloat132 = local16.aFloat176 * local25.aFloat167 + local16.aFloat174 * local25.aFloat170 + local25.aFloat177 * local16.aFloat177;
		Static248.aFloat114 = local16.aFloat174 * local25.aFloat168 + local25.aFloat178 * local16.aFloat177 + local25.aFloat172 * local16.aFloat176 + local16.aFloat178;
		@Pc(298) float local298 = Static248.aFloat114 + (float) this.anInt1918 * Static352.aFloat132;
		@Pc(306) float local306 = Static248.aFloat114 + (float) this.anInt1947 * Static352.aFloat132;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local306 < local298) {
			local332 = ((float) this.anInt1956 + local298) * (float) this.aClass134_Sub1_9.anInt8465;
			local321 = (float) this.aClass134_Sub1_9.anInt8465 * ((float) -this.anInt1956 + local306);
		} else {
			local321 = (float) this.aClass134_Sub1_9.anInt8465 * (local298 - (float) this.anInt1956);
			local332 = (float) this.aClass134_Sub1_9.anInt8465 * (local306 + (float) this.anInt1956);
		}
		if (local321 / (float) arg2 >= this.aClass134_Sub1_9.aFloat193 || local332 / (float) arg2 <= this.aClass134_Sub1_9.aFloat194) {
			return;
		}
		if (arg1 != null || this.aClass232Array1 != null) {
			Static233.aFloat182 = local25.aFloat176 * local16.aFloat177 + local25.aFloat171 * local16.aFloat174 + local25.aFloat175 * local16.aFloat176;
			Static210.aFloat106 = local16.aFloat176 * local25.aFloat169 + local16.aFloat177 * local25.aFloat174 + local25.aFloat173 * local16.aFloat174;
			Static246.aFloat113 = local16.aFloat173 * local25.aFloat173 + local25.aFloat174 * local16.aFloat170 + local16.aFloat171 * local25.aFloat169;
			Static311.aFloat122 = local25.aFloat169 * local16.aFloat175 + local16.aFloat169 * local25.aFloat173 + local16.aFloat167 * local25.aFloat174;
			Static468.aFloat180 = local25.aFloat175 * local16.aFloat171 + local16.aFloat173 * local25.aFloat171 + local25.aFloat176 * local16.aFloat170;
			Static152.aFloat47 = local25.aFloat171 * local16.aFloat169 + local16.aFloat167 * local25.aFloat176 + local25.aFloat175 * local16.aFloat175;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.anInt1893 + this.anInt1884 >> 1;
			@Pc(508) int local508 = this.anInt1950 + this.anInt1891 >> 1;
			@Pc(527) int local527 = (int) ((float) local508 * Static468.aFloat180 + Static89.aFloat20 * (float) this.anInt1918 + Static473.aFloat184 + Static246.aFloat113 * (float) local500);
			@Pc(546) int local546 = (int) (Static233.aFloat182 * (float) local508 + Static210.aFloat106 * (float) local500 + Static248.aFloat114 + Static352.aFloat132 * (float) this.anInt1918);
			@Pc(565) int local565 = (int) ((float) this.anInt1918 * Static537.aFloat206 + Static79.aFloat16 + Static311.aFloat122 * (float) local500 + (float) local508 * Static152.aFloat47);
			@Pc(584) int local584 = (int) (Static246.aFloat113 * (float) local500 + Static473.aFloat184 + (float) this.anInt1947 * Static89.aFloat20 + (float) local508 * Static468.aFloat180);
			@Pc(603) int local603 = (int) (Static248.aFloat114 + Static210.aFloat106 * (float) local500 + (float) this.anInt1947 * Static352.aFloat132 + (float) local508 * Static233.aFloat182);
			arg1.anInt4679 = this.aClass134_Sub1_9.anInt8465 * local546 / arg2 + this.aClass134_Sub1_9.anInt8443;
			arg1.anInt4681 = local603 * this.aClass134_Sub1_9.anInt8465 / arg2 + this.aClass134_Sub1_9.anInt8443;
			arg1.anInt4682 = local584 * this.aClass134_Sub1_9.anInt8427 / arg2 + this.aClass134_Sub1_9.anInt8442;
			@Pc(661) int local661 = (int) (Static79.aFloat16 + Static311.aFloat122 * (float) local500 + Static537.aFloat206 * (float) this.anInt1947 + Static152.aFloat47 * (float) local508);
			arg1.anInt4680 = this.aClass134_Sub1_9.anInt8442 + this.aClass134_Sub1_9.anInt8427 * local527 / arg2;
			if (this.aClass134_Sub1_9.anInt8463 <= local565 || this.aClass134_Sub1_9.anInt8463 <= local661) {
				arg1.aBoolean353 = true;
				arg1.anInt4678 = (this.anInt1956 + local527) * this.aClass134_Sub1_9.anInt8427 / arg2 + this.aClass134_Sub1_9.anInt8442 - arg1.anInt4680;
			}
		}
		this.aClass134_Sub1_9.method6760((float) arg2);
		this.aClass134_Sub1_9.method6726();
		this.aClass134_Sub1_9.method6830(local25);
		this.method1584();
		this.method1590();
	}

	@OriginalMember(owner = "client!dm", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort34 = (short) arg0;
		this.method1593();
		this.method1587();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1888; local7++) {
			local16 = this.aShortArray36[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			@Pc(46) int local46 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 -= -(arg3 * (arg0 - local22) >> 7);
			}
			if (arg2 != -1) {
				local46 += (arg2 - local46) * arg3 >> 7;
			}
			this.aShortArray36[local7] = (short) (local46 | local22 << 10 | local28 << 7);
		}
		if (this.aClass232Array1 != null) {
			for (local16 = 0; local16 < this.anInt1886; local16++) {
				@Pc(110) Class232 local110 = this.aClass232Array1[local16];
				@Pc(115) Class311 local115 = this.aClass311Array1[local16];
				local115.anInt8163 = local115.anInt8163 & 0xFF000000 | Static379.anIntArray506[this.aShortArray36[local110.anInt5730] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method1588();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILclient!q;BZI)Z")
	private boolean method1581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class113_Sub3 local8 = (Class113_Sub3) arg2;
		@Pc(12) Class113_Sub3 local12 = this.aClass134_Sub1_9.aClass113_Sub3_16;
		@Pc(33) float local33 = local8.aFloat172 * local12.aFloat171 + local12.aFloat173 * local8.aFloat168 + local8.aFloat178 * local12.aFloat170 + local12.aFloat168;
		@Pc(54) float local54 = local12.aFloat178 + local8.aFloat172 * local12.aFloat176 + local8.aFloat178 * local12.aFloat177 + local12.aFloat174 * local8.aFloat168;
		Static246.aFloat113 = local8.aFloat174 * local12.aFloat170 + local8.aFloat173 * local12.aFloat173 + local8.aFloat169 * local12.aFloat171;
		Static233.aFloat182 = local8.aFloat176 * local12.aFloat177 + local12.aFloat174 * local8.aFloat171 + local12.aFloat176 * local8.aFloat175;
		Static468.aFloat180 = local12.aFloat170 * local8.aFloat176 + local12.aFloat173 * local8.aFloat171 + local12.aFloat171 * local8.aFloat175;
		Static89.aFloat20 = local12.aFloat171 * local8.aFloat167 + local12.aFloat170 * local8.aFloat177 + local12.aFloat173 * local8.aFloat170;
		Static152.aFloat47 = local12.aFloat175 * local8.aFloat175 + local12.aFloat169 * local8.aFloat171 + local8.aFloat176 * local12.aFloat167;
		Static210.aFloat106 = local8.aFloat169 * local12.aFloat176 + local8.aFloat173 * local12.aFloat174 + local8.aFloat174 * local12.aFloat177;
		Static352.aFloat132 = local8.aFloat167 * local12.aFloat176 + local12.aFloat177 * local8.aFloat177 + local12.aFloat174 * local8.aFloat170;
		Static537.aFloat206 = local8.aFloat170 * local12.aFloat169 + local8.aFloat177 * local12.aFloat167 + local12.aFloat175 * local8.aFloat167;
		Static311.aFloat122 = local8.aFloat173 * local12.aFloat169 + local8.aFloat174 * local12.aFloat167 + local8.aFloat169 * local12.aFloat175;
		@Pc(237) float local237 = local8.aFloat168 * local12.aFloat169 + local8.aFloat178 * local12.aFloat167 + local8.aFloat172 * local12.aFloat175 + local12.aFloat172;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass134_Sub1_9.anInt8427;
		@Pc(255) int local255 = this.aClass134_Sub1_9.anInt8465;
		if (!this.aBoolean153) {
			this.method1586();
		}
		Static39.anIntArray78[0] = this.anInt1893;
		Static288.anIntArray389[0] = this.anInt1918;
		Static39.anIntArray78[1] = this.anInt1884;
		Static244.anIntArray350[0] = this.anInt1891;
		Static288.anIntArray389[1] = this.anInt1918;
		Static244.anIntArray350[1] = this.anInt1891;
		Static39.anIntArray78[2] = this.anInt1893;
		Static288.anIntArray389[2] = this.anInt1947;
		Static39.anIntArray78[3] = this.anInt1884;
		Static244.anIntArray350[2] = this.anInt1891;
		Static288.anIntArray389[3] = this.anInt1947;
		Static39.anIntArray78[4] = this.anInt1893;
		Static244.anIntArray350[3] = this.anInt1891;
		Static288.anIntArray389[4] = this.anInt1918;
		Static39.anIntArray78[5] = this.anInt1884;
		Static244.anIntArray350[4] = this.anInt1950;
		Static288.anIntArray389[5] = this.anInt1918;
		Static244.anIntArray350[5] = this.anInt1950;
		Static39.anIntArray78[6] = this.anInt1893;
		Static288.anIntArray389[6] = this.anInt1947;
		Static39.anIntArray78[7] = this.anInt1884;
		Static244.anIntArray350[6] = this.anInt1950;
		Static288.anIntArray389[7] = this.anInt1947;
		Static244.anIntArray350[7] = this.anInt1950;
		@Pc(436) float local436;
		@Pc(422) float local422;
		@Pc(450) float local450;
		@Pc(398) float local398;
		@Pc(408) float local408;
		@Pc(403) float local403;
		for (@Pc(391) int local391 = 0; local391 < 8; local391++) {
			local398 = Static39.anIntArray78[local391];
			local403 = Static244.anIntArray350[local391];
			local408 = Static288.anIntArray389[local391];
			local422 = Static210.aFloat106 * local398 + local408 * Static352.aFloat132 + local403 * Static233.aFloat182 + local54;
			local436 = local33 + local403 * Static468.aFloat180 + Static89.aFloat20 * local408 + Static246.aFloat113 * local398;
			local450 = local403 * Static152.aFloat47 + Static537.aFloat206 * local408 + local398 * Static311.aFloat122 + local237;
			if ((float) this.aClass134_Sub1_9.anInt8463 <= local450) {
				if (arg4 > 0) {
					local450 = arg4;
				}
				@Pc(477) float local477 = local436 * (float) local251 / local450 + (float) this.aClass134_Sub1_9.anInt8442;
				if (local477 < local241) {
					local241 = local477;
				}
				@Pc(495) float local495 = (float) this.aClass134_Sub1_9.anInt8443 + (float) local255 * local422 / local450;
				if (local243 < local477) {
					local243 = local477;
				}
				if (local495 < local245) {
					local245 = local495;
				}
				if (local495 > local247) {
					local247 = local495;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg1 > local241 && (float) arg1 < local243 && local245 < (float) arg0 && (float) arg0 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt1928 > Static85.anIntArray156.length) {
				Static85.anIntArray156 = new int[this.anInt1928];
				Static297.anIntArray394 = new int[this.anInt1928];
			}
			@Pc(652) int local652;
			for (@Pc(562) int local562 = 0; local562 < this.lb; local562++) {
				local403 = this.anIntArray163[local562];
				local408 = this.anIntArray162[local562];
				local398 = this.anIntArray160[local562];
				local436 = local33 + local398 * Static246.aFloat113 + local408 * Static89.aFloat20 + local403 * Static468.aFloat180;
				local422 = local54 + Static210.aFloat106 * local398 + Static352.aFloat132 * local408 + Static233.aFloat182 * local403;
				local450 = local237 + local403 * Static152.aFloat47 + Static537.aFloat206 * local408 + local398 * Static311.aFloat122;
				@Pc(665) int local665;
				@Pc(670) int local670;
				@Pc(677) int local677;
				if (local450 >= (float) this.aClass134_Sub1_9.anInt8463) {
					if (arg4 > 0) {
						local450 = arg4;
					}
					local652 = (int) (local436 * (float) local251 / local450 + (float) this.aClass134_Sub1_9.anInt8442);
					local665 = (int) (local422 * (float) local255 / local450 + (float) this.aClass134_Sub1_9.anInt8443);
					local670 = this.anIntArray165[local562];
					local677 = this.anIntArray165[local562 + 1];
					for (@Pc(679) int local679 = local670; local679 < local677; local679++) {
						@Pc(688) int local688 = this.aShortArray43[local679] - 1;
						if (local688 == -1) {
							break;
						}
						Static85.anIntArray156[local688] = local652;
						Static297.anIntArray394[local688] = local665;
					}
				} else {
					local652 = this.anIntArray165[local562];
					local665 = this.anIntArray165[local562 + 1];
					for (local670 = local652; local670 < local665; local670++) {
						local677 = this.aShortArray43[local670] - 1;
						if (local677 == -1) {
							break;
						}
						Static85.anIntArray156[this.aShortArray43[local670] - 1] = -999999;
					}
				}
			}
			for (local652 = 0; local652 < this.anInt1888; local652++) {
				if (Static85.anIntArray156[this.aShortArray41[local652]] != -999999 && Static85.anIntArray156[this.aShortArray38[local652]] != -999999 && Static85.anIntArray156[this.aShortArray42[local652]] != -999999 && this.method1591(Static85.anIntArray156[this.aShortArray38[local652]], Static85.anIntArray156[this.aShortArray41[local652]], Static297.anIntArray394[this.aShortArray38[local652]], arg0, Static85.anIntArray156[this.aShortArray42[local652]], Static297.anIntArray394[this.aShortArray41[local652]], Static297.anIntArray394[this.aShortArray42[local652]], arg1)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dm", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.lb; local3++) {
			if (arg0 != 128) {
				this.anIntArray160[local3] = this.anIntArray160[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray162[local3] = arg1 * this.anIntArray162[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray163[local3] = this.anIntArray163[local3] * arg2 >> 7;
			}
		}
		this.method1593();
		this.aBoolean153 = false;
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1888; local3++) {
			if (this.aShortArray36[local3] == arg0) {
				this.aShortArray36[local3] = arg1;
			}
		}
		if (this.aClass232Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt1886; local38++) {
				@Pc(45) Class232 local45 = this.aClass232Array1[local38];
				@Pc(50) Class311 local50 = this.aClass311Array1[local38];
				local50.anInt8163 = Static379.anIntArray506[this.aShortArray36[local45.anInt5730] & 0xFFFF] & 0xFFFFFF | local50.anInt8163 & 0xFF000000;
			}
		}
		this.method1588();
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "()[Lclient!lea;")
	@Override
	public Class206[] method7421() {
		return this.aClass206Array1;
	}

	@OriginalMember(owner = "client!dm", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(3) int local3 = 0; local3 < this.lb; local3++) {
			this.anIntArray163[local3] = -this.anIntArray163[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1928; local25++) {
			this.aShortArray40[local25] = (short) -this.aShortArray40[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt1888; local44++) {
			@Pc(51) short local51 = this.aShortArray41[local44];
			this.aShortArray41[local44] = this.aShortArray42[local44];
			this.aShortArray42[local44] = local51;
		}
		this.method1593();
		this.method1587();
		this.method1583();
		this.aBoolean153 = false;
	}

	@OriginalMember(owner = "client!dm", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort35;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			local24 = 0;
			Static66.anInt1333 = 0;
			Static375.anInt6277 = 0;
			Static542.anInt9064 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray45.length) {
					local48 = this.anIntArrayArray45[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static66.anInt1333 += this.anIntArray160[local56];
						Static375.anInt6277 += this.anIntArray162[local56];
						local24++;
						Static542.anInt9064 += this.anIntArray163[local56];
					}
				}
			}
			if (local24 > 0) {
				Static66.anInt1333 = local14 + Static66.anInt1333 / local24;
				Static542.anInt9064 = local22 + Static542.anInt9064 / local24;
				Static375.anInt6277 = local18 + Static375.anInt6277 / local24;
			} else {
				Static542.anInt9064 = local22;
				Static66.anInt1333 = local14;
				Static375.anInt6277 = local18;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local22 = arg4 << 4;
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray45.length) {
					local159 = this.anIntArrayArray45[local32];
					for (local161 = 0; local161 < local159.length; local161++) {
						local50 = local159[local161];
						this.anIntArray160[local50] += local14;
						this.anIntArray162[local50] += local18;
						this.anIntArray163[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(275) int local275;
		@Pc(293) int local293;
		@Pc(748) int local748;
		@Pc(757) int local757;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray45.length > local32) {
					local159 = this.anIntArrayArray45[local32];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local50 = local159[local161];
							this.anIntArray160[local50] -= Static66.anInt1333;
							this.anIntArray162[local50] -= Static375.anInt6277;
							this.anIntArray163[local50] -= Static542.anInt9064;
							if (arg4 != 0) {
								local56 = Class1_Sub6_Sub2.anIntArray675[arg4];
								local275 = Class1_Sub6_Sub2.anIntArray676[arg4];
								local293 = local275 * this.anIntArray160[local50] + this.anIntArray162[local50] * local56 + 16383 >> 14;
								this.anIntArray162[local50] = local275 * this.anIntArray162[local50] + 16383 - this.anIntArray160[local50] * local56 >> 14;
								this.anIntArray160[local50] = local293;
							}
							if (arg2 != 0) {
								local56 = Class1_Sub6_Sub2.anIntArray675[arg2];
								local275 = Class1_Sub6_Sub2.anIntArray676[arg2];
								local293 = local275 * this.anIntArray162[local50] + 16383 - local56 * this.anIntArray163[local50] >> 14;
								this.anIntArray163[local50] = this.anIntArray162[local50] * local56 + local275 * this.anIntArray163[local50] + 16383 >> 14;
								this.anIntArray162[local50] = local293;
							}
							if (arg3 != 0) {
								local56 = Class1_Sub6_Sub2.anIntArray675[arg3];
								local275 = Class1_Sub6_Sub2.anIntArray676[arg3];
								local293 = local275 * this.anIntArray160[local50] + this.anIntArray163[local50] * local56 + 16383 >> 14;
								this.anIntArray163[local50] = this.anIntArray163[local50] * local275 + 16383 - local56 * this.anIntArray160[local50] >> 14;
								this.anIntArray160[local50] = local293;
							}
							this.anIntArray160[local50] += Static66.anInt1333;
							this.anIntArray162[local50] += Static375.anInt6277;
							this.anIntArray163[local50] += Static542.anInt9064;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local50 = local159[local161];
							this.anIntArray160[local50] -= Static66.anInt1333;
							this.anIntArray162[local50] -= Static375.anInt6277;
							this.anIntArray163[local50] -= Static542.anInt9064;
							if (arg2 != 0) {
								local56 = Class1_Sub6_Sub2.anIntArray675[arg2];
								local275 = Class1_Sub6_Sub2.anIntArray676[arg2];
								local293 = this.anIntArray162[local50] * local275 + 16383 - this.anIntArray163[local50] * local56 >> 14;
								this.anIntArray163[local50] = this.anIntArray163[local50] * local275 + this.anIntArray162[local50] * local56 + 16383 >> 14;
								this.anIntArray162[local50] = local293;
							}
							if (arg4 != 0) {
								local56 = Class1_Sub6_Sub2.anIntArray675[arg4];
								local275 = Class1_Sub6_Sub2.anIntArray676[arg4];
								local293 = local275 * this.anIntArray160[local50] + local56 * this.anIntArray162[local50] + 16383 >> 14;
								this.anIntArray162[local50] = this.anIntArray162[local50] * local275 + 16383 - local56 * this.anIntArray160[local50] >> 14;
								this.anIntArray160[local50] = local293;
							}
							if (arg3 != 0) {
								local56 = Class1_Sub6_Sub2.anIntArray675[arg3];
								local275 = Class1_Sub6_Sub2.anIntArray676[arg3];
								local293 = this.anIntArray163[local50] * local56 + this.anIntArray160[local50] * local275 + 16383 >> 14;
								this.anIntArray163[local50] = this.anIntArray163[local50] * local275 + 16383 - this.anIntArray160[local50] * local56 >> 14;
								this.anIntArray160[local50] = local293;
							}
							this.anIntArray160[local50] += Static66.anInt1333;
							this.anIntArray162[local50] += Static375.anInt6277;
							this.anIntArray163[local50] += Static542.anInt9064;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray45.length) {
						local48 = this.anIntArrayArray45[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local275 = this.anIntArray165[local56];
							local293 = this.anIntArray165[local56 + 1];
							for (local748 = local275; local748 < local293; local748++) {
								local757 = this.aShortArray43[local748] - 1;
								if (local757 == -1) {
									break;
								}
								@Pc(770) int local770;
								@Pc(774) int local774;
								@Pc(792) int local792;
								if (arg4 != 0) {
									local770 = Class1_Sub6_Sub2.anIntArray675[arg4];
									local774 = Class1_Sub6_Sub2.anIntArray676[arg4];
									local792 = local774 * this.aShortArray35[local757] + this.aShortArray39[local757] * local770 + 16383 >> 14;
									this.aShortArray39[local757] = (short) (local774 * this.aShortArray39[local757] + 16383 - this.aShortArray35[local757] * local770 >> 14);
									this.aShortArray35[local757] = (short) local792;
								}
								if (arg2 != 0) {
									local770 = Class1_Sub6_Sub2.anIntArray675[arg2];
									local774 = Class1_Sub6_Sub2.anIntArray676[arg2];
									local792 = local774 * this.aShortArray39[local757] + 16383 - this.aShortArray40[local757] * local770 >> 14;
									this.aShortArray40[local757] = (short) (this.aShortArray40[local757] * local774 + local770 * this.aShortArray39[local757] + 16383 >> 14);
									this.aShortArray39[local757] = (short) local792;
								}
								if (arg3 != 0) {
									local770 = Class1_Sub6_Sub2.anIntArray675[arg3];
									local774 = Class1_Sub6_Sub2.anIntArray676[arg3];
									local792 = local770 * this.aShortArray40[local757] + local774 * this.aShortArray35[local757] + 16383 >> 14;
									this.aShortArray40[local757] = (short) (local774 * this.aShortArray40[local757] + 16383 - local770 * this.aShortArray35[local757] >> 14);
									this.aShortArray35[local757] = (short) local792;
								}
							}
						}
					}
				}
				this.method1587();
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray45.length) {
					local159 = this.anIntArrayArray45[local32];
					for (local161 = 0; local161 < local159.length; local161++) {
						local50 = local159[local161];
						this.anIntArray160[local50] -= Static66.anInt1333;
						this.anIntArray162[local50] -= Static375.anInt6277;
						this.anIntArray163[local50] -= Static542.anInt9064;
						this.anIntArray160[local50] = this.anIntArray160[local50] * arg2 >> 7;
						this.anIntArray162[local50] = this.anIntArray162[local50] * arg3 >> 7;
						this.anIntArray163[local50] = this.anIntArray163[local50] * arg4 >> 7;
						this.anIntArray160[local50] += Static66.anInt1333;
						this.anIntArray162[local50] += Static375.anInt6277;
						this.anIntArray163[local50] += Static542.anInt9064;
					}
				}
			}
		} else {
			@Pc(1210) Class311 local1210;
			@Pc(1098) boolean local1098;
			@Pc(1205) Class232 local1205;
			if (arg0 == 5) {
				if (this.anIntArrayArray46 != null) {
					local1098 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray46.length > local38) {
							local48 = this.anIntArrayArray46[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local275 = (this.aByteArray17[local56] & 0xFF) + (arg2 * 8);
								if (local275 < 0) {
									local275 = 0;
								} else if (local275 > 255) {
									local275 = 255;
								}
								this.aByteArray17[local56] = (byte) local275;
							}
							local1098 |= local48.length > 0;
						}
					}
					if (local1098) {
						if (this.aClass232Array1 != null) {
							for (local38 = 0; local38 < this.anInt1886; local38++) {
								local1205 = this.aClass232Array1[local38];
								local1210 = this.aClass311Array1[local38];
								local1210.anInt8163 = local1210.anInt8163 & 0xFFFFFF | 255 - (this.aByteArray17[local1205.anInt5730] & 0xFF) << 24;
							}
						}
						this.method1588();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray46 != null) {
					local1098 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray46.length) {
							local48 = this.anIntArrayArray46[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local275 = this.aShortArray36[local56] & 0xFFFF;
								local293 = local275 >> 10 & 0x3F;
								local748 = local275 >> 7 & 0x7;
								@Pc(1303) int local1303 = local293 + arg2 & 0x3F;
								local748 += arg3 / 4;
								local757 = local275 & 0x7F;
								local757 += arg4;
								if (local748 < 0) {
									local748 = 0;
								} else if (local748 > 7) {
									local748 = 7;
								}
								if (local757 < 0) {
									local757 = 0;
								} else if (local757 > 127) {
									local757 = 127;
								}
								this.aShortArray36[local56] = (short) (local1303 << 10 | local748 << 7 | local757);
							}
							local1098 |= local48.length > 0;
						}
					}
					if (local1098) {
						if (this.aClass232Array1 != null) {
							for (local38 = 0; local38 < this.anInt1886; local38++) {
								local1205 = this.aClass232Array1[local38];
								local1210 = this.aClass311Array1[local38];
								local1210.anInt8163 = Static379.anIntArray506[this.aShortArray36[local1205.anInt5730] & 0xFFFF] & 0xFFFFFF | local1210.anInt8163 & 0xFF000000;
							}
						}
						this.method1588();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray44 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray44.length > local32) {
							local159 = this.anIntArrayArray44[local32];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1210 = this.aClass311Array1[local159[local161]];
								local1210.anInt8166 += arg3;
								local1210.anInt8164 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray44 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray44.length) {
							local159 = this.anIntArrayArray44[local32];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1210 = this.aClass311Array1[local159[local161]];
								local1210.anInt8168 = local1210.anInt8168 * arg3 >> 7;
								local1210.anInt8171 = local1210.anInt8171 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray44 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray44.length > local32) {
						local159 = this.anIntArrayArray44[local32];
						for (local161 = 0; local161 < local159.length; local161++) {
							local1210 = this.aClass311Array1[local159[local161]];
							local1210.anInt8165 = arg2 + local1210.anInt8165 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZZLclient!dm;IZLclient!dm;)Lclient!da;")
	private Class63 method1582(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class63_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class63_Sub1 arg4) {
		arg4.anInt1928 = this.anInt1928;
		arg4.anInt1919 = this.anInt1919;
		arg4.anInt1888 = this.anInt1888;
		arg4.aShort35 = this.aShort35;
		arg4.anInt1889 = this.anInt1889;
		arg4.anInt1913 = arg2;
		if ((arg2 & 0x100) == 0) {
			arg4.aBoolean151 = this.aBoolean151;
		} else {
			arg4.aBoolean151 = true;
		}
		arg4.lb = this.lb;
		arg4.aShort34 = this.aShort34;
		arg4.anInt1930 = this.anInt1930;
		arg4.anInt1886 = this.anInt1886;
		@Pc(66) boolean local66 = Static142.method2139(this.anInt1919, arg2);
		@Pc(72) boolean local72 = Static515.method7171(this.anInt1919, arg2);
		@Pc(84) boolean local84 = Static427.method5927(arg2, this.anInt1919);
		@Pc(90) boolean local90 = local66 | local72 | local84;
		@Pc(213) int local213;
		if (local90) {
			if (!local66) {
				arg4.anIntArray160 = this.anIntArray160;
			} else if (arg1.anIntArray160 == null || arg1.anIntArray160.length < this.anInt1930) {
				arg4.anIntArray160 = arg1.anIntArray160 = new int[this.anInt1930];
			} else {
				arg4.anIntArray160 = arg1.anIntArray160;
			}
			if (!local72) {
				arg4.anIntArray162 = this.anIntArray162;
			} else if (arg1.anIntArray162 == null || arg1.anIntArray162.length < this.anInt1930) {
				arg4.anIntArray162 = arg1.anIntArray162 = new int[this.anInt1930];
			} else {
				arg4.anIntArray162 = arg1.anIntArray162;
			}
			if (!local84) {
				arg4.anIntArray163 = this.anIntArray163;
			} else if (arg1.anIntArray163 == null || this.anInt1930 > arg1.anIntArray163.length) {
				arg4.anIntArray163 = arg1.anIntArray163 = new int[this.anInt1930];
			} else {
				arg4.anIntArray163 = arg1.anIntArray163;
			}
			for (local213 = 0; local213 < this.anInt1930; local213++) {
				if (local66) {
					arg4.anIntArray160[local213] = this.anIntArray160[local213];
				}
				if (local72) {
					arg4.anIntArray162[local213] = this.anIntArray162[local213];
				}
				if (local84) {
					arg4.anIntArray163[local213] = this.anIntArray163[local213];
				}
			}
		} else {
			arg4.anIntArray160 = this.anIntArray160;
			arg4.anIntArray162 = this.anIntArray162;
			arg4.anIntArray163 = this.anIntArray163;
		}
		if (Static69.method1218(arg2, this.anInt1919)) {
			arg4.aClass123_1 = arg1.aClass123_1;
			arg4.aClass123_1.anInterface4_3 = this.aClass123_1.anInterface4_3;
			arg4.aClass123_1.aBoolean228 = this.aClass123_1.aBoolean228;
			arg4.aClass123_1.aBoolean227 = true;
		} else if (Static116.method1841(this.anInt1919, arg2)) {
			arg4.aClass123_1 = this.aClass123_1;
		} else {
			arg4.aClass123_1 = null;
		}
		if (Static494.method6891(arg2, this.anInt1919)) {
			if (arg1.aShortArray36 == null || arg1.aShortArray36.length < this.anInt1888) {
				arg4.aShortArray36 = arg1.aShortArray36 = new short[this.anInt1888];
			} else {
				arg4.aShortArray36 = arg1.aShortArray36;
			}
			for (local213 = 0; local213 < this.anInt1888; local213++) {
				arg4.aShortArray36[local213] = this.aShortArray36[local213];
			}
		} else {
			arg4.aShortArray36 = this.aShortArray36;
		}
		if (Static344.method4702(arg2, this.anInt1919)) {
			if (arg1.aByteArray17 == null || this.anInt1888 > arg1.aByteArray17.length) {
				arg4.aByteArray17 = arg1.aByteArray17 = new byte[this.anInt1888];
			} else {
				arg4.aByteArray17 = arg1.aByteArray17;
			}
			for (local213 = 0; local213 < this.anInt1888; local213++) {
				arg4.aByteArray17[local213] = this.aByteArray17[local213];
			}
		} else {
			arg4.aByteArray17 = this.aByteArray17;
		}
		if (Static113.method1787(this.anInt1919, arg2)) {
			arg4.aClass123_4 = arg1.aClass123_4;
			arg4.aClass123_4.aBoolean228 = this.aClass123_4.aBoolean228;
			arg4.aClass123_4.aBoolean227 = true;
			arg4.aClass123_4.anInterface4_3 = this.aClass123_4.anInterface4_3;
		} else if (Static17.method163(arg2, this.anInt1919)) {
			arg4.aClass123_4 = this.aClass123_4;
		} else {
			arg4.aClass123_4 = null;
		}
		@Pc(564) int local564;
		if (Static50.method830(this.anInt1919, arg2)) {
			if (arg1.aShortArray35 == null || this.anInt1928 > arg1.aShortArray35.length) {
				local213 = this.anInt1928;
				arg4.aShortArray35 = arg1.aShortArray35 = new short[local213];
				arg4.aShortArray39 = arg1.aShortArray39 = new short[local213];
				arg4.aShortArray40 = arg1.aShortArray40 = new short[local213];
			} else {
				arg4.aShortArray35 = arg1.aShortArray35;
				arg4.aShortArray40 = arg1.aShortArray40;
				arg4.aShortArray39 = arg1.aShortArray39;
			}
			if (this.aClass202_1 == null) {
				arg4.aClass202_1 = null;
				for (local213 = 0; local213 < this.anInt1928; local213++) {
					arg4.aShortArray35[local213] = this.aShortArray35[local213];
					arg4.aShortArray39[local213] = this.aShortArray39[local213];
					arg4.aShortArray40[local213] = this.aShortArray40[local213];
				}
			} else {
				if (arg1.aClass202_1 == null) {
					arg1.aClass202_1 = new Class202();
				}
				@Pc(548) Class202 local548 = arg4.aClass202_1 = arg1.aClass202_1;
				if (local548.aShortArray83 == null || local548.aShortArray83.length < this.anInt1928) {
					local564 = this.anInt1928;
					local548.aShortArray81 = new short[local564];
					local548.aShortArray83 = new short[local564];
					local548.aShortArray82 = new short[local564];
					local548.aByteArray55 = new byte[local564];
				}
				for (local564 = 0; local564 < this.anInt1928; local564++) {
					arg4.aShortArray35[local564] = this.aShortArray35[local564];
					arg4.aShortArray39[local564] = this.aShortArray39[local564];
					arg4.aShortArray40[local564] = this.aShortArray40[local564];
					local548.aShortArray83[local564] = this.aClass202_1.aShortArray83[local564];
					local548.aShortArray82[local564] = this.aClass202_1.aShortArray82[local564];
					local548.aShortArray81[local564] = this.aClass202_1.aShortArray81[local564];
					local548.aByteArray55[local564] = this.aClass202_1.aByteArray55[local564];
				}
			}
			arg4.aByteArray16 = this.aByteArray16;
		} else {
			arg4.aShortArray40 = this.aShortArray40;
			arg4.aShortArray39 = this.aShortArray39;
			arg4.aByteArray16 = this.aByteArray16;
			arg4.aClass202_1 = this.aClass202_1;
			arg4.aShortArray35 = this.aShortArray35;
		}
		if (Static10.method103(this.anInt1919, arg2)) {
			arg4.aClass123_3 = arg1.aClass123_3;
			arg4.aClass123_3.aBoolean227 = true;
			arg4.aClass123_3.anInterface4_3 = this.aClass123_3.anInterface4_3;
			arg4.aClass123_3.aBoolean228 = this.aClass123_3.aBoolean228;
		} else if (Static275.method3875(this.anInt1919, arg2)) {
			arg4.aClass123_3 = this.aClass123_3;
		} else {
			arg4.aClass123_3 = null;
		}
		if (Static164.method7473(this.anInt1919, arg2)) {
			if (arg1.aFloatArray3 == null || arg1.aFloatArray3.length < this.anInt1888) {
				local213 = this.anInt1928;
				arg4.aFloatArray3 = arg1.aFloatArray3 = new float[local213];
				arg4.aFloatArray4 = arg1.aFloatArray4 = new float[local213];
			} else {
				arg4.aFloatArray4 = arg1.aFloatArray4;
				arg4.aFloatArray3 = arg1.aFloatArray3;
			}
			for (local213 = 0; local213 < this.anInt1928; local213++) {
				arg4.aFloatArray3[local213] = this.aFloatArray3[local213];
				arg4.aFloatArray4[local213] = this.aFloatArray4[local213];
			}
		} else {
			arg4.aFloatArray3 = this.aFloatArray3;
			arg4.aFloatArray4 = this.aFloatArray4;
		}
		if (Static376.method5046(this.anInt1919, arg2)) {
			arg4.aClass123_2 = arg1.aClass123_2;
			arg4.aClass123_2.anInterface4_3 = this.aClass123_2.anInterface4_3;
			arg4.aClass123_2.aBoolean228 = this.aClass123_2.aBoolean228;
			arg4.aClass123_2.aBoolean227 = true;
		} else if (Static218.method3385(arg2, this.anInt1919)) {
			arg4.aClass123_2 = this.aClass123_2;
		} else {
			arg4.aClass123_2 = null;
		}
		if (Static65.method1177(this.anInt1919, arg2)) {
			if (arg1.aShortArray41 == null || arg1.aShortArray41.length < this.anInt1888) {
				local213 = this.anInt1888;
				arg4.aShortArray38 = arg1.aShortArray38 = new short[local213];
				arg4.aShortArray41 = arg1.aShortArray41 = new short[local213];
				arg4.aShortArray42 = arg1.aShortArray42 = new short[local213];
			} else {
				arg4.aShortArray42 = arg1.aShortArray42;
				arg4.aShortArray38 = arg1.aShortArray38;
				arg4.aShortArray41 = arg1.aShortArray41;
			}
			for (local213 = 0; local213 < this.anInt1888; local213++) {
				arg4.aShortArray41[local213] = this.aShortArray41[local213];
				arg4.aShortArray38[local213] = this.aShortArray38[local213];
				arg4.aShortArray42[local213] = this.aShortArray42[local213];
			}
		} else {
			arg4.aShortArray38 = this.aShortArray38;
			arg4.aShortArray41 = this.aShortArray41;
			arg4.aShortArray42 = this.aShortArray42;
		}
		if (Static208.method3294(arg2, this.anInt1919)) {
			arg4.aClass180_1 = arg1.aClass180_1;
			arg4.aClass180_1.anInterface20_6 = this.aClass180_1.anInterface20_6;
			arg4.aClass180_1.aBoolean349 = this.aClass180_1.aBoolean349;
			arg4.aClass180_1.aBoolean348 = true;
		} else if (Static565.method7759(this.anInt1919, arg2)) {
			arg4.aClass180_1 = this.aClass180_1;
		} else {
			arg4.aClass180_1 = null;
		}
		if (Static375.method5039(arg2, this.anInt1919)) {
			if (arg1.aShortArray37 == null || arg1.aShortArray37.length < this.anInt1888) {
				local213 = this.anInt1888;
				arg4.aShortArray37 = arg1.aShortArray37 = new short[local213];
			} else {
				arg4.aShortArray37 = arg1.aShortArray37;
			}
			for (local213 = 0; local213 < this.anInt1888; local213++) {
				arg4.aShortArray37[local213] = this.aShortArray37[local213];
			}
		} else {
			arg4.aShortArray37 = this.aShortArray37;
		}
		if (!Static255.method3728(this.anInt1919, arg2)) {
			arg4.aClass311Array1 = this.aClass311Array1;
		} else if (arg1.aClass311Array1 == null || arg1.aClass311Array1.length < this.anInt1886) {
			local213 = this.anInt1886;
			arg4.aClass311Array1 = arg1.aClass311Array1 = new Class311[local213];
			for (local564 = 0; local564 < this.anInt1886; local564++) {
				arg4.aClass311Array1[local564] = this.aClass311Array1[local564].method6558();
			}
		} else {
			arg4.aClass311Array1 = arg1.aClass311Array1;
			for (local213 = 0; local213 < this.anInt1886; local213++) {
				arg4.aClass311Array1[local213].method6561(this.aClass311Array1[local213]);
			}
		}
		arg4.anIntArrayArray46 = this.anIntArrayArray46;
		arg4.anIntArray164 = this.anIntArray164;
		arg4.aShortArray44 = this.aShortArray44;
		arg4.aClass232Array1 = this.aClass232Array1;
		arg4.aShortArray32 = this.aShortArray32;
		arg4.anIntArray165 = this.anIntArray165;
		arg4.aShortArray43 = this.aShortArray43;
		arg4.anIntArray166 = this.anIntArray166;
		if (this.aBoolean153) {
			arg4.anInt1891 = this.anInt1891;
			arg4.aBoolean153 = true;
			arg4.anInt1947 = this.anInt1947;
			arg4.anInt1956 = this.anInt1956;
			arg4.anInt1893 = this.anInt1893;
			arg4.anInt1950 = this.anInt1950;
			arg4.anInt1884 = this.anInt1884;
			arg4.anInt1909 = this.anInt1909;
			arg4.anInt1918 = this.anInt1918;
		} else {
			arg4.aBoolean153 = false;
		}
		arg4.aShortArray34 = this.aShortArray34;
		arg4.anIntArray161 = this.anIntArray161;
		arg4.aClass206Array1 = this.aClass206Array1;
		arg4.anIntArrayArray45 = this.anIntArrayArray45;
		arg4.aShortArray33 = this.aShortArray33;
		arg4.aClass158Array1 = this.aClass158Array1;
		arg4.anIntArrayArray44 = this.anIntArrayArray44;
		return arg4;
	}

	@OriginalMember(owner = "client!dm", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray45 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt1930; local12++) {
			this.anIntArray160[local12] <<= 0x4;
			this.anIntArray162[local12] <<= 0x4;
			this.anIntArray163[local12] <<= 0x4;
		}
		Static375.anInt6277 = 0;
		Static66.anInt1333 = 0;
		Static542.anInt9064 = 0;
		return true;
	}

	@OriginalMember(owner = "client!dm", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean153) {
			this.method1586();
		}
		return this.anInt1956;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	private void method1583() {
		if (this.aClass180_1 != null) {
			this.aClass180_1.aBoolean349 = false;
		}
	}

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "()Z")
	@Override
	public boolean method7430() {
		if (this.aShortArray37 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray37.length; local12++) {
			if (this.aShortArray37[local12] != -1 && !this.aClass134_Sub1_9.anInterface7_10.method3871(this.aShortArray37[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dm", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort34;
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "()V")
	@Override
	protected void method7422() {
	}

	@OriginalMember(owner = "client!dm", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean153) {
			this.method1586();
		}
		return this.anInt1893;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!q;Lclient!kd;I)V")
	@Override
	public void method7429(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class8_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1928 == 0) {
			return;
		}
		@Pc(16) Class113_Sub3 local16 = this.aClass134_Sub1_9.aClass113_Sub3_16;
		@Pc(19) Class113_Sub3 local19 = (Class113_Sub3) arg0;
		if (!this.aBoolean153) {
			this.method1586();
		}
		Static79.aFloat16 = local19.aFloat172 * local16.aFloat175 + local16.aFloat169 * local19.aFloat168 + local19.aFloat178 * local16.aFloat167 + local16.aFloat172;
		Static537.aFloat206 = local19.aFloat167 * local16.aFloat175 + local19.aFloat170 * local16.aFloat169 + local19.aFloat177 * local16.aFloat167;
		@Pc(72) float local72 = (float) this.anInt1918 * Static537.aFloat206 + Static79.aFloat16;
		@Pc(80) float local80 = Static537.aFloat206 * (float) this.anInt1947 + Static79.aFloat16;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.anInt1956 + local72;
			local96 = local80 - (float) this.anInt1956;
		} else {
			local96 = (float) -this.anInt1956 + local72;
			local90 = local80 + (float) this.anInt1956;
		}
		if (this.aClass134_Sub1_9.aFloat200 <= local96 || (float) this.aClass134_Sub1_9.anInt8463 >= local90) {
			return;
		}
		Static89.aFloat20 = local16.aFloat171 * local19.aFloat167 + local16.aFloat173 * local19.aFloat170 + local19.aFloat177 * local16.aFloat170;
		Static473.aFloat184 = local16.aFloat171 * local19.aFloat172 + local16.aFloat170 * local19.aFloat178 + local16.aFloat173 * local19.aFloat168 + local16.aFloat168;
		@Pc(173) float local173 = Static89.aFloat20 * (float) this.anInt1918 + Static473.aFloat184;
		@Pc(181) float local181 = Static473.aFloat184 + Static89.aFloat20 * (float) this.anInt1947;
		@Pc(208) float local208;
		@Pc(196) float local196;
		if (local181 < local173) {
			local196 = (float) this.aClass134_Sub1_9.anInt8427 * (local173 + (float) this.anInt1956);
			local208 = ((float) -this.anInt1956 + local181) * (float) this.aClass134_Sub1_9.anInt8427;
		} else {
			local208 = ((float) -this.anInt1956 + local173) * (float) this.aClass134_Sub1_9.anInt8427;
			local196 = (local181 + (float) this.anInt1956) * (float) this.aClass134_Sub1_9.anInt8427;
		}
		if (local208 / local90 >= this.aClass134_Sub1_9.aFloat188 || this.aClass134_Sub1_9.aFloat186 >= local196 / local90) {
			return;
		}
		Static352.aFloat132 = local19.aFloat170 * local16.aFloat174 + local19.aFloat177 * local16.aFloat177 + local19.aFloat167 * local16.aFloat176;
		Static248.aFloat114 = local16.aFloat178 + local16.aFloat177 * local19.aFloat178 + local16.aFloat174 * local19.aFloat168 + local19.aFloat172 * local16.aFloat176;
		@Pc(298) float local298 = Static248.aFloat114 + Static352.aFloat132 * (float) this.anInt1918;
		@Pc(306) float local306 = Static352.aFloat132 * (float) this.anInt1947 + Static248.aFloat114;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local306 < local298) {
			local321 = (float) this.aClass134_Sub1_9.anInt8465 * (local306 - (float) this.anInt1956);
			local332 = ((float) this.anInt1956 + local298) * (float) this.aClass134_Sub1_9.anInt8465;
		} else {
			local321 = (local298 - (float) this.anInt1956) * (float) this.aClass134_Sub1_9.anInt8465;
			local332 = (local306 + (float) this.anInt1956) * (float) this.aClass134_Sub1_9.anInt8465;
		}
		if (local321 / local90 >= this.aClass134_Sub1_9.aFloat193 || this.aClass134_Sub1_9.aFloat194 >= local332 / local90) {
			return;
		}
		if (arg1 != null || this.aClass232Array1 != null) {
			Static152.aFloat47 = local16.aFloat167 * local19.aFloat176 + local19.aFloat171 * local16.aFloat169 + local19.aFloat175 * local16.aFloat175;
			Static311.aFloat122 = local19.aFloat174 * local16.aFloat167 + local19.aFloat173 * local16.aFloat169 + local16.aFloat175 * local19.aFloat169;
			Static233.aFloat182 = local19.aFloat175 * local16.aFloat176 + local19.aFloat171 * local16.aFloat174 + local16.aFloat177 * local19.aFloat176;
			Static210.aFloat106 = local19.aFloat169 * local16.aFloat176 + local19.aFloat173 * local16.aFloat174 + local19.aFloat174 * local16.aFloat177;
			Static246.aFloat113 = local19.aFloat174 * local16.aFloat170 + local16.aFloat173 * local19.aFloat173 + local19.aFloat169 * local16.aFloat171;
			Static468.aFloat180 = local19.aFloat171 * local16.aFloat173 + local19.aFloat176 * local16.aFloat170 + local16.aFloat171 * local19.aFloat175;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(502) int local502 = this.anInt1893 + this.anInt1884 >> 1;
			@Pc(510) int local510 = this.anInt1950 + this.anInt1891 >> 1;
			@Pc(529) int local529 = (int) ((float) local502 * Static246.aFloat113 + Static473.aFloat184 + Static89.aFloat20 * (float) this.anInt1918 + Static468.aFloat180 * (float) local510);
			@Pc(548) int local548 = (int) ((float) local502 * Static210.aFloat106 + Static248.aFloat114 + (float) this.anInt1918 * Static352.aFloat132 + Static233.aFloat182 * (float) local510);
			@Pc(567) int local567 = (int) (Static152.aFloat47 * (float) local510 + Static537.aFloat206 * (float) this.anInt1918 + (float) local502 * Static311.aFloat122 + Static79.aFloat16);
			if (local567 >= this.aClass134_Sub1_9.anInt8463) {
				arg1.anInt4680 = local529 * this.aClass134_Sub1_9.anInt8427 / local567 + this.aClass134_Sub1_9.anInt8442;
				arg1.anInt4679 = local548 * this.aClass134_Sub1_9.anInt8465 / local567 + this.aClass134_Sub1_9.anInt8443;
			} else {
				local491 = true;
			}
			@Pc(625) int local625 = (int) ((float) local502 * Static246.aFloat113 + Static473.aFloat184 + (float) this.anInt1947 * Static89.aFloat20 + (float) local510 * Static468.aFloat180);
			@Pc(644) int local644 = (int) ((float) this.anInt1947 * Static352.aFloat132 + Static248.aFloat114 + Static210.aFloat106 * (float) local502 + (float) local510 * Static233.aFloat182);
			@Pc(663) int local663 = (int) (Static79.aFloat16 + Static311.aFloat122 * (float) local502 + Static537.aFloat206 * (float) this.anInt1947 + (float) local510 * Static152.aFloat47);
			if (local663 < this.aClass134_Sub1_9.anInt8463) {
				local491 = true;
			} else {
				arg1.anInt4682 = this.aClass134_Sub1_9.anInt8442 + this.aClass134_Sub1_9.anInt8427 * local625 / local663;
				arg1.anInt4681 = this.aClass134_Sub1_9.anInt8443 + local644 * this.aClass134_Sub1_9.anInt8465 / local663;
			}
			if (local491) {
				if (local567 < this.aClass134_Sub1_9.anInt8463 && this.aClass134_Sub1_9.anInt8463 > local663) {
					local493 = false;
				} else {
					@Pc(737) int local737;
					@Pc(748) int local748;
					@Pc(760) int local760;
					if (this.aClass134_Sub1_9.anInt8463 > local567) {
						local737 = (local663 - this.aClass134_Sub1_9.anInt8463 << 16) / (local663 - local567);
						local748 = (local737 * (local625 - local529) >> 16) + local625;
						local760 = local644 + ((local644 - local548) * local737 >> 16);
						arg1.anInt4680 = local748 * this.aClass134_Sub1_9.anInt8427 / this.aClass134_Sub1_9.anInt8463 + this.aClass134_Sub1_9.anInt8442;
						arg1.anInt4679 = this.aClass134_Sub1_9.anInt8443 + local760 * this.aClass134_Sub1_9.anInt8465 / this.aClass134_Sub1_9.anInt8463;
					} else if (this.aClass134_Sub1_9.anInt8463 > local663) {
						local737 = (local567 - this.aClass134_Sub1_9.anInt8463 << 16) / (local567 - local663);
						local748 = ((local529 - local625) * local737 >> 16) + local529;
						local760 = local548 + (local737 * (local548 - local644) >> 16);
						arg1.anInt4680 = local748 * this.aClass134_Sub1_9.anInt8427 / this.aClass134_Sub1_9.anInt8463 + this.aClass134_Sub1_9.anInt8442;
						arg1.anInt4679 = this.aClass134_Sub1_9.anInt8443 + local760 * this.aClass134_Sub1_9.anInt8465 / this.aClass134_Sub1_9.anInt8463;
					}
				}
			}
			if (local493) {
				if (local567 > local663) {
					arg1.anInt4678 = this.aClass134_Sub1_9.anInt8442 + this.aClass134_Sub1_9.anInt8427 * (local529 + this.anInt1956) / local567 - arg1.anInt4680;
				} else {
					arg1.anInt4678 = this.aClass134_Sub1_9.anInt8442 + this.aClass134_Sub1_9.anInt8427 * (local625 - -this.anInt1956) / local663 - arg1.anInt4682;
				}
				arg1.aBoolean353 = true;
			}
		}
		this.aClass134_Sub1_9.method6775();
		this.aClass134_Sub1_9.method6830(local19);
		this.method1584();
		this.method1590();
	}

	@OriginalMember(owner = "client!dm", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1930; local7++) {
			this.anIntArray160[local7] = this.anIntArray160[local7] + 7 >> 4;
			this.anIntArray162[local7] = this.anIntArray162[local7] + 7 >> 4;
			this.anIntArray163[local7] = this.anIntArray163[local7] + 7 >> 4;
		}
		this.method1593();
		this.aBoolean153 = false;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
	private void method1584() {
		if (this.anInt1889 == 0) {
			return;
		}
		if (this.method1585() && this.method1577()) {
			this.aClass134_Sub1_9.method6829(0, this.aClass123_1.anInterface4_3);
			this.aClass134_Sub1_9.method6829(1, this.aClass123_4.anInterface4_3);
			this.aClass134_Sub1_9.method6829(2, this.aClass123_2.anInterface4_3);
			@Pc(61) boolean local61;
			if ((this.anInt1919 & 0x37) == 0) {
				this.aClass134_Sub1_9.method6735(false);
				local61 = false;
				this.aClass134_Sub1_9.method6743(this.aClass134_Sub1_9.aClass284_20);
			} else {
				this.aClass134_Sub1_9.method6735(true);
				local61 = true;
				this.aClass134_Sub1_9.method6829(3, this.aClass123_3.anInterface4_3);
				this.aClass134_Sub1_9.method6743(this.aClass134_Sub1_9.aClass284_17);
			}
			for (@Pc(96) int local96 = 0; local96 < this.anIntArray164.length; local96++) {
				@Pc(103) int local103 = this.anIntArray161[local96];
				@Pc(110) int local110 = this.anIntArray161[local96 + 1];
				@Pc(117) int local117 = this.aShortArray37[local103] & 0xFFFF;
				if (local117 == 65535) {
					local117 = -1;
				}
				this.aClass134_Sub1_9.method6857(local61, true, local117);
				this.aClass134_Sub1_9.method6765(Static470.aClass185_5, local110 - local103, this.anIntArray164[local96], this.aClass180_1.anInterface20_6, this.anIntArray166[local96], local103 * 3);
			}
		}
		this.method1589();
	}

	@OriginalMember(owner = "client!dm", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static542.anInt9064 = 0;
			Static375.anInt6277 = 0;
			Static66.anInt1333 = 0;
			for (local17 = 0; local17 < this.lb; local17++) {
				Static66.anInt1333 += this.anIntArray160[local17];
				Static375.anInt6277 += this.anIntArray162[local17];
				Static542.anInt9064 += this.anIntArray163[local17];
				local9++;
			}
			if (local9 <= 0) {
				Static66.anInt1333 = arg1;
				Static375.anInt6277 = arg2;
				Static542.anInt9064 = arg3;
			} else {
				Static66.anInt1333 = arg1 + Static66.anInt1333 / local9;
				Static375.anInt6277 = Static375.anInt6277 / local9 + arg2;
				Static542.anInt9064 = arg3 + Static542.anInt9064 / local9;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.lb; local9++) {
				this.anIntArray160[local9] += arg1;
				this.anIntArray162[local9] += arg2;
				this.anIntArray163[local9] += arg3;
			}
		} else {
			@Pc(170) int local170;
			@Pc(188) int local188;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.lb; local9++) {
					this.anIntArray160[local9] -= Static66.anInt1333;
					this.anIntArray162[local9] -= Static375.anInt6277;
					this.anIntArray163[local9] -= Static542.anInt9064;
					if (arg3 != 0) {
						local17 = Class1_Sub6_Sub2.anIntArray675[arg3];
						local170 = Class1_Sub6_Sub2.anIntArray676[arg3];
						local188 = local170 * this.anIntArray160[local9] + local17 * this.anIntArray162[local9] + 16383 >> 14;
						this.anIntArray162[local9] = local170 * this.anIntArray162[local9] + 16383 - this.anIntArray160[local9] * local17 >> 14;
						this.anIntArray160[local9] = local188;
					}
					if (arg1 != 0) {
						local17 = Class1_Sub6_Sub2.anIntArray675[arg1];
						local170 = Class1_Sub6_Sub2.anIntArray676[arg1];
						local188 = local170 * this.anIntArray162[local9] + 16383 - local17 * this.anIntArray163[local9] >> 14;
						this.anIntArray163[local9] = local170 * this.anIntArray163[local9] + this.anIntArray162[local9] * local17 + 16383 >> 14;
						this.anIntArray162[local9] = local188;
					}
					if (arg2 != 0) {
						local17 = Class1_Sub6_Sub2.anIntArray675[arg2];
						local170 = Class1_Sub6_Sub2.anIntArray676[arg2];
						local188 = local17 * this.anIntArray163[local9] + local170 * this.anIntArray160[local9] + 16383 >> 14;
						this.anIntArray163[local9] = local170 * this.anIntArray163[local9] + 16383 - this.anIntArray160[local9] * local17 >> 14;
						this.anIntArray160[local9] = local188;
					}
					this.anIntArray160[local9] += Static66.anInt1333;
					this.anIntArray162[local9] += Static375.anInt6277;
					this.anIntArray163[local9] += Static542.anInt9064;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.lb; local9++) {
					this.anIntArray160[local9] -= Static66.anInt1333;
					this.anIntArray162[local9] -= Static375.anInt6277;
					this.anIntArray163[local9] -= Static542.anInt9064;
					this.anIntArray160[local9] = this.anIntArray160[local9] * arg1 / 128;
					this.anIntArray162[local9] = arg2 * this.anIntArray162[local9] / 128;
					this.anIntArray163[local9] = arg3 * this.anIntArray163[local9] / 128;
					this.anIntArray160[local9] += Static66.anInt1333;
					this.anIntArray162[local9] += Static375.anInt6277;
					this.anIntArray163[local9] += Static542.anInt9064;
				}
			} else {
				@Pc(517) Class232 local517;
				@Pc(522) Class311 local522;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt1888; local9++) {
						local17 = (this.aByteArray17[local9] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray17[local9] = (byte) local17;
					}
					if (this.aClass232Array1 != null) {
						for (local17 = 0; local17 < this.anInt1886; local17++) {
							local517 = this.aClass232Array1[local17];
							local522 = this.aClass311Array1[local17];
							local522.anInt8163 = 255 - (this.aByteArray17[local517.anInt5730] & 0xFF) << 24 | local522.anInt8163 & 0xFFFFFF;
						}
					}
					this.method1588();
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt1888; local9++) {
						local17 = this.aShortArray36[local9] & 0xFFFF;
						local170 = local17 >> 10 & 0x3F;
						local188 = local17 >> 7 & 0x7;
						@Pc(580) int local580 = local17 & 0x7F;
						local188 += arg2 / 4;
						@Pc(592) int local592 = local170 + arg1 & 0x3F;
						if (local188 < 0) {
							local188 = 0;
						} else if (local188 > 7) {
							local188 = 7;
						}
						local580 += arg3;
						if (local580 < 0) {
							local580 = 0;
						} else if (local580 > 127) {
							local580 = 127;
						}
						this.aShortArray36[local9] = (short) (local188 << 7 | local592 << 10 | local580);
					}
					if (this.aClass232Array1 != null) {
						for (local17 = 0; local17 < this.anInt1886; local17++) {
							local517 = this.aClass232Array1[local17];
							local522 = this.aClass311Array1[local17];
							local522.anInt8163 = local522.anInt8163 & 0xFF000000 | Static379.anIntArray506[this.aShortArray36[local517.anInt5730] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method1588();
				} else {
					@Pc(706) Class311 local706;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt1886; local9++) {
							local706 = this.aClass311Array1[local9];
							local706.anInt8166 += arg2;
							local706.anInt8164 += arg1;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt1886; local9++) {
							local706 = this.aClass311Array1[local9];
							local706.anInt8171 = arg1 * local706.anInt8171 >> 7;
							local706.anInt8168 = arg2 * local706.anInt8168 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt1886; local9++) {
							local706 = this.aClass311Array1[local9];
							local706.anInt8165 = local706.anInt8165 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt1913;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)Z")
	private boolean method1585() {
		@Pc(13) boolean local13 = !this.aClass123_4.aBoolean228;
		@Pc(32) boolean local32 = (this.anInt1919 & 0x37) != 0 && !this.aClass123_3.aBoolean228;
		@Pc(40) boolean local40 = !this.aClass123_1.aBoolean228;
		@Pc(48) boolean local48 = !this.aClass123_2.aBoolean228;
		if (!local40 && !local13 && !local32 && !local48) {
			return true;
		}
		@Pc(60) boolean local60 = true;
		@Pc(79) Interface4 local79;
		@Pc(93) Buffer local93;
		if (local40) {
			if (this.aClass123_1.anInterface4_2 == null) {
				this.aClass123_1.anInterface4_2 = this.aClass134_Sub1_9.method6805(this.aBoolean155);
			}
			local79 = this.aClass123_1.anInterface4_2;
			local79.method2468(this.anInt1928 * 12, 12);
			local93 = local79.method2465();
			if (local93 == null) {
				local60 = false;
			} else {
				this.aClass134_Sub1_9.aNativeInterface3.copyPositions(this.anIntArray160, this.anIntArray162, this.anIntArray163, this.aShortArray33, 0, 12, this.anInt1928, local93.getAddress());
				if (local79.method2466()) {
					this.aClass123_1.aBoolean228 = true;
					this.aClass123_1.anInterface4_3 = local79;
				} else {
					local60 = false;
				}
			}
		}
		@Pc(195) short[] local195;
		@Pc(199) short[] local199;
		@Pc(187) short[] local187;
		@Pc(191) byte[] local191;
		if (local13) {
			if (this.aClass123_4.anInterface4_2 == null) {
				this.aClass123_4.anInterface4_2 = this.aClass134_Sub1_9.method6805(this.aBoolean155);
			}
			local79 = this.aClass123_4.anInterface4_2;
			local79.method2468(this.anInt1928 * 4, 4);
			local93 = local79.method2465();
			if (local93 == null) {
				local60 = false;
			} else {
				if ((this.anInt1919 & 0x37) == 0) {
					if (this.aClass202_1 == null) {
						local191 = this.aByteArray16;
						local199 = this.aShortArray39;
						local187 = this.aShortArray40;
						local195 = this.aShortArray35;
					} else {
						local187 = this.aClass202_1.aShortArray81;
						local191 = this.aClass202_1.aByteArray55;
						local195 = this.aClass202_1.aShortArray83;
						local199 = this.aClass202_1.aShortArray82;
					}
					this.aClass134_Sub1_9.aNativeInterface3.copyLighting(this.aShortArray36, this.aByteArray17, this.aShortArray37, local195, local199, local187, local191, this.aShort35, this.aShort34, this.aShortArray44, 0, 4, this.anInt1928, local93.getAddress());
				} else {
					this.aClass134_Sub1_9.aNativeInterface3.copyColours(this.aShortArray36, this.aByteArray17, this.aShortArray37, this.aShort35, this.aShortArray44, 0, 4, this.anInt1928, local93.getAddress());
				}
				if (local79.method2466()) {
					this.aClass123_4.aBoolean228 = true;
					this.aClass123_4.anInterface4_3 = local79;
				} else {
					local60 = false;
				}
			}
		}
		if (local32) {
			if (this.aClass123_3.anInterface4_2 == null) {
				this.aClass123_3.anInterface4_2 = this.aClass134_Sub1_9.method6805(this.aBoolean155);
			}
			local79 = this.aClass123_3.anInterface4_2;
			local79.method2468(this.anInt1928 * 12, 12);
			local93 = local79.method2465();
			if (local93 == null) {
				local60 = false;
			} else {
				if (this.aClass202_1 == null) {
					local191 = this.aByteArray16;
					local195 = this.aShortArray35;
					local187 = this.aShortArray40;
					local199 = this.aShortArray39;
				} else {
					local199 = this.aClass202_1.aShortArray82;
					local187 = this.aClass202_1.aShortArray81;
					local191 = this.aClass202_1.aByteArray55;
					local195 = this.aClass202_1.aShortArray83;
				}
				this.aClass134_Sub1_9.aNativeInterface3.copyNormals(local195, local199, local187, local191, 3.0F / (float) this.aShort34, 3.0F / (float) (this.aShort34 / 2 + this.aShort34), 0, 12, this.anInt1928, local93.getAddress());
				if (local79.method2466()) {
					this.aClass123_3.anInterface4_3 = local79;
					this.aClass123_3.aBoolean228 = true;
				} else {
					local60 = false;
				}
			}
		}
		if (local48) {
			if (this.aClass123_2.anInterface4_2 == null) {
				this.aClass123_2.anInterface4_2 = this.aClass134_Sub1_9.method6805(this.aBoolean155);
			}
			local79 = this.aClass123_2.anInterface4_2;
			local79.method2468(this.anInt1928 * 8, 8);
			local93 = local79.method2465();
			if (local93 == null) {
				local60 = false;
			} else {
				this.aClass134_Sub1_9.aNativeInterface3.copyTexCoords(this.aFloatArray3, this.aFloatArray4, 0, 8, this.anInt1928, local93.getAddress());
				if (local79.method2466()) {
					this.aClass123_2.aBoolean228 = true;
					this.aClass123_2.anInterface4_3 = local79;
				} else {
					local60 = false;
				}
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!dm", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class1_Sub6_Sub5 S(@OriginalArg(0) Class1_Sub6_Sub5 arg0) {
		if (this.anInt1928 == 0) {
			return null;
		}
		if (!this.aBoolean153) {
			this.method1586();
		}
		@Pc(42) int local42;
		@Pc(59) int local59;
		if (this.aClass134_Sub1_9.anInt8428 <= 0) {
			local42 = this.anInt1893 - (this.aClass134_Sub1_9.anInt8428 * this.anInt1918 >> 8) >> this.aClass134_Sub1_9.anInt8441;
			local59 = this.anInt1884 - (this.aClass134_Sub1_9.anInt8428 * this.anInt1947 >> 8) >> this.aClass134_Sub1_9.anInt8441;
		} else {
			local42 = this.anInt1893 - (this.aClass134_Sub1_9.anInt8428 * this.anInt1947 >> 8) >> this.aClass134_Sub1_9.anInt8441;
			local59 = this.anInt1884 - (this.aClass134_Sub1_9.anInt8428 * this.anInt1918 >> 8) >> this.aClass134_Sub1_9.anInt8441;
		}
		@Pc(119) int local119;
		@Pc(136) int local136;
		if (this.aClass134_Sub1_9.anInt8445 > 0) {
			local119 = this.anInt1891 - (this.aClass134_Sub1_9.anInt8445 * this.anInt1947 >> 8) >> this.aClass134_Sub1_9.anInt8441;
			local136 = this.anInt1950 - (this.anInt1918 * this.aClass134_Sub1_9.anInt8445 >> 8) >> this.aClass134_Sub1_9.anInt8441;
		} else {
			local119 = this.anInt1891 - (this.anInt1918 * this.aClass134_Sub1_9.anInt8445 >> 8) >> this.aClass134_Sub1_9.anInt8441;
			local136 = this.anInt1950 - (this.anInt1947 * this.aClass134_Sub1_9.anInt8445 >> 8) >> this.aClass134_Sub1_9.anInt8441;
		}
		@Pc(177) int local177 = local59 + 1 - local42;
		@Pc(184) int local184 = local136 + 1 - local119;
		@Pc(187) Class1_Sub6_Sub5_Sub2 local187 = (Class1_Sub6_Sub5_Sub2) arg0;
		@Pc(197) Class1_Sub6_Sub5_Sub2 local197;
		if (local187 != null && local187.method7298(local184, local177)) {
			local197 = local187;
			local187.method7299();
		} else {
			local197 = new Class1_Sub6_Sub5_Sub2(this.aClass134_Sub1_9, local177, local184);
		}
		local197.method7294(local119, local42, local59, local136);
		this.method1592(local197);
		return local197;
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
	private void method1586() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 0; local35 < this.lb; local35++) {
			@Pc(42) int local42 = this.anIntArray160[local35];
			@Pc(47) int local47 = this.anIntArray162[local35];
			if (local7 > local42) {
				local7 = local42;
			}
			if (local15 < local47) {
				local15 = local47;
			}
			if (local9 > local47) {
				local9 = local47;
			}
			if (local42 > local13) {
				local13 = local42;
			}
			@Pc(84) int local84 = this.anIntArray163[local35];
			if (local84 > local17) {
				local17 = local84;
			}
			if (local11 > local84) {
				local11 = local84;
			}
			@Pc(103) int local103 = local42 * local42 + local84 * local84;
			if (local103 > local19) {
				local19 = local103;
			}
			local103 = local47 * local47 + local84 * local84 + local42 * local42;
			if (local103 > local33) {
				local33 = local103;
			}
		}
		this.anInt1947 = local15;
		this.anInt1893 = local7;
		this.anInt1950 = local17;
		this.anInt1891 = local11;
		this.anInt1918 = local9;
		this.anInt1884 = local13;
		this.anInt1956 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt1909 = (int) (Math.sqrt((double) local33) + 0.99D);
		this.aBoolean153 = true;
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V")
	private void method1587() {
		if ((this.anInt1919 & 0x37) == 0) {
			if (this.aClass123_4 != null) {
				this.aClass123_4.aBoolean228 = false;
			}
		} else if (this.aClass123_3 != null) {
			this.aClass123_3.aBoolean228 = false;
		}
	}

	@OriginalMember(owner = "client!dm", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub6_Sub2.anIntArray675[arg0];
		@Pc(13) int local13 = Class1_Sub6_Sub2.anIntArray676[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.lb; local15++) {
			@Pc(33) int local33 = this.anIntArray162[local15] * local13 - local9 * this.anIntArray163[local15] >> 14;
			this.anIntArray163[local15] = this.anIntArray162[local15] * local9 + local13 * this.anIntArray163[local15] >> 14;
			this.anIntArray162[local15] = local33;
		}
		this.method1593();
		this.aBoolean153 = false;
	}

	@OriginalMember(owner = "client!dm", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) Class47 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean153) {
			this.method1586();
		}
		@Pc(16) int local16 = arg4 + this.anInt1893;
		@Pc(21) int local21 = this.anInt1884 + arg4;
		@Pc(26) int local26 = this.anInt1891 + arg6;
		@Pc(32) int local32 = arg6 + this.anInt1950;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9209 <= local21 + arg2.anInt9208 >> arg2.anInt9205 || local26 < 0 || arg2.anInt9210 <= local32 + arg2.anInt9208 >> arg2.anInt9205)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9209 <= local21 + arg3.anInt9208 >> arg3.anInt9205 || local26 < 0 || arg3.anInt9210 <= arg3.anInt9208 + local32 >> arg3.anInt9205) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9205;
			local21 = arg2.anInt9208 + local21 - 1 >> arg2.anInt9205;
			local26 >>= arg2.anInt9205;
			local32 = local32 + arg2.anInt9208 - 1 >> arg2.anInt9205;
			if (arg5 == arg2.method7545(local16, local26) && arg5 == arg2.method7545(local21, local26) && arg5 == arg2.method7545(local16, local32) && arg5 == arg2.method7545(local21, local32)) {
				return;
			}
		}
		@Pc(202) int local202;
		if (arg0 == 1) {
			for (local202 = 0; local202 < this.lb; local202++) {
				this.anIntArray162[local202] = this.anIntArray162[local202] + arg2.method7550(arg4 + this.anIntArray160[local202], this.anIntArray163[local202] + arg6) - arg5;
			}
		} else {
			@Pc(253) int local253;
			@Pc(264) int local264;
			if (arg0 == 2) {
				local202 = this.anInt1918;
				if (local202 == 0) {
					return;
				}
				for (local253 = 0; local253 < this.lb; local253++) {
					local264 = (this.anIntArray162[local253] << 16) / local202;
					if (local264 < arg1) {
						this.anIntArray162[local253] += (arg2.method7550(this.anIntArray160[local253] + arg4, arg6 + this.anIntArray163[local253]) - arg5) * (-local264 + arg1) / arg1;
					}
				}
			} else {
				@Pc(351) int local351;
				if (arg0 == 3) {
					local202 = (arg1 & 0xFF) * 4;
					local253 = (arg1 >> 8 & 0xFF) * 4;
					local264 = (arg1 >> 16 & 0xFF) << 6;
					local351 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local202 >> 1) < 0 || arg4 + (local202 >> 1) + arg2.anInt9208 >= arg2.anInt9209 << arg2.anInt9205 || arg6 - (local253 >> 1) < 0 || arg2.anInt9210 << arg2.anInt9205 <= (local253 >> 1) + arg6 + arg2.anInt9208) {
						return;
					}
					this.method7427(local202, local253, local264, arg4, arg5, arg2, local351, arg6);
				} else if (arg0 == 4) {
					local202 = this.anInt1947 - this.anInt1918;
					for (local253 = 0; local253 < this.lb; local253++) {
						this.anIntArray162[local253] = local202 + this.anIntArray162[local253] + arg3.method7550(this.anIntArray160[local253] + arg4, arg6 + this.anIntArray163[local253]) - arg5;
					}
				} else if (arg0 == 5) {
					local202 = this.anInt1947 - this.anInt1918;
					for (local253 = 0; local253 < this.lb; local253++) {
						local264 = arg4 + this.anIntArray160[local253];
						local351 = arg6 + this.anIntArray163[local253];
						@Pc(357) int local357 = arg2.method7550(local264, local351);
						@Pc(363) int local363 = arg3.method7550(local264, local351);
						@Pc(371) int local371 = local357 - local363 - arg1;
						this.anIntArray162[local253] = local357 + (local371 * ((this.anIntArray162[local253] << 8) / local202) >> 8) - arg5;
					}
				}
			}
		}
		this.method1593();
		this.aBoolean153 = false;
	}

	@OriginalMember(owner = "client!dm", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean153) {
			this.method1586();
		}
		return this.anInt1950;
	}

	@OriginalMember(owner = "client!dm", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean153) {
			this.method1586();
		}
		return this.anInt1909;
	}

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
	private void method1588() {
		if (this.aClass123_4 != null) {
			this.aClass123_4.aBoolean228 = false;
		}
	}

	@OriginalMember(owner = "client!dm", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass134_Sub1_9.anInterface7_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt1888; local11++) {
			if (arg0 == this.aShortArray37[local11]) {
				this.aShortArray37[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class3 local44 = local9.method3874(arg0 & 0xFFFF);
			local31 = local44.aByte2;
			local33 = local44.aByte5;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(65) Class3 local65 = local9.method3874(arg1 & 0xFFFF);
			local52 = local65.aByte2;
			local54 = local65.aByte5;
		}
		if (!(local33 != local54 | local52 != local31)) {
			return;
		}
		if (this.aClass232Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt1886; local94++) {
				@Pc(101) Class232 local101 = this.aClass232Array1[local94];
				@Pc(106) Class311 local106 = this.aClass311Array1[local94];
				local106.anInt8163 = Static379.anIntArray506[this.aShortArray36[local101.anInt5730] & 0xFFFF] & 0xFFFFFF | local106.anInt8163 & 0xFF000000;
			}
		}
		this.method1588();
	}

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V")
	private void method1589() {
		if (!this.aBoolean152) {
			return;
		}
		this.aBoolean152 = false;
		if (this.aClass206Array1 == null && this.aClass158Array1 == null && this.aClass232Array1 == null) {
			if (this.anIntArray160 != null && !Static557.method7585(this.anInt1919, this.anInt1913)) {
				if (this.aClass123_1 == null || this.aClass123_1.method2414()) {
					if (!this.aBoolean153) {
						this.method1586();
					}
					this.anIntArray160 = null;
				} else {
					this.aBoolean152 = true;
				}
			}
			if (this.anIntArray162 != null && !Static274.method269(this.anInt1919, this.anInt1913)) {
				if (this.aClass123_1 == null || this.aClass123_1.method2414()) {
					if (!this.aBoolean153) {
						this.method1586();
					}
					this.anIntArray162 = null;
				} else {
					this.aBoolean152 = true;
				}
			}
			if (this.anIntArray163 != null && !Static104.method1718(this.anInt1919, this.anInt1913)) {
				if (this.aClass123_1 == null || this.aClass123_1.method2414()) {
					if (!this.aBoolean153) {
						this.method1586();
					}
					this.anIntArray163 = null;
				} else {
					this.aBoolean152 = true;
				}
			}
		}
		if (this.aShortArray43 != null && this.anIntArray160 == null && this.anIntArray162 == null && this.anIntArray163 == null) {
			this.anIntArray165 = null;
			this.aShortArray43 = null;
		}
		if (this.aByteArray16 != null && !Static554.method7554(this.anInt1913, this.anInt1919)) {
			label195: {
				label194: {
					@Pc(166) boolean local166;
					if ((this.anInt1919 & 0x37) == 0) {
						if (this.aClass123_4 == null || this.aClass123_4.method2414()) {
							break label194;
						}
						local166 = false;
					} else {
						if (this.aClass123_3 == null || this.aClass123_3.method2414()) {
							break label194;
						}
						local166 = false;
					}
					if (!local166) {
						this.aBoolean152 = true;
						break label195;
					}
				}
				this.aByteArray16 = null;
				this.aShortArray35 = this.aShortArray39 = this.aShortArray40 = null;
			}
		}
		if (this.aShortArray36 != null && !Static50.method828(this.anInt1913, this.anInt1919)) {
			if (this.aClass123_4 == null || this.aClass123_4.method2414()) {
				this.aShortArray36 = null;
			} else {
				this.aBoolean152 = true;
			}
		}
		if (this.aByteArray17 != null && !Static183.method2579(this.anInt1919, this.anInt1913)) {
			if (this.aClass123_4 == null || this.aClass123_4.method2414()) {
				this.aByteArray17 = null;
			} else {
				this.aBoolean152 = true;
			}
		}
		if (this.aFloatArray3 != null && !Static319.method4405(this.anInt1913, this.anInt1919)) {
			if (this.aClass123_2 == null || this.aClass123_2.method2414()) {
				this.aFloatArray3 = this.aFloatArray4 = null;
			} else {
				this.aBoolean152 = true;
			}
		}
		if (this.aShortArray37 != null && !Static523.method7244(this.anInt1913, this.anInt1919)) {
			if (this.aClass123_4 == null || this.aClass123_4.method2414()) {
				this.aShortArray37 = null;
			} else {
				this.aBoolean152 = true;
			}
		}
		if (this.aShortArray41 != null && !Static268.method6365(this.anInt1913, this.anInt1919)) {
			if ((this.aClass180_1 == null || this.aClass180_1.method3754()) && (this.aClass123_4 == null || this.aClass123_4.method2414())) {
				this.aShortArray41 = this.aShortArray38 = this.aShortArray42 = null;
			} else {
				this.aBoolean152 = true;
			}
		}
		if (this.aShortArray33 != null) {
			if (this.aClass123_1 == null || this.aClass123_1.method2414()) {
				this.aShortArray33 = null;
			} else {
				this.aBoolean152 = true;
			}
		}
		if (this.aShortArray44 != null) {
			if (this.aClass123_4 == null || this.aClass123_4.method2414()) {
				this.aShortArray44 = null;
			} else {
				this.aBoolean152 = true;
			}
		}
		if (this.anIntArrayArray46 != null && !Static557.method7587(this.anInt1919, this.anInt1913)) {
			this.aShortArray32 = null;
			this.anIntArrayArray46 = null;
		}
		if (this.anIntArrayArray45 != null && !Static503.method7040(this.anInt1913, this.anInt1919)) {
			this.aShortArray34 = null;
			this.anIntArrayArray45 = null;
		}
		if (this.anIntArrayArray44 != null && !Static188.method2905(this.anInt1913, this.anInt1919)) {
			this.anIntArrayArray44 = null;
		}
		if (this.anIntArray161 != null && (this.anInt1913 & 0x800) == 0 && (this.anInt1913 & 0x40000) == 0) {
			this.anIntArray161 = null;
			this.anIntArray166 = null;
			this.anIntArray164 = null;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3) {
		return this.method1581(arg1, arg0, arg2, arg3, -1);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "()V")
	@Override
	public void method7411() {
		if (this.anInt1928 > 0 && this.anInt1889 > 0) {
			this.method1585();
			this.method1577();
			this.method1589();
		}
	}

	@OriginalMember(owner = "client!dm", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean153) {
			this.method1586();
		}
		return this.anInt1891;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class63 method7417(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class63_Sub1 local16;
		@Pc(12) Class63_Sub1 local12;
		if (arg0 == 1) {
			local12 = this.aClass134_Sub1_9.aClass63_Sub1_27;
			local16 = this.aClass134_Sub1_9.aClass63_Sub1_25;
		} else if (arg0 == 2) {
			local16 = this.aClass134_Sub1_9.aClass63_Sub1_24;
			local12 = this.aClass134_Sub1_9.aClass63_Sub1_22;
		} else if (arg0 == 3) {
			local16 = this.aClass134_Sub1_9.aClass63_Sub1_21;
			local12 = this.aClass134_Sub1_9.aClass63_Sub1_26;
		} else if (arg0 == 4) {
			local12 = this.aClass134_Sub1_9.aClass63_Sub1_28;
			local16 = this.aClass134_Sub1_9.aClass63_Sub1_29;
		} else if (arg0 == 5) {
			local12 = this.aClass134_Sub1_9.aClass63_Sub1_30;
			local16 = this.aClass134_Sub1_9.aClass63_Sub1_23;
		} else {
			local16 = local12 = new Class63_Sub1(this.aClass134_Sub1_9, 0, 0, true, false);
		}
		return this.method1582(arg0 != 0, local12, arg1, arg2, local16);
	}

	@OriginalMember(owner = "client!dm", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort35 = (short) arg0;
		this.method1588();
	}

	@OriginalMember(owner = "client!dm", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean153) {
			this.method1586();
		}
		return this.anInt1947;
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "()V")
	@Override
	protected void method7428() {
	}

	@OriginalMember(owner = "client!dm", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		if (this.aClass123_1 != null) {
			this.aClass123_1.aBoolean227 = Static69.method1218(arg0, this.anInt1919);
		}
		if (this.aClass123_2 != null) {
			this.aClass123_2.aBoolean227 = Static376.method5046(this.anInt1919, arg0);
		}
		if (this.aClass123_4 != null) {
			this.aClass123_4.aBoolean227 = Static113.method1787(this.anInt1919, arg0);
		}
		if (this.aClass123_3 != null) {
			this.aClass123_3.aBoolean227 = Static10.method103(this.anInt1919, arg0);
		}
		this.anInt1913 = arg0;
		this.aBoolean152 = true;
		if (this.aClass202_1 != null && (this.anInt1913 & 0x10000) == 0) {
			this.aShortArray35 = this.aClass202_1.aShortArray83;
			this.aShortArray40 = this.aClass202_1.aShortArray81;
			this.aShortArray39 = this.aClass202_1.aShortArray82;
			this.aByteArray16 = this.aClass202_1.aByteArray55;
			this.aClass202_1 = null;
		}
		this.method1589();
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)V")
	private void method1590() {
		if (this.aClass232Array1 == null) {
			return;
		}
		this.aClass134_Sub1_9.ZA(false);
		this.aClass134_Sub1_9.method6735(false);
		this.aClass134_Sub1_9.method6742(1, Static308.aClass192_1);
		this.aClass134_Sub1_9.method6816(1, Static308.aClass192_1);
		for (@Pc(27) int local27 = 0; local27 < this.anInt1886; local27++) {
			@Pc(34) Class232 local34 = this.aClass232Array1[local27];
			@Pc(39) Class311 local39 = this.aClass311Array1[local27];
			if (!local34.aBoolean453 || !this.aClass134_Sub1_9.method6917()) {
				@Pc(68) float local68 = (float) (this.anIntArray160[local34.anInt5732] + this.anIntArray160[local34.anInt5729] + this.anIntArray160[local34.anInt5728]) * 0.3333333F;
				@Pc(89) float local89 = (float) (this.anIntArray162[local34.anInt5732] + this.anIntArray162[local34.anInt5729] + this.anIntArray162[local34.anInt5728]) * 0.3333333F;
				@Pc(112) float local112 = (float) (this.anIntArray163[local34.anInt5729] + this.anIntArray163[local34.anInt5732] + this.anIntArray163[local34.anInt5728]) * 0.3333333F;
				@Pc(126) float local126 = Static468.aFloat180 * local112 + Static246.aFloat113 * local68 + Static89.aFloat20 * local89 + Static473.aFloat184;
				@Pc(140) float local140 = Static210.aFloat106 * local68 + Static352.aFloat132 * local89 + Static233.aFloat182 * local112 + Static248.aFloat114;
				@Pc(154) float local154 = Static152.aFloat47 * local112 + Static311.aFloat122 * local68 + local89 * Static537.aFloat206 + Static79.aFloat16;
				@Pc(159) Class113_Sub3 local159 = this.aClass134_Sub1_9.method6764();
				local159.method6072((float) local39.anInt8166 + local140, local39.anInt8171 * local34.aShort78 >> 7, local154 - (float) local34.anInt5734, local39.anInt8165, local39.anInt8168 * local34.aShort77 >> 7, local126 + (float) local39.anInt8164);
				local159.method6074(this.aClass134_Sub1_9.aClass113_Sub3_17);
				this.aClass134_Sub1_9.method6773();
				@Pc(206) int local206 = local39.anInt8163;
				this.aClass134_Sub1_9.method6857(false, false, local34.aShort79);
				this.aClass134_Sub1_9.method6746(local34.aByte88);
				this.aClass134_Sub1_9.method6738(local206);
				this.aClass134_Sub1_9.method6727();
			}
		}
		this.aClass134_Sub1_9.method6816(1, Static493.aClass192_4);
		this.aClass134_Sub1_9.method6742(1, Static493.aClass192_4);
		this.aClass134_Sub1_9.ZA(true);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7409(@OriginalArg(0) Class113 arg0) {
		@Pc(8) Class113_Sub3 local8 = (Class113_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass206Array1 != null) {
			for (local13 = 0; local13 < this.aClass206Array1.length; local13++) {
				@Pc(20) Class206 local20 = this.aClass206Array1[local13];
				@Pc(22) Class206 local22 = local20;
				if (local20.aClass206_1 != null) {
					local22 = local20.aClass206_1;
				}
				local22.anInt5066 = (int) (local8.aFloat170 * (float) this.anIntArray162[local20.anInt5078] + local8.aFloat173 * (float) this.anIntArray160[local20.anInt5078] + (float) this.anIntArray163[local20.anInt5078] * local8.aFloat171 + local8.aFloat168);
				local22.anInt5081 = (int) ((float) this.anIntArray163[local20.anInt5078] * local8.aFloat176 + local8.aFloat174 * (float) this.anIntArray160[local20.anInt5078] + (float) this.anIntArray162[local20.anInt5078] * local8.aFloat177 + local8.aFloat178);
				local22.anInt5073 = (int) (local8.aFloat172 + (float) this.anIntArray163[local20.anInt5078] * local8.aFloat175 + (float) this.anIntArray160[local20.anInt5078] * local8.aFloat169 + local8.aFloat167 * (float) this.anIntArray162[local20.anInt5078]);
				local22.anInt5072 = (int) (local8.aFloat168 + local8.aFloat171 * (float) this.anIntArray163[local20.anInt5079] + (float) this.anIntArray162[local20.anInt5079] * local8.aFloat170 + local8.aFloat173 * (float) this.anIntArray160[local20.anInt5079]);
				local22.anInt5070 = (int) (local8.aFloat178 + local8.aFloat176 * (float) this.anIntArray163[local20.anInt5079] + (float) this.anIntArray162[local20.anInt5079] * local8.aFloat177 + (float) this.anIntArray160[local20.anInt5079] * local8.aFloat174);
				local22.anInt5071 = (int) (local8.aFloat172 + local8.aFloat175 * (float) this.anIntArray163[local20.anInt5079] + (float) this.anIntArray162[local20.anInt5079] * local8.aFloat167 + local8.aFloat169 * (float) this.anIntArray160[local20.anInt5079]);
				local22.anInt5083 = (int) (local8.aFloat173 * (float) this.anIntArray160[local20.anInt5080] + local8.aFloat170 * (float) this.anIntArray162[local20.anInt5080] + (float) this.anIntArray163[local20.anInt5080] * local8.aFloat171 + local8.aFloat168);
				local22.anInt5075 = (int) (local8.aFloat178 + (float) this.anIntArray160[local20.anInt5080] * local8.aFloat174 + (float) this.anIntArray162[local20.anInt5080] * local8.aFloat177 + (float) this.anIntArray163[local20.anInt5080] * local8.aFloat176);
				local22.anInt5082 = (int) (local8.aFloat175 * (float) this.anIntArray163[local20.anInt5080] + (float) this.anIntArray160[local20.anInt5080] * local8.aFloat169 + (float) this.anIntArray162[local20.anInt5080] * local8.aFloat167 + local8.aFloat172);
			}
		}
		if (this.aClass158Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass158Array1.length; local13++) {
			@Pc(361) Class158 local361 = this.aClass158Array1[local13];
			@Pc(363) Class158 local363 = local361;
			if (local361.aClass158_1 != null) {
				local363 = local361.aClass158_1;
			}
			if (local361.aClass113_1 == null) {
				local361.aClass113_1 = local8.method6103();
			} else {
				local361.aClass113_1.M(local8);
			}
			local363.anInt4244 = (int) ((float) this.anIntArray163[local361.anInt4248] * local8.aFloat171 + local8.aFloat170 * (float) this.anIntArray162[local361.anInt4248] + (float) this.anIntArray160[local361.anInt4248] * local8.aFloat173 + local8.aFloat168);
			local363.anInt4247 = (int) (local8.aFloat178 + local8.aFloat176 * (float) this.anIntArray163[local361.anInt4248] + (float) this.anIntArray160[local361.anInt4248] * local8.aFloat174 + local8.aFloat177 * (float) this.anIntArray162[local361.anInt4248]);
			local363.anInt4249 = (int) (local8.aFloat172 + local8.aFloat175 * (float) this.anIntArray163[local361.anInt4248] + local8.aFloat167 * (float) this.anIntArray162[local361.anInt4248] + local8.aFloat169 * (float) this.anIntArray160[local361.anInt4248]);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7423(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class63_Sub1 local8 = (Class63_Sub1) arg0;
		if (this.anInt1888 == 0 || local8.anInt1888 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.lb;
		@Pc(24) int[] local24 = local8.anIntArray160;
		@Pc(27) int[] local27 = local8.anIntArray162;
		@Pc(30) int[] local30 = local8.anIntArray163;
		@Pc(33) short[] local33 = local8.aShortArray35;
		@Pc(36) short[] local36 = local8.aShortArray39;
		@Pc(39) short[] local39 = local8.aShortArray40;
		@Pc(42) byte[] local42 = local8.aByteArray16;
		@Pc(53) short[] local53;
		@Pc(49) short[] local49;
		@Pc(61) short[] local61;
		@Pc(57) byte[] local57;
		if (this.aClass202_1 == null) {
			local49 = null;
			local53 = null;
			local57 = null;
			local61 = null;
		} else {
			local49 = this.aClass202_1.aShortArray82;
			local53 = this.aClass202_1.aShortArray83;
			local57 = this.aClass202_1.aByteArray55;
			local61 = this.aClass202_1.aShortArray81;
		}
		@Pc(82) short[] local82;
		@Pc(78) short[] local78;
		@Pc(86) short[] local86;
		@Pc(90) byte[] local90;
		if (local8.aClass202_1 == null) {
			local86 = null;
			local90 = null;
			local78 = null;
			local82 = null;
		} else {
			local78 = local8.aClass202_1.aShortArray82;
			local82 = local8.aClass202_1.aShortArray83;
			local86 = local8.aClass202_1.aShortArray81;
			local90 = local8.aClass202_1.aByteArray55;
		}
		@Pc(103) int[] local103 = local8.anIntArray165;
		@Pc(106) short[] local106 = local8.aShortArray43;
		if (!local8.aBoolean153) {
			local8.method1586();
		}
		@Pc(115) int local115 = local8.anInt1918;
		@Pc(118) int local118 = local8.anInt1947;
		@Pc(121) int local121 = local8.anInt1893;
		@Pc(124) int local124 = local8.anInt1884;
		@Pc(127) int local127 = local8.anInt1891;
		@Pc(130) int local130 = local8.anInt1950;
		for (@Pc(132) int local132 = 0; local132 < this.lb; local132++) {
			@Pc(142) int local142 = this.anIntArray162[local132] - arg2;
			if (local142 >= local115 && local118 >= local142) {
				@Pc(162) int local162 = this.anIntArray160[local132] - arg1;
				if (local162 >= local121 && local162 <= local124) {
					@Pc(186) int local186 = this.anIntArray163[local132] - arg3;
					if (local127 <= local186 && local130 >= local186) {
						@Pc(196) int local196 = -1;
						@Pc(201) int local201 = this.anIntArray165[local132];
						@Pc(208) int local208 = this.anIntArray165[local132 + 1];
						for (@Pc(210) int local210 = local201; local210 < local208; local210++) {
							local196 = this.aShortArray43[local210] - 1;
							if (local196 == -1 || this.aByteArray16[local196] != 0) {
								break;
							}
						}
						if (local196 != -1) {
							for (@Pc(244) int local244 = 0; local244 < local21; local244++) {
								if (local24[local244] == local162 && local30[local244] == local186 && local27[local244] == local142) {
									local201 = local103[local244];
									local208 = local103[local244 + 1];
									@Pc(277) int local277 = -1;
									for (@Pc(279) int local279 = local201; local279 < local208; local279++) {
										local277 = local106[local279] - 1;
										if (local277 == -1 || local42[local277] != 0) {
											break;
										}
									}
									if (local277 != -1) {
										if (local53 == null) {
											this.aClass202_1 = new Class202();
											local53 = this.aClass202_1.aShortArray83 = Static157.method2281(this.aShortArray35);
											local49 = this.aClass202_1.aShortArray82 = Static157.method2281(this.aShortArray39);
											local61 = this.aClass202_1.aShortArray81 = Static157.method2281(this.aShortArray40);
											local57 = this.aClass202_1.aByteArray55 = Static292.method4110(this.aByteArray16);
										}
										if (local82 == null) {
											@Pc(359) Class202 local359 = local8.aClass202_1 = new Class202();
											local82 = local359.aShortArray83 = Static157.method2281(local33);
											local78 = local359.aShortArray82 = Static157.method2281(local36);
											local86 = local359.aShortArray81 = Static157.method2281(local39);
											local90 = local359.aByteArray55 = Static292.method4110(local42);
										}
										@Pc(392) short local392 = this.aShortArray35[local196];
										@Pc(397) short local397 = this.aShortArray39[local196];
										@Pc(402) short local402 = this.aShortArray40[local196];
										local201 = local103[local244];
										local208 = local103[local244 + 1];
										@Pc(417) byte local417 = this.aByteArray16[local196];
										@Pc(427) int local427;
										for (@Pc(419) int local419 = local201; local419 < local208; local419++) {
											local427 = local106[local419] - 1;
											if (local427 == -1) {
												break;
											}
											if (local90[local427] != 0) {
												local82[local427] += local392;
												local78[local427] += local397;
												local86[local427] += local402;
												local90[local427] += local417;
											}
										}
										local392 = local33[local277];
										local397 = local36[local277];
										local208 = this.anIntArray165[local132 + 1];
										local402 = local39[local277];
										local417 = local42[local277];
										local201 = this.anIntArray165[local132];
										for (local427 = local201; local427 < local208; local427++) {
											@Pc(513) int local513 = this.aShortArray43[local427] - 1;
											if (local513 == -1) {
												break;
											}
											if (local57[local513] != 0) {
												local53[local513] += local392;
												local49[local513] += local397;
												local61[local513] += local402;
												local57[local513] += local417;
											}
										}
										local8.method1587();
										this.method1587();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub6_Sub2.anIntArray675[arg0];
		@Pc(13) int local13 = Class1_Sub6_Sub2.anIntArray676[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.lb; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray163[local15] + local13 * this.anIntArray160[local15] >> 14;
			this.anIntArray163[local15] = local13 * this.anIntArray163[local15] - this.anIntArray160[local15] * local9 >> 14;
			this.anIntArray160[local15] = local33;
		}
		this.method1593();
		this.aBoolean153 = false;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIIZII)Z")
	private boolean method1591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg5 && arg2 > arg3 && arg6 > arg3) {
			return false;
		} else if (arg3 > arg5 && arg2 < arg3 && arg6 < arg3) {
			return false;
		} else if (arg7 < arg1 && arg7 < arg0 && arg4 > arg7) {
			return false;
		} else {
			return arg7 <= arg1 || arg0 >= arg7 || arg7 <= arg4;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZLclient!uj;)V")
	private void method1592(@OriginalArg(1) Class1_Sub6_Sub5_Sub2 arg0) {
		if (this.anInt1928 > Static85.anIntArray156.length) {
			Static85.anIntArray156 = new int[this.anInt1928];
			Static297.anIntArray394 = new int[this.anInt1928];
		}
		@Pc(54) int local54;
		@Pc(93) int local93;
		@Pc(102) int local102;
		for (@Pc(20) int local20 = 0; local20 < this.lb; local20++) {
			local54 = (this.anIntArray160[local20] - (this.aClass134_Sub1_9.anInt8428 * this.anIntArray162[local20] >> 8) >> this.aClass134_Sub1_9.anInt8441) - arg0.anInt8919;
			@Pc(79) int local79 = (this.anIntArray163[local20] - (this.anIntArray162[local20] * this.aClass134_Sub1_9.anInt8445 >> 8) >> this.aClass134_Sub1_9.anInt8441) - arg0.anInt8923;
			@Pc(84) int local84 = this.anIntArray165[local20];
			@Pc(91) int local91 = this.anIntArray165[local20 + 1];
			for (local93 = local84; local93 < local91; local93++) {
				local102 = this.aShortArray43[local93] - 1;
				if (local102 == -1) {
					break;
				}
				Static85.anIntArray156[local102] = local54;
				Static297.anIntArray394[local102] = local79;
			}
		}
		for (local54 = 0; local54 < this.anInt1889; local54++) {
			if (this.aByteArray17 == null || this.aByteArray17[local54] <= 128) {
				@Pc(143) short local143 = this.aShortArray41[local54];
				@Pc(148) short local148 = this.aShortArray38[local54];
				@Pc(153) short local153 = this.aShortArray42[local54];
				local93 = Static85.anIntArray156[local143];
				local102 = Static85.anIntArray156[local148];
				@Pc(165) int local165 = Static85.anIntArray156[local153];
				@Pc(169) int local169 = Static297.anIntArray394[local143];
				@Pc(173) int local173 = Static297.anIntArray394[local148];
				@Pc(177) int local177 = Static297.anIntArray394[local153];
				if (-((local173 - local169) * (local165 + -local102)) + (local173 - local177) * (local93 - local102) > 0) {
					arg0.method7297(local165, local93, local173, local102, local177, local169);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(Z)V")
	private void method1593() {
		if (this.aClass123_1 != null) {
			this.aClass123_1.aBoolean228 = false;
		}
	}

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean153) {
			this.method1586();
		}
		return this.anInt1884;
	}

	@OriginalMember(owner = "client!dm", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean151;
	}

	@OriginalMember(owner = "client!dm", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub6_Sub2.anIntArray675[arg0];
		@Pc(13) int local13 = Class1_Sub6_Sub2.anIntArray676[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.lb; local15++) {
			local34 = this.anIntArray163[local15] * local9 + local13 * this.anIntArray160[local15] >> 14;
			this.anIntArray163[local15] = this.anIntArray163[local15] * local13 - local9 * this.anIntArray160[local15] >> 14;
			this.anIntArray160[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt1928; local34++) {
			@Pc(84) int local84 = this.aShortArray40[local34] * local9 + this.aShortArray35[local34] * local13 >> 14;
			this.aShortArray40[local34] = (short) (this.aShortArray40[local34] * local13 - local9 * this.aShortArray35[local34] >> 14);
			this.aShortArray35[local34] = (short) local84;
		}
		this.method1593();
		this.method1587();
		this.aBoolean153 = false;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIJILclient!lm;FFIII)S")
	private short method1594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class210 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray165[arg2];
		@Pc(17) int local17 = this.anIntArray165[arg2 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray43[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg3 == Static219.aLongArray22[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray43[local19] = (short) (this.anInt1928 + 1);
		Static219.aLongArray22[local19] = arg3;
		this.aShortArray44[this.anInt1928] = (short) arg8;
		this.aShortArray33[this.anInt1928] = (short) arg2;
		this.aShortArray35[this.anInt1928] = (short) arg4;
		this.aShortArray39[this.anInt1928] = (short) arg9;
		this.aShortArray40[this.anInt1928] = (short) arg1;
		this.aByteArray16[this.anInt1928] = (byte) arg0;
		this.aFloatArray3[this.anInt1928] = arg7;
		this.aFloatArray4[this.anInt1928] = arg6;
		return (short) this.anInt1928++;
	}

	@OriginalMember(owner = "client!dm", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.lb; local3++) {
			if (arg0 != 0) {
				this.anIntArray160[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray162[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray163[local3] += arg2;
			}
		}
		this.method1593();
		this.aBoolean153 = false;
	}

	@OriginalMember(owner = "client!dm", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static375.anInt6277 = 0;
			Static542.anInt9064 = 0;
			local28 = 0;
			Static66.anInt1333 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray45.length) {
					local48 = this.anIntArrayArray45[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray34 == null || (this.aShortArray34[local56] & arg6) != 0) {
							Static66.anInt1333 += this.anIntArray160[local56];
							Static375.anInt6277 += this.anIntArray162[local56];
							Static542.anInt9064 += this.anIntArray163[local56];
							local28++;
						}
					}
				}
			}
			if (local28 > 0) {
				Static66.anInt1333 = Static66.anInt1333 / local28 + arg2;
				Static375.anInt6277 = Static375.anInt6277 / local28 + arg3;
				Static224.aBoolean578 = true;
				Static542.anInt9064 = Static542.anInt9064 / local28 + arg4;
			} else {
				Static66.anInt1333 = arg2;
				Static542.anInt9064 = arg4;
				Static375.anInt6277 = arg3;
			}
			return;
		}
		@Pc(243) int[] local243;
		@Pc(245) int local245;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg7[2] * arg4 + arg2 * arg7[0] + arg7[1] * arg3 + 8192 >> 14;
				local32 = arg4 * arg7[5] + arg2 * arg7[3] + arg7[4] * arg3 + 8192 >> 14;
				local38 = arg4 * arg7[8] + arg3 * arg7[7] + arg7[6] * arg2 + 8192 >> 14;
				arg2 = local28;
				arg3 = local32;
				arg4 = local38;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray45.length) {
					local243 = this.anIntArrayArray45[local32];
					for (local245 = 0; local245 < local243.length; local245++) {
						local50 = local243[local245];
						if (this.aShortArray34 == null || (arg6 & this.aShortArray34[local50]) != 0) {
							this.anIntArray160[local50] += arg2;
							this.anIntArray162[local50] += arg3;
							this.anIntArray163[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(372) int local372;
		@Pc(390) int local390;
		@Pc(626) int local626;
		@Pc(635) int local635;
		@Pc(644) int local644;
		@Pc(648) int local648;
		@Pc(666) int local666;
		@Pc(1003) int local1003;
		@Pc(1011) int local1011;
		@Pc(1165) int local1165;
		@Pc(1190) int local1190;
		@Pc(1194) int local1194;
		@Pc(1202) int local1202;
		@Pc(1207) int local1207;
		@Pc(1211) int local1211;
		@Pc(1215) int local1215;
		@Pc(1217) int local1217;
		@Pc(1348) int[] local1348;
		@Pc(1350) int local1350;
		@Pc(1354) int local1354;
		@Pc(1358) int local1358;
		@Pc(1360) int local1360;
		@Pc(1487) int local1487;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray45.length > local32) {
						local243 = this.anIntArrayArray45[local32];
						for (local245 = 0; local245 < local243.length; local245++) {
							local50 = local243[local245];
							if (this.aShortArray34 == null || (this.aShortArray34[local50] & arg6) != 0) {
								this.anIntArray160[local50] -= Static66.anInt1333;
								this.anIntArray162[local50] -= Static375.anInt6277;
								this.anIntArray163[local50] -= Static542.anInt9064;
								if (arg4 != 0) {
									local56 = Class1_Sub6_Sub2.anIntArray675[arg4];
									local372 = Class1_Sub6_Sub2.anIntArray676[arg4];
									local390 = local56 * this.anIntArray162[local50] + local372 * this.anIntArray160[local50] + 16383 >> 14;
									this.anIntArray162[local50] = this.anIntArray162[local50] * local372 + 16383 - local56 * this.anIntArray160[local50] >> 14;
									this.anIntArray160[local50] = local390;
								}
								if (arg2 != 0) {
									local56 = Class1_Sub6_Sub2.anIntArray675[arg2];
									local372 = Class1_Sub6_Sub2.anIntArray676[arg2];
									local390 = this.anIntArray162[local50] * local372 + 16383 - this.anIntArray163[local50] * local56 >> 14;
									this.anIntArray163[local50] = local372 * this.anIntArray163[local50] + local56 * this.anIntArray162[local50] + 16383 >> 14;
									this.anIntArray162[local50] = local390;
								}
								if (arg3 != 0) {
									local56 = Class1_Sub6_Sub2.anIntArray675[arg3];
									local372 = Class1_Sub6_Sub2.anIntArray676[arg3];
									local390 = local56 * this.anIntArray163[local50] + this.anIntArray160[local50] * local372 + 16383 >> 14;
									this.anIntArray163[local50] = this.anIntArray163[local50] * local372 + 16383 - local56 * this.anIntArray160[local50] >> 14;
									this.anIntArray160[local50] = local390;
								}
								this.anIntArray160[local50] += Static66.anInt1333;
								this.anIntArray162[local50] += Static375.anInt6277;
								this.anIntArray163[local50] += Static542.anInt9064;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray45.length > local38) {
							local48 = this.anIntArrayArray45[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray34 == null || (arg6 & this.aShortArray34[local56]) != 0) {
									local372 = this.anIntArray165[local56];
									local390 = this.anIntArray165[local56 + 1];
									for (local626 = local372; local626 < local390; local626++) {
										local635 = this.aShortArray43[local626] - 1;
										if (local635 == -1) {
											break;
										}
										if (arg4 != 0) {
											local644 = Class1_Sub6_Sub2.anIntArray675[arg4];
											local648 = Class1_Sub6_Sub2.anIntArray676[arg4];
											local666 = this.aShortArray39[local635] * local644 + local648 * this.aShortArray35[local635] + 16383 >> 14;
											this.aShortArray39[local635] = (short) (local648 * this.aShortArray39[local635] + 16383 - this.aShortArray35[local635] * local644 >> 14);
											this.aShortArray35[local635] = (short) local666;
										}
										if (arg2 != 0) {
											local644 = Class1_Sub6_Sub2.anIntArray675[arg2];
											local648 = Class1_Sub6_Sub2.anIntArray676[arg2];
											local666 = this.aShortArray39[local635] * local648 + 16383 - local644 * this.aShortArray40[local635] >> 14;
											this.aShortArray40[local635] = (short) (this.aShortArray39[local635] * local644 + this.aShortArray40[local635] * local648 + 16383 >> 14);
											this.aShortArray39[local635] = (short) local666;
										}
										if (arg3 != 0) {
											local644 = Class1_Sub6_Sub2.anIntArray675[arg3];
											local648 = Class1_Sub6_Sub2.anIntArray676[arg3];
											local666 = local648 * this.aShortArray35[local635] + local644 * this.aShortArray40[local635] + 16383 >> 14;
											this.aShortArray40[local635] = (short) (local648 * this.aShortArray40[local635] + 16383 - this.aShortArray35[local635] * local644 >> 14);
											this.aShortArray35[local635] = (short) local666;
										}
									}
								}
							}
						}
					}
					this.method1587();
					return;
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local245 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static224.aBoolean578) {
					local372 = Static66.anInt1333 * arg7[0] + arg7[3] * Static375.anInt6277 + Static542.anInt9064 * arg7[6] + 8192 >> 14;
					local390 = arg7[4] * Static375.anInt6277 + arg7[1] * Static66.anInt1333 + arg7[7] * Static542.anInt9064 + 8192 >> 14;
					local626 = arg7[8] * Static542.anInt9064 + arg7[5] * Static375.anInt6277 + Static66.anInt1333 * arg7[2] + 8192 >> 14;
					local372 += local245;
					local390 += local50;
					local626 += local56;
					Static66.anInt1333 = local372;
					Static375.anInt6277 = local390;
					Static224.aBoolean578 = false;
					Static542.anInt9064 = local626;
				}
				@Pc(971) int[] local971 = new int[9];
				local390 = Class1_Sub6_Sub2.anIntArray676[arg2];
				local626 = Class1_Sub6_Sub2.anIntArray675[arg2];
				local635 = Class1_Sub6_Sub2.anIntArray676[arg3];
				local644 = Class1_Sub6_Sub2.anIntArray675[arg3];
				local648 = Class1_Sub6_Sub2.anIntArray676[arg4];
				local666 = Class1_Sub6_Sub2.anIntArray675[arg4];
				local1003 = local626 * local648 + 8192 >> 14;
				local1011 = local666 * local626 + 8192 >> 14;
				local971[1] = local644 * local1003 + -local635 * local666 + 8192 >> 14;
				local971[8] = local390 * local635 + 8192 >> 14;
				local971[5] = -local626;
				local971[7] = local1003 * local635 + local644 * local666 + 8192 >> 14;
				local971[2] = local390 * local644 + 8192 >> 14;
				local971[4] = local390 * local648 + 8192 >> 14;
				local971[6] = local648 * -local644 + local635 * local1011 + 8192 >> 14;
				local971[0] = local644 * local1011 + local635 * local648 + 8192 >> 14;
				local971[3] = local390 * local666 + 8192 >> 14;
				@Pc(1140) int local1140 = -Static375.anInt6277 * local971[1] + -Static66.anInt1333 * local971[0] + local971[2] * -Static542.anInt9064 + 8192 >> 14;
				local1165 = local971[5] * -Static542.anInt9064 + -Static375.anInt6277 * local971[4] + local971[3] * -Static66.anInt1333 + 8192 >> 14;
				local1190 = local971[8] * -Static542.anInt9064 + -Static375.anInt6277 * local971[7] + -Static66.anInt1333 * local971[6] + 8192 >> 14;
				local1194 = Static66.anInt1333 + local1140;
				@Pc(1198) int local1198 = Static375.anInt6277 + local1165;
				local1202 = Static542.anInt9064 + local1190;
				@Pc(1205) int[] local1205 = new int[9];
				for (local1207 = 0; local1207 < 3; local1207++) {
					for (local1211 = 0; local1211 < 3; local1211++) {
						local1215 = 0;
						for (local1217 = 0; local1217 < 3; local1217++) {
							local1215 += arg7[local1217 + local1211 * 3] * local971[local1207 * 3 + local1217];
						}
						local1205[local1211 + local1207 * 3] = local1215 + 8192 >> 14;
					}
				}
				local1211 = local56 * local971[2] + local971[0] * local245 + local971[1] * local50 + 8192 >> 14;
				local1215 = local971[3] * local245 + local50 * local971[4] + local971[5] * local56 + 8192 >> 14;
				local1217 = local971[6] * local245 + local50 * local971[7] + local56 * local971[8] + 8192 >> 14;
				local1215 += local1198;
				local1211 += local1194;
				local1217 += local1202;
				local1348 = new int[9];
				for (local1350 = 0; local1350 < 3; local1350++) {
					for (local1354 = 0; local1354 < 3; local1354++) {
						local1358 = 0;
						for (local1360 = 0; local1360 < 3; local1360++) {
							local1358 += local1205[local1360 * 3 + local1354] * arg7[local1360 + local1350 * 3];
						}
						local1348[local1354 + local1350 * 3] = local1358 + 8192 >> 14;
					}
				}
				local1354 = arg7[2] * local1217 + local1211 * arg7[0] + local1215 * arg7[1] + 8192 >> 14;
				local1358 = local1215 * arg7[4] + arg7[3] * local1211 + arg7[5] * local1217 + 8192 >> 14;
				local1354 += local28;
				local1360 = local1211 * arg7[6] + local1215 * arg7[7] + local1217 * arg7[8] + 8192 >> 14;
				local1358 += local32;
				local1360 += local38;
				for (local1487 = 0; local1487 < local8; local1487++) {
					@Pc(1493) int local1493 = arg1[local1487];
					if (this.anIntArrayArray45.length > local1493) {
						@Pc(1503) int[] local1503 = this.anIntArrayArray45[local1493];
						for (@Pc(1505) int local1505 = 0; local1505 < local1503.length; local1505++) {
							@Pc(1511) int local1511 = local1503[local1505];
							if (this.aShortArray34 == null || (arg6 & this.aShortArray34[local1511]) != 0) {
								@Pc(1555) int local1555 = this.anIntArray163[local1511] * local1348[2] + this.anIntArray162[local1511] * local1348[1] + this.anIntArray160[local1511] * local1348[0] + 8192 >> 14;
								@Pc(1586) int local1586 = this.anIntArray163[local1511] * local1348[5] + local1348[4] * this.anIntArray162[local1511] + this.anIntArray160[local1511] * local1348[3] + 8192 >> 14;
								@Pc(1618) int local1618 = this.anIntArray160[local1511] * local1348[6] + local1348[7] * this.anIntArray162[local1511] + this.anIntArray163[local1511] * local1348[8] + 8192 >> 14;
								@Pc(1622) int local1622 = local1555 + local1354;
								@Pc(1626) int local1626 = local1586 + local1358;
								@Pc(1630) int local1630 = local1618 + local1360;
								this.anIntArray160[local1511] = local1622;
								this.anIntArray162[local1511] = local1626;
								this.anIntArray163[local1511] = local1630;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2575) Class311 local2575;
			@Pc(2463) boolean local2463;
			@Pc(2570) Class232 local2570;
			if (arg0 == 5) {
				if (this.anIntArrayArray46 != null) {
					local2463 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray46.length) {
							local48 = this.anIntArrayArray46[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray32 == null || (this.aShortArray32[local56] & arg6) != 0) {
									local372 = arg2 * 8 + (this.aByteArray17[local56] & 0xFF);
									if (local372 < 0) {
										local372 = 0;
									} else if (local372 > 255) {
										local372 = 255;
									}
									this.aByteArray17[local56] = (byte) local372;
								}
							}
							local2463 |= local48.length > 0;
						}
					}
					if (local2463) {
						if (this.aClass232Array1 != null) {
							for (local38 = 0; local38 < this.anInt1886; local38++) {
								local2570 = this.aClass232Array1[local38];
								local2575 = this.aClass311Array1[local38];
								local2575.anInt8163 = local2575.anInt8163 & 0xFFFFFF | 255 - (this.aByteArray17[local2570.anInt5730] & 0xFF) << 24;
							}
						}
						this.method1588();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray46 != null) {
					local2463 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray46.length) {
							local48 = this.anIntArrayArray46[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray32 == null || (this.aShortArray32[local56] & arg6) != 0) {
									local372 = this.aShortArray36[local56] & 0xFFFF;
									local390 = local372 >> 10 & 0x3F;
									local626 = local372 >> 7 & 0x7;
									local635 = local372 & 0x7F;
									@Pc(2682) int local2682 = local390 + arg2 & 0x3F;
									local626 += arg3 / 4;
									if (local626 < 0) {
										local626 = 0;
									} else if (local626 > 7) {
										local626 = 7;
									}
									local635 += arg4;
									if (local635 < 0) {
										local635 = 0;
									} else if (local635 > 127) {
										local635 = 127;
									}
									this.aShortArray36[local56] = (short) (local626 << 7 | local2682 << 10 | local635);
								}
							}
							local2463 |= local48.length > 0;
						}
					}
					if (local2463) {
						if (this.aClass232Array1 != null) {
							for (local38 = 0; local38 < this.anInt1886; local38++) {
								local2570 = this.aClass232Array1[local38];
								local2575 = this.aClass311Array1[local38];
								local2575.anInt8163 = local2575.anInt8163 & 0xFF000000 | Static379.anIntArray506[this.aShortArray36[local2570.anInt5730] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method1588();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray44 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray44.length) {
							local243 = this.anIntArrayArray44[local32];
							for (local245 = 0; local245 < local243.length; local245++) {
								local2575 = this.aClass311Array1[local243[local245]];
								local2575.anInt8166 += arg3;
								local2575.anInt8164 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray44 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray44.length) {
							local243 = this.anIntArrayArray44[local32];
							for (local245 = 0; local245 < local243.length; local245++) {
								local2575 = this.aClass311Array1[local243[local245]];
								local2575.anInt8168 = arg3 * local2575.anInt8168 >> 7;
								local2575.anInt8171 = arg2 * local2575.anInt8171 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray44 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray44.length) {
						local243 = this.anIntArrayArray44[local32];
						for (local245 = 0; local245 < local243.length; local245++) {
							local2575 = this.aClass311Array1[local243[local245]];
							local2575.anInt8165 = arg2 + local2575.anInt8165 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray45.length > local32) {
					local243 = this.anIntArrayArray45[local32];
					for (local245 = 0; local245 < local243.length; local245++) {
						local50 = local243[local245];
						if (this.aShortArray34 == null || (arg6 & this.aShortArray34[local50]) != 0) {
							this.anIntArray160[local50] -= Static66.anInt1333;
							this.anIntArray162[local50] -= Static375.anInt6277;
							this.anIntArray163[local50] -= Static542.anInt9064;
							this.anIntArray160[local50] = this.anIntArray160[local50] * arg2 >> 7;
							this.anIntArray162[local50] = this.anIntArray162[local50] * arg3 >> 7;
							this.anIntArray163[local50] = arg4 * this.anIntArray163[local50] >> 7;
							this.anIntArray160[local50] += Static66.anInt1333;
							this.anIntArray162[local50] += Static375.anInt6277;
							this.anIntArray163[local50] += Static542.anInt9064;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local245 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static224.aBoolean578) {
				local372 = Static66.anInt1333 * arg7[0] + Static375.anInt6277 * arg7[3] + arg7[6] * Static542.anInt9064 + 8192 >> 14;
				local390 = arg7[1] * Static66.anInt1333 + arg7[4] * Static375.anInt6277 + arg7[7] * Static542.anInt9064 + 8192 >> 14;
				local626 = Static542.anInt9064 * arg7[8] + Static66.anInt1333 * arg7[2] + arg7[5] * Static375.anInt6277 + 8192 >> 14;
				local372 += local245;
				local390 += local50;
				local626 += local56;
				Static66.anInt1333 = local372;
				Static375.anInt6277 = local390;
				Static224.aBoolean578 = false;
				Static542.anInt9064 = local626;
			}
			local372 = arg2 << 15 >> 7;
			local390 = arg3 << 15 >> 7;
			local626 = arg4 << 15 >> 7;
			local635 = local372 * -Static66.anInt1333 + 8192 >> 14;
			local644 = local390 * -Static375.anInt6277 + 8192 >> 14;
			local648 = local626 * -Static542.anInt9064 + 8192 >> 14;
			local666 = local635 + Static66.anInt1333;
			local1003 = Static375.anInt6277 + local644;
			local1011 = local648 + Static542.anInt9064;
			@Pc(1854) int[] local1854 = new int[] { arg7[0] * local372 + 8192 >> 14, local372 * arg7[3] + 8192 >> 14, local372 * arg7[6] + 8192 >> 14, arg7[1] * local390 + 8192 >> 14, arg7[4] * local390 + 8192 >> 14, arg7[7] * local390 + 8192 >> 14, arg7[2] * local626 + 8192 >> 14, arg7[5] * local626 + 8192 >> 14, local626 * arg7[8] + 8192 >> 14 };
			local1165 = local372 * local245 + 8192 >> 14;
			local1190 = local50 * local390 + 8192 >> 14;
			@Pc(1982) int local1982 = local1190 + local1003;
			local1194 = local56 * local626 + 8192 >> 14;
			@Pc(1994) int local1994 = local1165 + local666;
			@Pc(1998) int local1998 = local1194 + local1011;
			@Pc(2001) int[] local2001 = new int[9];
			@Pc(2007) int local2007;
			for (local1202 = 0; local1202 < 3; local1202++) {
				for (local2007 = 0; local2007 < 3; local2007++) {
					local1207 = 0;
					for (local1211 = 0; local1211 < 3; local1211++) {
						local1207 += arg7[local1202 * 3 + local1211] * local1854[local1211 * 3 + local2007];
					}
					local2001[local1202 * 3 + local2007] = local1207 + 8192 >> 14;
				}
			}
			local2007 = arg7[2] * local1998 + arg7[1] * local1982 + local1994 * arg7[0] + 8192 >> 14;
			local1207 = arg7[4] * local1982 + local1994 * arg7[3] + arg7[5] * local1998 + 8192 >> 14;
			local2007 += local28;
			local1207 += local32;
			local1211 = arg7[8] * local1998 + arg7[6] * local1994 + local1982 * arg7[7] + 8192 >> 14;
			local1211 += local38;
			for (local1215 = 0; local1215 < local8; local1215++) {
				local1217 = arg1[local1215];
				if (this.anIntArrayArray45.length > local1217) {
					local1348 = this.anIntArrayArray45[local1217];
					for (local1350 = 0; local1350 < local1348.length; local1350++) {
						local1354 = local1348[local1350];
						if (this.aShortArray34 == null || (this.aShortArray34[local1354] & arg6) != 0) {
							local1358 = local2001[2] * this.anIntArray163[local1354] + this.anIntArray160[local1354] * local2001[0] + local2001[1] * this.anIntArray162[local1354] + 8192 >> 14;
							local1360 = this.anIntArray162[local1354] * local2001[4] + local2001[3] * this.anIntArray160[local1354] + this.anIntArray163[local1354] * local2001[5] + 8192 >> 14;
							local1487 = this.anIntArray163[local1354] * local2001[8] + this.anIntArray162[local1354] * local2001[7] + local2001[6] * this.anIntArray160[local1354] + 8192 >> 14;
							@Pc(2283) int local2283 = local1358 + local2007;
							@Pc(2287) int local2287 = local1360 + local1207;
							@Pc(2291) int local2291 = local1487 + local1211;
							this.anIntArray160[local1354] = local2283;
							this.anIntArray162[local1354] = local2287;
							this.anIntArray163[local1354] = local2291;
						}
					}
				}
			}
		}
	}
}
