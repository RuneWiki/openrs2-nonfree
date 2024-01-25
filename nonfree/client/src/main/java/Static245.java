import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!il", name = "u", descriptor = "D")
	public static double aDouble10;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "I")
	public static int anInt5279 = -1;

	@OriginalMember(owner = "client!il", name = "q", descriptor = "[I")
	public static final int[] anIntArray278 = new int[1000];

	@OriginalMember(owner = "client!il", name = "v", descriptor = "[I")
	public static final int[] anIntArray279 = new int[13];

	@OriginalMember(owner = "client!il", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
	public static void method4529() {
		if (Static491.anInt9082 < 0) {
			Static491.anInt9082 = 0;
			Static535.anInt9666 = -1;
			Static248.anInt5350 = -1;
		}
		if (Static491.anInt9082 > Static303.anInt106) {
			Static491.anInt9082 = Static303.anInt106;
			Static248.anInt5350 = -1;
			Static535.anInt9666 = -1;
		}
		if (Static536.anInt9677 < 0) {
			Static248.anInt5350 = -1;
			Static536.anInt9677 = 0;
			Static535.anInt9666 = -1;
		}
		if (Static536.anInt9677 > Static303.anInt111) {
			Static536.anInt9677 = Static303.anInt111;
			Static535.anInt9666 = -1;
			Static248.anInt5350 = -1;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!vq;)Ljava/lang/String;")
	public static String method4530(@OriginalArg(1) Class2_Sub6_Sub21 arg0) {
		return arg0.aString106 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZII)V")
	public static void method4531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg1, 7);
		local8.method3088();
		local8.anInt3368 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!jba;I)V")
	public static void method4532(@OriginalArg(0) Class2_Sub8 arg0) {
		arg0.aBoolean723 = false;
		if (arg0.aClass2_Sub29_6 != null) {
			arg0.aClass2_Sub29_6.anInt7487 = 0;
		}
		for (@Pc(22) Class2_Sub8 local22 = arg0.method8815(); local22 != null; local22 = arg0.method8817()) {
			method4532(local22);
		}
	}
}
