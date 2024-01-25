import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!ph", name = "tc", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!ph", name = "oc", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_263 = new Class12(36, 20);

	@OriginalMember(owner = "client!ph", name = "pc", descriptor = "I")
	public static int anInt5137 = 0;

	@OriginalMember(owner = "client!ph", name = "sc", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_264 = new Class12(24, 7);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ci;I)[Lclient!ne;")
	public static Class173[] method4178(@OriginalArg(0) Class42 arg0) {
		if (!arg0.method658()) {
			return new Class173[0];
		}
		@Pc(24) Class159 local24 = arg0.method649();
		while (local24.anInt4271 == 0) {
			Static366.method5214(10L);
		}
		if (local24.anInt4271 == 2) {
			return new Class173[0];
		}
		@Pc(46) int[] local46 = (int[]) local24.anObject8;
		@Pc(52) Class173[] local52 = new Class173[local46.length >> 2];
		for (@Pc(54) int local54 = 0; local54 < local52.length; local54++) {
			@Pc(60) Class173 local60 = new Class173();
			local52[local54] = local60;
			local60.anInt4475 = local46[local54 << 2];
			local60.anInt4476 = local46[(local54 << 2) + 1];
			local60.anInt4480 = local46[(local54 << 2) + 2];
			local60.anInt4472 = local46[(local54 << 2) + 3];
		}
		return local52;
	}
}
