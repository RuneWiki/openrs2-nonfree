import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "[I")
	public static int[] anIntArray295;

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "[I")
	public static int[] anIntArray296;

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
	public static int anInt1794;

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "[I")
	public static int[] anIntArray294 = new int[100];

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "Lclient!af;")
	public static Class5 aClass5_890 = Static45.method1937("(Y");

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "Lclient!af;")
	public static Class5 aClass5_891 = Static45.method1937("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "[I")
	public static int[] anIntArray297 = new int[50];

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
	public static int anInt1795 = 0;

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "Lclient!af;")
	public static Class5 aClass5_892 = Static45.method1937("Hier wechseln");

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
	public static int anInt1797 = 99;

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "Lclient!af;")
	public static Class5 aClass5_893 = Static45.method1937("<col=c0ff00>");

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method1313() {
		aClass5_893 = null;
		aClass5_890 = null;
		anIntArray296 = null;
		anIntArray294 = null;
		anIntArray295 = null;
		aClass5_891 = null;
		aClass5_892 = null;
		anIntArray297 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IJ)Lclient!af;")
	public static Class5 method1314(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local29++;
			}
			@Pc(50) byte[] local50 = new byte[local29];
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local29--;
				local50[local29] = Static119.aByteArray37[(int) (local54 - arg0 * 37L)];
			}
			@Pc(81) Class5 local81 = new Class5();
			local81.aByteArray2 = local50;
			local81.anInt178 = local50.length;
			return local81;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIILclient!af;)V")
	public static void method1315(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3) {
		@Pc(8) Class1_Sub17 local8 = Static18.method2150(arg0, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray18 != null) {
			@Pc(18) Class1_Sub6 local18 = new Class1_Sub6();
			local18.aClass1_Sub17_26 = local8;
			local18.anInt984 = arg2;
			local18.anObjectArray1 = local8.anObjectArray18;
			local18.aClass5_461 = arg3;
			Static71.method1228(local18);
		}
		@Pc(41) boolean local41 = true;
		if (local8.anInt2291 > 0) {
			local41 = Static100.method1697(local8);
		}
		if (!local41 || !Static32.method656(Static6.method221(local8), arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static44.aClass1_Sub20_Sub1_1.method2108(219);
			Static44.aClass1_Sub20_Sub1_1.method2092(arg0);
			Static44.aClass1_Sub20_Sub1_1.method2055(arg1);
		}
		if (arg2 == 2) {
			Static44.aClass1_Sub20_Sub1_1.method2108(228);
			Static44.aClass1_Sub20_Sub1_1.method2092(arg0);
			Static44.aClass1_Sub20_Sub1_1.method2055(arg1);
		}
		if (arg2 == 3) {
			Static44.aClass1_Sub20_Sub1_1.method2108(122);
			Static44.aClass1_Sub20_Sub1_1.method2092(arg0);
			Static44.aClass1_Sub20_Sub1_1.method2055(arg1);
		}
		if (arg2 == 4) {
			Static44.aClass1_Sub20_Sub1_1.method2108(121);
			Static44.aClass1_Sub20_Sub1_1.method2092(arg0);
			Static44.aClass1_Sub20_Sub1_1.method2055(arg1);
		}
		if (arg2 == 5) {
			Static44.aClass1_Sub20_Sub1_1.method2108(149);
			Static44.aClass1_Sub20_Sub1_1.method2092(arg0);
			Static44.aClass1_Sub20_Sub1_1.method2055(arg1);
		}
		if (arg2 == 6) {
			Static44.aClass1_Sub20_Sub1_1.method2108(83);
			Static44.aClass1_Sub20_Sub1_1.method2092(arg0);
			Static44.aClass1_Sub20_Sub1_1.method2055(arg1);
		}
		if (arg2 == 7) {
			Static44.aClass1_Sub20_Sub1_1.method2108(64);
			Static44.aClass1_Sub20_Sub1_1.method2092(arg0);
			Static44.aClass1_Sub20_Sub1_1.method2055(arg1);
		}
		if (arg2 == 8) {
			Static44.aClass1_Sub20_Sub1_1.method2108(250);
			Static44.aClass1_Sub20_Sub1_1.method2092(arg0);
			Static44.aClass1_Sub20_Sub1_1.method2055(arg1);
		}
		if (arg2 == 9) {
			Static44.aClass1_Sub20_Sub1_1.method2108(236);
			Static44.aClass1_Sub20_Sub1_1.method2092(arg0);
			Static44.aClass1_Sub20_Sub1_1.method2055(arg1);
		}
		if (arg2 == 10) {
			Static44.aClass1_Sub20_Sub1_1.method2108(98);
			Static44.aClass1_Sub20_Sub1_1.method2092(arg0);
			Static44.aClass1_Sub20_Sub1_1.method2055(arg1);
		}
	}
}
