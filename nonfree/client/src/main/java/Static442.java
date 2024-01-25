import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!qs", name = "O", descriptor = "[[I")
	public static int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!qs", name = "M", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_80 = new Class344(59, 3);

	@OriginalMember(owner = "client!qs", name = "P", descriptor = "[I")
	public static final int[] anIntArray491 = new int[2048];

	@OriginalMember(owner = "client!qs", name = "R", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_81 = new Class344(44, 3);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BI)Lclient!vp;")
	public static Class222_Sub1 method6524(@OriginalArg(1) int arg0) {
		return Static543.aBoolean666 && Static239.anInt5018 <= arg0 && Static403.anInt7841 >= arg0 ? Static481.aClass222_Sub1Array2[arg0 - Static239.anInt5018] : null;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)I")
	public static int method6525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 - 1 & arg0 >> 31;
		return local11 + ((arg0 >>> 31) + arg0) % arg1;
	}
}
