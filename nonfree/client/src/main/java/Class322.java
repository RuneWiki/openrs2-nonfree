import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class322 {

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	public final int anInt9405;

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "S")
	public final short aShort126;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "B")
	public final byte aByte108;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "S")
	public final short aShort125;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "B")
	public final byte aByte107;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "S")
	public final short aShort124;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "Z")
	public final boolean aBoolean686;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.anInt9405 = arg0;
		this.aShort126 = (short) arg4;
		this.aByte108 = (byte) arg7;
		this.aShort125 = (short) arg6;
		this.aByte107 = (byte) arg8;
		this.aShort124 = (short) arg5;
		this.aBoolean686 = arg9;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIBII)Lclient!wp;")
	public Class322 method7771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class322(arg2, arg0, arg1, arg3, this.aShort126, this.aShort124, this.aShort125, this.aByte108, this.aByte107, this.aBoolean686);
	}
}
