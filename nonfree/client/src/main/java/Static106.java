import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "J")
	public static long aLong45 = 0L;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[8];

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)Lclient!ga;")
	public static Class1_Sub2_Sub4 method1653(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub4 local10 = (Class1_Sub2_Sub4) Static229.aClass88_8.method1652((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(32) byte[] local32 = Static111.aClass134_53.method3009(method1655(arg0), Static277.method4958(arg0));
		local10 = new Class1_Sub2_Sub4();
		if (local32 != null) {
			local10.method1538(new Class1_Sub21(local32));
		}
		Static229.aClass88_8.method1651((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)I")
	private static int method1655(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)Lclient!cm;")
	public static Class1_Sub2_Sub2 method1656(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub2 local10 = (Class1_Sub2_Sub2) Static137.aClass88_10.method1652((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = Static62.aClass134_148.method3009(arg0 & 0x7FFF, 1);
		} else {
			local27 = Static44.aClass134_24.method3009(arg0, 1);
		}
		local10 = new Class1_Sub2_Sub2();
		if (local27 != null) {
			local10.method875(new Class1_Sub21(local27));
		}
		if (arg0 >= 32768) {
			local10.method874();
		}
		Static137.aClass88_10.method1651((long) arg0, local10);
		return local10;
	}
}
