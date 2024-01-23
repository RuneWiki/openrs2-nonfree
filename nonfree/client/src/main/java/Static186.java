import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "[I")
	public static int[] anIntArray702;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	public static int anInt4337 = 0;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "Lclient!wc;")
	public static Class110 aClass110_21 = new Class110(64);

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
	public static int anInt4341 = -1;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Z")
	public static boolean method3430(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIZLclient!mj;)V")
	public static void method3431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class64 arg6) {
		if (Static169.aBoolean169) {
			Static95.anInt2100 = 32;
		} else {
			Static95.anInt2100 = 0;
		}
		Static169.aBoolean169 = false;
		@Pc(121) int local121;
		if (Static78.anInt1709 != 0) {
			if (arg4 >= arg0 && arg4 < arg0 + 16 && arg3 >= arg1 && arg3 < arg1 + 16) {
				arg6.anInt3046 -= 4;
				Static70.method2259(arg6);
			} else if (arg4 >= arg0 && arg0 + 16 > arg4 && arg1 + arg2 - 16 <= arg3 && arg3 < arg1 + arg2) {
				arg6.anInt3046 += 4;
				Static70.method2259(arg6);
			} else if (arg4 >= arg0 - Static95.anInt2100 && arg4 < arg0 + Static95.anInt2100 + 16 && arg1 + 16 <= arg3 && arg3 < arg2 + arg1 - 16) {
				local121 = arg2 * (arg2 - 32) / arg5;
				if (local121 < 8) {
					local121 = 8;
				}
				@Pc(140) int local140 = arg3 - arg1 - local121 / 2 - 16;
				@Pc(146) int local146 = arg2 - local121 - 32;
				arg6.anInt3046 = local140 * (arg5 - arg2) / local146;
				Static70.method2259(arg6);
				Static169.aBoolean169 = true;
			}
		}
		if (Static148.anInt3392 == 0) {
			return;
		}
		local121 = arg6.anInt3021;
		if (arg4 >= arg0 - local121 && arg3 >= arg1 && arg4 < arg0 + 16 && arg3 <= arg2 + arg1) {
			arg6.anInt3046 += Static148.anInt3392 * 45;
			Static70.method2259(arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public static void method3432() {
		Static65.aClass65_1.anInt3089 = 0;
		Static130.aBoolean119 = true;
		Static187.aLong159 = 0L;
		Static224.aBoolean211 = true;
		Static158.anInt3655 = 1;
		Static106.anInt2313 = 0;
		Static146.method2588();
		Static21.anInt401 = -1;
		Static216.anInt4727 = 0;
		Static181.anInt4200 = -1;
		Static58.anInt1022 = 0;
		Static2.anInt44 = 0;
		Static200.anInt4496 = -1;
		Static189.anInt4412 = -1;
		Static161.aClass2_Sub23_Sub1_5.anInt2703 = 0;
		Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
		for (@Pc(2882) int local2882 = 0; local2882 < Static216.aClass19Array1.length; local2882++) {
			Static216.aClass19Array1[local2882] = null;
		}
		Static202.aBoolean194 = false;
		Static138.anInt3182 = 0;
		Static7.method156(0);
		for (@Pc(2912) int local2912 = 0; local2912 < 100; local2912++) {
			Static155.aClass78Array26[local2912] = null;
		}
		Static121.anInt4906 = 0;
		Static226.anInt4901 = (int) (Math.random() * 110.0D) - 55;
		Static90.anInt2013 = (int) (Math.random() * 120.0D) - 60;
		Static140.anInt3197 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static62.anInt1225 = (int) (Math.random() * 30.0D) - 20;
		Static224.anInt4848 = 0;
		Static152.anInt3520 = 0;
		Static143.anInt3258 = 0;
		Static66.anInt1316 = 0;
		Static33.anInt573 = (int) (Math.random() * 100.0D) - 50;
		Static178.anInt4142 = (int) (Math.random() * 80.0D) - 40;
		Static66.anInt1313 = -1;
		Static125.aBoolean60 = false;
		Static50.anInt908 = 0;
		Static8.anInt268 = 0;
		Static180.anInt4193 = 0;
		for (@Pc(2990) int local2990 = 0; local2990 < 2048; local2990++) {
			Static213.aClass5_Sub2_Sub2Array3[local2990] = null;
			Static95.aClass2_Sub23Array1[local2990] = null;
		}
		for (@Pc(3008) int local3008 = 0; local3008 < 32768; local3008++) {
			Static95.aClass5_Sub2_Sub1Array1[local3008] = null;
		}
		Static31.aClass5_Sub2_Sub2_1 = Static213.aClass5_Sub2_Sub2Array3[2047] = new Class5_Sub2_Sub2();
		Static225.aClass44_62.method1362();
		Static95.aClass44_21.method1362();
		@Pc(3038) int local3038;
		for (@Pc(3034) int local3034 = 0; local3034 < 4; local3034++) {
			for (local3038 = 0; local3038 < 104; local3038++) {
				for (@Pc(3042) int local3042 = 0; local3042 < 104; local3042++) {
					Static1.aClass44ArrayArrayArray1[local3034][local3038][local3042] = null;
				}
			}
		}
		Static165.aClass44_44 = new Class44();
		Static99.anInt2152 = 0;
		Static140.anInt3196 = 0;
		Static178.method3272();
		Static144.method2569();
		Static33.anInt571 = 0;
		Static49.anInt903 = 0;
		Static211.anInt4652 = 0;
		Static59.anInt1032 = 0;
		Static5.anInt142 = 0;
		Static73.anInt1578 = 0;
		Static81.anInt1738 = 0;
		Static106.anInt2312 = 0;
		Static198.anInt4484 = 0;
		Static196.anInt4471 = 0;
		for (local3038 = 0; local3038 < Static171.anIntArray652.length; local3038++) {
			Static171.anIntArray652[local3038] = -1;
		}
		if (Static166.anInt1143 != -1) {
			Static99.method1696(Static166.anInt1143);
		}
		for (@Pc(3129) Class2_Sub11 local3129 = (Class2_Sub11) Static12.aClass103_4.method3668(); local3129 != null; local3129 = (Class2_Sub11) Static12.aClass103_4.method3666()) {
			Static209.method3065(local3129, true);
		}
		Static166.anInt1143 = -1;
		Static12.aClass103_4 = new Class103(8);
		Static202.aBoolean194 = false;
		Static138.anInt3182 = 0;
		Static119.aClass64_9 = null;
		Static106.aClass112_2.method3941(false, -1, new int[5], null);
		for (@Pc(3165) int local3165 = 0; local3165 < 8; local3165++) {
			Static80.aClass78Array16[local3165] = null;
			Static15.aBooleanArray11[local3165] = false;
		}
		Static20.method285();
		Static183.aBoolean184 = true;
		for (@Pc(3185) int local3185 = 0; local3185 < 100; local3185++) {
			Static165.aBooleanArray111[local3185] = true;
		}
		Static77.anInt1688 = 0;
		Static130.aClass78_583 = null;
		Static146.aClass2_Sub10Array1 = null;
		for (@Pc(3203) int local3203 = 0; local3203 < 6; local3203++) {
			Static45.aClass29Array1[local3203] = new Class29();
		}
		for (@Pc(3219) int local3219 = 0; local3219 < 25; local3219++) {
			Static72.anIntArray745[local3219] = 0;
			Static41.anIntArray129[local3219] = 0;
			Static220.anIntArray772[local3219] = 0;
		}
		Static139.aBoolean112 = false;
		Static111.aShortArray76 = Static64.aShortArray39 = Static2.aShortArray3 = Static119.aShortArray84 = new short[256];
		Static52.aBoolean35 = true;
		Static85.aClass78_427 = Static97.aClass78_468;
		Static159.aClass44_50.method1362();
	}
}
