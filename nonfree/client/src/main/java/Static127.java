import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public static int anInt2798;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "J")
	public static long aLong97 = 0L;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public static int anInt2797 = 0;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
	public static int anInt2799 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Lclient!sn;")
	public static Class7_Sub1_Sub15 method2610() {
		@Pc(14) Class7_Sub1_Sub15 local14 = (Class7_Sub1_Sub15) Static93.aClass30_2.method505();
		if (local14 != null) {
			local14.method5648();
			local14.method5509();
			return local14;
		}
		do {
			local14 = (Class7_Sub1_Sub15) Static304.aClass30_10.method505();
			if (local14 == null) {
				return null;
			}
			if (local14.method4791() > Static335.method5308()) {
				return null;
			}
			local14.method5648();
			local14.method5509();
		} while ((Long.MIN_VALUE & local14.aLong222) == 0L);
		return local14;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
	public static void method2611(@OriginalArg(0) int arg0) {
		Static341.anInt6483 = arg0;
		@Pc(7) Class103 local7 = Static41.aClass103_12;
		synchronized (Static41.aClass103_12) {
			Static41.aClass103_12.method2678();
		}
		local7 = Static283.aClass103_59;
		synchronized (Static283.aClass103_59) {
			Static283.aClass103_59.method2678();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
	public static void method2612() {
		Static69.aClass103_17.method2679(5);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!rk;I)I")
	public static int method2613(@OriginalArg(0) Class180 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4562(Static258.anInt5003)) {
			local5++;
		}
		if (arg0.method4562(Static219.anInt4373)) {
			local5++;
		}
		return local5;
	}
}
