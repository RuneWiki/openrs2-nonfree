import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class160 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
	public int anInt4807;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "Lclient!ro;")
	public Class5_Sub4 aClass5_Sub4_1;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "Lclient!pl;")
	public Class160 aClass160_3;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
	public void method4146() {
		if (Static278.anInt5568 >= 500) {
			return;
		}
		this.aClass5_Sub4_1 = null;
		this.anInt4807 = 0;
		this.aClass160_3 = Static192.aClass160_2;
		Static192.aClass160_2 = this;
		Static278.anInt5568++;
	}
}
