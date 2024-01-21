import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class3_Sub1_Sub1_Sub2 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!ac", name = "Eb", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!ac", name = "Jb", descriptor = "I")
	public int anInt199;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)Lclient!hc;")
	@Override
	public Class3_Sub1_Sub1_Sub4 method1920() {
		return Static3.method1550(this.anInt197).method499(true, this.anInt199);
	}
}
