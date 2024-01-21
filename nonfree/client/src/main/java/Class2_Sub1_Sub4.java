import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
	public int anInt1030;

	@OriginalMember(owner = "client!ge", name = "hb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!ge", name = "ob", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!ge", name = "zb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!ge", name = "Pb", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!ge", name = "Ub", descriptor = "[I")
	public int[] anIntArray103;

	@OriginalMember(owner = "client!ge", name = "Zb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!ge", name = "dc", descriptor = "[I")
	public int[] anIntArray105;

	@OriginalMember(owner = "client!ge", name = "ec", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
	public int anInt1036 = 1;

	@OriginalMember(owner = "client!ge", name = "tb", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!ge", name = "vb", descriptor = "I")
	public int anInt1048 = 2;

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
	private int anInt1028 = 0;

	@OriginalMember(owner = "client!ge", name = "kb", descriptor = "I")
	public int anInt1042 = -1;

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
	private int anInt1029 = 0;

	@OriginalMember(owner = "client!ge", name = "Kb", descriptor = "I")
	public int anInt1056 = -1;

	@OriginalMember(owner = "client!ge", name = "ib", descriptor = "I")
	public int anInt1040 = -1;

	@OriginalMember(owner = "client!ge", name = "Hb", descriptor = "I")
	public int anInt1054 = 16;

	@OriginalMember(owner = "client!ge", name = "pb", descriptor = "I")
	public int anInt1046 = -1;

	@OriginalMember(owner = "client!ge", name = "Eb", descriptor = "I")
	public int anInt1052 = -1;

	@OriginalMember(owner = "client!ge", name = "rb", descriptor = "Lclient!je;")
	public Class40 aClass40_551 = Static100.aClass40_1315;

	@OriginalMember(owner = "client!ge", name = "sb", descriptor = "I")
	private int anInt1047 = 0;

	@OriginalMember(owner = "client!ge", name = "Tb", descriptor = "Z")
	public boolean aBoolean73 = true;

	@OriginalMember(owner = "client!ge", name = "Xb", descriptor = "I")
	private int anInt1062 = 128;

	@OriginalMember(owner = "client!ge", name = "Yb", descriptor = "I")
	private int anInt1063 = -1;

	@OriginalMember(owner = "client!ge", name = "Qb", descriptor = "I")
	private int anInt1060 = -1;

	@OriginalMember(owner = "client!ge", name = "Fb", descriptor = "I")
	private int anInt1053 = 0;

	@OriginalMember(owner = "client!ge", name = "cc", descriptor = "I")
	public int anInt1064 = 0;

	@OriginalMember(owner = "client!ge", name = "Vb", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!ge", name = "nb", descriptor = "I")
	private int anInt1045 = 0;

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
	private int anInt1031 = -1;

	@OriginalMember(owner = "client!ge", name = "ub", descriptor = "[Lclient!je;")
	public final Class40[] aClass40Array3 = new Class40[5];

	@OriginalMember(owner = "client!ge", name = "Gb", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!ge", name = "db", descriptor = "I")
	private int anInt1037 = 128;

	@OriginalMember(owner = "client!ge", name = "Jb", descriptor = "I")
	public int anInt1055 = 0;

	@OriginalMember(owner = "client!ge", name = "hc", descriptor = "I")
	public int anInt1067 = -1;

	@OriginalMember(owner = "client!ge", name = "Cb", descriptor = "I")
	private int anInt1050 = 128;

	@OriginalMember(owner = "client!ge", name = "bc", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!ge", name = "jc", descriptor = "Z")
	public boolean aBoolean77 = true;

	@OriginalMember(owner = "client!ge", name = "Rb", descriptor = "I")
	public int anInt1061 = 0;

	@OriginalMember(owner = "client!ge", name = "ac", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!ge", name = "gc", descriptor = "I")
	public int anInt1066 = 1;

	@OriginalMember(owner = "client!ge", name = "kc", descriptor = "I")
	public int anInt1069 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!nc;II[[IIIBII)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method699(@OriginalArg(0) Class2_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) long local17;
		if (this.anIntArray101 == null) {
			local17 = (this.anInt1030 << 10) + arg7;
		} else {
			local17 = (this.anInt1030 << 10) - (-(arg4 << 3) - arg7);
		}
		@Pc(44) Class2_Sub1_Sub1_Sub2 local44 = (Class2_Sub1_Sub1_Sub2) Static15.aClass55_16.method1410(local17);
		if (local44 == null) {
			@Pc(52) Class2_Sub1_Sub1_Sub7 local52 = this.method704(arg4, arg7);
			if (local52 == null) {
				return null;
			}
			local44 = local52.method2176(this.anInt1028 + 64, this.anInt1045 * 5 + 768, -50, -10, -50);
			Static15.aClass55_16.method1411(local17, local44);
		}
		if (arg0 == null && this.anInt1031 == -1) {
			return local44;
		}
		if (arg0 == null) {
			local44 = local44.method116(true);
		} else {
			local44 = arg0.method1270(arg6, arg7, local44);
		}
		if (this.anInt1031 >= 0) {
			local44 = local44.method125(arg3, arg2, arg5, arg1, false, this.anInt1031);
		}
		return local44;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIB[[II)Lclient!pa;")
	public Class2_Sub1_Sub1 method700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(21) long local21;
		if (this.anIntArray101 == null) {
			local21 = arg5 + (this.anInt1030 << 10);
		} else {
			local21 = (arg3 << 3) + (this.anInt1030 << 10) + arg5;
		}
		@Pc(37) Class2_Sub1_Sub1 local37 = (Class2_Sub1_Sub1) Static116.aClass55_81.method1410(local21);
		if (local37 == null) {
			@Pc(45) Class2_Sub1_Sub1_Sub7 local45 = this.method704(arg3, arg5);
			if (local45 == null) {
				return null;
			}
			if (this.aBoolean75) {
				local45.aShort2 = (short) (this.anInt1028 + 64);
				local45.aShort1 = (short) (this.anInt1045 * 5 + 768);
				local45.method2186();
				local37 = local45;
			} else {
				local37 = local45.method2176(this.anInt1028 + 64, this.anInt1045 * 5 + 768, -50, -10, -50);
			}
			Static116.aClass55_81.method1411(local21, local37);
		}
		if (this.aBoolean75) {
			local37 = ((Class2_Sub1_Sub1_Sub7) local37).method2192();
		}
		if (this.anInt1031 >= 0) {
			if (local37 instanceof Class2_Sub1_Sub1_Sub2) {
				local37 = ((Class2_Sub1_Sub1_Sub2) local37).method125(arg4, arg0, arg1, arg2, true, this.anInt1031);
			} else if (local37 instanceof Class2_Sub1_Sub1_Sub7) {
				local37 = ((Class2_Sub1_Sub1_Sub7) local37).method2173(arg4, arg0, arg1, arg2, this.anInt1031);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z")
	public boolean method701(@OriginalArg(0) int arg0) {
		if (this.anIntArray101 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray101.length; local15++) {
				if (this.anIntArray101[local15] == arg0) {
					return Static69.aClass24_22.method1924(this.anIntArray102[local15] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray102 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(56) boolean local56 = true;
			for (@Pc(58) int local58 = 0; local58 < this.anIntArray102.length; local58++) {
				local56 &= Static69.aClass24_22.method1924(this.anIntArray102[local58] & 0xFFFF, 0);
			}
			return local56;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII[[III)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5) {
		@Pc(14) long local14;
		if (this.anIntArray101 == null) {
			local14 = (this.anInt1030 << 10) + arg5;
		} else {
			local14 = (this.anInt1030 << 10) + (arg3 << 3) + arg5;
		}
		@Pc(34) Class2_Sub1_Sub1_Sub2 local34 = (Class2_Sub1_Sub1_Sub2) Static15.aClass55_16.method1410(local14);
		if (local34 == null) {
			@Pc(42) Class2_Sub1_Sub1_Sub7 local42 = this.method704(arg3, arg5);
			if (local42 == null) {
				return null;
			}
			local34 = local42.method2176(this.anInt1028 + 64, this.anInt1045 * 5 + 768, -50, -10, -50);
			Static15.aClass55_16.method1411(local14, local34);
		}
		if (this.anInt1031 >= 0) {
			local34 = local34.method125(arg4, arg2, arg0, arg1, true, this.anInt1031);
		}
		return local34;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)Z")
	public boolean method703() {
		if (this.anIntArray103 == null) {
			return this.anInt1046 != -1 || this.anIntArray105 != null;
		}
		for (@Pc(26) int local26 = 0; local26 < this.anIntArray103.length; local26++) {
			if (this.anIntArray103[local26] != -1) {
				@Pc(42) Class2_Sub1_Sub4 local42 = Static107.method1839(this.anIntArray103[local26]);
				if (local42.anInt1046 != -1 || local42.anIntArray105 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)Lclient!wc;")
	private Class2_Sub1_Sub1_Sub7 method704(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub1_Sub1_Sub7 local7 = null;
		@Pc(25) boolean local25;
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(53) int local53;
		if (this.anIntArray101 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray102 == null) {
				return null;
			}
			local25 = this.aBoolean76;
			if (arg0 == 2 && arg1 > 3) {
				local25 = !local25;
			}
			local45 = this.anIntArray102.length;
			for (local47 = 0; local47 < local45; local47++) {
				local53 = this.anIntArray102[local47];
				if (local25) {
					local53 += 65536;
				}
				local7 = (Class2_Sub1_Sub1_Sub7) Static88.aClass55_70.method1410((long) local53);
				if (local7 == null) {
					local7 = Static131.method2175(Static69.aClass24_22, local53 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local25) {
						local7.method2178();
					}
					Static88.aClass55_70.method1411((long) local53, local7);
				}
				if (local45 > 1) {
					Static62.aClass2_Sub1_Sub1_Sub7Array1[local47] = local7;
				}
			}
			if (local45 > 1) {
				local7 = new Class2_Sub1_Sub1_Sub7(Static62.aClass2_Sub1_Sub1_Sub7Array1, local45);
			}
		} else {
			@Pc(116) int local116 = -1;
			for (local45 = 0; local45 < this.anIntArray101.length; local45++) {
				if (arg0 == this.anIntArray101[local45]) {
					local116 = local45;
					break;
				}
			}
			if (local116 == -1) {
				return null;
			}
			local47 = this.anIntArray102[local116];
			@Pc(166) boolean local166 = arg1 > 3 ^ this.aBoolean76;
			if (local166) {
				local47 += 65536;
			}
			local7 = (Class2_Sub1_Sub1_Sub7) Static88.aClass55_70.method1410((long) local47);
			if (local7 == null) {
				local7 = Static131.method2175(Static69.aClass24_22, local47 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local166) {
					local7.method2178();
				}
				Static88.aClass55_70.method1411((long) local47, local7);
			}
		}
		if (this.anInt1050 == 128 && this.anInt1037 == 128 && this.anInt1062 == 128) {
			local25 = false;
		} else {
			local25 = true;
		}
		@Pc(241) boolean local241;
		if (this.anInt1053 == 0 && this.anInt1047 == 0 && this.anInt1029 == 0) {
			local241 = false;
		} else {
			local241 = true;
		}
		@Pc(272) Class2_Sub1_Sub1_Sub7 local272 = new Class2_Sub1_Sub1_Sub7(local7, arg1 == 0 && !local25 && !local241, this.aShortArray8 == null, this.aShortArray9 == null, true);
		if (arg0 == 4 && arg1 > 3) {
			local272.method2183();
			local272.method2195(45, 0, -45);
		}
		@Pc(294) int local294 = arg1 & 0x3;
		if (local294 == 1) {
			local272.method2188();
		} else if (local294 == 2) {
			local272.method2182();
		} else if (local294 == 3) {
			local272.method2180();
		}
		if (this.aShortArray8 != null) {
			for (local53 = 0; local53 < this.aShortArray8.length; local53++) {
				local272.method2184(this.aShortArray8[local53], this.aShortArray7[local53]);
			}
		}
		if (this.aShortArray9 != null) {
			for (local53 = 0; local53 < this.aShortArray9.length; local53++) {
				local272.method2191(this.aShortArray9[local53], this.aShortArray6[local53]);
			}
		}
		if (local25) {
			local272.method2181(this.anInt1050, this.anInt1037, this.anInt1062);
		}
		if (local241) {
			local272.method2195(this.anInt1053, this.anInt1047, this.anInt1029);
		}
		return local272;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Lclient!ge;")
	public Class2_Sub1_Sub4 method705() {
		@Pc(5) int local5 = -1;
		if (this.anInt1063 != -1) {
			local5 = Static49.method881(this.anInt1063);
		} else if (this.anInt1060 != -1) {
			local5 = Static35.anIntArray96[this.anInt1060];
		}
		return local5 < 0 || local5 >= this.anIntArray103.length || this.anIntArray103[local5] == -1 ? null : Static107.method1839(this.anIntArray103[local5]);
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
	public void method707() {
		if (this.anInt1067 == -1) {
			this.anInt1067 = 0;
			if (this.anIntArray102 != null && (this.anIntArray101 == null || this.anIntArray101[0] == 10)) {
				this.anInt1067 = 1;
			}
			for (@Pc(28) int local28 = 0; local28 < 5; local28++) {
				if (this.aClass40Array3[local28] != null) {
					this.anInt1067 = 1;
				}
			}
		}
		if (this.anInt1042 == -1) {
			this.anInt1042 = this.anInt1048 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!na;II)V")
	private void method708(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(1) int arg1) {
		@Pc(132) int local132;
		@Pc(142) int local142;
		if (arg1 == 1) {
			local132 = arg0.method640();
			if (local132 > 0) {
				if (this.anIntArray102 == null || Static37.aBoolean67) {
					this.anIntArray102 = new int[local132];
					this.anIntArray101 = new int[local132];
					for (local142 = 0; local142 < local132; local142++) {
						this.anIntArray102[local142] = arg0.method632();
						this.anIntArray101[local142] = arg0.method640();
					}
				} else {
					arg0.anInt976 += local132 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass40_551 = arg0.method625();
		} else if (arg1 == 5) {
			local132 = arg0.method640();
			if (local132 > 0) {
				if (this.anIntArray102 == null || Static37.aBoolean67) {
					this.anIntArray101 = null;
					this.anIntArray102 = new int[local132];
					for (local142 = 0; local142 < local132; local142++) {
						this.anIntArray102[local142] = arg0.method632();
					}
				} else {
					arg0.anInt976 += local132 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt1036 = arg0.method640();
		} else if (arg1 == 15) {
			this.anInt1066 = arg0.method640();
		} else if (arg1 == 17) {
			this.aBoolean73 = false;
			this.anInt1048 = 0;
		} else if (arg1 == 18) {
			this.aBoolean73 = false;
		} else if (arg1 == 19) {
			this.anInt1067 = arg0.method640();
		} else if (arg1 == 21) {
			this.anInt1031 = 0;
		} else if (arg1 == 22) {
			this.aBoolean75 = true;
		} else if (arg1 == 23) {
			this.aBoolean72 = true;
		} else if (arg1 == 24) {
			this.anInt1052 = arg0.method632();
			if (this.anInt1052 == 65535) {
				this.anInt1052 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt1048 = 1;
		} else if (arg1 == 28) {
			this.anInt1054 = arg0.method640();
		} else if (arg1 == 29) {
			this.anInt1028 = arg0.method658();
		} else if (arg1 == 39) {
			this.anInt1045 = arg0.method658() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass40Array3[arg1 - 30] = arg0.method625();
			if (this.aClass40Array3[arg1 - 30].method984(Static133.aClass40_1647)) {
				this.aClass40Array3[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local132 = arg0.method640();
			this.aShortArray7 = new short[local132];
			this.aShortArray8 = new short[local132];
			for (local142 = 0; local142 < local132; local142++) {
				this.aShortArray8[local142] = (short) arg0.method632();
				this.aShortArray7[local142] = (short) arg0.method632();
			}
		} else if (arg1 == 41) {
			local132 = arg0.method640();
			this.aShortArray9 = new short[local132];
			this.aShortArray6 = new short[local132];
			for (local142 = 0; local142 < local132; local142++) {
				this.aShortArray9[local142] = (short) arg0.method632();
				this.aShortArray6[local142] = (short) arg0.method632();
			}
		} else if (arg1 == 60) {
			this.anInt1040 = arg0.method632();
		} else if (arg1 == 62) {
			this.aBoolean76 = true;
		} else if (arg1 == 64) {
			this.aBoolean77 = false;
		} else if (arg1 == 65) {
			this.anInt1050 = arg0.method632();
		} else if (arg1 == 66) {
			this.anInt1037 = arg0.method632();
		} else if (arg1 == 67) {
			this.anInt1062 = arg0.method632();
		} else if (arg1 == 68) {
			this.anInt1056 = arg0.method632();
		} else if (arg1 == 69) {
			this.anInt1055 = arg0.method640();
		} else if (arg1 == 70) {
			this.anInt1053 = arg0.method666();
		} else if (arg1 == 71) {
			this.anInt1047 = arg0.method666();
		} else if (arg1 == 72) {
			this.anInt1029 = arg0.method666();
		} else if (arg1 == 73) {
			this.aBoolean71 = true;
		} else if (arg1 == 74) {
			this.aBoolean74 = true;
		} else if (arg1 == 75) {
			this.anInt1042 = arg0.method640();
		} else if (arg1 == 77) {
			this.anInt1063 = arg0.method632();
			if (this.anInt1063 == 65535) {
				this.anInt1063 = -1;
			}
			this.anInt1060 = arg0.method632();
			if (this.anInt1060 == 65535) {
				this.anInt1060 = -1;
			}
			local132 = arg0.method640();
			this.anIntArray103 = new int[local132 + 1];
			for (local142 = 0; local142 <= local132; local142++) {
				this.anIntArray103[local142] = arg0.method632();
				if (this.anIntArray103[local142] == 65535) {
					this.anIntArray103[local142] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt1046 = arg0.method632();
			this.anInt1069 = arg0.method640();
		} else if (arg1 == 79) {
			this.anInt1064 = arg0.method632();
			this.anInt1061 = arg0.method632();
			this.anInt1069 = arg0.method640();
			local132 = arg0.method640();
			this.anIntArray105 = new int[local132];
			for (local142 = 0; local142 < local132; local142++) {
				this.anIntArray105[local142] = arg0.method632();
			}
		} else if (arg1 == 81) {
			this.anInt1031 = arg0.method640() * 256;
		}
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)Z")
	public boolean method711() {
		if (this.anIntArray102 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray102.length; local19++) {
			local17 &= Static69.aClass24_22.method1924(this.anIntArray102[local19] & 0xFFFF, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!na;B)V")
	public void method712(@OriginalArg(0) Class2_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method640();
			if (local9 == 0) {
				return;
			}
			this.method708(arg0, local9);
		}
	}
}
