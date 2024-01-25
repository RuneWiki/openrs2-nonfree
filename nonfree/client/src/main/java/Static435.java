import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public static int anInt7354;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!uk;")
	public static final Class346 aClass346_6 = new Class346("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Lclient!le;")
	public static final Class204 aClass204_12 = new Class204();

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIII)Z")
	public static boolean method6486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static592.aBoolean843 || !Static157.aBoolean242) {
			return false;
		} else if (Static525.anInt8753 < 100) {
			return false;
		} else if (Static422.method6374(arg2, arg3, arg0)) {
			@Pc(26) int local26 = arg3 << Static162.anInt2830;
			@Pc(30) int local30 = arg0 << Static162.anInt2830;
			if (Static382.method8495(Static407.anInt7012, arg1, Static299.aClass40Array1[arg2].method8442(arg3, arg0), local30, local26, Static407.anInt7012)) {
				Static115.anInt1792++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ww;B)V")
	public static void method6488(@OriginalArg(0) Class14_Sub10 arg0) {
		arg0.aClass14_Sub1_23 = null;
		@Pc(17) int local17 = arg0.aClass14_Sub9Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			arg0.aClass14_Sub9Array1[local19].aBoolean809 = false;
		}
		@Pc(33) Class363[] local33 = Class175.aClass363Array1;
		synchronized (Class175.aClass363Array1) {
			if (Class175.aClass363Array1.length > local17 && Static494.anIntArray664[local17] < 200) {
				Class175.aClass363Array1[local17].method8480(arg0);
				@Pc(58) int local58 = Static494.anIntArray664[local17]++;
			}
		}
	}
}
