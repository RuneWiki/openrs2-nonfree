import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static158 {

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
	public static int anInt2992 = -1;

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "J")
	public static long aLong77 = 0L;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)Z")
	public static boolean method2335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	public static void method2336() {
		Static83.anInt1893 = 0;
		Static126.aClass258_19.method5527();
		Static126.aClass258_19.method5526(Static183.aClass4_Sub21_2);
		Static83.anInt1893++;
	}
}
