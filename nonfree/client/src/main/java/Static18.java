import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!ke;")
	public static Class4_Sub3_Sub5_Sub2 aClass4_Sub3_Sub5_Sub2_1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!cc;")
	public static Class26 aClass26_3 = new Class26(4);

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	public static int anInt268 = 0;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "J")
	public static long aLong15 = 0L;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "[I")
	public static int[] anIntArray27 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method262(@OriginalArg(0) Class58 arg0) {
		Static265.aClass58_94 = arg0;
		Static211.anInt4158 = Static265.aClass58_94.method1371(16);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!fn;")
	public static Class4_Sub3_Sub8 method264(@OriginalArg(0) int arg0) {
		@Pc(18) Class4_Sub3_Sub8 local18 = (Class4_Sub3_Sub8) Static69.aClass40_6.method889((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(29) byte[] local29 = Static271.aClass58_95.method1372(5, arg0);
		local18 = new Class4_Sub3_Sub8();
		if (local29 != null) {
			local18.method1499(new Class4_Sub10(local29));
		}
		Static69.aClass40_6.method888((long) arg0, local18);
		return local18;
	}
}
