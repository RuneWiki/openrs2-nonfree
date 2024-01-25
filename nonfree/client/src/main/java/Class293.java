import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class293 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "S")
	public final short aShort84;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	public final int anInt7547;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "S")
	public final short aShort83;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "B")
	public final byte aByte105;

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "S")
	public final short aShort82;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "B")
	public final byte aByte106;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Z")
	public final boolean aBoolean511;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
	public final int anInt7548;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort84 = (short) arg5;
		this.anInt7547 = arg10;
		this.aShort83 = (short) arg6;
		this.aByte105 = (byte) arg7;
		this.aShort82 = (short) arg4;
		this.aByte106 = (byte) arg8;
		this.aBoolean511 = arg9;
		this.anInt7548 = arg0;
	}
}
