import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_38 = new Class349(65, 16);

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_39 = new Class349(26, 7);

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "[I")
	public static final int[] anIntArray162 = new int[200];

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_39 = new Class225(82, -1);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!nca;I)Lclient!wka;")
	public static Class2_Sub56 method1921(@OriginalArg(1) Class254 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method6079(arg1);
		return local8 == null ? null : new Class2_Sub56(local8);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZII)V")
	public static void method1923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static90.anInt3349 / (float) Static90.anInt3350;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg2 * local9);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(40) int local40 = arg1 - (arg2 - local11) / 2;
		@Pc(54) int local54 = arg3 - (arg0 - local13) / 2;
		Static704.anInt10775 = Static90.anInt3349 - local54 * Static90.anInt3349 / local13;
		Static657.anInt10294 = -1;
		Static681.anInt10509 = local40 * Static90.anInt3350 / local11;
		Static537.anInt5296 = -1;
		Static360.method5164();
	}
}
