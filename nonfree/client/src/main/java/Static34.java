import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
	public static int anInt1162;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
	public static int anInt1163;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_615 = Static80.method1463("backhmid1");

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	public static int anInt1151 = 0;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "Lclient!rd;")
	private static Class63 aClass63_622 = Static80.method1463("Private chat");

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!rd;")
	public static Class63 aClass63_616 = aClass63_622;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "[Lclient!rd;")
	public static Class63[] aClass63Array8 = new Class63[100];

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!rd;")
	public static Class63 aClass63_617 = Static80.method1463("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Lclient!rd;")
	private static Class63 aClass63_621 = Static80.method1463("Please wait)3)3)3");

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Lclient!rd;")
	public static Class63 aClass63_618 = aClass63_621;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Lclient!rd;")
	public static Class63 aClass63_619 = aClass63_621;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Lclient!rd;")
	public static Class63 aClass63_620 = Static80.method1463(":tradereq:");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!cb;IIII)V")
	public static void method843(@OriginalArg(0) Class6_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static18.anInt569 >= 400) {
			return;
		}
		if (arg0.anIntArray54 != null) {
			arg0 = arg0.method369();
		}
		if (arg0 == null || !arg0.aBoolean28) {
			return;
		}
		@Pc(30) Class63 local30 = arg0.aClass63_319;
		if (arg0.anInt460 != 0) {
			local30 = Static15.method374(new Class63[] { local30, Static76.method1435(arg0.anInt460, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2375), Static21.aClass63_441, Static90.aClass63_1333, Static118.method2114(arg0.anInt460), Static113.aClass63_398 });
		}
		if (Static29.anInt939 == 1) {
			Static19.method501(arg2, Static15.method374(new Class63[] { Static1.aClass63_8, Static110.aClass63_1644, local30 }), arg1, arg3, 31, Static18.aClass63_385);
		} else if (!Static42.aBoolean63) {
			@Pc(89) Class63[] local89 = arg0.aClass63Array3;
			if (Static72.aBoolean109) {
				local89 = Static79.method1453(local89);
			}
			@Pc(99) int local99;
			if (local89 != null) {
				for (local99 = 4; local99 >= 0; local99--) {
					if (local89[local99] != null && !local89[local99].method1822(Static119.aClass63_1743)) {
						@Pc(114) byte local114 = 0;
						if (local99 == 0) {
							local114 = 35;
						}
						if (local99 == 1) {
							local114 = 27;
						}
						if (local99 == 2) {
							local114 = 16;
						}
						if (local99 == 3) {
							local114 = 21;
						}
						if (local99 == 4) {
							local114 = 11;
						}
						Static19.method501(arg2, Static15.method374(new Class63[] { Static12.aClass63_279, local30 }), arg1, arg3, local114, local89[local99]);
					}
				}
			}
			if (local89 != null) {
				for (local99 = 4; local99 >= 0; local99--) {
					if (local89[local99] != null && local89[local99].method1822(Static119.aClass63_1743)) {
						@Pc(192) short local192 = 0;
						if (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2375 < arg0.anInt460) {
							local192 = 2000;
						}
						@Pc(201) int local201 = 0;
						if (local99 == 0) {
							local201 = local192 + 35;
						}
						if (local99 == 1) {
							local201 = local192 + 27;
						}
						if (local99 == 2) {
							local201 = local192 + 16;
						}
						if (local99 == 3) {
							local201 = local192 + 21;
						}
						if (local99 == 4) {
							local201 = local192 + 11;
						}
						Static19.method501(arg2, Static15.method374(new Class63[] { Static12.aClass63_279, local30 }), arg1, arg3, local201, local89[local99]);
					}
				}
			}
			Static19.method501(arg2, Static15.method374(new Class63[] { Static12.aClass63_279, local30 }), arg1, arg3, 1004, Static117.aClass63_1621);
			return;
		} else if ((Static72.anInt2049 & 0x2) == 2) {
			Static19.method501(arg2, Static15.method374(new Class63[] { Static50.aClass63_807, Static110.aClass63_1644, local30 }), arg1, arg3, 34, Static33.aClass63_613);
			return;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public static void method844() {
		aClass63_616 = null;
		aClass63_618 = null;
		aClass63_622 = null;
		aClass63_619 = null;
		aClass63_621 = null;
		aClass63_615 = null;
		aClass63Array8 = null;
		aClass63_620 = null;
		aClass63_617 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BIILclient!ge;)Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2 method845(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2) {
		return Static76.method1433(arg0, arg2, arg1) ? Static89.method1603() : null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZB)V")
	public static void method846(@OriginalArg(0) boolean arg0) {
		if (Static4.aClass8_1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && Static4.aClass8_1.anEventQueue1.peekEvent() != null; local16++) {
			Static53.method2063(1L);
		}
		if (arg0) {
			Static4.aClass8_1.anEventQueue1.postEvent(new ActionEvent(Static38.aCanvas1, 1001, "dummy"));
		}
	}
}
