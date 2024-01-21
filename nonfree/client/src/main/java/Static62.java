import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!pg;")
	public static Class1_Sub1_Sub14 aClass1_Sub1_Sub14_1;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "[Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4[] aClass1_Sub1_Sub12_Sub4Array6;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
	public static int anInt1654;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Lclient!ga;")
	public static Class30 aClass30_25;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	public static int anInt1652 = 0;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean81 = false;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!ed;")
	public static Class23 aClass23_613 = Static169.method2903("Lade Texturen )2 ");

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method1111() {
		aClass23_613 = null;
		aClass1_Sub1_Sub14_1 = null;
		aClass1_Sub1_Sub12_Sub4Array6 = null;
		aClass30_25 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lclient!la;")
	public static Class1_Sub1_Sub11 method1112(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub11 local10 = (Class1_Sub1_Sub11) Static181.aClass79_30.method2657((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static61.method1110(Static148.aClass30_56, arg0, Static58.aClass30_24);
		if (local10 != null) {
			Static181.aClass79_30.method2658((long) arg0, local10);
		}
		return local10;
	}
}
