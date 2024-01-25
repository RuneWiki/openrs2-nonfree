import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "J")
	public static long aLong96;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_64 = new Class160(122, 1);

	@OriginalMember(owner = "client!et", name = "i", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_81 = new Class251(91, -1);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)V")
	public static void method2170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static446.aByteArrayArrayArray12 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2174(@OriginalArg(0) String arg0) {
		if (arg0.equals("")) {
			return;
		}
		@Pc(24) Class347 local24 = Static435.method6495();
		@Pc(32) Class14_Sub54 local32 = Static72.method1195(local24.aClass197_2, Static302.aClass251_131);
		local32.aClass14_Sub21_Sub2_2.method7747(Static418.method6276(arg0));
		local32.aClass14_Sub21_Sub2_2.method7690(arg0);
		local24.method8308(local32);
	}
}
