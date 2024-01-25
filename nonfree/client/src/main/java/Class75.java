import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class75 {

	@OriginalMember(owner = "client!du", name = "l", descriptor = "S")
	public final short aShort26;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "B")
	public final byte aByte25;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "I")
	public final int anInt1917;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "S")
	public final short aShort24;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "I")
	public final int anInt1915;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "I")
	public final int anInt1918;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "I")
	public final int anInt1916;

	@OriginalMember(owner = "client!du", name = "i", descriptor = "S")
	public final short aShort25;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "Z")
	public final boolean aBoolean135;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "I")
	public final int anInt1921;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort26 = (short) arg6;
		this.aByte25 = (byte) arg8;
		this.anInt1917 = arg1;
		this.aShort24 = (short) arg4;
		this.anInt1915 = arg3;
		this.anInt1918 = arg11;
		this.anInt1916 = arg2;
		this.aShort25 = (short) arg5;
		this.aBoolean135 = arg10;
		this.anInt1921 = arg0;
	}
}
