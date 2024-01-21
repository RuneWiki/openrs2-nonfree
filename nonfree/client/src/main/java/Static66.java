import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public static int anInt2173 = 0;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_762 = Static56.method1206("Icons redrawn");

	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	public static int anInt2178 = 0;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "J")
	public static long aLong58 = 0L;

	@OriginalMember(owner = "client!na", name = "u", descriptor = "I")
	public static int anInt2181 = 0;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "Lclient!lc;")
	public static Class31 aClass31_763 = Static56.method1206(" x");

	@OriginalMember(owner = "client!na", name = "w", descriptor = "Z")
	public static final boolean aBoolean112 = false;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILclient!da;I)V")
	public static void method1348(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static12.anInt542 + Static106.anInt2795 & 0x7FF;
		@Pc(20) int local20 = arg2 * arg2 + arg0 * arg0;
		if (local20 > 6400) {
			return;
		}
		@Pc(28) int local28 = Static35.anIntArray205[local12];
		@Pc(32) int local32 = Static35.anIntArray200[local12];
		@Pc(40) int local40 = local32 * 256 / (Static57.anInt2681 + 256);
		@Pc(48) int local48 = local28 * 256 / (Static57.anInt2681 + 256);
		@Pc(58) int local58 = arg0 * local48 + arg2 * local40 >> 16;
		@Pc(68) int local68 = local48 * arg2 - local40 * arg0 >> 16;
		if (local20 > 2500) {
			arg1.method466(Static68.aClass2_Sub1_Sub3_Sub1_11, local58 + 4 + 94 - arg1.anInt687 / 2, -local68 + 79 - arg1.anInt689 / 2);
		} else {
			arg1.method469(local58 + 4 + 94 - arg1.anInt687 / 2, -(arg1.anInt689 / 2) + -4 + -local68 + 83);
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	public static void method1353() {
		aClass31_763 = null;
		aClass31_762 = null;
	}
}
