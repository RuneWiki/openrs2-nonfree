import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public final class Class184 {

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "B")
	public final byte aByte72;

	@OriginalMember(owner = "client!lfa", name = "k", descriptor = "S")
	public final short aShort60;

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "S")
	public final short aShort59;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "B")
	public final byte aByte71;

	@OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
	public final int anInt6319;

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "S")
	public final short aShort58;

	@OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
	public final int anInt6318;

	@OriginalMember(owner = "client!lfa", name = "h", descriptor = "Z")
	public final boolean aBoolean492;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aByte72 = (byte) arg8;
		this.aShort60 = (short) arg4;
		this.aShort59 = (short) arg6;
		this.aByte71 = (byte) arg7;
		this.anInt6319 = arg10;
		this.aShort58 = (short) arg5;
		this.anInt6318 = arg0;
		this.aBoolean492 = arg9;
	}
}
