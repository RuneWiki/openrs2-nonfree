import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "Lclient!aj;")
	public static Class15 aClass15_166;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
	public static int anInt10886;

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_221 = new Class180(89, 12);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!wea;III)V")
	public static void method9367(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class164 local12;
		if (arg2 < Static146.anInt2951) {
			local12 = Static15.aClass164ArrayArrayArray5[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass28_Sub1_Sub3_1 != null && local12.aClass28_Sub1_Sub3_1.method9297()) {
				arg0.method9290(Static671.aClass13_21, local12.aClass28_Sub1_Sub3_1, true, Static207.anInt4003, 0, 0);
			}
		}
		if (arg3 < Static146.anInt2951) {
			local12 = Static15.aClass164ArrayArrayArray5[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass28_Sub1_Sub3_1 != null && local12.aClass28_Sub1_Sub3_1.method9297()) {
				arg0.method9290(Static671.aClass13_21, local12.aClass28_Sub1_Sub3_1, true, 0, 0, Static207.anInt4003);
			}
		}
		if (arg2 < Static146.anInt2951 && arg3 < Static602.anInt9668) {
			local12 = Static15.aClass164ArrayArrayArray5[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass28_Sub1_Sub3_1 != null && local12.aClass28_Sub1_Sub3_1.method9297()) {
				arg0.method9290(Static671.aClass13_21, local12.aClass28_Sub1_Sub3_1, true, Static207.anInt4003, 0, Static207.anInt4003);
			}
		}
		if (arg2 < Static146.anInt2951 && arg3 > 0) {
			local12 = Static15.aClass164ArrayArrayArray5[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass28_Sub1_Sub3_1 != null && local12.aClass28_Sub1_Sub3_1.method9297()) {
				arg0.method9290(Static671.aClass13_21, local12.aClass28_Sub1_Sub3_1, true, Static207.anInt4003, 0, -Static207.anInt4003);
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIIII)V")
	public static void method9368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 - arg0 >= Static7.anInt93 && arg0 + arg3 <= Static115.anInt2377 && arg2 - arg0 >= Static374.anInt5986 && arg0 + arg2 <= Static84.anInt1667) {
			Static394.method5571(arg3, arg1, arg2, arg0);
		} else {
			Static396.method5595(arg0, arg3, arg2, arg1);
		}
	}
}
