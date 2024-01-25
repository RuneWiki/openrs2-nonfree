import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public final class Class55_Sub4 extends Class55 {

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "B")
	public final byte aByte41;

	@OriginalMember(owner = "client!iu", name = "o", descriptor = "B")
	public final byte aByte42;

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
	public int anInt4708;

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "B")
	public final byte aByte40;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "[S")
	public final short[] aShortArray67;

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "[B")
	public final byte[] aByteArray58;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class55_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte41 = (byte) arg0;
		this.aByte42 = (byte) arg1;
		this.anInt4708 = arg2;
		this.aByte40 = (byte) arg3;
		this.aByte39 = (byte) arg4;
		this.aShortArray67 = arg5;
		this.aByteArray58 = arg6;
	}
}
