import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class61 {

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public final int anInt1866;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "I")
	public final int anInt1871;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	public final int anInt1868;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	public final int anInt1870;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "B")
	public final byte aByte8;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "Z")
	public final boolean aBoolean136;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "S")
	public final short aShort20;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "S")
	public final short aShort21;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "I")
	public final int anInt1869;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt1866 = arg1;
		this.anInt1871 = arg3;
		this.anInt1868 = arg0;
		this.anInt1870 = arg11;
		this.aByte8 = (byte) arg8;
		this.aBoolean136 = arg10;
		this.aShort20 = (short) arg5;
		this.aShort21 = (short) arg4;
		this.anInt1869 = arg2;
		this.aShort22 = (short) arg6;
	}
}
