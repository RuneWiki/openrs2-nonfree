import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_149 = new Class126(116, 7);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
	public static void method6441(@OriginalArg(0) int arg0) {
		if (Static227.aClass3_Sub15_11.aClass17_Sub4_1.method1796() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static129.anInt2452) {
			return;
		}
		if (arg0 != -1) {
			@Pc(36) Class256 local36 = Static651.aClass149_2.method3271(arg0);
			@Pc(40) Class150 local40 = local36.method5826();
			if (local40 == null) {
				arg0 = -1;
			} else {
				Static499.aClass231_4.method5300(Static469.aCanvas11, new Point(local36.anInt6971, local36.anInt6970), local40.method3280(), local40.method3286(), local40.method3278());
				Static129.anInt2452 = arg0;
			}
		}
		if (arg0 == -1 && Static129.anInt2452 != -1) {
			Static499.aClass231_4.method5300(Static469.aCanvas11, new Point(), -1, (int[]) null, -1);
			Static129.anInt2452 = -1;
		}
	}
}
