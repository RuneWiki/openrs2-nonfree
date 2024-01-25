import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "Lclient!pe;")
	public static Class246 aClass246_3;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "Lclient!vca;")
	public static Class327 aClass327_1;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "Lclient!jo;")
	public static Class168 aClass168_52;

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "[Lclient!jf;")
	public static final Class164_Sub1[] aClass164_Sub1Array1 = new Class164_Sub1[34];

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_34 = new Class245(64);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)B")
	public static byte method3812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!iaa;I)Lclient!kc;")
	public static Class177 method3813(@OriginalArg(0) Class6_Sub26 arg0) {
		@Pc(15) int local15 = arg0.method4999();
		@Pc(22) Class148 local22 = Static38.method1094()[arg0.method4966()];
		@Pc(29) Class49 local29 = Static131.method2521()[arg0.method4966()];
		@Pc(33) int local33 = arg0.method4974();
		@Pc(37) int local37 = arg0.method4974();
		return new Class177(local15, local22, local29, local33, local37);
	}
}
