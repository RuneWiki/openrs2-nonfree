import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_89 = new Class263(26, 12);

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "[I")
	public static final int[] anIntArray392 = new int[32];

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
	public static int anInt4108 = 0;

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "[I")
	public static final int[] anIntArray393 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "[I")
	public static final int[] anIntArray394 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!jr", name = "x", descriptor = "Lclient!nj;")
	public static final Class1_Sub29 aClass1_Sub29_2 = new Class1_Sub29(0, -1);

	@OriginalMember(owner = "client!jr", name = "A", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_90 = new Class263(54, 12);

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBI)Z")
	public static boolean method3202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static140.method2263(arg1, arg0) || Static132.method2165(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static427.method5765(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZI)Lclient!bs;")
	public static Class37 method3203(@OriginalArg(1) int arg0) {
		@Pc(11) Class37[] local11 = Static97.method1688();
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(18) Class37 local18 = local11[local13];
			if (local18.anInt1012 == arg0) {
				return local18;
			}
		}
		return null;
	}
}
