import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "Lclient!eq;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
	public static int anInt646 = 2;

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "Lclient!gf;")
	public static final Class91 aClass91_2 = new Class91("", 13);

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "Z")
	public static boolean aBoolean28 = true;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "[I")
	public static final int[] anIntArray57 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLclient!nu;)V")
	public static void method610(@OriginalArg(1) Class2_Sub8 arg0) {
		arg0.aBoolean449 = false;
		if (arg0.aClass2_Sub14_5 != null) {
			arg0.aClass2_Sub14_5.anInt3842 = 0;
		}
		for (@Pc(18) Class2_Sub8 local18 = arg0.method5285(); local18 != null; local18 = arg0.method5287()) {
			method610(local18);
		}
	}
}
