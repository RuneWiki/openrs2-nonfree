import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class162 {

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	public final int anInt4516;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
	public final int anInt4518;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "S")
	public final short aShort55;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "B")
	public final byte aByte58;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "S")
	public final short aShort54;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "S")
	public final short aShort56;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	public final int anInt4515;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Z")
	public final boolean aBoolean348;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
	public final int anInt4517;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public final int anInt4514;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt4516 = arg3;
		this.anInt4518 = arg2;
		this.aShort55 = (short) arg4;
		this.aByte58 = (byte) arg8;
		this.aShort54 = (short) arg5;
		this.aShort56 = (short) arg6;
		this.anInt4515 = arg11;
		this.aBoolean348 = arg10;
		this.anInt4517 = arg1;
		this.anInt4514 = arg0;
	}
}
