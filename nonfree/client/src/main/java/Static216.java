import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static216 {

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "I")
	public static int anInt1164 = 0;

	@OriginalMember(owner = "client!hha", name = "h", descriptor = "Lclient!v;")
	public static final Class370 aClass370_3 = new Class370(16);

	@OriginalMember(owner = "client!hha", name = "i", descriptor = "I")
	public static int anInt1166 = 7000;

	@OriginalMember(owner = "client!hha", name = "f", descriptor = "I")
	public static int anInt1170 = anInt1166;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(BII)Z")
	public static boolean method1138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static59.method3611(arg0, arg1) || Static628.method8567(arg0, arg1);
	}

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "(I)V")
	public static void method1139() {
		Static582.aClass306_42.method6936();
		Static555.aClass306_40.method6936();
	}
}
