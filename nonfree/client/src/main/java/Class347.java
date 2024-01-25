import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class347 {

	@OriginalMember(owner = "client!u", name = "d", descriptor = "B")
	public final byte aByte131;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "S")
	public final short aShort120;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "S")
	public final short aShort119;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Z")
	public final boolean aBoolean702;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "S")
	public final short aShort118;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	public final int anInt9341;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "B")
	public final byte aByte132;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	public final int anInt9342;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aByte131 = (byte) arg7;
		this.aShort120 = (short) arg6;
		this.aShort119 = (short) arg4;
		this.aBoolean702 = arg9;
		this.aShort118 = (short) arg5;
		this.anInt9341 = arg10;
		this.aByte132 = (byte) arg8;
		this.anInt9342 = arg0;
	}
}
