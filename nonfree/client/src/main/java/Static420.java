import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "[I")
	public static int[] anIntArray471;

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_155 = new Class200(47, 6);

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
	public static int anInt7024 = 0;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/io/File;BLjava/lang/String;)V")
	public static void method6131(@OriginalArg(0) File arg0, @OriginalArg(2) String arg1) {
		Static184.aHashtable2.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	public static void method6132() {
		if (Static429.aClass2_Sub7_Sub20_3 != null) {
			Static429.aClass2_Sub7_Sub20_3 = null;
			Static437.method6296(Static573.anInt9360, Static220.anInt4137, Static122.anInt2592, Static540.anInt8699);
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
	public static void method6133() {
		@Pc(10) Class2_Sub2 local10;
		for (local10 = (Class2_Sub2) Static536.aClass114_42.method2772(); local10 != null; local10 = (Class2_Sub2) Static536.aClass114_42.method2762()) {
			if (local10.aBoolean18) {
				local10.method8920();
			} else {
				local10.aBoolean17 = true;
				if (local10.anInt129 >= 0 && local10.anInt119 >= 0 && Static456.anInt7428 > local10.anInt129 && local10.anInt119 < Static5.anInt112) {
					Static191.method3267(local10);
				}
			}
		}
		for (local10 = (Class2_Sub2) Static387.aClass114_33.method2772(); local10 != null; local10 = (Class2_Sub2) Static387.aClass114_33.method2762()) {
			if (local10.aBoolean18) {
				local10.method8920();
			} else {
				local10.aBoolean17 = true;
			}
		}
	}
}
