import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!uea", name = "Q", descriptor = "Lclient!qg;")
	public static Class286 aClass286_4;

	@OriginalMember(owner = "client!uea", name = "S", descriptor = "[I")
	public static final int[] anIntArray678 = new int[8];

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IB)Z")
	public static boolean method7995(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIIBIII)V")
	public static void method7996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Class2_Sub2 local11 = null;
		for (@Pc(16) Class2_Sub2 local16 = (Class2_Sub2) Static536.aClass114_42.method2772(); local16 != null; local16 = (Class2_Sub2) Static536.aClass114_42.method2762()) {
			if (arg5 == local16.anInt125 && arg2 == local16.anInt129 && local16.anInt119 == arg3 && local16.anInt120 == arg4) {
				local11 = local16;
				break;
			}
		}
		if (local11 == null) {
			local11 = new Class2_Sub2();
			local11.anInt129 = arg2;
			local11.anInt125 = arg5;
			local11.anInt119 = arg3;
			local11.anInt120 = arg4;
			if (arg2 >= 0 && arg3 >= 0 && Static456.anInt7428 > arg2 && Static5.anInt112 > arg3) {
				Static191.method3267(local11);
			}
			Static536.aClass114_42.method2771(local11);
		}
		local11.aBoolean17 = true;
		local11.aBoolean18 = false;
		local11.anInt118 = arg0;
		local11.anInt117 = arg1;
		local11.anInt126 = arg6;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7997(@OriginalArg(1) String arg0) {
		if (Static97.aStringArray10 == null) {
			Static462.method6524();
		}
		Static132.aCalendar1.setTime(new Date(Static48.method1203()));
		@Pc(23) int local23 = Static132.aCalendar1.get(11);
		@Pc(27) int local27 = Static132.aCalendar1.get(12);
		@Pc(31) int local31 = Static132.aCalendar1.get(13);
		@Pc(65) String local65 = Integer.toString(local23 / 10) + local23 % 10 + ":" + local27 / 10 + local27 % 10 + ":" + local31 / 10 + local31 % 10;
		@Pc(70) String[] local70 = Static386.method5691('\n', arg0);
		for (@Pc(72) int local72 = 0; local72 < local70.length; local72++) {
			for (@Pc(75) int local75 = Static91.anInt2239; local75 > 0; local75--) {
				Static97.aStringArray10[local75] = Static97.aStringArray10[local75 - 1];
			}
			Static97.aStringArray10[0] = local65 + ": " + local70[local72];
			if (Static249.aFileOutputStream1 != null) {
				try {
					Static249.aFileOutputStream1.write(Static284.method4523(Static97.aStringArray10[0] + "\n"));
				} catch (@Pc(125) IOException local125) {
				}
			}
			if (Static97.aStringArray10.length - 1 > Static91.anInt2239) {
				if (Static523.anInt8450 > 0) {
					Static523.anInt8450++;
				}
				Static91.anInt2239++;
			}
		}
	}
}
