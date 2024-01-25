import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class102_Sub4 extends Class102 {

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "B")
	public final byte aByte72;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "B")
	public final byte aByte73;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
	public int anInt7396;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "[S")
	public final short[] aShortArray116;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "[B")
	public final byte[] aByteArray89;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class102_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte72 = (byte) arg0;
		this.aByte73 = (byte) arg1;
		this.anInt7396 = arg2;
		this.aByte74 = (byte) arg3;
		this.aByte75 = (byte) arg4;
		this.aShortArray116 = arg5;
		this.aByteArray89 = arg6;
	}
}
