import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class297 {

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "B")
	public final byte aByte112;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
	public final int anInt8649;

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "S")
	public final short aShort98;

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "Z")
	public final boolean aBoolean609;

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "S")
	public final short aShort100;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "B")
	public final byte aByte111;

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
	public final int anInt8651;

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "S")
	public final short aShort99;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aByte112 = (byte) arg7;
		this.anInt8649 = arg10;
		this.aShort98 = (short) arg4;
		this.aBoolean609 = arg9;
		this.aShort100 = (short) arg5;
		this.aByte111 = (byte) arg8;
		this.anInt8651 = arg0;
		this.aShort99 = (short) arg6;
	}
}
