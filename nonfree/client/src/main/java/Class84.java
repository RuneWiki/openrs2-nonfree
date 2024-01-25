import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class84 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!ha;")
	public Class84 aClass84_2;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
	public int anInt2103;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!ti;")
	public Class4_Sub5 aClass4_Sub5_1;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
	public void method1990() {
		if (Static5.anInt94 >= 500) {
			return;
		}
		this.anInt2103 = 0;
		this.aClass4_Sub5_1 = null;
		this.aClass84_2 = Static52.aClass84_1;
		Static52.aClass84_1 = this;
		Static5.anInt94++;
	}
}
