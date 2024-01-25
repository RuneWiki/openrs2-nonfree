import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qe", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[200];

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
	public static int anInt5236 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
	public static void method4261(@OriginalArg(1) int arg0) {
		if (!Static413.aClass49_Sub1_1.aBoolean238) {
			arg0 = -1;
		}
		if (arg0 == Static410.anInt6935) {
			return;
		}
		if (arg0 != -1) {
			@Pc(21) Class214 local21 = Static357.aClass5_2.method75(arg0);
			@Pc(25) Class216 local25 = local21.method4435();
			if (local25 == null) {
				arg0 = -1;
			} else {
				Static24.aClass196_1.method3897(local25.method4469(), new Point(local21.anInt5468, local21.anInt5469), Static391.aCanvas5, local25.method4463(), local25.method4462());
				Static410.anInt6935 = arg0;
			}
		}
		if (arg0 == -1 && Static410.anInt6935 != -1) {
			Static24.aClass196_1.method3897(-1, new Point(), Static391.aCanvas5, null, -1);
			Static410.anInt6935 = -1;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method4262(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub2_Sub17 local14 = Static34.method1709(3, arg1);
		local14.method5529();
		local14.aString71 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)Z")
	public static boolean method4264(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}
}
