import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public final class Class36_Sub4 extends Class36 {

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "B")
	public final byte aByte38;

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "B")
	public final byte aByte35;

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
	public int anInt2701;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "B")
	public final byte aByte36;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "B")
	public final byte aByte37;

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "[S")
	public final short[] aShortArray47;

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "[B")
	public final byte[] aByteArray29;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class36_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte38 = (byte) arg0;
		this.aByte35 = (byte) arg1;
		this.anInt2701 = arg2;
		this.aByte36 = (byte) arg3;
		this.aByte37 = (byte) arg4;
		this.aShortArray47 = arg5;
		this.aByteArray29 = arg6;
	}
}
