import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "B")
	public final byte aByte2;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "B")
	public final byte aByte4;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	public int anInt224;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "B")
	public final byte aByte1;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "B")
	public final byte aByte3;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "[S")
	public final short[] aShortArray1;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "[B")
	public final byte[] aByteArray2;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte2 = (byte) arg0;
		this.aByte4 = (byte) arg1;
		this.anInt224 = arg2;
		this.aByte1 = (byte) arg3;
		this.aByte3 = (byte) arg4;
		this.aShortArray1 = arg5;
		this.aByteArray2 = arg6;
	}
}
