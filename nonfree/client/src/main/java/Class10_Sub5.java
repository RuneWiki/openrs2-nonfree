import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public final class Class10_Sub5 extends Class10 {

	@OriginalMember(owner = "client!os", name = "n", descriptor = "B")
	public final byte aByte56;

	@OriginalMember(owner = "client!os", name = "k", descriptor = "B")
	public final byte aByte54;

	@OriginalMember(owner = "client!os", name = "l", descriptor = "I")
	public int anInt4707;

	@OriginalMember(owner = "client!os", name = "m", descriptor = "B")
	public final byte aByte55;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "B")
	public final byte aByte53;

	@OriginalMember(owner = "client!os", name = "i", descriptor = "[S")
	public final short[] aShortArray89;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "[B")
	public final byte[] aByteArray81;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class10_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte56 = (byte) arg0;
		this.aByte54 = (byte) arg1;
		this.anInt4707 = arg2;
		this.aByte55 = (byte) arg3;
		this.aByte53 = (byte) arg4;
		this.aShortArray89 = arg5;
		this.aByteArray81 = arg6;
	}
}
