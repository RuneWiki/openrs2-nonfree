import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
	public int anInt8040;

	@OriginalMember(owner = "client!rea", name = "o", descriptor = "Lclient!wn;")
	public Class2_Sub22_Sub2 aClass2_Sub22_Sub2_2;

	@OriginalMember(owner = "client!rea", name = "q", descriptor = "Lclient!ju;")
	public Class179 aClass179_105;

	@OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
	public int anInt8041;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
	public void method6820() {
		if (Static180.aClass2_Sub40Array1.length > Static364.anInt5764) {
			Static180.aClass2_Sub40Array1[Static364.anInt5764++] = this;
		}
	}
}
