import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class391 {

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
	public final int anInt11147;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	public final int anInt11143;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "S")
	public final short aShort124;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
	public final int anInt11145;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "Z")
	public final boolean aBoolean762;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
	public final int anInt11146;

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "S")
	public final short aShort122;

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
	public final int anInt11149;

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "B")
	public final byte aByte149;

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "S")
	public final short aShort123;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt11147 = arg2;
		this.anInt11143 = arg1;
		this.aShort124 = (short) arg4;
		this.anInt11145 = arg3;
		this.aBoolean762 = arg10;
		this.anInt11146 = arg0;
		this.aShort122 = (short) arg6;
		this.anInt11149 = arg11;
		this.aByte149 = (byte) arg8;
		this.aShort123 = (short) arg5;
	}
}
