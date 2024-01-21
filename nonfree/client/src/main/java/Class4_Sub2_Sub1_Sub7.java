import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public final class Class4_Sub2_Sub1_Sub7 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!vc", name = "cc", descriptor = "I")
	public int anInt3125;

	@OriginalMember(owner = "client!vc", name = "hc", descriptor = "I")
	public int anInt3128;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(B)Lclient!vb;")
	@Override
	public Class4_Sub2_Sub1_Sub6 method2172() {
		return Static119.method2166(this.anInt3125).method416(this.anInt3128);
	}
}
