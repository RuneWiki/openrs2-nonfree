import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class88_Sub7 extends Class88 {

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "B")
	public final byte aByte94;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "B")
	public final byte aByte96;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
	public int anInt6408;

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "B")
	public final byte aByte95;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "B")
	public final byte aByte93;

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "[S")
	public final short[] aShortArray109;

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "[B")
	public final byte[] aByteArray85;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class88_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte94 = (byte) arg0;
		this.aByte96 = (byte) arg1;
		this.anInt6408 = arg2;
		this.aByte95 = (byte) arg3;
		this.aByte93 = (byte) arg4;
		this.aShortArray109 = arg5;
		this.aByteArray85 = arg6;
	}
}
