import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class21_Sub10 extends Class21 {

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "B")
	public final byte aByte119;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "B")
	public final byte aByte117;

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
	public int anInt8879;

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "B")
	public final byte aByte120;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "B")
	public final byte aByte118;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "[S")
	public final short[] aShortArray127;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "[B")
	public final byte[] aByteArray87;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class21_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte119 = (byte) arg0;
		this.aByte117 = (byte) arg1;
		this.anInt8879 = arg2;
		this.aByte120 = (byte) arg3;
		this.aByte118 = (byte) arg4;
		this.aShortArray127 = arg5;
		this.aByteArray87 = arg6;
	}
}
