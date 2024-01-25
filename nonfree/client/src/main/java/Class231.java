import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lka")
public final class Class231 {

	@OriginalMember(owner = "client!lka", name = "c", descriptor = "S")
	public final short aShort87;

	@OriginalMember(owner = "client!lka", name = "h", descriptor = "S")
	public final short aShort89;

	@OriginalMember(owner = "client!lka", name = "e", descriptor = "I")
	public final int anInt6301;

	@OriginalMember(owner = "client!lka", name = "k", descriptor = "I")
	public final int anInt6305;

	@OriginalMember(owner = "client!lka", name = "m", descriptor = "I")
	public final int anInt6307;

	@OriginalMember(owner = "client!lka", name = "i", descriptor = "S")
	public final short aShort88;

	@OriginalMember(owner = "client!lka", name = "o", descriptor = "I")
	public final int anInt6303;

	@OriginalMember(owner = "client!lka", name = "d", descriptor = "B")
	public final byte aByte93;

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "I")
	public final int anInt6308;

	@OriginalMember(owner = "client!lka", name = "f", descriptor = "Z")
	public final boolean aBoolean491;

	@OriginalMember(owner = "client!lka", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort87 = (short) arg6;
		this.aShort89 = (short) arg5;
		this.anInt6301 = arg11;
		this.anInt6305 = arg3;
		this.anInt6307 = arg2;
		this.aShort88 = (short) arg4;
		this.anInt6303 = arg0;
		this.aByte93 = (byte) arg8;
		this.anInt6308 = arg1;
		this.aBoolean491 = arg10;
	}
}
