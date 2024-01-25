import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!il", name = "m", descriptor = "I")
	public static int anInt2601;

	@OriginalMember(owner = "client!il", name = "q", descriptor = "I")
	public static int anInt2605;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "I")
	public static int anInt2596 = 20;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[128][128];

	@OriginalMember(owner = "client!il", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString101 = "Loaded title screen";

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V")
	public static void method2205(@OriginalArg(1) int arg0) {
		Static277.method4957();
		Static268.method4815();
		@Pc(16) int local16 = Static53.method1079(arg0).anInt4399;
		if (local16 == 0) {
			return;
		}
		@Pc(23) int local23 = Static81.anIntArray119[arg0];
		if (local16 == 5) {
			Static120.anInt2335 = local23;
		}
		if (local16 == 6) {
			Static174.anInt5775 = local23;
		}
		if (local16 == 9) {
			Static265.anInt5466 = local23;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	public static void method2206() {
		@Pc(22) int local22;
		for (@Pc(12) int local12 = -1; local12 < Static167.anInt3454; local12++) {
			if (local12 == -1) {
				local22 = 2047;
			} else {
				local22 = Static212.anIntArray415[local12];
			}
			@Pc(30) Class10_Sub1_Sub2_Sub2 local30 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local22];
			if (local30 != null && local30.anInt4043 > 0) {
				local30.anInt4043--;
				if (local30.anInt4043 == 0) {
					local30.aString150 = null;
				}
			}
		}
		for (local22 = 0; local22 < Static271.anInt5578; local22++) {
			@Pc(66) int local66 = Static79.anIntArray672[local22];
			@Pc(70) Class10_Sub1_Sub2_Sub1 local70 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local66];
			if (local70 != null && local70.anInt4043 > 0) {
				local70.anInt4043--;
				if (local70.anInt4043 == 0) {
					local70.aString150 = null;
				}
			}
		}
	}
}
