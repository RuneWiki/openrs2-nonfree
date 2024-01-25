import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
	public static int anInt3579 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
	public static void method3070(@OriginalArg(0) int arg0) {
		if (Static201.anInt3739 == 1) {
			Static213.anInt4387 = arg0;
		} else if (Static201.anInt3739 == 2) {
			Static154.anInt3148 = arg0;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)J")
	public static synchronized long method3071() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static32.aLong28) {
			Static475.aLong212 += Static32.aLong28 - local10;
		}
		Static32.aLong28 = local10;
		return local10 + Static475.aLong212;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)B")
	public static byte method3072(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
