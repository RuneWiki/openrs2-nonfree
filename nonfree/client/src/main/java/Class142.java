import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class142 {

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "S")
	public final short aShort124;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Z")
	public final boolean aBoolean333;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "S")
	public final short aShort123;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "S")
	public final short aShort122;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
	public final int anInt4320;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "B")
	public final byte aByte54;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "B")
	public final byte aByte53;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort124 = (short) arg4;
		this.aBoolean333 = arg9;
		this.aShort123 = (short) arg5;
		this.aShort122 = (short) arg6;
		this.anInt4320 = arg0;
		this.aByte54 = (byte) arg8;
		this.aByte53 = (byte) arg7;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)Lclient!lb;")
	public Class142 method3529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class142(arg0, arg3, arg1, arg2, this.aShort124, this.aShort123, this.aShort122, this.aByte53, this.aByte54, this.aBoolean333);
	}
}
