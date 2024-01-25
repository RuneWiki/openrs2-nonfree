import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Lclient!ra;")
	public static Class170 aClass170_34;

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "Lclient!ra;")
	public static Class170 aClass170_35;

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
	public static int anInt1942 = 0;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "Z")
	public static boolean aBoolean128 = true;

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
	public static int anInt1943 = 0;

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "[Lclient!ja;")
	public static final Class5_Sub9_Sub11[] aClass5_Sub9_Sub11Array2 = new Class5_Sub9_Sub11[14];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIILclient!en;)V")
	public static void method1786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class59 arg7) {
		@Pc(11) Interface8 local11 = (Interface8) Static178.method3304(arg5, arg2, arg3);
		@Pc(19) Class137 local19;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(36) int local36;
		if (local11 != null) {
			local19 = Static228.method3923(local11.method5549());
			local25 = local11.method5552() & 0x3;
			local29 = local11.method5554();
			if (local19.anInt4130 == -1) {
				local36 = arg4;
				if (local19.anInt4164 > 0) {
					local36 = arg1;
				}
				if (local29 == 0 || local29 == 2) {
					if (local25 == 0) {
						arg7.method4821(arg6, local36, 4, arg0);
					} else if (local25 == 1) {
						arg7.method4797(local36, arg0, 4, arg6);
					} else if (local25 == 2) {
						arg7.method4821(arg6 + 3, local36, 4, arg0);
					} else if (local25 == 3) {
						arg7.method4797(local36, arg0 + 3, 4, arg6);
					}
				}
				if (local29 == 3) {
					if (local25 == 0) {
						arg7.method4835(arg0, arg6, 1, 1, local36);
					} else if (local25 == 1) {
						arg7.method4835(arg0, arg6 + 3, 1, 1, local36);
					} else if (local25 == 2) {
						arg7.method4835(arg0 + 3, arg6 - -3, 1, 1, local36);
					} else if (local25 == 3) {
						arg7.method4835(arg0 + 3, arg6, 1, 1, local36);
					}
				}
				if (local29 == 2) {
					if (local25 == 0) {
						arg7.method4797(local36, arg0, 4, arg6);
					} else if (local25 == 1) {
						arg7.method4821(arg6 + 3, local36, 4, arg0);
					} else if (local25 == 2) {
						arg7.method4797(local36, arg0 + 3, 4, arg6);
					} else if (local25 == 3) {
						arg7.method4821(arg6, local36, 4, arg0);
					}
				}
			} else {
				Static15.method516(arg6, local25, arg7, local19, arg0);
			}
		}
		local11 = (Interface8) Static82.method1816(arg5, arg2, arg3, sl.class);
		if (local11 != null) {
			local19 = Static228.method3923(local11.method5549());
			local25 = local11.method5552() & 0x3;
			local29 = local11.method5554();
			if (local19.anInt4130 != -1) {
				Static15.method516(arg6, local25, arg7, local19, arg0);
			} else if (local29 == 9) {
				local36 = -1118482;
				if (local19.anInt4164 > 0) {
					local36 = -1179648;
				}
				if (local25 == 0 || local25 == 2) {
					arg7.method4875(local36, arg0 + 3, arg0, arg6, arg6 + 3);
				} else {
					arg7.method4875(local36, arg0, arg0 + 3, arg6, arg6 + 3);
				}
			}
		}
		local11 = (Interface8) Static251.method4403(arg5, arg2, arg3);
		if (local11 == null) {
			return;
		}
		local19 = Static228.method3923(local11.method5549());
		local25 = local11.method5552() & 0x3;
		if (local19.anInt4130 != -1) {
			Static15.method516(arg6, local25, arg7, local19, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1787(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(51) long local51 = arg0;
				arg0 /= 37L;
				@Pc(65) char local65 = Static227.aCharArray22[(int) (local51 - arg0 * 37L)];
				if (local65 == '_') {
					@Pc(73) int local73 = local47.length() - 1;
					local47.setCharAt(local73, Character.toUpperCase(local47.charAt(local73)));
					local65 = ' ';
				}
				local47.append(local65);
			}
			local47.reverse();
			local47.setCharAt(0, Character.toUpperCase(local47.charAt(0)));
			return local47.toString();
		}
	}
}
