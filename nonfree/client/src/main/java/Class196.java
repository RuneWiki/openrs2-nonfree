import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public final class Class196 {

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "Lclient!lr;")
	public Class196 aClass196_3;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "Lclient!oda;")
	public Class20_Sub2_Sub2 aClass20_Sub2_Sub2_1;

	static {
		new Class240("", 73);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
	public void method5408() {
		if (Static644.anInt10700 < 500) {
			this.aClass20_Sub2_Sub2_1 = null;
			this.aClass196_3 = Static81.aClass196_1;
			Static81.aClass196_1 = this;
			Static644.anInt10700++;
		}
	}
}
