import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "[S")
	public static short[] aShortArray2;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!c;")
	public static Class10 aClass10_6;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "J")
	private static long aLong5;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_57 = Static41.method597("weiss:");

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "Lclient!od;")
	private static Class60 aClass60_58 = Static41.method597("Select a world");

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Lclient!od;")
	public static Class60 aClass60_59 = Static41.method597("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!od;")
	public static Class60 aClass60_60 = Static41.method597("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_61 = aClass60_58;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public static int anInt94 = 0;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "[I")
	public static int[] anIntArray11 = new int[32];

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)I")
	public static int method74(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 2) {
			@Pc(25) int local25 = method74(arg0 * arg0, arg1 >> 1);
			if ((arg1 & 0x1) != 0) {
				local25 *= arg0;
			}
			return local25;
		} else if (arg1 == 1) {
			return arg0;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)J")
	public static synchronized long method75() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < aLong5) {
			Static21.aLong23 += aLong5 - local10;
		}
		aLong5 = local10;
		return local10 + Static21.aLong23;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	public static void method76() {
		aShortArray2 = null;
		aClass60_61 = null;
		aClass60_58 = null;
		aClass10_6 = null;
		aClass60_57 = null;
		anIntArray10 = null;
		anIntArray11 = null;
		aClass60_59 = null;
		aClass60_60 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!sa;B)Lclient!sa;")
	public static Class4_Sub14 method77(@OriginalArg(0) Class4_Sub14 arg0) {
		@Pc(18) int local18 = Static113.method768(Static38.method575(arg0));
		if (local18 == 0) {
			return null;
		}
		for (@Pc(24) int local24 = 0; local24 < local18; local24++) {
			arg0 = Static61.method991(arg0.anInt2397);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
