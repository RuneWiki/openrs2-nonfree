import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class4_Sub4_Sub3_Sub3 extends Class4_Sub4_Sub3 {

	@OriginalMember(owner = "client!he", name = "qb", descriptor = "I")
	public int anInt1200;

	@OriginalMember(owner = "client!he", name = "tb", descriptor = "I")
	public int anInt1202;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Lclient!u;")
	@Override
	public Class4_Sub4_Sub3_Sub7 method1754() {
		return Static61.method1040(this.anInt1200).method851(this.anInt1202);
	}
}
