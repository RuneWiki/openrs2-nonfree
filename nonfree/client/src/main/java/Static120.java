import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	public static int anInt2435;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!jt;")
	public static final Class150 aClass150_2 = new Class150(1);

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean208 = false;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Z")
	public static boolean aBoolean209 = true;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!qa;Lclient!ra;ZII)V")
	public static void method2317(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) Class47 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3) {
			Static515.aClass35_19.method7351((Static461.anInt8348 - Static515.aClass35_19.EA()) / 2, (Static223.anInt3996 - Static515.aClass35_19.ma()) / 2);
			Static193.aClass35_17.method7351((Static461.anInt8348 - Static193.aClass35_17.EA()) / 2, 18);
		}
		@Pc(32) String local32 = "";
		if (Static185.aClass212_1 == Static230.aClass212_2) {
			local32 = Static2.aClass202_3.method5139(Static172.anInt6352);
		} else if (Static533.aClass212_4 == Static185.aClass212_1) {
			local32 = Static484.aClass202_245.method5139(Static172.anInt6352);
		}
		arg2.method7598(arg5, Static461.anInt8348 / 2, local32, -1, Static223.anInt3996 / 2 - 26);
		@Pc(81) int local81 = Static223.anInt3996 / 2 - 18;
		arg1.method6060(Static461.anInt8348 / 2 - 152, local81, 304, 34, arg4, 0);
		arg1.method6060(Static461.anInt8348 / 2 - 151, local81 + 1, 302, 32, 0, 0);
		arg1.f(Static461.anInt8348 / 2 - 150, local81 + 2, Static306.anInt5606 * 3, 30, arg0, 0);
		arg1.f(Static461.anInt8348 / 2 + Static306.anInt5606 * 3 - 150, local81 - -2, 300 - Static306.anInt5606 * 3, 30, 0, 0);
		arg2.method7598(arg5, Static461.anInt8348 / 2, Static328.aString132, -1, Static223.anInt3996 / 2 + 4);
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Lclient!np;")
	public static Class138 method2320() {
		try {
			return (Class138) Class.forName("Class138_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2321(@OriginalArg(0) String arg0) {
		if (Static277.aStringArray27 == null) {
			Static226.method3567();
		}
		@Pc(14) String[] local14 = Static225.method3542('\n', arg0);
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			for (@Pc(24) int local24 = Static262.anInt7160; local24 > 0; local24--) {
				Static277.aStringArray27[local24] = Static277.aStringArray27[local24 - 1];
			}
			Static277.aStringArray27[0] = local14[local20];
			if (Static262.anInt7160 < Static277.aStringArray27.length - 1) {
				Static262.anInt7160++;
				if (Static62.anInt1194 > 0) {
					Static62.anInt1194++;
				}
			}
		}
	}
}
