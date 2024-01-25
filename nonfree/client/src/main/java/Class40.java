import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class40 {

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "Lclient!bk;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Lclient!wga;")
	public Class41_Sub1_Sub1 aClass41_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	public void method626() {
		if (Static534.anInt10372 < 500) {
			this.aClass40_1 = Static196.aClass40_2;
			this.aClass41_Sub1_Sub1_1 = null;
			Static534.anInt10372++;
			Static196.aClass40_2 = this;
		}
	}
}
