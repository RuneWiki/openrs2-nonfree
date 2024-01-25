import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!os;")
	public static Class120 aClass120_5;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array15;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Lclient!ir;")
	public static Class100 aClass100_96;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	public static int anInt4687 = 0;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "[S")
	public static short[] aShortArray85 = new short[256];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3990(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) long local27 = arg0; local27 != 0L; local27 /= 37L) {
				local25++;
			}
			@Pc(43) StringBuffer local43 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(47) long local47 = arg0;
				arg0 /= 37L;
				@Pc(61) char local61 = Static273.aCharArray8[(int) (local47 - arg0 * 37L)];
				if (local61 == '_') {
					@Pc(69) int local69 = local43.length() - 1;
					local61 = ' ';
					local43.setCharAt(local69, Character.toUpperCase(local43.charAt(local69)));
				}
				local43.append(local61);
			}
			local43.reverse();
			local43.setCharAt(0, Character.toUpperCase(local43.charAt(0)));
			return local43.toString();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIILjava/lang/String;)V")
	public static void method3992(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static134.anIntArray183[local3] = Static134.anIntArray183[local3 - 1];
			Static50.anIntArray64[local3] = Static50.anIntArray64[local3 - 1];
			Static240.aStringArray28[local3] = Static240.aStringArray28[local3 - 1];
			Static228.aStringArray27[local3] = Static228.aStringArray27[local3 - 1];
			Static99.aStringArray10[local3] = Static99.aStringArray10[local3 - 1];
			Static271.aStringArray35[local3] = Static271.aStringArray35[local3 - 1];
			Static339.anIntArray452[local3] = Static339.anIntArray452[local3 - 1];
		}
		Static134.anIntArray183[0] = arg4;
		Static50.anIntArray64[0] = arg5;
		Static240.aStringArray28[0] = arg2;
		Static228.aStringArray27[0] = arg6;
		Static99.aStringArray10[0] = arg1;
		Static158.anInt3050++;
		Static271.aStringArray35[0] = arg0;
		Static44.anInt900 = Static293.anInt6247;
		Static339.anIntArray452[0] = arg3;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
	public static void method3993(@OriginalArg(1) int arg0) {
		Static266.anInt5374 = arg0;
		@Pc(7) Class198 local7 = Static323.aClass198_56;
		synchronized (Static323.aClass198_56) {
			Static323.aClass198_56.method5236();
		}
		local7 = Static216.aClass198_40;
		synchronized (Static216.aClass198_40) {
			Static216.aClass198_40.method5236();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)V")
	public static void method3997(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(7) int local7 = arg0 << 3;
		Static46.aFloat2 = local7;
		Static57.aFloat3 = local3;
		if (Static261.anInt5200 == 2) {
			Static154.anInt6368 = local7;
			Static40.anInt6448 = 0;
			Static350.anInt6797 = local3;
		}
		Static240.method4147();
		Static105.aBoolean110 = true;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILclient!rr;ZZLclient!rr;Z)I")
	public static int method3998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58_Sub1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class58_Sub1 arg5) {
		@Pc(10) int local10 = Static2.method13(arg1, arg5, arg2, arg4);
		if (local10 != 0) {
			return arg4 ? -local10 : local10;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static2.method13(arg0, arg5, arg2, arg3);
			return arg3 ? -local40 : local40;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method4000(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			@Pc(32) long local32 = arg0;
			while (local32 != 0L) {
				local32 /= 37L;
				local30++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local50.append(Static273.aCharArray8[(int) (local54 - arg0 * 37L)]);
			}
			return local50.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIII)V")
	public static void method4001(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) Static21.aClass65_2.method1462(); local6 != null; local6 = (Class8_Sub3) Static21.aClass65_2.method1461()) {
			if (local6.anInt1704 <= Static51.anInt1101) {
				local6.method4645();
			} else {
				Static219.method3813((local6.anInt1708 << 7) + 64, arg3 >> 1, local6.anInt1706 * 2, arg2 >> 1, (local6.anInt1709 << 7) + 64);
				Static243.aClass120_6.method5547(0, local6.aString56, arg1 + Static187.anIntArray302[0], local6.anInt1701 | 0xFF000000, arg0 + Static187.anIntArray302[1]);
			}
		}
	}
}
