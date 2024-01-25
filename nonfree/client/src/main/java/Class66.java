import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public final class Class66 {

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "Lclient!fb;")
	public Class14_Sub1_Sub1 aClass14_Sub1_Sub1_1;

	@OriginalMember(owner = "client!daa", name = "h", descriptor = "Lclient!daa;")
	public Class66 aClass66_1;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V")
	public void method1339() {
		if (Static648.anInt10488 < 500) {
			this.aClass66_1 = Static358.aClass66_4;
			this.aClass14_Sub1_Sub1_1 = null;
			Static648.anInt10488++;
			Static358.aClass66_4 = this;
		}
	}
}
