import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class57_Sub7 extends Class57 {

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
	public int anInt5373;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "B")
	public final byte aByte78;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "B")
	public final byte aByte77;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "[S")
	public final short[] aShortArray84;

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "[B")
	public final byte[] aByteArray68;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class57_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte75 = (byte) arg0;
		this.aByte76 = (byte) arg1;
		this.anInt5373 = arg2;
		this.aByte78 = (byte) arg3;
		this.aByte77 = (byte) arg4;
		this.aShortArray84 = arg5;
		this.aByteArray68 = arg6;
	}
}
