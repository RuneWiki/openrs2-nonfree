import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public final class Class371 {

	@OriginalMember(owner = "client!wia", name = "g", descriptor = "B")
	public final byte aByte127;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "S")
	public final short aShort123;

	@OriginalMember(owner = "client!wia", name = "p", descriptor = "I")
	public final int anInt10142;

	@OriginalMember(owner = "client!wia", name = "f", descriptor = "S")
	public final short aShort125;

	@OriginalMember(owner = "client!wia", name = "k", descriptor = "Z")
	public final boolean aBoolean746;

	@OriginalMember(owner = "client!wia", name = "h", descriptor = "I")
	public final int anInt10139;

	@OriginalMember(owner = "client!wia", name = "i", descriptor = "B")
	public final byte aByte128;

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "S")
	public final short aShort124;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aByte127 = (byte) arg7;
		this.aShort123 = (short) arg4;
		this.anInt10142 = arg10;
		this.aShort125 = (short) arg6;
		this.aBoolean746 = arg9;
		this.anInt10139 = arg0;
		this.aByte128 = (byte) arg8;
		this.aShort124 = (short) arg5;
	}
}
