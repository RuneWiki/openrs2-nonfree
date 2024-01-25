import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class28_Sub4 extends Class28 {

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "B")
	public final byte aByte101;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "B")
	public final byte aByte102;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
	public int anInt6749;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "B")
	public final byte aByte103;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "B")
	public final byte aByte104;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "[S")
	public final short[] aShortArray80;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "[B")
	public final byte[] aByteArray58;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class28_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte101 = (byte) arg0;
		this.aByte102 = (byte) arg1;
		this.anInt6749 = arg2;
		this.aByte103 = (byte) arg3;
		this.aByte104 = (byte) arg4;
		this.aShortArray80 = arg5;
		this.aByteArray58 = arg6;
	}
}
