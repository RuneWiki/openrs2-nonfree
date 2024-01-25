import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	public static int anInt3472;

	@OriginalMember(owner = "client!he", name = "v", descriptor = "I")
	public static int anInt3485;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "J")
	public static long aLong86 = -1L;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z")
	public static boolean method3237() {
		if (Static23.aBoolean56) {
			try {
				Static558.method7782("showVideoAd", Static473.aClass229_14.anApplet1);
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!dn;I)V")
	public static void method3239(@OriginalArg(0) Class69 arg0) {
		Static301.anInt5880 = arg0.method1909("titlebg");
		Static309.anInt5934 = arg0.method1909("logo");
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method3240() {
		Static230.aClass93_1.method7550();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static109.aLongArray10[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static54.aLongArray8[local24] = 0L;
		}
		Static86.anInt1928 = 0;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	public static void method3242() {
		@Pc(7) int local7 = Static207.anInt4085;
		@Pc(9) int[] local9 = Static209.anIntArray327;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class20_Sub1_Sub1_Sub1 local19 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt9008 > 0) {
				local19.anInt9008--;
				if (local19.anInt9008 == 0) {
					local19.aString205 = null;
				}
			}
		}
		for (@Pc(48) int local48 = 0; local48 < Static141.anInt2822; local48++) {
			@Pc(55) long local55 = (long) Static220.anIntArray339[local48];
			@Pc(61) Class1_Sub41 local61 = (Class1_Sub41) Static362.aClass230_46.method6144(local55);
			if (local61 != null) {
				@Pc(66) Class20_Sub1_Sub1_Sub2 local66 = local61.aClass20_Sub1_Sub1_Sub2_2;
				if (local66.anInt9008 > 0) {
					local66.anInt9008--;
					if (local66.anInt9008 == 0) {
						local66.aString205 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method3243(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) int local37 = 0;
			@Pc(39) long local39 = arg0;
			while (local39 != 0L) {
				local39 /= 37L;
				local37++;
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local37);
			while (arg0 != 0L) {
				@Pc(61) long local61 = arg0;
				arg0 /= 37L;
				@Pc(75) char local75 = Static542.aCharArray8[(int) (local61 - arg0 * 37L)];
				if (local75 == '_') {
					@Pc(83) int local83 = local57.length() - 1;
					local57.setCharAt(local83, Character.toUpperCase(local57.charAt(local83)));
					local75 = ' ';
				}
				local57.append(local75);
			}
			local57.reverse();
			local57.setCharAt(0, Character.toUpperCase(local57.charAt(0)));
			return local57.toString();
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)I")
	public static int method3244() {
		return 16;
	}
}
