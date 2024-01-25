import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class333 {

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!ii;")
	public Class16_Sub1_Sub1 aClass16_Sub1_Sub1_1;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!tl;")
	public Class333 aClass333_3;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public void method7822() {
		if (Static585.anInt9525 < 500) {
			this.aClass333_3 = Static382.aClass333_2;
			this.aClass16_Sub1_Sub1_1 = null;
			Static585.anInt9525++;
			Static382.aClass333_2 = this;
		}
	}
}
