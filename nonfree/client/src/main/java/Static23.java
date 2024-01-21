import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_15;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
	public static int anInt690;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Z")
	public static boolean aBoolean31;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_16;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!tb;")
	public static Class44 aClass44_13;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!oa;")
	private static Class56 aClass56_341 = Static33.method650("Enter name of player to delete from list");

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_340 = aClass56_341;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_342 = Static33.method650("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Lclient!oa;")
	private static Class56 aClass56_348 = Static33.method650("yellow:");

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_343 = aClass56_348;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!oa;")
	public static Class56 aClass56_344 = Static33.method650("runes");

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_345 = Static33.method650(":: (X");

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Lclient!oa;")
	public static Class56 aClass56_346 = aClass56_348;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Lclient!oa;")
	public static Class56 aClass56_347 = Static33.method650(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "[Lclient!ub;")
	public static Class73[] aClass73Array1 = new Class73[50];

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
	public static int anInt692 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I")
	public static int method491(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(20) int local20 = (local10 >>> 2 & 0xF3333333) + (local10 & 0x33333333);
		@Pc(28) int local28 = (local20 >>> 4) + local20 & 0xF0F0F0F;
		@Pc(38) int local38 = local28 + (local28 >>> 8);
		@Pc(49) int local49 = local38 + (local38 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method492() {
		aClass73Array1 = null;
		aClass56_342 = null;
		aClass56_343 = null;
		aClass3_Sub1_Sub1_Sub4_15 = null;
		aClass56_347 = null;
		aClass56_341 = null;
		aClass56_345 = null;
		aClass56_348 = null;
		aClass56_346 = null;
		aClass56_344 = null;
		aClass3_Sub1_Sub1_Sub4_16 = null;
		aClass44_13 = null;
		aClass56_340 = null;
	}
}
