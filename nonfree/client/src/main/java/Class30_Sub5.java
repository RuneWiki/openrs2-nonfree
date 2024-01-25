import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public final class Class30_Sub5 extends Class30 {

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	public int anInt6112;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "B")
	public final byte aByte60;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "B")
	public final byte aByte58;

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "[S")
	public final short[] aShortArray83;

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "[B")
	public final byte[] aByteArray81;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class30_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte61 = (byte) arg0;
		this.aByte59 = (byte) arg1;
		this.anInt6112 = arg2;
		this.aByte60 = (byte) arg3;
		this.aByte58 = (byte) arg4;
		this.aShortArray83 = arg5;
		this.aByteArray81 = arg6;
	}
}
