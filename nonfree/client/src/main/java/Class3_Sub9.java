import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
	public int anInt1624;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Lclient!cda;")
	public Class3_Sub7_Sub1 aClass3_Sub7_Sub1_1;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "Lclient!nj;")
	public Class230 aClass230_14;

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
	public int anInt1629;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public void method1590() {
		if (Static108.anInt2578 < Static73.aClass3_Sub9Array24.length) {
			Static73.aClass3_Sub9Array24[Static108.anInt2578++] = this;
		}
	}
}
