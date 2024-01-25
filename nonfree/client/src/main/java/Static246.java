import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray26 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!eq;J)V")
	public static void method3821(@OriginalArg(1) Class66 arg0, @OriginalArg(2) long arg1) {
		Static396.anInt5084 = Static336.anInt5844;
		Static223.anInt4049 = 0;
		Static336.anInt5844 = 0;
		@Pc(14) long local14 = Static449.method6552();
		for (@Pc(23) Class57_Sub4 local23 = (Class57_Sub4) Static4.aClass111_9.method2688(); local23 != null; local23 = (Class57_Sub4) Static4.aClass111_9.method2690()) {
			if (local23.method3258(arg0, arg1)) {
				Static223.anInt4049++;
			}
		}
		if (Static221.aBoolean266 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static4.aClass111_9.method2689() + ", running: " + Static223.anInt4049 + ". Particles: " + Static336.anInt5844 + ". Time taken: " + (Static449.method6552() - local14) + "ms");
		}
	}
}
