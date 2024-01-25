import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!el", name = "Hg", descriptor = "I")
	public static int anInt2704;

	@OriginalMember(owner = "client!el", name = "zg", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_48 = new Class73(35, -1);

	@OriginalMember(owner = "client!el", name = "Zg", descriptor = "I")
	public static final int anInt2721 = 1400;

	@OriginalMember(owner = "client!el", name = "ab", descriptor = "(I)V")
	public static void method2478() {
		Static25.aClass14_1.ha(((float) Static140.aClass6_Sub48_Sub1_1.anInt9009 * 0.1F + 0.7F) * 1.1523438F);
		Static25.aClass14_1.YA(Static33.anInt908, 0.69921875F, 1.2F, -200.0F, (float) -240, -200.0F);
		Static25.aClass14_1.X(Static452.anInt7784, -1, 0);
		Static25.aClass14_1.method6835(Static199.aClass26_5);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!wda;")
	public static Class4_Sub1 method2480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class267 local14 = local7.aClass267_3; local14 != null; local14 = local14.aClass267_2) {
			@Pc(18) Class4_Sub1 local18 = local14.aClass4_Sub1_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort126 == arg1 && local18.aShort125 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
