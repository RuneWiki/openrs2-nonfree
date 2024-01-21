import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
	public static int anInt1365;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
	public static int anInt1351 = 0;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "[I")
	public static int[] anIntArray158 = new int[1000];

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
	public static int anInt1353 = 2;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "[Lclient!ae;")
	public static Class5[] aClass5Array10 = new Class5[100];

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
	public static int anInt1355 = 256;

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "[I")
	public static int[] anIntArray159 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "Lclient!ae;")
	public static Class5 aClass5_666 = Static56.method972("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "Lclient!ae;")
	public static Class5 aClass5_667 = Static56.method972("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!jc", name = "L", descriptor = "[I")
	public static int[] anIntArray160 = new int[128];

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "Lclient!ae;")
	public static Class5 aClass5_668 = Static56.method972("Icons redrawn");

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
	public static int anInt1359 = 0;

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
	public static int anInt1360 = 0;

	@OriginalMember(owner = "client!jc", name = "Y", descriptor = "Lclient!ae;")
	public static Class5 aClass5_669 = Static56.method972("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ae;Lclient!bf;BLclient!ae;)Lclient!bb;")
	public static Class3_Sub1_Sub2_Sub1 method900(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(12) int local12 = arg1.method1880(arg0);
		@Pc(22) int local22 = arg1.method1860(local12, arg2);
		return Static92.method1541(local22, local12, arg1);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public static void method901() {
		aClass5_667 = null;
		anIntArray158 = null;
		aClass5_669 = null;
		aClass5_668 = null;
		anIntArray159 = null;
		anIntArray160 = null;
		anIntArray157 = null;
		anIntArray161 = null;
		aClass5Array10 = null;
		aClass5_666 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!kd;III)V")
	public static void method902(@OriginalArg(0) Class3_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0.anInt1536 && arg1 != -1) {
			@Pc(11) int local11 = Static31.method778(arg1).anInt1924;
			if (local11 == 1) {
				arg0.anInt1570 = arg2;
				arg0.anInt1557 = 0;
				arg0.anInt1532 = 0;
				arg0.anInt1573 = 0;
			}
			if (local11 == 2) {
				arg0.anInt1557 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt1536 == -1 || Static31.method778(arg1).anInt1918 >= Static31.method778(arg0.anInt1536).anInt1918) {
			arg0.anInt1570 = arg2;
			arg0.anInt1519 = arg0.anInt1574;
			arg0.anInt1557 = 0;
			arg0.anInt1532 = 0;
			arg0.anInt1573 = 0;
			arg0.anInt1536 = arg1;
		}
	}
}
