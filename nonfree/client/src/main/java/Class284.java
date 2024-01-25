import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public final class Class284 {

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "S")
	public final short aShort91;

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "Lclient!ew;")
	public Interface10 anInterface10_6;

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "B")
	public final byte aByte95;

	@OriginalMember(owner = "client!rba", name = "k", descriptor = "B")
	public byte aByte96;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!ew;III)V")
	public Class284(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort91 = (short) arg1;
		this.anInterface10_6 = arg0;
		this.aByte95 = (byte) arg2;
		this.aByte96 = (byte) arg3;
	}
}
