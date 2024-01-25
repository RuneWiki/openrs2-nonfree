import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class16 {

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "Lclient!ar;")
	public Class16 aClass16_1;

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "Lclient!vr;")
	public Class9_Sub1_Sub1 aClass9_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
	public void method446() {
		if (Static527.anInt8333 < 500) {
			this.aClass9_Sub1_Sub1_1 = null;
			this.aClass16_1 = Static50.aClass16_2;
			Static527.anInt8333++;
			Static50.aClass16_2 = this;
		}
	}
}
