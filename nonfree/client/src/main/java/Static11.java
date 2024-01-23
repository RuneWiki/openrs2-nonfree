import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "Lclient!te;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "[Lclient!te;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "Lclient!ia;")
	public static Class51 aClass51_73 = Static64.method1101(")4l=");

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Lclient!ie;")
	public static Class53 aClass53_1 = new Class53(64);

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
	public static int anInt235 = 0;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "Lclient!ia;")
	public static Class51 aClass51_74 = Static64.method1101("Spielwelt erstellt)3");

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
	public static int anInt236 = 0;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[2][][];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!mb;Lclient!mb;Lclient!mb;I)V")
	public static void method163(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Class70 arg2) {
		Static103.aClass70_46 = arg2;
		Static139.aClass70_30 = arg0;
		Static146.aClass70_14 = arg1;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)Lclient!oa;")
	public static Class76 method164() {
		try {
			return (Class76) Class.forName("Class76_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)I")
	public static int method167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 >>> 31;
		return (arg0 + local3) / arg1 - local3;
	}
}
