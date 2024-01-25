import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!fia;")
	public static Class45 aClass45_31;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!ha;J)V")
	public static void method8532(@OriginalArg(1) Class144 arg0, @OriginalArg(2) long arg1) {
		Static557.anInt8794 = 0;
		Static323.anInt5614 = Static479.anInt8315;
		Static620.anInt10185 = 0;
		Static479.anInt8315 = 0;
		@Pc(16) long local16 = Static26.method382();
		for (@Pc(21) Class4_Sub8 local21 = (Class4_Sub8) Static440.aClass283_5.method6791(); local21 != null; local21 = (Class4_Sub8) Static440.aClass283_5.method6792()) {
			if (local21.method8673(arg0, arg1)) {
				Static557.anInt8794++;
			}
		}
		if (Static597.aBoolean678 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static440.aClass283_5.method6799() + ", running: " + Static557.anInt8794);
			System.out.println("Emitters: " + Static620.anInt10185 + " Particles: " + Static479.anInt8315 + ". Time taken: " + (Static26.method382() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(JIZIILclient!qga;IILclient!aa;)V")
	public static void method8534(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class299 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(17) int local17 = arg5 * arg5 + arg2 * arg2;
		if (arg0 < (long) local17) {
			return;
		}
		@Pc(34) int local34 = Math.min(arg4.anInt8573 / 2, arg4.anInt8547 / 2);
		if (local17 <= local34 * local34) {
			Static23.method336(arg6, arg2, arg4, arg7, arg5, Static161.aClass45Array7[arg3], arg1);
			return;
		}
		local34 -= 10;
		@Pc(63) int local63;
		if (Static304.anInt5410 == 4) {
			local63 = (int) Static139.aFloat16 & 0x3FFF;
		} else {
			local63 = (int) Static139.aFloat16 + Static405.anInt7023 & 0x3FFF;
		}
		@Pc(77) int local77 = Class141.anIntArray207[local63];
		@Pc(81) int local81 = Class141.anIntArray208[local63];
		if (Static304.anInt5410 != 4) {
			local77 = local77 * 256 / (Static195.anInt3404 + 256);
			local81 = local81 * 256 / (Static195.anInt3404 + 256);
		}
		@Pc(110) int local110 = arg5 * local81 + arg2 * local77 >> 14;
		@Pc(121) int local121 = arg2 * local81 - local77 * arg5 >> 14;
		@Pc(127) double local127 = Math.atan2((double) local110, (double) local121);
		@Pc(134) int local134 = (int) ((double) local34 * Math.sin(local127));
		@Pc(141) int local141 = (int) (Math.cos(local127) * (double) local34);
		Static257.aClass45Array14[arg3].method7494((float) local134 + (float) arg4.anInt8573 / 2.0F + (float) arg1, (float) arg4.anInt8547 / 2.0F + (float) arg6 - (float) local141, 4096, (int) (-local127 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ida;Z)I")
	public static int method8538(@OriginalArg(0) Class170 arg0) {
		if (Static27.aClass170_2 == arg0) {
			return 9216;
		} else if (arg0 == Static298.aClass170_4) {
			return 34065;
		} else if (arg0 == Static181.aClass170_3) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
