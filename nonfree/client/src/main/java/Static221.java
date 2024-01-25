import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!le", name = "I", descriptor = "Lclient!lt;")
	public static Class158 aClass158_50;

	@OriginalMember(owner = "client!le", name = "K", descriptor = "Lclient!es;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_55 = new Class25(70, 8);

	@OriginalMember(owner = "client!le", name = "J", descriptor = "[I")
	public static final int[] anIntArray322 = new int[1000];

	@OriginalMember(owner = "client!le", name = "L", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_56 = new Class25(26, 3);

	@OriginalMember(owner = "client!le", name = "N", descriptor = "I")
	public static int anInt3810 = 0;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
	public static void method3400() {
		for (@Pc(14) Class6_Sub1_Sub7 local14 = (Class6_Sub1_Sub7) Static205.aClass88_15.method1882(); local14 != null; local14 = (Class6_Sub1_Sub7) Static205.aClass88_15.method1891()) {
			@Pc(19) Class3_Sub3_Sub5 local19 = local14.aClass3_Sub3_Sub5_1;
			if (local19.aBoolean357) {
				local14.method5977();
				local19.method4508();
			} else if (local19.anInt5134 <= Static125.anInt2225) {
				local19.method4510(Static338.anInt5679);
				if (local19.aBoolean357) {
					local14.method5977();
				} else {
					Static9.method128(local19, true);
				}
			}
		}
	}
}
