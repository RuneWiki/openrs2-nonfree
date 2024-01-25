import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	public int anInt4238;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
	public int anInt4240;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
	public int anInt4241;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
	public int anInt4244;

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
	public int anInt4245;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "Z")
	public boolean aBoolean339 = false;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
	public int anInt4242 = -1;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(I)V")
	public Class1_Sub29(@OriginalArg(0) int arg0) {
		this.anInt4242 = arg0;
	}
}
