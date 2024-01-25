import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!b", name = "q", descriptor = "B")
	public final byte aByte5;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "B")
	public final byte aByte3;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "I")
	public int anInt382;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "B")
	public final byte aByte2;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "B")
	public final byte aByte4;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "[S")
	public final short[] aShortArray12;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "[B")
	public final byte[] aByteArray8;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte5 = (byte) arg0;
		this.aByte3 = (byte) arg1;
		this.anInt382 = arg2;
		this.aByte2 = (byte) arg3;
		this.aByte4 = (byte) arg4;
		this.aShortArray12 = arg5;
		this.aByteArray8 = arg6;
	}
}
