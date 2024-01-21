import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "[Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3[] aClass1_Sub1_Sub8_Sub3Array1;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!ea;")
	private static Class18 aClass18_69 = Static8.method128("Drop");

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_66 = aClass18_69;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!ea;")
	public static Class18 aClass18_68 = Static8.method128("mapback");

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "Lclient!ea;")
	public static Class18 aClass18_70 = Static8.method128("Lade Texturen )2 ");

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
	public static int anInt151 = 500;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "[Lclient!ud;")
	public static Class78[] aClass78Array1 = new Class78[50];

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
	public static int anInt152 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)Z")
	public static boolean method85(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public static void method86() {
		Static168.aClass50_1.method2977();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static21.aLongArray2[local15] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static3.aLongArray1[local27] = 0L;
		}
		Static107.anInt3145 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!dd;I)V")
	public static void method87(@OriginalArg(0) Class16 arg0) {
		Static60.aClass16_7 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(Z)V")
	public static void method88() {
		aClass18_69 = null;
		aClass1_Sub1_Sub8_Sub3Array1 = null;
		aClass18_70 = null;
		aClass18_66 = null;
		Class1_Sub2.anIntArray6 = null;
		aClass78Array1 = null;
		aClass18_68 = null;
	}
}
