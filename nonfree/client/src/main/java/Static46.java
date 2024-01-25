import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bja", name = "f", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method797(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static652.method4548(arg1, arg0, local11, 0, 32768);
		return local11;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V")
	public static void method798() {
		if (Static213.aClass133_5.method7241()) {
			Static213.aClass133_5.method7303(Static83.aCanvas14);
			Static524.method7743();
			if (Static428.aBoolean526) {
				Static117.method1782(Static83.aCanvas14);
			} else {
				@Pc(27) Dimension local27 = Static83.aCanvas14.getSize();
				Static213.aClass133_5.method7273(Static83.aCanvas14, local27.width, local27.height);
			}
			Static213.aClass133_5.method7291(Static83.aCanvas14);
		} else {
			Static638.method9004(Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988(), false);
		}
		Static472.method6995();
		Static28.aBoolean15 = true;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(ILclient!ofa;)Lclient!hca;")
	public static Class56_Sub3 method799(@OriginalArg(1) Class5_Sub22 arg0) {
		return new Class56_Sub3(arg0.method5956(), arg0.method5956(), arg0.method5956(), arg0.method5956(), arg0.method5931(), arg0.method5966());
	}
}
