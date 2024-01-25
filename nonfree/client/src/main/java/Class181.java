import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class181 {

	@OriginalMember(owner = "client!op", name = "h", descriptor = "S")
	public final short aShort76;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "I")
	public final int anInt5141;

	@OriginalMember(owner = "client!op", name = "c", descriptor = "S")
	public final short aShort74;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "Z")
	public final boolean aBoolean349;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "S")
	public final short aShort75;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "B")
	public final byte aByte62;

	static {
		new Class182(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort76 = (short) arg6;
		this.anInt5141 = arg0;
		this.aShort74 = (short) arg5;
		this.aBoolean349 = arg9;
		this.aByte61 = (byte) arg7;
		this.aShort75 = (short) arg4;
		this.aByte62 = (byte) arg8;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIII)Lclient!op;")
	public Class181 method4136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class181(arg3, arg2, arg0, arg1, this.aShort75, this.aShort74, this.aShort76, this.aByte61, this.aByte62, this.aBoolean349);
	}
}
