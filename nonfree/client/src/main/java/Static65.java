import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!db", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public static int anInt1188;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_27 = new Class254(5, 6);

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Lclient!ti;B)Lclient!df;")
	public static Class55 method976(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(13) Class55 local13 = new Class55();
		local13.anInt1238 = arg0.method4498();
		local13.aClass1_Sub1_Sub5_1 = Static42.aClass228_5.method5369(local13.anInt1238);
		return local13;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!tt;")
	public static Class224 method977() {
		try {
			return (Class224) Class.forName("Class224_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
	public static void method978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static224.method3272(Static242.aClass254_95);
		Static201.aClass1_Sub14_Sub2_2.method4508(arg0);
		Static201.aClass1_Sub14_Sub2_2.method4505(arg1);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BB)V")
	public static void method980(@OriginalArg(1) byte arg0) {
		if (Static183.aByteArrayArrayArray7 == null) {
			Static183.aByteArrayArrayArray7 = new byte[4][Static80.anInt6558][Static104.anInt2048];
		}
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			for (@Pc(22) int local22 = 0; local22 < Static80.anInt6558; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static104.anInt2048; local26++) {
					Static183.aByteArrayArrayArray7[local18][local22][local26] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)I")
	public static int method983() {
		try {
			if (Static101.anInt1977 == 0) {
				if (Static382.aLong167 > Static107.method1707() - 5000L) {
					return 0;
				}
				Static265.aClass159_7 = Static403.aClass42_6.method656(Static94.aString34, Static401.anInt7129);
				Static10.aLong216 = Static107.method1707();
				Static101.anInt1977 = 1;
			}
			if (Static10.aLong216 + 30000L < Static107.method1707()) {
				return Static144.method2318(1000);
			}
			@Pc(75) int local75;
			@Pc(105) int local105;
			if (Static101.anInt1977 == 1) {
				if (Static265.aClass159_7.anInt4271 == 2) {
					return Static144.method2318(1001);
				}
				if (Static265.aClass159_7.anInt4271 != 1) {
					return -1;
				}
				Static169.aClass114_4 = new Class114((Socket) Static265.aClass159_7.anObject8, Static403.aClass42_6);
				Static265.aClass159_7 = null;
				local75 = 0;
				Static201.aClass1_Sub14_Sub2_2.anInt5695 = 0;
				if (Static444.aBoolean652) {
					local75 = Static67.anInt1223;
				}
				Static201.aClass1_Sub14_Sub2_2.method4553(Static121.aClass44_9.anInt793);
				Static201.aClass1_Sub14_Sub2_2.method4522(local75);
				Static169.aClass114_4.method2497(Static201.aClass1_Sub14_Sub2_2.anInt5695, Static201.aClass1_Sub14_Sub2_2.aByteArray65);
				Static206.method3160();
				local105 = Static169.aClass114_4.method2499();
				Static206.method3160();
				if (local105 != 0) {
					return Static144.method2318(local105);
				}
				Static101.anInt1977 = 2;
			}
			if (Static101.anInt1977 == 2) {
				if (Static169.aClass114_4.method2495() < 2) {
					return -1;
				}
				Static378.anInt6791 = Static169.aClass114_4.method2499();
				Static378.anInt6791 <<= 0x8;
				Static378.anInt6791 += Static169.aClass114_4.method2499();
				Static86.aByteArray13 = new byte[Static378.anInt6791];
				Static101.anInt1977 = 3;
				Static234.anInt4073 = 0;
			}
			if (Static101.anInt1977 != 3) {
				return -1;
			}
			local75 = Static169.aClass114_4.method2495();
			if (local75 < 1) {
				return -1;
			}
			if (Static378.anInt6791 - Static234.anInt4073 < local75) {
				local75 = Static378.anInt6791 - Static234.anInt4073;
			}
			Static169.aClass114_4.method2493(Static234.anInt4073, Static86.aByteArray13, local75);
			Static234.anInt4073 += local75;
			if (Static234.anInt4073 < Static378.anInt6791) {
				return -1;
			} else if (Static441.method5913(Static86.aByteArray13)) {
				Static4.aClass48_Sub1Array1 = new Class48_Sub1[Static328.anInt5997];
				local105 = 0;
				for (@Pc(216) int local216 = Static343.anInt6245; local216 <= Static231.anInt4052; local216++) {
					@Pc(222) Class48_Sub1 local222 = Static242.method3810(local216);
					if (local222 != null) {
						Static4.aClass48_Sub1Array1[local105++] = local222;
					}
				}
				Static164.anInt2905 = 0;
				Static355.aClass1_Sub4_5 = null;
				Static169.aClass114_4.method2496();
				Static169.aClass114_4 = null;
				Static86.aByteArray13 = null;
				Static101.anInt1977 = 0;
				Static95.anInt1872 = 0;
				Static382.aLong167 = Static107.method1707();
				return 0;
			} else {
				return Static144.method2318(1002);
			}
		} catch (@Pc(258) IOException local258) {
			return Static144.method2318(1003);
		}
	}
}
