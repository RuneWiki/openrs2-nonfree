import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!co", name = "l", descriptor = "I")
	public int anInt1427;

	@OriginalMember(owner = "client!co", name = "r", descriptor = "I")
	public int anInt1428;

	@OriginalMember(owner = "client!co", name = "o", descriptor = "I")
	public int anInt1430;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "I")
	public int anInt1431;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "I")
	public int anInt1432;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!co", name = "q", descriptor = "I")
	public int anInt1429 = -1;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(I)V")
	public Class5_Sub8(@OriginalArg(0) int arg0) {
		this.anInt1429 = arg0;
	}
}
