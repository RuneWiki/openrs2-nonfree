import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
	public static int anInt9807;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
	public static int anInt9799 = 0;

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
	public static int anInt9800 = -1;

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_71 = new Class187(64);

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
	public static int anInt9804 = 0;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IJ)V")
	public static void method8167(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static322.anInt6116;
		@Pc(15) int local15;
		@Pc(23) int local23;
		if (Static569.anInt9811 != local7) {
			local15 = local7 - Static569.anInt9811;
			local23 = (int) (arg0 * (long) local15 / 320L);
			if (local15 <= 0) {
				if (local23 == 0) {
					local23 = -1;
				} else if (local23 < local15) {
					local23 = local15;
				}
			} else if (local23 == 0) {
				local23 = 1;
			} else if (local23 > local15) {
				local23 = local15;
			}
			Static569.anInt9811 += local23;
		}
		@Pc(65) int local65 = Static620.anInt10427;
		Static543.aFloat228 += Static117.aFloat269 * (float) arg0 / 40.0F * 8.0F;
		Static2.aFloat1 += (float) arg0 * Static456.aFloat185 / 40.0F * 8.0F;
		if (Static59.anInt1432 != local65) {
			local15 = local65 - Static59.anInt1432;
			local23 = (int) (arg0 * (long) local15 / 320L);
			if (local15 <= 0) {
				if (local23 == 0) {
					local23 = -1;
				} else if (local23 < local15) {
					local23 = local15;
				}
			} else if (local23 == 0) {
				local23 = 1;
			} else if (local15 < local23) {
				local23 = local15;
			}
			Static59.anInt1432 += local23;
		}
		Static635.method8862();
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
	public static void method8169() {
		if (Static571.aClass131Array1 == null) {
			Static571.aClass131Array1 = Static196.method3017();
			Static330.aClass131_22 = Static571.aClass131Array1[0];
			Static201.aLong111 = Static521.method7499();
		}
		if (Static292.aClass360_1 == null) {
			Static606.method8509();
		}
		@Pc(23) Class131 local23 = Static330.aClass131_22;
		@Pc(26) int local26 = Static12.method80();
		if (local23 == Static330.aClass131_22) {
			Static641.aString115 = Static330.aClass131_22.aClass303_2.method7473(Static232.anInt4258);
			if (Static330.aClass131_22.aBoolean274) {
				Static566.anInt9784 = local26 * (Static330.aClass131_22.anInt3618 - Static330.aClass131_22.anInt3620) / 100 + Static330.aClass131_22.anInt3620;
			}
			if (Static330.aClass131_22.aBoolean275) {
				Static641.aString115 = Static641.aString115 + Static566.anInt9784 + "%";
			}
		} else if (Static196.aClass131_21 == Static330.aClass131_22) {
			Static292.aClass360_1 = null;
			Static67.method1345(3);
		} else {
			Static641.aString115 = local23.aClass303_1.method7473(Static232.anInt4258);
			Static566.anInt9784 = local23.anInt3618;
			if (Static330.aClass131_22.aBoolean275) {
				Static641.aString115 = Static641.aString115 + local23.anInt3618 + "%";
			}
			if (Static330.aClass131_22.aBoolean274 || local23.aBoolean274) {
				Static201.aLong111 = Static521.method7499();
			}
		}
		if (Static292.aClass360_1 == null) {
			return;
		}
		Static292.aClass360_1.method8672(Static641.aString115, Static201.aLong111, Static566.anInt9784, Static330.aClass131_22);
		if (Static191.anInterface17Array1 == null) {
			return;
		}
		for (@Pc(130) int local130 = Static140.anInt2660 + 1; local130 < Static191.anInterface17Array1.length; local130++) {
			if (Static191.anInterface17Array1[local130].method9115() >= 100 && local130 - 1 == Static140.anInt2660 && Static430.anInt7691 >= 1 && Static292.aClass360_1.method8665()) {
				try {
					Static191.anInterface17Array1[local130].method9114();
				} catch (@Pc(164) Exception local164) {
					Static191.anInterface17Array1 = null;
					return;
				}
				Static292.aClass360_1.method8663(Static191.anInterface17Array1[local130]);
				Static140.anInt2660++;
				if (Static140.anInt2660 >= Static191.anInterface17Array1.length - 1 && Static191.anInterface17Array1.length > 1) {
					Static140.anInt2660 = Static76.aClass120_1.method2846() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)V")
	public static void method8170(@OriginalArg(1) int arg0) {
		if (Static220.method3432(arg0)) {
			Static28.method622(Static559.aClass230ArrayArray2[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/lang/String;BZI)I")
	public static int method8171(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(39) int local39 = 0; local39 < local31; local39++) {
			@Pc(45) char local45 = arg0.charAt(local39);
			if (local39 == 0) {
				if (local45 == '-') {
					local24 = true;
					continue;
				}
				if (local45 == '+') {
					continue;
				}
			}
			@Pc(74) int local74;
			if (local45 >= '0' && local45 <= '9') {
				local74 = local45 - '0';
			} else if (local45 >= 'A' && local45 <= 'Z') {
				local74 = local45 - '7';
			} else if (local45 >= 'a' && local45 <= 'z') {
				local74 = local45 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local74) {
				throw new NumberFormatException();
			}
			if (local24) {
				local74 = -local74;
			}
			@Pc(120) int local120 = local74 + arg1 * local28;
			if (local120 / arg1 != local28) {
				throw new NumberFormatException();
			}
			local26 = true;
			local28 = local120;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}
}
