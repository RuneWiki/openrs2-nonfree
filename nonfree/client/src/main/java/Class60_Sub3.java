import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class60_Sub3 extends Class60 {

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "B")
	public final byte aByte66;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "B")
	public final byte aByte67;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	public int anInt4290;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "B")
	public final byte aByte64;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "B")
	public final byte aByte65;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "[S")
	public final short[] aShortArray46;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "[B")
	public final byte[] aByteArray28;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class60_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte66 = (byte) arg0;
		this.aByte67 = (byte) arg1;
		this.anInt4290 = arg2;
		this.aByte64 = (byte) arg3;
		this.aByte65 = (byte) arg4;
		this.aShortArray46 = arg5;
		this.aByteArray28 = arg6;
	}
}
