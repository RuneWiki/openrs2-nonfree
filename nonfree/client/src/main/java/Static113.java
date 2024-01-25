import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
	public static int anInt2539;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "[I")
	public static final int[] anIntArray228 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
	public static int anInt2538 = 10;

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
	public static int anInt2542 = -1;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZI)I")
	public static int method2466(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub26 local14 = Static42.method991(false, arg0);
		if (local14 == null) {
			return Static218.method3878(arg0).anInt5615;
		}
		@Pc(23) int local23 = 0;
		for (@Pc(33) int local33 = 0; local33 < local14.anIntArray270.length; local33++) {
			if (local14.anIntArray270[local33] == -1) {
				local23++;
			}
		}
		return local23 + Static218.method3878(arg0).anInt5615 - local14.anIntArray270.length;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIB)V")
	public static void method2468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static47.aClass119_29 = new Class119(arg1);
		Static301.aClass119_156 = new Class119(arg0);
	}
}
