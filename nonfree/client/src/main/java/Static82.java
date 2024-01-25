import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cn", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString26;

	@OriginalMember(owner = "client!cn", name = "E", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_35 = new Class160(36, 12);

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
	public static int anInt1435 = -1;

	@OriginalMember(owner = "client!cn", name = "A", descriptor = "[I")
	public static final int[] anIntArray77 = new int[4096];

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "(I)V")
	public static void method1407() {
		@Pc(10) Class347 local10 = Static435.method6495();
		@Pc(16) Class14_Sub54 local16 = Static72.method1195(local10.aClass197_2, Static302.aClass251_131);
		local16.aClass14_Sub21_Sub2_2.method7747(0);
		local10.method8308(local16);
	}
}
