import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "B")
	public final byte aByte89;

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "B")
	public final byte aByte91;

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
	public int anInt7565;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "B")
	public final byte aByte88;

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "B")
	public final byte aByte90;

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "[S")
	public final short[] aShortArray95;

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "[B")
	public final byte[] aByteArray85;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte89 = (byte) arg0;
		this.aByte91 = (byte) arg1;
		this.anInt7565 = arg2;
		this.aByte88 = (byte) arg3;
		this.aByte90 = (byte) arg4;
		this.aShortArray95 = arg5;
		this.aByteArray85 = arg6;
	}
}
