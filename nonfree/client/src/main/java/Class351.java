import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class Class351 {

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	public final int anInt9121;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
	public final int anInt9123;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "S")
	public final short aShort118;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "S")
	public final short aShort119;

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "Z")
	public final boolean aBoolean711;

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "S")
	public final short aShort120;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "B")
	public final byte aByte128;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "B")
	public final byte aByte127;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt9121 = arg0;
		this.anInt9123 = arg10;
		this.aShort118 = (short) arg4;
		this.aShort119 = (short) arg6;
		this.aBoolean711 = arg9;
		this.aShort120 = (short) arg5;
		this.aByte128 = (byte) arg7;
		this.aByte127 = (byte) arg8;
	}
}
