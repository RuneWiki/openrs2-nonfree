import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!km", name = "h", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	public static void method3242() {
		Static280.aClass10_38.method156();
		Static304.aClass30_10.method509();
		Static93.aClass30_2.method509();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)V")
	public static void method3244(@OriginalArg(1) int arg0) {
		Static244.anInt4835 = arg0;
		Static142.anInt3109 = -1;
		Static23.anInt5708 = -1;
		Static201.method3720();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
	public static void method3247(@OriginalArg(1) int arg0) {
		if (!Static264.method4436(arg0)) {
			return;
		}
		@Pc(12) Class26[] local12 = Static298.aClass26ArrayArray1[arg0];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			@Pc(23) Class26 local23 = local12[local18];
			if (local23 != null) {
				local23.anInt554 = 1;
				local23.anInt541 = 0;
				local23.anInt567 = 0;
			}
		}
	}
}
