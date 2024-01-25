import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Lclient!ia;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_3 = new Class146(6, 7);

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
	public static final int anInt2250 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLclient!ir;)V")
	public static void method1873(@OriginalArg(1) Class26_Sub2_Sub2 arg0) {
		if (arg0 instanceof Class26_Sub2_Sub2_Sub2) {
			@Pc(5) Class26_Sub2_Sub2_Sub2 local5 = (Class26_Sub2_Sub2_Sub2) arg0;
			if (local5.aClass66_1 != null) {
				Static350.method4847(Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 != local5.aByte95, local5);
			}
		} else if (arg0 instanceof Class26_Sub2_Sub2_Sub1) {
			@Pc(31) Class26_Sub2_Sub2_Sub1 local31 = (Class26_Sub2_Sub2_Sub1) arg0;
			Static114.method1702(local31.aByte95 != Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95, local31);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	public static void method1875(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static268.aClass211ArrayArrayArray4 = Static87.aClass211ArrayArrayArray1;
			Static92.aClass136Array1 = Static160.aClass136Array2;
		} else {
			Static268.aClass211ArrayArrayArray4 = Static182.aClass211ArrayArrayArray6;
			Static92.aClass136Array1 = Static328.aClass136Array3;
		}
		Static107.anInt1964 = Static268.aClass211ArrayArrayArray4.length;
	}
}
