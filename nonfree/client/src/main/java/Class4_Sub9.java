import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "B")
	public final byte aByte114;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "B")
	public final byte aByte112;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
	public int anInt8546;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "B")
	public final byte aByte113;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "B")
	public final byte aByte115;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "[S")
	public final short[] aShortArray123;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "[B")
	public final byte[] aByteArray96;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class4_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte114 = (byte) arg0;
		this.aByte112 = (byte) arg1;
		this.anInt8546 = arg2;
		this.aByte113 = (byte) arg3;
		this.aByte115 = (byte) arg4;
		this.aShortArray123 = arg5;
		this.aByteArray96 = arg6;
	}
}
