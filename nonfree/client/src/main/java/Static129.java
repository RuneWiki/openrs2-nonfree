import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!fv", name = "S", descriptor = "Lclient!um;")
	public static Class243 aClass243_72;

	@OriginalMember(owner = "client!fv", name = "E", descriptor = "Lclient!d;")
	public static final Class44 aClass44_22 = new Class44(4);

	@OriginalMember(owner = "client!fv", name = "R", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_33 = new Class198("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBLclient!um;I)Lclient!wr;")
	public static Class5_Sub2_Sub18 method1798(@OriginalArg(0) int arg0, @OriginalArg(2) Class243 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class5_Sub15 local14 = new Class5_Sub15(arg1.method5455(arg2, arg0));
		@Pc(45) Class5_Sub2_Sub18 local45 = new Class5_Sub2_Sub18(arg2, local14.method5549(), local14.method5549(), local14.method5603(), local14.method5603(), local14.method5539() == 1, local14.method5539(), local14.method5539());
		@Pc(49) int local49 = local14.method5539();
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local45.aClass177_54.method3615(new Class5_Sub20(local14.method5539(), local14.method5598(), local14.method5598(), local14.method5598(), local14.method5598(), local14.method5598(), local14.method5598(), local14.method5598(), local14.method5598()));
		}
		local45.method6015();
		return local45;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BIII[BI)V")
	public static void method1799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(16) int local16 = arg3 - arg0 >> 2;
		arg1 += arg0;
		while (true) {
			local16--;
			if (local16 < 0) {
				local16 = arg3 - arg0 & 0x3;
				while (true) {
					local16--;
					if (local16 < 0) {
						return;
					}
					arg2[arg1++] = 1;
				}
			}
			@Pc(30) int local30 = arg1 + 1;
			arg2[arg1] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg2[local30] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg2[local35] = 1;
			arg1 = local40 + 1;
			arg2[local40] = 1;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1801(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static288.method3576(Static417.aClass194_114);
			Static281.aClass5_Sub15_Sub2_13.method5583(Static21.method357(arg0));
			Static281.aClass5_Sub15_Sub2_13.method5545(arg0);
		}
	}
}
