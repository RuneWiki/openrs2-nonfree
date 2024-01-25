import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "Lclient!rm;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "I")
	public static int anInt2479;

	@OriginalMember(owner = "client!eea", name = "h", descriptor = "Lclient!ra;")
	public static Class27 aClass27_3;

	@OriginalMember(owner = "client!eea", name = "i", descriptor = "[Lclient!sa;")
	public static Class10[] aClass10Array5;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "[I")
	public static final int[] anIntArray194 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
	public static int anInt2476 = -1;

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_33 = new Class186(2, -1);

	@OriginalMember(owner = "client!eea", name = "j", descriptor = "I")
	public static int anInt2480 = 0;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!vn;I)V")
	public static void method2292(@OriginalArg(0) int arg0, @OriginalArg(1) Class308 arg1) {
		if (Static195.aBoolean249) {
			arg0 = 0;
			Static195.aBoolean249 = false;
		}
		if (Static530.aClass308_2 != null && Static530.aClass308_2.method7364(arg1)) {
			return;
		}
		Static530.aClass308_2 = arg1;
		Static41.aLong20 = Static93.method2172();
		Static268.anInt5183 = arg0;
		Static390.anInt6801 = arg0;
		if (Static390.anInt6801 == 0) {
			Static246.method4152();
			return;
		}
		Static76.aFloat72 = Static336.aFloat123;
		Static365.aClass25_6 = Static160.aClass25_3;
		Static539.aFloat204 = Static298.aFloat111;
		Static263.aFloat101 = Static122.aFloat78;
		Static500.anInt8480 = Static55.anInt1551;
		Static455.anInt7660 = Static128.anInt3067;
		Static291.aFloat109 = Static123.aFloat79;
		Static304.aFloat112 = Static261.aFloat100;
		Static191.anInt8072 = Static246.anInt4758;
		Static49.aFloat57 = Static354.aFloat126;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIII)V")
	public static void method2294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class1_Sub1_Sub13 local13 = Static476.method6225(4, arg3);
		local13.method4919();
		local13.anInt5690 = arg2;
		local13.anInt5680 = arg1;
		local13.anInt5686 = arg0;
	}
}
