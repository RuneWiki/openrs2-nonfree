import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class100 {

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "S")
	public final short aShort56;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "S")
	public final short aShort55;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	public final int anInt3472;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	public final int anInt3467;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "B")
	public final byte aByte25;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	public final int anInt3468;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Z")
	public final boolean aBoolean211;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
	public final int anInt3466;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
	public final int anInt3469;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "S")
	public final short aShort57;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "B")
	public final byte aByte26;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort56 = (short) arg5;
		this.aShort55 = (short) arg6;
		this.anInt3472 = arg2;
		this.anInt3467 = arg0;
		this.aByte25 = (byte) arg8;
		this.anInt3468 = arg1;
		this.aBoolean211 = arg10;
		this.anInt3466 = arg3;
		this.anInt3469 = arg11;
		this.aShort57 = (short) arg4;
		this.aByte26 = (byte) arg7;
	}
}
