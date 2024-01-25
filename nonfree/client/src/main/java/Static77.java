import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "[I")
	public static int[] anIntArray114;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "Z")
	public static final boolean aBoolean116 = false;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZII)I")
	public static int method1347(@OriginalArg(1) int arg0) {
		@Pc(19) Class5_Sub38 local19 = Static478.method7058(arg0, false);
		if (local19 == null) {
			return Static177.aClass195_1.method4493(arg0).anInt2591;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local19.anIntArray364.length; local31++) {
			if (local19.anIntArray364[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static177.aClass195_1.method4493(arg0).anInt2591 - local19.anIntArray364.length;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIII)V")
	public static void method1348(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class5_Sub5_Sub21 local13 = Static101.method1629(9, arg2);
		local13.method8958();
		local13.anInt10537 = arg1;
		local13.anInt10530 = arg0;
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)I")
	public static int method1351() {
		return Static438.anIntArray599 == null ? 0 : Static438.anIntArray599.length * 2;
	}
}
