import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "B")
	public final byte aByte12;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "B")
	public final byte aByte13;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
	public int anInt1084;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "B")
	public final byte aByte15;

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "B")
	public final byte aByte14;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "[S")
	public final short[] aShortArray6;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "[B")
	public final byte[] aByteArray8;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class20_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte12 = (byte) arg0;
		this.aByte13 = (byte) arg1;
		this.anInt1084 = arg2;
		this.aByte15 = (byte) arg3;
		this.aByte14 = (byte) arg4;
		this.aShortArray6 = arg5;
		this.aByteArray8 = arg6;
	}
}
