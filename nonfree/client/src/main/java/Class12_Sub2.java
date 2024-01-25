import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!fq", name = "q", descriptor = "B")
	public final byte aByte32;

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "B")
	public final byte aByte29;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
	public int anInt2124;

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "B")
	public final byte aByte31;

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "B")
	public final byte aByte30;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "[S")
	public final short[] aShortArray42;

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "[B")
	public final byte[] aByteArray34;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte32 = (byte) arg0;
		this.aByte29 = (byte) arg1;
		this.anInt2124 = arg2;
		this.aByte31 = (byte) arg3;
		this.aByte30 = (byte) arg4;
		this.aShortArray42 = arg5;
		this.aByteArray34 = arg6;
	}
}
