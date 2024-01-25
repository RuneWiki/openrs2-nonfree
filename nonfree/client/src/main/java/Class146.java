import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public final class Class146 {

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "S")
	public final short aShort40;

	@OriginalMember(owner = "client!iaa", name = "f", descriptor = "B")
	public final byte aByte41;

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
	public final int anInt3669;

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "I")
	public final int anInt3668;

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "Z")
	public final boolean aBoolean261;

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "I")
	public final int anInt3671;

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
	public final int anInt3672;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "S")
	public final short aShort39;

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
	public final int anInt3673;

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "S")
	public final short aShort41;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort40 = (short) arg5;
		this.aByte41 = (byte) arg8;
		this.anInt3669 = arg1;
		this.anInt3668 = arg3;
		this.aBoolean261 = arg10;
		this.anInt3671 = arg0;
		this.anInt3672 = arg11;
		this.aShort39 = (short) arg6;
		this.anInt3673 = arg2;
		this.aShort41 = (short) arg4;
	}
}
