import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public final class Class115 {

	@OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
	public final int anInt3372;

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "B")
	public final byte aByte69;

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "S")
	public final short aShort44;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "S")
	public final short aShort42;

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "S")
	public final short aShort43;

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "Z")
	public final boolean aBoolean264;

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
	public final int anInt3367;

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "B")
	public final byte aByte70;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt3372 = arg0;
		this.aByte69 = (byte) arg8;
		this.aShort44 = (short) arg4;
		this.aShort42 = (short) arg6;
		this.aShort43 = (short) arg5;
		this.aBoolean264 = arg9;
		this.anInt3367 = arg10;
		this.aByte70 = (byte) arg7;
	}
}
