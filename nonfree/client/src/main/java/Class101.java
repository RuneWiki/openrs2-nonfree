import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public final class Class101 {

	@OriginalMember(owner = "client!eha", name = "e", descriptor = "I")
	public final int anInt2497;

	@OriginalMember(owner = "client!eha", name = "h", descriptor = "B")
	public final byte aByte29;

	@OriginalMember(owner = "client!eha", name = "l", descriptor = "I")
	public final int anInt2501;

	@OriginalMember(owner = "client!eha", name = "k", descriptor = "I")
	public final int anInt2500;

	@OriginalMember(owner = "client!eha", name = "d", descriptor = "S")
	public final short aShort29;

	@OriginalMember(owner = "client!eha", name = "i", descriptor = "I")
	public final int anInt2499;

	@OriginalMember(owner = "client!eha", name = "j", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "S")
	public final short aShort28;

	@OriginalMember(owner = "client!eha", name = "f", descriptor = "I")
	public final int anInt2498;

	@OriginalMember(owner = "client!eha", name = "g", descriptor = "Z")
	public final boolean aBoolean209;

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt2497 = arg11;
		this.aByte29 = (byte) arg8;
		this.anInt2501 = arg1;
		this.anInt2500 = arg2;
		this.aShort29 = (short) arg6;
		this.anInt2499 = arg0;
		this.aShort30 = (short) arg5;
		this.aShort28 = (short) arg4;
		this.anInt2498 = arg3;
		this.aBoolean209 = arg10;
	}
}
