import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "Lclient!sf;")
	public static Class157 aClass157_41 = new Class157(64);

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Z")
	public static boolean aBoolean334 = false;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString169 = "Checking for updates - ";

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ek;Z)V")
	public static void method4040(@OriginalArg(0) Class42 arg0) {
		Static187.aClass42_56 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(CI)Z")
	public static boolean method4041(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(27) int local27 = 0;
			@Pc(29) char[] local29 = Static169.aCharArray5;
			while (local29.length > local27) {
				@Pc(41) char local41 = local29[local27];
				if (arg0 == local41) {
					return true;
				}
				local27++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLclient!ek;)V")
	public static void method4042(@OriginalArg(1) Class42 arg0) {
		if (Static28.aBoolean37) {
			return;
		}
		if (Static116.aBoolean184) {
			Static111.method1883();
		} else {
			Static77.method1441();
		}
		Static119.aClass2_Sub8_Sub1_13 = Static275.method4324(Static119.anInt5238, arg0);
		@Pc(19) int local19 = Static120.anInt2649;
		@Pc(25) int local25 = local19 * 956 / 503;
		Static119.aClass2_Sub8_Sub1_13.method4365((Static60.anInt1510 - local25) / 2, 0, local25, local19);
		Static263.aClass93_1 = Static226.method4756(arg0, Static95.anInt2289);
		Static263.aClass93_1.method3562(Static60.anInt1510 / 2 - Static263.aClass93_1.anInt4355 / 2, 18);
		Static28.aBoolean37 = true;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[BI)I")
	public static int method4044(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static279.method4345(arg1, 0, arg0);
	}
}
