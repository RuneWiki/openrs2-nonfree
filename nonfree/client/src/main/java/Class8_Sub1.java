import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "B")
	public final byte aByte3;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "B")
	public final byte aByte4;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
	public int anInt253;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "B")
	public final byte aByte5;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "B")
	public final byte aByte2;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "[S")
	public final short[] aShortArray8;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "[B")
	public final byte[] aByteArray14;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte3 = (byte) arg0;
		this.aByte4 = (byte) arg1;
		this.anInt253 = arg2;
		this.aByte5 = (byte) arg3;
		this.aByte2 = (byte) arg4;
		this.aShortArray8 = arg5;
		this.aByteArray14 = arg6;
	}
}
