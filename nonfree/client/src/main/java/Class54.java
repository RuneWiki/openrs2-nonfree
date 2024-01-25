import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class54 {

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "Z")
	public final boolean aBoolean101;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "B")
	public final byte aByte36;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
	public final int anInt1740;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "S")
	public final short aShort23;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "B")
	public final byte aByte37;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "S")
	public final short aShort24;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean101 = arg9;
		this.aByte36 = (byte) arg8;
		this.anInt1740 = arg0;
		this.aShort23 = (short) arg4;
		this.aByte37 = (byte) arg7;
		this.aShort22 = (short) arg6;
		this.aShort24 = (short) arg5;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIZI)Lclient!dn;")
	public Class54 method1521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return new Class54(arg1, arg0, arg3, arg2, this.aShort23, this.aShort24, this.aShort22, this.aByte37, this.aByte36, this.aBoolean101);
	}
}
