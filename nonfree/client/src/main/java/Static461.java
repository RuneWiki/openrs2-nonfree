import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString72;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
	public static int anInt7704;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "J")
	public static long aLong219 = 20000000L;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	public static int anInt7705 = 500;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public static void method6415(@OriginalArg(0) int arg0) {
		Static371.anInt6382 = arg0;
		@Pc(15) Class6 local15 = Static272.aClass6_29;
		synchronized (Static272.aClass6_29) {
			Static272.aClass6_29.method102();
		}
		local15 = Static220.aClass6_22;
		synchronized (Static220.aClass6_22) {
			Static220.aClass6_22.method102();
		}
	}
}
