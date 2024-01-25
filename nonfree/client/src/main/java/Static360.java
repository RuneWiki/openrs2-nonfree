import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static360 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_184 = new Class107(74, -1);

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!bf;")
	public static final Class21 aClass21_1 = new Class21();

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!uq;IB)V")
	public static void method4963(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) int arg2) {
		if (Static455.aClass251_14 != null || Static385.aBoolean436 || (arg1 == null || Static113.method2103(arg1) == null)) {
			return;
		}
		Static455.aClass251_14 = arg1;
		Static377.aClass251_10 = Static113.method2103(arg1);
		Static290.anInt5067 = 0;
		Static237.aBoolean415 = false;
		Static296.anInt5168 = arg0;
		Static369.anInt6061 = arg2;
	}
}
