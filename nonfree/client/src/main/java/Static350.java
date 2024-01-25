import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "D")
	public static double aDouble14;

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
	public static int anInt6508;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_198 = new Class194(103, -1);

	@OriginalMember(owner = "client!mga", name = "e", descriptor = "Z")
	public static final boolean aBoolean478 = false;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIIII)V")
	public static void method5653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static298.anInt5919 <= arg1 && arg1 <= Static596.anInt9703) {
			@Pc(19) int local19 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg0);
			@Pc(25) int local25 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg3);
			Static138.method2376(arg1, local19, arg2, local25);
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V")
	public static void method5654() {
		Static634.aBoolean765 = true;
	}
}
