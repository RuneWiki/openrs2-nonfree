import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	public static int anInt4179 = 128;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1451 = Static151.method2243("blinken1:");

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	public static final int anInt4182 = 0;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1452 = Static151.method2243("(U2");

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
	public static void method2940(@OriginalArg(0) int arg0) {
		Static39.anInt4450 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method2942() {
		if (Static151.aClass36_3 != null) {
			Static151.aClass36_3.method862();
			Static151.aClass36_3 = null;
		}
		Static15.method242();
		Static19.method346();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static164.aClass95Array1[local17].method2676();
		}
		Static113.method1743();
		System.gc();
		Static149.method2223();
		Static164.aBoolean148 = false;
		Static164.anInt3460 = -1;
		Static19.method343();
		Static2.method55(10);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!pb;I)Lclient!nc;")
	public static Class2_Sub15 method2943(@OriginalArg(1) Class71 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) byte[] local15 = arg0.method2121(arg1);
		return local15 == null ? null : new Class2_Sub15(local15);
	}
}
