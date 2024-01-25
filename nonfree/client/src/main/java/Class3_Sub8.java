import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "B")
	public final byte aByte121;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "B")
	public final byte aByte120;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
	public int anInt9240;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "B")
	public final byte aByte118;

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "B")
	public final byte aByte119;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "[S")
	public final short[] aShortArray128;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "[B")
	public final byte[] aByteArray120;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class3_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte121 = (byte) arg0;
		this.aByte120 = (byte) arg1;
		this.anInt9240 = arg2;
		this.aByte118 = (byte) arg3;
		this.aByte119 = (byte) arg4;
		this.aShortArray128 = arg5;
		this.aByteArray120 = arg6;
	}
}
