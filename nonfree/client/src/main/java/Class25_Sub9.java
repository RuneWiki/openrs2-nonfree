import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public final class Class25_Sub9 extends Class25 {

	@OriginalMember(owner = "client!nca", name = "j", descriptor = "B")
	public final byte aByte84;

	@OriginalMember(owner = "client!nca", name = "l", descriptor = "B")
	public final byte aByte85;

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
	public int anInt6315;

	@OriginalMember(owner = "client!nca", name = "n", descriptor = "B")
	public final byte aByte86;

	@OriginalMember(owner = "client!nca", name = "o", descriptor = "B")
	public final byte aByte87;

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "[S")
	public final short[] aShortArray93;

	@OriginalMember(owner = "client!nca", name = "m", descriptor = "[B")
	public final byte[] aByteArray158;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class25_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte84 = (byte) arg0;
		this.aByte85 = (byte) arg1;
		this.anInt6315 = arg2;
		this.aByte86 = (byte) arg3;
		this.aByte87 = (byte) arg4;
		this.aShortArray93 = arg5;
		this.aByteArray158 = arg6;
	}
}
