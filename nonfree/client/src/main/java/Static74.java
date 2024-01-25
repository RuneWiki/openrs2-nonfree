import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
	public static int anInt1436;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
	public static int anInt1437;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_22 = new Class11(2, 3);

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	public static int anInt1434 = 0;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_23 = new Class11(3, 3);

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
	public static int anInt1435 = 1;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!oe;)V")
	public static void method1194(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub15_5 != null) {
			arg0.aClass2_Sub15_5.anInt4952 = 0;
		}
		arg0.aBoolean436 = false;
		for (@Pc(23) Class2_Sub2 local23 = arg0.method5266(); local23 != null; local23 = arg0.method5268()) {
			method1194(local23);
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
	public static void method1196() {
		Static285.aBoolean377 = true;
	}
}
