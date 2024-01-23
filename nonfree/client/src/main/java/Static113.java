import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!l", name = "E", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!l", name = "F", descriptor = "I")
	public static int anInt2475;

	@OriginalMember(owner = "client!l", name = "I", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!l", name = "y", descriptor = "Lclient!sc;")
	public static Class102 aClass102_13 = new Class102(32);

	@OriginalMember(owner = "client!l", name = "B", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!l", name = "C", descriptor = "Lclient!ia;")
	public static Class51 aClass51_821 = Static64.method1101("<col=ffb000>");

	@OriginalMember(owner = "client!l", name = "D", descriptor = "I")
	public static int anInt2474 = 0;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array15 = new Class51[200];

	@OriginalMember(owner = "client!l", name = "H", descriptor = "Lclient!ia;")
	public static Class51 aClass51_822 = Static64.method1101("Spieler");

	@OriginalMember(owner = "client!l", name = "J", descriptor = "Lclient!ia;")
	public static Class51 aClass51_823 = Static64.method1101("scape main");

	@OriginalMember(owner = "client!l", name = "K", descriptor = "Lclient!ia;")
	public static Class51 aClass51_824 = Static64.method1101("::gc");

	@OriginalMember(owner = "client!l", name = "L", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[104][104];

	@OriginalMember(owner = "client!l", name = "M", descriptor = "Lclient!ia;")
	public static Class51 aClass51_825 = Static64.method1101("mapfunction");

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
	public static void method1896() {
		@Pc(1) Object local1 = Static197.anObject6;
		synchronized (Static197.anObject6) {
			if (Static190.anInt4106 != 0) {
				Static190.anInt4106 = 1;
				try {
					Static197.anObject6.wait();
				} catch (@Pc(12) InterruptedException local12) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method1897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static160.anInt3454 <= arg0 && Static149.anInt3252 >= arg0 && Static160.anInt3454 <= arg4 && Static149.anInt3252 >= arg4 && Static160.anInt3454 <= arg1 && Static149.anInt3252 >= arg1 && Static160.anInt3454 <= arg8 && Static149.anInt3252 >= arg8 && Static225.anInt4729 <= arg5 && arg5 <= Static122.anInt2710 && arg6 >= Static225.anInt4729 && Static122.anInt2710 >= arg6 && Static225.anInt4729 <= arg3 && arg3 <= Static122.anInt2710 && Static225.anInt4729 <= arg7 && Static122.anInt2710 >= arg7) {
			Static48.method833(arg6, arg5, arg4, arg1, arg3, arg8, arg2, arg0, arg7);
		} else {
			Static82.method1395(arg3, arg6, arg8, arg2, arg7, arg4, arg1, arg0, arg5);
		}
	}
}
