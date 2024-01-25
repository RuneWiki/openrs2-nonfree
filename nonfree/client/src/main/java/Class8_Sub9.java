import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class8_Sub9 extends Class8 {

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "B")
	public final byte aByte101;

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "B")
	public final byte aByte102;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
	public int anInt7558;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "B")
	public final byte aByte104;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "B")
	public final byte aByte103;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "[S")
	public final short[] aShortArray127;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "[B")
	public final byte[] aByteArray89;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class8_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte101 = (byte) arg0;
		this.aByte102 = (byte) arg1;
		this.anInt7558 = arg2;
		this.aByte104 = (byte) arg3;
		this.aByte103 = (byte) arg4;
		this.aShortArray127 = arg5;
		this.aByteArray89 = arg6;
	}
}
