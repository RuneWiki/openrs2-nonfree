import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!th", name = "I", descriptor = "Lclient!cp;")
	public static final Class44 aClass44_32 = new Class44(16);

	@OriginalMember(owner = "client!th", name = "pb", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_83 = new Class57("K", "T", "K", "K");

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method5071(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public static void method5075() {
		@Pc(7) int local7 = Static366.anInt4870;
		@Pc(9) int[] local9 = Static3.anIntArray9;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class28_Sub1_Sub1_Sub2 local19 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null) {
				Static272.method4270(local19.method4009(), local19);
			}
		}
	}
}
