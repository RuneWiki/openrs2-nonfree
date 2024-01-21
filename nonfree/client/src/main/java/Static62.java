import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!i", name = "I", descriptor = "Lclient!eh;")
	public static Class28 aClass28_564 = Static170.method3101("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!i", name = "K", descriptor = "Lclient!eh;")
	private static Class28 aClass28_565 = Static170.method3101("Your profile will be transferred in:");

	@OriginalMember(owner = "client!i", name = "P", descriptor = "Lclient!eh;")
	public static Class28 aClass28_567 = aClass28_565;

	@OriginalMember(owner = "client!i", name = "X", descriptor = "Lclient!eh;")
	public static Class28 aClass28_568 = Static170.method3101("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!i", name = "Rb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_571 = Static170.method3101("To create a new account you need to");

	@OriginalMember(owner = "client!i", name = "cb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_569 = aClass28_571;

	@OriginalMember(owner = "client!i", name = "Ib", descriptor = "Lclient!eh;")
	public static Class28 aClass28_570 = Static170.method3101("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(Z)V")
	public static void method1457() {
		aClass28_568 = null;
		aClass28_570 = null;
		aClass28_569 = null;
		aClass28_564 = null;
		aClass28_567 = null;
		aClass28_565 = null;
		aClass28_571 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZIILclient!fd;ZIB)V")
	public static void method1459(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5) {
		@Pc(10) long local10 = (long) (arg1 + (arg4 << 16));
		@Pc(16) Class3_Sub2_Sub6 local16 = (Class3_Sub2_Sub6) Static42.aClass87_5.method3201(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub2_Sub6) Static34.aClass87_4.method3201(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub2_Sub6) Static106.aClass87_9.method3201(local10);
		if (local16 == null) {
			if (!arg0) {
				local16 = (Class3_Sub2_Sub6) Static47.aClass87_6.method3201(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class3_Sub2_Sub6();
			local16.aByte2 = arg5;
			local16.aClass7_Sub1_4 = arg3;
			local16.anInt714 = arg2;
			if (arg0) {
				Static42.aClass87_5.method3200(local10, local16);
				Static74.anInt2213++;
			} else {
				Static131.aClass88_2.method3207(local16);
				Static106.aClass87_9.method3200(local10, local16);
				Static75.anInt2242++;
			}
		} else if (arg0) {
			local16.method3174();
			Static42.aClass87_5.method3200(local10, local16);
			Static75.anInt2242--;
			Static74.anInt2213++;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!gf;)Z")
	public static boolean method1463(@OriginalArg(1) Class33 arg0) {
		@Pc(2) int local2 = arg0.anInt1477;
		if (local2 == 205) {
			Static35.anInt1047 = 250;
			return true;
		}
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (local2 >= 300 && local2 <= 313) {
			local27 = (local2 - 300) / 2;
			local31 = local2 & 0x1;
			Static180.aClass76_2.method2964(local31 == 1, local27);
		}
		if (local2 >= 314 && local2 <= 323) {
			local27 = (local2 - 314) / 2;
			local31 = local2 & 0x1;
			Static180.aClass76_2.method2971(local31 == 1, local27);
		}
		if (local2 == 324) {
			Static180.aClass76_2.method2969(false);
		}
		if (local2 == 325) {
			Static180.aClass76_2.method2969(true);
		}
		if (local2 == 326) {
			Static51.aClass3_Sub8_Sub1_2.method1559(203);
			Static180.aClass76_2.method2972(Static51.aClass3_Sub8_Sub1_2);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ah;I)V")
	public static void method1464(@OriginalArg(0) Class7 arg0) {
		Static161.aClass7_63 = arg0;
	}
}
