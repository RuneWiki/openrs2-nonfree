import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "Lclient!ct;")
	public static Class30 aClass30_78;

	@OriginalMember(owner = "client!qp", name = "z", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!qp", name = "D", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BI)Lclient!mj;")
	public static Class135_Sub1 method4811(@OriginalArg(1) int arg0) {
		return Static12.aBoolean15 && Static276.anInt5384 <= arg0 && arg0 <= Static43.anInt5304 ? Static51.aClass135_Sub1Array1[arg0 - Static276.anInt5384] : null;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)V")
	public static void method4813() {
		@Pc(1) Class21 local1 = Static362.aClass21_179;
		synchronized (Static362.aClass21_179) {
			Static362.aClass21_179.method844(5);
		}
		local1 = Static266.aClass21_141;
		synchronized (Static266.aClass21_141) {
			Static266.aClass21_141.method844(5);
		}
	}
}
