import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!ah;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!ci;")
	public static Class38 aClass38_17;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_21 = new Class212(75, 3);

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_69 = new Class214(18, 17);

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_70 = new Class214(61, 10);

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_22 = new Class212(82, -1);

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Lclient!hl;")
	public static final Class96 aClass96_8 = new Class96(64);

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
	public static int anInt1921 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BZ)Z")
	public static boolean method1689(@OriginalArg(1) boolean arg0) {
		@Pc(14) boolean local14 = Static30.aClass30_3.method2040();
		if (local14 == arg0) {
			return true;
		}
		if (!arg0) {
			Static30.aClass30_3.method2039();
		} else if (!Static30.aClass30_3.method2094()) {
			arg0 = false;
		}
		if (local14 == arg0) {
			return false;
		} else {
			Static157.aClass185_Sub1_1.aBoolean401 = arg0;
			Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
			return true;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
	public static void method1690(@OriginalArg(1) int arg0) {
		if (!Static104.method1974(arg0)) {
			return;
		}
		@Pc(19) Class240[] local19 = Static122.aClass240ArrayArray2[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class240 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt6847 = 1;
				local27.anInt6867 = 0;
				local27.anInt6890 = 0;
			}
		}
	}
}
