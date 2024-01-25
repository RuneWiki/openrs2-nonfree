import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public final class Class299 {

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "Lclient!aba;")
	public Class4_Sub1_Sub1 aClass4_Sub1_Sub1_1;

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "Lclient!qea;")
	public Class299 aClass299_3;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
	public void method6761() {
		if (Static347.anInt5726 < 500) {
			this.aClass4_Sub1_Sub1_1 = null;
			this.aClass299_3 = Static90.aClass299_1;
			Static90.aClass299_1 = this;
			Static347.anInt5726++;
		}
	}
}
