import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "B")
	public final byte aByte32;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
	public int anInt3790;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "B")
	public final byte aByte34;

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "B")
	public final byte aByte31;

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "[S")
	public final short[] aShortArray88;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "[B")
	public final byte[] aByteArray106;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte33 = (byte) arg0;
		this.aByte32 = (byte) arg1;
		this.anInt3790 = arg2;
		this.aByte34 = (byte) arg3;
		this.aByte31 = (byte) arg4;
		this.aShortArray88 = arg5;
		this.aByteArray106 = arg6;
	}
}
