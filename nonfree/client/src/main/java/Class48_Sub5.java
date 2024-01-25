import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class48_Sub5 extends Class48 {

	@OriginalMember(owner = "client!j", name = "l", descriptor = "B")
	public final byte aByte37;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "B")
	public final byte aByte38;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "I")
	public int anInt3068;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "B")
	public final byte aByte36;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "[S")
	public final short[] aShortArray56;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "[B")
	public final byte[] aByteArray41;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class48_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte37 = (byte) arg0;
		this.aByte38 = (byte) arg1;
		this.anInt3068 = arg2;
		this.aByte36 = (byte) arg3;
		this.aByte39 = (byte) arg4;
		this.aShortArray56 = arg5;
		this.aByteArray41 = arg6;
	}
}
