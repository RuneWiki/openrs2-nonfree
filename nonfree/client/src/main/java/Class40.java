import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class Class40 {

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "B")
	public final byte aByte44;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "S")
	public final short aShort25;

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
	public final int anInt857;

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "Z")
	public final boolean aBoolean105;

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
	public final int anInt860;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "S")
	public final short aShort27;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
	public final int anInt861;

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "S")
	public final short aShort26;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
	public final int anInt859;

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
	public final int anInt856;

	static {
		new Class286("", 73);
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte44 = (byte) arg8;
		this.aShort25 = (short) arg6;
		this.anInt857 = arg2;
		this.aBoolean105 = arg10;
		this.anInt860 = arg0;
		this.aShort27 = (short) arg5;
		this.anInt861 = arg3;
		this.aShort26 = (short) arg4;
		this.anInt859 = arg11;
		this.anInt856 = arg1;
	}
}
