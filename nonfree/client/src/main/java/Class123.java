import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class123 {

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "Lclient!laa;")
	public Class60_Sub1_Sub1 aClass60_Sub1_Sub1_1;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "Lclient!fu;")
	public Class123 aClass123_1;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
	public void method3364() {
		if (Static401.anInt6904 < 500) {
			this.aClass60_Sub1_Sub1_1 = null;
			this.aClass123_1 = Static679.aClass123_4;
			Static679.aClass123_4 = this;
			Static401.anInt6904++;
		}
	}
}
