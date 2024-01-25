import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "[Lclient!raa;")
	public static final Class6_Sub1[] aClass6_Sub1Array4 = new Class6_Sub1[8];

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_68 = new Class208(69, -1);

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_138 = new Class268(0, 6);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)Lclient!fl;")
	public static Class103 method6658(@OriginalArg(0) int arg0) {
		@Pc(10) Class103 local10 = (Class103) Static55.aClass166_6.method4805((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static501.aClass353_100.method8404(1, arg0);
		local10 = new Class103();
		local10.anInt3367 = arg0;
		if (local20 != null) {
			local10.method3023(new Class6_Sub40(local20));
		}
		local10.method3025();
		if (local10.anInt3360 == 2 && Static232.aClass128_13.method3560((long) arg0) == null) {
			Static232.aClass128_13.method3551((long) arg0, new Class6_Sub48(Static325.anInt6206));
			Static635.aClass103Array3[Static325.anInt6206++] = local10;
		}
		Static55.aClass166_6.method4803(local10, (long) arg0);
		return local10;
	}
}
