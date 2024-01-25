import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "Lclient!vo;")
	public static Class348 aClass348_21;

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
	public static int anInt1292 = 0;

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "[I")
	public static final int[] anIntArray32 = new int[8];

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)Z")
	public static boolean method1106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static235.method3839(arg1, arg0) || Static232.method3760(arg0, arg1);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lclient!vfa;")
	public static Class4_Sub6_Sub19 method1108(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub6_Sub19 local10 = (Class4_Sub6_Sub19) Static365.aClass340_3.method7723((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static75.aClass348_26.method7964(0, arg0);
		if (local27 == null || local27.length <= 1) {
			return null;
		}
		try {
			local10 = Static218.method3528(local27);
		} catch (@Pc(43) Exception local43) {
			throw new RuntimeException(local43.getMessage() + " S: " + arg0);
		}
		Static365.aClass340_3.method7724((long) arg0, local10);
		return local10;
	}
}
