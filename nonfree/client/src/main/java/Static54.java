import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ek", name = "X", descriptor = "Lclient!jb;")
	public static Class28 aClass28_24;

	@OriginalMember(owner = "client!ek", name = "jb", descriptor = "Lclient!jb;")
	public static Class28 aClass28_25;

	@OriginalMember(owner = "client!ek", name = "V", descriptor = "Lclient!o;")
	public static Class86 aClass86_1 = null;

	@OriginalMember(owner = "client!ek", name = "db", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!ek", name = "hb", descriptor = "[[B")
	public static byte[][] aByteArrayArray2 = new byte[250][];

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
	public static void method1091() {
		Static193.aClass1_Sub26_Sub1_2.method3000(87);
		for (@Pc(18) Class1_Sub11 local18 = (Class1_Sub11) Static154.aClass50_18.method1358(); local18 != null; local18 = (Class1_Sub11) Static154.aClass50_18.method1361()) {
			if (local18.anInt1576 == 0) {
				Static165.method1867(local18, true);
			}
		}
		if (Static184.aClass86_14 != null) {
			Static16.method354(Static184.aClass86_14);
			Static184.aClass86_14 = null;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!dg;Lclient!lg;I)V")
	public static void method1092(@OriginalArg(0) int arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) Class73 arg2) {
		@Pc(3) Class1_Sub3 local3 = new Class1_Sub3();
		local3.aClass73_1 = arg2;
		local3.aLong177 = arg0;
		local3.aClass28_Sub1_12 = arg1;
		local3.anInt254 = 1;
		@Pc(22) Class120 local22 = Static192.aClass120_19;
		synchronized (Static192.aClass120_19) {
			Static192.aClass120_19.method3567(local3);
		}
		Static102.method1715();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ra;BIII)V")
	public static void method1093(@OriginalArg(0) Class101 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub21 local15 = (Class1_Sub21) Static157.aClass120_18.method3564(); local15 != null; local15 = (Class1_Sub21) Static157.aClass120_18.method3561()) {
			if (local15.anInt3425 == arg2 && arg3 * 128 == local15.anInt3413 && arg1 * 128 == local15.anInt3418 && local15.aClass101_1.anInt3903 == arg0.anInt3903) {
				if (local15.aClass1_Sub6_Sub3_3 != null) {
					Static42.aClass1_Sub6_Sub1_1.method966(local15.aClass1_Sub6_Sub3_3);
					local15.aClass1_Sub6_Sub3_3 = null;
				}
				if (local15.aClass1_Sub6_Sub3_2 != null) {
					Static42.aClass1_Sub6_Sub1_1.method966(local15.aClass1_Sub6_Sub3_2);
					local15.aClass1_Sub6_Sub3_2 = null;
				}
				local15.method3735();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)Lclient!oe;")
	public static Class89 method1094(@OriginalArg(1) int arg0) {
		@Pc(15) Class89 local15 = (Class89) Static165.aClass61_42.method1693((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static49.aClass28_22.method819(Static67.method1228(arg0), Static47.method926(arg0));
		local15 = new Class89();
		if (local29 != null) {
			local15.method2513(new Class1_Sub26(local29));
		}
		Static165.aClass61_42.method1694((long) arg0, local15);
		return local15;
	}
}
