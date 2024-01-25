import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
	public static int anInt129;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V")
	public static void method120() {
		Static190.aClass109_6.method2859(5);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method121(@OriginalArg(0) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static251.anInt4981;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(20) Class20 local20 = Static187.method3355(arg0[local11]);
			if (local20.anInt473 != -1) {
				@Pc(35) Class95 local35 = (Class95) Static286.aClass109_50.method2857((long) local20.anInt473);
				if (local35 == null) {
					@Pc(43) Class100 local43 = Static363.method2672(Static244.aClass93_93, local20.anInt473, 0);
					if (local43 != null) {
						local35 = Static236.aClass55_9.method5229(local43);
						Static286.aClass109_50.method2855((long) local20.anInt473, local35);
					}
				}
				if (local35 != null) {
					Static303.aClass95Array15[local9] = local35;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZBZ)V")
	public static void method122(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static310.anInt6635--;
			if (Static310.anInt6635 == 0) {
				Static203.anIntArray488 = null;
			}
		}
		Static163.anInt3233--;
		if (Static163.anInt3233 == 0) {
			Static230.anIntArray424 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method123(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6) {
		for (@Pc(1) int local1 = 99; local1 > 0; local1--) {
			Static231.anIntArray425[local1] = Static231.anIntArray425[local1 - 1];
			Static229.anIntArray419[local1] = Static229.anIntArray419[local1 - 1];
			Static94.aStringArray17[local1] = Static94.aStringArray17[local1 - 1];
			Static353.aStringArray67[local1] = Static353.aStringArray67[local1 - 1];
			Static273.aStringArray54[local1] = Static273.aStringArray54[local1 - 1];
			Static152.aStringArray59[local1] = Static152.aStringArray59[local1 - 1];
			Static289.anIntArray549[local1] = Static289.anIntArray549[local1 - 1];
		}
		Static231.anIntArray425[0] = arg4;
		Static229.anIntArray419[0] = arg2;
		Static94.aStringArray17[0] = arg0;
		Static353.aStringArray67[0] = arg6;
		Static273.aStringArray54[0] = arg5;
		Static152.aStringArray59[0] = arg3;
		Static289.anIntArray549[0] = arg1;
		Static86.anInt1607 = Static190.anInt456;
		Static310.anInt6639++;
	}
}
