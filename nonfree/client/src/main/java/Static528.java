import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "F")
	public static float aFloat190;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!q;")
	public static Class54 aClass54_6;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString99 = "";

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray37 = new boolean[100];

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
	public static final int[] anIntArray649 = new int[32];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIIB)V")
	public static void method7220(@OriginalArg(0) boolean arg0) {
		Static330.anInt6003 = 22050;
		Static341.aBoolean438 = arg0;
		Static293.anInt5470 = 2;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)V")
	public static void method7221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static401.method5861(arg1, 6);
		local8.method2582();
		local8.anInt2944 = arg0;
	}
}
