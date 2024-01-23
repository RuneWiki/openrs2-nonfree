import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "Lclient!in;")
	public static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "Lclient!ed;")
	public static Class1_Sub1_Sub8 aClass1_Sub1_Sub8_3;

	@OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
	public static int anInt4211;

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "Z")
	public static boolean aBoolean287 = false;

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35 = new String[500];

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray44 = new boolean[100];

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
	public static int anInt4207 = -2;

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "Lclient!bo;")
	public static Class24 aClass24_22 = new Class24();

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3383(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < Static175.anInt3635; local12++) {
			if (arg0.equalsIgnoreCase(Static279.aStringArray44[local12])) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)I")
	public static int method3385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = 0;
		while (arg0 > 0) {
			arg0--;
			local11 = arg1 & 0x1 | local11 << 1;
			arg1 >>>= 0x1;
		}
		return local11;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)I")
	public static int method3386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)V")
	public static void method3387(@OriginalArg(0) int arg0) {
		Static299.anInt5666 = -1;
		Static283.anInt5402 = arg0;
		Static314.anInt5911 = 100;
		Static137.anInt2704 = 3;
	}
}
