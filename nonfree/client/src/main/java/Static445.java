import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "Lclient!cl;")
	public static Class58 aClass58_5;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
	public static int anInt6825;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
	public static int anInt6823 = 0;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[BIZLclient!aq;IBI)Lclient!vt;")
	public static Class125_Sub1_Sub1 method5891(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) Class22_Sub1 arg2, @OriginalArg(5) int arg3) {
		if (arg2.aBoolean76 || Static88.method1890(arg0) && Static88.method1890(arg3)) {
			return new Class125_Sub1_Sub1(arg2, 3553, 6406, arg0, arg3, false, arg1, 6406);
		} else if (arg2.aBoolean70) {
			return new Class125_Sub1_Sub1(arg2, 34037, 6406, arg0, arg3, false, arg1, 6406);
		} else {
			return new Class125_Sub1_Sub1(arg2, 6406, arg0, arg3, Static92.method1941(arg0), Static92.method1941(arg3), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V")
	public static void method5894(@OriginalArg(0) int arg0) {
		Static549.method4750();
		@Pc(11) int local11 = Static266.aClass161_1.method3497(arg0).anInt5850;
		if (local11 == 0) {
			return;
		}
		@Pc(20) int local20 = Static380.aClass127_1.anIntArray219[arg0];
		if (local11 == 5) {
			Static639.anInt9892 = local20;
		}
		if (local11 == 6) {
			Static712.anInt2538 = local20;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
	public static void method5895() {
		if (Static467.aClass107_3 != null) {
			Static467.aClass107_3.method5370();
		}
		if (Static93.aClass107_1 != null) {
			Static93.aClass107_1.method5370();
		}
	}
}
