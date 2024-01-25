import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "B")
	public final byte aByte34;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "B")
	public final byte aByte32;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
	public int anInt3873;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "B")
	public final byte aByte31;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "[S")
	public final short[] aShortArray65;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "[B")
	public final byte[] aByteArray61;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte34 = (byte) arg0;
		this.aByte32 = (byte) arg1;
		this.anInt3873 = arg2;
		this.aByte31 = (byte) arg3;
		this.aByte33 = (byte) arg4;
		this.aShortArray65 = arg5;
		this.aByteArray61 = arg6;
	}
}
