import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!ae;")
	public static Class8 aClass8_13;

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "Lclient!vt;")
	public static Class380 aClass380_1;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
	public static int anInt1029 = -1;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "Z")
	public static final boolean aBoolean53 = false;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
	public static int anInt1033 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLclient!sha;III)V")
	public static void method967(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class321 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg1.anInt9103;
		if (arg1.aByte131 == 0) {
			arg1.anInt9103 = arg1.anInt9086;
		} else if (arg1.aByte131 == 1) {
			arg1.anInt9103 = arg2 - arg1.anInt9086;
		} else if (arg1.aByte131 == 2) {
			arg1.anInt9103 = arg1.anInt9086 * arg2 >> 14;
		}
		@Pc(58) int local58 = arg1.anInt9077;
		if (arg1.aByte134 == 0) {
			arg1.anInt9077 = arg1.anInt9054;
		} else if (arg1.aByte134 == 1) {
			arg1.anInt9077 = arg3 - arg1.anInt9054;
		} else if (arg1.aByte134 == 2) {
			arg1.anInt9077 = arg1.anInt9054 * arg3 >> 14;
		}
		if (arg1.aByte131 == 4) {
			arg1.anInt9103 = arg1.anInt9077 * arg1.anInt9052 / arg1.anInt9021;
		}
		if (arg1.aByte134 == 4) {
			arg1.anInt9077 = arg1.anInt9021 * arg1.anInt9103 / arg1.anInt9052;
		}
		if (Static383.aBoolean423 && (Static83.method1453(arg1).anInt6747 != 0 || arg1.anInt9105 == 0)) {
			if (arg1.anInt9077 < 5 && arg1.anInt9103 < 5) {
				arg1.anInt9103 = 5;
				arg1.anInt9077 = 5;
			} else {
				if (arg1.anInt9103 <= 0) {
					arg1.anInt9103 = 5;
				}
				if (arg1.anInt9077 <= 0) {
					arg1.anInt9077 = 5;
				}
			}
		}
		if (Static353.anInt6022 == arg1.anInt9098) {
			Static14.aClass321_4 = arg1;
		}
		if (arg0 && arg1.anObjectArray25 != null && (local8 != arg1.anInt9103 || local58 != arg1.anInt9077)) {
			@Pc(211) Class6_Sub49 local211 = new Class6_Sub49();
			local211.anObjectArray35 = arg1.anObjectArray25;
			local211.aClass321_44 = arg1;
			Static296.aClass362_22.method8536(local211);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIILclient!ha;II)V")
	public static void method968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class132 arg3, @OriginalArg(7) int arg4) {
		arg3.method7512(arg4, arg0, arg2, arg1, -10660793);
		arg3.method7512(16, arg0 - 2, arg2 + 1, arg1 + 1, -16777216);
		arg3.method7462(-16777216, arg0 - 2, arg2 + 1, arg1 + 18, arg4 + -19);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	public static void method969() {
		Static17.method471();
		@Pc(12) int local12 = Static96.aClass6_Sub22_7.aClass29_Sub14_1.method5231();
		if (local12 == 2) {
			Static138.method2062(Static348.anInt5935, Static546.aClass132_13, Static449.anInt7506);
		} else if (local12 == 3) {
			Static432.method6398(Static347.anInt10657, Static348.anInt5935, Static546.aClass132_13, Static449.anInt7506, Static114.anInt2056);
		}
		if (Static96.aClass6_Sub22_7.aClass29_Sub14_1.method5232()) {
			Static556.method7865(Static140.aCanvas1);
		}
		if (Static546.aClass132_13 != null) {
			Static665.method9027();
		}
		Static487.aBoolean565 = Static96.aClass6_Sub22_7.aClass29_Sub14_1.method5231() != 0;
		Static594.aBoolean693 = Static96.aClass6_Sub22_7.aClass29_Sub14_1.method5232();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBZ)Lclient!rk;")
	public static Class2_Sub9 method971(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) Class43[] local7 = Class6_Sub9.aClass43Array1;
		synchronized (Class6_Sub9.aClass43Array1) {
			@Pc(27) Class2_Sub9 local27;
			if (Class6_Sub9.aClass43Array1.length <= arg0 || Class6_Sub9.aClass43Array1[arg0].method1086()) {
				local27 = new Class2_Sub9();
				local27.aClass2_Sub5Array1 = new Class2_Sub5[arg0];
				for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
					local27.aClass2_Sub5Array1[local33] = new Class2_Sub5();
				}
			} else {
				local27 = (Class2_Sub9) Class6_Sub9.aClass43Array1[arg0].method1085();
				local27.method8436();
				@Pc(66) int local66 = Static506.anIntArray557[arg0]--;
			}
			local27.aBoolean590 = arg1;
			return local27;
		}
	}
}
