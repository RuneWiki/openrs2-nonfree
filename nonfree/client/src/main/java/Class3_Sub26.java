import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public final class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!ida", name = "l", descriptor = "Lclient!dfa;")
	public Class3_Sub15_Sub1 aClass3_Sub15_Sub1_3;

	@OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
	public int anInt5179;

	@OriginalMember(owner = "client!ida", name = "n", descriptor = "I")
	public int anInt5180;

	@OriginalMember(owner = "client!ida", name = "p", descriptor = "Lclient!us;")
	public Class344 aClass344_55;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
	public void method4377() {
		if (Static22.anInt234 < Static282.aClass3_Sub26Array3.length) {
			Static282.aClass3_Sub26Array3[Static22.anInt234++] = this;
		}
	}
}
