import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bn", name = "E", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21;

	@OriginalMember(owner = "client!bn", name = "G", descriptor = "Lclient!db;")
	public static Class47 aClass47_3;

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_61 = new Class131(18, 12);

	@OriginalMember(owner = "client!bn", name = "F", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_30 = new Class237(107, -2);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(JI)V")
	public static void method1642(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static65.anInt1352 + Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068;
		@Pc(15) int local15 = Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065 + Static151.anInt2581;
		if (Static220.anInt3977 - local10 < -500 || Static220.anInt3977 - local10 > 500 || Static202.anInt3669 - local15 < -500 || Static202.anInt3669 - local15 > 500) {
			Static220.anInt3977 = local10;
			Static202.anInt3669 = local15;
		}
		@Pc(61) int local61;
		@Pc(69) int local69;
		if (local10 != Static220.anInt3977) {
			local61 = local10 - Static220.anInt3977;
			local69 = (int) (arg0 * (long) local61 / 320L);
			if (local61 <= 0) {
				if (local69 == 0) {
					local69 = -1;
				} else if (local61 > local69) {
					local69 = local61;
				}
			} else if (local69 == 0) {
				local69 = 1;
			} else if (local69 > local61) {
				local69 = local61;
			}
			Static220.anInt3977 += local69;
		}
		if (local15 != Static202.anInt3669) {
			local61 = local15 - Static202.anInt3669;
			local69 = (int) ((long) local61 * arg0 / 320L);
			if (local61 <= 0) {
				if (local69 == 0) {
					local69 = -1;
				} else if (local69 < local61) {
					local69 = local61;
				}
			} else if (local69 == 0) {
				local69 = 1;
			} else if (local69 > local61) {
				local69 = local61;
			}
			Static202.anInt3669 += local69;
		}
		if (!Static389.aClass128_Sub1_1.aBoolean233) {
			Static144.aFloat36 += (float) arg0 * Static8.aFloat3 / 6.0F;
			Static274.aFloat78 += (float) arg0 * Static107.aFloat33 / 6.0F;
		}
		Static449.method6007();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I")
	public static int method1643(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)Z")
	public static boolean method1645(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIILclient!fk;Lclient!fk;)V")
	public static void method1646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26_Sub3 arg3, @OriginalArg(4) Class26_Sub3 arg4) {
		@Pc(4) Class211 local4 = Static197.method3007(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass26_Sub3_3 = arg3;
			local4.aClass26_Sub3_2 = arg4;
		}
	}
}
