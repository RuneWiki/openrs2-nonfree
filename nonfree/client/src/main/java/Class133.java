import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class133 {

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "B")
	public byte aByte36;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "B")
	public final byte aByte35;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "S")
	public final short aShort33;

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "Lclient!fba;")
	public Interface10 anInterface10_2;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!fba;III)V")
	public Class133(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte36 = (byte) arg3;
		this.aByte35 = (byte) arg2;
		this.aShort33 = (short) arg1;
		this.anInterface10_2 = arg0;
	}
}
