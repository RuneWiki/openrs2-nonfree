import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class201 {

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	public final int anInt5692;

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
	public final int anInt5691;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	public final int anInt5690;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "S")
	public final short aShort51;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
	public final int anInt5695;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
	public final int anInt5694;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "S")
	public final short aShort50;

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "Z")
	public final boolean aBoolean433;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "S")
	public final short aShort52;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "B")
	public final byte aByte52;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt5692 = arg2;
		this.anInt5691 = arg1;
		this.anInt5690 = arg11;
		this.aShort51 = (short) arg5;
		this.anInt5695 = arg3;
		this.anInt5694 = arg0;
		this.aShort50 = (short) arg4;
		this.aBoolean433 = arg10;
		this.aShort52 = (short) arg6;
		this.aByte52 = (byte) arg8;
	}
}
