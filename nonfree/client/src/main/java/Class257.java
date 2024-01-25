import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class257 {

	@OriginalMember(owner = "client!pca", name = "n", descriptor = "Z")
	public final boolean aBoolean667;

	@OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
	public final int anInt7825;

	@OriginalMember(owner = "client!pca", name = "g", descriptor = "B")
	public final byte aByte96;

	@OriginalMember(owner = "client!pca", name = "l", descriptor = "S")
	public final short aShort103;

	@OriginalMember(owner = "client!pca", name = "i", descriptor = "S")
	public final short aShort102;

	@OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
	public final int anInt7826;

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
	public final int anInt7823;

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "S")
	public final short aShort100;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
	public final int anInt7822;

	@OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
	public final int anInt7828;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aBoolean667 = arg10;
		this.anInt7825 = arg0;
		this.aByte96 = (byte) arg8;
		this.aShort103 = (short) arg5;
		this.aShort102 = (short) arg4;
		this.anInt7826 = arg11;
		this.anInt7823 = arg3;
		this.aShort100 = (short) arg6;
		this.anInt7822 = arg2;
		this.anInt7828 = arg1;
	}
}
