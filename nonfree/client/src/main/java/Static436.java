import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!qk", name = "U", descriptor = "Lclient!bi;")
	public static Class31 aClass31_97;

	@OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
	public static int anInt7494;

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "[I")
	public static final int[] anIntArray613 = new int[5];

	@OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
	public static int anInt7484 = 13156520;

	@OriginalMember(owner = "client!qk", name = "N", descriptor = "Lclient!gj;")
	public static final Class124 aClass124_46 = new Class124();

	@OriginalMember(owner = "client!qk", name = "X", descriptor = "[[I")
	public static final int[][] anIntArrayArray63 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!qk", name = "Y", descriptor = "Lclient!db;")
	public static final Class64 aClass64_359 = new Class64(29, -1);

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
	public static void method6199(@OriginalArg(0) int arg0) {
		if (!Static189.aClass4_Sub2_Sub1_1.aBoolean660) {
			arg0 = -1;
		}
		if (Static110.anInt2613 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(27) Class262 local27 = Static421.aClass15_6.method307(arg0);
			@Pc(33) Class268 local33 = local27.method5797();
			if (local33 == null) {
				arg0 = -1;
			} else {
				Static147.aClass161_4.method3826(new Point(local27.anInt6954, local27.anInt6959), Static379.aCanvas13, local33.method5870(), local33.method5881(), local33.method5873());
				Static110.anInt2613 = arg0;
			}
		}
		if (arg0 == -1 && Static110.anInt2613 != -1) {
			Static147.aClass161_4.method3826(new Point(), Static379.aCanvas13, -1, -1, null);
			Static110.anInt2613 = -1;
		}
	}
}
