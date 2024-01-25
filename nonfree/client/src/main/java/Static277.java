import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
	public static int anInt4720;

	@OriginalMember(owner = "client!jfa", name = "i", descriptor = "[Lclient!bea;")
	public static final Class3_Sub5_Sub3[] aClass3_Sub5_Sub3Array5 = new Class3_Sub5_Sub3[14];

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Z")
	public static boolean method4053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZB)V")
	public static void method4054(@OriginalArg(0) boolean arg0) {
		Static70.aClass17_1.method6233(Static565.aClass95_13.method7992());
		@Pc(10) int[] local10 = Static565.aClass95_13.Y();
		Static62.anInt1290 = local10[0];
		Static461.anInt10709 = local10[2];
		Static28.anInt699 = local10[1];
		Static679.anInt10958 = local10[3];
		if (arg0) {
			Static565.aClass95_13.DA(Static75.anInt1479, Static159.anInt2971, Static376.anInt5866, Static156.anInt2884);
			Static596.method5959(Static518.aDouble20);
		} else {
			Static565.aClass95_13.DA(Static657.anInt10717, anInt4720, Static24.anInt593, Static150.anInt2796);
			Static596.method5959(Static267.aDouble15);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IB)V")
	public static void method4055(@OriginalArg(0) int arg0) {
		if (!Static185.method2900(arg0)) {
			return;
		}
		@Pc(22) Class265[] local22 = Static270.aClass265ArrayArray2[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class265 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt7041 = 0;
				local30.anInt7022 = 1;
				local30.anInt6979 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIIIZI)V")
	public static void method4060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 != 8 && arg4 != 16) {
			@Pc(17) Class368 local17 = Static254.aClass368ArrayArrayArray2[arg5][arg2][arg3];
			if (local17 == null) {
				local17 = new Class368(arg5);
			}
			if (arg4 == 1) {
				local17.aShort110 = (short) arg0;
				local17.aShort112 = (short) arg1;
			} else if (arg4 == 2) {
				local17.aShort109 = (short) arg0;
				local17.aShort111 = (short) arg1;
			}
			if (Static454.aBoolean523) {
				Static70.method1231();
			}
			return;
		}
		@Pc(65) int local65;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(88) int local88;
		@Pc(98) int local98;
		if (arg4 != 8) {
			local65 = (arg2 << Static571.anInt9216) + Static599.anInt7773;
			local70 = local65 - Static599.anInt7773;
			local74 = arg3 << Static571.anInt9216;
			local78 = Static599.anInt7773 + local74;
			local88 = Static556.aClass35Array2[arg5].method7461(arg3, arg2 + 1);
			local98 = Static556.aClass35Array2[arg5].method7461(arg3 + 1, arg2);
			Static621.aClass272Array40[Static667.anInt10815++] = new Class272(arg4, arg5, local65, local70, local70, local65, local88, local98, local98 - arg1, -arg1 + local88, local74, local78, local78, local74);
			return;
		}
		local65 = arg2 << Static571.anInt9216;
		local70 = local65 + Static599.anInt7773;
		local74 = arg3 << Static571.anInt9216;
		local78 = Static599.anInt7773 + local74;
		local88 = Static556.aClass35Array2[arg5].method7461(arg3, arg2);
		local98 = Static556.aClass35Array2[arg5].method7461(arg3 + 1, arg2 - -1);
		Static621.aClass272Array40[Static667.anInt10815++] = new Class272(arg4, arg5, local65, local70, local70, local65, local88, local98, local98 - arg1, local88 - arg1, local74, local78, local78, local74);
	}
}
