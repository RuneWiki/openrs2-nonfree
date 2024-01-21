import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_758 = Static187.method3089("Lade)3)3)3");

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_759 = Static187.method3089("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILclient!ee;III)Lclient!ee;")
	public static Class8_Sub5 method1238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) long local4 = (long) arg4;
		@Pc(10) Class8_Sub5 local10 = (Class8_Sub5) Static143.aClass77_9.method2259(local4);
		if (local10 == null) {
			@Pc(21) Class8_Sub7 local21 = Static135.method1997(Static106.aClass3_Sub1_15, arg4);
			if (local21 == null) {
				return null;
			}
			local10 = local21.method2007(64, 768, -50, -10, -50);
			Static143.aClass77_9.method2257(local10, local4);
		}
		@Pc(43) int local43 = arg3.method2042();
		@Pc(46) int local46 = arg3.method2049();
		@Pc(49) int local49 = arg3.method2044();
		@Pc(52) int local52 = arg3.method2046();
		local10 = local10.method2043(true);
		if (arg5 != 0) {
			local10.method2048(arg5);
		}
		@Pc(64) Class8_Sub5_Sub1 local64 = (Class8_Sub5_Sub1) local10;
		if (Static64.method1027(arg0 + local49, local43 + arg2, Static192.anInt4180) != arg1 || arg1 != Static64.method1027(local52 + arg0, local46 + arg2, Static192.anInt4180)) {
			for (@Pc(92) int local92 = 0; local92 < local64.anInt2786; local92++) {
				local64.anIntArray236[local92] += Static64.method1027(local64.anIntArray234[local92] + arg0, local64.anIntArray235[local92] + arg2, Static192.anInt4180) - arg1;
			}
			local64.aBoolean164 = false;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!vd;BZ)V")
	public static void method1240(@OriginalArg(0) Class92 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(19) int local19 = Static82.aClass1_Sub3_Sub1_Sub3_Sub1_2.method2455(arg0, 250);
		@Pc(26) int local26 = Static82.aClass1_Sub3_Sub1_Sub3_Sub1_2.method2452(arg0, 250) * 13;
		Static46.method3173(6, 6, local19 + 8, 4 + 4 + local26, 0);
		Static46.method3175(6, 6, local19 + 8, local26 + 8, 16777215);
		Static82.aClass1_Sub3_Sub1_Sub3_Sub1_2.method2473(arg0, 10, 10, local19, local26, 16777215, -1, 1, 1, 0);
		Static70.method1085(6, local26 + 4 + 4, local19 + 4 - -4, 6);
		if (!arg1) {
			Static196.method3226(10, local26, 10, local19);
			return;
		}
		@Pc(116) Canvas local116 = Static119.aCanvas1;
		try {
			@Pc(119) Graphics local119 = local116.getGraphics();
			Static84.aClass22_1.method1657(local119);
		} catch (@Pc(127) Exception local127) {
			local116.repaint();
		}
	}
}
