import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class92 {

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "Z")
	public final boolean aBoolean179;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
	public final int anInt2506;

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "B")
	public final byte aByte24;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
	public final int anInt2510;

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "S")
	public final short aShort27;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "S")
	public final short aShort28;

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
	public final int anInt2508;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
	public final int anInt2507;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "S")
	public final short aShort29;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
	public final int anInt2505;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aBoolean179 = arg10;
		this.anInt2506 = arg2;
		this.aByte24 = (byte) arg8;
		this.anInt2510 = arg11;
		this.aShort27 = (short) arg5;
		this.aShort28 = (short) arg6;
		this.anInt2508 = arg3;
		this.anInt2507 = arg0;
		this.aShort29 = (short) arg4;
		this.anInt2505 = arg1;
	}
}
