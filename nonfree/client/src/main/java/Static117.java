import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	public static int anInt2840;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!je;")
	public static Class41 aClass41_4;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1661 = Static107.method1838("lila:");

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1662 = Static107.method1838("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1664 = Static107.method1838("K");

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1663 = aClass28_1664;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	public static int anInt2841 = 0;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1665 = aClass28_1664;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1666 = Static107.method1838("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lclient!hg;")
	public static Class2_Sub4_Sub11 method1958(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub4_Sub11 local10 = (Class2_Sub4_Sub11) Static35.aClass14_52.method603((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static56.aClass40_16.method1771(14, arg0);
		local10 = new Class2_Sub4_Sub11();
		if (local20 != null) {
			local10.method1294(new Class2_Sub2(local20));
		}
		Static35.aClass14_52.method607((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!jc;Lclient!jc;I)V")
	public static void method1959(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1) {
		Static15.aClass40_6 = arg0;
		Static88.aClass40_27 = arg1;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIII)Lclient!gg;")
	public static Class28 method1960(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class28 local17 = new Class28();
		local17.anInt1718 = 0;
		local17.aByteArray14 = new byte[arg2];
		for (@Pc(26) int local26 = arg1; local26 < arg2 + arg1; local26++) {
			if (arg0[local26] != 0) {
				local17.aByteArray14[local17.anInt1718++] = arg0[local26];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZB)V")
	public static void method1961(@OriginalArg(0) boolean arg0) {
		if (Static142.aClass22_3 == null) {
			return;
		}
		try {
			@Pc(15) Class2_Sub2 local15 = new Class2_Sub2(4);
			local15.method1700(arg0 ? 2 : 3);
			local15.method1691(0);
			Static142.aClass22_3.method965(4, local15.aByteArray35);
		} catch (@Pc(36) IOException local36) {
			try {
				Static142.aClass22_3.method962();
			} catch (@Pc(41) Exception local41) {
			}
			Static142.aClass22_3 = null;
			Static157.anInt3497++;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method1962() {
		aClass28_1661 = null;
		aClass28_1665 = null;
		aClass41_4 = null;
		aClass28_1662 = null;
		aClass28_1664 = null;
		aClass28_1663 = null;
		aClass28_1666 = null;
	}
}
