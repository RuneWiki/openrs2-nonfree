import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public final class Class9_Sub4 extends Class9 {

	@OriginalMember(owner = "client!gba", name = "o", descriptor = "B")
	public final byte aByte49;

	@OriginalMember(owner = "client!gba", name = "m", descriptor = "B")
	public final byte aByte48;

	@OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
	public int anInt3263;

	@OriginalMember(owner = "client!gba", name = "l", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!gba", name = "k", descriptor = "B")
	public final byte aByte46;

	@OriginalMember(owner = "client!gba", name = "n", descriptor = "[S")
	public final short[] aShortArray75;

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "[B")
	public final byte[] aByteArray34;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class9_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte49 = (byte) arg0;
		this.aByte48 = (byte) arg1;
		this.anInt3263 = arg2;
		this.aByte47 = (byte) arg3;
		this.aByte46 = (byte) arg4;
		this.aShortArray75 = arg5;
		this.aByteArray34 = arg6;
	}
}
