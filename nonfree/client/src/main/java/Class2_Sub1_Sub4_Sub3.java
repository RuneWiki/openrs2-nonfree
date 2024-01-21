import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class2_Sub1_Sub4_Sub3 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!nc", name = "sb", descriptor = "I")
	public int anInt1747;

	@OriginalMember(owner = "client!nc", name = "Cb", descriptor = "I")
	public int anInt1752;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)Lclient!fd;")
	@Override
	public Class2_Sub1_Sub4_Sub1 method2031() {
		return Static43.method832(this.anInt1747).method1985(true, this.anInt1752);
	}
}
