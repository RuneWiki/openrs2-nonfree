import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "J")
	public static long aLong165;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "Lclient!pk;")
	public static Class132 aClass132_76;

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "Lclient!gd;")
	public static Class61 aClass61_41 = new Class61(50);

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString161 = "glow2:";

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
	public static int anInt4576 = 0;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "Lclient!gd;")
	public static Class61 aClass61_42 = new Class61(50);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method3478(@OriginalArg(0) String arg0) {
		if (Static189.aClass8_Sub25Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = Static31.method513(arg0);
		if (local14 == 0L) {
			return;
		}
		while (Static189.aClass8_Sub25Array1.length > local10 && Static189.aClass8_Sub25Array1[local10].aLong203 != local14) {
			local10++;
		}
		if (Static189.aClass8_Sub25Array1.length > local10 && Static189.aClass8_Sub25Array1[local10] != null) {
			Static66.aClass8_Sub2_Sub1_4.method2398(98);
			Static66.aClass8_Sub2_Sub1_4.method2378(Static189.aClass8_Sub25Array1[local10].aLong203);
		}
	}
}
