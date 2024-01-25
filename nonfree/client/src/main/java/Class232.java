import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class232 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	public final int anInt5728;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "S")
	public final short aShort79;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "Z")
	public final boolean aBoolean453;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public final int anInt5734;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "S")
	public final short aShort77;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	public final int anInt5732;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "B")
	public final byte aByte88;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "S")
	public final short aShort78;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public final int anInt5730;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public final int anInt5729;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt5728 = arg3;
		this.aShort79 = (short) arg6;
		this.aBoolean453 = arg10;
		this.anInt5734 = arg11;
		this.aShort77 = (short) arg5;
		this.anInt5732 = arg2;
		this.aByte88 = (byte) arg8;
		this.aShort78 = (short) arg4;
		this.anInt5730 = arg0;
		this.anInt5729 = arg1;
	}
}
