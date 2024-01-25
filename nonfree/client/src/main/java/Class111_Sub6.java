import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class111_Sub6 extends Class111 {

	@OriginalMember(owner = "client!op", name = "l", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "B")
	public final byte aByte73;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "I")
	public int anInt5105;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "B")
	public final byte aByte72;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "[S")
	public final short[] aShortArray81;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "[B")
	public final byte[] aByteArray74;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class111_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte75 = (byte) arg0;
		this.aByte73 = (byte) arg1;
		this.anInt5105 = arg2;
		this.aByte72 = (byte) arg3;
		this.aByte74 = (byte) arg4;
		this.aShortArray81 = arg5;
		this.aByteArray74 = arg6;
	}
}
