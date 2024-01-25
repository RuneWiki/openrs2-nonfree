import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "Lclient!uu;")
	public static Class250 aClass250_95;

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
	public static int anInt6596;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!uu;II)Lclient!ju;")
	public static Class124 method5452(@OriginalArg(0) Class250 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method5814(arg1);
		return local13 == null ? null : new Class124(local13);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!br;BIII)V")
	public static void method5458(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 | arg2 << 28 | arg1 << 14);
		@Pc(22) Class3_Sub13 local22 = (Class3_Sub13) Static242.aClass140_26.method3490(local16);
		if (local22 == null) {
			local22 = new Class3_Sub13();
			Static242.aClass140_26.method3494(local16, local22);
			local22.aClass193_19.method4527(arg0);
			return;
		}
		@Pc(45) Class209 local45 = Static158.aClass272_1.method6283(arg0.anInt627);
		@Pc(48) int local48 = local45.anInt6038;
		if (local45.anInt6020 == 1) {
			local48 *= arg0.anInt625 + 1;
		}
		for (@Pc(72) Class3_Sub9 local72 = (Class3_Sub9) local22.aClass193_19.method4519(); local72 != null; local72 = (Class3_Sub9) local22.aClass193_19.method4525()) {
			local45 = Static158.aClass272_1.method6283(local72.anInt627);
			@Pc(83) int local83 = local45.anInt6038;
			if (local45.anInt6020 == 1) {
				local83 *= local72.anInt625 + 1;
			}
			if (local48 > local83) {
				Static221.method5545(arg0, local72);
				return;
			}
		}
		local22.aClass193_19.method4527(arg0);
	}
}
