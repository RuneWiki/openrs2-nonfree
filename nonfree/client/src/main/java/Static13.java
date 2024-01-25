import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "[I")
	public static int[] anIntArray26;

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "Lclient!h;")
	public static final Class114 aClass114_2 = new Class114("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "Z")
	public static final boolean aBoolean54 = false;

	@OriginalMember(owner = "client!ah", name = "N", descriptor = "Lclient!vp;")
	public static Class309 aClass309_1 = null;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIB)V")
	public static void method705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static341.anInt6379 = arg1;
		Static299.anInt4491 = arg0;
		Static95.anInt2358 = 0;
		Static92.anInt2338 = 0;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	public static void method709() {
		if (Static450.aBoolean500) {
			return;
		}
		Static534.method7798(Static171.aClass206ArrayArrayArray1);
		if (Static406.aClass206ArrayArrayArray3 != null) {
			Static534.method7798(Static406.aClass206ArrayArrayArray3);
		}
		Static450.aBoolean500 = true;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!pm;BLclient!pm;)V")
	public static void method710(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg0.aClass1_Sub1_60 != null) {
			arg0.method7493();
		}
		arg0.aClass1_Sub1_60 = arg1;
		arg0.aClass1_Sub1_59 = arg1.aClass1_Sub1_59;
		arg0.aClass1_Sub1_60.aClass1_Sub1_59 = arg0;
		arg0.aClass1_Sub1_59.aClass1_Sub1_60 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!kda;)I")
	public static int method713(@OriginalArg(1) Class160 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4213(Static173.anInt3750)) {
			local5++;
		}
		if (arg0.method4213(Static424.anInt7376)) {
			local5++;
		}
		if (arg0.method4213(Static288.anInt5628)) {
			local5++;
		}
		if (arg0.method4213(Static476.anInt7310)) {
			local5++;
		}
		if (arg0.method4213(Static252.anInt4932)) {
			local5++;
		}
		if (arg0.method4213(Static163.anInt3578)) {
			local5++;
		}
		if (arg0.method4213(Static167.anInt3663)) {
			local5++;
		}
		if (arg0.method4213(Static294.anInt5701)) {
			local5++;
		}
		if (arg0.method4213(Static266.anInt5160)) {
			local5++;
		}
		if (arg0.method4213(Static137.anInt3221)) {
			local5++;
		}
		if (arg0.method4213(Static227.anInt8839)) {
			local5++;
		}
		if (arg0.method4213(Static246.anInt4757)) {
			local5++;
		}
		if (arg0.method4213(Static82.anInt2170)) {
			local5++;
		}
		if (arg0.method4213(Static271.anInt1860)) {
			local5++;
		}
		if (arg0.method4213(Static260.anInt5086)) {
			local5++;
		}
		if (arg0.method4213(Static534.anInt9244)) {
			local5++;
		}
		return local5;
	}
}
