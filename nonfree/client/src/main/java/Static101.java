import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!va", name = "F", descriptor = "I")
	public static int anInt2582;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	public static int anInt2558 = 0;

	@OriginalMember(owner = "client!va", name = "D", descriptor = "Lclient!i;")
	public static Class29 aClass29_71 = new Class29(64);

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
	public static final int anInt2591 = 5063219;

	@OriginalMember(owner = "client!va", name = "X", descriptor = "Lclient!i;")
	public static Class29 aClass29_72 = new Class29(64);

	@OriginalMember(owner = "client!va", name = "Y", descriptor = "Lclient!va;")
	private static Class61 aClass61_1033 = Static88.method1421("Use");

	@OriginalMember(owner = "client!va", name = "Z", descriptor = "Lclient!va;")
	public static Class61 aClass61_1034 = Static88.method1421("invback");

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "Lclient!va;")
	public static Class61 aClass61_1035 = aClass61_1033;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
	public static void method1605() {
		aClass61_1035 = null;
		aClass29_72 = null;
		aClass29_71 = null;
		aClass61_1034 = null;
		aClass61_1033 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!he;Lclient!va;Lclient!va;)[Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1[] method1610(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class61 arg1, @OriginalArg(3) Class61 arg2) {
		@Pc(17) int local17 = arg0.method221(arg2);
		@Pc(23) int local23 = arg0.method227(local17, arg1);
		return Static99.method1582(local17, arg0, local23);
	}
}
