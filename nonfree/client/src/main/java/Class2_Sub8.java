import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "B")
	public final byte aByte71;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "B")
	public final byte aByte69;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
	public int anInt6428;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "B")
	public final byte aByte70;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "B")
	public final byte aByte72;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "[S")
	public final short[] aShortArray107;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "[B")
	public final byte[] aByteArray90;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte71 = (byte) arg0;
		this.aByte69 = (byte) arg1;
		this.anInt6428 = arg2;
		this.aByte70 = (byte) arg3;
		this.aByte72 = (byte) arg4;
		this.aShortArray107 = arg5;
		this.aByteArray90 = arg6;
	}
}
