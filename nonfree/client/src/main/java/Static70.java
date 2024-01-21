import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
	public static int anInt1895;

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "[S")
	public static short[] aShortArray69;

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
	public static volatile int anInt1893 = 0;

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "[Lclient!fe;")
	public static Class2_Sub2_Sub1_Sub3[] aClass2_Sub2_Sub1_Sub3Array1 = new Class2_Sub2_Sub1_Sub3[4];

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "Lclient!sg;")
	public static Class77 aClass77_754 = Static146.method2172(" x ");

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "Lclient!sg;")
	public static Class77 aClass77_755 = Static146.method2172("cross");

	@OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
	public static int anInt1900 = 1;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIB)I")
	public static int method1370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = 0;
		while (arg0 > 0) {
			local6 = arg1 & 0x1 | local6 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
	public static void method1371() {
		aShortArrayArray7 = null;
		aClass2_Sub2_Sub1_Sub3Array1 = null;
		aClass77_754 = null;
		aShortArray69 = null;
		aClass77_755 = null;
	}
}
