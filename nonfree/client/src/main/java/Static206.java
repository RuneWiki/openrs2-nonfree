import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!v", name = "R", descriptor = "Lclient!ai;")
	public static Class7 aClass7_39;

	@OriginalMember(owner = "client!v", name = "V", descriptor = "Lclient!pa;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!v", name = "O", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1505 = Static200.method3116("Allocated memory");

	@OriginalMember(owner = "client!v", name = "I", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1504 = aClass60_1505;

	@OriginalMember(owner = "client!v", name = "K", descriptor = "I")
	public static int anInt4378 = 0;

	@OriginalMember(owner = "client!v", name = "S", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1507 = Static200.method3116("blinken2:");

	@OriginalMember(owner = "client!v", name = "U", descriptor = "[I")
	public static int[] anIntArray573 = new int[5];

	@OriginalMember(owner = "client!v", name = "X", descriptor = "I")
	public static int anInt4383 = 0;

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
	public static int anInt4384 = 0;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public static void method3203() {
		Static88.aClass39_11.method1158();
		Static2.aClass27_4.method963();
		Static5.aClass39_3.method1158();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	public static void method3208(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub27 local12 = (Class1_Sub27) Static121.aClass33_7.method1071((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray656.length; local17++) {
				local12.anIntArray656[local17] = -1;
				local12.anIntArray657[local17] = 0;
			}
		}
	}
}
