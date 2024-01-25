import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class157 {

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "S")
	public final short aShort43;

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "B")
	public final byte aByte38;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "S")
	public final short aShort44;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
	public final int anInt4740;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "S")
	public final short aShort45;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "Z")
	public final boolean aBoolean324;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort43 = (short) arg6;
		this.aByte38 = (byte) arg7;
		this.aByte39 = (byte) arg8;
		this.aShort44 = (short) arg4;
		this.anInt4740 = arg0;
		this.aShort45 = (short) arg5;
		this.aBoolean324 = arg9;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIZII)Lclient!jk;")
	public Class157 method4074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class157(arg3, arg0, arg1, arg2, this.aShort44, this.aShort45, this.aShort43, this.aByte38, this.aByte39, this.aBoolean324);
	}
}
