import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public final class Class8_Sub9 extends Class8 {

	@OriginalMember(owner = "client!sba", name = "o", descriptor = "B")
	public final byte aByte127;

	@OriginalMember(owner = "client!sba", name = "s", descriptor = "B")
	public final byte aByte130;

	@OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
	public int anInt8910;

	@OriginalMember(owner = "client!sba", name = "p", descriptor = "B")
	public final byte aByte129;

	@OriginalMember(owner = "client!sba", name = "q", descriptor = "B")
	public final byte aByte128;

	@OriginalMember(owner = "client!sba", name = "m", descriptor = "[S")
	public final short[] aShortArray116;

	@OriginalMember(owner = "client!sba", name = "r", descriptor = "[B")
	public final byte[] aByteArray84;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class8_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte127 = (byte) arg0;
		this.aByte130 = (byte) arg1;
		this.anInt8910 = arg2;
		this.aByte129 = (byte) arg3;
		this.aByte128 = (byte) arg4;
		this.aShortArray116 = arg5;
		this.aByteArray84 = arg6;
	}
}
