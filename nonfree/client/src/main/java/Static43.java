import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
	public static void method5094(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg0, 6);
		local8.method3093();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ha;I)Lclient!oea;")
	public static Class239 method5097(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class95 local14 = Static252.method4683(arg1, arg0, true);
		return local14 == null ? null : local14.aClass239_4;
	}
}
