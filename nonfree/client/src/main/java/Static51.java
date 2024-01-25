import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Ljava/lang/String;")
	public static final String aString39 = "slide:";

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString40 = null;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Z")
	public static boolean aBoolean77 = true;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method850() {
		Static60.aClass70_26.method1405();
		Static174.aClass70_58.method1405();
		Static221.aClass70_72.method1405();
		Static186.aClass70_63.method1405();
		Static1.aClass70_1.method1405();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!of;)V")
	public static void method851(@OriginalArg(1) Class40[] arg0) {
		Static175.anInt3287 = arg0.length;
		Static233.anIntArray489 = new int[Static175.anInt3287 + 10];
		Static291.aClass40Array35 = new Class40[Static175.anInt3287 + 10];
		Static358.method952(arg0, 0, Static291.aClass40Array35, 0, Static175.anInt3287);
		for (@Pc(26) int local26 = 0; local26 < Static175.anInt3287; local26++) {
			Static233.anIntArray489[local26] = Static291.aClass40Array35[local26].method5084();
		}
		for (@Pc(53) int local53 = Static175.anInt3287; local53 < Static291.aClass40Array35.length; local53++) {
			Static233.anIntArray489[local53] = 12;
		}
	}
}
