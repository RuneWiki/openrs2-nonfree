import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "[Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array10;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "Lclient!va;")
	public static Class2_Sub11 aClass2_Sub11_3;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	public static int anInt983 = 0;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "[I")
	public static int[] anIntArray76 = new int[5];

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Lclient!cd;")
	private static Class10 aClass10_485 = Static51.method932("Existing User");

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Lclient!cd;")
	public static Class10 aClass10_486 = aClass10_485;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
	public static int anInt986 = 0;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Lclient!cd;")
	public static Class10 aClass10_487 = Static51.method932("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public static void method792() {
		aClass10_485 = null;
		aClass10_487 = null;
		aClass2_Sub1_Sub4_Sub3Array10 = null;
		aClass10_486 = null;
		anIntArray76 = null;
		aClass2_Sub11_3 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!kh;ILclient!cd;IIZLclient!cd;)V")
	public static void method793(@OriginalArg(0) Class29 arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(6) Class10 arg2) {
		@Pc(8) int local8 = arg0.method1026(arg2);
		@Pc(18) int local18 = arg0.method1020(local8, arg1);
		Static155.method2397(arg0, local18, 255, local8);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!cd;Lclient!kh;Lclient!cd;)[Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3[] method794(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class29 arg1, @OriginalArg(3) Class10 arg2) {
		@Pc(8) int local8 = arg1.method1026(arg2);
		@Pc(14) int local14 = arg1.method1020(local8, arg0);
		return Static169.method2598(arg1, local14, local8);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[BLclient!ug;B)V")
	public static void method795(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class83 arg2) {
		@Pc(7) Class2_Sub4 local7 = new Class2_Sub4();
		local7.aLong139 = arg0;
		local7.aByteArray6 = arg1;
		local7.anInt496 = 0;
		local7.aClass83_1 = arg2;
		@Pc(22) Class12 local22 = Static34.aClass12_4;
		synchronized (Static34.aClass12_4) {
			Static34.aClass12_4.method382(local7);
		}
		Static130.method2081();
	}
}
