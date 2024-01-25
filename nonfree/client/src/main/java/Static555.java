import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_134 = new Class200(95, -1);

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "[F")
	public static final float[] aFloatArray76 = new float[16];

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "Lclient!sm;")
	public static final Class311 aClass311_13 = new Class311("", 15);

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_135 = new Class200(71, 4);

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)V")
	public static void method8005(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub4_Sub12 local12 = Static556.method8018(7, arg0);
		local12.method3607();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V")
	public static void method8006(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub4_Sub12 local16 = Static556.method8018(16, arg0);
		local16.method3607();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZZ)I")
	public static int method8007(@OriginalArg(1) boolean arg0) {
		@Pc(11) int local11 = Static234.anInt4427;
		if (local11 == 0) {
			return arg0 ? 0 : Static207.anInt4031;
		} else if (local11 == 1) {
			return Static207.anInt4031;
		} else if (local11 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "()V")
	public static void method8008() {
		Static374.aClass301_3 = Static374.aClass301_2;
	}
}
