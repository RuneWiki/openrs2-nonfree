import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)V")
	public static void method8212(@OriginalArg(1) boolean arg0) {
		Static563.aClass56_13.method8393(Static371.aClass143_7.method6257());
		@Pc(10) int[] local10 = Static371.aClass143_7.Y();
		Static127.anInt2188 = local10[1];
		Static233.anInt3760 = local10[3];
		Static506.anInt8606 = local10[0];
		Static520.anInt8706 = local10[2];
		if (arg0) {
			Static371.aClass143_7.DA(Static650.anInt10264, Static77.anInt1205, Static462.anInt8052, Static255.anInt4082);
			Static53.method3583(Static473.aDouble19);
		} else {
			Static371.aClass143_7.DA(Static89.anInt1481, Static27.anInt370, Static29.anInt403, Static18.anInt262);
			Static53.method3583(Static162.aDouble17);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method8213(@OriginalArg(0) String arg0) {
		if (Static223.aStringArray14 == null) {
			Static556.method7634();
		}
		Static101.aCalendar1.setTime(new Date(Static124.method1947()));
		@Pc(24) int local24 = Static101.aCalendar1.get(11);
		@Pc(28) int local28 = Static101.aCalendar1.get(12);
		@Pc(32) int local32 = Static101.aCalendar1.get(13);
		@Pc(66) String local66 = Integer.toString(local24 / 10) + local24 % 10 + ":" + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
		@Pc(71) String[] local71 = Static466.method6897('\n', arg0);
		for (@Pc(73) int local73 = 0; local73 < local71.length; local73++) {
			for (@Pc(76) int local76 = Static331.anInt6012; local76 > 0; local76--) {
				Static223.aStringArray14[local76] = Static223.aStringArray14[local76 - 1];
			}
			Static223.aStringArray14[0] = local66 + ": " + local71[local73];
			if (Static162.aFileOutputStream6 != null) {
				try {
					Static162.aFileOutputStream6.write(Static637.method8445(Static223.aStringArray14[0] + "\n"));
				} catch (@Pc(124) IOException local124) {
				}
			}
			if (Static223.aStringArray14.length - 1 > Static331.anInt6012) {
				Static331.anInt6012++;
				if (Static206.anInt3291 > 0) {
					Static206.anInt3291++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BIIIII)V")
	public static void method8214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static361.anInt6317 && Static651.anInt10267 >= arg3 && arg4 >= Static128.anInt2200 && arg2 <= Static380.anInt6585) {
			Static36.method492(arg2, arg0, arg3, arg4, arg1);
		} else {
			Static22.method331(arg1, arg4, arg0, arg2, arg3);
		}
	}
}
