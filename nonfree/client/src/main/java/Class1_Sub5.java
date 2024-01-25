import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "B")
	public final byte aByte32;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "B")
	public final byte aByte30;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public int anInt2821;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "B")
	public final byte aByte31;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "[S")
	public final short[] aShortArray32;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "[B")
	public final byte[] aByteArray28;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte32 = (byte) arg0;
		this.aByte30 = (byte) arg1;
		this.anInt2821 = arg2;
		this.aByte31 = (byte) arg3;
		this.aByte33 = (byte) arg4;
		this.aShortArray32 = arg5;
		this.aByteArray28 = arg6;
	}
}
