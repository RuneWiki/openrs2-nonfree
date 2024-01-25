import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "Lclient!ra;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!oh;ZII)V")
	public static void method2295(@OriginalArg(0) Class220 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray7 != null) {
			@Pc(13) Class5_Sub17 local13 = new Class5_Sub17();
			local13.anObjectArray3 = arg0.anObjectArray7;
			local13.aClass220_5 = arg0;
			Static266.method4403(local13);
		}
		Static383.anInt7004 = arg0.anInt6641;
		Static207.anInt3882 = arg0.anInt6661;
		Static192.anInt3701 = arg2;
		Static354.anInt6690 = arg1;
		Static186.anInt3582 = arg0.anInt6691;
		Static92.anInt2142 = arg0.anInt6685;
		Static479.aBoolean594 = true;
		Static496.anInt8516 = arg0.anInt6674;
		Static377.method5650(arg0);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BII)Lclient!aea;")
	public static Class10 method2296(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class10 local7 = new Class10();
		local7.anInt159 = arg1 + 6;
		local7.anInt162 = -1;
		local7.anInt163 = -1;
		local7.anInt165 = arg0 + 5 + 1;
		local7.anIntArrayArray2 = new int[local7.anInt165][local7.anInt159];
		local7.method303();
		return local7;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IC)Z")
	public static boolean method2297(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public static void method2298() {
		if (Static354.aBoolean473) {
			return;
		}
		Static354.aBoolean473 = true;
		if (Static300.aClass5_Sub28_Sub1_1.aBoolean334) {
			Static535.aFloat364 = (int) Static535.aFloat364 - 17 & 0xFFFFFFF0;
		} else {
			Static19.aFloat319 += (-12.0F - Static19.aFloat319) / 2.0F;
		}
		Static474.aBoolean196 = true;
	}
}
