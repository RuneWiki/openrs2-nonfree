import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!vl", name = "T", descriptor = "[[I")
	public static int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!vl", name = "P", descriptor = "I")
	public static int anInt5844 = 0;

	@OriginalMember(owner = "client!vl", name = "S", descriptor = "I")
	public static int anInt5847 = 0;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V")
	public static void method4602(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static268.method4233(arg0)) {
			return;
		}
		@Pc(19) Class56[] local19 = Static262.aClass56ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(29) Class56 local29 = local19[local21];
			if (local29.anObjectArray9 != null) {
				@Pc(37) Class2_Sub12 local37 = new Class2_Sub12();
				local37.anObjectArray1 = local29.anObjectArray9;
				local37.aClass56_6 = local29;
				Static14.method248(local37, 2000000);
			}
		}
	}
}
