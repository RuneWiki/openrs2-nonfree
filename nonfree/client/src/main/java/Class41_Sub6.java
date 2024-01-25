import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class41_Sub6 extends Class41 {

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "B")
	public final byte aByte86;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "B")
	public final byte aByte87;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
	public int anInt6430;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "B")
	public final byte aByte88;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "B")
	public final byte aByte85;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "[S")
	public final short[] aShortArray116;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "[B")
	public final byte[] aByteArray78;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class41_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte86 = (byte) arg0;
		this.aByte87 = (byte) arg1;
		this.anInt6430 = arg2;
		this.aByte88 = (byte) arg3;
		this.aByte85 = (byte) arg4;
		this.aShortArray116 = arg5;
		this.aByteArray78 = arg6;
	}
}
