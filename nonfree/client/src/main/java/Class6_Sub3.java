import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!da", name = "m", descriptor = "B")
	public final byte aByte27;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "B")
	public final byte aByte28;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "I")
	public int anInt1610;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "B")
	public final byte aByte25;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "B")
	public final byte aByte26;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "[S")
	public final short[] aShortArray39;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "[B")
	public final byte[] aByteArray40;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class6_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte27 = (byte) arg0;
		this.aByte28 = (byte) arg1;
		this.anInt1610 = arg2;
		this.aByte25 = (byte) arg3;
		this.aByte26 = (byte) arg4;
		this.aShortArray39 = arg5;
		this.aByteArray40 = arg6;
	}
}
