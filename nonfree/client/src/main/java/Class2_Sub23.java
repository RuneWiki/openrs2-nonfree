import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!id", name = "u", descriptor = "I")
	public int anInt2800;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "I")
	public int anInt2802;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "I")
	public int anInt2803;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "I")
	public int anInt2804;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "I")
	public int anInt2805;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "I")
	public int anInt2801 = -1;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "Z")
	public boolean aBoolean210 = false;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
	public Class2_Sub23(@OriginalArg(0) int arg0) {
		this.anInt2801 = arg0;
	}
}
