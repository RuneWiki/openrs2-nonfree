import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!im", name = "O", descriptor = "Lclient!aj;")
	public static Class10 aClass10_6;

	@OriginalMember(owner = "client!im", name = "V", descriptor = "I")
	public static int anInt2409;

	@OriginalMember(owner = "client!im", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString86 = "cyan:";

	@OriginalMember(owner = "client!im", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString87 = "flash1:";

	@OriginalMember(owner = "client!im", name = "Y", descriptor = "Z")
	public static boolean aBoolean180 = false;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(II)V")
	public static void method1921() {
		Static130.aClass169_72.method4020(5);
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(II)Lclient!vf;")
	public static Class1_Sub1_Sub12_Sub2 method1922(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub12_Sub2 local10 = (Class1_Sub1_Sub12_Sub2) Static81.aClass169_55.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static286.aClass138_79.method3346(arg0, 0);
		local10 = new Class1_Sub1_Sub12_Sub2(local21);
		local10.method4423(Static197.aClass103Array3, null);
		Static81.aClass169_55.method4016(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZB)V")
	public static void method1924(@OriginalArg(0) boolean arg0) {
		Static12.method174(arg0, Static287.anInt5450, Static159.anInt3348, Static136.anInt2696);
	}
}
