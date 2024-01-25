import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class125 {

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "Lclient!nb;")
	public Class28_Sub1_Sub1 aClass28_Sub1_Sub1_1;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Lclient!gs;")
	public Class125 aClass125_1;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	public void method3656() {
		if (Static10.anInt113 < 500) {
			this.aClass28_Sub1_Sub1_1 = null;
			this.aClass125_1 = Static472.aClass125_3;
			Static10.anInt113++;
			Static472.aClass125_3 = this;
		}
	}
}
