import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public final class Class138 {

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "S")
	public final short aShort70;

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "Z")
	public final boolean aBoolean449;

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "S")
	public final short aShort72;

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
	public final int anInt5123;

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "B")
	public final byte aByte57;

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "I")
	public final int anInt5121;

	@OriginalMember(owner = "client!iaa", name = "f", descriptor = "B")
	public final byte aByte56;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort70 = (short) arg5;
		this.aBoolean449 = arg9;
		this.aShort72 = (short) arg4;
		this.anInt5123 = arg0;
		this.aByte57 = (byte) arg8;
		this.aShort71 = (short) arg6;
		this.anInt5121 = arg10;
		this.aByte56 = (byte) arg7;
	}
}
