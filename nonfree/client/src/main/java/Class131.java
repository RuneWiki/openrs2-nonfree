import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class131 {

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "S")
	public final short aShort36;

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "B")
	public byte aByte46;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "Lclient!nl;")
	public Interface18 anInterface18_3;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!nl;III)V")
	public Class131(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort36 = (short) arg1;
		this.aByte46 = (byte) arg3;
		this.aByte47 = (byte) arg2;
		this.anInterface18_3 = arg0;
	}
}
