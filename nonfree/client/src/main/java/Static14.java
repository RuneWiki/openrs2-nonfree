import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ak", name = "K", descriptor = "[[Lclient!rr;")
	public static Class292[][] aClass292ArrayArray1;

	@OriginalMember(owner = "client!ak", name = "Q", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_9;

	@OriginalMember(owner = "client!ak", name = "A", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_9 = new Class47(44, 3);

	@OriginalMember(owner = "client!ak", name = "D", descriptor = "[I")
	public static final int[] anIntArray31 = new int[2];

	@OriginalMember(owner = "client!ak", name = "O", descriptor = "Z")
	public static final boolean aBoolean28 = false;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
	public static void method322() {
		for (@Pc(7) int local7 = 0; local7 < Static154.aByteArrayArrayArray4.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static154.aByteArrayArrayArray4[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static154.aByteArrayArrayArray4[0][0].length; local15++) {
					Static154.aByteArrayArrayArray4[local7][local11][local15] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!rr;)V")
	public static void method324(@OriginalArg(1) Class292 arg0) {
		if (arg0.lb == 5 && arg0.anInt7933 != -1) {
			Static473.method6576(arg0, Static240.aClass14_7);
		}
	}
}
