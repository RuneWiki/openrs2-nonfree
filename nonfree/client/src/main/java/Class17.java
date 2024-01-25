import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class17 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	public final int anInt545;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "S")
	public final short aShort7;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
	public final int anInt546;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	public final int anInt553;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public final int anInt551;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "B")
	public final byte aByte6;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public final int anInt550;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "S")
	public final short aShort9;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Z")
	public final boolean aBoolean45;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "B")
	public final byte aByte5;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "S")
	public final short aShort8;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt545 = arg3;
		this.aShort7 = (short) arg4;
		this.anInt546 = arg1;
		this.anInt553 = arg11;
		this.anInt551 = arg2;
		this.aByte6 = (byte) arg8;
		this.anInt550 = arg0;
		this.aShort9 = (short) arg5;
		this.aBoolean45 = arg10;
		this.aByte5 = (byte) arg7;
		this.aShort8 = (short) arg6;
	}
}
