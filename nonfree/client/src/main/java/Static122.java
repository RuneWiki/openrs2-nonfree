import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!eha", name = "e", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!eha", name = "f", descriptor = "I")
	public static int anInt3105;

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_14 = new Class112(8);

	@OriginalMember(owner = "client!eha", name = "g", descriptor = "[Lclient!tn;")
	public static final Class3_Sub15[] aClass3_Sub15Array1 = new Class3_Sub15[2048];

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIIB)I")
	public static int method2840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIIIB)V")
	public static void method2841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = Static338.anInt6676;
		@Pc(12) int local12 = Static555.anInt9456;
		if (Static349.aBoolean590) {
			local5 += Static477.method7033();
			local12 += Static10.method114();
		}
		@Pc(35) Class5 local35;
		if (Static412.anInt7699 == 1) {
			local35 = Static513.aClass5Array17[Static489.anInt8687 / 100];
			local35.method7577(local5 - 8, local12 + -8);
			Static241.method4616(local12 + local35.method7585() - 8, local12 + -8, local5 + local35.method7589() - 8, local5 - 8);
		}
		if (Static412.anInt7699 == 2) {
			local35 = Static513.aClass5Array17[Static489.anInt8687 / 100 + 4];
			local35.method7577(local5 - 8, local12 + -8);
			Static241.method4616(local12 + local35.method7585() - 8, local12 + -8, local5 + local35.method7589() - 8, local5 - 8);
		}
		Static552.method7799();
	}
}
