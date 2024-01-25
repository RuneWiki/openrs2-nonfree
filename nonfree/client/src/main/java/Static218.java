import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hfa", name = "r", descriptor = "I")
	public static int anInt3558;

	@OriginalMember(owner = "client!hfa", name = "w", descriptor = "Lclient!ao;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!hfa", name = "u", descriptor = "Z")
	public static boolean aBoolean283 = false;

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "(B)V")
	public static void method3125() {
		for (@Pc(12) int local12 = 0; local12 < Static247.anInt4256; local12++) {
			@Pc(18) int local18 = Static671.anIntArray620[local12];
			@Pc(27) Class5_Sub35 local27 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local18, 1);
			if (local27 != null) {
				@Pc(32) Class8_Sub1_Sub3_Sub2_Sub2 local32 = local27.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				Static549.method7982(local32.aClass227_1.anInt6248, local32);
			}
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILclient!ffa;IIB[BZI)Lclient!gda;")
	public static Class32_Sub1_Sub1 method3126(@OriginalArg(1) Class57_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0.aBoolean228 || Static45.method8836(arg2) && Static45.method8836(arg1)) {
			return new Class32_Sub1_Sub1(arg0, 3553, 6406, arg2, arg1, false, arg3, 6406);
		} else if (arg0.aBoolean231) {
			return new Class32_Sub1_Sub1(arg0, 34037, 6406, arg2, arg1, false, arg3, 6406);
		} else {
			return new Class32_Sub1_Sub1(arg0, 6406, arg2, arg1, Static94.method1393(arg2), Static94.method1393(arg1), arg3, 6406);
		}
	}
}
