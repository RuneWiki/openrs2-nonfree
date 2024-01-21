import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!rd;")
	public static Class64 aClass64_482 = Static69.method1153("::");

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_483 = Static69.method1153("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!rd;")
	private static Class64 aClass64_484 = Static69.method1153("Ok");

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!rd;")
	public static Class64 aClass64_485 = Static69.method1153("Aus");

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_486 = Static69.method1153("Fertigkeit)2");

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	public static int anInt787 = 0;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public static int anInt788 = -1;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!rd;")
	public static Class64 aClass64_487 = aClass64_484;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lclient!le;")
	public static Class1_Sub1_Sub9 method540(@OriginalArg(0) int arg0) {
		@Pc(19) Class1_Sub1_Sub9 local19 = (Class1_Sub1_Sub9) Static103.aClass19_91.method410((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(29) byte[] local29 = Static84.aClass41_45.method1062(5, arg0);
		local19 = new Class1_Sub1_Sub9();
		if (local29 != null) {
			local19.method1128(new Class1_Sub6(local29));
		}
		Static103.aClass19_91.method409(local19, (long) arg0);
		return local19;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!g;ZZ)Z")
	public static boolean method542(@OriginalArg(1) Class28 arg0, @OriginalArg(2) boolean arg1) {
		return Static87.method1433(arg0, arg1);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method543() {
		Static49.aClass50_6 = new Class50();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)I")
	public static int method544(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public static void method545() {
		if (Static79.aClass17_1 == null) {
			return;
		}
		if (Static28.anInt2362 >= 0) {
			if (Static90.anInt560 > 0) {
				Static103.anInt2331 += Static105.anInt2464;
				Static79.aClass17_1.method2000(Static103.anInt2331, Static28.anInt2362);
				Static90.anInt560--;
				if (Static90.anInt560 == 0) {
					Static79.aClass17_1.method2001();
					Static28.anInt2362 = -1;
					Static90.anInt560 = 20;
				}
			}
		} else if (Static90.anInt560 > 0) {
			Static90.anInt560--;
			if (Static90.anInt560 == 0) {
				if (Static53.aByteArray9 == null) {
					Static79.aClass17_1.method2009(256);
				} else {
					Static79.aClass17_1.method2009(Static15.anInt472);
					Static28.anInt2362 = Static15.anInt472;
					Static79.aClass17_1.method2007(Static17.aBoolean39, Static15.anInt472, Static53.aByteArray9);
					Static53.aByteArray9 = null;
				}
				Static103.anInt2331 = 0;
			}
		}
		Static79.aClass17_1.method2004();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method546() {
		aClass64_482 = null;
		aClass64_486 = null;
		aClass64_487 = null;
		aClass64_485 = null;
		aClass64_483 = null;
		aClass64_484 = null;
	}
}
