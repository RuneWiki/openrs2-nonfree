import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class255 {

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
	public final int anInt7375;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "S")
	public final short aShort97;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	public final int anInt7374;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "Z")
	public final boolean aBoolean516;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public final int anInt7367;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public final int anInt7368;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "S")
	public final short aShort99;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "S")
	public final short aShort98;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
	public final int anInt7369;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "B")
	public final byte aByte114;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt7375 = arg0;
		this.aShort97 = (short) arg4;
		this.anInt7374 = arg11;
		this.aBoolean516 = arg10;
		this.anInt7367 = arg1;
		this.anInt7368 = arg3;
		this.aShort99 = (short) arg6;
		this.aShort98 = (short) arg5;
		this.anInt7369 = arg2;
		this.aByte114 = (byte) arg8;
	}
}
