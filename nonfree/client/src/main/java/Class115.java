import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class115 {

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	public final int anInt3420;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "S")
	public final short aShort34;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	public final int anInt3417;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "I")
	public final int anInt3418;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "S")
	public final short aShort35;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	public final int anInt3416;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "S")
	public final short aShort33;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "I")
	public final int anInt3422;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "B")
	public final byte aByte21;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Z")
	public final boolean aBoolean287;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "B")
	public final byte aByte20;

	static {
		new Class186("", 73);
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt3420 = arg1;
		this.aShort34 = (short) arg4;
		this.anInt3417 = arg3;
		this.anInt3418 = arg11;
		this.aShort35 = (short) arg6;
		this.anInt3416 = arg0;
		this.aShort33 = (short) arg5;
		this.anInt3422 = arg2;
		this.aByte21 = (byte) arg7;
		this.aBoolean287 = arg10;
		this.aByte20 = (byte) arg8;
	}
}
