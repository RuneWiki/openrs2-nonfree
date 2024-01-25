import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "Lclient!jd;")
	public static final Class119 aClass119_19 = new Class119(13, 0, 1, 0);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!qa;JI)V")
	public static void method5261(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		Static437.anInt7470 = Static217.anInt4262;
		Static187.anInt3763 = 0;
		Static217.anInt4262 = 0;
		@Pc(19) long local19 = Static150.method2672();
		for (@Pc(24) Class13_Sub8 local24 = (Class13_Sub8) Static182.aClass40_3.method1188(); local24 != null; local24 = (Class13_Sub8) Static182.aClass40_3.method1195()) {
			if (local24.method5941(arg0, arg1)) {
				Static187.anInt3763++;
			}
		}
		if (Static138.aBoolean247 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static182.aClass40_3.method1193() + ", running: " + Static187.anInt3763 + ". Particles: " + Static217.anInt4262 + ". Time taken: " + (Static150.method2672() - local19) + "ms");
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)Z")
	public static boolean method5263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static127.anInt2697; local1++) {
			@Pc(6) Class70 local6 = Static201.aClass70Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2234 == 1) {
				local15 = local6.anInt2248 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2245 + (local6.anInt2243 * local15 >> 8);
					local37 = local6.anInt2253 + (local6.anInt2249 * local15 >> 8);
					local47 = local6.anInt2250 + (local6.anInt2240 * local15 >> 8);
					local57 = local6.anInt2236 + (local6.anInt2241 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2234 == 2) {
				local15 = arg0 - local6.anInt2248;
				if (local15 > 0) {
					local27 = local6.anInt2245 + (local6.anInt2243 * local15 >> 8);
					local37 = local6.anInt2253 + (local6.anInt2249 * local15 >> 8);
					local47 = local6.anInt2250 + (local6.anInt2240 * local15 >> 8);
					local57 = local6.anInt2236 + (local6.anInt2241 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2234 == 3) {
				local15 = local6.anInt2245 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2248 + (local6.anInt2247 * local15 >> 8);
					local37 = local6.anInt2237 + (local6.anInt2244 * local15 >> 8);
					local47 = local6.anInt2250 + (local6.anInt2240 * local15 >> 8);
					local57 = local6.anInt2236 + (local6.anInt2241 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2234 == 4) {
				local15 = arg2 - local6.anInt2245;
				if (local15 > 0) {
					local27 = local6.anInt2248 + (local6.anInt2247 * local15 >> 8);
					local37 = local6.anInt2237 + (local6.anInt2244 * local15 >> 8);
					local47 = local6.anInt2250 + (local6.anInt2240 * local15 >> 8);
					local57 = local6.anInt2236 + (local6.anInt2241 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2234 == 5) {
				local15 = arg1 - local6.anInt2250;
				if (local15 > 0) {
					local27 = local6.anInt2248 + (local6.anInt2247 * local15 >> 8);
					local37 = local6.anInt2237 + (local6.anInt2244 * local15 >> 8);
					local47 = local6.anInt2245 + (local6.anInt2243 * local15 >> 8);
					local57 = local6.anInt2253 + (local6.anInt2249 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method5264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(15) int local15;
		if (local9 == 0) {
			local15 = 0;
		} else {
			local15 = 8 - local9;
		}
		@Pc(28) int local28 = -((arg3 + 8 - 1) / 8);
		@Pc(37) int local37 = -((arg4 + 7) / 8);
		for (@Pc(44) int local44 = local28; local44 < 0; local44++) {
			for (@Pc(48) int local48 = local37; local48 < 0; local48++) {
				if (arg2[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local15;
			if (arg2[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg1;
		}
		return false;
	}
}
