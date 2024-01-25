import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public final class Class360 {

	@OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
	public final int anInt9772;

	@OriginalMember(owner = "client!uia", name = "g", descriptor = "S")
	public final short aShort127;

	@OriginalMember(owner = "client!uia", name = "j", descriptor = "I")
	public final int anInt9775;

	@OriginalMember(owner = "client!uia", name = "e", descriptor = "I")
	public final int anInt9776;

	@OriginalMember(owner = "client!uia", name = "h", descriptor = "B")
	public final byte aByte142;

	@OriginalMember(owner = "client!uia", name = "f", descriptor = "Z")
	public final boolean aBoolean720;

	@OriginalMember(owner = "client!uia", name = "k", descriptor = "I")
	public final int anInt9774;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "S")
	public final short aShort128;

	@OriginalMember(owner = "client!uia", name = "n", descriptor = "I")
	public final int anInt9778;

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "S")
	public final short aShort129;

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt9772 = arg1;
		this.aShort127 = (short) arg6;
		this.anInt9775 = arg11;
		this.anInt9776 = arg0;
		this.aByte142 = (byte) arg8;
		this.aBoolean720 = arg10;
		this.anInt9774 = arg2;
		this.aShort128 = (short) arg5;
		this.anInt9778 = arg3;
		this.aShort129 = (short) arg4;
	}
}
