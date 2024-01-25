import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class18 {

	@OriginalMember(owner = "client!an", name = "i", descriptor = "S")
	public final short aShort13;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "I")
	public final int anInt920;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "B")
	public final byte aByte6;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "S")
	public final short aShort14;

	@OriginalMember(owner = "client!an", name = "o", descriptor = "I")
	public final int anInt922;

	@OriginalMember(owner = "client!an", name = "e", descriptor = "I")
	public final int anInt916;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "I")
	public final int anInt915;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "S")
	public final short aShort12;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "Z")
	public final boolean aBoolean69;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "I")
	public final int anInt917;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort13 = (short) arg6;
		this.anInt920 = arg3;
		this.aByte6 = (byte) arg8;
		this.aShort14 = (short) arg5;
		this.anInt922 = arg1;
		this.anInt916 = arg11;
		this.anInt915 = arg2;
		this.aShort12 = (short) arg4;
		this.aBoolean69 = arg10;
		this.anInt917 = arg0;
	}
}
