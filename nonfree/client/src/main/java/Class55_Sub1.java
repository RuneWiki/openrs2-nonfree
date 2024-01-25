import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class55_Sub1 extends Class55 {

	@OriginalMember(owner = "client!el", name = "m", descriptor = "B")
	public final byte aByte16;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "B")
	public final byte aByte14;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "I")
	public int anInt1614;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "B")
	public final byte aByte15;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "B")
	public final byte aByte13;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "[S")
	public final short[] aShortArray51;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "[B")
	public final byte[] aByteArray35;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class55_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte16 = (byte) arg0;
		this.aByte14 = (byte) arg1;
		this.anInt1614 = arg2;
		this.aByte15 = (byte) arg3;
		this.aByte13 = (byte) arg4;
		this.aShortArray51 = arg5;
		this.aByteArray35 = arg6;
	}
}
