import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	public static int anInt7818 = 0;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
	public static final int[] anIntArray483 = new int[50];

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "J")
	public static long aLong192 = 0L;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "[I")
	public static final int[] anIntArray484 = new int[13];

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public static int anInt7819 = -1;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V")
	public static void method6550() {
		@Pc(21) Class3_Sub26 local21 = Static640.method8636(Static552.aClass344_116, Static403.aClass294_3);
		Static472.method5189(local21);
		for (@Pc(29) Class3_Sub50 local29 = (Class3_Sub50) Static40.aClass307_5.method7421(); local29 != null; local29 = (Class3_Sub50) Static40.aClass307_5.method7428()) {
			if (!local29.method8670()) {
				local29 = (Class3_Sub50) Static40.aClass307_5.method7421();
				if (local29 == null) {
					break;
				}
			}
			if (local29.anInt9574 == 0) {
				Static488.method7168(true, true, local29);
			}
		}
		if (Static529.aClass108_11 != null) {
			Static139.method3135(Static529.aClass108_11);
			Static529.aClass108_11 = null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z")
	public static boolean method6551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static199.method3939(arg1, arg0) & Static266.method6987(arg1, arg0);
	}
}
