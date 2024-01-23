import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
	public static int anInt3072;

	@OriginalMember(owner = "client!kk", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString179 = "Loading config - ";

	@OriginalMember(owner = "client!kk", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString180 = "Please wait...";

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "()V")
	public static void method2365() {
		for (@Pc(1) int local1 = 0; local1 < Static199.anInt4060; local1++) {
			@Pc(8) Class25 local8 = Static82.aClass25Array2[local1];
			Static181.method3040(local8);
			Static82.aClass25Array2[local1] = null;
		}
		Static199.anInt4060 = 0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
	public static void method2367() {
		Static131.method2228(false);
		System.gc();
		Static163.method2823(25);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(BI)V")
	public static void method2368(@OriginalArg(1) int arg0) {
		@Pc(19) Class1_Sub33 local19 = (Class1_Sub33) Static160.aClass70_9.method2075((long) arg0);
		if (local19 != null) {
			for (@Pc(26) int local26 = 0; local26 < local19.anIntArray505.length; local26++) {
				local19.anIntArray505[local26] = -1;
				local19.anIntArray507[local26] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZII)V")
	public static void method2371(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static184.anInt3815 * arg0 >> 8;
		if (arg1 == -1 && !Static142.aBoolean225) {
			Static224.method3521();
		} else if (arg1 != -1 && (arg1 != Static270.anInt5276 || !Static7.method1806()) && local14 != 0 && !Static142.aBoolean225) {
			Static113.method2071(local14, arg1, Static197.aClass91_152);
		}
		Static270.anInt5276 = arg1;
	}
}
