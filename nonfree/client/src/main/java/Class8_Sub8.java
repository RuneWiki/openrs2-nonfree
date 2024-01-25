import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class8_Sub8 extends Class8 {

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "B")
	public final byte aByte58;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "B")
	public final byte aByte56;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
	public int anInt5550;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "B")
	public final byte aByte57;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "[S")
	public final short[] aShortArray111;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "[B")
	public final byte[] aByteArray84;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class8_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte58 = (byte) arg0;
		this.aByte56 = (byte) arg1;
		this.anInt5550 = arg2;
		this.aByte59 = (byte) arg3;
		this.aByte57 = (byte) arg4;
		this.aShortArray111 = arg5;
		this.aByteArray84 = arg6;
	}
}
