import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "Lclient!df;")
	public static Class1_Sub3_Sub5 aClass1_Sub3_Sub5_1;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "J")
	public static long aLong112 = 0L;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Z")
	public static boolean aBoolean229 = false;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString213 = "wave2:";

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public static void method2559(@OriginalArg(0) int arg0) {
		Static302.anInt5981 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static90.anInt2091; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static77.anInt1766; local8++) {
				if (Static7.aClass1_Sub2ArrayArrayArray1[arg0][local3][local8] == null) {
					Static7.aClass1_Sub2ArrayArrayArray1[arg0][local3][local8] = new Class1_Sub2(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I")
	public static int method2561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
