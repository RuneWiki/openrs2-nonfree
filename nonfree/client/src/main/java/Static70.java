import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static70 {

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	public static int anInt1833;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "[I")
	public static final int[] anIntArray107 = new int[25];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIZIILclient!he;I)V")
	public static void method1418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class100 arg3) {
		Static445.anInt7975 = 1;
		Static386.anInt6865 = 0;
		Static342.aBoolean369 = false;
		Static35.aClass100_7 = arg3;
		Static399.anInt7157 = arg0;
		Static387.anInt6869 = arg2;
		Static336.anInt5845 = Static387.aClass6_Sub4_Sub2_3.method710() / arg1;
		if (Static336.anInt5845 < 1) {
			Static336.anInt5845 = 1;
		}
	}
}
