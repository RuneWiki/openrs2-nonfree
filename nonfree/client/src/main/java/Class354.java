import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class354 {

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Z")
	public final boolean aBoolean712;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public final int anInt10128;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
	public final int anInt10127;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "S")
	public final short aShort100;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
	public final int anInt10130;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	public final int anInt10129;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
	public final int anInt10126;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "S")
	public final short aShort102;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "S")
	public final short aShort101;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "B")
	public final byte aByte139;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aBoolean712 = arg10;
		this.anInt10128 = arg3;
		this.anInt10127 = arg11;
		this.aShort100 = (short) arg6;
		this.anInt10130 = arg2;
		this.anInt10129 = arg1;
		this.anInt10126 = arg0;
		this.aShort102 = (short) arg4;
		this.aShort101 = (short) arg5;
		this.aByte139 = (byte) arg8;
	}
}
