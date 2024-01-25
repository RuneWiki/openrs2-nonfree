import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "Lclient!uq;")
	public static Class362 aClass362_87;

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "Lclient!ef;")
	public static Class97 aClass97_4;

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
	public static int anInt6667 = -1;

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "[I")
	public static final int[] anIntArray348 = new int[8];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!ofa;IIZ)V")
	public static void method5595(@OriginalArg(0) Class265 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static47.aBoolean59) {
			@Pc(18) Class281 local18 = Static341.anInt5871 == -1 ? null : Static389.aClass335_2.method7504(Static341.anInt5871);
			if (Static86.method1383(arg0).method6488() && (Static344.anInt5895 & 0x20) != 0 && (local18 == null || arg0.method5918(local18.anInt7362, Static341.anInt5871) != local18.anInt7362)) {
				Static390.method5454(arg0.anInt7005, true, Static36.aString12, 0L, 57, arg0.anInt7032, Static225.aString51 + " -> " + arg0.aString90, (long) (arg0.anInt7032 | arg0.anInt7004 << 0), false, arg0.anInt7004, Static213.anInt3686, false);
			}
		}
		@Pc(85) String local85;
		for (@Pc(78) int local78 = 9; local78 >= 5; local78--) {
			local85 = Static96.method1617(local78, arg0);
			if (local85 != null) {
				Static390.method5454(arg0.anInt7005, true, local85, (long) (local78 + 1), 1002, arg0.anInt7032, arg0.aString90, (long) (arg0.anInt7032 | arg0.anInt7004 << 0), false, arg0.anInt7004, Static78.method1306(local78, arg0), false);
			}
		}
		local85 = Static316.method4544(arg0);
		if (local85 != null) {
			Static390.method5454(arg0.anInt7005, true, local85, 0L, 17, arg0.anInt7032, arg0.aString90, (long) (arg0.anInt7004 << 0 | arg0.anInt7032), false, arg0.anInt7004, arg0.anInt6977, false);
		}
		for (@Pc(169) int local169 = 4; local169 >= 0; local169--) {
			@Pc(176) String local176 = Static96.method1617(local169, arg0);
			if (local176 != null) {
				Static390.method5454(arg0.anInt7005, true, local176, (long) (local169 + 1), 19, arg0.anInt7032, arg0.aString90, (long) (arg0.anInt7032 | arg0.anInt7004 << 0), false, arg0.anInt7004, Static78.method1306(local169, arg0), false);
			}
		}
		if (!Static86.method1383(arg0).method6480()) {
			return;
		}
		if (arg0.aString88 == null) {
			Static390.method5454(arg0.anInt7005, true, Static114.aClass84_10.method1729(Static654.anInt10668), 0L, 16, arg0.anInt7032, "", (long) (arg0.anInt7004 << 0 | arg0.anInt7032), false, arg0.anInt7004, -1, false);
		} else {
			Static390.method5454(arg0.anInt7005, true, arg0.aString88, 0L, 16, arg0.anInt7032, "", (long) (arg0.anInt7004 << 0 | arg0.anInt7032), false, arg0.anInt7004, -1, false);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!pja;)[I")
	public static int[] method5596(@OriginalArg(1) Class3_Sub37 arg0) {
		@Pc(10) Class3_Sub4 local10 = new Class3_Sub4(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method7948(10);
		local10.method7909(local13[0]);
		local10.method7909(local13[1]);
		local10.method7909(local13[2]);
		local10.method7909(local13[3]);
		for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
			local10.method7909((int) (Math.random() * 9.9999999E7D));
		}
		local10.method7956((int) (Math.random() * 9.9999999E7D));
		local10.method7950(Static391.aBigInteger3, Static107.aBigInteger1);
		arg0.aClass3_Sub4_Sub1_2.method7939(local10.aByteArray90, local10.anInt9739, 0);
		return local13;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIC)I")
	public static int method5597(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(24) char local24 = Character.toLowerCase(arg1);
			local7 = (local24 << 4) + 1;
		}
		return local7;
	}
}
