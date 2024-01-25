import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!np", name = "h", descriptor = "I")
	public static int anInt7422;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_103 = new Class100(2, 11);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIII)V")
	public static void method6009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg2 <= arg1) {
			for (local14 = arg2; local14 < arg1; local14++) {
				Static274.anIntArrayArray34[local14][arg3] = arg0;
			}
		} else {
			for (local14 = arg1; local14 < arg2; local14++) {
				Static274.anIntArrayArray34[local14][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
	public static void method6011() {
		Static354.aClass137_31.xa(((float) Static56.aClass14_Sub22_5.aClass21_Sub2_1.method837() * 0.1F + 0.7F) * Static333.aFloat150);
		Static354.aClass137_31.ZA(Static260.anInt4564, Static361.aFloat154, Static511.aFloat66, (float) (Static551.anInt7256 << 2), (float) (Static218.anInt4114 << 2), (float) (Static24.anInt443 << 2));
		Static354.aClass137_31.method7890(Static147.aClass144_1);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "()V")
	public static void method6012() {
		Static256.method3744(Static613.anInt10338);
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
	public static void method6013() {
		Static340.anInt9129 = -1;
		Static659.aClass20_37 = null;
	}
}
