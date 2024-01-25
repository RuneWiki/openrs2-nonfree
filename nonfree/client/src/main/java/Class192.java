import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class192 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Z")
	public final boolean aBoolean417;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "B")
	public final byte aByte57;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "B")
	public final byte aByte56;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "S")
	public final short aShort57;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "S")
	public final short aShort59;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
	public final int anInt5174;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "S")
	public final short aShort58;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean417 = arg9;
		this.aByte57 = (byte) arg8;
		this.aByte56 = (byte) arg7;
		this.aShort57 = (short) arg5;
		this.aShort59 = (short) arg6;
		this.anInt5174 = arg0;
		this.aShort58 = (short) arg4;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII)Lclient!pl;")
	public Class192 method4039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return new Class192(arg2, arg1, arg3, arg0, this.aShort58, this.aShort57, this.aShort59, this.aByte56, this.aByte57, this.aBoolean417);
	}
}
