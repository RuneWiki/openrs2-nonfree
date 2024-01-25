import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class168 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!mt;")
	public Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public int anInt4777;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!oe;")
	public Class168 aClass168_1;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
	public void method4283() {
		if (Static89.anInt1893 >= 500) {
			return;
		}
		this.aClass168_1 = Static306.aClass168_3;
		this.aClass1_Sub2_1 = null;
		this.anInt4777 = 0;
		Static89.anInt1893++;
		Static306.aClass168_3 = this;
	}
}
