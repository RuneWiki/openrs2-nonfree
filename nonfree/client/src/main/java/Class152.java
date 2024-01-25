import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public final class Class152 {

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "S")
	public final short aShort57;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "S")
	public final short aShort56;

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "S")
	public final short aShort58;

	@OriginalMember(owner = "client!ida", name = "k", descriptor = "B")
	public final byte aByte77;

	@OriginalMember(owner = "client!ida", name = "g", descriptor = "Z")
	public final boolean aBoolean327;

	@OriginalMember(owner = "client!ida", name = "o", descriptor = "I")
	public final int anInt3960;

	@OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
	public final int anInt3954;

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
	public final int anInt3953;

	@OriginalMember(owner = "client!ida", name = "n", descriptor = "I")
	public final int anInt3959;

	@OriginalMember(owner = "client!ida", name = "l", descriptor = "I")
	public final int anInt3958;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort57 = (short) arg6;
		this.aShort56 = (short) arg5;
		this.aShort58 = (short) arg4;
		this.aByte77 = (byte) arg8;
		this.aBoolean327 = arg10;
		this.anInt3960 = arg3;
		this.anInt3954 = arg11;
		this.anInt3953 = arg1;
		this.anInt3959 = arg0;
		this.anInt3958 = arg2;
	}
}
