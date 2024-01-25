import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class Class41 {

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "Lclient!bj;")
	public Class41 aClass41_2;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "Lclient!hd;")
	public Class28_Sub1_Sub4 aClass28_Sub1_Sub4_1;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
	public void method611() {
		if (Static388.anInt6928 < 500) {
			this.aClass28_Sub1_Sub4_1 = null;
			this.aClass41_2 = Static16.aClass41_1;
			Static388.anInt6928++;
			Static16.aClass41_1 = this;
		}
	}
}
