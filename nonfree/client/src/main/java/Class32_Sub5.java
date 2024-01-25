import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public final class Class32_Sub5 extends Class32 {

	@OriginalMember(owner = "client!rq", name = "r", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!rq", name = "q", descriptor = "B")
	public final byte aByte60;

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
	public int anInt5486;

	@OriginalMember(owner = "client!rq", name = "s", descriptor = "B")
	public final byte aByte62;

	@OriginalMember(owner = "client!rq", name = "o", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "[S")
	public final short[] aShortArray90;

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "[B")
	public final byte[] aByteArray82;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class32_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte61 = (byte) arg0;
		this.aByte60 = (byte) arg1;
		this.anInt5486 = arg2;
		this.aByte62 = (byte) arg3;
		this.aByte59 = (byte) arg4;
		this.aShortArray90 = arg5;
		this.aByteArray82 = arg6;
	}
}
