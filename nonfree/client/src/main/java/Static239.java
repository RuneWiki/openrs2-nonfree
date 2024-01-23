import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "Lclient!c;")
	public static Class25_Sub1_Sub1 aClass25_Sub1_Sub1_2;

	@OriginalMember(owner = "client!se", name = "db", descriptor = "I")
	public static int anInt5264 = 255;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!kb;)Lclient!ug;")
	public static Class1_Sub2_Sub14 method4128(@OriginalArg(1) int arg0, @OriginalArg(2) Class83 arg1) {
		return Static182.method3508(arg1, arg0) ? Static125.method2133() : null;
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V")
	public static void method4130() {
		if (Static102.aBoolean119) {
			return;
		}
		if (Static205.aBoolean243) {
			Static25.aFloat19 = (int) Static25.aFloat19 - 17 & 0xFFFFFFF0;
		} else {
			Static18.aFloat18 += (-Static18.aFloat18 - 12.0F) / 2.0F;
		}
		Static102.aBoolean119 = true;
		Static37.aBoolean69 = true;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)I")
	public static int method4131(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V")
	public static void method4132(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static104.method831(arg0, 3);
		local8.method1189();
	}
}
