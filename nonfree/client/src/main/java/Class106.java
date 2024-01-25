import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public final class Class106 {

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "S")
	public final short aShort52;

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "S")
	public final short aShort51;

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
	public final int anInt3097;

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "B")
	public final byte aByte40;

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "Z")
	public final boolean aBoolean204;

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "S")
	public final short aShort50;

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort52 = (short) arg6;
		this.aShort51 = (short) arg4;
		this.anInt3097 = arg0;
		this.aByte40 = (byte) arg8;
		this.aBoolean204 = arg9;
		this.aShort50 = (short) arg5;
		this.aByte39 = (byte) arg7;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIII)Lclient!fw;")
	public Class106 method2767(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class106(arg1, arg2, arg3, arg0, this.aShort51, this.aShort50, this.aShort52, this.aByte39, this.aByte40, this.aBoolean204);
	}
}
