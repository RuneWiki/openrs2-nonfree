import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class191 {

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
	public final int anInt5956;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
	public final int anInt5952;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "S")
	public final short aShort86;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
	public final int anInt5959;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "S")
	public final short aShort88;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	public final int anInt5958;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "S")
	public final short aShort87;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Z")
	public final boolean aBoolean386;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "B")
	public final byte aByte49;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
	public final int anInt5951;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt5956 = arg3;
		this.anInt5952 = arg1;
		this.aShort86 = (short) arg4;
		this.anInt5959 = arg11;
		this.aShort88 = (short) arg5;
		this.anInt5958 = arg2;
		this.aShort87 = (short) arg6;
		this.aBoolean386 = arg10;
		this.aByte49 = (byte) arg8;
		this.anInt5951 = arg0;
	}
}
