import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public final class Class11_Sub8 extends Class11 {

	@OriginalMember(owner = "client!tba", name = "i", descriptor = "B")
	public final byte aByte113;

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "B")
	public final byte aByte116;

	@OriginalMember(owner = "client!tba", name = "o", descriptor = "I")
	public int anInt8940;

	@OriginalMember(owner = "client!tba", name = "j", descriptor = "B")
	public final byte aByte114;

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "B")
	public final byte aByte115;

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "[S")
	public final short[] aShortArray118;

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "[B")
	public final byte[] aByteArray92;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class11_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte113 = (byte) arg0;
		this.aByte116 = (byte) arg1;
		this.anInt8940 = arg2;
		this.aByte114 = (byte) arg3;
		this.aByte115 = (byte) arg4;
		this.aShortArray118 = arg5;
		this.aByteArray92 = arg6;
	}
}
