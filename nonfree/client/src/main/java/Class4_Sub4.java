import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "B")
	public final byte aByte77;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
	public int anInt4870;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "B")
	public final byte aByte78;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "[S")
	public final short[] aShortArray74;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "[B")
	public final byte[] aByteArray57;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte75 = (byte) arg0;
		this.aByte77 = (byte) arg1;
		this.anInt4870 = arg2;
		this.aByte76 = (byte) arg3;
		this.aByte78 = (byte) arg4;
		this.aShortArray74 = arg5;
		this.aByteArray57 = arg6;
	}
}
