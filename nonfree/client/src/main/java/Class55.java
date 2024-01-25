import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class55 {

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "Lclient!wia;")
	public Interface27 anInterface27_2;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "B")
	public byte aByte36;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "S")
	public final short aShort25;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "B")
	public final byte aByte35;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!wia;III)V")
	public Class55(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface27_2 = arg0;
		this.aByte36 = (byte) arg3;
		this.aShort25 = (short) arg1;
		this.aByte35 = (byte) arg2;
	}
}
