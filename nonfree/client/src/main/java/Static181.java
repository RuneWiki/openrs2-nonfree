import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!is", name = "j", descriptor = "I")
	public static int anInt5110;

	@OriginalMember(owner = "client!is", name = "m", descriptor = "I")
	public static int anInt5111;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "Lclient!la;")
	public static final Class136 aClass136_135 = new Class136(15, 6);

	@OriginalMember(owner = "client!is", name = "l", descriptor = "Lclient!pa;")
	public static final Class183 aClass183_13 = new Class183(7, 3);

	@OriginalMember(owner = "client!is", name = "o", descriptor = "Z")
	public static boolean aBoolean373 = false;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(I)V")
	public static void method4210() {
		Static365.aClass140_34.method3488();
		Static341.aClass65_8.method1687();
		Static60.aClass65_1.method1687();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIII)I")
	public static int method4212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static178.aClass55Array1 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg2 >> 7;
		@Pc(20) int local20 = arg1 >> 7;
		if (local16 < 0 || local20 < 0 || local16 > Static373.anInt6324 - 1 || local20 > Static291.anInt5062 - 1) {
			return 0;
		}
		@Pc(41) int local41 = arg0;
		if (arg0 < 3 && (Static360.aByteArrayArrayArray16[1][local16][local20] & 0x2) != 0) {
			local41 = arg0 + 1;
		}
		return Static178.aClass55Array1[local41].R(arg2, arg1);
	}
}
