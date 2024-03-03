import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 14)
	public static void method5284() {
		Static22.aClass2_Sub5_1 = new Class2_Sub5(Class173_Sub1.aClass79_105.method2269(Class197.anInt5569), "", Class77.anInt2216, 1001, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILclient!id;)J", line = 26)
	public static long method5285(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface6 arg2) {
		@Pc(13) long local13 = 4194304L;
		@Pc(15) long local15 = 2147483648L;
		@Pc(17) long local17 = Long.MIN_VALUE;
		@Pc(24) Class41 local24 = Static334.aClass202_4.method5164(arg2.method6086());
		@Pc(45) long local45 = (long) ((arg2.method6082() | 0x10000) << 14 | arg1 | arg0 << 7 | arg2.method6085() << 20);
		if (local24.anInt1334 == 0) {
			local45 |= local17;
		}
		if (local24.anInt1352 == 1) {
			local45 |= local13;
		}
		if (local24.aBoolean108) {
			local45 |= local15;
		}
		return local45 | (long) arg2.method6086() << 32;
	}
}
