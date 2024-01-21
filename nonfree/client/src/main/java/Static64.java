import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "Lclient!sa;")
	public static Class3_Sub3_Sub2_Sub3 aClass3_Sub3_Sub2_Sub3_2;

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_633 = Static193.method3027("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!gb", name = "kb", descriptor = "I")
	public static int anInt1359 = 0;

	@OriginalMember(owner = "client!gb", name = "mb", descriptor = "I")
	public static int anInt1360 = -1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZI)Lclient!b;")
	public static Class6 method982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class6 local7 = Static146.method2127(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass6Array1 == null || arg0 >= local7.aClass6Array1.length) {
			return null;
		} else {
			return local7.aClass6Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ke;ILclient!ke;Lclient!ke;Lclient!ke;)V")
	public static void method984(@OriginalArg(0) Class52 arg0, @OriginalArg(2) Class52 arg1, @OriginalArg(3) Class52 arg2, @OriginalArg(4) Class52 arg3) {
		Static185.aClass52_37 = arg0;
		Static122.aClass52_28 = arg1;
		Static97.aClass52_21 = arg2;
		Static106.aClass52_22 = arg3;
		Static49.aClass6ArrayArray1 = new Class6[Static97.aClass52_21.method1550()][];
		Static101.aBooleanArray9 = new boolean[Static97.aClass52_21.method1550()];
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
	public static void method986() {
		@Pc(8) int[] local8 = new int[Static178.anInt3620];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static178.anInt3620; local12++) {
			@Pc(18) Class3_Sub3_Sub11 local18 = Static14.method275(local12);
			if (local18.anInt1228 >= 0 || local18.anInt1259 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static15.anIntArray25 = new int[local10];
		for (@Pc(48) int local48 = 0; local48 < local10; local48++) {
			Static15.anIntArray25[local48] = local8[local48];
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIILclient!wa;)Lclient!wa;")
	public static Class26_Sub6 method988(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class26_Sub6 arg5) {
		@Pc(8) long local8 = (long) arg1;
		@Pc(14) Class26_Sub6 local14 = (Class26_Sub6) Static176.aClass94_9.method3153(local8);
		if (local14 == null) {
			@Pc(21) Class26_Sub5 local21 = Static128.method1788(Static78.aClass52_Sub1_12, arg1);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method1798(64, 768, -50, -10, -50);
			Static176.aClass94_9.method3154(local8, local14);
		}
		@Pc(41) int local41 = arg5.method2530();
		@Pc(53) int local53 = arg5.method2533();
		@Pc(56) int local56 = arg5.method2537();
		@Pc(59) int local59 = arg5.method2535();
		local14 = local14.method2524(true);
		if (arg2 != 0) {
			local14.method2529(arg2);
		}
		@Pc(74) Class26_Sub6_Sub1 local74 = (Class26_Sub6_Sub1) local14;
		if (arg4 != Static107.method2399(local56 + arg0, arg3 - -local41, Static137.anInt2795) || Static107.method2399(local59 + arg0, local53 + arg3, Static137.anInt2795) != arg4) {
			for (@Pc(99) int local99 = 0; local99 < local74.anInt3422; local99++) {
				local74.anIntArray266[local99] += Static107.method2399(arg0 + local74.anIntArray258[local99], local74.anIntArray261[local99] + arg3, Static137.anInt2795) - arg4;
			}
			local74.aBoolean155 = false;
		}
		return local14;
	}
}
