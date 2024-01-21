import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "Lclient!c;")
	public static Class10 aClass10_16;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "[I")
	public static int[] anIntArray18 = new int[32];

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "[I")
	public static int[] anIntArray19 = new int[5];

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "Lclient!ai;")
	public static Class6 aClass6_127 = Static38.method685(")4l");

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public static void method306() {
		anIntArray19 = null;
		aClass10_16 = null;
		anIntArray18 = null;
		aClass6_127 = null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!h;II)V")
	public static void method308(@OriginalArg(0) Class2_Sub3_Sub5_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static37.method661(arg0.anInt2674, arg1, arg0.anInt2672);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	public static void method309() {
		@Pc(3) Class15 local3 = Static86.aClass15_1;
		synchronized (Static86.aClass15_1) {
			Static138.anInt3226 = Static65.anInt1617;
			@Pc(15) int local15;
			if (Static76.anInt1827 >= 0) {
				while (Static76.anInt1827 != Static153.anInt3534) {
					local15 = Static56.anIntArray225[Static153.anInt3534];
					Static153.anInt3534 = Static153.anInt3534 + 1 & 0x7F;
					if (local15 < 0) {
						Static161.aBooleanArray19[~local15] = false;
					} else {
						Static161.aBooleanArray19[local15] = true;
					}
				}
			} else {
				for (local15 = 0; local15 < 112; local15++) {
					Static161.aBooleanArray19[local15] = false;
				}
				Static76.anInt1827 = Static153.anInt3534;
			}
			Static65.anInt1617 = Static176.anInt4072;
		}
	}
}
