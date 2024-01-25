import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class164_Sub1 extends Class164 {

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
	private int anInt3797;

	@OriginalMember(owner = "client!ho", name = "Ec", descriptor = "Lclient!id;")
	private Class169 aClass169_1;

	@OriginalMember(owner = "client!ho", name = "Ab", descriptor = "I")
	private int anInt3802;

	@OriginalMember(owner = "client!ho", name = "Rb", descriptor = "Z")
	private boolean aBoolean297;

	@OriginalMember(owner = "client!ho", name = "A", descriptor = "Lclient!aba;")
	private Class4 aClass4_1;

	@OriginalMember(owner = "client!ho", name = "bb", descriptor = "I")
	private int anInt3806;

	@OriginalMember(owner = "client!ho", name = "G", descriptor = "Lclient!aba;")
	private Class4 aClass4_2;

	@OriginalMember(owner = "client!ho", name = "K", descriptor = "Lclient!kd;")
	private final Class57_Sub3 aClass57_Sub3_8;

	@OriginalMember(owner = "client!ho", name = "Cb", descriptor = "Z")
	private boolean aBoolean299;

	@OriginalMember(owner = "client!ho", name = "tc", descriptor = "Z")
	private boolean aBoolean300;

	@OriginalMember(owner = "client!ho", name = "zb", descriptor = "I")
	private int anInt3832;

	@OriginalMember(owner = "client!ho", name = "Vb", descriptor = "I")
	private int anInt3835;

	@OriginalMember(owner = "client!ho", name = "Mb", descriptor = "Lclient!aba;")
	private Class4 aClass4_3;

	@OriginalMember(owner = "client!ho", name = "ac", descriptor = "Lclient!aba;")
	private Class4 aClass4_4;

	@OriginalMember(owner = "client!ho", name = "Wb", descriptor = "I")
	private int anInt3843;

	@OriginalMember(owner = "client!ho", name = "vb", descriptor = "I")
	private int anInt3849;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
	private int anInt3855;

	@OriginalMember(owner = "client!ho", name = "ib", descriptor = "I")
	private int anInt3856;

	@OriginalMember(owner = "client!ho", name = "Jc", descriptor = "I")
	private int anInt3859;

	@OriginalMember(owner = "client!ho", name = "y", descriptor = "Lclient!dh;")
	private Class86 aClass86_1;

	@OriginalMember(owner = "client!ho", name = "bc", descriptor = "I")
	private int anInt3874;

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!ho", name = "zc", descriptor = "I")
	private int anInt3865;

	@OriginalMember(owner = "client!ho", name = "rc", descriptor = "I")
	private int anInt3798;

	@OriginalMember(owner = "client!ho", name = "kb", descriptor = "Z")
	private boolean aBoolean298;

	@OriginalMember(owner = "client!ho", name = "Xb", descriptor = "Z")
	private boolean aBoolean301;

	@OriginalMember(owner = "client!ho", name = "pb", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!ho", name = "Hb", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!ho", name = "U", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!ho", name = "Bb", descriptor = "I")
	private int anInt3845;

	@OriginalMember(owner = "client!ho", name = "mc", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!ho", name = "Z", descriptor = "I")
	private int anInt3868;

	@OriginalMember(owner = "client!ho", name = "fc", descriptor = "[Lclient!jk;")
	private Class189[] aClass189Array1;

	@OriginalMember(owner = "client!ho", name = "dc", descriptor = "[Lclient!hja;")
	private Class161[] aClass161Array1;

	@OriginalMember(owner = "client!ho", name = "qc", descriptor = "I")
	private int anInt3824;

	@OriginalMember(owner = "client!ho", name = "Ub", descriptor = "[Lclient!cw;")
	private Class79[] aClass79Array1;

	@OriginalMember(owner = "client!ho", name = "Nb", descriptor = "[Lclient!jca;")
	private Class183[] aClass183Array1;

	@OriginalMember(owner = "client!ho", name = "Gc", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!ho", name = "R", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!ho", name = "D", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!ho", name = "eb", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!ho", name = "Ic", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!ho", name = "yc", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!ho", name = "cb", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!ho", name = "V", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!ho", name = "W", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!ho", name = "Zb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!ho", name = "X", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "[F")
	private float[] aFloatArray30;

	@OriginalMember(owner = "client!ho", name = "ab", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!ho", name = "Lb", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!ho", name = "qb", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!ho", name = "xc", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!ho", name = "Fb", descriptor = "[F")
	private float[] aFloatArray29;

	@OriginalMember(owner = "client!ho", name = "Ac", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!ho", name = "uc", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!ho", name = "N", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!ho", name = "nc", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!ho", name = "kc", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!kd;Lclient!ju;IIII)V")
	public Class164_Sub1(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface1 local11 = arg0.anInterface1_11;
		this.anIntArray219 = new int[arg1.anInt5075 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt5085];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt5085; local24++) {
			if (arg1.aByteArray40 == null || arg1.aByteArray40[local24] != 2) {
				if (arg1.aShortArray74 != null && arg1.aShortArray74[local24] != -1) {
					@Pc(65) Class233 local65 = local11.method2863(arg1.aShortArray74[local24] & 0xFFFF);
					if (((this.anInt3856 & 0x40) == 0 || !local65.aBoolean482) && local65.aBoolean481) {
						continue;
					}
				}
				local22[this.anInt3865++] = local24;
				this.anIntArray219[arg1.aShortArray72[local24]]++;
				this.anIntArray219[arg1.aShortArray77[local24]]++;
				this.anIntArray219[arg1.aShortArray69[local24]]++;
			}
		}
		this.anInt3798 = this.anInt3865;
		@Pc(149) long[] local149 = new long[this.anInt3865];
		@Pc(161) boolean local161 = (this.anInt3855 & 0x100) != 0;
		@Pc(175) int local175;
		@Pc(188) int local188;
		@Pc(370) int local370;
		for (@Pc(163) int local163 = 0; local163 < this.anInt3865; local163++) {
			@Pc(171) int local171 = local22[local163];
			@Pc(173) Class233 local173 = null;
			local175 = 0;
			@Pc(177) byte local177 = 0;
			@Pc(179) byte local179 = 0;
			@Pc(181) byte local181 = 0;
			if (arg1.aClass106Array1 != null) {
				@Pc(186) boolean local186 = false;
				for (local188 = 0; local188 < arg1.aClass106Array1.length; local188++) {
					@Pc(195) Class106 local195 = arg1.aClass106Array1[local188];
					if (local171 == local195.anInt2265) {
						@Pc(208) Class251 local208 = Static107.method1556(local195.anInt2264);
						if (local208.aBoolean527) {
							local186 = true;
						}
						if (local208.anInt6810 != -1) {
							@Pc(224) Class233 local224 = local11.method2863(local208.anInt6810);
							if (local224.anInt6313 == 2) {
								this.aBoolean298 = true;
							}
						}
					}
				}
				if (local186) {
					local149[local163] = Long.MAX_VALUE;
					this.anInt3798--;
					continue;
				}
			}
			@Pc(265) short local265 = -1;
			if (arg1.aShortArray74 != null) {
				local265 = arg1.aShortArray74[local171];
				if (local265 != -1) {
					local173 = local11.method2863(local265 & 0xFFFF);
					if ((this.anInt3856 & 0x40) != 0 && local173.aBoolean482) {
						local173 = null;
						local265 = -1;
					} else {
						local179 = local173.aByte94;
						local181 = local173.aByte92;
					}
				}
			}
			@Pc(328) boolean local328 = arg1.aByteArray37 != null && arg1.aByteArray37[local171] != 0 || local173 != null && local173.anInt6313 != 0;
			if ((local161 || local328) && arg1.aByteArray42 != null) {
				local175 += arg1.aByteArray42[local171] << 17;
			}
			if (local328) {
				local175 += 65536;
			}
			local175 += (local179 & 0xFF) << 8;
			local370 = local177 + ((local265 & 0xFFFF) << 16);
			local175 += local181 & 0xFF;
			@Pc(382) int local382 = local370 + (local163 & 0xFFFF);
			local149[local163] = (long) local382 + ((long) local175 << 32);
			this.aBoolean301 |= local173 != null && (local173.aByte96 != 0 || local173.aByte93 != 0);
			this.aBoolean298 |= local328;
		}
		Static148.method2092(local149, local22);
		this.anIntArray220 = arg1.anIntArray278;
		this.anIntArray218 = arg1.anIntArray280;
		this.anIntArray217 = arg1.anIntArray281;
		this.anInt3845 = arg1.anInt5083;
		this.aShortArray30 = arg1.aShortArray78;
		this.anInt3868 = arg1.anInt5075;
		@Pc(467) Class255[] local467 = new Class255[this.anInt3868];
		this.aClass189Array1 = arg1.aClass189Array4;
		this.aClass161Array1 = arg1.aClass161Array4;
		@Pc(495) int local495;
		@Pc(511) int local511;
		@Pc(562) int local562;
		if (arg1.aClass106Array1 != null) {
			this.anInt3824 = arg1.aClass106Array1.length;
			this.aClass79Array1 = new Class79[this.anInt3824];
			this.aClass183Array1 = new Class183[this.anInt3824];
			for (local495 = 0; local495 < this.anInt3824; local495++) {
				@Pc(504) Class106 local504 = arg1.aClass106Array1[local495];
				@Pc(509) Class251 local509 = Static107.method1556(local504.anInt2264);
				local511 = -1;
				for (@Pc(513) int local513 = 0; local513 < this.anInt3865; local513++) {
					if (local504.anInt2265 == local22[local513]) {
						local511 = local513;
						break;
					}
				}
				if (local511 == -1) {
					throw new RuntimeException();
				}
				local562 = Static560.anIntArray534[arg1.aShortArray76[local504.anInt2265] & 0xFFFF] & 0xFFFFFF;
				@Pc(581) int local581 = local562 | 255 - (arg1.aByteArray37 == null ? 0 : arg1.aByteArray37[local504.anInt2265]) << 24;
				this.aClass183Array1[local495] = new Class183(local511, arg1.aShortArray72[local504.anInt2265], arg1.aShortArray77[local504.anInt2265], arg1.aShortArray69[local504.anInt2265], local509.anInt6814, local509.anInt6812, local509.anInt6810, local509.anInt6808, local509.anInt6811, local509.aBoolean527, local509.aBoolean528, local504.anInt2271);
				this.aClass79Array1[local495] = new Class79(local581);
			}
		}
		local495 = this.anInt3865 * 3;
		this.aShortArray28 = new short[local495];
		this.aShortArray36 = new short[this.anInt3865];
		this.aShort43 = (short) arg3;
		this.aShortArray35 = new short[local495];
		if (arg1.aShortArray71 != null) {
			this.aShortArray31 = new short[this.anInt3865];
		}
		this.aShortArray39 = new short[this.anInt3865];
		this.aShortArray38 = new short[local495];
		this.aShortArray33 = new short[local495];
		this.aShort42 = (short) arg4;
		this.aShortArray29 = new short[local495];
		this.aShortArray37 = new short[this.anInt3865];
		this.aShortArray27 = new short[local495];
		Static229.aLongArray9 = new long[local495];
		this.aFloatArray30 = new float[local495];
		this.aByteArray20 = new byte[local495];
		this.aByteArray21 = new byte[this.anInt3865];
		this.aShortArray32 = new short[this.anInt3865];
		this.aShortArray34 = new short[this.anInt3865];
		this.aFloatArray29 = new float[local495];
		local175 = 0;
		for (local370 = 0; local370 < arg1.anInt5075; local370++) {
			local511 = this.anIntArray219[local370];
			this.anIntArray219[local370] = local175;
			local467[local370] = new Class255();
			local175 += local511;
		}
		this.anIntArray219[arg1.anInt5075] = local175;
		@Pc(779) Class330 local779 = Static294.method4360(local22, this.anInt3865, arg1);
		@Pc(783) Class217[] local783 = new Class217[arg1.anInt5085];
		@Pc(826) int local826;
		@Pc(836) int local836;
		@Pc(847) int local847;
		@Pc(804) short local804;
		@Pc(815) int local815;
		for (local562 = 0; local562 < arg1.anInt5085; local562++) {
			@Pc(794) short local794 = arg1.aShortArray72[local562];
			@Pc(799) short local799 = arg1.aShortArray77[local562];
			local804 = arg1.aShortArray69[local562];
			local815 = this.anIntArray220[local799] - this.anIntArray220[local794];
			local826 = this.anIntArray218[local799] - this.anIntArray218[local794];
			local836 = this.anIntArray217[local799] - this.anIntArray217[local794];
			local847 = this.anIntArray220[local804] - this.anIntArray220[local794];
			@Pc(858) int local858 = this.anIntArray218[local804] - this.anIntArray218[local794];
			@Pc(869) int local869 = this.anIntArray217[local804] - this.anIntArray217[local794];
			@Pc(878) int local878 = local826 * local869 - local858 * local836;
			@Pc(887) int local887 = local836 * local847 - local815 * local869;
			@Pc(895) int local895 = local858 * local815 - local847 * local826;
			while (local878 > 8192 || local887 > 8192 || local895 > 8192 || local878 < -8192 || local887 < -8192 || local895 < -8192) {
				local895 >>= 0x1;
				local887 >>= 0x1;
				local878 >>= 0x1;
			}
			@Pc(956) int local956 = (int) Math.sqrt((double) (local878 * local878 + local887 * local887 + local895 * local895));
			if (local956 <= 0) {
				local956 = 1;
			}
			local878 = local878 * 256 / local956;
			local887 = local887 * 256 / local956;
			local895 = local895 * 256 / local956;
			@Pc(989) byte local989 = arg1.aByteArray40 == null ? 0 : arg1.aByteArray40[local562];
			if (local989 == 0) {
				@Pc(995) Class255 local995 = local467[local794];
				local995.anInt6932 += local887;
				local995.anInt6927 += local878;
				local995.anInt6931 += local895;
				local995.anInt6928++;
				@Pc(1023) Class255 local1023 = local467[local799];
				local1023.anInt6927 += local878;
				local1023.anInt6932 += local887;
				local1023.anInt6931 += local895;
				local1023.anInt6928++;
				@Pc(1051) Class255 local1051 = local467[local804];
				local1051.anInt6927 += local878;
				local1051.anInt6931 += local895;
				local1051.anInt6932 += local887;
				local1051.anInt6928++;
			} else if (local989 == 1) {
				@Pc(1090) Class217 local1090 = local783[local562] = new Class217();
				local1090.anInt6073 = local887;
				local1090.anInt6072 = local895;
				local1090.anInt6071 = local878;
			}
		}
		@Pc(1116) int local1116;
		@Pc(1160) short local1160;
		for (local188 = 0; local188 < this.anInt3865; local188++) {
			local1116 = local22[local188];
			@Pc(1123) int local1123 = arg1.aShortArray76[local1116] & 0xFFFF;
			if (arg1.aByteArray41 == null) {
				local815 = -1;
			} else {
				local815 = arg1.aByteArray41[local1116];
			}
			if (arg1.aByteArray37 == null) {
				local826 = 0;
			} else {
				local826 = arg1.aByteArray37[local1116] & 0xFF;
			}
			local1160 = arg1.aShortArray74 == null ? -1 : arg1.aShortArray74[local1116];
			if (local1160 != -1 && (this.anInt3856 & 0x40) != 0) {
				@Pc(1180) Class233 local1180 = local11.method2863(local1160 & 0xFFFF);
				if (local1180.aBoolean482) {
					local1160 = -1;
				}
			}
			@Pc(1187) float local1187 = 0.0F;
			@Pc(1189) float local1189 = 0.0F;
			@Pc(1191) float local1191 = 0.0F;
			@Pc(1193) float local1193 = 0.0F;
			@Pc(1195) float local1195 = 0.0F;
			@Pc(1197) float local1197 = 0.0F;
			@Pc(1199) byte local1199 = 0;
			@Pc(1201) byte local1201 = 0;
			@Pc(1203) int local1203 = 0;
			@Pc(1221) byte local1221;
			@Pc(1241) short local1241;
			@Pc(2061) short local2061;
			@Pc(2066) short local2066;
			if (local1160 != -1) {
				if (local815 == -1) {
					local1201 = 2;
					local1189 = 1.0F;
					local1197 = 0.0F;
					local1193 = 1.0F;
					local1187 = 0.0F;
					local1199 = 1;
					local1195 = 0.0F;
					local1191 = 1.0F;
				} else {
					local815 &= 0xFF;
					local1221 = arg1.aByteArray43[local815];
					@Pc(1231) short local1231;
					@Pc(1236) short local1236;
					@Pc(1274) float local1274;
					@Pc(1287) float local1287;
					@Pc(1381) float local1381;
					@Pc(1630) float local1630;
					@Pc(1638) float local1638;
					@Pc(1646) float local1646;
					@Pc(1669) float local1669;
					@Pc(1692) float local1692;
					@Pc(1715) float local1715;
					if (local1221 == 0) {
						local1231 = arg1.aShortArray72[local1116];
						local1236 = arg1.aShortArray77[local1116];
						local1241 = arg1.aShortArray69[local1116];
						local2061 = arg1.aShortArray75[local815];
						local2066 = arg1.aShortArray70[local815];
						@Pc(2071) short local2071 = arg1.aShortArray73[local815];
						@Pc(2077) float local2077 = (float) arg1.anIntArray278[local2061];
						@Pc(2083) float local2083 = (float) arg1.anIntArray280[local2061];
						local1274 = (float) arg1.anIntArray281[local2061];
						local1287 = (float) arg1.anIntArray278[local2066] - local2077;
						local1381 = (float) arg1.anIntArray280[local2066] - local2083;
						@Pc(2116) float local2116 = (float) arg1.anIntArray281[local2066] - local1274;
						@Pc(2124) float local2124 = (float) arg1.anIntArray278[local2071] - local2077;
						@Pc(2133) float local2133 = (float) arg1.anIntArray280[local2071] - local2083;
						@Pc(2142) float local2142 = (float) arg1.anIntArray281[local2071] - local1274;
						@Pc(2150) float local2150 = (float) arg1.anIntArray278[local1231] - local2077;
						@Pc(2159) float local2159 = (float) arg1.anIntArray280[local1231] - local2083;
						@Pc(2168) float local2168 = (float) arg1.anIntArray281[local1231] - local1274;
						@Pc(2177) float local2177 = (float) arg1.anIntArray278[local1236] - local2077;
						@Pc(2186) float local2186 = (float) arg1.anIntArray280[local1236] - local2083;
						local1630 = (float) arg1.anIntArray281[local1236] - local1274;
						local1638 = (float) arg1.anIntArray278[local1241] - local2077;
						local1646 = (float) arg1.anIntArray280[local1241] - local2083;
						local1669 = (float) arg1.anIntArray281[local1241] - local1274;
						local1692 = local1381 * local2142 - local2133 * local2116;
						local1715 = local2124 * local2116 - local1287 * local2142;
						@Pc(2245) float local2245 = local2133 * local1287 - local1381 * local2124;
						@Pc(2253) float local2253 = local2133 * local2245 - local1715 * local2142;
						@Pc(2261) float local2261 = local1692 * local2142 - local2245 * local2124;
						@Pc(2269) float local2269 = local1715 * local2124 - local2133 * local1692;
						@Pc(2283) float local2283 = 1.0F / (local1381 * local2261 + local2253 * local1287 + local2116 * local2269);
						local1191 = local2283 * (local2177 * local2253 + local2261 * local2186 + local1630 * local2269);
						local1195 = local2283 * (local1646 * local2261 + local1638 * local2253 + local1669 * local2269);
						local1187 = (local2150 * local2253 + local2159 * local2261 + local2269 * local2168) * local2283;
						@Pc(2334) float local2334 = local2245 * local1381 - local2116 * local1715;
						@Pc(2343) float local2343 = local1692 * local2116 - local2245 * local1287;
						@Pc(2352) float local2352 = local1715 * local1287 - local1381 * local1692;
						@Pc(2366) float local2366 = 1.0F / (local2352 * local2142 + local2343 * local2133 + local2334 * local2124);
						local1193 = local2366 * (local2343 * local2186 + local2177 * local2334 + local1630 * local2352);
						local1197 = local2366 * (local2343 * local1646 + local2334 * local1638 + local2352 * local1669);
						local1189 = local2366 * (local2150 * local2334 + local2343 * local2159 + local2168 * local2352);
					} else {
						local1231 = arg1.aShortArray72[local1116];
						local1236 = arg1.aShortArray77[local1116];
						local1241 = arg1.aShortArray69[local1116];
						@Pc(1246) int local1246 = local779.anIntArray530[local815];
						@Pc(1251) int local1251 = local779.anIntArray532[local815];
						@Pc(1256) int local1256 = local779.anIntArray531[local815];
						@Pc(1261) float[] local1261 = local779.aFloatArrayArray15[local815];
						@Pc(1266) byte local1266 = arg1.aByteArray39[local815];
						local1274 = (float) arg1.anIntArray285[local815] / 256.0F;
						if (local1221 == 1) {
							local1287 = (float) arg1.anIntArray277[local815] / 1024.0F;
							Static650.method2004(arg1.anIntArray280[local1231], local1266, local1274, local1256, local1251, arg1.anIntArray278[local1231], local1287, arg1.anIntArray281[local1231], local1246, local1261, Static96.aFloatArray13);
							local1189 = Static96.aFloatArray13[1];
							local1187 = Static96.aFloatArray13[0];
							Static650.method2004(arg1.anIntArray280[local1236], local1266, local1274, local1256, local1251, arg1.anIntArray278[local1236], local1287, arg1.anIntArray281[local1236], local1246, local1261, Static96.aFloatArray13);
							local1193 = Static96.aFloatArray13[1];
							local1191 = Static96.aFloatArray13[0];
							Static650.method2004(arg1.anIntArray280[local1241], local1266, local1274, local1256, local1251, arg1.anIntArray278[local1241], local1287, arg1.anIntArray281[local1241], local1246, local1261, Static96.aFloatArray13);
							local1197 = Static96.aFloatArray13[1];
							local1195 = Static96.aFloatArray13[0];
							local1381 = local1287 / 2.0F;
							if ((local1266 & 0x1) == 0) {
								if (local1195 - local1187 > local1381) {
									local1201 = 1;
									local1195 -= local1287;
								} else if (local1187 - local1195 > local1381) {
									local1195 += local1287;
									local1201 = 2;
								}
								if (local1381 < local1191 - local1187) {
									local1191 -= local1287;
									local1199 = 1;
								} else if (local1187 - local1191 > local1381) {
									local1199 = 2;
									local1191 += local1287;
								}
							} else {
								if (local1197 - local1189 > local1381) {
									local1197 -= local1287;
									local1201 = 1;
								} else if (local1189 - local1197 > local1381) {
									local1201 = 2;
									local1197 += local1287;
								}
								if (local1193 - local1189 > local1381) {
									local1199 = 1;
									local1193 -= local1287;
								} else if (local1189 - local1193 > local1381) {
									local1199 = 2;
									local1193 += local1287;
								}
							}
						} else if (local1221 == 2) {
							local1287 = (float) arg1.anIntArray282[local815] / 256.0F;
							local1381 = (float) arg1.anIntArray286[local815] / 256.0F;
							@Pc(1544) int local1544 = arg1.anIntArray278[local1236] - arg1.anIntArray278[local1231];
							@Pc(1555) int local1555 = arg1.anIntArray280[local1236] - arg1.anIntArray280[local1231];
							@Pc(1566) int local1566 = arg1.anIntArray281[local1236] - arg1.anIntArray281[local1231];
							@Pc(1577) int local1577 = arg1.anIntArray278[local1241] - arg1.anIntArray278[local1231];
							@Pc(1587) int local1587 = arg1.anIntArray280[local1241] - arg1.anIntArray280[local1231];
							@Pc(1597) int local1597 = arg1.anIntArray281[local1241] - arg1.anIntArray281[local1231];
							@Pc(1605) int local1605 = local1555 * local1597 - local1566 * local1587;
							@Pc(1614) int local1614 = local1577 * local1566 - local1544 * local1597;
							@Pc(1622) int local1622 = local1587 * local1544 - local1577 * local1555;
							local1630 = 64.0F / (float) arg1.anIntArray279[local815];
							local1638 = 64.0F / (float) arg1.anIntArray283[local815];
							local1646 = 64.0F / (float) arg1.anIntArray277[local815];
							local1669 = ((float) local1605 * local1261[0] + local1261[1] * (float) local1614 + local1261[2] * (float) local1622) / local1630;
							local1692 = (local1261[5] * (float) local1622 + (float) local1605 * local1261[3] + (float) local1614 * local1261[4]) / local1638;
							local1715 = (local1261[6] * (float) local1605 + local1261[7] * (float) local1614 + local1261[8] * (float) local1622) / local1646;
							local1203 = Static528.method7605(local1692, local1715, local1669);
							Static513.method7489(local1246, arg1.anIntArray280[local1231], local1266, Static96.aFloatArray13, local1203, local1287, arg1.anIntArray281[local1231], local1274, local1261, local1256, local1251, local1381, arg1.anIntArray278[local1231]);
							local1187 = Static96.aFloatArray13[0];
							local1189 = Static96.aFloatArray13[1];
							Static513.method7489(local1246, arg1.anIntArray280[local1236], local1266, Static96.aFloatArray13, local1203, local1287, arg1.anIntArray281[local1236], local1274, local1261, local1256, local1251, local1381, arg1.anIntArray278[local1236]);
							local1193 = Static96.aFloatArray13[1];
							local1191 = Static96.aFloatArray13[0];
							Static513.method7489(local1246, arg1.anIntArray280[local1241], local1266, Static96.aFloatArray13, local1203, local1287, arg1.anIntArray281[local1241], local1274, local1261, local1256, local1251, local1381, arg1.anIntArray278[local1241]);
							local1195 = Static96.aFloatArray13[0];
							local1197 = Static96.aFloatArray13[1];
						} else if (local1221 == 3) {
							Static464.method6791(local1261, local1246, local1251, Static96.aFloatArray13, arg1.anIntArray281[local1231], local1256, local1274, arg1.anIntArray280[local1231], local1266, arg1.anIntArray278[local1231]);
							local1189 = Static96.aFloatArray13[1];
							local1187 = Static96.aFloatArray13[0];
							Static464.method6791(local1261, local1246, local1251, Static96.aFloatArray13, arg1.anIntArray281[local1236], local1256, local1274, arg1.anIntArray280[local1236], local1266, arg1.anIntArray278[local1236]);
							local1191 = Static96.aFloatArray13[0];
							local1193 = Static96.aFloatArray13[1];
							Static464.method6791(local1261, local1246, local1251, Static96.aFloatArray13, arg1.anIntArray281[local1241], local1256, local1274, arg1.anIntArray280[local1241], local1266, arg1.anIntArray278[local1241]);
							local1197 = Static96.aFloatArray13[1];
							local1195 = Static96.aFloatArray13[0];
							if ((local1266 & 0x1) == 0) {
								if (local1191 - local1187 > 0.5F) {
									local1199 = 1;
									local1191--;
								} else if (local1187 - local1191 > 0.5F) {
									local1199 = 2;
									local1191++;
								}
								if (local1195 - local1187 > 0.5F) {
									local1201 = 1;
									local1195--;
								} else if (local1187 - local1195 > 0.5F) {
									local1195++;
									local1201 = 2;
								}
							} else {
								if (local1197 - local1189 > 0.5F) {
									local1201 = 1;
									local1197--;
								} else if (local1189 - local1197 > 0.5F) {
									local1197++;
									local1201 = 2;
								}
								if (local1193 - local1189 > 0.5F) {
									local1193--;
									local1199 = 1;
								} else if (local1189 - local1193 > 0.5F) {
									local1199 = 2;
									local1193++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray40 == null) {
				local1221 = 0;
			} else {
				local1221 = arg1.aByteArray40[local1116];
			}
			if (local1221 == 0) {
				@Pc(2593) long local2593 = (long) (local815 << 2) + ((long) (local1123 << 8) + (long) (local1203 << 24) + (long) local826 << 32);
				local1241 = arg1.aShortArray72[local1116];
				local2061 = arg1.aShortArray77[local1116];
				local2066 = arg1.aShortArray69[local1116];
				@Pc(2612) Class255 local2612 = local467[local1241];
				this.aShortArray36[local188] = this.method3350(local2612.anInt6931, local1241, local2612.anInt6928, local2593, local1189, local2612.anInt6927, local2612.anInt6932, local188, local1187, arg1);
				@Pc(2637) Class255 local2637 = local467[local2061];
				this.aShortArray34[local188] = this.method3350(local2637.anInt6931, local2061, local2637.anInt6928, local2593 + (long) local1199, local1193, local2637.anInt6927, local2637.anInt6932, local188, local1191, arg1);
				@Pc(2665) Class255 local2665 = local467[local2066];
				this.aShortArray37[local188] = this.method3350(local2665.anInt6931, local2066, local2665.anInt6928, (long) local1201 + local2593, local1197, local2665.anInt6927, local2665.anInt6932, local188, local1195, arg1);
			} else if (local1221 == 1) {
				@Pc(2452) Class217 local2452 = local783[local1116];
				@Pc(2495) long local2495 = ((long) local826 + (long) (local1203 << 24) + (long) (local1123 << 8) << 32) + (long) ((local2452.anInt6072 + 256 << 22) + (local2452.anInt6073 + 256 << 12) + (local815 << 2) + (local2452.anInt6071 > 0 ? 1024 : 2048));
				this.aShortArray36[local188] = this.method3350(local2452.anInt6072, arg1.aShortArray72[local1116], 0, local2495, local1189, local2452.anInt6071, local2452.anInt6073, local188, local1187, arg1);
				this.aShortArray34[local188] = this.method3350(local2452.anInt6072, arg1.aShortArray77[local1116], 0, (long) local1199 + local2495, local1193, local2452.anInt6071, local2452.anInt6073, local188, local1191, arg1);
				this.aShortArray37[local188] = this.method3350(local2452.anInt6072, arg1.aShortArray69[local1116], 0, local2495 + (long) local1201, local1197, local2452.anInt6071, local2452.anInt6073, local188, local1195, arg1);
			}
			if (arg1.aByteArray37 != null) {
				this.aByteArray21[local188] = arg1.aByteArray37[local1116];
			}
			if (arg1.aShortArray71 != null) {
				this.aShortArray31[local188] = arg1.aShortArray71[local1116];
			}
			this.aShortArray32[local188] = arg1.aShortArray76[local1116];
			this.aShortArray39[local188] = local1160;
		}
		if (this.anInt3798 > 0) {
			local1116 = 1;
			local804 = this.aShortArray39[0];
			for (local815 = 0; local815 < this.anInt3798; local815++) {
				@Pc(2756) short local2756 = this.aShortArray39[local815];
				if (local2756 != local804) {
					local1116++;
					local804 = local2756;
				}
			}
			this.anIntArray215 = new int[local1116 + 1];
			this.anIntArray214 = new int[local1116];
			this.anIntArray216 = new int[local1116];
			this.anIntArray215[0] = 0;
			local826 = this.anInt3806;
			local804 = this.aShortArray39[0];
			local1160 = 0;
			local1116 = 0;
			for (local847 = 0; local847 < this.anInt3798; local847++) {
				@Pc(2819) short local2819 = this.aShortArray39[local847];
				if (local804 != local2819) {
					this.anIntArray216[local1116] = local826;
					this.anIntArray214[local1116] = local1160 + 1 - local826;
					local1116++;
					this.anIntArray215[local1116] = local847;
					local804 = local2819;
					local826 = this.anInt3806;
					local1160 = 0;
				}
				@Pc(2855) short local2855 = this.aShortArray36[local847];
				if (local2855 > local1160) {
					local1160 = local2855;
				}
				if (local826 > local2855) {
					local826 = local2855;
				}
				local2855 = this.aShortArray34[local847];
				if (local1160 < local2855) {
					local1160 = local2855;
				}
				if (local2855 < local826) {
					local826 = local2855;
				}
				local2855 = this.aShortArray37[local847];
				if (local1160 < local2855) {
					local1160 = local2855;
				}
				if (local826 > local2855) {
					local826 = local2855;
				}
			}
			this.anIntArray216[local1116] = local826;
			this.anIntArray214[local1116] = local1160 + 1 - local826;
			local1116++;
			this.anIntArray215[local1116] = this.anInt3798;
		}
		Static229.aLongArray9 = null;
		this.aShortArray38 = Static451.method6677(this.anInt3806, this.aShortArray38);
		this.aShortArray33 = Static451.method6677(this.anInt3806, this.aShortArray33);
		this.aShortArray28 = Static451.method6677(this.anInt3806, this.aShortArray28);
		this.aShortArray27 = Static451.method6677(this.anInt3806, this.aShortArray27);
		this.aShortArray35 = Static451.method6677(this.anInt3806, this.aShortArray35);
		this.aByteArray20 = Static41.method692(this.aByteArray20, this.anInt3806);
		this.aFloatArray30 = Static463.method6784(this.aFloatArray30, this.anInt3806);
		this.aFloatArray29 = Static463.method6784(this.aFloatArray29, this.anInt3806);
		if (arg1.anIntArray276 != null && Static329.method5018(this.anInt3856, arg2)) {
			this.anIntArrayArray24 = arg1.method4329(false);
		}
		if (arg1.aClass106Array1 != null && Static644.method8990(this.anInt3856, arg2)) {
			this.anIntArrayArray25 = arg1.method4323();
		}
		if (arg1.anIntArray284 != null && Static25.method379(this.anInt3856, arg2)) {
			local1116 = 0;
			@Pc(3053) int[] local3053 = new int[256];
			for (local815 = 0; local815 < this.anInt3865; local815++) {
				local826 = arg1.anIntArray284[local22[local815]];
				if (local826 >= 0) {
					if (local826 > local1116) {
						local1116 = local826;
					}
					@Pc(3077) int local3077 = local3053[local826]++;
				}
			}
			this.anIntArrayArray23 = new int[local1116 + 1][];
			for (local826 = 0; local826 <= local1116; local826++) {
				this.anIntArrayArray23[local826] = new int[local3053[local826]];
				local3053[local826] = 0;
			}
			for (local836 = 0; local836 < this.anInt3865; local836++) {
				local847 = arg1.anIntArray284[local22[local836]];
				if (local847 >= 0) {
					this.anIntArrayArray23[local847][local3053[local847]++] = local836;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!kd;IIZZ)V")
	public Class164_Sub1(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean297 = true;
		this.anInt3806 = 0;
		this.aBoolean298 = false;
		this.anInt3798 = 0;
		this.aBoolean300 = false;
		this.aBoolean301 = false;
		this.aBoolean299 = false;
		this.anInt3868 = 0;
		this.anInt3845 = 0;
		this.anInt3865 = 0;
		this.aBoolean299 = arg4;
		this.aClass57_Sub3_8 = arg0;
		this.anInt3855 = arg1;
		this.anInt3856 = arg2;
		if (arg3 || Static22.method317(this.anInt3855, this.anInt3856)) {
			this.aClass4_1 = new Class4(Static38.method660(this.anInt3856, this.anInt3855));
		}
		if (arg3 || Static71.method1124(this.anInt3855, this.anInt3856)) {
			this.aClass4_4 = new Class4(Static331.method5044(this.anInt3855, this.anInt3856));
		}
		if (arg3 || Static126.method1774(this.anInt3855, this.anInt3856)) {
			this.aClass4_2 = new Class4(Static552.method7996(this.anInt3855, this.anInt3856));
		}
		if (arg3 || Static300.method4404(this.anInt3855, this.anInt3856)) {
			this.aClass4_3 = new Class4(Static25.method377(this.anInt3855, this.anInt3856));
		}
		if (arg3 || Static631.method8845(this.anInt3855, this.anInt3856)) {
			this.aClass169_1 = new Class169(Static247.method3635(this.anInt3856, this.anInt3855));
		}
	}

	@OriginalMember(owner = "client!ho", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean300) {
			this.method3348();
		}
		return this.anInt3859;
	}

	@OriginalMember(owner = "client!ho", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean300) {
			this.method3348();
		}
		return this.anInt3849;
	}

	@OriginalMember(owner = "client!ho", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		if (arg0 == 0) {
			local12 = 0;
			Static515.anInt8758 = 0;
			Static375.anInt6448 = 0;
			Static289.anInt10753 = 0;
			for (local20 = 0; local20 < this.anInt3868; local20++) {
				Static515.anInt8758 += this.anIntArray220[local20];
				Static289.anInt10753 += this.anIntArray218[local20];
				Static375.anInt6448 += this.anIntArray217[local20];
				local12++;
			}
			if (local12 <= 0) {
				Static289.anInt10753 = arg2;
				Static375.anInt6448 = arg3;
				Static515.anInt8758 = arg1;
			} else {
				Static375.anInt6448 = Static375.anInt6448 / local12 + arg3;
				Static289.anInt10753 = arg2 + Static289.anInt10753 / local12;
				Static515.anInt8758 = Static515.anInt8758 / local12 + arg1;
			}
		} else if (arg0 == 1) {
			for (local12 = 0; local12 < this.anInt3868; local12++) {
				this.anIntArray220[local12] += arg1;
				this.anIntArray218[local12] += arg2;
				this.anIntArray217[local12] += arg3;
			}
		} else {
			@Pc(185) int local185;
			@Pc(203) int local203;
			if (arg0 == 2) {
				for (local12 = 0; local12 < this.anInt3868; local12++) {
					this.anIntArray220[local12] -= Static515.anInt8758;
					this.anIntArray218[local12] -= Static289.anInt10753;
					this.anIntArray217[local12] -= Static375.anInt6448;
					if (arg3 != 0) {
						local20 = Class5_Sub12.anIntArray544[arg3];
						local185 = Class5_Sub12.anIntArray543[arg3];
						local203 = this.anIntArray220[local12] * local185 + this.anIntArray218[local12] * local20 + 16383 >> 14;
						this.anIntArray218[local12] = local185 * this.anIntArray218[local12] + 16383 - this.anIntArray220[local12] * local20 >> 14;
						this.anIntArray220[local12] = local203;
					}
					if (arg1 != 0) {
						local20 = Class5_Sub12.anIntArray544[arg1];
						local185 = Class5_Sub12.anIntArray543[arg1];
						local203 = local185 * this.anIntArray218[local12] + 16383 - local20 * this.anIntArray217[local12] >> 14;
						this.anIntArray217[local12] = local20 * this.anIntArray218[local12] + local185 * this.anIntArray217[local12] + 16383 >> 14;
						this.anIntArray218[local12] = local203;
					}
					if (arg2 != 0) {
						local20 = Class5_Sub12.anIntArray544[arg2];
						local185 = Class5_Sub12.anIntArray543[arg2];
						local203 = local185 * this.anIntArray220[local12] + local20 * this.anIntArray217[local12] + 16383 >> 14;
						this.anIntArray217[local12] = local185 * this.anIntArray217[local12] + 16383 - this.anIntArray220[local12] * local20 >> 14;
						this.anIntArray220[local12] = local203;
					}
					this.anIntArray220[local12] += Static515.anInt8758;
					this.anIntArray218[local12] += Static289.anInt10753;
					this.anIntArray217[local12] += Static375.anInt6448;
				}
			} else if (arg0 == 3) {
				for (local12 = 0; local12 < this.anInt3868; local12++) {
					this.anIntArray220[local12] -= Static515.anInt8758;
					this.anIntArray218[local12] -= Static289.anInt10753;
					this.anIntArray217[local12] -= Static375.anInt6448;
					this.anIntArray220[local12] = arg1 * this.anIntArray220[local12] / 128;
					this.anIntArray218[local12] = arg2 * this.anIntArray218[local12] / 128;
					this.anIntArray217[local12] = arg3 * this.anIntArray217[local12] / 128;
					this.anIntArray220[local12] += Static515.anInt8758;
					this.anIntArray218[local12] += Static289.anInt10753;
					this.anIntArray217[local12] += Static375.anInt6448;
				}
			} else {
				@Pc(543) Class183 local543;
				@Pc(548) Class79 local548;
				if (arg0 == 5) {
					for (local12 = 0; local12 < this.anInt3865; local12++) {
						local20 = arg1 * 8 + (this.aByteArray21[local12] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray21[local12] = (byte) local20;
					}
					if (this.aClass183Array1 != null) {
						for (local20 = 0; local20 < this.anInt3824; local20++) {
							local543 = this.aClass183Array1[local20];
							local548 = this.aClass79Array1[local20];
							local548.anInt1516 = local548.anInt1516 & 0xFFFFFF | 255 - (this.aByteArray21[local543.anInt4687] & 0xFF) << 24;
						}
					}
					this.method3359();
				} else if (arg0 == 7) {
					for (local12 = 0; local12 < this.anInt3865; local12++) {
						local20 = this.aShortArray32[local12] & 0xFFFF;
						local185 = local20 >> 10 & 0x3F;
						local203 = local20 >> 7 & 0x7;
						local203 += arg2 / 4;
						@Pc(624) int local624 = local185 + arg1 & 0x3F;
						@Pc(628) int local628 = local20 & 0x7F;
						if (local203 < 0) {
							local203 = 0;
						} else if (local203 > 7) {
							local203 = 7;
						}
						local628 += arg3;
						if (local628 < 0) {
							local628 = 0;
						} else if (local628 > 127) {
							local628 = 127;
						}
						this.aShortArray32[local12] = (short) (local628 | local624 << 10 | local203 << 7);
					}
					if (this.aClass183Array1 != null) {
						for (local20 = 0; local20 < this.anInt3824; local20++) {
							local543 = this.aClass183Array1[local20];
							local548 = this.aClass79Array1[local20];
							local548.anInt1516 = Static560.anIntArray534[this.aShortArray32[local543.anInt4687] & 0xFFFF] & 0xFFFFFF | local548.anInt1516 & 0xFF000000;
						}
					}
					this.method3359();
				} else {
					@Pc(752) Class79 local752;
					if (arg0 == 8) {
						for (local12 = 0; local12 < this.anInt3824; local12++) {
							local752 = this.aClass79Array1[local12];
							local752.anInt1519 += arg1;
							local752.anInt1518 += arg2;
						}
					} else if (arg0 == 10) {
						for (local12 = 0; local12 < this.anInt3824; local12++) {
							local752 = this.aClass79Array1[local12];
							local752.anInt1523 = local752.anInt1523 * arg1 >> 7;
							local752.anInt1524 = arg2 * local752.anInt1524 >> 7;
						}
					} else if (arg0 == 9) {
						for (local12 = 0; local12 < this.anInt3824; local12++) {
							local752 = this.aClass79Array1[local12];
							local752.anInt1521 = local752.anInt1521 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V")
	private void method3343() {
		if (this.aClass4_1 != null) {
			this.aClass4_1.aBoolean3 = false;
		}
	}

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean301;
	}

	@OriginalMember(owner = "client!ho", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3868; local3++) {
			if (arg0 != 0) {
				this.anIntArray220[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray218[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray217[local3] += arg2;
			}
		}
		this.method3343();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass4_1 != null) {
			this.aClass4_1.aBoolean4 = Static38.method660(this.anInt3856, arg0);
		}
		if (this.aClass4_4 != null) {
			this.aClass4_4.aBoolean4 = Static331.method5044(arg0, this.anInt3856);
		}
		if (this.aClass4_2 != null) {
			this.aClass4_2.aBoolean4 = Static552.method7996(arg0, this.anInt3856);
		}
		if (this.aClass4_3 != null) {
			this.aClass4_3.aBoolean4 = Static25.method377(arg0, this.anInt3856);
		}
		this.anInt3855 = arg0;
		this.aBoolean297 = true;
		if (this.aClass86_1 != null && (this.anInt3855 & 0x10000) == 0) {
			this.aShortArray27 = this.aClass86_1.aShortArray15;
			this.aShortArray35 = this.aClass86_1.aShortArray16;
			this.aByteArray20 = this.aClass86_1.aByteArray9;
			this.aShortArray28 = this.aClass86_1.aShortArray14;
			this.aClass86_1 = null;
		}
		this.method3347();
	}

	@OriginalMember(owner = "client!ho", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3868; local7++) {
			if (arg0 != 128) {
				this.anIntArray220[local7] = arg0 * this.anIntArray220[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray218[local7] = this.anIntArray218[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray217[local7] = arg2 * this.anIntArray217[local7] >> 7;
			}
		}
		this.method3343();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(B)V")
	private void method3344() {
		if (this.aClass169_1 != null) {
			this.aClass169_1.aBoolean333 = false;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!qq;IZ)V")
	@Override
	public void method9084(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray30 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3868; local15++) {
			if ((this.aShortArray30[local15] & arg1) != 0) {
				if (arg2) {
					arg0.method8334(this.anIntArray220[local15], this.anIntArray218[local15], this.anIntArray217[local15], local13);
				} else {
					arg0.method8325(this.anIntArray220[local15], this.anIntArray218[local15], this.anIntArray217[local15], local13);
				}
				this.anIntArray220[local15] = local13[0];
				this.anIntArray218[local15] = local13[1];
				this.anIntArray217[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt3855;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		for (@Pc(3) int local3 = 0; local3 < this.anInt3865; local3++) {
			local14 = this.aShortArray32[local3] & 0xFFFF;
			@Pc(20) int local20 = local14 >> 10 & 0x3F;
			@Pc(26) int local26 = local14 >> 7 & 0x7;
			@Pc(30) int local30 = local14 & 0x7F;
			if (arg0 != -1) {
				local20 += arg3 * (arg0 - local20) >> 7;
			}
			if (arg1 != -1) {
				local26 += arg3 * (arg1 - local26) >> 7;
			}
			if (arg2 != -1) {
				local30 += (arg2 - local30) * arg3 >> 7;
			}
			this.aShortArray32[local3] = (short) (local26 << 7 | local20 << 10 | local30);
		}
		Static231.anInt3831++;
		if (this.aClass183Array1 != null) {
			for (local14 = 0; local14 < this.anInt3824; local14++) {
				@Pc(116) Class183 local116 = this.aClass183Array1[local14];
				@Pc(121) Class79 local121 = this.aClass79Array1[local14];
				local121.anInt1516 = local121.anInt1516 & 0xFF000000 | Static560.anIntArray534[this.aShortArray32[local116.anInt4687] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3359();
	}

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "(I)Z")
	private boolean method3345() {
		@Pc(14) boolean local14 = !this.aClass4_2.aBoolean3;
		@Pc(30) boolean local30 = (this.anInt3856 & 0x37) != 0 && !this.aClass4_3.aBoolean3;
		@Pc(39) boolean local39 = !this.aClass4_1.aBoolean3;
		@Pc(48) boolean local48 = !this.aClass4_4.aBoolean3;
		if (!local39 && !local14 && !local30 && !local48) {
			return true;
		}
		@Pc(75) boolean local75 = true;
		@Pc(98) Interface25 local98;
		@Pc(112) Buffer local112;
		if (local39) {
			if (this.aClass4_1.anInterface25_2 == null) {
				this.aClass4_1.anInterface25_2 = this.aClass57_Sub3_8.method7784(this.aBoolean299);
			}
			local98 = this.aClass4_1.anInterface25_2;
			local98.method2907(12, this.anInt3806 * 12);
			local112 = local98.method2909();
			if (local112 == null) {
				local75 = false;
			} else {
				this.aClass57_Sub3_8.aNativeInterface3.copyPositions(this.anIntArray220, this.anIntArray218, this.anIntArray217, this.aShortArray38, 0, 12, this.anInt3806, local112.getAddress());
				if (local98.method2908()) {
					this.aClass4_1.aBoolean3 = true;
					this.aClass4_1.anInterface25_1 = local98;
				} else {
					local75 = false;
				}
			}
		}
		@Pc(242) short[] local242;
		@Pc(250) short[] local250;
		@Pc(254) short[] local254;
		@Pc(246) byte[] local246;
		if (local14) {
			if (this.aClass4_2.anInterface25_2 == null) {
				this.aClass4_2.anInterface25_2 = this.aClass57_Sub3_8.method7784(this.aBoolean299);
			}
			local98 = this.aClass4_2.anInterface25_2;
			local98.method2907(4, this.anInt3806 * 4);
			local112 = local98.method2909();
			if (local112 == null) {
				local75 = false;
			} else {
				if ((this.anInt3856 & 0x37) == 0) {
					if (this.aClass86_1 == null) {
						local246 = this.aByteArray20;
						local254 = this.aShortArray35;
						local250 = this.aShortArray27;
						local242 = this.aShortArray28;
					} else {
						local242 = this.aClass86_1.aShortArray14;
						local246 = this.aClass86_1.aByteArray9;
						local250 = this.aClass86_1.aShortArray15;
						local254 = this.aClass86_1.aShortArray16;
					}
					this.aClass57_Sub3_8.aNativeInterface3.copyLighting(this.aShortArray32, this.aByteArray21, this.aShortArray39, local242, local250, local254, local246, this.aShort43, this.aShort42, this.aShortArray33, 0, 4, this.anInt3806, local112.getAddress());
				} else {
					this.aClass57_Sub3_8.aNativeInterface3.copyColours(this.aShortArray32, this.aByteArray21, this.aShortArray39, this.aShort43, this.aShortArray33, 0, 4, this.anInt3806, local112.getAddress());
				}
				if (local98.method2908()) {
					this.aClass4_2.anInterface25_1 = local98;
					this.aClass4_2.aBoolean3 = true;
				} else {
					local75 = false;
				}
			}
		}
		if (local30) {
			if (this.aClass4_3.anInterface25_2 == null) {
				this.aClass4_3.anInterface25_2 = this.aClass57_Sub3_8.method7784(this.aBoolean299);
			}
			local98 = this.aClass4_3.anInterface25_2;
			local98.method2907(12, this.anInt3806 * 12);
			local112 = local98.method2909();
			if (local112 == null) {
				local75 = false;
			} else {
				if (this.aClass86_1 == null) {
					local250 = this.aShortArray27;
					local242 = this.aShortArray28;
					local254 = this.aShortArray35;
					local246 = this.aByteArray20;
				} else {
					local250 = this.aClass86_1.aShortArray15;
					local254 = this.aClass86_1.aShortArray16;
					local242 = this.aClass86_1.aShortArray14;
					local246 = this.aClass86_1.aByteArray9;
				}
				this.aClass57_Sub3_8.aNativeInterface3.copyNormals(local242, local250, local254, local246, 3.0F / (float) this.aShort42, 3.0F / (float) (this.aShort42 + this.aShort42 / 2), 0, 12, this.anInt3806, local112.getAddress());
				if (local98.method2908()) {
					this.aClass4_3.aBoolean3 = true;
					this.aClass4_3.anInterface25_1 = local98;
				} else {
					local75 = false;
				}
			}
		}
		if (local48) {
			if (this.aClass4_4.anInterface25_2 == null) {
				this.aClass4_4.anInterface25_2 = this.aClass57_Sub3_8.method7784(this.aBoolean299);
			}
			local98 = this.aClass4_4.anInterface25_2;
			local98.method2907(8, this.anInt3806 * 8);
			local112 = local98.method2909();
			if (local112 == null) {
				local75 = false;
			} else {
				this.aClass57_Sub3_8.aNativeInterface3.copyTexCoords(this.aFloatArray30, this.aFloatArray29, 0, 8, this.anInt3806, local112.getAddress());
				if (local98.method2908()) {
					this.aClass4_4.anInterface25_1 = local98;
					this.aClass4_4.aBoolean3 = true;
				} else {
					local75 = false;
				}
			}
		}
		return local75;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)Z")
	private boolean method3346() {
		if (this.aClass169_1.aBoolean333) {
			return true;
		}
		if (this.aClass169_1.anInterface9_3 == null) {
			this.aClass169_1.anInterface9_3 = this.aClass57_Sub3_8.method7762(this.aBoolean299);
		}
		@Pc(39) Interface9 local39 = this.aClass169_1.anInterface9_3;
		local39.method2925(this.anInt3798 * 6);
		@Pc(53) Buffer local53 = local39.method2926();
		if (local53 != null) {
			@Pc(61) Stream local61 = this.aClass57_Sub3_8.method7826(local53);
			@Pc(65) int local65;
			if (Stream.b()) {
				for (local65 = 0; local65 < this.anInt3798; local65++) {
					local61.d(this.aShortArray36[local65]);
					local61.d(this.aShortArray34[local65]);
					local61.d(this.aShortArray37[local65]);
				}
			} else {
				for (local65 = 0; local65 < this.anInt3798; local65++) {
					local61.c(this.aShortArray36[local65]);
					local61.c(this.aShortArray34[local65]);
					local61.c(this.aShortArray37[local65]);
				}
			}
			local61.c();
			if (local39.method2927()) {
				this.aClass169_1.aBoolean333 = true;
				this.aBoolean297 = true;
				this.aClass169_1.anInterface9_2 = local39;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V")
	private void method3347() {
		if (!this.aBoolean297) {
			return;
		}
		this.aBoolean297 = false;
		if (this.aClass189Array1 == null && this.aClass161Array1 == null && this.aClass183Array1 == null && !Static91.method1358(this.anInt3855, this.anInt3856)) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			if (this.anIntArray220 != null && !Static343.method5199(this.anInt3855, this.anInt3856)) {
				if (this.aClass4_1 == null || this.aClass4_1.method34()) {
					local37 = true;
					if (!this.aBoolean300) {
						this.method3348();
					}
				} else {
					this.aBoolean297 = true;
				}
			}
			@Pc(82) boolean local82 = false;
			if (this.anIntArray218 != null && !Static312.method4749(this.anInt3856, this.anInt3855)) {
				if (this.aClass4_1 == null || this.aClass4_1.method34()) {
					local39 = true;
					if (!this.aBoolean300) {
						this.method3348();
					}
				} else {
					this.aBoolean297 = true;
				}
			}
			if (this.anIntArray217 != null && !Static148.method2091(this.anInt3855, this.anInt3856)) {
				if (this.aClass4_1 == null || this.aClass4_1.method34()) {
					local82 = true;
					if (!this.aBoolean300) {
						this.method3348();
					}
				} else {
					this.aBoolean297 = true;
				}
			}
			if (local39) {
				this.anIntArray218 = null;
			}
			if (local82) {
				this.anIntArray217 = null;
			}
			if (local37) {
				this.anIntArray220 = null;
			}
		}
		if (this.aShortArray29 != null && this.anIntArray220 == null && this.anIntArray218 == null && this.anIntArray217 == null) {
			this.aShortArray29 = null;
			this.anIntArray219 = null;
		}
		if (this.aByteArray20 != null && !Static439.method6503(this.anInt3856, this.anInt3855)) {
			label201: {
				label200: {
					@Pc(245) boolean local245;
					if ((this.anInt3856 & 0x37) == 0) {
						if (this.aClass4_2 == null || this.aClass4_2.method34()) {
							break label200;
						}
						local245 = false;
					} else {
						if (this.aClass4_3 == null || this.aClass4_3.method34()) {
							break label200;
						}
						local245 = false;
					}
					if (!local245) {
						this.aBoolean297 = true;
						break label201;
					}
				}
				this.aByteArray20 = null;
				this.aShortArray28 = this.aShortArray27 = this.aShortArray35 = null;
			}
		}
		if (this.aShortArray32 != null && !Static215.method3082(this.anInt3855, this.anInt3856)) {
			if (this.aClass4_2 == null || this.aClass4_2.method34()) {
				this.aShortArray32 = null;
			} else {
				this.aBoolean297 = true;
			}
		}
		if (this.aByteArray21 != null && !Static50.method784(this.anInt3856, this.anInt3855)) {
			if (this.aClass4_2 == null || this.aClass4_2.method34()) {
				this.aByteArray21 = null;
			} else {
				this.aBoolean297 = true;
			}
		}
		if (this.aFloatArray30 != null && !Static581.method8340(this.anInt3855, this.anInt3856)) {
			if (this.aClass4_4 == null || this.aClass4_4.method34()) {
				this.aFloatArray30 = this.aFloatArray29 = null;
			} else {
				this.aBoolean297 = true;
			}
		}
		if (this.aShortArray39 != null && !Static271.method4030(this.anInt3855, this.anInt3856)) {
			if (this.aClass4_2 == null || this.aClass4_2.method34()) {
				this.aShortArray39 = null;
			} else {
				this.aBoolean297 = true;
			}
		}
		if (this.aShortArray36 != null && !Static473.method6907(this.anInt3855, this.anInt3856)) {
			if ((this.aClass169_1 == null || this.aClass169_1.method3623()) && (this.aClass4_2 == null || this.aClass4_2.method34())) {
				this.aShortArray36 = this.aShortArray34 = this.aShortArray37 = null;
			} else {
				this.aBoolean297 = true;
			}
		}
		if (this.aShortArray38 != null) {
			if (this.aClass4_1 == null || this.aClass4_1.method34()) {
				this.aShortArray38 = null;
			} else {
				this.aBoolean297 = true;
			}
		}
		if (this.aShortArray33 != null) {
			if (this.aClass4_2 == null || this.aClass4_2.method34()) {
				this.aShortArray33 = null;
			} else {
				this.aBoolean297 = true;
			}
		}
		if (this.anIntArrayArray23 != null && !Static25.method379(this.anInt3856, this.anInt3855)) {
			this.anIntArrayArray23 = null;
			this.aShortArray31 = null;
		}
		if (this.anIntArrayArray24 != null && !Static329.method5018(this.anInt3856, this.anInt3855)) {
			this.aShortArray30 = null;
			this.anIntArrayArray24 = null;
		}
		if (this.anIntArrayArray25 != null && !Static644.method8990(this.anInt3856, this.anInt3855)) {
			this.anIntArrayArray25 = null;
		}
		if (this.anIntArray215 != null && (this.anInt3855 & 0x800) == 0 && (this.anInt3855 & 0x40000) == 0) {
			this.anIntArray214 = null;
			this.anIntArray216 = null;
			this.anIntArray215 = null;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class164 method9072(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class164_Sub1 local12;
		@Pc(16) Class164_Sub1 local16;
		if (arg0 == 1) {
			local12 = this.aClass57_Sub3_8.aClass164_Sub1_25;
			local16 = this.aClass57_Sub3_8.aClass164_Sub1_30;
		} else if (arg0 == 2) {
			local12 = this.aClass57_Sub3_8.aClass164_Sub1_24;
			local16 = this.aClass57_Sub3_8.aClass164_Sub1_23;
		} else if (arg0 == 3) {
			local12 = this.aClass57_Sub3_8.aClass164_Sub1_27;
			local16 = this.aClass57_Sub3_8.aClass164_Sub1_29;
		} else if (arg0 == 4) {
			local12 = this.aClass57_Sub3_8.aClass164_Sub1_22;
			local16 = this.aClass57_Sub3_8.aClass164_Sub1_21;
		} else if (arg0 == 5) {
			local16 = this.aClass57_Sub3_8.aClass164_Sub1_26;
			local12 = this.aClass57_Sub3_8.aClass164_Sub1_28;
		} else {
			local12 = local16 = new Class164_Sub1(this.aClass57_Sub3_8, 0, 0, true, false);
		}
		return this.method3352(arg0 != 0, arg2, arg1, local12, local16);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method9076(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(43) int local43;
		@Pc(53) int[] local53;
		@Pc(55) int local55;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg3 << 4;
			local25 = arg4 << 4;
			Static289.anInt10753 = 0;
			Static375.anInt6448 = 0;
			local31 = 0;
			Static515.anInt8758 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (this.anIntArrayArray24.length > local43) {
					local53 = this.anIntArrayArray24[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						Static515.anInt8758 += this.anIntArray220[local61];
						Static289.anInt10753 += this.anIntArray218[local61];
						Static375.anInt6448 += this.anIntArray217[local61];
						local31++;
					}
				}
			}
			if (local31 > 0) {
				Static375.anInt6448 = Static375.anInt6448 / local31 + local25;
				Static289.anInt10753 = Static289.anInt10753 / local31 + local21;
				Static515.anInt8758 = local17 + Static515.anInt8758 / local31;
			} else {
				Static515.anInt8758 = local17;
				Static289.anInt10753 = local21;
				Static375.anInt6448 = local25;
			}
			return;
		}
		@Pc(171) int[] local171;
		@Pc(173) int local173;
		if (arg0 == 1) {
			local21 = arg3 << 4;
			local25 = arg4 << 4;
			local17 = arg2 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray24.length) {
					local171 = this.anIntArrayArray24[local35];
					for (local173 = 0; local173 < local171.length; local173++) {
						local55 = local171[local173];
						this.anIntArray220[local55] += local17;
						this.anIntArray218[local55] += local21;
						this.anIntArray217[local55] += local25;
					}
				}
			}
			return;
		}
		@Pc(294) int local294;
		@Pc(312) int local312;
		@Pc(774) int local774;
		@Pc(783) int local783;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray24.length > local35) {
					local171 = this.anIntArrayArray24[local35];
					if ((arg5 & 0x1) == 0) {
						for (local173 = 0; local173 < local171.length; local173++) {
							local55 = local171[local173];
							this.anIntArray220[local55] -= Static515.anInt8758;
							this.anIntArray218[local55] -= Static289.anInt10753;
							this.anIntArray217[local55] -= Static375.anInt6448;
							if (arg4 != 0) {
								local61 = Class5_Sub12.anIntArray544[arg4];
								local294 = Class5_Sub12.anIntArray543[arg4];
								local312 = this.anIntArray220[local55] * local294 + local61 * this.anIntArray218[local55] + 16383 >> 14;
								this.anIntArray218[local55] = local294 * this.anIntArray218[local55] + 16383 - local61 * this.anIntArray220[local55] >> 14;
								this.anIntArray220[local55] = local312;
							}
							if (arg2 != 0) {
								local61 = Class5_Sub12.anIntArray544[arg2];
								local294 = Class5_Sub12.anIntArray543[arg2];
								local312 = this.anIntArray218[local55] * local294 + 16383 - this.anIntArray217[local55] * local61 >> 14;
								this.anIntArray217[local55] = this.anIntArray218[local55] * local61 + local294 * this.anIntArray217[local55] + 16383 >> 14;
								this.anIntArray218[local55] = local312;
							}
							if (arg3 != 0) {
								local61 = Class5_Sub12.anIntArray544[arg3];
								local294 = Class5_Sub12.anIntArray543[arg3];
								local312 = local294 * this.anIntArray220[local55] + this.anIntArray217[local55] * local61 + 16383 >> 14;
								this.anIntArray217[local55] = this.anIntArray217[local55] * local294 + 16383 - this.anIntArray220[local55] * local61 >> 14;
								this.anIntArray220[local55] = local312;
							}
							this.anIntArray220[local55] += Static515.anInt8758;
							this.anIntArray218[local55] += Static289.anInt10753;
							this.anIntArray217[local55] += Static375.anInt6448;
						}
					} else {
						for (local173 = 0; local173 < local171.length; local173++) {
							local55 = local171[local173];
							this.anIntArray220[local55] -= Static515.anInt8758;
							this.anIntArray218[local55] -= Static289.anInt10753;
							this.anIntArray217[local55] -= Static375.anInt6448;
							if (arg2 != 0) {
								local61 = Class5_Sub12.anIntArray544[arg2];
								local294 = Class5_Sub12.anIntArray543[arg2];
								local312 = this.anIntArray218[local55] * local294 + 16383 - local61 * this.anIntArray217[local55] >> 14;
								this.anIntArray217[local55] = local61 * this.anIntArray218[local55] + this.anIntArray217[local55] * local294 + 16383 >> 14;
								this.anIntArray218[local55] = local312;
							}
							if (arg4 != 0) {
								local61 = Class5_Sub12.anIntArray544[arg4];
								local294 = Class5_Sub12.anIntArray543[arg4];
								local312 = this.anIntArray218[local55] * local61 + this.anIntArray220[local55] * local294 + 16383 >> 14;
								this.anIntArray218[local55] = local294 * this.anIntArray218[local55] + 16383 - this.anIntArray220[local55] * local61 >> 14;
								this.anIntArray220[local55] = local312;
							}
							if (arg3 != 0) {
								local61 = Class5_Sub12.anIntArray544[arg3];
								local294 = Class5_Sub12.anIntArray543[arg3];
								local312 = this.anIntArray217[local55] * local61 + this.anIntArray220[local55] * local294 + 16383 >> 14;
								this.anIntArray217[local55] = this.anIntArray217[local55] * local294 + 16383 - local61 * this.anIntArray220[local55] >> 14;
								this.anIntArray220[local55] = local312;
							}
							this.anIntArray220[local55] += Static515.anInt8758;
							this.anIntArray218[local55] += Static289.anInt10753;
							this.anIntArray217[local55] += Static375.anInt6448;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local43 = arg1[local35];
					if (this.anIntArrayArray24.length > local43) {
						local53 = this.anIntArrayArray24[local43];
						for (local55 = 0; local55 < local53.length; local55++) {
							local61 = local53[local55];
							local294 = this.anIntArray219[local61];
							local312 = this.anIntArray219[local61 + 1];
							for (local774 = local294; local774 < local312; local774++) {
								local783 = this.aShortArray29[local774] - 1;
								if (local783 == -1) {
									break;
								}
								@Pc(794) int local794;
								@Pc(798) int local798;
								@Pc(816) int local816;
								if (arg4 != 0) {
									local794 = Class5_Sub12.anIntArray544[arg4];
									local798 = Class5_Sub12.anIntArray543[arg4];
									local816 = local798 * this.aShortArray28[local783] + local794 * this.aShortArray27[local783] + 16383 >> 14;
									this.aShortArray27[local783] = (short) (local798 * this.aShortArray27[local783] + 16383 - this.aShortArray28[local783] * local794 >> 14);
									this.aShortArray28[local783] = (short) local816;
								}
								if (arg2 != 0) {
									local794 = Class5_Sub12.anIntArray544[arg2];
									local798 = Class5_Sub12.anIntArray543[arg2];
									local816 = local798 * this.aShortArray27[local783] + 16383 - local794 * this.aShortArray35[local783] >> 14;
									this.aShortArray35[local783] = (short) (this.aShortArray35[local783] * local798 + local794 * this.aShortArray27[local783] + 16383 >> 14);
									this.aShortArray27[local783] = (short) local816;
								}
								if (arg3 != 0) {
									local794 = Class5_Sub12.anIntArray544[arg3];
									local798 = Class5_Sub12.anIntArray543[arg3];
									local816 = this.aShortArray28[local783] * local798 + local794 * this.aShortArray35[local783] + 16383 >> 14;
									this.aShortArray35[local783] = (short) (this.aShortArray35[local783] * local798 + 16383 - local794 * this.aShortArray28[local783] >> 14);
									this.aShortArray28[local783] = (short) local816;
								}
							}
						}
					}
				}
				this.method3357();
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray24.length) {
					local171 = this.anIntArrayArray24[local35];
					for (local173 = 0; local173 < local171.length; local173++) {
						local55 = local171[local173];
						this.anIntArray220[local55] -= Static515.anInt8758;
						this.anIntArray218[local55] -= Static289.anInt10753;
						this.anIntArray217[local55] -= Static375.anInt6448;
						this.anIntArray220[local55] = arg2 * this.anIntArray220[local55] >> 7;
						this.anIntArray218[local55] = this.anIntArray218[local55] * arg3 >> 7;
						this.anIntArray217[local55] = arg4 * this.anIntArray217[local55] >> 7;
						this.anIntArray220[local55] += Static515.anInt8758;
						this.anIntArray218[local55] += Static289.anInt10753;
						this.anIntArray217[local55] += Static375.anInt6448;
					}
				}
			}
		} else {
			@Pc(1250) Class79 local1250;
			@Pc(1131) boolean local1131;
			@Pc(1245) Class183 local1245;
			if (arg0 == 5) {
				if (this.anIntArrayArray23 != null) {
					local1131 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (local43 < this.anIntArrayArray23.length) {
							local53 = this.anIntArrayArray23[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								local294 = (this.aByteArray21[local61] & 0xFF) + (arg2 * 8);
								if (local294 < 0) {
									local294 = 0;
								} else if (local294 > 255) {
									local294 = 255;
								}
								this.aByteArray21[local61] = (byte) local294;
							}
							local1131 |= local53.length > 0;
						}
					}
					if (local1131) {
						if (this.aClass183Array1 != null) {
							for (local43 = 0; local43 < this.anInt3824; local43++) {
								local1245 = this.aClass183Array1[local43];
								local1250 = this.aClass79Array1[local43];
								local1250.anInt1516 = 255 - (this.aByteArray21[local1245.anInt4687] & 0xFF) << 24 | local1250.anInt1516 & 0xFFFFFF;
							}
						}
						this.method3359();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray23 != null) {
					local1131 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (local43 < this.anIntArrayArray23.length) {
							local53 = this.anIntArrayArray23[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								local294 = this.aShortArray32[local61] & 0xFFFF;
								local312 = local294 >> 10 & 0x3F;
								local774 = local294 >> 7 & 0x7;
								local783 = local294 & 0x7F;
								local774 += arg3 / 4;
								@Pc(1363) int local1363 = local312 + arg2 & 0x3F;
								local783 += arg4;
								if (local774 < 0) {
									local774 = 0;
								} else if (local774 > 7) {
									local774 = 7;
								}
								if (local783 < 0) {
									local783 = 0;
								} else if (local783 > 127) {
									local783 = 127;
								}
								this.aShortArray32[local61] = (short) (local783 | local1363 << 10 | local774 << 7);
							}
							local1131 |= local53.length > 0;
						}
					}
					if (local1131) {
						if (this.aClass183Array1 != null) {
							for (local43 = 0; local43 < this.anInt3824; local43++) {
								local1245 = this.aClass183Array1[local43];
								local1250 = this.aClass79Array1[local43];
								local1250.anInt1516 = local1250.anInt1516 & 0xFF000000 | Static560.anIntArray534[this.aShortArray32[local1245.anInt4687] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method3359();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray25 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray25.length) {
							local171 = this.anIntArrayArray25[local35];
							for (local173 = 0; local173 < local171.length; local173++) {
								local1250 = this.aClass79Array1[local171[local173]];
								local1250.anInt1519 += arg2;
								local1250.anInt1518 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray25 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray25.length > local35) {
							local171 = this.anIntArrayArray25[local35];
							for (local173 = 0; local173 < local171.length; local173++) {
								local1250 = this.aClass79Array1[local171[local173]];
								local1250.anInt1523 = local1250.anInt1523 * arg2 >> 7;
								local1250.anInt1524 = arg3 * local1250.anInt1524 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray25 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray25.length) {
						local171 = this.anIntArrayArray25[local35];
						for (local173 = 0; local173 < local171.length; local173++) {
							local1250 = this.aClass79Array1[local171[local173]];
							local1250.anInt1521 = arg2 + local1250.anInt1521 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12.anIntArray544[arg0];
		@Pc(13) int local13 = Class5_Sub12.anIntArray543[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3868; local15++) {
			@Pc(35) int local35 = this.anIntArray217[local15] * local9 + local13 * this.anIntArray220[local15] >> 14;
			this.anIntArray217[local15] = local13 * this.anIntArray217[local15] - local9 * this.anIntArray220[local15] >> 14;
			this.anIntArray220[local15] = local35;
		}
		this.method3343();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3868; local3++) {
			this.anIntArray217[local3] = -this.anIntArray217[local3];
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt3806; local27++) {
			this.aShortArray35[local27] = (short) -this.aShortArray35[local27];
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt3865; local54++) {
			@Pc(65) short local65 = this.aShortArray36[local54];
			this.aShortArray36[local54] = this.aShortArray37[local54];
			this.aShortArray37[local54] = local65;
		}
		this.method3343();
		this.method3357();
		this.method3344();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method9086(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class164_Sub1 local8 = (Class164_Sub1) arg0;
		if (this.anInt3865 == 0 || local8.anInt3865 == 0) {
			return;
		}
		@Pc(27) int local27 = local8.anInt3868;
		@Pc(30) int[] local30 = local8.anIntArray220;
		@Pc(33) int[] local33 = local8.anIntArray218;
		@Pc(36) int[] local36 = local8.anIntArray217;
		@Pc(39) short[] local39 = local8.aShortArray28;
		@Pc(42) short[] local42 = local8.aShortArray27;
		@Pc(45) short[] local45 = local8.aShortArray35;
		@Pc(48) byte[] local48 = local8.aByteArray20;
		@Pc(57) short[] local57;
		@Pc(53) short[] local53;
		@Pc(59) short[] local59;
		@Pc(55) byte[] local55;
		if (this.aClass86_1 == null) {
			local53 = null;
			local55 = null;
			local57 = null;
			local59 = null;
		} else {
			local57 = this.aClass86_1.aShortArray14;
			local59 = this.aClass86_1.aShortArray16;
			local53 = this.aClass86_1.aShortArray15;
			local55 = this.aClass86_1.aByteArray9;
		}
		@Pc(82) short[] local82;
		@Pc(84) short[] local84;
		@Pc(86) short[] local86;
		@Pc(88) byte[] local88;
		if (local8.aClass86_1 == null) {
			local82 = null;
			local84 = null;
			local86 = null;
			local88 = null;
		} else {
			local84 = local8.aClass86_1.aShortArray15;
			local82 = local8.aClass86_1.aShortArray14;
			local86 = local8.aClass86_1.aShortArray16;
			local88 = local8.aClass86_1.aByteArray9;
		}
		@Pc(109) int[] local109 = local8.anIntArray219;
		@Pc(112) short[] local112 = local8.aShortArray29;
		if (!local8.aBoolean300) {
			local8.method3348();
		}
		@Pc(123) int local123 = local8.anInt3797;
		@Pc(126) int local126 = local8.anInt3802;
		@Pc(129) int local129 = local8.anInt3859;
		@Pc(132) int local132 = local8.anInt3843;
		@Pc(135) int local135 = local8.anInt3849;
		@Pc(138) int local138 = local8.anInt3835;
		for (@Pc(140) int local140 = 0; local140 < this.anInt3868; local140++) {
			@Pc(149) int local149 = this.anIntArray218[local140] - arg2;
			if (local149 >= local123 && local126 >= local149) {
				@Pc(172) int local172 = this.anIntArray220[local140] - arg1;
				if (local129 <= local172 && local132 >= local172) {
					@Pc(196) int local196 = this.anIntArray217[local140] - arg3;
					if (local135 <= local196 && local196 <= local138) {
						@Pc(214) int local214 = -1;
						@Pc(219) int local219 = this.anIntArray219[local140];
						@Pc(226) int local226 = this.anIntArray219[local140 + 1];
						for (@Pc(228) int local228 = local219; local228 < local226; local228++) {
							local214 = this.aShortArray29[local228] - 1;
							if (local214 == -1 || this.aByteArray20[local214] != 0) {
								break;
							}
						}
						if (local214 != -1) {
							for (@Pc(272) int local272 = 0; local272 < local27; local272++) {
								if (local30[local272] == local172 && local36[local272] == local196 && local33[local272] == local149) {
									@Pc(301) int local301 = -1;
									local226 = local109[local272 + 1];
									local219 = local109[local272];
									for (@Pc(313) int local313 = local219; local313 < local226; local313++) {
										local301 = local112[local313] - 1;
										if (local301 == -1 || local48[local301] != 0) {
											break;
										}
									}
									if (local301 != -1) {
										if (local57 == null) {
											this.aClass86_1 = new Class86();
											local57 = this.aClass86_1.aShortArray14 = Static609.method8689(this.aShortArray28);
											local53 = this.aClass86_1.aShortArray15 = Static609.method8689(this.aShortArray27);
											local59 = this.aClass86_1.aShortArray16 = Static609.method8689(this.aShortArray35);
											local55 = this.aClass86_1.aByteArray9 = Static410.method6187(this.aByteArray20);
										}
										if (local82 == null) {
											@Pc(403) Class86 local403 = local8.aClass86_1 = new Class86();
											local82 = local403.aShortArray14 = Static609.method8689(local39);
											local84 = local403.aShortArray15 = Static609.method8689(local42);
											local86 = local403.aShortArray16 = Static609.method8689(local45);
											local88 = local403.aByteArray9 = Static410.method6187(local48);
										}
										@Pc(436) short local436 = this.aShortArray28[local214];
										@Pc(441) short local441 = this.aShortArray27[local214];
										@Pc(446) short local446 = this.aShortArray35[local214];
										@Pc(451) byte local451 = this.aByteArray20[local214];
										local226 = local109[local272 + 1];
										local219 = local109[local272];
										@Pc(471) int local471;
										for (@Pc(463) int local463 = local219; local463 < local226; local463++) {
											local471 = local112[local463] - 1;
											if (local471 == -1) {
												break;
											}
											if (local88[local471] != 0) {
												local82[local471] += local436;
												local84[local471] += local441;
												local86[local471] += local446;
												local88[local471] += local451;
											}
										}
										local451 = local48[local301];
										local219 = this.anIntArray219[local140];
										local446 = local45[local301];
										local436 = local39[local301];
										local441 = local42[local301];
										local226 = this.anIntArray219[local140 + 1];
										for (local471 = local219; local471 < local226; local471++) {
											@Pc(563) int local563 = this.aShortArray29[local471] - 1;
											if (local563 == -1) {
												break;
											}
											if (local55[local563] != 0) {
												local57[local563] += local436;
												local53[local563] += local441;
												local59[local563] += local446;
												local55[local563] += local451;
											}
										}
										local8.method3357();
										this.method3357();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3845; local3++) {
			this.anIntArray220[local3] = this.anIntArray220[local3] + 7 >> 4;
			this.anIntArray218[local3] = this.anIntArray218[local3] + 7 >> 4;
			this.anIntArray217[local3] = this.anIntArray217[local3] + 7 >> 4;
		}
		this.method3343();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!ho", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean300) {
			this.method3348();
		}
		return this.anInt3802;
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "()[Lclient!hja;")
	@Override
	public Class161[] method9070() {
		return this.aClass161Array1;
	}

	@OriginalMember(owner = "client!ho", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean300) {
			this.method3348();
		}
		return this.anInt3843;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "()V")
	@Override
	protected void method9088() {
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	private void method3348() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = -32768;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt3868; local31++) {
			@Pc(40) int local40 = this.anIntArray220[local31];
			@Pc(45) int local45 = this.anIntArray218[local31];
			if (local9 > local45) {
				local9 = local45;
			}
			if (local40 > local21) {
				local21 = local40;
			}
			if (local45 > local23) {
				local23 = local45;
			}
			@Pc(73) int local73 = this.anIntArray217[local31];
			if (local7 > local40) {
				local7 = local40;
			}
			if (local73 < local11) {
				local11 = local73;
			}
			if (local73 > local25) {
				local25 = local73;
			}
			@Pc(100) int local100 = local73 * local73 + local40 * local40;
			if (local100 > local27) {
				local27 = local100;
			}
			local100 = local45 * local45 + local73 * local73 + local40 * local40;
			if (local29 < local100) {
				local29 = local100;
			}
		}
		this.anInt3849 = local11;
		this.anInt3859 = local7;
		this.anInt3802 = local23;
		this.anInt3835 = local25;
		this.anInt3843 = local21;
		this.anInt3797 = local9;
		this.anInt3874 = (int) (Math.sqrt((double) local27) + 0.99D);
		this.anInt3832 = (int) (Math.sqrt((double) local29) + 0.99D);
		this.aBoolean300 = true;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "()[Lclient!jk;")
	@Override
	public Class189[] method9081() {
		return this.aClass189Array1;
	}

	@OriginalMember(owner = "client!ho", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface1 local9 = this.aClass57_Sub3_8.anInterface1_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt3865; local11++) {
			if (arg0 == this.aShortArray39[local11]) {
				this.aShortArray39[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(49) Class233 local49 = local9.method2863(arg0 & 0xFFFF);
			local35 = local49.aByte97;
			local37 = local49.aByte98;
		}
		@Pc(57) byte local57 = 0;
		@Pc(59) byte local59 = 0;
		if (arg1 != -1) {
			@Pc(69) Class233 local69 = local9.method2863(arg1 & 0xFFFF);
			if (local69.aByte96 != 0 || local69.aByte93 != 0) {
				this.aBoolean301 = true;
			}
			local59 = local69.aByte98;
			local57 = local69.aByte97;
		}
		if (!(local59 != local37 | local35 != local57)) {
			return;
		}
		if (this.aClass183Array1 != null) {
			for (@Pc(122) int local122 = 0; local122 < this.anInt3824; local122++) {
				@Pc(129) Class183 local129 = this.aClass183Array1[local122];
				@Pc(134) Class79 local134 = this.aClass79Array1[local122];
				local134.anInt1516 = local134.anInt1516 & 0xFF000000 | Static560.anIntArray534[this.aShortArray32[local129.anInt4687] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3359();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!qq;Lclient!ng;I)V")
	@Override
	public void method9073(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class8_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3806 == 0) {
			return;
		}
		@Pc(17) Class203_Sub1 local17 = this.aClass57_Sub3_8.aClass203_Sub1_16;
		if (!this.aBoolean300) {
			this.method3348();
		}
		@Pc(28) Class203_Sub1 local28 = (Class203_Sub1) arg0;
		Static440.aFloat135 = local17.aFloat89 + local17.aFloat90 * local28.aFloat88 + local28.aFloat97 * local17.aFloat98 + local17.aFloat91 * local28.aFloat89;
		Static580.aFloat187 = local28.aFloat98 * local17.aFloat91 + local17.aFloat98 * local28.aFloat93 + local17.aFloat90 * local28.aFloat94;
		@Pc(75) float local75 = Static580.aFloat187 * (float) this.anInt3797 + Static440.aFloat135;
		@Pc(83) float local83 = Static440.aFloat135 + (float) this.anInt3802 * Static580.aFloat187;
		@Pc(93) float local93;
		@Pc(99) float local99;
		if (local83 < local75) {
			local93 = (float) -this.anInt3874 + local83;
			local99 = (float) this.anInt3874 + local75;
		} else {
			local93 = local75 - (float) this.anInt3874;
			local99 = local83 + (float) this.anInt3874;
		}
		if (this.aClass57_Sub3_8.aFloat169 <= local93 || local99 <= (float) this.aClass57_Sub3_8.anInt9178) {
			return;
		}
		Static126.aFloat13 = local17.aFloat95 * local28.aFloat89 + local28.aFloat97 * local17.aFloat94 + local17.aFloat92 * local28.aFloat88 + local17.aFloat88;
		Static152.aFloat24 = local17.aFloat92 * local28.aFloat94 + local28.aFloat93 * local17.aFloat94 + local28.aFloat98 * local17.aFloat95;
		@Pc(178) float local178 = Static152.aFloat24 * (float) this.anInt3797 + Static126.aFloat13;
		@Pc(186) float local186 = Static126.aFloat13 + Static152.aFloat24 * (float) this.anInt3802;
		@Pc(213) float local213;
		@Pc(201) float local201;
		if (local186 < local178) {
			local213 = (float) this.aClass57_Sub3_8.anInt9150 * ((float) -this.anInt3874 + local186);
			local201 = (local178 + (float) this.anInt3874) * (float) this.aClass57_Sub3_8.anInt9150;
		} else {
			local201 = ((float) this.anInt3874 + local186) * (float) this.aClass57_Sub3_8.anInt9150;
			local213 = (float) this.aClass57_Sub3_8.anInt9150 * ((float) -this.anInt3874 + local178);
		}
		if (local213 / local99 >= this.aClass57_Sub3_8.aFloat168 || local201 / local99 <= this.aClass57_Sub3_8.aFloat180) {
			return;
		}
		Static325.aFloat99 = local17.aFloat87 * local28.aFloat98 + local17.aFloat96 * local28.aFloat94 + local17.aFloat93 * local28.aFloat93;
		Static78.aFloat184 = local28.aFloat89 * local17.aFloat87 + local28.aFloat88 * local17.aFloat96 + local17.aFloat93 * local28.aFloat97 + local17.aFloat97;
		@Pc(305) float local305 = (float) this.anInt3797 * Static325.aFloat99 + Static78.aFloat184;
		@Pc(313) float local313 = (float) this.anInt3802 * Static325.aFloat99 + Static78.aFloat184;
		@Pc(340) float local340;
		@Pc(328) float local328;
		if (local313 < local305) {
			local328 = (float) this.aClass57_Sub3_8.anInt9180 * ((float) this.anInt3874 + local305);
			local340 = ((float) -this.anInt3874 + local313) * (float) this.aClass57_Sub3_8.anInt9180;
		} else {
			local340 = ((float) -this.anInt3874 + local305) * (float) this.aClass57_Sub3_8.anInt9180;
			local328 = (local313 + (float) this.anInt3874) * (float) this.aClass57_Sub3_8.anInt9180;
		}
		if (local340 / local99 >= this.aClass57_Sub3_8.aFloat181 || this.aClass57_Sub3_8.aFloat176 >= local328 / local99) {
			return;
		}
		if (arg1 != null || this.aClass183Array1 != null) {
			Static264.aFloat62 = local28.aFloat95 * local17.aFloat90 + local28.aFloat87 * local17.aFloat98 + local17.aFloat91 * local28.aFloat91;
			Static133.aFloat17 = local28.aFloat90 * local17.aFloat95 + local17.aFloat92 * local28.aFloat92 + local17.aFloat94 * local28.aFloat96;
			Static69.aFloat8 = local17.aFloat93 * local28.aFloat87 + local28.aFloat95 * local17.aFloat96 + local28.aFloat91 * local17.aFloat87;
			Static314.aFloat86 = local17.aFloat98 * local28.aFloat96 + local28.aFloat92 * local17.aFloat90 + local17.aFloat91 * local28.aFloat90;
			Static498.aFloat143 = local28.aFloat90 * local17.aFloat87 + local17.aFloat93 * local28.aFloat96 + local17.aFloat96 * local28.aFloat92;
			Static274.aFloat64 = local28.aFloat91 * local17.aFloat95 + local28.aFloat87 * local17.aFloat94 + local17.aFloat92 * local28.aFloat95;
		}
		if (arg1 != null) {
			@Pc(506) boolean local506 = false;
			@Pc(508) boolean local508 = true;
			@Pc(516) int local516 = this.anInt3843 + this.anInt3859 >> 1;
			@Pc(525) int local525 = this.anInt3849 + this.anInt3835 >> 1;
			@Pc(544) int local544 = (int) (Static133.aFloat17 * (float) local516 + Static126.aFloat13 + (float) this.anInt3797 * Static152.aFloat24 + (float) local525 * Static274.aFloat64);
			@Pc(563) int local563 = (int) (Static69.aFloat8 * (float) local525 + Static325.aFloat99 * (float) this.anInt3797 + Static78.aFloat184 + Static498.aFloat143 * (float) local516);
			@Pc(582) int local582 = (int) (Static264.aFloat62 * (float) local525 + Static580.aFloat187 * (float) this.anInt3797 + Static440.aFloat135 + (float) local516 * Static314.aFloat86);
			if (local582 < this.aClass57_Sub3_8.anInt9178) {
				local506 = true;
			} else {
				arg1.anInt6698 = local563 * this.aClass57_Sub3_8.anInt9180 / local582 + this.aClass57_Sub3_8.anInt9164;
				arg1.anInt6699 = local544 * this.aClass57_Sub3_8.anInt9150 / local582 + this.aClass57_Sub3_8.anInt9158;
			}
			@Pc(638) int local638 = (int) ((float) local516 * Static133.aFloat17 + Static126.aFloat13 + (float) this.anInt3802 * Static152.aFloat24 + Static274.aFloat64 * (float) local525);
			@Pc(657) int local657 = (int) (Static69.aFloat8 * (float) local525 + (float) local516 * Static498.aFloat143 + Static78.aFloat184 + Static325.aFloat99 * (float) this.anInt3802);
			@Pc(676) int local676 = (int) (Static264.aFloat62 * (float) local525 + Static440.aFloat135 + Static314.aFloat86 * (float) local516 + (float) this.anInt3802 * Static580.aFloat187);
			if (local676 < this.aClass57_Sub3_8.anInt9178) {
				local506 = true;
			} else {
				arg1.anInt6702 = this.aClass57_Sub3_8.anInt9164 + this.aClass57_Sub3_8.anInt9180 * local657 / local676;
				arg1.anInt6701 = this.aClass57_Sub3_8.anInt9158 + local638 * this.aClass57_Sub3_8.anInt9150 / local676;
			}
			if (local506) {
				if (local582 < this.aClass57_Sub3_8.anInt9178 && this.aClass57_Sub3_8.anInt9178 > local676) {
					local508 = false;
				} else {
					@Pc(757) int local757;
					@Pc(768) int local768;
					@Pc(779) int local779;
					if (this.aClass57_Sub3_8.anInt9178 > local582) {
						local757 = (local676 - this.aClass57_Sub3_8.anInt9178 << 16) / (local676 - local582);
						local768 = local638 + ((local638 - local544) * local757 >> 16);
						local779 = (local757 * (local657 - local563) >> 16) + local657;
						arg1.anInt6699 = local768 * this.aClass57_Sub3_8.anInt9150 / this.aClass57_Sub3_8.anInt9178 + this.aClass57_Sub3_8.anInt9158;
						arg1.anInt6698 = this.aClass57_Sub3_8.anInt9180 * local779 / this.aClass57_Sub3_8.anInt9178 + this.aClass57_Sub3_8.anInt9164;
					} else if (this.aClass57_Sub3_8.anInt9178 > local676) {
						local757 = (local582 - this.aClass57_Sub3_8.anInt9178 << 16) / (local582 - local676);
						local768 = ((local544 - local638) * local757 >> 16) + local544;
						arg1.anInt6699 = local768 * this.aClass57_Sub3_8.anInt9150 / this.aClass57_Sub3_8.anInt9178 + this.aClass57_Sub3_8.anInt9158;
						local779 = ((local563 - local657) * local757 >> 16) + local563;
						arg1.anInt6698 = this.aClass57_Sub3_8.anInt9164 + local779 * this.aClass57_Sub3_8.anInt9180 / this.aClass57_Sub3_8.anInt9178;
					}
				}
			}
			if (local508) {
				arg1.aBoolean519 = true;
				if (local676 >= local582) {
					arg1.anInt6700 = this.aClass57_Sub3_8.anInt9158 + this.aClass57_Sub3_8.anInt9150 * (this.anInt3874 + local638) / local676 - arg1.anInt6701;
				} else {
					arg1.anInt6700 = this.aClass57_Sub3_8.anInt9158 + this.aClass57_Sub3_8.anInt9150 * (local544 + this.anInt3874) / local582 - arg1.anInt6699;
				}
			}
		}
		this.aClass57_Sub3_8.method7842();
		this.aClass57_Sub3_8.method7802(local28);
		this.method3360();
		this.method3351();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIJFIBIIFLclient!ju;)S")
	private short method3350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) Class192 arg9) {
		@Pc(10) int local10 = this.anIntArray219[arg1];
		@Pc(17) int local17 = this.anIntArray219[arg1 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(30) short local30 = this.aShortArray29[local21];
			if (local30 == 0) {
				local19 = local21;
				break;
			}
			if (arg3 == Static229.aLongArray9[local21]) {
				return (short) (local30 - 1);
			}
		}
		this.aShortArray29[local19] = (short) (this.anInt3806 + 1);
		Static229.aLongArray9[local19] = arg3;
		this.aShortArray33[this.anInt3806] = (short) arg7;
		this.aShortArray38[this.anInt3806] = (short) arg1;
		this.aShortArray28[this.anInt3806] = (short) arg5;
		this.aShortArray27[this.anInt3806] = (short) arg6;
		this.aShortArray35[this.anInt3806] = (short) arg0;
		this.aByteArray20[this.anInt3806] = (byte) arg2;
		this.aFloatArray30[this.anInt3806] = arg8;
		if (43 == 43) {
			this.aFloatArray29[this.anInt3806] = arg4;
			return (short) this.anInt3806++;
		} else {
			return 88;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILclient!qq;ZI)Z")
	@Override
	public boolean method9093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method3358(arg0, arg4, arg1, arg2, -1, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
	private void method3351() {
		if (this.aClass183Array1 == null) {
			return;
		}
		this.aClass57_Sub3_8.C(!this.aBoolean298);
		this.aClass57_Sub3_8.method7820(false);
		this.aClass57_Sub3_8.method7866(1, Static291.aClass312_3);
		this.aClass57_Sub3_8.method7781(1, Static291.aClass312_3);
		for (@Pc(35) int local35 = 0; local35 < this.anInt3824; local35++) {
			@Pc(44) Class183 local44 = this.aClass183Array1[local35];
			@Pc(49) Class79 local49 = this.aClass79Array1[local35];
			if (!local44.aBoolean367 || !this.aClass57_Sub3_8.method7711()) {
				@Pc(79) float local79 = (float) (this.anIntArray220[local44.anInt4690] + this.anIntArray220[local44.anInt4692] + this.anIntArray220[local44.anInt4691]) * 0.3333333F;
				@Pc(100) float local100 = (float) (this.anIntArray218[local44.anInt4691] + this.anIntArray218[local44.anInt4692] + this.anIntArray218[local44.anInt4690]) * 0.3333333F;
				@Pc(121) float local121 = (float) (this.anIntArray217[local44.anInt4691] + this.anIntArray217[local44.anInt4692] + this.anIntArray217[local44.anInt4690]) * 0.3333333F;
				@Pc(135) float local135 = local121 * Static274.aFloat64 + local100 * Static152.aFloat24 + local79 * Static133.aFloat17 + Static126.aFloat13;
				@Pc(149) float local149 = local121 * Static69.aFloat8 + Static325.aFloat99 * local100 + local79 * Static498.aFloat143 + Static78.aFloat184;
				@Pc(163) float local163 = Static440.aFloat135 + local79 * Static314.aFloat86 + Static580.aFloat187 * local100 + Static264.aFloat62 * local121;
				@Pc(184) float local184 = (float) (1.0D / Math.sqrt((double) (local149 * local149 + local135 * local135 + local163 * local163))) * (float) local44.anInt4693;
				@Pc(189) Class203_Sub1 local189 = this.aClass57_Sub3_8.method7815();
				local189.method4832(local135 + (float) local49.anInt1519 - local135 * local184, local49.anInt1523 * local44.aShort68 >> 7, local163 - local163 * local184, local49.anInt1521, local49.anInt1524 * local44.aShort67 >> 7, (float) local49.anInt1518 + local149 - local149 * local184);
				local189.method4837(this.aClass57_Sub3_8.aClass203_Sub1_17);
				this.aClass57_Sub3_8.method7735();
				@Pc(246) int local246 = local49.anInt1516;
				this.aClass57_Sub3_8.method7827(false, local44.aShort69, false);
				this.aClass57_Sub3_8.method7800(local44.aByte68);
				this.aClass57_Sub3_8.method7806(local246);
				this.aClass57_Sub3_8.method7775();
			}
		}
		this.aClass57_Sub3_8.method7781(1, Static79.aClass312_2);
		this.aClass57_Sub3_8.method7866(1, Static79.aClass312_2);
		this.aClass57_Sub3_8.C(true);
	}

	@OriginalMember(owner = "client!ho", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean300) {
			this.method3348();
		}
		return this.anInt3874;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZIILclient!ho;Lclient!ho;)Lclient!ka;")
	private Class164 method3352(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class164_Sub1 arg3, @OriginalArg(5) Class164_Sub1 arg4) {
		arg3.anInt3824 = this.anInt3824;
		arg3.aBoolean301 = this.aBoolean301;
		arg3.anInt3865 = this.anInt3865;
		if ((arg2 & 0x100) == 0) {
			arg3.aBoolean298 = this.aBoolean298;
		} else {
			arg3.aBoolean298 = true;
		}
		arg3.anInt3798 = this.anInt3798;
		arg3.anInt3855 = arg2;
		arg3.aShort42 = this.aShort42;
		arg3.anInt3868 = this.anInt3868;
		arg3.aShort43 = this.aShort43;
		arg3.anInt3845 = this.anInt3845;
		arg3.anInt3806 = this.anInt3806;
		arg3.anInt3856 = this.anInt3856;
		@Pc(74) boolean local74 = Static432.method6393(this.anInt3856, arg2);
		@Pc(88) boolean local88 = Static196.method2833(this.anInt3856, arg2);
		@Pc(94) boolean local94 = Static114.method1638(arg2, this.anInt3856);
		@Pc(100) boolean local100 = local74 | local88 | local94;
		@Pc(245) int local245;
		if (local100) {
			if (!local74) {
				arg3.anIntArray220 = this.anIntArray220;
			} else if (arg4.anIntArray220 == null || arg4.anIntArray220.length < this.anInt3845) {
				arg3.anIntArray220 = arg4.anIntArray220 = new int[this.anInt3845];
			} else {
				arg3.anIntArray220 = arg4.anIntArray220;
			}
			if (!local88) {
				arg3.anIntArray218 = this.anIntArray218;
			} else if (arg4.anIntArray218 == null || arg4.anIntArray218.length < this.anInt3845) {
				arg3.anIntArray218 = arg4.anIntArray218 = new int[this.anInt3845];
			} else {
				arg3.anIntArray218 = arg4.anIntArray218;
			}
			if (!local94) {
				arg3.anIntArray217 = this.anIntArray217;
			} else if (arg4.anIntArray217 == null || this.anInt3845 > arg4.anIntArray217.length) {
				arg3.anIntArray217 = arg4.anIntArray217 = new int[this.anInt3845];
			} else {
				arg3.anIntArray217 = arg4.anIntArray217;
			}
			for (local245 = 0; local245 < this.anInt3845; local245++) {
				if (local74) {
					arg3.anIntArray220[local245] = this.anIntArray220[local245];
				}
				if (local88) {
					arg3.anIntArray218[local245] = this.anIntArray218[local245];
				}
				if (local94) {
					arg3.anIntArray217[local245] = this.anIntArray217[local245];
				}
			}
		} else {
			arg3.anIntArray217 = this.anIntArray217;
			arg3.anIntArray220 = this.anIntArray220;
			arg3.anIntArray218 = this.anIntArray218;
		}
		if (Static38.method660(this.anInt3856, arg2)) {
			arg3.aClass4_1 = arg4.aClass4_1;
			arg3.aClass4_1.aBoolean3 = this.aClass4_1.aBoolean3;
			arg3.aClass4_1.anInterface25_1 = this.aClass4_1.anInterface25_1;
			arg3.aClass4_1.aBoolean4 = true;
		} else if (Static22.method317(arg2, this.anInt3856)) {
			arg3.aClass4_1 = this.aClass4_1;
		} else {
			arg3.aClass4_1 = null;
		}
		if (Static52.method790(this.anInt3856, arg2)) {
			if (arg4.aShortArray32 == null || arg4.aShortArray32.length < this.anInt3865) {
				arg3.aShortArray32 = arg4.aShortArray32 = new short[this.anInt3865];
			} else {
				arg3.aShortArray32 = arg4.aShortArray32;
			}
			for (local245 = 0; local245 < this.anInt3865; local245++) {
				arg3.aShortArray32[local245] = this.aShortArray32[local245];
			}
		} else {
			arg3.aShortArray32 = this.aShortArray32;
		}
		if (Static489.method7066(arg2, this.anInt3856)) {
			if (arg4.aByteArray21 == null || this.anInt3865 > arg4.aByteArray21.length) {
				arg3.aByteArray21 = arg4.aByteArray21 = new byte[this.anInt3865];
			} else {
				arg3.aByteArray21 = arg4.aByteArray21;
			}
			for (local245 = 0; local245 < this.anInt3865; local245++) {
				arg3.aByteArray21[local245] = this.aByteArray21[local245];
			}
		} else {
			arg3.aByteArray21 = this.aByteArray21;
		}
		if (Static552.method7996(arg2, this.anInt3856)) {
			arg3.aClass4_2 = arg4.aClass4_2;
			arg3.aClass4_2.aBoolean4 = true;
			arg3.aClass4_2.anInterface25_1 = this.aClass4_2.anInterface25_1;
			arg3.aClass4_2.aBoolean3 = this.aClass4_2.aBoolean3;
		} else if (Static126.method1774(arg2, this.anInt3856)) {
			arg3.aClass4_2 = this.aClass4_2;
		} else {
			arg3.aClass4_2 = null;
		}
		@Pc(642) int local642;
		if (Static402.method5909(this.anInt3856, arg2)) {
			if (arg4.aShortArray28 == null || arg4.aShortArray28.length < this.anInt3806) {
				local245 = this.anInt3806;
				arg3.aShortArray27 = arg4.aShortArray27 = new short[local245];
				arg3.aShortArray35 = arg4.aShortArray35 = new short[local245];
				arg3.aShortArray28 = arg4.aShortArray28 = new short[local245];
			} else {
				arg3.aShortArray28 = arg4.aShortArray28;
				arg3.aShortArray27 = arg4.aShortArray27;
				arg3.aShortArray35 = arg4.aShortArray35;
			}
			if (this.aClass86_1 == null) {
				arg3.aClass86_1 = null;
				for (local245 = 0; local245 < this.anInt3806; local245++) {
					arg3.aShortArray28[local245] = this.aShortArray28[local245];
					arg3.aShortArray27[local245] = this.aShortArray27[local245];
					arg3.aShortArray35[local245] = this.aShortArray35[local245];
				}
			} else {
				if (arg4.aClass86_1 == null) {
					arg4.aClass86_1 = new Class86();
				}
				@Pc(624) Class86 local624 = arg3.aClass86_1 = arg4.aClass86_1;
				if (local624.aShortArray14 == null || local624.aShortArray14.length < this.anInt3806) {
					local642 = this.anInt3806;
					local624.aByteArray9 = new byte[local642];
					local624.aShortArray14 = new short[local642];
					local624.aShortArray15 = new short[local642];
					local624.aShortArray16 = new short[local642];
				}
				for (local642 = 0; local642 < this.anInt3806; local642++) {
					arg3.aShortArray28[local642] = this.aShortArray28[local642];
					arg3.aShortArray27[local642] = this.aShortArray27[local642];
					arg3.aShortArray35[local642] = this.aShortArray35[local642];
					local624.aShortArray14[local642] = this.aClass86_1.aShortArray14[local642];
					local624.aShortArray15[local642] = this.aClass86_1.aShortArray15[local642];
					local624.aShortArray16[local642] = this.aClass86_1.aShortArray16[local642];
					local624.aByteArray9[local642] = this.aClass86_1.aByteArray9[local642];
				}
			}
			arg3.aByteArray20 = this.aByteArray20;
		} else {
			arg3.aClass86_1 = this.aClass86_1;
			arg3.aShortArray35 = this.aShortArray35;
			arg3.aShortArray27 = this.aShortArray27;
			arg3.aShortArray28 = this.aShortArray28;
			arg3.aByteArray20 = this.aByteArray20;
		}
		if (Static25.method377(arg2, this.anInt3856)) {
			arg3.aClass4_3 = arg4.aClass4_3;
			arg3.aClass4_3.anInterface25_1 = this.aClass4_3.anInterface25_1;
			arg3.aClass4_3.aBoolean4 = true;
			arg3.aClass4_3.aBoolean3 = this.aClass4_3.aBoolean3;
		} else if (Static300.method4404(arg2, this.anInt3856)) {
			arg3.aClass4_3 = this.aClass4_3;
		} else {
			arg3.aClass4_3 = null;
		}
		if (Static234.method3395(arg2, this.anInt3856)) {
			if (arg4.aFloatArray30 == null || this.anInt3865 > arg4.aFloatArray30.length) {
				local245 = this.anInt3806;
				arg3.aFloatArray30 = arg4.aFloatArray30 = new float[local245];
				arg3.aFloatArray29 = arg4.aFloatArray29 = new float[local245];
			} else {
				arg3.aFloatArray30 = arg4.aFloatArray30;
				arg3.aFloatArray29 = arg4.aFloatArray29;
			}
			for (local245 = 0; local245 < this.anInt3806; local245++) {
				arg3.aFloatArray30[local245] = this.aFloatArray30[local245];
				arg3.aFloatArray29[local245] = this.aFloatArray29[local245];
			}
		} else {
			arg3.aFloatArray30 = this.aFloatArray30;
			arg3.aFloatArray29 = this.aFloatArray29;
		}
		if (Static331.method5044(arg2, this.anInt3856)) {
			arg3.aClass4_4 = arg4.aClass4_4;
			arg3.aClass4_4.anInterface25_1 = this.aClass4_4.anInterface25_1;
			arg3.aClass4_4.aBoolean4 = true;
			arg3.aClass4_4.aBoolean3 = this.aClass4_4.aBoolean3;
		} else if (Static71.method1124(arg2, this.anInt3856)) {
			arg3.aClass4_4 = this.aClass4_4;
		} else {
			arg3.aClass4_4 = null;
		}
		if (Static253.method3723(this.anInt3856, arg2)) {
			if (arg4.aShortArray36 == null || arg4.aShortArray36.length < this.anInt3865) {
				local245 = this.anInt3865;
				arg3.aShortArray37 = arg4.aShortArray37 = new short[local245];
				arg3.aShortArray36 = arg4.aShortArray36 = new short[local245];
				arg3.aShortArray34 = arg4.aShortArray34 = new short[local245];
			} else {
				arg3.aShortArray37 = arg4.aShortArray37;
				arg3.aShortArray34 = arg4.aShortArray34;
				arg3.aShortArray36 = arg4.aShortArray36;
			}
			for (local245 = 0; local245 < this.anInt3865; local245++) {
				arg3.aShortArray36[local245] = this.aShortArray36[local245];
				arg3.aShortArray34[local245] = this.aShortArray34[local245];
				arg3.aShortArray37[local245] = this.aShortArray37[local245];
			}
		} else {
			arg3.aShortArray36 = this.aShortArray36;
			arg3.aShortArray34 = this.aShortArray34;
			arg3.aShortArray37 = this.aShortArray37;
		}
		if (Static247.method3635(this.anInt3856, arg2)) {
			arg3.aClass169_1 = arg4.aClass169_1;
			arg3.aClass169_1.aBoolean332 = true;
			arg3.aClass169_1.aBoolean333 = this.aClass169_1.aBoolean333;
			arg3.aClass169_1.anInterface9_2 = this.aClass169_1.anInterface9_2;
		} else if (Static631.method8845(arg2, this.anInt3856)) {
			arg3.aClass169_1 = this.aClass169_1;
		} else {
			arg3.aClass169_1 = null;
		}
		if (Static143.method2010(arg2, this.anInt3856)) {
			if (arg4.aShortArray39 == null || arg4.aShortArray39.length < this.anInt3865) {
				local245 = this.anInt3865;
				arg3.aShortArray39 = arg4.aShortArray39 = new short[local245];
			} else {
				arg3.aShortArray39 = arg4.aShortArray39;
			}
			for (local245 = 0; local245 < this.anInt3865; local245++) {
				arg3.aShortArray39[local245] = this.aShortArray39[local245];
			}
		} else {
			arg3.aShortArray39 = this.aShortArray39;
		}
		if (!Static422.method6310(arg2, this.anInt3856)) {
			arg3.aClass79Array1 = this.aClass79Array1;
		} else if (arg4.aClass79Array1 == null || this.anInt3824 > arg4.aClass79Array1.length) {
			local245 = this.anInt3824;
			arg3.aClass79Array1 = arg4.aClass79Array1 = new Class79[local245];
			for (local642 = 0; local642 < this.anInt3824; local642++) {
				arg3.aClass79Array1[local642] = this.aClass79Array1[local642].method1363();
			}
		} else {
			arg3.aClass79Array1 = arg4.aClass79Array1;
			for (local245 = 0; local245 < this.anInt3824; local245++) {
				arg3.aClass79Array1[local245].method1362(this.aClass79Array1[local245]);
			}
		}
		arg3.aClass161Array1 = this.aClass161Array1;
		arg3.aShortArray30 = this.aShortArray30;
		arg3.anIntArray215 = this.anIntArray215;
		arg3.anIntArray216 = this.anIntArray216;
		arg3.anIntArrayArray25 = this.anIntArrayArray25;
		arg3.aClass183Array1 = this.aClass183Array1;
		arg3.anIntArray214 = this.anIntArray214;
		arg3.aShortArray29 = this.aShortArray29;
		arg3.anIntArray219 = this.anIntArray219;
		arg3.aShortArray31 = this.aShortArray31;
		if (this.aBoolean300) {
			arg3.anInt3835 = this.anInt3835;
			arg3.anInt3797 = this.anInt3797;
			arg3.anInt3849 = this.anInt3849;
			arg3.anInt3874 = this.anInt3874;
			arg3.anInt3843 = this.anInt3843;
			arg3.anInt3832 = this.anInt3832;
			arg3.aBoolean300 = true;
			arg3.anInt3859 = this.anInt3859;
			arg3.anInt3802 = this.anInt3802;
		} else {
			arg3.aBoolean300 = false;
		}
		arg3.aClass189Array1 = this.aClass189Array1;
		arg3.aShortArray38 = this.aShortArray38;
		arg3.anIntArrayArray24 = this.anIntArrayArray24;
		arg3.anIntArrayArray23 = this.anIntArrayArray23;
		arg3.aShortArray33 = this.aShortArray33;
		return arg3;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIBIII)Z")
	private boolean method3353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > arg1 && arg4 > arg1 && arg1 < arg7) {
			return false;
		} else if (arg1 > arg6 && arg4 < arg1 && arg1 > arg7) {
			return false;
		} else if (arg2 < arg3 && arg0 > arg2 && arg2 < arg5) {
			return false;
		} else {
			return arg2 <= arg3 || arg0 >= arg2 || arg2 <= arg5;
		}
	}

	@OriginalMember(owner = "client!ho", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean300) {
			this.method3348();
		}
		return this.anInt3832;
	}

	@OriginalMember(owner = "client!ho", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean300) {
			this.method3348();
		}
		return this.anInt3797;
	}

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort43 = (short) arg0;
		this.method3359();
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "()Z")
	@Override
	public boolean method9083() {
		if (this.aShortArray39 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray39.length; local13++) {
			if (this.aShortArray39[local13] != -1 && !this.aClass57_Sub3_8.anInterface1_11.method2860(this.aShortArray39[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ho", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray24 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt3845; local13++) {
			this.anIntArray220[local13] <<= 0x4;
			this.anIntArray218[local13] <<= 0x4;
			this.anIntArray217[local13] <<= 0x4;
		}
		Static289.anInt10753 = 0;
		Static515.anInt8758 = 0;
		Static375.anInt6448 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ho", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean300) {
			this.method3348();
		}
		return this.anInt3835;
	}

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean300) {
			this.method3348();
		}
		@Pc(18) int local18 = arg4 + this.anInt3859;
		@Pc(23) int local23 = this.anInt3843 + arg4;
		@Pc(29) int local29 = arg6 + this.anInt3849;
		@Pc(35) int local35 = arg6 + this.anInt3835;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || arg2.anInt9376 <= local23 + arg2.anInt9377 >> arg2.anInt9378 || local29 < 0 || arg2.anInt9377 + local35 >> arg2.anInt9378 >= arg2.anInt9375)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || local23 + arg3.anInt9377 >> arg3.anInt9378 >= arg3.anInt9376 || local29 < 0 || arg3.anInt9377 + local35 >> arg3.anInt9378 >= arg3.anInt9375) {
				return;
			}
		} else {
			local18 >>= arg2.anInt9378;
			local23 = local23 + arg2.anInt9377 - 1 >> arg2.anInt9378;
			local29 >>= arg2.anInt9378;
			local35 = local35 + arg2.anInt9377 - 1 >> arg2.anInt9378;
			if (arg5 == arg2.method8038(local29, local18) && arg5 == arg2.method8038(local29, local23) && arg2.method8038(local35, local18) == arg5 && arg5 == arg2.method8038(local35, local23)) {
				return;
			}
		}
		@Pc(243) int local243;
		if (arg0 == 1) {
			for (local243 = 0; local243 < this.anInt3868; local243++) {
				this.anIntArray218[local243] = this.anIntArray218[local243] + arg2.method8032(this.anIntArray220[local243] - -arg4, arg6 + this.anIntArray217[local243]) - arg5;
			}
		} else {
			@Pc(249) int local249;
			@Pc(260) int local260;
			if (arg0 == 2) {
				local243 = this.anInt3797;
				if (local243 == 0) {
					return;
				}
				for (local249 = 0; local249 < this.anInt3868; local249++) {
					local260 = (this.anIntArray218[local249] << 16) / local243;
					if (arg1 > local260) {
						this.anIntArray218[local249] -= -((arg1 - local260) * (arg2.method8032(arg4 + this.anIntArray220[local249], this.anIntArray217[local249] - -arg6) + -arg5) / arg1);
					}
				}
			} else {
				@Pc(408) int local408;
				if (arg0 == 3) {
					local243 = (arg1 & 0xFF) * 4;
					local249 = (arg1 >> 8 & 0xFF) * 4;
					local260 = (arg1 >> 16 & 0xFF) << 6;
					local408 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local243 >> 1) < 0 || arg2.anInt9376 << arg2.anInt9378 <= arg2.anInt9377 + arg4 + (local243 >> 1) || arg6 - (local249 >> 1) < 0 || (local249 >> 1) + arg6 + arg2.anInt9377 >= arg2.anInt9375 << arg2.anInt9378) {
						return;
					}
					this.method9087(local249, local260, local408, arg6, arg5, local243, arg2, arg4);
				} else if (arg0 == 4) {
					local243 = this.anInt3802 - this.anInt3797;
					for (local249 = 0; local249 < this.anInt3868; local249++) {
						this.anIntArray218[local249] = local243 + this.anIntArray218[local249] + arg3.method8032(arg4 + this.anIntArray220[local249], this.anIntArray217[local249] - -arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local243 = this.anInt3802 - this.anInt3797;
					for (local249 = 0; local249 < this.anInt3868; local249++) {
						local260 = arg4 + this.anIntArray220[local249];
						local408 = arg6 + this.anIntArray217[local249];
						@Pc(414) int local414 = arg2.method8032(local260, local408);
						@Pc(420) int local420 = arg3.method8032(local260, local408);
						@Pc(426) int local426 = local414 - local420 - arg1;
						this.anIntArray218[local249] = local414 + (local426 * ((this.anIntArray218[local249] << 8) / local243) >> 8) - arg5;
					}
				}
			}
		}
		this.method3343();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!ho", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3865; local3++) {
			if (this.aShortArray32[local3] == arg0) {
				this.aShortArray32[local3] = arg1;
			}
		}
		if (this.aClass183Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt3824; local38++) {
				@Pc(45) Class183 local45 = this.aClass183Array1[local38];
				@Pc(50) Class79 local50 = this.aClass79Array1[local38];
				local50.anInt1516 = Static560.anIntArray534[this.aShortArray32[local45.anInt4687] & 0xFFFF] & 0xFFFFFF | local50.anInt1516 & 0xFF000000;
			}
		}
		this.method3359();
	}

	@OriginalMember(owner = "client!ho", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort43;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILclient!vu;)V")
	private void method3354(@OriginalArg(1) Class5_Sub5_Sub4_Sub2 arg0) {
		if (this.anInt3806 > Static594.anIntArray552.length) {
			Static405.anIntArray401 = new int[this.anInt3806];
			Static594.anIntArray552 = new int[this.anInt3806];
		}
		@Pc(51) int local51;
		@Pc(90) int local90;
		@Pc(99) int local99;
		for (@Pc(22) int local22 = 0; local22 < this.anInt3868; local22++) {
			local51 = (this.anIntArray220[local22] - (this.anIntArray218[local22] * this.aClass57_Sub3_8.anInt9182 >> 8) >> this.aClass57_Sub3_8.anInt9169) - arg0.anInt10521;
			@Pc(76) int local76 = (this.anIntArray217[local22] - (this.aClass57_Sub3_8.anInt9154 * this.anIntArray218[local22] >> 8) >> this.aClass57_Sub3_8.anInt9169) - arg0.anInt10524;
			@Pc(81) int local81 = this.anIntArray219[local22];
			@Pc(88) int local88 = this.anIntArray219[local22 + 1];
			for (local90 = local81; local90 < local88; local90++) {
				local99 = this.aShortArray29[local90] - 1;
				if (local99 == -1) {
					break;
				}
				Static594.anIntArray552[local99] = local51;
				Static405.anIntArray401[local99] = local76;
			}
		}
		if (8821 != 8821) {
			return;
		}
		for (local51 = 0; local51 < this.anInt3798; local51++) {
			if (this.aByteArray21 == null || this.aByteArray21[local51] <= 128) {
				@Pc(163) short local163 = this.aShortArray36[local51];
				@Pc(168) short local168 = this.aShortArray34[local51];
				@Pc(173) short local173 = this.aShortArray37[local51];
				local90 = Static594.anIntArray552[local163];
				local99 = Static594.anIntArray552[local168];
				@Pc(185) int local185 = Static594.anIntArray552[local173];
				@Pc(189) int local189 = Static405.anIntArray401[local163];
				@Pc(193) int local193 = Static405.anIntArray401[local168];
				@Pc(197) int local197 = Static405.anIntArray401[local173];
				if (-((local193 - local189) * (-local99 + local185)) + (local193 - local197) * (local90 + -local99) > 0) {
					arg0.method9023(local185, local197, local90, local193, local189, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(43) int local43;
		@Pc(53) int[] local53;
		@Pc(55) int local55;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			local27 = 0;
			Static289.anInt10753 = 0;
			Static515.anInt8758 = 0;
			Static375.anInt6448 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (this.anIntArrayArray24.length > local43) {
					local53 = this.anIntArrayArray24[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						if (this.aShortArray30 == null || (arg6 & this.aShortArray30[local61]) != 0) {
							Static515.anInt8758 += this.anIntArray220[local61];
							Static289.anInt10753 += this.anIntArray218[local61];
							Static375.anInt6448 += this.anIntArray217[local61];
							local27++;
						}
					}
				}
			}
			if (local27 <= 0) {
				Static375.anInt6448 = arg4;
				Static289.anInt10753 = arg3;
				Static515.anInt8758 = arg2;
			} else {
				Static289.anInt10753 = arg3 + Static289.anInt10753 / local27;
				Static515.anInt8758 = Static515.anInt8758 / local27 + arg2;
				Static375.anInt6448 = arg4 + Static375.anInt6448 / local27;
				Static265.aBoolean356 = true;
			}
			return;
		}
		@Pc(263) int[] local263;
		@Pc(265) int local265;
		if (arg0 == 1) {
			if (arg7 != null) {
				local27 = arg7[1] * arg3 + arg2 * arg7[0] + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg2 * arg7[3] + arg3 * arg7[4] + 8192 >> 14;
				local43 = arg7[7] * arg3 + arg7[6] * arg2 + arg7[8] * arg4 + 8192 >> 14;
				arg3 = local35;
				arg2 = local27;
				arg4 = local43;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray24.length) {
					local263 = this.anIntArrayArray24[local35];
					for (local265 = 0; local265 < local263.length; local265++) {
						local55 = local263[local265];
						if (this.aShortArray30 == null || (arg6 & this.aShortArray30[local55]) != 0) {
							this.anIntArray220[local55] += arg2;
							this.anIntArray218[local55] += arg3;
							this.anIntArray217[local55] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(415) int local415;
		@Pc(433) int local433;
		@Pc(669) int local669;
		@Pc(678) int local678;
		@Pc(689) int local689;
		@Pc(693) int local693;
		@Pc(711) int local711;
		@Pc(1044) int local1044;
		@Pc(1052) int local1052;
		@Pc(1208) int local1208;
		@Pc(1233) int local1233;
		@Pc(1238) int local1238;
		@Pc(1247) int local1247;
		@Pc(1252) int local1252;
		@Pc(1256) int local1256;
		@Pc(1260) int local1260;
		@Pc(1262) int local1262;
		@Pc(1398) int[] local1398;
		@Pc(1400) int local1400;
		@Pc(1406) int local1406;
		@Pc(1410) int local1410;
		@Pc(1412) int local1412;
		@Pc(1550) int local1550;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray24.length) {
						local263 = this.anIntArrayArray24[local35];
						for (local265 = 0; local265 < local263.length; local265++) {
							local55 = local263[local265];
							if (this.aShortArray30 == null || (arg6 & this.aShortArray30[local55]) != 0) {
								this.anIntArray220[local55] -= Static515.anInt8758;
								this.anIntArray218[local55] -= Static289.anInt10753;
								this.anIntArray217[local55] -= Static375.anInt6448;
								if (arg4 != 0) {
									local61 = Class5_Sub12.anIntArray544[arg4];
									local415 = Class5_Sub12.anIntArray543[arg4];
									local433 = this.anIntArray220[local55] * local415 + this.anIntArray218[local55] * local61 + 16383 >> 14;
									this.anIntArray218[local55] = this.anIntArray218[local55] * local415 + 16383 - local61 * this.anIntArray220[local55] >> 14;
									this.anIntArray220[local55] = local433;
								}
								if (arg2 != 0) {
									local61 = Class5_Sub12.anIntArray544[arg2];
									local415 = Class5_Sub12.anIntArray543[arg2];
									local433 = this.anIntArray218[local55] * local415 + 16383 - local61 * this.anIntArray217[local55] >> 14;
									this.anIntArray217[local55] = this.anIntArray217[local55] * local415 + local61 * this.anIntArray218[local55] + 16383 >> 14;
									this.anIntArray218[local55] = local433;
								}
								if (arg3 != 0) {
									local61 = Class5_Sub12.anIntArray544[arg3];
									local415 = Class5_Sub12.anIntArray543[arg3];
									local433 = this.anIntArray217[local55] * local61 + local415 * this.anIntArray220[local55] + 16383 >> 14;
									this.anIntArray217[local55] = local415 * this.anIntArray217[local55] + 16383 - local61 * this.anIntArray220[local55] >> 14;
									this.anIntArray220[local55] = local433;
								}
								this.anIntArray220[local55] += Static515.anInt8758;
								this.anIntArray218[local55] += Static289.anInt10753;
								this.anIntArray217[local55] += Static375.anInt6448;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray24.length > local43) {
							local53 = this.anIntArrayArray24[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								if (this.aShortArray30 == null || (arg6 & this.aShortArray30[local61]) != 0) {
									local415 = this.anIntArray219[local61];
									local433 = this.anIntArray219[local61 + 1];
									for (local669 = local415; local669 < local433; local669++) {
										local678 = this.aShortArray29[local669] - 1;
										if (local678 == -1) {
											break;
										}
										if (arg4 != 0) {
											local689 = Class5_Sub12.anIntArray544[arg4];
											local693 = Class5_Sub12.anIntArray543[arg4];
											local711 = this.aShortArray28[local678] * local693 + this.aShortArray27[local678] * local689 + 16383 >> 14;
											this.aShortArray27[local678] = (short) (this.aShortArray27[local678] * local693 + 16383 - this.aShortArray28[local678] * local689 >> 14);
											this.aShortArray28[local678] = (short) local711;
										}
										if (arg2 != 0) {
											local689 = Class5_Sub12.anIntArray544[arg2];
											local693 = Class5_Sub12.anIntArray543[arg2];
											local711 = local693 * this.aShortArray27[local678] + 16383 - this.aShortArray35[local678] * local689 >> 14;
											this.aShortArray35[local678] = (short) (local689 * this.aShortArray27[local678] + this.aShortArray35[local678] * local693 + 16383 >> 14);
											this.aShortArray27[local678] = (short) local711;
										}
										if (arg3 != 0) {
											local689 = Class5_Sub12.anIntArray544[arg3];
											local693 = Class5_Sub12.anIntArray543[arg3];
											local711 = this.aShortArray35[local678] * local689 + local693 * this.aShortArray28[local678] + 16383 >> 14;
											this.aShortArray35[local678] = (short) (local693 * this.aShortArray35[local678] + 16383 - local689 * this.aShortArray28[local678] >> 14);
											this.aShortArray28[local678] = (short) local711;
										}
									}
								}
							}
						}
					}
					this.method3357();
					return;
				}
			} else {
				local27 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local43 = arg7[11] << 4;
				local265 = arg7[12] << 4;
				local55 = arg7[13] << 4;
				local61 = arg7[14] << 4;
				if (Static265.aBoolean356) {
					local415 = arg7[6] * Static375.anInt6448 + Static515.anInt8758 * arg7[0] + arg7[3] * Static289.anInt10753 + 8192 >> 14;
					local433 = arg7[7] * Static375.anInt6448 + arg7[1] * Static515.anInt8758 + arg7[4] * Static289.anInt10753 + 8192 >> 14;
					local669 = Static375.anInt6448 * arg7[8] + Static289.anInt10753 * arg7[5] + Static515.anInt8758 * arg7[2] + 8192 >> 14;
					local433 += local55;
					local415 += local265;
					Static289.anInt10753 = local433;
					Static515.anInt8758 = local415;
					local669 += local61;
					Static375.anInt6448 = local669;
					Static265.aBoolean356 = false;
				}
				@Pc(1012) int[] local1012 = new int[9];
				local433 = Class5_Sub12.anIntArray543[arg2];
				local669 = Class5_Sub12.anIntArray544[arg2];
				local678 = Class5_Sub12.anIntArray543[arg3];
				local689 = Class5_Sub12.anIntArray544[arg3];
				local693 = Class5_Sub12.anIntArray543[arg4];
				local711 = Class5_Sub12.anIntArray544[arg4];
				local1044 = local669 * local693 + 8192 >> 14;
				local1052 = local711 * local669 + 8192 >> 14;
				local1012[3] = local711 * local433 + 8192 >> 14;
				local1012[5] = -local669;
				local1012[0] = local689 * local1052 + local678 * local693 + 8192 >> 14;
				local1012[7] = local1044 * local678 + local711 * local689 + 8192 >> 14;
				local1012[4] = local433 * local693 + 8192 >> 14;
				local1012[1] = -local678 * local711 + local1044 * local689 + 8192 >> 14;
				local1012[6] = -local689 * local693 + local1052 * local678 + 8192 >> 14;
				local1012[2] = local433 * local689 + 8192 >> 14;
				local1012[8] = local678 * local433 + 8192 >> 14;
				@Pc(1183) int local1183 = local1012[2] * -Static375.anInt6448 + local1012[0] * -Static515.anInt8758 + local1012[1] * -Static289.anInt10753 + 8192 >> 14;
				local1208 = local1012[4] * -Static289.anInt10753 + local1012[3] * -Static515.anInt8758 + local1012[5] * -Static375.anInt6448 + 8192 >> 14;
				local1233 = local1012[8] * -Static375.anInt6448 + local1012[7] * -Static289.anInt10753 + -Static515.anInt8758 * local1012[6] + 8192 >> 14;
				local1238 = local1183 + Static515.anInt8758;
				@Pc(1243) int local1243 = local1208 + Static289.anInt10753;
				local1247 = Static375.anInt6448 + local1233;
				@Pc(1250) int[] local1250 = new int[9];
				for (local1252 = 0; local1252 < 3; local1252++) {
					for (local1256 = 0; local1256 < 3; local1256++) {
						local1260 = 0;
						for (local1262 = 0; local1262 < 3; local1262++) {
							local1260 += local1012[local1262 + local1252 * 3] * arg7[local1256 * 3 + local1262];
						}
						local1250[local1252 * 3 + local1256] = local1260 + 8192 >> 14;
					}
				}
				local1256 = local61 * local1012[2] + local265 * local1012[0] + local1012[1] * local55 + 8192 >> 14;
				local1260 = local265 * local1012[3] + local55 * local1012[4] + local1012[5] * local61 + 8192 >> 14;
				local1262 = local61 * local1012[8] + local1012[6] * local265 + local1012[7] * local55 + 8192 >> 14;
				local1256 += local1238;
				local1260 += local1243;
				local1262 += local1247;
				local1398 = new int[9];
				for (local1400 = 0; local1400 < 3; local1400++) {
					for (local1406 = 0; local1406 < 3; local1406++) {
						local1410 = 0;
						for (local1412 = 0; local1412 < 3; local1412++) {
							local1410 += arg7[local1412 + local1400 * 3] * local1250[local1412 * 3 + local1406];
						}
						local1398[local1406 + local1400 * 3] = local1410 + 8192 >> 14;
					}
				}
				local1406 = local1262 * arg7[2] + local1260 * arg7[1] + arg7[0] * local1256 + 8192 >> 14;
				local1410 = local1256 * arg7[3] + local1260 * arg7[4] + local1262 * arg7[5] + 8192 >> 14;
				local1410 += local35;
				local1406 += local27;
				local1412 = arg7[8] * local1262 + local1260 * arg7[7] + arg7[6] * local1256 + 8192 >> 14;
				local1412 += local43;
				for (local1550 = 0; local1550 < local8; local1550++) {
					@Pc(1558) int local1558 = arg1[local1550];
					if (this.anIntArrayArray24.length > local1558) {
						@Pc(1572) int[] local1572 = this.anIntArrayArray24[local1558];
						for (@Pc(1574) int local1574 = 0; local1574 < local1572.length; local1574++) {
							@Pc(1580) int local1580 = local1572[local1574];
							if (this.aShortArray30 == null || (arg6 & this.aShortArray30[local1580]) != 0) {
								@Pc(1626) int local1626 = local1398[1] * this.anIntArray218[local1580] + this.anIntArray220[local1580] * local1398[0] + this.anIntArray217[local1580] * local1398[2] + 8192 >> 14;
								@Pc(1657) int local1657 = this.anIntArray217[local1580] * local1398[5] + this.anIntArray220[local1580] * local1398[3] + this.anIntArray218[local1580] * local1398[4] + 8192 >> 14;
								@Pc(1689) int local1689 = local1398[7] * this.anIntArray218[local1580] + this.anIntArray220[local1580] * local1398[6] + this.anIntArray217[local1580] * local1398[8] + 8192 >> 14;
								@Pc(1693) int local1693 = local1626 + local1406;
								@Pc(1697) int local1697 = local1657 + local1410;
								this.anIntArray220[local1580] = local1693;
								@Pc(1706) int local1706 = local1689 + local1412;
								this.anIntArray218[local1580] = local1697;
								this.anIntArray217[local1580] = local1706;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2677) Class79 local2677;
			@Pc(2545) boolean local2545;
			@Pc(2672) Class183 local2672;
			if (arg0 == 5) {
				if (this.anIntArrayArray23 != null) {
					local2545 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray23.length > local43) {
							local53 = this.anIntArrayArray23[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								if (this.aShortArray31 == null || (arg6 & this.aShortArray31[local61]) != 0) {
									local415 = (this.aByteArray21[local61] & 0xFF) + (arg2 * 8);
									if (local415 < 0) {
										local415 = 0;
									} else if (local415 > 255) {
										local415 = 255;
									}
									this.aByteArray21[local61] = (byte) local415;
								}
							}
							local2545 |= local53.length > 0;
						}
					}
					if (local2545) {
						if (this.aClass183Array1 != null) {
							for (local43 = 0; local43 < this.anInt3824; local43++) {
								local2672 = this.aClass183Array1[local43];
								local2677 = this.aClass79Array1[local43];
								local2677.anInt1516 = 255 - (this.aByteArray21[local2672.anInt4687] & 0xFF) << 24 | local2677.anInt1516 & 0xFFFFFF;
							}
						}
						this.method3359();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray23 != null) {
					local2545 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (local43 < this.anIntArrayArray23.length) {
							local53 = this.anIntArrayArray23[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								if (this.aShortArray31 == null || (arg6 & this.aShortArray31[local61]) != 0) {
									local415 = this.aShortArray32[local61] & 0xFFFF;
									local433 = local415 >> 10 & 0x3F;
									local669 = local415 >> 7 & 0x7;
									local678 = local415 & 0x7F;
									local669 += arg3 / 4;
									@Pc(2798) int local2798 = arg2 + local433 & 0x3F;
									local678 += arg4;
									if (local669 < 0) {
										local669 = 0;
									} else if (local669 > 7) {
										local669 = 7;
									}
									if (local678 < 0) {
										local678 = 0;
									} else if (local678 > 127) {
										local678 = 127;
									}
									this.aShortArray32[local61] = (short) (local2798 << 10 | local669 << 7 | local678);
								}
							}
							local2545 |= local53.length > 0;
						}
					}
					if (local2545) {
						if (this.aClass183Array1 != null) {
							for (local43 = 0; local43 < this.anInt3824; local43++) {
								local2672 = this.aClass183Array1[local43];
								local2677 = this.aClass79Array1[local43];
								local2677.anInt1516 = Static560.anIntArray534[this.aShortArray32[local2672.anInt4687] & 0xFFFF] & 0xFFFFFF | local2677.anInt1516 & 0xFF000000;
							}
						}
						this.method3359();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray25 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray25.length > local35) {
							local263 = this.anIntArrayArray25[local35];
							for (local265 = 0; local265 < local263.length; local265++) {
								local2677 = this.aClass79Array1[local263[local265]];
								local2677.anInt1518 += arg3;
								local2677.anInt1519 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray25 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray25.length > local35) {
							local263 = this.anIntArrayArray25[local35];
							for (local265 = 0; local265 < local263.length; local265++) {
								local2677 = this.aClass79Array1[local263[local265]];
								local2677.anInt1524 = arg3 * local2677.anInt1524 >> 7;
								local2677.anInt1523 = arg2 * local2677.anInt1523 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray25 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray25.length) {
						local263 = this.anIntArrayArray25[local35];
						for (local265 = 0; local265 < local263.length; local265++) {
							local2677 = this.aClass79Array1[local263[local265]];
							local2677.anInt1521 = local2677.anInt1521 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray24.length > local35) {
					local263 = this.anIntArrayArray24[local35];
					for (local265 = 0; local265 < local263.length; local265++) {
						local55 = local263[local265];
						if (this.aShortArray30 == null || (this.aShortArray30[local55] & arg6) != 0) {
							this.anIntArray220[local55] -= Static515.anInt8758;
							this.anIntArray218[local55] -= Static289.anInt10753;
							this.anIntArray217[local55] -= Static375.anInt6448;
							this.anIntArray220[local55] = this.anIntArray220[local55] * arg2 >> 7;
							this.anIntArray218[local55] = this.anIntArray218[local55] * arg3 >> 7;
							this.anIntArray217[local55] = arg4 * this.anIntArray217[local55] >> 7;
							this.anIntArray220[local55] += Static515.anInt8758;
							this.anIntArray218[local55] += Static289.anInt10753;
							this.anIntArray217[local55] += Static375.anInt6448;
						}
					}
				}
			}
		} else {
			local27 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local43 = arg7[11] << 4;
			local265 = arg7[12] << 4;
			local55 = arg7[13] << 4;
			local61 = arg7[14] << 4;
			if (Static265.aBoolean356) {
				local415 = Static375.anInt6448 * arg7[6] + Static289.anInt10753 * arg7[3] + Static515.anInt8758 * arg7[0] + 8192 >> 14;
				local433 = Static375.anInt6448 * arg7[7] + Static515.anInt8758 * arg7[1] + Static289.anInt10753 * arg7[4] + 8192 >> 14;
				local433 += local55;
				local669 = arg7[8] * Static375.anInt6448 + Static515.anInt8758 * arg7[2] + arg7[5] * Static289.anInt10753 + 8192 >> 14;
				local415 += local265;
				local669 += local61;
				Static515.anInt8758 = local415;
				Static289.anInt10753 = local433;
				Static265.aBoolean356 = false;
				Static375.anInt6448 = local669;
			}
			local415 = arg2 << 15 >> 7;
			local433 = arg3 << 15 >> 7;
			local669 = arg4 << 15 >> 7;
			local678 = local415 * -Static515.anInt8758 + 8192 >> 14;
			local689 = -Static289.anInt10753 * local433 + 8192 >> 14;
			local693 = local669 * -Static375.anInt6448 + 8192 >> 14;
			local711 = local678 + Static515.anInt8758;
			local1044 = local689 + Static289.anInt10753;
			local1052 = local693 + Static375.anInt6448;
			@Pc(1925) int[] local1925 = new int[] { local415 * arg7[0] + 8192 >> 14, arg7[3] * local415 + 8192 >> 14, local415 * arg7[6] + 8192 >> 14, arg7[1] * local433 + 8192 >> 14, arg7[4] * local433 + 8192 >> 14, arg7[7] * local433 + 8192 >> 14, local669 * arg7[2] + 8192 >> 14, local669 * arg7[5] + 8192 >> 14, arg7[8] * local669 + 8192 >> 14 };
			local1208 = local265 * local415 + 8192 >> 14;
			local1233 = local433 * local55 + 8192 >> 14;
			@Pc(2053) int local2053 = local1233 + local1044;
			local1238 = local669 * local61 + 8192 >> 14;
			@Pc(2065) int local2065 = local1208 + local711;
			@Pc(2069) int local2069 = local1238 + local1052;
			@Pc(2072) int[] local2072 = new int[9];
			@Pc(2078) int local2078;
			for (local1247 = 0; local1247 < 3; local1247++) {
				for (local2078 = 0; local2078 < 3; local2078++) {
					local1252 = 0;
					for (local1256 = 0; local1256 < 3; local1256++) {
						local1252 += local1925[local1256 * 3 + local2078] * arg7[local1247 * 3 + local1256];
					}
					local2072[local1247 * 3 + local2078] = local1252 + 8192 >> 14;
				}
			}
			local2078 = local2069 * arg7[2] + local2053 * arg7[1] + local2065 * arg7[0] + 8192 >> 14;
			local1252 = local2069 * arg7[5] + arg7[4] * local2053 + local2065 * arg7[3] + 8192 >> 14;
			local2078 += local27;
			local1252 += local35;
			local1256 = local2053 * arg7[7] + arg7[6] * local2065 + local2069 * arg7[8] + 8192 >> 14;
			local1256 += local43;
			for (local1260 = 0; local1260 < local8; local1260++) {
				local1262 = arg1[local1260];
				if (local1262 < this.anIntArrayArray24.length) {
					local1398 = this.anIntArrayArray24[local1262];
					for (local1400 = 0; local1400 < local1398.length; local1400++) {
						local1406 = local1398[local1400];
						if (this.aShortArray30 == null || (this.aShortArray30[local1406] & arg6) != 0) {
							local1410 = local2072[0] * this.anIntArray220[local1406] + this.anIntArray218[local1406] * local2072[1] + this.anIntArray217[local1406] * local2072[2] + 8192 >> 14;
							local1412 = this.anIntArray217[local1406] * local2072[5] + local2072[3] * this.anIntArray220[local1406] + this.anIntArray218[local1406] * local2072[4] + 8192 >> 14;
							local1550 = local2072[6] * this.anIntArray220[local1406] + local2072[7] * this.anIntArray218[local1406] + this.anIntArray217[local1406] * local2072[8] + 8192 >> 14;
							@Pc(2362) int local2362 = local1410 + local2078;
							@Pc(2366) int local2366 = local1412 + local1252;
							@Pc(2370) int local2370 = local1550 + local1256;
							this.anIntArray220[local1406] = local2362;
							this.anIntArray218[local1406] = local2366;
							this.anIntArray217[local1406] = local2370;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "(I)V")
	public void method3355() {
		if (this.aClass4_1 != null) {
			this.aClass4_1.method37();
		}
		if (this.aClass4_4 != null) {
			this.aClass4_4.method37();
		}
		if (this.aClass4_2 != null) {
			this.aClass4_2.method37();
		}
		if (this.aClass4_3 != null) {
			this.aClass4_3.method37();
		}
		if (this.aClass169_1 != null) {
			this.aClass169_1.method3622();
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "()V")
	@Override
	public void method9091() {
		if (this.anInt3806 > 0 && this.anInt3798 > 0) {
			this.method3345();
			this.method3346();
			this.method3347();
		}
	}

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V")
	private void method3357() {
		if ((this.anInt3856 & 0x37) == 0) {
			if (this.aClass4_2 == null) {
				return;
			}
			this.aClass4_2.aBoolean3 = false;
		} else if (this.aClass4_3 != null) {
			this.aClass4_3.aBoolean3 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILclient!qq;ZII)Z")
	@Override
	public boolean method9069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method3358(arg0, arg4, arg1, arg2, arg5, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIILclient!qq;IZ)Z")
	private boolean method3358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class203 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) Class203_Sub1 local8 = (Class203_Sub1) arg3;
		@Pc(12) Class203_Sub1 local12 = this.aClass57_Sub3_8.aClass203_Sub1_16;
		@Pc(33) float local33 = local8.aFloat97 * local12.aFloat94 + local8.aFloat88 * local12.aFloat92 + local8.aFloat89 * local12.aFloat95 + local12.aFloat88;
		@Pc(54) float local54 = local12.aFloat97 + local8.aFloat89 * local12.aFloat87 + local12.aFloat96 * local8.aFloat88 + local12.aFloat93 * local8.aFloat97;
		Static325.aFloat99 = local8.aFloat94 * local12.aFloat96 + local8.aFloat93 * local12.aFloat93 + local8.aFloat98 * local12.aFloat87;
		Static314.aFloat86 = local12.aFloat90 * local8.aFloat92 + local12.aFloat98 * local8.aFloat96 + local8.aFloat90 * local12.aFloat91;
		Static133.aFloat17 = local12.aFloat95 * local8.aFloat90 + local8.aFloat96 * local12.aFloat94 + local8.aFloat92 * local12.aFloat92;
		Static498.aFloat143 = local12.aFloat93 * local8.aFloat96 + local12.aFloat96 * local8.aFloat92 + local8.aFloat90 * local12.aFloat87;
		Static580.aFloat187 = local12.aFloat90 * local8.aFloat94 + local12.aFloat98 * local8.aFloat93 + local12.aFloat91 * local8.aFloat98;
		Static69.aFloat8 = local12.aFloat96 * local8.aFloat95 + local8.aFloat87 * local12.aFloat93 + local12.aFloat87 * local8.aFloat91;
		Static264.aFloat62 = local8.aFloat87 * local12.aFloat98 + local12.aFloat90 * local8.aFloat95 + local12.aFloat91 * local8.aFloat91;
		@Pc(201) float local201 = local8.aFloat89 * local12.aFloat91 + local8.aFloat88 * local12.aFloat90 + local12.aFloat98 * local8.aFloat97 + local12.aFloat89;
		Static274.aFloat64 = local8.aFloat91 * local12.aFloat95 + local8.aFloat87 * local12.aFloat94 + local12.aFloat92 * local8.aFloat95;
		Static152.aFloat24 = local8.aFloat93 * local12.aFloat94 + local12.aFloat92 * local8.aFloat94 + local8.aFloat98 * local12.aFloat95;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass57_Sub3_8.anInt9150;
		@Pc(255) int local255 = this.aClass57_Sub3_8.anInt9180;
		if (!this.aBoolean300) {
			this.method3348();
		}
		@Pc(271) int local271 = this.anInt3843 - this.anInt3859 >> 1;
		@Pc(279) int local279 = this.anInt3802 - this.anInt3797 >> 1;
		@Pc(288) int local288 = this.anInt3835 - this.anInt3849 >> 1;
		@Pc(294) int local294 = this.anInt3859 + local271;
		@Pc(299) int local299 = local279 + this.anInt3797;
		@Pc(304) int local304 = local288 + this.anInt3849;
		@Pc(316) int local316 = local294 - (local271 << arg1);
		@Pc(323) int local323 = local299 - (local279 << arg1);
		@Pc(330) int local330 = local304 - (local288 << arg1);
		@Pc(336) int local336 = local294 + (local271 << arg1);
		@Pc(342) int local342 = local299 + (local279 << arg1);
		@Pc(349) int local349 = local304 + (local288 << arg1);
		Static579.anIntArray537[0] = local316;
		Static444.anIntArray461[0] = local323;
		Static80.anIntArray58[0] = local330;
		Static579.anIntArray537[1] = local336;
		Static444.anIntArray461[1] = local323;
		Static579.anIntArray537[2] = local316;
		Static80.anIntArray58[1] = local330;
		Static444.anIntArray461[2] = local342;
		Static579.anIntArray537[3] = local336;
		Static80.anIntArray58[2] = local330;
		Static444.anIntArray461[3] = local342;
		Static80.anIntArray58[3] = local330;
		Static579.anIntArray537[4] = local316;
		Static444.anIntArray461[4] = local323;
		Static80.anIntArray58[4] = local349;
		Static579.anIntArray537[5] = local336;
		Static444.anIntArray461[5] = local323;
		Static579.anIntArray537[6] = local316;
		Static80.anIntArray58[5] = local349;
		Static444.anIntArray461[6] = local342;
		Static80.anIntArray58[6] = local349;
		Static579.anIntArray537[7] = local336;
		Static444.anIntArray461[7] = local342;
		Static80.anIntArray58[7] = local349;
		@Pc(480) float local480;
		@Pc(494) float local494;
		@Pc(508) float local508;
		@Pc(466) float local466;
		@Pc(461) float local461;
		@Pc(456) float local456;
		for (@Pc(447) int local447 = 0; local447 < 8; local447++) {
			local456 = (float) Static80.anIntArray58[local447];
			local461 = (float) Static444.anIntArray461[local447];
			local466 = (float) Static579.anIntArray537[local447];
			local480 = local33 + local461 * Static152.aFloat24 + Static133.aFloat17 * local466 + local456 * Static274.aFloat64;
			local494 = Static498.aFloat143 * local466 + Static325.aFloat99 * local461 + Static69.aFloat8 * local456 + local54;
			local508 = local201 + Static580.aFloat187 * local461 + Static314.aFloat86 * local466 + local456 * Static264.aFloat62;
			if (local508 >= (float) this.aClass57_Sub3_8.anInt9178) {
				if (arg4 > 0) {
					local508 = (float) arg4;
				}
				@Pc(537) float local537 = (float) local251 * local480 / local508 + (float) this.aClass57_Sub3_8.anInt9158;
				if (local243 < local537) {
					local243 = local537;
				}
				@Pc(555) float local555 = (float) this.aClass57_Sub3_8.anInt9164 + local494 * (float) local255 / local508;
				if (local537 < local241) {
					local241 = local537;
				}
				if (local247 < local555) {
					local247 = local555;
				}
				local239 = true;
				if (local555 < local245) {
					local245 = local555;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && local243 > (float) arg0 && local245 < (float) arg2 && (float) arg2 < local247) {
			if (arg5) {
				return true;
			}
			if (Static594.anIntArray552.length < this.anInt3806) {
				Static594.anIntArray552 = new int[this.anInt3806];
				Static405.anIntArray401 = new int[this.anInt3806];
			}
			@Pc(733) int local733;
			for (@Pc(639) int local639 = 0; local639 < this.anInt3868; local639++) {
				local466 = (float) this.anIntArray220[local639];
				local461 = (float) this.anIntArray218[local639];
				local456 = (float) this.anIntArray217[local639];
				local480 = local33 + local461 * Static152.aFloat24 + local466 * Static133.aFloat17 + local456 * Static274.aFloat64;
				local494 = local54 + local466 * Static498.aFloat143 + local461 * Static325.aFloat99 + local456 * Static69.aFloat8;
				local508 = local201 + Static580.aFloat187 * local461 + local466 * Static314.aFloat86 + Static264.aFloat62 * local456;
				@Pc(746) int local746;
				@Pc(751) int local751;
				@Pc(758) int local758;
				if (local508 >= (float) this.aClass57_Sub3_8.anInt9178) {
					if (arg4 > 0) {
						local508 = (float) arg4;
					}
					local733 = (int) ((float) local251 * local480 / local508 + (float) this.aClass57_Sub3_8.anInt9158);
					local746 = (int) ((float) this.aClass57_Sub3_8.anInt9164 + local494 * (float) local255 / local508);
					local751 = this.anIntArray219[local639];
					local758 = this.anIntArray219[local639 + 1];
					for (@Pc(760) int local760 = local751; local760 < local758; local760++) {
						@Pc(769) int local769 = this.aShortArray29[local760] - 1;
						if (local769 == -1) {
							break;
						}
						Static594.anIntArray552[local769] = local733;
						Static405.anIntArray401[local769] = local746;
					}
				} else {
					local733 = this.anIntArray219[local639];
					local746 = this.anIntArray219[local639 + 1];
					for (local751 = local733; local751 < local746; local751++) {
						local758 = this.aShortArray29[local751] - 1;
						if (local758 == -1) {
							break;
						}
						Static594.anIntArray552[this.aShortArray29[local751] - 1] = -999999;
					}
				}
			}
			for (local733 = 0; local733 < this.anInt3865; local733++) {
				if (Static594.anIntArray552[this.aShortArray36[local733]] != -999999 && Static594.anIntArray552[this.aShortArray34[local733]] != -999999 && Static594.anIntArray552[this.aShortArray37[local733]] != -999999 && this.method3353(Static594.anIntArray552[this.aShortArray34[local733]], arg2, arg0, Static594.anIntArray552[this.aShortArray36[local733]], Static405.anIntArray401[this.aShortArray34[local733]], Static594.anIntArray552[this.aShortArray37[local733]], Static405.anIntArray401[this.aShortArray36[local733]], Static405.anIntArray401[this.aShortArray37[local733]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ho", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort42 = (short) arg0;
		this.method3343();
		this.method3357();
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V")
	private void method3359() {
		if (this.aClass4_2 != null) {
			this.aClass4_2.aBoolean3 = false;
		}
	}

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12.anIntArray544[arg0];
		@Pc(13) int local13 = Class5_Sub12.anIntArray543[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3868; local15++) {
			local34 = this.anIntArray217[local15] * local9 + this.anIntArray220[local15] * local13 >> 14;
			this.anIntArray217[local15] = local13 * this.anIntArray217[local15] - local9 * this.anIntArray220[local15] >> 14;
			this.anIntArray220[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt3806; local34++) {
			@Pc(92) int local92 = this.aShortArray28[local34] * local13 + this.aShortArray35[local34] * local9 >> 14;
			this.aShortArray35[local34] = (short) (local13 * this.aShortArray35[local34] - this.aShortArray28[local34] * local9 >> 14);
			this.aShortArray28[local34] = (short) local92;
		}
		this.method3343();
		this.method3357();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!ho", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort42;
	}

	@OriginalMember(owner = "client!ho", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12.anIntArray544[arg0];
		@Pc(13) int local13 = Class5_Sub12.anIntArray543[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3868; local15++) {
			@Pc(35) int local35 = this.anIntArray220[local15] * local13 + this.anIntArray218[local15] * local9 >> 14;
			this.anIntArray218[local15] = local13 * this.anIntArray218[local15] - this.anIntArray220[local15] * local9 >> 14;
			this.anIntArray220[local15] = local35;
		}
		this.method3343();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "()V")
	@Override
	protected void method9079() {
	}

	@OriginalMember(owner = "client!ho", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class5_Sub5_Sub4 ba(@OriginalArg(0) Class5_Sub5_Sub4 arg0) {
		if (this.anInt3806 == 0) {
			return null;
		}
		if (!this.aBoolean300) {
			this.method3348();
		}
		@Pc(42) int local42;
		@Pc(59) int local59;
		if (this.aClass57_Sub3_8.anInt9182 > 0) {
			local42 = this.anInt3859 - (this.anInt3802 * this.aClass57_Sub3_8.anInt9182 >> 8) >> this.aClass57_Sub3_8.anInt9169;
			local59 = this.anInt3843 - (this.anInt3797 * this.aClass57_Sub3_8.anInt9182 >> 8) >> this.aClass57_Sub3_8.anInt9169;
		} else {
			local42 = this.anInt3859 - (this.aClass57_Sub3_8.anInt9182 * this.anInt3797 >> 8) >> this.aClass57_Sub3_8.anInt9169;
			local59 = this.anInt3843 - (this.aClass57_Sub3_8.anInt9182 * this.anInt3802 >> 8) >> this.aClass57_Sub3_8.anInt9169;
		}
		@Pc(118) int local118;
		@Pc(135) int local135;
		if (this.aClass57_Sub3_8.anInt9154 > 0) {
			local118 = this.anInt3849 - (this.anInt3802 * this.aClass57_Sub3_8.anInt9154 >> 8) >> this.aClass57_Sub3_8.anInt9169;
			local135 = this.anInt3835 - (this.anInt3797 * this.aClass57_Sub3_8.anInt9154 >> 8) >> this.aClass57_Sub3_8.anInt9169;
		} else {
			local118 = this.anInt3849 - (this.aClass57_Sub3_8.anInt9154 * this.anInt3797 >> 8) >> this.aClass57_Sub3_8.anInt9169;
			local135 = this.anInt3835 - (this.anInt3802 * this.aClass57_Sub3_8.anInt9154 >> 8) >> this.aClass57_Sub3_8.anInt9169;
		}
		@Pc(178) int local178 = local59 + 1 - local42;
		@Pc(185) int local185 = local135 + 1 - local118;
		@Pc(188) Class5_Sub5_Sub4_Sub2 local188 = (Class5_Sub5_Sub4_Sub2) arg0;
		@Pc(200) Class5_Sub5_Sub4_Sub2 local200;
		if (local188 != null && local188.method9026(local185, local178)) {
			local200 = local188;
			local188.method9028();
		} else {
			local200 = new Class5_Sub5_Sub4_Sub2(this.aClass57_Sub3_8, local178, local185);
		}
		local200.method9029(local135, local42, local118, local59);
		this.method3354(local200);
		return local200;
	}

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)V")
	private void method3360() {
		if (this.anInt3798 == 0) {
			return;
		}
		if (this.method3345() && this.method3346()) {
			this.aClass57_Sub3_8.method7807(0, this.aClass4_1.anInterface25_1);
			this.aClass57_Sub3_8.method7807(1, this.aClass4_2.anInterface25_1);
			this.aClass57_Sub3_8.method7807(2, this.aClass4_4.anInterface25_1);
			@Pc(56) boolean local56;
			if ((this.anInt3856 & 0x37) == 0) {
				local56 = false;
				this.aClass57_Sub3_8.method7820(false);
				this.aClass57_Sub3_8.method7745(this.aClass57_Sub3_8.aClass147_21);
			} else {
				this.aClass57_Sub3_8.method7820(true);
				local56 = true;
				this.aClass57_Sub3_8.method7807(3, this.aClass4_3.anInterface25_1);
				this.aClass57_Sub3_8.method7745(this.aClass57_Sub3_8.aClass147_20);
			}
			for (@Pc(94) int local94 = 0; local94 < this.anIntArray216.length; local94++) {
				@Pc(101) int local101 = this.anIntArray215[local94];
				@Pc(108) int local108 = this.anIntArray215[local94 + 1];
				@Pc(115) int local115 = this.aShortArray39[local101] & 0xFFFF;
				if (local115 == 65535) {
					local115 = -1;
				}
				this.aClass57_Sub3_8.method7827(true, local115, local56);
				this.aClass57_Sub3_8.method7814(this.anIntArray214[local94], this.aClass169_1.anInterface9_2, this.anIntArray216[local94], local101 * 3, Static175.aClass85_1, local108 - local101);
			}
		}
		this.method3347();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!qq;)V")
	@Override
	public void method9090(@OriginalArg(0) Class203 arg0) {
		@Pc(8) Class203_Sub1 local8 = (Class203_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass189Array1 != null) {
			for (local13 = 0; local13 < this.aClass189Array1.length; local13++) {
				@Pc(20) Class189 local20 = this.aClass189Array1[local13];
				@Pc(22) Class189 local22 = local20;
				if (local20.aClass189_2 != null) {
					local22 = local20.aClass189_2;
				}
				local22.anInt4894 = (int) (local8.aFloat88 + local8.aFloat92 * (float) this.anIntArray220[local20.anInt4891] + local8.aFloat94 * (float) this.anIntArray218[local20.anInt4891] + (float) this.anIntArray217[local20.anInt4891] * local8.aFloat95);
				local22.anInt4883 = (int) (local8.aFloat97 + local8.aFloat87 * (float) this.anIntArray217[local20.anInt4891] + local8.aFloat96 * (float) this.anIntArray220[local20.anInt4891] + local8.aFloat93 * (float) this.anIntArray218[local20.anInt4891]);
				local22.anInt4899 = (int) (local8.aFloat89 + local8.aFloat90 * (float) this.anIntArray220[local20.anInt4891] + local8.aFloat98 * (float) this.anIntArray218[local20.anInt4891] + local8.aFloat91 * (float) this.anIntArray217[local20.anInt4891]);
				local22.anInt4896 = (int) ((float) this.anIntArray217[local20.anInt4885] * local8.aFloat95 + local8.aFloat92 * (float) this.anIntArray220[local20.anInt4885] + (float) this.anIntArray218[local20.anInt4885] * local8.aFloat94 + local8.aFloat88);
				local22.anInt4900 = (int) (local8.aFloat97 + (float) this.anIntArray218[local20.anInt4885] * local8.aFloat93 + (float) this.anIntArray220[local20.anInt4885] * local8.aFloat96 + local8.aFloat87 * (float) this.anIntArray217[local20.anInt4885]);
				local22.anInt4888 = (int) (local8.aFloat89 + (float) this.anIntArray217[local20.anInt4885] * local8.aFloat91 + (float) this.anIntArray218[local20.anInt4885] * local8.aFloat98 + (float) this.anIntArray220[local20.anInt4885] * local8.aFloat90);
				local22.anInt4895 = (int) (local8.aFloat88 + local8.aFloat92 * (float) this.anIntArray220[local20.anInt4901] + local8.aFloat94 * (float) this.anIntArray218[local20.anInt4901] + local8.aFloat95 * (float) this.anIntArray217[local20.anInt4901]);
				local22.anInt4886 = (int) ((float) this.anIntArray217[local20.anInt4901] * local8.aFloat87 + local8.aFloat96 * (float) this.anIntArray220[local20.anInt4901] + (float) this.anIntArray218[local20.anInt4901] * local8.aFloat93 + local8.aFloat97);
				local22.anInt4898 = (int) (local8.aFloat89 + (float) this.anIntArray218[local20.anInt4901] * local8.aFloat98 + (float) this.anIntArray220[local20.anInt4901] * local8.aFloat90 + local8.aFloat91 * (float) this.anIntArray217[local20.anInt4901]);
			}
		}
		if (this.aClass161Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass161Array1.length; local13++) {
			@Pc(367) Class161 local367 = this.aClass161Array1[local13];
			@Pc(369) Class161 local369 = local367;
			if (local367.aClass161_1 != null) {
				local369 = local367.aClass161_1;
			}
			if (local367.aClass203_5 == null) {
				local367.aClass203_5 = local8.method8323();
			} else {
				local367.aClass203_5.method8336(local8);
			}
			local369.anInt3681 = (int) (local8.aFloat88 + local8.aFloat92 * (float) this.anIntArray220[local367.anInt3680] + local8.aFloat94 * (float) this.anIntArray218[local367.anInt3680] + local8.aFloat95 * (float) this.anIntArray217[local367.anInt3680]);
			local369.anInt3675 = (int) (local8.aFloat97 + local8.aFloat87 * (float) this.anIntArray217[local367.anInt3680] + local8.aFloat96 * (float) this.anIntArray220[local367.anInt3680] + local8.aFloat93 * (float) this.anIntArray218[local367.anInt3680]);
			local369.anInt3678 = (int) (local8.aFloat89 + (float) this.anIntArray220[local367.anInt3680] * local8.aFloat90 + local8.aFloat98 * (float) this.anIntArray218[local367.anInt3680] + local8.aFloat91 * (float) this.anIntArray217[local367.anInt3680]);
		}
	}

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean298;
	}

	@OriginalMember(owner = "client!ho", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12.anIntArray544[arg0];
		@Pc(13) int local13 = Class5_Sub12.anIntArray543[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3868; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray218[local15] - local9 * this.anIntArray217[local15] >> 14;
			this.anIntArray217[local15] = this.anIntArray217[local15] * local13 + local9 * this.anIntArray218[local15] >> 14;
			this.anIntArray218[local15] = local34;
		}
		this.method3343();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!qq;Lclient!ng;II)V")
	@Override
	public void method9092(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class8_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3806 == 0) {
			return;
		}
		@Pc(17) Class203_Sub1 local17 = this.aClass57_Sub3_8.aClass203_Sub1_16;
		if (!this.aBoolean300) {
			this.method3348();
		}
		@Pc(28) Class203_Sub1 local28 = (Class203_Sub1) arg0;
		Static580.aFloat187 = local17.aFloat91 * local28.aFloat98 + local28.aFloat93 * local17.aFloat98 + local17.aFloat90 * local28.aFloat94;
		Static440.aFloat135 = local28.aFloat88 * local17.aFloat90 + local17.aFloat98 * local28.aFloat97 + local28.aFloat89 * local17.aFloat91 + local17.aFloat89;
		@Pc(75) float local75 = (float) this.anInt3797 * Static580.aFloat187 + Static440.aFloat135;
		@Pc(83) float local83 = Static440.aFloat135 + (float) this.anInt3802 * Static580.aFloat187;
		@Pc(99) float local99;
		@Pc(93) float local93;
		if (local83 < local75) {
			local93 = (float) this.anInt3874 + local75;
			local99 = (float) -this.anInt3874 + local83;
		} else {
			local93 = (float) this.anInt3874 + local83;
			local99 = local75 - (float) this.anInt3874;
		}
		if (this.aClass57_Sub3_8.aFloat175 <= local99 || (float) this.aClass57_Sub3_8.anInt9178 >= local93) {
			return;
		}
		Static126.aFloat13 = local28.aFloat97 * local17.aFloat94 + local17.aFloat92 * local28.aFloat88 + local28.aFloat89 * local17.aFloat95 + local17.aFloat88;
		Static152.aFloat24 = local17.aFloat94 * local28.aFloat93 + local17.aFloat92 * local28.aFloat94 + local28.aFloat98 * local17.aFloat95;
		@Pc(178) float local178 = (float) this.anInt3797 * Static152.aFloat24 + Static126.aFloat13;
		@Pc(186) float local186 = (float) this.anInt3802 * Static152.aFloat24 + Static126.aFloat13;
		@Pc(202) float local202;
		@Pc(213) float local213;
		if (local178 > local186) {
			local202 = (local186 - (float) this.anInt3874) * (float) this.aClass57_Sub3_8.anInt9150;
			local213 = (float) this.aClass57_Sub3_8.anInt9150 * (local178 + (float) this.anInt3874);
		} else {
			local202 = ((float) -this.anInt3874 + local178) * (float) this.aClass57_Sub3_8.anInt9150;
			local213 = (float) this.aClass57_Sub3_8.anInt9150 * (local186 + (float) this.anInt3874);
		}
		if (this.aClass57_Sub3_8.aFloat168 <= local202 / (float) arg2 || this.aClass57_Sub3_8.aFloat180 >= local213 / (float) arg2) {
			return;
		}
		Static78.aFloat184 = local17.aFloat97 + local17.aFloat87 * local28.aFloat89 + local28.aFloat97 * local17.aFloat93 + local28.aFloat88 * local17.aFloat96;
		Static325.aFloat99 = local28.aFloat94 * local17.aFloat96 + local17.aFloat93 * local28.aFloat93 + local17.aFloat87 * local28.aFloat98;
		@Pc(306) float local306 = Static78.aFloat184 + Static325.aFloat99 * (float) this.anInt3797;
		@Pc(314) float local314 = (float) this.anInt3802 * Static325.aFloat99 + Static78.aFloat184;
		@Pc(340) float local340;
		@Pc(329) float local329;
		if (local314 < local306) {
			local329 = (local306 + (float) this.anInt3874) * (float) this.aClass57_Sub3_8.anInt9180;
			local340 = (float) this.aClass57_Sub3_8.anInt9180 * ((float) -this.anInt3874 + local314);
		} else {
			local329 = (float) this.aClass57_Sub3_8.anInt9180 * ((float) this.anInt3874 + local314);
			local340 = (float) this.aClass57_Sub3_8.anInt9180 * (local306 - (float) this.anInt3874);
		}
		if (this.aClass57_Sub3_8.aFloat181 <= local340 / (float) arg2 || local329 / (float) arg2 <= this.aClass57_Sub3_8.aFloat176) {
			return;
		}
		if (arg1 != null || this.aClass183Array1 != null) {
			Static133.aFloat17 = local28.aFloat92 * local17.aFloat92 + local17.aFloat94 * local28.aFloat96 + local28.aFloat90 * local17.aFloat95;
			Static69.aFloat8 = local28.aFloat91 * local17.aFloat87 + local17.aFloat96 * local28.aFloat95 + local17.aFloat93 * local28.aFloat87;
			Static314.aFloat86 = local17.aFloat91 * local28.aFloat90 + local28.aFloat92 * local17.aFloat90 + local28.aFloat96 * local17.aFloat98;
			Static274.aFloat64 = local28.aFloat95 * local17.aFloat92 + local28.aFloat87 * local17.aFloat94 + local28.aFloat91 * local17.aFloat95;
			Static264.aFloat62 = local28.aFloat91 * local17.aFloat91 + local17.aFloat98 * local28.aFloat87 + local28.aFloat95 * local17.aFloat90;
			Static498.aFloat143 = local17.aFloat87 * local28.aFloat90 + local28.aFloat92 * local17.aFloat96 + local17.aFloat93 * local28.aFloat96;
		}
		if (arg1 != null) {
			@Pc(514) int local514 = this.anInt3859 + this.anInt3843 >> 1;
			@Pc(523) int local523 = this.anInt3849 + this.anInt3835 >> 1;
			@Pc(542) int local542 = (int) (Static126.aFloat13 + (float) local514 * Static133.aFloat17 + (float) this.anInt3797 * Static152.aFloat24 + Static274.aFloat64 * (float) local523);
			@Pc(561) int local561 = (int) ((float) this.anInt3797 * Static325.aFloat99 + Static78.aFloat184 + (float) local514 * Static498.aFloat143 + Static69.aFloat8 * (float) local523);
			@Pc(580) int local580 = (int) ((float) local514 * Static314.aFloat86 + Static440.aFloat135 + (float) this.anInt3797 * Static580.aFloat187 + Static264.aFloat62 * (float) local523);
			@Pc(599) int local599 = (int) (Static274.aFloat64 * (float) local523 + Static152.aFloat24 * (float) this.anInt3802 + Static126.aFloat13 + (float) local514 * Static133.aFloat17);
			@Pc(618) int local618 = (int) (Static78.aFloat184 + Static498.aFloat143 * (float) local514 + (float) this.anInt3802 * Static325.aFloat99 + (float) local523 * Static69.aFloat8);
			arg1.anInt6702 = this.aClass57_Sub3_8.anInt9164 + this.aClass57_Sub3_8.anInt9180 * local618 / arg2;
			arg1.anInt6698 = local561 * this.aClass57_Sub3_8.anInt9180 / arg2 + this.aClass57_Sub3_8.anInt9164;
			arg1.anInt6699 = this.aClass57_Sub3_8.anInt9158 + local542 * this.aClass57_Sub3_8.anInt9150 / arg2;
			arg1.anInt6701 = local599 * this.aClass57_Sub3_8.anInt9150 / arg2 + this.aClass57_Sub3_8.anInt9158;
			@Pc(690) int local690 = (int) ((float) local523 * Static264.aFloat62 + (float) local514 * Static314.aFloat86 + Static440.aFloat135 + (float) this.anInt3802 * Static580.aFloat187);
			if (local580 >= this.aClass57_Sub3_8.anInt9178 || this.aClass57_Sub3_8.anInt9178 <= local690) {
				arg1.anInt6700 = this.aClass57_Sub3_8.anInt9158 + this.aClass57_Sub3_8.anInt9150 * (this.anInt3874 + local542) / arg2 - arg1.anInt6699;
				arg1.aBoolean519 = true;
			}
		}
		this.aClass57_Sub3_8.method7817((float) arg2);
		this.aClass57_Sub3_8.method7801();
		this.aClass57_Sub3_8.method7802(local28);
		this.method3360();
		this.method3351();
	}
}
