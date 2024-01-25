import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public final class Class58 {

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "Lclient!iu;")
	public Class4_Sub3_Sub3 aClass4_Sub3_Sub3_1;

	@OriginalMember(owner = "client!cea", name = "i", descriptor = "Lclient!cea;")
	public Class58 aClass58_1;

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(B)V")
	public void method1088() {
		if (Static47.anInt784 < 500) {
			this.aClass4_Sub3_Sub3_1 = null;
			this.aClass58_1 = Static535.aClass58_3;
			Static47.anInt784++;
			Static535.aClass58_3 = this;
		}
	}
}
