import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gma")
public final class Class142 {

	@OriginalMember(owner = "client!gma", name = "i", descriptor = "Lclient!kg;")
	public Class4_Sub2_Sub1 aClass4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!gma", name = "g", descriptor = "Lclient!gma;")
	public Class142 aClass142_1;

	@OriginalMember(owner = "client!gma", name = "a", descriptor = "(I)V")
	public void method2996() {
		if (Static532.anInt8452 < 500) {
			this.aClass142_1 = Static598.aClass142_3;
			this.aClass4_Sub2_Sub1_1 = null;
			Static598.aClass142_3 = this;
			Static532.anInt8452++;
		}
	}
}
