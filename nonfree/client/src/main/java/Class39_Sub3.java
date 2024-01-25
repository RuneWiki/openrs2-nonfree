import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class39_Sub3 extends Class39 {

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "B")
	public final byte aByte24;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "B")
	public final byte aByte26;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
	public int anInt1890;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "B")
	public final byte aByte25;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "B")
	public final byte aByte27;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "[S")
	public final short[] aShortArray37;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "[B")
	public final byte[] aByteArray31;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class39_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte24 = (byte) arg0;
		this.aByte26 = (byte) arg1;
		this.anInt1890 = arg2;
		this.aByte25 = (byte) arg3;
		this.aByte27 = (byte) arg4;
		this.aShortArray37 = arg5;
		this.aByteArray31 = arg6;
	}
}
