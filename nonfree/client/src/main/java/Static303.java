import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static303 {

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray39;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!qa;Lclient!kr;)V")
	public static void method4785(@OriginalArg(1) Class122 arg0, @OriginalArg(2) Class171 arg1) {
		if (Static305.aBoolean409) {
			return;
		}
		arg0.Z(0);
		Static136.aClass2_17 = arg0.method7220(Static552.method3547(arg1, Static156.anInt2895));
		Static136.aClass2_17.method7364((Static83.anInt1567 - Static136.aClass2_17.EA()) / 2, (Static350.anInt6255 - Static136.aClass2_17.ma()) / 2);
		Static146.aClass2_18 = arg0.method7220(Static552.method3547(arg1, Static320.anInt5858));
		Static146.aClass2_18.method7364((Static83.anInt1567 - Static146.aClass2_18.EA()) / 2, 18);
		Static305.aBoolean409 = true;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)Z")
	public static boolean method4788(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
