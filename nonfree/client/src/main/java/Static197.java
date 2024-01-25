import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_32 = new Class305(78, 8);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[IIII)V")
	public static void method3240(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(5) int local5 = arg0 - 1;
		@Pc(9) int local9 = local5 - 7;
		while (local9 > arg2) {
			@Pc(12) int local12 = arg2 + 1;
			arg1[local12] = arg3;
			@Pc(17) int local17 = local12 + 1;
			arg1[local17] = arg3;
			@Pc(22) int local22 = local17 + 1;
			arg1[local22] = arg3;
			@Pc(27) int local27 = local22 + 1;
			arg1[local27] = arg3;
			@Pc(32) int local32 = local27 + 1;
			arg1[local32] = arg3;
			@Pc(37) int local37 = local32 + 1;
			arg1[local37] = arg3;
			@Pc(42) int local42 = local37 + 1;
			arg1[local42] = arg3;
			arg2 = local42 + 1;
			arg1[arg2] = arg3;
		}
		while (arg2 < local5) {
			arg2++;
			arg1[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!ck;BII)Lclient!rc;")
	public static Class80_Sub2_Sub1 method3242(@OriginalArg(0) int arg0, @OriginalArg(1) Class65_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1.aBoolean103 || Static111.method4954(arg0) && Static111.method4954(arg2)) {
			return new Class80_Sub2_Sub1(arg1, 3553, arg3, arg0, arg2);
		} else if (arg1.aBoolean99) {
			return new Class80_Sub2_Sub1(arg1, 34037, arg3, arg0, arg2);
		} else {
			return new Class80_Sub2_Sub1(arg1, arg3, arg0, arg2, Static67.method917(arg0), Static67.method917(arg2));
		}
	}
}
