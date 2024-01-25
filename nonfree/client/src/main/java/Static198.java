import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static198 {

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_1 = new Class146(0, Static582.aClass335_17, Static582.aClass335_17, 0, 1);

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_2 = new Class146(1, Static582.aClass335_17, 2);

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_3 = new Class146(2, Static582.aClass335_17, Static582.aClass335_17, 2, 3);

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_4 = new Class146(3, Static582.aClass335_17, 3);

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_5 = new Class146(4, Static582.aClass335_17, Static582.aClass335_17, 3, 4);

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_6 = new Class146(5, Static582.aClass335_17, 4);

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_7 = new Class146(6, Static582.aClass335_17, 4);

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_8 = new Class146(7, Static582.aClass335_17, Static582.aClass335_17, 4, 5);

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_9 = new Class146(8, Static582.aClass335_17, Static582.aClass335_17, 5, 98, true, true);

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_10 = new Class146(9, Static582.aClass335_17, 99);

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_11 = new Class146(10, Static582.aClass335_17, 100);

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_12 = new Class146(11, Static582.aClass335_18, Static582.aClass335_18, 0, 92, true, true);

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_13 = new Class146(12, Static582.aClass335_18, Static582.aClass335_18, 92, 92);

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "Lclient!gl;")
	private static final Class146 aClass146_14 = new Class146(13, Static582.aClass335_18, Static582.aClass335_18, 92, 93);

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_15 = new Class146(14, Static582.aClass335_18, Static582.aClass335_18, 94, 95);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_16 = new Class146(15, Static582.aClass335_18, Static582.aClass335_18, 96, 97);

	@OriginalMember(owner = "client!gl", name = "E", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_17 = new Class146(16, Static582.aClass335_18, 97);

	@OriginalMember(owner = "client!gl", name = "C", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_18 = new Class146(17, Static582.aClass335_18, 97);

	@OriginalMember(owner = "client!gl", name = "v", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_19 = new Class146(18, Static582.aClass335_18, 100);

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_20 = new Class146(19, Static582.aClass335_18, 100);

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "Lclient!gl;")
	public static final Class146 aClass146_21 = new Class146(20, Static582.aClass335_18, 100);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
	public static void method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static127.anIntArrayArray14 != null) {
			Static127.anIntArrayArray14[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static104.aShortArrayArray3 != null) {
			Static104.aShortArrayArray3[arg0][arg1] = (short) arg3;
		}
		if (Static193.aByteArrayArray26 != null) {
			Static193.aByteArrayArray26[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2857(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)[Lclient!gl;")
	public static Class146[] method2858() {
		return new Class146[] { aClass146_1, aClass146_2, aClass146_3, aClass146_4, aClass146_5, aClass146_6, aClass146_7, aClass146_8, aClass146_9, aClass146_10, aClass146_11, aClass146_12, aClass146_13, aClass146_14, aClass146_15, aClass146_16, aClass146_17, aClass146_18, aClass146_19, aClass146_20, aClass146_21 };
	}
}
