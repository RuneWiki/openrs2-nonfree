import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "B")
	public final byte aByte40;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "B")
	public final byte aByte38;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
	public int anInt2999;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "B")
	public final byte aByte41;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "[S")
	public final short[] aShortArray44;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "[B")
	public final byte[] aByteArray30;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte40 = (byte) arg0;
		this.aByte38 = (byte) arg1;
		this.anInt2999 = arg2;
		this.aByte39 = (byte) arg3;
		this.aByte41 = (byte) arg4;
		this.aShortArray44 = arg5;
		this.aByteArray30 = arg6;
	}
}
