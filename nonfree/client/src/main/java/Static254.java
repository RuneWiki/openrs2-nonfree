import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!jba", name = "K", descriptor = "I")
	public static int anInt5025;

	@OriginalMember(owner = "client!jba", name = "F", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_71 = new Class274(70, 3);

	@OriginalMember(owner = "client!jba", name = "J", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!jba", name = "O", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_49 = new Class269(41, 11);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZI)V")
	public static void method4191(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static387.anInt6978 != -1) {
				Static535.method7477(Static387.anInt6978);
			}
			for (@Pc(13) Class2_Sub37 local13 = (Class2_Sub37) Static206.aClass222_14.method5474(); local13 != null; local13 = (Class2_Sub37) Static206.aClass222_14.method5472()) {
				if (!local13.method8600()) {
					local13 = (Class2_Sub37) Static206.aClass222_14.method5474();
					if (local13 == null) {
						break;
					}
				}
				Static450.method4870(local13, true, false);
			}
			Static387.anInt6978 = -1;
			Static206.aClass222_14 = new Class222(8);
			Static588.method8118();
			Static387.anInt6978 = Static485.anInt8300;
			Static146.method2807(false);
			Static539.method7534();
			Static639.method8547(Static387.anInt6978);
		}
		Static457.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)V")
	public static void method4192(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static288.anInt5415 = arg0;
		Static606.anInt9911 = 2;
		Static490.method7019(false, arg2, arg1);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)I")
	public static int method4194(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (arg0 * local27 >> 12) + 40960;
		return local13 * local35 >> 12;
	}
}
