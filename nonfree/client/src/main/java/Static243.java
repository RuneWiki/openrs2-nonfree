import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_161 = new Class67(72, 3);

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "Lclient!mt;")
	public static final Class165 aClass165_8 = new Class165(6, 0, 4, 2);

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!jg;Lclient!jg;IIIIIBII)V")
	public static void method3488(@OriginalArg(0) Class11_Sub1_Sub3 arg0, @OriginalArg(1) Class11_Sub1_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg0.method2636();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class85 local21 = (Class85) Static4.aClass77_3.method1387((long) local7);
		if (local21 == null) {
			@Pc(28) Class52[] local28 = Static467.method894(Static178.aClass185_49, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static186.aClass117_3.method5707(local28[0]);
			Static4.aClass77_3.method1396(local21, (long) local7);
		}
		Static145.method1820(arg1.anInt6430, arg1.anInt6428, arg2 >> 1, 0, arg1.method2635() * 64, arg3 >> 1, arg1.aByte90);
		@Pc(74) int local74 = Static99.anIntArray133[0] + arg4 - 18;
		@Pc(82) int local82 = local74 + arg6 / 4 * 18;
		@Pc(92) int local92 = Static99.anIntArray133[1] + arg5 - 54 - 16;
		@Pc(100) int local100 = local92 + arg6 % 4 * 18;
		local21.method5406(local82, local100);
		if (arg1 == arg0) {
			Static186.aClass117_3.method5666(local100 - 1, 18, 18, -256, local82 - 1);
		}
		@Pc(122) Class111_Sub2 local122 = Static304.method732();
		local122.anInt3588 = local82;
		local122.anInt3585 = local100;
		local122.anInt3586 = local82 + 16;
		local122.aClass11_Sub1_Sub3_1 = arg0;
		local122.anInt3587 = local100 + 16;
		Static57.aClass63_1.method1024(local122);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)V")
	public static void method3490(@OriginalArg(0) byte arg0) {
		if (Static380.aByteArrayArrayArray17 == null) {
			Static380.aByteArrayArrayArray17 = new byte[4][Static147.anInt2300][Static293.anInt4886];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static147.anInt2300; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static293.anInt4886; local27++) {
					Static380.aByteArrayArrayArray17[local19][local23][local27] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
	public static int method3491() {
		if ((double) Static430.aFloat54 == 3.0D) {
			return 37;
		} else if ((double) Static430.aFloat54 == 4.0D) {
			return 50;
		} else if ((double) Static430.aFloat54 == 6.0D) {
			return 75;
		} else if ((double) Static430.aFloat54 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BIZ)V")
	public static void method3492(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class1_Sub28 local8 = Static133.method1698(arg1, arg0);
		if (local8 != null) {
			local8.method5953();
		}
	}
}
