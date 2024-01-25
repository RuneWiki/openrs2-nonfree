import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public final class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!eea", name = "n", descriptor = "B")
	public final byte aByte35;

	@OriginalMember(owner = "client!eea", name = "m", descriptor = "B")
	public final byte aByte34;

	@OriginalMember(owner = "client!eea", name = "k", descriptor = "I")
	public int anInt2341;

	@OriginalMember(owner = "client!eea", name = "i", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!eea", name = "o", descriptor = "B")
	public final byte aByte36;

	@OriginalMember(owner = "client!eea", name = "l", descriptor = "[S")
	public final short[] aShortArray36;

	@OriginalMember(owner = "client!eea", name = "j", descriptor = "[B")
	public final byte[] aByteArray21;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class20_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte35 = (byte) arg0;
		this.aByte34 = (byte) arg1;
		this.anInt2341 = arg2;
		this.aByte33 = (byte) arg3;
		this.aByte36 = (byte) arg4;
		this.aShortArray36 = arg5;
		this.aByteArray21 = arg6;
	}
}
