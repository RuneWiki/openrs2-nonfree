import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class18 {

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "B")
	public byte aByte3;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "S")
	public final short aShort7;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "Lclient!js;")
	public Interface10 anInterface10_1;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "B")
	public final byte aByte4;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!js;III)V")
	public Class18(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte3 = (byte) arg3;
		this.aShort7 = (short) arg1;
		this.anInterface10_1 = arg0;
		this.aByte4 = (byte) arg2;
	}
}
