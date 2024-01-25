import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "Lclient!we;")
	public static Class356 aClass356_1;

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
	public static int anInt7836;

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
	public static int anInt7840;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBLclient!vo;)Lclient!f;")
	public static Class88 method6120(@OriginalArg(0) int arg0, @OriginalArg(2) Class348 arg1) {
		@Pc(18) Class88 local18 = (Class88) Static321.aClass167_30.method3966((long) arg0);
		if (local18 == null) {
			if (Static243.aBoolean357) {
				local18 = Static39.aClass7_2.method7808(Static598.method2449(arg1, arg0), true);
			} else {
				local18 = Static515.method3255(arg1.method7969(arg0));
			}
			Static321.aClass167_30.method3974((long) arg0, local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BIIII)V")
	public static void method6121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		Static238.method3886(Static442.anIntArrayArray48[arg1], arg2 + arg3, arg0, arg3 - arg2);
		@Pc(33) int local33 = -1;
		while (local9 > local7) {
			local33 += 2;
			local12 += local33;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(59) int[] local59 = Static442.anIntArrayArray48[local9 + arg1];
				@Pc(65) int[] local65 = Static442.anIntArrayArray48[arg1 - local9];
				@Pc(70) int local70 = arg3 + local7;
				@Pc(75) int local75 = arg3 - local7;
				Static238.method3886(local59, local70, arg0, local75);
				Static238.method3886(local65, local70, arg0, local75);
			}
			@Pc(92) int local92 = arg3 + local9;
			@Pc(97) int local97 = arg3 - local9;
			@Pc(103) int[] local103 = Static442.anIntArrayArray48[arg1 + local7];
			@Pc(110) int[] local110 = Static442.anIntArrayArray48[arg1 - local7];
			Static238.method3886(local103, local92, arg0, local97);
			Static238.method3886(local110, local92, arg0, local97);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
	public static void method6122(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static571.aClass182ArrayArrayArray3 = Static288.aClass182ArrayArrayArray2;
			Static255.aClass115Array2 = Static140.aClass115Array1;
		} else {
			Static571.aClass182ArrayArrayArray3 = Static175.aClass182ArrayArrayArray1;
			Static255.aClass115Array2 = Static432.aClass115Array3;
		}
		Static218.anInt4559 = Static571.aClass182ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public static void method6123() {
		Static174.aBoolean269 = true;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Z")
	public static boolean method6125(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIBI)Z")
	public static boolean method6127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface21 local9 = (Interface21) Static497.method7181(arg2, arg1, arg0);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static121.method2184(local9) & true;
		}
		local9 = (Interface21) Static36.method1049(arg2, arg1, arg0, sw.class);
		if (local9 != null) {
			local11 &= Static121.method2184(local9);
		}
		local9 = (Interface21) Static570.method8016(arg2, arg1, arg0);
		if (local9 != null) {
			local11 &= Static121.method2184(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Z")
	public static boolean method6128() {
		return Static136.aBoolean226;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static87.method1817(Static289.anInt5872, Static160.anInt3347, arg6);
		@Pc(17) int local17 = Static87.method1817(Static289.anInt5872, Static160.anInt3347, arg3);
		@Pc(23) int local23 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg2);
		@Pc(29) int local29 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg5);
		@Pc(37) int local37 = Static87.method1817(Static289.anInt5872, Static160.anInt3347, arg1 + arg6);
		@Pc(46) int local46 = Static87.method1817(Static289.anInt5872, Static160.anInt3347, arg3 - arg1);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static238.method3886(Static442.anIntArrayArray48[local48], local29, arg0, local23);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static238.method3886(Static442.anIntArrayArray48[local68], local29, arg0, local23);
		}
		@Pc(90) int local90 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg2 + arg1);
		@Pc(99) int local99 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg5 - arg1);
		for (@Pc(101) int local101 = local37; local101 <= local46; local101++) {
			@Pc(115) int[] local115 = Static442.anIntArrayArray48[local101];
			Static238.method3886(local115, local90, arg0, local23);
			Static238.method3886(local115, local99, arg4, local90);
			Static238.method3886(local115, local29, arg0, local99);
		}
	}
}
