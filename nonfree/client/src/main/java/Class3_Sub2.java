import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "B")
	public final byte aByte16;

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "B")
	public final byte aByte15;

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
	public int anInt1463;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "B")
	public final byte aByte14;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "B")
	public final byte aByte13;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "[S")
	public final short[] aShortArray15;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "[B")
	public final byte[] aByteArray21;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte16 = (byte) arg0;
		this.aByte15 = (byte) arg1;
		this.anInt1463 = arg2;
		this.aByte14 = (byte) arg3;
		this.aByte13 = (byte) arg4;
		this.aShortArray15 = arg5;
		this.aByteArray21 = arg6;
	}
}
