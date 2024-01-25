import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class192 {

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "Z")
	public final boolean aBoolean381;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "S")
	public final short aShort74;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "S")
	public final short aShort75;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
	public final int anInt5726;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "B")
	public final byte aByte80;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "S")
	public final short aShort76;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "B")
	public final byte aByte81;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean381 = arg9;
		this.aShort74 = (short) arg6;
		this.aShort75 = (short) arg5;
		this.anInt5726 = arg0;
		this.aByte80 = (byte) arg7;
		this.aShort76 = (short) arg4;
		this.aByte81 = (byte) arg8;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)Lclient!qf;")
	public Class192 method4409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return new Class192(arg3, arg1, arg2, arg0, this.aShort76, this.aShort75, this.aShort74, this.aByte80, this.aByte81, this.aBoolean381);
	}
}
