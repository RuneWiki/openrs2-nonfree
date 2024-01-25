import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cv", name = "F", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "(I)V")
	public static void method1380() {
		Static117.anIntArray218 = null;
		Static458.anIntArray600 = null;
		Static97.anIntArray194 = null;
		Static44.anIntArray72 = null;
		Static117.anIntArray219 = null;
		Static409.aBoolean517 = false;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	public static void method1381(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static239.anInt4818 = 1;
		Static523.anInt8857 = -1;
		Static257.method4354(false, arg1, arg0);
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(II)Z")
	public static boolean method1383(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class5_Sub47 local15 = (Class5_Sub47) Static521.aClass99_78.method2526(); local15 != null; local15 = (Class5_Sub47) Static521.aClass99_78.method2519()) {
			if (Static448.method6334(local15.anInt8474) && (long) arg0 == local15.aLong237) {
				return true;
			}
		}
		return false;
	}
}
