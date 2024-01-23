import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "Lclient!me;")
	public static Class111 aClass111_3;

	@OriginalMember(owner = "client!kb", name = "cb", descriptor = "[Lclient!nj;")
	public static Class121[] aClass121Array1 = new Class121[8];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method2595(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) long local33 = arg0; local33 != 0L; local33 /= 37L) {
				local31++;
			}
			@Pc(59) StringBuffer local59 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(67) long local67 = arg0;
				arg0 /= 37L;
				local59.append(Static37.aCharArray1[(int) (local67 - arg0 * 37L)]);
			}
			return local59.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILclient!vm;I)V")
	public static void method2596(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class188 arg2, @OriginalArg(4) int arg3) {
		if (Static68.anInt1741 >= 400) {
			return;
		}
		if (arg2.anIntArray572 != null) {
			arg2 = arg2.method4618();
		}
		if (arg2 == null || !arg2.aBoolean392) {
			return;
		}
		@Pc(36) String local36 = arg2.aString204;
		if (arg2.anInt5890 != 0) {
			@Pc(49) String local49 = Static162.anInt3614 == 1 ? Static270.aString143 : Static274.aString187;
			local36 = local36 + Static238.method4690(arg2.anInt5890, Static22.aClass15_Sub2_Sub2_1.anInt5382) + " (" + local49 + arg2.anInt5890 + ")";
		}
		if (Static73.anInt1823 == 1) {
			Static206.method3478(Static4.aString3 + " -> <col=ffff00>" + local36, (long) arg0, arg3, (short) 4, Static21.aString22, arg1, Static269.anInt5273);
		} else if (Static287.aBoolean373) {
			@Pc(112) Class2_Sub8_Sub24 local112 = Static161.anInt3604 == -1 ? null : Static270.method3460(Static161.anInt3604);
			if ((Static237.anInt4771 & 0x2) != 0 && (local112 == null || arg2.method4605(local112.anInt5989, Static161.anInt3604) != local112.anInt5989)) {
				Static206.method3478(Static96.aString83 + " -> <col=ffff00>" + local36, (long) arg0, arg3, (short) 37, Static251.aString167, arg1, Static312.anInt5126);
			}
		} else {
			@Pc(158) String[] local158 = arg2.aStringArray45;
			if (Static262.aBoolean344) {
				local158 = Static103.method1789(local158);
			}
			@Pc(175) int local175;
			if (local158 != null) {
				for (local175 = 4; local175 >= 0; local175--) {
					if (local158[local175] != null && (Static162.anInt3614 != 0 || !local158[local175].equalsIgnoreCase(Static52.aString49))) {
						@Pc(194) int local194 = -1;
						if (local175 == arg2.anInt5863) {
							local194 = arg2.anInt5878;
						}
						if (arg2.anInt5875 == local175) {
							local194 = arg2.anInt5870;
						}
						@Pc(219) byte local219 = 0;
						if (local175 == 0) {
							local219 = 32;
						}
						if (local175 == 1) {
							local219 = 6;
						}
						if (local175 == 2) {
							local219 = 47;
						}
						if (local175 == 3) {
							local219 = 46;
						}
						if (local175 == 4) {
							local219 = 16;
						}
						Static206.method3478("<col=ffff00>" + local36, (long) arg0, arg3, local219, local158[local175], arg1, local194);
					}
				}
			}
			if (Static162.anInt3614 == 0 && local158 != null) {
				for (local175 = 4; local175 >= 0; local175--) {
					if (local158[local175] != null && local158[local175].equalsIgnoreCase(Static52.aString49)) {
						@Pc(297) short local297 = 0;
						if (Static22.aClass15_Sub2_Sub2_1.anInt5382 < arg2.anInt5890) {
							local297 = 2000;
						}
						@Pc(306) short local306 = 0;
						if (local175 == 0) {
							local306 = 32;
						}
						if (local175 == 1) {
							local306 = 6;
						}
						if (local175 == 2) {
							local306 = 47;
						}
						if (local175 == 3) {
							local306 = 46;
						}
						if (local175 == 4) {
							local306 = 16;
						}
						if (local306 != 0) {
							local306 += local297;
						}
						Static206.method3478("<col=ffff00>" + local36, (long) arg0, arg3, local306, local158[local175], arg1, arg2.anInt5853);
					}
				}
			}
			Static206.method3478("<col=ffff00>" + local36, (long) arg0, arg3, (short) 1010, Static234.aString161, arg1, Static294.anInt5732);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZIIII)V")
	public static void method2597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static53.anInt1319 <= arg0 && arg1 <= Static81.anInt1915 && arg4 >= Static148.anInt3245 && Static166.anInt3675 >= arg3) {
			Static297.method4542(arg6, arg4, arg3, arg5, arg0, arg2, arg1);
		} else {
			Static269.method4271(arg6, arg0, arg3, arg4, arg1, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
	public static void method2598() {
		Static28.aClass157_6.method4033();
		Static154.aClass157_28.method4033();
		Static174.aClass157_32.method4033();
		Static204.aClass157_35.method4033();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZZ)V")
	public static void method2599(@OriginalArg(1) boolean arg0) {
		Static93.anIntArray202 = new int[104];
		Static9.anIntArray299 = new int[104];
		Static9.anIntArray300 = new int[5];
		Static152.anIntArray341 = new int[104];
		Static295.anIntArray562 = new int[104];
		Static305.anInt5900 = 99;
		Static167.anIntArray364 = new int[104];
		@Pc(27) byte local27;
		if (arg0) {
			local27 = 1;
		} else {
			local27 = 4;
		}
		Static14.aByteArrayArrayArray3 = new byte[local27][104][104];
		Static209.aByteArrayArrayArray18 = new byte[local27][105][105];
		Static121.aByteArrayArrayArray7 = new byte[local27][104][104];
		Static228.anIntArrayArrayArray14 = new int[local27][105][105];
		Static10.aByteArrayArrayArray1 = new byte[local27][104][104];
		Static83.aByteArrayArrayArray6 = new byte[local27][104][104];
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2600(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIII)V")
	public static void method2602(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1008) {
			Static301.method4575(arg1, arg2, 10);
		} else if (arg0 == 1006) {
			Static301.method4575(arg1, arg2, 11);
		} else if (arg0 == 1005) {
			Static301.method4575(arg1, arg2, 12);
		} else if (arg0 == 1003) {
			Static301.method4575(arg1, arg2, 13);
		} else if (arg0 == 1009) {
			Static301.method4575(arg1, arg2, 14);
		}
	}
}
