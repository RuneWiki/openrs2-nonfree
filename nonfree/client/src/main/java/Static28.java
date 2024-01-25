import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	public static int anInt5939;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "Ljava/lang/String;")
	public static final String aString224 = "wave2:";

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
	public static int anInt5938 = 0;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method4994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!am;ILclient!am;)V")
	public static void method5006(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static38.aClass11_14 = arg0;
		Static1.aClass11_1 = arg1;
		Static187.anInt4073 = Static38.aClass11_14.method292(3);
	}
}
