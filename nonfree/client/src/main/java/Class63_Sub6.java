import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class63_Sub6 extends Class63 {

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "B")
	public final byte aByte60;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
	public int anInt5481;

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "B")
	public final byte aByte58;

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "B")
	public final byte aByte57;

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "[S")
	public final short[] aShortArray89;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "[B")
	public final byte[] aByteArray78;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class63_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte59 = (byte) arg0;
		this.aByte60 = (byte) arg1;
		this.anInt5481 = arg2;
		this.aByte58 = (byte) arg3;
		this.aByte57 = (byte) arg4;
		this.aShortArray89 = arg5;
		this.aByteArray78 = arg6;
	}
}
