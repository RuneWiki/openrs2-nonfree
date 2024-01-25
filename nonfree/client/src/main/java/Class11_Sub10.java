import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class11_Sub10 extends Class11 {

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "B")
	public final byte aByte98;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "B")
	public final byte aByte97;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
	public int anInt7280;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "B")
	public final byte aByte96;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "B")
	public final byte aByte95;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "[S")
	public final short[] aShortArray90;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class11_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte98 = (byte) arg0;
		this.aByte97 = (byte) arg1;
		this.anInt7280 = arg2;
		this.aByte96 = (byte) arg3;
		this.aByte95 = (byte) arg4;
		this.aShortArray90 = arg5;
		this.aByteArray71 = arg6;
	}
}
