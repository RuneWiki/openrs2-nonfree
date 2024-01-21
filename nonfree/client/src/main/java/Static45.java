import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!fc;")
	public static Class21 aClass21_12;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!rc;")
	public static Class55 aClass55_563 = Static34.method846(" @whi@(X");

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!rc;")
	public static Class55 aClass55_564 = Static34.method846("");

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!rc;")
	public static Class55 aClass55_565 = Static34.method846("backvmid3");

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	public static int anInt1471 = 0;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!rc;")
	private static Class55 aClass55_566 = Static34.method846("On");

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	public static int anInt1477 = 0;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!rc;")
	public static Class55 aClass55_567 = Static34.method846("auf der Hautpseite)3");

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_568 = Static34.method846("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Lclient!rc;")
	public static Class55 aClass55_569 = aClass55_566;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Lclient!rc;")
	public static Class55 aClass55_570 = Static34.method846("(U1");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!rc;ILclient!rc;Lclient!rc;)V")
	public static void method987(@OriginalArg(0) Class55 arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class55 arg2) {
		Static29.aClass55_424 = arg1;
		Static29.aClass55_433 = arg2;
		Static29.aClass55_430 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
	public static void method988(@OriginalArg(0) boolean arg0) {
		Static52.anInt1648++;
		if (Static52.anInt1648 < 50 && !arg0) {
			return;
		}
		Static52.anInt1648 = 0;
		if (Static5.aBoolean103 || Static19.aClass65_1 == null) {
			return;
		}
		Static51.aClass6_Sub1_Sub1_3.method1515(185);
		try {
			Static19.aClass65_1.method2009(Static51.aClass6_Sub1_Sub1_3.aByteArray11, Static51.aClass6_Sub1_Sub1_3.anInt2209);
			Static51.aClass6_Sub1_Sub1_3.anInt2209 = 0;
		} catch (@Pc(44) IOException local44) {
			Static5.aBoolean103 = true;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method989() {
		aClass55_568 = null;
		aClass21_12 = null;
		aClass55_566 = null;
		aClass55_569 = null;
		aClass55_565 = null;
		aClass55_563 = null;
		aClass55_564 = null;
		aClass55_567 = null;
		aClass55_570 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZZZZ)Lclient!md;")
	public static Class40_Sub1 method990(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class32 local5 = null;
		if (Static52.aClass61_3 != null) {
			local5 = new Class32(arg0, Static52.aClass61_3, Static100.aClass61Array1[arg0], 1000000);
		}
		return new Class40_Sub1(local5, Static6.aClass32_1, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	public static void method991() {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = -1; local3 < Static78.anInt2246; local3++) {
			if (local3 == -1) {
				local12 = 2047;
			} else {
				local12 = Static101.anIntArray283[local3];
			}
			@Pc(20) Class6_Sub2_Sub3_Sub1_Sub1 local20 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local12];
			if (local20 != null && local20.anInt2733 > 0) {
				local20.anInt2733--;
				if (local20.anInt2733 == 0) {
					local20.aClass55_1155 = null;
				}
			}
		}
		for (local12 = 0; local12 < Static111.anInt3173; local12++) {
			@Pc(64) int local64 = Static19.anIntArray60[local12];
			@Pc(68) Class6_Sub2_Sub3_Sub1_Sub2 local68 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local64];
			if (local68 != null && local68.anInt2733 > 0) {
				local68.anInt2733--;
				if (local68.anInt2733 == 0) {
					local68.aClass55_1155 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method992(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static69.aClass9_1);
		arg0.addMouseMotionListener(Static69.aClass9_1);
		arg0.addFocusListener(Static69.aClass9_1);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BILclient!md;)V")
	public static void method993(@OriginalArg(1) int arg0, @OriginalArg(2) Class40_Sub1 arg1) {
		if (Static75.aClass6_Sub1_3 == null) {
			Static71.method1426(true, null, (byte) 0, 255, 0, 255);
			Static43.aClass40_Sub1Array1[arg0] = arg1;
		} else {
			Static75.aClass6_Sub1_3.anInt2209 = arg0 * 4 + 5;
			@Pc(21) int local21 = Static75.aClass6_Sub1_3.method1503();
			arg1.method1249(local21);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!jd;B)V")
	public static void method994(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub3_Sub1 arg1) {
		Static44.method1825(arg1.anInt2710, arg0, arg1.anInt2744);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lclient!rc;")
	public static Class55 method995() {
		@Pc(13) Class55 local13 = new Class55();
		local13.aByteArray12 = new byte[100];
		local13.anInt2411 = 0;
		return local13;
	}
}
