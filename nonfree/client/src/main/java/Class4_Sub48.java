import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public final class Class4_Sub48 extends Class4 {

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "Lclient!bn;")
	public Class4_Sub11_Sub1 aClass4_Sub11_Sub1_2;

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
	public int anInt9240;

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
	public int anInt9241;

	@OriginalMember(owner = "client!uea", name = "p", descriptor = "Lclient!lja;")
	public Class216 aClass216_139;

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)V")
	public void method7902() {
		if (Static294.anInt4653 < Static458.aClass4_Sub48Array1.length) {
			Static458.aClass4_Sub48Array1[Static294.anInt4653++] = this;
		}
	}
}
