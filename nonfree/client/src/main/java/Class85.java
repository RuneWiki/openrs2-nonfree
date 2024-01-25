import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public final class Class85 {

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
	public final int anInt2409;

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "B")
	public final byte aByte43;

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "Z")
	public final boolean aBoolean193;

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "B")
	public final byte aByte45;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "S")
	public final short aShort49;

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "S")
	public final short aShort48;

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "S")
	public final short aShort47;

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
	public final int anInt2407;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt2409 = arg10;
		this.aByte43 = (byte) arg8;
		this.aBoolean193 = arg9;
		this.aByte45 = (byte) arg7;
		this.aShort49 = (short) arg5;
		this.aShort48 = (short) arg4;
		this.aShort47 = (short) arg6;
		this.anInt2407 = arg0;
	}
}
