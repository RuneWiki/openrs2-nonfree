import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "Lclient!ok;")
	public static Class178 aClass178_12;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "[B")
	public static final byte[] aByteArray8 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
	public static void method420() {
		Static403.aClipboard2 = null;
		Static94.aBoolean106 = false;
		Static193.method2788();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	public static void method421() {
		for (@Pc(10) Class28_Sub8 local10 = (Class28_Sub8) Static104.aClass169_3.method3599(); local10 != null; local10 = (Class28_Sub8) Static104.aClass169_3.method3599()) {
			Static380.method3578(local10);
		}
		@Pc(35) int local35;
		@Pc(34) int local34;
		if (Static130.aClass153_Sub1_1.method4229(Static377.anInt6113)) {
			local34 = 3;
			local35 = 0;
		} else {
			local34 = Static179.anInt7446;
			local35 = Static179.anInt7446;
		}
		Static52.method733();
		for (@Pc(44) int local44 = local35; local44 <= local34; local44++) {
			Static52.method735();
			Static52.method718(local44);
			Static52.method720(local44);
		}
		Static52.method723();
		Static52.method728();
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
	public static void method423() {
		Static197.anInt3471 = 0;
		Static7.anInt43 = 0;
		Static345.anInt5551 = 0;
		Static207.anInt3647 = 0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)V")
	public static void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static19.aClass223ArrayArrayArray1 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg2 << 28 | arg1 << 14 | arg0);
		@Pc(25) Class7_Sub34 local25 = (Class7_Sub34) Static345.aClass164_33.method3512(local19);
		if (local25 == null) {
			Static52.method724(arg2, arg0, arg1);
			return;
		}
		@Pc(39) Class7_Sub24 local39 = (Class7_Sub24) local25.aClass85_31.method2010();
		if (local39 == null) {
			Static52.method724(arg2, arg0, arg1);
			return;
		}
		@Pc(53) Class26_Sub5_Sub1 local53 = (Class26_Sub5_Sub1) Static52.method724(arg2, arg0, arg1);
		if (local53 == null) {
			local53 = new Class26_Sub5_Sub1();
		} else {
			local53.anInt4199 = local53.anInt4206 = -1;
		}
		local53.anInt4204 = local39.anInt3082;
		local53.anInt4203 = local39.anInt3083;
		label44: while (true) {
			@Pc(85) Class7_Sub24 local85 = (Class7_Sub24) local25.aClass85_31.method2000();
			if (local85 == null) {
				break;
			}
			if (local85.anInt3082 != local53.anInt4204) {
				local53.anInt4199 = local85.anInt3082;
				local53.anInt4207 = local85.anInt3083;
				while (true) {
					@Pc(110) Class7_Sub24 local110 = (Class7_Sub24) local25.aClass85_31.method2000();
					if (local110 == null) {
						break label44;
					}
					if (local110.anInt3082 != local53.anInt4204 && local110.anInt3082 != local53.anInt4199) {
						local53.anInt4201 = local110.anInt3083;
						local53.anInt4206 = local110.anInt3082;
					}
				}
			}
		}
		@Pc(154) int local154 = Static333.method2748(arg2, (arg1 << 7) + 64, (arg0 << 7) + 64);
		Static276.method3692(arg2, arg0, arg1, local154, local53);
	}
}
