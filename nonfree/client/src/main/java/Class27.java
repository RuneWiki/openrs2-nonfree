import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class27 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!km;")
	public Class15_Sub3_Sub3 aClass15_Sub3_Sub3_1;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Lclient!bc;")
	public Class27 aClass27_1;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public void method628() {
		if (Static448.anInt8139 < 500) {
			this.aClass15_Sub3_Sub3_1 = null;
			this.aClass27_1 = Static360.aClass27_2;
			Static448.anInt8139++;
			Static360.aClass27_2 = this;
		}
	}
}
