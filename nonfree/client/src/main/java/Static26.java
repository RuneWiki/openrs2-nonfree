import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray12;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	public static int anInt3836;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	public static int anInt3838;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Lclient!kr;")
	public static Class46 aClass46_11;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_91 = new Class140("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
	public static int method3361() {
		if (Static229.aFrame3 == null) {
			return Static164.aBoolean325 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3363(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub9_Sub4 local8 = Static98.method1971(3, arg1);
		local8.method1801();
		local8.aString16 = arg0;
	}
}
