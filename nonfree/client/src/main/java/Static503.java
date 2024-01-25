import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "Lclient!eb;")
	public static Class91 aClass91_11;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
	public static int anInt7948;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Z")
	public static boolean method6581(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class3_Sub5_Sub18 local18 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6603(); local18 != null; local18 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6605()) {
			if (Static475.method6321(local18.anInt9217) && local18.aLong259 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!cm;IZ)V")
	public static void method6582(@OriginalArg(0) Class34_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static166.anInt3037 >= 400) {
			return;
		}
		if (arg0 != Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1) {
			@Pc(69) String local69;
			if (arg0.anInt1789 == 0) {
				@Pc(97) boolean local97 = true;
				if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1805 != -1 && arg0.anInt1805 != -1) {
					@Pc(122) int local122 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1805 < arg0.anInt1805 ? Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1805 : arg0.anInt1805;
					@Pc(128) int local128 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1791 - arg0.anInt1791;
					if (local128 < 0) {
						local128 = -local128;
					}
					if (local122 < local128) {
						local97 = false;
					}
				}
				@Pc(155) String local155 = Static499.aClass203_8 == Static227.aClass203_4 ? Static114.aClass84_30.method1729(Static654.anInt10668) : Static114.aClass84_28.method1729(Static654.anInt10668);
				if (arg0.anInt1791 < arg0.anInt1811) {
					local69 = arg0.method1482() + (local97 ? Static441.method6017(arg0.anInt1791, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1791) : "<col=ffffff>") + " (" + local155 + arg0.anInt1791 + "+" + (arg0.anInt1811 - arg0.anInt1791) + ")";
				} else {
					local69 = arg0.method1482() + (local97 ? Static441.method6017(arg0.anInt1791, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1791) : "<col=ffffff>") + " (" + local155 + arg0.anInt1791 + ")";
				}
			} else if (arg0.anInt1789 == -1) {
				local69 = arg0.method1482();
			} else {
				local69 = arg0.method1482() + " (" + Static114.aClass84_29.method1729(Static654.anInt10668) + arg0.anInt1789 + ")";
			}
			if (Static47.aBoolean59 && !arg1 && (Static344.anInt5895 & 0x8) != 0) {
				Static390.method5454(-1, true, Static36.aString12, (long) arg0.anInt9671, 30, 0, Static225.aString51 + " -> <col=ffffff>" + local69, (long) arg0.anInt9671, false, 0, Static213.anInt3686, false);
			}
			if (arg1) {
				Static390.method5454(0, false, "<col=cccccc>" + local69, 0L, -1, 0, "", (long) arg0.anInt9671, false, 0, -1, true);
			} else {
				for (@Pc(278) int local278 = 7; local278 >= 0; local278--) {
					if (Static437.aStringArray51[local278] != null) {
						@Pc(286) short local286 = 0;
						if (Static227.aClass203_4 == Static342.aClass203_6 && Static437.aStringArray51[local278].equalsIgnoreCase(Static114.aClass84_23.method1729(Static654.anInt10668))) {
							if (Static258.aBoolean304 && arg0.anInt1791 > Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1791) {
								local286 = 2000;
							}
							if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1810 == 0 || arg0.anInt1810 == 0) {
								if (arg0.aBoolean146) {
									local286 = 2000;
								}
							} else if (arg0.anInt1810 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1810) {
								local286 = 2000;
							} else {
								local286 = 0;
							}
						} else if (Static231.aBooleanArray17[local278]) {
							local286 = 2000;
						}
						@Pc(357) short local357 = (short) (local286 + Static48.aShortArray12[local278]);
						@Pc(368) int local368 = Static573.anIntArray486[local278] == -1 ? Static677.anInt10939 : Static573.anIntArray486[local278];
						Static390.method5454(-1, true, Static437.aStringArray51[local278], (long) arg0.anInt9671, local357, 0, "<col=ffffff>" + local69, (long) arg0.anInt9671, false, 0, local368, false);
					}
				}
			}
			if (!arg1) {
				for (@Pc(443) Class3_Sub5_Sub18 local443 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6603(); local443 != null; local443 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6605()) {
					if (local443.anInt9217 == 8) {
						local443.aString104 = "<col=ffffff>" + local69;
						return;
					}
				}
			}
		} else if (Static47.aBoolean59 && (Static344.anInt5895 & 0x10) != 0) {
			Static390.method5454(-1, true, Static36.aString12, 0L, 10, 0, Static225.aString51 + " -> <col=ffffff>" + Static114.aClass84_37.method1729(Static654.anInt10668), (long) arg0.anInt9671, false, 0, Static213.anInt3686, false);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!cm;[IBI)V")
	public static void method6584(@OriginalArg(0) Class34_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg0.anIntArray527 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg0.anIntArray527.length; local12++) {
				if (arg1[local12] != arg0.anIntArray527[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg0.anInt9664 != -1) {
				@Pc(44) Class239 local44 = Static13.aClass213_1.method5008(arg0.anInt9664);
				@Pc(47) int local47 = local44.anInt6416;
				if (local47 == 1) {
					arg0.anInt9680 = 0;
					arg0.anInt9641 = 0;
					arg0.anInt9674 = 0;
					arg0.anInt9697 = 1;
					arg0.anInt9698 = arg2;
					if (!arg0.aBoolean674) {
						Static305.method4420(arg0, local44, arg0.anInt9674);
					}
				}
				if (local47 == 2) {
					arg0.anInt9641 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] != -1) {
				local10 = false;
			}
			if (arg0.anIntArray527 == null || arg0.anIntArray527[local12] == -1 || Static13.aClass213_1.method5008(arg1[local12]).anInt6404 >= Static13.aClass213_1.method5008(arg0.anIntArray527[local12]).anInt6404) {
				arg0.anInt9698 = arg2;
				arg0.anIntArray527 = arg1;
				break;
			}
		}
		if (local10) {
			arg0.anInt9698 = arg2;
			arg0.anIntArray527 = arg1;
		}
	}
}
