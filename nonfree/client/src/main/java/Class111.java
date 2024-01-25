import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public final class Class111 {

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "Lclient!mw;")
	public Class8_Sub3_Sub3 aClass8_Sub3_Sub3_1;

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "Lclient!fv;")
	public Class111 aClass111_2;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
	public void method2191() {
		if (Static5.anInt65 < 500) {
			this.aClass8_Sub3_Sub3_1 = null;
			this.aClass111_2 = Static513.aClass111_3;
			Static513.aClass111_3 = this;
			Static5.anInt65++;
		}
	}
}
