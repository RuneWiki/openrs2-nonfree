import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static246 {

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
	public static int[] anIntArray653;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "Lclient!kf;")
	public static final Class171 aClass171_17 = new Class171(3);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)Lclient!pd;")
	public static Class139_Sub1 method7301(@OriginalArg(1) int arg0) {
		return Static241.aBoolean325 && arg0 >= Static217.anInt4047 && Static561.anInt7076 >= arg0 ? Static393.aClass139_Sub1Array1[arg0 - Static217.anInt4047] : null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Z")
	public static boolean method7302(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static173.method2703(arg1, arg0) || Static461.method6453(arg0, arg1);
	}
}
