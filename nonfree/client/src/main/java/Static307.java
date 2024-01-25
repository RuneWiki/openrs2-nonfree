import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	public static int anInt5600;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_198 = new Class184(109, 3);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!oh;I)Lclient!pd;")
	public static Class182 method4517(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class182 local15;
		if (Static274.aClass182_1 == null) {
			local15 = new Class182();
		} else {
			local15 = Static274.aClass182_1;
			Static274.aClass182_1 = Static274.aClass182_1.aClass182_2;
			local15.aClass182_2 = null;
			Static349.anInt7451--;
		}
		local15.aClass1_Sub3_2 = arg0;
		local15.anInt5511 = arg1;
		return local15;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Lclient!nm;")
	public static Class1_Sub5 method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub5_3;
	}
}
