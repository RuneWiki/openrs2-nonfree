import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public final class Class41_Sub4 extends Class41 {

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "B")
	public final byte aByte45;

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
	public int anInt4147;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "B")
	public final byte aByte46;

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "B")
	public final byte aByte44;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "[S")
	public final short[] aShortArray65;

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "[B")
	public final byte[] aByteArray46;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class41_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte47 = (byte) arg0;
		this.aByte45 = (byte) arg1;
		this.anInt4147 = arg2;
		this.aByte46 = (byte) arg3;
		this.aByte44 = (byte) arg4;
		this.aShortArray65 = arg5;
		this.aByteArray46 = arg6;
	}
}
