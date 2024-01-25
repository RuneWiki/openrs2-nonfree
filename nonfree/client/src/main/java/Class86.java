import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class86 {

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "S")
	public final short aShort37;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "B")
	public final byte aByte43;

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
	public final int anInt2121;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "S")
	public final short aShort35;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "Z")
	public final boolean aBoolean147;

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "S")
	public final short aShort36;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "B")
	public final byte aByte44;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort37 = (short) arg5;
		this.aByte43 = (byte) arg7;
		this.anInt2121 = arg0;
		this.aShort35 = (short) arg4;
		this.aBoolean147 = arg9;
		this.aShort36 = (short) arg6;
		this.aByte44 = (byte) arg8;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBIII)Lclient!fp;")
	public Class86 method1690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class86(arg2, arg1, arg3, arg0, this.aShort35, this.aShort37, this.aShort36, this.aByte43, this.aByte44, this.aBoolean147);
	}
}
