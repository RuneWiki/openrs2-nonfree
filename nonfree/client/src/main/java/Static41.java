import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "Lclient!ak;")
	public static Class7 aClass7_41;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "J")
	public static volatile long aLong34 = 0L;

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method751(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static179.aClass112_1);
		arg0.removeMouseMotionListener(Static179.aClass112_1);
		arg0.removeFocusListener(Static179.aClass112_1);
		Static155.anInt2871 = 0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZIIII)V")
	public static void method753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg2) {
			Static250.method3904(arg4, arg3, arg0, arg1);
		} else if (arg0 - arg4 >= Static245.anInt1237 && Static28.anInt606 >= arg4 + arg0 && arg3 - arg2 >= Static24.anInt556 && arg3 + arg2 <= Static284.anInt5643) {
			Static30.method502(arg1, arg0, arg4, arg3, arg2);
		} else {
			Static169.method2558(arg1, arg0, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!qm;IIB)V")
	public static void method754(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub6_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == Static28.aClass6_Sub6_Sub2_1 || Static29.anInt626 >= 400) {
			return;
		}
		@Pc(146) String local146;
		if (arg1.anInt4585 == 0) {
			@Pc(29) boolean local29 = true;
			if (Static28.aClass6_Sub6_Sub2_1.anInt4592 != -1 && arg1.anInt4592 != -1) {
				@Pc(56) int local56 = Static28.aClass6_Sub6_Sub2_1.anInt4593 <= arg1.anInt4593 ? arg1.anInt4593 : Static28.aClass6_Sub6_Sub2_1.anInt4593;
				@Pc(71) int local71 = arg1.anInt4592 > Static28.aClass6_Sub6_Sub2_1.anInt4592 ? Static28.aClass6_Sub6_Sub2_1.anInt4592 : arg1.anInt4592;
				@Pc(78) int local78 = Static28.aClass6_Sub6_Sub2_1.anInt4593 - arg1.anInt4593;
				@Pc(89) int local89 = local71 + local56 * 10 / 100 + 5;
				if (local78 < 0) {
					local78 = -local78;
				}
				if (local89 < local78) {
					local29 = false;
				}
			}
			@Pc(112) String local112 = Static107.anInt1994 == 1 ? Static152.aString98 : Static89.aString49;
			if (arg1.anInt4593 >= arg1.anInt4595) {
				local146 = arg1.method3517() + (local29 ? Static146.method2280(arg1.anInt4593, Static28.aClass6_Sub6_Sub2_1.anInt4593) : "<col=ffffff>") + " (" + local112 + arg1.anInt4593 + ")";
			} else {
				local146 = arg1.method3517() + (local29 ? Static146.method2280(arg1.anInt4593, Static28.aClass6_Sub6_Sub2_1.anInt4593) : "<col=ffffff>") + " (" + local112 + arg1.anInt4593 + "+" + (arg1.anInt4595 - arg1.anInt4593) + ")";
			}
		} else {
			local146 = arg1.method3517() + " (" + Static102.aString60 + arg1.anInt4585 + ")";
		}
		@Pc(240) int local240;
		if (Static282.anInt5856 == 1) {
			Static166.method2533(Static149.aString96, arg0, arg2, Static196.aString132 + " -> <col=ffffff>" + local146, (short) 58, Static180.anInt3325, (long) arg3);
		} else if (!Static75.aBoolean115) {
			for (local240 = 7; local240 >= 0; local240--) {
				if (Static90.aStringArray23[local240] != null) {
					@Pc(253) short local253 = 0;
					if (Static107.anInt1994 == 0 && Static90.aStringArray23[local240].equalsIgnoreCase(Static73.aString42)) {
						if (Static28.aClass6_Sub6_Sub2_1.anInt4593 < arg1.anInt4593) {
							local253 = 2000;
						}
						if (Static28.aClass6_Sub6_Sub2_1.anInt4600 != 0 && arg1.anInt4600 != 0) {
							if (Static28.aClass6_Sub6_Sub2_1.anInt4600 == arg1.anInt4600) {
								local253 = 2000;
							} else {
								local253 = 0;
							}
						}
					} else if (Static121.aBooleanArray8[local240]) {
						local253 = 2000;
					}
					@Pc(313) short local313 = Static149.aShortArray68[local240];
					@Pc(318) short local318 = (short) (local313 + local253);
					Static166.method2533(Static90.aStringArray23[local240], arg0, arg2, "<col=ffffff>" + local146, local318, Static203.anIntArray458[local240], (long) arg3);
				}
			}
		} else if ((Static14.anInt367 & 0x8) != 0) {
			Static166.method2533(Static222.aString150, arg0, arg2, Static54.aString32 + " -> <col=ffffff>" + local146, (short) 59, Static162.anInt2993, (long) arg3);
		}
		for (local240 = 0; local240 < Static29.anInt626; local240++) {
			if (Static276.aShortArray92[local240] == 14) {
				Static190.aStringArray19[local240] = "<col=ffffff>" + local146;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public static void method755() {
		@Pc(4) int[] local4 = new int[Static54.anInt1155];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12;
		for (local12 = 0; local12 < Static54.anInt1155; local12++) {
			@Pc(25) Class120 local25 = Static183.method4458(local12);
			if (local25.anInt3296 >= 0 || local25.anInt3269 >= 0) {
				local4[local10++] = local12;
			}
		}
		Static1.anIntArray1 = new int[local10];
		for (local12 = 0; local12 < local10; local12++) {
			Static1.anIntArray1[local12] = local4[local12];
		}
	}
}
