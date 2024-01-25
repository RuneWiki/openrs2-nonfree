import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class299 {

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "B")
	public final byte aByte97;

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "S")
	public final short aShort118;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "S")
	public final short aShort119;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "B")
	public final byte aByte96;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "S")
	public final short aShort117;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Z")
	public final boolean aBoolean751;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	public final int anInt9027;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aByte97 = (byte) arg7;
		this.aShort118 = (short) arg4;
		this.aShort119 = (short) arg6;
		this.aByte96 = (byte) arg8;
		this.aShort117 = (short) arg5;
		this.aBoolean751 = arg9;
		this.anInt9027 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZII)Lclient!sm;")
	public Class299 method7399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class299(arg3, arg1, arg2, arg0, this.aShort118, this.aShort117, this.aShort119, this.aByte97, this.aByte96, this.aBoolean751);
	}
}
