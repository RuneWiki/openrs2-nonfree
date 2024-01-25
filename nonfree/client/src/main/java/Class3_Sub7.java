import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "B")
	public final byte aByte73;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
	public int anInt6604;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[S")
	public final short[] aShortArray236;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[B")
	public final byte[] aByteArray93;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class3_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte74 = (byte) arg0;
		this.aByte73 = (byte) arg1;
		this.anInt6604 = arg2;
		this.aByte75 = (byte) arg3;
		this.aByte76 = (byte) arg4;
		this.aShortArray236 = arg5;
		this.aByteArray93 = arg6;
	}
}
