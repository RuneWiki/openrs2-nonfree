import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class41_Sub8 extends Class41 {

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "B")
	public final byte aByte77;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
	public int anInt6296;

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "[S")
	public final short[] aShortArray121;

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "[B")
	public final byte[] aByteArray97;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class41_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte75 = (byte) arg0;
		this.aByte77 = (byte) arg1;
		this.anInt6296 = arg2;
		this.aByte76 = (byte) arg3;
		this.aByte74 = (byte) arg4;
		this.aShortArray121 = arg5;
		this.aByteArray97 = arg6;
	}
}
