import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
	public static int anInt2252;

	@OriginalMember(owner = "client!mq", name = "A", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "[I")
	public static final int[] anIntArray235 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)I")
	public static int method1622(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local10 += 8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return arg0 + local10;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIBI)V")
	public static void method1624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(arg1, 11);
		local8.method2957();
		local8.anInt3819 = arg2;
		local8.anInt3820 = arg0;
	}
}
