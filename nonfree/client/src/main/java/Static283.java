import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
	public static volatile int anInt5383 = -1;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "[I")
	public static final int[] anIntArray489 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZIZI)V")
	public static void method4782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static67.anInt1615 == 0) {
			Static297.method5075(false);
		} else {
			Static263.anInt5036 = Static67.anInt1615;
			Static253.method1025(0);
		}
		Static22.aBoolean24 = arg2;
		Static89.anInt2113 = arg3;
		Static130.anInt2813 = arg1;
		Static241.method5041(arg0);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public static void method4783() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static195.anInt3965; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static298.anInt5716; local13++) {
				if (Static154.method3024(true, Static98.aClass213ArrayArrayArray2, local9, local13, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
	public static void method4785() {
		Static117.aClass11_120.method214();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V")
	public static void method4786(@OriginalArg(1) int arg0) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(2, arg0);
		local8.method3539();
	}
}
