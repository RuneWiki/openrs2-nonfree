import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class46 {

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "S")
	public final short aShort12;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Z")
	public final boolean aBoolean63;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "B")
	public final byte aByte16;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	public final int anInt1158;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "B")
	public final byte aByte15;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "S")
	public final short aShort13;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "S")
	public final short aShort14;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort12 = (short) arg5;
		this.aBoolean63 = arg9;
		this.aByte16 = (byte) arg7;
		this.anInt1158 = arg0;
		this.aByte15 = (byte) arg8;
		this.aShort13 = (short) arg6;
		this.aShort14 = (short) arg4;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII)Lclient!cr;")
	public Class46 method891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class46(arg1, arg2, arg0, arg3, this.aShort14, this.aShort12, this.aShort13, this.aByte16, this.aByte15, this.aBoolean63);
	}
}
