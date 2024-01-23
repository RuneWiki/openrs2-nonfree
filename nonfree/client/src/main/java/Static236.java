import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
	public static int anInt4435;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "[I")
	public static int[] anIntArray494 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "Lclient!jo;")
	public static Class96 aClass96_22 = new Class96();

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
	public static int anInt4434 = -1;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString157 = "Connecting to update server";

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "[I")
	public static int[] anIntArray496 = new int[14];

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
	public static int anInt4437 = -1;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	public static void method3799() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static311.aBooleanArray24[local3] = false;
		}
		Static146.anInt3024 = 0;
		Static103.anInt2203 = -1;
		Static29.anInt555 = 0;
		Static228.anInt4270 = 5;
		anInt4437 = -1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public static void method3801() {
		Static120.aClass175_20.method4287();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(CI)Z")
	public static boolean method3802(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
	public static int method3803(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
