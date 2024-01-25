import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static264 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public static int anInt4297;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_40 = new Class132(50);

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public static int anInt4298 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILclient!za;I)V")
	public static void method3521(@OriginalArg(1) int arg0, @OriginalArg(2) Class163 arg1, @OriginalArg(3) int arg2) {
		Static411.aClass159ArrayArray1 = new Class159[arg2][arg0];
		Static420.aClass163_11 = arg1;
		if (Static4.anIntArray7 != null) {
			Static328.aClass109_4 = Static84.method1210(Static4.anIntArray7[1], Static4.anIntArray7[4], Static4.anIntArray7[2], Static4.anIntArray7[0], Static4.anIntArray7[5], Static4.anIntArray7[3]);
		}
		Static61.aClass159_1 = new Class159();
		Static12.method158();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
	public static void method3522(@OriginalArg(0) int arg0) {
		Static301.anInt3360 = arg0;
		Static49.anInt857 = -1;
		Static49.anInt857 = -1;
		Static108.method1681();
	}
}
