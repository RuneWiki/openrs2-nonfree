import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_43 = new Class5(8);

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
	public static int anInt5026 = 0;

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "Z")
	public static boolean aBoolean373 = false;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZIIIII)V")
	public static void method4033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static314.method4580(arg2);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg2 - arg1;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg2;
		@Pc(23) int local23 = -arg2;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(55) int local55;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(82) int local82;
		if (Static161.anInt3448 <= arg4 && Static163.anInt3488 >= arg4) {
			@Pc(46) int[] local46 = Static376.anIntArrayArray64[arg4];
			local55 = Static439.method5863(arg3 - arg2, Static450.anInt7594, Static142.anInt3212);
			local64 = Static439.method5863(arg3 + arg2, Static450.anInt7594, Static142.anInt3212);
			local73 = Static439.method5863(arg3 - local14, Static450.anInt7594, Static142.anInt3212);
			local82 = Static439.method5863(arg3 + local14, Static450.anInt7594, Static142.anInt3212);
			Static15.method463(arg5, local46, local55, local73);
			Static15.method463(arg0, local46, local73, local82);
			Static15.method463(arg5, local46, local82, local64);
		}
		while (local20 > local10) {
			local30 += 2;
			local32 += 2;
			local28 += local32;
			local23 += local30;
			if (local28 >= 0 && local25 >= 1) {
				local25--;
				Static246.anIntArray202[local25] = local10;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(261) int local261;
			@Pc(270) int local270;
			@Pc(281) int[] local281;
			@Pc(150) int local150;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				local150 = arg4 - local20;
				local55 = local20 + arg4;
				if (local55 >= Static161.anInt3448 && local150 <= Static163.anInt3488) {
					if (local14 <= local20) {
						local64 = Static439.method5863(local10 + arg3, Static450.anInt7594, Static142.anInt3212);
						local73 = Static439.method5863(arg3 - local10, Static450.anInt7594, Static142.anInt3212);
						if (Static163.anInt3488 >= local55) {
							Static15.method463(arg5, Static376.anIntArrayArray64[local55], local73, local64);
						}
						if (local150 >= Static161.anInt3448) {
							Static15.method463(arg5, Static376.anIntArrayArray64[local150], local73, local64);
						}
					} else {
						local64 = Static246.anIntArray202[local20];
						local73 = Static439.method5863(local10 + arg3, Static450.anInt7594, Static142.anInt3212);
						local82 = Static439.method5863(arg3 - local10, Static450.anInt7594, Static142.anInt3212);
						local261 = Static439.method5863(local64 + arg3, Static450.anInt7594, Static142.anInt3212);
						local270 = Static439.method5863(arg3 - local64, Static450.anInt7594, Static142.anInt3212);
						if (Static163.anInt3488 >= local55) {
							local281 = Static376.anIntArrayArray64[local55];
							Static15.method463(arg5, local281, local82, local270);
							Static15.method463(arg0, local281, local270, local261);
							Static15.method463(arg5, local281, local261, local73);
						}
						if (Static161.anInt3448 <= local150) {
							local281 = Static376.anIntArrayArray64[local150];
							Static15.method463(arg5, local281, local82, local270);
							Static15.method463(arg0, local281, local270, local261);
							Static15.method463(arg5, local281, local261, local73);
						}
					}
				}
			}
			local150 = arg4 - local10;
			local55 = local10 + arg4;
			if (Static161.anInt3448 <= local55 && Static163.anInt3488 >= local150) {
				local64 = local20 + arg3;
				local73 = arg3 - local20;
				if (Static142.anInt3212 <= local64 && local73 <= Static450.anInt7594) {
					local64 = Static439.method5863(local64, Static450.anInt7594, Static142.anInt3212);
					local73 = Static439.method5863(local73, Static450.anInt7594, Static142.anInt3212);
					if (local10 < local14) {
						local82 = local25 >= local10 ? local25 : Static246.anIntArray202[local10];
						local261 = Static439.method5863(arg3 + local82, Static450.anInt7594, Static142.anInt3212);
						local270 = Static439.method5863(arg3 - local82, Static450.anInt7594, Static142.anInt3212);
						if (local55 <= Static163.anInt3488) {
							local281 = Static376.anIntArrayArray64[local55];
							Static15.method463(arg5, local281, local73, local270);
							Static15.method463(arg0, local281, local270, local261);
							Static15.method463(arg5, local281, local261, local64);
						}
						if (local150 >= Static161.anInt3448) {
							local281 = Static376.anIntArrayArray64[local150];
							Static15.method463(arg5, local281, local73, local270);
							Static15.method463(arg0, local281, local270, local261);
							Static15.method463(arg5, local281, local261, local64);
						}
					} else {
						if (local55 <= Static163.anInt3488) {
							Static15.method463(arg5, Static376.anIntArrayArray64[local55], local73, local64);
						}
						if (Static161.anInt3448 <= local150) {
							Static15.method463(arg5, Static376.anIntArrayArray64[local150], local73, local64);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[Ljava/lang/String;ZI)Ljava/lang/String;")
	public static String method4035(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(16) String local16 = arg1[arg2];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(27) int local27 = arg2 + arg0;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = arg2; local31 < local27; local31++) {
				@Pc(36) String local36 = arg1[local31];
				if (local36 == null) {
					local29 += 4;
				} else {
					local29 += local36.length();
				}
			}
			@Pc(63) StringBuffer local63 = new StringBuffer(local29);
			for (@Pc(65) int local65 = arg2; local65 < local27; local65++) {
				@Pc(70) String local70 = arg1[local65];
				if (local70 == null) {
					local63.append("null");
				} else {
					local63.append(local70);
				}
			}
			return local63.toString();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	public static void method4036() {
		@Pc(5) int local5 = Static207.anInt4136;
		@Pc(7) int[] local7 = Static322.anIntArray436;
		for (@Pc(13) int local13 = 0; local13 < local5; local13++) {
			@Pc(20) Class1_Sub3_Sub3_Sub1 local20 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local7[local13]];
			if (local20 != null) {
				Static345.method4952(local20.method4831(), local20);
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)B")
	public static byte method4037(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
