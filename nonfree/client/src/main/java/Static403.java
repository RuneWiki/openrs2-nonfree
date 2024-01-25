import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!nea", name = "e", descriptor = "Lclient!rg;")
	public static Class310 aClass310_85;

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "Z")
	public static final boolean aBoolean494 = false;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIII)V")
	public static void method6105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static410.anInt7068 && arg0 <= Static281.anInt5188) {
			@Pc(17) int local17 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1);
			@Pc(23) int local23 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg3);
			Static507.method7599(arg0, local23, local17, arg2);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILclient!sw;I)V")
	public static void method6107(@OriginalArg(1) Class342 arg0, @OriginalArg(2) int arg1) {
		if (Static399.aBoolean493) {
			arg1 = 0;
			Static399.aBoolean493 = false;
		}
		if (Static470.aClass342_1 != null && Static470.aClass342_1.method8187(arg0)) {
			return;
		}
		Static470.aClass342_1 = arg0;
		Static94.aLong71 = Static26.method382();
		Static192.anInt10923 = arg1;
		Static649.anInt10648 = arg1;
		if (Static649.anInt10648 == 0) {
			Static226.method5055();
			return;
		}
		Static198.aFloat29 = Static196.aFloat28;
		Static536.aFloat179 = Static241.aFloat73;
		Static197.aClass47_1 = Static581.aClass47_3;
		Static290.aClass366_3 = Static240.aClass366_1;
		Static610.aFloat205 = Static299.aFloat80;
		Static357.aFloat88 = Static119.aFloat13;
		Static128.aFloat15 = Static214.aFloat31;
		Static207.anInt3632 = Static392.anInt6825;
		Static234.anInt4557 = Static665.anInt10879;
		Static569.anInt9430 = Static91.anInt1594;
		Static646.aFloat207 = Static187.aFloat25;
		if (Static240.aClass366_1 == null) {
			return;
		}
		if (Static240.aClass366_1.method8690()) {
			Static290.aClass366_3 = Static240.aClass366_1.method8695();
			Static240.aClass366_1 = Static290.aClass366_3;
		}
		if (Static240.aClass366_1 != null && Static470.aClass342_1.aClass366_4 != Static240.aClass366_1) {
			Static240.aClass366_1.method8689(Static470.aClass342_1.aClass366_4);
			return;
		}
	}
}
