import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!he", name = "p", descriptor = "B")
	public final byte aByte60;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "I")
	public int anInt2780;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "B")
	public final byte aByte58;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "[S")
	public final short[] aShortArray37;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "[B")
	public final byte[] aByteArray50;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte60 = (byte) arg0;
		this.aByte61 = (byte) arg1;
		this.anInt2780 = arg2;
		this.aByte58 = (byte) arg3;
		this.aByte59 = (byte) arg4;
		this.aShortArray37 = arg5;
		this.aByteArray50 = arg6;
	}
}
