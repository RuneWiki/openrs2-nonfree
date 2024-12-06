import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class ClientInvCache extends Linkable {

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "[I")
	public int[] anIntArray272 = new int[1];

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "[I")
	public int[] anIntArray273 = new int[] { -1 };
}
