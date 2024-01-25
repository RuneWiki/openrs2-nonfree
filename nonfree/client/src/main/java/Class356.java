import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class356 {

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
	public final int anInt9783;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
	public final int anInt9784;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "B")
	public final byte aByte130;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "S")
	public final short aShort124;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "S")
	public final short aShort126;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "S")
	public final short aShort125;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "Z")
	public final boolean aBoolean788;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	public final int anInt9778;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
	public final int anInt9779;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	public final int anInt9781;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt9783 = arg11;
		this.anInt9784 = arg2;
		this.aByte130 = (byte) arg8;
		this.aShort124 = (short) arg5;
		this.aShort126 = (short) arg4;
		this.aShort125 = (short) arg6;
		this.aBoolean788 = arg10;
		this.anInt9778 = arg1;
		this.anInt9779 = arg3;
		this.anInt9781 = arg0;
	}
}
