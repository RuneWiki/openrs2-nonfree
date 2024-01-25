import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
	public int anInt4934;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
	public int anInt4936;

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
	public int anInt4937;

	@OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
	public int anInt4938;

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
	public int anInt4941;

	@OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
	public int anInt4940 = -1;

	@OriginalMember(owner = "client!mo", name = "x", descriptor = "Z")
	public boolean aBoolean312 = false;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(I)V")
	public Class1_Sub28(@OriginalArg(0) int arg0) {
		this.anInt4940 = arg0;
	}
}
