import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class85 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "[S")
	public short[] aShortArray33;

	static {
		new Class231("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}
}
