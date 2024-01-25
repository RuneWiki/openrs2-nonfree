import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
	public static int anInt3428;

	@OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
	public static int anInt3432;

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
	public static int anInt3420 = -2;

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
	public static int anInt3421 = 0;

	@OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
	public static int anInt3427 = 0;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "(I)[Lclient!so;")
	public static Class314[] method2842() {
		return new Class314[] { Static521.aClass314_12, Static292.aClass314_10, Static121.aClass314_6, Static168.aClass314_8, Static65.aClass314_2, Static52.aClass314_1, Static135.aClass314_7, Static593.aClass314_14, Static88.aClass314_4, Static277.aClass314_9, Static105.aClass314_5, Static564.aClass314_13, Static86.aClass314_3, Static427.aClass314_11 };
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!ig;Ljava/lang/String;)I")
	public static int method2843(@OriginalArg(1) Class8_Sub8 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt10588;
		@Pc(10) byte[] local10 = Static145.method3026(arg1);
		arg0.method8538(local10.length);
		arg0.anInt10588 += Static554.aClass33_1.method1274(arg0.aByteArray107, local10, arg0.anInt10588, 0, local10.length);
		return arg0.anInt10588 - local6;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
	public static void method2846() {
		Static594.aClass236_100.method6253();
	}
}
