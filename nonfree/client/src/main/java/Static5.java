import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "[I")
	public static int[] anIntArray13;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "[I")
	public static int[] anIntArray14;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
	public static boolean aBoolean3;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
	public static int[] anIntArray15;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "Lclient!g;")
	public static Class2_Sub5 aClass2_Sub5_1;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	public static int anInt100;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!ke;")
	public static Class39 aClass39_50 = Static2.method66("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean2 = true;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!ke;")
	private static Class39 aClass39_53 = Static2.method66("Loaded interfaces");

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!ke;")
	public static Class39 aClass39_51 = aClass39_53;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!ke;")
	public static Class39 aClass39_52 = Static2.method66("");

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "[Lclient!ne;")
	public static Class47[] aClass47Array1 = new Class47[4];

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "[I")
	public static int[] anIntArray16 = new int[128];

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "[Lclient!ke;")
	public static Class39[] aClass39Array1 = new Class39[100];

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_54 = Static2.method66(" x ");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lclient!nb;")
	public static Class2_Sub1_Sub13 method79(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub13 local10 = (Class2_Sub1_Sub13) Static81.aClass54_22.method1634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static58.aClass36_39.method1761(13, arg0);
		local10 = new Class2_Sub1_Sub13();
		local10.anInt1996 = arg0;
		if (local25 != null) {
			local10.method1431(new Class2_Sub5(local25));
		}
		Static81.aClass54_22.method1637((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method81() {
		aClass39_51 = null;
		aClass39_52 = null;
		aClass39_54 = null;
		anIntArray15 = null;
		anIntArray14 = null;
		aClass39_50 = null;
		aClass47Array1 = null;
		aClass2_Sub5_1 = null;
		aClass39_53 = null;
		anIntArray13 = null;
		aClass39Array1 = null;
		anIntArray16 = null;
	}
}
