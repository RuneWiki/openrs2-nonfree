import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "[Lclient!hu;")
	public static Class21[] aClass21Array6;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Z")
	public static boolean aBoolean270 = false;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Z")
	public static boolean aBoolean271 = true;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lclient!kia;")
	public static Class178 method3033() {
		return new Class178(1, false);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!cs;)Lclient!jba;")
	public static Class152 method3035(@OriginalArg(1) Class15_Sub1_Sub2 arg0) {
		@Pc(7) Class152 local7;
		if (Static29.aClass152_1 == null) {
			local7 = new Class152();
		} else {
			local7 = Static29.aClass152_1;
			Static29.aClass152_1 = Static29.aClass152_1.aClass152_3;
			Static396.anInt9379--;
			local7.aClass152_3 = null;
		}
		local7.aClass15_Sub1_Sub2_1 = arg0;
		return local7;
	}
}
