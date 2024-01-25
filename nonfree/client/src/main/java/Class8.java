import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class8 {

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "B")
	public final byte aByte1;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Z")
	public final boolean aBoolean18;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "S")
	public final short aShort2;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
	public final int anInt182;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "S")
	public final short aShort1;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "B")
	public final byte aByte2;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aByte1 = (byte) arg7;
		this.aBoolean18 = arg9;
		this.aShort3 = (short) arg4;
		this.aShort2 = (short) arg5;
		this.anInt182 = arg0;
		this.aShort1 = (short) arg6;
		this.aByte2 = (byte) arg8;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIZ)Lclient!aj;")
	public Class8 method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class8(arg1, arg0, arg3, arg2, this.aShort3, this.aShort2, this.aShort1, this.aByte1, this.aByte2, this.aBoolean18);
	}
}
