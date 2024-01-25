import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static467 {

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_15 = new Class216(12, 3);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!pq;I)V")
	public static void method6538(@OriginalArg(0) Class251 arg0) {
		Static34.aClass251_120 = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!kg;BI)V")
	public static void method6541(@OriginalArg(0) Class171 arg0, @OriginalArg(2) int arg1) {
		if (Static450.aBoolean531) {
			Static450.aBoolean531 = false;
			arg1 = 0;
		}
		if (Static98.aClass171_1 != null && Static98.aClass171_1.method3639(arg0)) {
			return;
		}
		Static98.aClass171_1 = arg0;
		Static410.aLong187 = Static137.method2058();
		Static455.anInt7908 = arg1;
		Static368.anInt6386 = arg1;
		if (Static368.anInt6386 == 0) {
			Static563.method7689();
			return;
		}
		Static68.anInt1145 = Static24.anInt5482;
		Static217.aFloat52 = Static334.aFloat135;
		Static14.aFloat6 = Static271.aFloat84;
		Static447.aFloat180 = Static212.aFloat49;
		Static242.aFloat57 = Static2.aFloat3;
		Static406.anInt7123 = Static1.anInt35;
		Static126.aFloat20 = Static577.aFloat134;
		Static372.anInt4618 = Static435.anInt7600;
		Static545.aFloat202 = Static236.aFloat55;
		Static395.aClass17_3 = Static183.aClass17_1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6543(@OriginalArg(0) String arg0) {
		return Static339.method5131(10, arg0);
	}
}
