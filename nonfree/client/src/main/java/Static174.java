import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
	public static int anInt3155;

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "Lclient!mh;")
	public static final Class188 aClass188_3 = new Class188("", 17);

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
	public static int anInt3154 = -1;

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(JI)V")
	public static void method2895(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIII)V")
	public static void method2896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1008) {
			Static258.method4043(Static347.aClass188_7, arg2, arg1);
		} else if (arg0 == 1009) {
			Static258.method4043(Static352.aClass188_8, arg2, arg1);
		} else if (arg0 == 1004) {
			Static258.method4043(Static309.aClass188_6, arg2, arg1);
		} else if (arg0 == 1003) {
			Static258.method4043(Static19.aClass188_1, arg2, arg1);
		} else if (arg0 == 1007) {
			Static258.method4043(Static178.aClass188_4, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BI)Z")
	public static boolean method2897(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}
}
