import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static106 {

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "Lclient!tl;")
	public static Class155 aClass155_18 = new Class155(4);

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
	public static int anInt2271 = 0;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ISIIILjava/lang/String;Ljava/lang/String;J)V")
	public static void method1718(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) long arg6) {
		if (Static218.aBoolean267 || Static111.anInt2398 >= 500) {
			return;
		}
		Static165.aStringArray17[Static111.anInt2398] = arg5;
		Static24.aStringArray3[Static111.anInt2398] = arg4;
		Static153.anIntArray326[Static111.anInt2398] = arg0 == -1 ? Static78.anInt1880 : arg0;
		Static213.aShortArray71[Static111.anInt2398] = arg1;
		Static34.aLongArray6[Static111.anInt2398] = arg6;
		Static218.anIntArray494[Static111.anInt2398] = arg2;
		Static52.anIntArray147[Static111.anInt2398] = arg3;
		Static111.anInt2398++;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
	public static void method1719() {
		Static153.aClass155_30.method4354();
	}
}
