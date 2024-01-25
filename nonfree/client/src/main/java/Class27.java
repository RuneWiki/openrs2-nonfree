import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class27 {

	@OriginalMember(owner = "client!av", name = "d", descriptor = "I")
	public final int anInt1088;

	@OriginalMember(owner = "client!av", name = "f", descriptor = "S")
	public final short aShort19;

	@OriginalMember(owner = "client!av", name = "i", descriptor = "B")
	public final byte aByte32;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "I")
	public final int anInt1089;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "S")
	public final short aShort18;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "B")
	public final byte aByte31;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "S")
	public final short aShort20;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "Z")
	public final boolean aBoolean84;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt1088 = arg10;
		this.aShort19 = (short) arg4;
		this.aByte32 = (byte) arg7;
		this.anInt1089 = arg0;
		this.aShort18 = (short) arg6;
		this.aByte31 = (byte) arg8;
		this.aShort20 = (short) arg5;
		this.aBoolean84 = arg9;
	}
}
