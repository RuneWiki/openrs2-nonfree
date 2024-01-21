import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "J")
	public static long aLong80;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "[Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3[] aClass3_Sub2_Sub3_Sub3Array8;

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "Lclient!jg;")
	public static Class44 aClass44_18;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!kb;")
	private static Class46 aClass46_802 = Static65.method1172("Loading wordpack )2 ");

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!kb;")
	public static Class46 aClass46_803 = Static65.method1172("<col=00ff80>");

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!kb;")
	public static Class46 aClass46_804 = Static65.method1172("::fpson");

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_805 = Static65.method1172("k");

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "Lclient!kb;")
	public static Class46 aClass46_806 = aClass46_802;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method1646() {
		if (Static52.aClass1_1 != null) {
			Static52.aClass1_1.method10();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	public static void method1647() {
		aClass46_806 = null;
		aClass44_18 = null;
		aClass46_804 = null;
		aClass3_Sub2_Sub3_Sub3Array8 = null;
		aClass46_805 = null;
		aCanvas1 = null;
		aClass46_802 = null;
		aClass46_803 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBLclient!jg;)Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3 method1648(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		return Static167.method521(arg1, arg0) ? Static21.method2161() : null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)Z")
	public static boolean method1649(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZLclient!me;)V")
	public static void method1650(@OriginalArg(0) int arg0, @OriginalArg(2) Class44_Sub1 arg1) {
		if (Static58.aClass3_Sub4_1 == null) {
			Static90.method1502(255, true, 255, (byte) 0, null, 0);
			Static135.aClass44_Sub1Array1[arg0] = arg1;
		} else {
			Static58.aClass3_Sub4_1.anInt232 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static58.aClass3_Sub4_1.method213();
			@Pc(20) int local20 = Static58.aClass3_Sub4_1.method213();
			arg1.method1639(local20, local16);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZLclient!jg;ILclient!jg;)Lclient!eg;")
	public static Class3_Sub2_Sub4 method1651(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(4) Class44 arg2) {
		@Pc(10) int[] local10 = arg1.method1615(arg0);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(29) byte[] local29 = arg1.method1620(arg0, local10[local14]);
			if (local29 == null) {
				local12 = false;
			} else {
				@Pc(49) int local49 = (local29[0] & 0xFF) << 8 | local29[1] & 0xFF;
				@Pc(65) byte[] local65 = arg2.method1620(local49, 0);
				if (local65 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class3_Sub2_Sub4(arg1, arg2, arg0, false);
		} catch (@Pc(87) Exception local87) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public static void method1652() {
		for (@Pc(11) int local11 = -1; local11 < Static180.anInt3971; local11++) {
			@Pc(19) int local19;
			if (local11 == -1) {
				local19 = 2047;
			} else {
				local19 = Static127.anIntArray338[local11];
			}
			@Pc(29) Class3_Sub2_Sub1_Sub1_Sub1 local29 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local19];
			if (local29 != null) {
				Static172.method2724(local29, 1);
			}
		}
	}
}
