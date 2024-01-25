import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "B")
	public final byte aByte133;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "B")
	public final byte aByte134;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	public int anInt9695;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "B")
	public final byte aByte135;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "B")
	public final byte aByte136;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "[S")
	public final short[] aShortArray140;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "[B")
	public final byte[] aByteArray97;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class4_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte133 = (byte) arg0;
		this.aByte134 = (byte) arg1;
		this.anInt9695 = arg2;
		this.aByte135 = (byte) arg3;
		this.aByte136 = (byte) arg4;
		this.aShortArray140 = arg5;
		this.aByteArray97 = arg6;
	}
}
