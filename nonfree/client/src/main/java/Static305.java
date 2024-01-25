import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static305 {

	@OriginalMember(owner = "client!jka", name = "v", descriptor = "D")
	public static double aDouble14;

	@OriginalMember(owner = "client!jka", name = "C", descriptor = "I")
	public static int anInt2216;

	@OriginalMember(owner = "client!jka", name = "D", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_41 = new Class349(85, 6);

	@OriginalMember(owner = "client!jka", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString23 = null;

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIIILclient!nca;ZI)V")
	public static void method1955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class254 arg2, @OriginalArg(6) int arg3) {
		if (arg3 <= 0) {
			Static704.method9423(arg0, arg2, arg1);
			return;
		}
		Static112.aBoolean215 = false;
		Static450.anInt7299 = arg1;
		Static515.anInt8213 = arg0;
		Static39.anInt535 = 1;
		Static478.aClass2_Sub23_Sub5_4 = null;
		Static403.anInt6656 = 0;
		Static24.aClass254_16 = arg2;
		Static225.anInt3586 = Static442.aClass2_Sub23_Sub5_3.method7696(255) / arg3;
		if (Static225.anInt3586 < 1) {
			Static225.anInt3586 = 1;
		}
	}
}
