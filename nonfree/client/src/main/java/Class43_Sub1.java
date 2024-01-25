import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!bp", name = "O", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!bp", name = "Sb", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!bp", name = "ic", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!bp", name = "tb", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!bp", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!bp", name = "Mb", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "[F")
	private float[] aFloatArray2;

	@OriginalMember(owner = "client!bp", name = "Ac", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!bp", name = "D", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!bp", name = "Dc", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!bp", name = "vb", descriptor = "[Lclient!wfa;")
	private Class391[] aClass391Array1;

	@OriginalMember(owner = "client!bp", name = "Vb", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!bp", name = "Eb", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!bp", name = "db", descriptor = "[Lclient!ok;")
	private Class270[] aClass270Array1;

	@OriginalMember(owner = "client!bp", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!bp", name = "zb", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!bp", name = "ib", descriptor = "[Lclient!ufa;")
	private Class360[] aClass360Array1;

	@OriginalMember(owner = "client!bp", name = "Gb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!bp", name = "zc", descriptor = "I")
	private int anInt764;

	@OriginalMember(owner = "client!bp", name = "V", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "Lclient!ika;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!bp", name = "tc", descriptor = "[F")
	private float[] aFloatArray3;

	@OriginalMember(owner = "client!bp", name = "Rb", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!bp", name = "Jb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!bp", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!bp", name = "ec", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!bp", name = "Y", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!bp", name = "pc", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!bp", name = "S", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!bp", name = "qb", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!bp", name = "Fb", descriptor = "Lclient!bv;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
	private int anInt796;

	@OriginalMember(owner = "client!bp", name = "xc", descriptor = "[Lclient!ui;")
	private Class363[] aClass363Array1;

	@OriginalMember(owner = "client!bp", name = "Ub", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!bp", name = "wc", descriptor = "I")
	private int anInt798;

	@OriginalMember(owner = "client!bp", name = "Ib", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!bp", name = "ub", descriptor = "B")
	private byte aByte16;

	@OriginalMember(owner = "client!bp", name = "Tb", descriptor = "Lclient!g;")
	private Class123 aClass123_1;

	@OriginalMember(owner = "client!bp", name = "B", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!bp", name = "M", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!bp", name = "eb", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!bp", name = "Nb", descriptor = "I")
	private int anInt740 = 0;

	@OriginalMember(owner = "client!bp", name = "Ab", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!bp", name = "ac", descriptor = "I")
	private int anInt773 = 0;

	@OriginalMember(owner = "client!bp", name = "nb", descriptor = "I")
	private int anInt778 = 0;

	@OriginalMember(owner = "client!bp", name = "cc", descriptor = "Z")
	private boolean aBoolean52 = true;

	@OriginalMember(owner = "client!bp", name = "jc", descriptor = "I")
	private int anInt775 = 0;

	@OriginalMember(owner = "client!bp", name = "Ec", descriptor = "I")
	private int anInt758 = 0;

	@OriginalMember(owner = "client!bp", name = "x", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!bp", name = "hb", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_6;

	@OriginalMember(owner = "client!bp", name = "uc", descriptor = "Lclient!kn;")
	private Class207 aClass207_4;

	@OriginalMember(owner = "client!bp", name = "Xb", descriptor = "Lclient!kn;")
	private Class207 aClass207_2;

	@OriginalMember(owner = "client!bp", name = "Cc", descriptor = "Lclient!kn;")
	private Class207 aClass207_3;

	@OriginalMember(owner = "client!bp", name = "Pb", descriptor = "Lclient!kn;")
	private Class207 aClass207_1;

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "Lclient!jka;")
	private Class190 aClass190_1;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class43_Sub1(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_6 = arg0;
		this.aClass207_4 = new Class207((Interface17) null, 5126, 3, 0);
		this.aClass207_2 = new Class207((Interface17) null, 5126, 2, 0);
		this.aClass207_3 = new Class207((Interface17) null, 5126, 3, 0);
		this.aClass207_1 = new Class207((Interface17) null, 5121, 4, 0);
		this.aClass190_1 = new Class190();
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!vf;Lclient!kc;IIII)V")
	public Class43_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt764 = arg5;
		this.aClass100_Sub3_6 = arg0;
		this.anInt796 = arg2;
		if (Static177.method3094(arg2, arg5)) {
			this.aClass207_4 = new Class207((Interface17) null, 5126, 3, 0);
		}
		if (Static528.method7230(arg2, arg5)) {
			this.aClass207_2 = new Class207((Interface17) null, 5126, 2, 0);
		}
		if (Static457.method6443(arg5, arg2)) {
			this.aClass207_3 = new Class207((Interface17) null, 5126, 3, 0);
		}
		if (Static469.method6633(arg2, arg5)) {
			this.aClass207_1 = new Class207((Interface17) null, 5121, 4, 0);
		}
		if (Static121.method1820(arg2, arg5)) {
			this.aClass190_1 = new Class190();
		}
		@Pc(116) Interface7 local116 = arg0.anInterface7_12;
		this.anIntArray56 = new int[arg1.anInt5124 + 1];
		@Pc(127) int[] local127 = new int[arg1.anInt5115];
		for (@Pc(129) int local129 = 0; local129 < arg1.anInt5115; local129++) {
			if (arg1.aByteArray50 == null || arg1.aByteArray50[local129] != 2) {
				if (arg1.aShortArray66 != null && arg1.aShortArray66[local129] != -1) {
					@Pc(170) Class44 local170 = local116.method7423(arg1.aShortArray66[local129] & 0xFFFF);
					if (((this.anInt764 & 0x40) == 0 || !local170.aBoolean56) && local170.aBoolean58) {
						continue;
					}
				}
				local127[this.anInt758++] = local129;
				this.anIntArray56[arg1.aShortArray67[local129]]++;
				this.anIntArray56[arg1.aShortArray71[local129]]++;
				this.anIntArray56[arg1.aShortArray64[local129]]++;
			}
		}
		this.anInt740 = this.anInt758;
		@Pc(251) long[] local251 = new long[this.anInt758];
		@Pc(263) boolean local263 = (this.anInt796 & 0x100) != 0;
		@Pc(277) int local277;
		@Pc(290) int local290;
		@Pc(492) int local492;
		for (@Pc(265) int local265 = 0; local265 < this.anInt758; local265++) {
			@Pc(273) int local273 = local127[local265];
			@Pc(275) Class44 local275 = null;
			local277 = 0;
			@Pc(279) byte local279 = 0;
			@Pc(281) byte local281 = 0;
			@Pc(283) byte local283 = 0;
			if (arg1.aClass129Array1 != null) {
				@Pc(288) boolean local288 = false;
				for (local290 = 0; local290 < arg1.aClass129Array1.length; local290++) {
					@Pc(297) Class129 local297 = arg1.aClass129Array1[local290];
					if (local273 == local297.anInt3394) {
						@Pc(310) Class335 local310 = Static357.method5233(local297.anInt3390);
						if (local310.aBoolean577) {
							local288 = true;
						}
						if (local310.anInt8737 != -1) {
							@Pc(326) Class44 local326 = local116.method7423(local310.anInt8737);
							if (local326.anInt809 == 2) {
								this.aBoolean53 = true;
							}
						}
					}
				}
				if (local288) {
					local251[local265] = Long.MAX_VALUE;
					this.anInt740--;
					continue;
				}
			}
			@Pc(367) short local367 = -1;
			if (arg1.aShortArray66 != null) {
				local367 = arg1.aShortArray66[local273];
				if (local367 != -1) {
					local275 = local116.method7423(local367 & 0xFFFF);
					if ((this.anInt764 & 0x40) != 0 && local275.aBoolean56) {
						local275 = null;
						local367 = -1;
					} else {
						local283 = local275.aByte19;
						if (local275.aByte18 != 0 || local275.aByte20 != 0) {
							this.aBoolean55 = true;
						}
						local281 = local275.aByte23;
					}
				}
			}
			@Pc(450) boolean local450 = arg1.aByteArray55 != null && arg1.aByteArray55[local273] != 0 || local275 != null && local275.anInt809 != 0;
			if ((local263 || local450) && arg1.aByteArray49 != null) {
				local277 += arg1.aByteArray49[local273] << 17;
			}
			if (local450) {
				local277 += 65536;
			}
			local277 += (local281 & 0xFF) << 8;
			local492 = local279 + ((local367 & 0xFFFF) << 16);
			local277 += local283 & 0xFF;
			@Pc(504) int local504 = local492 + (local265 & 0xFFFF);
			local251[local265] = ((long) local277 << 32) + ((long) local504);
			this.aBoolean53 |= local450;
			this.aBoolean55 |= local275 != null && (local275.aByte18 != 0 || local275.aByte20 != 0);
		}
		Static347.method5132(local251, local127);
		this.anInt775 = arg1.anInt5130;
		this.anIntArray58 = arg1.anIntArray302;
		this.anInt778 = arg1.anInt5124;
		this.anIntArray57 = arg1.anIntArray299;
		this.anIntArray53 = arg1.anIntArray307;
		this.aShortArray14 = arg1.aShortArray72;
		@Pc(590) Class236[] local590 = new Class236[this.anInt778];
		this.aClass363Array1 = arg1.aClass363Array3;
		this.aClass270Array1 = arg1.aClass270Array3;
		@Pc(618) int local618;
		@Pc(634) int local634;
		@Pc(682) int local682;
		if (arg1.aClass129Array1 != null) {
			this.anInt798 = arg1.aClass129Array1.length;
			this.aClass360Array1 = new Class360[this.anInt798];
			this.aClass391Array1 = new Class391[this.anInt798];
			for (local618 = 0; local618 < this.anInt798; local618++) {
				@Pc(627) Class129 local627 = arg1.aClass129Array1[local618];
				@Pc(632) Class335 local632 = Static357.method5233(local627.anInt3390);
				local634 = -1;
				for (@Pc(636) int local636 = 0; local636 < this.anInt758; local636++) {
					if (local627.anInt3394 == local127[local636]) {
						local634 = local636;
						break;
					}
				}
				if (local634 == -1) {
					throw new RuntimeException();
				}
				local682 = Static408.anIntArray407[arg1.aShortArray68[local627.anInt3394] & 0xFFFF] & 0xFFFFFF;
				@Pc(701) int local701 = local682 | 255 - (arg1.aByteArray55 == null ? 0 : arg1.aByteArray55[local627.anInt3394]) << 24;
				this.aClass391Array1[local618] = new Class391(local634, arg1.aShortArray67[local627.anInt3394], arg1.aShortArray71[local627.anInt3394], arg1.aShortArray64[local627.anInt3394], local632.anInt8745, local632.anInt8747, local632.anInt8737, local632.anInt8742, local632.anInt8743, local632.aBoolean577, local632.aBoolean578, local627.anInt3388);
				this.aClass360Array1[local618] = new Class360(local701);
			}
		}
		local618 = this.anInt758 * 3;
		this.aShort20 = (short) arg4;
		Static635.aLongArray19 = new long[local618];
		this.aShortArray18 = new short[local618];
		this.aShortArray12 = new short[local618];
		if (arg1.aShortArray70 != null) {
			this.aShortArray8 = new short[this.anInt758];
		}
		this.aByteArray13 = new byte[local618];
		this.aByteArray14 = new byte[this.anInt758];
		this.aShortArray13 = new short[this.anInt758];
		this.aShort17 = (short) arg3;
		this.aShortArray11 = new short[this.anInt758];
		this.aFloatArray3 = new float[local618];
		this.aShortArray9 = new short[this.anInt758];
		this.aFloatArray2 = new float[local618];
		this.aShortArray10 = new short[this.anInt758];
		this.aShortArray16 = new short[this.anInt758];
		this.aShortArray17 = new short[local618];
		this.aShortArray15 = new short[local618];
		local277 = 0;
		for (local492 = 0; local492 < arg1.anInt5124; local492++) {
			local634 = this.anIntArray56[local492];
			this.anIntArray56[local492] = local277;
			local590[local492] = new Class236();
			local277 += local634;
		}
		this.anIntArray56[arg1.anInt5124] = local277;
		@Pc(895) Class256 local895 = Static65.method1081(this.anInt758, arg1, local127);
		@Pc(899) Class227[] local899 = new Class227[arg1.anInt5115];
		@Pc(942) int local942;
		@Pc(952) int local952;
		@Pc(973) int local973;
		@Pc(983) int local983;
		@Pc(992) int local992;
		@Pc(1001) int local1001;
		@Pc(920) short local920;
		@Pc(931) int local931;
		for (local682 = 0; local682 < arg1.anInt5115; local682++) {
			@Pc(910) short local910 = arg1.aShortArray67[local682];
			@Pc(915) short local915 = arg1.aShortArray71[local682];
			local920 = arg1.aShortArray64[local682];
			local931 = this.anIntArray53[local915] - this.anIntArray53[local910];
			local942 = this.anIntArray57[local915] - this.anIntArray57[local910];
			local952 = this.anIntArray58[local915] - this.anIntArray58[local910];
			@Pc(963) int local963 = this.anIntArray53[local920] - this.anIntArray53[local910];
			local973 = this.anIntArray57[local920] - this.anIntArray57[local910];
			local983 = this.anIntArray58[local920] - this.anIntArray58[local910];
			local992 = local983 * local942 - local973 * local952;
			local1001 = local963 * local952 - local931 * local983;
			@Pc(1010) int local1010 = local973 * local931 - local942 * local963;
			while (local992 > 8192 || local1001 > 8192 || local1010 > 8192 || local992 < -8192 || local1001 < -8192 || local1010 < -8192) {
				local1010 >>= 0x1;
				local992 >>= 0x1;
				local1001 >>= 0x1;
			}
			@Pc(1066) int local1066 = (int) Math.sqrt((double) (local1010 * local1010 + local992 * local992 + local1001 * local1001));
			if (local1066 <= 0) {
				local1066 = 1;
			}
			local1001 = local1001 * 256 / local1066;
			local1010 = local1010 * 256 / local1066;
			local992 = local992 * 256 / local1066;
			@Pc(1102) byte local1102 = arg1.aByteArray50 == null ? 0 : arg1.aByteArray50[local682];
			if (local1102 == 0) {
				@Pc(1111) Class236 local1111 = local590[local910];
				local1111.anInt5872 += local1010;
				local1111.anInt5873 += local1001;
				local1111.anInt5876 += local992;
				local1111.anInt5875++;
				@Pc(1139) Class236 local1139 = local590[local915];
				local1139.anInt5875++;
				local1139.anInt5876 += local992;
				local1139.anInt5872 += local1010;
				local1139.anInt5873 += local1001;
				@Pc(1167) Class236 local1167 = local590[local920];
				local1167.anInt5876 += local992;
				local1167.anInt5873 += local1001;
				local1167.anInt5875++;
				local1167.anInt5872 += local1010;
			} else if (local1102 == 1) {
				@Pc(1206) Class227 local1206 = local899[local682] = new Class227();
				local1206.anInt5730 = local1010;
				local1206.anInt5724 = local992;
				local1206.anInt5725 = local1001;
			}
		}
		@Pc(1234) int local1234;
		@Pc(1278) short local1278;
		for (local290 = 0; local290 < this.anInt758; local290++) {
			local1234 = local127[local290];
			@Pc(1241) int local1241 = arg1.aShortArray68[local1234] & 0xFFFF;
			if (arg1.aByteArray53 == null) {
				local931 = -1;
			} else {
				local931 = arg1.aByteArray53[local1234];
			}
			if (arg1.aByteArray55 == null) {
				local942 = 0;
			} else {
				local942 = arg1.aByteArray55[local1234] & 0xFF;
			}
			local1278 = arg1.aShortArray66 == null ? -1 : arg1.aShortArray66[local1234];
			if (local1278 != -1 && (this.anInt764 & 0x40) != 0) {
				@Pc(1298) Class44 local1298 = local116.method7423(local1278 & 0xFFFF);
				if (local1298.aBoolean56) {
					local1278 = -1;
				}
			}
			@Pc(1305) float local1305 = 0.0F;
			@Pc(1307) float local1307 = 0.0F;
			@Pc(1309) float local1309 = 0.0F;
			@Pc(1311) float local1311 = 0.0F;
			@Pc(1313) float local1313 = 0.0F;
			@Pc(1315) float local1315 = 0.0F;
			@Pc(1317) byte local1317 = 0;
			@Pc(1319) byte local1319 = 0;
			@Pc(1321) int local1321 = 0;
			@Pc(1339) byte local1339;
			@Pc(1356) short local1356;
			@Pc(2180) short local2180;
			@Pc(2185) short local2185;
			if (local1278 != -1) {
				if (local931 == -1) {
					local1305 = 0.0F;
					local1319 = 2;
					local1309 = 1.0F;
					local1307 = 1.0F;
					local1317 = 1;
					local1315 = 0.0F;
					local1313 = 0.0F;
					local1311 = 1.0F;
				} else {
					local931 &= 0xFF;
					local1339 = arg1.aByteArray54[local931];
					@Pc(1346) short local1346;
					@Pc(1351) short local1351;
					@Pc(1389) float local1389;
					@Pc(1400) float local1400;
					@Pc(1494) float local1494;
					@Pc(1971) float local1971;
					@Pc(1979) float local1979;
					@Pc(1987) float local1987;
					@Pc(2010) float local2010;
					@Pc(2033) float local2033;
					@Pc(2056) float local2056;
					if (local1339 == 0) {
						local1346 = arg1.aShortArray67[local1234];
						local1351 = arg1.aShortArray71[local1234];
						local1356 = arg1.aShortArray64[local1234];
						local2180 = arg1.aShortArray63[local931];
						local2185 = arg1.aShortArray65[local931];
						@Pc(2190) short local2190 = arg1.aShortArray69[local931];
						@Pc(2196) float local2196 = (float) arg1.anIntArray307[local2180];
						@Pc(2202) float local2202 = (float) arg1.anIntArray299[local2180];
						local1389 = (float) arg1.anIntArray302[local2180];
						local1400 = (float) arg1.anIntArray307[local2185] - local2196;
						local1494 = (float) arg1.anIntArray299[local2185] - local2202;
						@Pc(2233) float local2233 = (float) arg1.anIntArray302[local2185] - local1389;
						@Pc(2242) float local2242 = (float) arg1.anIntArray307[local2190] - local2196;
						@Pc(2251) float local2251 = (float) arg1.anIntArray299[local2190] - local2202;
						@Pc(2259) float local2259 = (float) arg1.anIntArray302[local2190] - local1389;
						@Pc(2267) float local2267 = (float) arg1.anIntArray307[local1346] - local2196;
						@Pc(2276) float local2276 = (float) arg1.anIntArray299[local1346] - local2202;
						@Pc(2284) float local2284 = (float) arg1.anIntArray302[local1346] - local1389;
						@Pc(2293) float local2293 = (float) arg1.anIntArray307[local1351] - local2196;
						@Pc(2302) float local2302 = (float) arg1.anIntArray299[local1351] - local2202;
						local1971 = (float) arg1.anIntArray302[local1351] - local1389;
						local1979 = (float) arg1.anIntArray307[local1356] - local2196;
						local1987 = (float) arg1.anIntArray299[local1356] - local2202;
						local2010 = (float) arg1.anIntArray302[local1356] - local1389;
						local2033 = local1494 * local2259 - local2233 * local2251;
						local2056 = local2242 * local2233 - local1400 * local2259;
						@Pc(2362) float local2362 = local2251 * local1400 - local1494 * local2242;
						@Pc(2370) float local2370 = local2251 * local2362 - local2056 * local2259;
						@Pc(2379) float local2379 = local2259 * local2033 - local2242 * local2362;
						@Pc(2387) float local2387 = local2242 * local2056 - local2251 * local2033;
						@Pc(2401) float local2401 = 1.0F / (local2233 * local2387 + local1400 * local2370 + local2379 * local1494);
						local1309 = (local2302 * local2379 + local2370 * local2293 + local2387 * local1971) * local2401;
						local1313 = (local2010 * local2387 + local2379 * local1987 + local1979 * local2370) * local2401;
						local1305 = local2401 * (local2379 * local2276 + local2267 * local2370 + local2387 * local2284);
						@Pc(2451) float local2451 = local1400 * local2056 - local1494 * local2033;
						@Pc(2460) float local2460 = local2362 * local1494 - local2233 * local2056;
						@Pc(2469) float local2469 = local2233 * local2033 - local2362 * local1400;
						@Pc(2483) float local2483 = 1.0F / (local2460 * local2242 + local2469 * local2251 + local2259 * local2451);
						local1311 = local2483 * (local2302 * local2469 + local2293 * local2460 + local1971 * local2451);
						local1307 = local2483 * (local2284 * local2451 + local2469 * local2276 + local2460 * local2267);
						local1315 = (local1987 * local2469 + local1979 * local2460 + local2010 * local2451) * local2483;
					} else {
						local1346 = arg1.aShortArray67[local1234];
						local1351 = arg1.aShortArray71[local1234];
						local1356 = arg1.aShortArray64[local1234];
						@Pc(1361) int local1361 = local895.anIntArray388[local931];
						@Pc(1366) int local1366 = local895.anIntArray387[local931];
						@Pc(1371) int local1371 = local895.anIntArray386[local931];
						@Pc(1376) float[] local1376 = local895.aFloatArrayArray12[local931];
						@Pc(1381) byte local1381 = arg1.aByteArray52[local931];
						local1389 = (float) arg1.anIntArray300[local931] / 256.0F;
						if (local1339 == 1) {
							local1400 = (float) arg1.anIntArray297[local931] / 1024.0F;
							Static205.method3371(arg1.anIntArray307[local1346], local1381, local1361, arg1.anIntArray302[local1346], local1376, local1366, Static102.aFloatArray4, local1400, arg1.anIntArray299[local1346], local1389, local1371);
							local1305 = Static102.aFloatArray4[0];
							local1307 = Static102.aFloatArray4[1];
							Static205.method3371(arg1.anIntArray307[local1351], local1381, local1361, arg1.anIntArray302[local1351], local1376, local1366, Static102.aFloatArray4, local1400, arg1.anIntArray299[local1351], local1389, local1371);
							local1309 = Static102.aFloatArray4[0];
							local1311 = Static102.aFloatArray4[1];
							Static205.method3371(arg1.anIntArray307[local1356], local1381, local1361, arg1.anIntArray302[local1356], local1376, local1366, Static102.aFloatArray4, local1400, arg1.anIntArray299[local1356], local1389, local1371);
							local1313 = Static102.aFloatArray4[0];
							local1315 = Static102.aFloatArray4[1];
							local1494 = local1400 / 2.0F;
							if ((local1381 & 0x1) == 0) {
								if (local1494 < local1313 - local1305) {
									local1313 -= local1400;
									local1319 = 1;
								} else if (local1494 < local1305 - local1313) {
									local1313 += local1400;
									local1319 = 2;
								}
								if (local1309 - local1305 > local1494) {
									local1309 -= local1400;
									local1317 = 1;
								} else if (local1494 < local1305 - local1309) {
									local1317 = 2;
									local1309 += local1400;
								}
							} else {
								if (local1494 < local1311 - local1307) {
									local1311 -= local1400;
									local1317 = 1;
								} else if (local1307 - local1311 > local1494) {
									local1317 = 2;
									local1311 += local1400;
								}
								if (local1315 - local1307 > local1494) {
									local1315 -= local1400;
									local1319 = 1;
								} else if (local1494 < local1307 - local1315) {
									local1315 += local1400;
									local1319 = 2;
								}
							}
						} else if (local1339 == 2) {
							local1400 = (float) arg1.anIntArray298[local931] / 256.0F;
							local1494 = (float) arg1.anIntArray301[local931] / 256.0F;
							@Pc(1883) int local1883 = arg1.anIntArray307[local1351] - arg1.anIntArray307[local1346];
							@Pc(1894) int local1894 = arg1.anIntArray299[local1351] - arg1.anIntArray299[local1346];
							@Pc(1905) int local1905 = arg1.anIntArray302[local1351] - arg1.anIntArray302[local1346];
							@Pc(1915) int local1915 = arg1.anIntArray307[local1356] - arg1.anIntArray307[local1346];
							@Pc(1926) int local1926 = arg1.anIntArray299[local1356] - arg1.anIntArray299[local1346];
							@Pc(1937) int local1937 = arg1.anIntArray302[local1356] - arg1.anIntArray302[local1346];
							@Pc(1946) int local1946 = local1894 * local1937 - local1905 * local1926;
							@Pc(1955) int local1955 = local1915 * local1905 - local1937 * local1883;
							@Pc(1963) int local1963 = local1926 * local1883 - local1894 * local1915;
							local1971 = 64.0F / (float) arg1.anIntArray304[local931];
							local1979 = 64.0F / (float) arg1.anIntArray306[local931];
							local1987 = 64.0F / (float) arg1.anIntArray297[local931];
							local2010 = (local1376[1] * (float) local1955 + (float) local1946 * local1376[0] + (float) local1963 * local1376[2]) / local1971;
							local2033 = ((float) local1955 * local1376[4] + (float) local1946 * local1376[3] + local1376[5] * (float) local1963) / local1979;
							local2056 = (local1376[6] * (float) local1946 + (float) local1955 * local1376[7] + local1376[8] * (float) local1963) / local1987;
							local1321 = Static414.method6093(local2033, local2056, local2010);
							Static261.method4254(local1371, local1366, local1361, arg1.anIntArray302[local1346], arg1.anIntArray299[local1346], local1400, Static102.aFloatArray4, arg1.anIntArray307[local1346], local1389, local1376, local1381, local1321, local1494);
							local1305 = Static102.aFloatArray4[0];
							local1307 = Static102.aFloatArray4[1];
							Static261.method4254(local1371, local1366, local1361, arg1.anIntArray302[local1351], arg1.anIntArray299[local1351], local1400, Static102.aFloatArray4, arg1.anIntArray307[local1351], local1389, local1376, local1381, local1321, local1494);
							local1309 = Static102.aFloatArray4[0];
							local1311 = Static102.aFloatArray4[1];
							Static261.method4254(local1371, local1366, local1361, arg1.anIntArray302[local1356], arg1.anIntArray299[local1356], local1400, Static102.aFloatArray4, arg1.anIntArray307[local1356], local1389, local1376, local1381, local1321, local1494);
							local1315 = Static102.aFloatArray4[1];
							local1313 = Static102.aFloatArray4[0];
						} else if (local1339 == 3) {
							Static370.method5513(local1361, arg1.anIntArray299[local1346], local1389, arg1.anIntArray307[local1346], local1376, local1371, local1381, local1366, arg1.anIntArray302[local1346], Static102.aFloatArray4);
							local1305 = Static102.aFloatArray4[0];
							local1307 = Static102.aFloatArray4[1];
							Static370.method5513(local1361, arg1.anIntArray299[local1351], local1389, arg1.anIntArray307[local1351], local1376, local1371, local1381, local1366, arg1.anIntArray302[local1351], Static102.aFloatArray4);
							local1311 = Static102.aFloatArray4[1];
							local1309 = Static102.aFloatArray4[0];
							Static370.method5513(local1361, arg1.anIntArray299[local1356], local1389, arg1.anIntArray307[local1356], local1376, local1371, local1381, local1366, arg1.anIntArray302[local1356], Static102.aFloatArray4);
							local1315 = Static102.aFloatArray4[1];
							local1313 = Static102.aFloatArray4[0];
							if ((local1381 & 0x1) == 0) {
								if (local1309 - local1305 > 0.5F) {
									local1317 = 1;
									local1309--;
								} else if (local1305 - local1309 > 0.5F) {
									local1317 = 2;
									local1309++;
								}
								if (local1313 - local1305 > 0.5F) {
									local1319 = 1;
									local1313--;
								} else if (local1305 - local1313 > 0.5F) {
									local1319 = 2;
									local1313++;
								}
							} else {
								if (local1311 - local1307 > 0.5F) {
									local1317 = 1;
									local1311--;
								} else if (local1307 - local1311 > 0.5F) {
									local1317 = 2;
									local1311++;
								}
								if (local1315 - local1307 > 0.5F) {
									local1315--;
									local1319 = 1;
								} else if (local1307 - local1315 > 0.5F) {
									local1315++;
									local1319 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray50 == null) {
				local1339 = 0;
			} else {
				local1339 = arg1.aByteArray50[local1234];
			}
			if (local1339 == 0) {
				@Pc(2710) long local2710 = (long) (local931 << 2) + ((long) (local1321 << 24) + (long) (local1241 << 8) + (long) local942 << 32);
				local1356 = arg1.aShortArray67[local1234];
				local2180 = arg1.aShortArray71[local1234];
				local2185 = arg1.aShortArray64[local1234];
				@Pc(2729) Class236 local2729 = local590[local1356];
				this.aShortArray10[local290] = this.method842(local2729.anInt5876, local2729.anInt5873, local1356, local2729.anInt5872, local1307, local1305, local2729.anInt5875, arg1, local2710);
				@Pc(2753) Class236 local2753 = local590[local2180];
				this.aShortArray11[local290] = this.method842(local2753.anInt5876, local2753.anInt5873, local2180, local2753.anInt5872, local1311, local1309, local2753.anInt5875, arg1, (long) local1317 + local2710);
				@Pc(2780) Class236 local2780 = local590[local2185];
				this.aShortArray13[local290] = this.method842(local2780.anInt5876, local2780.anInt5873, local2185, local2780.anInt5872, local1315, local1313, local2780.anInt5875, arg1, local2710 + (long) local1319);
			} else if (local1339 == 1) {
				@Pc(2568) Class227 local2568 = local899[local1234];
				@Pc(2615) long local2615 = (long) ((local2568.anInt5724 > 0 ? 1024 : 2048) + (local931 << 2) + (local2568.anInt5725 + 256 << 12) + (local2568.anInt5730 + 256 << 22)) + ((long) (local1241 << 8) + (long) (local1321 << 24) + (long) local942 << 32);
				this.aShortArray10[local290] = this.method842(local2568.anInt5724, local2568.anInt5725, arg1.aShortArray67[local1234], local2568.anInt5730, local1307, local1305, 0, arg1, local2615);
				this.aShortArray11[local290] = this.method842(local2568.anInt5724, local2568.anInt5725, arg1.aShortArray71[local1234], local2568.anInt5730, local1311, local1309, 0, arg1, (long) local1317 + local2615);
				this.aShortArray13[local290] = this.method842(local2568.anInt5724, local2568.anInt5725, arg1.aShortArray64[local1234], local2568.anInt5730, local1315, local1313, 0, arg1, (long) local1319 + local2615);
			}
			if (arg1.aByteArray55 != null) {
				this.aByteArray14[local290] = arg1.aByteArray55[local1234];
			}
			if (arg1.aShortArray70 != null) {
				this.aShortArray8[local290] = arg1.aShortArray70[local1234];
			}
			this.aShortArray9[local290] = arg1.aShortArray68[local1234];
			this.aShortArray16[local290] = local1278;
		}
		local1234 = 0;
		local920 = -10000;
		for (local931 = 0; local931 < this.anInt740; local931++) {
			@Pc(2862) short local2862 = this.aShortArray16[local931];
			if (local2862 != local920) {
				local1234++;
				local920 = local2862;
			}
		}
		this.anIntArray54 = new int[local1234 + 1];
		local1234 = 0;
		local920 = -10000;
		for (local942 = 0; local942 < this.anInt740; local942++) {
			local1278 = this.aShortArray16[local942];
			if (local920 != local1278) {
				this.anIntArray54[local1234++] = local942;
				local920 = local1278;
			}
		}
		this.anIntArray54[local1234] = this.anInt740;
		Static635.aLongArray19 = null;
		this.aShortArray15 = Static359.method5238(this.anInt773, this.aShortArray15);
		this.aShortArray17 = Static359.method5238(this.anInt773, this.aShortArray17);
		this.aShortArray12 = Static359.method5238(this.anInt773, this.aShortArray12);
		this.aByteArray13 = Static6.method97(this.anInt773, this.aByteArray13);
		this.aFloatArray2 = Static444.method6363(this.aFloatArray2, this.anInt773);
		this.aFloatArray3 = Static444.method6363(this.aFloatArray3, this.anInt773);
		if (arg1.anIntArray305 != null && Static464.method6555(this.anInt764, arg2)) {
			this.anIntArrayArray8 = arg1.method4606(false, 0);
		}
		if (arg1.aClass129Array1 != null && Static56.method975(this.anInt764, arg2)) {
			this.anIntArrayArray7 = arg1.method4603();
		}
		if (arg1.anIntArray303 != null && Static311.method4810(0, arg2, this.anInt764)) {
			local952 = 0;
			@Pc(3037) int[] local3037 = new int[256];
			for (local973 = 0; local973 < this.anInt758; local973++) {
				local983 = arg1.anIntArray303[local127[local973]];
				if (local983 >= 0) {
					if (local952 < local983) {
						local952 = local983;
					}
					@Pc(3065) int local3065 = local3037[local983]++;
				}
			}
			this.anIntArrayArray6 = new int[local952 + 1][];
			for (local983 = 0; local983 <= local952; local983++) {
				this.anIntArrayArray6[local983] = new int[local3037[local983]];
				local3037[local983] = 0;
			}
			for (local992 = 0; local992 < this.anInt758; local992++) {
				local1001 = arg1.anIntArray303[local127[local992]];
				if (local1001 >= 0) {
					this.anIntArrayArray6[local1001][local3037[local1001]++] = local992;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class42.anIntArray51[arg0];
		@Pc(13) int local13 = Class42.anIntArray52[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt778; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray57[local15] + local13 * this.anIntArray53[local15] >> 14;
			this.anIntArray57[local15] = this.anIntArray57[local15] * local13 - local9 * this.anIntArray53[local15] >> 14;
			this.anIntArray53[local15] = local34;
		}
		if (this.aClass207_4 != null) {
			this.aClass207_4.anInterface17_4 = null;
		}
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!bp", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean54) {
			this.method844();
		}
		return this.aShort23;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BZ)V")
	private void method838(@OriginalArg(1) boolean arg0) {
		@Pc(19) boolean local19 = this.aClass207_1 != null && this.aClass207_1.anInterface17_4 == null;
		@Pc(33) boolean local33 = this.aClass207_3 != null && this.aClass207_3.anInterface17_4 == null;
		@Pc(47) boolean local47 = this.aClass207_4 != null && this.aClass207_4.anInterface17_4 == null;
		@Pc(61) boolean local61 = this.aClass207_2 != null && this.aClass207_2.anInterface17_4 == null;
		if (arg0) {
			local33 &= (this.aByte16 & 0x4) != 0;
			local61 &= (this.aByte16 & 0x8) != 0;
			local19 &= (this.aByte16 & 0x2) != 0;
			local47 &= (this.aByte16 & 0x1) != 0;
		}
		@Pc(124) byte local124 = 0;
		@Pc(128) byte local128 = 0;
		@Pc(130) byte local130 = 0;
		@Pc(132) byte local132 = 0;
		if (local47) {
			local124 = 12;
		}
		if (local19) {
			local128 = local124;
			local124 = (byte) (local124 + 4);
		}
		if (local33) {
			local130 = local124;
			local124 = (byte) (local124 + 12);
		}
		if (local61) {
			local132 = local124;
			local124 = (byte) (local124 + 8);
		}
		if (local124 == 0) {
			return;
		}
		if (this.aClass100_Sub3_6.aClass5_Sub36_Sub1_3.aByteArray89.length < this.anInt773 * local124) {
			this.aClass100_Sub3_6.aClass5_Sub36_Sub1_3 = new Class5_Sub36_Sub1((this.anInt773 + 100) * local124);
		} else {
			this.aClass100_Sub3_6.aClass5_Sub36_Sub1_3.anInt8456 = 0;
		}
		@Pc(216) Class5_Sub36_Sub1 local216 = this.aClass100_Sub3_6.aClass5_Sub36_Sub1_3;
		@Pc(226) int local226;
		@Pc(235) int local235;
		@Pc(263) int local263;
		@Pc(272) int local272;
		if (local47) {
			@Pc(242) int local242;
			@Pc(249) int local249;
			@Pc(254) int local254;
			@Pc(261) int local261;
			if (this.aClass100_Sub3_6.aBoolean735) {
				for (local226 = 0; local226 < this.anInt778; local226++) {
					local235 = Stream.floatToRawIntBits((float) this.anIntArray53[local226]);
					local242 = Stream.floatToRawIntBits((float) this.anIntArray57[local226]);
					local249 = Stream.floatToRawIntBits((float) this.anIntArray58[local226]);
					local254 = this.anIntArray56[local226];
					local261 = this.anIntArray56[local226 + 1];
					for (local263 = local254; local263 < local261; local263++) {
						local272 = this.aShortArray18[local263] - 1;
						if (local272 == -1) {
							break;
						}
						local216.anInt8456 = local124 * local272;
						local216.method7287(local235);
						local216.method7287(local242);
						local216.method7287(local249);
					}
				}
			} else {
				for (local226 = 0; local226 < this.anInt778; local226++) {
					local235 = Stream.floatToRawIntBits((float) this.anIntArray53[local226]);
					local242 = Stream.floatToRawIntBits((float) this.anIntArray57[local226]);
					local249 = Stream.floatToRawIntBits((float) this.anIntArray58[local226]);
					local254 = this.anIntArray56[local226];
					local261 = this.anIntArray56[local226 + 1];
					for (local263 = local254; local263 < local261; local263++) {
						local272 = this.aShortArray18[local263] - 1;
						if (local272 == -1) {
							break;
						}
						local216.anInt8456 = local272 * local124;
						local216.method7310(local235);
						local216.method7310(local242);
						local216.method7310(local249);
					}
				}
			}
		}
		@Pc(595) float local595;
		@Pc(502) short[] local502;
		@Pc(493) short[] local493;
		@Pc(496) short[] local496;
		@Pc(499) byte[] local499;
		@Pc(650) float local650;
		if (local19) {
			if (this.aClass207_3 == null) {
				if (this.aClass123_1 == null) {
					local493 = this.aShortArray15;
					local496 = this.aShortArray12;
					local499 = this.aByteArray13;
					local502 = this.aShortArray17;
				} else {
					local496 = this.aClass123_1.aShortArray39;
					local502 = this.aClass123_1.aShortArray38;
					local493 = this.aClass123_1.aShortArray40;
					local499 = this.aClass123_1.aByteArray31;
				}
				@Pc(526) float local526 = this.aClass100_Sub3_6.aFloatArray71[0];
				@Pc(532) float local532 = this.aClass100_Sub3_6.aFloatArray71[1];
				@Pc(538) float local538 = this.aClass100_Sub3_6.aFloatArray71[2];
				@Pc(542) float local542 = this.aClass100_Sub3_6.aFloat196;
				@Pc(552) float local552 = this.aClass100_Sub3_6.aFloat193 * 768.0F / (float) this.aShort20;
				@Pc(562) float local562 = this.aClass100_Sub3_6.aFloat203 * 768.0F / (float) this.aShort20;
				for (@Pc(564) int local564 = 0; local564 < this.anInt758; local564++) {
					@Pc(584) int local584 = this.method851(this.aByteArray14[local564], this.aShortArray16[local564], this.aShort17, this.aShortArray9[local564]);
					local595 = this.aClass100_Sub3_6.aFloat199 * (float) (local584 >> 16 & 0xFF);
					@Pc(606) float local606 = this.aClass100_Sub3_6.aFloat192 * (float) (local584 >> 8 & 0xFF);
					@Pc(611) short local611 = this.aShortArray10[local564];
					@Pc(620) float local620 = (float) (local584 >>> 24) * this.aClass100_Sub3_6.aFloat201;
					@Pc(625) short local625 = (short) local499[local611];
					if (local625 == 0) {
						local650 = (local532 * (float) local502[local611] + local526 * (float) local493[local611] + (float) local496[local611] * local538) * 0.0026041667F;
					} else {
						local650 = (local532 * (float) local502[local611] + (float) local493[local611] * local526 + (float) local496[local611] * local538) / (float) (local625 * 256);
					}
					@Pc(691) float local691 = local542 + local650 * (local650 < 0.0F ? local562 : local552);
					@Pc(696) int local696 = (int) (local620 * local691);
					if (local696 < 0) {
						local696 = 0;
					} else if (local696 > 255) {
						local696 = 255;
					}
					@Pc(717) int local717 = (int) (local595 * local691);
					if (local717 < 0) {
						local717 = 0;
					} else if (local717 > 255) {
						local717 = 255;
					}
					@Pc(738) int local738 = (int) (local606 * local691);
					if (local738 < 0) {
						local738 = 0;
					} else if (local738 > 255) {
						local738 = 255;
					}
					local216.anInt8456 = local128 + local611 * local124;
					local216.method7324(local696);
					local216.method7324(local717);
					local216.method7324(local738);
					local216.method7324(255 - (this.aByteArray14[local564] & 0xFF));
					local611 = this.aShortArray11[local564];
					local625 = (short) local499[local611];
					if (local625 == 0) {
						local650 = (local526 * (float) local493[local611] + local532 * (float) local502[local611] + (float) local496[local611] * local538) * 0.0026041667F;
					} else {
						local650 = ((float) local496[local611] * local538 + (float) local493[local611] * local526 + local532 * (float) local502[local611]) / (float) (local625 * 256);
					}
					local691 = (local650 < 0.0F ? local562 : local552) * local650 + local542;
					local696 = (int) (local620 * local691);
					local717 = (int) (local595 * local691);
					if (local696 < 0) {
						local696 = 0;
					} else if (local696 > 255) {
						local696 = 255;
					}
					if (local717 < 0) {
						local717 = 0;
					} else if (local717 > 255) {
						local717 = 255;
					}
					local738 = (int) (local691 * local606);
					if (local738 < 0) {
						local738 = 0;
					} else if (local738 > 255) {
						local738 = 255;
					}
					local216.anInt8456 = local124 * local611 + local128;
					local216.method7324(local696);
					local216.method7324(local717);
					local216.method7324(local738);
					local216.method7324(255 - (this.aByteArray14[local564] & 0xFF));
					local611 = this.aShortArray13[local564];
					local625 = (short) local499[local611];
					if (local625 == 0) {
						local650 = ((float) local496[local611] * local538 + local526 * (float) local493[local611] + local532 * (float) local502[local611]) * 0.0026041667F;
					} else {
						local650 = ((float) local493[local611] * local526 + local532 * (float) local502[local611] + local538 * (float) local496[local611]) / (float) (local625 * 256);
					}
					local691 = local542 + (local650 < 0.0F ? local562 : local552) * local650;
					local696 = (int) (local691 * local620);
					if (local696 < 0) {
						local696 = 0;
					} else if (local696 > 255) {
						local696 = 255;
					}
					local717 = (int) (local691 * local595);
					local738 = (int) (local606 * local691);
					if (local717 < 0) {
						local717 = 0;
					} else if (local717 > 255) {
						local717 = 255;
					}
					local216.anInt8456 = local128 + local124 * local611;
					if (local738 < 0) {
						local738 = 0;
					} else if (local738 > 255) {
						local738 = 255;
					}
					local216.method7324(local696);
					local216.method7324(local717);
					local216.method7324(local738);
					local216.method7324(255 - (this.aByteArray14[local564] & 0xFF));
				}
			} else {
				for (local226 = 0; local226 < this.anInt758; local226++) {
					local235 = this.method851(this.aByteArray14[local226], this.aShortArray16[local226], this.aShort17, this.aShortArray9[local226]);
					local216.anInt8456 = local124 * this.aShortArray10[local226] + local128;
					local216.method7287(local235);
					local216.anInt8456 = local124 * this.aShortArray11[local226] + local128;
					local216.method7287(local235);
					local216.anInt8456 = local128 + local124 * this.aShortArray13[local226];
					local216.method7287(local235);
				}
			}
		}
		if (local33) {
			if (this.aClass123_1 == null) {
				local496 = this.aShortArray12;
				local493 = this.aShortArray15;
				local502 = this.aShortArray17;
				local499 = this.aByteArray13;
			} else {
				local493 = this.aClass123_1.aShortArray40;
				local496 = this.aClass123_1.aShortArray39;
				local499 = this.aClass123_1.aByteArray31;
				local502 = this.aClass123_1.aShortArray38;
			}
			@Pc(1190) float local1190 = 3.0F / (float) this.aShort20;
			local650 = 3.0F / (float) (this.aShort20 + this.aShort20 / 2);
			local216.anInt8456 = local130;
			if (this.aClass100_Sub3_6.aBoolean735) {
				for (local263 = 0; local263 < this.anInt773; local263++) {
					local272 = local499[local263] & 0xFF;
					if (local272 == 0) {
						local216.method5494((float) local493[local263] * local650);
						local216.method5494(local650 * (float) local502[local263]);
						local216.method5494((float) local496[local263] * local650);
					} else {
						local595 = local1190 / (float) local272;
						local216.method5494(local595 * (float) local493[local263]);
						local216.method5494(local595 * (float) local502[local263]);
						local216.method5494(local595 * (float) local496[local263]);
					}
					local216.anInt8456 += local124 - 12;
				}
			} else {
				for (local263 = 0; local263 < this.anInt773; local263++) {
					local272 = local499[local263] & 0xFF;
					if (local272 == 0) {
						local216.method5496((float) local493[local263] * local650);
						local216.method5496(local650 * (float) local502[local263]);
						local216.method5496((float) local496[local263] * local650);
					} else {
						local595 = local1190 / (float) local272;
						local216.method5496(local595 * (float) local493[local263]);
						local216.method5496((float) local502[local263] * local595);
						local216.method5496(local595 * (float) local496[local263]);
					}
					local216.anInt8456 += local124 - 12;
				}
			}
		}
		if (local61) {
			local216.anInt8456 = local132;
			if (this.aClass100_Sub3_6.aBoolean735) {
				for (local226 = 0; local226 < this.anInt773; local226++) {
					local216.method5494(this.aFloatArray2[local226]);
					local216.method5494(this.aFloatArray3[local226]);
					local216.anInt8456 += local124 - 8;
				}
			} else {
				for (local226 = 0; local226 < this.anInt773; local226++) {
					local216.method5496(this.aFloatArray2[local226]);
					local216.method5496(this.aFloatArray3[local226]);
					local216.anInt8456 += local124 - 8;
				}
			}
		}
		local216.anInt8456 = local124 * this.anInt773;
		@Pc(1539) Interface17 local1539;
		if (arg0) {
			if (this.anInterface17_1 == null) {
				this.anInterface17_1 = this.aClass100_Sub3_6.method8734(local216.anInt8456, local216.aByteArray89, local124, true);
			} else {
				this.anInterface17_1.method8313(local216.anInt8456, local216.aByteArray89, local124);
			}
			this.aByte16 = 0;
			local1539 = this.anInterface17_1;
		} else {
			local1539 = this.aClass100_Sub3_6.method8734(local216.anInt8456, local216.aByteArray89, local124, false);
			this.aBoolean52 = true;
		}
		if (local47) {
			this.aClass207_4.aByte78 = 0;
			this.aClass207_4.anInterface17_4 = local1539;
		}
		if (local61) {
			this.aClass207_2.aByte78 = local132;
			this.aClass207_2.anInterface17_4 = local1539;
		}
		if (local19) {
			this.aClass207_1.anInterface17_4 = local1539;
			this.aClass207_1.aByte78 = local128;
		}
		if (local33) {
			this.aClass207_3.anInterface17_4 = local1539;
			this.aClass207_3.aByte78 = local130;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!sj;Lclient!rp;II)V")
	@Override
	public void method8846(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt773 == 0) {
			return;
		}
		@Pc(17) Class10_Sub3 local17 = this.aClass100_Sub3_6.aClass10_Sub3_3;
		if (!this.aBoolean54) {
			this.method844();
		}
		@Pc(28) Class10_Sub3 local28 = (Class10_Sub3) arg0;
		Static235.aFloat115 = local17.aFloat104 * local28.aFloat110 + local17.aFloat110 * local28.aFloat109 + local28.aFloat106 * local17.aFloat100;
		Static442.aFloat139 = local17.aFloat105 + local17.aFloat104 * local28.aFloat105 + local17.aFloat110 * local28.aFloat101 + local17.aFloat100 * local28.aFloat102;
		@Pc(75) float local75 = Static442.aFloat139 + Static235.aFloat115 * (float) this.aShort25;
		@Pc(83) float local83 = Static235.aFloat115 * (float) this.aShort22 + Static442.aFloat139;
		@Pc(93) float local93;
		@Pc(99) float local99;
		if (local83 < local75) {
			local99 = (float) this.aShort18 + local75;
			local93 = local83 - (float) this.aShort18;
		} else {
			local93 = local75 - (float) this.aShort18;
			local99 = (float) this.aShort18 + local83;
		}
		if (local93 >= this.aClass100_Sub3_6.aFloat198 || local99 <= (float) this.aClass100_Sub3_6.anInt10291) {
			return;
		}
		Static127.aFloat61 = local28.aFloat109 * local17.aFloat106 + local28.aFloat106 * local17.aFloat108 + local17.aFloat103 * local28.aFloat110;
		Static3.aFloat1 = local17.aFloat108 * local28.aFloat102 + local28.aFloat101 * local17.aFloat106 + local28.aFloat105 * local17.aFloat103 + local17.aFloat102;
		@Pc(177) float local177 = Static3.aFloat1 + (float) this.aShort25 * Static127.aFloat61;
		@Pc(185) float local185 = Static127.aFloat61 * (float) this.aShort22 + Static3.aFloat1;
		@Pc(211) float local211;
		@Pc(200) float local200;
		if (local177 > local185) {
			local211 = ((float) -this.aShort18 + local185) * (float) this.aClass100_Sub3_6.anInt10296;
			local200 = ((float) this.aShort18 + local177) * (float) this.aClass100_Sub3_6.anInt10296;
		} else {
			local200 = ((float) this.aShort18 + local185) * (float) this.aClass100_Sub3_6.anInt10296;
			local211 = (float) this.aClass100_Sub3_6.anInt10296 * (local177 - (float) this.aShort18);
		}
		if (this.aClass100_Sub3_6.aFloat190 <= local211 / (float) arg2 || local200 / (float) arg2 <= this.aClass100_Sub3_6.aFloat202) {
			return;
		}
		Static159.aFloat112 = local17.aFloat101 + local28.aFloat105 * local17.aFloat107 + local28.aFloat101 * local17.aFloat109 + local17.aFloat99 * local28.aFloat102;
		Static56.aFloat33 = local28.aFloat110 * local17.aFloat107 + local17.aFloat109 * local28.aFloat109 + local17.aFloat99 * local28.aFloat106;
		@Pc(305) float local305 = Static159.aFloat112 + Static56.aFloat33 * (float) this.aShort25;
		@Pc(313) float local313 = Static159.aFloat112 + Static56.aFloat33 * (float) this.aShort22;
		@Pc(340) float local340;
		@Pc(328) float local328;
		if (local313 < local305) {
			local328 = ((float) this.aShort18 + local305) * (float) this.aClass100_Sub3_6.anInt10273;
			local340 = (float) this.aClass100_Sub3_6.anInt10273 * ((float) -this.aShort18 + local313);
		} else {
			local340 = (float) this.aClass100_Sub3_6.anInt10273 * (local305 - (float) this.aShort18);
			local328 = (float) this.aClass100_Sub3_6.anInt10273 * ((float) this.aShort18 + local313);
		}
		if (local340 / (float) arg2 >= this.aClass100_Sub3_6.aFloat200 || this.aClass100_Sub3_6.aFloat207 >= local328 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass391Array1 != null) {
			Static40.aFloat25 = local28.aFloat103 * local17.aFloat99 + local17.aFloat109 * local28.aFloat107 + local17.aFloat107 * local28.aFloat104;
			Static159.aFloat111 = local28.aFloat108 * local17.aFloat100 + local28.aFloat99 * local17.aFloat110 + local17.aFloat104 * local28.aFloat100;
			Static23.aFloat15 = local28.aFloat107 * local17.aFloat110 + local28.aFloat103 * local17.aFloat100 + local17.aFloat104 * local28.aFloat104;
			Static389.aFloat58 = local28.aFloat104 * local17.aFloat103 + local28.aFloat107 * local17.aFloat106 + local17.aFloat108 * local28.aFloat103;
			Static236.aFloat116 = local28.aFloat99 * local17.aFloat109 + local28.aFloat108 * local17.aFloat99 + local28.aFloat100 * local17.aFloat107;
			Static627.aFloat189 = local17.aFloat108 * local28.aFloat108 + local28.aFloat99 * local17.aFloat106 + local28.aFloat100 * local17.aFloat103;
		}
		if (arg1 != null) {
			@Pc(513) int local513 = this.aShort19 + this.aShort23 >> 1;
			@Pc(521) int local521 = this.aShort24 + this.aShort16 >> 1;
			@Pc(540) int local540 = (int) (Static127.aFloat61 * (float) this.aShort25 + Static3.aFloat1 + (float) local513 * Static627.aFloat189 + (float) local521 * Static389.aFloat58);
			@Pc(559) int local559 = (int) ((float) local513 * Static236.aFloat116 + Static159.aFloat112 + (float) this.aShort25 * Static56.aFloat33 + (float) local521 * Static40.aFloat25);
			@Pc(578) int local578 = (int) ((float) local513 * Static159.aFloat111 + Static442.aFloat139 + Static235.aFloat115 * (float) this.aShort25 + (float) local521 * Static23.aFloat15);
			@Pc(597) int local597 = (int) ((float) local521 * Static389.aFloat58 + Static3.aFloat1 + Static627.aFloat189 * (float) local513 + (float) this.aShort22 * Static127.aFloat61);
			@Pc(616) int local616 = (int) (Static40.aFloat25 * (float) local521 + (float) this.aShort22 * Static56.aFloat33 + Static159.aFloat112 + (float) local513 * Static236.aFloat116);
			@Pc(635) int local635 = (int) (Static23.aFloat15 * (float) local521 + (float) this.aShort22 * Static235.aFloat115 + Static442.aFloat139 + Static159.aFloat111 * (float) local513);
			arg1.anInt8406 = this.aClass100_Sub3_6.anInt10295 + local597 * this.aClass100_Sub3_6.anInt10296 / arg2;
			arg1.anInt8408 = this.aClass100_Sub3_6.anInt10295 + local540 * this.aClass100_Sub3_6.anInt10296 / arg2;
			arg1.anInt8405 = this.aClass100_Sub3_6.anInt10277 + this.aClass100_Sub3_6.anInt10273 * local559 / arg2;
			arg1.anInt8404 = this.aClass100_Sub3_6.anInt10277 + local616 * this.aClass100_Sub3_6.anInt10273 / arg2;
			if (local578 >= this.aClass100_Sub3_6.anInt10291 || this.aClass100_Sub3_6.anInt10291 <= local635) {
				arg1.anInt8407 = (local540 + this.aShort18) * this.aClass100_Sub3_6.anInt10296 / arg2 + this.aClass100_Sub3_6.anInt10295 - arg1.anInt8408;
				arg1.aBoolean558 = true;
			}
		}
		this.aClass100_Sub3_6.method8703((float) arg2);
		this.aClass100_Sub3_6.method8733();
		this.aClass100_Sub3_6.method8747(local28);
		this.method852();
		this.aClass100_Sub3_6.method8683();
		this.method847();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!sj;IZ)V")
	@Override
	public void method8856(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray14 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt778; local15++) {
			if ((this.aShortArray14[local15] & arg1) != 0) {
				if (arg2) {
					arg0.method4223(this.anIntArray53[local15], this.anIntArray57[local15], this.anIntArray58[local15], local13);
				} else {
					arg0.method4216(this.anIntArray53[local15], this.anIntArray57[local15], this.anIntArray58[local15], local13);
				}
				this.anIntArray53[local15] = local13[0];
				this.anIntArray57[local15] = local13[1];
				this.anIntArray58[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt796 = arg0;
		this.aBoolean52 = true;
		if (this.aClass123_1 != null && (this.anInt796 & 0x10000) == 0) {
			this.aShortArray15 = this.aClass123_1.aShortArray40;
			this.aShortArray12 = this.aClass123_1.aShortArray39;
			this.aByteArray13 = this.aClass123_1.aByteArray31;
			this.aShortArray17 = this.aClass123_1.aShortArray38;
			this.aClass123_1 = null;
		}
		this.method840();
	}

	@OriginalMember(owner = "client!bp", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		if (this.aClass207_1 != null) {
			this.aClass207_1.anInterface17_4 = null;
		}
		this.aShort20 = (short) arg0;
		if (this.aClass207_3 != null) {
			this.aClass207_3.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean54) {
			this.method844();
		}
		return this.aShort21;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLclient!or;)V")
	private void method839(@OriginalArg(1) Class5_Sub1_Sub15_Sub1 arg0) {
		if (this.aClass100_Sub3_6.anIntArray581.length < this.anInt773) {
			this.aClass100_Sub3_6.anIntArray581 = new int[this.anInt773];
			this.aClass100_Sub3_6.anIntArray583 = new int[this.anInt773];
		}
		@Pc(34) int[] local34 = this.aClass100_Sub3_6.anIntArray581;
		@Pc(38) int[] local38 = this.aClass100_Sub3_6.anIntArray583;
		@Pc(67) int local67;
		@Pc(105) int local105;
		@Pc(114) int local114;
		for (@Pc(40) int local40 = 0; local40 < this.anInt778; local40++) {
			local67 = (this.anIntArray53[local40] - (this.anIntArray57[local40] * this.aClass100_Sub3_6.anInt10287 >> 8) >> this.aClass100_Sub3_6.anInt10256) - arg0.anInt7199;
			@Pc(91) int local91 = (this.anIntArray58[local40] - (this.aClass100_Sub3_6.anInt10290 * this.anIntArray57[local40] >> 8) >> this.aClass100_Sub3_6.anInt10256) - arg0.anInt7193;
			@Pc(96) int local96 = this.anIntArray56[local40];
			@Pc(103) int local103 = this.anIntArray56[local40 + 1];
			for (local105 = local96; local105 < local103; local105++) {
				local114 = this.aShortArray18[local105] - 1;
				if (local114 == -1) {
					break;
				}
				local34[local114] = local67;
				local38[local114] = local91;
			}
		}
		for (local67 = 0; local67 < this.anInt740; local67++) {
			if (this.aByteArray14 == null || this.aByteArray14[local67] <= 128) {
				@Pc(171) short local171 = this.aShortArray10[local67];
				@Pc(176) short local176 = this.aShortArray11[local67];
				@Pc(181) short local181 = this.aShortArray13[local67];
				local105 = local34[local171];
				local114 = local34[local176];
				@Pc(193) int local193 = local34[local181];
				@Pc(197) int local197 = local38[local171];
				@Pc(201) int local201 = local38[local176];
				@Pc(205) int local205 = local38[local181];
				if ((local201 - local205) * (local105 - local114) - (local201 - local197) * (local193 - local114) > 0) {
					arg0.method6263(local114, local105, local193, local197, local205, local201);
				}
			}
		}
		if (-80 != -80) {
			this.anInt778 = -53;
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	private void method840() {
		if (!this.aBoolean52) {
			return;
		}
		this.aBoolean52 = false;
		if (this.aClass363Array1 == null && this.aClass270Array1 == null && this.aClass391Array1 == null && !Static389.method1742(this.anInt764, this.anInt796)) {
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			@Pc(43) boolean local43 = false;
			if (this.anIntArray53 != null && !Static620.method7044(this.anInt764, this.anInt796)) {
				if (this.aClass207_4 != null && this.aClass207_4.anInterface17_4 == null) {
					this.aBoolean52 = true;
				} else {
					if (!this.aBoolean54) {
						this.method844();
					}
					local39 = true;
				}
			}
			if (this.anIntArray57 != null && !Static65.method1082(this.anInt764, this.anInt796)) {
				if (this.aClass207_4 != null && this.aClass207_4.anInterface17_4 == null) {
					this.aBoolean52 = true;
				} else {
					if (!this.aBoolean54) {
						this.method844();
					}
					local41 = true;
				}
			}
			if (this.anIntArray58 != null && !Static406.method1389(this.anInt796, this.anInt764)) {
				if (this.aClass207_4 != null && this.aClass207_4.anInterface17_4 == null) {
					this.aBoolean52 = true;
				} else {
					local43 = true;
					if (!this.aBoolean54) {
						this.method844();
					}
				}
			}
			if (local41) {
				this.anIntArray57 = null;
			}
			if (local39) {
				this.anIntArray53 = null;
			}
			if (local43) {
				this.anIntArray58 = null;
			}
		}
		if (this.aShortArray18 != null && this.anIntArray53 == null && this.anIntArray57 == null && this.anIntArray58 == null) {
			this.aShortArray18 = null;
			this.anIntArray56 = null;
		}
		if (this.aByteArray13 != null && !Static369.method5503(this.anInt796, this.anInt764)) {
			if (this.aClass207_3 == null) {
				if (this.aClass207_1 != null && this.aClass207_1.anInterface17_4 == null) {
					this.aBoolean52 = true;
				} else {
					this.aByteArray13 = null;
					this.aShortArray15 = this.aShortArray17 = this.aShortArray12 = null;
				}
			} else if (this.aClass207_3.anInterface17_4 == null) {
				this.aBoolean52 = true;
			} else {
				this.aShortArray15 = this.aShortArray17 = this.aShortArray12 = null;
				this.aByteArray13 = null;
			}
		}
		if (this.aShortArray9 != null && !Static249.method3983(this.anInt796, this.anInt764)) {
			if (this.aClass207_1 != null && this.aClass207_1.anInterface17_4 == null) {
				this.aBoolean52 = true;
			} else {
				this.aShortArray9 = null;
			}
		}
		if (this.aByteArray14 != null && !Static619.method8483(this.anInt796, this.anInt764)) {
			if (this.aClass207_1 != null && this.aClass207_1.anInterface17_4 == null) {
				this.aBoolean52 = true;
			} else {
				this.aByteArray14 = null;
			}
		}
		if (this.aFloatArray2 != null && !Static407.method5954(this.anInt764, this.anInt796)) {
			if (this.aClass207_2 != null && this.aClass207_2.anInterface17_4 == null) {
				this.aBoolean52 = true;
			} else {
				this.aFloatArray2 = this.aFloatArray3 = null;
			}
		}
		if (this.aShortArray16 != null && !Static280.method4500(this.anInt764, this.anInt796)) {
			if (this.aClass207_1 != null && this.aClass207_1.anInterface17_4 == null) {
				this.aBoolean52 = true;
			} else {
				this.aShortArray16 = null;
			}
		}
		if (this.aShortArray10 != null && !Static449.method6385(this.anInt764, this.anInt796)) {
			if ((this.aClass190_1 == null || this.aClass190_1.anInterface6_2 != null) && (this.aClass207_1 == null || this.aClass207_1.anInterface17_4 != null)) {
				this.aShortArray10 = this.aShortArray11 = this.aShortArray13 = null;
			} else {
				this.aBoolean52 = true;
			}
		}
		if (this.anIntArrayArray6 != null && !Static311.method4810(-884909049 ^ 0xCB415C07, this.anInt796, this.anInt764)) {
			this.anIntArrayArray6 = null;
			this.aShortArray8 = null;
		}
		if (this.anIntArrayArray8 != null && !Static464.method6555(this.anInt764, this.anInt796)) {
			this.anIntArrayArray8 = null;
			this.aShortArray14 = null;
		}
		if (this.anIntArrayArray7 != null && !Static56.method975(this.anInt764, this.anInt796)) {
			this.anIntArrayArray7 = null;
		}
		if (this.anIntArray54 != null && (this.anInt796 & 0x800) == 0 && (this.anInt796 & 0x40000) == 0) {
			this.anIntArray54 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!sj;)V")
	@Override
	public void method8847(@OriginalArg(0) Class10 arg0) {
		@Pc(8) Class10_Sub3 local8 = (Class10_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass363Array1 != null) {
			for (local13 = 0; local13 < this.aClass363Array1.length; local13++) {
				@Pc(20) Class363 local20 = this.aClass363Array1[local13];
				@Pc(22) Class363 local22 = local20;
				if (local20.aClass363_2 != null) {
					local22 = local20.aClass363_2;
				}
				local22.anInt9755 = (int) (local8.aFloat102 + (float) this.anIntArray53[local20.anInt9749] * local8.aFloat108 + local8.aFloat106 * (float) this.anIntArray57[local20.anInt9749] + (float) this.anIntArray58[local20.anInt9749] * local8.aFloat103);
				local22.anInt9751 = (int) (local8.aFloat101 + local8.aFloat107 * (float) this.anIntArray58[local20.anInt9749] + (float) this.anIntArray53[local20.anInt9749] * local8.aFloat99 + local8.aFloat109 * (float) this.anIntArray57[local20.anInt9749]);
				local22.anInt9758 = (int) (local8.aFloat100 * (float) this.anIntArray53[local20.anInt9749] + (float) this.anIntArray57[local20.anInt9749] * local8.aFloat110 + (float) this.anIntArray58[local20.anInt9749] * local8.aFloat104 + local8.aFloat105);
				local22.anInt9762 = (int) ((float) this.anIntArray53[local20.anInt9754] * local8.aFloat108 + (float) this.anIntArray57[local20.anInt9754] * local8.aFloat106 + (float) this.anIntArray58[local20.anInt9754] * local8.aFloat103 + local8.aFloat102);
				local22.anInt9760 = (int) (local8.aFloat107 * (float) this.anIntArray58[local20.anInt9754] + local8.aFloat99 * (float) this.anIntArray53[local20.anInt9754] + (float) this.anIntArray57[local20.anInt9754] * local8.aFloat109 + local8.aFloat101);
				local22.anInt9748 = (int) (local8.aFloat110 * (float) this.anIntArray57[local20.anInt9754] + (float) this.anIntArray53[local20.anInt9754] * local8.aFloat100 + local8.aFloat104 * (float) this.anIntArray58[local20.anInt9754] + local8.aFloat105);
				local22.anInt9750 = (int) (local8.aFloat102 + (float) this.anIntArray58[local20.anInt9753] * local8.aFloat103 + local8.aFloat108 * (float) this.anIntArray53[local20.anInt9753] + local8.aFloat106 * (float) this.anIntArray57[local20.anInt9753]);
				local22.anInt9761 = (int) (local8.aFloat101 + (float) this.anIntArray57[local20.anInt9753] * local8.aFloat109 + (float) this.anIntArray53[local20.anInt9753] * local8.aFloat99 + (float) this.anIntArray58[local20.anInt9753] * local8.aFloat107);
				local22.anInt9759 = (int) (local8.aFloat105 + (float) this.anIntArray58[local20.anInt9753] * local8.aFloat104 + (float) this.anIntArray53[local20.anInt9753] * local8.aFloat100 + local8.aFloat110 * (float) this.anIntArray57[local20.anInt9753]);
			}
		}
		if (this.aClass270Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass270Array1.length; local13++) {
			@Pc(363) Class270 local363 = this.aClass270Array1[local13];
			@Pc(365) Class270 local365 = local363;
			if (local363.aClass270_2 != null) {
				local365 = local363.aClass270_2;
			}
			if (local363.aClass10_7 == null) {
				local363.aClass10_7 = local8.method4222();
			} else {
				local363.aClass10_7.method4212(local8);
			}
			local365.anInt7124 = (int) (local8.aFloat102 + (float) this.anIntArray58[local363.anInt7122] * local8.aFloat103 + local8.aFloat106 * (float) this.anIntArray57[local363.anInt7122] + (float) this.anIntArray53[local363.anInt7122] * local8.aFloat108);
			local365.anInt7120 = (int) (local8.aFloat101 + (float) this.anIntArray58[local363.anInt7122] * local8.aFloat107 + (float) this.anIntArray57[local363.anInt7122] * local8.aFloat109 + local8.aFloat99 * (float) this.anIntArray53[local363.anInt7122]);
			local365.anInt7119 = (int) ((float) this.anIntArray57[local363.anInt7122] * local8.aFloat110 + (float) this.anIntArray53[local363.anInt7122] * local8.aFloat100 + (float) this.anIntArray58[local363.anInt7122] * local8.aFloat104 + local8.aFloat105);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIFFIILclient!kc;J)S")
	private short method842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class197 arg7, @OriginalArg(9) long arg8) {
		@Pc(10) int local10 = this.anIntArray56[arg2];
		@Pc(17) int local17 = this.anIntArray56[arg2 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(30) short local30 = this.aShortArray18[local21];
			if (local30 == 0) {
				local19 = local21;
				break;
			}
			if (Static635.aLongArray19[local21] == arg8) {
				return (short) (local30 - 1);
			}
		}
		this.aShortArray18[local19] = (short) (this.anInt773 + 1);
		Static635.aLongArray19[local19] = arg8;
		this.aShortArray15[this.anInt773] = (short) arg0;
		if (7 != 7) {
			this.method8846((Class10) null, (Class4_Sub8) null, 17, 54);
		}
		this.aShortArray17[this.anInt773] = (short) arg1;
		this.aShortArray12[this.anInt773] = (short) arg3;
		this.aByteArray13[this.anInt773] = (byte) arg6;
		this.aFloatArray2[this.anInt773] = arg5;
		this.aFloatArray3[this.anInt773] = arg4;
		return (short) this.anInt773++;
	}

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "()V")
	@Override
	protected void method8850() {
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZB)V")
	private void method843(@OriginalArg(0) boolean arg0) {
		if (this.aClass100_Sub3_6.aClass5_Sub36_Sub1_3.aByteArray89.length < this.anInt740 * 6) {
			this.aClass100_Sub3_6.aClass5_Sub36_Sub1_3 = new Class5_Sub36_Sub1((this.anInt740 + 100) * 6);
		} else {
			this.aClass100_Sub3_6.aClass5_Sub36_Sub1_3.anInt8456 = 0;
		}
		@Pc(42) Class5_Sub36_Sub1 local42 = this.aClass100_Sub3_6.aClass5_Sub36_Sub1_3;
		@Pc(53) int local53;
		if (this.aClass100_Sub3_6.aBoolean735) {
			for (local53 = 0; local53 < this.anInt740; local53++) {
				local42.method7296(this.aShortArray10[local53]);
				local42.method7296(this.aShortArray11[local53]);
				local42.method7296(this.aShortArray13[local53]);
			}
		} else {
			for (local53 = 0; local53 < this.anInt740; local53++) {
				local42.method7279(this.aShortArray10[local53]);
				local42.method7279(this.aShortArray11[local53]);
				local42.method7279(this.aShortArray13[local53]);
			}
		}
		if (local42.anInt8456 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface6_1 == null) {
				this.anInterface6_1 = this.aClass100_Sub3_6.method8711(true, local42.anInt8456, local42.aByteArray89);
			} else {
				this.anInterface6_1.method7654(local42.anInt8456, local42.aByteArray89);
			}
			this.aClass190_1.anInterface6_2 = this.anInterface6_1;
		} else {
			this.aClass190_1.anInterface6_2 = this.aClass100_Sub3_6.method8711(false, local42.anInt8456, local42.aByteArray89);
		}
		if (!arg0) {
			this.aBoolean52 = true;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	private void method844() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt778; local31++) {
			@Pc(40) int local40 = this.anIntArray53[local31];
			@Pc(45) int local45 = this.anIntArray57[local31];
			@Pc(50) int local50 = this.anIntArray58[local31];
			if (local13 < local40) {
				local13 = local40;
			}
			if (local45 < local9) {
				local9 = local45;
			}
			if (local7 > local40) {
				local7 = local40;
			}
			if (local15 < local45) {
				local15 = local45;
			}
			if (local11 > local50) {
				local11 = local50;
			}
			if (local17 < local50) {
				local17 = local50;
			}
			@Pc(96) int local96 = local40 * local40 + local50 * local50;
			if (local96 > local19) {
				local19 = local96;
			}
			local96 = local45 * local45 + local40 * local40 + local50 * local50;
			if (local96 > local21) {
				local21 = local96;
			}
		}
		this.aShort23 = (short) local7;
		this.aShort24 = (short) local17;
		this.aShort25 = (short) local9;
		this.aShort16 = (short) local11;
		this.aShort22 = (short) local15;
		this.aShort19 = (short) local13;
		this.aShort18 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort21 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean54 = true;
	}

	@OriginalMember(owner = "client!bp", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort20;
	}

	@OriginalMember(owner = "client!bp", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean54) {
			this.method844();
		}
		return this.aShort24;
	}

	@OriginalMember(owner = "client!bp", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt778; local7++) {
			if (arg0 != 128) {
				this.anIntArray53[local7] = arg0 * this.anIntArray53[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray57[local7] = arg1 * this.anIntArray57[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray58[local7] = arg2 * this.anIntArray58[local7] >> 7;
			}
		}
		if (this.aClass207_4 != null) {
			this.aClass207_4.anInterface17_4 = null;
		}
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILclient!sj;IIIZ)Z")
	private boolean method845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) Class10_Sub3 local8 = (Class10_Sub3) arg2;
		@Pc(12) Class10_Sub3 local12 = this.aClass100_Sub3_6.aClass10_Sub3_3;
		@Pc(33) float local33 = local12.aFloat102 + local8.aFloat101 * local12.aFloat106 + local8.aFloat102 * local12.aFloat108 + local8.aFloat105 * local12.aFloat103;
		@Pc(54) float local54 = local8.aFloat105 * local12.aFloat107 + local8.aFloat102 * local12.aFloat99 + local12.aFloat109 * local8.aFloat101 + local12.aFloat101;
		Static235.aFloat115 = local8.aFloat110 * local12.aFloat104 + local8.aFloat106 * local12.aFloat100 + local12.aFloat110 * local8.aFloat109;
		Static159.aFloat111 = local8.aFloat100 * local12.aFloat104 + local12.aFloat110 * local8.aFloat99 + local12.aFloat100 * local8.aFloat108;
		Static627.aFloat189 = local8.aFloat100 * local12.aFloat103 + local12.aFloat108 * local8.aFloat108 + local8.aFloat99 * local12.aFloat106;
		Static127.aFloat61 = local12.aFloat108 * local8.aFloat106 + local8.aFloat109 * local12.aFloat106 + local12.aFloat103 * local8.aFloat110;
		Static56.aFloat33 = local8.aFloat110 * local12.aFloat107 + local8.aFloat109 * local12.aFloat109 + local12.aFloat99 * local8.aFloat106;
		Static40.aFloat25 = local8.aFloat107 * local12.aFloat109 + local8.aFloat103 * local12.aFloat99 + local12.aFloat107 * local8.aFloat104;
		Static23.aFloat15 = local12.aFloat100 * local8.aFloat103 + local12.aFloat110 * local8.aFloat107 + local12.aFloat104 * local8.aFloat104;
		Static236.aFloat116 = local8.aFloat100 * local12.aFloat107 + local12.aFloat109 * local8.aFloat99 + local8.aFloat108 * local12.aFloat99;
		Static389.aFloat58 = local12.aFloat106 * local8.aFloat107 + local12.aFloat108 * local8.aFloat103 + local8.aFloat104 * local12.aFloat103;
		@Pc(237) float local237 = local12.aFloat105 + local12.aFloat100 * local8.aFloat102 + local8.aFloat101 * local12.aFloat110 + local8.aFloat105 * local12.aFloat104;
		@Pc(239) boolean local239 = false;
		@Pc(248) float local248 = Float.MAX_VALUE;
		@Pc(250) float local250 = -3.4028235E38F;
		@Pc(252) float local252 = Float.MAX_VALUE;
		@Pc(254) float local254 = -3.4028235E38F;
		@Pc(258) int local258 = this.aClass100_Sub3_6.anInt10296;
		@Pc(262) int local262 = this.aClass100_Sub3_6.anInt10273;
		if (!this.aBoolean54) {
			this.method844();
		}
		@Pc(279) int local279 = this.aShort19 - this.aShort23 >> 1;
		@Pc(288) int local288 = this.aShort22 - this.aShort25 >> 1;
		@Pc(296) int local296 = this.aShort24 - this.aShort16 >> 1;
		@Pc(301) int local301 = local279 + this.aShort23;
		@Pc(307) int local307 = this.aShort25 + local288;
		@Pc(312) int local312 = this.aShort16 + local296;
		@Pc(319) int local319 = local301 - (local279 << arg4);
		@Pc(326) int local326 = local307 - (local288 << arg4);
		@Pc(333) int local333 = local312 - (local296 << arg4);
		@Pc(339) int local339 = local301 + (local279 << arg4);
		@Pc(345) int local345 = (local288 << arg4) + local307;
		@Pc(351) int local351 = local312 + (local296 << arg4);
		Static167.anIntArray153[0] = local319;
		Static111.anIntArray97[0] = local326;
		Static219.anIntArray191[0] = local333;
		Static167.anIntArray153[1] = local339;
		Static111.anIntArray97[1] = local326;
		Static219.anIntArray191[1] = local333;
		Static167.anIntArray153[2] = local319;
		Static111.anIntArray97[2] = local345;
		Static219.anIntArray191[2] = local333;
		Static167.anIntArray153[3] = local339;
		Static111.anIntArray97[3] = local345;
		Static219.anIntArray191[3] = local333;
		Static167.anIntArray153[4] = local319;
		Static111.anIntArray97[4] = local326;
		Static219.anIntArray191[4] = local351;
		Static167.anIntArray153[5] = local339;
		Static111.anIntArray97[5] = local326;
		Static167.anIntArray153[6] = local319;
		Static219.anIntArray191[5] = local351;
		Static111.anIntArray97[6] = local345;
		Static167.anIntArray153[7] = local339;
		Static219.anIntArray191[6] = local351;
		Static111.anIntArray97[7] = local345;
		Static219.anIntArray191[7] = local351;
		@Pc(510) float local510;
		@Pc(482) float local482;
		@Pc(496) float local496;
		@Pc(458) float local458;
		@Pc(463) float local463;
		@Pc(468) float local468;
		for (@Pc(449) int local449 = 0; local449 < 8; local449++) {
			local458 = (float) Static167.anIntArray153[local449];
			local463 = (float) Static111.anIntArray97[local449];
			local468 = (float) Static219.anIntArray191[local449];
			local482 = Static40.aFloat25 * local468 + Static236.aFloat116 * local458 + local463 * Static56.aFloat33 + local54;
			local496 = Static159.aFloat111 * local458 + local463 * Static235.aFloat115 + local468 * Static23.aFloat15 + local237;
			local510 = Static127.aFloat61 * local463 + Static627.aFloat189 * local458 + local468 * Static389.aFloat58 + local33;
			if ((float) this.aClass100_Sub3_6.anInt10291 <= local496) {
				if (arg0 > 0) {
					local496 = (float) arg0;
				}
				@Pc(536) float local536 = local510 * (float) local258 / local496 + (float) this.aClass100_Sub3_6.anInt10295;
				if (local536 > local250) {
					local250 = local536;
				}
				@Pc(554) float local554 = local482 * (float) local262 / local496 + (float) this.aClass100_Sub3_6.anInt10277;
				if (local536 < local248) {
					local248 = local536;
				}
				local239 = true;
				if (local554 > local254) {
					local254 = local554;
				}
				if (local554 < local252) {
					local252 = local554;
				}
			}
		}
		if (local239 && local248 < (float) arg3 && (float) arg3 < local250 && (float) arg1 > local252 && (float) arg1 < local254) {
			if (arg5) {
				return true;
			}
			if (this.aClass100_Sub3_6.anIntArray581.length < this.anInt773) {
				this.aClass100_Sub3_6.anIntArray583 = new int[this.anInt773];
				this.aClass100_Sub3_6.anIntArray581 = new int[this.anInt773];
			}
			@Pc(644) int[] local644 = this.aClass100_Sub3_6.anIntArray581;
			@Pc(648) int[] local648 = this.aClass100_Sub3_6.anIntArray583;
			@Pc(741) int local741;
			for (@Pc(650) int local650 = 0; local650 < this.anInt778; local650++) {
				local468 = (float) this.anIntArray58[local650];
				local458 = (float) this.anIntArray53[local650];
				local463 = (float) this.anIntArray57[local650];
				local496 = Static235.aFloat115 * local463 + local458 * Static159.aFloat111 + Static23.aFloat15 * local468 + local237;
				local482 = local458 * Static236.aFloat116 + local463 * Static56.aFloat33 + local468 * Static40.aFloat25 + local54;
				local510 = local33 + Static627.aFloat189 * local458 + local463 * Static127.aFloat61 + Static389.aFloat58 * local468;
				@Pc(754) int local754;
				@Pc(759) int local759;
				@Pc(766) int local766;
				if ((float) this.aClass100_Sub3_6.anInt10291 <= local496) {
					if (arg0 > 0) {
						local496 = (float) arg0;
					}
					local741 = (int) (local510 * (float) local258 / local496 + (float) this.aClass100_Sub3_6.anInt10295);
					local754 = (int) ((float) this.aClass100_Sub3_6.anInt10277 + local482 * (float) local262 / local496);
					local759 = this.anIntArray56[local650];
					local766 = this.anIntArray56[local650 + 1];
					for (@Pc(768) int local768 = local759; local768 < local766; local768++) {
						@Pc(777) int local777 = this.aShortArray18[local768] - 1;
						if (local777 == -1) {
							break;
						}
						local644[local777] = local741;
						local648[local777] = local754;
					}
				} else {
					local741 = this.anIntArray56[local650];
					local754 = this.anIntArray56[local650 + 1];
					for (local759 = local741; local759 < local754; local759++) {
						local766 = this.aShortArray18[local759] - 1;
						if (local766 == -1) {
							break;
						}
						local644[this.aShortArray18[local759] - 1] = -999999;
					}
				}
			}
			for (local741 = 0; local741 < this.anInt758; local741++) {
				if (local644[this.aShortArray10[local741]] != -999999 && local644[this.aShortArray11[local741]] != -999999 && local644[this.aShortArray13[local741]] != -999999 && this.method850(local644[this.aShortArray11[local741]], local648[this.aShortArray13[local741]], local648[this.aShortArray11[local741]], arg1, local648[this.aShortArray10[local741]], local644[this.aShortArray13[local741]], arg3, local644[this.aShortArray10[local741]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "()Z")
	@Override
	public boolean method8858() {
		if (this.aShortArray16 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray16.length; local13++) {
			if (this.aShortArray16[local13] != -1 && !this.aClass100_Sub3_6.anInterface7_12.method7421(this.aShortArray16[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bp", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean54) {
			this.method844();
		}
		return this.aShort18;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8861(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class43_Sub1 local8 = (Class43_Sub1) arg0;
		if (this.anInt758 == 0 || local8.anInt758 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt778;
		@Pc(24) int[] local24 = local8.anIntArray53;
		@Pc(27) int[] local27 = local8.anIntArray57;
		@Pc(30) int[] local30 = local8.anIntArray58;
		@Pc(33) short[] local33 = local8.aShortArray15;
		@Pc(36) short[] local36 = local8.aShortArray17;
		@Pc(39) short[] local39 = local8.aShortArray12;
		@Pc(42) byte[] local42 = local8.aByteArray13;
		@Pc(57) short[] local57;
		@Pc(53) short[] local53;
		@Pc(61) short[] local61;
		@Pc(49) byte[] local49;
		if (this.aClass123_1 == null) {
			local49 = null;
			local53 = null;
			local57 = null;
			local61 = null;
		} else {
			local49 = this.aClass123_1.aByteArray31;
			local53 = this.aClass123_1.aShortArray38;
			local57 = this.aClass123_1.aShortArray40;
			local61 = this.aClass123_1.aShortArray39;
		}
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(86) short[] local86;
		@Pc(90) byte[] local90;
		if (local8.aClass123_1 == null) {
			local82 = null;
			local86 = null;
			local78 = null;
			local90 = null;
		} else {
			local78 = local8.aClass123_1.aShortArray40;
			local82 = local8.aClass123_1.aShortArray38;
			local86 = local8.aClass123_1.aShortArray39;
			local90 = local8.aClass123_1.aByteArray31;
		}
		@Pc(103) int[] local103 = local8.anIntArray56;
		@Pc(106) short[] local106 = local8.aShortArray18;
		if (!local8.aBoolean54) {
			local8.method844();
		}
		@Pc(117) short local117 = local8.aShort25;
		@Pc(120) short local120 = local8.aShort22;
		@Pc(123) short local123 = local8.aShort23;
		@Pc(126) short local126 = local8.aShort19;
		@Pc(129) short local129 = local8.aShort16;
		@Pc(132) short local132 = local8.aShort24;
		for (@Pc(134) int local134 = 0; local134 < this.anInt778; local134++) {
			@Pc(144) int local144 = this.anIntArray57[local134] - arg2;
			if (local144 >= local117 && local144 <= local120) {
				@Pc(172) int local172 = this.anIntArray53[local134] - arg1;
				if (local172 >= local123 && local172 <= local126) {
					@Pc(199) int local199 = this.anIntArray58[local134] - arg3;
					if (local129 <= local199 && local132 >= local199) {
						@Pc(221) int local221 = -1;
						@Pc(226) int local226 = this.anIntArray56[local134];
						@Pc(233) int local233 = this.anIntArray56[local134 + 1];
						for (@Pc(235) int local235 = local226; local235 < local233; local235++) {
							local221 = this.aShortArray18[local235] - 1;
							if (local221 == -1 || this.aByteArray13[local221] != 0) {
								break;
							}
						}
						if (local221 != -1) {
							for (@Pc(274) int local274 = 0; local274 < local21; local274++) {
								if (local172 == local24[local274] && local30[local274] == local199 && local144 == local27[local274]) {
									local226 = local103[local274];
									local233 = local103[local274 + 1];
									@Pc(317) int local317 = -1;
									for (@Pc(319) int local319 = local226; local319 < local233; local319++) {
										local317 = local106[local319] - 1;
										if (local317 == -1 || local42[local317] != 0) {
											break;
										}
									}
									if (local317 != -1) {
										if (local57 == null) {
											this.aClass123_1 = new Class123();
											local57 = this.aClass123_1.aShortArray40 = Static163.method3001(this.aShortArray15);
											local53 = this.aClass123_1.aShortArray38 = Static163.method3001(this.aShortArray17);
											local61 = this.aClass123_1.aShortArray39 = Static163.method3001(this.aShortArray12);
											local49 = this.aClass123_1.aByteArray31 = Static448.method6383(this.aByteArray13);
										}
										if (local78 == null) {
											@Pc(407) Class123 local407 = local8.aClass123_1 = new Class123();
											local78 = local407.aShortArray40 = Static163.method3001(local33);
											local82 = local407.aShortArray38 = Static163.method3001(local36);
											local86 = local407.aShortArray39 = Static163.method3001(local39);
											local90 = local407.aByteArray31 = Static448.method6383(local42);
										}
										@Pc(440) short local440 = this.aShortArray15[local221];
										@Pc(445) short local445 = this.aShortArray17[local221];
										@Pc(450) short local450 = this.aShortArray12[local221];
										local226 = local103[local274];
										@Pc(459) byte local459 = this.aByteArray13[local221];
										local233 = local103[local274 + 1];
										@Pc(475) int local475;
										for (@Pc(467) int local467 = local226; local467 < local233; local467++) {
											local475 = local106[local467] - 1;
											if (local475 == -1) {
												break;
											}
											if (local90[local475] != 0) {
												local78[local475] += local440;
												local82[local475] += local445;
												local86[local475] += local450;
												local90[local475] += local459;
											}
										}
										local233 = this.anIntArray56[local134 + 1];
										local440 = local33[local317];
										local450 = local39[local317];
										local459 = local42[local317];
										local445 = local36[local317];
										local226 = this.anIntArray56[local134];
										for (local475 = local226; local475 < local233; local475++) {
											@Pc(569) int local569 = this.aShortArray18[local475] - 1;
											if (local569 == -1) {
												break;
											}
											if (local49[local569] != 0) {
												local57[local569] += local440;
												local53[local569] += local445;
												local61[local569] += local450;
												local49[local569] += local459;
											}
										}
										if (this.aClass207_3 == null && this.aClass207_1 != null) {
											this.aClass207_1.anInterface17_4 = null;
										}
										if (this.aClass207_3 != null) {
											this.aClass207_3.anInterface17_4 = null;
										}
										if (local8.aClass207_3 == null && local8.aClass207_1 != null) {
											local8.aClass207_1.anInterface17_4 = null;
										}
										if (local8.aClass207_3 != null) {
											local8.aClass207_3.anInterface17_4 = null;
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

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!sj;Lclient!rp;I)V")
	@Override
	public void method8849(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt773 == 0) {
			return;
		}
		@Pc(17) Class10_Sub3 local17 = this.aClass100_Sub3_6.aClass10_Sub3_3;
		if (!this.aBoolean54) {
			this.method844();
		}
		@Pc(28) Class10_Sub3 local28 = (Class10_Sub3) arg0;
		Static235.aFloat115 = local28.aFloat110 * local17.aFloat104 + local17.aFloat110 * local28.aFloat109 + local17.aFloat100 * local28.aFloat106;
		Static442.aFloat139 = local17.aFloat105 + local28.aFloat105 * local17.aFloat104 + local17.aFloat100 * local28.aFloat102 + local17.aFloat110 * local28.aFloat101;
		@Pc(75) float local75 = Static442.aFloat139 + (float) this.aShort25 * Static235.aFloat115;
		@Pc(83) float local83 = (float) this.aShort22 * Static235.aFloat115 + Static442.aFloat139;
		@Pc(94) float local94;
		@Pc(100) float local100;
		if (local75 > local83) {
			local94 = (float) -this.aShort18 + local83;
			local100 = (float) this.aShort18 + local75;
		} else {
			local100 = (float) this.aShort18 + local83;
			local94 = (float) -this.aShort18 + local75;
		}
		if (local94 >= this.aClass100_Sub3_6.aFloat197 || local100 <= (float) this.aClass100_Sub3_6.anInt10291) {
			return;
		}
		Static127.aFloat61 = local28.aFloat109 * local17.aFloat106 + local28.aFloat106 * local17.aFloat108 + local28.aFloat110 * local17.aFloat103;
		Static3.aFloat1 = local28.aFloat105 * local17.aFloat103 + local17.aFloat106 * local28.aFloat101 + local17.aFloat108 * local28.aFloat102 + local17.aFloat102;
		@Pc(179) float local179 = Static127.aFloat61 * (float) this.aShort25 + Static3.aFloat1;
		@Pc(187) float local187 = Static3.aFloat1 + (float) this.aShort22 * Static127.aFloat61;
		@Pc(214) float local214;
		@Pc(202) float local202;
		if (local179 > local187) {
			local202 = (float) this.aClass100_Sub3_6.anInt10296 * ((float) this.aShort18 + local179);
			local214 = ((float) -this.aShort18 + local187) * (float) this.aClass100_Sub3_6.anInt10296;
		} else {
			local202 = ((float) this.aShort18 + local187) * (float) this.aClass100_Sub3_6.anInt10296;
			local214 = ((float) -this.aShort18 + local179) * (float) this.aClass100_Sub3_6.anInt10296;
		}
		if (local214 / local100 >= this.aClass100_Sub3_6.aFloat190 || local202 / local100 <= this.aClass100_Sub3_6.aFloat202) {
			return;
		}
		Static56.aFloat33 = local17.aFloat109 * local28.aFloat109 + local28.aFloat106 * local17.aFloat99 + local28.aFloat110 * local17.aFloat107;
		Static159.aFloat112 = local17.aFloat107 * local28.aFloat105 + local17.aFloat109 * local28.aFloat101 + local17.aFloat99 * local28.aFloat102 + local17.aFloat101;
		@Pc(306) float local306 = Static159.aFloat112 + Static56.aFloat33 * (float) this.aShort25;
		@Pc(314) float local314 = Static159.aFloat112 + Static56.aFloat33 * (float) this.aShort22;
		@Pc(341) float local341;
		@Pc(329) float local329;
		if (local314 < local306) {
			local329 = (float) this.aClass100_Sub3_6.anInt10273 * ((float) this.aShort18 + local306);
			local341 = ((float) -this.aShort18 + local314) * (float) this.aClass100_Sub3_6.anInt10273;
		} else {
			local329 = (float) this.aClass100_Sub3_6.anInt10273 * ((float) this.aShort18 + local314);
			local341 = (float) this.aClass100_Sub3_6.anInt10273 * ((float) -this.aShort18 + local306);
		}
		if (local341 / local100 >= this.aClass100_Sub3_6.aFloat200 || this.aClass100_Sub3_6.aFloat207 >= local329 / local100) {
			return;
		}
		if (arg1 != null || this.aClass391Array1 != null) {
			Static159.aFloat111 = local28.aFloat99 * local17.aFloat110 + local17.aFloat100 * local28.aFloat108 + local17.aFloat104 * local28.aFloat100;
			Static23.aFloat15 = local28.aFloat104 * local17.aFloat104 + local17.aFloat110 * local28.aFloat107 + local17.aFloat100 * local28.aFloat103;
			Static236.aFloat116 = local17.aFloat107 * local28.aFloat100 + local28.aFloat99 * local17.aFloat109 + local17.aFloat99 * local28.aFloat108;
			Static40.aFloat25 = local28.aFloat104 * local17.aFloat107 + local17.aFloat99 * local28.aFloat103 + local28.aFloat107 * local17.aFloat109;
			Static389.aFloat58 = local28.aFloat104 * local17.aFloat103 + local28.aFloat103 * local17.aFloat108 + local28.aFloat107 * local17.aFloat106;
			Static627.aFloat189 = local28.aFloat100 * local17.aFloat103 + local17.aFloat108 * local28.aFloat108 + local17.aFloat106 * local28.aFloat99;
		}
		if (arg1 != null) {
			@Pc(507) boolean local507 = false;
			@Pc(509) boolean local509 = true;
			@Pc(517) int local517 = this.aShort23 + this.aShort19 >> 1;
			@Pc(525) int local525 = this.aShort24 + this.aShort16 >> 1;
			@Pc(544) int local544 = (int) (Static389.aFloat58 * (float) local525 + Static3.aFloat1 + Static627.aFloat189 * (float) local517 + (float) this.aShort25 * Static127.aFloat61);
			@Pc(563) int local563 = (int) (Static40.aFloat25 * (float) local525 + Static236.aFloat116 * (float) local517 + Static159.aFloat112 + Static56.aFloat33 * (float) this.aShort25);
			@Pc(582) int local582 = (int) (Static23.aFloat15 * (float) local525 + Static159.aFloat111 * (float) local517 + Static442.aFloat139 + Static235.aFloat115 * (float) this.aShort25);
			if (this.aClass100_Sub3_6.anInt10291 <= local582) {
				arg1.anInt8405 = this.aClass100_Sub3_6.anInt10277 + local563 * this.aClass100_Sub3_6.anInt10273 / local582;
				arg1.anInt8408 = this.aClass100_Sub3_6.anInt10296 * local544 / local582 + this.aClass100_Sub3_6.anInt10295;
			} else {
				local507 = true;
			}
			@Pc(642) int local642 = (int) (Static389.aFloat58 * (float) local525 + Static3.aFloat1 + Static627.aFloat189 * (float) local517 + (float) this.aShort22 * Static127.aFloat61);
			@Pc(661) int local661 = (int) ((float) local525 * Static40.aFloat25 + Static56.aFloat33 * (float) this.aShort22 + (float) local517 * Static236.aFloat116 + Static159.aFloat112);
			@Pc(680) int local680 = (int) ((float) local525 * Static23.aFloat15 + Static442.aFloat139 + Static159.aFloat111 * (float) local517 + Static235.aFloat115 * (float) this.aShort22);
			if (local680 < this.aClass100_Sub3_6.anInt10291) {
				local507 = true;
			} else {
				arg1.anInt8406 = this.aClass100_Sub3_6.anInt10295 + local642 * this.aClass100_Sub3_6.anInt10296 / local680;
				arg1.anInt8404 = this.aClass100_Sub3_6.anInt10273 * local661 / local680 + this.aClass100_Sub3_6.anInt10277;
			}
			if (local507) {
				if (this.aClass100_Sub3_6.anInt10291 > local582 && this.aClass100_Sub3_6.anInt10291 > local680) {
					local509 = false;
				} else {
					@Pc(768) int local768;
					@Pc(779) int local779;
					@Pc(790) int local790;
					if (local582 < this.aClass100_Sub3_6.anInt10291) {
						local768 = (local680 - this.aClass100_Sub3_6.anInt10291 << 16) / (local680 - local582);
						local779 = (local768 * (local642 - local544) >> 16) + local642;
						local790 = ((local661 - local563) * local768 >> 16) + local661;
						arg1.anInt8408 = local779 * this.aClass100_Sub3_6.anInt10296 / this.aClass100_Sub3_6.anInt10291 + this.aClass100_Sub3_6.anInt10295;
						arg1.anInt8405 = this.aClass100_Sub3_6.anInt10277 + local790 * this.aClass100_Sub3_6.anInt10273 / this.aClass100_Sub3_6.anInt10291;
					} else if (this.aClass100_Sub3_6.anInt10291 > local680) {
						local768 = (local582 - this.aClass100_Sub3_6.anInt10291 << 16) / (local582 - local680);
						local779 = local544 + (local768 * (local544 - local642) >> 16);
						local790 = (local768 * (local563 - local661) >> 16) + local563;
						arg1.anInt8408 = this.aClass100_Sub3_6.anInt10296 * local779 / this.aClass100_Sub3_6.anInt10291 + this.aClass100_Sub3_6.anInt10295;
						arg1.anInt8405 = this.aClass100_Sub3_6.anInt10277 + this.aClass100_Sub3_6.anInt10273 * local790 / this.aClass100_Sub3_6.anInt10291;
					}
				}
			}
			if (local509) {
				arg1.aBoolean558 = true;
				if (local680 >= local582) {
					arg1.anInt8407 = this.aClass100_Sub3_6.anInt10295 + (local642 + this.aShort18) * this.aClass100_Sub3_6.anInt10296 / local680 - arg1.anInt8406;
				} else {
					arg1.anInt8407 = this.aClass100_Sub3_6.anInt10295 + this.aClass100_Sub3_6.anInt10296 * (this.aShort18 + local544) / local582 - arg1.anInt8408;
				}
			}
		}
		this.aClass100_Sub3_6.method8745();
		this.aClass100_Sub3_6.method8747(local28);
		this.method852();
		this.aClass100_Sub3_6.method8683();
		this.method847();
	}

	@OriginalMember(owner = "client!bp", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt775; local3++) {
			this.anIntArray53[local3] = this.anIntArray53[local3] + 7 >> 4;
			this.anIntArray57[local3] = this.anIntArray57[local3] + 7 >> 4;
			this.anIntArray58[local3] = this.anIntArray58[local3] + 7 >> 4;
		}
		if (this.aClass207_4 != null) {
			this.aClass207_4.anInterface17_4 = null;
		}
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)V")
	private void method847() {
		if (this.aClass391Array1 == null) {
			return;
		}
		@Pc(17) Class10_Sub3 local17 = this.aClass100_Sub3_6.aClass10_Sub3_2;
		this.aClass100_Sub3_6.method8668();
		this.aClass100_Sub3_6.C(!this.aBoolean53);
		this.aClass100_Sub3_6.method8720(false);
		this.aClass100_Sub3_6.method8727((Class207) null, this.aClass100_Sub3_6.aClass207_16, this.aClass100_Sub3_6.aClass207_15, (Class207) null);
		for (@Pc(50) int local50 = 0; local50 < this.anInt798; local50++) {
			@Pc(59) Class391 local59 = this.aClass391Array1[local50];
			@Pc(64) Class360 local64 = this.aClass360Array1[local50];
			if (!local59.aBoolean761 || !this.aClass100_Sub3_6.method8656()) {
				@Pc(95) float local95 = (float) (this.anIntArray53[local59.anInt10769] + this.anIntArray53[local59.anInt10768] + this.anIntArray53[local59.anInt10767]) * 0.3333333F;
				@Pc(116) float local116 = (float) (this.anIntArray57[local59.anInt10767] + this.anIntArray57[local59.anInt10768] + this.anIntArray57[local59.anInt10769]) * 0.3333333F;
				@Pc(137) float local137 = (float) (this.anIntArray58[local59.anInt10767] + this.anIntArray58[local59.anInt10768] + this.anIntArray58[local59.anInt10769]) * 0.3333333F;
				@Pc(151) float local151 = Static3.aFloat1 + Static127.aFloat61 * local116 + local95 * Static627.aFloat189 + local137 * Static389.aFloat58;
				@Pc(165) float local165 = Static159.aFloat112 + Static56.aFloat33 * local116 + local95 * Static236.aFloat116 + Static40.aFloat25 * local137;
				@Pc(179) float local179 = Static442.aFloat139 + local137 * Static23.aFloat15 + Static159.aFloat111 * local95 + Static235.aFloat115 * local116;
				@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local151 * local151 + local165 * local165 + local179 * local179))) * (float) local59.anInt10766;
				local17.method2818(local64.anInt9698 * local59.aShort126 >> 7, local59.aShort125 * local64.anInt9699 >> 7, (float) local64.anInt9703 + local151 - local200 * local151, local200 * local165 + ((float) local64.anInt9696 - local165), local200 * local179 - local179, local64.anInt9701);
				this.aClass100_Sub3_6.method8669(local17);
				@Pc(251) int local251 = local64.anInt9705;
				OpenGL.glColor4ub((byte) (local251 >> 16), (byte) (local251 >> 8), (byte) local251, (byte) (local251 >> 24));
				this.aClass100_Sub3_6.method8693(local59.aShort124);
				this.aClass100_Sub3_6.method8728(local59.aByte146);
				this.aClass100_Sub3_6.method8696(4);
			}
		}
		this.aClass100_Sub3_6.C(true);
		this.aClass100_Sub3_6.method8683();
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "()V")
	@Override
	public void method8864() {
		if (this.anInt773 <= 0 || this.anInt740 <= 0) {
			return;
		}
		this.method838(false);
		if ((this.aByte16 & 0x10) == 0 && this.aClass190_1.anInterface6_2 == null) {
			this.method843(false);
		}
		this.method840();
	}

	@OriginalMember(owner = "client!bp", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(62) int local62;
		@Pc(40) int local40;
		@Pc(56) int local56;
		@Pc(54) int[] local54;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static34.anInt511 = 0;
			Static507.anInt10611 = 0;
			Static432.anInt7144 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (local40 < this.anIntArrayArray8.length) {
					local54 = this.anIntArrayArray8[local40];
					for (local56 = 0; local56 < local54.length; local56++) {
						local62 = local54[local56];
						if (this.aShortArray14 == null || (this.aShortArray14[local62] & arg6) != 0) {
							Static507.anInt10611 += this.anIntArray53[local62];
							Static34.anInt511 += this.anIntArray57[local62];
							Static432.anInt7144 += this.anIntArray58[local62];
							local30++;
						}
					}
				}
			}
			if (local30 > 0) {
				Static34.anInt511 = arg3 + Static34.anInt511 / local30;
				Static507.anInt10611 = arg2 + Static507.anInt10611 / local30;
				Static569.aBoolean593 = true;
				Static432.anInt7144 = arg4 + Static432.anInt7144 / local30;
			} else {
				Static507.anInt10611 = arg2;
				Static34.anInt511 = arg3;
				Static432.anInt7144 = arg4;
			}
			return;
		}
		@Pc(263) int[] local263;
		@Pc(265) int local265;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local32 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local40 = arg7[6] * arg2 + arg3 * arg7[7] + arg7[8] * arg4 + 8192 >> 14;
				arg3 = local32;
				arg2 = local30;
				arg4 = local40;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray8.length) {
					local263 = this.anIntArrayArray8[local32];
					for (local265 = 0; local265 < local263.length; local265++) {
						local56 = local263[local265];
						if (this.aShortArray14 == null || (this.aShortArray14[local56] & arg6) != 0) {
							this.anIntArray53[local56] += arg2;
							this.anIntArray57[local56] += arg3;
							this.anIntArray58[local56] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(398) int local398;
		@Pc(421) int local421;
		@Pc(448) int local448;
		@Pc(479) int local479;
		@Pc(483) int local483;
		@Pc(487) int local487;
		@Pc(491) int local491;
		@Pc(499) int local499;
		@Pc(507) int local507;
		@Pc(663) int local663;
		@Pc(689) int local689;
		@Pc(694) int local694;
		@Pc(704) int local704;
		@Pc(709) int local709;
		@Pc(713) int local713;
		@Pc(717) int local717;
		@Pc(719) int local719;
		@Pc(854) int[] local854;
		@Pc(856) int local856;
		@Pc(862) int local862;
		@Pc(866) int local866;
		@Pc(868) int local868;
		@Pc(1007) int local1007;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray8.length > local32) {
						local263 = this.anIntArrayArray8[local32];
						for (local265 = 0; local265 < local263.length; local265++) {
							local56 = local263[local265];
							if (this.aShortArray14 == null || (arg6 & this.aShortArray14[local56]) != 0) {
								this.anIntArray53[local56] -= Static507.anInt10611;
								this.anIntArray57[local56] -= Static34.anInt511;
								this.anIntArray58[local56] -= Static432.anInt7144;
								if (arg4 != 0) {
									local62 = Class42.anIntArray51[arg4];
									local398 = Class42.anIntArray52[arg4];
									local421 = this.anIntArray53[local56] * local398 + this.anIntArray57[local56] * local62 + 16383 >> 14;
									this.anIntArray57[local56] = this.anIntArray57[local56] * local398 + 16383 - local62 * this.anIntArray53[local56] >> 14;
									this.anIntArray53[local56] = local421;
								}
								if (arg2 != 0) {
									local62 = Class42.anIntArray51[arg2];
									local398 = Class42.anIntArray52[arg2];
									local421 = this.anIntArray57[local56] * local398 + 16383 - local62 * this.anIntArray58[local56] >> 14;
									this.anIntArray58[local56] = this.anIntArray57[local56] * local62 + local398 * this.anIntArray58[local56] + 16383 >> 14;
									this.anIntArray57[local56] = local421;
								}
								if (arg3 != 0) {
									local62 = Class42.anIntArray51[arg3];
									local398 = Class42.anIntArray52[arg3];
									local421 = local398 * this.anIntArray53[local56] + this.anIntArray58[local56] * local62 + 16383 >> 14;
									this.anIntArray58[local56] = this.anIntArray58[local56] * local398 + 16383 - this.anIntArray53[local56] * local62 >> 14;
									this.anIntArray53[local56] = local421;
								}
								this.anIntArray53[local56] += Static507.anInt10611;
								this.anIntArray57[local56] += Static34.anInt511;
								this.anIntArray58[local56] += Static432.anInt7144;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (this.anIntArrayArray8.length > local40) {
							local54 = this.anIntArrayArray8[local40];
							for (local56 = 0; local56 < local54.length; local56++) {
								local62 = local54[local56];
								if (this.aShortArray14 == null || (this.aShortArray14[local62] & arg6) != 0) {
									local398 = this.anIntArray56[local62];
									local421 = this.anIntArray56[local62 + 1];
									for (local448 = local398; local448 < local421; local448++) {
										local479 = this.aShortArray18[local448] - 1;
										if (local479 == -1) {
											break;
										}
										if (arg4 != 0) {
											local483 = Class42.anIntArray51[arg4];
											local487 = Class42.anIntArray52[arg4];
											local491 = local487 * this.aShortArray15[local479] + this.aShortArray17[local479] * local483 + 16383 >> 14;
											this.aShortArray17[local479] = (short) (this.aShortArray17[local479] * local487 + 16383 - local483 * this.aShortArray15[local479] >> 14);
											this.aShortArray15[local479] = (short) local491;
										}
										if (arg2 != 0) {
											local483 = Class42.anIntArray51[arg2];
											local487 = Class42.anIntArray52[arg2];
											local491 = this.aShortArray17[local479] * local487 + 16383 - this.aShortArray12[local479] * local483 >> 14;
											this.aShortArray12[local479] = (short) (this.aShortArray17[local479] * local483 + local487 * this.aShortArray12[local479] + 16383 >> 14);
											this.aShortArray17[local479] = (short) local491;
										}
										if (arg3 != 0) {
											local483 = Class42.anIntArray51[arg3];
											local487 = Class42.anIntArray52[arg3];
											local491 = this.aShortArray12[local479] * local483 + this.aShortArray15[local479] * local487 + 16383 >> 14;
											this.aShortArray12[local479] = (short) (this.aShortArray12[local479] * local487 + 16383 - this.aShortArray15[local479] * local483 >> 14);
											this.aShortArray15[local479] = (short) local491;
										}
									}
								}
							}
						}
					}
					if (this.aClass207_3 == null && this.aClass207_1 != null) {
						this.aClass207_1.anInterface17_4 = null;
					}
					if (this.aClass207_3 != null) {
						this.aClass207_3.anInterface17_4 = null;
					}
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local40 = arg7[11] << 4;
				local265 = arg7[12] << 4;
				local56 = arg7[13] << 4;
				local62 = arg7[14] << 4;
				if (Static569.aBoolean593) {
					local398 = Static432.anInt7144 * arg7[6] + Static34.anInt511 * arg7[3] + arg7[0] * Static507.anInt10611 + 8192 >> 14;
					local421 = arg7[1] * Static507.anInt10611 + Static34.anInt511 * arg7[4] + arg7[7] * Static432.anInt7144 + 8192 >> 14;
					local421 += local56;
					local448 = arg7[8] * Static432.anInt7144 + arg7[2] * Static507.anInt10611 + Static34.anInt511 * arg7[5] + 8192 >> 14;
					local398 += local265;
					local448 += local62;
					Static34.anInt511 = local421;
					Static507.anInt10611 = local398;
					Static569.aBoolean593 = false;
					Static432.anInt7144 = local448;
				}
				@Pc(467) int[] local467 = new int[9];
				local421 = Class42.anIntArray52[arg2];
				local448 = Class42.anIntArray51[arg2];
				local479 = Class42.anIntArray52[arg3];
				local483 = Class42.anIntArray51[arg3];
				local487 = Class42.anIntArray52[arg4];
				local491 = Class42.anIntArray51[arg4];
				local499 = local448 * local487 + 8192 >> 14;
				local507 = local448 * local491 + 8192 >> 14;
				local467[8] = local479 * local421 + 8192 >> 14;
				local467[7] = local499 * local479 + local491 * local483 + 8192 >> 14;
				local467[1] = -local479 * local491 + local499 * local483 + 8192 >> 14;
				local467[6] = local487 * -local483 + local507 * local479 + 8192 >> 14;
				local467[5] = -local448;
				local467[2] = local483 * local421 + 8192 >> 14;
				local467[4] = local421 * local487 + 8192 >> 14;
				local467[0] = local479 * local487 + local507 * local483 + 8192 >> 14;
				local467[3] = local491 * local421 + 8192 >> 14;
				@Pc(638) int local638 = -Static432.anInt7144 * local467[2] + -Static507.anInt10611 * local467[0] + local467[1] * -Static34.anInt511 + 8192 >> 14;
				local663 = -Static34.anInt511 * local467[4] + -Static507.anInt10611 * local467[3] + -Static432.anInt7144 * local467[5] + 8192 >> 14;
				local689 = -Static432.anInt7144 * local467[8] + local467[6] * -Static507.anInt10611 + local467[7] * -Static34.anInt511 + 8192 >> 14;
				local694 = local638 + Static507.anInt10611;
				@Pc(699) int local699 = local663 + Static34.anInt511;
				local704 = local689 + Static432.anInt7144;
				@Pc(707) int[] local707 = new int[9];
				for (local709 = 0; local709 < 3; local709++) {
					for (local713 = 0; local713 < 3; local713++) {
						local717 = 0;
						for (local719 = 0; local719 < 3; local719++) {
							local717 += local467[local719 + local709 * 3] * arg7[local719 + local713 * 3];
						}
						local707[local709 * 3 + local713] = local717 + 8192 >> 14;
					}
				}
				local713 = local56 * local467[1] + local467[0] * local265 + local467[2] * local62 + 8192 >> 14;
				local717 = local62 * local467[5] + local265 * local467[3] + local467[4] * local56 + 8192 >> 14;
				local713 += local694;
				local717 += local699;
				local719 = local467[7] * local56 + local467[6] * local265 + local467[8] * local62 + 8192 >> 14;
				local719 += local704;
				local854 = new int[9];
				for (local856 = 0; local856 < 3; local856++) {
					for (local862 = 0; local862 < 3; local862++) {
						local866 = 0;
						for (local868 = 0; local868 < 3; local868++) {
							local866 += local707[local862 + local868 * 3] * arg7[local868 + local856 * 3];
						}
						local854[local856 * 3 + local862] = local866 + 8192 >> 14;
					}
				}
				local862 = arg7[1] * local717 + arg7[0] * local713 + local719 * arg7[2] + 8192 >> 14;
				local866 = arg7[3] * local713 + local717 * arg7[4] + arg7[5] * local719 + 8192 >> 14;
				local868 = local713 * arg7[6] + local717 * arg7[7] + arg7[8] * local719 + 8192 >> 14;
				local862 += local30;
				local866 += local32;
				local868 += local40;
				for (local1007 = 0; local1007 < local8; local1007++) {
					@Pc(1015) int local1015 = arg1[local1007];
					if (local1015 < this.anIntArrayArray8.length) {
						@Pc(1029) int[] local1029 = this.anIntArrayArray8[local1015];
						for (@Pc(1031) int local1031 = 0; local1031 < local1029.length; local1031++) {
							@Pc(1037) int local1037 = local1029[local1031];
							if (this.aShortArray14 == null || (this.aShortArray14[local1037] & arg6) != 0) {
								@Pc(1084) int local1084 = this.anIntArray58[local1037] * local854[2] + this.anIntArray53[local1037] * local854[0] + this.anIntArray57[local1037] * local854[1] + 8192 >> 14;
								@Pc(1116) int local1116 = local854[5] * this.anIntArray58[local1037] + local854[3] * this.anIntArray53[local1037] + local854[4] * this.anIntArray57[local1037] + 8192 >> 14;
								@Pc(1120) int local1120 = local1116 + local866;
								@Pc(1124) int local1124 = local1084 + local862;
								@Pc(1155) int local1155 = local854[7] * this.anIntArray57[local1037] + this.anIntArray53[local1037] * local854[6] + this.anIntArray58[local1037] * local854[8] + 8192 >> 14;
								this.anIntArray53[local1037] = local1124;
								@Pc(1164) int local1164 = local1155 + local868;
								this.anIntArray57[local1037] = local1120;
								this.anIntArray58[local1037] = local1164;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2720) Class391 local2720;
			@Pc(2725) Class360 local2725;
			if (arg0 == 5) {
				if (this.anIntArrayArray6 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray6.length > local32) {
							local263 = this.anIntArrayArray6[local32];
							for (local265 = 0; local265 < local263.length; local265++) {
								local56 = local263[local265];
								if (this.aShortArray8 == null || (arg6 & this.aShortArray8[local56]) != 0) {
									local62 = (this.aByteArray14[local56] & 0xFF) + arg2 * 8;
									if (local62 < 0) {
										local62 = 0;
									} else if (local62 > 255) {
										local62 = 255;
									}
									this.aByteArray14[local56] = (byte) local62;
									if (this.aClass207_1 != null) {
										this.aClass207_1.anInterface17_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass391Array1 != null) {
						for (local32 = 0; local32 < this.anInt798; local32++) {
							local2720 = this.aClass391Array1[local32];
							local2725 = this.aClass360Array1[local32];
							local2725.anInt9705 = 255 - (this.aByteArray14[local2720.anInt10770] & 0xFF) << 24 | local2725.anInt9705 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2998) Class360 local2998;
				if (arg0 == 8) {
					if (this.anIntArrayArray7 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray7.length) {
								local263 = this.anIntArrayArray7[local32];
								for (local265 = 0; local265 < local263.length; local265++) {
									local2998 = this.aClass360Array1[local263[local265]];
									local2998.anInt9703 += arg2;
									local2998.anInt9696 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray7 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray7.length) {
								local263 = this.anIntArrayArray7[local32];
								for (local265 = 0; local265 < local263.length; local265++) {
									local2998 = this.aClass360Array1[local263[local265]];
									local2998.anInt9698 = local2998.anInt9698 * arg3 >> 7;
									local2998.anInt9699 = local2998.anInt9699 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray7 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray7.length > local32) {
							local263 = this.anIntArrayArray7[local32];
							for (local265 = 0; local265 < local263.length; local265++) {
								local2998 = this.aClass360Array1[local263[local265]];
								local2998.anInt9701 = arg2 + local2998.anInt9701 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray6 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray6.length) {
						local263 = this.anIntArrayArray6[local32];
						for (local265 = 0; local265 < local263.length; local265++) {
							local56 = local263[local265];
							if (this.aShortArray8 == null || (this.aShortArray8[local56] & arg6) != 0) {
								local62 = this.aShortArray9[local56] & 0xFFFF;
								local398 = local62 >> 10 & 0x3F;
								local421 = local62 >> 7 & 0x7;
								local421 += arg3 / 4;
								local448 = local62 & 0x7F;
								@Pc(2839) int local2839 = local398 + arg2 & 0x3F;
								if (local421 < 0) {
									local421 = 0;
								} else if (local421 > 7) {
									local421 = 7;
								}
								local448 += arg4;
								if (local448 < 0) {
									local448 = 0;
								} else if (local448 > 127) {
									local448 = 127;
								}
								this.aShortArray9[local56] = (short) (local448 | local421 << 7 | local2839 << 10);
								if (this.aClass207_1 != null) {
									this.aClass207_1.anInterface17_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass391Array1 != null) {
					for (local32 = 0; local32 < this.anInt798; local32++) {
						local2720 = this.aClass391Array1[local32];
						local2725 = this.aClass360Array1[local32];
						local2725.anInt9705 = Static408.anIntArray407[this.aShortArray9[local2720.anInt10770] & 0xFFFF] & 0xFFFFFF | local2725.anInt9705 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray8.length) {
					local263 = this.anIntArrayArray8[local32];
					for (local265 = 0; local265 < local263.length; local265++) {
						local56 = local263[local265];
						if (this.aShortArray14 == null || (arg6 & this.aShortArray14[local56]) != 0) {
							this.anIntArray53[local56] -= Static507.anInt10611;
							this.anIntArray57[local56] -= Static34.anInt511;
							this.anIntArray58[local56] -= Static432.anInt7144;
							this.anIntArray53[local56] = this.anIntArray53[local56] * arg2 >> 7;
							this.anIntArray57[local56] = arg3 * this.anIntArray57[local56] >> 7;
							this.anIntArray58[local56] = arg4 * this.anIntArray58[local56] >> 7;
							this.anIntArray53[local56] += Static507.anInt10611;
							this.anIntArray57[local56] += Static34.anInt511;
							this.anIntArray58[local56] += Static432.anInt7144;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local40 = arg7[11] << 4;
			local265 = arg7[12] << 4;
			local56 = arg7[13] << 4;
			local62 = arg7[14] << 4;
			if (Static569.aBoolean593) {
				local398 = arg7[0] * Static507.anInt10611 + arg7[3] * Static34.anInt511 + Static432.anInt7144 * arg7[6] + 8192 >> 14;
				local421 = Static432.anInt7144 * arg7[7] + Static507.anInt10611 * arg7[1] + arg7[4] * Static34.anInt511 + 8192 >> 14;
				local448 = arg7[8] * Static432.anInt7144 + Static507.anInt10611 * arg7[2] + Static34.anInt511 * arg7[5] + 8192 >> 14;
				local421 += local56;
				local398 += local265;
				Static507.anInt10611 = local398;
				local448 += local62;
				Static34.anInt511 = local421;
				Static432.anInt7144 = local448;
				Static569.aBoolean593 = false;
			}
			local398 = arg2 << 15 >> 7;
			local421 = arg3 << 15 >> 7;
			local448 = arg4 << 15 >> 7;
			local479 = local398 * -Static507.anInt10611 + 8192 >> 14;
			local483 = -Static34.anInt511 * local421 + 8192 >> 14;
			local487 = local448 * -Static432.anInt7144 + 8192 >> 14;
			local491 = local479 + Static507.anInt10611;
			local499 = local483 + Static34.anInt511;
			local507 = local487 + Static432.anInt7144;
			@Pc(2126) int[] local2126 = new int[] { local398 * arg7[0] + 8192 >> 14, arg7[3] * local398 + 8192 >> 14, local398 * arg7[6] + 8192 >> 14, local421 * arg7[1] + 8192 >> 14, local421 * arg7[4] + 8192 >> 14, arg7[7] * local421 + 8192 >> 14, arg7[2] * local448 + 8192 >> 14, local448 * arg7[5] + 8192 >> 14, arg7[8] * local448 + 8192 >> 14 };
			local663 = local398 * local265 + 8192 >> 14;
			local689 = local421 * local56 + 8192 >> 14;
			@Pc(2254) int local2254 = local663 + local491;
			local694 = local448 * local62 + 8192 >> 14;
			@Pc(2266) int local2266 = local689 + local499;
			@Pc(2270) int local2270 = local694 + local507;
			@Pc(2273) int[] local2273 = new int[9];
			@Pc(2279) int local2279;
			for (local704 = 0; local704 < 3; local704++) {
				for (local2279 = 0; local2279 < 3; local2279++) {
					local709 = 0;
					for (local713 = 0; local713 < 3; local713++) {
						local709 += local2126[local2279 + local713 * 3] * arg7[local704 * 3 + local713];
					}
					local2273[local704 * 3 + local2279] = local709 + 8192 >> 14;
				}
			}
			local2279 = arg7[1] * local2266 + arg7[0] * local2254 + local2270 * arg7[2] + 8192 >> 14;
			local709 = arg7[3] * local2254 + local2266 * arg7[4] + local2270 * arg7[5] + 8192 >> 14;
			local2279 += local30;
			local713 = local2254 * arg7[6] + arg7[7] * local2266 + arg7[8] * local2270 + 8192 >> 14;
			local709 += local32;
			local713 += local40;
			for (local717 = 0; local717 < local8; local717++) {
				local719 = arg1[local717];
				if (this.anIntArrayArray8.length > local719) {
					local854 = this.anIntArrayArray8[local719];
					for (local856 = 0; local856 < local854.length; local856++) {
						local862 = local854[local856];
						if (this.aShortArray14 == null || (this.aShortArray14[local862] & arg6) != 0) {
							local866 = local2273[2] * this.anIntArray58[local862] + local2273[0] * this.anIntArray53[local862] + this.anIntArray57[local862] * local2273[1] + 8192 >> 14;
							local868 = this.anIntArray58[local862] * local2273[5] + this.anIntArray57[local862] * local2273[4] + this.anIntArray53[local862] * local2273[3] + 8192 >> 14;
							local1007 = local2273[6] * this.anIntArray53[local862] + this.anIntArray57[local862] * local2273[7] + local2273[8] * this.anIntArray58[local862] + 8192 >> 14;
							@Pc(2559) int local2559 = local866 + local2279;
							@Pc(2563) int local2563 = local868 + local709;
							@Pc(2567) int local2567 = local1007 + local713;
							this.anIntArray53[local862] = local2559;
							this.anIntArray57[local862] = local2563;
							this.anIntArray58[local862] = local2567;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "()[Lclient!ui;")
	@Override
	public Class363[] method8853() {
		return this.aClass363Array1;
	}

	@OriginalMember(owner = "client!bp", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass100_Sub3_6.anInterface7_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt758; local11++) {
			if (arg0 == this.aShortArray16[local11]) {
				this.aShortArray16[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(50) Class44 local50 = local9.method7423(arg0 & 0xFFFF);
			local35 = local50.aByte17;
			local37 = local50.aByte22;
		}
		@Pc(58) byte local58 = 0;
		@Pc(60) byte local60 = 0;
		if (arg1 != -1) {
			@Pc(71) Class44 local71 = local9.method7423(arg1 & 0xFFFF);
			local58 = local71.aByte17;
			if (local71.aByte18 != 0 || local71.aByte20 != 0) {
				this.aBoolean55 = true;
			}
			local60 = local71.aByte22;
		}
		if (!(local35 != local58 | local60 != local37)) {
			return;
		}
		if (this.aClass391Array1 != null) {
			for (@Pc(113) int local113 = 0; local113 < this.anInt798; local113++) {
				@Pc(120) Class391 local120 = this.aClass391Array1[local113];
				@Pc(125) Class360 local125 = this.aClass360Array1[local113];
				local125.anInt9705 = Static408.anIntArray407[this.aShortArray9[local120.anInt10770] & 0xFFFF] & 0xFFFFFF | local125.anInt9705 & 0xFF000000;
			}
		}
		if (this.aClass207_1 != null) {
			this.aClass207_1.anInterface17_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "()[Lclient!ok;")
	@Override
	public Class270[] method8863() {
		return this.aClass270Array1;
	}

	@OriginalMember(owner = "client!bp", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean53;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "()V")
	@Override
	protected void method8843() {
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILclient!bp;ZZLclient!bp;)Lclient!ka;")
	private Class43 method849(@OriginalArg(0) int arg0, @OriginalArg(2) Class43_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class43_Sub1 arg4) {
		arg1.aShort20 = this.aShort20;
		arg1.anInt740 = this.anInt740;
		arg1.anInt773 = this.anInt773;
		arg1.anInt778 = this.anInt778;
		arg1.aShort17 = this.aShort17;
		arg1.anInt796 = arg0;
		arg1.anInt775 = this.anInt775;
		if ((arg0 & 0x100) == 0) {
			arg1.aBoolean53 = this.aBoolean53;
		} else {
			arg1.aBoolean53 = true;
		}
		arg1.anInt758 = this.anInt758;
		arg1.anInt764 = this.anInt764;
		arg1.aBoolean55 = this.aBoolean55;
		arg1.aByte16 = 0;
		arg1.anInt798 = this.anInt798;
		@Pc(83) boolean local83 = Static197.method3296(arg0, this.anInt764);
		@Pc(89) boolean local89 = Static186.method3178(arg0, this.anInt764);
		@Pc(97) boolean local97 = Static649.method8957(this.anInt764, arg0);
		@Pc(103) boolean local103 = local97 | local89 | local83;
		@Pc(252) int local252;
		if (local103) {
			if (!local83) {
				arg1.anIntArray53 = this.anIntArray53;
			} else if (arg4.anIntArray53 == null || this.anInt775 > arg4.anIntArray53.length) {
				arg1.anIntArray53 = arg4.anIntArray53 = new int[this.anInt775];
			} else {
				arg1.anIntArray53 = arg4.anIntArray53;
			}
			if (!local89) {
				arg1.anIntArray57 = this.anIntArray57;
			} else if (arg4.anIntArray57 == null || this.anInt775 > arg4.anIntArray57.length) {
				arg1.anIntArray57 = arg4.anIntArray57 = new int[this.anInt775];
			} else {
				arg1.anIntArray57 = arg4.anIntArray57;
			}
			if (!local97) {
				arg1.anIntArray58 = this.anIntArray58;
			} else if (arg4.anIntArray58 == null || this.anInt775 > arg4.anIntArray58.length) {
				arg1.anIntArray58 = arg4.anIntArray58 = new int[this.anInt775];
			} else {
				arg1.anIntArray58 = arg4.anIntArray58;
			}
			for (local252 = 0; local252 < this.anInt775; local252++) {
				if (local83) {
					arg1.anIntArray53[local252] = this.anIntArray53[local252];
				}
				if (local89) {
					arg1.anIntArray57[local252] = this.anIntArray57[local252];
				}
				if (local97) {
					arg1.anIntArray58[local252] = this.anIntArray58[local252];
				}
			}
		} else {
			arg1.anIntArray58 = this.anIntArray58;
			arg1.anIntArray53 = this.anIntArray53;
			arg1.anIntArray57 = this.anIntArray57;
		}
		if (Static328.method4972(this.anInt764, arg0)) {
			if (arg3) {
				arg1.aByte16 = (byte) (arg1.aByte16 | 0x1);
			}
			arg1.aClass207_4 = arg4.aClass207_4;
			arg1.aClass207_4.anInterface17_4 = this.aClass207_4.anInterface17_4;
			arg1.aClass207_4.aByte78 = this.aClass207_4.aByte78;
		} else if (Static177.method3094(arg0, this.anInt764)) {
			arg1.aClass207_4 = this.aClass207_4;
		} else {
			arg1.aClass207_4 = null;
		}
		if (Static45.method787(this.anInt764, arg0)) {
			if (arg4.aShortArray9 == null || this.anInt758 > arg4.aShortArray9.length) {
				arg1.aShortArray9 = arg4.aShortArray9 = new short[this.anInt758];
			} else {
				arg1.aShortArray9 = arg4.aShortArray9;
			}
			for (local252 = 0; local252 < this.anInt758; local252++) {
				arg1.aShortArray9[local252] = this.aShortArray9[local252];
			}
		} else {
			arg1.aShortArray9 = this.aShortArray9;
		}
		if (Static540.method7411(this.anInt764, arg0)) {
			if (arg4.aByteArray14 == null || this.anInt758 > arg4.aByteArray14.length) {
				arg1.aByteArray14 = arg4.aByteArray14 = new byte[this.anInt758];
			} else {
				arg1.aByteArray14 = arg4.aByteArray14;
			}
			for (local252 = 0; local252 < this.anInt758; local252++) {
				arg1.aByteArray14[local252] = this.aByteArray14[local252];
			}
		} else {
			arg1.aByteArray14 = this.aByteArray14;
		}
		if (Static226.method3581(arg0, this.anInt764)) {
			arg1.aClass207_1 = arg4.aClass207_1;
			if (arg3) {
				arg1.aByte16 = (byte) (arg1.aByte16 | 0x2);
			}
			arg1.aClass207_1.aByte78 = this.aClass207_1.aByte78;
			arg1.aClass207_1.anInterface17_4 = this.aClass207_1.anInterface17_4;
		} else if (Static469.method6633(arg0, this.anInt764)) {
			arg1.aClass207_1 = this.aClass207_1;
		} else {
			arg1.aClass207_1 = null;
		}
		@Pc(694) int local694;
		if (Static648.method8947(arg0, this.anInt764)) {
			if (arg4.aShortArray15 == null || arg4.aShortArray15.length < this.anInt773) {
				local252 = this.anInt773;
				arg1.aShortArray15 = arg4.aShortArray15 = new short[local252];
				arg1.aShortArray17 = arg4.aShortArray17 = new short[local252];
				arg1.aShortArray12 = arg4.aShortArray12 = new short[local252];
			} else {
				arg1.aShortArray17 = arg4.aShortArray17;
				arg1.aShortArray15 = arg4.aShortArray15;
				arg1.aShortArray12 = arg4.aShortArray12;
			}
			if (this.aClass123_1 == null) {
				for (local252 = 0; local252 < this.anInt773; local252++) {
					arg1.aShortArray15[local252] = this.aShortArray15[local252];
					arg1.aShortArray17[local252] = this.aShortArray17[local252];
					arg1.aShortArray12[local252] = this.aShortArray12[local252];
				}
			} else {
				if (arg4.aClass123_1 == null) {
					arg4.aClass123_1 = new Class123();
				}
				@Pc(680) Class123 local680 = arg1.aClass123_1 = arg4.aClass123_1;
				if (local680.aShortArray40 == null || local680.aShortArray40.length < this.anInt773) {
					local694 = this.anInt773;
					local680.aShortArray38 = new short[local694];
					local680.aShortArray40 = new short[local694];
					local680.aShortArray39 = new short[local694];
					local680.aByteArray31 = new byte[local694];
				}
				for (local694 = 0; local694 < this.anInt773; local694++) {
					arg1.aShortArray15[local694] = this.aShortArray15[local694];
					arg1.aShortArray17[local694] = this.aShortArray17[local694];
					arg1.aShortArray12[local694] = this.aShortArray12[local694];
					local680.aShortArray40[local694] = this.aClass123_1.aShortArray40[local694];
					local680.aShortArray38[local694] = this.aClass123_1.aShortArray38[local694];
					local680.aShortArray39[local694] = this.aClass123_1.aShortArray39[local694];
					local680.aByteArray31[local694] = this.aClass123_1.aByteArray31[local694];
				}
			}
			arg1.aByteArray13 = this.aByteArray13;
		} else {
			arg1.aByteArray13 = this.aByteArray13;
			arg1.aShortArray15 = this.aShortArray15;
			arg1.aClass123_1 = this.aClass123_1;
			arg1.aShortArray12 = this.aShortArray12;
			arg1.aShortArray17 = this.aShortArray17;
		}
		if (Static80.method1328(arg0, this.anInt764)) {
			if (arg3) {
				arg1.aByte16 = (byte) (arg1.aByte16 | 0x4);
			}
			arg1.aClass207_3 = arg4.aClass207_3;
			arg1.aClass207_3.anInterface17_4 = this.aClass207_3.anInterface17_4;
			arg1.aClass207_3.aByte78 = this.aClass207_3.aByte78;
		} else if (Static457.method6443(this.anInt764, arg0)) {
			arg1.aClass207_3 = this.aClass207_3;
		} else {
			arg1.aClass207_3 = null;
		}
		if (Static294.method4655(arg0, this.anInt764)) {
			if (arg4.aFloatArray2 == null || arg4.aFloatArray2.length < this.anInt758) {
				local252 = this.anInt773;
				arg1.aFloatArray2 = arg4.aFloatArray2 = new float[local252];
				arg1.aFloatArray3 = arg4.aFloatArray3 = new float[local252];
			} else {
				arg1.aFloatArray2 = arg4.aFloatArray2;
				arg1.aFloatArray3 = arg4.aFloatArray3;
			}
			for (local252 = 0; local252 < this.anInt773; local252++) {
				arg1.aFloatArray2[local252] = this.aFloatArray2[local252];
				arg1.aFloatArray3[local252] = this.aFloatArray3[local252];
			}
		} else {
			arg1.aFloatArray3 = this.aFloatArray3;
			arg1.aFloatArray2 = this.aFloatArray2;
		}
		if (Static111.method1653(arg0, this.anInt764)) {
			if (arg3) {
				arg1.aByte16 = (byte) (arg1.aByte16 | 0x8);
			}
			arg1.aClass207_2 = arg4.aClass207_2;
			arg1.aClass207_2.anInterface17_4 = this.aClass207_2.anInterface17_4;
			arg1.aClass207_2.aByte78 = this.aClass207_2.aByte78;
		} else if (Static528.method7230(arg0, this.anInt764)) {
			arg1.aClass207_2 = this.aClass207_2;
		} else {
			arg1.aClass207_2 = null;
		}
		if (Static227.method8064(this.anInt764, arg0)) {
			if (arg4.aShortArray10 == null || arg4.aShortArray10.length < this.anInt758) {
				local252 = this.anInt758;
				arg1.aShortArray11 = arg4.aShortArray11 = new short[local252];
				arg1.aShortArray10 = arg4.aShortArray10 = new short[local252];
				arg1.aShortArray13 = arg4.aShortArray13 = new short[local252];
			} else {
				arg1.aShortArray13 = arg4.aShortArray13;
				arg1.aShortArray10 = arg4.aShortArray10;
				arg1.aShortArray11 = arg4.aShortArray11;
			}
			for (local252 = 0; local252 < this.anInt758; local252++) {
				arg1.aShortArray10[local252] = this.aShortArray10[local252];
				arg1.aShortArray11[local252] = this.aShortArray11[local252];
				arg1.aShortArray13[local252] = this.aShortArray13[local252];
			}
		} else {
			arg1.aShortArray13 = this.aShortArray13;
			arg1.aShortArray11 = this.aShortArray11;
			arg1.aShortArray10 = this.aShortArray10;
		}
		if (Static282.method4540(arg0, this.anInt764)) {
			if (arg3) {
				arg1.aByte16 = (byte) (arg1.aByte16 | 0x10);
			}
			arg1.aClass190_1 = arg4.aClass190_1;
			arg1.aClass190_1.anInterface6_2 = this.aClass190_1.anInterface6_2;
		} else if (Static121.method1820(arg0, this.anInt764)) {
			arg1.aClass190_1 = this.aClass190_1;
		} else {
			arg1.aClass190_1 = null;
		}
		if (Static683.method9225(this.anInt764, arg0)) {
			if (arg4.aShortArray16 == null || arg4.aShortArray16.length < this.anInt758) {
				local252 = this.anInt758;
				arg1.aShortArray16 = arg4.aShortArray16 = new short[local252];
			} else {
				arg1.aShortArray16 = arg4.aShortArray16;
			}
			for (local252 = 0; local252 < this.anInt758; local252++) {
				arg1.aShortArray16[local252] = this.aShortArray16[local252];
			}
		} else {
			arg1.aShortArray16 = this.aShortArray16;
		}
		if (!Static219.method3479(arg0, this.anInt764)) {
			arg1.aClass360Array1 = this.aClass360Array1;
		} else if (arg4.aClass360Array1 == null || arg4.aClass360Array1.length < this.anInt798) {
			local252 = this.anInt798;
			arg1.aClass360Array1 = arg4.aClass360Array1 = new Class360[local252];
			for (local694 = 0; local694 < this.anInt798; local694++) {
				arg1.aClass360Array1[local694] = this.aClass360Array1[local694].method8258();
			}
		} else {
			arg1.aClass360Array1 = arg4.aClass360Array1;
			for (local252 = 0; local252 < this.anInt798; local252++) {
				arg1.aClass360Array1[local252].method8256(this.aClass360Array1[local252]);
			}
		}
		arg1.aShortArray14 = this.aShortArray14;
		arg1.aClass391Array1 = this.aClass391Array1;
		arg1.aClass363Array1 = this.aClass363Array1;
		arg1.aShortArray8 = this.aShortArray8;
		if (this.aBoolean54) {
			arg1.aShort23 = this.aShort23;
			arg1.aShort21 = this.aShort21;
			arg1.aShort22 = this.aShort22;
			arg1.aShort16 = this.aShort16;
			arg1.aShort24 = this.aShort24;
			arg1.aBoolean54 = true;
			arg1.aShort19 = this.aShort19;
			arg1.aShort25 = this.aShort25;
			arg1.aShort18 = this.aShort18;
		} else {
			arg1.aBoolean54 = false;
		}
		arg1.anIntArray56 = this.anIntArray56;
		arg1.anIntArrayArray8 = this.anIntArrayArray8;
		arg1.anIntArray54 = this.anIntArray54;
		arg1.aClass270Array1 = this.aClass270Array1;
		arg1.anIntArrayArray6 = this.anIntArrayArray6;
		arg1.anIntArrayArray7 = this.anIntArrayArray7;
		arg1.aShortArray18 = this.aShortArray18;
		return arg1;
	}

	@OriginalMember(owner = "client!bp", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort17;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		for (@Pc(3) int local3 = 0; local3 < this.anInt758; local3++) {
			local14 = this.aShortArray9[local3] & 0xFFFF;
			@Pc(20) int local20 = local14 >> 10 & 0x3F;
			@Pc(26) int local26 = local14 >> 7 & 0x7;
			@Pc(30) int local30 = local14 & 0x7F;
			if (arg1 != -1) {
				local26 += arg3 * (arg1 - local26) >> 7;
			}
			if (arg0 != -1) {
				local20 += (arg0 - local20) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local30 += (arg2 - local30) * arg3 >> 7;
			}
			this.aShortArray9[local3] = (short) (local20 << 10 | local26 << 7 | local30);
		}
		Static46.anInt749++;
		if (this.aClass391Array1 != null) {
			for (local14 = 0; local14 < this.anInt798; local14++) {
				@Pc(115) Class391 local115 = this.aClass391Array1[local14];
				@Pc(120) Class360 local120 = this.aClass360Array1[local14];
				local120.anInt9705 = Static408.anIntArray407[this.aShortArray9[local115.anInt10770] & 0xFFFF] & 0xFFFFFF | local120.anInt9705 & 0xFF000000;
			}
		}
		if (this.aClass207_1 != null) {
			this.aClass207_1.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean54) {
			this.method844();
		}
		@Pc(18) int local18 = arg4 + this.aShort23;
		@Pc(23) int local23 = arg4 + this.aShort19;
		@Pc(29) int local29 = arg6 + this.aShort16;
		@Pc(34) int local34 = this.aShort24 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || local23 + arg2.anInt8881 >> arg2.anInt8885 >= arg2.anInt8883 || local29 < 0 || arg2.anInt8878 <= arg2.anInt8881 + local34 >> arg2.anInt8885)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || arg3.anInt8883 <= arg3.anInt8881 + local23 >> arg3.anInt8885 || local29 < 0 || arg3.anInt8878 <= arg3.anInt8881 + local34 >> arg3.anInt8885) {
				return;
			}
		} else {
			local18 >>= arg2.anInt8885;
			local23 = arg2.anInt8881 + local23 - 1 >> arg2.anInt8885;
			local29 >>= arg2.anInt8885;
			local34 = arg2.anInt8881 + local34 - 1 >> arg2.anInt8885;
			if (arg5 == arg2.method7620(local29, local18) && arg5 == arg2.method7620(local29, local23) && arg2.method7620(local34, local18) == arg5 && arg5 == arg2.method7620(local34, local23)) {
				return;
			}
		}
		@Pc(261) int local261;
		if (arg0 == 1) {
			for (local261 = 0; local261 < this.anInt778; local261++) {
				this.anIntArray57[local261] -= arg5 - arg2.method7625(this.anIntArray53[local261] + arg4, this.anIntArray58[local261] - -arg6);
			}
		} else {
			@Pc(263) int local263;
			@Pc(272) int local272;
			if (arg0 == 2) {
				@Pc(490) short local490 = this.aShort25;
				if (local490 == 0) {
					return;
				}
				for (local263 = 0; local263 < this.anInt778; local263++) {
					local272 = (this.anIntArray57[local263] << 16) / local490;
					if (arg1 > local272) {
						this.anIntArray57[local263] -= -((arg1 - local272) * (-arg5 + arg2.method7625(this.anIntArray53[local263] + arg4, arg6 + this.anIntArray58[local263])) / arg1);
					}
				}
			} else {
				@Pc(280) int local280;
				if (arg0 == 3) {
					local261 = (arg1 & 0xFF) * 4;
					local263 = (arg1 >> 8 & 0xFF) * 4;
					local272 = (arg1 >> 16 & 0xFF) << 6;
					local280 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local261 >> 1) < 0 || arg2.anInt8883 << arg2.anInt8885 <= (local261 >> 1) + arg4 + arg2.anInt8881 || arg6 - (local263 >> 1) < 0 || (local263 >> 1) + arg6 + arg2.anInt8881 >= arg2.anInt8878 << arg2.anInt8885) {
						return;
					}
					this.method8862(local280, local261, arg4, local272, arg5, arg6, local263, arg2);
				} else if (arg0 == 4) {
					local261 = this.aShort22 - this.aShort25;
					for (local263 = 0; local263 < this.anInt778; local263++) {
						this.anIntArray57[local263] = local261 + this.anIntArray57[local263] + arg3.method7625(this.anIntArray53[local263] + arg4, arg6 + this.anIntArray58[local263]) - arg5;
					}
				} else if (arg0 == 5) {
					local261 = this.aShort22 - this.aShort25;
					for (local263 = 0; local263 < this.anInt778; local263++) {
						local272 = arg4 + this.anIntArray53[local263];
						local280 = this.anIntArray58[local263] + arg6;
						@Pc(286) int local286 = arg2.method7625(local272, local280);
						@Pc(292) int local292 = arg3.method7625(local272, local280);
						@Pc(299) int local299 = local286 - local292 - arg1;
						this.anIntArray57[local263] = local286 + ((this.anIntArray57[local263] << 8) / local261 * local299 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean54 = false;
		if (this.aClass207_4 != null) {
			this.aClass207_4.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(62) int local62;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(40) int local40;
		@Pc(56) int local56;
		@Pc(54) int[] local54;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			local22 = arg4 << 4;
			local24 = 0;
			Static507.anInt10611 = 0;
			Static432.anInt7144 = 0;
			Static34.anInt511 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (this.anIntArrayArray8.length > local40) {
					local54 = this.anIntArrayArray8[local40];
					for (local56 = 0; local56 < local54.length; local56++) {
						local62 = local54[local56];
						Static507.anInt10611 += this.anIntArray53[local62];
						Static34.anInt511 += this.anIntArray57[local62];
						local24++;
						Static432.anInt7144 += this.anIntArray58[local62];
					}
				}
			}
			if (local24 <= 0) {
				Static34.anInt511 = local14;
				Static507.anInt10611 = local18;
				Static432.anInt7144 = local22;
			} else {
				Static507.anInt10611 = Static507.anInt10611 / local24 + local18;
				Static432.anInt7144 = local22 + Static432.anInt7144 / local24;
				Static34.anInt511 = Static34.anInt511 / local24 + local14;
			}
			return;
		}
		@Pc(175) int[] local175;
		@Pc(177) int local177;
		if (arg0 == 1) {
			local22 = arg4 << 4;
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray8.length > local32) {
					local175 = this.anIntArrayArray8[local32];
					for (local177 = 0; local177 < local175.length; local177++) {
						local56 = local175[local177];
						this.anIntArray53[local56] += local18;
						this.anIntArray57[local56] += local14;
						this.anIntArray58[local56] += local22;
					}
				}
			}
			return;
		}
		@Pc(289) int local289;
		@Pc(308) int local308;
		@Pc(772) int local772;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray8.length) {
					local175 = this.anIntArrayArray8[local32];
					if ((arg5 & 0x1) == 0) {
						for (local177 = 0; local177 < local175.length; local177++) {
							local56 = local175[local177];
							this.anIntArray53[local56] -= Static507.anInt10611;
							this.anIntArray57[local56] -= Static34.anInt511;
							this.anIntArray58[local56] -= Static432.anInt7144;
							if (arg4 != 0) {
								local62 = Class42.anIntArray51[arg4];
								local289 = Class42.anIntArray52[arg4];
								local308 = local289 * this.anIntArray53[local56] + local62 * this.anIntArray57[local56] + 16383 >> 14;
								this.anIntArray57[local56] = this.anIntArray57[local56] * local289 + 16383 - this.anIntArray53[local56] * local62 >> 14;
								this.anIntArray53[local56] = local308;
							}
							if (arg2 != 0) {
								local62 = Class42.anIntArray51[arg2];
								local289 = Class42.anIntArray52[arg2];
								local308 = this.anIntArray57[local56] * local289 + 16383 - this.anIntArray58[local56] * local62 >> 14;
								this.anIntArray58[local56] = this.anIntArray57[local56] * local62 + this.anIntArray58[local56] * local289 + 16383 >> 14;
								this.anIntArray57[local56] = local308;
							}
							if (arg3 != 0) {
								local62 = Class42.anIntArray51[arg3];
								local289 = Class42.anIntArray52[arg3];
								local308 = this.anIntArray58[local56] * local62 + this.anIntArray53[local56] * local289 + 16383 >> 14;
								this.anIntArray58[local56] = this.anIntArray58[local56] * local289 + 16383 - this.anIntArray53[local56] * local62 >> 14;
								this.anIntArray53[local56] = local308;
							}
							this.anIntArray53[local56] += Static507.anInt10611;
							this.anIntArray57[local56] += Static34.anInt511;
							this.anIntArray58[local56] += Static432.anInt7144;
						}
					} else {
						for (local177 = 0; local177 < local175.length; local177++) {
							local56 = local175[local177];
							this.anIntArray53[local56] -= Static507.anInt10611;
							this.anIntArray57[local56] -= Static34.anInt511;
							this.anIntArray58[local56] -= Static432.anInt7144;
							if (arg2 != 0) {
								local62 = Class42.anIntArray51[arg2];
								local289 = Class42.anIntArray52[arg2];
								local308 = local289 * this.anIntArray57[local56] + 16383 - this.anIntArray58[local56] * local62 >> 14;
								this.anIntArray58[local56] = local289 * this.anIntArray58[local56] + local62 * this.anIntArray57[local56] + 16383 >> 14;
								this.anIntArray57[local56] = local308;
							}
							if (arg4 != 0) {
								local62 = Class42.anIntArray51[arg4];
								local289 = Class42.anIntArray52[arg4];
								local308 = local289 * this.anIntArray53[local56] + local62 * this.anIntArray57[local56] + 16383 >> 14;
								this.anIntArray57[local56] = local289 * this.anIntArray57[local56] + 16383 - local62 * this.anIntArray53[local56] >> 14;
								this.anIntArray53[local56] = local308;
							}
							if (arg3 != 0) {
								local62 = Class42.anIntArray51[arg3];
								local289 = Class42.anIntArray52[arg3];
								local308 = local62 * this.anIntArray58[local56] + this.anIntArray53[local56] * local289 + 16383 >> 14;
								this.anIntArray58[local56] = this.anIntArray58[local56] * local289 + 16383 - this.anIntArray53[local56] * local62 >> 14;
								this.anIntArray53[local56] = local308;
							}
							this.anIntArray53[local56] += Static507.anInt10611;
							this.anIntArray57[local56] += Static34.anInt511;
							this.anIntArray58[local56] += Static432.anInt7144;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local40 = arg1[local32];
					if (local40 < this.anIntArrayArray8.length) {
						local54 = this.anIntArrayArray8[local40];
						for (local56 = 0; local56 < local54.length; local56++) {
							local62 = local54[local56];
							local289 = this.anIntArray56[local62];
							local308 = this.anIntArray56[local62 + 1];
							for (local772 = local289; local772 < local308; local772++) {
								@Pc(781) int local781 = this.aShortArray18[local772] - 1;
								if (local781 == -1) {
									break;
								}
								@Pc(796) int local796;
								@Pc(800) int local800;
								@Pc(819) int local819;
								if (arg4 != 0) {
									local796 = Class42.anIntArray51[arg4];
									local800 = Class42.anIntArray52[arg4];
									local819 = local796 * this.aShortArray17[local781] + local800 * this.aShortArray15[local781] + 16383 >> 14;
									this.aShortArray17[local781] = (short) (local800 * this.aShortArray17[local781] + 16383 - this.aShortArray15[local781] * local796 >> 14);
									this.aShortArray15[local781] = (short) local819;
								}
								if (arg2 != 0) {
									local796 = Class42.anIntArray51[arg2];
									local800 = Class42.anIntArray52[arg2];
									local819 = this.aShortArray17[local781] * local800 + 16383 - local796 * this.aShortArray12[local781] >> 14;
									this.aShortArray12[local781] = (short) (this.aShortArray17[local781] * local796 + local800 * this.aShortArray12[local781] + 16383 >> 14);
									this.aShortArray17[local781] = (short) local819;
								}
								if (arg3 != 0) {
									local796 = Class42.anIntArray51[arg3];
									local800 = Class42.anIntArray52[arg3];
									local819 = local796 * this.aShortArray12[local781] + local800 * this.aShortArray15[local781] + 16383 >> 14;
									this.aShortArray12[local781] = (short) (local800 * this.aShortArray12[local781] + 16383 - this.aShortArray15[local781] * local796 >> 14);
									this.aShortArray15[local781] = (short) local819;
								}
							}
						}
					}
				}
				if (this.aClass207_3 == null && this.aClass207_1 != null) {
					this.aClass207_1.anInterface17_4 = null;
				}
				if (this.aClass207_3 != null) {
					this.aClass207_3.anInterface17_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray8.length > local32) {
					local175 = this.anIntArrayArray8[local32];
					for (local177 = 0; local177 < local175.length; local177++) {
						local56 = local175[local177];
						this.anIntArray53[local56] -= Static507.anInt10611;
						this.anIntArray57[local56] -= Static34.anInt511;
						this.anIntArray58[local56] -= Static432.anInt7144;
						this.anIntArray53[local56] = this.anIntArray53[local56] * arg2 >> 7;
						this.anIntArray57[local56] = this.anIntArray57[local56] * arg3 >> 7;
						this.anIntArray58[local56] = this.anIntArray58[local56] * arg4 >> 7;
						this.anIntArray53[local56] += Static507.anInt10611;
						this.anIntArray57[local56] += Static34.anInt511;
						this.anIntArray58[local56] += Static432.anInt7144;
					}
				}
			}
		} else {
			@Pc(1266) Class391 local1266;
			@Pc(1271) Class360 local1271;
			if (arg0 == 5) {
				if (this.anIntArrayArray6 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray6.length) {
							local175 = this.anIntArrayArray6[local32];
							for (local177 = 0; local177 < local175.length; local177++) {
								local56 = local175[local177];
								local62 = (this.aByteArray14[local56] & 0xFF) + arg2 * 8;
								if (local62 < 0) {
									local62 = 0;
								} else if (local62 > 255) {
									local62 = 255;
								}
								this.aByteArray14[local56] = (byte) local62;
							}
							if (local175.length > 0 && this.aClass207_1 != null) {
								this.aClass207_1.anInterface17_4 = null;
							}
						}
					}
					if (this.aClass391Array1 != null) {
						for (local32 = 0; local32 < this.anInt798; local32++) {
							local1266 = this.aClass391Array1[local32];
							local1271 = this.aClass360Array1[local32];
							local1271.anInt9705 = local1271.anInt9705 & 0xFFFFFF | 255 - (this.aByteArray14[local1266.anInt10770] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1541) Class360 local1541;
				if (arg0 == 8) {
					if (this.anIntArrayArray7 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray7.length > local32) {
								local175 = this.anIntArrayArray7[local32];
								for (local177 = 0; local177 < local175.length; local177++) {
									local1541 = this.aClass360Array1[local175[local177]];
									local1541.anInt9703 += arg2;
									local1541.anInt9696 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray7 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray7.length) {
								local175 = this.anIntArrayArray7[local32];
								for (local177 = 0; local177 < local175.length; local177++) {
									local1541 = this.aClass360Array1[local175[local177]];
									local1541.anInt9698 = arg3 * local1541.anInt9698 >> 7;
									local1541.anInt9699 = local1541.anInt9699 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray7 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray7.length) {
							local175 = this.anIntArrayArray7[local32];
							for (local177 = 0; local177 < local175.length; local177++) {
								local1541 = this.aClass360Array1[local175[local177]];
								local1541.anInt9701 = local1541.anInt9701 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray6 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray6.length > local32) {
						local175 = this.anIntArrayArray6[local32];
						for (local177 = 0; local177 < local175.length; local177++) {
							local56 = local175[local177];
							local62 = this.aShortArray9[local56] & 0xFFFF;
							local289 = local62 >> 10 & 0x3F;
							local308 = local62 >> 7 & 0x7;
							@Pc(1363) int local1363 = local289 + arg2 & 0x3F;
							local772 = local62 & 0x7F;
							local308 += arg3 / 4;
							local772 += arg4;
							if (local308 < 0) {
								local308 = 0;
							} else if (local308 > 7) {
								local308 = 7;
							}
							if (local772 < 0) {
								local772 = 0;
							} else if (local772 > 127) {
								local772 = 127;
							}
							this.aShortArray9[local56] = (short) (local772 | local308 << 7 | local1363 << 10);
						}
						if (local175.length > 0 && this.aClass207_1 != null) {
							this.aClass207_1.anInterface17_4 = null;
						}
					}
				}
				if (this.aClass391Array1 != null) {
					for (local32 = 0; local32 < this.anInt798; local32++) {
						local1266 = this.aClass391Array1[local32];
						local1271 = this.aClass360Array1[local32];
						local1271.anInt9705 = Static408.anIntArray407[this.aShortArray9[local1266.anInt10770] & 0xFFFF] & 0xFFFFFF | local1271.anInt9705 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILclient!sj;ZII)Z")
	@Override
	public boolean method8844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method845(arg5, arg1, arg2, arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIBIIIII)Z")
	private boolean method850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg4 && arg3 < arg2 && arg1 > arg3) {
			return false;
		} else if (arg4 < arg3 && arg3 > arg2 && arg1 < arg3) {
			return false;
		} else if (arg7 > arg6 && arg6 < arg0 && arg6 < arg5) {
			return false;
		} else {
			return arg6 <= arg7 || arg6 <= arg0 || arg5 >= arg6;
		}
	}

	@OriginalMember(owner = "client!bp", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt778; local7++) {
			if (arg0 != 0) {
				this.anIntArray53[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray57[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray58[local7] += arg2;
			}
		}
		this.aBoolean54 = false;
		if (this.aClass207_4 != null) {
			this.aClass207_4.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray8 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt775; local13++) {
			this.anIntArray53[local13] <<= 0x4;
			this.anIntArray57[local13] <<= 0x4;
			this.anIntArray58[local13] <<= 0x4;
		}
		Static432.anInt7144 = 0;
		Static34.anInt511 = 0;
		Static507.anInt10611 = 0;
		return true;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class42.anIntArray51[arg0];
		@Pc(13) int local13 = Class42.anIntArray52[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt778; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray58[local15] + local13 * this.anIntArray53[local15] >> 14;
			this.anIntArray58[local15] = this.anIntArray58[local15] * local13 - local9 * this.anIntArray53[local15] >> 14;
			this.anIntArray53[local15] = local33;
		}
		if (this.aClass207_4 != null) {
			this.aClass207_4.anInterface17_4 = null;
		}
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!bp", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt796;
	}

	@OriginalMember(owner = "client!bp", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static34.anInt511 = 0;
			local11 = 0;
			Static432.anInt7144 = 0;
			Static507.anInt10611 = 0;
			for (local17 = 0; local17 < this.anInt778; local17++) {
				Static507.anInt10611 += this.anIntArray53[local17];
				Static34.anInt511 += this.anIntArray57[local17];
				local11++;
				Static432.anInt7144 += this.anIntArray58[local17];
			}
			if (local11 > 0) {
				Static507.anInt10611 = Static507.anInt10611 / local11 + arg1;
				Static432.anInt7144 = Static432.anInt7144 / local11 + arg3;
				Static34.anInt511 = Static34.anInt511 / local11 + arg2;
			} else {
				Static432.anInt7144 = arg3;
				Static507.anInt10611 = arg1;
				Static34.anInt511 = arg2;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt778; local11++) {
				this.anIntArray53[local11] += arg1;
				this.anIntArray57[local11] += arg2;
				this.anIntArray58[local11] += arg3;
			}
		} else {
			@Pc(179) int local179;
			@Pc(197) int local197;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt778; local11++) {
					this.anIntArray53[local11] -= Static507.anInt10611;
					this.anIntArray57[local11] -= Static34.anInt511;
					this.anIntArray58[local11] -= Static432.anInt7144;
					if (arg3 != 0) {
						local17 = Class42.anIntArray51[arg3];
						local179 = Class42.anIntArray52[arg3];
						local197 = this.anIntArray53[local11] * local179 + this.anIntArray57[local11] * local17 + 16383 >> 14;
						this.anIntArray57[local11] = this.anIntArray57[local11] * local179 + 16383 - this.anIntArray53[local11] * local17 >> 14;
						this.anIntArray53[local11] = local197;
					}
					if (arg1 != 0) {
						local17 = Class42.anIntArray51[arg1];
						local179 = Class42.anIntArray52[arg1];
						local197 = local179 * this.anIntArray57[local11] + 16383 - this.anIntArray58[local11] * local17 >> 14;
						this.anIntArray58[local11] = local179 * this.anIntArray58[local11] + this.anIntArray57[local11] * local17 + 16383 >> 14;
						this.anIntArray57[local11] = local197;
					}
					if (arg2 != 0) {
						local17 = Class42.anIntArray51[arg2];
						local179 = Class42.anIntArray52[arg2];
						local197 = this.anIntArray58[local11] * local17 + local179 * this.anIntArray53[local11] + 16383 >> 14;
						this.anIntArray58[local11] = local179 * this.anIntArray58[local11] + 16383 - this.anIntArray53[local11] * local17 >> 14;
						this.anIntArray53[local11] = local197;
					}
					this.anIntArray53[local11] += Static507.anInt10611;
					this.anIntArray57[local11] += Static34.anInt511;
					this.anIntArray58[local11] += Static432.anInt7144;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt778; local11++) {
					this.anIntArray53[local11] -= Static507.anInt10611;
					this.anIntArray57[local11] -= Static34.anInt511;
					this.anIntArray58[local11] -= Static432.anInt7144;
					this.anIntArray53[local11] = this.anIntArray53[local11] * arg1 / 128;
					this.anIntArray57[local11] = this.anIntArray57[local11] * arg2 / 128;
					this.anIntArray58[local11] = arg3 * this.anIntArray58[local11] / 128;
					this.anIntArray53[local11] += Static507.anInt10611;
					this.anIntArray57[local11] += Static34.anInt511;
					this.anIntArray58[local11] += Static432.anInt7144;
				}
			} else {
				@Pc(549) Class391 local549;
				@Pc(554) Class360 local554;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt758; local11++) {
						local17 = (this.aByteArray14[local11] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray14[local11] = (byte) local17;
					}
					if (this.aClass207_1 != null) {
						this.aClass207_1.anInterface17_4 = null;
					}
					if (this.aClass391Array1 != null) {
						for (local17 = 0; local17 < this.anInt798; local17++) {
							local549 = this.aClass391Array1[local17];
							local554 = this.aClass360Array1[local17];
							local554.anInt9705 = 255 - (this.aByteArray14[local549.anInt10770] & 0xFF) << 24 | local554.anInt9705 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt758; local11++) {
						local17 = this.aShortArray9[local11] & 0xFFFF;
						local179 = local17 >> 10 & 0x3F;
						local197 = local17 >> 7 & 0x7;
						@Pc(612) int local612 = local17 & 0x7F;
						@Pc(618) int local618 = local179 + arg1 & 0x3F;
						local197 += arg2 / 4;
						if (local197 < 0) {
							local197 = 0;
						} else if (local197 > 7) {
							local197 = 7;
						}
						local612 += arg3;
						if (local612 < 0) {
							local612 = 0;
						} else if (local612 > 127) {
							local612 = 127;
						}
						this.aShortArray9[local11] = (short) (local612 | local197 << 7 | local618 << 10);
					}
					if (this.aClass207_1 != null) {
						this.aClass207_1.anInterface17_4 = null;
					}
					if (this.aClass391Array1 != null) {
						for (local17 = 0; local17 < this.anInt798; local17++) {
							local549 = this.aClass391Array1[local17];
							local554 = this.aClass360Array1[local17];
							local554.anInt9705 = Static408.anIntArray407[this.aShortArray9[local549.anInt10770] & 0xFFFF] & 0xFFFFFF | local554.anInt9705 & 0xFF000000;
						}
					}
				} else {
					@Pc(751) Class360 local751;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt798; local11++) {
							local751 = this.aClass360Array1[local11];
							local751.anInt9703 += arg1;
							local751.anInt9696 += arg2;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt798; local11++) {
							local751 = this.aClass360Array1[local11];
							local751.anInt9698 = local751.anInt9698 * arg2 >> 7;
							local751.anInt9699 = local751.anInt9699 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt798; local11++) {
							local751 = this.aClass360Array1[local11];
							local751.anInt9701 = arg1 + local751.anInt9701 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BSIII)I")
	private int method851(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(20) int local20 = Static408.anIntArray407[Static84.method1346(arg3, arg2)];
		if (arg1 != -1) {
			@Pc(33) Class44 local33 = this.aClass100_Sub3_6.anInterface7_12.method7423(arg1 & 0xFFFF);
			@Pc(38) int local38 = local33.aByte17 & 0xFF;
			@Pc(54) int local54;
			@Pc(80) int local80;
			if (local38 != 0) {
				if (arg2 < 0) {
					local54 = 0;
				} else if (arg2 > 127) {
					local54 = 16777215;
				} else {
					local54 = arg2 * 131586;
				}
				if (local38 == 256) {
					local20 = local54;
				} else {
					local80 = 256 - local38;
					local20 = (local80 * (local20 & 0xFF00FF) + (local54 & 0xFF00FF) * local38 & 0xFF00FF00) + ((local20 & 0xFF00) * local80 + (local54 & 0xFF00) * local38 & 0xFF0000) >> 8;
				}
			}
			local54 = local33.aByte22 & 0xFF;
			if (local54 != 0) {
				local54 += 256;
				@Pc(126) int local126 = local54 * (local20 >> 16 & 0xFF);
				if (local126 > 65535) {
					local126 = 65535;
				}
				local80 = local54 * (local20 >> 8 & 0xFF);
				if (local80 > 65535) {
					local80 = 65535;
				}
				@Pc(154) int local154 = (local20 & 0xFF) * local54;
				if (local154 > 65535) {
					local154 = 65535;
				}
				local20 = (local126 << 8 & 0xFF00F7) + (local80 & 0xFF00) + (local154 >> 8);
			}
		}
		return (local20 << 8) - ((arg0 & 0xFF) - 255);
	}

	@OriginalMember(owner = "client!bp", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean54) {
			this.method844();
		}
		return this.aShort19;
	}

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt778; local3++) {
			this.anIntArray58[local3] = -this.anIntArray58[local3];
		}
		for (@Pc(31) int local31 = 0; local31 < this.anInt773; local31++) {
			this.aShortArray12[local31] = (short) -this.aShortArray12[local31];
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt758; local54++) {
			@Pc(65) short local65 = this.aShortArray10[local54];
			this.aShortArray10[local54] = this.aShortArray13[local54];
			this.aShortArray13[local54] = local65;
		}
		if (this.aClass207_3 == null && this.aClass207_1 != null) {
			this.aClass207_1.anInterface17_4 = null;
		}
		if (this.aClass207_3 != null) {
			this.aClass207_3.anInterface17_4 = null;
		}
		this.aBoolean54 = false;
		if (this.aClass190_1 != null) {
			this.aClass190_1.anInterface6_2 = null;
		}
		if (this.aClass207_4 != null) {
			this.aClass207_4.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean54) {
			this.method844();
		}
		return this.aShort25;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class43 method8840(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(30) Class43_Sub1 local30;
		@Pc(26) Class43_Sub1 local26;
		if (arg0 == 1) {
			local26 = this.aClass100_Sub3_6.aClass43_Sub1_6;
			local30 = this.aClass100_Sub3_6.aClass43_Sub1_7;
		} else if (arg0 == 2) {
			local30 = this.aClass100_Sub3_6.aClass43_Sub1_9;
			local26 = this.aClass100_Sub3_6.aClass43_Sub1_2;
		} else if (arg0 == 3) {
			local26 = this.aClass100_Sub3_6.aClass43_Sub1_3;
			local30 = this.aClass100_Sub3_6.aClass43_Sub1_4;
		} else if (arg0 == 4) {
			local30 = this.aClass100_Sub3_6.aClass43_Sub1_10;
			local26 = this.aClass100_Sub3_6.aClass43_Sub1_1;
		} else if (arg0 == 5) {
			local30 = this.aClass100_Sub3_6.aClass43_Sub1_8;
			local26 = this.aClass100_Sub3_6.aClass43_Sub1_5;
		} else {
			local30 = local26 = new Class43_Sub1(this.aClass100_Sub3_6);
		}
		return this.method849(arg1, local30, arg2, arg0 != 0, local26);
	}

	@OriginalMember(owner = "client!bp", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean54) {
			this.method844();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean55;
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
	private void method852() {
		if (this.anInt740 == 0) {
			return;
		}
		if (this.aByte16 != 0) {
			this.method838(true);
		}
		this.method838(false);
		if (this.aClass190_1 != null) {
			if (this.aClass190_1.anInterface6_2 == null) {
				this.method843((this.aByte16 & 0x10) != 0);
			}
			if (this.aClass190_1.anInterface6_2 != null) {
				this.aClass100_Sub3_6.method8720(this.aClass207_3 != null);
				this.aClass100_Sub3_6.method8727(this.aClass207_1, this.aClass207_2, this.aClass207_4, this.aClass207_3);
				@Pc(89) int local89 = this.anIntArray54.length - 1;
				for (@Pc(91) int local91 = 0; local91 < local89; local91++) {
					@Pc(98) int local98 = this.anIntArray54[local91];
					@Pc(105) int local105 = this.anIntArray54[local91 + 1];
					@Pc(112) int local112 = this.aShortArray16[local98] & 0xFFFF;
					if (local112 == 65535) {
						local112 = -1;
					}
					this.aClass100_Sub3_6.method8750(local112, this.aClass207_3 != null);
					this.aClass100_Sub3_6.method8707(this.aClass190_1.anInterface6_2, local98 * 3, (local105 - local98) * 3);
				}
			}
		}
		this.method840();
	}

	@OriginalMember(owner = "client!bp", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class5_Sub1_Sub15 ba(@OriginalArg(0) Class5_Sub1_Sub15 arg0) {
		if (this.anInt773 == 0) {
			return null;
		}
		if (!this.aBoolean54) {
			this.method844();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass100_Sub3_6.anInt10287 > 0) {
			local43 = this.aShort23 - (this.aClass100_Sub3_6.anInt10287 * this.aShort22 >> 8) >> this.aClass100_Sub3_6.anInt10256;
			local60 = this.aShort19 - (this.aShort25 * this.aClass100_Sub3_6.anInt10287 >> 8) >> this.aClass100_Sub3_6.anInt10256;
		} else {
			local43 = this.aShort23 - (this.aShort25 * this.aClass100_Sub3_6.anInt10287 >> 8) >> this.aClass100_Sub3_6.anInt10256;
			local60 = this.aShort19 - (this.aShort22 * this.aClass100_Sub3_6.anInt10287 >> 8) >> this.aClass100_Sub3_6.anInt10256;
		}
		@Pc(120) int local120;
		@Pc(136) int local136;
		if (this.aClass100_Sub3_6.anInt10290 > 0) {
			local120 = this.aShort16 - (this.aClass100_Sub3_6.anInt10290 * this.aShort22 >> 8) >> this.aClass100_Sub3_6.anInt10256;
			local136 = this.aShort24 - (this.aShort25 * this.aClass100_Sub3_6.anInt10290 >> 8) >> this.aClass100_Sub3_6.anInt10256;
		} else {
			local120 = this.aShort16 - (this.aClass100_Sub3_6.anInt10290 * this.aShort25 >> 8) >> this.aClass100_Sub3_6.anInt10256;
			local136 = this.aShort24 - (this.aClass100_Sub3_6.anInt10290 * this.aShort22 >> 8) >> this.aClass100_Sub3_6.anInt10256;
		}
		@Pc(177) int local177 = local60 + 1 - local43;
		@Pc(183) int local183 = local136 + 1 - local120;
		@Pc(186) Class5_Sub1_Sub15_Sub1 local186 = (Class5_Sub1_Sub15_Sub1) arg0;
		@Pc(198) Class5_Sub1_Sub15_Sub1 local198;
		if (local186 != null && local186.method6260(local177, local183)) {
			local198 = local186;
			local186.method6262();
		} else {
			local198 = new Class5_Sub1_Sub15_Sub1(this.aClass100_Sub3_6, local177, local183);
		}
		local198.method6259(local120, local43, local60, local136);
		this.method839(local198);
		return local198;
	}

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class42.anIntArray51[arg0];
		@Pc(13) int local13 = Class42.anIntArray52[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt778; local15++) {
			local33 = this.anIntArray53[local15] * local13 + this.anIntArray58[local15] * local9 >> 14;
			this.anIntArray58[local15] = this.anIntArray58[local15] * local13 - local9 * this.anIntArray53[local15] >> 14;
			this.anIntArray53[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt773; local33++) {
			@Pc(91) int local91 = this.aShortArray12[local33] * local9 + local13 * this.aShortArray15[local33] >> 14;
			this.aShortArray12[local33] = (short) (local13 * this.aShortArray12[local33] - local9 * this.aShortArray15[local33] >> 14);
			this.aShortArray15[local33] = (short) local91;
		}
		if (this.aClass207_3 == null && this.aClass207_1 != null) {
			this.aClass207_1.anInterface17_4 = null;
		}
		if (this.aClass207_3 != null) {
			this.aClass207_3.anInterface17_4 = null;
		}
		this.aBoolean54 = false;
		if (this.aClass207_4 != null) {
			this.aClass207_4.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class42.anIntArray51[arg0];
		@Pc(13) int local13 = Class42.anIntArray52[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt778; local15++) {
			@Pc(35) int local35 = this.anIntArray57[local15] * local13 - local9 * this.anIntArray58[local15] >> 14;
			this.anIntArray58[local15] = local9 * this.anIntArray57[local15] + this.anIntArray58[local15] * local13 >> 14;
			this.anIntArray57[local15] = local35;
		}
		this.aBoolean54 = false;
		if (this.aClass207_4 != null) {
			this.aClass207_4.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt758; local3++) {
			if (this.aShortArray9[local3] == arg0) {
				this.aShortArray9[local3] = arg1;
			}
		}
		if (this.aClass391Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt798; local38++) {
				@Pc(45) Class391 local45 = this.aClass391Array1[local38];
				@Pc(50) Class360 local50 = this.aClass360Array1[local38];
				local50.anInt9705 = local50.anInt9705 & 0xFF000000 | Static408.anIntArray407[this.aShortArray9[local45.anInt10770] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass207_1 != null) {
			this.aClass207_1.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILclient!sj;ZI)Z")
	@Override
	public boolean method8852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method845(-1, arg1, arg2, arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!bp", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort17 = (short) arg0;
		if (this.aClass207_1 != null) {
			this.aClass207_1.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean54) {
			this.method844();
		}
		return this.aShort22;
	}
}
