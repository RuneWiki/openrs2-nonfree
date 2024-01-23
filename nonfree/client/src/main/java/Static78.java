import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!hh", name = "Y", descriptor = "[Lclient!k;")
	public static Class1_Sub16[] aClass1_Sub16Array1 = new Class1_Sub16[2048];

	@OriginalMember(owner = "client!hh", name = "ab", descriptor = "Lclient!ia;")
	public static Class51 aClass51_596 = Static64.method1101(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!hh", name = "gb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_598 = Static64.method1101("Loading textures )2 ");

	@OriginalMember(owner = "client!hh", name = "eb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_597 = aClass51_598;

	@OriginalMember(owner = "client!hh", name = "hb", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[200];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLclient!ia;Lclient!ia;ILclient!ia;)V")
	public static void method1352(@OriginalArg(1) Class51 arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(4) Class51 arg2) {
		Static216.method3597(-1, arg1, 9, arg0, arg2);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
	public static void method1353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(24) int local24;
		if (arg1 != Static157.anInt3431) {
			Static73.anIntArray105 = new int[arg1];
			for (local24 = 0; local24 < arg1; local24++) {
				Static73.anIntArray105[local24] = (local24 << 12) / arg1;
			}
			Static157.anInt3431 = arg1;
			Static74.anInt1679 = arg1 - 1;
			Static177.anInt3895 = arg1 == 64 ? 2048 : 4096;
		}
		if (Static187.anInt4033 == arg0) {
			return;
		}
		if (Static157.anInt3431 == arg0) {
			Static211.anIntArray334 = Static73.anIntArray105;
		} else {
			Static211.anIntArray334 = new int[arg0];
			for (local24 = 0; local24 < arg0; local24++) {
				Static211.anIntArray334[local24] = (local24 << 12) / arg0;
			}
		}
		Static148.anInt3213 = arg0 - 1;
		Static187.anInt4033 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(II)Lclient!cj;")
	public static Class25 method1354(@OriginalArg(1) int arg0) {
		@Pc(10) Class25 local10 = (Class25) Static11.aClass53_1.method1501((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static65.aClass70_18.method3509(arg0, 4);
		local10 = new Class25();
		if (local20 != null) {
			local10.method541(arg0, new Class1_Sub16(local20));
		}
		Static11.aClass53_1.method1497(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!mb;I)V")
	public static void method1356(@OriginalArg(0) Class70 arg0) {
		Static65.aClass70_18 = arg0;
		Static161.anInt3483 = Static65.aClass70_18.method3532(4);
	}
}
