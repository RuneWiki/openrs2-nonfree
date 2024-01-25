import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class6_Sub31 extends Class6 {

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public int anInt5588;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!cga;")
	public Class47 aClass47_90;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
	public int anInt5591;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Lclient!qf;")
	public Class6_Sub21_Sub2 aClass6_Sub21_Sub2_2;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
	public void method4812() {
		if (Static30.anInt866 < Static444.aClass6_Sub31Array1.length) {
			Static444.aClass6_Sub31Array1[Static30.anInt866++] = this;
		}
	}
}
