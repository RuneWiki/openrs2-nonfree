import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!as", name = "m", descriptor = "B")
	public final byte aByte5;

	@OriginalMember(owner = "client!as", name = "q", descriptor = "B")
	public final byte aByte8;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "B")
	public final byte aByte7;

	@OriginalMember(owner = "client!as", name = "o", descriptor = "B")
	public final byte aByte6;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "[S")
	public final short[] aShortArray15;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "[B")
	public final byte[] aByteArray15;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte5 = (byte) arg0;
		this.aByte8 = (byte) arg1;
		this.anInt391 = arg2;
		this.aByte7 = (byte) arg3;
		this.aByte6 = (byte) arg4;
		this.aShortArray15 = arg5;
		this.aByteArray15 = arg6;
	}
}
