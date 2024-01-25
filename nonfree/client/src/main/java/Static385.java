import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!jca;")
	public static Class182 aClass182_5;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!at;")
	public static final Class20 aClass20_32 = new Class20();

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_166 = new Class381(91, 8);

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)Lclient!lv;")
	public static Class4_Sub1_Sub4 method5703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(15) Class4_Sub1_Sub4 local15 = local7.aClass4_Sub1_Sub4_1;
			local7.aClass4_Sub1_Sub4_1 = null;
			Static370.method5508(local15);
			return local15;
		}
	}
}
