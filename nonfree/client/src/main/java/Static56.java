import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ff", name = "ab", descriptor = "Lclient!nb;")
	public static Class15 aClass15_12;

	@OriginalMember(owner = "client!ff", name = "fb", descriptor = "Lclient!p;")
	public static Class75 aClass75_3;

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "Lclient!wi;")
	public static Class108 aClass108_4 = new Class108();

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "Lclient!i;")
	public static Class41 aClass41_462 = Static184.method2923("logo");

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "Lclient!i;")
	private static Class41 aClass41_463 = Static184.method2923("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lclient!i;")
	public static Class41 aClass41_464 = Static184.method2923("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
	public static int anInt1606 = 4;

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "[I")
	public static int[] anIntArray158 = new int[anInt1606];

	@OriginalMember(owner = "client!ff", name = "db", descriptor = "[[Lclient!ba;")
	public static Class8[][] aClass8ArrayArray1 = new Class8[anInt1606][500];

	@OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
	public static int anInt1607 = 0;

	@OriginalMember(owner = "client!ff", name = "gb", descriptor = "Lclient!i;")
	public static Class41 aClass41_465 = aClass41_463;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(IB)Lclient!cj;")
	public static Class2_Sub2_Sub5 method1110(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub2_Sub5 local15 = (Class2_Sub2_Sub5) Static122.aClass43_12.method1464((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static54.aClass15_11.method387(Static104.method1775(arg0), Static127.method2068(arg0));
		local15 = new Class2_Sub2_Sub5();
		local15.anInt724 = arg0;
		if (local29 != null) {
			local15.method567(new Class2_Sub3(local29));
		}
		Static122.aClass43_12.method1462((long) arg0, local15);
		return local15;
	}
}
