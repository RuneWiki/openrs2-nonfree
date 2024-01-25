import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!ee;")
	public static Class81 aClass81_3;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	public static int anInt1378;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!ae;")
	public static Class8 aClass8_18;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	public static int anInt1380;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Lclient!fe;")
	public static Class103 aClass103_3;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "J")
	public static long aLong44 = 20000000L;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLclient!sha;Lclient!sha;)V")
	public static void method1267(@OriginalArg(1) Class321 arg0, @OriginalArg(2) Class321 arg1) {
		@Pc(12) Class6_Sub26 local12 = Static268.method3981(Static377.aClass15_2, Static23.aClass289_5);
		local12.aClass6_Sub23_Sub1_2.method8364(arg1.anInt9040);
		local12.aClass6_Sub23_Sub1_2.method8347(arg1.anInt9048);
		local12.aClass6_Sub23_Sub1_2.method8342(arg0.anInt9048);
		local12.aClass6_Sub23_Sub1_2.method8405(arg0.anInt9061);
		local12.aClass6_Sub23_Sub1_2.method8357(arg0.anInt9040);
		local12.aClass6_Sub23_Sub1_2.method8405(arg1.anInt9061);
		Static670.method9077(local12);
	}
}
