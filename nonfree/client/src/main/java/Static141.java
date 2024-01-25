import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!is", name = "n", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_50 = new Class70(5);

	@OriginalMember(owner = "client!is", name = "t", descriptor = "S")
	public static short aShort32 = 1;

	@OriginalMember(owner = "client!is", name = "w", descriptor = "I")
	public static int anInt2540 = 0;

	@OriginalMember(owner = "client!is", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString106 = "scroll:";

	@OriginalMember(owner = "client!is", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString107 = "Loaded defaults";

	@OriginalMember(owner = "client!is", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString108 = " is already on your ignore list.";

	@OriginalMember(owner = "client!is", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString109 = "Loaded sprites";

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
	public static int method2665(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static258.method4308(arg0);
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(B)Lclient!rr;")
	public static Class6_Sub35 method2666() {
		if (Static307.aClass211_7 == null || Static92.aClass4_1 == null) {
			return null;
		}
		Static92.aClass4_1.method46(Static307.aClass211_7);
		@Pc(26) Class6_Sub35 local26 = (Class6_Sub35) Static92.aClass4_1.method51();
		if (local26 == null) {
			return null;
		} else {
			@Pc(35) Class165 local35 = Static345.method5701(local26.anInt5312);
			return local35 != null && local35.aBoolean332 && local35.method4325() ? local26 : Static205.method5716();
		}
	}
}
