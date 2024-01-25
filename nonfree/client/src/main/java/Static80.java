import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cn", name = "wb", descriptor = "Lclient!da;")
	public static Class67 aClass67_2;

	@OriginalMember(owner = "client!cn", name = "ib", descriptor = "I")
	public static final int anInt1221 = 1339;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!fl;I[[B)V")
	public static void method1184(@OriginalArg(0) Class116_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(16) int local16 = arg1.length;
		@Pc(37) int local37;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = arg1[local18];
			if (local24 != null) {
				@Pc(31) Class6_Sub15 local31 = new Class6_Sub15(local24);
				local37 = Static617.anIntArray642[local18] >> 8;
				@Pc(43) int local43 = Static617.anIntArray642[local18] & 0xFF;
				@Pc(50) int local50 = local37 * 64 - Static50.anInt606;
				@Pc(57) int local57 = local43 * 64 - Static404.anInt7039;
				Static302.method4850();
				arg0.method3283(local31, Static404.anInt7039, local50, Static50.anInt606, Static669.aClass356Array1, local57);
				arg0.method3299(local50, local57, Static202.aClass75_5, local31);
			}
		}
		for (@Pc(85) int local85 = 0; local85 < local16; local85++) {
			@Pc(98) int local98 = (Static617.anIntArray642[local85] >> 8) * 64 - Static50.anInt606;
			local37 = (Static617.anIntArray642[local85] & 0xFF) * 64 - Static404.anInt7039;
			@Pc(113) byte[] local113 = arg1[local85];
			if (local113 == null && Static405.anInt9127 < 800) {
				Static302.method4850();
				arg0.method3277(local37, local98);
			}
		}
	}
}
