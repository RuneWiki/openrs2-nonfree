import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
	public static int anInt1582;

	@OriginalMember(owner = "client!dq", name = "P", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "client!dq", name = "R", descriptor = "Lclient!wm;")
	public static Class19 aClass19_3;

	@OriginalMember(owner = "client!dq", name = "Z", descriptor = "I")
	public static int anInt1591;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)I", line = 5)
	public static int method1734(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII)Z", line = 29)
	public static boolean method1736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static34.method1106(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static299.anInt6017;
			@Pc(14) int local14 = arg2 << Static299.anInt6017;
			return Static43.method1425(local10 + 1, Static340.aClass6Array4[arg0].method5720(arg1, arg2) + arg3, local14 + 1) && Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707 - 1, Static340.aClass6Array4[arg0].method5720(arg1 + 1, arg2) + arg3, local14 + 1) && Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707 - 1, Static340.aClass6Array4[arg0].method5720(arg1 + 1, arg2 + 1) + arg3, local14 + Class11_Sub5_Sub3.anInt4707 - 1) && Static43.method1425(local10 + 1, Static340.aClass6Array4[arg0].method5720(arg1, arg2 + 1) + arg3, local14 + Class11_Sub5_Sub3.anInt4707 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILclient!nk;I)V", line = 44)
	public static void method1737(@OriginalArg(0) int arg0, @OriginalArg(2) Class161 arg1, @OriginalArg(3) int arg2) {
		Class2_Sub3_Sub17.aClass161_5 = arg1;
		Class92.anInt2457 = arg0;
		Class2_Sub2_Sub14.anInt5452 = arg2;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(IIII)V", line = 77)
	public static void method1738(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			Static85.method1962(Class2_Sub26_Sub1.aClass145_158);
		}
		if (arg2 == 1) {
			Static85.method1962(Class209.aClass145_203);
		}
		Class14.aClass2_Sub4_Sub2_4.method4828(Static163.aClass123_2.method3344(82) ? 1 : 0);
		Class14.aClass2_Sub4_Sub2_4.method4844(arg0 + Static154.anInt3136);
		Class14.aClass2_Sub4_Sub2_4.method4831(arg1 + Static139.anInt2716);
		Class2_Sub3_Sub38.aBoolean474 = false;
		Class130.anInt6538 = arg0;
		Class2_Sub3_Sub31.anInt5832 = arg1;
		Static334.method6010();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!bu;I[[B)V", line = 186)
	public static void method1739(@OriginalArg(0) Class29_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt911; local3++) {
			Static36.method1135();
			for (@Pc(9) int local9 = 0; local9 < Class241.anInt7020 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < OutputStream_Sub1.anInt4442 >> 3; local13++) {
					@Pc(23) int local23 = Static287.anIntArrayArrayArray12[local3][local9][local13];
					if (local23 != -1) {
						@Pc(32) int local32 = local23 >> 24 & 0x3;
						if (!arg0.aBoolean73 || local32 == 0) {
							@Pc(43) int local43 = local23 >> 1 & 0x3;
							@Pc(49) int local49 = local23 >> 14 & 0x3FF;
							@Pc(55) int local55 = local23 >> 3 & 0x7FF;
							@Pc(65) int local65 = (local49 / 8 << 8) + local55 / 8;
							for (@Pc(67) int local67 = 0; local67 < Static268.anIntArray372.length; local67++) {
								if (Static268.anIntArray372[local67] == local65 && arg1[local67] != null) {
									arg0.method1107(local43, local32, local3, (local49 & 0x7) * 8, arg1[local67], local9 * 8, Static177.aClass19_8, Class2_Sub3_Sub18.aClass46Array1, local13 * 8, (local55 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Lclient!as;", line = 263)
	public static Class5 method1740() {
		try {
			return new Class5_Sub1();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class5) Class.forName("Class5_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class5_Sub2();
			}
		}
	}
}
