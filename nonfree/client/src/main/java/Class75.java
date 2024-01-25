import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class75 {

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "S")
	public final short aShort37;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "Z")
	public final boolean aBoolean140;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "S")
	public final short aShort36;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
	public final int anInt2148;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
	public final int anInt2149;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
	public final int anInt2152;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
	public final int anInt2150;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "B")
	public final byte aByte21;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	public final int anInt2153;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "S")
	public final short aShort38;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort37 = (short) arg6;
		this.aBoolean140 = arg10;
		this.aShort36 = (short) arg5;
		this.anInt2148 = arg3;
		this.anInt2149 = arg0;
		this.anInt2152 = arg1;
		this.anInt2150 = arg2;
		this.aByte21 = (byte) arg8;
		this.anInt2153 = arg11;
		this.aShort38 = (short) arg4;
	}
}
