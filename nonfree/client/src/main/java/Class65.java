import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class65 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "S")
	public final short aShort39;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!qd;")
	public Interface14 anInterface14_1;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "B")
	public final byte aByte36;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "B")
	public byte aByte35;

	static {
		new Class88("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!qd;III)V")
	public Class65(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort39 = (short) arg1;
		this.anInterface14_1 = arg0;
		this.aByte36 = (byte) arg2;
		this.aByte35 = (byte) arg3;
	}
}
