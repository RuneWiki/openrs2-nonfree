import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class57_Sub8 extends Class57 {

	@OriginalMember(owner = "client!up", name = "m", descriptor = "B")
	public final byte aByte71;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "B")
	public final byte aByte70;

	@OriginalMember(owner = "client!up", name = "o", descriptor = "I")
	public int anInt6493;

	@OriginalMember(owner = "client!up", name = "q", descriptor = "B")
	public final byte aByte73;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "B")
	public final byte aByte72;

	@OriginalMember(owner = "client!up", name = "k", descriptor = "[S")
	public final short[] aShortArray102;

	@OriginalMember(owner = "client!up", name = "p", descriptor = "[B")
	public final byte[] aByteArray88;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class57_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte71 = (byte) arg0;
		this.aByte70 = (byte) arg1;
		this.anInt6493 = arg2;
		this.aByte73 = (byte) arg3;
		this.aByte72 = (byte) arg4;
		this.aShortArray102 = arg5;
		this.aByteArray88 = arg6;
	}
}
