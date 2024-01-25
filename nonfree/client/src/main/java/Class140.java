import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public final class Class140 {

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "Z")
	public final boolean aBoolean294;

	@OriginalMember(owner = "client!ifa", name = "k", descriptor = "I")
	public final int anInt4593;

	@OriginalMember(owner = "client!ifa", name = "j", descriptor = "B")
	public final byte aByte42;

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
	public final int anInt4589;

	@OriginalMember(owner = "client!ifa", name = "l", descriptor = "S")
	public final short aShort51;

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "S")
	public final short aShort50;

	@OriginalMember(owner = "client!ifa", name = "m", descriptor = "B")
	public final byte aByte43;

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "S")
	public final short aShort49;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aBoolean294 = arg9;
		this.anInt4593 = arg0;
		this.aByte42 = (byte) arg8;
		this.anInt4589 = arg10;
		this.aShort51 = (short) arg5;
		this.aShort50 = (short) arg6;
		this.aByte43 = (byte) arg7;
		this.aShort49 = (short) arg4;
	}
}
