import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "J")
	public static long aLong119;

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1163 = Static170.method3101("Hidden)2");

	@OriginalMember(owner = "client!rf", name = "P", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1164 = Static170.method3101("Players");

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "Lclient!pa;")
	public static Class63 aClass63_25 = new Class63(64);

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1165 = aClass28_1164;

	@OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
	public static int anInt3540 = 127;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!sh;I)V")
	public static void method2702(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0) {
		arg0.aBoolean100 = false;
		@Pc(15) Class3_Sub2_Sub4 local15;
		if (arg0.anInt1827 != -1) {
			local15 = Static21.method594(arg0.anInt1827);
			if (local15 == null || local15.anIntArray142 == null) {
				arg0.anInt1827 = -1;
			} else {
				arg0.anInt1812++;
				if (arg0.anInt1814 < local15.anIntArray142.length && local15.anIntArray139[arg0.anInt1814] < arg0.anInt1812) {
					arg0.anInt1812 = 1;
					arg0.anInt1814++;
					Static26.method681(arg0.anInt1814, arg0.anInt1800, local15, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1 == arg0, arg0.anInt1792);
				}
				if (local15.anIntArray142.length <= arg0.anInt1814) {
					arg0.anInt1814 = 0;
					arg0.anInt1812 = 0;
					Static26.method681(arg0.anInt1814, arg0.anInt1800, local15, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1 == arg0, arg0.anInt1792);
				}
			}
		}
		if (arg0.anInt1790 != -1 && arg0.anInt1801 <= Static14.anInt481) {
			if (arg0.anInt1838 < 0) {
				arg0.anInt1838 = 0;
			}
			@Pc(126) int local126 = Static1.method8(arg0.anInt1790).anInt507;
			if (local126 == -1) {
				arg0.anInt1790 = -1;
			} else {
				@Pc(137) Class3_Sub2_Sub4 local137 = Static21.method594(local126);
				if (local137 == null || local137.anIntArray142 == null) {
					arg0.anInt1790 = -1;
				} else {
					arg0.anInt1828++;
					if (local137.anIntArray142.length > arg0.anInt1838 && local137.anIntArray139[arg0.anInt1838] < arg0.anInt1828) {
						arg0.anInt1828 = 1;
						arg0.anInt1838++;
						Static26.method681(arg0.anInt1838, arg0.anInt1800, local137, arg0 == Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1, arg0.anInt1792);
					}
					if (arg0.anInt1838 >= local137.anIntArray142.length) {
						arg0.anInt1790 = -1;
					}
				}
			}
		}
		if (arg0.anInt1833 != -1 && arg0.anInt1832 <= 1) {
			local15 = Static21.method594(arg0.anInt1833);
			if (local15.anInt547 == 1 && arg0.anInt1808 > 0 && Static14.anInt481 >= arg0.anInt1794 && arg0.anInt1840 < Static14.anInt481) {
				arg0.anInt1832 = 1;
				return;
			}
		}
		if (arg0.anInt1833 != -1 && arg0.anInt1832 == 0) {
			local15 = Static21.method594(arg0.anInt1833);
			if (local15 == null || local15.anIntArray142 == null) {
				arg0.anInt1833 = -1;
			} else {
				arg0.anInt1813++;
				if (arg0.anInt1799 < local15.anIntArray142.length && arg0.anInt1813 > local15.anIntArray139[arg0.anInt1799]) {
					arg0.anInt1799++;
					arg0.anInt1813 = 1;
					Static26.method681(arg0.anInt1799, arg0.anInt1800, local15, arg0 == Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1, arg0.anInt1792);
				}
				if (arg0.anInt1799 >= local15.anIntArray142.length) {
					arg0.anInt1799 -= local15.anInt533;
					arg0.anInt1837++;
					if (local15.anInt543 <= arg0.anInt1837) {
						arg0.anInt1833 = -1;
					} else if (arg0.anInt1799 >= 0 && local15.anIntArray142.length > arg0.anInt1799) {
						Static26.method681(arg0.anInt1799, arg0.anInt1800, local15, arg0 == Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1, arg0.anInt1792);
					} else {
						arg0.anInt1833 = -1;
					}
				}
				arg0.aBoolean100 = local15.aBoolean33;
			}
		}
		if (arg0.anInt1832 > 0) {
			arg0.anInt1832--;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!ah;Lclient!ah;)V")
	public static void method2703(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static110.aClass7_48 = arg1;
		Static137.aClass7_57 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!sh;)V")
	public static void method2704(@OriginalArg(1) Class3_Sub2_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt1794 - Static14.anInt481;
		arg0.anInt1784 = 0;
		@Pc(21) int local21 = arg0.anInt1787 * 64 + arg0.anInt1798 * 128;
		if (arg0.anInt1820 == 0) {
			arg0.anInt1793 = 1024;
		}
		arg0.anInt1800 += (local21 - arg0.anInt1800) / local4;
		@Pc(53) int local53 = arg0.anInt1818 * 128 + arg0.anInt1787 * 64;
		if (arg0.anInt1820 == 1) {
			arg0.anInt1793 = 1536;
		}
		arg0.anInt1792 += (local53 - arg0.anInt1792) / local4;
		if (arg0.anInt1820 == 2) {
			arg0.anInt1793 = 0;
		}
		if (arg0.anInt1820 == 3) {
			arg0.anInt1793 = 512;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public static void method2705() {
		aBooleanArray16 = null;
		aClass28_1164 = null;
		aClass63_25 = null;
		aClass28_1163 = null;
		aClass28_1165 = null;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
	public static void method2706() {
		if (!Static24.aBoolean41) {
			return;
		}
		Static156.aClass3_Sub2_Sub2_Sub3_3 = null;
		Static9.anIntArray97 = null;
		Static135.anIntArray591 = null;
		Static15.aClass3_Sub2_Sub2_Sub4_3 = null;
		Static55.aClass3_Sub2_Sub2_Sub3Array4 = null;
		Static34.aClass3_Sub2_Sub2_Sub3Array3 = null;
		Static60.aClass3_Sub2_Sub2_Sub4_4 = null;
		Static170.aClass3_Sub2_Sub2_Sub4Array10 = null;
		Static153.aClass3_Sub2_Sub2_Sub3Array9 = null;
		Static176.aClass3_Sub2_Sub2_Sub3_4 = null;
		Static53.anIntArray268 = null;
		Static119.aClass3_Sub2_Sub2_Sub3_2 = null;
		Static55.aClass3_Sub2_Sub2_Sub3_1 = null;
		Static74.anIntArray363 = null;
		Static32.aClass3_Sub2_Sub2_Sub3Array2 = null;
		Static149.anIntArray625 = null;
		Static173.aClass3_Sub2_Sub2_Sub3Array10 = null;
		Static2.anIntArray17 = null;
		Static122.aClass3_Sub2_Sub2_Sub4_6 = null;
		Static58.anIntArray330 = null;
		Static60.aClass3_Sub2_Sub2_Sub4_5 = null;
		Static52.anIntArray254 = null;
		Static164.method3023();
		Static92.method3170(true);
		Static24.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)I")
	public static int method2708(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub2_Sub11 local11 = Static107.method2179(arg0);
		@Pc(14) int local14 = local11.anInt2398;
		@Pc(17) int local17 = local11.anInt2392;
		@Pc(20) int local20 = local11.anInt2393;
		@Pc(31) int local31 = RuntimeException_Sub1.anIntArray544[local20 - local17];
		return local31 & Static72.anIntArray354[local14] >> local17;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB)V")
	public static void method2711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class23 local11 = Static26.aClass23ArrayArrayArray1[Static171.anInt4109][arg1][arg0];
		if (local11 == null) {
			Static27.method744(Static171.anInt4109, arg1, arg0);
			return;
		}
		@Pc(23) Class3_Sub2_Sub1_Sub6 local23 = (Class3_Sub2_Sub1_Sub6) local11.method858();
		@Pc(25) int local25 = -99999999;
		@Pc(27) Class3_Sub2_Sub1_Sub6 local27 = null;
		while (local23 != null) {
			@Pc(33) Class3_Sub2_Sub10 local33 = Static76.method1736(local23.anInt3483);
			@Pc(36) int local36 = local33.anInt1875;
			if (local33.anInt1896 == 1) {
				local36 *= local23.anInt3478 + 1;
			}
			if (local36 > local25) {
				local25 = local36;
				local27 = local23;
			}
			local23 = (Class3_Sub2_Sub1_Sub6) local11.method861();
		}
		if (local27 == null) {
			Static27.method744(Static171.anInt4109, arg1, arg0);
			return;
		}
		local11.method859(local27);
		@Pc(80) Class3_Sub2_Sub1_Sub6 local80 = null;
		@Pc(82) Class3_Sub2_Sub1_Sub6 local82 = null;
		local23 = (Class3_Sub2_Sub1_Sub6) local11.method858();
		@Pc(100) long local100 = (long) ((arg0 << 7) + (arg1 + 1610612736));
		while (local23 != null) {
			if (local23.anInt3483 != local27.anInt3483) {
				if (local80 == null) {
					local80 = local23;
				}
				if (local23.anInt3483 != local80.anInt3483 && local82 == null) {
					local82 = local23;
				}
			}
			local23 = (Class3_Sub2_Sub1_Sub6) local11.method861();
		}
		Static96.method3168(Static171.anInt4109, arg1, arg0, Static33.method848(arg1 * 128 + 64, Static171.anInt4109, arg0 * 128 + 64), local27, local100, local80, local82);
	}
}
