import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!uj", name = "Cc", descriptor = "I")
	public static final int anInt6765 = 1338;

	@OriginalMember(owner = "client!uj", name = "Ec", descriptor = "I")
	public static int anInt6767 = 0;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[[[Lclient!oh;)V")
	public static void method5526(@OriginalArg(1) Class189[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class189[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class189 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass3_Sub5_1 instanceof Interface10) {
							((Interface10) local27.aClass3_Sub5_1).method5810();
						}
						if (local27.aClass3_Sub4_3 instanceof Interface10) {
							((Interface10) local27.aClass3_Sub4_3).method5810();
						}
						if (local27.aClass3_Sub4_2 instanceof Interface10) {
							((Interface10) local27.aClass3_Sub4_2).method5810();
						}
						if (local27.aClass3_Sub1_1 instanceof Interface10) {
							((Interface10) local27.aClass3_Sub1_1).method5810();
						}
						if (local27.aClass3_Sub1_2 instanceof Interface10) {
							((Interface10) local27.aClass3_Sub1_2).method5810();
						}
						for (@Pc(81) Class242 local81 = local27.aClass242_2; local81 != null; local81 = local81.aClass242_4) {
							@Pc(86) Class3_Sub3 local86 = local81.aClass3_Sub3_2;
							if (local86 instanceof Interface10) {
								((Interface10) local86).method5810();
							}
						}
					}
				}
			}
		}
	}
}
