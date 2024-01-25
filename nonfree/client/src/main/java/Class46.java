import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class46 {

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "S")
	public final short aShort11;

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "B")
	public final byte aByte19;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "B")
	public final byte aByte18;

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "S")
	public final short aShort12;

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
	public final int anInt1158;

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
	public final int anInt1157;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "Z")
	public final boolean aBoolean85;

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "S")
	public final short aShort10;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort11 = (short) arg6;
		this.aByte19 = (byte) arg7;
		this.aByte18 = (byte) arg8;
		this.aShort12 = (short) arg4;
		this.anInt1158 = arg0;
		this.anInt1157 = arg10;
		this.aBoolean85 = arg9;
		this.aShort10 = (short) arg5;
	}
}
