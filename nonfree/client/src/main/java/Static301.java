import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!tl", name = "X", descriptor = "Lclient!qj;")
	public static Class165 aClass165_92;

	@OriginalMember(owner = "client!tl", name = "S", descriptor = "Lclient!bh;")
	public static final Class1_Sub7_Sub1 aClass1_Sub7_Sub1_3 = new Class1_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!tl", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString232 = "Take";

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIII)V")
	public static void method5136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		if (arg0 > arg3) {
			for (local19 = arg3; local19 < arg0; local19++) {
				Static327.anIntArrayArray63[local19][arg2] = arg1;
			}
		} else {
			for (local19 = arg0; local19 < arg3; local19++) {
				Static327.anIntArrayArray63[local19][arg2] = arg1;
			}
		}
	}
}
