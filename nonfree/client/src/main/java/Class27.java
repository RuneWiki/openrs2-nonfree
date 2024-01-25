import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public final class Class27 {

	@OriginalMember(owner = "client!bca", name = "g", descriptor = "Z")
	public final boolean aBoolean29;

	@OriginalMember(owner = "client!bca", name = "h", descriptor = "B")
	public final byte aByte4;

	@OriginalMember(owner = "client!bca", name = "i", descriptor = "I")
	public final int anInt531;

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "B")
	public final byte aByte3;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "S")
	public final short aShort15;

	@OriginalMember(owner = "client!bca", name = "f", descriptor = "S")
	public final short aShort16;

	@OriginalMember(owner = "client!bca", name = "k", descriptor = "S")
	public final short aShort17;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean29 = arg9;
		this.aByte4 = (byte) arg8;
		this.anInt531 = arg0;
		this.aByte3 = (byte) arg7;
		this.aShort15 = (short) arg5;
		this.aShort16 = (short) arg4;
		this.aShort17 = (short) arg6;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIII)Lclient!bca;")
	public Class27 method681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class27(arg2, arg3, arg1, arg0, this.aShort16, this.aShort15, this.aShort17, this.aByte3, this.aByte4, this.aBoolean29);
	}
}
