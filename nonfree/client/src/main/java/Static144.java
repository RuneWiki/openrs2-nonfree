import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "[Lclient!o;")
	public static Class6[] aClass6Array8;

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "Lclient!ka;")
	public static final Class129 aClass129_2 = new Class129(2);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIII)I")
	public static int method2176(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static442.anInt7365 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(26) int local26 = arg0 - Static167.anInt2089;
		@Pc(31) int local31 = arg2 - Static167.anInt2099;
		for (@Pc(36) Class1_Sub36 local36 = (Class1_Sub36) Static167.aClass227_15.method4967(); local36 != null; local36 = (Class1_Sub36) Static167.aClass227_15.method4973()) {
			if (local36.anInt5632 == arg1) {
				@Pc(45) int local45 = local36.anInt5636;
				@Pc(48) int local48 = local36.anInt5634;
				@Pc(58) int local58 = Static167.anInt2089 + local45 << 14 | Static167.anInt2099 + local48;
				@Pc(78) int local78 = (local31 - local48) * (local31 + -local48) + (local26 - local45) * (-local45 + local26);
				if (local14 < 0 || local16 > local78) {
					local14 = local58;
					local16 = local78;
				}
			}
		}
		return local14;
	}
}
