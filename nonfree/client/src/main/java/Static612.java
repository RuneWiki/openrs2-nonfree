import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "[Lclient!al;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!tg", name = "N", descriptor = "Lclient!gn;")
	public static final Class136 aClass136_44 = new Class136(64);

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
	public static int anInt9909 = 0;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
	public static int anInt9915 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Lclient!jg;")
	public static Class19_Sub1_Sub4 method8353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(15) Class19_Sub1_Sub4 local15 = local7.aClass19_Sub1_Sub4_1;
			local7.aClass19_Sub1_Sub4_1 = null;
			Static433.method6363(local15);
			return local15;
		}
	}
}
