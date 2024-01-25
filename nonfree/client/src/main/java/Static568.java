import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!vu", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString87 = null;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZI)V")
	public static void method7643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub7_Sub18 local13 = Static543.method7218(5, arg0);
		local13.method7326();
		local13.anInt8802 = arg1;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!rb;)V")
	public static void method7644(@OriginalArg(0) Class41_Sub2 arg0) {
		Static511.aClass45_12.MA(arg0.anInt9444, arg0.anInt9443 + (arg0.method7844() >> 1), arg0.anInt9442, Static200.anIntArray199);
		arg0.anInt9440 = Static200.anIntArray199[0];
		arg0.anInt9441 = Static200.anIntArray199[1];
		arg0.anInt9439 = Static200.anIntArray199[2];
	}
}
