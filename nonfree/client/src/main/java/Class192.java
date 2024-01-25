import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public final class Class192 {

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
	public final int anInt5351;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	public final int anInt5356;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "B")
	public final byte aByte46;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
	public final int anInt5354;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "S")
	public final short aShort62;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
	public final int anInt5353;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "Z")
	public final boolean aBoolean381;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "S")
	public final short aShort63;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
	public final int anInt5355;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort64 = (short) arg4;
		this.anInt5351 = arg1;
		this.anInt5356 = arg2;
		this.aByte46 = (byte) arg8;
		this.anInt5354 = arg11;
		this.aShort62 = (short) arg6;
		this.anInt5353 = arg3;
		this.aBoolean381 = arg10;
		this.aShort63 = (short) arg5;
		this.anInt5355 = arg0;
	}
}
