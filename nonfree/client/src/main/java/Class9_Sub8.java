import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class9_Sub8 extends Class9 {

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "B")
	public final byte aByte88;

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "B")
	public final byte aByte85;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
	public int anInt6912;

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "B")
	public final byte aByte87;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "B")
	public final byte aByte86;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "[S")
	public final short[] aShortArray118;

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "[B")
	public final byte[] aByteArray59;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class9_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte88 = (byte) arg0;
		this.aByte85 = (byte) arg1;
		this.anInt6912 = arg2;
		this.aByte87 = (byte) arg3;
		this.aByte86 = (byte) arg4;
		this.aShortArray118 = arg5;
		this.aByteArray59 = arg6;
	}
}
