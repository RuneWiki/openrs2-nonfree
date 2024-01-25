import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "I")
	public static int anInt8299 = -1;

	@OriginalMember(owner = "client!sea", name = "f", descriptor = "[S")
	public static final short[] aShortArray137 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILclient!vl;IIB)V")
	public static void method6540(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub50 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg0 << 14 | arg3 << 28 | arg2);
		@Pc(22) Class6_Sub30 local22 = (Class6_Sub30) Static500.aClass234_44.method5464(local16);
		if (local22 == null) {
			local22 = new Class6_Sub30();
			Static500.aClass234_44.method5466(local16, local22);
			local22.aClass298_137.method6812(arg1);
			return;
		}
		@Pc(47) Class236 local47 = Static119.aClass244_4.method5726(arg1.anInt9642);
		@Pc(50) int local50 = local47.anInt6806;
		if (local47.anInt6783 == 1) {
			local50 *= arg1.anInt9643 + 1;
		}
		for (@Pc(69) Class6_Sub50 local69 = (Class6_Sub50) local22.aClass298_137.method6809(); local69 != null; local69 = (Class6_Sub50) local22.aClass298_137.method6821()) {
			local47 = Static119.aClass244_4.method5726(local69.anInt9642);
			@Pc(80) int local80 = local47.anInt6806;
			if (local47.anInt6783 == 1) {
				local80 *= local69.anInt9643 + 1;
			}
			if (local50 > local80) {
				Static182.method3030(arg1, local69);
				return;
			}
		}
		local22.aClass298_137.method6812(arg1);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)Lclient!pd;")
	public static Class139_Sub1 method6542() {
		return Static446.aClass139_Sub1Array2.length > Static272.anInt4814 ? Static446.aClass139_Sub1Array2[Static272.anInt4814++] : null;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)V")
	public static void method6543(@OriginalArg(1) int arg0) {
		Static237.anInt4307 = arg0;
		@Pc(7) Class330 local7 = Static395.aClass330_46;
		synchronized (Static395.aClass330_46) {
			Static395.aClass330_46.method7688();
		}
		local7 = Static180.aClass330_22;
		synchronized (Static180.aClass330_22) {
			Static180.aClass330_22.method7688();
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(B)V")
	public static void method6544() {
		@Pc(15) int local15 = Static58.aClass6_Sub17_Sub1_1.method7360(Static79.anInt2700);
		if (local15 == 0) {
			Static289.aByteArrayArrayArray7 = null;
			Static236.method3677(0);
		} else if (local15 == 1) {
			Static532.method7254((byte) 0);
			Static236.method3677(512);
			if (Static267.aByteArrayArrayArray8 != null) {
				Static148.method2368();
			}
		} else {
			Static532.method7254((byte) (Static114.anInt1963 - 4 & 0xFF));
			Static236.method3677(2);
		}
		Static63.anInt1085 = Static391.anInt7128;
	}
}
