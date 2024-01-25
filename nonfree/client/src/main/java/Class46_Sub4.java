import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class46_Sub4 extends Class46 {

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "B")
	public final byte aByte48;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "B")
	public final byte aByte49;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	public int anInt3010;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "B")
	public final byte aByte46;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "[S")
	public final short[] aShortArray65;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "[B")
	public final byte[] aByteArray40;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class46_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte48 = (byte) arg0;
		this.aByte49 = (byte) arg1;
		this.anInt3010 = arg2;
		this.aByte47 = (byte) arg3;
		this.aByte46 = (byte) arg4;
		this.aShortArray65 = arg5;
		this.aByteArray40 = arg6;
	}
}
