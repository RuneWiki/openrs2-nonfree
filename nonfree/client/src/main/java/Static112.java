import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!mh", name = "P", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1010 = Static161.method2971("Select");

	@OriginalMember(owner = "client!mh", name = "Q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1011 = aClass13_1010;

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1015 = Static161.method2971("flash2:");

	@OriginalMember(owner = "client!mh", name = "R", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1012 = aClass13_1015;

	@OriginalMember(owner = "client!mh", name = "S", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1013 = aClass13_1015;

	@OriginalMember(owner = "client!mh", name = "X", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1014 = Static161.method2971("Attack");

	@OriginalMember(owner = "client!mh", name = "Z", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1016 = Static161.method2971(" ");

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1017 = aClass13_1014;

	@OriginalMember(owner = "client!mh", name = "cb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1018 = Static161.method2971("Stufe)2");

	@OriginalMember(owner = "client!mh", name = "db", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array22 = new Class13[1000];

	@OriginalMember(owner = "client!mh", name = "gb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1019 = Static161.method2971("<col=00ffff>");

	@OriginalMember(owner = "client!mh", name = "ib", descriptor = "I")
	public static volatile int anInt3057 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!dd;)V")
	public static void method2182(@OriginalArg(1) Class13 arg0) {
		if (Static156.aClass1_Sub11Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = arg0.method878();
		if (local14 == 0L) {
			return;
		}
		while (local10 < Static156.aClass1_Sub11Array1.length && local14 != Static156.aClass1_Sub11Array1[local10].aLong158) {
			local10++;
		}
		if (Static156.aClass1_Sub11Array1.length > local10 && Static156.aClass1_Sub11Array1[local10] != null) {
			Static1.aClass1_Sub8_Sub1_1.method1654(99);
			Static1.aClass1_Sub8_Sub1_1.method1625(Static156.aClass1_Sub11Array1[local10].aLong158);
		}
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
	public static void method2183() {
		Static85.aClass47_17.method1995();
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V")
	public static void method2184() {
		aClass13_1013 = null;
		aClass13_1010 = null;
		aClass13_1019 = null;
		aClass13Array22 = null;
		aClass13_1011 = null;
		aClass13_1017 = null;
		aClass13_1016 = null;
		aClass13_1015 = null;
		aClass13_1018 = null;
		aClass13_1014 = null;
		aClass13_1012 = null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIB)V")
	public static void method2185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
			for (local19 = 0; local19 < 8; local19++) {
				Static183.anIntArrayArrayArray8[arg0][local15 + arg1][local19 + arg2] = 0;
			}
		}
		if (arg1 > 0) {
			for (local19 = 1; local19 < 8; local19++) {
				Static183.anIntArrayArrayArray8[arg0][arg1][arg2 + local19] = Static183.anIntArrayArrayArray8[arg0][arg1 - 1][arg2 + local19];
			}
		}
		if (arg2 > 0) {
			for (local19 = 1; local19 < 8; local19++) {
				Static183.anIntArrayArrayArray8[arg0][arg1 + local19][arg2] = Static183.anIntArrayArrayArray8[arg0][local19 + arg1][arg2 - 1];
			}
		}
		if (arg1 > 0 && Static183.anIntArrayArrayArray8[arg0][arg1 - 1][arg2] != 0) {
			Static183.anIntArrayArrayArray8[arg0][arg1][arg2] = Static183.anIntArrayArrayArray8[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && Static183.anIntArrayArrayArray8[arg0][arg1][arg2 - 1] != 0) {
			Static183.anIntArrayArrayArray8[arg0][arg1][arg2] = Static183.anIntArrayArrayArray8[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && Static183.anIntArrayArrayArray8[arg0][arg1 - 1][arg2 - 1] != 0) {
			Static183.anIntArrayArrayArray8[arg0][arg1][arg2] = Static183.anIntArrayArrayArray8[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ag;ILclient!ag;)V")
	public static void method2186(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		Static181.aClass4_102 = arg0;
		Static132.aClass4_82 = arg1;
		Static52.anInt1703 = Static132.aClass4_82.method2260(3);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V")
	public static void method2187(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub24 local16 = (Class1_Sub24) Static30.aClass45_6.method1988((long) arg0);
		if (local16 != null) {
			local16.method3056();
		}
	}
}
