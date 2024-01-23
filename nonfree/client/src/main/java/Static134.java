import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
	public static int[] anIntArray289 = new int[14];

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
	public static int anInt3080 = 0;

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
	public static int anInt3081 = 0;

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "[I")
	public static int[] anIntArray290 = new int[4096];

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
	public static int anInt3083 = 0;

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
	public static int anInt3084 = 1;

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString189 = "Allocated memory";

	@OriginalMember(owner = "client!jm", name = "z", descriptor = "[I")
	public static int[] anIntArray291 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!jm", name = "A", descriptor = "Lclient!cf;")
	public static Interface2 anInterface2_1 = null;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
	public static void method2279() {
		@Pc(10) Class1_Sub16 local10;
		for (local10 = (Class1_Sub16) Static80.aClass26_14.method666(); local10 != null; local10 = (Class1_Sub16) Static80.aClass26_14.method672()) {
			if (local10.aBoolean213) {
				local10.method2372();
			}
		}
		for (local10 = (Class1_Sub16) Static13.aClass26_3.method666(); local10 != null; local10 = (Class1_Sub16) Static13.aClass26_3.method672()) {
			if (local10.aBoolean213) {
				local10.method2372();
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method2281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 <= 3) {
			return local7 <= 0 ? "<col=ffff00>" : "<col=c0ff00>";
		} else {
			return "<col=80ff00>";
		}
	}
}
