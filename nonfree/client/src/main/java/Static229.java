import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	public static int anInt3930;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_84 = new Class254(32, 3);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)I")
	public static int method3300(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Lclient!mf;")
	public static Class158 method3301() {
		try {
			return new Class158_Sub2();
		} catch (@Pc(17) Throwable local17) {
			try {
				return (Class158) Class.forName("Class158_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(23) Throwable local23) {
				return new Class158_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;ZI)I")
	public static int method3303(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local33; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(83) int local83;
			if (local46 >= '0' && local46 <= '9') {
				local83 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local83 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local83 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local83) {
				throw new NumberFormatException();
			}
			if (local26) {
				local83 = -local83;
			}
			@Pc(119) int local119 = local83 + arg0 * local30;
			if (local30 != local119 / arg0) {
				throw new NumberFormatException();
			}
			local28 = true;
			local30 = local119;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)Lclient!da;")
	public static Class1_Sub8 method3304() {
		if (Static350.aClass142_46 == null || Static33.aClass117_1 == null) {
			return null;
		}
		Static33.aClass117_1.method2534(Static350.aClass142_46);
		@Pc(18) Class1_Sub8 local18 = (Class1_Sub8) Static33.aClass117_1.method2533();
		if (local18 == null) {
			return null;
		} else {
			@Pc(28) Class52 local28 = Static350.aClass103_4.method2055(local18.anInt1168);
			return local28 != null && local28.aBoolean104 && local28.method981(Static350.anInterface1_2) ? local18 : Static159.method2524();
		}
	}
}
