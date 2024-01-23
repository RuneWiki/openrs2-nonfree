import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(III)Lclient!kh;")
	public static Class65 method1054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class65 local14 = local7.aClass65_1;
			local7.aClass65_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
	public static void method1055() {
		Static224.aClass53_31.method1496(5);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLclient!mb;Lclient!mb;)V")
	public static void method1056(@OriginalArg(1) Class70 arg0, @OriginalArg(2) Class70 arg1) {
		Static221.aClass70_44 = arg0;
		Static187.aClass70_38 = arg1;
		Static114.anInt2490 = Static187.aClass70_38.method3532(3);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(JI)V")
	public static void method1057(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static113.anInt2474 >= 100) {
			Static164.method2798(0, Static120.aClass51_947, Static81.aClass51_607);
			return;
		}
		@Pc(25) Class51 local25 = Static202.method3323(arg0).method1437();
		for (@Pc(27) int local27 = 0; local27 < Static113.anInt2474; local27++) {
			if (arg0 == Static181.aLongArray11[local27]) {
				Static164.method2798(0, Static150.method2574(new Class51[] { local25, Static189.aClass51_1403 }), Static81.aClass51_607);
				return;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static201.anInt4259; local62++) {
			if (Static20.aLongArray3[local62] == arg0) {
				Static164.method2798(0, Static150.method2574(new Class51[] { Static201.aClass51_1459, local25, Static84.aClass51_620 }), Static81.aClass51_607);
				return;
			}
		}
		if (local25.method1426(Static73.aClass5_Sub1_Sub1_1.aClass51_619)) {
			Static164.method2798(0, Static177.aClass51_1333, Static81.aClass51_607);
			return;
		}
		Static181.aLongArray11[Static113.anInt2474] = arg0;
		Static7.aClass51Array1[Static113.anInt2474++] = Static202.method3323(arg0);
		Static99.anInt2154 = Static27.anInt651;
		Static167.aClass1_Sub16_Sub1_2.method3823(74);
		Static167.aClass1_Sub16_Sub1_2.method3786(arg0);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
	public static void method1058() {
		Static192.aClass53_25.method1498();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLclient!ia;)Z")
	public static boolean method1059(@OriginalArg(1) Class51 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < Static201.anInt4259; local23++) {
			if (arg0.method1401(Static113.aClass51Array15[local23])) {
				return true;
			}
		}
		return arg0.method1401(Static73.aClass5_Sub1_Sub1_1.aClass51_619);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1060(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static130.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static188.aClass22_1);
		arg0.addFocusListener(Static188.aClass22_1);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1061(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = Static28.method525(Static122.anInt2710, arg5, Static225.anInt4729);
		@Pc(25) int local25 = Static28.method525(Static122.anInt2710, arg2, Static225.anInt4729);
		@Pc(31) int local31 = Static28.method525(Static149.anInt3252, arg4, Static160.anInt3454);
		@Pc(37) int local37 = Static28.method525(Static149.anInt3252, arg1, Static160.anInt3454);
		@Pc(46) int local46 = Static28.method525(Static122.anInt2710, arg5 + arg0, Static225.anInt4729);
		@Pc(55) int local55 = Static28.method525(Static122.anInt2710, arg2 - arg0, Static225.anInt4729);
		for (@Pc(57) int local57 = local19; local57 < local46; local57++) {
			Static71.method1261(Static113.anIntArrayArray10[local57], local31, arg3, local37);
		}
		for (@Pc(73) int local73 = local25; local73 > local55; local73--) {
			Static71.method1261(Static113.anIntArrayArray10[local73], local31, arg3, local37);
		}
		@Pc(99) int local99 = Static28.method525(Static149.anInt3252, arg4 + arg0, Static160.anInt3454);
		@Pc(108) int local108 = Static28.method525(Static149.anInt3252, arg1 - arg0, Static160.anInt3454);
		for (@Pc(110) int local110 = local46; local110 <= local55; local110++) {
			@Pc(116) int[] local116 = Static113.anIntArrayArray10[local110];
			Static71.method1261(local116, local31, arg3, local99);
			Static71.method1261(local116, local99, arg6, local108);
			Static71.method1261(local116, local108, arg3, local37);
		}
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
	public static void method1062() {
		Static11.aByteArrayArrayArray2 = null;
		Static18.aByteArrayArrayArray4 = null;
		Static220.anIntArray360 = null;
		Static71.anIntArray104 = null;
		Static140.anIntArrayArrayArray6 = null;
		Static229.aByteArrayArrayArray15 = null;
		Static230.anIntArray380 = null;
		Static166.anIntArray243 = null;
		Static15.aByteArrayArrayArray3 = null;
		Static186.anIntArray303 = null;
		Static113.aByteArrayArrayArray8 = null;
	}
}
