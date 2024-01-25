import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class55 {

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "S")
	public final short aShort18;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "B")
	public final byte aByte21;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
	public final int anInt2090;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public final int anInt2086;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "B")
	public final byte aByte20;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "Z")
	public final boolean aBoolean138;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "S")
	public final short aShort17;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "S")
	public final short aShort19;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort18 = (short) arg6;
		this.aByte21 = (byte) arg8;
		this.anInt2090 = arg10;
		this.anInt2086 = arg0;
		this.aByte20 = (byte) arg7;
		this.aBoolean138 = arg9;
		this.aShort17 = (short) arg4;
		this.aShort19 = (short) arg5;
	}
}
