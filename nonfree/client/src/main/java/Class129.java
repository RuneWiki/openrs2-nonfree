import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public final class Class129 {

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "S")
	public final short aShort33;

	@OriginalMember(owner = "client!fka", name = "i", descriptor = "I")
	public final int anInt2963;

	@OriginalMember(owner = "client!fka", name = "f", descriptor = "S")
	public final short aShort32;

	@OriginalMember(owner = "client!fka", name = "k", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!fka", name = "d", descriptor = "B")
	public final byte aByte48;

	@OriginalMember(owner = "client!fka", name = "c", descriptor = "I")
	public final int anInt2964;

	@OriginalMember(owner = "client!fka", name = "h", descriptor = "Z")
	public final boolean aBoolean249;

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "S")
	public final short aShort34;

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort33 = (short) arg6;
		this.anInt2963 = arg10;
		this.aShort32 = (short) arg4;
		this.aByte47 = (byte) arg7;
		this.aByte48 = (byte) arg8;
		this.anInt2964 = arg0;
		this.aBoolean249 = arg9;
		this.aShort34 = (short) arg5;
	}
}
