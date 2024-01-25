import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public static int anInt512;

	@OriginalMember(owner = "client!as", name = "o", descriptor = "I")
	public static int anInt519;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "[I")
	public static int[] anIntArray16;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "Ljava/lang/String;")
	public static final String aString8 = "green:";

	@OriginalMember(owner = "client!as", name = "z", descriptor = "Ljava/lang/String;")
	public static final String aString9 = "flash1:";

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
	public static void method390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static38.anIntArray55[arg1] = arg0;
		@Pc(19) Class3_Sub6 local19 = (Class3_Sub6) Static98.aClass24_9.method609((long) arg1);
		if (local19 == null) {
			local19 = new Class3_Sub6(Static53.method898() + 500L);
			Static98.aClass24_9.method598((long) arg1, local19);
		} else {
			local19.aLong12 = Static53.method898() + 500L;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	public static void method393() {
		Static276.method4629(Static295.aCanvas4);
		Static203.method3541(Static295.aCanvas4);
		if (Static345.aClass79_1 != null) {
			Static345.aClass79_1.method5430(Static295.aCanvas4);
		}
		Static37.aClient2.method800();
		Static295.aCanvas4.setBackground(Color.black);
		Static123.anInt2650 = -1;
		Static20.method417(Static295.aCanvas4);
		Static270.method4576(Static295.aCanvas4);
		if (Static345.aClass79_1 != null) {
			Static345.aClass79_1.method5423(Static295.aCanvas4);
		}
	}
}
