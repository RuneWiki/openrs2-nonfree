import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!as", name = "p", descriptor = "[Lclient!ol;")
	private Class243[] aClass243Array1;

	@OriginalMember(owner = "client!as", name = "q", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!as", name = "s", descriptor = "S")
	private short aShort1;

	@OriginalMember(owner = "client!as", name = "v", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!as", name = "w", descriptor = "S")
	private short aShort2;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!as", name = "A", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!as", name = "O", descriptor = "[Lclient!lia;")
	private Class193[] aClass193Array1;

	@OriginalMember(owner = "client!as", name = "Q", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!as", name = "V", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!as", name = "W", descriptor = "[F")
	private float[] aFloatArray1;

	@OriginalMember(owner = "client!as", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!as", name = "gb", descriptor = "Lclient!rd;")
	private Class284 aClass284_1;

	@OriginalMember(owner = "client!as", name = "hb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!as", name = "kb", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!as", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!as", name = "pb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!as", name = "qb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!as", name = "tb", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!as", name = "vb", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!as", name = "Ab", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!as", name = "Db", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!as", name = "Fb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!as", name = "Jb", descriptor = "[F")
	private float[] aFloatArray2;

	@OriginalMember(owner = "client!as", name = "Kb", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!as", name = "Lb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!as", name = "Rb", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!as", name = "Sb", descriptor = "I")
	private int anInt516;

	@OriginalMember(owner = "client!as", name = "Ub", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!as", name = "gc", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!as", name = "hc", descriptor = "Lclient!gh;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!as", name = "jc", descriptor = "Lclient!wia;")
	private Interface27 anInterface27_1;

	@OriginalMember(owner = "client!as", name = "lc", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!as", name = "nc", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!as", name = "rc", descriptor = "[Lclient!ti;")
	private Class326[] aClass326Array1;

	@OriginalMember(owner = "client!as", name = "tc", descriptor = "I")
	private int anInt532;

	@OriginalMember(owner = "client!as", name = "uc", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!as", name = "wc", descriptor = "[Lclient!wr;")
	private Class382[] aClass382Array1;

	@OriginalMember(owner = "client!as", name = "yc", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!as", name = "zc", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!as", name = "Ac", descriptor = "I")
	private int anInt534;

	@OriginalMember(owner = "client!as", name = "Bc", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!as", name = "Cc", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!as", name = "Jc", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!as", name = "fb", descriptor = "I")
	private int anInt494 = 0;

	@OriginalMember(owner = "client!as", name = "P", descriptor = "I")
	private int anInt483 = 0;

	@OriginalMember(owner = "client!as", name = "sb", descriptor = "I")
	private int anInt500 = 0;

	@OriginalMember(owner = "client!as", name = "J", descriptor = "Z")
	private boolean aBoolean19 = false;

	@OriginalMember(owner = "client!as", name = "Eb", descriptor = "I")
	private int anInt508 = 0;

	@OriginalMember(owner = "client!as", name = "Tb", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!as", name = "F", descriptor = "I")
	private int anInt477 = 0;

	@OriginalMember(owner = "client!as", name = "mc", descriptor = "Z")
	private boolean aBoolean21 = true;

	@OriginalMember(owner = "client!as", name = "vc", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!as", name = "Hb", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_6;

	@OriginalMember(owner = "client!as", name = "jb", descriptor = "Lclient!cl;")
	private Class55 aClass55_3;

	@OriginalMember(owner = "client!as", name = "Yb", descriptor = "Lclient!cl;")
	private Class55 aClass55_4;

	@OriginalMember(owner = "client!as", name = "H", descriptor = "Lclient!cl;")
	private Class55 aClass55_1;

	@OriginalMember(owner = "client!as", name = "eb", descriptor = "Lclient!cl;")
	private Class55 aClass55_2;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "Lclient!pia;")
	private Class257 aClass257_1;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class24_Sub1(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_6 = arg0;
		this.aClass55_3 = new Class55((Interface27) null, 5126, 3, 0);
		this.aClass55_4 = new Class55((Interface27) null, 5126, 2, 0);
		this.aClass55_1 = new Class55((Interface27) null, 5126, 3, 0);
		this.aClass55_2 = new Class55((Interface27) null, 5121, 4, 0);
		this.aClass257_1 = new Class257();
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!wh;Lclient!dh;IIII)V")
	public Class24_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt534 = arg2;
		this.anInt516 = arg5;
		this.aClass100_Sub3_6 = arg0;
		if (Static130.method2123(arg2, arg5)) {
			this.aClass55_3 = new Class55((Interface27) null, 5126, 3, 0);
		}
		if (Static503.method7486(arg2, arg5)) {
			this.aClass55_4 = new Class55((Interface27) null, 5126, 2, 0);
		}
		if (Static393.method6342(arg5, arg2)) {
			this.aClass55_1 = new Class55((Interface27) null, 5126, 3, 0);
		}
		if (Static356.method5696(arg5, arg2)) {
			this.aClass55_2 = new Class55((Interface27) null, 5121, 4, 0);
		}
		if (Static367.method5806(arg2, arg5)) {
			this.aClass257_1 = new Class257();
		}
		@Pc(108) Interface4 local108 = arg0.anInterface4_12;
		@Pc(112) int[] local112 = new int[arg1.anInt2002];
		this.anIntArray27 = new int[arg1.anInt1989 + 1];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt2002; local121++) {
			if (arg1.aByteArray32 == null || arg1.aByteArray32[local121] != 2) {
				if (arg1.aShortArray42 != null && arg1.aShortArray42[local121] != -1) {
					@Pc(154) Class325 local154 = local108.method895(arg1.aShortArray42[local121] & 0xFFFF);
					if (((this.anInt516 & 0x40) == 0 || !local154.aBoolean636) && local154.aBoolean638) {
						continue;
					}
				}
				local112[this.anInt477++] = local121;
				this.anIntArray27[arg1.aShortArray38[local121]]++;
				this.anIntArray27[arg1.aShortArray37[local121]]++;
				this.anIntArray27[arg1.aShortArray39[local121]]++;
			}
		}
		this.anInt494 = this.anInt477;
		@Pc(230) long[] local230 = new long[this.anInt477];
		@Pc(242) boolean local242 = (this.anInt534 & 0x100) != 0;
		@Pc(254) int local254;
		@Pc(267) int local267;
		@Pc(444) int local444;
		for (@Pc(244) int local244 = 0; local244 < this.anInt477; local244++) {
			@Pc(250) int local250 = local112[local244];
			@Pc(252) Class325 local252 = null;
			local254 = 0;
			@Pc(256) byte local256 = 0;
			@Pc(258) byte local258 = 0;
			@Pc(260) byte local260 = 0;
			if (arg1.aClass5Array1 != null) {
				@Pc(265) boolean local265 = false;
				for (local267 = 0; local267 < arg1.aClass5Array1.length; local267++) {
					@Pc(274) Class5 local274 = arg1.aClass5Array1[local267];
					if (local250 == local274.anInt67) {
						@Pc(287) Class148 local287 = Static250.method4484(local274.anInt66);
						if (local287.aBoolean333) {
							local265 = true;
						}
						if (local287.anInt4702 != -1) {
							@Pc(302) Class325 local302 = local108.method895(local287.anInt4702);
							if (local302.anInt9371 == 2) {
								this.aBoolean22 = true;
							}
						}
					}
				}
				if (local265) {
					local230[local244] = Long.MAX_VALUE;
					this.anInt494--;
					continue;
				}
			}
			@Pc(333) short local333 = -1;
			if (arg1.aShortArray42 != null) {
				local333 = arg1.aShortArray42[local250];
				if (local333 != -1) {
					local252 = local108.method895(local333 & 0xFFFF);
					if ((this.anInt516 & 0x40) != 0 && local252.aBoolean636) {
						local252 = null;
						local333 = -1;
					} else {
						if (local252.aByte116 != 0 || local252.aByte111 != 0) {
							this.aBoolean19 = true;
						}
						local260 = local252.aByte112;
						local258 = local252.aByte115;
					}
				}
			}
			@Pc(406) boolean local406 = arg1.aByteArray29 != null && arg1.aByteArray29[local250] != 0 || local252 != null && local252.anInt9371 != 0;
			if ((local242 || local406) && arg1.aByteArray33 != null) {
				local254 += arg1.aByteArray33[local250] << 17;
			}
			if (local406) {
				local254 += 65536;
			}
			local254 += (local258 & 0xFF) << 8;
			local444 = local256 + ((local333 & 0xFFFF) << 16);
			local254 += local260 & 0xFF;
			@Pc(456) int local456 = local444 + (local244 & 0xFFFF);
			local230[local244] = (long) local456 + ((long) local254 << 32);
			this.aBoolean22 |= local406;
			this.aBoolean19 |= local252 != null && (local252.aByte116 != 0 || local252.aByte111 != 0);
		}
		Static33.method602(local112, local230);
		this.aShortArray3 = arg1.aShortArray41;
		this.anInt483 = arg1.anInt1989;
		this.anIntArray28 = arg1.anIntArray130;
		this.anIntArray29 = arg1.anIntArray133;
		this.anInt508 = arg1.anInt2001;
		this.anIntArray25 = arg1.anIntArray132;
		this.aClass243Array1 = arg1.aClass243Array2;
		@Pc(539) Class231[] local539 = new Class231[this.anInt483];
		this.aClass382Array1 = arg1.aClass382Array2;
		@Pc(563) int local563;
		@Pc(577) int local577;
		@Pc(624) int local624;
		if (arg1.aClass5Array1 != null) {
			this.anInt532 = arg1.aClass5Array1.length;
			this.aClass193Array1 = new Class193[this.anInt532];
			this.aClass326Array1 = new Class326[this.anInt532];
			for (local563 = 0; local563 < this.anInt532; local563++) {
				@Pc(570) Class5 local570 = arg1.aClass5Array1[local563];
				@Pc(575) Class148 local575 = Static250.method4484(local570.anInt66);
				local577 = -1;
				for (@Pc(579) int local579 = 0; local579 < this.anInt477; local579++) {
					if (local570.anInt67 == local112[local579]) {
						local577 = local579;
						break;
					}
				}
				if (local577 == -1) {
					throw new RuntimeException();
				}
				local624 = Static91.anIntArray99[arg1.aShortArray46[local570.anInt67] & 0xFFFF] & 0xFFFFFF;
				@Pc(642) int local642 = local624 | 255 - (arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local570.anInt67]) << 24;
				this.aClass193Array1[local563] = new Class193(local577, arg1.aShortArray38[local570.anInt67], arg1.aShortArray37[local570.anInt67], arg1.aShortArray39[local570.anInt67], local575.anInt4706, local575.anInt4705, local575.anInt4702, local575.anInt4700, local575.anInt4704, local575.aBoolean333, local575.aBoolean334, local570.anInt69);
				this.aClass326Array1[local563] = new Class326(local642);
			}
		}
		local563 = this.anInt477 * 3;
		this.aShortArray7 = new short[this.anInt477];
		this.aShortArray8 = new short[this.anInt477];
		Static382.aLongArray12 = new long[local563];
		this.aShortArray10 = new short[local563];
		this.aShortArray2 = new short[local563];
		this.aShort4 = (short) arg4;
		this.aFloatArray1 = new float[local563];
		if (arg1.aShortArray44 != null) {
			this.aShortArray11 = new short[this.anInt477];
		}
		this.aShortArray4 = new short[this.anInt477];
		this.aShort1 = (short) arg3;
		this.lb = new short[this.anInt477];
		this.aByteArray4 = new byte[local563];
		this.aByteArray5 = new byte[this.anInt477];
		this.aShortArray9 = new short[local563];
		this.aShortArray6 = new short[this.anInt477];
		this.aShortArray5 = new short[local563];
		this.aFloatArray2 = new float[local563];
		local254 = 0;
		for (local444 = 0; local444 < arg1.anInt1989; local444++) {
			local577 = this.anIntArray27[local444];
			this.anIntArray27[local444] = local254;
			local539[local444] = new Class231();
			local254 += local577;
		}
		this.anIntArray27[arg1.anInt1989] = local254;
		@Pc(824) Class38 local824 = Static343.method5562(this.anInt477, arg1, local112);
		@Pc(828) Class318[] local828 = new Class318[arg1.anInt2002];
		@Pc(869) int local869;
		@Pc(880) int local880;
		@Pc(902) int local902;
		@Pc(913) int local913;
		@Pc(922) int local922;
		@Pc(931) int local931;
		@Pc(847) short local847;
		@Pc(858) int local858;
		for (local624 = 0; local624 < arg1.anInt2002; local624++) {
			@Pc(837) short local837 = arg1.aShortArray38[local624];
			@Pc(842) short local842 = arg1.aShortArray37[local624];
			local847 = arg1.aShortArray39[local624];
			local858 = this.anIntArray25[local842] - this.anIntArray25[local837];
			local869 = this.anIntArray29[local842] - this.anIntArray29[local837];
			local880 = this.anIntArray28[local842] - this.anIntArray28[local837];
			@Pc(891) int local891 = this.anIntArray25[local847] - this.anIntArray25[local837];
			local902 = this.anIntArray29[local847] - this.anIntArray29[local837];
			local913 = this.anIntArray28[local847] - this.anIntArray28[local837];
			local922 = local869 * local913 - local880 * local902;
			local931 = local891 * local880 - local858 * local913;
			@Pc(940) int local940 = local902 * local858 - local891 * local869;
			while (local922 > 8192 || local931 > 8192 || local940 > 8192 || local922 < -8192 || local931 < -8192 || local940 < -8192) {
				local922 >>= 0x1;
				local940 >>= 0x1;
				local931 >>= 0x1;
			}
			@Pc(996) int local996 = (int) Math.sqrt((double) (local931 * local931 + local922 * local922 + local940 * local940));
			if (local996 <= 0) {
				local996 = 1;
			}
			local940 = local940 * 256 / local996;
			local922 = local922 * 256 / local996;
			local931 = local931 * 256 / local996;
			@Pc(1031) byte local1031 = arg1.aByteArray32 == null ? 0 : arg1.aByteArray32[local624];
			if (local1031 == 0) {
				@Pc(1037) Class231 local1037 = local539[local837];
				local1037.anInt7327++;
				local1037.anInt7329 += local940;
				local1037.anInt7326 += local931;
				local1037.anInt7330 += local922;
				@Pc(1065) Class231 local1065 = local539[local842];
				local1065.anInt7326 += local931;
				local1065.anInt7330 += local922;
				local1065.anInt7327++;
				local1065.anInt7329 += local940;
				@Pc(1093) Class231 local1093 = local539[local847];
				local1093.anInt7329 += local940;
				local1093.anInt7327++;
				local1093.anInt7326 += local931;
				local1093.anInt7330 += local922;
			} else if (local1031 == 1) {
				@Pc(1132) Class318 local1132 = local828[local624] = new Class318();
				local1132.anInt9315 = local931;
				local1132.anInt9313 = local940;
				local1132.anInt9314 = local922;
			}
		}
		@Pc(1158) int local1158;
		@Pc(1201) short local1201;
		for (local267 = 0; local267 < this.anInt477; local267++) {
			local1158 = local112[local267];
			@Pc(1165) int local1165 = arg1.aShortArray46[local1158] & 0xFFFF;
			if (arg1.aByteArray34 == null) {
				local858 = -1;
			} else {
				local858 = arg1.aByteArray34[local1158];
			}
			if (arg1.aByteArray29 == null) {
				local869 = 0;
			} else {
				local869 = arg1.aByteArray29[local1158] & 0xFF;
			}
			local1201 = arg1.aShortArray42 == null ? -1 : arg1.aShortArray42[local1158];
			if (local1201 != -1 && (this.anInt516 & 0x40) != 0) {
				@Pc(1217) Class325 local1217 = local108.method895(local1201 & 0xFFFF);
				if (local1217.aBoolean636) {
					local1201 = -1;
				}
			}
			@Pc(1224) float local1224 = 0.0F;
			@Pc(1226) float local1226 = 0.0F;
			@Pc(1228) float local1228 = 0.0F;
			@Pc(1230) float local1230 = 0.0F;
			@Pc(1232) float local1232 = 0.0F;
			@Pc(1234) float local1234 = 0.0F;
			@Pc(1236) byte local1236 = 0;
			@Pc(1238) byte local1238 = 0;
			@Pc(1240) int local1240 = 0;
			@Pc(1275) byte local1275;
			@Pc(1295) short local1295;
			@Pc(2088) short local2088;
			@Pc(2093) short local2093;
			if (local1201 != -1) {
				if (local858 == -1) {
					local1238 = 2;
					local1236 = 1;
					local1234 = 0.0F;
					local1232 = 0.0F;
					local1226 = 1.0F;
					local1230 = 1.0F;
					local1224 = 0.0F;
					local1228 = 1.0F;
				} else {
					local858 &= 0xFF;
					local1275 = arg1.aByteArray31[local858];
					@Pc(1285) short local1285;
					@Pc(1290) short local1290;
					@Pc(1328) float local1328;
					@Pc(1552) float local1552;
					@Pc(1560) float local1560;
					@Pc(1660) float local1660;
					@Pc(1668) float local1668;
					@Pc(1676) float local1676;
					@Pc(1699) float local1699;
					@Pc(1722) float local1722;
					@Pc(1745) float local1745;
					if (local1275 == 0) {
						local1285 = arg1.aShortArray38[local1158];
						local1290 = arg1.aShortArray37[local1158];
						local1295 = arg1.aShortArray39[local1158];
						local2088 = arg1.aShortArray40[local858];
						local2093 = arg1.aShortArray45[local858];
						@Pc(2098) short local2098 = arg1.aShortArray43[local858];
						@Pc(2104) float local2104 = (float) arg1.anIntArray132[local2088];
						@Pc(2110) float local2110 = (float) arg1.anIntArray133[local2088];
						local1328 = (float) arg1.anIntArray130[local2088];
						local1552 = (float) arg1.anIntArray132[local2093] - local2104;
						local1560 = (float) arg1.anIntArray133[local2093] - local2110;
						@Pc(2143) float local2143 = (float) arg1.anIntArray130[local2093] - local1328;
						@Pc(2152) float local2152 = (float) arg1.anIntArray132[local2098] - local2104;
						@Pc(2160) float local2160 = (float) arg1.anIntArray133[local2098] - local2110;
						@Pc(2168) float local2168 = (float) arg1.anIntArray130[local2098] - local1328;
						@Pc(2177) float local2177 = (float) arg1.anIntArray132[local1285] - local2104;
						@Pc(2185) float local2185 = (float) arg1.anIntArray133[local1285] - local2110;
						@Pc(2193) float local2193 = (float) arg1.anIntArray130[local1285] - local1328;
						@Pc(2202) float local2202 = (float) arg1.anIntArray132[local1290] - local2104;
						@Pc(2210) float local2210 = (float) arg1.anIntArray133[local1290] - local2110;
						local1660 = (float) arg1.anIntArray130[local1290] - local1328;
						local1668 = (float) arg1.anIntArray132[local1295] - local2104;
						local1676 = (float) arg1.anIntArray133[local1295] - local2110;
						local1699 = (float) arg1.anIntArray130[local1295] - local1328;
						local1722 = local1560 * local2168 - local2143 * local2160;
						local1745 = local2152 * local2143 - local1552 * local2168;
						@Pc(2270) float local2270 = local1552 * local2160 - local1560 * local2152;
						@Pc(2278) float local2278 = local2270 * local2160 - local2168 * local1745;
						@Pc(2287) float local2287 = local1722 * local2168 - local2152 * local2270;
						@Pc(2295) float local2295 = local2152 * local1745 - local1722 * local2160;
						@Pc(2309) float local2309 = 1.0F / (local2287 * local1560 + local1552 * local2278 + local2143 * local2295);
						local1228 = (local1660 * local2295 + local2210 * local2287 + local2202 * local2278) * local2309;
						local1224 = (local2278 * local2177 + local2185 * local2287 + local2295 * local2193) * local2309;
						local1232 = (local1699 * local2295 + local1668 * local2278 + local1676 * local2287) * local2309;
						@Pc(2359) float local2359 = local2270 * local1560 - local2143 * local1745;
						@Pc(2367) float local2367 = local1722 * local2143 - local1552 * local2270;
						@Pc(2375) float local2375 = local1552 * local1745 - local1560 * local1722;
						@Pc(2389) float local2389 = 1.0F / (local2367 * local2160 + local2359 * local2152 + local2375 * local2168);
						local1230 = (local2210 * local2367 + local2202 * local2359 + local2375 * local1660) * local2389;
						local1234 = (local1676 * local2367 + local2359 * local1668 + local1699 * local2375) * local2389;
						local1226 = local2389 * (local2177 * local2359 + local2367 * local2185 + local2375 * local2193);
					} else {
						local1285 = arg1.aShortArray38[local1158];
						local1290 = arg1.aShortArray37[local1158];
						local1295 = arg1.aShortArray39[local1158];
						@Pc(1300) int local1300 = local824.anIntArray62[local858];
						@Pc(1305) int local1305 = local824.anIntArray60[local858];
						@Pc(1310) int local1310 = local824.anIntArray61[local858];
						@Pc(1315) float[] local1315 = local824.aFloatArrayArray1[local858];
						@Pc(1320) byte local1320 = arg1.aByteArray35[local858];
						local1328 = (float) arg1.anIntArray140[local858] / 256.0F;
						if (local1275 == 1) {
							local1552 = (float) arg1.anIntArray138[local858] / 1024.0F;
							Static349.method5627(arg1.anIntArray133[local1285], local1305, local1320, local1552, local1315, Static581.aFloatArray69, local1310, arg1.anIntArray130[local1285], arg1.anIntArray132[local1285], local1300, local1328);
							local1224 = Static581.aFloatArray69[0];
							local1226 = Static581.aFloatArray69[1];
							Static349.method5627(arg1.anIntArray133[local1290], local1305, local1320, local1552, local1315, Static581.aFloatArray69, local1310, arg1.anIntArray130[local1290], arg1.anIntArray132[local1290], local1300, local1328);
							local1228 = Static581.aFloatArray69[0];
							local1230 = Static581.aFloatArray69[1];
							Static349.method5627(arg1.anIntArray133[local1295], local1305, local1320, local1552, local1315, Static581.aFloatArray69, local1310, arg1.anIntArray130[local1295], arg1.anIntArray132[local1295], local1300, local1328);
							local1232 = Static581.aFloatArray69[0];
							local1234 = Static581.aFloatArray69[1];
							local1560 = local1552 / 2.0F;
							if ((local1320 & 0x1) == 0) {
								if (local1560 < local1232 - local1224) {
									local1238 = 1;
									local1232 -= local1552;
								} else if (local1560 < local1224 - local1232) {
									local1232 += local1552;
									local1238 = 2;
								}
								if (local1228 - local1224 > local1560) {
									local1228 -= local1552;
									local1236 = 1;
								} else if (local1560 < local1224 - local1228) {
									local1236 = 2;
									local1228 += local1552;
								}
							} else {
								if (local1560 < local1230 - local1226) {
									local1236 = 1;
									local1230 -= local1552;
								} else if (local1560 < local1226 - local1230) {
									local1236 = 2;
									local1230 += local1552;
								}
								if (local1234 - local1226 > local1560) {
									local1234 -= local1552;
									local1238 = 1;
								} else if (local1226 - local1234 > local1560) {
									local1234 += local1552;
									local1238 = 2;
								}
							}
						} else if (local1275 == 2) {
							local1552 = (float) arg1.anIntArray139[local858] / 256.0F;
							local1560 = (float) arg1.anIntArray135[local858] / 256.0F;
							@Pc(1571) int local1571 = arg1.anIntArray132[local1290] - arg1.anIntArray132[local1285];
							@Pc(1582) int local1582 = arg1.anIntArray133[local1290] - arg1.anIntArray133[local1285];
							@Pc(1592) int local1592 = arg1.anIntArray130[local1290] - arg1.anIntArray130[local1285];
							@Pc(1603) int local1603 = arg1.anIntArray132[local1295] - arg1.anIntArray132[local1285];
							@Pc(1614) int local1614 = arg1.anIntArray133[local1295] - arg1.anIntArray133[local1285];
							@Pc(1625) int local1625 = arg1.anIntArray130[local1295] - arg1.anIntArray130[local1285];
							@Pc(1634) int local1634 = local1625 * local1582 - local1614 * local1592;
							@Pc(1643) int local1643 = local1603 * local1592 - local1571 * local1625;
							@Pc(1652) int local1652 = local1571 * local1614 - local1603 * local1582;
							local1660 = 64.0F / (float) arg1.anIntArray131[local858];
							local1668 = 64.0F / (float) arg1.anIntArray134[local858];
							local1676 = 64.0F / (float) arg1.anIntArray138[local858];
							local1699 = ((float) local1643 * local1315[1] + (float) local1634 * local1315[0] + (float) local1652 * local1315[2]) / local1660;
							local1722 = ((float) local1652 * local1315[5] + (float) local1643 * local1315[4] + local1315[3] * (float) local1634) / local1668;
							local1745 = ((float) local1634 * local1315[6] + (float) local1643 * local1315[7] + local1315[8] * (float) local1652) / local1676;
							local1240 = Static332.method7833(local1699, local1722, local1745);
							Static7.method142(Static581.aFloatArray69, arg1.anIntArray133[local1285], local1300, local1305, local1310, arg1.anIntArray132[local1285], local1240, local1560, arg1.anIntArray130[local1285], local1328, local1315, local1552, local1320);
							local1224 = Static581.aFloatArray69[0];
							local1226 = Static581.aFloatArray69[1];
							Static7.method142(Static581.aFloatArray69, arg1.anIntArray133[local1290], local1300, local1305, local1310, arg1.anIntArray132[local1290], local1240, local1560, arg1.anIntArray130[local1290], local1328, local1315, local1552, local1320);
							local1230 = Static581.aFloatArray69[1];
							local1228 = Static581.aFloatArray69[0];
							Static7.method142(Static581.aFloatArray69, arg1.anIntArray133[local1295], local1300, local1305, local1310, arg1.anIntArray132[local1295], local1240, local1560, arg1.anIntArray130[local1295], local1328, local1315, local1552, local1320);
							local1232 = Static581.aFloatArray69[0];
							local1234 = Static581.aFloatArray69[1];
						} else if (local1275 == 3) {
							Static278.method4871(local1310, local1320, arg1.anIntArray130[local1285], arg1.anIntArray132[local1285], arg1.anIntArray133[local1285], local1305, local1315, Static581.aFloatArray69, local1328, local1300);
							local1226 = Static581.aFloatArray69[1];
							local1224 = Static581.aFloatArray69[0];
							Static278.method4871(local1310, local1320, arg1.anIntArray130[local1290], arg1.anIntArray132[local1290], arg1.anIntArray133[local1290], local1305, local1315, Static581.aFloatArray69, local1328, local1300);
							local1230 = Static581.aFloatArray69[1];
							local1228 = Static581.aFloatArray69[0];
							Static278.method4871(local1310, local1320, arg1.anIntArray130[local1295], arg1.anIntArray132[local1295], arg1.anIntArray133[local1295], local1305, local1315, Static581.aFloatArray69, local1328, local1300);
							local1234 = Static581.aFloatArray69[1];
							local1232 = Static581.aFloatArray69[0];
							if ((local1320 & 0x1) == 0) {
								if (local1228 - local1224 > 0.5F) {
									local1236 = 1;
									local1228--;
								} else if (local1224 - local1228 > 0.5F) {
									local1228++;
									local1236 = 2;
								}
								if (local1232 - local1224 > 0.5F) {
									local1232--;
									local1238 = 1;
								} else if (local1224 - local1232 > 0.5F) {
									local1232++;
									local1238 = 2;
								}
							} else {
								if (local1230 - local1226 > 0.5F) {
									local1236 = 1;
									local1230--;
								} else if (local1226 - local1230 > 0.5F) {
									local1236 = 2;
									local1230++;
								}
								if (local1234 - local1226 > 0.5F) {
									local1238 = 1;
									local1234--;
								} else if (local1226 - local1234 > 0.5F) {
									local1234++;
									local1238 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray32 == null) {
				local1275 = 0;
			} else {
				local1275 = arg1.aByteArray32[local1158];
			}
			if (local1275 == 0) {
				@Pc(2469) long local2469 = ((long) (local1165 << 8) + (long) (local1240 << 24) + (long) local869 << 32) + (long) (local858 << 2);
				local1295 = arg1.aShortArray38[local1158];
				local2088 = arg1.aShortArray37[local1158];
				local2093 = arg1.aShortArray39[local1158];
				@Pc(2488) Class231 local2488 = local539[local1295];
				this.lb[local267] = this.method465(local1295, local1224, local2488.anInt7327, local2488.anInt7330, local2488.anInt7326, local2488.anInt7329, local1226, arg1, local2469);
				@Pc(2512) Class231 local2512 = local539[local2088];
				this.aShortArray8[local267] = this.method465(local2088, local1228, local2512.anInt7327, local2512.anInt7330, local2512.anInt7326, local2512.anInt7329, local1230, arg1, (long) local1236 + local2469);
				@Pc(2539) Class231 local2539 = local539[local2093];
				this.aShortArray7[local267] = this.method465(local2093, local1232, local2539.anInt7327, local2539.anInt7330, local2539.anInt7326, local2539.anInt7329, local1234, arg1, local2469 + (long) local1238);
			} else if (local1275 == 1) {
				@Pc(2573) Class318 local2573 = local828[local1158];
				@Pc(2618) long local2618 = ((long) local869 + (long) (local1165 << 8) + (long) (local1240 << 24) << 32) + (long) ((local2573.anInt9315 + 256 << 12) + (local2573.anInt9314 > 0 ? 1024 : 2048) + ((local858 << 2) - -(local2573.anInt9313 - -256 << 22)));
				this.lb[local267] = this.method465(arg1.aShortArray38[local1158], local1224, 0, local2573.anInt9314, local2573.anInt9315, local2573.anInt9313, local1226, arg1, local2618);
				this.aShortArray8[local267] = this.method465(arg1.aShortArray37[local1158], local1228, 0, local2573.anInt9314, local2573.anInt9315, local2573.anInt9313, local1230, arg1, (long) local1236 + local2618);
				this.aShortArray7[local267] = this.method465(arg1.aShortArray39[local1158], local1232, 0, local2573.anInt9314, local2573.anInt9315, local2573.anInt9313, local1234, arg1, (long) local1238 + local2618);
			}
			if (arg1.aByteArray29 != null) {
				this.aByteArray5[local267] = arg1.aByteArray29[local1158];
			}
			if (arg1.aShortArray44 != null) {
				this.aShortArray11[local267] = arg1.aShortArray44[local1158];
			}
			this.aShortArray4[local267] = arg1.aShortArray46[local1158];
			this.aShortArray6[local267] = local1201;
		}
		local1158 = 0;
		local847 = -10000;
		for (local858 = 0; local858 < this.anInt494; local858++) {
			@Pc(2743) short local2743 = this.aShortArray6[local858];
			if (local2743 != local847) {
				local1158++;
				local847 = local2743;
			}
		}
		this.anIntArray26 = new int[local1158 + 1];
		local847 = -10000;
		local1158 = 0;
		for (local869 = 0; local869 < this.anInt494; local869++) {
			local1201 = this.aShortArray6[local869];
			if (local1201 != local847) {
				this.anIntArray26[local1158++] = local869;
				local847 = local1201;
			}
		}
		this.anIntArray26[local1158] = this.anInt494;
		Static382.aLongArray12 = null;
		this.aShortArray2 = Static81.method1418(this.aShortArray2, this.anInt500);
		this.aShortArray10 = Static81.method1418(this.aShortArray10, this.anInt500);
		this.aShortArray9 = Static81.method1418(this.aShortArray9, this.anInt500);
		this.aByteArray4 = Static28.method4859(this.aByteArray4, this.anInt500);
		this.aFloatArray2 = Static159.method3018(this.anInt500, this.aFloatArray2);
		this.aFloatArray1 = Static159.method3018(this.anInt500, this.aFloatArray1);
		if (arg1.anIntArray137 != null && Static31.method553(this.anInt516, arg2)) {
			this.anIntArrayArray4 = arg1.method1646(false);
		}
		if (arg1.aClass5Array1 != null && Static514.method7690(this.anInt516, arg2)) {
			this.anIntArrayArray5 = arg1.method1651();
		}
		if (arg1.anIntArray136 != null && Static274.method6846(this.anInt516, arg2)) {
			local880 = 0;
			@Pc(2904) int[] local2904 = new int[256];
			for (local902 = 0; local902 < this.anInt477; local902++) {
				local913 = arg1.anIntArray136[local112[local902]];
				if (local913 >= 0) {
					if (local913 > local880) {
						local880 = local913;
					}
					@Pc(2926) int local2926 = local2904[local913]++;
				}
			}
			this.anIntArrayArray3 = new int[local880 + 1][];
			for (local913 = 0; local913 <= local880; local913++) {
				this.anIntArrayArray3[local913] = new int[local2904[local913]];
				local2904[local913] = 0;
			}
			for (local922 = 0; local922 < this.anInt477; local922++) {
				local931 = arg1.anIntArray136[local112[local922]];
				if (local931 >= 0) {
					this.anIntArrayArray3[local931][local2904[local931]++] = local922;
				}
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt477; local7++) {
			if (arg0 == this.aShortArray4[local7]) {
				this.aShortArray4[local7] = arg1;
			}
		}
		if (this.aClass193Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt532; local38++) {
				@Pc(45) Class193 local45 = this.aClass193Array1[local38];
				@Pc(50) Class326 local50 = this.aClass326Array1[local38];
				local50.anInt9380 = Static91.anIntArray99[this.aShortArray4[local45.anInt6079] & 0xFFFF] & 0xFFFFFF | local50.anInt9380 & 0xFF000000;
			}
		}
		if (this.aClass55_2 != null) {
			this.aClass55_2.anInterface27_2 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt477; local3++) {
			local12 = this.aShortArray4[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 -= -(arg3 * (arg0 - local18) >> 7);
			}
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			@Pc(55) int local55 = local12 & 0x7F;
			if (arg2 != -1) {
				local55 -= -((arg2 - local55) * arg3 >> 7);
			}
			this.aShortArray4[local3] = (short) (local55 | local24 << 7 | local18 << 10);
		}
		if (this.aClass193Array1 != null) {
			for (local12 = 0; local12 < this.anInt532; local12++) {
				@Pc(108) Class193 local108 = this.aClass193Array1[local12];
				@Pc(113) Class326 local113 = this.aClass326Array1[local12];
				local113.anInt9380 = local113.anInt9380 & 0xFF000000 | Static91.anIntArray99[this.aShortArray4[local108.anInt6079] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass55_2 != null) {
			this.aClass55_2.anInterface27_2 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static300.anInt5838 = 0;
			Static125.anInt10760 = 0;
			Static648.anInt10737 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt483; local17++) {
				Static648.anInt10737 += this.anIntArray25[local17];
				Static300.anInt5838 += this.anIntArray29[local17];
				Static125.anInt10760 += this.anIntArray28[local17];
				local15++;
			}
			if (local15 > 0) {
				Static300.anInt5838 = arg2 + Static300.anInt5838 / local15;
				Static125.anInt10760 = arg3 + Static125.anInt10760 / local15;
				Static648.anInt10737 = arg1 + Static648.anInt10737 / local15;
			} else {
				Static125.anInt10760 = arg3;
				Static648.anInt10737 = arg1;
				Static300.anInt5838 = arg2;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt483; local15++) {
				this.anIntArray25[local15] += arg1;
				this.anIntArray29[local15] += arg2;
				this.anIntArray28[local15] += arg3;
			}
		} else {
			@Pc(163) int local163;
			@Pc(181) int local181;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt483; local15++) {
					this.anIntArray25[local15] -= Static648.anInt10737;
					this.anIntArray29[local15] -= Static300.anInt5838;
					this.anIntArray28[local15] -= Static125.anInt10760;
					if (arg3 != 0) {
						local17 = Class100_Sub1.anIntArray428[arg3];
						local163 = Class100_Sub1.anIntArray429[arg3];
						local181 = local163 * this.anIntArray25[local15] + local17 * this.anIntArray29[local15] + 16383 >> 14;
						this.anIntArray29[local15] = this.anIntArray29[local15] * local163 + 16383 - this.anIntArray25[local15] * local17 >> 14;
						this.anIntArray25[local15] = local181;
					}
					if (arg1 != 0) {
						local17 = Class100_Sub1.anIntArray428[arg1];
						local163 = Class100_Sub1.anIntArray429[arg1];
						local181 = this.anIntArray29[local15] * local163 + 16383 - this.anIntArray28[local15] * local17 >> 14;
						this.anIntArray28[local15] = this.anIntArray29[local15] * local17 + this.anIntArray28[local15] * local163 + 16383 >> 14;
						this.anIntArray29[local15] = local181;
					}
					if (arg2 != 0) {
						local17 = Class100_Sub1.anIntArray428[arg2];
						local163 = Class100_Sub1.anIntArray429[arg2];
						local181 = local17 * this.anIntArray28[local15] + local163 * this.anIntArray25[local15] + 16383 >> 14;
						this.anIntArray28[local15] = this.anIntArray28[local15] * local163 + 16383 - this.anIntArray25[local15] * local17 >> 14;
						this.anIntArray25[local15] = local181;
					}
					this.anIntArray25[local15] += Static648.anInt10737;
					this.anIntArray29[local15] += Static300.anInt5838;
					this.anIntArray28[local15] += Static125.anInt10760;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt483; local15++) {
					this.anIntArray25[local15] -= Static648.anInt10737;
					this.anIntArray29[local15] -= Static300.anInt5838;
					this.anIntArray28[local15] -= Static125.anInt10760;
					this.anIntArray25[local15] = arg1 * this.anIntArray25[local15] / 128;
					this.anIntArray29[local15] = this.anIntArray29[local15] * arg2 / 128;
					this.anIntArray28[local15] = this.anIntArray28[local15] * arg3 / 128;
					this.anIntArray25[local15] += Static648.anInt10737;
					this.anIntArray29[local15] += Static300.anInt5838;
					this.anIntArray28[local15] += Static125.anInt10760;
				}
			} else {
				@Pc(515) Class193 local515;
				@Pc(520) Class326 local520;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt477; local15++) {
						local17 = arg1 * 8 + (this.aByteArray5[local15] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray5[local15] = (byte) local17;
					}
					if (this.aClass55_2 != null) {
						this.aClass55_2.anInterface27_2 = null;
					}
					if (this.aClass193Array1 != null) {
						for (local17 = 0; local17 < this.anInt532; local17++) {
							local515 = this.aClass193Array1[local17];
							local520 = this.aClass326Array1[local17];
							local520.anInt9380 = local520.anInt9380 & 0xFFFFFF | 255 - (this.aByteArray5[local515.anInt6079] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt477; local15++) {
						local17 = this.aShortArray4[local15] & 0xFFFF;
						local163 = local17 >> 10 & 0x3F;
						local181 = local17 >> 7 & 0x7;
						@Pc(582) int local582 = local163 + arg1 & 0x3F;
						local181 += arg2 / 4;
						@Pc(592) int local592 = local17 & 0x7F;
						if (local181 < 0) {
							local181 = 0;
						} else if (local181 > 7) {
							local181 = 7;
						}
						local592 += arg3;
						if (local592 < 0) {
							local592 = 0;
						} else if (local592 > 127) {
							local592 = 127;
						}
						this.aShortArray4[local15] = (short) (local181 << 7 | local582 << 10 | local592);
					}
					if (this.aClass55_2 != null) {
						this.aClass55_2.anInterface27_2 = null;
					}
					if (this.aClass193Array1 != null) {
						for (local17 = 0; local17 < this.anInt532; local17++) {
							local515 = this.aClass193Array1[local17];
							local520 = this.aClass326Array1[local17];
							local520.anInt9380 = Static91.anIntArray99[this.aShortArray4[local515.anInt6079] & 0xFFFF] & 0xFFFFFF | local520.anInt9380 & 0xFF000000;
						}
					}
				} else {
					@Pc(710) Class326 local710;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt532; local15++) {
							local710 = this.aClass326Array1[local15];
							local710.anInt9383 += arg1;
							local710.anInt9373 += arg2;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt532; local15++) {
							local710 = this.aClass326Array1[local15];
							local710.anInt9376 = arg1 * local710.anInt9376 >> 7;
							local710.anInt9381 = local710.anInt9381 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt532; local15++) {
							local710 = this.aClass326Array1[local15];
							local710.anInt9375 = local710.anInt9375 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt483; local7++) {
			if (arg0 != 128) {
				this.anIntArray25[local7] = arg0 * this.anIntArray25[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray29[local7] = this.anIntArray29[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray28[local7] = this.anIntArray28[local7] * arg2 >> 7;
			}
		}
		if (this.aClass55_3 != null) {
			this.aClass55_3.anInterface27_2 = null;
		}
		this.aBoolean20 = false;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class24 method6850(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(15) Class24_Sub1 local15;
		@Pc(19) Class24_Sub1 local19;
		if (arg0 == 1) {
			local15 = this.aClass100_Sub3_6.aClass24_Sub1_4;
			local19 = this.aClass100_Sub3_6.aClass24_Sub1_10;
		} else if (arg0 == 2) {
			local15 = this.aClass100_Sub3_6.aClass24_Sub1_7;
			local19 = this.aClass100_Sub3_6.aClass24_Sub1_5;
		} else if (arg0 == 3) {
			local15 = this.aClass100_Sub3_6.aClass24_Sub1_8;
			local19 = this.aClass100_Sub3_6.aClass24_Sub1_9;
		} else if (arg0 == 4) {
			local15 = this.aClass100_Sub3_6.aClass24_Sub1_2;
			local19 = this.aClass100_Sub3_6.aClass24_Sub1_1;
		} else if (arg0 == 5) {
			local15 = this.aClass100_Sub3_6.aClass24_Sub1_3;
			local19 = this.aClass100_Sub3_6.aClass24_Sub1_6;
		} else {
			local15 = local19 = new Class24_Sub1(this.aClass100_Sub3_6);
		}
		return this.method469(local15, arg1, local19, arg2, arg0 != 0);
	}

	@OriginalMember(owner = "client!as", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean20) {
			this.method467();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!oca;Z)V")
	private void method458(@OriginalArg(0) Class6_Sub2_Sub16_Sub1 arg0) {
		if (this.anInt500 > this.aClass100_Sub3_6.anIntArray640.length) {
			this.aClass100_Sub3_6.anIntArray641 = new int[this.anInt500];
			this.aClass100_Sub3_6.anIntArray640 = new int[this.anInt500];
		}
		@Pc(32) int[] local32 = this.aClass100_Sub3_6.anIntArray640;
		@Pc(36) int[] local36 = this.aClass100_Sub3_6.anIntArray641;
		@Pc(65) int local65;
		@Pc(103) int local103;
		@Pc(112) int local112;
		for (@Pc(38) int local38 = 0; local38 < this.anInt483; local38++) {
			local65 = (this.anIntArray25[local38] - (this.anIntArray29[local38] * this.aClass100_Sub3_6.anInt10606 >> 8) >> this.aClass100_Sub3_6.anInt10587) - arg0.anInt7426;
			@Pc(89) int local89 = (this.anIntArray28[local38] - (this.anIntArray29[local38] * this.aClass100_Sub3_6.anInt10615 >> 8) >> this.aClass100_Sub3_6.anInt10587) - arg0.anInt7425;
			@Pc(94) int local94 = this.anIntArray27[local38];
			@Pc(101) int local101 = this.anIntArray27[local38 + 1];
			for (local103 = local94; local103 < local101; local103++) {
				local112 = this.aShortArray5[local103] - 1;
				if (local112 == -1) {
					break;
				}
				local32[local112] = local65;
				local36[local112] = local89;
			}
		}
		for (local65 = 0; local65 < this.anInt494; local65++) {
			if (this.aByteArray5 == null || this.aByteArray5[local65] <= 128) {
				@Pc(161) short local161 = this.lb[local65];
				@Pc(166) short local166 = this.aShortArray8[local65];
				@Pc(171) short local171 = this.aShortArray7[local65];
				local103 = local32[local161];
				local112 = local32[local166];
				@Pc(183) int local183 = local32[local171];
				@Pc(187) int local187 = local36[local161];
				@Pc(191) int local191 = local36[local166];
				@Pc(195) int local195 = local36[local171];
				if ((local103 - local112) * (local191 - local195) - (local183 - local112) * (local191 - local187) > 0) {
					arg0.method6389(local195, local183, local191, local187, local112, local103);
				}
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt534;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "()[Lclient!wr;")
	@Override
	public Class382[] method6853() {
		return this.aClass382Array1;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BSIII)I")
	private int method459(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18 = Static91.anIntArray99[Static612.method7496(arg2, arg3)];
		if (arg1 != -1) {
			@Pc(30) Class325 local30 = this.aClass100_Sub3_6.anInterface4_12.method895(arg1 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte113 & 0xFF;
			@Pc(51) int local51;
			@Pc(73) int local73;
			if (local35 != 0) {
				if (arg3 < 0) {
					local51 = 0;
				} else if (arg3 <= 127) {
					local51 = arg3 * 131586;
				} else {
					local51 = 16777215;
				}
				if (local35 == 256) {
					local18 = local51;
				} else {
					local73 = 256 - local35;
					local18 = (local73 * (local18 & 0xFF00) + (local51 & 0xFF00) * local35 & 0xFF0000) + ((local18 & 0xFF00FF) * local73 + local35 * (local51 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local51 = local30.aByte117 & 0xFF;
			if (local51 != 0) {
				local51 += 256;
				@Pc(119) int local119 = local51 * (local18 >> 16 & 0xFF);
				if (local119 > 65535) {
					local119 = 65535;
				}
				local73 = (local18 >> 8 & 0xFF) * local51;
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(143) int local143 = (local18 & 0xFF) * local51;
				if (local143 > 65535) {
					local143 = 65535;
				}
				local18 = (local143 >> 8) + (local73 & 0xFF00) + ((local119 & 0xAC00FF00) << 8);
			}
		}
		return (local18 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZILclient!ql;III)Z")
	private boolean method460(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class154 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) Class154_Sub3 local8 = (Class154_Sub3) arg3;
		@Pc(12) Class154_Sub3 local12 = this.aClass100_Sub3_6.aClass154_Sub3_3;
		@Pc(33) float local33 = local12.aFloat151 * local8.aFloat156 + local12.aFloat155 * local8.aFloat160 + local8.aFloat152 * local12.aFloat161 + local12.aFloat156;
		@Pc(54) float local54 = local12.aFloat160 + local8.aFloat156 * local12.aFloat157 + local12.aFloat153 * local8.aFloat160 + local12.aFloat150 * local8.aFloat152;
		Static121.aFloat29 = local8.aFloat159 * local12.aFloat150 + local8.aFloat157 * local12.aFloat153 + local12.aFloat157 * local8.aFloat151;
		Static227.aFloat72 = local8.aFloat150 * local12.aFloat153 + local8.aFloat161 * local12.aFloat157 + local8.aFloat158 * local12.aFloat150;
		Static287.aFloat182 = local12.aFloat153 * local8.aFloat153 + local8.aFloat155 * local12.aFloat157 + local8.aFloat154 * local12.aFloat150;
		Static414.aFloat148 = local12.aFloat158 * local8.aFloat159 + local12.aFloat159 * local8.aFloat151 + local8.aFloat157 * local12.aFloat154;
		Static3.aFloat1 = local8.aFloat161 * local12.aFloat159 + local8.aFloat150 * local12.aFloat154 + local12.aFloat158 * local8.aFloat158;
		Static467.aFloat177 = local8.aFloat153 * local12.aFloat155 + local12.aFloat151 * local8.aFloat155 + local8.aFloat154 * local12.aFloat161;
		Static589.aFloat196 = local8.aFloat157 * local12.aFloat155 + local8.aFloat151 * local12.aFloat151 + local8.aFloat159 * local12.aFloat161;
		@Pc(201) float local201 = local12.aFloat152 + local12.aFloat158 * local8.aFloat152 + local8.aFloat156 * local12.aFloat159 + local12.aFloat154 * local8.aFloat160;
		Static21.aFloat8 = local12.aFloat159 * local8.aFloat155 + local12.aFloat154 * local8.aFloat153 + local8.aFloat154 * local12.aFloat158;
		Static112.aFloat28 = local12.aFloat155 * local8.aFloat150 + local8.aFloat161 * local12.aFloat151 + local8.aFloat158 * local12.aFloat161;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass100_Sub3_6.anInt10613;
		@Pc(255) int local255 = this.aClass100_Sub3_6.anInt10614;
		if (!this.aBoolean20) {
			this.method467();
		}
		@Pc(270) int local270 = this.aShort6 - this.aShort5 >> 1;
		@Pc(279) int local279 = this.aShort9 - this.aShort10 >> 1;
		@Pc(288) int local288 = this.aShort8 - this.aShort2 >> 1;
		@Pc(293) int local293 = this.aShort5 + local270;
		@Pc(299) int local299 = this.aShort10 + local279;
		@Pc(304) int local304 = this.aShort2 + local288;
		@Pc(311) int local311 = local293 - (local270 << arg0);
		@Pc(318) int local318 = local299 - (local279 << arg0);
		@Pc(325) int local325 = local304 - (local288 << arg0);
		@Pc(331) int local331 = (local270 << arg0) + local293;
		@Pc(337) int local337 = local299 + (local279 << arg0);
		Static441.anIntArray486[0] = local311;
		@Pc(347) int local347 = (local288 << arg0) + local304;
		Static120.anIntArray158[0] = local318;
		Static280.anIntArray337[0] = local325;
		Static441.anIntArray486[1] = local331;
		Static120.anIntArray158[1] = local318;
		Static280.anIntArray337[1] = local325;
		Static441.anIntArray486[2] = local311;
		Static120.anIntArray158[2] = local337;
		Static441.anIntArray486[3] = local331;
		Static280.anIntArray337[2] = local325;
		Static120.anIntArray158[3] = local337;
		Static441.anIntArray486[4] = local311;
		Static280.anIntArray337[3] = local325;
		Static120.anIntArray158[4] = local318;
		Static280.anIntArray337[4] = local347;
		Static441.anIntArray486[5] = local331;
		Static120.anIntArray158[5] = local318;
		Static441.anIntArray486[6] = local311;
		Static280.anIntArray337[5] = local347;
		Static120.anIntArray158[6] = local337;
		Static280.anIntArray337[6] = local347;
		Static441.anIntArray486[7] = local331;
		Static120.anIntArray158[7] = local337;
		Static280.anIntArray337[7] = local347;
		@Pc(500) float local500;
		@Pc(486) float local486;
		@Pc(472) float local472;
		@Pc(448) float local448;
		@Pc(453) float local453;
		@Pc(458) float local458;
		for (@Pc(441) int local441 = 0; local441 < 8; local441++) {
			local448 = (float) Static441.anIntArray486[local441];
			local453 = (float) Static120.anIntArray158[local441];
			local458 = (float) Static280.anIntArray337[local441];
			local472 = local458 * Static3.aFloat1 + Static21.aFloat8 * local453 + local448 * Static414.aFloat148 + local201;
			local486 = Static121.aFloat29 * local448 + Static287.aFloat182 * local453 + Static227.aFloat72 * local458 + local54;
			local500 = Static467.aFloat177 * local453 + local448 * Static589.aFloat196 + local458 * Static112.aFloat28 + local33;
			if ((float) this.aClass100_Sub3_6.anInt10628 <= local472) {
				if (arg5 > 0) {
					local472 = (float) arg5;
				}
				@Pc(527) float local527 = local500 * (float) local251 / local472 + (float) this.aClass100_Sub3_6.anInt10621;
				@Pc(539) float local539 = local486 * (float) local255 / local472 + (float) this.aClass100_Sub3_6.anInt10607;
				if (local241 > local527) {
					local241 = local527;
				}
				if (local243 < local527) {
					local243 = local527;
				}
				local239 = true;
				if (local539 < local245) {
					local245 = local539;
				}
				if (local247 < local539) {
					local247 = local539;
				}
			}
		}
		if (local239 && (float) arg4 > local241 && (float) arg4 < local243 && (float) arg2 > local245 && (float) arg2 < local247) {
			if (arg1) {
				return true;
			}
			if (this.anInt500 > this.aClass100_Sub3_6.anIntArray640.length) {
				this.aClass100_Sub3_6.anIntArray640 = new int[this.anInt500];
				this.aClass100_Sub3_6.anIntArray641 = new int[this.anInt500];
			}
			@Pc(620) int[] local620 = this.aClass100_Sub3_6.anIntArray640;
			@Pc(624) int[] local624 = this.aClass100_Sub3_6.anIntArray641;
			@Pc(700) int local700;
			for (@Pc(626) int local626 = 0; local626 < this.anInt483; local626++) {
				local448 = (float) this.anIntArray25[local626];
				local453 = (float) this.anIntArray29[local626];
				local458 = (float) this.anIntArray28[local626];
				local486 = local54 + Static227.aFloat72 * local458 + local453 * Static287.aFloat182 + Static121.aFloat29 * local448;
				local472 = local201 + Static21.aFloat8 * local453 + local448 * Static414.aFloat148 + Static3.aFloat1 * local458;
				local500 = local453 * Static467.aFloat177 + Static589.aFloat196 * local448 + Static112.aFloat28 * local458 + local33;
				@Pc(707) int local707;
				@Pc(709) int local709;
				@Pc(718) int local718;
				if (local472 >= (float) this.aClass100_Sub3_6.anInt10628) {
					if (arg5 > 0) {
						local472 = (float) arg5;
					}
					local700 = (int) ((float) this.aClass100_Sub3_6.anInt10621 + (float) local251 * local500 / local472);
					local707 = (int) ((float) this.aClass100_Sub3_6.anInt10607 + (float) local255 * local486 / local472);
					local709 = this.anIntArray27[local626];
					local718 = this.anIntArray27[local626 + 1];
					for (@Pc(781) int local781 = local709; local781 < local718; local781++) {
						@Pc(790) int local790 = this.aShortArray5[local781] - 1;
						if (local790 == -1) {
							break;
						}
						local620[local790] = local700;
						local624[local790] = local707;
					}
				} else {
					local700 = this.anIntArray27[local626];
					local707 = this.anIntArray27[local626 + 1];
					for (local709 = local700; local709 < local707; local709++) {
						local718 = this.aShortArray5[local709] - 1;
						if (local718 == -1) {
							break;
						}
						local620[this.aShortArray5[local709] - 1] = -999999;
					}
				}
			}
			for (local700 = 0; local700 < this.anInt477; local700++) {
				if (local620[this.lb[local700]] != -999999 && local620[this.aShortArray8[local700]] != -999999 && local620[this.aShortArray7[local700]] != -999999 && this.method464(local624[this.aShortArray8[local700]], arg2, local624[this.aShortArray7[local700]], arg4, local620[this.aShortArray8[local700]], local620[this.aShortArray7[local700]], local620[this.lb[local700]], local624[this.lb[local700]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!as", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray4 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt508; local12++) {
			this.anIntArray25[local12] <<= 0x4;
			this.anIntArray29[local12] <<= 0x4;
			this.anIntArray28[local12] <<= 0x4;
		}
		Static125.anInt10760 = 0;
		Static648.anInt10737 = 0;
		Static300.anInt5838 = 0;
		return true;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method6848(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray3 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt483; local14++) {
			if ((arg1 & this.aShortArray3[local14]) != 0) {
				if (arg2) {
					arg0.method6561(this.anIntArray25[local14], this.anIntArray29[local14], this.anIntArray28[local14], local12);
				} else {
					arg0.method6573(this.anIntArray25[local14], this.anIntArray29[local14], this.anIntArray28[local14], local12);
				}
				this.anIntArray25[local14] = local12[0];
				this.anIntArray29[local14] = local12[1];
				this.anIntArray28[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean19;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "()V")
	@Override
	public void method6859() {
		if (this.anInt500 <= 0 || this.anInt494 <= 0) {
			return;
		}
		this.method462(false);
		if ((this.aByte6 & 0x10) == 0 && this.aClass257_1.anInterface10_4 == null) {
			this.method468(false);
		}
		this.method470();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ql;Lclient!eda;II)V")
	@Override
	public void method6845(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class20_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt500 == 0) {
			return;
		}
		@Pc(13) Class154_Sub3 local13 = this.aClass100_Sub3_6.aClass154_Sub3_3;
		if (!this.aBoolean20) {
			this.method467();
		}
		@Pc(22) Class154_Sub3 local22 = (Class154_Sub3) arg0;
		Static516.aFloat185 = local13.aFloat158 * local22.aFloat152 + local13.aFloat159 * local22.aFloat156 + local13.aFloat154 * local22.aFloat160 + local13.aFloat152;
		Static21.aFloat8 = local22.aFloat154 * local13.aFloat158 + local13.aFloat159 * local22.aFloat155 + local13.aFloat154 * local22.aFloat153;
		@Pc(69) float local69 = Static516.aFloat185 + Static21.aFloat8 * (float) this.aShort10;
		@Pc(77) float local77 = Static516.aFloat185 + (float) this.aShort9 * Static21.aFloat8;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = (float) this.aShort7 + local69;
			local93 = local77 - (float) this.aShort7;
		} else {
			local87 = local77 + (float) this.aShort7;
			local93 = local69 - (float) this.aShort7;
		}
		if (local93 >= this.aClass100_Sub3_6.aFloat213 || (float) this.aClass100_Sub3_6.anInt10628 >= local87) {
			return;
		}
		Static550.aFloat188 = local13.aFloat156 + local13.aFloat155 * local22.aFloat160 + local13.aFloat151 * local22.aFloat156 + local13.aFloat161 * local22.aFloat152;
		Static467.aFloat177 = local22.aFloat154 * local13.aFloat161 + local13.aFloat151 * local22.aFloat155 + local22.aFloat153 * local13.aFloat155;
		@Pc(169) float local169 = Static467.aFloat177 * (float) this.aShort10 + Static550.aFloat188;
		@Pc(177) float local177 = Static550.aFloat188 + Static467.aFloat177 * (float) this.aShort9;
		@Pc(203) float local203;
		@Pc(192) float local192;
		if (local177 < local169) {
			local192 = (float) this.aClass100_Sub3_6.anInt10613 * ((float) this.aShort7 + local169);
			local203 = (local177 - (float) this.aShort7) * (float) this.aClass100_Sub3_6.anInt10613;
		} else {
			local192 = (float) this.aClass100_Sub3_6.anInt10613 * (local177 + (float) this.aShort7);
			local203 = ((float) -this.aShort7 + local169) * (float) this.aClass100_Sub3_6.anInt10613;
		}
		if (local203 / (float) arg2 >= this.aClass100_Sub3_6.aFloat224 || local192 / (float) arg2 <= this.aClass100_Sub3_6.aFloat223) {
			return;
		}
		Static287.aFloat182 = local13.aFloat150 * local22.aFloat154 + local22.aFloat155 * local13.aFloat157 + local22.aFloat153 * local13.aFloat153;
		Static330.aFloat119 = local13.aFloat150 * local22.aFloat152 + local22.aFloat160 * local13.aFloat153 + local13.aFloat157 * local22.aFloat156 + local13.aFloat160;
		@Pc(295) float local295 = Static330.aFloat119 + Static287.aFloat182 * (float) this.aShort10;
		@Pc(303) float local303 = Static330.aFloat119 + (float) this.aShort9 * Static287.aFloat182;
		@Pc(330) float local330;
		@Pc(318) float local318;
		if (local303 < local295) {
			local318 = ((float) this.aShort7 + local295) * (float) this.aClass100_Sub3_6.anInt10614;
			local330 = ((float) -this.aShort7 + local303) * (float) this.aClass100_Sub3_6.anInt10614;
		} else {
			local318 = (local303 + (float) this.aShort7) * (float) this.aClass100_Sub3_6.anInt10614;
			local330 = ((float) -this.aShort7 + local295) * (float) this.aClass100_Sub3_6.anInt10614;
		}
		if (this.aClass100_Sub3_6.aFloat216 <= local330 / (float) arg2 || this.aClass100_Sub3_6.aFloat229 >= local318 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass193Array1 != null) {
			Static227.aFloat72 = local22.aFloat150 * local13.aFloat153 + local22.aFloat161 * local13.aFloat157 + local13.aFloat150 * local22.aFloat158;
			Static112.aFloat28 = local13.aFloat155 * local22.aFloat150 + local22.aFloat161 * local13.aFloat151 + local22.aFloat158 * local13.aFloat161;
			Static3.aFloat1 = local13.aFloat159 * local22.aFloat161 + local22.aFloat150 * local13.aFloat154 + local22.aFloat158 * local13.aFloat158;
			Static121.aFloat29 = local22.aFloat159 * local13.aFloat150 + local13.aFloat153 * local22.aFloat157 + local13.aFloat157 * local22.aFloat151;
			Static414.aFloat148 = local22.aFloat151 * local13.aFloat159 + local22.aFloat157 * local13.aFloat154 + local13.aFloat158 * local22.aFloat159;
			Static589.aFloat196 = local22.aFloat159 * local13.aFloat161 + local22.aFloat157 * local13.aFloat155 + local22.aFloat151 * local13.aFloat151;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.aShort6 + this.aShort5 >> 1;
			@Pc(506) int local506 = this.aShort8 + this.aShort2 >> 1;
			@Pc(525) int local525 = (int) ((float) this.aShort10 * Static467.aFloat177 + Static550.aFloat188 + (float) local498 * Static589.aFloat196 + Static112.aFloat28 * (float) local506);
			@Pc(544) int local544 = (int) ((float) local506 * Static227.aFloat72 + Static330.aFloat119 + (float) local498 * Static121.aFloat29 + Static287.aFloat182 * (float) this.aShort10);
			@Pc(563) int local563 = (int) (Static21.aFloat8 * (float) this.aShort10 + Static414.aFloat148 * (float) local498 + Static516.aFloat185 + Static3.aFloat1 * (float) local506);
			@Pc(582) int local582 = (int) ((float) this.aShort9 * Static467.aFloat177 + Static589.aFloat196 * (float) local498 + Static550.aFloat188 + (float) local506 * Static112.aFloat28);
			@Pc(601) int local601 = (int) (Static121.aFloat29 * (float) local498 + Static330.aFloat119 + Static287.aFloat182 * (float) this.aShort9 + Static227.aFloat72 * (float) local506);
			arg1.anInt2371 = this.aClass100_Sub3_6.anInt10614 * local601 / arg2 + this.aClass100_Sub3_6.anInt10607;
			arg1.anInt2369 = this.aClass100_Sub3_6.anInt10621 + this.aClass100_Sub3_6.anInt10613 * local525 / arg2;
			arg1.anInt2368 = this.aClass100_Sub3_6.anInt10607 + this.aClass100_Sub3_6.anInt10614 * local544 / arg2;
			@Pc(660) int local660 = (int) (Static414.aFloat148 * (float) local498 + Static516.aFloat185 + Static21.aFloat8 * (float) this.aShort9 + Static3.aFloat1 * (float) local506);
			arg1.anInt2370 = local582 * this.aClass100_Sub3_6.anInt10613 / arg2 + this.aClass100_Sub3_6.anInt10621;
			if (local563 >= this.aClass100_Sub3_6.anInt10628 || local660 >= this.aClass100_Sub3_6.anInt10628) {
				arg1.anInt2367 = this.aClass100_Sub3_6.anInt10621 + (local525 + this.aShort7) * this.aClass100_Sub3_6.anInt10613 / arg2 - arg1.anInt2369;
				arg1.aBoolean175 = true;
			}
		}
		this.aClass100_Sub3_6.method8877((float) arg2);
		this.aClass100_Sub3_6.method8920();
		this.aClass100_Sub3_6.method8915(local22);
		this.method471();
		this.aClass100_Sub3_6.method8918();
		this.method461();
	}

	@OriginalMember(owner = "client!as", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort4;
	}

	@OriginalMember(owner = "client!as", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt483; local7++) {
			this.anIntArray28[local7] = -this.anIntArray28[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt500; local29++) {
			this.aShortArray9[local29] = (short) -this.aShortArray9[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt477; local52++) {
			@Pc(59) short local59 = this.lb[local52];
			this.lb[local52] = this.aShortArray7[local52];
			this.aShortArray7[local52] = local59;
		}
		if (this.aClass55_1 == null && this.aClass55_2 != null) {
			this.aClass55_2.anInterface27_2 = null;
		}
		if (this.aClass55_1 != null) {
			this.aClass55_1.anInterface27_2 = null;
		}
		if (this.aClass257_1 != null) {
			this.aClass257_1.anInterface10_4 = null;
		}
		this.aBoolean20 = false;
		if (this.aClass55_3 != null) {
			this.aClass55_3.anInterface27_2 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V")
	private void method461() {
		if (this.aClass193Array1 == null) {
			return;
		}
		@Pc(8) Class154_Sub3 local8 = this.aClass100_Sub3_6.aClass154_Sub3_2;
		this.aClass100_Sub3_6.method8909();
		this.aClass100_Sub3_6.C(!this.aBoolean22);
		this.aClass100_Sub3_6.method8926(false);
		this.aClass100_Sub3_6.method8885(this.aClass100_Sub3_6.aClass55_15, (Class55) null, this.aClass100_Sub3_6.aClass55_16, (Class55) null);
		for (@Pc(42) int local42 = 0; local42 < this.anInt532; local42++) {
			@Pc(49) Class193 local49 = this.aClass193Array1[local42];
			@Pc(54) Class326 local54 = this.aClass326Array1[local42];
			if (!local49.aBoolean409 || !this.aClass100_Sub3_6.method8784()) {
				@Pc(82) float local82 = (float) (this.anIntArray25[local49.anInt6078] + this.anIntArray25[local49.anInt6084] + this.anIntArray25[local49.anInt6082]) * 0.3333333F;
				@Pc(103) float local103 = (float) (this.anIntArray29[local49.anInt6082] + this.anIntArray29[local49.anInt6084] + this.anIntArray29[local49.anInt6078]) * 0.3333333F;
				@Pc(125) float local125 = (float) (this.anIntArray28[local49.anInt6084] + this.anIntArray28[local49.anInt6082] + this.anIntArray28[local49.anInt6078]) * 0.3333333F;
				@Pc(139) float local139 = Static112.aFloat28 * local125 + Static589.aFloat196 * local82 + Static467.aFloat177 * local103 + Static550.aFloat188;
				@Pc(153) float local153 = Static287.aFloat182 * local103 + local82 * Static121.aFloat29 + Static227.aFloat72 * local125 + Static330.aFloat119;
				@Pc(167) float local167 = Static516.aFloat185 + local82 * Static414.aFloat148 + local103 * Static21.aFloat8 + local125 * Static3.aFloat1;
				@Pc(188) float local188 = (float) (1.0D / Math.sqrt((double) (local153 * local153 + local139 * local139 + local167 * local167))) * (float) local49.anInt6083;
				local8.method6581(local153 * local188 + (float) local54.anInt9373 - local153, -local167 + local188 * local167, local49.aShort68 * local54.anInt9376 >> 7, local139 + (float) local54.anInt9383 - local139 * local188, local54.anInt9375, local54.anInt9381 * local49.aShort67 >> 7);
				this.aClass100_Sub3_6.method8936(local8);
				@Pc(240) int local240 = local54.anInt9380;
				OpenGL.glColor4ub((byte) (local240 >> 16), (byte) (local240 >> 8), (byte) local240, (byte) (local240 >> 24));
				this.aClass100_Sub3_6.method8895(local49.aShort66);
				this.aClass100_Sub3_6.method8876(local49.aByte70);
				this.aClass100_Sub3_6.method8912(4);
			}
		}
		this.aClass100_Sub3_6.C(true);
		this.aClass100_Sub3_6.method8918();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6854(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class24_Sub1 local8 = (Class24_Sub1) arg0;
		if (this.anInt477 == 0 || local8.anInt477 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt483;
		@Pc(24) int[] local24 = local8.anIntArray25;
		@Pc(27) int[] local27 = local8.anIntArray29;
		@Pc(30) int[] local30 = local8.anIntArray28;
		@Pc(33) short[] local33 = local8.aShortArray2;
		@Pc(36) short[] local36 = local8.aShortArray10;
		@Pc(39) short[] local39 = local8.aShortArray9;
		@Pc(42) byte[] local42 = local8.aByteArray4;
		@Pc(57) short[] local57;
		@Pc(49) short[] local49;
		@Pc(53) short[] local53;
		@Pc(61) byte[] local61;
		if (this.aClass284_1 == null) {
			local53 = null;
			local57 = null;
			local49 = null;
			local61 = null;
		} else {
			local49 = this.aClass284_1.aShortArray121;
			local53 = this.aClass284_1.aShortArray120;
			local57 = this.aClass284_1.aShortArray119;
			local61 = this.aClass284_1.aByteArray96;
		}
		@Pc(78) short[] local78;
		@Pc(80) short[] local80;
		@Pc(76) short[] local76;
		@Pc(82) byte[] local82;
		if (local8.aClass284_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local78 = local8.aClass284_1.aShortArray119;
			local82 = local8.aClass284_1.aByteArray96;
			local76 = local8.aClass284_1.aShortArray120;
			local80 = local8.aClass284_1.aShortArray121;
		}
		@Pc(103) int[] local103 = local8.anIntArray27;
		@Pc(106) short[] local106 = local8.aShortArray5;
		if (!local8.aBoolean20) {
			local8.method467();
		}
		@Pc(115) short local115 = local8.aShort10;
		@Pc(118) short local118 = local8.aShort9;
		@Pc(121) short local121 = local8.aShort5;
		@Pc(124) short local124 = local8.aShort6;
		@Pc(127) short local127 = local8.aShort2;
		@Pc(130) short local130 = local8.aShort8;
		for (@Pc(132) int local132 = 0; local132 < this.anInt483; local132++) {
			@Pc(142) int local142 = this.anIntArray29[local132] - arg2;
			if (local115 <= local142 && local142 <= local118) {
				@Pc(162) int local162 = this.anIntArray25[local132] - arg1;
				if (local162 >= local121 && local162 <= local124) {
					@Pc(178) int local178 = this.anIntArray28[local132] - arg3;
					if (local178 >= local127 && local130 >= local178) {
						@Pc(192) int local192 = -1;
						@Pc(197) int local197 = this.anIntArray27[local132];
						@Pc(204) int local204 = this.anIntArray27[local132 + 1];
						for (@Pc(206) int local206 = local197; local206 < local204; local206++) {
							local192 = this.aShortArray5[local206] - 1;
							if (local192 == -1 || this.aByteArray4[local192] != 0) {
								break;
							}
						}
						if (local192 != -1) {
							for (@Pc(234) int local234 = 0; local234 < local21; local234++) {
								if (local24[local234] == local162 && local30[local234] == local178 && local142 == local27[local234]) {
									@Pc(261) int local261 = -1;
									local197 = local103[local234];
									local204 = local103[local234 + 1];
									for (@Pc(273) int local273 = local197; local273 < local204; local273++) {
										local261 = local106[local273] - 1;
										if (local261 == -1 || local42[local261] != 0) {
											break;
										}
									}
									if (local261 != -1) {
										if (local57 == null) {
											this.aClass284_1 = new Class284();
											local57 = this.aClass284_1.aShortArray119 = Static617.method8623(this.aShortArray2);
											local49 = this.aClass284_1.aShortArray121 = Static617.method8623(this.aShortArray10);
											local53 = this.aClass284_1.aShortArray120 = Static617.method8623(this.aShortArray9);
											local61 = this.aClass284_1.aByteArray96 = Static356.method5694(this.aByteArray4);
										}
										if (local78 == null) {
											@Pc(352) Class284 local352 = local8.aClass284_1 = new Class284();
											local78 = local352.aShortArray119 = Static617.method8623(local33);
											local80 = local352.aShortArray121 = Static617.method8623(local36);
											local76 = local352.aShortArray120 = Static617.method8623(local39);
											local82 = local352.aByteArray96 = Static356.method5694(local42);
										}
										@Pc(385) short local385 = this.aShortArray2[local192];
										@Pc(390) short local390 = this.aShortArray10[local192];
										@Pc(395) short local395 = this.aShortArray9[local192];
										local204 = local103[local234 + 1];
										@Pc(406) byte local406 = this.aByteArray4[local192];
										local197 = local103[local234];
										@Pc(420) int local420;
										for (@Pc(412) int local412 = local197; local412 < local204; local412++) {
											local420 = local106[local412] - 1;
											if (local420 == -1) {
												break;
											}
											if (local82[local420] != 0) {
												local78[local420] += local385;
												local80[local420] += local390;
												local76[local420] += local395;
												local82[local420] += local406;
											}
										}
										local385 = local33[local261];
										local390 = local36[local261];
										local406 = local42[local261];
										local204 = this.anIntArray27[local132 + 1];
										local395 = local39[local261];
										local197 = this.anIntArray27[local132];
										for (local420 = local197; local420 < local204; local420++) {
											@Pc(506) int local506 = this.aShortArray5[local420] - 1;
											if (local506 == -1) {
												break;
											}
											if (local61[local506] != 0) {
												local57[local506] += local385;
												local49[local506] += local390;
												local53[local506] += local395;
												local61[local506] += local406;
											}
										}
										if (this.aClass55_1 == null && this.aClass55_2 != null) {
											this.aClass55_2.anInterface27_2 = null;
										}
										if (this.aClass55_1 != null) {
											this.aClass55_1.anInterface27_2 = null;
										}
										if (local8.aClass55_1 == null && local8.aClass55_2 != null) {
											local8.aClass55_2.anInterface27_2 = null;
										}
										if (local8.aClass55_1 != null) {
											local8.aClass55_1.anInterface27_2 = null;
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

	@OriginalMember(owner = "client!as", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class6_Sub2_Sub16 ba(@OriginalArg(0) Class6_Sub2_Sub16 arg0) {
		if (this.anInt500 == 0) {
			return null;
		}
		if (!this.aBoolean20) {
			this.method467();
		}
		@Pc(39) int local39;
		@Pc(55) int local55;
		if (this.aClass100_Sub3_6.anInt10606 > 0) {
			local39 = this.aShort5 - (this.aShort9 * this.aClass100_Sub3_6.anInt10606 >> 8) >> this.aClass100_Sub3_6.anInt10587;
			local55 = this.aShort6 - (this.aClass100_Sub3_6.anInt10606 * this.aShort10 >> 8) >> this.aClass100_Sub3_6.anInt10587;
		} else {
			local39 = this.aShort5 - (this.aClass100_Sub3_6.anInt10606 * this.aShort10 >> 8) >> this.aClass100_Sub3_6.anInt10587;
			local55 = this.aShort6 - (this.aShort9 * this.aClass100_Sub3_6.anInt10606 >> 8) >> this.aClass100_Sub3_6.anInt10587;
		}
		@Pc(115) int local115;
		@Pc(132) int local132;
		if (this.aClass100_Sub3_6.anInt10615 > 0) {
			local115 = this.aShort2 - (this.aClass100_Sub3_6.anInt10615 * this.aShort9 >> 8) >> this.aClass100_Sub3_6.anInt10587;
			local132 = this.aShort8 - (this.aClass100_Sub3_6.anInt10615 * this.aShort10 >> 8) >> this.aClass100_Sub3_6.anInt10587;
		} else {
			local115 = this.aShort2 - (this.aClass100_Sub3_6.anInt10615 * this.aShort10 >> 8) >> this.aClass100_Sub3_6.anInt10587;
			local132 = this.aShort8 - (this.aClass100_Sub3_6.anInt10615 * this.aShort9 >> 8) >> this.aClass100_Sub3_6.anInt10587;
		}
		@Pc(175) int local175 = local55 + 1 - local39;
		@Pc(182) int local182 = local132 + 1 - local115;
		@Pc(185) Class6_Sub2_Sub16_Sub1 local185 = (Class6_Sub2_Sub16_Sub1) arg0;
		@Pc(195) Class6_Sub2_Sub16_Sub1 local195;
		if (local185 != null && local185.method6386(local175, local182)) {
			local195 = local185;
			local185.method6385();
		} else {
			local195 = new Class6_Sub2_Sub16_Sub1(this.aClass100_Sub3_6, local175, local182);
		}
		local195.method6388(local55, local132, local39, local115);
		this.method458(local195);
		return local195;
	}

	@OriginalMember(owner = "client!as", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass100_Sub3_6.anInterface4_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt477; local11++) {
			if (this.aShortArray6[local11] == arg0) {
				this.aShortArray6[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class325 local48 = local9.method895(arg0 & 0xFFFF);
			local37 = local48.aByte117;
			local35 = local48.aByte113;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(68) Class325 local68 = local9.method895(arg1 & 0xFFFF);
			if (local68.aByte116 != 0 || local68.aByte111 != 0) {
				this.aBoolean19 = true;
			}
			local58 = local68.aByte117;
			local56 = local68.aByte113;
		}
		if (!(local56 != local35 | local37 != local58)) {
			return;
		}
		if (this.aClass193Array1 != null) {
			for (@Pc(106) int local106 = 0; local106 < this.anInt532; local106++) {
				@Pc(113) Class193 local113 = this.aClass193Array1[local106];
				@Pc(118) Class326 local118 = this.aClass326Array1[local106];
				local118.anInt9380 = Static91.anIntArray99[this.aShortArray4[local113.anInt6079] & 0xFFFF] & 0xFFFFFF | local118.anInt9380 & 0xFF000000;
			}
		}
		if (this.aClass55_2 != null) {
			this.aClass55_2.anInterface27_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ql;Lclient!eda;I)V")
	@Override
	public void method6862(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class20_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt500 == 0) {
			return;
		}
		@Pc(13) Class154_Sub3 local13 = this.aClass100_Sub3_6.aClass154_Sub3_3;
		@Pc(16) Class154_Sub3 local16 = (Class154_Sub3) arg0;
		if (!this.aBoolean20) {
			this.method467();
		}
		Static516.aFloat185 = local13.aFloat159 * local16.aFloat156 + local16.aFloat160 * local13.aFloat154 + local16.aFloat152 * local13.aFloat158 + local13.aFloat152;
		Static21.aFloat8 = local13.aFloat154 * local16.aFloat153 + local16.aFloat155 * local13.aFloat159 + local13.aFloat158 * local16.aFloat154;
		@Pc(69) float local69 = (float) this.aShort10 * Static21.aFloat8 + Static516.aFloat185;
		@Pc(77) float local77 = (float) this.aShort9 * Static21.aFloat8 + Static516.aFloat185;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local94 = (float) -this.aShort7 + local77;
			local87 = (float) this.aShort7 + local69;
		} else {
			local87 = local77 + (float) this.aShort7;
			local94 = (float) -this.aShort7 + local69;
		}
		if (this.aClass100_Sub3_6.aFloat212 <= local94 || (float) this.aClass100_Sub3_6.anInt10628 >= local87) {
			return;
		}
		Static550.aFloat188 = local13.aFloat156 + local13.aFloat161 * local16.aFloat152 + local16.aFloat160 * local13.aFloat155 + local16.aFloat156 * local13.aFloat151;
		Static467.aFloat177 = local16.aFloat153 * local13.aFloat155 + local16.aFloat155 * local13.aFloat151 + local13.aFloat161 * local16.aFloat154;
		@Pc(171) float local171 = Static467.aFloat177 * (float) this.aShort10 + Static550.aFloat188;
		@Pc(179) float local179 = Static550.aFloat188 + (float) this.aShort9 * Static467.aFloat177;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local171 > local179) {
			local205 = ((float) this.aShort7 + local171) * (float) this.aClass100_Sub3_6.anInt10613;
			local194 = (float) this.aClass100_Sub3_6.anInt10613 * ((float) -this.aShort7 + local179);
		} else {
			local194 = (local171 - (float) this.aShort7) * (float) this.aClass100_Sub3_6.anInt10613;
			local205 = ((float) this.aShort7 + local179) * (float) this.aClass100_Sub3_6.anInt10613;
		}
		if (local194 / local87 >= this.aClass100_Sub3_6.aFloat224 || this.aClass100_Sub3_6.aFloat223 >= local205 / local87) {
			return;
		}
		Static330.aFloat119 = local13.aFloat160 + local13.aFloat150 * local16.aFloat152 + local13.aFloat153 * local16.aFloat160 + local16.aFloat156 * local13.aFloat157;
		Static287.aFloat182 = local13.aFloat157 * local16.aFloat155 + local16.aFloat153 * local13.aFloat153 + local16.aFloat154 * local13.aFloat150;
		@Pc(295) float local295 = Static330.aFloat119 + (float) this.aShort10 * Static287.aFloat182;
		@Pc(303) float local303 = (float) this.aShort9 * Static287.aFloat182 + Static330.aFloat119;
		@Pc(329) float local329;
		@Pc(318) float local318;
		if (local295 > local303) {
			local329 = (local303 - (float) this.aShort7) * (float) this.aClass100_Sub3_6.anInt10614;
			local318 = (float) this.aClass100_Sub3_6.anInt10614 * (local295 + (float) this.aShort7);
		} else {
			local318 = (local303 + (float) this.aShort7) * (float) this.aClass100_Sub3_6.anInt10614;
			local329 = (local295 - (float) this.aShort7) * (float) this.aClass100_Sub3_6.anInt10614;
		}
		if (local329 / local87 >= this.aClass100_Sub3_6.aFloat216 || local318 / local87 <= this.aClass100_Sub3_6.aFloat229) {
			return;
		}
		if (arg1 != null || this.aClass193Array1 != null) {
			Static121.aFloat29 = local16.aFloat159 * local13.aFloat150 + local16.aFloat151 * local13.aFloat157 + local16.aFloat157 * local13.aFloat153;
			Static3.aFloat1 = local13.aFloat154 * local16.aFloat150 + local16.aFloat161 * local13.aFloat159 + local13.aFloat158 * local16.aFloat158;
			Static589.aFloat196 = local13.aFloat161 * local16.aFloat159 + local16.aFloat157 * local13.aFloat155 + local16.aFloat151 * local13.aFloat151;
			Static227.aFloat72 = local16.aFloat161 * local13.aFloat157 + local13.aFloat153 * local16.aFloat150 + local13.aFloat150 * local16.aFloat158;
			Static414.aFloat148 = local13.aFloat158 * local16.aFloat159 + local13.aFloat154 * local16.aFloat157 + local13.aFloat159 * local16.aFloat151;
			Static112.aFloat28 = local13.aFloat151 * local16.aFloat161 + local13.aFloat155 * local16.aFloat150 + local13.aFloat161 * local16.aFloat158;
		}
		if (arg1 != null) {
			@Pc(488) boolean local488 = false;
			@Pc(490) boolean local490 = true;
			@Pc(499) int local499 = this.aShort5 + this.aShort6 >> 1;
			@Pc(508) int local508 = this.aShort2 + this.aShort8 >> 1;
			@Pc(527) int local527 = (int) ((float) local508 * Static112.aFloat28 + Static467.aFloat177 * (float) this.aShort10 + Static550.aFloat188 + Static589.aFloat196 * (float) local499);
			@Pc(546) int local546 = (int) (Static227.aFloat72 * (float) local508 + Static330.aFloat119 + (float) local499 * Static121.aFloat29 + Static287.aFloat182 * (float) this.aShort10);
			@Pc(565) int local565 = (int) (Static414.aFloat148 * (float) local499 + Static516.aFloat185 + Static21.aFloat8 * (float) this.aShort10 + (float) local508 * Static3.aFloat1);
			if (this.aClass100_Sub3_6.anInt10628 > local565) {
				local488 = true;
			} else {
				arg1.anInt2368 = this.aClass100_Sub3_6.anInt10607 + this.aClass100_Sub3_6.anInt10614 * local546 / local565;
				arg1.anInt2369 = this.aClass100_Sub3_6.anInt10621 + local527 * this.aClass100_Sub3_6.anInt10613 / local565;
			}
			@Pc(621) int local621 = (int) (Static112.aFloat28 * (float) local508 + Static589.aFloat196 * (float) local499 + Static550.aFloat188 + (float) this.aShort9 * Static467.aFloat177);
			@Pc(640) int local640 = (int) (Static227.aFloat72 * (float) local508 + Static330.aFloat119 + (float) local499 * Static121.aFloat29 + (float) this.aShort9 * Static287.aFloat182);
			@Pc(659) int local659 = (int) ((float) local508 * Static3.aFloat1 + (float) this.aShort9 * Static21.aFloat8 + Static414.aFloat148 * (float) local499 + Static516.aFloat185);
			if (local659 < this.aClass100_Sub3_6.anInt10628) {
				local488 = true;
			} else {
				arg1.anInt2370 = this.aClass100_Sub3_6.anInt10621 + this.aClass100_Sub3_6.anInt10613 * local621 / local659;
				arg1.anInt2371 = this.aClass100_Sub3_6.anInt10607 + this.aClass100_Sub3_6.anInt10614 * local640 / local659;
			}
			if (local488) {
				if (local565 < this.aClass100_Sub3_6.anInt10628 && local659 < this.aClass100_Sub3_6.anInt10628) {
					local490 = false;
				} else {
					@Pc(735) int local735;
					@Pc(745) int local745;
					@Pc(772) int local772;
					if (this.aClass100_Sub3_6.anInt10628 > local565) {
						local735 = (local659 - this.aClass100_Sub3_6.anInt10628 << 16) / (local659 - local565);
						local745 = ((local621 - local527) * local735 >> 16) + local621;
						arg1.anInt2369 = this.aClass100_Sub3_6.anInt10613 * local745 / this.aClass100_Sub3_6.anInt10628 + this.aClass100_Sub3_6.anInt10621;
						local772 = local640 + (local735 * (local640 - local546) >> 16);
						arg1.anInt2368 = local772 * this.aClass100_Sub3_6.anInt10614 / this.aClass100_Sub3_6.anInt10628 + this.aClass100_Sub3_6.anInt10607;
					} else if (local659 < this.aClass100_Sub3_6.anInt10628) {
						local735 = (local565 - this.aClass100_Sub3_6.anInt10628 << 16) / (local565 - local659);
						local745 = (local735 * (local527 - local621) >> 16) + local527;
						local772 = local546 + ((local546 - local640) * local735 >> 16);
						arg1.anInt2369 = this.aClass100_Sub3_6.anInt10613 * local745 / this.aClass100_Sub3_6.anInt10628 + this.aClass100_Sub3_6.anInt10621;
						arg1.anInt2368 = this.aClass100_Sub3_6.anInt10607 + this.aClass100_Sub3_6.anInt10614 * local772 / this.aClass100_Sub3_6.anInt10628;
					}
				}
			}
			if (local490) {
				if (local565 <= local659) {
					arg1.anInt2367 = this.aClass100_Sub3_6.anInt10613 * (this.aShort7 + local621) / local659 + this.aClass100_Sub3_6.anInt10621 - arg1.anInt2370;
				} else {
					arg1.anInt2367 = this.aClass100_Sub3_6.anInt10613 * (this.aShort7 + local527) / local565 + this.aClass100_Sub3_6.anInt10621 - arg1.anInt2369;
				}
				arg1.aBoolean175 = true;
			}
		}
		this.aClass100_Sub3_6.method8886();
		this.aClass100_Sub3_6.method8915(local16);
		this.method471();
		this.aClass100_Sub3_6.method8918();
		this.method461();
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "()[Lclient!ol;")
	@Override
	public Class243[] method6865() {
		return this.aClass243Array1;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZ)V")
	private void method462(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass55_2 != null && this.aClass55_2.anInterface27_2 == null;
		@Pc(27) boolean local27 = this.aClass55_1 != null && this.aClass55_1.anInterface27_2 == null;
		@Pc(38) boolean local38 = this.aClass55_3 != null && this.aClass55_3.anInterface27_2 == null;
		@Pc(49) boolean local49 = this.aClass55_4 != null && this.aClass55_4.anInterface27_2 == null;
		if (arg0) {
			local27 &= (this.aByte6 & 0x4) != 0;
			local16 &= (this.aByte6 & 0x2) != 0;
			local49 &= (this.aByte6 & 0x8) != 0;
			local38 &= (this.aByte6 & 0x1) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		@Pc(111) byte local111 = 0;
		if (local38) {
			local103 = 12;
		}
		if (local16) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local109 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local111 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (this.aClass100_Sub3_6.aClass6_Sub40_Sub1_3.aByteArray113.length >= this.anInt500 * local103) {
			this.aClass100_Sub3_6.aClass6_Sub40_Sub1_3.anInt10169 = 0;
		} else {
			this.aClass100_Sub3_6.aClass6_Sub40_Sub1_3 = new Class6_Sub40_Sub1(local103 * (this.anInt500 + 100));
		}
		@Pc(183) Class6_Sub40_Sub1 local183 = this.aClass100_Sub3_6.aClass6_Sub40_Sub1_3;
		@Pc(191) int local191;
		@Pc(200) int local200;
		@Pc(228) int local228;
		@Pc(237) int local237;
		if (local38) {
			@Pc(207) int local207;
			@Pc(214) int local214;
			@Pc(219) int local219;
			@Pc(226) int local226;
			if (this.aClass100_Sub3_6.aBoolean700) {
				for (local191 = 0; local191 < this.anInt483; local191++) {
					local200 = Stream.floatToRawIntBits((float) this.anIntArray25[local191]);
					local207 = Stream.floatToRawIntBits((float) this.anIntArray29[local191]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray28[local191]);
					local219 = this.anIntArray27[local191];
					local226 = this.anIntArray27[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray5[local228] - 1;
						if (local237 == -1) {
							break;
						}
						local183.anInt10169 = local103 * local237;
						local183.method8554(local200);
						local183.method8554(local207);
						local183.method8554(local214);
					}
				}
			} else {
				for (local191 = 0; local191 < this.anInt483; local191++) {
					local200 = Stream.floatToRawIntBits((float) this.anIntArray25[local191]);
					local207 = Stream.floatToRawIntBits((float) this.anIntArray29[local191]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray28[local191]);
					local219 = this.anIntArray27[local191];
					local226 = this.anIntArray27[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray5[local228] - 1;
						if (local237 == -1) {
							break;
						}
						local183.anInt10169 = local237 * local103;
						local183.method8598(local200);
						local183.method8598(local207);
						local183.method8598(local214);
					}
				}
			}
		}
		@Pc(545) float local545;
		@Pc(429) short[] local429;
		@Pc(432) short[] local432;
		@Pc(435) short[] local435;
		@Pc(438) byte[] local438;
		@Pc(586) float local586;
		if (local16) {
			if (this.aClass55_1 == null) {
				if (this.aClass284_1 == null) {
					local429 = this.aShortArray2;
					local432 = this.aShortArray10;
					local435 = this.aShortArray9;
					local438 = this.aByteArray4;
				} else {
					local435 = this.aClass284_1.aShortArray120;
					local429 = this.aClass284_1.aShortArray119;
					local432 = this.aClass284_1.aShortArray121;
					local438 = this.aClass284_1.aByteArray96;
				}
				@Pc(462) float local462 = this.aClass100_Sub3_6.aFloatArray80[0];
				@Pc(468) float local468 = this.aClass100_Sub3_6.aFloatArray80[1];
				@Pc(474) float local474 = this.aClass100_Sub3_6.aFloatArray80[2];
				@Pc(478) float local478 = this.aClass100_Sub3_6.aFloat219;
				@Pc(488) float local488 = this.aClass100_Sub3_6.aFloat228 * 768.0F / (float) this.aShort4;
				@Pc(498) float local498 = this.aClass100_Sub3_6.aFloat225 * 768.0F / (float) this.aShort4;
				for (@Pc(500) int local500 = 0; local500 < this.anInt477; local500++) {
					@Pc(520) int local520 = this.method459(this.aByteArray5[local500], this.aShortArray6[local500], this.aShortArray4[local500], this.aShort1);
					@Pc(529) float local529 = (float) (local520 >>> 24) * this.aClass100_Sub3_6.aFloat221;
					@Pc(534) short local534 = this.lb[local500];
					local545 = (float) (local520 >> 16 & 0xFF) * this.aClass100_Sub3_6.aFloat222;
					@Pc(556) float local556 = this.aClass100_Sub3_6.aFloat217 * (float) (local520 >> 8 & 0xFF);
					@Pc(561) short local561 = (short) local438[local534];
					if (local561 == 0) {
						local586 = (local468 * (float) local432[local534] + local462 * (float) local429[local534] + (float) local435[local534] * local474) * 0.0026041667F;
					} else {
						local586 = ((float) local432[local534] * local468 + local462 * (float) local429[local534] + local474 * (float) local435[local534]) / (float) (local561 * 256);
					}
					@Pc(626) float local626 = local478 + (local586 < 0.0F ? local498 : local488) * local586;
					@Pc(631) int local631 = (int) (local529 * local626);
					@Pc(636) int local636 = (int) (local545 * local626);
					if (local631 < 0) {
						local631 = 0;
					} else if (local631 > 255) {
						local631 = 255;
					}
					@Pc(652) int local652 = (int) (local626 * local556);
					if (local636 < 0) {
						local636 = 0;
					} else if (local636 > 255) {
						local636 = 255;
					}
					local183.anInt10169 = local103 * local534 + local107;
					if (local652 < 0) {
						local652 = 0;
					} else if (local652 > 255) {
						local652 = 255;
					}
					local183.method8589(local631);
					local183.method8589(local636);
					local183.method8589(local652);
					local183.method8589(255 - (this.aByteArray5[local500] & 0xFF));
					local534 = this.aShortArray8[local500];
					local561 = (short) local438[local534];
					if (local561 == 0) {
						local586 = (local474 * (float) local435[local534] + (float) local429[local534] * local462 + (float) local432[local534] * local468) * 0.0026041667F;
					} else {
						local586 = (local474 * (float) local435[local534] + local462 * (float) local429[local534] + local468 * (float) local432[local534]) / (float) (local561 * 256);
					}
					local626 = local586 * (local586 < 0.0F ? local498 : local488) + local478;
					local631 = (int) (local529 * local626);
					local636 = (int) (local545 * local626);
					if (local631 < 0) {
						local631 = 0;
					} else if (local631 > 255) {
						local631 = 255;
					}
					if (local636 < 0) {
						local636 = 0;
					} else if (local636 > 255) {
						local636 = 255;
					}
					local652 = (int) (local626 * local556);
					local183.anInt10169 = local107 + local534 * local103;
					if (local652 < 0) {
						local652 = 0;
					} else if (local652 > 255) {
						local652 = 255;
					}
					local183.method8589(local631);
					local183.method8589(local636);
					local183.method8589(local652);
					local183.method8589(255 - (this.aByteArray5[local500] & 0xFF));
					local534 = this.aShortArray7[local500];
					local561 = (short) local438[local534];
					if (local561 == 0) {
						local586 = ((float) local435[local534] * local474 + local462 * (float) local429[local534] + local468 * (float) local432[local534]) * 0.0026041667F;
					} else {
						local586 = (local468 * (float) local432[local534] + (float) local429[local534] * local462 + local474 * (float) local435[local534]) / (float) (local561 * 256);
					}
					local626 = (local586 < 0.0F ? local498 : local488) * local586 + local478;
					local631 = (int) (local529 * local626);
					if (local631 < 0) {
						local631 = 0;
					} else if (local631 > 255) {
						local631 = 255;
					}
					local636 = (int) (local545 * local626);
					if (local636 < 0) {
						local636 = 0;
					} else if (local636 > 255) {
						local636 = 255;
					}
					local652 = (int) (local626 * local556);
					if (local652 < 0) {
						local652 = 0;
					} else if (local652 > 255) {
						local652 = 255;
					}
					local183.anInt10169 = local534 * local103 + local107;
					local183.method8589(local631);
					local183.method8589(local636);
					local183.method8589(local652);
					local183.method8589(255 - (this.aByteArray5[local500] & 0xFF));
				}
			} else {
				for (local191 = 0; local191 < this.anInt477; local191++) {
					local200 = this.method459(this.aByteArray5[local191], this.aShortArray6[local191], this.aShortArray4[local191], this.aShort1);
					local183.anInt10169 = local107 + this.lb[local191] * local103;
					local183.method8554(local200);
					local183.anInt10169 = local103 * this.aShortArray8[local191] + local107;
					local183.method8554(local200);
					local183.anInt10169 = local107 + local103 * this.aShortArray7[local191];
					local183.method8554(local200);
				}
			}
		}
		if (local27) {
			if (this.aClass284_1 == null) {
				local429 = this.aShortArray2;
				local432 = this.aShortArray10;
				local435 = this.aShortArray9;
				local438 = this.aByteArray4;
			} else {
				local432 = this.aClass284_1.aShortArray121;
				local438 = this.aClass284_1.aByteArray96;
				local435 = this.aClass284_1.aShortArray120;
				local429 = this.aClass284_1.aShortArray119;
			}
			@Pc(1078) float local1078 = 3.0F / (float) this.aShort4;
			local586 = 3.0F / (float) (this.aShort4 / 2 + this.aShort4);
			local183.anInt10169 = local109;
			if (this.aClass100_Sub3_6.aBoolean700) {
				for (local228 = 0; local228 < this.anInt500; local228++) {
					local237 = local438[local228] & 0xFF;
					if (local237 == 0) {
						local183.method7692((float) local429[local228] * local586);
						local183.method7692((float) local432[local228] * local586);
						local183.method7692(local586 * (float) local435[local228]);
					} else {
						local545 = local1078 / (float) local237;
						local183.method7692(local545 * (float) local429[local228]);
						local183.method7692((float) local432[local228] * local545);
						local183.method7692(local545 * (float) local435[local228]);
					}
					local183.anInt10169 += local103 - 12;
				}
			} else {
				for (local228 = 0; local228 < this.anInt500; local228++) {
					local237 = local438[local228] & 0xFF;
					if (local237 == 0) {
						local183.method7691(local586 * (float) local429[local228]);
						local183.method7691(local586 * (float) local432[local228]);
						local183.method7691((float) local435[local228] * local586);
					} else {
						local545 = local1078 / (float) local237;
						local183.method7691((float) local429[local228] * local545);
						local183.method7691((float) local432[local228] * local545);
						local183.method7691(local545 * (float) local435[local228]);
					}
					local183.anInt10169 += local103 - 12;
				}
			}
		}
		if (local49) {
			local183.anInt10169 = local111;
			if (this.aClass100_Sub3_6.aBoolean700) {
				for (local191 = 0; local191 < this.anInt500; local191++) {
					local183.method7692(this.aFloatArray2[local191]);
					local183.method7692(this.aFloatArray1[local191]);
					local183.anInt10169 += local103 - 8;
				}
			} else {
				for (local191 = 0; local191 < this.anInt500; local191++) {
					local183.method7691(this.aFloatArray2[local191]);
					local183.method7691(this.aFloatArray1[local191]);
					local183.anInt10169 += local103 - 8;
				}
			}
		}
		local183.anInt10169 = this.anInt500 * local103;
		@Pc(1377) Interface27 local1377;
		if (arg0) {
			if (this.anInterface27_1 == null) {
				this.anInterface27_1 = this.aClass100_Sub3_6.method8883(true, local183.aByteArray113, local183.anInt10169, local103);
			} else {
				this.anInterface27_1.method4867(local103, local183.anInt10169, local183.aByteArray113);
			}
			local1377 = this.anInterface27_1;
			this.aByte6 = 0;
		} else {
			local1377 = this.aClass100_Sub3_6.method8883(false, local183.aByteArray113, local183.anInt10169, local103);
			this.aBoolean21 = true;
		}
		if (local38) {
			this.aClass55_3.anInterface27_2 = local1377;
			this.aClass55_3.aByte36 = 0;
		}
		if (local49) {
			this.aClass55_4.aByte36 = local111;
			this.aClass55_4.anInterface27_2 = local1377;
		}
		if (local16) {
			this.aClass55_2.anInterface27_2 = local1377;
			this.aClass55_2.aByte36 = local107;
		}
		if (local27) {
			this.aClass55_1.aByte36 = local109;
			this.aClass55_1.anInterface27_2 = local1377;
		}
	}

	@OriginalMember(owner = "client!as", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort4 = (short) arg0;
		if (this.aClass55_2 != null) {
			this.aClass55_2.anInterface27_2 = null;
		}
		if (this.aClass55_1 != null) {
			this.aClass55_1.anInterface27_2 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean22;
	}

	@OriginalMember(owner = "client!as", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local24 = 0;
			Static648.anInt10737 = 0;
			Static125.anInt10760 = 0;
			Static300.anInt5838 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray4.length) {
					local48 = this.anIntArrayArray4[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray3 == null || (this.aShortArray3[local56] & arg6) != 0) {
							Static648.anInt10737 += this.anIntArray25[local56];
							Static300.anInt5838 += this.anIntArray29[local56];
							local24++;
							Static125.anInt10760 += this.anIntArray28[local56];
						}
					}
				}
			}
			if (local24 > 0) {
				Static566.aBoolean661 = true;
				Static125.anInt10760 = arg4 + Static125.anInt10760 / local24;
				Static648.anInt10737 = Static648.anInt10737 / local24 + arg2;
				Static300.anInt5838 = Static300.anInt5838 / local24 + arg3;
			} else {
				Static125.anInt10760 = arg4;
				Static300.anInt5838 = arg3;
				Static648.anInt10737 = arg2;
			}
			return;
		}
		@Pc(248) int[] local248;
		@Pc(250) int local250;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg7[0] * arg2 + arg7[1] * arg3 + arg4 * arg7[2] + 8192 >> 14;
				local32 = arg7[4] * arg3 + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
				local38 = arg4 * arg7[8] + arg3 * arg7[7] + arg2 * arg7[6] + 8192 >> 14;
				arg2 = local24;
				arg3 = local32;
				arg4 = local38;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray4.length) {
					local248 = this.anIntArrayArray4[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local50 = local248[local250];
						if (this.aShortArray3 == null || (arg6 & this.aShortArray3[local50]) != 0) {
							this.anIntArray25[local50] += arg2;
							this.anIntArray29[local50] += arg3;
							this.anIntArray28[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(369) int local369;
		@Pc(392) int local392;
		@Pc(415) int local415;
		@Pc(450) int local450;
		@Pc(454) int local454;
		@Pc(458) int local458;
		@Pc(462) int local462;
		@Pc(470) int local470;
		@Pc(478) int local478;
		@Pc(636) int local636;
		@Pc(662) int local662;
		@Pc(666) int local666;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(683) int local683;
		@Pc(687) int local687;
		@Pc(689) int local689;
		@Pc(818) int[] local818;
		@Pc(820) int local820;
		@Pc(824) int local824;
		@Pc(828) int local828;
		@Pc(830) int local830;
		@Pc(958) int local958;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray4.length) {
						local248 = this.anIntArrayArray4[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local50 = local248[local250];
							if (this.aShortArray3 == null || (this.aShortArray3[local50] & arg6) != 0) {
								this.anIntArray25[local50] -= Static648.anInt10737;
								this.anIntArray29[local50] -= Static300.anInt5838;
								this.anIntArray28[local50] -= Static125.anInt10760;
								if (arg4 != 0) {
									local56 = Class100_Sub1.anIntArray428[arg4];
									local369 = Class100_Sub1.anIntArray429[arg4];
									local392 = local56 * this.anIntArray29[local50] + local369 * this.anIntArray25[local50] + 16383 >> 14;
									this.anIntArray29[local50] = this.anIntArray29[local50] * local369 + 16383 - this.anIntArray25[local50] * local56 >> 14;
									this.anIntArray25[local50] = local392;
								}
								if (arg2 != 0) {
									local56 = Class100_Sub1.anIntArray428[arg2];
									local369 = Class100_Sub1.anIntArray429[arg2];
									local392 = local369 * this.anIntArray29[local50] + 16383 - this.anIntArray28[local50] * local56 >> 14;
									this.anIntArray28[local50] = local369 * this.anIntArray28[local50] + local56 * this.anIntArray29[local50] + 16383 >> 14;
									this.anIntArray29[local50] = local392;
								}
								if (arg3 != 0) {
									local56 = Class100_Sub1.anIntArray428[arg3];
									local369 = Class100_Sub1.anIntArray429[arg3];
									local392 = this.anIntArray28[local50] * local56 + local369 * this.anIntArray25[local50] + 16383 >> 14;
									this.anIntArray28[local50] = this.anIntArray28[local50] * local369 + 16383 - this.anIntArray25[local50] * local56 >> 14;
									this.anIntArray25[local50] = local392;
								}
								this.anIntArray25[local50] += Static648.anInt10737;
								this.anIntArray29[local50] += Static300.anInt5838;
								this.anIntArray28[local50] += Static125.anInt10760;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray4.length > local38) {
							local48 = this.anIntArrayArray4[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray3 == null || (arg6 & this.aShortArray3[local56]) != 0) {
									local369 = this.anIntArray27[local56];
									local392 = this.anIntArray27[local56 + 1];
									for (local415 = local369; local415 < local392; local415++) {
										local450 = this.aShortArray5[local415] - 1;
										if (local450 == -1) {
											break;
										}
										if (arg4 != 0) {
											local454 = Class100_Sub1.anIntArray428[arg4];
											local458 = Class100_Sub1.anIntArray429[arg4];
											local462 = this.aShortArray2[local450] * local458 + local454 * this.aShortArray10[local450] + 16383 >> 14;
											this.aShortArray10[local450] = (short) (local458 * this.aShortArray10[local450] + 16383 - local454 * this.aShortArray2[local450] >> 14);
											this.aShortArray2[local450] = (short) local462;
										}
										if (arg2 != 0) {
											local454 = Class100_Sub1.anIntArray428[arg2];
											local458 = Class100_Sub1.anIntArray429[arg2];
											local462 = local458 * this.aShortArray10[local450] + 16383 - local454 * this.aShortArray9[local450] >> 14;
											this.aShortArray9[local450] = (short) (this.aShortArray10[local450] * local454 + this.aShortArray9[local450] * local458 + 16383 >> 14);
											this.aShortArray10[local450] = (short) local462;
										}
										if (arg3 != 0) {
											local454 = Class100_Sub1.anIntArray428[arg3];
											local458 = Class100_Sub1.anIntArray429[arg3];
											local462 = local454 * this.aShortArray9[local450] + this.aShortArray2[local450] * local458 + 16383 >> 14;
											this.aShortArray9[local450] = (short) (local458 * this.aShortArray9[local450] + 16383 - this.aShortArray2[local450] * local454 >> 14);
											this.aShortArray2[local450] = (short) local462;
										}
									}
								}
							}
						}
					}
					if (this.aClass55_1 == null && this.aClass55_2 != null) {
						this.aClass55_2.anInterface27_2 = null;
					}
					if (this.aClass55_1 != null) {
						this.aClass55_1.anInterface27_2 = null;
					}
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local250 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static566.aBoolean661) {
					local369 = arg7[0] * Static648.anInt10737 + Static300.anInt5838 * arg7[3] + Static125.anInt10760 * arg7[6] + 8192 >> 14;
					local392 = arg7[7] * Static125.anInt10760 + arg7[1] * Static648.anInt10737 + arg7[4] * Static300.anInt5838 + 8192 >> 14;
					local415 = arg7[2] * Static648.anInt10737 + Static300.anInt5838 * arg7[5] + arg7[8] * Static125.anInt10760 + 8192 >> 14;
					local369 += local250;
					local392 += local50;
					Static300.anInt5838 = local392;
					Static648.anInt10737 = local369;
					local415 += local56;
					Static566.aBoolean661 = false;
					Static125.anInt10760 = local415;
				}
				@Pc(438) int[] local438 = new int[9];
				local392 = Class100_Sub1.anIntArray429[arg2];
				local415 = Class100_Sub1.anIntArray428[arg2];
				local450 = Class100_Sub1.anIntArray429[arg3];
				local454 = Class100_Sub1.anIntArray428[arg3];
				local458 = Class100_Sub1.anIntArray429[arg4];
				local462 = Class100_Sub1.anIntArray428[arg4];
				local470 = local415 * local458 + 8192 >> 14;
				local478 = local462 * local415 + 8192 >> 14;
				local438[2] = local392 * local454 + 8192 >> 14;
				local438[5] = -local415;
				local438[6] = -local454 * local458 + local478 * local450 + 8192 >> 14;
				local438[1] = local470 * local454 + -local450 * local462 + 8192 >> 14;
				local438[7] = local462 * local454 + local450 * local470 + 8192 >> 14;
				local438[0] = local454 * local478 + local450 * local458 + 8192 >> 14;
				local438[8] = local450 * local392 + 8192 >> 14;
				local438[3] = local392 * local462 + 8192 >> 14;
				local438[4] = local392 * local458 + 8192 >> 14;
				@Pc(610) int local610 = local438[0] * -Static648.anInt10737 + -Static300.anInt5838 * local438[1] + -Static125.anInt10760 * local438[2] + 8192 >> 14;
				local636 = -Static648.anInt10737 * local438[3] + local438[4] * -Static300.anInt5838 + local438[5] * -Static125.anInt10760 + 8192 >> 14;
				local662 = local438[8] * -Static125.anInt10760 + local438[6] * -Static648.anInt10737 + -Static300.anInt5838 * local438[7] + 8192 >> 14;
				local666 = Static648.anInt10737 + local610;
				@Pc(670) int local670 = local636 + Static300.anInt5838;
				local674 = Static125.anInt10760 + local662;
				@Pc(677) int[] local677 = new int[9];
				for (local679 = 0; local679 < 3; local679++) {
					for (local683 = 0; local683 < 3; local683++) {
						local687 = 0;
						for (local689 = 0; local689 < 3; local689++) {
							local687 += local438[local679 * 3 + local689] * arg7[local683 * 3 + local689];
						}
						local677[local679 * 3 + local683] = local687 + 8192 >> 14;
					}
				}
				local683 = local438[0] * local250 + local50 * local438[1] + local438[2] * local56 + 8192 >> 14;
				local687 = local438[5] * local56 + local250 * local438[3] + local438[4] * local50 + 8192 >> 14;
				local689 = local438[7] * local50 + local438[6] * local250 + local438[8] * local56 + 8192 >> 14;
				local683 += local666;
				local687 += local670;
				local689 += local674;
				local818 = new int[9];
				for (local820 = 0; local820 < 3; local820++) {
					for (local824 = 0; local824 < 3; local824++) {
						local828 = 0;
						for (local830 = 0; local830 < 3; local830++) {
							local828 += arg7[local830 + local820 * 3] * local677[local824 + local830 * 3];
						}
						local818[local824 + local820 * 3] = local828 + 8192 >> 14;
					}
				}
				local824 = local689 * arg7[2] + arg7[0] * local683 + arg7[1] * local687 + 8192 >> 14;
				local828 = local689 * arg7[5] + arg7[4] * local687 + local683 * arg7[3] + 8192 >> 14;
				local824 += local24;
				local828 += local32;
				local830 = arg7[8] * local689 + arg7[6] * local683 + local687 * arg7[7] + 8192 >> 14;
				local830 += local38;
				for (local958 = 0; local958 < local8; local958++) {
					@Pc(964) int local964 = arg1[local958];
					if (this.anIntArrayArray4.length > local964) {
						@Pc(974) int[] local974 = this.anIntArrayArray4[local964];
						for (@Pc(976) int local976 = 0; local976 < local974.length; local976++) {
							@Pc(982) int local982 = local974[local976];
							if (this.aShortArray3 == null || (arg6 & this.aShortArray3[local982]) != 0) {
								@Pc(1026) int local1026 = this.anIntArray25[local982] * local818[0] + this.anIntArray29[local982] * local818[1] + local818[2] * this.anIntArray28[local982] + 8192 >> 14;
								@Pc(1057) int local1057 = local818[5] * this.anIntArray28[local982] + this.anIntArray29[local982] * local818[4] + local818[3] * this.anIntArray25[local982] + 8192 >> 14;
								@Pc(1061) int local1061 = local1026 + local824;
								@Pc(1093) int local1093 = local818[6] * this.anIntArray25[local982] + local818[7] * this.anIntArray29[local982] + this.anIntArray28[local982] * local818[8] + 8192 >> 14;
								@Pc(1097) int local1097 = local1057 + local828;
								this.anIntArray25[local982] = local1061;
								@Pc(1106) int local1106 = local1093 + local830;
								this.anIntArray29[local982] = local1097;
								this.anIntArray28[local982] = local1106;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2605) Class193 local2605;
			@Pc(2610) Class326 local2610;
			if (arg0 == 5) {
				if (this.anIntArrayArray3 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray3.length) {
							local248 = this.anIntArrayArray3[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local50 = local248[local250];
								if (this.aShortArray11 == null || (this.aShortArray11[local50] & arg6) != 0) {
									local56 = arg2 * 8 + (this.aByteArray5[local50] & 0xFF);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray5[local50] = (byte) local56;
									if (this.aClass55_2 != null) {
										this.aClass55_2.anInterface27_2 = null;
									}
								}
							}
						}
					}
					if (this.aClass193Array1 != null) {
						for (local32 = 0; local32 < this.anInt532; local32++) {
							local2605 = this.aClass193Array1[local32];
							local2610 = this.aClass326Array1[local32];
							local2610.anInt9380 = local2610.anInt9380 & 0xFFFFFF | 255 - (this.aByteArray5[local2605.anInt6079] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2860) Class326 local2860;
				if (arg0 == 8) {
					if (this.anIntArrayArray5 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray5.length) {
								local248 = this.anIntArrayArray5[local32];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2860 = this.aClass326Array1[local248[local250]];
									local2860.anInt9373 += arg3;
									local2860.anInt9383 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray5 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray5.length) {
								local248 = this.anIntArrayArray5[local32];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2860 = this.aClass326Array1[local248[local250]];
									local2860.anInt9381 = local2860.anInt9381 * arg3 >> 7;
									local2860.anInt9376 = local2860.anInt9376 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray5 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray5.length) {
							local248 = this.anIntArrayArray5[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2860 = this.aClass326Array1[local248[local250]];
								local2860.anInt9375 = local2860.anInt9375 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray3 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray3.length > local32) {
						local248 = this.anIntArrayArray3[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local50 = local248[local250];
							if (this.aShortArray11 == null || (arg6 & this.aShortArray11[local50]) != 0) {
								local56 = this.aShortArray4[local50] & 0xFFFF;
								local369 = local56 >> 10 & 0x3F;
								local392 = local56 >> 7 & 0x7;
								local415 = local56 & 0x7F;
								@Pc(2709) int local2709 = local369 + arg2 & 0x3F;
								local392 += arg3 / 4;
								if (local392 < 0) {
									local392 = 0;
								} else if (local392 > 7) {
									local392 = 7;
								}
								local415 += arg4;
								if (local415 < 0) {
									local415 = 0;
								} else if (local415 > 127) {
									local415 = 127;
								}
								this.aShortArray4[local50] = (short) (local2709 << 10 | local392 << 7 | local415);
								if (this.aClass55_2 != null) {
									this.aClass55_2.anInterface27_2 = null;
								}
							}
						}
					}
				}
				if (this.aClass193Array1 != null) {
					for (local32 = 0; local32 < this.anInt532; local32++) {
						local2605 = this.aClass193Array1[local32];
						local2610 = this.aClass326Array1[local32];
						local2610.anInt9380 = Static91.anIntArray99[this.aShortArray4[local2605.anInt6079] & 0xFFFF] & 0xFFFFFF | local2610.anInt9380 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray4.length > local32) {
					local248 = this.anIntArrayArray4[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local50 = local248[local250];
						if (this.aShortArray3 == null || (this.aShortArray3[local50] & arg6) != 0) {
							this.anIntArray25[local50] -= Static648.anInt10737;
							this.anIntArray29[local50] -= Static300.anInt5838;
							this.anIntArray28[local50] -= Static125.anInt10760;
							this.anIntArray25[local50] = arg2 * this.anIntArray25[local50] >> 7;
							this.anIntArray29[local50] = this.anIntArray29[local50] * arg3 >> 7;
							this.anIntArray28[local50] = this.anIntArray28[local50] * arg4 >> 7;
							this.anIntArray25[local50] += Static648.anInt10737;
							this.anIntArray29[local50] += Static300.anInt5838;
							this.anIntArray28[local50] += Static125.anInt10760;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local250 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static566.aBoolean661) {
				local369 = Static300.anInt5838 * arg7[3] + Static648.anInt10737 * arg7[0] + Static125.anInt10760 * arg7[6] + 8192 >> 14;
				local392 = arg7[7] * Static125.anInt10760 + Static648.anInt10737 * arg7[1] + arg7[4] * Static300.anInt5838 + 8192 >> 14;
				local369 += local250;
				local392 += local50;
				local415 = arg7[5] * Static300.anInt5838 + arg7[2] * Static648.anInt10737 + Static125.anInt10760 * arg7[8] + 8192 >> 14;
				local415 += local56;
				Static300.anInt5838 = local392;
				Static648.anInt10737 = local369;
				Static125.anInt10760 = local415;
				Static566.aBoolean661 = false;
			}
			local369 = arg2 << 15 >> 7;
			local392 = arg3 << 15 >> 7;
			local415 = arg4 << 15 >> 7;
			local450 = local369 * -Static648.anInt10737 + 8192 >> 14;
			local454 = local392 * -Static300.anInt5838 + 8192 >> 14;
			local458 = local415 * -Static125.anInt10760 + 8192 >> 14;
			local462 = local450 + Static648.anInt10737;
			local470 = Static300.anInt5838 + local454;
			local478 = local458 + Static125.anInt10760;
			@Pc(1882) int[] local1882 = new int[] { local369 * arg7[0] + 8192 >> 14, arg7[3] * local369 + 8192 >> 14, arg7[6] * local369 + 8192 >> 14, local392 * arg7[1] + 8192 >> 14, arg7[4] * local392 + 8192 >> 14, arg7[7] * local392 + 8192 >> 14, arg7[2] * local415 + 8192 >> 14, arg7[5] * local415 + 8192 >> 14, local415 * arg7[8] + 8192 >> 14 };
			local636 = local369 * local250 + 8192 >> 14;
			local662 = local392 * local50 + 8192 >> 14;
			local666 = local56 * local415 + 8192 >> 14;
			@Pc(2018) int local2018 = local636 + local462;
			@Pc(2022) int local2022 = local662 + local470;
			@Pc(2026) int local2026 = local666 + local478;
			@Pc(2029) int[] local2029 = new int[9];
			@Pc(2035) int local2035;
			for (local674 = 0; local674 < 3; local674++) {
				for (local2035 = 0; local2035 < 3; local2035++) {
					local679 = 0;
					for (local683 = 0; local683 < 3; local683++) {
						local679 += arg7[local683 + local674 * 3] * local1882[local2035 + local683 * 3];
					}
					local2029[local2035 + local674 * 3] = local679 + 8192 >> 14;
				}
			}
			local2035 = arg7[1] * local2022 + arg7[0] * local2018 + local2026 * arg7[2] + 8192 >> 14;
			local679 = local2018 * arg7[3] + local2022 * arg7[4] + local2026 * arg7[5] + 8192 >> 14;
			local683 = local2026 * arg7[8] + arg7[6] * local2018 + local2022 * arg7[7] + 8192 >> 14;
			local679 += local32;
			local2035 += local24;
			local683 += local38;
			for (local687 = 0; local687 < local8; local687++) {
				local689 = arg1[local687];
				if (this.anIntArrayArray4.length > local689) {
					local818 = this.anIntArrayArray4[local689];
					for (local820 = 0; local820 < local818.length; local820++) {
						local824 = local818[local820];
						if (this.aShortArray3 == null || (this.aShortArray3[local824] & arg6) != 0) {
							local828 = local2029[2] * this.anIntArray28[local824] + local2029[0] * this.anIntArray25[local824] + local2029[1] * this.anIntArray29[local824] + 8192 >> 14;
							local830 = this.anIntArray25[local824] * local2029[3] + this.anIntArray29[local824] * local2029[4] + local2029[5] * this.anIntArray28[local824] + 8192 >> 14;
							@Pc(2279) int local2279 = local828 + local2035;
							local958 = local2029[8] * this.anIntArray28[local824] + this.anIntArray29[local824] * local2029[7] + this.anIntArray25[local824] * local2029[6] + 8192 >> 14;
							@Pc(2314) int local2314 = local830 + local679;
							@Pc(2318) int local2318 = local958 + local683;
							this.anIntArray25[local824] = local2279;
							this.anIntArray29[local824] = local2314;
							this.anIntArray28[local824] = local2318;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt483; local7++) {
			if (arg0 != 0) {
				this.anIntArray25[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray29[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray28[local7] += arg2;
			}
		}
		this.aBoolean20 = false;
		if (this.aClass55_3 != null) {
			this.aClass55_3.anInterface27_2 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		if (this.aClass55_2 != null) {
			this.aClass55_2.anInterface27_2 = null;
		}
		this.aShort1 = (short) arg0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class100_Sub1.anIntArray428[arg0];
		@Pc(13) int local13 = Class100_Sub1.anIntArray429[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt483; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray28[local15] + this.anIntArray25[local15] * local13 >> 14;
			this.anIntArray28[local15] = this.anIntArray28[local15] * local13 - this.anIntArray25[local15] * local9 >> 14;
			this.anIntArray25[local15] = local34;
		}
		this.aBoolean20 = false;
		if (this.aClass55_3 != null) {
			this.aClass55_3.anInterface27_2 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "()V")
	@Override
	protected void method6856() {
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BIIIIIIII)Z")
	private boolean method464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > arg1 && arg0 > arg1 && arg1 < arg2) {
			return false;
		} else if (arg1 > arg7 && arg1 > arg0 && arg2 < arg1) {
			return false;
		} else if (arg6 > arg3 && arg4 > arg3 && arg3 < arg5) {
			return false;
		} else {
			return arg3 <= arg6 || arg4 >= arg3 || arg3 <= arg5;
		}
	}

	@OriginalMember(owner = "client!as", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort1;
	}

	@OriginalMember(owner = "client!as", name = "f", descriptor = "()V")
	@Override
	protected void method6870() {
	}

	@OriginalMember(owner = "client!as", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt534 = arg0;
		this.aBoolean21 = true;
		if (this.aClass284_1 != null && (this.anInt534 & 0x10000) == 0) {
			this.aShortArray9 = this.aClass284_1.aShortArray120;
			this.aShortArray10 = this.aClass284_1.aShortArray121;
			this.aShortArray2 = this.aClass284_1.aShortArray119;
			this.aByteArray4 = this.aClass284_1.aByteArray96;
			this.aClass284_1 = null;
		}
		this.method470();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IFIIIIFLclient!dh;IJ)S")
	private short method465(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) Class64 arg7, @OriginalArg(9) long arg8) {
		@Pc(10) int local10 = this.anIntArray27[arg0];
		@Pc(17) int local17 = this.anIntArray27[arg0 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(34) short local34 = this.aShortArray5[local21];
			if (local34 == 0) {
				local19 = local21;
				break;
			}
			if (Static382.aLongArray12[local21] == arg8) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray5[local19] = (short) (this.anInt500 + 1);
		Static382.aLongArray12[local19] = arg8;
		this.aShortArray2[this.anInt500] = (short) arg3;
		this.aShortArray10[this.anInt500] = (short) arg4;
		this.aShortArray9[this.anInt500] = (short) arg5;
		this.aByteArray4[this.anInt500] = (byte) arg2;
		this.aFloatArray2[this.anInt500] = arg1;
		this.aFloatArray1[this.anInt500] = arg6;
		return (short) this.anInt500++;
	}

	@OriginalMember(owner = "client!as", name = "e", descriptor = "()Z")
	@Override
	public boolean method6866() {
		if (this.aShortArray6 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray6.length; local12++) {
			if (this.aShortArray6[local12] != -1 && !this.aClass100_Sub3_6.anInterface4_12.method892(this.aShortArray6[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!as", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class100_Sub1.anIntArray428[arg0];
		@Pc(13) int local13 = Class100_Sub1.anIntArray429[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt483; local15++) {
			@Pc(33) int local33 = this.anIntArray29[local15] * local9 + this.anIntArray25[local15] * local13 >> 14;
			this.anIntArray29[local15] = local13 * this.anIntArray29[local15] - this.anIntArray25[local15] * local9 >> 14;
			this.anIntArray25[local15] = local33;
		}
		this.aBoolean20 = false;
		if (this.aClass55_3 != null) {
			this.aClass55_3.anInterface27_2 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean20) {
			this.method467();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!as", name = "e", descriptor = "(I)V")
	private void method467() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt483; local23++) {
			@Pc(30) int local30 = this.anIntArray25[local23];
			@Pc(35) int local35 = this.anIntArray29[local23];
			if (local7 > local30) {
				local7 = local30;
			}
			if (local30 > local13) {
				local13 = local30;
			}
			@Pc(58) int local58 = this.anIntArray28[local23];
			if (local9 > local35) {
				local9 = local35;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			if (local17 < local58) {
				local17 = local58;
			}
			if (local11 > local58) {
				local11 = local58;
			}
			@Pc(94) int local94 = local58 * local58 + local30 * local30;
			if (local19 < local94) {
				local19 = local94;
			}
			local94 = local58 * local58 + local30 * local30 + local35 * local35;
			if (local21 < local94) {
				local21 = local94;
			}
		}
		this.aShort9 = (short) local15;
		this.aShort5 = (short) local7;
		this.aShort6 = (short) local13;
		this.aShort10 = (short) local9;
		this.aShort8 = (short) local17;
		this.aShort2 = (short) local11;
		this.aShort7 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort3 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean20 = true;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)V")
	private void method468(@OriginalArg(0) boolean arg0) {
		if (this.anInt494 * 6 > this.aClass100_Sub3_6.aClass6_Sub40_Sub1_3.aByteArray113.length) {
			this.aClass100_Sub3_6.aClass6_Sub40_Sub1_3 = new Class6_Sub40_Sub1((this.anInt494 + 100) * 6);
		} else {
			this.aClass100_Sub3_6.aClass6_Sub40_Sub1_3.anInt10169 = 0;
		}
		@Pc(38) Class6_Sub40_Sub1 local38 = this.aClass100_Sub3_6.aClass6_Sub40_Sub1_3;
		@Pc(44) int local44;
		if (this.aClass100_Sub3_6.aBoolean700) {
			for (local44 = 0; local44 < this.anInt494; local44++) {
				local38.method8561(this.lb[local44]);
				local38.method8561(this.aShortArray8[local44]);
				local38.method8561(this.aShortArray7[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt494; local44++) {
				local38.method8617(this.lb[local44]);
				local38.method8617(this.aShortArray8[local44]);
				local38.method8617(this.aShortArray7[local44]);
			}
		}
		if (local38.anInt10169 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface10_1 == null) {
				this.anInterface10_1 = this.aClass100_Sub3_6.method8916(true, local38.aByteArray113, local38.anInt10169);
			} else {
				this.anInterface10_1.method1317(local38.anInt10169, local38.aByteArray113);
			}
			this.aClass257_1.anInterface10_4 = this.anInterface10_1;
		} else {
			this.aClass257_1.anInterface10_4 = this.aClass100_Sub3_6.method8916(false, local38.aByteArray113, local38.anInt10169);
		}
		if (!arg0) {
			this.aBoolean21 = true;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IILclient!ql;ZI)Z")
	@Override
	public boolean method6855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class154 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method460(arg4, arg3, arg1, arg2, arg0, -1);
	}

	@OriginalMember(owner = "client!as", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class199 arg2, @OriginalArg(3) Class199 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean20) {
			this.method467();
		}
		@Pc(17) int local17 = arg4 + this.aShort5;
		@Pc(22) int local22 = arg4 + this.aShort6;
		@Pc(27) int local27 = this.aShort2 + arg6;
		@Pc(32) int local32 = this.aShort8 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt10111 <= local22 + arg2.anInt10112 >> arg2.anInt10104 || local27 < 0 || arg2.anInt10110 <= local32 + arg2.anInt10112 >> arg2.anInt10104)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt10112 + local22 >> arg3.anInt10104 >= arg3.anInt10111 || local27 < 0 || arg3.anInt10110 <= local32 + arg3.anInt10112 >> arg3.anInt10104) {
				return;
			}
		} else {
			local17 >>= arg2.anInt10104;
			local22 = arg2.anInt10112 + local22 - 1 >> arg2.anInt10104;
			local27 >>= arg2.anInt10104;
			local32 = arg2.anInt10112 + local32 - 1 >> arg2.anInt10104;
			if (arg2.method8532(local17, local27) == arg5 && arg5 == arg2.method8532(local22, local27) && arg5 == arg2.method8532(local17, local32) && arg2.method8532(local22, local32) == arg5) {
				return;
			}
		}
		@Pc(200) int local200;
		if (arg0 == 1) {
			for (local200 = 0; local200 < this.anInt483; local200++) {
				this.anIntArray29[local200] = this.anIntArray29[local200] + arg2.method8531(arg6 + this.anIntArray28[local200], arg4 + this.anIntArray25[local200]) - arg5;
			}
		} else {
			@Pc(208) int local208;
			@Pc(216) int local216;
			if (arg0 == 2) {
				@Pc(426) short local426 = this.aShort10;
				if (local426 == 0) {
					return;
				}
				for (local208 = 0; local208 < this.anInt483; local208++) {
					local216 = (this.anIntArray29[local208] << 16) / local426;
					if (local216 < arg1) {
						this.anIntArray29[local208] += (arg1 - local216) * (arg2.method8531(this.anIntArray28[local208] + arg6, arg4 + this.anIntArray25[local208]) + -arg5) / arg1;
					}
				}
			} else {
				@Pc(224) int local224;
				if (arg0 == 3) {
					local200 = (arg1 & 0xFF) * 4;
					local208 = (arg1 >> 8 & 0xFF) * 4;
					local216 = (arg1 >> 16 & 0xFF) << 6;
					local224 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local200 >> 1) < 0 || arg2.anInt10111 << arg2.anInt10104 <= (local200 >> 1) + arg4 + arg2.anInt10112 || arg6 - (local208 >> 1) < 0 || arg2.anInt10112 + (local208 >> 1) + arg6 >= arg2.anInt10110 << arg2.anInt10104) {
						return;
					}
					this.method6851(local200, local208, local224, local216, arg5, arg2, arg4, arg6);
				} else if (arg0 == 4) {
					local200 = this.aShort9 - this.aShort10;
					for (local208 = 0; local208 < this.anInt483; local208++) {
						this.anIntArray29[local208] = local200 + this.anIntArray29[local208] + arg3.method8531(this.anIntArray28[local208] + arg6, arg4 + this.anIntArray25[local208]) - arg5;
					}
				} else if (arg0 == 5) {
					local200 = this.aShort9 - this.aShort10;
					for (local208 = 0; local208 < this.anInt483; local208++) {
						local216 = arg4 + this.anIntArray25[local208];
						local224 = this.anIntArray28[local208] + arg6;
						@Pc(378) int local378 = arg2.method8531(local224, local216);
						@Pc(384) int local384 = arg3.method8531(local224, local216);
						@Pc(391) int local391 = local378 - arg1 - local384;
						this.anIntArray29[local208] = local378 + (local391 * ((this.anIntArray29[local208] << 8) / local200) >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean20 = false;
		if (this.aClass55_3 != null) {
			this.aClass55_3.anInterface27_2 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!as;ILclient!as;IZZ)Lclient!ka;")
	private Class24 method469(@OriginalArg(0) Class24_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		arg0.anInt534 = arg1;
		arg0.anInt516 = this.anInt516;
		arg0.aShort1 = this.aShort1;
		arg0.anInt477 = this.anInt477;
		arg0.aShort4 = this.aShort4;
		arg0.anInt500 = this.anInt500;
		arg0.aBoolean19 = this.aBoolean19;
		arg0.aByte6 = 0;
		arg0.anInt483 = this.anInt483;
		arg0.anInt508 = this.anInt508;
		arg0.anInt532 = this.anInt532;
		arg0.anInt494 = this.anInt494;
		if ((arg1 & 0x100) == 0) {
			arg0.aBoolean22 = this.aBoolean22;
		} else {
			arg0.aBoolean22 = true;
		}
		@Pc(70) boolean local70 = Static569.method8134(this.anInt516, arg1);
		@Pc(76) boolean local76 = Static284.method6790(arg1, this.anInt516);
		@Pc(82) boolean local82 = Static504.method8536(this.anInt516, arg1);
		@Pc(88) boolean local88 = local76 | local70 | local82;
		@Pc(193) int local193;
		if (local88) {
			if (!local70) {
				arg0.anIntArray25 = this.anIntArray25;
			} else if (arg2.anIntArray25 == null || this.anInt508 > arg2.anIntArray25.length) {
				arg0.anIntArray25 = arg2.anIntArray25 = new int[this.anInt508];
			} else {
				arg0.anIntArray25 = arg2.anIntArray25;
			}
			if (!local76) {
				arg0.anIntArray29 = this.anIntArray29;
			} else if (arg2.anIntArray29 == null || arg2.anIntArray29.length < this.anInt508) {
				arg0.anIntArray29 = arg2.anIntArray29 = new int[this.anInt508];
			} else {
				arg0.anIntArray29 = arg2.anIntArray29;
			}
			if (!local82) {
				arg0.anIntArray28 = this.anIntArray28;
			} else if (arg2.anIntArray28 == null || this.anInt508 > arg2.anIntArray28.length) {
				arg0.anIntArray28 = arg2.anIntArray28 = new int[this.anInt508];
			} else {
				arg0.anIntArray28 = arg2.anIntArray28;
			}
			for (local193 = 0; local193 < this.anInt508; local193++) {
				if (local70) {
					arg0.anIntArray25[local193] = this.anIntArray25[local193];
				}
				if (local76) {
					arg0.anIntArray29[local193] = this.anIntArray29[local193];
				}
				if (local82) {
					arg0.anIntArray28[local193] = this.anIntArray28[local193];
				}
			}
		} else {
			arg0.anIntArray25 = this.anIntArray25;
			arg0.anIntArray29 = this.anIntArray29;
			arg0.anIntArray28 = this.anIntArray28;
		}
		if (Static312.method5229(this.anInt516, arg1)) {
			arg0.aClass55_3 = arg2.aClass55_3;
			if (arg4) {
				arg0.aByte6 = (byte) (arg0.aByte6 | 0x1);
			}
			arg0.aClass55_3.aByte36 = this.aClass55_3.aByte36;
			arg0.aClass55_3.anInterface27_2 = this.aClass55_3.anInterface27_2;
		} else if (Static130.method2123(arg1, this.anInt516)) {
			arg0.aClass55_3 = this.aClass55_3;
		} else {
			arg0.aClass55_3 = null;
		}
		if (Static217.method3687(arg1, this.anInt516)) {
			if (arg2.aShortArray4 == null || arg2.aShortArray4.length < this.anInt477) {
				arg0.aShortArray4 = arg2.aShortArray4 = new short[this.anInt477];
			} else {
				arg0.aShortArray4 = arg2.aShortArray4;
			}
			for (local193 = 0; local193 < this.anInt477; local193++) {
				arg0.aShortArray4[local193] = this.aShortArray4[local193];
			}
		} else {
			arg0.aShortArray4 = this.aShortArray4;
		}
		if (Static385.method6197(arg1, this.anInt516)) {
			if (arg2.aByteArray5 == null || arg2.aByteArray5.length < this.anInt477) {
				arg0.aByteArray5 = arg2.aByteArray5 = new byte[this.anInt477];
			} else {
				arg0.aByteArray5 = arg2.aByteArray5;
			}
			for (local193 = 0; local193 < this.anInt477; local193++) {
				arg0.aByteArray5[local193] = this.aByteArray5[local193];
			}
		} else {
			arg0.aByteArray5 = this.aByteArray5;
		}
		if (Static216.method3668(arg1, this.anInt516)) {
			arg0.aClass55_2 = arg2.aClass55_2;
			if (arg4) {
				arg0.aByte6 = (byte) (arg0.aByte6 | 0x2);
			}
			arg0.aClass55_2.anInterface27_2 = this.aClass55_2.anInterface27_2;
			arg0.aClass55_2.aByte36 = this.aClass55_2.aByte36;
		} else if (Static356.method5696(this.anInt516, arg1)) {
			arg0.aClass55_2 = this.aClass55_2;
		} else {
			arg0.aClass55_2 = null;
		}
		@Pc(566) int local566;
		if (Static596.method8369(this.anInt516, arg1)) {
			if (arg2.aShortArray2 == null || this.anInt500 > arg2.aShortArray2.length) {
				local193 = this.anInt500;
				arg0.aShortArray9 = arg2.aShortArray9 = new short[local193];
				arg0.aShortArray10 = arg2.aShortArray10 = new short[local193];
				arg0.aShortArray2 = arg2.aShortArray2 = new short[local193];
			} else {
				arg0.aShortArray2 = arg2.aShortArray2;
				arg0.aShortArray9 = arg2.aShortArray9;
				arg0.aShortArray10 = arg2.aShortArray10;
			}
			if (this.aClass284_1 == null) {
				for (local193 = 0; local193 < this.anInt500; local193++) {
					arg0.aShortArray2[local193] = this.aShortArray2[local193];
					arg0.aShortArray10[local193] = this.aShortArray10[local193];
					arg0.aShortArray9[local193] = this.aShortArray9[local193];
				}
			} else {
				if (arg2.aClass284_1 == null) {
					arg2.aClass284_1 = new Class284();
				}
				@Pc(554) Class284 local554 = arg0.aClass284_1 = arg2.aClass284_1;
				if (local554.aShortArray119 == null || this.anInt500 > local554.aShortArray119.length) {
					local566 = this.anInt500;
					local554.aShortArray121 = new short[local566];
					local554.aShortArray120 = new short[local566];
					local554.aByteArray96 = new byte[local566];
					local554.aShortArray119 = new short[local566];
				}
				for (local566 = 0; local566 < this.anInt500; local566++) {
					arg0.aShortArray2[local566] = this.aShortArray2[local566];
					arg0.aShortArray10[local566] = this.aShortArray10[local566];
					arg0.aShortArray9[local566] = this.aShortArray9[local566];
					local554.aShortArray119[local566] = this.aClass284_1.aShortArray119[local566];
					local554.aShortArray121[local566] = this.aClass284_1.aShortArray121[local566];
					local554.aShortArray120[local566] = this.aClass284_1.aShortArray120[local566];
					local554.aByteArray96[local566] = this.aClass284_1.aByteArray96[local566];
				}
			}
			arg0.aByteArray4 = this.aByteArray4;
		} else {
			arg0.aShortArray2 = this.aShortArray2;
			arg0.aByteArray4 = this.aByteArray4;
			arg0.aShortArray9 = this.aShortArray9;
			arg0.aClass284_1 = this.aClass284_1;
			arg0.aShortArray10 = this.aShortArray10;
		}
		if (Static195.method3466(this.anInt516, arg1)) {
			arg0.aClass55_1 = arg2.aClass55_1;
			if (arg4) {
				arg0.aByte6 = (byte) (arg0.aByte6 | 0x4);
			}
			arg0.aClass55_1.aByte36 = this.aClass55_1.aByte36;
			arg0.aClass55_1.anInterface27_2 = this.aClass55_1.anInterface27_2;
		} else if (Static393.method6342(this.anInt516, arg1)) {
			arg0.aClass55_1 = this.aClass55_1;
		} else {
			arg0.aClass55_1 = null;
		}
		if (Static12.method219(arg1, this.anInt516)) {
			if (arg2.aFloatArray2 == null || this.anInt477 > arg2.aFloatArray2.length) {
				local193 = this.anInt500;
				arg0.aFloatArray1 = arg2.aFloatArray1 = new float[local193];
				arg0.aFloatArray2 = arg2.aFloatArray2 = new float[local193];
			} else {
				arg0.aFloatArray1 = arg2.aFloatArray1;
				arg0.aFloatArray2 = arg2.aFloatArray2;
			}
			for (local193 = 0; local193 < this.anInt500; local193++) {
				arg0.aFloatArray2[local193] = this.aFloatArray2[local193];
				arg0.aFloatArray1[local193] = this.aFloatArray1[local193];
			}
		} else {
			arg0.aFloatArray2 = this.aFloatArray2;
			arg0.aFloatArray1 = this.aFloatArray1;
		}
		if (Static108.method1762(arg1, this.anInt516)) {
			arg0.aClass55_4 = arg2.aClass55_4;
			if (arg4) {
				arg0.aByte6 = (byte) (arg0.aByte6 | 0x8);
			}
			arg0.aClass55_4.aByte36 = this.aClass55_4.aByte36;
			arg0.aClass55_4.anInterface27_2 = this.aClass55_4.anInterface27_2;
		} else if (Static503.method7486(arg1, this.anInt516)) {
			arg0.aClass55_4 = this.aClass55_4;
		} else {
			arg0.aClass55_4 = null;
		}
		if (Static249.method4328(this.anInt516, arg1)) {
			if (arg2.lb == null || arg2.lb.length < this.anInt477) {
				local193 = this.anInt477;
				arg0.aShortArray8 = arg2.aShortArray8 = new short[local193];
				arg0.aShortArray7 = arg2.aShortArray7 = new short[local193];
				arg0.lb = arg2.lb = new short[local193];
			} else {
				arg0.lb = arg2.lb;
				arg0.aShortArray8 = arg2.aShortArray8;
				arg0.aShortArray7 = arg2.aShortArray7;
			}
			for (local193 = 0; local193 < this.anInt477; local193++) {
				arg0.lb[local193] = this.lb[local193];
				arg0.aShortArray8[local193] = this.aShortArray8[local193];
				arg0.aShortArray7[local193] = this.aShortArray7[local193];
			}
		} else {
			arg0.aShortArray7 = this.aShortArray7;
			arg0.lb = this.lb;
			arg0.aShortArray8 = this.aShortArray8;
		}
		if (Static191.method3394(this.anInt516, arg1)) {
			if (arg4) {
				arg0.aByte6 = (byte) (arg0.aByte6 | 0x10);
			}
			arg0.aClass257_1 = arg2.aClass257_1;
			arg0.aClass257_1.anInterface10_4 = this.aClass257_1.anInterface10_4;
		} else if (Static367.method5806(arg1, this.anInt516)) {
			arg0.aClass257_1 = this.aClass257_1;
		} else {
			arg0.aClass257_1 = null;
		}
		if (Static362.method5754(arg1, this.anInt516)) {
			if (arg2.aShortArray6 == null || this.anInt477 > arg2.aShortArray6.length) {
				local193 = this.anInt477;
				arg0.aShortArray6 = arg2.aShortArray6 = new short[local193];
			} else {
				arg0.aShortArray6 = arg2.aShortArray6;
			}
			for (local193 = 0; local193 < this.anInt477; local193++) {
				arg0.aShortArray6[local193] = this.aShortArray6[local193];
			}
		} else {
			arg0.aShortArray6 = this.aShortArray6;
		}
		if (!Static324.method5379(this.anInt516, arg1)) {
			arg0.aClass326Array1 = this.aClass326Array1;
		} else if (arg2.aClass326Array1 == null || this.anInt532 > arg2.aClass326Array1.length) {
			local193 = this.anInt532;
			arg0.aClass326Array1 = arg2.aClass326Array1 = new Class326[local193];
			for (local566 = 0; local566 < this.anInt532; local566++) {
				arg0.aClass326Array1[local566] = this.aClass326Array1[local566].method7973();
			}
		} else {
			arg0.aClass326Array1 = arg2.aClass326Array1;
			for (local193 = 0; local193 < this.anInt532; local193++) {
				arg0.aClass326Array1[local193].method7971(this.aClass326Array1[local193]);
			}
		}
		arg0.anIntArrayArray3 = this.anIntArrayArray3;
		arg0.aClass193Array1 = this.aClass193Array1;
		arg0.aShortArray3 = this.aShortArray3;
		arg0.aClass382Array1 = this.aClass382Array1;
		arg0.aShortArray11 = this.aShortArray11;
		arg0.aShortArray5 = this.aShortArray5;
		arg0.anIntArray27 = this.anIntArray27;
		arg0.aClass243Array1 = this.aClass243Array1;
		arg0.anIntArray26 = this.anIntArray26;
		arg0.anIntArrayArray4 = this.anIntArrayArray4;
		arg0.anIntArrayArray5 = this.anIntArrayArray5;
		if (this.aBoolean20) {
			arg0.aShort9 = this.aShort9;
			arg0.aShort5 = this.aShort5;
			arg0.aBoolean20 = true;
			arg0.aShort7 = this.aShort7;
			arg0.aShort3 = this.aShort3;
			arg0.aShort2 = this.aShort2;
			arg0.aShort6 = this.aShort6;
			arg0.aShort10 = this.aShort10;
			arg0.aShort8 = this.aShort8;
		} else {
			arg0.aBoolean20 = false;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!as", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class100_Sub1.anIntArray428[arg0];
		@Pc(13) int local13 = Class100_Sub1.anIntArray429[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt483; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray29[local15] - local9 * this.anIntArray28[local15] >> 14;
			this.anIntArray28[local15] = local13 * this.anIntArray28[local15] + local9 * this.anIntArray29[local15] >> 14;
			this.anIntArray29[local15] = local34;
		}
		this.aBoolean20 = false;
		if (this.aClass55_3 != null) {
			this.aClass55_3.anInterface27_2 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public void method6861(@OriginalArg(0) Class154 arg0) {
		@Pc(8) Class154_Sub3 local8 = (Class154_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass382Array1 != null) {
			for (local13 = 0; local13 < this.aClass382Array1.length; local13++) {
				@Pc(20) Class382 local20 = this.aClass382Array1[local13];
				@Pc(22) Class382 local22 = local20;
				if (local20.aClass382_2 != null) {
					local22 = local20.aClass382_2;
				}
				local22.anInt10689 = (int) ((float) this.anIntArray28[local20.anInt10680] * local8.aFloat161 + local8.aFloat155 * (float) this.anIntArray29[local20.anInt10680] + (float) this.anIntArray25[local20.anInt10680] * local8.aFloat151 + local8.aFloat156);
				local22.anInt10678 = (int) (local8.aFloat153 * (float) this.anIntArray29[local20.anInt10680] + (float) this.anIntArray25[local20.anInt10680] * local8.aFloat157 + (float) this.anIntArray28[local20.anInt10680] * local8.aFloat150 + local8.aFloat160);
				local22.anInt10687 = (int) (local8.aFloat152 + (float) this.anIntArray29[local20.anInt10680] * local8.aFloat154 + (float) this.anIntArray25[local20.anInt10680] * local8.aFloat159 + (float) this.anIntArray28[local20.anInt10680] * local8.aFloat158);
				local22.anInt10675 = (int) (local8.aFloat156 + local8.aFloat151 * (float) this.anIntArray25[local20.anInt10683] + (float) this.anIntArray29[local20.anInt10683] * local8.aFloat155 + local8.aFloat161 * (float) this.anIntArray28[local20.anInt10683]);
				local22.anInt10679 = (int) (local8.aFloat160 + (float) this.anIntArray28[local20.anInt10683] * local8.aFloat150 + local8.aFloat153 * (float) this.anIntArray29[local20.anInt10683] + (float) this.anIntArray25[local20.anInt10683] * local8.aFloat157);
				local22.anInt10681 = (int) (local8.aFloat152 + local8.aFloat158 * (float) this.anIntArray28[local20.anInt10683] + (float) this.anIntArray25[local20.anInt10683] * local8.aFloat159 + (float) this.anIntArray29[local20.anInt10683] * local8.aFloat154);
				local22.anInt10685 = (int) (local8.aFloat161 * (float) this.anIntArray28[local20.anInt10673] + local8.aFloat151 * (float) this.anIntArray25[local20.anInt10673] + (float) this.anIntArray29[local20.anInt10673] * local8.aFloat155 + local8.aFloat156);
				local22.anInt10674 = (int) (local8.aFloat153 * (float) this.anIntArray29[local20.anInt10673] + local8.aFloat157 * (float) this.anIntArray25[local20.anInt10673] + local8.aFloat150 * (float) this.anIntArray28[local20.anInt10673] + local8.aFloat160);
				local22.anInt10676 = (int) (local8.aFloat152 + (float) this.anIntArray28[local20.anInt10673] * local8.aFloat158 + (float) this.anIntArray29[local20.anInt10673] * local8.aFloat154 + local8.aFloat159 * (float) this.anIntArray25[local20.anInt10673]);
			}
		}
		if (this.aClass243Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass243Array1.length; local13++) {
			@Pc(361) Class243 local361 = this.aClass243Array1[local13];
			@Pc(363) Class243 local363 = local361;
			if (local361.aClass243_2 != null) {
				local363 = local361.aClass243_2;
			}
			if (local361.aClass154_7 == null) {
				local361.aClass154_7 = local8.method6574();
			} else {
				local361.aClass154_7.method6563(local8);
			}
			local363.anInt7533 = (int) (local8.aFloat156 + local8.aFloat161 * (float) this.anIntArray28[local361.anInt7539] + local8.aFloat151 * (float) this.anIntArray25[local361.anInt7539] + (float) this.anIntArray29[local361.anInt7539] * local8.aFloat155);
			local363.anInt7531 = (int) (local8.aFloat157 * (float) this.anIntArray25[local361.anInt7539] + (float) this.anIntArray29[local361.anInt7539] * local8.aFloat153 + (float) this.anIntArray28[local361.anInt7539] * local8.aFloat150 + local8.aFloat160);
			local363.anInt7534 = (int) (local8.aFloat152 + local8.aFloat159 * (float) this.anIntArray25[local361.anInt7539] + local8.aFloat154 * (float) this.anIntArray29[local361.anInt7539] + (float) this.anIntArray28[local361.anInt7539] * local8.aFloat158);
		}
	}

	@OriginalMember(owner = "client!as", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean20) {
			this.method467();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!as", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class100_Sub1.anIntArray428[arg0];
		@Pc(13) int local13 = Class100_Sub1.anIntArray429[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt483; local15++) {
			local33 = this.anIntArray28[local15] * local9 + this.anIntArray25[local15] * local13 >> 14;
			this.anIntArray28[local15] = this.anIntArray28[local15] * local13 - local9 * this.anIntArray25[local15] >> 14;
			this.anIntArray25[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt500; local33++) {
			@Pc(87) int local87 = this.aShortArray9[local33] * local9 + this.aShortArray2[local33] * local13 >> 14;
			this.aShortArray9[local33] = (short) (this.aShortArray9[local33] * local13 - this.aShortArray2[local33] * local9 >> 14);
			this.aShortArray2[local33] = (short) local87;
		}
		if (this.aClass55_1 == null && this.aClass55_2 != null) {
			this.aClass55_2.anInterface27_2 = null;
		}
		if (this.aClass55_1 != null) {
			this.aClass55_1.anInterface27_2 = null;
		}
		this.aBoolean20 = false;
		if (this.aClass55_3 != null) {
			this.aClass55_3.anInterface27_2 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt508; local3++) {
			this.anIntArray25[local3] = this.anIntArray25[local3] + 7 >> 4;
			this.anIntArray29[local3] = this.anIntArray29[local3] + 7 >> 4;
			this.anIntArray28[local3] = this.anIntArray28[local3] + 7 >> 4;
		}
		this.aBoolean20 = false;
		if (this.aClass55_3 != null) {
			this.aClass55_3.anInterface27_2 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean20) {
			this.method467();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6858(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg3 << 4;
			local25 = arg4 << 4;
			Static125.anInt10760 = 0;
			Static300.anInt5838 = 0;
			local31 = 0;
			Static648.anInt10737 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray4.length > local41) {
					local55 = this.anIntArrayArray4[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static648.anInt10737 += this.anIntArray25[local63];
						Static300.anInt5838 += this.anIntArray29[local63];
						local31++;
						Static125.anInt10760 += this.anIntArray28[local63];
					}
				}
			}
			if (local31 > 0) {
				Static125.anInt10760 = local25 + Static125.anInt10760 / local31;
				Static648.anInt10737 = Static648.anInt10737 / local31 + local17;
				Static300.anInt5838 = Static300.anInt5838 / local31 + local21;
			} else {
				Static300.anInt5838 = local21;
				Static648.anInt10737 = local17;
				Static125.anInt10760 = local25;
			}
			return;
		}
		@Pc(164) int[] local164;
		@Pc(166) int local166;
		if (arg0 == 1) {
			local21 = arg3 << 4;
			local17 = arg2 << 4;
			local25 = arg4 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray4.length) {
					local164 = this.anIntArrayArray4[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local57 = local164[local166];
						this.anIntArray25[local57] += local17;
						this.anIntArray29[local57] += local21;
						this.anIntArray28[local57] += local25;
					}
				}
			}
			return;
		}
		@Pc(286) int local286;
		@Pc(304) int local304;
		@Pc(758) int local758;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray4.length) {
					local164 = this.anIntArrayArray4[local35];
					if ((arg5 & 0x1) == 0) {
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							this.anIntArray25[local57] -= Static648.anInt10737;
							this.anIntArray29[local57] -= Static300.anInt5838;
							this.anIntArray28[local57] -= Static125.anInt10760;
							if (arg4 != 0) {
								local63 = Class100_Sub1.anIntArray428[arg4];
								local286 = Class100_Sub1.anIntArray429[arg4];
								local304 = this.anIntArray25[local57] * local286 + this.anIntArray29[local57] * local63 + 16383 >> 14;
								this.anIntArray29[local57] = this.anIntArray29[local57] * local286 + 16383 - local63 * this.anIntArray25[local57] >> 14;
								this.anIntArray25[local57] = local304;
							}
							if (arg2 != 0) {
								local63 = Class100_Sub1.anIntArray428[arg2];
								local286 = Class100_Sub1.anIntArray429[arg2];
								local304 = this.anIntArray29[local57] * local286 + 16383 - this.anIntArray28[local57] * local63 >> 14;
								this.anIntArray28[local57] = local63 * this.anIntArray29[local57] + local286 * this.anIntArray28[local57] + 16383 >> 14;
								this.anIntArray29[local57] = local304;
							}
							if (arg3 != 0) {
								local63 = Class100_Sub1.anIntArray428[arg3];
								local286 = Class100_Sub1.anIntArray429[arg3];
								local304 = this.anIntArray25[local57] * local286 + local63 * this.anIntArray28[local57] + 16383 >> 14;
								this.anIntArray28[local57] = local286 * this.anIntArray28[local57] + 16383 - local63 * this.anIntArray25[local57] >> 14;
								this.anIntArray25[local57] = local304;
							}
							this.anIntArray25[local57] += Static648.anInt10737;
							this.anIntArray29[local57] += Static300.anInt5838;
							this.anIntArray28[local57] += Static125.anInt10760;
						}
					} else {
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							this.anIntArray25[local57] -= Static648.anInt10737;
							this.anIntArray29[local57] -= Static300.anInt5838;
							this.anIntArray28[local57] -= Static125.anInt10760;
							if (arg2 != 0) {
								local63 = Class100_Sub1.anIntArray428[arg2];
								local286 = Class100_Sub1.anIntArray429[arg2];
								local304 = local286 * this.anIntArray29[local57] + 16383 - this.anIntArray28[local57] * local63 >> 14;
								this.anIntArray28[local57] = this.anIntArray28[local57] * local286 + local63 * this.anIntArray29[local57] + 16383 >> 14;
								this.anIntArray29[local57] = local304;
							}
							if (arg4 != 0) {
								local63 = Class100_Sub1.anIntArray428[arg4];
								local286 = Class100_Sub1.anIntArray429[arg4];
								local304 = local286 * this.anIntArray25[local57] + local63 * this.anIntArray29[local57] + 16383 >> 14;
								this.anIntArray29[local57] = local286 * this.anIntArray29[local57] + 16383 - this.anIntArray25[local57] * local63 >> 14;
								this.anIntArray25[local57] = local304;
							}
							if (arg3 != 0) {
								local63 = Class100_Sub1.anIntArray428[arg3];
								local286 = Class100_Sub1.anIntArray429[arg3];
								local304 = this.anIntArray28[local57] * local63 + local286 * this.anIntArray25[local57] + 16383 >> 14;
								this.anIntArray28[local57] = local286 * this.anIntArray28[local57] + 16383 - this.anIntArray25[local57] * local63 >> 14;
								this.anIntArray25[local57] = local304;
							}
							this.anIntArray25[local57] += Static648.anInt10737;
							this.anIntArray29[local57] += Static300.anInt5838;
							this.anIntArray28[local57] += Static125.anInt10760;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray4.length) {
						local55 = this.anIntArrayArray4[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local286 = this.anIntArray27[local63];
							local304 = this.anIntArray27[local63 + 1];
							for (local758 = local286; local758 < local304; local758++) {
								@Pc(767) int local767 = this.aShortArray5[local758] - 1;
								if (local767 == -1) {
									break;
								}
								@Pc(776) int local776;
								@Pc(780) int local780;
								@Pc(798) int local798;
								if (arg4 != 0) {
									local776 = Class100_Sub1.anIntArray428[arg4];
									local780 = Class100_Sub1.anIntArray429[arg4];
									local798 = local780 * this.aShortArray2[local767] + this.aShortArray10[local767] * local776 + 16383 >> 14;
									this.aShortArray10[local767] = (short) (this.aShortArray10[local767] * local780 + 16383 - this.aShortArray2[local767] * local776 >> 14);
									this.aShortArray2[local767] = (short) local798;
								}
								if (arg2 != 0) {
									local776 = Class100_Sub1.anIntArray428[arg2];
									local780 = Class100_Sub1.anIntArray429[arg2];
									local798 = this.aShortArray10[local767] * local780 + 16383 - this.aShortArray9[local767] * local776 >> 14;
									this.aShortArray9[local767] = (short) (local776 * this.aShortArray10[local767] + this.aShortArray9[local767] * local780 + 16383 >> 14);
									this.aShortArray10[local767] = (short) local798;
								}
								if (arg3 != 0) {
									local776 = Class100_Sub1.anIntArray428[arg3];
									local780 = Class100_Sub1.anIntArray429[arg3];
									local798 = local780 * this.aShortArray2[local767] + this.aShortArray9[local767] * local776 + 16383 >> 14;
									this.aShortArray9[local767] = (short) (this.aShortArray9[local767] * local780 + 16383 - local776 * this.aShortArray2[local767] >> 14);
									this.aShortArray2[local767] = (short) local798;
								}
							}
						}
					}
				}
				if (this.aClass55_1 == null && this.aClass55_2 != null) {
					this.aClass55_2.anInterface27_2 = null;
				}
				if (this.aClass55_1 != null) {
					this.aClass55_1.anInterface27_2 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray4.length > local35) {
					local164 = this.anIntArrayArray4[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local57 = local164[local166];
						this.anIntArray25[local57] -= Static648.anInt10737;
						this.anIntArray29[local57] -= Static300.anInt5838;
						this.anIntArray28[local57] -= Static125.anInt10760;
						this.anIntArray25[local57] = arg2 * this.anIntArray25[local57] >> 7;
						this.anIntArray29[local57] = arg3 * this.anIntArray29[local57] >> 7;
						this.anIntArray28[local57] = arg4 * this.anIntArray28[local57] >> 7;
						this.anIntArray25[local57] += Static648.anInt10737;
						this.anIntArray29[local57] += Static300.anInt5838;
						this.anIntArray28[local57] += Static125.anInt10760;
					}
				}
			}
		} else {
			@Pc(1208) Class193 local1208;
			@Pc(1213) Class326 local1213;
			if (arg0 == 5) {
				if (this.anIntArrayArray3 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray3.length > local35) {
							local164 = this.anIntArrayArray3[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local57 = local164[local166];
								local63 = arg2 * 8 + (this.aByteArray5[local57] & 0xFF);
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray5[local57] = (byte) local63;
							}
							if (local164.length > 0 && this.aClass55_2 != null) {
								this.aClass55_2.anInterface27_2 = null;
							}
						}
					}
					if (this.aClass193Array1 != null) {
						for (local35 = 0; local35 < this.anInt532; local35++) {
							local1208 = this.aClass193Array1[local35];
							local1213 = this.aClass326Array1[local35];
							local1213.anInt9380 = local1213.anInt9380 & 0xFFFFFF | 255 - (this.aByteArray5[local1208.anInt6079] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1461) Class326 local1461;
				if (arg0 == 8) {
					if (this.anIntArrayArray5 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray5.length) {
								local164 = this.anIntArrayArray5[local35];
								for (local166 = 0; local166 < local164.length; local166++) {
									local1461 = this.aClass326Array1[local164[local166]];
									local1461.anInt9373 += arg3;
									local1461.anInt9383 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray5 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray5.length) {
								local164 = this.anIntArrayArray5[local35];
								for (local166 = 0; local166 < local164.length; local166++) {
									local1461 = this.aClass326Array1[local164[local166]];
									local1461.anInt9381 = arg3 * local1461.anInt9381 >> 7;
									local1461.anInt9376 = local1461.anInt9376 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray5 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray5.length > local35) {
							local164 = this.anIntArrayArray5[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1461 = this.aClass326Array1[local164[local166]];
								local1461.anInt9375 = arg2 + local1461.anInt9375 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray3 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray3.length) {
						local164 = this.anIntArrayArray3[local35];
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							local63 = this.aShortArray4[local57] & 0xFFFF;
							local286 = local63 >> 10 & 0x3F;
							local304 = local63 >> 7 & 0x7;
							local304 += arg3 / 4;
							@Pc(1304) int local1304 = local286 + arg2 & 0x3F;
							local758 = local63 & 0x7F;
							if (local304 < 0) {
								local304 = 0;
							} else if (local304 > 7) {
								local304 = 7;
							}
							local758 += arg4;
							if (local758 < 0) {
								local758 = 0;
							} else if (local758 > 127) {
								local758 = 127;
							}
							this.aShortArray4[local57] = (short) (local758 | local304 << 7 | local1304 << 10);
						}
						if (local164.length > 0 && this.aClass55_2 != null) {
							this.aClass55_2.anInterface27_2 = null;
						}
					}
				}
				if (this.aClass193Array1 != null) {
					for (local35 = 0; local35 < this.anInt532; local35++) {
						local1208 = this.aClass193Array1[local35];
						local1213 = this.aClass326Array1[local35];
						local1213.anInt9380 = Static91.anIntArray99[this.aShortArray4[local1208.anInt6079] & 0xFFFF] & 0xFFFFFF | local1213.anInt9380 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "f", descriptor = "(I)V")
	private void method470() {
		if (!this.aBoolean21) {
			return;
		}
		this.aBoolean21 = false;
		if (this.aClass382Array1 == null && this.aClass243Array1 == null && this.aClass193Array1 == null) {
			if (this.anIntArray25 != null && !Static448.method6926(this.anInt516, this.anInt534)) {
				if (this.aClass55_3 != null && this.aClass55_3.anInterface27_2 == null) {
					this.aBoolean21 = true;
				} else {
					if (!this.aBoolean20) {
						this.method467();
					}
					this.anIntArray25 = null;
				}
			}
			if (this.anIntArray29 != null && !Static455.method7005(this.anInt534, this.anInt516)) {
				if (this.aClass55_3 != null && this.aClass55_3.anInterface27_2 == null) {
					this.aBoolean21 = true;
				} else {
					if (!this.aBoolean20) {
						this.method467();
					}
					this.anIntArray29 = null;
				}
			}
			if (this.anIntArray28 != null && !Static447.method6914(this.anInt516, this.anInt534)) {
				if (this.aClass55_3 != null && this.aClass55_3.anInterface27_2 == null) {
					this.aBoolean21 = true;
				} else {
					if (!this.aBoolean20) {
						this.method467();
					}
					this.anIntArray28 = null;
				}
			}
		}
		if (this.aShortArray5 != null && this.anIntArray25 == null && this.anIntArray29 == null && this.anIntArray28 == null) {
			this.anIntArray27 = null;
			this.aShortArray5 = null;
		}
		if (this.aByteArray4 != null && !Static441.method6828(this.anInt516, this.anInt534)) {
			if (this.aClass55_1 == null) {
				if (this.aClass55_2 != null && this.aClass55_2.anInterface27_2 == null) {
					this.aBoolean21 = true;
				} else {
					this.aShortArray2 = this.aShortArray10 = this.aShortArray9 = null;
					this.aByteArray4 = null;
				}
			} else if (this.aClass55_1.anInterface27_2 == null) {
				this.aBoolean21 = true;
			} else {
				this.aShortArray2 = this.aShortArray10 = this.aShortArray9 = null;
				this.aByteArray4 = null;
			}
		}
		if (this.aShortArray4 != null && !Static432.method6743(this.anInt516, this.anInt534)) {
			if (this.aClass55_2 != null && this.aClass55_2.anInterface27_2 == null) {
				this.aBoolean21 = true;
			} else {
				this.aShortArray4 = null;
			}
		}
		if (this.aByteArray5 != null && !Static387.method6210(this.anInt516, this.anInt534)) {
			if (this.aClass55_2 != null && this.aClass55_2.anInterface27_2 == null) {
				this.aBoolean21 = true;
			} else {
				this.aByteArray5 = null;
			}
		}
		if (this.aFloatArray2 != null && !Static291.method5048(this.anInt516, this.anInt534)) {
			if (this.aClass55_4 != null && this.aClass55_4.anInterface27_2 == null) {
				this.aBoolean21 = true;
			} else {
				this.aFloatArray2 = this.aFloatArray1 = null;
			}
		}
		if (this.aShortArray6 != null && !Static455.method7007(this.anInt516, this.anInt534)) {
			if (this.aClass55_2 != null && this.aClass55_2.anInterface27_2 == null) {
				this.aBoolean21 = true;
			} else {
				this.aShortArray6 = null;
			}
		}
		if (this.lb != null && !Static504.method8524(this.anInt516, this.anInt534)) {
			if (this.aClass257_1 != null && this.aClass257_1.anInterface10_4 == null || this.aClass55_2 != null && this.aClass55_2.anInterface27_2 == null) {
				this.aBoolean21 = true;
			} else {
				this.lb = this.aShortArray8 = this.aShortArray7 = null;
			}
		}
		if (this.anIntArrayArray3 != null && !Static274.method6846(this.anInt516, this.anInt534)) {
			this.aShortArray11 = null;
			this.anIntArrayArray3 = null;
		}
		if (this.anIntArrayArray4 != null && !Static31.method553(this.anInt516, this.anInt534)) {
			this.aShortArray3 = null;
			this.anIntArrayArray4 = null;
		}
		if (this.anIntArrayArray5 != null && !Static514.method7690(this.anInt516, this.anInt534)) {
			this.anIntArrayArray5 = null;
		}
		if (this.anIntArray26 != null && (this.anInt534 & 0x800) == 0 && (this.anInt534 & 0x40000) == 0) {
			this.anIntArray26 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V")
	private void method471() {
		if (this.anInt494 == 0) {
			return;
		}
		if (this.aByte6 != 0) {
			this.method462(true);
		}
		this.method462(false);
		if (this.aClass257_1 != null) {
			if (this.aClass257_1.anInterface10_4 == null) {
				this.method468((this.aByte6 & 0x10) != 0);
			}
			if (this.aClass257_1.anInterface10_4 != null) {
				this.aClass100_Sub3_6.method8926(this.aClass55_1 != null);
				this.aClass100_Sub3_6.method8885(this.aClass55_3, this.aClass55_2, this.aClass55_4, this.aClass55_1);
				@Pc(77) int local77 = this.anIntArray26.length - 1;
				for (@Pc(79) int local79 = 0; local79 < local77; local79++) {
					@Pc(86) int local86 = this.anIntArray26[local79];
					@Pc(93) int local93 = this.anIntArray26[local79 + 1];
					@Pc(100) int local100 = this.aShortArray6[local86] & 0xFFFF;
					if (local100 == 65535) {
						local100 = -1;
					}
					this.aClass100_Sub3_6.method8927(this.aClass55_1 != null, local100);
					this.aClass100_Sub3_6.method8901(this.aClass257_1.anInterface10_4, local86 * 3, (local93 - local86) * 3);
				}
			}
		}
		this.method470();
	}

	@OriginalMember(owner = "client!as", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean20) {
			this.method467();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!as", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean20) {
			this.method467();
		}
		return this.aShort2;
	}

	@OriginalMember(owner = "client!as", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean20) {
			this.method467();
		}
		return this.aShort10;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IILclient!ql;ZII)Z")
	@Override
	public boolean method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class154 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method460(arg4, arg3, arg1, arg2, arg0, arg5);
	}

	@OriginalMember(owner = "client!as", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean20) {
			this.method467();
		}
		return this.aShort3;
	}
}
