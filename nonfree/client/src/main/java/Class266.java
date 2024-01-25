import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class266 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "S")
	public final short aShort85;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public final int anInt7566;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
	public final int anInt7567;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "B")
	public final byte aByte82;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "S")
	public final short aShort87;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "S")
	public final short aShort86;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
	public final int anInt7568;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "Z")
	public final boolean aBoolean541;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
	public final int anInt7563;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
	public final int anInt7559;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort85 = (short) arg5;
		this.anInt7566 = arg0;
		this.anInt7567 = arg1;
		this.aByte82 = (byte) arg8;
		this.aShort87 = (short) arg6;
		this.aShort86 = (short) arg4;
		this.anInt7568 = arg3;
		this.aBoolean541 = arg10;
		this.anInt7563 = arg2;
		this.anInt7559 = arg11;
	}
}
