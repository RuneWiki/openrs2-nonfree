import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class39 {

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "B")
	public final byte aByte19;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	public final int anInt1570;

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "S")
	public final short aShort14;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "S")
	public final short aShort13;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
	public final int anInt1572;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "Z")
	public final boolean aBoolean121;

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
	public final int anInt1578;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "S")
	public final short aShort15;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
	public final int anInt1575;

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
	public final int anInt1574;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte19 = (byte) arg8;
		this.anInt1570 = arg3;
		this.aShort14 = (short) arg6;
		this.aShort13 = (short) arg4;
		this.anInt1572 = arg2;
		this.aBoolean121 = arg10;
		this.anInt1578 = arg0;
		this.aShort15 = (short) arg5;
		this.anInt1575 = arg11;
		this.anInt1574 = arg1;
	}
}
