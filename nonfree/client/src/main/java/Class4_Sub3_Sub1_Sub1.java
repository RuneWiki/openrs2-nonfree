import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class4_Sub3_Sub1_Sub1 extends Class4_Sub3_Sub1 {

	@OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
	public int anInt221;

	@OriginalMember(owner = "client!bd", name = "hb", descriptor = "I")
	public int anInt225;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Lclient!qb;")
	@Override
	public Class4_Sub3_Sub1_Sub7 method1484() {
		return Static112.method1854(this.anInt221).method1964(this.anInt225);
	}
}
