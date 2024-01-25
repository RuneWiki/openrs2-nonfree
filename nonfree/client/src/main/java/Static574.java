import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "Lclient!rf;")
	public static final Class284 aClass284_4 = new Class284("runescape", 0);

	@OriginalMember(owner = "client!wa", name = "C", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_60 = new Class313(8);

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_275 = new Class363(8, 2);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!es;B)Lclient!oe;")
	public static Class240 method7769(@OriginalArg(0) Class2_Sub15 arg0) {
		@Pc(7) Class240 local7 = new Class240();
		local7.anInt6704 = arg0.method4294();
		local7.aClass2_Sub3_Sub18_1 = Static541.aClass304_2.method6809(local7.anInt6704);
		return local7;
	}
}
