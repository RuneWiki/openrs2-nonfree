import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIZB)V")
	public static void method2688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(23) int local23 = arg2 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(51) int local51 = (Static612.aShort127 - Static533.aShort15) * local23 / 100 + Static533.aShort15;
		if (Static599.aShort123 > local51) {
			local51 = Static599.aShort123;
		} else if (local51 > Static232.aShort59) {
			local51 = Static232.aShort59;
		}
		@Pc(73) int local73 = arg2 * 512 * local51 / (arg0 * 334);
		@Pc(110) int local110;
		@Pc(117) int local117;
		@Pc(85) short local85;
		if (local73 < Static109.aShort23) {
			local85 = Static109.aShort23;
			local51 = local85 * arg0 * 334 / (arg2 * 512);
			if (local51 > Static232.aShort59) {
				local51 = Static232.aShort59;
				local110 = local51 * arg2 * 512 / (local85 * 334);
				local117 = (arg0 - local110) / 2;
				if (arg4) {
					Static485.aClass126_17.la();
					Static485.aClass126_17.method7045(local117, arg2, arg1, arg3, -16777216);
					Static485.aClass126_17.method7045(local117, arg2, arg1, arg0 + arg3 - local117, -16777216);
				}
				arg3 += local117;
				arg0 -= local117 * 2;
			}
		} else if (local73 > Static551.aShort104) {
			local85 = Static551.aShort104;
			local51 = arg0 * local85 * 334 / (arg2 * 512);
			if (Static599.aShort123 > local51) {
				local51 = Static599.aShort123;
				local110 = local85 * 334 * arg0 / (local51 * 512);
				local117 = (arg2 - local110) / 2;
				if (arg4) {
					Static485.aClass126_17.la();
					Static485.aClass126_17.method7045(arg0, local117, arg1, arg3, -16777216);
					Static485.aClass126_17.method7045(arg0, local117, arg2 + arg1 - local117, arg3, -16777216);
				}
				arg1 += local117;
				arg2 -= local117 * 2;
			}
		}
		Static544.anInt9011 = (short) arg0;
		Static266.anInt4408 = (short) arg2;
		Static381.anInt6702 = arg3;
		Static53.anInt814 = arg2 * local51 / 334;
		Static400.anInt6935 = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZZZLclient!ff;)V")
	public static void method2689(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class5_Sub15 arg2) {
		@Pc(8) int local8 = arg2.anInt2409;
		@Pc(12) int local12 = (int) arg2.aLong282;
		arg2.method8911();
		if (arg1) {
			Static194.method3066(local8);
		}
		Static617.method8524(local8);
		@Pc(35) Class357 local35 = Static472.method6903(local12);
		if (local35 != null) {
			Static637.method8778(local35);
		}
		Static502.method7338();
		if (!arg0 && Static302.anInt4813 != -1) {
			Static499.method7310(1, Static302.anInt4813);
		}
		@Pc(56) Class100 local56 = new Class100(Static183.aClass81_27);
		for (@Pc(61) Class5_Sub15 local61 = (Class5_Sub15) local56.method1996(); local61 != null; local61 = (Class5_Sub15) local56.method1995()) {
			if (!local61.method8913()) {
				local61 = (Class5_Sub15) local56.method1996();
				if (local61 == null) {
					return;
				}
			}
			if (local61.anInt2406 == 3) {
				@Pc(85) int local85 = (int) local61.aLong282;
				if (local85 >>> 16 == local8) {
					method2689(arg0, true, local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2690(@OriginalArg(0) String arg0) {
		if (Static276.aStringArray39 == null) {
			Static562.method7904();
		}
		Static488.aCalendar3.setTime(new Date(Static205.method3179()));
		@Pc(25) int local25 = Static488.aCalendar3.get(11);
		@Pc(29) int local29 = Static488.aCalendar3.get(12);
		@Pc(33) int local33 = Static488.aCalendar3.get(13);
		@Pc(67) String local67 = Integer.toString(local25 / 10) + local25 % 10 + ":" + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10;
		@Pc(72) String[] local72 = Static132.method1987(arg0, '\n');
		for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
			for (@Pc(78) int local78 = Static496.anInt8473; local78 > 0; local78--) {
				Static276.aStringArray39[local78] = Static276.aStringArray39[local78 - 1];
			}
			Static276.aStringArray39[0] = local67 + ": " + local72[local74];
			if (Static425.aFileOutputStream1 != null) {
				try {
					Static425.aFileOutputStream1.write(Static343.method5256(Static276.aStringArray39[0] + "\n"));
				} catch (@Pc(127) IOException local127) {
				}
			}
			if (Static496.anInt8473 < Static276.aStringArray39.length - 1) {
				Static496.anInt8473++;
				if (Static64.anInt1040 > 0) {
					Static64.anInt1040++;
				}
			}
		}
	}
}
