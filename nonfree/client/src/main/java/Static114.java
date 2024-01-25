import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_113 = new Class92(48, 8);

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
	public static int anInt5655 = -1;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZJILjava/lang/String;IIILjava/lang/String;IZI)V")
	public static void method4751(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (!Static250.aBoolean294 && Static151.anInt3129 < 500) {
			@Pc(16) int local16 = arg9 == -1 ? Static327.anInt5630 : arg9;
			@Pc(30) Class6_Sub40 local30 = new Class6_Sub40(arg3, arg6, local16, arg2, arg5, arg1, arg4, arg7, arg0, arg8);
			Static292.aClass244_25.method5966(local30);
			Static151.anInt3129++;
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)Lclient!pj;")
	public static Class195 method4752(@OriginalArg(1) int arg0) {
		@Pc(8) Class195[] local8 = Static55.method1239();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class195 local21 = local8[local15];
			if (arg0 == local21.anInt5391) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIBII)V")
	public static void method4753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class6_Sub2_Sub7 local16 = Static212.method3218(arg2, 8);
		local16.method3088();
		local16.anInt3746 = arg1;
		local16.anInt3744 = arg0;
		local16.anInt3749 = arg3;
	}
}
