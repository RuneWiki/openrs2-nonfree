import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class162 {

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
	public final int anInt4455;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "B")
	public final byte aByte71;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	public final int anInt4453;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "S")
	public final short aShort46;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Z")
	public final boolean aBoolean297;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "S")
	public final short aShort47;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "S")
	public final short aShort45;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "B")
	public final byte aByte70;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt4455 = arg0;
		this.aByte71 = (byte) arg8;
		this.anInt4453 = arg10;
		this.aShort46 = (short) arg4;
		this.aBoolean297 = arg9;
		this.aShort47 = (short) arg6;
		this.aShort45 = (short) arg5;
		this.aByte70 = (byte) arg7;
	}
}
