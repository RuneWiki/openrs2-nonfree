import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "[I")
	public static int[] anIntArray497;

	@OriginalMember(owner = "client!vm", name = "yb", descriptor = "Lclient!vj;")
	public static Class58 aClass58_45;

	@OriginalMember(owner = "client!vm", name = "Db", descriptor = "Lclient!tj;")
	public static Class193 aClass193_107;

	@OriginalMember(owner = "client!vm", name = "Fb", descriptor = "I")
	public static int anInt6523;

	@OriginalMember(owner = "client!vm", name = "Ab", descriptor = "I")
	public static int anInt6520 = 1;

	@OriginalMember(owner = "client!vm", name = "Bb", descriptor = "I")
	public static int anInt6521 = 0;

	@OriginalMember(owner = "client!vm", name = "Eb", descriptor = "I")
	public static int anInt6522 = -1;

	@OriginalMember(owner = "client!vm", name = "Gb", descriptor = "I")
	public static int anInt6524 = 2;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public static void method5451() {
		@Pc(6) Class198 local6 = Static86.aClass198_74;
		synchronized (Static86.aClass198_74) {
			Static86.aClass198_74.method5213();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIZLclient!br;)V")
	public static void method5455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class21 arg3) {
		@Pc(8) int local8 = arg3.anInt740;
		@Pc(11) int local11 = arg3.anInt758;
		if (arg3.aByte12 == 0) {
			arg3.anInt740 = arg3.anInt718;
		} else if (arg3.aByte12 == 1) {
			arg3.anInt740 = arg1 - arg3.anInt718;
		} else if (arg3.aByte12 == 2) {
			arg3.anInt740 = arg1 * arg3.anInt718 >> 14;
		}
		if (arg3.aByte11 == 0) {
			arg3.anInt758 = arg3.anInt760;
		} else if (arg3.aByte11 == 1) {
			arg3.anInt758 = arg0 - arg3.anInt760;
		} else if (arg3.aByte11 == 2) {
			arg3.anInt758 = arg0 * arg3.anInt760 >> 14;
		}
		if (arg3.aByte12 == 4) {
			arg3.anInt740 = arg3.anInt732 * arg3.anInt758 / arg3.anInt759;
		}
		if (arg3.aByte11 == 4) {
			arg3.anInt758 = arg3.anInt759 * arg3.anInt740 / arg3.anInt732;
		}
		if (Static189.aBoolean306 && (Static44.method877(arg3).anInt1386 != 0 || arg3.anInt722 == 0)) {
			if (arg3.anInt758 < 5 && arg3.anInt740 < 5) {
				arg3.anInt740 = 5;
				arg3.anInt758 = 5;
			} else {
				if (arg3.anInt740 <= 0) {
					arg3.anInt740 = 5;
				}
				if (arg3.anInt758 <= 0) {
					arg3.anInt758 = 5;
				}
			}
		}
		if (arg3.anInt757 == 1337) {
			Static227.aClass21_4 = arg3;
		}
		if (arg2 && arg3.anObjectArray6 != null && (arg3.anInt740 != local8 || local11 != arg3.anInt758)) {
			@Pc(188) Class4_Sub34 local188 = new Class4_Sub34();
			local188.anObjectArray34 = arg3.anObjectArray6;
			local188.aClass21_12 = arg3;
			Static318.aClass116_45.method3274(local188);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)V")
	public static void method5456(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub4_Sub18 local16 = Static302.method4961(arg0, 11);
		local16.method4902();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([Lclient!br;IB)V")
	public static void method5461(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class21 local18 = arg0[local12];
			if (local18 != null && local18.anInt723 == arg1 && !Static44.method889(local18)) {
				if (local18.anInt722 == 0) {
					method5461(arg0, local18.anInt728);
					if (local18.aClass21Array1 != null) {
						method5461(local18.aClass21Array1, local18.anInt728);
					}
					@Pc(55) Class4_Sub25 local55 = (Class4_Sub25) Static270.aClass43_29.method1273((long) local18.anInt728);
					if (local55 != null) {
						Static125.method2597(local55.anInt3695);
					}
				}
				if (local18.anInt722 == 6 && local18.anInt716 != -1) {
					@Pc(74) Class14 local74 = Static225.method4042(local18.anInt716);
					if (local74 != null) {
						local18.anInt749 += Static218.anInt4454;
						while (local74.anIntArray11[local18.anInt756] < local18.anInt749) {
							local18.anInt749 -= local74.anIntArray11[local18.anInt756];
							local18.anInt756++;
							if (local18.anInt756 >= local74.anIntArray12.length) {
								local18.anInt756 -= local74.anInt348;
								if (local18.anInt756 < 0 || local18.anInt756 >= local74.anIntArray12.length) {
									local18.anInt756 = 0;
								}
							}
							local18.anInt764 = local18.anInt756 + 1;
							if (local74.anIntArray12.length <= local18.anInt764) {
								local18.anInt764 -= local74.anInt348;
								if (local18.anInt764 < 0 || local74.anIntArray12.length <= local18.anInt764) {
									local18.anInt764 = -1;
								}
							}
							Static349.method5536(local18);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)Z")
	public static boolean method5462(@OriginalArg(0) int arg0) {
		@Pc(7) Class10_Sub1 local7 = Static43.method841(arg0);
		if (local7 == null) {
			return false;
		} else if (Static200.anInt4144 == 3) {
			@Pc(39) String local39 = "";
			if (Static80.anInt2116 != 0) {
				local39 = ":" + (local7.anInt274 + 7000);
			}
			@Pc(57) String local57 = "";
			if (Static209.aString48 != null) {
				local57 = "/p=" + Static209.aString48;
			}
			@Pc(106) String local106 = "http://" + local7.aString2 + local39 + "/l=" + Static180.anInt3835 + "/a=" + Static182.anInt3853 + local57 + "/j" + (Static302.aBoolean427 ? "1" : "0") + ",o" + (Static100.aBoolean183 ? "1" : "0") + ",a2";
			try {
				Static76.aClient1.getAppletContext().showDocument(new URL(local106), "_self");
				return true;
			} catch (@Pc(116) Exception local116) {
				return false;
			}
		} else {
			Static309.aString62 = local7.aString2;
			Static215.anInt4413 = local7.anInt274;
			if (Static80.anInt2116 != 0) {
				Static206.anInt4324 = Static215.anInt4413 + 40000;
				Static328.anInt6269 = Static215.anInt4413 + 50000;
				Static184.anInt3886 = Static206.anInt4324;
			}
			return true;
		}
	}
}
