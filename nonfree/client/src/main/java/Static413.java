import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
	public static int anInt7858 = 0;

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "Lclient!pfa;")
	public static final Class253 aClass253_30 = new Class253(16);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BII)V")
	public static void method6509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class216 local17 = Static239.aClass216ArrayArray1[arg1][arg0];
		if (local17 != null) {
			Static451.anInt8300 = local17.anInt6832;
			Static385.anInt9988 = local17.anInt6827;
			Static98.anInt2628 = local17.anInt6828;
		}
		Static132.method2909();
	}
}
