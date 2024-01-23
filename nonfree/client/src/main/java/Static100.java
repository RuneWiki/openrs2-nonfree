import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
	public static int anInt2131;

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "[I")
	public static int[] anIntArray223;

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "[J")
	public static long[] aLongArray4 = new long[500];

	@OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
	public static int anInt2135 = 0;

	@OriginalMember(owner = "client!hh", name = "U", descriptor = "[Lclient!hc;")
	public static Class12_Sub3_Sub1[] aClass12_Sub3_Sub1Array1 = new Class12_Sub3_Sub1[32768];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)I")
	public static int method1636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(47) int local47 = Static244.method3723(arg0 - 1, arg1 + -1) + Static244.method3723(arg0 + 1, arg1 + -1) + Static244.method3723(arg0 - 1, arg1 - -1) + Static244.method3723(arg0 + 1, arg1 + 1);
		@Pc(77) int local77 = Static244.method3723(arg0 - 1, arg1) + Static244.method3723(arg0 + 1, arg1) + Static244.method3723(arg0, arg1 + -1) + Static244.method3723(arg0, arg1 + 1);
		@Pc(82) int local82 = Static244.method3723(arg0, arg1);
		return local82 / 4 + local77 / 8 + local47 / 16;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	public static void method1637() {
		aClass12_Sub3_Sub1Array1 = null;
		anIntArray223 = null;
		aLongArray4 = null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
	public static void method1638(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub2_Sub21 local13 = Static39.method4121(arg0, 4);
		local13.method4361();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLclient!lc;)I")
	public static int method1639(@OriginalArg(1) Class98 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2391(Static294.anInt4284)) {
			local5++;
		}
		if (arg0.method2391(Static16.anInt314)) {
			local5++;
		}
		return local5;
	}
}
