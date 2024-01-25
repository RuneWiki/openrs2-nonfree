import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static536 {

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	public static int anInt9043;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Z")
	public static boolean aBoolean672 = false;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!mba;")
	public static final Class216 aClass216_64 = new Class216();

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
	public static int anInt9044 = 0;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!bk;")
	public static final Class34 aClass34_3 = new Class34("WIP", 2);

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Lclient!wn;")
	public static final Class379 aClass379_9 = new Class379("", 18);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lclient!vi;")
	public static Class354_Sub1 method7772(@OriginalArg(0) int arg0) {
		return Static246.aBoolean356 && arg0 >= Static597.anInt9711 && arg0 <= Static527.anInt8945 ? Static230.aClass354_Sub1Array1[arg0 - Static597.anInt9711] : null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	public static void method7773(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static201.anInt3739 = 1;
		Static550.anInt9147 = -1;
		Static63.method1054(arg0, false, arg1);
	}
}
