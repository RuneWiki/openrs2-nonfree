import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class17 {

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public int anInt399;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!cp;")
	public Class5_Sub3 aClass5_Sub3_1;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!ba;")
	public Class17 aClass17_1;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public void method443() {
		if (Static30.anInt775 >= 500) {
			return;
		}
		this.aClass5_Sub3_1 = null;
		this.aClass17_1 = Static58.aClass17_2;
		this.anInt399 = 0;
		Static58.aClass17_2 = this;
		Static30.anInt775++;
	}
}
