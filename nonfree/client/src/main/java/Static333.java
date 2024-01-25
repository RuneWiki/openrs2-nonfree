import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)I")
	public static int method5314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static103.anIntArray205[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!an;BI)Lclient!il;")
	public static Class12_Sub25 method5315(@OriginalArg(0) Class16 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method410(arg1);
		return local16 == null ? null : new Class12_Sub25(local16);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I[[[Lclient!bo;)V")
	public static void method5318(@OriginalArg(1) Class37[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class37[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class37 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass30_Sub3_1 instanceof Interface19) {
							((Interface19) local27.aClass30_Sub3_1).method7914();
						}
						if (local27.aClass30_Sub4_2 instanceof Interface19) {
							((Interface19) local27.aClass30_Sub4_2).method7914();
						}
						if (local27.aClass30_Sub4_1 instanceof Interface19) {
							((Interface19) local27.aClass30_Sub4_1).method7914();
						}
						if (local27.aClass30_Sub2_2 instanceof Interface19) {
							((Interface19) local27.aClass30_Sub2_2).method7914();
						}
						if (local27.aClass30_Sub2_1 instanceof Interface19) {
							((Interface19) local27.aClass30_Sub2_1).method7914();
						}
						for (@Pc(81) Class243 local81 = local27.aClass243_3; local81 != null; local81 = local81.aClass243_11) {
							@Pc(86) Class30_Sub1 local86 = local81.aClass30_Sub1_2;
							if (local86 instanceof Interface19) {
								((Interface19) local86).method7914();
							}
						}
					}
				}
			}
		}
	}
}
