import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "[Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2[] aClass4_Sub4_Sub5_Sub2Array14;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array7 = new Class76[1000];

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
	public static int[] anIntArray108 = new int[500];

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Lclient!ua;")
	public static Class72 aClass72_15 = new Class72(30);

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "Lclient!v;")
	private static Class76 aClass76_415 = Static134.method2017("Take");

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "Lclient!v;")
	public static Class76 aClass76_412 = aClass76_415;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "Lclient!v;")
	public static Class76 aClass76_413 = Static134.method2017("Passwort: ");

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "Lclient!v;")
	public static Class76 aClass76_414 = Static134.method2017("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
	public static int anInt981 = -1;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array8 = new Class76[100];

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "Lclient!gf;")
	public static Class28 aClass28_2 = new Class28(4096);

	@OriginalMember(owner = "client!ff", name = "E", descriptor = "Lclient!v;")
	private static Class76 aClass76_416 = Static134.method2017("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "Lclient!v;")
	public static Class76 aClass76_417 = aClass76_416;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
	public static void method621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class4_Sub4_Sub15 local9 = Static67.method1134(arg0);
		@Pc(12) int local12 = local9.anInt2273;
		@Pc(15) int local15 = local9.anInt2272;
		@Pc(18) int local18 = local9.anInt2274;
		@Pc(25) int local25 = Class1.anIntArray1[local18 - local12];
		if (arg1 < 0 || local25 < arg1) {
			arg1 = 0;
		}
		local25 <<= local12;
		Static124.anIntArray393[local15] = ~local25 & Static124.anIntArray393[local15] | local25 & arg1 << local12;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)V")
	public static void method622(@OriginalArg(0) boolean arg0) {
		Static20.method310();
		Static8.anInt166++;
		if (Static8.anInt166 < 50 && !arg0) {
			return;
		}
		Static8.anInt166 = 0;
		if (Static24.aBoolean43 || Static48.aClass75_4 == null) {
			return;
		}
		Static69.aClass4_Sub10_Sub1_2.method611(25);
		try {
			Static48.aClass75_4.method1849(Static69.aClass4_Sub10_Sub1_2.anInt931, Static69.aClass4_Sub10_Sub1_2.aByteArray17);
			Static69.aClass4_Sub10_Sub1_2.anInt931 = 0;
		} catch (@Pc(49) IOException local49) {
			Static24.aBoolean43 = true;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!ne;)V")
	public static void method626(@OriginalArg(1) Class4_Sub10 arg0) {
		if (Static69.aClass68_9 != null) {
			try {
				Static69.aClass68_9.method1685(0L);
				Static69.aClass68_9.method1682(arg0.anInt931, arg0.aByteArray17, 24);
			} catch (@Pc(20) Exception local20) {
			}
		}
		arg0.anInt931 += 24;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!dd;I)I")
	public static int method627(@OriginalArg(0) Class4_Sub8 arg0) {
		@Pc(17) Class4_Sub3 local17 = (Class4_Sub3) Static114.aClass28_11.method770((long) arg0.anInt466 + ((long) arg0.anInt514 << 32));
		return local17 == null ? arg0.anInt479 : local17.anInt162;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public static void method632() {
		aClass76_413 = null;
		aClass76_415 = null;
		aClass76_417 = null;
		aClass28_2 = null;
		aClass76_414 = null;
		aClass76Array7 = null;
		anIntArray108 = null;
		aClass76_412 = null;
		aClass76Array8 = null;
		aClass72_15 = null;
		aClass76_416 = null;
		aClass4_Sub4_Sub5_Sub2Array14 = null;
	}
}
