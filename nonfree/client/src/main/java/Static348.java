import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
	public static int anInt6739;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I")
	public static int method5527(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static587.anInt10308 - 1; local3++) {
			if (arg0 < Static630.anIntArray621[local3] + Static546.anIntArray513[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static587.anInt10308 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
	public static void method5528() {
		Static368.aClass331ArrayArray2 = new Class331[Static640.aClass237_151.method6311()][];
		Static21.aClass331ArrayArray1 = new Class331[Static640.aClass237_151.method6311()][];
		Static557.aBooleanArray27 = new boolean[Static640.aClass237_151.method6311()];
	}
}
