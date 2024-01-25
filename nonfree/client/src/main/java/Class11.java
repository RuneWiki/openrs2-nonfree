import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class11 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "Lclient!am;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "I")
	public int anInt217;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "Lclient!bs;")
	public Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public void method190() {
		if (Static347.anInt6748 >= 500) {
			return;
		}
		this.anInt217 = 0;
		this.aClass11_1 = Static138.aClass11_3;
		this.aClass1_Sub2_1 = null;
		Static347.anInt6748++;
		Static138.aClass11_3 = this;
	}
}
