import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class8_Sub8 extends Class8 {

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "B")
	public final byte aByte62;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
	public int anInt5545;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "B")
	public final byte aByte64;

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "B")
	public final byte aByte63;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "[S")
	public final short[] aShortArray104;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "[B")
	public final byte[] aByteArray84;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class8_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte61 = (byte) arg0;
		this.aByte62 = (byte) arg1;
		this.anInt5545 = arg2;
		this.aByte64 = (byte) arg3;
		this.aByte63 = (byte) arg4;
		this.aShortArray104 = arg5;
		this.aByteArray84 = arg6;
	}
}
