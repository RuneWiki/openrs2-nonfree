import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class170 {

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "B")
	public final byte aByte67;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "B")
	public final byte aByte66;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
	public final int anInt4454;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "S")
	public final short aShort73;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	public final int anInt4456;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "S")
	public final short aShort72;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	public final int anInt4457;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
	public final int anInt4455;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
	public final boolean aBoolean354;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
	public final int anInt4458;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte67 = (byte) arg7;
		this.aByte66 = (byte) arg8;
		this.anInt4454 = arg0;
		this.aShort73 = (short) arg6;
		this.anInt4456 = arg3;
		this.aShort72 = (short) arg4;
		this.anInt4457 = arg11;
		this.anInt4455 = arg1;
		this.aBoolean354 = arg10;
		this.anInt4458 = arg2;
		this.aShort71 = (short) arg5;
	}
}
