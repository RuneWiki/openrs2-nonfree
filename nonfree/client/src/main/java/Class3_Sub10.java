import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
	public int anInt2129;

	@OriginalMember(owner = "client!cw", name = "u", descriptor = "I")
	public int anInt2131;

	@OriginalMember(owner = "client!cw", name = "z", descriptor = "Lclient!oo;")
	public Class3_Sub26_Sub1 aClass3_Sub26_Sub1_1;

	@OriginalMember(owner = "client!cw", name = "A", descriptor = "Lclient!rl;")
	public Class287 aClass287_31;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	public void method1851() {
		if (Class8.anInt57 < Static312.aClass3_Sub10Array1.length) {
			Static312.aClass3_Sub10Array1[Class8.anInt57++] = this;
		}
	}
}
