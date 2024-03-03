import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "Lclient!ta;")
	public static Class219 aClass219_1;

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)Lclient!nk;", line = 52)
	public static Class161 method140(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static25.aClass161ArrayArray1[local15] == null || Static25.aClass161ArrayArray1[local15][local19] == null) {
			@Pc(33) boolean local33 = Static207.method3917(local15);
			if (!local33) {
				return null;
			}
		}
		return Static25.aClass161ArrayArray1[local15][local19];
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBII)V", line = 109)
	public static void method141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(43) String local43 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local43);
		Static151.method2973(local43, true);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!nk;III)V", line = 127)
	public static void method142(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Class2_Sub2_Sub10_Sub2.aBoolean419) {
			@Pc(12) String local12;
			for (@Pc(5) int local5 = 9; local5 >= 5; local5--) {
				local12 = Static261.method4884(arg0, local5);
				if (local12 != null) {
					Static1.method3(arg0.anInt4293, true, arg0.anInt4310, false, local12, arg0.anInt4290, 1011, arg0.aString45, Static252.method4632(arg0, local5), (long) (local5 + 1));
				}
			}
			local12 = Static153.method3105(arg0);
			if (local12 != null) {
				Static1.method3(arg0.anInt4293, true, arg0.anInt4310, false, local12, arg0.anInt4290, 49, arg0.aString45, arg0.anInt4254, 0L);
			}
			for (@Pc(75) int local75 = 4; local75 >= 0; local75--) {
				@Pc(82) String local82 = Static261.method4884(arg0, local75);
				if (local82 != null) {
					Static1.method3(arg0.anInt4293, true, arg0.anInt4310, false, local82, arg0.anInt4290, 45, arg0.aString45, Static252.method4632(arg0, local75), (long) (local75 + 1));
				}
			}
			if (Static42.method1406(arg0).method1857()) {
				if (arg0.aString46 == null) {
					Static1.method3(arg0.anInt4293, true, arg0.anInt4310, false, Class173.aClass79_145.method2269(Class197.anInt5569), arg0.anInt4290, 30, "", -1, 0L);
				} else {
					Static1.method3(arg0.anInt4293, true, arg0.anInt4310, false, arg0.aString46, arg0.anInt4290, 30, "", -1, 0L);
				}
			}
		} else if (Static42.method1406(arg0).method1853() && (Static108.anInt3833 & 0x20) != 0) {
			Static1.method3(arg0.anInt4293, true, arg0.anInt4310, false, Class67.aString18, arg0.anInt4290, 11, Class173_Sub4.aString68 + " -> " + arg0.aString45, Static38.anInt1043, 0L);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;", line = 216)
	public static Object method143(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Class2_Sub3_Sub15.aBoolean189) {
			try {
				@Pc(18) Class212 local18 = (Class212) Class.forName("Class212_Sub1").getDeclaredConstructor().newInstance();
				local18.method5548(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Class2_Sub3_Sub15.aBoolean189 = true;
			}
		}
		return arg0;
	}
}
