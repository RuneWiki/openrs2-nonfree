import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public final class Class41_Sub8 extends Class41 {

	@OriginalMember(owner = "client!s", name = "i", descriptor = "B")
	public final byte aByte93;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "B")
	public final byte aByte95;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public int anInt6351;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "B")
	public final byte aByte92;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "B")
	public final byte aByte94;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "[S")
	public final short[] aShortArray96;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "[B")
	public final byte[] aByteArray82;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class41_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte93 = (byte) arg0;
		this.aByte95 = (byte) arg1;
		this.anInt6351 = arg2;
		this.aByte92 = (byte) arg3;
		this.aByte94 = (byte) arg4;
		this.aShortArray96 = arg5;
		this.aByteArray82 = arg6;
	}
}
