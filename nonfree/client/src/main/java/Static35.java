import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "Lclient!tq;")
	public static Class285 aClass285_3;

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
	public static int anInt912;

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
	public static int anInt913;

	@OriginalMember(owner = "client!bh", name = "R", descriptor = "Lclient!mo;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!bh", name = "X", descriptor = "Lclient!xa;")
	public static Class119 aClass119_3;

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[200];

	@OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
	public static int anInt921 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!pt;IIIII)V")
	public static void method858(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5751 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static329.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class103 local35 = Static513.aClass103Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt5751; local37++) {
							if (arg0.aClass3_Sub30Array5[local37] == local35.aClass3_Sub30_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass3_Sub30Array5[arg0.anInt5751++] = local35.aClass3_Sub30_1;
						if (arg0.anInt5751 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt5751; local7 < 4; local7++) {
			arg0.aClass3_Sub30Array5[local7] = null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIILclient!ta;ZZLclient!oa;)V")
	public static void method859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class59 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class5 arg5) {
		if (arg4) {
			Static483.aClass119_29.method6678((Static480.anInt8652 - Static483.aClass119_29.AA()) / 2, (Static412.anInt7547 - Static483.aClass119_29.a()) / 2);
			Static435.aClass119_25.method6678((Static480.anInt8652 - Static435.aClass119_25.AA()) / 2, 18);
		}
		@Pc(30) String local30 = "";
		if (Static8.aClass44_1 == Static222.aClass44_2) {
			local30 = Static148.aClass67_47.method1934(Static193.anInt7803);
		} else if (Static332.aClass44_4 == Static222.aClass44_2) {
			local30 = Static210.aClass67_63.method1934(Static193.anInt7803);
		}
		arg3.method7265(arg0, Static412.anInt7547 / 2 - 26, local30, -1, Static480.anInt8652 / 2);
		@Pc(68) int local68 = Static412.anInt7547 / 2 - 18;
		arg5.method7484(Static480.anInt8652 / 2 - 152, local68, 304, 34, arg1, 0);
		arg5.method7484(Static480.anInt8652 / 2 - 151, local68 + 1, 302, 32, 0, 0);
		arg5.C(Static480.anInt8652 / 2 - 150, local68 + 2, Static47.anInt9385 * 3, 30, arg2, 0);
		arg5.C(Static47.anInt9385 * 3 + Static480.anInt8652 / 2 - 150, local68 + 2, 300 - Static47.anInt9385 * 3, 30, 0, 0);
		arg3.method7265(arg0, Static412.anInt7547 / 2 + 4, Static7.aString6, -1, Static480.anInt8652 / 2);
	}
}
