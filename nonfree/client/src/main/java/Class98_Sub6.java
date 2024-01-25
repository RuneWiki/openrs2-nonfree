import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class98_Sub6 extends Class98 {

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "B")
	public final byte aByte82;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "B")
	public final byte aByte79;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
	public int anInt7529;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "B")
	public final byte aByte80;

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "B")
	public final byte aByte81;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "[S")
	public final short[] aShortArray116;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "[B")
	public final byte[] aByteArray95;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class98_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte82 = (byte) arg0;
		this.aByte79 = (byte) arg1;
		this.anInt7529 = arg2;
		this.aByte80 = (byte) arg3;
		this.aByte81 = (byte) arg4;
		this.aShortArray116 = arg5;
		this.aByteArray95 = arg6;
	}
}
