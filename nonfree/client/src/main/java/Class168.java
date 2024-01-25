import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class168 {

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "Lclient!lr;")
	public Class9_Sub4_Sub2 aClass9_Sub4_Sub2_1;

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "Lclient!kfa;")
	public Class168 aClass168_2;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
	public void method5024() {
		if (Static309.anInt6218 < 500) {
			this.aClass168_2 = Static50.aClass168_1;
			this.aClass9_Sub4_Sub2_1 = null;
			Static309.anInt6218++;
			Static50.aClass168_1 = this;
		}
	}
}
