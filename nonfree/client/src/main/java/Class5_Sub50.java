import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public final class Class5_Sub50 extends Class5 {

	@OriginalMember(owner = "client!tia", name = "m", descriptor = "Lclient!wia;")
	public Class387 aClass387_108;

	@OriginalMember(owner = "client!tia", name = "o", descriptor = "Lclient!ub;")
	public Class5_Sub23_Sub2 aClass5_Sub23_Sub2_2;

	@OriginalMember(owner = "client!tia", name = "p", descriptor = "I")
	public int anInt9621;

	@OriginalMember(owner = "client!tia", name = "q", descriptor = "I")
	public int anInt9624;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V")
	public void method8243() {
		if (Static591.anInt9944 < Static374.aClass5_Sub50Array1.length) {
			Static374.aClass5_Sub50Array1[Static591.anInt9944++] = this;
		}
	}
}
