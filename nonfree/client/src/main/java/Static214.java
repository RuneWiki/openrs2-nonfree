import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "Lclient!ah;")
	public static Class6 aClass6_16;

	@OriginalMember(owner = "client!wa", name = "nb", descriptor = "Lclient!ai;")
	public static Class7 aClass7_40;

	@OriginalMember(owner = "client!wa", name = "ob", descriptor = "I")
	public static int anInt4570;

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "[I")
	public static int[] anIntArray615 = new int[4096];

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1568 = Static200.method3116(":duelstake:");

	@OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
	public static int anInt4567 = 0;

	@OriginalMember(owner = "client!wa", name = "ub", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1571 = Static200.method3116("level)2");

	@OriginalMember(owner = "client!wa", name = "jb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1569 = aClass60_1571;

	@OriginalMember(owner = "client!wa", name = "kb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1570 = Static200.method3116(":tradereq:");

	@OriginalMember(owner = "client!wa", name = "qb", descriptor = "I")
	public static int anInt4572 = 0;

	@OriginalMember(owner = "client!wa", name = "vb", descriptor = "I")
	public static int anInt4575 = -1;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(III)V")
	public static void method3355() {
		for (@Pc(1) int local1 = 0; local1 < Static55.anInt1475; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static83.anInt1959; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static150.anInt3350; local7++) {
					@Pc(16) Class1_Sub22 local16 = Static100.aClass1_Sub22ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class47 local21 = local16.aClass47_1;
						if (local21 != null && local21.aClass9_4.method2896()) {
							Static66.method1181(local21.aClass9_4, local1, local4, local7, 1, 1);
							if (local21.aClass9_5 != null && local21.aClass9_5.method2896()) {
								Static66.method1181(local21.aClass9_5, local1, local4, local7, 1, 1);
								local21.aClass9_4.method2900(local21.aClass9_5, 0, 0, 0, false);
								local21.aClass9_5 = local21.aClass9_5.method2898();
							}
							local21.aClass9_4 = local21.aClass9_4.method2898();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt3358; local77++) {
							@Pc(83) Class29 local83 = local16.aClass29Array3[local77];
							if (local83 != null && local83.aClass9_3.method2896()) {
								Static66.method1181(local83.aClass9_3, local1, local4, local7, local83.anInt1430 + 1 - local83.anInt1437, local83.anInt1431 - local83.anInt1423 + 1);
								local83.aClass9_3 = local83.aClass9_3.method2898();
							}
						}
						@Pc(125) Class16 local125 = local16.aClass16_1;
						if (local125 != null && local125.aClass9_2.method2896()) {
							Static67.method1208(local125.aClass9_2, local1, local4, local7);
							local125.aClass9_2 = local125.aClass9_2.method2898();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIILclient!dd;IJ)Z")
	public static boolean method3356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class9 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static152.method2597(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method3357(@OriginalArg(0) Component arg0) {
		@Pc(5) Method local5 = Static119.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		arg0.addKeyListener(Static85.aClass42_1);
		arg0.addFocusListener(Static85.aClass42_1);
	}
}
