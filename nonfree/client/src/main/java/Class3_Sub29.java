import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!gs;")
	public Class144 aClass144_44;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "Lclient!aba;")
	public Class3_Sub2_Sub1 aClass3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "I")
	public int anInt4151;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	public int anInt4152;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public void method3815() {
		if (Static26.anInt897 < Static446.aClass3_Sub29Array1.length) {
			Static446.aClass3_Sub29Array1[Static26.anInt897++] = this;
		}
	}
}
