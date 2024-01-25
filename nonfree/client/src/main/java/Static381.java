import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "[Lclient!rl;")
	public static Class12_Sub1_Sub1_Sub1[] aClass12_Sub1_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!kj;")
	public static Class133 aClass133_10;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_95 = new Class244(59, -1);

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_96 = new Class244(64, -1);

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "[I")
	public static final int[] anIntArray698 = new int[14];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!np;Z)V")
	public static void method5664(@OriginalArg(0) Class155 arg0) {
		if (Static105.anInt2076 < 2 && !Static68.aBoolean81 || Static313.aClass62_18 != null) {
			return;
		}
		@Pc(38) String local38;
		if (Static68.aBoolean81 && Static105.anInt2076 < 2) {
			local38 = Static208.aString38 + Static326.aClass57_81.method1122(Static66.anInt1307) + Static356.aString8 + " ->";
		} else if (Static282.aBoolean391 && Static322.aClass89_25.method1847(81) && Static105.anInt2076 > 2) {
			local38 = Static380.method5624((Class3_Sub4) Static47.aClass138_7.aClass3_137.aClass3_244.aClass3_244);
		} else {
			@Pc(45) Class3_Sub4 local45 = (Class3_Sub4) Static47.aClass138_7.aClass3_137.aClass3_244;
			local38 = Static380.method5624(local45);
			@Pc(51) int[] local51 = null;
			if (Static336.method1972(local45.anInt808)) {
				local51 = Static176.aClass78_3.method1641((int) local45.aLong17).anIntArray103;
			} else if (local45.anInt809 != -1) {
				local51 = Static176.aClass78_3.method1641(local45.anInt809).anIntArray103;
			} else if (Static325.method5003(local45.anInt808)) {
				@Pc(116) Class28_Sub1_Sub1_Sub1 local116 = Static166.aClass28_Sub1_Sub1_Sub1Array41[(int) local45.aLong17];
				if (local116 != null) {
					@Pc(121) Class61 local121 = local116.aClass61_1;
					if (local121.anIntArray142 != null) {
						local121 = local121.method1216(Static331.aClass115_1);
					}
					if (local121 != null) {
						local51 = local121.anIntArray144;
					}
				}
			} else if (Static248.method4059(local45.anInt808)) {
				@Pc(88) Class60 local88;
				if (local45.anInt808 == 1007) {
					local88 = Static97.aClass217_4.method5007((int) local45.aLong17);
				} else {
					local88 = Static97.aClass217_4.method5007((int) (local45.aLong17 >>> 32 & 0x7FFFFFFFL));
				}
				if (local88.anIntArray134 != null) {
					local88 = local88.method1191(Static331.aClass115_1);
				}
				if (local88 != null) {
					local51 = local88.anIntArray136;
				}
			}
			if (local51 != null) {
				local38 = local38 + Static131.method2067(local51);
			}
		}
		if (Static105.anInt2076 > 2) {
			local38 = local38 + "<col=ffffff> / " + (Static105.anInt2076 - 2) + Static19.aClass57_7.method1122(Static66.anInt1307);
		}
		if (Static188.aClass62_12 != null) {
			@Pc(250) Class150 local250 = Static188.aClass62_12.method1291(arg0);
			if (local250 == null) {
				local250 = Static95.aClass150_6;
			}
			local250.method5732(Static188.aClass62_12.anInt1509, Static165.aRandom1, Static72.anIntArray141, Static371.aClass110Array14, Static156.anInt2803, Static188.aClass62_12.anInt1577, Static355.anInt5980, Static188.aClass62_12.anInt1551, Static172.anInt3651, Static188.aClass62_12.anInt1536, Static188.aClass62_12.anInt1546, Static188.aClass62_12.anInt1542, local38, Static303.anIntArray582);
			Static203.method3170(Static303.anIntArray582[1], Static303.anIntArray582[0], Static303.anIntArray582[2], Static303.anIntArray582[3]);
		} else if (Static221.aClass62_13 != null && Static121.aClass63_2 == Static17.aClass63_1) {
			@Pc(229) int local229 = Static95.aClass150_6.method5737(Static355.anInt5980, Static110.anInt2157 + 4, Static103.anInt2048 + 16, Static165.aRandom1, Static371.aClass110Array14, local38, Static72.anIntArray141);
			Static203.method3170(Static103.anInt2048, Static110.anInt2157 + 4, Static366.aClass190_7.method4358(local38) - -local229, 16);
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)V")
	public static void method5665() {
		if (Static275.aClass119_2 != null) {
			Static275.aClass119_2.method4981();
		}
		if (Static25.aClass119_1 != null) {
			Static25.aClass119_1.method4981();
		}
	}
}
