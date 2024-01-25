import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class51 {

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
	public final int anInt1835;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "S")
	public final short aShort37;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "Z")
	public final boolean aBoolean124;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "S")
	public final short aShort36;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "S")
	public final short aShort35;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public final int anInt1829;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
	public final int anInt1831;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public final int anInt1833;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "B")
	public final byte aByte32;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
	public final int anInt1836;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt1835 = arg1;
		this.aShort37 = (short) arg6;
		this.aBoolean124 = arg10;
		this.aShort36 = (short) arg5;
		this.aShort35 = (short) arg4;
		this.anInt1829 = arg11;
		this.anInt1831 = arg0;
		this.anInt1833 = arg3;
		this.aByte33 = (byte) arg7;
		this.aByte32 = (byte) arg8;
		this.anInt1836 = arg2;
	}
}
