import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class35 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!bo;")
	public Class35 aClass35_1;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!ag;")
	public Class10_Sub1 aClass10_Sub1_1;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
	public int anInt845;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	public void method734() {
		if (Static237.anInt7560 >= 500) {
			return;
		}
		this.aClass35_1 = Static419.aClass35_6;
		this.aClass10_Sub1_1 = null;
		this.anInt845 = 0;
		Static419.aClass35_6 = this;
		Static237.anInt7560++;
	}
}
