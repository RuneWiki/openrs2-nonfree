import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "Lclient!up;")
	public static Class240 aClass240_8;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array20;

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray127 = new String[100];

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)Lclient!rr;")
	public static Class1_Sub1 method4303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub1_3;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIBIII)V")
	public static void method4304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 > Static163.anInt3488 || arg0 < Static161.anInt3448) {
			return;
		}
		@Pc(24) boolean local24;
		if (Static142.anInt3212 > arg4) {
			local24 = false;
			arg4 = Static142.anInt3212;
		} else if (arg4 > Static450.anInt7594) {
			arg4 = Static450.anInt7594;
			local24 = false;
		} else {
			local24 = true;
		}
		@Pc(55) boolean local55;
		if (arg3 < Static142.anInt3212) {
			arg3 = Static142.anInt3212;
			local55 = false;
		} else if (Static450.anInt7594 >= arg3) {
			local55 = true;
		} else {
			arg3 = Static450.anInt7594;
			local55 = false;
		}
		if (arg2 < Static161.anInt3448) {
			arg2 = Static161.anInt3448;
		} else {
			Static15.method463(arg1, Static376.anIntArrayArray64[arg2++], arg4, arg3);
		}
		if (arg0 > Static163.anInt3488) {
			arg0 = Static163.anInt3488;
		} else {
			Static15.method463(arg1, Static376.anIntArrayArray64[arg0--], arg4, arg3);
		}
		@Pc(111) int local111;
		if (local24 && local55) {
			for (local111 = arg2; local111 <= arg0; local111++) {
				@Pc(153) int[] local153 = Static376.anIntArrayArray64[local111];
				local153[arg4] = local153[arg3] = arg1;
			}
			return;
		}
		if (local24) {
			for (local111 = arg2; local111 <= arg0; local111++) {
				Static376.anIntArrayArray64[local111][arg4] = arg1;
			}
			return;
		}
		if (local55) {
			for (local111 = arg2; local111 <= arg0; local111++) {
				Static376.anIntArrayArray64[local111][arg3] = arg1;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)[Lclient!jd;")
	public static Class119[] method4306() {
		return new Class119[] { Static224.aClass119_12, Static152.aClass119_10, Static4.aClass119_2, Static410.aClass119_20, Static284.aClass119_14, Static36.aClass119_3, Static48.aClass119_4, Static385.aClass119_18, Static321.aClass119_15, Static236.aClass119_13, Static99.aClass119_6, Static386.aClass119_19, Static347.aClass119_16, Static63.aClass119_17 };
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIII)Z")
	public static boolean method4307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static325.aByteArrayArrayArray15[0][arg2][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static325.aByteArrayArrayArray15[arg3][arg2][arg0] & 0x10) == 0) {
			return Static283.method4161(arg3, arg2, arg0) == arg1;
		} else {
			return false;
		}
	}
}
