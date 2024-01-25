import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "client!de", name = "e", descriptor = "[J")
	public static long[] aLongArray1;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!mn;")
	public static Class171 aClass171_15;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_27 = new Class25(58, 2);

	@OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
	public static final int[] anIntArray86 = new int[8];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIZZ)V")
	public static void method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static404.anInt2752 == 0) {
			Static428.method5826(false);
		} else {
			Static334.anInt5990 = Static404.anInt2752;
			Static357.method5001(0);
		}
		Static418.anInt7175 = arg1;
		Static59.anInt6508 = arg2;
		Static114.aBoolean111 = arg3;
		Static5.method5387(arg0);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)Z")
	public static boolean method1062() {
		return Static452.anInt951 == 0 ? Static386.aClass2_Sub8_Sub2_6.method3324() : true;
	}
}
