import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class60_Sub7 extends Class60 {

	@OriginalMember(owner = "client!to", name = "j", descriptor = "B")
	public final byte aByte93;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "B")
	public final byte aByte92;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "I")
	public int anInt8758;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "B")
	public final byte aByte94;

	@OriginalMember(owner = "client!to", name = "m", descriptor = "B")
	public final byte aByte95;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "[S")
	public final short[] aShortArray142;

	@OriginalMember(owner = "client!to", name = "i", descriptor = "[B")
	public final byte[] aByteArray103;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class60_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte93 = (byte) arg0;
		this.aByte92 = (byte) arg1;
		this.anInt8758 = arg2;
		this.aByte94 = (byte) arg3;
		this.aByte95 = (byte) arg4;
		this.aShortArray142 = arg5;
		this.aByteArray103 = arg6;
	}
}
