import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public final class Class53 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "B")
	public final byte aByte12;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
	public final int anInt1418;

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "S")
	public final short aShort18;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "S")
	public final short aShort16;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "Z")
	public final boolean aBoolean100;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "B")
	public final byte aByte13;

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "S")
	public final short aShort17;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aByte12 = (byte) arg8;
		this.anInt1418 = arg0;
		this.aShort18 = (short) arg6;
		this.aShort16 = (short) arg4;
		this.aBoolean100 = arg9;
		this.aByte13 = (byte) arg7;
		this.aShort17 = (short) arg5;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIII)Lclient!dp;")
	public Class53 method1168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class53(arg1, arg0, arg3, arg2, this.aShort16, this.aShort17, this.aShort18, this.aByte13, this.aByte12, this.aBoolean100);
	}
}
