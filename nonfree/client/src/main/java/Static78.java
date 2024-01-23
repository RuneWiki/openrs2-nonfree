import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10 = new String[1000];

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIB)Z")
	public static boolean method1608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(17) Class150 local17 = Static160.method2744(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local17.method3883(arg1);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method1609(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static281.aBoolean17) {
			try {
				@Pc(19) Class114 local19 = (Class114) Class.forName("Class114_Sub1").getDeclaredConstructor().newInstance();
				local19.method3130(arg0);
				return local19;
			} catch (@Pc(26) Throwable local26) {
				Static281.aBoolean17 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public static void method1611() {
		Static145.aClass175_23.method4287();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public static void method1613() {
		Static100.aClass175_44.method4294();
		Static116.aClass175_19.method4294();
	}
}
