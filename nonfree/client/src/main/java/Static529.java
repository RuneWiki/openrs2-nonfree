import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static529 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
	public static int anInt8343;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	public static int anInt8344;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!cba;")
	public static final Class38 aClass38_6 = new Class38();

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_60 = new Class10(32);

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Z")
	public static boolean aBoolean647 = true;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method6995() {
		Static490.aClass10_56.method263();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(CI)Z")
	public static boolean method6996(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
