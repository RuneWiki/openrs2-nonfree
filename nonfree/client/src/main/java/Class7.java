import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public final class Class7 {

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!pe;")
	public Class16_Sub1 aClass16_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!ag;")
	public Class7 aClass7_1;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
	public int anInt118;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public void method85() {
		if (Static153.anInt3086 >= 500) {
			return;
		}
		this.aClass7_1 = Static33.aClass7_2;
		this.anInt118 = 0;
		this.aClass16_Sub1_1 = null;
		Static153.anInt3086++;
		Static33.aClass7_2 = this;
	}
}
