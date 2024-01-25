import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!jga", name = "o", descriptor = "I")
	public int anInt4582;

	@OriginalMember(owner = "client!jga", name = "q", descriptor = "I")
	public int anInt4584;

	@OriginalMember(owner = "client!jga", name = "m", descriptor = "Lclient!tda;")
	public Class349 aClass349_74;

	@OriginalMember(owner = "client!jga", name = "n", descriptor = "Lclient!tw;")
	public Class2_Sub20_Sub2 aClass2_Sub20_Sub2_1;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
	public void method4184() {
		if (Static298.anInt4586 < Static549.aClass2_Sub33Array1.length) {
			Static549.aClass2_Sub33Array1[Static298.anInt4586++] = this;
		}
	}
}
