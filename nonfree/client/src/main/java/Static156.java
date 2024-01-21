import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!qh", name = "W", descriptor = "B")
	public static byte aByte5;

	@OriginalMember(owner = "client!qh", name = "ab", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_118;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
	public static int anInt3437 = 0;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "Lclient!ih;")
	public static final Class46 aClass46_10 = new Class46(30);

	@OriginalMember(owner = "client!qh", name = "T", descriptor = "Z")
	public static boolean aBoolean160 = true;

	@OriginalMember(owner = "client!qh", name = "U", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1006 = Static81.method1507("The server is being updated)3");

	@OriginalMember(owner = "client!qh", name = "V", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1007 = aClass24_1006;

	@OriginalMember(owner = "client!qh", name = "X", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1008 = Static81.method1507("");

	@OriginalMember(owner = "client!qh", name = "Y", descriptor = "[I")
	public static final int[] anIntArray296 = new int[128];

	@OriginalMember(owner = "client!qh", name = "Z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1009 = Static81.method1507("null");

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	public static void method2653() {
		for (@Pc(10) Class1_Sub2_Sub20 local10 = (Class1_Sub2_Sub20) Static207.aClass87_27.method2827(); local10 != null; local10 = (Class1_Sub2_Sub20) Static207.aClass87_27.method2830()) {
			@Pc(20) Class5_Sub3 local20 = local10.aClass5_Sub3_1;
			if (Static170.anInt3799 != local20.anInt2734 || local20.aBoolean124) {
				local10.method3563();
			} else if (local20.anInt2741 <= Static42.anInt1100) {
				local20.method2093(Static92.anInt2138);
				if (local20.aBoolean124) {
					local10.method3563();
				} else {
					Static160.method3564(local20.anInt2734, local20.anInt2739, local20.anInt2740, local20.anInt2730, 60, local20, 0, -1L, false);
				}
			}
		}
	}
}
