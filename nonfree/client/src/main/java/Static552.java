import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "Lclient!gk;")
	public static Class2_Sub7 aClass2_Sub7_7;

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "[I")
	public static final int[] anIntArray591 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_128 = new Class154(36, 4);

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_150 = new Class349(55, 6);

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)Lclient!fg;")
	public static Class12_Sub2_Sub4 method7232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass12_Sub2_Sub4_1;
	}
}
