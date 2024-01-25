import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Lclient!hh;")
	public static Class109 aClass109_50;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method2957(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static423.aCharArray7[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(78) int local78 = local50.length() - 1;
					local68 = ' ';
					local50.setCharAt(local78, Character.toUpperCase(local50.charAt(local78)));
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[Lclient!tn;B)V")
	public static void method2962(@OriginalArg(0) int arg0, @OriginalArg(1) Class229[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(15) Class229 local15 = arg1[local7];
			if (local15 != null) {
				if (local15.anInt6863 == 0) {
					if (local15.aClass229Array2 != null) {
						method2962(arg0, local15.aClass229Array2);
					}
					@Pc(39) Class1_Sub38 local39 = (Class1_Sub38) Static81.aClass51_5.method930((long) local15.anInt6923);
					if (local39 != null) {
						Static143.method2301(local39.anInt6527, arg0);
					}
				}
				@Pc(57) Class1_Sub16 local57;
				if (arg0 == 0 && local15.anObjectArray27 != null) {
					local57 = new Class1_Sub16();
					local57.aClass229_4 = local15;
					local57.anObjectArray1 = local15.anObjectArray27;
					Static354.method5070(local57);
				}
				if (arg0 == 1 && local15.anObjectArray10 != null) {
					if (local15.anInt6860 >= 0) {
						@Pc(80) Class229 local80 = Static203.method1670(local15.anInt6923);
						if (local80 == null || local80.aClass229Array2 == null || local15.anInt6860 >= local80.aClass229Array2.length || local15 != local80.aClass229Array2[local15.anInt6860]) {
							continue;
						}
					}
					local57 = new Class1_Sub16();
					local57.aClass229_4 = local15;
					local57.anObjectArray1 = local15.anObjectArray10;
					Static354.method5070(local57);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIII)V")
	public static void method2964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static248.method3569(Static357.anInt6537, Static85.anInt1517, arg0);
		@Pc(17) int local17 = Static248.method3569(Static357.anInt6537, Static85.anInt1517, arg4);
		@Pc(23) int local23 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg2);
		@Pc(29) int local29 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg5);
		@Pc(38) int local38 = Static248.method3569(Static357.anInt6537, Static85.anInt1517, arg0 + arg1);
		@Pc(47) int local47 = Static248.method3569(Static357.anInt6537, Static85.anInt1517, arg4 - arg1);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static23.method323(Static283.anIntArrayArray30[local49], local23, arg3, local29);
		}
		for (@Pc(69) int local69 = local17; local69 > local47; local69--) {
			Static23.method323(Static283.anIntArrayArray30[local69], local23, arg3, local29);
		}
		@Pc(96) int local96 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg2 + arg1);
		@Pc(105) int local105 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg5 - arg1);
		for (@Pc(107) int local107 = local38; local107 <= local47; local107++) {
			@Pc(113) int[] local113 = Static283.anIntArrayArray30[local107];
			Static23.method323(local113, local23, arg3, local96);
			Static23.method323(local113, local105, arg3, local29);
		}
	}
}
