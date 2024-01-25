import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_93 = new Class211(46, 14);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
	public static void method3106(@OriginalArg(0) int arg0) {
		Static120.anIntArray171 = new int[arg0];
		Static90.anIntArray136 = new int[arg0];
		Static449.anIntArray635 = new int[arg0];
		Static319.anIntArray480 = new int[arg0];
		Static81.anIntArray127 = new int[arg0];
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V")
	public static void method3111(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub5_Sub11 local12 = Static316.method4316(12, arg0);
		local12.method3101();
	}
}
