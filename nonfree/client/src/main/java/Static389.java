import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "[I")
	public static final int[] anIntArray460 = new int[14];

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
	public static int anInt6778 = 0;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBII)I")
	public static int method5573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static587.anInt9497 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg0 - Static313.anInt4085;
		@Pc(30) int local30 = arg2 - Static313.anInt4096;
		for (@Pc(37) Class1_Sub27 local37 = (Class1_Sub27) Static313.aClass361_41.method7854(); local37 != null; local37 = (Class1_Sub27) Static313.aClass361_41.method7853()) {
			if (arg1 == local37.anInt5625) {
				@Pc(50) int local50 = local37.anInt5627;
				@Pc(53) int local53 = local37.anInt5623;
				@Pc(63) int local63 = local53 + Static313.anInt4096 | local50 + Static313.anInt4085 << 14;
				@Pc(82) int local82 = (local30 - local53) * (-local53 + local30) + (local21 - local50) * (local21 - local50);
				if (local14 < 0 || local82 < local16) {
					local14 = local63;
					local16 = local82;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII)Z")
	public static boolean method5574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface7 local11 = (Interface7) Static387.method5565(arg1, arg2, arg0);
		if (local11 != null) {
			local5 = Static104.method1873(local11) & true;
		}
		local11 = (Interface7) Static18.method537(arg1, arg2, arg0, ge.class);
		if (local11 != null) {
			local5 &= Static104.method1873(local11);
		}
		local11 = (Interface7) Static17.method507(arg1, arg2, arg0);
		if (local11 != null) {
			local5 &= Static104.method1873(local11);
		}
		return local5;
	}
}
