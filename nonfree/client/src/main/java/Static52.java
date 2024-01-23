import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "[I")
	public static int[] anIntArray148;

	@OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
	public static int anInt1406;

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
	public static int anInt1407;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "[I")
	public static int[] anIntArray147 = new int[500];

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
	public static int anInt1393 = 0;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
	public static int anInt1401 = 0;

	@OriginalMember(owner = "client!dm", name = "y", descriptor = "Z")
	public static volatile boolean aBoolean83 = true;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method1061(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static37.aString39 = arg1;
		Static234.aString162 = arg0;
		Static126.anInt2810 = arg2;
		if (Static37.aString39.equals("") || Static234.aString162.equals("")) {
			Static275.anInt5910 = 3;
		} else if (Static113.anInt2454 == -1) {
			Static63.anInt1592 = 1;
			Static275.anInt5923 = 0;
			Static188.anInt4193 = 0;
			Static275.anInt5910 = -3;
			@Pc(45) Class1_Sub16 local45 = new Class1_Sub16(128);
			local45.method2621(10);
			local45.method2606((int) (Math.random() * 9.9999999E7D));
			local45.method2631(Static94.method4774(Static37.aString39));
			local45.method2606((int) (Math.random() * 9.9999999E7D));
			local45.method2630(Static234.aString162);
			local45.method2606((int) (Math.random() * 9.9999999E7D));
			local45.method2604(Static270.aBigInteger2, Static135.aBigInteger1);
			Static81.aClass1_Sub16_Sub1_1.anInt3328 = 0;
			Static81.aClass1_Sub16_Sub1_1.method2621(24);
			Static81.aClass1_Sub16_Sub1_1.method2621(local45.anInt3328 + 2);
			Static81.aClass1_Sub16_Sub1_1.method2624(545);
			Static81.aClass1_Sub16_Sub1_1.method2623(local45.anInt3328, local45.aByteArray39);
		} else {
			Static220.method3908();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(JI)V")
	public static void method1064(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static180.anInt4068 >= 100 && !Static97.aBoolean323 || Static180.anInt4068 >= 200) {
			Static89.method1540(0, "", Static173.aString113);
			return;
		}
		@Pc(30) String local30 = Static173.method3185(arg0);
		@Pc(32) int local32;
		for (local32 = 0; local32 < Static180.anInt4068; local32++) {
			if (Static286.aLongArray11[local32] == arg0) {
				Static89.method1540(0, "", local30 + Static134.aString83);
				return;
			}
		}
		for (local32 = 0; local32 < Static253.anInt5514; local32++) {
			if (Static3.aLongArray1[local32] == arg0) {
				Static89.method1540(0, "", Static174.aString114 + local30 + Static141.aString93);
				return;
			}
		}
		if (local30.equals(Static239.aClass25_Sub1_Sub1_2.aString26)) {
			Static89.method1540(0, "", Static282.aString194);
			return;
		}
		Static78.aStringArray6[Static180.anInt4068] = local30;
		Static286.aLongArray11[Static180.anInt4068] = arg0;
		Static233.anIntArray532[Static180.anInt4068] = 0;
		Static84.aStringArray8[Static180.anInt4068] = "";
		Static78.anIntArray197[Static180.anInt4068] = 0;
		Static225.aBooleanArray21[Static180.anInt4068] = false;
		Static254.anInt5408 = Static27.anInt754;
		Static180.anInt4068++;
		Static81.aClass1_Sub16_Sub1_1.method2676(94);
		Static81.aClass1_Sub16_Sub1_1.method2631(arg0);
	}
}
