import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class41_Sub5 extends Class41 {

	@OriginalMember(owner = "client!l", name = "s", descriptor = "B")
	public final byte aByte79;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "I")
	public int anInt5893;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "B")
	public final byte aByte78;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "B")
	public final byte aByte77;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "[S")
	public final short[] aShortArray74;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "[B")
	public final byte[] aByteArray57;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class41_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte79 = (byte) arg0;
		this.aByte76 = (byte) arg1;
		this.anInt5893 = arg2;
		this.aByte78 = (byte) arg3;
		this.aByte77 = (byte) arg4;
		this.aShortArray74 = arg5;
		this.aByteArray57 = arg6;
	}
}
