import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
	public static int anInt4676;

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString42 = null;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILclient!sc;)J")
	public static long method4120(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface7 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(20) Class84 local20 = Static108.method1650(arg2.method5410());
		@Pc(41) long local41 = (long) (arg0 | 0x40000000 | arg1 << 7 | arg2.method5414() << 14 | arg2.method5413() << 20);
		if (local20.anInt2016 == 0) {
			local41 |= local9;
		}
		if (local20.anInt2031 == 1) {
			local41 |= local5;
		}
		if (local20.aBoolean123) {
			local41 |= local7;
		}
		return local41 | (long) arg2.method5410() << 32;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZI)I")
	public static int method4121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)V")
	public static void method4123(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static293.anInt5807 - Static67.anInt1251;
		if (local8 >= 100) {
			Static81.anInt1498 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static21.aFloat10;
		if (Static79.anInt5248 >> 8 > local19) {
			local19 = Static79.anInt5248 >> 8;
		}
		if (Static311.aBooleanArray4[4] && Static43.anIntArray62[4] + 128 > local19) {
			local19 = Static43.anIntArray62[4] + 128;
		}
		@Pc(53) int local53 = (int) Static246.aFloat51 + Static84.anInt1522 & 0x3FFF;
		Static215.method3868(Static114.anInt2169, Static168.method2721(Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308, Static322.anInt6250, Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310) - 50, local19, (local19 >> 3) * 3 + 600, local53, Static169.anInt6309, arg0);
		@Pc(99) float local99 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static184.anInt3721 = (int) (local99 * (float) (Static184.anInt3721 - Static209.anInt4260) + (float) Static209.anInt4260);
		Static86.anInt1541 = (int) ((float) Static201.anInt6774 + local99 * (float) (Static86.anInt1541 - Static201.anInt6774));
		Static316.anInt6169 = (int) (local99 * (float) (Static316.anInt6169 - Static284.anInt5609) + (float) Static284.anInt5609);
		Static190.anInt3870 = (int) ((float) (Static190.anInt3870 - Static214.anInt4400) * local99 + (float) Static214.anInt4400);
		@Pc(149) int local149 = Static308.anInt6050 - Static344.anInt6594;
		if (local149 > 8192) {
			local149 -= 16384;
		} else if (local149 < -8192) {
			local149 += 16384;
		}
		Static308.anInt6050 = (int) ((float) local149 * local99 + (float) Static344.anInt6594);
		Static308.anInt6050 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	public static void method4129() {
		@Pc(5) Class26 local5 = Static276.aClass26_50;
		synchronized (Static276.aClass26_50) {
			Static276.aClass26_50.method328();
		}
	}
}
