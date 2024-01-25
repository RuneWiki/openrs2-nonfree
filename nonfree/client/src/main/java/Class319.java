import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class319 {

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "S")
	public final short aShort125;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
	public final int anInt9132;

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
	public final int anInt9129;

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "B")
	public final byte aByte108;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "S")
	public final short aShort126;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "B")
	public final byte aByte109;

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
	public final int anInt9131;

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "S")
	public final short aShort127;

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
	public final int anInt9136;

	@OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
	public final int anInt9135;

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "Z")
	public final boolean aBoolean670;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort125 = (short) arg4;
		this.anInt9132 = arg0;
		this.anInt9129 = arg2;
		this.aByte108 = (byte) arg7;
		this.aShort126 = (short) arg6;
		this.aByte109 = (byte) arg8;
		this.anInt9131 = arg11;
		this.aShort127 = (short) arg5;
		this.anInt9136 = arg3;
		this.anInt9135 = arg1;
		this.aBoolean670 = arg10;
	}
}
