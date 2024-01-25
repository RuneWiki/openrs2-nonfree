import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!js;")
	public static Class105 aClass105_2;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "I")
	public static int anInt1100 = 0;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	public static int anInt1102 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method1189(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(3, arg1);
		local8.method5537();
		local8.aString59 = arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
	public static void method1191(@OriginalArg(1) int arg0) {
		if (Static196.anInt3850 == arg0) {
			return;
		}
		Static95.anInt6381 = Static237.anInt4532 = Static222.anIntArray338[arg0];
		Static147.aClass4_2.method4205(50, (int) ((double) Static95.anInt6381 * 34.46D));
		Static320.anIntArrayArray166 = new int[Static95.anInt6381][Static237.anInt4532];
		Static10.anIntArrayArray12 = new int[Static95.anInt6381][Static237.anInt4532];
		Static136.anIntArrayArrayArray5 = new int[4][Static95.anInt6381 >> 3][Static237.anInt4532 >> 3];
		for (@Pc(49) int local49 = 0; local49 < 4; local49++) {
			Static169.aClass151Array1[local49] = Static177.method3261(Static95.anInt6381, Static237.anInt4532);
		}
		Static66.aByteArrayArrayArray3 = new byte[4][Static95.anInt6381][Static237.anInt4532];
		Static17.method645(Static237.anInt4532, Static95.anInt6381);
		Static263.method4786(Static95.anInt6381 >> 3, Static237.anInt4532 >> 3, Static147.aClass4_2);
		Static196.anInt3850 = arg0;
	}
}
