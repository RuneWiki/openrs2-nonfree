import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class393 {

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "B")
	public final byte aByte150;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
	public final int anInt11385;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "S")
	public final short aShort129;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "S")
	public final short aShort130;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "S")
	public final short aShort128;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "Z")
	public final boolean aBoolean804;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	public final int anInt11381;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
	public final int anInt11384;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	public final int anInt11383;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
	public final int anInt11382;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte150 = (byte) arg8;
		this.anInt11385 = arg3;
		this.aShort129 = (short) arg6;
		this.aShort130 = (short) arg4;
		this.aShort128 = (short) arg5;
		this.aBoolean804 = arg10;
		this.anInt11381 = arg0;
		this.anInt11384 = arg2;
		this.anInt11383 = arg1;
		this.anInt11382 = arg11;
	}
}
