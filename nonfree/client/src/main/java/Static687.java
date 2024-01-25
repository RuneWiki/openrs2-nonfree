import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static687 {

	@OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
	public static int anInt10575;

	@OriginalMember(owner = "client!vn", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!vn", name = "L", descriptor = "[I")
	public static final int[] anIntArray737 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZZ)Z")
	public static boolean method9259(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)Lclient!lka;")
	public static Class226 method9260(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class226 local7 = new Class226();
		local7.anInt5905 = -1;
		local7.anInt5892 = arg1 + 6;
		local7.anInt5886 = -1;
		local7.anInt5904 = arg0 + 5 + 1;
		local7.anIntArrayArray41 = new int[local7.anInt5904][local7.anInt5892];
		local7.method5280();
		return local7;
	}
}
