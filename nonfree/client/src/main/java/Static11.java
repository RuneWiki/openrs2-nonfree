import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
	public static int anInt279;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "[I")
	public static int[] anIntArray7;

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "[I")
	public static int[] anIntArray8;

	@OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
	public static int anInt283;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "[I")
	public static int[] anIntArray9 = new int[2000];

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "Lclient!ai;")
	public static Class6 aClass6_101 = Static38.method685("Benutzen");

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_102 = Static38.method685("Freie Welt");

	@OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
	public static int anInt284 = -1;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)I")
	public static int method185(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
	public static void method186() {
		aClass6_102 = null;
		anIntArray7 = null;
		anIntArray8 = null;
		aClass6_101 = null;
		anIntArray9 = null;
	}
}
