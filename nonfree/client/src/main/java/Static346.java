import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!vo", name = "y", descriptor = "Lclient!jd;")
	public static Class13 aClass13_20;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
	public static int anInt7001;

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "J")
	public static long aLong220;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIZLclient!nk;)V", line = 3)
	public static void method6257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class161 arg3) {
		@Pc(8) int local8 = arg3.anInt4242;
		@Pc(11) int local11 = arg3.anInt4255;
		if (arg3.aByte47 == 0) {
			arg3.anInt4242 = arg3.anInt4287;
		} else if (arg3.aByte47 == 1) {
			arg3.anInt4242 = arg1 - arg3.anInt4287;
		} else if (arg3.aByte47 == 2) {
			arg3.anInt4242 = arg1 * arg3.anInt4287 >> 14;
		}
		if (arg3.aByte44 == 0) {
			arg3.anInt4255 = arg3.anInt4282;
		} else if (arg3.aByte44 == 1) {
			arg3.anInt4255 = arg0 - arg3.anInt4282;
		} else if (arg3.aByte44 == 2) {
			arg3.anInt4255 = arg0 * arg3.anInt4282 >> 14;
		}
		if (arg3.aByte47 == 4) {
			arg3.anInt4242 = arg3.anInt4255 * arg3.anInt4237 / arg3.anInt4284;
		}
		if (arg3.aByte44 == 4) {
			arg3.anInt4255 = arg3.anInt4284 * arg3.anInt4242 / arg3.anInt4237;
		}
		if (Class15_Sub1.aBoolean30 && (Static42.method1406(arg3).anInt1756 != 0 || arg3.anInt4265 == 0)) {
			if (arg3.anInt4255 < 5 && arg3.anInt4242 < 5) {
				arg3.anInt4255 = 5;
				arg3.anInt4242 = 5;
			} else {
				if (arg3.anInt4242 <= 0) {
					arg3.anInt4242 = 5;
				}
				if (arg3.anInt4255 <= 0) {
					arg3.anInt4255 = 5;
				}
			}
		}
		if (arg3.anInt4266 == Class2_Sub24.anInt5743) {
			Class17.aClass161_1 = arg3;
		}
		if (arg2 && arg3.anObjectArray6 != null && (arg3.anInt4242 != local8 || local11 != arg3.anInt4255)) {
			@Pc(191) Class2_Sub13 local191 = new Class2_Sub13();
			local191.aClass161_3 = arg3;
			local191.anObjectArray4 = arg3.anObjectArray6;
			Class183.aClass135_30.method3541(local191);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(JILclient!wm;)V", line = 90)
	public static void method6258(@OriginalArg(0) long arg0, @OriginalArg(2) Class19 arg1) {
		Class84.anInt2357 = 0;
		Class49_Sub2_Sub1.anInt6301 = Static288.anInt5797;
		Static288.anInt5797 = 0;
		@Pc(16) long local16 = Static190.method3686();
		for (@Pc(21) Class12_Sub5 local21 = (Class12_Sub5) Static122.aClass36_4.method1417(); local21 != null; local21 = (Class12_Sub5) Static122.aClass36_4.method1422()) {
			if (local21.method4353(arg1, arg0)) {
				Class84.anInt2357++;
			}
		}
		if (Class193.aBoolean391 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static122.aClass36_4.method1421() + ", running: " + Class84.anInt2357 + ". Particles: " + Static288.anInt5797 + ". Time taken: " + (Static190.method3686() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([BI)[B", line = 165)
	public static byte[] method6259(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local6];
		Static390.method4608(arg0, 0, local17, 0, local6);
		return local17;
	}
}
