import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_66 = new Class71();

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	public static int anInt9226 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!kea;Lclient!kea;II)V")
	public static void method7624(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class161 arg1) {
		Static390.aClass161_88 = arg0;
		Static499.aClass161_38 = arg1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ada;BI)Lclient!fv;")
	public static Class98 method7625(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class98 local15;
		if (Static340.aClass98_2 == null) {
			local15 = new Class98();
		} else {
			local15 = Static340.aClass98_2;
			Static340.aClass98_2 = Static340.aClass98_2.aClass98_1;
			Static38.anInt992--;
			local15.aClass98_1 = null;
		}
		local15.anInt2952 = arg1;
		local15.aClass6_Sub1_1 = arg0;
		return local15;
	}
}
