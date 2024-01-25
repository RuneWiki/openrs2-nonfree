import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public final class Class36_Sub5 extends Class36 {

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "B")
	public final byte aByte62;

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
	public int anInt4216;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "B")
	public final byte aByte60;

	@OriginalMember(owner = "client!lu", name = "q", descriptor = "[S")
	public final short[] aShortArray70;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "[B")
	public final byte[] aByteArray49;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class36_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte62 = (byte) arg0;
		this.aByte59 = (byte) arg1;
		this.anInt4216 = arg2;
		this.aByte61 = (byte) arg3;
		this.aByte60 = (byte) arg4;
		this.aShortArray70 = arg5;
		this.aByteArray49 = arg6;
	}
}
