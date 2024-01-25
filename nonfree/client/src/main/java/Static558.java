import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!tq", name = "H", descriptor = "Lclient!wu;")
	public static Class384 aClass384_124;

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BJLclient!ha;)V")
	public static void method7838(@OriginalArg(1) long arg0, @OriginalArg(2) Class126 arg1) {
		Static591.anInt9680 = Static647.anInt10483;
		Static308.anInt4876 = 0;
		Static633.anInt10303 = 0;
		Static647.anInt10483 = 0;
		@Pc(23) long local23 = Static205.method3179();
		for (@Pc(28) Class14_Sub8 local28 = (Class14_Sub8) Static310.aClass363_7.method8484(); local28 != null; local28 = (Class14_Sub8) Static310.aClass363_7.method8478()) {
			if (local28.method4453(arg1, arg0)) {
				Static633.anInt10303++;
			}
		}
		if (Static32.aBoolean706 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static310.aClass363_7.method8476() + ", running: " + Static633.anInt10303);
			System.out.println("Emitters: " + Static308.anInt4876 + " Particles: " + Static647.anInt10483 + ". Time taken: " + (Static205.method3179() - local23) + "ms");
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)Lclient!rs;")
	public static Class166_Sub1 method7840(@OriginalArg(1) int arg0) {
		return Static74.aBoolean103 && Static57.anInt915 <= arg0 && Static466.anInt7863 >= arg0 ? Static197.aClass166_Sub1Array2[arg0 - Static57.anInt915] : null;
	}
}
