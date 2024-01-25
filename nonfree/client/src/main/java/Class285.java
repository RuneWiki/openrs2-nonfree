import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class285 {

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "S")
	public final short aShort101;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
	public final int anInt7858;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "B")
	public final byte aByte110;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "S")
	public final short aShort100;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "B")
	public final byte aByte111;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
	public final int anInt7859;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "Z")
	public final boolean aBoolean656;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "S")
	public final short aShort99;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort101 = (short) arg4;
		this.anInt7858 = arg0;
		this.aByte110 = (byte) arg8;
		this.aShort100 = (short) arg5;
		this.aByte111 = (byte) arg7;
		this.anInt7859 = arg10;
		this.aBoolean656 = arg9;
		this.aShort99 = (short) arg6;
	}
}
