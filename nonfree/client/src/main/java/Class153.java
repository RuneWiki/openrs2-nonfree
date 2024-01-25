import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public final class Class153 {

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "Lclient!qda;")
	public Class6_Sub1_Sub1 aClass6_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "Lclient!ida;")
	public Class153 aClass153_1;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
	public void method3484() {
		if (Static264.anInt4872 < 500) {
			this.aClass6_Sub1_Sub1_1 = null;
			this.aClass153_1 = Static405.aClass153_2;
			Static264.anInt4872++;
			Static405.aClass153_2 = this;
		}
	}
}
