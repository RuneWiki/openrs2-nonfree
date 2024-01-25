import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class59 {

	@OriginalMember(owner = "client!el", name = "h", descriptor = "I")
	public int anInt1496;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "Lclient!el;")
	public Class59 aClass59_1;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "Lclient!va;")
	public Class10_Sub1 aClass10_Sub1_1;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public void method1257() {
		if (Static311.anInt6191 >= 500) {
			return;
		}
		this.anInt1496 = 0;
		this.aClass59_1 = Static105.aClass59_3;
		this.aClass10_Sub1_1 = null;
		Static311.anInt6191++;
		Static105.aClass59_3 = this;
	}
}
