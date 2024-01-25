import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public final class Class124 {

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Lclient!gf;")
	public Interface6 anInterface6_4;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "B")
	public byte aByte59;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "S")
	public final short aShort59;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "B")
	public final byte aByte58;

	static {
		new Class242("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!gf;III)V")
	public Class124(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface6_4 = arg0;
		this.aByte59 = (byte) arg3;
		this.aShort59 = (short) arg1;
		this.aByte58 = (byte) arg2;
	}
}
