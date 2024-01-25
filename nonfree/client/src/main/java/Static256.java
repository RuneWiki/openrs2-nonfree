import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "Lclient!tka;")
	public static final Class344 aClass344_1 = new Class344();

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lclient!jc;I)V")
	public static void method4482(@OriginalArg(0) Class6_Sub15 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static253.anInt4796; local5++) {
			@Pc(14) int local14 = arg0.method2992();
			@Pc(18) int local18 = arg0.method3018();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static241.aClass204_Sub1Array2[local14] != null) {
				Static241.aClass204_Sub1Array2[local14].anInt6024 = local18;
			}
		}
	}
}
