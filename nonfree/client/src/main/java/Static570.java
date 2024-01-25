import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "Lclient!qq;")
	public static Class4_Sub3_Sub4 aClass4_Sub3_Sub4_6;

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "Lclient!sv;")
	public static final Class340 aClass340_6 = new Class340();

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(III)V")
	public static void method7540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static451.anInt7047 = arg0 - Static154.anInt439;
		Static527.anInt8178 = arg1 - Static154.anInt437;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method7542(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - arg0;
		if (local12 < -9) {
			return "<col=ff0000>";
		} else if (local12 < -6) {
			return "<col=ff3000>";
		} else if (local12 < -3) {
			return "<col=ff7000>";
		} else if (local12 < 0) {
			return "<col=ffb000>";
		} else if (local12 > 9) {
			return "<col=00ff00>";
		} else if (local12 > 6) {
			return "<col=40ff00>";
		} else if (local12 > 3) {
			return "<col=80ff00>";
		} else if (local12 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
