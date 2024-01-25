import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class149_Sub1 extends Class149 {

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "Z")
	private boolean aBoolean270;

	@OriginalMember(owner = "client!hm", name = "z", descriptor = "I")
	private int anInt4019;

	@OriginalMember(owner = "client!hm", name = "B", descriptor = "Z")
	private boolean aBoolean271;

	@OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
	private int anInt4020;

	@OriginalMember(owner = "client!hm", name = "L", descriptor = "Lclient!cca;")
	private Class50 aClass50_1;

	@OriginalMember(owner = "client!hm", name = "R", descriptor = "I")
	private int anInt4027;

	@OriginalMember(owner = "client!hm", name = "T", descriptor = "I")
	private int anInt4029;

	@OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
	private int anInt4031;

	@OriginalMember(owner = "client!hm", name = "ab", descriptor = "I")
	private int anInt4036;

	@OriginalMember(owner = "client!hm", name = "ub", descriptor = "I")
	private int anInt4049;

	@OriginalMember(owner = "client!hm", name = "Bb", descriptor = "I")
	private int anInt4053;

	@OriginalMember(owner = "client!hm", name = "Gb", descriptor = "Lclient!ada;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!hm", name = "Ib", descriptor = "Lclient!ada;")
	private Class5 aClass5_2;

	@OriginalMember(owner = "client!hm", name = "Ob", descriptor = "Lclient!ada;")
	private Class5 aClass5_3;

	@OriginalMember(owner = "client!hm", name = "Ub", descriptor = "Lclient!ada;")
	private Class5 aClass5_4;

	@OriginalMember(owner = "client!hm", name = "Zb", descriptor = "Lclient!ee;")
	private final Class95_Sub1 aClass95_Sub1_11;

	@OriginalMember(owner = "client!hm", name = "hc", descriptor = "I")
	private int anInt4074;

	@OriginalMember(owner = "client!hm", name = "tc", descriptor = "I")
	private int anInt4081;

	@OriginalMember(owner = "client!hm", name = "Bc", descriptor = "Z")
	private boolean aBoolean274;

	@OriginalMember(owner = "client!hm", name = "Cc", descriptor = "I")
	private int anInt4088;

	@OriginalMember(owner = "client!hm", name = "Hc", descriptor = "Lclient!cb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!hm", name = "hb", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!hm", name = "Fb", descriptor = "I")
	private int anInt4056;

	@OriginalMember(owner = "client!hm", name = "Yb", descriptor = "I")
	private int anInt4069;

	@OriginalMember(owner = "client!hm", name = "dc", descriptor = "Z")
	private boolean aBoolean273;

	@OriginalMember(owner = "client!hm", name = "zb", descriptor = "Z")
	private boolean aBoolean272;

	@OriginalMember(owner = "client!hm", name = "H", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!hm", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!hm", name = "kc", descriptor = "I")
	private int anInt4077;

	@OriginalMember(owner = "client!hm", name = "Ic", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!hm", name = "G", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "[Lclient!rea;")
	private Class305[] aClass305Array2;

	@OriginalMember(owner = "client!hm", name = "J", descriptor = "[Lclient!vja;")
	private Class373[] aClass373Array2;

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
	private int anInt4014;

	@OriginalMember(owner = "client!hm", name = "w", descriptor = "[Lclient!rs;")
	private Class314[] aClass314Array1;

	@OriginalMember(owner = "client!hm", name = "Kb", descriptor = "[Lclient!jk;")
	private Class183[] aClass183Array1;

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!hm", name = "Ec", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!hm", name = "D", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!hm", name = "jb", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!hm", name = "bb", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!hm", name = "qc", descriptor = "[F")
	private float[] aFloatArray27;

	@OriginalMember(owner = "client!hm", name = "zc", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!hm", name = "fb", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!hm", name = "O", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!hm", name = "A", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!hm", name = "N", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!hm", name = "xb", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!hm", name = "lc", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!hm", name = "mc", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!hm", name = "gc", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!hm", name = "Kc", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!hm", name = "Ab", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!hm", name = "qb", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!hm", name = "Cb", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!hm", name = "rc", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!hm", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!hm", name = "ec", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!hm", name = "Nb", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!ee;Lclient!gl;IIII)V")
	public Class149_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface2 local11 = arg0.anInterface2_12;
		this.anIntArray222 = new int[arg1.anInt3583 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt3576];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt3576; local24++) {
			if (arg1.aByteArray26 == null || arg1.aByteArray26[local24] != 2) {
				if (arg1.aShortArray43 != null && arg1.aShortArray43[local24] != -1) {
					@Pc(55) Class250 local55 = local11.method8330(arg1.aShortArray43[local24] & 0xFFFF);
					if (((this.anInt4036 & 0x40) == 0 || !local55.aBoolean466) && local55.aBoolean465) {
						continue;
					}
				}
				local22[this.anInt4056++] = local24;
				this.anIntArray222[arg1.aShortArray42[local24]]++;
				this.anIntArray222[arg1.aShortArray35[local24]]++;
				this.anIntArray222[arg1.aShortArray37[local24]]++;
			}
		}
		this.anInt4069 = this.anInt4056;
		@Pc(131) long[] local131 = new long[this.anInt4056];
		@Pc(140) boolean local140 = (this.anInt4074 & 0x100) != 0;
		@Pc(152) int local152;
		@Pc(165) int local165;
		@Pc(334) int local334;
		for (@Pc(142) int local142 = 0; local142 < this.anInt4056; local142++) {
			@Pc(148) int local148 = local22[local142];
			@Pc(150) Class250 local150 = null;
			local152 = 0;
			@Pc(154) byte local154 = 0;
			@Pc(156) byte local156 = 0;
			@Pc(158) byte local158 = 0;
			if (arg1.aClass145Array1 != null) {
				@Pc(163) boolean local163 = false;
				for (local165 = 0; local165 < arg1.aClass145Array1.length; local165++) {
					@Pc(172) Class145 local172 = arg1.aClass145Array1[local165];
					if (local148 == local172.anInt3834) {
						@Pc(185) Class258 local185 = Static538.method6887(local172.anInt3835);
						if (local185.aBoolean472) {
							local163 = true;
						}
						if (local185.anInt6708 != -1) {
							@Pc(201) Class250 local201 = local11.method8330(local185.anInt6708);
							if (local201.anInt6666 == 2) {
								this.aBoolean273 = true;
							}
						}
					}
				}
				if (local163) {
					local131[local142] = Long.MAX_VALUE;
					this.anInt4069--;
					continue;
				}
			}
			@Pc(232) short local232 = -1;
			if (arg1.aShortArray43 != null) {
				local232 = arg1.aShortArray43[local148];
				if (local232 != -1) {
					local150 = local11.method8330(local232 & 0xFFFF);
					if ((this.anInt4036 & 0x40) != 0 && local150.aBoolean466) {
						local150 = null;
						local232 = -1;
					} else {
						local158 = local150.aByte97;
						local156 = local150.aByte93;
					}
				}
			}
			@Pc(290) boolean local290 = arg1.aByteArray29 != null && arg1.aByteArray29[local148] != 0 || local150 != null && local150.anInt6666 != 0;
			if ((local140 || local290) && arg1.aByteArray30 != null) {
				local152 += arg1.aByteArray30[local148] << 17;
			}
			if (local290) {
				local152 += 65536;
			}
			local152 += (local156 & 0xFF) << 8;
			local152 += local158 & 0xFF;
			local334 = local154 + ((local232 & 0xFFFF) << 16);
			@Pc(340) int local340 = local334 + (local142 & 0xFFFF);
			local131[local142] = ((long) local152 << 32) + (long) local340;
			this.aBoolean272 |= local150 != null && (local150.aByte95 != 0 || local150.aByte92 != 0);
			this.aBoolean273 |= local290;
		}
		Static438.method5985(local131, local22);
		this.anIntArray221 = arg1.anIntArray192;
		this.lb = arg1.anInt3575;
		this.anInt4077 = arg1.anInt3583;
		this.anIntArray226 = arg1.anIntArray196;
		this.anIntArray220 = arg1.anIntArray197;
		this.aShortArray46 = arg1.aShortArray44;
		@Pc(412) Class321[] local412 = new Class321[this.anInt4077];
		this.aClass305Array2 = arg1.aClass305Array1;
		this.aClass373Array2 = arg1.aClass373Array1;
		@Pc(440) int local440;
		@Pc(454) int local454;
		@Pc(493) int local493;
		if (arg1.aClass145Array1 != null) {
			this.anInt4014 = arg1.aClass145Array1.length;
			this.aClass314Array1 = new Class314[this.anInt4014];
			this.aClass183Array1 = new Class183[this.anInt4014];
			for (local440 = 0; local440 < this.anInt4014; local440++) {
				@Pc(447) Class145 local447 = arg1.aClass145Array1[local440];
				@Pc(452) Class258 local452 = Static538.method6887(local447.anInt3835);
				local454 = -1;
				for (@Pc(456) int local456 = 0; local456 < this.anInt4056; local456++) {
					if (local22[local456] == local447.anInt3834) {
						local454 = local456;
						break;
					}
				}
				if (local454 == -1) {
					throw new RuntimeException();
				}
				local493 = Static537.anIntArray457[arg1.aShortArray38[local447.anInt3834] & 0xFFFF] & 0xFFFFFF;
				@Pc(510) int local510 = local493 | 255 - (arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local447.anInt3834]) << 24;
				this.aClass314Array1[local440] = new Class314(local454, arg1.aShortArray42[local447.anInt3834], arg1.aShortArray35[local447.anInt3834], arg1.aShortArray37[local447.anInt3834], local452.anInt6712, local452.anInt6711, local452.anInt6708, local452.anInt6713, local452.anInt6709, local452.aBoolean472, local452.aBoolean473, local447.anInt3833);
				this.aClass183Array1[local440] = new Class183(local510);
			}
		}
		local440 = this.anInt4056 * 3;
		this.aShortArray47 = new short[local440];
		this.aShortArray56 = new short[local440];
		this.aFloatArray26 = new float[local440];
		this.aShortArray52 = new short[this.anInt4056];
		this.aShortArray50 = new short[this.anInt4056];
		this.aFloatArray27 = new float[local440];
		this.aByteArray34 = new byte[local440];
		this.aShortArray51 = new short[this.anInt4056];
		this.aShortArray49 = new short[local440];
		this.aShortArray45 = new short[local440];
		this.aShortArray48 = new short[local440];
		Static108.aLongArray2 = new long[local440];
		this.aShort38 = (short) arg4;
		this.aShortArray53 = new short[this.anInt4056];
		this.aShortArray54 = new short[this.anInt4056];
		this.aShortArray55 = new short[local440];
		this.aShort39 = (short) arg3;
		if (arg1.aShortArray41 != null) {
			this.aShortArray57 = new short[this.anInt4056];
		}
		this.aByteArray33 = new byte[this.anInt4056];
		local152 = 0;
		for (local334 = 0; local334 < arg1.anInt3583; local334++) {
			local454 = this.anIntArray222[local334];
			this.anIntArray222[local334] = local152;
			local412[local334] = new Class321();
			local152 += local454;
		}
		this.anIntArray222[arg1.anInt3583] = local152;
		@Pc(696) Class44 local696 = Static87.method1483(arg1, local22, this.anInt4056);
		@Pc(700) Class166[] local700 = new Class166[arg1.anInt3576];
		@Pc(740) int local740;
		@Pc(751) int local751;
		@Pc(762) int local762;
		@Pc(719) short local719;
		@Pc(729) int local729;
		for (local493 = 0; local493 < arg1.anInt3576; local493++) {
			@Pc(709) short local709 = arg1.aShortArray42[local493];
			@Pc(714) short local714 = arg1.aShortArray35[local493];
			local719 = arg1.aShortArray37[local493];
			local729 = this.anIntArray220[local714] - this.anIntArray220[local709];
			local740 = this.anIntArray221[local714] - this.anIntArray221[local709];
			local751 = this.anIntArray226[local714] - this.anIntArray226[local709];
			local762 = this.anIntArray220[local719] - this.anIntArray220[local709];
			@Pc(773) int local773 = this.anIntArray221[local719] - this.anIntArray221[local709];
			@Pc(783) int local783 = this.anIntArray226[local719] - this.anIntArray226[local709];
			@Pc(792) int local792 = local740 * local783 - local751 * local773;
			@Pc(801) int local801 = local751 * local762 - local729 * local783;
			@Pc(810) int local810 = local773 * local729 - local762 * local740;
			while (local792 > 8192 || local801 > 8192 || local810 > 8192 || local792 < -8192 || local801 < -8192 || local810 < -8192) {
				local810 >>= 0x1;
				local801 >>= 0x1;
				local792 >>= 0x1;
			}
			@Pc(864) int local864 = (int) Math.sqrt((double) (local801 * local801 + local792 * local792 + local810 * local810));
			if (local864 <= 0) {
				local864 = 1;
			}
			local792 = local792 * 256 / local864;
			local801 = local801 * 256 / local864;
			local810 = local810 * 256 / local864;
			@Pc(899) byte local899 = arg1.aByteArray26 == null ? 0 : arg1.aByteArray26[local493];
			if (local899 == 0) {
				@Pc(932) Class321 local932 = local412[local709];
				local932.anInt8556 += local801;
				local932.anInt8554 += local810;
				local932.anInt8560++;
				local932.anInt8553 += local792;
				@Pc(960) Class321 local960 = local412[local714];
				local960.anInt8560++;
				local960.anInt8556 += local801;
				local960.anInt8554 += local810;
				local960.anInt8553 += local792;
				@Pc(988) Class321 local988 = local412[local719];
				local988.anInt8554 += local810;
				local988.anInt8560++;
				local988.anInt8556 += local801;
				local988.anInt8553 += local792;
			} else if (local899 == 1) {
				@Pc(917) Class166 local917 = local700[local493] = new Class166();
				local917.anInt4568 = local810;
				local917.anInt4565 = local801;
				local917.anInt4562 = local792;
			}
		}
		@Pc(1029) int local1029;
		@Pc(1072) short local1072;
		for (local165 = 0; local165 < this.anInt4056; local165++) {
			local1029 = local22[local165];
			@Pc(1036) int local1036 = arg1.aShortArray38[local1029] & 0xFFFF;
			if (arg1.aByteArray28 == null) {
				local729 = -1;
			} else {
				local729 = arg1.aByteArray28[local1029];
			}
			if (arg1.aByteArray29 == null) {
				local740 = 0;
			} else {
				local740 = arg1.aByteArray29[local1029] & 0xFF;
			}
			local1072 = arg1.aShortArray43 == null ? -1 : arg1.aShortArray43[local1029];
			if (local1072 != -1 && (this.anInt4036 & 0x40) != 0) {
				@Pc(1090) Class250 local1090 = local11.method8330(local1072 & 0xFFFF);
				if (local1090.aBoolean466) {
					local1072 = -1;
				}
			}
			@Pc(1097) float local1097 = 0.0F;
			@Pc(1099) float local1099 = 0.0F;
			@Pc(1101) float local1101 = 0.0F;
			@Pc(1103) float local1103 = 0.0F;
			@Pc(1105) float local1105 = 0.0F;
			@Pc(1107) float local1107 = 0.0F;
			@Pc(1109) byte local1109 = 0;
			@Pc(1111) byte local1111 = 0;
			@Pc(1113) int local1113 = 0;
			@Pc(1148) byte local1148;
			@Pc(1165) short local1165;
			@Pc(1960) short local1960;
			@Pc(1965) short local1965;
			if (local1072 != -1) {
				if (local729 == -1) {
					local1099 = 1.0F;
					local1105 = 0.0F;
					local1111 = 2;
					local1109 = 1;
					local1107 = 0.0F;
					local1097 = 0.0F;
					local1103 = 1.0F;
					local1101 = 1.0F;
				} else {
					local729 &= 0xFF;
					local1148 = arg1.aByteArray25[local729];
					@Pc(1155) short local1155;
					@Pc(1160) short local1160;
					@Pc(1198) float local1198;
					@Pc(1211) float local1211;
					@Pc(1305) float local1305;
					@Pc(1751) float local1751;
					@Pc(1759) float local1759;
					@Pc(1767) float local1767;
					@Pc(1790) float local1790;
					@Pc(1813) float local1813;
					@Pc(1836) float local1836;
					if (local1148 == 0) {
						local1155 = arg1.aShortArray42[local1029];
						local1160 = arg1.aShortArray35[local1029];
						local1165 = arg1.aShortArray37[local1029];
						local1960 = arg1.aShortArray36[local729];
						local1965 = arg1.aShortArray40[local729];
						@Pc(1970) short local1970 = arg1.aShortArray39[local729];
						@Pc(1976) float local1976 = (float) arg1.anIntArray197[local1960];
						@Pc(1982) float local1982 = (float) arg1.anIntArray192[local1960];
						local1198 = (float) arg1.anIntArray196[local1960];
						local1211 = (float) arg1.anIntArray197[local1965] - local1976;
						local1305 = (float) arg1.anIntArray192[local1965] - local1982;
						@Pc(2012) float local2012 = (float) arg1.anIntArray196[local1965] - local1198;
						@Pc(2020) float local2020 = (float) arg1.anIntArray197[local1970] - local1976;
						@Pc(2029) float local2029 = (float) arg1.anIntArray192[local1970] - local1982;
						@Pc(2038) float local2038 = (float) arg1.anIntArray196[local1970] - local1198;
						@Pc(2047) float local2047 = (float) arg1.anIntArray197[local1155] - local1976;
						@Pc(2055) float local2055 = (float) arg1.anIntArray192[local1155] - local1982;
						@Pc(2063) float local2063 = (float) arg1.anIntArray196[local1155] - local1198;
						@Pc(2071) float local2071 = (float) arg1.anIntArray197[local1160] - local1976;
						@Pc(2080) float local2080 = (float) arg1.anIntArray192[local1160] - local1982;
						local1751 = (float) arg1.anIntArray196[local1160] - local1198;
						local1759 = (float) arg1.anIntArray197[local1165] - local1976;
						local1767 = (float) arg1.anIntArray192[local1165] - local1982;
						local1790 = (float) arg1.anIntArray196[local1165] - local1198;
						local1813 = local2038 * local1305 - local2029 * local2012;
						local1836 = local2020 * local2012 - local1211 * local2038;
						@Pc(2139) float local2139 = local1211 * local2029 - local1305 * local2020;
						@Pc(2147) float local2147 = local2139 * local2029 - local1836 * local2038;
						@Pc(2156) float local2156 = local1813 * local2038 - local2020 * local2139;
						@Pc(2164) float local2164 = local2020 * local1836 - local2029 * local1813;
						@Pc(2178) float local2178 = 1.0F / (local2164 * local2012 + local1211 * local2147 + local1305 * local2156);
						local1097 = (local2164 * local2063 + local2047 * local2147 + local2156 * local2055) * local2178;
						local1105 = local2178 * (local1790 * local2164 + local1767 * local2156 + local2147 * local1759);
						local1101 = (local2156 * local2080 + local2071 * local2147 + local2164 * local1751) * local2178;
						@Pc(2229) float local2229 = local1836 * local1211 - local1305 * local1813;
						@Pc(2238) float local2238 = local2012 * local1813 - local1211 * local2139;
						@Pc(2246) float local2246 = local1305 * local2139 - local1836 * local2012;
						@Pc(2260) float local2260 = 1.0F / (local2020 * local2246 + local2029 * local2238 + local2038 * local2229);
						local1103 = local2260 * (local2246 * local2071 + local2238 * local2080 + local1751 * local2229);
						local1099 = (local2055 * local2238 + local2246 * local2047 + local2229 * local2063) * local2260;
						local1107 = (local2246 * local1759 + local2238 * local1767 + local2229 * local1790) * local2260;
					} else {
						local1155 = arg1.aShortArray42[local1029];
						local1160 = arg1.aShortArray35[local1029];
						local1165 = arg1.aShortArray37[local1029];
						@Pc(1170) int local1170 = local696.anIntArray64[local729];
						@Pc(1175) int local1175 = local696.anIntArray66[local729];
						@Pc(1180) int local1180 = local696.anIntArray65[local729];
						@Pc(1185) float[] local1185 = local696.aFloatArrayArray5[local729];
						@Pc(1190) byte local1190 = arg1.aByteArray31[local729];
						local1198 = (float) arg1.anIntArray195[local729] / 256.0F;
						if (local1148 == 1) {
							local1211 = (float) arg1.anIntArray189[local729] / 1024.0F;
							Static618.method8344(arg1.anIntArray192[local1155], local1185, arg1.anIntArray197[local1155], local1190, local1198, local1211, Static20.aFloatArray3, local1175, local1180, arg1.anIntArray196[local1155], local1170);
							local1097 = Static20.aFloatArray3[0];
							local1099 = Static20.aFloatArray3[1];
							Static618.method8344(arg1.anIntArray192[local1160], local1185, arg1.anIntArray197[local1160], local1190, local1198, local1211, Static20.aFloatArray3, local1175, local1180, arg1.anIntArray196[local1160], local1170);
							local1101 = Static20.aFloatArray3[0];
							local1103 = Static20.aFloatArray3[1];
							Static618.method8344(arg1.anIntArray192[local1165], local1185, arg1.anIntArray197[local1165], local1190, local1198, local1211, Static20.aFloatArray3, local1175, local1180, arg1.anIntArray196[local1165], local1170);
							local1107 = Static20.aFloatArray3[1];
							local1105 = Static20.aFloatArray3[0];
							local1305 = local1211 / 2.0F;
							if ((local1190 & 0x1) == 0) {
								if (local1305 < local1101 - local1097) {
									local1101 -= local1211;
									local1109 = 1;
								} else if (local1097 - local1101 > local1305) {
									local1109 = 2;
									local1101 += local1211;
								}
								if (local1305 < local1105 - local1097) {
									local1105 -= local1211;
									local1111 = 1;
								} else if (local1097 - local1105 > local1305) {
									local1105 += local1211;
									local1111 = 2;
								}
							} else {
								if (local1305 < local1103 - local1099) {
									local1103 -= local1211;
									local1109 = 1;
								} else if (local1099 - local1103 > local1305) {
									local1109 = 2;
									local1103 += local1211;
								}
								if (local1305 < local1107 - local1099) {
									local1107 -= local1211;
									local1111 = 1;
								} else if (local1099 - local1107 > local1305) {
									local1107 += local1211;
									local1111 = 2;
								}
							}
						} else if (local1148 == 2) {
							local1211 = (float) arg1.anIntArray191[local729] / 256.0F;
							local1305 = (float) arg1.anIntArray199[local729] / 256.0F;
							@Pc(1661) int local1661 = arg1.anIntArray197[local1160] - arg1.anIntArray197[local1155];
							@Pc(1672) int local1672 = arg1.anIntArray192[local1160] - arg1.anIntArray192[local1155];
							@Pc(1683) int local1683 = arg1.anIntArray196[local1160] - arg1.anIntArray196[local1155];
							@Pc(1694) int local1694 = arg1.anIntArray197[local1165] - arg1.anIntArray197[local1155];
							@Pc(1705) int local1705 = arg1.anIntArray192[local1165] - arg1.anIntArray192[local1155];
							@Pc(1716) int local1716 = arg1.anIntArray196[local1165] - arg1.anIntArray196[local1155];
							@Pc(1725) int local1725 = local1716 * local1672 - local1683 * local1705;
							@Pc(1734) int local1734 = local1694 * local1683 - local1716 * local1661;
							@Pc(1743) int local1743 = local1705 * local1661 - local1694 * local1672;
							local1751 = 64.0F / (float) arg1.anIntArray190[local729];
							local1759 = 64.0F / (float) arg1.anIntArray193[local729];
							local1767 = 64.0F / (float) arg1.anIntArray189[local729];
							local1790 = ((float) local1725 * local1185[0] + (float) local1734 * local1185[1] + local1185[2] * (float) local1743) / local1751;
							local1813 = (local1185[3] * (float) local1725 + (float) local1734 * local1185[4] + (float) local1743 * local1185[5]) / local1759;
							local1836 = ((float) local1725 * local1185[6] + local1185[7] * (float) local1734 + (float) local1743 * local1185[8]) / local1767;
							local1113 = Static475.method6320(local1836, local1813, local1790);
							Static106.method1694(local1175, arg1.anIntArray197[local1155], local1170, local1113, arg1.anIntArray192[local1155], local1305, local1185, local1190, arg1.anIntArray196[local1155], local1211, local1198, local1180, Static20.aFloatArray3);
							local1099 = Static20.aFloatArray3[1];
							local1097 = Static20.aFloatArray3[0];
							Static106.method1694(local1175, arg1.anIntArray197[local1160], local1170, local1113, arg1.anIntArray192[local1160], local1305, local1185, local1190, arg1.anIntArray196[local1160], local1211, local1198, local1180, Static20.aFloatArray3);
							local1101 = Static20.aFloatArray3[0];
							local1103 = Static20.aFloatArray3[1];
							Static106.method1694(local1175, arg1.anIntArray197[local1165], local1170, local1113, arg1.anIntArray192[local1165], local1305, local1185, local1190, arg1.anIntArray196[local1165], local1211, local1198, local1180, Static20.aFloatArray3);
							local1107 = Static20.aFloatArray3[1];
							local1105 = Static20.aFloatArray3[0];
						} else if (local1148 == 3) {
							Static5.method86(arg1.anIntArray192[local1155], local1198, local1180, arg1.anIntArray196[local1155], Static20.aFloatArray3, local1175, local1170, local1185, local1190, arg1.anIntArray197[local1155]);
							local1097 = Static20.aFloatArray3[0];
							local1099 = Static20.aFloatArray3[1];
							Static5.method86(arg1.anIntArray192[local1160], local1198, local1180, arg1.anIntArray196[local1160], Static20.aFloatArray3, local1175, local1170, local1185, local1190, arg1.anIntArray197[local1160]);
							local1101 = Static20.aFloatArray3[0];
							local1103 = Static20.aFloatArray3[1];
							Static5.method86(arg1.anIntArray192[local1165], local1198, local1180, arg1.anIntArray196[local1165], Static20.aFloatArray3, local1175, local1170, local1185, local1190, arg1.anIntArray197[local1165]);
							local1107 = Static20.aFloatArray3[1];
							local1105 = Static20.aFloatArray3[0];
							if ((local1190 & 0x1) == 0) {
								if (local1101 - local1097 > 0.5F) {
									local1109 = 1;
									local1101--;
								} else if (local1097 - local1101 > 0.5F) {
									local1101++;
									local1109 = 2;
								}
								if (local1105 - local1097 > 0.5F) {
									local1105--;
									local1111 = 1;
								} else if (local1097 - local1105 > 0.5F) {
									local1105++;
									local1111 = 2;
								}
							} else {
								if (local1103 - local1099 > 0.5F) {
									local1109 = 1;
									local1103--;
								} else if (local1099 - local1103 > 0.5F) {
									local1103++;
									local1109 = 2;
								}
								if (local1107 - local1099 > 0.5F) {
									local1111 = 1;
									local1107--;
								} else if (local1099 - local1107 > 0.5F) {
									local1107++;
									local1111 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray26 == null) {
				local1148 = 0;
			} else {
				local1148 = arg1.aByteArray26[local1029];
			}
			if (local1148 == 0) {
				@Pc(2466) long local2466 = ((long) (local1113 << 24) + (long) (local1036 << 8) + (long) local740 << 32) + (long) (local729 << 2);
				local1165 = arg1.aShortArray42[local1029];
				local1960 = arg1.aShortArray35[local1029];
				local1965 = arg1.aShortArray37[local1029];
				@Pc(2485) Class321 local2485 = local412[local1165];
				this.aShortArray50[local165] = this.method3484(arg1, local2485.anInt8554, local1097, local2485.anInt8560, local1165, local2485.anInt8553, local165, local2485.anInt8556, local1099, local2466);
				@Pc(2510) Class321 local2510 = local412[local1960];
				this.aShortArray51[local165] = this.method3484(arg1, local2510.anInt8554, local1101, local2510.anInt8560, local1960, local2510.anInt8553, local165, local2510.anInt8556, local1103, local2466 + (long) local1109);
				@Pc(2538) Class321 local2538 = local412[local1965];
				this.aShortArray52[local165] = this.method3484(arg1, local2538.anInt8554, local1105, local2538.anInt8560, local1965, local2538.anInt8553, local165, local2538.anInt8556, local1107, (long) local1111 + local2466);
			} else if (local1148 == 1) {
				@Pc(2323) Class166 local2323 = local700[local1029];
				@Pc(2368) long local2368 = (long) ((local729 << 2) + (local2323.anInt4562 <= 0 ? 2048 : 1024) + (local2323.anInt4565 + 256 << 12) + (local2323.anInt4568 + 256 << 22)) + ((long) local740 + (long) (local1036 << 8) + (long) (local1113 << 24) << 32);
				this.aShortArray50[local165] = this.method3484(arg1, local2323.anInt4568, local1097, 0, arg1.aShortArray42[local1029], local2323.anInt4562, local165, local2323.anInt4565, local1099, local2368);
				this.aShortArray51[local165] = this.method3484(arg1, local2323.anInt4568, local1101, 0, arg1.aShortArray35[local1029], local2323.anInt4562, local165, local2323.anInt4565, local1103, local2368 + (long) local1109);
				this.aShortArray52[local165] = this.method3484(arg1, local2323.anInt4568, local1105, 0, arg1.aShortArray37[local1029], local2323.anInt4562, local165, local2323.anInt4565, local1107, local2368 + (long) local1111);
			}
			if (arg1.aByteArray29 != null) {
				this.aByteArray33[local165] = arg1.aByteArray29[local1029];
			}
			if (arg1.aShortArray41 != null) {
				this.aShortArray57[local165] = arg1.aShortArray41[local1029];
			}
			this.aShortArray54[local165] = arg1.aShortArray38[local1029];
			this.aShortArray53[local165] = local1072;
		}
		if (this.anInt4069 > 0) {
			local1029 = 1;
			local719 = this.aShortArray53[0];
			for (local729 = 0; local729 < this.anInt4069; local729++) {
				@Pc(2624) short local2624 = this.aShortArray53[local729];
				if (local2624 != local719) {
					local719 = local2624;
					local1029++;
				}
			}
			this.anIntArray223 = new int[local1029];
			this.anIntArray224 = new int[local1029 + 1];
			this.anIntArray225 = new int[local1029];
			this.anIntArray224[0] = 0;
			local740 = this.anInt4081;
			local1072 = 0;
			local1029 = 0;
			local719 = this.aShortArray53[0];
			for (local762 = 0; local762 < this.anInt4069; local762++) {
				@Pc(2683) short local2683 = this.aShortArray53[local762];
				if (local2683 != local719) {
					this.anIntArray223[local1029] = local740;
					this.anIntArray225[local1029] = local1072 + 1 - local740;
					local1029++;
					this.anIntArray224[local1029] = local762;
					local719 = local2683;
					local1072 = 0;
					local740 = this.anInt4081;
				}
				@Pc(2722) short local2722 = this.aShortArray50[local762];
				if (local2722 < local740) {
					local740 = local2722;
				}
				if (local1072 < local2722) {
					local1072 = local2722;
				}
				local2722 = this.aShortArray51[local762];
				if (local740 > local2722) {
					local740 = local2722;
				}
				if (local2722 > local1072) {
					local1072 = local2722;
				}
				local2722 = this.aShortArray52[local762];
				if (local1072 < local2722) {
					local1072 = local2722;
				}
				if (local2722 < local740) {
					local740 = local2722;
				}
			}
			this.anIntArray223[local1029] = local740;
			this.anIntArray225[local1029] = local1072 + 1 - local740;
			local1029++;
			this.anIntArray224[local1029] = this.anInt4069;
		}
		Static108.aLongArray2 = null;
		this.aShortArray45 = Static479.method7872(this.aShortArray45, this.anInt4081);
		this.aShortArray48 = Static479.method7872(this.aShortArray48, this.anInt4081);
		this.aShortArray56 = Static479.method7872(this.aShortArray56, this.anInt4081);
		this.aShortArray47 = Static479.method7872(this.aShortArray47, this.anInt4081);
		this.aShortArray49 = Static479.method7872(this.aShortArray49, this.anInt4081);
		this.aByteArray34 = Static196.method3028(this.aByteArray34, this.anInt4081);
		this.aFloatArray26 = Static663.method8841(this.aFloatArray26, this.anInt4081);
		this.aFloatArray27 = Static663.method8841(this.aFloatArray27, this.anInt4081);
		if (arg1.anIntArray194 != null && Static348.method5050(this.anInt4036, arg2)) {
			this.anIntArrayArray27 = arg1.method3053(false);
		}
		if (arg1.aClass145Array1 != null && Static37.method750(arg2, this.anInt4036)) {
			this.anIntArrayArray29 = arg1.method3056();
		}
		if (arg1.anIntArray198 != null && Static93.method1602(this.anInt4036, arg2)) {
			local1029 = 0;
			@Pc(2910) int[] local2910 = new int[256];
			for (local729 = 0; local729 < this.anInt4056; local729++) {
				local740 = arg1.anIntArray198[local22[local729]];
				if (local740 >= 0) {
					if (local740 > local1029) {
						local1029 = local740;
					}
					@Pc(2936) int local2936 = local2910[local740]++;
				}
			}
			this.anIntArrayArray28 = new int[local1029 + 1][];
			for (local740 = 0; local740 <= local1029; local740++) {
				this.anIntArrayArray28[local740] = new int[local2910[local740]];
				local2910[local740] = 0;
			}
			for (local751 = 0; local751 < this.anInt4056; local751++) {
				local762 = arg1.anIntArray198[local22[local751]];
				if (local762 >= 0) {
					this.anIntArrayArray28[local762][local2910[local762]++] = local751;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!ee;IIZZ)V")
	public Class149_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean271 = false;
		this.aBoolean270 = false;
		this.anInt4056 = 0;
		this.aBoolean272 = false;
		this.lb = 0;
		this.aBoolean273 = false;
		this.anInt4081 = 0;
		this.anInt4077 = 0;
		this.aBoolean274 = true;
		this.anInt4069 = 0;
		this.anInt4036 = arg2;
		this.aBoolean271 = arg4;
		this.aClass95_Sub1_11 = arg0;
		this.anInt4074 = arg1;
		if (arg3 || Static353.method5112(this.anInt4036, this.anInt4074)) {
			this.aClass5_2 = new Class5(Static371.method5293(this.anInt4036, this.anInt4074));
		}
		if (arg3 || Static155.method2483(this.anInt4074, this.anInt4036)) {
			this.aClass5_4 = new Class5(Static316.method4540(this.anInt4074, this.anInt4036));
		}
		if (arg3 || Static155.method2482(this.anInt4036, this.anInt4074)) {
			this.aClass5_3 = new Class5(Static559.method7378(this.anInt4074, this.anInt4036));
		}
		if (arg3 || Static489.method6455(this.anInt4036, this.anInt4074)) {
			this.aClass5_1 = new Class5(Static366.method5268(this.anInt4036, this.anInt4074));
		}
		if (arg3 || Static1.method8751(this.anInt4074, this.anInt4036)) {
			this.aClass47_1 = new Class47(Static97.method1619(this.anInt4074, this.anInt4036));
		}
	}

	@OriginalMember(owner = "client!hm", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean270) {
			this.method3477();
		}
		return this.anInt4019;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
	private void method3471() {
		if (!this.aBoolean274) {
			return;
		}
		this.aBoolean274 = false;
		if (this.aClass373Array2 == null && this.aClass305Array2 == null && this.aClass314Array1 == null) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			if (this.anIntArray220 != null && !Static449.method6087(this.anInt4036, this.anInt4074)) {
				if (this.aClass5_2 == null || this.aClass5_2.method108()) {
					local23 = true;
					if (!this.aBoolean270) {
						this.method3477();
					}
				} else {
					this.aBoolean274 = true;
				}
			}
			@Pc(58) boolean local58 = false;
			if (this.anIntArray221 != null && !Static309.method4445(this.anInt4036, this.anInt4074)) {
				if (this.aClass5_2 == null || this.aClass5_2.method108()) {
					if (!this.aBoolean270) {
						this.method3477();
					}
					local25 = true;
				} else {
					this.aBoolean274 = true;
				}
			}
			if (this.anIntArray226 != null && !Static274.method4025(this.anInt4074, this.anInt4036)) {
				if (this.aClass5_2 == null || this.aClass5_2.method108()) {
					local58 = true;
					if (!this.aBoolean270) {
						this.method3477();
					}
				} else {
					this.aBoolean274 = true;
				}
			}
			if (local23) {
				this.anIntArray220 = null;
			}
			if (local25) {
				this.anIntArray221 = null;
			}
			if (local58) {
				this.anIntArray226 = null;
			}
		}
		if (this.aShortArray55 != null && this.anIntArray220 == null && this.anIntArray221 == null && this.anIntArray226 == null) {
			this.anIntArray222 = null;
			this.aShortArray55 = null;
		}
		if (this.aByteArray34 != null && !Static79.method1312(this.anInt4074, this.anInt4036)) {
			label202: {
				label201: {
					@Pc(177) boolean local177;
					if ((this.anInt4036 & 0x37) == 0) {
						if (this.aClass5_3 == null || this.aClass5_3.method108()) {
							break label201;
						}
						local177 = false;
					} else {
						if (this.aClass5_1 == null || this.aClass5_1.method108()) {
							break label201;
						}
						local177 = false;
					}
					if (!local177) {
						this.aBoolean274 = true;
						break label202;
					}
				}
				this.aShortArray56 = this.aShortArray47 = this.aShortArray49 = null;
				this.aByteArray34 = null;
			}
		}
		if (this.aShortArray54 != null && !Static336.method4917(this.anInt4036, this.anInt4074)) {
			if (this.aClass5_3 == null || this.aClass5_3.method108()) {
				this.aShortArray54 = null;
			} else {
				this.aBoolean274 = true;
			}
		}
		if (this.aByteArray33 != null && !Static630.method8505(this.anInt4074, this.anInt4036)) {
			if (this.aClass5_3 == null || this.aClass5_3.method108()) {
				this.aByteArray33 = null;
			} else {
				this.aBoolean274 = true;
			}
		}
		if (this.aFloatArray26 != null && !Static625.method8447(this.anInt4074, this.anInt4036)) {
			if (this.aClass5_4 == null || this.aClass5_4.method108()) {
				this.aFloatArray26 = this.aFloatArray27 = null;
			} else {
				this.aBoolean274 = true;
			}
		}
		if (this.aShortArray53 != null && !Static379.method5353(this.anInt4074, this.anInt4036)) {
			if (this.aClass5_3 == null || this.aClass5_3.method108()) {
				this.aShortArray53 = null;
			} else {
				this.aBoolean274 = true;
			}
		}
		if (this.aShortArray50 != null && !Static58.method7706(this.anInt4036, this.anInt4074)) {
			if ((this.aClass47_1 == null || this.aClass47_1.method1165()) && (this.aClass5_3 == null || this.aClass5_3.method108())) {
				this.aShortArray50 = this.aShortArray51 = this.aShortArray52 = null;
			} else {
				this.aBoolean274 = true;
			}
		}
		if (this.aShortArray45 != null) {
			if (this.aClass5_2 == null || this.aClass5_2.method108()) {
				this.aShortArray45 = null;
			} else {
				this.aBoolean274 = true;
			}
		}
		if (this.aShortArray48 != null) {
			if (this.aClass5_3 == null || this.aClass5_3.method108()) {
				this.aShortArray48 = null;
			} else {
				this.aBoolean274 = true;
			}
		}
		if (this.anIntArrayArray28 != null && !Static93.method1602(this.anInt4036, this.anInt4074)) {
			this.anIntArrayArray28 = null;
			this.aShortArray57 = null;
		}
		if (this.anIntArrayArray27 != null && !Static348.method5050(this.anInt4036, this.anInt4074)) {
			this.anIntArrayArray27 = null;
			this.aShortArray46 = null;
		}
		if (this.anIntArrayArray29 != null && !Static37.method750(this.anInt4074, this.anInt4036)) {
			this.anIntArrayArray29 = null;
		}
		if (this.anIntArray224 != null && (this.anInt4074 & 0x800) == 0 && (this.anInt4074 & 0x40000) == 0) {
			this.anIntArray225 = null;
			this.anIntArray224 = null;
			this.anIntArray223 = null;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZILclient!hm;ILclient!hm;Z)Lclient!ka;")
	private Class149 method3472(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class149_Sub1 arg2, @OriginalArg(4) Class149_Sub1 arg3, @OriginalArg(5) boolean arg4) {
		arg3.anInt4036 = this.anInt4036;
		arg3.aBoolean272 = this.aBoolean272;
		arg3.anInt4056 = this.anInt4056;
		arg3.anInt4074 = arg1;
		arg3.aShort38 = this.aShort38;
		arg3.anInt4014 = this.anInt4014;
		arg3.aShort39 = this.aShort39;
		arg3.anInt4069 = this.anInt4069;
		arg3.lb = this.lb;
		arg3.anInt4077 = this.anInt4077;
		if ((arg1 & 0x100) == 0) {
			arg3.aBoolean273 = this.aBoolean273;
		} else {
			arg3.aBoolean273 = true;
		}
		arg3.anInt4081 = this.anInt4081;
		@Pc(70) boolean local70 = Static26.method590(this.anInt4036, arg1);
		@Pc(76) boolean local76 = Static315.method4516(this.anInt4036, arg1);
		@Pc(82) boolean local82 = Static663.method8844(this.anInt4036, arg1);
		@Pc(88) boolean local88 = local82 | local70 | local76;
		@Pc(193) int local193;
		if (local88) {
			if (!local70) {
				arg3.anIntArray220 = this.anIntArray220;
			} else if (arg2.anIntArray220 == null || arg2.anIntArray220.length < this.lb) {
				arg3.anIntArray220 = arg2.anIntArray220 = new int[this.lb];
			} else {
				arg3.anIntArray220 = arg2.anIntArray220;
			}
			if (!local76) {
				arg3.anIntArray221 = this.anIntArray221;
			} else if (arg2.anIntArray221 == null || arg2.anIntArray221.length < this.lb) {
				arg3.anIntArray221 = arg2.anIntArray221 = new int[this.lb];
			} else {
				arg3.anIntArray221 = arg2.anIntArray221;
			}
			if (!local82) {
				arg3.anIntArray226 = this.anIntArray226;
			} else if (arg2.anIntArray226 == null || this.lb > arg2.anIntArray226.length) {
				arg3.anIntArray226 = arg2.anIntArray226 = new int[this.lb];
			} else {
				arg3.anIntArray226 = arg2.anIntArray226;
			}
			for (local193 = 0; local193 < this.lb; local193++) {
				if (local70) {
					arg3.anIntArray220[local193] = this.anIntArray220[local193];
				}
				if (local76) {
					arg3.anIntArray221[local193] = this.anIntArray221[local193];
				}
				if (local82) {
					arg3.anIntArray226[local193] = this.anIntArray226[local193];
				}
			}
		} else {
			arg3.anIntArray221 = this.anIntArray221;
			arg3.anIntArray226 = this.anIntArray226;
			arg3.anIntArray220 = this.anIntArray220;
		}
		if (Static371.method5293(this.anInt4036, arg1)) {
			arg3.aClass5_2 = arg2.aClass5_2;
			arg3.aClass5_2.anInterface15_2 = this.aClass5_2.anInterface15_2;
			arg3.aClass5_2.aBoolean6 = this.aClass5_2.aBoolean6;
			arg3.aClass5_2.aBoolean5 = true;
		} else if (Static353.method5112(this.anInt4036, arg1)) {
			arg3.aClass5_2 = this.aClass5_2;
		} else {
			arg3.aClass5_2 = null;
		}
		if (Static258.method3864(arg1, this.anInt4036)) {
			if (arg2.aShortArray54 == null || this.anInt4056 > arg2.aShortArray54.length) {
				arg3.aShortArray54 = arg2.aShortArray54 = new short[this.anInt4056];
			} else {
				arg3.aShortArray54 = arg2.aShortArray54;
			}
			for (local193 = 0; local193 < this.anInt4056; local193++) {
				arg3.aShortArray54[local193] = this.aShortArray54[local193];
			}
		} else {
			arg3.aShortArray54 = this.aShortArray54;
		}
		if (Static152.method8491(this.anInt4036, arg1)) {
			if (arg2.aByteArray33 == null || arg2.aByteArray33.length < this.anInt4056) {
				arg3.aByteArray33 = arg2.aByteArray33 = new byte[this.anInt4056];
			} else {
				arg3.aByteArray33 = arg2.aByteArray33;
			}
			for (local193 = 0; local193 < this.anInt4056; local193++) {
				arg3.aByteArray33[local193] = this.aByteArray33[local193];
			}
		} else {
			arg3.aByteArray33 = this.aByteArray33;
		}
		if (Static559.method7378(arg1, this.anInt4036)) {
			arg3.aClass5_3 = arg2.aClass5_3;
			arg3.aClass5_3.anInterface15_2 = this.aClass5_3.anInterface15_2;
			arg3.aClass5_3.aBoolean5 = true;
			arg3.aClass5_3.aBoolean6 = this.aClass5_3.aBoolean6;
		} else if (Static155.method2482(this.anInt4036, arg1)) {
			arg3.aClass5_3 = this.aClass5_3;
		} else {
			arg3.aClass5_3 = null;
		}
		@Pc(576) int local576;
		if (Static131.method2235(this.anInt4036, arg1)) {
			if (arg2.aShortArray56 == null || this.anInt4081 > arg2.aShortArray56.length) {
				local193 = this.anInt4081;
				arg3.aShortArray49 = arg2.aShortArray49 = new short[local193];
				arg3.aShortArray56 = arg2.aShortArray56 = new short[local193];
				arg3.aShortArray47 = arg2.aShortArray47 = new short[local193];
			} else {
				arg3.aShortArray49 = arg2.aShortArray49;
				arg3.aShortArray47 = arg2.aShortArray47;
				arg3.aShortArray56 = arg2.aShortArray56;
			}
			if (this.aClass50_1 == null) {
				arg3.aClass50_1 = null;
				for (local193 = 0; local193 < this.anInt4081; local193++) {
					arg3.aShortArray56[local193] = this.aShortArray56[local193];
					arg3.aShortArray47[local193] = this.aShortArray47[local193];
					arg3.aShortArray49[local193] = this.aShortArray49[local193];
				}
			} else {
				if (arg2.aClass50_1 == null) {
					arg2.aClass50_1 = new Class50();
				}
				@Pc(560) Class50 local560 = arg3.aClass50_1 = arg2.aClass50_1;
				if (local560.aShortArray19 == null || this.anInt4081 > local560.aShortArray19.length) {
					local576 = this.anInt4081;
					local560.aShortArray18 = new short[local576];
					local560.aShortArray19 = new short[local576];
					local560.aByteArray8 = new byte[local576];
					local560.aShortArray17 = new short[local576];
				}
				for (local576 = 0; local576 < this.anInt4081; local576++) {
					arg3.aShortArray56[local576] = this.aShortArray56[local576];
					arg3.aShortArray47[local576] = this.aShortArray47[local576];
					arg3.aShortArray49[local576] = this.aShortArray49[local576];
					local560.aShortArray19[local576] = this.aClass50_1.aShortArray19[local576];
					local560.aShortArray17[local576] = this.aClass50_1.aShortArray17[local576];
					local560.aShortArray18[local576] = this.aClass50_1.aShortArray18[local576];
					local560.aByteArray8[local576] = this.aClass50_1.aByteArray8[local576];
				}
			}
			arg3.aByteArray34 = this.aByteArray34;
		} else {
			arg3.aClass50_1 = this.aClass50_1;
			arg3.aShortArray49 = this.aShortArray49;
			arg3.aByteArray34 = this.aByteArray34;
			arg3.aShortArray56 = this.aShortArray56;
			arg3.aShortArray47 = this.aShortArray47;
		}
		if (Static366.method5268(this.anInt4036, arg1)) {
			arg3.aClass5_1 = arg2.aClass5_1;
			arg3.aClass5_1.aBoolean6 = this.aClass5_1.aBoolean6;
			arg3.aClass5_1.anInterface15_2 = this.aClass5_1.anInterface15_2;
			arg3.aClass5_1.aBoolean5 = true;
		} else if (Static489.method6455(this.anInt4036, arg1)) {
			arg3.aClass5_1 = this.aClass5_1;
		} else {
			arg3.aClass5_1 = null;
		}
		if (Static204.method3066(this.anInt4036, arg1)) {
			if (arg2.aFloatArray26 == null || this.anInt4056 > arg2.aFloatArray26.length) {
				local193 = this.anInt4081;
				arg3.aFloatArray26 = arg2.aFloatArray26 = new float[local193];
				arg3.aFloatArray27 = arg2.aFloatArray27 = new float[local193];
			} else {
				arg3.aFloatArray26 = arg2.aFloatArray26;
				arg3.aFloatArray27 = arg2.aFloatArray27;
			}
			for (local193 = 0; local193 < this.anInt4081; local193++) {
				arg3.aFloatArray26[local193] = this.aFloatArray26[local193];
				arg3.aFloatArray27[local193] = this.aFloatArray27[local193];
			}
		} else {
			arg3.aFloatArray26 = this.aFloatArray26;
			arg3.aFloatArray27 = this.aFloatArray27;
		}
		if (Static316.method4540(arg1, this.anInt4036)) {
			arg3.aClass5_4 = arg2.aClass5_4;
			arg3.aClass5_4.aBoolean6 = this.aClass5_4.aBoolean6;
			arg3.aClass5_4.anInterface15_2 = this.aClass5_4.anInterface15_2;
			arg3.aClass5_4.aBoolean5 = true;
		} else if (Static155.method2483(arg1, this.anInt4036)) {
			arg3.aClass5_4 = this.aClass5_4;
		} else {
			arg3.aClass5_4 = null;
		}
		if (Static213.method3147(arg1, this.anInt4036)) {
			if (arg2.aShortArray50 == null || arg2.aShortArray50.length < this.anInt4056) {
				local193 = this.anInt4056;
				arg3.aShortArray50 = arg2.aShortArray50 = new short[local193];
				arg3.aShortArray52 = arg2.aShortArray52 = new short[local193];
				arg3.aShortArray51 = arg2.aShortArray51 = new short[local193];
			} else {
				arg3.aShortArray52 = arg2.aShortArray52;
				arg3.aShortArray50 = arg2.aShortArray50;
				arg3.aShortArray51 = arg2.aShortArray51;
			}
			for (local193 = 0; local193 < this.anInt4056; local193++) {
				arg3.aShortArray50[local193] = this.aShortArray50[local193];
				arg3.aShortArray51[local193] = this.aShortArray51[local193];
				arg3.aShortArray52[local193] = this.aShortArray52[local193];
			}
		} else {
			arg3.aShortArray52 = this.aShortArray52;
			arg3.aShortArray51 = this.aShortArray51;
			arg3.aShortArray50 = this.aShortArray50;
		}
		if (Static97.method1619(arg1, this.anInt4036)) {
			arg3.aClass47_1 = arg2.aClass47_1;
			arg3.aClass47_1.aBoolean92 = true;
			arg3.aClass47_1.anInterface22_2 = this.aClass47_1.anInterface22_2;
			arg3.aClass47_1.aBoolean93 = this.aClass47_1.aBoolean93;
		} else if (Static1.method8751(arg1, this.anInt4036)) {
			arg3.aClass47_1 = this.aClass47_1;
		} else {
			arg3.aClass47_1 = null;
		}
		if (Static306.method4425(arg1, this.anInt4036)) {
			if (arg2.aShortArray53 == null || this.anInt4056 > arg2.aShortArray53.length) {
				local193 = this.anInt4056;
				arg3.aShortArray53 = arg2.aShortArray53 = new short[local193];
			} else {
				arg3.aShortArray53 = arg2.aShortArray53;
			}
			for (local193 = 0; local193 < this.anInt4056; local193++) {
				arg3.aShortArray53[local193] = this.aShortArray53[local193];
			}
		} else {
			arg3.aShortArray53 = this.aShortArray53;
		}
		if (!Static67.method1229(arg1, this.anInt4036)) {
			arg3.aClass183Array1 = this.aClass183Array1;
		} else if (arg2.aClass183Array1 == null || arg2.aClass183Array1.length < this.anInt4014) {
			local193 = this.anInt4014;
			arg3.aClass183Array1 = arg2.aClass183Array1 = new Class183[local193];
			for (local576 = 0; local576 < this.anInt4014; local576++) {
				arg3.aClass183Array1[local576] = this.aClass183Array1[local576].method4118();
			}
		} else {
			arg3.aClass183Array1 = arg2.aClass183Array1;
			for (local193 = 0; local193 < this.anInt4014; local193++) {
				arg3.aClass183Array1[local193].method4117(this.aClass183Array1[local193]);
			}
		}
		arg3.anIntArray223 = this.anIntArray223;
		arg3.aClass373Array2 = this.aClass373Array2;
		arg3.aShortArray46 = this.aShortArray46;
		if (this.aBoolean270) {
			arg3.anInt4088 = this.anInt4088;
			arg3.anInt4031 = this.anInt4031;
			arg3.anInt4053 = this.anInt4053;
			arg3.anInt4027 = this.anInt4027;
			arg3.anInt4019 = this.anInt4019;
			arg3.anInt4020 = this.anInt4020;
			arg3.anInt4029 = this.anInt4029;
			arg3.aBoolean270 = true;
			arg3.anInt4049 = this.anInt4049;
		} else {
			arg3.aBoolean270 = false;
		}
		arg3.aClass314Array1 = this.aClass314Array1;
		arg3.anIntArrayArray27 = this.anIntArrayArray27;
		arg3.aClass305Array2 = this.aClass305Array2;
		arg3.aShortArray57 = this.aShortArray57;
		arg3.aShortArray48 = this.aShortArray48;
		arg3.anIntArray224 = this.anIntArray224;
		arg3.aShortArray55 = this.aShortArray55;
		arg3.anIntArrayArray29 = this.anIntArrayArray29;
		arg3.aShortArray45 = this.aShortArray45;
		arg3.anIntArray222 = this.anIntArray222;
		arg3.anIntArray225 = this.anIntArray225;
		arg3.anIntArrayArray28 = this.anIntArrayArray28;
		return arg3;
	}

	@OriginalMember(owner = "client!hm", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub5_Sub11 ba(@OriginalArg(0) Class3_Sub5_Sub11 arg0) {
		if (this.anInt4081 == 0) {
			return null;
		}
		if (!this.aBoolean270) {
			this.method3477();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass95_Sub1_11.anInt10059 <= 0) {
			local40 = this.anInt4029 - (this.anInt4053 * this.aClass95_Sub1_11.anInt10059 >> 8) >> this.aClass95_Sub1_11.anInt10055;
			local57 = this.anInt4031 - (this.anInt4027 * this.aClass95_Sub1_11.anInt10059 >> 8) >> this.aClass95_Sub1_11.anInt10055;
		} else {
			local40 = this.anInt4029 - (this.anInt4027 * this.aClass95_Sub1_11.anInt10059 >> 8) >> this.aClass95_Sub1_11.anInt10055;
			local57 = this.anInt4031 - (this.aClass95_Sub1_11.anInt10059 * this.anInt4053 >> 8) >> this.aClass95_Sub1_11.anInt10055;
		}
		@Pc(116) int local116;
		@Pc(132) int local132;
		if (this.aClass95_Sub1_11.anInt10061 <= 0) {
			local116 = this.anInt4049 - (this.anInt4053 * this.aClass95_Sub1_11.anInt10061 >> 8) >> this.aClass95_Sub1_11.anInt10055;
			local132 = this.anInt4088 - (this.anInt4027 * this.aClass95_Sub1_11.anInt10061 >> 8) >> this.aClass95_Sub1_11.anInt10055;
		} else {
			local116 = this.anInt4049 - (this.aClass95_Sub1_11.anInt10061 * this.anInt4027 >> 8) >> this.aClass95_Sub1_11.anInt10055;
			local132 = this.anInt4088 - (this.anInt4053 * this.aClass95_Sub1_11.anInt10061 >> 8) >> this.aClass95_Sub1_11.anInt10055;
		}
		@Pc(173) int local173 = local57 + 1 - local40;
		@Pc(179) int local179 = local132 + 1 - local116;
		@Pc(182) Class3_Sub5_Sub11_Sub2 local182 = (Class3_Sub5_Sub11_Sub2) arg0;
		@Pc(198) Class3_Sub5_Sub11_Sub2 local198;
		if (local182 != null && local182.method6796(local173, local179)) {
			local198 = local182;
			local182.method6800();
		} else {
			local198 = new Class3_Sub5_Sub11_Sub2(this.aClass95_Sub1_11, local173, local179);
		}
		local198.method6803(local40, local57, local116, local132);
		this.method3473(local198);
		return local198;
	}

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class35 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean270) {
			this.method3477();
		}
		@Pc(16) int local16 = arg4 + this.anInt4029;
		@Pc(22) int local22 = arg4 + this.anInt4031;
		@Pc(27) int local27 = this.anInt4049 + arg6;
		@Pc(32) int local32 = arg6 + this.anInt4088;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9152 + local22 >> arg2.anInt9154 >= arg2.anInt9149 || local27 < 0 || arg2.anInt9152 + local32 >> arg2.anInt9154 >= arg2.anInt9148)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9149 <= arg3.anInt9152 + local22 >> arg3.anInt9154 || local27 < 0 || arg3.anInt9148 <= arg3.anInt9152 + local32 >> arg3.anInt9154) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9154;
			local22 = arg2.anInt9152 + local22 - 1 >> arg2.anInt9154;
			local27 >>= arg2.anInt9154;
			local32 = arg2.anInt9152 + local32 - 1 >> arg2.anInt9154;
			if (arg5 == arg2.method7461(local27, local16) && arg2.method7461(local27, local22) == arg5 && arg2.method7461(local32, local16) == arg5 && arg5 == arg2.method7461(local32, local22)) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt4077; local195++) {
				this.anIntArray221[local195] = this.anIntArray221[local195] + arg2.method7452(this.anIntArray220[local195] - -arg4, arg6 + this.anIntArray226[local195]) - arg5;
			}
		} else {
			@Pc(246) int local246;
			@Pc(257) int local257;
			if (arg0 == 2) {
				local195 = this.anInt4053;
				if (local195 == 0) {
					return;
				}
				for (local246 = 0; local246 < this.anInt4077; local246++) {
					local257 = (this.anIntArray221[local246] << 16) / local195;
					if (arg1 > local257) {
						this.anIntArray221[local246] += (arg2.method7452(this.anIntArray220[local246] + arg4, arg6 + this.anIntArray226[local246]) - arg5) * (-local257 + arg1) / arg1;
					}
				}
			} else {
				@Pc(350) int local350;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 4;
					local246 = (arg1 >> 8 & 0xFF) * 4;
					local257 = (arg1 >> 16 & 0xFF) << 6;
					local350 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg2.anInt9149 << arg2.anInt9154 <= arg4 + (local195 >> 1) + arg2.anInt9152 || arg6 - (local246 >> 1) < 0 || arg2.anInt9148 << arg2.anInt9154 <= arg6 + (local246 >> 1) + arg2.anInt9152) {
						return;
					}
					this.method8864(arg4, local246, arg6, arg2, local257, arg5, local350, local195);
				} else if (arg0 == 4) {
					local195 = this.anInt4027 - this.anInt4053;
					for (local246 = 0; local246 < this.anInt4077; local246++) {
						this.anIntArray221[local246] = local195 + this.anIntArray221[local246] + arg3.method7452(this.anIntArray220[local246] - -arg4, arg6 + this.anIntArray226[local246]) - arg5;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt4027 - this.anInt4053;
					for (local246 = 0; local246 < this.anInt4077; local246++) {
						local257 = this.anIntArray220[local246] + arg4;
						local350 = this.anIntArray226[local246] + arg6;
						@Pc(356) int local356 = arg2.method7452(local257, local350);
						@Pc(362) int local362 = arg3.method7452(local257, local350);
						@Pc(369) int local369 = local356 - local362 - arg1;
						this.anIntArray221[local246] = ((this.anIntArray221[local246] << 8) / local195 * local369 >> 8) - (arg5 - local356);
					}
				}
			}
		}
		this.method3483();
		this.aBoolean270 = false;
	}

	@OriginalMember(owner = "client!hm", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface2 local9 = this.aClass95_Sub1_11.anInterface2_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4056; local11++) {
			if (arg0 == this.aShortArray53[local11]) {
				this.aShortArray53[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class250 local47 = local9.method8330(arg0 & 0xFFFF);
			local35 = local47.aByte96;
			local37 = local47.aByte94;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class250 local68 = local9.method8330(arg1 & 0xFFFF);
			local57 = local68.aByte94;
			if (local68.aByte95 != 0 || local68.aByte92 != 0) {
				this.aBoolean272 = true;
			}
			local55 = local68.aByte96;
		}
		if (!(local37 != local57 | local55 != local35)) {
			return;
		}
		if (this.aClass314Array1 != null) {
			for (@Pc(102) int local102 = 0; local102 < this.anInt4014; local102++) {
				@Pc(109) Class314 local109 = this.aClass314Array1[local102];
				@Pc(114) Class183 local114 = this.aClass183Array1[local102];
				local114.anInt4815 = local114.anInt4815 & 0xFF000000 | Static537.anIntArray457[this.aShortArray54[local109.anInt8332] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3474();
	}

	@OriginalMember(owner = "client!hm", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort38;
	}

	@OriginalMember(owner = "client!hm", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static447.anInt7217 = 0;
			Static503.anInt7948 = 0;
			local16 = 0;
			Static62.anInt1287 = 0;
			for (local20 = 0; local20 < this.anInt4077; local20++) {
				Static62.anInt1287 += this.anIntArray220[local20];
				Static503.anInt7948 += this.anIntArray221[local20];
				Static447.anInt7217 += this.anIntArray226[local20];
				local16++;
			}
			if (local16 <= 0) {
				Static447.anInt7217 = arg3;
				Static503.anInt7948 = arg2;
				Static62.anInt1287 = arg1;
			} else {
				Static503.anInt7948 = arg2 + Static503.anInt7948 / local16;
				Static62.anInt1287 = arg1 + Static62.anInt1287 / local16;
				Static447.anInt7217 = arg3 + Static447.anInt7217 / local16;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt4077; local16++) {
				this.anIntArray220[local16] += arg1;
				this.anIntArray221[local16] += arg2;
				this.anIntArray226[local16] += arg3;
			}
		} else {
			@Pc(170) int local170;
			@Pc(189) int local189;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt4077; local16++) {
					this.anIntArray220[local16] -= Static62.anInt1287;
					this.anIntArray221[local16] -= Static503.anInt7948;
					this.anIntArray226[local16] -= Static447.anInt7217;
					if (arg3 != 0) {
						local20 = Class94.anIntArray561[arg3];
						local170 = Class94.anIntArray560[arg3];
						local189 = this.anIntArray221[local16] * local20 + this.anIntArray220[local16] * local170 + 16383 >> 14;
						this.anIntArray221[local16] = local170 * this.anIntArray221[local16] + 16383 - this.anIntArray220[local16] * local20 >> 14;
						this.anIntArray220[local16] = local189;
					}
					if (arg1 != 0) {
						local20 = Class94.anIntArray561[arg1];
						local170 = Class94.anIntArray560[arg1];
						local189 = this.anIntArray221[local16] * local170 + 16383 - this.anIntArray226[local16] * local20 >> 14;
						this.anIntArray226[local16] = this.anIntArray226[local16] * local170 + this.anIntArray221[local16] * local20 + 16383 >> 14;
						this.anIntArray221[local16] = local189;
					}
					if (arg2 != 0) {
						local20 = Class94.anIntArray561[arg2];
						local170 = Class94.anIntArray560[arg2];
						local189 = this.anIntArray220[local16] * local170 + local20 * this.anIntArray226[local16] + 16383 >> 14;
						this.anIntArray226[local16] = local170 * this.anIntArray226[local16] + 16383 - this.anIntArray220[local16] * local20 >> 14;
						this.anIntArray220[local16] = local189;
					}
					this.anIntArray220[local16] += Static62.anInt1287;
					this.anIntArray221[local16] += Static503.anInt7948;
					this.anIntArray226[local16] += Static447.anInt7217;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt4077; local16++) {
					this.anIntArray220[local16] -= Static62.anInt1287;
					this.anIntArray221[local16] -= Static503.anInt7948;
					this.anIntArray226[local16] -= Static447.anInt7217;
					this.anIntArray220[local16] = arg1 * this.anIntArray220[local16] / 128;
					this.anIntArray221[local16] = this.anIntArray221[local16] * arg2 / 128;
					this.anIntArray226[local16] = this.anIntArray226[local16] * arg3 / 128;
					this.anIntArray220[local16] += Static62.anInt1287;
					this.anIntArray221[local16] += Static503.anInt7948;
					this.anIntArray226[local16] += Static447.anInt7217;
				}
			} else {
				@Pc(513) Class314 local513;
				@Pc(518) Class183 local518;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt4056; local16++) {
						local20 = (this.aByteArray33[local16] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray33[local16] = (byte) local20;
					}
					if (this.aClass314Array1 != null) {
						for (local20 = 0; local20 < this.anInt4014; local20++) {
							local513 = this.aClass314Array1[local20];
							local518 = this.aClass183Array1[local20];
							local518.anInt4815 = local518.anInt4815 & 0xFFFFFF | 255 - (this.aByteArray33[local513.anInt8332] & 0xFF) << 24;
						}
					}
					this.method3474();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt4056; local16++) {
						local20 = this.aShortArray54[local16] & 0xFFFF;
						local170 = local20 >> 10 & 0x3F;
						local189 = local20 >> 7 & 0x7;
						local189 += arg2 / 4;
						@Pc(587) int local587 = local170 + arg1 & 0x3F;
						@Pc(591) int local591 = local20 & 0x7F;
						local591 += arg3;
						if (local189 < 0) {
							local189 = 0;
						} else if (local189 > 7) {
							local189 = 7;
						}
						if (local591 < 0) {
							local591 = 0;
						} else if (local591 > 127) {
							local591 = 127;
						}
						this.aShortArray54[local16] = (short) (local591 | local587 << 10 | local189 << 7);
					}
					if (this.aClass314Array1 != null) {
						for (local20 = 0; local20 < this.anInt4014; local20++) {
							local513 = this.aClass314Array1[local20];
							local518 = this.aClass183Array1[local20];
							local518.anInt4815 = local518.anInt4815 & 0xFF000000 | Static537.anIntArray457[this.aShortArray54[local513.anInt8332] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method3474();
				} else {
					@Pc(696) Class183 local696;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt4014; local16++) {
							local696 = this.aClass183Array1[local16];
							local696.anInt4816 += arg1;
							local696.anInt4810 += arg2;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt4014; local16++) {
							local696 = this.aClass183Array1[local16];
							local696.anInt4814 = local696.anInt4814 * arg1 >> 7;
							local696.anInt4812 = local696.anInt4812 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt4014; local16++) {
							local696 = this.aClass183Array1[local16];
							local696.anInt4808 = local696.anInt4808 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "()[Lclient!rea;")
	@Override
	public Class305[] method8861() {
		return this.aClass305Array2;
	}

	@OriginalMember(owner = "client!hm", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean270) {
			this.method3477();
		}
		return this.anInt4027;
	}

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class94.anIntArray561[arg0];
		@Pc(13) int local13 = Class94.anIntArray560[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4077; local15++) {
			local33 = local13 * this.anIntArray220[local15] + local9 * this.anIntArray226[local15] >> 14;
			this.anIntArray226[local15] = this.anIntArray226[local15] * local13 - this.anIntArray220[local15] * local9 >> 14;
			this.anIntArray220[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt4081; local33++) {
			@Pc(82) int local82 = local9 * this.aShortArray49[local33] + local13 * this.aShortArray56[local33] >> 14;
			this.aShortArray49[local33] = (short) (local13 * this.aShortArray49[local33] - this.aShortArray56[local33] * local9 >> 14);
			this.aShortArray56[local33] = (short) local82;
		}
		this.method3483();
		this.method3475();
		this.aBoolean270 = false;
	}

	@OriginalMember(owner = "client!hm", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort39;
	}

	@OriginalMember(owner = "client!hm", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean273;
	}

	@OriginalMember(owner = "client!hm", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			local24 = 0;
			Static447.anInt7217 = 0;
			Static62.anInt1287 = 0;
			Static503.anInt7948 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray27.length) {
					local48 = this.anIntArrayArray27[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray46 == null || (this.aShortArray46[local56] & arg6) != 0) {
							Static62.anInt1287 += this.anIntArray220[local56];
							Static503.anInt7948 += this.anIntArray221[local56];
							local24++;
							Static447.anInt7217 += this.anIntArray226[local56];
						}
					}
				}
			}
			if (local24 > 0) {
				Static503.anInt7948 = Static503.anInt7948 / local24 + arg3;
				Static447.anInt7217 = arg4 + Static447.anInt7217 / local24;
				Static672.aBoolean752 = true;
				Static62.anInt1287 = Static62.anInt1287 / local24 + arg2;
			} else {
				Static447.anInt7217 = arg4;
				Static62.anInt1287 = arg2;
				Static503.anInt7948 = arg3;
			}
			return;
		}
		@Pc(253) int[] local253;
		@Pc(255) int local255;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg7[2] * arg4 + arg3 * arg7[1] + arg2 * arg7[0] + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg7[3] * arg2 + arg3 * arg7[4] + 8192 >> 14;
				local38 = arg4 * arg7[8] + arg2 * arg7[6] + arg3 * arg7[7] + 8192 >> 14;
				arg3 = local32;
				arg4 = local38;
				arg2 = local24;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray27.length) {
					local253 = this.anIntArrayArray27[local32];
					for (local255 = 0; local255 < local253.length; local255++) {
						local50 = local253[local255];
						if (this.aShortArray46 == null || (arg6 & this.aShortArray46[local50]) != 0) {
							this.anIntArray220[local50] += arg2;
							this.anIntArray221[local50] += arg3;
							this.anIntArray226[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(391) int local391;
		@Pc(409) int local409;
		@Pc(644) int local644;
		@Pc(653) int local653;
		@Pc(666) int local666;
		@Pc(670) int local670;
		@Pc(688) int local688;
		@Pc(1013) int local1013;
		@Pc(1021) int local1021;
		@Pc(1176) int local1176;
		@Pc(1201) int local1201;
		@Pc(1205) int local1205;
		@Pc(1214) int local1214;
		@Pc(1219) int local1219;
		@Pc(1223) int local1223;
		@Pc(1227) int local1227;
		@Pc(1229) int local1229;
		@Pc(1361) int[] local1361;
		@Pc(1363) int local1363;
		@Pc(1367) int local1367;
		@Pc(1371) int local1371;
		@Pc(1373) int local1373;
		@Pc(1505) int local1505;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray27.length) {
						local253 = this.anIntArrayArray27[local32];
						for (local255 = 0; local255 < local253.length; local255++) {
							local50 = local253[local255];
							if (this.aShortArray46 == null || (arg6 & this.aShortArray46[local50]) != 0) {
								this.anIntArray220[local50] -= Static62.anInt1287;
								this.anIntArray221[local50] -= Static503.anInt7948;
								this.anIntArray226[local50] -= Static447.anInt7217;
								if (arg4 != 0) {
									local56 = Class94.anIntArray561[arg4];
									local391 = Class94.anIntArray560[arg4];
									local409 = local391 * this.anIntArray220[local50] + local56 * this.anIntArray221[local50] + 16383 >> 14;
									this.anIntArray221[local50] = this.anIntArray221[local50] * local391 + 16383 - this.anIntArray220[local50] * local56 >> 14;
									this.anIntArray220[local50] = local409;
								}
								if (arg2 != 0) {
									local56 = Class94.anIntArray561[arg2];
									local391 = Class94.anIntArray560[arg2];
									local409 = this.anIntArray221[local50] * local391 + 16383 - this.anIntArray226[local50] * local56 >> 14;
									this.anIntArray226[local50] = this.anIntArray221[local50] * local56 + local391 * this.anIntArray226[local50] + 16383 >> 14;
									this.anIntArray221[local50] = local409;
								}
								if (arg3 != 0) {
									local56 = Class94.anIntArray561[arg3];
									local391 = Class94.anIntArray560[arg3];
									local409 = local391 * this.anIntArray220[local50] + this.anIntArray226[local50] * local56 + 16383 >> 14;
									this.anIntArray226[local50] = this.anIntArray226[local50] * local391 + 16383 - this.anIntArray220[local50] * local56 >> 14;
									this.anIntArray220[local50] = local409;
								}
								this.anIntArray220[local50] += Static62.anInt1287;
								this.anIntArray221[local50] += Static503.anInt7948;
								this.anIntArray226[local50] += Static447.anInt7217;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray27.length > local38) {
							local48 = this.anIntArrayArray27[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray46 == null || (arg6 & this.aShortArray46[local56]) != 0) {
									local391 = this.anIntArray222[local56];
									local409 = this.anIntArray222[local56 + 1];
									for (local644 = local391; local644 < local409; local644++) {
										local653 = this.aShortArray55[local644] - 1;
										if (local653 == -1) {
											break;
										}
										if (arg4 != 0) {
											local666 = Class94.anIntArray561[arg4];
											local670 = Class94.anIntArray560[arg4];
											local688 = local670 * this.aShortArray56[local653] + this.aShortArray47[local653] * local666 + 16383 >> 14;
											this.aShortArray47[local653] = (short) (this.aShortArray47[local653] * local670 + 16383 - this.aShortArray56[local653] * local666 >> 14);
											this.aShortArray56[local653] = (short) local688;
										}
										if (arg2 != 0) {
											local666 = Class94.anIntArray561[arg2];
											local670 = Class94.anIntArray560[arg2];
											local688 = this.aShortArray47[local653] * local670 + 16383 - local666 * this.aShortArray49[local653] >> 14;
											this.aShortArray49[local653] = (short) (local670 * this.aShortArray49[local653] + this.aShortArray47[local653] * local666 + 16383 >> 14);
											this.aShortArray47[local653] = (short) local688;
										}
										if (arg3 != 0) {
											local666 = Class94.anIntArray561[arg3];
											local670 = Class94.anIntArray560[arg3];
											local688 = local666 * this.aShortArray49[local653] + local670 * this.aShortArray56[local653] + 16383 >> 14;
											this.aShortArray49[local653] = (short) (this.aShortArray49[local653] * local670 + 16383 - local666 * this.aShortArray56[local653] >> 14);
											this.aShortArray56[local653] = (short) local688;
										}
									}
								}
							}
						}
					}
					this.method3475();
					return;
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local255 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static672.aBoolean752) {
					local391 = Static503.anInt7948 * arg7[3] + arg7[0] * Static62.anInt1287 + arg7[6] * Static447.anInt7217 + 8192 >> 14;
					local409 = arg7[4] * Static503.anInt7948 + arg7[1] * Static62.anInt1287 + arg7[7] * Static447.anInt7217 + 8192 >> 14;
					local409 += local50;
					local391 += local255;
					local644 = arg7[2] * Static62.anInt1287 + arg7[5] * Static503.anInt7948 + Static447.anInt7217 * arg7[8] + 8192 >> 14;
					local644 += local56;
					Static503.anInt7948 = local409;
					Static62.anInt1287 = local391;
					Static447.anInt7217 = local644;
					Static672.aBoolean752 = false;
				}
				@Pc(981) int[] local981 = new int[9];
				local409 = Class94.anIntArray560[arg2];
				local644 = Class94.anIntArray561[arg2];
				local653 = Class94.anIntArray560[arg3];
				local666 = Class94.anIntArray561[arg3];
				local670 = Class94.anIntArray560[arg4];
				local688 = Class94.anIntArray561[arg4];
				local1013 = local670 * local644 + 8192 >> 14;
				local1021 = local644 * local688 + 8192 >> 14;
				local981[8] = local409 * local653 + 8192 >> 14;
				local981[4] = local409 * local670 + 8192 >> 14;
				local981[6] = local1021 * local653 + -local666 * local670 + 8192 >> 14;
				local981[7] = local1013 * local653 + local666 * local688 + 8192 >> 14;
				local981[5] = -local644;
				local981[2] = local666 * local409 + 8192 >> 14;
				local981[3] = local409 * local688 + 8192 >> 14;
				local981[1] = local666 * local1013 + -local653 * local688 + 8192 >> 14;
				local981[0] = local653 * local670 + local1021 * local666 + 8192 >> 14;
				@Pc(1151) int local1151 = local981[0] * -Static62.anInt1287 + -Static503.anInt7948 * local981[1] + -Static447.anInt7217 * local981[2] + 8192 >> 14;
				local1176 = -Static503.anInt7948 * local981[4] + -Static62.anInt1287 * local981[3] + local981[5] * -Static447.anInt7217 + 8192 >> 14;
				local1201 = local981[7] * -Static503.anInt7948 + local981[6] * -Static62.anInt1287 + local981[8] * -Static447.anInt7217 + 8192 >> 14;
				local1205 = local1151 + Static62.anInt1287;
				@Pc(1210) int local1210 = local1176 + Static503.anInt7948;
				local1214 = Static447.anInt7217 + local1201;
				@Pc(1217) int[] local1217 = new int[9];
				for (local1219 = 0; local1219 < 3; local1219++) {
					for (local1223 = 0; local1223 < 3; local1223++) {
						local1227 = 0;
						for (local1229 = 0; local1229 < 3; local1229++) {
							local1227 += local981[local1219 * 3 + local1229] * arg7[local1223 * 3 + local1229];
						}
						local1217[local1219 * 3 + local1223] = local1227 + 8192 >> 14;
					}
				}
				local1223 = local56 * local981[2] + local255 * local981[0] + local50 * local981[1] + 8192 >> 14;
				local1227 = local50 * local981[4] + local255 * local981[3] + local981[5] * local56 + 8192 >> 14;
				local1229 = local981[8] * local56 + local981[6] * local255 + local50 * local981[7] + 8192 >> 14;
				local1223 += local1205;
				local1227 += local1210;
				local1229 += local1214;
				local1361 = new int[9];
				for (local1363 = 0; local1363 < 3; local1363++) {
					for (local1367 = 0; local1367 < 3; local1367++) {
						local1371 = 0;
						for (local1373 = 0; local1373 < 3; local1373++) {
							local1371 += local1217[local1367 + local1373 * 3] * arg7[local1363 * 3 + local1373];
						}
						local1361[local1363 * 3 + local1367] = local1371 + 8192 >> 14;
					}
				}
				local1367 = local1227 * arg7[1] + local1223 * arg7[0] + local1229 * arg7[2] + 8192 >> 14;
				local1371 = local1229 * arg7[5] + local1227 * arg7[4] + arg7[3] * local1223 + 8192 >> 14;
				local1367 += local24;
				local1371 += local32;
				local1373 = arg7[6] * local1223 + arg7[7] * local1227 + arg7[8] * local1229 + 8192 >> 14;
				local1373 += local38;
				for (local1505 = 0; local1505 < local8; local1505++) {
					@Pc(1511) int local1511 = arg1[local1505];
					if (this.anIntArrayArray27.length > local1511) {
						@Pc(1521) int[] local1521 = this.anIntArrayArray27[local1511];
						for (@Pc(1523) int local1523 = 0; local1523 < local1521.length; local1523++) {
							@Pc(1529) int local1529 = local1521[local1523];
							if (this.aShortArray46 == null || (this.aShortArray46[local1529] & arg6) != 0) {
								@Pc(1571) int local1571 = local1361[0] * this.anIntArray220[local1529] + this.anIntArray221[local1529] * local1361[1] + this.anIntArray226[local1529] * local1361[2] + 8192 >> 14;
								@Pc(1602) int local1602 = local1361[5] * this.anIntArray226[local1529] + this.anIntArray220[local1529] * local1361[3] + local1361[4] * this.anIntArray221[local1529] + 8192 >> 14;
								@Pc(1635) int local1635 = this.anIntArray220[local1529] * local1361[6] + this.anIntArray221[local1529] * local1361[7] + this.anIntArray226[local1529] * local1361[8] + 8192 >> 14;
								@Pc(1639) int local1639 = local1571 + local1367;
								@Pc(1643) int local1643 = local1602 + local1371;
								this.anIntArray220[local1529] = local1639;
								@Pc(1652) int local1652 = local1635 + local1373;
								this.anIntArray221[local1529] = local1643;
								this.anIntArray226[local1529] = local1652;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2594) Class183 local2594;
			@Pc(2475) boolean local2475;
			@Pc(2589) Class314 local2589;
			if (arg0 == 5) {
				if (this.anIntArrayArray28 != null) {
					local2475 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray28.length > local38) {
							local48 = this.anIntArrayArray28[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray57 == null || (this.aShortArray57[local56] & arg6) != 0) {
									local391 = (this.aByteArray33[local56] & 0xFF) + arg2 * 8;
									if (local391 < 0) {
										local391 = 0;
									} else if (local391 > 255) {
										local391 = 255;
									}
									this.aByteArray33[local56] = (byte) local391;
								}
							}
							local2475 |= local48.length > 0;
						}
					}
					if (local2475) {
						if (this.aClass314Array1 != null) {
							for (local38 = 0; local38 < this.anInt4014; local38++) {
								local2589 = this.aClass314Array1[local38];
								local2594 = this.aClass183Array1[local38];
								local2594.anInt4815 = local2594.anInt4815 & 0xFFFFFF | 255 - (this.aByteArray33[local2589.anInt8332] & 0xFF) << 24;
							}
						}
						this.method3474();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray28 != null) {
					local2475 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray28.length > local38) {
							local48 = this.anIntArrayArray28[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray57 == null || (arg6 & this.aShortArray57[local56]) != 0) {
									local391 = this.aShortArray54[local56] & 0xFFFF;
									local409 = local391 >> 10 & 0x3F;
									local644 = local391 >> 7 & 0x7;
									local644 += arg3 / 4;
									@Pc(2705) int local2705 = arg2 + local409 & 0x3F;
									local653 = local391 & 0x7F;
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
									this.aShortArray54[local56] = (short) (local653 | local644 << 7 | local2705 << 10);
								}
							}
							local2475 |= local48.length > 0;
						}
					}
					if (local2475) {
						if (this.aClass314Array1 != null) {
							for (local38 = 0; local38 < this.anInt4014; local38++) {
								local2589 = this.aClass314Array1[local38];
								local2594 = this.aClass183Array1[local38];
								local2594.anInt4815 = Static537.anIntArray457[this.aShortArray54[local2589.anInt8332] & 0xFFFF] & 0xFFFFFF | local2594.anInt4815 & 0xFF000000;
							}
						}
						this.method3474();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray29 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray29.length > local32) {
							local253 = this.anIntArrayArray29[local32];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2594 = this.aClass183Array1[local253[local255]];
								local2594.anInt4810 += arg3;
								local2594.anInt4816 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray29 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray29.length) {
							local253 = this.anIntArrayArray29[local32];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2594 = this.aClass183Array1[local253[local255]];
								local2594.anInt4812 = local2594.anInt4812 * arg3 >> 7;
								local2594.anInt4814 = local2594.anInt4814 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray29 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray29.length > local32) {
						local253 = this.anIntArrayArray29[local32];
						for (local255 = 0; local255 < local253.length; local255++) {
							local2594 = this.aClass183Array1[local253[local255]];
							local2594.anInt4808 = local2594.anInt4808 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray27.length) {
					local253 = this.anIntArrayArray27[local32];
					for (local255 = 0; local255 < local253.length; local255++) {
						local50 = local253[local255];
						if (this.aShortArray46 == null || (this.aShortArray46[local50] & arg6) != 0) {
							this.anIntArray220[local50] -= Static62.anInt1287;
							this.anIntArray221[local50] -= Static503.anInt7948;
							this.anIntArray226[local50] -= Static447.anInt7217;
							this.anIntArray220[local50] = arg2 * this.anIntArray220[local50] >> 7;
							this.anIntArray221[local50] = arg3 * this.anIntArray221[local50] >> 7;
							this.anIntArray226[local50] = this.anIntArray226[local50] * arg4 >> 7;
							this.anIntArray220[local50] += Static62.anInt1287;
							this.anIntArray221[local50] += Static503.anInt7948;
							this.anIntArray226[local50] += Static447.anInt7217;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local255 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static672.aBoolean752) {
				local391 = Static447.anInt7217 * arg7[6] + arg7[0] * Static62.anInt1287 + Static503.anInt7948 * arg7[3] + 8192 >> 14;
				local409 = arg7[4] * Static503.anInt7948 + arg7[1] * Static62.anInt1287 + Static447.anInt7217 * arg7[7] + 8192 >> 14;
				local644 = arg7[2] * Static62.anInt1287 + arg7[5] * Static503.anInt7948 + arg7[8] * Static447.anInt7217 + 8192 >> 14;
				local391 += local255;
				local409 += local50;
				Static62.anInt1287 = local391;
				local644 += local56;
				Static503.anInt7948 = local409;
				Static672.aBoolean752 = false;
				Static447.anInt7217 = local644;
			}
			local391 = arg2 << 15 >> 7;
			local409 = arg3 << 15 >> 7;
			local644 = arg4 << 15 >> 7;
			local653 = local391 * -Static62.anInt1287 + 8192 >> 14;
			local666 = -Static503.anInt7948 * local409 + 8192 >> 14;
			local670 = -Static447.anInt7217 * local644 + 8192 >> 14;
			local688 = Static62.anInt1287 + local653;
			local1013 = local666 + Static503.anInt7948;
			local1021 = local670 + Static447.anInt7217;
			@Pc(1867) int[] local1867 = new int[] { arg7[0] * local391 + 8192 >> 14, local391 * arg7[3] + 8192 >> 14, local391 * arg7[6] + 8192 >> 14, local409 * arg7[1] + 8192 >> 14, arg7[4] * local409 + 8192 >> 14, local409 * arg7[7] + 8192 >> 14, arg7[2] * local644 + 8192 >> 14, arg7[5] * local644 + 8192 >> 14, local644 * arg7[8] + 8192 >> 14 };
			local1176 = local255 * local391 + 8192 >> 14;
			local1201 = local409 * local50 + 8192 >> 14;
			@Pc(1995) int local1995 = local1176 + local688;
			local1205 = local56 * local644 + 8192 >> 14;
			@Pc(2007) int local2007 = local1201 + local1013;
			@Pc(2011) int local2011 = local1205 + local1021;
			@Pc(2014) int[] local2014 = new int[9];
			@Pc(2020) int local2020;
			for (local1214 = 0; local1214 < 3; local1214++) {
				for (local2020 = 0; local2020 < 3; local2020++) {
					local1219 = 0;
					for (local1223 = 0; local1223 < 3; local1223++) {
						local1219 += local1867[local2020 + local1223 * 3] * arg7[local1214 * 3 + local1223];
					}
					local2014[local1214 * 3 + local2020] = local1219 + 8192 >> 14;
				}
			}
			local2020 = arg7[0] * local1995 + arg7[1] * local2007 + local2011 * arg7[2] + 8192 >> 14;
			local1219 = local2011 * arg7[5] + local2007 * arg7[4] + arg7[3] * local1995 + 8192 >> 14;
			local2020 += local24;
			local1223 = local2011 * arg7[8] + arg7[6] * local1995 + local2007 * arg7[7] + 8192 >> 14;
			local1219 += local32;
			local1223 += local38;
			for (local1227 = 0; local1227 < local8; local1227++) {
				local1229 = arg1[local1227];
				if (this.anIntArrayArray27.length > local1229) {
					local1361 = this.anIntArrayArray27[local1229];
					for (local1363 = 0; local1363 < local1361.length; local1363++) {
						local1367 = local1361[local1363];
						if (this.aShortArray46 == null || (arg6 & this.aShortArray46[local1367]) != 0) {
							local1371 = this.anIntArray226[local1367] * local2014[2] + local2014[1] * this.anIntArray221[local1367] + local2014[0] * this.anIntArray220[local1367] + 8192 >> 14;
							local1373 = this.anIntArray220[local1367] * local2014[3] + local2014[4] * this.anIntArray221[local1367] + this.anIntArray226[local1367] * local2014[5] + 8192 >> 14;
							local1505 = local2014[8] * this.anIntArray226[local1367] + this.anIntArray220[local1367] * local2014[6] + local2014[7] * this.anIntArray221[local1367] + 8192 >> 14;
							@Pc(2291) int local2291 = local1373 + local1219;
							@Pc(2295) int local2295 = local1371 + local2020;
							this.anIntArray220[local1367] = local2295;
							@Pc(2304) int local2304 = local1505 + local1223;
							this.anIntArray221[local1367] = local2291;
							this.anIntArray226[local1367] = local2304;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!ri;)V")
	private void method3473(@OriginalArg(1) Class3_Sub5_Sub11_Sub2 arg0) {
		if (Static46.anIntArray55.length < this.anInt4081) {
			Static298.anIntArray285 = new int[this.anInt4081];
			Static46.anIntArray55 = new int[this.anInt4081];
		}
		@Pc(51) int local51;
		@Pc(90) int local90;
		@Pc(99) int local99;
		for (@Pc(24) int local24 = 0; local24 < this.anInt4077; local24++) {
			local51 = (this.anIntArray220[local24] - (this.aClass95_Sub1_11.anInt10059 * this.anIntArray221[local24] >> 8) >> this.aClass95_Sub1_11.anInt10055) - arg0.anInt8274;
			@Pc(76) int local76 = (this.anIntArray226[local24] - (this.anIntArray221[local24] * this.aClass95_Sub1_11.anInt10061 >> 8) >> this.aClass95_Sub1_11.anInt10055) - arg0.anInt8266;
			@Pc(81) int local81 = this.anIntArray222[local24];
			@Pc(88) int local88 = this.anIntArray222[local24 + 1];
			for (local90 = local81; local90 < local88; local90++) {
				local99 = this.aShortArray55[local90] - 1;
				if (local99 == -1) {
					break;
				}
				Static46.anIntArray55[local99] = local51;
				Static298.anIntArray285[local99] = local76;
			}
		}
		for (local51 = 0; local51 < this.anInt4069; local51++) {
			if (this.aByteArray33 == null || this.aByteArray33[local51] <= 128) {
				@Pc(141) short local141 = this.aShortArray50[local51];
				@Pc(146) short local146 = this.aShortArray51[local51];
				@Pc(151) short local151 = this.aShortArray52[local51];
				local90 = Static46.anIntArray55[local141];
				local99 = Static46.anIntArray55[local146];
				@Pc(163) int local163 = Static46.anIntArray55[local151];
				@Pc(167) int local167 = Static298.anIntArray285[local141];
				@Pc(171) int local171 = Static298.anIntArray285[local146];
				@Pc(175) int local175 = Static298.anIntArray285[local151];
				if ((local90 - local99) * (local171 - local175) - (local163 - local99) * (local171 - local167) > 0) {
					arg0.method6798(local175, local163, local90, local99, local171, local167);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!al;Lclient!ju;II)V")
	@Override
	public void method8869(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class34_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4081 == 0) {
			return;
		}
		@Pc(13) Class17_Sub2 local13 = this.aClass95_Sub1_11.aClass17_Sub2_16;
		if (!this.aBoolean270) {
			this.method3477();
		}
		@Pc(22) Class17_Sub2 local22 = (Class17_Sub2) arg0;
		Static490.aFloat184 = local13.aFloat134 * local22.aFloat129 + local22.aFloat130 * local13.aFloat129 + local22.aFloat128 * local13.aFloat132;
		Static229.aFloat74 = local13.aFloat134 * local22.aFloat131 + local13.aFloat129 * local22.aFloat127 + local22.aFloat136 * local13.aFloat132 + local13.aFloat131;
		@Pc(69) float local69 = (float) this.anInt4053 * Static490.aFloat184 + Static229.aFloat74;
		@Pc(77) float local77 = Static229.aFloat74 + Static490.aFloat184 * (float) this.anInt4027;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = (float) this.anInt4019 + local69;
			local93 = (float) -this.anInt4019 + local77;
		} else {
			local87 = (float) this.anInt4019 + local77;
			local93 = local69 - (float) this.anInt4019;
		}
		if (local93 >= this.aClass95_Sub1_11.aFloat188 || local87 <= (float) this.aClass95_Sub1_11.anInt10050) {
			return;
		}
		Static543.aFloat157 = local13.aFloat126 * local22.aFloat129 + local13.aFloat128 * local22.aFloat130 + local22.aFloat128 * local13.aFloat137;
		Static614.aFloat204 = local22.aFloat136 * local13.aFloat137 + local13.aFloat128 * local22.aFloat127 + local22.aFloat131 * local13.aFloat126 + local13.aFloat136;
		@Pc(170) float local170 = Static614.aFloat204 + Static543.aFloat157 * (float) this.anInt4053;
		@Pc(178) float local178 = Static543.aFloat157 * (float) this.anInt4027 + Static614.aFloat204;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local178 < local170) {
			local193 = (float) this.aClass95_Sub1_11.anInt10052 * (local178 - (float) this.anInt4019);
			local204 = (local170 + (float) this.anInt4019) * (float) this.aClass95_Sub1_11.anInt10052;
		} else {
			local204 = (float) this.aClass95_Sub1_11.anInt10052 * ((float) this.anInt4019 + local178);
			local193 = ((float) -this.anInt4019 + local170) * (float) this.aClass95_Sub1_11.anInt10052;
		}
		if (local193 / (float) arg2 >= this.aClass95_Sub1_11.aFloat196 || local204 / (float) arg2 <= this.aClass95_Sub1_11.aFloat194) {
			return;
		}
		Static19.aFloat5 = local13.aFloat127 + local22.aFloat136 * local13.aFloat133 + local22.aFloat127 * local13.aFloat130 + local13.aFloat135 * local22.aFloat131;
		Static498.aFloat214 = local13.aFloat135 * local22.aFloat129 + local22.aFloat130 * local13.aFloat130 + local13.aFloat133 * local22.aFloat128;
		@Pc(296) float local296 = (float) this.anInt4053 * Static498.aFloat214 + Static19.aFloat5;
		@Pc(304) float local304 = (float) this.anInt4027 * Static498.aFloat214 + Static19.aFloat5;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local304 < local296) {
			local331 = (float) this.aClass95_Sub1_11.anInt10044 * (local296 + (float) this.anInt4019);
			local320 = (float) this.aClass95_Sub1_11.anInt10044 * ((float) -this.anInt4019 + local304);
		} else {
			local320 = ((float) -this.anInt4019 + local296) * (float) this.aClass95_Sub1_11.anInt10044;
			local331 = (float) this.aClass95_Sub1_11.anInt10044 * (local304 + (float) this.anInt4019);
		}
		if (this.aClass95_Sub1_11.aFloat198 <= local320 / (float) arg2 || this.aClass95_Sub1_11.aFloat201 >= local331 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass314Array1 != null) {
			Static209.aFloat65 = local13.aFloat129 * local22.aFloat135 + local13.aFloat132 * local22.aFloat126 + local22.aFloat134 * local13.aFloat134;
			Static211.aFloat67 = local22.aFloat135 * local13.aFloat128 + local13.aFloat137 * local22.aFloat126 + local22.aFloat134 * local13.aFloat126;
			Static66.aFloat14 = local13.aFloat130 * local22.aFloat135 + local22.aFloat126 * local13.aFloat133 + local13.aFloat135 * local22.aFloat134;
			Static544.aFloat158 = local13.aFloat132 * local22.aFloat137 + local22.aFloat133 * local13.aFloat129 + local13.aFloat134 * local22.aFloat132;
			Static364.aFloat119 = local22.aFloat132 * local13.aFloat126 + local13.aFloat137 * local22.aFloat137 + local13.aFloat128 * local22.aFloat133;
			Static287.aFloat78 = local22.aFloat133 * local13.aFloat130 + local22.aFloat137 * local13.aFloat133 + local13.aFloat135 * local22.aFloat132;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.anInt4029 + this.anInt4031 >> 1;
			@Pc(507) int local507 = this.anInt4088 + this.anInt4049 >> 1;
			@Pc(526) int local526 = (int) (Static211.aFloat67 * (float) local507 + (float) this.anInt4053 * Static543.aFloat157 + Static614.aFloat204 + (float) local499 * Static364.aFloat119);
			@Pc(545) int local545 = (int) ((float) local499 * Static287.aFloat78 + Static19.aFloat5 + (float) this.anInt4053 * Static498.aFloat214 + (float) local507 * Static66.aFloat14);
			@Pc(564) int local564 = (int) ((float) this.anInt4053 * Static490.aFloat184 + Static544.aFloat158 * (float) local499 + Static229.aFloat74 + (float) local507 * Static209.aFloat65);
			@Pc(583) int local583 = (int) ((float) local507 * Static211.aFloat67 + (float) this.anInt4027 * Static543.aFloat157 + Static614.aFloat204 + Static364.aFloat119 * (float) local499);
			@Pc(602) int local602 = (int) (Static19.aFloat5 + (float) local499 * Static287.aFloat78 + Static498.aFloat214 * (float) this.anInt4027 + (float) local507 * Static66.aFloat14);
			@Pc(621) int local621 = (int) (Static229.aFloat74 + Static544.aFloat158 * (float) local499 + (float) this.anInt4027 * Static490.aFloat184 + (float) local507 * Static209.aFloat65);
			arg1.anInt4991 = this.aClass95_Sub1_11.anInt10044 * local602 / arg2 + this.aClass95_Sub1_11.anInt10063;
			arg1.anInt4989 = this.aClass95_Sub1_11.anInt10025 + local526 * this.aClass95_Sub1_11.anInt10052 / arg2;
			arg1.anInt4988 = this.aClass95_Sub1_11.anInt10044 * local545 / arg2 + this.aClass95_Sub1_11.anInt10063;
			arg1.anInt4990 = local583 * this.aClass95_Sub1_11.anInt10052 / arg2 + this.aClass95_Sub1_11.anInt10025;
			if (local564 >= this.aClass95_Sub1_11.anInt10050 || local621 >= this.aClass95_Sub1_11.anInt10050) {
				arg1.aBoolean332 = true;
				arg1.anInt4992 = (this.anInt4019 + local526) * this.aClass95_Sub1_11.anInt10052 / arg2 + this.aClass95_Sub1_11.anInt10025 - arg1.anInt4989;
			}
		}
		this.aClass95_Sub1_11.method8083((float) arg2);
		this.aClass95_Sub1_11.method8181();
		this.aClass95_Sub1_11.method8104(local22);
		this.method3485();
		this.method3488();
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V")
	private void method3474() {
		if (this.aClass5_3 != null) {
			this.aClass5_3.aBoolean6 = false;
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V")
	private void method3475() {
		if ((this.anInt4036 & 0x37) == 0) {
			if (this.aClass5_3 != null) {
				this.aClass5_3.aBoolean6 = false;
			}
		} else if (this.aClass5_1 != null) {
			this.aClass5_1.aBoolean6 = false;
		}
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)Z")
	private boolean method3476() {
		if (this.aClass47_1.aBoolean93) {
			return true;
		}
		if (this.aClass47_1.anInterface22_1 == null) {
			this.aClass47_1.anInterface22_1 = this.aClass95_Sub1_11.method8115(this.aBoolean271);
		}
		@Pc(28) Interface22 local28 = this.aClass47_1.anInterface22_1;
		local28.method7408(this.anInt4069 * 6);
		@Pc(45) Buffer local45 = local28.method7405();
		if (local45 != null) {
			@Pc(53) Stream local53 = this.aClass95_Sub1_11.method8157(local45);
			@Pc(57) int local57;
			if (Stream.b()) {
				for (local57 = 0; local57 < this.anInt4069; local57++) {
					local53.a(this.aShortArray50[local57]);
					local53.a(this.aShortArray51[local57]);
					local53.a(this.aShortArray52[local57]);
				}
			} else {
				for (local57 = 0; local57 < this.anInt4069; local57++) {
					local53.e(this.aShortArray50[local57]);
					local53.e(this.aShortArray51[local57]);
					local53.e(this.aShortArray52[local57]);
				}
			}
			local53.a();
			if (local28.method7407()) {
				this.aBoolean274 = true;
				this.aClass47_1.aBoolean93 = true;
				this.aClass47_1.anInterface22_2 = local28;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "()V")
	@Override
	protected void method8849() {
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V")
	private void method3477() {
		@Pc(7) int local7 = 32767;
		@Pc(15) int local15 = 32767;
		@Pc(17) int local17 = 32767;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt4077; local29++) {
			@Pc(36) int local36 = this.anIntArray220[local29];
			@Pc(41) int local41 = this.anIntArray221[local29];
			if (local7 > local36) {
				local7 = local36;
			}
			if (local19 < local36) {
				local19 = local36;
			}
			if (local41 < local15) {
				local15 = local41;
			}
			@Pc(65) int local65 = this.anIntArray226[local29];
			if (local21 < local41) {
				local21 = local41;
			}
			if (local65 > local23) {
				local23 = local65;
			}
			if (local65 < local17) {
				local17 = local65;
			}
			@Pc(93) int local93 = local36 * local36 + local65 * local65;
			if (local25 < local93) {
				local25 = local93;
			}
			local93 = local41 * local41 + local36 * local36 + local65 * local65;
			if (local27 < local93) {
				local27 = local93;
			}
		}
		this.anInt4088 = local23;
		this.anInt4031 = local19;
		this.anInt4053 = local15;
		this.anInt4029 = local7;
		this.anInt4049 = local17;
		this.anInt4027 = local21;
		this.anInt4019 = (int) (Math.sqrt((double) local25) + 0.99D);
		this.anInt4020 = (int) (Math.sqrt((double) local27) + 0.99D);
		this.aBoolean270 = true;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIZIIBLclient!al;)Z")
	private boolean method3478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class17 arg5) {
		@Pc(8) Class17_Sub2 local8 = (Class17_Sub2) arg5;
		@Pc(12) Class17_Sub2 local12 = this.aClass95_Sub1_11.aClass17_Sub2_16;
		@Pc(33) float local33 = local12.aFloat126 * local8.aFloat131 + local12.aFloat137 * local8.aFloat136 + local12.aFloat128 * local8.aFloat127 + local12.aFloat136;
		@Pc(54) float local54 = local12.aFloat127 + local12.aFloat135 * local8.aFloat131 + local8.aFloat127 * local12.aFloat130 + local12.aFloat133 * local8.aFloat136;
		Static544.aFloat158 = local8.aFloat137 * local12.aFloat132 + local12.aFloat129 * local8.aFloat133 + local8.aFloat132 * local12.aFloat134;
		Static490.aFloat184 = local12.aFloat134 * local8.aFloat129 + local8.aFloat128 * local12.aFloat132 + local8.aFloat130 * local12.aFloat129;
		Static211.aFloat67 = local8.aFloat135 * local12.aFloat128 + local12.aFloat137 * local8.aFloat126 + local12.aFloat126 * local8.aFloat134;
		Static364.aFloat119 = local8.aFloat132 * local12.aFloat126 + local12.aFloat137 * local8.aFloat137 + local8.aFloat133 * local12.aFloat128;
		@Pc(147) float local147 = local12.aFloat134 * local8.aFloat131 + local8.aFloat127 * local12.aFloat129 + local8.aFloat136 * local12.aFloat132 + local12.aFloat131;
		Static209.aFloat65 = local8.aFloat134 * local12.aFloat134 + local12.aFloat129 * local8.aFloat135 + local8.aFloat126 * local12.aFloat132;
		Static543.aFloat157 = local8.aFloat129 * local12.aFloat126 + local8.aFloat128 * local12.aFloat137 + local12.aFloat128 * local8.aFloat130;
		Static287.aFloat78 = local12.aFloat133 * local8.aFloat137 + local12.aFloat130 * local8.aFloat133 + local12.aFloat135 * local8.aFloat132;
		Static498.aFloat214 = local8.aFloat129 * local12.aFloat135 + local12.aFloat130 * local8.aFloat130 + local8.aFloat128 * local12.aFloat133;
		Static66.aFloat14 = local8.aFloat134 * local12.aFloat135 + local12.aFloat133 * local8.aFloat126 + local12.aFloat130 * local8.aFloat135;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass95_Sub1_11.anInt10052;
		@Pc(261) int local261 = this.aClass95_Sub1_11.anInt10044;
		if (!this.aBoolean270) {
			this.method3477();
		}
		@Pc(275) int local275 = this.anInt4031 - this.anInt4029 >> 1;
		@Pc(284) int local284 = this.anInt4027 - this.anInt4053 >> 1;
		@Pc(293) int local293 = this.anInt4088 - this.anInt4049 >> 1;
		@Pc(298) int local298 = local275 + this.anInt4029;
		@Pc(303) int local303 = local284 + this.anInt4053;
		@Pc(308) int local308 = local293 + this.anInt4049;
		@Pc(314) int local314 = local298 - (local275 << arg1);
		@Pc(320) int local320 = local303 - (local284 << arg1);
		@Pc(327) int local327 = local308 - (local293 << arg1);
		@Pc(333) int local333 = local298 + (local275 << arg1);
		@Pc(339) int local339 = (local284 << arg1) + local303;
		@Pc(346) int local346 = local308 + (local293 << arg1);
		Static619.anIntArray544[0] = local314;
		Static240.anIntArray253[0] = local320;
		Static405.anIntArray348[0] = local327;
		Static619.anIntArray544[1] = local333;
		Static240.anIntArray253[1] = local320;
		Static619.anIntArray544[2] = local314;
		Static405.anIntArray348[1] = local327;
		Static240.anIntArray253[2] = local339;
		Static405.anIntArray348[2] = local327;
		Static619.anIntArray544[3] = local333;
		Static240.anIntArray253[3] = local339;
		Static405.anIntArray348[3] = local327;
		Static619.anIntArray544[4] = local314;
		Static240.anIntArray253[4] = local320;
		Static619.anIntArray544[5] = local333;
		Static405.anIntArray348[4] = local346;
		Static240.anIntArray253[5] = local320;
		Static619.anIntArray544[6] = local314;
		Static405.anIntArray348[5] = local346;
		Static240.anIntArray253[6] = local339;
		Static405.anIntArray348[6] = local346;
		Static619.anIntArray544[7] = local333;
		Static240.anIntArray253[7] = local339;
		Static405.anIntArray348[7] = local346;
		@Pc(503) float local503;
		@Pc(475) float local475;
		@Pc(489) float local489;
		@Pc(456) float local456;
		@Pc(451) float local451;
		@Pc(461) float local461;
		for (@Pc(444) int local444 = 0; local444 < 8; local444++) {
			local451 = (float) Static240.anIntArray253[local444];
			local456 = (float) Static619.anIntArray544[local444];
			local461 = (float) Static405.anIntArray348[local444];
			local475 = local54 + Static498.aFloat214 * local451 + local456 * Static287.aFloat78 + local461 * Static66.aFloat14;
			local489 = Static544.aFloat158 * local456 + Static490.aFloat184 * local451 + local461 * Static209.aFloat65 + local147;
			local503 = local461 * Static211.aFloat67 + local456 * Static364.aFloat119 + local451 * Static543.aFloat157 + local33;
			if (local489 >= (float) this.aClass95_Sub1_11.anInt10050) {
				if (arg3 > 0) {
					local489 = (float) arg3;
				}
				@Pc(527) float local527 = (float) this.aClass95_Sub1_11.anInt10025 + local503 * (float) local257 / local489;
				@Pc(539) float local539 = (float) local261 * local475 / local489 + (float) this.aClass95_Sub1_11.anInt10063;
				if (local241 > local527) {
					local241 = local527;
				}
				if (local527 > local243) {
					local243 = local527;
				}
				if (local253 < local539) {
					local253 = local539;
				}
				if (local539 < local245) {
					local245 = local539;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg4 > local241 && (float) arg4 < local243 && (float) arg0 > local245 && local253 > (float) arg0) {
			if (arg2) {
				return true;
			}
			if (Static46.anIntArray55.length < this.anInt4081) {
				Static46.anIntArray55 = new int[this.anInt4081];
				Static298.anIntArray285 = new int[this.anInt4081];
			}
			@Pc(700) int local700;
			for (@Pc(610) int local610 = 0; local610 < this.anInt4077; local610++) {
				local461 = (float) this.anIntArray226[local610];
				local451 = (float) this.anIntArray221[local610];
				local456 = (float) this.anIntArray220[local610];
				local489 = local147 + local451 * Static490.aFloat184 + Static544.aFloat158 * local456 + local461 * Static209.aFloat65;
				local475 = Static66.aFloat14 * local461 + Static498.aFloat214 * local451 + Static287.aFloat78 * local456 + local54;
				local503 = local461 * Static211.aFloat67 + local456 * Static364.aFloat119 + local451 * Static543.aFloat157 + local33;
				@Pc(713) int local713;
				@Pc(718) int local718;
				@Pc(725) int local725;
				if ((float) this.aClass95_Sub1_11.anInt10050 <= local489) {
					if (arg3 > 0) {
						local489 = (float) arg3;
					}
					local700 = (int) ((float) this.aClass95_Sub1_11.anInt10025 + local503 * (float) local257 / local489);
					local713 = (int) ((float) this.aClass95_Sub1_11.anInt10063 + (float) local261 * local475 / local489);
					local718 = this.anIntArray222[local610];
					local725 = this.anIntArray222[local610 + 1];
					for (@Pc(727) int local727 = local718; local727 < local725; local727++) {
						@Pc(736) int local736 = this.aShortArray55[local727] - 1;
						if (local736 == -1) {
							break;
						}
						Static46.anIntArray55[local736] = local700;
						Static298.anIntArray285[local736] = local713;
					}
				} else {
					local700 = this.anIntArray222[local610];
					local713 = this.anIntArray222[local610 + 1];
					for (local718 = local700; local718 < local713; local718++) {
						local725 = this.aShortArray55[local718] - 1;
						if (local725 == -1) {
							break;
						}
						Static46.anIntArray55[this.aShortArray55[local718] - 1] = -999999;
					}
				}
			}
			for (local700 = 0; local700 < this.anInt4056; local700++) {
				if (Static46.anIntArray55[this.aShortArray50[local700]] != -999999 && Static46.anIntArray55[this.aShortArray51[local700]] != -999999 && Static46.anIntArray55[this.aShortArray52[local700]] != -999999 && this.method3480(Static46.anIntArray55[this.aShortArray51[local700]], Static46.anIntArray55[this.aShortArray52[local700]], Static298.anIntArray285[this.aShortArray51[local700]], arg0, Static298.anIntArray285[this.aShortArray52[local700]], Static46.anIntArray55[this.aShortArray50[local700]], arg4, Static298.anIntArray285[this.aShortArray50[local700]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)V")
	public void method3479() {
		if (this.aClass5_2 != null) {
			this.aClass5_2.method107();
		}
		if (this.aClass5_4 != null) {
			this.aClass5_4.method107();
		}
		if (this.aClass5_3 != null) {
			this.aClass5_3.method107();
		}
		if (this.aClass5_1 != null) {
			this.aClass5_1.method107();
		}
		if (this.aClass47_1 != null) {
			this.aClass47_1.method1167();
		}
	}

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4077; local7++) {
			this.anIntArray226[local7] = -this.anIntArray226[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt4081; local25++) {
			this.aShortArray49[local25] = (short) -this.aShortArray49[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt4056; local48++) {
			@Pc(55) short local55 = this.aShortArray50[local48];
			this.aShortArray50[local48] = this.aShortArray52[local48];
			this.aShortArray52[local48] = local55;
		}
		this.method3483();
		this.method3475();
		this.method3482();
		this.aBoolean270 = false;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > arg3 && arg2 > arg3 && arg3 < arg4) {
			return false;
		} else if (arg3 > arg7 && arg2 < arg3 && arg3 > arg4) {
			return false;
		} else if (arg6 < arg5 && arg0 > arg6 && arg6 < arg1) {
			return false;
		} else {
			return arg6 <= arg5 || arg0 >= arg6 || arg1 >= arg6;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!al;)V")
	@Override
	public void method8848(@OriginalArg(0) Class17 arg0) {
		@Pc(8) Class17_Sub2 local8 = (Class17_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass373Array2 != null) {
			for (local13 = 0; local13 < this.aClass373Array2.length; local13++) {
				@Pc(20) Class373 local20 = this.aClass373Array2[local13];
				@Pc(22) Class373 local22 = local20;
				if (local20.aClass373_2 != null) {
					local22 = local20.aClass373_2;
				}
				local22.anInt10560 = (int) (local8.aFloat136 + local8.aFloat126 * (float) this.anIntArray226[local20.anInt10557] + local8.aFloat128 * (float) this.anIntArray221[local20.anInt10557] + local8.aFloat137 * (float) this.anIntArray220[local20.anInt10557]);
				local22.anInt10545 = (int) (local8.aFloat135 * (float) this.anIntArray226[local20.anInt10557] + local8.aFloat130 * (float) this.anIntArray221[local20.anInt10557] + (float) this.anIntArray220[local20.anInt10557] * local8.aFloat133 + local8.aFloat127);
				local22.anInt10547 = (int) (local8.aFloat131 + (float) this.anIntArray221[local20.anInt10557] * local8.aFloat129 + (float) this.anIntArray220[local20.anInt10557] * local8.aFloat132 + local8.aFloat134 * (float) this.anIntArray226[local20.anInt10557]);
				local22.anInt10551 = (int) (local8.aFloat136 + (float) this.anIntArray226[local20.anInt10559] * local8.aFloat126 + (float) this.anIntArray221[local20.anInt10559] * local8.aFloat128 + local8.aFloat137 * (float) this.anIntArray220[local20.anInt10559]);
				local22.anInt10561 = (int) (local8.aFloat127 + local8.aFloat133 * (float) this.anIntArray220[local20.anInt10559] + local8.aFloat130 * (float) this.anIntArray221[local20.anInt10559] + (float) this.anIntArray226[local20.anInt10559] * local8.aFloat135);
				local22.anInt10550 = (int) (local8.aFloat129 * (float) this.anIntArray221[local20.anInt10559] + local8.aFloat132 * (float) this.anIntArray220[local20.anInt10559] + (float) this.anIntArray226[local20.anInt10559] * local8.aFloat134 + local8.aFloat131);
				local22.anInt10563 = (int) (local8.aFloat136 + local8.aFloat128 * (float) this.anIntArray221[local20.anInt10548] + (float) this.anIntArray220[local20.anInt10548] * local8.aFloat137 + local8.aFloat126 * (float) this.anIntArray226[local20.anInt10548]);
				local22.anInt10554 = (int) (local8.aFloat127 + (float) this.anIntArray226[local20.anInt10548] * local8.aFloat135 + (float) this.anIntArray220[local20.anInt10548] * local8.aFloat133 + (float) this.anIntArray221[local20.anInt10548] * local8.aFloat130);
				local22.anInt10546 = (int) (local8.aFloat131 + local8.aFloat129 * (float) this.anIntArray221[local20.anInt10548] + local8.aFloat132 * (float) this.anIntArray220[local20.anInt10548] + (float) this.anIntArray226[local20.anInt10548] * local8.aFloat134);
			}
		}
		if (this.aClass305Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass305Array2.length; local13++) {
			@Pc(365) Class305 local365 = this.aClass305Array2[local13];
			@Pc(367) Class305 local367 = local365;
			if (local365.aClass305_1 != null) {
				local367 = local365.aClass305_1;
			}
			if (local365.aClass17_7 == null) {
				local365.aClass17_7 = local8.method6230();
			} else {
				local365.aClass17_7.method6233(local8);
			}
			local367.anInt8120 = (int) ((float) this.anIntArray226[local365.anInt8121] * local8.aFloat126 + local8.aFloat137 * (float) this.anIntArray220[local365.anInt8121] + (float) this.anIntArray221[local365.anInt8121] * local8.aFloat128 + local8.aFloat136);
			local367.anInt8115 = (int) (local8.aFloat127 + (float) this.anIntArray221[local365.anInt8121] * local8.aFloat130 + local8.aFloat133 * (float) this.anIntArray220[local365.anInt8121] + local8.aFloat135 * (float) this.anIntArray226[local365.anInt8121]);
			local367.anInt8114 = (int) ((float) this.anIntArray220[local365.anInt8121] * local8.aFloat132 + local8.aFloat129 * (float) this.anIntArray221[local365.anInt8121] + (float) this.anIntArray226[local365.anInt8121] * local8.aFloat134 + local8.aFloat131);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IILclient!al;ZII)Z")
	@Override
	public boolean method8862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method3478(arg1, arg4, arg3, arg5, arg0, arg2);
	}

	@OriginalMember(owner = "client!hm", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt4074;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8871(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			Static62.anInt1287 = 0;
			Static503.anInt7948 = 0;
			Static447.anInt7217 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray27.length) {
					local52 = this.anIntArrayArray27[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static62.anInt1287 += this.anIntArray220[local60];
						Static503.anInt7948 += this.anIntArray221[local60];
						local30++;
						Static447.anInt7217 += this.anIntArray226[local60];
					}
				}
			}
			if (local30 > 0) {
				Static503.anInt7948 = Static503.anInt7948 / local30 + local18;
				Static62.anInt1287 = local14 + Static62.anInt1287 / local30;
				Static447.anInt7217 = local22 + Static447.anInt7217 / local30;
			} else {
				Static62.anInt1287 = local14;
				Static447.anInt7217 = local22;
				Static503.anInt7948 = local18;
			}
			return;
		}
		@Pc(168) int[] local168;
		@Pc(170) int local170;
		if (arg0 == 1) {
			local18 = arg3 << 4;
			local14 = arg2 << 4;
			local22 = arg4 << 4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray27.length) {
					local168 = this.anIntArrayArray27[local32];
					for (local170 = 0; local170 < local168.length; local170++) {
						local54 = local168[local170];
						this.anIntArray220[local54] += local14;
						this.anIntArray221[local54] += local18;
						this.anIntArray226[local54] += local22;
					}
				}
			}
			return;
		}
		@Pc(283) int local283;
		@Pc(302) int local302;
		@Pc(754) int local754;
		@Pc(763) int local763;
		if (arg0 == 2) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray27.length) {
					local168 = this.anIntArrayArray27[local32];
					if ((arg5 & 0x1) == 0) {
						for (local170 = 0; local170 < local168.length; local170++) {
							local54 = local168[local170];
							this.anIntArray220[local54] -= Static62.anInt1287;
							this.anIntArray221[local54] -= Static503.anInt7948;
							this.anIntArray226[local54] -= Static447.anInt7217;
							if (arg4 != 0) {
								local60 = Class94.anIntArray561[arg4];
								local283 = Class94.anIntArray560[arg4];
								local302 = this.anIntArray221[local54] * local60 + this.anIntArray220[local54] * local283 + 16383 >> 14;
								this.anIntArray221[local54] = local283 * this.anIntArray221[local54] + 16383 - this.anIntArray220[local54] * local60 >> 14;
								this.anIntArray220[local54] = local302;
							}
							if (arg2 != 0) {
								local60 = Class94.anIntArray561[arg2];
								local283 = Class94.anIntArray560[arg2];
								local302 = this.anIntArray221[local54] * local283 + 16383 - local60 * this.anIntArray226[local54] >> 14;
								this.anIntArray226[local54] = this.anIntArray226[local54] * local283 + local60 * this.anIntArray221[local54] + 16383 >> 14;
								this.anIntArray221[local54] = local302;
							}
							if (arg3 != 0) {
								local60 = Class94.anIntArray561[arg3];
								local283 = Class94.anIntArray560[arg3];
								local302 = this.anIntArray226[local54] * local60 + this.anIntArray220[local54] * local283 + 16383 >> 14;
								this.anIntArray226[local54] = this.anIntArray226[local54] * local283 + 16383 - local60 * this.anIntArray220[local54] >> 14;
								this.anIntArray220[local54] = local302;
							}
							this.anIntArray220[local54] += Static62.anInt1287;
							this.anIntArray221[local54] += Static503.anInt7948;
							this.anIntArray226[local54] += Static447.anInt7217;
						}
					} else {
						for (local170 = 0; local170 < local168.length; local170++) {
							local54 = local168[local170];
							this.anIntArray220[local54] -= Static62.anInt1287;
							this.anIntArray221[local54] -= Static503.anInt7948;
							this.anIntArray226[local54] -= Static447.anInt7217;
							if (arg2 != 0) {
								local60 = Class94.anIntArray561[arg2];
								local283 = Class94.anIntArray560[arg2];
								local302 = local283 * this.anIntArray221[local54] + 16383 - this.anIntArray226[local54] * local60 >> 14;
								this.anIntArray226[local54] = local60 * this.anIntArray221[local54] + local283 * this.anIntArray226[local54] + 16383 >> 14;
								this.anIntArray221[local54] = local302;
							}
							if (arg4 != 0) {
								local60 = Class94.anIntArray561[arg4];
								local283 = Class94.anIntArray560[arg4];
								local302 = this.anIntArray220[local54] * local283 + local60 * this.anIntArray221[local54] + 16383 >> 14;
								this.anIntArray221[local54] = this.anIntArray221[local54] * local283 + 16383 - this.anIntArray220[local54] * local60 >> 14;
								this.anIntArray220[local54] = local302;
							}
							if (arg3 != 0) {
								local60 = Class94.anIntArray561[arg3];
								local283 = Class94.anIntArray560[arg3];
								local302 = this.anIntArray226[local54] * local60 + this.anIntArray220[local54] * local283 + 16383 >> 14;
								this.anIntArray226[local54] = local283 * this.anIntArray226[local54] + 16383 - local60 * this.anIntArray220[local54] >> 14;
								this.anIntArray220[local54] = local302;
							}
							this.anIntArray220[local54] += Static62.anInt1287;
							this.anIntArray221[local54] += Static503.anInt7948;
							this.anIntArray226[local54] += Static447.anInt7217;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray27.length > local38) {
						local52 = this.anIntArrayArray27[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local283 = this.anIntArray222[local60];
							local302 = this.anIntArray222[local60 + 1];
							for (local754 = local283; local754 < local302; local754++) {
								local763 = this.aShortArray55[local754] - 1;
								if (local763 == -1) {
									break;
								}
								@Pc(772) int local772;
								@Pc(776) int local776;
								@Pc(794) int local794;
								if (arg4 != 0) {
									local772 = Class94.anIntArray561[arg4];
									local776 = Class94.anIntArray560[arg4];
									local794 = this.aShortArray47[local763] * local772 + this.aShortArray56[local763] * local776 + 16383 >> 14;
									this.aShortArray47[local763] = (short) (this.aShortArray47[local763] * local776 + 16383 - local772 * this.aShortArray56[local763] >> 14);
									this.aShortArray56[local763] = (short) local794;
								}
								if (arg2 != 0) {
									local772 = Class94.anIntArray561[arg2];
									local776 = Class94.anIntArray560[arg2];
									local794 = this.aShortArray47[local763] * local776 + 16383 - this.aShortArray49[local763] * local772 >> 14;
									this.aShortArray49[local763] = (short) (local776 * this.aShortArray49[local763] + this.aShortArray47[local763] * local772 + 16383 >> 14);
									this.aShortArray47[local763] = (short) local794;
								}
								if (arg3 != 0) {
									local772 = Class94.anIntArray561[arg3];
									local776 = Class94.anIntArray560[arg3];
									local794 = this.aShortArray56[local763] * local776 + local772 * this.aShortArray49[local763] + 16383 >> 14;
									this.aShortArray49[local763] = (short) (this.aShortArray49[local763] * local776 + 16383 - local772 * this.aShortArray56[local763] >> 14);
									this.aShortArray56[local763] = (short) local794;
								}
							}
						}
					}
				}
				this.method3475();
			}
		} else if (arg0 == 3) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray27.length > local32) {
					local168 = this.anIntArrayArray27[local32];
					for (local170 = 0; local170 < local168.length; local170++) {
						local54 = local168[local170];
						this.anIntArray220[local54] -= Static62.anInt1287;
						this.anIntArray221[local54] -= Static503.anInt7948;
						this.anIntArray226[local54] -= Static447.anInt7217;
						this.anIntArray220[local54] = arg2 * this.anIntArray220[local54] >> 7;
						this.anIntArray221[local54] = arg3 * this.anIntArray221[local54] >> 7;
						this.anIntArray226[local54] = this.anIntArray226[local54] * arg4 >> 7;
						this.anIntArray220[local54] += Static62.anInt1287;
						this.anIntArray221[local54] += Static503.anInt7948;
						this.anIntArray226[local54] += Static447.anInt7217;
					}
				}
			}
		} else {
			@Pc(1193) Class183 local1193;
			@Pc(1092) boolean local1092;
			@Pc(1188) Class314 local1188;
			if (arg0 == 5) {
				if (this.anIntArrayArray28 != null) {
					local1092 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray28.length) {
							local52 = this.anIntArrayArray28[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local283 = (this.aByteArray33[local60] & 0xFF) + (arg2 * 8);
								if (local283 < 0) {
									local283 = 0;
								} else if (local283 > 255) {
									local283 = 255;
								}
								this.aByteArray33[local60] = (byte) local283;
							}
							local1092 |= local52.length > 0;
						}
					}
					if (local1092) {
						if (this.aClass314Array1 != null) {
							for (local38 = 0; local38 < this.anInt4014; local38++) {
								local1188 = this.aClass314Array1[local38];
								local1193 = this.aClass183Array1[local38];
								local1193.anInt4815 = 255 - (this.aByteArray33[local1188.anInt8332] & 0xFF) << 24 | local1193.anInt4815 & 0xFFFFFF;
							}
						}
						this.method3474();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray28 != null) {
					local1092 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray28.length > local38) {
							local52 = this.anIntArrayArray28[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local283 = this.aShortArray54[local60] & 0xFFFF;
								local302 = local283 >> 10 & 0x3F;
								local754 = local283 >> 7 & 0x7;
								local763 = local283 & 0x7F;
								local754 += arg3 / 4;
								@Pc(1296) int local1296 = arg2 + local302 & 0x3F;
								local763 += arg4;
								if (local754 < 0) {
									local754 = 0;
								} else if (local754 > 7) {
									local754 = 7;
								}
								if (local763 < 0) {
									local763 = 0;
								} else if (local763 > 127) {
									local763 = 127;
								}
								this.aShortArray54[local60] = (short) (local754 << 7 | local1296 << 10 | local763);
							}
							local1092 |= local52.length > 0;
						}
					}
					if (local1092) {
						if (this.aClass314Array1 != null) {
							for (local38 = 0; local38 < this.anInt4014; local38++) {
								local1188 = this.aClass314Array1[local38];
								local1193 = this.aClass183Array1[local38];
								local1193.anInt4815 = local1193.anInt4815 & 0xFF000000 | Static537.anIntArray457[this.aShortArray54[local1188.anInt8332] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method3474();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray29 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray29.length > local32) {
							local168 = this.anIntArrayArray29[local32];
							for (local170 = 0; local170 < local168.length; local170++) {
								local1193 = this.aClass183Array1[local168[local170]];
								local1193.anInt4810 += arg3;
								local1193.anInt4816 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray29 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray29.length) {
							local168 = this.anIntArrayArray29[local32];
							for (local170 = 0; local170 < local168.length; local170++) {
								local1193 = this.aClass183Array1[local168[local170]];
								local1193.anInt4814 = arg2 * local1193.anInt4814 >> 7;
								local1193.anInt4812 = local1193.anInt4812 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray29 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray29.length) {
						local168 = this.anIntArrayArray29[local32];
						for (local170 = 0; local170 < local168.length; local170++) {
							local1193 = this.aClass183Array1[local168[local170]];
							local1193.anInt4808 = local1193.anInt4808 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean270) {
			this.method3477();
		}
		return this.anInt4049;
	}

	@OriginalMember(owner = "client!hm", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.lb; local3++) {
			this.anIntArray220[local3] = this.anIntArray220[local3] + 7 >> 4;
			this.anIntArray221[local3] = this.anIntArray221[local3] + 7 >> 4;
			this.anIntArray226[local3] = this.anIntArray226[local3] + 7 >> 4;
		}
		this.method3483();
		this.aBoolean270 = false;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!al;Lclient!ju;I)V")
	@Override
	public void method8857(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class34_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4081 == 0) {
			return;
		}
		@Pc(13) Class17_Sub2 local13 = this.aClass95_Sub1_11.aClass17_Sub2_16;
		if (!this.aBoolean270) {
			this.method3477();
		}
		@Pc(22) Class17_Sub2 local22 = (Class17_Sub2) arg0;
		Static229.aFloat74 = local22.aFloat127 * local13.aFloat129 + local13.aFloat132 * local22.aFloat136 + local13.aFloat134 * local22.aFloat131 + local13.aFloat131;
		Static490.aFloat184 = local13.aFloat129 * local22.aFloat130 + local13.aFloat132 * local22.aFloat128 + local22.aFloat129 * local13.aFloat134;
		@Pc(69) float local69 = Static229.aFloat74 + Static490.aFloat184 * (float) this.anInt4053;
		@Pc(77) float local77 = (float) this.anInt4027 * Static490.aFloat184 + Static229.aFloat74;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.anInt4019;
			local93 = local77 - (float) this.anInt4019;
		} else {
			local87 = (float) this.anInt4019 + local77;
			local93 = local69 - (float) this.anInt4019;
		}
		if (this.aClass95_Sub1_11.aFloat197 <= local93 || local87 <= (float) this.aClass95_Sub1_11.anInt10050) {
			return;
		}
		Static614.aFloat204 = local13.aFloat128 * local22.aFloat127 + local22.aFloat136 * local13.aFloat137 + local13.aFloat126 * local22.aFloat131 + local13.aFloat136;
		Static543.aFloat157 = local22.aFloat129 * local13.aFloat126 + local22.aFloat128 * local13.aFloat137 + local22.aFloat130 * local13.aFloat128;
		@Pc(169) float local169 = (float) this.anInt4053 * Static543.aFloat157 + Static614.aFloat204;
		@Pc(177) float local177 = Static543.aFloat157 * (float) this.anInt4027 + Static614.aFloat204;
		@Pc(204) float local204;
		@Pc(192) float local192;
		if (local169 > local177) {
			local192 = (float) this.aClass95_Sub1_11.anInt10052 * (local169 + (float) this.anInt4019);
			local204 = (float) this.aClass95_Sub1_11.anInt10052 * (local177 - (float) this.anInt4019);
		} else {
			local192 = (local177 + (float) this.anInt4019) * (float) this.aClass95_Sub1_11.anInt10052;
			local204 = (float) this.aClass95_Sub1_11.anInt10052 * ((float) -this.anInt4019 + local169);
		}
		if (this.aClass95_Sub1_11.aFloat196 <= local204 / local87 || local192 / local87 <= this.aClass95_Sub1_11.aFloat194) {
			return;
		}
		Static19.aFloat5 = local22.aFloat136 * local13.aFloat133 + local13.aFloat130 * local22.aFloat127 + local13.aFloat135 * local22.aFloat131 + local13.aFloat127;
		Static498.aFloat214 = local22.aFloat128 * local13.aFloat133 + local13.aFloat130 * local22.aFloat130 + local22.aFloat129 * local13.aFloat135;
		@Pc(293) float local293 = (float) this.anInt4053 * Static498.aFloat214 + Static19.aFloat5;
		@Pc(301) float local301 = Static498.aFloat214 * (float) this.anInt4027 + Static19.aFloat5;
		@Pc(327) float local327;
		@Pc(316) float local316;
		if (local301 < local293) {
			local327 = (local301 - (float) this.anInt4019) * (float) this.aClass95_Sub1_11.anInt10044;
			local316 = (float) this.aClass95_Sub1_11.anInt10044 * ((float) this.anInt4019 + local293);
		} else {
			local316 = (float) this.aClass95_Sub1_11.anInt10044 * ((float) this.anInt4019 + local301);
			local327 = (float) this.aClass95_Sub1_11.anInt10044 * (local293 - (float) this.anInt4019);
		}
		if (this.aClass95_Sub1_11.aFloat198 <= local327 / local87 || this.aClass95_Sub1_11.aFloat201 >= local316 / local87) {
			return;
		}
		if (arg1 != null || this.aClass314Array1 != null) {
			Static66.aFloat14 = local13.aFloat135 * local22.aFloat134 + local13.aFloat133 * local22.aFloat126 + local22.aFloat135 * local13.aFloat130;
			Static209.aFloat65 = local22.aFloat134 * local13.aFloat134 + local13.aFloat129 * local22.aFloat135 + local22.aFloat126 * local13.aFloat132;
			Static211.aFloat67 = local13.aFloat126 * local22.aFloat134 + local13.aFloat137 * local22.aFloat126 + local22.aFloat135 * local13.aFloat128;
			Static544.aFloat158 = local13.aFloat129 * local22.aFloat133 + local13.aFloat132 * local22.aFloat137 + local13.aFloat134 * local22.aFloat132;
			Static287.aFloat78 = local22.aFloat132 * local13.aFloat135 + local22.aFloat133 * local13.aFloat130 + local13.aFloat133 * local22.aFloat137;
			Static364.aFloat119 = local22.aFloat133 * local13.aFloat128 + local13.aFloat137 * local22.aFloat137 + local13.aFloat126 * local22.aFloat132;
		}
		if (arg1 != null) {
			@Pc(486) boolean local486 = false;
			@Pc(488) boolean local488 = true;
			@Pc(496) int local496 = this.anInt4029 + this.anInt4031 >> 1;
			@Pc(504) int local504 = this.anInt4088 + this.anInt4049 >> 1;
			@Pc(523) int local523 = (int) ((float) local504 * Static211.aFloat67 + Static364.aFloat119 * (float) local496 + Static614.aFloat204 + Static543.aFloat157 * (float) this.anInt4053);
			@Pc(542) int local542 = (int) ((float) local504 * Static66.aFloat14 + Static287.aFloat78 * (float) local496 + Static19.aFloat5 + (float) this.anInt4053 * Static498.aFloat214);
			@Pc(561) int local561 = (int) (Static229.aFloat74 + (float) local496 * Static544.aFloat158 + (float) this.anInt4053 * Static490.aFloat184 + (float) local504 * Static209.aFloat65);
			if (local561 < this.aClass95_Sub1_11.anInt10050) {
				local486 = true;
			} else {
				arg1.anInt4989 = local523 * this.aClass95_Sub1_11.anInt10052 / local561 + this.aClass95_Sub1_11.anInt10025;
				arg1.anInt4988 = this.aClass95_Sub1_11.anInt10063 + local542 * this.aClass95_Sub1_11.anInt10044 / local561;
			}
			@Pc(619) int local619 = (int) (Static211.aFloat67 * (float) local504 + Static614.aFloat204 + Static364.aFloat119 * (float) local496 + Static543.aFloat157 * (float) this.anInt4027);
			@Pc(638) int local638 = (int) (Static19.aFloat5 + (float) local496 * Static287.aFloat78 + Static498.aFloat214 * (float) this.anInt4027 + Static66.aFloat14 * (float) local504);
			@Pc(657) int local657 = (int) ((float) local504 * Static209.aFloat65 + Static229.aFloat74 + (float) local496 * Static544.aFloat158 + Static490.aFloat184 * (float) this.anInt4027);
			if (this.aClass95_Sub1_11.anInt10050 <= local657) {
				arg1.anInt4990 = this.aClass95_Sub1_11.anInt10025 + this.aClass95_Sub1_11.anInt10052 * local619 / local657;
				arg1.anInt4991 = local638 * this.aClass95_Sub1_11.anInt10044 / local657 + this.aClass95_Sub1_11.anInt10063;
			} else {
				local486 = true;
			}
			if (local486) {
				if (local561 < this.aClass95_Sub1_11.anInt10050 && local657 < this.aClass95_Sub1_11.anInt10050) {
					local488 = false;
				} else {
					@Pc(730) int local730;
					@Pc(741) int local741;
					@Pc(752) int local752;
					if (this.aClass95_Sub1_11.anInt10050 > local561) {
						local730 = (local657 - this.aClass95_Sub1_11.anInt10050 << 16) / (local657 - local561);
						local741 = ((local619 - local523) * local730 >> 16) + local619;
						local752 = (local730 * (local638 - local542) >> 16) + local638;
						arg1.anInt4989 = this.aClass95_Sub1_11.anInt10025 + this.aClass95_Sub1_11.anInt10052 * local741 / this.aClass95_Sub1_11.anInt10050;
						arg1.anInt4988 = local752 * this.aClass95_Sub1_11.anInt10044 / this.aClass95_Sub1_11.anInt10050 + this.aClass95_Sub1_11.anInt10063;
					} else if (this.aClass95_Sub1_11.anInt10050 > local657) {
						local730 = (local561 - this.aClass95_Sub1_11.anInt10050 << 16) / (local561 - local657);
						local741 = local523 + ((local523 - local619) * local730 >> 16);
						arg1.anInt4989 = this.aClass95_Sub1_11.anInt10052 * local741 / this.aClass95_Sub1_11.anInt10050 + this.aClass95_Sub1_11.anInt10025;
						local752 = local542 + (local730 * (local542 - local638) >> 16);
						arg1.anInt4988 = this.aClass95_Sub1_11.anInt10063 + local752 * this.aClass95_Sub1_11.anInt10044 / this.aClass95_Sub1_11.anInt10050;
					}
				}
			}
			if (local488) {
				arg1.aBoolean332 = true;
				if (local657 >= local561) {
					arg1.anInt4992 = this.aClass95_Sub1_11.anInt10025 + (this.anInt4019 + local619) * this.aClass95_Sub1_11.anInt10052 / local657 - arg1.anInt4990;
				} else {
					arg1.anInt4992 = this.aClass95_Sub1_11.anInt10025 + (this.anInt4019 + local523) * this.aClass95_Sub1_11.anInt10052 / local561 - arg1.anInt4989;
				}
			}
		}
		this.aClass95_Sub1_11.method8086();
		this.aClass95_Sub1_11.method8104(local22);
		this.method3485();
		this.method3488();
	}

	@OriginalMember(owner = "client!hm", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class94.anIntArray561[arg0];
		@Pc(13) int local13 = Class94.anIntArray560[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4077; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray221[local15] - local9 * this.anIntArray226[local15] >> 14;
			this.anIntArray226[local15] = local9 * this.anIntArray221[local15] + this.anIntArray226[local15] * local13 >> 14;
			this.anIntArray221[local15] = local34;
		}
		this.method3483();
		this.aBoolean270 = false;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "()Z")
	@Override
	public boolean method8846() {
		if (this.aShortArray53 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray53.length; local12++) {
			if (this.aShortArray53[local12] != -1 && !this.aClass95_Sub1_11.anInterface2_12.method8328(this.aShortArray53[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(B)V")
	private void method3482() {
		if (this.aClass47_1 != null) {
			this.aClass47_1.aBoolean93 = false;
		}
	}

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "(I)V")
	private void method3483() {
		if (this.aClass5_2 != null) {
			this.aClass5_2.aBoolean6 = false;
		}
	}

	@OriginalMember(owner = "client!hm", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort38 = (short) arg0;
		this.method3483();
		this.method3475();
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "()V")
	@Override
	public void method8870() {
		if (this.anInt4081 > 0 && this.anInt4069 > 0) {
			this.method3486();
			this.method3476();
			this.method3471();
		}
	}

	@OriginalMember(owner = "client!hm", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean270) {
			this.method3477();
		}
		return this.anInt4020;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class94.anIntArray561[arg0];
		@Pc(13) int local13 = Class94.anIntArray560[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4077; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray220[local15] + this.anIntArray226[local15] * local9 >> 14;
			this.anIntArray226[local15] = local13 * this.anIntArray226[local15] - local9 * this.anIntArray220[local15] >> 14;
			this.anIntArray220[local15] = local33;
		}
		this.method3483();
		this.aBoolean270 = false;
	}

	@OriginalMember(owner = "client!hm", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray27 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.lb; local12++) {
			this.anIntArray220[local12] <<= 0x4;
			this.anIntArray221[local12] <<= 0x4;
			this.anIntArray226[local12] <<= 0x4;
		}
		Static447.anInt7217 = 0;
		Static503.anInt7948 = 0;
		Static62.anInt1287 = 0;
		return true;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!gl;IFIIIIIIFJ)S")
	private short method3484(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) long arg9) {
		@Pc(10) int local10 = this.anIntArray222[arg4];
		@Pc(17) int local17 = this.anIntArray222[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(27) int local27 = local10; local27 < local17; local27++) {
			@Pc(34) short local34 = this.aShortArray55[local27];
			if (local34 == 0) {
				local19 = local27;
				break;
			}
			if (arg9 == Static108.aLongArray2[local27]) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray55[local19] = (short) (this.anInt4081 + 1);
		Static108.aLongArray2[local19] = arg9;
		this.aShortArray48[this.anInt4081] = (short) arg6;
		this.aShortArray45[this.anInt4081] = (short) arg4;
		this.aShortArray56[this.anInt4081] = (short) arg5;
		this.aShortArray47[this.anInt4081] = (short) arg7;
		this.aShortArray49[this.anInt4081] = (short) arg1;
		this.aByteArray34[this.anInt4081] = (byte) arg3;
		this.aFloatArray26[this.anInt4081] = arg2;
		this.aFloatArray27[this.anInt4081] = arg8;
		return (short) this.anInt4081++;
	}

	@OriginalMember(owner = "client!hm", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort39 = (short) arg0;
		this.method3474();
	}

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass5_2 != null) {
			this.aClass5_2.aBoolean5 = Static371.method5293(this.anInt4036, arg0);
		}
		if (this.aClass5_4 != null) {
			this.aClass5_4.aBoolean5 = Static316.method4540(arg0, this.anInt4036);
		}
		if (this.aClass5_3 != null) {
			this.aClass5_3.aBoolean5 = Static559.method7378(arg0, this.anInt4036);
		}
		if (this.aClass5_1 != null) {
			this.aClass5_1.aBoolean5 = Static366.method5268(this.anInt4036, arg0);
		}
		this.anInt4074 = arg0;
		if (this.aClass50_1 != null && (this.anInt4074 & 0x10000) == 0) {
			this.aShortArray49 = this.aClass50_1.aShortArray18;
			this.aShortArray47 = this.aClass50_1.aShortArray17;
			this.aShortArray56 = this.aClass50_1.aShortArray19;
			this.aByteArray34 = this.aClass50_1.aByteArray8;
			this.aClass50_1 = null;
		}
		this.aBoolean274 = true;
		this.method3471();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!al;IZ)V")
	@Override
	public void method8852(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray46 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4077; local14++) {
			if ((this.aShortArray46[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method6232(this.anIntArray220[local14], this.anIntArray221[local14], this.anIntArray226[local14], local12);
				} else {
					arg0.method6237(this.anIntArray220[local14], this.anIntArray221[local14], this.anIntArray226[local14], local12);
				}
				this.anIntArray220[local14] = local12[0];
				this.anIntArray221[local14] = local12[1];
				this.anIntArray226[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean270) {
			this.method3477();
		}
		return this.anInt4088;
	}

	@OriginalMember(owner = "client!hm", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean270) {
			this.method3477();
		}
		return this.anInt4031;
	}

	@OriginalMember(owner = "client!hm", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4056; local3++) {
			if (arg0 == this.aShortArray54[local3]) {
				this.aShortArray54[local3] = arg1;
			}
		}
		if (this.aClass314Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt4014; local30++) {
				@Pc(37) Class314 local37 = this.aClass314Array1[local30];
				@Pc(42) Class183 local42 = this.aClass183Array1[local30];
				local42.anInt4815 = local42.anInt4815 & 0xFF000000 | Static537.anIntArray457[this.aShortArray54[local37.anInt8332] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3474();
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)V")
	private void method3485() {
		if (this.anInt4069 == 0) {
			return;
		}
		if (this.method3486() && this.method3476()) {
			this.aClass95_Sub1_11.method8133(this.aClass5_2.anInterface15_2, 0);
			this.aClass95_Sub1_11.method8133(this.aClass5_3.anInterface15_2, 1);
			this.aClass95_Sub1_11.method8133(this.aClass5_4.anInterface15_2, 2);
			@Pc(51) boolean local51;
			if ((this.anInt4036 & 0x37) == 0) {
				local51 = false;
				this.aClass95_Sub1_11.method8163(false);
				this.aClass95_Sub1_11.method8166(this.aClass95_Sub1_11.aClass94_20);
			} else {
				this.aClass95_Sub1_11.method8163(true);
				local51 = true;
				this.aClass95_Sub1_11.method8133(this.aClass5_1.anInterface15_2, 3);
				this.aClass95_Sub1_11.method8166(this.aClass95_Sub1_11.aClass94_19);
			}
			for (@Pc(91) int local91 = 0; local91 < this.anIntArray223.length; local91++) {
				@Pc(98) int local98 = this.anIntArray224[local91];
				@Pc(105) int local105 = this.anIntArray224[local91 + 1];
				@Pc(112) int local112 = this.aShortArray53[local98] & 0xFFFF;
				if (local112 == 65535) {
					local112 = -1;
				}
				this.aClass95_Sub1_11.method8118(true, local112, local51);
				this.aClass95_Sub1_11.method8109(local105 - local98, local98 * 3, this.anIntArray225[local91], Static649.aClass115_6, this.anIntArray223[local91], this.aClass47_1.anInterface22_2);
			}
		}
		this.method3471();
	}

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "(I)Z")
	private boolean method3486() {
		@Pc(13) boolean local13 = !this.aClass5_3.aBoolean6;
		@Pc(32) boolean local32 = (this.anInt4036 & 0x37) != 0 && !this.aClass5_1.aBoolean6;
		@Pc(40) boolean local40 = !this.aClass5_2.aBoolean6;
		@Pc(48) boolean local48 = !this.aClass5_4.aBoolean6;
		if (!local40 && !local13 && !local32 && !local48) {
			return true;
		}
		@Pc(60) boolean local60 = true;
		@Pc(79) Interface15 local79;
		@Pc(95) Buffer local95;
		if (local40) {
			if (this.aClass5_2.anInterface15_1 == null) {
				this.aClass5_2.anInterface15_1 = this.aClass95_Sub1_11.method8090(this.aBoolean271);
			}
			local79 = this.aClass5_2.anInterface15_1;
			local79.method5530(this.anInt4081 * 12, 12);
			local95 = local79.method5529();
			if (local95 == null) {
				local60 = false;
			} else {
				this.aClass95_Sub1_11.aNativeInterface3.copyPositions(this.anIntArray220, this.anIntArray221, this.anIntArray226, this.aShortArray45, 0, 12, this.anInt4081, local95.getAddress());
				if (local79.method5528()) {
					this.aClass5_2.aBoolean6 = true;
					this.aClass5_2.anInterface15_2 = local79;
				} else {
					local60 = false;
				}
			}
		}
		@Pc(187) short[] local187;
		@Pc(181) short[] local181;
		@Pc(184) short[] local184;
		@Pc(190) byte[] local190;
		if (local13) {
			if (this.aClass5_3.anInterface15_1 == null) {
				this.aClass5_3.anInterface15_1 = this.aClass95_Sub1_11.method8090(this.aBoolean271);
			}
			local79 = this.aClass5_3.anInterface15_1;
			local79.method5530(this.anInt4081 * 4, 4);
			local95 = local79.method5529();
			if (local95 == null) {
				local60 = false;
			} else {
				if ((this.anInt4036 & 0x37) == 0) {
					if (this.aClass50_1 == null) {
						local181 = this.aShortArray47;
						local184 = this.aShortArray49;
						local187 = this.aShortArray56;
						local190 = this.aByteArray34;
					} else {
						local187 = this.aClass50_1.aShortArray19;
						local184 = this.aClass50_1.aShortArray18;
						local190 = this.aClass50_1.aByteArray8;
						local181 = this.aClass50_1.aShortArray17;
					}
					this.aClass95_Sub1_11.aNativeInterface3.copyLighting(this.aShortArray54, this.aByteArray33, this.aShortArray53, local187, local181, local184, local190, this.aShort39, this.aShort38, this.aShortArray48, 0, 4, this.anInt4081, local95.getAddress());
				} else {
					this.aClass95_Sub1_11.aNativeInterface3.copyColours(this.aShortArray54, this.aByteArray33, this.aShortArray53, this.aShort39, this.aShortArray48, 0, 4, this.anInt4081, local95.getAddress());
				}
				if (local79.method5528()) {
					this.aClass5_3.anInterface15_2 = local79;
					this.aClass5_3.aBoolean6 = true;
				} else {
					local60 = false;
				}
			}
		}
		if (local32) {
			if (this.aClass5_1.anInterface15_1 == null) {
				this.aClass5_1.anInterface15_1 = this.aClass95_Sub1_11.method8090(this.aBoolean271);
			}
			local79 = this.aClass5_1.anInterface15_1;
			local79.method5530(this.anInt4081 * 12, 12);
			local95 = local79.method5529();
			if (local95 == null) {
				local60 = false;
			} else {
				if (this.aClass50_1 == null) {
					local184 = this.aShortArray49;
					local190 = this.aByteArray34;
					local187 = this.aShortArray56;
					local181 = this.aShortArray47;
				} else {
					local190 = this.aClass50_1.aByteArray8;
					local187 = this.aClass50_1.aShortArray19;
					local184 = this.aClass50_1.aShortArray18;
					local181 = this.aClass50_1.aShortArray17;
				}
				this.aClass95_Sub1_11.aNativeInterface3.copyNormals(local187, local181, local184, local190, 3.0F / (float) this.aShort38, 3.0F / (float) (this.aShort38 + this.aShort38 / 2), 0, 12, this.anInt4081, local95.getAddress());
				if (local79.method5528()) {
					this.aClass5_1.anInterface15_2 = local79;
					this.aClass5_1.aBoolean6 = true;
				} else {
					local60 = false;
				}
			}
		}
		if (local48) {
			if (this.aClass5_4.anInterface15_1 == null) {
				this.aClass5_4.anInterface15_1 = this.aClass95_Sub1_11.method8090(this.aBoolean271);
			}
			local79 = this.aClass5_4.anInterface15_1;
			local79.method5530(this.anInt4081 * 8, 8);
			local95 = local79.method5529();
			if (local95 == null) {
				local60 = false;
			} else {
				this.aClass95_Sub1_11.aNativeInterface3.copyTexCoords(this.aFloatArray26, this.aFloatArray27, 0, 8, this.anInt4081, local95.getAddress());
				if (local79.method5528()) {
					this.aClass5_4.aBoolean6 = true;
					this.aClass5_4.anInterface15_2 = local79;
				} else {
					local60 = false;
				}
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IILclient!al;ZI)Z")
	@Override
	public boolean method8866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method3478(arg1, arg4, arg3, -1, arg0, arg2);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class149 method8858(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(23) Class149_Sub1 local23;
		@Pc(19) Class149_Sub1 local19;
		if (arg0 == 1) {
			local23 = this.aClass95_Sub1_11.aClass149_Sub1_22;
			local19 = this.aClass95_Sub1_11.aClass149_Sub1_26;
		} else if (arg0 == 2) {
			local19 = this.aClass95_Sub1_11.aClass149_Sub1_21;
			local23 = this.aClass95_Sub1_11.aClass149_Sub1_24;
		} else if (arg0 == 3) {
			local19 = this.aClass95_Sub1_11.aClass149_Sub1_27;
			local23 = this.aClass95_Sub1_11.aClass149_Sub1_28;
		} else if (arg0 == 4) {
			local23 = this.aClass95_Sub1_11.aClass149_Sub1_23;
			local19 = this.aClass95_Sub1_11.aClass149_Sub1_25;
		} else if (arg0 == 5) {
			local23 = this.aClass95_Sub1_11.aClass149_Sub1_30;
			local19 = this.aClass95_Sub1_11.aClass149_Sub1_29;
		} else {
			local23 = local19 = new Class149_Sub1(this.aClass95_Sub1_11, 0, 0, true, false);
		}
		return this.method3472(arg2, arg1, local19, local23, arg0 != 0);
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "()[Lclient!vja;")
	@Override
	public Class373[] method8867() {
		return this.aClass373Array2;
	}

	@OriginalMember(owner = "client!hm", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean270) {
			this.method3477();
		}
		return this.anInt4053;
	}

	@OriginalMember(owner = "client!hm", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4077; local7++) {
			if (arg0 != 0) {
				this.anIntArray220[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray221[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray226[local7] += arg2;
			}
		}
		this.method3483();
		this.aBoolean270 = false;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt4056; local3++) {
			local12 = this.aShortArray54[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 -= -(arg3 * (arg0 - local18) >> 7);
			}
			@Pc(42) int local42 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 -= -(arg3 * (arg1 - local24) >> 7);
			}
			if (arg2 != -1) {
				local42 += (arg2 - local42) * arg3 >> 7;
			}
			this.aShortArray54[local3] = (short) (local42 | local18 << 10 | local24 << 7);
		}
		if (this.aClass314Array1 != null) {
			for (local12 = 0; local12 < this.anInt4014; local12++) {
				@Pc(108) Class314 local108 = this.aClass314Array1[local12];
				@Pc(113) Class183 local113 = this.aClass183Array1[local12];
				local113.anInt4815 = Static537.anIntArray457[this.aShortArray54[local108.anInt8332] & 0xFFFF] & 0xFFFFFF | local113.anInt4815 & 0xFF000000;
			}
		}
		this.method3474();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V")
	private void method3488() {
		if (this.aClass314Array1 == null) {
			return;
		}
		this.aClass95_Sub1_11.C(!this.aBoolean273);
		this.aClass95_Sub1_11.method8163(false);
		this.aClass95_Sub1_11.method8108(1, Static576.aClass235_3);
		this.aClass95_Sub1_11.method8122(Static576.aClass235_3, 1);
		for (@Pc(42) int local42 = 0; local42 < this.anInt4014; local42++) {
			@Pc(49) Class314 local49 = this.aClass314Array1[local42];
			@Pc(54) Class183 local54 = this.aClass183Array1[local42];
			if (!local49.aBoolean579 || !this.aClass95_Sub1_11.method8011()) {
				@Pc(83) float local83 = (float) (this.anIntArray220[local49.anInt8334] + this.anIntArray220[local49.anInt8337] + this.anIntArray220[local49.anInt8333]) * 0.3333333F;
				@Pc(106) float local106 = (float) (this.anIntArray221[local49.anInt8337] + this.anIntArray221[local49.anInt8334] + this.anIntArray221[local49.anInt8333]) * 0.3333333F;
				@Pc(127) float local127 = (float) (this.anIntArray226[local49.anInt8337] + this.anIntArray226[local49.anInt8334] + this.anIntArray226[local49.anInt8333]) * 0.3333333F;
				@Pc(141) float local141 = Static614.aFloat204 + Static211.aFloat67 * local127 + local106 * Static543.aFloat157 + Static364.aFloat119 * local83;
				@Pc(155) float local155 = Static19.aFloat5 + local106 * Static498.aFloat214 + local83 * Static287.aFloat78 + Static66.aFloat14 * local127;
				@Pc(169) float local169 = Static229.aFloat74 + local83 * Static544.aFloat158 + Static490.aFloat184 * local106 + Static209.aFloat65 * local127;
				@Pc(190) float local190 = (float) (1.0D / Math.sqrt((double) (local169 * local169 + local155 * local155 + local141 * local141))) * (float) local49.anInt8335;
				@Pc(195) Class17_Sub2 local195 = this.aClass95_Sub1_11.method8119();
				local195.method5849(local169 - local190 * local169, local49.aShort80 * local54.anInt4814 >> 7, local49.aShort79 * local54.anInt4812 >> 7, local54.anInt4808, local155 + (float) local54.anInt4810 - local190 * local155, (float) local54.anInt4816 + local141 - local190 * local141);
				local195.method5850(this.aClass95_Sub1_11.aClass17_Sub2_17);
				this.aClass95_Sub1_11.method8098();
				@Pc(251) int local251 = local54.anInt4815;
				this.aClass95_Sub1_11.method8118(false, local49.aShort78, false);
				this.aClass95_Sub1_11.method8162(local49.aByte121);
				this.aClass95_Sub1_11.method8078(local251);
				this.aClass95_Sub1_11.method8176();
			}
		}
		this.aClass95_Sub1_11.method8122(Static383.aClass235_2, 1);
		this.aClass95_Sub1_11.method8108(1, Static383.aClass235_2);
		this.aClass95_Sub1_11.C(true);
	}

	@OriginalMember(owner = "client!hm", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class94.anIntArray561[arg0];
		@Pc(13) int local13 = Class94.anIntArray560[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4077; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray220[local15] + local9 * this.anIntArray221[local15] >> 14;
			this.anIntArray221[local15] = this.anIntArray221[local15] * local13 - this.anIntArray220[local15] * local9 >> 14;
			this.anIntArray220[local15] = local33;
		}
		this.method3483();
		this.aBoolean270 = false;
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "()V")
	@Override
	protected void method8859() {
	}

	@OriginalMember(owner = "client!hm", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4077; local3++) {
			if (arg0 != 128) {
				this.anIntArray220[local3] = this.anIntArray220[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray221[local3] = arg1 * this.anIntArray221[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray226[local3] = arg2 * this.anIntArray226[local3] >> 7;
			}
		}
		this.method3483();
		this.aBoolean270 = false;
	}

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean272;
	}

	@OriginalMember(owner = "client!hm", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean270) {
			this.method3477();
		}
		return this.anInt4029;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8847(@OriginalArg(0) Class149 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class149_Sub1 local8 = (Class149_Sub1) arg0;
		if (this.anInt4056 == 0 || local8.anInt4056 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt4077;
		@Pc(27) int[] local27 = local8.anIntArray220;
		@Pc(30) int[] local30 = local8.anIntArray221;
		@Pc(33) int[] local33 = local8.anIntArray226;
		@Pc(36) short[] local36 = local8.aShortArray56;
		@Pc(39) short[] local39 = local8.aShortArray47;
		@Pc(42) short[] local42 = local8.aShortArray49;
		@Pc(45) byte[] local45 = local8.aByteArray34;
		@Pc(52) short[] local52;
		@Pc(60) short[] local60;
		@Pc(56) short[] local56;
		@Pc(64) byte[] local64;
		if (this.aClass50_1 == null) {
			local64 = null;
			local56 = null;
			local52 = null;
			local60 = null;
		} else {
			local52 = this.aClass50_1.aShortArray19;
			local56 = this.aClass50_1.aShortArray18;
			local60 = this.aClass50_1.aShortArray17;
			local64 = this.aClass50_1.aByteArray8;
		}
		@Pc(85) short[] local85;
		@Pc(79) short[] local79;
		@Pc(81) short[] local81;
		@Pc(83) byte[] local83;
		if (local8.aClass50_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local81 = local8.aClass50_1.aShortArray18;
			local85 = local8.aClass50_1.aShortArray19;
			local79 = local8.aClass50_1.aShortArray17;
			local83 = local8.aClass50_1.aByteArray8;
		}
		@Pc(106) int[] local106 = local8.anIntArray222;
		@Pc(109) short[] local109 = local8.aShortArray55;
		if (!local8.aBoolean270) {
			local8.method3477();
		}
		@Pc(118) int local118 = local8.anInt4053;
		@Pc(121) int local121 = local8.anInt4027;
		@Pc(124) int local124 = local8.anInt4029;
		@Pc(127) int local127 = local8.anInt4031;
		@Pc(130) int local130 = local8.anInt4049;
		@Pc(133) int local133 = local8.anInt4088;
		for (@Pc(135) int local135 = 0; local135 < this.anInt4077; local135++) {
			@Pc(145) int local145 = this.anIntArray221[local135] - arg2;
			if (local145 >= local118 && local145 <= local121) {
				@Pc(161) int local161 = this.anIntArray220[local135] - arg1;
				if (local161 >= local124 && local161 <= local127) {
					@Pc(185) int local185 = this.anIntArray226[local135] - arg3;
					if (local185 >= local130 && local185 <= local133) {
						@Pc(199) int local199 = -1;
						@Pc(204) int local204 = this.anIntArray222[local135];
						@Pc(211) int local211 = this.anIntArray222[local135 + 1];
						for (@Pc(213) int local213 = local204; local213 < local211; local213++) {
							local199 = this.aShortArray55[local213] - 1;
							if (local199 == -1 || this.aByteArray34[local199] != 0) {
								break;
							}
						}
						if (local199 != -1) {
							for (@Pc(243) int local243 = 0; local243 < local24; local243++) {
								if (local161 == local27[local243] && local185 == local33[local243] && local30[local243] == local145) {
									local204 = local106[local243];
									local211 = local106[local243 + 1];
									@Pc(272) int local272 = -1;
									for (@Pc(274) int local274 = local204; local274 < local211; local274++) {
										local272 = local109[local274] - 1;
										if (local272 == -1 || local45[local272] != 0) {
											break;
										}
									}
									if (local272 != -1) {
										if (local52 == null) {
											this.aClass50_1 = new Class50();
											local52 = this.aClass50_1.aShortArray19 = Static65.method1162(this.aShortArray56);
											local60 = this.aClass50_1.aShortArray17 = Static65.method1162(this.aShortArray47);
											local56 = this.aClass50_1.aShortArray18 = Static65.method1162(this.aShortArray49);
											local64 = this.aClass50_1.aByteArray8 = Static170.method2690(this.aByteArray34);
										}
										if (local85 == null) {
											@Pc(355) Class50 local355 = local8.aClass50_1 = new Class50();
											local85 = local355.aShortArray19 = Static65.method1162(local36);
											local79 = local355.aShortArray17 = Static65.method1162(local39);
											local81 = local355.aShortArray18 = Static65.method1162(local42);
											local83 = local355.aByteArray8 = Static170.method2690(local45);
										}
										@Pc(388) short local388 = this.aShortArray56[local199];
										@Pc(393) short local393 = this.aShortArray47[local199];
										@Pc(398) short local398 = this.aShortArray49[local199];
										local211 = local106[local243 + 1];
										@Pc(409) byte local409 = this.aByteArray34[local199];
										local204 = local106[local243];
										@Pc(423) int local423;
										for (@Pc(415) int local415 = local204; local415 < local211; local415++) {
											local423 = local109[local415] - 1;
											if (local423 == -1) {
												break;
											}
											if (local83[local423] != 0) {
												local85[local423] += local388;
												local79[local423] += local393;
												local81[local423] += local398;
												local83[local423] += local409;
											}
										}
										local393 = local39[local272];
										local388 = local36[local272];
										local211 = this.anIntArray222[local135 + 1];
										local409 = local45[local272];
										local398 = local42[local272];
										local204 = this.anIntArray222[local135];
										for (local423 = local204; local423 < local211; local423++) {
											@Pc(506) int local506 = this.aShortArray55[local423] - 1;
											if (local506 == -1) {
												break;
											}
											if (local64[local506] != 0) {
												local52[local506] += local388;
												local60[local506] += local393;
												local56[local506] += local398;
												local64[local506] += local409;
											}
										}
										local8.method3475();
										this.method3475();
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
