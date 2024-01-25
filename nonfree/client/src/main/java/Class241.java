import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class241 {

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "S")
	public final short aShort67;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "B")
	public final byte aByte93;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "S")
	public final short aShort66;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
	public final int anInt6749;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Z")
	public final boolean aBoolean483;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	public final int anInt6753;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "B")
	public final byte aByte92;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort67 = (short) arg4;
		this.aByte93 = (byte) arg7;
		this.aShort66 = (short) arg6;
		this.anInt6749 = arg10;
		this.aBoolean483 = arg9;
		this.anInt6753 = arg0;
		this.aByte92 = (byte) arg8;
		this.aShort68 = (short) arg5;
	}
}
