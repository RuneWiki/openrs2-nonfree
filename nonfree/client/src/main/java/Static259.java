import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "Lclient!ft;")
	public static final Class107 aClass107_3 = new Class107();

	@OriginalMember(owner = "client!kt", name = "w", descriptor = "Lclient!kj;")
	public static final Class1_Sub17_Sub2 aClass1_Sub17_Sub2_1 = new Class1_Sub17_Sub2(5000);

	@OriginalMember(owner = "client!kt", name = "x", descriptor = "Z")
	public static boolean aBoolean375 = false;

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "Lclient!jc;")
	public static final Class147 aClass147_1 = new Class147();

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
	public static int anInt5037 = -1;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4668(@OriginalArg(1) String arg0) {
		return Static176.method3268(cv.class, arg0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BI)I")
	public static int method4669(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(III)Lclient!bq;")
	public static Class20_Sub2 method4671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub2_2;
	}
}
