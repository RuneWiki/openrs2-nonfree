import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class292 {

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "S")
	public final short aShort105;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	public final int anInt8619;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
	public final int anInt8623;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "B")
	public final byte aByte104;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "S")
	public final short aShort104;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
	public final int anInt8622;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "Z")
	public final boolean aBoolean686;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "S")
	public final short aShort106;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	public final int anInt8621;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
	public final int anInt8620;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort105 = (short) arg5;
		this.anInt8619 = arg3;
		this.anInt8623 = arg1;
		this.aByte104 = (byte) arg8;
		this.aShort104 = (short) arg6;
		this.anInt8622 = arg0;
		this.aBoolean686 = arg10;
		this.aShort106 = (short) arg4;
		this.anInt8621 = arg2;
		this.anInt8620 = arg11;
	}
}
