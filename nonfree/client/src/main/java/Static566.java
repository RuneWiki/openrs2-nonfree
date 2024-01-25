import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!wca", name = "C", descriptor = "Lclient!fu;")
	public static Class6_Sub16 aClass6_Sub16_2;

	@OriginalMember(owner = "client!wca", name = "H", descriptor = "F")
	public static float aFloat208;

	@OriginalMember(owner = "client!wca", name = "A", descriptor = "Z")
	public static boolean aBoolean663 = false;

	@OriginalMember(owner = "client!wca", name = "F", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_153 = new Class98(75, 8);

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
	public static void method7822() {
		@Pc(21) byte[] local21;
		if (Static196.anObject7 == null) {
			@Pc(14) Class101_Sub2_Sub1 local14 = new Class101_Sub2_Sub1();
			local21 = local14.method5710();
			Static196.anObject7 = Static403.method5820(local21);
		}
		if (Static362.anObject15 == null) {
			@Pc(32) Class101_Sub1_Sub2 local32 = new Class101_Sub1_Sub2();
			local21 = local32.method6333();
			Static362.anObject15 = Static403.method5820(local21);
		}
	}
}
