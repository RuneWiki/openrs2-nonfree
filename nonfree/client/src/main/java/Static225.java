import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "Lclient!oi;")
	public static final Class240 aClass240_6 = new Class240("", 13);

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!oda;B)Lclient!lr;")
	public static Class196 method3783(@OriginalArg(0) Class20_Sub2_Sub2 arg0) {
		@Pc(14) Class196 local14;
		if (Static81.aClass196_1 == null) {
			local14 = new Class196();
		} else {
			local14 = Static81.aClass196_1;
			Static81.aClass196_1 = Static81.aClass196_1.aClass196_3;
			local14.aClass196_3 = null;
			Static644.anInt10700--;
		}
		local14.aClass20_Sub2_Sub2_1 = arg0;
		return local14;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!da;)V")
	public static void method3784(@OriginalArg(0) Class50 arg0) {
		Static155.aClass50_4 = arg0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method3785(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}
}
