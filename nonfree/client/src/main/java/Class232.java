import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public final class Class232 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "Lclient!gn;")
	public Class20_Sub1 aClass20_Sub1_2;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
	public int anInt6822;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "Lclient!pv;")
	public Class232 aClass232_3;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
	public void method6157() {
		if (Static397.anInt6992 >= 500) {
			return;
		}
		this.aClass232_3 = Static17.aClass232_1;
		this.anInt6822 = 0;
		this.aClass20_Sub1_2 = null;
		Static17.aClass232_1 = this;
		Static397.anInt6992++;
	}
}
