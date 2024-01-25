import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "Lclient!nga;")
	public static Class250 aClass250_3;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)Z")
	public static boolean method7605(@OriginalArg(1) int arg0) {
		if (arg0 == 48 || arg0 == 11 || arg0 == 17 || arg0 == 2 || arg0 == 5 || arg0 == 1010) {
			return true;
		} else {
			return arg0 == 4;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIJ)V")
	public static void method7607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static369.method5538(arg1, true, 0, local17, local10, 0, 0, arg0);
			return;
		}
		@Pc(47) Class128 local47 = Static212.aClass249_4.method6119(local29);
		@Pc(62) int local62;
		@Pc(65) int local65;
		if (local17 == 0 || local17 == 2) {
			local62 = local47.anInt2959;
			local65 = local47.anInt2975;
		} else {
			local65 = local47.anInt2959;
			local62 = local47.anInt2975;
		}
		@Pc(76) int local76 = local47.anInt2967;
		if (local17 != 0) {
			local76 = (local76 << local17 & 0xF) + (local76 >> 4 - local17);
		}
		Static369.method5538(arg1, true, local62, 0, 0, local76, local65, arg0);
	}
}
