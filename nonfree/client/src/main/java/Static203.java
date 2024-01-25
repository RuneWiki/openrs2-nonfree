import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "Lclient!ir;")
	public static Class100 aClass100_85;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
	public static int anInt4169;

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "J")
	public static long aLong137;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "Z")
	public static boolean aBoolean236 = false;

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString160 = "Loading title screen - ";

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	public static int anInt4174 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method3541(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static11.aClass15_1);
		arg0.removeMouseMotionListener(Static11.aClass15_1);
		arg0.removeFocusListener(Static11.aClass15_1);
		Static317.anInt5588 = 0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public static void method3543() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static159.aBooleanArray13[local7] = true;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!sj;I)Z")
	public static boolean method3545(@OriginalArg(0) Class181 arg0) {
		if (arg0.anIntArray463 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray463.length; local17++) {
			@Pc(24) int local24 = Static113.method5424(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray459[local17];
			if (arg0.anIntArray463[local17] == 2) {
				if (local24 >= local29) {
					return false;
				}
			} else if (arg0.anIntArray463[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray463[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}
}
