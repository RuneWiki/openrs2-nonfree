import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "J")
	public static long aLong106;

	@OriginalMember(owner = "client!iba", name = "j", descriptor = "I")
	public static int anInt4212;

	@OriginalMember(owner = "client!iba", name = "f", descriptor = "Z")
	public static final boolean aBoolean310 = false;

	@OriginalMember(owner = "client!iba", name = "g", descriptor = "Lclient!jv;")
	public static final Class191 aClass191_3 = new Class191();

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3697(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			local13 = (local13 << 5) + Static81.method1771(arg0.charAt(local15)) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IZI)Z")
	public static boolean method3698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3699(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			@Pc(27) long local27 = arg0;
			while (local27 != 0L) {
				local27 /= 37L;
				local25++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local49.append(Static363.aCharArray7[(int) (local52 - arg0 * 37L)]);
			}
			return local49.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	public static void method3700() {
		Static121.aClass31_6 = null;
		Static100.aClass31_2 = null;
		Static203.aClass31_16 = null;
		Static503.aClass31_34 = null;
		Static255.aClass31_12 = null;
		Static132.aClass31_7 = null;
		Static432.aClass31_25 = null;
		Static402.aClass31Array11 = null;
		Static576.aClass31_37 = null;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Z)I")
	public static int method3701() {
		if (Static351.aClass303_13 == null) {
			if (!Static113.aBoolean192 && Static10.aClass2_Sub7_Sub21_1 != null) {
				return Static10.aClass2_Sub7_Sub21_1.anInt10013;
			}
			@Pc(25) int local25 = Static186.aClass358_1.method8722();
			@Pc(29) int local29 = Static186.aClass358_1.method8721();
			@Pc(41) int local41;
			@Pc(43) int local43;
			@Pc(59) int local59;
			@Pc(122) Class2_Sub7_Sub21 local122;
			if (Static193.aBoolean754) {
				@Pc(241) Class120 local241;
				if (local25 > Static441.anInt7238 && local25 < Static131.anInt2708 + Static441.anInt7238) {
					local41 = -1;
					for (local43 = 0; local43 < Static471.anInt7593; local43++) {
						if (Static266.aBoolean372) {
							local59 = Static250.anInt4790 + local43 * 16 + 33;
							if (local29 > local59 - 13 && local59 + 3 >= local29) {
								local41 = local43;
							}
						} else {
							local59 = local43 * 16 + Static250.anInt4790 + 31;
							if (local29 > local59 - 13 && local59 + 3 >= local29) {
								local41 = local43;
							}
						}
					}
					if (local41 != -1) {
						local59 = 0;
						local241 = new Class120(Static515.aClass290_7);
						for (@Pc(346) Class2_Sub7_Sub20 local346 = (Class2_Sub7_Sub20) local241.method2959(); local346 != null; local346 = (Class2_Sub7_Sub20) local241.method2960()) {
							if (local59++ == local41) {
								return ((Class2_Sub7_Sub21) local346.aClass290_13.aClass2_Sub7_48.aClass2_Sub7_66).anInt10013;
							}
						}
					}
				} else if (Static429.aClass2_Sub7_Sub20_3 != null && Static540.anInt8699 < local25 && Static540.anInt8699 + Static220.anInt4137 > local25) {
					local41 = -1;
					for (local43 = 0; local43 < Static429.aClass2_Sub7_Sub20_3.anInt9985; local43++) {
						if (Static266.aBoolean372) {
							local59 = Static573.anInt9360 + local43 * 16 + 33;
							if (local59 - 13 < local29 && local29 <= local59 + 3) {
								local41 = local43;
							}
						} else {
							local59 = local43 * 16 + Static573.anInt9360 + 31;
							if (local29 > local59 - 13 && local29 <= local59 + 3) {
								local41 = local43;
							}
						}
					}
					if (local41 != -1) {
						local59 = 0;
						local241 = new Class120(Static429.aClass2_Sub7_Sub20_3.aClass290_13);
						for (local122 = (Class2_Sub7_Sub21) local241.method2959(); local122 != null; local122 = (Class2_Sub7_Sub21) local241.method2960()) {
							if (local41 == local59++) {
								return local122.anInt10013;
							}
						}
					}
				}
			} else if (local25 > Static441.anInt7238 && local25 < Static131.anInt2708 + Static441.anInt7238) {
				local41 = -1;
				for (local43 = 0; local43 < Static633.anInt10265; local43++) {
					if (Static266.aBoolean372) {
						local59 = Static250.anInt4790 + (-local43 + -1 + Static633.anInt10265) * 16 + 33;
						if (local59 - 13 < local29 && local59 + 3 >= local29) {
							local41 = local43;
						}
					} else {
						local59 = (Static633.anInt10265 - local43 - 1) * 16 + Static250.anInt4790 + 31;
						if (local29 > local59 - 13 && local59 + 3 >= local29) {
							local41 = local43;
						}
					}
				}
				if (local41 != -1) {
					local59 = 0;
					@Pc(117) Class370 local117 = new Class370(Static177.aClass114_19);
					for (local122 = (Class2_Sub7_Sub21) local117.method8628(); local122 != null; local122 = (Class2_Sub7_Sub21) local117.method8625()) {
						if (local41 == local59++) {
							return local122.anInt10013;
						}
					}
				}
			}
		}
		return -1;
	}
}
