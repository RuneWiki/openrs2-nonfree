import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "Lclient!ha;")
	public static Class143 aClass143_6;

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "[Lclient!qda;")
	public static Class59[] aClass59Array9;

	@OriginalMember(owner = "client!jca", name = "k", descriptor = "I")
	public static int anInt4238;

	@OriginalMember(owner = "client!jca", name = "l", descriptor = "I")
	public static int anInt4239;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
	public static void method3771() {
		Static459.aClass335_41.method7773();
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)V")
	public static void method3773() {
		@Pc(5) Class281 local5 = null;
		try {
			local5 = Static308.method4735("2");
			@Pc(22) Class5_Sub15 local22 = new Class5_Sub15(Static132.anInt2227 * 6 + 3);
			local22.method3651(1);
			local22.method3660(Static132.anInt2227);
			for (@Pc(32) int local32 = 0; local32 < Static205.anIntArray184.length; local32++) {
				if (Static155.aBooleanArray3[local32]) {
					local22.method3660(local32);
					local22.method3679(Static205.anIntArray184[local32]);
				}
			}
			local5.method6892(local22.anInt4144, 0, local22.aByteArray45);
		} catch (@Pc(62) Exception local62) {
		}
		try {
			if (local5 != null) {
				local5.method6893();
			}
		} catch (@Pc(69) Exception local69) {
		}
		Static3.aLong1 = Static124.method1947();
		Static439.aBoolean565 = false;
	}
}
