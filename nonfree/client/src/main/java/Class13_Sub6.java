import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class13_Sub6 extends Class13 {

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "B")
	public final byte aByte102;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "B")
	public final byte aByte100;

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
	public int anInt6973;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "B")
	public final byte aByte101;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "B")
	public final byte aByte103;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "[S")
	public final short[] aShortArray87;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "[B")
	public final byte[] aByteArray73;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class13_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte102 = (byte) arg0;
		this.aByte100 = (byte) arg1;
		this.anInt6973 = arg2;
		this.aByte101 = (byte) arg3;
		this.aByte103 = (byte) arg4;
		this.aShortArray87 = arg5;
		this.aByteArray73 = arg6;
	}
}
