import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V")
	public static void method7842() {
		Static118.aClass22_10.method473();
		Static207.aClass22_18.method473();
		Static103.aClass22_8.method473();
		Static359.aClass22_30.method473();
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(II)I")
	public static int method7843(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 & 0x3F;
		@Pc(20) int local20 = arg0 >> 6 & 0x3;
		if (local14 == 18) {
			if (local20 == 0) {
				return 1;
			}
			if (local20 == 1) {
				return 2;
			}
			if (local20 == 2) {
				return 4;
			}
			if (local20 == 3) {
				return 8;
			}
		} else if (local14 == 19 || local14 == 21) {
			if (local20 == 0) {
				return 16;
			}
			if (local20 == 1) {
				return 32;
			}
			if (local20 == 2) {
				return 64;
			}
			if (local20 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(JILclient!ha;)V")
	public static void method7844(@OriginalArg(0) long arg0, @OriginalArg(2) Class101 arg1) {
		Static280.anInt5182 = 0;
		Static3.anInt10076 = 0;
		Static464.anInt8320 = Static211.anInt4371;
		Static211.anInt4371 = 0;
		@Pc(16) long local16 = Static99.method1701();
		for (@Pc(21) Class15_Sub5 local21 = (Class15_Sub5) Static559.aClass60_8.method1547(); local21 != null; local21 = (Class15_Sub5) Static559.aClass60_8.method1546()) {
			if (local21.method2310(arg1, arg0)) {
				Static3.anInt10076++;
			}
		}
		if (Static648.aBoolean798 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static559.aClass60_8.method1549() + ", running: " + Static3.anInt10076);
			System.out.println("Emitters: " + Static280.anInt5182 + " Particles: " + Static211.anInt4371 + ". Time taken: " + (Static99.method1701() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(BI)S")
	public static short method7845(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = arg0 >> 10 & 0x3F;
		@Pc(23) int local23 = arg0 >> 3 & 0x70;
		@Pc(27) int local27 = arg0 & 0x7F;
		@Pc(45) int local45 = local27 > 64 ? (127 - local27) * local23 >> 7 : local27 * local23 >> 7;
		@Pc(50) int local50 = local27 + local45;
		@Pc(56) int local56;
		if (local50 == 0) {
			local56 = local45 << 1;
		} else {
			local56 = (local45 << 8) / local50;
		}
		return (short) (local56 >> 4 << 7 | local17 << 10 | local50);
	}
}
