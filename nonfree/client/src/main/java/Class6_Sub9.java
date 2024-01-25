import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "Lclient!vt;")
	public Class6_Sub40_Sub2 aClass6_Sub40_Sub2_1;

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
	public int anInt1708;

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
	public int anInt1709;

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "Lclient!mia;")
	public Class208 aClass208_16;

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
	public void method1427() {
		if (Static504.aClass6_Sub9Array5.length > Static117.anInt2319) {
			Static504.aClass6_Sub9Array5[Static117.anInt2319++] = this;
		}
	}
}
