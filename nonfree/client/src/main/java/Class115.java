import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class115 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
	public final int anInt2450;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "B")
	public final byte aByte34;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "Z")
	public final boolean aBoolean171;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "S")
	public final short aShort32;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
	public final int anInt2451;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "S")
	public final short aShort31;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt2450 = arg10;
		this.aByte33 = (byte) arg8;
		this.aShort30 = (short) arg6;
		this.aByte34 = (byte) arg7;
		this.aBoolean171 = arg9;
		this.aShort32 = (short) arg5;
		this.anInt2451 = arg0;
		this.aShort31 = (short) arg4;
	}
}
