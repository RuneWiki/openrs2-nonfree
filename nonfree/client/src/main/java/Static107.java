import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "[I")
	public static int[] anIntArray188;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "Lclient!cg;")
	public static Class22 aClass22_36;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "Lclient!nb;")
	public static Class111 aClass111_6 = new Class111(128);

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "[Lclient!wl;")
	public static Class4_Sub2_Sub23[] aClass4_Sub2_Sub23Array2 = new Class4_Sub2_Sub23[14];

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	public static void method1826() {
		for (@Pc(8) int local8 = -1; local8 < Static85.anInt1730; local8++) {
			@Pc(18) int local18;
			if (local8 == -1) {
				local18 = 2047;
			} else {
				local18 = Static291.anIntArray457[local8];
			}
			@Pc(26) Class13_Sub5_Sub1 local26 = Static100.aClass13_Sub5_Sub1Array1[local18];
			if (local26 != null) {
				Static48.method954(local26, local26.method4219());
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public static void method1827() {
		Static121.aClass172_21.method4346();
		Static50.aClass172_9.method4346();
	}
}
