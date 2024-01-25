import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!in", name = "F", descriptor = "I")
	public static int anInt2693;

	@OriginalMember(owner = "client!in", name = "x", descriptor = "I")
	public static int anInt2689 = 16777215;

	@OriginalMember(owner = "client!in", name = "C", descriptor = "I")
	public static int anInt2691 = 0;

	@OriginalMember(owner = "client!in", name = "E", descriptor = "I")
	public static int anInt2692 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BIIJ)V")
	public static void method2459(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(25) int local25 = (int) arg2 >> 20 & 0x3;
		@Pc(32) int local32 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static155.method2784(arg1, true, 0, 0, 0, arg0, local10, local25, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			return;
		}
		@Pc(69) Class156 local69 = Static111.method1967(local32);
		@Pc(82) int local82;
		@Pc(79) int local79;
		if (local25 == 0 || local25 == 2) {
			local79 = local69.anInt4769;
			local82 = local69.anInt4775;
		} else {
			local79 = local69.anInt4775;
			local82 = local69.anInt4769;
		}
		@Pc(93) int local93 = local69.anInt4742;
		if (local25 != 0) {
			local93 = (local93 << local25 & 0xF) + (local93 >> 4 - local25);
		}
		Static155.method2784(arg1, true, local79, local93, local82, arg0, 0, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
	}
}
