import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class26_Sub4 extends Class26 {

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "B")
	public final byte aByte64;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "B")
	public final byte aByte62;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
	public int anInt5041;

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "B")
	public final byte aByte63;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "[S")
	public final short[] aShortArray104;

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "[B")
	public final byte[] aByteArray57;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class26_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte64 = (byte) arg0;
		this.aByte62 = (byte) arg1;
		this.anInt5041 = arg2;
		this.aByte63 = (byte) arg3;
		this.aByte61 = (byte) arg4;
		this.aShortArray104 = arg5;
		this.aByteArray57 = arg6;
	}
}
