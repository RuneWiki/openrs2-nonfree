import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class168 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Lclient!pc;")
	public Class47_Sub2 aClass47_Sub2_2;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
	public int anInt4983;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "Lclient!kr;")
	public Class168 aClass168_1;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public void method4330() {
		if (Static446.anInt7517 >= 500) {
			return;
		}
		this.anInt4983 = 0;
		this.aClass47_Sub2_2 = null;
		this.aClass168_1 = Static519.aClass168_3;
		Static446.anInt7517++;
		Static519.aClass168_3 = this;
	}
}
