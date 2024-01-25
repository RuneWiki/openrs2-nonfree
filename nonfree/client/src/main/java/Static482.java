import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!sda", name = "w", descriptor = "I")
	public static int anInt7692;

	@OriginalMember(owner = "client!sda", name = "B", descriptor = "[Lclient!f;")
	public static Class38[] aClass38Array24;

	@OriginalMember(owner = "client!sda", name = "J", descriptor = "I")
	public static int anInt7702;

	@OriginalMember(owner = "client!sda", name = "z", descriptor = "Z")
	public static boolean aBoolean657 = true;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIZLclient!mv;IIZ)V")
	public static void method6224(@OriginalArg(0) int arg0, @OriginalArg(3) Class229 arg1, @OriginalArg(5) int arg2) {
		Static25.anInt442 = 1;
		Static467.aClass229_108 = arg1;
		Static338.anInt5808 = 2;
		Static90.anInt1607 = 0;
		Static431.aBoolean568 = false;
		Static268.anInt4384 = arg0;
		Static518.anInt8283 = arg2;
		Static488.aClass2_Sub3_Sub2_5 = null;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)V")
	public static void method6225() {
		Static268.anInt4384 = 0;
		Static488.aClass2_Sub3_Sub2_5 = null;
		Static431.aBoolean568 = false;
		Static338.anInt5808 = 2;
		Static25.anInt442 = 1;
		Static90.anInt1607 = -1;
		Static518.anInt8283 = -1;
		Static467.aClass229_108 = null;
	}

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "(B)Lclient!mi;")
	public static Class6 method6228() {
		try {
			return (Class6) Class.forName("Class6_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}
