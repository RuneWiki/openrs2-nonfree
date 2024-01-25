import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class83 {

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "S")
	public final short aShort42;

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
	public final int anInt2535;

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "S")
	public final short aShort43;

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
	public final int anInt2532;

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
	public final int anInt2534;

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "B")
	public final byte aByte50;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
	public final int anInt2533;

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "S")
	public final short aShort44;

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
	public final int anInt2530;

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "Z")
	public final boolean aBoolean165;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort42 = (short) arg5;
		this.anInt2535 = arg0;
		this.aShort43 = (short) arg6;
		this.anInt2532 = arg11;
		this.anInt2534 = arg1;
		this.aByte50 = (byte) arg8;
		this.anInt2533 = arg2;
		this.aShort44 = (short) arg4;
		this.anInt2530 = arg3;
		this.aBoolean165 = arg10;
	}
}
