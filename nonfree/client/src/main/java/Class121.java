import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class Class121 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "Z")
	public final boolean aBoolean332;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "B")
	public final byte aByte71;

	@OriginalMember(owner = "client!go", name = "l", descriptor = "I")
	public final int anInt4476;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "S")
	public final short aShort49;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "B")
	public final byte aByte70;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "S")
	public final short aShort50;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "S")
	public final short aShort51;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	public final int anInt4471;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aBoolean332 = arg9;
		this.aByte71 = (byte) arg8;
		this.anInt4476 = arg10;
		this.aShort49 = (short) arg5;
		this.aByte70 = (byte) arg7;
		this.aShort50 = (short) arg6;
		this.aShort51 = (short) arg4;
		this.anInt4471 = arg0;
	}
}
