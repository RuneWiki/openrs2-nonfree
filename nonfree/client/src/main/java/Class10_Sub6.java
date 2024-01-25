import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class10_Sub6 extends Class10 {

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "B")
	public final byte aByte42;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "B")
	public final byte aByte43;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
	public int anInt4290;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "B")
	public final byte aByte45;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "B")
	public final byte aByte44;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "[S")
	public final short[] aShortArray76;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "[B")
	public final byte[] aByteArray74;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class10_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte42 = (byte) arg0;
		this.aByte43 = (byte) arg1;
		this.anInt4290 = arg2;
		this.aByte45 = (byte) arg3;
		this.aByte44 = (byte) arg4;
		this.aShortArray76 = arg5;
		this.aByteArray74 = arg6;
	}
}
