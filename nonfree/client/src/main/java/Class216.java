import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class216 {

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "S")
	public final short aShort73;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
	public final int anInt6708;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "S")
	public final short aShort74;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public final int anInt6712;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "S")
	public final short aShort75;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Z")
	public final boolean aBoolean441;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort73 = (short) arg4;
		this.anInt6708 = arg0;
		this.aShort74 = (short) arg5;
		this.aByte74 = (byte) arg7;
		this.aByte75 = (byte) arg8;
		this.anInt6712 = arg10;
		this.aShort75 = (short) arg6;
		this.aBoolean441 = arg9;
	}
}
