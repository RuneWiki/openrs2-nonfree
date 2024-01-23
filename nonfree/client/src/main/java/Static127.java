import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!io", name = "D", descriptor = "Lclient!fh;")
	public static Class58 aClass58_57;

	@OriginalMember(owner = "client!io", name = "E", descriptor = "I")
	public static int anInt2496;

	@OriginalMember(owner = "client!io", name = "F", descriptor = "I")
	public static int anInt2497;

	@OriginalMember(owner = "client!io", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString142 = "slide:";

	@OriginalMember(owner = "client!io", name = "B", descriptor = "Lclient!cc;")
	public static Class26 aClass26_24 = new Class26(64);

	@OriginalMember(owner = "client!io", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!io", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString144 = "slide:";

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
	public static void method1950() {
		@Pc(9) Container local9;
		if (Static122.aFrame1 != null) {
			local9 = Static122.aFrame1;
		} else if (Static172.aFrame2 == null) {
			local9 = Static276.aClass139_4.anApplet1;
		} else {
			local9 = Static172.aFrame2;
		}
		Static73.anInt1635 = local9.getSize().width;
		Static228.anInt4381 = local9.getSize().height;
		@Pc(35) Insets local35;
		if (local9 == Static172.aFrame2) {
			local35 = Static172.aFrame2.getInsets();
			Static73.anInt1635 -= local35.left + local35.right;
			Static228.anInt4381 -= local35.bottom + local35.top;
		}
		if (Static35.method557() >= 2) {
			Static300.anInt5626 = 0;
			Static31.anInt526 = Static73.anInt1635;
			Static255.anInt4860 = 0;
			Static40.anInt690 = Static228.anInt4381;
		} else {
			Static31.anInt526 = 765;
			Static40.anInt690 = 503;
			Static255.anInt4860 = (Static73.anInt1635 - 765) / 2;
			Static300.anInt5626 = 0;
		}
		if (Static94.aBoolean138) {
			Static94.method1587(Static31.anInt526, Static40.anInt690);
		}
		Static188.aCanvas115.setSize(Static31.anInt526, Static40.anInt690);
		if (local9 == Static172.aFrame2) {
			local35 = Static172.aFrame2.getInsets();
			Static188.aCanvas115.setLocation(local35.left + Static255.anInt4860, Static300.anInt5626 + local35.top);
		} else {
			Static188.aCanvas115.setLocation(Static255.anInt4860, Static300.anInt5626);
		}
		if (Static107.anInt5399 != -1) {
			Static50.method777(true);
		}
		Static211.method3443();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!vc;IIIII)V")
	public static void method1952(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static224.anInt4310) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static300.anInt5636) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static299.anInt5591 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class4_Sub19 local71 = Static6.aClass4_Sub19ArrayArrayArray1[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static243.anIntArrayArrayArray13[local17][local28][local39] + Static243.anIntArrayArrayArray13[local17][local28 + 1][local39] + Static243.anIntArrayArrayArray13[local17][local28][local39 + 1] + Static243.anIntArrayArrayArray13[local17][local28 + 1][local39 + 1]) / 4 - (Static243.anIntArrayArrayArray13[arg1][arg2][arg3] + Static243.anIntArrayArrayArray13[arg1][arg2 + 1][arg3] + Static243.anIntArrayArrayArray13[arg1][arg2][arg3 + 1] + Static243.anIntArrayArrayArray13[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class182 local161 = local71.aClass182_1;
									if (local161 != null) {
										if (local161.aClass53_5.method3845()) {
											arg0.method3844(local161.aClass53_5, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass53_4 != null && local161.aClass53_4.method3845()) {
											arg0.method3844(local161.aClass53_4, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt3554; local232++) {
										@Pc(241) Class33 local241 = local71.aClass33Array3[local232];
										if (local241 != null && local241.aClass53_1.method3845() && (local28 == local241.anInt824 || local28 == local3) && (local39 == local241.anInt826 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt825 + 1 - local241.anInt824;
											@Pc(278) int local278 = local241.anInt817 + 1 - local241.anInt826;
											arg0.method3844(local241.aClass53_1, (local241.anInt824 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt826 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIZI)I")
	public static int method1953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg0;
		} else {
			@Pc(19) int local19 = 128 - arg2;
			@Pc(37) int local37 = arg2 * (arg1 >>> 7 & 0x1FE01FE) + (arg0 >>> 7 & 0x1FE01FE) * local19 & 0xFF00FF00;
			@Pc(51) int local51 = arg2 * (arg1 & 0xFF00FF) + (arg0 & 0xFF00FF) * local19 & 0xFF00FF00;
			return local37 + (local51 >> 7);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BII)I")
	public static int method1954(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(37) int local37 = Static22.method303(arg1 - 1, arg0 - 1) + Static22.method303(arg1 + 1, arg0 - 1) + Static22.method303(arg1 - 1, arg0 + 1) + Static22.method303(arg1 + 1, arg0 + 1);
		@Pc(71) int local71 = Static22.method303(arg1 - 1, arg0) + Static22.method303(arg1 + 1, arg0) + Static22.method303(arg1, arg0 - 1) + Static22.method303(arg1, arg0 + 1);
		@Pc(80) int local80 = Static22.method303(arg1, arg0);
		return local37 / 16 + local71 / 8 + local80 / 4;
	}
}
