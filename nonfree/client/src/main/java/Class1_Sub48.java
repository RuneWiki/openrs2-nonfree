import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class1_Sub48 extends Class1 {

	@OriginalMember(owner = "client!to", name = "i", descriptor = "I")
	public int anInt8519;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "Lclient!tt;")
	public Class319 aClass319_152;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "I")
	public int anInt8523;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "Lclient!jd;")
	public Class1_Sub20_Sub1 aClass1_Sub20_Sub1_2;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
	public void method7048() {
		if (Static194.anInt3960 < Static12.aClass1_Sub48Array1.length) {
			Static12.aClass1_Sub48Array1[Static194.anInt3960++] = this;
		}
	}
}
