import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "B")
	public final byte aByte104;

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "B")
	public final byte aByte106;

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
	public int anInt9036;

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "B")
	public final byte aByte105;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "B")
	public final byte aByte103;

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "[S")
	public final short[] aShortArray193;

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "[B")
	public final byte[] aByteArray111;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class4_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte104 = (byte) arg0;
		this.aByte106 = (byte) arg1;
		this.anInt9036 = arg2;
		this.aByte105 = (byte) arg3;
		this.aByte103 = (byte) arg4;
		this.aShortArray193 = arg5;
		this.aByteArray111 = arg6;
	}
}
