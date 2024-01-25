import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public final class Class82 {

	@OriginalMember(owner = "client!dga", name = "n", descriptor = "S")
	public final short aShort15;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "S")
	public final short aShort13;

	@OriginalMember(owner = "client!dga", name = "h", descriptor = "B")
	public final byte aByte20;

	@OriginalMember(owner = "client!dga", name = "g", descriptor = "S")
	public final short aShort14;

	@OriginalMember(owner = "client!dga", name = "j", descriptor = "Z")
	public final boolean aBoolean211;

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
	public final int anInt2261;

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "B")
	public final byte aByte19;

	@OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
	public final int anInt2262;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort15 = (short) arg5;
		this.aShort13 = (short) arg4;
		this.aByte20 = (byte) arg7;
		this.aShort14 = (short) arg6;
		this.aBoolean211 = arg9;
		this.anInt2261 = arg0;
		this.aByte19 = (byte) arg8;
		this.anInt2262 = arg10;
	}
}
