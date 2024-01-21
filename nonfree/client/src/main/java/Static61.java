import java.awt.Component;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_15;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
	public static int anInt1559;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	public static int anInt1552 = 0;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	public static int anInt1556 = 0;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "[I")
	public static int[] anIntArray175 = new int[32768];

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "Lclient!r;")
	public static Class5_Sub11_Sub1 aClass5_Sub11_Sub1_8 = new Class5_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "Lclient!vc;")
	public static Class71 aClass71_790 = Static38.method736("Einloggen");

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "Lclient!ga;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "Lclient!vc;")
	public static Class71 aClass71_791 = Static38.method736("welle:");

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	public static int anInt1564 = 0;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "Lclient!rb;")
	public static Class57 aClass57_9 = new Class57(4096);

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "[I")
	public static int[] anIntArray176 = new int[5];

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "[I")
	public static int[] anIntArray177 = new int[5];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method1042() {
		if (Static24.anInt734 > 0) {
			Static66.method1134();
		} else {
			Static27.method571(40);
			Static27.aClass35_1 = Static58.aClass35_2;
			Static58.aClass35_2 = null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method1043(@OriginalArg(1) Component arg0) {
		@Pc(10) Method local10 = Static43.aMethod2;
		if (local10 != null) {
			try {
				local10.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		arg0.addKeyListener(Static66.aClass40_1);
		arg0.addFocusListener(Static66.aClass40_1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI)V")
	public static void method1044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class5_Sub1_Sub3 local7 = Static89.method1406(arg0);
		@Pc(10) int local10 = local7.anInt274;
		@Pc(19) int local19 = local7.anInt267;
		@Pc(22) int local22 = local7.anInt271;
		@Pc(28) int local28 = Class36.anIntArray159[local19 - local22];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local22;
		Static23.anIntArray87[local10] = ~local28 & Static23.anIntArray87[local10] | arg1 << local22 & local28;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZB)V")
	public static void method1045(@OriginalArg(0) boolean arg0) {
		Static21.anInt700++;
		if (Static21.anInt700 < 50 && !arg0) {
			return;
		}
		Static21.anInt700 = 0;
		if (Static114.aBoolean120 || Static58.aClass35_2 == null) {
			return;
		}
		aClass5_Sub11_Sub1_8.method1553(128);
		try {
			Static58.aClass35_2.method967(aClass5_Sub11_Sub1_8.anInt2233, aClass5_Sub11_Sub1_8.aByteArray23);
			aClass5_Sub11_Sub1_8.anInt2233 = 0;
		} catch (@Pc(48) IOException local48) {
			Static114.aBoolean120 = true;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method1047() {
		anIntArray176 = null;
		anIntArray177 = null;
		anIntArray175 = null;
		aClass5_Sub11_Sub1_8 = null;
		aClass5_Sub1_Sub10_Sub1_15 = null;
		aClass71_791 = null;
		aClass57_9 = null;
		aClass71_790 = null;
	}
}
