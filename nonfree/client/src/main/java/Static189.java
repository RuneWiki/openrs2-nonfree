import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
	public static int anInt3335;

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "Lclient!kia;")
	public static final Class206 aClass206_6 = new Class206(12, 7);

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
	public static int anInt3336 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIII)V")
	public static void method2878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static713.aClass3_Sub55_31.aClass15_Sub8_4.method2888() != 0 && arg2 != 0 && Static581.anInt9508 < 50 && arg5 != -1) {
			Static326.aClass239Array1[Static581.anInt9508++] = new Class239((byte) 1, arg5, arg2, arg1, arg4, arg3, arg0, (Class19_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)Z")
	public static boolean method2879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IJI)Ljava/lang/String;")
	public static String method2880(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Static490.method7108(arg1);
		@Pc(10) int local10 = Static321.aCalendar10.get(5);
		@Pc(21) int local21 = Static321.aCalendar10.get(2);
		@Pc(25) int local25 = Static321.aCalendar10.get(1);
		return arg0 == 3 ? Static181.method2789(arg1, arg0) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static677.aStringArrayArray2[arg0][local21] + "-" + local25;
	}
}
