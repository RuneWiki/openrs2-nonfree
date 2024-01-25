import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!ou", name = "L", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!ou", name = "M", descriptor = "Z")
	public static boolean aBoolean628 = false;

	@OriginalMember(owner = "client!ou", name = "J", descriptor = "I")
	public static int anInt8264 = 0;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V")
	public static void method6951() {
		Static587.anInt9597 = -1;
		Static293.anInt5243 = -1;
		Static277.anIntArray289 = null;
		Static30.aClass181_1 = null;
		Static437.aClass181_8 = null;
		Static640.aClass181_14 = null;
		Static488.anInterface20_1 = null;
		Static76.anInterface20Array1 = null;
		Static553.anInt9241 = -1;
		Static622.aClass67_15 = null;
		Static175.anInt10578 = -1;
		Static648.aClass88_3.method2241();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIII)I")
	public static int method6952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static193.anInt3390 < 100) {
			return -2;
		}
		@Pc(13) int local13 = -2;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(28) int local28 = arg0 - Static654.anInt8153;
		@Pc(33) int local33 = arg2 - Static654.anInt8150;
		for (@Pc(38) Class3_Sub12 local38 = (Class3_Sub12) Static654.aClass357_50.method8391(); local38 != null; local38 = (Class3_Sub12) Static654.aClass357_50.method8392()) {
			if (local38.anInt950 == arg1) {
				@Pc(53) int local53 = local38.anInt952;
				@Pc(56) int local56 = local38.anInt947;
				@Pc(66) int local66 = local53 + Static654.anInt8153 << 14 | Static654.anInt8150 + local56;
				@Pc(85) int local85 = (local33 - local56) * (local33 + -local56) + (local28 - local53) * (-local53 + local28);
				if (local13 < 0 || local85 < local15) {
					local13 = local66;
					local15 = local85;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(II)V")
	public static void method6953(@OriginalArg(0) int arg0) {
		if (Static713.aClass3_Sub55_31.aClass15_Sub15_1.method6340() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static383.anInt6847) {
			return;
		}
		if (arg0 != -1) {
			@Pc(31) Class31 local31 = Static621.aClass336_2.method7995(arg0);
			@Pc(35) Class194 local35 = local31.method673();
			if (local35 == null) {
				arg0 = -1;
			} else {
				Static310.aClass47_4.method948(new Point(local31.anInt857, local31.anInt854), Static67.aCanvas1, local35.method4758(), local35.method4761(), local35.method4753());
				Static383.anInt6847 = arg0;
			}
		}
		if (arg0 == -1 && Static383.anInt6847 != -1) {
			Static310.aClass47_4.method948(new Point(), Static67.aCanvas1, -1, (int[]) null, -1);
			Static383.anInt6847 = -1;
		}
	}

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "(I)V")
	public static void method6954() {
		if (Static533.aClass371_8 != Static487.aClass371_7) {
			try {
				Static733.method8728(Static556.aClient1, "tbrefresh");
			} catch (@Pc(24) Throwable local24) {
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIILclient!qca;Lclient!qca;)V")
	public static void method6955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19_Sub1_Sub2 arg3, @OriginalArg(4) Class19_Sub1_Sub2 arg4) {
		@Pc(4) Class262 local4 = Static512.method7319(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass19_Sub1_Sub2_2 = arg3;
		local4.aClass19_Sub1_Sub2_1 = arg4;
		@Pc(22) int local22 = Static639.aClass313Array2 == Static711.aClass313Array3 ? 1 : 0;
		if (!arg3.method9366()) {
			arg3.aClass19_Sub1_25 = Static634.aClass19_Sub1Array4[local22];
			Static634.aClass19_Sub1Array4[local22] = arg3;
		} else if (arg3.method9360()) {
			arg3.aClass19_Sub1_25 = Static358.aClass19_Sub1Array2[local22];
			Static358.aClass19_Sub1Array2[local22] = arg3;
		} else {
			arg3.aClass19_Sub1_25 = Static660.aClass19_Sub1Array5[local22];
			Static660.aClass19_Sub1Array5[local22] = arg3;
			Static70.aBoolean89 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9366()) {
			if (arg4.method9360()) {
				arg4.aClass19_Sub1_25 = Static358.aClass19_Sub1Array2[local22];
				Static358.aClass19_Sub1Array2[local22] = arg4;
				return;
			}
			arg4.aClass19_Sub1_25 = Static660.aClass19_Sub1Array5[local22];
			Static660.aClass19_Sub1Array5[local22] = arg4;
			Static70.aBoolean89 = true;
			return;
		}
		arg4.aClass19_Sub1_25 = Static634.aClass19_Sub1Array4[local22];
		Static634.aClass19_Sub1Array4[local22] = arg4;
	}
}
