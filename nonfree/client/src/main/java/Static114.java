import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!na", name = "w", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1024 = Static161.method2971("Connection timed out)3");

	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	public static int anInt3070 = 0;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1025 = Static161.method2971("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!na", name = "u", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1027 = aClass13_1024;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "[Lclient!ua;")
	public static Class83[] aClass83Array1 = new Class83[50];

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	public static void method2196() {
		aClass13_1024 = null;
		aClass83Array1 = null;
		aClass13_1027 = null;
		anIntArrayArrayArray4 = null;
		aClass13_1025 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IBII)V")
	public static void method2197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class20 local8 = Static15.method628(arg0, arg2);
		if (local8 != null && local8.anObjectArray13 != null) {
			@Pc(22) Class1_Sub23 local22 = new Class1_Sub23();
			local22.anObjectArray29 = local8.anObjectArray13;
			local22.aClass20_13 = local8;
			Static1.method43(local22);
		}
		Static157.anInt3723 = arg0;
		Static118.aBoolean233 = true;
		Static24.anInt870 = arg2;
		Static111.anInt3019 = arg1;
		Static125.method2300(local8);
	}
}
