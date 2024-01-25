import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class12_Sub3 extends Class12 {

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "B")
	public final byte aByte41;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "B")
	public final byte aByte40;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
	public int anInt1657;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "B")
	public final byte aByte43;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "B")
	public final byte aByte42;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "[S")
	public final short[] aShortArray14;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "[B")
	public final byte[] aByteArray22;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class12_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte41 = (byte) arg0;
		this.aByte40 = (byte) arg1;
		this.anInt1657 = arg2;
		this.aByte43 = (byte) arg3;
		this.aByte42 = (byte) arg4;
		this.aShortArray14 = arg5;
		this.aByteArray22 = arg6;
	}
}
