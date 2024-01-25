import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class154 {

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
	public final int anInt4333;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	public final int anInt4335;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	public final int anInt4332;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	public final int anInt4334;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Z")
	public final boolean aBoolean324;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	public final int anInt4330;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "S")
	public final short aShort67;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "S")
	public final short aShort66;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt4333 = arg2;
		this.anInt4335 = arg1;
		this.anInt4332 = arg0;
		this.anInt4334 = arg11;
		this.aShort68 = (short) arg5;
		this.aBoolean324 = arg10;
		this.aByte59 = (byte) arg8;
		this.anInt4330 = arg3;
		this.aShort67 = (short) arg4;
		this.aShort66 = (short) arg6;
	}
}
