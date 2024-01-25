import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public final class Class289 {

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "Lclient!rfa;")
	public Class289 aClass289_3;

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "Lclient!na;")
	public Class1_Sub4_Sub2 aClass1_Sub4_Sub2_1;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
	public void method6964() {
		if (Static343.anInt6644 < 500) {
			this.aClass1_Sub4_Sub2_1 = null;
			this.aClass289_3 = Static268.aClass289_2;
			Static343.anInt6644++;
			Static268.aClass289_2 = this;
		}
	}
}
