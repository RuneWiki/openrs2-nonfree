import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public final class Class264 {

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "S")
	public final short aShort93;

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
	public final int anInt7434;

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
	public final int anInt7436;

	@OriginalMember(owner = "client!ow", name = "j", descriptor = "I")
	public final int anInt7438;

	@OriginalMember(owner = "client!ow", name = "l", descriptor = "Z")
	public final boolean aBoolean499;

	@OriginalMember(owner = "client!ow", name = "i", descriptor = "I")
	public final int anInt7437;

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
	public final int anInt7435;

	@OriginalMember(owner = "client!ow", name = "k", descriptor = "S")
	public final short aShort95;

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "B")
	public final byte aByte110;

	@OriginalMember(owner = "client!ow", name = "f", descriptor = "S")
	public final short aShort94;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort93 = (short) arg5;
		this.anInt7434 = arg3;
		this.anInt7436 = arg2;
		this.anInt7438 = arg0;
		this.aBoolean499 = arg10;
		this.anInt7437 = arg1;
		this.anInt7435 = arg11;
		this.aShort95 = (short) arg4;
		this.aByte110 = (byte) arg8;
		this.aShort94 = (short) arg6;
	}
}
