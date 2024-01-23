import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "Lclient!jf;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
	public static int anInt5358 = 0;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "Z")
	public static volatile boolean aBoolean453 = true;

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "Lclient!tk;")
	public static Class159 aClass159_19 = null;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)Lclient!rd;")
	public static Class140 method4047(@OriginalArg(0) int arg0) {
		@Pc(10) Class140 local10 = (Class140) Static183.aClass61_31.method1384((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static211.aClass132_74.method3194(4, arg0);
		local10 = new Class140();
		if (local22 != null) {
			local10.method3493(arg0, new Class8_Sub2(local22));
		}
		Static183.aClass61_31.method1377((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
	public static void method4048(@OriginalArg(0) int arg0) {
		Static185.anInt3679--;
		if (Static185.anInt3679 == arg0) {
			return;
		}
		Static301.method495(Static57.aStringArray19, arg0 + 1, Static57.aStringArray19, arg0, Static185.anInt3679 - arg0);
		Static301.method495(Static161.aStringArray47, arg0 + 1, Static161.aStringArray47, arg0, Static185.anInt3679 - arg0);
		Static301.method494(Static65.anIntArray476, arg0 + 1, Static65.anIntArray476, arg0, Static185.anInt3679 - arg0);
		Static301.method499(Static204.aShortArray34, arg0 + 1, Static204.aShortArray34, arg0, Static185.anInt3679 - arg0);
		Static301.method498(Static95.aLongArray6, arg0 + 1, Static95.aLongArray6, arg0, Static185.anInt3679 - arg0);
		Static301.method494(Static243.anIntArray368, arg0 + 1, Static243.anIntArray368, arg0, Static185.anInt3679 - arg0);
		Static301.method494(Static190.anIntArray283, arg0 + 1, Static190.anIntArray283, arg0, Static185.anInt3679 - arg0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I")
	public static int method4050() {
		return 2;
	}
}
