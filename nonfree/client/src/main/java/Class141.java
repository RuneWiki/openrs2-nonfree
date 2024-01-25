import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public final class Class141 {

	@OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
	public final int anInt3917;

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "B")
	public final byte aByte42;

	@OriginalMember(owner = "client!ida", name = "f", descriptor = "S")
	public final short aShort49;

	@OriginalMember(owner = "client!ida", name = "k", descriptor = "I")
	public final int anInt3919;

	@OriginalMember(owner = "client!ida", name = "i", descriptor = "Z")
	public final boolean aBoolean298;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "S")
	public final short aShort48;

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
	public final int anInt3916;

	@OriginalMember(owner = "client!ida", name = "l", descriptor = "I")
	public final int anInt3920;

	@OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
	public final int anInt3918;

	@OriginalMember(owner = "client!ida", name = "h", descriptor = "S")
	public final short aShort50;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt3917 = arg2;
		this.aByte42 = (byte) arg8;
		this.aShort49 = (short) arg4;
		this.anInt3919 = arg0;
		this.aBoolean298 = arg10;
		this.aShort48 = (short) arg5;
		this.anInt3916 = arg3;
		this.anInt3920 = arg1;
		this.anInt3918 = arg11;
		this.aShort50 = (short) arg6;
	}
}
