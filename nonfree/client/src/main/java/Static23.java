import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static23 {

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "[[Lclient!ff;")
	public static Class24[][] aClass24ArrayArray1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Lclient!gg;")
	public static Class28 aClass28_493 = Static107.method1838("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_494 = Static107.method1838(" <col=ffff00>");

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!gg;")
	private static Class28 aClass28_496 = Static107.method1838("This world is full)3");

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_495 = aClass28_496;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!ch;")
	public static Class14 aClass14_38 = new Class14(64);

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
	public static int anInt749 = 0;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!gg;")
	private static Class28 aClass28_498 = Static107.method1838("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!gg;")
	public static Class28 aClass28_497 = aClass28_498;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[8];

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public static int anInt750 = -1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!jc;B)V")
	public static void method477(@OriginalArg(0) Class40 arg0) {
		Static56.aClass40_16 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)I")
	public static int method478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public static void method479() {
		aClass24ArrayArray1 = null;
		aClass28_494 = null;
		aClass14_38 = null;
		aBooleanArray9 = null;
		aBigInteger1 = null;
		aClass28_498 = null;
		aClass28_496 = null;
		aClass28_495 = null;
		aClass28_493 = null;
		aClass28_497 = null;
	}
}
