import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class243 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!rq;")
	public Class2_Sub3_Sub1 aClass2_Sub3_Sub1_1;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "Lclient!of;")
	public Class243 aClass243_3;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public void method6372() {
		if (Static363.anInt6996 < 500) {
			this.aClass243_3 = Static258.aClass243_2;
			this.aClass2_Sub3_Sub1_1 = null;
			Static363.anInt6996++;
			Static258.aClass243_2 = this;
		}
	}
}
