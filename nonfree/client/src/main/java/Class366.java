import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class366 {

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "B")
	public final byte aByte140;

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "S")
	public final short aShort120;

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
	public final int anInt9426;

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "S")
	public final short aShort118;

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "Z")
	public final boolean aBoolean730;

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
	public final int anInt9427;

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "S")
	public final short aShort119;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "B")
	public final byte aByte139;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aByte140 = (byte) arg8;
		this.aShort120 = (short) arg6;
		this.anInt9426 = arg0;
		this.aShort118 = (short) arg5;
		this.aBoolean730 = arg9;
		this.anInt9427 = arg10;
		this.aShort119 = (short) arg4;
		this.aByte139 = (byte) arg7;
	}
}
