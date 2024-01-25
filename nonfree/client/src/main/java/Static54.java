import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
	public static int anInt805;

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_15 = new Class359(8, -1);

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "[J")
	public static final long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
	public static int anInt802 = -1;

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "[Lclient!jba;")
	public static final Class175[] aClass175Array1 = new Class175[14];

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)Z")
	public static boolean method711(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method713(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class5_Sub3_Sub17 local14 = Static358.method5408(3, (long) arg1);
		local14.method7286();
		local14.aString82 = arg0;
	}
}
