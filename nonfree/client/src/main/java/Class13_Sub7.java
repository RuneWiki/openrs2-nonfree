import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class13_Sub7 extends Class13 {

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
	public int anInt4389;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "B")
	public final byte aByte58;

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "B")
	public final byte aByte60;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "[S")
	public final short[] aShortArray48;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "[B")
	public final byte[] aByteArray49;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class13_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte61 = (byte) arg0;
		this.aByte59 = (byte) arg1;
		this.anInt4389 = arg2;
		this.aByte58 = (byte) arg3;
		this.aByte60 = (byte) arg4;
		this.aShortArray48 = arg5;
		this.aByteArray49 = arg6;
	}
}
