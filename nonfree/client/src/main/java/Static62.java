import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!k", name = "O", descriptor = "I")
	public static int anInt1526;

	@OriginalMember(owner = "client!k", name = "T", descriptor = "Lclient!ff;")
	public static Class26 aClass26_8;

	@OriginalMember(owner = "client!k", name = "X", descriptor = "Lclient!ff;")
	public static Class26 aClass26_9;

	@OriginalMember(owner = "client!k", name = "cb", descriptor = "Lclient!r;")
	private static Class61 aClass61_477 = Static129.method2060("Loaded config");

	@OriginalMember(owner = "client!k", name = "Q", descriptor = "Lclient!r;")
	public static Class61 aClass61_473 = aClass61_477;

	@OriginalMember(owner = "client!k", name = "U", descriptor = "I")
	public static int anInt1530 = 0;

	@OriginalMember(owner = "client!k", name = "V", descriptor = "Lclient!r;")
	public static Class61 aClass61_474 = Static129.method2060("gr-Un:");

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "Lclient!r;")
	private static Class61 aClass61_476 = Static129.method2060("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!k", name = "W", descriptor = "Lclient!r;")
	public static Class61 aClass61_475 = aClass61_476;

	@OriginalMember(owner = "client!k", name = "db", descriptor = "Lclient!r;")
	public static Class61 aClass61_478 = aClass61_476;

	@OriginalMember(owner = "client!k", name = "gb", descriptor = "I")
	public static int anInt1534 = 0;

	@OriginalMember(owner = "client!k", name = "jb", descriptor = "I")
	public static volatile int anInt1536 = 0;

	@OriginalMember(owner = "client!k", name = "kb", descriptor = "[I")
	public static int[] anIntArray229 = new int[4000];

	@OriginalMember(owner = "client!k", name = "mb", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!ff;ZIIII)V")
	public static void method1069(@OriginalArg(1) Class26 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		anInt1526 = arg1;
		Static119.anInt3027 = arg2;
		Static79.anInt2014 = arg3;
		Static93.aBoolean85 = false;
		Static58.anInt1425 = 1;
		Static97.aClass26_21 = arg0;
		Static101.anInt2694 = 2;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)Lclient!ue;")
	public static Class5_Sub2_Sub15 method1070(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub2_Sub15 local12 = (Class5_Sub2_Sub15) Static115.aClass29_25.method766((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static121.aClass26_Sub1_19.method1038(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class5_Sub2_Sub15();
		@Pc(35) Class5_Sub14 local35 = new Class5_Sub14(local22);
		@Pc(37) int local37 = 0;
		local35.anInt2199 = local35.aByteArray33.length - 12;
		@Pc(48) int local48 = local35.method1461();
		local12.anInt3073 = local35.method1478();
		local12.anInt3070 = local35.method1478();
		local12.anInt3074 = local35.method1478();
		local12.anInt3064 = local35.method1478();
		local35.anInt2199 = 0;
		local12.aClass61_973 = local35.method1477();
		local12.anIntArray369 = new int[local48];
		local12.aClass61Array22 = new Class61[local48];
		local12.anIntArray368 = new int[local48];
		while (local35.anInt2199 < local35.aByteArray33.length - 12) {
			@Pc(99) int local99 = local35.method1478();
			if (local99 == 3) {
				local12.aClass61Array22[local37] = local35.method1450();
			} else if (local99 >= 100 || local99 == 21 || local99 == 38 || local99 == 39) {
				local12.anIntArray369[local37] = local35.method1471();
			} else {
				local12.anIntArray369[local37] = local35.method1461();
			}
			local12.anIntArray368[local37++] = local99;
		}
		Static115.aClass29_25.method762(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
	public static void method1071() {
		aClass61_477 = null;
		aClass26_8 = null;
		aClass26_9 = null;
		aClass61_473 = null;
		aClass61_476 = null;
		anIntArray229 = null;
		aClass61_478 = null;
		aClass61_475 = null;
		aClass61_474 = null;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V")
	public static void method1073() {
		Static61.aBoolean57 = true;
		Static130.aBoolean118 = true;
	}
}
