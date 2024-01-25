import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "B")
	public final byte aByte10;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "B")
	public final byte aByte12;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "B")
	public final byte aByte13;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "B")
	public final byte aByte11;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "[S")
	public final short[] aShortArray15;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "[B")
	public final byte[] aByteArray16;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class22_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte10 = (byte) arg0;
		this.aByte12 = (byte) arg1;
		this.anInt691 = arg2;
		this.aByte13 = (byte) arg3;
		this.aByte11 = (byte) arg4;
		this.aShortArray15 = arg5;
		this.aByteArray16 = arg6;
	}
}
