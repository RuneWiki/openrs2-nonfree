import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "[I")
	public static int[] anIntArray184;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!va;")
	private static Class61 aClass61_672 = Static88.method1421("Malformed login packet)3");

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	public static int anInt1598 = 1;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "I")
	public static int anInt1599 = 0;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!va;")
	private static Class61 aClass61_674 = Static88.method1421("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!va;")
	public static Class61 aClass61_673 = aClass61_674;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Lclient!va;")
	public static Class61 aClass61_675 = aClass61_674;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "I")
	public static int anInt1600 = 0;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!i;")
	public static Class29 aClass29_43 = new Class29(50);

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!va;")
	public static Class61 aClass61_676 = aClass61_672;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Lclient!va;")
	public static Class61 aClass61_677 = aClass61_674;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "Lclient!va;")
	public static Class61 aClass61_678 = Static88.method1421("backbase1");

	@OriginalMember(owner = "client!md", name = "p", descriptor = "[J")
	public static long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)Lclient!wa;")
	public static Class10_Sub1_Sub16 method903(@OriginalArg(0) int arg0) {
		@Pc(10) Class10_Sub1_Sub16 local10 = (Class10_Sub1_Sub16) Static79.aClass29_58.method644((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static28.aClass11_24.method203(16, arg0);
		local10 = new Class10_Sub1_Sub16();
		if (local25 != null) {
			local10.method1642(new Class10_Sub10(local25));
		}
		Static79.aClass29_58.method649(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public static void method904() {
		Static101.aClass29_72.method646();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method905() {
		aClass61_676 = null;
		aClass61_675 = null;
		aClass61_672 = null;
		aClass61_678 = null;
		anIntArray184 = null;
		aClass61_673 = null;
		aLongArray5 = null;
		aClass61_677 = null;
		aClass29_43 = null;
		aClass61_674 = null;
	}
}
