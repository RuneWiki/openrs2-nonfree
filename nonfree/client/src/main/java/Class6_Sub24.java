import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class6_Sub24 extends Class6 {

	@OriginalMember(owner = "client!od", name = "j", descriptor = "I")
	public int anInt4798;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "I")
	public int anInt4800;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "I")
	public int anInt4801;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "I")
	public int anInt4805;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "I")
	public int anInt4808;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	public int anInt4802 = -1;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Z")
	public boolean aBoolean340 = false;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I)V")
	public Class6_Sub24(@OriginalArg(0) int arg0) {
		this.anInt4802 = arg0;
	}
}
