import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class132 {

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "S")
	public final short aShort46;

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
	public final int anInt3341;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "S")
	public final short aShort47;

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
	public final int anInt3333;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "Z")
	public final boolean aBoolean265;

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
	public final int anInt3338;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
	public final int anInt3339;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
	public final int anInt3334;

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "B")
	public final byte aByte54;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "S")
	public final short aShort48;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort46 = (short) arg5;
		this.anInt3341 = arg1;
		this.aShort47 = (short) arg4;
		this.anInt3333 = arg3;
		this.aBoolean265 = arg10;
		this.anInt3338 = arg2;
		this.anInt3339 = arg0;
		this.anInt3334 = arg11;
		this.aByte54 = (byte) arg8;
		this.aShort48 = (short) arg6;
	}
}
