import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!qaa;")
	public Class1_Sub35_Sub2 aClass1_Sub35_Sub2_1;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "I")
	public int anInt1432;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "I")
	public int anInt1433;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!dg;")
	public Class70 aClass70_15;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public void method1240() {
		if (Static227.anInt4290 < Static473.aClass1_Sub11Array1.length) {
			Static473.aClass1_Sub11Array1[Static227.anInt4290++] = this;
		}
	}
}
