import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
	public int anInt943;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	public int anInt946;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
	public int anInt948;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
	public int anInt950;

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
	public int anInt952;

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
	public int anInt953 = -1;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I)V")
	public Class5_Sub8(@OriginalArg(0) int arg0) {
		this.anInt953 = arg0;
	}
}
