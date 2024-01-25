import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class117 {

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "B")
	public final byte aByte44;

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "B")
	public byte aByte45;

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "S")
	public final short aShort53;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "Lclient!gb;")
	public Interface10 anInterface10_3;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!gb;III)V")
	public Class117(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte44 = (byte) arg2;
		this.aByte45 = (byte) arg3;
		this.aShort53 = (short) arg1;
		this.anInterface10_3 = arg0;
	}
}
