import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "B")
	public final byte aByte11;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "B")
	public final byte aByte8;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	public int anInt1011;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "B")
	public final byte aByte9;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "B")
	public final byte aByte10;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "[S")
	public final short[] aShortArray11;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "[B")
	public final byte[] aByteArray10;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class40_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte11 = (byte) arg0;
		this.aByte8 = (byte) arg1;
		this.anInt1011 = arg2;
		this.aByte9 = (byte) arg3;
		this.aByte10 = (byte) arg4;
		this.aShortArray11 = arg5;
		this.aByteArray10 = arg6;
	}
}
