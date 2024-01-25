import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public final class Class340 {

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
	public final int anInt9245;

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "S")
	public final short aShort117;

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
	public final int anInt9247;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
	public final int anInt9249;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "S")
	public final short aShort116;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
	public final int anInt9250;

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "B")
	public final byte aByte126;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
	public final int anInt9244;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "Z")
	public final boolean aBoolean661;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "S")
	public final short aShort118;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt9245 = arg0;
		this.aShort117 = (short) arg4;
		this.anInt9247 = arg1;
		this.anInt9249 = arg3;
		this.aShort116 = (short) arg6;
		this.anInt9250 = arg2;
		this.aByte126 = (byte) arg8;
		this.anInt9244 = arg11;
		this.aBoolean661 = arg10;
		this.aShort118 = (short) arg5;
	}
}
