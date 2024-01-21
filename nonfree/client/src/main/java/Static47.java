import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
	public static int[] anIntArray152;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Lclient!rb;")
	public static Class71 aClass71_1 = new Class71();

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
	public static int anInt1255 = 0;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!ed;")
	public static Class23 aClass23_482 = Static169.method2903("http:)4)4");

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Lclient!ed;")
	private static Class23 aClass23_485 = Static169.method2903("Loading)3)3)3");

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_483 = aClass23_485;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Lclient!n;")
	public static Class56 aClass56_4 = new Class56();

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "Lclient!ed;")
	public static Class23 aClass23_484 = Static169.method2903("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!ed;")
	public static Class23 aClass23_486 = Static169.method2903("Weiter");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)J")
	public static synchronized long method763() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static156.aLong119) {
			Static165.aLong129 += Static156.aLong119 - local5;
		}
		Static156.aLong119 = local5;
		return Static165.aLong129 + local5;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static49.method916(arg6)) {
			Static123.aClass60Array2 = null;
			Static42.method711(arg7, arg2, Static9.aClass60ArrayArray1[arg6], arg0, arg1, arg5, arg3, -1, arg4);
			if (Static123.aClass60Array2 != null) {
				Static42.method711(arg7, arg2, Static123.aClass60Array2, Static86.anInt2305, Static66.anInt1747, arg5, arg3, -1412584499, arg4);
				Static123.aClass60Array2 = null;
			}
		} else if (arg7 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static98.aBooleanArray12[local19] = true;
			}
		} else {
			Static98.aBooleanArray12[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method765() {
		aClass71_1 = null;
		aClass23_484 = null;
		aClass23_486 = null;
		aClass23_483 = null;
		aClass23_482 = null;
		aClass56_4 = null;
		anIntArray152 = null;
		aClass23_485 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!rf;Ljava/lang/Object;)V")
	public static void method766(@OriginalArg(1) Class74 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg0.anEventQueue1.peekEvent() != null; local19++) {
			Static35.method583(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!na;)V")
	public static void method767(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		arg0.aBoolean93 = false;
		@Pc(22) Class1_Sub1_Sub18 local22;
		if (arg0.anInt1835 != -1) {
			local22 = Static157.method2652(arg0.anInt1835);
			if (local22 == null || local22.anIntArray602 == null) {
				arg0.anInt1835 = -1;
			} else {
				arg0.anInt1808++;
				if (local22.anIntArray602.length > arg0.anInt1837 && local22.anIntArray601[arg0.anInt1837] < arg0.anInt1808) {
					arg0.anInt1837++;
					arg0.anInt1808 = 1;
					Static73.method1337(arg0 == Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103, local22, arg0.anInt1837, arg0.anInt1838, arg0.anInt1825);
				}
				if (arg0.anInt1837 >= local22.anIntArray602.length) {
					arg0.anInt1808 = 0;
					arg0.anInt1837 = 0;
					Static73.method1337(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103 == arg0, local22, arg0.anInt1837, arg0.anInt1838, arg0.anInt1825);
				}
			}
		}
		if (arg0.anInt1853 != -1 && arg0.anInt1836 <= Static26.anInt845) {
			if (arg0.anInt1822 < 0) {
				arg0.anInt1822 = 0;
			}
			@Pc(135) int local135 = Static13.method251(arg0.anInt1853).anInt4142;
			if (local135 == -1) {
				arg0.anInt1853 = -1;
			} else {
				@Pc(148) Class1_Sub1_Sub18 local148 = Static157.method2652(local135);
				if (local148 == null || local148.anIntArray602 == null) {
					arg0.anInt1853 = -1;
				} else {
					arg0.anInt1821++;
					if (arg0.anInt1822 < local148.anIntArray602.length && local148.anIntArray601[arg0.anInt1822] < arg0.anInt1821) {
						arg0.anInt1822++;
						arg0.anInt1821 = 1;
						Static73.method1337(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103 == arg0, local148, arg0.anInt1822, arg0.anInt1838, arg0.anInt1825);
					}
					if (arg0.anInt1822 >= local148.anIntArray602.length) {
						arg0.anInt1853 = -1;
					}
				}
			}
		}
		if (arg0.anInt1842 != -1 && arg0.anInt1846 <= 1) {
			local22 = Static157.method2652(arg0.anInt1842);
			if (local22.anInt4303 == 1 && arg0.anInt1839 > 0 && arg0.anInt1854 <= Static26.anInt845 && arg0.anInt1828 < Static26.anInt845) {
				arg0.anInt1846 = 1;
				return;
			}
		}
		if (arg0.anInt1842 != -1 && arg0.anInt1846 == 0) {
			local22 = Static157.method2652(arg0.anInt1842);
			if (local22 == null || local22.anIntArray602 == null) {
				arg0.anInt1842 = -1;
			} else {
				arg0.anInt1862++;
				if (local22.anIntArray602.length > arg0.anInt1849 && arg0.anInt1862 > local22.anIntArray601[arg0.anInt1849]) {
					arg0.anInt1849++;
					arg0.anInt1862 = 1;
					Static73.method1337(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103 == arg0, local22, arg0.anInt1849, arg0.anInt1838, arg0.anInt1825);
				}
				if (local22.anIntArray602.length <= arg0.anInt1849) {
					arg0.anInt1812++;
					arg0.anInt1849 -= local22.anInt4304;
					if (local22.anInt4296 <= arg0.anInt1812) {
						arg0.anInt1842 = -1;
					} else if (arg0.anInt1849 >= 0 && arg0.anInt1849 < local22.anIntArray602.length) {
						Static73.method1337(arg0 == Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103, local22, arg0.anInt1849, arg0.anInt1838, arg0.anInt1825);
					} else {
						arg0.anInt1842 = -1;
					}
				}
				arg0.aBoolean93 = local22.aBoolean214;
			}
		}
		if (arg0.anInt1846 > 0) {
			arg0.anInt1846--;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ig;IIBBIZ)V")
	public static void method768(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) long local6 = (long) (arg1 + (arg2 << 16));
		@Pc(21) Class1_Sub1_Sub14 local21 = (Class1_Sub1_Sub14) Static45.aClass10_2.method256(local6);
		if (local21 != null) {
			return;
		}
		local21 = (Class1_Sub1_Sub14) Static182.aClass10_13.method256(local6);
		if (local21 != null) {
			return;
		}
		local21 = (Class1_Sub1_Sub14) Static113.aClass10_9.method256(local6);
		if (local21 == null) {
			if (!arg5) {
				local21 = (Class1_Sub1_Sub14) Static123.aClass10_10.method256(local6);
				if (local21 != null) {
					return;
				}
			}
			local21 = new Class1_Sub1_Sub14();
			local21.aByte6 = arg3;
			local21.aClass30_Sub1_12 = arg0;
			local21.anInt3381 = arg4;
			if (arg5) {
				Static45.aClass10_2.method263(local21, local6);
				Static163.anInt4013++;
			} else {
				Static149.aClass53_1.method1713(local21);
				Static113.aClass10_9.method263(local21, local6);
				Static36.anInt984++;
			}
		} else if (arg5) {
			local21.method3149();
			Static45.aClass10_2.method263(local21, local6);
			Static163.anInt4013++;
			Static36.anInt984--;
		}
	}
}
