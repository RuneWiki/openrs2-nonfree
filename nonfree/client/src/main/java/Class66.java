import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class66 {

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
	public final int anInt2084;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "S")
	public final short aShort49;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	public final int anInt2086;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "S")
	public final short aShort48;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "S")
	public final short aShort47;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Z")
	public final boolean aBoolean131;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public final int anInt2083;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
	public final int anInt2088;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public final int anInt2082;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "B")
	public final byte aByte38;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt2084 = arg3;
		this.aShort49 = (short) arg6;
		this.anInt2086 = arg1;
		this.aShort48 = (short) arg4;
		this.aByte39 = (byte) arg7;
		this.aShort47 = (short) arg5;
		this.aBoolean131 = arg10;
		this.anInt2083 = arg11;
		this.anInt2088 = arg0;
		this.anInt2082 = arg2;
		this.aByte38 = (byte) arg8;
	}
}
