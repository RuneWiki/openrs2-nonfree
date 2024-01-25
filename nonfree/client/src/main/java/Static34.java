import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!be", name = "j", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!mp;")
	public static final Class222 aClass222_2 = new Class222(8);

	@OriginalMember(owner = "client!be", name = "s", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_5 = new Class269(44, 1);

	@OriginalMember(owner = "client!be", name = "B", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_6 = new Class269(80, -1);

	@OriginalMember(owner = "client!be", name = "D", descriptor = "J")
	public static long aLong38 = -1L;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(JZ)V")
	public static void method767(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 + Static477.anInt8153;
		@Pc(15) int local15 = Static574.anInt9439 + Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929;
		if (Static85.anInt1773 - local10 < -2000 || Static85.anInt1773 - local10 > 2000 || Static57.anInt1181 - local15 < -2000 || Static57.anInt1181 - local15 > 2000) {
			Static57.anInt1181 = local15;
			Static85.anInt1773 = local10;
		}
		@Pc(55) int local55;
		@Pc(63) int local63;
		if (local10 != Static85.anInt1773) {
			local55 = local10 - Static85.anInt1773;
			local63 = (int) (arg0 * (long) local55 / 320L);
			if (local55 > 0) {
				if (local63 == 0) {
					local63 = 1;
				} else if (local55 < local63) {
					local63 = local55;
				}
			} else if (local63 == 0) {
				local63 = -1;
			} else if (local63 < local55) {
				local63 = local55;
			}
			Static85.anInt1773 += local63;
		}
		if (local15 != Static57.anInt1181) {
			local55 = local15 - Static57.anInt1181;
			local63 = (int) (arg0 * (long) local55 / 320L);
			if (local55 <= 0) {
				if (local63 == 0) {
					local63 = -1;
				} else if (local55 > local63) {
					local63 = local55;
				}
			} else if (local63 == 0) {
				local63 = 1;
			} else if (local63 > local55) {
				local63 = local55;
			}
			Static57.anInt1181 += local63;
		}
		Static189.aFloat109 += (float) arg0 * Static293.aFloat128 / 6.0F;
		Static378.aFloat160 += (float) arg0 * Static440.aFloat192 / 6.0F;
		Static475.method7381();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method769() {
		if (!Static429.aBoolean581) {
			return;
		}
		while (true) {
			while (Static47.anInt1048 < Static339.aClass202_Sub1Array1.length) {
				@Pc(29) Class202_Sub1 local29 = Static339.aClass202_Sub1Array1[Static47.anInt1048];
				if (local29 != null && local29.anInt5727 == -1) {
					if (Static534.aClass2_Sub35_2 == null) {
						Static534.aClass2_Sub35_2 = Static164.aClass99_1.method2602(local29.aString55);
					}
					@Pc(53) int local53 = Static534.aClass2_Sub35_2.anInt6568;
					if (local53 == -1) {
						return;
					}
					local29.anInt5727 = local53;
					Static534.aClass2_Sub35_2 = null;
					Static47.anInt1048++;
				} else {
					Static47.anInt1048++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!oea;III)Lclient!m;")
	public static Class88_Sub2_Sub1 method771(@OriginalArg(1) Class87_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0.aBoolean550 || Static504.method7825(arg3) && Static504.method7825(arg2)) {
			return new Class88_Sub2_Sub1(arg0, 3553, arg1, arg3, arg2);
		} else if (arg0.aBoolean538) {
			return new Class88_Sub2_Sub1(arg0, 34037, arg1, arg3, arg2);
		} else {
			return new Class88_Sub2_Sub1(arg0, arg1, arg3, arg2, Static347.method5404(arg3), Static347.method5404(arg2));
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZ)V")
	public static void method772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class2_Sub5_Sub10 local13 = Static594.method8175(arg0, 7);
		local13.method4393();
		local13.anInt5255 = arg1;
	}
}
