import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public final class Class3_Sub1_Sub3_Sub5 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!r", name = "kb", descriptor = "I")
	public int anInt2268;

	@OriginalMember(owner = "client!r", name = "tb", descriptor = "I")
	public int anInt2274;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Lclient!lb;")
	@Override
	protected Class3_Sub1_Sub3_Sub3 method1843() {
		return Static4.method160(this.anInt2268).method214(true, this.anInt2274);
	}
}
