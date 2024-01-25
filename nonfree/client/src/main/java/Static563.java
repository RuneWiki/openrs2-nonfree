import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	public static int anInt9556;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray69;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!ul;")
	public static Class346 aClass346_2;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!vd;")
	public static Class353 aClass353_116;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "I")
	public static int anInt9559;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "[S")
	public static short[] aShortArray130 = new short[256];

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	public static void method8109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static117.aClass100_5 == null) {
			return;
		}
		@Pc(10) int local10 = Static406.anInt7520;
		@Pc(12) int local12 = Static316.anInt6064;
		Static182.method3325(arg0, arg1);
		if (Static469.anInt8256 == 0) {
			Static180.anInterface20_1 = null;
			Static180.anInterface20_1 = Static117.aClass100_5.method8839(Static117.aClass100_5.method8807(Static164.anInt3399, Static320.anInt6116), Static117.aClass100_5.method8796(Static164.anInt3399, Static320.anInt6116));
		} else if (Static469.anInt8256 == 1 && (Static363.anInterface20Array1 == null || local10 != Static406.anInt7520 || Static316.anInt6064 != local12)) {
			Static363.anInterface20Array1 = new Interface20[Static316.anInt6064 * Static406.anInt7520];
			for (@Pc(47) int local47 = 0; local47 < Static363.anInterface20Array1.length; local47++) {
				Static363.anInterface20Array1[local47] = Static117.aClass100_5.method8839(Static117.aClass100_5.method8807(Static345.anInt6515, Static11.anInt221), Static117.aClass100_5.method8796(Static345.anInt6515, Static11.anInt221));
			}
			Static302.anInt5876 = 1;
			Static446.anIntArray511 = new int[Static406.anInt7520 * Static316.anInt6064];
		}
		Static133.aBoolean183 = true;
	}
}
