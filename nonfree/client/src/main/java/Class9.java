import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class9 {

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public final int anInt144;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "S")
	public final short aShort4;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "B")
	public final byte aByte6;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	public final int anInt146;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "I")
	public final int anInt147;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "I")
	public final int anInt148;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	public final int anInt145;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Z")
	public final boolean aBoolean21;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "S")
	public final short aShort5;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt144 = arg11;
		this.aShort4 = (short) arg4;
		this.aByte6 = (byte) arg8;
		this.anInt146 = arg1;
		this.anInt147 = arg3;
		this.anInt148 = arg0;
		this.anInt145 = arg2;
		this.aBoolean21 = arg10;
		this.aShort3 = (short) arg5;
		this.aShort5 = (short) arg6;
	}
}
