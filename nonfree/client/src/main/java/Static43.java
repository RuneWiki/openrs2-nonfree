import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_17 = new Class41(16, 3);

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "S")
	public static short aShort14 = 256;

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_31 = new Class221(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)Z")
	public static boolean method900() {
		return Static123.anInt2363 == 0 ? Static335.aBoolean450 : true;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V")
	public static void method901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub1_Sub2 local14 = Static323.method4982(arg1, 7);
		local14.method410();
		local14.anInt348 = arg0;
	}
}
