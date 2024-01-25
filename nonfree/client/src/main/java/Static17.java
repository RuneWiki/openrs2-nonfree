import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "Lclient!o;")
	public static Class6 aClass6_5;

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_3 = new Class102(20);

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "[I")
	public static final int[] anIntArray17 = new int[32];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([BZI)V")
	public static void method266(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static33.aClass1_Sub28_1 == null) {
			Static33.aClass1_Sub28_1 = new Class1_Sub28(20000);
		}
		Static33.aClass1_Sub28_1.method5387(arg0, arg0.length);
		if (!arg1) {
			return;
		}
		Static458.method4951(Static33.aClass1_Sub28_1.aByteArray86);
		Static22.aClass147_Sub1Array1 = new Class147_Sub1[Static312.anInt5420];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = Static446.anInt7393; local37 <= Static140.anInt2486; local37++) {
			@Pc(43) Class147_Sub1 local43 = Static363.method4853(local37);
			if (local43 != null) {
				Static22.aClass147_Sub1Array1[local35++] = local43;
			}
		}
		Static39.aBoolean77 = false;
		Static340.aLong173 = Static27.method359();
		Static33.aClass1_Sub28_1 = null;
	}
}
