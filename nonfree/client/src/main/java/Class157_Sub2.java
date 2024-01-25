import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class157_Sub2 extends Class157 {

	@OriginalMember(owner = "client!iha", name = "Nb", descriptor = "I")
	private int anInt4928;

	@OriginalMember(owner = "client!iha", name = "cc", descriptor = "I")
	private int anInt4941;

	@OriginalMember(owner = "client!iha", name = "Sb", descriptor = "Z")
	private boolean aBoolean428;

	@OriginalMember(owner = "client!iha", name = "Hc", descriptor = "I")
	private int anInt4950;

	@OriginalMember(owner = "client!iha", name = "v", descriptor = "I")
	private int anInt4955;

	@OriginalMember(owner = "client!iha", name = "Fc", descriptor = "I")
	private int anInt4956;

	@OriginalMember(owner = "client!iha", name = "O", descriptor = "Lclient!eu;")
	private Class103 aClass103_1;

	@OriginalMember(owner = "client!iha", name = "Wb", descriptor = "I")
	private int anInt4968;

	@OriginalMember(owner = "client!iha", name = "E", descriptor = "Lclient!qs;")
	private Class311 aClass311_1;

	@OriginalMember(owner = "client!iha", name = "Y", descriptor = "I")
	private int anInt4972;

	@OriginalMember(owner = "client!iha", name = "wc", descriptor = "Lclient!uq;")
	private Class376 aClass376_1;

	@OriginalMember(owner = "client!iha", name = "Kb", descriptor = "Lclient!uq;")
	private Class376 aClass376_2;

	@OriginalMember(owner = "client!iha", name = "ec", descriptor = "Z")
	private boolean aBoolean431;

	@OriginalMember(owner = "client!iha", name = "p", descriptor = "I")
	private int anInt4985;

	@OriginalMember(owner = "client!iha", name = "y", descriptor = "I")
	private int anInt4986;

	@OriginalMember(owner = "client!iha", name = "xc", descriptor = "Lclient!uq;")
	private Class376 aClass376_3;

	@OriginalMember(owner = "client!iha", name = "Cc", descriptor = "Lclient!nb;")
	private final Class67_Sub1 aClass67_Sub1_7;

	@OriginalMember(owner = "client!iha", name = "kc", descriptor = "I")
	private int anInt4995;

	@OriginalMember(owner = "client!iha", name = "jc", descriptor = "Lclient!uq;")
	private Class376 aClass376_4;

	@OriginalMember(owner = "client!iha", name = "J", descriptor = "I")
	private int anInt5003;

	@OriginalMember(owner = "client!iha", name = "eb", descriptor = "Z")
	private boolean aBoolean433;

	@OriginalMember(owner = "client!iha", name = "K", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!iha", name = "s", descriptor = "I")
	private int anInt5004;

	@OriginalMember(owner = "client!iha", name = "ub", descriptor = "I")
	private int anInt4935;

	@OriginalMember(owner = "client!iha", name = "Gb", descriptor = "Z")
	private boolean aBoolean429;

	@OriginalMember(owner = "client!iha", name = "vc", descriptor = "Z")
	private boolean aBoolean430;

	@OriginalMember(owner = "client!iha", name = "Bb", descriptor = "I")
	private int anInt4961;

	@OriginalMember(owner = "client!iha", name = "Vb", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!iha", name = "x", descriptor = "I")
	private int anInt4924;

	@OriginalMember(owner = "client!iha", name = "wb", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!iha", name = "Cb", descriptor = "[I")
	private int[] anIntArray281;

	@OriginalMember(owner = "client!iha", name = "Zb", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!iha", name = "w", descriptor = "[Lclient!hl;")
	private Class156[] aClass156Array3;

	@OriginalMember(owner = "client!iha", name = "xb", descriptor = "[Lclient!sw;")
	private Class348[] aClass348Array3;

	@OriginalMember(owner = "client!iha", name = "Db", descriptor = "I")
	private int anInt4937;

	@OriginalMember(owner = "client!iha", name = "fc", descriptor = "[Lclient!gs;")
	private Class139[] aClass139Array1;

	@OriginalMember(owner = "client!iha", name = "Ib", descriptor = "[Lclient!kda;")
	private Class200[] aClass200Array1;

	@OriginalMember(owner = "client!iha", name = "D", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!iha", name = "hb", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!iha", name = "Dc", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!iha", name = "Lc", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!iha", name = "r", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!iha", name = "fb", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!iha", name = "rb", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!iha", name = "Fb", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!iha", name = "Rb", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!iha", name = "lc", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!iha", name = "uc", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!iha", name = "jb", descriptor = "[F")
	private float[] aFloatArray48;

	@OriginalMember(owner = "client!iha", name = "bb", descriptor = "[F")
	private float[] aFloatArray47;

	@OriginalMember(owner = "client!iha", name = "V", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!iha", name = "kb", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!iha", name = "vb", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!iha", name = "tc", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!iha", name = "Z", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!iha", name = "M", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!iha", name = "U", descriptor = "[I")
	private int[] anIntArray279;

	@OriginalMember(owner = "client!iha", name = "Yb", descriptor = "[I")
	private int[] anIntArray284;

	@OriginalMember(owner = "client!iha", name = "zc", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!iha", name = "mb", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!iha", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lclient!nb;Lclient!iq;IIII)V")
	public Class157_Sub2(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface2 local11 = arg0.anInterface2_11;
		@Pc(15) int[] local15 = new int[arg1.anInt5135];
		this.anIntArray282 = new int[arg1.anInt5129 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt5135; local24++) {
			if (arg1.aByteArray36 == null || arg1.aByteArray36[local24] != 2) {
				if (arg1.aShortArray101 != null && arg1.aShortArray101[local24] != -1) {
					@Pc(63) Class32 local63 = local11.method1027(arg1.aShortArray101[local24] & 0xFFFF);
					if (((this.anInt4986 & 0x40) == 0 || !local63.aBoolean67) && local63.aBoolean65) {
						continue;
					}
				}
				local15[this.anInt5004++] = local24;
				this.anIntArray282[arg1.aShortArray96[local24]]++;
				this.anIntArray282[arg1.aShortArray95[local24]]++;
				this.anIntArray282[arg1.aShortArray92[local24]]++;
			}
		}
		this.anInt4935 = this.anInt5004;
		@Pc(144) long[] local144 = new long[this.anInt5004];
		@Pc(156) boolean local156 = (this.anInt4941 & 0x100) != 0;
		@Pc(170) int local170;
		@Pc(183) int local183;
		@Pc(373) int local373;
		for (@Pc(158) int local158 = 0; local158 < this.anInt5004; local158++) {
			@Pc(166) int local166 = local15[local158];
			@Pc(168) Class32 local168 = null;
			local170 = 0;
			@Pc(172) byte local172 = 0;
			@Pc(174) byte local174 = 0;
			@Pc(176) byte local176 = 0;
			if (arg1.aClass74Array1 != null) {
				@Pc(181) boolean local181 = false;
				for (local183 = 0; local183 < arg1.aClass74Array1.length; local183++) {
					@Pc(190) Class74 local190 = arg1.aClass74Array1[local183];
					if (local190.anInt2328 == local166) {
						@Pc(199) Class64 local199 = Static421.method6218(local190.anInt2326);
						if (local199.aBoolean131) {
							local181 = true;
						}
						if (local199.anInt1656 != -1) {
							@Pc(214) Class32 local214 = local11.method1027(local199.anInt1656);
							if (local214.anInt861 == 2) {
								this.aBoolean429 = true;
							}
						}
					}
				}
				if (local181) {
					local144[local158] = Long.MAX_VALUE;
					this.anInt4935--;
					continue;
				}
			}
			@Pc(255) short local255 = -1;
			if (arg1.aShortArray101 != null) {
				local255 = arg1.aShortArray101[local166];
				if (local255 != -1) {
					local168 = local11.method1027(local255 & 0xFFFF);
					if ((this.anInt4986 & 0x40) != 0 && local168.aBoolean67) {
						local168 = null;
						local255 = -1;
					} else {
						local176 = local168.aByte19;
						local174 = local168.aByte25;
					}
				}
			}
			@Pc(325) boolean local325 = arg1.aByteArray42 != null && arg1.aByteArray42[local166] != 0 || local168 != null && local168.anInt861 != 0;
			if ((local156 || local325) && arg1.aByteArray40 != null) {
				local170 += arg1.aByteArray40[local166] << 17;
			}
			if (local325) {
				local170 += 65536;
			}
			local170 += (local174 & 0xFF) << 8;
			local170 += local176 & 0xFF;
			local373 = local172 + ((local255 & 0xFFFF) << 16);
			@Pc(379) int local379 = local373 + (local158 & 0xFFFF);
			local144[local158] = (long) local379 + ((long) local170 << 32);
			this.aBoolean430 |= local168 != null && (local168.aByte22 != 0 || local168.aByte23 != 0);
			this.aBoolean429 |= local325;
		}
		Static329.method4894(local144, local15);
		this.anInt4961 = arg1.anInt5129;
		this.anIntArray285 = arg1.anIntArray304;
		this.anInt4924 = arg1.anInt5138;
		this.anIntArray283 = arg1.anIntArray302;
		this.anIntArray281 = arg1.anIntArray298;
		this.aShortArray81 = arg1.aShortArray98;
		this.aClass156Array3 = arg1.aClass156Array4;
		@Pc(468) Class356[] local468 = new Class356[this.anInt4961];
		this.aClass348Array3 = arg1.aClass348Array4;
		@Pc(492) int local492;
		@Pc(508) int local508;
		@Pc(559) int local559;
		if (arg1.aClass74Array1 != null) {
			this.anInt4937 = arg1.aClass74Array1.length;
			this.aClass139Array1 = new Class139[this.anInt4937];
			this.aClass200Array1 = new Class200[this.anInt4937];
			for (local492 = 0; local492 < this.anInt4937; local492++) {
				@Pc(501) Class74 local501 = arg1.aClass74Array1[local492];
				@Pc(506) Class64 local506 = Static421.method6218(local501.anInt2326);
				local508 = -1;
				for (@Pc(510) int local510 = 0; local510 < this.anInt5004; local510++) {
					if (local15[local510] == local501.anInt2328) {
						local508 = local510;
						break;
					}
				}
				if (local508 == -1) {
					throw new RuntimeException();
				}
				local559 = Static305.anIntArray309[arg1.aShortArray100[local501.anInt2328] & 0xFFFF] & 0xFFFFFF;
				@Pc(577) int local577 = local559 | 255 - (arg1.aByteArray42 == null ? 0 : arg1.aByteArray42[local501.anInt2328]) << 24;
				this.aClass139Array1[local492] = new Class139(local508, arg1.aShortArray96[local501.anInt2328], arg1.aShortArray95[local501.anInt2328], arg1.aShortArray92[local501.anInt2328], local506.anInt1651, local506.anInt1657, local506.anInt1656, local506.anInt1654, local506.anInt1652, local506.aBoolean131, local506.aBoolean130, local501.anInt2331);
				this.aClass200Array1[local492] = new Class200(local577);
			}
		}
		local492 = this.anInt5004 * 3;
		this.aShortArray91 = new short[local492];
		this.aShortArray82 = new short[this.anInt5004];
		this.aShortArray88 = new short[local492];
		this.aShortArray87 = new short[this.anInt5004];
		this.aShortArray84 = new short[local492];
		this.aByteArray33 = new byte[local492];
		this.aShortArray80 = new short[local492];
		this.aShortArray86 = new short[this.anInt5004];
		this.aShort71 = (short) arg4;
		if (arg1.aShortArray97 != null) {
			this.aShortArray85 = new short[this.anInt5004];
		}
		this.aByteArray32 = new byte[this.anInt5004];
		this.aFloatArray48 = new float[local492];
		this.aFloatArray47 = new float[local492];
		this.aShortArray83 = new short[this.anInt5004];
		this.aShortArray79 = new short[this.anInt5004];
		this.aShortArray89 = new short[local492];
		Static268.aLongArray7 = new long[local492];
		this.aShort70 = (short) arg3;
		this.aShortArray90 = new short[local492];
		local170 = 0;
		for (local373 = 0; local373 < arg1.anInt5129; local373++) {
			local508 = this.anIntArray282[local373];
			this.anIntArray282[local373] = local170;
			local468[local373] = new Class356();
			local170 += local508;
		}
		this.anIntArray282[arg1.anInt5129] = local170;
		@Pc(771) Class254 local771 = Static255.method3993(this.anInt5004, local15, arg1);
		@Pc(775) Class182[] local775 = new Class182[arg1.anInt5135];
		@Pc(817) int local817;
		@Pc(828) int local828;
		@Pc(838) int local838;
		@Pc(796) short local796;
		@Pc(807) int local807;
		for (local559 = 0; local559 < arg1.anInt5135; local559++) {
			@Pc(786) short local786 = arg1.aShortArray96[local559];
			@Pc(791) short local791 = arg1.aShortArray95[local559];
			local796 = arg1.aShortArray92[local559];
			local807 = this.anIntArray281[local791] - this.anIntArray281[local786];
			local817 = this.anIntArray285[local791] - this.anIntArray285[local786];
			local828 = this.anIntArray283[local791] - this.anIntArray283[local786];
			local838 = this.anIntArray281[local796] - this.anIntArray281[local786];
			@Pc(849) int local849 = this.anIntArray285[local796] - this.anIntArray285[local786];
			@Pc(860) int local860 = this.anIntArray283[local796] - this.anIntArray283[local786];
			@Pc(869) int local869 = local817 * local860 - local828 * local849;
			@Pc(878) int local878 = local828 * local838 - local807 * local860;
			@Pc(886) int local886 = local807 * local849 - local838 * local817;
			while (local869 > 8192 || local878 > 8192 || local886 > 8192 || local869 < -8192 || local878 < -8192 || local886 < -8192) {
				local886 >>= 0x1;
				local878 >>= 0x1;
				local869 >>= 0x1;
			}
			@Pc(945) int local945 = (int) Math.sqrt((double) (local878 * local878 + local869 * local869 + local886 * local886));
			if (local945 <= 0) {
				local945 = 1;
			}
			local886 = local886 * 256 / local945;
			local878 = local878 * 256 / local945;
			local869 = local869 * 256 / local945;
			@Pc(981) byte local981 = arg1.aByteArray36 == null ? 0 : arg1.aByteArray36[local559];
			if (local981 == 0) {
				@Pc(1016) Class356 local1016 = local468[local786];
				local1016.anInt9940 += local878;
				local1016.anInt9942 += local869;
				local1016.anInt9941++;
				local1016.anInt9939 += local886;
				@Pc(1044) Class356 local1044 = local468[local791];
				local1044.anInt9939 += local886;
				local1044.anInt9941++;
				local1044.anInt9942 += local869;
				local1044.anInt9940 += local878;
				@Pc(1072) Class356 local1072 = local468[local796];
				local1072.anInt9941++;
				local1072.anInt9939 += local886;
				local1072.anInt9940 += local878;
				local1072.anInt9942 += local869;
			} else if (local981 == 1) {
				@Pc(1001) Class182 local1001 = local775[local559] = new Class182();
				local1001.anInt5205 = local886;
				local1001.anInt5204 = local869;
				local1001.anInt5206 = local878;
			}
		}
		@Pc(1117) int local1117;
		@Pc(1161) short local1161;
		for (local183 = 0; local183 < this.anInt5004; local183++) {
			local1117 = local15[local183];
			@Pc(1124) int local1124 = arg1.aShortArray100[local1117] & 0xFFFF;
			if (arg1.aByteArray37 == null) {
				local807 = -1;
			} else {
				local807 = arg1.aByteArray37[local1117];
			}
			if (arg1.aByteArray42 == null) {
				local817 = 0;
			} else {
				local817 = arg1.aByteArray42[local1117] & 0xFF;
			}
			local1161 = arg1.aShortArray101 == null ? -1 : arg1.aShortArray101[local1117];
			if (local1161 != -1 && (this.anInt4986 & 0x40) != 0) {
				@Pc(1182) Class32 local1182 = local11.method1027(local1161 & 0xFFFF);
				if (local1182.aBoolean67) {
					local1161 = -1;
				}
			}
			@Pc(1189) float local1189 = 0.0F;
			@Pc(1191) float local1191 = 0.0F;
			@Pc(1193) float local1193 = 0.0F;
			@Pc(1195) float local1195 = 0.0F;
			@Pc(1197) float local1197 = 0.0F;
			@Pc(1199) float local1199 = 0.0F;
			@Pc(1201) byte local1201 = 0;
			@Pc(1203) byte local1203 = 0;
			@Pc(1205) int local1205 = 0;
			@Pc(1241) byte local1241;
			@Pc(1261) short local1261;
			@Pc(2081) short local2081;
			@Pc(2086) short local2086;
			if (local1161 != -1) {
				if (local807 == -1) {
					local1195 = 1.0F;
					local1201 = 1;
					local1193 = 1.0F;
					local1203 = 2;
					local1191 = 1.0F;
					local1197 = 0.0F;
					local1199 = 0.0F;
					local1189 = 0.0F;
				} else {
					local807 &= 0xFF;
					local1241 = arg1.aByteArray41[local807];
					@Pc(1251) short local1251;
					@Pc(1256) short local1256;
					@Pc(1294) float local1294;
					@Pc(1305) float local1305;
					@Pc(1399) float local1399;
					@Pc(1650) float local1650;
					@Pc(1658) float local1658;
					@Pc(1666) float local1666;
					@Pc(1689) float local1689;
					@Pc(1712) float local1712;
					@Pc(1735) float local1735;
					if (local1241 == 0) {
						local1251 = arg1.aShortArray96[local1117];
						local1256 = arg1.aShortArray95[local1117];
						local1261 = arg1.aShortArray92[local1117];
						local2081 = arg1.aShortArray93[local807];
						local2086 = arg1.aShortArray94[local807];
						@Pc(2091) short local2091 = arg1.aShortArray99[local807];
						@Pc(2097) float local2097 = (float) arg1.anIntArray298[local2081];
						@Pc(2103) float local2103 = (float) arg1.anIntArray304[local2081];
						local1294 = (float) arg1.anIntArray302[local2081];
						local1305 = (float) arg1.anIntArray298[local2086] - local2097;
						local1399 = (float) arg1.anIntArray304[local2086] - local2103;
						@Pc(2133) float local2133 = (float) arg1.anIntArray302[local2086] - local1294;
						@Pc(2142) float local2142 = (float) arg1.anIntArray298[local2091] - local2097;
						@Pc(2150) float local2150 = (float) arg1.anIntArray304[local2091] - local2103;
						@Pc(2159) float local2159 = (float) arg1.anIntArray302[local2091] - local1294;
						@Pc(2167) float local2167 = (float) arg1.anIntArray298[local1251] - local2097;
						@Pc(2176) float local2176 = (float) arg1.anIntArray304[local1251] - local2103;
						@Pc(2184) float local2184 = (float) arg1.anIntArray302[local1251] - local1294;
						@Pc(2193) float local2193 = (float) arg1.anIntArray298[local1256] - local2097;
						@Pc(2202) float local2202 = (float) arg1.anIntArray304[local1256] - local2103;
						local1650 = (float) arg1.anIntArray302[local1256] - local1294;
						local1658 = (float) arg1.anIntArray298[local1261] - local2097;
						local1666 = (float) arg1.anIntArray304[local1261] - local2103;
						local1689 = (float) arg1.anIntArray302[local1261] - local1294;
						local1712 = local1399 * local2159 - local2150 * local2133;
						local1735 = local2142 * local2133 - local1305 * local2159;
						@Pc(2262) float local2262 = local2150 * local1305 - local2142 * local1399;
						@Pc(2271) float local2271 = local2150 * local2262 - local1735 * local2159;
						@Pc(2280) float local2280 = local1712 * local2159 - local2142 * local2262;
						@Pc(2289) float local2289 = local1735 * local2142 - local2150 * local1712;
						@Pc(2303) float local2303 = 1.0F / (local2133 * local2289 + local1399 * local2280 + local2271 * local1305);
						local1189 = local2303 * (local2176 * local2280 + local2271 * local2167 + local2184 * local2289);
						local1193 = local2303 * (local2289 * local1650 + local2193 * local2271 + local2202 * local2280);
						local1197 = (local2289 * local1689 + local2280 * local1666 + local2271 * local1658) * local2303;
						@Pc(2353) float local2353 = local1399 * local2262 - local1735 * local2133;
						@Pc(2362) float local2362 = local1735 * local1305 - local1399 * local1712;
						@Pc(2371) float local2371 = local1712 * local2133 - local1305 * local2262;
						@Pc(2385) float local2385 = 1.0F / (local2150 * local2371 + local2142 * local2353 + local2362 * local2159);
						local1191 = local2385 * (local2362 * local2184 + local2353 * local2167 + local2371 * local2176);
						local1195 = (local2353 * local2193 + local2202 * local2371 + local2362 * local1650) * local2385;
						local1199 = local2385 * (local2353 * local1658 + local2371 * local1666 + local2362 * local1689);
					} else {
						local1251 = arg1.aShortArray96[local1117];
						local1256 = arg1.aShortArray95[local1117];
						local1261 = arg1.aShortArray92[local1117];
						@Pc(1266) int local1266 = local771.anIntArray401[local807];
						@Pc(1271) int local1271 = local771.anIntArray400[local807];
						@Pc(1276) int local1276 = local771.anIntArray402[local807];
						@Pc(1281) float[] local1281 = local771.aFloatArrayArray12[local807];
						@Pc(1286) byte local1286 = arg1.aByteArray39[local807];
						local1294 = (float) arg1.anIntArray297[local807] / 256.0F;
						if (local1241 == 1) {
							local1305 = (float) arg1.anIntArray295[local807] / 1024.0F;
							Static309.method4678(local1294, Static167.aFloatArray31, local1281, local1271, arg1.anIntArray304[local1251], local1266, local1276, local1305, arg1.anIntArray298[local1251], arg1.anIntArray302[local1251], local1286);
							local1189 = Static167.aFloatArray31[0];
							local1191 = Static167.aFloatArray31[1];
							Static309.method4678(local1294, Static167.aFloatArray31, local1281, local1271, arg1.anIntArray304[local1256], local1266, local1276, local1305, arg1.anIntArray298[local1256], arg1.anIntArray302[local1256], local1286);
							local1193 = Static167.aFloatArray31[0];
							local1195 = Static167.aFloatArray31[1];
							Static309.method4678(local1294, Static167.aFloatArray31, local1281, local1271, arg1.anIntArray304[local1261], local1266, local1276, local1305, arg1.anIntArray298[local1261], arg1.anIntArray302[local1261], local1286);
							local1199 = Static167.aFloatArray31[1];
							local1197 = Static167.aFloatArray31[0];
							local1399 = local1305 / 2.0F;
							if ((local1286 & 0x1) == 0) {
								if (local1399 < local1193 - local1189) {
									local1201 = 1;
									local1193 -= local1305;
								} else if (local1189 - local1193 > local1399) {
									local1193 += local1305;
									local1201 = 2;
								}
								if (local1197 - local1189 > local1399) {
									local1203 = 1;
									local1197 -= local1305;
								} else if (local1399 < local1189 - local1197) {
									local1203 = 2;
									local1197 += local1305;
								}
							} else {
								if (local1195 - local1191 > local1399) {
									local1195 -= local1305;
									local1201 = 1;
								} else if (local1191 - local1195 > local1399) {
									local1195 += local1305;
									local1201 = 2;
								}
								if (local1399 < local1199 - local1191) {
									local1199 -= local1305;
									local1203 = 1;
								} else if (local1399 < local1191 - local1199) {
									local1199 += local1305;
									local1203 = 2;
								}
							}
						} else if (local1241 == 2) {
							local1305 = (float) arg1.anIntArray296[local807] / 256.0F;
							local1399 = (float) arg1.anIntArray300[local807] / 256.0F;
							@Pc(1563) int local1563 = arg1.anIntArray298[local1256] - arg1.anIntArray298[local1251];
							@Pc(1573) int local1573 = arg1.anIntArray304[local1256] - arg1.anIntArray304[local1251];
							@Pc(1583) int local1583 = arg1.anIntArray302[local1256] - arg1.anIntArray302[local1251];
							@Pc(1594) int local1594 = arg1.anIntArray298[local1261] - arg1.anIntArray298[local1251];
							@Pc(1605) int local1605 = arg1.anIntArray304[local1261] - arg1.anIntArray304[local1251];
							@Pc(1615) int local1615 = arg1.anIntArray302[local1261] - arg1.anIntArray302[local1251];
							@Pc(1624) int local1624 = local1615 * local1573 - local1583 * local1605;
							@Pc(1633) int local1633 = local1594 * local1583 - local1563 * local1615;
							@Pc(1642) int local1642 = local1563 * local1605 - local1594 * local1573;
							local1650 = 64.0F / (float) arg1.anIntArray294[local807];
							local1658 = 64.0F / (float) arg1.anIntArray301[local807];
							local1666 = 64.0F / (float) arg1.anIntArray295[local807];
							local1689 = ((float) local1633 * local1281[1] + local1281[0] * (float) local1624 + local1281[2] * (float) local1642) / local1650;
							local1712 = (local1281[3] * (float) local1624 + local1281[4] * (float) local1633 + local1281[5] * (float) local1642) / local1658;
							local1735 = ((float) local1633 * local1281[7] + (float) local1624 * local1281[6] + local1281[8] * (float) local1642) / local1666;
							local1205 = Static551.method7774(local1689, local1712, local1735);
							Static204.method3023(Static167.aFloatArray31, arg1.anIntArray304[local1251], local1205, local1399, local1281, local1294, arg1.anIntArray302[local1251], local1305, local1271, local1286, arg1.anIntArray298[local1251], local1266, local1276);
							local1189 = Static167.aFloatArray31[0];
							local1191 = Static167.aFloatArray31[1];
							Static204.method3023(Static167.aFloatArray31, arg1.anIntArray304[local1256], local1205, local1399, local1281, local1294, arg1.anIntArray302[local1256], local1305, local1271, local1286, arg1.anIntArray298[local1256], local1266, local1276);
							local1195 = Static167.aFloatArray31[1];
							local1193 = Static167.aFloatArray31[0];
							Static204.method3023(Static167.aFloatArray31, arg1.anIntArray304[local1261], local1205, local1399, local1281, local1294, arg1.anIntArray302[local1261], local1305, local1271, local1286, arg1.anIntArray298[local1261], local1266, local1276);
							local1199 = Static167.aFloatArray31[1];
							local1197 = Static167.aFloatArray31[0];
						} else if (local1241 == 3) {
							Static213.method3322(arg1.anIntArray298[local1251], local1286, local1271, Static167.aFloatArray31, local1294, local1266, local1276, arg1.anIntArray302[local1251], local1281, arg1.anIntArray304[local1251]);
							local1189 = Static167.aFloatArray31[0];
							local1191 = Static167.aFloatArray31[1];
							Static213.method3322(arg1.anIntArray298[local1256], local1286, local1271, Static167.aFloatArray31, local1294, local1266, local1276, arg1.anIntArray302[local1256], local1281, arg1.anIntArray304[local1256]);
							local1195 = Static167.aFloatArray31[1];
							local1193 = Static167.aFloatArray31[0];
							Static213.method3322(arg1.anIntArray298[local1261], local1286, local1271, Static167.aFloatArray31, local1294, local1266, local1276, arg1.anIntArray302[local1261], local1281, arg1.anIntArray304[local1261]);
							local1199 = Static167.aFloatArray31[1];
							local1197 = Static167.aFloatArray31[0];
							if ((local1286 & 0x1) == 0) {
								if (local1197 - local1189 > 0.5F) {
									local1203 = 1;
									local1197--;
								} else if (local1189 - local1197 > 0.5F) {
									local1197++;
									local1203 = 2;
								}
								if (local1193 - local1189 > 0.5F) {
									local1201 = 1;
									local1193--;
								} else if (local1189 - local1193 > 0.5F) {
									local1201 = 2;
									local1193++;
								}
							} else {
								if (local1199 - local1191 > 0.5F) {
									local1199--;
									local1203 = 1;
								} else if (local1191 - local1199 > 0.5F) {
									local1199++;
									local1203 = 2;
								}
								if (local1195 - local1191 > 0.5F) {
									local1201 = 1;
									local1195--;
								} else if (local1191 - local1195 > 0.5F) {
									local1195++;
									local1201 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray36 == null) {
				local1241 = 0;
			} else {
				local1241 = arg1.aByteArray36[local1117];
			}
			if (local1241 == 0) {
				@Pc(2462) long local2462 = (long) (local807 << 2) + ((long) local817 + (long) (local1205 << 24) + (long) (local1124 << 8) << 32);
				local1261 = arg1.aShortArray96[local1117];
				local2081 = arg1.aShortArray95[local1117];
				local2086 = arg1.aShortArray92[local1117];
				@Pc(2481) Class356 local2481 = local468[local1261];
				this.aShortArray83[local183] = this.method4172(local1261, local2481.anInt9940, local1191, local183, local2481.anInt9939, 73, local2462, local2481.anInt9941, arg1, local1189, local2481.anInt9942);
				@Pc(2506) Class356 local2506 = local468[local2081];
				this.aShortArray82[local183] = this.method4172(local2081, local2506.anInt9940, local1195, local183, local2506.anInt9939, 106, (long) local1201 + local2462, local2506.anInt9941, arg1, local1193, local2506.anInt9942);
				@Pc(2534) Class356 local2534 = local468[local2086];
				this.aShortArray86[local183] = this.method4172(local2086, local2534.anInt9940, local1199, local183, local2534.anInt9939, 72, (long) local1203 + local2462, local2534.anInt9941, arg1, local1197, local2534.anInt9942);
			} else if (local1241 == 1) {
				@Pc(2571) Class182 local2571 = local775[local1117];
				@Pc(2620) long local2620 = (long) ((local807 << 2) + ((local2571.anInt5204 > 0 ? 1024 : 2048) - (-(local2571.anInt5206 + 256 << 12) - (local2571.anInt5205 + 256 << 22)))) + ((long) (local1124 << 8) + (long) (local1205 << 24) + (long) local817 << 32);
				this.aShortArray83[local183] = this.method4172(arg1.aShortArray96[local1117], local2571.anInt5206, local1191, local183, local2571.anInt5205, 121, local2620, 0, arg1, local1189, local2571.anInt5204);
				this.aShortArray82[local183] = this.method4172(arg1.aShortArray95[local1117], local2571.anInt5206, local1195, local183, local2571.anInt5205, 65, (long) local1201 + local2620, 0, arg1, local1193, local2571.anInt5204);
				this.aShortArray86[local183] = this.method4172(arg1.aShortArray92[local1117], local2571.anInt5206, local1199, local183, local2571.anInt5205, 117, local2620 + (long) local1203, 0, arg1, local1197, local2571.anInt5204);
			}
			if (arg1.aByteArray42 != null) {
				this.aByteArray32[local183] = arg1.aByteArray42[local1117];
			}
			if (arg1.aShortArray97 != null) {
				this.aShortArray85[local183] = arg1.aShortArray97[local1117];
			}
			this.aShortArray79[local183] = arg1.aShortArray100[local1117];
			this.aShortArray87[local183] = local1161;
		}
		if (this.anInt4935 > 0) {
			local1117 = 1;
			local796 = this.aShortArray87[0];
			for (local807 = 0; local807 < this.anInt4935; local807++) {
				@Pc(2766) short local2766 = this.aShortArray87[local807];
				if (local2766 != local796) {
					local1117++;
					local796 = local2766;
				}
			}
			this.anIntArray286 = new int[local1117 + 1];
			this.anIntArray279 = new int[local1117];
			this.anIntArray284 = new int[local1117];
			this.anIntArray286[0] = 0;
			local817 = this.anInt4972;
			local1161 = 0;
			local796 = this.aShortArray87[0];
			local1117 = 0;
			for (local838 = 0; local838 < this.anInt4935; local838++) {
				@Pc(2825) short local2825 = this.aShortArray87[local838];
				if (local2825 != local796) {
					this.anIntArray279[local1117] = local817;
					this.anIntArray284[local1117] = local1161 + 1 - local817;
					local1117++;
					this.anIntArray286[local1117] = local838;
					local817 = this.anInt4972;
					local796 = local2825;
					local1161 = 0;
				}
				@Pc(2861) short local2861 = this.aShortArray83[local838];
				if (local1161 < local2861) {
					local1161 = local2861;
				}
				if (local817 > local2861) {
					local817 = local2861;
				}
				local2861 = this.aShortArray82[local838];
				if (local2861 < local817) {
					local817 = local2861;
				}
				if (local2861 > local1161) {
					local1161 = local2861;
				}
				local2861 = this.aShortArray86[local838];
				if (local2861 > local1161) {
					local1161 = local2861;
				}
				if (local2861 < local817) {
					local817 = local2861;
				}
			}
			this.anIntArray279[local1117] = local817;
			this.anIntArray284[local1117] = local1161 + 1 - local817;
			local1117++;
			this.anIntArray286[local1117] = this.anInt4935;
		}
		Static268.aLongArray7 = null;
		this.aShortArray80 = Static379.method5703(this.aShortArray80, this.anInt4972);
		this.aShortArray90 = Static379.method5703(this.aShortArray90, this.anInt4972);
		this.aShortArray89 = Static379.method5703(this.aShortArray89, this.anInt4972);
		this.aShortArray84 = Static379.method5703(this.aShortArray84, this.anInt4972);
		this.aShortArray88 = Static379.method5703(this.aShortArray88, this.anInt4972);
		this.aByteArray33 = Static268.method4110(this.anInt4972, this.aByteArray33);
		this.aFloatArray47 = Static173.method2694(this.aFloatArray47, this.anInt4972);
		this.aFloatArray48 = Static173.method2694(this.aFloatArray48, this.anInt4972);
		if (arg1.anIntArray303 != null && Static424.method6248(this.anInt4986, arg2)) {
			this.anIntArrayArray24 = arg1.method4273(false);
		}
		if (arg1.aClass74Array1 != null && Static514.method7353(arg2, this.anInt4986)) {
			this.anIntArrayArray25 = arg1.method4275();
		}
		if (arg1.anIntArray299 != null && Static269.method4121(arg2, this.anInt4986)) {
			local1117 = 0;
			@Pc(3071) int[] local3071 = new int[256];
			for (local807 = 0; local807 < this.anInt5004; local807++) {
				local817 = arg1.anIntArray299[local15[local807]];
				if (local817 >= 0) {
					@Pc(3088) int local3088 = local3071[local817]++;
					if (local1117 < local817) {
						local1117 = local817;
					}
				}
			}
			this.anIntArrayArray23 = new int[local1117 + 1][];
			for (local817 = 0; local817 <= local1117; local817++) {
				this.anIntArrayArray23[local817] = new int[local3071[local817]];
				local3071[local817] = 0;
			}
			for (local828 = 0; local828 < this.anInt5004; local828++) {
				local838 = arg1.anIntArray299[local15[local828]];
				if (local838 >= 0) {
					this.anIntArrayArray23[local838][local3071[local838]++] = local828;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lclient!nb;IIZZ)V")
	public Class157_Sub2(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4935 = 0;
		this.aBoolean429 = false;
		this.anInt4924 = 0;
		this.aBoolean431 = false;
		this.aBoolean428 = true;
		this.anInt4961 = 0;
		this.anInt4972 = 0;
		this.aBoolean430 = false;
		this.aBoolean433 = false;
		this.anInt5004 = 0;
		this.aBoolean431 = arg4;
		this.anInt4986 = arg2;
		this.anInt4941 = arg1;
		this.aClass67_Sub1_7 = arg0;
		if (arg3 || Static161.method2558(this.anInt4941, this.anInt4986)) {
			this.aClass376_3 = new Class376(Static486.method7076(this.anInt4941, this.anInt4986));
		}
		if (arg3 || Static206.method9439(this.anInt4986, this.anInt4941)) {
			this.aClass376_4 = new Class376(Static165.method2650(this.anInt4986, this.anInt4941));
		}
		if (arg3 || Static272.method4183(this.anInt4941, this.anInt4986)) {
			this.aClass376_2 = new Class376(Static284.method4284(this.anInt4941, this.anInt4986));
		}
		if (arg3 || Static475.method6988(this.anInt4986, this.anInt4941)) {
			this.aClass376_1 = new Class376(Static471.method8864(this.anInt4941, this.anInt4986));
		}
		if (arg3 || Static390.method5896(this.anInt4941, this.anInt4986)) {
			this.aClass311_1 = new Class311(Static506.method7242(this.anInt4941, this.anInt4986));
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIFIIIJILclient!iq;FI)S")
	private short method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class178 arg8, @OriginalArg(9) float arg9, @OriginalArg(10) int arg10) {
		@Pc(10) int local10 = this.anIntArray282[arg0];
		@Pc(17) int local17 = this.anIntArray282[arg0 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(30) short local30 = this.aShortArray91[local21];
			if (local30 == 0) {
				local19 = local21;
				break;
			}
			if (arg6 == Static268.aLongArray7[local21]) {
				return (short) (local30 - 1);
			}
		}
		this.aShortArray91[local19] = (short) (this.anInt4972 + 1);
		Static268.aLongArray7[local19] = arg6;
		this.aShortArray90[this.anInt4972] = (short) arg3;
		if (arg5 < 18) {
			this.aBoolean433 = true;
		}
		this.aShortArray80[this.anInt4972] = (short) arg0;
		this.aShortArray89[this.anInt4972] = (short) arg10;
		this.aShortArray84[this.anInt4972] = (short) arg1;
		this.aShortArray88[this.anInt4972] = (short) arg4;
		this.aByteArray33[this.anInt4972] = (byte) arg7;
		this.aFloatArray47[this.anInt4972] = arg9;
		this.aFloatArray48[this.anInt4972] = arg2;
		return (short) this.anInt4972++;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!iu;IZ)V")
	@Override
	public void method5220(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray81 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4961; local15++) {
			if ((arg1 & this.aShortArray81[local15]) != 0) {
				if (arg2) {
					arg0.method6348(this.anIntArray281[local15], this.anIntArray285[local15], this.anIntArray283[local15], local13);
				} else {
					arg0.method6360(this.anIntArray281[local15], this.anIntArray285[local15], this.anIntArray283[local15], local13);
				}
				this.anIntArray281[local15] = local13[0];
				this.anIntArray285[local15] = local13[1];
				this.anIntArray283[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub4_Sub13 ba(@OriginalArg(0) Class3_Sub4_Sub13 arg0) {
		if (this.anInt4972 == 0) {
			return null;
		}
		if (!this.aBoolean433) {
			this.method4188();
		}
		@Pc(45) int local45;
		@Pc(61) int local61;
		if (this.aClass67_Sub1_7.anInt6679 <= 0) {
			local45 = this.anInt4995 - (this.aClass67_Sub1_7.anInt6679 * this.anInt5003 >> 8) >> this.aClass67_Sub1_7.anInt6658;
			local61 = this.anInt4950 - (this.anInt4985 * this.aClass67_Sub1_7.anInt6679 >> 8) >> this.aClass67_Sub1_7.anInt6658;
		} else {
			local45 = this.anInt4995 - (this.aClass67_Sub1_7.anInt6679 * this.anInt4985 >> 8) >> this.aClass67_Sub1_7.anInt6658;
			local61 = this.anInt4950 - (this.anInt5003 * this.aClass67_Sub1_7.anInt6679 >> 8) >> this.aClass67_Sub1_7.anInt6658;
		}
		@Pc(118) int local118;
		@Pc(134) int local134;
		if (this.aClass67_Sub1_7.anInt6655 <= 0) {
			local118 = this.anInt4955 - (this.aClass67_Sub1_7.anInt6655 * this.anInt5003 >> 8) >> this.aClass67_Sub1_7.anInt6658;
			local134 = this.anInt4956 - (this.aClass67_Sub1_7.anInt6655 * this.anInt4985 >> 8) >> this.aClass67_Sub1_7.anInt6658;
		} else {
			local118 = this.anInt4955 - (this.aClass67_Sub1_7.anInt6655 * this.anInt4985 >> 8) >> this.aClass67_Sub1_7.anInt6658;
			local134 = this.anInt4956 - (this.aClass67_Sub1_7.anInt6655 * this.anInt5003 >> 8) >> this.aClass67_Sub1_7.anInt6658;
		}
		@Pc(177) int local177 = local61 + 1 - local45;
		@Pc(184) int local184 = local134 + 1 - local118;
		@Pc(187) Class3_Sub4_Sub13_Sub1 local187 = (Class3_Sub4_Sub13_Sub1) arg0;
		@Pc(205) Class3_Sub4_Sub13_Sub1 local205;
		if (local187 != null && local187.method5891(local184, local177)) {
			local205 = local187;
			local187.method5889();
		} else {
			local205 = new Class3_Sub4_Sub13_Sub1(this.aClass67_Sub1_7, local177, local184);
		}
		local205.method5887(local61, local134, local45, local118);
		this.method4189(local205);
		return local205;
	}

	@OriginalMember(owner = "client!iha", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt4941;
	}

	@OriginalMember(owner = "client!iha", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray24 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt4924; local13++) {
			this.anIntArray281[local13] <<= 0x4;
			this.anIntArray285[local13] <<= 0x4;
			this.anIntArray283[local13] <<= 0x4;
		}
		Static278.anInt5061 = 0;
		Static85.anInt1316 = 0;
		Static505.anInt8621 = 0;
		return true;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(B[B)V")
	@Override
	public void method5210(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(9) int local9;
		if (arg1 == null) {
			for (local9 = 0; local9 < this.anInt5004; local9++) {
				this.aByteArray32[local9] = arg0;
			}
		} else {
			for (local9 = 0; local9 < this.anInt5004; local9++) {
				@Pc(57) int local57 = 255 - (255 - (arg0 & 0xFF)) * (-(arg1[local9] & 0xFF) + 255) / 255;
				this.aByteArray32[local9] = (byte) local57;
			}
		}
		this.method4174();
	}

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "()V")
	@Override
	protected void method5219() {
	}

	@OriginalMember(owner = "client!iha", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort70;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "()[Lclient!hl;")
	@Override
	public Class156[] method5214() {
		return this.aClass156Array3;
	}

	@OriginalMember(owner = "client!iha", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean433) {
			this.method4188();
		}
		return this.anInt4950;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5004; local7++) {
			local18 = this.aShortArray79[local7] & 0xFFFF;
			@Pc(24) int local24 = local18 >> 10 & 0x3F;
			@Pc(30) int local30 = local18 >> 7 & 0x7;
			if (arg1 != -1) {
				local30 -= -(arg3 * (arg1 - local30) >> 7);
			}
			if (arg0 != -1) {
				local24 += (arg0 - local24) * arg3 >> 7;
			}
			@Pc(64) int local64 = local18 & 0x7F;
			if (arg2 != -1) {
				local64 += arg3 * (arg2 - local64) >> 7;
			}
			this.aShortArray79[local7] = (short) (local24 << 10 | local30 << 7 | local64);
		}
		if (this.aClass139Array1 != null) {
			for (local18 = 0; local18 < this.anInt4937; local18++) {
				@Pc(113) Class139 local113 = this.aClass139Array1[local18];
				@Pc(118) Class200 local118 = this.aClass200Array1[local18];
				local118.anInt5720 = local118.anInt5720 & 0xFF000000 | Static305.anIntArray309[this.aShortArray79[local113.anInt4276] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4174();
	}

	@OriginalMember(owner = "client!iha", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean433) {
			this.method4188();
		}
		return this.anInt4956;
	}

	@OriginalMember(owner = "client!iha", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class313 arg2, @OriginalArg(3) Class313 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean433) {
			this.method4188();
		}
		@Pc(18) int local18 = this.anInt4995 + arg4;
		@Pc(24) int local24 = arg4 + this.anInt4950;
		@Pc(29) int local29 = this.anInt4955 + arg6;
		@Pc(34) int local34 = this.anInt4956 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || arg2.anInt10875 <= arg2.anInt10871 + local24 >> arg2.anInt10873 || local29 < 0 || arg2.anInt10872 <= local34 + arg2.anInt10871 >> arg2.anInt10873)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || local24 + arg3.anInt10871 >> arg3.anInt10873 >= arg3.anInt10875 || local29 < 0 || arg3.anInt10872 <= local34 + arg3.anInt10871 >> arg3.anInt10873) {
				return;
			}
		} else {
			local18 >>= arg2.anInt10873;
			local24 = arg2.anInt10871 + local24 - 1 >> arg2.anInt10873;
			local29 >>= arg2.anInt10873;
			local34 = arg2.anInt10871 + local34 - 1 >> arg2.anInt10873;
			if (arg2.method9095(local29, local18) == arg5 && arg2.method9095(local29, local24) == arg5 && arg2.method9095(local34, local18) == arg5 && arg5 == arg2.method9095(local34, local24)) {
				return;
			}
		}
		@Pc(239) int local239;
		if (arg0 == 1) {
			for (local239 = 0; local239 < this.anInt4961; local239++) {
				this.anIntArray285[local239] = this.anIntArray285[local239] + arg2.method9096(this.anIntArray281[local239] + arg4, arg6 + this.anIntArray283[local239]) - arg5;
			}
		} else {
			@Pc(309) int local309;
			@Pc(383) int local383;
			if (arg0 == 2) {
				local239 = this.anInt5003;
				if (local239 == 0) {
					return;
				}
				for (local309 = 0; local309 < this.anInt4961; local309++) {
					local383 = (this.anIntArray285[local309] << 16) / local239;
					if (local383 < arg1) {
						this.anIntArray285[local309] += (arg1 - local383) * (arg2.method9096(this.anIntArray281[local309] - -arg4, this.anIntArray283[local309] - -arg6) - arg5) / arg1;
					}
				}
			} else {
				@Pc(390) int local390;
				if (arg0 == 3) {
					local239 = (arg1 & 0xFF) * 4;
					local309 = (arg1 >> 8 & 0xFF) * 4;
					local383 = (arg1 >> 16 & 0xFF) << 6;
					local390 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local239 >> 1) < 0 || arg2.anInt10875 << arg2.anInt10873 <= arg2.anInt10871 + (local239 >> 1) + arg4 || arg6 - (local309 >> 1) < 0 || arg2.anInt10871 + (local309 >> 1) + arg6 >= arg2.anInt10872 << arg2.anInt10873) {
						return;
					}
					this.method5228(arg4, local239, local309, local390, arg6, local383, arg5, arg2);
				} else if (arg0 == 4) {
					local239 = this.anInt4985 - this.anInt5003;
					for (local309 = 0; local309 < this.anInt4961; local309++) {
						this.anIntArray285[local309] -= arg5 - arg3.method9096(arg4 + this.anIntArray281[local309], arg6 + this.anIntArray283[local309]) - local239;
					}
				} else if (arg0 == 5) {
					local239 = this.anInt4985 - this.anInt5003;
					for (local309 = 0; local309 < this.anInt4961; local309++) {
						local383 = this.anIntArray281[local309] + arg4;
						local390 = arg6 + this.anIntArray283[local309];
						@Pc(396) int local396 = arg2.method9096(local383, local390);
						@Pc(402) int local402 = arg3.method9096(local383, local390);
						@Pc(410) int local410 = local396 - local402 - arg1;
						this.anIntArray285[local309] = local396 + (local410 * ((this.anIntArray285[local309] << 8) / local239) >> 8) - arg5;
					}
				}
			}
		}
		this.method4181();
		this.aBoolean433 = false;
	}

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "()V")
	@Override
	protected void method5215() {
	}

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "(I)Z")
	private boolean method4173() {
		@Pc(14) boolean local14 = !this.aClass376_2.aBoolean763;
		@Pc(30) boolean local30 = (this.anInt4986 & 0x37) != 0 && !this.aClass376_1.aBoolean763;
		@Pc(39) boolean local39 = !this.aClass376_3.aBoolean763;
		@Pc(48) boolean local48 = !this.aClass376_4.aBoolean763;
		if (!local39 && !local14 && !local30 && !local48) {
			return true;
		}
		@Pc(67) boolean local67 = true;
		@Pc(104) Interface16 local104;
		@Pc(118) Buffer local118;
		if (local39) {
			if (this.aShortArray80 == null) {
				return true;
			}
			if (this.aClass376_3.anInterface16_17 == null) {
				this.aClass376_3.anInterface16_17 = this.aClass67_Sub1_7.method5649(this.aBoolean431);
			}
			local104 = this.aClass376_3.anInterface16_17;
			local104.method7121(12, this.anInt4972 * 12);
			local118 = local104.method7122();
			if (local118 == null) {
				local67 = false;
			} else {
				this.aClass67_Sub1_7.aNativeInterface3.copyPositions(this.anIntArray281, this.anIntArray285, this.anIntArray283, this.aShortArray80, 0, 12, this.anInt4972, local118.getAddress());
				if (local104.method7124()) {
					this.aClass376_3.anInterface16_18 = local104;
					this.aClass376_3.aBoolean763 = true;
				} else {
					local67 = false;
				}
			}
		}
		@Pc(240) short[] local240;
		@Pc(246) short[] local246;
		@Pc(249) short[] local249;
		@Pc(243) byte[] local243;
		if (local14) {
			if (this.aClass376_2.anInterface16_17 == null) {
				this.aClass376_2.anInterface16_17 = this.aClass67_Sub1_7.method5649(this.aBoolean431);
			}
			local104 = this.aClass376_2.anInterface16_17;
			local104.method7121(4, this.anInt4972 * 4);
			local118 = local104.method7122();
			if (local118 == null) {
				local67 = false;
			} else {
				if ((this.anInt4986 & 0x37) == 0) {
					if (this.aClass103_1 == null) {
						local240 = this.aShortArray89;
						local243 = this.aByteArray33;
						local246 = this.aShortArray84;
						local249 = this.aShortArray88;
					} else {
						local243 = this.aClass103_1.aByteArray14;
						local240 = this.aClass103_1.aShortArray45;
						local249 = this.aClass103_1.aShortArray44;
						local246 = this.aClass103_1.aShortArray43;
					}
					this.aClass67_Sub1_7.aNativeInterface3.copyLighting(this.aShortArray79, this.aByteArray32, this.aShortArray87, local240, local246, local249, local243, this.aShort70, this.aShort71, this.aShortArray90, 0, 4, this.anInt4972, local118.getAddress());
				} else {
					this.aClass67_Sub1_7.aNativeInterface3.copyColours(this.aShortArray79, this.aByteArray32, this.aShortArray87, this.aShort70, this.aShortArray90, 0, 4, this.anInt4972, local118.getAddress());
				}
				if (local104.method7124()) {
					this.aClass376_2.aBoolean763 = true;
					this.aClass376_2.anInterface16_18 = local104;
				} else {
					local67 = false;
				}
			}
		}
		if (local30) {
			if (this.aClass376_1.anInterface16_17 == null) {
				this.aClass376_1.anInterface16_17 = this.aClass67_Sub1_7.method5649(this.aBoolean431);
			}
			local104 = this.aClass376_1.anInterface16_17;
			local104.method7121(12, this.anInt4972 * 12);
			local118 = local104.method7122();
			if (local118 == null) {
				local67 = false;
			} else {
				if (this.aClass103_1 == null) {
					local246 = this.aShortArray84;
					local249 = this.aShortArray88;
					local240 = this.aShortArray89;
					local243 = this.aByteArray33;
				} else {
					local246 = this.aClass103_1.aShortArray43;
					local243 = this.aClass103_1.aByteArray14;
					local240 = this.aClass103_1.aShortArray45;
					local249 = this.aClass103_1.aShortArray44;
				}
				this.aClass67_Sub1_7.aNativeInterface3.copyNormals(local240, local246, local249, local243, 3.0F / (float) this.aShort71, 3.0F / (float) (this.aShort71 / 2 + this.aShort71), 0, 12, this.anInt4972, local118.getAddress());
				if (local104.method7124()) {
					this.aClass376_1.anInterface16_18 = local104;
					this.aClass376_1.aBoolean763 = true;
				} else {
					local67 = false;
				}
			}
		}
		if (local48) {
			if (this.aClass376_4.anInterface16_17 == null) {
				this.aClass376_4.anInterface16_17 = this.aClass67_Sub1_7.method5649(this.aBoolean431);
			}
			local104 = this.aClass376_4.anInterface16_17;
			local104.method7121(8, this.anInt4972 * 8);
			local118 = local104.method7122();
			if (local118 == null) {
				local67 = false;
			} else {
				this.aClass67_Sub1_7.aNativeInterface3.copyTexCoords(this.aFloatArray47, this.aFloatArray48, 0, 8, this.anInt4972, local118.getAddress());
				if (local104.method7124()) {
					this.aClass376_4.anInterface16_18 = local104;
					this.aClass376_4.aBoolean763 = true;
				} else {
					local67 = false;
				}
			}
		}
		return local67;
	}

	@OriginalMember(owner = "client!iha", name = "i", descriptor = "(I)V")
	private void method4174() {
		if (this.aClass376_2 != null) {
			this.aClass376_2.aBoolean763 = false;
		}
	}

	@OriginalMember(owner = "client!iha", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass376_3 != null) {
			this.aClass376_3.aBoolean764 = Static486.method7076(arg0, this.anInt4986);
		}
		if (this.aClass376_4 != null) {
			this.aClass376_4.aBoolean764 = Static165.method2650(this.anInt4986, arg0);
		}
		if (this.aClass376_2 != null) {
			this.aClass376_2.aBoolean764 = Static284.method4284(arg0, this.anInt4986);
		}
		if (this.aClass376_1 != null) {
			this.aClass376_1.aBoolean764 = Static471.method8864(arg0, this.anInt4986);
		}
		this.anInt4941 = arg0;
		this.aBoolean428 = true;
		if (this.aClass103_1 != null && (this.anInt4941 & 0x10000) == 0) {
			this.aShortArray84 = this.aClass103_1.aShortArray43;
			this.aByteArray33 = this.aClass103_1.aByteArray14;
			this.aShortArray89 = this.aClass103_1.aShortArray45;
			this.aShortArray88 = this.aClass103_1.aShortArray44;
			this.aClass103_1 = null;
		}
		this.method4185();
	}

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "(I)V")
	private void method4175() {
		if (this.aClass311_1 != null) {
			this.aClass311_1.aBoolean662 = false;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZIILclient!iu;ZI)Z")
	private boolean method4176(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class181_Sub1 local8 = (Class181_Sub1) arg4;
		@Pc(12) Class181_Sub1 local12 = this.aClass67_Sub1_7.aClass181_Sub1_16;
		@Pc(33) float local33 = local8.aFloat97 * local12.aFloat100 + local12.aFloat99 * local8.aFloat103 + local12.aFloat108 * local8.aFloat106 + local12.aFloat97;
		@Pc(54) float local54 = local12.aFloat103 + local8.aFloat97 * local12.aFloat104 + local12.aFloat98 * local8.aFloat103 + local12.aFloat102 * local8.aFloat106;
		Static120.aFloat54 = local8.aFloat108 * local12.aFloat100 + local8.aFloat102 * local12.aFloat99 + local12.aFloat108 * local8.aFloat107;
		Static720.aFloat201 = local8.aFloat99 * local12.aFloat105 + local8.aFloat98 * local12.aFloat101 + local8.aFloat101 * local12.aFloat107;
		Static278.aFloat91 = local8.aFloat104 * local12.aFloat101 + local12.aFloat105 * local8.aFloat100 + local12.aFloat107 * local8.aFloat105;
		Static452.aFloat156 = local8.aFloat99 * local12.aFloat104 + local12.aFloat98 * local8.aFloat98 + local8.aFloat101 * local12.aFloat102;
		Static639.aFloat193 = local8.aFloat108 * local12.aFloat105 + local12.aFloat101 * local8.aFloat102 + local12.aFloat107 * local8.aFloat107;
		@Pc(165) float local165 = local12.aFloat106 + local12.aFloat107 * local8.aFloat106 + local8.aFloat103 * local12.aFloat101 + local12.aFloat105 * local8.aFloat97;
		Static182.aFloat60 = local12.aFloat108 * local8.aFloat105 + local12.aFloat99 * local8.aFloat104 + local8.aFloat100 * local12.aFloat100;
		Static225.aFloat85 = local8.aFloat102 * local12.aFloat98 + local8.aFloat108 * local12.aFloat104 + local12.aFloat102 * local8.aFloat107;
		Static154.aFloat57 = local12.aFloat104 * local8.aFloat100 + local8.aFloat104 * local12.aFloat98 + local12.aFloat102 * local8.aFloat105;
		Static591.aFloat181 = local8.aFloat101 * local12.aFloat108 + local12.aFloat100 * local8.aFloat99 + local12.aFloat99 * local8.aFloat98;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass67_Sub1_7.anInt6667;
		@Pc(255) int local255 = this.aClass67_Sub1_7.anInt6678;
		if (!this.aBoolean433) {
			this.method4188();
		}
		@Pc(272) int local272 = this.anInt4950 - this.anInt4995 >> 1;
		@Pc(281) int local281 = this.anInt4985 - this.anInt5003 >> 1;
		@Pc(289) int local289 = this.anInt4956 - this.anInt4955 >> 1;
		@Pc(294) int local294 = local272 + this.anInt4995;
		@Pc(299) int local299 = local281 + this.anInt5003;
		@Pc(305) int local305 = this.anInt4955 + local289;
		@Pc(311) int local311 = local294 - (local272 << arg0);
		@Pc(318) int local318 = local299 - (local281 << arg0);
		@Pc(324) int local324 = local305 - (local289 << arg0);
		@Pc(330) int local330 = (local272 << arg0) + local294;
		@Pc(337) int local337 = local299 + (local281 << arg0);
		Static550.anIntArray232[0] = local311;
		@Pc(347) int local347 = (local289 << arg0) + local305;
		Static160.anIntArray144[0] = local318;
		Static550.anIntArray232[1] = local330;
		Static113.anIntArray110[0] = local324;
		Static160.anIntArray144[1] = local318;
		Static550.anIntArray232[2] = local311;
		Static113.anIntArray110[1] = local324;
		Static160.anIntArray144[2] = local337;
		Static113.anIntArray110[2] = local324;
		Static550.anIntArray232[3] = local330;
		Static160.anIntArray144[3] = local337;
		Static550.anIntArray232[4] = local311;
		Static113.anIntArray110[3] = local324;
		Static160.anIntArray144[4] = local318;
		Static113.anIntArray110[4] = local347;
		Static550.anIntArray232[5] = local330;
		Static160.anIntArray144[5] = local318;
		Static113.anIntArray110[5] = local347;
		Static550.anIntArray232[6] = local311;
		Static160.anIntArray144[6] = local337;
		Static550.anIntArray232[7] = local330;
		Static113.anIntArray110[6] = local347;
		Static160.anIntArray144[7] = local337;
		Static113.anIntArray110[7] = local347;
		@Pc(502) float local502;
		@Pc(488) float local488;
		@Pc(474) float local474;
		@Pc(450) float local450;
		@Pc(460) float local460;
		@Pc(455) float local455;
		for (@Pc(441) int local441 = 0; local441 < 8; local441++) {
			local450 = (float) Static550.anIntArray232[local441];
			local455 = (float) Static113.anIntArray110[local441];
			local460 = (float) Static160.anIntArray144[local441];
			local474 = local165 + local460 * Static720.aFloat201 + Static278.aFloat91 * local450 + Static639.aFloat193 * local455;
			local488 = local460 * Static452.aFloat156 + local450 * Static154.aFloat57 + Static225.aFloat85 * local455 + local54;
			local502 = Static120.aFloat54 * local455 + local450 * Static182.aFloat60 + local460 * Static591.aFloat181 + local33;
			if ((float) this.aClass67_Sub1_7.anInt6680 <= local474) {
				if (arg5 > 0) {
					local474 = (float) arg5;
				}
				@Pc(528) float local528 = (float) this.aClass67_Sub1_7.anInt6668 + (float) local251 * local502 / local474;
				if (local243 < local528) {
					local243 = local528;
				}
				if (local528 < local241) {
					local241 = local528;
				}
				@Pc(552) float local552 = (float) this.aClass67_Sub1_7.anInt6671 + (float) local255 * local488 / local474;
				if (local552 < local245) {
					local245 = local552;
				}
				local239 = true;
				if (local552 > local247) {
					local247 = local552;
				}
			}
		}
		if (local239 && local241 < (float) arg2 && local243 > (float) arg2 && local245 < (float) arg3 && local247 > (float) arg3) {
			if (arg1) {
				return true;
			}
			if (Static520.anIntArray480.length < this.anInt4972) {
				Static520.anIntArray480 = new int[this.anInt4972];
				Static147.anIntArray134 = new int[this.anInt4972];
			}
			@Pc(704) int local704;
			for (@Pc(628) int local628 = 0; local628 < this.anInt4961; local628++) {
				local455 = (float) this.anIntArray283[local628];
				local460 = (float) this.anIntArray285[local628];
				local450 = (float) this.anIntArray281[local628];
				local502 = local33 + Static120.aFloat54 * local455 + local460 * Static591.aFloat181 + Static182.aFloat60 * local450;
				local488 = Static225.aFloat85 * local455 + local460 * Static452.aFloat156 + local450 * Static154.aFloat57 + local54;
				local474 = local165 + Static720.aFloat201 * local460 + Static278.aFloat91 * local450 + Static639.aFloat193 * local455;
				@Pc(711) int local711;
				@Pc(713) int local713;
				@Pc(722) int local722;
				if ((float) this.aClass67_Sub1_7.anInt6680 <= local474) {
					if (arg5 > 0) {
						local474 = (float) arg5;
					}
					local704 = (int) (local502 * (float) local251 / local474 + (float) this.aClass67_Sub1_7.anInt6668);
					local711 = (int) ((float) local255 * local488 / local474 + (float) this.aClass67_Sub1_7.anInt6671);
					local713 = this.anIntArray282[local628];
					local722 = this.anIntArray282[local628 + 1];
					for (@Pc(795) int local795 = local713; local795 < local722; local795++) {
						@Pc(804) int local804 = this.aShortArray91[local795] - 1;
						if (local804 == -1) {
							break;
						}
						Static520.anIntArray480[local804] = local704;
						Static147.anIntArray134[local804] = local711;
					}
				} else {
					local704 = this.anIntArray282[local628];
					local711 = this.anIntArray282[local628 + 1];
					for (local713 = local704; local713 < local711; local713++) {
						local722 = this.aShortArray91[local713] - 1;
						if (local722 == -1) {
							break;
						}
						Static520.anIntArray480[this.aShortArray91[local713] - 1] = -999999;
					}
				}
			}
			for (local704 = 0; local704 < this.anInt5004; local704++) {
				if (Static520.anIntArray480[this.aShortArray83[local704]] != -999999 && Static520.anIntArray480[this.aShortArray82[local704]] != -999999 && Static520.anIntArray480[this.aShortArray86[local704]] != -999999 && this.method4180(Static520.anIntArray480[this.aShortArray82[local704]], Static520.anIntArray480[this.aShortArray83[local704]], arg3, Static147.anIntArray134[this.aShortArray82[local704]], Static147.anIntArray134[this.aShortArray86[local704]], Static147.anIntArray134[this.aShortArray83[local704]], arg2, Static520.anIntArray480[this.aShortArray86[local704]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IILclient!iu;ZI)Z")
	@Override
	public boolean method5218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method4176(arg4, arg3, arg0, arg1, arg2, -1);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5213(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(43) int local43;
		@Pc(53) int[] local53;
		@Pc(55) int local55;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			local27 = 0;
			Static505.anInt8621 = 0;
			Static85.anInt1316 = 0;
			Static278.anInt5061 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (local43 < this.anIntArrayArray24.length) {
					local53 = this.anIntArrayArray24[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						Static278.anInt5061 += this.anIntArray281[local61];
						Static505.anInt8621 += this.anIntArray285[local61];
						local27++;
						Static85.anInt1316 += this.anIntArray283[local61];
					}
				}
			}
			if (local27 > 0) {
				Static278.anInt5061 = local21 + Static278.anInt5061 / local27;
				Static505.anInt8621 = Static505.anInt8621 / local27 + local25;
				Static85.anInt1316 = local17 + Static85.anInt1316 / local27;
			} else {
				Static278.anInt5061 = local21;
				Static85.anInt1316 = local17;
				Static505.anInt8621 = local25;
			}
			return;
		}
		@Pc(168) int[] local168;
		@Pc(170) int local170;
		if (arg0 == 1) {
			local25 = arg3 << 4;
			local21 = arg2 << 4;
			local17 = arg4 << 4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray24.length > local35) {
					local168 = this.anIntArrayArray24[local35];
					for (local170 = 0; local170 < local168.length; local170++) {
						local55 = local168[local170];
						this.anIntArray281[local55] += local21;
						this.anIntArray285[local55] += local25;
						this.anIntArray283[local55] += local17;
					}
				}
			}
			return;
		}
		@Pc(288) int local288;
		@Pc(307) int local307;
		@Pc(775) int local775;
		@Pc(784) int local784;
		if (arg0 == 2) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray24.length) {
					local168 = this.anIntArrayArray24[local35];
					if ((arg5 & 0x1) == 0) {
						for (local170 = 0; local170 < local168.length; local170++) {
							local55 = local168[local170];
							this.anIntArray281[local55] -= Static278.anInt5061;
							this.anIntArray285[local55] -= Static505.anInt8621;
							this.anIntArray283[local55] -= Static85.anInt1316;
							if (arg4 != 0) {
								local61 = Class3_Sub2_Sub21.anIntArray358[arg4];
								local288 = Class3_Sub2_Sub21.anIntArray356[arg4];
								local307 = local288 * this.anIntArray281[local55] + local61 * this.anIntArray285[local55] + 16383 >> 14;
								this.anIntArray285[local55] = local288 * this.anIntArray285[local55] + 16383 - local61 * this.anIntArray281[local55] >> 14;
								this.anIntArray281[local55] = local307;
							}
							if (arg2 != 0) {
								local61 = Class3_Sub2_Sub21.anIntArray358[arg2];
								local288 = Class3_Sub2_Sub21.anIntArray356[arg2];
								local307 = local288 * this.anIntArray285[local55] + 16383 - this.anIntArray283[local55] * local61 >> 14;
								this.anIntArray283[local55] = this.anIntArray285[local55] * local61 + this.anIntArray283[local55] * local288 + 16383 >> 14;
								this.anIntArray285[local55] = local307;
							}
							if (arg3 != 0) {
								local61 = Class3_Sub2_Sub21.anIntArray358[arg3];
								local288 = Class3_Sub2_Sub21.anIntArray356[arg3];
								local307 = this.anIntArray281[local55] * local288 + this.anIntArray283[local55] * local61 + 16383 >> 14;
								this.anIntArray283[local55] = local288 * this.anIntArray283[local55] + 16383 - local61 * this.anIntArray281[local55] >> 14;
								this.anIntArray281[local55] = local307;
							}
							this.anIntArray281[local55] += Static278.anInt5061;
							this.anIntArray285[local55] += Static505.anInt8621;
							this.anIntArray283[local55] += Static85.anInt1316;
						}
					} else {
						for (local170 = 0; local170 < local168.length; local170++) {
							local55 = local168[local170];
							this.anIntArray281[local55] -= Static278.anInt5061;
							this.anIntArray285[local55] -= Static505.anInt8621;
							this.anIntArray283[local55] -= Static85.anInt1316;
							if (arg2 != 0) {
								local61 = Class3_Sub2_Sub21.anIntArray358[arg2];
								local288 = Class3_Sub2_Sub21.anIntArray356[arg2];
								local307 = local288 * this.anIntArray285[local55] + 16383 - local61 * this.anIntArray283[local55] >> 14;
								this.anIntArray283[local55] = local61 * this.anIntArray285[local55] + local288 * this.anIntArray283[local55] + 16383 >> 14;
								this.anIntArray285[local55] = local307;
							}
							if (arg4 != 0) {
								local61 = Class3_Sub2_Sub21.anIntArray358[arg4];
								local288 = Class3_Sub2_Sub21.anIntArray356[arg4];
								local307 = local61 * this.anIntArray285[local55] + local288 * this.anIntArray281[local55] + 16383 >> 14;
								this.anIntArray285[local55] = this.anIntArray285[local55] * local288 + 16383 - local61 * this.anIntArray281[local55] >> 14;
								this.anIntArray281[local55] = local307;
							}
							if (arg3 != 0) {
								local61 = Class3_Sub2_Sub21.anIntArray358[arg3];
								local288 = Class3_Sub2_Sub21.anIntArray356[arg3];
								local307 = local288 * this.anIntArray281[local55] + local61 * this.anIntArray283[local55] + 16383 >> 14;
								this.anIntArray283[local55] = this.anIntArray283[local55] * local288 + 16383 - this.anIntArray281[local55] * local61 >> 14;
								this.anIntArray281[local55] = local307;
							}
							this.anIntArray281[local55] += Static278.anInt5061;
							this.anIntArray285[local55] += Static505.anInt8621;
							this.anIntArray283[local55] += Static85.anInt1316;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local43 = arg1[local35];
					if (local43 < this.anIntArrayArray24.length) {
						local53 = this.anIntArrayArray24[local43];
						for (local55 = 0; local55 < local53.length; local55++) {
							local61 = local53[local55];
							local288 = this.anIntArray282[local61];
							local307 = this.anIntArray282[local61 + 1];
							for (local775 = local288; local775 < local307; local775++) {
								local784 = this.aShortArray91[local775] - 1;
								if (local784 == -1) {
									break;
								}
								@Pc(796) int local796;
								@Pc(800) int local800;
								@Pc(818) int local818;
								if (arg4 != 0) {
									local796 = Class3_Sub2_Sub21.anIntArray358[arg4];
									local800 = Class3_Sub2_Sub21.anIntArray356[arg4];
									local818 = this.aShortArray84[local784] * local796 + local800 * this.aShortArray89[local784] + 16383 >> 14;
									this.aShortArray84[local784] = (short) (this.aShortArray84[local784] * local800 + 16383 - this.aShortArray89[local784] * local796 >> 14);
									this.aShortArray89[local784] = (short) local818;
								}
								if (arg2 != 0) {
									local796 = Class3_Sub2_Sub21.anIntArray358[arg2];
									local800 = Class3_Sub2_Sub21.anIntArray356[arg2];
									local818 = local800 * this.aShortArray84[local784] + 16383 - local796 * this.aShortArray88[local784] >> 14;
									this.aShortArray88[local784] = (short) (local796 * this.aShortArray84[local784] + local800 * this.aShortArray88[local784] + 16383 >> 14);
									this.aShortArray84[local784] = (short) local818;
								}
								if (arg3 != 0) {
									local796 = Class3_Sub2_Sub21.anIntArray358[arg3];
									local800 = Class3_Sub2_Sub21.anIntArray356[arg3];
									local818 = local796 * this.aShortArray88[local784] + local800 * this.aShortArray89[local784] + 16383 >> 14;
									this.aShortArray88[local784] = (short) (this.aShortArray88[local784] * local800 + 16383 - local796 * this.aShortArray89[local784] >> 14);
									this.aShortArray89[local784] = (short) local818;
								}
							}
						}
					}
				}
				this.method4178();
			}
		} else if (arg0 == 3) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray24.length) {
					local168 = this.anIntArrayArray24[local35];
					for (local170 = 0; local170 < local168.length; local170++) {
						local55 = local168[local170];
						this.anIntArray281[local55] -= Static278.anInt5061;
						this.anIntArray285[local55] -= Static505.anInt8621;
						this.anIntArray283[local55] -= Static85.anInt1316;
						this.anIntArray281[local55] = arg2 * this.anIntArray281[local55] >> 7;
						this.anIntArray285[local55] = arg3 * this.anIntArray285[local55] >> 7;
						this.anIntArray283[local55] = arg4 * this.anIntArray283[local55] >> 7;
						this.anIntArray281[local55] += Static278.anInt5061;
						this.anIntArray285[local55] += Static505.anInt8621;
						this.anIntArray283[local55] += Static85.anInt1316;
					}
				}
			}
		} else {
			@Pc(1267) Class200 local1267;
			@Pc(1139) boolean local1139;
			@Pc(1262) Class139 local1262;
			if (arg0 == 5) {
				if (this.anIntArrayArray23 != null) {
					local1139 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray23.length > local43) {
							local53 = this.anIntArrayArray23[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								local288 = arg2 * 8 + (this.aByteArray32[local61] & 0xFF);
								if (local288 < 0) {
									local288 = 0;
								} else if (local288 > 255) {
									local288 = 255;
								}
								this.aByteArray32[local61] = (byte) local288;
							}
							local1139 |= local53.length > 0;
						}
					}
					if (local1139) {
						if (this.aClass139Array1 != null) {
							for (local43 = 0; local43 < this.anInt4937; local43++) {
								local1262 = this.aClass139Array1[local43];
								local1267 = this.aClass200Array1[local43];
								local1267.anInt5720 = 255 - (this.aByteArray32[local1262.anInt4276] & 0xFF) << 24 | local1267.anInt5720 & 0xFFFFFF;
							}
						}
						this.method4174();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray23 != null) {
					local1139 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray23.length > local43) {
							local53 = this.anIntArrayArray23[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								local288 = this.aShortArray79[local61] & 0xFFFF;
								local307 = local288 >> 10 & 0x3F;
								local775 = local288 >> 7 & 0x7;
								local775 += arg3 / 4;
								@Pc(1372) int local1372 = local307 + arg2 & 0x3F;
								local784 = local288 & 0x7F;
								local784 += arg4;
								if (local775 < 0) {
									local775 = 0;
								} else if (local775 > 7) {
									local775 = 7;
								}
								if (local784 < 0) {
									local784 = 0;
								} else if (local784 > 127) {
									local784 = 127;
								}
								this.aShortArray79[local61] = (short) (local775 << 7 | local1372 << 10 | local784);
							}
							local1139 |= local53.length > 0;
						}
					}
					if (local1139) {
						if (this.aClass139Array1 != null) {
							for (local43 = 0; local43 < this.anInt4937; local43++) {
								local1262 = this.aClass139Array1[local43];
								local1267 = this.aClass200Array1[local43];
								local1267.anInt5720 = Static305.anIntArray309[this.aShortArray79[local1262.anInt4276] & 0xFFFF] & 0xFFFFFF | local1267.anInt5720 & 0xFF000000;
							}
						}
						this.method4174();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray25 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray25.length > local35) {
							local168 = this.anIntArrayArray25[local35];
							for (local170 = 0; local170 < local168.length; local170++) {
								local1267 = this.aClass200Array1[local168[local170]];
								local1267.anInt5726 += arg2;
								local1267.anInt5725 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray25 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray25.length > local35) {
							local168 = this.anIntArrayArray25[local35];
							for (local170 = 0; local170 < local168.length; local170++) {
								local1267 = this.aClass200Array1[local168[local170]];
								local1267.anInt5721 = local1267.anInt5721 * arg3 >> 7;
								local1267.anInt5727 = local1267.anInt5727 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray25 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray25.length > local35) {
						local168 = this.anIntArrayArray25[local35];
						for (local170 = 0; local170 < local168.length; local170++) {
							local1267 = this.aClass200Array1[local168[local170]];
							local1267.anInt5719 = local1267.anInt5719 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub2_Sub21.anIntArray358[arg0];
		@Pc(13) int local13 = Class3_Sub2_Sub21.anIntArray356[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4961; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray281[local15] + this.anIntArray283[local15] * local9 >> 14;
			this.anIntArray283[local15] = local13 * this.anIntArray283[local15] - this.anIntArray281[local15] * local9 >> 14;
			this.anIntArray281[local15] = local33;
		}
		this.method4181();
		this.aBoolean433 = false;
	}

	@OriginalMember(owner = "client!iha", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean433) {
			this.method4188();
		}
		return this.anInt5003;
	}

	@OriginalMember(owner = "client!iha", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5004; local7++) {
			if (arg0 == this.aShortArray79[local7]) {
				this.aShortArray79[local7] = arg1;
			}
		}
		if (this.aClass139Array1 != null) {
			for (@Pc(46) int local46 = 0; local46 < this.anInt4937; local46++) {
				@Pc(53) Class139 local53 = this.aClass139Array1[local46];
				@Pc(58) Class200 local58 = this.aClass200Array1[local46];
				local58.anInt5720 = Static305.anIntArray309[this.aShortArray79[local53.anInt4276] & 0xFFFF] & 0xFFFFFF | local58.anInt5720 & 0xFF000000;
			}
		}
		this.method4174();
	}

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "()[Lclient!sw;")
	@Override
	public Class348[] method5222() {
		return this.aClass348Array3;
	}

	@OriginalMember(owner = "client!iha", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean433) {
			this.method4188();
		}
		return this.anInt4955;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!iha;ZZILclient!iha;I)Lclient!ka;")
	private Class157 method4177(@OriginalArg(0) Class157_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class157_Sub2 arg3, @OriginalArg(5) int arg4) {
		arg0.anInt4986 = this.anInt4986;
		arg0.anInt4924 = this.anInt4924;
		arg0.anInt5004 = this.anInt5004;
		arg0.anInt4961 = this.anInt4961;
		arg0.aShort70 = this.aShort70;
		arg0.anInt4972 = this.anInt4972;
		arg0.aShort71 = this.aShort71;
		arg0.aBoolean430 = this.aBoolean430;
		if ((arg4 & 0x100) == 0) {
			arg0.aBoolean429 = this.aBoolean429;
		} else {
			arg0.aBoolean429 = true;
		}
		arg0.anInt4937 = this.anInt4937;
		arg0.anInt4935 = this.anInt4935;
		arg0.anInt4941 = arg4;
		@Pc(71) boolean local71 = Static213.method3324(this.anInt4986, arg4);
		@Pc(77) boolean local77 = Static119.method2065(arg4, this.anInt4986);
		@Pc(85) boolean local85 = Static343.method5023(this.anInt4986, arg4);
		@Pc(91) boolean local91 = local85 | local71 | local77;
		@Pc(240) int local240;
		if (local91) {
			if (!local71) {
				arg0.anIntArray281 = this.anIntArray281;
			} else if (arg3.anIntArray281 == null || this.anInt4924 > arg3.anIntArray281.length) {
				arg0.anIntArray281 = arg3.anIntArray281 = new int[this.anInt4924];
			} else {
				arg0.anIntArray281 = arg3.anIntArray281;
			}
			if (!local77) {
				arg0.anIntArray285 = this.anIntArray285;
			} else if (arg3.anIntArray285 == null || arg3.anIntArray285.length < this.anInt4924) {
				arg0.anIntArray285 = arg3.anIntArray285 = new int[this.anInt4924];
			} else {
				arg0.anIntArray285 = arg3.anIntArray285;
			}
			if (!local85) {
				arg0.anIntArray283 = this.anIntArray283;
			} else if (arg3.anIntArray283 == null || arg3.anIntArray283.length < this.anInt4924) {
				arg0.anIntArray283 = arg3.anIntArray283 = new int[this.anInt4924];
			} else {
				arg0.anIntArray283 = arg3.anIntArray283;
			}
			for (local240 = 0; local240 < this.anInt4924; local240++) {
				if (local71) {
					arg0.anIntArray281[local240] = this.anIntArray281[local240];
				}
				if (local77) {
					arg0.anIntArray285[local240] = this.anIntArray285[local240];
				}
				if (local85) {
					arg0.anIntArray283[local240] = this.anIntArray283[local240];
				}
			}
		} else {
			arg0.anIntArray285 = this.anIntArray285;
			arg0.anIntArray281 = this.anIntArray281;
			arg0.anIntArray283 = this.anIntArray283;
		}
		if (Static486.method7076(arg4, this.anInt4986)) {
			arg0.aClass376_3 = arg3.aClass376_3;
			arg0.aClass376_3.anInterface16_18 = this.aClass376_3.anInterface16_18;
			arg0.aClass376_3.aBoolean763 = this.aClass376_3.aBoolean763;
			arg0.aClass376_3.aBoolean764 = true;
		} else if (Static161.method2558(arg4, this.anInt4986)) {
			arg0.aClass376_3 = this.aClass376_3;
		} else {
			arg0.aClass376_3 = null;
		}
		if (Static309.method4680(this.anInt4986, arg4)) {
			if (arg3.aShortArray79 == null || arg3.aShortArray79.length < this.anInt5004) {
				arg0.aShortArray79 = arg3.aShortArray79 = new short[this.anInt5004];
			} else {
				arg0.aShortArray79 = arg3.aShortArray79;
			}
			for (local240 = 0; local240 < this.anInt5004; local240++) {
				arg0.aShortArray79[local240] = this.aShortArray79[local240];
			}
		} else {
			arg0.aShortArray79 = this.aShortArray79;
		}
		if (Static10.method141(this.anInt4986, arg4)) {
			if (arg3.aByteArray32 == null || this.anInt5004 > arg3.aByteArray32.length) {
				arg0.aByteArray32 = arg3.aByteArray32 = new byte[this.anInt5004];
			} else {
				arg0.aByteArray32 = arg3.aByteArray32;
			}
			for (local240 = 0; local240 < this.anInt5004; local240++) {
				arg0.aByteArray32[local240] = this.aByteArray32[local240];
			}
		} else {
			arg0.aByteArray32 = this.aByteArray32;
		}
		if (Static284.method4284(arg4, this.anInt4986)) {
			arg0.aClass376_2 = arg3.aClass376_2;
			arg0.aClass376_2.anInterface16_18 = this.aClass376_2.anInterface16_18;
			arg0.aClass376_2.aBoolean764 = true;
			arg0.aClass376_2.aBoolean763 = this.aClass376_2.aBoolean763;
		} else if (Static272.method4183(arg4, this.anInt4986)) {
			arg0.aClass376_2 = this.aClass376_2;
		} else {
			arg0.aClass376_2 = null;
		}
		@Pc(703) int local703;
		if (Static71.method909(arg4, this.anInt4986)) {
			if (arg3.aShortArray89 == null || this.anInt4972 > arg3.aShortArray89.length) {
				local240 = this.anInt4972;
				arg0.aShortArray84 = arg3.aShortArray84 = new short[local240];
				arg0.aShortArray89 = arg3.aShortArray89 = new short[local240];
				arg0.aShortArray88 = arg3.aShortArray88 = new short[local240];
			} else {
				arg0.aShortArray84 = arg3.aShortArray84;
				arg0.aShortArray89 = arg3.aShortArray89;
				arg0.aShortArray88 = arg3.aShortArray88;
			}
			if (this.aClass103_1 == null) {
				arg0.aClass103_1 = null;
				for (local240 = 0; local240 < this.anInt4972; local240++) {
					arg0.aShortArray89[local240] = this.aShortArray89[local240];
					arg0.aShortArray84[local240] = this.aShortArray84[local240];
					arg0.aShortArray88[local240] = this.aShortArray88[local240];
				}
			} else {
				if (arg3.aClass103_1 == null) {
					arg3.aClass103_1 = new Class103();
				}
				@Pc(685) Class103 local685 = arg0.aClass103_1 = arg3.aClass103_1;
				if (local685.aShortArray45 == null || local685.aShortArray45.length < this.anInt4972) {
					local703 = this.anInt4972;
					local685.aShortArray45 = new short[local703];
					local685.aShortArray44 = new short[local703];
					local685.aByteArray14 = new byte[local703];
					local685.aShortArray43 = new short[local703];
				}
				for (local703 = 0; local703 < this.anInt4972; local703++) {
					arg0.aShortArray89[local703] = this.aShortArray89[local703];
					arg0.aShortArray84[local703] = this.aShortArray84[local703];
					arg0.aShortArray88[local703] = this.aShortArray88[local703];
					local685.aShortArray45[local703] = this.aClass103_1.aShortArray45[local703];
					local685.aShortArray43[local703] = this.aClass103_1.aShortArray43[local703];
					local685.aShortArray44[local703] = this.aClass103_1.aShortArray44[local703];
					local685.aByteArray14[local703] = this.aClass103_1.aByteArray14[local703];
				}
			}
			arg0.aByteArray33 = this.aByteArray33;
		} else {
			arg0.aShortArray84 = this.aShortArray84;
			arg0.aShortArray89 = this.aShortArray89;
			arg0.aClass103_1 = this.aClass103_1;
			arg0.aByteArray33 = this.aByteArray33;
			arg0.aShortArray88 = this.aShortArray88;
		}
		if (Static471.method8864(arg4, this.anInt4986)) {
			arg0.aClass376_1 = arg3.aClass376_1;
			arg0.aClass376_1.aBoolean763 = this.aClass376_1.aBoolean763;
			arg0.aClass376_1.anInterface16_18 = this.aClass376_1.anInterface16_18;
			arg0.aClass376_1.aBoolean764 = true;
		} else if (Static475.method6988(this.anInt4986, arg4)) {
			arg0.aClass376_1 = this.aClass376_1;
		} else {
			arg0.aClass376_1 = null;
		}
		if (Static111.method1983(this.anInt4986, arg4)) {
			if (arg3.aFloatArray47 == null || this.anInt5004 > arg3.aFloatArray47.length) {
				local240 = this.anInt4972;
				arg0.aFloatArray47 = arg3.aFloatArray47 = new float[local240];
				arg0.aFloatArray48 = arg3.aFloatArray48 = new float[local240];
			} else {
				arg0.aFloatArray47 = arg3.aFloatArray47;
				arg0.aFloatArray48 = arg3.aFloatArray48;
			}
			for (local240 = 0; local240 < this.anInt4972; local240++) {
				arg0.aFloatArray47[local240] = this.aFloatArray47[local240];
				arg0.aFloatArray48[local240] = this.aFloatArray48[local240];
			}
		} else {
			arg0.aFloatArray48 = this.aFloatArray48;
			arg0.aFloatArray47 = this.aFloatArray47;
		}
		if (Static165.method2650(this.anInt4986, arg4)) {
			arg0.aClass376_4 = arg3.aClass376_4;
			arg0.aClass376_4.anInterface16_18 = this.aClass376_4.anInterface16_18;
			arg0.aClass376_4.aBoolean764 = true;
			arg0.aClass376_4.aBoolean763 = this.aClass376_4.aBoolean763;
		} else if (Static206.method9439(this.anInt4986, arg4)) {
			arg0.aClass376_4 = this.aClass376_4;
		} else {
			arg0.aClass376_4 = null;
		}
		if (Static1.method7205(arg4, this.anInt4986)) {
			if (arg3.aShortArray83 == null || this.anInt5004 > arg3.aShortArray83.length) {
				local240 = this.anInt5004;
				arg0.aShortArray82 = arg3.aShortArray82 = new short[local240];
				arg0.aShortArray86 = arg3.aShortArray86 = new short[local240];
				arg0.aShortArray83 = arg3.aShortArray83 = new short[local240];
			} else {
				arg0.aShortArray86 = arg3.aShortArray86;
				arg0.aShortArray83 = arg3.aShortArray83;
				arg0.aShortArray82 = arg3.aShortArray82;
			}
			for (local240 = 0; local240 < this.anInt5004; local240++) {
				arg0.aShortArray83[local240] = this.aShortArray83[local240];
				arg0.aShortArray82[local240] = this.aShortArray82[local240];
				arg0.aShortArray86[local240] = this.aShortArray86[local240];
			}
		} else {
			arg0.aShortArray82 = this.aShortArray82;
			arg0.aShortArray86 = this.aShortArray86;
			arg0.aShortArray83 = this.aShortArray83;
		}
		if (Static506.method7242(arg4, this.anInt4986)) {
			arg0.aClass311_1 = arg3.aClass311_1;
			arg0.aClass311_1.aBoolean662 = this.aClass311_1.aBoolean662;
			arg0.aClass311_1.anInterface5_7 = this.aClass311_1.anInterface5_7;
			arg0.aClass311_1.aBoolean663 = true;
		} else if (Static390.method5896(arg4, this.anInt4986)) {
			arg0.aClass311_1 = this.aClass311_1;
		} else {
			arg0.aClass311_1 = null;
		}
		if (Static266.method4099(this.anInt4986, arg4)) {
			if (arg3.aShortArray87 == null || arg3.aShortArray87.length < this.anInt5004) {
				local240 = this.anInt5004;
				arg0.aShortArray87 = arg3.aShortArray87 = new short[local240];
			} else {
				arg0.aShortArray87 = arg3.aShortArray87;
			}
			for (local240 = 0; local240 < this.anInt5004; local240++) {
				arg0.aShortArray87[local240] = this.aShortArray87[local240];
			}
		} else {
			arg0.aShortArray87 = this.aShortArray87;
		}
		if (!Static343.method5025(arg4, this.anInt4986)) {
			arg0.aClass200Array1 = this.aClass200Array1;
		} else if (arg3.aClass200Array1 == null || arg3.aClass200Array1.length < this.anInt4937) {
			local240 = this.anInt4937;
			arg0.aClass200Array1 = arg3.aClass200Array1 = new Class200[local240];
			for (local703 = 0; local703 < this.anInt4937; local703++) {
				arg0.aClass200Array1[local703] = this.aClass200Array1[local703].method4882();
			}
		} else {
			arg0.aClass200Array1 = arg3.aClass200Array1;
			for (local240 = 0; local240 < this.anInt4937; local240++) {
				arg0.aClass200Array1[local240].method4880(this.aClass200Array1[local240]);
			}
		}
		arg0.anIntArrayArray24 = this.anIntArrayArray24;
		arg0.anIntArray284 = this.anIntArray284;
		arg0.anIntArrayArray25 = this.anIntArrayArray25;
		arg0.aShortArray91 = this.aShortArray91;
		arg0.anIntArray286 = this.anIntArray286;
		arg0.aShortArray90 = this.aShortArray90;
		arg0.aClass139Array1 = this.aClass139Array1;
		arg0.aShortArray85 = this.aShortArray85;
		arg0.anIntArray282 = this.anIntArray282;
		arg0.anIntArray279 = this.anIntArray279;
		arg0.aClass348Array3 = this.aClass348Array3;
		arg0.aClass156Array3 = this.aClass156Array3;
		arg0.aShortArray80 = this.aShortArray80;
		if (this.aBoolean433) {
			arg0.anInt4995 = this.anInt4995;
			arg0.anInt5003 = this.anInt5003;
			arg0.anInt4985 = this.anInt4985;
			arg0.anInt4950 = this.anInt4950;
			arg0.anInt4955 = this.anInt4955;
			arg0.aBoolean433 = true;
			arg0.anInt4968 = this.anInt4968;
			arg0.anInt4956 = this.anInt4956;
			arg0.anInt4928 = this.anInt4928;
		} else {
			arg0.aBoolean433 = false;
		}
		arg0.anIntArrayArray23 = this.anIntArrayArray23;
		arg0.aShortArray81 = this.aShortArray81;
		return arg0;
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(B)V")
	private void method4178() {
		if ((this.anInt4986 & 0x37) == 0) {
			if (this.aClass376_2 != null) {
				this.aClass376_2.aBoolean763 = false;
			}
		} else if (this.aClass376_1 != null) {
			this.aClass376_1.aBoolean763 = false;
		}
	}

	@OriginalMember(owner = "client!iha", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4961; local3++) {
			if (arg0 != 128) {
				this.anIntArray281[local3] = arg0 * this.anIntArray281[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray285[local3] = this.anIntArray285[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray283[local3] = arg2 * this.anIntArray283[local3] >> 7;
			}
		}
		this.method4181();
		this.aBoolean433 = false;
	}

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "(I)V")
	public void method4179() {
		if (this.aClass376_3 != null) {
			this.aClass376_3.method8824();
		}
		if (this.aClass376_4 != null) {
			this.aClass376_4.method8824();
		}
		if (this.aClass376_2 != null) {
			this.aClass376_2.method8824();
		}
		if (this.aClass376_1 != null) {
			this.aClass376_1.method8824();
		}
		if (this.aClass311_1 != null) {
			this.aClass311_1.method7512();
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!iu;Lclient!laa;II)V")
	@Override
	public void method5227(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class19_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4972 == 0) {
			return;
		}
		@Pc(17) Class181_Sub1 local17 = this.aClass67_Sub1_7.aClass181_Sub1_16;
		@Pc(20) Class181_Sub1 local20 = (Class181_Sub1) arg0;
		if (!this.aBoolean433) {
			this.method4188();
		}
		Static720.aFloat201 = local20.aFloat101 * local17.aFloat107 + local20.aFloat99 * local17.aFloat105 + local20.aFloat98 * local17.aFloat101;
		Static296.aFloat62 = local17.aFloat106 + local17.aFloat107 * local20.aFloat106 + local20.aFloat97 * local17.aFloat105 + local17.aFloat101 * local20.aFloat103;
		@Pc(75) float local75 = Static296.aFloat62 + Static720.aFloat201 * (float) this.anInt5003;
		@Pc(83) float local83 = Static720.aFloat201 * (float) this.anInt4985 + Static296.aFloat62;
		@Pc(94) float local94;
		@Pc(100) float local100;
		if (local75 > local83) {
			local94 = (float) -this.anInt4968 + local83;
			local100 = (float) this.anInt4968 + local75;
		} else {
			local100 = local83 + (float) this.anInt4968;
			local94 = (float) -this.anInt4968 + local75;
		}
		if (local94 >= this.aClass67_Sub1_7.aFloat112 || local100 <= (float) this.aClass67_Sub1_7.anInt6680) {
			return;
		}
		Static591.aFloat181 = local20.aFloat98 * local17.aFloat99 + local20.aFloat99 * local17.aFloat100 + local17.aFloat108 * local20.aFloat101;
		Static101.aFloat18 = local17.aFloat97 + local20.aFloat103 * local17.aFloat99 + local17.aFloat100 * local20.aFloat97 + local17.aFloat108 * local20.aFloat106;
		@Pc(179) float local179 = (float) this.anInt5003 * Static591.aFloat181 + Static101.aFloat18;
		@Pc(187) float local187 = (float) this.anInt4985 * Static591.aFloat181 + Static101.aFloat18;
		@Pc(202) float local202;
		@Pc(213) float local213;
		if (local187 < local179) {
			local202 = (float) this.aClass67_Sub1_7.anInt6667 * (local187 - (float) this.anInt4968);
			local213 = (float) this.aClass67_Sub1_7.anInt6667 * ((float) this.anInt4968 + local179);
		} else {
			local202 = (local179 - (float) this.anInt4968) * (float) this.aClass67_Sub1_7.anInt6667;
			local213 = (float) this.aClass67_Sub1_7.anInt6667 * (local187 + (float) this.anInt4968);
		}
		if (local202 / (float) arg2 >= this.aClass67_Sub1_7.aFloat115 || local213 / (float) arg2 <= this.aClass67_Sub1_7.aFloat116) {
			return;
		}
		Static452.aFloat156 = local20.aFloat98 * local17.aFloat98 + local17.aFloat104 * local20.aFloat99 + local17.aFloat102 * local20.aFloat101;
		Static616.aFloat185 = local17.aFloat102 * local20.aFloat106 + local17.aFloat98 * local20.aFloat103 + local20.aFloat97 * local17.aFloat104 + local17.aFloat103;
		@Pc(306) float local306 = Static452.aFloat156 * (float) this.anInt5003 + Static616.aFloat185;
		@Pc(314) float local314 = (float) this.anInt4985 * Static452.aFloat156 + Static616.aFloat185;
		@Pc(330) float local330;
		@Pc(341) float local341;
		if (local306 > local314) {
			local330 = (float) this.aClass67_Sub1_7.anInt6678 * ((float) -this.anInt4968 + local314);
			local341 = (local306 + (float) this.anInt4968) * (float) this.aClass67_Sub1_7.anInt6678;
		} else {
			local341 = ((float) this.anInt4968 + local314) * (float) this.aClass67_Sub1_7.anInt6678;
			local330 = (float) this.aClass67_Sub1_7.anInt6678 * ((float) -this.anInt4968 + local306);
		}
		if (local330 / (float) arg2 >= this.aClass67_Sub1_7.aFloat118 || local341 / (float) arg2 <= this.aClass67_Sub1_7.aFloat123) {
			return;
		}
		if (arg1 != null || this.aClass139Array1 != null) {
			Static639.aFloat193 = local20.aFloat102 * local17.aFloat101 + local17.aFloat105 * local20.aFloat108 + local17.aFloat107 * local20.aFloat107;
			Static278.aFloat91 = local20.aFloat105 * local17.aFloat107 + local20.aFloat100 * local17.aFloat105 + local20.aFloat104 * local17.aFloat101;
			Static154.aFloat57 = local20.aFloat105 * local17.aFloat102 + local17.aFloat104 * local20.aFloat100 + local20.aFloat104 * local17.aFloat98;
			Static120.aFloat54 = local17.aFloat108 * local20.aFloat107 + local20.aFloat102 * local17.aFloat99 + local17.aFloat100 * local20.aFloat108;
			Static225.aFloat85 = local20.aFloat107 * local17.aFloat102 + local20.aFloat102 * local17.aFloat98 + local17.aFloat104 * local20.aFloat108;
			Static182.aFloat60 = local20.aFloat105 * local17.aFloat108 + local17.aFloat99 * local20.aFloat104 + local17.aFloat100 * local20.aFloat100;
		}
		if (arg1 != null) {
			@Pc(515) int local515 = this.anInt4950 + this.anInt4995 >> 1;
			@Pc(524) int local524 = this.anInt4955 + this.anInt4956 >> 1;
			@Pc(543) int local543 = (int) ((float) local524 * Static120.aFloat54 + Static101.aFloat18 + Static182.aFloat60 * (float) local515 + Static591.aFloat181 * (float) this.anInt5003);
			@Pc(562) int local562 = (int) (Static154.aFloat57 * (float) local515 + Static616.aFloat185 + Static452.aFloat156 * (float) this.anInt5003 + Static225.aFloat85 * (float) local524);
			@Pc(581) int local581 = (int) (Static639.aFloat193 * (float) local524 + (float) this.anInt5003 * Static720.aFloat201 + Static296.aFloat62 + (float) local515 * Static278.aFloat91);
			@Pc(600) int local600 = (int) (Static120.aFloat54 * (float) local524 + (float) local515 * Static182.aFloat60 + Static101.aFloat18 + Static591.aFloat181 * (float) this.anInt4985);
			@Pc(619) int local619 = (int) (Static616.aFloat185 + Static154.aFloat57 * (float) local515 + Static452.aFloat156 * (float) this.anInt4985 + (float) local524 * Static225.aFloat85);
			arg1.anInt5950 = local600 * this.aClass67_Sub1_7.anInt6667 / arg2 + this.aClass67_Sub1_7.anInt6668;
			arg1.anInt5947 = this.aClass67_Sub1_7.anInt6667 * local543 / arg2 + this.aClass67_Sub1_7.anInt6668;
			arg1.anInt5948 = this.aClass67_Sub1_7.anInt6671 + this.aClass67_Sub1_7.anInt6678 * local562 / arg2;
			@Pc(678) int local678 = (int) (Static296.aFloat62 + (float) local515 * Static278.aFloat91 + (float) this.anInt4985 * Static720.aFloat201 + Static639.aFloat193 * (float) local524);
			arg1.anInt5946 = local619 * this.aClass67_Sub1_7.anInt6678 / arg2 + this.aClass67_Sub1_7.anInt6671;
			if (this.aClass67_Sub1_7.anInt6680 <= local581 || local678 >= this.aClass67_Sub1_7.anInt6680) {
				arg1.aBoolean477 = true;
				arg1.anInt5949 = this.aClass67_Sub1_7.anInt6667 * (local543 + this.anInt4968) / arg2 + this.aClass67_Sub1_7.anInt6668 - arg1.anInt5947;
			}
		}
		this.aClass67_Sub1_7.method5615((float) arg2);
		this.aClass67_Sub1_7.method5653();
		this.aClass67_Sub1_7.method5627(local20);
		this.method4186();
		this.method4187();
	}

	@OriginalMember(owner = "client!iha", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4961; local7++) {
			if (arg0 != 0) {
				this.anIntArray281[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray285[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray283[local7] += arg2;
			}
		}
		this.method4181();
		this.aBoolean433 = false;
	}

	@OriginalMember(owner = "client!iha", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort70 = (short) arg0;
		this.method4174();
	}

	@OriginalMember(owner = "client!iha", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort71 = (short) arg0;
		this.method4181();
		this.method4178();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIIBIIIII)Z")
	private boolean method4180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > arg2 && arg2 < arg3 && arg4 > arg2) {
			return false;
		} else if (arg5 < arg2 && arg2 > arg3 && arg2 > arg4) {
			return false;
		} else if (arg6 < arg1 && arg0 > arg6 && arg6 < arg7) {
			return false;
		} else {
			return arg6 <= arg1 || arg0 >= arg6 || arg6 <= arg7;
		}
	}

	@OriginalMember(owner = "client!iha", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4961; local3++) {
			this.anIntArray283[local3] = -this.anIntArray283[local3];
		}
		for (@Pc(31) int local31 = 0; local31 < this.anInt4972; local31++) {
			this.aShortArray88[local31] = (short) -this.aShortArray88[local31];
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt5004; local58++) {
			@Pc(69) short local69 = this.aShortArray83[local58];
			this.aShortArray83[local58] = this.aShortArray86[local58];
			this.aShortArray86[local58] = local69;
		}
		this.method4181();
		this.method4178();
		this.method4175();
		this.aBoolean433 = false;
	}

	@OriginalMember(owner = "client!iha", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(58) int local58;
		@Pc(40) int local40;
		@Pc(50) int[] local50;
		@Pc(52) int local52;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static505.anInt8621 = 0;
			local26 = 0;
			Static278.anInt5061 = 0;
			Static85.anInt1316 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (local40 < this.anIntArrayArray24.length) {
					local50 = this.anIntArrayArray24[local40];
					for (local52 = 0; local52 < local50.length; local52++) {
						local58 = local50[local52];
						if (this.aShortArray81 == null || (this.aShortArray81[local58] & arg6) != 0) {
							Static278.anInt5061 += this.anIntArray281[local58];
							Static505.anInt8621 += this.anIntArray285[local58];
							Static85.anInt1316 += this.anIntArray283[local58];
							local26++;
						}
					}
				}
			}
			if (local26 > 0) {
				Static37.aBoolean55 = true;
				Static505.anInt8621 = Static505.anInt8621 / local26 + arg3;
				Static278.anInt5061 = arg2 + Static278.anInt5061 / local26;
				Static85.anInt1316 = arg4 + Static85.anInt1316 / local26;
			} else {
				Static85.anInt1316 = arg4;
				Static505.anInt8621 = arg3;
				Static278.anInt5061 = arg2;
			}
			return;
		}
		@Pc(263) int[] local263;
		@Pc(265) int local265;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg4 * arg7[2] + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
				local32 = arg7[3] * arg2 + arg3 * arg7[4] + arg7[5] * arg4 + 8192 >> 14;
				local40 = arg7[7] * arg3 + arg7[6] * arg2 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local26;
				arg3 = local32;
				arg4 = local40;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray24.length) {
					local263 = this.anIntArrayArray24[local32];
					for (local265 = 0; local265 < local263.length; local265++) {
						local52 = local263[local265];
						if (this.aShortArray81 == null || (this.aShortArray81[local52] & arg6) != 0) {
							this.anIntArray281[local52] += arg2;
							this.anIntArray285[local52] += arg3;
							this.anIntArray283[local52] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(399) int local399;
		@Pc(421) int local421;
		@Pc(452) int local452;
		@Pc(479) int local479;
		@Pc(483) int local483;
		@Pc(487) int local487;
		@Pc(491) int local491;
		@Pc(499) int local499;
		@Pc(507) int local507;
		@Pc(660) int local660;
		@Pc(685) int local685;
		@Pc(689) int local689;
		@Pc(697) int local697;
		@Pc(702) int local702;
		@Pc(706) int local706;
		@Pc(710) int local710;
		@Pc(712) int local712;
		@Pc(846) int[] local846;
		@Pc(848) int local848;
		@Pc(854) int local854;
		@Pc(858) int local858;
		@Pc(860) int local860;
		@Pc(996) int local996;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray24.length > local32) {
						local263 = this.anIntArrayArray24[local32];
						for (local265 = 0; local265 < local263.length; local265++) {
							local52 = local263[local265];
							if (this.aShortArray81 == null || (arg6 & this.aShortArray81[local52]) != 0) {
								this.anIntArray281[local52] -= Static278.anInt5061;
								this.anIntArray285[local52] -= Static505.anInt8621;
								this.anIntArray283[local52] -= Static85.anInt1316;
								if (arg4 != 0) {
									local58 = Class3_Sub2_Sub21.anIntArray358[arg4];
									local399 = Class3_Sub2_Sub21.anIntArray356[arg4];
									local421 = local399 * this.anIntArray281[local52] + this.anIntArray285[local52] * local58 + 16383 >> 14;
									this.anIntArray285[local52] = local399 * this.anIntArray285[local52] + 16383 - this.anIntArray281[local52] * local58 >> 14;
									this.anIntArray281[local52] = local421;
								}
								if (arg2 != 0) {
									local58 = Class3_Sub2_Sub21.anIntArray358[arg2];
									local399 = Class3_Sub2_Sub21.anIntArray356[arg2];
									local421 = this.anIntArray285[local52] * local399 + 16383 - local58 * this.anIntArray283[local52] >> 14;
									this.anIntArray283[local52] = local58 * this.anIntArray285[local52] + this.anIntArray283[local52] * local399 + 16383 >> 14;
									this.anIntArray285[local52] = local421;
								}
								if (arg3 != 0) {
									local58 = Class3_Sub2_Sub21.anIntArray358[arg3];
									local399 = Class3_Sub2_Sub21.anIntArray356[arg3];
									local421 = this.anIntArray283[local52] * local58 + this.anIntArray281[local52] * local399 + 16383 >> 14;
									this.anIntArray283[local52] = this.anIntArray283[local52] * local399 + 16383 - local58 * this.anIntArray281[local52] >> 14;
									this.anIntArray281[local52] = local421;
								}
								this.anIntArray281[local52] += Static278.anInt5061;
								this.anIntArray285[local52] += Static505.anInt8621;
								this.anIntArray283[local52] += Static85.anInt1316;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (local40 < this.anIntArrayArray24.length) {
							local50 = this.anIntArrayArray24[local40];
							for (local52 = 0; local52 < local50.length; local52++) {
								local58 = local50[local52];
								if (this.aShortArray81 == null || (this.aShortArray81[local58] & arg6) != 0) {
									local399 = this.anIntArray282[local58];
									local421 = this.anIntArray282[local58 + 1];
									for (local452 = local399; local452 < local421; local452++) {
										local479 = this.aShortArray91[local452] - 1;
										if (local479 == -1) {
											break;
										}
										if (arg4 != 0) {
											local483 = Class3_Sub2_Sub21.anIntArray358[arg4];
											local487 = Class3_Sub2_Sub21.anIntArray356[arg4];
											local491 = local487 * this.aShortArray89[local479] + local483 * this.aShortArray84[local479] + 16383 >> 14;
											this.aShortArray84[local479] = (short) (local487 * this.aShortArray84[local479] + 16383 - local483 * this.aShortArray89[local479] >> 14);
											this.aShortArray89[local479] = (short) local491;
										}
										if (arg2 != 0) {
											local483 = Class3_Sub2_Sub21.anIntArray358[arg2];
											local487 = Class3_Sub2_Sub21.anIntArray356[arg2];
											local491 = this.aShortArray84[local479] * local487 + 16383 - this.aShortArray88[local479] * local483 >> 14;
											this.aShortArray88[local479] = (short) (local487 * this.aShortArray88[local479] + this.aShortArray84[local479] * local483 + 16383 >> 14);
											this.aShortArray84[local479] = (short) local491;
										}
										if (arg3 != 0) {
											local483 = Class3_Sub2_Sub21.anIntArray358[arg3];
											local487 = Class3_Sub2_Sub21.anIntArray356[arg3];
											local491 = local487 * this.aShortArray89[local479] + this.aShortArray88[local479] * local483 + 16383 >> 14;
											this.aShortArray88[local479] = (short) (local487 * this.aShortArray88[local479] + 16383 - local483 * this.aShortArray89[local479] >> 14);
											this.aShortArray89[local479] = (short) local491;
										}
									}
								}
							}
						}
					}
					this.method4178();
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local40 = arg7[11] << 4;
				local265 = arg7[12] << 4;
				local52 = arg7[13] << 4;
				local58 = arg7[14] << 4;
				if (Static37.aBoolean55) {
					local399 = arg7[3] * Static505.anInt8621 + Static278.anInt5061 * arg7[0] + Static85.anInt1316 * arg7[6] + 8192 >> 14;
					local421 = Static85.anInt1316 * arg7[7] + arg7[1] * Static278.anInt5061 + arg7[4] * Static505.anInt8621 + 8192 >> 14;
					local421 += local52;
					local399 += local265;
					local452 = Static85.anInt1316 * arg7[8] + Static278.anInt5061 * arg7[2] + Static505.anInt8621 * arg7[5] + 8192 >> 14;
					local452 += local58;
					Static278.anInt5061 = local399;
					Static505.anInt8621 = local421;
					Static85.anInt1316 = local452;
					Static37.aBoolean55 = false;
				}
				@Pc(467) int[] local467 = new int[9];
				local421 = Class3_Sub2_Sub21.anIntArray356[arg2];
				local452 = Class3_Sub2_Sub21.anIntArray358[arg2];
				local479 = Class3_Sub2_Sub21.anIntArray356[arg3];
				local483 = Class3_Sub2_Sub21.anIntArray358[arg3];
				local487 = Class3_Sub2_Sub21.anIntArray356[arg4];
				local491 = Class3_Sub2_Sub21.anIntArray358[arg4];
				local499 = local487 * local452 + 8192 >> 14;
				local507 = local491 * local452 + 8192 >> 14;
				local467[8] = local479 * local421 + 8192 >> 14;
				local467[2] = local483 * local421 + 8192 >> 14;
				local467[4] = local487 * local421 + 8192 >> 14;
				local467[7] = local499 * local479 + local483 * local491 + 8192 >> 14;
				local467[0] = local483 * local507 + local487 * local479 + 8192 >> 14;
				local467[3] = local421 * local491 + 8192 >> 14;
				local467[1] = local491 * -local479 + local483 * local499 + 8192 >> 14;
				local467[5] = -local452;
				local467[6] = local487 * -local483 + local479 * local507 + 8192 >> 14;
				@Pc(635) int local635 = -Static85.anInt1316 * local467[2] + -Static278.anInt5061 * local467[0] + local467[1] * -Static505.anInt8621 + 8192 >> 14;
				local660 = local467[5] * -Static85.anInt1316 + local467[4] * -Static505.anInt8621 + local467[3] * -Static278.anInt5061 + 8192 >> 14;
				local685 = local467[7] * -Static505.anInt8621 + local467[6] * -Static278.anInt5061 + -Static85.anInt1316 * local467[8] + 8192 >> 14;
				local689 = Static278.anInt5061 + local635;
				@Pc(693) int local693 = Static505.anInt8621 + local660;
				local697 = local685 + Static85.anInt1316;
				@Pc(700) int[] local700 = new int[9];
				for (local702 = 0; local702 < 3; local702++) {
					for (local706 = 0; local706 < 3; local706++) {
						local710 = 0;
						for (local712 = 0; local712 < 3; local712++) {
							local710 += arg7[local712 + local706 * 3] * local467[local712 + local702 * 3];
						}
						local700[local702 * 3 + local706] = local710 + 8192 >> 14;
					}
				}
				local706 = local467[2] * local58 + local52 * local467[1] + local265 * local467[0] + 8192 >> 14;
				local710 = local58 * local467[5] + local52 * local467[4] + local265 * local467[3] + 8192 >> 14;
				local706 += local689;
				local712 = local467[8] * local58 + local467[7] * local52 + local467[6] * local265 + 8192 >> 14;
				local710 += local693;
				local712 += local697;
				local846 = new int[9];
				for (local848 = 0; local848 < 3; local848++) {
					for (local854 = 0; local854 < 3; local854++) {
						local858 = 0;
						for (local860 = 0; local860 < 3; local860++) {
							local858 += arg7[local860 + local848 * 3] * local700[local860 * 3 + local854];
						}
						local846[local848 * 3 + local854] = local858 + 8192 >> 14;
					}
				}
				local854 = arg7[0] * local706 + arg7[1] * local710 + arg7[2] * local712 + 8192 >> 14;
				local858 = arg7[3] * local706 + local710 * arg7[4] + arg7[5] * local712 + 8192 >> 14;
				local858 += local32;
				local860 = local712 * arg7[8] + arg7[6] * local706 + arg7[7] * local710 + 8192 >> 14;
				local854 += local26;
				local860 += local40;
				for (local996 = 0; local996 < local8; local996++) {
					@Pc(1004) int local1004 = arg1[local996];
					if (this.anIntArrayArray24.length > local1004) {
						@Pc(1014) int[] local1014 = this.anIntArrayArray24[local1004];
						for (@Pc(1016) int local1016 = 0; local1016 < local1014.length; local1016++) {
							@Pc(1022) int local1022 = local1014[local1016];
							if (this.aShortArray81 == null || (arg6 & this.aShortArray81[local1022]) != 0) {
								@Pc(1065) int local1065 = local846[1] * this.anIntArray285[local1022] + local846[0] * this.anIntArray281[local1022] + this.anIntArray283[local1022] * local846[2] + 8192 >> 14;
								@Pc(1096) int local1096 = this.anIntArray281[local1022] * local846[3] + this.anIntArray285[local1022] * local846[4] + local846[5] * this.anIntArray283[local1022] + 8192 >> 14;
								@Pc(1100) int local1100 = local1065 + local854;
								@Pc(1131) int local1131 = local846[8] * this.anIntArray283[local1022] + local846[7] * this.anIntArray285[local1022] + this.anIntArray281[local1022] * local846[6] + 8192 >> 14;
								@Pc(1135) int local1135 = local1096 + local858;
								@Pc(1139) int local1139 = local1131 + local860;
								this.anIntArray281[local1022] = local1100;
								this.anIntArray285[local1022] = local1135;
								this.anIntArray283[local1022] = local1139;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2680) Class200 local2680;
			@Pc(2556) boolean local2556;
			@Pc(2675) Class139 local2675;
			if (arg0 == 5) {
				if (this.anIntArrayArray23 != null) {
					local2556 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (this.anIntArrayArray23.length > local40) {
							local50 = this.anIntArrayArray23[local40];
							for (local52 = 0; local52 < local50.length; local52++) {
								local58 = local50[local52];
								if (this.aShortArray85 == null || (this.aShortArray85[local58] & arg6) != 0) {
									local399 = arg2 * 8 + (this.aByteArray32[local58] & 0xFF);
									if (local399 < 0) {
										local399 = 0;
									} else if (local399 > 255) {
										local399 = 255;
									}
									this.aByteArray32[local58] = (byte) local399;
								}
							}
							local2556 |= local50.length > 0;
						}
					}
					if (local2556) {
						if (this.aClass139Array1 != null) {
							for (local40 = 0; local40 < this.anInt4937; local40++) {
								local2675 = this.aClass139Array1[local40];
								local2680 = this.aClass200Array1[local40];
								local2680.anInt5720 = 255 - (this.aByteArray32[local2675.anInt4276] & 0xFF) << 24 | local2680.anInt5720 & 0xFFFFFF;
							}
						}
						this.method4174();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray23 != null) {
					local2556 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (this.anIntArrayArray23.length > local40) {
							local50 = this.anIntArrayArray23[local40];
							for (local52 = 0; local52 < local50.length; local52++) {
								local58 = local50[local52];
								if (this.aShortArray85 == null || (arg6 & this.aShortArray85[local58]) != 0) {
									local399 = this.aShortArray79[local58] & 0xFFFF;
									local421 = local399 >> 10 & 0x3F;
									local452 = local399 >> 7 & 0x7;
									@Pc(2791) int local2791 = arg2 + local421 & 0x3F;
									local479 = local399 & 0x7F;
									local452 += arg3 / 4;
									if (local452 < 0) {
										local452 = 0;
									} else if (local452 > 7) {
										local452 = 7;
									}
									local479 += arg4;
									if (local479 < 0) {
										local479 = 0;
									} else if (local479 > 127) {
										local479 = 127;
									}
									this.aShortArray79[local58] = (short) (local2791 << 10 | local452 << 7 | local479);
								}
							}
							local2556 |= local50.length > 0;
						}
					}
					if (local2556) {
						if (this.aClass139Array1 != null) {
							for (local40 = 0; local40 < this.anInt4937; local40++) {
								local2675 = this.aClass139Array1[local40];
								local2680 = this.aClass200Array1[local40];
								local2680.anInt5720 = local2680.anInt5720 & 0xFF000000 | Static305.anIntArray309[this.aShortArray79[local2675.anInt4276] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method4174();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray25 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray25.length > local32) {
							local263 = this.anIntArrayArray25[local32];
							for (local265 = 0; local265 < local263.length; local265++) {
								local2680 = this.aClass200Array1[local263[local265]];
								local2680.anInt5725 += arg3;
								local2680.anInt5726 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray25 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray25.length) {
							local263 = this.anIntArrayArray25[local32];
							for (local265 = 0; local265 < local263.length; local265++) {
								local2680 = this.aClass200Array1[local263[local265]];
								local2680.anInt5727 = arg2 * local2680.anInt5727 >> 7;
								local2680.anInt5721 = arg3 * local2680.anInt5721 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray25 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray25.length) {
						local263 = this.anIntArrayArray25[local32];
						for (local265 = 0; local265 < local263.length; local265++) {
							local2680 = this.aClass200Array1[local263[local265]];
							local2680.anInt5719 = arg2 + local2680.anInt5719 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray24.length) {
					local263 = this.anIntArrayArray24[local32];
					for (local265 = 0; local265 < local263.length; local265++) {
						local52 = local263[local265];
						if (this.aShortArray81 == null || (arg6 & this.aShortArray81[local52]) != 0) {
							this.anIntArray281[local52] -= Static278.anInt5061;
							this.anIntArray285[local52] -= Static505.anInt8621;
							this.anIntArray283[local52] -= Static85.anInt1316;
							this.anIntArray281[local52] = this.anIntArray281[local52] * arg2 >> 7;
							this.anIntArray285[local52] = arg3 * this.anIntArray285[local52] >> 7;
							this.anIntArray283[local52] = this.anIntArray283[local52] * arg4 >> 7;
							this.anIntArray281[local52] += Static278.anInt5061;
							this.anIntArray285[local52] += Static505.anInt8621;
							this.anIntArray283[local52] += Static85.anInt1316;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local40 = arg7[11] << 4;
			local265 = arg7[12] << 4;
			local52 = arg7[13] << 4;
			local58 = arg7[14] << 4;
			if (Static37.aBoolean55) {
				local399 = arg7[3] * Static505.anInt8621 + arg7[0] * Static278.anInt5061 + arg7[6] * Static85.anInt1316 + 8192 >> 14;
				local421 = Static85.anInt1316 * arg7[7] + Static505.anInt8621 * arg7[4] + arg7[1] * Static278.anInt5061 + 8192 >> 14;
				local399 += local265;
				local452 = Static505.anInt8621 * arg7[5] + Static278.anInt5061 * arg7[2] + Static85.anInt1316 * arg7[8] + 8192 >> 14;
				local421 += local52;
				local452 += local58;
				Static505.anInt8621 = local421;
				Static278.anInt5061 = local399;
				Static37.aBoolean55 = false;
				Static85.anInt1316 = local452;
			}
			local399 = arg2 << 15 >> 7;
			local421 = arg3 << 15 >> 7;
			local452 = arg4 << 15 >> 7;
			local479 = -Static278.anInt5061 * local399 + 8192 >> 14;
			local483 = local421 * -Static505.anInt8621 + 8192 >> 14;
			local487 = local452 * -Static85.anInt1316 + 8192 >> 14;
			local491 = local479 + Static278.anInt5061;
			local499 = Static505.anInt8621 + local483;
			local507 = local487 + Static85.anInt1316;
			@Pc(1920) int[] local1920 = new int[] { local399 * arg7[0] + 8192 >> 14, arg7[3] * local399 + 8192 >> 14, arg7[6] * local399 + 8192 >> 14, local421 * arg7[1] + 8192 >> 14, arg7[4] * local421 + 8192 >> 14, arg7[7] * local421 + 8192 >> 14, arg7[2] * local452 + 8192 >> 14, local452 * arg7[5] + 8192 >> 14, arg7[8] * local452 + 8192 >> 14 };
			local660 = local265 * local399 + 8192 >> 14;
			local685 = local52 * local421 + 8192 >> 14;
			@Pc(2048) int local2048 = local660 + local491;
			local689 = local452 * local58 + 8192 >> 14;
			@Pc(2060) int local2060 = local685 + local499;
			@Pc(2064) int local2064 = local689 + local507;
			@Pc(2067) int[] local2067 = new int[9];
			@Pc(2073) int local2073;
			for (local697 = 0; local697 < 3; local697++) {
				for (local2073 = 0; local2073 < 3; local2073++) {
					local702 = 0;
					for (local706 = 0; local706 < 3; local706++) {
						local702 += local1920[local706 * 3 + local2073] * arg7[local697 * 3 + local706];
					}
					local2067[local697 * 3 + local2073] = local702 + 8192 >> 14;
				}
			}
			local2073 = arg7[0] * local2048 + local2060 * arg7[1] + arg7[2] * local2064 + 8192 >> 14;
			local702 = arg7[5] * local2064 + local2048 * arg7[3] + arg7[4] * local2060 + 8192 >> 14;
			local706 = arg7[8] * local2064 + arg7[7] * local2060 + arg7[6] * local2048 + 8192 >> 14;
			local2073 += local26;
			local702 += local32;
			local706 += local40;
			for (local710 = 0; local710 < local8; local710++) {
				local712 = arg1[local710];
				if (this.anIntArrayArray24.length > local712) {
					local846 = this.anIntArrayArray24[local712];
					for (local848 = 0; local848 < local846.length; local848++) {
						local854 = local846[local848];
						if (this.aShortArray81 == null || (arg6 & this.aShortArray81[local854]) != 0) {
							local858 = local2067[0] * this.anIntArray281[local854] + local2067[1] * this.anIntArray285[local854] + local2067[2] * this.anIntArray283[local854] + 8192 >> 14;
							local860 = this.anIntArray285[local854] * local2067[4] + this.anIntArray281[local854] * local2067[3] + local2067[5] * this.anIntArray283[local854] + 8192 >> 14;
							@Pc(2326) int local2326 = local860 + local702;
							local996 = local2067[7] * this.anIntArray285[local854] + this.anIntArray281[local854] * local2067[6] + this.anIntArray283[local854] * local2067[8] + 8192 >> 14;
							@Pc(2362) int local2362 = local858 + local2073;
							@Pc(2366) int local2366 = local996 + local706;
							this.anIntArray281[local854] = local2362;
							this.anIntArray285[local854] = local2326;
							this.anIntArray283[local854] = local2366;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean433) {
			this.method4188();
		}
		return this.anInt4985;
	}

	@OriginalMember(owner = "client!iha", name = "l", descriptor = "(I)V")
	private void method4181() {
		if (this.aClass376_3 != null) {
			this.aClass376_3.aBoolean763 = false;
		}
	}

	@OriginalMember(owner = "client!iha", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4924; local7++) {
			this.anIntArray281[local7] = this.anIntArray281[local7] + 7 >> 4;
			this.anIntArray285[local7] = this.anIntArray285[local7] + 7 >> 4;
			this.anIntArray283[local7] = this.anIntArray283[local7] + 7 >> 4;
		}
		this.method4181();
		this.aBoolean433 = false;
	}

	@OriginalMember(owner = "client!iha", name = "j", descriptor = "(I)Z")
	private boolean method4182() {
		if (this.aClass311_1.aBoolean662) {
			return true;
		}
		if (this.aClass311_1.anInterface5_6 == null) {
			this.aClass311_1.anInterface5_6 = this.aClass67_Sub1_7.method5684(this.aBoolean431);
		}
		@Pc(39) Interface5 local39 = this.aClass311_1.anInterface5_6;
		local39.method9248(this.anInt4935 * 6);
		@Pc(51) Buffer local51 = local39.method9252();
		if (local51 != null) {
			@Pc(59) Stream local59 = this.aClass67_Sub1_7.method5616(local51);
			@Pc(63) int local63;
			if (Stream.b()) {
				for (local63 = 0; local63 < this.anInt4935; local63++) {
					local59.b(this.aShortArray83[local63]);
					local59.b(this.aShortArray82[local63]);
					local59.b(this.aShortArray86[local63]);
				}
			} else {
				for (local63 = 0; local63 < this.anInt4935; local63++) {
					local59.d(this.aShortArray83[local63]);
					local59.d(this.aShortArray82[local63]);
					local59.d(this.aShortArray86[local63]);
				}
			}
			local59.a();
			if (local39.method9250()) {
				this.aClass311_1.aBoolean662 = true;
				this.aBoolean428 = true;
				this.aClass311_1.anInterface5_7 = local39;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "()[B")
	@Override
	public byte[] method5216() {
		return this.aByteArray32;
	}

	@OriginalMember(owner = "client!iha", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub2_Sub21.anIntArray358[arg0];
		@Pc(13) int local13 = Class3_Sub2_Sub21.anIntArray356[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4961; local15++) {
			@Pc(35) int local35 = this.anIntArray285[local15] * local9 + local13 * this.anIntArray281[local15] >> 14;
			this.anIntArray285[local15] = local13 * this.anIntArray285[local15] - local9 * this.anIntArray281[local15] >> 14;
			this.anIntArray281[local15] = local35;
		}
		this.method4181();
		this.aBoolean433 = false;
	}

	@OriginalMember(owner = "client!iha", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean430;
	}

	@OriginalMember(owner = "client!iha", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean433) {
			this.method4188();
		}
		return this.anInt4995;
	}

	@OriginalMember(owner = "client!iha", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface2 local9 = this.aClass67_Sub1_7.anInterface2_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5004; local11++) {
			if (this.aShortArray87[local11] == arg0) {
				this.aShortArray87[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(53) Class32 local53 = local9.method1027(arg0 & 0xFFFF);
			local39 = local53.aByte20;
			local41 = local53.aByte24;
		}
		@Pc(61) byte local61 = 0;
		@Pc(63) byte local63 = 0;
		if (arg1 != -1) {
			@Pc(74) Class32 local74 = local9.method1027(arg1 & 0xFFFF);
			local63 = local74.aByte24;
			local61 = local74.aByte20;
			if (local74.aByte22 != 0 || local74.aByte23 != 0) {
				this.aBoolean430 = true;
			}
		}
		if (!(local61 != local39 | local41 != local63)) {
			return;
		}
		if (this.aClass139Array1 != null) {
			for (@Pc(119) int local119 = 0; local119 < this.anInt4937; local119++) {
				@Pc(126) Class139 local126 = this.aClass139Array1[local119];
				@Pc(131) Class200 local131 = this.aClass200Array1[local119];
				local131.anInt5720 = local131.anInt5720 & 0xFF000000 | Static305.anIntArray309[this.aShortArray79[local126.anInt4276] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4174();
	}

	@OriginalMember(owner = "client!iha", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static278.anInt5061 = 0;
			Static85.anInt1316 = 0;
			local16 = 0;
			Static505.anInt8621 = 0;
			for (local20 = 0; local20 < this.anInt4961; local20++) {
				Static278.anInt5061 += this.anIntArray281[local20];
				Static505.anInt8621 += this.anIntArray285[local20];
				local16++;
				Static85.anInt1316 += this.anIntArray283[local20];
			}
			if (local16 > 0) {
				Static278.anInt5061 = Static278.anInt5061 / local16 + arg1;
				Static505.anInt8621 = arg2 + Static505.anInt8621 / local16;
				Static85.anInt1316 = arg3 + Static85.anInt1316 / local16;
			} else {
				Static505.anInt8621 = arg2;
				Static278.anInt5061 = arg1;
				Static85.anInt1316 = arg3;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt4961; local16++) {
				this.anIntArray281[local16] += arg1;
				this.anIntArray285[local16] += arg2;
				this.anIntArray283[local16] += arg3;
			}
		} else {
			@Pc(179) int local179;
			@Pc(197) int local197;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt4961; local16++) {
					this.anIntArray281[local16] -= Static278.anInt5061;
					this.anIntArray285[local16] -= Static505.anInt8621;
					this.anIntArray283[local16] -= Static85.anInt1316;
					if (arg3 != 0) {
						local20 = Class3_Sub2_Sub21.anIntArray358[arg3];
						local179 = Class3_Sub2_Sub21.anIntArray356[arg3];
						local197 = this.anIntArray281[local16] * local179 + local20 * this.anIntArray285[local16] + 16383 >> 14;
						this.anIntArray285[local16] = local179 * this.anIntArray285[local16] + 16383 - local20 * this.anIntArray281[local16] >> 14;
						this.anIntArray281[local16] = local197;
					}
					if (arg1 != 0) {
						local20 = Class3_Sub2_Sub21.anIntArray358[arg1];
						local179 = Class3_Sub2_Sub21.anIntArray356[arg1];
						local197 = this.anIntArray285[local16] * local179 + 16383 - local20 * this.anIntArray283[local16] >> 14;
						this.anIntArray283[local16] = local179 * this.anIntArray283[local16] + this.anIntArray285[local16] * local20 + 16383 >> 14;
						this.anIntArray285[local16] = local197;
					}
					if (arg2 != 0) {
						local20 = Class3_Sub2_Sub21.anIntArray358[arg2];
						local179 = Class3_Sub2_Sub21.anIntArray356[arg2];
						local197 = this.anIntArray283[local16] * local20 + this.anIntArray281[local16] * local179 + 16383 >> 14;
						this.anIntArray283[local16] = this.anIntArray283[local16] * local179 + 16383 - this.anIntArray281[local16] * local20 >> 14;
						this.anIntArray281[local16] = local197;
					}
					this.anIntArray281[local16] += Static278.anInt5061;
					this.anIntArray285[local16] += Static505.anInt8621;
					this.anIntArray283[local16] += Static85.anInt1316;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt4961; local16++) {
					this.anIntArray281[local16] -= Static278.anInt5061;
					this.anIntArray285[local16] -= Static505.anInt8621;
					this.anIntArray283[local16] -= Static85.anInt1316;
					this.anIntArray281[local16] = this.anIntArray281[local16] * arg1 / 128;
					this.anIntArray285[local16] = this.anIntArray285[local16] * arg2 / 128;
					this.anIntArray283[local16] = arg3 * this.anIntArray283[local16] / 128;
					this.anIntArray281[local16] += Static278.anInt5061;
					this.anIntArray285[local16] += Static505.anInt8621;
					this.anIntArray283[local16] += Static85.anInt1316;
				}
			} else {
				@Pc(536) Class139 local536;
				@Pc(541) Class200 local541;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt5004; local16++) {
						local20 = arg1 * 8 + (this.aByteArray32[local16] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray32[local16] = (byte) local20;
					}
					if (this.aClass139Array1 != null) {
						for (local20 = 0; local20 < this.anInt4937; local20++) {
							local536 = this.aClass139Array1[local20];
							local541 = this.aClass200Array1[local20];
							local541.anInt5720 = local541.anInt5720 & 0xFFFFFF | 255 - (this.aByteArray32[local536.anInt4276] & 0xFF) << 24;
						}
					}
					this.method4174();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt5004; local16++) {
						local20 = this.aShortArray79[local16] & 0xFFFF;
						local179 = local20 >> 10 & 0x3F;
						local197 = local20 >> 7 & 0x7;
						@Pc(604) int local604 = arg1 + local179 & 0x3F;
						@Pc(608) int local608 = local20 & 0x7F;
						local197 += arg2 / 4;
						local608 += arg3;
						if (local197 < 0) {
							local197 = 0;
						} else if (local197 > 7) {
							local197 = 7;
						}
						if (local608 < 0) {
							local608 = 0;
						} else if (local608 > 127) {
							local608 = 127;
						}
						this.aShortArray79[local16] = (short) (local608 | local197 << 7 | local604 << 10);
					}
					if (this.aClass139Array1 != null) {
						for (local20 = 0; local20 < this.anInt4937; local20++) {
							local536 = this.aClass139Array1[local20];
							local541 = this.aClass200Array1[local20];
							local541.anInt5720 = Static305.anIntArray309[this.aShortArray79[local536.anInt4276] & 0xFFFF] & 0xFFFFFF | local541.anInt5720 & 0xFF000000;
						}
					}
					this.method4174();
				} else {
					@Pc(737) Class200 local737;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt4937; local16++) {
							local737 = this.aClass200Array1[local16];
							local737.anInt5726 += arg1;
							local737.anInt5725 += arg2;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt4937; local16++) {
							local737 = this.aClass200Array1[local16];
							local737.anInt5727 = arg1 * local737.anInt5727 >> 7;
							local737.anInt5721 = local737.anInt5721 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt4937; local16++) {
							local737 = this.aClass200Array1[local16];
							local737.anInt5719 = arg1 + local737.anInt5719 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "()Z")
	@Override
	public boolean method5224() {
		if (this.aShortArray87 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray87.length; local13++) {
			if (this.aShortArray87[local13] != -1 && !this.aClass67_Sub1_7.anInterface2_11.method1024(this.aShortArray87[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!iu;)V")
	@Override
	public void method5226(@OriginalArg(0) Class181 arg0) {
		@Pc(8) Class181_Sub1 local8 = (Class181_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass156Array3 != null) {
			for (local13 = 0; local13 < this.aClass156Array3.length; local13++) {
				@Pc(20) Class156 local20 = this.aClass156Array3[local13];
				@Pc(22) Class156 local22 = local20;
				if (local20.aClass156_2 != null) {
					local22 = local20.aClass156_2;
				}
				local22.anInt4584 = (int) (local8.aFloat108 * (float) this.anIntArray283[local20.anInt4597] + (float) this.anIntArray285[local20.anInt4597] * local8.aFloat99 + (float) this.anIntArray281[local20.anInt4597] * local8.aFloat100 + local8.aFloat97);
				local22.anInt4592 = (int) (local8.aFloat102 * (float) this.anIntArray283[local20.anInt4597] + local8.aFloat104 * (float) this.anIntArray281[local20.anInt4597] + (float) this.anIntArray285[local20.anInt4597] * local8.aFloat98 + local8.aFloat103);
				local22.anInt4595 = (int) (local8.aFloat106 + local8.aFloat105 * (float) this.anIntArray281[local20.anInt4597] + (float) this.anIntArray285[local20.anInt4597] * local8.aFloat101 + local8.aFloat107 * (float) this.anIntArray283[local20.anInt4597]);
				local22.anInt4596 = (int) (local8.aFloat97 + (float) this.anIntArray285[local20.anInt4586] * local8.aFloat99 + (float) this.anIntArray281[local20.anInt4586] * local8.aFloat100 + local8.aFloat108 * (float) this.anIntArray283[local20.anInt4586]);
				local22.anInt4599 = (int) (local8.aFloat103 + (float) this.anIntArray283[local20.anInt4586] * local8.aFloat102 + (float) this.anIntArray285[local20.anInt4586] * local8.aFloat98 + local8.aFloat104 * (float) this.anIntArray281[local20.anInt4586]);
				local22.anInt4598 = (int) (local8.aFloat106 + local8.aFloat105 * (float) this.anIntArray281[local20.anInt4586] + local8.aFloat101 * (float) this.anIntArray285[local20.anInt4586] + (float) this.anIntArray283[local20.anInt4586] * local8.aFloat107);
				local22.anInt4590 = (int) ((float) this.anIntArray283[local20.anInt4588] * local8.aFloat108 + local8.aFloat99 * (float) this.anIntArray285[local20.anInt4588] + local8.aFloat100 * (float) this.anIntArray281[local20.anInt4588] + local8.aFloat97);
				local22.anInt4594 = (int) (local8.aFloat103 + local8.aFloat102 * (float) this.anIntArray283[local20.anInt4588] + local8.aFloat98 * (float) this.anIntArray285[local20.anInt4588] + local8.aFloat104 * (float) this.anIntArray281[local20.anInt4588]);
				local22.anInt4587 = (int) (local8.aFloat107 * (float) this.anIntArray283[local20.anInt4588] + local8.aFloat101 * (float) this.anIntArray285[local20.anInt4588] + local8.aFloat105 * (float) this.anIntArray281[local20.anInt4588] + local8.aFloat106);
			}
		}
		if (this.aClass348Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass348Array3.length; local13++) {
			@Pc(367) Class348 local367 = this.aClass348Array3[local13];
			@Pc(369) Class348 local369 = local367;
			if (local367.aClass348_2 != null) {
				local369 = local367.aClass348_2;
			}
			if (local367.aClass181_13 == null) {
				local367.aClass181_13 = local8.method6350();
			} else {
				local367.aClass181_13.method6355(local8);
			}
			local369.anInt9765 = (int) (local8.aFloat97 + (float) this.anIntArray281[local367.anInt9766] * local8.aFloat100 + (float) this.anIntArray285[local367.anInt9766] * local8.aFloat99 + local8.aFloat108 * (float) this.anIntArray283[local367.anInt9766]);
			local369.anInt9763 = (int) (local8.aFloat103 + (float) this.anIntArray283[local367.anInt9766] * local8.aFloat102 + (float) this.anIntArray285[local367.anInt9766] * local8.aFloat98 + (float) this.anIntArray281[local367.anInt9766] * local8.aFloat104);
			local369.anInt9768 = (int) (local8.aFloat107 * (float) this.anIntArray283[local367.anInt9766] + local8.aFloat105 * (float) this.anIntArray281[local367.anInt9766] + local8.aFloat101 * (float) this.anIntArray285[local367.anInt9766] + local8.aFloat106);
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V")
	private void method4185() {
		if (!this.aBoolean428) {
			return;
		}
		this.aBoolean428 = false;
		if (this.aClass156Array3 == null && this.aClass348Array3 == null && this.aClass139Array1 == null && !Static663.method8834(this.anInt4941, this.anInt4986)) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			if (this.anIntArray281 != null && !Static34.method515(this.anInt4986, this.anInt4941)) {
				if (this.aClass376_3 == null || this.aClass376_3.method8821()) {
					if (!this.aBoolean433) {
						this.method4188();
					}
					local37 = true;
				} else {
					this.aBoolean428 = true;
				}
			}
			@Pc(88) boolean local88 = false;
			if (this.anIntArray285 != null && !Static282.method4266(this.anInt4941, this.anInt4986)) {
				if (this.aClass376_3 == null || this.aClass376_3.method8821()) {
					local39 = true;
					if (!this.aBoolean433) {
						this.method4188();
					}
				} else {
					this.aBoolean428 = true;
				}
			}
			if (this.anIntArray283 != null && !Static569.method7903(this.anInt4941, this.anInt4986)) {
				if (this.aClass376_3 == null || this.aClass376_3.method8821()) {
					if (!this.aBoolean433) {
						this.method4188();
					}
					local88 = true;
				} else {
					this.aBoolean428 = true;
				}
			}
			if (local88) {
				this.anIntArray283 = null;
			}
			if (local39) {
				this.anIntArray285 = null;
			}
			if (local37) {
				this.anIntArray281 = null;
			}
		}
		if (this.aShortArray91 != null && this.anIntArray281 == null && this.anIntArray285 == null && this.anIntArray283 == null) {
			this.aShortArray91 = null;
			this.anIntArray282 = null;
		}
		if (this.aByteArray33 != null && !Static467.method6927(this.anInt4941, this.anInt4986)) {
			label205: {
				label204: {
					@Pc(258) boolean local258;
					if ((this.anInt4986 & 0x37) == 0) {
						if (this.aClass376_2 == null || this.aClass376_2.method8821()) {
							break label204;
						}
						local258 = false;
					} else {
						if (this.aClass376_1 == null || this.aClass376_1.method8821()) {
							break label204;
						}
						local258 = false;
					}
					if (!local258) {
						this.aBoolean428 = true;
						break label205;
					}
				}
				this.aByteArray33 = null;
				this.aShortArray89 = this.aShortArray84 = this.aShortArray88 = null;
			}
		}
		if (this.aShortArray79 != null && !Static644.method8693(this.anInt4941, this.anInt4986)) {
			if (this.aClass376_2 == null || this.aClass376_2.method8821()) {
				this.aShortArray79 = null;
			} else {
				this.aBoolean428 = true;
			}
		}
		if (this.aByteArray32 != null && !Static367.method5250(this.anInt4941, this.anInt4986)) {
			if (this.aClass376_2 == null || this.aClass376_2.method8821()) {
				this.aByteArray32 = null;
			} else {
				this.aBoolean428 = true;
			}
		}
		if (this.aFloatArray47 != null && !Static516.method8187(this.anInt4986, this.anInt4941)) {
			if (this.aClass376_4 == null || this.aClass376_4.method8821()) {
				this.aFloatArray47 = this.aFloatArray48 = null;
			} else {
				this.aBoolean428 = true;
			}
		}
		if (this.aShortArray87 != null && !Static152.method2445(this.anInt4986, this.anInt4941)) {
			if (this.aClass376_2 == null || this.aClass376_2.method8821()) {
				this.aShortArray87 = null;
			} else {
				this.aBoolean428 = true;
			}
		}
		if (this.aShortArray83 != null && !Static46.method633(this.anInt4941, this.anInt4986)) {
			if ((this.aClass311_1 == null || this.aClass311_1.method7514()) && (this.aClass376_2 == null || this.aClass376_2.method8821())) {
				this.aShortArray83 = this.aShortArray82 = this.aShortArray86 = null;
			} else {
				this.aBoolean428 = true;
			}
		}
		if (this.aShortArray80 != null) {
			if (this.aClass376_3 == null || this.aClass376_3.method8821()) {
				this.aShortArray80 = null;
			} else {
				this.aBoolean428 = true;
			}
		}
		if (this.aShortArray90 != null) {
			if (this.aClass376_2 == null || this.aClass376_2.method8821()) {
				this.aShortArray90 = null;
			} else {
				this.aBoolean428 = true;
			}
		}
		if (this.anIntArrayArray23 != null && !Static269.method4121(this.anInt4941, this.anInt4986)) {
			this.aShortArray85 = null;
			this.anIntArrayArray23 = null;
		}
		if (this.anIntArrayArray24 != null && !Static424.method6248(this.anInt4986, this.anInt4941)) {
			this.aShortArray81 = null;
			this.anIntArrayArray24 = null;
		}
		if (this.anIntArrayArray25 != null && !Static514.method7353(this.anInt4941, this.anInt4986)) {
			this.anIntArrayArray25 = null;
		}
		if (this.anIntArray286 != null && (this.anInt4941 & 0x800) == 0 && (this.anInt4941 & 0x40000) == 0) {
			this.anIntArray286 = null;
			this.anIntArray284 = null;
			this.anIntArray279 = null;
		}
	}

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "(I)V")
	private void method4186() {
		if (this.anInt4935 == 0) {
			return;
		}
		if (this.method4173() && this.method4182()) {
			this.aClass67_Sub1_7.method5620(this.aClass376_3.anInterface16_18, 0);
			this.aClass67_Sub1_7.method5620(this.aClass376_2.anInterface16_18, 1);
			this.aClass67_Sub1_7.method5620(this.aClass376_4.anInterface16_18, 2);
			@Pc(55) boolean local55;
			if ((this.anInt4986 & 0x37) == 0) {
				this.aClass67_Sub1_7.method5592(false);
				local55 = false;
				this.aClass67_Sub1_7.method5569(this.aClass67_Sub1_7.aClass212_15);
			} else {
				local55 = true;
				this.aClass67_Sub1_7.method5592(true);
				this.aClass67_Sub1_7.method5620(this.aClass376_1.anInterface16_18, 3);
				this.aClass67_Sub1_7.method5569(this.aClass67_Sub1_7.aClass212_20);
			}
			for (@Pc(95) int local95 = 0; local95 < this.anIntArray279.length; local95++) {
				@Pc(102) int local102 = this.anIntArray286[local95];
				@Pc(109) int local109 = this.anIntArray286[local95 + 1];
				@Pc(116) int local116 = this.aShortArray87[local102] & 0xFFFF;
				if (local116 == 65535) {
					local116 = -1;
				}
				this.aClass67_Sub1_7.method5575(local55, true, local116);
				this.aClass67_Sub1_7.method5659(this.aClass311_1.anInterface5_7, local102 * 3, this.anIntArray284[local95], local109 - local102, this.anIntArray279[local95], Static508.aClass281_7);
			}
		}
		this.method4185();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class157 method5211(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = false;
		@Pc(29) Class157_Sub2 local29;
		@Pc(28) Class157_Sub2 local28;
		if (arg0 > 0 && arg0 <= 7) {
			local29 = this.aClass67_Sub1_7.aClass157_Sub2Array5[arg0 - 1];
			local28 = this.aClass67_Sub1_7.aClass157_Sub2Array6[arg0 - 1];
			local5 = true;
		} else {
			local29 = local28 = new Class157_Sub2(this.aClass67_Sub1_7, 0, 0, true, false);
		}
		return this.method4177(local29, arg2, local5, local28, arg1);
	}

	@OriginalMember(owner = "client!iha", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean433) {
			this.method4188();
		}
		return this.anInt4928;
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "(B)V")
	private void method4187() {
		if (this.aClass139Array1 == null) {
			return;
		}
		this.aClass67_Sub1_7.C(!this.aBoolean429);
		this.aClass67_Sub1_7.method5592(false);
		this.aClass67_Sub1_7.method5590(1, Static472.aClass58_3);
		this.aClass67_Sub1_7.method5674(1, Static472.aClass58_3);
		for (@Pc(39) int local39 = 0; local39 < this.anInt4937; local39++) {
			@Pc(48) Class139 local48 = this.aClass139Array1[local39];
			@Pc(53) Class200 local53 = this.aClass200Array1[local39];
			if (!local48.aBoolean352 || !this.aClass67_Sub1_7.method7643()) {
				@Pc(83) float local83 = (float) (this.anIntArray281[local48.anInt4271] + this.anIntArray281[local48.anInt4273] + this.anIntArray281[local48.anInt4277]) * 0.3333333F;
				@Pc(104) float local104 = (float) (this.anIntArray285[local48.anInt4271] + this.anIntArray285[local48.anInt4273] + this.anIntArray285[local48.anInt4277]) * 0.3333333F;
				@Pc(126) float local126 = (float) (this.anIntArray283[local48.anInt4273] + this.anIntArray283[local48.anInt4277] + this.anIntArray283[local48.anInt4271]) * 0.3333333F;
				@Pc(140) float local140 = Static101.aFloat18 + local104 * Static591.aFloat181 + local83 * Static182.aFloat60 + Static120.aFloat54 * local126;
				@Pc(154) float local154 = Static616.aFloat185 + Static452.aFloat156 * local104 + Static154.aFloat57 * local83 + Static225.aFloat85 * local126;
				@Pc(168) float local168 = Static296.aFloat62 + local83 * Static278.aFloat91 + local104 * Static720.aFloat201 + Static639.aFloat193 * local126;
				@Pc(189) float local189 = (float) (1.0D / Math.sqrt((double) (local140 * local140 + local154 * local154 + local168 * local168))) * (float) local48.anInt4274;
				@Pc(194) Class181_Sub1 local194 = this.aClass67_Sub1_7.method5586();
				local194.method4930(local53.anInt5721 * local48.aShort53 >> 7, local53.anInt5719, local53.anInt5727 * local48.aShort52 >> 7, (float) local53.anInt5725 + local154 - local189 * local154, -(local189 * local140) + (float) local53.anInt5726 + local140, local168 - local189 * local168);
				local194.method4926(this.aClass67_Sub1_7.aClass181_Sub1_17);
				this.aClass67_Sub1_7.method5639();
				@Pc(251) int local251 = local53.anInt5720;
				this.aClass67_Sub1_7.method5575(false, false, local48.aShort51);
				this.aClass67_Sub1_7.method5617(local48.aByte74);
				this.aClass67_Sub1_7.method5588(local251);
				this.aClass67_Sub1_7.method5635();
			}
		}
		this.aClass67_Sub1_7.method5674(1, Static273.aClass58_2);
		this.aClass67_Sub1_7.method5590(1, Static273.aClass58_2);
		this.aClass67_Sub1_7.C(true);
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "(I)V")
	private void method4188() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt4961; local23++) {
			@Pc(32) int local32 = this.anIntArray281[local23];
			@Pc(37) int local37 = this.anIntArray285[local23];
			if (local9 > local37) {
				local9 = local37;
			}
			if (local7 > local32) {
				local7 = local32;
			}
			if (local32 > local13) {
				local13 = local32;
			}
			if (local37 > local15) {
				local15 = local37;
			}
			@Pc(74) int local74 = this.anIntArray283[local23];
			if (local74 < local11) {
				local11 = local74;
			}
			if (local17 < local74) {
				local17 = local74;
			}
			@Pc(100) int local100 = local74 * local74 + local32 * local32;
			if (local19 < local100) {
				local19 = local100;
			}
			local100 = local37 * local37 + local74 * local74 + local32 * local32;
			if (local100 > local21) {
				local21 = local100;
			}
		}
		this.anInt4995 = local7;
		this.anInt5003 = local9;
		this.anInt4955 = local11;
		this.anInt4956 = local17;
		this.anInt4985 = local15;
		this.anInt4950 = local13;
		this.anInt4968 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt4928 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean433 = true;
	}

	@OriginalMember(owner = "client!iha", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean433) {
			this.method4188();
		}
		return this.anInt4968;
	}

	@OriginalMember(owner = "client!iha", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort71;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!mfa;B)V")
	private void method4189(@OriginalArg(0) Class3_Sub4_Sub13_Sub1 arg0) {
		if (this.anInt4972 > Static520.anIntArray480.length) {
			Static147.anIntArray134 = new int[this.anInt4972];
			Static520.anIntArray480 = new int[this.anInt4972];
		}
		@Pc(56) int local56;
		@Pc(95) int local95;
		@Pc(104) int local104;
		for (@Pc(30) int local30 = 0; local30 < this.anInt4961; local30++) {
			local56 = (this.anIntArray281[local30] - (this.aClass67_Sub1_7.anInt6679 * this.anIntArray285[local30] >> 8) >> this.aClass67_Sub1_7.anInt6658) - arg0.anInt7015;
			@Pc(81) int local81 = (this.anIntArray283[local30] - (this.anIntArray285[local30] * this.aClass67_Sub1_7.anInt6655 >> 8) >> this.aClass67_Sub1_7.anInt6658) - arg0.anInt7019;
			@Pc(86) int local86 = this.anIntArray282[local30];
			@Pc(93) int local93 = this.anIntArray282[local30 + 1];
			for (local95 = local86; local95 < local93; local95++) {
				local104 = this.aShortArray91[local95] - 1;
				if (local104 == -1) {
					break;
				}
				Static520.anIntArray480[local104] = local56;
				Static147.anIntArray134[local104] = local81;
			}
		}
		for (local56 = 0; local56 < this.anInt4935; local56++) {
			if (this.aByteArray32 == null || this.aByteArray32[local56] <= 128) {
				@Pc(154) short local154 = this.aShortArray83[local56];
				@Pc(159) short local159 = this.aShortArray82[local56];
				@Pc(164) short local164 = this.aShortArray86[local56];
				local95 = Static520.anIntArray480[local154];
				local104 = Static520.anIntArray480[local159];
				@Pc(176) int local176 = Static520.anIntArray480[local164];
				@Pc(180) int local180 = Static147.anIntArray134[local154];
				@Pc(184) int local184 = Static147.anIntArray134[local159];
				@Pc(188) int local188 = Static147.anIntArray134[local164];
				if ((local95 - local104) * (local184 + -local188) - (local176 - local104) * (-local180 + local184) > 0) {
					arg0.method5885(local104, local188, local184, local176, local180, local95);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!iu;Lclient!laa;I)V")
	@Override
	public void method5232(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class19_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4972 == 0) {
			return;
		}
		@Pc(17) Class181_Sub1 local17 = this.aClass67_Sub1_7.aClass181_Sub1_16;
		if (!this.aBoolean433) {
			this.method4188();
		}
		@Pc(28) Class181_Sub1 local28 = (Class181_Sub1) arg0;
		Static296.aFloat62 = local28.aFloat106 * local17.aFloat107 + local17.aFloat101 * local28.aFloat103 + local17.aFloat105 * local28.aFloat97 + local17.aFloat106;
		Static720.aFloat201 = local17.aFloat105 * local28.aFloat99 + local28.aFloat98 * local17.aFloat101 + local28.aFloat101 * local17.aFloat107;
		@Pc(75) float local75 = Static720.aFloat201 * (float) this.anInt5003 + Static296.aFloat62;
		@Pc(83) float local83 = Static720.aFloat201 * (float) this.anInt4985 + Static296.aFloat62;
		@Pc(93) float local93;
		@Pc(99) float local99;
		if (local75 > local83) {
			local93 = local83 - (float) this.anInt4968;
			local99 = local75 + (float) this.anInt4968;
		} else {
			local93 = local75 - (float) this.anInt4968;
			local99 = local83 + (float) this.anInt4968;
		}
		if (local93 >= this.aClass67_Sub1_7.aFloat120 || (float) this.aClass67_Sub1_7.anInt6680 >= local99) {
			return;
		}
		Static591.aFloat181 = local28.aFloat101 * local17.aFloat108 + local17.aFloat99 * local28.aFloat98 + local28.aFloat99 * local17.aFloat100;
		Static101.aFloat18 = local17.aFloat97 + local28.aFloat106 * local17.aFloat108 + local17.aFloat99 * local28.aFloat103 + local17.aFloat100 * local28.aFloat97;
		@Pc(177) float local177 = Static101.aFloat18 + (float) this.anInt5003 * Static591.aFloat181;
		@Pc(185) float local185 = Static591.aFloat181 * (float) this.anInt4985 + Static101.aFloat18;
		@Pc(211) float local211;
		@Pc(200) float local200;
		if (local177 > local185) {
			local200 = (float) this.aClass67_Sub1_7.anInt6667 * (local177 + (float) this.anInt4968);
			local211 = (local185 - (float) this.anInt4968) * (float) this.aClass67_Sub1_7.anInt6667;
		} else {
			local200 = (float) this.aClass67_Sub1_7.anInt6667 * (local185 + (float) this.anInt4968);
			local211 = ((float) -this.anInt4968 + local177) * (float) this.aClass67_Sub1_7.anInt6667;
		}
		if (this.aClass67_Sub1_7.aFloat115 <= local211 / local99 || this.aClass67_Sub1_7.aFloat116 >= local200 / local99) {
			return;
		}
		Static616.aFloat185 = local17.aFloat103 + local17.aFloat102 * local28.aFloat106 + local17.aFloat98 * local28.aFloat103 + local17.aFloat104 * local28.aFloat97;
		Static452.aFloat156 = local28.aFloat99 * local17.aFloat104 + local17.aFloat98 * local28.aFloat98 + local17.aFloat102 * local28.aFloat101;
		@Pc(303) float local303 = Static452.aFloat156 * (float) this.anInt5003 + Static616.aFloat185;
		@Pc(311) float local311 = Static616.aFloat185 + (float) this.anInt4985 * Static452.aFloat156;
		@Pc(326) float local326;
		@Pc(337) float local337;
		if (local303 > local311) {
			local326 = (float) this.aClass67_Sub1_7.anInt6678 * (local311 - (float) this.anInt4968);
			local337 = (local303 + (float) this.anInt4968) * (float) this.aClass67_Sub1_7.anInt6678;
		} else {
			local326 = (float) this.aClass67_Sub1_7.anInt6678 * (local303 - (float) this.anInt4968);
			local337 = (local311 + (float) this.anInt4968) * (float) this.aClass67_Sub1_7.anInt6678;
		}
		if (this.aClass67_Sub1_7.aFloat118 <= local326 / local99 || local337 / local99 <= this.aClass67_Sub1_7.aFloat123) {
			return;
		}
		if (arg1 != null || this.aClass139Array1 != null) {
			Static639.aFloat193 = local17.aFloat101 * local28.aFloat102 + local28.aFloat108 * local17.aFloat105 + local17.aFloat107 * local28.aFloat107;
			Static182.aFloat60 = local28.aFloat104 * local17.aFloat99 + local17.aFloat100 * local28.aFloat100 + local28.aFloat105 * local17.aFloat108;
			Static278.aFloat91 = local28.aFloat105 * local17.aFloat107 + local28.aFloat104 * local17.aFloat101 + local28.aFloat100 * local17.aFloat105;
			Static154.aFloat57 = local28.aFloat100 * local17.aFloat104 + local28.aFloat104 * local17.aFloat98 + local28.aFloat105 * local17.aFloat102;
			Static225.aFloat85 = local17.aFloat102 * local28.aFloat107 + local17.aFloat98 * local28.aFloat102 + local28.aFloat108 * local17.aFloat104;
			Static120.aFloat54 = local17.aFloat99 * local28.aFloat102 + local17.aFloat100 * local28.aFloat108 + local17.aFloat108 * local28.aFloat107;
		}
		if (arg1 != null) {
			@Pc(502) boolean local502 = false;
			@Pc(504) boolean local504 = true;
			@Pc(513) int local513 = this.anInt4995 + this.anInt4950 >> 1;
			@Pc(522) int local522 = this.anInt4955 + this.anInt4956 >> 1;
			@Pc(541) int local541 = (int) (Static101.aFloat18 + Static182.aFloat60 * (float) local513 + Static591.aFloat181 * (float) this.anInt5003 + (float) local522 * Static120.aFloat54);
			@Pc(560) int local560 = (int) (Static225.aFloat85 * (float) local522 + Static154.aFloat57 * (float) local513 + Static616.aFloat185 + Static452.aFloat156 * (float) this.anInt5003);
			@Pc(579) int local579 = (int) (Static720.aFloat201 * (float) this.anInt5003 + Static278.aFloat91 * (float) local513 + Static296.aFloat62 + (float) local522 * Static639.aFloat193);
			if (this.aClass67_Sub1_7.anInt6680 <= local579) {
				arg1.anInt5947 = this.aClass67_Sub1_7.anInt6668 + local541 * this.aClass67_Sub1_7.anInt6667 / local579;
				arg1.anInt5948 = this.aClass67_Sub1_7.anInt6671 + this.aClass67_Sub1_7.anInt6678 * local560 / local579;
			} else {
				local502 = true;
			}
			@Pc(640) int local640 = (int) (Static120.aFloat54 * (float) local522 + Static101.aFloat18 + Static182.aFloat60 * (float) local513 + (float) this.anInt4985 * Static591.aFloat181);
			@Pc(659) int local659 = (int) (Static225.aFloat85 * (float) local522 + Static616.aFloat185 + Static154.aFloat57 * (float) local513 + Static452.aFloat156 * (float) this.anInt4985);
			@Pc(678) int local678 = (int) (Static639.aFloat193 * (float) local522 + Static296.aFloat62 + Static278.aFloat91 * (float) local513 + Static720.aFloat201 * (float) this.anInt4985);
			if (this.aClass67_Sub1_7.anInt6680 > local678) {
				local502 = true;
			} else {
				arg1.anInt5946 = this.aClass67_Sub1_7.anInt6671 + this.aClass67_Sub1_7.anInt6678 * local659 / local678;
				arg1.anInt5950 = this.aClass67_Sub1_7.anInt6668 + this.aClass67_Sub1_7.anInt6667 * local640 / local678;
			}
			if (local502) {
				if (this.aClass67_Sub1_7.anInt6680 > local579 && local678 < this.aClass67_Sub1_7.anInt6680) {
					local504 = false;
				} else {
					@Pc(768) int local768;
					@Pc(779) int local779;
					@Pc(804) int local804;
					if (this.aClass67_Sub1_7.anInt6680 > local579) {
						local768 = (local678 - this.aClass67_Sub1_7.anInt6680 << 16) / (local678 - local579);
						local779 = local640 + ((local640 - local541) * local768 >> 16);
						arg1.anInt5947 = this.aClass67_Sub1_7.anInt6668 + this.aClass67_Sub1_7.anInt6667 * local779 / this.aClass67_Sub1_7.anInt6680;
						local804 = local659 + ((local659 - local560) * local768 >> 16);
						arg1.anInt5948 = this.aClass67_Sub1_7.anInt6678 * local804 / this.aClass67_Sub1_7.anInt6680 + this.aClass67_Sub1_7.anInt6671;
					} else if (local678 < this.aClass67_Sub1_7.anInt6680) {
						local768 = (local579 - this.aClass67_Sub1_7.anInt6680 << 16) / (local579 - local678);
						local779 = (local768 * (local541 - local640) >> 16) + local541;
						arg1.anInt5947 = this.aClass67_Sub1_7.anInt6668 + local779 * this.aClass67_Sub1_7.anInt6667 / this.aClass67_Sub1_7.anInt6680;
						local804 = (local768 * (local560 - local659) >> 16) + local560;
						arg1.anInt5948 = local804 * this.aClass67_Sub1_7.anInt6678 / this.aClass67_Sub1_7.anInt6680 + this.aClass67_Sub1_7.anInt6671;
					}
				}
			}
			if (local504) {
				arg1.aBoolean477 = true;
				if (local579 <= local678) {
					arg1.anInt5949 = this.aClass67_Sub1_7.anInt6667 * (local640 + this.anInt4968) / local678 + this.aClass67_Sub1_7.anInt6668 - arg1.anInt5950;
				} else {
					arg1.anInt5949 = this.aClass67_Sub1_7.anInt6668 + this.aClass67_Sub1_7.anInt6667 * (this.anInt4968 + local541) / local579 - arg1.anInt5947;
				}
			}
		}
		this.aClass67_Sub1_7.method5577();
		this.aClass67_Sub1_7.method5627(local28);
		this.method4186();
		this.method4187();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IILclient!iu;ZII)Z")
	@Override
	public boolean method5221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method4176(arg4, arg3, arg0, arg1, arg2, arg5);
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "()V")
	@Override
	public void method5225() {
		if (this.anInt4972 > 0 && this.anInt4935 > 0) {
			this.method4173();
			this.method4182();
			this.method4185();
		}
	}

	@OriginalMember(owner = "client!iha", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub2_Sub21.anIntArray358[arg0];
		@Pc(13) int local13 = Class3_Sub2_Sub21.anIntArray356[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4961; local15++) {
			@Pc(34) int local34 = this.anIntArray285[local15] * local13 - local9 * this.anIntArray283[local15] >> 14;
			this.anIntArray283[local15] = local13 * this.anIntArray283[local15] + local9 * this.anIntArray285[local15] >> 14;
			this.anIntArray285[local15] = local34;
		}
		this.method4181();
		this.aBoolean433 = false;
	}

	@OriginalMember(owner = "client!iha", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub2_Sub21.anIntArray358[arg0];
		@Pc(13) int local13 = Class3_Sub2_Sub21.anIntArray356[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4961; local15++) {
			local33 = this.anIntArray283[local15] * local9 + this.anIntArray281[local15] * local13 >> 14;
			this.anIntArray283[local15] = this.anIntArray283[local15] * local13 - this.anIntArray281[local15] * local9 >> 14;
			this.anIntArray281[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt4972; local33++) {
			@Pc(85) int local85 = local9 * this.aShortArray88[local33] + local13 * this.aShortArray89[local33] >> 14;
			this.aShortArray88[local33] = (short) (local13 * this.aShortArray88[local33] - this.aShortArray89[local33] * local9 >> 14);
			this.aShortArray89[local33] = (short) local85;
		}
		this.method4181();
		this.method4178();
		this.aBoolean433 = false;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5231(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class157_Sub2 local8 = (Class157_Sub2) arg0;
		if (this.anInt5004 == 0 || local8.anInt5004 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt4961;
		@Pc(27) int[] local27 = local8.anIntArray281;
		@Pc(30) int[] local30 = local8.anIntArray285;
		@Pc(33) int[] local33 = local8.anIntArray283;
		@Pc(36) short[] local36 = local8.aShortArray89;
		@Pc(39) short[] local39 = local8.aShortArray84;
		@Pc(42) short[] local42 = local8.aShortArray88;
		@Pc(45) byte[] local45 = local8.aByteArray33;
		@Pc(56) short[] local56;
		@Pc(52) short[] local52;
		@Pc(54) short[] local54;
		@Pc(50) byte[] local50;
		if (this.aClass103_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local50 = this.aClass103_1.aByteArray14;
			local56 = this.aClass103_1.aShortArray45;
			local54 = this.aClass103_1.aShortArray44;
			local52 = this.aClass103_1.aShortArray43;
		}
		@Pc(93) short[] local93;
		@Pc(89) short[] local89;
		@Pc(81) short[] local81;
		@Pc(85) byte[] local85;
		if (local8.aClass103_1 == null) {
			local85 = null;
			local93 = null;
			local89 = null;
			local81 = null;
		} else {
			local81 = local8.aClass103_1.aShortArray44;
			local85 = local8.aClass103_1.aByteArray14;
			local89 = local8.aClass103_1.aShortArray43;
			local93 = local8.aClass103_1.aShortArray45;
		}
		@Pc(106) int[] local106 = local8.anIntArray282;
		@Pc(109) short[] local109 = local8.aShortArray91;
		if (!local8.aBoolean433) {
			local8.method4188();
		}
		@Pc(120) int local120 = local8.anInt5003;
		@Pc(123) int local123 = local8.anInt4985;
		@Pc(126) int local126 = local8.anInt4995;
		@Pc(129) int local129 = local8.anInt4950;
		@Pc(132) int local132 = local8.anInt4955;
		@Pc(135) int local135 = local8.anInt4956;
		for (@Pc(137) int local137 = 0; local137 < this.anInt4961; local137++) {
			@Pc(147) int local147 = this.anIntArray285[local137] - arg2;
			if (local120 <= local147 && local123 >= local147) {
				@Pc(171) int local171 = this.anIntArray281[local137] - arg1;
				if (local171 >= local126 && local171 <= local129) {
					@Pc(195) int local195 = this.anIntArray283[local137] - arg3;
					if (local195 >= local132 && local135 >= local195) {
						@Pc(213) int local213 = -1;
						@Pc(218) int local218 = this.anIntArray282[local137];
						@Pc(225) int local225 = this.anIntArray282[local137 + 1];
						for (@Pc(227) int local227 = local218; local227 < local225; local227++) {
							local213 = this.aShortArray91[local227] - 1;
							if (local213 == -1 || this.aByteArray33[local213] != 0) {
								break;
							}
						}
						if (local213 != -1) {
							for (@Pc(264) int local264 = 0; local264 < local24; local264++) {
								if (local171 == local27[local264] && local33[local264] == local195 && local147 == local30[local264]) {
									local218 = local106[local264];
									local225 = local106[local264 + 1];
									@Pc(311) int local311 = -1;
									for (@Pc(313) int local313 = local218; local313 < local225; local313++) {
										local311 = local109[local313] - 1;
										if (local311 == -1 || local45[local311] != 0) {
											break;
										}
									}
									if (local311 != -1) {
										if (local56 == null) {
											this.aClass103_1 = new Class103();
											local56 = this.aClass103_1.aShortArray45 = Static371.method5359(this.aShortArray89);
											local52 = this.aClass103_1.aShortArray43 = Static371.method5359(this.aShortArray84);
											local54 = this.aClass103_1.aShortArray44 = Static371.method5359(this.aShortArray88);
											local50 = this.aClass103_1.aByteArray14 = Static309.method4679(this.aByteArray33);
										}
										if (local93 == null) {
											@Pc(404) Class103 local404 = local8.aClass103_1 = new Class103();
											local93 = local404.aShortArray45 = Static371.method5359(local36);
											local89 = local404.aShortArray43 = Static371.method5359(local39);
											local81 = local404.aShortArray44 = Static371.method5359(local42);
											local85 = local404.aByteArray14 = Static309.method4679(local45);
										}
										@Pc(437) short local437 = this.aShortArray89[local213];
										@Pc(442) short local442 = this.aShortArray84[local213];
										@Pc(447) short local447 = this.aShortArray88[local213];
										@Pc(452) byte local452 = this.aByteArray33[local213];
										local225 = local106[local264 + 1];
										local218 = local106[local264];
										@Pc(472) int local472;
										for (@Pc(464) int local464 = local218; local464 < local225; local464++) {
											local472 = local109[local464] - 1;
											if (local472 == -1) {
												break;
											}
											if (local85[local472] != 0) {
												local93[local472] += local437;
												local89[local472] += local442;
												local81[local472] += local447;
												local85[local472] += local452;
											}
										}
										local452 = local45[local311];
										local218 = this.anIntArray282[local137];
										local225 = this.anIntArray282[local137 + 1];
										local442 = local39[local311];
										local437 = local36[local311];
										local447 = local42[local311];
										for (local472 = local218; local472 < local225; local472++) {
											@Pc(562) int local562 = this.aShortArray91[local472] - 1;
											if (local562 == -1) {
												break;
											}
											if (local50[local562] != 0) {
												local56[local562] += local437;
												local52[local562] += local442;
												local54[local562] += local447;
												local50[local562] += local452;
											}
										}
										local8.method4178();
										this.method4178();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean429;
	}
}
