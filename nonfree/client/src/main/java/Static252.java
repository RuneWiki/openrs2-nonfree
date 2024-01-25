import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!jaa", name = "N", descriptor = "Lclient!kha;")
	public static Class190 aClass190_1;

	@OriginalMember(owner = "client!jaa", name = "K", descriptor = "I")
	public static int anInt4988 = 100;

	@OriginalMember(owner = "client!jaa", name = "W", descriptor = "I")
	public static int anInt4998 = 0;

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(III)I")
	public static int method4161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(17) double local17 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(26) double local26 = local17 + Math.random() * (local10 - local17);
		return (int) (Math.pow(2.0D, local26) + 0.5D);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLclient!fd;)Z")
	public static boolean method4163(@OriginalArg(1) Class105 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean283) {
			return false;
		} else if (!arg0.method2791(Static292.anInterface5_2)) {
			return false;
		} else if (Static34.aClass222_2.method5468((long) arg0.anInt3344) == null) {
			return Static133.aClass222_9.method5468((long) arg0.anInt3320) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method4164(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) long local25 = arg0; local25 != 0L; local25 /= 37L) {
				local23++;
			}
			@Pc(42) StringBuffer local42 = new StringBuffer(local23);
			while (arg0 != 0L) {
				@Pc(45) long local45 = arg0;
				arg0 /= 37L;
				@Pc(59) char local59 = Static527.aCharArray11[(int) (local45 - arg0 * 37L)];
				if (local59 == '_') {
					@Pc(67) int local67 = local42.length() - 1;
					local59 = ' ';
					local42.setCharAt(local67, Character.toUpperCase(local42.charAt(local67)));
				}
				local42.append(local59);
			}
			local42.reverse();
			local42.setCharAt(0, Character.toUpperCase(local42.charAt(0)));
			return local42.toString();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B[B)V")
	public static void method4166(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class2_Sub34 local12 = new Class2_Sub34(arg0);
		while (true) {
			@Pc(16) int local16;
			@Pc(46) int local46;
			@Pc(41) int local41;
			label45: do {
				while (true) {
					while (true) {
						local16 = local12.method6904();
						if (local16 == 0) {
							return;
						}
						if (local16 == 1) {
							@Pc(112) int[] local112 = Static93.anIntArray168 = new int[6];
							local112[0] = local12.method6884();
							local112[1] = local12.method6884();
							local112[2] = local12.method6884();
							local112[3] = local12.method6884();
							local112[4] = local12.method6884();
							local112[5] = local12.method6884();
						} else {
							if (local16 != 4) {
								continue label45;
							}
							local41 = local12.method6904();
							Static590.anIntArray680 = new int[local41];
							for (local46 = 0; local46 < local41; local46++) {
								Static590.anIntArray680[local46] = local12.method6884();
								if (Static590.anIntArray680[local46] == 65535) {
									Static590.anIntArray680[local46] = -1;
								}
							}
						}
					}
				}
			} while (local16 != 5);
			local41 = local12.method6904();
			Static223.anIntArray315 = new int[local41];
			for (local46 = 0; local46 < local41; local46++) {
				Static223.anIntArray315[local46] = local12.method6884();
				if (Static223.anIntArray315[local46] == 65535) {
					Static223.anIntArray315[local46] = -1;
				}
			}
		}
	}
}
