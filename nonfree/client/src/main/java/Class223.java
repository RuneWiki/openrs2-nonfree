import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class223 {

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public final int anInt6526;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public final int anInt6521;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public final int anInt6527;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "S")
	public final short aShort62;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "B")
	public final byte aByte99;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	public final int anInt6524;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public final int anInt6523;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Z")
	public final boolean aBoolean580;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "S")
	public final short aShort63;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt6526 = arg1;
		this.anInt6521 = arg2;
		this.anInt6527 = arg11;
		this.aShort62 = (short) arg6;
		this.aByte99 = (byte) arg8;
		this.anInt6524 = arg3;
		this.anInt6523 = arg0;
		this.aBoolean580 = arg10;
		this.aShort63 = (short) arg5;
		this.aShort64 = (short) arg4;
	}
}
