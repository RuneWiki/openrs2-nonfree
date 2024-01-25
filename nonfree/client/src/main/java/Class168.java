import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class168 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "B")
	public final byte aByte68;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Z")
	public final boolean aBoolean426;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "B")
	public final byte aByte67;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public final int anInt4728;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "S")
	public final short aShort70;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "S")
	public final short aShort69;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort68 = (short) arg6;
		this.aByte68 = (byte) arg7;
		this.aBoolean426 = arg9;
		this.aByte67 = (byte) arg8;
		this.anInt4728 = arg0;
		this.aShort70 = (short) arg5;
		this.aShort69 = (short) arg4;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)Lclient!ne;")
	public Class168 method3736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class168(arg3, arg1, arg2, arg0, this.aShort69, this.aShort70, this.aShort68, this.aByte68, this.aByte67, this.aBoolean426);
	}
}
