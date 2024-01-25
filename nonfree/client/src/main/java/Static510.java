import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
	public static void method7144() {
		if (Static86.aClass1_Sub30_Sub1_1.method5029(Static286.anInt5239) || Static240.anInt4414 == Static398.anInt7155) {
			Static16.method392(Static31.aClass78_18);
			if (Static240.anInt4414 != Static443.anInt7825) {
				Static405.method5819();
			}
		} else {
			Static549.method7484(Static518.anInt9329, Static276.anInt5046, false, 11);
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(III)Z")
	public static boolean method7145(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static146.method2463(arg1, arg0) || Static391.method5620(arg0, arg1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIZI)I")
	public static int method7147(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub45 local10 = Static365.method5366(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < local10.anIntArray520.length; local24++) {
				if (local10.anIntArray521[local24] == arg2) {
					local22 += local10.anIntArray520[local24];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!qh;I)V")
	public static void method7148(@OriginalArg(0) Class11_Sub1_Sub1_Sub3_Sub2 arg0) {
		for (@Pc(14) Class1_Sub4 local14 = (Class1_Sub4) Static452.aClass111_52.method2547(); local14 != null; local14 = (Class1_Sub4) Static452.aClass111_52.method2554()) {
			if (arg0 == local14.aClass11_Sub1_Sub1_Sub3_Sub2_1) {
				if (local14.aClass1_Sub6_Sub4_1 != null) {
					Static425.aClass1_Sub6_Sub3_2.method6532(local14.aClass1_Sub6_Sub4_1);
					local14.aClass1_Sub6_Sub4_1 = null;
				}
				local14.method7908();
				return;
			}
		}
	}
}
