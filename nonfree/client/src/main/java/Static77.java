import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!qb;")
	public static Class58 aClass58_4;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public static int anInt1961;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!v;")
	public static Class76 aClass76_832 = Static134.method2017(":trade:");

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	public static int anInt1960 = 0;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!v;")
	private static Class76 aClass76_836 = Static134.method2017("Could not complete login)3");

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!v;")
	public static Class76 aClass76_833 = aClass76_836;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!v;")
	public static Class76 aClass76_834 = Static134.method2017("Lade Texturen )2 ");

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!v;")
	public static Class76 aClass76_835 = Static134.method2017(")4l");

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!dd;")
	public static Class4_Sub8 aClass4_Sub8_12 = null;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "[I")
	public static int[] anIntArray264 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method1393() {
		aClass76_835 = null;
		anIntArray264 = null;
		aClass76_833 = null;
		aClass76_834 = null;
		aClass76_832 = null;
		aClass58_4 = null;
		aClass4_Sub8_12 = null;
		aClass76_836 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lclient!be;")
	public static Class4_Sub4_Sub1 method1394(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub4_Sub1 local12 = (Class4_Sub4_Sub1) Static68.aClass72_19.method1781((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static120.aClass17_39.method290(1, arg0);
		local12 = new Class4_Sub4_Sub1();
		if (local22 != null) {
			local12.method139(arg0, new Class4_Sub10(local22));
		}
		local12.method140();
		Static68.aClass72_19.method1783(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!v;)V")
	public static void method1395(@OriginalArg(1) Class76 arg0) {
		if (Static27.aClass4_Sub22Array62 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = arg0.method1872();
		if (local14 == 0L) {
			return;
		}
		while (local10 < Static27.aClass4_Sub22Array62.length && Static27.aClass4_Sub22Array62[local10].aLong99 != local14) {
			local10++;
		}
		if (local10 < Static27.aClass4_Sub22Array62.length && Static27.aClass4_Sub22Array62[local10] != null) {
			Static69.aClass4_Sub10_Sub1_2.method611(23);
			Static69.aClass4_Sub10_Sub1_2.method555(Static27.aClass4_Sub22Array62[local10].aLong99);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!dd;B)Lclient!dd;")
	public static Class4_Sub8 method1396(@OriginalArg(0) Class4_Sub8 arg0) {
		@Pc(10) Class4_Sub8 local10 = Static84.method1426(arg0);
		if (local10 == null) {
			local10 = arg0.aClass4_Sub8_6;
		}
		return local10;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIILclient!v;)V")
	public static void method1397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class76 arg3) {
		@Pc(4) Class4_Sub8 local4 = Static62.method1079(arg0, arg1);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray23 != null) {
			@Pc(18) Class4_Sub20 local18 = new Class4_Sub20();
			local18.anObjectArray28 = local4.anObjectArray23;
			local18.aClass76_1058 = arg3;
			local18.aClass4_Sub8_14 = local4;
			local18.anInt2298 = arg2;
			Static20.method307(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local4.anInt458 > 0) {
			local36 = Static78.method1406(local4);
		}
		if (!local36 || !Static104.method1602(arg2 - 1, Static35.method627(local4))) {
			return;
		}
		if (arg2 == 1) {
			Static69.aClass4_Sub10_Sub1_2.method611(162);
			Static69.aClass4_Sub10_Sub1_2.method597(arg1);
			Static69.aClass4_Sub10_Sub1_2.method575(arg0);
		}
		if (arg2 == 2) {
			Static69.aClass4_Sub10_Sub1_2.method611(153);
			Static69.aClass4_Sub10_Sub1_2.method597(arg1);
			Static69.aClass4_Sub10_Sub1_2.method575(arg0);
		}
		if (arg2 == 3) {
			Static69.aClass4_Sub10_Sub1_2.method611(251);
			Static69.aClass4_Sub10_Sub1_2.method597(arg1);
			Static69.aClass4_Sub10_Sub1_2.method575(arg0);
		}
		if (arg2 == 4) {
			Static69.aClass4_Sub10_Sub1_2.method611(60);
			Static69.aClass4_Sub10_Sub1_2.method597(arg1);
			Static69.aClass4_Sub10_Sub1_2.method575(arg0);
		}
		if (arg2 == 5) {
			Static69.aClass4_Sub10_Sub1_2.method611(170);
			Static69.aClass4_Sub10_Sub1_2.method597(arg1);
			Static69.aClass4_Sub10_Sub1_2.method575(arg0);
		}
		if (arg2 == 6) {
			Static69.aClass4_Sub10_Sub1_2.method611(180);
			Static69.aClass4_Sub10_Sub1_2.method597(arg1);
			Static69.aClass4_Sub10_Sub1_2.method575(arg0);
		}
		if (arg2 == 7) {
			Static69.aClass4_Sub10_Sub1_2.method611(31);
			Static69.aClass4_Sub10_Sub1_2.method597(arg1);
			Static69.aClass4_Sub10_Sub1_2.method575(arg0);
		}
		if (arg2 == 8) {
			Static69.aClass4_Sub10_Sub1_2.method611(28);
			Static69.aClass4_Sub10_Sub1_2.method597(arg1);
			Static69.aClass4_Sub10_Sub1_2.method575(arg0);
		}
		if (arg2 == 9) {
			Static69.aClass4_Sub10_Sub1_2.method611(160);
			Static69.aClass4_Sub10_Sub1_2.method597(arg1);
			Static69.aClass4_Sub10_Sub1_2.method575(arg0);
		}
		if (arg2 == 10) {
			Static69.aClass4_Sub10_Sub1_2.method611(132);
			Static69.aClass4_Sub10_Sub1_2.method597(arg1);
			Static69.aClass4_Sub10_Sub1_2.method575(arg0);
		}
	}
}
