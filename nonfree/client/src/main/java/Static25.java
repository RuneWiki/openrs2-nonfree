import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!da", name = "k", descriptor = "[I")
	public static int[] anIntArray50;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "I")
	public static int anInt870 = -2;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "I")
	public static int anInt880 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)I")
	public static int method564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub14 local8 = (Class1_Sub14) Static17.aClass14_8.method569((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local8.anIntArray247.length; local31++) {
				if (arg1 == local8.anIntArray248[local31]) {
					local29 += local8.anIntArray247[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public static void method568() {
		anIntArray50 = null;
	}
}
