import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class5_Sub2_Sub2_Sub4 extends Class5_Sub2_Sub2 {

	@OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
	public int anInt1902;

	@OriginalMember(owner = "client!ma", name = "ob", descriptor = "I")
	public int anInt1911;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)Lclient!wb;")
	@Override
	public Class5_Sub2_Sub2_Sub6 method2178() {
		return Static111.method1830(this.anInt1911).method1274(this.anInt1902);
	}
}
