import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_92 = new Class45("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!bg;")
	public static final Class27 aClass27_4 = new Class27();

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZIII)V")
	public static void method5469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub2_Sub16 local13 = Static422.method6588(10, arg3);
		local13.method6693();
		local13.anInt7491 = arg0;
		local13.anInt7482 = arg1;
		local13.anInt7487 = arg2;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Z")
	public static boolean method5470(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static135.method8180(arg0, arg1) | Static514.method7863(arg1, arg0) | Static340.method5717(arg0, arg1)) & Static81.method1805(arg1, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZZI)V")
	public static void method5471(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub8 local8 = Static271.method4828(arg1, arg0);
		if (local8 != null) {
			local8.method8239();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method5473(@OriginalArg(1) String arg0) {
		System.exit(1);
	}
}
