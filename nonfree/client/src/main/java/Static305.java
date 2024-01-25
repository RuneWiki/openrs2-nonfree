import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public static int anInt7340;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Lclient!la;")
	public static Class63 aClass63_15;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_144 = new Class55("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_110 = new Class2(42, 15);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
	public static void method5641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg0, 14);
		local8.method4716();
		local8.anInt5868 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)I")
	public static int method5644() {
		@Pc(5) Class126 local5 = Static281.aClass126_61;
		synchronized (Static281.aClass126_61) {
			return Static281.aClass126_61.method2816();
		}
	}
}
