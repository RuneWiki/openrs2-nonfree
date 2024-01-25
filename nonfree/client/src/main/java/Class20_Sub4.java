import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "B")
	public final byte aByte58;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "B")
	public final byte aByte60;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
	public int anInt2761;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "[S")
	public final short[] aShortArray37;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "[B")
	public final byte[] aByteArray24;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class20_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte58 = (byte) arg0;
		this.aByte60 = (byte) arg1;
		this.anInt2761 = arg2;
		this.aByte59 = (byte) arg3;
		this.aByte61 = (byte) arg4;
		this.aShortArray37 = arg5;
		this.aByteArray24 = arg6;
	}
}
