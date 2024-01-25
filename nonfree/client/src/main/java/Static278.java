import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!s", name = "H", descriptor = "[Lclient!lf;")
	public static Class90[] aClass90Array14;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_145 = new Class140(64);

	@OriginalMember(owner = "client!s", name = "u", descriptor = "I")
	public static int anInt5397 = 0;

	@OriginalMember(owner = "client!s", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString217 = "Loading...";

	@OriginalMember(owner = "client!s", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString218 = " ";

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class204 local7 = Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class17 local13 = local7.aClass17_3; local13 != null; local13 = local13.aClass17_1) {
			@Pc(17) Class5_Sub3 local17 = local13.aClass5_Sub3_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort75 == arg1 && local17.aShort77 == arg2) {
				Static248.method4430(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	public static void method4804() {
		if (Static108.aClass174_1 != null) {
			Static108.aClass174_1.method5525();
		}
		if (Static210.aClass174_2 != null) {
			Static210.aClass174_2.method5525();
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V")
	public static void method4805(@OriginalArg(0) int arg0) {
		Static240.anInt4660 = arg0;
	}
}
