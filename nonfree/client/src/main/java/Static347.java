import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
	public static final int anInt5947 = 1400;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	public static int anInt5954 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Lclient!td;")
	public static Class233 method4706(@OriginalArg(1) int arg0) {
		@Pc(10) Class233[] local10 = Static380.method5008();
		for (@Pc(19) int local19 = 0; local19 < local10.length; local19++) {
			@Pc(25) Class233 local25 = local10[local19];
			if (arg0 == local25.anInt6408) {
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZII)V")
	public static void method4707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(0, 15);
		local8.method2661();
		local8.anInt3212 = arg0;
		local8.anInt3213 = arg1;
	}
}
