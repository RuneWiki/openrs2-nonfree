import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1383 = Static151.method2243("<col=00ffff>");

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[Lclient!ha;")
	public static final Class39[] aClass39Array3 = new Class39[5000];

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	public static int anInt3974 = 0;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1384 = Static151.method2243("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V")
	public static void method2745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static181.anInt3784 == 0 || arg1 == 0 || Static83.anInt1739 >= 50 || arg0 == -1) {
			return;
		}
		Static53.anIntArray85[Static83.anInt1739] = arg0;
		Static56.anIntArray89[Static83.anInt1739] = arg1;
		Static108.anIntArray221[Static83.anInt1739] = arg2;
		Static125.aClass27Array1[Static83.anInt1739] = null;
		Static111.anIntArray225[Static83.anInt1739] = 0;
		Static83.anInt1739++;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z")
	public static boolean method2746() {
		try {
			return Static7.method1727();
		} catch (@Pc(14) IOException local14) {
			Static156.method2312();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(59) String local59 = "T2 - " + Static158.anInt3381 + "," + Static78.anInt1622 + "," + Static49.anInt1076 + " - " + Static35.anInt838 + "," + (Static116.anInt2535 + Static186.aClass7_Sub2_Sub2_1.anIntArray275[0]) + "," + (Static186.aClass7_Sub2_Sub2_1.anIntArray274[0] + Static153.anInt3278) + " - ";
			for (@Pc(61) int local61 = 0; Static35.anInt838 > local61 && local61 < 50; local61++) {
				local59 = local59 + Static108.aClass2_Sub11_Sub1_3.aByteArray26[local61] + ",";
			}
			Static84.method2582(local59, local19);
			Static202.method2942();
			return true;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!mb;Lclient!pb;Lclient!mb;)Lclient!bf;")
	public static Class2_Sub1_Sub2_Sub1 method2747(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(8) int local8 = arg1.method2114(arg2);
		@Pc(18) int local18 = arg1.method2142(arg0, local8);
		return Static113.method1741(arg1, local8, local18);
	}
}
