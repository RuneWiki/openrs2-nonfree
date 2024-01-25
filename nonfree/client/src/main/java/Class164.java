import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class164 {

	@OriginalMember(owner = "client!np", name = "c", descriptor = "Lclient!tq;")
	public Class12_Sub1 aClass12_Sub1_2;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "I")
	public int anInt4393;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "Lclient!np;")
	public Class164 aClass164_19;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public void method3902() {
		if (Static250.anInt4495 >= 500) {
			return;
		}
		this.aClass164_19 = Static174.aClass164_27;
		this.aClass12_Sub1_2 = null;
		this.anInt4393 = 0;
		Static174.aClass164_27 = this;
		Static250.anInt4495++;
	}
}
