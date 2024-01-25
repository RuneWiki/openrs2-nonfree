import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gi", name = "N", descriptor = "[Lclient!hu;")
	public static Class44[] aClass44Array8;

	@OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
	public static int anInt3327 = 0;

	@OriginalMember(owner = "client!gi", name = "W", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_27 = new Class181(35, 6);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!vfa;I)V")
	public static void method2955(@OriginalArg(0) int arg0, @OriginalArg(2) Class357 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray23 != null) {
			@Pc(13) Class5_Sub9 local13 = new Class5_Sub9();
			local13.aClass357_2 = arg1;
			local13.anObjectArray1 = arg1.anObjectArray23;
			Static82.method1317(local13);
		}
		Static402.anInt9331 = arg1.anInt9804;
		Static343.anInt5922 = arg1.anInt9846;
		Static497.anInt8481 = arg1.anInt9822;
		Static202.aBoolean295 = true;
		Static139.anInt2304 = arg0;
		Static288.anInt4696 = arg1.anInt9871;
		Static522.anInt7724 = arg1.anInt9823;
		Static42.anInt714 = arg2;
		Static637.method8778(arg1);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
	public static void method2957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1006) {
			Static82.method1326(Static132.aClass74_12, arg1, arg2);
		} else if (arg0 == 1004) {
			Static82.method1326(Static286.aClass74_29, arg1, arg2);
		} else if (arg0 == 1007) {
			Static82.method1326(Static614.aClass74_30, arg1, arg2);
		} else if (arg0 == 1001) {
			Static82.method1326(Static508.aClass74_24, arg1, arg2);
		} else if (arg0 == 1012) {
			Static82.method1326(Static93.aClass74_6, arg1, arg2);
		}
	}
}
