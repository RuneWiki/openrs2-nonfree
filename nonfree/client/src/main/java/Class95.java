import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public final class Class95 {

	@OriginalMember(owner = "client!fda", name = "m", descriptor = "S")
	public final short aShort32;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
	public final int anInt2662;

	@OriginalMember(owner = "client!fda", name = "j", descriptor = "Z")
	public final boolean aBoolean202;

	@OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
	public final int anInt2664;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "I")
	public final int anInt2665;

	@OriginalMember(owner = "client!fda", name = "g", descriptor = "S")
	public final short aShort31;

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
	public final int anInt2661;

	@OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
	public final int anInt2663;

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "B")
	public final byte aByte31;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort32 = (short) arg4;
		this.anInt2662 = arg3;
		this.aBoolean202 = arg10;
		this.anInt2664 = arg2;
		this.aShort30 = (short) arg5;
		this.anInt2665 = arg0;
		this.aShort31 = (short) arg6;
		this.anInt2661 = arg1;
		this.anInt2663 = arg11;
		this.aByte31 = (byte) arg8;
	}
}
