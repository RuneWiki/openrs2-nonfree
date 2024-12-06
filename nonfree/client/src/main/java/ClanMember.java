import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class ClanMember extends Linkable {

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "B")
	public byte aByte1;

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "Lclient!ec;")
	public JagString aClass22_214;

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
	public int anInt822;
}
