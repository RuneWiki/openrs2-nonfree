import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "Lclient!uu;")
	public static Class251 aClass251_3;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "Lclient!ao;")
	public static Class12 aClass12_2;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_117 = new Class119(56, 4);

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "Lclient!gr;")
	public static final Class95 aClass95_12 = new Class95(9, 7);

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "Lclient!ef;")
	public static final Class61 aClass61_9 = new Class61(4, 1, 1, 1);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!nu;")
	public static Class7_Sub2 method4348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class179 local14 = local7.aClass179_2; local14 != null; local14 = local14.aClass179_3) {
			@Pc(18) Class7_Sub2 local18 = local14.aClass7_Sub2_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort71 == arg1 && local18.aShort73 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
