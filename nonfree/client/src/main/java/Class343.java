import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class343 {

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "S")
	public final short aShort120;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Z")
	public final boolean aBoolean696;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
	public final int anInt9341;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public final int anInt9340;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "B")
	public final byte aByte139;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "S")
	public final short aShort122;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "S")
	public final short aShort121;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "B")
	public final byte aByte140;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort120 = (short) arg6;
		this.aBoolean696 = arg9;
		this.anInt9341 = arg0;
		this.anInt9340 = arg10;
		this.aByte139 = (byte) arg7;
		this.aShort122 = (short) arg5;
		this.aShort121 = (short) arg4;
		this.aByte140 = (byte) arg8;
	}
}
