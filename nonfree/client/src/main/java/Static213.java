import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hea", name = "p", descriptor = "I")
	public static int anInt4041;

	@OriginalMember(owner = "client!hea", name = "r", descriptor = "I")
	public static int anInt4043;

	@OriginalMember(owner = "client!hea", name = "w", descriptor = "I")
	public static int anInt4048;

	@OriginalMember(owner = "client!hea", name = "k", descriptor = "I")
	public static int anInt4036 = 0;

	@OriginalMember(owner = "client!hea", name = "z", descriptor = "[I")
	public static final int[] anIntArray325 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
	public static int anInt4055 = -1;

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "(I)V")
	public static void method3367() {
		for (@Pc(18) Class14_Sub15 local18 = (Class14_Sub15) Static205.aClass187_31.method4079(); local18 != null; local18 = (Class14_Sub15) Static205.aClass187_31.method4084()) {
			if (local18.aClass63_Sub1_1.method1517()) {
				Static107.method1894(local18.anInt2174);
			} else {
				local18.aClass63_Sub1_1.method1535();
				try {
					local18.aClass63_Sub1_1.method1522();
				} catch (@Pc(41) Exception local41) {
					Static524.method7532("TV: " + local18.anInt2174, local41);
					Static107.method1894(local18.anInt2174);
				}
				if (!local18.aBoolean181 && !local18.aBoolean180) {
					@Pc(67) Class14_Sub27_Sub4 local67 = local18.aClass63_Sub1_1.method1521();
					if (local67 != null) {
						@Pc(73) Class14_Sub5_Sub1 local73 = local67.method9055();
						if (local73 != null) {
							local73.method660(local18.anInt2175);
							Static217.aClass14_Sub5_Sub3_1.method6027(local73);
							local18.aBoolean181 = true;
						}
					}
				}
			}
		}
	}
}
