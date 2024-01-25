import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static657 {

	@OriginalMember(owner = "client!uka", name = "b", descriptor = "[S")
	public static short[] aShortArray139;

	@OriginalMember(owner = "client!uka", name = "j", descriptor = "Z")
	public static boolean aBoolean674 = false;

	@OriginalMember(owner = "client!uka", name = "q", descriptor = "Lclient!dja;")
	public static final Class78 aClass78_14 = new Class78("", 17);

	@OriginalMember(owner = "client!uka", name = "g", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_100 = new Class144(31, 7);

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method8602(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static467.method6339(-1, -1, arg1, arg0);
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(I)V")
	public static void method8604() {
		for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
			Static593.aClass31Array1[local14] = null;
		}
		Static314.anInt5068 = 0;
	}
}
