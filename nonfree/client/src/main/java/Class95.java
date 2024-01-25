import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class95 {

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "B")
	public final byte aByte51;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Z")
	public final boolean aBoolean180;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "S")
	public final short aShort50;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
	public final int anInt2379;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
	public final int anInt2378;

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "S")
	public final short aShort49;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "S")
	public final short aShort48;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "B")
	public final byte aByte52;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aByte51 = (byte) arg8;
		this.aBoolean180 = arg9;
		this.aShort50 = (short) arg4;
		this.anInt2379 = arg0;
		this.anInt2378 = arg10;
		this.aShort49 = (short) arg6;
		this.aShort48 = (short) arg5;
		this.aByte52 = (byte) arg7;
	}
}
