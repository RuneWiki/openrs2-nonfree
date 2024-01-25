import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public final class Class339 {

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "S")
	public final short aShort116;

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
	public final int anInt9104;

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
	public final int anInt9100;

	@OriginalMember(owner = "client!uw", name = "l", descriptor = "B")
	public final byte aByte117;

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "S")
	public final short aShort115;

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "S")
	public final short aShort117;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "B")
	public final byte aByte116;

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "Z")
	public final boolean aBoolean679;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort116 = (short) arg6;
		this.anInt9104 = arg0;
		this.anInt9100 = arg10;
		this.aByte117 = (byte) arg8;
		this.aShort115 = (short) arg5;
		this.aShort117 = (short) arg4;
		this.aByte116 = (byte) arg7;
		this.aBoolean679 = arg9;
	}
}
