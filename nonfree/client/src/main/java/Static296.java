import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!jw", name = "z", descriptor = "I")
	public static int anInt4682;

	@OriginalMember(owner = "client!jw", name = "D", descriptor = "I")
	public static int anInt4684;

	@OriginalMember(owner = "client!jw", name = "G", descriptor = "I")
	public static int anInt4685;

	@OriginalMember(owner = "client!jw", name = "x", descriptor = "I")
	public static int anInt4681 = 0;

	@OriginalMember(owner = "client!jw", name = "L", descriptor = "[S")
	private static final short[] aShortArray67 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!jw", name = "A", descriptor = "[S")
	private static final short[] aShortArray65 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!jw", name = "F", descriptor = "[S")
	public static final short[] aShortArray66 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!jw", name = "M", descriptor = "[S")
	private static final short[] aShortArray68 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!jw", name = "y", descriptor = "[[S")
	public static final short[][] aShortArrayArray10 = new short[][] { aShortArray67, aShortArray65, aShortArray66, aShortArray68 };

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(Z)Lclient!ke;")
	public static Class4_Sub30 method4193() {
		if (Static154.aClass163_6 == null || Static49.aClass232_1 == null) {
			return null;
		}
		for (@Pc(21) Class4_Sub30 local21 = (Class4_Sub30) Static49.aClass232_1.method4932(); local21 != null; local21 = (Class4_Sub30) Static49.aClass232_1.method4932()) {
			@Pc(29) Class259 local29 = Static154.aClass59_2.method1798(local21.anInt4794);
			if (local29 != null && local29.aBoolean513 && local29.method5863(Static154.anInterface4_2)) {
				return local21;
			}
		}
		return null;
	}
}
