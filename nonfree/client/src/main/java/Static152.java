import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "Lclient!jd;")
	public static final Class119 aClass119_10 = new Class119(1, 2, 2, 0);

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
	public static int anInt3315 = 0;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V")
	public static void method2701() {
		if (Static411.aClass190_10 == null) {
			return;
		}
		if (Static411.aClass190_10.anInt5799 == 1) {
			Static411.aClass190_10 = null;
			return;
		}
		if (Static411.aClass190_10.anInt5799 == 2) {
			Static130.method4841(2, Static112.aClass103_6, Static304.aString54);
			Static411.aClass190_10 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public static void method2702() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Static399.anInt6923; local7++) {
			for (@Pc(10) int local10 = 0; local10 < Static127.anInt2696; local10++) {
				if (Static32.method785(local7, Static151.aClass217ArrayArrayArray3, local10, true, local5)) {
					local5++;
				}
				if (local5 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
	public static void method2703() {
		if (Static142.anInt3209 == 10) {
			Static293.method2805(28);
		}
		if (Static142.anInt3209 == 30) {
			Static293.method2805(25);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)Z")
	public static boolean method2705(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
