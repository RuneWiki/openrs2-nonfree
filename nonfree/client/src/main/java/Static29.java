import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!bg", name = "A", descriptor = "Z")
	public static boolean aBoolean35 = true;

	@OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
	public static int anInt497 = 1;

	@OriginalMember(owner = "client!bg", name = "F", descriptor = "Lclient!s;")
	public static final Class217 aClass217_19 = new Class217(53, 14);

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
	public static int anInt504 = 765;

	@OriginalMember(owner = "client!bg", name = "T", descriptor = "Lclient!hr;")
	public static final Class111 aClass111_1 = new Class111();

	@OriginalMember(owner = "client!bg", name = "V", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_13 = new Class27(2, 8);

	@OriginalMember(owner = "client!bg", name = "W", descriptor = "[I")
	public static final int[] anIntArray46 = new int[25];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)Lclient!mv;")
	public static Class56_Sub1 method430(@OriginalArg(0) int arg0) {
		return Static162.aBoolean220 && arg0 >= Static42.anInt723 && arg0 <= Static266.anInt4717 ? Static436.aClass56_Sub1Array2[arg0 - Static42.anInt723] : null;
	}
}
