import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class117 {

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
	public int anInt3669;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "Lclient!sf;")
	public Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "Lclient!kq;")
	public Class117 aClass117_1;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
	public void method3326() {
		if (Static348.anInt6589 >= 500) {
			return;
		}
		this.anInt3669 = 0;
		this.aClass8_Sub1_1 = null;
		this.aClass117_1 = Static303.aClass117_3;
		Static348.anInt6589++;
		Static303.aClass117_3 = this;
	}
}
