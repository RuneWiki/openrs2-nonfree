import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)Lclient!pf;")
	public static Class20_Sub7 method1717() {
		@Pc(13) Class20_Sub7 local13 = (Class20_Sub7) Static344.aClass248_7.method5582();
		if (local13 == null) {
			return new Class20_Sub7();
		} else {
			Static1.anInt6--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(JI)V")
	public static void method1722(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static190.anInt3490;
		@Pc(13) int local13 = Static212.anInt3693;
		@Pc(25) int local25;
		@Pc(33) int local33;
		if (local7 != Static371.anInt5975) {
			local25 = local7 - Static371.anInt5975;
			local33 = (int) (arg0 * (long) local25 / 320L);
			if (local25 <= 0) {
				if (local33 == 0) {
					local33 = -1;
				} else if (local33 < local25) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = 1;
			} else if (local33 > local25) {
				local33 = local25;
			}
			Static371.anInt5975 += local33;
		}
		if (Static196.anInt3536 != local13) {
			local25 = local13 - Static196.anInt3536;
			local33 = (int) (arg0 * (long) local25 / 320L);
			if (local25 <= 0) {
				if (local33 == 0) {
					local33 = -1;
				} else if (local33 < local25) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = 1;
			} else if (local33 > local25) {
				local33 = local25;
			}
			Static196.anInt3536 += local33;
		}
		if (!Static413.aClass49_Sub1_1.aBoolean230) {
			Static109.aFloat75 += Static33.aFloat7 * (float) arg0 / 40.0F * 8.0F;
			Static439.aFloat99 += (float) arg0 * Static390.aFloat102 / 40.0F * 8.0F;
		}
		Static167.method2319();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!fw;III)J")
	public static long method1723(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) long local13 = 4194304L;
		@Pc(15) long local15 = 2147483648L;
		@Pc(17) long local17 = Long.MIN_VALUE;
		@Pc(24) Class114 local24 = Static51.aClass151_1.method2917(arg0.method5603());
		@Pc(47) long local47 = (long) ((arg0.method5606() | 0x10000) << 14 | arg2 | arg1 << 7 | arg0.method5600() << 20);
		if (local24.anInt2871 == 0) {
			local47 |= local17;
		}
		if (local24.anInt2854 == 1) {
			local47 |= local13;
		}
		if (local24.aBoolean215) {
			local47 |= local15;
		}
		return local47 | (long) arg0.method5603() << 32;
	}
}
