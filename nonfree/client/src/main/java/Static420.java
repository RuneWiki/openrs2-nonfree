import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!pd;")
	public static final Class266 aClass266_1 = new Class266(0, 3, Static20.aClass19_8);

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!pd;")
	public static final Class266 aClass266_2 = new Class266(1, 3, Static20.aClass19_8);

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!pd;")
	public static final Class266 aClass266_3 = new Class266(2, 4, Static20.aClass19_4);

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!pd;")
	public static final Class266 aClass266_4 = new Class266(3, 1, Static20.aClass19_8);

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "Lclient!pd;")
	public static final Class266 aClass266_5 = new Class266(4, 2, Static20.aClass19_8);

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!pd;")
	public static final Class266 aClass266_6 = new Class266(5, 3, Static20.aClass19_8);

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "Lclient!pd;")
	public static final Class266 aClass266_7 = new Class266(6, 4, Static20.aClass19_8);

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
	public static final int anInt7240 = Static172.method2668(16);

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_79 = new Class46(12, 4);

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Lclient!pd;")
	public static Class266 method6386(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass266_1;
		} else if (arg0 == 1) {
			return aClass266_2;
		} else if (arg0 == 2) {
			return aClass266_3;
		} else if (arg0 == 3) {
			return aClass266_4;
		} else if (arg0 == 4) {
			return aClass266_5;
		} else if (arg0 == 5) {
			return aClass266_6;
		} else if (arg0 == 6) {
			return aClass266_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
	public static void method6387() {
		if (!Static285.aBoolean378) {
			return;
		}
		@Pc(13) Class295 local13 = Static324.method4920(Static375.anInt6224, Static570.anInt9615);
		if (local13 != null && local13.anObjectArray25 != null) {
			@Pc(27) Class5_Sub51 local27 = new Class5_Sub51();
			local27.anObjectArray33 = local13.anObjectArray25;
			local27.aClass295_19 = local13;
			Static370.method5457(local27);
		}
		Static578.anInt4589 = -1;
		Static289.anInt5055 = -1;
		Static285.aBoolean378 = false;
		if (local13 != null) {
			Static465.method6901(local13);
		}
	}
}
