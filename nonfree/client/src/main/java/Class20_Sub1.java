import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!an", name = "o", descriptor = "B")
	public final byte aByte4;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "B")
	public final byte aByte2;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	public int anInt345;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "B")
	public final byte aByte5;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "B")
	public final byte aByte3;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "[S")
	public final short[] aShortArray1;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "[B")
	public final byte[] aByteArray2;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte4 = (byte) arg0;
		this.aByte2 = (byte) arg1;
		this.anInt345 = arg2;
		this.aByte5 = (byte) arg3;
		this.aByte3 = (byte) arg4;
		this.aShortArray1 = arg5;
		this.aByteArray2 = arg6;
	}
}
