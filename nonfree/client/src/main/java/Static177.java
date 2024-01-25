import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
	public static int anInt2099;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "Lclient!cr;")
	public static Class57 aClass57_2;

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "Z")
	public static boolean aBoolean167 = true;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
	public static int anInt2101 = 0;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "[Lclient!qea;")
	public static final Class1_Sub5[] aClass1_Sub5Array3 = new Class1_Sub5[8];

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)Z")
	public static boolean method1851() {
		if (Static253.aBoolean365) {
			try {
				Static602.method5582(Static412.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIII)V")
	public static void method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		Static250.method4000(arg3 + arg1, Static478.anIntArrayArray51[arg2], arg1 - arg3, arg0);
		@Pc(27) int local27 = -1;
		while (local9 > local7) {
			local27 += 2;
			local12 += local27;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(53) int[] local53 = Static478.anIntArrayArray51[local9 + arg2];
				@Pc(59) int[] local59 = Static478.anIntArrayArray51[arg2 - local9];
				@Pc(64) int local64 = arg1 + local7;
				@Pc(69) int local69 = arg1 - local7;
				Static250.method4000(local64, local53, local69, arg0);
				Static250.method4000(local64, local59, local69, arg0);
			}
			@Pc(87) int local87 = local9 + arg1;
			@Pc(91) int local91 = arg1 - local9;
			@Pc(97) int[] local97 = Static478.anIntArrayArray51[local7 + arg2];
			@Pc(103) int[] local103 = Static478.anIntArrayArray51[arg2 - local7];
			Static250.method4000(local87, local97, local91, arg0);
			Static250.method4000(local87, local103, local91, arg0);
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(IIIII)V")
	public static void method1858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(13) int local13 = 0; local13 < Static288.anInt5333; local13++) {
			@Pc(19) Rectangle local19 = Class220.aRectangleArray1[local13];
			if (arg2 < local19.width + local19.x && arg2 + arg1 > local19.x && arg0 < local19.y + local19.height && local19.y < arg3 + arg0) {
				Static510.aBooleanArray29[local13] = true;
			}
		}
	}
}
