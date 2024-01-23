import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString33 = "glow1:";

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	public static int anInt1123 = 0;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
	public static int anInt1127 = 0;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	public static int anInt1129 = 2;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public static void method978() {
		Static137.aClass1_Sub14_Sub1_6.method2661(202);
		Static137.aClass1_Sub14_Sub1_6.method2637(Static189.anInt3780);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!qm;II)V")
	public static void method979(@OriginalArg(0) Class22_Sub3_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub10 local15 = (Class1_Sub10) Static263.aClass156_24.method3821((long) arg1);
		if (local15 == null) {
			Static277.method4118(arg0.anIntArray427[0], null, Static295.anInt5586, arg0.anIntArray424[0], arg1, null, 0, arg0);
		} else {
			local15.method873();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lclient!rn;")
	public static Class1_Sub1_Sub20 method981(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub20 local10 = (Class1_Sub1_Sub20) Static241.aClass58_13.method1233((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 >= 32768) {
			local25 = Static49.aClass138_10.method3346(1, arg0 & 0x7FFF);
		} else {
			local25 = Static271.aClass138_73.method3346(1, arg0);
		}
		local10 = new Class1_Sub1_Sub20();
		if (local25 != null) {
			local10.method3810(new Class1_Sub14(local25));
		}
		if (arg0 >= 32768) {
			local10.method3806();
		}
		Static241.aClass58_13.method1229((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)V")
	public static void method982(@OriginalArg(1) boolean arg0) {
		@Pc(6) Class1_Sub10 local6;
		for (local6 = (Class1_Sub10) Static232.aClass24_20.method460(); local6 != null; local6 = (Class1_Sub10) Static232.aClass24_20.method464()) {
			if (local6.aClass1_Sub4_Sub1_2 != null) {
				Static303.aClass1_Sub4_Sub2_2.method774(local6.aClass1_Sub4_Sub1_2);
				local6.aClass1_Sub4_Sub1_2 = null;
			}
			if (local6.aClass1_Sub4_Sub1_1 != null) {
				Static303.aClass1_Sub4_Sub2_2.method774(local6.aClass1_Sub4_Sub1_1);
				local6.aClass1_Sub4_Sub1_1 = null;
			}
			local6.method4616();
		}
		if (!arg0) {
			return;
		}
		for (local6 = (Class1_Sub10) Static213.aClass24_22.method460(); local6 != null; local6 = (Class1_Sub10) Static213.aClass24_22.method464()) {
			if (local6.aClass1_Sub4_Sub1_2 != null) {
				Static303.aClass1_Sub4_Sub2_2.method774(local6.aClass1_Sub4_Sub1_2);
				local6.aClass1_Sub4_Sub1_2 = null;
			}
			local6.method4616();
		}
		for (local6 = (Class1_Sub10) Static263.aClass156_24.method3822(); local6 != null; local6 = (Class1_Sub10) Static263.aClass156_24.method3820()) {
			if (local6.aClass1_Sub4_Sub1_2 != null) {
				Static303.aClass1_Sub4_Sub2_2.method774(local6.aClass1_Sub4_Sub1_2);
				local6.aClass1_Sub4_Sub1_2 = null;
			}
			local6.method4616();
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
	public static void method983() {
		Static146.aClass1_Sub1_Sub16_4 = null;
		Static245.aClass1_Sub1_Sub16_3 = null;
		Static242.aClass1_Sub1_Sub16_7 = null;
		Static16.aClass1_Sub1_Sub16_1 = null;
	}
}
