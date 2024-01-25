import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class178 {

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "S")
	public final short aShort62;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	public final int anInt4615;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "B")
	public final byte aByte48;

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
	public final int anInt4612;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "S")
	public final short aShort63;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "Z")
	public final boolean aBoolean331;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	public final int anInt4614;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "S")
	public final short aShort61;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
	public final int anInt4610;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "B")
	public final byte aByte49;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
	public final int anInt4613;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort62 = (short) arg6;
		this.anInt4615 = arg1;
		this.aByte48 = (byte) arg7;
		this.anInt4612 = arg11;
		this.aShort63 = (short) arg4;
		this.aBoolean331 = arg10;
		this.anInt4614 = arg2;
		this.aShort61 = (short) arg5;
		this.anInt4610 = arg3;
		this.aByte49 = (byte) arg8;
		this.anInt4613 = arg0;
	}
}
