import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!qha", name = "h", descriptor = "Lclient!gw;")
	public static Class86 aClass86_8;

	@OriginalMember(owner = "client!qha", name = "o", descriptor = "Z")
	public static boolean aBoolean713 = false;

	@OriginalMember(owner = "client!qha", name = "n", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_122 = new Class349(54, 4);

	@OriginalMember(owner = "client!qha", name = "r", descriptor = "Lclient!wh;")
	public static final Class400 aClass400_29 = new Class400();

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(B)I")
	public static int method7326() {
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		if (Static135.aClass389_2.aBoolean913 && !Static135.aClass389_2.aBoolean912) {
			local13 = true;
			if (Static604.aClass2_Sub45_1.anInt7311 < 512 && Static604.aClass2_Sub45_1.anInt7311 != 0) {
				local13 = false;
			}
			if (Static688.aString122.startsWith("win")) {
				local17 = true;
				local15 = true;
			} else {
				local15 = true;
			}
		}
		if (Static401.aBoolean560) {
			local17 = false;
		}
		if (Static541.aBoolean732) {
			local13 = false;
		}
		if (Static585.aBoolean791) {
			local15 = false;
		}
		if (!local13 && !local15 && !local17) {
			return Static549.method7660();
		}
		@Pc(85) int local85 = -1;
		@Pc(87) int local87 = -1;
		if (local13) {
			try {
				local85 = Static28.method382(2, 1000);
			} catch (@Pc(96) Exception local96) {
			}
		}
		@Pc(99) int local99 = -1;
		if (local17) {
			try {
				local99 = Static28.method382(3, 1000);
				if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() == 3) {
					@Pc(117) Class47 local117 = Static396.aClass145_6.method9653();
					@Pc(122) long local122 = local117.aLong41 & 0xFFFFFFFFFFFFL;
					@Pc(125) int local125 = local117.anInt1026;
					if (local125 == 4318) {
						local15 &= local122 >= 64425238954L;
					} else if (local125 == 4098) {
						local15 &= local122 >= 60129613779L;
					}
				}
			} catch (@Pc(171) Exception local171) {
			}
		}
		if (local15) {
			try {
				local87 = Static28.method382(1, 1000);
			} catch (@Pc(181) Exception local181) {
			}
		}
		if (local85 == -1 && local87 == -1 && local99 == -1) {
			return Static549.method7660();
		}
		local99 = (int) ((float) local99 * 1.1F);
		local87 = (int) ((float) local87 * 1.1F);
		if (local85 > local99 && local87 < local85) {
			return Static480.method6888(local85);
		} else if (local99 <= local87) {
			return Static717.method9544(local87, 1);
		} else {
			return Static717.method9544(local99, 3);
		}
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(B)I")
	public static int method7327() {
		if ((double) Static90.aFloat42 == 3.0D) {
			return 37;
		} else if ((double) Static90.aFloat42 == 4.0D) {
			return 50;
		} else if ((double) Static90.aFloat42 == 6.0D) {
			return 75;
		} else if ((double) Static90.aFloat42 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ZIJ)Ljava/lang/String;")
	public static String method7328(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static97.method1514(arg1);
		@Pc(10) int local10 = Static246.aCalendar3.get(5);
		@Pc(23) int local23 = Static246.aCalendar3.get(2) + 1;
		@Pc(27) int local27 = Static246.aCalendar3.get(1);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local23 / 10 + local23 % 10 + "/" + local27 % 100 / 10 + local27 % 10;
	}
}
