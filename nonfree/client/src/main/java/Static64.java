import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!kf", name = "jb", descriptor = "I")
	public static int anInt1442;

	@OriginalMember(owner = "client!kf", name = "lb", descriptor = "I")
	public static int anInt1444;

	@OriginalMember(owner = "client!kf", name = "mb", descriptor = "I")
	public static int anInt1445;

	@OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
	public static int anInt1437 = 0;

	@OriginalMember(owner = "client!kf", name = "eb", descriptor = "I")
	public static int anInt1439 = 0;

	@OriginalMember(owner = "client!kf", name = "gb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_664 = Static78.method1313("Name eingeben:");

	@OriginalMember(owner = "client!kf", name = "ib", descriptor = "Lclient!fc;")
	public static Class25 aClass25_665 = Static78.method1313("blinken3:");

	@OriginalMember(owner = "client!kf", name = "nb", descriptor = "I")
	public static int anInt1446 = 0;

	@OriginalMember(owner = "client!kf", name = "ob", descriptor = "[I")
	public static int[] anIntArray277 = new int[] { 0, 6, 0, -2, 0, -2, 0, -2, 0, 0, 0, -2, 0, 0, 3, 5, 0, 0, 0, 0, 14, 0, 2, 0, 0, 2, 0, 4, 0, 0, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 4, 0, 0, 0, 2, 0, 6, 0, -2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 3, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 6, 10, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 5, 0, 0, 0, 2, 8, 6, 0, 0, 0, 12, 0, -1, 0, 5, 0, 0, 0, 2, 6, 11, 0, 0, 6, 4, 4, 0, 11, 8, 4, -1, 0, 0, 0, 2, -2, 3, 1, 4, 4, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 4, 0, -2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 15, 0, 6, 0, 0, 0, 0, 2, -1, 0, -2, 0, 0, 0, 1, 1, 0, -1, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 3, 10, 0, 0, 7, 6, 6, 0, -2, 0, 0, 0, 7, 0, 2, 0, 0, 0, 0, 0, 0, 6, 0, 0, 3, 0, -2, 0, 2, 6, 0, 0, 0, 0, 0, 1, 5 };

	@OriginalMember(owner = "client!kf", name = "qb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_666 = Static78.method1313("mapdots");

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(B)V")
	public static void method1125() {
		aClass25_664 = null;
		aClass25_665 = null;
		anIntArray277 = null;
		aClass25_666 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII[Lclient!ob;BIIII)V")
	public static void method1126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub2_Sub14[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		for (@Pc(3) int local3 = 0; local3 < arg5.length; local3++) {
			@Pc(9) Class1_Sub2_Sub14 local9 = arg5[local3];
			if (local9 != null && (local9.anInt1960 == 0 || local9.aBoolean92) && local9 != null && local9.anInt1905 == arg3 && !Static39.method890(local9)) {
				@Pc(41) int local41 = local9.anInt1959 + arg4 - arg9;
				@Pc(48) int local48 = arg7 + local9.anInt1917 - arg0;
				@Pc(53) int local53 = local9.anInt1911 + local41;
				@Pc(60) int local60 = local41 > arg4 ? local41 : arg4;
				@Pc(71) int local71 = arg7 < local48 ? local48 : arg7;
				@Pc(82) int local82 = arg2 <= local53 ? arg2 : local53;
				@Pc(87) int local87 = local9.anInt1923 + local48;
				@Pc(94) int local94 = arg8 <= local87 ? arg8 : local87;
				if (local9.anInt1960 == 0) {
					method1126(local71 + local9.anInt1957 - local48, arg1, local82, local9.anInt1937, local60, arg5, arg6, local71, local94, local9.anInt1949 + local60 - local41);
					if (local9.aClass1_Sub2_Sub14Array2 != null) {
						method1126(local9.anInt1957 + local71 - local48, arg1, local82, local9.anInt1937, local60, local9.aClass1_Sub2_Sub14Array2, arg6, local71, local94, local9.anInt1949 + local60 - local41);
					}
				}
				if (local9.aBoolean92) {
					@Pc(158) boolean local158 = false;
					@Pc(160) boolean local160 = false;
					if (Static11.anInt277 == 1 && Static30.anInt815 >= local60 && Static23.anInt675 >= local71 && local82 > Static30.anInt815 && Static23.anInt675 < local94) {
						local160 = true;
					}
					@Pc(211) boolean local211;
					if (Static10.anInt264 >= local60 && Static111.anInt2597 >= local71 && local82 > Static10.anInt264 && local94 > Static111.anInt2597) {
						local211 = true;
					} else {
						local211 = false;
					}
					if (Static42.anInt1139 == 1 && local211) {
						local158 = true;
					}
					if (local160 && Static87.aClass1_Sub2_Sub14_3 == null && (arg1 & 0x200) != 0 && !Static82.aBoolean77 && Static109.method1752(local9) != null) {
						Static87.aClass1_Sub2_Sub14_3 = local9;
						Static33.anInt921 = arg6;
						Static95.anInt2166 = 0;
						Static27.aBoolean25 = false;
						anInt1446 = Static30.anInt815 - local60;
						Static87.anInt1638 = Static23.anInt675 - local71;
					}
					if (Static87.aClass1_Sub2_Sub14_3 != null || Static82.aBoolean77) {
						local211 = false;
						local158 = false;
						local160 = false;
					}
					if (!local9.aBoolean95 && local160 && (arg1 & 0x1) != 0) {
						local9.aBoolean95 = true;
						if (local9.anObjectArray20 != null) {
							Static27.method600(local9, local9.anObjectArray20, null, Static30.anInt815 - local41, -local48 + Static23.anInt675, 0);
						}
					}
					if (local9.aBoolean95 && local158 && (arg1 & 0x4) != 0 && local9.anObjectArray4 != null) {
						Static27.method600(local9, local9.anObjectArray4, null, Static10.anInt264 - local41, -local48 + Static111.anInt2597, 0);
					}
					if (local9.aBoolean95 && !local158 && (arg1 & 0x2) != 0) {
						local9.aBoolean95 = false;
						if (local9.anObjectArray7 != null) {
							Static27.method600(local9, local9.anObjectArray7, null, Static10.anInt264 - local41, Static111.anInt2597 - local48, 0);
						}
					}
					if (local158 && (arg1 & 0x8) != 0 && local9.anObjectArray3 != null) {
						Static27.method600(local9, local9.anObjectArray3, null, Static10.anInt264 - local41, -local48 + Static111.anInt2597, 0);
					}
					if (!local9.aBoolean85 && local211 && (arg1 & 0x10) != 0) {
						local9.aBoolean85 = true;
						if (local9.anObjectArray16 != null) {
							Static27.method600(local9, local9.anObjectArray16, null, Static10.anInt264 - local41, -local48 + Static111.anInt2597, 0);
						}
					}
					if (local9.aBoolean85 && local211 && (arg1 & 0x40) != 0 && local9.anObjectArray5 != null) {
						Static27.method600(local9, local9.anObjectArray5, null, Static10.anInt264 - local41, -local48 + Static111.anInt2597, 0);
					}
					if (local9.aBoolean85 && !local211 && (arg1 & 0x20) != 0) {
						local9.aBoolean85 = false;
						if (local9.anObjectArray21 != null) {
							Static27.method600(local9, local9.anObjectArray21, null, Static10.anInt264 - local41, Static111.anInt2597 - local48, 0);
						}
					}
					if (local9.anObjectArray6 != null && (arg1 & 0x80) != 0) {
						Static27.method600(local9, local9.anObjectArray6, null, 0, 0, 0);
					}
					if (local211 && Static2.anInt30 != 0 && local9.anObjectArray8 != null && (arg1 & 0x400) != 0) {
						Static27.method600(local9, local9.anObjectArray8, null, 0, Static2.anInt30, 0);
					}
					if ((arg1 & 0x100) != 0) {
						if (Static62.anInt1392 > local9.anInt1910 && local9.anObjectArray15 != null) {
							Static27.method600(local9, local9.anObjectArray15, null, 0, 0, 0);
						}
						if (local9.anInt1910 < Static27.anInt743 && local9.anObjectArray9 != null) {
							Static27.method600(local9, local9.anObjectArray9, null, 0, 0, 0);
						}
						if (Static37.anInt1048 > local9.anInt1910 && local9.anObjectArray17 != null) {
							Static27.method600(local9, local9.anObjectArray17, null, 0, 0, 0);
						}
						local9.anInt1910 = Static60.anInt1366;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
	public static int method1127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 0) {
				arg0 = 0;
			} else if (arg0 > 127) {
				arg0 = 127;
			}
			return 127 - arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "(B)V")
	public static void method1128() {
		@Pc(5) Object local5 = Static30.anObject2;
		synchronized (Static30.anObject2) {
			if (Static127.anInt2946 != 0) {
				Static127.anInt2946 = 1;
				try {
					Static30.anObject2.wait();
				} catch (@Pc(18) InterruptedException local18) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZLclient!oc;ZI)V")
	public static void method1129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class56 arg2, @OriginalArg(5) int arg3) {
		Static88.anInt1984 = 1;
		Static1.anInt19 = 10000;
		Static126.anInt2930 = arg3;
		anInt1442 = arg1;
		Static118.aBoolean123 = false;
		Static120.anInt2848 = arg0;
		Static53.aClass56_78 = arg2;
	}
}
