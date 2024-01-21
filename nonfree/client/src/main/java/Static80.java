import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static80 {

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4 aClass1_Sub2_Sub1_Sub4_3;

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
	public static int anInt2280 = 2;

	@OriginalMember(owner = "client!jb", name = "Y", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[104][104];

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
	public static int anInt2285 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ag;ILclient!ag;)V")
	public static void method1682(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		Static180.aClass4_101 = arg1;
		Static30.aClass4_35 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	public static void method1683() {
		aClass1_Sub2_Sub1_Sub4_3 = null;
		anIntArrayArray18 = null;
	}
}
