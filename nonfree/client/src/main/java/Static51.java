import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Lclient!ke;")
	public static Class43 aClass43_14;

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!cb;")
	public static Class10 aClass10_37 = new Class10();

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
	public static int anInt1395 = 0;

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "Lclient!sg;")
	public static Class77 aClass77_544 = Static146.method2172("logo");

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "Lclient!sg;")
	private static Class77 aClass77_548 = Static146.method2172("New User");

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Lclient!sg;")
	public static Class77 aClass77_545 = aClass77_548;

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Lclient!sg;")
	private static Class77 aClass77_547 = Static146.method2172("Loaded input handler");

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "Lclient!sg;")
	public static Class77 aClass77_546 = aClass77_547;

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "Lclient!sg;")
	public static Class77 aClass77_549 = Static146.method2172("AUS");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZB)V")
	public static void method964(@OriginalArg(0) boolean arg0) {
		Static34.method700();
		Static120.anInt1044++;
		if (Static120.anInt1044 < 50 && !arg0) {
			return;
		}
		Static120.anInt1044 = 0;
		if (Static149.aBoolean148 || Static2.aClass29_2 == null) {
			return;
		}
		Static124.aClass2_Sub18_Sub1_3.method2398(46);
		try {
			Static2.aClass29_2.method969(Static124.aClass2_Sub18_Sub1_3.anInt3423, Static124.aClass2_Sub18_Sub1_3.aByteArray39);
			Static124.aClass2_Sub18_Sub1_3.anInt3423 = 0;
		} catch (@Pc(47) IOException local47) {
			Static149.aBoolean148 = true;
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
	public static void method968() {
		aClass43_14 = null;
		aClass77_549 = null;
		aByteArrayArray1 = null;
		aClass77_545 = null;
		aClass77_544 = null;
		aClass77_546 = null;
		aClass77_548 = null;
		aClass77_547 = null;
		aClass10_37 = null;
	}
}
