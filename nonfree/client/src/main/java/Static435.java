import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_31 = new Class32(64);

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Z")
	public static boolean aBoolean240 = false;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString32 = null;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2762(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(22) Class2_Sub40 local22 = Static464.method6285(Static251.aClass131_1, Static141.aClass179_35);
			local22.aClass2_Sub22_Sub2_2.method8537(Static154.method2286(arg0));
			local22.aClass2_Sub22_Sub2_2.method8540(arg0);
			Static528.method7295(local22);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Lclient!be;")
	public static Class27 method2763() {
		return Static559.method7655();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2764(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)Lclient!ch;")
	public static Class53 method2767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static28.aClass53ArrayArrayArray1[0][arg1][arg2] != null && Static28.aClass53ArrayArrayArray1[0][arg1][arg2].aClass53_1 != null;
			if (local28 && arg0 >= Static10.anInt139 - 1) {
				return null;
			}
			Static91.method1437(arg0, arg1, arg2);
		}
		return Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
	}
}
